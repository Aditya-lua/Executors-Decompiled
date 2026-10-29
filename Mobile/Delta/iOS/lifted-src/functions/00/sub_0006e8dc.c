/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6e8dc..0x6e90c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_6e8dc(unsigned int *a0, unsigned int a1)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w8
    unsigned int v2;  // w8

    v0 = a1 * 3 >> 32;
    v1 = v0 + (a1 - v0 >> 1) >> 30;
    v2 = a1 + (v1 | v1 * 0x80000000);
    if (1 >= v2)
        v2 = 1;
    *a0 = v2;
    return a0;
}
