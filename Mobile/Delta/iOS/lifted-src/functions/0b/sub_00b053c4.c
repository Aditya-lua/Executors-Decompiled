/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb053c4..0xb05468 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b053c4_1 {
    char padding_0[72];
    unsigned long long field_48;
} st_b053c4_1;

typedef struct st_b053c4_0 {
    struct st_b053c4_0 *field_0;
} st_b053c4_0;


st_b053c4_0 ** sub_b053c4(st_b053c4_1 *a0, st_b053c4_0 **a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
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
        if (!sub_a6fbc4(a1, "keylen"))
            return 1;
        if (!sub_a70ef8())
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_xts.c", 268, "aes_xts_set_ctx_params");
            sub_a36abc(57, 103, 0);
        }
        else if (v0 == a0->field_48)
        {
            return 1;
        }
        return 0;
    }
    else
    {
        return 1;
    }
}
