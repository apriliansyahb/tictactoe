var TicTacToeApp = angular.module('TicTacToeApp', [ 'ngAnimate', 'ngMaterial',
		'ngRoute', 'tripleTController', 'tripleTService', ]);

TicTacToeApp.config([ '$routeProvider', '$mdThemingProvider',
		function($routeProvider, $mdThemingProvider) {
			$mdThemingProvider.theme('default');

			$routeProvider.when('/board', {
				templateUrl : 'board.html',
				controller : 'BoardCtrl'
			}).otherwise({
				redirectTo : '/board'
			});
		} ]);

TicTacToeApp.filter("toArray", function() {
	return function(obj) {
		var result = [];
		angular.forEach(obj, function(val, key) {
			result.push(val);
		});
		return result;
	};
});