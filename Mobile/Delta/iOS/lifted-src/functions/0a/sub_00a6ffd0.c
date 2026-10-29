/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ffd0..0xa70210 (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6ffd0_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    void* field_10;
    unsigned long long field_18;
} st_a6ffd0_0;


double sub_a6ffd0(st_a6ffd0_0 *a0, double a1)
{
    void* v2;  // x8
    unsigned int v3;  // w9
    unsigned long v4;  // x8
    long long v5;  // x1
    double v6;  // d0
    unsigned long long v7;  // 4147
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4102
    unsigned long v10;  // x19
    long long v11;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !__double_as_longlong(a1))
    {
        sub_a368c8();
        v11 = 549;
        goto LABEL_a70058;
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
                    v4 = *(int *)v2;
                    if (!(v4 >> 31 & 1))
                    {
                        *(unsigned int *)a1 = v4;
                        return 1;
                    }
                    sub_a368c8();
                    goto LABEL_a70200;
                }
                goto LABEL_a70200;
            }
            v10 = *(long long *)v2;
            if (v10 <= 2.1219957905e-314)
            {
                *(unsigned int *)a1 = v10;
                return 1;
            }
            sub_a368c8();
            if ((long long)v10 >= 0)
            {
LABEL_a701d0:
                sub_a369bc();
                v5 = 126;
            }
            else
            {
LABEL_a70200:
                sub_a369bc();
                v5 = 125;
            }
        }
        else if (v3 != 3)
        {
            if (v3 == 2)
            {
                if (a0->field_18 == 8)
                {
                    if ((unsigned long long)*(long long *)v2 <= 2.1219957905e-314)
                    {
                        *(int *)a1 = *(long long *)v2;
                        return 1;
                    }
                    sub_a368c8();
                    goto LABEL_a701d0;
                }
                else if (a0->field_18 == 4)
                {
                    *(int *)a1 = *(int *)v2;
                    return 1;
                }
                goto LABEL_a701d0;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 623, "OSSL_PARAM_get_uint32");
                v5 = 129;
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
                    v8 = arm64g_calculate_condition(128, (((((char)(CmpF(__double_as_longlong(v6), 4294967295.0)) >> 5 & 3 | v6 < 4294967295.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v6)) * 0x10000000, 0, 0);
                    if (!(v8 & 1))
                        goto LABEL_a700a8;
                }
                else
                {
                    v9 = arm64g_calculate_condition(128, 0x20000000, 0, 0);
                    if (!(v9 & 1))
                    {
LABEL_a700a8:
                        v4 = (unsigned int)v6;
                        if (v6 == (double)(unsigned int)v4)
                        {
                            *(unsigned int *)a1 = v4;
                            return 1;
                        }
                    }
                }
                sub_a368c8();
                sub_a369bc("crypto/params.c", 616, "OSSL_PARAM_get_uint32");
                v5 = 123;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 619, "OSSL_PARAM_get_uint32");
                v5 = 130;
            }
        }
    }
    else
    {
        sub_a368c8();
        v11 = 554;
LABEL_a70058:
        sub_a369bc("crypto/params.c", v11, "OSSL_PARAM_get_uint32");
        v5 = 786690;
    }
    sub_a36abc(15, v5, 0);
    return 0;
}
