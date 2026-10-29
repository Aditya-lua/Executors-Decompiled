/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2c604..0xa2c62c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a2c604(unsigned long long *a0, unsigned long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_c669f0();
        return 0;
    }
    *a0 = a1;
    return 1;
}
