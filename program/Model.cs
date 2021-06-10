using System;
using System.ComponentModel;
using System.Data;
using System.Net;
using System.Runtime.CompilerServices;
using System.Windows;
using System.Windows.Controls;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace ExchangeSoft
{
    class Model : INotifyPropertyChanged
    {
        public Model() => MakeRequest();
        private string _errorOccured;
        private double _baseAmount, _resultAmount;
        private object _jsonResults;
        private string _base, _convert;
        private const string _link = "http://data.fixer.io/api/latest?access_key="; 
        private const string _apiKey = "3e49ea2f1f6780ed1fa07d21977b9689"; // ключ доступа fixer.io
        
        public string ErrorOccured
        {
            get => _errorOccured;
            set
            {
                _errorOccured = value;
                OnPropertyChanged(nameof(ErrorOccured));
            }
        }
        public string Base // валюта з якої міняємо
        {
            get => _base;
            set
            {
                _base = value.Split(':')[1].Replace(" ", "");
                GetResultAmount();
                OnPropertyChanged(nameof(Base));
            }
        }
        public string Converted // валюта в яку міняємо
        {
            get => _convert;
            set
            {
                _convert = value.Split(':')[1].Replace(" ", "");
                GetResultAmount();
                OnPropertyChanged(nameof(Converted));
            }
        }
        public string BaseAmount // сума, яку необхідно конвертувати
        {
            get => _baseAmount.ToString();
            set
            {
                try
                {
                    _baseAmount = Convert.ToDouble(value);
                    GetResultAmount();
                    OnPropertyChanged(nameof(BaseAmount));
                }
                catch (Exception e)
                {
                    MessageBox.Show("Input value contains symbols");
                }

            }
        }
        public double ResultAmount // Кінцевий результат конвертації
        {
            get => _resultAmount;
            set
            {
                _resultAmount = value;
                OnPropertyChanged(nameof(ResultAmount));
            }
        }
        public object JsonResults // JSON об'єкт
        {
            get => _jsonResults;
            set
            {
                _jsonResults = value;
                OnPropertyChanged(nameof(JsonResults));
            }
        }

        public void MakeRequest()
        {
            try { // запрос для обновления(получения) данных
                var requestLink = $"{_link}{_apiKey}&format=1";
                using (WebClient wc = new WebClient())
                {
                    var json = wc.DownloadString(requestLink);
                    object result = JsonConvert.DeserializeObject(json);
                    JsonResults = result;
                }
            }
            catch(Exception) {
                ErrorOccured = "Произошла ошибка, перезапустите приложение! (либо отсутствует интернет)";
            }
        }
        public double GetCurrency(string currency)
        {
            // получаем значение из объекта
            return Math.Round(Convert.ToDouble(JObject.Parse(JsonResults.ToString())["rates"][$"{currency}"]), 2);
        } 
        public void GetResultAmount() {
            try { ResultAmount = _baseAmount * Math.Pow(GetCurrency(Base) / GetCurrency(Converted), -1); }
            catch(Exception) { }
        } 
        public event PropertyChangedEventHandler PropertyChanged;
        public void OnPropertyChanged([CallerMemberName] string prop = "")
        {
            if (PropertyChanged != null) PropertyChanged(this, new PropertyChangedEventArgs(prop));
        }
    }
}
