/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe214..0xafe250 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_afe214(unsigned long long *a0, unsigned long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a3f52c(a0[1]);
    *a0 = 0;
    a0[1] = 0;
    v2 = sub_a32e7c(a0[2]);
    a0[1] = a1;
    a0[2] = 0;
    *a0 = a1;
    return v2;
}
