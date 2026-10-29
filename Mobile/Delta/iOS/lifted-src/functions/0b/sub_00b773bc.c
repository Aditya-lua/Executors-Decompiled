/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb773bc..0xb77430 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b773bc_0 {
    long long field_0;
    long long field_8;
    char padding_10[24];
    long long field_28;
    char padding_30[24];
    long long field_48;
    char padding_50[8];
    unsigned long long field_58;
} st_b773bc_0;


long long sub_b773bc(st_b773bc_0 *a0)
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
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long v4;  // 4110
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0)
    {
        if (a0->field_8)
        {
            v4 = arm64g_calculate_condition(v2 | 16, v3, v10, v11);
            v5 = 4;
            v6 = (v4 & 1 ? *(long long *)&a0->padding_10[8] : 0x40000000);
            v7 = 0;
            v8 = 0;
            v9 = arm64g_calculate_condition(4, v6, 0, 0);
            if (!(v9 & 1))
                goto LABEL_b773e8;
        }
        else
        {
            v12 = arm64g_calculate_condition(v2 | 16, v3, v10, v11);
            v5 = 0;
            v6 = (v12 & 1 ? *(long long *)&a0->padding_10[8] : 0x40000000);
            v7 = 0;
            v8 = 0;
            v13 = arm64g_calculate_condition(0, v6, 0, 0);
            if (!(v13 & 1))
            {
LABEL_b773e8:
                _free(a0->field_8);
            }
        }
        if (a0->field_28)
        {
            v14 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
            v15 = 4;
            v16 = (v14 & 1 ? *(long long *)&a0->padding_30[8] : 0x40000000);
            v17 = 0;
            v18 = 0;
            v19 = arm64g_calculate_condition(4, v16, 0, 0);
            if (!(v19 & 1))
                goto LABEL_b77400;
        }
        else
        {
            v20 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
            v15 = 0;
            v16 = (v20 & 1 ? *(long long *)&a0->padding_30[8] : 0x40000000);
            v17 = 0;
            v18 = 0;
            v21 = arm64g_calculate_condition(0, v16, 0, 0);
            if (!(v21 & 1))
            {
LABEL_b77400:
                _free(a0->field_28);
            }
        }
    }
    if (a0->field_48)
    {
        v22 = arm64g_calculate_condition(v15 | 16, v16, v17, v18);
        v23 = arm64g_calculate_condition(20, (v22 & 1 ? a0->field_58 : 0x40000000), 0, 0);
        if (!(v23 & 1))
            return a0->field_48;
    }
    else
    {
        v24 = arm64g_calculate_condition(v15 | 16, v16, v17, v18);
        v25 = arm64g_calculate_condition(16, (v24 & 1 ? a0->field_58 : 0x40000000), 0, 0);
        if (!(v25 & 1))
            return a0->field_48;
    }
    return _free();
}
