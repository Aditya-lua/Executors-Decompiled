/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa707f4..0xa709d4 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a707f4_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_a707f4_1 *field_10;
    unsigned long long field_18;
} st_a707f4_0;

typedef struct st_a707f4_1 {
    unsigned int field_0;
} st_a707f4_1;


double sub_a707f4(st_a707f4_0 *a0, double a1)
{
    unsigned int *v2;  // x8
    unsigned int v3;  // w9
    unsigned long long v12;  // 4102
    long long v13;  // x1
    long long v14;  // x1
    unsigned long v4;  // x8
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
        v14 = 862;
        goto LABEL_a70878;
    }
    v2 = a0->field_10;
    if (v2)
    {
        v3 = a0->field_8;
        if (v3 == 1)
        {
            if (a0->field_18 != 8)
            {
                if (a0->field_18 == 4)
                {
                    v4 = *v2;
                    if (!(v4 >> 31 & 1))
                    {
                        *(unsigned long *)a1 = v4;
                        return 1;
                    }
                    sub_a368c8();
                    v13 = 895;
                }
            }
            else
            {
                if (*(long long *)v2 < 0)
                {
                    sub_a368c8();
                    v13 = 903;
                }
                else
                {
                    *(long long *)a1 = *(long long *)v2;
                    return 1;
                }
            }
            sub_a369bc("crypto/params.c", v13, "OSSL_PARAM_get_uint64");
            v5 = 125;
        }
        else if (v3 != 3)
        {
            if (v3 != 2)
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 933, "OSSL_PARAM_get_uint64");
                v5 = 129;
            }
            else if (a0->field_18 == 8)
            {
                *(long long *)a1 = *(long long *)v2;
                return 1;
            }
            else if (a0->field_18 == 4)
            {
                *(unsigned long long *)a1 = *v2;
                return 1;
            }
        }
        else
        {
            if (a0->field_18 == 8)
            {
                v6 = *(double *)v2;
                v7 = arm64g_calculate_condition(160, (((((char)(CmpF(__double_as_longlong(v6), 0.0)) >> 5 & 3 | v6 < 0.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - (((char)(CmpF(__double_as_longlong(v6), 0.0)) >> 5 & 3 | v6 < 0.0) & ((char)(CmpF(__double_as_longlong(v6), 0.0)) >> 5 & 3 | v6 < 0.0) >> 1 & 1)) * 0x10000000, 0, 0);
                if (v7 & 1)
                {
                    v8 = (double)(unsigned long long)v6;
                    v9 = arm64g_calculate_condition(64, (((((char)(CmpF(__double_as_longlong(v6), 1.8446744073709552e+19)) >> 5 & 3 | v6 < 1.8446744073709552e+19) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v6)) * 0x10000000, 0, 0);
                    if (!(v9 & 1))
                        goto LABEL_a708c6;
LABEL_a708c5:
                    v11 = arm64g_calculate_condition(0, (((((char)(CmpF(__double_as_longlong(v6), __double_as_longlong(v8))) >> 5 & 3 | v6 < v8) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v6, v8)) * 0x10000000, 0, 0);
                    if (v11 & 1)
                    {
                        *(unsigned long long *)a1 = (unsigned long long)v6;
                        return 1;
                    }
                    goto LABEL_a708cc;
                }
                else
                {
                    v8 = (double)(unsigned long long)v6;
                    v10 = arm64g_calculate_condition(64, 0, 0, 0);
                    if (v10 & 1)
                        goto LABEL_a708c5;
LABEL_a708c6:
                    v12 = arm64g_calculate_condition(0, 0, 0, 0);
                    if (v12 & 1)
                    {
                        *(unsigned long long *)a1 = (unsigned long long)v6;
                        return 1;
                    }
LABEL_a708cc:
                    sub_a368c8();
                    sub_a369bc("crypto/params.c", 926, "OSSL_PARAM_get_uint64");
                    v5 = 123;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 929, "OSSL_PARAM_get_uint64");
                v5 = 130;
            }
        }
    }
    else
    {
        sub_a368c8();
        v14 = 867;
LABEL_a70878:
        sub_a369bc("crypto/params.c", v14, "OSSL_PARAM_get_uint64");
        v5 = 786690;
    }
    sub_a36abc(15, v5, 0);
    return 0;
}
