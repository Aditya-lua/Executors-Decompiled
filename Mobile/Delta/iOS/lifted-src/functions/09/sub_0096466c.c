/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96466c..0x9646f4 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_96466c(unsigned int *a0, unsigned long long a1)
{
    unsigned long v2;  // x8
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
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 163, "SSL_use_PrivateKey");
        sub_a36abc(20, 0xc0102, 0);
        return 0;
    }
}
