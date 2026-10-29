/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4b210..0xb4b228 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b4b210(unsigned long long *a0, unsigned long long *a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    *a1 = a0[4];
    if (a0[6] >= a4)
        return a4;
    return a0[6];
}
