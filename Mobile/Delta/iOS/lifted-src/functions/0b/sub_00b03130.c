/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb03130..0xb031b8 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b03130(long long a0)
{
    long long v2;  // x0
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bf4c(944, "providers/implementations/ciphers/cipher_aes_ocb.c", 340);
        if (!v2)
            return v2;
        _memcpy();
        v3 = v2;
        if (sub_a96a10(v3 + 688, a0 + 688, v3 + 192, v3 + 440))
            return v3;
        sub_a6c2e4(v3, "providers/implementations/ciphers/cipher_aes_ocb.c", 345);
    }
    return 0;
}
