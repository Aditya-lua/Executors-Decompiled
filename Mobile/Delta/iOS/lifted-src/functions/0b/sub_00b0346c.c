/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0346c..0xb0367c (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0346c_0 {
    char padding_0[72];
    unsigned long long field_48;
    unsigned long long field_50;
    char padding_58[20];
    char field_6c;
    char padding_6d[763];
    unsigned long long field_368;
} st_b0346c_0;


char sub_b0346c(st_b0346c_0 *a0, unsigned long a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    char v10;  // x0
    long long v11;  // x1
    long long v12;  // x1
    long long v13;  // x1
    unsigned long long v14;  // 4113
    long long v15;  // x19
    long long v16;  // x20
    unsigned long v0;  // [bp-0x30]
    unsigned long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a1)
        return 1;
    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    if (!*(long long *)a1)
        return 1;
    v10 = sub_a6fbc4(a1, "tag");
    if (v10)
    {
        if (*(int *)(v10 + 8) != 5)
        {
            sub_a368c8();
            v13 = 363;
            goto LABEL_b035f0;
        }
        if (!*(long long *)(v10 + 16))
        {
            if ((unsigned long long)*(long long *)(v10 + 24) >= 0x11)
            {
                sub_a368c8();
                v11 = 369;
                goto LABEL_b03654;
            }
            else
            {
                a0->field_368 = *(long long *)(v10 + 24);
                goto LABEL_b0355c;
            }
            goto LABEL_b0355c;
        }
        if (a0->field_6c >> 1 & 1)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", 375, "aes_ocb_set_ctx_params");
            v12 = 524550;
        }
        else if (*(long long *)(v10 + 24) == a0->field_368)
        {
            _memcpy(&a0[1].padding_0[16]);
            goto LABEL_b0355c;
        }
        else
        {
            sub_a368c8();
            v11 = 379;
LABEL_b03654:
            sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", v11, "aes_ocb_set_ctx_params");
            v12 = 118;
        }
    }
    else
    {
LABEL_b0355c:
        if (sub_a6fbc4(a1, "ivlen"))
        {
            if (sub_a70ef8())
            {
                v14 = arm64g_calculate_condition(50, v1 - 16, 15, 0);
                if (v14 & 1)
                {
                    return 0;
                }
                else if (a0->field_50 != v1)
                {
                    a0->field_50 = v1;
                    *(unsigned int *)&a0->padding_6d[755] = 0;
                    goto LABEL_b035a0;
                }
            }
            else
            {
                sub_a368c8();
                v13 = 388;
            }
LABEL_b035f0:
            sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", v13, "aes_ocb_set_ctx_params");
            v12 = 103;
        }
        else
        {
LABEL_b035a0:
            if (!sub_a6fbc4(a1, "keylen"))
                return 1;
            if (sub_a70ef8())
            {
                if (a0->field_48 == v0)
                    return 1;
                v15 = 105;
                v16 = 408;
            }
            else
            {
                v15 = 103;
                v16 = 404;
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", v16, "aes_ocb_set_ctx_params");
            v12 = v15;
        }
    }
    sub_a36abc(57, v12, 0);
    return 0;
}
