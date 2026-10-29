/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5c6b4..0xb5c758 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b5c6b4(unsigned long a0, unsigned long long *a1, unsigned long a2, long long *a3, long long *a4)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!*a4)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (*a1 + *a4 <= a2)
    {
        _memcpy(a0 + *a1, *a3);
        *a1 = *a1 + *a4;
        *a4 = 0;
        return 1;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/ciphercommon_block.c", 70, "ossl_cipher_trailingdata");
    sub_a36abc(57, 0xc0103, 0);
    return 0;
}
