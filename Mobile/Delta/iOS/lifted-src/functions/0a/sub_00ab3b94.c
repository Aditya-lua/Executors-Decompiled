/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab3b94..0xab3f3c (936 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab3b94_2 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    struct st_ab3b94_0 *field_18;
    char padding_20[8];
    long long field_28;
    long long field_30;
    char padding_38[108];
    char field_a4;
    char padding_a5[3];
    char field_a8;
    char padding_a9[39];
    long long field_d0;
} st_ab3b94_2;

typedef struct st_ab3b94_0 {
    char padding_0[48];
    struct st_ab3b94_1 *field_30;
} st_ab3b94_0;

typedef struct st_ab3b94_1 {
    unsigned long long field_0;
} st_ab3b94_1;


unsigned long long sub_ab3b94(unsigned long long a0, long long a1, unsigned long a2, st_ab3b94_2 *a3, unsigned long a4)
{
    long long v2;  // x1
    long long v3;  // x1
    unsigned long long v4;  // x19
    long long v5;  // x28
    unsigned int v6;  // w0
    unsigned long long v7;  // 4135
    unsigned long v8;  // x8
    unsigned long long v9;  // w20
    unsigned long long v10;  // x0
    long long v11;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)sub_9e46a8(a3->field_28) > 0x4000)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ossl.c", 721, "rsa_ossl_public_decrypt");
        v2 = 105;
    }
    else
    {
        if ((int)sub_9e53a8(a3->field_28, a3->field_30) <= 0)
        {
            sub_a368c8();
            v3 = 726;
        }
        else if ((int)sub_9e46a8(a3->field_28) >= 3073 && (int)sub_9e46a8(a3->field_30) >= 65)
        {
            sub_a368c8();
            v3 = 733;
        }
        else
        {
            v4 = sub_9dddcc(a3->field_8);
            if (v4)
            {
                sub_9de064(v4);
                v5 = sub_9de208(v4);
                if (!sub_9de208(v4))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_ossl.c", 744, "rsa_ossl_public_decrypt");
                    sub_a36abc(4, 0x80003, 0);
                    goto LABEL_ab3d44;
                }
                v6 = sub_9e46a8(a3->field_28);
                v7 = arm64g_calculate_condition(177, v6, 7, 0);
                v8 = (v7 & 1 ? v6 + 14 : v6 + 7);
                v9 = (int)((unsigned int)v8) >> 3;
                v10 = sub_a6bf4c((long long)(v8 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v8, 61) & 0xe00000001fffffff & 0x1fffffff, "crypto/rsa/rsa_ossl.c", 748);
                if (v10)
                {
                    if ((int)a0 > v9)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/rsa/rsa_ossl.c", 757, "rsa_ossl_public_decrypt");
                        v11 = 108;
                        goto LABEL_ab3d98;
                    }
                    else if (sub_9e4db0(a1, a0, v5))
                    {
                        if (!(sub_9e53a8(v5, a3->field_28) >> 31 & 1))
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/rsa/rsa_ossl.c", 765, "rsa_ossl_public_decrypt");
                            v11 = 132;
LABEL_ab3d98:
                            sub_a36abc(4, v11, 0);
                        }
                        else if (!(a3->field_a4 >> 1 & 1) || sub_9e6fac(&a3->field_a8, a3->field_d0, a3->field_28, v4))
                        {
                            a3->field_18->field_30();
                        }
                    }
                }
            }
            else
            {
LABEL_ab3d44:
                v9 = 0;
                v10 = 0;
            }
            sub_9de17c(v4);
            sub_9dded4(v4);
            sub_a6c4e8(v10, v9, "crypto/rsa/rsa_ossl.c", 807);
            return 0xffffffff;
        }
        sub_a369bc("crypto/rsa/rsa_ossl.c", v3, "rsa_ossl_public_decrypt");
        v2 = 101;
    }
    sub_a36abc(4, v2, 0);
    return 0xffffffff;
}
