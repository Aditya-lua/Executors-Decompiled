/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe6a04..0xe6ab4 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e6dea0;

long long sub_e6a04(unsigned long a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x9
    unsigned long long v3;  // x9

    v0 = ((2 > a2 - 1) * 8 | (char)(2 > a2 - 1) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    v1 = 16;
    if (a2 == 3)
        v0 = v1;
    v2 = 40;
    if (a2 == 4)
        v0 = v2;
    v3 = 24;
    if (a2 == 5)
        v0 = v3;
    goto *((void *)(*(long long *)((char *)&g_e6dea0 + v0)));
}
