/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x964ccc..0x964ea8 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_964ccc(long long *a0, long long a1, unsigned int a2)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x21
    long long v5;  // x22
    long long v6;  // x0
    long long v7;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = sub_9d3c1c(sub_9d82cc());
        if (v2)
        {
            v3 = v2;
            if ((int)sub_9d46fc() <= 0)
            {
                sub_a368c8();
                sub_a369bc("ssl/ssl_rsa.c", 411, "SSL_CTX_use_PrivateKey_file");
                v5 = 524290;
            }
            else if (a2 == 2)
            {
                v4 = sub_af94c4(v3, 0, *a0, a0[142]);
                v5 = 524301;
                if (v4)
                    goto LABEL_964d50;
LABEL_964e34:
                sub_a368c8();
                sub_a369bc("ssl/ssl_rsa.c", 428, "SSL_CTX_use_PrivateKey_file");
            }
            else if (a2 == 1)
            {
                v4 = sub_a9e430(v3, 0, a0[23], a0[24], *a0, a0[142]);
                v5 = 524297;
                if (!v4)
                    goto LABEL_964e34;
LABEL_964d50:
                v6 = sub_9646f4(a0[43], v4, a0);
                sub_a5a4c8(v4);
                goto LABEL_964e8c;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/ssl_rsa.c", 424, "SSL_CTX_use_PrivateKey_file");
                v5 = 124;
            }
            sub_a36abc(20, v5, 0);
            v6 = 0;
LABEL_964e8c:
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 406, "SSL_CTX_use_PrivateKey_file");
            v7 = 524295;
LABEL_964dcc:
            sub_a36abc(20, v7, 0);
            v6 = 0;
            v3 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 400, "SSL_CTX_use_PrivateKey_file");
        v7 = 786690;
        goto LABEL_964dcc;
    }
    sub_9d3c28(v3);
    return v6;
}
