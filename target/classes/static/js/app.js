var ticTacToeApp = angular.module('ticTacToeApp', [ 'nvd3', 'ngAria', 'ngMessages',
        'ngAnimate', 'ngMaterial', 'ngRoute', 'haControllers', 'haServices',
        'ngMaterialDatePicker', 'md.data.table', 'ngSanitize',
        'ngMaterialSidemenu' ]);

ticTacToeApp.config([
    '$routeProvider',
    '$mdThemingProvider',
    function ($routeProvider, $mdThemingProvider) {
        $mdThemingProvider.theme('default');

        $routeProvider.when('/board', {
            templateUrl : 'board.html',
            controller : 'BoardCtrl'
        }).otherwise({
            redirectTo : '/board'
        });
    } ]);

ticTacToeApp.filter("toArray", function () {
    return function (obj) {
        var result = [];
        angular.forEach(obj, function (val, key) {
            result.push(val);
        });
        return result;
    };
});