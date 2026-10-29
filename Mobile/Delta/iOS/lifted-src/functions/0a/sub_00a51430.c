/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa51430..0xa51458 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a51430(unsigned int *a0, unsigned int *a1)
{
    unsigned long v0;  // x9
    unsigned long v1;  // x10

    v0 = *a0;
    v1 = *a1;
    if ((unsigned int)v0 == (unsigned int)v1)
        return a0[1] - a1[1];
    return v0 - v1;
}
