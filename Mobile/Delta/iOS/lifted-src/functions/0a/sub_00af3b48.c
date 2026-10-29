/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf3b48..0xaf3bc4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_af3b48(unsigned int *a0, unsigned int *a1, unsigned int *a2, unsigned int *a3, unsigned int *a4)
{
    unsigned int v2;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_aea738();
    if (a1)
        *a1 = a0[44];
    if (a2)
        *a2 = a0[45];
    if (a3)
        *a3 = a0[46];
    v2 = a0[47];
    if (a4)
        *a4 = v2;
    return v2 & 1;
}
