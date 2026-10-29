/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb60314..0xb60380 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

unsigned long long sub_b60314(unsigned long a0)
{
    return (a0 & 0xff000000000000) >> 40 | (a0 & 0xff00000000000000) >> 56 | (a0 & 0xff0000000000) >> 24 | (a0 & 0xff00000000) >> 8 | (a0 & 0xff000000) * 0x100 | (a0 & 0xff0000) * &g_1000000 | (a0 & 0xff00) * 0x10000000000 | (char)a0 * 0x100000000000000;
}
