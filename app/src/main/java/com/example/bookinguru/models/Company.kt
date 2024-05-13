package com.example.bookinguru.models

class Company {
    var name:String = ""
    var qualification:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name:String, qualification:String, imageUrl: String, id: String) {
        this.name= name
        this.qualification = qualification
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}