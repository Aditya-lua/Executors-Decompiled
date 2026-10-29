/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa53488..0xa53588 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a53488_0 {
    long long field_0;
    char padding_8[32];
    struct st_a53488_1 *field_28;
} st_a53488_0;

typedef struct st_a53488_1 {
    unsigned long long field_0;
} st_a53488_1;


st_a53488_0 * sub_a53488(st_a53488_0 *a0)
{
    st_a53488_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = sub_a6bffc(16, "crypto/evp/kdf_lib.c", 30);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/kdf_lib.c", 0x22, "EVP_KDF_CTX_new");
        sub_a36abc(6, 0x80006, 0);
        sub_a6c2e4(v2, "crypto/evp/kdf_lib.c", 37);
        return 0;
    }
    sub_a79f54(a0->field_0);
    a0->field_28();
}
