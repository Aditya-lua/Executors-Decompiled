/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7e48c..0x7e4bc (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_7e48c(unsigned int *a0, unsigned int a1, unsigned int a2, unsigned int *a3)
{
    unsigned long long *v0;  // x4

    if (*a3 + a2 >= a1 - a0[2] && *a3 == a0[6])
        return a0;
    *a3 = 0;
    *v0 = 0;
    return a0;
}
