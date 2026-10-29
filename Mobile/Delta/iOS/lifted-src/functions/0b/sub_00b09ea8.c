/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb09ea8..0xb09f20 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b09ea8(unsigned long a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "tls-mac-size") && !sub_a70ef8())
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_null.c", 168, "null_set_ctx_params");
        sub_a36abc(57, 103, 0);
        return 0;
    }
    return 1;
}
