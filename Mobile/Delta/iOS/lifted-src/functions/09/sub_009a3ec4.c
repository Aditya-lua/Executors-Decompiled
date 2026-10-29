/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a3ec4..0x9a40a4 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9a3ec4(void* a0, long long a1)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long v21;  // x22
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    long long v18;  // x0
    unsigned long v19;  // x23
    unsigned long v20;  // x24
    unsigned long v0;  // [bp-0x50]
    unsigned short *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!(short)a0[1246])
        return 2;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    sub_967f90();
    if (!v0)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 1691, "tls_construct_stoc_supported_groups");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    v18 = sub_962324(a0);
    if (v0)
    {
        v19 = 0;
        v20 = 1;
        do
        {
            v21 = v1[v19];
            if (sub_968084(a0, v21, v18, v18, 0, 0) && sub_968218(a0, v21, 0x20004))
            {
                if (v20)
                {
                    if ((short)a0[1246] == (unsigned int)v21)
                    {
                        return 2;
                    }
                    else if (!sub_c68d5c(a1, 10, 2) || !sub_c6876c(a1, 2) || !sub_c6876c(a1, 2))
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/extensions_srvr.c", 1715, "tls_construct_stoc_supported_groups");
                        sub_9a58a4(a0, 80, 0xc0103, 0);
                        return 0;
                    }
                }
                if (!sub_c68d5c(a1, v21, 2))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/extensions_srvr.c", 1722, "tls_construct_stoc_supported_groups");
                    sub_9a58a4(a0, 80, 0xc0103, 0);
                    return 0;
                }
                v20 = 0;
            }
        } while ((v19 += 1, v0 > v19));
    }
    if (sub_a6e970(a1) && sub_a6e970(a1))
        return 1;
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_srvr.c", 1729, "tls_construct_stoc_supported_groups");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
