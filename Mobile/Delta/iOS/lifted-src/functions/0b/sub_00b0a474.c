/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0a474..0xb0a4dc (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b0a474(long long a0)
{
    unsigned long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(832, "providers/implementations/ciphers/cipher_sm4_gcm.c", 25);
    if (!v2)
        return v2;
    sub_b5d6f4(a0, v2, 128, sub_b0a544(128));
    return v2;
}
