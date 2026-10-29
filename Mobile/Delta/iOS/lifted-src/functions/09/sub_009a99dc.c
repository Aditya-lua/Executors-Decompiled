/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a99dc..0x9aa67c (3232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a99dc_0 {
    void* field_0;
    unsigned long long field_8;
} st_9a99dc_0;

typedef struct st_9a99dc_2 {
    char padding_0[216];
    struct st_9a99dc_1 *field_d8;
} st_9a99dc_2;

typedef struct st_9a99dc_5 {
    char padding_0[8];
    struct st_9a99dc_6 *field_8;
    char padding_10[8];
    struct st_9a99dc_2 *field_18;
    char padding_20[736];
    void* field_300;
    char padding_308[248];
    struct st_9a99dc_3 *field_400;
    char padding_408[216];
    long long field_4e0;
    char padding_4e8[1048];
    struct st_9a99dc_4 *field_900;
    char padding_908[752];
    unsigned long long field_bf8;
    unsigned long long field_c00;
    unsigned long long field_c08;
    unsigned long long field_c10;
} st_9a99dc_5;

typedef struct st_9a99dc_3 {
    char padding_0[28];
    unsigned int field_1c;
} st_9a99dc_3;

typedef struct st_9a99dc_4 {
    char padding_0[672];
    long long field_2a0;
    char padding_2a8[96];
    unsigned int field_308;
} st_9a99dc_4;

typedef struct st_9a99dc_1 {
    char padding_0[80];
    char field_50;
} st_9a99dc_1;

typedef struct st_9a99dc_6 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_9a99dc_6;


unsigned long long sub_9a99dc(st_9a99dc_5 *a0, st_9a99dc_0 *a1)
{
    unsigned long long *v11;  // x21
    unsigned long v12;  // x26
    long long v21;  // x1
    void* v91;  // x8
    unsigned long long v92;  // x9
    unsigned long v93;  // x10
    unsigned long long v94;  // x10
    unsigned long long v95;  // x0
    unsigned long long v96;  // x0
    unsigned long long v97;  // x0
    unsigned long long v98;  // x0
    unsigned int v99;  // w8
    long long v22;  // x2
    unsigned int v101;  // w8
    unsigned long long v102;  // 4112
    unsigned long long v103;  // 4102
    unsigned long long v104;  // 4112
    unsigned long long v105;  // 4102
    unsigned long long v106;  // x8
    unsigned long long v107;  // x23
    unsigned long v108;  // x10
    unsigned long long v109;  // x8
    unsigned long v110;  // x10
    unsigned long long v23;  // x25
    unsigned long long v111;  // x24
    void* v112;  // x26
    unsigned long long v113;  // x0
    unsigned long long v114;  // x22
    long long v115;  // x1
    unsigned long long v116;  // x0
    unsigned long long v117;  // w0
    st_9a99dc_5 *v118;  // x0
    long long v119;  // x1
    long long v120;  // x2
    unsigned long long v24;  // x27
    unsigned long long *v25;  // x28
    void* v26;  // x21
    unsigned long long v27;  // x0
    long long v28;  // x2
    long long v29;  // x1
    unsigned long v30;  // cc_op
    void* v13;  // x20
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    unsigned long v33;  // cc_ndep
    unsigned long long v34;  // x9
    unsigned long v35;  // x10
    unsigned long long v36;  // x1
    unsigned long long v37;  // x9
    unsigned long long *v38;  // x23
    void* v39;  // x8
    unsigned long long v40;  // x9
    unsigned long long v14;  // x28
    unsigned long v41;  // x10
    unsigned long long v42;  // x24
    unsigned long long v43;  // x9
    void* v44;  // x26
    void* v45;  // x8
    unsigned long long v46;  // x9
    unsigned long v47;  // x10
    unsigned long long v48;  // x25
    unsigned long long v49;  // x24
    long long v50;  // x0
    unsigned long long v15;  // x27
    unsigned long v51;  // cc_op
    unsigned long v52;  // cc_dep1
    unsigned long v53;  // cc_dep2
    unsigned long v54;  // cc_ndep
    unsigned long long v55;  // 4110
    unsigned long long v56;  // 4102
    unsigned long long v16;  // x8
    unsigned long long v57;  // 4110
    unsigned long long v58;  // 4102
    unsigned long long v59;  // x26
    unsigned long long v60;  // x23
    unsigned long long v61;  // x24
    unsigned long long v62;  // x25
    unsigned long v17;  // x10
    unsigned long long v18;  // x23
    unsigned long long v63;  // x8
    void* v64;  // x11
    unsigned long long v65;  // w9
    unsigned long v66;  // x11
    unsigned long long v67;  // x23
    unsigned long long v68;  // x0
    unsigned long v69;  // x2
    unsigned long v70;  // x9
    void* v19;  // x24
    void* v71;  // x1
    unsigned int v72;  // w8
    unsigned long long v73;  // x0
    long long v74;  // x2
    long long v75;  // x1
    unsigned long long v76;  // x8
    unsigned long v77;  // x10
    unsigned long long v78;  // x1
    unsigned long long v79;  // x10
    void* v80;  // x8
    st_9a99dc_5 *v20;  // x0
    unsigned long long v81;  // x9
    unsigned long v82;  // x10
    unsigned long long v83;  // x23
    void* v84;  // x26
    void* v85;  // x8
    unsigned long v86;  // x9
    unsigned long v87;  // x24
    unsigned long v88;  // x9
    unsigned long long v89;  // x9
    void* v90;  // x25
    unsigned long long v0;  // [bp-0xa8]
    unsigned long long v1;  // [bp-0xa0]
    long long v2;  // [bp-0x98]
    unsigned long long v3;  // [bp-0x90]
    void* v4;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned long long v5;  // [bp-0x80]
    long long v6;  // [bp-0x78]
    unsigned long long v7;  // [bp-0x70]
    unsigned long long v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v7 = 0;
    v11 = a0->field_8;
    v12 = (int)a0->field_300[28];
    v13 = a1->field_0;
    v14 = a1->field_8;
    sub_a5a4c8(a0->field_4e0);
    a0->field_4e0 = 0;
    v15 = v12 & 456;
    if (v12 & 456)
    {
        v16 = a1->field_8 - 2;
        if (a1->field_8 < 2 || (v17 = *(short *)a1->field_0, v18 = (unsigned int)((v17 & 0xff00) >> 8) | (unsigned int)v17 * 0x100 & 0xff00ff00, v18 > v16))
        {
            sub_a368c8();
            v28 = "tls_process_ske_psk_preamble";
            v29 = 2210;
            goto LABEL_9a9a68;
        }
        else
        {
            v19 = a1->field_0 + 2;
            a1->field_0 = v19 + v18;
            a1->field_8 = v16 - v18;
            if (v18 >= 0x101)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_clnt.c", 2221, "tls_process_ske_psk_preamble");
                v20 = a0;
                v21 = 40;
                v22 = 146;
            }
            else
            {
                v23 = v15;
                v24 = v14;
                v25 = v11;
                v26 = v13;
                if (v18)
                {
                    sub_a6c2e4(a0->field_900->field_2a0, "include/internal/packet.h", 483);
                    v27 = sub_a6da14(v19, v18, "include/internal/packet.h", 486);
                    a0->field_900->field_2a0 = v27;
                    v13 = v26;
                    v11 = v25;
                    v14 = v24;
                    v15 = v23;
                    if (!v27)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 2230, "tls_process_ske_psk_preamble");
                        v20 = a0;
                        v21 = 80;
                        goto LABEL_9a9b6c;
                    }
                }
                else
                {
                    sub_a6c2e4(a0->field_900->field_2a0, "ssl/statem/statem_clnt.c", 2226);
                    a0->field_900->field_2a0 = 0;
                    v13 = v26;
                    v11 = v25;
                    v14 = v24;
                    v15 = v23;
                    goto LABEL_9a9ba0;
                }
                goto LABEL_9a9ba0;
            }
        }
    }
    else
    {
LABEL_9a9ba0:
        v30 = 10;
        v31 = v12 & 72;
        v32 = 0;
        v33 = 0;
        if (v12 & 72)
        {
LABEL_9a9bac:
            v101 = (int)a0->field_300[32] & 0x44;
            if (!v15)
            {
                v102 = arm64g_calculate_condition(v30, v31, v32, v33);
                v103 = arm64g_calculate_condition(3, (v102 & 1 ? v101 : 0), 0, 0);
                if (v103 & 1)
                    goto LABEL_9a9c98;
                goto LABEL_9a9bc8;
            }
            else
            {
                v104 = arm64g_calculate_condition(v30, v31, v32, v33);
                v105 = arm64g_calculate_condition(0, (v104 & 1 ? v101 : 0), 0, 0);
                if (!(v105 & 1))
                {
LABEL_9a9bc8:
                    if (!a1->field_8)
                        return 3;
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 2589, "tls_process_key_exchange");
                    v20 = a0;
                    v21 = 50;
                    v22 = 0x99;
                }
                else
                {
LABEL_9a9c98:
                    if (!sub_9ac05c(a0))
                    {
                        sub_a3f73c(0);
                        return 0;
                    }
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 2582, "tls_process_key_exchange");
                    v20 = a0;
                    v21 = 50;
                    v22 = 390;
                }
            }
        }
        else if (!(v12 >> 5 & 1))
        {
            if (v12 & 258)
            {
                v8 = 0;
                v34 = a1->field_8 - 2;
                if (a1->field_8 >= 2 && !(v35 = *(short *)a1->field_0, v36 = (unsigned int)((v35 & 0xff00) >> 8) | (unsigned int)v35 * 0x100 & 0xff00ff00, v37 = v34 - v36, v34 < v36))
                {
                    v38 = a0->field_8;
                    v39 = a1->field_0 + 2 + v36;
                    a1->field_0 = v39;
                    a1->field_8 = v37;
                    v40 = v37 - 2;
                    if (v37 >= 2 && !(v41 = *(short *)v39, v42 = (unsigned int)((v41 & 0xff00) >> 8) | (unsigned int)v41 * 0x100 & 0xff00ff00, v43 = v40 - v42, v40 < v42))
                    {
                        v44 = v39 + 2;
                        v45 = v44 + v42;
                        a1->field_0 = v45;
                        a1->field_8 = v43;
                        v46 = v43 - 2;
                        if (v43 >= 2 && !(v47 = *(short *)v45, v48 = (unsigned int)((v47 & 0xff00) >> 8) | (unsigned int)v47 * 0x100 & 0xff00ff00, v48 > v46))
                        {
                            v4 = v45 + 2;
                            a1->field_0 = v4 + v48;
                            a1->field_8 = v46 - v48;
                            v5 = sub_9e4db0();
                            v49 = sub_9e4db0(v44, v42, 0);
                            v50 = sub_9e4db0(v4, v48, 0);
                            v2 = v50;
                            v3 = v49;
                            if (!v5)
                            {
LABEL_9aa078:
                                sub_a368c8();
                                sub_a369bc("ssl/statem/statem_clnt.c", 2310, "tls_process_ske_dhe");
                                sub_9a58a4(a0, 80, 0x80003, 0);
                                v4 = 0;
                                v59 = 0;
                                goto LABEL_9aa140;
                            }
                            else if (v3)
                            {
                                v55 = arm64g_calculate_condition(v51 | 16, v52, v53, v54);
                                v56 = arm64g_calculate_condition(4, (v55 & 1 ? v50 : 0x40000000), 0, 0);
                                if (!(v56 & 1))
                                    goto LABEL_9a9f10;
                                goto LABEL_9aa078;
                            }
                            else
                            {
                                v57 = arm64g_calculate_condition(v51 | 16, v52, v53, v54);
                                v58 = arm64g_calculate_condition(0, (v57 & 1 ? v50 : 0x40000000), 0, 0);
                                if (v58 & 1)
                                    goto LABEL_9aa078;
LABEL_9a9f10:
                                v59 = sub_a6ee78();
                                if (v59 && sub_a6f188(v59, "p", v5) && sub_a6f188(v59, "g", v3) && sub_a6f188(v59, "pub", v50) && !(v0 = sub_a6f570(v59), !v0))
                                {
                                    v1 = sub_a5d168(*v38, "DH", v38[142]);
                                    if (v1)
                                    {
                                        if ((int)sub_a5cf34(v1) < 1 || (int)sub_a5cfb0(v1, &v8, 135, v0) <= 0)
                                        {
                                            sub_a368c8();
                                            sub_a369bc("ssl/statem/statem_clnt.c", 2332, "tls_process_ske_dhe");
                                            goto LABEL_9aa4a8;
                                        }
                                        sub_a5d6b0(v1);
                                        v1 = sub_a5d5a8(*v38, v8, v38[142]);
                                        if (!v1 || sub_a5c898(v1) != 1 || sub_a5c6f0(v1) != 1)
                                        {
                                            sub_a368c8();
                                            sub_a369bc("ssl/statem/statem_clnt.c", 2347, "tls_process_ske_dhe");
LABEL_9aa4a8:
                                            goto LABEL_9aa4ac;
                                        }
                                        else if (sub_959e54(a0, 0x40007, sub_a59d18(v8), 0, v8))
                                        {
                                            a0->field_4e0 = v8;
                                            v8 = 0;
                                            if ((char)a0->field_300[32] & 3)
                                                v4 = sub_9af2b4(a0);
                                            else
                                                v4 = 0;
                                            v60 = 0;
                                        }
                                        else
                                        {
                                            sub_a368c8();
                                            sub_a369bc("ssl/statem/statem_clnt.c", 2354, "tls_process_ske_dhe");
LABEL_9aa4ac:
                                            sub_9a58a4();
                                            v4 = 0;
                                            v60 = 1;
                                        }
                                        v61 = v0;
                                        v62 = v1;
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        sub_a369bc("ssl/statem/statem_clnt.c", 2327, "tls_process_ske_dhe");
                                        sub_9a58a4(a0, 80, 0xc0103, 0);
                                        v4 = 0;
                                        v62 = 0;
                                        v60 = 1;
                                        v61 = v0;
                                    }
                                }
                                else
                                {
                                    sub_a368c8();
                                    sub_a369bc("ssl/statem/statem_clnt.c", 2321, "tls_process_ske_dhe");
                                    sub_9a58a4(a0, 80, 0xc0103, 0);
                                    v4 = 0;
                                    v62 = 0;
                                    v61 = 0;
LABEL_9aa140:
                                    v60 = 1;
                                }
                            }
                            sub_a6eed4(v59);
                            sub_a71e38(v61);
                            sub_a5a4c8(v8);
                            sub_a5d6b0(v62);
                            sub_9e48d4(v5);
                            sub_9e48d4(v3);
                            sub_9e48d4(v2);
                            if (v60 & 1)
                            {
                                sub_a3f73c(0);
                                return 0;
                            }
                            goto LABEL_9aa284;
                        }
                    }
                }
                sub_a368c8();
                v28 = "tls_process_ske_dhe";
                v29 = 2300;
                goto LABEL_9a9a68;
            }
            v30 = 10;
            v31 = v12 & 132;
            v32 = 0;
            v33 = 0;
            if (v12 & 132)
            {
                v63 = a1->field_8;
                if (!v63 || (v64 = a1->field_0, v65 = *(char *)v64, a1->field_0 = v64 + 1, a1->field_8 = v63 - 1, 2 >= v63))
                {
                    sub_a368c8();
                    v74 = "tls_process_ske_ecdhe";
                    v75 = 2394;
                    goto LABEL_9a9dc8;
                }
                v66 = (short)v64[1];
                a1->field_0 = v64 + 3;
                a1->field_8 = v63 - 3;
                if (*(char *)v64 == 3 && !(v67 = (unsigned int)((v66 & 0xff00) >> 8) | (unsigned int)v66 * 0x100 & 0xff00ff00, !sub_968ec0(a0, v67, 1)))
                {
                    v68 = sub_956d2c(a0, v67);
                    a0->field_4e0 = v68;
                    if (!v68)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 2409, "tls_process_ske_ecdhe");
                        v20 = a0;
                        v21 = 80;
                        v22 = 314;
                    }
                    else if (!a1->field_8 || (v69 = *(char *)a1->field_0, v70 = a1->field_8 - 1, v69 > v70))
                    {
                        sub_a368c8();
                        v28 = "tls_process_ske_ecdhe";
                        v29 = 2414;
                        goto LABEL_9a9a68;
                    }
                    else
                    {
                        v71 = a1->field_0 + 1;
                        a1->field_0 = v71 + v69;
                        a1->field_8 = v70 - v69;
                        if ((int)sub_a5b680(a0->field_4e0, v71) > 0)
                        {
                            v72 = (char)a0->field_300[32];
                            v30 = 9;
                            v31 = v72 & 9;
                            v32 = 0;
                            v33 = 0;
                            if (v72 & 9)
                                v73 = sub_9af2b4(a0);
                            else
                                v73 = 0;
                            v4 = v73;
                            a0->field_900->field_308 = v67;
                            goto LABEL_9aa284;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/statem_clnt.c", 2422, "tls_process_ske_ecdhe");
                            v20 = a0;
                            v21 = 47;
                            v22 = 306;
                        }
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 2403, "tls_process_ske_ecdhe");
                    v20 = a0;
                    v21 = 47;
                    v22 = 378;
                }
            }
            else
            {
                if (!(unsigned int)v12)
                    goto LABEL_9a9bac;
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_clnt.c", 2483, "tls_process_key_exchange");
                v20 = a0;
                v21 = 10;
                v22 = 244;
            }
        }
        else
        {
            v76 = a1->field_8 - 2;
            if (a1->field_8 < 2 || (v77 = *(short *)a1->field_0, v78 = (unsigned int)((v77 & 0xff00) >> 8) | (unsigned int)v77 * 0x100 & 0xff00ff00, v79 = v76 - v78, v76 < v78 || (v80 = a1->field_0 + 2 + v78, a1->field_0 = v80, a1->field_8 = v79, v81 = v79 - 2, v79 < 2 || (v82 = *(short *)v80, v83 = (unsigned int)((v82 & 0xff00) >> 8) | (unsigned int)v82 * 0x100 & 0xff00ff00, v81 < v83))))
            {
LABEL_9a9d5c:
                sub_a368c8();
                v28 = "tls_process_ske_srp";
                v29 = 2250;
                goto LABEL_9a9a68;
            }
            v84 = v80 + 2;
            v85 = v84 + v83;
            v86 = v81 - v83;
            a1->field_0 = v85;
            a1->field_8 = v86;
            if (v81 == v83 || (v87 = *(char *)v85, v88 = v86 - 1, v89 = v88 - v87, v88 < v87))
                goto LABEL_9a9d5c;
            v90 = v85 + 1;
            v91 = v90 + v87;
            a1->field_0 = v91;
            a1->field_8 = v89;
            v92 = v89 - 2;
            if (v89 < 2 || (v93 = *(short *)v91, v94 = (unsigned int)((v93 & 0xff00) >> 8) | (unsigned int)v93 * 0x100 & 0xff00ff00, v94 > v92))
                goto LABEL_9a9d5c;
            v4 = v91 + 2;
            v5 = v94;
            a1->field_0 = v4 + v5;
            a1->field_8 = v92 - v5;
            v95 = sub_9e4db0();
            a0->field_bf8 = v95;
            if (v95 && !(v96 = sub_9e4db0(v84, v83, 0), a0->field_c00 = v96, !v96 || (v97 = sub_9e4db0(v90, v87, 0), a0->field_c08 = v97, !v97 || (v98 = sub_9e4db0(v4, v5, 0), a0->field_c10 = v98, !v98))))
            {
                if (!sub_9710e8(a0))
                {
                    sub_a3f73c(0);
                    return 0;
                }
                v99 = (char)a0->field_300[32];
                v30 = 9;
                v31 = v99 & 3;
                v32 = 0;
                v33 = 0;
                if (!(v99 & 3))
                    goto LABEL_9a9bac;
                v4 = sub_9af2b4(a0);
LABEL_9aa284:
                if (!v4)
                    goto LABEL_9a9bac;
                v8 = 0;
                v106 = a1->field_8;
                v107 = v14 - v106;
                if (v14 < v106 || (long long)v107 < 0)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 2501, "tls_process_key_exchange");
                    v20 = a0;
                    v21 = 50;
LABEL_9a9b6c:
                    v22 = 786691;
                }
                else if (!(a0->field_18->field_d8->field_50 >> 1 & 1))
                {
                    if (sub_9694a8(a0, v4))
                        goto LABEL_9aa360;
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 2518, "tls_process_key_exchange");
                    v20 = a0;
                    v21 = 80;
                    v22 = 333;
                }
                else if (1 >= v106)
                {
                    sub_a368c8();
                    v74 = "tls_process_key_exchange";
                    v75 = 2509;
LABEL_9a9dc8:
                    sub_a369bc("ssl/statem/statem_clnt.c", v75, v74);
                    v20 = a0;
                    v21 = 50;
                    v22 = 160;
                }
                else
                {
                    v108 = *(short *)a1->field_0;
                    a1->field_0 = a1->field_0 + 2;
                    a1->field_8 = v106 - 2;
                    if ((int)sub_969808(a0, (((((v108 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v108 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v108 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v108 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48 & 0xffffffff) <= 0)
                    {
                        sub_a3f73c(0);
                        return 0;
                    }
LABEL_9aa360:
                    if (sub_969454(v11, a0->field_400, &v8))
                    {
                        v109 = a1->field_8 - 2;
                        if (a1->field_8 >= 2 && !(v110 = *(short *)a1->field_0, v111 = (unsigned int)((v110 & 0xff00) >> 8) | (unsigned int)v110 * 0x100 & 0xff00ff00, v109 < v111 || (v112 = a1->field_0 + 2, a1->field_0 = v112 + v111, a1->field_8 = v109 - v111, v109 != v111)))
                        {
                            v113 = sub_a3f728();
                            if (v113)
                            {
                                v114 = v113;
                                if (v8)
                                    sub_a50a58(v8);
                                if ((int)sub_a56e98(v114, &v7) > 0)
                                {
                                    if (!a0->field_400 || a0->field_400->field_1c != 912 || (int)sub_ab2224(v7, 6) >= 1 && (int)sub_ab243c(v7, 0xffffffff) > 0)
                                    {
                                        v116 = sub_9b2270(a0, &v6, v13, v107);
                                        if (!v116)
                                        {
                                            sub_a3f73c(v114);
                                            return 0;
                                        }
                                        v117 = (unsigned int)sub_a57c20(v114, v112, v111, v6, v116);
                                        sub_a6c2e4(v6, "ssl/statem/statem_clnt.c", 2569);
                                        if (v117 > 0)
                                        {
                                            sub_a3f73c(v114);
                                            return 3;
                                        }
                                        sub_a368c8();
                                        sub_a369bc("ssl/statem/statem_clnt.c", 2571, "tls_process_key_exchange");
                                        v118 = a0;
                                        v119 = 0x33;
                                        v120 = 123;
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        v115 = 2556;
LABEL_9aa5f4:
                                        sub_a369bc("ssl/statem/statem_clnt.c", v115, "tls_process_key_exchange");
                                        v118 = a0;
                                        v119 = 80;
                                        v120 = 524294;
                                    }
                                    sub_9a58a4(v118, v119, v120, 0);
                                    sub_a3f73c(v114);
                                    return 0;
                                }
                                sub_a368c8();
                                v115 = 2548;
                                goto LABEL_9aa5f4;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/statem/statem_clnt.c", 2539, "tls_process_key_exchange");
                                v20 = a0;
                                v21 = 80;
                                v22 = 524294;
                            }
                        }
                        else
                        {
                            sub_a368c8();
                            v28 = "tls_process_key_exchange";
                            v29 = 2533;
LABEL_9a9a68:
                            sub_a369bc("ssl/statem/statem_clnt.c", v29, v28);
                            v20 = a0;
                            v21 = 50;
                            v22 = 159;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 2524, "tls_process_key_exchange");
                        v20 = a0;
                        v21 = 80;
                        v22 = 297;
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_clnt.c", 2266, "tls_process_ske_srp");
                v22 = 524291;
                v20 = a0;
                v21 = 80;
            }
        }
    }
    sub_9a58a4(v20, v21, v22, 0);
    sub_a3f73c(0);
    return 0;
}
