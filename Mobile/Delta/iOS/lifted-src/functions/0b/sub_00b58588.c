/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb58588..0xb58604 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b58588_0 {
    char padding_0[448];
    long long field_1c0;
} st_b58588_0;


st_b58588_0 * sub_b58588(void)
{
    st_b58588_0 *v2;  // x0
    st_b58588_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(456, "providers/implementations/ciphers/cipher_rc2.c", 295);
    if (!v2)
        return v2;
    v3 = v2;
    sub_b5c5bc(v3, 128, 8, 64, 3, 0x100, sub_b586b0(128), 0);
    v3->field_1c0 = 128;
    return v3;
}
