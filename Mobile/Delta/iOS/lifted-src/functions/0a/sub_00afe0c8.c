/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe0c8..0xafe114 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_afe0c8(unsigned long long *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a3f52c(a0[1]);
    v2 = sub_a40ca8(a1, a2, a3);
    *a0 = v2;
    a0[1] = v2;
    return v2;
}
