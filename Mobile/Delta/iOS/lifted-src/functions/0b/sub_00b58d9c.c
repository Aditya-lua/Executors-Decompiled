/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb58d9c..0xb58f64 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b58d9c_3 {
    char padding_0[72];
    unsigned long long field_48;
    unsigned long long field_50;
    char padding_58[80];
    struct st_b58d9c_1 *field_a8;
} st_b58d9c_3;

typedef struct st_b58d9c_1 {
    char padding_0[24];
    struct st_b58d9c_2 *field_18;
    struct st_b58d9c_2 *field_20;
} st_b58d9c_1;

typedef struct st_b58d9c_2 {
    unsigned long long field_0;
} st_b58d9c_2;

typedef struct st_b58d9c_0 {
    struct st_b58d9c_0 *field_0;
    unsigned int field_8;
} st_b58d9c_0;


st_b58d9c_0 * sub_b58d9c(st_b58d9c_3 *a0, st_b58d9c_0 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    long long v9;  // x19
    long long v10;  // x20
    st_b58d9c_0 *v11;  // x0
    st_b58d9c_0 *v12;  // x0
    unsigned long v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a1)
        return 1;
    v1 = v6;
    v2 = v7;
    v3 = &v5;
    v4 = v8;
    if (!a1->field_0)
        return 1;
    if (!sub_a6fbc4(a1, "keylen"))
    {
LABEL_b58df0:
        if (sub_a6fbc4(a1, "ivlen"))
        {
            if (sub_a70ef8())
            {
                if (a0->field_50 == v0)
                    goto LABEL_b58e20;
                v9 = 109;
                v10 = 178;
            }
            else
            {
                v9 = 103;
                v10 = 174;
            }
        }
        else
        {
LABEL_b58e20:
            v11 = sub_a6fbc4(a1, "tlsaad");
            if (v11)
            {
                if (v11->field_8 == 5)
                    a0->field_a8->field_18();
                v9 = 103;
                v10 = 186;
            }
            else
            {
                v12 = sub_a6fbc4(a1, "mackey");
                if (v12)
                {
                    if (v12->field_8 == 5)
                        a0->field_a8->field_20();
                    v9 = 103;
                    v10 = 199;
                }
                else
                {
                    if (sub_a6fbc4(a1, "tls-version"))
                    {
                        if (sub_a6ffcc())
                            return 1;
                        v9 = 103;
                        v10 = 207;
                    }
                    else
                    {
                        return 1;
                    }
                }
            }
        }
    }
    else if (sub_a70ef8())
    {
        if (a0->field_48 == v0)
            goto LABEL_b58df0;
        v9 = 105;
        v10 = 166;
    }
    else
    {
        v9 = 103;
        v10 = 162;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/cipher_rc4_hmac_md5.c", v10, "rc4_hmac_md5_set_ctx_params");
    sub_a36abc(57, v9, 0);
    return 0;
}
