var site = "";
var tripleTService = angular.module('tripleTService', [ 'ngResource' ]);

function createResource($resource, url, method, isArray) {
    return $resource(wsurl + url, {}, {
        execute : {
            method : method,
            params : {},
            isArray : isArray,
        }
    });
}

tripleTService.factory("tripleT", [ "$resource", function ($resource) {
    return {
        start : function () {
            return createResource($resource, "/main/start", "POST", false);
        },
        move : function () {
            return createResource($resource, "/main/move", "POST", false);
        },
        get : function () {
            return createResource($resource, "/main/board", "GET", false);
        }
    };
} ]);