/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb58948..0xb589bc (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b58948(void)
{
    unsigned long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(456, "providers/implementations/ciphers/cipher_rc4.c", 117);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 40, 8, 0, 0, 0x100, sub_b59398(40), 0);
    return v2;
}
