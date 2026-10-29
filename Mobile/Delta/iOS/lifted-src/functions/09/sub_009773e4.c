/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9773e4..0x978464 (4224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9773e4_0 {
    unsigned long long field_0;
    char field_8;
    unsigned long long field_9;
} st_9773e4_0;

typedef struct st_9773e4_3 {
    char padding_0[2];
    unsigned short field_2;
    unsigned int field_4;
    unsigned long long field_8;
    unsigned long long field_10;
} st_9773e4_3;

typedef struct st_9773e4_4 {
    void* field_0;
    struct st_9773e4_3 *field_8;
    char padding_10[16];
    long long field_20;
    char padding_28[16];
    unsigned long long field_38;
    long long field_40;
} st_9773e4_4;

typedef struct st_9773e4_5 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9773e4_5;

extern unsigned long long g_978464;
extern long long g_97b0a0;
extern st_9773e4_5 g_d28478;
extern char g_1000000;
extern char g_10002b0;
extern unsigned int g_fffffffffffffffc;

void sub_9773e4(void* a0, st_9773e4_0 *a1, unsigned int a2)
{
    st_9773e4_0 *v25;  // x25
    unsigned long long v26;  // x0
    unsigned long long v35;  // x19
    unsigned long long v125;  // x9
    unsigned long long v126;  // x8
    unsigned long long v127;  // 4115
    uint128_t v128;  // x0
    unsigned long long v129;  // x8
    unsigned long long v130;  // x9
    unsigned long long v131;  // 4110
    unsigned long long v132;  // x8
    unsigned long long v133;  // x8
    unsigned long long v134;  // x22
    unsigned long long v36;  // x0
    unsigned long long v135;  // x0
    unsigned long long v136;  // 4110
    unsigned int v137;  // w0
    unsigned long long v138;  // 4122
    unsigned long long v139;  // 4136
    unsigned long long v140;  // x8
    unsigned long long v141;  // x0
    unsigned long long v142;  // x19
    unsigned long long v143;  // x0
    unsigned long long v144;  // x0
    unsigned long long v37;  // x24
    unsigned long long v145;  // x0
    unsigned long long v146;  // x0
    unsigned long long v147;  // x8
    unsigned long long v148;  // 4137
    unsigned long long v149;  // x19
    unsigned long long v150;  // x0
    unsigned long long v151;  // x8
    unsigned long long v152;  // x10
    unsigned long long v153;  // 4133
    unsigned long long v154;  // x8
    uint128_t v38;  // x0
    unsigned long long v39;  // x8
    unsigned long long v40;  // x9
    unsigned long long v41;  // x10
    unsigned long long v42;  // x9
    unsigned long long v43;  // 4182
    uint128_t v44;  // x0
    unsigned long long v27;  // x0
    unsigned long long v45;  // x8
    unsigned long long v46;  // x9
    unsigned long long v47;  // 4110
    unsigned long long v48;  // x8
    unsigned long long v49;  // x8
    unsigned long long v50;  // x19
    unsigned long long v51;  // x0
    unsigned long long v52;  // 4110
    unsigned long v53;  // x25
    st_9773e4_4 *v54;  // x8
    unsigned long long v28;  // x19
    void* v55;  // x9
    unsigned int v56;  // w10
    unsigned long v57;  // x9
    uint128_t v58;  // q0
    uint128_t v59;  // q0
    unsigned int v60;  // w8
    char v61;  // x9
    char v62;  // x10
    unsigned long long v63;  // x24
    unsigned int v64;  // w0
    void* v29;  // x22
    unsigned long long v65;  // w0
    unsigned long v66;  // x8
    unsigned long v67;  // x10
    unsigned long long v68;  // 4148
    unsigned long long v69;  // x24
    unsigned long v70;  // x25
    st_9773e4_4 *v71;  // x27
    void* v72;  // x19
    unsigned long long v73;  // w26
    unsigned int v74;  // w2
    void* v30;  // x28
    unsigned long long v75;  // 4167
    unsigned long v76;  // x8
    unsigned int *v77;  // x9
    void* v80;  // x8
    unsigned long long v81;  // w10
    unsigned long long v82;  // 4186
    unsigned long long v83;  // x0
    void* v84;  // x8
    void* v31;  // x23
    st_9773e4_4 *v85;  // x8
    st_9773e4_4 *v86;  // x1
    unsigned long long v87;  // w9
    void* v88;  // x8
    void* v89;  // x27
    void* v90;  // x27
    unsigned int v91;  // w2
    unsigned long v92;  // x19
    unsigned long long v93;  // x0
    unsigned long long v94;  // x25
    unsigned long v32;  // x8
    uint128_t v95;  // q0
    unsigned long v96;  // x8
    unsigned long v97;  // x0
    unsigned long v98;  // x8
    unsigned long long v99;  // x24
    unsigned int v100;  // w19
    unsigned long long v101;  // x0
    unsigned long long v102;  // x0
    unsigned long long v103;  // x0
    unsigned long long v104;  // x0
    unsigned long v33;  // x9
    unsigned long v105;  // x8
    unsigned long long v106;  // x21
    unsigned long v107;  // x8
    unsigned long long v108;  // x9
    unsigned long long v109;  // x0
    uint128_t v110;  // x21
    unsigned long long v111;  // x0
    unsigned long long v112;  // x8
    unsigned long long v113;  // 4144
    unsigned long v114;  // x0
    unsigned long long v34;  // x21
    unsigned long long v115;  // x0
    unsigned long long v116;  // x0
    unsigned long long v117;  // 4132
    unsigned long long v118;  // x0
    unsigned long v119;  // x8
    unsigned long long v120;  // w0
    unsigned long v121;  // x8
    unsigned long long v122;  // x22
    uint128_t v123;  // x0
    unsigned long long v124;  // x8
    void* v0;  // [bp-0x118]
    void* v1;  // [bp-0x108]
    unsigned int v2;  // [bp-0xfc]
    unsigned long long v3;  // [bp-0xf8]
    unsigned int v4;  // [bp-0xf4]
    unsigned int *v5;  // [bp-0xf0]
    unsigned long v6;  // [bp-0xe8]
    unsigned long long v7;  // [bp-0xe0]
    unsigned long long v8;  // [bp-0xd8]
    uint128_t v9;  // [bp-0xd0]
    unsigned long v10;  // [bp-0xd0]
    unsigned long v11;  // [bp-0xd0]
    unsigned long long i;  // [bp-0xc8]
    unsigned long v13;  // [bp-0xc3]
    unsigned long long v14;  // [bp-0xc0]
    unsigned long v15;  // [bp-0xb8]
    unsigned long long v16;  // [bp-0xb0]
    unsigned long long v17;  // [bp-0xa8]
    unsigned int v18;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long long v19;  // [bp-0x98]
    void* v20;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v21;  // [bp-0x80]
    unsigned long v22;  // [bp-0x70]
    char *v23;  // [bp-0x10]
    char v24;  // [bp+0x0]

    v23 = &v24;
    v25 = a1;
    v22 = *(long long *)&g_10002b0;
    if (((long long)a0[1568] & 7 | 4) == 4)
    {
        *(unsigned short *)&v25->field_8 = 0;
        (&v25->field_8)[2] = 0;
    }
    else
    {
        if (((long long)a0[1568] & 6) != 2 || !(v26 = sub_981238(*(long long *)a0), (unsigned long long)(long long)a0[1512] <= sub_981238(*(long long *)a0)))
        {
            if (!(*(char *)(*(long long *)*(long long *)a0 + 160) & 1))
            {
                v2 = a2;
                if ((char)((char)a0[1572]) >> 1 & 1)
                {
                    v27 = sub_981238();
                    if (v27 >= (unsigned long long)(long long)a0[1544])
                    {
                        *(char **)&a0[1544] = (char *)&g_fffffffffffffffc + 3;
                        *(unsigned long long *)&a0[1568] = (long long)a0[1568] & 0xfffffffdffffffff;
                        if (!sub_98436c((long long)a0[1064], 1))
                            sub_979174(a0, 1, 0, "RXKU cooldown internal error", 0, "ssl/quic/quic_channel.c", 936, "ch_rxku_tick");
                    }
                }
                v28 = 0;
                v29 = a0 + 1360;
                v30 = a0 + 1249;
                v31 = a0 + 1186;
                v1 = a0 + 1144;
                v0 = a0 + 1207;
                v32 = (long long)a0[1568];
                v11 = v10;
                do
                {
                    v33 = v32 & 0xfffffffff3ffffff;
                    *(unsigned long *)&a0[1568] = v33;
                    if (v32 & 33554464)
                    {
                        v4 = v28;
                        v34 = v32 & 7;
                        v3 = (unsigned int)sub_98391c((long long)a0[1064], v29);
                        if (v3)
                        {
                            v35 = 1;
                            do
                            {
                                if (v34 == 2)
                                    sub_98d7f8((long long)a0[216], *(long long *)(*(long long *)(long long)a0[1360] + 72));
                                if (v35 & 1)
                                {
                                    v36 = sub_981238(*(long long *)a0);
                                    if ((long long)a0[1400])
                                    {
                                        v37 = v36;
                                        v38 = sub_975f2c((long long)a0[1048]);
                                        v39 = (long long)a0[1400];
                                        v40 = 1000000 * v39;
                                        v41 = (v38 * 3 <= (char *)&g_fffffffffffffffc + 3 ? v38 * 3 : (char *)&g_fffffffffffffffc + 3);
                                        v42 = (v41 < v40 ? v40 : v41);
                                        v43 = arm64g_calculate_condition(50, v37, v42, 0);
                                        *(unsigned long long *)&a0[1520] = (v43 & 1 ? v37 + v42 : (char *)&g_fffffffffffffffc + 3);
                                        if (v39)
                                        {
                                            v44 = sub_975f2c((long long)a0[1048]);
                                            v45 = (char *)&g_fffffffffffffffc + 3;
                                            if (v44 * 3 <= (char *)&g_fffffffffffffffc + 3)
                                            {
                                                v46 = v44 * 3;
                                                v47 = arm64g_calculate_condition(2, v46, 1, 0);
                                                if (!(v47 & 1))
                                                {
                                                    v48 = 1000000 * (long long)a0[1400];
                                                    v49 = (v46 < v48 ? v48 : v46) >> 1;
                                                    v50 = (v49 < 25000000000 ? v49 : 25000000000);
                                                    v51 = sub_981238(*(long long *)a0);
                                                    v52 = arm64g_calculate_condition(50, v51, v50, 0);
                                                    v45 = (v52 & 1 ? v51 + v50 : (char *)&g_fffffffffffffffc + 3);
                                                }
                                            }
                                        }
                                        else
                                        {
                                            v45 = (char *)&g_fffffffffffffffc + 3;
                                        }
                                    }
                                    else
                                    {
                                        v45 = (char *)&g_fffffffffffffffc + 3;
                                        *(char **)&a0[1520] = (char *)&g_fffffffffffffffc + 3;
                                    }
                                    *(unsigned long long *)&a0[1528] = v45;
                                }
                                v53 = (long long)a0[1568];
                                if ((v53 & 7) != 1)
                                    continue;
                                v54 = *(long long *)v29;
                                v55 = v54->field_0;
                                v56 = *(int *)v55;
                                if ((v56 & 253) == 4)
                                {
                                    v57 = v53;
                                }
                                else
                                {
                                    if (!(v53 >> 3 & 1))
                                    {
                                        v58 = (int128_t)v55[29];
                                        *(long long *)&v31[13] = (long long)v55[42];
                                        *(uint128_t *)v31 = v58;
                                        v59 = (int128_t)v55[29];
                                        v60 = (int)v55[45];
                                        *(char *)&v30[20] = (char)v55[49];
                                        *(unsigned int *)&v30[16] = v60;
                                        *(uint128_t *)v30 = v59;
                                        *(unsigned long long *)&a0[1568] = v53 | 8;
                                        sub_98b7bc((long long)a0[216], v31);
                                        v54 = (long long)a0[1360];
                                        v56 = *(int *)v54->field_0;
                                    }
                                    v61 = v56 - 1;
                                    if (4 >= v61)
                                        v62 = (&g_d28478.field_0)[v61];
                                    else
                                        v62 = 4;
                                    v57 = (long long)a0[1568];
                                    if (1 << (v62 & 31) & (unsigned int)v57 >> 20 & 15)
                                        goto LABEL_977564;
                                }
                                if (!(v57 >> 25 & 1) && v54->field_8 && (sub_717b8(a0 + 104) == 2 || sub_717b8(a0 + 104) == 30))
                                {
                                    v63 = *(long long *)(*(long long *)v29 + 8);
                                    v64 = sub_717b8(v63);
                                    if (v64 != sub_717b8(a0 + 104))
                                        goto LABEL_977564;
                                    sub_717b8(v63);
                                    switch (v65)
                                    {
                                    case 30:
                                        v66 = *(long long *)(v63 + 8);
                                        v67 = (long long)a0[112];
                                        v68 = arm64g_calculate_condition((v66 == v67 ? 4 : 0) | 16, (v66 == v67 ? *(long long *)(v63 + 16) : 0), (v66 == v67 ? (long long)a0[120] : 0), 0);
                                        if (v68 & 1)
                                            goto LABEL_977564;
                                        break;
                                    case 2:
                                        if (*(int *)(v63 + 4) != (int)a0[108])
                                            goto LABEL_977564;
                                        break;
                                    default:
                                        goto LABEL_977564;
                                    }
                                    if (*(short *)(v63 + 2) != (short)a0[106])
                                        goto LABEL_977564;
                                }
                                v69 = ((unsigned int)v53 * 0x10000000 | (unsigned int)v53 >> 4) & 4026531841 & 1;
                                v70 = (long long)a0[1568];
                                v71 = (long long)a0[1360];
                                v72 = v71->field_0;
                                v73 = *(char *)v72;
                                if ((v70 & 33554440) == 8)
                                {
                                    if (v73 == 5)
                                        goto LABEL_9778d4;
                                    v74 = (char)v72[29];
                                    v75 = arm64g_calculate_condition((v74 <= 20 ? 3 : 0) | 16, (v74 <= 20 ? v74 & 0xff : 0), (v74 <= 20 ? *(char *)v31 : 0), 0);
                                    if (v75 & 1 || _memcmp(v72 + 30, a0 + 1187))
                                        goto LABEL_977564;
                                }
                                if (v73 - 5 >= 2 && (int)v72[4] != 1)
                                    goto LABEL_977564;
                                if (v73 == 6)
                                {
                                    if ((int)v72[4] || (unsigned int)v69 || !(*(unsigned long long *)&a0[1568] = v70 | 16, v76 = (long long)v71->field_0[72], (long long)v71->field_0[72] >= 0))
                                        goto LABEL_977564;
                                    v77 = (long long)v71->field_0[80];
                                    while (1)
                                    {
                                        if (v76)
                                        {
                                            if (v76 < 4)
                                                goto LABEL_977564;
                                            v77 += 1;
                                            v76 -= 4;
                                            if (((unsigned int)((((*v77 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | *v77 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 48) | (unsigned int)(((*v77 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | *v77 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 >> 32) & 0xffff0000) == 1)
                                            {
                                                sub_98b7b0((long long)a0[216], 1);
                                                if (sub_975df4((long long)a0[1048], 0, 0))
                                                    goto LABEL_977564;
                                                break;
                                            }
                                        }
                                        else
                                        {
                                            break;
                                        }
                                    }
                                    goto LABEL_977950;
                                }
LABEL_9778d4:
                                *(unsigned long long *)&a0[1568] = v70 | 16;
                                v80 = v71->field_0;
                                v81 = *(int *)v80 & 253;
                                v82 = arm64g_calculate_condition((v81 != 4 ? 3 : 0) | 16, (v81 != 4 ? *(int *)v80 & 0x300000 : 0x40000000), 0, 0);
                                if (v82 & 1)
                                    goto LABEL_977950;
                                v5 = (long long)v80[80];
                                v6 = (long long)v80[72];
                                v21 = 0;
                                v18 = 0;
                                v20 = 0;
                                v14 = 0;
                                v16 = 0;
                                v83 = (long long)a0[72];
                                if (!v83)
                                {
                                    if (!(v70 >> 41 & 1) || v70 >> 25 & 1 && !*(char *)v1)
                                    {
                                        v83 = 0;
                                    }
                                    else
                                    {
                                        v84 = v1;
                                        v9 = *(int128_t *)v84;
                                        v13 = (long long)v84[13];
                                        v15 = (long long)a0[1600];
                                        v16 = 0;
                                        v17 = 0;
                                        v18 = __ROL__((unsigned int)v70, 7) & 0xffffff81 & 1;
                                        v19 = &g_978464;
                                        v20 = a0;
                                        v83 = sub_972f44(&v9);
                                        *(unsigned long long *)&a0[72] = v83;
                                        if (!v83)
                                            *(unsigned long long *)&a0[1568] = (long long)a0[1568] & 0xfffffdffffffffff;
                                    }
                                }
                                v85 = *(long long *)v29;
                                sub_974a80(v83, v85->field_0, v85->field_20, &v5, 1, v85->field_40);
                                v86 = *(long long *)v29;
                                v87 = *(char *)v86->field_0;
                                if (3 >= v87)
                                {
                                    if (v87 != 1 && v87 != 3)
                                        goto LABEL_977564;
                                }
                                else
                                {
                                    if (v87 != 5)
                                    {
                                        if (v87 != 4 || (long long)a0[1568] & 33556488 || (unsigned long long)(long long)v86->field_0[72] < 0x11 || !sub_991584(*(long long *)*(long long *)*(long long *)a0, *(long long *)(*(long long *)*(long long *)a0 + 8)) || !(v88 = *(long long *)*(long long *)v29, v89 = v88, v90 = v89 + 29, v91 = *(char *)v1, 20 < *(char *)v1 || *(char *)v1 != (char)v89[29] || _memcmp(a0 + 1145, v88 + 30)))
                                            continue;
                                        if (sub_98b7bc((long long)a0[216], v90) && !(v92 = (long long)v88[72] - 16, v93 = sub_a6dac4((long long)v88[80], v92, "ssl/quic/quic_channel.c", 2936), !v93))
                                        {
                                            v94 = v93;
                                            if (sub_98b720((long long)a0[216], v94, v92, &g_97b0a0, 0))
                                            {
                                                v95 = *(int128_t *)v90;
                                                *(long long *)&v0[13] = (long long)v90[13];
                                                *(uint128_t *)v0 = v95;
                                                *(unsigned long long *)&a0[1568] = (long long)a0[1568] | 0x800;
                                                if (sub_975df4((long long)a0[1048], 0, v69) && sub_985ac0(*(long long *)*(long long *)*(long long *)a0, *(long long *)(*(long long *)*(long long *)a0 + 8), v0, 0, (long long)a0[1064], (long long)a0[1056]))
                                                    goto LABEL_977564;
                                            }
                                            else
                                            {
                                                sub_979174(a0, 11, 0, "received oversize token", 0, "ssl/quic/quic_channel.c", 2947, "ch_retry");
                                                sub_a6c2e4(v94, "ssl/quic/quic_channel.c", 2948);
                                            }
                                        }
                                        goto LABEL_977950;
                                    }
                                }
                                v96 = (long long)a0[1568];
                                if (v87 == 3 && v96 >> 25 & 1)
                                {
                                    sub_c61a4c(a0, 0);
                                    v96 = (long long)a0[1568];
                                    v86 = (long long)a0[1360];
                                    if (!(v96 >> 33 & 1))
                                        goto LABEL_977bfc;
                                }
                                else if (!(v96 >> 33 & 1))
                                {
                                    goto LABEL_977bfc;
                                }
                                if (*(char *)v86->field_0 == 5 && (unsigned long long)v86->field_20 >= (unsigned long long)(long long)a0[1560])
                                {
                                    v97 = sub_984338((long long)a0[1064]);
                                    if (v97 > v86->field_38)
                                    {
                                        goto LABEL_977950;
                                    }
                                    else
                                    {
                                        v96 = (long long)a0[1568];
                                        v86 = (long long)a0[1360];
                                    }
                                }
LABEL_977bfc:
                                if (!(v96 >> 25 & 1) && *(char *)v86->field_0 == 1 && (long long)v86->field_0[64])
                                {
LABEL_977950:
                                    goto LABEL_977958;
                                }
                                else
                                {
                                    sub_98645c(a0);
                                    if ((unsigned long long)((long long)a0[1568]) >> 28 & 1 && (v7 = 0, !(v2 & 1) && (*(unsigned long long *)&a0[1568] = (long long)a0[1568] | 0x8000000, sub_98a3ec((long long)a0[40]), sub_98a6e8((long long)a0[40], &v11, &v8, &v7))))
                                    {
LABEL_977958:
                                        sub_979174();
                                    }
                                }
LABEL_977564:
                            } while ((sub_9842b4((long long)a0[1360]), *(unsigned long long *)&a0[1360] = 0, *(unsigned long long *)&a0[1568] = (long long)a0[1568] & 0xffffffffdfffffff, v35 = 0, sub_98391c((long long)a0[1064], v29)));
                        }
                        v98 = (int)a0[1568];
                        if (!(v98 >> 20 & 1))
                        {
                            v99 = sub_984404((long long)a0[1064], 0);
                            v98 = (int)a0[1568];
                            v100 = v4;
                            if (!(v98 >> 21 & 1))
                                goto LABEL_977d7c;
                        }
                        else
                        {
                            v99 = (char *)&g_fffffffffffffffc + 3;
                            v100 = v4;
                            if (!(v98 >> 21 & 1))
                            {
LABEL_977d7c:
                                if (!((unsigned int)v98 & 0xe0000))
                                    goto LABEL_977dc4;
                                v101 = sub_984404((long long)a0[1064], 1);
                                v99 = (v101 < v99 ? v101 : v99);
                                v98 = (int)a0[1568];
                                if (v98 >> 22 & 1)
                                {
LABEL_977da0:
                                    if (v98 >> 23 & 1)
                                        goto LABEL_977dc4;
LABEL_977da4:
                                    if (((unsigned int)v98 >> 0x11 & 7) >= 3)
                                    {
                                        v103 = sub_984404((long long)a0[1064], 3);
                                        v99 = (v103 < v99 ? v103 : v99);
                                    }
LABEL_977dc4:
                                    if (sub_9843fc((long long)a0[1064]) >= v99)
                                        sub_979174(a0, 15, 0, "forgery limit", 0, "ssl/quic/quic_channel.c", 2213, "ch_rx_check_forged_pkt_limit");
                                    v28 = (!v3 ? v100 : 1);
                                    v32 = (long long)a0[1568];
                                    if (v3 && v34 == 2)
                                    {
                                        v32 |= &g_1000000;
                                        *(unsigned long *)&a0[1568] = v32;
                                        v28 = 1;
                                        goto LABEL_977e2c;
                                    }
                                }
LABEL_977d40:
                                if (!((unsigned int)v98 & 0xc0000) || (v102 = sub_984404((long long)a0[1064], 2), v99 = (v102 < v99 ? v102 : v99), v98 = (int)a0[1568], v98 >> 23 & 1))
                                    goto LABEL_977dc4;
                                goto LABEL_977da4;
                            }
                        }
                        if (v98 >> 22 & 1)
                            goto LABEL_977da0;
                        goto LABEL_977d40;
                    }
                    else
                    {
                        v32 = v33;
                    }
LABEL_977e2c:
                    if (!(v32 >> 27 & 1))
                    {
                        v8 = 0;
                        if (!(v2 & 1))
                        {
                            *(unsigned long long *)&a0[1568] = v32 | 0x8000000;
                            sub_98a3ec((long long)a0[40]);
                            if (sub_98a6e8((long long)a0[40], &v11, &v5, &v8))
                            {
                                sub_979174(a0, v11, 0, v5, v8, "ssl/quic/quic_channel.c", 2175, "ch_tick_tls");
                                v28 = 1;
                            }
                        }
                        v32 = (long long)a0[1568];
                    }
                } while (v32 >> 26 & 1);
            }
            else
            {
                v28 = 0;
            }
            v104 = sub_981238();
            v105 = *(char *)(*(long long *)*(long long *)a0 + 160);
            if ((unsigned long long)(long long)a0[1520] > v104)
            {
                if (!(v105 & 1))
                {
                    v106 = v104;
                    if (v106 > sub_9758f0((long long)a0[1048]) - 1)
                        sub_9755c0((long long)a0[1048]);
                    if (v106 >= (unsigned long long)(long long)a0[1528])
                    {
                        sub_98b948((long long)a0[216]);
                        sub_97846c(a0);
                    }
                    v107 = (long long)a0[1568];
                    v108 = v107 & 7;
                    if (v108 != 3)
                    {
                        if (v108 == 2)
                        {
                            if (!(v107 >> 24 & 1))
                                goto LABEL_9782ac;
                            v107 &= 0xfffffffffefffffa;
                            *(unsigned long *)&a0[1568] = v107;
                        }
                        if ((v107 & 0x1c400) == 0xc400)
                        {
                            if (v107 >> 32 & 1)
                            {
                                v109 = sub_975fa0((long long)a0[1048], 2);
                                if (v109 >= (unsigned long long)(long long)a0[1552])
                                {
                                    v110 = sub_975f2c((long long)a0[1048]);
                                    *(unsigned long long *)&a0[1568] = (long long)a0[1568] & 0xfffffffeffffffff;
                                    v111 = sub_981238(*(long long *)a0);
                                    v112 = (v110 * 3 <= (char *)&g_fffffffffffffffc + 3 ? v110 * 3 : (char *)&g_fffffffffffffffc + 3);
                                    v113 = arm64g_calculate_condition(50, v111, v112, 0);
                                    *(unsigned long long *)&a0[0x600] = (v113 & 1 ? v111 + v112 : (char *)&g_fffffffffffffffc + 3);
                                }
                            }
                            v107 = (long long)a0[1568];
                            if (!(v107 >> 32 & 1))
                            {
                                v114 = sub_981238(*(long long *)a0);
                                v107 = (long long)a0[1568];
                                if (v114 >= (unsigned long long)(long long)a0[0x600] && !(v107 & 0x600000000))
                                {
                                    v115 = sub_9857fc((long long)a0[1056], 3);
                                    v116 = sub_98582c((long long)a0[1056], 3);
                                    v117 = arm64g_calculate_condition(2, (long long)a0[1464], 1, 0);
                                    v107 = (long long)a0[1568];
                                    if (v115 >= (v117 & 1 ? v116 >> 1 : (long long)a0[1464]))
                                    {
                                        *(unsigned long long *)&a0[1568] = v107 | 0x80000000;
                                        v118 = sub_98d8bc((long long)a0[216], 2);
                                        if (v118 <= 0x3fffffffffffffff && sub_9857f0((long long)a0[1056]))
                                        {
                                            v119 = (long long)a0[1568];
                                            *(unsigned long long *)&a0[1552] = v118;
                                            v107 = v119 & 0xffffffefffffffff | v119 * 32 & 0x1000000000 | 0x100000000;
                                        }
                                        else
                                        {
                                            sub_979174(a0, 1, 0, "key update", 0, "ssl/quic/quic_channel.c", 740, "ch_trigger_txku");
                                            v107 = (long long)a0[1568];
                                        }
                                    }
                                }
                            }
                        }
                        else
                        {
                            v28 = v28;
                        }
                        *(unsigned long long *)&a0[1568] = v107 & 0xfffffff7ffffffff;
                        do
                        {
                            v120 = (unsigned int)sub_98b980((long long)a0[216], &v11);
                            if (i)
                            {
                                *(unsigned long long *)&a0[1568] = (long long)a0[1568] | 32;
                                *(unsigned short *)(*(long long *)a0 + 154) = *(short *)(*(long long *)a0 + 154) | 8;
                                v121 = (long long)a0[1568];
                                if ((unsigned int)v11 && !(v121 >> 29 & 1))
                                {
                                    v122 = sub_981238(*(long long *)a0);
                                    if ((long long)a0[1400])
                                    {
                                        v123 = sub_975f2c((long long)a0[1048]);
                                        v124 = 1000000 * (long long)a0[1400];
                                        v125 = (v123 * 3 <= (char *)&g_fffffffffffffffc + 3 ? v123 * 3 : (char *)&g_fffffffffffffffc + 3);
                                        v126 = (v125 < v124 ? v124 : v125);
                                    }
                                    else
                                    {
                                        v126 = (char *)&g_fffffffffffffffc + 3;
                                    }
                                    v127 = arm64g_calculate_condition(50, v122, v126, 0);
                                    *(unsigned long long *)&a0[1520] = (v127 & 1 ? v122 + v126 : (char *)&g_fffffffffffffffc + 3);
                                    v121 = (long long)a0[1568] | 0x20000000;
                                    *(unsigned long *)&a0[1568] = v121;
                                }
                                if (!(v121 >> 25 & 1) && *(unsigned int *)((void*)&v11 + 4))
                                {
                                    sub_c61a4c(a0, 0);
                                    v121 = (long long)a0[1568];
                                    if (!(v121 >> 35 & 1))
                                        goto LABEL_9781c0;
                                }
                                else if (!(v121 >> 35 & 1))
                                {
                                    goto LABEL_9781c0;
                                }
                                *(unsigned long long *)&a0[1568] = v121 & 0xfffffffbffffffff;
LABEL_9781c0:
                                if ((long long)a0[1400])
                                {
                                    v128 = sub_975f2c((long long)a0[1048]);
                                    v129 = (char *)&g_fffffffffffffffc + 3;
                                    if (v128 * 3 <= (char *)&g_fffffffffffffffc + 3)
                                    {
                                        v130 = v128 * 3;
                                        v131 = arm64g_calculate_condition(2, v130, 1, 0);
                                        if (!(v131 & 1))
                                        {
                                            v132 = 1000000 * (long long)a0[1400];
                                            v133 = (v130 < v132 ? v132 : v130) >> 1;
                                            v134 = (v133 < 25000000000 ? v133 : 25000000000);
                                            v135 = sub_981238(*(long long *)a0);
                                            v136 = arm64g_calculate_condition(50, v135, v134, 0);
                                            v129 = (v136 & 1 ? v135 + v134 : (char *)&g_fffffffffffffffc + 3);
                                        }
                                    }
                                }
                                else
                                {
                                    v129 = (char *)&g_fffffffffffffffc + 3;
                                }
                                *(unsigned long long *)&a0[1528] = v129;
                                goto LABEL_978224;
                            }
                            else
                            {
LABEL_978224:
                                if (!v120)
                                {
                                    sub_979174(a0, 1, 0, "internal error (txp generate)", 0, "ssl/quic/quic_channel.c", 2698, "ch_tx");
                                    break;
                                }
                            }
                        } while (i);
                        v137 = sub_985584((long long)a0[1056]);
                        v138 = arm64g_calculate_condition(0x11, v137, 1, 0);
                        v139 = arm64g_calculate_condition((v138 & 1 ? 3 : 0), (v138 & 1 ? v137 : 0x40000000), v138 & 1, 0);
                        if (!(v139 & 1))
                            sub_9818e4(*(long long *)a0, a0);
                        v28 = (!sub_9857e8((long long)a0[1056]) ? (unsigned int)v28 : 1);
                    }
LABEL_9782ac:
                    sub_989d40(a0 + 848);
                }
                if (((long long)a0[1568] & 7) == 4)
                {
                    v140 = (char *)&g_fffffffffffffffc + 3;
                }
                else
                {
                    v141 = sub_9758f0((long long)a0[1048]);
                    v142 = (v141 ? v141 : (char *)&g_fffffffffffffffc + 3);
                    if (sub_985420((long long)a0[1056], 0))
                    {
                        v143 = sub_975dd0((long long)a0[1048], 0);
                        v142 = (v142 < v143 ? v142 : v143);
                    }
                    if (sub_985420((long long)a0[1056], 1))
                    {
                        v144 = sub_975dd0((long long)a0[1048], 2);
                        v142 = (v142 < v144 ? v142 : v144);
                    }
                    if (sub_985420((long long)a0[1056], 2))
                    {
                        v145 = sub_975dd0((long long)a0[1048], 1);
                        v142 = (v142 < v145 ? v142 : v145);
                    }
                    if (sub_985420((long long)a0[1056], 3))
                    {
                        v146 = sub_975dd0((long long)a0[1048], 2);
                        v142 = (v142 < v146 ? v142 : v146);
                    }
                    v147 = (long long)a0[1528];
                    v148 = arm64g_calculate_condition(2, v147, 1, 0);
                    v149 = (v148 & 1 ? v142 : v142 < v147 ? v142 : v147);
                    v150 = sub_98d8d8((long long)a0[216]);
                    v151 = (v149 < v150 ? v149 : v150);
                    if (((long long)a0[1568] & 6) == 2)
                    {
                        v140 = (v151 < (unsigned long long)(long long)a0[1512] ? v151 : (long long)a0[1512]);
                    }
                    else
                    {
                        v152 = (long long)a0[1520];
                        v153 = arm64g_calculate_condition(2, v152, 1, 0);
                        v140 = (v153 & 1 ? v151 : v151 < v152 ? v151 : v152);
                    }
                    if ((unsigned long long)((long long)a0[1568]) >> 33 & 1)
                        v140 = (v140 < (unsigned long long)(long long)a0[1544] ? v140 : (long long)a0[1544]);
                }
                v25->field_0 = v140;
                v25->field_8 = ((long long)a0[1568] & 7) != 4;
                if (((long long)a0[1568] & 7) == 4)
                    v154 = 0;
                else
                    v154 = sub_9857e8((long long)a0[1056]) != 0;
                (&v25->field_8)[1] = v154;
                (&v25->field_8)[2] = v28;
                if (*(long long *)&g_10002b0 == v22)
                    return;
                ___stack_chk_fail();
            }
            if (v105 & 1)
                goto LABEL_977f38;
            *(char *)&a0[1504] = (char)a0[1504] & 254;
            *(uint128_t *)&a0[1472] = (uint128_t)((char *)&g_fffffffffffffffc + 3);
        }
        sub_978b1c(a0, 4);
LABEL_977f38:
        *(unsigned short *)&v25->field_8 = 0;
        (&v25->field_8)[2] = 1;
    }
    v25->field_0 = (char *)&g_fffffffffffffffc + 3;
    if (*(long long *)&g_10002b0 == v22)
        return;
    ___stack_chk_fail();
}
