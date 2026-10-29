/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbef304..0xbf1a54 (10064 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bef304_2 {
    char padding_0[8];
    void* field_8;
} st_bef304_2;

typedef struct st_bef304_3 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_bef304_3;

typedef struct st_bef304_0 {
    uint128_t field_0;
    unsigned int field_10;
    char padding_14[28];
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    unsigned int field_a0;
    char padding_a4[4];
    uint128_t field_a8;
    uint128_t field_b8;
} st_bef304_0;

typedef struct st_bef304_1 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
} st_bef304_1;

extern unsigned long long g_be766c;
extern long long g_cba67f;
extern char g_efa478;
extern long long g_efa488;
extern long long g_efb0e8;
extern long long g_efb100;
extern long long g_efb160;
extern long long g_efb178;
extern long long g_efb190;
extern long long g_efb1a8;
extern long long g_efb1c0;
extern long long g_efb1d8;
extern long long g_efb1f0;
extern long long g_efb208;
extern long long g_efb220;
extern long long g_efb238;
extern long long g_efb250;
extern uint128_t g_efc958;
extern uint128_t g_efc968;

long long sub_bef304(st_bef304_0 *a0, st_bef304_1 *a1, unsigned long long a2, unsigned long a3)
{
    unsigned int v42;  // w0
    unsigned int i;  // x13
    unsigned long long v141;  // x12
    unsigned long long v142;  // 4150
    unsigned long long v143;  // 4152
    unsigned int v144;  // x13
    unsigned long long v145;  // x13
    unsigned int v146;  // w0
    unsigned int v147;  // w10
    unsigned long v148;  // x8
    unsigned long long v149;  // 4147
    unsigned int v150;  // x10
    unsigned int v52;  // x10
    unsigned long long v151;  // x27
    char v152;  // x25
    unsigned long long *v153;  // x9
    unsigned long long *v154;  // x8
    __m128i v155;  // q0
    unsigned long long v156;  // x11
    __m128i v157;  // q1
    unsigned long v159;  // x12
    unsigned long long v160;  // x12
    unsigned long long v53;  // x14
    uint128_t v161;  // q1
    unsigned long v164;  // x12
    unsigned long long v165;  // x12
    unsigned long long v166;  // 4150
    unsigned long long v167;  // 4152
    unsigned int v168;  // x13
    unsigned long long v169;  // x13
    unsigned int v170;  // w0
    unsigned long long v54;  // 4145
    unsigned long long *v171;  // x8
    unsigned long long *v172;  // x9
    unsigned long long v173;  // x10
    unsigned long v174;  // d0
    unsigned int i5;  // x12
    unsigned int v176;  // x11
    unsigned long long v178;  // 4137
    unsigned long long v179;  // 4139
    unsigned int v180;  // x11
    unsigned long long v55;  // 4147
    unsigned long long v181;  // x10
    unsigned long v182;  // x11
    unsigned long v184;  // x10
    unsigned long long v185;  // 4138
    unsigned long long v186;  // 4140
    unsigned int v187;  // x10
    unsigned int *v188;  // x8
    unsigned int v190;  // x10
    unsigned int v56;  // x15
    __m128i v191;  // q0
    __m128i v192;  // q1
    unsigned long v194;  // x12
    unsigned long long v195;  // x12
    uint128_t v196;  // q1
    unsigned long v199;  // x12
    unsigned long long v200;  // x12
    unsigned long long v57;  // x15
    unsigned long long v201;  // 4150
    unsigned long long v202;  // 4152
    unsigned int v203;  // x13
    unsigned long long v204;  // x13
    unsigned long v205;  // x8
    unsigned long long v206;  // 4147
    unsigned int v207;  // x10
    unsigned long long v208;  // x27
    char v209;  // x25
    unsigned long long *v210;  // x9
    unsigned long long v58;  // x15
    unsigned long long *v211;  // x8
    __m128i v212;  // q0
    unsigned long long v213;  // x11
    __m128i v214;  // q1
    unsigned long v216;  // x12
    unsigned long long v217;  // x12
    uint128_t v218;  // q1
    unsigned long v221;  // x12
    unsigned long long v222;  // x12
    unsigned long long v223;  // 4150
    unsigned long long v224;  // 4152
    unsigned int v225;  // x13
    unsigned long long v226;  // x13
    unsigned int v227;  // w0
    unsigned long long *v228;  // x8
    unsigned long long *v229;  // x9
    unsigned long long v230;  // x10
    unsigned long long v60;  // 4136
    unsigned long v231;  // d0
    unsigned int i6;  // x12
    unsigned int v233;  // x11
    unsigned long long v235;  // 4137
    unsigned long long v236;  // 4139
    unsigned int v237;  // x11
    unsigned long long v238;  // x10
    unsigned long v239;  // x11
    unsigned int v44;  // x11
    unsigned long long v61;  // 4138
    unsigned long v241;  // x10
    unsigned long long v242;  // 4138
    unsigned long long v243;  // 4140
    unsigned int v244;  // x10
    unsigned int *v245;  // x8
    unsigned int v247;  // x10
    __m128i v248;  // q0
    __m128i v249;  // q1
    unsigned int v62;  // x10
    unsigned long v251;  // x12
    unsigned long long v252;  // x12
    uint128_t v253;  // q1
    unsigned long v256;  // x12
    unsigned long long v257;  // x12
    unsigned long long v258;  // 4150
    unsigned long long v259;  // 4152
    unsigned int v260;  // x13
    uint128_t v63;  // q1
    unsigned long long v261;  // x13
    unsigned long v262;  // x8
    unsigned long long v263;  // 4147
    unsigned int v264;  // x10
    unsigned long v265;  // x25
    unsigned long long v266;  // x28
    char v267;  // x27
    unsigned long long *v268;  // x9
    unsigned long long *v269;  // x8
    __m128i v270;  // q0
    unsigned long long v271;  // x11
    __m128i v272;  // q1
    unsigned long v274;  // x12
    unsigned long long v275;  // x12
    uint128_t v276;  // q1
    unsigned long v279;  // x12
    unsigned long long v280;  // x12
    unsigned long long v281;  // 4150
    unsigned long long v282;  // 4152
    unsigned int v283;  // x13
    unsigned long long v284;  // x13
    unsigned int v285;  // w0
    unsigned long long *v286;  // x8
    unsigned long long *v287;  // x9
    unsigned long long v288;  // x10
    unsigned long v289;  // d0
    unsigned int i4;  // x12
    unsigned long v66;  // x14
    unsigned int v291;  // x11
    unsigned long long v293;  // 4137
    unsigned long long v294;  // 4139
    unsigned int v295;  // x11
    unsigned long long v296;  // x10
    unsigned long v297;  // x11
    unsigned long v299;  // x10
    unsigned long long v300;  // 4138
    unsigned long long v67;  // x9
    unsigned long long v301;  // 4140
    unsigned int v302;  // x10
    void* v303;  // x8
    unsigned int v305;  // x10
    __m128i v306;  // q0
    __m128i v307;  // q1
    unsigned long v309;  // x12
    unsigned long long v310;  // x12
    unsigned long v68;  // x11
    uint128_t v311;  // q1
    unsigned long v314;  // x12
    unsigned long long v315;  // x12
    unsigned long long v316;  // 4150
    unsigned long long v317;  // 4152
    unsigned int v318;  // x13
    unsigned long long v319;  // x13
    unsigned long v320;  // x8
    unsigned long long v321;  // 4147
    unsigned int v322;  // x10
    unsigned long long v323;  // x28
    char v324;  // x27
    unsigned long long *v325;  // x9
    unsigned long long *v326;  // x8
    __m128i v327;  // q0
    unsigned long long v328;  // x11
    __m128i v329;  // q1
    unsigned long v70;  // x10
    unsigned long v331;  // x12
    unsigned long long v332;  // x12
    uint128_t v333;  // q1
    unsigned long v336;  // x12
    unsigned long long v337;  // x12
    unsigned long long v338;  // 4150
    unsigned long long v339;  // 4152
    unsigned int v340;  // x13
    unsigned long long *v45;  // x8
    unsigned long long v71;  // 4138
    unsigned long long v341;  // x13
    unsigned int v342;  // w0
    unsigned long long *v343;  // x8
    unsigned long long *v344;  // x9
    unsigned long long v345;  // x10
    unsigned long v346;  // d0
    unsigned int i7;  // x12
    unsigned int v348;  // x11
    unsigned long long v350;  // 4137
    unsigned long long v72;  // 4140
    unsigned long long v351;  // 4139
    unsigned int v352;  // x11
    unsigned long long v353;  // x10
    unsigned long v354;  // x11
    unsigned long v356;  // x10
    unsigned long long v357;  // 4138
    unsigned long long v358;  // 4140
    unsigned int v359;  // x10
    void* v360;  // x8
    unsigned int v73;  // x10
    unsigned int v362;  // x10
    unsigned long long v363;  // x27
    char v364;  // x25
    __m128i v365;  // q0
    unsigned long long v366;  // x11
    __m128i v367;  // q1
    unsigned long v369;  // x12
    unsigned long long v370;  // x12
    uint128_t v371;  // q1
    unsigned long v374;  // x12
    unsigned long long v375;  // x12
    unsigned long long v376;  // 4150
    unsigned long long v377;  // 4152
    unsigned int v378;  // x13
    unsigned long long v379;  // x13
    unsigned int v380;  // w0
    st_bef304_1 *v75;  // x8
    unsigned long long *v381;  // x8
    unsigned long long *v382;  // x9
    unsigned long long v383;  // x10
    unsigned long v384;  // d0
    unsigned int i9;  // x12
    unsigned int v386;  // x11
    unsigned long long v388;  // 4137
    unsigned long long v389;  // 4139
    unsigned int v390;  // x11
    long long v76;  // x0
    unsigned long long v391;  // x10
    unsigned long v392;  // x11
    unsigned long v394;  // x10
    unsigned long long v395;  // 4138
    unsigned long long v396;  // 4140
    unsigned int v397;  // x10
    unsigned int *v398;  // x8
    unsigned int v400;  // x10
    st_bef304_2 *v77;  // x8
    __m128i v401;  // q0
    __m128i v402;  // q1
    unsigned long v404;  // x12
    unsigned long long v405;  // x12
    uint128_t v406;  // q1
    unsigned long v409;  // x12
    unsigned long long v410;  // x12
    unsigned int v78;  // x9
    unsigned long long v411;  // 4150
    unsigned long long v412;  // 4152
    unsigned int v413;  // x13
    unsigned long long v414;  // x13
    unsigned long v415;  // x8
    unsigned long long v416;  // 4147
    unsigned int v417;  // x10
    unsigned long long v418;  // x27
    char v419;  // x25
    unsigned long long *v420;  // x9
    unsigned int v79;  // x19
    unsigned long long *v421;  // x8
    __m128i v422;  // q0
    unsigned long long v423;  // x11
    __m128i v424;  // q1
    unsigned long v426;  // x12
    unsigned long long v427;  // x12
    uint128_t v428;  // q1
    void* v80;  // x8
    unsigned long v431;  // x12
    unsigned long long v432;  // x12
    unsigned long long v433;  // 4150
    unsigned long long v434;  // 4152
    unsigned int v435;  // x13
    unsigned long long v436;  // x13
    unsigned int v437;  // w0
    unsigned long long *v438;  // x8
    unsigned long long *v439;  // x9
    unsigned long long v440;  // x10
    unsigned long long *v46;  // x9
    long long v81;  // x20
    unsigned long v441;  // d0
    unsigned int i8;  // x12
    unsigned int v443;  // x11
    unsigned long long v445;  // 4137
    unsigned long long v446;  // 4139
    unsigned int v447;  // x11
    unsigned long long v448;  // x10
    unsigned long v449;  // x11
    void* v82;  // x24
    unsigned long v451;  // x10
    unsigned long long v452;  // 4138
    unsigned long long v453;  // 4140
    unsigned int v454;  // x10
    unsigned int *v455;  // x8
    unsigned int v457;  // x10
    __m128i v458;  // q0
    __m128i v459;  // q1
    void* v83;  // x8
    unsigned long v461;  // x12
    unsigned long long v462;  // x12
    uint128_t v463;  // q1
    unsigned long v466;  // x12
    unsigned long long v467;  // x12
    unsigned long long v468;  // 4150
    unsigned long long v469;  // 4152
    unsigned int v470;  // x13
    unsigned long v84;  // x25
    unsigned long long v471;  // x13
    unsigned long v472;  // x8
    unsigned long long v473;  // 4147
    unsigned int v474;  // x10
    unsigned long long v475;  // x27
    char v476;  // x25
    unsigned long long *v477;  // x9
    unsigned long long *v478;  // x8
    __m128i v479;  // q0
    unsigned long long v480;  // x11
    unsigned int v85;  // w9
    __m128i v481;  // q1
    unsigned long v483;  // x12
    unsigned long long v484;  // x12
    uint128_t v485;  // q1
    unsigned long v488;  // x12
    unsigned long long v489;  // x12
    unsigned long long v490;  // 4150
    int v86;  // w9
    unsigned long long v491;  // 4152
    unsigned int v492;  // x13
    unsigned long long v493;  // x13
    unsigned int v494;  // w0
    unsigned long long *v495;  // x8
    unsigned long long *v496;  // x9
    unsigned long long v497;  // x10
    unsigned long v498;  // d0
    unsigned int i3;  // x12
    unsigned int v500;  // x11
    unsigned long v87;  // x8
    unsigned long long v502;  // 4137
    unsigned long long v503;  // 4139
    unsigned int v504;  // x11
    unsigned long long v505;  // x10
    unsigned long v506;  // x11
    unsigned long v508;  // x10
    unsigned long long v509;  // 4138
    unsigned long long v510;  // 4140
    unsigned long long v88;  // 4147
    unsigned int v511;  // x10
    unsigned int *v512;  // x8
    unsigned int v514;  // x10
    unsigned long long v515;  // x11
    __m128i v516;  // q1
    unsigned long v518;  // x12
    unsigned long long v519;  // x12
    unsigned long long v520;  // x12
    unsigned long v89;  // x22
    unsigned long long v521;  // 4150
    unsigned long long v522;  // 4152
    unsigned int v523;  // x13
    unsigned long long v524;  // x13
    uint128_t v525;  // q1
    unsigned int v527;  // x9
    unsigned int v528;  // x8
    unsigned long long *v529;  // x10
    unsigned long long *v530;  // x9
    unsigned int v90;  // x10
    __m128i v531;  // q0
    __m128i v532;  // q1
    unsigned long v534;  // x12
    unsigned long long v535;  // x12
    uint128_t v536;  // q1
    unsigned long v539;  // x12
    unsigned long long v540;  // x12
    unsigned long long v47;  // x12
    unsigned long long v91;  // x27
    unsigned long long v541;  // 4150
    unsigned long long v542;  // 4152
    unsigned int v543;  // x13
    unsigned long long v544;  // x13
    unsigned long long *v545;  // x8
    unsigned long long *v546;  // x9
    unsigned long long v547;  // x10
    unsigned long v548;  // d0
    unsigned int n;  // x12
    unsigned int v550;  // x11
    char v92;  // x25
    unsigned long long v552;  // 4137
    unsigned long long v553;  // 4139
    unsigned int v554;  // x11
    unsigned long long v555;  // x10
    unsigned long v557;  // x10
    unsigned long long v558;  // 4138
    unsigned long long v559;  // 4140
    unsigned int v560;  // x10
    unsigned long long *v93;  // x9
    char v561;  // x12
    void* v562;  // x8
    unsigned int v564;  // x21
    unsigned long long *node;  // x19
    unsigned long long *v566;  // x22
    unsigned long v567;  // d0
    unsigned long v568;  // x8
    unsigned int j;  // x24
    unsigned long long *v570;  // x22
    unsigned long long *v94;  // x8
    unsigned int v572;  // x0
    unsigned int v573;  // x23
    unsigned long long v574;  // 4134
    unsigned long long v575;  // x8
    unsigned long long v576;  // x25
    unsigned long long v577;  // x20
    unsigned long long v578;  // 4142
    unsigned long long v579;  // 4144
    unsigned int v580;  // x8
    __m128i v95;  // q0
    unsigned int ptr;  // x0
    unsigned int i1;  // x24
    unsigned int idx;  // x20
    unsigned long long *v584;  // x22
    unsigned long long v586;  // 4151
    unsigned long long v587;  // 4153
    unsigned int v588;  // x8
    unsigned long long v589;  // 4116
    unsigned int v590;  // x28
    unsigned long long v96;  // x11
    unsigned int v591;  // x8
    unsigned long iter;  // x10
    unsigned int v593;  // x12
    unsigned int iter1;  // x13
    unsigned int *v595;  // x14
    unsigned int *v596;  // x12
    st_bef304_1 *v597;  // x8
    long long v598;  // x0
    long long v599;  // x1
    unsigned int v600;  // x22
    __m128i v97;  // q1
    unsigned int v601;  // x20
    unsigned int v602;  // x19
    unsigned long v603;  // x23
    unsigned long long k;  // x24
    unsigned int v605;  // x21
    unsigned int v606;  // x24
    unsigned int v607;  // x25
    st_bef304_3 *v608;  // x9
    unsigned int l;  // w23
    unsigned int v610;  // w25
    unsigned int ptr1;  // x0
    unsigned int v612;  // x23
    unsigned int v613;  // x25
    unsigned long long v614;  // x26
    unsigned int ptr2;  // x0
    unsigned long long v616;  // x22
    unsigned long long *v617;  // x27
    unsigned int i2;  // x13
    unsigned int v619;  // x12
    unsigned long long v620;  // x14
    unsigned long v99;  // x12
    unsigned long long *v621;  // x8
    unsigned long long *v622;  // x10
    char v623;  // x9
    __m128i v624;  // q0
    unsigned long long v625;  // x14
    __m128i v626;  // q1
    unsigned long v628;  // x15
    unsigned long long v629;  // x15
    unsigned long long v630;  // x15
    unsigned long long v100;  // x12
    unsigned long long v631;  // 4150
    unsigned long long v632;  // 4152
    unsigned int v633;  // x16
    unsigned long long *v634;  // x16
    unsigned long long v637;  // 4136
    unsigned long long v638;  // 4138
    unsigned int v639;  // x11
    uint128_t v640;  // q1
    __m128i v48;  // q1
    uint128_t v101;  // q1
    unsigned long v643;  // x15
    unsigned long long v644;  // 4102
    unsigned long v645;  // x12
    unsigned long v647;  // x11
    unsigned long long v648;  // 4138
    unsigned long long v649;  // 4140
    unsigned int v650;  // x11
    unsigned long long *v652;  // x8
    unsigned long long *v653;  // x9
    unsigned int v654;  // x8
    unsigned long long v655;  // x11
    unsigned long long *v656;  // x10
    unsigned long long *v657;  // x9
    __m128i v658;  // q0
    unsigned long long v659;  // x11
    __m128i v660;  // q1
    unsigned long v662;  // x12
    unsigned long long v663;  // x12
    __m128i v664;  // q1
    unsigned long v667;  // x12
    unsigned long long v668;  // x12
    unsigned long long v669;  // 4150
    unsigned long long v670;  // 4152
    unsigned long v104;  // x12
    unsigned int v671;  // x13
    void* v672;  // x13
    unsigned long long v673;  // x13
    long long v674;  // x23
    unsigned long long *v675;  // x8
    unsigned long long *v676;  // x27
    unsigned long long n;  // x28
    unsigned long v678;  // x19
    unsigned int v679;  // x22
    unsigned int v680;  // x22
    unsigned long long v105;  // x12
    unsigned long long v681;  // x21
    unsigned int v682;  // x0
    unsigned int *v683;  // x22
    unsigned int v684;  // x8
    unsigned long long *v685;  // x10
    unsigned long long *v686;  // x9
    unsigned long long v687;  // x11
    __m128i v688;  // q1
    unsigned long v690;  // x12
    unsigned long long v106;  // 4150
    unsigned long long v691;  // x12
    __m128i v692;  // q1
    unsigned long v695;  // x12
    unsigned long long v696;  // x12
    unsigned long long v697;  // 4145
    unsigned long long v698;  // 4147
    unsigned int v699;  // x13
    unsigned int *v700;  // x13
    unsigned long long v107;  // 4152
    unsigned long long v701;  // x13
    long long v702;  // x22
    long long v703;  // x0
    unsigned int v704;  // x20
    unsigned int v705;  // x20
    unsigned long long *v706;  // x8
    unsigned long long *v707;  // x9
    unsigned long long v708;  // x8
    unsigned long long v709;  // 4112
    unsigned long long *v710;  // x19
    unsigned int v108;  // x13
    unsigned int i10;  // x20
    unsigned long long *v712;  // x21
    unsigned long long *v713;  // x22
    unsigned int i12;  // x23
    unsigned long long *v716;  // x22
    unsigned long long v718;  // 4148
    unsigned long long v719;  // 4150
    unsigned int v720;  // x9
    unsigned long long v109;  // x13
    unsigned long long v721;  // 4102
    unsigned long long v722;  // x8
    unsigned long long v723;  // 4112
    unsigned long long *v724;  // x19
    unsigned int i11;  // x20
    unsigned long long *v726;  // x21
    unsigned long long *v727;  // x22
    unsigned int i13;  // x23
    unsigned long long *v730;  // x22
    unsigned int v110;  // w0
    unsigned long long v732;  // 4142
    unsigned long long v733;  // 4144
    unsigned int v734;  // x8
    long long *v735;  // x8
    unsigned long long v736;  // x8
    unsigned long long v737;  // 4112
    unsigned long long *v111;  // x8
    unsigned long long *v112;  // x9
    unsigned long long v113;  // x10
    unsigned long v114;  // d0
    unsigned int i0;  // x12
    unsigned int v116;  // x11
    unsigned long long v118;  // 4137
    unsigned long long v119;  // 4139
    unsigned int v120;  // x11
    unsigned long v50;  // x14
    unsigned long long v121;  // x10
    unsigned long v122;  // x11
    unsigned long v124;  // x10
    unsigned long long v125;  // 4138
    unsigned long long v126;  // 4140
    unsigned int v127;  // x10
    unsigned int *v128;  // x8
    unsigned int v130;  // x10
    unsigned long long v51;  // x14
    unsigned long long v131;  // x25
    __m128i v132;  // q0
    __m128i v133;  // q1
    unsigned long v135;  // x12
    unsigned long long v136;  // x12
    uint128_t v137;  // q1
    unsigned long v140;  // x12
    long long v0;  // [bp-0x230]
    unsigned long long *v1;  // [bp-0x228]
    unsigned int v2;  // [bp-0x220]
    unsigned long long *m;  // [bp-0x210]
    unsigned int v4;  // [bp-0x204]
    unsigned long long v5;  // [bp-0x200], Other Possible Types: unsigned int
    uint128_t v6;  // [bp-0x1f0]
    unsigned int v7;  // [bp-0x1e0]
    unsigned int v8;  // [bp-0x1d0]
    uint128_t v9;  // [bp-0x1c0]
    uint128_t v10;  // [bp-0x1b0]
    uint128_t v11;  // [bp-0x1a0]
    uint128_t v12;  // [bp-0x190]
    uint128_t v13;  // [bp-0x180]
    unsigned int v14;  // [bp-0x178]
    uint128_t v15;  // [bp-0x170]
    uint128_t v16;  // [bp-0x160]
    unsigned int index;  // [bp-0x150]
    unsigned int v18;  // [bp-0x148]
    unsigned int v19;  // [bp-0x144]
    unsigned long long v20;  // [bp-0x138]
    uint128_t v21;  // [bp-0x130]
    __m128i v22;  // [bp-0x120]
    uint128_t v23;  // [bp-0x110]
    uint128_t v24;  // [bp-0x100]
    uint128_t v25;  // [bp-0xf0]
    __m128i v26;  // [bp-0xe0]
    uint128_t v27;  // [bp-0xd0]
    uint128_t v28;  // [bp-0xc0]
    unsigned long v29;  // [bp-0xb0], Other Possible Types: unsigned int
    long long v30;  // [bp-0xb0]
    unsigned int *v31;  // [bp-0xa8], Other Possible Types: long long, unsigned int, unsigned long long
    unsigned long long v32;  // [bp-0xa0], Other Possible Types: unsigned int
    long long v33;  // [bp-0x98]
    unsigned long long v34;  // [bp-0x98]
    unsigned long long v35;  // [bp-0x90]
    unsigned int v36;  // [bp-0x88]
    char v37;  // [bp-0x80]
    long long v38;  // [bp-0x78]
    unsigned int v39;  // [bp-0x70]
    char *v40;  // [bp-0x10]
    char v41;  // [bp+0x0]

    v40 = &v41;
    v20 = a2;
    v21 = g_efc958;
    v22 = g_efc968;
    v6 = CONCAT(8, 0);
    v7 = 0;
    v8 = 8;
    v9 = CONCAT(8, 0);
    *(unsigned long long *)((char *)&v10 + 8) = 0;
    *(unsigned long long *)&v11 = 0;
    *(unsigned long long *)&v10 = 0;
    *(unsigned long long *)((char *)&v11 + 8) = 0xffffffffffffffff;
    *(unsigned long long *)&v12 = 0x8000000000000000;
    v14 = 0;
    *(unsigned long *)&v15 = a3;
    *((char *)&v15 + 8) = 0;
    v23 = g_efc958;
    v24 = g_efc968;
    v25 = g_efc958;
    v26 = g_efc968;
    v27 = g_efc958;
    v28 = g_efc968;
    v18 = 0;
    v16 = CONCAT(8, 0);
    index = 0;
    v42 = sub_bd8f3c(&v6);
    if (!_mm_cvtsi128_si64(v22))
        sub_c74750(&v21, &v23);
    i = 0;
    v44 = 0;
    v45 = *(unsigned long long *)&v21;
    v46 = *(unsigned long long *)((void*)&v21 + 8);
    v47 = 0 & v46;
    v48 = *(long long *)((char *)v45 + v47);
    v50 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v48, _mm_setzero_si128()));
    v51 = v50 & 0x8080808080808080;
    if (!(v50 & 0x8080808080808080))
        goto LABEL_bef3f4;
    do
    {
        v52 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v48));
        if (v52)
        {
            v60 = ((((((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v61 = (((((((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v62 = ((((v61 | v60) & 0xffff0000ffff0000) >> 16 | (v61 | v60) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v61 | v60) & 0xffff0000ffff0000) >> 16 | (v61 | v60) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            v52 = v47 + ((!v62 ? 64 : Clz(v62)) >> 3) & v46;
            break;
        }
        i = 0;
LABEL_bef434:
        v44 += 8;
        v47 = v44 + v47 & v46;
        v48 = *(long long *)((char *)v45 + v47);
        v66 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v48, _mm_setzero_si128()));
        v51 = v66 & 0x8080808080808080;
        if (v66 & 0x8080808080808080)
        {
            do
            {
                v53 = v51;
                v54 = ((((((v53 & 0xaaaaaaaaaaaaaaaa) >> 1 | v53 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v53 & 0xaaaaaaaaaaaaaaaa) >> 1 | v53 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v53 & 0xaaaaaaaaaaaaaaaa) >> 1 | v53 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v53 & 0xaaaaaaaaaaaaaaaa) >> 1 | v53 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v55 = (((((((v53 & 0xaaaaaaaaaaaaaaaa) >> 1 | v53 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v53 & 0xaaaaaaaaaaaaaaaa) >> 1 | v53 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v53 & 0xaaaaaaaaaaaaaaaa) >> 1 | v53 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v53 & 0xaaaaaaaaaaaaaaaa) >> 1 | v53 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v56 = ((((v55 | v54) & 0xffff0000ffff0000) >> 16 | (v55 | v54) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v55 | v54) & 0xffff0000ffff0000) >> 16 | (v55 | v54) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                v57 = v47 + ((!v56 ? 64 : Clz(v56)) >> 3) & v46;
                if (!*(long long *)((char *)&v45[-2 * v57] - 16))
                {
                    v67 = -v57;
                    goto LABEL_bef4a0;
                }
            } while ((v58 = v53 - 1, v51 = v58 & v53, v58 & v53));
        }
LABEL_bef3f4:
    } while (i != 1);
    v63 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v48, _mm_set1_epi8(-1)));
    if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v63, v63), _mm_unpacklo_epi64(v63, v63)))))))))) & 1))
    {
        i = 1;
        goto LABEL_bef434;
    }
    else
    {
        v68 = *((char *)v45 + v52);
        if (!(v68 >> 31 & 1))
        {
            v70 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v45));
            v71 = ((((((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v72 = (((((((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v73 = ((((v72 | v71) & 0xffff0000ffff0000) >> 16 | (v72 | v71) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v72 | v71) & 0xffff0000ffff0000) >> 16 | (v72 | v71) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            v52 = (!v73 ? 64 : Clz(v73)) >> 3;
            v68 = *((char *)v45 + v52);
        }
        v44 = v68 & 1;
        *((char *)v45 + v52) = 0;
        *((char *)v45 + (v46 & v52 - 8) + 8) = 0;
        v22 = _mm_sub_epi64(v22, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v44)));
        v67 = -v52;
        *(unsigned long long *)((char *)&v45[-2 * v52] - 16) = 0;
    }
LABEL_bef4a0:
    *(unsigned int *)((char *)&v45[2 * v67] - 8) = v42;
    v75 = a1;
    v76 = *(unsigned long long *)&v15;
    if ((unsigned long long)v75->field_10 > (unsigned long long)v76)
    {
        v77 = v75->field_8 + 144 * v76;
        v78 = (unsigned int)v77[1].padding_0;
        if (v77[1].padding_0)
        {
            v79 = 0;
            v80 = v77->field_8;
            v81 = &g_efb1c0;
            v82 = v80;
            v83 = v80;
            while (1)
            {
                v84 = v79;
                v85 = *(char *)v82;
                v82 += 12;
                v79 += 1;
                if (!v85)
                {
                    if ((char)v83[4] != 3 || !(v527 = (char)v83[3], v527))
                        goto LABEL_bf0544;
                    v528 = 0;
                    v89 = v79 + v527;
                    v131 = 5871781006564002453 * v89;
                    v529 = *(unsigned long long *)&v21;
                    v530 = *(unsigned long long *)((void*)&v21 + 8);
                    v531 = v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                    v44 = v131 & v530;
                    v532 = *(long long *)((char *)v529 + v44);
                    v534 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v532, v531));
                    v535 = v534 & 0x8080808080808080;
                    if (v534 & 0x8080808080808080)
                    {
                        do
                        {
LABEL_bef6dc:
                            v540 = v535;
                            v541 = ((((((v540 & 0xaaaaaaaaaaaaaaaa) >> 1 | v540 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v540 & 0xaaaaaaaaaaaaaaaa) >> 1 | v540 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v540 & 0xaaaaaaaaaaaaaaaa) >> 1 | v540 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v540 & 0xaaaaaaaaaaaaaaaa) >> 1 | v540 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v542 = (((((((v540 & 0xaaaaaaaaaaaaaaaa) >> 1 | v540 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v540 & 0xaaaaaaaaaaaaaaaa) >> 1 | v540 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v540 & 0xaaaaaaaaaaaaaaaa) >> 1 | v540 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v540 & 0xaaaaaaaaaaaaaaaa) >> 1 | v540 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v543 = ((((v542 | v541) & 0xffff0000ffff0000) >> 16 | (v542 | v541) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v542 | v541) & 0xffff0000ffff0000) >> 16 | (v542 | v541) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (*(long long *)((char *)&v529[-2 * (v44 + ((!v543 ? 64 : Clz(v543)) >> 3) & v530)] - 16) == v89)
                                goto LABEL_bf0544;
                        } while ((v544 = v540 - 1, v535 = v544 & v540, v544 & v540));
                    }
                    do
                    {
                        v536 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v532, _mm_set1_epi8(-1)));
                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v536, v536), _mm_unpacklo_epi64(v536, v536)))))))))) & 1)
                        {
                            if (!_mm_cvtsi128_si64(v22))
                                sub_c74750(&v21, &v23);
                            v146 = sub_bd8f3c(&v6);
                            goto LABEL_bf04d8;
                        }
                        v528 += 8;
                        v44 = v44 + v528 & v530;
                        v532 = *(long long *)((char *)v529 + v44);
                        v539 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v532, v531));
                        v535 = v539 & 0x8080808080808080;
                    } while (!(v539 & 0x8080808080808080));
                    goto LABEL_bef6dc;
                }
                if (v85 != 1)
                {
                    if ((char)v83[1] != 67)
                        goto LABEL_bf0544;
                    v472 = (int)v83[4];
                    v473 = arm64g_calculate_condition(84, v472, 0, 0);
                    v89 = v79 + v472;
                    if (!(!(v473 & 1) ^ v84 >= v89))
                    {
                        v474 = 0;
                        v475 = 5871781006564002453 * v79;
                        v476 = v475 >> 57;
                        v477 = *(unsigned long long *)&v21;
                        v478 = *(unsigned long long *)((void*)&v21 + 8);
                        v479 = v476 | v476 * 0x100 | (v476 | v476 * 0x100) * 0x10000 | (v476 | v476 * 0x100 | (v476 | v476 * 0x100) * 0x10000) * 0x100000000;
                        v480 = v475 & v478;
                        v481 = *(long long *)((char *)v477 + v480);
                        v483 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v481, v479));
                        v484 = v483 & 0x8080808080808080;
                        if (!(v483 & 0x8080808080808080))
                        {
                            do
                            {
LABEL_bef7d4:
                                v485 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v481, _mm_set1_epi8(-1)));
                                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v485, v485), _mm_unpacklo_epi64(v485, v485)))))))))) & 1)
                                {
                                    if (!_mm_cvtsi128_si64(v22))
                                        sub_c74750(&v21, &v23);
                                    v494 = sub_bd8f3c(&v6);
                                    v495 = *(unsigned long long *)&v21;
                                    v496 = *(unsigned long long *)((void*)&v21 + 8);
                                    v497 = v496 & v475;
                                    v498 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v495 + v497)));
                                    i3 = __double_as_longlong(v498);
                                    if (!i3)
                                    {
                                        v500 = 8;
                                        do
                                        {
                                            v497 = v497 + v500 & v496;
                                            i3 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v495 + v497)));
                                            v500 += 8;
                                        } while (!i3);
                                    }
                                    v502 = ((((((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v503 = (((((((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i3 & 0xaaaaaaaaaaaaaaaa) >> 1 | i3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v504 = ((((v503 | v502) & 0xffff0000ffff0000) >> 16 | (v503 | v502) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v503 | v502) & 0xffff0000ffff0000) >> 16 | (v503 | v502) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v505 = v497 + ((!v504 ? 64 : Clz(v504)) >> 3) & v496;
                                    v506 = *((char *)v495 + v505);
                                    if (!(v506 >> 31 & 1))
                                    {
                                        v508 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v495));
                                        v509 = ((((((v508 & 0xaaaaaaaaaaaaaaaa) >> 1 | v508 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v508 & 0xaaaaaaaaaaaaaaaa) >> 1 | v508 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v508 & 0xaaaaaaaaaaaaaaaa) >> 1 | v508 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v508 & 0xaaaaaaaaaaaaaaaa) >> 1 | v508 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v510 = (((((((v508 & 0xaaaaaaaaaaaaaaaa) >> 1 | v508 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v508 & 0xaaaaaaaaaaaaaaaa) >> 1 | v508 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v508 & 0xaaaaaaaaaaaaaaaa) >> 1 | v508 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v508 & 0xaaaaaaaaaaaaaaaa) >> 1 | v508 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v511 = ((((v510 | v509) & 0xffff0000ffff0000) >> 16 | (v510 | v509) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v510 | v509) & 0xffff0000ffff0000) >> 16 | (v510 | v509) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        v505 = (!v511 ? 64 : Clz(v511)) >> 3;
                                        v506 = *((char *)v495 + v505);
                                    }
                                    *((char *)v495 + v505) = v476;
                                    *((char *)v495 + (v505 - 8 & v496) + 8) = v476;
                                    v512 = &v495[-2 * v505];
                                    *(unsigned long long *)((char *)v512 - 16) = v79;
                                    *(unsigned int *)((char *)v512 - 8) = v494;
                                    v22 = _mm_sub_epi64(v22, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v506 & 1)));
                                    v477 = *(unsigned long long *)&v21;
                                    v478 = *(unsigned long long *)((void*)&v21 + 8);
                                    goto LABEL_befa2c;
                                }
                                v474 += 8;
                                v480 = v480 + v474 & v478;
                                v481 = *(long long *)((char *)v477 + v480);
                                v488 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v481, v479));
                                v484 = v488 & 0x8080808080808080;
                            } while (!(v488 & 0x8080808080808080));
                        }
                        while (1)
                        {
                            v489 = v484;
                            v490 = ((((((v489 & 0xaaaaaaaaaaaaaaaa) >> 1 | v489 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v489 & 0xaaaaaaaaaaaaaaaa) >> 1 | v489 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v489 & 0xaaaaaaaaaaaaaaaa) >> 1 | v489 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v489 & 0xaaaaaaaaaaaaaaaa) >> 1 | v489 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v491 = (((((((v489 & 0xaaaaaaaaaaaaaaaa) >> 1 | v489 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v489 & 0xaaaaaaaaaaaaaaaa) >> 1 | v489 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v489 & 0xaaaaaaaaaaaaaaaa) >> 1 | v489 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v489 & 0xaaaaaaaaaaaaaaaa) >> 1 | v489 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v492 = ((((v491 | v490) & 0xffff0000ffff0000) >> 16 | (v491 | v490) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v491 | v490) & 0xffff0000ffff0000) >> 16 | (v491 | v490) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (*(long long *)((char *)&v477[-2 * (v480 + ((!v492 ? 64 : Clz(v492)) >> 3) & v478)] - 16) == v79)
                            {
LABEL_befa2c:
                                v514 = 0;
                                v131 = 5871781006564002453 * v89;
                                v515 = v131;
                                break;
                            }
                            v493 = v489 - 1;
                            v484 = v493 & v489;
                            if (!(v493 & v489))
                                goto LABEL_bef7d4;
                        }
                        while (1)
                        {
                            v44 = v515 & v478;
                            v516 = *(long long *)((char *)v477 + v44);
                            v518 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v516, (uint128_t)(v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                            v519 = v518 & 0x8080808080808080;
                            if (v518 & 0x8080808080808080)
                            {
                                do
                                {
                                    v520 = v519;
                                    v521 = ((((((v520 & 0xaaaaaaaaaaaaaaaa) >> 1 | v520 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v520 & 0xaaaaaaaaaaaaaaaa) >> 1 | v520 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v520 & 0xaaaaaaaaaaaaaaaa) >> 1 | v520 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v520 & 0xaaaaaaaaaaaaaaaa) >> 1 | v520 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v522 = (((((((v520 & 0xaaaaaaaaaaaaaaaa) >> 1 | v520 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v520 & 0xaaaaaaaaaaaaaaaa) >> 1 | v520 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v520 & 0xaaaaaaaaaaaaaaaa) >> 1 | v520 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v520 & 0xaaaaaaaaaaaaaaaa) >> 1 | v520 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v523 = ((((v522 | v521) & 0xffff0000ffff0000) >> 16 | (v522 | v521) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v522 | v521) & 0xffff0000ffff0000) >> 16 | (v522 | v521) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (*(long long *)((char *)&v477[-2 * (v44 + ((!v523 ? 64 : Clz(v523)) >> 3) & v478)] - 16) == v89)
                                        goto LABEL_bf0544;
                                } while ((v524 = v520 - 1, v519 = v524 & v520, v524 & v520));
                            }
                            v525 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v516, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v525, v525), _mm_unpacklo_epi64(v525, v525)))))))))) & 1)
                                break;
                            v514 += 8;
                            v515 = v44 + v514;
                        }
                        if (!_mm_cvtsi128_si64(v22))
                            sub_c74750(&v21, &v23);
                        v146 = sub_bd8f3c(&v6);
LABEL_bf04d8:
                        v545 = *(unsigned long long *)&v21;
                        v546 = *(unsigned long long *)((void*)&v21 + 8);
                        v547 = v546 & v131;
                        v548 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v545 + v547)));
                        n = __double_as_longlong(v548);
                        if (!n)
                        {
                            v550 = 8;
                            do
                            {
                                v547 = v547 + v550 & v546;
                                n = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v545 + v547)));
                                v550 += 8;
                            } while (!n);
                        }
                        v552 = ((((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v553 = (((((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v554 = ((((v553 | v552) & 0xffff0000ffff0000) >> 16 | (v553 | v552) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v553 | v552) & 0xffff0000ffff0000) >> 16 | (v553 | v552) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        v555 = v547 + ((!v554 ? 64 : Clz(v554)) >> 3) & v546;
                        v44 = *((char *)v545 + v555);
                        if (!(v44 >> 31 & 1))
                        {
                            v557 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v545));
                            v558 = ((((((v557 & 0xaaaaaaaaaaaaaaaa) >> 1 | v557 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v557 & 0xaaaaaaaaaaaaaaaa) >> 1 | v557 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v557 & 0xaaaaaaaaaaaaaaaa) >> 1 | v557 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v557 & 0xaaaaaaaaaaaaaaaa) >> 1 | v557 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v559 = (((((((v557 & 0xaaaaaaaaaaaaaaaa) >> 1 | v557 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v557 & 0xaaaaaaaaaaaaaaaa) >> 1 | v557 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v557 & 0xaaaaaaaaaaaaaaaa) >> 1 | v557 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v557 & 0xaaaaaaaaaaaaaaaa) >> 1 | v557 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v560 = ((((v559 | v558) & 0xffff0000ffff0000) >> 16 | (v559 | v558) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v559 | v558) & 0xffff0000ffff0000) >> 16 | (v559 | v558) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            v555 = (!v560 ? 64 : Clz(v560)) >> 3;
                            v44 = *((char *)v545 + v555);
                        }
                        v561 = v131 >> 57;
                        *((char *)v545 + v555) = v561;
                        *((char *)v545 + (v555 - 8 & v546) + 8) = v561;
                        v562 = &v545[-2 * v555];
                        *(unsigned long *)((char *)v562 - 16) = v89;
                        *(unsigned int *)((char *)v562 - 8) = v146;
                        v22 = _mm_sub_epi64(v22, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v44 & 1)));
                        goto LABEL_bf0544;
                    }
                    goto LABEL_bf1378;
                }
                v86 = (char)v83[2];
                if (55 >= v86)
                    break;
                v147 = v86 - 58;
                if (22 >= v147)
                {
                    v44 = 1 << ((char)v147 & 31);
                    if (v44 & 0x780000)
                    {
LABEL_bef8ec:
                        v262 = (short)v83[4];
                        v263 = arm64g_calculate_condition(84, v262, 0, 0);
                        v89 = v79 + v262;
                        if (!(v263 & 1) ^ v84 >= v89)
                        {
                            v81 = &g_efb238;
                            goto LABEL_bf144c;
                        }
                        v264 = 0;
                        v265 = v84 + 2;
                        v266 = 5871781006564002453 * v265;
                        v267 = v266 >> 57;
                        v268 = *(unsigned long long *)&v21;
                        v269 = *(unsigned long long *)((void*)&v21 + 8);
                        v270 = v267 | v267 * 0x100 | (v267 | v267 * 0x100) * 0x10000 | (v267 | v267 * 0x100 | (v267 | v267 * 0x100) * 0x10000) * 0x100000000;
                        v271 = v266 & v269;
                        v272 = *(long long *)((char *)v268 + v271);
                        v274 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v272, v270));
                        v275 = v274 & 0x8080808080808080;
                        if (v274 & 0x8080808080808080)
                        {
                            do
                            {
LABEL_bef94c:
                                v280 = v275;
                                v281 = ((((((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v282 = (((((((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v280 & 0xaaaaaaaaaaaaaaaa) >> 1 | v280 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v283 = ((((v282 | v281) & 0xffff0000ffff0000) >> 16 | (v282 | v281) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v282 | v281) & 0xffff0000ffff0000) >> 16 | (v282 | v281) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (*(long long *)((char *)&v268[-2 * (v271 + ((!v283 ? 64 : Clz(v283)) >> 3) & v269)] - 16) == v265)
                                {
LABEL_befad0:
                                    v305 = 0;
                                    v131 = 5871781006564002453 * v89;
                                    v306 = v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                    v44 = v131 & v269;
                                    v307 = *(long long *)((char *)v268 + v44);
                                    v309 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v307, v306));
                                    v310 = v309 & 0x8080808080808080;
                                    if (v309 & 0x8080808080808080)
                                    {
                                        do
                                        {
LABEL_befb08:
                                            v315 = v310;
                                            v316 = ((((((v315 & 0xaaaaaaaaaaaaaaaa) >> 1 | v315 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v315 & 0xaaaaaaaaaaaaaaaa) >> 1 | v315 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v315 & 0xaaaaaaaaaaaaaaaa) >> 1 | v315 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v315 & 0xaaaaaaaaaaaaaaaa) >> 1 | v315 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v317 = (((((((v315 & 0xaaaaaaaaaaaaaaaa) >> 1 | v315 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v315 & 0xaaaaaaaaaaaaaaaa) >> 1 | v315 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v315 & 0xaaaaaaaaaaaaaaaa) >> 1 | v315 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v315 & 0xaaaaaaaaaaaaaaaa) >> 1 | v315 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v318 = ((((v317 | v316) & 0xffff0000ffff0000) >> 16 | (v317 | v316) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v317 | v316) & 0xffff0000ffff0000) >> 16 | (v317 | v316) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            if (*(long long *)((char *)&v268[-2 * (v44 + ((!v318 ? 64 : Clz(v318)) >> 3) & v269)] - 16) == v89)
                                                goto LABEL_bf0544;
                                        } while ((v319 = v315 - 1, v310 = v319 & v315, v319 & v315));
                                    }
                                    do
                                    {
                                        v311 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v307, _mm_set1_epi8(-1)));
                                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v311, v311), _mm_unpacklo_epi64(v311, v311)))))))))) & 1)
                                        {
                                            if (!_mm_cvtsi128_si64(v22))
                                                sub_c74750(&v21, &v23);
                                            v146 = sub_bd8f3c(&v6);
                                            goto LABEL_bf04d8;
                                        }
                                        v305 += 8;
                                        v44 = v44 + v305 & v269;
                                        v307 = *(long long *)((char *)v268 + v44);
                                        v314 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v307, v306));
                                        v310 = v314 & 0x8080808080808080;
                                    } while (!(v314 & 0x8080808080808080));
                                    goto LABEL_befb08;
                                }
                            } while ((v284 = v280 - 1, v275 = v284 & v280, v284 & v280));
                        }
                        do
                        {
                            v276 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v272, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v276, v276), _mm_unpacklo_epi64(v276, v276)))))))))) & 1)
                            {
                                if (!_mm_cvtsi128_si64(v22))
                                    sub_c74750(&v21, &v23);
                                v285 = sub_bd8f3c(&v6);
                                v286 = *(unsigned long long *)&v21;
                                v287 = *(unsigned long long *)((void*)&v21 + 8);
                                v288 = v287 & v266;
                                v289 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v286 + v288)));
                                i4 = __double_as_longlong(v289);
                                if (!i4)
                                {
                                    v291 = 8;
                                    do
                                    {
                                        v288 = v288 + v291 & v287;
                                        i4 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v286 + v288)));
                                        v291 += 8;
                                    } while (!i4);
                                }
                                v293 = ((((((i4 & 0xaaaaaaaaaaaaaaaa) >> 1 | i4 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i4 & 0xaaaaaaaaaaaaaaaa) >> 1 | i4 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i4 & 0xaaaaaaaaaaaaaaaa) >> 1 | i4 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i4 & 0xaaaaaaaaaaaaaaaa) >> 1 | i4 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v294 = (((((((i4 & 0xaaaaaaaaaaaaaaaa) >> 1 | i4 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i4 & 0xaaaaaaaaaaaaaaaa) >> 1 | i4 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i4 & 0xaaaaaaaaaaaaaaaa) >> 1 | i4 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i4 & 0xaaaaaaaaaaaaaaaa) >> 1 | i4 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v295 = ((((v294 | v293) & 0xffff0000ffff0000) >> 16 | (v294 | v293) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v294 | v293) & 0xffff0000ffff0000) >> 16 | (v294 | v293) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                v296 = v288 + ((!v295 ? 64 : Clz(v295)) >> 3) & v287;
                                v297 = *((char *)v286 + v296);
                                if (!(v297 >> 31 & 1))
                                {
                                    v299 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v286));
                                    v300 = ((((((v299 & 0xaaaaaaaaaaaaaaaa) >> 1 | v299 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v299 & 0xaaaaaaaaaaaaaaaa) >> 1 | v299 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v299 & 0xaaaaaaaaaaaaaaaa) >> 1 | v299 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v299 & 0xaaaaaaaaaaaaaaaa) >> 1 | v299 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v301 = (((((((v299 & 0xaaaaaaaaaaaaaaaa) >> 1 | v299 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v299 & 0xaaaaaaaaaaaaaaaa) >> 1 | v299 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v299 & 0xaaaaaaaaaaaaaaaa) >> 1 | v299 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v299 & 0xaaaaaaaaaaaaaaaa) >> 1 | v299 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v302 = ((((v301 | v300) & 0xffff0000ffff0000) >> 16 | (v301 | v300) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v301 | v300) & 0xffff0000ffff0000) >> 16 | (v301 | v300) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v296 = (!v302 ? 64 : Clz(v302)) >> 3;
                                    v297 = *((char *)v286 + v296);
                                }
                                *((char *)v286 + v296) = v267;
                                *((char *)v286 + (v296 - 8 & v287) + 8) = v267;
                                v303 = &v286[-2 * v296];
                                *(unsigned long *)((char *)v303 - 16) = v265;
                                *(unsigned int *)((char *)v303 - 8) = v285;
                                v22 = _mm_sub_epi64(v22, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v297 & 1)));
                                v268 = *(unsigned long long *)&v21;
                                v269 = *(unsigned long long *)((void*)&v21 + 8);
                                goto LABEL_befad0;
                            }
                            v264 += 8;
                            v271 = v271 + v264 & v269;
                            v272 = *(long long *)((char *)v268 + v271);
                            v279 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v272, v270));
                            v275 = v279 & 0x8080808080808080;
                        } while (!(v279 & 0x8080808080808080));
                        goto LABEL_bef94c;
                    }
                    if (!(v44 & 262154))
                    {
                        if (v147)
                            goto LABEL_befd84;
                        v205 = (short)v83[4];
                        v206 = arm64g_calculate_condition(84, v205, 0, 0);
                        v89 = v79 + v205;
                        if (!(v206 & 1) ^ v84 >= v89)
                        {
                            v81 = &g_efb208;
                            goto LABEL_bf144c;
                        }
                        v207 = 0;
                        v208 = 5871781006564002453 * v79;
                        v209 = v208 >> 57;
                        v210 = *(unsigned long long *)&v21;
                        v211 = *(unsigned long long *)((void*)&v21 + 8);
                        v212 = v209 | v209 * 0x100 | (v209 | v209 * 0x100) * 0x10000 | (v209 | v209 * 0x100 | (v209 | v209 * 0x100) * 0x10000) * 0x100000000;
                        v213 = v208 & v211;
                        v214 = *(long long *)((char *)v210 + v213);
                        v216 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v214, v212));
                        v217 = v216 & 0x8080808080808080;
                        if (v216 & 0x8080808080808080)
                        {
                            do
                            {
LABEL_befd20:
                                v222 = v217;
                                v223 = ((((((v222 & 0xaaaaaaaaaaaaaaaa) >> 1 | v222 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v222 & 0xaaaaaaaaaaaaaaaa) >> 1 | v222 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v222 & 0xaaaaaaaaaaaaaaaa) >> 1 | v222 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v222 & 0xaaaaaaaaaaaaaaaa) >> 1 | v222 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v224 = (((((((v222 & 0xaaaaaaaaaaaaaaaa) >> 1 | v222 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v222 & 0xaaaaaaaaaaaaaaaa) >> 1 | v222 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v222 & 0xaaaaaaaaaaaaaaaa) >> 1 | v222 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v222 & 0xaaaaaaaaaaaaaaaa) >> 1 | v222 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v225 = ((((v224 | v223) & 0xffff0000ffff0000) >> 16 | (v224 | v223) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v224 | v223) & 0xffff0000ffff0000) >> 16 | (v224 | v223) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (*(long long *)((char *)&v210[-2 * (v213 + ((!v225 ? 64 : Clz(v225)) >> 3) & v211)] - 16) == v79)
                                {
LABEL_bf00bc:
                                    v247 = 0;
                                    v131 = 5871781006564002453 * v89;
                                    v248 = v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                    v44 = v131 & v211;
                                    v249 = *(long long *)((char *)v210 + v44);
                                    v251 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v249, v248));
                                    v252 = v251 & 0x8080808080808080;
                                    if (v251 & 0x8080808080808080)
                                    {
                                        do
                                        {
LABEL_bf00f4:
                                            v257 = v252;
                                            v258 = ((((((v257 & 0xaaaaaaaaaaaaaaaa) >> 1 | v257 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v257 & 0xaaaaaaaaaaaaaaaa) >> 1 | v257 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v257 & 0xaaaaaaaaaaaaaaaa) >> 1 | v257 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v257 & 0xaaaaaaaaaaaaaaaa) >> 1 | v257 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v259 = (((((((v257 & 0xaaaaaaaaaaaaaaaa) >> 1 | v257 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v257 & 0xaaaaaaaaaaaaaaaa) >> 1 | v257 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v257 & 0xaaaaaaaaaaaaaaaa) >> 1 | v257 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v257 & 0xaaaaaaaaaaaaaaaa) >> 1 | v257 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v260 = ((((v259 | v258) & 0xffff0000ffff0000) >> 16 | (v259 | v258) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v259 | v258) & 0xffff0000ffff0000) >> 16 | (v259 | v258) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            if (*(long long *)((char *)&v210[-2 * (v44 + ((!v260 ? 64 : Clz(v260)) >> 3) & v211)] - 16) == v89)
                                                goto LABEL_bf0544;
                                        } while ((v261 = v257 - 1, v252 = v261 & v257, v261 & v257));
                                    }
                                    do
                                    {
                                        v253 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v249, _mm_set1_epi8(-1)));
                                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v253, v253), _mm_unpacklo_epi64(v253, v253)))))))))) & 1)
                                        {
                                            if (!_mm_cvtsi128_si64(v22))
                                                sub_c74750(&v21, &v23);
                                            v146 = sub_bd8f3c(&v6);
                                            goto LABEL_bf04d8;
                                        }
                                        v247 += 8;
                                        v44 = v44 + v247 & v211;
                                        v249 = *(long long *)((char *)v210 + v44);
                                        v256 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v249, v248));
                                        v252 = v256 & 0x8080808080808080;
                                    } while (!(v256 & 0x8080808080808080));
                                    goto LABEL_bf00f4;
                                }
                            } while ((v226 = v222 - 1, v217 = v226 & v222, v226 & v222));
                        }
                        do
                        {
                            v218 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v214, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v218, v218), _mm_unpacklo_epi64(v218, v218)))))))))) & 1)
                            {
                                if (!_mm_cvtsi128_si64(v22))
                                    sub_c74750(&v21, &v23);
                                v227 = sub_bd8f3c(&v6);
                                v228 = *(unsigned long long *)&v21;
                                v229 = *(unsigned long long *)((void*)&v21 + 8);
                                v230 = v229 & v208;
                                v231 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v228 + v230)));
                                i6 = __double_as_longlong(v231);
                                if (!i6)
                                {
                                    v233 = 8;
                                    do
                                    {
                                        v230 = v230 + v233 & v229;
                                        i6 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v228 + v230)));
                                        v233 += 8;
                                    } while (!i6);
                                }
                                v235 = ((((((i6 & 0xaaaaaaaaaaaaaaaa) >> 1 | i6 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i6 & 0xaaaaaaaaaaaaaaaa) >> 1 | i6 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i6 & 0xaaaaaaaaaaaaaaaa) >> 1 | i6 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i6 & 0xaaaaaaaaaaaaaaaa) >> 1 | i6 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v236 = (((((((i6 & 0xaaaaaaaaaaaaaaaa) >> 1 | i6 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i6 & 0xaaaaaaaaaaaaaaaa) >> 1 | i6 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i6 & 0xaaaaaaaaaaaaaaaa) >> 1 | i6 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i6 & 0xaaaaaaaaaaaaaaaa) >> 1 | i6 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v237 = ((((v236 | v235) & 0xffff0000ffff0000) >> 16 | (v236 | v235) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v236 | v235) & 0xffff0000ffff0000) >> 16 | (v236 | v235) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                v238 = v230 + ((!v237 ? 64 : Clz(v237)) >> 3) & v229;
                                v239 = *((char *)v228 + v238);
                                if (!(v239 >> 31 & 1))
                                {
                                    v241 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v228));
                                    v242 = ((((((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v243 = (((((((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v241 & 0xaaaaaaaaaaaaaaaa) >> 1 | v241 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v244 = ((((v243 | v242) & 0xffff0000ffff0000) >> 16 | (v243 | v242) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v243 | v242) & 0xffff0000ffff0000) >> 16 | (v243 | v242) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v238 = (!v244 ? 64 : Clz(v244)) >> 3;
                                    v239 = *((char *)v228 + v238);
                                }
                                *((char *)v228 + v238) = v209;
                                *((char *)v228 + (v238 - 8 & v229) + 8) = v209;
                                v245 = &v228[-2 * v238];
                                *(unsigned long long *)((char *)v245 - 16) = v79;
                                *(unsigned int *)((char *)v245 - 8) = v227;
                                v22 = _mm_sub_epi64(v22, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v239 & 1)));
                                v210 = *(unsigned long long *)&v21;
                                v211 = *(unsigned long long *)((void*)&v21 + 8);
                                goto LABEL_bf00bc;
                            }
                            v207 += 8;
                            v213 = v213 + v207 & v211;
                            v214 = *(long long *)((char *)v210 + v213);
                            v221 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v214, v212));
                            v217 = v221 & 0x8080808080808080;
                        } while (!(v221 & 0x8080808080808080));
                        goto LABEL_befd20;
                    }
                    v148 = (short)v83[4];
                    v149 = arm64g_calculate_condition(84, v148, 0, 0);
                    v89 = v79 + v148;
                    if (!(v149 & 1) ^ v84 >= v89)
                    {
                        v81 = &g_efb220;
                        goto LABEL_bf144c;
                    }
                    v150 = 0;
                    v151 = 5871781006564002453 * v79;
                    v152 = v151 >> 57;
                    v153 = *(unsigned long long *)&v21;
                    v154 = *(unsigned long long *)((void*)&v21 + 8);
                    v155 = v152 | v152 * 0x100 | (v152 | v152 * 0x100) * 0x10000 | (v152 | v152 * 0x100 | (v152 | v152 * 0x100) * 0x10000) * 0x100000000;
                    v156 = v151 & v154;
                    v157 = *(long long *)((char *)v153 + v156);
                    v159 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v157, v155));
                    v160 = v159 & 0x8080808080808080;
                    if (v159 & 0x8080808080808080)
                    {
                        do
                        {
LABEL_bef888:
                            v165 = v160;
                            v166 = ((((((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v167 = (((((((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v168 = ((((v167 | v166) & 0xffff0000ffff0000) >> 16 | (v167 | v166) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v167 | v166) & 0xffff0000ffff0000) >> 16 | (v167 | v166) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (*(long long *)((char *)&v153[-2 * (v156 + ((!v168 ? 64 : Clz(v168)) >> 3) & v154)] - 16) == v79)
                            {
LABEL_befed0:
                                v190 = 0;
                                v131 = 5871781006564002453 * v89;
                                v191 = v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                v44 = v131 & v154;
                                v192 = *(long long *)((char *)v153 + v44);
                                v194 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v192, v191));
                                v195 = v194 & 0x8080808080808080;
                                if (v194 & 0x8080808080808080)
                                {
                                    do
                                    {
LABEL_beff08:
                                        v200 = v195;
                                        v201 = ((((((v200 & 0xaaaaaaaaaaaaaaaa) >> 1 | v200 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v200 & 0xaaaaaaaaaaaaaaaa) >> 1 | v200 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v200 & 0xaaaaaaaaaaaaaaaa) >> 1 | v200 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v200 & 0xaaaaaaaaaaaaaaaa) >> 1 | v200 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v202 = (((((((v200 & 0xaaaaaaaaaaaaaaaa) >> 1 | v200 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v200 & 0xaaaaaaaaaaaaaaaa) >> 1 | v200 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v200 & 0xaaaaaaaaaaaaaaaa) >> 1 | v200 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v200 & 0xaaaaaaaaaaaaaaaa) >> 1 | v200 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v203 = ((((v202 | v201) & 0xffff0000ffff0000) >> 16 | (v202 | v201) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v202 | v201) & 0xffff0000ffff0000) >> 16 | (v202 | v201) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (*(long long *)((char *)&v153[-2 * (v44 + ((!v203 ? 64 : Clz(v203)) >> 3) & v154)] - 16) == v89)
                                            goto LABEL_bf0544;
                                    } while ((v204 = v200 - 1, v195 = v204 & v200, v204 & v200));
                                }
                                do
                                {
                                    v196 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v192, _mm_set1_epi8(-1)));
                                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v196, v196), _mm_unpacklo_epi64(v196, v196)))))))))) & 1)
                                    {
                                        if (!_mm_cvtsi128_si64(v22))
                                            sub_c74750(&v21, &v23);
                                        v146 = sub_bd8f3c(&v6);
                                        goto LABEL_bf04d8;
                                    }
                                    v190 += 8;
                                    v44 = v44 + v190 & v154;
                                    v192 = *(long long *)((char *)v153 + v44);
                                    v199 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v192, v191));
                                    v195 = v199 & 0x8080808080808080;
                                } while (!(v199 & 0x8080808080808080));
                                goto LABEL_beff08;
                            }
                        } while ((v169 = v165 - 1, v160 = v169 & v165, v169 & v165));
                    }
                    do
                    {
                        v161 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v157, _mm_set1_epi8(-1)));
                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))))))) & 1)
                        {
                            if (!_mm_cvtsi128_si64(v22))
                                sub_c74750(&v21, &v23);
                            v170 = sub_bd8f3c(&v6);
                            v171 = *(unsigned long long *)&v21;
                            v172 = *(unsigned long long *)((void*)&v21 + 8);
                            v173 = v172 & v151;
                            v174 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v171 + v173)));
                            i5 = __double_as_longlong(v174);
                            if (!i5)
                            {
                                v176 = 8;
                                do
                                {
                                    v173 = v173 + v176 & v172;
                                    i5 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v171 + v173)));
                                    v176 += 8;
                                } while (!i5);
                            }
                            v178 = ((((((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v179 = (((((((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i5 & 0xaaaaaaaaaaaaaaaa) >> 1 | i5 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v180 = ((((v179 | v178) & 0xffff0000ffff0000) >> 16 | (v179 | v178) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v179 | v178) & 0xffff0000ffff0000) >> 16 | (v179 | v178) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            v181 = v173 + ((!v180 ? 64 : Clz(v180)) >> 3) & v172;
                            v182 = *((char *)v171 + v181);
                            if (!(v182 >> 31 & 1))
                            {
                                v184 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v171));
                                v185 = ((((((v184 & 0xaaaaaaaaaaaaaaaa) >> 1 | v184 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v184 & 0xaaaaaaaaaaaaaaaa) >> 1 | v184 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v184 & 0xaaaaaaaaaaaaaaaa) >> 1 | v184 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v184 & 0xaaaaaaaaaaaaaaaa) >> 1 | v184 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v186 = (((((((v184 & 0xaaaaaaaaaaaaaaaa) >> 1 | v184 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v184 & 0xaaaaaaaaaaaaaaaa) >> 1 | v184 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v184 & 0xaaaaaaaaaaaaaaaa) >> 1 | v184 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v184 & 0xaaaaaaaaaaaaaaaa) >> 1 | v184 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v187 = ((((v186 | v185) & 0xffff0000ffff0000) >> 16 | (v186 | v185) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v186 | v185) & 0xffff0000ffff0000) >> 16 | (v186 | v185) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                v181 = (!v187 ? 64 : Clz(v187)) >> 3;
                                v182 = *((char *)v171 + v181);
                            }
                            *((char *)v171 + v181) = v152;
                            *((char *)v171 + (v181 - 8 & v172) + 8) = v152;
                            v188 = &v171[-2 * v181];
                            *(unsigned long long *)((char *)v188 - 16) = v79;
                            *(unsigned int *)((char *)v188 - 8) = v170;
                            v22 = _mm_sub_epi64(v22, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v182 & 1)));
                            v153 = *(unsigned long long *)&v21;
                            v154 = *(unsigned long long *)((void*)&v21 + 8);
                            goto LABEL_befed0;
                        }
                        v150 += 8;
                        v156 = v156 + v150 & v154;
                        v157 = *(long long *)((char *)v153 + v156);
                        v164 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v157, v155));
                        v160 = v164 & 0x8080808080808080;
                    } while (!(v164 & 0x8080808080808080));
                    goto LABEL_bef888;
                }
                else
                {
LABEL_befd84:
                    if (v86 == 56)
                    {
                        v415 = (short)v83[4];
                        v416 = arm64g_calculate_condition(84, v415, 0, 0);
                        v89 = v79 + v415;
                        if (!(v416 & 1) ^ v84 >= v89)
                        {
                            v81 = &g_efb1d8;
                            goto LABEL_bf144c;
                        }
                        v417 = 0;
                        v418 = 5871781006564002453 * v79;
                        v419 = v418 >> 57;
                        v420 = *(unsigned long long *)&v21;
                        v421 = *(unsigned long long *)((void*)&v21 + 8);
                        v422 = v419 | v419 * 0x100 | (v419 | v419 * 0x100) * 0x10000 | (v419 | v419 * 0x100 | (v419 | v419 * 0x100) * 0x10000) * 0x100000000;
                        v423 = v418 & v421;
                        v424 = *(long long *)((char *)v420 + v423);
                        v426 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v424, v422));
                        v427 = v426 & 0x8080808080808080;
                        if (v426 & 0x8080808080808080)
                        {
                            do
                            {
LABEL_beffdc:
                                v432 = v427;
                                v433 = ((((((v432 & 0xaaaaaaaaaaaaaaaa) >> 1 | v432 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v432 & 0xaaaaaaaaaaaaaaaa) >> 1 | v432 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v432 & 0xaaaaaaaaaaaaaaaa) >> 1 | v432 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v432 & 0xaaaaaaaaaaaaaaaa) >> 1 | v432 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v434 = (((((((v432 & 0xaaaaaaaaaaaaaaaa) >> 1 | v432 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v432 & 0xaaaaaaaaaaaaaaaa) >> 1 | v432 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v432 & 0xaaaaaaaaaaaaaaaa) >> 1 | v432 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v432 & 0xaaaaaaaaaaaaaaaa) >> 1 | v432 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v435 = ((((v434 | v433) & 0xffff0000ffff0000) >> 16 | (v434 | v433) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v434 | v433) & 0xffff0000ffff0000) >> 16 | (v434 | v433) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (*(long long *)((char *)&v420[-2 * (v423 + ((!v435 ? 64 : Clz(v435)) >> 3) & v421)] - 16) == v79)
                                {
LABEL_bf02ec:
                                    v457 = 0;
                                    v131 = 5871781006564002453 * v89;
                                    v458 = v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                    v44 = v131 & v421;
                                    v459 = *(long long *)((char *)v420 + v44);
                                    v461 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v459, v458));
                                    v462 = v461 & 0x8080808080808080;
                                    if (v461 & 0x8080808080808080)
                                    {
                                        do
                                        {
LABEL_bf0324:
                                            v467 = v462;
                                            v468 = ((((((v467 & 0xaaaaaaaaaaaaaaaa) >> 1 | v467 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v467 & 0xaaaaaaaaaaaaaaaa) >> 1 | v467 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v467 & 0xaaaaaaaaaaaaaaaa) >> 1 | v467 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v467 & 0xaaaaaaaaaaaaaaaa) >> 1 | v467 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v469 = (((((((v467 & 0xaaaaaaaaaaaaaaaa) >> 1 | v467 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v467 & 0xaaaaaaaaaaaaaaaa) >> 1 | v467 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v467 & 0xaaaaaaaaaaaaaaaa) >> 1 | v467 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v467 & 0xaaaaaaaaaaaaaaaa) >> 1 | v467 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v470 = ((((v469 | v468) & 0xffff0000ffff0000) >> 16 | (v469 | v468) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v469 | v468) & 0xffff0000ffff0000) >> 16 | (v469 | v468) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            if (*(long long *)((char *)&v420[-2 * (v44 + ((!v470 ? 64 : Clz(v470)) >> 3) & v421)] - 16) == v89)
                                                goto LABEL_bf0544;
                                        } while ((v471 = v467 - 1, v462 = v471 & v467, v471 & v467));
                                    }
                                    do
                                    {
                                        v463 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v459, _mm_set1_epi8(-1)));
                                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v463, v463), _mm_unpacklo_epi64(v463, v463)))))))))) & 1)
                                        {
                                            if (!_mm_cvtsi128_si64(v22))
                                                sub_c74750(&v21, &v23);
                                            v146 = sub_bd8f3c(&v6);
                                            goto LABEL_bf04d8;
                                        }
                                        v457 += 8;
                                        v44 = v44 + v457 & v421;
                                        v459 = *(long long *)((char *)v420 + v44);
                                        v466 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v459, v458));
                                        v462 = v466 & 0x8080808080808080;
                                    } while (!(v466 & 0x8080808080808080));
                                    goto LABEL_bf0324;
                                }
                            } while ((v436 = v432 - 1, v427 = v436 & v432, v436 & v432));
                        }
                        do
                        {
                            v428 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v424, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v428, v428), _mm_unpacklo_epi64(v428, v428)))))))))) & 1)
                            {
                                if (!_mm_cvtsi128_si64(v22))
                                    sub_c74750(&v21, &v23);
                                v437 = sub_bd8f3c(&v6);
                                v438 = *(unsigned long long *)&v21;
                                v439 = *(unsigned long long *)((void*)&v21 + 8);
                                v440 = v439 & v418;
                                v441 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v438 + v440)));
                                i8 = __double_as_longlong(v441);
                                if (!i8)
                                {
                                    v443 = 8;
                                    do
                                    {
                                        v440 = v440 + v443 & v439;
                                        i8 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v438 + v440)));
                                        v443 += 8;
                                    } while (!i8);
                                }
                                v445 = ((((((i8 & 0xaaaaaaaaaaaaaaaa) >> 1 | i8 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i8 & 0xaaaaaaaaaaaaaaaa) >> 1 | i8 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i8 & 0xaaaaaaaaaaaaaaaa) >> 1 | i8 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i8 & 0xaaaaaaaaaaaaaaaa) >> 1 | i8 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v446 = (((((((i8 & 0xaaaaaaaaaaaaaaaa) >> 1 | i8 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i8 & 0xaaaaaaaaaaaaaaaa) >> 1 | i8 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i8 & 0xaaaaaaaaaaaaaaaa) >> 1 | i8 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i8 & 0xaaaaaaaaaaaaaaaa) >> 1 | i8 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v447 = ((((v446 | v445) & 0xffff0000ffff0000) >> 16 | (v446 | v445) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v446 | v445) & 0xffff0000ffff0000) >> 16 | (v446 | v445) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                v448 = v440 + ((!v447 ? 64 : Clz(v447)) >> 3) & v439;
                                v449 = *((char *)v438 + v448);
                                if (!(v449 >> 31 & 1))
                                {
                                    v451 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v438));
                                    v452 = ((((((v451 & 0xaaaaaaaaaaaaaaaa) >> 1 | v451 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v451 & 0xaaaaaaaaaaaaaaaa) >> 1 | v451 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v451 & 0xaaaaaaaaaaaaaaaa) >> 1 | v451 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v451 & 0xaaaaaaaaaaaaaaaa) >> 1 | v451 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v453 = (((((((v451 & 0xaaaaaaaaaaaaaaaa) >> 1 | v451 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v451 & 0xaaaaaaaaaaaaaaaa) >> 1 | v451 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v451 & 0xaaaaaaaaaaaaaaaa) >> 1 | v451 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v451 & 0xaaaaaaaaaaaaaaaa) >> 1 | v451 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v454 = ((((v453 | v452) & 0xffff0000ffff0000) >> 16 | (v453 | v452) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v453 | v452) & 0xffff0000ffff0000) >> 16 | (v453 | v452) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v448 = (!v454 ? 64 : Clz(v454)) >> 3;
                                    v449 = *((char *)v438 + v448);
                                }
                                *((char *)v438 + v448) = v419;
                                *((char *)v438 + (v448 - 8 & v439) + 8) = v419;
                                v455 = &v438[-2 * v448];
                                *(unsigned long long *)((char *)v455 - 16) = v79;
                                *(unsigned int *)((char *)v455 - 8) = v437;
                                v22 = _mm_sub_epi64(v22, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v449 & 1)));
                                v420 = *(unsigned long long *)&v21;
                                v421 = *(unsigned long long *)((void*)&v21 + 8);
                                goto LABEL_bf02ec;
                            }
                            v417 += 8;
                            v423 = v423 + v417 & v421;
                            v424 = *(long long *)((char *)v420 + v423);
                            v431 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v424, v422));
                            v427 = v431 & 0x8080808080808080;
                        } while (!(v431 & 0x8080808080808080));
                        goto LABEL_beffdc;
                    }
                    if (v86 != 57)
                        goto LABEL_bf0544;
                    v320 = (short)v83[4];
                    v321 = arm64g_calculate_condition(84, v320, 0, 0);
                    v89 = v79 + v320;
                    if (!(v321 & 1) ^ v84 >= v89)
                    {
                        v81 = &g_efb1f0;
                        goto LABEL_bf144c;
                    }
                    v322 = 0;
                    v323 = 5871781006564002453 * v84;
                    v324 = v323 >> 57;
                    v325 = *(unsigned long long *)&v21;
                    v326 = *(unsigned long long *)((void*)&v21 + 8);
                    v327 = v324 | v324 * 0x100 | (v324 | v324 * 0x100) * 0x10000 | (v324 | v324 * 0x100 | (v324 | v324 * 0x100) * 0x10000) * 0x100000000;
                    v328 = v323 & v326;
                    v329 = *(long long *)((char *)v325 + v328);
                    v331 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v329, v327));
                    v332 = v331 & 0x8080808080808080;
                    if (!(v331 & 0x8080808080808080))
                    {
                        do
                        {
LABEL_befe1c:
                            v333 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v329, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v333, v333), _mm_unpacklo_epi64(v333, v333)))))))))) & 1)
                            {
                                if (!_mm_cvtsi128_si64(v22))
                                    sub_c74750(&v21, &v23);
                                v342 = sub_bd8f3c(&v6);
                                v343 = *(unsigned long long *)&v21;
                                v344 = *(unsigned long long *)((void*)&v21 + 8);
                                v345 = v344 & v323;
                                v346 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v343 + v345)));
                                i7 = __double_as_longlong(v346);
                                if (!i7)
                                {
                                    v348 = 8;
                                    do
                                    {
                                        v345 = v345 + v348 & v344;
                                        i7 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v343 + v345)));
                                        v348 += 8;
                                    } while (!i7);
                                }
                                v350 = ((((((i7 & 0xaaaaaaaaaaaaaaaa) >> 1 | i7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i7 & 0xaaaaaaaaaaaaaaaa) >> 1 | i7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i7 & 0xaaaaaaaaaaaaaaaa) >> 1 | i7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i7 & 0xaaaaaaaaaaaaaaaa) >> 1 | i7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v351 = (((((((i7 & 0xaaaaaaaaaaaaaaaa) >> 1 | i7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i7 & 0xaaaaaaaaaaaaaaaa) >> 1 | i7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i7 & 0xaaaaaaaaaaaaaaaa) >> 1 | i7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i7 & 0xaaaaaaaaaaaaaaaa) >> 1 | i7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v352 = ((((v351 | v350) & 0xffff0000ffff0000) >> 16 | (v351 | v350) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v351 | v350) & 0xffff0000ffff0000) >> 16 | (v351 | v350) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                v353 = v345 + ((!v352 ? 64 : Clz(v352)) >> 3) & v344;
                                v354 = *((char *)v343 + v353);
                                if (!(v354 >> 31 & 1))
                                {
                                    v356 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v343));
                                    v357 = ((((((v356 & 0xaaaaaaaaaaaaaaaa) >> 1 | v356 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v356 & 0xaaaaaaaaaaaaaaaa) >> 1 | v356 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v356 & 0xaaaaaaaaaaaaaaaa) >> 1 | v356 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v356 & 0xaaaaaaaaaaaaaaaa) >> 1 | v356 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v358 = (((((((v356 & 0xaaaaaaaaaaaaaaaa) >> 1 | v356 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v356 & 0xaaaaaaaaaaaaaaaa) >> 1 | v356 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v356 & 0xaaaaaaaaaaaaaaaa) >> 1 | v356 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v356 & 0xaaaaaaaaaaaaaaaa) >> 1 | v356 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v359 = ((((v358 | v357) & 0xffff0000ffff0000) >> 16 | (v358 | v357) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v358 | v357) & 0xffff0000ffff0000) >> 16 | (v358 | v357) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v353 = (!v359 ? 64 : Clz(v359)) >> 3;
                                    v354 = *((char *)v343 + v353);
                                }
                                *((char *)v343 + v353) = v324;
                                *((char *)v343 + (v353 - 8 & v344) + 8) = v324;
                                v360 = &v343[-2 * v353];
                                *(unsigned long *)((char *)v360 - 16) = v84;
                                *(unsigned int *)((char *)v360 - 8) = v342;
                                v22 = _mm_sub_epi64(v22, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v354 & 1)));
                                v325 = *(unsigned long long *)&v21;
                                v326 = *(unsigned long long *)((void*)&v21 + 8);
                                goto LABEL_bf01d4;
                            }
                            v322 += 8;
                            v328 = v328 + v322 & v326;
                            v329 = *(long long *)((char *)v325 + v328);
                            v336 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v329, v327));
                            v332 = v336 & 0x8080808080808080;
                        } while (!(v336 & 0x8080808080808080));
                    }
                    while (1)
                    {
                        v337 = v332;
                        v338 = ((((((v337 & 0xaaaaaaaaaaaaaaaa) >> 1 | v337 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v337 & 0xaaaaaaaaaaaaaaaa) >> 1 | v337 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v337 & 0xaaaaaaaaaaaaaaaa) >> 1 | v337 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v337 & 0xaaaaaaaaaaaaaaaa) >> 1 | v337 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v339 = (((((((v337 & 0xaaaaaaaaaaaaaaaa) >> 1 | v337 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v337 & 0xaaaaaaaaaaaaaaaa) >> 1 | v337 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v337 & 0xaaaaaaaaaaaaaaaa) >> 1 | v337 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v337 & 0xaaaaaaaaaaaaaaaa) >> 1 | v337 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v340 = ((((v339 | v338) & 0xffff0000ffff0000) >> 16 | (v339 | v338) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v339 | v338) & 0xffff0000ffff0000) >> 16 | (v339 | v338) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (*(long long *)((char *)&v325[-2 * (v328 + ((!v340 ? 64 : Clz(v340)) >> 3) & v326)] - 16) == v84)
                            break;
                        v341 = v337 - 1;
                        v332 = v341 & v337;
                        if (!(v341 & v337))
                            goto LABEL_befe1c;
                    }
LABEL_bf01d4:
                    v362 = 0;
                    v363 = 5871781006564002453 * v79;
                    v364 = v363 >> 57;
                    v365 = v364 | v364 * 0x100 | (v364 | v364 * 0x100) * 0x10000 | (v364 | v364 * 0x100 | (v364 | v364 * 0x100) * 0x10000) * 0x100000000;
                    v366 = v363 & v326;
                    v367 = *(long long *)((char *)v325 + v366);
                    v369 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v367, v365));
                    v370 = v369 & 0x8080808080808080;
                    if (!(v369 & 0x8080808080808080))
                    {
                        do
                        {
LABEL_bf0238:
                            v371 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v367, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v371, v371), _mm_unpacklo_epi64(v371, v371)))))))))) & 1)
                            {
                                if (!_mm_cvtsi128_si64(v22))
                                    sub_c74750(&v21, &v23);
                                v380 = sub_bd8f3c(&v6);
                                v381 = *(unsigned long long *)&v21;
                                v382 = *(unsigned long long *)((void*)&v21 + 8);
                                v383 = v382 & v363;
                                v384 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v381 + v383)));
                                i9 = __double_as_longlong(v384);
                                if (!i9)
                                {
                                    v386 = 8;
                                    do
                                    {
                                        v383 = v383 + v386 & v382;
                                        i9 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v381 + v383)));
                                        v386 += 8;
                                    } while (!i9);
                                }
                                v388 = ((((((i9 & 0xaaaaaaaaaaaaaaaa) >> 1 | i9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i9 & 0xaaaaaaaaaaaaaaaa) >> 1 | i9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i9 & 0xaaaaaaaaaaaaaaaa) >> 1 | i9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i9 & 0xaaaaaaaaaaaaaaaa) >> 1 | i9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v389 = (((((((i9 & 0xaaaaaaaaaaaaaaaa) >> 1 | i9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i9 & 0xaaaaaaaaaaaaaaaa) >> 1 | i9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i9 & 0xaaaaaaaaaaaaaaaa) >> 1 | i9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i9 & 0xaaaaaaaaaaaaaaaa) >> 1 | i9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v390 = ((((v389 | v388) & 0xffff0000ffff0000) >> 16 | (v389 | v388) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v389 | v388) & 0xffff0000ffff0000) >> 16 | (v389 | v388) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                v391 = v383 + ((!v390 ? 64 : Clz(v390)) >> 3) & v382;
                                v392 = *((char *)v381 + v391);
                                if (!(v392 >> 31 & 1))
                                {
                                    v394 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v381));
                                    v395 = ((((((v394 & 0xaaaaaaaaaaaaaaaa) >> 1 | v394 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v394 & 0xaaaaaaaaaaaaaaaa) >> 1 | v394 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v394 & 0xaaaaaaaaaaaaaaaa) >> 1 | v394 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v394 & 0xaaaaaaaaaaaaaaaa) >> 1 | v394 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v396 = (((((((v394 & 0xaaaaaaaaaaaaaaaa) >> 1 | v394 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v394 & 0xaaaaaaaaaaaaaaaa) >> 1 | v394 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v394 & 0xaaaaaaaaaaaaaaaa) >> 1 | v394 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v394 & 0xaaaaaaaaaaaaaaaa) >> 1 | v394 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v397 = ((((v396 | v395) & 0xffff0000ffff0000) >> 16 | (v396 | v395) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v396 | v395) & 0xffff0000ffff0000) >> 16 | (v396 | v395) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v391 = (!v397 ? 64 : Clz(v397)) >> 3;
                                    v392 = *((char *)v381 + v391);
                                }
                                *((char *)v381 + v391) = v364;
                                *((char *)v381 + (v391 - 8 & v382) + 8) = v364;
                                v398 = &v381[-2 * v391];
                                *(unsigned long long *)((char *)v398 - 16) = v79;
                                *(unsigned int *)((char *)v398 - 8) = v380;
                                v22 = _mm_sub_epi64(v22, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v392 & 1)));
                                v325 = *(unsigned long long *)&v21;
                                v326 = *(unsigned long long *)((void*)&v21 + 8);
                                goto LABEL_bf0418;
                            }
                            v362 += 8;
                            v366 = v366 + v362 & v326;
                            v367 = *(long long *)((char *)v325 + v366);
                            v374 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v367, v365));
                            v370 = v374 & 0x8080808080808080;
                        } while (!(v374 & 0x8080808080808080));
                    }
                    while (1)
                    {
                        v375 = v370;
                        v376 = ((((((v375 & 0xaaaaaaaaaaaaaaaa) >> 1 | v375 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v375 & 0xaaaaaaaaaaaaaaaa) >> 1 | v375 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v375 & 0xaaaaaaaaaaaaaaaa) >> 1 | v375 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v375 & 0xaaaaaaaaaaaaaaaa) >> 1 | v375 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v377 = (((((((v375 & 0xaaaaaaaaaaaaaaaa) >> 1 | v375 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v375 & 0xaaaaaaaaaaaaaaaa) >> 1 | v375 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v375 & 0xaaaaaaaaaaaaaaaa) >> 1 | v375 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v375 & 0xaaaaaaaaaaaaaaaa) >> 1 | v375 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v378 = ((((v377 | v376) & 0xffff0000ffff0000) >> 16 | (v377 | v376) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v377 | v376) & 0xffff0000ffff0000) >> 16 | (v377 | v376) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (*(long long *)((char *)&v325[-2 * (v366 + ((!v378 ? 64 : Clz(v378)) >> 3) & v326)] - 16) == v79)
                            break;
                        v379 = v375 - 1;
                        v370 = v379 & v375;
                        if (!(v379 & v375))
                            goto LABEL_bf0238;
                    }
LABEL_bf0418:
                    v400 = 0;
                    v131 = 5871781006564002453 * v89;
                    v401 = v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                    v44 = v131 & v326;
                    v402 = *(long long *)((char *)v325 + v44);
                    v404 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v402, v401));
                    v405 = v404 & 0x8080808080808080;
                    if (!(v404 & 0x8080808080808080))
                    {
                        do
                        {
LABEL_bf047c:
                            v406 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v402, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v406, v406), _mm_unpacklo_epi64(v406, v406)))))))))) & 1)
                            {
                                if (!_mm_cvtsi128_si64(v22))
                                    sub_c74750(&v21, &v23);
                                v146 = sub_bd8f3c(&v6);
                                goto LABEL_bf04d8;
                            }
                            v400 += 8;
                            v44 = v44 + v400 & v326;
                            v402 = *(long long *)((char *)v325 + v44);
                            v409 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v402, v401));
                            v405 = v409 & 0x8080808080808080;
                        } while (!(v409 & 0x8080808080808080));
                    }
                    while (1)
                    {
                        v410 = v405;
                        v411 = ((((((v410 & 0xaaaaaaaaaaaaaaaa) >> 1 | v410 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v410 & 0xaaaaaaaaaaaaaaaa) >> 1 | v410 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v410 & 0xaaaaaaaaaaaaaaaa) >> 1 | v410 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v410 & 0xaaaaaaaaaaaaaaaa) >> 1 | v410 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v412 = (((((((v410 & 0xaaaaaaaaaaaaaaaa) >> 1 | v410 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v410 & 0xaaaaaaaaaaaaaaaa) >> 1 | v410 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v410 & 0xaaaaaaaaaaaaaaaa) >> 1 | v410 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v410 & 0xaaaaaaaaaaaaaaaa) >> 1 | v410 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v413 = ((((v412 | v411) & 0xffff0000ffff0000) >> 16 | (v412 | v411) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v412 | v411) & 0xffff0000ffff0000) >> 16 | (v412 | v411) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (*(long long *)((char *)&v325[-2 * (v44 + ((!v413 ? 64 : Clz(v413)) >> 3) & v326)] - 16) == v89)
                            break;
                        v414 = v410 - 1;
                        v405 = v414 & v410;
                        if (!(v414 & v410))
                            goto LABEL_bf047c;
                    }
LABEL_bf0544:
                    v83 = v82;
                    if (v82 == v80 + 12 * v78)
                        goto LABEL_bf08e4;
                }
            }
            if ((unsigned int)(v86 - 27) < 6)
                goto LABEL_bef8ec;
            if (4 <= (unsigned int)(v86 - 23))
                goto LABEL_bf0544;
            v87 = (short)v83[4];
            v88 = arm64g_calculate_condition(84, v87, 0, 0);
            v89 = v79 + v87;
            if (((unsigned int)!(v88 & 1) ^ v84 >= v89) & 1)
                goto LABEL_bf144c;
            v90 = 0;
            v91 = 5871781006564002453 * v79;
            v92 = v91 >> 57;
            v93 = *(unsigned long long *)&v21;
            v94 = *(unsigned long long *)((void*)&v21 + 8);
            v95 = v92 | v92 * 0x100 | (v92 | v92 * 0x100) * 0x10000 | (v92 | v92 * 0x100 | (v92 | v92 * 0x100) * 0x10000) * 0x100000000;
            v96 = v91 & v94;
            v97 = *(long long *)((char *)v93 + v96);
            v99 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v97, v95));
            v100 = v99 & 0x8080808080808080;
            if (v99 & 0x8080808080808080)
            {
                do
                {
LABEL_bef624:
                    v105 = v100;
                    v106 = ((((((v105 & 0xaaaaaaaaaaaaaaaa) >> 1 | v105 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v105 & 0xaaaaaaaaaaaaaaaa) >> 1 | v105 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v105 & 0xaaaaaaaaaaaaaaaa) >> 1 | v105 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v105 & 0xaaaaaaaaaaaaaaaa) >> 1 | v105 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v107 = (((((((v105 & 0xaaaaaaaaaaaaaaaa) >> 1 | v105 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v105 & 0xaaaaaaaaaaaaaaaa) >> 1 | v105 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v105 & 0xaaaaaaaaaaaaaaaa) >> 1 | v105 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v105 & 0xaaaaaaaaaaaaaaaa) >> 1 | v105 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v108 = ((((v107 | v106) & 0xffff0000ffff0000) >> 16 | (v107 | v106) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v107 | v106) & 0xffff0000ffff0000) >> 16 | (v107 | v106) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (*(long long *)((char *)&v93[-2 * (v96 + ((!v108 ? 64 : Clz(v108)) >> 3) & v94)] - 16) == v79)
                    {
LABEL_befc10:
                        v130 = 0;
                        v131 = 5871781006564002453 * v89;
                        v132 = v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100 | (v131 >> 57 & 0xff | (v131 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                        v44 = v131 & v94;
                        v133 = *(long long *)((char *)v93 + v44);
                        v135 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v133, v132));
                        v136 = v135 & 0x8080808080808080;
                        if (v135 & 0x8080808080808080)
                        {
                            do
                            {
LABEL_befc48:
                                v141 = v136;
                                v142 = ((((((v141 & 0xaaaaaaaaaaaaaaaa) >> 1 | v141 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v141 & 0xaaaaaaaaaaaaaaaa) >> 1 | v141 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v141 & 0xaaaaaaaaaaaaaaaa) >> 1 | v141 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v141 & 0xaaaaaaaaaaaaaaaa) >> 1 | v141 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v143 = (((((((v141 & 0xaaaaaaaaaaaaaaaa) >> 1 | v141 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v141 & 0xaaaaaaaaaaaaaaaa) >> 1 | v141 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v141 & 0xaaaaaaaaaaaaaaaa) >> 1 | v141 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v141 & 0xaaaaaaaaaaaaaaaa) >> 1 | v141 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v144 = ((((v143 | v142) & 0xffff0000ffff0000) >> 16 | (v143 | v142) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v143 | v142) & 0xffff0000ffff0000) >> 16 | (v143 | v142) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (*(long long *)((char *)&v93[-2 * (v44 + ((!v144 ? 64 : Clz(v144)) >> 3) & v94)] - 16) == v89)
                                    goto LABEL_bf0544;
                            } while ((v145 = v141 - 1, v136 = v145 & v141, v145 & v141));
                        }
                        do
                        {
                            v137 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v133, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v137, v137), _mm_unpacklo_epi64(v137, v137)))))))))) & 1)
                            {
                                if (!_mm_cvtsi128_si64(v22))
                                    sub_c74750(&v21, &v23);
                                v146 = sub_bd8f3c(&v6);
                                goto LABEL_bf04d8;
                            }
                            v130 += 8;
                            v44 = v44 + v130 & v94;
                            v133 = *(long long *)((char *)v93 + v44);
                            v140 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v133, v132));
                            v136 = v140 & 0x8080808080808080;
                        } while (!(v140 & 0x8080808080808080));
                        goto LABEL_befc48;
                    }
                } while ((v109 = v105 - 1, v100 = v109 & v105, v109 & v105));
            }
            do
            {
                v101 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v97, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v101, v101), _mm_unpacklo_epi64(v101, v101)))))))))) & 1)
                {
                    if (!_mm_cvtsi128_si64(v22))
                        sub_c74750(&v21, &v23);
                    v110 = sub_bd8f3c(&v6);
                    v111 = *(unsigned long long *)&v21;
                    v112 = *(unsigned long long *)((void*)&v21 + 8);
                    v113 = v112 & v91;
                    v114 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v111 + v113)));
                    i0 = __double_as_longlong(v114);
                    if (!i0)
                    {
                        v116 = 8;
                        do
                        {
                            v113 = v113 + v116 & v112;
                            i0 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v111 + v113)));
                            v116 += 8;
                        } while (!i0);
                    }
                    v118 = ((((((i0 & 0xaaaaaaaaaaaaaaaa) >> 1 | i0 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i0 & 0xaaaaaaaaaaaaaaaa) >> 1 | i0 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i0 & 0xaaaaaaaaaaaaaaaa) >> 1 | i0 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i0 & 0xaaaaaaaaaaaaaaaa) >> 1 | i0 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v119 = (((((((i0 & 0xaaaaaaaaaaaaaaaa) >> 1 | i0 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i0 & 0xaaaaaaaaaaaaaaaa) >> 1 | i0 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i0 & 0xaaaaaaaaaaaaaaaa) >> 1 | i0 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i0 & 0xaaaaaaaaaaaaaaaa) >> 1 | i0 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v120 = ((((v119 | v118) & 0xffff0000ffff0000) >> 16 | (v119 | v118) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v119 | v118) & 0xffff0000ffff0000) >> 16 | (v119 | v118) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    v121 = v113 + ((!v120 ? 64 : Clz(v120)) >> 3) & v112;
                    v122 = *((char *)v111 + v121);
                    if (!(v122 >> 31 & 1))
                    {
                        v124 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v111));
                        v125 = ((((((v124 & 0xaaaaaaaaaaaaaaaa) >> 1 | v124 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v124 & 0xaaaaaaaaaaaaaaaa) >> 1 | v124 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v124 & 0xaaaaaaaaaaaaaaaa) >> 1 | v124 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v124 & 0xaaaaaaaaaaaaaaaa) >> 1 | v124 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v126 = (((((((v124 & 0xaaaaaaaaaaaaaaaa) >> 1 | v124 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v124 & 0xaaaaaaaaaaaaaaaa) >> 1 | v124 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v124 & 0xaaaaaaaaaaaaaaaa) >> 1 | v124 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v124 & 0xaaaaaaaaaaaaaaaa) >> 1 | v124 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v127 = ((((v126 | v125) & 0xffff0000ffff0000) >> 16 | (v126 | v125) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v126 | v125) & 0xffff0000ffff0000) >> 16 | (v126 | v125) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        v121 = (!v127 ? 64 : Clz(v127)) >> 3;
                        v122 = *((char *)v111 + v121);
                    }
                    *((char *)v111 + v121) = v92;
                    *((char *)v111 + (v121 - 8 & v112) + 8) = v92;
                    v128 = &v111[-2 * v121];
                    *(unsigned long long *)((char *)v128 - 16) = v79;
                    *(unsigned int *)((char *)v128 - 8) = v110;
                    v22 = _mm_sub_epi64(v22, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v122 & 1)));
                    v93 = *(unsigned long long *)&v21;
                    v94 = *(unsigned long long *)((void*)&v21 + 8);
                    goto LABEL_befc10;
                }
                v90 += 8;
                v96 = v96 + v90 & v94;
                v97 = *(long long *)((char *)v93 + v96);
                v104 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v97, v95));
                v100 = v104 & 0x8080808080808080;
            } while (!(v104 & 0x8080808080808080));
            goto LABEL_bef624;
        }
LABEL_bf08e4:
        v564 = _mm_extract_epi64(v22, 1);
        if (v564)
        {
            node = *(unsigned long long *)&v21;
            v566 = node + 1;
            v567 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)node));
            v568 = __double_as_longlong(v567);
            j = v568 & 0x8080808080808080;
            v570 = v566;
            if (!(v568 & 0x8080808080808080))
            {
                do
                {
                    v570 = v566 + 1;
                    node = (char *)node - 128;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v566)) & 0x8080808080808080;
                    v566 = v570;
                } while (!j);
            }
            v572 = 0;
            v573 = v564 - 1;
            v574 = arm64g_calculate_condition(50, v573, 1, 0);
            v575 = (v574 & 1 ? v573 + 1 : 0xffffffffffffffff);
            v576 = (4 < v575 ? v575 : 4);
            v577 = v576 * 8;
            if (v575 <= 0x1fffffffffffffff && 0x7ffffffffffffff8 >= v577)
            {
                v578 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v579 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v580 = ((((v579 | v578) & 0xffff0000ffff0000) >> 16 | (v579 | v578) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v579 | v578) & 0xffff0000ffff0000) >> 16 | (v579 | v578) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                ptr = _malloc(v577);
                if (ptr)
                {
                    *(long long *)ptr = *(long long *)((char *)node - ((!v580 ? 64 : Clz(v580)) * 2 & 240) - 16);
                    i1 = j - 1 & j;
                    v29 = v576;
                    v31 = ptr;
                    idx = 1;
                    while (1)
                    {
                        v32 = idx;
                        if (!v573)
                            break;
                        v584 = v570;
                        if (!i1)
                        {
                            do
                            {
                                v584 = v570 + 1;
                                node = (char *)node - 128;
                                i1 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v570)) & 0x8080808080808080;
                                v570 = v584;
                            } while (!i1);
                        }
                        v570 = v584;
                        v586 = ((((((i1 & 0xaaaaaaaaaaaaaaaa) >> 1 | i1 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i1 & 0xaaaaaaaaaaaaaaaa) >> 1 | i1 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i1 & 0xaaaaaaaaaaaaaaaa) >> 1 | i1 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i1 & 0xaaaaaaaaaaaaaaaa) >> 1 | i1 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v587 = (((((((i1 & 0xaaaaaaaaaaaaaaaa) >> 1 | i1 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i1 & 0xaaaaaaaaaaaaaaaa) >> 1 | i1 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i1 & 0xaaaaaaaaaaaaaaaa) >> 1 | i1 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i1 & 0xaaaaaaaaaaaaaaaa) >> 1 | i1 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v588 = ((((v587 | v586) & 0xffff0000ffff0000) >> 16 | (v587 | v586) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v587 | v586) & 0xffff0000ffff0000) >> 16 | (v587 | v586) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        v573 -= 1;
                        if (idx == v29)
                        {
                            v589 = arm64g_calculate_condition(50, v573, 1, 0);
                            sub_c6c0cc(&v29, idx, (v589 & 1 ? v573 + 1 : 0xffffffffffffffff), 8, 8);
                            ptr = v31;
                        }
                        i1 &= i1 - 1;
                        *(long long *)(ptr + idx * 8) = *(long long *)((char *)node - ((!v588 ? 64 : Clz(v588)) * 2 & 240) - 16);
                        idx += 1;
                    }
                    v590 = v31;
                    v4 = !v29;
                    if (2 <= v564)
                    {
                        if (21 > v564)
                        {
                            v591 = 0;
                            iter = v590 + 8;
                            do
                            {
                                v593 = *(long long *)(iter - 8);
                                v44 = *(long long *)iter;
                                if ((unsigned long long)*(long long *)(iter - 8) > v44)
                                {
                                    iter1 = v591;
                                    do
                                    {
                                        v595 = (unsigned int *)(v590 + iter1);
                                        *(unsigned long long *)&v595[2] = v593;
                                        if (!iter1)
                                        {
                                            v596 = (unsigned int *)v590;
                                            goto LABEL_bf13cc;
                                        }
                                    } while ((v593 = *(long long *)((char *)v595 - 8), iter1 -= 8, v44 < v593));
                                    v596 = v590 + iter1 + 8;
LABEL_bf13cc:
                                    *(unsigned long long *)v596 = v44;
                                }
                            } while ((iter += 8, v591 += 8, iter != v590 + v564 * 8));
                        }
                        else
                        {
                            sub_c084b8(v590, v564);
                            goto LABEL_bf0a38;
                        }
                    }
                    goto LABEL_bf0a38;
                }
                else
                {
                    v572 = 8;
                }
            }
            sub_c6b970(v572, v577);
        }
        else
        {
            v4 = 1;
            v590 = 8;
LABEL_bf0a38:
            v597 = a1;
            v598 = *(unsigned long long *)&v15;
            v599 = v597->field_10;
            if ((unsigned long long)v599 > (unsigned long long)v598)
            {
                if (v564)
                {
                    v600 = 0;
                    v601 = 0;
                    v602 = 0;
                    v603 = *(long long *)(v597->field_8 + 144 * v598 + 16);
                    k = v564 * 8;
                    v605 = 8;
                    do
                    {
                        v606 = k;
                        v29 = v601;
                        v31 = v605;
                        v32 = v602;
                        v607 = *(long long *)(v590 + v606 - 8);
                        if (v602 == v601)
                        {
                            sub_c6c28c(&v29);
                            v605 = v31;
                        }
                        v608 = (st_bef304_3 *)(v605 + v600);
                        *(unsigned long long *)&v608->field_0 = v607;
                        v608->field_8 = v603 - 1;
                        v602 += 1;
                        v603 = (!v607 ? v603 : v607);
                        v601 = v29;
                        v605 = v31;
                        v600 += 16;
                        k = v606 - 8;
                    } while (k);
                    v597 = a1;
                    v598 = *(unsigned long long *)&v15;
                    v599 = v597->field_10;
                    if ((unsigned long long)v599 <= (unsigned long long)v598)
                        goto LABEL_bf10a4;
                    goto LABEL_bf0adc;
                }
                v601 = 0;
                v602 = 0;
                v605 = 8;
                if ((unsigned long long)v598 >= (unsigned long long)v599)
                {
LABEL_bf10a4:
                    goto LABEL_bf14ec;
                }
LABEL_bf0adc:
                l = *(char *)(v597->field_8 + 144 * v598 + 141);
                if (l)
                {
                    v610 = 0;
                    v5 = 1;
                    do
                    {
                        ptr1 = _malloc(40);
                        if (!ptr1)
                        {
                            sub_c6ba70(8, 40);
                            goto LABEL_bf1530;
                        }
                        *(uint128_t *)ptr1 = v5;
                        *(unsigned long *)(ptr1 + 16) = 0x8000000000000000;
                        if (index == *(unsigned long long *)&v16)
                            sub_c73880(&v16);
                        v610 += 1;
                        *(unsigned long long *)(*(unsigned long long *)((void*)&v16 + 8) + index * 8) = ptr1;
                        index += 1;
                    } while (l > v610);
                    v597 = a1;
                    v598 = *(unsigned long long *)&v15;
                    v599 = v597->field_10;
                }
                if ((unsigned long long)v599 > (unsigned long long)v598)
                {
                    v612 = *(char *)(v597->field_8 + 144 * v598 + 140);
                    if (v612)
                    {
                        v613 = 0;
                        v5 = 1;
                        while (1)
                        {
                            v614 = v613;
                            ptr2 = _malloc(40);
                            if (ptr2)
                            {
                                v616 = ptr2;
                                v613 = v614 + 1;
                                *(uint128_t *)ptr2 = v5;
                                *(unsigned long *)(ptr2 + 16) = 0x8000000000000000;
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ >= 0)
                                {
                                    v617 = v7;
                                    if (v617 == *(unsigned long long *)&v6)
                                        sub_c73880(&v6);
                                    *(unsigned long long *)(*(unsigned long long *)((void*)&v6 + 8) + v617 * 8) = v616;
                                    *(unsigned long long **)&v7 = (char *)v617 + 1;
                                    if (!_mm_cvtsi128_si64(v26))
                                        sub_c74750(&v25, &v27);
                                    i2 = 0;
                                    v619 = 0;
                                    v620 = 5871781006564002453 * v614;
                                    v621 = *(unsigned long long *)&v25;
                                    v622 = *(unsigned long long *)((void*)&v25 + 8);
                                    v623 = v620 >> 57;
                                    v624 = v623 | v623 * 0x100 | (v623 | v623 * 0x100) * 0x10000 | (v623 | v623 * 0x100 | (v623 | v623 * 0x100) * 0x10000) * 0x100000000;
                                    v625 = v620 & v622;
                                    v626 = *(long long *)((char *)v621 + v625);
                                    v628 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v626, v624));
                                    v629 = v628 & 0x8080808080808080;
                                    if (v628 & 0x8080808080808080)
                                    {
                                        while (1)
                                        {
LABEL_bf0c4c:
                                            v630 = v629;
                                            v631 = ((((((v630 & 0xaaaaaaaaaaaaaaaa) >> 1 | v630 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v630 & 0xaaaaaaaaaaaaaaaa) >> 1 | v630 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v630 & 0xaaaaaaaaaaaaaaaa) >> 1 | v630 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v630 & 0xaaaaaaaaaaaaaaaa) >> 1 | v630 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v632 = (((((((v630 & 0xaaaaaaaaaaaaaaaa) >> 1 | v630 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v630 & 0xaaaaaaaaaaaaaaaa) >> 1 | v630 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v630 & 0xaaaaaaaaaaaaaaaa) >> 1 | v630 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v630 & 0xaaaaaaaaaaaaaaaa) >> 1 | v630 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v633 = ((((v632 | v631) & 0xffff0000ffff0000) >> 16 | (v632 | v631) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v632 | v631) & 0xffff0000ffff0000) >> 16 | (v632 | v631) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            v634 = &v621[-2 * (v625 + ((!v633 ? 64 : Clz(v633)) >> 3) & v622)];
                                            if (v614 == *(long long *)((char *)v634 - 16))
                                                break;
                                            v629 = v630 - 1 & v630;
                                        }
                                        *(unsigned long long *)((char *)v634 - 8) = v616;
                                        do
                                        {
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                        } while (/* unsupported instruction */ ^ 1);
                                        v644 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                        if (!(v644 & 1))
                                        {
                                            /* unsupported instruction */;
                                            sub_b86a90();
                                        }
                                        if (v613 == v612)
                                        {
LABEL_bf0d84:
                                            v597 = a1;
                                            v598 = *(unsigned long long *)&v15;
                                            v599 = v597->field_10;
                                            goto LABEL_bf0d90;
                                        }
                                    }
                                    else
                                    {
                                        while (i2 != 1)
                                        {
                                            v44 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v626));
                                            if (v44)
                                            {
                                                v637 = ((((((v44 & 0xaaaaaaaaaaaaaaaa) >> 1 | v44 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v44 & 0xaaaaaaaaaaaaaaaa) >> 1 | v44 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v44 & 0xaaaaaaaaaaaaaaaa) >> 1 | v44 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v44 & 0xaaaaaaaaaaaaaaaa) >> 1 | v44 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                v638 = (((((((v44 & 0xaaaaaaaaaaaaaaaa) >> 1 | v44 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v44 & 0xaaaaaaaaaaaaaaaa) >> 1 | v44 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v44 & 0xaaaaaaaaaaaaaaaa) >> 1 | v44 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v44 & 0xaaaaaaaaaaaaaaaa) >> 1 | v44 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                v639 = ((((v638 | v637) & 0xffff0000ffff0000) >> 16 | (v638 | v637) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v638 | v637) & 0xffff0000ffff0000) >> 16 | (v638 | v637) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                v44 = v625 + ((!v639 ? 64 : Clz(v639)) >> 3) & v622;
                                                break;
                                            }
                                            i2 = 0;
LABEL_bf0cbc:
                                            v619 += 8;
                                            v625 = v619 + v625 & v622;
                                            v626 = *(long long *)((char *)v621 + v625);
                                            v643 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v626, v624));
                                            v629 = v643 & 0x8080808080808080;
                                            if (v643 & 0x8080808080808080)
                                                goto LABEL_bf0c4c;
                                        }
                                        v640 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v626, _mm_set1_epi8(-1)));
                                        if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v640, v640), _mm_unpacklo_epi64(v640, v640)))))))))) & 1))
                                        {
                                            i2 = 1;
                                            goto LABEL_bf0cbc;
                                        }
                                        v645 = *((char *)v621 + v44);
                                        if (!(v645 >> 31 & 1))
                                        {
                                            v647 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v621));
                                            v648 = ((((((v647 & 0xaaaaaaaaaaaaaaaa) >> 1 | v647 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v647 & 0xaaaaaaaaaaaaaaaa) >> 1 | v647 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v647 & 0xaaaaaaaaaaaaaaaa) >> 1 | v647 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v647 & 0xaaaaaaaaaaaaaaaa) >> 1 | v647 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v649 = (((((((v647 & 0xaaaaaaaaaaaaaaaa) >> 1 | v647 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v647 & 0xaaaaaaaaaaaaaaaa) >> 1 | v647 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v647 & 0xaaaaaaaaaaaaaaaa) >> 1 | v647 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v647 & 0xaaaaaaaaaaaaaaaa) >> 1 | v647 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v650 = ((((v649 | v648) & 0xffff0000ffff0000) >> 16 | (v649 | v648) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v649 | v648) & 0xffff0000ffff0000) >> 16 | (v649 | v648) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            v44 = (!v650 ? 64 : Clz(v650)) >> 3;
                                            v645 = *((char *)v621 + v44);
                                        }
                                        *((char *)v621 + v44) = v623;
                                        *((char *)v621 + (v622 & v44 - 8) + 8) = v623;
                                        v26 = _mm_sub_epi64(v26, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v645 & 1)));
                                        v652 = &v621[-2 * v44];
                                        *(unsigned long long *)((char *)v652 - 16) = v614;
                                        *(unsigned long long *)((char *)v652 - 8) = v616;
                                        if (v613 == v612)
                                            goto LABEL_bf0d84;
                                    }
                                }
                                else
                                {
                                    sub_c769bc();
LABEL_bf1378:
                                    v81 = &g_efb250;
LABEL_bf144c:
                                    sub_c73c64(v81);
                                    break;
                                }
                            }
                            else
                            {
                                sub_c6ba70(8, 40);
                                break;
                            }
                        }
                    }
                    else
                    {
LABEL_bf0d90:
                        if ((unsigned long long)v599 > (unsigned long long)v598)
                        {
                            *((char *)&v15 + 8) = *(char *)(v597->field_8 + 144 * v598 + 138);
                            if (v602)
                            {
                                v0 = &g_efb160;
                                v1 = v605 + v602 * 16;
                                v653 = (unsigned long long *)v605;
                                v2 = v590;
                                do
                                {
                                    if (!_mm_extract_epi64(v22, 1))
                                    {
LABEL_bf0fcc:
                                        sub_c73c64(&g_efb0e8);
                                        goto LABEL_bf1530;
                                    }
                                    v654 = 0;
                                    v655 = 5871781006564002453 * *v653;
                                    v656 = *(unsigned long long *)&v21;
                                    v657 = *(unsigned long long *)((void*)&v21 + 8);
                                    v658 = v655 >> 57 & 0xff | (v655 >> 57 & 0xff) * 0x100 | (v655 >> 57 & 0xff | (v655 >> 57 & 0xff) * 0x100) * 0x10000 | (v655 >> 57 & 0xff | (v655 >> 57 & 0xff) * 0x100 | (v655 >> 57 & 0xff | (v655 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                    v659 = v655 & v657;
                                    v660 = *(long long *)((char *)v656 + v659);
                                    v662 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v660, v658));
                                    v663 = v662 & 0x8080808080808080;
                                    if (!(v662 & 0x8080808080808080))
                                    {
                                        do
                                        {
LABEL_bf0e40:
                                            v664 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v660, _mm_set1_epi8(-1)));
                                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v664, v664), _mm_unpacklo_epi64(v664, v664)))))))))) & 1)
                                                goto LABEL_bf0fcc;
                                            v654 += 8;
                                            v659 = v659 + v654 & v657;
                                            v660 = *(long long *)((char *)v656 + v659);
                                            v667 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v660, v658));
                                            v663 = v667 & 0x8080808080808080;
                                        } while (!(v667 & 0x8080808080808080));
                                    }
                                    while (1)
                                    {
                                        v668 = v663;
                                        v669 = ((((((v668 & 0xaaaaaaaaaaaaaaaa) >> 1 | v668 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v668 & 0xaaaaaaaaaaaaaaaa) >> 1 | v668 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v668 & 0xaaaaaaaaaaaaaaaa) >> 1 | v668 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v668 & 0xaaaaaaaaaaaaaaaa) >> 1 | v668 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v670 = (((((((v668 & 0xaaaaaaaaaaaaaaaa) >> 1 | v668 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v668 & 0xaaaaaaaaaaaaaaaa) >> 1 | v668 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v668 & 0xaaaaaaaaaaaaaaaa) >> 1 | v668 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v668 & 0xaaaaaaaaaaaaaaaa) >> 1 | v668 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v671 = ((((v670 | v669) & 0xffff0000ffff0000) >> 16 | (v670 | v669) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v670 | v669) & 0xffff0000ffff0000) >> 16 | (v670 | v669) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        v672 = &v656[-2 * (v659 + ((!v671 ? 64 : Clz(v671)) >> 3) & v657)];
                                        if (*v653 == *(long long *)((char *)v672 - 16))
                                            break;
                                        v673 = v668 - 1;
                                        v663 = v673 & v668;
                                        if (!(v673 & v668))
                                            goto LABEL_bf0e40;
                                    }
                                    m = v653 + 2;
                                    v18 = 1;
                                    v19 = *(int *)((char *)v672 - 8);
                                    sub_bf1a54(&v29, &v6);
                                    v674 = v31;
                                    v5 = v35;
                                    if (v18 == 1)
                                    {
                                        v675 = v19;
                                        if (*(unsigned long long *)((void*)&v8 + 8) <= v675)
                                        {
                                            v0 = &g_efb178;
                                            goto LABEL_bf1514;
                                        }
                                        v676 = v8 + v675 * 32;
                                        if (*v676 == 0x8000000000000000)
                                        {
                                            v0 = &g_efb178;
                                            goto LABEL_bf1514;
                                        }
                                        n = v32 * 264;
                                        v30 = v674;
                                        v31 = v674;
                                        v32 = v29;
                                        v34 = v674 + n;
                                        v678 = v676[2];
                                        if (*v676 - v678 < v32)
                                        {
                                            sub_c6c0cc(v676, v678, v32, 8, 264);
                                            v678 = v676[2];
                                        }
                                        else if (!v32)
                                        {
                                            goto LABEL_bf0f18;
                                        }
                                        _memcpy(v676[1] + 264 * v678, v674, n);
LABEL_bf0f18:
                                        v676[2] = v678 + v32;
                                        v33 = v674;
                                        if (v29)
                                            _free(v674);
                                        v590 = v2;
                                        if (v18 != 1)
                                        {
                                            sub_c73c64(&g_efb190);
                                            goto LABEL_bf1530;
                                        }
                                    }
                                    else
                                    {
LABEL_bf1514:
                                        sub_c73c64(v0);
                                        goto LABEL_bf1530;
                                    }
                                    v29 = v33;
                                    v31 = v5;
                                    v32 = v36;
                                    sub_bd9184(&v37, &v6, v19, &v29);
                                    v679 = v39 + 1;
                                    while (1)
                                    {
                                        v680 = v679 - 1;
                                        if (v679 == 1)
                                            break;
                                        sub_bfdf4c();
                                        v679 = v680;
                                    }
                                    if (v37)
                                        _free(v38);
                                    v653 = m;
                                } while (m != v1);
                            }
                            if (v601)
                                _free(v605);
                            v681 = sub_bd8f3c(&v6);
                            v682 = _malloc(40);
                            if (v682)
                            {
                                v683 = (unsigned int *)v682;
                                if (_mm_extract_epi64(v22, 1))
                                {
                                    v684 = 0;
                                    v685 = *(unsigned long long *)&v21;
                                    v686 = *(unsigned long long *)((void*)&v21 + 8);
                                    v687 = 0 & v686;
                                    v688 = *(long long *)((char *)v685 + v687);
                                    v690 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v688, _mm_setzero_si128()));
                                    v691 = v690 & 0x8080808080808080;
                                    if (!(v690 & 0x8080808080808080))
                                        goto LABEL_bf105c;
                                    while (1)
                                    {
                                        do
                                        {
                                            v696 = v691;
                                            v697 = ((((((v696 & 0xaaaaaaaaaaaaaaaa) >> 1 | v696 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v696 & 0xaaaaaaaaaaaaaaaa) >> 1 | v696 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v696 & 0xaaaaaaaaaaaaaaaa) >> 1 | v696 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v696 & 0xaaaaaaaaaaaaaaaa) >> 1 | v696 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v698 = (((((((v696 & 0xaaaaaaaaaaaaaaaa) >> 1 | v696 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v696 & 0xaaaaaaaaaaaaaaaa) >> 1 | v696 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v696 & 0xaaaaaaaaaaaaaaaa) >> 1 | v696 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v696 & 0xaaaaaaaaaaaaaaaa) >> 1 | v696 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v699 = ((((v698 | v697) & 0xffff0000ffff0000) >> 16 | (v698 | v697) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v698 | v697) & 0xffff0000ffff0000) >> 16 | (v698 | v697) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            v700 = &v685[-2 * (v687 + ((!v699 ? 64 : Clz(v699)) >> 3) & v686)];
                                            if (!*(long long *)((char *)v700 - 16))
                                            {
                                                *v683 = *(int *)((char *)v700 - 8);
                                                *(unsigned long long *)&v683[2] = 0;
                                                *(unsigned long long *)&v683[4] = 8;
                                                *(unsigned long long *)&v683[6] = 0;
                                                *(char *)&v683[8] = 0;
                                                v29 = 1;
                                                v31 = v683;
                                                v32 = 1;
                                                sub_bd9184(&v37, &v6, v681, &v29);
                                                v702 = v38;
                                                v703 = v702 + 8;
                                                v704 = v39 + 1;
                                                while (1)
                                                {
                                                    v705 = v704 - 1;
                                                    if (v704 == 1)
                                                        break;
                                                    sub_bfdf4c();
                                                    v703 += 40;
                                                    v704 = v705;
                                                }
                                                if (v37)
                                                    v703 = _free(v702);
                                                v706 = v681 & 0xffffffff;
                                                if (*(unsigned long long *)((void*)&v8 + 8) > v706 && *(long long *)(v8 + v706 * 32) != 0x8000000000000000)
                                                {
                                                    *(unsigned int *)((char *)&v13 + 8) = 1;
                                                    *(unsigned int *)((char *)&v13 + 12) = v681;
                                                    if (!(v4 & 1))
                                                        v703 = _free(v590);
                                                    a0->field_60 = v12;
                                                    a0->field_70 = v13;
                                                    *(uint128_t *)&a0->padding_14[12] = v8;
                                                    a0->field_30 = v9;
                                                    a0->field_40 = v10;
                                                    a0->field_50 = v11;
                                                    a0->field_0 = v6;
                                                    *(uint128_t *)&a0->field_10 = v7;
                                                    a0->field_80 = v15;
                                                    a0->field_90 = v16;
                                                    *(uint128_t *)(a0->padding_a4)[1] = v23;
                                                    *(unsigned long long *)&a0->field_a0 = index;
                                                    *(uint128_t *)((char *)&a0->field_a8 + 8) = v24;
                                                    v707 = *(unsigned long long *)((void*)&v21 + 8);
                                                    if (v707)
                                                    {
                                                        v708 = v707 * 16;
                                                        v709 = arm64g_calculate_condition(2, (unsigned long long *)(v708 + (char *)v707), 25, 0);
                                                        if (!(v709 & 1))
                                                            v703 = _free(*(unsigned long long *)&v21 - v708 - 16);
                                                    }
                                                    v710 = *(unsigned long long *)((void*)&v25 + 8);
                                                    if (v710)
                                                    {
                                                        i10 = _mm_extract_epi64(v26, 1);
                                                        if (i10)
                                                        {
                                                            v712 = *(unsigned long long *)&v25;
                                                            v713 = *(unsigned long long *)&v25 + 8;
                                                            i12 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)*(unsigned long long *)(void*)&v25)) & 0x8080808080808080;
                                                            do
                                                            {
                                                                v716 = v713;
                                                                if (!i12)
                                                                {
                                                                    do
                                                                    {
                                                                        v716 = v713 + 1;
                                                                        v712 = (char *)v712 - 128;
                                                                        i12 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v713)) & 0x8080808080808080;
                                                                        v713 = v716;
                                                                    } while (!i12);
                                                                }
                                                                v713 = v716;
                                                                v718 = ((((((i12 & 0xaaaaaaaaaaaaaaaa) >> 1 | i12 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i12 & 0xaaaaaaaaaaaaaaaa) >> 1 | i12 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i12 & 0xaaaaaaaaaaaaaaaa) >> 1 | i12 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i12 & 0xaaaaaaaaaaaaaaaa) >> 1 | i12 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                                v719 = (((((((i12 & 0xaaaaaaaaaaaaaaaa) >> 1 | i12 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i12 & 0xaaaaaaaaaaaaaaaa) >> 1 | i12 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i12 & 0xaaaaaaaaaaaaaaaa) >> 1 | i12 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i12 & 0xaaaaaaaaaaaaaaaa) >> 1 | i12 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                                v720 = ((((v719 | v718) & 0xffff0000ffff0000) >> 16 | (v719 | v718) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v719 | v718) & 0xffff0000ffff0000) >> 16 | (v719 | v718) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                                i12 &= i12 - 1;
                                                                i10 -= 1;
                                                                do
                                                                {
                                                                    /* unsupported instruction */;
                                                                    /* unsupported instruction */;
                                                                    /* unsupported instruction */;
                                                                } while (/* unsupported instruction */ ^ 1);
                                                                v721 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                                                if (!(v721 & 1))
                                                                {
                                                                    /* unsupported instruction */;
                                                                    v703 = sub_b86a90(*(long long *)((char *)v712 - ((!v720 ? 64 : Clz(v720)) * 2 & 240) - 8));
                                                                }
                                                            } while (i10);
                                                        }
                                                        v722 = v710 * 16;
                                                        v723 = arm64g_calculate_condition(2, (unsigned long long *)(v722 + (char *)v710), 25, 0);
                                                        if (!(v723 & 1))
                                                            v703 = _free(*(unsigned long long *)&v25 - v722 - 16);
                                                    }
                                                    v724 = *(unsigned long long *)((void*)&v27 + 8);
                                                    if (v724)
                                                    {
                                                        i11 = *(unsigned long long *)((void*)&v28 + 8);
                                                        if (i11)
                                                        {
                                                            v726 = *(unsigned long long *)&v27;
                                                            v727 = *(unsigned long long *)&v27 + 8;
                                                            i13 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)*(unsigned long long *)(void*)&v27)) & 0x8080808080808080;
                                                            do
                                                            {
                                                                v730 = v727;
                                                                if (!i13)
                                                                {
                                                                    do
                                                                    {
                                                                        v730 = v727 + 1;
                                                                        v726 = (char *)v726 - 0x100;
                                                                        i13 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v727)) & 0x8080808080808080;
                                                                        v727 = v730;
                                                                    } while (!i13);
                                                                }
                                                                v727 = v730;
                                                                v732 = ((((((i13 & 0xaaaaaaaaaaaaaaaa) >> 1 | i13 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i13 & 0xaaaaaaaaaaaaaaaa) >> 1 | i13 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i13 & 0xaaaaaaaaaaaaaaaa) >> 1 | i13 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i13 & 0xaaaaaaaaaaaaaaaa) >> 1 | i13 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                                v733 = (((((((i13 & 0xaaaaaaaaaaaaaaaa) >> 1 | i13 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i13 & 0xaaaaaaaaaaaaaaaa) >> 1 | i13 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i13 & 0xaaaaaaaaaaaaaaaa) >> 1 | i13 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i13 & 0xaaaaaaaaaaaaaaaa) >> 1 | i13 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                                v734 = ((((v733 | v732) & 0xffff0000ffff0000) >> 16 | (v733 | v732) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v733 | v732) & 0xffff0000ffff0000) >> 16 | (v733 | v732) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                                v735 = (char *)v726 - ((!v734 ? 64 : Clz(v734)) * 4 & 480);
                                                                if (*(long long *)((char *)v735 - 24) >= 1)
                                                                    v703 = _free(*(long long *)((char *)v735 - 16));
                                                                i13 &= i13 - 1;
                                                                i11 -= 1;
                                                            } while (i11);
                                                        }
                                                        v736 = v724 * 32;
                                                        v737 = arm64g_calculate_condition(2, (unsigned long long *)(v736 + (char *)v724), 41, 0);
                                                        if (!(v737 & 1))
                                                            v703 = _free(*(unsigned long long *)&v27 - v736 - 32);
                                                    }
                                                    return v703;
                                                }
                                                v29 = &g_efa478;
                                                v31 = &g_be766c;
                                                sub_c73b38(&g_cba67f, &v29, &g_efa488);
                                                goto LABEL_bf1530;
                                            }
                                        } while ((v701 = v696 - 1, v691 = v701 & v696, v701 & v696));
                                        do
                                        {
LABEL_bf105c:
                                            v692 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v688, _mm_set1_epi8(-1)));
                                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v692, v692), _mm_unpacklo_epi64(v692, v692)))))))))) & 1)
                                                goto LABEL_bf1344;
                                            v684 += 8;
                                            v687 = v687 + v684 & v686;
                                            v688 = *(long long *)((char *)v685 + v687);
                                            v695 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v688, _mm_setzero_si128()));
                                            v691 = v695 & 0x8080808080808080;
                                        } while (!(v695 & 0x8080808080808080));
                                    }
                                }
                                else
                                {
LABEL_bf1344:
                                    sub_c73c64(&g_efb0e8);
                                }
                            }
                            else
                            {
                                sub_c6ba70(8, 40);
                            }
                        }
                        else
                        {
LABEL_bf14ec:
                            sub_c73c94();
                        }
                    }
                }
                else
                {
                    goto LABEL_bf14ec;
                }
            }
            else
            {
                sub_c73c94(v598, v599, &g_efb100);
            }
        }
    }
    else
    {
        sub_c73c94(v76, v75->field_10, &g_efb1a8);
    }
LABEL_bf1530:
    __debugbreak();
}
