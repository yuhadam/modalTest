/**
 * 
 */

  var json = new Object();
  var modalSfw;
  var sfw;
  
  var xmlhttp = function(){
    if(window.XMLHttpRequest) return new XMLHttpRequest();
    else if(window.ActiveXObject) return new ActiveXObject("Micrhsoft.XMLHTTP");
    else {alert("try it another browser"); return null}     
  }   
  function onClick(temp){
    var element = document.getElementById(temp);
    if($("#"+temp).is(":checked")){
      var obj = new Object();
      json[temp] = obj;
      var str= JSON.stringify(json);
      console.log(json);  
    }
    else{
      delete json[temp];
      console.log(json);
    }
  };    

  function getHtml(html){
    var http = xmlhttp();
    http.open("GET", "/views/"+html, true);
    http.onreadystatechange = function() {
      if (http.readyState==4) {
        if(http.status === 200 || http.status == 0)
        {
          var fieldSet = http.responseText;
          var lines = fieldSet.split(/\n/);
          var result ="";
          for(var i=0 ;i < lines.length; i++){
            result += lines[i];
          }
          document.getElementById("wizard_example2").innerHTML+=result;
       //   setModal();
          modalSfw=modalSfw.stepFormWizard;
        }
        else{
          alert("xxxxxxxxx");
        }
      }
    }
    http.send(null);   
  }

  function getKeys(){
    $("#wizard_example2").empty();
    var keys = Object.keys(json);
    for(var i=0; i< keys.length ;i++){
      getHtml(keys[i]);
      console.log(keys[i]);
    }
   // setModal();
  }
  //
  //function setModal(){  
//    var modalForm = $("#wizard_example2");
  //  
//    modalForm.validate();
//    alert("aaa");
//    modalSfw = modalForm.stepFormWizard({      
//      height: 'auto',
//      onNext: function() {
//        var valid = modalForm.valid();
//        modalSfw.refresh();
//        return valid;
//      },
//      onFinish: function() {
//        var valid = modalForm.valid();
//        modalSfw.refresh();
//        console.log(valid);
//        return valid;
//      }
//    });
  //}

  function resetModal(){
    $("#wizard_example2").empty();
    location.reload(true);  
    console.log(json);
  }


$(document).ready(function () {
    var form = $("#wizard_example");
    form.validate();
    sfw = $("#wizard_example").stepFormWizard({
        height: 'auto',
        finishBtn: $('<input class="sf-right sf-btn btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" id="modal-button" onclick="getKeys()"; value="FINISH">'),
        onNext: function() {
            var valid = form.valid();
            sfw.refresh();
            return valid;
        },
        onFinish: function() {
            var valid = form.valid();
            sfw.refresh();
            console.log(valid);
            return valid;
        }
    });
    
//    $("#wizard_example2").change(function(){   
      var modalForm = $("#wizard_example2");
      modalForm.validate();
      modalSfw = modalForm.stepFormWizard({      
        height: 'auto',
        onNext: function() {
          var valid = modalForm.valid();
          modalSfw.refresh();
          return valid;
        },
        onFinish: function() {
          var valid = modalForm.valid();
          modalSfw.refresh();
          console.log(valid);
          return valid;
        }
      });
//    });
        
});

$(window).load(function () {
    /* only if you want use mcustom scrollbar */
    $(".sf-step").mCustomScrollbar({
        theme: "dark-3",
        scrollButtons: {
            enable: true
        }
    });
});