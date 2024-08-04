# JavaEclipse
My java guide with tricks and experiments


Trick at the bottom.

<b>HOW TO DEPLOY A JAVA PROGRAM AS JAR FILE IN ECLIPSE</b>
 
Certainly! To deploy a Java program as a JAR (Java Archive) file in Eclipse,
follow these steps:

Right-click on your Java project in the Project Explorer (the list of
projects on the left side).

Select Export from the context menu.

Expand the Java node and choose JAR file.

Click Next.

In the JAR File Specification page, select the resources (files and folders)
that you want to include in the JAR file.

Specify the destination path where you want to save the JAR file.

Click Finish to create the JAR.

Now you have a JAR file containing your Java program, ready for distribution
or execution!

Remember to adjust any run configurations (such as program arguments or VM
arguments) accordingly when running the JAR file. If you’re a Windows user,
you can even create an executable JAR that runs as a standalone application.

Happy coding!



<b>Base TRICK</b>

Non è un vero e proprio trucco ma una nota importante.
It is not a real trick but an important note.

Bisogna usare l'ambiente giusto.
You need to use the right environment.

con JavaSE-1.8 funziona bene
with JavaSE-1.8 works fine

con JavaSE-22 invece crea un JAR che da errore all'avvio.
with JavaSE-22 instead, creates a JAR that on run give us error .
