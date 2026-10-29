/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb082f4..0xb08378 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b082f4_0 {
    char padding_0[120];
    struct st_b082f4_0 *field_78;
    struct st_b082f4_0 *field_80;
    long long field_88;
} st_b082f4_0;


st_b082f4_0 * sub_b082f4(st_b082f4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b082f4_0 *v8;  // x0
    st_b082f4_0 *v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a6dac4();
    if (v8 && v8->field_78 && (int)v8->field_80)
    {
        v9 = sub_a6dac4(v8->field_78, v8->field_88, "providers/implementations/ciphers/cipher_chacha20_poly1305.c", 72);
        v8->field_78 = v9;
        if (!v9)
        {
            sub_a6c2e4(v8, "providers/implementations/ciphers/cipher_chacha20_poly1305.c", 74);
            v8 = 0;
        }
    }
    return v8;
}
