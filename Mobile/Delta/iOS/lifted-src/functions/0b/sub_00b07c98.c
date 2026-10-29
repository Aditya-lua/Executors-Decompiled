/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb07c98..0xb07d0c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b07c98(void)
{
    unsigned long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(312, "providers/implementations/ciphers/cipher_chacha20.c", 52);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 0x100, 8, 128, 0, 2, sub_b07e9c(0x100), 0);
    return v2;
}
