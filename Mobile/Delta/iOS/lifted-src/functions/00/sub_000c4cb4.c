/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4cb4..0xc4d20 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_cc1138[4];
extern unsigned long long g_cc1158;

unsigned long long sub_c4cb4(unsigned long a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // x9
    unsigned long long v2;  // x8

    v0 = 5;
    if (a2)
        v0 = 1;
    if (v0 > a1)
        return 0xffffffffffffffb8;
    v1 = *(char *)(a0 + v0 - 1);
    v2 = g_cc1138[v1 & 3] + v0 + *(long long *)((char *)&g_cc1158 + (v1 >> 3 & 24));
    if (!((unsigned int)v1 & 32))
        v2 += 1;
    return v2 + (64 > (unsigned int)v1 & ((unsigned int)v1 & 32) >> 5);
}
