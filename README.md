# Java-lessons-for-minecraft-modding-from-Kaupenjoe
Reviewing Java fundamentals following Kaupenjoe's pre Minecraft modding [Java lessons](https://www.youtube.com/playlist?list=PLKGarocXCE1Egp6soRNlflWJWc44sau40)

## Why i started this project

This is a set of Java lessons i wanted to take in order to start my own Minecraft mod, i needed to refresh my Java knowledge since i hadn't coded for quite some time (a few years), and possibly explore if i would go into developing or maybe more generally IT career again.

It was a lot of fun, the teacher was really engaging and i found the topics interesting. I eventually decided not to go with the modding idea, but i found these lessons very instructive.

My idea was to create a mod where you had to survive on Minecraft without killing animals or cutting trees, hence adding new items in the game. I found this idea interesting because i was a vegetarian at the time, and it was around Christmas time which involves cutting many trees, which i like to avoid if possible. I hated the idea especially at that time, they are not used in furniture or eaten like animals we kill (or used in other parts even though not ideal it seems sometimes to be needed maybe but is my own opinion on the topic).

## Finishing this project and after

I stopped this project after completing all the lessons, partly because i was not a vegetarian anymore. And later on i would start to cut some trees indirectly by buying them, even though i try not to resort to doing so if possible. Gradually the old name "Do-not-cut-trees-or-kill-animals-Minecraft-mod" made less and less sense so i renamed it today to better reflect its purpose and what i took from it.

I wanted to try other things for some time, but it was nice refreshing my knowledge, and learning a lot of things again, i really enjoyed it.

After that i went on a little coding break, at least in Java, until May 2024, date of which i am publishing this, but i wanted to reflect that i worked on this earlier. Hence i learned another thing which was fun to try too (even though a tiny bit scary in possibilities), to go back in time, at least in git commits.

# Change git commit date
This is very interesting because i wanted to show that i worked on this and wanted to learn this at the real date and time i did, which was January 2024, not current time which is May 2024.

So i followed some instructions i found online, and found other help and resources available already to successfully change the date i worked on this to be from 1st January 2024 to 26th January 2024:
- [reddit link](https://www.reddit.com/r/github/comments/9kcc1r/comment/e6zh4b6/?utm_source=share&utm_medium=web3x&utm_name=web3xcss&utm_term=1&utm_content=share_button/)
- which redirects to [codewithhugo.com's instructions](https://codewithhugo.com/change-the-date-of-a-git-commit/#set-the-date-of-the-last-commit-to-an-arbitrary-date)
- i needed to modify date and time to my own time's, which i found on the local files on my drive, then i needed to update codewithhugo's instruction's timezone to mine, which i found to be named CEST thanks to [timezones-list git](https://github.com/omsrivastava/timezones-list) which mentions [wikipedia timezones abbreviations](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
- with this i could modify it to `GIT_COMMITTER_DATE="Mon 1 Jan 2024 10:36:08 CEST" git commit --amend --no-edit --date "Mon 1 Jan 2024 10:36:08 CEST"` and `GIT_COMMITTER_DATE="Fri 26 Jan 2024 20:07:51 CEST" git commit --amend --no-edit --date "Fri 26 Jan 2024 20:07:51 CEST"` in this example.

I added a few [screenshots](./pictures) to document how i managed to do this, such as the one below with the original time and date from the instructions first:

![go back in time example in image of git commit](./pictures/git%20bash%20change%20commit%20time%20example%200v2.PNG)

VS Code preview allows me to add image files (pictures) with a local link and make sure the display works.

# All in all

All in all this experiment of January 2024, and this new one in May 2024 changing date retroactively, really comforts me in the fact i enjoy always exploring new things, it's a lot of fun to tweak and create new stuff all the time, even though maybe be bit scary at first, but tweaking is a lot of fun, documenting it too, but tweaking too.

Also many things i learned in this project i find helpful again today such as using intellij (i used only eclipse IDE before), the paths where java classes are stored, casting, instanciation and such, the var keyword (i didn't know it existed in Java, even though i knew it before in JavaScript), even though they may be basic, feel now natural and familiar, i find them handy in the spring course lesson i am taking now, which is part of the reason i wanted to honor this on this github repository too, and maybe most importantly enjoyable.

# Environment

- Windows 10
- IntelliJ Community Edition
- Git Bash,
- Text editors: notepad++ for committing, VS Code for github markdown writing
