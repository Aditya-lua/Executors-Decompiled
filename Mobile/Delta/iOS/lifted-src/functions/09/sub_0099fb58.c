/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99fb58..0x99ffb0 (1112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99fb58_0 {
    struct st_99fb58_1 *field_0;
    unsigned long long field_8;
} st_99fb58_0;

typedef struct st_99fb58_1 {
    unsigned short field_0;
} st_99fb58_1;

typedef struct st_99fb58_4 {
    unsigned short field_0;
    char padding_2[6];
    long long field_8;
    char padding_10[768];
    long long field_310;
    char padding_318[32];
    unsigned long long field_338;
    char padding_340[414];
    unsigned short field_4de;
    unsigned long long field_4e0;
    char padding_4e8[32];
    unsigned int field_508;
    char padding_50c[1012];
    struct st_99fb58_3 *field_900;
} st_99fb58_4;

typedef struct st_99fb58_2 {
    char padding_0[776];
    unsigned int field_308;
} st_99fb58_2;

typedef struct st_99fb58_3 {
    char padding_0[776];
    unsigned long long field_308;
} st_99fb58_3;


unsigned long long sub_99fb58(st_99fb58_4 *a0, st_99fb58_0 *a1, unsigned long long a2)
{
    long long v4;  // x1
    unsigned long v5;  // x10
    st_99fb58_4 *v14;  // x0
    long long v15;  // x1
    long long v16;  // x2
    unsigned long long v17;  // x0
    st_99fb58_0 *v18;  // x8
    unsigned long v19;  // x11
    unsigned long long v20;  // x22
    unsigned short *v21;  // x23
    unsigned long long v22;  // x0
    unsigned long long v23;  // x20
    unsigned long long v6;  // x20
    long long v27;  // x1
    unsigned long long v28;  // x8
    unsigned long long v29;  // x9
    unsigned long long v30;  // x8
    unsigned long long v31;  // x8
    unsigned long long v32;  // x8
    unsigned long long v7;  // x8
    unsigned long long v34;  // x8
    unsigned long long idx;  // x20
    unsigned long long *v36;  // x21
    unsigned long long v8;  // x9
    unsigned long v9;  // x21
    st_99fb58_2 *v10;  // x8
    st_99fb58_0 *v11;  // x23
    unsigned long long v12;  // x0
    st_99fb58_2 *v13;  // x22
    char v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!*(long long *)&a0->padding_10[760] || a0->field_4e0)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1886, "tls_parse_stoc_key_share");
        v14 = a0;
        v15 = 80;
        v16 = 786691;
    }
    else
    {
        if (1 >= a1->field_8)
        {
            sub_a368c8();
            v4 = 1892;
            goto LABEL_99fc60;
        }
        v5 = *(short *)a1->field_0;
        v6 = (unsigned int)((v5 & 0xff00) >> 8) | (unsigned int)v5 * 0x100 & 0xff00ff00;
        v7 = a1->field_8 - 2;
        a1->field_0 = a1->field_0 + 1;
        a1->field_8 = v7;
        if (a2 >> 11 & 1)
        {
            v1 = 0;
            if (v7)
            {
                sub_a368c8();
                v4 = 1901;
            }
            else
            {
                v28 = a0->field_338;
                if (a0->field_338)
                {
                    v29 = 816;
                    do
                    {
                        v30 = v28;
                        if ((unsigned int)v6 == *(short *)((char *)a0 + v29))
                        {
                            sub_a368c8();
                            v27 = 1911;
                            goto LABEL_99fe9c;
                        }
                    } while ((v29 += 2, v28 = v30 - 1, v30 != 1));
                }
                sub_967f90(a0, &v1, &v0);
                v31 = v0;
                if (v31)
                {
                    do
                    {
                        v32 = v31;
                        if ((unsigned int)v6 == *(short *)v1)
                        {
                            if (sub_968218(a0, v6, 0x20004) && sub_968084(a0, v6, 772, 772, 0, 0))
                            {
                                a0->field_4de = v6;
                                v34 = a0->field_338;
                                if (v34)
                                {
                                    idx = 0;
                                    v36 = &a0->field_310;
                                    do
                                    {
                                        if (v36[idx])
                                        {
                                            sub_a5a4c8(v36[idx]);
                                            v36[idx] = 0;
                                            v34 = a0->field_338;
                                        }
                                    } while ((idx += 1, v34 > idx));
                                }
                                a0->field_338 = 0;
                                *(unsigned long long *)&a0->padding_10[760] = 0;
                                return 1;
                            }
                            break;
                        }
                    } while ((v31 = v32 - 1, v1 += 2, v32 != 1));
                }
                sub_a368c8();
                v27 = 1926;
                goto LABEL_99fe9c;
            }
LABEL_99fc60:
            sub_a369bc("ssl/statem/extensions_clnt.c", v4, "tls_parse_stoc_key_share");
            v14 = a0;
            v15 = 50;
            v16 = 159;
        }
        else if (a0->field_338)
        {
            v8 = 0;
            while ((unsigned int)v6 != *(short *)&a0->padding_318[24 + 2 * v8])
            {
                v8 += 1;
                if (a0->field_338 == v8)
                    goto LABEL_99fda0;
            }
            v9 = (&a0->field_310)[v8];
            a0->field_4de = v6;
            *(unsigned long *)&a0->padding_10[760] = v9;
            if (!(unsigned int)v6)
                goto LABEL_99fda0;
            v10 = &a0->field_900->field_308;
            if (a0->field_508)
            {
                v11 = a1;
                if ((unsigned int)v6 == *(int *)&v10->padding_0[0])
                    goto LABEL_99fd2c;
                v12 = sub_965e7c();
                if (!v12)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/extensions_clnt.c", 1982, "tls_parse_stoc_key_share");
                    sub_9a58a4(a0, 80, 0x80014, 0);
                    return 0;
                }
                v13 = v12;
                sub_9662a0(a0->field_900);
                a0->field_900 = v13;
                v10 = &v13->field_308;
                a1 = v11;
            }
            v11 = a1;
            *(unsigned int *)&v10->padding_0[0] = v6;
LABEL_99fd2c:
            v17 = sub_967f24(a0->field_8, v6);
            if (v17)
            {
                if (v11->field_8 >= 2)
                {
                    v18 = v11;
                    v19 = *(short *)v11->field_0;
                    v20 = (unsigned int)((v19 & 0xff00) >> 8) | (unsigned int)v19 * 0x100 & 0xff00ff00;
                    if (v11->field_8 - 2 == v20)
                    {
                        v21 = v11->field_0 + 1;
                        v18->field_0 = (char *)v21 + v20;
                        v18->field_8 = 0;
                        if (v20)
                        {
                            if (*(char *)(v17 + 48))
                            {
                                v22 = sub_95710c(a0, v9, v21, v20, 1);
                                if (!(unsigned int)v22)
                                    return v22;
                            }
                            else
                            {
                                v23 = sub_a5ba1c();
                                if (!v23 || (int)sub_a59d8c(v23, v9) <= 0)
                                {
                                    sub_a368c8();
                                    sub_a369bc("ssl/statem/extensions_clnt.c", 2007, "tls_parse_stoc_key_share");
                                    sub_9a58a4(a0, 80, 296, 0);
                                    sub_a5a4c8(v23);
                                    return 0;
                                }
                                else if ((int)sub_96d378(v23, v21, v20) <= 0)
                                {
                                    sub_a368c8();
                                    sub_a369bc("ssl/statem/extensions_clnt.c", 2015, "tls_parse_stoc_key_share");
                                    sub_9a58a4(a0, 47, 306, 0);
                                    sub_a5a4c8(v23);
                                    return 0;
                                }
                                else if (sub_956ec0(a0, v9, v23, 1))
                                {
                                    a0->field_4e0 = v23;
                                }
                                else
                                {
                                    sub_a5a4c8(v23);
                                    return 0;
                                }
                            }
                            a0->padding_340[413] = 1;
                            return 1;
                        }
                    }
                }
                sub_a368c8();
                v4 = 1999;
                goto LABEL_99fc60;
            }
            else
            {
                sub_a368c8();
                v27 = 1993;
                goto LABEL_99fe9c;
            }
        }
        else
        {
LABEL_99fda0:
            sub_a368c8();
            v27 = 1964;
LABEL_99fe9c:
            sub_a369bc("ssl/statem/extensions_clnt.c", v27, "tls_parse_stoc_key_share");
            v14 = a0;
            v15 = 47;
            v16 = 108;
        }
    }
    sub_9a58a4(v14, v15, v16, 0);
    return 0;
}
