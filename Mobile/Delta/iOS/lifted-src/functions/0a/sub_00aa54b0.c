/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa54b0..0xaa550c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aa550c;

long long * sub_aa54b0(long long *a0, unsigned long long a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    long long *v10;  // x0
    long long *v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v10 = sub_a7c198(a0[2]);
    if ((unsigned int)v10)
    {
        v0 = a0;
        v1 = a1;
        sub_a7b61c(a0[1], &g_aa550c, &v0);
        sub_a7c1b4(a0[2]);
        v10 = 1;
    }
    return v10;
}
