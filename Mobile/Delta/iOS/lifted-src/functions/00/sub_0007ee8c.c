/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7ee8c..0x7ef34 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7ee8c_0 {
    char field_0;
} st_7ee8c_0;


unsigned long long sub_7ee8c(unsigned long long *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4106
    unsigned long long v6;  // x0
    unsigned long long v7;  // 4106
    st_7ee8c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_7ee8c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_7d294();
    v5 = arm64g_calculate_condition(130, v4, 120, 0);
    if (v5 & 1)
        return v4;
    v6 = sub_80564(a0, a1 + v4, a2 - v4);
    v7 = arm64g_calculate_condition(130, v6, 120, 0);
    if (v7 & 1)
        return v6;
    if (!a0[98] || a0[98] == a0[99] + 1)
        return v6 + v4;
    return 0xffffffffffffffb8;
    return v6 + v4;
}
