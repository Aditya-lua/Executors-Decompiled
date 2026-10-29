/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99f580..0x99f830 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99f580_4 {
    struct st_99f580_3 *field_0;
    unsigned long long field_8;
} st_99f580_4;

typedef struct st_99f580_0 {
    char padding_0[1208];
    long long field_4b8;
    long long field_4c0;
    char padding_4c8[16];
    long long field_4d8;
    char padding_4e0[40];
    long long field_508;
    char padding_510[1008];
    struct st_99f580_1 *field_900;
    char padding_908[488];
    struct st_99f580_2 *field_af0;
    long long field_af8;
    char padding_b00[28];
    long long field_b1c;
} st_99f580_0;

typedef struct st_99f580_3 {
    unsigned short field_0;
    char field_2;
} st_99f580_3;

typedef struct st_99f580_1 {
    char padding_0[840];
    long long field_348;
    long long field_350;
} st_99f580_1;

typedef struct st_99f580_2 {
    char field_0;
} st_99f580_2;


long long sub_99f580(st_99f580_0 *a0, st_99f580_4 *a1)
{
    unsigned long long v2;  // x8
    long long v3;  // x10
    unsigned long long v12;  // 4102
    long long v13;  // x24
    st_99f580_3 *v14;  // x21
    long long v15;  // x20
    long long i;  // x25
    char *v17;  // x8
    unsigned long v18;  // x26
    unsigned long v19;  // x9
    unsigned long v20;  // x23
    long long v21;  // x0
    unsigned long v4;  // cc_dep1
    long long v23;  // x0
    long long *v24;  // x8
    st_99f580_3 *v5;  // x9
    st_99f580_3 *v6;  // x11
    unsigned long v7;  // x12
    unsigned long v8;  // x12
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(int)a0->field_4d8)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1680, "tls_parse_stoc_alpn");
        sub_9a58a4();
        return 0;
    }
    v2 = a1->field_8;
    v3 = v2 - 2;
    v4 = v2;
    if (v2 >= 2)
    {
        v5 = a1->field_0;
        v6 = v5;
        v7 = v6->field_0;
        v8 = (unsigned int)((v7 & 0xff00) >> 8) | (unsigned int)v7 * 0x100 & 0xff00ff00;
        a1->field_0 = &v6->field_2;
        a1->field_8 = v3;
        if (v3)
        {
            v9 = arm64g_calculate_condition(20, v4, 2, 0);
            v10 = arm64g_calculate_condition(20, (v9 & 1 ? v3 : 0), (v9 & 1 ? v8 : 0), 0);
            if (!(v10 & 1))
                goto LABEL_99f5d0;
        }
        else
        {
            v11 = arm64g_calculate_condition(20, v4, 2, 0);
            v12 = arm64g_calculate_condition(16, 0, (v11 & 1 ? v8 : 0), 0);
            if (!(v12 & 1))
            {
LABEL_99f5d0:
                v13 = v5->field_2;
                v14 = v5 + 1;
                v15 = v2 - 3;
                a1->field_0 = v14;
                a1->field_8 = v15;
                if (v15 == v13)
                {
                    i = a0->field_af8;
                    if (i < 0)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/extensions_clnt.c", 1698, "tls_parse_stoc_alpn");
                        sub_9a58a4();
                        return 0;
                    }
                    if (i)
                    {
                        v17 = a0->field_af0;
                        do
                        {
                            v18 = *v17;
                            v19 = i - 1;
                            i = v19 - v18;
                            if (v19 < v18)
                                break;
                            v20 = v17 + 1;
                            if ((unsigned int)v18 == (int)v13)
                            {
                                a1 = a1;
                                if (!_memcmp(v14, v20, v15))
                                {
                                    sub_a6c2e4(a0->field_4b8, "ssl/statem/extensions_clnt.c", 1717);
                                    v21 = sub_a6bf4c(v15, "ssl/statem/extensions_clnt.c", 1718);
                                    a0->field_4b8 = v21;
                                    if (!v21)
                                    {
                                        a0->field_4c0 = 0;
                                        sub_a368c8();
                                        sub_a369bc("ssl/statem/extensions_clnt.c", 1721, "tls_parse_stoc_alpn");
                                        sub_9a58a4();
                                        return 0;
                                    }
                                    else if (sub_9911fc(a1, v21, v15))
                                    {
                                        a0->field_4c0 = v15;
                                        if (a0->field_900->field_348)
                                        {
                                            if (a0->field_900->field_350 != v15 || _memcmp())
                                                *(unsigned int *)&(a0->padding_b00)[1] = 0;
                                            if ((int)a0->field_508)
                                                return 1;
                                            sub_a368c8();
                                            sub_a369bc("ssl/statem/extensions_clnt.c", 1743, "tls_parse_stoc_alpn");
                                            sub_9a58a4();
                                            return 0;
                                        }
                                        else
                                        {
                                            *(unsigned int *)&(a0->padding_b00)[1] = 0;
                                            if ((int)a0->field_508)
                                                return 1;
                                            v23 = sub_a6dac4(a0->field_4b8, v15, "ssl/statem/extensions_clnt.c", 1746);
                                            v24 = a0->field_900;
                                            v24[105] = v23;
                                            if (!v23)
                                            {
                                                v24[106] = 0;
                                                sub_a368c8();
                                                sub_a369bc("ssl/statem/extensions_clnt.c", 1749, "tls_parse_stoc_alpn");
                                                sub_9a58a4();
                                                return 0;
                                            }
                                            v24[106] = a0->field_4c0;
                                            return 1;
                                        }
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        sub_a369bc("ssl/statem/extensions_clnt.c", 1725, "tls_parse_stoc_alpn");
                                        sub_9a58a4();
                                        return 0;
                                    }
                                }
                            }
                            v17 = v20 + v18;
                        } while (i);
                    }
                    sub_a368c8();
                    sub_a369bc("ssl/statem/extensions_clnt.c", 1713, "tls_parse_stoc_alpn");
                    sub_9a58a4();
                    return 0;
                }
            }
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", 1692, "tls_parse_stoc_alpn");
    sub_9a58a4();
    return 0;
}
