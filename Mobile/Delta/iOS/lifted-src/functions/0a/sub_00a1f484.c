/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1f484..0xa1fa20 (1436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1f484_0 {
    char padding_0[80];
    long long field_50;
} st_a1f484_0;


char * sub_a1f484(long long a0, unsigned int a1, char *a2, char *a3, st_a1f484_0 *a4)
{
    char *v11;  // x27
    char *v12;  // x0
    unsigned long long v21;  // 4183
    unsigned long v22;  // x28
    char *v23;  // x22
    long long v24;  // x1
    char *v25;  // w28
    unsigned long long v26;  // 4106
    unsigned long long v27;  // 4106
    char *v28;  // w8
    char *v29;  // w22
    char *v30;  // w22
    char *v13;  // x19
    long long v31;  // x1
    long long v32;  // x1
    long long v33;  // x1
    char *v34;  // x21
    long long v35;  // x1
    char *v14;  // x0
    char *v15;  // x0
    char *v16;  // x21
    char *v17;  // x20
    char *v18;  // x0
    unsigned int v19;  // w0
    unsigned int v20;  // w20
    unsigned int v0;  // [bp-0xa4]
    char *v1;  // [bp-0xa0]
    char *v2;  // [bp-0x94]
    char *v3;  // [bp-0x90]
    char *v4;  // [bp-0x88]
    char *v5;  // [bp-0x80]
    char *v6;  // [bp-0x78]
    char *v7;  // [bp-0x70]
    char *v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = 0;
    v11 = sub_9ffdd0(a4);
    v12 = sub_962b90(a4);
    if (!v11)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 287, "ossl_ecdsa_simple_sign_sig");
        v35 = 786690;
    }
    else if (v12)
    {
        v7 = v12;
        if (sub_a19d04(a4))
        {
            v13 = sub_a1697c();
            if (!v13)
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ecdsa_ossl.c", 302, "ossl_ecdsa_simple_sign_sig");
                sub_a36abc(16, 0x8002a, 0);
                return v13;
            }
            v14 = sub_9e4958();
            *(char **)v13 = v14;
            v15 = sub_9e4958(v14);
            *(char **)&v13[8] = v15;
            if (!*(long long *)v13 || (v16 = v15, !v15))
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ecdsa_ossl.c", 308, "ossl_ecdsa_simple_sign_sig");
                sub_a36abc(16, 0x80003, 0);
                v34 = 0;
                v23 = 0;
                v17 = 0;
                goto LABEL_a1f840;
            }
            v17 = sub_9dddcc(a4->field_50);
            if (!v17 || (v5 = sub_9e4958(), !v5))
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ecdsa_ossl.c", 315, "ossl_ecdsa_simple_sign_sig");
                sub_a36abc(16, 0x80003, 0);
                v34 = 0;
                v23 = 0;
                goto LABEL_a1f840;
            }
            v18 = sub_c4ba8(v11);
            if (!v18)
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ecdsa_ossl.c", 320, "ossl_ecdsa_simple_sign_sig");
                sub_a36abc(16, 0x80010, 0);
                v34 = 0;
                v23 = v5;
                goto LABEL_a1f840;
            }
            v6 = v17;
            v3 = v18;
            v19 = sub_9e46a8();
            v20 = v19;
            v21 = arm64g_calculate_condition(177, v19, 7, 0);
            v22 = ((int)(a1 * 8) <= (int)v19 ? a1 : (int)((v21 & 1 ? v19 + 14 : v19 + 7)) >> 3);
            v23 = v5;
            if (!sub_9e4db0(a0, v22, v23))
            {
                sub_a368c8();
                v24 = 331;
                goto LABEL_a1f8f8;
            }
            v0 = v22;
            if ((int)((unsigned int)v22 * 8) <= (int)v20 || sub_9ea8ac(v23, v23, 8 - (v20 & 7)))
            {
                v1 = 0;
                if (a3)
                {
                    v25 = (char *)(!a2);
                    v26 = arm64g_calculate_condition(4, a3, 0, 0);
                    if (!(v26 & 1))
                        goto LABEL_a1f5be;
LABEL_a1f5bd:
                    v28 = (char *)0;
                }
                else
                {
                    v25 = (char *)1;
                    v27 = arm64g_calculate_condition(4, a3, 0, 0);
                    if (v27 & 1)
                        goto LABEL_a1f5bd;
LABEL_a1f5be:
                    v28 = (char *)(a2 != 0);
                }
                v2 = v28;
                v29 = (char *)10;
            }
            else
            {
                sub_a368c8();
                v24 = 336;
LABEL_a1f8f8:
                sub_a369bc("crypto/ec/ecdsa_ossl.c", v24, "ossl_ecdsa_simple_sign_sig");
                sub_a36abc(16, 0x80003, 0);
                v34 = 0;
                v17 = v6;
                goto LABEL_a1f840;
            }
            while (1)
            {
                v30 = v29;
                if (v25)
                {
                    if (sub_a1f024(a4, v6, &v8, v13, a0, v0, 0, 0, 0, 0))
                    {
                        v1 = v8;
                        v4 = v1;
                        goto LABEL_a1f61c;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ecdsa_ossl.c", 343, "ossl_ecdsa_simple_sign_sig");
                        sub_a36abc(16, 0x8002a, 0);
                        v34 = v8;
                        v23 = v5;
                        v17 = v6;
                        goto LABEL_a1f840;
                    }
                    goto LABEL_a1f840;
                }
                if (!sub_9e4c34(*(long long *)v13, a3))
                {
                    sub_a368c8();
                    v33 = 350;
LABEL_a1f9f8:
                    sub_a369bc("crypto/ec/ecdsa_ossl.c", v33, "ossl_ecdsa_simple_sign_sig");
                    v31 = 524291;
LABEL_a1fa08:
                    sub_a36abc(16, v31, 0);
                    v17 = v6;
LABEL_a1fa14:
                    v23 = v5;
                    v34 = v1;
LABEL_a1f840:
                    sub_a16990(v13);
                    v13 = 0;
                    goto LABEL_a1f84c;
                }
                v4 = a2;
LABEL_a1f61c:
                v17 = v6;
                if (!sub_9e6bf4(v16, *(long long *)v13, *(long long *)&v11[144], v17) || !sub_9e671c(v16, v16, v7, *(long long *)&v11[144], v17))
                {
                    sub_a368c8();
                    v32 = 364;
                    goto LABEL_a1f934;
                }
                if (!sub_9e5f3c(v16, v16, v5, v3))
                {
                    sub_a368c8();
                    v33 = 368;
                    goto LABEL_a1f9f8;
                }
                v17 = v6;
                if (!sub_9e6bf4(v16, v16, *(long long *)&v11[144], v17) || !sub_9e66ec(v16, v16, v4, *(long long *)&v11[144], v17))
                {
                    sub_a368c8();
                    v32 = 377;
LABEL_a1f934:
                    sub_a369bc("crypto/ec/ecdsa_ossl.c", v32, "ossl_ecdsa_simple_sign_sig");
                    sub_a36abc(16, 0x80003, 0);
                    goto LABEL_a1fa14;
                }
                if (!sub_9e4828(v16))
                    break;
                if (!v2)
                {
                    v29 = v30 - 1;
                    if (v30 == 1)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ecdsa_ossl.c", 392, "ossl_ecdsa_simple_sign_sig");
                        v31 = 176;
                        goto LABEL_a1fa08;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ecdsa_ossl.c", 387, "ossl_ecdsa_simple_sign_sig");
                    v31 = 157;
                    goto LABEL_a1fa08;
                }
            }
            v23 = v5;
            v17 = v6;
            v34 = v1;
LABEL_a1f84c:
            sub_9dded4(v17);
            sub_9e4838(v23);
            sub_9e4838(v34);
            return v13;
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 296, "ossl_ecdsa_simple_sign_sig");
        v35 = 159;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 291, "ossl_ecdsa_simple_sign_sig");
        v35 = 125;
    }
    sub_a36abc(16, v35, 0);
    return 0;
}
