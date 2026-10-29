/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb05158..0xb051cc (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b05158(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    long long v2;  // x19
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a5 > a3)
    {
        v2 = 106;
        v3 = 223;
    }
    else
    {
        if (sub_b051f8())
            return 1;
        v2 = 0x66;
        v3 = 228;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/cipher_aes_xts.c", v3, "aes_xts_stream_update");
    sub_a36abc(57, v2, 0);
    return 0;
}
