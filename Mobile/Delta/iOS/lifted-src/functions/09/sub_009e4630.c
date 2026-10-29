/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4630..0x9e46a8 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9e4630(unsigned long long a0)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x9
    unsigned long long v2;  // x10
    unsigned long long v3;  // x11
    unsigned long long v4;  // x11
    unsigned long long v5;  // x9
    unsigned long long v6;  // x11
    unsigned int v7;  // w8

    v0 = a0 >> 32;
    if (v0)
        v1 = v0;
    else
        v1 = a0;
    v2 = v1 >> 16;
    if (v2)
        v1 = v2;
    v3 = v1 >> 8;
    if (0xff >= v1)
        v3 = v1;
    v4 = v3 >> 4;
    if (15 >= v3)
        v4 = v3;
    v5 = v4;
    v6 = v5 >> 2;
    v7 = a0 != 0 | (v0 != 0) * 32 | (v2 != 0) * 16 | (v1 > 0xff) * 8 | (v3 > 15) * 4 | (v5 > 3) * 2;
    if (3 < v5)
        v5 = v6;
    if (v5 > 1)
        return v7 + 1;
    return v7;
}
