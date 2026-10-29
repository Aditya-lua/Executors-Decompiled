/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb04bb4..0xb04c38 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b04bb4_0 {
    char padding_0[80];
    unsigned long long field_50;
    char padding_58[20];
    char field_6c;
} st_b04bb4_0;


st_b04bb4_0 * sub_b04bb4(void)
{
    st_b04bb4_0 *v2;  // x0
    st_b04bb4_0 *v3;  // x0
    char v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(448, "providers/implementations/ciphers/cipher_aes_wrp.c", 58);
    if (!v2)
        return v2;
    sub_b5c5bc();
    v3 = v2;
    v4 = v3->field_6c & 254;
    if (v3->field_50 == 4)
        v4 += 1;
    v3->field_6c = v4;
    return v3;
}
