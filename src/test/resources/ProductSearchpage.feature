Feature: To validate the search functionality

Scenario Outline: To verify the user can able to search the valid credentials

Given  user launch the jabong login page

When user has to search the product "<search>"

Then user verify the valid credentials of the product

Examples:

|search|
|perfume|
|body lotions|
|body sprays|
|shampoo|
|soap|
|shaving creams|
|tooth paste|
|bath oils|
|Conditioners|
|shower gel|
