/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var googleElevationServiceModule = angular.module('GoogleElevationServiceModule', ['ngResource']);
var elevationLocation = "https://maps.googleapis.com/maps/api/geocode/";
googleElevationServiceModule.factory('GoogleElevationService', ['$resource',  function($resource){
        
    return $resource(elevationLocation, {}, {
      query: {method:'GET', isArray:false}
    });
  }]);
  
  
  
  
var geoCodeServiceModule = angular.module('GeoCodeServicesModule',['ngResource']);
var geoCodeLocation = "https://maps.googleapis.com/maps/api/geocode/json?";
geoCodeServiceModule.factory('GeoCodeService', ['$resource',  function($resource){
    return $resource(geoCodeLocation, {address:'@address',key:'	AIzaSyCn2Mp-mZXvsUPf1X5UwVaFo5laQkccyoI'}, {
      query: {method:'GET', isArray:false ,params:{address: '@address'}}
    });
  }]);
  
var streetDefenderServiceModule = angular.module('StreetDefenderServiceModule', ['ngResource']);
var streetDefenderCount = "http://localhost:8080/sdRest/webresources/entity.obs.obstruction/";

streetDefenderServiceModule.factory('StreetDefenderService', ['$resource',  function($resource){
    return $resource(streetDefenderCount, {}, {
      query: {method:'GET', isArray:true}
    });
  }]);
  
//var streetDefenderCount = "http://localhost:8080/sdRest/webresources/entity.obs.obstruction/";
streetDefenderServiceModule.factory('PostStreetDefenderService', ['$resource',  function($resource){
    return $resource(streetDefenderCount, {}, {
      create: {method:'POST'}
    });
  }]);
  
 //var streetDefenderCount = "http://localhost:8080/sdRest/webresources/entity.obs.obstruction/";
//streetDefenderServiceModule.factory('PutStreetDefenderService', ['$resource',  function($resource){
  //  return $resource(streetDefenderCount+':id', {}, {
    //  edit: {method:'PUT', params:{id:'@id'}}
      //delete
    //});
  //}]);
