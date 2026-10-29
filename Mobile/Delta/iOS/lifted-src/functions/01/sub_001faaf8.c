/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1faaf8..0x1fab58 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1faaf8_0 {
    unsigned int field_0;
    unsigned int field_4;
} st_1faaf8_0;


unsigned int * sub_1faaf8(unsigned int *a0, st_1faaf8_0 *a1)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w10
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long long v8;  // 4112
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long v13;  // 4112
    unsigned long long v14;  // 4112
    unsigned int v2;  // w8
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4112
    unsigned long long v3;  // 4122
    unsigned long long v18;  // 4102
    unsigned int v19;  // w10
    unsigned int v20;  // w9
    unsigned int v21;  // w8
    unsigned long long v22;  // 4113
    unsigned long long v23;  // 4112
    unsigned long v4;  // 4112
    unsigned long v5;  // cc_op

    v0 = *a0;
    v1 = a1->field_0;
    v2 = v0 * v1;
    if (v2)
    {
        v3 = arm64g_calculate_condition(0x11, v0, 1, 0);
        if (v3 & 1)
        {
            v4 = arm64g_calculate_condition(v9 | 16, v10, v11, v12);
            v5 = 1;
            v6 = (v4 & 1 ? v1 : 0x40000000);
            v7 = v4 & 1;
            v8 = arm64g_calculate_condition(0x11, v6, v7, 0);
            if (!(v8 & 1))
                goto LABEL_1fab12;
LABEL_1fab11:
            v15 = arm64g_calculate_condition(v5 | 16, v6, v7, 0);
            v16 = arm64g_calculate_condition(35, (v15 & 1 ? v2 : 0), (v15 & 1 ? v0 : 0), 0);
            if (!(v16 & 1))
                goto LABEL_1fab18;
        }
        else
        {
            v13 = arm64g_calculate_condition(v9 | 16, v10, v11, v12);
            v5 = 0;
            v6 = (v13 & 1 ? v1 : 0x40000000);
            v7 = v13 & 1;
            v14 = arm64g_calculate_condition(16, v6, v7, 0);
            if (v14 & 1)
                goto LABEL_1fab11;
LABEL_1fab12:
            v17 = arm64g_calculate_condition(v5 | 16, v6, v7, 0);
            v18 = arm64g_calculate_condition(32, (v17 & 1 ? v2 : 0), (v17 & 1 ? v0 : 0), 0);
            if (!(v18 & 1))
            {
LABEL_1fab18:
                v2 = 0xffffffff;
            }
        }
    }
    *a0 = v2;
    v19 = a0[1];
    v20 = v19 * a1->field_4;
    if (!v20 || (v21 = 0xffffffff, v22 = arm64g_calculate_condition(1, v19, 1, 0), !(v22 & 1) && !(v23 = arm64g_calculate_condition(1, a1->field_4, 1, 0), v23 & 1 || v20 < v19)))
        v21 = v20;
    a0[1] = v21;
    return a0;
}
