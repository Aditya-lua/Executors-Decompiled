/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x81850..0x81878 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_cbf084;

long long sub_81850(unsigned int a0)
{
    unsigned long long v0;  // x8

    if (a0 < 64)
        return (&g_cbf084)[a0];
    if (!(a0 * 0x100000000))
        v0 = 32;
    else
        v0 = Clz(a0 * 0x100000000) & 0xffffffff;
    return 50 - v0;
}
