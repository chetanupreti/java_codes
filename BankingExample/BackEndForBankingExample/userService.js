const mongoose = require('mongoose');

const schema = mongoose.Schema;

const userSchema = new schema({
    "customerId":String,
     "customerBank":String,
    "customerEmail":String,
   "customerAccountNumber":String,
    "customerCity": String,
   "customerAddress": String,
    "customerState":String,
    "customerPhoneNumber":String,
});

module.exports=mongoose.model('userDetails',userSchema,'users');