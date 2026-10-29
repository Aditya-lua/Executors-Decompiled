/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0a1fc..0xb0a274 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b0a1fc(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(320, "providers/implementations/ciphers/cipher_sm4.c", 52);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 128, 8, 128, 3, 0, sub_b0a6f0(128), a0);
    return v2;
}
