/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc55010..0xc56aa8 (6808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c55010_2 {
    unsigned long long field_0;
    struct st_c55010_1 *field_8;
} st_c55010_2;

typedef struct st_c55010_0 {
    struct st_c55010_1 *field_0;
    unsigned long long field_8;
    char padding_10[232];
    void* field_f8;
} st_c55010_0;

typedef struct st_c55010_5 {
    char field_0;
    char field_1;
    unsigned int field_2;
    unsigned short field_6;
    struct st_c55010_1 *field_8;
    char padding_10[184];
    unsigned long long field_c8;
    char padding_d0[82];
    unsigned short field_122;
} st_c55010_5;

typedef struct st_c55010_6 {
    char field_0[2];
    char field_1;
    char field_2;
    char field_3;
} st_c55010_6;

typedef struct st_c55010_3 {
    unsigned int field_0;
    unsigned short field_4;
    char field_5;
    char field_6;
    char field_7;
} st_c55010_3;

typedef struct st_c55010_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
} st_c55010_4;

typedef struct st_c55010_1 {
    char field_0;
} st_c55010_1;


void* sub_c55010(void* a0, st_c55010_0 *a1, void* a2)
{
    unsigned long long idx;  // x20
    void* v147;  // x19
    unsigned long long v156;  // x15
    unsigned long long v246;  // x1
    unsigned long long iter;  // x22
    unsigned long v248;  // x27
    unsigned long v249;  // x28
    unsigned long long v250;  // x24
    unsigned long long v251;  // x21
    unsigned long long v252;  // w8
    unsigned long long v253;  // 4112
    unsigned long long v254;  // x27
    unsigned long v255;  // x9
    unsigned long long v157;  // x12
    unsigned long long v256;  // x26
    unsigned long long v257;  // x21
    unsigned long long v258;  // x9
    unsigned long long v259;  // x11
    unsigned long long v260;  // x8
    unsigned int v261;  // w15
    unsigned long long v262;  // x10
    st_c55010_3 *v263;  // x8
    unsigned long long v264;  // x9
    st_c55010_6 *v265;  // x8
    unsigned long long *v158;  // x13
    unsigned long long v266;  // 4132
    unsigned long long v267;  // 4112
    unsigned long long v268;  // x13
    unsigned long long v269;  // w16
    st_c55010_6 *v270;  // x22
    unsigned long long v271;  // x12
    unsigned long long v272;  // 4129
    unsigned long long v273;  // x10
    unsigned long long v274;  // 4112
    unsigned long long v275;  // x8
    char v159;  // x16
    unsigned long long v276;  // x24
    unsigned long long v277;  // x10
    unsigned long long v278;  // x9
    unsigned long long v279;  // x8
    unsigned long long v280;  // w17
    st_c55010_6 *v281;  // x22
    unsigned long long v282;  // x10
    unsigned long long v283;  // x10
    unsigned long long v284;  // x11
    unsigned long long v285;  // x23
    unsigned int k;  // w16
    unsigned long long v286;  // x9
    unsigned long long v287;  // x8
    unsigned long long v288;  // x28
    unsigned long long *v289;  // x9
    unsigned long long v290;  // x23
    unsigned long long v291;  // x25
    unsigned long long v292;  // x28
    unsigned long long *v293;  // x8
    unsigned long long v294;  // x23
    unsigned long long v295;  // x8
    st_c55010_5 *v161;  // x8
    unsigned long long v296;  // x25
    unsigned long long v297;  // x9
    unsigned long long v298;  // x3
    unsigned long long v299;  // x28
    st_c55010_4 *v300;  // x8
    unsigned long long v301;  // x21
    unsigned long long v302;  // x25
    unsigned long long v303;  // x28
    unsigned long long v304;  // x10
    st_c55010_4 *v305;  // x8
    unsigned long long v162;  // w25
    unsigned long long v306;  // x24
    unsigned short *v307;  // x8
    unsigned long long v308;  // x9
    unsigned long long v309;  // x10
    unsigned long long v310;  // x12
    unsigned long long v311;  // x13
    unsigned long long v312;  // x11
    unsigned long long v313;  // 4124
    unsigned long long v314;  // 4126
    unsigned int v315;  // w10
    unsigned long long v163;  // x27
    unsigned long long v316;  // w14
    unsigned long long v317;  // x10
    unsigned long v318;  // x8
    unsigned long long v319;  // 4102
    unsigned long long v164;  // x24
    char *v165;  // x26
    unsigned long long v148;  // x23
    unsigned long long v166;  // 4131
    unsigned long long v167;  // x28
    unsigned long long v168;  // w10
    unsigned long long v169;  // x8
    unsigned long long v170;  // x9
    unsigned long v171;  // x12
    unsigned long long v172;  // x11
    unsigned long long v173;  // x10
    char *v174;  // x11
    unsigned long v175;  // x12
    unsigned long long v149;  // x8
    unsigned int v176;  // w13
    unsigned long v177;  // x12
    unsigned long long v178;  // w12
    unsigned long long v179;  // x8
    char *v180;  // x11
    unsigned long v181;  // cc_op
    unsigned long long v182;  // cc_dep1
    unsigned long long v183;  // cc_dep2
    unsigned long v184;  // cc_ndep
    unsigned long long v185;  // x13
    void* v150;  // x9
    unsigned long long v186;  // x12
    char *v187;  // x10
    unsigned long v188;  // x14
    char *v189;  // x10
    unsigned int v190;  // w24
    unsigned long v191;  // x14
    unsigned long long v192;  // w14
    char *v193;  // x11
    unsigned long v194;  // x9
    unsigned long v195;  // x9
    char *node;  // x22
    unsigned long long v196;  // w8
    unsigned long long v197;  // x25
    unsigned long long v198;  // x12
    unsigned long long v199;  // x19
    st_c55010_2 *v200;  // x8
    unsigned long long v201;  // x0
    unsigned long long ptr;  // x0
    unsigned long long index;  // x8
    uint128_t v204;  // q1
    uint128_t v205;  // q0
    unsigned long long v152;  // x10
    unsigned long long idx1;  // x8
    unsigned long long v207;  // 4102
    st_c55010_2 *v208;  // x8
    char *v209;  // x26
    unsigned long v210;  // x13
    unsigned int v211;  // w11
    unsigned long v212;  // x13
    unsigned long long v213;  // w10
    unsigned long long v214;  // x19
    unsigned long long v215;  // x9
    unsigned long long v153;  // x11
    unsigned long long v216;  // x9
    unsigned long long v217;  // 4110
    unsigned long long v218;  // 4102
    unsigned long long v219;  // 4110
    unsigned long long v220;  // 4102
    unsigned long v221;  // x8
    unsigned long long ptr1;  // x0
    unsigned long long v223;  // x25
    unsigned int v224;  // w10
    unsigned int v225;  // w12
    unsigned long long *v154;  // x13
    unsigned int v226;  // w8
    unsigned long v227;  // cc_dep1
    unsigned long long v228;  // x8
    unsigned long long v229;  // 4107
    unsigned long long v230;  // 4107
    unsigned long long v231;  // x13
    unsigned long long v232;  // x14
    unsigned long v233;  // cc_dep1
    unsigned long long v234;  // x8
    unsigned long long v235;  // 4104
    unsigned long long v155;  // x14
    unsigned long long v236;  // 4104
    unsigned long long v237;  // x10
    unsigned long long *v238;  // x23
    void* v239;  // x0
    unsigned long long v240;  // x8
    unsigned long long v241;  // x9
    unsigned long long i;  // x8
    unsigned long long v243;  // x9
    unsigned long long idx2;  // x11
    uint128_t *v245;  // x10
    unsigned long long v0;  // [bp-0x580]
    unsigned int v1;  // [bp-0x57c]
    unsigned long long v2;  // [bp-0x578]
    unsigned long long v3;  // [bp-0x570]
    unsigned long long v4;  // [bp-0x568]
    unsigned long long v5;  // [bp-0x560]
    unsigned long long v6;  // [bp-0x558]
    unsigned long long v7;  // [bp-0x550]
    unsigned long long j;  // [bp-0x548]
    unsigned long long v9;  // [bp-0x540]
    unsigned long long v10;  // [bp-0x538]
    unsigned long long v11;  // [bp-0x530]
    unsigned long long v12;  // [bp-0x528]
    unsigned long v13;  // [bp-0x520]
    unsigned long long v14;  // [bp-0x518]
    unsigned long long v15;  // [bp-0x510]
    unsigned int v16;  // [bp-0x50c]
    unsigned long long v17;  // [bp-0x508]
    unsigned int v18;  // [bp-0x504]
    unsigned long long v19;  // [bp-0x500]
    unsigned long long v20;  // [bp-0x4fc]
    unsigned long long v21;  // [bp-0x4f8]
    unsigned long long v22;  // [bp-0x4f0]
    unsigned long long *v23;  // [bp-0x4e8]
    unsigned long long v24;  // [bp-0x4e0]
    unsigned long long v25;  // [bp-0x4d8]
    unsigned int v26;  // [bp-0x4d4]
    unsigned long long v27;  // [bp-0x4d0]
    unsigned long long v28;  // [bp-0x4c8]
    unsigned long long v29;  // [bp-0x4c8]
    unsigned int v30;  // [bp-0x4c0], Other Possible Types: unsigned long long
    unsigned long long v31;  // [bp-0x4b8]
    uint128_t v32;  // [bp-0x4b0]
    uint192_t v33;  // [bp-0x4a0]
    unsigned long long v34;  // [bp-0x488]
    uint256_t v35;  // [bp-0x480], Other Possible Types: uint256_t
    uint256_t v36;  // [bp-0x480], Other Possible Types: uint256_t
    uint128_t v37;  // [bp-0x460], Other Possible Types: unsigned long long
    uint128_t v38;  // [bp-0x450]
    unsigned long long v39;  // [bp-0x440]
    uint128_t v40;  // [bp-0x430], Other Possible Types: unsigned long long
    uint128_t v41;  // [bp-0x430]
    uint128_t v42;  // [bp-0x428]
    uint128_t v43;  // [bp-0x420]
    unsigned long long v44;  // [bp-0x418]
    uint128_t v45;  // [bp-0x410]
    uint128_t v46;  // [bp-0x400]
    unsigned long long v47;  // [bp-0x3f0]
    uint128_t v48;  // [bp-0x3e0], Other Possible Types: uint128_t
    uint128_t v49;  // [bp-0x3d0], Other Possible Types: uint128_t *, unsigned long
    unsigned long v50;  // [bp-0x3c8], Other Possible Types: unsigned long long
    unsigned long long *v51;  // [bp-0x3c0], Other Possible Types: unsigned long
    uint128_t v52;  // [bp-0x3c0]
    uint128_t v53;  // [bp-0x3b0]
    unsigned long long v54;  // [bp-0x3a0]
    uint128_t v55;  // [bp-0x390], Other Possible Types: unsigned long
    char v56;  // [bp-0x388]
    unsigned long long v57;  // [bp-0x387]
    unsigned int v58;  // [bp-0x386]
    unsigned short v59;  // [bp-0x382]
    char *v60;  // [bp-0x380], Other Possible Types: uint128_t, unsigned long
    uint128_t v61;  // [bp-0x378], Other Possible Types: unsigned long
    uint128_t v62;  // [bp-0x370], Other Possible Types: uint256_t
    uint128_t v63;  // [bp-0x368]
    uint128_t v64;  // [bp-0x360]
    uint128_t v65;  // [bp-0x358]
    unsigned long long v66;  // [bp-0x350]
    uint128_t v67;  // [bp-0x348], Other Possible Types: unsigned long
    unsigned long long v68;  // [bp-0x340]
    unsigned long v69;  // [bp-0x338], Other Possible Types: unsigned long long
    unsigned long long v70;  // [bp-0x330]
    unsigned long long v71;  // [bp-0x328], Other Possible Types: unsigned short
    char v72;  // [bp-0x326]
    unsigned long long *v73;  // [bp-0x320]
    unsigned long long v74;  // [bp-0x318]
    uint128_t v75;  // [bp-0x310]
    uint128_t v76;  // [bp-0x300]
    unsigned long v77;  // [bp-0x2f0]
    uint128_t v78;  // [bp-0x2e8]
    unsigned long long v79;  // [bp-0x2d8]
    unsigned long long ptr2;  // [bp-0x2d0]
    unsigned long long v81;  // [bp-0x2c8]
    unsigned long long v82;  // [bp-0x2c0]
    long long v83;  // [bp-0x2b8]
    unsigned long long v84;  // [bp-0x2b0]
    unsigned long long v85;  // [bp-0x2a8]
    unsigned long long v86;  // [bp-0x2a0]
    unsigned long long v87;  // [bp-0x298]
    unsigned long long v88;  // [bp-0x290]
    long long v89;  // [bp-0x288]
    unsigned long long v90;  // [bp-0x280]
    unsigned long v91;  // [bp-0x278]
    unsigned long long v92;  // [bp-0x270]
    unsigned long long v93;  // [bp-0x268]
    unsigned long long v94;  // [bp-0x260]
    unsigned long long v95;  // [bp-0x258]
    unsigned long long v96;  // [bp-0x250]
    unsigned long long v97;  // [bp-0x248]
    unsigned long long v98;  // [bp-0x240]
    unsigned long long v99;  // [bp-0x238]
    char v100;  // [bp-0x230]
    char v101;  // [bp-0x22f]
    unsigned short v102;  // [bp-0x22e]
    char v103;  // [bp-0x22c]
    char v104;  // [bp-0x22b]
    char v105;  // [bp-0x22a]
    char v106;  // [bp-0x229]
    char v107;  // [bp-0x228]
    char v108;  // [bp-0x227]
    char *v109;  // [bp-0x220]
    unsigned long long v110;  // [bp-0x218]
    unsigned long long *v111;  // [bp-0x210]
    unsigned long long v112;  // [bp-0x208]
    unsigned long long v113;  // [bp-0x200]
    unsigned long v114;  // [bp-0x1f8], Other Possible Types: unsigned long long
    unsigned long long v115;  // [bp-0x1f0]
    unsigned long long v116;  // [bp-0x1e8]
    unsigned long long v117;  // [bp-0x1e0]
    unsigned long long v118;  // [bp-0x1d8]
    uint128_t v119;  // [bp-0x1d0]
    uint128_t v120;  // [bp-0x1c0]
    unsigned long long v121;  // [bp-0x1b0]
    unsigned long long v122;  // [bp-0x1b0]
    uint704_t v123;  // [bp-0x1a8]
    uint704_t v124;  // [bp-0x1a8]
    uint704_t v125;  // [bp-0x1a8]
    uint128_t v126;  // [bp-0x150], Other Possible Types: uint128_t
    unsigned long v127;  // [bp-0x140]
    uint128_t v128;  // [bp-0x138]
    unsigned long v129;  // [bp-0x128]
    uint128_t v130;  // [bp-0x120]
    uint128_t v131;  // [bp-0x110]
    unsigned long long v132;  // [bp-0x100]
    uint128_t v133;  // [bp-0xf0]
    unsigned long long v134;  // [bp-0xe0]
    uint128_t v135;  // [bp-0xd0]
    unsigned long v136;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long v137;  // [bp-0xb8], Other Possible Types: unsigned long long
    uint128_t v138;  // [bp-0xb0]
    unsigned long long v139;  // [bp-0xa0]
    unsigned long long v140;  // [bp-0x98]
    uint128_t v141;  // [bp-0x88]
    uint128_t v142;  // [bp-0x88]
    unsigned long long v143;  // [bp-0x78]
    char *v144;  // [bp-0x10]
    char v145;  // [bp+0x0]

    v144 = &v145;
    v0 = 0;
    idx = a1;
    v147 = a0;
    v148 = (char)&v140;
    v149 = (long long)a2[64];
    v150 = a1->field_f8;
    node = a1->field_0;
    v152 = a1->field_8;
    if (a1->field_f8)
    {
        v153 = *(long long *)(idx + 0x100);
        while (1)
        {
            v154 = v150 + 184;
            v155 = (short)v150[274];
            v156 = v155 * 8;
            v157 = 0xffffffffffffffff;
            do
            {
                if (!v156)
                    goto LABEL_c550a0;
                v158 = v154 + 1;
                if (*v154 <= v149)
                    v159 = v149 > *v154;
                else
                    v159 = 0xff;
                v157 += 1;
                v156 -= 8;
                k = v159;
                v154 = v158;
            } while (k == 1);
            v155 = v157;
            if (k)
            {
LABEL_c550a0:
                if (!v153)
                    goto LABEL_c550e0;
                v150 = *(long long *)((char *)v150 + 8 * v155 + 280);
                v153 -= 1;
            }
            else
            {
                v161 = v150 + v157 * 16;
                v162 = v161->field_0;
                if (v162 == 82)
                {
                    node = *(long long *)&v161->field_6;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v125 = v124;
                    v122 = v121;
                    v29 = v28;
                    v36 = v35;
                    if ((long long)/* unsupported instruction */ < 0)
                        break;
                    else
                        goto LABEL_c55720;
                }
                else
                {
                    v148 = v161->field_1;
                    v163 = *(int *)&(&v161->field_1)[1] | *(short *)((char *)&v161->field_2 + 2) * 0x100000000;
                    node = *(long long *)&v161->field_6;
                    goto LABEL_c5510c;
                }
            }
        }
        goto LABEL_c550dc;
    }
LABEL_c550e0:
    v164 = v152 - v149;
    if (v149 > v152)
    {
        v162 = 19;
        v125 = v124;
        v122 = v121;
        v29 = v28;
        v36 = v35;
        if (!0)
            goto LABEL_c5510c;
    }
    else
    {
        v165 = &node[v149];
        v133 = CONCAT(v164, v165);
        v32 = CONCAT(8, 0);
        v34 = 0;
        *(unsigned long long *)&v33 = 0;
        *(unsigned long long *)((char *)&v33 + 8) = 0;
        v166 = arm64g_calculate_condition(4, v152, v149, 0);
        if (!(v166 & 1))
        {
            v31 = (char *)&v124 + 8;
            v125 = v124;
            v122 = v121;
            v29 = v28;
            v36 = v35;
LABEL_c55158:
            if (!v164)
                goto LABEL_c55584;
            v167 = 0;
            v168 = 0;
            node = v165;
            v169 = v164;
            v170 = v165;
            while (1)
            {
                v171 = *node;
                node += 1;
                if (v168 == 63 && 1 < (unsigned int)v171)
                    goto LABEL_c555cc;
                else
                    goto LABEL_c55184;
LABEL_c55184:
                v172 = v169 - 1;
                v167 |= (v171 & 127) << ((char)v168 & 63);
                if (!(v171 >> 7 & 1))
                    break;
                v168 += 7;
                v169 = v172;
                v170 = node;
                if (!v169)
                {
                    v163 = 0;
                    v148 = 0;
                    node = &v165[v164];
                    v162 = 19;
                    a0 = sub_c53520(&v32);
                    if (0)
                        goto LABEL_c55720;
                    else
                        goto LABEL_c5510c;
                }
            }
            if (!v167)
                goto LABEL_c55584;
            if (!v172)
            {
                v163 = 0;
                v148 = 0;
                v162 = 19;
                a0 = sub_c53520(&v32);
LABEL_c5510c:
                *(char *)&v147[9] = v148;
                *(unsigned int *)&v147[10] = v163;
                *(unsigned short *)&v147[14] = v163 >> 32;
                *(char *)&v147[8] = v162;
                *(char **)&v147[16] = node;
                *(unsigned long long *)v147 = 2;
                return a0;
            }
            v173 = v169 - 2;
            v174 = v170 + 2;
            v175 = *(char *)(v170 + 1);
            v176 = (unsigned int)v175 & 127;
            if (v175 >> 31 & 1)
            {
                if (!v173)
                    goto LABEL_c55eec;
                v173 = v169 - 3;
                v174 = v170 + 3;
                v177 = *(char *)(v170 + 2);
                v176 = v176 & 0xffffc000 | (v176 & 0xffffc07f | __ROL__((unsigned int)v177, 7) & 16256) & 0x3fff;
                if (!(v177 >> 31 & 1))
                    goto LABEL_c55200;
                if (!v173)
                    goto LABEL_c55eec;
                v178 = *v174;
                if (3 >= v178)
                {
                    v174 = v170 + 4;
                    v173 = v169 - 4;
                    v176 |= v178 * 0x4000;
                    goto LABEL_c55200;
                }
                else
                {
LABEL_c555cc:
                    v163 = 0;
                    v148 = 0;
                    v162 = 6;
                    goto LABEL_c555d8;
                }
                goto LABEL_c555d8;
            }
LABEL_c55200:
            if (!(unsigned short)v176)
            {
                v163 = 0;
                v148 = 0;
                v162 = 8;
                goto LABEL_c555d8;
            }
            if (v173)
            {
                v179 = *v174;
                v180 = v174 + 1;
                *(char **)&v133 = v180;
                v181 = 3;
                v182 = v179 & 0xff;
                v183 = 1;
                v184 = 0;
                if (1 >= (unsigned int)v179)
                {
                    *(unsigned int *)&v29 = v179;
                    v30 = v176;
                    v185 = v173 - 1;
                    v123 = _INSERT(v125, 24, 0);
                    *(unsigned int *)((char *)&v123 + 32) = 0;
                    *(unsigned long long *)((char *)&v123 + 40) = 0;
                    *(unsigned int *)((char *)&v123 + 48) = 0;
                    *(unsigned long long *)((char *)&v123 + 56) = 0;
                    *(unsigned int *)((char *)&v123 + 64) = 0;
                    *(unsigned long long *)((char *)&v123 + 72) = 0;
                    *(unsigned int *)((char *)&v123 + 80) = 0;
                    *(unsigned long long *)((char *)&v123 + 8) = 0;
                    v122 = 0;
                    *(unsigned long long *)&v123 = 0;
                    v125 = _INSERT(v123, 16, 0);
                    v7 = idx;
                    v142 = v141;
                    while (1)
                    {
                        if (v185)
                        {
                            v186 = v185 - 1;
                            v187 = v180;
                            v188 = *v187;
                            v189 = v187 + 1;
                            v190 = (unsigned int)v188 & 127;
                            if (v188 >> 31 & 1)
                            {
                                if (v186)
                                {
                                    v186 = v185 - 2;
                                    v189 = v180 + 2;
                                    v191 = v180[1];
                                    v190 = v190 & 0xffffc000 | (v190 & 0xffffc07f | __ROL__((unsigned int)v191, 7) & 16256) & 0x3fff;
                                    if (v191 >> 31 & 1)
                                    {
                                        if (!v186)
                                            goto LABEL_c556b8;
                                        v192 = *v189;
                                        v182 = v192 & 0xff;
                                        if (3 < v192)
                                            goto LABEL_c55f14;
                                        v189 = v180 + 3;
                                        v186 = v185 - 3;
                                        v190 |= v192 * 0x4000;
                                    }
                                }
                                else
                                {
                                    goto LABEL_c556b8;
                                }
                            }
                            v181 = 9;
                            v182 = v190 & 0xffff;
                            v183 = 0;
                            v184 = 0;
                            if (!(unsigned short)v190)
                                break;
                            if (!v186)
                                goto LABEL_c556b8;
                            v193 = v189;
                            v194 = *v193;
                            v180 = v193 + 1;
                            v179 = v186 - 1;
                            v133 = CONCAT(v179, v180);
                            v163 = (unsigned int)v194 & 127;
                            if (v194 >> 7 & 1)
                            {
                                if (!v179)
                                    goto LABEL_c55680;
                                v179 = v186 - 2;
                                v180 = v189 + 2;
                                v133 = CONCAT(v179, v180);
                                v195 = v189[1];
                                v163 = (unsigned int)v163 & 0xffffc000 | ((unsigned int)v163 & 0xffffc07f | __ROL__((unsigned int)v195, 7) & 16256) & 0x3fff;
                                if (v195 >> 7 & 1)
                                {
                                    if (!v179)
                                        goto LABEL_c55680;
                                    v133 = CONCAT(v186 - 3, v189 + 3);
                                    v196 = v189[2];
                                    v182 = v196 & 0xff;
                                    if (3 < v196)
                                        goto LABEL_c55f14;
                                    v163 = (unsigned int)v163 | v196 * 0x4000;
                                }
                            }
                            v179 = (unsigned int)v163 & 0xffff;
                            v181 = 3;
                            v182 = v179 & 0xffffffff;
                            v183 = 33;
                            v184 = 0;
                            if ((unsigned int)v179 == 33)
                            {
                                sub_c4a4e8(&v142, &v133);
                                v198 = *(char *)&v142;
                                v181 = 4;
                                v182 = v198;
                                v183 = 82;
                                v184 = 0;
                                if (v198 == 82)
                                {
                                    v197 = *(unsigned long long *)((void*)&v142 + 8);
                                }
                                else
                                {
                                    v170 = *(char *)((void*)&v142 + 1);
                                    v163 = *(unsigned short *)((void*)&v142 + 2);
                                    v179 = *(unsigned int *)((void*)&v142 + 4);
                                    node = *(unsigned long long *)((void*)&v142 + 8);
                                    goto LABEL_c556cc;
                                }
                            }
                            else if ((unsigned int)v179)
                            {
                                v197 = 0;
                            }
                            else
                            {
                                v170 = 0;
                                v198 = 9;
                                goto LABEL_c556cc;
                            }
                            node = (unsigned int)v163 * 0x10000 | node & 0xffffffff00000000 & 0xffffffffffff0000 | (node & 0xffffffff00000000 & 0xffffffffffff0000 | v190 & 0xffff) & 0xffff;
                            if (v122 == 1)
                            {
                                v199 = *(unsigned long long *)((void*)&v125 + 16);
                                v183 = *(unsigned long long *)&v125;
                                v181 = 4;
                                v184 = 0;
                                v182 = v199;
                                if (v182 == *(unsigned long long *)&v125)
                                    sub_c13ca4(&v125);
                                v200 = *(unsigned long long *)((void*)&v125 + 8) + v199 * 16;
                                v200->field_0 = v197;
                                v200->field_8 = node;
                                *(unsigned long long *)((char *)&v125 + 16) = v199 + 1;
                            }
                            else
                            {
                                v201 = *(unsigned long long *)&v125;
                                v181 = 4;
                                v182 = v201;
                                v183 = 5;
                                v184 = 0;
                                if (v201 == 5)
                                {
                                    ptr = _malloc(80);
                                    if (ptr)
                                    {
                                        v142 = CONCAT(ptr, 5);
                                        index = v31;
                                        v204 = *(int128_t *)((char *)&v125 + 56);
                                        *(int128_t *)(ptr + 32) = *(int128_t *)((char *)&v125 + 40);
                                        *(uint128_t *)(ptr + 48) = v204;
                                        *(int128_t *)(ptr + 64) = *(int128_t *)((char *)&v125 + 72);
                                        v205 = *(int128_t *)((char *)&v125 + 24);
                                        *(int128_t *)ptr = *(int128_t *)((char *)&v125 + 8);
                                        *(uint128_t *)(ptr + 16) = v205;
                                        v143 = 5;
                                        sub_c13ca4(&v142);
                                        idx1 = *(unsigned long long *)((void*)&v142 + 8);
                                        *(unsigned long long *)(idx1 + 80) = v197;
                                        *(char **)(idx1 + 88) = node;
                                        v143 = 6;
                                        v122 = 1;
                                        v123 = _INSERT(v125, 0, v142);
                                        v125 = _INSERT(v123, 16, 6);
                                    }
                                    else
                                    {
                                        sub_c6b970(8, 80);
                                        goto LABEL_c550dc;
                                    }
                                }
                                else
                                {
                                    v207 = arm64g_calculate_condition(36, v182, 5, 0);
                                    if (!(v207 & 1))
                                    {
                                        v208 = v31 + v201 * 16;
                                        v208->field_0 = v197;
                                        v208->field_8 = node;
                                        *(unsigned long long *)&v125 = v201 + 1;
                                    }
                                    else
                                    {
                                        sub_c73c94();
                                        goto LABEL_c550dc;
                                    }
                                }
                            }
                            v170 = v197 >> 8;
                            v163 = v197 >> 16;
                            v180 = *(unsigned long long *)&v133;
                            v185 = *(unsigned long long *)((void*)&v133 + 8);
                            v179 = v197 >> 32;
                        }
                        else
                        {
                            v179 = 0;
LABEL_c55680:
                            v163 = 0;
                            v170 = 0;
                            v198 = 19;
                            node = v180;
                            goto LABEL_c556cc;
                        }
                    }
                    if (!v186)
                    {
LABEL_c556b8:
                        v179 = 0;
                        v163 = 0;
                        v170 = 0;
                        v198 = 19;
                        node = v189;
                        goto LABEL_c556cc;
                    }
                    v209 = v189;
                    v210 = *v209;
                    v165 = v209 + 1;
                    v164 = v186 - 1;
                    v133 = CONCAT(v164, v165);
                    v211 = (unsigned int)v210 & 127;
                    if (v210 >> 7 & 1)
                    {
                        if (!v164)
                            goto LABEL_c56094;
                        v164 = v186 - 2;
                        v165 = v189 + 2;
                        v133 = CONCAT(v164, v165);
                        v212 = v189[1];
                        v211 = v211 & 0xffffc000 | (v211 & 0xffffc07f | __ROL__((unsigned int)v212, 7) & 16256) & 0x3fff;
                        if (!(v212 >> 7 & 1))
                            goto LABEL_c55494;
                        if (v164)
                        {
                            v164 = v186 - 3;
                            v165 = v189 + 3;
                            v133 = CONCAT(v164, v165);
                            v213 = v189[2];
                            v182 = v213 & 0xff;
                            if (3 >= v213)
                            {
                                v211 |= v213 * 0x4000;
                                goto LABEL_c55494;
                            }
                            else
                            {
                                v181 = 3;
                                v183 = 3;
                                v184 = 0;
LABEL_c55f14:
                                v179 = 0;
                                v163 = 0;
                                v170 = 0;
                                v198 = 6;
                                goto LABEL_c556cc;
                            }
                        }
                        else
                        {
LABEL_c56094:
                            v179 = 0;
                            v163 = 0;
                            v170 = 0;
                            v198 = 19;
                            node = v165;
                            goto LABEL_c556cc;
                        }
                        goto LABEL_c556cc;
                    }
LABEL_c55494:
                    v181 = 9;
                    v182 = v211 & 0xffff;
                    v183 = 0;
                    v184 = 0;
                    if ((unsigned short)v211)
                    {
                        v198 = 13;
LABEL_c556cc:
                        v214 = ((unsigned int)v163 * 0x10000 | v179 * 0x100000000) & 0xffffffffffff0000 | (((unsigned int)v163 * 0x10000 | v179 * 0x100000000) & 0xffffffffffff00ff | (v170 * 0x100 | v170 >> 56) & 0xff00) & 0xffff | v198;
                        v216 = *(unsigned long long *)&v125;
                        if (v122)
                        {
                            v217 = arm64g_calculate_condition(v181 | 16, v182, v183, v184);
                            v218 = arm64g_calculate_condition(4, (v217 & 1 ? v216 : 0x40000000), 0, 0);
                            if (!(v218 & 1))
                                goto LABEL_c556f4;
                            goto LABEL_c556fc;
                        }
                        else
                        {
                            v219 = arm64g_calculate_condition(v181 | 16, v182, v183, v184);
                            v220 = arm64g_calculate_condition(0, (v219 & 1 ? v216 : 0x40000000), 0, 0);
                            if (!(v220 & 1))
                            {
LABEL_c556f4:
                                _free(*(unsigned long long *)((void*)&v125 + 8));
                            }
                        }
                    }
                    v214 = *(unsigned long long *)&v125;
                    node = *(unsigned long long *)((void*)&v125 + 8);
                    v52 = *(uint128_t *)((void*)&v125 + 48);
                    v53 = *(uint128_t *)((void*)&v125 + 64);
                    v54 = *(unsigned long long *)((void*)&v125 + 80);
                    v48 = *(uint128_t *)((void*)&v125 + 16);
                    v49 = *(uint128_t *)((void*)&v125 + 32);
                    if (v122 != 2)
                    {
                        v37 = v52;
                        v38 = v53;
                        v39 = v54;
                        v36 = CONCAT(v49, v48);
                        v162 = (unsigned int)v214 & 0xff;
                        v215 = (char)(v214 >> 8);
                        v163 = v214 >> 16;
                        if (v122 != 3)
                        {
                            v45 = v37;
                            v46 = v38;
                            v47 = v39;
                            v41 = v36;
                            v43 = *(uint128_t *)((void*)&v36 + 16);
                            v55 = v122;
                            v56 = v162;
                            v57 = v215;
                            v59 = v214 >> 48;
                            v58 = v163;
                            v63 = v43;
                            v65 = v45;
                            v67 = v46;
                            v69 = v47;
                            v61 = v41;
                            v60 = node;
                            v70 = v167;
                            v71 = v30;
                            v72 = v29;
                            a0 = sub_c13cd8(&v32, &v55);
                            idx = v7;
                            if (!(unsigned int)a0)
                                goto LABEL_c55158;
                            v162 = 14;
                            goto LABEL_c555d8;
                        }
                        v148 = v215;
                        idx = v7;
                        a0 = sub_c53520(&v32);
                        if (v162 != 82)
                            goto LABEL_c5510c;
                    }
                    else
                    {
LABEL_c556fc:
                        v162 = (unsigned int)v214 & 0xff;
                        v148 = (char)(v214 >> 8);
                        v163 = v214 >> 16;
                        idx = v7;
                        a0 = sub_c53520(&v32);
                        if (v162 != 82)
                            goto LABEL_c5510c;
                    }
                }
                else
                {
                    v163 = 0;
                    v148 = 0;
                    v162 = 10;
LABEL_c555d8:
                    a0 = sub_c53520(&v32);
                    if (v162 != 82)
                        goto LABEL_c5510c;
                }
            }
            else
            {
LABEL_c55eec:
                v163 = 0;
                v148 = 0;
                v162 = 19;
                node = v174;
                a0 = sub_c53520(&v32);
                if (!0)
                    goto LABEL_c5510c;
            }
        }
        else
        {
LABEL_c55584:
            v221 = *(unsigned long long *)&v32;
            v162 = *(char *)((void*)&v32 + 8);
            v148 = *(char *)((void*)&v32 + 9);
            v163 = *(unsigned int *)((void*)&v32 + 10) | *(unsigned short *)((void*)&v32 + 14) * 0x100000000;
            node = *(unsigned long long *)&v33;
            v138 = *(uint128_t *)((void*)&v33 + 8);
            v139 = v34;
            if (v221 == 0x8000000000000000)
            {
                v125 = v124;
                v122 = v121;
                v29 = v28;
                v36 = v35;
                if (v162 != 82)
                    goto LABEL_c5510c;
            }
            else
            {
                *(unsigned long long *)((char *)&v60 + 9) = v148;
                *(unsigned int *)((char *)&v60 + 10) = v163;
                *(unsigned short *)((char *)&v60 + 14) = v163 >> 32;
                *(uint128_t *)((char *)&v62 + 8) = v138;
                v55 = CONCAT(1, 1);
                *(unsigned long *)&v60 = v221;
                *((char *)&v60 + 8) = v162;
                *(unsigned long long *)((char *)&v62 + 24) = v139;
                *(char **)&v62 = node;
                ptr1 = _malloc(64);
                if (!ptr1)
                {
                    sub_c6ba70(8, 64);
LABEL_c550dc:
                    __debugbreak();
                }
                node = ptr1;
                *(uint128_t *)ptr1 = v55;
                *(uint128_t *)(ptr1 + 16) = v60;
                *(uint128_t *)(ptr1 + 32) = *(uint128_t *)&v62;
                *(uint128_t *)(ptr1 + 48) = *(uint128_t *)((void*)&v62 + 16);
                v125 = v124;
                v122 = v121;
                v29 = v28;
                v36 = v35;
            }
        }
    }
LABEL_c55720:
    v223 = &v122;
    v62 = (int128_t)a2[32];
    v64 = (int128_t)a2[48];
    v66 = (long long)a2[64];
    v224 = *(char *)(idx + 272);
    v55 = *(int128_t *)a2;
    v60 = (long long)a2[16];
    v61 = (long long)a2[24];
    v225 = (unsigned int)((unsigned int)((int)a2[72]) >> 16) > 4;
    v226 = (int)a2[72] & 0xff00;
    v227 = v226;
    if (v226 == 0x800)
    {
        v228 = 16;
        v229 = arm64g_calculate_condition(3, v227, 0x800, 0);
        if (!(v229 & 1))
            goto LABEL_c5578a;
LABEL_c55789:
        v231 = 20;
    }
    else
    {
        v228 = 8;
        v230 = arm64g_calculate_condition(3, v227, 0x800, 0);
        if (v230 & 1)
            goto LABEL_c55789;
        v231 = 12;
LABEL_c5578a:
    }
    v232 = 20;
    v233 = v225 & v224;
    if (v225 & v224)
    {
        v234 = v228;
        v235 = arm64g_calculate_condition(25, v233, 0, 0);
        if (!(v235 & 1))
            goto LABEL_c55796;
LABEL_c55795:
        v237 = v231;
    }
    else
    {
        v234 = 0;
        v236 = arm64g_calculate_condition(25, v233, 0, 0);
        if (v236 & 1)
            goto LABEL_c55795;
LABEL_c55796:
        v237 = 0;
    }
    *(double *)&v67 = (double)a2[72];
    v110 = 0;
    v112 = 0;
    v114 = 0;
    v115 = v234;
    v116 = 0;
    v117 = v237;
    v118 = v237;
    v109 = node;
    v70 = 47;
    v68 = 2 > (unsigned long long)((long long)a2[16] - 3);
    v69 = (long long)a2[24];
    v121 = *(unsigned long long *)((void*)&v62 + 8);
    v123 = _INSERT(v125, 0, *(unsigned long long *)&v64);
    *(uint128_t **)((char *)&v123 + 8) = &v55;
    *(char **)((char *)&v123 + 16) = node + 16;
    v238 = (char *)&v123 + 24;
    *(unsigned long long *)((char *)&v123 + 24) = 0;
    v125 = _INSERT(v123, 80, 0);
    do
    {
        v239 = sub_c539d8(&v48, &v121);
        v240 = (char)v48;
        v241 = *(char *)((void*)&v48 + 1);
        if (v240 != 82)
        {
            *(unsigned long long *)&v147[8] = v240 | v241 * 0x100 | *(unsigned int *)((void*)&v48 + 2) * 0x10000 | *(unsigned short *)((void*)&v48 + 6) * 0x1000000000000;
            *(unsigned long long *)&v147[16] = *(unsigned long long *)((void*)&v48 + 8);
            goto LABEL_c55db4;
        }
        i = *(unsigned long long *)((void*)&v125 + 24);
        if (!(v241 & 1) && !i)
        {
            *(char *)&v147[8] = 69;
LABEL_c55db4:
            *(unsigned long long *)v147 = 2;
            goto LABEL_c561cc;
        }
    } while (!i);
    v243 = *(unsigned long long *)((void*)&v125 + 32);
    idx2 = *(unsigned long long *)((void*)&v125 + 40);
    if (*(long long *)idx2 == 1)
    {
        v245 = *(long long *)(idx2 + 16);
        v246 = *(long long *)(idx2 + 24);
        v48 = CONCAT(v243, i);
        v49 = v245;
        v50 = v246;
        v51 = (char *)&v125 + 24;
        if (!v246)
            goto LABEL_c55af0;
        goto LABEL_c5587c;
    }
    v246 = *(long long *)(idx2 + 8);
    if (6 > v246)
    {
        v245 = idx2 + 16;
        v48 = CONCAT(v243, i);
        v49 = v245;
        v50 = v246;
        v51 = (char *)&v125 + 24;
        if (v246)
        {
            iter = 0;
LABEL_c5587c:
            v248 = v246 - 1;
            v249 = v245 + 1;
            v250 = 46;
            v251 = 46;
            v30 = 46;
            while (1)
            {
                *(int128_t *)&v36 = *(int128_t *)(v249 - 16);
                v239 = sub_c4cbcc(&v40, &v48, *(int *)(*(long long *)((char *)&v125 + 48) + 72), &v36);
                if (v40 == 46)
                {
                    v126 = v42;
                    *(uint128_t *)&v147[8] = v126;
                    goto LABEL_c55db4;
                }
                v243 = v44;
                v49 = v249;
                v50 = v248;
                v126 = v42;
                v252 = (unsigned int)v243 & 0xffff;
                if (v252 > 114)
                {
                    if (8496 >= v252)
                    {
                        switch (v252)
                        {
                        case 115:
LABEL_c559d4:
                            v239 = sub_c4eda0(&v36, &v40);
                            if ((unsigned long long)v36 != 11)
                                goto LABEL_c558c0;
                            v116 = *(unsigned long long *)((void*)&v36 + 8);
                            goto LABEL_c558c0;
                        case 116:
LABEL_c55a34:
                            v239 = sub_c4eda0(&v36, &v40);
                            if ((unsigned long long)v36 != 23)
                                goto LABEL_c558c0;
                            v118 = *(unsigned long long *)((void*)&v36 + 8);
                            goto LABEL_c558c0;
                        case 140:
                            v239 = sub_c4eda0(&v36, &v40);
                            if ((unsigned long long)v36 != 18)
                                goto LABEL_c558c0;
                            v117 = *(unsigned long long *)((void*)&v36 + 8);
                            goto LABEL_c558c0;
                        default:
LABEL_c558c0:
                            v248 -= 1;
                            v249 += 16;
                            v253 = arm64g_calculate_condition(2, v248, 1, 0);
                            if (!(v253 & 1))
                                continue;
                        }
                    }
                    else
                    {
                        v243 = 8497;
                        if (v252 == 8497)
                        {
                            if (v68)
                                goto LABEL_c558c0;
                            v239 = sub_c4eda0(&v36, &v40);
                            if ((unsigned long long)v36 == 45)
                            {
                                v243 = 1;
                                v68 = 1;
                                v69 = *(unsigned long long *)((void*)&v36 + 8);
                                v68 = 1;
                                goto LABEL_c558c0;
                            }
                            else
                            {
                                v68 = 0;
                                goto LABEL_c558c0;
                            }
                        }
                        v243 = 8498;
                        if (v252 == 8498)
                            goto LABEL_c55a34;
                        v243 = 8499;
                        if (v252 != 8499)
                            goto LABEL_c558c0;
                        else
                            goto LABEL_c559d4;
                    }
LABEL_c55d90:
                    v238 = v51;
                    v254 = v30;
                    v223 = &v121;
                    if (!(*(int *)((char *)&v125 + 64) & 1))
                    {
LABEL_c55b04:
                        v255 = *v238;
                        v243 = 1;
                        v238[5] = 1;
                        v238[6] = *(unsigned long long *)&v48 - v255;
                        break;
                    }
                }
                else
                {
                    switch (v252)
                    {
                    case 17:
                        v239 = sub_c4eda0(&v36, &v40);
                        v243 = v36;
                        v29 = *(unsigned long long *)((void*)&v36 + 8);
                        v30 = v243;
                        goto LABEL_c558c0;
                    case 3:
                        v239 = sub_c4eda0(&v36, &v40);
                        v250 = v36;
                        v119 = *(uint128_t *)((void*)&v36 + 8);
                        goto LABEL_c558c0;
                    case 27:
                        v239 = sub_c4eda0(&v36, &v40);
                        v251 = v36;
                        v120 = *(uint128_t *)((void*)&v36 + 8);
                        goto LABEL_c558c0;
                    case 16:
                        v239 = sub_c4eda0(&v36, &v40);
                        v243 = *(unsigned long long *)((void*)&v36 + 8);
                        if ((unsigned long long)v36 == 16)
                            v31 = v243;
                        iter = (unsigned long long)v36 == 16 | (unsigned int)iter;
                        goto LABEL_c558c0;
                    case 114:
                        v239 = sub_c4eda0(&v36, &v40);
                        if ((unsigned long long)v36 != 28)
                            goto LABEL_c558c0;
                        v115 = *(unsigned long long *)((void*)&v36 + 8);
                        goto LABEL_c558c0;
                    default:
LABEL_c558c0:
                        v248 -= 1;
                        v249 += 16;
                        v253 = arm64g_calculate_condition(2, v248, 1, 0);
                        if (v253 & 1)
                            goto LABEL_c55d90;
                        break;
                    }
                }
            }
            goto LABEL_c55b18;
        }
        iter = 0;
LABEL_c55af0:
        v254 = 46;
        v251 = 46;
        v250 = 46;
        if (!(*(unsigned int *)((void*)&v125 + 64) & 1))
            goto LABEL_c55b04;
LABEL_c55b18:
        v126 = v32;
        if (v250 == 46)
        {
            v256 = 0;
            v110 = 0;
            v111 = v238;
            if (v251 == 46)
                goto LABEL_c55be0;
            goto LABEL_c55b3c;
        }
        v127 = v250;
        v128 = v119;
        v239 = sub_c4b058(&v121, idx, *(char *)((void*)&v67 + 1), v115, &v127);
        v243 = *(unsigned long long *)&v125;
        v238 = *(unsigned long long *)((void*)&v125 + 8);
        if ((unsigned int)v121)
            v256 = 0;
        else
            v256 = v243;
        v110 = v256;
        v111 = v238;
        if (v251 != 46)
        {
LABEL_c55b3c:
            v129 = v251;
            v130 = v120;
            v239 = sub_c4b058(&v121, idx, *(char *)((void*)&v67 + 1), v115, &v129);
            v243 = *(unsigned long long *)&v125;
            v232 = *(unsigned long long *)((void*)&v125 + 8);
            if ((unsigned int)v121)
                v257 = 0;
            else
                v257 = v243;
            v112 = v257;
            v113 = v232;
            if (!(iter & 1))
                goto LABEL_c55bec;
            goto LABEL_c55b80;
        }
LABEL_c55be0:
        v257 = 0;
        v112 = 0;
        if (!(iter & 1))
        {
LABEL_c55bec:
            v30 = 0;
            v294 = 47;
            if (v70 != 47)
                goto LABEL_c55c00;
            goto LABEL_c55c4c;
        }
LABEL_c55b80:
        iter = *(long long *)(idx + 64);
        v258 = v31;
        v259 = *(long long *)(idx + 72) - v258;
        if (v258 > (unsigned long long)*(long long *)(idx + 72))
        {
            v260 = 19;
            goto LABEL_c561c0;
        }
        iter += v258;
        if (v259 <= 3)
        {
LABEL_c561b0:
            goto LABEL_c561b4;
        }
        v261 = (char)v67;
        v262 = v259 - 4;
        v263 = iter;
        v264 = v263->field_0;
        v265 = &v263->field_4;
        v266 = arm64g_calculate_condition(49, v264 & 0xffffffff, 16, 0);
        if (!(v266 & 1))
        {
            v267 = arm64g_calculate_condition(1, v264 & 0xffffffff, 1, 0);
            if (!(v267 & 1))
            {
                idx = 0;
                v223 = 16;
                goto LABEL_c55df4;
            }
            if (v262 > 7 && !(v265 = iter + 12, v268 = *(char *)(iter + 11) * 0x100000000000000 | (*(int *)(iter + 4) * 0x100 | (*(short *)(iter + 8) | *(char *)(iter + 10) * 0x10000) * 0x10000000000) >> 8, v269 = 8, v268 > v259 - 12))
                goto LABEL_c55e24;
            goto LABEL_c55e8c;
        }
        v269 = 4;
        v268 = v264;
        if (v262 >= v264)
        {
LABEL_c55e24:
            v137 = v268;
            if (v268 <= 1)
                goto LABEL_c55e8c;
            v270 = v265;
            v271 = (unsigned long long)v270->field_0;
            iter = &v270->field_1;
            v272 = arm64g_calculate_condition(129, (unsigned int)v271 - 6, 5, 0);
            if (!(v272 & 1))
            {
                v223 = 0x11;
                iter = v271;
            }
            else
            {
                v273 = v268 - 2;
                if ((unsigned int)v271 <= 4)
                {
LABEL_c560b0:
                    v274 = arm64g_calculate_condition(49, v264 & 0xffffffff, 16, 0);
                    if (!(v274 & 1))
                    {
                        if (v273 > 7)
                        {
                            v275 = v273 - 8;
                            v276 = iter + 8;
                            v136 = v276;
                            v277 = *(char *)(iter + 7) * 0x100000000000000 | (*(int *)iter * 0x100 | (*(short *)(iter + 4) | *(char *)(iter + 6) * 0x10000) * 0x10000000000) >> 8;
                            goto LABEL_c56108;
                        }
                        goto LABEL_c561b0;
                    }
                    if (v273 <= 3)
                        goto LABEL_c561b0;
                    v275 = v273 - 4;
                    v277 = *(int *)iter;
                    iter += 4;
                    v136 = iter;
                    v276 = iter;
LABEL_c56108:
                    if (v277 > v275)
                    {
                        v223 = 19;
                        iter = v276;
                    }
                    else
                    {
                        if (v277)
                        {
                            v278 = v277 - 1;
                            v279 = v276;
                            v280 = *(char *)v279;
                            v265 = v279 + 1;
                            v137 = v278;
                            if (!v280)
                            {
                                v223 = 28;
                                goto LABEL_c5618c;
                            }
                            v20 = v280;
                            v21 = v275 - v277;
                            v22 = v268;
                            v27 = v277;
                            v25 = v269;
                            v26 = v261;
                            v23 = v238;
                            v24 = v232;
                            v30 = v271;
                            if ((unsigned int)v271 >= 4)
                            {
                                if (!v278)
                                    goto LABEL_c55e8c;
                                v278 = v27 - 2;
                                v137 = v278;
                                v19 = *(char *)(v276 + 1);
                                if (v19)
                                {
                                    v265 = v276 + 2;
                                    goto LABEL_c56198;
                                }
                                else
                                {
                                    v223 = 29;
                                    goto LABEL_c5618c;
                                }
                                goto LABEL_c5618c;
                            }
                            v19 = 1;
LABEL_c56198:
                            if (!v278)
                                goto LABEL_c55e8c;
                            v281 = v265;
                            iter = &v281->field_0[1];
                            v136 = iter;
                            if (v278 == 1)
                                goto LABEL_c561b0;
                            v137 = v278 - 2;
                            if (v278 != 2)
                            {
                                v18 = v265->field_0[1];
                                iter = &v265->field_2;
                                v136 = iter;
                                v17 = v265->field_1;
                                if (!v17)
                                {
                                    v223 = 30;
                                    goto LABEL_c5618c;
                                }
                                v16 = v281->field_0[0] != 0;
                                if (v278 == 3)
                                    goto LABEL_c561b0;
                                v15 = v265->field_2;
                                if (v15)
                                {
                                    v282 = v278 - 4;
                                    v13 = &v265->field_3;
                                    v12 = v15 - 1 & 0xff;
                                    v283 = v282 - v12;
                                    if (v12 > v282)
                                    {
                                        idx = 0;
                                        v223 = 19;
                                        iter = v13;
                                    }
                                    else
                                    {
                                        iter = &(&v265->field_3)[v12];
                                        v136 = iter;
                                        v137 = v283;
                                        v138 = CONCAT(8, 0);
                                        v139 = 0;
                                        v284 = v30;
                                        if (4 >= (unsigned int)v284)
                                        {
                                            if (v283)
                                            {
                                                v285 = 0;
                                                v286 = &v265->field_0[v278];
                                                v287 = 8;
                                                v14 = 2;
                                            }
                                            else
                                            {
LABEL_c564e0:
                                                v10 = 0;
                                                idx = v284 >> 8;
                                                v223 = 19;
                                                v14 = 2;
                                                goto LABEL_c564f4;
                                            }
                                            while (1)
                                            {
                                                v288 = 0;
                                                v284 = v223;
                                                v223 = iter;
                                                while (*(char *)(v223 + v288))
                                                {
                                                    if (v223 + v288 + 1 == v286)
                                                    {
                                                        iter = v223;
                                                        goto LABEL_c564e0;
                                                    }
                                                }
                                                v136 = v223 + v288 + 1;
                                                v137 = v283 + ~v288;
                                                if (!v288)
                                                    break;
                                                if (v285 == *(unsigned long long *)&v138)
                                                {
                                                    v239 = sub_c6c3c4(&v138);
                                                    v287 = *(unsigned long long *)((void*)&v138 + 8);
                                                }
                                                v289 = v287 + 24 * v285;
                                                *v289 = 31;
                                                v289[1] = v223;
                                                v289[2] = v288;
                                                v285 += 1;
                                                v139 = v285;
                                                iter = v136;
                                                v283 = v137;
                                                v286 = iter + v283;
                                                v284 = v223;
                                                goto LABEL_c564e0;
                                            }
                                            v10 = 0;
                                            v11 = 0;
                                            v141 = CONCAT(8, 0);
                                            v143 = 0;
                                            if ((unsigned int)v30 >= 5)
                                            {
LABEL_c565c0:
                                                v239 = sub_c573e8(&v121, &v136);
                                                j = v121;
                                                v9 = *(unsigned long long *)&v125;
                                                iter = *(unsigned long long *)((void*)&v125 + 8);
                                                if (j == 0x8000000000000000)
                                                {
                                                    v301 = 0;
                                                    v223 = (unsigned int)v9 & 0xff;
                                                    v6 = v9;
                                                    if (*(unsigned long long *)&v141)
                                                        goto LABEL_c56600;
                                                    goto LABEL_c56608;
                                                }
                                                else
                                                {
                                                    v239 = sub_c576c4(&v121, &v136);
                                                    v223 = (char)v121;
                                                    if ((unsigned int)v223 != 82)
                                                    {
                                                        idx = *(unsigned int *)((void*)&v121 + 1) | (*(unsigned short *)((void*)&v121 + 5) | *(char *)((void*)&v121 + 7) * 0x10000) * 0x100000000;
                                                        iter = *(unsigned long long *)&v125;
LABEL_c56734:
                                                        if (j)
                                                            v239 = _free(v9);
LABEL_c564f4:
                                                        if (*(unsigned long long *)&v138)
                                                        {
                                                            v239 = _free(*(unsigned long long *)((void*)&v138 + 8));
                                                            goto LABEL_c56524;
                                                        }
                                                    }
                                                    v2 = *(unsigned long long *)&v125;
                                                    if (!v2)
                                                    {
                                                        v294 = 46;
                                                        goto LABEL_c56894;
                                                    }
                                                    v302 = 0;
                                                    v3 = 8;
                                                    v4 = 0;
                                                    v294 = 46;
                                                    v1 = v26 | v25 * 0x100;
                                                    while (1)
                                                    {
                                                        v239 = sub_c57854(&v121, &v136, v1 | 0x50000, v9, iter);
                                                        v303 = v121;
                                                        v5 = *(unsigned long long *)((void*)&v125 + 8);
                                                        v6 = *(unsigned long long *)&v125;
                                                        if (v303 == 46)
                                                            break;
                                                        v48 = *(uint128_t *)((void*)&v125 + 16);
                                                        v49 = *(uint128_t *)((void*)&v125 + 32);
                                                        v52 = *(uint128_t *)((void*)&v125 + 48);
                                                        v53 = *(uint128_t *)((void*)&v125 + 64);
                                                        if (v302 == *(unsigned long long *)&v141)
                                                        {
                                                            v239 = sub_c783fc(&v141);
                                                            v3 = *(unsigned long long *)((void*)&v141 + 8);
                                                        }
                                                        v302 += 1;
                                                        v304 = v4;
                                                        v305 = v3 + v304;
                                                        v305->field_0 = v303;
                                                        v305->field_8 = v6;
                                                        v305->field_10 = v5;
                                                        *(uint128_t *)((char *)&v305->field_38 + 8) = v53;
                                                        *(uint128_t *)((char *)&v305->field_28 + 8) = v52;
                                                        *(uint128_t *)((char *)&v305->field_18 + 8) = v49;
                                                        *(uint128_t *)&(&v305->field_10)[1] = v48;
                                                        v143 = v302;
                                                        v4 = v304 + 88;
                                                        if (v2 == v302)
                                                            goto LABEL_c56894;
                                                    }
                                                    iter = v5;
                                                    v223 = (unsigned int)v6 & 0xff;
                                                    v301 = 1;
                                                    if (*(unsigned long long *)&v141)
                                                        goto LABEL_c56600;
                                                    goto LABEL_c56608;
                                                }
                                            }
LABEL_c56594:
                                            if (v256)
                                            {
                                                v140 = 0;
                                                v294 = 31;
                                            }
                                            else
                                            {
                                                v294 = 46;
                                            }
                                            iter = v136;
                                            v295 = v137;
                                            if (v295)
                                            {
                                                v296 = 0;
                                                v297 = iter + v295;
                                                v5 = 8;
                                                v9 = 2;
                                            }
                                            else
                                            {
LABEL_c56874:
                                                v301 = 1;
                                                v223 = 19;
                                                j = 0;
                                                v9 = 2;
                                                if (*(unsigned long long *)&v141)
                                                {
LABEL_c56600:
                                                    v239 = _free(*(unsigned long long *)((void*)&v141 + 8));
                                                }
LABEL_c56608:
                                                idx = v6 >> 8;
                                                if (v301 & 1)
                                                    goto LABEL_c56734;
                                                goto LABEL_c564f4;
                                            }
                                            while (1)
                                            {
                                                v298 = 0;
                                                v6 = j;
                                                j = iter;
                                                while (*(char *)(j + v298))
                                                {
                                                    if (j + v298 + 1 == v297)
                                                    {
                                                        iter = j;
                                                        goto LABEL_c56874;
                                                    }
                                                }
                                                v136 = j + v298 + 1;
                                                v137 = v295 + ~v298;
                                                if (!v298)
                                                    break;
                                                v239 = sub_c57afc(&v121, &v136, j);
                                                v299 = v121;
                                                v6 = *(unsigned long long *)&v125;
                                                iter = *(unsigned long long *)((void*)&v125 + 8);
                                                if (v299 == 46)
                                                {
                                                    v223 = (unsigned int)v6 & 0xff;
                                                    v301 = 1;
                                                    j = 0;
                                                    v9 = 2;
                                                    if (!*(unsigned long long *)&v141)
                                                        goto LABEL_c56608;
                                                    goto LABEL_c56600;
                                                }
                                                v40 = *(uint128_t *)((void*)&v125 + 16);
                                                v43 = *(uint128_t *)((void*)&v125 + 32);
                                                v45 = *(uint128_t *)((void*)&v125 + 48);
                                                v46 = *(uint128_t *)((void*)&v125 + 64);
                                                if (v296 == *(unsigned long long *)&v141)
                                                {
                                                    v239 = sub_c783fc(&v141);
                                                    v5 = *(unsigned long long *)((void*)&v141 + 8);
                                                }
                                                v300 = v5 + 88 * v296;
                                                v300->field_0 = v299;
                                                v300->field_8 = v6;
                                                v300->field_10 = iter;
                                                *(uint128_t *)&(&v300->field_10)[1] = v40;
                                                *(uint128_t *)((char *)&v300->field_38 + 8) = v46;
                                                *(uint128_t *)((char *)&v300->field_28 + 8) = v45;
                                                *(uint128_t *)((char *)&v300->field_18 + 8) = v43;
                                                v296 += 1;
                                                v143 = v296;
                                                iter = v136;
                                                v295 = v137;
                                                v297 = iter + v295;
                                                v6 = j;
                                                goto LABEL_c56874;
                                            }
                                            j = 0;
                                            iter = 0;
LABEL_c56894:
                                            v223 = v276 + v27;
                                            v133 = v138;
                                            v134 = v139;
                                            v131 = v141;
                                            v132 = v143;
                                            v135 = v140;
                                            v35 = _INSERT(v36, 24, 0);
                                            v37 = 0;
                                            v36 = _INSERT(v35, 16, 0);
                                            *(unsigned long long *)((char *)&v33 + 16) = 0;
                                            v32 = *(uint128_t *)&v36;
                                            *(uint128_t *)&v33 = *(uint128_t *)((void*)&v36 + 16);
                                            v243 = v31;
                                            if (v70 != 47)
                                            {
LABEL_c55c00:
                                                v306 = v243;
                                                if (v79)
                                                    v239 = _free(ptr2);
                                                if (v82)
                                                    v239 = _free(v83);
                                                if (v85)
                                                    v239 = _free(v86);
                                                v243 = v306;
                                                if (v88)
                                                {
                                                    v239 = _free(v89);
                                                    v243 = v306;
                                                }
                                            }
LABEL_c55c4c:
                                            v70 = v294;
                                            v71 = v256;
                                            v73 = v23;
                                            v74 = 46;
                                            v75 = v32;
                                            v76 = *(uint128_t *)&v33;
                                            v78 = v135;
                                            v77 = *(unsigned long long *)((void*)&v33 + 16);
                                            v79 = v10;
                                            ptr2 = v14;
                                            v81 = v11;
                                            v82 = v133;
                                            v84 = v134;
                                            v85 = j;
                                            v86 = v9;
                                            v87 = iter;
                                            v88 = v131;
                                            v90 = v132;
                                            v91 = v13;
                                            v92 = v12;
                                            v93 = v223;
                                            v94 = v21;
                                            v95 = v243;
                                            v96 = v22;
                                            v97 = v27;
                                            v98 = v257;
                                            v99 = v24;
                                            v100 = v26;
                                            v101 = v25;
                                            v102 = v30;
                                            v103 = v16;
                                            v104 = v20;
                                            v105 = v19;
                                            v106 = v18;
                                            v107 = v17;
                                            v108 = v15;
                                            switch (v254)
                                            {
                                            case 0:
                                                v318 = v29;
                                                goto LABEL_c55dfc;
                                            case 12:
                                                v307 = *(long long *)(idx + 16);
                                                v308 = *(long long *)(idx + 24);
                                                v309 = v116;
                                                v310 = v308 - v309;
                                                if (v308 < v309 || (v308 = (char)v67, v307 = *(long long *)(idx + 16) + v309, v311 = v308 * v29, v312 = v310 - v311, v311 > v310))
                                                {
                                                    v317 = 19;
                                                }
                                                else
                                                {
                                                    if ((((unsigned int)v308 ^ (unsigned int)v308 - 1 & 0xff) & 0xff) > ((unsigned int)v308 - 1 & 0xff))
                                                    {
                                                        v307 = (char *)v307 + v311;
                                                        v313 = ((v308 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v308 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc;
                                                        v314 = (((v308 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v308 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2;
                                                        v315 = ((((((((v314 | v313) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v314 | v313) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v314 | v313) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v314 | v313) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((((v314 | v313) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v314 | v313) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v314 | v313) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v314 | v313) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                                                        if (!(v315 * 0x100000000))
                                                            v316 = 32;
                                                        else
                                                            v316 = (unsigned int)Clz(v315 * 0x100000000);
                                                        v317 = 25;
                                                        if (1 >= v316)
                                                        {
                                                            if (v316)
                                                            {
                                                                if (v316 == 1)
                                                                {
                                                                    if (v312 <= 1)
                                                                        goto LABEL_c56010;
                                                                    v318 = *v307;
                                                                    goto LABEL_c55dfc;
                                                                }
                                                            }
                                                            else
                                                            {
                                                                if (v310 == v311)
                                                                    goto LABEL_c56010;
                                                                v318 = *(char *)v307;
                                                                goto LABEL_c55dfc;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            if (v316 != 2)
                                                            {
                                                                if (v316 == 3)
                                                                {
                                                                    if (v312 <= 7)
                                                                        goto LABEL_c56010;
                                                                    v318 = *((char *)&v307[3] + 1) * 0x100000000000000 | (*(int *)v307 * 0x100 | (v307[2] | (char)v307[3] * 0x10000) * 0x10000000000) >> 8;
                                                                    goto LABEL_c55dfc;
                                                                }
                                                            }
                                                            else
                                                            {
                                                                if (v312 > 3)
                                                                {
                                                                    v318 = *(int *)v307;
LABEL_c55dfc:
                                                                    v114 = v318;
                                                                    goto LABEL_c55e00;
                                                                }
                                                                else
                                                                {
LABEL_c56010:
                                                                    v308 = 0;
                                                                    v317 = 19;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        v317 = 25;
                                                    }
                                                }
                                                *(unsigned long long *)&v147[8] = v317 & 0xffffffffffff0000 | (v317 & 0xffffffffffff00ff | (v308 * 0x100 | v308 >> 56) & 0xff00) & 0xffff;
                                                *(unsigned short **)&v147[16] = v307;
                                                break;
                                            default:
LABEL_c55e00:
                                                return _memcpy(v147, &v55, 448);
                                            }
                                            goto LABEL_c55db4;
                                        }
                                        else
                                        {
                                            v239 = sub_c573e8(&v121, &v136);
                                            v14 = *(unsigned long long *)&v125;
                                            v10 = v121;
                                            v11 = *(unsigned long long *)((void*)&v125 + 8);
                                            if (v10 == 0x8000000000000000)
                                            {
                                                v223 = (unsigned int)v14 & 0xff;
                                                idx = v14 >> 8;
                                                iter = v11;
                                            }
                                            else
                                            {
                                                v239 = sub_c576c4(&v121, &v136);
                                                v223 = (char)v121;
                                                if ((unsigned int)v223 == 82)
                                                {
                                                    j = *(unsigned long long *)&v125;
                                                    v257 = 0;
                                                    if (j)
                                                    {
                                                        v290 = 0;
                                                        v9 = 8;
                                                        v6 = v26 | v25 * 0x100;
                                                        do
                                                        {
                                                            v239 = sub_c57770(&v121, &v136, (unsigned int)v6 | 0x50000, v14, v11);
                                                            v291 = v121;
                                                            v292 = *(unsigned long long *)&v125;
                                                            iter = *(unsigned long long *)((void*)&v125 + 8);
                                                            if (v291 == 46)
                                                            {
                                                                v223 = (unsigned int)v292 & 0xff;
                                                                idx = v292 >> 8;
                                                                goto LABEL_c564f4;
                                                            }
                                                            if (v290 == *(unsigned long long *)&v138)
                                                            {
                                                                v239 = sub_c6c3c4(&v138);
                                                                v9 = *(unsigned long long *)((void*)&v138 + 8);
                                                            }
                                                            v290 += 1;
                                                            v293 = v9 + v257;
                                                            *v293 = v291;
                                                            v293[1] = v292;
                                                            v293[2] = iter;
                                                            v139 = v290;
                                                            v257 += 24;
                                                        } while (j != v290);
                                                        v257 = 0;
                                                        v141 = CONCAT(8, 0);
                                                        v143 = 0;
                                                        if (5 > (unsigned int)v30)
                                                            goto LABEL_c56594;
                                                        goto LABEL_c565c0;
                                                    }
                                                    else
                                                    {
                                                        v141 = CONCAT(8, 0);
                                                        v143 = 0;
                                                        goto LABEL_c565c0;
                                                    }
                                                }
                                                else
                                                {
                                                    idx = *(unsigned int *)((void*)&v121 + 1) | (*(unsigned short *)((void*)&v121 + 5) | *(char *)((void*)&v121 + 7) * 0x10000) * 0x100000000;
                                                    iter = *(unsigned long long *)&v125;
LABEL_c56524:
                                                    if (v10)
                                                        v239 = _free(v14);
                                                }
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    v223 = 31;
LABEL_c5618c:
LABEL_c55df4:
                                }
                            }
                            else
                            {
                                iter = &v265->field_1;
                                idx = 0;
LABEL_c561b4:
                                v223 = 19;
                            }
                        }
                        else
                        {
                            idx = 0;
                            v223 = 19;
                            iter = v276;
                        }
                    }
                }
                else if (v273)
                {
                    v261 = v265->field_1;
                    v223 = 25;
                    if (((v261 ^ v261 - 1 & 0xff) & 0xff) > (v261 - 1 & 0xff) && v261 & 15)
                    {
                        if (v268 == 3)
                        {
                            iter = &v265->field_2;
                            goto LABEL_c561b4;
                        }
                        else
                        {
                            v273 = v268 - 4;
                            v137 = v273;
                            if (v265->field_2)
                            {
                                v223 = 0x44;
                                goto LABEL_c5618c;
                            }
                            else
                            {
                                iter = &v265->field_3;
                                goto LABEL_c560b0;
                            }
                        }
                        goto LABEL_c5618c;
                    }
                    else
                    {
                        idx = v261 & 0xff;
                    }
                }
                else
                {
                    v223 = 19;
                    idx = 0;
                }
            }
        }
        else
        {
LABEL_c55e8c:
            idx = 0;
            v223 = 19;
            iter = v265;
        }
        v260 = v223 & 0xffffffff | idx * 0x100;
LABEL_c561c0:
        *(unsigned long long *)&v147[8] = v260;
        *(unsigned long long *)&v147[16] = iter;
        *(unsigned long long *)v147 = 2;
LABEL_c561cc:
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v319 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v319 & 1))
        {
            /* unsupported instruction */;
            v239 = sub_c53420(v109);
        }
        if (v70 == 47)
            return v239;
        if (v79)
            _free(ptr2);
        if (v82)
            _free(*&(&v82)[1]);
        if (!v85)
            return _free(*&(&v88)[1]);
        _free(v86);
        return _free(*&(&v88)[1]);
    }
    sub_c73bb0(0);
    goto LABEL_c550dc;
    goto LABEL_c550dc;
}
