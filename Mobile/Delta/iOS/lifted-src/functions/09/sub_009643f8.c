/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9643f8..0x9644d0 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9643f8(unsigned int *a0, unsigned long long a1)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = *a0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
        {
            return 0;
        }
        else if (!sub_980dc8())
        {
            return 0;
        }
    }
    if (a1)
    {
        v3 = sub_96ca2c();
        if ((unsigned int)v3 != 1)
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 47, "SSL_use_certificate");
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 41, "SSL_use_certificate");
        v3 = 786690;
    }
    sub_a36abc(20, v3, 0);
    return 0;
}
