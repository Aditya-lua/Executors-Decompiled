/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19f1c..0x19f3c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_19f1c(unsigned long long a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x8

    v0 = a0 - 1;
    if (!v0)
        v1 = 64;
    else
        v1 = Clz(v0);
    if (a0 >= 2)
        return 1 << ((char)-v1 & 63);
    return a0;
}
