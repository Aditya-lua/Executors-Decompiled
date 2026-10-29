/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98d8bc..0x98d8d8 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_fffffffffffffffc;

unsigned long long sub_98d8bc(unsigned long a0, unsigned int a1)
{
    if (a1 <= 2)
        return *(long long *)(a0 + a1 * 8 + 448);
    return (char *)&g_fffffffffffffffc + 3;
}
