/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4da9c..0xc4eda0 (4868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4da9c_9 {
    uint128_t field_0;
} st_c4da9c_9;

typedef struct st_c4da9c_3 {
    char padding_0[16];
    void* field_10;
    unsigned long long field_18;
    char padding_20[176];
    struct st_c4da9c_0 *field_d0;
    char padding_d8[8];
    struct st_c4da9c_0 *field_e0;
    unsigned long long field_e8;
    char padding_f0[32];
    char field_110;
} st_c4da9c_3;

typedef struct st_c4da9c_6 {
    void* field_0;
    void* field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c4da9c_6;

typedef struct st_c4da9c_2 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char *field_18;
    unsigned long long field_20;
} st_c4da9c_2;

typedef struct st_c4da9c_10 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned int field_28;
    unsigned int field_2c;
} st_c4da9c_10;

typedef struct st_c4da9c_7 {
    char padding_0[40];
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[8];
    char field_48[4];
    char field_49;
} st_c4da9c_7;

typedef struct st_c4da9c_1 {
    char padding_0[40];
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[8];
    unsigned int field_48;
    char field_49;
} st_c4da9c_1;

typedef struct st_c4da9c_0 {
    unsigned int field_0;
    unsigned short field_4;
    char field_6;
    char field_7;
} st_c4da9c_0;

typedef struct st_c4da9c_8 {
    char padding_0[16];
    struct st_c4da9c_9 *field_10;
    struct st_c4da9c_7 *field_18;
    char padding_20[72];
    unsigned short field_68;
} st_c4da9c_8;

typedef struct st_c4da9c_5 {
    char field_0;
} st_c4da9c_5;

typedef struct st_c4da9c_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    struct st_c4da9c_5 *field_30;
    unsigned long long field_38;
    struct st_c4da9c_1 *field_40;
    struct st_c4da9c_2 *field_48;
    long long field_50;
    struct st_c4da9c_3 *field_58;
    void* field_60;
    long long field_68;
    char field_70;
} st_c4da9c_4;

extern long long g_efbab8;

double sub_c4da9c(void* a0)
{
    st_c4da9c_4 *v50;  // x1
    unsigned long long v57;  // w12
    st_c4da9c_10 *v147;  // x9
    unsigned long v148;  // x28
    st_c4da9c_3 *v149;  // x13
    void* v150;  // x14
    st_c4da9c_0 **v151;  // x9
    unsigned long long v152;  // w10
    unsigned long v153;  // cc_dep1
    unsigned long long v154;  // x11
    unsigned long long v155;  // 4106
    unsigned long long v156;  // 4106
    st_c4da9c_7 *v58;  // x8
    unsigned long long v157;  // x12
    st_c4da9c_0 *v158;  // x21
    st_c4da9c_0 *v159;  // x15
    unsigned long long v160;  // x8
    unsigned long long v161;  // x9
    unsigned long long v162;  // x22
    st_c4da9c_4 *v163;  // x8
    unsigned long v164;  // x25
    unsigned long long v165;  // x9
    unsigned long long *v166;  // x10
    unsigned long v59;  // x21
    unsigned int v167;  // w11
    unsigned long v168;  // x21
    void* v169;  // x10
    st_c4da9c_6 *v170;  // x8
    void* v171;  // x21
    unsigned long v172;  // x22
    st_c4da9c_6 *v173;  // x8
    long long v174;  // x28
    unsigned long long v175;  // x25
    void* v176;  // x22
    unsigned long v60;  // x25
    st_c4da9c_4 *v177;  // x21
    unsigned long long v178;  // w10
    long long v179;  // x9
    char *v180;  // x12
    unsigned long v181;  // x10
    unsigned long long v182;  // x8
    unsigned long long v183;  // w11
    unsigned long v184;  // x13
    char *v185;  // x14
    unsigned long v186;  // x15
    unsigned int v61;  // w10
    unsigned long long v187;  // 4118
    st_c4da9c_2 *v188;  // x11
    unsigned long long v189;  // x10
    st_c4da9c_8 *v190;  // x8
    char *v191;  // x10
    unsigned long v192;  // x11
    unsigned long long *v193;  // x13
    unsigned long v194;  // x14
    unsigned long long v195;  // x15
    unsigned long long v196;  // x12
    unsigned long v62;  // x22
    char v198;  // x16
    unsigned int v199;  // w16
    long long v200;  // x0
    unsigned long long v201;  // x8
    unsigned long long v202;  // x11
    unsigned long long v203;  // x9
    uint128_t v204;  // q0
    unsigned long v63;  // x13
    char *v64;  // x14
    unsigned long v65;  // x15
    unsigned long long v66;  // 4118
    st_c4da9c_2 *v67;  // x12
    unsigned long long v68;  // x11
    st_c4da9c_8 *v69;  // x9
    char *v70;  // x11
    unsigned long v71;  // x12
    unsigned long long *v72;  // x14
    unsigned long v73;  // x15
    unsigned long long v74;  // x16
    unsigned long long v75;  // x13
    long long v51;  // x2
    char v77;  // x17
    unsigned int i;  // w17
    unsigned long long v79;  // w11
    long long v80;  // x22
    unsigned long long v81;  // x21
    void* v82;  // x19
    unsigned long long v84;  // x8
    void* v85;  // x11
    uint128_t *v86;  // x12
    void* v87;  // x10
    unsigned long long v88;  // x9
    unsigned long long v89;  // x8
    unsigned long long v90;  // w9
    void* v91;  // x9
    unsigned long long v92;  // x8
    unsigned long long v93;  // x9
    unsigned long v94;  // x8
    st_c4da9c_0 *v95;  // x8
    void* v96;  // x12
    unsigned long long v52;  // x3
    unsigned long v97;  // x8
    st_c4da9c_0 *v98;  // x13
    unsigned long long v99;  // x11
    unsigned long v100;  // x10
    unsigned long long v101;  // x12
    unsigned long long v102;  // x9
    unsigned long long v103;  // x9
    unsigned long long v104;  // w8
    unsigned long long v105;  // 4121
    unsigned long long v106;  // x8
    long long v53;  // x19
    unsigned long long v107;  // x9
    unsigned long long v108;  // x8
    st_c4da9c_3 *v109;  // x9
    void* v110;  // x12
    unsigned long v111;  // x10
    void* v112;  // x8
    unsigned long v113;  // x11
    unsigned long v114;  // x9
    unsigned long v115;  // x12
    unsigned long long v116;  // x10
    char *v54;  // x28
    void* v117;  // x8
    unsigned long long v118;  // 4124
    unsigned long long v119;  // 4126
    unsigned int v120;  // w13
    unsigned long long v121;  // w13
    unsigned long long v122;  // x9
    st_c4da9c_3 *v123;  // x9
    void* v124;  // x12
    unsigned long v125;  // x10
    void* v126;  // x8
    unsigned long v55;  // x11
    unsigned long v127;  // x11
    unsigned long v128;  // x9
    unsigned long v129;  // x12
    unsigned long long v130;  // x10
    void* v131;  // x8
    unsigned long long v132;  // 4124
    unsigned long long v133;  // 4126
    unsigned int v134;  // w13
    unsigned long long v135;  // w13
    unsigned long long v136;  // x9
    unsigned long long v56;  // x9
    unsigned long long v137;  // w8
    unsigned long v138;  // cc_dep1
    unsigned long long v139;  // x12
    unsigned long long v140;  // 4112
    unsigned long long v141;  // 4112
    unsigned long long v142;  // x8
    unsigned long long v143;  // x9
    void* v144;  // x8
    unsigned long long v145;  // x9
    unsigned long v146;  // x20
    void* v0;  // [bp-0x1c0]
    unsigned long long v1;  // [bp-0x1b8]
    unsigned long long v2;  // [bp-0x1b0]
    unsigned long long v3;  // [bp-0x1a8]
    unsigned long long v4;  // [bp-0x1a8]
    unsigned long long v5;  // [bp-0x1a0]
    unsigned long long v6;  // [bp-0x1a0]
    unsigned long long v7;  // [bp-0x198]
    unsigned long long v8;  // [bp-0x198]
    st_c4da9c_0 *v9;  // [bp-0x190]
    st_c4da9c_0 *v10;  // [bp-0x190]
    unsigned long long v11;  // [bp-0x184]
    st_c4da9c_0 *v12;  // [bp-0x180]
    unsigned long long v13;  // [bp-0x178]
    unsigned long long v14;  // [bp-0x170]
    unsigned long long v15;  // [bp-0x168]
    long long v16;  // [bp-0x160]
    void* v17;  // [bp-0x158]
    unsigned long long v18;  // [bp-0x14c]
    unsigned long long v19;  // [bp-0x148]
    unsigned long long v20;  // [bp-0x140]
    unsigned long long v21;  // [bp-0x138]
    unsigned long long v22;  // [bp-0x138]
    st_c4da9c_3 *v23;  // [bp-0x130]
    void* v24;  // [bp-0x128]
    unsigned long long v25;  // [bp-0x120]
    st_c4da9c_4 *v26;  // [bp-0x118]
    unsigned long long v27;  // [bp-0x110]
    uint128_t *v28;  // [bp-0x108]
    unsigned long long v29;  // [bp-0x100]
    void* v30;  // [bp-0xf8]
    void* v31;  // [bp-0xf0]
    void* v32;  // [bp-0xe8]
    uint128_t v33;  // [bp-0xe0], Other Possible Types: uint128_t
    unsigned long long v34;  // [bp-0xd0]
    unsigned long long v35;  // [bp-0xc8]
    unsigned long long v36;  // [bp-0xc0]
    uint192_t v37;  // [bp-0xb8]
    uint192_t v38;  // [bp-0xb8]
    unsigned long v39;  // [bp-0xb0]
    unsigned long v40;  // [bp-0xa8]
    unsigned long long v41;  // [bp-0xa0]
    unsigned long long v42;  // [bp-0x98]
    unsigned long long v43;  // [bp-0x90]
    unsigned int v44;  // [bp-0x88]
    char v45;  // [bp-0x84]
    uint128_t v46;  // [bp-0x80]
    unsigned long long v47;  // [bp-0x70]
    char *v48;  // [bp-0x10]
    char v49;  // [bp+0x0]

    v48 = &v49;
    while (1)
    {
        while (1)
        {
            v53 = v50->field_50;
            if (v53 <= v51)
            {
                *(char *)a0 = 82;
                return *(unsigned long long *)&v204;
            }
            v54 = v50->field_30;
            v55 = v50->field_38;
            if (!v55)
            {
                v201 = 19;
                v56 = v54;
                goto LABEL_c4ec80;
            }
            v56 = 0;
            v57 = 0;
            v58 = v50->field_40;
            v59 = v58->field_30;
            v60 = v58->field_38;
            v61 = v58->field_48[1];
            v62 = v58->field_28;
            v63 = v55 - 1;
            v64 = v54 + 1;
            while (1)
            {
                v65 = *(v64 - 1);
                if (v57 == 63 && 1 < (unsigned int)v65)
                {
                    v50->field_30 = v64;
                    v50->field_38 = v63;
                    v201 = 6;
                    goto LABEL_c4ec80;
                }
                v56 |= (v65 & 127) << ((char)v57 & 63);
                if (!(v65 >> 7 & 1))
                    break;
                v64 += 1;
                v57 += 7;
                v63 -= 1;
                v66 = arm64g_calculate_condition(18, v63, 1, 0);
                if (!(v66 & 1))
                {
                    v56 = &v54[v55];
                    v50->field_30 = v56;
                    v50->field_38 = 0;
                    v201 = 19;
                    goto LABEL_c4ec80;
                }
            }
            v50->field_30 = v64;
            v50->field_38 = v63;
            if (v56)
                break;
            v50->field_50 = v53 - 1;
        }
        v67 = v50->field_48;
        v68 = v56 - 1;
        if (v67->field_10 > v68)
        {
            v69 = v67->field_8 + 112 * v68;
            if (v69[1].padding_0[0] == 1)
                goto LABEL_c4db84;
        }
        else
        {
            v70 = v67->field_18;
            if (v67->field_18)
            {
                v71 = v67->field_20;
            }
            else
            {
LABEL_c4ed10:
                v201 = 18;
LABEL_c4ec80:
                *(char *)a0 = v201;
                memset(a0 + 1, 0, 7);
                *(unsigned long long *)&a0[8] = v56;
                break;
            }
            while (1)
            {
                v72 = v70 + 1240;
                v73 = *(short *)&v70[1330];
                v74 = v73 * 8;
                v75 = 0xffffffffffffffff;
                do
                {
                    if (!v74)
                    {
                        v75 = v73;
                        goto LABEL_c4dc1c;
                    }
                    if (*v72 <= v56)
                        v77 = v56 > *v72;
                    else
                        v77 = 0xff;
                    v75 += 1;
                    v74 -= 8;
                    i = v77;
                    v72 += 1;
                } while (i == 1);
                if (!i)
                    break;
LABEL_c4dc1c:
                if (!v71)
                    goto LABEL_c4ed10;
                v70 = *(long long *)&v70[1336 + 8 * v75];
                v71 -= 1;
            }
            v69 = &v70[112 * v75];
            if (v69[1].padding_0[0] == 1)
            {
LABEL_c4db84:
                v50->field_50 = v53 + 1;
            }
        }
        switch (v79)
        {
        case 46:
            if (*(long long *)&v69->padding_0[0] == 1)
            {
                v174 = v51;
                v175 = v52;
                v176 = a0;
            }
            else if (6 > (unsigned long long)*(long long *)&v69->padding_0[8])
            {
                v174 = v51;
                v175 = v52;
                v176 = a0;
            }
            else
            {
                sub_c73bb0(0, *(long long *)&v69->padding_0[8], 5, &g_efbab8);
                sub_c73bb0(0, v58, 5, &g_efbab8);
            }
            v177 = v50;
            sub_c50e7c(&v37, &v50->field_30, (unsigned long long)v58->field_48);
            v178 = *(char *)&v37;
            if (v178 == 82)
            {
                v50 = v177;
                v179 = v177->field_50;
                a0 = v176;
                v52 = v175;
                v51 = v174;
                if (v179 > v53)
                {
                    do
                    {
                        v180 = v50->field_30;
                        v181 = v50->field_38;
                        if (!v181)
                        {
                            v202 = 0;
                            v203 = 0;
                            v178 = 19;
                            v182 = v180;
                            goto LABEL_c4ecf4;
                        }
                        v182 = 0;
                        v183 = 0;
                        v184 = v181 - 1;
                        v185 = v180 + 1;
                        while (1)
                        {
                            v186 = *(v185 - 1);
                            if (v183 == 63 && 1 < (unsigned int)v186)
                            {
                                v202 = 0;
                                v203 = 0;
                                v50->field_30 = v185;
                                v50->field_38 = v184;
                                v178 = 6;
                                goto LABEL_c4ecf4;
                            }
                            v182 |= (v186 & 127) << ((char)v183 & 63);
                            if (!(v186 >> 7 & 1))
                                break;
                            v185 += 1;
                            v183 += 7;
                            v184 -= 1;
                            v187 = arm64g_calculate_condition(18, v184, 1, 0);
                            if (!(v187 & 1))
                            {
                                v202 = 0;
                                v203 = 0;
                                v182 = &v180[v181];
                                v50->field_30 = v182;
                                v50->field_38 = 0;
                                v178 = 19;
                                goto LABEL_c4ecf4;
                            }
                        }
                        v50->field_30 = v185;
                        v50->field_38 = v184;
                        if (!v182)
                        {
                            v179 -= 1;
                            v50->field_50 = v179;
                            goto LABEL_c4de40;
                        }
                        v188 = v50->field_48;
                        v189 = v182 - 1;
                        if (v188->field_10 > v189)
                        {
                            v190 = v188->field_8 + 112 * v189;
                        }
                        else
                        {
                            v191 = v188->field_18;
                            if (v188->field_18)
                            {
                                v192 = v188->field_20;
                            }
                            else
                            {
LABEL_c4ed54:
                                v202 = 0;
                                v203 = 0;
                                v178 = 18;
                                goto LABEL_c4ecf4;
                            }
                            while (1)
                            {
                                v193 = v191 + 1240;
                                v194 = *(short *)&v191[1330];
                                v195 = v194 * 8;
                                v196 = 0xffffffffffffffff;
                                do
                                {
                                    if (!v195)
                                    {
                                        v196 = v194;
                                        goto LABEL_c4dda8;
                                    }
                                    if (*v193 <= v182)
                                        v198 = v182 > *v193;
                                    else
                                        v198 = 0xff;
                                    v196 += 1;
                                    v195 -= 8;
                                    v199 = v198;
                                    v193 += 1;
                                } while (v199 == 1);
                                if (!v199)
                                    break;
LABEL_c4dda8:
                                if (!v192)
                                    goto LABEL_c4ed54;
                                v191 = *(long long *)&v191[1336 + 8 * v196];
                                v192 -= 1;
                            }
                            v190 = &v191[112 * v196];
                        }
                        v176 = a0;
                        if (v190[1].padding_0[0] == 1)
                            v50->field_50 = v179 + 1;
                        v200 = sub_c1453c(v190);
                        sub_c50e7c(&v37, &v50->field_30, v50->field_40->field_48, v200, v50);
                        v178 = *(char *)&v37;
                        if (v178 != 82)
                            goto LABEL_c4ed18;
                        v50 = v177;
                        v179 = v177->field_50;
                        a0 = v176;
LABEL_c4de40:
                    } while (v53 < v179);
                }
            }
            else
            {
LABEL_c4ed18:
                v203 = *(char *)((void*)&v37 + 1);
                v202 = *(unsigned int *)((void*)&v37 + 2) | *(unsigned short *)((void*)&v37 + 6) * 0x100000000;
                v182 = *(unsigned long long *)((void*)&v37 + 8);
                a0 = v176;
LABEL_c4ecf4:
                *(char *)a0 = v178;
                *(char *)&a0[1] = v203;
                *(unsigned int *)&a0[2] = v202;
                *(unsigned short *)&a0[6] = v202 >> 32;
                *(unsigned long long *)&a0[8] = v182;
                break;
            }
        case 29:
            if (v61 == 8)
                v84 = 12;
            else
                v84 = 4;
            v13 = v84;
            v23 = v50->field_58;
            v24 = v50->field_60;
            v85 = v32;
            if (*(long long *)&v69->padding_0[0] == 1)
            {
                v86 = v69->field_10;
                v58 = v69->field_18;
                v87 = v31;
            }
            else
            {
                v58 = *(long long *)&v69->padding_0[8];
                v87 = v31;
                if (6 <= v58)
                    sub_c73bb0(0, v58, 5, &g_efbab8);
                v86 = &v69->field_10;
            }
            v16 = v51;
            v17 = a0;
            v26 = v50;
            v27 = v52;
            if (v58)
            {
                v25 = 0;
                v19 = 0;
                v20 = 0;
                v14 = 0;
                v15 = 0;
                v18 = 0;
                v11 = 0;
                v88 = v58 * 16;
                v8 = v7;
                v22 = v21;
                v4 = v3;
                v10 = v9;
                v6 = v5;
            }
            else
            {
                v14 = 0;
                v15 = 0;
                v11 = 0;
                v18 = 0;
                v19 = 0;
                v20 = 0;
                v25 = 0;
                v8 = v7;
                v22 = v21;
                v4 = v3;
                v10 = v9;
LABEL_c4e8b8:
                v31 = v87;
                v32 = v85;
                v146 = v50->field_10;
                if (v146 == v50->field_0)
                {
                    sub_c6c2f4(v50);
                    v87 = v31;
                    v50 = v26;
                    v52 = v27;
                }
                v147 = v50->field_8 + 48 * v146;
                v147->field_0 = v15;
                v147->field_8 = v8;
                v147->field_10 = &v54[v60 + v13 + -1 * v62 + -1 * v59];
                v147->field_18 = v25;
                v147->field_20 = v22;
                v147->field_28 = v19;
                v147->field_2c = v20;
                v50->field_10 = v146 + 1;
                v148 = v146;
                if (!(v18 & 1))
                {
                    v167 = *(unsigned int *)((void*)&v14 + 4);
                    if (v167 & 1 & (unsigned int)v14 & 1)
                    {
                        if (v87 > v30)
                        {
                            v168 = v50->field_28;
                            v169 = v31;
                            if (v168 == v50->field_18)
                            {
                                sub_c737b0(&v50->field_18);
                                v169 = v31;
                            }
                            v170 = v50->field_20 + v168 * 32;
                            v170->field_0 = v30;
                            v170->field_8 = v169;
                            v170->field_10 = v52;
                            v170->field_18 = v148;
                            v50->field_28 = v168 + 1;
                            goto LABEL_c4eb04;
                        }
                    }
                    else
                    {
                        if (v167 & 1 & v11 & 1)
                        {
                            v171 = v4 + v30;
                            if (v171 > v30)
                            {
                                v172 = v50->field_28;
                                if (v172 == v50->field_18)
                                    sub_c737b0(&v50->field_18);
                                v173 = v50->field_20 + v172 * 32;
                                v173->field_0 = v30;
                                v173->field_8 = v171;
                                v173->field_10 = v52;
                                v173->field_18 = v148;
                                v50->field_28 = v172 + 1;
                                goto LABEL_c4eb04;
                            }
                        }
                    }
                }
                v149 = v23;
                v150 = v24;
                v151 = &v149->field_d0;
                v152 = (unsigned int)((int)v150[72]) >> 16;
                v153 = v152;
                if (4 < v152)
                {
                    v154 = 16;
                    v155 = arm64g_calculate_condition(131, v153, 4, 0);
                    if (!(v155 & 1))
                        goto LABEL_c4e93e;
                }
                else
                {
                    v154 = 0;
                    v156 = arm64g_calculate_condition(131, v153, 4, 0);
                    if (!(v156 & 1))
                    {
LABEL_c4e93e:
                        v157 = 8;
LABEL_c4e940:
                        v158 = *(long long *)((char *)v151 + v154);
                        v159 = v10;
                        if (v159 > (unsigned long long)*(long long *)((char *)v151 + v157))
                        {
                            v160 = 0;
                            v161 = 0;
                            v162 = 19;
                            v51 = v16;
                        }
                        else
                        {
                            v38 = _INSERT(v37, 0, v149->field_10);
                            v39 = v149->field_18;
                            v40 = (long long)v150[408];
                            v41 = (long long)v150[424];
                            v42 = v158 + v159;
                            v43 = *(long long *)((char *)v151 + v157) - (char *)v159;
                            v44 = (int)v150[72];
                            v45 = v152 > 4;
                            while (1)
                            {
                                sub_c51370(&v46, &v38);
                                if (!(unsigned long long)v46)
                                {
LABEL_c4eb04:
                                    sub_c4da9c(&v33);
LABEL_c4eb14:
                                    v51 = v16;
                                    a0 = v17;
                                    goto LABEL_c4eb18;
                                }
                                v162 = *(unsigned long long *)((void*)&v46 + 8);
                                v158 = v47;
                                if ((unsigned long long)v46 == 2)
                                    break;
                                if (v158 > v162)
                                {
                                    v163 = v26;
                                    v164 = v163->field_28;
                                    v165 = v27;
                                    if (v164 == v163->field_18)
                                    {
                                        sub_c737b0(&v163->field_18);
                                        v163 = v26;
                                        v165 = v27;
                                    }
                                    v166 = v163->field_20 + v164 * 32;
                                    *v166 = v162;
                                    v166[1] = v158;
                                    v166[2] = v165;
                                    v166[3] = v148;
                                    v163->field_28 = v164 + 1;
                                }
                            }
                            if (((unsigned int)v162 & 0xff) == 82)
                                goto LABEL_c4eb04;
                            v161 = (char)(v162 >> 8);
                            v160 = v162 >> 16;
                            v51 = v16;
                        }
                        *(char *)&v33 = v162;
                        *(unsigned long long *)((char *)&v33 + 1) = v161;
                        *(unsigned int *)((char *)&v33 + 2) = v160;
                        *(unsigned short *)((char *)&v33 + 6) = v160 >> 32;
                        *(st_c4da9c_0 **)((char *)&v33 + 8) = v158;
                        a0 = v17;
                        goto LABEL_c4eb2c;
                    }
                }
                v157 = 24;
                goto LABEL_c4e940;
            }
            while (1)
            {
                v28 = v86;
                v29 = v88;
                v31 = v87;
                v32 = v85;
                v46 = *v86;
                sub_c4cbcc(&v37, &v50->field_30, v50->field_40->field_48, &v46);
                v89 = *(unsigned long long *)&v37;
                if (v89 == 46)
                {
                    v33 = *(uint128_t *)((void*)&v37 + 8);
                    goto LABEL_c4eb14;
                }
                v90 = (unsigned short)v41;
                if (v90 <= 84)
                    break;
                if (88 < v90)
                {
                    v50 = v26;
                    v52 = v27;
                    v87 = v31;
                    v85 = v32;
                    switch (v90)
                    {
                    case 89:
                        v19 = 0;
                        if (4 >= (long long)v89)
                        {
                            if (v89 == 2)
                            {
                                v19 = *(char *)((void*)&v37 + 8);
                                v91 = v30;
                                break;
                            }
                            else if (v89 != 3)
                            {
                                v91 = v30;
                                if (v89 == 4)
                                {
                                    v19 = *(unsigned int *)((void*)&v37 + 8);
                                    v91 = v30;
                                    break;
                                }
                            }
                            else
                            {
                                v19 = *(unsigned short *)((void*)&v37 + 8);
                                v91 = v30;
                                break;
                            }
                        }
                        if (v89 == 5)
                        {
LABEL_c4e454:
                            v106 = *(unsigned long long *)((void*)&v37 + 8);
                            goto LABEL_c4e5f8;
                        }
                        else if (v89 != 6)
                        {
                            v91 = v30;
                            if (v89 != 7)
                                break;
                            goto LABEL_c4e454;
                        }
                        else
                        {
                            v106 = *(unsigned long long *)((void*)&v37 + 8);
                            if ((long long)v106 >= 0)
                            {
LABEL_c4e5f8:
                                v19 = v106;
                                v91 = v30;
                                break;
                            }
                            else
                            {
                                v19 = 0;
                                v91 = v30;
                                break;
                            }
                        }
                    case 110: case 8199:
                        sub_c4eda0(&v46, &v37);
                        sub_c4b058(&v34, v23, (char)v24[73], (long long)v24[416], &v46);
                        v50 = v26;
                        v52 = v27;
                        v104 = (unsigned int)v34;
                        if (!v104)
                            v22 = v36;
                        v87 = v31;
                        v85 = v32;
                        v105 = arm64g_calculate_condition(19, v104, 0, 0);
                        if (!(v105 & 1))
                            v25 = v35;
                        goto LABEL_c4df84;
                    default:
LABEL_c4df84:
                        v91 = v30;
                        break;
                    }
                    goto LABEL_c4df88;
                }
                switch (v90)
                {
                case 85:
                    sub_c4eda0(&v46, &v37);
                    v93 = *(unsigned long long *)((void*)&v46 + 8);
                    if ((unsigned long long)v46 != 24)
                    {
                        v50 = v26;
                        v52 = v27;
                        if ((unsigned long long)v46 == 22)
                        {
                            if (v23->field_110 & 5 > (short)v24[74])
                                v94 = (long long)v24[440];
                            else
                                v94 = 0;
                            v95 = v94 + v93;
                            v18 = 1;
                            v91 = v30;
                            v87 = v31;
                        }
                        else
                        {
                            v18 = 0;
                            v91 = v30;
                            v87 = v31;
                            v95 = v12;
                        }
                        v85 = v32;
                    }
                    else
                    {
                        v96 = v24;
                        v97 = (long long)v96[440];
                        v98 = v23->field_e0;
                        v99 = v23->field_e8 - v97;
                        v50 = v26;
                        v52 = v27;
                        if (v23->field_e8 >= v97 && !(v100 = (int)v96[72], v98 = (char *)v23->field_e0 + v97, v101 = ((v100 * 0x100000000000000 | v100 >> 8) & 0xff000000000000ff & 0xff) * v93, v102 = v99 - v101, v99 < v101))
                        {
                            v12 = (char *)v98 + v101;
                            if (((unsigned int)v100 & 0xff00) == 0x800)
                            {
                                if (v102 <= 7)
                                    goto LABEL_c4eb80;
                                v103 = v12->field_7 * 0x100000000000000 | (v12->field_0 * 0x100 | (v12->field_4 | v12->field_6 * 0x10000) * 0x10000000000) >> 8;
                                v87 = v31;
                            }
                            else
                            {
                                if (v102 <= 3)
                                    goto LABEL_c4eb80;
                                v103 = v12->field_0;
                                v87 = v31;
                            }
                            v95 = v103 + v97;
                            v18 = 1;
                            v91 = v30;
                            v85 = v32;
                        }
                        else
                        {
                            v12 = v98;
LABEL_c4eb80:
                            v33 = CONCAT(v12, 19);
                            v51 = v16;
                            a0 = v17;
                            goto LABEL_c4eb2c;
                        }
                    }
                    v12 = v95;
                    v10 = v95;
                    goto LABEL_c4df88;
                case 87:
                    v20 = 0;
                    if (4 >= (long long)v89)
                    {
                        if (v89 == 2)
                        {
                            v20 = *(char *)((void*)&v37 + 8);
                            v50 = v26;
                            v85 = v32;
                            v91 = v30;
                            v87 = v31;
                            v52 = v27;
                            goto LABEL_c4df88;
                        }
                        else if (v89 != 3)
                        {
                            v50 = v26;
                            v85 = v32;
                            v91 = v30;
                            v87 = v31;
                            v52 = v27;
                            if (v89 == 4)
                            {
                                v20 = *(unsigned int *)((void*)&v37 + 8);
                                v50 = v26;
                                v85 = v32;
                                v91 = v30;
                                v87 = v31;
                                v52 = v27;
                                goto LABEL_c4df88;
                            }
                        }
                        else
                        {
                            v20 = *(unsigned short *)((void*)&v37 + 8);
                            v50 = v26;
                            v85 = v32;
                            v91 = v30;
                            v87 = v31;
                            v52 = v27;
                            goto LABEL_c4df88;
                        }
                    }
                    if (v89 == 5)
                    {
LABEL_c4e430:
                        v92 = *(unsigned long long *)((void*)&v37 + 8);
                        goto LABEL_c4e5dc;
                    }
                    else if (v89 != 6)
                    {
                        v50 = v26;
                        v85 = v32;
                        v91 = v30;
                        v87 = v31;
                        v52 = v27;
                        if (v89 != 7)
                            goto LABEL_c4df88;
                        goto LABEL_c4e430;
                    }
                    else
                    {
                        v92 = *(unsigned long long *)((void*)&v37 + 8);
                        if ((long long)v92 >= 0)
                        {
LABEL_c4e5dc:
                            v20 = v92;
                            v50 = v26;
                            v85 = v32;
                            v91 = v30;
                            v87 = v31;
                            v52 = v27;
                            goto LABEL_c4df88;
                        }
                        else
                        {
                            v20 = 0;
                            v50 = v26;
                            v85 = v32;
                            v91 = v30;
                            v87 = v31;
                            v52 = v27;
LABEL_c4df88:
                            v30 = v91;
                            v86 = v28 + 1;
                            v88 = v29 - 16;
                            if (v29 == 16)
                                goto LABEL_c4e8b8;
                            break;
                        }
                    }
                case 88:
                    sub_c4eda0(&v46, &v37);
                    if ((unsigned long long)v46 == 44)
                    {
                        v91 = v30;
                        if (!*(unsigned long long *)((void*)&v46 + 8))
                        {
                            v91 = v30;
                            v50 = v26;
                            v85 = v32;
                            v87 = v31;
                            v52 = v27;
                            if ((unsigned short)(short)v24[74] < 5)
                                goto LABEL_c4df88;
                        }
                        v8 = *(unsigned long long *)((void*)&v46 + 8);
                        v15 = 1;
                        v50 = v26;
                        v85 = v32;
                        v87 = v31;
                        v52 = v27;
                        goto LABEL_c4df88;
                    }
                    goto LABEL_c4e3dc;
                default:
                    v50 = v26;
                    v52 = v27;
LABEL_c4e3e8:
                    v91 = v30;
                    goto LABEL_c4e3f8;
                }
            }
            switch (v90)
            {
            case 18:
                v50 = v26;
                sub_c4eda0(&v46, &v37);
                switch (v108)
                {
                case 0:
                    *(unsigned int *)&v14 = 1;
                    v87 = *(unsigned long long *)((void*)&v46 + 8);
                    v50 = v26;
                    v52 = v27;
                    v91 = v30;
                    v85 = v32;
                    break;
                case 7:
                    v50 = v26;
                    v52 = v27;
                    v11 = 1;
                    v4 = *(unsigned long long *)((void*)&v46 + 8);
                    v87 = v31;
                    v85 = v32;
                    v91 = v30;
                    break;
                case 12:
                    v109 = v23;
                    v110 = v24;
                    v111 = (long long)v110[424];
                    v112 = v23->field_10;
                    v113 = v109->field_18 - v111;
                    if (v109->field_18 < v111 || (v114 = (char)v110[72], v112 = v109->field_10 + v111, v115 = v114 * *(unsigned long long *)((void*)&v46 + 8), v116 = v113 - v115, v115 > v113))
                    {
                        v122 = v1 & 0xffffffffffffff00 | (v1 & 0xffffffffffffff00 | 19) & 0xff;
                        v87 = v112;
                        goto LABEL_c4e314;
                    }
                    if ((((unsigned int)v114 ^ (unsigned int)v114 - 1 & 0xff) & 0xff) <= ((unsigned int)v114 - 1 & 0xff))
                    {
LABEL_c4e7f4:
                        v87 = v0;
                        v122 = v1 & 0xffffffffffff0000 | v114 * 0x100 | 25;
                        goto LABEL_c4e314;
                    }
                    v117 = v112 + v115;
                    v118 = ((v114 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v114 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc;
                    v119 = (((v114 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v114 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2;
                    v120 = ((((((((v119 | v118) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v119 | v118) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v119 | v118) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v119 | v118) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((((v119 | v118) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v119 | v118) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v119 | v118) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v119 | v118) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    if (!(v120 * 0x100000000))
                        v121 = 32;
                    else
                        v121 = (unsigned int)Clz(v120 * 0x100000000);
                    if (1 >= v121)
                    {
                        if (v121)
                        {
                            v50 = v26;
                            v52 = v27;
                            if (v121 != 1)
                                goto LABEL_c4e7f4;
                            if (v116 <= 1)
                                goto LABEL_c4ec14;
                            v87 = *(short *)v117;
                            goto LABEL_c4e7cc;
                        }
                        else
                        {
                            if (v113 == v115)
                                goto LABEL_c4ec14;
                            v87 = *(char *)v117;
                            goto LABEL_c4e874;
                        }
                    }
                    if (v121 != 2)
                    {
                        v50 = v26;
                        v52 = v27;
                        if (v121 != 3)
                            goto LABEL_c4e7f4;
                        if (v116 <= 7)
                            goto LABEL_c4ec14;
                        v87 = (char)v117[7] * 0x100000000000000 | (*(int *)v117 * 0x100 | ((short)v117[4] | (char)v117[6] * 0x10000) * 0x10000000000) >> 8;
LABEL_c4e7cc:
                        v122 = v1 & 0xffffffffffffff00 | (v1 & 0xffffffffffffff00 | 82) & 0xff;
                        v50 = v26;
                        v52 = v27;
                        goto LABEL_c4e314;
                    }
                    if (v116 > 3)
                    {
                        v87 = *(int *)v117;
LABEL_c4e874:
                        v122 = v1 & 0xffffffffffffff00 | (v1 & 0xffffffffffffff00 | 82) & 0xff;
                        v50 = v26;
                        v52 = v27;
LABEL_c4e314:
                        v0 = v87;
                        v1 = v122;
                        v91 = v30;
                        v85 = v32;
                        if ((char)v122 == 82)
                        {
                            *(unsigned int *)&v14 = 1;
                            break;
                        }
                        goto LABEL_c4ec1c;
                    }
LABEL_c4ec14:
                    v0 = v117;
                    v1 = 19;
LABEL_c4ec1c:
                    v145 = v1;
                    *(char *)&v33 = v145;
                    *((char *)&v33 + 7) = v145 >> 56;
                    *(unsigned short *)((char *)&v33 + 5) = v145 >> 40;
                    *(unsigned int *)((char *)&v33 + 1) = v145 >> 8;
                    v144 = v0;
LABEL_c4ec40:
                    *(void* *)((char *)&v33 + 8) = v144;
                    v51 = v16;
                    a0 = v17;
LABEL_c4eb2c:
                    if (*(char *)&v33 == 82)
                    {
                        v50 = v26;
                        v52 = v27;
                        continue;
                    }
                    else
                    {
                        v204 = v33;
                        *(uint128_t *)a0 = v204;
                        break;
                    }
                default:
                    v87 = v31;
                    v85 = v32;
                    v91 = v30;
                    break;
                }
                break;
            case 3:
                v50 = v26;
                v52 = v27;
                v87 = v31;
                v85 = v32;
                v91 = v30;
                if (v25)
                    break;
                sub_c4eda0(&v46, &v37);
                sub_c4b058(&v34, v23, (char)v24[73], (long long)v24[416], &v46);
                v50 = v26;
                v52 = v27;
                v137 = (unsigned int)v34;
                v138 = v137;
                if (v137)
                {
                    v139 = v6;
                    v87 = v31;
                    v85 = v32;
                    v140 = arm64g_calculate_condition(19, v138, 0, 0);
                    if (!(v140 & 1))
                        goto LABEL_c4e23a;
                }
                else
                {
                    v139 = v36;
                    v87 = v31;
                    v85 = v32;
                    v141 = arm64g_calculate_condition(19, v138, 0, 0);
                    if (!(v141 & 1))
                    {
LABEL_c4e23a:
                        v142 = v35;
LABEL_c4e23c:
                        v25 = v142;
                        v91 = v30;
                        v6 = v139;
                        v22 = v139;
                        break;
                    }
                }
                v142 = 0;
                goto LABEL_c4e23c;
            case 17:
                sub_c4eda0(&v46, &v37);
                if (!(unsigned long long)v46)
                {
                    *(unsigned int *)((char *)&v14 + 4) = 1;
                    v91 = *(unsigned long long *)((void*)&v46 + 8);
                    v50 = v26;
                    v52 = v27;
LABEL_c4e3f8:
                    v87 = v31;
                    v85 = v32;
                    break;
                }
                if ((unsigned long long)v46 != 12)
                {
LABEL_c4e3dc:
                    v50 = v26;
                    v52 = v27;
LABEL_c4e3e0:
                    goto LABEL_c4e3e8;
                }
                v123 = v23;
                v124 = v24;
                v125 = (long long)v124[424];
                v126 = v23->field_10;
                v127 = v123->field_18 - v125;
                v50 = v26;
                v52 = v27;
                if (v123->field_18 < v125 || (v128 = (char)v124[72], v126 = v123->field_10 + v125, v129 = v128 * *(unsigned long long *)((void*)&v46 + 8), v130 = v127 - v129, v129 > v127))
                {
                    v136 = v2 & 0xffffffffffffff00 | (v2 & 0xffffffffffffff00 | 19) & 0xff;
                    v85 = v126;
                    goto LABEL_c4e1b4;
                }
                if ((((unsigned int)v128 ^ (unsigned int)v128 - 1 & 0xff) & 0xff) <= ((unsigned int)v128 - 1 & 0xff))
                {
LABEL_c4e758:
                    v136 = v2 & 0xffffffffffff0000 | v128 * 0x100 | 25;
                    v85 = v32;
                    goto LABEL_c4e1b4;
                }
                v131 = v126 + v129;
                v132 = ((v128 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v128 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc;
                v133 = (((v128 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v128 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2;
                v134 = ((((((((v133 | v132) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v133 | v132) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v133 | v132) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v133 | v132) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((((v133 | v132) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v133 | v132) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v133 | v132) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v133 | v132) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                if (!(v134 * 0x100000000))
                    v135 = 32;
                else
                    v135 = (unsigned int)Clz(v134 * 0x100000000);
                if (1 >= v135)
                {
                    if (v135)
                    {
                        v50 = v26;
                        v52 = v27;
                        if (v135 != 1)
                            goto LABEL_c4e758;
                        if (v130 <= 1)
                            goto LABEL_c4ec04;
                        v85 = *(short *)v131;
                    }
                    else
                    {
                        if (v127 == v129)
                            goto LABEL_c4ec04;
                        v85 = *(char *)v131;
                        goto LABEL_c4e828;
                    }
                }
                else
                {
                    if (v135 != 2)
                    {
                        v50 = v26;
                        v52 = v27;
                        if (v135 != 3)
                            goto LABEL_c4e758;
                        if (v130 <= 7)
                            goto LABEL_c4ec04;
                        v85 = (char)v131[7] * 0x100000000000000 | (*(int *)v131 * 0x100 | ((short)v131[4] | (char)v131[6] * 0x10000) * 0x10000000000) >> 8;
                    }
                    else
                    {
                        if (v130 > 3)
                        {
                            v85 = *(int *)v131;
                        }
                        else
                        {
LABEL_c4ec04:
                            v2 = 19;
                            v32 = v131;
LABEL_c4eb94:
                            v143 = v2;
                            *(char *)&v33 = v143;
                            *((char *)&v33 + 7) = v143 >> 56;
                            *(unsigned short *)((char *)&v33 + 5) = v143 >> 40;
                            *(unsigned int *)((char *)&v33 + 1) = v143 >> 8;
                            v144 = v32;
                            goto LABEL_c4ec40;
                        }
LABEL_c4e828:
                        v136 = v2 & 0xffffffffffffff00 | (v2 & 0xffffffffffffff00 | 82) & 0xff;
                        v50 = v26;
                        v52 = v27;
LABEL_c4e1b4:
                        v2 = v136;
                        v87 = v31;
                        if ((char)v136 == 82)
                        {
                            *(unsigned int *)((char *)&v14 + 4) = 1;
                            v91 = v85;
                            break;
                        }
                        else
                        {
                            v32 = v85;
                            goto LABEL_c4eb94;
                        }
                        goto LABEL_c4eb94;
                    }
                }
                v136 = v2 & 0xffffffffffffff00 | (v2 & 0xffffffffffffff00 | 82) & 0xff;
                v50 = v26;
                v52 = v27;
                goto LABEL_c4e1b4;
            case 71:
                v85 = v32;
                v87 = v31;
                v52 = v27;
            case 49:
                v85 = v32;
                v87 = v31;
                v52 = v27;
                if (v25)
                    goto LABEL_c4df84;
                sub_c4eda0(&v46, &v37);
                sub_c4f5a8(&v34, v46, *(unsigned long long *)((void*)&v46 + 8), v50->field_70, v23, v24, v50->field_68, 16);
                v25 = v35;
                v107 = v36;
                if (v34 != 1)
                {
                    v22 = v107;
                    v50 = v26;
                    v52 = v27;
                    goto LABEL_c4e3e0;
                }
                else
                {
                    v33 = CONCAT(v107, v25);
                    v51 = v16;
                    a0 = v17;
LABEL_c4eb18:
                    goto LABEL_c4eb2c;
                }
            default:
LABEL_c4df84:
                v91 = v30;
                break;
            }
            goto LABEL_c4df88;
        default:
            if (*(long long *)&v69->padding_0[0] == 1)
            {
                v80 = v51;
                v81 = v52;
                v82 = a0;
            }
            else if (6 > (unsigned long long)*(long long *)&v69->padding_0[8])
            {
                v80 = v51;
                v81 = v52;
                v82 = a0;
            }
            else
            {
                sub_c73bb0(0, *(long long *)&v69->padding_0[8], 5, &g_efbab8);
                sub_c73bb0(0, v58, 5, &g_efbab8);
            }
            sub_c50e7c(&v37, &v50->field_30, (unsigned long long)v58->field_48);
            if (*(char *)&v37 == 82)
            {
                a0 = v82;
                v52 = v81;
                v51 = v80;
                continue;
            }
            else
            {
                v204 = *(uint128_t *)&v37;
                *(uint128_t *)v82 = v204;
                break;
            }
        }
        break;
    }
    return *(unsigned long long *)&v204;
}
