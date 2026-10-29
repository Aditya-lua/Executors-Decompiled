/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b654..0xb5b82c (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5b654_1 {
    char padding_0[88];
    struct st_b5b654_0 *field_58;
    char padding_60[12];
    char field_6c;
    char padding_6d[51];
    unsigned int field_a0;
} st_b5b654_1;

typedef struct st_b5b654_0 {
    struct st_b5b654_0 *field_0;
} st_b5b654_0;


st_b5b654_0 ** sub_b5b654(st_b5b654_1 *a0, st_b5b654_0 **a1)
{
    unsigned long long v8;  // x20
    unsigned long long v9;  // x19
    unsigned long long v10;  // x30
    char v11;  // x8
    long long v12;  // x1
    long long v13;  // x19
    unsigned int v0;  // [bp-0x2c]
    st_b5b654_0 **v1;  // [bp-0x28]
    st_b5b654_0 **v2;  // [bp-0x24]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (!a1)
        return 1;
    v3 = v8;
    v4 = v9;
    v5 = &v7;
    v6 = v10;
    if (!*a1)
        return 1;
    if (!sub_a6fbc4(a1, "padding"))
    {
LABEL_b5b6b0:
        if (sub_a6fbc4(a1, "use-bits"))
        {
            if (sub_a6ffcc())
            {
                a0->field_6c = a0->field_6c & 127 | (v1 != 0) * 128 & 128;
                goto LABEL_b5b6e8;
            }
            else
            {
                sub_a368c8();
                v12 = 667;
            }
        }
        else
        {
LABEL_b5b6e8:
            if (!sub_a6fbc4(a1, "tls-version") || sub_a6ffcc())
            {
                if (!sub_a6fbc4(a1, "tls-mac-size") || sub_a70ef8())
                {
                    if (sub_a6fbc4(a1, "num"))
                    {
                        if (sub_a6ffcc())
                        {
                            if (a0->field_58 && v0 >= (unsigned int)a0->field_58)
                            {
                                v13 = 695;
                            }
                            else
                            {
                                a0->field_a0 = v0;
                                return 1;
                            }
                        }
                        else
                        {
                            v13 = 691;
                        }
                        sub_a368c8();
                        v12 = v13;
                    }
                    else
                    {
                        return 1;
                    }
                }
                else
                {
                    sub_a368c8();
                    v12 = 682;
                }
            }
            else
            {
                sub_a368c8();
                v12 = 675;
            }
        }
    }
    else if (sub_a6ffcc())
    {
        v11 = a0->field_6c & 254;
        if (v2)
            v11 += 1;
        a0->field_6c = v11;
        goto LABEL_b5b6b0;
    }
    else
    {
        sub_a368c8();
        v12 = 657;
    }
    sub_a369bc("providers/implementations/ciphers/ciphercommon.c", v12, "ossl_cipher_generic_set_ctx_params");
    sub_a36abc(57, 103, 0);
    return 0;
}
