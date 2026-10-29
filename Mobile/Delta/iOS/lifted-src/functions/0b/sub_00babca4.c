/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbabca4..0xbad9a8 (7428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_babca4_7 {
    unsigned long long field_0;
    unsigned long long field_8[2];
    char field_10;
} st_babca4_7;

typedef struct st_babca4_3 {
    char padding_0[8];
    unsigned long long field_8[2];
    char field_10;
    char padding_11[7];
    unsigned long long field_18;
} st_babca4_3;

typedef struct st_babca4_5 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
} st_babca4_5;

typedef struct st_babca4_6 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18[2];
    char field_20;
} st_babca4_6;

typedef struct st_babca4_0 {
    char padding_0[288];
    char field_120;
    char padding_121[31];
    struct st_babca4_1 *field_140;
    unsigned long long field_148;
    char padding_150[16];
    void* field_160;
    unsigned long long field_168;
    unsigned long long field_170;
    unsigned long long field_178;
    struct st_babca4_1 *field_180;
    unsigned long long field_188;
    char padding_190[48];
    struct st_babca4_1 *field_1c0;
    unsigned long long field_1c8;
} st_babca4_0;

typedef struct st_babca4_1 {
    unsigned long long field_0;
} st_babca4_1;

typedef struct st_babca4_4 {
    struct st_babca4_4 *field_0;
} st_babca4_4;

typedef struct st_babca4_2 {
    unsigned long long field_0;
    char field_8;
} st_babca4_2;

extern long long g_ef83f8;
extern long long g_ef8608;
extern long long g_ef8620;
extern long long g_ef8638;
extern long long g_ef8650;
extern long long g_ef8668;
extern long long g_ef8818;
extern long long g_ef8830;
extern long long g_ef8848;
extern long long g_ef8860;
extern long long g_ef8878;
extern long long g_ef8890;
extern long long g_ef88a8;
extern long long g_ef88c0;
extern long long g_ef88d8;
extern long long g_ef8aa0;
extern long long g_ef8ab8;
extern long long g_ef8ad0;
extern long long g_ef8ae8;
extern long long g_ef8c08;
extern long long g_ef8c20;

unsigned long long sub_babca4(st_babca4_0 *a0, unsigned long a1, long long a2)
{
    st_babca4_5 *v34;  // x19
    unsigned long v35;  // x8
    unsigned long v44;  // x9
    unsigned long v134;  // d0
    unsigned long v135;  // x11
    unsigned long long v136;  // 4175
    unsigned long long v137;  // 4177
    unsigned long long v138;  // x11
    char v139;  // x10
    unsigned long long v140;  // 4102
    unsigned long long v141;  // 4102
    unsigned long long v142;  // x0
    unsigned long long v143;  // x9
    unsigned long v45;  // x8
    unsigned long long v144;  // x12
    void* v145;  // x8
    unsigned long v146;  // x11
    __m128i v147;  // q0
    unsigned long long v148;  // x14
    __m128i v149;  // q2
    unsigned long v151;  // x12
    unsigned long long v152;  // x15
    uint128_t v153;  // q2
    unsigned long long v46;  // x8
    unsigned int v154;  // s2
    unsigned long v156;  // x12
    unsigned long long v157;  // x15
    unsigned long long v158;  // 4150
    unsigned long long v159;  // 4152
    unsigned long long v160;  // x12
    unsigned long long v161;  // x13
    long long *v162;  // x12
    unsigned long long v163;  // x12
    unsigned long v47;  // x10
    st_babca4_2 *v164;  // x9
    __m128i v165;  // q1
    unsigned long v166;  // d0
    unsigned long long v167;  // x10
    unsigned long v168;  // d0
    unsigned long v169;  // x11
    unsigned long long v170;  // 4175
    unsigned long long v171;  // 4177
    unsigned long long v172;  // x11
    char v173;  // x10
    unsigned long long v48;  // x9
    unsigned long long v174;  // 4102
    unsigned long long v175;  // 4102
    unsigned long long v176;  // x22
    unsigned long long v177;  // x8
    unsigned long v178;  // x25
    unsigned long v179;  // x24
    unsigned long long node;  // x9
    unsigned long long v181;  // x0
    long long v182;  // x10
    unsigned long long *v183;  // x13
    unsigned long long v49;  // x11
    unsigned long v184;  // x12
    unsigned long long *v185;  // x16
    unsigned long v186;  // x15
    unsigned long long v187;  // x0
    void* v188;  // x17
    unsigned long long *v189;  // x26
    unsigned long long v190;  // x8
    unsigned long long v191;  // x2
    __m128i v192;  // q0
    unsigned long long v193;  // x2
    unsigned long long v50;  // x22
    __m128i v194;  // q1
    unsigned long v196;  // x3
    unsigned long long v197;  // x3
    __m128i v198;  // q1
    unsigned long v201;  // x3
    unsigned long long v202;  // x3
    unsigned long long v203;  // 4150
    unsigned long long v51;  // x10
    unsigned long long v204;  // 4152
    unsigned long long v205;  // x4
    void* v206;  // x6
    unsigned long long v207;  // x4
    unsigned long long v208;  // x5
    unsigned long long v209;  // x0
    __m128i v210;  // q0
    unsigned long long v211;  // x6
    __m128i v212;  // q1
    unsigned long long v52;  // x8
    unsigned long v214;  // x7
    unsigned long long v215;  // x7
    __m128i v216;  // q1
    unsigned long v219;  // x7
    unsigned long long v220;  // x7
    unsigned long long v221;  // 4150
    unsigned long long v222;  // 4152
    unsigned long long v223;  // x23
    unsigned long long v53;  // x9
    void* v224;  // x25
    unsigned long long v225;  // x23
    unsigned long v226;  // x5
    unsigned long long v227;  // 4102
    unsigned long long v228;  // 4102
    unsigned long long v229;  // x2
    unsigned long long v230;  // x3
    __m128i v231;  // q1
    unsigned long long v232;  // x3
    __m128i v233;  // q2
    unsigned long long v36;  // 4118
    unsigned long long v54;  // x11
    unsigned long v235;  // x4
    unsigned long long v236;  // x4
    __m128i v237;  // q2
    unsigned long v240;  // x4
    unsigned long long v241;  // x4
    unsigned long long v242;  // 4152
    unsigned long long v243;  // 4154
    unsigned long long v55;  // x24
    unsigned long long v244;  // x6
    void* v245;  // x6
    unsigned long long v246;  // x6
    unsigned long long v247;  // x2
    unsigned long long v248;  // x5
    unsigned long long *v249;  // x4
    unsigned long v250;  // x3
    __m128i v251;  // q1
    unsigned long long v252;  // x5
    __m128i v253;  // q2
    unsigned long long v56;  // w0
    unsigned long v255;  // x6
    unsigned long long v256;  // x6
    __m128i v257;  // q2
    unsigned long v260;  // x6
    unsigned long long v261;  // x6
    unsigned long long v262;  // 4152
    unsigned long long v263;  // 4154
    unsigned long long v57;  // x23
    unsigned long long v264;  // x7
    unsigned long long v265;  // x7
    unsigned int v266;  // w8
    unsigned long long v267;  // x11
    unsigned long long v268;  // w28
    void* v269;  // x9
    unsigned long v270;  // x10
    unsigned long long v271;  // x14
    __m128i v272;  // q1
    unsigned long long v58;  // x22
    unsigned long v274;  // x12
    unsigned long long v275;  // x15
    __m128i v276;  // q1
    unsigned long v279;  // x12
    unsigned long long v280;  // x15
    unsigned long long v281;  // 4150
    unsigned long long v282;  // 4152
    unsigned long long v283;  // x12
    unsigned long long *v59;  // x24
    unsigned long long v284;  // x13
    long long *v285;  // x12
    unsigned long long v286;  // x12
    st_babca4_2 *v287;  // x8
    __m128i v288;  // q1
    unsigned long v289;  // d0
    unsigned long long v290;  // x10
    unsigned long v291;  // d0
    unsigned long v292;  // x11
    unsigned long long v293;  // 4175
    unsigned long long v60;  // x8
    unsigned long long v294;  // 4177
    unsigned long long v295;  // x11
    char v296;  // x10
    unsigned long long v297;  // 4102
    unsigned long long v298;  // 4102
    unsigned long long v299;  // x8
    unsigned long long v300;  // x12
    void* v301;  // x11
    unsigned long v302;  // x10
    __m128i v303;  // q0
    unsigned long long v61;  // 4118
    unsigned long long v304;  // x12
    __m128i v305;  // q1
    unsigned long v307;  // x13
    unsigned long long v308;  // x13
    __m128i v309;  // q1
    unsigned long v312;  // x13
    unsigned long long v313;  // x13
    unsigned long long *v62;  // x25
    unsigned long long v314;  // 4150
    unsigned long long v315;  // 4152
    unsigned long long v316;  // x14
    unsigned long long *v317;  // x14
    unsigned long long v318;  // x14
    unsigned long v319;  // x26
    unsigned long long *v320;  // x25
    unsigned long long v321;  // x8
    unsigned long long v322;  // x12
    unsigned long long v323;  // x12
    unsigned long v63;  // x8
    unsigned long long v324;  // x12
    __m128i v325;  // q1
    unsigned long v327;  // x13
    unsigned long long v328;  // x13
    unsigned long long v329;  // x13
    unsigned long long v330;  // 4150
    unsigned long long v331;  // 4152
    unsigned long long v332;  // x14
    unsigned long long *v333;  // x25
    st_babca4_6 *v37;  // x27
    unsigned long long v64;  // x8
    unsigned long long v334;  // x14
    uint128_t v335;  // q1
    unsigned long long v337;  // x25
    unsigned long long v338;  // x28
    unsigned long v339;  // x9
    unsigned long v340;  // x8
    unsigned long long v341;  // 4122
    unsigned long long *v342;  // x26
    unsigned long v343;  // x8
    unsigned long long v65;  // 4118
    unsigned long long v344;  // x8
    unsigned long long v345;  // 4123
    unsigned long long *v346;  // x22
    unsigned long v347;  // x23
    unsigned long long v348;  // w0
    unsigned long long *v349;  // x0
    unsigned long v350;  // x8
    unsigned long long v351;  // x8
    unsigned long long v352;  // x26
    unsigned long long *v353;  // x0
    unsigned long v66;  // x20
    unsigned long v354;  // x8
    unsigned long long v355;  // x9
    unsigned long long v356;  // x12
    void* v357;  // x8
    unsigned long v358;  // x11
    __m128i v359;  // q0
    unsigned long long v360;  // x14
    __m128i v361;  // q1
    unsigned long v363;  // x12
    unsigned long long v67;  // w0
    unsigned long long v364;  // x15
    uint128_t v365;  // q1
    unsigned long v368;  // x12
    unsigned long long v369;  // x15
    unsigned long long v370;  // 4150
    unsigned long long v371;  // 4152
    unsigned long long v372;  // x12
    unsigned long long v373;  // x13
    unsigned long long v68;  // x8
    unsigned long long *v374;  // x12
    unsigned long long v375;  // x12
    st_babca4_2 *v376;  // x9
    __m128i v377;  // q1
    unsigned long v378;  // d0
    unsigned long long v379;  // x10
    unsigned long v380;  // d0
    unsigned long v381;  // x11
    unsigned long long v382;  // 4175
    unsigned long long v383;  // 4177
    unsigned long long v69;  // 4102
    unsigned long long v384;  // x11
    char v385;  // x10
    unsigned long long v386;  // 4102
    unsigned long long v387;  // 4102
    unsigned long long v388;  // x25
    st_babca4_2 *v389;  // x8
    unsigned long long v390;  // x24
    unsigned long long v391;  // x0
    unsigned long long v392;  // x25
    unsigned long v393;  // x8
    unsigned long long v70;  // x21
    unsigned long long v394;  // x22
    unsigned long long v395;  // x20
    unsigned long long v396;  // x23
    unsigned long v397;  // x8
    unsigned long long v398;  // 4114
    unsigned long long v399;  // x0
    unsigned long long v400;  // x8
    unsigned long long v401;  // x8
    unsigned long long v402;  // x8
    st_babca4_3 *v403;  // x10
    unsigned long v71;  // x8
    unsigned long long v404;  // 4102
    st_babca4_4 **v405;  // x1
    unsigned long long v406;  // 4102
    unsigned long v407;  // x8
    unsigned long v408;  // x9
    unsigned long long v409;  // x10
    unsigned long long v410;  // x8
    unsigned long long v411;  // x9
    unsigned long long v412;  // x11
    unsigned long v72;  // x8
    unsigned long long v73;  // x8
    unsigned long v38;  // x8
    unsigned long long v74;  // 4102
    unsigned long long v75;  // x8
    unsigned long long v76;  // x12
    unsigned long v457;  // x8
    long long v458;  // x0
    unsigned long long *v77;  // x10
    unsigned long v78;  // x9
    __m128i v79;  // q0
    unsigned long long v80;  // x12
    __m128i v81;  // q2
    unsigned long v83;  // x13
    unsigned long long v39;  // 4118
    unsigned long long v84;  // x13
    __m128i v85;  // q2
    unsigned long v88;  // x13
    unsigned long long v89;  // x13
    unsigned long long v90;  // 4150
    unsigned long long v91;  // 4152
    unsigned long long v92;  // x14
    void* v93;  // x14
    st_babca4_6 *v40;  // x20
    unsigned long long v94;  // x14
    uint128_t v95;  // q0
    unsigned long long v96;  // 4102
    unsigned long v97;  // x8
    unsigned long long v98;  // 4125
    unsigned long long v99;  // x0
    unsigned long long v100;  // x8
    long long v101;  // x0
    unsigned long long v102;  // x8
    unsigned long v103;  // x10
    st_babca4_7 *v41;  // x20
    unsigned long long v104;  // x9
    unsigned long long v105;  // x11
    unsigned long long v106;  // x8
    unsigned long long v107;  // x10
    unsigned long long v108;  // x11
    unsigned long long v109;  // x9
    unsigned long long v110;  // x12
    void* v111;  // x8
    unsigned long v112;  // x11
    __m128i v113;  // q0
    unsigned long v42;  // x1
    unsigned long long v114;  // x14
    __m128i v115;  // q2
    unsigned long v117;  // x12
    unsigned long long v118;  // x15
    uint128_t v119;  // q2
    unsigned int v120;  // s2
    unsigned long v122;  // x12
    unsigned long long v123;  // x15
    unsigned long long v43;  // x0
    unsigned long long v124;  // 4150
    unsigned long long v125;  // 4152
    unsigned long long v126;  // x12
    unsigned long long v127;  // x13
    long long *v128;  // x12
    unsigned long long v129;  // x12
    st_babca4_2 *v130;  // x9
    __m128i v131;  // q1
    unsigned long v132;  // d0
    unsigned long long v133;  // x10
    unsigned long long v0;  // [bp-0x164]
    unsigned long long *v1;  // [bp-0x160]
    unsigned long long v2;  // [bp-0x158]
    unsigned long long iter;  // [bp-0x154]
    uint128_t v4;  // [bp-0x150]
    unsigned long long v5;  // [bp-0x140]
    unsigned long long v6;  // [bp-0x140]
    unsigned long v7;  // [bp-0x138]
    unsigned long long v8;  // [bp-0x130]
    unsigned long long v9;  // [bp-0x128]
    unsigned long long v10;  // [bp-0x120]
    unsigned long v11;  // [bp-0x118]
    unsigned long long v12;  // [bp-0x110]
    unsigned long long v13;  // [bp-0x108]
    unsigned long long v14;  // [bp-0x100]
    unsigned long v15;  // [bp-0xf8]
    unsigned long v16;  // [bp-0xe8]
    uint128_t v17;  // [bp-0xe0], Other Possible Types: unsigned long long
    unsigned long long v18;  // [bp-0xd8]
    unsigned long v19;  // [bp-0xd0], Other Possible Types: unsigned long long
    unsigned long v20;  // [bp-0xc8], Other Possible Types: unsigned long long
    unsigned long long v21;  // [bp-0xc0]
    unsigned long long v22;  // [bp-0xb8]
    unsigned long v23;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned long long v24;  // [bp-0xa8]
    unsigned long long v25;  // [bp-0xa0]
    unsigned long long v26;  // [bp-0x98]
    unsigned long v27;  // [bp-0x90]
    unsigned long v28;  // [bp-0x88]
    uint128_t v29;  // [bp-0x80], Other Possible Types: unsigned long long
    long long v30;  // [bp-0x78]
    unsigned long long v31;  // [bp-0x70]
    char *v32;  // [bp-0x10]
    char v33;  // [bp+0x0]

    v32 = &v33;
    v34 = *(long long *)sub_ba9cf8();
    v35 = v34->field_0;
    v34->field_0 = v35 + 1;
    v36 = arm64g_calculate_condition(0x22, v35, 1, 0);
    if (!(v36 & 1) && (v37 = *(long long *)sub_ba9cf8(a0, a2), v38 = v37->field_0, v37->field_0 = v38 + 1, v39 = arm64g_calculate_condition(0x22, v38, 1, 0), !(v39 & 1)))
    {
        if (0x7fffffffffffffff <= v34->field_10)
        {
            v101 = &g_ef8aa0;
            goto LABEL_bad5c4;
        }
        v34->field_10 = v34->field_10 + 1;
        v40 = v37;
        v41 = &v40->field_10;
        if (0x7fffffffffffffff > v40->field_10)
        {
            v37->field_10 = v40->field_10 + 1;
            v42 = v37->field_18;
            v43 = sub_bd1104(&v34->field_18, v42);
            v41->field_0 = v41->field_0 - 1;
            v44 = v34->field_10;
            v45 = v44 - 1;
            v34->field_10 = v45;
            if (v43 & 1)
            {
LABEL_babd5c:
                v70 = 1;
                v71 = v37->field_0;
                v37->field_0 = v71 - 1;
                if (v71 == 1)
                    goto LABEL_babd70;
                goto LABEL_babd78;
            }
            if ((long long)v44 < 1)
            {
LABEL_bad55c:
                v101 = &g_ef8ad0;
                goto LABEL_bad5c4;
            }
            if (v34[1].field_0 != 1)
            {
                v29 = 0;
                v30 = 8;
                v31 = 0;
                goto LABEL_babe38;
            }
            if (0x7ffffffffffffffe < v41->field_0)
            {
                v101 = &g_ef8ae8;
                goto LABEL_bad5c4;
            }
            v45 = v34->field_10;
            if (*(long long *)&v37->field_20 != 1)
            {
                v29 = 0;
                v30 = 8;
                v31 = 0;
                if (0x7fffffffffffffff > v45)
                {
LABEL_babe38:
                    v34->field_10 = v45 + 1;
                    if (0x7fffffffffffffff > v41->field_0)
                    {
                        v41->field_0 = v41->field_0 + 1;
                        v102 = *(long long *)&v34->field_18;
                        if (v102)
                        {
                            v103 = v34->field_20;
                            v104 = v34[1].field_0;
                            v105 = 1;
                        }
                        else
                        {
                            v105 = 0;
                            v104 = 0;
                        }
                        v4 = v105;
                        v5 = v102;
                        v7 = v103;
                        v8 = v105;
                        v9 = 0;
                        v10 = v102;
                        v11 = v103;
                        v12 = v104;
                        v13 = 0;
                        v106 = v37->field_18[0];
                        if (v106)
                        {
                            v104 = v37->field_18[1];
                            v107 = *(long long *)&v37->field_20;
                            v108 = 1;
                        }
                        else
                        {
                            v108 = 0;
                            v107 = 0;
                        }
                        v16 = v108;
                        v17 = 0;
                        v18 = v106;
                        v19 = v104;
                        v20 = v108;
                        v21 = 0;
                        v22 = v106;
                        v23 = v104;
                        v24 = v107;
                        v25 = 0;
                        v13 = 1;
                        v14 = sub_bd11f0(&v4);
                        v15 = v42;
                        if (!v14)
                        {
                            v458 = &g_ef8638;
                            goto LABEL_bad5a8;
                        }
                        v109 = 0;
                        v110 = 5871781006564002453 * (*(long long *)v42 + 8);
                        v111 = a0->field_160;
                        v112 = a0->field_168;
                        v113 = v110 >> 57 & 0xff | (v110 >> 57 & 0xff) * 0x100 | (v110 >> 57 & 0xff | (v110 >> 57 & 0xff) * 0x100) * 0x10000 | (v110 >> 57 & 0xff | (v110 >> 57 & 0xff) * 0x100 | (v110 >> 57 & 0xff | (v110 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                        v114 = v110 & v112;
                        v115 = *(long long *)((char *)v111 + v114);
                        v117 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v115, v113));
                        v118 = v117 & 0x8080808080808080;
                        if (!(v117 & 0x8080808080808080))
                            goto LABEL_babf44;
                        do
                        {
                            v109 += 8;
                            v114 = v114 + v109 & v112;
                            v115 = *(long long *)((char *)v111 + v114);
                            v122 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v115, v113));
                            v118 = v122 & 0x8080808080808080;
                            if (v122 & 0x8080808080808080)
                            {
                                do
                                {
                                    v123 = v118;
                                    v124 = ((((((v123 & 0xaaaaaaaaaaaaaaaa) >> 1 | v123 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v123 & 0xaaaaaaaaaaaaaaaa) >> 1 | v123 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v123 & 0xaaaaaaaaaaaaaaaa) >> 1 | v123 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v123 & 0xaaaaaaaaaaaaaaaa) >> 1 | v123 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v125 = (((((((v123 & 0xaaaaaaaaaaaaaaaa) >> 1 | v123 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v123 & 0xaaaaaaaaaaaaaaaa) >> 1 | v123 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v123 & 0xaaaaaaaaaaaaaaaa) >> 1 | v123 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v123 & 0xaaaaaaaaaaaaaaaa) >> 1 | v123 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v126 = ((((v125 | v124) & 0xffff0000ffff0000) >> 16 | (v125 | v124) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v125 | v124) & 0xffff0000ffff0000) >> 16 | (v125 | v124) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v127 = v114 + ((!v126 ? 64 : Clz(v126)) >> 3) & v112;
                                    v128 = v111 - v127 * 16;
                                    if (*(long long *)v42 == *(long long *)((char *)v128 - 16))
                                    {
                                        v130 = v111 + (v127 - 8 & v112);
                                        v131 = _mm_set1_epi32(-1);
                                        v132 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(unsigned long long *)&*(double *)&v130->field_0, v131));
                                        v133 = __double_as_longlong(v132);
                                        v134 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(long long *)((char *)v111 + v127), v131));
                                        v135 = __double_as_longlong(v134);
                                        v136 = ((((((v135 & 0xaaaaaaaaaaaaaaaa) >> 1 | v135 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v135 & 0xaaaaaaaaaaaaaaaa) >> 1 | v135 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v135 & 0xaaaaaaaaaaaaaaaa) >> 1 | v135 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v135 & 0xaaaaaaaaaaaaaaaa) >> 1 | v135 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v137 = (((((((v135 & 0xaaaaaaaaaaaaaaaa) >> 1 | v135 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v135 & 0xaaaaaaaaaaaaaaaa) >> 1 | v135 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v135 & 0xaaaaaaaaaaaaaaaa) >> 1 | v135 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v135 & 0xaaaaaaaaaaaaaaaa) >> 1 | v135 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v138 = ((((v137 | v136) & 0xffff0000ffff0000) >> 16 | (v137 | v136) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v137 | v136) & 0xffff0000ffff0000) >> 16 | (v137 | v136) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (((!v138 ? 64 : Clz(v138)) >> 3) + ((!v133 ? 64 : Clz(v133)) >> 3) > 7)
                                        {
                                            v139 = 128;
                                        }
                                        else
                                        {
                                            a0->field_170 = a0->field_170 + 1;
                                            v139 = 0xff;
                                        }
                                        *((char *)v111 + v127) = v139;
                                        v130->field_8 = v139;
                                        a0->field_178 = a0->field_178 - 1;
                                        do
                                        {
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                        } while (/* unsupported instruction */ ^ 1);
                                        v140 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                        if (!(v140 & 1))
                                        {
                                            /* unsupported instruction */;
                                            sub_b86a90();
                                        }
                                        do
                                        {
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                        } while (/* unsupported instruction */ ^ 1);
                                        v141 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                        if (!(v141 & 1))
                                        {
                                            /* unsupported instruction */;
                                            sub_b86a90(*(long long *)((char *)v128 - 8));
                                            goto LABEL_bac028;
                                        }
                                    }
                                } while ((v129 = v123 - 1, v118 = v129 & v123, v129 & v123));
                            }
LABEL_babf44:
                        } while ((v119 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v115, _mm_set1_epi8(-1))), v120 = __dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))))))), !((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v119, v119), _mm_unpacklo_epi64(v119, v119)))))))))) & 1)));
LABEL_bac028:
                        if (v25 == 1)
                        {
                            v142 = v26;
                        }
                        else
                        {
                            v142 = sub_bd11f0(&v16);
                            v25 = 1;
                            v26 = v142;
                            v27 = v42;
                        }
                        if (v142)
                        {
                            v143 = 0;
                            v144 = 5871781006564002453 * (*(long long *)v27 + 8);
                            v145 = a0->field_160;
                            v146 = a0->field_168;
                            v147 = v144 >> 57 & 0xff | (v144 >> 57 & 0xff) * 0x100 | (v144 >> 57 & 0xff | (v144 >> 57 & 0xff) * 0x100) * 0x10000 | (v144 >> 57 & 0xff | (v144 >> 57 & 0xff) * 0x100 | (v144 >> 57 & 0xff | (v144 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                            v148 = v144 & v146;
                            v149 = *(long long *)((char *)v145 + v148);
                            v151 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v149, v147));
                            v152 = v151 & 0x8080808080808080;
                            if (!(v151 & 0x8080808080808080))
                                goto LABEL_bac0bc;
                            do
                            {
                                v143 += 8;
                                v148 = v148 + v143 & v146;
                                v149 = *(long long *)((char *)v145 + v148);
                                v156 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v149, v147));
                                v152 = v156 & 0x8080808080808080;
                                if (v156 & 0x8080808080808080)
                                {
                                    do
                                    {
                                        v157 = v152;
                                        v158 = ((((((v157 & 0xaaaaaaaaaaaaaaaa) >> 1 | v157 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v157 & 0xaaaaaaaaaaaaaaaa) >> 1 | v157 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v157 & 0xaaaaaaaaaaaaaaaa) >> 1 | v157 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v157 & 0xaaaaaaaaaaaaaaaa) >> 1 | v157 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v159 = (((((((v157 & 0xaaaaaaaaaaaaaaaa) >> 1 | v157 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v157 & 0xaaaaaaaaaaaaaaaa) >> 1 | v157 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v157 & 0xaaaaaaaaaaaaaaaa) >> 1 | v157 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v157 & 0xaaaaaaaaaaaaaaaa) >> 1 | v157 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v160 = ((((v159 | v158) & 0xffff0000ffff0000) >> 16 | (v159 | v158) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v159 | v158) & 0xffff0000ffff0000) >> 16 | (v159 | v158) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        v161 = v148 + ((!v160 ? 64 : Clz(v160)) >> 3) & v146;
                                        v162 = v145 - v161 * 16;
                                        if (*(long long *)v27 == *(long long *)((char *)v162 - 16))
                                        {
                                            v164 = v145 + (v161 - 8 & v146);
                                            v165 = _mm_set1_epi32(-1);
                                            v166 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(unsigned long long *)&*(double *)&v164->field_0, v165));
                                            v167 = __double_as_longlong(v166);
                                            v168 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(long long *)((char *)v145 + v161), v165));
                                            v169 = __double_as_longlong(v168);
                                            v170 = ((((((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v171 = (((((((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v172 = ((((v171 | v170) & 0xffff0000ffff0000) >> 16 | (v171 | v170) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v171 | v170) & 0xffff0000ffff0000) >> 16 | (v171 | v170) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            if (((!v172 ? 64 : Clz(v172)) >> 3) + ((!v167 ? 64 : Clz(v167)) >> 3) > 7)
                                            {
                                                v173 = 128;
                                            }
                                            else
                                            {
                                                a0->field_170 = a0->field_170 + 1;
                                                v173 = 0xff;
                                            }
                                            *((char *)v145 + v161) = v173;
                                            v164->field_8 = v173;
                                            a0->field_178 = a0->field_178 - 1;
                                            do
                                            {
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                            } while (/* unsupported instruction */ ^ 1);
                                            v174 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                            if (!(v174 & 1))
                                            {
                                                /* unsupported instruction */;
                                                sub_b86a90();
                                            }
                                            do
                                            {
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                            } while (/* unsupported instruction */ ^ 1);
                                            v175 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                            if (!(v175 & 1))
                                            {
                                                /* unsupported instruction */;
                                                sub_b86a90(*(long long *)((char *)v162 - 8));
                                                goto LABEL_bac1a0;
                                            }
                                        }
                                    } while ((v163 = v157 - 1, v152 = v163 & v157, v163 & v157));
                                }
LABEL_bac0bc:
                            } while ((v153 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v149, _mm_set1_epi8(-1))), v154 = __dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))))))), !((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))))))) & 1)));
LABEL_bac1a0:
                            iter = 0;
                            v176 = 0;
                            while (1)
                            {
                                if (v25 == 1)
                                {
                                    v177 = v13;
                                    if (!v26)
                                        goto LABEL_bac224;
                                    goto LABEL_bac1c4;
                                }
                                v25 = 1;
                                v26 = sub_bd11f0(&v16);
                                v27 = v42;
                                v177 = v13;
                                if (v26)
                                {
LABEL_bac1c4:
                                    if (v177 == 1)
                                    {
                                        if (!v14)
                                            goto LABEL_bac268;
                                        goto LABEL_bac1d4;
                                    }
                                    v13 = 1;
                                    v14 = sub_bd11f0(&v4);
                                    v15 = v42;
                                    if (v14)
                                    {
LABEL_bac1d4:
                                        v178 = v15;
                                        v179 = v27;
                                        v42 = *(long long *)v178;
                                        if (!sub_bad9a8(a0, v42, *(long long *)v179))
                                            goto LABEL_bac26c;
                                        v2 = 0;
                                        v176 = (unsigned int)v176 + 1;
                                        v13 = 0;
                                        v179 = v178;
                                        node = v31;
                                        if (node)
                                            goto LABEL_bac288;
                                    }
                                    else
                                    {
LABEL_bac268:
                                        v179 = v27;
LABEL_bac26c:
                                        v25 = 0;
                                        v2 = 1;
                                        iter += 1;
                                        node = v31;
                                        if (node)
                                        {
LABEL_bac288:
                                            v182 = v30;
                                            v183 = a0->field_180;
                                            v184 = a0->field_188;
                                            v185 = a0->field_1c0;
                                            v186 = a0->field_1c8;
                                            while (1)
                                            {
                                                if (!*(long long *)&a0->padding_190[8])
                                                {
LABEL_bacc70:
                                                    goto LABEL_bacc78;
                                                }
                                                v187 = 0;
                                                v188 = v182 + node * 16;
                                                v189 = *(long long *)((char *)v188 - 16);
                                                v190 = *(long long *)v179;
                                                v191 = 5871781006564002453 * (*v189 + 8);
                                                v192 = v191 >> 57 & 0xff | (v191 >> 57 & 0xff) * 0x100 | (v191 >> 57 & 0xff | (v191 >> 57 & 0xff) * 0x100) * 0x10000 | (v191 >> 57 & 0xff | (v191 >> 57 & 0xff) * 0x100 | (v191 >> 57 & 0xff | (v191 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                                v193 = v191 & v184;
                                                v194 = *(long long *)((char *)v183 + v193);
                                                v196 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v194, v192));
                                                v197 = v196 & 0x8080808080808080;
                                                if (!(v196 & 0x8080808080808080))
                                                {
                                                    do
                                                    {
LABEL_bac310:
                                                        v198 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v194, _mm_set1_epi8(-1)));
                                                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v198, v198), _mm_unpacklo_epi64(v198, v198)))))))))) & 1)
                                                            goto LABEL_bacc70;
                                                        v187 += 8;
                                                        v193 = v193 + v187 & v184;
                                                        v194 = *(long long *)((char *)v183 + v193);
                                                        v201 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v194, v192));
                                                        v197 = v201 & 0x8080808080808080;
                                                    } while (!(v201 & 0x8080808080808080));
                                                }
                                                while (1)
                                                {
                                                    v202 = v197;
                                                    v203 = ((((((v202 & 0xaaaaaaaaaaaaaaaa) >> 1 | v202 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v202 & 0xaaaaaaaaaaaaaaaa) >> 1 | v202 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v202 & 0xaaaaaaaaaaaaaaaa) >> 1 | v202 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v202 & 0xaaaaaaaaaaaaaaaa) >> 1 | v202 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                    v204 = (((((((v202 & 0xaaaaaaaaaaaaaaaa) >> 1 | v202 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v202 & 0xaaaaaaaaaaaaaaaa) >> 1 | v202 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v202 & 0xaaaaaaaaaaaaaaaa) >> 1 | v202 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v202 & 0xaaaaaaaaaaaaaaaa) >> 1 | v202 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                    v205 = ((((v204 | v203) & 0xffff0000ffff0000) >> 16 | (v204 | v203) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v204 | v203) & 0xffff0000ffff0000) >> 16 | (v204 | v203) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                    v206 = (char *)v183 + -(40 * (v193 + ((!v205 ? 64 : Clz(v205)) >> 3) & v184));
                                                    if (*v189 == *(long long *)((char *)v206 - 40))
                                                        break;
                                                    v207 = v202 - 1;
                                                    v197 = v207 & v202;
                                                    if (!(v207 & v202))
                                                        goto LABEL_bac310;
                                                }
                                                v208 = 0;
                                                v42 = *(int *)((char *)v206 - 24);
                                                v209 = 5871781006564002453 * (v190 + 8);
                                                v210 = v209 >> 57 & 0xff | (v209 >> 57 & 0xff) * 0x100 | (v209 >> 57 & 0xff | (v209 >> 57 & 0xff) * 0x100) * 0x10000 | (v209 >> 57 & 0xff | (v209 >> 57 & 0xff) * 0x100 | (v209 >> 57 & 0xff | (v209 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                                v211 = v209 & v184;
                                                v212 = *(long long *)((char *)v183 + v211);
                                                v214 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v212, v210));
                                                v215 = v214 & 0x8080808080808080;
                                                if (!(v214 & 0x8080808080808080))
                                                {
                                                    do
                                                    {
LABEL_bac3b4:
                                                        v216 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v212, _mm_set1_epi8(-1)));
                                                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v216, v216), _mm_unpacklo_epi64(v216, v216)))))))))) & 1)
                                                            goto LABEL_bacc78;
                                                        v208 += 8;
                                                        v211 = v211 + v208 & v184;
                                                        v212 = *(long long *)((char *)v183 + v211);
                                                        v219 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v212, v210));
                                                        v215 = v219 & 0x8080808080808080;
                                                    } while (!(v219 & 0x8080808080808080));
                                                }
                                                while (1)
                                                {
                                                    v220 = v215;
                                                    v221 = ((((((v220 & 0xaaaaaaaaaaaaaaaa) >> 1 | v220 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v220 & 0xaaaaaaaaaaaaaaaa) >> 1 | v220 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v220 & 0xaaaaaaaaaaaaaaaa) >> 1 | v220 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v220 & 0xaaaaaaaaaaaaaaaa) >> 1 | v220 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                    v222 = (((((((v220 & 0xaaaaaaaaaaaaaaaa) >> 1 | v220 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v220 & 0xaaaaaaaaaaaaaaaa) >> 1 | v220 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v220 & 0xaaaaaaaaaaaaaaaa) >> 1 | v220 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v220 & 0xaaaaaaaaaaaaaaaa) >> 1 | v220 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                    v223 = ((((v222 | v221) & 0xffff0000ffff0000) >> 16 | (v222 | v221) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v222 | v221) & 0xffff0000ffff0000) >> 16 | (v222 | v221) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                    v224 = (char *)v183 + -(40 * (v211 + ((!v223 ? 64 : Clz(v223)) >> 3) & v184));
                                                    if (v190 == *(long long *)((char *)v224 - 40))
                                                        break;
                                                    v225 = v220 - 1;
                                                    v215 = v225 & v220;
                                                    if (!(v225 & v220))
                                                        goto LABEL_bac3b4;
                                                }
                                                v226 = *(int *)((char *)v224 - 24);
                                                if ((unsigned int)v42 == (unsigned int)v226)
                                                    break;
                                                if (*(long long *)&a0[1].padding_0[8])
                                                {
                                                    v229 = 0;
                                                    v230 = 5871781006564002453 * v226;
                                                    v231 = v230 >> 57 & 0xff | (v230 >> 57 & 0xff) * 0x100 | (v230 >> 57 & 0xff | (v230 >> 57 & 0xff) * 0x100) * 0x10000 | (v230 >> 57 & 0xff | (v230 >> 57 & 0xff) * 0x100 | (v230 >> 57 & 0xff | (v230 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                                    v232 = v230 & v186;
                                                    v233 = *(long long *)((char *)v185 + v232);
                                                    v235 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v233, v231));
                                                    v236 = v235 & 0x8080808080808080;
                                                    if (!(v235 & 0x8080808080808080))
                                                    {
                                                        do
                                                        {
LABEL_bac4a4:
                                                            v237 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v233, _mm_set1_epi8(-1)));
                                                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v237, v237), _mm_unpacklo_epi64(v237, v237)))))))))) & 1)
                                                                goto LABEL_bad034;
                                                            v229 += 8;
                                                            v232 = v232 + v229 & v186;
                                                            v233 = *(long long *)((char *)v185 + v232);
                                                            v240 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v233, v231));
                                                            v236 = v240 & 0x8080808080808080;
                                                        } while (!(v240 & 0x8080808080808080));
                                                    }
                                                    while (1)
                                                    {
                                                        v241 = v236;
                                                        v242 = ((((((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                        v243 = (((((((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                        v244 = ((((v243 | v242) & 0xffff0000ffff0000) >> 16 | (v243 | v242) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v243 | v242) & 0xffff0000ffff0000) >> 16 | (v243 | v242) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                        v245 = (char *)v185 + -(40 * (v232 + ((!v244 ? 64 : Clz(v244)) >> 3) & v186));
                                                        if ((unsigned int)v226 == *(int *)((char *)v245 - 40))
                                                            break;
                                                        v246 = v241 - 1;
                                                        v236 = v246 & v241;
                                                        if (!(v246 & v241))
                                                            goto LABEL_bac4a4;
                                                    }
                                                    if (*(long long *)((char *)v245 - 8))
                                                    {
                                                        v247 = 0;
                                                        v248 = 5871781006564002453 * v42;
                                                        v249 = *(long long *)((char *)v245 - 32);
                                                        v250 = *(long long *)((char *)v245 - 24);
                                                        v251 = v248 >> 57 & 0xff | (v248 >> 57 & 0xff) * 0x100 | (v248 >> 57 & 0xff | (v248 >> 57 & 0xff) * 0x100) * 0x10000 | (v248 >> 57 & 0xff | (v248 >> 57 & 0xff) * 0x100 | (v248 >> 57 & 0xff | (v248 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                                        v252 = v248 & v250;
                                                        v253 = *(long long *)((char *)v249 + v252);
                                                        v255 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v253, v251));
                                                        v256 = v255 & 0x8080808080808080;
                                                        if (!(v255 & 0x8080808080808080))
                                                        {
                                                            do
                                                            {
LABEL_bac53c:
                                                                v257 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v253, _mm_set1_epi8(-1)));
                                                                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v257, v257), _mm_unpacklo_epi64(v257, v257)))))))))) & 1)
                                                                    goto LABEL_bac580;
                                                                v247 += 8;
                                                                v252 = v252 + v247 & v250;
                                                                v253 = *(long long *)((char *)v249 + v252);
                                                                v260 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v253, v251));
                                                                v256 = v260 & 0x8080808080808080;
                                                            } while (!(v260 & 0x8080808080808080));
                                                        }
                                                        while (1)
                                                        {
                                                            v261 = v256;
                                                            v262 = ((((((v261 & 0xaaaaaaaaaaaaaaaa) >> 1 | v261 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v261 & 0xaaaaaaaaaaaaaaaa) >> 1 | v261 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v261 & 0xaaaaaaaaaaaaaaaa) >> 1 | v261 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v261 & 0xaaaaaaaaaaaaaaaa) >> 1 | v261 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                            v263 = (((((((v261 & 0xaaaaaaaaaaaaaaaa) >> 1 | v261 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v261 & 0xaaaaaaaaaaaaaaaa) >> 1 | v261 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v261 & 0xaaaaaaaaaaaaaaaa) >> 1 | v261 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v261 & 0xaaaaaaaaaaaaaaaa) >> 1 | v261 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                            v264 = ((((v263 | v262) & 0xffff0000ffff0000) >> 16 | (v263 | v262) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v263 | v262) & 0xffff0000ffff0000) >> 16 | (v263 | v262) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                            if ((unsigned int)v42 == *(int *)((char *)v249 + -4 * (v252 + ((!v264 ? 64 : Clz(v264)) >> 3) & v250) - 4))
                                                                break;
                                                            v265 = v261 - 1;
                                                            v256 = v265 & v261;
                                                            if (!(v265 & v261))
                                                                goto LABEL_bac53c;
                                                        }
                                                        goto LABEL_bac5ac;
                                                    }
LABEL_bac580:
                                                    node -= 1;
                                                    v31 = node;
                                                    v266 = *(char *)(v182 + node * 16 + 8);
                                                    iter -= v266;
                                                    v176 -= v266 ^ 1;
                                                    if (!node)
                                                        goto LABEL_bacb94;
                                                }
                                                else
                                                {
LABEL_bad034:
LABEL_bacc78:
                                                    sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in eve", 22);
                                                    goto LABEL_bad688;
                                                }
                                            }
                                            v42 = *(long long *)((char *)v224 - 32);
                                            if (*(long long *)((char *)v206 - 32) != v42)
                                            {
                                                v228 = arm64g_calculate_condition(36, *(long long *)((char *)v206 - 32), v42, 0);
                                                if (v228 & 1)
                                                    goto LABEL_bac580;
                                                goto LABEL_bac5ac;
                                            }
                                            v42 = *(long long *)((char *)v224 - 16);
                                            if (*(long long *)((char *)v206 - 16))
                                            {
                                                if (!(v42 & 1))
                                                    goto LABEL_bac578;
                                                goto LABEL_bac428;
                                            }
                                            if (!(unsigned int)v42)
                                            {
LABEL_bac428:
                                                v227 = arm64g_calculate_condition(36, *(long long *)((char *)v206 - 8), *(long long *)((char *)v224 - 8), 0);
                                                if (v227 & 1)
                                                    goto LABEL_bac580;
                                                goto LABEL_bac5ac;
                                            }
LABEL_bac578:
                                            v42 = *(long long *)((char *)v206 - 16) - v42;
                                            if (!(v42 >> 7 & 1))
                                                goto LABEL_bac580;
LABEL_bac5ac:
                                            v267 = 0;
                                            v268 = *((char *)v188 - 8);
                                            v269 = a0->field_160;
                                            v270 = a0->field_168;
                                            v271 = v209 & v270;
                                            v272 = *(long long *)((char *)v269 + v271);
                                            v274 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v272, v210));
                                            v275 = v274 & 0x8080808080808080;
                                            if (!(v274 & 0x8080808080808080))
                                            {
                                                do
                                                {
LABEL_bac5fc:
                                                    v276 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v272, _mm_set1_epi8(-1)));
                                                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))))))) & 1)
                                                        goto LABEL_bac6e4;
                                                    v267 += 8;
                                                    v271 = v271 + v267 & v270;
                                                    v272 = *(long long *)((char *)v269 + v271);
                                                    v279 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v272, v210));
                                                    v275 = v279 & 0x8080808080808080;
                                                } while (!(v279 & 0x8080808080808080));
                                            }
                                            while (1)
                                            {
                                                v280 = v275;
                                                v281 = ((((((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                v282 = (((((((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                v283 = ((((v282 | v281) & 0xffff0000ffff0000) >> 16 | (v282 | v281) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v282 | v281) & 0xffff0000ffff0000) >> 16 | (v282 | v281) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                v284 = v271 + ((!v283 ? 64 : Clz(v283)) >> 3) & v270;
                                                v285 = v269 - v284 * 16;
                                                if (v190 == *(long long *)((char *)v285 - 16))
                                                    break;
                                                v286 = v280 - 1;
                                                v275 = v286 & v280;
                                                if (!(v286 & v280))
                                                    goto LABEL_bac5fc;
                                            }
                                            v287 = v269 + (v284 - 8 & v270);
                                            v288 = _mm_set1_epi32(-1);
                                            v289 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(unsigned long long *)&*(double *)&v287->field_0, v288));
                                            v290 = __double_as_longlong(v289);
                                            v291 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(long long *)((char *)v269 + v284), v288));
                                            v292 = __double_as_longlong(v291);
                                            v293 = ((((((v292 & 0xaaaaaaaaaaaaaaaa) >> 1 | v292 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v292 & 0xaaaaaaaaaaaaaaaa) >> 1 | v292 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v292 & 0xaaaaaaaaaaaaaaaa) >> 1 | v292 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v292 & 0xaaaaaaaaaaaaaaaa) >> 1 | v292 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v294 = (((((((v292 & 0xaaaaaaaaaaaaaaaa) >> 1 | v292 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v292 & 0xaaaaaaaaaaaaaaaa) >> 1 | v292 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v292 & 0xaaaaaaaaaaaaaaaa) >> 1 | v292 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v292 & 0xaaaaaaaaaaaaaaaa) >> 1 | v292 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v295 = ((((v294 | v293) & 0xffff0000ffff0000) >> 16 | (v294 | v293) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v294 | v293) & 0xffff0000ffff0000) >> 16 | (v294 | v293) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            if (((!v295 ? 64 : Clz(v295)) >> 3) + ((!v290 ? 64 : Clz(v290)) >> 3) > 7)
                                            {
                                                v296 = 128;
                                            }
                                            else
                                            {
                                                a0->field_170 = a0->field_170 + 1;
                                                v296 = 0xff;
                                            }
                                            *((char *)v269 + v284) = v296;
                                            v287->field_8 = v296;
                                            a0->field_178 = a0->field_178 - 1;
                                            do
                                            {
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                            } while (/* unsupported instruction */ ^ 1);
                                            v297 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                            if (!(v297 & 1))
                                            {
                                                /* unsupported instruction */;
                                                sub_b86a90();
                                            }
                                            do
                                            {
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                            } while (/* unsupported instruction */ ^ 1);
                                            v298 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                            if (!(v298 & 1))
                                            {
                                                /* unsupported instruction */;
                                                sub_b86a90(*(long long *)((char *)v285 - 8));
                                            }
LABEL_bac6e4:
                                            if (v268 != v2)
                                            {
LABEL_bac794:
                                                v319 = *v189;
                                                do
                                                {
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                } while (/* unsupported instruction */ ^ 1);
                                                if ((long long)/* unsupported instruction */ < 0)
                                                    goto LABEL_bad558;
                                                v28 = v319;
                                                if (sub_bae20c(a0, *(long long *)v179, v319) & 1)
                                                {
                                                    sub_c73c80("assertion failed: !self.dominates(local_a, &local_b)assertion failed: !self.function.edges_to_block(node).any(|(_, e)| !e.arguments.is_empty())assertion failed: dominator_index == 0assertion failed: edges[0].weight().branch_type == BranchType::UnconditionalWOAH COPY SHARING\nassertion failed: local_a != local_bassertion failed: !self.dominates(local_a, local_b)assertion failed: match track_edge_idx {\n    LeftOrRight::Left(idx) => idx <= old_left_len,\n    LeftOrRight::Right(idx) => idx <= right_len,\n}assertion failed: new_left_len <= CAPACITYrange start and end are equal and excluded in BTreeMaprange start is greater than range end in BTreeMapassertion failed: self.height > 0assertion failed: old_right_len + count <= CAPACITYassertion failed: old_left_len >= countassertion failed: old_left_len + count <= CAPACITYassertion failed: old_right_len >= countinternal error: entered unreachable code: empty internal nodeassertion failed: assign.right.len() == 1assertion failed: skip_over_node(function, pattern.first_nod", 52, &g_ef83f8);
                                                    goto LABEL_bad688;
                                                }
                                                v320 = &v28;
LABEL_bac838:
                                                if (!(sub_badb6c(a0, *(long long *)v179) & 1))
                                                {
                                                    if (*(long long *)&a0->padding_150[8])
                                                    {
                                                        v321 = 0;
                                                        v322 = 5871781006564002453 * (*v320 + 8);
                                                        v323 = v322;
                                                        while (1)
                                                        {
                                                            v324 = v323 & a0->field_148;
                                                            v325 = *(long long *)((char *)a0->field_140 + v324);
                                                            v327 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v325, (uint128_t)(v322 >> 57 & 0xff | (v322 >> 57 & 0xff) * 0x100 | (v322 >> 57 & 0xff | (v322 >> 57 & 0xff) * 0x100) * 0x10000 | (v322 >> 57 & 0xff | (v322 >> 57 & 0xff) * 0x100 | (v322 >> 57 & 0xff | (v322 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                                                            v328 = v327 & 0x8080808080808080;
                                                            if (v327 & 0x8080808080808080)
                                                            {
                                                                do
                                                                {
                                                                    v329 = v328;
                                                                    v330 = ((((((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                                    v331 = (((((((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                                    v332 = ((((v331 | v330) & 0xffff0000ffff0000) >> 16 | (v331 | v330) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v331 | v330) & 0xffff0000ffff0000) >> 16 | (v331 | v330) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                                    v333 = &a0->field_140[-2 * (v324 + ((!v332 ? 64 : Clz(v332)) >> 3) & a0->field_148)];
                                                                    if (*v320 == *(long long *)((char *)v333 - 16))
                                                                    {
                                                                        v320 = (char *)v333 - 8;
                                                                        goto LABEL_bac838;
                                                                    }
                                                                } while ((v334 = v329 - 1, v328 = v334 & v329, v334 & v329));
                                                            }
                                                            v335 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v325, _mm_set1_epi8(-1)));
                                                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v335, v335), _mm_unpacklo_epi64(v335, v335)))))))))) & 1)
                                                                break;
                                                            v321 += 8;
                                                            v323 = v324 + v321;
                                                        }
                                                        v337 = 0;
                                                        goto LABEL_bac874;
                                                    }
                                                    else
                                                    {
                                                        v337 = 0;
                                                        goto LABEL_bac874;
                                                    }
                                                }
                                                v337 = *v320;
                                                do
                                                {
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                } while (/* unsupported instruction */ ^ 1);
                                                if ((long long)/* unsupported instruction */ < 0)
                                                    goto LABEL_bad558;
                                                do
                                                {
LABEL_bac874:
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                } while (/* unsupported instruction */ ^ 1);
                                                if ((long long)/* unsupported instruction */ < 0)
                                                    goto LABEL_bad558;
                                                v338 = *(long long *)v179;
                                                do
                                                {
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                } while (/* unsupported instruction */ ^ 1);
                                                if ((long long)/* unsupported instruction */ < 0)
                                                    goto LABEL_bad558;
                                                v339 = *(long long *)sub_ba9a14(a0, v338);
                                                v340 = *(long long *)*(long long *)sub_ba9a14(a0, v338);
                                                v1 = *(long long *)sub_ba9a14(a0, v338);
                                                *v1 = v340 + 1;
                                                v341 = arm64g_calculate_condition(0x22, v340, 1, 0);
                                                if (v341 & 1)
                                                    goto LABEL_bad688;
                                                v42 = v319;
                                                v0 = (unsigned int)v176;
                                                v342 = *(long long *)sub_ba9a14(a0, v42);
                                                v343 = *v342;
                                                v344 = v343 + 1;
                                                *v342 = v344;
                                                v345 = arm64g_calculate_condition(0x22, v343, 1, 0);
                                                if (v345 & 1)
                                                    goto LABEL_bad688;
                                                v346 = v1;
                                                if (v346 != v342)
                                                {
                                                    if (0x7fffffffffffffff > v346[2])
                                                    {
                                                        v346[2] = v346[2] + 1;
                                                        v347 = v342[2];
                                                        if (0x7fffffffffffffff > v347)
                                                        {
                                                            v342[2] = v347 + 1;
                                                            v42 = v342 + 3;
                                                            v348 = (unsigned int)sub_bd194c(v346 + 3, v42);
                                                            v342[2] = v347;
                                                            v346[2] = v346[2] - 1;
                                                            v344 = *v342;
                                                            if (v348)
                                                                goto LABEL_bac954;
                                                            *v342 = v344 - 1;
                                                            v176 = v0;
                                                            if (v344 == 1)
                                                                sub_bdc2b4(v342);
                                                            v349 = v1;
                                                            v350 = *v349;
                                                            *v349 = v350 - 1;
                                                            if (v350 == 1)
                                                                sub_bdc2b4(v349);
                                                            if (!v337)
                                                                goto LABEL_bacaac;
                                                            do
                                                            {
                                                                /* unsupported instruction */;
                                                                v351 = /* unsupported instruction */;
                                                                /* unsupported instruction */;
                                                                /* unsupported instruction */;
                                                            } while (/* unsupported instruction */ ^ 1);
                                                            v352 = 1;
                                                            goto LABEL_bacb58;
                                                        }
                                                        else
                                                        {
                                                            sub_c73d04(&g_ef8c20);
                                                            goto LABEL_bad688;
                                                        }
                                                    }
                                                    else
                                                    {
                                                        sub_c73d04(&g_ef8c08);
                                                        goto LABEL_bad688;
                                                    }
                                                    goto LABEL_bad688;
                                                }
LABEL_bac954:
                                                *v342 = v344 - 1;
                                                v176 = v0;
                                                if (v344 == 1)
                                                    sub_bdc2b4(v342);
                                                v353 = v1;
                                                v354 = *v353;
                                                *v353 = v354 - 1;
                                                if (v354 == 1)
                                                    sub_bdc2b4(v353);
                                                if (!v337)
                                                {
                                                    v355 = 0;
                                                    v356 = 5871781006564002453 * (*(long long *)v179 + 8);
                                                    v357 = a0->field_160;
                                                    v358 = a0->field_168;
                                                    v359 = v356 >> 57 & 0xff | (v356 >> 57 & 0xff) * 0x100 | (v356 >> 57 & 0xff | (v356 >> 57 & 0xff) * 0x100) * 0x10000 | (v356 >> 57 & 0xff | (v356 >> 57 & 0xff) * 0x100 | (v356 >> 57 & 0xff | (v356 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                                    v360 = v356 & v358;
                                                    v361 = *(long long *)((char *)v357 + v360);
                                                    v363 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v361, v359));
                                                    v364 = v363 & 0x8080808080808080;
                                                    if (!(v363 & 0x8080808080808080))
                                                    {
                                                        while (1)
                                                        {
LABEL_baca74:
                                                            v365 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v361, _mm_set1_epi8(-1)));
                                                            if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v365, v365), _mm_unpacklo_epi64(v365, v365)))))))))) & 1))
                                                            {
                                                                v355 += 8;
                                                                v360 = v360 + v355 & v358;
                                                                v361 = *(long long *)((char *)v357 + v360);
                                                                v368 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v361, v359));
                                                                v364 = v368 & 0x8080808080808080;
                                                                if (v368 & 0x8080808080808080)
                                                                    break;
                                                            }
                                                            else
                                                            {
LABEL_bacaac:
                                                                v352 = 0;
                                                                goto LABEL_bacb6c;
                                                            }
                                                        }
                                                    }
                                                    while (1)
                                                    {
                                                        v369 = v364;
                                                        v370 = ((((((v369 & 0xaaaaaaaaaaaaaaaa) >> 1 | v369 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v369 & 0xaaaaaaaaaaaaaaaa) >> 1 | v369 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v369 & 0xaaaaaaaaaaaaaaaa) >> 1 | v369 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v369 & 0xaaaaaaaaaaaaaaaa) >> 1 | v369 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                        v371 = (((((((v369 & 0xaaaaaaaaaaaaaaaa) >> 1 | v369 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v369 & 0xaaaaaaaaaaaaaaaa) >> 1 | v369 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v369 & 0xaaaaaaaaaaaaaaaa) >> 1 | v369 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v369 & 0xaaaaaaaaaaaaaaaa) >> 1 | v369 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                        v372 = ((((v371 | v370) & 0xffff0000ffff0000) >> 16 | (v371 | v370) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v371 | v370) & 0xffff0000ffff0000) >> 16 | (v371 | v370) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                        v373 = v360 + ((!v372 ? 64 : Clz(v372)) >> 3) & v358;
                                                        v374 = v357 - v373 * 16;
                                                        if (*(long long *)v179 != *(long long *)((char *)v374 - 16))
                                                        {
                                                            v375 = v369 - 1;
                                                            v364 = v375 & v369;
                                                            if (!(v375 & v369))
                                                                goto LABEL_baca74;
                                                        }
                                                        else
                                                        {
                                                            v376 = v357 + (v373 - 8 & v358);
                                                            v377 = _mm_set1_epi32(-1);
                                                            v378 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(unsigned long long *)&*(double *)&v376->field_0, v377));
                                                            v379 = __double_as_longlong(v378);
                                                            v380 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(long long *)((char *)v357 + v373), v377));
                                                            v381 = __double_as_longlong(v380);
                                                            v382 = ((((((v381 & 0xaaaaaaaaaaaaaaaa) >> 1 | v381 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v381 & 0xaaaaaaaaaaaaaaaa) >> 1 | v381 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v381 & 0xaaaaaaaaaaaaaaaa) >> 1 | v381 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v381 & 0xaaaaaaaaaaaaaaaa) >> 1 | v381 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                            v383 = (((((((v381 & 0xaaaaaaaaaaaaaaaa) >> 1 | v381 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v381 & 0xaaaaaaaaaaaaaaaa) >> 1 | v381 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v381 & 0xaaaaaaaaaaaaaaaa) >> 1 | v381 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v381 & 0xaaaaaaaaaaaaaaaa) >> 1 | v381 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                            v384 = ((((v383 | v382) & 0xffff0000ffff0000) >> 16 | (v383 | v382) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v383 | v382) & 0xffff0000ffff0000) >> 16 | (v383 | v382) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                            if (((!v384 ? 64 : Clz(v384)) >> 3) + ((!v379 ? 64 : Clz(v379)) >> 3) > 7)
                                                            {
                                                                v385 = 128;
                                                            }
                                                            else
                                                            {
                                                                a0->field_170 = a0->field_170 + 1;
                                                                v385 = 0xff;
                                                            }
                                                            *((char *)v357 + v373) = v385;
                                                            v376->field_8 = v385;
                                                            a0->field_178 = a0->field_178 - 1;
                                                            v337 = *(long long *)((char *)v374 - 8);
                                                            do
                                                            {
                                                                /* unsupported instruction */;
                                                                /* unsupported instruction */;
                                                                /* unsupported instruction */;
                                                            } while (/* unsupported instruction */ ^ 1);
                                                            v386 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                                            if (!(v386 & 1))
                                                            {
                                                                /* unsupported instruction */;
                                                                sub_b86a90();
                                                            }
                                                            do
                                                            {
                                                                /* unsupported instruction */;
                                                                v351 = /* unsupported instruction */;
                                                                /* unsupported instruction */;
                                                                /* unsupported instruction */;
                                                            } while (/* unsupported instruction */ ^ 1);
                                                        }
                                                    }
                                                }
                                                do
                                                {
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                } while (/* unsupported instruction */ ^ 1);
                                                if ((long long)/* unsupported instruction */ < 0)
                                                    goto LABEL_bad558;
                                                v42 = v338;
                                                v337 = sub_bafae4(&a0->field_160, v42, v337);
                                                if (!v337)
                                                    goto LABEL_bacaac;
                                                do
                                                {
                                                    /* unsupported instruction */;
                                                    v351 = /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                } while (/* unsupported instruction */ ^ 1);
                                                v352 = 0;
LABEL_bacb58:
                                                if (v351 == 1)
                                                {
                                                    /* unsupported instruction */;
                                                    sub_b86a90(v337);
                                                }
LABEL_bacb6c:
                                                do
                                                {
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                } while (/* unsupported instruction */ ^ 1);
                                                v387 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                                if (!(v387 & 1))
                                                {
                                                    /* unsupported instruction */;
                                                    sub_b86a90(v28);
                                                }
                                                if (v352 & 1)
                                                {
                                                    v392 = 1;
LABEL_bad0f0:
                                                    v41->field_0 = v41->field_0 - 1;
                                                    v34->field_10 = v34->field_10 - 1;
                                                    if (v29)
                                                        _free(v30);
                                                    if (v392 & 1)
                                                        goto LABEL_bad01c;
                                                    if (!v41->field_0)
                                                    {
                                                        v37->field_10 = 0xffffffffffffffff;
                                                        v29 = (uint128_t)v37->field_18;
                                                        v394 = *(long long *)&v37->field_20;
                                                        v31 = v394;
                                                        *(unsigned long long *)&v37->field_20 = 0;
                                                        v41->field_0 = 0;
                                                        v41->field_8[0] = 0;
                                                        v395 = *(unsigned long long *)&v29;
                                                        v396 = *(unsigned long long *)((void*)&v29 + 8);
                                                        v16 = v395 != 0;
                                                        v17 = 0;
                                                        v18 = v395;
                                                        v19 = v396;
                                                        v20 = v16;
                                                        v21 = 0;
                                                        v22 = v395;
                                                        v23 = v396;
                                                        v24 = (v395 ? v394 : 0);
                                                        break;
                                                    }
                                                    else
                                                    {
                                                        sub_c73cd4(&g_ef88d8);
                                                        goto LABEL_bad688;
                                                    }
                                                }
                                            }
                                            else if (a0->field_178)
                                            {
                                                v299 = 0;
                                                v300 = 5871781006564002453 * (*v189 + 8);
                                                v301 = a0->field_160;
                                                v302 = a0->field_168;
                                                v303 = v300 >> 57 & 0xff | (v300 >> 57 & 0xff) * 0x100 | (v300 >> 57 & 0xff | (v300 >> 57 & 0xff) * 0x100) * 0x10000 | (v300 >> 57 & 0xff | (v300 >> 57 & 0xff) * 0x100 | (v300 >> 57 & 0xff | (v300 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                                v304 = v300 & v302;
                                                v305 = *(long long *)((char *)v301 + v304);
                                                v307 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v305, v303));
                                                v308 = v307 & 0x8080808080808080;
                                                if (!(v307 & 0x8080808080808080))
                                                {
                                                    do
                                                    {
LABEL_bac758:
                                                        v309 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v305, _mm_set1_epi8(-1)));
                                                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v309, v309), _mm_unpacklo_epi64(v309, v309)))))))))) & 1)
                                                            goto LABEL_bacb94;
                                                        v299 += 8;
                                                        v304 = v304 + v299 & v302;
                                                        v305 = *(long long *)((char *)v301 + v304);
                                                        v312 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v305, v303));
                                                        v308 = v312 & 0x8080808080808080;
                                                    } while (!(v312 & 0x8080808080808080));
                                                }
                                                while (1)
                                                {
                                                    v313 = v308;
                                                    v314 = ((((((v313 & 0xaaaaaaaaaaaaaaaa) >> 1 | v313 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v313 & 0xaaaaaaaaaaaaaaaa) >> 1 | v313 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v313 & 0xaaaaaaaaaaaaaaaa) >> 1 | v313 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v313 & 0xaaaaaaaaaaaaaaaa) >> 1 | v313 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                    v315 = (((((((v313 & 0xaaaaaaaaaaaaaaaa) >> 1 | v313 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v313 & 0xaaaaaaaaaaaaaaaa) >> 1 | v313 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v313 & 0xaaaaaaaaaaaaaaaa) >> 1 | v313 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v313 & 0xaaaaaaaaaaaaaaaa) >> 1 | v313 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                    v316 = ((((v315 | v314) & 0xffff0000ffff0000) >> 16 | (v315 | v314) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v315 | v314) & 0xffff0000ffff0000) >> 16 | (v315 | v314) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                    v317 = v301 - (v304 + ((!v316 ? 64 : Clz(v316)) >> 3) & v302) * 16;
                                                    if (*v189 != *(long long *)((char *)v317 - 16))
                                                    {
                                                        v318 = v313 - 1;
                                                        v308 = v318 & v313;
                                                        if (!(v318 & v313))
                                                            goto LABEL_bac758;
                                                    }
                                                    else
                                                    {
                                                        v189 = (char *)v317 - 8;
                                                        goto LABEL_bac794;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                else
                                {
LABEL_bac224:
                                    v13 = 0;
                                    v179 = v15;
                                    v181 = v14;
                                    if (!(v177 & 1))
                                    {
                                        v181 = sub_bd11f0(&v4);
                                        v179 = v42;
                                    }
                                    if (!v181)
                                    {
                                        v458 = &g_ef8668;
                                        goto LABEL_bad5a8;
                                    }
                                    v2 = 0;
                                    v176 = (unsigned int)v176 + 1;
                                    node = v31;
                                    if (node)
                                        goto LABEL_bac288;
                                }
LABEL_bacb94:
                                v388 = v31;
                                if (v388 == v29)
                                    sub_c6c28c(&v29);
                                v389 = v30 + v388 * 16;
                                v389->field_0 = v179;
                                v389->field_8 = v2;
                                v31 = v388 + 1;
                                if (v13 == 1)
                                {
                                    v390 = v14;
                                    if (v390)
                                        goto LABEL_bacbfc;
                                }
                                else
                                {
                                    v390 = sub_bd11f0(&v4);
                                    v13 = 1;
                                    v14 = v390;
                                    v15 = v42;
                                    if (v390)
                                    {
LABEL_bacbfc:
                                        if (0 < iter)
                                            continue;
                                    }
                                }
                                if (v25 == 1)
                                {
                                    v391 = v26;
                                    if (v391)
                                        goto LABEL_bacc34;
                                }
                                else
                                {
                                    v391 = sub_bd11f0(&v16);
                                    v25 = 1;
                                    v26 = v391;
                                    v27 = v42;
                                    if (v391)
                                    {
LABEL_bacc34:
                                        if (0 < (int)v176)
                                            continue;
                                    }
                                }
                                v392 = 0;
                                if (!v390 || !v391)
                                    goto LABEL_bad0f0;
                            }
                            while (1)
                            {
                                if (!sub_bd11f0(&v16))
                                    break;
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ < 0)
                                    goto LABEL_bad558;
                                else
                                    goto LABEL_bad190;
LABEL_bad190:
                                v397 = v34->field_0;
                                v34->field_0 = v397 + 1;
                                v398 = arm64g_calculate_condition(0x22, v397, 1, 0);
                                if (v398 & 1)
                                    goto LABEL_bad688;
                                v399 = sub_bafce0(&a0->field_120);
                                if (v399)
                                {
                                    v400 = *(long long *)v399;
                                    *(unsigned long long *)v399 = v400 - 1;
                                    if (v400 == 1)
                                        sub_bdc23c();
                                }
                            }
                            if (!v34->field_10)
                            {
                                v34->field_10 = 0xffffffffffffffff;
                                if (v395)
                                {
                                    v17 = 0;
                                    v18 = v395;
                                    v19 = v396;
                                    v21 = 0;
                                    v22 = v395;
                                    v401 = 1;
                                    v23 = v396;
                                }
                                else
                                {
                                    v401 = 0;
                                    v394 = 0;
                                }
                                v16 = v401;
                                v20 = v401;
                                v24 = v394;
                                while (1)
                                {
                                    sub_bd04ac(&v4, &v16);
                                    v402 = *(unsigned long long *)&v4;
                                    if (!v402 || !(v403 = v402 + 24 * v5, v403->field_8[1] != 2))
                                        break;
                                    v4 = (uint128_t)v403->field_8;
                                    v6 = *(long long *)&v403->field_10;
                                    v5 = v6;
                                    if (sub_bcf85c(&v34->field_18, &v4, *(long long *)(v402 + v5 * 8 + 272)))
                                    {
                                        do
                                        {
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                        } while (/* unsupported instruction */ ^ 1);
                                        v404 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                        v5 = v6;
                                        if (!(v404 & 1))
                                        {
                                            /* unsupported instruction */;
                                            sub_b86a90();
                                            v5 = v6;
                                        }
                                    }
                                }
                                while (1)
                                {
                                    v405 = &v16;
                                    sub_bd04ac(&v4, &v16);
                                    if (!*(unsigned long long *)&v4)
                                        break;
                                    do
                                    {
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
                                    v406 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                    if (!(v406 & 1))
                                    {
                                        /* unsupported instruction */;
                                        sub_b86a90(*(long long *)(*(unsigned long long *)&v4 + 272 + v5 * 8));
                                    }
                                }
                                v407 = v34->field_10;
                                v408 = v407 + 1;
                                v34->field_10 = v408;
                                v409 = 0x7fffffffffffffff;
                                if (0x7fffffffffffffff > v408)
                                {
                                    v34->field_10 = v407 + 2;
                                    v410 = *(long long *)&v34->field_18;
                                    if (v410)
                                    {
                                        v409 = v34->field_20;
                                        v411 = v34[1].field_0;
                                        v412 = 1;
                                    }
                                    else
                                    {
                                        v411 = 0;
                                        v412 = 0;
                                    }
                                    v16 = v412;
                                    v17 = 0;
                                    v18 = v410;
                                    v19 = v409;
                                    v20 = v412;
                                    v21 = 0;
                                    v22 = v410;
                                    v23 = v409;
                                    v24 = v411;
                                }
                                else
                                {
                                    v101 = &g_ef88a8;
                                    goto LABEL_bad5c4;
                                }
                            }
                            else
                            {
                                sub_c73cd4(&g_ef88c0);
                                goto LABEL_bad688;
                            }
                        }
                        else
                        {
                            v458 = &g_ef8650;
LABEL_bad5a8:
                            sub_c73c64(v458);
                            goto LABEL_bad688;
                        }
                    }
                    else
                    {
                        sub_c73d04(&g_ef8620);
                        goto LABEL_bad688;
                    }
                }
                else
                {
                    sub_c73d04(&g_ef8608);
                    goto LABEL_bad688;
                }
                goto LABEL_bad688;
            }
            if (0x7ffffffffffffffe >= v45)
            {
                v34->field_10 = v45 + 1;
                v46 = *(long long *)&v34->field_18;
                if (v46)
                {
                    v47 = v34->field_20;
                    v48 = v34[1].field_0;
                    v49 = 1;
                }
                else
                {
                    v49 = 0;
                    v48 = 0;
                }
                v16 = v49;
                v17 = 0;
                v18 = v46;
                v19 = v47;
                v20 = v49;
                v21 = 0;
                v22 = v46;
                v23 = v47;
                v24 = v48;
                if (sub_bd11f0(&v16))
                {
                    v50 = *(long long *)v42;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        v51 = /* unsupported instruction */ ^ 1;
                    } while ((unsigned int)v51);
                    if ((long long)/* unsupported instruction */ < 0)
                    {
LABEL_bad558:
                        sub_c769bc();
                        goto LABEL_bad55c;
                    }
                    v34->field_10 = v34->field_10 - 1;
                    if (0x7fffffffffffffff > v41->field_0)
                    {
                        v41->field_0 = v41->field_0 + 1;
                        v52 = v37->field_18[0];
                        if (v52)
                        {
                            v51 = v37->field_18[1];
                            v53 = *(long long *)&v37->field_20;
                            v54 = 1;
                        }
                        else
                        {
                            v53 = 0;
                            v54 = 0;
                        }
                        v16 = v54;
                        v17 = 0;
                        v18 = v52;
                        v19 = v51;
                        v20 = v54;
                        v21 = 0;
                        v22 = v52;
                        v23 = v51;
                        v24 = v53;
                        if (sub_bd11f0(&v16))
                        {
                            v55 = *(long long *)v42;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bad558;
                            v41->field_0 = v41->field_0 - 1;
                            v56 = (unsigned int)sub_bad9a8(a0, v50, v55);
                            v57 = (v56 ? v50 : v55);
                            v58 = (v56 ? v55 : v50);
                            if (sub_badb6c(a0, v58, v57))
                            {
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ < 0)
                                    goto LABEL_bad558;
                                v59 = *(long long *)sub_ba9a14(a0, v58);
                                v60 = *v59;
                                *v59 = v60 + 1;
                                v61 = arm64g_calculate_condition(0x22, v60, 1, 0);
                                if (!(v61 & 1))
                                {
                                    do
                                    {
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
                                    if ((long long)/* unsupported instruction */ < 0)
                                        goto LABEL_bad558;
                                    v62 = *(long long *)sub_ba9a14(a0, v57);
                                    v63 = *v62;
                                    v64 = v63 + 1;
                                    *v62 = v64;
                                    v65 = arm64g_calculate_condition(0x22, v63, 1, 0);
                                    if (!(v65 & 1))
                                    {
                                        if (v59 == v62)
                                        {
LABEL_bace4c:
                                            *v62 = v64 - 1;
                                            if (v64 == 1)
                                                sub_bdc2b4(v62);
                                            v73 = *v59;
                                            *v59 = v73 - 1;
                                            if (v73 == 1)
                                                sub_bdc2b4(v59);
                                            goto LABEL_bace7c;
                                        }
                                        if (0x7fffffffffffffff > v59[2])
                                        {
                                            v59[2] = v59[2] + 1;
                                            v66 = v62[2];
                                            if (0x7fffffffffffffff > v66)
                                            {
                                                v62[2] = v66 + 1;
                                                v67 = (unsigned int)sub_bd194c(v59 + 3, v62 + 3);
                                                v62[2] = v66;
                                                v59[2] = v59[2] - 1;
                                                v64 = *v62;
                                                if (v67)
                                                    goto LABEL_bace4c;
                                                *v62 = v64 - 1;
                                                if (v64 == 1)
                                                    sub_bdc2b4(v62);
                                                v68 = *v59;
                                                *v59 = v68 - 1;
                                                if (v68 == 1)
                                                    sub_bdc2b4(v59);
                                                do
                                                {
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                } while (/* unsupported instruction */ ^ 1);
                                                v69 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                                if (!(v69 & 1))
                                                {
                                                    /* unsupported instruction */;
                                                    sub_b86a90(v57);
                                                }
                                                do
                                                {
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                } while (/* unsupported instruction */ ^ 1);
                                                if (/* unsupported instruction */ != 1)
                                                    goto LABEL_babd5c;
                                                /* unsupported instruction */;
                                                sub_b86a90(v58);
                                                v70 = 1;
                                                v72 = v37->field_0;
                                                v37->field_0 = v72 - 1;
                                                if (v72 == 1)
                                                    goto LABEL_babd70;
                                                goto LABEL_babd78;
                                            }
                                            else
                                            {
                                                sub_c73d04(&g_ef8c20);
                                                goto LABEL_bad688;
                                            }
                                        }
                                        else
                                        {
                                            sub_c73d04(&g_ef8c08);
                                            goto LABEL_bad688;
                                        }
                                    }
                                }
                                goto LABEL_bad688;
                            }
                            do
                            {
LABEL_bace7c:
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bad558;
                            if (sub_bafae4(&a0->field_140, v58, v57))
                            {
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                v74 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                if (!(v74 & 1))
                                {
                                    /* unsupported instruction */;
                                    sub_b86a90();
                                }
                            }
                            if (*(long long *)&a0->padding_190[8])
                            {
                                v75 = 0;
                                v76 = 5871781006564002453 * (v57 + 8);
                                v77 = a0->field_180;
                                v78 = a0->field_188;
                                v79 = v76 >> 57 & 0xff | (v76 >> 57 & 0xff) * 0x100 | (v76 >> 57 & 0xff | (v76 >> 57 & 0xff) * 0x100) * 0x10000 | (v76 >> 57 & 0xff | (v76 >> 57 & 0xff) * 0x100 | (v76 >> 57 & 0xff | (v76 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                v80 = v76 & v78;
                                v81 = *(long long *)((char *)v77 + v80);
                                v83 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v81, v79));
                                v84 = v83 & 0x8080808080808080;
                                if (!(v83 & 0x8080808080808080))
                                    goto LABEL_bacf40;
                                while (1)
                                {
                                    v89 = v84;
                                    v90 = ((((((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v91 = (((((((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v92 = ((((v91 | v90) & 0xffff0000ffff0000) >> 16 | (v91 | v90) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v91 | v90) & 0xffff0000ffff0000) >> 16 | (v91 | v90) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v93 = (char *)v77 + -(40 * (v80 + ((!v92 ? 64 : Clz(v92)) >> 3) & v78));
                                    if (*(long long *)((char *)v93 - 40) == v57)
                                        break;
                                    v94 = v89 - 1;
                                    v84 = v94 & v89;
                                    if (!(v94 & v89))
                                    {
                                        do
                                        {
LABEL_bacf40:
                                            v85 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v81, _mm_set1_epi8(-1)));
                                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85)))))))))) & 1)
                                                goto LABEL_bad040;
                                            v75 += 8;
                                            v80 = v80 + v75 & v78;
                                            v81 = *(long long *)((char *)v77 + v80);
                                            v88 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v81, v79));
                                            v84 = v88 & 0x8080808080808080;
                                        } while (!(v88 & 0x8080808080808080));
                                    }
                                }
                                if (!v34->field_10)
                                {
                                    v16 = *(long long *)((char *)v93 - 32);
                                    v95 = *(int128_t *)((char *)v93 - 16);
                                    v34->field_10 = 0xffffffffffffffff;
                                    v17 = v95;
                                    do
                                    {
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
                                    if ((long long)/* unsupported instruction */ >= 0)
                                    {
                                        if (sub_bcf85c(&v34->field_18, &v16, v57))
                                        {
                                            do
                                            {
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                            } while (/* unsupported instruction */ ^ 1);
                                            v96 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                            if (!(v96 & 1))
                                            {
                                                /* unsupported instruction */;
                                                sub_b86a90();
                                            }
                                        }
                                        v34->field_10 = v34->field_10 + 1;
                                        v97 = v34->field_0;
                                        v34->field_0 = v97 + 1;
                                        v98 = arm64g_calculate_condition(0x22, v97, 1, 0);
                                        if (v98 & 1)
                                            goto LABEL_bad688;
                                        v99 = sub_bafce0(&a0->field_120, v57, v34);
                                        if (v99)
                                        {
                                            v100 = *(long long *)v99;
                                            *(unsigned long long *)v99 = v100 - 1;
                                            if (v100 == 1)
                                                sub_bdc23c();
                                        }
LABEL_bad01c:
                                        v70 = 0;
                                        v393 = v37->field_0;
                                        v37->field_0 = v393 - 1;
                                        if (v393 == 1)
                                        {
LABEL_babd70:
                                            sub_bdc23c(v37);
                                        }
LABEL_babd78:
                                        v457 = v34->field_0;
                                        v34->field_0 = v457 - 1;
                                        if (v457 != 1)
                                            return v70;
                                        sub_bdc23c(v34);
                                        return v70;
                                    }
                                    goto LABEL_bad558;
                                }
                                sub_c73cd4(&g_ef8890);
                                goto LABEL_bad688;
                            }
LABEL_bad040:
                            sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in eve", 22, &g_ef8878);
                            goto LABEL_bad688;
                        }
                        sub_c73c64(&g_ef8860);
                        goto LABEL_bad688;
                    }
                    sub_c73d04(&g_ef8848);
                    goto LABEL_bad688;
                }
                sub_c73c64(&g_ef8830);
                goto LABEL_bad688;
            }
            v101 = &g_ef8818;
LABEL_bad5c4:
            sub_c73d04(v101);
            goto LABEL_bad688;
        }
        sub_c73d04(&g_ef8ab8);
    }
LABEL_bad688:
    __debugbreak();
}
