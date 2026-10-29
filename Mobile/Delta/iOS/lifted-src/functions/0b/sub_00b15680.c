/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb15680..0xb15bbc (1340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b15680_1 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    unsigned long long field_48;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
} st_b15680_1;

typedef struct st_b15680_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
} st_b15680_0;

extern long long g_b15c4c;
extern st_b15680_0 g_ed8f60;
extern st_b15680_0 g_ed8f80;
extern st_b15680_0 g_ed8fa0;
extern st_b15680_0 g_ed8fc0;
extern st_b15680_0 g_ed8fe0;
extern st_b15680_0 g_ed9000;
extern st_b15680_0 g_ed9020;
extern st_b15680_0 g_ed9040;
extern st_b15680_0 g_ed9060;
extern st_b15680_0 g_ed9080;
extern st_b15680_0 g_ed90a0;
extern st_b15680_0 g_ed90c0;
extern st_b15680_0 g_ed90e0;
extern st_b15680_0 g_ed9100;
extern st_b15680_0 g_ed9120;
extern st_b15680_0 g_ed9140;
extern st_b15680_0 g_ed9160;
extern st_b15680_0 g_ed9180;
extern char g_10002b0;

unsigned long long sub_b15680(long long *a0, unsigned long a1, unsigned long long a2, unsigned long long *a3, long long a4, long long a5, long long a6)
{
    unsigned long long v13;  // x0
    unsigned long long v14;  // w0
    unsigned long long v15;  // x20
    st_b15680_0 *v16;  // x27
    unsigned long v17;  // x26
    unsigned long v18;  // x25
    st_b15680_1 *iter;  // x21
    long long v20;  // x0
    uint128_t v0;  // [bp-0x180]
    uint128_t v1;  // [bp-0x170]
    unsigned long v2;  // [bp-0x160]
    unsigned int v3;  // [bp-0x154], Other Possible Types: unsigned long long
    unsigned long long v4;  // [bp-0x150]
    unsigned long long v5;  // [bp-0x148]
    unsigned long long v6;  // [bp-0x140]
    unsigned long long v7;  // [bp-0x138]
    char v8;  // [bp-0x130]
    char v9;  // [bp-0x108]
    unsigned long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 0;
    v3 = 0;
    v13 = sub_afd760(*a0);
    if (v13)
    {
        v14 = (unsigned int)sub_a9d2ac();
        sub_9d3c28(v13);
        if (v14 >= 1)
        {
            if (_strlen(v6) < 11 || !(v0 = CONCAT(a6, a5), !sub_a9cc1c(v6, &v8) || !sub_a9c9fc(&v8, v5, &v4, &g_b15c4c, &v0)))
            {
                if (!_strcmp(v7, "ENCRYPTED PRIVATE KEY"))
                {
                    v16 = &g_ed8f60.padding_0[0];
                    if (!(a2 & 1))
                        goto LABEL_b158f4;
                    goto LABEL_b15920;
                }
                if (!_strcmp(v7, "PRIVATE KEY"))
                {
                    v16 = &g_ed8f80.padding_0[0];
                    if (!(a2 & 1))
                    {
LABEL_b158f4:
                        v17 = v16->field_10;
                        v18 = v16->field_18;
                        if (sub_a6e200(a0 + 1, "EncryptedPrivateKeyInfo") && sub_a6e200(a0 + 1, "PrivateKeyInfo"))
                            goto LABEL_b1596c;
                    }
LABEL_b15920:
                    v15 = sub_b14c7c(v5, v4, a2, a3, a4, a5, a6, sub_9f2aec(*a0), a0 + 5);
                    goto LABEL_b15b40;
                }
                if (_strcmp(v7, "PUBLIC KEY"))
                {
                    if (!_strcmp(v7, "DH PARAMETERS"))
                    {
                        v16 = &g_ed8fc0.padding_0[0];
                    }
                    else if (!_strcmp(v7, "X9.42 DH PARAMETERS"))
                    {
                        v16 = &g_ed8fe0.padding_0[0];
                    }
                    else if (!_strcmp(v7, "DSA PRIVATE KEY"))
                    {
                        v16 = &g_ed9000.padding_0[0];
                    }
                    else if (!_strcmp(v7, "DSA PUBLIC KEY"))
                    {
                        v16 = &g_ed9020.padding_0[0];
                    }
                    else if (!_strcmp(v7, "DSA PARAMETERS"))
                    {
                        v16 = &g_ed9040.padding_0[0];
                    }
                    else if (!_strcmp(v7, "EC PRIVATE KEY"))
                    {
                        v16 = &g_ed9060.padding_0[0];
                    }
                    else if (!_strcmp(v7, "EC PARAMETERS"))
                    {
                        v16 = &g_ed9080.padding_0[0];
                    }
                    else if (!_strcmp(v7, "SM2 PRIVATE KEY"))
                    {
                        v16 = &g_ed90a0.padding_0[0];
                    }
                    else if (!_strcmp(v7, "SM2 PARAMETERS"))
                    {
                        v16 = &g_ed90c0.padding_0[0];
                    }
                    else if (!_strcmp(v7, "RSA PRIVATE KEY"))
                    {
                        v16 = &g_ed90e0.padding_0[0];
                    }
                    else if (!_strcmp(v7, "RSA PUBLIC KEY"))
                    {
                        v16 = &g_ed9100.padding_0[0];
                    }
                    else if (!_strcmp(v7, "CERTIFICATE"))
                    {
                        v16 = &g_ed9120.padding_0[0];
                    }
                    else if (!_strcmp(v7, "TRUSTED CERTIFICATE"))
                    {
                        v16 = &g_ed9140.padding_0[0];
                    }
                    else if (!_strcmp(v7, "X509 CERTIFICATE"))
                    {
                        v16 = &g_ed9160.padding_0[0];
                    }
                    else if (_strcmp(v7, "X509 CRL"))
                    {
                        v15 = 1;
                        goto LABEL_b15b44;
                    }
                    else
                    {
                        v16 = &g_ed9180.padding_0[0];
                    }
                    v17 = v16->field_10;
                    v18 = v16->field_18;
LABEL_b15a70:
                    v3 = v16->field_8;
                    iter = &v8;
                    if (v17)
                    {
                        iter = &v9;
                        sub_a71618("data-type", v17, 0);
                    }
                    if (v18)
                    {
                        sub_a71618("data-structure", v18, 0);
                        iter->field_0 = v0;
                        iter->field_10 = v1;
                        iter->field_20 = v2;
                        iter = &(&iter->field_20)[1];
                    }
                    sub_a71670("data", v5, v4);
                    iter->field_20 = v2;
                    iter->field_0 = v0;
                    iter->field_10 = v1;
                    v20 = sub_a6ffac("type", &v3);
                    *(uint128_t *)&(&iter->field_20)[1] = v0;
                    *(uint128_t *)((char *)&iter->field_28 + 8) = v1;
                    *(unsigned long *)((char *)&iter->field_38 + 8) = v2;
                    sub_a71bbc(v20, &v3);
                    *(uint128_t *)&iter->field_48 = v0;
                    iter->field_50 = v1;
                    *(unsigned long *)&iter->field_60 = v2;
                    a3();
                }
                else
                {
                    v17 = 0;
                    v16 = &g_ed8fa0.padding_0[0];
                    v18 = "SubjectPublicKeyInfo";
LABEL_b1596c:
                    if (!(a2 >> 1 & 1) && sub_a6e200(a0 + 1, "SubjectPublicKeyInfo"))
                        goto LABEL_b15a70;
                    v15 = sub_b16098(v5, v4, a2, a3, a4, a5, a6, sub_9f2aec(*a0), a0 + 5);
LABEL_b15b40:
                }
            }
            else
            {
                v15 = 0;
            }
LABEL_b15b44:
            sub_a6c2e4(v7, "providers/implementations/encode_decode/decode_pem2der.c", 264);
            sub_a6c2e4(v6, "providers/implementations/encode_decode/decode_pem2der.c", 265);
            sub_a6c2e4(v5, "providers/implementations/encode_decode/decode_pem2der.c", 266);
            if (*(long long *)&g_10002b0 == v10)
                return v15;
            ___stack_chk_fail();
        }
    }
    if (*(long long *)&g_10002b0 == v10)
        return 1;
    ___stack_chk_fail();
}
