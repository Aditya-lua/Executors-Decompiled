/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2db2c..0x2db70 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_2db2c(unsigned int a0)
{
    unsigned int v0;  // w9

    v0 = a0 - 56;
    if (32 >= v0 && 1 << ((char)v0 & 63) & 4327473199)
        return 1;
    if (a0 - 23 >= 10)
        return 0;
    return 1;
}
