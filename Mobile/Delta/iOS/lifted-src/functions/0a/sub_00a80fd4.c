/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80fd4..0xa80ff8 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_ea1d90[4];

long long sub_a80fd4(unsigned int a0)
{
    if (2 < a0 - 1457)
        return 0;
    return *(long long *)((char *)&g_ea1d90[a0] - 11656);
}
