# Gym Memberships
An application that manages, and calculates the cost of, different
kinds of gym memberships.

<!-- HOW TO USE THIS TEMPLATE
     Save it as README.md at the root of your project, next to pom.xml. Replace every comment like this one
     with your own text; comments do not show on GitHub, so what you leave untouched shows as an empty heading.
     Two sections are optional and say so: Class Diagram, and Data and configuration. When your project does not
     need one, delete the whole section, heading included. Every other section stays. -->

<!-- One sentence under the title: what the app is, for whom.
     Example: A console app that keeps a store's inventory in a csv file and lets a clerk search it. -->

## Description of the Project
A parent Membership class and three child classes that calculate the cost of different kinds of gym memberships. The three child classes have unique calculations for class specific information that is not shared with the other classes. Main prints all memberships and price calculations.

<!-- Three to five sentences. What the application does, who uses it, what problem it solves.
     Write it for someone who has never seen the workbook: a recruiter, a classmate, you in six months. -->

## Class Diagram

<!-- OPTIONAL. Only when the project asks for one (Capstone 2 onward). Export the diagram as a PNG into the
     images folder and keep the line below. If your project has no class diagram, delete this whole section,
     heading included. -->

![Class Diagram](images/class-diagram.png)

## Features

<!-- One bullet per thing the app can do, in the order of your menu. Mark bonuses.
     For an API (Capstone 3), one line per endpoint instead: method, path, what it does.
     Be honest: list what works. If something is half done, say so under Future Work instead.
     Example:
     - Shows every product in the store
     - Searches products by name (bonus) -->

- Abstract Membership class that creates a membership and calculates its cost, has 3 child classes.
- BasicMembership class inherits from Membership with unique field offPeakOnly 
- PremiumMembership class inherits from Membership with unique field guestPasses
- FamilyMembership class inherits from Membership with unique field extraMembers
- Displays memberships and costs


## Setup

### Prerequisites

- Java 17 (Amazon Corretto), the version used in class.
- IntelliJ IDEA Community Edition: <https://www.jetbrains.com/idea/download/>

### Running the application

1. Clone this repository, or download it as a zip and unzip it.
2. In IntelliJ: File > Open, pick the project folder (the one that holds `pom.xml`), press Open.
3. Wait for IntelliJ to finish indexing (progress bar at the bottom).
4. Open `src/main/java/com/pluralsight/Main.java`. <!-- replace YourMainClassName with the class that has main -->
5. Right-click inside the file and choose Run 'Main.main()'.


## Technologies Used

- Java 17
- IntelliJ IDEA
<!-- Add anything else you used: a library, Maven plugins, an external tool. For a console app this list is short. That is fine. -->

## Demo

<!-- Pictures of the app running: the console for a console app, Insomnia or Swagger for an API.
     Screenshots are enough; a GIF is a bonus.
     1. Create a folder named `images` at the project root, next to `pom.xml`.
     2. Take screenshots of the app in the IntelliJ console (the menu, one feature, one error message):
          Windows: Win + Shift + S, drag a rectangle, then paste into Paint and save as PNG, or open the
                   notification and save. Save into the `images` folder.
          Mac:     Shift + Cmd + 4, drag a rectangle. The file lands on the Desktop; move it into `images`.
     3. Name the files by what they show: `images/menu.png`, `images/search.png`.
     4. Reference each one below with a relative path. No spaces in file names.
     5. Commit the images with the rest of your work (Git > Commit shows them as unversioned files: tick them).
     Optional GIF: LICEcap (free, Windows and Mac, <https://www.cockos.com/licecap/>) records a region of the
     screen straight to a .gif. Keep it under 10 seconds and under 10 MB, save it into `images`. -->

![Main menu](images/menu.png)

![One feature in action](images/output.png)

## A piece of code I am proud of

<!-- Paste one short block of your own code (5 to 15 lines) between the three backticks, then write two
     or three sentences: what it does and why you chose to write it that way. This is what you show on
     demo day and what you talk about in an interview. -->

```java
for (Membership membership : memberships) {
            if (membership instanceof BasicMembership && ((BasicMembership) membership).isOffPeakOnly()){
                System.out.println(membership.getMemberName() + ": entry between 10:00 and 16:00 only");
            }
            if (membership instanceof PremiumMembership){
                ((PremiumMembership) membership).useGuestPass();
            }
            if (membership instanceof FamilyMembership){
                System.out.println(membership.getMemberName() + ": print " +
                        (((FamilyMembership) membership).getExtraMembers() + 1) +
                        " key cards");
            }
        }
```
This loop prints lines containing unique information based on the type of membership.

## Future Work

<!-- What you would add or fix next, one bullet each. Unfinished bonuses belong here. -->

- CorporateMembership class
- Print largest contract

## Resources

<!-- What helped you: the workbook, the week's hub pages, a tutorial, a documentation page. Real links. -->

- Java YearUp Fall 2026 hub: <https://raymaroun.github.io/yearup-java-fall2026/>

## Author

<!-- Your name and, if you like, your GitHub profile link. For a team workshop, one line per person with what each one built. -->

- **Daniel Daube**

## Thanks

<!-- Optional. The people who helped: the instructor, a classmate who debugged with you, a mentor. -->

- Thank you to Raymond for being a great instructor