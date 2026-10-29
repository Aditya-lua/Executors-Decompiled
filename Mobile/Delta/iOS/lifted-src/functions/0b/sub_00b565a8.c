/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb565a8..0xb56620 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b565a8(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(328, "providers/implementations/ciphers/cipher_cast5.c", 53);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 128, 64, 0, 1, 0x100, sub_b5687c(128), a0);
    return v2;
}
