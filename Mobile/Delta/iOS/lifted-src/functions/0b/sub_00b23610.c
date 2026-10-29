/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb23610..0xb236dc (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_b23610(long long a0, long long a1, long long a2, unsigned long a3, unsigned long long *a4, unsigned long a5, unsigned long a6)
{
    unsigned long long *v4;  // x20
    unsigned long long *v5;  // x0
    unsigned int v0;  // [bp-0x4c]
    unsigned long long *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    v0 = 0xffffffff;
    if (a4)
        a4();
    v4 = sub_b236dc(a1, a2);
    if (v4)
        v5 = sub_af94b0(a0, v4);
    else
        v5 = 0;
    sub_afb050(v4);
    return v5;
}
