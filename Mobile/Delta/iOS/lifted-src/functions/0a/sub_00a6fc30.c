/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6fc30..0xa6fe3c (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6fc30_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    void* field_10;
    unsigned long long field_18;
} st_a6fc30_0;


unsigned long long sub_a6fc30(st_a6fc30_0 *a0, unsigned long long a1)
{
    void* v2;  // x8
    unsigned int v3;  // w9
    long long v12;  // x1
    unsigned long v4;  // x8
    unsigned long v5;  // x8
    long long v6;  // x1
    long long v7;  // x1
    double v8;  // d0
    unsigned long long v9;  // 4147
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !a1)
    {
        sub_a368c8();
        v12 = 395;
        goto LABEL_a6fcb4;
    }
    v2 = a0->field_10;
    if (v2)
    {
        v3 = a0->field_8;
        if (v3 != 3)
        {
            if (v3 == 2)
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
                        v6 = 436;
                        goto LABEL_a6fe2c;
                    }
                }
                else
                {
                    if ((unsigned long long)*(long long *)v2 > 1.060997895e-314)
                    {
                        sub_a368c8();
                        v6 = 444;
                        goto LABEL_a6fe2c;
                    }
                    else
                    {
                        *(int *)a1 = *(long long *)v2;
                        return 1;
                    }
                }
            }
            if (v3 == 1)
            {
                if (a0->field_18 != 8)
                {
                    if (a0->field_18 == 4)
                    {
                        *(int *)a1 = *(int *)v2;
                        return 1;
                    }
                }
                else
                {
                    v5 = *(long long *)v2;
                    if (v5 == (int)v5)
                    {
                        *(unsigned int *)a1 = v5;
                        return 1;
                    }
                    sub_a368c8();
                    v6 = 418;
                    goto LABEL_a6fe2c;
                }
                goto LABEL_a6fe2c;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 468, "OSSL_PARAM_get_int32");
                v7 = 129;
            }
        }
        else if (a0->field_18 == 8)
        {
            v8 = *(double *)v2;
            v9 = arm64g_calculate_condition(160, (((((char)(CmpF(__double_as_longlong(v8), -2147483648.0)) >> 5 & 3 | v8 < -2147483648.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v8)) * 0x10000000, 0, 0);
            if (v9 & 1)
            {
                v10 = arm64g_calculate_condition(128, (((((char)(CmpF(__double_as_longlong(v8), 2147483647.0)) >> 5 & 3 | v8 < 2147483647.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v8)) * 0x10000000, 0, 0);
                if (!(v10 & 1))
                    goto LABEL_a6fd40;
            }
            else
            {
                v11 = arm64g_calculate_condition(128, 0x20000000, 0, 0);
                if (!(v11 & 1))
                {
LABEL_a6fd40:
                    v4 = (int)v8;
                    if (v8 == (double)(int)v4)
                    {
                        *(unsigned int *)a1 = v4;
                        return 1;
                    }
                }
            }
            sub_a368c8();
            v6 = 461;
LABEL_a6fe2c:
            sub_a369bc("crypto/params.c", v6, "OSSL_PARAM_get_int32");
            v7 = 126;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/params.c", 464, "OSSL_PARAM_get_int32");
            v7 = 130;
        }
    }
    else
    {
        sub_a368c8();
        v12 = 400;
LABEL_a6fcb4:
        sub_a369bc("crypto/params.c", v12, "OSSL_PARAM_get_int32");
        v7 = 786690;
    }
    sub_a36abc(15, v7, 0);
    return 0;
}
