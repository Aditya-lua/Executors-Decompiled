/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb73878..0xb738f8 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b73878_0 {
    unsigned long long field_0;
    char padding_8[16];
    long long field_18;
    char padding_20[24];
    long long field_38;
    char padding_40[40];
    long long field_68;
    char padding_70[8];
    unsigned long long field_78;
} st_b73878_0;


long long sub_b73878(st_b73878_0 *a0)
{
    unsigned long v2;  // cc_op
    unsigned long v3;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long v14;  // 4110
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long long v19;  // 4102
    unsigned long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long long v26;  // 4110
    unsigned long long v27;  // 4102
    unsigned long long v28;  // 4110
    unsigned long long v29;  // 4102
    unsigned long v4;  // 4110
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 != 2)
    {
        v4 = arm64g_calculate_condition(v2 | 16, v3, v10, v11);
        v5 = 4;
        v6 = (v4 & 1 ? *(long long *)&a0->padding_8[8] : 0x40000000);
        v7 = 0;
        v8 = 0;
        v9 = arm64g_calculate_condition(4, v6, 0, 0);
        if (!(v9 & 1))
            goto LABEL_b7389c;
    }
    else
    {
        v12 = arm64g_calculate_condition(v2 | 16, v3, v10, v11);
        v5 = 0;
        v6 = (v12 & 1 ? *(long long *)&a0->padding_8[8] : 0x40000000);
        v7 = 0;
        v8 = 0;
        v13 = arm64g_calculate_condition(0, v6, 0, 0);
        if (!(v13 & 1))
        {
LABEL_b7389c:
            if (a0->field_18)
            {
                v14 = arm64g_calculate_condition(v5 | 16, v6, 0, 0);
                v15 = 4;
                v16 = (v14 & 1 ? *(long long *)&a0->padding_20[8] : 0x40000000);
                v17 = 0;
                v18 = 0;
                v19 = arm64g_calculate_condition(4, v16, 0, 0);
                if (!(v19 & 1))
                    goto LABEL_b738b0;
            }
            else
            {
                v20 = arm64g_calculate_condition(v5 | 16, v6, 0, 0);
                v15 = 0;
                v16 = (v20 & 1 ? *(long long *)&a0->padding_20[8] : 0x40000000);
                v17 = 0;
                v18 = 0;
                v21 = arm64g_calculate_condition(0, v16, 0, 0);
                if (!(v21 & 1))
                {
LABEL_b738b0:
                    _free(a0->field_18);
                }
            }
            if (a0->field_38)
            {
                v22 = arm64g_calculate_condition(v15 | 16, v16, v17, v18);
                v5 = 4;
                v6 = (v22 & 1 ? *(long long *)&a0->padding_40[8] : 0x40000000);
                v7 = 0;
                v8 = 0;
                v23 = arm64g_calculate_condition(4, v6, 0, 0);
                if (!(v23 & 1))
                    goto LABEL_b738c8;
            }
            else
            {
                v24 = arm64g_calculate_condition(v15 | 16, v16, v17, v18);
                v5 = 0;
                v6 = (v24 & 1 ? *(long long *)&a0->padding_40[8] : 0x40000000);
                v7 = 0;
                v8 = 0;
                v25 = arm64g_calculate_condition(0, v6, 0, 0);
                if (!(v25 & 1))
                {
LABEL_b738c8:
                    _free(a0->field_38);
                }
            }
        }
    }
    if (a0->field_68)
    {
        v26 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
        v27 = arm64g_calculate_condition(20, (v26 & 1 ? a0->field_78 : 0x40000000), 0, 0);
        if (!(v27 & 1))
            return a0->field_68;
    }
    else
    {
        v28 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
        v29 = arm64g_calculate_condition(16, (v28 & 1 ? a0->field_78 : 0x40000000), 0, 0);
        if (!(v29 & 1))
            return a0->field_68;
    }
    return _free();
}
