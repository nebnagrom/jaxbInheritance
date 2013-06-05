Example of a JAXB inheritance/ generics problem I ran into using Jersey.

Basically what was happening was a Class uses generics to refer to the subclasses of another Class and this is returned in a REST resource then only the Super Class attributes are marshalled to JSON. You need to use the annotation @XmlSeeAlso to make this work. Note that if you were not using generics and just had a collection with the concrete types in it would also work.

use 

mvn jetty:run

To start it up then, to see the issue I was having when @XmlSeeAlso was not configured go to

http://localhost:20001/rest/housingEstate/blue

Once this annotation is added use 

http://localhost:20001/rest/housingEstate/green

to see what it should look like when it is working.

There are also some examples of what I tried without generics or using the Super Class:

Superclass Based:

http://localhost:20001/rest/housingEstate/blueHouseBased

No Generics:

http://localhost:20001/rest/housingEstate/blueNonGeneric
