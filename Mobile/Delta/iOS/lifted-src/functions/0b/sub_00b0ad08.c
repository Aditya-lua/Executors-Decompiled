/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0ad08..0xb0adf8 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0ad08_1 {
    char padding_0[448];
    struct st_b0ad08_0 *field_1c0;
} st_b0ad08_1;

typedef struct st_b0ad08_0 {
    struct st_b0ad08_0 *field_0;
    unsigned int field_8;
} st_b0ad08_0;


st_b0ad08_0 * sub_b0ad08(st_b0ad08_1 *a0, st_b0ad08_0 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_b0ad08_0 *v9;  // x0
    long long v10;  // x19
    long long v11;  // x20
    st_b0ad08_0 *v12;  // w8
    st_b0ad08_0 *v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a1)
    {
        return 1;
    }
    else if (a1->field_0)
    {
        v1 = v6;
        v2 = v7;
        v3 = &v5;
        v4 = v8;
        v9 = sub_a6fbc4(a1, "xts_standard");
        if (!v9)
            return 1;
        v0 = 0;
        if (v9->field_8 != 4)
        {
LABEL_b0adcc:
            return 0;
        }
        if (sub_a71bcc())
        {
            if (!sub_a6e200(v0, "GB"))
            {
                v12 = (st_b0ad08_0 *)0;
            }
            else if (sub_a6e200(v0, "IEEE"))
            {
                v10 = 104;
                v11 = 235;
                goto LABEL_b0ada0;
            }
            else
            {
                v12 = (st_b0ad08_0 *)1;
            }
            *(unsigned int *)&a0->field_1c0 = (unsigned int)v12;
            return 1;
        }
        v10 = 103;
        v11 = 227;
LABEL_b0ada0:
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_sm4_xts.c", v11, "sm4_xts_set_ctx_params");
        sub_a36abc(57, v10, 0);
        goto LABEL_b0adcc;
    }
    else
    {
        return 1;
    }
}
