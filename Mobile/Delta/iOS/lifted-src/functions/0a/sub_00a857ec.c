/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa857ec..0xa85848 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a857ec_0 {
    char padding_0[56];
    struct st_a857ec_1 *field_38;
    unsigned long long field_40;
} st_a857ec_0;

typedef struct st_a857ec_1 {
    unsigned long long field_0;
} st_a857ec_1;


long long sub_a857ec(st_a857ec_0 *a0, st_a857ec_0 *a1)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned int v11;  // w9
    unsigned int v12;  // w8
    unsigned long long *v13;  // x8
    unsigned long long *v14;  // x9
    unsigned long v15;  // 4110
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // cc_dep2
    unsigned long long v19;  // 4110
    unsigned long v20;  // 4110
    unsigned long long v21;  // 4110
    unsigned long v22;  // 4110
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // cc_dep2
    unsigned long long v26;  // 4110
    unsigned long v27;  // 4110
    unsigned long long v28;  // 4110
    unsigned long v29;  // 4110
    unsigned long v30;  // cc_op
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    unsigned long v33;  // 4110
    unsigned long long v34;  // 4105
    unsigned long v2;  // 4110
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long long v5;  // 4102

    v0 = a1->field_40;
    if (a0->field_40)
    {
        v2 = arm64g_calculate_condition(v1 | 16, v6, v7, v8);
        v3 = 4;
        v4 = (v2 & 1 ? v0 : 0x40000000);
        v5 = arm64g_calculate_condition(20, v4, 0, 0);
        if (v5 & 1)
            goto LABEL_a85818;
    }
    else
    {
        v9 = arm64g_calculate_condition(v1 | 16, v6, v7, v8);
        v3 = 0;
        v4 = (v9 & 1 ? v0 : 0x40000000);
        v10 = arm64g_calculate_condition(16, v4, 0, 0);
        if (v10 & 1)
        {
LABEL_a85818:
            v13 = a0->field_38;
            v14 = a1->field_38;
            if (*v13 == *v14)
            {
                v15 = arm64g_calculate_condition(v3, v4, 0, 0);
                v16 = 4;
                v17 = (v15 & 1 ? v13[1] : 0);
                v18 = (v15 & 1 ? v14[1] : 0);
                v19 = arm64g_calculate_condition(4, v17, v18, 0);
                if (!(v19 & 1))
                    goto LABEL_a8583a;
LABEL_a85839:
                v22 = arm64g_calculate_condition(v16, v17, v18, 0);
                v23 = 4;
                v24 = (v22 & 1 ? v13[2] : 0);
                v25 = (v22 & 1 ? v14[2] : 0);
                v26 = arm64g_calculate_condition(4, v24, v25, 0);
                if (!(v26 & 1))
                    goto LABEL_a8583e;
LABEL_a8583d:
                v29 = arm64g_calculate_condition(v23, v24, v25, 0);
                v30 = 4;
                v31 = (v29 & 1 ? v13[3] : 0);
                v32 = (v29 & 1 ? v14[3] : 0);
            }
            else
            {
                v20 = arm64g_calculate_condition(v3, v4, 0, 0);
                v16 = 0;
                v17 = (v20 & 1 ? v13[1] : 0);
                v18 = (v20 & 1 ? v14[1] : 0);
                v21 = arm64g_calculate_condition(0, v17, v18, 0);
                if (v21 & 1)
                    goto LABEL_a85839;
LABEL_a8583a:
                v27 = arm64g_calculate_condition(v16, v17, v18, 0);
                v23 = 0;
                v24 = (v27 & 1 ? v13[2] : 0);
                v25 = (v27 & 1 ? v14[2] : 0);
                v28 = arm64g_calculate_condition(0, v24, v25, 0);
                if (v28 & 1)
                    goto LABEL_a8583d;
LABEL_a8583e:
                v33 = arm64g_calculate_condition(v23, v24, v25, 0);
                v30 = 0;
                v31 = (v33 & 1 ? v13[3] : 0);
                v32 = (v33 & 1 ? v14[3] : 0);
            }
            v34 = arm64g_calculate_condition(v30 | 16, v31, v32, 0);
            return !(v34 & 1);
        }
    }
    v11 = a0->field_40 != 0;
    if (v0)
        v12 = v11 & 1;
    else
        v12 = 1;
    return v11 ^ v12;
}
