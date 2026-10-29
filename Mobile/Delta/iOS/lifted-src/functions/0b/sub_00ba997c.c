/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xba997c..0xba9a14 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ba997c_0 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[40];
    unsigned long long field_50;
} st_ba997c_0;


st_ba997c_0 * sub_ba997c(st_ba997c_0 *a0)
{
    st_ba997c_0 *v2;  // x0
    unsigned long v3;  // cc_op
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long v14;  // x8
    unsigned long long v15;  // 4118
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long v6;  // cc_ndep
    unsigned long v7;  // x9
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2->field_0)
        v2 = _free(a0->field_8);
    v7 = a0->field_20;
    v8 = v7 * 4 + 11 & 0xfffffffffffffff8;
    v9 = v7 + v8;
    if (v7)
    {
        v10 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
        v11 = arm64g_calculate_condition(18, (v10 & 1 ? v9 : 0x40000000), (v10 & 1 ? 9 : 0), 0);
        if (v11 & 1)
            goto LABEL_ba99c8;
LABEL_ba99bc:
        v14 = a0->field_50;
        if (!a0->field_50)
            return v2;
    }
    else
    {
        v12 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
        v13 = arm64g_calculate_condition(16, (v12 & 1 ? v9 : 0x40000000), (v12 & 1 ? 9 : 0), 0);
        if (!(v13 & 1))
            goto LABEL_ba99bc;
LABEL_ba99c8:
        v2 = _free(a0->field_18 - v8);
        v14 = a0->field_50;
        if (!a0->field_50)
            return v2;
    }
    v15 = arm64g_calculate_condition(2, v14 + (v14 * 4 + 11 & 0xfffffffffffffff8), 9, 0);
    if (v15 & 1)
        return v2;
    return _free();
}
