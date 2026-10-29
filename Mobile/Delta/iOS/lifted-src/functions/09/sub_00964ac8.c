/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x964ac8..0x964ccc (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_964ac8(long long *a0, long long a1, unsigned int a2)
{
    long long v3;  // x19
    long long v4;  // x0
    long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 319, "SSL_CTX_use_certificate_file");
        sub_a36abc(20, 0xc0102, 0);
        sub_afc404(v0);
        sub_9d3c28(0);
        return 0;
    }
    v3 = sub_9d3c1c(sub_9d82cc());
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 325, "SSL_CTX_use_certificate_file");
        goto LABEL_964bf8;
    }
    if ((int)sub_9d46fc(v3, 108, 3, a1) > 0)
    {
        v0 = sub_afc484(*a0, a0[142]);
        if (!v0)
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 336, "SSL_CTX_use_certificate_file");
        }
        else if (a2 == 1)
        {
            if (sub_a9e448(v3, &v0, a0[23], a0[24]))
            {
LABEL_964b58:
                v4 = sub_964a04(a0, v0);
                sub_afc404(v0);
                sub_9d3c28(v3);
                return v4;
            }
            goto LABEL_964c7c;
        }
        else if (a2 == 2)
        {
            if (sub_af92c0(v3, &v0))
                goto LABEL_964b58;
LABEL_964c7c:
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 351, "SSL_CTX_use_certificate_file");
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 347, "SSL_CTX_use_certificate_file");
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 330, "SSL_CTX_use_certificate_file");
LABEL_964bf8:
    }
    sub_a36abc(20);
    sub_afc404(v0);
    sub_9d3c28(v3);
    return 0;
}
