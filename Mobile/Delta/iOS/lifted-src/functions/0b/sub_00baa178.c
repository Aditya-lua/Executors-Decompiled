/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbaa178..0xbaa1d8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_baa178_0 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[16];
    unsigned long long field_20;
} st_baa178_0;


st_baa178_0 * sub_baa178(st_baa178_0 *a0)
{
    st_baa178_0 *v2;  // x0
    unsigned long v3;  // cc_op
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long v6;  // cc_ndep
    st_baa178_0 *v7;  // x0
    unsigned long v8;  // x9
    unsigned long long v9;  // x9
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2->field_0)
        v2 = _free(a0->field_8);
    v7 = v2;
    v8 = a0->field_20;
    v9 = v8 + (v8 * 4 + 11 & 0xfffffffffffffff8);
    if (v8)
    {
        v10 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
        v11 = arm64g_calculate_condition(18, (v10 & 1 ? v9 : 0x40000000), (v10 & 1 ? 9 : 0), 0);
        if (!(v11 & 1))
            return v7;
    }
    else
    {
        v12 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
        v13 = arm64g_calculate_condition(16, (v12 & 1 ? v9 : 0x40000000), (v12 & 1 ? 9 : 0), 0);
        if (!(v13 & 1))
            return v7;
    }
    return _free();
}
