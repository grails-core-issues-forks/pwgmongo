package com.pwmongo

import grails.converters.JSON
import org.bson.types.ObjectId

class Foo {
    static mapWith = "mongo"

    ObjectId id
    String fooName
    Integer fooAge
    List<ObjectId> barIds

    static mapping = {
        collection 'mongo_foo'
    }

    /*static {
        JSON.registerObjectMarshaller(Foo) {
            Map properties = it.properties.findAll {it}
            properties.put("id", it.id.toString())
            properties.remove("dbo")
            return properties
        }
    }*/
}
