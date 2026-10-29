/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f0f60..0x9f204c (4332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f0f60_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    uint128_t field_c0;
    uint128_t field_d0;
    uint128_t field_e0;
    uint128_t field_f0;
    uint128_t field_100;
    uint128_t field_110;
    uint128_t field_120;
    uint128_t field_130;
    uint128_t field_140;
    uint128_t field_150;
    uint128_t field_160;
    uint128_t field_170;
    uint128_t field_180;
    uint128_t field_190;
    uint128_t field_1a0;
    uint128_t field_1b0;
} st_9f0f60_1;

typedef struct st_9f0f60_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    uint128_t field_c0;
    uint128_t field_d0;
    uint128_t field_e0;
    uint128_t field_f0;
    uint128_t field_100;
    uint128_t field_110;
    uint128_t field_120;
    uint128_t field_130;
    uint128_t field_140;
    uint128_t field_150;
    uint128_t field_160;
    uint128_t field_170;
    uint128_t field_180;
    uint128_t field_190;
    uint128_t field_1a0;
    uint128_t field_1b0;
    uint128_t field_1c0;
    uint128_t field_1d0;
    uint128_t field_1e0;
    uint128_t field_1f0;
} st_9f0f60_0;


st_9f0f60_0 * sub_9f0f60(st_9f0f60_0 *a0, st_9f0f60_0 *a1, unsigned long long a2, void* a3, void* a4)
{
    __m128i v15;  // q0
    unsigned long v16;  // x24
    __m128i v25;  // q5
    __m128i v115;  // q22
    unsigned long long v116;  // x10
    __m128i v117;  // q26
    unsigned long long v118;  // x11
    __m128i v119;  // q30
    unsigned long long v120;  // x12
    unsigned long long v121;  // x5
    unsigned long long v122;  // x6
    unsigned long long v123;  // x7
    unsigned long long v124;  // x8
    __m128i v26;  // q6
    unsigned long long v125;  // x17
    unsigned long long v126;  // x19
    unsigned long long v127;  // x20
    unsigned long long v128;  // x21
    __m128i v129;  // q9
    unsigned long long v130;  // x13
    __m128i v131;  // q13
    unsigned long long v132;  // x14
    __m128i v133;  // q17
    unsigned long long v134;  // x15
    __m128i v27;  // q7
    __m128i v135;  // q21
    unsigned long long v136;  // x16
    __m128i v137;  // q25
    __m128i v138;  // q29
    __m128i v139;  // q8
    __m128i v140;  // q12
    __m128i v141;  // q16
    unsigned long long v142;  // x9
    __m128i v143;  // q20
    unsigned long long v144;  // x10
    unsigned long long v28;  // d10
    __m128i v145;  // q24
    unsigned long long v146;  // x11
    __m128i v147;  // q28
    unsigned long long v148;  // x12
    unsigned long long v149;  // x5
    unsigned long long v150;  // x6
    unsigned long long v151;  // x7
    unsigned long long v152;  // x8
    __m128i v153;  // q11
    __m128i v154;  // q15
    unsigned long long v29;  // d11
    __m128i v155;  // q19
    unsigned long long v156;  // x21
    __m128i v157;  // q23
    unsigned long long v158;  // x17
    __m128i v159;  // q27
    unsigned long long v160;  // x19
    __m128i v161;  // q31
    unsigned long long v162;  // x20
    __m128i v163;  // q10
    unsigned long long v164;  // x15
    unsigned long long v30;  // d12
    __m128i v165;  // q14
    unsigned long long v166;  // x16
    __m128i v167;  // q18
    unsigned long long v168;  // x13
    __m128i v169;  // q22
    unsigned long long v170;  // x14
    __m128i v171;  // q26
    __m128i v172;  // q30
    unsigned long long v173;  // x10
    unsigned long long v174;  // x11
    unsigned long long v31;  // d13
    unsigned long long v175;  // x12
    unsigned long long v176;  // x9
    unsigned long long v177;  // x5
    unsigned long long v178;  // x6
    unsigned long long v179;  // x7
    unsigned long long v180;  // x8
    unsigned long long v181;  // x21
    unsigned long long v182;  // x17
    unsigned long long v183;  // x19
    unsigned long long v184;  // x20
    unsigned long long v32;  // d14
    unsigned long long v186;  // x15
    unsigned long long v188;  // x16
    unsigned long long v190;  // x13
    unsigned long long v192;  // x14
    unsigned long long v33;  // d15
    unsigned long long v198;  // x10
    unsigned long long v200;  // x11
    unsigned long long v202;  // x12
    unsigned long long v204;  // x9
    unsigned long long v34;  // x2
    __m128i v205;  // q9
    __m128i v206;  // q13
    __m128i v207;  // q17
    __m128i v208;  // q21
    __m128i v209;  // q25
    __m128i v210;  // q29
    __m128i v211;  // q8
    unsigned long long v212;  // x5
    __m128i v213;  // q12
    unsigned long long v214;  // x6
    unsigned long long v17;  // x25
    unsigned long long v35;  // x5
    __m128i v215;  // q16
    unsigned long long v216;  // x7
    __m128i v217;  // q20
    unsigned long long v218;  // x8
    __m128i v219;  // q24
    __m128i v220;  // q28
    unsigned long long v221;  // x17
    unsigned long long v222;  // x19
    unsigned long long v223;  // x20
    unsigned long long v224;  // x21
    unsigned long long v36;  // x6
    __m128i v225;  // q11
    unsigned long long v226;  // x13
    __m128i v227;  // q15
    unsigned long long v228;  // x14
    __m128i v229;  // q19
    unsigned long long v230;  // x15
    __m128i v231;  // q23
    unsigned long long v232;  // x16
    __m128i v233;  // q27
    __m128i v234;  // q31
    unsigned long long v37;  // x7
    __m128i v235;  // q10
    __m128i v236;  // q14
    __m128i v237;  // q18
    unsigned long long v238;  // x9
    __m128i v239;  // q22
    unsigned long long v240;  // x10
    __m128i v241;  // q26
    unsigned long long v242;  // x11
    __m128i v243;  // q30
    unsigned long long v244;  // x12
    unsigned long long v38;  // x8
    unsigned long long v245;  // x5
    unsigned long long v246;  // x6
    unsigned long long v247;  // x7
    unsigned long long v248;  // x8
    unsigned long long v249;  // x17
    unsigned long long v250;  // x19
    unsigned long long v251;  // x20
    unsigned long long v252;  // x21
    __m128i v253;  // q9
    unsigned long long v254;  // x13
    unsigned long long v39;  // x9
    __m128i v255;  // q13
    unsigned long long v256;  // x14
    __m128i v257;  // q17
    unsigned long long v258;  // x15
    __m128i v259;  // q21
    unsigned long long v260;  // x16
    __m128i v261;  // q25
    __m128i v262;  // q29
    unsigned long long v263;  // x9
    unsigned long long v264;  // x10
    unsigned long long v40;  // x10
    unsigned long long v265;  // x11
    unsigned long long v266;  // x12
    unsigned long long v267;  // x5
    unsigned long long v268;  // x6
    unsigned long long v269;  // x7
    unsigned long long v270;  // x8
    __m128i v271;  // q11
    __m128i v272;  // q15
    __m128i v273;  // q19
    unsigned long long v274;  // x21
    __m128i v41;  // q11
    __m128i v275;  // q23
    unsigned long long v276;  // x17
    __m128i v277;  // q27
    unsigned long long v278;  // x19
    __m128i v279;  // q31
    unsigned long long v280;  // x20
    __m128i v281;  // q10
    unsigned long long v282;  // x15
    __m128i v283;  // q14
    unsigned long long v284;  // x16
    unsigned long long v42;  // x11
    __m128i v285;  // q18
    unsigned long long v286;  // x13
    __m128i v287;  // q22
    unsigned long long v288;  // x14
    __m128i v289;  // q26
    __m128i v290;  // q30
    unsigned long long v291;  // x10
    unsigned long long v292;  // x11
    unsigned long long v293;  // x12
    unsigned long long v294;  // x9
    __m128i v43;  // q15
    unsigned long long v295;  // x8
    unsigned long long v296;  // x10
    unsigned long long v297;  // x12
    unsigned long long v298;  // x14
    unsigned long long v299;  // x16
    unsigned long long v300;  // x19
    unsigned long long v301;  // x21
    st_9f0f60_1 *v302;  // x1
    unsigned long v303;  // x28
    unsigned long long v304;  // x5
    unsigned long long v44;  // x12
    unsigned long long v305;  // x6
    unsigned long long v306;  // x7
    unsigned long long v307;  // x8
    unsigned long long v308;  // x9
    unsigned long long v309;  // x10
    st_9f0f60_1 *v310;  // x0
    unsigned long long v311;  // x11
    unsigned long long v312;  // x12
    unsigned long long v313;  // x13
    unsigned long long v314;  // x14
    unsigned long v18;  // x26
    unsigned long long v45;  // x13
    unsigned long long v315;  // x15
    unsigned long long v316;  // x16
    unsigned long long v317;  // x17
    unsigned long long v318;  // x19
    unsigned long long v319;  // x20
    unsigned long long v320;  // x21
    char *v321;  // x4
    __m128i v322;  // q8
    unsigned long long v323;  // x5
    __m128i v324;  // q12
    unsigned long long v46;  // x14
    unsigned long long v325;  // x6
    __m128i v326;  // q16
    unsigned long long v327;  // x7
    __m128i v328;  // q20
    unsigned long long v329;  // x8
    __m128i v330;  // q24
    __m128i v331;  // q28
    unsigned long long v332;  // x17
    unsigned long long v333;  // x19
    unsigned long long v334;  // x20
    unsigned long long v47;  // x15
    unsigned long long v335;  // x21
    __m128i v336;  // q11
    unsigned long long v337;  // x13
    __m128i v338;  // q15
    unsigned long long v339;  // x14
    __m128i v340;  // q19
    unsigned long long v341;  // x15
    __m128i v342;  // q23
    unsigned long long v343;  // x16
    __m128i v344;  // q27
    unsigned long long v48;  // x16
    __m128i v345;  // q31
    __m128i v346;  // q10
    __m128i v347;  // q14
    __m128i v348;  // q18
    unsigned long long v349;  // x9
    __m128i v350;  // q22
    unsigned long long v351;  // x10
    __m128i v352;  // q26
    unsigned long long v353;  // x11
    __m128i v354;  // q30
    __m128i v49;  // q27
    unsigned long long v355;  // x12
    unsigned long long v356;  // x5
    unsigned long long v357;  // x6
    unsigned long long v358;  // x7
    unsigned long long v359;  // x8
    unsigned long long v360;  // x17
    unsigned long long v361;  // x19
    unsigned long long v362;  // x20
    unsigned long long v363;  // x21
    __m128i v364;  // q9
    unsigned long long v50;  // x17
    unsigned long long v365;  // x13
    __m128i v366;  // q13
    unsigned long long v367;  // x14
    __m128i v368;  // q17
    unsigned long long v369;  // x15
    __m128i v370;  // q21
    unsigned long long v371;  // x16
    __m128i v372;  // q25
    __m128i v373;  // q29
    __m128i v374;  // q8
    __m128i v51;  // q31
    __m128i v375;  // q12
    __m128i v376;  // q16
    unsigned long long v377;  // x9
    __m128i v378;  // q20
    unsigned long long v379;  // x10
    __m128i v380;  // q24
    unsigned long long v381;  // x11
    __m128i v382;  // q28
    unsigned long long v383;  // x12
    unsigned long long v384;  // x5
    unsigned long long v52;  // x19
    unsigned long long v385;  // x6
    unsigned long long v386;  // x7
    unsigned long long v387;  // x8
    __m128i v388;  // q11
    __m128i v389;  // q15
    __m128i v390;  // q19
    unsigned long long v391;  // x21
    __m128i v392;  // q23
    unsigned long long v393;  // x17
    __m128i v394;  // q27
    unsigned long long v53;  // x20
    unsigned long long v395;  // x19
    __m128i v396;  // q31
    unsigned long long v397;  // x20
    __m128i v398;  // q10
    unsigned long long v399;  // x15
    __m128i v400;  // q14
    unsigned long long v401;  // x16
    __m128i v402;  // q18
    unsigned long long v403;  // x13
    __m128i v404;  // q22
    unsigned long long v54;  // x21
    unsigned long long v405;  // x14
    __m128i v406;  // q26
    __m128i v407;  // q30
    unsigned long long v408;  // x10
    unsigned long long v409;  // x11
    unsigned long long v410;  // x12
    unsigned long long v411;  // x9
    unsigned long long v412;  // x5
    unsigned long long v413;  // x6
    unsigned long long v414;  // x7
    unsigned long long v19;  // x27
    char *v55;  // x4
    unsigned long long v415;  // x8
    unsigned long long v416;  // x21
    unsigned long long v417;  // x17
    unsigned long long v418;  // x19
    unsigned long long v419;  // x20
    unsigned long long v421;  // x15
    unsigned long long v423;  // x16
    unsigned long long v56;  // x2
    unsigned long long v425;  // x13
    unsigned long long v427;  // x14
    unsigned long long v433;  // x10
    __m128i v57;  // q12
    unsigned long long v435;  // x11
    unsigned long long v437;  // x12
    unsigned long long v439;  // x9
    __m128i v440;  // q9
    __m128i v441;  // q13
    __m128i v442;  // q17
    __m128i v443;  // q21
    __m128i v444;  // q25
    __m128i v58;  // q16
    __m128i v445;  // q29
    __m128i v446;  // q8
    unsigned long long v447;  // x5
    __m128i v448;  // q12
    unsigned long long v449;  // x6
    __m128i v450;  // q16
    unsigned long long v451;  // x7
    __m128i v452;  // q20
    unsigned long long v453;  // x8
    __m128i v454;  // q24
    __m128i v59;  // q20
    __m128i v455;  // q28
    unsigned long long v456;  // x17
    unsigned long long v457;  // x19
    unsigned long long v458;  // x20
    unsigned long long v459;  // x21
    __m128i v460;  // q11
    unsigned long long v461;  // x13
    __m128i v462;  // q15
    unsigned long long v463;  // x14
    __m128i v464;  // q19
    __m128i v60;  // q24
    unsigned long long v465;  // x15
    __m128i v466;  // q23
    unsigned long long v467;  // x16
    __m128i v468;  // q27
    __m128i v469;  // q31
    __m128i v470;  // q10
    __m128i v471;  // q14
    __m128i v472;  // q18
    unsigned long long v473;  // x9
    __m128i v474;  // q22
    __m128i v61;  // q28
    unsigned long long v475;  // x10
    __m128i v476;  // q26
    unsigned long long v477;  // x11
    __m128i v478;  // q30
    unsigned long long v479;  // x12
    unsigned long long v480;  // x5
    unsigned long long v481;  // x6
    unsigned long long v482;  // x7
    unsigned long long v483;  // x8
    unsigned long long v484;  // x17
    __m128i v62;  // q13
    unsigned long long v485;  // x19
    unsigned long long v486;  // x20
    unsigned long long v487;  // x21
    __m128i v488;  // q9
    unsigned long long v489;  // x13
    __m128i v490;  // q13
    unsigned long long v491;  // x14
    __m128i v492;  // q17
    unsigned long long v493;  // x15
    __m128i v494;  // q21
    __m128i v63;  // q17
    unsigned long long v495;  // x16
    __m128i v496;  // q25
    __m128i v497;  // q29
    unsigned long long v498;  // x9
    unsigned long long v499;  // x10
    unsigned long long v500;  // x11
    unsigned long long v501;  // x12
    unsigned long long v502;  // x5
    unsigned long long v503;  // x6
    unsigned long long v504;  // x7
    __m128i v64;  // q21
    unsigned long long v505;  // x8
    __m128i v506;  // q11
    __m128i v507;  // q15
    __m128i v508;  // q19
    unsigned long long v509;  // x21
    __m128i v510;  // q23
    unsigned long long v511;  // x17
    __m128i v512;  // q27
    unsigned long long v513;  // x19
    __m128i v514;  // q31
    __m128i v20;  // q2
    __m128i v65;  // q25
    unsigned long long v515;  // x20
    __m128i v516;  // q10
    unsigned long long v517;  // x15
    __m128i v518;  // q14
    unsigned long long v519;  // x16
    __m128i v520;  // q18
    unsigned long long v521;  // x13
    __m128i v522;  // q22
    unsigned long long v523;  // x14
    __m128i v524;  // q26
    __m128i v66;  // q29
    __m128i v525;  // q30
    unsigned long long v526;  // x10
    unsigned long long v527;  // x11
    unsigned long long v528;  // x12
    unsigned long long v529;  // x9
    __m128i v530;  // q0
    __m128i v531;  // q1
    __m128i v532;  // q2
    unsigned long v533;  // x8
    unsigned long v534;  // x10
    __m128i v67;  // q14
    unsigned long v535;  // x12
    unsigned long v536;  // x14
    unsigned long v537;  // x16
    unsigned long v538;  // x19
    unsigned long v539;  // x21
    uint128_t *v540;  // x1
    __m128i v541;  // q3
    __m128i v542;  // q2
    __m128i v543;  // q1
    __m128i v544;  // q0
    __m128i v68;  // q18
    uint128_t *v545;  // x1
    __m128i v546;  // q3
    __m128i v547;  // q2
    __m128i v548;  // q1
    __m128i v549;  // q0
    uint128_t *v550;  // x1
    uint128_t *v551;  // x0
    uint128_t *v552;  // x0
    __m128i v553;  // q11
    __m128i v554;  // q10
    __m128i v69;  // q22
    __m128i v555;  // q9
    __m128i v556;  // q8
    uint128_t *v557;  // x1
    uint128_t *v558;  // x0
    __m128i v559;  // q15
    __m128i v560;  // q14
    __m128i v561;  // q13
    __m128i v562;  // q12
    uint128_t *v563;  // x1
    uint128_t *v564;  // x0
    __m128i v70;  // q26
    __m128i v565;  // q19
    __m128i v566;  // q18
    __m128i v567;  // q17
    __m128i v568;  // q16
    uint128_t *v569;  // x1
    uint128_t *v570;  // x0
    __m128i v571;  // q23
    __m128i v572;  // q22
    __m128i v573;  // q21
    __m128i v574;  // q20
    __m128i v71;  // q30
    uint128_t *v575;  // x0
    __m128i v576;  // q8
    unsigned long long v577;  // 4197
    unsigned long long v578;  // 4158
    __m128i v21;  // q1
    __m128i v77;  // q25
    __m128i v78;  // q21
    __m128i v79;  // q17
    __m128i v80;  // q13
    __m128i v81;  // q9
    unsigned long v22;  // x28
    __m128i v87;  // q8
    unsigned long long v88;  // x5
    __m128i v89;  // q12
    unsigned long long v90;  // x6
    __m128i v91;  // q16
    unsigned long long v92;  // x7
    __m128i v93;  // q20
    unsigned long long v94;  // x8
    __m128i v23;  // q3
    __m128i v95;  // q24
    __m128i v96;  // q28
    unsigned long long v97;  // x17
    unsigned long long v98;  // x19
    unsigned long long v99;  // x20
    unsigned long long v100;  // x21
    __m128i v101;  // q11
    unsigned long long v102;  // x13
    __m128i v103;  // q15
    unsigned long long v104;  // x14
    __m128i v24;  // q4
    __m128i v105;  // q19
    unsigned long long v106;  // x15
    __m128i v107;  // q23
    unsigned long long v108;  // x16
    __m128i v109;  // q27
    __m128i v110;  // q31
    __m128i v111;  // q10
    __m128i v112;  // q14
    __m128i v113;  // q18
    unsigned long long v114;  // x9
    __m128i v0;  // [bp-0x120]
    __m128i v1;  // [bp-0x110]
    __m128i v2;  // [bp-0x100]
    __m128i v3;  // [bp-0xf0]
    __m128i v4;  // [bp-0xe0]
    __m128i v5;  // [bp-0xd0]
    __m128i v6;  // [bp-0xc0]
    unsigned long long v7;  // [bp-0x90]
    unsigned long long v8;  // [bp-0x88]
    unsigned long long v9;  // [bp-0x80]
    unsigned long long v10;  // [bp-0x78]
    unsigned long long v11;  // [bp-0x70]
    unsigned long long v12;  // [bp-0x68]
    char *v13;  // [bp-0x60]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = _mm_set_epi64x(7719281312240119090, 3684054920433006693);
    v16 = *(long long *)a3;
    v17 = (long long)a3[8];
    v18 = (long long)a3[16];
    v19 = (long long)a3[24];
    v20 = (int128_t)a3[16];
    v21 = *(int128_t *)a3;
    v22 = *(long long *)a4;
    x30 = (long long)a4[8];
    strncpy(&v0, "expand 32-byte k", 16);
    v1 = v21;
    v23 = _mm_add_epi32(_mm_add_epi32(*(int128_t *)a4, _mm_set_epi32(0, 0, 0, 1)), _mm_set_epi32(0, 0, 0, 1));
    v2 = v20;
    v24 = _mm_add_epi32(v23, _mm_set_epi32(0, 0, 0, 1));
    v25 = _mm_add_epi32(v24, _mm_set_epi32(0, 0, 0, 1));
    v26 = _mm_add_epi32(v25, _mm_set_epi32(0, 0, 0, 1));
    v27 = _mm_slli_epi32(_mm_set_epi32(0, 0, 0, 1), 2);
    v7 = v28;
    v8 = v29;
    v9 = v30;
    v10 = v31;
    v11 = v32;
    v12 = v33;
    v34 = a2 - 0x200;
    do
    {
        v35 = 1634760805;
        v36 = 857760878;
        v37 = 2036477234;
        v38 = 1797285236;
        v39 = v16 & 0xffffffff;
        v40 = v16 >> 32;
        v41 = v23;
        v42 = v17 & 0xffffffff;
        v43 = v24;
        v44 = v17 >> 32;
        v45 = v18 & 0xffffffff;
        v46 = v18 >> 32;
        v47 = v19 & 0xffffffff;
        v48 = v19 >> 32;
        v49 = _mm_add_epi32(v41, v27);
        v50 = v22 & 0xffffffff;
        v51 = _mm_add_epi32(v43, v27);
        v52 = v22 >> 32;
        v53 = x30 & 0xffffffff;
        v54 = (unsigned int)(x30) >> 32;
        v3 = v23;
        v4 = v24;
        v5 = v25;
        v6 = v26;
        v55 = 5;
        v56 = v34 - 0x200;
        v57 = v15;
        v58 = v15;
        v59 = v15;
        v60 = v15;
        v61 = v15;
        v62 = v21;
        v63 = v21;
        v64 = v21;
        v65 = v21;
        v66 = v21;
        v67 = v20;
        v68 = v20;
        v69 = v20;
        v70 = v20;
        v71 = v20;
        do
        {
            v77 = v65;
            v78 = v64;
            v79 = v63;
            v80 = v62;
            v81 = v21;
            v55 -= 1;
            v87 = _mm_add_epi32(v15, v81);
            v88 = v35 + v39;
            v89 = _mm_add_epi32(v57, v80);
            v90 = v36 + v40;
            v91 = _mm_add_epi32(v58, v79);
            v92 = v37 + v42;
            v93 = _mm_add_epi32(v59, v78);
            v94 = v38 + v44;
            v95 = _mm_add_epi32(v60, v77);
            v96 = _mm_add_epi32(v61, v66);
            v97 = ((unsigned int)v50 ^ (unsigned int)v88) * 0x10000 | ((unsigned int)v50 ^ (unsigned int)v88) >> 16;
            v98 = ((unsigned int)v52 ^ (unsigned int)v90) * 0x10000 | ((unsigned int)v52 ^ (unsigned int)v90) >> 16;
            v99 = ((unsigned int)v53 ^ (unsigned int)v92) * 0x10000 | ((unsigned int)v53 ^ (unsigned int)v92) >> 16;
            v100 = ((unsigned int)v54 ^ (unsigned int)v94) * 0x10000 | ((unsigned int)v54 ^ (unsigned int)v94) >> 16;
            v101 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v87, v41));
            v102 = v45 + v97;
            v103 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v89, v43));
            v104 = v46 + v98;
            v105 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v91, v25));
            v106 = v47 + v99;
            v107 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v93, v26));
            v108 = v48 + v100;
            v109 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v95, v49));
            v110 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v96, v51));
            v111 = _mm_add_epi32(v20, v101);
            v112 = _mm_add_epi32(v67, v103);
            v113 = _mm_add_epi32(v68, v105);
            v114 = ((unsigned int)v39 ^ (unsigned int)v102) * 0x1000 | ((unsigned int)v39 ^ (unsigned int)v102) >> 20;
            v115 = _mm_add_epi32(v69, v107);
            v116 = ((unsigned int)v40 ^ (unsigned int)v104) * 0x1000 | ((unsigned int)v40 ^ (unsigned int)v104) >> 20;
            v117 = _mm_add_epi32(v70, v109);
            v118 = ((unsigned int)v42 ^ (unsigned int)v106) * 0x1000 | ((unsigned int)v42 ^ (unsigned int)v106) >> 20;
            v119 = _mm_add_epi32(v71, v110);
            v120 = ((unsigned int)v44 ^ (unsigned int)v108) * 0x1000 | ((unsigned int)v44 ^ (unsigned int)v108) >> 20;
            v121 = v88 + v114;
            v122 = v90 + v116;
            v123 = v92 + v118;
            v124 = v94 + v120;
            v125 = ((unsigned int)v97 ^ (unsigned int)v121) * 0x100 | ((unsigned int)v97 ^ (unsigned int)v121) >> 24;
            v126 = ((unsigned int)v98 ^ (unsigned int)v122) * 0x100 | ((unsigned int)v98 ^ (unsigned int)v122) >> 24;
            v127 = ((unsigned int)v99 ^ (unsigned int)v123) * 0x100 | ((unsigned int)v99 ^ (unsigned int)v123) >> 24;
            v128 = ((unsigned int)v100 ^ (unsigned int)v124) * 0x100 | ((unsigned int)v100 ^ (unsigned int)v124) >> 24;
            v129 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v111, v81), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v111, v81), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v130 = v102 + v125;
            v131 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v112, v80), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v112, v80), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v132 = v104 + v126;
            v133 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v113, v79), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v113, v79), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v134 = v106 + v127;
            v135 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v115, v78), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v115, v78), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v136 = v108 + v128;
            v137 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v117, v77), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v117, v77), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v138 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v119, v66), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v119, v66), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v139 = _mm_add_epi32(v87, v129);
            v140 = _mm_add_epi32(v89, v131);
            v141 = _mm_add_epi32(v91, v133);
            v142 = ((unsigned int)v114 ^ (unsigned int)v130) * 128 | ((unsigned int)v114 ^ (unsigned int)v130) >> 25;
            v143 = _mm_add_epi32(v93, v135);
            v144 = ((unsigned int)v116 ^ (unsigned int)v132) * 128 | ((unsigned int)v116 ^ (unsigned int)v132) >> 25;
            v145 = _mm_add_epi32(v95, v137);
            v146 = ((unsigned int)v118 ^ (unsigned int)v134) * 128 | ((unsigned int)v118 ^ (unsigned int)v134) >> 25;
            v147 = _mm_add_epi32(v96, v138);
            v148 = ((unsigned int)v120 ^ (unsigned int)v136) * 128 | ((unsigned int)v120 ^ (unsigned int)v136) >> 25;
            v149 = v121 + v144;
            v150 = v122 + v146;
            v151 = v123 + v148;
            v152 = v124 + v142;
            v153 = _mm_and_si128(PermV(_mm_xor_si128(v139, v101), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v154 = _mm_and_si128(PermV(_mm_xor_si128(v140, v103), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v155 = _mm_and_si128(PermV(_mm_xor_si128(v141, v105), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v156 = ((unsigned int)v128 ^ (unsigned int)v149) * 0x10000 | ((unsigned int)v128 ^ (unsigned int)v149) >> 16;
            v157 = _mm_and_si128(PermV(_mm_xor_si128(v143, v107), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v158 = ((unsigned int)v125 ^ (unsigned int)v150) * 0x10000 | ((unsigned int)v125 ^ (unsigned int)v150) >> 16;
            v159 = _mm_and_si128(PermV(_mm_xor_si128(v145, v109), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v160 = ((unsigned int)v126 ^ (unsigned int)v151) * 0x10000 | ((unsigned int)v126 ^ (unsigned int)v151) >> 16;
            v161 = _mm_and_si128(PermV(_mm_xor_si128(v147, v110), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v162 = ((unsigned int)v127 ^ (unsigned int)v152) * 0x10000 | ((unsigned int)v127 ^ (unsigned int)v152) >> 16;
            v163 = _mm_add_epi32(v111, v153);
            v164 = v134 + v156;
            v165 = _mm_add_epi32(v112, v154);
            v166 = v136 + v158;
            v167 = _mm_add_epi32(v113, v155);
            v168 = v130 + v160;
            v169 = _mm_add_epi32(v115, v157);
            v170 = v132 + v162;
            v171 = _mm_add_epi32(v117, v159);
            v172 = _mm_add_epi32(v119, v161);
            v173 = ((unsigned int)v144 ^ (unsigned int)v164) * 0x1000 | ((unsigned int)v144 ^ (unsigned int)v164) >> 20;
            v174 = ((unsigned int)v146 ^ (unsigned int)v166) * 0x1000 | ((unsigned int)v146 ^ (unsigned int)v166) >> 20;
            v175 = ((unsigned int)v148 ^ (unsigned int)v168) * 0x1000 | ((unsigned int)v148 ^ (unsigned int)v168) >> 20;
            v176 = ((unsigned int)v142 ^ (unsigned int)v170) * 0x1000 | ((unsigned int)v142 ^ (unsigned int)v170) >> 20;
            v177 = v149 + v173;
            v178 = v150 + v174;
            v179 = v151 + v175;
            v180 = v152 + v176;
            v181 = ((unsigned int)v156 ^ (unsigned int)v177) * 0x100 | ((unsigned int)v156 ^ (unsigned int)v177) >> 24;
            v182 = ((unsigned int)v158 ^ (unsigned int)v178) * 0x100 | ((unsigned int)v158 ^ (unsigned int)v178) >> 24;
            v183 = ((unsigned int)v160 ^ (unsigned int)v179) * 0x100 | ((unsigned int)v160 ^ (unsigned int)v179) >> 24;
            v184 = ((unsigned int)v162 ^ (unsigned int)v180) * 0x100 | ((unsigned int)v162 ^ (unsigned int)v180) >> 24;
            v186 = v164 + v181;
            v188 = v166 + v182;
            v190 = v168 + v183;
            v192 = v170 + v184;
            v198 = ((unsigned int)v173 ^ (unsigned int)v186) * 128 | ((unsigned int)v173 ^ (unsigned int)v186) >> 25;
            v200 = ((unsigned int)v174 ^ (unsigned int)v188) * 128 | ((unsigned int)v174 ^ (unsigned int)v188) >> 25;
            v202 = ((unsigned int)v175 ^ (unsigned int)v190) * 128 | ((unsigned int)v175 ^ (unsigned int)v190) >> 25;
            v204 = ((unsigned int)v176 ^ (unsigned int)v192) * 128 | ((unsigned int)v176 ^ (unsigned int)v192) >> 25;
            v205 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v163, v129), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v163, v129), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v163, v129), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v163, v129), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v206 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v165, v131), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v165, v131), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v165, v131), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v165, v131), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v207 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v167, v133), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v167, v133), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v167, v133), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v167, v133), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v208 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v169, v135), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v169, v135), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v169, v135), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v169, v135), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v209 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v171, v137), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v171, v137), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v171, v137), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v171, v137), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v210 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v172, v138), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v172, v138), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v172, v138), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v172, v138), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v211 = _mm_add_epi32(v139, v205);
            v212 = v177 + v204;
            v213 = _mm_add_epi32(v140, v206);
            v214 = v178 + v198;
            v215 = _mm_add_epi32(v141, v207);
            v216 = v179 + v200;
            v217 = _mm_add_epi32(v143, v208);
            v218 = v180 + v202;
            v219 = _mm_add_epi32(v145, v209);
            v220 = _mm_add_epi32(v147, v210);
            v221 = ((unsigned int)v182 ^ (unsigned int)v212) * 0x10000 | ((unsigned int)v182 ^ (unsigned int)v212) >> 16;
            v222 = ((unsigned int)v183 ^ (unsigned int)v214) * 0x10000 | ((unsigned int)v183 ^ (unsigned int)v214) >> 16;
            v223 = ((unsigned int)v184 ^ (unsigned int)v216) * 0x10000 | ((unsigned int)v184 ^ (unsigned int)v216) >> 16;
            v224 = ((unsigned int)v181 ^ (unsigned int)v218) * 0x10000 | ((unsigned int)v181 ^ (unsigned int)v218) >> 16;
            v225 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v211, __dirty_unsupported_Iop_SliceV128(v153, v153, 12)));
            v226 = v190 + v221;
            v227 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v213, __dirty_unsupported_Iop_SliceV128(v154, v154, 12)));
            v228 = v192 + v222;
            v229 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v215, __dirty_unsupported_Iop_SliceV128(v155, v155, 12)));
            v230 = v186 + v223;
            v231 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v217, __dirty_unsupported_Iop_SliceV128(v157, v157, 12)));
            v232 = v188 + v224;
            v233 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v219, __dirty_unsupported_Iop_SliceV128(v159, v159, 12)));
            v234 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v220, __dirty_unsupported_Iop_SliceV128(v161, v161, 12)));
            v235 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v163, v163, 8), v225);
            v236 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v165, v165, 8), v227);
            v237 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v167, v167, 8), v229);
            v238 = ((unsigned int)v204 ^ (unsigned int)v226) * 0x1000 | ((unsigned int)v204 ^ (unsigned int)v226) >> 20;
            v239 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v169, v169, 8), v231);
            v240 = ((unsigned int)v198 ^ (unsigned int)v228) * 0x1000 | ((unsigned int)v198 ^ (unsigned int)v228) >> 20;
            v241 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v171, v171, 8), v233);
            v242 = ((unsigned int)v200 ^ (unsigned int)v230) * 0x1000 | ((unsigned int)v200 ^ (unsigned int)v230) >> 20;
            v243 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v172, v172, 8), v234);
            v244 = ((unsigned int)v202 ^ (unsigned int)v232) * 0x1000 | ((unsigned int)v202 ^ (unsigned int)v232) >> 20;
            v245 = v212 + v238;
            v246 = v214 + v240;
            v247 = v216 + v242;
            v248 = v218 + v244;
            v249 = ((unsigned int)v221 ^ (unsigned int)v245) * 0x100 | ((unsigned int)v221 ^ (unsigned int)v245) >> 24;
            v250 = ((unsigned int)v222 ^ (unsigned int)v246) * 0x100 | ((unsigned int)v222 ^ (unsigned int)v246) >> 24;
            v251 = ((unsigned int)v223 ^ (unsigned int)v247) * 0x100 | ((unsigned int)v223 ^ (unsigned int)v247) >> 24;
            v252 = ((unsigned int)v224 ^ (unsigned int)v248) * 0x100 | ((unsigned int)v224 ^ (unsigned int)v248) >> 24;
            v253 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v235, v205), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v235, v205), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v254 = v226 + v249;
            v255 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v236, v206), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v236, v206), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v256 = v228 + v250;
            v257 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v237, v207), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v237, v207), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v258 = v230 + v251;
            v259 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v239, v208), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v239, v208), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v260 = v232 + v252;
            v261 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v241, v209), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v241, v209), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v262 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v243, v210), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v243, v210), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v15 = _mm_add_epi32(v211, v253);
            v57 = _mm_add_epi32(v213, v255);
            v58 = _mm_add_epi32(v215, v257);
            v263 = ((unsigned int)v238 ^ (unsigned int)v254) * 128 | ((unsigned int)v238 ^ (unsigned int)v254) >> 25;
            v59 = _mm_add_epi32(v217, v259);
            v264 = ((unsigned int)v240 ^ (unsigned int)v256) * 128 | ((unsigned int)v240 ^ (unsigned int)v256) >> 25;
            v60 = _mm_add_epi32(v219, v261);
            v265 = ((unsigned int)v242 ^ (unsigned int)v258) * 128 | ((unsigned int)v242 ^ (unsigned int)v258) >> 25;
            v61 = _mm_add_epi32(v220, v262);
            v266 = ((unsigned int)v244 ^ (unsigned int)v260) * 128 | ((unsigned int)v244 ^ (unsigned int)v260) >> 25;
            v267 = v245 + v264;
            v268 = v246 + v265;
            v269 = v247 + v266;
            v270 = v248 + v263;
            v271 = _mm_and_si128(PermV(_mm_xor_si128(v15, v225), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v272 = _mm_and_si128(PermV(_mm_xor_si128(v57, v227), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v273 = _mm_and_si128(PermV(_mm_xor_si128(v58, v229), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v274 = ((unsigned int)v252 ^ (unsigned int)v267) * 0x10000 | ((unsigned int)v252 ^ (unsigned int)v267) >> 16;
            v275 = _mm_and_si128(PermV(_mm_xor_si128(v59, v231), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v276 = ((unsigned int)v249 ^ (unsigned int)v268) * 0x10000 | ((unsigned int)v249 ^ (unsigned int)v268) >> 16;
            v277 = _mm_and_si128(PermV(_mm_xor_si128(v60, v233), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v278 = ((unsigned int)v250 ^ (unsigned int)v269) * 0x10000 | ((unsigned int)v250 ^ (unsigned int)v269) >> 16;
            v279 = _mm_and_si128(PermV(_mm_xor_si128(v61, v234), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v280 = ((unsigned int)v251 ^ (unsigned int)v270) * 0x10000 | ((unsigned int)v251 ^ (unsigned int)v270) >> 16;
            v281 = _mm_add_epi32(v235, v271);
            v282 = v258 + v274;
            v283 = _mm_add_epi32(v236, v272);
            v284 = v260 + v276;
            v285 = _mm_add_epi32(v237, v273);
            v286 = v254 + v278;
            v287 = _mm_add_epi32(v239, v275);
            v288 = v256 + v280;
            v289 = _mm_add_epi32(v241, v277);
            v290 = _mm_add_epi32(v243, v279);
            v291 = ((unsigned int)v264 ^ (unsigned int)v282) * 0x1000 | ((unsigned int)v264 ^ (unsigned int)v282) >> 20;
            v292 = ((unsigned int)v265 ^ (unsigned int)v284) * 0x1000 | ((unsigned int)v265 ^ (unsigned int)v284) >> 20;
            v293 = ((unsigned int)v266 ^ (unsigned int)v286) * 0x1000 | ((unsigned int)v266 ^ (unsigned int)v286) >> 20;
            v294 = ((unsigned int)v263 ^ (unsigned int)v288) * 0x1000 | ((unsigned int)v263 ^ (unsigned int)v288) >> 20;
            v35 = v267 + v291;
            v36 = v268 + v292;
            v37 = v269 + v293;
            v38 = v270 + v294;
            v54 = ((unsigned int)v274 ^ (unsigned int)v35) * 0x100 | ((unsigned int)v274 ^ (unsigned int)v35) >> 24;
            v50 = ((unsigned int)v276 ^ (unsigned int)v36) * 0x100 | ((unsigned int)v276 ^ (unsigned int)v36) >> 24;
            v52 = ((unsigned int)v278 ^ (unsigned int)v37) * 0x100 | ((unsigned int)v278 ^ (unsigned int)v37) >> 24;
            v53 = ((unsigned int)v280 ^ (unsigned int)v38) * 0x100 | ((unsigned int)v280 ^ (unsigned int)v38) >> 24;
            v20 = __dirty_unsupported_Iop_SliceV128(v281, v281, 8);
            v47 = v282 + v54;
            v67 = __dirty_unsupported_Iop_SliceV128(v283, v283, 8);
            v48 = v284 + v50;
            v68 = __dirty_unsupported_Iop_SliceV128(v285, v285, 8);
            v45 = v286 + v52;
            v69 = __dirty_unsupported_Iop_SliceV128(v287, v287, 8);
            v46 = v288 + v53;
            v70 = __dirty_unsupported_Iop_SliceV128(v289, v289, 8);
            v71 = __dirty_unsupported_Iop_SliceV128(v290, v290, 8);
            v41 = __dirty_unsupported_Iop_SliceV128(v271, v271, 4);
            v43 = __dirty_unsupported_Iop_SliceV128(v272, v272, 4);
            v25 = __dirty_unsupported_Iop_SliceV128(v273, v273, 4);
            v40 = ((unsigned int)v291 ^ (unsigned int)v47) * 128 | ((unsigned int)v291 ^ (unsigned int)v47) >> 25;
            v26 = __dirty_unsupported_Iop_SliceV128(v275, v275, 4);
            v42 = ((unsigned int)v292 ^ (unsigned int)v48) * 128 | ((unsigned int)v292 ^ (unsigned int)v48) >> 25;
            v49 = __dirty_unsupported_Iop_SliceV128(v277, v277, 4);
            v44 = ((unsigned int)v293 ^ (unsigned int)v45) * 128 | ((unsigned int)v293 ^ (unsigned int)v45) >> 25;
            v51 = __dirty_unsupported_Iop_SliceV128(v279, v279, 4);
            v39 = ((unsigned int)v294 ^ (unsigned int)v46) * 128 | ((unsigned int)v294 ^ (unsigned int)v46) >> 25;
            v21 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v281, v253), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v281, v253), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v281, v253), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v281, v253), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12);
            v62 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v283, v255), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v283, v255), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v283, v255), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v283, v255), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12);
            v63 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v285, v257), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v285, v257), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v285, v257), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v285, v257), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12);
            v64 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v287, v259), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v287, v259), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v287, v259), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v287, v259), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12);
            v65 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v289, v261), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v289, v261), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v289, v261), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v289, v261), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12);
        } while ((v66 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v290, v262), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v290, v262), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v290, v262), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v290, v262), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12), v55));
        v295 = a1->field_8;
        v296 = a1->field_10;
        v297 = a1->field_18;
        v298 = a1->field_20;
        v299 = a1->field_28;
        v300 = a1->field_30;
        v301 = a1->field_38;
        v302 = &a1->field_40;
        a0->field_0 = v35 + 3684054920433006693 + (v36 + 857760878) * 0x100000000 ^ a1->field_0;
        a0->field_8 = v37 + 7719281312240119090 + (v38 + 1797285236) * 0x100000000 ^ v295;
        v303 = v22 + 1;
        v304 = 1634760805;
        v305 = 857760878;
        a0->field_10 = v39 + v16 + (v40 + (v16 >> 32)) * 0x100000000 ^ v296;
        a0->field_18 = v42 + v17 + (v44 + (v17 >> 32)) * 0x100000000 ^ v297;
        v306 = 2036477234;
        v307 = 1797285236;
        a0->field_20 = v45 + v18 + (v46 + (v18 >> 32)) * 0x100000000 ^ v298;
        a0->field_28 = v47 + v19 + (v48 + (v19 >> 32)) * 0x100000000 ^ v299;
        v308 = v16 & 0xffffffff;
        v309 = v16 >> 32;
        a0->field_30 = v50 + v22 + (v52 + (v22 >> 32)) * 0x100000000 ^ v300;
        a0->field_38 = v53 + x30 + (v54 + ((unsigned int)(x30) >> 32)) * 0x100000000 ^ v301;
        v310 = &a0->field_40;
        v311 = v17 & 0xffffffff;
        v312 = v17 >> 32;
        v313 = v18 & 0xffffffff;
        v314 = v18 >> 32;
        v315 = v19 & 0xffffffff;
        v316 = v19 >> 32;
        v317 = v303 & 0xffffffff;
        v318 = v303 >> 32;
        v319 = x30 & 0xffffffff;
        v320 = (unsigned int)(x30) >> 32;
        v321 = 5;
        do
        {
            v321 -= 1;
            v322 = _mm_add_epi32(v15, v21);
            v323 = v304 + v308;
            v324 = _mm_add_epi32(v57, v62);
            v325 = v305 + v309;
            v326 = _mm_add_epi32(v58, v63);
            v327 = v306 + v311;
            v328 = _mm_add_epi32(v59, v64);
            v329 = v307 + v312;
            v330 = _mm_add_epi32(v60, v65);
            v331 = _mm_add_epi32(v61, v66);
            v332 = ((unsigned int)v317 ^ (unsigned int)v323) * 0x10000 | ((unsigned int)v317 ^ (unsigned int)v323) >> 16;
            v333 = ((unsigned int)v318 ^ (unsigned int)v325) * 0x10000 | ((unsigned int)v318 ^ (unsigned int)v325) >> 16;
            v334 = ((unsigned int)v319 ^ (unsigned int)v327) * 0x10000 | ((unsigned int)v319 ^ (unsigned int)v327) >> 16;
            v335 = ((unsigned int)v320 ^ (unsigned int)v329) * 0x10000 | ((unsigned int)v320 ^ (unsigned int)v329) >> 16;
            v336 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v322, v41));
            v337 = v313 + v332;
            v338 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v324, v43));
            v339 = v314 + v333;
            v340 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v326, v25));
            v341 = v315 + v334;
            v342 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v328, v26));
            v343 = v316 + v335;
            v344 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v330, v49));
            v345 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v331, v51));
            v346 = _mm_add_epi32(v20, v336);
            v347 = _mm_add_epi32(v67, v338);
            v348 = _mm_add_epi32(v68, v340);
            v349 = ((unsigned int)v308 ^ (unsigned int)v337) * 0x1000 | ((unsigned int)v308 ^ (unsigned int)v337) >> 20;
            v350 = _mm_add_epi32(v69, v342);
            v351 = ((unsigned int)v309 ^ (unsigned int)v339) * 0x1000 | ((unsigned int)v309 ^ (unsigned int)v339) >> 20;
            v352 = _mm_add_epi32(v70, v344);
            v353 = ((unsigned int)v311 ^ (unsigned int)v341) * 0x1000 | ((unsigned int)v311 ^ (unsigned int)v341) >> 20;
            v354 = _mm_add_epi32(v71, v345);
            v355 = ((unsigned int)v312 ^ (unsigned int)v343) * 0x1000 | ((unsigned int)v312 ^ (unsigned int)v343) >> 20;
            v356 = v323 + v349;
            v357 = v325 + v351;
            v358 = v327 + v353;
            v359 = v329 + v355;
            v360 = ((unsigned int)v332 ^ (unsigned int)v356) * 0x100 | ((unsigned int)v332 ^ (unsigned int)v356) >> 24;
            v361 = ((unsigned int)v333 ^ (unsigned int)v357) * 0x100 | ((unsigned int)v333 ^ (unsigned int)v357) >> 24;
            v362 = ((unsigned int)v334 ^ (unsigned int)v358) * 0x100 | ((unsigned int)v334 ^ (unsigned int)v358) >> 24;
            v363 = ((unsigned int)v335 ^ (unsigned int)v359) * 0x100 | ((unsigned int)v335 ^ (unsigned int)v359) >> 24;
            v364 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v346, v21), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v346, v21), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v365 = v337 + v360;
            v366 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v347, v62), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v347, v62), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v367 = v339 + v361;
            v368 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v348, v63), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v348, v63), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v369 = v341 + v362;
            v370 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v350, v64), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v350, v64), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v371 = v343 + v363;
            v372 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v352, v65), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v352, v65), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v373 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v354, v66), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v354, v66), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v374 = _mm_add_epi32(v322, v364);
            v375 = _mm_add_epi32(v324, v366);
            v376 = _mm_add_epi32(v326, v368);
            v377 = ((unsigned int)v349 ^ (unsigned int)v365) * 128 | ((unsigned int)v349 ^ (unsigned int)v365) >> 25;
            v378 = _mm_add_epi32(v328, v370);
            v379 = ((unsigned int)v351 ^ (unsigned int)v367) * 128 | ((unsigned int)v351 ^ (unsigned int)v367) >> 25;
            v380 = _mm_add_epi32(v330, v372);
            v381 = ((unsigned int)v353 ^ (unsigned int)v369) * 128 | ((unsigned int)v353 ^ (unsigned int)v369) >> 25;
            v382 = _mm_add_epi32(v331, v373);
            v383 = ((unsigned int)v355 ^ (unsigned int)v371) * 128 | ((unsigned int)v355 ^ (unsigned int)v371) >> 25;
            v384 = v356 + v379;
            v385 = v357 + v381;
            v386 = v358 + v383;
            v387 = v359 + v377;
            v388 = _mm_and_si128(PermV(_mm_xor_si128(v374, v336), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v389 = _mm_and_si128(PermV(_mm_xor_si128(v375, v338), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v390 = _mm_and_si128(PermV(_mm_xor_si128(v376, v340), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v391 = ((unsigned int)v363 ^ (unsigned int)v384) * 0x10000 | ((unsigned int)v363 ^ (unsigned int)v384) >> 16;
            v392 = _mm_and_si128(PermV(_mm_xor_si128(v378, v342), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v393 = ((unsigned int)v360 ^ (unsigned int)v385) * 0x10000 | ((unsigned int)v360 ^ (unsigned int)v385) >> 16;
            v394 = _mm_and_si128(PermV(_mm_xor_si128(v380, v344), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v395 = ((unsigned int)v361 ^ (unsigned int)v386) * 0x10000 | ((unsigned int)v361 ^ (unsigned int)v386) >> 16;
            v396 = _mm_and_si128(PermV(_mm_xor_si128(v382, v345), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v397 = ((unsigned int)v362 ^ (unsigned int)v387) * 0x10000 | ((unsigned int)v362 ^ (unsigned int)v387) >> 16;
            v398 = _mm_add_epi32(v346, v388);
            v399 = v369 + v391;
            v400 = _mm_add_epi32(v347, v389);
            v401 = v371 + v393;
            v402 = _mm_add_epi32(v348, v390);
            v403 = v365 + v395;
            v404 = _mm_add_epi32(v350, v392);
            v405 = v367 + v397;
            v406 = _mm_add_epi32(v352, v394);
            v407 = _mm_add_epi32(v354, v396);
            v408 = ((unsigned int)v379 ^ (unsigned int)v399) * 0x1000 | ((unsigned int)v379 ^ (unsigned int)v399) >> 20;
            v409 = ((unsigned int)v381 ^ (unsigned int)v401) * 0x1000 | ((unsigned int)v381 ^ (unsigned int)v401) >> 20;
            v410 = ((unsigned int)v383 ^ (unsigned int)v403) * 0x1000 | ((unsigned int)v383 ^ (unsigned int)v403) >> 20;
            v411 = ((unsigned int)v377 ^ (unsigned int)v405) * 0x1000 | ((unsigned int)v377 ^ (unsigned int)v405) >> 20;
            v412 = v384 + v408;
            v413 = v385 + v409;
            v414 = v386 + v410;
            v415 = v387 + v411;
            v416 = ((unsigned int)v391 ^ (unsigned int)v412) * 0x100 | ((unsigned int)v391 ^ (unsigned int)v412) >> 24;
            v417 = ((unsigned int)v393 ^ (unsigned int)v413) * 0x100 | ((unsigned int)v393 ^ (unsigned int)v413) >> 24;
            v418 = ((unsigned int)v395 ^ (unsigned int)v414) * 0x100 | ((unsigned int)v395 ^ (unsigned int)v414) >> 24;
            v419 = ((unsigned int)v397 ^ (unsigned int)v415) * 0x100 | ((unsigned int)v397 ^ (unsigned int)v415) >> 24;
            v421 = v399 + v416;
            v423 = v401 + v417;
            v425 = v403 + v418;
            v427 = v405 + v419;
            v433 = ((unsigned int)v408 ^ (unsigned int)v421) * 128 | ((unsigned int)v408 ^ (unsigned int)v421) >> 25;
            v435 = ((unsigned int)v409 ^ (unsigned int)v423) * 128 | ((unsigned int)v409 ^ (unsigned int)v423) >> 25;
            v437 = ((unsigned int)v410 ^ (unsigned int)v425) * 128 | ((unsigned int)v410 ^ (unsigned int)v425) >> 25;
            v439 = ((unsigned int)v411 ^ (unsigned int)v427) * 128 | ((unsigned int)v411 ^ (unsigned int)v427) >> 25;
            v440 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v398, v364), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v398, v364), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v398, v364), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v398, v364), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v441 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v400, v366), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v400, v366), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v400, v366), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v400, v366), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v442 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v402, v368), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v402, v368), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v402, v368), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v402, v368), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v443 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v404, v370), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v404, v370), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v404, v370), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v404, v370), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v444 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v406, v372), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v406, v372), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v406, v372), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v406, v372), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v445 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v407, v373), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v407, v373), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v407, v373), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v407, v373), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 4);
            v446 = _mm_add_epi32(v374, v440);
            v447 = v412 + v439;
            v448 = _mm_add_epi32(v375, v441);
            v449 = v413 + v433;
            v450 = _mm_add_epi32(v376, v442);
            v451 = v414 + v435;
            v452 = _mm_add_epi32(v378, v443);
            v453 = v415 + v437;
            v454 = _mm_add_epi32(v380, v444);
            v455 = _mm_add_epi32(v382, v445);
            v456 = ((unsigned int)v417 ^ (unsigned int)v447) * 0x10000 | ((unsigned int)v417 ^ (unsigned int)v447) >> 16;
            v457 = ((unsigned int)v418 ^ (unsigned int)v449) * 0x10000 | ((unsigned int)v418 ^ (unsigned int)v449) >> 16;
            v458 = ((unsigned int)v419 ^ (unsigned int)v451) * 0x10000 | ((unsigned int)v419 ^ (unsigned int)v451) >> 16;
            v459 = ((unsigned int)v416 ^ (unsigned int)v453) * 0x10000 | ((unsigned int)v416 ^ (unsigned int)v453) >> 16;
            v460 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v446, __dirty_unsupported_Iop_SliceV128(v388, v388, 12)));
            v461 = v425 + v456;
            v462 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v448, __dirty_unsupported_Iop_SliceV128(v389, v389, 12)));
            v463 = v427 + v457;
            v464 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v450, __dirty_unsupported_Iop_SliceV128(v390, v390, 12)));
            v465 = v421 + v458;
            v466 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v452, __dirty_unsupported_Iop_SliceV128(v392, v392, 12)));
            v467 = v423 + v459;
            v468 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v454, __dirty_unsupported_Iop_SliceV128(v394, v394, 12)));
            v469 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v455, __dirty_unsupported_Iop_SliceV128(v396, v396, 12)));
            v470 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v398, v398, 8), v460);
            v471 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v400, v400, 8), v462);
            v472 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v402, v402, 8), v464);
            v473 = ((unsigned int)v439 ^ (unsigned int)v461) * 0x1000 | ((unsigned int)v439 ^ (unsigned int)v461) >> 20;
            v474 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v404, v404, 8), v466);
            v475 = ((unsigned int)v433 ^ (unsigned int)v463) * 0x1000 | ((unsigned int)v433 ^ (unsigned int)v463) >> 20;
            v476 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v406, v406, 8), v468);
            v477 = ((unsigned int)v435 ^ (unsigned int)v465) * 0x1000 | ((unsigned int)v435 ^ (unsigned int)v465) >> 20;
            v478 = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v407, v407, 8), v469);
            v479 = ((unsigned int)v437 ^ (unsigned int)v467) * 0x1000 | ((unsigned int)v437 ^ (unsigned int)v467) >> 20;
            v480 = v447 + v473;
            v481 = v449 + v475;
            v482 = v451 + v477;
            v483 = v453 + v479;
            v484 = ((unsigned int)v456 ^ (unsigned int)v480) * 0x100 | ((unsigned int)v456 ^ (unsigned int)v480) >> 24;
            v485 = ((unsigned int)v457 ^ (unsigned int)v481) * 0x100 | ((unsigned int)v457 ^ (unsigned int)v481) >> 24;
            v486 = ((unsigned int)v458 ^ (unsigned int)v482) * 0x100 | ((unsigned int)v458 ^ (unsigned int)v482) >> 24;
            v487 = ((unsigned int)v459 ^ (unsigned int)v483) * 0x100 | ((unsigned int)v459 ^ (unsigned int)v483) >> 24;
            v488 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v470, v440), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v470, v440), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v489 = v461 + v484;
            v490 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v471, v441), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v471, v441), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v491 = v463 + v485;
            v492 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v472, v442), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v472, v442), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v493 = v465 + v486;
            v494 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v474, v443), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v474, v443), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v495 = v467 + v487;
            v496 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v476, v444), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v476, v444), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v497 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v478, v445), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v478, v445), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v15 = _mm_add_epi32(v446, v488);
            v57 = _mm_add_epi32(v448, v490);
            v58 = _mm_add_epi32(v450, v492);
            v498 = ((unsigned int)v473 ^ (unsigned int)v489) * 128 | ((unsigned int)v473 ^ (unsigned int)v489) >> 25;
            v59 = _mm_add_epi32(v452, v494);
            v499 = ((unsigned int)v475 ^ (unsigned int)v491) * 128 | ((unsigned int)v475 ^ (unsigned int)v491) >> 25;
            v60 = _mm_add_epi32(v454, v496);
            v500 = ((unsigned int)v477 ^ (unsigned int)v493) * 128 | ((unsigned int)v477 ^ (unsigned int)v493) >> 25;
            v61 = _mm_add_epi32(v455, v497);
            v501 = ((unsigned int)v479 ^ (unsigned int)v495) * 128 | ((unsigned int)v479 ^ (unsigned int)v495) >> 25;
            v502 = v480 + v499;
            v503 = v481 + v500;
            v504 = v482 + v501;
            v505 = v483 + v498;
            v506 = _mm_and_si128(PermV(_mm_xor_si128(v15, v460), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v507 = _mm_and_si128(PermV(_mm_xor_si128(v57, v462), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v508 = _mm_and_si128(PermV(_mm_xor_si128(v58, v464), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v509 = ((unsigned int)v487 ^ (unsigned int)v502) * 0x10000 | ((unsigned int)v487 ^ (unsigned int)v502) >> 16;
            v510 = _mm_and_si128(PermV(_mm_xor_si128(v59, v466), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v511 = ((unsigned int)v484 ^ (unsigned int)v503) * 0x10000 | ((unsigned int)v484 ^ (unsigned int)v503) >> 16;
            v512 = _mm_and_si128(PermV(_mm_xor_si128(v60, v468), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v513 = ((unsigned int)v485 ^ (unsigned int)v504) * 0x10000 | ((unsigned int)v485 ^ (unsigned int)v504) >> 16;
            v514 = _mm_and_si128(PermV(_mm_xor_si128(v61, v469), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v515 = ((unsigned int)v486 ^ (unsigned int)v505) * 0x10000 | ((unsigned int)v486 ^ (unsigned int)v505) >> 16;
            v516 = _mm_add_epi32(v470, v506);
            v517 = v493 + v509;
            v518 = _mm_add_epi32(v471, v507);
            v519 = v495 + v511;
            v520 = _mm_add_epi32(v472, v508);
            v521 = v489 + v513;
            v522 = _mm_add_epi32(v474, v510);
            v523 = v491 + v515;
            v524 = _mm_add_epi32(v476, v512);
            v525 = _mm_add_epi32(v478, v514);
            v526 = ((unsigned int)v499 ^ (unsigned int)v517) * 0x1000 | ((unsigned int)v499 ^ (unsigned int)v517) >> 20;
            v527 = ((unsigned int)v500 ^ (unsigned int)v519) * 0x1000 | ((unsigned int)v500 ^ (unsigned int)v519) >> 20;
            v528 = ((unsigned int)v501 ^ (unsigned int)v521) * 0x1000 | ((unsigned int)v501 ^ (unsigned int)v521) >> 20;
            v529 = ((unsigned int)v498 ^ (unsigned int)v523) * 0x1000 | ((unsigned int)v498 ^ (unsigned int)v523) >> 20;
            v304 = v502 + v526;
            v305 = v503 + v527;
            v306 = v504 + v528;
            v307 = v505 + v529;
            v320 = ((unsigned int)v509 ^ (unsigned int)v304) * 0x100 | ((unsigned int)v509 ^ (unsigned int)v304) >> 24;
            v317 = ((unsigned int)v511 ^ (unsigned int)v305) * 0x100 | ((unsigned int)v511 ^ (unsigned int)v305) >> 24;
            v318 = ((unsigned int)v513 ^ (unsigned int)v306) * 0x100 | ((unsigned int)v513 ^ (unsigned int)v306) >> 24;
            v319 = ((unsigned int)v515 ^ (unsigned int)v307) * 0x100 | ((unsigned int)v515 ^ (unsigned int)v307) >> 24;
            v20 = __dirty_unsupported_Iop_SliceV128(v516, v516, 8);
            v315 = v517 + v320;
            v67 = __dirty_unsupported_Iop_SliceV128(v518, v518, 8);
            v316 = v519 + v317;
            v68 = __dirty_unsupported_Iop_SliceV128(v520, v520, 8);
            v313 = v521 + v318;
            v69 = __dirty_unsupported_Iop_SliceV128(v522, v522, 8);
            v314 = v523 + v319;
            v70 = __dirty_unsupported_Iop_SliceV128(v524, v524, 8);
            v71 = __dirty_unsupported_Iop_SliceV128(v525, v525, 8);
            v41 = __dirty_unsupported_Iop_SliceV128(v506, v506, 4);
            v43 = __dirty_unsupported_Iop_SliceV128(v507, v507, 4);
            v25 = __dirty_unsupported_Iop_SliceV128(v508, v508, 4);
            v309 = ((unsigned int)v526 ^ (unsigned int)v315) * 128 | ((unsigned int)v526 ^ (unsigned int)v315) >> 25;
            v26 = __dirty_unsupported_Iop_SliceV128(v510, v510, 4);
            v311 = ((unsigned int)v527 ^ (unsigned int)v316) * 128 | ((unsigned int)v527 ^ (unsigned int)v316) >> 25;
            v49 = __dirty_unsupported_Iop_SliceV128(v512, v512, 4);
            v312 = ((unsigned int)v528 ^ (unsigned int)v313) * 128 | ((unsigned int)v528 ^ (unsigned int)v313) >> 25;
            v51 = __dirty_unsupported_Iop_SliceV128(v514, v514, 4);
            v308 = ((unsigned int)v529 ^ (unsigned int)v314) * 128 | ((unsigned int)v529 ^ (unsigned int)v314) >> 25;
            v21 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v516, v488), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v516, v488), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v516, v488), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v516, v488), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12);
            v62 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v518, v490), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v518, v490), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v518, v490), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v518, v490), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12);
            v63 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v520, v492), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v520, v492), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v520, v492), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v520, v492), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12);
            v64 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v522, v494), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v522, v494), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v522, v494), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v522, v494), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12);
            v65 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v524, v496), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v524, v496), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v524, v496), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v524, v496), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12);
        } while ((v66 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v525, v497), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v525, v497), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v525, v497), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v525, v497), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25))), 12), v321));
        v530 = v0;
        v531 = v1;
        v532 = v2;
        v533 = v302->field_8;
        v534 = v302->field_10;
        v535 = v302->field_18;
        v536 = v302->field_20;
        v537 = v302->field_28;
        v538 = v302->field_30;
        v539 = v302->field_38;
        v540 = &v302->field_40;
        v541 = v540[3];
        v542 = v540[2];
        v543 = v540[1];
        v544 = *v540;
        v545 = v540 + 4;
        v546 = v545[3];
        v547 = v545[2];
        v548 = v545[1];
        v549 = *v545;
        v550 = v545 + 4;
        v310->field_0 = v304 + 3684054920433006693 + (v305 + 857760878) * 0x100000000 ^ v302->field_0;
        v310->field_8 = v306 + 7719281312240119090 + (v307 + 1797285236) * 0x100000000 ^ v533;
        v22 = v303 + 7;
        v310->field_10 = v308 + v16 + (v309 + (v16 >> 32)) * 0x100000000 ^ v534;
        v310->field_18 = v311 + v17 + (v312 + (v17 >> 32)) * 0x100000000 ^ v535;
        v310->field_20 = v313 + v18 + (v314 + (v18 >> 32)) * 0x100000000 ^ v536;
        v310->field_28 = v315 + v19 + (v316 + (v19 >> 32)) * 0x100000000 ^ v537;
        v310->field_30 = v317 + v303 + (v318 + (v303 >> 32)) * 0x100000000 ^ v538;
        v310->field_38 = v319 + x30 + (v320 + ((unsigned int)(x30) >> 32)) * 0x100000000 ^ v539;
        v551 = &v310->field_40;
        v551[3] = _mm_xor_si128(v541, _mm_add_epi32(v41, v3));
        v551[2] = _mm_xor_si128(v542, _mm_add_epi32(v20, v532));
        v551[1] = _mm_xor_si128(v543, _mm_add_epi32(v21, v531));
        *v551 = _mm_xor_si128(v544, _mm_add_epi32(v15, v530));
        v552 = v551 + 4;
        v553 = v550[3];
        v554 = v550[2];
        v555 = v550[1];
        v556 = *v550;
        v557 = v550 + 4;
        v552[3] = _mm_xor_si128(v546, _mm_add_epi32(v43, v4));
        v552[2] = _mm_xor_si128(v547, _mm_add_epi32(v67, v532));
        v552[1] = _mm_xor_si128(v548, _mm_add_epi32(v62, v531));
        *v552 = _mm_xor_si128(v549, _mm_add_epi32(v57, v530));
        v558 = v552 + 4;
        v559 = v557[3];
        v560 = v557[2];
        v561 = v557[1];
        v562 = *v557;
        v563 = v557 + 4;
        v15 = v0;
        v21 = v1;
        v20 = v2;
        v558[3] = _mm_xor_si128(v553, _mm_add_epi32(v25, v5));
        v558[2] = _mm_xor_si128(v554, _mm_add_epi32(v68, v532));
        v558[1] = _mm_xor_si128(v555, _mm_add_epi32(v63, v531));
        *v558 = _mm_xor_si128(v556, _mm_add_epi32(v58, v530));
        v564 = v558 + 4;
        v565 = v563[3];
        v566 = v563[2];
        v567 = v563[1];
        v568 = *v563;
        v569 = v563 + 4;
        v564[3] = _mm_xor_si128(v559, _mm_add_epi32(v26, v6));
        v564[2] = _mm_xor_si128(v560, _mm_add_epi32(v69, v532));
        v564[1] = _mm_xor_si128(v561, _mm_add_epi32(v64, v531));
        *v564 = _mm_xor_si128(v562, _mm_add_epi32(v59, v530));
        v570 = v564 + 4;
        v571 = v569[3];
        v572 = v569[2];
        v573 = v569[1];
        v574 = *v569;
        a1 = v569 + 4;
        v570[3] = _mm_xor_si128(v565, _mm_add_epi32(_mm_add_epi32(v49, v27), v3));
        v570[2] = _mm_xor_si128(v566, _mm_add_epi32(v70, v532));
        v570[1] = _mm_xor_si128(v567, _mm_add_epi32(v65, v531));
        *v570 = _mm_xor_si128(v568, _mm_add_epi32(v60, v530));
        v575 = v570 + 4;
        v576 = _mm_slli_epi32(v27, 1);
        v575[3] = _mm_xor_si128(v571, _mm_add_epi32(_mm_add_epi32(v51, v27), v4));
        v575[2] = _mm_xor_si128(v572, _mm_add_epi32(v71, v532));
        v575[1] = _mm_xor_si128(v573, _mm_add_epi32(v66, v531));
        *v575 = _mm_xor_si128(v574, _mm_add_epi32(v61, v530));
        a0 = v575 + 4;
        v23 = _mm_add_epi32(v3, v576);
        v24 = _mm_add_epi32(v4, v576);
        v25 = _mm_add_epi32(v5, v576);
        v26 = _mm_add_epi32(v6, v576);
        v577 = arm64g_calculate_condition(36, v34, 0x200, 0);
        v34 = v56;
    } while (v577 & 1);
    v0 = v15;
    v1 = v15;
    v2 = v15;
    v3 = v15;
    v4 = v15;
    v5 = v15;
    v578 = arm64g_calculate_condition(2, v56, 0x200, 0);
    if (v578 & 1)
        return v575 + 4;
    if (192 <= v56 + 0x200)
        goto LABEL_0x9f07d4;
}
