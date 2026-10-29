/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbeb2b8..0xbebce0 (2600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_beb2b8_1 {
    char *field_0;
    unsigned long long field_8;
    unsigned short field_10;
} st_beb2b8_1;

typedef struct st_beb2b8_0 {
    unsigned long long field_0;
    char padding_8[16];
    short field_18;
} st_beb2b8_0;

extern long long g_e07fdf;
extern unsigned int g_e08ea0[4];
extern long long g_efa740;
extern long long g_efaa10;
extern long long g_efaa28;
extern long long g_efaa40;
extern long long g_efaa58;
extern long long g_efaa70;
extern long long g_efaa88;
extern long long g_efaaa0;
extern long long g_efaab8;
extern long long g_efaad0;
extern long long g_efaae8;

unsigned long long sub_beb2b8(st_beb2b8_1 *a0, st_beb2b8_0 *a1, void* a2, unsigned long long a3, unsigned int a4)
{
    unsigned long v54;  // x8
    unsigned long long v55;  // 4107
    unsigned long long v64;  // x1
    unsigned long long v154;  // 4192
    unsigned long long v155;  // 4200
    unsigned long long v157;  // x0
    void* iter;  // x1
    unsigned long long i4;  // x0
    unsigned long long v160;  // x8
    unsigned long long v161;  // x9
    unsigned long long m;  // x10
    unsigned int *iter1;  // x11
    unsigned long long *v65;  // x0
    unsigned long long v164;  // x10
    unsigned long long v165;  // x9
    unsigned long long v167;  // x1
    unsigned long long v168;  // x10
    unsigned long long v169;  // x10
    unsigned long v170;  // cc_dep1
    unsigned long v171;  // cc_dep2
    unsigned long long v172;  // 4105
    unsigned long long v173;  // 4117
    unsigned long long dst;  // x0
    unsigned long long v174;  // x9
    unsigned long long v175;  // x10
    unsigned long long v176;  // x10
    long long v177;  // x22
    unsigned long long i;  // x10
    unsigned long long v68;  // x1
    unsigned long long v69;  // x13
    unsigned long long n;  // x12
    unsigned long long v71;  // x12
    unsigned long long v72;  // x13
    unsigned long long v73;  // x14
    unsigned int v56;  // w27
    unsigned long long v75;  // x1
    unsigned long long v76;  // x10
    unsigned long long j;  // x9
    unsigned long long v78;  // x9
    unsigned long long v79;  // x10
    unsigned long long v80;  // x12
    unsigned long long iter2;  // x24
    unsigned long long index;  // x1
    unsigned long long v57;  // x20
    void* v84;  // x9
    unsigned int *v85;  // x10
    unsigned long long k;  // x11
    unsigned long long v87;  // x11
    unsigned long long v89;  // 4180
    unsigned long long v90;  // 4188
    unsigned long long idx;  // x26
    unsigned long long v93;  // x8
    unsigned long v58;  // x1
    unsigned long long v94;  // x8
    unsigned long long v95;  // 4102
    unsigned long long v96;  // x8
    unsigned long long l;  // x9
    void* node;  // x10
    unsigned long long v99;  // x9
    unsigned long long v100;  // x8
    unsigned int v102;  // w14
    unsigned long long v103;  // x23
    unsigned long long v59;  // x9
    unsigned long long v104;  // x13
    unsigned long v105;  // x8
    unsigned long long v106;  // x1
    unsigned long v107;  // x8
    unsigned long long v108;  // 4102
    unsigned long long v109;  // w4
    unsigned long long v110;  // x4
    unsigned int *v111;  // x8
    void* v112;  // x5
    unsigned long long i0;  // x6
    unsigned int v60;  // w9
    unsigned long long v114;  // x6
    unsigned int v115;  // w22
    unsigned long long v116;  // 4192
    unsigned long long v117;  // 4200
    unsigned long long v119;  // x1
    unsigned long long v120;  // x8
    unsigned long long v121;  // x8
    unsigned long long v122;  // 4102
    unsigned long long v123;  // x5
    unsigned long long v61;  // x22
    unsigned int *v124;  // x8
    void* v125;  // x6
    unsigned long long i1;  // x7
    unsigned long long v127;  // x7
    unsigned int v128;  // w24
    unsigned long long v129;  // 4192
    unsigned long long v130;  // 4200
    unsigned long long v132;  // x5
    unsigned long long v133;  // x5
    unsigned long long v62;  // x9
    unsigned long long v134;  // 4102
    unsigned long long v135;  // x5
    unsigned int *v136;  // x1
    void* v137;  // x6
    unsigned long i2;  // x7
    unsigned long v139;  // x7
    unsigned int v141;  // w24
    unsigned long long v142;  // 4192
    unsigned long long v143;  // 4200
    unsigned int v63;  // w25
    unsigned long long v145;  // x1
    unsigned long long v146;  // x1
    unsigned long long v147;  // 4102
    unsigned long long v148;  // x1
    unsigned int *v149;  // x8
    void* v150;  // x5
    unsigned long long i3;  // x6
    unsigned long long v152;  // x6
    unsigned int v153;  // w22
    unsigned int v0;  // [bp-0x3d8]
    unsigned int v1;  // [bp-0x3d4]
    unsigned long v2;  // [bp-0x3d0]
    unsigned long long v3;  // [bp-0x3c8]
    unsigned long long v4;  // [bp-0x3b8]
    unsigned long long v5;  // [bp-0x3a8]
    unsigned long long v6;  // [bp-0x398]
    unsigned long long v7;  // [bp-0x388]
    unsigned long long v8;  // [bp-0x378]
    unsigned long long v9;  // [bp-0x368]
    unsigned long long v10;  // [bp-0x358]
    unsigned long long v11;  // [bp-0x348]
    unsigned long long v12;  // [bp-0x338]
    unsigned long long v13;  // [bp-0x330]
    uint1280_t v14;  // [bp-0x328], Other Possible Types: char
    unsigned int v15;  // [bp-0x324]
    unsigned long long v16;  // [bp-0x288]
    uint128_t v17;  // [bp-0x280]
    uint128_t v18;  // [bp-0x270]
    uint128_t v19;  // [bp-0x260]
    uint128_t v20;  // [bp-0x250]
    uint128_t v21;  // [bp-0x240]
    uint128_t v22;  // [bp-0x230]
    uint128_t v23;  // [bp-0x220]
    uint128_t v24;  // [bp-0x210]
    uint128_t v25;  // [bp-0x200]
    uint128_t v26;  // [bp-0x1f0]
    unsigned long long v27;  // [bp-0x1e0]
    char v28;  // [bp-0x1d4]
    uint128_t v29;  // [bp-0x1d0]
    uint128_t v30;  // [bp-0x1c0]
    uint128_t v31;  // [bp-0x1b0]
    uint128_t v32;  // [bp-0x1a0]
    uint128_t v33;  // [bp-0x190]
    uint128_t v34;  // [bp-0x180]
    uint128_t v35;  // [bp-0x170]
    uint128_t v36;  // [bp-0x160]
    uint128_t v37;  // [bp-0x150]
    uint128_t v38;  // [bp-0x140]
    unsigned long long v39;  // [bp-0x130]
    unsigned int v40;  // [bp-0x124]
    uint128_t v41;  // [bp-0x120]
    uint128_t v42;  // [bp-0x110]
    uint128_t v43;  // [bp-0x100]
    uint128_t v44;  // [bp-0xf0]
    uint128_t v45;  // [bp-0xe0]
    uint128_t v46;  // [bp-0xd0]
    uint128_t v47;  // [bp-0xc0]
    uint128_t v48;  // [bp-0xb0]
    uint128_t v49;  // [bp-0xa0]
    uint128_t v50;  // [bp-0x90]
    unsigned long long v51;  // [bp-0x80]
    char *v52;  // [bp-0x10]
    char v53;  // [bp+0x0]

    v52 = &v53;
    v54 = a1->field_0;
    if (v54)
    {
        if (!*(long long *)&a1->padding_8[0])
            goto LABEL_bebbc4;
        if (!*(long long *)&a1->padding_8[8])
            goto LABEL_bebbdc;
        v55 = arm64g_calculate_condition(0x22, v54, *(long long *)&a1->padding_8[8], 0);
        if (v55 & 1)
            goto LABEL_bebbf4;
        if (v54 < (unsigned long long)*(long long *)&a1->padding_8[0])
            goto LABEL_bebc0c;
        v56 = a4;
        v57 = a3;
        v58 = a1->field_18;
        v59 = v54 - 1;
        if (!v59)
            v60 = 64;
        else
            v60 = Clz(v59);
        v2 = v54;
        v3 = 0;
        v4 = 0;
        v61 = 82746495104 + (unsigned int)(v58 - v60) * 1292913986;
        v5 = 0;
        v6 = 0;
        if (v54 <= 0xffffffff)
            v62 = 1;
        else
            v62 = 2;
        v7 = 0;
        v8 = 0;
        v9 = 0;
        v10 = 0;
        v11 = 0;
        v12 = 0;
        v13 = v62;
        v14 = _INSERT(CONCAT(v14, 0), 144, 0);
        *(uint128_t *)((char *)&v14 + 132) = 0;
        *(uint128_t *)((char *)&v14 + 116) = 0;
        *(uint128_t *)((char *)&v14 + 100) = 0;
        *(uint128_t *)((char *)&v14 + 84) = 0;
        *(uint128_t *)((char *)&v14 + 0x44) = 0;
        *(uint128_t *)((char *)&v14 + 52) = 0;
        *(uint128_t *)((char *)&v14 + 36) = 0;
        *(uint128_t *)((char *)&v14 + 20) = 0;
        *(uint128_t *)((char *)&v14 + 4) = 0;
        v16 = 1;
        *(unsigned int *)&v14 = 1;
        if ((long long)v58 >= 0)
        {
            sub_be94fc(&v2);
            v63 = v61 >> 32;
            if (v61 >> 47 & 1)
                goto LABEL_beb3e4;
LABEL_beb3c0:
            v64 = (v61 * 0x100000000 | v61 >> 32) & 0xffffffff00007fff & 0x7fff;
            v65 = &v14;
        }
        else
        {
            sub_be94fc(&v14, (short)-(unsigned int)v58);
            v63 = v61 >> 32;
            if (!(v61 >> 47 & 1))
                goto LABEL_beb3c0;
LABEL_beb3e4:
            v65 = &v2;
            v64 = -v63 & 0xffff;
        }
        dst = sub_bebce0(v65, v64);
        v49 = *(uint128_t *)((void*)&v14 + 128);
        v50 = *(uint128_t *)((void*)&v14 + 144);
        v51 = v16;
        v45 = *(uint128_t *)((void*)&v14 + 64);
        v46 = *(uint128_t *)((void*)&v14 + 80);
        v47 = *(uint128_t *)((void*)&v14 + 96);
        v48 = *(uint128_t *)((void*)&v14 + 112);
        v41 = *(uint128_t *)&v14;
        v42 = *(uint128_t *)((void*)&v14 + 16);
        v54 = &v40;
        i = v57;
        v43 = *(uint128_t *)((void*)&v14 + 32);
        v44 = *(uint128_t *)((void*)&v14 + 48);
        do
        {
            v68 = v51;
            if (41 <= v68)
                goto LABEL_bebb68;
            if (v68)
            {
                v69 = 0;
                n = v68 * 4;
                do
                {
                    v71 = n;
                    v72 = *(int *)((char *)&v40 + v71) | v69 * 0x100000000;
                    v73 = (v72 >> 9) / 1953125;
                    v69 = v72 - 1000000000 * v73;
                    *(unsigned int *)((char *)&v40 + v71) = v73;
                    n = v71 - 4;
                } while (n);
            }
            i -= 9;
        } while (i > 9);
        v54 = g_e08ea0[i] * 2;
        if (!(unsigned int)v54)
            goto LABEL_bebc24;
        v75 = v51;
        if (41 > v75)
        {
            if (v75)
            {
                v76 = 0;
                j = v75 * 4;
                do
                {
                    v78 = j;
                    v79 = *(int *)((char *)&v40 + v78) | v76 * 0x100000000;
                    v80 = v79 / v54;
                    v76 = v79 - v54 * v80;
                    *(unsigned int *)((char *)&v40 + v78) = v80;
                    j = v78 - 4;
                } while (j);
                v54 = v51;
                iter2 = v13;
                if (v54 < iter2)
                    index = iter2;
                else
                    index = v54;
                if (index <= 40)
                    goto LABEL_beb51c;
            }
            else
            {
                v54 = 0;
                iter2 = v13;
                if (0 < iter2)
                    index = iter2;
                else
                    index = 0;
                if (40 >= index)
                {
LABEL_beb51c:
                    if (index)
                    {
                        v54 = 0;
                        v84 = &v2;
                        v85 = &v41;
                        k = index;
                        do
                        {
                            v87 = k;
                            v89 = arm64g_calculate_flag_c(3, (unsigned int)v54 & 1, 1, 0);
                            v90 = arm64g_calculate_condition(53, *(int *)v84, *v85, v89 & 0xffffffff);
                            v54 = !(v90 & 1);
                            *v85 = *(int *)v84 + *v85 + (unsigned int)v89;
                            v85 += 1;
                            v84 += 4;
                            k = v87 - 1;
                        } while (k);
                        if ((unsigned int)v54)
                        {
                            if (index == 40)
                                goto LABEL_bebcac;
                            v54 = &v41;
                            *(unsigned int *)((char *)&v41 + 4 * index) = 1;
                            index += 1;
                        }
                    }
                    v51 = index;
                    idx = v16;
                    if (index < idx)
                        index = idx;
                    if (41 > index)
                    {
                        v93 = index * 4;
                        do
                        {
                            v94 = v93;
                            if (!v94)
                                goto LABEL_beb9b8;
                        } while ((v93 = v94 - 4, *(int *)((char *)&v40 + v94) == *(int *)((char *)&v13 + v94 + 4)));
                        v95 = arm64g_calculate_condition(35, *(int *)((char *)&v40 + v94), *(int *)((char *)&v13 + v94 + 4), 0);
                        if (!(v95 & 1))
                        {
                            if (iter2)
                            {
                                v96 = 0;
                                l = iter2 * 4;
                                node = &v2;
                                do
                                {
                                    v99 = l;
                                    v100 = v96 + *(int *)node * 10;
                                    *(unsigned int *)node = v100;
                                    node += 4;
                                    v96 = v100 >> 32;
                                    l = v99 - 4;
                                } while (l);
                                if (v96)
                                {
                                    if (iter2 == 40)
                                        goto LABEL_bebc98;
                                    *(unsigned int *)((char *)&v2 + 4 * iter2) = v96;
                                    iter2 += 1;
                                }
                            }
                            v13 = iter2;
                            v102 = (short)v63;
                            if ((int)v102 < (short)v56)
                                goto LABEL_beb9c8;
                            goto LABEL_beb60c;
                        }
LABEL_beb9b8:
                        v63 += 1;
                        v102 = (short)v63;
                        if ((short)v56 <= (int)v102)
                        {
LABEL_beb60c:
                            if ((unsigned long long)((short)v63 - (short)v56) < v57)
                                v103 = (short)(v63 - v56);
                            else
                                v103 = v57;
                            if (!v103)
                                goto LABEL_beb9cc;
                            v0 = v102;
                            v1 = v56;
                            v25 = *(uint128_t *)((void*)&v14 + 128);
                            v26 = *(uint128_t *)((void*)&v14 + 144);
                            v27 = v16;
                            v21 = *(uint128_t *)((void*)&v14 + 64);
                            v22 = *(uint128_t *)((void*)&v14 + 80);
                            v23 = *(uint128_t *)((void*)&v14 + 96);
                            v24 = *(uint128_t *)((void*)&v14 + 112);
                            v17 = *(uint128_t *)&v14;
                            v18 = *(uint128_t *)((void*)&v14 + 16);
                            v19 = *(uint128_t *)((void*)&v14 + 32);
                            v20 = *(uint128_t *)((void*)&v14 + 48);
                            sub_be94fc(&v17, 1);
                            v37 = *(uint128_t *)((void*)&v14 + 128);
                            v38 = *(uint128_t *)((void*)&v14 + 144);
                            v39 = v16;
                            v33 = *(uint128_t *)((void*)&v14 + 64);
                            v34 = *(uint128_t *)((void*)&v14 + 80);
                            v35 = *(uint128_t *)((void*)&v14 + 96);
                            v36 = *(uint128_t *)((void*)&v14 + 112);
                            v29 = *(uint128_t *)&v14;
                            v30 = *(uint128_t *)((void*)&v14 + 16);
                            v31 = *(uint128_t *)((void*)&v14 + 32);
                            v32 = *(uint128_t *)((void*)&v14 + 48);
                            sub_be94fc(&v29, 2);
                            v49 = *(uint128_t *)((void*)&v14 + 128);
                            v50 = *(uint128_t *)((void*)&v14 + 144);
                            v51 = v16;
                            v45 = *(uint128_t *)((void*)&v14 + 64);
                            v46 = *(uint128_t *)((void*)&v14 + 80);
                            v47 = *(uint128_t *)((void*)&v14 + 96);
                            v48 = *(uint128_t *)((void*)&v14 + 112);
                            v41 = *(uint128_t *)&v14;
                            v42 = *(uint128_t *)((void*)&v14 + 16);
                            v43 = *(uint128_t *)((void*)&v14 + 32);
                            v44 = *(uint128_t *)((void*)&v14 + 48);
                            sub_be94fc(&v41, 3);
                            v104 = 0;
                            v54 = &v14;
                            while (1)
                            {
                                if (41 <= iter2)
                                    goto LABEL_bebb7c;
                                dst = v104;
                                v54 = 0;
                                v104 += 1;
                                do
                                {
                                    v105 = v54;
                                    if (iter2 * 4 == v105)
                                    {
                                        if (v57 >= v103)
                                        {
                                            if (v103 != dst)
                                            {
                                                dst = _memset(a2 + dst, 48);
                                                a0->field_0 = a2;
                                                a0->field_8 = v103;
                                                a0->field_10 = v63;
                                                return dst;
                                            }
                                            a0->field_0 = a2;
                                            a0->field_8 = v103;
                                            a0->field_10 = v63;
                                            return dst;
                                        }
                                        goto LABEL_bebc54;
                                    }
                                } while ((v54 = v105 + 4, !*(int *)((char *)&v2 + v105)));
                                if (iter2 < v51)
                                    v106 = v51;
                                else
                                    v106 = iter2;
                                if (41 <= v106)
                                    break;
                                v54 = v106 * 4;
                                do
                                {
                                    v107 = v54;
                                    if (!v107)
                                        goto LABEL_beb784;
                                } while ((v54 = v107 - 4, *(int *)((char *)&v1 + v107) == *(int *)((char *)&v40 + v107)));
                                v108 = arm64g_calculate_condition(35, *(int *)((char *)&v1 + v107), *(int *)((char *)&v40 + v107), 0);
                                if (!(v108 & 1))
                                {
                                    v109 = 0;
                                }
                                else
                                {
LABEL_beb784:
                                    v110 = 1;
                                    v111 = &v41;
                                    v112 = &v2;
                                    i0 = v106;
                                    do
                                    {
                                        v114 = i0;
                                        v54 = v111 + 1;
                                        v115 = ~*v111;
                                        v116 = arm64g_calculate_flag_c(3, (unsigned int)v110 & 1, 1, 0);
                                        v117 = arm64g_calculate_condition(53, *(int *)v112, v115, v116 & 0xffffffff);
                                        v110 = !(v117 & 1);
                                        *(unsigned int *)v112 = *(int *)v112 + v115 + (unsigned int)v116;
                                        v112 += 4;
                                        v111 = v54;
                                        i0 = v114 - 1;
                                    } while (i0);
                                    if (!(v110 & 1))
                                        goto LABEL_bebc3c;
                                    v13 = v106;
                                    v109 = 8;
                                    iter2 = v106;
                                }
                                if (iter2 < v39)
                                    v119 = v39;
                                else
                                    v119 = iter2;
                                if (41 <= v119)
                                    break;
                                v120 = v119 * 4;
                                do
                                {
                                    v121 = v120;
                                    if (!v121)
                                        goto LABEL_beb808;
                                } while ((v120 = v121 - 4, *(int *)((char *)&v1 + v121) == *(int *)&(&v28)[v121]));
                                v122 = arm64g_calculate_condition(35, *(int *)((char *)&v1 + v121), *(int *)&(&v28)[v121], 0);
                                if (!(v122 & 1))
                                {
                                    v119 = iter2;
                                }
                                else
                                {
LABEL_beb808:
                                    if (v119)
                                    {
                                        v123 = 1;
                                        v124 = &v29;
                                        v125 = &v2;
                                        i1 = v119;
                                        do
                                        {
                                            v127 = i1;
                                            v54 = v124 + 1;
                                            v128 = ~*v124;
                                            v129 = arm64g_calculate_flag_c(3, (unsigned int)v123 & 1, 1, 0);
                                            v130 = arm64g_calculate_condition(53, *(int *)v125, v128, v129 & 0xffffffff);
                                            v123 = !(v130 & 1);
                                            *(unsigned int *)v125 = *(int *)v125 + v128 + (unsigned int)v129;
                                            v125 += 4;
                                            v124 = v54;
                                            i1 = v127 - 1;
                                        } while (i1);
                                        if (!(v123 & 1))
                                            goto LABEL_bebc3c;
                                    }
                                    v13 = v119;
                                    v109 |= 4;
                                }
                                if (v119 < v27)
                                    v54 = v27;
                                else
                                    v54 = v119;
                                if (41 <= v54)
                                    goto LABEL_bebc68;
                                v132 = v54 * 4;
                                do
                                {
                                    v133 = v132;
                                    if (!v133)
                                        goto LABEL_beb88c;
                                } while ((v132 = v133 - 4, *(int *)((char *)&v1 + v133) == *(int *)((char *)&v16 + v133 + 4)));
                                v134 = arm64g_calculate_condition(35, *(int *)((char *)&v1 + v133), *(int *)((char *)&v16 + v133 + 4), 0);
                                if (!(v134 & 1))
                                {
                                    v54 = v119;
                                }
                                else
                                {
LABEL_beb88c:
                                    if (v54)
                                    {
                                        v135 = 1;
                                        v136 = &v17;
                                        v137 = &v2;
                                        i2 = v54;
                                        do
                                        {
                                            v139 = i2;
                                            v141 = ~*v136;
                                            v142 = arm64g_calculate_flag_c(3, (unsigned int)v135 & 1, 1, 0);
                                            v143 = arm64g_calculate_condition(53, *(int *)v137, v141, v142 & 0xffffffff);
                                            v135 = !(v143 & 1);
                                            *(unsigned int *)v137 = *(int *)v137 + v141 + (unsigned int)v142;
                                            v137 += 4;
                                            v136 += 1;
                                            i2 = v139 - 1;
                                        } while (i2);
                                        if (!(v135 & 1))
                                            goto LABEL_bebc3c;
                                    }
                                    v13 = v54;
                                    v109 += 2;
                                }
                                if (v54 < idx)
                                    iter2 = idx;
                                else
                                    iter2 = v54;
                                if (41 <= iter2)
                                    goto LABEL_bebb7c;
                                v145 = iter2 * 4;
                                do
                                {
                                    v146 = v145;
                                    if (!v146)
                                        goto LABEL_beb90c;
                                } while ((v145 = v146 - 4, *(int *)((char *)&v1 + v146) == *(int *)((char *)&v13 + v146 + 4)));
                                v147 = arm64g_calculate_condition(35, *(int *)((char *)&v1 + v146), *(int *)((char *)&v13 + v146 + 4), 0);
                                if (!(v147 & 1))
                                {
                                    iter2 = v54;
                                    goto LABEL_beb954;
                                }
LABEL_beb90c:
                                if (iter2)
                                {
                                    v148 = 1;
                                    v149 = &v14;
                                    v150 = &v2;
                                    i3 = iter2;
                                    do
                                    {
                                        v152 = i3;
                                        v54 = v149 + 1;
                                        v153 = ~*v149;
                                        v154 = arm64g_calculate_flag_c(3, (unsigned int)v148 & 1, 1, 0);
                                        v155 = arm64g_calculate_condition(53, *(int *)v150, v153, v154 & 0xffffffff);
                                        v148 = !(v155 & 1);
                                        *(unsigned int *)v150 = *(int *)v150 + v153 + (unsigned int)v154;
                                        v150 += 4;
                                        v149 = v54;
                                        i3 = v152 - 1;
                                    } while (i3);
                                    if (v148 & 1)
                                        goto LABEL_beb94c;
                                    goto LABEL_bebc3c;
                                }
LABEL_beb94c:
                                v13 = iter2;
                                v109 += 1;
LABEL_beb954:
                                if (dst == v57)
                                {
                                    v57 = v57;
                                    sub_c73c94(sub_c73c94(v57, v57, &g_efaaa0), v57, &g_efaa58);
                                }
                                v54 = v109 + 48;
                                *((char *)a2 + dst) = v54;
                                if (iter2)
                                {
                                    v54 = 0;
                                    v157 = iter2 * 4;
                                    iter = &v2;
                                    do
                                    {
                                        i4 = v157;
                                        v160 = v54 + *(int *)iter * 10;
                                        *(unsigned int *)iter = v160;
                                        iter += 4;
                                        v54 = v160 >> 32;
                                        dst = i4 - 4;
                                        v157 = dst;
                                    } while (i4 != 4);
                                    if (v54)
                                    {
                                        if (iter2 == 40)
                                            goto LABEL_bebc98;
                                        *(unsigned int *)((char *)&v2 + 4 * iter2) = v54;
                                        iter2 += 1;
                                    }
                                }
                                v13 = iter2;
                                if (v104 == v103)
                                {
                                    v54 = 0;
                                    v102 = v0;
                                    v56 = v1;
                                    goto LABEL_beb9d0;
                                }
                            }
                        }
                        else
                        {
LABEL_beb9c8:
                            v103 = 0;
LABEL_beb9cc:
                            v54 = 1;
LABEL_beb9d0:
                            if (idx)
                            {
                                v161 = 0;
                                m = idx * 4;
                                iter1 = &v14;
                                do
                                {
                                    v164 = m;
                                    v165 = *iter1 * 5 + v161;
                                    *iter1 = v165;
                                    iter1 += 1;
                                    v161 = v165 >> 32;
                                    m = v164 - 4;
                                } while (m);
                                if (v161)
                                {
                                    if (idx == 40)
                                        goto LABEL_bebc98;
                                    v15 = v161;
                                    idx += 1;
                                }
                            }
                            v16 = idx;
                            if (iter2 < idx)
                                v167 = idx;
                            else
                                v167 = iter2;
                            if (41 > v167)
                            {
                                v168 = v167 * 4;
                                do
                                {
                                    v169 = v168;
                                    if (!v169)
                                        goto LABEL_beba70;
                                } while ((v168 = v169 - 4, v170 = *(int *)((char *)&v1 + v169), v171 = *(int *)((char *)&v13 + v169 + 4), *(int *)((char *)&v1 + v169) == *(int *)((char *)&v13 + v169 + 4)));
                                v172 = arm64g_calculate_condition(147, v170, v171, 0);
                                v173 = arm64g_calculate_condition(35, v170, v171, 0);
                                if (v173 & 1)
                                    v174 = (char)!(v172 & 1);
                                else
                                    v174 = 0xff;
                                if (v174)
                                {
                                    if (v174 == 1)
                                        goto LABEL_bebab0;
                                    goto LABEL_bebb38;
                                }
LABEL_beba70:
                                if (v54 & 1)
                                {
                                    a0->field_0 = a2;
                                    a0->field_8 = 0;
                                    a0->field_10 = v63;
                                    return dst;
                                }
                                dst = v103 - 1;
                                if (v57 <= dst)
                                    sub_c73c94(dst, v57, &g_efaa58);
                                if (!(*((char *)a2 + dst) & 1))
                                    goto LABEL_bebb38;
LABEL_bebab0:
                                if (v57 < v103)
                                    goto LABEL_bebc80;
                                v175 = v103;
                                do
                                {
                                    v176 = v175;
                                    if (!v176)
                                    {
                                        v177 = 49;
                                        if (!(v54 & 1))
                                        {
                                            *(char *)a2 = 49;
                                            v177 = 48;
                                            dst = _memset(a2 + 1, 48, v103 - 1);
                                        }
                                        v63 += 1;
                                        if ((int)v102 >= (short)v56 && v57 > v103)
                                        {
                                            *((char *)a2 + v103) = v177;
                                            v103 += 1;
                                            goto LABEL_bebb38;
                                        }
                                    }
                                } while ((dst = a2 + v176, v175 = v176 - 1, *(char *)(dst - 1) == 57));
                                v54 = *((char *)a2 + v175) + 1;
                                *((char *)a2 + v175) = v54;
                                dst = _memset(dst, 48, v103 - v176);
LABEL_bebb38:
                                if (v57 >= v103)
                                {
                                    a0->field_0 = a2;
                                    a0->field_8 = v103;
                                    a0->field_10 = v63;
                                    return dst;
                                }
                                goto LABEL_bebb94;
                            }
                        }
                    }
                }
            }
        }
LABEL_bebb68:
        sub_c73bb0(0);
LABEL_bebb7c:
        sub_c73bb0(0, iter2, 40, &g_efa740);
LABEL_bebb94:
        sub_c73bb0(0, v103, v57, &g_efaa88);
        goto LABEL_bebbac;
    }
    else
    {
LABEL_bebbac:
        sub_c73c80("assertion failed: d.mant > 0", 28, &g_efaa10);
LABEL_bebbc4:
        sub_c73c80("assertion failed: d.minus > 0", 29, &g_efaa28);
LABEL_bebbdc:
        sub_c73c80("assertion failed: d.plus > 0assertion failed: d.mant + d.plus < (1 << 61)", 28, &g_efaa40);
LABEL_bebbf4:
        sub_c73c80("assertion failed: d.mant.checked_add(d.plus).is_some()", 54, &g_efaae8);
LABEL_bebc0c:
        sub_c73c80("assertion failed: d.mant.checked_sub(d.minus).is_some()", 55, &g_efaad0);
LABEL_bebc24:
        sub_c73c80("assertion failed: other > 0", 27, &g_efa740);
LABEL_bebc3c:
        dst = sub_c73c80(&g_e07fdf, 26, &g_efa740);
        v105 = v54;
LABEL_bebc54:
        sub_c73bb0(dst, v103, v57, &g_efaab8);
        v54 = v105;
LABEL_bebc68:
        sub_c73bb0(0, v54, 40, &g_efa740);
LABEL_bebc80:
        sub_c73bb0(0, v103, v57, &g_efaa70);
LABEL_bebc98:
        sub_c73c94(40, 40, &g_efa740);
    }
LABEL_bebcac:
    sub_c73c94(40);
    v57 = v57;
    sub_c73c94(sub_c73c94(v57, v57, &g_efaaa0), v57, &g_efaa58);
}
