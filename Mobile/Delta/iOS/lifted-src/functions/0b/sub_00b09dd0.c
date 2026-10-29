/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb09dd0..0xb09e9c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b09dd0(unsigned long a0, long long a1)
{
    long long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "ivlen") && !sub_a70efc())
    {
        v2 = 130;
    }
    else if (!sub_a6fbc4(a1, "keylen") || sub_a70efc())
    {
        if (!sub_a6fbc4(a1, "tls-mac") || sub_a71800())
            return 1;
        v2 = 141;
    }
    else
    {
        v2 = 135;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/cipher_null.c", v2, "null_get_ctx_params");
    sub_a36abc(57, 104, 0);
    return 0;
}
