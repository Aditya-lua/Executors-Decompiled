/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab3f3c..0xab4384 (1096 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab3f3c_2 {
    char padding_0[8];
    long long field_8;
    int field_10;
    char padding_14[4];
    struct st_ab3f3c_0 *field_18;
    char padding_20[8];
    long long field_28;
    char padding_30[116];
    unsigned int field_a4;
    char field_a8;
    char padding_a9[39];
    long long field_d0;
} st_ab3f3c_2;

typedef struct st_ab3f3c_0 {
    char padding_0[40];
    struct st_ab3f3c_1 *field_28;
    struct st_ab3f3c_1 *field_30;
} st_ab3f3c_0;

typedef struct st_ab3f3c_1 {
    unsigned long long field_0;
} st_ab3f3c_1;


unsigned long long sub_ab3f3c(long long a0, long long a1, unsigned long a2, st_ab3f3c_2 *a3, int a4)
{
    unsigned long long v5;  // x19
    long long v6;  // x26
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long v19;  // cc_op
    unsigned long long v20;  // 4110
    unsigned long long v7;  // x0
    unsigned long long v21;  // 4102
    long long v22;  // x1
    unsigned long v23;  // x28
    unsigned long long v24;  // x0
    unsigned long long v25;  // x2
    long long v26;  // x1
    unsigned int v8;  // w0
    unsigned long long v27;  // x0
    unsigned long long v9;  // 4135
    unsigned long v10;  // x8
    unsigned long long v11;  // x20
    unsigned long long v12;  // x0
    unsigned long long v13;  // x21
    unsigned long long v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x70]
    unsigned long long v2;  // [bp-0x64]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = 0;
    v5 = sub_9dddcc(a3->field_8);
    if (v5)
    {
        sub_9de064(v5);
        v6 = sub_9de208(v5);
        v7 = sub_9de208(v5);
        v8 = sub_9e46a8(a3->field_28);
        v9 = arm64g_calculate_condition(177, v8, 7, 0);
        v10 = (v9 & 1 ? v8 + 14 : v8 + 7);
        v11 = (int)((unsigned int)v10) >> 3;
        v12 = sub_a6bf4c((long long)(v10 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v10, 61) & 0xe00000001fffffff & 0x1fffffff, "crypto/rsa/rsa_ossl.c", 334);
        v13 = v12;
        if (v7)
        {
            v17 = arm64g_calculate_condition(v19 | 16, v14, v15, v16);
            v18 = arm64g_calculate_condition(4, (v17 & 1 ? v12 : 0x40000000), 0, 0);
            if (!(v18 & 1))
                goto LABEL_ab3fe0;
        }
        else
        {
            v20 = arm64g_calculate_condition(v19 | 16, v14, v15, v16);
            v21 = arm64g_calculate_condition(0, (v20 & 1 ? v12 : 0x40000000), 0, 0);
            if (!(v21 & 1))
            {
LABEL_ab3fe0:
                switch (a4)
                {
                case 5:
                    if ((int)sub_aba388(v13, v11, a1, a0) >= 1 && sub_9e4db0(v13, v11, v6))
                    {
                        if (!(sub_9e53a8(v6, a3->field_28) >> 31 & 1))
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/rsa/rsa_ossl.c", 360, "rsa_ossl_private_encrypt");
                            v22 = 132;
                            goto LABEL_ab40d0;
                        }
                        v23 = a3->field_a4;
                        if (!(v23 >> 1 & 1))
                        {
LABEL_ab414c:
                            if (v23 >> 7 & 1)
                            {
                                v1 = 0;
                                goto LABEL_ab41e0;
                            }
                            v24 = sub_ab51e0(a3, &v2, v5);
                            if (v24)
                            {
                                if (v2)
                                {
                                    v25 = 0;
                                    goto LABEL_ab41c4;
                                }
                                v25 = sub_9de208(v5);
                                if (v25)
                                {
LABEL_ab41c4:
                                    v1 = v25;
                                    if (sub_ab52c4(v24, v6))
                                    {
                                        v23 = a3->field_a4;
LABEL_ab41e0:
                                        if (v23 >> 5 & 1 || a3->field_10 == 1 || *(long long *)&a3->padding_30[16] && *(long long *)&a3->padding_30[24] && *(long long *)&a3->padding_30[32] && *(long long *)&a3->padding_30[40] && *(long long *)&a3->padding_30[48])
                                            a3->field_18->field_28();
                                        v27 = sub_9e4958();
                                        if (v27)
                                        {
                                            if (*(long long *)&a3->padding_30[8])
                                            {
                                                v0 = v27;
                                                sub_9e5cb4();
                                                a3->field_18->field_30();
                                            }
                                            sub_a368c8();
                                            sub_a369bc("crypto/rsa/rsa_ossl.c", 396, "rsa_ossl_private_encrypt");
                                            sub_a36abc(4, 179, 0);
                                            sub_9e48d4(v27);
                                            break;
                                        }
                                        else
                                        {
                                            sub_a368c8();
                                            v26 = 392;
                                            goto LABEL_ab4334;
                                        }
                                    }
                                }
                                else
                                {
                                    sub_a368c8();
                                    v26 = 379;
LABEL_ab4334:
                                    sub_a369bc("crypto/rsa/rsa_ossl.c", v26, "rsa_ossl_private_encrypt");
                                    v22 = 524291;
LABEL_ab40d0:
                                    sub_a36abc(4, v22, 0);
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/rsa/rsa_ossl.c", 372, "rsa_ossl_private_encrypt");
                                v22 = 786691;
                                goto LABEL_ab40d0;
                            }
                        }
                        else if (sub_9e6fac(&a3->field_a8, a3->field_d0, a3->field_28, v5))
                        {
                            v23 = a3->field_a4;
                            goto LABEL_ab414c;
                        }
                    }
                    break;
                case 3:
                    break;
                case 1:
                    break;
                default:
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_ossl.c", 349, "rsa_ossl_private_encrypt");
                    v22 = 118;
                    goto LABEL_ab40d0;
                }
            }
        }
    }
    else
    {
        v11 = 0;
        v13 = 0;
    }
    sub_9de17c(v5);
    sub_9dded4(v5);
    sub_a6c4e8(v13, (int)v11, "crypto/rsa/rsa_ossl.c", 434);
    return 0xffffffff;
}
