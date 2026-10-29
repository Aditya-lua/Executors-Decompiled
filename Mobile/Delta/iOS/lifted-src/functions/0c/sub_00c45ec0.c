/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc45ec0..0xc46b30 (3184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c45ec0_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
    void* field_48;
    struct st_c45ec0_1 *field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_70;
    char field_78;
} st_c45ec0_0;

typedef struct st_c45ec0_6 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c45ec0_6;

typedef struct st_c45ec0_2 {
    unsigned long long field_0;
    struct st_c45ec0_1 *field_8;
    unsigned long long field_10;
} st_c45ec0_2;

typedef struct st_c45ec0_5 {
    char padding_0[12];
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
} st_c45ec0_5;

typedef struct st_c45ec0_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c45ec0_4;

typedef struct st_c45ec0_3 {
    unsigned long long field_0;
    struct st_c45ec0_1 *field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_c45ec0_3;

typedef struct st_c45ec0_1 {
    unsigned long long field_0;
} st_c45ec0_1;


double sub_c45ec0(st_c45ec0_0 *a0, st_c45ec0_5 *a1, void* a2, unsigned long long *a3)
{
    st_c45ec0_0 *v36;  // x20
    unsigned int v37;  // w28
    unsigned long long v46;  // 4112
    unsigned long v118;  // cc_dep2
    unsigned long v119;  // cc_ndep
    unsigned int *v120;  // x24
    unsigned int *i;  // x8
    unsigned int *v122;  // x9
    unsigned long long *v123;  // x1
    unsigned long long v124;  // x0
    unsigned long long v125;  // 4110
    unsigned long long v126;  // 4102
    unsigned long long v127;  // 4110
    unsigned long long v47;  // 4102
    unsigned long long v128;  // 4102
    unsigned long long v129;  // x26
    unsigned long long *v130;  // x27
    unsigned long v131;  // x20
    unsigned long long v132;  // x1
    unsigned int *v133;  // x20
    unsigned int *v134;  // x23
    unsigned int *v135;  // x23
    unsigned long long *v136;  // x1
    unsigned long long v137;  // x0
    unsigned long long v48;  // 4112
    unsigned long long v138;  // 4110
    unsigned long long v139;  // 4102
    unsigned long long v140;  // 4110
    unsigned long long v141;  // 4102
    st_c45ec0_2 *v142;  // x8
    unsigned long v143;  // x9
    unsigned long v144;  // cc_op
    unsigned long v145;  // cc_dep1
    unsigned long long v49;  // 4102
    unsigned long long v146;  // x8
    uint128_t *v147;  // x12
    unsigned long long *v148;  // x10
    unsigned long v149;  // x11
    uint128_t *v150;  // x10
    unsigned long v151;  // x13
    unsigned long long v50;  // x8
    unsigned long long v152;  // x12
    void* v153;  // x13
    st_c45ec0_6 *v154;  // x12
    uint128_t *v155;  // x13
    unsigned long long v156;  // x11
    unsigned long long v157;  // x8
    unsigned long long v158;  // x12
    unsigned long long v159;  // x24
    void* v160;  // x21
    unsigned long long v161;  // x27
    unsigned long long v51;  // x21
    void* v162;  // x23
    unsigned long long *v163;  // w9
    unsigned long long *v164;  // x1
    unsigned long long v165;  // x0
    unsigned long long v166;  // x27
    unsigned long long v167;  // x12
    unsigned long v168;  // x20
    unsigned long long v169;  // x25
    st_c45ec0_3 *v170;  // x8
    unsigned long long v171;  // x1
    unsigned long long v52;  // x27
    unsigned long long v172;  // x0
    unsigned long v173;  // x20
    unsigned long long v174;  // x25
    unsigned long long v175;  // x11
    unsigned long long idx;  // x9
    unsigned long long v177;  // x1
    unsigned long long v178;  // x0
    unsigned long long v179;  // x8
    unsigned long long v180;  // x25
    unsigned long long v181;  // x24
    long long v53;  // x9, Other Possible Types: unsigned long long
    unsigned long long v182;  // x9
    st_c45ec0_4 *v183;  // x8
    unsigned long long v184;  // x25
    unsigned long long v185;  // x24
    unsigned long long v186;  // x27
    unsigned long v187;  // x8
    unsigned long v188;  // x1
    unsigned long long v189;  // x24
    unsigned long long v190;  // x10
    unsigned long long v191;  // x8
    unsigned long long v54;  // x19
    unsigned long k;  // x9
    unsigned long long v193;  // x11
    unsigned long long *iter;  // x12
    unsigned long j;  // x13
    unsigned long long v196;  // x13
    unsigned long long *node;  // x10
    unsigned long long v199;  // x9
    unsigned long long v201;  // x8
    unsigned long long v55;  // x9
    unsigned long v202;  // d0
    unsigned long long v203;  // x20
    unsigned long long v204;  // x8
    unsigned long v205;  // d0
    unsigned long v206;  // d0
    unsigned long long v38;  // x22
    unsigned long v56;  // cc_dep1
    unsigned long v57;  // cc_dep2
    unsigned long long v58;  // x20
    unsigned long long v59;  // 4104
    unsigned long long v60;  // 4104
    unsigned long long v61;  // 4102
    unsigned long long v62;  // 4102
    __m128i v63;  // q0
    unsigned long v65;  // x10
    unsigned long long v39;  // x8
    unsigned long long v66;  // x10
    unsigned long v67;  // cc_dep1
    unsigned long long v68;  // 4145
    unsigned long long v69;  // 4147
    unsigned long long v70;  // x10
    unsigned long long v71;  // x10
    unsigned long long v72;  // 4108
    unsigned long long v73;  // 4108
    unsigned long v74;  // x9
    unsigned long v75;  // x8
    unsigned long v40;  // cc_op
    unsigned long long v76;  // x11
    unsigned long v77;  // cc_dep1
    unsigned long v78;  // cc_dep2
    unsigned long long v79;  // x9
    unsigned long long v80;  // 4112
    unsigned long long v81;  // 4112
    unsigned long long v82;  // 4112
    unsigned long long v83;  // 4106
    unsigned long long v84;  // 4112
    unsigned long long v85;  // 4106
    unsigned long v41;  // cc_ndep
    unsigned long long v86;  // x10
    unsigned long long v87;  // x8
    unsigned long long *v88;  // x27
    unsigned long v89;  // x23
    unsigned long long *v90;  // x26
    unsigned long v91;  // x24
    unsigned long long v92;  // x21
    unsigned long v93;  // x9
    void* v94;  // x20
    unsigned int *v95;  // x20
    unsigned long long v42;  // x8
    long long v96;  // x1
    unsigned long long v97;  // x0
    unsigned long long v98;  // 4110
    unsigned long long v99;  // 4102
    unsigned long v43;  // cc_dep2
    unsigned long long v100;  // 4110
    unsigned long long v101;  // 4102
    unsigned long long v102;  // x27
    unsigned long v103;  // x23
    unsigned long v44;  // d0
    unsigned long long ptr;  // x0
    unsigned long long v105;  // x27
    unsigned long long v106;  // x1
    unsigned long long v107;  // x26
    unsigned long long v108;  // x23
    unsigned long long v109;  // x23
    unsigned long long v45;  // x26
    void* v110;  // x20
    long long v111;  // x1
    unsigned long long v112;  // x0
    unsigned long long v113;  // 4110
    unsigned long long v114;  // 4102
    unsigned long long v115;  // 4110
    unsigned long long v116;  // 4102
    void* v117;  // x9
    unsigned long long v0;  // [bp-0x1a8]
    unsigned long long v1;  // [bp-0x1a8]
    unsigned long v2;  // [bp-0x1a0]
    unsigned long v3;  // [bp-0x1a0]
    unsigned long long *v4;  // [bp-0x198]
    unsigned long long v5;  // [bp-0x190]
    unsigned long long v6;  // [bp-0x190]
    unsigned long long v7;  // [bp-0x188]
    unsigned long long v8;  // [bp-0x180]
    unsigned int *v9;  // [bp-0x178], Other Possible Types: unsigned long long
    unsigned long long v10;  // [bp-0x168]
    unsigned long v11;  // [bp-0x160]
    unsigned long long v12;  // [bp-0x154]
    unsigned long long v13;  // [bp-0x150]
    unsigned long long v14;  // [bp-0x148]
    unsigned int v15;  // [bp-0x13c]
    long long v16;  // [bp-0x128]
    unsigned long v17;  // [bp-0x120]
    uint128_t v18;  // [bp-0x110]
    uint128_t v19;  // [bp-0x100]
    uint128_t v20;  // [bp-0x100]
    uint128_t v21;  // [bp-0xf0]
    uint128_t v22;  // [bp-0xf0]
    unsigned long long v23;  // [bp-0xe0]
    unsigned long long ptr1;  // [bp-0xd8]
    unsigned long long v25;  // [bp-0xd0]
    uint128_t v26;  // [bp-0xc8]
    uint256_t v27;  // [bp-0xb8]
    unsigned long long v28;  // [bp-0x98]
    unsigned long long v29;  // [bp-0x90]
    unsigned long long v30;  // [bp-0x88]
    uint128_t v31;  // [bp-0x80], Other Possible Types: unsigned long long
    unsigned long long v32;  // [bp-0x78]
    unsigned long long v33;  // [bp-0x70]
    char *v34;  // [bp-0x10]
    char v35;  // [bp+0x0]

    v34 = &v35;
    v36 = a0;
    v37 = a1->field_10;
    v15 = a1->field_c;
    v38 = a1->field_14;
    if ((unsigned int)v38)
    {
        v39 = (char *)a3 - 32;
        if (a3 < 32 || !(v40 = 4, v41 = 0, v39 >= v38))
        {
            v36->field_0 = 0x8000000000000000;
            return v44;
        }
        v42 = a2 + 32;
        v43 = v38;
    }
    else
    {
        v42 = 1;
    }
    *(unsigned long long *)&v18 = 0x8000000000000000;
    v45 = 8;
    v23 = 0;
    ptr1 = 8;
    v25 = 0;
    if (v37)
    {
        v46 = arm64g_calculate_condition(v40 | 16, v39, v43, v41);
        v47 = arm64g_calculate_condition(35, (v46 & 1 ? v38 & 0xffffffff : 0), (v46 & 1 ? 8 : 0), 0);
        if (v47 & 1)
            goto LABEL_c45f58;
LABEL_c45f3c:
        v50 = 0;
        v51 = 0;
        v52 = 0;
        v53 = 0;
        v54 = 0;
        ptr1 = 8;
    }
    else
    {
        v48 = arm64g_calculate_condition(v40 | 16, v39, v43, v41);
        v49 = arm64g_calculate_condition(32, (v48 & 1 ? v38 & 0xffffffff : 0), (v48 & 1 ? 8 : 0), 0);
        if (!(v49 & 1))
            goto LABEL_c45f3c;
LABEL_c45f58:
        v12 = 0;
        v13 = 0;
        v52 = 0;
        v53 = 0;
        v45 = 8;
        do
        {
            v55 = *(int *)(v42 + 4);
            if ((unsigned int)v55 < 8)
            {
LABEL_c468f0:
                break;
            }
            v56 = v38;
            v57 = v55;
            if (v55 <= v38)
            {
                v58 = v42 + v55;
                v59 = arm64g_calculate_condition(52, v56, v57, 0);
                if (!(v59 & 1))
                    goto LABEL_c45f8a;
                goto LABEL_c45f89;
            }
            else
            {
                v58 = 1;
                v60 = arm64g_calculate_condition(52, v56, v57, 0);
                if (v60 & 1)
                {
LABEL_c45f89:
                    v38 = 0;
                    v61 = arm64g_calculate_condition(52, v56, v57, 0);
                    if (v61 & 1)
                        goto LABEL_c468f0;
                    goto LABEL_c45f90;
                }
                else
                {
LABEL_c45f8a:
                    v38 -= v55;
                    v62 = arm64g_calculate_condition(52, v56, v57, 0);
                    if (v62 & 1)
                        goto LABEL_c468f0;
LABEL_c45f90:
                    if (*(int *)v42 != 2)
                    {
                        if (*(int *)v42 != 25)
                        {
LABEL_c460d8:
                            continue;
                        }
                        if ((unsigned int)v55 < 72)
                            goto LABEL_c4694c;
                        v63 = *(int128_t *)(v42 + 8);
                        v65 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v63, _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8(v63, _mm_setzero_si128()), 4)));
                        v66 = v65 & 0x8888888888888888;
                        v67 = v65 & 0x8888888888888888;
                        v68 = ((((((v66 & 0xaaaaaaaaaaaaaaaa) >> 1 | v66 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v66 & 0xaaaaaaaaaaaaaaaa) >> 1 | v66 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v66 & 0xaaaaaaaaaaaaaaaa) >> 1 | v66 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v66 & 0xaaaaaaaaaaaaaaaa) >> 1 | v66 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v69 = (((((((v66 & 0xaaaaaaaaaaaaaaaa) >> 1 | v66 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v66 & 0xaaaaaaaaaaaaaaaa) >> 1 | v66 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v66 & 0xaaaaaaaaaaaaaaaa) >> 1 | v66 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v66 & 0xaaaaaaaaaaaaaaaa) >> 1 | v66 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v70 = ((((v69 | v68) & 0xffff0000ffff0000) >> 16 | (v69 | v68) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v69 | v68) & 0xffff0000ffff0000) >> 16 | (v69 | v68) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v70)
                        {
                            v71 = 16;
                            v72 = arm64g_calculate_condition(10, v67, 0, 0);
                            if (!(v72 & 1))
                                goto LABEL_c45fd2;
                        }
                        else
                        {
                            v71 = Clz(v70) >> 2;
                            v73 = arm64g_calculate_condition(10, v67, 0, 0);
                            if (!(v73 & 1))
                            {
LABEL_c45fd2:
LABEL_c45fd4:
                                if (v71 == 7)
                                {
                                    if (0x46524157445f5f00 != _mm_cvtsi128_si64(v63) * 0x100)
                                        goto LABEL_c460d8;
                                }
                                else
                                {
                                    if (v15 != 1 || v71)
                                        goto LABEL_c460d8;
                                }
                                v74 = v55 - 72;
                                v75 = *(int *)(v42 + 64);
                                v76 = (v75 + (v75 & 0xffffffff) * 4) * 16;
                                v77 = v76;
                                v78 = v74;
                                if (v74 < v76)
                                {
                                    v79 = 0;
                                    v80 = arm64g_calculate_condition(132, v77, v78, 0);
                                    if (!(v80 & 1))
                                        goto LABEL_c460be;
                                }
                                else
                                {
                                    v79 = v42 + 72;
                                    v81 = arm64g_calculate_condition(132, v77, v78, 0);
                                    if (!(v81 & 1))
                                    {
LABEL_c460be:
                                        v84 = arm64g_calculate_condition(132, v77, v78, 0);
                                        v85 = arm64g_calculate_condition(16, (v84 & 1 ? v75 & 0xffffffff : 0x40000000), 0, 0);
                                        if (!(v85 & 1))
                                        {
LABEL_c460c6:
                                            v86 = v75;
LABEL_c460c8:
                                            v10 = v86;
                                            if ((unsigned int)v75)
                                                v87 = v79;
                                            else
                                                v87 = 1;
                                            v13 = v87;
                                            goto LABEL_c460d8;
                                        }
                                        v86 = 33;
LABEL_c460c5:
                                        goto LABEL_c460c8;
                                    }
                                }
                                v82 = arm64g_calculate_condition(132, v77, v78, 0);
                                v83 = arm64g_calculate_condition(19, (v82 & 1 ? v75 & 0xffffffff : 0x40000000), 0, 0);
                                if (!(v83 & 1))
                                    goto LABEL_c460c6;
                                goto LABEL_c460c5;
                            }
                        }
                        v71 = 16;
                        goto LABEL_c45fd4;
                    }
                    else
                    {
                        v88 = a3;
                        if ((unsigned int)v55 < 24)
                        {
LABEL_c4694c:
                            v36->field_0 = 0x8000000000000000;
                            v203 = ptr1;
                            sub_c54038(v203, v25);
                            if (v23)
                                _free(v203);
                            switch (v204)
                            {
                            case 9223372036854775808:
                                break;
                            case 0:
                                if (*(unsigned long long *)((void*)&v19 + 8))
                                    _free(*(unsigned long long *)&v21);
                                break;
                            default:
                                _free(*(unsigned long long *)((void*)&v18 + 8));
                            }
                            if (!v52)
                                return v206;
                            _free();
                            return v205;
                        }
                        v89 = *(int *)(v42 + 12);
                        if ((unsigned int)v89)
                        {
                            v90 = *(int *)(v42 + 8);
                            if (v88 < v90 || !(v91 = v89 * 16, v88 - v90 >= v91))
                                goto LABEL_c4694c;
                            v14 = v58;
                            v92 = a2 + v90;
                            v93 = *(int *)(v42 + 16);
                            v94 = a2 + v90;
                            v95 = v94 + 16;
                            v16 = *(int *)(v42 + 20) + v93;
                            v17 = v93;
                            v96 = v88;
                            v97 = sub_c1460c(a2, v96, v93 + *(int *)v94, v16);
                            if (v97)
                            {
                                v98 = arm64g_calculate_condition(v144 | 16, v145, v118, v119);
                                v99 = arm64g_calculate_condition(4, (v98 & 1 ? v96 : 0x40000000), 0, 0);
                                if (v99 & 1)
                                    goto LABEL_c46100;
                            }
                            else
                            {
                                v100 = arm64g_calculate_condition(v144 | 16, v145, v118, v119);
                                v101 = arm64g_calculate_condition(0, (v100 & 1 ? v96 : 0x40000000), 0, 0);
                                if (v101 & 1)
                                    goto LABEL_c46100;
                            }
                            if ((*(char *)(v92 + 4) & 0xeeeeeeee) == 14)
                            {
                                v11 = v89;
                                v53 = v96;
                                v102 = v97;
                                v103 = *(long long *)(v92 + 8);
                                ptr = _malloc(96);
                                if (!ptr)
                                {
                                    sub_c6b970(8, 96);
                                    __debugbreak();
                                }
LABEL_c4657c:
                                v120 = v92 + v91;
                                *(unsigned long long *)ptr = v102;
                                *(long long *)(ptr + 8) = v53;
                                *(unsigned long *)(ptr + 16) = v103;
                                v31 = 4;
                                v32 = ptr;
                                v106 = 1;
                                v33 = 1;
                                v89 = v11;
                                if (v95 != v120)
                                {
                                    v106 = 1;
                                    i = v95;
                                    v11 = v89;
                                    do
                                    {
                                        v53 = v106;
                                        v122 = i;
                                        v8 = ptr;
                                        v9 = v122 + 4;
                                        v123 = a3;
                                        v124 = sub_c1460c(a2, v123, v17 + *v122, v16);
                                        if (v124)
                                        {
                                            v125 = arm64g_calculate_condition(v144 | 16, v145, v118, v119);
                                            v126 = arm64g_calculate_condition(4, (v125 & 1 ? v123 : 0x40000000), 0, 0);
                                            if (v126 & 1)
                                                goto LABEL_c46618;
                                        }
                                        else
                                        {
                                            v127 = arm64g_calculate_condition(v144 | 16, v145, v118, v119);
                                            v128 = arm64g_calculate_condition(0, (v127 & 1 ? v123 : 0x40000000), 0, 0);
                                            if (v128 & 1)
                                                goto LABEL_c46618;
                                        }
                                        if (((char)v95[1] & 0xeeeeeeee) == 14)
                                        {
                                            v129 = v124;
                                            v130 = v123;
                                            v131 = *(long long *)&v95[2];
                                            v132 = v53;
                                            ptr = v8;
                                            if (v132 != v31)
                                                continue;
                                            goto LABEL_c46694;
                                        }
LABEL_c46618:
                                        v133 = v9;
                                        if (v133 == v120)
                                        {
                                            v106 = v53;
                                            v105 = v31;
                                            v107 = v32;
                                            v58 = v14;
                                            if (!v52)
                                                goto LABEL_c46154;
                                            goto LABEL_c46148;
                                        }
                                        v134 = v133;
                                        while (1)
                                        {
                                            v135 = v134 + 4;
                                            v136 = a3;
                                            v137 = sub_c1460c(a2, v136, v17 + *v134, v16);
                                            if (v137)
                                            {
                                                v138 = arm64g_calculate_condition(v144 | 16, v145, v118, v119);
                                                v139 = arm64g_calculate_condition(4, (v138 & 1 ? v136 : 0x40000000), 0, 0);
                                                if (v139 & 1)
                                                    goto LABEL_c4662c;
                                            }
                                            else
                                            {
                                                v140 = arm64g_calculate_condition(v144 | 16, v145, v118, v119);
                                                v141 = arm64g_calculate_condition(0, (v140 & 1 ? v136 : 0x40000000), 0, 0);
                                                if (v141 & 1)
                                                    goto LABEL_c4662c;
                                            }
                                            if (((char)v133[1] & 0xeeeeeeee) == 14)
                                                break;
LABEL_c4662c:
                                            v133 = v135;
                                            v134 = v135;
                                            if (v134 == v120)
                                            {
                                                v106 = v53;
                                                v89 = v11;
                                                goto LABEL_c46704;
                                            }
                                        }
                                        v129 = v137;
                                        v130 = v136;
                                        v9 = v133 + 4;
                                        v89 = v11;
                                        v131 = *(long long *)&v133[2];
                                        v132 = v53;
                                        ptr = v8;
                                        if (v132 != v31)
                                            continue;
LABEL_c46694:
                                        sub_c6c0cc(&v31);
                                        ptr = v32;
                                        v132 = v53;
                                        v142 = ptr + 24 * v132;
                                        v142->field_0 = v129;
                                        v142->field_8 = v130;
                                        v142->field_10 = v131;
                                        v106 = v132 + 1;
                                        v33 = v106;
                                        i = v9;
                                        v95 = i;
                                    } while (i != v120);
                                }
LABEL_c46704:
                                v105 = v31;
                                v107 = v32;
                                v58 = v14;
                                v53 = v106;
                                if (!v52)
                                    goto LABEL_c46154;
                                goto LABEL_c46148;
                            }
LABEL_c46100:
                            if ((unsigned int)v89 == 1)
                            {
                                v105 = 0;
                                v106 = 0;
                                v107 = 8;
                                v58 = v14;
                                v53 = 0;
                                if (!v52)
                                    goto LABEL_c46154;
                                goto LABEL_c46148;
                            }
                            else
                            {
                                v11 = v89;
                                v108 = v91 - 16;
                                do
                                {
                                    v109 = v108;
                                    v110 = a2 + v90;
                                    v111 = v88;
                                    v112 = sub_c1460c(a2, v111, v17 + (int)v110[16], v16);
                                    if (v112)
                                    {
                                        v113 = arm64g_calculate_condition(v144 | 16, v145, v118, v119);
                                        v114 = arm64g_calculate_condition(4, (v113 & 1 ? v111 : 0x40000000), 0, 0);
                                        if (v114 & 1)
                                            continue;
                                    }
                                    else
                                    {
                                        v115 = arm64g_calculate_condition(v144 | 16, v145, v118, v119);
                                        v116 = arm64g_calculate_condition(0, (v115 & 1 ? v111 : 0x40000000), 0, 0);
                                        if (v116 & 1)
                                            continue;
                                    }
                                    if (((char)v110[20] & 0xeeeeeeee) == 14)
                                    {
                                        v53 = v111;
                                        v102 = v112;
                                        v117 = a2 + v90;
                                        v95 = v117 + 32;
                                        v103 = (long long)v117[24];
                                        ptr = _malloc(96);
                                        if (!ptr)
                                        {
                                            sub_c6b970(8, 96);
                                            __debugbreak();
                                        }
                                        goto LABEL_c4657c;
                                    }
                                } while ((v90 += 2, v108 = v109 - 16, v109 != 16));
                                v105 = 0;
                                v106 = 0;
                                v107 = 8;
                                v58 = v14;
                                v89 = v11;
                                v53 = 0;
                                if (!v52)
                                    goto LABEL_c46154;
                                goto LABEL_c46148;
                            }
                        }
                        else
                        {
                            v105 = 0;
                            v106 = 0;
                            v143 = *(int *)(v42 + 16);
                            v16 = *(int *)(v42 + 20) + v143;
                            v17 = v143;
                            v92 = 1;
                            v107 = 8;
                            v53 = 0;
                            if (!v52)
                                goto LABEL_c46154;
LABEL_c46148:
                            _free(v45);
                            v106 = v53;
LABEL_c46154:
                            v45 = v107;
                            v52 = v105;
                            if (v15 == 1)
                            {
                                if (2 <= v106)
                                {
                                    if (21 > v106)
                                        sub_c5a3b4(v45);
                                    else
                                        sub_c5a240(v45);
                                }
                                v12 = 1;
                            }
                            else
                            {
                                if (2 <= v106)
                                {
                                    if (21 > v53)
                                    {
                                        v146 = 0;
                                        v147 = v45 + 24;
                                        v148 = v45;
                                        do
                                        {
                                            v149 = v148[5];
                                            v150 = v147;
                                            if (v148[2] > v149)
                                            {
                                                v31 = *v150;
                                                v151 = v146;
                                                do
                                                {
                                                    v152 = v151;
                                                    v153 = v45 + v151;
                                                    *(int128_t *)&v153[24] = *(int128_t *)v153;
                                                    *(long long *)&v153[40] = (long long)v153[16];
                                                    if (!v152)
                                                    {
                                                        v154 = v153 + 24;
                                                        v155 = v45;
                                                        goto LABEL_c46770;
                                                    }
                                                } while ((v151 = v152 - 24, v149 < (unsigned long long)*(long long *)((char *)v153 - 8)));
                                                v154 = v45 + v152 + 24;
                                                v155 = v45 + v151 + 24;
LABEL_c46770:
                                                *v155 = v31;
                                                *(unsigned long *)((char *)v154 - 8) = v149;
                                            }
                                        } while ((v147 = (char *)&v150[1] + 8, v146 += 24, v148 = v150, v147 != v45 + v53 * 24));
                                    }
                                    else
                                    {
                                        sub_c5a17c(v45);
                                    }
                                }
                                v14 = v52;
                                v156 = 0;
                                v157 = 0;
                                v158 = 0;
                                v28 = 0;
                                v29 = 8;
                                v30 = 0;
                                v31 = CONCAT(8, 0);
                                v33 = 0;
                                v159 = 8;
                                v1 = v0;
                                v3 = v2;
                                v6 = v5;
                                v160 = v92;
                                while (1)
                                {
                                    v161 = v157;
                                    do
                                    {
                                        v162 = v160;
                                        if (v160 == v92 + v89 * 16)
                                        {
                                            v184 = v58;
                                            v185 = v29;
                                            v186 = v156;
                                            if (2 <= v156)
                                            {
                                                if (21 > v186)
                                                    sub_c5a5b8(v185, v186);
                                                else
                                                    sub_c5a4a8(v185, v186);
                                            }
                                            *(unsigned long long *)((char *)&v27 + 24) = v33;
                                            *(uint128_t *)((char *)&v27 + 8) = v31;
                                            v26 = CONCAT(v185, v28);
                                            *(unsigned long long *)&v27 = v186;
                                            v187 = *(unsigned long long *)((void*)&v27 + 24);
                                            v188 = v25;
                                            v189 = v187 - v188;
                                            if (v187 <= v188)
                                            {
                                                v25 = v187;
                                                v52 = v14;
                                                sub_c54038(ptr1 + 584 * v25, v188 - v25);
                                                v58 = v184;
                                                v201 = v18;
                                                if (v201 == 0x8000000000000000)
                                                    goto LABEL_c468a4;
                                                goto LABEL_c46888;
                                            }
                                            v58 = v184;
                                            v52 = v14;
                                            if (v23 - v188 >= v189)
                                            {
                                                v190 = ptr1;
                                                if (2 <= v189)
                                                    goto LABEL_c46824;
                                                goto LABEL_c464c4;
                                            }
                                            else
                                            {
                                                sub_c6c0cc(&v23);
                                                v190 = ptr1;
                                                v188 = v25;
                                                if (v189 < 2)
                                                {
LABEL_c464c4:
                                                    v191 = v188;
                                                    k = v189;
                                                    goto LABEL_c46858;
                                                }
                                                else
                                                {
LABEL_c46824:
                                                    v193 = v189 & 0xfffffffffffffffe;
                                                    v191 = v188 + v193;
                                                    k = v189 & 1;
                                                    iter = v190 + 584 * v188;
                                                    j = v189 & 0xfffffffffffffffe;
                                                    do
                                                    {
                                                        v196 = j;
                                                        *iter = 9223372036854775809;
                                                        iter[73] = 9223372036854775809;
                                                        iter += 146;
                                                        j = v196 - 2;
                                                    } while (j);
                                                    if (v189 == v193)
                                                        goto LABEL_c46874;
LABEL_c46858:
                                                    node = v190 + 584 * v191;
                                                    v191 += k;
                                                    do
                                                    {
                                                        v199 = k;
                                                        *node = 9223372036854775809;
                                                        node += 73;
                                                        k = v199 - 1;
                                                    } while (k);
LABEL_c46874:
                                                    v25 = v191;
                                                    v201 = v18;
                                                    if (v201 == 0x8000000000000000)
                                                        goto LABEL_c468a4;
LABEL_c46888:
                                                    if (v201)
                                                        _free(*(unsigned long long *)((void*)&v18 + 8));
                                                    if (*(unsigned long long *)((void*)&v19 + 8))
                                                        _free(*(unsigned long long *)&v21);
LABEL_c468a4:
                                                    v18 = v26;
                                                    v20 = *(uint128_t *)&v27;
                                                    v22 = *(uint128_t *)((void*)&v27 + 16);
                                                    goto LABEL_c460e0;
                                                }
                                            }
                                        }
                                    } while ((v160 = v162 + 16, v163 = (unsigned long long *)(char)v162[4], v163 < 32));
                                    if (99 < v163)
                                    {
                                        switch (v163)
                                        {
                                        case 102:
                                            v177 = a3;
                                            v178 = sub_c1460c(a2, v177, v17 + *(int *)((char *)v160 - 16), v16);
                                            v158 = 0;
                                            v157 = v161;
                                            if (v178 && (v158 = 0, v157 = v161, v177))
                                            {
                                                v179 = v177 - 1;
                                                v7 = v156;
                                                v8 = v159;
                                                v9 = v178;
                                                if (*(char *)(v178 + v179) == 41)
                                                {
                                                    if (v179)
                                                    {
                                                        v180 = 0;
                                                        do
                                                        {
                                                            if (*(char *)(v178 + v180) == 40)
                                                            {
                                                                v181 = v178 + v180 + 1;
                                                                v6 = v179 + ~v180;
                                                                goto LABEL_c4640c;
                                                            }
                                                        } while ((v180 += 1, v179 != v180));
                                                        goto LABEL_c46370;
                                                    }
                                                    else
                                                    {
                                                        v181 = 0;
                                                        v180 = 1;
LABEL_c4640c:
                                                        v11 = v33;
                                                        if (v33 == *(unsigned long long *)&v31)
                                                            sub_c737b0(&v31);
                                                        v182 = v11;
                                                        v183 = *(unsigned long long *)((void*)&v31 + 8) + v182 * 32;
                                                        v183->field_0 = v9;
                                                        v183->field_8 = v180;
                                                        v156 = v7;
                                                        v183->field_10 = v181;
                                                        v183->field_18 = v6;
                                                        v33 = v182 + 1;
                                                        v157 = v161;
                                                        v158 = 1;
                                                        v159 = v8;
                                                        break;
                                                    }
                                                }
                                                else
                                                {
LABEL_c46370:
                                                    v180 = v177;
                                                    v181 = 0;
                                                    goto LABEL_c4640c;
                                                }
                                            }
                                            break;
                                        case 100:
                                            v158 = 0;
LABEL_c462ac:
                                            v157 = v161;
                                            break;
                                        default:
                                            goto LABEL_c462ac;
                                        }
                                    }
                                    else if (v163 != 36)
                                    {
                                        v157 = v161;
                                        if (v163 == 38)
                                        {
                                            v164 = a3;
                                            v9 = v161;
                                            v165 = sub_c1460c(a2, v164, v17 + *(int *)((char *)v160 - 16), v16);
                                            v166 = v9;
                                            v167 = v158;
                                            v157 = v166;
                                            if (v165 && (v157 = v166, v158 = 0, v167 == 1))
                                            {
                                                v4 = v164;
                                                v6 = v165;
                                                v168 = *(long long *)((char *)v160 - 8);
                                                v169 = v156;
                                                if (v156 == v28)
                                                {
                                                    sub_c73748(&v28);
                                                    v159 = v29;
                                                }
                                                v170 = v159 + 40 * v169;
                                                v170->field_0 = v6;
                                                v170->field_8 = v4;
                                                v170->field_10 = v168;
                                                *(unsigned long long *)v170->padding_18 = 0;
                                                v170->field_20 = v11;
                                                v156 = v169 + 1;
                                                v30 = v156;
                                                v157 = v166;
                                                v158 = 1;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        v171 = a3;
                                        v9 = v161;
                                        v172 = sub_c1460c(a2, v171, v17 + *(int *)((char *)v160 - 16), v16);
                                        v157 = v9;
                                        if (v172)
                                        {
                                            if (v171)
                                            {
                                                v1 = v171;
                                                v3 = *(long long *)((char *)v160 - 8);
                                                v157 = v172;
                                            }
                                            else
                                            {
                                                v157 = 0;
                                                if (v9 && v158 & 1)
                                                {
                                                    v173 = *(long long *)((char *)v160 - 8);
                                                    v174 = v156;
                                                    if (v156 == v28)
                                                        sub_c73748(&v28);
                                                    v157 = 0;
                                                    v175 = v29;
                                                    idx = v175 + 40 * v174;
                                                    *(unsigned long long *)idx = v9;
                                                    *(unsigned long long *)(idx + 8) = v1;
                                                    *(unsigned long *)(idx + 16) = v3;
                                                    *(unsigned long *)(idx + 24) = v173;
                                                    *(unsigned long *)(idx + 32) = v11;
                                                    v30 = v174 + 1;
                                                    v158 = 1;
                                                    v159 = v175;
                                                    v156 = v30;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
LABEL_c460e0:
            v37 -= 1;
        } while (v37 && 8 <= v38);
        v54 = v25;
        if (v23 > v54)
        {
            v51 = v13;
            v38 = v10;
            if (v54)
            {
                ptr1 = _realloc();
                if (!ptr1)
                {
                    sub_c6b970(8, 584 * v54);
                    __debugbreak();
                }
            }
            else
            {
                _free();
                ptr1 = 8;
            }
            v50 = (char)v12;
        }
        else
        {
            v51 = v13;
            v50 = (char)v12;
            v38 = v10;
        }
    }
    *(uint128_t *)&(&v36->field_10)[1] = v18;
    *(uint128_t *)((char *)&v36->field_18 + 8) = v19;
    *(uint128_t *)((char *)&v36->field_28 + 8) = v21;
    v36->field_0 = v52;
    v36->field_8 = v45;
    v36->field_10 = v53;
    *(void* *)((char *)&v36->field_38 + 8) = a2;
    v36->field_48 = a3;
    v36->field_50 = ptr1;
    v36->field_58 = v54;
    v36->field_60 = v51;
    v36->field_68 = v38;
    *(char *)&v36->field_70 = v50 & 1;
    return v202;
}
