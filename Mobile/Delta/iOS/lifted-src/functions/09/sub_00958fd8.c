/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958fd8..0x959298 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_959298;
extern long long g_9592a8;

long long sub_958fd8(long long a0, long long a1, long long a2)
{
    long long v3;  // x22
    long long v4;  // x19
    long long v5;  // x20
    long long v6;  // x21
    long long v7;  // x23
    long long v8;  // x1
    long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v4 = sub_9d3c1c(sub_9d82cc());
    v0 = 0;
    v5 = sub_a66520(sub_a66530(&g_959298, &g_9592a8), " ", "@", " ", "@");
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_cert.c", 760, "SSL_load_client_CA_file_ex");
        sub_a36abc(20, 0xc0102, 0);
        goto LABEL_9591f4;
    }
    if (!v5)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_cert.c", 764, "SSL_load_client_CA_file_ex");
        v8 = 524303;
        goto LABEL_9591e8;
    }
    if (v4)
    {
        v0 = sub_afc484(a1, a2);
        if (v0)
        {
            if ((int)sub_9d46fc(v4, 108, 3, v3) < 1)
                goto LABEL_9591f0;
            v6 = sub_a68148(a1);
            if (sub_a9e448(v4, &v0, 0, 0))
            {
                v7 = 0;
                v3 = 0;
                do
                {
                    if (v3 || !(v3 = sub_ad61b4(), !v3))
                    {
                        if (sub_ab1c50(v0))
                        {
                            v7 = sub_afa39c();
                            if (!v7)
                                goto LABEL_9591fc;
                            if (sub_a66b6c(v5, v7))
                            {
                                sub_afa390(v7);
                                v7 = 0;
                                continue;
                            }
                            else
                            {
                                sub_a66794(v5, v7);
                                if (sub_ad68a0(v3, v7))
                                    goto LABEL_9590f4;
                                else
                                    goto LABEL_9591fc;
                            }
                        }
                        else
                        {
                            v7 = 0;
                            goto LABEL_9591fc;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/ssl_cert.c", 788, "SSL_load_client_CA_file_ex");
                        sub_a36abc(20, 0x8000f, 0);
                        goto LABEL_9591fc;
                    }
LABEL_9590f4:
                } while (sub_a9e448(v4, &v0, 0, 0));
                goto LABEL_959218;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_cert.c", 774, "SSL_load_client_CA_file_ex");
            v8 = 524299;
LABEL_9591e4:
LABEL_9591e8:
            sub_a36abc(20, v8, 0);
LABEL_9591f0:
            v3 = 0;
LABEL_9591f4:
            v7 = 0;
            v6 = 0;
LABEL_9591fc:
            sub_afa390(v7);
            sub_ad6958(v3, sub_afa390);
        }
        v3 = 0;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_cert.c", 0x300, "SSL_load_client_CA_file_ex");
        v8 = 524320;
        goto LABEL_9591e4;
    }
LABEL_959218:
    sub_a68148(v6);
    sub_9d3c28(v4);
    sub_afc404(v0);
    sub_a66664(v5);
    if (!v3)
        return v3;
    sub_a35af4();
    return v3;
}
