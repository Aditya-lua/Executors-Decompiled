/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab4384..0xab4904 (1408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab4384_2 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[4];
    struct st_ab4384_0 *field_18;
    char padding_20[8];
    long long field_28;
    char padding_30[116];
    unsigned int field_a4;
    char field_a8;
    char padding_a9[39];
    long long field_d0;
} st_ab4384_2;

typedef struct st_ab4384_0 {
    char padding_0[40];
    struct st_ab4384_1 *field_28;
    struct st_ab4384_1 *field_30;
} st_ab4384_0;

typedef struct st_ab4384_1 {
    unsigned long long field_0;
} st_ab4384_1;

extern char g_10002b0;

unsigned long long sub_ab4384(unsigned long long a0, long long a1, unsigned long a2, st_ab4384_2 *a3, unsigned int a4)
{
    unsigned long long v10;  // x19
    long long v11;  // x27
    unsigned long long v20;  // x2
    long long v21;  // x1
    unsigned long long v22;  // x0
    unsigned int v12;  // w0
    unsigned long long v13;  // 4135
    unsigned long v14;  // x8
    unsigned long long v15;  // w20
    unsigned long long v16;  // x0
    long long v17;  // x1
    unsigned long v18;  // x8
    unsigned long long v19;  // x0
    unsigned long long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0xa0]
    unsigned int v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x94]
    unsigned long long v5;  // [bp-0x90]
    unsigned long long v6;  // [bp-0x80]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v5 = 0;
    v6 = 0;
    v4 = 0;
    v10 = sub_9dddcc();
    if (v10)
    {
        sub_9de064(v10);
        v11 = sub_9de208(v10);
        if (!sub_9de208(v10))
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_ossl.c", 552, "rsa_ossl_private_decrypt");
            sub_a36abc(4, 0x80003, 0);
            goto LABEL_ab44b4;
        }
        v12 = sub_9e46a8(a3->field_28);
        v13 = arm64g_calculate_condition(177, v12, 7, 0);
        v14 = (v13 & 1 ? v12 + 14 : v12 + 7);
        v15 = (int)((unsigned int)v14) >> 3;
        v16 = sub_a6bf4c((long long)(v14 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v14, 61) & 0xe00000001fffffff & 0x1fffffff, "crypto/rsa/rsa_ossl.c", 556);
        if (v16)
        {
            if ((int)a0 > v15)
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_ossl.c", 565, "rsa_ossl_private_decrypt");
                v17 = 108;
                goto LABEL_ab4538;
            }
            if ((int)a0 <= 0)
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_ossl.c", 570, "rsa_ossl_private_decrypt");
                v17 = 111;
                goto LABEL_ab4538;
            }
            if (sub_9e4db0(a1, a0, v11))
            {
                if (!(sub_9e53a8(v11, a3->field_28) >> 31 & 1))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_ossl.c", 609, "rsa_ossl_private_decrypt");
                    v17 = 132;
                    goto LABEL_ab4538;
                }
                v18 = a3->field_a4;
                if (!(v18 >> 1 & 1))
                {
LABEL_ab45cc:
                    v3 = v18;
                    if (v18 >> 7 & 1)
                    {
                        v1 = 0;
                        v2 = 0;
                        goto LABEL_ab465c;
                    }
                    v19 = sub_ab51e0(a3, &v4, v10);
                    if (v19)
                    {
                        v2 = v19;
                        if (v4)
                        {
                            v20 = 0;
                            goto LABEL_ab4644;
                        }
                        v20 = sub_9de208(v10);
                        if (v20)
                        {
LABEL_ab4644:
                            v1 = v20;
                            if (sub_ab52c4())
                            {
                                v18 = a3->field_a4;
LABEL_ab465c:
                                if (v18 >> 5 & 1 || a3->field_10 == 1 || *(long long *)&a3->padding_30[16] && *(long long *)&a3->padding_30[24] && *(long long *)&a3->padding_30[32] && *(long long *)&a3->padding_30[40] && *(long long *)&a3->padding_30[48])
                                    a3->field_18->field_28();
                                v22 = sub_9e4958();
                                if (v22)
                                {
                                    if (*(long long *)&a3->padding_30[8])
                                    {
                                        v0 = v22;
                                        sub_9e5cb4();
                                        a3->field_18->field_30();
                                    }
                                    sub_a368c8();
                                    sub_a369bc("crypto/rsa/rsa_ossl.c", 646, "rsa_ossl_private_decrypt");
                                    sub_a36abc(4, 179, 0);
                                    sub_9e48d4(v22);
                                }
                                else
                                {
                                    sub_a368c8();
                                    v21 = 642;
                                    goto LABEL_ab4804;
                                }
                            }
                        }
                        else
                        {
                            sub_a368c8(v2);
                            v21 = 628;
LABEL_ab4804:
                            sub_a369bc("crypto/rsa/rsa_ossl.c", v21, "rsa_ossl_private_decrypt");
                            v17 = 524291;
LABEL_ab4538:
                            sub_a36abc(4, v17, 0);
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/rsa/rsa_ossl.c", 621, "rsa_ossl_private_decrypt");
                        v17 = 786691;
                        goto LABEL_ab4538;
                    }
                }
                else if (sub_9e6fac(&a3->field_a8, a3->field_d0, a3->field_28, v10))
                {
                    v18 = a3->field_a4;
                    goto LABEL_ab45cc;
                }
            }
        }
    }
    else
    {
LABEL_ab44b4:
        v15 = 0;
        v16 = 0;
    }
    sub_9de17c(v10);
    sub_9dded4(v10);
    sub_a6c4e8(v16, v15, "crypto/rsa/rsa_ossl.c", 707);
    if (*(long long *)&g_10002b0 == v7)
        return 0xffffffff;
    ___stack_chk_fail();
}
