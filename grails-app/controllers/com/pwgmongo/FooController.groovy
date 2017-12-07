package com.pwgmongo

import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import com.pwmongo.Foo
import grails.converters.JSON

class FooController {

    MongoClient mongo

    def index() {
        Foo.all*.delete()
        new Foo(fooName: 'Foo Test', fooAge: 94).save(flush: true)
        render Foo.all as JSON
    }
}
