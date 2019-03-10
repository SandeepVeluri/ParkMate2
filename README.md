# ParkMate2
A cloud based android app to view and book parking spots.
Aimed to ease up last minute confusions and hassles faced regarding parking.

User is shown a screen where all available parking spots are displayed.
Each spot is color coded based on its status:
Green: For available spots (database flag = 0).
Red: For booked spots(database flag = 1).
When a user clicks on a green spot, it's status is checked on "Firebase",
If status is 0, it's color is changed to red and a toast is displayed to notify the user.
and if someone tries to click on a red spot, he/she will be prompted about the site unavailability.
Each spot's status is saved on the database.
