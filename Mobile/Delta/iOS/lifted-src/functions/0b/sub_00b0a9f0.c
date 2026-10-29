/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0a9f0..0xb0aa54 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b0a9f0(void)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(504, "providers/implementations/ciphers/cipher_sm4_xts.c", 80);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 0x100, 8, 128, 0x10001, 2, sub_b0af00(0x100), 0);
    return v2;
}
