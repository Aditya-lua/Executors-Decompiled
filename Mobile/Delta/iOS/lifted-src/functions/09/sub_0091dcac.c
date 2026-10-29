/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91dcac..0x91dd38 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91dcac_0 {
    char field_0;
} st_91dcac_0;


unsigned long long sub_91dcac(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v4;  // x0
    unsigned long v5;  // x9
    unsigned long long v7;  // x0
    st_91dcac_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_91dcac_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_8b4d1c();
    v5 = a0[5] + 1;
    if (v4 + (v5 ^ a0[4]) + (v5 & a0[4]) * 2 - 1 == ((v5 ^ a0[4]) + (v5 & a0[4]) * 2) * 2 - 2)
        sub_91e50c(a0);
    v7 = sub_8b2d1c(a0);
    *a1 = *a1;
    a0[5] = a0[5] + 1;
    return v7;
}
