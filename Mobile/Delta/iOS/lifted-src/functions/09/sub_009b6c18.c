/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b6c18..0x9b7a2c (3604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b6c18_2 {
    int field_0;
    char padding_4[212];
    void* field_d8;
} st_9b6c18_2;

typedef struct st_9b6c18_4 {
    char padding_0[256];
    unsigned long long field_100;
} st_9b6c18_4;

typedef struct st_9b6c18_11 {
    uint128_t field_0;
    uint128_t field_10;
    char padding_20[344];
    struct st_9b6c18_3 *field_178;
    char padding_180[488];
    struct st_9b6c18_4 *field_368;
    char padding_370[96];
    unsigned long long field_3d0;
    char padding_3d8[800];
    struct st_9b6c18_5 *field_6f8;
    char padding_700[120];
    struct st_9b6c18_10 *field_778;
    char padding_780[64];
    unsigned long long field_7c0;
    char padding_7c8[96];
    char field_828;
    char padding_829[1];
    char field_82a;
    char padding_82b[33];
    unsigned int field_84c;
    char padding_850[80];
    unsigned int field_8a0;
    char padding_8a4[180];
    struct st_9b6c18_1 *field_958;
    char padding_960[112];
    struct st_9b6c18_8 *field_9d0;
    char padding_9d8[240];
    struct st_9b6c18_1 *field_ac8;
} st_9b6c18_11;

typedef struct st_9b6c18_6 {
    char padding_0[24];
    unsigned int field_18;
} st_9b6c18_6;

typedef struct st_9b6c18_12 {
    char padding_0[280];
    unsigned long long field_118;
} st_9b6c18_12;

typedef struct st_9b6c18_3 {
    char padding_0[24];
    unsigned int field_18;
    char field_1c;
} st_9b6c18_3;

typedef struct st_9b6c18_9 {
    char padding_0[8];
    struct st_9b6c18_0 *field_8;
    char padding_10[8];
    struct st_9b6c18_2 *field_18;
    char padding_20[40];
    int field_48;
    char padding_4c[28];
    unsigned long long field_68;
    char padding_70[248];
    char field_168;
    char padding_169[31];
    uint128_t field_188;
    uint128_t field_198;
    char padding_1a8[344];
    struct st_9b6c18_3 *field_300;
    char padding_308[488];
    struct st_9b6c18_4 *field_4f0;
    char padding_4f8[96];
    long long field_558;
    char padding_560[800];
    struct st_9b6c18_5 *field_880;
    char padding_888[120];
    struct st_9b6c18_7 *field_900;
    char padding_908[32];
    char field_928;
    char padding_929[31];
    long long field_948;
    char padding_950[96];
    char field_9b0;
    char padding_9b1[1];
    char field_9b2;
    char padding_9b3[33];
    unsigned int field_9d4;
    char padding_9d8[80];
    unsigned int field_a28;
    char padding_a2c[180];
    struct st_9b6c18_1 *field_ae0;
    char padding_ae8[112];
    struct st_9b6c18_8 *field_b58;
    char padding_b60[240];
    struct st_9b6c18_1 *field_c50;
} st_9b6c18_9;

typedef struct st_9b6c18_0 {
    char padding_0[216];
    struct st_9b6c18_1 *field_d8;
    char padding_e0[304];
    struct st_9b6c18_1 *field_210;
    char padding_218[80];
    struct st_9b6c18_1 *field_268;
} st_9b6c18_0;

typedef struct st_9b6c18_8 {
    char padding_0[4];
    unsigned int field_4;
    uint128_t field_8;
    uint128_t field_18;
    long long field_28;
    char field_30;
    char padding_31[31];
    unsigned long long field_50;
    char field_58;
    char padding_59[255];
    char field_158;
    char padding_159[23];
    char field_170;
    char padding_171[279];
    long long field_288;
} st_9b6c18_8;

typedef struct st_9b6c18_7 {
    char padding_0[752];
    unsigned long long field_2f0;
    struct st_9b6c18_6 *field_2f8;
} st_9b6c18_7;

typedef struct st_9b6c18_10 {
    char padding_0[752];
    unsigned int field_2f0;
    char padding_2f4[4];
    struct st_9b6c18_6 *field_2f8;
} st_9b6c18_10;

typedef struct st_9b6c18_1 {
    unsigned long long field_0;
} st_9b6c18_1;

typedef struct st_9b6c18_5 {
    unsigned long long field_0;
    char padding_8[88];
    struct st_9b6c18_1 *field_60;
} st_9b6c18_5;


unsigned long long sub_9b6c18(st_9b6c18_9 *a0, unsigned long long a1)
{
    st_9b6c18_8 *v8;  // x20
    unsigned long long v9;  // x24
    unsigned long long v18;  // x22
    unsigned long long v19;  // x1
    long long v20;  // x0
    unsigned long long v21;  // x0
    unsigned long long v22;  // w0
    unsigned long long v23;  // 4112
    st_9b6c18_2 *v24;  // x22
    unsigned long v25;  // x8
    unsigned long long v26;  // x22
    st_9b6c18_6 *v27;  // x0
    st_9b6c18_11 *v10;  // x8
    st_9b6c18_12 *v28;  // x22
    st_9b6c18_2 *v29;  // x8
    unsigned long v30;  // x9
    unsigned long long v31;  // w25
    unsigned long long v32;  // x26
    unsigned long long v33;  // x24
    unsigned long long v34;  // x23
    unsigned long long v35;  // x10
    unsigned long long v36;  // w9
    long long v37;  // x1
    uint128_t v11;  // q1
    unsigned long long v38;  // w0
    unsigned long long v39;  // x25
    unsigned int *v40;  // x0
    unsigned long long v41;  // x11
    unsigned long long v42;  // w10
    unsigned long long v43;  // w8
    long long v44;  // x1
    long long v45;  // x0
    unsigned long long v46;  // x0
    unsigned long long v47;  // x0
    st_9b6c18_9 *v12;  // x0
    unsigned long long v48;  // x8
    unsigned long long v49;  // 4126
    unsigned long long v50;  // x9
    unsigned long long v51;  // x0
    unsigned long long v53;  // x1
    unsigned long long v54;  // x2
    unsigned long long v55;  // x0
    unsigned long long v13;  // x1
    unsigned long long v14;  // x2
    unsigned long long v15;  // x0
    unsigned int v16;  // w8
    st_9b6c18_4 *v17;  // x22
    unsigned int v0;  // [bp-0x8c]
    unsigned long long v1;  // [bp-0x88]
    unsigned long long v2;  // [bp-0x7c]
    unsigned long long v3;  // [bp-0x78]
    unsigned int v4;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v5;  // [bp-0x64]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (a1 == 6)
    {
LABEL_9b78f0:
        v4 = 112;
        if (!((char)(*(char *)(*(long long *)&a0->padding_1a8[336] + 28)) >> 5 & 1))
        {
            return 1;
        }
        else if (!*(long long *)&a0->padding_b60[112])
        {
            return 1;
        }
        else if (*(long long *)&a0->padding_b60[0x88])
        {
            v55 = sub_970c24(a0, &v4);
            if (v55 >> 31 & 1)
            {
                *(unsigned int *)&a0->field_68 = 4;
                return 6;
            }
            else if ((unsigned int)v55 == 2)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 1373, "ssl_check_srp_ext_ClientHello");
                v53 = v4;
                if ((unsigned int)v53 == 115)
                    v54 = 223;
                else
                    v54 = 226;
                sub_9a58a4(a0, v53, v54, 0);
                return 0;
            }
            else
            {
                return 1;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 1363, "ssl_check_srp_ext_ClientHello");
            sub_9a58a4(a0, 115, 223, 0);
            return 0;
        }
    }
    if (a1 == 5)
    {
LABEL_9b7708:
        if (*(int *)&a0->padding_4f8[8])
        {
            if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000)
            {
                *(long long *)&a0->padding_1a8[336] = *(long long *)(*(long long *)&a0->padding_888[112] + 760);
                goto LABEL_9b77bc;
            }
        }
        else
        {
            if (*(long long *)(*(long long *)&a0->padding_560[792] + 96))
                (*(long long *)(*(long long *)&a0->padding_560[792] + 96))();
        }
        if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000)
        {
            v45 = sub_96125c(a0);
            v46 = sub_955e34(a0, *(long long *)&a0->padding_4f8[88], v45);
            if (!v46)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 2362, "tls_post_process_client_hello");
                sub_9a58a4(a0, 40, 193, 0);
                return 0;
            }
            *(unsigned long long *)&a0->padding_1a8[336] = v46;
        }
        if (!*(int *)&a0->padding_4f8[8])
        {
            v47 = sub_96cc84(a0, 1);
            if (!(unsigned int)v47)
            {
                return v47;
            }
            else if (*(long long *)&a0->padding_b60[232])
            {
                (*(long long *)&a0->padding_b60[232])();
            }
            else if (*(int *)(*(long long *)&a0->padding_888[112] + 688))
            {
                *(unsigned int *)&a0->padding_a2c[44] = 0;
            }
        }
LABEL_9b77bc:
        v48 = a0->field_8;
        *(unsigned int *)&a0->padding_a2c[8] = 0;
        v49 = arm64g_calculate_condition(1, *(int *)&a0->padding_9d8[72], 1, 0);
        if (!(v49 & 1) && v48)
        {
            v50 = *(long long *)(v48 + 616);
            if (v50 && *(long long *)&a0->padding_308[200])
            {
                *(long long *)*(long long *)&a0->padding_560[792] = *(long long *)&a0->padding_308[200];
                v50();
            }
        }
        if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000)
        {
            v51 = sub_9b7ac4(a0);
            if (!(unsigned int)v51)
                return v51;
        }
        goto LABEL_9b78f0;
    }
    if (a1 != 4)
        return 1;
    v5 = 80;
    v3 = 0;
    v4 = 0;
    v8 = *(long long *)&a0->padding_ae8[104];
    v2 = 0;
    v9 = a0->field_8;
    if (*(long long *)(v9 + 528))
        (*(long long *)(v9 + 528))();
    v10 = (a0->padding_169)[1];
    v11 = *(int128_t *)((char *)&v8->field_8 + 8);
    v10->field_0 = *(int128_t *)&(&v8->field_4)[1];
    v10->field_10 = v11;
    if (!v8->padding_0)
    {
LABEL_9b6cc4:
        v15 = sub_9b12f8(a0, v8, &v2);
        if ((unsigned int)v15)
        {
            if (!*(long long *)&a0->padding_1a8[176] || !*(long long *)&a0->padding_1a8[312])
            {
                v16 = v8->field_4;
                *(unsigned int *)&a0->padding_9b3[25] = v16;
                a0->field_48 = v16;
            }
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 1780, "tls_early_post_process_client_hello");
            v12 = a0;
            v13 = 70;
            v14 = v15;
        }
        else
        {
            if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1))
            {
                if (a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000)
                    goto LABEL_9b6e74;
                if (sub_992a0c(&a0->field_c50))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 1787, "tls_early_post_process_client_hello");
                    v12 = a0;
                    v13 = 10;
                    v14 = 182;
                }
                else
                {
                    if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1)
                        goto LABEL_9b6e40;
                    goto LABEL_9b6e74;
                }
            }
            else
            {
LABEL_9b6e40:
                if (sub_962ef0(a0) >> 13 & 1)
                {
                    if (*(long long *)(v9 + 216))
                        (*(long long *)(v9 + 216))();
                    v17 = *(long long *)&a0->padding_308[480];
                    if (v17->field_100 == *(long long *)&v8->padding_31[23] && !_memcmp(&v8->field_50, v17))
                    {
                        *(unsigned int *)&v17[1].padding_0[0] = 1;
                        goto LABEL_9b6e74;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 1808, "tls_early_post_process_client_hello");
                        v12 = a0;
                        v13 = 40;
                        v14 = 308;
                    }
                }
                else
                {
LABEL_9b6e74:
                    *(unsigned int *)&a0->padding_4f8[8] = 0;
                    if (!sub_963788(a0, &v8->padding_59[247], (unsigned long long)v8->padding_0) || !sub_9639ec(a0, &v8->padding_59[247], &v4, &v3, (unsigned long long)v8->padding_0, 1))
                    {
LABEL_9b6d90:
                        sub_ad6020(v4);
                        sub_ad6020(v3);
                        sub_a6c2e4(*(long long *)&v8->padding_171[271], "ssl/statem/statem_srvr.c", 2181);
                        sub_a6c2e4(*(long long *)&a0->padding_ae8[104], "ssl/statem/statem_srvr.c", 2182);
                        *(unsigned long long *)&a0->padding_ae8[104] = 0;
                        return 0;
                    }
                    *(unsigned int *)&a0->padding_308[416] = 0;
                    if (v3 && (int)sub_ad69e4(v3) >= 1)
                    {
                        v18 = 0;
                        do
                        {
                            v19 = v18;
                            v20 = sub_ad69f8(v3, v19);
                            if (sub_95c238(v20, v19) == 0x30000ff)
                            {
                                if (!*(int *)&a0->padding_b60[56])
                                {
                                    *(unsigned int *)&a0->padding_308[416] = 1;
                                }
                                else
                                {
                                    sub_a368c8();
                                    sub_a369bc("ssl/statem/statem_srvr.c", 1834, "tls_early_post_process_client_hello");
                                    v12 = a0;
                                    v13 = 40;
                                    v14 = 345;
                                    goto LABEL_9b6d88;
                                }
                            }
                            else
                            {
                                if (sub_95c238(v20) == 0x3005600 && !sub_9b11bc(a0))
                                {
                                    sub_a368c8();
                                    sub_a369bc("ssl/statem/statem_srvr.c", 1847, "tls_early_post_process_client_hello");
                                    v12 = a0;
                                    v13 = 86;
                                    v14 = 373;
                                    goto LABEL_9b6d88;
                                }
                            }
                        } while ((v18 = (unsigned int)v18 + 1, (int)sub_ad69e4(v3) > (int)v18));
                    }
                    if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
                    {
                        v21 = sub_955e34(a0, v4, sub_96125c(a0));
                        if (v21)
                        {
                            if (*(int *)&a0->padding_888[64] != 1 || *(long long *)&a0->padding_1a8[336] && *(int *)(*(long long *)&a0->padding_1a8[336] + 24) == *(int *)(v21 + 24))
                            {
                                *(unsigned long long *)&a0->padding_1a8[336] = v21;
                                goto LABEL_9b6fd4;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/statem/statem_srvr.c", 1868, "tls_early_post_process_client_hello");
                                v12 = a0;
                                v13 = 47;
                                v14 = 186;
                            }
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/statem_srvr.c", 1858, "tls_early_post_process_client_hello");
                            v12 = a0;
                            v13 = 40;
                            v14 = 193;
                        }
                    }
                    else
                    {
LABEL_9b6fd4:
                        if (!sub_99af14(a0, 13, 128, *(long long *)&v8->padding_171[271], 0, 0))
                            goto LABEL_9b6d90;
                        if (v8->padding_0 || *(int *)&a0->padding_70[12] && a0->padding_950[90] & 1)
                        {
LABEL_9b6ffc:
                            if (sub_96612c(a0, 1))
                                goto LABEL_9b700c;
                            goto LABEL_9b6d90;
                        }
                        v22 = (unsigned int)sub_9667a0(a0, v8);
                        v23 = arm64g_calculate_condition(1, v22, 1, 0);
                        if (v23 & 1)
                            goto LABEL_9b6d90;
                        if (v22 != 1)
                            goto LABEL_9b6ffc;
                        *(unsigned int *)&a0->padding_4f8[8] = 1;
LABEL_9b700c:
                        v24 = a0->field_18;
                        v25 = (int)v24->field_d8[80];
                        if (!(v25 >> 3 & 1) && v24->field_0 >= 772 && v24->field_0 != 0x10000)
                        {
                            _memcpy(&a0->padding_908[24], *(long long *)&a0->padding_ae8[104] + 48, *(long long *)(*(long long *)&a0->padding_ae8[104] + 40));
                            *(long long *)&a0->padding_929[23] = *(long long *)(*(long long *)&a0->padding_ae8[104] + 40);
                            v25 = (int)v24->field_d8[80];
                        }
                        if ((v25 >> 3 & 1 || v24->field_0 < 772 || v24->field_0 == 0x10000) && *(int *)&a0->padding_4f8[8])
                        {
                            if ((int)sub_ad69e4(v4) >= 1)
                            {
                                v26 = 0;
                                do
                                {
                                    v27 = sub_ad69f8(v4, v26);
                                    if (v27->field_18 == *(int *)(*(long long *)(*(long long *)&a0->padding_888[112] + 760) + 24))
                                        goto LABEL_9b715c;
                                } while ((v26 = (unsigned int)v26 + 1, (int)v26 < (int)sub_ad69e4(v4)));
                            }
                            sub_a368c8();
                            sub_a369bc("ssl/statem/statem_srvr.c", 1955, "tls_early_post_process_client_hello");
                            v12 = a0;
                            v13 = 47;
                            v14 = 215;
                        }
                        else
                        {
LABEL_9b715c:
                            if (*(long long *)&v8->padding_159[7])
                            {
                                v28 = &v8->padding_159[15];
                                if (!_memchr(v28, 0))
                                {
                                    sub_a368c8();
                                    v37 = 1972;
                                    goto LABEL_9b7330;
                                }
                                if (a0->padding_950[88] >> 6 & 1)
                                    sub_9b8630(a0, v8);
                                if (!sub_99b03c(a0, 128, *(long long *)&v8->padding_171[271], 0, 0, 1))
                                    goto LABEL_9b6d90;
                                if ((int)sub_c60e4c(a0, 1, &a0->field_168, 32, v2) <= 0)
                                {
                                    sub_a368c8();
                                    v44 = 1996;
                                    goto LABEL_9b73c0;
                                }
                                if (*(int *)&a0->padding_4f8[8])
                                {
LABEL_9b71d4:
                                    *(unsigned long long *)&a0->padding_308[128] = 0;
                                    v29 = a0->field_18;
                                    v30 = (int)v29->field_d8[80];
                                    if (!(v30 >> 3 & 1) && v29->field_0 >= 772 && v29->field_0 != 0x10000)
                                    {
                                        if (*(long long *)&v8->padding_159[7] == 1)
                                            goto LABEL_9b75a0;
                                        sub_a368c8();
                                        sub_a369bc("ssl/statem/statem_srvr.c", 2075, "tls_early_post_process_client_hello");
                                        v12 = a0;
                                        v13 = 47;
                                        goto LABEL_9b756c;
                                    }
                                    else
                                    {
                                        v31 = *(int *)(*(long long *)&a0->padding_888[112] + 752);
                                        if (v31)
                                        {
                                            if (sub_9b0e10(a0))
                                            {
                                                v32 = v9;
                                                if ((int)sub_ad69e4(*(long long *)(v9 + 280)) >= 1)
                                                {
                                                    v33 = 0;
                                                    do
                                                    {
                                                        v34 = sub_ad69f8(*(long long *)(v32 + 280), v33);
                                                        if (v31 == *(int *)v34)
                                                        {
                                                            *(unsigned long long *)&a0->padding_308[128] = v34;
                                                            goto LABEL_9b7600;
                                                        }
                                                    } while ((v33 = (unsigned int)v33 + 1, (int)v33 < (int)sub_ad69e4(*(long long *)(v32 + 280))));
                                                }
                                                else
                                                {
                                                    v34 = 0;
                                                }
                                                if (!*(long long *)&a0->padding_308[128])
                                                {
                                                    sub_a368c8();
                                                    sub_a369bc("ssl/statem/statem_srvr.c", 2101, "tls_early_post_process_client_hello");
                                                    v12 = a0;
                                                    v13 = 40;
LABEL_9b756c:
                                                    v14 = 341;
                                                }
                                                else
                                                {
LABEL_9b7600:
                                                    if (*(long long *)&v8->padding_159[7])
                                                    {
                                                        v35 = 0;
                                                        v36 = 1;
                                                        do
                                                        {
                                                            if (v31 == v28->padding_0[v35])
                                                                goto LABEL_9b75a4;
                                                        } while ((v35 = v36, v36 += 1, v35 < (unsigned long long)*(long long *)&v8->padding_159[7]));
                                                    }
                                                    sub_a368c8();
                                                    v37 = 2111;
LABEL_9b7330:
                                                    sub_a369bc("ssl/statem/statem_srvr.c", v37, "tls_early_post_process_client_hello");
                                                    v12 = a0;
                                                    v13 = 47;
                                                    v14 = 342;
                                                }
                                            }
                                            else
                                            {
                                                sub_a368c8();
                                                sub_a369bc("ssl/statem/statem_srvr.c", 2088, "tls_early_post_process_client_hello");
                                                v12 = a0;
                                                v13 = 40;
                                                v14 = 340;
                                            }
                                        }
                                        else
                                        {
                                            if (*(int *)&a0->padding_4f8[8])
                                            {
                                                v34 = 0;
                                                goto LABEL_9b75b8;
                                            }
                                            if (sub_9b0e10(a0) && *(long long *)(v9 + 280) && !(v38 = (unsigned int)sub_ad69e4(*(long long *)(v9 + 280)), v38 < 1))
                                            {
                                                v39 = 0;
                                                do
                                                {
                                                    v40 = sub_ad69f8(*(long long *)(v9 + 280), v39);
                                                    if (*(long long *)&v8->padding_159[7])
                                                    {
                                                        v34 = v40;
                                                        v41 = 0;
                                                        v42 = 1;
                                                        do
                                                        {
                                                            if (*v40 == v28->padding_0[v41])
                                                            {
                                                                *(unsigned long long *)&a0->padding_308[128] = v34;
                                                                goto LABEL_9b75a4;
                                                            }
                                                        } while ((v41 = v42, v42 += 1, v41 < (unsigned long long)*(long long *)&v8->padding_159[7]));
                                                    }
                                                } while ((v34 = 0, v39 = (unsigned int)v39 + 1, (unsigned int)v39 != v38));
                                            }
LABEL_9b75a0:
                                            v34 = 0;
LABEL_9b75a4:
                                            if (!*(int *)&a0->padding_4f8[8])
                                                goto LABEL_9b75d0;
                                            v29 = a0->field_18;
                                            v30 = (int)v29->field_d8[80];
LABEL_9b75b8:
                                            if (v30 >> 3 & 1 || v29->field_0 < 772 || v29->field_0 == 0x10000)
                                                goto LABEL_9b76cc;
LABEL_9b75d0:
                                            sub_ad6020(*(long long *)&a0->padding_4f8[88]);
                                            *(unsigned long long *)&a0->padding_4f8[88] = v4;
                                            if (v4)
                                            {
                                                v4 = 0;
                                                if (!*(int *)&a0->padding_4f8[8])
                                                {
                                                    if (v34)
                                                        v43 = *(int *)v34;
                                                    else
                                                        v43 = 0;
                                                    *(unsigned int *)(*(long long *)&a0->padding_888[112] + 752) = v43;
                                                }
LABEL_9b76cc:
                                                sub_ad6020(v4);
                                                sub_ad6020(v3);
                                                sub_a6c2e4(*(long long *)&v8->padding_171[271], "ssl/statem/statem_srvr.c", 2174);
                                                sub_a6c2e4(*(long long *)&a0->padding_ae8[104], "ssl/statem/statem_srvr.c", 2175);
                                                *(unsigned long long *)&a0->padding_ae8[104] = 0;
                                                goto LABEL_9b7708;
                                            }
                                            else
                                            {
                                                sub_a368c8();
                                                v44 = 2158;
LABEL_9b73c0:
                                                sub_a369bc("ssl/statem/statem_srvr.c", v44, "tls_early_post_process_client_hello");
                                                v12 = a0;
                                                v13 = 80;
                                                v14 = 786691;
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    if (sub_96a3a4(a0))
                                    {
                                        if (!*(int *)&a0->padding_4f8[8] && a0->field_48 >= 769 && !((char)((char)a0->field_18->field_d8[80]) >> 3 & 1) && (a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000) && *(long long *)&a0->padding_a2c[172])
                                        {
                                            v1 = 0;
                                            v0 = 0x200;
                                            (*(long long *)&a0->padding_a2c[172])();
                                        }
                                        goto LABEL_9b71d4;
                                    }
                                    goto LABEL_9b6d90;
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/statem/statem_srvr.c", 1964, "tls_early_post_process_client_hello");
                                v12 = a0;
                                v13 = 50;
                                v14 = 0xbb;
                            }
                        }
                    }
                }
            }
        }
    }
    else if ((char)(v8->field_4 >> 8) == 3)
    {
        *(unsigned int *)&a0->padding_9b3[25] = v8->field_4;
        goto LABEL_9b6cc4;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 1765, "tls_early_post_process_client_hello");
        v12 = a0;
        v13 = 70;
        v14 = 252;
    }
LABEL_9b6d88:
    sub_9a58a4(v12, v13, v14, 0);
    goto LABEL_9b6d90;
}
