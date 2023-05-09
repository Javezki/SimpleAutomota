# SimpleAutomota
As an avid Slimefun player, I really dislike having to do everything manually like sifting, panning and other menial tasks. While this won't replace the cargo system, this addon is designed to provide automation tools to players at a much earlier start rather than having to make cargo manager's which will take a lot of time

## How to create your own addon.
This is a template repository that you can use to create your own Slimefun4 Addon.<br>
We have also written an extensive step-by-step tutorial which you can find here:<br>
https://github.com/Slimefun/Slimefun4/wiki/Developer-Guide

## Changing some important things
Navigate to `src/main/java` and rename the package and the .java File to your liking.<br>
Suggestion: "me.yourname.yourproject" (all lower case) and "ProjectName.java"<br>
Example: "me.thebusybiscuit.cooladdon" and "CoolAddon.java"

Navigate to `src/main/resources/plugin.yml` and change the "author" and "main" attributes.
You may also want to change the description to something meaningful.

Navigate to `pom.xml` and change the group id to "me.%Your name%" and change the artifact id to the name of your Project.

After that you are good to go, you can now start developing your own Addon for Slimefun4.
