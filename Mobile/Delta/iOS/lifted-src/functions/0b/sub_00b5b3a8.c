/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b3a8..0xb5b580 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b5b3a8(long long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    long long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4() && !sub_a70210())
    {
        v2 = 0x33;
    }
    else if (sub_a6fbc4(a0, "aead") && !sub_a6fe3c())
    {
        v2 = 57;
    }
    else if (sub_a6fbc4(a0, "custom-iv") && !sub_a6fe3c())
    {
        v2 = 63;
    }
    else if (sub_a6fbc4(a0, "cts") && !sub_a6fe3c())
    {
        v2 = 69;
    }
    else if (sub_a6fbc4(a0, "tls-multi") && !sub_a6fe3c())
    {
        v2 = 75;
    }
    else if (sub_a6fbc4(a0, "has-randkey") && !sub_a6fe3c())
    {
        v2 = 81;
    }
    else if (sub_a6fbc4(a0, "keylen") && !sub_a70efc())
    {
        v2 = 86;
    }
    else if (!sub_a6fbc4(a0, "blocksize") || sub_a70efc())
    {
        if (!sub_a6fbc4(a0, "ivlen") || sub_a70efc())
            return 1;
        v2 = 96;
    }
    else
    {
        v2 = 91;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/ciphercommon.c", v2, "ossl_cipher_generic_get_params");
    sub_a36abc(57, 104, 0);
    return 0;
}
