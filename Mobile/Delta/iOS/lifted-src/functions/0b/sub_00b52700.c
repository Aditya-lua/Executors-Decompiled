/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb52700..0xb52b80 (1152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b52700_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[8];
    long long field_20;
    char padding_28[8];
    unsigned int field_30;
    char padding_34[52];
    unsigned int field_68;
    char padding_6c[4];
    long long field_70;
    char padding_78[56];
    unsigned int field_b0;
    unsigned int field_b4;
    char padding_b8[16];
    struct st_b52700_1 *field_c8;
} st_b52700_0;

typedef struct st_b52700_1 {
    char field_0;
} st_b52700_1;


unsigned long long sub_b52700(st_b52700_0 *a0, unsigned long long a1, unsigned long long *a2, unsigned long a3, long long a4, unsigned long long n)
{
    unsigned int v7;  // w0
    unsigned long long v8;  // x0
    unsigned int v17;  // w8
    char v18;  // x0
    unsigned long long v19;  // 4118
    unsigned long v20;  // x8
    unsigned long long v21;  // 4118
    unsigned long long v22;  // x0
    unsigned long long v9;  // x26
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long v12;  // x25
    unsigned long long v13;  // x2
    long long v14;  // x1
    unsigned long long v15;  // w0
    long long v16;  // x1
    unsigned long v0;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long v1;  // [bp-0x68], Other Possible Types: unsigned long long
    unsigned int v2;  // [bp-0x5c]
    char v3;  // [bp-0x58]
    char v4;  // [bp-0x54]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = sub_aafbcc(a0->field_10);
    if (a0->field_20)
    {
        v8 = sub_a50ac8(a0->field_20);
        v9 = (unsigned int)v8 & ~((int)((unsigned int)v8) >> 31);
        v10 = sub_a2f9e0(v8);
        if (!(unsigned int)v10)
            return v10;
    }
    else
    {
        v9 = 0;
        v11 = sub_a2f9e0(0);
        if (!(unsigned int)v11)
            return v11;
    }
    v12 = v7;
    if (!a1)
    {
        *a2 = v12;
        return 1;
    }
    if (v12 > a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/rsa_sig.c", 693, "rsa_sign_directly");
        v0 = a3;
        v1 = v12;
        v13 = "is %zu, should be at least %zu";
        v14 = 179;
    }
    else
    {
        if (!v9)
        {
            v15 = (unsigned int)sub_aafc00(n, a4, a1, a0->field_10, a0->field_68);
            goto LABEL_b52828;
        }
        if (v9 != n)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/rsa_sig.c", 700, "rsa_sign_directly");
            v14 = 166;
            goto LABEL_b5288c;
        }
        if (sub_a509f4(a0->field_20, "MDC2"))
        {
            if (a0->field_68 != 1)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 709, "rsa_sign_directly");
                v13 = "only PKCS#1 padding supported with MDC2";
                goto LABEL_b52a20;
            }
            if ((int)sub_ab8d0c(0, a4, n, a1, &v4, a0->field_10) > 0)
            {
                v15 = v4;
                goto LABEL_b52828;
            }
            else
            {
                sub_a368c8();
                v16 = 717;
                goto LABEL_b5287c;
            }
        }
        switch (v17)
        {
        case 1:
            if ((int)sub_ab8fe0(a0->field_30, a4, n, a1, &v3, a0->field_10) >= 1)
            {
                v15 = v3;
                goto LABEL_b52828;
            }
            else
            {
                sub_a368c8();
                v16 = 748;
                goto LABEL_b5287c;
            }
        case 6:
            v19 = arm64g_calculate_condition(1, a0->field_b4, 1, 0);
            if (!(v19 & 1))
            {
                v20 = a0->field_b0;
                v21 = arm64g_calculate_condition(0x11, v20 & 0xffffffff, 1, 0);
                if (!(v21 & 1))
                {
                    if ((int)a0->field_b4 > (int)sub_a50ac8(a0->field_20))
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/signature/rsa_sig.c", 762, "rsa_sign_directly");
                        v22 = sub_a50ac8(a0->field_20);
                        v0 = a0->field_b4;
                        v1 = v22;
                        v13 = "minimum salt length set to %d, but the digest only gives %d";
                        goto LABEL_b52af4;
                    }
                    else
                    {
                        v20 = a0->field_b0;
                    }
                }
                if (v20 >> 31 & 1 || (int)a0->field_b4 <= (int)v20)
                    goto LABEL_b52b00;
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 774, "rsa_sign_directly");
                v0 = a0->field_b4;
                v1 = a0->field_b0;
                v13 = "minimum salt length set to %d, but theactual salt length is only set to %d";
LABEL_b52af4:
                v14 = 172;
                break;
            }
            else
            {
LABEL_b52b00:
                if (!sub_b52b80(a0))
                    return 0;
                v2 = a0->field_b0;
                if (sub_ab87ac(a0->field_10, a0->field_c8, a4, a0->field_20, a0->field_70, &v2))
                {
                    sub_aafbcc(a0->field_10);
LABEL_b52b4c:
                    v15 = (unsigned int)sub_aafc00();
                    sub_b52bd8(a0);
                }
                else
                {
                    sub_a368c8();
                    v16 = 792;
LABEL_b5287c:
                    sub_a369bc("providers/implementations/signature/rsa_sig.c", v16, "rsa_sign_directly");
                    v14 = 524292;
                    goto LABEL_b5288c;
                }
LABEL_b52828:
                if (v15 > 0)
                {
                    *a2 = v15;
                    return 1;
                }
                sub_a368c8();
                v16 = 818;
                goto LABEL_b5287c;
                goto LABEL_b5287c;
            }
        case 5:
            if (sub_aafbcc(a0->field_10) > n)
            {
                if (sub_b52b80(a0))
                {
                    _memcpy(a0->field_c8, a4, n);
                    v18 = sub_aba5a8(a0->field_30);
                    *(char *)&a0->field_c8[n] = v18;
                    goto LABEL_b52b4c;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/rsa_sig.c", 733, "rsa_sign_directly");
                    v14 = 524345;
                }
LABEL_b5288c:
                v13 = 0;
                break;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 727, "rsa_sign_directly");
                v0 = sub_aafbcc(a0->field_10);
                v1 = n + 1;
                v13 = "RSA key size = %d, expected minimum = %d";
                v14 = 171;
                break;
            }
        default:
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/rsa_sig.c", 805, "rsa_sign_directly");
            v13 = "Only X.931, PKCS#1 v1.5 or PSS padding allowed";
LABEL_b52a20:
            v14 = 168;
            break;
        }
    }
    sub_a36abc(57, v14, v13);
    return 0;
}
