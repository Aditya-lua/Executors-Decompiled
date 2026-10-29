/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d26c..0x9dc10 (2468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d26c_1 {
    unsigned long long field_0;
    unsigned long long field_4;
    unsigned long long field_6;
} st_9d26c_1;

typedef struct st_9d26c_3 {
    struct st_9d26c_4 *field_0;
} st_9d26c_3;

typedef struct st_9d26c_4 {
    struct st_9d26c_3 *field_0;
} st_9d26c_4;

typedef struct st_9d26c_2 {
    unsigned long long field_0;
    struct st_9d26c_1 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned long long field_48;
    unsigned int field_4c;
} st_9d26c_2;

typedef struct st_9d26c_0 {
    char field_0;
} st_9d26c_0;


char * sub_9d26c(void* a0, st_9d26c_2 *a1, unsigned int *a2, void* a3, unsigned long a4)
{
    void* v22;  // x25
    char *v23;  // x28
    unsigned long v32;  // x24
    unsigned long long v122;  // x15
    unsigned int v123;  // w15
    unsigned long v124;  // cc_dep1
    unsigned long v125;  // cc_dep2
    void* v126;  // x10
    unsigned int v127;  // w13
    unsigned long long v128;  // 4112
    unsigned long long v129;  // 4108
    unsigned long long v130;  // 4112
    unsigned long long v131;  // 4108
    void* l;  // x26
    unsigned int v132;  // w11
    unsigned long long v133;  // x8
    unsigned int v134;  // w9
    unsigned int v135;  // w12
    unsigned long v136;  // cc_dep1
    unsigned long v137;  // cc_dep2
    void* v138;  // x9
    unsigned long long v139;  // 4112
    unsigned long long v140;  // 4102
    unsigned long long v141;  // 4112
    unsigned long node;  // x10
    unsigned long long v142;  // 4102
    unsigned long long v143;  // x25
    st_9d26c_1 *v144;  // x8
    unsigned long long v145;  // x9
    unsigned long long v146;  // x10
    void* v35;  // x11
    unsigned int v36;  // w12
    unsigned long long v37;  // w12
    unsigned int v38;  // w11
    unsigned long v39;  // x17
    char v40;  // x0
    char v41;  // x1
    void* v24;  // x14
    unsigned int *v42;  // x2
    unsigned int v43;  // w3
    unsigned long long v44;  // w11
    unsigned long long v45;  // x3
    unsigned int v46;  // w3
    unsigned long long v47;  // w11
    unsigned long long v48;  // x3
    unsigned int v49;  // w3
    unsigned long long v50;  // w11
    unsigned int v51;  // w3
    void* v25;  // x23
    unsigned long long v52;  // x3
    void* v53;  // x10
    unsigned long v54;  // cc_dep1
    unsigned long v55;  // cc_dep2
    void* v56;  // x10
    void* v57;  // x19
    unsigned long v58;  // x10
    unsigned int v59;  // w13
    unsigned long long v60;  // 4112
    unsigned long long v61;  // 4108
    unsigned long v26;  // x9
    unsigned long long v62;  // 4112
    unsigned long long v63;  // 4108
    unsigned int v64;  // w11
    unsigned long long v65;  // x8
    unsigned int v66;  // w9
    unsigned int v67;  // w12
    unsigned long v68;  // cc_dep1
    unsigned long v69;  // cc_dep2
    void* v70;  // x9
    unsigned long long v71;  // 4112
    void* v27;  // x13
    unsigned long long v72;  // 4102
    unsigned long long v73;  // 4112
    unsigned long long v74;  // 4102
    void* v75;  // x7
    unsigned long long v76;  // x28
    unsigned long v77;  // x19
    unsigned long long v78;  // w13
    unsigned int v79;  // w26
    unsigned int v80;  // w8
    unsigned long v81;  // x0
    char v28;  // x8
    unsigned int v82;  // w8
    unsigned int v83;  // w8
    unsigned long v84;  // x8
    unsigned long v85;  // cc_dep1
    unsigned long long v86;  // 4105
    unsigned long long v87;  // 4105
    void* v88;  // x8
    unsigned long v89;  // x8
    unsigned int v90;  // w10
    unsigned long v91;  // cc_dep1
    unsigned int v29;  // w10
    unsigned long v92;  // cc_dep2
    void* v93;  // x9
    void* v94;  // x8
    void* v95;  // x11
    unsigned long long v96;  // 4113
    unsigned long long v97;  // 4113
    unsigned long v98;  // x10
    void* v99;  // x9
    void* v100;  // x10
    void* v101;  // x9
    unsigned int v30;  // w10
    void* v102;  // x11
    unsigned long long v103;  // x24
    uint128_t *v104;  // x9
    uint128_t *iter;  // x9
    uint128_t *v106;  // x10
    uint128_t *v107;  // x10
    st_9d26c_1 *v108;  // x8
    unsigned int *v109;  // x4
    unsigned long long v110;  // x9
    unsigned long long v111;  // x9
    unsigned long v31;  // x27
    unsigned int v112;  // w10
    unsigned long v113;  // x8
    void* v114;  // x9
    void* v115;  // x12
    unsigned int v116;  // w10
    unsigned long long v117;  // w10
    unsigned int j;  // w9
    char v119;  // x14
    unsigned long v120;  // x12
    unsigned long long v121;  // w9
    void* v0;  // [bp-0x100]
    unsigned int *v1;  // [bp-0xf8]
    unsigned int v2;  // [bp-0xec]
    void* v3;  // [bp-0xe8]
    char *v4;  // [bp-0xe0]
    unsigned int v5;  // [bp-0xd4]
    unsigned long long v6;  // [bp-0xd0]
    void* v7;  // [bp-0xc8]
    void* v8;  // [bp-0xc0]
    unsigned int v9;  // [bp-0xb4]
    void* v10;  // [bp-0xb0]
    void* i;  // [bp-0xa8]
    unsigned long v12;  // [bp-0xa0]
    st_9d26c_0 **v13;  // [bp-0x98], Other Possible Types: char
    st_9d26c_0 *v14;  // [bp-0x90]
    char v15;  // [bp-0x88]
    st_9d26c_0 **v16;  // [bp-0x88]
    st_9d26c_0 *v17;  // [bp-0x80], Other Possible Types: unsigned long
    st_9d26c_4 **v18;  // [bp-0x78]
    st_9d26c_4 **v19;  // [bp-0x70]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v22 = a3;
    v14 = &v13;
    v13 = &v14;
    v23 = a3 + a4;
    v24 = v23 - 16;
    v25 = (long long)a0[8];
    v10 = (long long)a0[16];
    v26 = (int)a0[28];
    v12 = (int)a0[24];
    v27 = v25 + v12;
    v28 = (int)a0[0x100];
    v29 = (int)a0[272];
    if ((unsigned int)(int)a0[272] >= 6)
        v29 = 6;
    if (4 >= v29)
        v29 = 4;
    v30 = (int)a0[268];
    v2 = v30;
    if (v30 >= 6)
        v30 = 6;
    if (4 >= v30)
        v30 = 4;
    v5 = v30;
    v31 = *a2;
    v32 = a2[1];
    *(unsigned int *)&a0[300] = 0;
    v7 = v27;
    if (v27 != a3)
        l = a3;
    else
        l = a3 + 1;
    node = (int)a0[44];
    v19 = &v18;
    v18 = &v19;
    v35 = v25 + node;
    v36 = v24 - v35;
    if (8 <= v36 + 1)
        v37 = 8;
    else
        v37 = v36 + 1;
    i = v24;
    if (v24 < v35)
        v38 = 0;
    else
        v38 = v37;
    if (v38 + (unsigned int)node > (unsigned int)node)
    {
        v39 = (long long)a0[96];
        v40 = 24 - (int)a0[52];
        v41 = 56 - (int)a0[52];
        v42 = a0 + 64;
        v43 = v2;
        if (v43 <= 4)
        {
            do
            {
                v50 = v38;
                if (v29 == 4)
                {
                    v51 = (2654435761 * *(int *)((char *)v25 + node) ^ (unsigned int)v39) >> (v40 & 31);
                }
                else
                {
                    if (v29 == 5)
                        v52 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v25 + node);
                    else
                        v52 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v25 + node);
                    v51 = (v52 ^ v39) >> (v41 & 63);
                }
            } while ((v42[node & 7] = v51, node += 1, v38 = v50 - 1, v50 != 1));
        }
        else if (v43 == 5)
        {
            do
            {
                v44 = v38;
                if (v29 == 6)
                {
                    v45 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v25 + node);
                    goto LABEL_9d430;
                }
                else if (v29 == 5)
                {
                    v45 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v25 + node);
LABEL_9d430:
                    v46 = (v45 ^ v39) >> (v41 & 63);
                    continue;
                }
                else
                {
                    v46 = (2654435761 * *(int *)((char *)v25 + node) ^ (unsigned int)v39) >> (v40 & 31);
                }
            } while ((v42[node & 7] = v46, node += 1, v38 = v44 - 1, v44 != 1));
        }
        else
        {
            do
            {
                v47 = v38;
                if (v29 == 6)
                {
                    v48 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v25 + node);
                    goto LABEL_9d4a4;
                }
                else if (v29 == 5)
                {
                    v48 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v25 + node);
LABEL_9d4a4:
                    v49 = (v48 ^ v39) >> (v41 & 63);
                    continue;
                }
                else
                {
                    v49 = (2654435761 * *(int *)((char *)v25 + node) ^ (unsigned int)v39) >> (v40 & 31);
                }
            } while ((v42[node & 7] = v49, node += 1, v38 = v47 - 1, v47 != 1));
        }
    }
    v53 = i;
    v54 = l;
    v55 = v53;
    if (v53 > l)
    {
        v56 = v10;
        v6 = v56 + v12;
        v0 = v56 + v26;
        v9 = 1 << (v28 & 31);
        v8 = v23 - 32;
        v1 = a0 + 64;
        v4 = v23;
        do
        {
            v57 = l + 1;
            v58 = (unsigned int)(l - v25) + 1;
            v59 = v9;
            if (v59 < (unsigned int)(v58 - (int)a0[28]))
            {
                v60 = arm64g_calculate_condition(132, v54, v55, 0);
                v61 = arm64g_calculate_condition(3, (v60 & 1 ? (int)a0[40] : 0), 0, 0);
                if (!(v61 & 1))
                    goto LABEL_9d5b6;
                goto LABEL_9d5b5;
            }
            else
            {
                v62 = arm64g_calculate_condition(132, v54, v55, 0);
                v63 = arm64g_calculate_condition(0, (v62 & 1 ? (int)a0[40] : 0), 0, 0);
                if (v63 & 1)
                {
LABEL_9d5b5:
                    v64 = v58 - v59;
                    goto LABEL_9d5b8;
                }
                else
                {
LABEL_9d5b6:
                    v64 = (int)a0[28];
LABEL_9d5b8:
                    v65 = v58 - v31;
                    v66 = v12;
                    v67 = v65 - v66;
                    v68 = v65 & 0xffffffff;
                    v69 = v66;
                    if ((unsigned int)v65 < v66)
                        v70 = v10;
                    else
                        v70 = v25;
                    if ((unsigned int)v31 <= (unsigned int)(v58 - v64))
                    {
                        v71 = arm64g_calculate_condition(147, v68, v69, 0);
                        v72 = arm64g_calculate_condition(129, (v71 & 1 ? v67 : 0x20000000), (v71 & 1 ? 4 : 0), 0);
                        if (v72 & 1)
                            goto LABEL_9d62c;
                    }
                    else
                    {
                        v73 = arm64g_calculate_condition(147, v68, v69, 0);
                        v74 = arm64g_calculate_condition(128, (v73 & 1 ? v67 : 0x20000000), (v73 & 1 ? 4 : 0), 0);
                        if (v74 & 1)
                            goto LABEL_9d62c;
                    }
                    if (*(int *)v57 == *(int *)((char *)v70 + v65))
                    {
                        v75 = v57;
                        v76 = sub_84f30() + 4;
                        v77 = v31;
                        v31 = v32;
                        v78 = 1;
                        v79 = v2;
                        goto LABEL_9d7d8;
                    }
LABEL_9d62c:
                    v17 = 0x3b9ac9ff;
                    v19 = &v18;
                    v18 = &v19;
                    if (v29 == 6)
                    {
                        v83 = v5;
                        if (v83 != 6)
                        {
                            if (v83 == 5)
                                v81 = sub_b35e8();
                            else
                                v81 = sub_a0318();
                        }
                        else
                        {
                            v81 = sub_b0c18(a0, l, v23, &v17);
                        }
                    }
                    else if (v29 == 5)
                    {
                        v80 = v5;
                        if (v80 == 6)
                        {
                            v81 = sub_a2ea8(a0, l, v23, &v17);
                        }
                        else if (v80 == 5)
                        {
                            v81 = sub_9e96c();
                        }
                        else
                        {
                            v81 = sub_ad664();
                        }
                    }
                    else
                    {
                        v82 = v5;
                        if (v82 == 6)
                        {
                            v81 = sub_9819c(a0, l, v23, &v17);
                        }
                        else if (v82 == 5)
                        {
                            v81 = sub_a7fa4();
                        }
                        else
                        {
                            v81 = sub_aa0f0();
                        }
                    }
                    v76 = v81;
                    v84 = v17;
                    v85 = v81;
                    if (v81)
                    {
                        v78 = (unsigned int)v84;
                        v86 = arm64g_calculate_condition(4, v85, 0, 0);
                        if (!(v86 & 1))
                            goto LABEL_9d71a;
                        goto LABEL_9d719;
                    }
                    else
                    {
                        v78 = 1;
                        v87 = arm64g_calculate_condition(4, v85, 0, 0);
                        if (v87 & 1)
                        {
LABEL_9d719:
                            v75 = v57;
                            goto LABEL_9d71c;
                        }
                        else
                        {
LABEL_9d71a:
                            v75 = l;
LABEL_9d71c:
                            if (v81 <= 3)
                            {
                                v88 = l - v22;
                                l = l + (v88 >> 8) + 1;
                                *(unsigned int *)&a0[300] = v88 > 0x8ff;
                                v89 = v31;
                                goto LABEL_9d578;
                            }
                            if (v84 >= 4)
                            {
                                v90 = (unsigned int)(l - v25 - v84) + 3;
                                v91 = v12 & 0xffffffff;
                                v92 = v90;
                                if (v90 < (unsigned int)v12)
                                {
                                    v93 = v10;
                                    v94 = v7;
                                    v95 = v0;
                                    v96 = arm64g_calculate_condition(131, v91, v92, 0);
                                    if (!(v96 & 1))
                                        goto LABEL_9d752;
                                }
                                else
                                {
                                    v93 = v25;
                                    v94 = v7;
                                    v95 = v0;
                                    v97 = arm64g_calculate_condition(131, v91, v92, 0);
                                    if (!(v97 & 1))
                                    {
LABEL_9d752:
LABEL_9d754:
                                        if (l > v22 && !(v98 = v90, v93 + v98 <= v94))
                                        {
                                            v99 = v93 + v98 - 1;
                                            v100 = v75 - 1;
                                            do
                                            {
                                                v101 = v99;
                                                if (*(char *)v100 != *(char *)v101)
                                                {
                                                    v75 = v100 + 1;
                                                    v79 = v2;
                                                    goto LABEL_9d7d4;
                                                }
                                            } while ((v76 += 1, v102 = v100 - 1, v100 > v22 && (v100 = v102, v99 = v101 - 1, v94 < v101)));
                                            v75 = v102 + 1;
                                            v79 = v2;
                                        }
                                        else
                                        {
                                            v79 = v2;
                                        }
LABEL_9d7d4:
                                        v77 = v78 - 3;
                                        goto LABEL_9d7d8;
                                    }
                                }
                                v94 = v95;
                                goto LABEL_9d754;
                            }
                            else
                            {
                                v77 = v31;
                                v31 = v32;
                                v79 = v2;
LABEL_9d7d8:
                                v103 = v75 - v22;
                                v19 = &v18;
                                v18 = &v19;
                                if (v75 > v8)
                                {
                                    v3 = v75;
                                    sub_82208(a1->field_18, v22, v75, v8);
                                }
                                else
                                {
                                    *a1->field_18 = *(int128_t *)v22;
                                    v104 = a1->field_18;
                                    if (v103 > 16)
                                    {
                                        v3 = v75;
                                        v104[1] = (int128_t)v22[16];
                                        if ((long long)v103 >= 33)
                                        {
                                            iter = v104 + 2;
                                            v106 = v22 + 48;
                                            do
                                            {
                                                *iter = *(int128_t *)((char *)v106 - 16);
                                                v107 = v106 + 2;
                                                iter[1] = *v106;
                                                iter += 2;
                                                v106 = v107;
                                            } while (iter < (char *)v104 + v103);
                                        }
                                    }
                                    else
                                    {
                                        a1->field_18 = (char *)v104 + v103;
                                        v108 = a1->field_8;
                                        v109 = v1;
                                        *(unsigned short *)((char *)&v108->field_0 + 4) = v103;
                                        *(unsigned int *)&v108->field_0 = v78;
                                        v110 = v76 - 3;
                                        if (v110 >= 0x10000)
                                            goto LABEL_9db84;
LABEL_9d874:
                                        *(unsigned short *)((char *)&v108->field_0 + 6) = v110;
                                        a1->field_8 = &v108->field_4;
                                        if (!(int)a0[300])
                                            goto LABEL_9d988;
                                        goto LABEL_9d888;
                                    }
                                }
                                a1->field_18 = (char *)a1->field_18 + v103;
                                v108 = a1->field_8;
                                v109 = v1;
                                if (0x10000 > v103)
                                {
                                    v75 = v3;
                                    *(unsigned short *)((char *)&v108->field_0 + 4) = v103;
                                    *(unsigned int *)&v108->field_0 = v78;
                                    v110 = v76 - 3;
                                    if (0x10000 <= v110)
                                        goto LABEL_9db84;
                                    goto LABEL_9d874;
                                }
                                v111 = (char *)v108 - a1->field_0;
                                *(unsigned int *)&a1->field_48 = 1;
                                *(unsigned int *)((char *)&a1->field_48 + 4) = v111 >> 3;
                                v75 = v3;
                                *(unsigned short *)((char *)&v108->field_0 + 4) = v103;
                                *(unsigned int *)&v108->field_0 = v78;
                                v110 = v76 - 3;
                                if (v110 < 0x10000)
                                    goto LABEL_9d874;
LABEL_9db84:
                                v112 = (char *)v108 - a1->field_0 >> 3;
                                *(unsigned int *)&a1->field_48 = 2;
                                *(unsigned int *)((char *)&a1->field_48 + 4) = v112;
                                *(unsigned short *)((char *)&v108->field_0 + 6) = v110;
                                a1->field_8 = &v108->field_4;
                                if (!(int)a0[300])
                                    goto LABEL_9d988;
LABEL_9d888:
                                v113 = (int)a0[44];
                                v17 = &v15;
                                v16 = &v17;
                                v114 = v25 + v113;
                                v115 = i;
                                v116 = v115 - v114;
                                if (8 <= v116 + 1)
                                    v117 = 8;
                                else
                                    v117 = v116 + 1;
                                if (v115 < v114)
                                    j = 0;
                                else
                                    j = v117;
                                if (j + (unsigned int)v113 > (unsigned int)v113)
                                {
                                    v119 = (int)a0[52];
                                    v120 = (long long)a0[96];
                                    do
                                    {
                                        v121 = j;
                                        if (v29 == 6)
                                        {
                                            v122 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v25 + v113);
                                        }
                                        else if (v29 == 5)
                                        {
                                            v122 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v25 + v113);
                                        }
                                        else
                                        {
                                            v123 = (2654435761 * *(int *)((char *)v25 + v113) ^ (unsigned int)v120) >> ((char)(24 - v119) & 31);
                                            continue;
                                        }
                                        v123 = (v122 ^ v120) >> ((char)(56 - v119) & 63);
                                        v18 = &v19;
                                        v19 = &v18;
                                        v109[v113 & 7] = v123;
                                        v113 += 1;
                                        j = v121 - 1;
                                    } while (j);
                                }
                                *(unsigned int *)&a0[300] = 0;
LABEL_9d988:
                                l = v75 + v76;
                                v124 = l;
                                v125 = i;
                                if (l > i)
                                {
                                    v22 = l;
                                    v89 = v77;
                                    v32 = v31;
LABEL_9d578:
                                    v23 = v4;
                                    continue;
                                }
                                else
                                {
                                    do
                                    {
                                        v32 = v77;
                                        v77 = v31;
                                        v126 = l - v25;
                                        v127 = v9;
                                        if (v127 < (unsigned int)(v126 - (int)a0[28]))
                                        {
                                            v128 = arm64g_calculate_condition(132, v124, v125, 0);
                                            v129 = arm64g_calculate_condition(3, (v128 & 1 ? (int)a0[40] : 0), 0, 0);
                                            if (!(v129 & 1))
                                                goto LABEL_9da2a;
                                            goto LABEL_9da29;
                                        }
                                        else
                                        {
                                            v130 = arm64g_calculate_condition(132, v124, v125, 0);
                                            v131 = arm64g_calculate_condition(0, (v130 & 1 ? (int)a0[40] : 0), 0, 0);
                                            if (v131 & 1)
                                            {
LABEL_9da29:
                                                v132 = (unsigned int)(v126 - v127);
                                                goto LABEL_9da2c;
                                            }
                                            else
                                            {
LABEL_9da2a:
                                                v132 = (int)a0[28];
LABEL_9da2c:
                                                v133 = v126 - v31;
                                                v134 = v12;
                                                v135 = v133 - v134;
                                                v136 = v133 & 0xffffffff;
                                                v137 = v134;
                                                if ((unsigned int)v133 < v134)
                                                    v138 = v10;
                                                else
                                                    v138 = v25;
                                                if ((unsigned int)v31 <= (unsigned int)(v126 - v132))
                                                {
                                                    v139 = arm64g_calculate_condition(147, v136, v137, 0);
                                                    v140 = arm64g_calculate_condition(129, (v139 & 1 ? v135 : 0x20000000), (v139 & 1 ? 4 : 0), 0);
                                                    if (v140 & 1)
                                                        goto LABEL_9db24;
                                                }
                                                else
                                                {
                                                    v141 = arm64g_calculate_condition(147, v136, v137, 0);
                                                    v142 = arm64g_calculate_condition(128, (v141 & 1 ? v135 : 0x20000000), (v141 & 1 ? 4 : 0), 0);
                                                    if (v142 & 1)
                                                        goto LABEL_9db24;
                                                }
                                                if (*(int *)l != *(int *)((char *)v138 + v133))
                                                {
LABEL_9db24:
                                                    v22 = l;
                                                    v89 = v32;
                                                    v32 = v77;
                                                    v23 = v4;
                                                    break;
                                                }
                                            }
                                        }
                                        v143 = sub_84f30();
                                        v19 = &v18;
                                        v18 = &v19;
                                        if (l > v8)
                                            sub_82208(a1->field_18, l, l, v8);
                                        else
                                            *a1->field_18 = *(int128_t *)l;
                                        v144 = a1->field_8;
                                        *(unsigned short *)((char *)&v144->field_0 + 4) = 0;
                                        *(unsigned int *)&v144->field_0 = 1;
                                        v145 = v143 + 1;
                                        if (0x10000 <= v145)
                                        {
                                            v146 = (char *)v144 - a1->field_0;
                                            *(unsigned int *)&a1->field_48 = 2;
                                            *(unsigned int *)((char *)&a1->field_48 + 4) = v146 >> 3;
                                        }
                                        *(unsigned short *)((char *)&v144->field_0 + 6) = v145;
                                        l += v143 + 4;
                                        a1->field_8 = &v144->field_4;
                                        v31 = v32;
                                        v22 = l;
                                        v89 = v77;
                                        v124 = l;
                                        v125 = i;
                                        v23 = v4;
                                    } while (l <= i);
                                }
                            }
                        }
                    }
                }
            }
            v31 = v89;
            v54 = l;
            v55 = i;
        } while (i > l);
    }
    else
    {
        v89 = v31;
    }
    *a2 = v89;
    a2[1] = v32;
    return v23 - v22;
}
