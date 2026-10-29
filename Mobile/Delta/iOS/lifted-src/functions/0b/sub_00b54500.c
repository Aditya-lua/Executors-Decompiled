/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb54500..0xb54554 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b54500_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[12];
    unsigned long long field_18;
} st_b54500_0;


st_b54500_0 * sub_b54500(void)
{
    st_b54500_0 *v2;  // x0
    unsigned long long v3;  // x8
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b545b8();
    if (!v2)
        return (unsigned int)v2;
    v3 = 1 << ((char)v2->field_18 & 63) & 0x101010000;
    if (v2->field_18 <= 32)
    {
        v4 = arm64g_calculate_condition(v10 | 144, v11, v6, v7);
        v5 = arm64g_calculate_condition(4, (v4 & 1 ? v3 : 0x40000000), 0, 0);
        if (v5 & 1)
        {
            sub_b5456c();
            return 0;
        }
    }
    else
    {
        v8 = arm64g_calculate_condition(v10 | 144, v11, v6, v7);
        v9 = arm64g_calculate_condition(0, (v8 & 1 ? v3 : 0x40000000), 0, 0);
        if (v9 & 1)
        {
            sub_b5456c();
            return 0;
        }
    }
    v2->field_8 = 2;
    return (unsigned int)v2;
}
