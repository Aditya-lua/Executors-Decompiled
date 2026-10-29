/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5950c..0xb59584 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b5950c(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(320, "providers/implementations/ciphers/cipher_seed.c", 52);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 128, 128, 128, 2, 0, sub_b596bc(128), a0);
    return v2;
}
