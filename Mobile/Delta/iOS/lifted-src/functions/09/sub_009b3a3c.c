/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b3a3c..0x9b4438 (2556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b3a3c_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_9b3a3c_2;

typedef struct st_9b3a3c_1 {
    char padding_0[216];
    struct st_9b3a3c_0 *field_d8;
} st_9b3a3c_1;

typedef struct st_9b3a3c_7 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    struct st_9b3a3c_1 *field_18;
    char padding_20[216];
    struct st_9b3a3c_2 *field_f8;
    char padding_100[512];
    void* field_300;
    char field_308;
    char padding_309[199];
    struct st_9b3a3c_3 *field_3d0;
    unsigned long long field_3d8;
    char padding_3e0[1184];
    struct st_9b3a3c_4 *field_880;
    char padding_888[120];
    struct st_9b3a3c_6 *field_900;
} st_9b3a3c_7;

typedef struct st_9b3a3c_4 {
    char padding_0[16];
    struct st_9b3a3c_5 *field_10;
} st_9b3a3c_4;

typedef struct st_9b3a3c_3 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[10];
    unsigned int field_1c;
} st_9b3a3c_3;

typedef struct st_9b3a3c_6 {
    char padding_0[776];
    char field_308;
} st_9b3a3c_6;

typedef struct st_9b3a3c_0 {
    char padding_0[80];
    char field_50;
} st_9b3a3c_0;

typedef struct st_9b3a3c_5 {
    char field_0;
} st_9b3a3c_5;

extern char g_10002b0;

char sub_9b3a3c(st_9b3a3c_7 *a0, long long a1)
{
    st_9b3a3c_7 *v18;  // x20
    st_9b3a3c_3 *v19;  // x22
    long long v28;  // x25
    long long v29;  // x1
    long long v30;  // x1
    char v31;  // x0
    char v32;  // x20
    char v33;  // x0
    long long v34;  // x1
    long long v35;  // x2
    long long v36;  // x1
    long long v37;  // x2
    char v20;  // x23
    unsigned long long v38;  // x0
    unsigned long long v39;  // x25
    char v40;  // x0
    unsigned long v41;  // cc_op
    unsigned long v42;  // cc_dep1
    unsigned long v43;  // cc_dep2
    unsigned long v44;  // cc_ndep
    char v45;  // x26
    long long v47;  // x1
    unsigned long v21;  // x19
    char v48;  // x24
    unsigned long long v49;  // x8
    unsigned long long v50;  // 4110
    unsigned long long v51;  // 4106
    unsigned long long v52;  // 4110
    unsigned long long v53;  // 4106
    unsigned int v54;  // w0
    unsigned long long v55;  // 4127
    int v56;  // w26
    unsigned int v57;  // w0
    unsigned long v22;  // x28
    unsigned long long v58;  // 4154
    int v59;  // w8
    unsigned long v60;  // x26
    unsigned int v61;  // w0
    unsigned long long v62;  // 4139
    unsigned long v63;  // x8
    long long v64;  // x21
    long long v66;  // x22
    long long v67;  // x21
    char v23;  // w27
    char v24;  // x25
    char v25;  // x24
    st_9b3a3c_4 *v26;  // x8
    char v27;  // x0
    long long v0;  // [bp-0xf8]
    long long v1;  // [bp-0xf0]
    unsigned long v2;  // [bp-0xe8]
    char v3;  // [bp-0xe0]
    char v4;  // [bp-0xd8]
    long long v5;  // [bp-0xd0]
    char v6;  // [bp-0xc8]
    long long v7;  // [bp-0xc0]
    char v8;  // [bp-0xb8]
    char v9;  // [bp-0xb0]
    char v10;  // [bp-0xa8]
    char v11;  // [bp-0xa0]
    char v12;  // [bp-0x98]
    char v13;  // [bp-0x90]
    char v14;  // [bp-0x80]
    unsigned long v15;  // [bp-0x68]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v18 = a0;
    v15 = *(long long *)&g_10002b0;
    v12 = 0;
    v19 = a0->field_3d0;
    v20 = sub_a3f728();
    v11 = 0;
    v21 = v18->field_8;
    if (!sub_c68eb8(a1, &v9))
    {
        sub_a368c8();
        v29 = 2583;
        goto LABEL_9b3b34;
    }
    if (v20)
    {
        v22 = (int)v18->field_300[28];
        v13 = 0;
        v14 = 0;
        if (v22 & 72)
        {
            v23 = 0;
            v24 = 0;
            v25 = 0;
            goto LABEL_9b3ac8;
        }
        if (v22 & 258)
        {
            v26 = v18->field_880;
            if (*(int *)&v26[1].padding_0[0])
            {
                v27 = sub_96c838(v18);
                if (v27)
                {
                    v28 = v27;
                    goto LABEL_9b3ec4;
                }
                else
                {
                    sub_a368c8();
                    v29 = 2607;
                    goto LABEL_9b3b34;
                }
                goto LABEL_9b3b34;
            }
            v28 = *(long long *)&v26->padding_0[8];
            if (*(long long *)&v26->padding_0[8])
            {
                v27 = 0;
LABEL_9b3ec4:
                if (!sub_959e54(v18, 0x40007, sub_a59d18(v28), 0, v28))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 2631, "tls_construct_server_key_exchange");
                    v34 = 40;
                    v35 = 394;
LABEL_9b3f8c:
                    sub_9a58a4(v18, v34, v35, 0);
                    v23 = 0;
                    v32 = 0;
                    v33 = v27;
                    goto LABEL_9b3b8c;
                }
                if (*(long long *)&v18->field_308)
                {
                    sub_a368c8();
                    v30 = 2635;
                    goto LABEL_9b3f0c;
                }
                v31 = sub_956b1c(v18, v28);
                *(unsigned long long *)&v18->field_308 = v31;
                if (!v31)
                {
                    sub_a368c8();
                    v30 = 2641;
LABEL_9b3f0c:
                    sub_a369bc("ssl/statem/statem_srvr.c", v30, "tls_construct_server_key_exchange");
                    v34 = 80;
                    v35 = 786691;
                    goto LABEL_9b3f8c;
                }
                sub_a5a4c8(v27);
                if (sub_a5be20(*(long long *)&v18->field_308, "p", &v13) && sub_a5be20(*(long long *)&v18->field_308, "g", &v13 | 8) && sub_a5be20(*(long long *)&v18->field_308, "pub", &v14))
                {
                    v25 = 0;
                    v23 = 1;
                    v24 = 0;
                    goto LABEL_9b3ac8;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 2656, "tls_construct_server_key_exchange");
                    sub_9a58a4(v18, 80, 0xc0103, 0);
                    v32 = 0;
                    v33 = 0;
                    v23 = 1;
                    goto LABEL_9b3b8c;
                }
            }
            else
            {
                if (v26->field_10)
                    v26->field_10();
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 2626, "tls_construct_server_key_exchange");
                v36 = 80;
                v37 = 171;
            }
        }
        else if (v22 & 132)
        {
            if (*(long long *)&v18->field_308)
            {
                sub_a368c8();
                v29 = 2662;
LABEL_9b3b34:
                sub_a369bc("ssl/statem/statem_srvr.c", v29, "tls_construct_server_key_exchange");
                v36 = 80;
                v37 = 786691;
            }
            else
            {
                v38 = sub_9684a0(v18, 0xfffffffe);
                if ((unsigned int)v38)
                {
                    v39 = v38;
                    *(unsigned int *)&v18->field_900->field_308 = v38;
                    v33 = sub_956ba0(v18, v39);
                    *(unsigned long long *)&v18->field_308 = v33;
                    if (!v33)
                    {
                        v23 = 0;
                        v32 = 0;
LABEL_9b3b8c:
                        sub_a5a4c8(v33);
                        sub_a6c2e4(v12, "ssl/statem/statem_srvr.c", 2864);
                        sub_a3f73c(v20);
                        if (v23)
                        {
                            sub_9e48d4(*(unsigned long long *)&v13);
                            sub_9e48d4(*(unsigned long long *)((void*)&v13 + 8));
                            sub_9e48d4(*(unsigned long long *)&v14);
                            sub_9e48d4(*(unsigned long long *)((void*)&v14 + 8));
                        }
                        if (*(long long *)&g_10002b0 == v15)
                            return v32;
                        ___stack_chk_fail();
                    }
                    v40 = sub_a5b7c4();
                    if (v40)
                    {
                        v25 = v40;
                        v23 = 0;
                        v24 = v39 & 0xffffffff;
                        v13 = 0;
                        v14 = 0;
                        goto LABEL_9b3ac8;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 2686, "tls_construct_server_key_exchange");
                        v37 = 524304;
                        v36 = 80;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 2670, "tls_construct_server_key_exchange");
                    v36 = 40;
                    v37 = 315;
                }
            }
        }
        else
        {
            if (!(v22 >> 5 & 1))
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 2712, "tls_construct_server_key_exchange");
                v36 = 80;
                v37 = 250;
            }
            else if (*(long long *)&v18[1].padding_100[496] && *(long long *)&v18[1].padding_100[504] && v18[1].field_300 && *(long long *)&v18[1].field_308)
            {
                v23 = 0;
                v24 = 0;
                v25 = 0;
                v13 = CONCAT(*(long long *)&v18[1].padding_100[504], *(long long *)&v18[1].padding_100[496]);
                v14 = CONCAT(*(long long *)&v18[1].field_308, v18[1].field_300);
LABEL_9b3ac8:
                if ((char)v18->field_300[32] & 0x44444444 || (short)v18->field_300[28] & 456)
                {
                    v19 = 0;
                    goto LABEL_9b3aec;
                }
                if (v19)
                {
LABEL_9b3aec:
                    v41 = 10;
                    v42 = v22 & 456;
                    v43 = 0;
                    v44 = 0;
                    if (v22 & 456)
                    {
                        v45 = *(long long *)&v18->field_880[7].padding_0[0];
                        if (v45 && _strlen(v45) > 0x100)
                            goto LABEL_9b3e38;
                        if (sub_a6ec4c(a1, v45))
                            goto LABEL_9b3c54;
LABEL_9b3e38:
                        sub_a368c8();
                        v47 = 2737;
LABEL_9b3f3c:
                        sub_a369bc("ssl/statem/statem_srvr.c", v47, "tls_construct_server_key_exchange");
                        goto LABEL_9b3f48;
                    }
                    else
                    {
LABEL_9b3c54:
                        v0 = v25;
                        v1 = v24;
                        v2 = v21;
                        v3 = v20;
                        v48 = 0;
                    }
                    while (1)
                    {
                        if (!*(long long *)&(&v13)[v48])
                            break;
                        v49 = v22 & 32;
                        if (v48 == 16)
                        {
                            v50 = arm64g_calculate_condition(v41, v42, v43, v44);
                            v51 = arm64g_calculate_condition(20, (v50 & 1 ? v49 : 0x40000000), 0, 0);
                            if (!(v51 & 1))
                                goto LABEL_9b3c86;
                            goto LABEL_9b3c85;
                        }
                        v52 = arm64g_calculate_condition(v41, v42, v43, v44);
                        v53 = arm64g_calculate_condition(16, (v52 & 1 ? v49 : 0x40000000), 0, 0);
                        if (v53 & 1)
                        {
LABEL_9b3c85:
                            goto LABEL_9b3c86;
                        }
LABEL_9b3c86:
                        if (sub_c6876c())
                        {
                            if (v22 & 258 && v48 == 16)
                            {
                                v54 = sub_9e46a8(*(unsigned long long *)&v13);
                                v55 = arm64g_calculate_condition(177, v54, 7, 0);
                                v56 = (int)((v55 & 1 ? v54 + 14 : v54 + 7)) >> 3;
                                v57 = sub_9e46a8(*(unsigned long long *)&v14);
                                v58 = arm64g_calculate_condition(177, v57, 7, 0);
                                v59 = (v58 & 1 ? v57 + 14 : v57 + 7);
                                if (v56 != v59 >> 3)
                                {
                                    v60 = v56 - (v59 >> 3);
                                    if (sub_a6e830(a1, v60, &v10))
                                    {
                                        _bzero(v10, v60);
                                    }
                                    else
                                    {
                                        v67 = 2769;
LABEL_9b416c:
                                        sub_a368c8();
                                        sub_a369bc("ssl/statem/statem_srvr.c", v67, "tls_construct_server_key_exchange");
                                        sub_9a58a4(v18, 80, 0xc0103, 0);
                                        v32 = 0;
                                        v33 = 0;
                                        v20 = v3;
                                        goto LABEL_9b3b8c;
                                    }
                                }
                            }
                            v61 = sub_9e46a8(*(long long *)&(&v13)[v48]);
                            v62 = arm64g_calculate_condition(177, v61, 7, 0);
                            v63 = (v62 & 1 ? v61 + 14 : v61 + 7);
                            if (sub_a6e830(a1, (long long)(v63 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v63, 61) & 0xe00000001fffffff & 0x1fffffff, &v10) && sub_a6e970(a1))
                            {
                                sub_9e5350(*(long long *)&(&v13)[v48], v10);
                                v48 += 8;
                                v41 = 4;
                                v42 = v48;
                                v43 = 32;
                                v44 = 0;
                                if (v48 == 32)
                                    break;
                            }
                            else
                            {
                                v67 = 2778;
                                goto LABEL_9b416c;
                            }
                        }
                        else
                        {
                            v67 = 2755;
                            goto LABEL_9b416c;
                        }
                    }
                    v20 = v3;
                    if (v22 & 132)
                    {
                        if (sub_c68d5c(a1, 3, 1) && sub_c68d5c(a1, 0, 1) && sub_c68d5c(a1, v1, 1) && sub_a6ec4c(a1, v12, v0, 1))
                        {
                            sub_a6c2e4(v12, "ssl/statem/statem_srvr.c", 2799);
                            v12 = 0;
                        }
                        else
                        {
                            sub_a368c8();
                            v47 = 2796;
                            goto LABEL_9b3f3c;
                        }
                    }
                    if (!v19)
                        goto LABEL_9b4428;
                    v4 = 0;
                    if (!*(long long *)(v18->field_3d8 + 8) || !sub_969454(v2, v19, &v8))
                    {
                        v64 = 2812;
                    }
                    else if (!sub_c68ecc(a1, &v10))
                    {
                        v64 = 2817;
                    }
                    else if (!(v18->field_18->field_d8->field_50 >> 1 & 1) || sub_c68d5c(a1, v19->field_10, 2))
                    {
                        if (v8)
                            sub_a50a58(v8);
                        if ((int)sub_a565c4(v20, &v11) < 1)
                        {
                            v64 = 2831;
                        }
                        else if (v19->field_1c != 912 || (int)sub_ab2224(v11, 6) >= 1 && (int)sub_ab243c(v11, 0xffffffff) >= 1)
                        {
                            v66 = sub_9b2270(v18, &v5, v18->field_f8->field_8 + v9, v10);
                            if ((int)sub_a576f0(v20, 0, &v4, v5, v66) < 1 || !sub_a6e9d8(a1, v4, &v7, 2) || (int)sub_a576f0(v20, v7, &v4, v5, v66) < 1 || !sub_a6e86c(a1, v4, &v6, 2) || v7 != v6)
                            {
                                sub_a6c2e4(v5, "ssl/statem/statem_srvr.c", 2854);
                                v64 = 2855;
                            }
                            else
                            {
                                sub_a6c2e4(v5, "ssl/statem/statem_srvr.c", 2858);
LABEL_9b4428:
                                v33 = 0;
                                v32 = 1;
                                goto LABEL_9b3b8c;
                            }
                        }
                        else
                        {
                            v64 = 2837;
                        }
                    }
                    else
                    {
                        v64 = 2822;
                    }
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", v64, "tls_construct_server_key_exchange");
                    goto LABEL_9b3f50;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 2720, "tls_construct_server_key_exchange");
LABEL_9b3f48:
LABEL_9b3f50:
                    sub_9a58a4();
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 2702, "tls_construct_server_key_exchange");
                v36 = 80;
                v37 = 358;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 2588, "tls_construct_server_key_exchange");
        v36 = 80;
        v37 = 524294;
    }
    sub_9a58a4(v18, v36, v37, 0);
    v23 = 0;
}
