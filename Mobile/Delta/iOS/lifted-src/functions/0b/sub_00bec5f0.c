/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbec5f0..0xbed184 (2964 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bec5f0_1 {
    struct st_bec5f0_2 *field_0;
    unsigned long long field_8;
    unsigned short field_10;
} st_bec5f0_1;

typedef struct st_bec5f0_0 {
    char padding_0[24];
    short field_18;
    char field_1a;
} st_bec5f0_0;

typedef struct st_bec5f0_2 {
    char field_0;
} st_bec5f0_2;

extern long long g_e07fdf;
extern long long g_efa740;
extern long long g_efab00;
extern long long g_efab18;
extern long long g_efab30;
extern long long g_efab48;
extern long long g_efab60;
extern long long g_efab78;
extern long long g_efab90;
extern long long g_efaba8;

char * sub_bec5f0(st_bec5f0_1 *a0, st_bec5f0_0 *a1, char *a2)
{
    unsigned long long v79;  // x12
    unsigned long long v80;  // x9
    unsigned long long v89;  // x13
    unsigned long long v178;  // 4192
    unsigned long long v179;  // 4200
    unsigned long long v180;  // x1
    unsigned long long v181;  // x1
    unsigned long long v182;  // x1
    unsigned long v183;  // cc_dep1
    unsigned long v184;  // cc_dep2
    unsigned long long v185;  // 4105
    unsigned long long v186;  // 4117
    unsigned long long v187;  // x7
    unsigned long long v90;  // x9
    unsigned long long v188;  // w19
    void* v189;  // x25
    unsigned long long i2;  // x1
    unsigned long long v191;  // x1
    unsigned long long v193;  // 4180
    unsigned long long v194;  // 4188
    unsigned long long v196;  // x1
    unsigned long long v197;  // x1
    unsigned long long iter;  // x21
    unsigned long long v198;  // x1
    unsigned long v199;  // cc_dep1
    unsigned long v200;  // cc_dep2
    unsigned long long v201;  // 4105
    unsigned long long v202;  // 4117
    unsigned long long v203;  // x1
    unsigned long long i3;  // x7
    unsigned int *node;  // x19
    unsigned long long v206;  // x7
    unsigned long long v207;  // x17
    unsigned long long v92;  // x1
    unsigned long long v209;  // x1
    unsigned long long i4;  // x7
    void* iter1;  // x19
    unsigned long long v212;  // x7
    unsigned long long v213;  // x17
    unsigned long long i5;  // x1
    void* iter2;  // x7
    unsigned long long v217;  // x1
    unsigned long long *v93;  // x0
    unsigned long long v218;  // x8
    unsigned long long v220;  // x1
    unsigned long long v221;  // x9
    unsigned long long v222;  // x9
    unsigned long long v223;  // 4102
    unsigned long long v224;  // x9
    unsigned long long v225;  // x9
    unsigned long long v226;  // 4106
    unsigned long long v227;  // x8
    unsigned short v94;  // x19
    st_bec5f0_1 *v228;  // x8
    unsigned long long v95;  // x8
    unsigned long long v96;  // x26
    unsigned long long v97;  // x1
    void* v98;  // x9
    unsigned long long v81;  // x8
    unsigned int *v99;  // x10
    unsigned long long i;  // x11
    unsigned long long v101;  // x11
    unsigned long long v103;  // 4180
    unsigned long long v104;  // 4188
    unsigned long long v106;  // x27
    unsigned long long v107;  // x9
    unsigned long long v108;  // x9
    unsigned long long v82;  // 4107
    unsigned long v109;  // cc_dep1
    unsigned long v110;  // cc_dep2
    unsigned long long v111;  // 4141
    unsigned long long v112;  // 4146
    unsigned long long j;  // x9
    unsigned int *v114;  // x10
    unsigned long long v115;  // x9
    unsigned long long v116;  // x8
    unsigned long long idx;  // x1
    unsigned long long v83;  // w24
    unsigned long long v119;  // x8
    unsigned long long k;  // x9
    void* v121;  // x10
    unsigned long long v122;  // x9
    unsigned long long v123;  // x8
    unsigned long long v125;  // x8
    unsigned long long l;  // x9
    void* v127;  // x10
    unsigned long long v128;  // x9
    unsigned long long v84;  // x21
    unsigned long long v129;  // x8
    unsigned long long v131;  // x9
    unsigned long long v132;  // x1
    char *dst;  // x0
    unsigned long long v134;  // x28
    unsigned long long v135;  // x22
    unsigned long long v136;  // x8
    unsigned long long v137;  // x8
    unsigned long long v85;  // x13
    unsigned long long v138;  // 4102
    unsigned long long v139;  // w7
    unsigned long long v140;  // x7
    unsigned int *v141;  // x8
    unsigned int *v142;  // x19
    unsigned long long v143;  // x21
    unsigned long long m;  // x21
    unsigned int v146;  // w25
    unsigned long long v147;  // 4192
    unsigned int v86;  // w13
    unsigned long long v148;  // 4200
    unsigned long long v149;  // x19
    unsigned long long v150;  // 4102
    unsigned long long v151;  // x19
    unsigned int *v152;  // x1
    unsigned long long v153;  // x23
    unsigned long long n;  // x23
    unsigned long long v156;  // 4192
    unsigned long long v157;  // 4200
    unsigned long long v87;  // x23
    unsigned long long v158;  // x1
    unsigned long long v159;  // x19
    unsigned long long v160;  // x19
    unsigned long long v161;  // 4102
    unsigned long long v162;  // x19
    unsigned int *v163;  // x8
    unsigned int *v164;  // x21
    unsigned long long v165;  // x23
    unsigned long long i0;  // x23
    unsigned long long v167;  // 4192
    unsigned long long v88;  // x13
    unsigned long long v168;  // 4200
    unsigned long long v169;  // x8
    unsigned long long v170;  // x8
    unsigned long long v171;  // 4102
    unsigned long long v172;  // x1
    unsigned int *v173;  // x8
    unsigned int *v174;  // x19
    unsigned long long v175;  // x23
    unsigned long long i1;  // x23
    st_bec5f0_1 *v0;  // [bp-0x5e0], Other Possible Types: unsigned long long
    unsigned long v1;  // [bp-0x5d8]
    uint1280_t v2;  // [bp-0x5d0], Other Possible Types: char
    unsigned long long v3;  // [bp-0x530]
    unsigned long long v4;  // [bp-0x528]
    unsigned long long v5;  // [bp-0x520]
    unsigned long long v6;  // [bp-0x510]
    unsigned long long v7;  // [bp-0x500]
    unsigned long long v8;  // [bp-0x4f0]
    unsigned long long v9;  // [bp-0x4e0]
    unsigned long long v10;  // [bp-0x4d0]
    unsigned long long v11;  // [bp-0x4c0]
    unsigned long long v12;  // [bp-0x4b0]
    unsigned long long v13;  // [bp-0x4a0]
    unsigned long long v14;  // [bp-0x490]
    unsigned long long v15;  // [bp-0x488]
    unsigned long long v16;  // [bp-0x480]
    unsigned long long v17;  // [bp-0x478]
    unsigned long long v18;  // [bp-0x468]
    unsigned long long v19;  // [bp-0x458]
    unsigned long long v20;  // [bp-0x448]
    unsigned long long v21;  // [bp-0x438]
    unsigned long long v22;  // [bp-0x428]
    unsigned long long v23;  // [bp-0x418]
    unsigned long long v24;  // [bp-0x408]
    unsigned long long v25;  // [bp-0x3f8]
    unsigned long long v26;  // [bp-0x3e8]
    unsigned long long v27;  // [bp-0x3e0]
    uint1280_t v28;  // [bp-0x3d8]
    unsigned long long v29;  // [bp-0x338]
    uint128_t v30;  // [bp-0x330]
    uint128_t v31;  // [bp-0x320]
    uint128_t v32;  // [bp-0x310]
    uint128_t v33;  // [bp-0x300]
    uint128_t v34;  // [bp-0x2f0]
    uint128_t v35;  // [bp-0x2e0]
    uint128_t v36;  // [bp-0x2d0]
    uint128_t v37;  // [bp-0x2c0]
    uint128_t v38;  // [bp-0x2b0]
    uint128_t v39;  // [bp-0x2a0]
    unsigned long long v40;  // [bp-0x290]
    char v41;  // [bp-0x284]
    uint128_t v42;  // [bp-0x280]
    uint128_t v43;  // [bp-0x270]
    uint128_t v44;  // [bp-0x260]
    uint128_t v45;  // [bp-0x250]
    uint128_t v46;  // [bp-0x240]
    uint128_t v47;  // [bp-0x230]
    uint128_t v48;  // [bp-0x220]
    uint128_t v49;  // [bp-0x210]
    uint128_t v50;  // [bp-0x200]
    uint128_t v51;  // [bp-0x1f0]
    unsigned long long v52;  // [bp-0x1e0]
    char v53;  // [bp-0x1d4]
    uint128_t v54;  // [bp-0x1d0]
    uint128_t v55;  // [bp-0x1c0]
    uint128_t v56;  // [bp-0x1b0]
    uint128_t v57;  // [bp-0x1a0]
    uint128_t v58;  // [bp-0x190]
    uint128_t v59;  // [bp-0x180]
    uint128_t v60;  // [bp-0x170]
    uint128_t v61;  // [bp-0x160]
    uint128_t v62;  // [bp-0x150]
    uint128_t v63;  // [bp-0x140]
    unsigned long long v64;  // [bp-0x130]
    char v65;  // [bp-0x124]
    uint128_t v66;  // [bp-0x120]
    uint128_t v67;  // [bp-0x110]
    uint128_t v68;  // [bp-0x100]
    uint128_t v69;  // [bp-0xf0]
    uint128_t v70;  // [bp-0xe0]
    uint128_t v71;  // [bp-0xd0]
    uint128_t v72;  // [bp-0xc0]
    uint128_t v73;  // [bp-0xb0]
    uint128_t v74;  // [bp-0xa0]
    uint128_t v75;  // [bp-0x90]
    unsigned long long v76;  // [bp-0x80]
    char *v77;  // [bp-0x10]
    char v78;  // [bp+0x0]

    v77 = &v78;
    v0 = 0;
    v79 = *(long long *)&a1->padding_0[0];
    if (v79)
    {
        v80 = *(long long *)&a1->padding_0[8];
        if (!v80)
            goto LABEL_bed0d8;
        v81 = *(long long *)&a1->padding_0[16];
        if (!v81)
            goto LABEL_bed0f0;
        v82 = arm64g_calculate_condition(0x22, v81, v79, 0);
        if (v82 & 1)
            goto LABEL_bed108;
        if (v79 < v80)
            goto LABEL_bed120;
        v0 = a0;
        v83 = a1->field_1a;
        v84 = a1->field_18;
        v85 = v81 + v79 - 1;
        v2 = _INSERT(CONCAT(v2, 0), 0, v79);
        if (!v85)
            v86 = 64;
        else
            v86 = Clz(v85);
        *(uint128_t *)((char *)&v2 + 8) = 0;
        *(uint128_t *)((char *)&v2 + 24) = 0;
        v87 = 82746495104 + (unsigned int)(v84 - v86) * 1292913986;
        *(uint128_t *)((char *)&v2 + 40) = 0;
        *(uint128_t *)((char *)&v2 + 56) = 0;
        if (v79 <= 0xffffffff)
            v88 = 1;
        else
            v88 = 2;
        *(uint128_t *)((char *)&v2 + 72) = 0;
        *(uint128_t *)((char *)&v2 + 88) = 0;
        *(uint128_t *)((char *)&v2 + 104) = 0;
        *(uint128_t *)((char *)&v2 + 120) = 0;
        *(uint128_t *)((char *)&v2 + 0x88) = 0;
        *(unsigned long long *)((char *)&v2 + 152) = 0;
        v3 = v88;
        if (v80 <= 0xffffffff)
            v89 = 1;
        else
            v89 = 2;
        v14 = 0;
        v15 = v89;
        v5 = 0;
        v6 = 0;
        v7 = 0;
        v8 = 0;
        v9 = 0;
        v10 = 0;
        v11 = 0;
        v12 = 0;
        v13 = 0;
        v4 = v80;
        if (v81 <= 0xffffffff)
            v90 = 1;
        else
            v90 = 2;
        v26 = 0;
        v27 = v90;
        v17 = 0;
        v18 = 0;
        v19 = 0;
        v20 = 0;
        v21 = 0;
        v22 = 0;
        v23 = 0;
        v24 = 0;
        v25 = 0;
        v16 = v81;
        *(uint128_t *)((char *)&v28 + 144) = 0;
        *(uint128_t *)((char *)&v28 + 132) = 0;
        *(uint128_t *)((char *)&v28 + 116) = 0;
        *(uint128_t *)((char *)&v28 + 100) = 0;
        *(uint128_t *)((char *)&v28 + 84) = 0;
        *(uint128_t *)((char *)&v28 + 0x44) = 0;
        *(uint128_t *)((char *)&v28 + 52) = 0;
        *(uint128_t *)((char *)&v28 + 36) = 0;
        *(uint128_t *)((char *)&v28 + 20) = 0;
        *(uint128_t *)((char *)&v28 + 4) = 0;
        v29 = 1;
        *(unsigned int *)&v28 = 1;
        if ((long long)v84 >= 0)
        {
            sub_be94fc(&v2, v84);
            sub_be94fc(&v4, v84);
            sub_be94fc(&v16, v84);
            iter = v87 >> 32;
            if (v87 >> 47 & 1)
                goto LABEL_bec7a4;
LABEL_bec780:
            v92 = (v87 * 0x100000000 | v87 >> 32) & 0xffffffff00007fff & 0x7fff;
            v93 = &v28;
        }
        else
        {
            sub_be94fc(&v28, (short)-(unsigned int)v84);
            iter = v87 >> 32;
            if (!(v87 >> 47 & 1))
                goto LABEL_bec780;
LABEL_bec7a4:
            v94 = -(unsigned int)iter;
            sub_bebce0(&v2, v94);
            sub_bebce0(&v4, v94);
            v93 = &v16;
            v92 = v94;
        }
        sub_bebce0(v93, v92);
        v74 = *(uint128_t *)((void*)&v2 + 128);
        v75 = *(uint128_t *)((void*)&v2 + 144);
        v95 = v3;
        v76 = v95;
        v70 = *(uint128_t *)((void*)&v2 + 64);
        v71 = *(uint128_t *)((void*)&v2 + 80);
        v73 = *(uint128_t *)((void*)&v2 + 112);
        v72 = *(uint128_t *)((void*)&v2 + 96);
        v66 = *(uint128_t *)&v2;
        v67 = *(uint128_t *)((void*)&v2 + 16);
        v69 = *(uint128_t *)((void*)&v2 + 48);
        v68 = *(uint128_t *)((void*)&v2 + 32);
        v96 = v27;
        if (v95 < v96)
            v97 = v96;
        else
            v97 = v95;
        if (40 >= v97)
        {
            if (v97)
            {
                v95 = 0;
                v98 = &v16;
                v99 = &v66;
                i = v97;
                do
                {
                    v101 = i;
                    v103 = arm64g_calculate_flag_c(3, (unsigned int)v95 & 1, 1, 0);
                    v104 = arm64g_calculate_condition(53, *(int *)v98, *v99, v103 & 0xffffffff);
                    v95 = !(v104 & 1);
                    *v99 = *(int *)v98 + *v99 + (unsigned int)v103;
                    v99 += 1;
                    v98 += 4;
                    i = v101 - 1;
                } while (i);
                if ((unsigned int)v95)
                {
                    if (v97 == 40)
                        goto LABEL_bed160;
                    v95 = &v66;
                    *(unsigned int *)((char *)&v66 + 4 * v97) = 1;
                    v97 += 1;
                }
            }
            v76 = v97;
            v106 = v29;
            if (v106 >= v97)
                v97 = v106;
            if (41 > v97)
            {
                v107 = v97 * 4;
                while (1)
                {
                    v108 = v107;
                    if (!v108)
                        break;
                    v107 = v108 - 4;
                    v109 = *(int *)((char *)&v27 + v108 + 4);
                    v110 = *(int *)&(&v65)[v108];
                    if (*(int *)((char *)&v27 + v108 + 4) != *(int *)&(&v65)[v108])
                    {
                        v111 = arm64g_calculate_condition(147, v109, v110, 0);
                        v112 = arm64g_calculate_condition(35, v109, v110, 0);
                        v95 = (v112 & 1 ? (unsigned int)!(v111 & 1) : 0xffffffff);
                        if ((char)v95 < v83)
                            goto LABEL_bec9d0;
                        goto LABEL_bec8cc;
                    }
                }
                v95 = 0;
                if (v83 <= 0)
                {
LABEL_bec8cc:
                    v1 = iter;
                    iter = v3;
                    if (41 <= iter)
                        goto LABEL_bed048;
                    if (iter)
                    {
                        v95 = 0;
                        j = iter * 4;
                        v114 = &v2;
                        do
                        {
                            v115 = j;
                            v116 = v95 + *v114 * 10;
                            *v114 = v116;
                            v114 += 1;
                            v95 = v116 >> 32;
                            j = v115 - 4;
                        } while (j);
                        if (!v95)
                            goto LABEL_bec920;
                        if (iter != 40)
                        {
                            *(unsigned int *)((char *)&v2 + 4 * iter) = v95;
                            iter += 1;
                            goto LABEL_bec920;
                        }
                        goto LABEL_bed138;
                    }
LABEL_bec920:
                    v3 = iter;
                    idx = v15;
                    if (41 > idx)
                    {
                        if (idx)
                        {
                            v119 = 0;
                            k = idx * 4;
                            v121 = &v4;
                            do
                            {
                                v122 = k;
                                v123 = v119 + *(int *)v121 * 10;
                                *(unsigned int *)v121 = v123;
                                v121 += 4;
                                v119 = v123 >> 32;
                                k = v122 - 4;
                            } while (k);
                            if (v119)
                            {
                                if (idx == 40)
                                    goto LABEL_bed160;
                                *(unsigned int *)((char *)&v4 + 4 * idx) = v119;
                                idx += 1;
                            }
                        }
                        v15 = idx;
                        if (v96)
                        {
                            v125 = 0;
                            l = v96 * 4;
                            v127 = &v16;
                            do
                            {
                                v128 = l;
                                v129 = v125 + *(int *)v127 * 10;
                                *(unsigned int *)v127 = v129;
                                v127 += 4;
                                v125 = v129 >> 32;
                                l = v128 - 4;
                            } while (l);
                            if (!v125)
                                goto LABEL_bec9bc;
                            if (v96 != 40)
                            {
                                *(unsigned int *)((char *)&v16 + 4 * v96) = v125;
                                v96 += 1;
                                goto LABEL_bec9bc;
                            }
                        }
                        else
                        {
LABEL_bec9bc:
                            v27 = v96;
                            goto LABEL_bec9dc;
                        }
                        goto LABEL_bed138;
                    }
                }
                else
                {
LABEL_bec9d0:
                    v1 = (unsigned int)iter + 1;
                    iter = v3;
LABEL_bec9dc:
                    v38 = *(uint128_t *)((void*)&v28 + 128);
                    v39 = *(uint128_t *)((void*)&v28 + 144);
                    v40 = v29;
                    v34 = *(uint128_t *)((void*)&v28 + 64);
                    v35 = *(uint128_t *)((void*)&v28 + 80);
                    v36 = *(uint128_t *)((void*)&v28 + 96);
                    v37 = *(uint128_t *)((void*)&v28 + 112);
                    v30 = *(uint128_t *)&v28;
                    v31 = *(uint128_t *)((void*)&v28 + 16);
                    v32 = *(uint128_t *)((void*)&v28 + 32);
                    v33 = *(uint128_t *)((void*)&v28 + 48);
                    sub_be94fc(&v30, 1);
                    v50 = *(uint128_t *)((void*)&v28 + 128);
                    v51 = *(uint128_t *)((void*)&v28 + 144);
                    v52 = v29;
                    v46 = *(uint128_t *)((void*)&v28 + 64);
                    v47 = *(uint128_t *)((void*)&v28 + 80);
                    v48 = *(uint128_t *)((void*)&v28 + 96);
                    v49 = *(uint128_t *)((void*)&v28 + 112);
                    v42 = *(uint128_t *)&v28;
                    v43 = *(uint128_t *)((void*)&v28 + 16);
                    v44 = *(uint128_t *)((void*)&v28 + 32);
                    v45 = *(uint128_t *)((void*)&v28 + 48);
                    sub_be94fc(&v42, 2);
                    v62 = *(uint128_t *)((void*)&v28 + 128);
                    v63 = *(uint128_t *)((void*)&v28 + 144);
                    v95 = v29;
                    v64 = v95;
                    v58 = *(uint128_t *)((void*)&v28 + 64);
                    v59 = *(uint128_t *)((void*)&v28 + 80);
                    v61 = *(uint128_t *)((void*)&v28 + 112);
                    v60 = *(uint128_t *)((void*)&v28 + 96);
                    v54 = *(uint128_t *)&v28;
                    v55 = *(uint128_t *)((void*)&v28 + 16);
                    v57 = *(uint128_t *)((void*)&v28 + 48);
                    v56 = *(uint128_t *)((void*)&v28 + 32);
                    sub_be94fc(&v54, 3);
                    v131 = v64;
                    if (iter < v131)
                        v132 = v131;
                    else
                        v132 = iter;
                    if (40 >= v132)
                    {
                        v87 = 0;
                        dst = &v65;
                        while (1)
                        {
                            v135 = v87;
                            v136 = v132 * 4;
                            do
                            {
                                v137 = v136;
                                if (!v137)
                                    goto LABEL_becb48;
                            } while ((v136 = v137 - 4, *(int *)((char *)&v1 + v137 + 4) == *(int *)&(&v53)[v137]));
                            v138 = arm64g_calculate_condition(35, *(int *)((char *)&v1 + v137 + 4), *(int *)&(&v53)[v137], 0);
                            if (!(v138 & 1))
                            {
                                v139 = 0;
                                v132 = iter;
                            }
                            else
                            {
LABEL_becb48:
                                if (v132)
                                {
                                    v140 = 1;
                                    v141 = &v54;
                                    v142 = &v2;
                                    v143 = v132;
                                    do
                                    {
                                        m = v143;
                                        v146 = ~*v141;
                                        v147 = arm64g_calculate_flag_c(3, (unsigned int)v140 & 1, 1, 0);
                                        v87 = *v142 + v146 + (unsigned int)v147;
                                        v148 = arm64g_calculate_condition(53, *v142, v146, v147 & 0xffffffff);
                                        v140 = !(v148 & 1);
                                        *v142 = v87;
                                        v142 += 1;
                                        iter = m - 1;
                                        v143 = iter;
                                        v141 += 1;
                                    } while (m != 1);
                                    if (!(v140 & 1))
                                        goto LABEL_bed090;
                                }
                                v3 = v132;
                                v139 = 8;
                            }
                            if (v132 < v52)
                                v95 = v52;
                            else
                                v95 = v132;
                            if (41 <= v95)
                                goto LABEL_bed060;
                            v149 = v95 * 4;
                            do
                            {
                                if (!v149)
                                    goto LABEL_becbcc;
                            } while ((iter = *(int *)((char *)&v1 + v149 + 4), v87 = *(int *)&(&v41)[v149], v149 -= 4, (unsigned int)iter == (unsigned int)v87));
                            v150 = arm64g_calculate_condition(35, iter & 0xffffffff, v87 & 0xffffffff, 0);
                            if (!(v150 & 1))
                            {
                                v95 = v132;
                            }
                            else
                            {
LABEL_becbcc:
                                if (v95)
                                {
                                    v151 = 1;
                                    v152 = &v42;
                                    iter = &v2;
                                    v153 = v95;
                                    do
                                    {
                                        n = v153;
                                        v134 = ~*v152;
                                        v156 = arm64g_calculate_flag_c(3, (unsigned int)v151 & 1, 1, 0);
                                        v157 = arm64g_calculate_condition(53, *(int *)iter, v134 & 0xffffffff, v156 & 0xffffffff);
                                        v151 = !(v157 & 1);
                                        *(unsigned int *)iter = *(int *)iter + (unsigned int)v134 + (unsigned int)v156;
                                        iter += 4;
                                        v87 = n - 1;
                                        v153 = v87;
                                        v152 += 1;
                                    } while (n != 1);
                                    if (!(v151 & 1))
                                        goto LABEL_bed090;
                                }
                                v3 = v95;
                                v139 |= 4;
                            }
                            if (v95 < v40)
                                v158 = v40;
                            else
                                v158 = v95;
                            if (41 <= v158)
                                break;
                            v159 = v158 * 4;
                            do
                            {
                                v160 = v159;
                                if (!v160)
                                    goto LABEL_becc50;
                            } while ((v87 = *(int *)((char *)&v29 + v160 + 4), v159 = v160 - 4, *(int *)((char *)&v1 + v160 + 4) == (unsigned int)v87));
                            v161 = arm64g_calculate_condition(35, *(int *)((char *)&v1 + v160 + 4), v87 & 0xffffffff, 0);
                            if (!(v161 & 1))
                            {
                                v158 = v95;
                            }
                            else
                            {
LABEL_becc50:
                                if (v158)
                                {
                                    v162 = 1;
                                    v163 = &v30;
                                    v164 = &v2;
                                    v165 = v158;
                                    do
                                    {
                                        i0 = v165;
                                        v95 = v163 + 1;
                                        v134 = ~*v163;
                                        v167 = arm64g_calculate_flag_c(3, (unsigned int)v162 & 1, 1, 0);
                                        v168 = arm64g_calculate_condition(53, *v164, v134 & 0xffffffff, v167 & 0xffffffff);
                                        v162 = !(v168 & 1);
                                        *v164 = *v164 + (unsigned int)v134 + (unsigned int)v167;
                                        v164 += 1;
                                        v87 = i0 - 1;
                                        v165 = v87;
                                        v163 = v95;
                                    } while (i0 != 1);
                                    if (!(v162 & 1))
                                        goto LABEL_bed090;
                                }
                                v3 = v158;
                                v139 += 2;
                            }
                            if (v158 < v106)
                                iter = v106;
                            else
                                iter = v158;
                            if (41 <= iter)
                                goto LABEL_bed048;
                            v169 = iter * 4;
                            do
                            {
                                v170 = v169;
                                if (!v170)
                                    goto LABEL_beccd8;
                            } while ((v87 = *(int *)((char *)&v27 + v170 + 4), v169 = v170 - 4, *(int *)((char *)&v1 + v170 + 4) == (unsigned int)v87));
                            v171 = arm64g_calculate_condition(35, *(int *)((char *)&v1 + v170 + 4), v87 & 0xffffffff, 0);
                            if (!(v171 & 1))
                            {
                                iter = v158;
                            }
                            else
                            {
LABEL_beccd8:
                                if (iter)
                                {
                                    v172 = 1;
                                    v173 = &v28;
                                    v174 = &v2;
                                    v175 = iter;
                                    do
                                    {
                                        i1 = v175;
                                        v134 = ~*v173;
                                        v178 = arm64g_calculate_flag_c(3, (unsigned int)v172 & 1, 1, 0);
                                        v179 = arm64g_calculate_condition(53, *v174, v134 & 0xffffffff, v178 & 0xffffffff);
                                        v172 = !(v179 & 1);
                                        *v174 = *v174 + (unsigned int)v134 + (unsigned int)v178;
                                        v174 += 1;
                                        v87 = i1 - 1;
                                        v175 = v87;
                                        v173 += 1;
                                    } while (i1 != 1);
                                    if (!(v172 & 1))
                                        goto LABEL_bed090;
                                }
                                v3 = iter;
                                v139 += 1;
                            }
                            if (v135 == 0x11)
                                goto LABEL_bed14c;
                            a2[v135] = (char)v139 + 48;
                            v95 = v15;
                            if (iter < v95)
                                v180 = v95;
                            else
                                v180 = iter;
                            if (41 <= v180)
                                break;
                            v87 = v135 + 1;
                            v181 = v180 * 4;
                            do
                            {
                                v182 = v181;
                                if (!v182)
                                {
                                    v187 = 0;
                                    goto LABEL_becd78;
                                }
                            } while ((v181 = v182 - 4, v183 = *(int *)((char *)&v1 + v182 + 4), v184 = *(int *)((char *)&v3 + v182 + 4), *(int *)((char *)&v1 + v182 + 4) == *(int *)((char *)&v3 + v182 + 4)));
                            v185 = arm64g_calculate_condition(147, v183, v184, 0);
                            v186 = arm64g_calculate_condition(35, v183, v184, 0);
                            if (v186 & 1)
                                v187 = (char)!(v185 & 1);
                            else
                                v187 = 0xff;
LABEL_becd78:
                            v74 = *(uint128_t *)((void*)&v2 + 128);
                            v75 = *(uint128_t *)((void*)&v2 + 144);
                            v76 = v3;
                            v70 = *(uint128_t *)((void*)&v2 + 64);
                            v71 = *(uint128_t *)((void*)&v2 + 80);
                            v73 = *(uint128_t *)((void*)&v2 + 112);
                            v72 = *(uint128_t *)((void*)&v2 + 96);
                            v66 = *(uint128_t *)&v2;
                            v67 = *(uint128_t *)((void*)&v2 + 16);
                            v69 = *(uint128_t *)((void*)&v2 + 48);
                            v68 = *(uint128_t *)((void*)&v2 + 32);
                            if (v76 < v96)
                                v134 = v96;
                            else
                                v134 = v76;
                            if (40 < v134)
                                goto LABEL_bed078;
                            if (v134)
                            {
                                v188 = 0;
                                v189 = &v16;
                                x30 = (int)&v66;
                                i2 = v134;
                                do
                                {
                                    v191 = i2;
                                    v193 = arm64g_calculate_flag_c(3, v188 & 1, 1, 0);
                                    v194 = arm64g_calculate_condition(53, *(int *)v189, *(int *)x30, v193 & 0xffffffff);
                                    v188 = (unsigned int)!(v194 & 1);
                                    *(unsigned int *)x30 = *(int *)v189 + *(int *)x30 + (unsigned int)v193;
                                    x30 = x30 + 4;
                                    v189 += 4;
                                    i2 = v191 - 1;
                                } while (i2);
                                if (!v188)
                                    goto LABEL_bece20;
                                if (v134 == 40)
                                    goto LABEL_bed138;
                                *(unsigned int *)((char *)&v66 + 4 * v134) = 1;
                                v134 += 1;
                            }
LABEL_bece20:
                            v76 = v134;
                            if (v106 < v134)
                                v196 = v134;
                            else
                                v196 = v106;
                            if (41 <= v196)
                                break;
                            v197 = v196 * 4;
                            while (1)
                            {
                                v198 = v197;
                                if (!v198)
                                    break;
                                v197 = v198 - 4;
                                v199 = *(int *)((char *)&v27 + v198 + 4);
                                v200 = *(int *)&(&v65)[v198];
                                if (*(int *)((char *)&v27 + v198 + 4) != *(int *)&(&v65)[v198])
                                {
                                    v201 = arm64g_calculate_condition(147, v199, v200, 0);
                                    v202 = arm64g_calculate_condition(35, v199, v200, 0);
                                    v198 = (v202 & 1 ? (unsigned int)!(v201 & 1) : 0xffffffff);
                                    break;
                                }
                            }
                            if ((int)v187 < v83)
                            {
                                if (v83 <= (char)v198)
                                    goto LABEL_becfc8;
                                dst = sub_be94fc(&v2, 1);
                                v95 = v3;
                                if (v95 < v106)
                                    v220 = v106;
                                else
                                    v220 = v95;
                                if (41 <= v220)
                                    break;
                                v221 = v220 * 4;
                                while (1)
                                {
                                    v222 = v221;
                                    if (!v222)
                                        goto LABEL_becf84;
                                    v221 = v222 - 4;
                                    if (*(int *)((char *)&v1 + v222 + 4) != *(int *)((char *)&v27 + v222 + 4))
                                    {
                                        v223 = arm64g_calculate_condition(0x33, *(int *)((char *)&v1 + v222 + 4), *(int *)((char *)&v27 + v222 + 4), 0);
                                        if (v223 & 1)
                                            goto LABEL_becfc8;
                                        goto LABEL_becf84;
                                    }
                                }
                            }
                            if ((char)v198 < v83)
                            {
LABEL_becf84:
                                v224 = v135;
                                do
                                {
                                    v225 = v224;
                                    v226 = arm64g_calculate_condition(2, v225, 1, 0);
                                    if (v226 & 1)
                                    {
                                        *a2 = 49;
                                        dst = _memset(a2 + 1, 48, v135);
                                        if (15 >= v135)
                                        {
                                            a2[v87] = 48;
                                            v228 = v0;
                                            v228->field_0 = a2;
                                            v228->field_8 = v135 + 2;
                                            v228->field_10 = (unsigned short)v1 + 1;
                                            return dst;
                                        }
                                        sub_c73c94(v87, 0x11, &g_efab60);
                                    }
                                } while ((v227 = v225, v224 = v225 - 1, a2[v225] == 57));
                                a2[v227] = a2[v227] + 1;
                                dst = _memset(&a2[1 + v227], 48, v87 - (v227 + 1));
LABEL_becfc8:
                                if (16 >= v135)
                                {
                                    v228 = v0;
                                    v228->field_0 = a2;
                                    v228->field_8 = v87;
                                    v228->field_10 = v1;
                                    return dst;
                                }
                                goto LABEL_bed0a8;
                            }
                            if (iter)
                            {
                                v203 = 0;
                                i3 = iter * 4;
                                node = &v2;
                                do
                                {
                                    v206 = i3;
                                    v207 = v203 + *node * 10;
                                    *node = v207;
                                    node += 1;
                                    v203 = v207 >> 32;
                                    i3 = v206 - 4;
                                } while (i3);
                                if (!v203)
                                    goto LABEL_becea4;
                                if (iter == 40)
                                    goto LABEL_bed138;
                                *(unsigned int *)((char *)&v2 + 4 * iter) = v203;
                                iter += 1;
                            }
LABEL_becea4:
                            v3 = iter;
                            if (v95)
                            {
                                v209 = 0;
                                i4 = v95 * 4;
                                iter1 = &v4;
                                do
                                {
                                    v212 = i4;
                                    v213 = v209 + *(int *)iter1 * 10;
                                    *(unsigned int *)iter1 = v213;
                                    iter1 += 4;
                                    v209 = v213 >> 32;
                                    i4 = v212 - 4;
                                } while (i4);
                                if (!v209)
                                    goto LABEL_becee4;
                                if (v95 == 40)
                                    goto LABEL_bed138;
                                *(unsigned int *)((char *)&v4 + 4 * v95) = v209;
                                v95 += 1;
                            }
LABEL_becee4:
                            v15 = v95;
                            if (!v96)
                            {
LABEL_becb00:
                                v27 = v96;
                                if (iter < v131)
                                    v132 = v131;
                                else
                                    v132 = iter;
                                if (41 <= v132)
                                    break;
                            }
                            else
                            {
                                v95 = 0;
                                i5 = v96 * 4;
                                iter2 = &v16;
                                do
                                {
                                    v217 = i5;
                                    v218 = v95 + *(int *)iter2 * 10;
                                    *(unsigned int *)iter2 = v218;
                                    iter2 += 4;
                                    v95 = v218 >> 32;
                                    i5 = v217 - 4;
                                } while (i5);
                                if (!v95)
                                    goto LABEL_becb00;
                                if (v96 != 40)
                                {
                                    *(unsigned int *)((char *)&v16 + 4 * v96) = v95;
                                    v96 += 1;
                                    goto LABEL_becb00;
                                }
                                goto LABEL_bed138;
                            }
                        }
                    }
                }
            }
        }
        sub_c73bb0(0);
LABEL_bed048:
        sub_c73bb0(0, iter, 40, &g_efa740);
LABEL_bed060:
        sub_c73bb0(0, v95, 40, &g_efa740);
LABEL_bed078:
        sub_c73bb0(0, v134, 40, &g_efa740);
LABEL_bed090:
        sub_c73c80(&g_e07fdf, 26, &g_efa740);
LABEL_bed0a8:
        sub_c73bb0(0, v87, 0x11, &g_efab78);
        goto LABEL_bed0c0;
    }
    else
    {
LABEL_bed0c0:
        sub_c73c80("assertion failed: d.mant > 0", 28, &g_efab00);
LABEL_bed0d8:
        sub_c73c80("assertion failed: d.minus > 0", 29, &g_efab18);
LABEL_bed0f0:
        sub_c73c80("assertion failed: d.plus > 0assertion failed: d.mant + d.plus < (1 << 61)", 28, &g_efab30);
LABEL_bed108:
        sub_c73c80("assertion failed: d.mant.checked_add(d.plus).is_some()", 54, &g_efaba8);
LABEL_bed120:
        sub_c73c80("assertion failed: d.mant.checked_sub(d.minus).is_some()", 55, &g_efab90);
LABEL_bed138:
        sub_c73c94(40, 40, &g_efa740);
LABEL_bed14c:
        sub_c73c94(0x11, 0x11, &g_efab48);
    }
LABEL_bed160:
    sub_c73c94(40);
    sub_c73c94(v87, 0x11, &g_efab60);
}
