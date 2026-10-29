/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafcdf8..0xafce20 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_ec2e68[4];

long long sub_afcdf8(unsigned long a0, unsigned int a1, unsigned int *a2)
{
    *a2 = 0;
    if (21 < a1 - 1)
        return 0;
    return *(long long *)((char *)&g_ec2e68[a1] - 8);
}
