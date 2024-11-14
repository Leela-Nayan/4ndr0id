# Gojo

After running the executable, it asked me for an input and an output and from that itself, I could infer that the input I was providing was being mangled with and it was expecting the output to match that. So I decompiled the executable, initially on dogbolt.org, but was then later asked to use a proper decompiler as pseudocode would not be properly decompiled. So then I used Binary Ninja, because it was giving a better graphical view (at least for most), but for this, I didn't understand anything.

So resorted to using Ida again, and after looking at the decompiled code, I noticed that at the end, the flag was being printed if s1 was equal to s2. Where s1 was the 2nd input (output) that I was providing and s2 was my input after all the mangling had been done. I started out by looking at the first part of the mangling where the initial input s, was being performed on twice, i.e. 2 operations were happening with the e_sec function.

Opened the e_sec function, saw that based on 3 cases, it was then calling three other functions. Here's where I initially stopped because I had another idea.

To get the flag, I just had to match the 2nd input (output,i.e. s1) with s2. Just before I left bi0sHardware, we were being taught gdb and I was told that using gdb, we can inspect the value of a variable at any point, by setting breakpoints during the execution of the code. So when I was trying to set a breakpoint using the address  of s2, I was asked to solve the challenge the intended way and try out this loophole later.

So with the help of ChatGPT and Google for understanding some of the 5 functions, like by looking at scar function, I knew it was XOR immediately based on the operator, but for key_e and key_d, I used it to understand what was happening.

Now that I know what is exactly happening, I just need to write a python script (hopefully it doesn't take too long) to do those exact operations.