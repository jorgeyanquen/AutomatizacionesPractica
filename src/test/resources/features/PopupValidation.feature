
@Regresion
Feature: Popup Validation Form
  The user must be able to enter the required data into the form.
  Each field of the form performs mandatory validations,
  length and format, the system must present the respective validations
  for each field through a computer globe.

  @CasoExitoso
  Scenario: Successful completion of the Popup Validation form,
  no validation message is presented.
    Given Authentic in colorlib with user "demo" and password "demo"
    And Entering the Form Validation functionality
    When Popup Validation Form Filling
      | Required | select | MultipleS1 | MultipleS2 | Url					| Email			   | Password1 | Password2 | Minsize | MaxSize | Number | IP		   | Date	    | DateEarlier |
      | Valor1	 | Golf	  | Tennis	   | Golf	    | http://www.valor1.com | Valor1@gmail.com | valor1	   | valor1    | 123456  | 123456  | -99.99 | 200.200.5.4  | 2024-07-24 | 2012/9/13   |
    Then I verify successful entry

  @CasoAlterno
  Scenario: Successful completion of the Popup Validation form,
  no validation message is presented.
    Given Authentic in colorlib with user "demo" and password "demo"
    And Entering the Form Validation functionality
    When Popup Validation Form Filling
      | Required | select | MultipleS1 | MultipleS2 | Url					| Email			   | Password1 | Password2 | Minsize | MaxSize | Number | IP		   | Date	    | DateEarlier |
      | valor1   | Golf	  | Tennis	   | Golf	    | http://www.valor1.com | Valor1@gmail.com | valor1	   | valor1    | 123456  | 123456  | -99.99 | 200.200.5.4  | 24-07-2024 | 2012/9/13   |
      | valor1   | Choose a sport	  | Tennis	   | Golf	    | http://www.valor1.com | Valor1@gmail.com | valor1	   | valor1    | 123456  | 123456  | -99.99 | 200.200.5.4  | 24-07-2024 | 2012/9/13   |
    Then verify that the Validation Information Balloon is presented

  @Casoblockvalidacionexitoso
  Scenario: Successful completion of the Popup Validation form,
  no validation message is presented.
    Given Authentic in colorlib with user "demo" and password "demo"
    And Entering the Form Validation functionality
    When block Validation Form Filling
      | Required   | E-mail            | Password1 | Password2 | Date		  | Url			          | Digits Only | Range |
      | Valor1	 | Valor1@gmail.com  | valor1    | valor1	 | 12/02/2024 | http://www.valor1.com | 123456	    | 5     |
    Then I verify successful entry true

  @Casoblockvalidacionexitosoalterno
  Scenario: Successful completion of the Popup Validation form,
  no validation message is presented.
    Given Authentic in colorlib with user "demo" and password "demo"
    And Entering the Form Validation functionality
    When block Validation Form Filling
      | Required   | E-mail            | Password1 | Password2 | Date		  | Url			          | Digits Only | Range |
      | Valor1	 | Valor1@gmail.com  | valor1    | valor1	 | 12/02/2024 | http://www.valor1.com | 123456	    | 5     |
      | 1   	 | Valor1@gmail.com  | valor1    | valor1	 | 12/02/2024 | http://www.valor1.com | 123456	    | 5322  |
    Then verify that the Validation Information Balloon is presented false

  @CasoInlineValidationnexitoso
  Scenario: Successful completion of the Popup Validation form,
  no validation message is presented.
    Given Authentic in colorlib with user "demo" and password "demo"
    And Entering the Form Validation functionality
    When Inline Validation Form Filling
      | Required   | E-mail            | Password1 | Password2 | Date		  | Url			          | Minichar | Maxichar | Min | Max |
      | Valor1	   | Valor1@gmail.com  | valor1    | valor1	   | 12/02/2024   | http://www.valor1.com | 123	     | 123456   | 12  | 12  |
    Then I verify successful entry Inline

  @CasoInlinevalidacionalterno
  Scenario: Successful completion of the Popup Validation form,
  no validation message is presented.
    Given Authentic in colorlib with user "demo" and password "demo"
    And Entering the Form Validation functionality
    When Inline Validation Form Filling
      | Required   | E-mail            | Password1 | Password2 | Date		  | Url			          | Minichar | Maxichar | Min | Max |
      | Valor1	   | Valor1@gmail.com  | valor1    | valor1	   | 12/02/2024   | http://www.valor1.com | 123	     | 123456   | 12  | 12  |
      | Valor1	   | Valor1gmail.com  | valor1    | valor1	   | 12/02/2024   | http://www.valor1.com | 123	     | 123456   | 12  | 12  |
    Then verify that the Validation Information Balloon is presented Inline