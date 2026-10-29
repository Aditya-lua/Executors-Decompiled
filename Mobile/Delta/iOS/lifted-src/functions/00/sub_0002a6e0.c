/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a6e0..0x2a764 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a6e0_0 {
    char field_0;
} st_2a6e0_0;


unsigned long long sub_2a6e0(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v4;  // x1
    unsigned long v5;  // cc_op
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    st_2a6e0_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_2a6e0_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a1;
    if (*a0)
    {
        v6 = arm64g_calculate_condition(v5 | 16, v11, v12, v8);
        v7 = arm64g_calculate_condition(20, (v6 & 1 ? v4 : 0x40000000), 0, 0);
        if (!(v7 & 1))
            return *a0 == v4;
    }
    else
    {
        v9 = arm64g_calculate_condition(v5 | 16, v11, v12, v8);
        v10 = arm64g_calculate_condition(16, (v9 & 1 ? v4 : 0x40000000), 0, 0);
        if (!(v10 & 1))
            return *a0 == v4;
    }
    if (a0[1] != a1[1])
        return 0;
    return !_memcmp();
}
