/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9647c8..0x964a04 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9647c8(unsigned long long a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x0
    unsigned long long v4;  // x19
    unsigned long v5;  // x9
    unsigned long long v6;  // x0
    unsigned long long v7;  // x8
    unsigned long long v8;  // x21
    long long v9;  // x22
    unsigned long v10;  // x8
    long long v11;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = a0;
        v3 = sub_9d3c1c(sub_9d82cc());
        if (v3)
        {
            v4 = v3;
            if ((int)sub_9d46fc() <= 0)
            {
                sub_a368c8();
                sub_a369bc("ssl/ssl_rsa.c", 188, "SSL_use_PrivateKey_file");
                v9 = 524290;
            }
            else if (a2 == 2)
            {
                v8 = sub_af94c4(v4, 0, *(long long *)*(long long *)(v2 + 8), *(long long *)(*(long long *)(v2 + 8) + 1136));
                v9 = 524301;
                if (v8)
                {
LABEL_96496c:
                    v10 = *(int *)v2;
                    if ((unsigned int)v10)
                    {
                        if (!(v10 >> 7 & 1))
                        {
                            v2 = 0;
                        }
                        else
                        {
                            v2 = sub_980dc8(v2);
                            if (v2)
                                goto LABEL_9649cc;
                        }
                    }
                    else
                    {
LABEL_9649cc:
                        v2 = sub_9646f4(*(long long *)(v2 + 2176), v8, *(long long *)(v2 + 8));
                    }
                    sub_a5a4c8(v8);
                    sub_9d3c28(v4);
                    return v2;
                }
                goto LABEL_96487c;
            }
            else if (a2 == 1)
            {
                if (!v2)
                {
                    sub_9d3c28(v4);
                    return v2;
                }
                v5 = *(int *)v2;
                v6 = v4;
                v7 = v2;
                if ((unsigned int)v5 && (!(v5 >> 7 & 1) || !(v7 = sub_980dc8(v2), v6 = v4, v7)))
                {
                    sub_9d3c28(v6);
                    return 0;
                }
                v8 = sub_a9e430(v6, 0, *(long long *)(v7 + 5400), *(long long *)(v7 + 5408), *(long long *)*(long long *)(v2 + 8), *(long long *)(*(long long *)(v2 + 8) + 1136));
                v9 = 524297;
                if (v8)
                    goto LABEL_96496c;
LABEL_96487c:
                sub_a368c8();
                sub_a369bc("ssl/ssl_rsa.c", 212, "SSL_use_PrivateKey_file");
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/ssl_rsa.c", 208, "SSL_use_PrivateKey_file");
                v9 = 124;
            }
            sub_a36abc(20, v9, 0);
            sub_9d3c28(v4);
            return 0;
        }
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 183, "SSL_use_PrivateKey_file");
        v11 = 524295;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 177, "SSL_use_PrivateKey_file");
        v11 = 786690;
    }
    sub_a36abc(20, v11, 0);
    sub_9d3c28(0);
    return 0;
}
