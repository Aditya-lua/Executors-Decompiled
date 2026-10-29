/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb17e84..0xb17ea0 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b17e84(unsigned long a0, unsigned int a1)
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
