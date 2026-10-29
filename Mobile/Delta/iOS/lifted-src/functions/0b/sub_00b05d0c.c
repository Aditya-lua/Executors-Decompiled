/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb05d0c..0xb05d84 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b05d0c(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(472, "providers/implementations/ciphers/cipher_aria.c", 60);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 128, 8, 128, 4, 0, sub_b069bc(128), a0);
    return v2;
}
