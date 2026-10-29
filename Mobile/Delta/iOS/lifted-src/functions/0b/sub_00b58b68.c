/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb58b68..0xb58bdc (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b58b68(void)
{
    unsigned long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(752, "providers/implementations/ciphers/cipher_rc4_hmac_md5.c", 55);
    if (!v2)
        return v2;
    sub_b5c5bc(v2, 128, 8, 0, 0, 0x101, sub_b58f70(128), 0);
    return v2;
}
