/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9b94c..0xa9be54 (1288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7fffff;
extern unsigned long long g_9c9580;
extern unsigned long long g_af999c;
extern unsigned long long g_afc3ec;
extern unsigned long long g_afc51c;
extern char g_10002b0;

void* sub_a9b94c(long long a0, void* a1, long long a2, long long a3, long long a4, long long a5)
{
    long long v12;  // x25
    long long v13;  // x23
    unsigned long v22;  // x0
    void* v24;  // w0
    unsigned int v25;  // w8
    void* v26;  // x21
    void* v27;  // x1
    void* v14;  // x19
    void* v15;  // x21
    void* ptr;  // x0
    long long v17;  // x22
    void* v18;  // x25
    unsigned long long *v19;  // x23
    void* v20;  // x0
    void* v21;  // x0
    long long v0;  // [bp-0xd0]
    void* v1;  // [bp-0xc4]
    long long v2;  // [bp-0xc0]
    char v3;  // [bp-0xa8]
    void* v4;  // [bp-0xa0]
    void* v5;  // [bp-0x98]
    void* v6;  // [bp-0x90]
    void* v7;  // [bp-0x88]
    char v8;  // [bp-0x80]
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a5;
    v13 = a4;
    v9 = *(long long *)&g_10002b0;
    v6 = 0;
    v7 = 0;
    v5 = 0;
    v14 = a1;
    if (v14 || !(v14 = sub_ad61b4(), !v14))
    {
        v15 = sub_9cfdc8();
        if (v15)
        {
            sub_a36c8c();
            if (sub_a9d2ac(a0, &v7, &v6, &v5, &v3))
            {
                do
                {
                    sub_a36e70();
                    while (1)
                    {
                        if (!_strcmp(v7, "CERTIFICATE") || !_strcmp(v7, "X509 CERTIFICATE") || !_strcmp(v7, "TRUSTED CERTIFICATE"))
                        {
                            if (!*(long long *)v15)
                            {
                                if (!_strcmp(v7, "TRUSTED CERTIFICATE"))
                                    v19 = &g_afc51c;
                                else
                                    v19 = &g_afc3ec;
                                v17 = v13;
                                v20 = sub_afc484();
                                *(void* *)v15 = v20;
                                if (!v20)
                                    goto LABEL_a9bd48;
                                v2 = v12;
                                v1 = (void*)0;
                                v18 = v15;
                                goto LABEL_a9baf8;
                            }
                            goto LABEL_a9ba6c;
                        }
                        if (_strcmp(v7, "X509 CRL"))
                            break;
                        if (!(long long)v15[8])
                        {
                            v17 = v13;
                            v2 = v12;
                            v1 = (void*)0;
                            v18 = v15 + 8;
                            v19 = &g_af999c;
                            goto LABEL_a9baf8;
                        }
LABEL_a9ba6c:
                        if (!sub_ad68a0(v14, v15) || !(v15 = sub_9cfdc8(), v15))
                            goto LABEL_a9bd48;
                    }
                    ptr = _strstr(v7, "PRIVATE KEY");
                    if (!ptr)
                        goto LABEL_a9bc40;
                    if ((long long)v15[16])
                        goto LABEL_a9ba6c;
                    v2 = v12;
                    if (ptr != v7)
                    {
                        v0 = v13;
                        if (_strcmp(v7, "ENCRYPTED PRIVATE KEY"))
                        {
                            *((char *)ptr - 1) = 0;
                            v1 = (void*)(unsigned int)sub_a5b060(v7);
                        }
                        else
                        {
                            v1 = (void*)0;
                        }
                        v13 = v0;
                    }
                    else
                    {
                        v1 = (void*)0;
                    }
                    *(unsigned long long *)&v15[56] = 0;
                    *(unsigned int *)&v15[48] = 0;
                    v21 = sub_9d02f0();
                    *(void* *)&v15[16] = v21;
                    if (!v21)
                        goto LABEL_a9bd48;
                    if (10 >= (int)_strlen(v6) && _strcmp(v7, "ENCRYPTED PRIVATE KEY"))
                    {
                        v17 = v13;
                        v18 = v21 + 24;
                        v19 = &g_9c9580;
LABEL_a9baf8:
                        if (!sub_a9cc1c(v6, &v8) || !sub_a9c9fc(&v8, v5, &v3, a2, a3))
                            goto LABEL_a9bd48;
                        v4 = v5;
                        v22 = v1;
                        if (!(unsigned int)v22)
                            v19();
                        v13 = v17;
                        v12 = v2;
                        if (sub_9c9144(v22, v18, &v4, v3, v17, v12))
                            goto LABEL_a9bc40;
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pem_info.c", 166, "PEM_X509_INFO_read_bio_ex");
                        sub_a36abc(9, 0x8000d, 0);
                        goto LABEL_a9bd48;
                    }
                    else
                    {
                        if (!sub_a9cc1c(v6, v15 + 24))
                            goto LABEL_a9bd48;
                        *(void* *)&v15[56] = v5;
                        *(unsigned int *)&v15[48] = v3;
                        v5 = 0;
                        v12 = v2;
                    }
LABEL_a9bc40:
                    sub_a6c2e4(v7, "crypto/pem/pem_info.c", 181);
                    v7 = 0;
                    sub_a6c2e4(v6, "crypto/pem/pem_info.c", 183);
                    v6 = 0;
                    v5 = 0;
                    sub_a36c8c(sub_a6c2e4(v5, "crypto/pem/pem_info.c", 185), "crypto/pem/pem_info.c", 185);
                } while (sub_a9d2ac(a0, &v7, &v6, &v5, &v3));
            }
            v24 = (void*)(unsigned int)sub_a36000();
            if (0 <= v24)
                v25 = (unsigned int)&g_7fffff;
            else
                v25 = 0x7fffffff;
            if ((v25 & v24) == 108)
            {
                sub_a36cd4();
                if (!*(long long *)v15 && !(long long)v15[8] && !(long long)v15[16] && !(long long)v15[56])
                {
LABEL_a9bcfc:
                    sub_9cfddc(v15);
                    goto LABEL_a9bd9c;
                }
                else if (sub_ad68a0(v14, v15))
                {
                    v15 = 0;
                    goto LABEL_a9bcfc;
                }
            }
            else
            {
                sub_a36e70();
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pem/pem_info.c", 70, "PEM_X509_INFO_read_bio_ex");
        sub_a36abc(9, 0x8000f, 0);
        v15 = 0;
    }
LABEL_a9bd48:
    sub_9cfddc(v15);
    if ((int)sub_ad69e4(v14) >= 1)
    {
        v26 = 0;
        do
        {
            v27 = v26;
            sub_9cfddc(sub_ad69f8(v14, v27), v27);
            v26 = (unsigned int)v26 + 1;
        } while ((int)(unsigned int)v26 < (int)sub_ad69e4(v14));
    }
    if (v14 != a1)
        sub_ad6020(v14);
    v14 = 0;
LABEL_a9bd9c:
    sub_a6c2e4(v7, "crypto/pem/pem_info.c", 211);
    sub_a6c2e4(v6, "crypto/pem/pem_info.c", 212);
    sub_a6c2e4(v5, "crypto/pem/pem_info.c", 213);
    if (*(long long *)&g_10002b0 == v9)
        return v14;
    ___stack_chk_fail();
}
