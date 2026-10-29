/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988db0..0x988e98 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988db0_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_988db0_0;

typedef struct st_988db0_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[24];
    struct st_988db0_0 *field_38;
    char padding_40[16];
    char field_50;
} st_988db0_1;


unsigned long long sub_988db0(st_988db0_1 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v4;  // x0
    st_988db0_0 *v5;  // x8
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long long v12;  // 4102
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long long v6;  // x21
    unsigned long long v19;  // x9
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    char v24;  // x22
    unsigned long long v25;  // x10
    unsigned long long v7;  // x8
    char v26;  // x20
    unsigned long v27;  // x8
    unsigned long v8;  // 4110
    unsigned long v9;  // cc_op
    unsigned long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a1;
    v1 = a2;
    v4 = sub_c63d0c(&a0->field_38, &v0);
    if (!(unsigned int)v4)
        return v4;
    v5 = a0->field_38;
    if (!v5)
        return 1;
    v6 = v5->field_18;
    v7 = a0->field_18;
    if (v6 <= 0x3fffffffffffffff)
    {
        v8 = arm64g_calculate_condition(v13, v14, v15, v16);
        v9 = 4;
        v10 = (v8 & 1 ? v7 : 0);
        v11 = (v8 & 1 ? *(long long *)&v5->padding_0[16] : 0);
        v12 = arm64g_calculate_condition(52, v10, v11, 0);
        if (!(v12 & 1))
            goto LABEL_988dfc;
    }
    else
    {
        v17 = arm64g_calculate_condition(v13, v14, v15, v16);
        v9 = 0;
        v10 = (v17 & 1 ? v7 : 0);
        v11 = (v17 & 1 ? *(long long *)&v5->padding_0[16] : 0);
        v18 = arm64g_calculate_condition(48, v10, v11, 0);
        if (!(v18 & 1))
        {
LABEL_988dfc:
            if (a0->field_50 >> 3 & 1)
            {
                v19 = a0->field_8;
                if (v7 < v6)
                {
                    v20 = arm64g_calculate_condition(v9 | 48, v10, v11, 0);
                    v21 = arm64g_calculate_condition(4, (v20 & 1 ? v19 : 0x40000000), 0, 0);
                    if (!(v21 & 1))
                        goto LABEL_988e14;
                }
                else
                {
                    v22 = arm64g_calculate_condition(v9 | 48, v10, v11, 0);
                    v23 = arm64g_calculate_condition(0, (v22 & 1 ? v19 : 0x40000000), 0, 0);
                    if (!(v23 & 1))
                    {
LABEL_988e14:
                        v24 = v7 - v19 * v7 / v19;
                        v25 = a0->field_10;
                        if (a0->field_10 > v6)
                            v25 = v6 + 1;
                        v26 = v25 - v7;
                        if (v26 > v19 - v24)
                        {
                            sub_a66ec0(a0->field_0 + v24);
                            v26 = v26 + v24 - a0->field_8;
                            v24 = 0;
                        }
                        if (v26)
                            sub_a66ec0(a0->field_0 + v24, v26);
                    }
                }
            }
            v27 = v6 + 1;
            a0->field_18 = v27;
            if (v6 >= a0->field_10)
                a0->field_10 = v27;
        }
    }
    return 1;
}
