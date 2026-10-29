/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc448c..0xc44a8 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

long long sub_c448c(unsigned int a0, unsigned int a1, unsigned int a2, unsigned int a3)
{
    unsigned long v0;  // x8

    if (a3 == 1)
        v0 = a0;
    else
        v0 = a2 + a0 * 0x100;
    return a3 * &_NSHomeDirectory + a1 * 0x10000 + v0;
}
