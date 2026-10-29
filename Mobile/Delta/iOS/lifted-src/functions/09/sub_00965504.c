/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x965504..0x965930 (1068 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_965504(char *a0, char *a1)
{
    char *v7;  // x19
    char *v8;  // x28
    unsigned long v17;  // x10
    char *v18;  // x26
    char *v19;  // x0
    char *v20;  // x8
    char *v21;  // x9
    long long v22;  // x1
    long long v23;  // x1
    char *v24;  // x21
    long long v25;  // x1
    long long v26;  // x1
    char *v9;  // x20
    char *v10;  // x24
    char *v11;  // x25
    unsigned long long v12;  // x26
    char *v13;  // w0
    char *v14;  // x8
    unsigned long v15;  // x10
    char *v16;  // x9
    uint128_t v0;  // [bp-0x90]
    char *v1;  // [bp-0x80]
    char *v2;  // [bp-0x78]
    char *v3;  // [bp-0x70]
    char *v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v3 = 0;
    v4 = 0;
    v1 = 0;
    v2 = 0;
    if (a0 && a1)
    {
        v7 = sub_9d3c1c(sub_9d82cc());
        if (!v7)
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 887, "SSL_CTX_use_serverinfo_file");
            v26 = 524295;
            goto LABEL_965798;
        }
        else if ((int)sub_9d46fc(v7, 108, 3, a1) >= 1)
        {
            if (sub_a9d2ac(v7, &v2, &v1, &v4, &v3))
            {
                v8 = 0;
                v9 = 0;
                v10 = 0;
                v0 = 0xd0010000;
                do
                {
                    v11 = v2;
                    v12 = _strlen(v11) & 0xffffffff;
                    if (v12 <= 14)
                    {
                        sub_a368c8();
                        v23 = 913;
                        goto LABEL_96587c;
                    }
                    v13 = (char *)(unsigned int)_strncmp(v11, "SERVERINFO FOR ", 15);
                    if (v13)
                    {
                        if (v12 <= 16)
                        {
                            sub_a368c8();
                            v23 = 920;
LABEL_96587c:
                            sub_a369bc("ssl/ssl_rsa.c", v23, "SSL_CTX_use_serverinfo_file");
                            v25 = 392;
                            goto LABEL_9658b0;
                        }
                        if (_strncmp(v11, "SERVERINFOV2 FOR ", 0x11))
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/ssl_rsa.c", 924, "SSL_CTX_use_serverinfo_file");
                            v25 = 391;
LABEL_9658b0:
                            sub_a36abc(20, v25, 0);
                            goto LABEL_9658b8;
                        }
                        v14 = v3;
                        if (v14 >= 8 && !(v15 = *(short *)&v4[6], ((unsigned int)((v15 & 0xff00) >> 8) | (unsigned int)v15 * 0x100 & 0xff00ff00) != v14 - 8))
                        {
                            v16 = 0;
                        }
                        else
                        {
                            sub_a368c8();
                            v22 = 945;
                            goto LABEL_965854;
                        }
                    }
                    else
                    {
                        v14 = v3;
                        if (v14 >= 4 && !(v17 = *(short *)&v4[2], ((unsigned int)((v17 & 0xff00) >> 8) | (unsigned int)v17 * 0x100 & 0xff00ff00) != v14 - 4))
                        {
                            v16 = 4;
                        }
                        else
                        {
                            sub_a368c8();
                            v22 = 937;
LABEL_965854:
                            sub_a369bc("ssl/ssl_rsa.c", v22, "SSL_CTX_use_serverinfo_file");
                            v25 = 390;
                            goto LABEL_9658b0;
                        }
                    }
                    v18 = v16 + v10 + v14;
                    v19 = sub_a6c1b4(v9, v18, "ssl/ssl_rsa.c", 951);
                    if (!v19)
                        goto LABEL_9658b8;
                    v9 = v19;
                    v20 = v19 + v10;
                    if (v13)
                    {
                        v21 = 0;
                    }
                    else
                    {
                        *(unsigned int *)v20 = v0;
                        v21 = 4;
                    }
                    _memcpy(v20 + v21);
                    sub_a6c2e4(v2, "ssl/ssl_rsa.c", 959);
                    v2 = 0;
                    sub_a6c2e4(v1, "ssl/ssl_rsa.c", 961);
                    v1 = 0;
                    sub_a6c2e4(v4, "ssl/ssl_rsa.c", 963);
                    v4 = 0;
                    v8 -= 1;
                    v10 = v18;
                } while (sub_a9d2ac(v7, &v2, &v1, &v4, &v3));
                if (v8)
                {
                    v24 = sub_96522c(a0, 2, v9, v18);
                    goto LABEL_9657dc;
                }
            }
            else
            {
                v9 = 0;
            }
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 905, "SSL_CTX_use_serverinfo_file");
            sub_a36abc(20, 389, 0);
            v24 = 0;
LABEL_9657dc:
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 891, "SSL_CTX_use_serverinfo_file");
            v26 = 524290;
LABEL_965798:
            sub_a36abc(20, v26, 0);
            v9 = 0;
LABEL_9658b8:
            v24 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 881, "SSL_CTX_use_serverinfo_file");
        sub_a36abc(20, 0xc0102, 0);
        v9 = 0;
        v24 = 0;
        v7 = 0;
    }
    sub_a6c2e4(v2, "ssl/ssl_rsa.c", 971);
    sub_a6c2e4(v1, "ssl/ssl_rsa.c", 972);
    sub_a6c2e4(v4, "ssl/ssl_rsa.c", 973);
    sub_a6c2e4(v9, "ssl/ssl_rsa.c", 974);
    sub_9d3c28(v7);
    return v24;
}
