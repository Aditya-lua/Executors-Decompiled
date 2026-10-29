/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb00948..0xb009a8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b00948(void)
{
    unsigned long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(416, "providers/implementations/ciphers/cipher_aes_ccm.c", 30);
    if (!v2)
        return v2;
    sub_b5d514(v2, 192, sub_b00ae0(192));
    return v2;
}
