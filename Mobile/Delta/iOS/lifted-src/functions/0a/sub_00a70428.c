/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa70428..0xa705f4 (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a70428_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_a70428_1 *field_10;
    unsigned long long field_18;
} st_a70428_0;

typedef struct st_a70428_1 {
    unsigned int field_0;
} st_a70428_1;


double sub_a70428(st_a70428_0 *a0, double a1)
{
    unsigned int *v2;  // x8
    unsigned int v3;  // w9
    unsigned long long v12;  // 4102
    long long v13;  // x1
    long long v5;  // x1
    double v6;  // d0
    unsigned long long v7;  // 4143
    double v8;  // d1
    unsigned long long v9;  // 4127
    unsigned long long v10;  // 4127
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !__double_as_longlong(a1))
    {
        sub_a368c8();
        v13 = 707;
        goto LABEL_a704ac;
    }
    v2 = a0->field_10;
    if (v2)
    {
        v3 = a0->field_8;
        if (v3 != 3)
        {
            if (v3 != 2)
            {
                if (v3 != 1)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/params.c", 772, "OSSL_PARAM_get_int64");
                    v5 = 129;
                }
                else if (a0->field_18 == 8)
                {
                    *(long long *)a1 = *(long long *)v2;
                    return 1;
                }
                else if (a0->field_18 == 4)
                {
                    *(long long *)a1 = *v2;
                    return 1;
                }
            }
            else
            {
                if (a0->field_18 != 8)
                {
                    if (a0->field_18 == 4)
                    {
                        *(unsigned long long *)a1 = *v2;
                        return 1;
                    }
                }
                else
                {
                    if (*(long long *)v2 < 0)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/params.c", 742, "OSSL_PARAM_get_int64");
                        v5 = 126;
                    }
                    else
                    {
                        *(long long *)a1 = *(long long *)v2;
                        return 1;
                    }
                }
            }
        }
        else
        {
            if (a0->field_18 == 8)
            {
                v6 = *(double *)v2;
                v7 = arm64g_calculate_condition(160, (((((char)(CmpF(__double_as_longlong(v6), -9.223372036854776e+18)) >> 5 & 3 | v6 < -9.223372036854776e+18) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v6)) * 0x10000000, 0, 0);
                if (v7 & 1)
                {
                    v8 = (double)(long long)v6;
                    v9 = arm64g_calculate_condition(64, (((((char)(CmpF(__double_as_longlong(v6), 9.223372036854776e+18)) >> 5 & 3 | v6 < 9.223372036854776e+18) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v6)) * 0x10000000, 0, 0);
                    if (!(v9 & 1))
                        goto LABEL_a7051e;
LABEL_a7051d:
                    v11 = arm64g_calculate_condition(0, (((((char)(CmpF(__double_as_longlong(v6), __double_as_longlong(v8))) >> 5 & 3 | v6 < v8) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v6, v8)) * 0x10000000, 0, 0);
                    if (v11 & 1)
                    {
                        *(long long *)a1 = (long long)v6;
                        return 1;
                    }
                }
                else
                {
                    v8 = (double)(long long)v6;
                    v10 = arm64g_calculate_condition(64, 0, 0, 0);
                    if (v10 & 1)
                        goto LABEL_a7051d;
LABEL_a7051e:
                    v12 = arm64g_calculate_condition(0, 0, 0, 0);
                    if (v12 & 1)
                    {
                        *(long long *)a1 = (long long)v6;
                        return 1;
                    }
                }
                sub_a368c8();
                sub_a369bc("crypto/params.c", 765, "OSSL_PARAM_get_int64");
                v5 = 123;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 0x300, "OSSL_PARAM_get_int64");
                v5 = 130;
            }
        }
    }
    else
    {
        sub_a368c8();
        v13 = 712;
LABEL_a704ac:
        sub_a369bc("crypto/params.c", v13, "OSSL_PARAM_get_int64");
        v5 = 786690;
    }
    sub_a36abc(15, v5, 0);
    return 0;
}
