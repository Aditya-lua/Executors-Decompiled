/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb49c6c..0xb49d84 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b49c6c(long long *a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*a0)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/rands/drbg_hmac.c", 123, "ossl_drbg_hmac_init");
        sub_a36abc(57, 150, 0);
        return 0;
    }
    _bzero(a0 + 5, a0[4]);
    _memset(a0 + 13, 1, a0[4]);
    v2 = sub_b4a2fc(a0, 0, a1, a2, a3, a4, a5, a6);
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if (a4 || a2 || a6)
    {
        return sub_b4a2fc();
    }
    else
    {
        return 1;
    }
}
