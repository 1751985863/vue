new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            email:"",
            age:"",
            sex:""
        },
        userList:[]
    },
    methods:{
        update:function(){
           var  _this=this;
            axios.post('/user',user)
                .then(function (response) {
                    _this.findAll();
                })
                .catch(function (error) {
                    console.log(error);
                });

        },
        findById:function(){
            var _this=this;
            axios.get('/findId',{params:{id:userid}})
                .then(function (response) {
                    _this.user=response.data;
                    $("#myModal").modal("show");
                })
                .catch(function (error) {
                    console.log(error);
                });


        },
        findAll:function () {
            var _this=this;
            axios.get('/findAll')
                .then(function (response) {
                   _this.userList=response.data;
                })
                .catch(function (error) {
                    console.log(error);
                });


        },
    },
    created:function () {
        this.findAll();

    }

});