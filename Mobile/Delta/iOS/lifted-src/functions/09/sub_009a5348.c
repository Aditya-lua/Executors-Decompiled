/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a5348..0x9a5460 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9a5348(void* a0, void* a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    char *v19;  // x24
    unsigned long v20;  // x22
    unsigned long v21;  // x21
    void* v23;  // x19
    long long v24;  // x1
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long v16;  // x9
    char *v17;  // x8
    unsigned long v18;  // x22
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!(long long)a0[5528])
    {
        *(unsigned short *)&a0[2896] = 0;
        return 1;
    }
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = (long long)a1[8];
    if (v16 && !(v17 = *(long long *)a1, v18 = v16 - 1, v18 != *v17))
    {
        *(char **)a1 = &v17[v16];
        *(unsigned long long *)&a1[8] = 0;
        if (v18)
        {
            v19 = v17 + 1;
            while (1)
            {
                v20 = v18;
                v21 = *v19;
                v19 += 1;
                if (_memchr((long long)a0[5528], v21, (long long)a0[5536]))
                {
                    *(char *)&a0[2896] = v21;
                    *(char *)&a0[2897] = 1;
                    return 1;
                }
                v18 = v20 - 1;
                if (v20 == 1)
                {
                    *(char *)&a0[2897] = 2;
                    return 1;
                }
            }
        }
        else
        {
            *(char *)&a0[2897] = 2;
            v23 = a0;
            sub_a368c8();
            v24 = 2358;
        }
    }
    else
    {
        *(char *)&a0[2897] = 2;
        v23 = a0;
        sub_a368c8();
        v24 = 2353;
    }
    sub_a369bc("ssl/statem/extensions_srvr.c", v24, "tls_parse_ctos_client_cert_type");
    sub_9a58a4(v23, 50, 110, 0);
    return 0;
}
