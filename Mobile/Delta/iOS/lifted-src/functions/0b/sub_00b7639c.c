/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7639c..0xb763f0 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7639c_0 {
    char padding_0[80];
    long long field_50;
    char padding_58[24];
    long long field_70;
    char padding_78[8];
    unsigned long long field_80;
} st_b7639c_0;


long long sub_b7639c(st_b7639c_0 *a0)
{
    unsigned long v2;  // cc_op
    unsigned long v3;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long v4;  // 4110
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_50)
    {
        v4 = arm64g_calculate_condition(v2 | 16, v3, v10, v11);
        v5 = 4;
        v6 = (v4 & 1 ? *(long long *)&a0->padding_58[8] : 0x40000000);
        v7 = 0;
        v8 = 0;
        v9 = arm64g_calculate_condition(4, v6, 0, 0);
        if (!(v9 & 1))
            goto LABEL_b763c0;
    }
    else
    {
        v12 = arm64g_calculate_condition(v2 | 16, v3, v10, v11);
        v5 = 0;
        v6 = (v12 & 1 ? *(long long *)&a0->padding_58[8] : 0x40000000);
        v7 = 0;
        v8 = 0;
        v13 = arm64g_calculate_condition(0, v6, 0, 0);
        if (!(v13 & 1))
        {
LABEL_b763c0:
            _free(a0->field_50);
        }
    }
    if (a0->field_70)
    {
        v14 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
        v15 = arm64g_calculate_condition(20, (v14 & 1 ? a0->field_80 : 0x40000000), 0, 0);
        if (!(v15 & 1))
            return a0->field_70;
    }
    else
    {
        v16 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
        v17 = arm64g_calculate_condition(16, (v16 & 1 ? a0->field_80 : 0x40000000), 0, 0);
        if (!(v17 & 1))
            return a0->field_70;
    }
    return _free();
}
