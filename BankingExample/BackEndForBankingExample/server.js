const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors')
const app = express();
app.use(cors());
app.use(bodyParser.json());
const mongoose = require('mongoose');
const db = "mongodb://hello:hye123@ds123399.mlab.com:23399/first_creation";
mongoose.Promise = global.Promise;
mongoose.connect(db, function (err) {
    if (err) {
        console.error("Error!" + err)
    } else {
        console.log("connected")
    }
})

const al = require('./userservice')
const portNumber = 5000;
app.listen(portNumber, function () {
    console.log(`server is started in port number ${portNumber}`);
})


app.post('/addUser', (req, res) => {
    console.log("in addUser function")
    console.log(req.body);
    var u = new al();
    u.customerId=req.body.customerId;
    u.customerBank=req.body.inputBankName;
    u.customerEmail = req.body.email;
    u.customerAccountNumber= req.body.accountNumber;
    u.customerState = req.body.state;
    u.customerCity= req.body.city;
    u.customerAddress= req.body.address;
    u.customerPhoneNumber=req.body.phoneNumber;
    u.save(function (err, data) {
        if (err) {
            console.log("error", err);
           // res.send({"message":err})
        }
        else {
            res.send({"message":"successful inserted"})
            console.log("inserted")
        }

    })

})

app.post('/finduser',function(req,res){
    console.log("in finduser function")
    console.log(req.body.customerId);
    
  al.find({
    customerId : req.body.customerId   // search query
  })
  .then(doc => {
    console.log(doc);
    res.send({"customerInformation":doc})
  })
  .catch(err => {
    console.error(err);
  })


})