/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb047e0..0xb04894 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b047e0_1 {
    char padding_0[72];
    struct st_b047e0_0 *field_48;
} st_b047e0_1;

typedef struct st_b047e0_0 {
    struct st_b047e0_0 *field_0;
} st_b047e0_0;


st_b047e0_0 ** sub_b047e0(st_b047e0_1 *a0, st_b047e0_0 **a1)
{
    long long v3;  // x19
    long long v4;  // x20
    st_b047e0_0 **v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!a1 || !*a1 || !sub_a6fbc4(a1, "keylen"))
        return 1;
    if (sub_a70ef8())
    {
        if (a0->field_48 == v0)
            return 1;
        v3 = 105;
        v4 = 278;
    }
    else
    {
        v3 = 103;
        v4 = 274;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/cipher_aes_wrp.c", v4, "aes_wrap_set_ctx_params");
    sub_a36abc(57, v3, 0);
    return 0;
    return 1;
}
