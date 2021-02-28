# Software_Security

Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?
***Artemis Financial is a financial consulting company that develops individualized financial plans for savings, retirement, investments, and insurance for their patrons. They are looking to portect their application with up-to-date software secuirty.***

What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?
***One area I did well in was encapsulation of our hashing algorithm. Thought I beleive I made strides in each category related to software securitye, more practice is needed to really grasp how to accomplish specific task. Secure coding is important for too man reasons. First, it allows us a validatity in that our application will do what is expected of it. An example, if we don't have input validation and a user submits an item of string format that is expected numerical format. Without Input validation this object will be incorrectly submitted and theres no predefined means on how to handle it. Second, it protects the user, owner of the application, and the application from malicous attempts to not use the system correctly. An example, if input validation is not used and a person inject SQL into the input to return results that typically wouldn't be found through normal means.***

What about the process of working through the vulnerability assessment did you find challenging or helpful?
***The vulnerabilities assessment was a nice to have. I think a lack of expereince makes using the assessment a more difficult task.***

How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques?
***I approcahed adding increased layers of security through following guide direction and using best practices from previous coding classes. Secure communication with the front-end was requested and therefore the client used a CA to obtain secuyre access. Secure downloading of files was requested and therefore a hash algorithm was implemented to validated no changes were made to the file upon transfer over the network. In the future the biggest technique I will use is knowledge of others. Others experience will grow my own and make different vulnerabilities more easily seen.***

How did you ensure the code and software application were functional and secure? After refactoring code, how did you check to see whether you introduced new vulnerabilities?
***One way I checked is by using test data on the hash function and outputting my resultes to a webpage showing a secure https connection. Another way was through encalsulation of the hash function and making sure there was no unintended uses. Finally, a pre and post dependency check to validate no knew software dependencies were added to the system.***

What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks?
***I really enjoyed the hash function and creation of my own Certificate for sercure network communications.***

Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer?
***I am proud of the hash function class that I added to the refactored code.***
