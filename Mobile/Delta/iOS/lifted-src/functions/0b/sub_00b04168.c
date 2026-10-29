/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb04168..0xb041e8 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_b04168(long long a0)
{
    unsigned long long *v2;  // x0
    unsigned long long *v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(120, "providers/implementations/ciphers/cipher_aes_siv.c", 38);
    if (!v2)
        return v2;
    *(unsigned int *)v2 = 65540;
    v2[1] = 64;
    v2[2] = 16;
    v3 = v2;
    v3[13] = sub_b04204(0x200);
    v3[14] = sub_9f2aec(a0);
    return v3;
}
