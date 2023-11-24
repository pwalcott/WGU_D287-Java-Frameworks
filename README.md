# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS Performance Assessment

### Student Name: Pia Walcott
### Bachelor of Science, Software Engineering, Term 3

Task C:

> - Created a new CSS file: bootstrap.min.css<br>
> - Edits made to mainscreen.html:<br>
> Line 11: Changed the CSS styling<br>
> Line 13: Changed the title of the shop to "Oasis Optical"<br>
> Line 18: Changed h1 tag to "Oasis Optical Shop"<br>
> Line 20: Changed "Parts" to "Camera Parts"<br>
> Line 52: Changed "Products" to "Camera Products"<br>


<hr>
Task D:

>- Created a new html file: about.html<br>
>- Edits to about.html:<br>
> Line 5: Changed title from generic Title to About Optical Oasis<br>
> Lines 8 - 46: Added html syntax to about.html<br><br>
>- Edits to mainscreen.html:<br>
> Line 20: Changed h1 styling (bigger and centered)<br>
> Line 20: Added button to navigate to the shop's about me page<br><br>
>- Created a new controllerfile: aboutController.java<br>
>- Edits to aboutController.java:<br>
> Lines 1-13: Coded syntax to render the about.html<br>

<hr>
Task E:

>- Edits made to BootStrapData.java<br>
> Lines 60-118: Added 5 parts and 5 products, also saved them to the repository, and finally, added logic to check the count<br>
> Changed inventory numbers of items<br>
> Changed min and max values for each item<br>
> Lines 40 - 43 and Lines 97 - 99: Logic added to check whether there are existing parts and products in the database before adding the sample inventory<br>

<hr>
Task F:

>- Edits made to mainscreen.html:<br>
> Lines 86 - 87: Added a Buy Me button next to Update and Delete buttons<br>
> Lines 39 - 40: Flipped Maximum and Minimum<br><br>
>- Created a new html file: confirmationbuyproduct.html<br>
>- Edits made to confirmationbuyproduct.html:<br>
> Lines 1 - 13: Coded syntax to render product has been successfully purchased<br><br>
>- Created a new html file: purchaseerror.html<br>
>- Edits made to purchaseerror.html:<br>
> Lines 1 - 13: Coded syntax to render product has not been successfully purchased<br><br>
>- Edits made to Product.java:<br>
> Lines 109 - 117: Created a logic to check if the inventory is at a certain number, then decrement<br><br>
>- Edits made to AddProductController.java:<br>
> Lines 172 - 183: Set up the Buy Now feature using Mapping. This is also for the successful and erroneous routing scenarios.


<hr>
Task G:

>- Edits made to mainscreen.html:<br>
> Lines 39 - 40: Added Minimum and Maximum<br>
> Lines 49 - 50: Added the data for Min and Max<br><br>
>- Edits to Part.java file<br>
> Lines 31 - 34: Initialize the minimum and maximum values<br>
> Lines 99 - 105: Validate the minimum and maximum values<br>
> Lines 124 - 129: Gets minim and maximum<br><br>
>- Edited InhousePart.java:<br>
> Lines 18 - 19: Set min = 0 and max = 100<br><br>
>- Edited OutsourcedPart.java:<br>
> Lines 18 - 19: Set min = 0 and max = 100<br>
>- Edited InhousePartForm.html:<br>
> Lines 25 - 35: Added input fields (min and max)<br><br>
>- Edited OutSourcedPartForm.html:<br>
> Lines 25 - 35: Added input fields (min and max)<br><br>
>- Edited application.properties<br>
> Line 6: Added: jdbc:h2:file:~/src/main/resources/spring-boot-h2-db102<br><br>
>- Edited InhousePartServiceImpl.java<br>
> Line 54: Added to validate min and max thresholds<br><br>
>- Edited OutsourcedPartServiceImpl.java:<br>
> Line 52: Added to validate min and max thresholds<br><br>

<hr>
Task H:

>- Edits made to Part.java<br>
> Lines 19 - 20: Validates the min an max fields<br>
> Line 4: Added to validate max field<br><br>
>- Created PartInventoryMinimumValidator.java<br>
> This is to display errors when inventory is too low or less than specified<br><br>
>- Created ValidPartInventoryMinimum.java<br>
> This is to display errors when inventory is too low or less than specified<br>
> Line 23: Changed the logic to include "equal to", so that error would not display if the inventory number equals the minimum.<br><br>
>- Created PartInventoryMaximumValidator.java<br>
> This is to display errors when inventory exceeds limits<br>

>- Created ValidInventoryMaximum.java<br>
> This is to display errors when inventory exceeds limits<br>
<hr>
Task I:

>- Edits made to PartTest.java:<br>
> Inserted Lines 160 - 177: Two tests that check the minimum and maximum fields.<br>

<hr>
Task J:

> Removed DeletePartValidator.java because it is not used 

<hr>
Additional Edits for Styling

> about.html:<br>
> Lines 6 - 9: Added CSS styling<br>
> Lines 48 - 63: Added citation for image used<br><br>
> confirmationaddpart.html<br>
> Lines 10 - 19: centered contents<br>
> Lines 24 - 26: changed link to button<br><br>
> confirmationaddproduct.html<br>
> Lines 4 - 9: changed link to button<br>
> Lines 9 - 18: centered contents<br><br>
> confirmationassocpart.html<br>
> Lines 4 - 8: changed link to button<br>
> Liens 9 - 18: centered contents<br><br>
> confirmationbuyproduct.html<br>
> Lines 6 - 11: changed styling, changed title, changed link to button<br>
> Lines 10 - 25: centered contents<br><br>
> confirmationdeletepart.html<br>
> Lines 5 - 6: changed title, changed link to button<br>
> Lines 8 - 17: centered contents<br><br>
> confirmationdeleteproduct.html<br>
> Lines 9 - 24: centered contents<br>
> inhousepartform.html<br>
> Lines 8 - 23: changed styling, changed link to button<br>
> Line 44: Removed extra ID field<br><br>
> mainscreen.html<br>
> Line 20: edited link<br>
> Line 24 and 61: changed search field width<br>
> Line 26, 28: changed button link styling<br>
> Line 33 - 34: changed table styling<br>
> Line 58: Added horizontal line<br>
> Line 72 - 74: changed table styling<br><br>
> negativeerror.html<br>
> Lines 9 - 29: centered contents, changed link to button<br><br>
> outsourcedpartform.html<br>
> Line 8 - 27: changed styling, changed link to button<br><br>
> productform.html<br>
> Line 9 - 21, 24 - 28: Added styling, changed table styling, added button on bottom of page <br><br>
> purchaseerror.html<br>
> Lines 7 - 33: centered contents<br><br>
> saveproduct.html<br>
> Lines 9 - 28, 31 - 33: centered contents, changed link to button<br><br>
