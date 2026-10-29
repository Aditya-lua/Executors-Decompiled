/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99dbe4..0x99de34 (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99dbe4_1 {
    char padding_0[776];
    struct st_99dbe4_0 *field_308;
    char padding_310[40];
    struct st_99dbe4_0 *field_338;
    char padding_340[414];
    struct st_99dbe4_0 *field_4de;
    char padding_4e6[1450];
    struct st_99dbe4_0 *field_a90;
} st_99dbe4_1;

typedef struct st_99dbe4_0 {
    struct st_99dbe4_0 *field_0;
} st_99dbe4_0;


st_99dbe4_0 ** sub_99dbe4(st_99dbe4_1 *a0, long long a1)
{
    st_99dbe4_1 *v4;  // x19
    st_99dbe4_0 **v5;  // x8
    st_99dbe4_0 **v6;  // w23
    st_99dbe4_0 **v7;  // x0
    st_99dbe4_0 **v8;  // x21
    st_99dbe4_0 **v9;  // x22
    st_99dbe4_0 **v10;  // x0
    st_99dbe4_0 **v0;  // [bp-0x50]
    st_99dbe4_0 **v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    v0 = 0;
    v1 = 0;
    if (sub_c68d5c(a1, 0x33, 2) && sub_c6876c(a1, 2) && sub_c6876c(a1, 2))
    {
        sub_96801c(v4, &v0, &v1);
        v5 = v1;
        v6 = (st_99dbe4_0 **)(v5 != 1);
        if (v5 == 1)
        {
            if (*(short *)v0)
            {
                v6 = (st_99dbe4_0 **)1;
                goto LABEL_99dcd8;
            }
            else
            {
                sub_967f90(v4, &v0, &v1);
                v5 = v1;
            }
        }
        if (!v5)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 730, "tls_construct_ctos_key_share");
            sub_9a58a4(v4, 80, 101, 0);
            return 0;
        }
LABEL_99dcd8:
        if (!*(short *)&(v4->padding_340)[1] || v4->field_308)
        {
            v8 = 0;
            v9 = 0;
            if (!*(long long *)&v4->padding_4e6[1448])
                v6 = (st_99dbe4_0 **)0;
            do
            {
                if (!sub_968218(v4, *(short *)((char *)v0 + 0x2 * v9), 0x20004) || !sub_968084(v4, *(short *)((char *)v0 + 0x2 * v9), 772, 772, 0, 0))
                    continue;
                if (!*(short *)((char *)v0 + 0x2 * v9))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/extensions_clnt.c", 759, "tls_construct_ctos_key_share");
                    sub_9a58a4(v4, 80, 101, 0);
                    return 0;
                }
                v10 = sub_99de34(v4, a1);
                if (!(unsigned int)v10)
                    return v10;
                v8 = (char *)v8 + 1;
                if (!v6)
                    break;
            } while ((v9 = (char *)v9 + 1, v1 > v9));
            if (!v8)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/extensions_clnt.c", 774, "tls_construct_ctos_key_share");
                sub_9a58a4(v4, 80, 101, 0);
                return 0;
            }
        }
        else
        {
            v4->field_338 = 0;
            v7 = sub_99de34(v4, a1);
            if (!(unsigned int)v7)
                return v7;
        }
        if (sub_a6e970(a1) && sub_a6e970(a1))
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 779, "tls_construct_ctos_key_share");
        sub_9a58a4(v4, 80, 0xc0103, 0);
        return 0;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", 718, "tls_construct_ctos_key_share");
    sub_9a58a4(v4, 80, 0xc0103, 0);
    return 0;
}
