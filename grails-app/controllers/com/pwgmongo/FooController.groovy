package com.pwgmongo

import com.pwmongo.Foo
import grails.converters.JSON

class FooController {

    def index() {
        Foo.all*.delete()
        new Foo(fooName: 'Foo Test', fooAge: 94).save(flush: true)
        [fooList: Foo.all]
    }
}
