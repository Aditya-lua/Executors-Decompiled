/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb01464..0xb0154c (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b01464_1 {
    char padding_0[16];
    struct st_b01464_0 *field_10;
    char padding_18[16];
    long long field_28;
} st_b01464_1;

typedef struct st_b01464_0 {
    struct st_b01464_0 *field_0;
    char padding_8[8];
    struct st_b01464_0 *field_10;
    char padding_18[16];
    unsigned long long field_28;
} st_b01464_0;


st_b01464_0 * sub_b01464(st_b01464_0 **a0)
{
    st_b01464_0 *v2;  // x0
    st_b01464_0 *v3;  // x8
    st_b01464_1 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0() && a0[1])
    {
        v2 = sub_a6dac4(a0, 448, "providers/implementations/ciphers/cipher_aes_gcm_siv.c", 67);
        if (!v2)
            return v2;
        v2->field_10 = 0;
        v2->field_0 = 0;
        if (!a0[2] || !(v3 = sub_a6dac4(a0[2], v2->field_28 + 15 & 0xfffffffffffffff0, "providers/implementations/ciphers/cipher_aes_gcm_siv.c", 75), v4 = v2, v4->field_10 = v3, !v3))
            a0[1]->field_10();
        sub_a6c4e8(0, v4->field_28, "providers/implementations/ciphers/cipher_aes_gcm_siv.c", 0x55);
        sub_a6c2e4(v4, "providers/implementations/ciphers/cipher_aes_gcm_siv.c", 86);
    }
    return 0;
}
