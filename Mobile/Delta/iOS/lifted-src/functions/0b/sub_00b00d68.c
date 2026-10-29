/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb00d68..0xb00dd0 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b00d68(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(960, "providers/implementations/ciphers/cipher_aes_gcm.c", 30);
    if (!v2)
        return v2;
    sub_b5d6f4(a0, v2, 0x100, sub_b0102c(0x100));
    return v2;
}
