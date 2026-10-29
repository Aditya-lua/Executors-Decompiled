/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbecb0..0xbecd8 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_cc0cf1;

long long sub_becb0(unsigned int a0)
{
    unsigned long long v0;  // x8

    if (a0 < 128)
        return (&g_cc0cf1)[a0];
    if (!(a0 * 0x100000000))
        v0 = 32;
    else
        v0 = Clz(a0 * 0x100000000) & 0xffffffff;
    return 67 - v0;
}
