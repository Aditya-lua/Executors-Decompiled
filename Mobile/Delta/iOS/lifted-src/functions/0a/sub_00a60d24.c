/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60d24..0xa60d4c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a60d24(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3)
{
    if (a1)
        *a1 = *a0;
    if (a2)
        *a2 = a0[1];
    if (a3)
        *a3 = a0[2];
    return a0;
}
