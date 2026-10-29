/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb440c..0xb4448 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_b440c(unsigned long long *a0, unsigned int *a1)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    char v2;  // x8

    v0 = a1[3];
    v1 = a1[4];
    if (a1[3] >= 64)
        v0 = 64;
    if (v1 - 1 < v0)
        v2 = v0 - v1;
    else
        v2 = 0;
    *a0 = 0xffffffff;
    a0[1] = ~(0xffffffffffffffff << ((char)v1 & 63)) << (v2 & 63);
    return a0;
}
