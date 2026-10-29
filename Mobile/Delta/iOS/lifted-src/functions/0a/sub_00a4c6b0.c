/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4c6b0..0xa4ca14 (868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4c6b0_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[10];
    char field_12;
    char padding_13[21];
    struct st_a4c6b0_1 *field_28;
    char padding_30[112];
    struct st_a4c6b0_2 *field_a0;
} st_a4c6b0_0;

typedef struct st_a4c6b0_1 {
    unsigned long long field_0;
} st_a4c6b0_1;

typedef struct st_a4c6b0_2 {
    char field_0;
} st_a4c6b0_2;

typedef struct st_a4c6b0_3 {
    struct st_a4c6b0_0 *field_0;
    char padding_8[105];
    char field_71;
} st_a4c6b0_3;


unsigned long long sub_a4c6b0(st_a4c6b0_3 *a0, long long a1, char a2, long long a3, unsigned long long a4)
{
    st_a4c6b0_0 *v2;  // x8
    unsigned long long v3;  // x24
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    long long iter;  // x20
    unsigned long n;  // x23
    unsigned long long v15;  // x0
    char v16;  // w25
    unsigned long v17;  // x8
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // x9
    char v5;  // w0
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4105
    unsigned long v22;  // x8
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4105
    unsigned long long v27;  // x0
    unsigned long v28;  // cc_dep1
    unsigned long long v29;  // x9
    unsigned long long v30;  // x10
    unsigned long long v31;  // x11
    unsigned long v32;  // 4110
    unsigned long v33;  // cc_op
    unsigned long v34;  // cc_dep1
    unsigned long v35;  // cc_dep2
    unsigned long v36;  // 4110
    unsigned long long v37;  // 4118
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a4 >> 31 & 1)
    {
        sub_c67564();
        return 0;
    }
    else if (a2)
    {
        *(unsigned int *)a2 = 0;
        if (*(int *)&a0->padding_8[8])
        {
            sub_c67498();
            return 0;
        }
        v2 = a0->field_0;
        if (!v2)
        {
            sub_c67500();
            return 0;
        }
        v3 = a4;
        iter = a1;
        if (*(long long *)&v2->padding_30[72])
        {
            v5 = sub_a50638(a0);
            if (a0->field_0->field_a0)
            {
                v6 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
                v7 = arm64g_calculate_condition(211, (v6 & 1 ? v5 : 0x40000000), 0, 0);
                if (v7 & 1)
                {
                    sub_c674c8();
                    return 0;
                }
            }
            else
            {
                v12 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
                v13 = arm64g_calculate_condition(208, (v12 & 1 ? v5 : 0x40000000), 0, 0);
                if (v13 & 1)
                {
                    sub_c674c8();
                    return 0;
                }
            }
            a0->field_0->field_a0();
        }
        else
        {
            n = v2->field_4;
            v15 = v3;
            if (sub_a50de8(a0, 0x2000))
                v15 = sub_a4d3c8(v3);
            if (!(a0->field_0->field_12 >> 4 & 1))
            {
                if ((unsigned int)v3)
                {
                    if (a0->field_71 & 1)
                        return sub_a4d08c();
                    if (33 <= (unsigned int)n)
                        sub_a69928("assertion failed: b <= sizeof(ctx->final)", "crypto/evp/evp_enc.c", 1212);
                    v16 = *(int *)&a0[1].padding_8[6];
                    if (v16)
                    {
                        v17 = iter - a3;
                        v18 = iter;
                        if (iter == a3)
                        {
LABEL_a4c84c:
                            sub_a368c8();
                            sub_a369bc("crypto/evp/evp_enc.c", 1218, "EVP_DecryptUpdate");
                            sub_a36abc(6, 162, 0);
                            return 0;
                        }
                        v19 = -n;
                        if (n <= v17)
                        {
                            v20 = arm64g_calculate_condition(36, v18, a3, 0);
                            v21 = arm64g_calculate_condition(132, (v20 & 1 ? v17 : 0x20000000), (v20 & 1 ? v19 : 0), 0);
                            v22 = !(v21 & 1);
                            if ((unsigned int)n)
                                goto LABEL_a4c848;
                        }
                        else
                        {
                            v23 = arm64g_calculate_condition(36, v18, a3, 0);
                            v24 = arm64g_calculate_condition(128, (v23 & 1 ? v17 : 0x20000000), (v23 & 1 ? v19 : 0), 0);
                            v22 = !(v24 & 1);
                            if ((unsigned int)n)
                            {
LABEL_a4c848:
                                if (!(v22 & 1))
                                    goto LABEL_a4c84c;
                            }
                        }
                        if ((-(unsigned int)n & (unsigned int)v3) > ((unsigned int)n ^ 0x7fffffff))
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/evp/evp_enc.c", 1231, "EVP_DecryptUpdate");
                            sub_a36abc(6, 202, 0);
                            return 0;
                        }
                        _memcpy(iter, &a0[1].padding_8[14], n);
                        iter += n;
                    }
                    v27 = sub_a4d08c(a0, iter, a2, a3, v3);
                    if (!(unsigned int)v27)
                    {
                        return v27;
                    }
                    else if ((unsigned int)n < 2 || *(int *)&a0->padding_8[12])
                    {
                        *(unsigned int *)&a0[1].padding_8[6] = 0;
                        if (v16)
                            goto LABEL_a4c9bc;
                    }
                    else
                    {
                        *(unsigned int *)a2 = *(int *)a2 - n;
                        *(unsigned int *)&a0[1].padding_8[6] = 1;
                        _memcpy(&a0[1].padding_8[14], iter + *(int *)a2, n);
                        if (v16)
                        {
LABEL_a4c9bc:
                            *(unsigned int *)a2 = *(int *)a2 + (unsigned int)n;
                        }
                    }
                }
                else
                {
                    *(unsigned int *)a2 = 0;
                }
                return 1;
            }
            v28 = n & 0xffffffff;
            if ((unsigned int)n != 1)
                a0->field_0->field_28();
            v29 = iter - a3;
            v30 = v15 & 0xffffffff;
            v31 = -v30;
            if (v30 <= v29)
            {
                v32 = arm64g_calculate_condition(35, v28, 1, 0);
                v33 = 4;
                v34 = (v32 & 1 ? v29 : 0x20000000);
                v35 = (v32 & 1 ? v31 : 0);
            }
            else
            {
                v36 = arm64g_calculate_condition(35, v28, 1, 0);
                v33 = 0;
                v34 = (v36 & 1 ? v29 : 0x20000000);
                v35 = (v36 & 1 ? v31 : 0);
            }
            v37 = arm64g_calculate_condition(v33 | 128, v34, v35, 0);
            if (iter == a3)
            {
                a0->field_0->field_28();
            }
            else if ((unsigned int)v15)
            {
                if (v37 & 1)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_enc.c", 1191, "EVP_DecryptUpdate");
                    sub_a36abc(6, 162, 0);
                    return 0;
                }
                a0->field_0->field_28();
            }
            else
            {
                a0->field_0->field_28();
            }
        }
    }
    else
    {
        sub_c67530();
        return 0;
    }
}
