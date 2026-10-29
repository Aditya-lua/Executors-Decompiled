/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb583cc..0xb58448 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b583cc_0 {
    char padding_0[448];
    long long field_1c0;
} st_b583cc_0;


st_b583cc_0 * sub_b583cc(void)
{
    st_b583cc_0 *v2;  // x0
    st_b583cc_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(456, "providers/implementations/ciphers/cipher_rc2.c", 288);
    if (!v2)
        return v2;
    v3 = v2;
    sub_b5c5bc(v3, 40, 64, 64, 2, 0x100, sub_b5868c(40), 0);
    v3->field_1c0 = 40;
    return v3;
}
