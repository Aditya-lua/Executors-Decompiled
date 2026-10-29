/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc602dc..0xc60c4c (2416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c602dc_1 {
    unsigned short field_0;
    char field_2;
    char field_3;
    char field_4;
    char field_5;
    char padding_6[14];
    char field_14[17];
    char field_15;
} st_c602dc_1;

typedef struct st_c602dc_0 {
    unsigned short field_0;
    char field_2;
    char field_3;
    char field_4;
    char field_5;
    char field_6;
    char padding_7[13];
    char field_14[18];
    char field_15;
    char field_16;
} st_c602dc_0;

typedef struct st_c602dc_7 {
    unsigned short field_0;
    char field_2;
    char field_3[17];
    char field_4;
    char padding_5[15];
    uint128_t field_14;
} st_c602dc_7;

typedef struct st_c602dc_6 {
    char padding_0[33];
    char field_21[29];
    char field_22;
    char field_23;
    char padding_24[8];
    char field_2c;
    char padding_2d[1];
    char field_2e;
} st_c602dc_6;

typedef struct st_c602dc_4 {
    struct st_c602dc_5 *field_0;
} st_c602dc_4;

typedef struct st_c602dc_5 {
    struct st_c602dc_4 *field_0;
} st_c602dc_5;

typedef struct st_c602dc_3 {
    char field_0;
} st_c602dc_3;

typedef struct st_c602dc_2 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_c602dc_2;

extern st_c602dc_2 g_cc19f0;
extern st_c602dc_2 g_cc1a10;

void sub_c602dc(unsigned long a0, void* a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v19;  // x28
    unsigned long long v20;  // x27
    unsigned long long v29;  // x30
    unsigned long long v119;  // 4102
    void* iter;  // x16
    void* v121;  // x2
    unsigned long long v122;  // x3
    unsigned long long v123;  // x4
    uint128_t *iter1;  // x1
    void* iter2;  // x8
    unsigned long long i0;  // x5
    unsigned long long v127;  // x5
    uint128_t v128;  // q1
    void* v130;  // x2
    unsigned long long v131;  // x8
    void* v132;  // x2
    void* v133;  // x3
    unsigned long v134;  // x8
    unsigned long v135;  // x17
    unsigned long long v136;  // x2
    unsigned long long v137;  // 4117
    unsigned long v138;  // cc_dep1
    void* v31;  // x10
    unsigned long long v139;  // 4128
    unsigned long long v140;  // 4102
    unsigned long long v141;  // 4102
    void* v142;  // x16
    void* v143;  // x16
    void* v144;  // x3
    void* i2;  // x17
    void* v146;  // x2
    void* v147;  // x3
    unsigned long long v148;  // x2
    void* v32;  // x14
    unsigned long long v149;  // x3
    unsigned long long v150;  // x4
    void* v151;  // x2
    void* v152;  // x16
    void* v153;  // x5
    unsigned long long i3;  // x6
    unsigned long long v155;  // x6
    uint128_t v156;  // q1
    void* v158;  // x16
    void* v33;  // x17
    void* v159;  // x16
    void* v160;  // x17
    unsigned long v161;  // x11
    void* v162;  // x4
    void* v163;  // x5
    unsigned long long v164;  // x6
    void* i5;  // x4
    void* v166;  // x5
    unsigned long long v167;  // x6
    unsigned long long v168;  // x7
    void* node;  // x8
    void* v169;  // x21
    void* v170;  // x22
    unsigned long long i4;  // x23
    unsigned long long v172;  // x23
    uint128_t v173;  // q1
    void* v175;  // x5
    void* v176;  // x3
    void* v177;  // x4
    void* v178;  // x5
    char *v35;  // x9
    unsigned long long v179;  // x2
    unsigned long long v180;  // x7
    void* v181;  // x5
    uint128_t *v182;  // x6
    unsigned long long i6;  // x21
    unsigned long long v184;  // x21
    uint128_t v185;  // q1
    void* i7;  // x6
    void* v188;  // x5
    void* v36;  // x3
    unsigned long long v189;  // x21
    unsigned long long *v190;  // x17
    double *v191;  // x16
    unsigned long long v192;  // x3
    double *v193;  // x16
    unsigned long long v195;  // 4112
    void* v196;  // x5
    void* v197;  // x1
    unsigned long v198;  // cc_dep1
    st_c602dc_6 *v37;  // x4
    unsigned long v199;  // 4110
    unsigned long v200;  // cc_op
    unsigned long v201;  // cc_dep1
    unsigned long v202;  // cc_dep2
    unsigned long long v203;  // 4102
    unsigned long v204;  // 4110
    unsigned long long v205;  // 4102
    st_c602dc_1 *v206;  // x2
    st_c602dc_1 *v207;  // x17
    unsigned long v208;  // 4112
    void* v38;  // x5
    unsigned long v209;  // cc_op
    unsigned long v210;  // cc_dep1
    unsigned long v211;  // cc_dep2
    unsigned long long v212;  // 4110
    unsigned long v213;  // 4112
    unsigned long long v214;  // 4110
    unsigned long long v215;  // 4110
    unsigned long long v216;  // 4102
    unsigned long long v217;  // 4110
    unsigned long long v218;  // 4102
    unsigned long long v21;  // x26
    void* v39;  // x6
    void* v219;  // x16
    void* v220;  // x2
    unsigned long v221;  // x17
    unsigned long v222;  // x3
    unsigned long long v223;  // 4106
    unsigned long long v224;  // 4118
    unsigned long long v225;  // 4128
    unsigned long long v226;  // 4110
    unsigned long long v227;  // 4102
    unsigned long long v228;  // 4110
    void* v40;  // x16
    unsigned long long v229;  // 4102
    unsigned long v41;  // x25
    void* v42;  // x16
    unsigned long long v43;  // x2
    void* v44;  // x16
    unsigned long v45;  // x2
    void* v46;  // x1
    unsigned long v47;  // x20
    unsigned long long v48;  // 4106
    unsigned long long v22;  // x25
    unsigned long long v49;  // 4118
    unsigned long v50;  // cc_dep1
    unsigned long v51;  // cc_dep2
    unsigned long long v52;  // 4128
    void* j;  // x20
    st_c602dc_0 *v54;  // x27
    unsigned long long v55;  // 4110
    unsigned long long v56;  // 4102
    unsigned long long v57;  // 4110
    unsigned long long v58;  // 4102
    unsigned long long v23;  // x24
    st_c602dc_0 *v59;  // x1
    unsigned long long v60;  // x26
    void* v61;  // x16
    unsigned long long v62;  // x8
    void* v63;  // x2
    unsigned long v64;  // x8
    unsigned long v65;  // x25
    unsigned long long v66;  // 4106
    unsigned long long v67;  // x2
    unsigned long long v68;  // 4110
    unsigned long long v24;  // x23
    unsigned long v69;  // cc_dep1
    unsigned long v70;  // cc_dep2
    unsigned long long v71;  // 4112
    unsigned long long v72;  // 4102
    unsigned long long v73;  // 4112
    unsigned long long v74;  // 4102
    void* v75;  // x2
    unsigned int v76;  // w16
    void* v77;  // x16
    void* v78;  // x16
    unsigned long long v25;  // x22
    void* m;  // x25
    void* v80;  // x2
    void* v81;  // x26
    void* v82;  // x2
    unsigned long long v83;  // x26
    unsigned long long v84;  // x27
    void* v85;  // x2
    void* v86;  // x16
    void* v87;  // x20
    unsigned long long n;  // x28
    unsigned long long v26;  // x21
    unsigned long long v89;  // x28
    uint128_t v90;  // q1
    void* v92;  // x2
    unsigned int v93;  // w16
    void* l;  // x25
    void* v95;  // x2
    void* v96;  // x26
    unsigned long long v97;  // x2
    void* v98;  // x2
    unsigned long long v27;  // x20
    unsigned long long v99;  // x26
    unsigned long long v100;  // x27
    uint128_t v101;  // q0
    uint128_t *v102;  // x20
    unsigned long long k;  // x28
    unsigned long long v104;  // x28
    void* v106;  // x16
    void* v107;  // cc_dep1
    st_c602dc_7 *v108;  // x17
    void* v28;  // x19
    st_c602dc_7 *v109;  // x16
    void* v110;  // x16
    void* v111;  // x2
    unsigned long v112;  // cc_dep1
    unsigned long v113;  // cc_dep2
    void* v114;  // x16
    void* v115;  // x2
    unsigned long long v116;  // 4110
    unsigned long long v117;  // 4102
    unsigned long long v118;  // 4110
    st_c602dc_5 **v0;  // [bp-0x80]
    st_c602dc_5 **v1;  // [bp-0x78]
    st_c602dc_3 **v2;  // [bp-0x70], Other Possible Types: st_c602dc_5 **
    st_c602dc_5 **v3;  // [bp-0x70]
    st_c602dc_3 **v4;  // [bp-0x70]
    st_c602dc_5 **v5;  // [bp-0x68], Other Possible Types: st_c602dc_3 *
    unsigned long long v6;  // [bp-0x60]
    unsigned long long v7;  // [bp-0x58]
    unsigned long long v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    unsigned long long v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    unsigned long long v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    unsigned long long v14;  // [bp-0x20]
    void* v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = &v18;
    v17 = v29;
    if (sub_cceb8() && !(a3 >> 31 & 1) && (unsigned int)a3 && a2)
    {
        v32 = v31 - 32;
        v33 = sub_ccea4();
        node = a1;
        if ((unsigned int)a3 < 64)
            goto LABEL_c6098c;
        v36 = v35 - 15;
        v37 = v35 - 32;
        v38 = v31 - 64;
        v39 = v35 - 4;
        node = v28;
        while (1)
        {
            v40 = v33;
            v41 = *(char *)v40;
            v42 = v40 + 1;
            v43 = v41 >> 4;
            if (v43 == 15)
            {
                v2 = &v5;
                v5 = &v2;
                if (v36 > v42 && !(v44 = v33 + 2, v36 < v44))
                {
                    v45 = (char)v33[1];
                    if ((unsigned int)v45 != 0xff)
                    {
                        v46 = v44;
                    }
                    else
                    {
                        v45 = 0xff;
                        do
                        {
                            v46 = v44 + 1;
                            if (v36 < v46)
                                goto LABEL_c6070c;
                        } while ((v47 = *(char *)v44, v45 += v47, v44 = v46, v47 == 0xff));
                        v48 = arm64g_calculate_condition(18, v45, 1, 0);
                        if (!(v48 & 1))
                            goto LABEL_c60710;
                    }
                    v43 = v45 + 15;
                    v49 = arm64g_calculate_condition(50, node, v43, 0);
                    v50 = v46;
                    v51 = v43;
                    v52 = arm64g_calculate_condition(50, v46, v43, 0);
                    if (!(v49 & 1) || !(v52 & 1))
                        goto LABEL_c60710;
                    j = node + v43;
                    v54 = v46 + v43;
                    if (j <= v32)
                    {
                        v55 = arm64g_calculate_condition(146, v50, v51, 0);
                        v56 = arm64g_calculate_condition(132, (v55 & 1 ? v54 : 0x20000000), (v55 & 1 ? v37 : 0), 0);
                        if (v56 & 1)
                            goto LABEL_c607ec;
                        goto LABEL_c603dc;
                        break;
                    }
                    v57 = arm64g_calculate_condition(146, v50, v51, 0);
                    v58 = arm64g_calculate_condition(128, (v57 & 1 ? v54 : 0x20000000), (v57 & 1 ? v37 : 0), 0);
                    if (v58 & 1)
                        goto LABEL_c607ec;
                    do
                    {
LABEL_c603dc:
                        *(int128_t *)node = *(int128_t *)v46;
                        *(int128_t *)&node[16] = (int128_t)v46[16];
                        node += 32;
                        v46 += 32;
                    } while (node < j);
                    goto LABEL_c60418;
                }
                else
                {
LABEL_c6070c:
                    goto LABEL_c60710;
                }
                goto LABEL_c60710;
            }
            if (v35 - 0x11 >= v42)
            {
                *(int128_t *)node = *(int128_t *)v42;
                v54 = v42 + v43;
                j = node + v43;
            }
            else
            {
                v46 = v42;
                goto LABEL_c607ec;
            }
LABEL_c60418:
            v59 = v54;
            v60 = v59->field_0;
            v33 = &v59->field_2;
            v61 = j - v60;
            v62 = v41 & 15;
            if (v62 == 15)
            {
                v2 = &v5;
                v5 = &v2;
                v63 = &v54->field_3;
                if (v39 < v63)
                    goto LABEL_c6071c;
                v64 = v54->field_2;
                if ((unsigned int)v64 != 0xff)
                {
                    v33 = v63;
                }
                else
                {
                    v64 = 0xff;
                    do
                    {
                        v33 = v63 + 1;
                        if (v39 < v33)
                            goto LABEL_c60710;
                    } while ((v65 = *(char *)v63, v64 += v65, v63 = v33, v65 == 0xff));
                    v66 = arm64g_calculate_condition(18, v64, 1, 0);
                    if (!(v66 & 1))
                        goto LABEL_c60710;
                }
                v67 = v64 + 19;
                v68 = arm64g_calculate_condition(0x22, j, v67, 0);
                if (v68 & 1)
                    goto LABEL_c60710;
                if (j + v67 < v38)
                    goto LABEL_c60488;
                break;
            }
            v67 = v62 + 4;
            node = j + v67;
            v69 = node;
            v70 = v38;
            if (v38 <= node)
                break;
            if (v28 <= v61)
            {
                v71 = arm64g_calculate_condition(36, v69, v70, 0);
                v72 = arm64g_calculate_condition(35, (v71 & 1 ? v60 & 0xffff : 0), (v71 & 1 ? 8 : 0), 0);
                if (v72 & 1)
                    goto LABEL_c604c4;
                goto LABEL_c60488;
            }
            else
            {
                v73 = arm64g_calculate_condition(36, v69, v70, 0);
                v74 = arm64g_calculate_condition(32, (v73 & 1 ? v60 & 0xffff : 0), (v73 & 1 ? 8 : 0), 0);
                if (!(v74 & 1))
                {
LABEL_c60488:
                    if (v61 < v28)
                        goto LABEL_c60710;
                    node = j + v67;
                    if ((unsigned int)v60 >= 16)
                    {
                        do
                        {
                            v75 = j + -v60;
                            *(int128_t *)j = *(int128_t *)v75;
                            *(int128_t *)&j[16] = (int128_t)v75[16];
                            j += 32;
                        } while (j < node);
                    }
                    else
                    {
                        v0 = &v1;
                        v1 = &v0;
                        if ((unsigned int)v60 == 4)
                        {
                            v76 = *(int *)v61;
LABEL_c60578:
                            *(unsigned int *)j = v76;
                            *(unsigned int *)&j[4] = v76;
                            if ((long long)v67 >= 9)
                            {
                                l = j + 8;
                                v95 = v67 + j;
                                v96 = j + 16;
                                if (v96 >= v95)
                                    v95 = v96;
                                v97 = v95 - j - 9;
                                if (56 > v97)
                                {
                                    v98 = j;
                                    goto LABEL_c60634;
                                }
                                else
                                {
                                    v99 = (v97 >> 3) + 1;
                                    v100 = v99 & 0x3ffffffffffffff8;
                                    l += v100 * 8;
                                    v98 = j + v100 * 8;
                                    v101 = CONCAT(v76 | v76 * 0x100000000, v76 | v76 * 0x100000000);
                                    v102 = j + 40;
                                    k = v100;
                                    do
                                    {
                                        v104 = k;
                                        *(uint128_t *)((char *)v102 - 32) = v101;
                                        *(uint128_t *)((char *)v102 - 16) = v101;
                                        *v102 = v101;
                                        v102[1] = v101;
                                        v102 += 4;
                                        k = v104 - 8;
                                    } while (k);
                                    if (v99 != v100)
                                    {
                                        do
                                        {
LABEL_c60634:
                                            *(unsigned int *)l = v76;
                                            l += 8;
                                            *(unsigned int *)&v98[12] = v76;
                                            v98 = l;
                                        } while (l < node);
                                    }
                                }
                            }
                        }
                        else if ((unsigned int)v60 == 2)
                        {
                            v93 = *(short *)v61;
                            v76 = v93 | v93 * 0x10000;
                            goto LABEL_c60578;
                        }
                        else if ((unsigned int)v60 == 1)
                        {
                            v76 = 0x1010101 * *(char *)v61;
                            goto LABEL_c60578;
                        }
                        else
                        {
                            v3 = &v5;
                            v5 = &v3;
                            if (7 >= (unsigned int)v60)
                            {
                                *(unsigned int *)j = 0;
                                *(char *)j = *(char *)v61;
                                *(char *)&j[1] = (char)v61[1];
                                *(char *)&j[2] = (char)v61[2];
                                *(char *)&j[3] = (char)v61[3];
                                v77 = v61 + (&g_cc19f0.field_0)[v60];
                                *(int *)&j[4] = *(int *)v77;
                                v78 = v77 - (&g_cc1a10.field_0)[v60];
                            }
                            else
                            {
                                v78 = v61 + 8;
                                *(long long *)j = *(long long *)v61;
                            }
                            m = j + 8;
                            v80 = v67 + j;
                            v81 = j + 16;
                            if (v81 >= v80)
                                v80 = v81;
                            v82 = v80 - j - 9;
                            if (v82 < 24 || 32 > j - v78 + 8)
                            {
                                v85 = v78;
                                goto LABEL_c60690;
                            }
                            else
                            {
                                v83 = (v82 >> 3) + 1;
                                v84 = v83 & 0x3ffffffffffffffc;
                                m += v84 * 8;
                                v85 = v78 + v84 * 8;
                                v86 = v78 + 16;
                                v87 = j + 24;
                                n = v84;
                                do
                                {
                                    v89 = n;
                                    v90 = *(int128_t *)v86;
                                    *(int128_t *)((char *)v87 - 16) = *(int128_t *)((char *)v86 - 16);
                                    *(uint128_t *)v87 = v90;
                                    v86 += 32;
                                    v87 += 32;
                                    n = v89 - 4;
                                } while (n);
                                if (v83 != v84)
                                {
                                    do
                                    {
LABEL_c60690:
                                        v92 = v85 + 8;
                                        *(long long *)m = *(long long *)v85;
                                        m += 8;
                                        v85 = v92;
                                    } while (m < node);
                                }
                            }
                        }
                    }
                }
                else
                {
LABEL_c604c4:
                    *(long long *)j = *(long long *)v61;
                    *(long long *)&j[8] = (long long)v61[8];
                    *(short *)&j[16] = (short)v61[16];
                }
            }
        }
        while (1)
        {
            if (v61 < v28)
            {
LABEL_c60710:
                goto LABEL_c609f8;
            }
            node = j + v67;
            if (v60 > 7)
            {
                v142 = v61 + 8;
                *(long long *)j = *(long long *)v61;
            }
            else
            {
                *(unsigned int *)j = 0;
                *(char *)j = *(char *)v61;
                *(char *)&j[1] = (char)v61[1];
                *(char *)&j[2] = (char)v61[2];
                *(char *)&j[3] = (char)v61[3];
                v143 = v61 + (&g_cc19f0.field_0)[v60];
                *(int *)&j[4] = *(int *)v143;
                v142 = v143 - (&g_cc1a10.field_0)[v60];
            }
            v144 = j + 8;
            if (v31 - 12 >= node)
            {
                *(long long *)v144 = *(long long *)v142;
                if (v67 >= 0x11)
                {
                    i2 = j + 16;
                    v146 = v67 + j;
                    v147 = j + 24;
                    if (v147 >= v146)
                        v146 = v147;
                    v148 = v146 - j - 0x11;
                    if (v148 < 40 || 32 > j - v142 + 8)
                    {
                        v151 = v142;
                        goto LABEL_c60974;
                    }
                    else
                    {
                        v149 = (v148 >> 3) + 1;
                        v150 = v149 & 0x3ffffffffffffffc;
                        i2 += v150 * 8;
                        v151 = v142 + v150 * 8;
                        v152 = v142 + 24;
                        v153 = j + 32;
                        i3 = v150;
                        do
                        {
                            v155 = i3;
                            v156 = *(int128_t *)v152;
                            *(int128_t *)((char *)v153 - 16) = *(int128_t *)((char *)v152 - 16);
                            *(uint128_t *)v153 = v156;
                            v152 += 32;
                            v153 += 32;
                            i3 = v155 - 4;
                        } while (i3);
                        if (v149 != v150)
                        {
LABEL_c60974:
                            v158 = v151 + 8;
                            do
                            {
                                v159 = v158 + 8;
                                *(long long *)i2 = *(long long *)v158;
                                i2 += 8;
                                v158 = v159;
                            } while (i2 < node);
                        }
                    }
                }
                goto LABEL_c60988;
            }
            if (v31 - 5 < node)
                goto LABEL_c60710;
            v160 = v31 - 7;
            if (v160 <= v144)
            {
                v160 = v144;
                v176 = v142;
                goto LABEL_c60b64;
            }
            v162 = v28 + v161 - 7;
            v163 = j + 16;
            if (v163 >= v162)
                v162 = v163;
            v164 = v162 - j - 9;
            if (40 > v164)
            {
                i5 = v144;
                v166 = v142;
            }
            else
            {
                i5 = v144;
                v166 = v142;
                if (j - v142 + 8 >= 32)
                {
                    v167 = (v164 >> 3) + 1;
                    v168 = v167 & 0x3ffffffffffffffc;
                    i5 = v144 + v168 * 8;
                    v166 = v142 + v168 * 8;
                    v169 = v142 + 16;
                    v170 = j + 24;
                    i4 = v168;
                    do
                    {
                        v172 = i4;
                        v173 = *(int128_t *)v169;
                        *(int128_t *)((char *)v170 - 16) = *(int128_t *)((char *)v169 - 16);
                        *(uint128_t *)v170 = v173;
                        v169 += 32;
                        v170 += 32;
                        i4 = v172 - 4;
                    } while (i4);
                    if (v167 == v168)
                        goto LABEL_c60b5c;
                }
            }
            do
            {
                v175 = v166 + 8;
                *(long long *)i5 = *(long long *)v166;
                i5 += 8;
                v166 = v175;
            } while (i5 < v160);
LABEL_c60b5c:
            v176 = v142 + v160 - v144;
LABEL_c60b64:
            if (node > v160)
            {
                v177 = v28 + v161 - 7;
                v178 = j + 8;
                if (v178 >= v177)
                    v177 = v178;
                v179 = v67 + j - v177;
                if (v179 >= 8 && v178 - v142 >= 32)
                {
                    v180 = 0;
                    if (v179 >= 32)
                    {
                        v180 = v179 & 0xffffffffffffffe0;
                        v181 = v160 + 16;
                        v182 = v177 - j + v142 + 8;
                        i6 = v180;
                        do
                        {
                            v184 = i6;
                            v185 = *v182;
                            *(int128_t *)((char *)v181 - 16) = *(int128_t *)((char *)v182 - 16);
                            *(uint128_t *)v181 = v185;
                            v181 += 32;
                            v182 += 2;
                            i6 = v184 - 32;
                        } while (i6);
                        if (v179 != v180)
                        {
                            i7 = v160 + v180;
                            v188 = v176 + v180;
                            if (v179 & 24)
                                goto LABEL_c60bf0;
                            goto LABEL_c60c38;
                        }
                    }
                    else
                    {
LABEL_c60bf0:
                        v189 = v179 & 0xfffffffffffffff8;
                        v188 = v176 + v189;
                        i7 = v160 + v189;
                        v190 = v160 + v180;
                        v191 = v180 + v177 - j + v142 - 8;
                        v192 = v180 - v189;
                        do
                        {
                            v193 = v191 + 1;
                            *(double *)v190 = *v191;
                            v190 += 1;
                            v195 = arm64g_calculate_condition(18, v192, 8, 0);
                            v192 += 8;
                            v191 = v193;
                        } while (v195 & 1);
                        if (v179 != v189)
                            goto LABEL_c60c38;
                    }
                }
                else
                {
                    v188 = v176;
                    i7 = v160;
                    do
                    {
LABEL_c60c38:
                        v196 = v188 + 1;
                        *(char *)i7 = *(char *)v188;
                        i7 += 1;
                        v188 = v196;
                    } while (i7 < node);
                }
            }
LABEL_c60988:
LABEL_c6098c:
            v197 = v33;
            v41 = *(char *)v197;
            v46 = v197 + 1;
            while (1)
            {
                v43 = v41 >> 4;
                v198 = v43;
                if (v43 == 15)
                    break;
                if (v46 < v35 - 16)
                {
                    v199 = arm64g_calculate_condition(52, v198, 15, 0);
                    v200 = 4;
                    v201 = (v199 & 1 ? node : 0x20000000);
                    v202 = (v199 & 1 ? v32 : 0);
                    v203 = arm64g_calculate_condition(132, v201, v202, 0);
                    if (!(v203 & 1))
                        goto LABEL_c6073c;
                    goto LABEL_c607ec;
                }
                v204 = arm64g_calculate_condition(52, v198, 15, 0);
                v200 = 0;
                v201 = (v204 & 1 ? node : 0x20000000);
                v202 = (v204 & 1 ? v32 : 0);
                v205 = arm64g_calculate_condition(128, v201, v202, 0);
                if (v205 & 1)
                    goto LABEL_c607ec;
LABEL_c6073c:
                *(int128_t *)node = *(int128_t *)v46;
                j = node + v43;
                v206 = v46 + v43;
                v131 = v41 & 15;
                v207 = v206;
                v60 = v207->field_0;
                v33 = &v207->field_2;
                v61 = j - v60;
                if (v131 != 15)
                {
                    v208 = arm64g_calculate_condition(v200 | 16, v201, v202, 0);
                    v209 = 3;
                    v210 = (v208 & 1 ? v60 & 0xffff : 0);
                    v211 = (v208 & 1 ? 8 : 0);
                    v212 = arm64g_calculate_condition(35, v210, v211, 0);
                    if (!(v212 & 1))
                        goto LABEL_c60766;
                    goto LABEL_c60765;
                }
                v213 = arm64g_calculate_condition(v200 | 16, v201, v202, 0);
                v209 = 0;
                v210 = (v213 & 1 ? v60 & 0xffff : 0);
                v211 = (v213 & 1 ? 8 : 0);
                v214 = arm64g_calculate_condition(32, v210, v211, 0);
                if (v214 & 1)
                {
LABEL_c60765:
                    v215 = arm64g_calculate_condition(v209 | 32, v210, v211, 0);
                    v216 = arm64g_calculate_condition(52, (v215 & 1 ? v61 : 0), (v215 & 1 ? v28 : 0), 0);
                    if (!(v216 & 1))
                        goto LABEL_c6076c;
                    goto LABEL_c6089c;
                }
LABEL_c60766:
                v217 = arm64g_calculate_condition(v209 | 32, v210, v211, 0);
                v218 = arm64g_calculate_condition(48, (v217 & 1 ? v61 : 0), (v217 & 1 ? v28 : 0), 0);
                if (v218 & 1)
                    goto LABEL_c6089c;
LABEL_c6076c:
                *(long long *)j = *(long long *)v61;
                *(long long *)&j[8] = (long long)v61[8];
                *(short *)&j[16] = (short)v61[16];
                node = j + v131 + 4;
                v46 = &v206->field_3;
                v41 = v206->field_2;
            }
            v219 = v35 - 15;
            v5 = &v2;
            v2 = &v5;
            if (v219 <= v46)
                goto LABEL_c60710;
            v220 = v33 + 2;
            if (v219 < v220)
            {
LABEL_c6071c:
                goto LABEL_c60710;
            }
            v221 = *(char *)v46;
            if ((unsigned int)v221 != 0xff)
            {
                v46 = v220;
                goto LABEL_c607d0;
            }
            else
            {
                v221 = 0xff;
            }
            do
            {
                v46 = v220 + 1;
                if (v219 < v46)
                    goto LABEL_c60710;
            } while ((v222 = *(char *)v220, v221 += v222, v220 = v46, v222 == 0xff));
            v223 = arm64g_calculate_condition(18, v221, 1, 0);
            if (!(v223 & 1))
                goto LABEL_c60710;
LABEL_c607d0:
            v43 = v221 + 15;
            v224 = arm64g_calculate_condition(50, node, v43, 0);
            v225 = arm64g_calculate_condition(50, v46, v43, 0);
            if (!(v224 & 1) || !(v225 & 1))
                goto LABEL_c60710;
LABEL_c607ec:
            j = node + v43;
            v106 = v31 - 12;
            v107 = j;
            if (v106 < v107 || !(v108 = v46 + v43, v109 = v35 - 8, v107 = v108, v106 = v109, v109 >= v108))
                break;
            v110 = v43 + node;
            v111 = node + 8;
            v112 = v110;
            v113 = v111;
            if (v111 >= v110)
                v110 = v111;
            v114 = v110 + ~node;
            v115 = node - v46;
            if (24 <= v114)
            {
                v116 = arm64g_calculate_condition(36, v112, v113, 0);
                v117 = arm64g_calculate_condition(132, (v116 & 1 ? v115 : 0), (v116 & 1 ? 31 : 0), 0);
                if (v117 & 1)
                    goto LABEL_c60840;
                goto LABEL_c60834;
            }
            else
            {
                v118 = arm64g_calculate_condition(36, v112, v113, 0);
                v119 = arm64g_calculate_condition(128, (v118 & 1 ? v115 : 0), (v118 & 1 ? 31 : 0), 0);
                if (!(v119 & 1))
                {
LABEL_c60834:
                    iter = node;
                    v121 = v46;
                    goto LABEL_c60880;
                }
                else
                {
LABEL_c60840:
                    v122 = (v114 >> 3) + 1;
                    v123 = v122 & 0x3ffffffffffffffc;
                    iter = node + v123 * 8;
                    v121 = v46 + v123 * 8;
                    iter1 = v46 + 16;
                    iter2 = node + 16;
                    i0 = v123;
                    do
                    {
                        v127 = i0;
                        v128 = *iter1;
                        *(int128_t *)((char *)iter2 - 16) = *(int128_t *)((char *)iter1 - 16);
                        *(uint128_t *)iter2 = v128;
                        iter1 += 2;
                        iter2 += 32;
                        i0 = v127 - 4;
                    } while (i0);
                    if (v122 == v123)
                        goto LABEL_c60890;
                    do
                    {
LABEL_c60880:
                        v130 = v121 + 8;
                        *(long long *)iter = *(long long *)v121;
                        iter += 8;
                        v121 = v130;
                    } while (iter < j);
LABEL_c60890:
                    v60 = v108->field_0;
                    v33 = &v108->field_2;
                    v61 = j - v60;
                    v131 = v41 & 15;
                }
            }
LABEL_c6089c:
            if (v131 == 15)
            {
                v132 = v35 - 4;
                v5 = &v2;
                v4 = &v5;
                v133 = v33 + 1;
                if (v132 >= v133)
                {
                    v134 = *(char *)v33;
                    if (v134 != 0xff)
                    {
                        v33 = v133;
                    }
                    else
                    {
                        do
                        {
                            v33 = v133 + 1;
                            if (v132 < v33)
                                goto LABEL_c60710;
                        } while ((v135 = *(char *)v133, v134 += v135, v133 = v33, v135 == 0xff));
                    }
                    v136 = v134 + 15;
                    v137 = arm64g_calculate_condition(50, j, v136, 0);
                    v138 = v134;
                    v139 = arm64g_calculate_condition(2, v134, 1, 0);
                    if (v139 & 1)
                    {
                        v131 = 15;
                        v140 = arm64g_calculate_condition(2, v138, 1, 0);
                        if (!(v140 & 1))
                            goto LABEL_c608f0;
                        goto LABEL_c60710;
                    }
                    else
                    {
                        v131 = v136;
                        v141 = arm64g_calculate_condition(2, v138, 1, 0);
                        if (!(v141 & 1))
                        {
LABEL_c608f0:
                            if (v137 & 1)
                                goto LABEL_c608fc;
                            goto LABEL_c60710;
                        }
                    }
                }
                else
                {
                    goto LABEL_c60710;
                }
            }
            else
            {
                v33 = v33;
LABEL_c608fc:
                v67 = v131 + 4;
            }
        }
        if (v46 + v43 == v35)
        {
            v226 = arm64g_calculate_condition(4, v107, v106, 0);
            v227 = arm64g_calculate_condition(132, (v226 & 1 ? j : 0x20000000), (v226 & 1 ? v31 : 0), 0);
            if (!(v227 & 1))
                goto LABEL_c609ec;
            goto LABEL_c60710;
        }
        else
        {
            v228 = arm64g_calculate_condition(4, v107, v106, 0);
            v229 = arm64g_calculate_condition(128, (v228 & 1 ? j : 0x20000000), (v228 & 1 ? v31 : 0), 0);
            if (v229 & 1)
                goto LABEL_c60710;
LABEL_c609ec:
            _memmove(node);
        }
    }
LABEL_c609f8:
}
