/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb059ac..0xb05a24 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b059ac(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(472, "providers/implementations/ciphers/cipher_aria.c", 48);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 128, 128, 0, 1, 0, sub_b069b0(128), a0);
    return v2;
}
