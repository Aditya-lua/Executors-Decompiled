/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3dfd0..0xc3e008 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_efdac8;

long long sub_c3dfd0(unsigned int a0)
{
    unsigned long v0;  // x8

    v0 = a0 - 97;
    if (25 < (char)v0)
        return 0;
    return *(long long *)((char *)&g_efdac8 + ((v0 * 8 | v0 >> 61) & 0x7f8 & 0x7ff));
}
