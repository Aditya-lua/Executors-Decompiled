/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb56024..0xb5609c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b56024(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(0x1108, "providers/implementations/ciphers/cipher_blowfish.c", 52);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 128, 64, 0, 1, 0x100, sub_b562f8(128), a0);
    return v2;
}
