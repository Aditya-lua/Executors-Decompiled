/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa82b74..0xa82b98 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_ea1eb0[4];

long long sub_a82b74(unsigned int a0)
{
    if (2 < a0 - 1454)
        return 0;
    return *(long long *)((char *)&g_ea1eb0[a0] - 11632);
}
