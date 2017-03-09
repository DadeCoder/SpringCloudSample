angular.module('hello', [])
    
// .config(function($httpProvider) {
//   $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
// })
    
  .controller('home', function($http) {
  var self = this;
  //  var headers = {authorization : "Basic dXNlcjoxMjM0NTY="};
  // $http.get('/resource/',{headers : headers}).then(function(response) {
  //   self.greeting = response.data;
  // });

    self.login = function() {
      // var headers = {authorization : "Basic dXNlcjoxMjM0NTY="};

      var headers = {authorization : "Basic "
      + btoa(self.credentials.username + ":" + self.credentials.password)
      };

      $http.get('/resource/',{headers : headers}).then(function(response) {
        self.greeting = response.data;
        console.log(self.greeting);
      });



    }
    // var auth = function (credentials, callback) {
    //     console.log("run auth");
    // };

    // auth();
    
    
});