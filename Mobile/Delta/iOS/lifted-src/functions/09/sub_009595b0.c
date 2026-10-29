/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9595b0..0x959850 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_959298;
extern long long g_9592a8;
extern char g_10002b0;

long long sub_9595b0(long long a0, long long a1)
{
    unsigned long v9;  // x19
    unsigned int i;  // w0
    long long v19;  // x1
    unsigned long v20;  // x1
    unsigned long v22;  // x20
    unsigned long v11;  // x23
    unsigned long v13;  // x0
    unsigned long long len;  // x0
    unsigned long long v15;  // 4113
    unsigned int v16;  // w0
    int v17;  // 4536
    unsigned long long v18;  // 4118
    long long v0;  // [bp-0x500]
    unsigned long v1;  // [bp-0x4f8]
    char v2;  // [bp-0x4f0]
    unsigned int v3;  // [bp-0x4ec]
    unsigned long v4;  // [bp-0x460]
    char v5;  // [bp-0x458]
    unsigned long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v4 = 0;
    v9 = sub_a66520(sub_a66530(&g_959298, &g_9592a8), " ", "@", " ", "@");
    if (v9)
    {
        i = sub_ad69e4(a0);
        if ((int)i >= 1)
        {
            v11 = 0;
            do
            {
                sub_a66794(v9, sub_ad69f8(a0, v11));
                v11 = (unsigned int)v11 + 1;
            } while (i != (unsigned int)v11);
        }
        v13 = sub_a6d858(&v4, a1);
        if (v13)
        {
            while (1)
            {
                len = _strlen(a1);
                v15 = arm64g_calculate_condition(146, len + _strlen(v13) - 0x3ff, 1026, 0);
                if (!(v15 & 1))
                {
                    v0 = a1;
                    v1 = v13;
                    v16 = sub_9d5b44(&v5, 0x400, "%s/%s");
                    if ((_stat(&v5, &v2) || (v17 = S_ISDIR(v3), !v17)) && (v18 = arm64g_calculate_condition(49, v16 - 0x400, 0x3ff, 0), v18 & 1 || !sub_959480(a0, &v5, v9)))
                        goto LABEL_9597f8;
                    v13 = sub_a6d858(&v4, a1);
                    if (!v13)
                        break;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/ssl_cert.c", 961, "SSL_add_dir_cert_subjects_to_stack");
                    v19 = 270;
                    goto LABEL_9597f0;
                }
            }
        }
        if (*(int *)___error())
        {
            sub_a368c8();
            v20 = *(int *)___error(sub_a369bc("ssl/ssl_cert.c", 981, "SSL_add_dir_cert_subjects_to_stack"), 981, "SSL_add_dir_cert_subjects_to_stack");
            v0 = a1;
            sub_a368c8(sub_a36abc(2, v20, "calling OPENSSL_dir_read(%s)"), v20, "calling OPENSSL_dir_read(%s)");
            sub_a369bc("ssl/ssl_cert.c", 983, "SSL_add_dir_cert_subjects_to_stack");
            v19 = 524290;
LABEL_9597f0:
            sub_a36abc(20, v19, 0);
LABEL_9597f8:
            v22 = 0;
            if (!v4)
            {
                sub_a66664(v9);
                if (*(long long *)&g_10002b0 == v6)
                    return 0;
                ___stack_chk_fail();
            }
        }
        else
        {
            v22 = 1;
            if (!v4)
            {
                sub_a66664(v9);
                if (*(long long *)&g_10002b0 == v6)
                    return 1;
                ___stack_chk_fail();
            }
        }
        sub_a6d93c(&v4);
        sub_a66664(v9);
        if (*(long long *)&g_10002b0 == v6)
            return v22;
        ___stack_chk_fail();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_cert.c", 933, "SSL_add_dir_cert_subjects_to_stack");
        v19 = 524303;
        goto LABEL_9597f0;
    }
}
