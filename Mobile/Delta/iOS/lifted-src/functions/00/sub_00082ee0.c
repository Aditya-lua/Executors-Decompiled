/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82ee0..0x82f78 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e6b9f8;

long long sub_82ee0(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x10
    unsigned long long v2;  // x11
    unsigned long long v3;  // x11

    if (a3 <= 31)
        v0 = 1;
    else
        v0 = 2;
    if (a3 > 0xfff)
        v0 += 1;
    v1 = 24;
    if ((unsigned int)v0 == 1)
        v1 = 0;
    v2 = 8;
    if ((unsigned int)v0 == 2)
        v1 = v2;
    v3 = 16;
    if ((unsigned int)v0 == 3)
        v1 = v3;
    goto *((void *)(*(long long *)((char *)&g_e6b9f8 + v1)));
}
