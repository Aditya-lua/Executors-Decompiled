/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e953c..0x9e986c (816 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_9e953c(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    long long v7;  // x19
    unsigned int v8;  // w0
    unsigned long long v17;  // w8
    unsigned long long v18;  // x28
    long long v20;  // x1
    unsigned long long v21;  // x23
    unsigned long long v9;  // 4132
    unsigned long long v10;  // x20
    long long v11;  // x0
    long long v12;  // x27
    unsigned long long v13;  // x21
    unsigned long long v14;  // x22
    unsigned long long v15;  // w23
    unsigned long long v16;  // x24
    unsigned long long v0;  // [bp-0x151]
    char v1;  // [bp-0x150]
    char v2;  // [bp-0xf0]
    char v3;  // [bp-0xb0]
    unsigned long v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v7 = sub_a3f728();
    v8 = sub_9e46a8(a1);
    v9 = arm64g_calculate_condition(177, v8, 7, 0);
    v10 = ((int)((v9 & 1 ? v8 + 14 : v8 + 7)) >> 3) + 1;
    v11 = sub_9de514(a5);
    if (v7)
    {
        v12 = v11;
        v13 = sub_a6bf4c(v10, "crypto/bn/bn_rand.c", 319);
        if (v13)
        {
            *(char *)v13 = 0xff;
            if (!(sub_9e5174(a2, &v1, 96) >> 31 & 1))
            {
                v14 = sub_a40ca8(v12, "SHA512", 0);
                if (v14)
                {
                    v15 = 0;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/bn/bn_rand.c", 338, "ossl_bn_gen_dsa_nonce_fixed_top");
                    v20 = 120;
                    goto LABEL_9e97cc;
                }
                while (1)
                {
                    v0 = 0;
                    if ((unsigned int)v10 >= 2)
                    {
                        v16 = 1;
                        do
                        {
                            if ((int)sub_aa845c(v12, &v3, 64, 0) < 1 || !sub_a3fe04(v7, v14, 0) || !sub_a3fe10(v7, &v0, 1) || !sub_a3fe10(v7, &v1, 96) || !sub_a3fe10(v7, a3, a4) || !sub_a3fe10(v7, &v3, 64) || !sub_a3ff7c(v7, &v2, 0))
                                goto LABEL_9e97d4;
                            v17 = (unsigned int)(v10 - v16);
                            if (v17 < 64)
                                v18 = v17;
                            else
                                v18 = 64;
                            _memcpy();
                            v16 += v18;
                            v0 += 1;
                        } while ((unsigned int)v16 < (unsigned int)v10);
                        goto LABEL_9e96ec;
                        goto LABEL_9e97d4;
                    }
                    else
                    {
LABEL_9e96ec:
                        if (!sub_9e4db0(v13, v10, a0))
                            goto LABEL_9e97d4;
                        sub_9e5d14(a0, 4);
                        sub_9e5778(a0, sub_9e46a8(a1));
                        if (sub_9e53a8(a0, a1) >> 31 & 1)
                        {
                            v21 = 1;
                            break;
                        }
                        v15 += 1;
                        if (v15 == 64)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/bn/bn_rand.c", 385, "ossl_bn_gen_dsa_nonce_fixed_top");
                            v20 = 786691;
LABEL_9e97cc:
                            sub_a36abc(3, v20, 0);
LABEL_9e97d4:
                            v21 = 0;
                            break;
                        }
                    }
                }
                goto LABEL_9e97d8;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/bn/bn_rand.c", 332, "ossl_bn_gen_dsa_nonce_fixed_top");
                sub_a36abc(3, 117, 0);
            }
        }
    }
    else
    {
        v13 = 0;
    }
    v21 = 0;
    v14 = 0;
LABEL_9e97d8:
    sub_a3f73c(v7);
    sub_a3f52c(v14);
    sub_a6c4e8(v13, v10, "crypto/bn/bn_rand.c", 390);
    sub_a66ec0(&v2, 64);
    sub_a66ec0(&v3, 64);
    sub_a66ec0(&v1, 96);
    if (*(long long *)&g_10002b0 == v4)
        return v21;
    ___stack_chk_fail();
}
