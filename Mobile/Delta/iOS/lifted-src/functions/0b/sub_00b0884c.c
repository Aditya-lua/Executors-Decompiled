/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0884c..0xb08a78 (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0884c_0 {
    char padding_0[40];
    struct st_b0884c_1 *field_28;
    struct st_b0884c_1 *field_30;
} st_b0884c_0;

typedef struct st_b0884c_1 {
    unsigned long long field_0;
} st_b0884c_1;

typedef struct st_b0884c_2 {
    char padding_0[108];
    char field_6c;
    char padding_6d[59];
    struct st_b0884c_0 *field_a8;
    char padding_b0[588];
    char field_2fc;
    char padding_2fd[59];
    unsigned long long field_338;
} st_b0884c_2;


char sub_b0884c(st_b0884c_2 *a0, unsigned long a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long v18;  // x2
    unsigned long long v19;  // 4113
    char v20;  // x0
    char v21;  // x0
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_b0884c_2 *v13;  // x19
    st_b0884c_0 *v14;  // x21
    long long v15;  // x19
    long long v16;  // x20
    char idx;  // x0
    unsigned long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (!a1)
        return 1;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    if (!*(long long *)a1)
        return 1;
    v13 = a0;
    v14 = a0->field_a8;
    if (!sub_a6fbc4(a1, "keylen"))
    {
LABEL_b088a4:
        if (sub_a6fbc4(a1, "ivlen"))
        {
            if (sub_a70ef8())
            {
                if (v0 == 12)
                    goto LABEL_b088d0;
                v15 = 109;
                v16 = 203;
            }
            else
            {
                v15 = 103;
                v16 = 199;
            }
        }
        else
        {
LABEL_b088d0:
            idx = sub_a6fbc4(a1, "tag");
            if (idx)
            {
                if (*(int *)(idx + 8) == 5)
                {
                    v18 = *(long long *)(idx + 24);
                    v19 = arm64g_calculate_condition(0x22, *(long long *)(idx + 24) - 0x11, 16, 0);
                    if (!(v19 & 1))
                    {
                        v15 = 118;
                        v16 = 215;
                    }
                    else
                    {
                        if (*(long long *)(idx + 16))
                        {
                            if (!(v13->field_6c >> 1 & 1))
                            {
                                _memcpy(&v13->field_2fc);
                                v18 = *(long long *)(idx + 24);
                                goto LABEL_b0897c;
                            }
                            else
                            {
                                v15 = 120;
                                v16 = 220;
                            }
                        }
                        else
                        {
LABEL_b0897c:
                            v13->field_338 = v18;
                            goto LABEL_b08980;
                        }
                    }
                }
                else
                {
                    v15 = 103;
                    v16 = 211;
                }
            }
            else
            {
LABEL_b08980:
                v20 = sub_a6fbc4(a1, "tlsaad");
                if (v20)
                {
                    if (*(int *)(v20 + 8) == 5)
                        v14->field_28();
                    v15 = 103;
                    v16 = 231;
                }
                else
                {
                    v21 = sub_a6fbc4(a1, "tlsivfixed");
                    if (!v21)
                        return 1;
                    if (*(int *)(v21 + 8) == 5)
                        v14->field_30();
                    v15 = 103;
                    v16 = 245;
                }
            }
        }
    }
    else if (sub_a70ef8())
    {
        if (v0 == 32)
            goto LABEL_b088a4;
        v15 = 105;
        v16 = 192;
    }
    else
    {
        v15 = 103;
        v16 = 188;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/cipher_chacha20_poly1305.c", v16, "chacha20_poly1305_set_ctx_params");
    sub_a36abc(57, v15, 0);
    return 0;
}
