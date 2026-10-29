/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a471c..0x9a4b08 (1004 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a471c_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[760];
    long long field_308;
    char padding_310[160];
    long long field_3b0;
    long long field_3b8;
    char padding_3c0[285];
    long long field_4dd;
    unsigned short field_4de;
    long long field_4e0;
    char padding_4e8[1000];
    long long field_8d0;
    char padding_8d8[568];
    char field_b10;
} st_9a471c_0;


unsigned long long sub_9a471c(st_9a471c_0 *a0, long long a1)
{
    st_9a471c_0 *v4;  // x19
    unsigned long v5;  // x21
    long long v14;  // x2
    long long v6;  // x1
    char v7;  // x0
    unsigned long long v8;  // x0
    long long v9;  // x2
    char v10;  // x0
    long long v11;  // x22
    char v12;  // x0
    unsigned long long v13;  // x0
    char v0;  // [bp-0x40]
    char v1;  // [bp-0x38], Other Possible Types: long long
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    v5 = a0->field_4dd;
    if (*(int *)&a0->padding_4e8[984] == 1)
    {
        if (!v5)
        {
            if (sub_c68d5c(a1, 0x33, 2) && sub_c6876c(a1, 2) && sub_c68d5c(a1, *(short *)&(v4->padding_3c0)[1 + 1], 2) && sub_a6e970(a1))
                return 1;
            sub_a368c8();
            v6 = 1952;
        }
        else
        {
            return 2;
        }
    }
    else
    {
        if (v5)
        {
            if (*(int *)&v4->padding_4e8[16] && !(v4->padding_8d8[552] >> 1 & 1))
                return 2;
            if (sub_c68d5c(a1, 0x33, 2) && sub_c6876c(a1, 2) && sub_c68d5c(a1, *(short *)&(v4->padding_3c0)[1 + 1], 2))
            {
                v7 = sub_967f24(v4->field_8, *(short *)&(v4->padding_3c0)[1 + 1]);
                if (v7)
                {
                    if (*(char *)(v7 + 48))
                    {
                        v0 = 0;
                        v1 = 0;
                        if (sub_95730c(v4, v5, &v1, &v0, 0))
                        {
                            if (!v0)
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/statem/extensions_srvr.c", 0x7fa, "tls_construct_stoc_key_share");
                                sub_9a58a4(v4, 80, 0xc0103, 0);
                                v9 = 0x7fb;
                                goto LABEL_9a4ac0;
                            }
                            else if (sub_a6ec4c(a1, v1) && sub_a6e970(a1))
                            {
                                sub_a6c2e4(v1, "ssl/statem/extensions_srvr.c", 2053);
                                v8 = sub_956e18(v4, v4->field_3b0, v4->field_3b8);
                                if (!(unsigned int)v8)
                                    return v8;
                                goto LABEL_9a49a4;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/statem/extensions_srvr.c", 2049, "tls_construct_stoc_key_share");
                                sub_9a58a4(v4, 80, 0xc0103, 0);
                                v9 = 2050;
                                goto LABEL_9a4ac0;
                            }
                            goto LABEL_9a4ac0;
                        }
                    }
                    else
                    {
                        v10 = sub_956b1c(v4, v5);
                        if (v10)
                        {
                            v11 = v10;
                            v12 = sub_a5b7c4();
                            if (v12)
                            {
                                if (sub_a6ec4c(a1, v1, v12, 2) && sub_a6e970(a1))
                                {
                                    sub_a6c2e4(v1, "ssl/statem/extensions_srvr.c", 2015);
                                    v4->field_308 = v11;
                                    v13 = sub_956ec0(v4, v11, v5, 1);
                                    if (!(unsigned int)v13)
                                        return v13;
LABEL_9a49a4:
                                    (v4->padding_3c0)[1] = 1;
                                    return 1;
                                }
                                sub_a368c8();
                                sub_a369bc("ssl/statem/extensions_srvr.c", 2010, "tls_construct_stoc_key_share");
                                sub_9a58a4(v4, 80, 0xc0103, 0);
                                sub_a5a4c8(v11);
                                v9 = 2012;
LABEL_9a4ac0:
                                sub_a6c2e4(v1, "ssl/statem/extensions_srvr.c", v9);
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/statem/extensions_srvr.c", 2003, "tls_construct_stoc_key_share");
                                sub_9a58a4(v4, 80, 0x80010, 0);
                                sub_a5a4c8(v11);
                            }
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/extensions_srvr.c", 1996, "tls_construct_stoc_key_share");
                            v14 = 524308;
LABEL_9a48f4:
                            sub_9a58a4(v4, 80, v14, 0);
                        }
                    }
                    return 0;
                }
                sub_a368c8();
                v6 = 1988;
            }
            else
            {
                sub_a368c8();
                v6 = 1981;
            }
        }
        else
        {
            if (*(int *)&v4->padding_4e8[16] && sub_96f1fc(v4, 0, 0))
                return 2;
            sub_a368c8();
            v6 = 1962;
        }
    }
    sub_a369bc("ssl/statem/extensions_srvr.c", v6, "tls_construct_stoc_key_share");
    v14 = 786691;
    goto LABEL_9a48f4;
}
