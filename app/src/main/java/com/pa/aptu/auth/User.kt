package com.pa.aptu.auth

class User {
    var namaUser: String? = null
    var emailUser: String? = null
    var passUser: String? = null

    constructor() {}

    constructor(namaUser: String?, emailUser: String?, passUser: String?) {
        this.namaUser = namaUser
        this.emailUser = emailUser
        this.passUser = passUser
    }

}