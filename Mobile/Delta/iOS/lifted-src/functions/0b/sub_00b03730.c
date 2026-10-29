/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb03730..0xb037b0 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b03730_0 {
    char padding_0[872];
    unsigned long long field_368;
} st_b03730_0;


st_b03730_0 * sub_b03730(void)
{
    st_b03730_0 *v2;  // x0
    st_b03730_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(944, "providers/implementations/ciphers/cipher_aes_ocb.c", 312);
    if (!v2)
        return v2;
    v3 = v2;
    sub_b5c5bc(v3, 128, 128, 96, "RL\"", 3, sub_b03978(128), 0);
    v3->field_368 = 16;
    return v3;
}
