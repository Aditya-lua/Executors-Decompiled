/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa812c0..0xa81314 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_7fe005;
extern char g_7fe006;

int sub_a812c0(unsigned int a0, unsigned int *a1)
{
    if (9 <= a0)
        return 0;
    *a1 = ~((long long)((unsigned int)(4 - a0) & a0 - &g_7fe006) >> 31) & (unsigned int)(4 - a0) | (long long)((unsigned int)(4 - a0) & a0 - &g_7fe006) >> 31 & (unsigned int)&(&g_7fe005)[-1 * a0];
    return 1;
}
