/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a8c5c..0x9a9514 (2232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a8c5c_0 {
    void* field_0;
    unsigned long long field_8;
} st_9a8c5c_0;

typedef struct st_9a8c5c_2 {
    long long field_0;
    char padding_8[208];
    void* field_d8;
} st_9a8c5c_2;

typedef struct st_9a8c5c_8 {
    unsigned int field_0;
    char padding_4[212];
    void* field_d8;
} st_9a8c5c_8;

typedef struct st_9a8c5c_7 {
    uint128_t field_0;
    uint128_t field_10;
    char padding_20[520];
    unsigned long long field_228;
    char padding_230[128];
    unsigned int field_2b0;
    unsigned int field_2b4;
    char padding_2b8[1208];
    unsigned long long field_770;
    char padding_778[32];
    struct st_9a8c5c_6 *field_798;
    char padding_7a0[472];
    struct st_9a8c5c_5 *field_978;
} st_9a8c5c_7;

typedef struct st_9a8c5c_4 {
    char padding_0[8];
    struct st_9a8c5c_1 *field_8;
    char padding_10[8];
    struct st_9a8c5c_2 *field_18;
    char padding_20[40];
    long long field_48;
    char padding_50[280];
    uint128_t field_168;
    uint128_t field_178;
    char padding_188[520];
    unsigned long long field_390;
    char padding_398[128];
    long long field_418;
    long long field_41c;
    char padding_424[1204];
    unsigned long long field_8d8;
    char field_8e0;
    char padding_8e1[31];
    struct st_9a8c5c_3 *field_900;
    char padding_908[32];
    char field_928;
    char padding_929[439];
    struct st_9a8c5c_5 *field_ae0;
} st_9a8c5c_4;

typedef struct st_9a8c5c_1 {
    char padding_0[280];
    long long field_118;
} st_9a8c5c_1;

typedef struct st_9a8c5c_6 {
    unsigned int field_0;
    char padding_4[588];
    unsigned long long field_250;
    char field_258;
    char padding_259[31];
    unsigned long long field_278;
} st_9a8c5c_6;

typedef struct st_9a8c5c_3 {
    long long field_0;
    char padding_8[584];
    unsigned long long field_250;
    char field_258;
    char padding_259[31];
    unsigned long long field_278;
} st_9a8c5c_3;

typedef struct st_9a8c5c_5 {
    unsigned long long field_0;
} st_9a8c5c_5;


unsigned long long sub_9a8c5c(st_9a8c5c_4 *a0, st_9a8c5c_0 *a1)
{
    long long v7;  // x1
    unsigned long v8;  // x10
    unsigned long long v17;  // 4110
    unsigned long v18;  // 4110
    unsigned long long v19;  // 4110
    unsigned long v20;  // 4110
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    unsigned long long v24;  // 4110
    unsigned long v25;  // 4110
    unsigned long long v26;  // 4110
    void* v9;  // x8
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4102
    st_9a8c5c_4 *v31;  // x0
    long long v32;  // x1
    long long v33;  // x2
    unsigned long v34;  // x8
    void* v36;  // x9
    unsigned long long v10;  // x25
    unsigned long long v37;  // x26
    st_9a8c5c_7 *v38;  // x9
    uint128_t v39;  // q1
    unsigned long long n;  // x22
    unsigned long long v41;  // x8
    unsigned long long v42;  // x8
    unsigned long v43;  // x23
    void* v44;  // x21
    unsigned long v45;  // x20
    unsigned long long v46;  // x9
    unsigned long long v11;  // x9
    unsigned long long v47;  // x10
    unsigned long v48;  // x9
    unsigned long long v49;  // x9
    unsigned long long v50;  // x8
    st_9a8c5c_8 *v51;  // x25
    unsigned long v52;  // x27
    unsigned long long v53;  // x8
    long long v54;  // w10
    long long v55;  // x25
    st_9a8c5c_6 *v56;  // x24
    unsigned long v12;  // cc_dep1
    long long v57;  // w8
    unsigned long long v58;  // x0
    unsigned long v13;  // 4110
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    long long v0;  // [bp-0x84]
    unsigned long long v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = 0;
    if (1 >= a1->field_8)
    {
        sub_a368c8();
        v7 = 1483;
    }
    else
    {
        v8 = *(short *)a1->field_0;
        v9 = a1->field_0 + 2;
        v10 = (unsigned int)((v8 & 0xff00) >> 8) | (unsigned int)v8 * 0x100 & 0xff00ff00;
        v11 = a1->field_8 - 2;
        a1->field_0 = v9;
        a1->field_8 = v11;
        if ((int)a0->field_48 == 772 && (unsigned int)v10 == 0x303)
        {
            v12 = v11;
            if (v11 < 32)
                goto LABEL_9a8d48;
            if (*(long long *)v9 == 1252452481681400271)
            {
                v13 = arm64g_calculate_condition(4, v12, 32, 0);
                v14 = 4;
                v15 = (v13 & 1 ? 10500253710780472766 : 0);
                v16 = (v13 & 1 ? (long long)v9[8] : 0);
                v17 = arm64g_calculate_condition(4, v15, v16, 0);
                if (!(v17 & 1))
                    goto LABEL_9a8d02;
LABEL_9a8d01:
                v20 = arm64g_calculate_condition(v14, v15, v16, 0);
                v21 = 4;
                v22 = (v20 & 1 ? 6813026469335376578 : 0);
                v23 = (v20 & 1 ? (long long)v9[16] : 0);
                v24 = arm64g_calculate_condition(4, v22, v23, 0);
                if (!(v24 & 1))
                    goto LABEL_9a8d06;
                goto LABEL_9a8d05;
            }
            v18 = arm64g_calculate_condition(4, v12, 32, 0);
            v14 = 0;
            v15 = (v18 & 1 ? 10500253710780472766 : 0);
            v16 = (v18 & 1 ? (long long)v9[8] : 0);
            v19 = arm64g_calculate_condition(0, v15, v16, 0);
            if (v19 & 1)
                goto LABEL_9a8d01;
LABEL_9a8d02:
            v25 = arm64g_calculate_condition(v14, v15, v16, 0);
            v21 = 0;
            v22 = (v25 & 1 ? 6813026469335376578 : 0);
            v23 = (v25 & 1 ? (long long)v9[16] : 0);
            v26 = arm64g_calculate_condition(0, v22, v23, 0);
            if (v26 & 1)
            {
LABEL_9a8d05:
                v27 = arm64g_calculate_condition(v21, v22, v23, 0);
                v28 = arm64g_calculate_condition(20, (v27 & 1 ? 11255525474468208135 : 0), (v27 & 1 ? (long long)v9[24] : 0), 0);
                if (!(v28 & 1))
                    goto LABEL_9a8d0c;
LABEL_9a8d64:
                v37 = 0;
                v38 = (a0->padding_50)[1];
                v39 = (int128_t)v9[16];
                v38->field_0 = *(int128_t *)v9;
                v38->field_10 = v39;
                v34 = a1->field_8;
                v36 = a1->field_0 + 32;
                a1->field_0 = v36;
                goto LABEL_9a8d80;
            }
            else
            {
LABEL_9a8d06:
                v29 = arm64g_calculate_condition(v21, v22, v23, 0);
                v30 = arm64g_calculate_condition(16, (v29 & 1 ? 11255525474468208135 : 0), (v29 & 1 ? (long long)v9[24] : 0), 0);
                if (v30 & 1)
                    goto LABEL_9a8d64;
LABEL_9a8d0c:
                if (*(int *)&a0->padding_424[1184])
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 1493, "tls_process_server_hello");
                    sub_9a58a4(a0, 10, 244, 0);
                    sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 1833);
                    return 0;
                }
                *(unsigned int *)&a0->padding_424[1184] = 1;
                if (!sub_c64b00(a0, 772))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 1499, "tls_process_server_hello");
                    sub_9a58a4(a0, 80, 0xc0103, 0);
                    sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 1833);
                    return 0;
                }
                v34 = a1->field_8;
                if (32 > v34)
                {
                    sub_a368c8();
                    v7 = 1504;
                }
                else
                {
                    v36 = a1->field_0 + 32;
                    a1->field_0 = v36;
                    v37 = 1;
LABEL_9a8d80:
                    a1->field_8 = v34 - 32;
                    if (v34 == 32 || (n = *(char *)v36, v41 = v34 - 33, v42 = v41 - n, n > v41))
                    {
                        sub_a368c8();
                        v7 = 1516;
                    }
                    else
                    {
                        v43 = v36 + 1;
                        v44 = v43 + n;
                        a1->field_0 = v44;
                        a1->field_8 = v42;
                        if ((unsigned int)n >= 33)
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/statem_clnt.c", 1522, "tls_process_server_hello");
                            sub_9a58a4(a0, 47, 300, 0);
                            sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 1833);
                            return 0;
                        }
                        if (1 >= v42)
                        {
                            sub_a368c8();
                            v7 = 1527;
                        }
                        else
                        {
                            a1->field_0 = v44 + 2;
                            a1->field_8 = v42 - 2;
                            if (v42 != 2)
                            {
                                v45 = (char)v44[2];
                                v46 = v42 - 3;
                                a1->field_0 = v44 + 3;
                                a1->field_8 = v46;
                                if (v42 == 3)
                                    v47 = v37 & 0xffffffff;
                                else
                                    v47 = 1;
                                if (!(v47 & 1))
                                {
                                    v3 = 0;
                                    v4 = 0;
LABEL_9a8f6c:
                                    if (!(v37 & 1) && (!sub_99a780(a0, &v3, 0x300, &v2, 0, 1) || !sub_9b1770(a0, v10, v2)))
                                    {
LABEL_9a8dcc:
                                        sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 1833);
                                        return 0;
                                    }
                                    v51 = a0->field_18;
                                    v52 = (int)v51->field_d8[80];
                                    if (!(v52 >> 3 & 1) && (int)v51->field_0 >= 772)
                                    {
                                        if (v51->field_0 == 0x10000)
                                            v53 = v37 & 0xffffffff;
                                        else
                                            v53 = 1;
                                        if (!(v53 & 1))
                                            goto LABEL_9a907c;
                                    }
                                    else
                                    {
                                        if (!(unsigned int)v37)
                                            goto LABEL_9a90a0;
                                    }
                                    if ((unsigned int)v45)
                                    {
                                        sub_a368c8();
                                        sub_a369bc("ssl/statem/statem_clnt.c", 1563, "tls_process_server_hello");
                                        v31 = a0;
                                        v32 = 47;
                                        v33 = 341;
                                    }
                                    else
                                    {
                                        if (*(long long *)&a0->padding_929[15] != n || _memcmp(v43, &a0->padding_908[16], n))
                                        {
                                            sub_a368c8();
                                            sub_a369bc("ssl/statem/statem_clnt.c", 1571, "tls_process_server_hello");
                                            v31 = a0;
                                            v32 = 47;
                                            v33 = 999;
                                        }
                                        else
                                        {
LABEL_9a907c:
                                            if ((unsigned int)v37)
                                            {
                                                if (!sub_9abc2c(a0, v44))
                                                {
                                                    sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 1833);
                                                    return 0;
                                                }
                                                return sub_9abe50(a0, &v3);
                                            }
LABEL_9a90a0:
                                            if (!(v52 >> 3 & 1))
                                            {
                                                if (v51->field_0 == 0x10000)
                                                    v54 = 0x100;
                                                else
                                                    v54 = 0x200;
                                                if ((int)v51->field_0 < 772)
                                                    v55 = 0x100;
                                                else
                                                    v55 = v54;
                                            }
                                            else
                                            {
                                                v55 = 0x100;
                                            }
                                            if (sub_c65068(a0, v55, v2))
                                            {
                                                *(unsigned int *)&a0->padding_424[216] = 0;
                                                if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1 || (int)a0->field_18->field_0 < 772 || (int)a0->field_18->field_0 == 0x10000)
                                                {
                                                    if ((int)a0->field_48 >= 769 && *(long long *)&a0->padding_929[423] && *(long long *)(*(long long *)&a0->padding_8e1[15] + 808))
                                                    {
                                                        v1 = 0;
                                                        v0 = 0x200;
                                                        (*(long long *)&a0->padding_929[423])();
                                                    }
                                                    if ((unsigned int)n && (v56 = *(long long *)&a0->padding_8e1[15], v56->field_250 == n && !_memcmp(v43, &v56->field_258, n)))
                                                    {
                                                        *(unsigned int *)&a0->padding_424[216] = 1;
                                                        goto LABEL_9a9248;
                                                    }
                                                    goto LABEL_9a923c;
                                                }
                                                if (sub_992a0c(&a0[1].padding_50[272]))
                                                {
                                                    sub_a368c8();
                                                    sub_a369bc("ssl/statem/statem_clnt.c", 1605, "tls_process_server_hello");
                                                    v31 = a0;
                                                    v32 = 10;
                                                    v33 = 182;
                                                }
                                                else
                                                {
                                                    if (!sub_99af14(a0, 28, 0x200, v2, 0, 0))
                                                    {
                                                        sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 1833);
                                                        return 0;
                                                    }
LABEL_9a923c:
                                                    v56 = *(long long *)&a0->padding_8e1[15];
                                                    if (*(int *)&a0->padding_424[216])
                                                    {
LABEL_9a9248:
                                                        if (*(long long *)&a0->padding_424[1192] == v56->field_278 && !_memcmp(v56 + 1, &a0->padding_424[1200]))
                                                            goto LABEL_9a9310;
                                                        sub_a368c8();
                                                        sub_a369bc("ssl/statem/statem_clnt.c", 1665, "tls_process_server_hello");
                                                        v31 = a0;
                                                        v32 = 47;
                                                        v33 = 272;
                                                    }
                                                    else
                                                    {
                                                        if (v56->field_250)
                                                        {
                                                            do
                                                            {
                                                                /* unsupported instruction */;
                                                                /* unsupported instruction */;
                                                            } while (/* unsupported instruction */ ^ 1);
                                                            if (sub_96612c(a0, 0))
                                                            {
                                                                v56 = *(long long *)&a0->padding_8e1[15];
                                                                goto LABEL_9a92c8;
                                                            }
                                                            goto LABEL_9a8dcc;
                                                        }
LABEL_9a92c8:
                                                        v56->field_0 = a0->field_48;
                                                        if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1 || (int)a0->field_18->field_0 < 772 || (int)a0->field_18->field_0 == 0x10000)
                                                        {
                                                            v56->field_250 = n;
                                                            if ((unsigned int)n)
                                                            {
                                                                _memcpy(&v56->field_258, v43, n);
                                                                v56 = *(long long *)&a0->padding_8e1[15];
                                                            }
                                                        }
LABEL_9a9310:
                                                        v57 = (int)a0->field_48;
                                                        if (v57 == v56->field_0)
                                                        {
                                                            *(int *)&a0->padding_398[120] = v57;
                                                            *(int *)&a0->padding_398[124] = v57;
                                                            if (!sub_9abc2c(a0, v44))
                                                            {
                                                                sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 1833);
                                                                return 0;
                                                            }
                                                            if (!*(int *)&a0->padding_424[216] || *(int *)(*(long long *)&a0->padding_8e1[15] + 752) == (unsigned int)v45)
                                                            {
                                                                if ((unsigned int)v45)
                                                                {
                                                                    if (sub_9b0e10(a0))
                                                                    {
                                                                        v58 = sub_95c240(a0->field_8->field_118, v45);
                                                                        if (v58)
                                                                            goto LABEL_9a9418;
                                                                        sub_a368c8();
                                                                        sub_a369bc("ssl/statem/statem_clnt.c", 1750, "tls_process_server_hello");
                                                                        v31 = a0;
                                                                        v32 = 47;
                                                                        v33 = 0x101;
                                                                    }
                                                                    else
                                                                    {
                                                                        sub_a368c8();
                                                                        sub_a369bc("ssl/statem/statem_clnt.c", 1741, "tls_process_server_hello");
                                                                        v31 = a0;
                                                                        v32 = 47;
                                                                        v33 = 343;
                                                                    }
                                                                }
                                                                else
                                                                {
                                                                    v58 = 0;
LABEL_9a9418:
                                                                    *(unsigned long long *)&a0->padding_188[0x200] = v58;
                                                                    if (sub_99b03c(a0, v55, v2, 0, 0, 1))
                                                                    {
                                                                        if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1) && (int)a0->field_18->field_0 >= 772 && (int)a0->field_18->field_0 != 0x10000)
                                                                            (*(long long *)a0->field_18->field_d8)();
                                                                        sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 1830);
                                                                        return 3;
                                                                    }
                                                                    goto LABEL_9a8dcc;
                                                                }
                                                            }
                                                            else
                                                            {
                                                                sub_a368c8();
                                                                sub_a369bc("ssl/statem/statem_clnt.c", 1735, "tls_process_server_hello");
                                                                v31 = a0;
                                                                v32 = 47;
                                                                v33 = 344;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            sub_a368c8();
                                                            sub_a369bc("ssl/statem/statem_clnt.c", 1703, "tls_process_server_hello");
                                                            v31 = a0;
                                                            v32 = 70;
                                                            v33 = 210;
                                                        }
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                sub_a368c8();
                                                sub_a369bc("ssl/statem/statem_clnt.c", 1592, "tls_process_server_hello");
                                                v31 = a0;
                                                v32 = 47;
                                                v33 = 110;
                                            }
                                        }
                                    }
                                }
                                else if (v46 >= 2 && !(v48 = (short)v44[3], v49 = (unsigned int)((v48 & 0xff00) >> 8) | (unsigned int)v48 * 0x100 & 0xff00ff00, v42 - 5 != v49))
                                {
                                    v50 = v44 + 5;
                                    a1->field_0 = v50 + v49;
                                    a1->field_8 = 0;
                                    v3 = v50;
                                    v4 = v49;
                                    goto LABEL_9a8f6c;
                                }
                                else
                                {
                                    sub_a368c8();
                                    sub_a369bc("ssl/statem/statem_clnt.c", 1541, "tls_process_server_hello");
                                    v31 = a0;
                                    v32 = 50;
                                    v33 = 271;
                                }
                                sub_9a58a4(v31, v32, v33, 0);
                                sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 1833);
                                return 0;
                            }
                            sub_a368c8();
                            v7 = 1532;
                        }
                    }
                }
            }
        }
        else
        {
            if (32 <= v11)
                goto LABEL_9a8d64;
LABEL_9a8d48:
            sub_a368c8();
            v7 = 1509;
        }
    }
    sub_a369bc("ssl/statem/statem_clnt.c", v7, "tls_process_server_hello");
    sub_9a58a4(a0, 50, 159, 0);
    sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 1833);
    return 0;
}
