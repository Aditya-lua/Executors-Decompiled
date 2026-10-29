/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab3884..0xab3b94 (784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab3884_2 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    struct st_ab3884_0 *field_18;
    char padding_20[8];
    long long field_28;
    long long field_30;
    char padding_38[108];
    char field_a4;
    char padding_a5[3];
    char field_a8;
    char padding_a9[39];
    long long field_d0;
} st_ab3884_2;

typedef struct st_ab3884_0 {
    char padding_0[48];
    struct st_ab3884_1 *field_30;
} st_ab3884_0;

typedef struct st_ab3884_1 {
    unsigned long long field_0;
} st_ab3884_1;


unsigned long long sub_ab3884(long long a0, long long a1, unsigned long a2, st_ab3884_2 *a3, long long a4)
{
    long long v3;  // x1
    long long v4;  // x1
    unsigned long long v5;  // x19
    unsigned long long v6;  // x0
    unsigned int v7;  // w0
    unsigned long long v8;  // 4135
    unsigned long v9;  // x8
    unsigned long long v10;  // x20
    unsigned long long v11;  // x21
    long long v12;  // w0
    long long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if ((int)sub_9e46a8(a3->field_28) > 0x4000)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ossl.c", 108, "rsa_ossl_public_encrypt");
        v3 = 105;
    }
    else
    {
        if ((int)sub_9e53a8(a3->field_28, a3->field_30) <= 0)
        {
            sub_a368c8();
            v4 = 113;
        }
        else if ((int)sub_9e46a8(a3->field_28) >= 3073 && (int)sub_9e46a8(a3->field_30) >= 65)
        {
            sub_a368c8();
            v4 = 120;
        }
        else
        {
            v5 = sub_9dddcc(a3->field_8);
            if (!v5)
            {
                v10 = 0;
                v11 = 0;
                goto LABEL_ab3a18;
            }
            sub_9de064(v5);
            v0 = sub_9de208(v5);
            v6 = sub_9de208(v5);
            v7 = sub_9e46a8(a3->field_28);
            v8 = arm64g_calculate_condition(177, v7, 7, 0);
            v9 = (v8 & 1 ? v7 + 14 : v7 + 7);
            v10 = (int)((unsigned int)v9) >> 3;
            v11 = sub_a6bf4c((long long)(v9 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v9, 61) & 0xe00000001fffffff & 0x1fffffff, "crypto/rsa/rsa_ossl.c", 131);
            if (!v6 || !v11)
            {
LABEL_ab3a1c:
                sub_9de17c(v5);
                sub_9dded4(v5);
                sub_a6c4e8(v11, (int)v10, "crypto/rsa/rsa_ossl.c", 214);
                return 0xffffffff;
            }
            switch (a4)
            {
            case 4:
                v12 = (unsigned int)sub_ab2acc(a3->field_8, v11, v10, a1, a0, 0, 0, 0, 0);
            case 3:
                v12 = (unsigned int)sub_ab2a3c(v11, v10, a1, a0);
                break;
            case 1:
                v12 = (unsigned int)sub_ab58ec(a3->field_8, v11, v10, a1, a0);
                break;
            default:
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_ossl.c", 149, "rsa_ossl_public_encrypt");
                sub_a36abc(4, 118, 0);
                goto LABEL_ab3a1c;
            }
            if (v12 >= 1 && sub_9e4db0(v11, v10, v0))
            {
                if (!(sub_9e53a8(v0, a3->field_28) >> 31 & 1))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_ossl.c", 192, "rsa_ossl_public_encrypt");
                    sub_a36abc(4, 132, 0);
                }
                else if (!(a3->field_a4 >> 1 & 1) || sub_9e6fac(&a3->field_a8, a3->field_d0, a3->field_28, v5))
                {
                    a3->field_18->field_30();
                }
            }
LABEL_ab3a18:
            goto LABEL_ab3a1c;
        }
        sub_a369bc("crypto/rsa/rsa_ossl.c", v4, "rsa_ossl_public_encrypt");
        v3 = 101;
    }
    sub_a36abc(4, v3, 0);
    return 0xffffffff;
}
