/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98ed44..0x98ee6c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98ed44_0 {
    struct st_98ed44_1 *field_0;
    unsigned long long field_8;
} st_98ed44_0;

typedef struct st_98ed44_1 {
    char field_0;
} st_98ed44_1;

extern unsigned int g_fffffffffffffffc;

unsigned long long sub_98ed44(st_98ed44_0 *a0, unsigned long long *a1)
{
    unsigned long long v2;  // x21
    char *v3;  // x19
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v4;  // x22
    char *v16;  // x8
    unsigned long long v17;  // x10
    unsigned long long v18;  // x9
    unsigned long long v19;  // 4102
    char *v20;  // x8
    unsigned long long v21;  // x10
    unsigned long long v22;  // x9
    unsigned long long v23;  // 4102
    char *v24;  // x19
    unsigned long long v25;  // x22
    unsigned long long v26;  // x21
    unsigned long long v27;  // x0
    char *v28;  // x10
    unsigned long long i;  // x9
    unsigned long long v30;  // x9
    unsigned long long v31;  // x12
    unsigned long long v32;  // x11
    unsigned long long v33;  // 4102
    unsigned long long v6;  // x9
    char *v34;  // x10
    unsigned long long v35;  // x12
    unsigned long long v7;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (!v2 || !(v3 = a0->field_0, v4 = 1 << (*v3 >> 6 & 63), v2 >= v4))
        return 0;
    v6 = v2 - v4;
    v7 = sub_a7b0d8(v3) & (char *)&g_fffffffffffffffc + 2;
    if (v2 != v4)
    {
        v8 = arm64g_calculate_condition(v10 | 16, v11, v12, v13);
        v9 = arm64g_calculate_condition(20, (v8 & 1 ? v7 : 0), (v8 & 1 ? 2 : 0), 0);
        if (!(v9 & 1))
            goto LABEL_98ed94;
    }
    else
    {
        v14 = arm64g_calculate_condition(v10 | 16, v11, v12, v13);
        v15 = arm64g_calculate_condition(16, (v14 & 1 ? v7 : 0), (v14 & 1 ? 2 : 0), 0);
        if (!(v15 & 1))
        {
LABEL_98ed94:
            v16 = &v3[v4];
            v17 = 1 << (*v16 >> 6 & 63);
            v18 = v6 - v17;
            if (v6 >= v17)
            {
                v19 = arm64g_calculate_condition(4, v6, v17, 0);
                if (!(v19 & 1))
                {
                    v20 = &v16[v17];
                    v21 = 1 << (*v20 >> 6 & 63);
                    v22 = v18 - v21;
                    if (v18 >= v21)
                    {
                        v23 = arm64g_calculate_condition(4, v18, v21, 0);
                        if (!(v23 & 1))
                        {
                            v24 = &v20[v21];
                            v25 = 1 << (*v24 >> 6 & 63);
                            v26 = v22 - v25;
                            if (v25 <= v22)
                            {
                                v27 = sub_a7b0d8(v24);
                                if (v27)
                                {
                                    v28 = &v24[v25];
                                    i = v27;
                                    do
                                    {
                                        v30 = i;
                                        if (!v26)
                                            return 0;
                                        v31 = 1 << (*v28 >> 6 & 63);
                                        v32 = v26 - v31;
                                        if (v26 < v31)
                                            return 0;
                                        v33 = arm64g_calculate_condition(4, v26, v31, 0);
                                        if (v33 & 1)
                                            return 0;
                                        v34 = &v28[v31];
                                        v35 = 1 << (*v34 >> 6 & 63);
                                        v26 = v32 - v35;
                                        if (v32 < v35)
                                            return 0;
                                        v28 = &v34[v35];
                                        i = v30 - 1;
                                    } while (i);
                                }
                                *a1 = v27 + 1;
                                return 1;
                            }
                        }
                    }
                }
            }
        }
    }
    return 0;
}
