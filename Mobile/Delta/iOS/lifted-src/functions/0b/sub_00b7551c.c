/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7551c..0xb755ac (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7551c_1 {
    char padding_0[8];
    struct st_b7551c_0 *field_8;
    char padding_10[24];
    struct st_b7551c_0 *field_28;
    char padding_30[40];
    struct st_b7551c_0 *field_58;
    struct st_b7551c_0 *field_60;
    char padding_68[8];
    unsigned long long field_70;
    char padding_78[8];
    struct st_b7551c_0 *field_80;
    char padding_88[8];
    struct st_b7551c_0 *field_90;
} st_b7551c_1;

typedef struct st_b7551c_0 {
    struct st_b7551c_0 *field_0;
} st_b7551c_0;


st_b7551c_0 ** sub_b7551c(st_b7551c_1 *a0)
{
    st_b7551c_0 **ptr;  // x0
    unsigned long v3;  // cc_op
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long v15;  // 4110
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long long v20;  // 4102
    unsigned long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4102
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4102
    st_b7551c_0 **v27;  // x0
    unsigned long v4;  // 4110
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = a0;
    if (*ptr)
    {
        if (a0->field_8)
        {
            v4 = arm64g_calculate_condition(v3 | 16, v10, v11, v12);
            v5 = 4;
            v6 = (v4 & 1 ? *(long long *)&a0->padding_10[8] : 0x40000000);
            v7 = 0;
            v8 = 0;
            v9 = arm64g_calculate_condition(4, v6, 0, 0);
            if (!(v9 & 1))
                goto LABEL_b75548;
        }
        else
        {
            v13 = arm64g_calculate_condition(v3 | 16, v10, v11, v12);
            v5 = 0;
            v6 = (v13 & 1 ? *(long long *)&a0->padding_10[8] : 0x40000000);
            v7 = 0;
            v8 = 0;
            v14 = arm64g_calculate_condition(0, v6, 0, 0);
            if (!(v14 & 1))
            {
LABEL_b75548:
                _free(a0->field_8);
            }
        }
        ptr = a0->field_28;
        if (ptr)
        {
            v15 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
            v16 = 4;
            v17 = (v15 & 1 ? *(long long *)&a0->padding_30[8] : 0x40000000);
            v18 = 0;
            v19 = 0;
            v20 = arm64g_calculate_condition(4, v17, 0, 0);
            if (!(v20 & 1))
                goto LABEL_b75560;
        }
        else
        {
            v21 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
            v16 = 0;
            v17 = (v21 & 1 ? *(long long *)&a0->padding_30[8] : 0x40000000);
            v18 = 0;
            v19 = 0;
            v22 = arm64g_calculate_condition(0, v17, 0, 0);
            if (!(v22 & 1))
            {
LABEL_b75560:
                ptr = _free(ptr);
            }
        }
    }
    if (!a0->field_58)
        return ptr;
    if (a0->field_60)
    {
        v23 = arm64g_calculate_condition(v16 | 16, v17, v18, v19);
        v24 = arm64g_calculate_condition(4, (v23 & 1 ? a0->field_70 : 0x40000000), 0, 0);
        if (!(v24 & 1))
            goto LABEL_b75580;
    }
    else
    {
        v25 = arm64g_calculate_condition(v16 | 16, v17, v18, v19);
        v26 = arm64g_calculate_condition(0, (v25 & 1 ? a0->field_70 : 0x40000000), 0, 0);
        if (!(v26 & 1))
        {
LABEL_b75580:
            _free(a0->field_60);
        }
    }
    v27 = a0->field_80;
    if (!v27)
    {
        return v27;
    }
    else if (a0->field_90)
    {
        return _free();
    }
    else
    {
        return v27;
    }
}
