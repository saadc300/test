Feature: Login to retail Website
@smokeTest 
Scenario: Retail website Login test
Given user on retail website
When  user click on MyAccount 
And   user enter userName 'saad1@test.com'
And   user enter password 'test1234'
And   user click on login button
Then  user should be logged in to MyAccount dashboard


Scenario Outline: Retail website Login test with multiple accounts
Given user on retail website
When  user click on MyAccount
And   user enter userName '<userName>'
And   user enter password '<password>'
And   user click on login button
Then  user should be logged in to MyAccount dashboard


#Exampls:
#|userName|password|
#saad@test.com|1234|
#saad2@test.com|1234|




