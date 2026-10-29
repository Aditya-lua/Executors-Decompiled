/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98f3b0..0x98f4cc (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98f3b0_1 {
    unsigned long long field_0;
    struct st_98f3b0_0 *field_8;
    struct st_98f3b0_0 *field_10;
} st_98f3b0_1;

typedef struct st_98f3b0_0 {
    char field_0;
} st_98f3b0_0;


char * sub_98f3b0(st_98f3b0_0 **a0, char *a1, st_98f3b0_1 *a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long v20;  // cc_ndep
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long long v9;  // x20
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4102
    char *v25;  // x22
    char *v26;  // x9
    char *v27;  // x0
    char *v28;  // x8
    unsigned long long v10;  // x19
    char *v29;  // x22
    char *v30;  // x0
    char *v31;  // x8
    char *v32;  // x9
    unsigned long long v11;  // x30
    char *v12;  // x22
    unsigned long long v13;  // x0
    char *v14;  // x10
    char *v15;  // x0
    char *v16;  // x9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0[1])
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = 1 << ((char)(*(char *)*a0) >> 6 & 63);
    if (a0[1] < v12)
        return 0;
    v13 = sub_a7b0d8(*a0);
    v14 = a0[1];
    v15 = *a0 + v12;
    v16 = v14 - v12;
    *a0 = v15;
    a0[1] = v16;
    if (v13 == 6)
    {
        v21 = arm64g_calculate_condition(v17, v18, v19, v20);
        v22 = arm64g_calculate_condition(4, (v21 & 1 ? v14 : 0x40000000), (v21 & 1 ? v12 : 0), 0);
        if (!(v22 & 1))
            goto LABEL_98f414;
    }
    else
    {
        v23 = arm64g_calculate_condition(v17, v18, v19, v20);
        v24 = arm64g_calculate_condition(0, (v23 & 1 ? v14 : 0x40000000), (v23 & 1 ? v12 : 0), 0);
        if (!(v24 & 1))
        {
LABEL_98f414:
            v25 = 1 << (*v15 >> 6 & 63);
            if (v16 >= v25)
            {
                a2->field_0 = sub_a7b0d8();
                v26 = a0[1];
                v27 = *a0 + v25;
                v28 = v26 - v25;
                *a0 = v27;
                a0[1] = v28;
                if (v26 != v25)
                {
                    v29 = 1 << (*v27 >> 6 & 63);
                    if (v28 >= v29)
                    {
                        v30 = sub_a7b0d8();
                        a2->field_8 = v30;
                        v31 = *a0 + v29;
                        v32 = a0[1] - v29;
                        *a0 = v31;
                        a0[1] = v32;
                        if (&v30[a2->field_0] <= 0x3fffffffffffffff)
                        {
                            if (a1)
                            {
                                a2->field_10 = 0;
                                return 1;
                            }
                            else if (v32 >= v30)
                            {
                                a2->field_10 = v31;
                                *a0 = v31 + v30;
                                a0[1] = v32 - v30;
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
