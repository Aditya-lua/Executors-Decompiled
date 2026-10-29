/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x92cac..0x92cdc (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

long long sub_92cac(unsigned int *a0, unsigned int *a1, unsigned int a2, unsigned int a3)
{
    if (a3 <= a2)
        return *a0 == *a1;
    return *a0 == (*a0 ^ 1);
}
