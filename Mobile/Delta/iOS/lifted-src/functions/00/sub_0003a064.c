/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a064..0x3a088 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_3a064(unsigned long long *a0, long long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if ((long long)(a0[1] - *a0) >> 3 > (unsigned long long)a1)
        return *a0 + a1 * 8;
    v0 = &v2;
    v1 = v3;
    sub_43794();
}
