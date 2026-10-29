/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb743d0..0xb74440 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b743d0_0 {
    long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[8];
    long long field_28;
    char padding_30[8];
    long long field_38;
    char padding_40[24];
    long long field_58;
} st_b743d0_0;


long long sub_b743d0(st_b743d0_0 *a0)
{
    long long v2;  // x0
    unsigned long v3;  // cc_op
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    long long v19;  // x0
    unsigned long v4;  // 4110
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_58;
    if (v2)
    {
        v4 = arm64g_calculate_condition(v3 | 16, v10, v11, v12);
        v5 = 4;
        v6 = (v4 & 1 ? a0[1].field_8 : 0x40000000);
        v7 = 0;
        v8 = 0;
        v9 = arm64g_calculate_condition(4, v6, 0, 0);
        if (!(v9 & 1))
            goto LABEL_b743f4;
    }
    else
    {
        v13 = arm64g_calculate_condition(v3 | 16, v10, v11, v12);
        v5 = 0;
        v6 = (v13 & 1 ? a0[1].field_8 : 0x40000000);
        v7 = 0;
        v8 = 0;
        v14 = arm64g_calculate_condition(0, v6, 0, 0);
        if (!(v14 & 1))
        {
LABEL_b743f4:
            v2 = _free(v2);
        }
    }
    if (!a0->field_0)
        return v2;
    if (a0->field_8)
    {
        v15 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
        v16 = arm64g_calculate_condition(4, (v15 & 1 ? a0->field_18 : 0x40000000), 0, 0);
        if (!(v16 & 1))
            goto LABEL_b74414;
    }
    else
    {
        v17 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
        v18 = arm64g_calculate_condition(0, (v17 & 1 ? a0->field_18 : 0x40000000), 0, 0);
        if (!(v18 & 1))
        {
LABEL_b74414:
            _free(a0->field_8);
        }
    }
    v19 = a0->field_28;
    if (!v19)
    {
        return v19;
    }
    else if (a0->field_38)
    {
        return _free();
    }
    else
    {
        return v19;
    }
}
