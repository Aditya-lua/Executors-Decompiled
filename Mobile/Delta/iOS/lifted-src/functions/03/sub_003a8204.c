/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a8204..0x3a8258 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_3a8204(unsigned int a0)
{
    unsigned int v0;  // w10
    unsigned int v1;  // w14

    v0 = a0 & 0xfffffc1f;
    if (v0 == 0xd65f0000)
        v1 = 1;
    else
        v1 = a0 == 3600745440;
    if (v0 == 0xd63f0000)
        v1 = 1;
    if (v0 == 0xd61f0000)
        v1 = 1;
    if ((a0 >> 26 & 63 | 32) != 37)
        return v1;
    return 1;
}
