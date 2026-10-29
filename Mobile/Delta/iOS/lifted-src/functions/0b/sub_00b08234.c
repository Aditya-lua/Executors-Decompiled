/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb08234..0xb082b8 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b08234(void)
{
    unsigned long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(848, "providers/implementations/ciphers/cipher_chacha20_poly1305.c", 46);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 0x100, 8, 96, 0, 3, sub_b08a84(0x100), 0);
    *(unsigned long *)(v2 + 832) = 0xffffffffffffffff;
    sub_b07a7c(v2 + 192);
    return v2;
}
