/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b598..0xb5b654 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5b598_1 {
    struct st_b5b598_1 *field_0;
} st_b5b598_1;

typedef struct st_b5b598_0 {
    char padding_0[72];
    unsigned long long field_48;
    char padding_50[28];
    char field_6c;
} st_b5b598_0;


st_b5b598_1 ** sub_b5b598(st_b5b598_0 *a0, st_b5b598_1 **a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_b5b598_1 **v9;  // w0
    unsigned long v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a1)
    {
        return 1;
    }
    else if (*a1)
    {
        v1 = v6;
        v2 = v7;
        v3 = &v5;
        v4 = v8;
        v9 = (st_b5b598_1 **)(unsigned int)sub_b5b654();
        if (!v9)
            return v9;
        if (!sub_a6fbc4(a1, "keylen"))
            return 1;
        if (!sub_a70ef8())
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 129, "ossl_cipher_var_keylen_set_ctx_params");
            sub_a36abc(57, 103, 0);
            return 0;
        }
        else if (a0->field_48 != v0)
        {
            a0->field_48 = v0;
            a0->field_6c = a0->field_6c & 0xfffffff7;
        }
        return 1;
    }
    else
    {
        return 1;
    }
}
