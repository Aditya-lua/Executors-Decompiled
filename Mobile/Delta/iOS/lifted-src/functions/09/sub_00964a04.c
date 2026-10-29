/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x964a04..0x964ac8 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_964a04(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = sub_96ca2c(0, a0, a1, 1);
        if ((unsigned int)v2 != 1)
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 252, "SSL_CTX_use_certificate");
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 246, "SSL_CTX_use_certificate");
        v2 = 786690;
    }
    sub_a36abc(20, v2, 0);
    return 0;
}
