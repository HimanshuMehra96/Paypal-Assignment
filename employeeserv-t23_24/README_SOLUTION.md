Since few constraints were not clear few assumption was made.
It was not clear while adding the employee whether id will be provided by user or auto generated.
Since json schema definition for employee did not have id as required field. It was assumed that id will be auto generated.

`http://localhost:8080/v1/bfs/employees/' POST end point is used for adding employee info along with this sample JSON object.

{
    "first_name" : "Himanshu",
    "last_name" : "Mehra",
    "date_of_birth" : "06-04-1997",
    "address" : {
        "line1" : "Krish",
        "line2" : "Spice garden",
        "city" : "Bangalore",
        "country" : "India",
        "zip_code" : "360036"
    }
}

Here all the field except address.line2 are mandatory. Hence they cannot be missing or have a null value.
first_name : string type with minlength= 1 and maxlength = 255
last_name : string type with minlength= 1 and maxlength = 255
date_of_birth : date type with format "dd-MM-yyyy"
address.line1 : string type with minlength= 1 and maxlength = 1000
address.city : string type
address.country : string type
address.zip_code : integer type
