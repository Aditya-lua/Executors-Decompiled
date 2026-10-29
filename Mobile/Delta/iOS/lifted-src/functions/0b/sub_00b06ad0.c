/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb06ad0..0xb06b48 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b06ad0(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(472, "providers/implementations/ciphers/cipher_camellia.c", 50);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 0x100, 128, 0, 1, 0, sub_b07954(0x100), a0);
    return v2;
}
