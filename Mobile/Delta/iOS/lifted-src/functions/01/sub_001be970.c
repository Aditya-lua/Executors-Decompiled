/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be970..0x1be9c0 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_1be970(unsigned int a0, unsigned int a1)
{
    unsigned int v0;  // w12
    unsigned int v1;  // w12
    unsigned int v2;  // w12

    v0 = a0 | 32;
    if (5 < v0 - 97)
        v1 = 0xffffffff;
    else
        v1 = v0 - 87;
    if (a1 != 16)
        v1 = 0xffffffff;
    v2 = a0 - 48;
    if ((a0 & 254) == 56)
        v1 = v2;
    if (a1 == 8)
        v1 = 0xffffffff;
    if ((a0 & 248) == 48)
        return a0 - 48;
    return v1;
}
