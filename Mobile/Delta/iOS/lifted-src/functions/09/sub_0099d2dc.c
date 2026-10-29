/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99d2dc..0x99d524 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_99d2dc(void* a0, long long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    long long v20;  // x1
    unsigned long long v21;  // x0
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long long v17;  // x21
    long long v18;  // x0
    unsigned int v19;  // w0
    char v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (a3)
        return 2;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    if ((int)a0[2600] != 1)
        return 2;
    if (sub_c68d5c(a1, 5, 2) && sub_c6876c(a1, 2) && sub_c68d5c(a1, 1, 1) && sub_c6876c(a1, 2))
    {
        if ((int)sub_ad69e4((long long)a0[2624]) >= 1)
        {
            v17 = 0;
            do
            {
                v18 = sub_ad69f8((long long)a0[2624], v17);
                v19 = sub_a9b2b4(v18, 0);
                if ((int)v19 < 1 || !sub_a6e86c(a1, v19, &v0, 2) || sub_a9b2b4(v18, &v0) != v19)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/extensions_clnt.c", 395, "tls_construct_ctos_status_request");
                    sub_9a58a4(a0, 80, 0xc0103, 0);
                    return 0;
                }
            } while ((v17 = (unsigned int)v17 + 1, (int)v17 < (int)sub_ad69e4((long long)a0[2624])));
        }
        if (!sub_a6e970(a1) || !sub_c6876c(a1, 2))
        {
            sub_a368c8();
            v20 = 401;
        }
        else if ((long long)a0[2632])
        {
            v21 = sub_afa320((long long)a0[2632], 0);
            if (!(v21 >> 31 & 1))
            {
                if (sub_a6e830(a1, v21 & 0xffffffff, &v0) && sub_afa320((long long)a0[2632], &v0) == (unsigned int)v21)
                    goto LABEL_99d430;
                v20 = 415;
            }
            else
            {
                v20 = 409;
            }
            sub_a368c8();
        }
        else
        {
LABEL_99d430:
            if (sub_a6e970(a1) && sub_a6e970(a1))
                return 1;
            sub_a368c8();
            v20 = 420;
        }
    }
    else
    {
        sub_a368c8();
        v20 = 383;
    }
    sub_a369bc("ssl/statem/extensions_clnt.c", v20, "tls_construct_ctos_status_request");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
