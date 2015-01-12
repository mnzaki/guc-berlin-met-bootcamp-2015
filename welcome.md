# Welcome Aboard!

Hello dear student!
You have found your way to the shared document we will be using later during the course!
Keep this link handy (bookmark it perhaps?)

There is some *important information* here (that you should have also received
otherwise, for posterity) so if you are in a hurry (which you shouldn't be) then
*at least* read the _Installation Instructions_ section below.

Also make sure you know where everything is:   
Our Whiteboard: https://code.stypi.com/mnzaki/guc-bootcamp-whiteboard   
Our Mailing List: https://groups.google.com/d/forum/guc-met-berlin-bootcamp-2015

Sign up to the mailing list! There will be some information there!

If you are not in a hurry and you want a headstart for your headstart, then read
on past that section!

## Installation Instructions

For now, the most important thing is that you have all the needed software
installed and ready to go. Please do your best to have these things ready!    
If you are a linux user please skip to the _Linux Section_ below.

### Downloads for Windows Users

1. Eclipse: download only one of these files, depending on your CPU architecture
   if you are unsure which one to choose, then download the Windows 32 bit file:
   1. Windows 32 bit:    
        http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR1/eclipse-java-luna-SR1-win32.zip  
   OR
   2. Windows 64 bit:    
        http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR1/eclipse-java-luna-SR1-win32-x86_64.zip
2. Git:    
    https://github.com/msysgit/msysgit/releases/download/Git-1.9.5-preview20141217/Git-1.9.5-preview20141217.exe
3. Ruby:    
    http://dl.bintray.com/oneclick/rubyinstaller/rubyinstaller-1.9.3-p551.exe?direct
4. SQlite3 (both files):   
    http://www.sqlite.org/2014/sqlite-dll-win32-x86-3080704.zip    
    http://www.sqlite.org/2014/sqlite-shell-win32-x86-3080704.zip    
5. If you don't have a favorite text editor then grab Sublime3 from here:
   1. Windows 32 bit:
        http://c758482.r82.cf2.rackcdn.com/Sublime%20Text%20Build%203065%20Setup.exe
   2. Windows 64 bit:
        http://c758482.r82.cf2.rackcdn.com/Sublime%20Text%20Build%203065%20x64%20Setup.exe

### Installations for Windows Users

1. Install Eclipse by unzipping the downloaded file to a directory somewhere.
   Remember where you unzipped it, and actually try to run eclipse.exe to make
   sure it works (the Eclipse IDE should just open)

2. Install Git by running the installation file you downloaded.

3. Install SQlite3 by unzipping the 2 SQLite3 files from above.
   Copy the following files to c:\ruby\bin:
    a. sqlite3.exe
    b. sqlite3.dll
    c. sqlite3.def

4. Install Sublime3 by running the installation file you downloaded.

The rest of the installations will require the use of the command prompt. You
can open the command prompt by opening the start menu (or the start page on Windows 8)
and typing cmd.exe. Start cmd.exe     
To run the following commands, copy the command (everything after the 'c:>' part,
which is called the 'prompt') and paste it in the black command prompt window
that you just opened.

1. Install Sinatra by using this command on the Command Prompt:

        c:> gem install sinatra

2. Install the sqlite3-ruby gem by running the following command:

        c:> gem install sqlite3-ruby

3. Install the DataMapper gem by running the following commands:

        c:> gem install dm-core
        c:> gem install do_sqlite3

The commands above give descriptive output about their progress and success/failure.
Make sure they report success. Also, you cannot do this from the GUC’s network
because of the proxy settings (the normal setup for the proxy does not apply for these tools).

### What's that stuff I just installed?
You should generally ask that question _before_ you install stuff. Some of you 
might already be familiar with the software above, but here's a quick overview
and some links:

[Eclipse](http://eclipse.org/) is an _IDE (Integrate Development Environment)_
It's a complete solution for all your coding needs, especially Java coding needs
(but many more languages are supported). It gives you tools to quickly write code
(code completion, code refactoring, error hints, etc) and also build and debug it.
We are going to use Eclipse for all our Java coding.

[Sublime3](http://www.sublimetext.com/) is a "sophisticated text editor for code, markup
and prose. You'll love the slick user interface, extraordinary features and 
amazing performance."

[Git](http://git-scm.com/) is an _SCM (Source Code Management)_ tool. It provides
you with a way to store, share and version your code. Ever found yourself asking
'what did I change to break the code?' or 'who made that change to this file?'
Git is here to answer those questions.

[Ruby](https://www.ruby-lang.org/en/) is "A dynamic, open source programming 
language with a focus on simplicity and productivity. It has an elegant syntax
that is natural to read and easy to write." If you are interested we highly
encourage you to check it out and maybe even [try ruby online!](http://tryruby.org/levels/1/challenges/0)

[Sinatra](http://www.sinatrarb.com/) is a ruby gem (gems are what rubyists call their modules).
It's a gem that provides an elegant framework to quickly build web apps.

SQlite3 is a simple file-backed (non-networked) SQL database engine.

DataMapper is another ruby gem that provides an _ORM (Object Relational Mapper)_
which we will use to interface with SQLite3 in a more abstract manner.

### Linux Users

Ah linux users. If you are a linux user then we trust you know what to do, which
is to use your distribution's package manager. That's apt-get for Ubuntu users,
yum for Fedora/SuSe users.

Install the packages for eclipse, git, ruby and sqlite3. Also install the
development packages for sqlite3 (sqlite3-dev or so) and
libxml2 (libxml2-dev or so) as well.

Finally, install the gems we will need using the 'gem' command:

         gem install sinatra
         gem install sqlite3-ruby
         gem install dm-core
         gem install do_sqlite3

If you are not a linux user, we highly encourage you to try it out by perhaps
installing [Ubuntu](http://www.ubuntu.com/), even if on a [Virtual Machine](https://www.virtualbox.org/).
We believe you will thank us later.

## A Headstart
#### for your headstart

So you are not in a hurry. Great!    
As a token of our appreciation, click the little 'eye' icon at the top right in this page.
Now also click the icon to its right for fullscreen mode. Neat huh? This document is written
in something called [Markdown](http://lmgtfy.com/?q=markdown). You might find yourself using
it soon!

This camp is designed to give you a bit of a headstart for your coming years in
the GUC. In a few days time we will try to introduce several topics that you
will hopefully find useful for your development as a student of computer science.
But it's only a few days after all, so we are merely going to scratch a few surfaces!

And of course as the age old Chinese saying goes, all work and no play makes
jack a dull boy, so we've planned some activities around Berlin and you'll have
a lot of time to enjoy the city as well as further your career!

### An Overview
We expect to cover 3 seemingly separate yet curiously connected topics.

We will start with a gentle introduction to Algorithms.

Our next topic will be Design Patterns.

And finally, a short introduction to the open source world, some Ruby, some git,
and then a tour of the web and its technologies, followed by building a very
simple web app!

### Algorithms?
And data structures. You have learned about Stacks and Queues, and sorting
algorithms, and it's time to see some slightly more complicated things.

### OOP and Design Patterns
We will introduce you to Object-Oriented Programming in Java, which should help
you think Object-Oriented while developing your applications in the future. We
will talk about Design Patterns, the standards developers invented over the years
to solve development problems and reach a stable, maintainable application rather
than reinventing the wheel every other day!

### Open Source? Ruby? Git? The Web?
The Open Source movement is a world wide collective of developers who believe in
Free software. Not 'free' as in 'free beer' but 'free' as in 'free speech'

Thanks to the open source movement we have millions upon millions of freely
available lines of code and documents which everyone is free to contribute to or
use. It is not a centralized or organized movement in anyway, but there are
several places around which developers congregate, one of which is 
[Github](http://github.com), a social platform that leverages 
[Git](http://git-scm.com/) to allow large scale collaboration on code.

But you can also use git to manage your own personal projects of course! Git
allows you to breakdown your development process into small incremental changes
and then gives you the power to track what changed where and when and how and by
whom. Once you grasp git you will not start a project without it. In fact this
document you are reading right now is in a git repository on github right
[here](https://github.com/mnzaki/guc-berlin-met-bootcamp-2015). We will
introduce git's basic usage, but if you want a nice fun interactive online
tutorial then check out try-git: https://try.github.io/

Also while introducing git we'll go through some basic command line usage. You'll
be able to give the computer instructions by typing arcane commands in a black
window instead of clicking on buttons. You are a computer science student, GUIs
are for mere users! But don't be fooled, the command line is not just 'cool' or
for 'hackers,' it gives you a lot more power!

Next on our agenda will be an introduction to ruby. Ruby is a [dynamic programming
language](http://en.wikipedia.org/wiki/Dynamic_programming_language). Ruby's syntax
is very 'natural' and quite pleasing as long as you take care to not shoot yourself
in the foot. As a small teaser, check this out:

      >>> ws = ["what", "when", "where", "how", "why"]
      >>> 2.times { puts "I want to know #{ws.sample}!" }
      I want to know how!
      I want to know why!
      
Now compare that to Java and realize how much faster you can write code! If you
want to check out ruby then we highly recommend you try out this great interactive
online tutorial (it takes 15 minutes): http://tryruby.org

Next we'll tackle the web. Ever wondered how facebook or twitter or instagram
work? What goes on behind the scenes to let you see what your best friend had
for lunch and what the latest political fiasco is? We'll give you some hints!

We'll use a framework called [Sinatra](http://www.sinatrarb.com/) to introduce web
concepts in a hands-on approach and we'll build a simple web app in the process.
