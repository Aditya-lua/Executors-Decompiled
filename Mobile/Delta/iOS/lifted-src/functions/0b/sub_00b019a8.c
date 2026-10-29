/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb019a8..0xb01a18 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b019a8_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
} st_b019a8_0;


st_b019a8_0 * sub_b019a8(long long a0)
{
    st_b019a8_0 *v2;  // x0
    st_b019a8_0 *v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(448, "providers/implementations/ciphers/cipher_aes_gcm_siv.c", 0x22);
    if (!v2)
        return v2;
    v2[1].field_8 = 32;
    v3 = v2;
    v3->field_8 = sub_b01b5c(0x100);
    v3->field_18 = sub_9f2aec(a0);
    v3->field_20 = a0;
    return v3;
}
