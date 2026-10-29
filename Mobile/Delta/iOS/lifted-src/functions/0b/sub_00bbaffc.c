/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbbaffc..0xbbd2b4 (8888 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bbaffc_3 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_bbaffc_3;

typedef struct st_bbaffc_14 {
    unsigned long long field_0;
    struct st_bbaffc_6 *field_8;
} st_bbaffc_14;

typedef struct st_bbaffc_7 {
    struct st_bbaffc_5 *field_0;
    char padding_8[8];
    unsigned int field_10;
    char padding_14[4];
    char field_18;
    char padding_19[15];
    unsigned int field_28;
    char padding_2c[20];
    unsigned int field_40;
    char padding_44[20];
    unsigned int field_58;
    char padding_5c[20];
    unsigned int field_70;
    char padding_74[20];
    unsigned int field_88;
    char padding_8c[20];
    unsigned int field_a0;
    char padding_a4[20];
    unsigned int field_b8;
} st_bbaffc_7;

typedef struct st_bbaffc_12 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_bbaffc_12;

typedef struct st_bbaffc_5 {
    char padding_0[8];
    struct st_bbaffc_6 *field_8;
    unsigned long long field_10;
} st_bbaffc_5;

typedef struct st_bbaffc_4 {
    unsigned long long field_0;
    struct st_bbaffc_1 *field_8;
    unsigned long long field_10;
} st_bbaffc_4;

typedef struct st_bbaffc_10 {
    unsigned long long field_0;
    char padding_8[16];
    double field_18;
} st_bbaffc_10;

typedef struct st_bbaffc_9 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_bbaffc_9;

typedef struct st_bbaffc_8 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
} st_bbaffc_8;

typedef struct st_bbaffc_6 {
    unsigned int field_0;
} st_bbaffc_6;

typedef struct st_bbaffc_2 {
    unsigned long long field_0;
    struct st_bbaffc_3 *field_8;
    char padding_10[28];
    unsigned int field_2c;
} st_bbaffc_2;

typedef struct st_bbaffc_13 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
} st_bbaffc_13;

typedef struct st_bbaffc_0 {
    char padding_0[32];
    struct st_bbaffc_1 *field_20;
    unsigned long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    unsigned long long field_40;
} st_bbaffc_0;

typedef struct st_bbaffc_1 {
    unsigned long long field_0;
} st_bbaffc_1;

typedef struct st_bbaffc_11 {
    struct st_bbaffc_1 *field_0;
    unsigned int field_8;
} st_bbaffc_11;

extern long long g_ef99d8;
extern long long g_ef9a08;
extern long long g_efa348;
extern long long g_efbb78;
extern long long g_efc848;
extern uint128_t g_efc958;
extern unsigned int g_efc968;

unsigned int sub_bbaffc(st_bbaffc_0 *a0, st_bbaffc_11 *a1)
{
    unsigned long long *v53;  // x27
    unsigned long long v54;  // x26
    unsigned long long v63;  // x23
    st_bbaffc_4 *v152;  // x9
    st_bbaffc_4 *v153;  // x9
    unsigned long long *v154;  // x21
    unsigned long long i2;  // x22
    unsigned int v156;  // x22
    unsigned int v157;  // x8
    unsigned int v158;  // x10
    unsigned int v159;  // x9
    unsigned int v160;  // x13
    unsigned long long v161;  // x15
    unsigned int idx;  // x22
    unsigned long long v162;  // x15
    unsigned long long v163;  // x15
    __m128i v164;  // q1
    unsigned long v166;  // x16
    unsigned long long v167;  // x16
    unsigned long long v168;  // x16
    unsigned long long v169;  // 4150
    unsigned long long v170;  // 4152
    unsigned long v171;  // x17
    unsigned long long *v65;  // x20
    unsigned int *v172;  // x17
    unsigned long long v173;  // x17
    uint128_t v174;  // q1
    unsigned long long v176;  // 4122
    unsigned long v178;  // x12
    unsigned int i3;  // x12
    unsigned long long *v180;  // x13
    unsigned long long *v181;  // x13
    unsigned int v66;  // w25
    unsigned long long v183;  // 4156
    unsigned long long v184;  // 4158
    unsigned int v185;  // x12
    unsigned long long *v186;  // x21
    unsigned int v187;  // x10
    unsigned long long v188;  // x12
    unsigned long long v189;  // x12
    unsigned long long v190;  // x12
    __m128i v191;  // q1
    unsigned long long v67;  // x8
    unsigned long v193;  // x13
    unsigned long long v194;  // x13
    unsigned long long v195;  // x13
    unsigned long long v196;  // 4150
    unsigned long long v197;  // 4152
    unsigned int v198;  // x14
    unsigned long v199;  // x14
    unsigned long long v200;  // x14
    uint128_t v201;  // q1
    unsigned int *v68;  // x9
    unsigned long long v203;  // 4102
    unsigned int v204;  // x9
    unsigned long long v205;  // x12
    unsigned int v206;  // x10
    __m128i v207;  // q0
    unsigned long long v208;  // x12
    __m128i v209;  // q1
    unsigned long v211;  // x13
    unsigned long v69;  // x19
    unsigned long long v212;  // x13
    __m128i v213;  // q1
    unsigned long v216;  // x13
    unsigned long long v217;  // x13
    unsigned long long v218;  // 4150
    unsigned long long v219;  // 4152
    unsigned int v220;  // x14
    unsigned int *v221;  // x14
    unsigned long i;  // x20
    unsigned long long v222;  // x14
    unsigned long long v223;  // 4102
    unsigned long long v224;  // x9
    unsigned long long v225;  // 4112
    st_bbaffc_7 *v226;  // x2
    unsigned int v227;  // x22
    unsigned long long v228;  // x25
    unsigned int ptr;  // x0
    unsigned long long v230;  // x8
    unsigned long v231;  // x9
    uint128_t v71;  // q0
    unsigned int v232;  // x9
    unsigned long long v233;  // 4166
    unsigned long long v234;  // x8
    unsigned int idx1;  // x23
    st_bbaffc_7 *l;  // x8
    unsigned int *v237;  // x9
    unsigned long long v238;  // x1
    unsigned long iter;  // x10
    unsigned long long k;  // x11
    unsigned int v241;  // x11
    unsigned int v72;  // q1
    uint128_t v242;  // q0
    uint128_t v243;  // q0
    uint128_t v244;  // q0
    unsigned int *v245;  // x9
    uint128_t v246;  // q1
    uint128_t v247;  // q1
    uint128_t v248;  // q1
    unsigned int ptr1;  // x22
    st_bbaffc_7 *v251;  // x8
    unsigned long long v55;  // x8
    unsigned int *iter1;  // x12
    unsigned long v253;  // x8
    st_bbaffc_12 *v254;  // x11
    unsigned long v255;  // x27
    unsigned int v256;  // x25
    unsigned int v257;  // x24
    unsigned long long *v258;  // x21
    unsigned int v259;  // x10
    unsigned int v260;  // x9
    unsigned int node;  // x23
    unsigned int iter2;  // x11
    long long *v262;  // x0
    long long *v263;  // x11
    unsigned int v264;  // x13
    long long v265;  // x11
    unsigned long long v266;  // x12
    __m128i v267;  // q0
    unsigned long long v268;  // x14
    unsigned long long v269;  // x14
    __m128i v270;  // q1
    unsigned long long v74;  // x24
    unsigned long v272;  // x15
    unsigned long long v273;  // x15
    unsigned long long v274;  // x15
    unsigned long long v275;  // 4150
    unsigned long long v276;  // 4152
    unsigned int v277;  // x16
    long long *v278;  // x16
    unsigned long long v279;  // x16
    uint128_t v280;  // q1
    st_bbaffc_9 *v75;  // x8
    unsigned int v282;  // x13
    unsigned long long v283;  // x12
    __m128i v284;  // q1
    unsigned long v286;  // x14
    unsigned long long v287;  // x14
    unsigned long long v288;  // x14
    unsigned long long v289;  // 4150
    unsigned long long v290;  // 4152
    unsigned int v291;  // x15
    unsigned long long v76;  // x26
    unsigned long long v292;  // x15
    uint128_t v293;  // q1
    unsigned int v295;  // x12
    unsigned long long v296;  // x13
    unsigned long long v297;  // x13
    unsigned long long v298;  // x13
    __m128i v299;  // q1
    unsigned long v301;  // x14
    unsigned int v77;  // x23
    unsigned long long v302;  // x14
    unsigned long long v303;  // x14
    unsigned long long v304;  // 4150
    unsigned long long v305;  // 4152
    unsigned int v306;  // x15
    unsigned long long v307;  // x15
    uint128_t v308;  // q1
    unsigned int i6;  // x22
    unsigned long long v311;  // 4102
    unsigned long long v78;  // x8
    void* v312;  // x25
    void* v313;  // x8
    unsigned int v314;  // x10
    unsigned long v315;  // x8
    unsigned long long v316;  // x9
    __m128i v317;  // q0
    unsigned long long v318;  // x11
    unsigned long long v319;  // x11
    __m128i v320;  // q1
    unsigned long long v79;  // x10
    unsigned long v322;  // x12
    unsigned long long v323;  // x12
    unsigned long long v324;  // x12
    unsigned long long v325;  // 4150
    unsigned long long v326;  // 4152
    unsigned int v327;  // x13
    void* v328;  // x13
    unsigned long long v329;  // x13
    uint128_t v330;  // q1
    unsigned int *v80;  // x11
    unsigned int v332;  // x10
    unsigned long long v333;  // x9
    __m128i v334;  // q1
    unsigned long v336;  // x13
    unsigned long long v337;  // x13
    unsigned long long v338;  // x13
    unsigned long long v339;  // 4150
    unsigned long long v340;  // 4152
    unsigned int v341;  // x14
    unsigned long long v81;  // 4131
    unsigned long long v342;  // x14
    uint128_t v343;  // q1
    unsigned long long v345;  // 4102
    st_bbaffc_13 *v346;  // x8
    uint128_t v347;  // q0
    uint128_t v348;  // q1
    uint128_t v349;  // q2
    void* v350;  // x21
    unsigned int v351;  // x9
    unsigned long long v56;  // x22
    st_bbaffc_2 *v82;  // x21
    unsigned long long v352;  // x12
    unsigned long long v353;  // x12
    unsigned long long v354;  // x12
    __m128i v355;  // q1
    unsigned long v357;  // x13
    unsigned long long v358;  // x13
    unsigned long long v359;  // x13
    unsigned long long v360;  // 4150
    unsigned long long v361;  // 4152
    unsigned long long *v83;  // x22
    unsigned int v362;  // x14
    unsigned long long v363;  // x14
    uint128_t v364;  // q1
    unsigned long long v366;  // 4102
    st_bbaffc_13 *v367;  // x8
    uint128_t v368;  // q0
    uint128_t v369;  // q1
    uint128_t v370;  // q2
    unsigned int v371;  // x21
    unsigned long long *v84;  // x27
    unsigned int m;  // x22
    unsigned int v373;  // x23
    unsigned long long *v374;  // x24
    unsigned int i5;  // x25
    unsigned long long *v377;  // x24
    unsigned long long v379;  // 4148
    unsigned long long v380;  // 4150
    unsigned int v381;  // x9
    unsigned long v85;  // x23
    unsigned long long v382;  // 4102
    unsigned long long v383;  // x8
    unsigned long long v384;  // 4116
    st_bbaffc_1 **v385;  // x21
    unsigned int v386;  // x8
    unsigned int v387;  // x10
    unsigned int v389;  // x0
    unsigned int ptr2;  // x0
    unsigned long long v391;  // x23
    unsigned int v86;  // x25
    unsigned int v392;  // x21
    unsigned int v393;  // x24
    unsigned int v394;  // x0
    st_bbaffc_8 *v395;  // x8
    unsigned int v396;  // x8
    st_bbaffc_11 *v397;  // x24
    st_bbaffc_14 *v398;  // x9
    unsigned long v399;  // x23
    unsigned int v400;  // x8
    unsigned long long v401;  // x11
    unsigned long long v87;  // 4116
    unsigned int v402;  // x10
    unsigned int v403;  // x9
    __m128i v404;  // q0
    __m128i v405;  // q1
    unsigned long v407;  // x12
    unsigned long long v408;  // x12
    __m128i v409;  // q1
    unsigned long long *v88;  // x8
    unsigned long v412;  // x12
    unsigned long long v413;  // x12
    unsigned long long v414;  // 4150
    unsigned long long v415;  // 4152
    unsigned int v416;  // x13
    void* v417;  // x13
    unsigned long long v418;  // x13
    unsigned int *v419;  // x22
    unsigned int *v420;  // x26
    unsigned int *v421;  // x27
    unsigned int i7;  // x13
    unsigned int *v422;  // x21
    unsigned int *v423;  // x8
    unsigned long index;  // x8
    unsigned int *v425;  // x8
    unsigned long long v426;  // 4126
    unsigned int *v427;  // x10
    unsigned int *v428;  // x12
    unsigned int *v429;  // x13
    unsigned int *v430;  // x14
    unsigned int v90;  // x12
    unsigned long long v91;  // x14
    unsigned long long *v57;  // x20
    unsigned int v92;  // x8
    unsigned long long v456;  // 4102
    unsigned int v457;  // x10
    unsigned long long v458;  // x12
    unsigned long long v459;  // x12
    unsigned long long v460;  // x12
    __m128i v461;  // q1
    unsigned int v93;  // x10
    unsigned long v463;  // x13
    unsigned long long v464;  // x13
    unsigned long long v465;  // x13
    unsigned long long v466;  // 4150
    unsigned long long v467;  // 4152
    unsigned int v468;  // x14
    unsigned long v469;  // x14
    unsigned long long v470;  // x14
    uint128_t v471;  // q1
    char v94;  // x9
    unsigned long long v473;  // 4102
    unsigned int v474;  // x0
    __m128i v95;  // q0
    unsigned long long v96;  // x14
    __m128i v97;  // q1
    unsigned long v99;  // x15
    unsigned long long v100;  // x15
    unsigned long long v101;  // x15
    unsigned int v58;  // x8
    unsigned long long v102;  // 4150
    unsigned long long v103;  // 4152
    unsigned int v104;  // x16
    void* v105;  // x16
    unsigned long long v108;  // 4136
    unsigned long long v109;  // 4138
    unsigned int v110;  // x11
    uint128_t v111;  // q1
    unsigned long long *v59;  // x20
    unsigned long v114;  // x15
    unsigned long long v115;  // 4102
    unsigned long v116;  // x12
    unsigned long v118;  // x11
    unsigned long long v119;  // 4138
    unsigned long long v120;  // 4140
    unsigned int v121;  // x11
    unsigned long long v60;  // x22
    void* v123;  // x8
    st_bbaffc_10 *v124;  // x8
    double v125;  // d0
    unsigned int n;  // x26
    st_bbaffc_7 *v127;  // x23
    unsigned long long *v128;  // x28
    unsigned int v129;  // x22
    unsigned int v130;  // x0
    unsigned int j;  // x21
    unsigned long long v61;  // x8
    unsigned long long v132;  // x8
    unsigned int i1;  // x24
    unsigned int v134;  // x25
    unsigned int v135;  // x9
    unsigned long long v136;  // 4149
    unsigned long long *v137;  // x27
    unsigned int v138;  // x8
    unsigned int idx2;  // x9
    unsigned long v140;  // x10
    unsigned long long v141;  // x11
    unsigned int v62;  // x0
    __m128i v142;  // q1
    unsigned int i0;  // x11
    __m128i v145;  // q2
    unsigned long long v146;  // x10
    st_bbaffc_4 *v147;  // x9
    unsigned int v148;  // x25
    st_bbaffc_11 *v149;  // x24
    unsigned long long *v150;  // x23
    unsigned int v151;  // x8
    unsigned int v0;  // [bp-0x318]
    unsigned int v1;  // [bp-0x310]
    unsigned int v2;  // [bp-0x308]
    unsigned int *v3;  // [bp-0x300], Other Possible Types: unsigned long long
    st_bbaffc_12 *v4;  // [bp-0x2f8], Other Possible Types: unsigned long long *
    unsigned int *v5;  // [bp-0x2f0], Other Possible Types: unsigned int
    unsigned int *v6;  // [bp-0x2e8]
    __m128i v7;  // [bp-0x2e0]
    __m128i v8;  // [bp-0x2d0]
    unsigned int *v9;  // [bp-0x2b8]
    unsigned int v10;  // [bp-0x2b0]
    char *v11;  // [bp-0x2a8]
    unsigned int *v12;  // [bp-0x2a0]
    st_bbaffc_4 *v13;  // [bp-0x290], Other Possible Types: unsigned int, unsigned long, unsigned long long
    unsigned long long *v14;  // [bp-0x288]
    unsigned int v15;  // [bp-0x280]
    uint128_t v16;  // [bp-0x270]
    unsigned int v17;  // [bp-0x258]
    unsigned long long v18;  // [bp-0x250], Other Possible Types: unsigned int
    unsigned long long v19;  // [bp-0x248]
    uint128_t v20;  // [bp-0x240]
    uint128_t v21;  // [bp-0x230]
    unsigned int v22;  // [bp-0x220]
    uint128_t v23;  // [bp-0x210], Other Possible Types: char
    unsigned int v24;  // [bp-0x200]
    uint128_t v25;  // [bp-0x1f0]
    unsigned int v26;  // [bp-0x1e0]
    unsigned int v27;  // [bp-0x1c8]
    st_bbaffc_7 *v28;  // [bp-0x1c0]
    unsigned int v29;  // [bp-0x1b8]
    unsigned int v30;  // [bp-0x1b0]
    unsigned long v31;  // [bp-0x1a8]
    unsigned long v32;  // [bp-0x1a0]
    double v33;  // [bp-0x198]
    unsigned int v34;  // [bp-0x190]
    uint128_t v35;  // [bp-0x188]
    uint128_t v36;  // [bp-0x178], Other Possible Types: uint128_t
    uint128_t v37;  // [bp-0x168]
    char *v38;  // [bp-0x158]
    uint128_t v39;  // [bp-0x150]
    uint128_t v40;  // [bp-0x140], Other Possible Types: unsigned int
    unsigned long long v41;  // [bp-0x140]
    unsigned int v42;  // [bp-0x130]
    uint128_t v43;  // [bp-0x120]
    unsigned int v44;  // [bp-0x110]
    unsigned int v45;  // [bp-0x100]
    uint128_t v46;  // [bp-0x100], Other Possible Types: unsigned long long, unsigned int
    unsigned long long v47;  // [bp-0xf8], Other Possible Types: unsigned int
    uint128_t v48;  // [bp-0xf0], Other Possible Types: unsigned long long, unsigned int
    uint128_t v49;  // [bp-0xe0]
    char *v50;  // [bp-0xd0]
    char *v51;  // [bp-0x10]
    char v52;  // [bp+0x0]

    v51 = &v52;
    v53 = a0->field_20;
    v54 = a0->field_28;
    v55 = v54 * 32;
    v56 = 0xffffffffffffffff;
    v57 = v53;
    v58 = v55;
    do
    {
        v59 = v57;
        v60 = v56;
        if (!v58)
            goto LABEL_bbccc0;
    } while ((v57 = v59 + 4, v56 = v60 + 1, v58 -= 32, *v59 == 0x8000000000000000));
    v61 = v56 & 0xffffffff;
    if (v54 <= v61 || v53[4 * v61] == 0x8000000000000000)
    {
LABEL_bbcce8:
        sub_c73c64(&g_efa348);
LABEL_bbccf4:
        sub_c73c64(&g_efa348);
        goto LABEL_bbce04;
    }
    v62 = _malloc(16);
    if (!v62)
    {
        sub_c6b970(4, 16);
LABEL_bbcda0:
        sub_c6b970(8, v18);
LABEL_bbce04:
        __debugbreak();
    }
    v63 = v60 + 2;
    *(unsigned int *)v62 = v56;
    v45 = 4;
    v47 = v62;
    idx = 1;
LABEL_bbb09c:
    v48 = idx;
    while (1)
    {
        v65 = v57;
        if (v65 != (char *)v53 + v55)
        {
            v66 = v63;
            v57 = v65 + 4;
            v63 += 1;
            if (*v65 != 0x8000000000000000)
            {
                v67 = v66;
                if (v54 <= v67 || v53[4 * v67] == 0x8000000000000000)
                    goto LABEL_bbccf4;
                if (idx == v45)
                {
                    sub_c736c8(&v45, idx, 1, 4, 4);
                    v62 = v47;
                }
                *(unsigned int *)(v62 + idx * 4) = v66;
                idx += 1;
                goto LABEL_bbb09c;
            }
        }
        else
        {
            v19 = v54;
            v5 = 0;
            v68 = (unsigned int *)v47;
            v9 = &v68[idx];
            v10 = v45;
            v11 = &v23;
            v69 = a0->field_38;
            i = a0->field_40;
            v71 = g_efc958;
            v72 = *(int128_t *)&g_efc968;
            v7 = _mm_set1_epi64x(152);
            v8 = _mm_set_epi64x(1, 0);
            v6 = v68;
            v14 = v53;
            v15 = *(int128_t *)&g_efc968;
            v16 = g_efc958;
            break;
        }
    }
    while (1)
    {
        v74 = *v68;
        v12 = v68 + 1;
        v39 = CONCAT(8, 0);
        v40 = 0;
        v42 = 4;
        v43 = v71;
        v44 = v72;
        if (v19 <= v74 || (v75 = &v53[4 * v74], v75->field_0 == 0x8000000000000000))
            v76 = 0xffffffffffffffff;
        else
            v76 = 0xffffffff | v75->field_1c * 0x100000000;
        v77 = 0;
LABEL_bbb1c0:
        v78 = v76 & 0xffffffff;
        if (i > v78)
        {
            v76 = v76 & 0xffffffff00000000 | *(int *)(v69 + (unsigned int)v78 * 48 + 32);
            if (v78 >= i)
                goto LABEL_bbcd84;
            goto LABEL_bbb220;
        }
        else
        {
            v79 = v76 >> 32;
        }
        while (i > v79)
        {
            v78 = v79;
            v80 = v69 + 48 * v79;
            v79 = v80[9];
            iter2 = v80[10];
            v81 = arm64g_calculate_condition(1, iter2 & 0xffffffff, 1, 0);
            if (!(v81 & 1))
            {
                v76 = v76 & 0xffffffff | v79 * 0x100000000;
                if (i <= v78)
                    goto LABEL_bbcd84;
LABEL_bbb220:
                v82 = v69 + 48 * v78;
                if (v82->field_0 == 0x8000000000000000)
                {
LABEL_bbcd84:
                    sub_c73c64(&g_efbb78);
                    goto LABEL_bbce04;
                }
                if (v82->field_2c == (unsigned int)v74)
                {
                    v13 = v77;
                    if (v77 || !*(long long *)&v82->padding_10[0])
                    {
LABEL_bbb248:
                        v53 = v14;
                        v77 = v13 + 1;
                        if (*(long long *)&v82->padding_10[0])
                        {
                            v3 = (char *)v82->field_8 + 72 * *(long long *)&v82->padding_10[0];
                            v13 = v77;
                            goto *((void *)(sub_bbb274 + *(char *)(v82->field_8->field_8 + 14705978) * 4));
                        }
                        goto LABEL_bbb1c0;
                    }
                    else
                    {
                        v83 = &v82->field_8->field_0;
                        v84 = &v83[9 * *(long long *)&v82->padding_10[0]];
                        while (1)
                        {
                            while (1)
                            {
                                v85 = *v83;
                                v83 += 9;
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ < 0)
                                    goto LABEL_bbcce4;
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ < 0)
                                    goto LABEL_bbcce4;
                                v86 = v40;
                                v87 = arm64g_calculate_condition(1, v86 & 0xffffffff, 1, 0);
                                if (v87 & 1)
                                {
                                    sub_c73c80("assertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x\'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 88, &g_efc848);
                                    goto LABEL_bbce04;
                                }
                                if (v86 == *(unsigned long long *)&v39)
                                    sub_c6c28c(&v39);
                                v88 = *(unsigned long long *)((void*)&v39 + 8) + v86 * 16;
                                *v88 = v85;
                                v88[1] = 0xffffffffffffffff;
                                *(long long *)&v40 = v86 + 1;
                                if (!v44)
                                    sub_c70f38(&v43, &v45);
                                i7 = 0;
                                v90 = 0;
                                v91 = 5871781006564002453 * (v85 + 8);
                                v92 = *(unsigned long long *)&v43;
                                v93 = *(unsigned long long *)((void*)&v43 + 8);
                                v94 = v91 >> 57;
                                v95 = v94 | v94 * 0x100 | (v94 | v94 * 0x100) * 0x10000 | (v94 | v94 * 0x100 | (v94 | v94 * 0x100) * 0x10000) * 0x100000000;
                                v96 = v91 & v93;
                                v97 = *(long long *)(v92 + v96);
                                v99 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v97, v95));
                                v100 = v99 & 0x8080808080808080;
                                if (v99 & 0x8080808080808080)
                                    break;
                                while (i7 != 1)
                                {
                                    iter2 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v97));
                                    if (iter2)
                                    {
                                        v108 = ((((((iter2 & 0xaaaaaaaaaaaaaaaa) >> 1 | iter2 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((iter2 & 0xaaaaaaaaaaaaaaaa) >> 1 | iter2 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((iter2 & 0xaaaaaaaaaaaaaaaa) >> 1 | iter2 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((iter2 & 0xaaaaaaaaaaaaaaaa) >> 1 | iter2 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v109 = (((((((iter2 & 0xaaaaaaaaaaaaaaaa) >> 1 | iter2 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((iter2 & 0xaaaaaaaaaaaaaaaa) >> 1 | iter2 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((iter2 & 0xaaaaaaaaaaaaaaaa) >> 1 | iter2 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((iter2 & 0xaaaaaaaaaaaaaaaa) >> 1 | iter2 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v110 = ((((v109 | v108) & 0xffff0000ffff0000) >> 16 | (v109 | v108) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v109 | v108) & 0xffff0000ffff0000) >> 16 | (v109 | v108) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        iter2 = v96 + ((!v110 ? 64 : Clz(v110)) >> 3) & v93;
                                        break;
                                    }
                                    i7 = 0;
LABEL_bbb81c:
                                    v90 += 8;
                                    v96 = v90 + v96 & v93;
                                    v97 = *(long long *)(v92 + v96);
                                    v114 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v97, v95));
                                    v100 = v114 & 0x8080808080808080;
                                    if (v114 & 0x8080808080808080)
                                        goto LABEL_bbb7ac;
                                }
                                v111 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v97, _mm_set1_epi8(-1)));
                                if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v111, v111), _mm_unpacklo_epi64(v111, v111)))))))))) & 1))
                                {
                                    i7 = 1;
                                    goto LABEL_bbb81c;
                                }
                                v116 = *(char *)(v92 + iter2);
                                if (!(v116 >> 31 & 1))
                                {
                                    v118 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v92));
                                    v119 = ((((((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v120 = (((((((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v121 = ((((v120 | v119) & 0xffff0000ffff0000) >> 16 | (v120 | v119) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v120 | v119) & 0xffff0000ffff0000) >> 16 | (v120 | v119) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    iter2 = (!v121 ? 64 : Clz(v121)) >> 3;
                                    v116 = *(char *)(v92 + iter2);
                                }
                                *(char *)(v92 + iter2) = v94;
                                *(char *)(v92 + (v93 & iter2 - 8) + 8) = v94;
                                v44 = (unsigned int)_mm_sub_epi64(v44, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v116 & 1)));
                                v123 = v92 - iter2 * 16;
                                *(unsigned long *)((char *)v123 - 16) = v85;
                                *(unsigned int *)((char *)v123 - 8) = v86;
                                if (v83 == v84)
                                    goto LABEL_bbb248;
                            }
                            while (1)
                            {
LABEL_bbb7ac:
                                v101 = v100;
                                v102 = ((((((v101 & 0xaaaaaaaaaaaaaaaa) >> 1 | v101 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v101 & 0xaaaaaaaaaaaaaaaa) >> 1 | v101 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v101 & 0xaaaaaaaaaaaaaaaa) >> 1 | v101 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v101 & 0xaaaaaaaaaaaaaaaa) >> 1 | v101 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v103 = (((((((v101 & 0xaaaaaaaaaaaaaaaa) >> 1 | v101 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v101 & 0xaaaaaaaaaaaaaaaa) >> 1 | v101 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v101 & 0xaaaaaaaaaaaaaaaa) >> 1 | v101 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v101 & 0xaaaaaaaaaaaaaaaa) >> 1 | v101 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v104 = ((((v103 | v102) & 0xffff0000ffff0000) >> 16 | (v103 | v102) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v103 | v102) & 0xffff0000ffff0000) >> 16 | (v103 | v102) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                v105 = v92 - (v96 + ((!v104 ? 64 : Clz(v104)) >> 3) & v93) * 16;
                                if (v85 == *(long long *)((char *)v105 - 16))
                                    break;
                                v100 = v101 - 1 & v101;
                            }
                            *(unsigned int *)((char *)v105 - 8) = v86;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v115 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                            if (!(v115 & 1))
                            {
                                /* unsupported instruction */;
                                sub_b86a90(v85);
                            }
                            if (v83 == v84)
                                goto LABEL_bbb248;
                        }
                    }
                }
            }
        }
        v22 = v42;
        v23 = v43;
        v20 = v39;
        v21 = v40;
        v24 = v44;
        v25 = v16;
        v26 = v15;
        if (v19 <= v74 || (v124 = &v53[4 * v74], v124->field_0 == 0x8000000000000000))
            v125 = nan;
        else
            v125 = v124->field_18;
        v34 = v74;
        v31 = v69;
        v32 = i;
        v33 = v125;
        v30 = 1;
        sub_b9b9f0(&v27, &v30);
        n = v29;
        if (!n)
        {
            v18 = 1;
            goto LABEL_bbbae8;
        }
        v127 = v28;
        v128 = v127->field_0->field_8;
        v129 = v127->field_0->field_10;
        v18 = n * 24;
        v130 = _malloc(v18);
        if (!v130)
            goto LABEL_bbcda0;
        j = 0;
        v46 = n;
        v47 = v130;
        v13 = (st_bbaffc_4 *)v130;
        do
        {
            v132 = 24 * j;
            i1 = *(long long *)(*(long long *)((char *)v127 + v132) + 16);
            v134 = i1 * 8;
            v135 = i1 >> 61;
            v136 = arm64g_calculate_condition((!v135 ? 4 : 0) | 128, (!v135 ? v134 : 0x20000000), (!v135 ? 0x7ffffffffffffff8 : 0), 0);
            if (v136 & 1)
            {
                v474 = 0;
                goto LABEL_bbcc68;
            }
            v137 = *(long long *)(*(long long *)((char *)v127 + v132) + 8);
            if (v134)
            {
                v17 = _malloc(v134);
                if (v17)
                {
                    v138 = i1;
                    if (!i1)
                        continue;
                }
                else
                {
                    v17 = v134;
                    v474 = 8;
LABEL_bbcc68:
                    sub_c6b970(v474, v17);
                    goto LABEL_bbce04;
                }
            }
            else
            {
                v138 = 0;
                v17 = 8;
                if (!i1)
                    continue;
            }
            if (4 > i1)
            {
                idx2 = 0;
            }
            else
            {
                idx2 = i1 & 0x1ffffffffffffffc;
                v140 = v17 + 16;
                v141 = i1 & 0x1ffffffffffffffc;
                v142 = v8;
                do
                {
                    i0 = v141;
                    v145 = _mm_add_epi64(CONCAT(v137, v137), _INSERT(__double_as_longlong(__longlong_as_double(_mm_cvtsi128_si64(v142) * 72)), 8, _mm_extract_epi64(v142, 1) * 72));
                    *(__m128i *)(v140 - 16) = _mm_add_epi64(v145, _mm_set1_epi64x(8));
                    *(__m128i *)v140 = _mm_add_epi64(v145, v7);
                    v142 = _mm_add_epi64(v142, _mm_set1_epi64x(4));
                    v140 += 32;
                    iter2 = i0 - 4;
                    v141 = iter2;
                } while (i0 != 4);
                if (i1 == idx2)
                    continue;
            }
            v146 = &v137[9 * idx2 + 1];
            iter2 = v17;
            do
            {
                *(unsigned long long *)(iter2 + idx2 * 8) = v146;
                idx2 += 1;
                v146 += 72;
            } while (i1 != idx2);
            v53 = v14;
            v147 = &v13[j];
            v147->field_0 = v138;
            v147->field_8 = v17;
            v147->field_10 = i1;
            j += 1;
        } while (j != n);
        v39 = v16;
        v40 = v15;
        if (v129)
        {
            v148 = 0;
            v4 = &v128[9 * v129];
            v149 = a1;
            do
            {
                v150 = v128;
                v128 += 9;
                v151 = v18;
                v152 = v13;
                while (1)
                {
                    v153 = v152;
                    if (!v151)
                        break;
                    if (v153->field_10 <= v148)
                    {
                        sub_c73c94(v148);
                        goto LABEL_bbce04;
                    }
                    v152 = v153 + 1;
                    v151 -= 24;
                    if (*(long long *)*(long long *)&v153->field_8[v148])
                        goto LABEL_bbbfd0;
                }
                v46 = v16;
                v48 = v15;
                v154 = &v13->field_10;
                i2 = n;
                do
                {
                    v156 = i2;
                    if (*v154 <= v148)
                    {
                        sub_c73c94(v148);
                        goto LABEL_bbce04;
                    }
                    if (!*(long long *)*(long long *)(*(long long *)((char *)v154 - 8) + v148 * 8))
                        sub_bb09e0(&v46, *(long long *)(*(long long *)((char *)v154 - 8) + v148 * 8) + 8);
                    v154 += 3;
                    i2 = v156 - 1;
                } while (i2);
                v157 = *(unsigned long long *)&v46;
                v158 = *(unsigned long long *)((void*)&v46 + 8);
                v128 = v150 + 9;
                if (*(unsigned long long *)((void*)&v48 + 8) != 1 && v158)
                {
                    v224 = v158 * 8;
                    v225 = arm64g_calculate_condition(2, v224 + v158, 0x11, 0);
                    if (!(v225 & 1))
                    {
                        _free(v157 - v224 - 8);
                        goto LABEL_bbbfd0;
                    }
                }
                v159 = (unsigned int)v149[2].field_0;
                if (v149[2].field_0)
                {
                    iter2 = *(long long *)&v149->field_8;
LABEL_bbbd18:
                    v160 = 0;
                    v161 = 5871781006564002453 * (*v150 + 8);
                    v162 = v161;
                    while (1)
                    {
                        v163 = v162 & iter2;
                        v164 = *(long long *)((char *)v149->field_0 + v163);
                        v166 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v164, (uint128_t)(v161 >> 57 & 0xff | (v161 >> 57 & 0xff) * 0x100 | (v161 >> 57 & 0xff | (v161 >> 57 & 0xff) * 0x100) * 0x10000 | (v161 >> 57 & 0xff | (v161 >> 57 & 0xff) * 0x100 | (v161 >> 57 & 0xff | (v161 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                        v167 = v166 & 0x8080808080808080;
                        if (v166 & 0x8080808080808080)
                        {
                            do
                            {
                                v168 = v167;
                                v169 = ((((((v168 & 0xaaaaaaaaaaaaaaaa) >> 1 | v168 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v168 & 0xaaaaaaaaaaaaaaaa) >> 1 | v168 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v168 & 0xaaaaaaaaaaaaaaaa) >> 1 | v168 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v168 & 0xaaaaaaaaaaaaaaaa) >> 1 | v168 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v170 = (((((((v168 & 0xaaaaaaaaaaaaaaaa) >> 1 | v168 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v168 & 0xaaaaaaaaaaaaaaaa) >> 1 | v168 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v168 & 0xaaaaaaaaaaaaaaaa) >> 1 | v168 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v168 & 0xaaaaaaaaaaaaaaaa) >> 1 | v168 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v171 = ((((v170 | v169) & 0xffff0000ffff0000) >> 16 | (v170 | v169) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v170 | v169) & 0xffff0000ffff0000) >> 16 | (v170 | v169) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                v172 = &v149->field_0[-2 * (v163 + ((!v171 ? 64 : Clz(v171)) >> 3) & iter2)];
                                if (*v150 == *(long long *)((char *)v172 - 16))
                                {
                                    v150 = (char *)v172 - 8;
                                    goto LABEL_bbbd18;
                                }
                            } while ((v173 = v168 - 1, v167 = v173 & v168, v173 & v168));
                        }
                        v174 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v164, _mm_set1_epi8(-1)));
                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))))))))) & 1)
                            break;
                        v160 += 8;
                        v162 = v163 + v160;
                    }
                }
                if (v158)
                {
                    v176 = arm64g_calculate_condition(18, v158 * 9, 0x11, 0);
                    iter2 = !(v176 & 1);
                }
                v178 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v157));
                i3 = v178 & 0x8080808080808080;
                if (!(v178 & 0x8080808080808080))
                {
                    v180 = v157 + 8;
                    do
                    {
                        v181 = v180 + 1;
                        v157 -= 64;
                        i3 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v180)) & 0x8080808080808080;
                        v180 = v181;
                    } while (!i3);
                }
                v183 = ((((((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v184 = (((((((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v185 = ((((v184 | v183) & 0xffff0000ffff0000) >> 16 | (v184 | v183) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v184 | v183) & 0xffff0000ffff0000) >> 16 | (v184 | v183) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                v186 = *(long long *)(v157 - ((!v185 ? 64 : Clz(v185)) & 120) - 8);
                if (!(iter2 & 1) && v158)
                {
                    _free();
                    v159 = (unsigned int)v149[2].field_0;
                }
                if (v159)
                {
LABEL_bbbe54:
                    v187 = 0;
                    iter2 = *v186;
                    v188 = 5871781006564002453 * (iter2 + 8);
                    v189 = v188;
                    while (1)
                    {
                        v190 = v189 & *(long long *)&v149->field_8;
                        v191 = *(long long *)((char *)v149->field_0 + v190);
                        v193 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v191, (uint128_t)(v188 >> 57 & 0xff | (v188 >> 57 & 0xff) * 0x100 | (v188 >> 57 & 0xff | (v188 >> 57 & 0xff) * 0x100) * 0x10000 | (v188 >> 57 & 0xff | (v188 >> 57 & 0xff) * 0x100 | (v188 >> 57 & 0xff | (v188 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                        v194 = v193 & 0x8080808080808080;
                        if (v193 & 0x8080808080808080)
                        {
                            do
                            {
                                v195 = v194;
                                v196 = ((((((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v197 = (((((((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v198 = ((((v197 | v196) & 0xffff0000ffff0000) >> 16 | (v197 | v196) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v197 | v196) & 0xffff0000ffff0000) >> 16 | (v197 | v196) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                v199 = &v149->field_0[-2 * (v190 + ((!v198 ? 64 : Clz(v198)) >> 3) & *(long long *)&v149->field_8)];
                                if (iter2 == *(long long *)(v199 - 16))
                                {
                                    v186 = v199 - 8;
                                    goto LABEL_bbbe54;
                                }
                            } while ((v200 = v195 - 1, v194 = v200 & v195, v200 & v195));
                        }
                        v201 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v191, _mm_set1_epi8(-1)));
                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v201, v201), _mm_unpacklo_epi64(v201, v201)))))))))) & 1)
                            break;
                        v187 += 8;
                        v189 = v190 + v187;
                    }
                }
                if (*v186 != *v150)
                {
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    if ((long long)/* unsupported instruction */ < 0)
                        goto LABEL_bbcce4;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    if ((long long)/* unsupported instruction */ < 0)
                        goto LABEL_bbcce4;
                    if (!sub_bafae4(&v25))
                        goto LABEL_bbbfb8;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v203 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (v203 & 1)
                        goto LABEL_bbbfb8;
                    goto LABEL_bbbedc;
                }
                if (!*(unsigned long long *)((void*)&v24 + 8))
                    goto LABEL_bbbfb8;
                v204 = 0;
                v205 = 5871781006564002453 * (*v150 + 8);
                iter2 = *(unsigned long long *)&v23;
                v206 = *(unsigned long long *)((void*)&v23 + 8);
                v207 = v205 >> 57 & 0xff | (v205 >> 57 & 0xff) * 0x100 | (v205 >> 57 & 0xff | (v205 >> 57 & 0xff) * 0x100) * 0x10000 | (v205 >> 57 & 0xff | (v205 >> 57 & 0xff) * 0x100 | (v205 >> 57 & 0xff | (v205 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                v208 = v205 & v206;
                v209 = *(long long *)(iter2 + v208);
                v211 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v209, v207));
                v212 = v211 & 0x8080808080808080;
                if (!(v211 & 0x8080808080808080))
                {
                    do
                    {
LABEL_bbbf5c:
                        v213 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v209, _mm_set1_epi8(-1)));
                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v213, v213), _mm_unpacklo_epi64(v213, v213)))))))))) & 1)
                            goto LABEL_bbbfb8;
                        v204 += 8;
                        v208 = v208 + v204 & v206;
                        v209 = *(long long *)(iter2 + v208);
                        v216 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v209, v207));
                        v212 = v216 & 0x8080808080808080;
                    } while (!(v216 & 0x8080808080808080));
                }
                while (1)
                {
                    v217 = v212;
                    v218 = ((((((v217 & 0xaaaaaaaaaaaaaaaa) >> 1 | v217 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v217 & 0xaaaaaaaaaaaaaaaa) >> 1 | v217 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v217 & 0xaaaaaaaaaaaaaaaa) >> 1 | v217 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v217 & 0xaaaaaaaaaaaaaaaa) >> 1 | v217 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v219 = (((((((v217 & 0xaaaaaaaaaaaaaaaa) >> 1 | v217 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v217 & 0xaaaaaaaaaaaaaaaa) >> 1 | v217 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v217 & 0xaaaaaaaaaaaaaaaa) >> 1 | v217 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v217 & 0xaaaaaaaaaaaaaaaa) >> 1 | v217 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v220 = ((((v219 | v218) & 0xffff0000ffff0000) >> 16 | (v219 | v218) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v219 | v218) & 0xffff0000ffff0000) >> 16 | (v219 | v218) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    v221 = iter2 - (v208 + ((!v220 ? 64 : Clz(v220)) >> 3) & v206) * 16;
                    if (*v186 == *(long long *)((char *)v221 - 16))
                        break;
                    v222 = v217 - 1;
                    v212 = v222 & v217;
                    if (!(v222 & v217))
                        goto LABEL_bbbf5c;
                }
                if (sub_bd40e4(&v20, *(int *)((char *)v221 - 8)))
                {
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v223 = arm64g_calculate_condition(4, /* unsupported instruction */, 1, 0);
                    if (!(v223 & 1))
                        goto LABEL_bbbfb8;
LABEL_bbbedc:
                    /* unsupported instruction */;
                    sub_b86a90();
                }
LABEL_bbbfb8:
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                if ((long long)/* unsupported instruction */ < 0)
                    goto LABEL_bbcce4;
LABEL_bbbfd0:
            } while ((sub_bb081c(&v39), v148 += 1, v128 != v4));
            if (!*(unsigned long long *)((void*)&v40 + 8))
                goto LABEL_bbc574;
            v226 = v28;
            v227 = v29;
            if (v227)
            {
                v228 = v227 * 4;
                ptr = _malloc(v228);
                if (ptr)
                {
                    v46 = v227;
                    v47 = ptr;
                    v48 = 0;
                    v230 = 0xffffffffffffffe8 + 24 * v227;
                    if (v230 > 287 && !(v231 = (0xffffffffffffffe8 + 24 * v227) / 24, v232 = (unsigned int)(struct st_bbaffc_7 *)((char *)&(&v226->field_0)[3 * v231 + 2] + 4), v233 = arm64g_calculate_condition((ptr < v232 ? 4 : 0) | 48, (ptr < v232 ? (struct st_bbaffc_7 *)&v226->field_10 : 0x20000000), (ptr < v232 ? ptr + v231 * 4 + 4 : 0), 0), v233 & 1))
                    {
                        v234 = v230 / 24 + 1;
                        idx1 = v234 - (!(v234 & 7) ? 8 : v234 & 7);
                        l = &(&v226->field_0)[3 * idx1];
                        v237 = &v226->field_70;
                        v238 = ptr;
                        iter = ptr + 16;
                        k = idx1;
                        do
                        {
                            v241 = k;
                            v242 = _INSERT(*(int *)((char *)v237 - 96), 4, *(int *)((char *)v237 - 72));
                            v243 = _INSERT(v242, 8, *(int *)((char *)v237 - 48));
                            v244 = _INSERT(v243, 12, *(int *)((char *)v237 - 24));
                            v245 = v237 + 48;
                            v246 = _INSERT(*v237, 4, v237[6]);
                            v247 = _INSERT(v246, 8, v237[12]);
                            v248 = _INSERT(v247, 12, v237[18]);
                            *(uint128_t *)(iter - 16) = v244;
                            *(uint128_t *)iter = v248;
                            iter += 32;
                            v237 = v245;
                            k = v241 - 8;
                        } while (k);
                    }
                    else
                    {
                        v238 = ptr;
                        idx1 = 0;
                        l = v226;
                    }
                    ptr1 = v238;
                    do
                    {
                        v251 = &l->field_18;
                        *(unsigned int *)(ptr1 + idx1 * 4) = l->field_10;
                        idx1 += 1;
                        l = v251;
                    } while (l != &(&v226->field_0)[3 * v227]);
                    goto LABEL_bbc5e4;
                }
                else
                {
                    sub_c6b970(4, v228);
                    goto LABEL_bbce04;
                }
                goto LABEL_bbce04;
            }
            else
            {
                idx1 = 0;
                v46 = 0;
                v47 = 4;
                ptr1 = 4;
                v48 = 0;
LABEL_bbc5e4:
                if (v27)
                    _free(v226);
                v0 = v46;
                v2 = ptr1;
                v3 = ptr1 + idx1 * 4;
                iter1 = (unsigned int *)ptr1;
            }
            while (1)
            {
                do
                {
                    if (iter1 == v3)
                    {
                        if (v0)
                            _free(ptr1);
                        v18 = 0;
                        v5 = 1;
                        goto LABEL_bbcb70;
                    }
                    v253 = *iter1;
                    iter1 += 1;
                    if (i <= v253 || (v254 = v69 + (unsigned int)v253 * 48, v254->field_0 == 0x8000000000000000))
                    {
                        sub_c73c64(&g_ef9a08);
                        goto LABEL_bbce04;
                    }
                } while ((v18 = *(long long *)&v254->field_10, !*(long long *)&v254->field_10));
                v4 = v254;
                v5 = iter1;
                v255 = v254->field_8;
                v256 = (unsigned int)v149[2].field_0;
                v257 = *(long long *)&v149->field_8;
                v258 = v149->field_0;
                v259 = *(unsigned long long *)&v39;
                v260 = *(unsigned long long *)((void*)&v39 + 8);
                node = 0;
                if (v256)
                {
                    do
                    {
                        v262 = v255 + 72 * node;
                        v263 = v262;
LABEL_bbc760:
                        v264 = 0;
                        v265 = *v263;
                        v266 = 5871781006564002453 * (v265 + 8);
                        v267 = v266 >> 57 & 0xff | (v266 >> 57 & 0xff) * 0x100 | (v266 >> 57 & 0xff | (v266 >> 57 & 0xff) * 0x100) * 0x10000 | (v266 >> 57 & 0xff | (v266 >> 57 & 0xff) * 0x100 | (v266 >> 57 & 0xff | (v266 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                        v268 = v266;
                        while (1)
                        {
                            v269 = v268 & v257;
                            v270 = *(long long *)((char *)v258 + v269);
                            v272 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v270, v267));
                            v273 = v272 & 0x8080808080808080;
                            if (v272 & 0x8080808080808080)
                            {
                                do
                                {
                                    v274 = v273;
                                    v275 = ((((((v274 & 0xaaaaaaaaaaaaaaaa) >> 1 | v274 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v274 & 0xaaaaaaaaaaaaaaaa) >> 1 | v274 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v274 & 0xaaaaaaaaaaaaaaaa) >> 1 | v274 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v274 & 0xaaaaaaaaaaaaaaaa) >> 1 | v274 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v276 = (((((((v274 & 0xaaaaaaaaaaaaaaaa) >> 1 | v274 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v274 & 0xaaaaaaaaaaaaaaaa) >> 1 | v274 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v274 & 0xaaaaaaaaaaaaaaaa) >> 1 | v274 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v274 & 0xaaaaaaaaaaaaaaaa) >> 1 | v274 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v277 = ((((v276 | v275) & 0xffff0000ffff0000) >> 16 | (v276 | v275) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v276 | v275) & 0xffff0000ffff0000) >> 16 | (v276 | v275) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v278 = &v258[-2 * (v269 + ((!v277 ? 64 : Clz(v277)) >> 3) & v257)];
                                    if (v265 == *(long long *)((char *)v278 - 16))
                                    {
                                        v263 = (char *)v278 - 8;
                                        goto LABEL_bbc760;
                                    }
                                } while ((v279 = v274 - 1, v273 = v279 & v274, v279 & v274));
                            }
                            v280 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v270, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v280, v280), _mm_unpacklo_epi64(v280, v280)))))))))) & 1)
                                break;
                            v264 += 8;
                            v268 = v269 + v264;
                        }
                        if (*(unsigned long long *)((void*)&v40 + 8))
                        {
                            v282 = 0;
                            while (1)
                            {
                                v283 = v266 & v260;
                                v284 = *(long long *)(v259 + v283);
                                v286 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v284, v267));
                                v287 = v286 & 0x8080808080808080;
                                if (v286 & 0x8080808080808080)
                                {
                                    do
                                    {
                                        v288 = v287;
                                        v289 = ((((((v288 & 0xaaaaaaaaaaaaaaaa) >> 1 | v288 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v288 & 0xaaaaaaaaaaaaaaaa) >> 1 | v288 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v288 & 0xaaaaaaaaaaaaaaaa) >> 1 | v288 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v288 & 0xaaaaaaaaaaaaaaaa) >> 1 | v288 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v290 = (((((((v288 & 0xaaaaaaaaaaaaaaaa) >> 1 | v288 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v288 & 0xaaaaaaaaaaaaaaaa) >> 1 | v288 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v288 & 0xaaaaaaaaaaaaaaaa) >> 1 | v288 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v288 & 0xaaaaaaaaaaaaaaaa) >> 1 | v288 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v291 = ((((v290 | v289) & 0xffff0000ffff0000) >> 16 | (v290 | v289) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v290 | v289) & 0xffff0000ffff0000) >> 16 | (v290 | v289) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (v265 == *(long long *)(v259 - (v283 + ((!v291 ? 64 : Clz(v291)) >> 3) & v260) * 8 - 8))
                                            goto LABEL_bbc7c4;
                                    } while ((v292 = v288 - 1, v287 = v292 & v288, v292 & v288));
                                }
                                v293 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v284, _mm_set1_epi8(-1)));
                                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v293, v293), _mm_unpacklo_epi64(v293, v293)))))))))) & 1)
                                    break;
                                v282 += 8;
                                v266 = v283 + v282;
                            }
                        }
                        node += 1;
                    } while (node != v18);
                    goto LABEL_bbc7ac;
                }
                while (1)
                {
                    if (!*(unsigned long long *)((void*)&v40 + 8))
                    {
LABEL_bbcb10:
                        node += 1;
                        if (node == v18)
                        {
LABEL_bbc7ac:
                            v149 = a1;
                            v53 = v14;
                            iter1 = v5;
                            break;
                        }
                    }
                    else
                    {
                        v295 = 0;
                        v262 = v255 + 72 * node;
                        v296 = 5871781006564002453 * (*v262 + 8);
                        v297 = v296;
                        while (1)
                        {
                            v298 = v297 & v260;
                            v299 = *(long long *)(v259 + v298);
                            v301 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v299, (uint128_t)(v296 >> 57 & 0xff | (v296 >> 57 & 0xff) * 0x100 | (v296 >> 57 & 0xff | (v296 >> 57 & 0xff) * 0x100) * 0x10000 | (v296 >> 57 & 0xff | (v296 >> 57 & 0xff) * 0x100 | (v296 >> 57 & 0xff | (v296 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                            v302 = v301 & 0x8080808080808080;
                            if (v301 & 0x8080808080808080)
                                break;
LABEL_bbcaf0:
                            v308 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v299, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v308, v308), _mm_unpacklo_epi64(v308, v308)))))))))) & 1)
                                goto LABEL_bbcb10;
                            v295 += 8;
                            v297 = v298 + v295;
                        }
                        while (1)
                        {
                            v303 = v302;
                            v304 = ((((((v303 & 0xaaaaaaaaaaaaaaaa) >> 1 | v303 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v303 & 0xaaaaaaaaaaaaaaaa) >> 1 | v303 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v303 & 0xaaaaaaaaaaaaaaaa) >> 1 | v303 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v303 & 0xaaaaaaaaaaaaaaaa) >> 1 | v303 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v305 = (((((((v303 & 0xaaaaaaaaaaaaaaaa) >> 1 | v303 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v303 & 0xaaaaaaaaaaaaaaaa) >> 1 | v303 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v303 & 0xaaaaaaaaaaaaaaaa) >> 1 | v303 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v303 & 0xaaaaaaaaaaaaaaaa) >> 1 | v303 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v306 = ((((v305 | v304) & 0xffff0000ffff0000) >> 16 | (v305 | v304) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v305 | v304) & 0xffff0000ffff0000) >> 16 | (v305 | v304) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (*v262 == *(long long *)(v259 - (v298 + ((!v306 ? 64 : Clz(v306)) >> 3) & v260) * 8 - 8))
                                break;
                            v307 = v303 - 1;
                            v302 = v307 & v303;
                            if (!(v307 & v303))
                                goto LABEL_bbcaf0;
                        }
LABEL_bbc7c4:
                        i6 = node + 1;
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v311 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (!(v311 & 1))
                        {
                            /* unsupported instruction */;
                            v1 = v256;
                            sub_b86a90(*v262);
                            v256 = v1;
                        }
                        sub_b9b2c4(v262 + 1);
                        if (v18 > i6)
                        {
                            if (v256)
                            {
                                do
                                {
                                    v312 = v255 + 72 * i6;
                                    v313 = v312;
LABEL_bbc920:
                                    v314 = 0;
                                    v315 = *(long long *)v313;
                                    v316 = 5871781006564002453 * (v315 + 8);
                                    v317 = v316 >> 57 & 0xff | (v316 >> 57 & 0xff) * 0x100 | (v316 >> 57 & 0xff | (v316 >> 57 & 0xff) * 0x100) * 0x10000 | (v316 >> 57 & 0xff | (v316 >> 57 & 0xff) * 0x100 | (v316 >> 57 & 0xff | (v316 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                    v318 = v316;
                                    while (1)
                                    {
                                        v319 = v318 & v257;
                                        v320 = *(long long *)((char *)v258 + v319);
                                        v322 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v320, v317));
                                        v323 = v322 & 0x8080808080808080;
                                        if (v322 & 0x8080808080808080)
                                        {
                                            do
                                            {
                                                v324 = v323;
                                                v325 = ((((((v324 & 0xaaaaaaaaaaaaaaaa) >> 1 | v324 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v324 & 0xaaaaaaaaaaaaaaaa) >> 1 | v324 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v324 & 0xaaaaaaaaaaaaaaaa) >> 1 | v324 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v324 & 0xaaaaaaaaaaaaaaaa) >> 1 | v324 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                v326 = (((((((v324 & 0xaaaaaaaaaaaaaaaa) >> 1 | v324 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v324 & 0xaaaaaaaaaaaaaaaa) >> 1 | v324 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v324 & 0xaaaaaaaaaaaaaaaa) >> 1 | v324 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v324 & 0xaaaaaaaaaaaaaaaa) >> 1 | v324 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                v327 = ((((v326 | v325) & 0xffff0000ffff0000) >> 16 | (v326 | v325) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v326 | v325) & 0xffff0000ffff0000) >> 16 | (v326 | v325) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                v328 = &v258[-2 * (v319 + ((!v327 ? 64 : Clz(v327)) >> 3) & v257)];
                                                if (v315 == *(long long *)((char *)v328 - 16))
                                                {
                                                    v313 = v328 - 8;
                                                    goto LABEL_bbc920;
                                                }
                                            } while ((v329 = v324 - 1, v323 = v329 & v324, v329 & v324));
                                        }
                                        v330 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v320, _mm_set1_epi8(-1)));
                                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v330, v330), _mm_unpacklo_epi64(v330, v330)))))))))) & 1)
                                            break;
                                        v314 += 8;
                                        v318 = v319 + v314;
                                    }
                                    if (*(unsigned long long *)((void*)&v40 + 8))
                                    {
                                        v332 = 0;
                                        while (1)
                                        {
                                            v333 = v316 & *(unsigned long long *)((void*)&v39 + 8);
                                            v334 = *(long long *)(*(unsigned long long *)&v39 + v333);
                                            v336 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v334, v317));
                                            v337 = v336 & 0x8080808080808080;
                                            if (v336 & 0x8080808080808080)
                                            {
                                                do
                                                {
                                                    v338 = v337;
                                                    v339 = ((((((v338 & 0xaaaaaaaaaaaaaaaa) >> 1 | v338 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v338 & 0xaaaaaaaaaaaaaaaa) >> 1 | v338 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v338 & 0xaaaaaaaaaaaaaaaa) >> 1 | v338 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v338 & 0xaaaaaaaaaaaaaaaa) >> 1 | v338 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                    v340 = (((((((v338 & 0xaaaaaaaaaaaaaaaa) >> 1 | v338 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v338 & 0xaaaaaaaaaaaaaaaa) >> 1 | v338 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v338 & 0xaaaaaaaaaaaaaaaa) >> 1 | v338 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v338 & 0xaaaaaaaaaaaaaaaa) >> 1 | v338 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                    v341 = ((((v340 | v339) & 0xffff0000ffff0000) >> 16 | (v340 | v339) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v340 | v339) & 0xffff0000ffff0000) >> 16 | (v340 | v339) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                    if (v315 == *(long long *)(*(unsigned long long *)&v39 - (v333 + ((!v341 ? 64 : Clz(v341)) >> 3) & *(unsigned long long *)((void*)&v39 + 8)) * 8 - 8))
                                                    {
                                                        i6 += 1;
                                                        do
                                                        {
                                                            /* unsupported instruction */;
                                                            /* unsupported instruction */;
                                                            /* unsupported instruction */;
                                                        } while (/* unsupported instruction */ ^ 1);
                                                        v345 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                                        if (!(v345 & 1))
                                                        {
                                                            /* unsupported instruction */;
                                                            sub_b86a90(*(long long *)v312);
                                                        }
                                                        sub_b9b2c4(v312 + 8);
                                                        goto LABEL_bbc990;
                                                    }
                                                } while ((v342 = v338 - 1, v337 = v342 & v338, v342 & v338));
                                            }
                                            v343 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v334, _mm_set1_epi8(-1)));
                                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v343, v343), _mm_unpacklo_epi64(v343, v343)))))))))) & 1)
                                                break;
                                            v332 += 8;
                                            v316 = v333 + v332;
                                        }
                                    }
                                    v346 = v255 + 72 * node;
                                    v346->field_0 = *(int128_t *)v312;
                                    v347 = (int128_t)v312[16];
                                    v348 = (int128_t)v312[32];
                                    v349 = (int128_t)v312[48];
                                    v346->field_40 = (long long)v312[64];
                                    v346->field_20 = v348;
                                    v346->field_30 = v349;
                                    v346->field_10 = v347;
                                    node += 1;
                                    i6 += 1;
LABEL_bbc990:
                                } while (i6 < v18);
                            }
                            else
                            {
                                do
                                {
                                    v350 = v255 + 72 * i6;
                                    if (*(unsigned long long *)((void*)&v40 + 8))
                                    {
                                        v351 = 0;
                                        v352 = 5871781006564002453 * (*(long long *)v350 + 8);
                                        v353 = v352;
                                        while (1)
                                        {
                                            v354 = v353 & *(unsigned long long *)((void*)&v39 + 8);
                                            v355 = *(long long *)(*(unsigned long long *)&v39 + v354);
                                            v357 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v355, (uint128_t)(v352 >> 57 & 0xff | (v352 >> 57 & 0xff) * 0x100 | (v352 >> 57 & 0xff | (v352 >> 57 & 0xff) * 0x100) * 0x10000 | (v352 >> 57 & 0xff | (v352 >> 57 & 0xff) * 0x100 | (v352 >> 57 & 0xff | (v352 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                                            v358 = v357 & 0x8080808080808080;
                                            if (v357 & 0x8080808080808080)
                                            {
                                                do
                                                {
                                                    v359 = v358;
                                                    v360 = ((((((v359 & 0xaaaaaaaaaaaaaaaa) >> 1 | v359 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v359 & 0xaaaaaaaaaaaaaaaa) >> 1 | v359 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v359 & 0xaaaaaaaaaaaaaaaa) >> 1 | v359 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v359 & 0xaaaaaaaaaaaaaaaa) >> 1 | v359 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                    v361 = (((((((v359 & 0xaaaaaaaaaaaaaaaa) >> 1 | v359 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v359 & 0xaaaaaaaaaaaaaaaa) >> 1 | v359 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v359 & 0xaaaaaaaaaaaaaaaa) >> 1 | v359 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v359 & 0xaaaaaaaaaaaaaaaa) >> 1 | v359 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                    v362 = ((((v361 | v360) & 0xffff0000ffff0000) >> 16 | (v361 | v360) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v361 | v360) & 0xffff0000ffff0000) >> 16 | (v361 | v360) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                    if (*(long long *)v350 == *(long long *)(*(unsigned long long *)&v39 - (v354 + ((!v362 ? 64 : Clz(v362)) >> 3) & *(unsigned long long *)((void*)&v39 + 8)) * 8 - 8))
                                                    {
                                                        i6 += 1;
                                                        do
                                                        {
                                                            /* unsupported instruction */;
                                                            /* unsupported instruction */;
                                                            /* unsupported instruction */;
                                                        } while (/* unsupported instruction */ ^ 1);
                                                        v366 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                                        if (!(v366 & 1))
                                                        {
                                                            /* unsupported instruction */;
                                                            sub_b86a90(*(long long *)v350);
                                                        }
                                                        sub_b9b2c4(v350 + 8);
                                                        goto LABEL_bbca9c;
                                                    }
                                                } while ((v363 = v359 - 1, v358 = v363 & v359, v363 & v359));
                                            }
                                            v364 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v355, _mm_set1_epi8(-1)));
                                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v364, v364), _mm_unpacklo_epi64(v364, v364)))))))))) & 1)
                                                break;
                                            v351 += 8;
                                            v353 = v354 + v351;
                                        }
                                    }
                                    v367 = v255 + 72 * node;
                                    v367->field_0 = *(int128_t *)v350;
                                    v368 = (int128_t)v350[16];
                                    v369 = (int128_t)v350[32];
                                    v370 = (int128_t)v350[48];
                                    v367->field_40 = (long long)v350[64];
                                    v367->field_20 = v369;
                                    v367->field_30 = v370;
                                    v367->field_10 = v368;
                                    node += 1;
                                    i6 += 1;
LABEL_bbca9c:
                                } while (i6 < v18);
                            }
                        }
                        iter1 = v5;
                        *(unsigned long long *)&v4->field_10 = node;
                        v149 = a1;
                        v53 = v14;
                        ptr1 = v2;
                        break;
                    }
                }
            }
        }
LABEL_bbc574:
        v18 = 1;
LABEL_bbcb70:
        v371 = *(unsigned long long *)((void*)&v39 + 8);
        if (v371)
        {
            m = *(unsigned long long *)((void*)&v40 + 8);
            if (*(unsigned long long *)((void*)&v40 + 8))
            {
                v373 = *(unsigned long long *)&v39;
                v374 = *(unsigned long long *)&v39 + 8;
                i5 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)*(unsigned long long *)(void*)&v39)) & 0x8080808080808080;
                do
                {
                    v377 = v374;
                    if (!i5)
                    {
                        do
                        {
                            v377 = v374 + 1;
                            v373 -= 64;
                            i5 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v374)) & 0x8080808080808080;
                            v374 = v377;
                        } while (!i5);
                    }
                    v374 = v377;
                    v379 = ((((((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v380 = (((((((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v381 = ((((v380 | v379) & 0xffff0000ffff0000) >> 16 | (v380 | v379) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v380 | v379) & 0xffff0000ffff0000) >> 16 | (v380 | v379) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    i5 &= i5 - 1;
                    m -= 1;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v382 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (!(v382 & 1))
                    {
                        /* unsupported instruction */;
                        sub_b86a90(*(long long *)(v373 - ((!v381 ? 64 : Clz(v381)) & 120) - 8));
                    }
                } while (m);
            }
            v383 = v371 * 8;
            v384 = arm64g_calculate_condition(2, v383 + v371, 0x11, 0);
            if (!(v384 & 1))
                _free(*(unsigned long long *)&v39 - v383 - 8);
        }
        for (v385 = &v13->field_8; n; n -= 1)
        {
            if (*(long long *)((char *)v385 - 8))
                _free(*v385);
            v385 += 3;
        }
        _free(v13);
LABEL_bbbae8:
        v386 = *(unsigned long long *)&v25;
        v387 = v386;
        iter2 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v387)) & 0x8080808080808080;
        *(unsigned int *)((char *)&v35 + 8) = iter2;
        *(long long *)&v36 = v387 + 8;
        *(unsigned int *)&v35 = v386;
        *(unsigned long long *)((char *)&v36 + 8) = v386 + *(unsigned long long *)((void*)&v25 + 8) + 1;
        v37 = CONCAT(&v20, *(unsigned long long *)((void*)&v26 + 8));
        v38 = v11;
        v389 = sub_bccee4(&v35, (char *)&v37 + 8);
        if (v389)
            break;
        v46 = 0;
        v47 = 8;
        v48 = 0;
LABEL_bbc42c:
        if ((!v27 ? 0 : v18) & 1)
            _free(v28);
        sub_b98884(&v25);
        sub_bbd2b4(&v20);
        v68 = v12;
        v72 = v15;
        v71 = v16;
        if (v68 == v9)
        {
            if (v10)
                _free(v6);
            v58 = v5;
LABEL_bbccc0:
            return v58 & 1;
        }
    }
    ptr2 = _malloc(64);
    if (!ptr2)
    {
        sub_c6b970(8, 64);
        goto LABEL_bbce04;
    }
    v391 = ptr2;
    v392 = 0;
    *(unsigned long long *)ptr2 = v389;
    *(uint128_t **)(ptr2 + 8) = (char *)&v37 + 8;
    v39 = CONCAT(ptr2, 4);
    *(unsigned long long *)&v40 = 1;
    v46 = v35;
    v48 = v36;
    v50 = v38;
    v393 = 1;
    v49 = v37;
    while (1)
    {
        v394 = sub_bccee4(&v46, (char *)&v49 + 8);
        if (!v394)
            break;
        if (v393 == *(unsigned long long *)&v39)
        {
            sub_c736c8(&v39, v393, 1, 8, 16);
            v391 = *(unsigned long long *)((void*)&v39 + 8);
        }
        v395 = v391 + v392;
        *(unsigned long long *)&v395->field_10 = v394;
        v395->field_18 = (char *)&v49 + 8;
        v393 += 1;
        v41 = v393;
        v392 += 16;
    }
    v46 = v39;
    v396 = *(unsigned long long *)&v40;
    v48 = v396;
    v397 = a1;
    if (!v396)
    {
        if (!*(unsigned long long *)&v46)
            goto LABEL_bbc42c;
        goto LABEL_bbbffc;
    }
    v48 = v396 - 1;
    v398 = *(unsigned long long *)((void*)&v46 + 8) + v48 * 16;
    v399 = v398->field_0;
    if (!*(unsigned long long *)((void*)&v24 + 8))
    {
LABEL_bbcc74:
        sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitial", 22, &g_ef99d8);
        goto LABEL_bbce04;
    }
    v400 = 0;
    v401 = 5871781006564002453 * (v399 + 8);
    v402 = *(unsigned long long *)&v23;
    v403 = *(unsigned long long *)((void*)&v23 + 8);
    v404 = v401 >> 57 & 0xff | (v401 >> 57 & 0xff) * 0x100 | (v401 >> 57 & 0xff | (v401 >> 57 & 0xff) * 0x100) * 0x10000 | (v401 >> 57 & 0xff | (v401 >> 57 & 0xff) * 0x100 | (v401 >> 57 & 0xff | (v401 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
    iter2 = v401 & v403;
    v405 = *(long long *)(v402 + iter2);
    v407 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v405, v404));
    v408 = v407 & 0x8080808080808080;
    if (!(v407 & 0x8080808080808080))
    {
        do
        {
LABEL_bbc09c:
            v409 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v405, _mm_set1_epi8(-1)));
            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v409, v409), _mm_unpacklo_epi64(v409, v409)))))))))) & 1)
                goto LABEL_bbcc74;
            v400 += 8;
            iter2 = iter2 + v400 & v403;
            v405 = *(long long *)(v402 + iter2);
            v412 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v405, v404));
            v408 = v412 & 0x8080808080808080;
        } while (!(v412 & 0x8080808080808080));
    }
    while (1)
    {
        v413 = v408;
        v414 = ((((((v413 & 0xaaaaaaaaaaaaaaaa) >> 1 | v413 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v413 & 0xaaaaaaaaaaaaaaaa) >> 1 | v413 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v413 & 0xaaaaaaaaaaaaaaaa) >> 1 | v413 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v413 & 0xaaaaaaaaaaaaaaaa) >> 1 | v413 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v415 = (((((((v413 & 0xaaaaaaaaaaaaaaaa) >> 1 | v413 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v413 & 0xaaaaaaaaaaaaaaaa) >> 1 | v413 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v413 & 0xaaaaaaaaaaaaaaaa) >> 1 | v413 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v413 & 0xaaaaaaaaaaaaaaaa) >> 1 | v413 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v416 = ((((v415 | v414) & 0xffff0000ffff0000) >> 16 | (v415 | v414) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v415 | v414) & 0xffff0000ffff0000) >> 16 | (v415 | v414) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        v417 = v402 - (iter2 + ((!v416 ? 64 : Clz(v416)) >> 3) & v403) * 16;
        if (v399 == *(long long *)((char *)v417 - 16))
            break;
        v418 = v413 - 1;
        v408 = v418 & v413;
        if (!(v418 & v413))
            goto LABEL_bbc09c;
    }
    v5 = v398->field_8;
    v13 = *(int *)((char *)v417 - 8);
    if ((unsigned long long)v21 > v13)
        v419 = *(int *)(*(unsigned long long *)((void*)&v20 + 8) + v13 * 16 + 12);
    else
        v419 = 0xffffffff;
    v420 = v22;
    v421 = *(unsigned long long *)((void*)&v22 + 8);
    v422 = 0xffffffff;
    if (v421 > v422)
    {
        v423 = (char *)v420 + 0x10 * v422;
        v422 = *v423;
        index = v423[3];
        goto LABEL_bbc138;
    }
    while (1)
    {
        if (v421 > v419)
        {
            v425 = (char *)v420 + 0x10 * v419;
            v419 = v425[1];
            index = v425[2];
            v426 = arm64g_calculate_condition(1, index & 0xffffffff, 1, 0);
            if (!(v426 & 1))
            {
LABEL_bbc138:
                if ((unsigned long long)v21 > index)
                {
                    v427 = *(int *)(*(unsigned long long *)((void*)&v20 + 8) + index * 16 + 8);
                    iter2 = 0;
                    v428 = v22;
                    v429 = *(unsigned long long *)((void*)&v22 + 8);
                    v430 = 0xffffffff;
                }
                else
                {
                    v427 = 0xffffffff;
                    iter2 = 0;
                    v428 = v22;
                    v429 = *(unsigned long long *)((void*)&v22 + 8);
                    v430 = 0xffffffff;
                }
            }
        }
        else
        {
            v53 = v14;
            if (sub_bd40e4(&v20, v13))
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v456 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v456 & 1))
                {
                    /* unsupported instruction */;
                    sub_b86a90();
                }
            }
            if (v397[2].field_0)
            {
LABEL_bbc3b0:
                v457 = 0;
                iter2 = *(long long *)v5;
                v458 = 5871781006564002453 * (iter2 + 8);
                v459 = v458;
                while (1)
                {
                    v460 = v459 & *(long long *)&v397->field_8;
                    v461 = *(long long *)((char *)v397->field_0 + v460);
                    v463 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v461, (uint128_t)(v458 >> 57 & 0xff | (v458 >> 57 & 0xff) * 0x100 | (v458 >> 57 & 0xff | (v458 >> 57 & 0xff) * 0x100) * 0x10000 | (v458 >> 57 & 0xff | (v458 >> 57 & 0xff) * 0x100 | (v458 >> 57 & 0xff | (v458 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                    v464 = v463 & 0x8080808080808080;
                    if (v463 & 0x8080808080808080)
                    {
                        do
                        {
                            v465 = v464;
                            v466 = ((((((v465 & 0xaaaaaaaaaaaaaaaa) >> 1 | v465 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v465 & 0xaaaaaaaaaaaaaaaa) >> 1 | v465 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v465 & 0xaaaaaaaaaaaaaaaa) >> 1 | v465 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v465 & 0xaaaaaaaaaaaaaaaa) >> 1 | v465 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v467 = (((((((v465 & 0xaaaaaaaaaaaaaaaa) >> 1 | v465 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v465 & 0xaaaaaaaaaaaaaaaa) >> 1 | v465 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v465 & 0xaaaaaaaaaaaaaaaa) >> 1 | v465 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v465 & 0xaaaaaaaaaaaaaaaa) >> 1 | v465 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v468 = ((((v467 | v466) & 0xffff0000ffff0000) >> 16 | (v467 | v466) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v467 | v466) & 0xffff0000ffff0000) >> 16 | (v467 | v466) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            v469 = &v397->field_0[-2 * (v460 + ((!v468 ? 64 : Clz(v468)) >> 3) & *(long long *)&v397->field_8)];
                            if (iter2 == *(long long *)(v469 - 16))
                            {
                                v5 = v469 - 8;
                                goto LABEL_bbc3b0;
                            }
                        } while ((v470 = v465 - 1, v464 = v470 & v465, v470 & v465));
                    }
                    v471 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v461, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v471, v471), _mm_unpacklo_epi64(v471, v471)))))))))) & 1)
                        break;
                    v457 += 8;
                    v459 = v460 + v457;
                }
            }
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            if ((long long)/* unsupported instruction */ >= 0)
            {
                if (sub_bafae4(v397, v399))
                {
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v473 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (!(v473 & 1))
                    {
                        /* unsupported instruction */;
                        sub_b86a90();
                    }
                }
                v396 = v48;
                if (!v396)
                {
                    v5 = 1;
                    if (!*(unsigned long long *)&v46)
                        goto LABEL_bbc42c;
LABEL_bbbffc:
                    _free(*(unsigned long long *)((void*)&v46 + 8));
                    goto LABEL_bbc42c;
                }
            }
            else
            {
LABEL_bbcce4:
                sub_c769bc();
                goto LABEL_bbcce8;
            }
        }
    }
}
