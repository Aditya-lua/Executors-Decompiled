/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafcfac..0xafcfd4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_ec3550[4];

long long sub_afcfac(unsigned long a0, unsigned int a1, unsigned int *a2)
{
    *a2 = 0;
    if (3 < a1 - 1)
        return 0;
    return *(long long *)((char *)&g_ec3550[a1] - 8);
}
