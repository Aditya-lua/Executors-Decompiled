/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97bac0..0x97bb34 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97bac0_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char field_18;
} st_97bac0_0;

typedef struct st_97bac0_1 {
    struct st_97bac0_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char field_18;
} st_97bac0_1;


st_97bac0_0 * sub_97bac0(st_97bac0_1 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x10
    st_97bac0_0 *v10;  // x0
    st_97bac0_0 *v11;  // x8
    unsigned long long v12;  // x10
    unsigned long long v13;  // x9
    unsigned long v14;  // cc_dep1
    unsigned long long v15;  // x11
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long v2;  // cc_dep1
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long v3;  // x11
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102

    v0 = a0->field_8;
    v1 = a0->field_10 - v0;
    v2 = v1;
    if (v1 < a1)
    {
        v3 = v1;
        v4 = arm64g_calculate_condition(148, v2, a1, 0);
        if (!(v4 & 1))
            goto LABEL_97bad6;
LABEL_97bad5:
        v6 = arm64g_calculate_condition(148, v2, a1, 0);
        v7 = arm64g_calculate_condition(4, (v6 & 1 ? v3 : 0x40000000), 0, 0);
        if (!(v7 & 1))
            goto LABEL_97badc;
    }
    else
    {
        v3 = a1;
        v5 = arm64g_calculate_condition(148, v2, a1, 0);
        if (v5 & 1)
            goto LABEL_97bad5;
LABEL_97bad6:
        v8 = arm64g_calculate_condition(148, v2, a1, 0);
        v9 = arm64g_calculate_condition(0, (v8 & 1 ? v3 : 0x40000000), 0, 0);
        if (!(v9 & 1))
        {
LABEL_97badc:
            a0->field_18 = 1;
        }
    }
    v10 = v1 >= a1;
    a0->field_8 = v3 + v0;
    v11 = a0->field_0;
    if (v11)
    {
        v12 = v11->field_8;
        v13 = v11->field_10 - v12;
        v14 = v13;
        if (v13 < a1)
        {
            v15 = v13;
            v16 = arm64g_calculate_condition(148, v14, a1, 0);
            if (!(v16 & 1))
                goto LABEL_97bb0e;
LABEL_97bb0d:
            v18 = arm64g_calculate_condition(148, v14, a1, 0);
            v19 = arm64g_calculate_condition(4, (v18 & 1 ? v15 : 0x40000000), 0, 0);
            if (!(v19 & 1))
                goto LABEL_97bb14;
        }
        else
        {
            v15 = a1;
            v17 = arm64g_calculate_condition(148, v14, a1, 0);
            if (v17 & 1)
                goto LABEL_97bb0d;
LABEL_97bb0e:
            v20 = arm64g_calculate_condition(148, v14, a1, 0);
            v21 = arm64g_calculate_condition(0, (v20 & 1 ? v15 : 0x40000000), 0, 0);
            if (!(v21 & 1))
            {
LABEL_97bb14:
                v11->field_18 = 1;
            }
        }
        v11->field_8 = v15 + v12;
        if (a1 > v13)
            v10 = 0;
    }
    return v10;
}
