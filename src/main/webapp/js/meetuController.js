//(function(){
//        var as = angular.module('loginApp.controllers', []);
//
//        as.controller("loginCtrl", function($scope, $http) {
//            var load = function () {};
//
//            load();
//
//            $scope.user = {};
//            $scope.submitForm = function() {
//                $http({
//                        method: 'GET',
//                        url: '/login',
//                        params: $scope.user,
//                        headers: {
//                            'Content-Type': 'application/x-www-form-urlencoded'
//                        }
//                    })
//                    .success(function(data) {
//                        console.log(data);
//                        // todo : 页面跳转@here...
//                    });
//            };
//        });
//});