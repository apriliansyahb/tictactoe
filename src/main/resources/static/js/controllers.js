var tripleTController = angular.module('tripleTController', []);

function goToBoard() {
    window.location = "#!/board";
}

tripleTController.controller('BoardCtrl', [
    '$scope',
    '$mdDialog',
    'tripleT',
    '$interval',
    function ($scope, $mdDialog, service, $interval) {
        $scope.$emit("load", "board");

        $scope.boardSize = 3;
        
        function get() {
            execute($scope, $mdDialog, true, service.get(), {}, function (
                    result) {
                $scope.game = result;
            });
        }

        $scope.start = function () {
            execute($scope, $mdDialog, true, service.start(), {
                boardSize : $scope.boardSize
            }, function (result) {
                $scope.game = result;
            });
        }

        $scope.move = function (x, y) {
            execute($scope, $mdDialog, true, service.move(), {
                x : x,
                y : y
            }, function (result) {
                $scope.game = result;
            });
        }

        get();
    } ]);