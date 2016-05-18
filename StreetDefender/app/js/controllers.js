/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var googleElevationControllerModule = angular.module('GoogleElevationControllerModule', []);

googleElevationControllerModule.controller('GoogleElevationController', function ($scope, GoogleElevationService){
   $scope.elevationInfo = GoogleElevationService.query();
   //console.log($scope);
});

var geoCodeControllersModule = angular.module('GeoCodeControllersModule', []);

geoCodeControllersModule.controller('GeocodeController', function ($scope,GeoCodeService) {
    $scope.address;
    $scope.getGeoCodeInfo = function() {
        console.log($scope.address);
        $scope.geoCodeInfo = GeoCodeService.query({address:$scope.address});
     };
 });


var streetDefenderControllerModule = angular.module('StreetDefenderControllerModule', ['GeoCodeControllersModule']);
//var geoCodeLocation = "https://maps.googleapis.com/maps/api/geocode/json?address='Boca Raton'";

streetDefenderControllerModule.controller('StreetDefenderController', function ($scope, StreetDefenderService,PostStreetDefenderService,GeoCodeService){
  $scope.cities={};
  //console.log($scope.geoInfo);
   $scope.location;
   $scope.description;
   $scope.date = new Date();
   $scope.obs;
   $scope.count = StreetDefenderService.query();
    
    $scope.uploadObs = function (){
        $scope.geoInfo = GeoCodeService.query({address:$scope.location});
   };
   

   $scope.upFinal = function (){ 
       alert("Thank you for submitting your obstruction!");
       $scope.obs = {idobstruction:'0',obstructiondescription: $scope.description,obstructionlocation:$scope.location,obstructiondate:$scope.date,lat:$scope.geoInfo.results[0].geometry.location.lat,lng:$scope.geoInfo.results[0].geometry.location.lng};
        PostStreetDefenderService.create($scope.obs);
   };
   $scope.seedMap = function (){
       //alert($scope.count.obstructions[0].obstruction.idobstruction);
     $scope.cities = {
    type: 'FeatureCollection',
    features: [{
    type: 'Feature',
    geometry: {type: 'Point', coordinates: [-87.650, 41.850]},
    properties: {name: 'Chicago'}
  }]};
       var i=0;
       angular.forEach($scope.count,function(){
          //alert($scope.count[i].obstructionlocation);
          $scope.cities.features.push({type:'Feature',
              geometry: {type: 'Point', coordinates: [$scope.count[i].lng, $scope.count[i].lat]},
              properties: {name: $scope.count[i].obstructiondescription,description:$scope.count[i].obstructionlocation}});
          i++;
       });
   };
  $scope.doAll = function(){
      $scope.uploadObs();
  };
   //$scop.updateObs = function() {
       //$scope.obs.obstructionlocation = 'new decription';
       //$scope.obs.idobstruction = '1543503889';
     //  PutStreetDefenderService.edit({id:$scope.obs.idobstruction});
   //};
   //console.log($scope);
});
