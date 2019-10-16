function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();
    $.ajax({
        type: "POST",
        url: "/comment",
        contentType:"application/json",
        data: JSON.stringify({"parentId":questionId,
            "content":content,
            "type":1
        }),
        success: function (response) {
           if(response.code == 200){
               $("#comment_section").hide();
           }else{
               if(response.code = 2003){
                   var isAccepted = confirm(response.message);
                   if (isAccepted){window.open("https://github.com/login/oauth/authorize?client_id=5974a373f3cef83eb7da&redirect_uri=http://localhost:8887/callback&scope=user&state=1");
                   window.localStorage.setItem("closeable",true);
                   }
               }else{
                   alert(response.message);
               }
           }
        },
        dataType: "json"
    });
    console.log(questionId);
    console.log(content);



    
}