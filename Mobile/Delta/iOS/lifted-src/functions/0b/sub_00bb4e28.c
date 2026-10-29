/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb4e28..0xbb813c (13076 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb4e28_0 {
    char padding_0[32];
    long long field_20;
    long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    char padding_40[56];
    unsigned int field_78;
    unsigned int field_7c;
} st_bb4e28_0;

typedef struct st_bb4e28_4 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_bb4e28_4;

typedef struct st_bb4e28_13 {
    char padding_0[8];
    char *field_8;
} st_bb4e28_13;

typedef struct st_bb4e28_2 {
    unsigned long long field_0;
    struct st_bb4e28_1 *field_8;
} st_bb4e28_2;

typedef struct st_bb4e28_7 {
    struct st_bb4e28_6 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_bb4e28_7;

typedef struct st_bb4e28_12 {
    char padding_0[8];
    long long field_8;
    long long field_10;
} st_bb4e28_12;

typedef struct st_bb4e28_8 {
    unsigned long long field_0;
    char padding_8[16];
    char field_18;
} st_bb4e28_8;

typedef struct st_bb4e28_5 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_bb4e28_5;

typedef struct st_bb4e28_11 {
    unsigned long long field_0;
    char padding_8[16];
    double field_18;
} st_bb4e28_11;

typedef struct st_bb4e28_9 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_bb4e28_9;

typedef struct st_bb4e28_10 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_bb4e28_10;

typedef struct st_bb4e28_6 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned int field_20;
    char padding_24[4];
    unsigned long long field_28;
} st_bb4e28_6;

typedef struct st_bb4e28_3 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    struct st_bb4e28_4 *field_28;
    char padding_30[16];
    long long field_40;
} st_bb4e28_3;

typedef struct st_bb4e28_14 {
    char padding_0[72];
    unsigned long long field_48;
} st_bb4e28_14;

typedef struct st_bb4e28_1 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
} st_bb4e28_1;

typedef struct st_bb4e28_15 {
    unsigned long long field_0;
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
    char padding_18[48];
    unsigned long long field_48;
} st_bb4e28_15;

extern long long g_ef8f70;
extern long long g_ef8f88;
extern long long g_ef8fe8;
extern long long g_ef9000;
extern long long g_ef9018;
extern long long g_ef9048;
extern long long g_ef9060;
extern long long g_ef9078;
extern long long g_ef9090;
extern long long g_ef90a8;
extern long long g_ef90c0;
extern long long g_ef90d8;
extern long long g_ef9108;
extern long long g_ef9120;
extern long long g_ef9138;
extern long long g_ef9150;
extern long long g_ef9168;
extern long long g_ef9180;
extern long long g_ef9198;
extern long long g_ef91b0;
extern long long g_ef91c8;
extern long long g_ef91e0;
extern long long g_ef91f8;
extern long long g_ef9210;
extern long long g_ef9228;
extern long long g_ef9240;
extern long long g_ef9258;
extern long long g_ef9270;
extern long long g_ef9288;
extern long long g_ef92a0;
extern long long g_ef92b8;
extern long long g_ef92d0;
extern long long g_ef92e8;
extern long long g_ef9300;
extern long long g_ef9318;
extern long long g_ef9330;
extern long long g_ef9348;
extern long long g_ef9360;
extern long long g_ef9378;
extern long long g_ef9390;
extern long long g_ef93a8;
extern long long g_ef93c0;
extern long long g_ef93d8;
extern long long g_ef93f0;
extern long long g_ef9408;
extern long long g_ef9420;
extern long long g_ef9438;
extern long long g_ef9468;
extern long long g_ef9480;
extern long long g_ef9498;
extern long long g_ef94b0;
extern long long g_ef94c8;
extern long long g_ef94e0;
extern long long g_ef94f8;
extern long long g_ef9510;
extern long long g_ef9528;
extern long long g_ef9540;
extern long long g_ef9558;
extern long long g_ef9570;
extern long long g_efa378;
extern long long g_efa390;
extern long long g_efa3a8;

unsigned int sub_bb4e28(st_bb4e28_0 *a0)
{
    st_bb4e28_0 *v83;  // x20
    unsigned long long v84;  // x27
    unsigned long long v93;  // x9
    st_bb4e28_3 *v183;  // x28
    st_bb4e28_15 *v184;  // x14
    char *v185;  // x13
    unsigned long v186;  // x25
    unsigned long long v187;  // x22
    unsigned long long v188;  // x21
    st_bb4e28_2 *v189;  // x8
    st_bb4e28_1 *v190;  // x23
    st_bb4e28_2 *v191;  // x8
    st_bb4e28_1 *v192;  // x23
    unsigned long long v94;  // x8
    st_bb4e28_9 *v193;  // x8
    unsigned long long v194;  // x8
    unsigned int *v195;  // x11
    unsigned long long v196;  // 4127
    long long v197;  // x8
    st_bb4e28_9 *v198;  // x9
    unsigned long long v199;  // x9
    unsigned int *v200;  // x12
    unsigned long long v201;  // 4127
    unsigned long long *v202;  // x21
    st_bb4e28_8 *v95;  // x9
    unsigned long long *v203;  // x22
    unsigned long v204;  // x22
    unsigned long long ptr;  // x0
    unsigned long long ptr1;  // x0
    st_bb4e28_9 *v207;  // x12
    unsigned long long v208;  // x12
    unsigned long long v209;  // x14
    unsigned int *v210;  // x13
    unsigned long long v211;  // 4127
    unsigned int *v212;  // x13
    unsigned long long *v96;  // x8
    unsigned long long v213;  // 4127
    st_bb4e28_9 *v214;  // x12
    unsigned long long v215;  // x12
    unsigned int *v216;  // x13
    unsigned long long v217;  // 4127
    unsigned int *v218;  // x11
    unsigned long long v219;  // 4127
    st_bb4e28_5 *v220;  // x10
    st_bb4e28_5 *v221;  // x10
    st_bb4e28_2 *v222;  // x9
    void* v97;  // x23
    st_bb4e28_10 *v223;  // x9
    st_bb4e28_2 *v224;  // x8
    st_bb4e28_10 *v225;  // x8
    unsigned long long *v226;  // x21
    unsigned long v227;  // x8
    unsigned long long ptr2;  // x0
    st_bb4e28_11 *v229;  // x8
    double v230;  // d0
    unsigned int v231;  // w23
    unsigned long long v232;  // x22
    void* v98;  // x23
    long long v233;  // x26
    st_bb4e28_2 *v234;  // x8
    st_bb4e28_1 *v235;  // x21
    unsigned long long v236;  // x8
    st_bb4e28_2 *v237;  // x8
    st_bb4e28_1 *v238;  // x21
    long long v239;  // x8
    st_bb4e28_9 *v240;  // x9
    unsigned long long v241;  // x9
    unsigned long long v242;  // x10
    unsigned long long v99;  // x0
    unsigned int *v243;  // x12
    unsigned long long v244;  // 4127
    unsigned long long v245;  // x28
    unsigned long long v246;  // x28
    unsigned long long *v247;  // x21
    long long *v248;  // x22
    unsigned long v249;  // x22
    unsigned long long v250;  // x0
    unsigned long long v251;  // x0
    unsigned long long v252;  // x22
    uint128_t *v100;  // x21
    unsigned long v253;  // x25
    unsigned long long v254;  // 4102
    st_bb4e28_11 *v255;  // x8
    double v256;  // d0
    unsigned long long v257;  // x23
    long long v258;  // x25
    unsigned long long v259;  // x8
    st_bb4e28_2 *v260;  // x8
    st_bb4e28_1 *v261;  // x21
    st_bb4e28_2 *v262;  // x8
    unsigned long long v101;  // x0
    st_bb4e28_1 *v263;  // x21
    long long v264;  // x8
    st_bb4e28_9 *v265;  // x9
    unsigned long long v266;  // x9
    unsigned long long v267;  // x10
    unsigned int *v268;  // x12
    unsigned long long v269;  // 4127
    unsigned long long v270;  // x28
    st_bb4e28_13 *v271;  // x28
    long long *v272;  // x22
    uint128_t *v102;  // x26
    unsigned long v273;  // x22
    unsigned long long v274;  // x0
    unsigned long long v275;  // x0
    long long v276;  // x26
    unsigned long long v277;  // 4102
    unsigned long long *v278;  // x8
    unsigned long long *v279;  // x8
    unsigned long long v280;  // x21
    unsigned long long v281;  // x25
    st_bb4e28_9 *v282;  // x8
    unsigned long long *v85;  // x8
    unsigned long v103;  // x8
    unsigned long long v283;  // x11
    unsigned long long iter;  // x12
    unsigned long long v285;  // x22
    unsigned long long v286;  // x26
    unsigned long long j;  // x13
    unsigned long v288;  // x8
    unsigned long long v289;  // x9
    unsigned int *v290;  // x14
    unsigned long long v291;  // 4127
    char v292;  // x21
    long long v104;  // x8
    unsigned long long v293;  // x0
    unsigned long long v294;  // x8
    st_bb4e28_9 *v295;  // x10
    unsigned long long v296;  // x10
    unsigned long long node;  // x11
    unsigned long long k;  // x12
    unsigned int *v299;  // x13
    unsigned long long v300;  // 4127
    unsigned long long v301;  // x0
    unsigned long long v302;  // x8
    unsigned long long *v105;  // x9
    st_bb4e28_5 *v303;  // x8
    unsigned long long v304;  // x26
    unsigned long v305;  // x22
    unsigned long long v306;  // x23
    unsigned long long v307;  // x25
    unsigned long long v308;  // x26
    st_bb4e28_6 *v309;  // x24
    unsigned long v310;  // x27
    unsigned long long v311;  // x0
    unsigned long long v312;  // x21
    unsigned long long idx;  // x23
    unsigned long long v313;  // x26
    st_bb4e28_6 *v314;  // x27
    unsigned long long v315;  // x8
    st_bb4e28_7 *v316;  // x9
    unsigned long long v317;  // x8
    st_bb4e28_5 *v318;  // x8
    unsigned long long v319;  // x26
    unsigned long v320;  // x22
    unsigned long long v321;  // x23
    unsigned long long v322;  // x25
    unsigned long long v107;  // x26
    unsigned long long v323;  // x26
    st_bb4e28_6 *v324;  // x24
    unsigned long long v325;  // x0
    unsigned long long v326;  // x8
    unsigned long long v327;  // x21
    unsigned long long v328;  // x26
    st_bb4e28_6 *v329;  // x27
    unsigned long long v330;  // x8
    st_bb4e28_7 *v331;  // x9
    unsigned long long v332;  // x26
    unsigned long long index;  // x21
    unsigned long long v333;  // x8
    st_bb4e28_2 *v334;  // x8
    unsigned long long v335;  // x9
    void* v336;  // x22
    void* l;  // x22
    void* v338;  // x21
    st_bb4e28_14 *v339;  // x8
    unsigned long long v340;  // x10
    st_bb4e28_14 *v341;  // x8
    unsigned long long v342;  // 4102
    unsigned long long v109;  // x8
    unsigned long long v343;  // x22
    unsigned long long v344;  // x21
    unsigned long long v345;  // x28
    unsigned long long v346;  // x27
    unsigned long long v347;  // x0
    uint128_t *v348;  // x22
    unsigned long v349;  // x25
    unsigned long v350;  // x25
    void* v351;  // x22
    uint128_t *v352;  // x22
    unsigned long long v110;  // x22
    void* v353;  // x8
    uint128_t *v354;  // x22
    unsigned long long v355;  // x0
    unsigned long long *v356;  // x21
    unsigned long v357;  // x8
    unsigned long long n;  // x22
    unsigned long long v359;  // x23
    unsigned long long v360;  // x21
    long long v361;  // x0
    long long v362;  // x0
    st_bb4e28_15 *v111;  // x8
    long long v363;  // x0
    long long v364;  // x0
    long long v365;  // x0
    long long v366;  // x0
    long long v367;  // x0
    long long v368;  // x0
    long long v369;  // x8
    st_bb4e28_15 *v112;  // x9
    void* v86;  // x25
    st_bb4e28_15 *v113;  // x10
    char *v114;  // x11
    char *v115;  // x23
    unsigned long long v116;  // x12
    unsigned long long v117;  // x13
    char *v118;  // x23
    unsigned long v119;  // x25
    unsigned long long v120;  // x14
    char *v121;  // x15
    char *v122;  // x15
    void* v87;  // x28
    unsigned long long v123;  // w23
    st_bb4e28_2 *v124;  // x8
    st_bb4e28_1 *v125;  // x21
    st_bb4e28_2 *v126;  // x8
    st_bb4e28_1 *v127;  // x21
    unsigned long long *v128;  // x21
    unsigned long long *v129;  // x22
    unsigned long v130;  // x22
    unsigned long long v131;  // x0
    unsigned long long v132;  // x0
    void* v88;  // x28
    unsigned long long v133;  // x22
    unsigned long v134;  // x25
    long long v135;  // x23
    unsigned long long v136;  // x25
    unsigned long v137;  // x10
    unsigned long long i;  // x9
    long long v139;  // x8
    st_bb4e28_9 *v140;  // x11
    unsigned long long v141;  // x11
    unsigned int *v142;  // x12
    unsigned long long v89;  // x0
    unsigned long long v143;  // 4127
    unsigned int *v144;  // x12
    unsigned long long v145;  // 4127
    unsigned long long v146;  // x3
    st_bb4e28_9 *v147;  // x11
    unsigned long long v148;  // x11
    unsigned int *v149;  // x12
    unsigned long long v150;  // 4127
    unsigned int *v151;  // x12
    unsigned long long v152;  // 4127
    uint128_t *v90;  // x21
    unsigned long long v153;  // x2
    st_bb4e28_9 *v154;  // x11
    unsigned long long v155;  // x12
    unsigned long long v156;  // x11
    unsigned int *v157;  // x13
    unsigned long long v158;  // 4127
    unsigned int *v159;  // x13
    unsigned long long v160;  // 4127
    st_bb4e28_5 *v161;  // x12
    unsigned long long v162;  // x12
    uint128_t v91;  // q1
    unsigned int *v163;  // x12
    st_bb4e28_9 *v164;  // x13
    unsigned long long v165;  // x13
    unsigned int *v166;  // x14
    unsigned long long v167;  // 4127
    unsigned int *v168;  // x14
    unsigned long long v169;  // 4127
    st_bb4e28_5 *v170;  // x13
    unsigned long long v171;  // x13
    unsigned int *v172;  // x13
    uint128_t v92;  // q1
    unsigned long v173;  // cc_op
    unsigned long long v174;  // 4112
    unsigned long long v175;  // 4112
    unsigned long long v176;  // 4112
    unsigned long long v177;  // 4102
    unsigned long long v178;  // 4112
    unsigned long long v179;  // 4102
    st_bb4e28_2 *v180;  // x12
    st_bb4e28_3 *v181;  // x12
    st_bb4e28_2 *v182;  // x13
    unsigned int v0;  // [bp-0x410]
    unsigned int v1;  // [bp-0x40c]
    unsigned int v2;  // [bp-0x40c]
    long long v3;  // [bp-0x408]
    long long v4;  // [bp-0x400]
    long long v5;  // [bp-0x3f8]
    uint128_t v6;  // [bp-0x3f0]
    st_bb4e28_12 **v7;  // [bp-0x3e0]
    unsigned long long v8;  // [bp-0x3d8]
    st_bb4e28_0 *v9;  // [bp-0x3d0], Other Possible Types: unsigned long long
    unsigned int v10;  // [bp-0x3c8], Other Possible Types: unsigned long long
    unsigned long long v11;  // [bp-0x3c8]
    unsigned int v12;  // [bp-0x3bc]
    char v13;  // [bp-0x3b8]
    long long v14;  // [bp-0x3b0]
    unsigned long long v15;  // [bp-0x3a0]
    long long v16;  // [bp-0x398]
    unsigned long long v17;  // [bp-0x380]
    long long v18;  // [bp-0x378]
    uint128_t v19;  // [bp-0x360]
    uint128_t v20;  // [bp-0x350]
    uint128_t v21;  // [bp-0x340]
    uint128_t v22;  // [bp-0x330]
    uint128_t v23;  // [bp-0x320], Other Possible Types: uint128_t
    uint128_t v24;  // [bp-0x310], Other Possible Types: uint384_t
    uint384_t v25;  // [bp-0x310]
    uint384_t v26;  // [bp-0x310]
    uint128_t v27;  // [bp-0x300]
    uint128_t v28;  // [bp-0x2f0]
    uint128_t v29;  // [bp-0x2e0]
    uint128_t v30;  // [bp-0x2d0]
    long long *v31;  // [bp-0x2d0]
    uint128_t v32;  // [bp-0x2c8]
    uint128_t v33;  // [bp-0x2b8]
    uint128_t v34;  // [bp-0x2a8]
    uint128_t v35;  // [bp-0x298]
    uint128_t v36;  // [bp-0x280]
    uint128_t v37;  // [bp-0x270]
    uint128_t v38;  // [bp-0x260]
    uint128_t v39;  // [bp-0x250]
    uint128_t v40;  // [bp-0x240]
    uint128_t v41;  // [bp-0x240], Other Possible Types: unsigned long long
    uint128_t v42;  // [bp-0x240]
    uint128_t v43;  // [bp-0x240]
    uint128_t v44;  // [bp-0x240]
    uint128_t v45;  // [bp-0x240]
    uint128_t v46;  // [bp-0x240]
    uint128_t v47;  // [bp-0x240]
    uint128_t v48;  // [bp-0x240]
    uint128_t v49;  // [bp-0x240]
    uint128_t v50;  // [bp-0x240]
    unsigned long v51;  // [bp-0x238], Other Possible Types: unsigned long long
    uint128_t v52;  // [bp-0x230], Other Possible Types: uint128_t, unsigned long long
    uint128_t v53;  // [bp-0x230]
    unsigned long long v54;  // [bp-0x228]
    double v55;  // [bp-0x228]
    uint128_t v56;  // [bp-0x220], Other Possible Types: unsigned int
    uint128_t v57;  // [bp-0x210], Other Possible Types: unsigned long, unsigned long long
    uint128_t v58;  // [bp-0x210]
    uint128_t v59;  // [bp-0x210]
    unsigned long long v60;  // [bp-0x208]
    unsigned long long v61;  // [bp-0x200]
    unsigned long v62;  // [bp-0x200]
    unsigned long long v63;  // [bp-0x1f8]
    unsigned long long v64;  // [bp-0x1f0]
    uint128_t v65;  // [bp-0x130]
    uint128_t v66;  // [bp-0x120]
    uint128_t v67;  // [bp-0x110]
    uint128_t v68;  // [bp-0x100]
    uint128_t v69;  // [bp-0xf0]
    uint128_t v70;  // [bp-0xe0]
    uint128_t v72;  // [bp-0xd0]
    uint128_t v73;  // [bp-0xc0]
    unsigned long long v74;  // [bp-0xc0]
    uint128_t v75;  // [bp-0xb0]
    uint128_t v76;  // [bp-0xa0]
    uint128_t v77;  // [bp-0x90]
    uint128_t v78;  // [bp-0x90]
    uint128_t v79;  // [bp-0x80]
    uint128_t v80;  // [bp-0x80]
    char *v81;  // [bp-0x10]
    char v82;  // [bp+0x0]

    v81 = &v82;
    if (a0->field_78 == 1)
    {
        v83 = a0;
        sub_bd97c0(&v13, a0->field_20, a0->field_28, a0->field_7c);
        v10 = 0;
        v6 = 0x1b0000000000000001;
        v3 = &g_ef9390;
        v4 = &g_ef9420;
        v5 = &g_efa390;
        while (1)
        {
            v12 = (unsigned int)v83 + 24;
            if (sub_bd98f0(&v13, v12) != 1)
            {
                if (v13)
                    _free(v14);
                if (v15)
                    _free(v16);
                if (!v17)
                    return (unsigned int)v10 & 1;
                _free(v18);
                return (unsigned int)v10 & 1;
            }
            v84 = v12;
            if ((unsigned long long)v83->field_28 <= v84 || (v85 = v83->field_20 + v84 * 32, *v85 == 0x8000000000000000))
            {
                v361 = &g_ef8f70;
                goto LABEL_bb7418;
            }
            if (v85[2] && (v86 = v85[1] + 264 * v85[2], *(long long *)((char *)v86 - 240) == 16))
            {
                v87 = v86;
                v88 = v87 - 232;
                if (*(long long *)((char *)v87 - 232) == 9)
                {
                    v97 = v86;
                    v98 = v97 - 224;
                    if (*(long long *)*(long long *)((char *)v97 - 224) == 6 && *(long long *)*(long long *)((char *)v86 - 216) != 6)
                    {
                        v99 = _malloc(64);
                        if (v99)
                        {
                            v100 = v99;
                            sub_bb813c(&v44, *(long long *)((char *)v86 - 216));
                            *v100 = v44;
                            v100[1] = v53;
                            v100[2] = v56;
                            v100[3] = v57;
                            v19 = *v100;
                            v20 = v100[1];
                            v21 = v100[2];
                            v22 = v100[3];
                            v101 = _malloc(64);
                            if (v101)
                            {
                                v102 = v101;
                                sub_bb813c(&v44, *(long long *)v98);
                                *v102 = v44;
                                v102[1] = v53;
                                v102[2] = v56;
                                v102[3] = v57;
                                *(uint128_t *)&v24 = *v102;
                                *(uint128_t *)((char *)&v24 + 16) = v102[1];
                                v25 = _INSERT(v24, 32, v102[2]);
                                v29 = v102[3];
                                v103 = *((char *)v86 - 208) - 7;
                                if (6 > (unsigned int)v103)
                                {
                                    sub_b94fac(&v75, &v19, &v25, 12146319165447 >> (((char)v103 * 8 | (char)(v103 >> 61)) & 248 & 63));
                                    v65 = v75;
                                    *(unsigned long long *)&v66 = *(unsigned long long *)&v76;
                                    sub_bb3264(v88);
                                    *(unsigned long long *)v88 = 9;
                                    *(uint128_t *)v98 = v65;
                                    *(unsigned long long *)&v98[16] = *(unsigned long long *)&v66;
                                    _free(v102);
                                    _free(v100);
                                    v10 = 1;
                                }
                                else
                                {
                                    sub_bb3264(v102);
                                    sub_bb3264(v100);
                                    _free(v102);
                                    _free(v100);
                                }
                            }
                            else
                            {
                                sub_c6ba70(8, 64);
                                goto LABEL_bb7968;
                            }
                        }
                        else
                        {
LABEL_bb7430:
                            sub_c6ba70(8, 64);
                            goto LABEL_bb7968;
                        }
                    }
                }
                else if (*(long long *)((char *)v87 - 232) == 8 && !*((char *)v86 - 216))
                {
                    v89 = _malloc(64);
                    if (!v89)
                        goto LABEL_bb7430;
                    v90 = v89;
                    sub_bb813c(&v44, *(long long *)((char *)v86 - 224));
                    *v90 = v44;
                    v90[1] = v53;
                    v90[2] = v56;
                    v90[3] = v57;
                    sub_bb3264(v88);
                    v91 = v90[1];
                    *(uint128_t *)v88 = *v90;
                    *(uint128_t *)&v88[16] = v91;
                    v92 = v90[3];
                    *(uint128_t *)&v88[32] = v90[2];
                    *(uint128_t *)&v88[48] = v92;
                    _free(v90);
                    sub_bd8d30(&v44, v83, v12);
                    if (!*(unsigned long long *)&v44)
                    {
                        v361 = &g_ef8f88;
                        goto LABEL_bb7418;
                    }
                    v93 = *(unsigned int *)&v53;
                    v94 = *(unsigned int *)((void*)&v56 + 8);
                    if ((unsigned int)v93 == (unsigned int)v94)
                    {
                        sub_c73c80("assertion failed: T::is_node_index() != U::is_node_index() || i.index() != j.index()Pre-condition of values_read violated: self.has_block(node)assertion failed: res.1.weight().branch_type == BranchType::Elseassertion failed: res.0.weight().branch_type == BranchType::ThenPre-condition of set_entry violated: self.has_block(new_entry)Graph::add_edge: node indices out of boundsIndexSet: index out of bounds (exhausted)", 84, &g_efa378);
                        goto LABEL_bb7968;
                    }
                    if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v93 || (v95 = v83->field_38 + (unsigned int)v93 * 48, v95->field_0 == 0x8000000000000000))
                    {
LABEL_bb7708:
                        sub_c73c64(v5);
                        goto LABEL_bb7968;
                    }
                    else if ((unsigned long long)*(long long *)&v83->padding_40[0] > v94 && !(v96 = v83->field_38 + (unsigned int)v94 * 48, *v96 == 0x8000000000000000))
                    {
                        v95->field_18 = 2;
                        v10 = 1;
                        *(char *)&v96[3] = 1;
                    }
                    else
                    {
                        v5 = &g_efa3a8;
                        goto LABEL_bb7708;
                    }
                }
            }
            v104 = v83->field_28;
            if ((unsigned long long)v104 <= v84 || (v105 = v83->field_20 + v84 * 32, *v105 == 0x8000000000000000))
            {
                v361 = &g_ef9180;
                goto LABEL_bb7418;
            }
            if (v105[2] && *(long long *)(v105[1] + 264 * v105[2] - 240) == 16)
            {
                sub_bd8d30(&v44, v83, v12);
                idx = *(unsigned long long *)&v44;
                if (!idx)
                {
LABEL_bb7410:
                    v361 = &g_ef9198;
                    goto LABEL_bb7418;
                }
                v107 = *(unsigned int *)((void*)&v44 + 12);
                v8 = *(unsigned int *)&v53;
                index = *(unsigned long long *)((void*)&v53 + 8);
                v109 = *(unsigned int *)((void*)&v56 + 4);
                v110 = *(unsigned int *)((void*)&v56 + 8);
                if ((unsigned int)v107 == (unsigned int)v109)
                {
                    v111 = *(long long *)(idx + 8);
                    v112 = &(&v111->field_0)[9 * *(long long *)(idx + 16)];
                    if (v111 == v112)
                        goto LABEL_bb6128;
                    while (1)
                    {
                        v113 = &v111->field_48;
                        v114 = *(long long *)(index + 8);
                        v115 = *(long long *)(index + 8) - 72;
                        v116 = *(long long *)(index + 16) * 72;
                        v117 = v116;
                        while (1)
                        {
                            v118 = v115;
                            if (!v117)
                                break;
                            v119 = v111->field_0;
                            v115 = v118 + 72;
                            v117 -= 72;
                            if (v119 == *(long long *)&v118[72])
                            {
LABEL_bb526c:
                                if (v113 != v112)
                                {
                                    v120 = v116;
                                    v121 = v114;
                                    do
                                    {
                                        v122 = v121;
                                        if (!v120)
                                        {
                                            v113 = &v113->field_48;
                                            goto LABEL_bb526c;
                                        }
                                    } while ((v121 = v122 + 72, v120 -= 72, v113->field_0 != *(long long *)v122));
                                    goto LABEL_bb6128;
                                }
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ < 0)
                                    goto LABEL_bb740c;
                                sub_bb813c(&v65, &v111->field_8);
                                sub_bb813c(&v75, v115 + 8);
                                v45 = v65;
                                v52 = v66;
                                v56 = v67;
                                v57 = v68;
                                sub_bb89ec(&v19, v83->field_20, v83->field_28, v12, &v45, &v75);
                                if (*(unsigned long long *)&v19 == 12)
                                {
                                    do
                                    {
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
                                    if (/* unsupported instruction */ == 1)
                                    {
                                        /* unsupported instruction */;
                                        sub_b86a90(v119);
                                        v123 = 0;
                                        goto LABEL_bb612c;
                                    }
                                    goto LABEL_bb6128;
                                }
                                else
                                {
                                    *(uint128_t *)&v24 = v19;
                                    *(uint128_t *)((char *)&v24 + 16) = v20;
                                    *(uint128_t *)((char *)&v24 + 32) = v21;
                                    v29 = v22;
                                    do
                                    {
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
                                    if ((long long)/* unsupported instruction */ < 0)
                                        goto LABEL_bb740c;
                                    v41 = CONCAT(v119, 0);
                                    if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v8 || (v124 = v83->field_38 + (unsigned int)v8 * 48, v124->field_0 == 0x8000000000000000))
                                    {
                                        sub_c73c64(&g_ef94c8);
                                        goto LABEL_bb7968;
                                    }
                                    if (v124[1].field_0)
                                    {
                                        v125 = v124->field_8;
                                        sub_bb3264((v125->padding_0)[1]);
                                        *(uint128_t *)(v125->padding_0)[1] = v41;
                                        *(uint128_t *)((char *)&v125->field_8 + 8) = v52;
                                        *(uint128_t *)((char *)&v125->field_18 + 8) = v56;
                                        *(uint128_t *)((char *)&v125->field_28 + 8) = v57;
                                        do
                                        {
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                        } while (/* unsupported instruction */ ^ 1);
                                        if ((long long)/* unsupported instruction */ < 0)
                                            goto LABEL_bb740c;
                                        v46 = CONCAT(v119, 0);
                                        if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v110 || (v126 = v83->field_38 + (unsigned int)v110 * 48, v126->field_0 == 0x8000000000000000))
                                        {
                                            sub_c73c64(&g_ef94f8);
                                            goto LABEL_bb7968;
                                        }
                                        if (v126[1].field_0)
                                        {
                                            v127 = v126->field_8;
                                            sub_bb3264((v127->padding_0)[1]);
                                            *(uint128_t *)(v127->padding_0)[1] = v46;
                                            *(uint128_t *)((char *)&v127->field_8 + 8) = v52;
                                            *(uint128_t *)((char *)&v127->field_18 + 8) = v56;
                                            *(uint128_t *)((char *)&v127->field_28 + 8) = v57;
                                            if ((unsigned long long)v83->field_28 > v84 && !(v128 = v83->field_20 + v84 * 32, *v128 == 0x8000000000000000))
                                            {
                                                if (!v128[2])
                                                {
                                                    v366 = &g_ef9540;
                                                    goto LABEL_bb75ac;
                                                }
                                                v129 = v128[1] + 264 * v128[2];
                                                if (*(long long *)((char *)v129 - 240) != 16)
                                                {
                                                    v366 = &g_ef9570;
                                                    goto LABEL_bb75ac;
                                                }
                                                do
                                                {
                                                    /* unsupported instruction */;
                                                    /* unsupported instruction */;
                                                } while (/* unsupported instruction */ ^ 1);
                                                if ((long long)/* unsupported instruction */ < 0)
                                                    goto LABEL_bb740c;
                                                sub_bb3264((char *)v129 - 232);
                                                *(unsigned long long *)((char *)v129 - 232) = 0;
                                                *(unsigned long *)((char *)v129 - 224) = v119;
                                                v130 = v128[2];
                                                v131 = _malloc(24);
                                                if (!v131)
                                                {
                                                    sub_c6ba70(8, 24);
                                                    goto LABEL_bb7968;
                                                }
                                                *(unsigned long *)v131 = 0x8000000000000000;
                                                *(unsigned long *)(v131 + 8) = v119;
                                                v72 = CONCAT(v131, 1);
                                                v74 = 1;
                                                v132 = _malloc(64);
                                                if (!v132)
                                                {
                                                    sub_c6ba70(8, 64);
                                                    goto LABEL_bb7968;
                                                }
                                                v133 = v130 - 1;
                                                *(uint128_t *)v132 = v19;
                                                *(uint128_t *)(v132 + 16) = v20;
                                                *(uint128_t *)(v132 + 32) = v21;
                                                *(uint128_t *)(v132 + 48) = v22;
                                                v56 = v72;
                                                *(unsigned long long *)&v57 = v74;
                                                v61 = v132;
                                                v63 = 1;
                                                v64 = 0;
                                                v59 = _INSERT(v57, 8, 1);
                                                *(unsigned long long *)((char *)&v52 + 8) = 15;
                                                v134 = v128[2];
                                                if (v134 >= v133)
                                                {
                                                    if (v134 == *v128)
                                                        sub_c6c42c(v128);
                                                    v135 = v128[1] + 264 * v133;
                                                    if (v134 > v133)
                                                        _memmove(v135 + 264, v135, (v134 - v133) * 264);
                                                    _memcpy(v135, &v46, 264);
                                                    v128[2] = v134 + 1;
                                                    goto LABEL_bb5934;
                                                }
                                                else
                                                {
                                                    sub_c6bb08(v133, v134, &g_ef9558);
                                                    goto LABEL_bb7968;
                                                }
                                            }
                                            else
                                            {
                                                v366 = &g_ef9528;
LABEL_bb75ac:
                                                sub_c73c64(v366);
                                                goto LABEL_bb7968;
                                            }
                                        }
                                        else
                                        {
                                            sub_c73c94(0, 0, &g_ef9510);
                                            goto LABEL_bb7968;
                                        }
                                    }
                                    else
                                    {
                                        sub_c73c94(0, 0, &g_ef94e0);
                                        goto LABEL_bb7968;
                                    }
                                }
                                goto LABEL_bb5934;
                            }
                        }
                        v111 = v113;
                        goto LABEL_bb6128;
                    }
                }
                v9 = v109;
                v136 = *(long long *)(idx + 16);
                v137 = v83->field_38;
                i = *(long long *)&v83->padding_40[0];
                v139 = v83->field_28;
                v47 = v44;
                if (v136)
                {
LABEL_bb5220:
                    if (*(long long *)(index + 16))
                    {
LABEL_bb5228:
                        if ((unsigned long long)v139 <= v107 || !(v154 = v83->field_20 + v107 * 32, v154->field_0 != 0x8000000000000000))
                        {
                            v155 = 0xffffffff;
                            v156 = i >> 32;
                            if (!v156)
                                goto LABEL_bb53bc;
                        }
                        else
                        {
                            v155 = v154->field_1c;
                            v156 = i >> 32;
                            if (!v156)
                            {
                                do
                                {
LABEL_bb53bc:
                                    if (i <= v155)
                                        goto LABEL_bb5584;
                                } while ((v157 = v137 + 48 * v155, v155 = v157[9], v158 = arm64g_calculate_condition(1, v157[10], 1, 0), v158 & 1));
                                if (0xffffffff < i)
                                    goto LABEL_bb5584;
                                while (1)
                                {
LABEL_bb53e0:
                                    if (i > v155)
                                    {
                                        v159 = v137 + 48 * v155;
                                        v155 = v159[9];
                                        v160 = arm64g_calculate_condition(1, v159[10], 1, 0);
                                        if (!(v160 & 1))
                                            goto LABEL_bb5584;
                                    }
                                    else
                                    {
                                        if ((unsigned long long)v139 <= v107 || !(v161 = v83->field_20 + v107 * 32, v161->field_0 != 0x8000000000000000))
                                        {
                                            v162 = 0xffffffff;
                                            if (0xffffffff >= i)
                                                goto LABEL_bb5584;
                                        }
                                        else
                                        {
                                            v162 = v161->field_18;
                                            if (i <= v162)
                                                goto LABEL_bb5584;
                                        }
                                        v163 = v137 + (unsigned int)v162 * 48;
                                        if (i <= v163[8])
                                        {
                                            if ((unsigned long long)v139 <= v9 || (v164 = v83->field_20 + v9 * 32, v164->field_0 == 0x8000000000000000))
                                                v165 = 0xffffffff;
                                            else
                                                v165 = v164->field_1c;
                                            while (i > v165)
                                            {
                                                v166 = v137 + 48 * v165;
                                                v165 = v166[9];
                                                v167 = arm64g_calculate_condition(1, v166[10], 1, 0);
                                                if (!(v167 & 1) && !v156)
                                                {
                                                    while (i > v165)
                                                    {
                                                        v168 = v137 + 48 * v165;
                                                        v165 = v168[9];
                                                        v169 = arm64g_calculate_condition(1, v168[10], 1, 0);
                                                        if (!(v169 & 1))
                                                            goto LABEL_bb5584;
                                                    }
                                                    if ((unsigned long long)v139 <= v9 || (v170 = v83->field_20 + v9 * 32, v170->field_0 == 0x8000000000000000))
                                                        v171 = 0xffffffff;
                                                    else
                                                        v171 = v170->field_18;
                                                    if (i > v171)
                                                    {
                                                        v172 = v137 + (unsigned int)v171 * 48;
                                                        if (i <= v172[8])
                                                        {
                                                            v173 = 3;
                                                            v174 = arm64g_calculate_condition(3, 0, 0, 0);
                                                            if (!(v174 & 1))
                                                                goto LABEL_bb6e86;
LABEL_bb6e85:
                                                            v176 = arm64g_calculate_condition(v173, 0, 0, 0);
                                                            v177 = arm64g_calculate_condition(19, (v176 & 1 ? v163[11] : 0), (v176 & 1 ? v172[11] : 0), 0);
                                                            if (!(v177 & 1))
                                                                goto LABEL_bb6e8c;
                                                            break;
                                                        }
                                                        v173 = 0;
                                                        v175 = arm64g_calculate_condition(0, 0, 0, 0);
                                                        if (v175 & 1)
                                                            goto LABEL_bb6e85;
LABEL_bb6e86:
                                                        v178 = arm64g_calculate_condition(v173, 0, 0, 0);
                                                        v179 = arm64g_calculate_condition(16, (v178 & 1 ? v163[11] : 0), (v178 & 1 ? v172[11] : 0), 0);
                                                        if (v179 & 1)
                                                            break;
LABEL_bb6e8c:
                                                        if ((unsigned long long)v139 <= v107 || (v180 = v83->field_20 + v107 * 32, v180->field_0 == 0x8000000000000000))
                                                        {
                                                            v361 = &g_ef9360;
                                                            goto LABEL_bb7418;
                                                        }
                                                        if (v180[1].field_0 != 1 || !(v181 = v180->field_8, v181->field_18 == 15 && *(long long *)&v181->padding_30[0] == 1 && *(long long *)&v181[1].padding_0[0] == 1))
                                                            goto LABEL_bb558c;
                                                        if ((unsigned long long)v139 <= v9 || (v182 = v83->field_20 + v9 * 32, v182->field_0 == 0x8000000000000000))
                                                        {
                                                            v361 = &g_ef9378;
LABEL_bb7418:
                                                            sub_c73c64(v361);
                                                            goto LABEL_bb7968;
                                                        }
                                                        if (...)
                                                            goto LABEL_bb558c;
                                                        do
                                                        {
                                                            /* unsupported instruction */;
                                                            /* unsupported instruction */;
                                                        } while (/* unsupported instruction */ ^ 1);
                                                        if ((long long)/* unsupported instruction */ >= 0)
                                                        {
                                                            sub_bb813c(&v65, v181->field_40);
                                                            sub_bb813c(&v75, v183->field_40);
                                                            sub_bd8e7c(&v47, v83, v107);
                                                            if (!*(unsigned long long *)&v47)
                                                            {
LABEL_bb78c8:
                                                                sub_c73c64(v3);
                                                                goto LABEL_bb7968;
                                                            }
                                                            v187 = *(unsigned int *)&v53;
                                                            sub_bd8e7c(&v47, v83, v9);
                                                            if (!*(unsigned long long *)&v47)
                                                            {
                                                                v3 = &g_ef93a8;
                                                                goto LABEL_bb78c8;
                                                            }
                                                            v188 = *(unsigned int *)&v53;
                                                            v24 = _INSERT(v26, 0, v65);
                                                            *(uint128_t *)((char *)&v24 + 16) = v66;
                                                            *(uint128_t *)((char *)&v24 + 32) = v67;
                                                            v29 = v68;
                                                            v48 = v75;
                                                            v52 = v76;
                                                            v56 = v78;
                                                            v57 = v80;
                                                            sub_bb89ec(&v19, v83->field_20, v83->field_28, v12, &v24, &v48);
                                                            if (*(unsigned long long *)&v19 == 12)
                                                            {
                                                                do
                                                                {
                                                                    /* unsupported instruction */;
                                                                    /* unsupported instruction */;
                                                                    /* unsupported instruction */;
                                                                } while (/* unsupported instruction */ ^ 1);
                                                                if (/* unsupported instruction */ == 1)
                                                                {
                                                                    /* unsupported instruction */;
                                                                    sub_b86a90(v186);
                                                                }
                                                                v123 = 0;
                                                                goto LABEL_bb612c;
                                                            }
                                                            else
                                                            {
                                                                v24 = v19;
                                                                v27 = v20;
                                                                v24 = _INSERT(CONCAT(v24, 0), 32, v21);
                                                                v29 = v22;
                                                                do
                                                                {
                                                                    /* unsupported instruction */;
                                                                    /* unsupported instruction */;
                                                                } while (/* unsupported instruction */ ^ 1);
                                                                if ((long long)/* unsupported instruction */ < 0)
                                                                    goto LABEL_bb740c;
                                                                v41 = CONCAT(v186, 0);
                                                                if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v187 || (v189 = v83->field_38 + (unsigned int)v187 * 48, v189->field_0 == 0x8000000000000000))
                                                                {
                                                                    sub_c73c64(&g_ef93c0);
                                                                    goto LABEL_bb7968;
                                                                }
                                                                if (!v189[1].field_0)
                                                                {
                                                                    sub_c73c94(0, 0, &g_ef93d8);
                                                                    goto LABEL_bb7968;
                                                                }
                                                                v190 = v189->field_8;
                                                                sub_bb3264((v190->padding_0)[1]);
                                                                *(uint128_t *)(v190->padding_0)[1] = v41;
                                                                *(uint128_t *)((char *)&v190->field_8 + 8) = v52;
                                                                *(uint128_t *)((char *)&v190->field_18 + 8) = v56;
                                                                *(uint128_t *)((char *)&v190->field_28 + 8) = v57;
                                                                do
                                                                {
                                                                    /* unsupported instruction */;
                                                                    /* unsupported instruction */;
                                                                } while (/* unsupported instruction */ ^ 1);
                                                                if ((long long)/* unsupported instruction */ < 0)
                                                                    goto LABEL_bb740c;
                                                                v46 = CONCAT(v186, 0);
                                                                if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v188 || (v191 = v83->field_38 + (unsigned int)v188 * 48, v191->field_0 == 0x8000000000000000))
                                                                {
                                                                    sub_c73c64(&g_ef93f0);
                                                                    goto LABEL_bb7968;
                                                                }
                                                                if (!v191[1].field_0)
                                                                {
                                                                    sub_c73c94(0, 0, &g_ef9408);
                                                                    goto LABEL_bb7968;
                                                                }
                                                                v192 = v191->field_8;
                                                                sub_bb3264((v192->padding_0)[1]);
                                                                *(uint128_t *)(v192->padding_0)[1] = v46;
                                                                *(uint128_t *)((char *)&v192->field_8 + 8) = v52;
                                                                *(uint128_t *)((char *)&v192->field_18 + 8) = v56;
                                                                *(uint128_t *)((char *)&v192->field_28 + 8) = v57;
                                                                sub_bb1d1c(v83, v12, v187);
                                                                if ((unsigned long long)v83->field_28 <= v107 || (v193 = v83->field_20 + v107 * 32, v193->field_0 == 0x8000000000000000))
                                                                    v194 = 0xffffffff;
                                                                else
                                                                    v194 = v193->field_1c;
                                                                if ((unsigned long long)*(long long *)&v83->padding_40[0] <= 0xffffffff)
                                                                {
                                                                    do
                                                                    {
                                                                        if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v194)
                                                                        {
                                                                            sub_bd8578(&v46, v83, v107);
                                                                            sub_bb9138(&v46);
                                                                            break;
                                                                        }
                                                                    } while ((v195 = v83->field_38 + 48 * v194, v194 = v195[9], v196 = arm64g_calculate_condition(1, v195[10], 1, 0), v196 & 1));
                                                                }
                                                                sub_bb1d1c(v83, v12, v188);
                                                                v197 = v83->field_28;
                                                                if ((unsigned long long)v197 <= v9 || (v198 = v83->field_20 + v9 * 32, v198->field_0 == 0x8000000000000000))
                                                                    v199 = 0xffffffff;
                                                                else
                                                                    v199 = v198->field_1c;
                                                                if ((unsigned long long)*(long long *)&v83->padding_40[0] <= 0xffffffff)
                                                                {
                                                                    do
                                                                    {
                                                                        if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v199)
                                                                        {
                                                                            sub_bd8578(&v46, v83, v9);
                                                                            sub_bb9138(&v46);
                                                                            v197 = v83->field_28;
                                                                            break;
                                                                        }
                                                                    } while ((v200 = v83->field_38 + 48 * v199, v199 = v200[9], v201 = arm64g_calculate_condition(1, v200[10], 1, 0), v201 & 1));
                                                                }
                                                                if ((unsigned long long)v197 <= v84 || (v202 = v83->field_20 + v84 * 32, *v202 == 0x8000000000000000))
                                                                {
LABEL_bb7960:
                                                                    sub_c73c64(v4);
                                                                    goto LABEL_bb7968;
                                                                }
                                                                if (v202[2])
                                                                {
                                                                    v203 = v202[1] + 264 * v202[2];
                                                                    if (*(long long *)((char *)v203 - 240) == 16)
                                                                    {
                                                                        do
                                                                        {
                                                                            /* unsupported instruction */;
                                                                            /* unsupported instruction */;
                                                                        } while (/* unsupported instruction */ ^ 1);
                                                                        if ((long long)/* unsupported instruction */ < 0)
                                                                            goto LABEL_bb740c;
                                                                        sub_bb3264((char *)v203 - 232);
                                                                        *(unsigned long long *)((char *)v203 - 232) = 0;
                                                                        *(unsigned long *)((char *)v203 - 224) = v186;
                                                                        v204 = v202[2];
                                                                        ptr = _malloc(24);
                                                                        if (!ptr)
                                                                        {
                                                                            sub_c6ba70(8, 24);
                                                                            goto LABEL_bb7968;
                                                                        }
                                                                        *(unsigned long *)ptr = 0x8000000000000000;
                                                                        *(unsigned long *)(ptr + 8) = v186;
                                                                        v72 = CONCAT(ptr, 1);
                                                                        v74 = 1;
                                                                        ptr1 = _malloc(64);
                                                                        if (ptr1)
                                                                        {
                                                                            *(uint128_t *)ptr1 = v19;
                                                                            *(uint128_t *)(ptr1 + 16) = v20;
                                                                            *(uint128_t *)(ptr1 + 32) = v21;
                                                                            *(uint128_t *)(ptr1 + 48) = v22;
                                                                            v56 = v72;
                                                                            v57 = v74;
                                                                            v61 = ptr1;
                                                                            v63 = 1;
                                                                            v64 = 0;
                                                                            v60 = 1;
                                                                            v54 = 15;
                                                                            sub_bb91e8(v202, v204 - 1, &v46);
                                                                        }
                                                                        else
                                                                        {
                                                                            sub_c6ba70(8, 64);
                                                                            goto LABEL_bb7968;
                                                                        }
                                                                    }
                                                                    else
                                                                    {
                                                                        v369 = &g_ef9468;
                                                                        goto LABEL_bb795c;
                                                                    }
                                                                }
                                                                else
                                                                {
                                                                    v369 = &g_ef9438;
LABEL_bb795c:
                                                                    v4 = v369;
                                                                    goto LABEL_bb7960;
                                                                }
                                                            }
                                                        }
                                                        else
                                                        {
LABEL_bb740c:
                                                            sub_c769bc();
                                                            goto LABEL_bb7410;
                                                        }
LABEL_bb5934:
                                                        v123 = 1;
                                                        v57 = v59;
                                                        goto LABEL_bb612c;
                                                    }
                                                }
                                            }
                                        }
LABEL_bb5584:
                                        if ((unsigned long long)v139 > v107)
                                        {
LABEL_bb558c:
                                            v207 = v83->field_20 + v107 * 32;
                                            if (v207->field_0 == 0x8000000000000000)
                                            {
                                                v208 = 0xffffffff;
                                                v209 = v9;
                                                if (!v156)
                                                    goto LABEL_bb55e8;
                                            }
                                            else
                                            {
                                                v208 = v207->field_1c;
                                                v209 = v9;
                                                if (!v156)
                                                {
                                                    do
                                                    {
LABEL_bb55e8:
                                                        if (i <= v208)
                                                        {
LABEL_bb6128:
                                                            v123 = 0;
                                                            goto LABEL_bb612c;
                                                        }
                                                    } while ((v210 = v137 + 48 * v208, v208 = v210[9], v211 = arm64g_calculate_condition(1, v210[10], 1, 0), v211 & 1));
                                                    if (0xffffffff < i)
                                                        goto LABEL_bb6128;
                                                    while (1)
                                                    {
LABEL_bb560c:
                                                        if (i > v208)
                                                        {
                                                            v212 = v137 + 48 * v208;
                                                            v208 = v212[9];
                                                            v213 = arm64g_calculate_condition(1, v212[10], 1, 0);
                                                            if (!(v213 & 1))
                                                                goto LABEL_bb6128;
                                                        }
                                                        else
                                                        {
                                                            if ((unsigned long long)v139 > v209)
                                                            {
                                                                v214 = v83->field_20 + v209 * 32;
                                                                if (v214->field_0 == 0x8000000000000000)
                                                                    v215 = 0xffffffff;
                                                                else
                                                                    v215 = v214->field_1c;
                                                            }
                                                            else
                                                            {
                                                                v215 = 0xffffffff;
                                                            }
                                                            while (i > v215)
                                                            {
                                                                v216 = v137 + 48 * v215;
                                                                v215 = v216[9];
                                                                v217 = arm64g_calculate_condition(1, v216[10], 1, 0);
                                                                if (!(v217 & 1) && !v156)
                                                                {
                                                                    while (i > v215)
                                                                    {
                                                                        v218 = v137 + 48 * v215;
                                                                        v215 = v218[9];
                                                                        v219 = arm64g_calculate_condition(1, v218[10], 1, 0);
                                                                        if (!(v219 & 1))
                                                                            goto LABEL_bb6128;
                                                                    }
                                                                    if ((unsigned long long)v139 <= v107 || !(v220 = v83->field_20 + v107 * 32, v220->field_0 != 0x8000000000000000))
                                                                    {
                                                                        if (0xffffffff < i)
                                                                            break;
                                                                    }
                                                                    else
                                                                    {
                                                                        if (v220->field_18 < i)
                                                                            break;
                                                                    }
                                                                    if ((unsigned long long)v139 <= v209 || !(v221 = v83->field_20 + v209 * 32, v221->field_0 != 0x8000000000000000))
                                                                    {
                                                                        if (0xffffffff < i)
                                                                            break;
                                                                    }
                                                                    else
                                                                    {
                                                                        if (v221->field_18 < i)
                                                                            break;
                                                                    }
                                                                    if ((unsigned long long)v139 <= v107 || (v222 = v83->field_20 + v107 * 32, v222->field_0 == 0x8000000000000000))
                                                                    {
                                                                        v361 = &g_ef9480;
                                                                        goto LABEL_bb7418;
                                                                    }
                                                                    if (v222[1].field_0 == 1 && !(v223 = v222->field_8, v223->field_18 != 27 || v223->padding_10 != 1))
                                                                    {
                                                                        if ((unsigned long long)v139 > v209 && !(v224 = v83->field_20 + v209 * 32, v224->field_0 == 0x8000000000000000))
                                                                        {
                                                                            if (v224[1].field_0 != 1 || (v225 = v224->field_8, v225->field_18 != 27 || v225->padding_10 != 1))
                                                                                break;
                                                                            sub_bb813c(&v19, v223->field_8);
                                                                            sub_bb813c(&v26, v225->field_8);
                                                                            v49 = v19;
                                                                            v52 = v20;
                                                                            v56 = v21;
                                                                            v57 = v22;
                                                                            sub_bb89ec(&v36, v83->field_20, v83->field_28, v12, &v49, &v26);
                                                                            v123 = *(unsigned long long *)&v36 != 12;
                                                                            if (*(unsigned long long *)&v36 == 12)
                                                                                goto LABEL_bb612c;
                                                                            sub_bd8578(&v49, v83, v107);
                                                                            sub_bb9138(&v49);
                                                                            sub_bd8578(&v49, v83, v9);
                                                                            sub_bb9138(&v49);
                                                                            if ((unsigned long long)v83->field_28 > v84 && !(v226 = v83->field_20 + v84 * 32, *v226 == 0x8000000000000000))
                                                                            {
                                                                                if (v226[2])
                                                                                {
                                                                                    v227 = v226[2] - 1;
                                                                                    v226[2] = v227;
                                                                                    _memcpy(&v49, v226[1] + 264 * v227, 264);
                                                                                    if (*(unsigned long long *)((void*)&v52 + 8) != 33)
                                                                                        sub_bb2b20(&v49);
                                                                                }
                                                                                ptr2 = _malloc(64);
                                                                                if (ptr2)
                                                                                {
                                                                                    *(uint128_t *)ptr2 = v36;
                                                                                    *(uint128_t *)(ptr2 + 16) = v37;
                                                                                    *(uint128_t *)(ptr2 + 32) = v38;
                                                                                    *(uint128_t *)(ptr2 + 48) = v39;
                                                                                    v50 = CONCAT(ptr2, 1);
                                                                                    v52 = v6;
                                                                                    sub_bb92ac(v226, &v50);
                                                                                    goto LABEL_bb612c;
                                                                                }
                                                                                else
                                                                                {
                                                                                    sub_c6ba70(8, 64);
                                                                                    goto LABEL_bb7968;
                                                                                }
                                                                            }
                                                                            else
                                                                            {
                                                                                sub_c73c64(&g_ef94b0);
                                                                                goto LABEL_bb7968;
                                                                            }
                                                                            goto LABEL_bb7968;
                                                                        }
                                                                        else
                                                                        {
                                                                            v361 = &g_ef9498;
                                                                            goto LABEL_bb7418;
                                                                        }
                                                                        goto LABEL_bb7418;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else
                                        {
                                            v208 = 0xffffffff;
                                            v209 = v9;
                                            if (!v156)
                                                goto LABEL_bb55e8;
                                        }
                                        if (i > *(int *)(v137 + 0x2ffffffff0))
                                            goto LABEL_bb6128;
                                        goto LABEL_bb560c;
                                    }
                                }
                            }
                        }
                        if (i > *(int *)(v137 + 0x2ffffffff0))
                            goto LABEL_bb5584;
                        goto LABEL_bb53e0;
                    }
                    if ((unsigned long long)v139 <= v9 || !(v147 = v83->field_20 + v9 * 32, v147->field_0 != 0x8000000000000000))
                    {
                        v148 = 0xffffffff;
                        if (i <= 0xffffffff)
                            goto LABEL_bb5480;
                    }
                    else
                    {
                        v148 = v147->field_1c;
                        if (i <= 0xffffffff)
                        {
                            do
                            {
LABEL_bb5480:
                                if (i <= v148)
                                    goto LABEL_bb5228;
                            } while ((v149 = v137 + 48 * v148, v148 = v149[9], v150 = arm64g_calculate_condition(1, v149[10], 1, 0), v150 & 1));
                            if (0xffffffff < i)
                                goto LABEL_bb5228;
                            while (i > v148)
                            {
                                v151 = v137 + 48 * v148;
                                v148 = v151[9];
                                v152 = arm64g_calculate_condition(1, v151[10], 1, 0);
                                if (!(v152 & 1))
                                    goto LABEL_bb5228;
                            }
                            sub_be54b4((char *)&v47 + 8, *(long long *)(idx + 8), *(long long *)(idx + 8) + 72 * v136);
                            v153 = v9;
                            v41 = _INSERT(v47, 0, v153);
                            v47 = _INSERT(v41, 4, v107);
                            sub_bb8704(&v26, v83, v153, v107, (char *)&v47 + 8);
                            if (*(unsigned long long *)&v26 == 12)
                            {
                                v137 = v83->field_38;
                                i = *(long long *)&v83->padding_40[0];
                                v139 = v83->field_28;
                                goto LABEL_bb5228;
                            }
                            else
                            {
                                if ((unsigned long long)v83->field_28 > v9)
                                {
                                    v229 = v83->field_20 + v9 * 32;
                                    if (v229->field_0 == 0x8000000000000000)
                                    {
                                        v230 = nan;
                                        v231 = v1;
                                    }
                                    else
                                    {
                                        v230 = v229->field_18;
                                        v231 = v1;
                                    }
                                }
                                else
                                {
                                    v230 = nan;
                                    v231 = v1;
                                }
                                v56 = v9;
                                v51 = v83->field_38;
                                v52 = *(long long *)&v83->padding_40[0];
                                v55 = v230;
                                v41 = 0;
                                sub_b9b9f0(&v19, &v41);
                                if (*(unsigned long long *)&v20 == 1)
                                {
                                    v231 = *(int *)(*(unsigned long long *)((void*)&v19 + 8) + 16);
                                    v232 = !*(long long *)*(unsigned long long *)((void*)&v19 + 8);
                                    if (!*(unsigned long long *)&v19)
                                        goto LABEL_bb5c5c;
                                }
                                else
                                {
                                    v232 = 1;
                                    if (!*(unsigned long long *)&v19)
                                        goto LABEL_bb5c5c;
                                }
                                _free(*(unsigned long long *)((void*)&v19 + 8));
LABEL_bb5c5c:
                                if (v232 & 1)
                                {
                                    sub_c73c64(&g_ef9288);
                                    goto LABEL_bb7968;
                                }
                                v233 = *v31;
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ >= 0)
                                {
                                    v2 = v231;
                                    v19 = v32;
                                    v20 = v33;
                                    v21 = v34;
                                    v22 = v35;
                                    v40 = *(uint128_t *)&v26;
                                    v52 = *(uint128_t *)((void*)&v26 + 16);
                                    v56 = *(uint128_t *)((void*)&v26 + 32);
                                    v57 = v29;
                                    sub_bb89ec(&v75, v83->field_20, v83->field_28, v12, &v19, &v40);
                                    v123 = *(unsigned long long *)&v75 != 12;
                                    if (*(unsigned long long *)&v75 != 12)
                                    {
                                        v19 = v75;
                                        v20 = v76;
                                        v21 = v78;
                                        v22 = v80;
                                        do
                                        {
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                        } while (/* unsupported instruction */ ^ 1);
                                        if ((long long)/* unsupported instruction */ < 0)
                                            goto LABEL_bb740c;
                                        v41 = CONCAT(v233, 0);
                                        if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v8 || (v234 = v83->field_38 + (unsigned int)v8 * 48, v234->field_0 == 0x8000000000000000))
                                        {
                                            sub_c73c64(&g_ef92a0);
                                            goto LABEL_bb7968;
                                        }
                                        if (v234[1].field_0)
                                        {
                                            v235 = v234->field_8;
                                            sub_bb3264((v235->padding_0)[1]);
                                            *(uint128_t *)(v235->padding_0)[1] = v41;
                                            *(uint128_t *)((char *)&v235->field_8 + 8) = v52;
                                            *(uint128_t *)((char *)&v235->field_18 + 8) = v56;
                                            *(uint128_t *)((char *)&v235->field_28 + 8) = v57;
                                            do
                                            {
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                            } while (/* unsupported instruction */ ^ 1);
                                            if ((long long)/* unsupported instruction */ < 0)
                                                goto LABEL_bb740c;
                                            v42 = CONCAT(v233, 0);
                                            v236 = v2;
                                            if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v236 || (v237 = v83->field_38 + (unsigned int)v236 * 48, v237->field_0 == 0x8000000000000000))
                                            {
                                                sub_c73c64(&g_ef92d0);
                                                goto LABEL_bb7968;
                                            }
                                            if (!v237[1].field_0)
                                            {
                                                sub_c73c94(0, 0, &g_ef92e8);
                                                goto LABEL_bb7968;
                                            }
                                            v238 = v237->field_8;
                                            sub_bb3264((v238->padding_0)[1]);
                                            *(uint128_t *)(v238->padding_0)[1] = v42;
                                            *(uint128_t *)((char *)&v238->field_8 + 8) = v52;
                                            *(uint128_t *)((char *)&v238->field_18 + 8) = v56;
                                            *(uint128_t *)((char *)&v238->field_28 + 8) = v57;
                                            sub_bb1d1c(v83, v12, v2);
                                            v239 = v83->field_28;
                                            if ((unsigned long long)v239 <= v9 || !(v240 = v83->field_20 + v9 * 32, v240->field_0 != 0x8000000000000000))
                                            {
                                                v241 = 0xffffffff;
                                                v242 = *(long long *)&v83->padding_40[0];
                                                if (v242 > 0xffffffff)
                                                    goto LABEL_bb6d38;
                                            }
                                            else
                                            {
                                                v241 = v240->field_1c;
                                                v242 = *(long long *)&v83->padding_40[0];
                                                if (v242 > 0xffffffff)
                                                    goto LABEL_bb6d38;
                                            }
                                            do
                                            {
                                                if (v242 <= v241)
                                                {
                                                    sub_bd8578(&v42, v83, v9);
                                                    if (*(unsigned long long *)&v42 != 0x8000000000000000)
                                                    {
                                                        v245 = *(unsigned long long *)&v52 + 1;
                                                        while (1)
                                                        {
                                                            v246 = v245 - 1;
                                                            if (v245 == 1)
                                                                break;
                                                            sub_b9a8fc();
                                                            v245 = v246;
                                                        }
                                                        if (*(unsigned long long *)&v42)
                                                            _free(*(unsigned long long *)((void*)&v42 + 8));
                                                    }
                                                    v239 = v83->field_28;
                                                    break;
                                                }
                                            } while ((v243 = v83->field_38 + 48 * v241, v241 = v243[9], v244 = arm64g_calculate_condition(1, v243[10], 1, 0), v244 & 1));
LABEL_bb6d38:
                                            if ((unsigned long long)v239 > v84 && !(v247 = v83->field_20 + v84 * 32, *v247 == 0x8000000000000000))
                                            {
                                                if (!v247[2])
                                                {
                                                    v368 = &g_ef9318;
                                                    goto LABEL_bb76bc;
                                                }
                                                v248 = v247[1] + 264 * v247[2];
                                                if (*(long long *)((char *)v248 - 240) == 16)
                                                {
                                                    do
                                                    {
                                                        /* unsupported instruction */;
                                                        /* unsupported instruction */;
                                                    } while (/* unsupported instruction */ ^ 1);
                                                    if ((long long)/* unsupported instruction */ < 0)
                                                        goto LABEL_bb740c;
                                                    sub_bb3264((char *)v248 - 232);
                                                    *(unsigned long long *)((char *)v248 - 232) = 0;
                                                    *(long long *)((char *)v248 - 224) = v233;
                                                    v249 = v247[2];
                                                    v250 = _malloc(24);
                                                    if (!v250)
                                                    {
                                                        sub_c6ba70(8, 24);
                                                        goto LABEL_bb7968;
                                                    }
                                                    *(unsigned long *)v250 = 0x8000000000000000;
                                                    *(long long *)(v250 + 8) = v233;
                                                    v65 = CONCAT(v250, 1);
                                                    v66 = 1;
                                                    v251 = _malloc(64);
                                                    if (!v251)
                                                    {
                                                        sub_c6ba70(8, 64);
                                                        goto LABEL_bb7968;
                                                    }
                                                    v252 = v249 - 1;
                                                    *(uint128_t *)v251 = v75;
                                                    *(uint128_t *)(v251 + 16) = v76;
                                                    *(uint128_t *)(v251 + 32) = v78;
                                                    *(uint128_t *)(v251 + 48) = v80;
                                                    v56 = v65;
                                                    v57 = v66;
                                                    v61 = v251;
                                                    v63 = 1;
                                                    v64 = 0;
                                                    v60 = 1;
                                                    v54 = 15;
                                                    v253 = v247[2];
                                                    if (v253 < v252)
                                                    {
                                                        sub_c6bb08(v252, v253, &g_ef9330);
                                                        goto LABEL_bb7968;
                                                    }
                                                    else if (v253 == *v247)
                                                    {
                                                        sub_c6c42c(v247);
                                                    }
                                                }
                                                else
                                                {
                                                    v368 = &g_ef9348;
                                                    goto LABEL_bb76bc;
                                                }
                                            }
                                            else
                                            {
                                                v368 = &g_ef9300;
LABEL_bb76bc:
                                                sub_c73c64(v368);
                                                goto LABEL_bb7968;
                                            }
                                        }
                                        else
                                        {
                                            sub_c73c94(0, 0, &g_ef92b8);
                                            goto LABEL_bb7968;
                                        }
                                    }
                                    else
                                    {
                                        do
                                        {
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                        } while (/* unsupported instruction */ ^ 1);
                                        v254 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                        if (!(v254 & 1))
                                        {
                                            /* unsupported instruction */;
                                            sub_b86a90(v233);
                                            goto LABEL_bb612c;
                                        }
                                    }
LABEL_bb6e20:
                                    v276 = v247[1] + 264 * v252;
                                    if (v253 > v252)
                                        _memmove(v276 + 264, v276, (v253 - v252) * 264);
                                    _memcpy(v276, &v42, 264);
                                    v247[2] = v253 + 1;
                                    v57 = v58;
LABEL_bb612c:
                                    v10 |= v123;
                                    v104 = v83->field_28;
                                    goto LABEL_bb613c;
                                }
                                goto LABEL_bb740c;
                            }
                        }
                    }
                    if (i > *(int *)(v137 + 0x2ffffffff0))
                        goto LABEL_bb5228;
                }
                if ((unsigned long long)v139 <= v107 || !(v140 = v83->field_20 + v107 * 32, v140->field_0 != 0x8000000000000000))
                {
                    v141 = 0xffffffff;
                    if (i <= 0xffffffff)
                        goto LABEL_bb5434;
                }
                else
                {
                    v141 = v140->field_1c;
                    if (i <= 0xffffffff)
                    {
                        do
                        {
LABEL_bb5434:
                            v47 = v44;
                            if (i <= v141)
                                goto LABEL_bb5220;
                        } while ((v142 = v137 + 48 * v141, v141 = v142[9], v143 = arm64g_calculate_condition(1, v142[10], 1, 0), v143 & 1));
                        v47 = v44;
                        if (0xffffffff < i)
                            goto LABEL_bb5220;
                        while (i > v141)
                        {
                            v144 = v137 + 48 * v141;
                            v141 = v144[9];
                            v145 = arm64g_calculate_condition(1, v144[10], 1, 0);
                            v47 = v44;
                            if (!(v145 & 1))
                                goto LABEL_bb5220;
                        }
                        sub_be54b4((char *)&v44 + 8, *(long long *)(index + 8), *(long long *)(index + 8) + 72 * *(long long *)(index + 16));
                        v41 = _INSERT(v44, 0, v107);
                        v146 = v9;
                        v47 = _INSERT(v41, 4, v146);
                        sub_bb8704(&v26, v83, v107, v146, (char *)&v47 + 8);
                        if (*(unsigned long long *)&v26 == 12)
                        {
                            v137 = v83->field_38;
                            i = *(long long *)&v83->padding_40[0];
                            v139 = v83->field_28;
                            goto LABEL_bb5220;
                        }
                        else
                        {
                            if ((unsigned long long)v83->field_28 <= v107 || (v255 = v83->field_20 + v107 * 32, v255->field_0 == 0x8000000000000000))
                                v256 = nan;
                            else
                                v256 = v255->field_18;
                            *(unsigned int *)&v56 = v107;
                            v51 = v83->field_38;
                            v52 = CONCAT(__double_as_longlong(v256), *(long long *)&v83->padding_40[0]);
                            v41 = 0;
                            sub_b9b9f0(&v19, &v41);
                            if (*(unsigned long long *)&v20 == 1)
                            {
                                v0 = *(int *)(*(unsigned long long *)((void*)&v19 + 8) + 16);
                                v257 = !*(long long *)*(unsigned long long *)((void*)&v19 + 8);
                                if (!*(unsigned long long *)&v19)
                                    goto LABEL_bb5a24;
                            }
                            else
                            {
                                v257 = 1;
                                if (!*(unsigned long long *)&v19)
                                    goto LABEL_bb5a24;
                            }
                            _free(*(unsigned long long *)((void*)&v19 + 8));
LABEL_bb5a24:
                            if (v257 & 1)
                            {
                                sub_c73c64(&g_ef91b0);
                                goto LABEL_bb7968;
                            }
                            v258 = *v31;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bb740c;
                            v19 = *(uint128_t *)&v26;
                            v20 = *(uint128_t *)((void*)&v26 + 16);
                            v21 = *(uint128_t *)((void*)&v26 + 32);
                            v22 = v29;
                            v43 = v32;
                            v52 = v33;
                            v56 = v34;
                            v57 = v35;
                            sub_bb89ec(&v75, v83->field_20, v83->field_28, v12, &v19, &v43);
                            v123 = *(unsigned long long *)&v75 != 12;
                            if (*(unsigned long long *)&v75 != 12)
                            {
                                v19 = v75;
                                v20 = v76;
                                v21 = v78;
                                v22 = v80;
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ < 0)
                                    goto LABEL_bb740c;
                                v41 = CONCAT(v258, 0);
                                v259 = v0;
                                if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v259 || (v260 = v83->field_38 + (unsigned int)v259 * 48, v260->field_0 == 0x8000000000000000))
                                {
                                    sub_c73c64(&g_ef91c8);
                                    goto LABEL_bb7968;
                                }
                                if (!v260[1].field_0)
                                {
                                    sub_c73c94(0, 0, &g_ef91e0);
                                    goto LABEL_bb7968;
                                }
                                v261 = v260->field_8;
                                sub_bb3264((v261->padding_0)[1]);
                                *(uint128_t *)(v261->padding_0)[1] = v41;
                                *(uint128_t *)((char *)&v261->field_8 + 8) = v52;
                                *(uint128_t *)((char *)&v261->field_18 + 8) = v56;
                                *(uint128_t *)((char *)&v261->field_28 + 8) = v57;
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ < 0)
                                    goto LABEL_bb740c;
                                v42 = CONCAT(v258, 0);
                                if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v110 || (v262 = v83->field_38 + (unsigned int)v110 * 48, v262->field_0 == 0x8000000000000000))
                                {
                                    sub_c73c64(&g_ef91f8);
                                    goto LABEL_bb7968;
                                }
                                if (v262[1].field_0)
                                {
                                    v263 = v262->field_8;
                                    sub_bb3264((v263->padding_0)[1]);
                                    *(uint128_t *)(v263->padding_0)[1] = v42;
                                    *(uint128_t *)((char *)&v263->field_8 + 8) = v52;
                                    *(uint128_t *)((char *)&v263->field_18 + 8) = v56;
                                    *(uint128_t *)((char *)&v263->field_28 + 8) = v57;
                                    sub_bb1d1c(v83, v12, v0);
                                    v264 = v83->field_28;
                                    if ((unsigned long long)v264 <= v107 || !(v265 = v83->field_20 + v107 * 32, v265->field_0 != 0x8000000000000000))
                                    {
                                        v266 = 0xffffffff;
                                        v267 = *(long long *)&v83->padding_40[0];
                                        if (v267 > 0xffffffff)
                                            goto LABEL_bb6c30;
                                    }
                                    else
                                    {
                                        v266 = v265->field_1c;
                                        v267 = *(long long *)&v83->padding_40[0];
                                        if (v267 > 0xffffffff)
                                            goto LABEL_bb6c30;
                                    }
                                    do
                                    {
                                        if (v267 <= v266)
                                        {
                                            sub_bd8578(&v42, v83, v107);
                                            if (*(unsigned long long *)&v42 != 0x8000000000000000)
                                            {
                                                v270 = *(unsigned long long *)&v52 + 1;
                                                while (1)
                                                {
                                                    v271 = v270 - 1;
                                                    if (v270 == 1)
                                                        break;
                                                    sub_b9a8fc();
                                                    v270 = v271;
                                                }
                                                if (*(unsigned long long *)&v42)
                                                    _free(*(unsigned long long *)((void*)&v42 + 8));
                                            }
                                            v264 = v83->field_28;
                                            break;
                                        }
                                    } while ((v268 = v83->field_38 + 48 * v266, v266 = v268[9], v269 = arm64g_calculate_condition(1, v268[10], 1, 0), v269 & 1));
LABEL_bb6c30:
                                    if ((unsigned long long)v264 > v84 && !(v247 = v83->field_20 + v84 * 32, *v247 == 0x8000000000000000))
                                    {
                                        if (!v247[2])
                                        {
                                            v367 = &g_ef9240;
                                            goto LABEL_bb7668;
                                        }
                                        v272 = v247[1] + 264 * v247[2];
                                        if (*(long long *)((char *)v272 - 240) == 16)
                                        {
                                            do
                                            {
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                            } while (/* unsupported instruction */ ^ 1);
                                            if ((long long)/* unsupported instruction */ < 0)
                                                goto LABEL_bb740c;
                                            sub_bb3264((char *)v272 - 232);
                                            *(unsigned long long *)((char *)v272 - 232) = 0;
                                            *(long long *)((char *)v272 - 224) = v258;
                                            v273 = v247[2];
                                            v274 = _malloc(24);
                                            if (!v274)
                                            {
                                                sub_c6ba70(8, 24);
                                                goto LABEL_bb7968;
                                            }
                                            *(unsigned long *)v274 = 0x8000000000000000;
                                            *(long long *)(v274 + 8) = v258;
                                            v65 = CONCAT(v274, 1);
                                            *(unsigned long long *)&v66 = 1;
                                            v275 = _malloc(64);
                                            if (!v275)
                                            {
                                                sub_c6ba70(8, 64);
                                                goto LABEL_bb7968;
                                            }
                                            v252 = v273 - 1;
                                            *(uint128_t *)v275 = v75;
                                            *(uint128_t *)(v275 + 16) = v76;
                                            *(uint128_t *)(v275 + 32) = v78;
                                            *(uint128_t *)(v275 + 48) = v80;
                                            v56 = v65;
                                            *(unsigned long long *)&v57 = *(unsigned long long *)&v66;
                                            v61 = v275;
                                            v63 = 1;
                                            v64 = 0;
                                            v58 = _INSERT(v57, 8, 1);
                                            *(unsigned long long *)((char *)&v52 + 8) = 15;
                                            v253 = v247[2];
                                            if (v253 < v252)
                                            {
                                                sub_c6bb08(v252, v253, &g_ef9258);
                                                goto LABEL_bb7968;
                                            }
                                            else if (v253 == *v247)
                                            {
                                                sub_c6c42c(v247);
                                                goto LABEL_bb6e20;
                                            }
                                        }
                                        else
                                        {
                                            v367 = &g_ef9270;
                                            goto LABEL_bb7668;
                                        }
                                    }
                                    else
                                    {
                                        v367 = &g_ef9228;
LABEL_bb7668:
                                        sub_c73c64(v367);
                                        goto LABEL_bb7968;
                                    }
                                }
                                else
                                {
                                    sub_c73c94(0, 0, &g_ef9210);
                                    goto LABEL_bb7968;
                                }
                            }
                            else
                            {
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                v277 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                if (!(v277 & 1))
                                {
                                    /* unsupported instruction */;
                                    sub_b86a90(v258);
                                    goto LABEL_bb612c;
                                }
                            }
                        }
                    }
                }
                v47 = v44;
                if (i > *(int *)(v137 + 0x2ffffffff0))
                    goto LABEL_bb5220;
            }
            else
            {
LABEL_bb613c:
                if ((unsigned long long)v104 <= v84 || (v278 = v83->field_20 + v84 * 32, *v278 == 0x8000000000000000))
                {
                    v361 = &g_ef9120;
                    goto LABEL_bb7418;
                }
                v11 = v10;
                if (v278[2] && !(v279 = v278[1] + 264 * v278[2], v11 = v10, *(long long *)((char *)v279 - 240) != 16))
                {
                    sub_bb813c(&v65, (char *)v279 - 232);
                    sub_bd8d30(&v44, v83, v12);
                    v280 = *(unsigned long long *)&v44;
                    if (!v280)
                    {
                        sub_c73c64(&g_ef9138);
                        goto LABEL_bb7968;
                    }
                    v281 = *(unsigned int *)((void*)&v44 + 12);
                    if ((unsigned long long)v83->field_28 <= v281 || (v282 = v83->field_20 + v281 * 32, v282->field_0 == 0x8000000000000000))
                        v283 = 0xffffffff;
                    else
                        v283 = v282->field_1c;
                    iter = 0;
                    v285 = *(unsigned long long *)((void*)&v53 + 8);
                    v286 = *(unsigned int *)((void*)&v56 + 4);
                    j = 0xffffffff;
                    v288 = v83->field_38;
                    v289 = *(long long *)&v83->padding_40[0];
                    if (0xffffffff < v289)
                    {
                        do
                        {
LABEL_bb620c:
                            j = *(int *)(v288 + 48 * j + 32);
                            iter += 1;
                        } while (j < v289);
                    }
                    while (1)
                    {
                        if (v289 <= v283)
                        {
                            if (iter != 1 || *(long long *)(v280 + 16))
                            {
                                if ((unsigned long long)v83->field_28 <= v286)
                                    goto LABEL_bb62e0;
                                goto LABEL_bb623c;
                            }
                            else
                            {
                                sub_be54b4(&v69, *(long long *)(v285 + 8), *(long long *)(v285 + 8) + 72 * *(long long *)(v285 + 16));
                                *(unsigned int *)&v24 = v281;
                                *(unsigned int *)((char *)&v24 + 4) = v286;
                                *(uint128_t *)((char *)&v24 + 8) = v69;
                                *(uint128_t *)((char *)&v24 + 24) = v70;
                                sub_bb9324(&v44, v83, v281, v286, (char *)&v24 + 8);
                                if (*(unsigned long long *)&v44 == 12)
                                {
                                    v288 = v83->field_38;
                                    v289 = *(long long *)&v83->padding_40[0];
                                    if (v286 >= (unsigned long long)v83->field_28)
                                    {
LABEL_bb62e0:
                                        v296 = 0xffffffff;
                                        node = 0;
                                        k = 0xffffffff;
                                        if (0xffffffff >= v289)
                                            goto LABEL_bb62f4;
                                        while (1)
                                        {
                                            do
                                            {
LABEL_bb6318:
                                                k = *(int *)(v288 + 48 * k + 32);
                                                node += 1;
                                            } while (k < v289);
                                            do
                                            {
LABEL_bb62f4:
                                                if (v289 <= v296)
                                                {
                                                    if (node == 1 && !*(long long *)(v285 + 16))
                                                    {
                                                        sub_be54b4(&v72, *(long long *)(v280 + 8), *(long long *)(v280 + 8) + 72 * *(long long *)(v280 + 16));
                                                        *(unsigned int *)&v24 = v286;
                                                        *(unsigned int *)((char *)&v24 + 4) = v281;
                                                        *(uint128_t *)((char *)&v24 + 8) = v72;
                                                        *(uint128_t *)((char *)&v24 + 24) = v73;
                                                        sub_bb9324(&v44, v83, v286, v281, (char *)&v24 + 8);
                                                        if (*(unsigned long long *)&v44 != 12)
                                                        {
                                                            v292 = v62;
                                                            sub_bd8d30(&v24, v83, v286);
                                                            if (!*(unsigned long long *)&v24)
                                                            {
                                                                sub_c73c64(&g_ef9168);
                                                                goto LABEL_bb7968;
                                                            }
                                                            if ((unsigned int)v281 == *(unsigned int *)((void*)&v24 + 12))
                                                            {
                                                                v75 = v65;
                                                                v76 = v66;
                                                                v77 = v67;
                                                                v79 = v68;
                                                                v24 = v44;
                                                                v27 = v53;
                                                                v28 = v56;
                                                                v29 = v57;
                                                                sub_b94fac((char *)&v19 + 8, &v75, &v24, 14);
                                                                v294 = 0;
                                                            }
                                                            else
                                                            {
                                                                v24 = v65;
                                                                v27 = v66;
                                                                v28 = v67;
                                                                v29 = v68;
                                                                v301 = _malloc(64);
                                                                if (v301)
                                                                {
                                                                    *(uint128_t *)v301 = v65;
                                                                    *(uint128_t *)(v301 + 16) = v66;
                                                                    *(uint128_t *)(v301 + 32) = v67;
                                                                    *(uint128_t *)(v301 + 48) = v68;
                                                                    *(char *)&v76 = 0;
                                                                    v75 = CONCAT(v301, 8);
                                                                    v24 = v44;
                                                                    v27 = v53;
                                                                    v28 = v56;
                                                                    v29 = v57;
                                                                    sub_b94fac((char *)&v19 + 8, &v75, &v24, 13);
                                                                    v294 = 1;
                                                                    v77 = v78;
                                                                    v79 = v80;
                                                                }
                                                                else
                                                                {
                                                                    sub_c6ba70(8, 64);
                                                                    goto LABEL_bb7968;
                                                                }
                                                            }
                                                            *(unsigned long long *)&v19 = 9;
                                                            *(unsigned int *)&v23 = v12;
                                                            *(unsigned int *)((char *)&v23 + 4) = v286;
                                                            *(unsigned int *)((char *)&v23 + 8) = v281;
LABEL_bb6568:
                                                            *((char *)&v23 + 12) = v292;
                                                            *(unsigned long long *)((char *)&v23 + 13) = v294;
                                                            v29 = v22;
                                                            v30 = v23;
                                                            v24 = _INSERT(CONCAT(v24, 0), 16, v20);
                                                            *(uint128_t *)((char *)&v24 + 32) = v21;
                                                            *(uint128_t *)&v24 = v19;
                                                            v302 = *(unsigned int *)((void*)&v30 + 4);
                                                            if (v83->field_78 == 1 && (unsigned int)v302 == v83->field_7c)
                                                            {
                                                                sub_bb3264(&v19);
                                                                v11 = v10;
                                                                goto LABEL_bb6398;
                                                            }
                                                            if ((unsigned long long)v83->field_28 <= v302 || (v303 = v83->field_20 + v302 * 32, v303->field_0 == 0x8000000000000000))
                                                                v304 = 0xffffffff;
                                                            else
                                                                v304 = v303->field_18;
                                                            v305 = v83->field_38;
                                                            v306 = *(long long *)&v83->padding_40[0];
                                                            v307 = *(unsigned int *)((void*)&v30 + 8);
                                                            do
                                                            {
                                                                v308 = v304;
                                                                if (v306 <= v308 || (v309 = v305 + 48 * v308, v309->field_0 == 0x8000000000000000))
                                                                {
                                                                    v11 = 0;
                                                                    goto LABEL_bb7618;
                                                                }
                                                            } while ((v304 = v309->field_20, v310 = v309->field_28, (unsigned int)v307 != (unsigned int)(v310 >> 32)));
                                                            v9 = v83;
                                                            v311 = _malloc(96);
                                                            if (v311)
                                                            {
                                                                v11 = v307 * 0x100000000;
                                                                *(st_bb4e28_6 **)v311 = v309;
                                                                *(unsigned long long *)(v311 + 8) = v11 | v310 & 0xffffffff;
                                                                *(unsigned int *)(v311 + 16) = v308;
                                                                v41 = 4;
                                                                v51 = v311;
                                                                v312 = 1;
                                                                v52 = v53;
                                                                while (1)
                                                                {
                                                                    *(unsigned long long *)&v52 = v312;
                                                                    do
                                                                    {
                                                                        v313 = v304;
                                                                        if (v306 <= v313 || !(v314 = v305 + 48 * v313, v314->field_0 != 0x8000000000000000))
                                                                        {
                                                                            v11 = v41;
                                                                            if (v312 == 1)
                                                                            {
                                                                                v7 = v51;
                                                                                sub_b9ecac(&v72, *v7->field_8, *v7->field_10);
                                                                                v83 = v9;
                                                                                v317 = (unsigned int)v30;
                                                                                if ((unsigned long long)v83->field_28 <= v317 || (v318 = v83->field_20 + v317 * 32, v318->field_0 == 0x8000000000000000))
                                                                                    v319 = 0xffffffff;
                                                                                else
                                                                                    v319 = v318->field_18;
                                                                                v320 = v83->field_38;
                                                                                v321 = *(long long *)&v83->padding_40[0];
                                                                                v322 = *(unsigned int *)((void*)&v30 + 8);
                                                                                do
                                                                                {
                                                                                    v323 = v319;
                                                                                    if (v321 <= v323 || (v324 = v320 + 48 * v323, v324->field_0 == 0x8000000000000000))
                                                                                        goto LABEL_bb78e4;
                                                                                } while ((v319 = v324->field_20, (unsigned int)v322 != (unsigned int)(v324->field_28 >> 32)));
                                                                                v325 = _malloc(96);
                                                                                if (v325)
                                                                                {
                                                                                    v326 = v324->field_28 & 0xffffffff;
                                                                                    v8 = v322 * 0x100000000;
                                                                                    *(st_bb4e28_6 **)v325 = v324;
                                                                                    *(unsigned long long *)(v325 + 8) = v8 | v326;
                                                                                    *(unsigned int *)(v325 + 16) = v323;
                                                                                    v41 = CONCAT(v325, 4);
                                                                                    v327 = 1;
                                                                                }
                                                                                else
                                                                                {
                                                                                    sub_c6b970(8, 96);
                                                                                    goto LABEL_bb7968;
                                                                                }
                                                                            }
                                                                            else
                                                                            {
LABEL_bb7618:
                                                                                sub_c73c80("assertion failed: second_to_sc_edges.len() == 1assertion failed: new_upvalues_in.contains(&value)assertion failed: self.incomplete_params.is_empty()assertion failed: function.predecessor_blocks(function.entry().unwrap()).next().is_none()assertion failed: new_rvalue.is_none()assertion failed: table.0.iter().filter(|(k, _)| k.is_none()).count() == set_list.index - 1assertion failed: !table.0.last().map_or(false,\n        |(k, v)|\n            k.is_none() &&\n                matches!(v, ast::RValue::VarArg(_) | ast::RValue::Call(_) |\n                    ast::RValue::MethodCall(_)))Range start can not be after range end", 47, &g_ef9108);
                                                                                goto LABEL_bb7968;
                                                                            }
                                                                            while (1)
                                                                            {
                                                                                *(unsigned long long *)&v52 = v327;
                                                                                do
                                                                                {
                                                                                    v328 = v319;
                                                                                    if (v321 <= v328 || !(v329 = v320 + 48 * v328, v329->field_0 != 0x8000000000000000))
                                                                                    {
                                                                                        v332 = *(unsigned long long *)((void*)&v41 + 8);
                                                                                        if (v327 == 1)
                                                                                        {
                                                                                            v333 = *(int *)(v332 + 16);
                                                                                            if ((unsigned long long)*(long long *)&v83->padding_40[0] <= v333 || (v334 = v83->field_38 + (unsigned int)v333 * 48, v334->field_0 == 0x8000000000000000))
                                                                                            {
                                                                                                v362 = &g_ef9000;
LABEL_bb74b4:
                                                                                                sub_c73c64(v362);
                                                                                                goto LABEL_bb7968;
                                                                                            }
                                                                                            v335 = v334[1].field_0;
                                                                                            if (v334[1].field_0)
                                                                                            {
                                                                                                v336 = v334->field_8;
                                                                                                l = v336;
                                                                                                do
                                                                                                {
                                                                                                    v338 = l;
                                                                                                    l += 72;
                                                                                                    v339 = *(unsigned long long *)((void*)&v72 + 8) - 72;
                                                                                                    v340 = *(unsigned long long *)&v73 * 72;
                                                                                                    do
                                                                                                    {
                                                                                                        v341 = v339;
                                                                                                        if (!v340)
                                                                                                            goto LABEL_bb6868;
                                                                                                    } while ((v339 = &v341->field_48, v340 -= 72, v341->field_48 != *(long long *)v338));
                                                                                                    do
                                                                                                    {
                                                                                                        /* unsupported instruction */;
                                                                                                        /* unsupported instruction */;
                                                                                                    } while (/* unsupported instruction */ ^ 1);
                                                                                                    if ((long long)/* unsupported instruction */ < 0)
                                                                                                        goto LABEL_bb740c;
                                                                                                    *(unsigned long long *)&v41 = v341->field_48;
                                                                                                    sub_bb813c((char *)&v41 + 8, &v339->padding_0[8]);
                                                                                                    do
                                                                                                    {
                                                                                                        /* unsupported instruction */;
                                                                                                        /* unsupported instruction */;
                                                                                                        /* unsupported instruction */;
                                                                                                    } while (/* unsupported instruction */ ^ 1);
                                                                                                    v342 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                                                                                    if (!(v342 & 1))
                                                                                                    {
                                                                                                        /* unsupported instruction */;
                                                                                                        sub_b86a90(*(long long *)v338);
                                                                                                    }
                                                                                                    sub_bb3264(v338 + 8);
                                                                                                    *(uint128_t *)&v338[16] = v52;
                                                                                                    *(uint128_t *)&v338[32] = v56;
                                                                                                    *(uint128_t *)&v338[48] = v57;
                                                                                                    *(unsigned long *)&v338[64] = v62;
                                                                                                    *(uint128_t *)v338 = v41;
LABEL_bb6868:
                                                                                                } while (l != v336 + v335 * 72);
                                                                                            }
                                                                                            v343 = *(unsigned int *)((void*)&v30 + 4);
                                                                                            sub_bd8d30(&v41, v83, v343);
                                                                                            if (!*(unsigned long long *)&v41)
                                                                                            {
                                                                                                v362 = &g_ef9018;
                                                                                                goto LABEL_bb74b4;
                                                                                            }
                                                                                            v344 = (unsigned int)v30;
                                                                                            if (!sub_bb1d1c())
                                                                                            {
                                                                                                v363 = "assertion failed: skip_over_node(function, pattern.first_node, other_edge)";
                                                                                                goto LABEL_bb74a4;
                                                                                            }
                                                                                            sub_bd8578(&v41, v83, v343);
                                                                                            if (*(unsigned long long *)&v41 == 0x8000000000000000)
                                                                                            {
                                                                                                v362 = &g_ef9048;
                                                                                                goto LABEL_bb74b4;
                                                                                            }
                                                                                            v8 = *(unsigned long long *)&v41;
                                                                                            v65 = v41;
                                                                                            *(unsigned long long *)&v66 = *(unsigned long long *)&v52;
                                                                                            if (*(char *)((void*)&v30 + 12) & 1)
                                                                                            {
                                                                                                v345 = *(unsigned long long *)&v66;
                                                                                                if (!v345)
                                                                                                {
                                                                                                    v364 = &g_ef9090;
                                                                                                    goto LABEL_bb7518;
                                                                                                }
                                                                                                v346 = *(unsigned long long *)((void*)&v65 + 8);
                                                                                                if (*(long long *)(v346 + 24) != 15)
                                                                                                {
                                                                                                    v364 = &g_ef90d8;
LABEL_bb7518:
                                                                                                    sub_c73c64(v364);
                                                                                                    goto LABEL_bb7968;
                                                                                                }
                                                                                                v347 = _malloc(64);
                                                                                                if (!v347)
                                                                                                {
                                                                                                    sub_c6ba70(8, 64);
                                                                                                    goto LABEL_bb7968;
                                                                                                }
                                                                                                v348 = v347;
                                                                                                v41 = *(uint128_t *)&v24;
                                                                                                v52 = *(uint128_t *)((void*)&v24 + 16);
                                                                                                v56 = *(uint128_t *)((void*)&v24 + 32);
                                                                                                v57 = v29;
                                                                                                sub_b7de54(&v75, &v41);
                                                                                                *v348 = v75;
                                                                                                v348[1] = v76;
                                                                                                v348[2] = v77;
                                                                                                v348[3] = v79;
                                                                                                v349 = *(long long *)(v346 + 72) + 1;
                                                                                                while (1)
                                                                                                {
                                                                                                    v350 = v349 - 1;
                                                                                                    if (v349 == 1)
                                                                                                        break;
                                                                                                    sub_b9b2c4();
                                                                                                    v349 = v350;
                                                                                                }
                                                                                                if (*(long long *)(v346 + 56))
                                                                                                    _free(*(long long *)(v346 + 64));
                                                                                                *(unsigned long long *)(v346 + 56) = 1;
                                                                                                *(uint128_t **)(v346 + 64) = v348;
                                                                                                *(unsigned long long *)(v346 + 72) = 1;
                                                                                                if (!(*(char *)((void*)&v30 + 13) & 1))
                                                                                                    goto LABEL_bb6b14;
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                v345 = *(unsigned long long *)&v66;
                                                                                                if (!v345)
                                                                                                {
                                                                                                    v364 = &g_ef9060;
                                                                                                    goto LABEL_bb7518;
                                                                                                }
                                                                                                v346 = *(unsigned long long *)((void*)&v65 + 8);
                                                                                                v351 = v346 + 264 * v345;
                                                                                                if (*(long long *)((char *)v351 - 240) != 16)
                                                                                                {
                                                                                                    v364 = &g_ef9078;
                                                                                                    goto LABEL_bb7518;
                                                                                                }
                                                                                                v41 = *(uint128_t *)&v24;
                                                                                                v52 = *(uint128_t *)((void*)&v24 + 16);
                                                                                                v56 = *(uint128_t *)((void*)&v24 + 32);
                                                                                                v57 = v29;
                                                                                                sub_b7dad4(&v75, &v41);
                                                                                                v352 = v351 - 232;
                                                                                                sub_bb3264(v352);
                                                                                                *v352 = v75;
                                                                                                v352[1] = v76;
                                                                                                v352[2] = v77;
                                                                                                v352[3] = v79;
                                                                                                if (!(*(char *)((void*)&v30 + 13) & 1))
                                                                                                    goto LABEL_bb6b14;
                                                                                            }
                                                                                            v353 = v346 + 264 * v345;
                                                                                            if (*(long long *)((char *)v353 - 240) == 16)
                                                                                            {
                                                                                                v354 = v353 - 232;
                                                                                                sub_bb813c(&v41, v354);
                                                                                                v355 = _malloc(64);
                                                                                                if (v355)
                                                                                                {
                                                                                                    *(uint128_t *)v355 = v41;
                                                                                                    *(uint128_t *)(v355 + 16) = v52;
                                                                                                    *(uint128_t *)(v355 + 32) = v56;
                                                                                                    *(uint128_t *)(v355 + 48) = v57;
                                                                                                    sub_b7fa90(&v41, v355, 0);
                                                                                                    sub_bb3264(v354);
                                                                                                    *v354 = v41;
                                                                                                    v354[1] = v52;
                                                                                                    v354[2] = v56;
                                                                                                    v354[3] = v57;
                                                                                                }
                                                                                                else
                                                                                                {
                                                                                                    sub_c6ba70(8, 64);
                                                                                                    goto LABEL_bb7968;
                                                                                                }
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                v365 = &g_ef90c0;
                                                                                                goto LABEL_bb7548;
                                                                                            }
LABEL_bb6b14:
                                                                                            if ((unsigned long long)v83->field_28 > v344 && !(v356 = v83->field_20 + v344 * 32, *v356 == 0x8000000000000000))
                                                                                            {
                                                                                                if (v356[2])
                                                                                                {
                                                                                                    v357 = v356[2] - 1;
                                                                                                    v356[2] = v357;
                                                                                                    _memmove(&v41, v356[1] + 264 * v357, 264);
                                                                                                    if (*(unsigned long long *)((void*)&v52 + 8) != 33)
                                                                                                        sub_bb2b20(&v41);
                                                                                                }
                                                                                                n = v345 * 264;
                                                                                                v41 = v346;
                                                                                                v51 = v346;
                                                                                                v52 = *(unsigned long long *)&v65;
                                                                                                v54 = v346 + n;
                                                                                                v359 = v356[2];
                                                                                                if (*v356 - v359 < v345)
                                                                                                {
                                                                                                    sub_c736c8(v356, v359, v345, 8, 264);
                                                                                                    v359 = v356[2];
                                                                                                }
                                                                                                _memcpy(v356[1] + 264 * v359, v346, n);
                                                                                                v356[2] = v359 + v345;
                                                                                                v54 = v346;
                                                                                                if (v52)
                                                                                                    _free(v346);
                                                                                                if (v8)
                                                                                                    _free(v332);
                                                                                                v360 = *(unsigned long long *)((void*)&v72 + 8);
                                                                                                sub_b9f1a4(v360, *(unsigned long long *)&v73);
                                                                                                if (*(unsigned long long *)&v72)
                                                                                                    _free(v360);
                                                                                                if (v11)
                                                                                                    _free(v7);
                                                                                                v11 = 1;
                                                                                                goto LABEL_bb6398;
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                v365 = &g_ef90a8;
LABEL_bb7548:
                                                                                                sub_c73c64(v365);
                                                                                                goto LABEL_bb7968;
                                                                                            }
                                                                                        }
                                                                                        else
                                                                                        {
LABEL_bb78e4:
                                                                                            v363 = "assertion failed: first_to_sc_edges.len() == 1";
LABEL_bb74a4:
                                                                                            sub_c73c80(v363);
                                                                                            goto LABEL_bb7968;
                                                                                        }
                                                                                    }
                                                                                } while ((v319 = v329->field_20, (unsigned int)v322 != (unsigned int)(v329->field_28 >> 32)));
                                                                                if (v327 == *(unsigned long long *)&v41)
                                                                                {
                                                                                    sub_c736c8(&v41, v327, 1, 8, 24);
                                                                                    v325 = *(unsigned long long *)((void*)&v41 + 8);
                                                                                }
                                                                                v330 = v329->field_28 & 0xffffffff;
                                                                                v331 = v325 + 24 * v327;
                                                                                v331->field_0 = v329;
                                                                                v331->field_8 = v8 | v330;
                                                                                v331->field_10 = v328;
                                                                                v327 += 1;
                                                                            }
                                                                        }
                                                                    } while ((v304 = v314->field_20, (unsigned int)v307 != (unsigned int)(v314->field_28 >> 32)));
                                                                    if (v312 == v41)
                                                                    {
                                                                        sub_c736c8(&v41, v312, 1, 8, 24);
                                                                        v311 = v51;
                                                                    }
                                                                    v315 = v314->field_28 & 0xffffffff;
                                                                    v316 = v311 + 24 * v312;
                                                                    v316->field_0 = v314;
                                                                    v316->field_8 = v11 | v315;
                                                                    v316->field_10 = v313;
                                                                    v312 += 1;
                                                                }
                                                            }
                                                            else
                                                            {
                                                                sub_c6b970(8, 96);
                                                                goto LABEL_bb7968;
                                                            }
                                                            goto LABEL_bb7968;
                                                        }
                                                    }
                                                    sub_bb3264(&v65);
                                                    v11 = v10;
                                                    goto LABEL_bb6398;
                                                }
                                            } while ((v299 = v288 + 48 * v296, v296 = v299[9], v300 = arm64g_calculate_condition(1, v299[10], 1, 0), v300 & 1 || (node += 1, v289 <= k)));
                                        }
                                    }
LABEL_bb623c:
                                    v295 = v83->field_20 + v286 * 32;
                                    if (v295->field_0 == 0x8000000000000000)
                                    {
                                        v296 = 0xffffffff;
                                        node = 0;
                                        k = 0xffffffff;
                                        if (v289 <= 0xffffffff)
                                            goto LABEL_bb62f4;
                                        goto LABEL_bb6318;
                                    }
                                    else
                                    {
                                        v296 = v295->field_1c;
                                        node = 0;
                                        k = 0xffffffff;
                                        if (v289 <= 0xffffffff)
                                            goto LABEL_bb62f4;
                                        goto LABEL_bb6318;
                                    }
                                }
                                else
                                {
                                    v292 = v62;
                                    sub_bd8d30(&v24, v83, v281);
                                    if (*(unsigned long long *)&v24)
                                    {
                                        if (*(unsigned int *)((void*)&v24 + 12) == (unsigned int)v286)
                                        {
                                            v24 = v65;
                                            v27 = v66;
                                            v28 = v67;
                                            v29 = v68;
                                            v293 = _malloc(64);
                                            if (v293)
                                            {
                                                *(uint128_t *)v293 = v65;
                                                *(uint128_t *)(v293 + 16) = v66;
                                                *(uint128_t *)(v293 + 32) = v67;
                                                *(uint128_t *)(v293 + 48) = v68;
                                                *(char *)&v76 = 0;
                                                v75 = CONCAT(v293, 8);
                                                v24 = v44;
                                                v27 = v53;
                                                v28 = v56;
                                                v29 = v57;
                                                sub_b94fac((char *)&v19 + 8, &v75, &v24, 14);
                                                v294 = 1;
                                                v77 = v78;
                                                v79 = v80;
                                            }
                                            else
                                            {
                                                sub_c6ba70(8, 64);
                                                goto LABEL_bb7968;
                                            }
                                        }
                                        else
                                        {
                                            v75 = v65;
                                            v76 = v66;
                                            v77 = v67;
                                            v79 = v68;
                                            v24 = v44;
                                            v27 = v53;
                                            v28 = v56;
                                            v29 = v57;
                                            sub_b94fac((char *)&v19 + 8, &v75, &v24, 13);
                                            v294 = 0;
                                        }
                                        *(unsigned long long *)&v19 = 9;
                                        *(unsigned int *)&v23 = v12;
                                        *(unsigned int *)((char *)&v23 + 4) = v281;
                                        *(unsigned int *)((char *)&v23 + 8) = v286;
                                        goto LABEL_bb6568;
                                    }
                                    break;
                                }
                            }
                        }
                        v290 = v288 + 48 * v283;
                        v283 = v290[9];
                        v291 = arm64g_calculate_condition(1, v290[10], 1, 0);
                        if (!(v291 & 1) && !(iter += 1, v289 <= j))
                            goto LABEL_bb620c;
                    }
                }
                else
                {
LABEL_bb6398:
                    v10 = (unsigned int)v11 | sub_bb2220(v83, v12);
                }
            }
        }
    }
    else
    {
        sub_c73c64(&g_ef8fe8);
    }
    sub_c73c64(&g_ef9150);
LABEL_bb7968:
    __debugbreak();
}
