/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb58cc4..0xb58d90 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b58cc4(unsigned long a0, long long a1)
{
    long long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "keylen") && !sub_a70efc())
    {
        v2 = 121;
    }
    else if (!sub_a6fbc4(a1, "ivlen") || sub_a70efc())
    {
        if (!sub_a6fbc4(a1, "tlsaadpad") || sub_a70efc())
            return 1;
        v2 = 132;
    }
    else
    {
        v2 = 127;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/cipher_rc4_hmac_md5.c", v2, "rc4_hmac_md5_get_ctx_params");
    sub_a36abc(57, 104, 0);
    return 0;
}
