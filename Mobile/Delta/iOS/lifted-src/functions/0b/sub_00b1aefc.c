/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb1aefc..0xb1af18 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b1aefc(unsigned long a0, unsigned int a1)
{
    unsigned int v0;  // w9

    if (a1 & 1)
        v0 = 0;
    else
        v0 = (a1 * 0x80000000 | a1 >> 1) & 0x80000001 & 1;
    if (a1)
        return v0;
    return 1;
}
