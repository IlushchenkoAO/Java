//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

class UserMapper {
    UserMapper() {
    }

    com.company.User mapToUser(com.company.UserDto user) {
        return new com.company.User(user.name, user.email, user.age);
    }

    com.company.UserDto mapToUserDto(com.company.User user) {
        return new com.company.UserDto(user.name, user.email, user.age);
    }
}
