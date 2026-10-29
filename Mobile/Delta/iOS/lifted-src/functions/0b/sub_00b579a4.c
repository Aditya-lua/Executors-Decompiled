/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb579a4..0xb57a1c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b579a4(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(408, "providers/implementations/ciphers/cipher_idea.c", 57);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 128, 8, 64, 3, 0, sub_b57a4c(128), a0);
    return v2;
}
