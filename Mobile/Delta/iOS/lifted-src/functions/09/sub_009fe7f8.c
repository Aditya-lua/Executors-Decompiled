/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fe7f8..0x9fe82c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_d371a8[4];

unsigned int sub_9fe7f8(unsigned int a0)
{
    unsigned int v0;  // w8

    v0 = __ROL__(a0 - 0x800, 22);
    if (6 < v0)
    {
        return 0;
    }
    else if (87 >> ((char)v0 & 31) & 1)
    {
        return g_d371a8[v0];
    }
    else
    {
        return 0;
    }
}
