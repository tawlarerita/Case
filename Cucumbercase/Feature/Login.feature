Feature: Register

Scenario: Register on TestMe App
	Given user open TestMeApp
	When user click on signup
	And enter username as "Rita123"
	And enter firstname as"Rita"
	And enter lastname as "Tawlare"
	And enter password as "Rita@123"
	And enter confirm password as "Rita@123"
	And enter gender as "Female"
	And enter email as "ritatawlare@gmail.com"
	And enter mobile no as"7709085618"
	And enter DOB as "10-06-97"
	And enter address as "Amravati"
	And enter answer as "Pune"
	Then user click Register
	
@login
Scenario: Login using datatable
Given users open TestMeApp
When user click signin 
And user enter credential as 
|lalitha    |
|Password123|
@cart
Scenario: Login in TestMeApp 
Given users open TestMeApp
When user click signin 
And user enter credential as 
|lalitha    |
|Password123|
And search the product
And click on find details
Then click on add to cart
