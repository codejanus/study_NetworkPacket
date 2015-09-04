#!/usr/bin/perl
# shellcode2bin

while($line = <STDIN>)
{

 chomp($line);
 $line =~ s/[^xabcdef0-9]//gis;
 @bytes = split /x/, $line;
 shift(@bytes);
 foreach (@bytes)
 {
   printf "%c", hex $_;
 }
}
