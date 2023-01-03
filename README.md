# software-project phase2
### contributers
20200498	Mahmoud Sayed Ashore	{mail}[mahmoudsayed1332002@gmail.com]
20201203	Nourhan Amr Abdelwahab Fathy	{mail}[noramr318@gmail.com]
20201041	Aya Hasanin Sayed AbdElmageed 	{mail}[ayaayad162002@gmail.com]
20190109	Omnia Magdy Othman Ahmed	{mail}[Omniamagdi21@gmail.com]

### version
this repo contain a maven project made with java 17 spring boot 3.0.1
the port localhost:8080 is uesd as a defult in this project

-To open the project and run it using :

### run
you need to have java ee installed on eclipse
from menu choose existing maven project and browse the project folder
then select pom.xml 
if you see message (Add a version or custom suffix using "Name template" in "Advanced" settings)
then press on advanced in the bottom side 
and press on name template drop down menu and choose [groupId].[artifactId]-[version]
and make sure you have closed previous projects.
then run
_you can olso use any ide like vs code or intellij_

### Testing
you need postman application to test the api properly.
open postman and press on import button in team workspace and choose the (json file) included in the uploaded folder.
it contains all test cases for the system apis.


 # Clarification for paramaters
 
 any api can be accecced thru : localhost:8080/"servicelink + query paramaters".
 
 when an admin or user signs up they will get an id 
 where first admin would get id=1 then second admin would get id=2, and so on
 same with any user.
 
 as most of apis it either requires admin id or user id and the id resembelse the user which we choose to make the api specific action
 so you need to first make a user or an admin before you can use some of the api functionalties.
 
 
 - in (serchService) service parameter can be : (Mobile,Internet,Landline,Donations)

 - in (Request refund)  service parameter as an object contains ammount serviceInfo-> serviceName
 
 - in (acceptRefund)and(rejectRefudn) parameter can be refundId
 
 - in (addProvider) parameters : providerName, serviceId
					  
 - in (addDiscount) prameters is an opject contains {discount ammount, serviceName}

 - in (cach payment) prameter : providerName, ammount
 - in (creditCard payment) prameter :providerName, ammount, credit card number
 - in (wallet payment) prameter : providerName, ammount
 

