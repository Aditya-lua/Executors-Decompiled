/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb00400..0xb00478 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b00400(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(448, "providers/implementations/ciphers/cipher_aes.c", 0x55);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 128, 8, 128, 3, 0, sub_b02824(128), a0);
    return v2;
}
