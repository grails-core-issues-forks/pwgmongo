package com.pwgmongo

class UrlMappings {

    static mappings = {
        "/"(controller: 'foo', action: 'index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
