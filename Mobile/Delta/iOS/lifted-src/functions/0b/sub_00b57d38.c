/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb57d38..0xb57db4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b57d38_0 {
    char padding_0[448];
    long long field_1c0;
} st_b57d38_0;


st_b57d38_0 * sub_b57d38(void)
{
    st_b57d38_0 *v2;  // x0
    st_b57d38_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(456, "providers/implementations/ciphers/cipher_rc2.c", 284);
    if (!v2)
        return v2;
    v3 = v2;
    sub_b5c5bc(v3, 128, 64, 0, 1, 0x100, sub_b58698(128), 0);
    v3->field_1c0 = 128;
    return v3;
}
