/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8d7f0..0x91530 (15680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8d7f0_1 {
    char padding_0[8];
    void* field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[84];
    struct st_8d7f0_2 *field_70;
    char padding_78[136];
    unsigned int field_100;
    char padding_104[4];
    unsigned int field_108;
    char padding_10c[4];
    unsigned int field_110;
    unsigned int field_114;
} st_8d7f0_1;

typedef struct st_8d7f0_2 {
    unsigned int field_0;
} st_8d7f0_2;

typedef struct st_8d7f0_5 {
    char padding_0[12];
    uint128_t field_c;
    uint128_t field_1c;
    uint128_t field_2c;
} st_8d7f0_5;

typedef struct st_8d7f0_4 {
    unsigned long long field_0;
    struct st_8d7f0_3 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned int field_48;
    unsigned int field_4c;
} st_8d7f0_4;

typedef struct st_8d7f0_6 {
    struct st_8d7f0_7 *field_0;
} st_8d7f0_6;

typedef struct st_8d7f0_7 {
    struct st_8d7f0_6 *field_0;
} st_8d7f0_7;

typedef struct st_8d7f0_3 {
    unsigned int field_0;
    char padding_4[2];
    unsigned short field_6;
} st_8d7f0_3;

typedef struct st_8d7f0_0 {
    char field_0;
} st_8d7f0_0;


long long sub_8d7f0(st_8d7f0_1 *a0, st_8d7f0_4 *a1, unsigned int *a2, void* a3, unsigned long long a4)
{
    unsigned int v32;  // w10
    unsigned int v33;  // w9
    unsigned int v42;  // w9
    void* v132;  // x10
    unsigned int v133;  // w8
    void* v134;  // x27
    void* iter;  // x27
    unsigned long long idx;  // x23
    unsigned long long v137;  // x12
    void* v138;  // x11
    unsigned int v139;  // w9
    unsigned long long idx1;  // x22
    unsigned long v141;  // x21
    unsigned int v43;  // w8
    void* v142;  // x28
    void* v143;  // x20
    unsigned long v144;  // x26
    unsigned long long v145;  // x25
    void* v146;  // x27
    unsigned int v147;  // w23
    void* v148;  // x11
    unsigned long long v149;  // x19
    void* v150;  // x9
    unsigned long long v151;  // x10
    unsigned int v44;  // x28
    void* v152;  // x11
    void* v153;  // x8
    unsigned int v154;  // w9
    unsigned int v155;  // w10
    unsigned long v156;  // x9
    unsigned long long v157;  // x27
    void* v158;  // x8
    st_8d7f0_4 *v159;  // x23
    void* v160;  // x25
    unsigned int v161;  // w25
    void* v45;  // x22
    unsigned long long v162;  // x19
    unsigned long long v163;  // x10
    unsigned long long v164;  // x20
    char v165;  // x21
    unsigned int v166;  // w25
    unsigned int *v167;  // x26
    unsigned long v168;  // x24
    unsigned long v169;  // x2
    unsigned int v170;  // w21
    void* v171;  // x11
    void* iter1;  // x25
    void* v172;  // x9
    unsigned long long v173;  // x9
    void* v174;  // x8
    void* v175;  // x9
    void* v176;  // x9
    void* v177;  // x11
    void* v178;  // x10
    unsigned long long v179;  // x0
    void* v180;  // x2
    unsigned long long v181;  // x19
    unsigned int *v47;  // x24
    void* v182;  // x20
    char *v183;  // x2
    uint128_t *v184;  // x9
    uint128_t *iter2;  // x9
    uint128_t *v186;  // x10
    uint128_t *v187;  // x10
    st_8d7f0_3 *v188;  // x8
    unsigned long long v189;  // x9
    unsigned long long v190;  // x9
    unsigned long long v191;  // x10
    unsigned long long v48;  // x21
    unsigned long long v192;  // x11
    unsigned int v193;  // x10
    char v194;  // x10
    unsigned int v195;  // x9
    unsigned int v196;  // x19
    unsigned int v197;  // x25
    unsigned long long v198;  // x8
    st_8d7f0_5 *v199;  // x21
    void* v200;  // x1
    unsigned long long v201;  // x26
    void* v49;  // x10
    st_8d7f0_3 *v202;  // x8
    unsigned long long v203;  // x9
    unsigned long long v204;  // x10
    unsigned int v205;  // w10
    unsigned long long v206;  // 4321
    unsigned int v207;  // w10
    unsigned int *v208;  // x10
    void* v209;  // x17
    unsigned int v210;  // w9
    unsigned int v211;  // w10
    unsigned long v50;  // x8
    unsigned int v212;  // w11
    unsigned long v213;  // x20
    char *v214;  // x13
    unsigned int v215;  // w9
    unsigned int v216;  // w8
    void* v217;  // x22
    void* v218;  // x25
    unsigned int *v219;  // x24
    unsigned long long v220;  // x21
    void* v221;  // x10
    void* v51;  // x13
    unsigned long v222;  // x8
    void* v223;  // x13
    void* v224;  // x13
    unsigned long long idx2;  // x16
    unsigned long v226;  // x27
    unsigned long long v227;  // x15
    unsigned int v228;  // w9
    unsigned long long v229;  // x28
    unsigned int v230;  // w23
    unsigned long v231;  // x21
    unsigned int v34;  // w8
    void* v52;  // x13
    void* v232;  // x20
    unsigned long v233;  // x26
    unsigned long long v234;  // x19
    void* v235;  // x27
    unsigned int v236;  // w23
    unsigned long long v237;  // x11
    void* v238;  // x9
    unsigned long long v239;  // x10
    st_8d7f0_4 *v240;  // x23
    void* v241;  // x8
    unsigned long long v53;  // x16
    unsigned int v242;  // w9
    unsigned int v243;  // w10
    unsigned long v244;  // x9
    unsigned long long v245;  // x22
    void* v246;  // x8
    unsigned int v247;  // w27
    void* v248;  // x25
    void* v249;  // x12
    void* v250;  // x25
    unsigned long v251;  // x22
    unsigned long v54;  // x27
    unsigned long long v252;  // x10
    void* v253;  // x19
    unsigned long long v254;  // x23
    char v255;  // x21
    unsigned int v256;  // w25
    unsigned int *v257;  // x26
    unsigned long v258;  // x24
    unsigned long long v259;  // x21
    unsigned long long v260;  // x11
    unsigned long long v261;  // x9
    unsigned long long v55;  // x15
    void* v262;  // x8
    void* v263;  // x9
    void* v264;  // x9
    void* v265;  // x11
    unsigned long v266;  // x10
    unsigned long long v267;  // x0
    void* v268;  // x2
    unsigned long long v269;  // x19
    void* v270;  // x20
    uint128_t *v271;  // x9
    unsigned int v56;  // w9
    uint128_t *node;  // x9
    unsigned long v273;  // x10
    unsigned long v274;  // x10
    st_8d7f0_3 *v275;  // x8
    char v276;  // x25
    unsigned long long v277;  // x9
    unsigned long long v278;  // x9
    unsigned long long v279;  // x10
    unsigned long long v280;  // x11
    unsigned int v281;  // w10
    unsigned long long v57;  // x28
    unsigned int v282;  // x9
    unsigned int v283;  // x19
    unsigned long long v284;  // x8
    unsigned long v285;  // x21
    void* v286;  // x1
    unsigned long long v287;  // x26
    st_8d7f0_3 *v288;  // x8
    unsigned long long v289;  // x9
    unsigned long long v290;  // x10
    void* v291;  // x17
    unsigned int v58;  // w23
    unsigned int v292;  // w9
    unsigned int v293;  // w10
    unsigned int v294;  // w11
    unsigned long v295;  // x20
    char *v296;  // x13
    unsigned int v297;  // w9
    unsigned int v298;  // w8
    void* v299;  // x22
    void* v300;  // x25
    unsigned int *v301;  // x24
    unsigned long v59;  // x21
    unsigned long long v302;  // x21
    void* v303;  // x10
    unsigned long v304;  // x8
    void* v305;  // x13
    void* v306;  // x13
    unsigned long long v307;  // x16
    unsigned long v308;  // x27
    unsigned long long v309;  // x15
    unsigned int v310;  // w9
    unsigned long long v311;  // x28
    void* v60;  // x20
    unsigned int v312;  // w23
    unsigned long v313;  // x21
    void* v314;  // x20
    unsigned long v315;  // x26
    unsigned long long v316;  // x19
    void* v317;  // x27
    unsigned int v318;  // w23
    unsigned long long v319;  // x11
    void* v320;  // x9
    unsigned long long v321;  // x10
    unsigned long v61;  // x26
    st_8d7f0_4 *v322;  // x23
    void* v323;  // x8
    unsigned int v324;  // w9
    unsigned int v325;  // w10
    unsigned long v326;  // x9
    unsigned long long v327;  // x22
    void* v328;  // x8
    unsigned int v329;  // w27
    void* v330;  // x25
    void* v331;  // x12
    void* v35;  // x17
    unsigned long long v62;  // x19
    void* v332;  // x25
    unsigned long v333;  // x22
    unsigned long long v334;  // x10
    void* v335;  // x19
    unsigned long long v336;  // x23
    char v337;  // x21
    unsigned int v338;  // w25
    unsigned int *v339;  // x26
    unsigned long v340;  // x24
    unsigned long long v341;  // x21
    void* v63;  // x27
    unsigned long long v342;  // x11
    unsigned long long v343;  // x9
    void* v344;  // x8
    void* v345;  // x9
    void* v346;  // x9
    void* v347;  // x11
    unsigned long v348;  // x10
    unsigned long long v349;  // x0
    void* v350;  // x2
    unsigned long long v351;  // x19
    unsigned int v64;  // w23
    void* v352;  // x20
    uint128_t *v353;  // x9
    uint128_t *i2;  // x9
    unsigned long v355;  // x10
    unsigned long v356;  // x10
    st_8d7f0_3 *v357;  // x8
    char v358;  // x25
    unsigned long long v359;  // x9
    unsigned long long v360;  // x9
    unsigned long long v361;  // x10
    unsigned long long v65;  // x11
    unsigned long long v362;  // x11
    unsigned int v363;  // w10
    unsigned int v364;  // x9
    unsigned int v365;  // x19
    unsigned long long v366;  // x8
    unsigned long v367;  // x21
    void* v368;  // x1
    unsigned long long v369;  // x26
    st_8d7f0_3 *v370;  // x8
    unsigned long long v371;  // x9
    void* v66;  // x9
    unsigned long long v372;  // x10
    void* v373;  // x17
    unsigned int v374;  // w9
    unsigned int v375;  // w10
    unsigned int v376;  // w11
    unsigned long v377;  // x20
    char *v378;  // x13
    unsigned int v379;  // w9
    unsigned int v380;  // w8
    void* v381;  // x22
    unsigned long long v67;  // x10
    void* v382;  // x25
    unsigned int *v383;  // x24
    unsigned long long v384;  // x21
    void* v385;  // x10
    unsigned long v386;  // x8
    void* v387;  // x13
    void* v388;  // x13
    unsigned long long v389;  // x16
    unsigned long v390;  // x27
    unsigned long long v391;  // x15
    st_8d7f0_4 *v68;  // x23
    unsigned int v392;  // w9
    unsigned long long v393;  // x28
    unsigned int v394;  // w23
    unsigned long v395;  // x21
    void* v396;  // x20
    unsigned long v397;  // x26
    unsigned long long v398;  // x19
    void* v399;  // x27
    unsigned int v400;  // w23
    unsigned long long v401;  // x11
    void* v69;  // x8
    void* v402;  // x9
    unsigned long long v403;  // x10
    st_8d7f0_4 *v404;  // x23
    void* v405;  // x8
    unsigned int v406;  // w9
    unsigned int v407;  // w10
    unsigned long v408;  // x9
    unsigned long long v409;  // x22
    void* v410;  // x8
    unsigned int v411;  // w27
    unsigned int v70;  // w9
    void* v412;  // x25
    void* v413;  // x12
    void* v414;  // x25
    unsigned long v415;  // x22
    unsigned long long v416;  // x10
    void* v417;  // x19
    unsigned long long v418;  // x23
    char v419;  // x21
    unsigned int v420;  // w25
    unsigned int *v421;  // x26
    unsigned int v71;  // w10
    unsigned long v422;  // x24
    unsigned long long v423;  // x21
    unsigned long long v424;  // x11
    unsigned long long v425;  // x9
    void* v426;  // x8
    void* v427;  // x9
    void* v428;  // x9
    void* v429;  // x11
    unsigned long v430;  // x10
    unsigned long long v431;  // x0
    unsigned int v36;  // w9
    unsigned long v72;  // x9
    void* v432;  // x2
    unsigned long long v433;  // x19
    void* v434;  // x20
    uint128_t *v435;  // x9
    uint128_t *i5;  // x9
    unsigned long v437;  // x10
    unsigned long v438;  // x10
    st_8d7f0_3 *v439;  // x8
    char v440;  // x25
    unsigned long long v441;  // x9
    unsigned long long v73;  // x22
    unsigned long long v442;  // x9
    unsigned long long v443;  // x10
    unsigned long long v444;  // x11
    unsigned int v445;  // w10
    unsigned int v446;  // x9
    unsigned int v447;  // x19
    unsigned long long v448;  // x8
    unsigned long v449;  // x21
    void* v450;  // x1
    unsigned long long v451;  // x26
    void* v74;  // x8
    st_8d7f0_3 *v452;  // x8
    unsigned long long v453;  // x9
    unsigned long long v454;  // x10
    void* v455;  // x17
    unsigned int v456;  // w9
    unsigned int v457;  // w10
    unsigned int v458;  // w11
    unsigned long v459;  // x5
    char *v460;  // x13
    unsigned int v461;  // w9
    unsigned int v75;  // w27
    unsigned int v462;  // w8
    unsigned int v463;  // x28
    void* v464;  // x14
    void* v465;  // x15
    unsigned int *v466;  // x24
    unsigned int v467;  // w19
    void* v468;  // x10
    unsigned int v469;  // w8
    void* v470;  // x13
    void* v471;  // x13
    void* v76;  // x25
    unsigned long long v472;  // x16
    unsigned long v473;  // x12
    unsigned long long v474;  // x10
    unsigned int v475;  // w9
    unsigned long long v476;  // x22
    void* v477;  // x27
    void* v478;  // x28
    unsigned long v479;  // x25
    unsigned long v480;  // x21
    void* v481;  // x20
    void* v77;  // x12
    unsigned long v482;  // x26
    unsigned long long v483;  // x22
    void* v484;  // x25
    unsigned int v485;  // w23
    unsigned long long v486;  // x11
    void* v487;  // x9
    st_8d7f0_4 *v488;  // x23
    void* v489;  // x8
    unsigned int v490;  // w9
    unsigned int v491;  // w10
    void* v78;  // x25
    unsigned long v492;  // x9
    unsigned long long v493;  // x19
    void* v494;  // x8
    void* v495;  // x25
    unsigned int v496;  // w21
    char *v497;  // x27
    void* v498;  // x12
    unsigned long v499;  // x23
    void* v500;  // x27
    unsigned long long v501;  // x10
    unsigned long v79;  // x22
    void* v502;  // x0
    unsigned int v503;  // w21
    unsigned int *v504;  // x26
    unsigned long v505;  // x24
    unsigned long long v506;  // x19
    unsigned int v507;  // w21
    void* v508;  // x25
    unsigned long long v509;  // x11
    void* v510;  // x9
    unsigned long long v511;  // x9
    unsigned long long v80;  // x10
    void* v512;  // x8
    void* v513;  // x9
    void* v514;  // x9
    void* v515;  // x11
    unsigned long v516;  // x10
    unsigned long long v517;  // x0
    void* v518;  // x2
    unsigned long long v519;  // x22
    void* v520;  // x20
    uint128_t *v521;  // x9
    void* v81;  // x19
    uint128_t *m;  // x9
    unsigned long v523;  // x10
    unsigned long v524;  // x10
    st_8d7f0_3 *v525;  // x8
    unsigned long long v526;  // x9
    unsigned long long v527;  // x9
    unsigned long long v528;  // x10
    unsigned long long v529;  // x11
    unsigned int v530;  // w10
    char v531;  // x10
    unsigned int v37;  // w10
    unsigned long long v82;  // x23
    unsigned int v532;  // x9
    unsigned int v533;  // x19
    unsigned long long v534;  // x8
    unsigned long v535;  // x21
    void* v536;  // x1
    unsigned long long v537;  // x26
    st_8d7f0_3 *v538;  // x8
    unsigned long long v539;  // x9
    unsigned long long v540;  // x10
    unsigned int v541;  // w10
    char v83;  // x21
    unsigned long long v542;  // 4321
    unsigned int v543;  // w10
    unsigned int *v544;  // x10
    char *v545;  // x8
    void* v546;  // x17
    unsigned int v547;  // w9
    unsigned int v548;  // w10
    unsigned int v549;  // w11
    unsigned long v550;  // x20
    char *v551;  // x13
    unsigned int v84;  // w25
    unsigned int v552;  // w9
    unsigned int v553;  // w8
    void* v554;  // x22
    void* v555;  // x25
    unsigned int *v556;  // x24
    unsigned long long v557;  // x21
    void* v558;  // x10
    unsigned long v559;  // x8
    void* v560;  // x13
    void* v561;  // x13
    unsigned int *v85;  // x26
    unsigned long long v562;  // x16
    unsigned long v563;  // x27
    unsigned long long v564;  // x15
    unsigned int v565;  // w9
    unsigned long long v566;  // x28
    unsigned int v567;  // w23
    unsigned long v568;  // x21
    void* v569;  // x20
    unsigned long v570;  // x26
    unsigned long long v571;  // x19
    unsigned long v86;  // x24
    void* v572;  // x27
    unsigned int v573;  // w23
    unsigned long long v574;  // x11
    void* v575;  // x9
    unsigned long long v576;  // x10
    st_8d7f0_4 *v577;  // x23
    void* v578;  // x8
    unsigned int v579;  // w9
    unsigned int v580;  // w10
    unsigned long v581;  // x9
    unsigned long long v87;  // x21
    unsigned long long v582;  // x22
    void* v583;  // x8
    unsigned int v584;  // w27
    void* v585;  // x25
    void* v586;  // x12
    void* v587;  // x25
    unsigned long v588;  // x22
    unsigned long long v589;  // x10
    void* v590;  // x19
    unsigned long long v591;  // x23
    unsigned long long v88;  // x11
    char v592;  // x21
    unsigned int v593;  // w25
    unsigned int *v594;  // x26
    unsigned long v595;  // x24
    unsigned long long v596;  // x21
    unsigned long long v597;  // x11
    unsigned long long v598;  // x9
    void* v599;  // x8
    void* v600;  // x9
    void* v601;  // x9
    unsigned long long v89;  // x9
    void* v602;  // x11
    unsigned long v603;  // x10
    unsigned long long v604;  // x0
    void* v605;  // x2
    unsigned long long v606;  // x19
    void* v607;  // x20
    uint128_t *v608;  // x9
    uint128_t *i1;  // x9
    unsigned long v610;  // x10
    unsigned long v611;  // x10
    void* v90;  // x8
    st_8d7f0_3 *v612;  // x8
    char v613;  // x25
    unsigned long long v614;  // x9
    unsigned long long v615;  // x9
    unsigned long long v616;  // x10
    unsigned long long v617;  // x11
    unsigned int v618;  // w10
    unsigned int v619;  // x9
    unsigned int v620;  // x19
    unsigned long long v621;  // x8
    void* v91;  // x9
    unsigned long v622;  // x21
    void* v623;  // x1
    unsigned long long v624;  // x26
    st_8d7f0_3 *v625;  // x8
    unsigned long long v626;  // x9
    unsigned long long v627;  // x10
    void* v628;  // x17
    unsigned int v629;  // w9
    unsigned int v630;  // w10
    unsigned int v631;  // w11
    unsigned int v38;  // w11
    void* v92;  // x9
    unsigned long v632;  // x20
    char *v633;  // x13
    unsigned int v634;  // w9
    unsigned int v635;  // w8
    void* v636;  // x22
    void* v637;  // x25
    unsigned int *v638;  // x24
    unsigned long long v639;  // x21
    void* v640;  // x10
    unsigned long v641;  // x8
    void* v93;  // x11
    void* v642;  // x13
    void* v643;  // x13
    unsigned long long v644;  // x16
    unsigned long v645;  // x27
    unsigned long long v646;  // x15
    unsigned int v647;  // w9
    unsigned long long index;  // x28
    unsigned int v649;  // w23
    unsigned long v650;  // x21
    void* v651;  // x20
    unsigned long v94;  // x10
    unsigned long v652;  // x26
    unsigned long long v653;  // x19
    void* v654;  // x27
    unsigned int v655;  // w23
    unsigned long long v656;  // x11
    void* v657;  // x9
    unsigned long long v658;  // x10
    st_8d7f0_4 *v659;  // x23
    void* v660;  // x8
    unsigned int v661;  // w9
    unsigned long long v95;  // x0
    unsigned int v662;  // w10
    unsigned long v663;  // x9
    unsigned long long v664;  // x22
    void* v665;  // x8
    unsigned int v666;  // w27
    void* v667;  // x25
    void* v668;  // x12
    void* v669;  // x25
    unsigned long v670;  // x22
    unsigned long long v671;  // x10
    void* v96;  // x2
    void* v672;  // x19
    unsigned long long v673;  // x23
    char v674;  // x21
    unsigned int v675;  // w25
    unsigned int *v676;  // x26
    unsigned long v677;  // x24
    unsigned long long v678;  // x21
    unsigned long long v679;  // x11
    unsigned long long v680;  // x9
    void* v681;  // x8
    unsigned long long v97;  // x19
    void* v682;  // x9
    void* v683;  // x9
    void* v684;  // x11
    unsigned long v685;  // x10
    unsigned long long v686;  // x0
    void* v687;  // x2
    unsigned long long v688;  // x19
    void* v689;  // x20
    uint128_t *v690;  // x9
    uint128_t *i3;  // x9
    void* v98;  // x20
    unsigned long v692;  // x10
    unsigned long v693;  // x10
    st_8d7f0_3 *v694;  // x8
    char v695;  // x25
    unsigned long long v696;  // x9
    unsigned long long v697;  // x9
    unsigned long long v698;  // x10
    unsigned long long v699;  // x11
    unsigned int v700;  // w10
    unsigned int v701;  // x9
    uint128_t *v99;  // x9
    unsigned int v702;  // x19
    unsigned long long v703;  // x8
    unsigned long v704;  // x21
    void* v705;  // x1
    unsigned long long v706;  // x26
    st_8d7f0_3 *v707;  // x8
    unsigned long long v708;  // x9
    unsigned long long v709;  // x10
    unsigned int v710;  // w10
    unsigned long long v711;  // 4321
    uint128_t *i4;  // x9
    unsigned int v712;  // w10
    unsigned int *v713;  // x10
    unsigned long v101;  // x10
    unsigned long v39;  // x20
    unsigned long v102;  // x10
    st_8d7f0_3 *v103;  // x8
    char v104;  // x25
    unsigned long long v105;  // x9
    unsigned long long v106;  // x9
    unsigned long long v107;  // x10
    unsigned long long v108;  // x11
    unsigned int v109;  // w10
    unsigned int v110;  // x9
    unsigned int v111;  // x19
    char *v40;  // x13
    unsigned long long v112;  // x8
    unsigned long v113;  // x21
    void* v114;  // x1
    unsigned long long v115;  // x26
    st_8d7f0_3 *v116;  // x8
    unsigned long long v117;  // x9
    unsigned long long v118;  // x10
    void* v119;  // x16
    unsigned int v120;  // w9
    unsigned int v121;  // w10
    void* n;  // x26
    unsigned int v122;  // w11
    unsigned long v123;  // x28
    void* v124;  // x17
    char *v125;  // x4
    void* l;  // x26
    unsigned int v127;  // w9
    unsigned int v128;  // w8
    unsigned int v129;  // x22
    void* v130;  // x19
    unsigned int *v131;  // x24
    void* v0;  // [bp-0x150]
    void* v1;  // [bp-0x148]
    void* v2;  // [bp-0x140]
    void* v3;  // [bp-0x138], Other Possible Types: unsigned long
    void* v4;  // [bp-0x130], Other Possible Types: unsigned int
    unsigned int v5;  // [bp-0x128]
    unsigned int v6;  // [bp-0x124]
    void* v7;  // [bp-0x120], Other Possible Types: unsigned int
    char *v8;  // [bp-0x118], Other Possible Types: unsigned int, unsigned long
    unsigned int v9;  // [bp-0x10c]
    unsigned long long v10;  // [bp-0x108], Other Possible Types: unsigned int
    char *v11;  // [bp-0x100], Other Possible Types: unsigned long long
    void* v12;  // [bp-0xf8], Other Possible Types: unsigned int, unsigned long
    char *v13;  // [bp-0xf0], Other Possible Types: void*, unsigned int, unsigned long long
    st_8d7f0_4 *v14;  // [bp-0xe0]
    void* v15;  // [bp-0xd8], Other Possible Types: unsigned long long
    void* i;  // [bp-0xd0]
    void* v17;  // [bp-0xc8]
    void* v18;  // [bp-0xc0]
    void* v19;  // [bp-0xb8], Other Possible Types: unsigned int, unsigned long long
    void* j;  // [bp-0xb0], Other Possible Types: unsigned int
    void* v21;  // [bp-0xa8], Other Possible Types: unsigned long, unsigned long long
    unsigned int v22;  // [bp-0xa8]
    void* v23;  // [bp-0xa0], Other Possible Types: unsigned int, unsigned long long
    st_8d7f0_0 **v24;  // [bp-0x98], Other Possible Types: char
    st_8d7f0_0 *v25;  // [bp-0x90]
    st_8d7f0_0 **v26;  // [bp-0x88], Other Possible Types: char
    st_8d7f0_0 *v27;  // [bp-0x80]
    st_8d7f0_7 **v28;  // [bp-0x78]
    st_8d7f0_7 **v29;  // [bp-0x70]
    char *v30;  // [bp-0x10]
    char v31;  // [bp+0x0]

    v30 = &v31;
    v14 = a1;
    v25 = &v24;
    v24 = &v25;
    v32 = a0->field_110;
    v33 = (unsigned int)a3 + (unsigned int)a4;
    v34 = 1 << ((char)a0->field_100 & 31);
    if (18 >= a0->field_100)
    {
        if (v32 == 5)
        {
            v27 = &v26;
            v26 = &v27;
            v291 = a0->field_8;
            v292 = (unsigned int)(v33 - v291);
            v293 = a0->field_18;
            v294 = !*(int *)&a0->padding_1c[12];
            v295 = (v294 & v292 - v293 > v34 ? v292 - v34 : v293);
            v296 = a3 + a4;
            v4 = v291 + v295;
            n = (v4 != a3 ? a3 : a3 + 1);
            v297 = n - v291;
            v298 = v297 - (v294 & v297 - v293 > v34 ? v297 - v34 : v293);
            v5 = v298;
            v6 = a2[1];
            v9 = (v298 < v6 ? 0 : v6);
            v7 = *a2;
            v44 = (v298 < v7 ? 0 : v7);
            v11 = (1 < a0->field_114 ? a0->field_114 : 1) + 1;
            v299 = n + v11;
            v300 = v299 + 1;
            i = v296 - 8;
            v13 = v296;
            if (i <= v300)
                goto LABEL_8de90;
            v301 = a0->field_70;
            v302 = 0xcf1bbcdcbb000000;
            v18 = a3;
            v19 = 64 - a0->field_108;
            v12 = v296 - 32;
            v2 = v291 - 1;
            v3 = v291 + 2;
            v17 = v291;
            v8 = v295;
            while (1)
            {
                v303 = n;
                v304 = (long long)v303[1];
                v23 = v303 + 1;
                v305 = n;
                v306 = v305 + 128;
                v10 = v44;
                v307 = v302 * *(long long *)v305 >> ((char)v19 & 63);
                v308 = v301[v307];
                v15 = -(v44 & 0xffffffff);
                if (v44)
                    break;
                v334 = v11;
                while (1)
                {
                    v21 = v334;
                    j = v306;
                    v335 = v300;
                    v15 = v299;
                    v336 = v302;
                    v337 = v19;
                    v311 = v302 * v304 >> (v337 & 63);
                    v338 = n - v291;
                    v301[v307] = v338;
                    v339 = v301;
                    v340 = v295;
                    v314 = v291;
                    if (sub_92c5c(n, v291 + (v308 & 0xffffffff), v308, v295))
                    {
                        v22 = v338;
                        v331 = v4;
                        v301 = v339;
                        v302 = v336;
LABEL_8f044:
                        v333 = v308;
                        v332 = v23;
                        goto LABEL_8f080;
                    }
                    v333 = v339[v311];
                    v332 = v15;
                    v341 = v336 * *(long long *)v332 >> (v337 & 63);
                    v317 = v23;
                    v318 = v317 - v314;
                    v339[v311] = v318;
                    if (!sub_92c5c(v317, v314 + v333, v333, v340))
                    {
                        v295 = v340;
                        v308 = v339[v341];
                        v304 = *(long long *)v335;
                        v342 = v21;
                        v299 = v332 + v342;
                        v306 = j;
                        v301 = v339;
                        v307 = v341;
                        if (v306 <= v299)
                        {
                            v334 = v342 + 1;
                            v306 += 128;
                        }
                        else
                        {
                            v334 = v342;
                        }
                        v291 = v17;
                        v302 = 0xcf1bbcdcbb000000;
                        v23 = v335;
                        n = v15;
                        v300 = v335 + v342;
                        if (i <= v300)
                            goto LABEL_906f0;
                    }
                    else
                    {
                        v311 = v341;
                        v331 = v4;
                        v301 = v339;
LABEL_8f05c:
                        v302 = 0xcf1bbcdcbb000000;
                        v22 = v318;
                        n = v317;
                        v314 = v17;
                        if (5 <= v21)
                            goto LABEL_8f088;
LABEL_8f080:
                        v301[v311] = v332 - v314;
LABEL_8f088:
                        v343 = v333 & 0xffffffff;
                        v328 = v314 + v343;
                        v44 = n - v328;
                        v329 = v44 + 3;
                        v330 = v18;
                        if (n > v330)
                        {
                            if ((unsigned int)v333 > (unsigned int)v8)
                            {
                                v344 = v2 + v343;
                                v345 = n - 1;
                                v327 = 4;
                                do
                                {
                                    v346 = v345;
                                    if (*(char *)v346 != *(char *)v344)
                                    {
                                        v328 = v344 + 1;
                                        n = v346 + 1;
                                        v322 = v14;
                                        goto LABEL_8f120;
                                    }
                                } while ((v327 += 1, v347 = v344 - 1, v348 = v346 - 1, v344 > v331 && (v344 = v347, v345 = v348, v330 < v346)));
                                v328 = v347 + 1;
                                n = v348 + 1;
                                v322 = v14;
                            }
                            else
                            {
                                v327 = 4;
                                v322 = v14;
                            }
                        }
                        else
                        {
                            v327 = 4;
                            v322 = v14;
                        }
LABEL_8f120:
                        v349 = sub_7cdfc(n + v327, v328 + v327, v13);
                        v350 = n;
                        v351 = v350 - v330;
                        v29 = &v28;
                        v28 = &v29;
                        if (v350 > v12)
                        {
                            v352 = v350;
                            sub_82208(v322->field_18, v330, v350, v12);
                            v291 = v17;
                            goto LABEL_8f16c;
                        }
                        else
                        {
                            v352 = v350;
                            *v322->field_18 = *(int128_t *)v330;
                            v353 = v322->field_18;
                            if (v351 > 16)
                            {
                                v353[1] = (int128_t)v330[16];
                                v291 = v17;
                                if ((long long)v351 >= 33)
                                {
                                    i2 = v353 + 2;
                                    v355 = v330 + 48;
                                    do
                                    {
                                        *i2 = *(int128_t *)(v355 - 16);
                                        v356 = v355 + 32;
                                        i2[1] = *(int128_t *)v355;
                                        i2 += 2;
                                        v291 = v17;
                                        v355 = v356;
                                    } while (i2 < (char *)v353 + v351);
                                }
LABEL_8f16c:
                                v322->field_18 = (char *)v322->field_18 + v351;
                                v357 = v322->field_8;
                                v358 = v19;
                                if (v351 >= 0x10000)
                                {
                                    v359 = (char *)v357 - v322->field_0;
                                    v322->field_48 = 1;
                                    v322->field_4c = v359 >> 3;
                                    goto LABEL_8f20c;
                                }
                            }
                            else
                            {
                                v322->field_18 = (char *)v353 + v351;
                                v357 = v322->field_8;
                                v291 = v17;
                                v358 = v19;
LABEL_8f20c:
                                v360 = v349 + v327;
                                *(unsigned short *)v357->padding_4 = v351;
                                v357->field_0 = v329;
                                v361 = v360 - 3;
                                if (0x10000 <= v361)
                                {
                                    v362 = (char *)v357 - v322->field_0;
                                    v322->field_48 = 2;
                                    v322->field_4c = v362 >> 3;
                                }
                                v357->field_6 = v361;
                                v322->field_8 = &v357[1];
                                n = v352 + v360;
                                v295 = v8;
                                if (i < n)
                                {
                                    v363 = v10;
                                }
                                else
                                {
                                    v301[v302 * *(long long *)((char *)v3 + v22) >> (v358 & 63)] = v22 + 2;
                                    v301[v302 * *(long long *)((char *)n - 2) >> (v358 & 63)] = n - 2 - v291;
                                    v364 = v10;
                                    if (v364)
                                    {
                                        v365 = v44;
                                        do
                                        {
                                            v44 = v365;
                                            v365 = v364;
                                            v366 = v365 & 0xffffffff;
                                            if (*(int *)n != *(int *)((char *)n - v366))
                                            {
                                                v363 = v365;
                                                break;
                                            }
                                            v367 = n + 4;
                                            v291 = v17;
                                            v368 = n;
                                            v369 = sub_7cdfc(v367, v367 + -v366, v13);
                                            v301[v302 * *(long long *)v368 >> (v358 & 63)] = v368 - v291;
                                            v29 = &v28;
                                            v28 = &v29;
                                            if (v368 > v12)
                                            {
                                                sub_82208(v322->field_18, v368, v368, v12);
                                                v291 = v17;
                                            }
                                            else
                                            {
                                                *v322->field_18 = *(int128_t *)v368;
                                            }
                                            v370 = v322->field_8;
                                            *(unsigned short *)v370->padding_4 = 0;
                                            v370->field_0 = 1;
                                            v371 = v369 + 1;
                                            if (0x10000 <= v371)
                                            {
                                                v372 = (char *)v370 - v322->field_0;
                                                v322->field_48 = 2;
                                                v322->field_4c = v372 >> 3;
                                            }
                                            n = v367 + v369;
                                            v370->field_6 = v371;
                                            v322->field_8 = &v370[1];
                                            v364 = v44;
                                            v363 = v44;
                                            v44 = v365;
                                            v302 = 0xcf1bbcdcbb000000;
                                        } while (n <= i);
                                    }
                                    else
                                    {
                                        v363 = 0;
                                    }
                                }
                                v9 = v363;
                                v299 = n + v11;
                                v300 = v299 + 1;
                                v18 = n;
                                if (i <= v300)
                                    goto LABEL_906f8;
                                break;
                            }
                        }
                    }
                }
            }
            v309 = v11;
            do
            {
                v310 = *(int *)((char *)v299 + v15);
                v311 = v302 * v304 >> ((char)v19 & 63);
                v312 = n - v291;
                v301[v307] = v312;
                if (*(int *)v299 == v310)
                {
                    v22 = v312;
                    v322 = v14;
                    v323 = v299 + v15;
                    v324 = *((char *)v299 - 1);
                    v325 = *((char *)v323 - 1);
                    v326 = v324 == v325;
                    v327 = (v324 != v325 ? 4 : 5);
                    n = v299 - v326;
                    v328 = v323 - v326;
                    v301[v311] = v23 - v291;
                    v329 = 1;
                    v44 = v10;
                    v10 = v9;
                    v330 = v18;
                    goto LABEL_8f120;
                }
                v21 = v309;
                j = v306;
                v313 = v295;
                v314 = v291;
                if (sub_92c5c(n, v291 + (v308 & 0xffffffff), v308, v295))
                {
                    v22 = v312;
                    v331 = v4;
                    v302 = 0xcf1bbcdcbb000000;
                    goto LABEL_8f044;
                }
                v315 = v301[v311];
                v316 = 0xcf1bbcdcbb000000 * *(long long *)v299 >> ((char)v19 & 63);
                v317 = v23;
                v318 = v317 - v314;
                v301[v311] = v318;
                if (sub_92c5c(v317, v314 + v315, v315, v313))
                {
                    v311 = v316;
                    v332 = v299;
                    v333 = v315;
                    v331 = v4;
                    goto LABEL_8f05c;
                }
                v295 = v313;
                v308 = v301[v316];
                v304 = *(long long *)v300;
                v319 = v21;
                v320 = v299 + v319;
                v306 = j;
                v307 = v316;
                if (v320 < v306)
                {
                    v321 = v319;
                }
                else
                {
                    v321 = v319 + 1;
                    v306 += 128;
                }
                v291 = v17;
                v302 = 0xcf1bbcdcbb000000;
                v23 = v300;
                n = v299;
                v299 = v320;
                v300 += v319;
                v309 = v321;
            } while (i > v300);
        }
        else if (v32 != 6)
        {
            if (v32 != 7)
            {
                v27 = &v26;
                v26 = &v27;
                v119 = a0->field_8;
                v120 = (unsigned int)(v33 - v119);
                v121 = a0->field_18;
                v122 = !*(int *)&a0->padding_1c[12];
                v123 = (v122 & v120 - v121 > v34 ? v120 - v34 : v121);
                v124 = v119 + v123;
                v125 = a3 + a4;
                l = (v124 != a3 ? a3 : a3 + 1);
                v127 = l - v119;
                v128 = v127 - (v122 & v127 - v121 > v34 ? v127 - v34 : v121);
                v5 = a2[1];
                v6 = *a2;
                v129 = (v128 < v6 ? 0 : v6);
                v10 = (1 < a0->field_114 ? a0->field_114 : 1) + 1;
                v23 = l + v10;
                v130 = v23 + 1;
                i = v125 - 8;
                v4 = v128;
                v8 = (v128 < v5 ? 0 : v5);
                if (i > v130)
                {
                    v17 = v119;
                    v18 = a3;
                    v131 = a0->field_70;
                    v1 = v119 + 2;
                    v2 = v124;
                    j = 32 - a0->field_108;
                    v7 = v125 - 32;
                    v0 = v119 - 1;
                    v3 = v123;
                    v11 = v125;
                }
                else
                {
                    l = a3;
                    v183 = v125;
                    goto LABEL_914a0;
                }
                while (1)
                {
                    v132 = l;
                    v133 = (int)v132[1];
                    v19 = v132 + 1;
                    v134 = l;
                    iter = v134 + 128;
                    v9 = v129;
                    idx = 2654435761 * *(int *)v134 >> ((char)j & 31);
                    v21 = v131[idx & 0xffffffff];
                    v13 = -(v129 & 0xffffffff);
                    if (v129)
                    {
                        v137 = v10;
                        do
                        {
                            v138 = v23;
                            v139 = *(int *)((char *)v138 + v13);
                            idx1 = 2654435761 * v133 >> ((char)j & 31);
                            v12 = l - v119;
                            v131[idx] = v12;
                            if (*(int *)v138 == v139)
                            {
                                v152 = v23;
                                v153 = v152 + v13;
                                v154 = *((char *)v152 - 1);
                                v155 = *((char *)v153 - 1);
                                v156 = v154 == v155;
                                v157 = (v154 != v155 ? 4 : 5);
                                l = v152 - v156;
                                v158 = v153 - v156;
                                v131[idx1] = v19 - v119;
                                v23 = 1;
                                v129 = v9;
                                v9 = v8;
                                v159 = v14;
                                v160 = v18;
                                goto LABEL_90b68;
                            }
                            v15 = v137;
                            v141 = v123;
                            v142 = v119;
                            if (sub_92c5c(l, v119 + (v21 & 0xffffffff), v21, v123))
                            {
                                v161 = (unsigned int)v19;
                                goto LABEL_90ab4;
                            }
                            v143 = iter;
                            v144 = v131[idx1];
                            v145 = 2654435761 * *(int *)v23 >> ((char)j & 31);
                            v146 = v19;
                            v147 = v146 - v142;
                            v131[idx1] = v147;
                            if (sub_92c5c(v146, v142 + v144, v144, v141))
                            {
                                v12 = v147;
                                v21 = v144;
                                v162 = v15;
                                idx = v145;
                                goto LABEL_90a98;
                            }
                            v123 = v141;
                            v21 = v131[v145];
                            v148 = v130;
                            v133 = *(int *)v130;
                            v149 = v15;
                            v150 = v23 + v149;
                            iter = v143;
                            idx = v145;
                            if (v150 < v143)
                            {
                                v151 = v149;
                            }
                            else
                            {
                                v151 = v149 + 1;
                                iter += 128;
                            }
                            v119 = v17;
                            v19 = v148;
                            l = v23;
                            v23 = v150;
                            v130 = v148 + v149;
                            v137 = v151;
                        } while (i > v130);
                        l = v18;
                        v129 = v9;
                        goto LABEL_9149c;
                    }
                    else
                    {
                        v163 = v10;
                    }
                    while (1)
                    {
                        v164 = v163;
                        v13 = iter;
                        v15 = v130;
                        v165 = j;
                        idx1 = 2654435761 * v133 >> (v165 & 31);
                        v166 = l - v119;
                        v131[idx] = v166;
                        v167 = v131;
                        v168 = v123;
                        v142 = v119;
                        if (sub_92c5c(l, v119 + (v21 & 0xffffffff), v21, v123))
                        {
                            v12 = v166;
                            v131 = v167;
                            v161 = (unsigned int)v19;
                            goto LABEL_90ab4;
                        }
                        v169 = v167[idx1];
                        idx = 2654435761 * *(int *)v23 >> (v165 & 31);
                        v146 = v19;
                        v170 = v146 - v142;
                        v167[idx1] = v170;
                        v21 = v169;
                        if (sub_92c5c(v146, v142 + v21, v21, v168))
                            break;
                        v123 = v168;
                        v21 = v167[idx];
                        v171 = v15;
                        v133 = *(int *)v171;
                        v172 = v23 + v164;
                        iter = v13;
                        v131 = v167;
                        if (iter <= v172)
                        {
                            v163 = v164 + 1;
                            iter += 128;
                        }
                        else
                        {
                            v163 = v164;
                        }
                        v119 = v17;
                        v19 = v171;
                        l = v23;
                        v23 = v172;
                        v130 = v171 + v164;
                        if (i <= v130)
                        {
                            v129 = 0;
                            l = v18;
LABEL_9149c:
                            v183 = v11;
LABEL_914a0:
                            v205 = v6;
                            v206 = arm64g_calculate_condition((v129 ? 3 : 0) | 128, (v129 ? v6 : 0), (v129 ? v4 : 0), 0);
                            v207 = v8;
                            v208 = a2;
                            *v208 = (v129 ? v129 : v4 < v205 ? v205 : 0);
                            v208[1] = (!v207 ? (v206 & 1 ? v205 : v4 < v5 ? v5 : 0) : v207);
                            return v183 - l;
                        }
                    }
                    v12 = v170;
                    v131 = v167;
                    v162 = v164;
LABEL_90a98:
                    l = v146;
                    v161 = (unsigned int)v23;
                    idx1 = idx;
                    v142 = v17;
                    if (5 <= v162)
                        goto LABEL_90abc;
LABEL_90ab4:
                    v131[idx1] = (unsigned int)(v161 - v142);
LABEL_90abc:
                    v173 = v21 & 0xffffffff;
                    v158 = v142 + v173;
                    v129 = l - v158;
                    v160 = v18;
                    v23 = v129 + 3;
                    if (l > v160)
                    {
                        v123 = v3;
                        if ((unsigned int)v21 > (unsigned int)v123)
                        {
                            v174 = v0 + v173;
                            v175 = l - 1;
                            v157 = 4;
                            do
                            {
                                v176 = v175;
                                if (*(char *)v176 != *(char *)v174)
                                {
                                    v158 = v174 + 1;
                                    l = v176 + 1;
                                    v159 = v14;
                                    goto LABEL_90b68;
                                }
                            } while ((v157 += 1, v177 = v174 - 1, v178 = v176 - 1, v174 > v2 && (v174 = v177, v175 = v178, v160 < v176)));
                            v158 = v177 + 1;
                            l = v178 + 1;
                            v159 = v14;
                        }
                        else
                        {
                            v157 = 4;
                            v159 = v14;
                        }
                    }
                    else
                    {
                        v157 = 4;
                        v159 = v14;
                        v123 = v3;
                    }
LABEL_90b68:
                    v179 = sub_7cdfc(l + v157, v158 + v157);
                    v180 = l;
                    v181 = v180 - v160;
                    v29 = &v28;
                    v28 = &v29;
                    if (v180 > v7)
                    {
                        v182 = v180;
                        sub_82208(v159->field_18, v160, v180, v7);
                        v119 = v17;
                        v183 = v11;
                        goto LABEL_90bb8;
                    }
                    else
                    {
                        v182 = v180;
                        *v159->field_18 = *(int128_t *)v160;
                        v184 = v159->field_18;
                        if (v181 > 16)
                        {
                            v184[1] = (int128_t)v160[16];
                            v183 = v11;
                            v119 = v17;
                            if ((long long)v181 >= 33)
                            {
                                iter2 = v184 + 2;
                                v186 = v160 + 48;
                                do
                                {
                                    *iter2 = *(int128_t *)((char *)v186 - 16);
                                    v187 = v186 + 2;
                                    iter2[1] = *v186;
                                    iter2 += 2;
                                    v183 = v11;
                                    v119 = v17;
                                    v186 = v187;
                                } while (iter2 < (char *)v184 + v181);
                            }
LABEL_90bb8:
                            v159->field_18 = (char *)v159->field_18 + v181;
                            v188 = v159->field_8;
                            if (v181 >= 0x10000)
                            {
                                v189 = (char *)v188 - v159->field_0;
                                v159->field_48 = 1;
                                v159->field_4c = v189 >> 3;
                                goto LABEL_90c60;
                            }
                        }
                        else
                        {
                            v159->field_18 = (char *)v184 + v181;
                            v188 = v159->field_8;
                            v119 = v17;
                            v183 = v11;
LABEL_90c60:
                            v190 = v179 + v157;
                            *(unsigned short *)v188->padding_4 = v181;
                            v188->field_0 = v23;
                            v191 = v190 - 3;
                            if (0x10000 <= v191)
                            {
                                v192 = (char *)v188 - v159->field_0;
                                v159->field_48 = 2;
                                v159->field_4c = v192 >> 3;
                            }
                            v188->field_6 = v191;
                            v159->field_8 = &v188[1];
                            l = v182 + v190;
                            if (i < l)
                            {
                                v193 = v9;
                            }
                            else
                            {
                                v194 = j;
                                v131[2654435761 * *(int *)((char *)v1 + v12) >> (v194 & 31)] = v12 + 2;
                                v131[2654435761 * *(int *)((char *)l - 2) >> (v194 & 31)] = l - 2 - v119;
                                v195 = v9;
                                if (v195)
                                {
                                    v196 = v129;
                                    do
                                    {
                                        v197 = v196;
                                        v196 = v195;
                                        v198 = v195 & 0xffffffff;
                                        if (*(int *)l != *(int *)((char *)l - v198))
                                        {
                                            v129 = v197;
                                            v193 = v196;
                                            break;
                                        }
                                        v199 = l + 4;
                                        v119 = v17;
                                        v200 = l;
                                        v201 = sub_7cdfc(v199, &v199->padding_0[-v198]);
                                        v131[2654435761 * *(int *)l >> ((char)j & 31)] = v200 - v119;
                                        v29 = &v28;
                                        v28 = &v29;
                                        if (v200 > v7)
                                        {
                                            sub_82208(v159->field_18, v200, v200, v7);
                                            v119 = v17;
                                        }
                                        else
                                        {
                                            *v159->field_18 = *(int128_t *)v200;
                                        }
                                        v202 = v159->field_8;
                                        *(unsigned short *)v202->padding_4 = 0;
                                        v202->field_0 = 1;
                                        v203 = v201 + 1;
                                        v183 = v11;
                                        v193 = v197;
                                        if (0x10000 <= v203)
                                        {
                                            v204 = (char *)v202 - v159->field_0;
                                            v159->field_48 = 2;
                                            v159->field_4c = v204 >> 3;
                                            v193 = v197;
                                        }
                                        l = &v199->padding_0[v201];
                                        v202->field_6 = v203;
                                        v159->field_8 = &v202[1];
                                        v195 = v193;
                                        v129 = v196;
                                    } while (l <= i);
                                }
                                else
                                {
                                    v193 = 0;
                                }
                            }
                            v8 = v193;
                            v23 = l + v10;
                            v130 = v23 + 1;
                            v18 = l;
                            if (i <= v130)
                                goto LABEL_914a0;
                        }
                    }
                }
            }
            v27 = &v26;
            v26 = &v27;
            v35 = a0->field_8;
            v36 = (unsigned int)(v33 - v35);
            v37 = a0->field_18;
            v38 = !*(int *)&a0->padding_1c[12];
            v39 = (v38 & v36 - v37 > v34 ? v36 - v34 : v37);
            v40 = a3 + a4;
            v4 = v35 + v39;
            n = (v4 != a3 ? a3 : a3 + 1);
            v42 = n - v35;
            v43 = v42 - (v38 & v42 - v37 > v34 ? v42 - v34 : v37);
            v6 = a2[1];
            v7 = *a2;
            v9 = (v43 < v6 ? 0 : v6);
            v44 = (v43 < v7 ? 0 : v7);
            v11 = (1 < a0->field_114 ? a0->field_114 : 1) + 1;
            v45 = n + v11;
            iter1 = v45 + 1;
            i = v40 - 8;
            v13 = v40;
            v5 = v43;
            if (i <= iter1)
                goto LABEL_8de90;
            v47 = a0->field_70;
            v48 = 0xcf1bbcdcbfa56300;
            v18 = a3;
            v19 = 64 - a0->field_108;
            v12 = v40 - 32;
            v2 = v35 - 1;
            v3 = v35 + 2;
            v17 = v35;
            v8 = v39;
            while (1)
            {
                v49 = n;
                v50 = (long long)v49[1];
                v23 = v49 + 1;
                v51 = n;
                v52 = v51 + 128;
                v10 = v44;
                v53 = v48 * *(long long *)v51 >> ((char)v19 & 63);
                v54 = v47[v53];
                v15 = -(v44 & 0xffffffff);
                if (v44)
                    break;
                v80 = v11;
                while (1)
                {
                    v21 = v80;
                    j = v52;
                    v81 = iter1;
                    v15 = v45;
                    v82 = v48;
                    v83 = v19;
                    v57 = v48 * v50 >> (v83 & 63);
                    v84 = n - v35;
                    v47[v53] = v84;
                    v85 = v47;
                    v86 = v39;
                    v60 = v35;
                    if (sub_92c5c(n, v35 + (v54 & 0xffffffff), v54, v39))
                    {
                        v22 = v84;
                        v77 = v4;
                        v47 = v85;
                        v48 = v82;
LABEL_8fd04:
                        v79 = v54;
                        v78 = v23;
                        goto LABEL_8fd44;
                    }
                    v79 = v85[v57];
                    v78 = v15;
                    v87 = v82 * *(long long *)v78 >> (v83 & 63);
                    v63 = v23;
                    v64 = v63 - v60;
                    v85[v57] = v64;
                    if (!sub_92c5c(v63, v60 + v79, v79, v86))
                    {
                        v39 = v86;
                        v54 = v85[v87];
                        v50 = *(long long *)v81;
                        v88 = v21;
                        v45 = v78 + v88;
                        v52 = j;
                        v47 = v85;
                        v53 = v87;
                        if (v52 <= v45)
                        {
                            v80 = v88 + 1;
                            v52 += 128;
                        }
                        else
                        {
                            v80 = v88;
                        }
                        v35 = v17;
                        v48 = 0xcf1bbcdcbfa56300;
                        v23 = v81;
                        n = v15;
                        iter1 = v81 + v88;
                        if (i <= iter1)
                            goto LABEL_906f0;
                    }
                    else
                    {
                        v57 = v87;
                        v77 = v4;
                        v47 = v85;
LABEL_8fd1c:
                        v48 = 0xcf1bbcdcbfa56300;
                        v22 = v64;
                        n = v63;
                        v60 = v17;
                        if (5 <= v21)
                            goto LABEL_8fd4c;
LABEL_8fd44:
                        v47[v57] = v78 - v60;
LABEL_8fd4c:
                        v89 = v79 & 0xffffffff;
                        v74 = v60 + v89;
                        v44 = n - v74;
                        v75 = v44 + 3;
                        v76 = v18;
                        if (n <= v76)
                        {
                            v73 = 4;
                            v68 = v14;
                        }
                        else if ((unsigned int)v79 > (unsigned int)v8)
                        {
                            v90 = v2 + v89;
                            v91 = n - 1;
                            v73 = 4;
                            do
                            {
                                v92 = v91;
                                if (*(char *)v92 != *(char *)v90)
                                {
                                    v74 = v90 + 1;
                                    n = v92 + 1;
                                    v68 = v14;
                                    goto LABEL_8fde4;
                                }
                            } while ((v73 += 1, v93 = v90 - 1, v94 = v92 - 1, v90 > v77 && (v90 = v93, v91 = v94, v76 < v92)));
                            v74 = v93 + 1;
                            n = v94 + 1;
                            v68 = v14;
                        }
                        else
                        {
                            v73 = 4;
                            v68 = v14;
                        }
LABEL_8fde4:
                        v95 = sub_7cdfc(n + v73, v74 + v73, v13);
                        v96 = n;
                        v97 = v96 - v76;
                        v29 = &v28;
                        v28 = &v29;
                        if (v96 > v12)
                        {
                            v98 = v96;
                            sub_82208(v68->field_18, v76, v96, v12);
                            v35 = v17;
                            goto LABEL_8fe30;
                        }
                        else
                        {
                            v98 = v96;
                            *v68->field_18 = *(int128_t *)v76;
                            v99 = v68->field_18;
                            if (v97 > 16)
                            {
                                v99[1] = (int128_t)v76[16];
                                v35 = v17;
                                if ((long long)v97 >= 33)
                                {
                                    i4 = v99 + 2;
                                    v101 = v76 + 48;
                                    do
                                    {
                                        *i4 = *(int128_t *)(v101 - 16);
                                        v102 = v101 + 32;
                                        i4[1] = *(int128_t *)v101;
                                        i4 += 2;
                                        v35 = v17;
                                        v101 = v102;
                                    } while (i4 < (char *)v99 + v97);
                                }
LABEL_8fe30:
                                v68->field_18 = (char *)v68->field_18 + v97;
                                v103 = v68->field_8;
                                v104 = v19;
                                if (v97 >= 0x10000)
                                {
                                    v105 = (char *)v103 - v68->field_0;
                                    v68->field_48 = 1;
                                    v68->field_4c = v105 >> 3;
                                    goto LABEL_8fed0;
                                }
                            }
                            else
                            {
                                v68->field_18 = (char *)v99 + v97;
                                v103 = v68->field_8;
                                v35 = v17;
                                v104 = v19;
LABEL_8fed0:
                                v106 = v95 + v73;
                                *(unsigned short *)v103->padding_4 = v97;
                                v103->field_0 = v75;
                                v107 = v106 - 3;
                                if (0x10000 <= v107)
                                {
                                    v108 = (char *)v103 - v68->field_0;
                                    v68->field_48 = 2;
                                    v68->field_4c = v108 >> 3;
                                }
                                v103->field_6 = v107;
                                v68->field_8 = &v103[1];
                                n = v98 + v106;
                                v39 = v8;
                                if (i < n)
                                {
                                    v109 = v10;
                                }
                                else
                                {
                                    v47[v48 * *(long long *)((char *)v3 + v22) >> (v104 & 63)] = v22 + 2;
                                    v47[v48 * *(long long *)((char *)n - 2) >> (v104 & 63)] = n - 2 - v35;
                                    v110 = v10;
                                    if (v110)
                                    {
                                        v111 = v44;
                                        do
                                        {
                                            v44 = v111;
                                            v111 = v110;
                                            v112 = v111 & 0xffffffff;
                                            if (*(int *)n != *(int *)((char *)n - v112))
                                            {
                                                v109 = v111;
                                                break;
                                            }
                                            v113 = n + 4;
                                            v35 = v17;
                                            v114 = n;
                                            v115 = sub_7cdfc(v113, v113 + -v112, v13);
                                            v47[v48 * *(long long *)v114 >> (v104 & 63)] = v114 - v35;
                                            v29 = &v28;
                                            v28 = &v29;
                                            if (v114 > v12)
                                            {
                                                sub_82208(v68->field_18, v114, v114, v12);
                                                v35 = v17;
                                            }
                                            else
                                            {
                                                *v68->field_18 = *(int128_t *)v114;
                                            }
                                            v116 = v68->field_8;
                                            *(unsigned short *)v116->padding_4 = 0;
                                            v116->field_0 = 1;
                                            v117 = v115 + 1;
                                            if (0x10000 <= v117)
                                            {
                                                v118 = (char *)v116 - v68->field_0;
                                                v68->field_48 = 2;
                                                v68->field_4c = v118 >> 3;
                                            }
                                            n = v113 + v115;
                                            v116->field_6 = v117;
                                            v68->field_8 = &v116[1];
                                            v110 = v44;
                                            v109 = v44;
                                            v44 = v111;
                                            v48 = 0xcf1bbcdcbfa56300;
                                        } while (n <= i);
                                    }
                                    else
                                    {
                                        v109 = 0;
                                    }
                                }
                                v9 = v109;
                                v45 = n + v11;
                                iter1 = v45 + 1;
                                v18 = n;
                                if (i <= iter1)
                                    goto LABEL_906f8;
                                break;
                            }
                        }
                    }
                }
            }
            v55 = v11;
            do
            {
                v56 = *(int *)((char *)v45 + v15);
                v57 = v48 * v50 >> ((char)v19 & 63);
                v58 = n - v35;
                v47[v53] = v58;
                if (*(int *)v45 == v56)
                {
                    v22 = v58;
                    v68 = v14;
                    v69 = v45 + v15;
                    v70 = *((char *)v45 - 1);
                    v71 = *((char *)v69 - 1);
                    v72 = v70 == v71;
                    v73 = (v70 != v71 ? 4 : 5);
                    n = v45 - v72;
                    v74 = v69 - v72;
                    v47[v57] = v23 - v35;
                    v75 = 1;
                    v44 = v10;
                    v10 = v9;
                    v76 = v18;
                    goto LABEL_8fde4;
                }
                v21 = v55;
                j = v52;
                v59 = v39;
                v60 = v35;
                if (sub_92c5c(n, v35 + (v54 & 0xffffffff), v54, v39))
                {
                    v22 = v58;
                    v77 = v4;
                    v48 = 0xcf1bbcdcbfa56300;
                    goto LABEL_8fd04;
                }
                v61 = v47[v57];
                v62 = 0xcf1bbcdcbfa56300 * *(long long *)v45 >> ((char)v19 & 63);
                v63 = v23;
                v64 = v63 - v60;
                v47[v57] = v64;
                if (sub_92c5c(v63, v60 + v61, v61, v59))
                {
                    v57 = v62;
                    v78 = v45;
                    v79 = v61;
                    v77 = v4;
                    goto LABEL_8fd1c;
                }
                v39 = v59;
                v54 = v47[v62];
                v50 = *(long long *)iter1;
                v65 = v21;
                v66 = v45 + v65;
                v52 = j;
                v53 = v62;
                if (v66 < v52)
                {
                    v67 = v65;
                }
                else
                {
                    v67 = v65 + 1;
                    v52 += 128;
                }
                v35 = v17;
                v48 = 0xcf1bbcdcbfa56300;
                v23 = iter1;
                n = v45;
                v45 = v66;
                iter1 += v65;
                v55 = v67;
            } while (i > iter1);
        }
        else
        {
            v27 = &v26;
            v26 = &v27;
            v209 = a0->field_8;
            v210 = (unsigned int)(v33 - v209);
            v211 = a0->field_18;
            v212 = !*(int *)&a0->padding_1c[12];
            v213 = (v212 & v210 - v211 > v34 ? v210 - v34 : v211);
            v214 = a3 + a4;
            v4 = v209 + v213;
            n = (v4 != a3 ? a3 : a3 + 1);
            v215 = n - v209;
            v216 = v215 - (v212 & v215 - v211 > v34 ? v215 - v34 : v211);
            v5 = v216;
            v6 = a2[1];
            v9 = (v216 < v6 ? 0 : v6);
            v7 = *a2;
            v44 = (v216 < v7 ? 0 : v7);
            v11 = (1 < a0->field_114 ? a0->field_114 : 1) + 1;
            v217 = n + v11;
            v218 = v217 + 1;
            i = v214 - 8;
            v13 = v214;
            if (i <= v218)
                goto LABEL_8de90;
            v219 = a0->field_70;
            v220 = 0xcf1bbcdcbf9b0000;
            v18 = a3;
            v19 = 64 - a0->field_108;
            v12 = v214 - 32;
            v2 = v209 - 1;
            v3 = v209 + 2;
            v17 = v209;
            v8 = v213;
            while (1)
            {
                v221 = n;
                v222 = (long long)v221[1];
                v23 = v221 + 1;
                v223 = n;
                v224 = v223 + 128;
                v10 = v44;
                idx2 = v220 * *(long long *)v223 >> ((char)v19 & 63);
                v226 = v219[idx2];
                v15 = -(v44 & 0xffffffff);
                if (v44)
                    break;
                v252 = v11;
                while (1)
                {
                    v21 = v252;
                    j = v224;
                    v253 = v218;
                    v15 = v217;
                    v254 = v220;
                    v255 = v19;
                    v229 = v220 * v222 >> (v255 & 63);
                    v256 = n - v209;
                    v219[idx2] = v256;
                    v257 = v219;
                    v258 = v213;
                    v232 = v209;
                    if (sub_92c5c(n, v209 + (v226 & 0xffffffff), v226, v213))
                    {
                        v22 = v256;
                        v249 = v4;
                        v219 = v257;
                        v220 = v254;
LABEL_8e394:
                        v251 = v226;
                        v250 = v23;
                        goto LABEL_8e3d0;
                    }
                    v251 = v257[v229];
                    v250 = v15;
                    v259 = v254 * *(long long *)v250 >> (v255 & 63);
                    v235 = v23;
                    v236 = v235 - v232;
                    v257[v229] = v236;
                    if (!sub_92c5c(v235, v232 + v251, v251, v258))
                    {
                        v213 = v258;
                        v226 = v257[v259];
                        v222 = *(long long *)v253;
                        v260 = v21;
                        v217 = v250 + v260;
                        v224 = j;
                        v219 = v257;
                        idx2 = v259;
                        if (v224 <= v217)
                        {
                            v252 = v260 + 1;
                            v224 += 128;
                        }
                        else
                        {
                            v252 = v260;
                        }
                        v209 = v17;
                        v220 = 0xcf1bbcdcbf9b0000;
                        v23 = v253;
                        n = v15;
                        v218 = v253 + v260;
                        if (i <= v218)
                            goto LABEL_906f0;
                    }
                    else
                    {
                        v229 = v259;
                        v249 = v4;
                        v219 = v257;
LABEL_8e3ac:
                        v220 = 0xcf1bbcdcbf9b0000;
                        v22 = v236;
                        n = v235;
                        v232 = v17;
                        if (5 <= v21)
                            goto LABEL_8e3d8;
LABEL_8e3d0:
                        v219[v229] = v250 - v232;
LABEL_8e3d8:
                        v261 = v251 & 0xffffffff;
                        v246 = v232 + v261;
                        v44 = n - v246;
                        v247 = v44 + 3;
                        v248 = v18;
                        if (n <= v248)
                        {
                            v245 = 4;
                            v240 = v14;
                        }
                        else if ((unsigned int)v251 > (unsigned int)v8)
                        {
                            v262 = v2 + v261;
                            v263 = n - 1;
                            v245 = 4;
                            do
                            {
                                v264 = v263;
                                if (*(char *)v264 != *(char *)v262)
                                {
                                    v246 = v262 + 1;
                                    n = v264 + 1;
                                    v240 = v14;
                                    goto LABEL_8e470;
                                }
                            } while ((v245 += 1, v265 = v262 - 1, v266 = v264 - 1, v262 > v249 && (v262 = v265, v263 = v266, v248 < v264)));
                            v246 = v265 + 1;
                            n = v266 + 1;
                            v240 = v14;
                        }
                        else
                        {
                            v245 = 4;
                            v240 = v14;
                        }
LABEL_8e470:
                        v267 = sub_7cdfc(n + v245, v246 + v245, v13);
                        v268 = n;
                        v269 = v268 - v248;
                        v29 = &v28;
                        v28 = &v29;
                        if (v268 > v12)
                        {
                            v270 = v268;
                            sub_82208(v240->field_18, v248, v268, v12);
                            v209 = v17;
                            goto LABEL_8e4bc;
                        }
                        else
                        {
                            v270 = v268;
                            *v240->field_18 = *(int128_t *)v248;
                            v271 = v240->field_18;
                            if (v269 > 16)
                            {
                                v271[1] = (int128_t)v248[16];
                                v209 = v17;
                                if ((long long)v269 >= 33)
                                {
                                    node = v271 + 2;
                                    v273 = v248 + 48;
                                    do
                                    {
                                        *node = *(int128_t *)(v273 - 16);
                                        v274 = v273 + 32;
                                        node[1] = *(int128_t *)v273;
                                        node += 2;
                                        v209 = v17;
                                        v273 = v274;
                                    } while (node < (char *)v271 + v269);
                                }
LABEL_8e4bc:
                                v240->field_18 = (char *)v240->field_18 + v269;
                                v275 = v240->field_8;
                                v276 = v19;
                                if (v269 >= 0x10000)
                                {
                                    v277 = (char *)v275 - v240->field_0;
                                    v240->field_48 = 1;
                                    v240->field_4c = v277 >> 3;
                                    goto LABEL_8e55c;
                                }
                            }
                            else
                            {
                                v240->field_18 = (char *)v271 + v269;
                                v275 = v240->field_8;
                                v209 = v17;
                                v276 = v19;
LABEL_8e55c:
                                v278 = v267 + v245;
                                *(unsigned short *)v275->padding_4 = v269;
                                v275->field_0 = v247;
                                v279 = v278 - 3;
                                if (0x10000 <= v279)
                                {
                                    v280 = (char *)v275 - v240->field_0;
                                    v240->field_48 = 2;
                                    v240->field_4c = v280 >> 3;
                                }
                                v275->field_6 = v279;
                                v240->field_8 = &v275[1];
                                n = v270 + v278;
                                v213 = v8;
                                if (i < n)
                                {
                                    v281 = v10;
                                }
                                else
                                {
                                    v219[v220 * *(long long *)((char *)v3 + v22) >> (v276 & 63)] = v22 + 2;
                                    v219[v220 * *(long long *)((char *)n - 2) >> (v276 & 63)] = n - 2 - v209;
                                    v282 = v10;
                                    if (v282)
                                    {
                                        v283 = v44;
                                        do
                                        {
                                            v44 = v283;
                                            v283 = v282;
                                            v284 = v283 & 0xffffffff;
                                            if (*(int *)n != *(int *)((char *)n - v284))
                                            {
                                                v281 = v283;
                                                break;
                                            }
                                            v285 = n + 4;
                                            v209 = v17;
                                            v286 = n;
                                            v287 = sub_7cdfc(v285, v285 + -v284, v13);
                                            v219[v220 * *(long long *)v286 >> (v276 & 63)] = v286 - v209;
                                            v29 = &v28;
                                            v28 = &v29;
                                            if (v286 > v12)
                                            {
                                                sub_82208(v240->field_18, v286, v286, v12);
                                                v209 = v17;
                                            }
                                            else
                                            {
                                                *v240->field_18 = *(int128_t *)v286;
                                            }
                                            v288 = v240->field_8;
                                            *(unsigned short *)v288->padding_4 = 0;
                                            v288->field_0 = 1;
                                            v289 = v287 + 1;
                                            if (0x10000 <= v289)
                                            {
                                                v290 = (char *)v288 - v240->field_0;
                                                v240->field_48 = 2;
                                                v240->field_4c = v290 >> 3;
                                            }
                                            n = v285 + v287;
                                            v288->field_6 = v289;
                                            v240->field_8 = &v288[1];
                                            v282 = v44;
                                            v281 = v44;
                                            v44 = v283;
                                            v220 = 0xcf1bbcdcbf9b0000;
                                        } while (n <= i);
                                    }
                                    else
                                    {
                                        v281 = 0;
                                    }
                                }
                                v9 = v281;
                                v217 = n + v11;
                                v218 = v217 + 1;
                                v18 = n;
                                if (i <= v218)
                                    goto LABEL_906f8;
                                break;
                            }
                        }
                    }
                }
            }
            v227 = v11;
            do
            {
                v228 = *(int *)((char *)v217 + v15);
                v229 = v220 * v222 >> ((char)v19 & 63);
                v230 = n - v209;
                v219[idx2] = v230;
                if (*(int *)v217 == v228)
                {
                    v22 = v230;
                    v240 = v14;
                    v241 = v217 + v15;
                    v242 = *((char *)v217 - 1);
                    v243 = *((char *)v241 - 1);
                    v244 = v242 == v243;
                    v245 = (v242 != v243 ? 4 : 5);
                    n = v217 - v244;
                    v246 = v241 - v244;
                    v219[v229] = v23 - v209;
                    v247 = 1;
                    v44 = v10;
                    v10 = v9;
                    v248 = v18;
                    goto LABEL_8e470;
                }
                v21 = v227;
                j = v224;
                v231 = v213;
                v232 = v209;
                if (sub_92c5c(n, v209 + (v226 & 0xffffffff), v226, v213))
                {
                    v22 = v230;
                    v249 = v4;
                    v220 = 0xcf1bbcdcbf9b0000;
                    goto LABEL_8e394;
                }
                v233 = v219[v229];
                v234 = 0xcf1bbcdcbf9b0000 * *(long long *)v217 >> ((char)v19 & 63);
                v235 = v23;
                v236 = v235 - v232;
                v219[v229] = v236;
                if (sub_92c5c(v235, v232 + v233, v233, v231))
                {
                    v229 = v234;
                    v250 = v217;
                    v251 = v233;
                    v249 = v4;
                    goto LABEL_8e3ac;
                }
                v213 = v231;
                v226 = v219[v234];
                v222 = *(long long *)v218;
                v237 = v21;
                v238 = v217 + v237;
                v224 = j;
                idx2 = v234;
                if (v238 < v224)
                {
                    v239 = v237;
                }
                else
                {
                    v239 = v237 + 1;
                    v224 += 128;
                }
                v209 = v17;
                v220 = 0xcf1bbcdcbf9b0000;
                v23 = v218;
                n = v217;
                v217 = v238;
                v218 += v237;
                v227 = v239;
            } while (i > v218);
        }
    }
    else
    {
        if (v32 == 5)
        {
            v27 = &v26;
            v26 = &v27;
            v628 = a0->field_8;
            v629 = (unsigned int)(v33 - v628);
            v630 = a0->field_18;
            v631 = !*(int *)&a0->padding_1c[12];
            v632 = (v631 & v629 - v630 > v34 ? v629 - v34 : v630);
            v633 = a3 + a4;
            v4 = v628 + v632;
            n = (v4 != a3 ? a3 : a3 + 1);
            v634 = n - v628;
            v635 = v634 - (v631 & v634 - v630 > v34 ? v634 - v34 : v630);
            v5 = v635;
            v6 = a2[1];
            v9 = (v635 < v6 ? 0 : v6);
            v7 = *a2;
            v44 = (v635 < v7 ? 0 : v7);
            v11 = (1 < a0->field_114 ? a0->field_114 : 1) + 1;
            v636 = n + v11;
            v637 = v636 + 1;
            i = v633 - 8;
            v13 = v633;
            if (i > v637)
            {
                v638 = a0->field_70;
                v639 = 0xcf1bbcdcbb000000;
                v18 = a3;
                v19 = 64 - a0->field_108;
                v12 = v633 - 32;
                v2 = v628 - 1;
                v3 = v628 + 2;
                v17 = v628;
                v8 = v632;
                while (1)
                {
                    v640 = n;
                    v641 = (long long)v640[1];
                    v23 = v640 + 1;
                    v642 = n;
                    v643 = v642 + 128;
                    v10 = v44;
                    v644 = v639 * *(long long *)v642 >> ((char)v19 & 63);
                    v645 = v638[v644];
                    v15 = -(v44 & 0xffffffff);
                    if (v44)
                        break;
                    v671 = v11;
                    while (1)
                    {
                        v21 = v671;
                        j = v643;
                        v672 = v637;
                        v15 = v636;
                        v673 = v639;
                        v674 = v19;
                        index = v639 * v641 >> (v674 & 63);
                        v675 = n - v628;
                        v638[v644] = v675;
                        v676 = v638;
                        v677 = v632;
                        v651 = v628;
                        if (sub_92cac(n, v628 + (v645 & 0xffffffff), v645, v632))
                        {
                            v22 = v675;
                            v668 = v4;
                            v638 = v676;
                            v639 = v673;
LABEL_8f69c:
                            v670 = v645;
                            v669 = v23;
                            goto LABEL_8f6d8;
                        }
                        v670 = v676[index];
                        v669 = v15;
                        v678 = v673 * *(long long *)v669 >> (v674 & 63);
                        v654 = v23;
                        v655 = v654 - v651;
                        v676[index] = v655;
                        if (!sub_92cac(v654, v651 + v670, v670, v677))
                        {
                            v632 = v677;
                            v645 = v676[v678];
                            v641 = *(long long *)v672;
                            v679 = v21;
                            v636 = v669 + v679;
                            v643 = j;
                            v638 = v676;
                            v644 = v678;
                            if (v643 <= v636)
                            {
                                v671 = v679 + 1;
                                v643 += 128;
                            }
                            else
                            {
                                v671 = v679;
                            }
                            v628 = v17;
                            v639 = 0xcf1bbcdcbb000000;
                            v23 = v672;
                            n = v15;
                            v637 = v672 + v679;
                            if (i <= v637)
                            {
LABEL_906f0:
                                v44 = 0;
                                n = v18;
                                goto LABEL_906f8;
                            }
                        }
                        else
                        {
                            index = v678;
                            v668 = v4;
                            v638 = v676;
LABEL_8f6b4:
                            v639 = 0xcf1bbcdcbb000000;
                            v22 = v655;
                            n = v654;
                            v651 = v17;
                            if (5 <= v21)
                                goto LABEL_8f6e0;
LABEL_8f6d8:
                            v638[index] = v669 - v651;
LABEL_8f6e0:
                            v680 = v670 & 0xffffffff;
                            v665 = v651 + v680;
                            v44 = n - v665;
                            v666 = v44 + 3;
                            v667 = v18;
                            if (n > v667)
                            {
                                if ((unsigned int)v670 > (unsigned int)v8)
                                {
                                    v681 = v2 + v680;
                                    v682 = n - 1;
                                    v664 = 4;
                                    do
                                    {
                                        v683 = v682;
                                        if (*(char *)v683 != *(char *)v681)
                                        {
                                            v665 = v681 + 1;
                                            n = v683 + 1;
                                            v659 = v14;
                                            goto LABEL_8f778;
                                        }
                                    } while ((v664 += 1, v684 = v681 - 1, v685 = v683 - 1, v681 > v668 && (v681 = v684, v682 = v685, v667 < v683)));
                                    v665 = v684 + 1;
                                    n = v685 + 1;
                                    v659 = v14;
                                }
                                else
                                {
                                    v664 = 4;
                                    v659 = v14;
                                }
                            }
                            else
                            {
                                v664 = 4;
                                v659 = v14;
                            }
LABEL_8f778:
                            v686 = sub_7cdfc(n + v664, v665 + v664, v13);
                            v687 = n;
                            v688 = v687 - v667;
                            v29 = &v28;
                            v28 = &v29;
                            if (v687 > v12)
                            {
                                v689 = v687;
                                sub_82208(v659->field_18, v667, v687, v12);
                                v628 = v17;
                                goto LABEL_8f7c4;
                            }
                            else
                            {
                                v689 = v687;
                                *v659->field_18 = *(int128_t *)v667;
                                v690 = v659->field_18;
                                if (v688 > 16)
                                {
                                    v690[1] = (int128_t)v667[16];
                                    v628 = v17;
                                    if ((long long)v688 >= 33)
                                    {
                                        i3 = v690 + 2;
                                        v692 = v667 + 48;
                                        do
                                        {
                                            *i3 = *(int128_t *)(v692 - 16);
                                            v693 = v692 + 32;
                                            i3[1] = *(int128_t *)v692;
                                            i3 += 2;
                                            v628 = v17;
                                            v692 = v693;
                                        } while (i3 < (char *)v690 + v688);
                                    }
LABEL_8f7c4:
                                    v659->field_18 = (char *)v659->field_18 + v688;
                                    v694 = v659->field_8;
                                    v695 = v19;
                                    if (v688 >= 0x10000)
                                    {
                                        v696 = (char *)v694 - v659->field_0;
                                        v659->field_48 = 1;
                                        v659->field_4c = v696 >> 3;
                                        goto LABEL_8f864;
                                    }
                                }
                                else
                                {
                                    v659->field_18 = (char *)v690 + v688;
                                    v694 = v659->field_8;
                                    v628 = v17;
                                    v695 = v19;
LABEL_8f864:
                                    v697 = v686 + v664;
                                    *(unsigned short *)v694->padding_4 = v688;
                                    v694->field_0 = v666;
                                    v698 = v697 - 3;
                                    if (0x10000 <= v698)
                                    {
                                        v699 = (char *)v694 - v659->field_0;
                                        v659->field_48 = 2;
                                        v659->field_4c = v699 >> 3;
                                    }
                                    v694->field_6 = v698;
                                    v659->field_8 = &v694[1];
                                    n = v689 + v697;
                                    v632 = v8;
                                    if (i < n)
                                    {
                                        v700 = v10;
                                    }
                                    else
                                    {
                                        v638[v639 * *(long long *)((char *)v3 + v22) >> (v695 & 63)] = v22 + 2;
                                        v638[v639 * *(long long *)((char *)n - 2) >> (v695 & 63)] = n - 2 - v628;
                                        v701 = v10;
                                        if (v701)
                                        {
                                            v702 = v44;
                                            do
                                            {
                                                v44 = v702;
                                                v702 = v701;
                                                v703 = v702 & 0xffffffff;
                                                if (*(int *)n != *(int *)((char *)n - v703))
                                                {
                                                    v700 = v702;
                                                    break;
                                                }
                                                v704 = n + 4;
                                                v628 = v17;
                                                v705 = n;
                                                v706 = sub_7cdfc(v704, v704 + -v703, v13);
                                                v638[v639 * *(long long *)v705 >> (v695 & 63)] = v705 - v628;
                                                v29 = &v28;
                                                v28 = &v29;
                                                if (v705 > v12)
                                                {
                                                    sub_82208(v659->field_18, v705, v705, v12);
                                                    v628 = v17;
                                                }
                                                else
                                                {
                                                    *v659->field_18 = *(int128_t *)v705;
                                                }
                                                v707 = v659->field_8;
                                                *(unsigned short *)v707->padding_4 = 0;
                                                v707->field_0 = 1;
                                                v708 = v706 + 1;
                                                if (0x10000 <= v708)
                                                {
                                                    v709 = (char *)v707 - v659->field_0;
                                                    v659->field_48 = 2;
                                                    v659->field_4c = v709 >> 3;
                                                }
                                                n = v704 + v706;
                                                v707->field_6 = v708;
                                                v659->field_8 = &v707[1];
                                                v701 = v44;
                                                v700 = v44;
                                                v44 = v702;
                                                v639 = 0xcf1bbcdcbb000000;
                                            } while (n <= i);
                                        }
                                        else
                                        {
                                            v700 = 0;
                                        }
                                    }
                                    v9 = v700;
                                    v636 = n + v11;
                                    v637 = v636 + 1;
                                    v18 = n;
                                    if (i <= v637)
                                        goto LABEL_906f8;
                                    break;
                                }
                            }
                        }
                    }
                }
                v646 = v11;
                do
                {
                    v647 = *(int *)((char *)v636 + v15);
                    index = v639 * v641 >> ((char)v19 & 63);
                    v649 = n - v628;
                    v638[v644] = v649;
                    if (*(int *)v636 == v647)
                    {
                        v22 = v649;
                        v659 = v14;
                        v660 = v636 + v15;
                        v661 = *((char *)v636 - 1);
                        v662 = *((char *)v660 - 1);
                        v663 = v661 == v662;
                        v664 = (v661 != v662 ? 4 : 5);
                        n = v636 - v663;
                        v665 = v660 - v663;
                        v638[index] = v23 - v628;
                        v666 = 1;
                        v44 = v10;
                        v10 = v9;
                        v667 = v18;
                        goto LABEL_8f778;
                    }
                    v21 = v646;
                    j = v643;
                    v650 = v632;
                    v651 = v628;
                    if (sub_92cac(n, v628 + (v645 & 0xffffffff), v645, v632))
                    {
                        v22 = v649;
                        v668 = v4;
                        v639 = 0xcf1bbcdcbb000000;
                        goto LABEL_8f69c;
                    }
                    v652 = v638[index];
                    v653 = 0xcf1bbcdcbb000000 * *(long long *)v636 >> ((char)v19 & 63);
                    v654 = v23;
                    v655 = v654 - v651;
                    v638[index] = v655;
                    if (sub_92cac(v654, v651 + v652, v652, v650))
                    {
                        index = v653;
                        v669 = v636;
                        v670 = v652;
                        v668 = v4;
                        goto LABEL_8f6b4;
                    }
                    v632 = v650;
                    v645 = v638[v653];
                    v641 = *(long long *)v637;
                    v656 = v21;
                    v657 = v636 + v656;
                    v643 = j;
                    v644 = v653;
                    if (v657 < v643)
                    {
                        v658 = v656;
                    }
                    else
                    {
                        v658 = v656 + 1;
                        v643 += 128;
                    }
                    v628 = v17;
                    v639 = 0xcf1bbcdcbb000000;
                    v23 = v637;
                    n = v636;
                    v636 = v657;
                    v637 += v656;
                    v646 = v658;
                } while (i > v637);
            }
            else
            {
LABEL_8de90:
                n = a3;
                goto LABEL_906f8;
            }
        }
        else if (v32 != 6)
        {
            if (v32 != 7)
            {
                v27 = &v26;
                v26 = &v27;
                v455 = a0->field_8;
                v456 = (unsigned int)(v33 - v455);
                v457 = a0->field_18;
                v458 = !*(int *)&a0->padding_1c[12];
                v459 = (v458 & v456 - v457 > v34 ? v456 - v34 : v457);
                v460 = a3 + a4;
                v3 = v455 + v459;
                n = (v3 != a3 ? a3 : a3 + 1);
                v461 = n - v455;
                v462 = v461 - (v458 & v461 - v457 > v34 ? v461 - v34 : v457);
                v5 = a2[1];
                v6 = *a2;
                v9 = (v462 < v5 ? 0 : v5);
                v463 = (v462 < v6 ? 0 : v6);
                v11 = (1 < a0->field_114 ? a0->field_114 : 1) + 1;
                v464 = n + v11;
                v465 = v464 + 1;
                j = v460 - 8;
                v8 = v460;
                v4 = v462;
                if (j > v465)
                {
                    v18 = a3;
                    v466 = a0->field_70;
                    v467 = 32 - a0->field_108;
                    v7 = v460 - 32;
                    v1 = v455 - 1;
                    v2 = v455 + 2;
                    v21 = v455;
                    v12 = v459;
                    v19 = v467;
                }
                else
                {
                    n = a3;
                    goto LABEL_914ec;
                }
LABEL_90e3c:
                v468 = n;
                v469 = (int)v468[1];
                v17 = v468 + 1;
                v470 = n;
                v471 = v470 + 128;
                v10 = v463;
                v472 = 2654435761 * *(int *)v470 >> ((char)v467 & 31);
                v473 = v466[v472 & 0xffffffff];
                v15 = -(v463 & 0xffffffff);
                if (v463)
                {
                    v474 = v11;
                    do
                    {
                        v475 = *(int *)((char *)v464 + v15);
                        v476 = 2654435761 * v469 >> ((char)v467 & 31);
                        v13 = n - v455;
                        v466[v472] = v13;
                        if (*(int *)v464 == v475)
                        {
                            v488 = v14;
                            v489 = v464 + v15;
                            v490 = *((char *)v464 - 1);
                            v491 = *((char *)v489 - 1);
                            v492 = v490 == v491;
                            v493 = (v490 != v491 ? 4 : 5);
                            n = v464 - v492;
                            v494 = v489 - v492;
                            v495 = v18;
                            v466[v476] = v17 - v455;
                            v496 = 1;
                            v463 = v10;
                            v10 = v9;
                            v497 = v8;
                            goto LABEL_911d4;
                        }
                        v23 = v474;
                        v477 = v471;
                        v478 = v465;
                        i = v464;
                        v479 = v473;
                        v480 = v459;
                        v481 = v455;
                        if (sub_92cac(n, v455 + (v473 & 0xffffffff), v479, v459))
                        {
                            v497 = v8;
                            v498 = v3;
                            v499 = v479;
                            v484 = v17;
                            v483 = v476;
                            goto LABEL_91134;
                        }
                        v482 = v466[v476];
                        v467 = v19;
                        v483 = 2654435761 * *(int *)v464 >> ((char)v467 & 31);
                        v484 = v17;
                        v485 = v484 - v481;
                        v466[v476] = v485;
                        if (sub_92cac(v484, v481 + v482, v482, v480))
                        {
                            v13 = v485;
                            v499 = v482;
                            v498 = v3;
                            v500 = i;
                            goto LABEL_9111c;
                        }
                        v459 = v480;
                        v473 = v466[v483];
                        v469 = *(int *)v478;
                        n = i;
                        v486 = v23;
                        v487 = n + v486;
                        v471 = v477;
                        v472 = v483;
                        if (v487 < v477)
                        {
                            v474 = v486;
                        }
                        else
                        {
                            v474 = v486 + 1;
                            v471 += 128;
                        }
                        v455 = v21;
                        v17 = v478;
                        v464 = v487;
                        v465 = v478 + v486;
                    } while (j > v465);
                    n = v18;
                    v463 = v10;
                    goto LABEL_914ec;
                }
                else
                {
                    v501 = v11;
                    v502 = v17;
                }
                while (1)
                {
                    i = v465;
                    v484 = v502;
                    v23 = v501;
                    v17 = v471;
                    v500 = v464;
                    v483 = 2654435761 * v469 >> ((char)v467 & 31);
                    v503 = n - v455;
                    v466[v472] = v503;
                    v499 = v473;
                    v504 = v466;
                    v505 = v459;
                    v481 = v455;
                    if (sub_92cac(n, v455 + (v473 & 0xffffffff), v499, v459))
                    {
                        v13 = v503;
                        v497 = v8;
                        v498 = v3;
                        v466 = v504;
                        goto LABEL_91134;
                    }
                    v499 = v504[v483];
                    v506 = 2654435761 * *(int *)v500 >> ((char)v467 & 31);
                    v507 = v484 - v481;
                    v504[v483] = v507;
                    if (!sub_92cac(v484, v481 + v499, v499, v505))
                    {
                        v459 = v505;
                        v473 = v504[v506];
                        v508 = i;
                        v471 = v17;
                        v469 = *(int *)v508;
                        v509 = v23;
                        v510 = v500 + v509;
                        v466 = v504;
                        n = v500;
                        v472 = v506;
                        if (v471 <= v510)
                        {
                            v501 = v509 + 1;
                            v471 += 128;
                        }
                        else
                        {
                            v501 = v509;
                        }
                        v455 = v21;
                        v502 = v508;
                        v464 = v510;
                        v465 = v508 + v509;
                        v467 = v19;
                        if (j <= v465)
                        {
                            v463 = 0;
                            n = v18;
LABEL_914ec:
                            v541 = v6;
                            v542 = arm64g_calculate_condition((v463 ? 3 : 0) | 128, (v463 ? v6 : 0), (v463 ? v4 : 0), 0);
                            v543 = v9;
                            v544 = a2;
                            *v544 = (v463 ? v463 : v4 < v541 ? v541 : 0);
                            v544[1] = (!v543 ? (v542 & 1 ? v541 : v4 < v5 ? v5 : 0) : v543);
                            v545 = v8;
                            break;
                        }
                    }
                    else
                    {
                        v483 = v506;
                        v13 = v507;
                        v498 = v3;
                        v466 = v504;
LABEL_9111c:
                        v481 = v21;
                        n = v484;
                        v484 = v500;
                        v497 = v8;
                        if (5 <= v23)
                            goto LABEL_9113c;
LABEL_91134:
                        v466[v483] = v484 - v481;
LABEL_9113c:
                        v511 = v499 & 0xffffffff;
                        v494 = v481 + v511;
                        v463 = n - v494;
                        v496 = v463 + 3;
                        v495 = v18;
                        if (n <= v495)
                        {
                            v493 = 4;
                            v488 = v14;
                        }
                        else if ((unsigned int)v499 > (unsigned int)v12)
                        {
                            v512 = v1 + v511;
                            v513 = n - 1;
                            v493 = 4;
                            do
                            {
                                v514 = v513;
                                if (*(char *)v514 != *(char *)v512)
                                {
                                    v494 = v512 + 1;
                                    n = v514 + 1;
                                    v488 = v14;
                                    goto LABEL_911d4;
                                }
                            } while ((v493 += 1, v515 = v512 - 1, v516 = v514 - 1, v512 > v498 && (v512 = v515, v513 = v516, v495 < v514)));
                            v494 = v515 + 1;
                            n = v516 + 1;
                            v488 = v14;
                        }
                        else
                        {
                            v493 = 4;
                            v488 = v14;
                        }
LABEL_911d4:
                        v517 = sub_7cdfc(n + v493, v494 + v493, v497);
                        v518 = n;
                        v519 = v518 - v495;
                        v29 = &v28;
                        v28 = &v29;
                        if (v518 > v7)
                        {
                            v520 = v518;
                            sub_82208(v488->field_18, v495, v518, v7);
                            v455 = v21;
                            goto LABEL_91220;
                        }
                        else
                        {
                            v520 = v518;
                            *v488->field_18 = *(int128_t *)v495;
                            v521 = v488->field_18;
                            if (v519 > 16)
                            {
                                v521[1] = (int128_t)v495[16];
                                v455 = v21;
                                if ((long long)v519 >= 33)
                                {
                                    m = v521 + 2;
                                    v523 = v495 + 48;
                                    do
                                    {
                                        *m = *(int128_t *)(v523 - 16);
                                        v524 = v523 + 32;
                                        m[1] = *(int128_t *)v523;
                                        m += 2;
                                        v455 = v21;
                                        v523 = v524;
                                    } while (m < (char *)v521 + v519);
                                }
LABEL_91220:
                                v488->field_18 = (char *)v488->field_18 + v519;
                                v525 = v488->field_8;
                                if (v519 >= 0x10000)
                                {
                                    v526 = (char *)v525 - v488->field_0;
                                    v488->field_48 = 1;
                                    v488->field_4c = v526 >> 3;
                                    goto LABEL_912b8;
                                }
                            }
                            else
                            {
                                v488->field_18 = (char *)v521 + v519;
                                v525 = v488->field_8;
                                v455 = v21;
LABEL_912b8:
                                v527 = v517 + v493;
                                *(unsigned short *)v525->padding_4 = v519;
                                v525->field_0 = v496;
                                v528 = v527 - 3;
                                if (0x10000 <= v528)
                                {
                                    v529 = (char *)v525 - v488->field_0;
                                    v488->field_48 = 2;
                                    v488->field_4c = v529 >> 3;
                                }
                                v525->field_6 = v528;
                                v488->field_8 = &v525[1];
                                n = v520 + v527;
                                if (j < n)
                                {
                                    v530 = v10;
                                    v459 = v12;
                                }
                                else
                                {
                                    v531 = v19;
                                    v466[2654435761 * *(int *)((char *)v2 + v13) >> (v531 & 31)] = v13 + 2;
                                    v466[2654435761 * *(int *)((char *)n - 2) >> (v531 & 31)] = n - 2 - v455;
                                    v532 = v10;
                                    if (v532)
                                    {
                                        v533 = v463;
                                        do
                                        {
                                            v463 = v533;
                                            v533 = v532;
                                            v534 = v532 & 0xffffffff;
                                            if (*(int *)n != *(int *)((char *)n - v534))
                                            {
                                                v530 = v533;
                                                v459 = v12;
                                                break;
                                            }
                                            v535 = n + 4;
                                            v455 = v21;
                                            v536 = n;
                                            v537 = sub_7cdfc(v535, v535 + -v534, v497);
                                            v466[2654435761 * *(int *)n >> ((char)v19 & 31)] = v536 - v455;
                                            v29 = &v28;
                                            v28 = &v29;
                                            if (v536 > v7)
                                            {
                                                sub_82208(v488->field_18, v536, v536, v7);
                                                v455 = v21;
                                            }
                                            else
                                            {
                                                *v488->field_18 = *(int128_t *)v536;
                                            }
                                            v459 = v12;
                                            v538 = v488->field_8;
                                            *(unsigned short *)v538->padding_4 = 0;
                                            v538->field_0 = 1;
                                            v539 = v537 + 1;
                                            if (0x10000 <= v539)
                                            {
                                                v540 = (char *)v538 - v488->field_0;
                                                v488->field_48 = 2;
                                                v488->field_4c = v540 >> 3;
                                            }
                                            n = v535 + v537;
                                            v538->field_6 = v539;
                                            v488->field_8 = &v538[1];
                                            v532 = v463;
                                            v530 = v463;
                                            v463 = v533;
                                        } while (n <= j);
                                    }
                                    else
                                    {
                                        v530 = 0;
                                        v459 = v12;
                                    }
                                }
                                v9 = v530;
                                v464 = n + v11;
                                v465 = v464 + 1;
                                v18 = n;
                                v467 = v19;
                                if (j <= v465)
                                    goto LABEL_914ec;
                                goto LABEL_90e3c;
                            }
                        }
                    }
                }
                goto LABEL_90738;
            }
            v27 = &v26;
            v26 = &v27;
            v373 = a0->field_8;
            v374 = (unsigned int)(v33 - v373);
            v375 = a0->field_18;
            v376 = !*(int *)&a0->padding_1c[12];
            v377 = (v376 & v374 - v375 > v34 ? v374 - v34 : v375);
            v378 = a3 + a4;
            v4 = v373 + v377;
            n = (v4 != a3 ? a3 : a3 + 1);
            v379 = n - v373;
            v380 = v379 - (v376 & v379 - v375 > v34 ? v379 - v34 : v375);
            v6 = a2[1];
            v7 = *a2;
            v9 = (v380 < v6 ? 0 : v6);
            v44 = (v380 < v7 ? 0 : v7);
            v11 = (1 < a0->field_114 ? a0->field_114 : 1) + 1;
            v381 = n + v11;
            v382 = v381 + 1;
            i = v378 - 8;
            v13 = v378;
            v5 = v380;
            if (i <= v382)
                goto LABEL_8de90;
            v383 = a0->field_70;
            v384 = 0xcf1bbcdcbfa56300;
            v18 = a3;
            v19 = 64 - a0->field_108;
            v12 = v378 - 32;
            v2 = v373 - 1;
            v3 = v373 + 2;
            v17 = v373;
            v8 = v377;
            while (1)
            {
                v385 = n;
                v386 = (long long)v385[1];
                v23 = v385 + 1;
                v387 = n;
                v388 = v387 + 128;
                v10 = v44;
                v389 = v384 * *(long long *)v387 >> ((char)v19 & 63);
                v390 = v383[v389];
                v15 = -(v44 & 0xffffffff);
                if (v44)
                    break;
                v416 = v11;
                while (1)
                {
                    v21 = v416;
                    j = v388;
                    v417 = v382;
                    v15 = v381;
                    v418 = v384;
                    v419 = v19;
                    v393 = v384 * v386 >> (v419 & 63);
                    v420 = n - v373;
                    v383[v389] = v420;
                    v421 = v383;
                    v422 = v377;
                    v396 = v373;
                    if (sub_92cac(n, v373 + (v390 & 0xffffffff), v390, v377))
                    {
                        v22 = v420;
                        v413 = v4;
                        v383 = v421;
                        v384 = v418;
LABEL_90374:
                        v415 = v390;
                        v414 = v23;
                        goto LABEL_903b4;
                    }
                    v415 = v421[v393];
                    v414 = v15;
                    v423 = v418 * *(long long *)v414 >> (v419 & 63);
                    v399 = v23;
                    v400 = v399 - v396;
                    v421[v393] = v400;
                    if (!sub_92cac(v399, v396 + v415, v415, v422))
                    {
                        v377 = v422;
                        v390 = v421[v423];
                        v386 = *(long long *)v417;
                        v424 = v21;
                        v381 = v414 + v424;
                        v388 = j;
                        v383 = v421;
                        v389 = v423;
                        if (v388 <= v381)
                        {
                            v416 = v424 + 1;
                            v388 += 128;
                        }
                        else
                        {
                            v416 = v424;
                        }
                        v373 = v17;
                        v384 = 0xcf1bbcdcbfa56300;
                        v23 = v417;
                        n = v15;
                        v382 = v417 + v424;
                        if (i <= v382)
                            goto LABEL_906f0;
                    }
                    else
                    {
                        v393 = v423;
                        v413 = v4;
                        v383 = v421;
LABEL_9038c:
                        v384 = 0xcf1bbcdcbfa56300;
                        v22 = v400;
                        n = v399;
                        v396 = v17;
                        if (5 <= v21)
                            goto LABEL_903bc;
LABEL_903b4:
                        v383[v393] = v414 - v396;
LABEL_903bc:
                        v425 = v415 & 0xffffffff;
                        v410 = v396 + v425;
                        v44 = n - v410;
                        v411 = v44 + 3;
                        v412 = v18;
                        if (n <= v412)
                        {
                            v409 = 4;
                            v404 = v14;
                        }
                        else if ((unsigned int)v415 > (unsigned int)v8)
                        {
                            v426 = v2 + v425;
                            v427 = n - 1;
                            v409 = 4;
                            do
                            {
                                v428 = v427;
                                if (*(char *)v428 != *(char *)v426)
                                {
                                    v410 = v426 + 1;
                                    n = v428 + 1;
                                    v404 = v14;
                                    goto LABEL_90454;
                                }
                            } while ((v409 += 1, v429 = v426 - 1, v430 = v428 - 1, v426 > v413 && (v426 = v429, v427 = v430, v412 < v428)));
                            v410 = v429 + 1;
                            n = v430 + 1;
                            v404 = v14;
                        }
                        else
                        {
                            v409 = 4;
                            v404 = v14;
                        }
LABEL_90454:
                        v431 = sub_7cdfc(n + v409, v410 + v409, v13);
                        v432 = n;
                        v433 = v432 - v412;
                        v29 = &v28;
                        v28 = &v29;
                        if (v432 > v12)
                        {
                            v434 = v432;
                            sub_82208(v404->field_18, v412, v432, v12);
                            v373 = v17;
                            goto LABEL_904a0;
                        }
                        else
                        {
                            v434 = v432;
                            *v404->field_18 = *(int128_t *)v412;
                            v435 = v404->field_18;
                            if (v433 > 16)
                            {
                                v435[1] = (int128_t)v412[16];
                                v373 = v17;
                                if ((long long)v433 >= 33)
                                {
                                    i5 = v435 + 2;
                                    v437 = v412 + 48;
                                    do
                                    {
                                        *i5 = *(int128_t *)(v437 - 16);
                                        v438 = v437 + 32;
                                        i5[1] = *(int128_t *)v437;
                                        i5 += 2;
                                        v373 = v17;
                                        v437 = v438;
                                    } while (i5 < (char *)v435 + v433);
                                }
LABEL_904a0:
                                v404->field_18 = (char *)v404->field_18 + v433;
                                v439 = v404->field_8;
                                v440 = v19;
                                if (v433 >= 0x10000)
                                {
                                    v441 = (char *)v439 - v404->field_0;
                                    v404->field_48 = 1;
                                    v404->field_4c = v441 >> 3;
                                    goto LABEL_90540;
                                }
                            }
                            else
                            {
                                v404->field_18 = (char *)v435 + v433;
                                v439 = v404->field_8;
                                v373 = v17;
                                v440 = v19;
LABEL_90540:
                                v442 = v431 + v409;
                                *(unsigned short *)v439->padding_4 = v433;
                                v439->field_0 = v411;
                                v443 = v442 - 3;
                                if (0x10000 <= v443)
                                {
                                    v444 = (char *)v439 - v404->field_0;
                                    v404->field_48 = 2;
                                    v404->field_4c = v444 >> 3;
                                }
                                v439->field_6 = v443;
                                v404->field_8 = &v439[1];
                                n = v434 + v442;
                                v377 = v8;
                                if (i < n)
                                {
                                    v445 = v10;
                                }
                                else
                                {
                                    v383[v384 * *(long long *)((char *)v3 + v22) >> (v440 & 63)] = v22 + 2;
                                    v383[v384 * *(long long *)((char *)n - 2) >> (v440 & 63)] = n - 2 - v373;
                                    v446 = v10;
                                    if (v446)
                                    {
                                        v447 = v44;
                                        do
                                        {
                                            v44 = v447;
                                            v447 = v446;
                                            v448 = v447 & 0xffffffff;
                                            if (*(int *)n != *(int *)((char *)n - v448))
                                            {
                                                v445 = v447;
                                                break;
                                            }
                                            v449 = n + 4;
                                            v373 = v17;
                                            v450 = n;
                                            v451 = sub_7cdfc(v449, v449 + -v448, v13);
                                            v383[v384 * *(long long *)v450 >> (v440 & 63)] = v450 - v373;
                                            v29 = &v28;
                                            v28 = &v29;
                                            if (v450 > v12)
                                            {
                                                sub_82208(v404->field_18, v450, v450, v12);
                                                v373 = v17;
                                            }
                                            else
                                            {
                                                *v404->field_18 = *(int128_t *)v450;
                                            }
                                            v452 = v404->field_8;
                                            *(unsigned short *)v452->padding_4 = 0;
                                            v452->field_0 = 1;
                                            v453 = v451 + 1;
                                            if (0x10000 <= v453)
                                            {
                                                v454 = (char *)v452 - v404->field_0;
                                                v404->field_48 = 2;
                                                v404->field_4c = v454 >> 3;
                                            }
                                            n = v449 + v451;
                                            v452->field_6 = v453;
                                            v404->field_8 = &v452[1];
                                            v446 = v44;
                                            v445 = v44;
                                            v44 = v447;
                                            v384 = 0xcf1bbcdcbfa56300;
                                        } while (n <= i);
                                    }
                                    else
                                    {
                                        v445 = 0;
                                    }
                                }
                                v9 = v445;
                                v381 = n + v11;
                                v382 = v381 + 1;
                                v18 = n;
                                if (i <= v382)
                                    goto LABEL_906f8;
                                break;
                            }
                        }
                    }
                }
            }
            v391 = v11;
            do
            {
                v392 = *(int *)((char *)v381 + v15);
                v393 = v384 * v386 >> ((char)v19 & 63);
                v394 = n - v373;
                v383[v389] = v394;
                if (*(int *)v381 == v392)
                {
                    v22 = v394;
                    v404 = v14;
                    v405 = v381 + v15;
                    v406 = *((char *)v381 - 1);
                    v407 = *((char *)v405 - 1);
                    v408 = v406 == v407;
                    v409 = (v406 != v407 ? 4 : 5);
                    n = v381 - v408;
                    v410 = v405 - v408;
                    v383[v393] = v23 - v373;
                    v411 = 1;
                    v44 = v10;
                    v10 = v9;
                    v412 = v18;
                    goto LABEL_90454;
                }
                v21 = v391;
                j = v388;
                v395 = v377;
                v396 = v373;
                if (sub_92cac(n, v373 + (v390 & 0xffffffff), v390, v377))
                {
                    v22 = v394;
                    v413 = v4;
                    v384 = 0xcf1bbcdcbfa56300;
                    goto LABEL_90374;
                }
                v397 = v383[v393];
                v398 = 0xcf1bbcdcbfa56300 * *(long long *)v381 >> ((char)v19 & 63);
                v399 = v23;
                v400 = v399 - v396;
                v383[v393] = v400;
                if (sub_92cac(v399, v396 + v397, v397, v395))
                {
                    v393 = v398;
                    v414 = v381;
                    v415 = v397;
                    v413 = v4;
                    goto LABEL_9038c;
                }
                v377 = v395;
                v390 = v383[v398];
                v386 = *(long long *)v382;
                v401 = v21;
                v402 = v381 + v401;
                v388 = j;
                v389 = v398;
                if (v402 < v388)
                {
                    v403 = v401;
                }
                else
                {
                    v403 = v401 + 1;
                    v388 += 128;
                }
                v373 = v17;
                v384 = 0xcf1bbcdcbfa56300;
                v23 = v382;
                n = v381;
                v381 = v402;
                v382 += v401;
                v391 = v403;
            } while (i > v382);
        }
        else
        {
            v27 = &v26;
            v26 = &v27;
            v546 = a0->field_8;
            v547 = (unsigned int)(v33 - v546);
            v548 = a0->field_18;
            v549 = !*(int *)&a0->padding_1c[12];
            v550 = (v549 & v547 - v548 > v34 ? v547 - v34 : v548);
            v551 = a3 + a4;
            v4 = v546 + v550;
            n = (v4 != a3 ? a3 : a3 + 1);
            v552 = n - v546;
            v553 = v552 - (v549 & v552 - v548 > v34 ? v552 - v34 : v548);
            v5 = v553;
            v6 = a2[1];
            v9 = (v553 < v6 ? 0 : v6);
            v7 = *a2;
            v44 = (v553 < v7 ? 0 : v7);
            v11 = (1 < a0->field_114 ? a0->field_114 : 1) + 1;
            v554 = n + v11;
            v555 = v554 + 1;
            i = v551 - 8;
            v13 = v551;
            if (i <= v555)
                goto LABEL_8de90;
            v556 = a0->field_70;
            v557 = 0xcf1bbcdcbf9b0000;
            v18 = a3;
            v19 = 64 - a0->field_108;
            v12 = v551 - 32;
            v2 = v546 - 1;
            v3 = v546 + 2;
            v17 = v546;
            v8 = v550;
            while (1)
            {
                v558 = n;
                v559 = (long long)v558[1];
                v23 = v558 + 1;
                v560 = n;
                v561 = v560 + 128;
                v10 = v44;
                v562 = v557 * *(long long *)v560 >> ((char)v19 & 63);
                v563 = v556[v562];
                v15 = -(v44 & 0xffffffff);
                if (v44)
                    break;
                v589 = v11;
                while (1)
                {
                    v21 = v589;
                    j = v561;
                    v590 = v555;
                    v15 = v554;
                    v591 = v557;
                    v592 = v19;
                    v566 = v557 * v559 >> (v592 & 63);
                    v593 = n - v546;
                    v556[v562] = v593;
                    v594 = v556;
                    v595 = v550;
                    v569 = v546;
                    if (sub_92cac(n, v546 + (v563 & 0xffffffff), v563, v550))
                    {
                        v22 = v593;
                        v586 = v4;
                        v556 = v594;
                        v557 = v591;
LABEL_8e9ec:
                        v588 = v563;
                        v587 = v23;
                        goto LABEL_8ea28;
                    }
                    v588 = v594[v566];
                    v587 = v15;
                    v596 = v591 * *(long long *)v587 >> (v592 & 63);
                    v572 = v23;
                    v573 = v572 - v569;
                    v594[v566] = v573;
                    if (!sub_92cac(v572, v569 + v588, v588, v595))
                    {
                        v550 = v595;
                        v563 = v594[v596];
                        v559 = *(long long *)v590;
                        v597 = v21;
                        v554 = v587 + v597;
                        v561 = j;
                        v556 = v594;
                        v562 = v596;
                        if (v561 <= v554)
                        {
                            v589 = v597 + 1;
                            v561 += 128;
                        }
                        else
                        {
                            v589 = v597;
                        }
                        v546 = v17;
                        v557 = 0xcf1bbcdcbf9b0000;
                        v23 = v590;
                        n = v15;
                        v555 = v590 + v597;
                        if (i <= v555)
                            goto LABEL_906f0;
                    }
                    else
                    {
                        v566 = v596;
                        v586 = v4;
                        v556 = v594;
LABEL_8ea04:
                        v557 = 0xcf1bbcdcbf9b0000;
                        v22 = v573;
                        n = v572;
                        v569 = v17;
                        if (5 <= v21)
                            goto LABEL_8ea30;
LABEL_8ea28:
                        v556[v566] = v587 - v569;
LABEL_8ea30:
                        v598 = v588 & 0xffffffff;
                        v583 = v569 + v598;
                        v44 = n - v583;
                        v584 = v44 + 3;
                        v585 = v18;
                        if (n <= v585)
                        {
                            v582 = 4;
                            v577 = v14;
                        }
                        else if ((unsigned int)v588 > (unsigned int)v8)
                        {
                            v599 = v2 + v598;
                            v600 = n - 1;
                            v582 = 4;
                            do
                            {
                                v601 = v600;
                                if (*(char *)v601 != *(char *)v599)
                                {
                                    v583 = v599 + 1;
                                    n = v601 + 1;
                                    v577 = v14;
                                    goto LABEL_8eac8;
                                }
                            } while ((v582 += 1, v602 = v599 - 1, v603 = v601 - 1, v599 > v586 && (v599 = v602, v600 = v603, v585 < v601)));
                            v583 = v602 + 1;
                            n = v603 + 1;
                            v577 = v14;
                        }
                        else
                        {
                            v582 = 4;
                            v577 = v14;
                        }
LABEL_8eac8:
                        v604 = sub_7cdfc(n + v582, v583 + v582, v13);
                        v605 = n;
                        v606 = v605 - v585;
                        v29 = &v28;
                        v28 = &v29;
                        if (v605 > v12)
                        {
                            v607 = v605;
                            sub_82208(v577->field_18, v585, v605, v12);
                            v546 = v17;
                            goto LABEL_8eb14;
                        }
                        else
                        {
                            v607 = v605;
                            *v577->field_18 = *(int128_t *)v585;
                            v608 = v577->field_18;
                            if (v606 > 16)
                            {
                                v608[1] = (int128_t)v585[16];
                                v546 = v17;
                                if ((long long)v606 >= 33)
                                {
                                    i1 = v608 + 2;
                                    v610 = v585 + 48;
                                    do
                                    {
                                        *i1 = *(int128_t *)(v610 - 16);
                                        v611 = v610 + 32;
                                        i1[1] = *(int128_t *)v610;
                                        i1 += 2;
                                        v546 = v17;
                                        v610 = v611;
                                    } while (i1 < (char *)v608 + v606);
                                }
LABEL_8eb14:
                                v577->field_18 = (char *)v577->field_18 + v606;
                                v612 = v577->field_8;
                                v613 = v19;
                                if (v606 >= 0x10000)
                                {
                                    v614 = (char *)v612 - v577->field_0;
                                    v577->field_48 = 1;
                                    v577->field_4c = v614 >> 3;
                                    goto LABEL_8ebb4;
                                }
                            }
                            else
                            {
                                v577->field_18 = (char *)v608 + v606;
                                v612 = v577->field_8;
                                v546 = v17;
                                v613 = v19;
LABEL_8ebb4:
                                v615 = v604 + v582;
                                *(unsigned short *)v612->padding_4 = v606;
                                v612->field_0 = v584;
                                v616 = v615 - 3;
                                if (0x10000 <= v616)
                                {
                                    v617 = (char *)v612 - v577->field_0;
                                    v577->field_48 = 2;
                                    v577->field_4c = v617 >> 3;
                                }
                                v612->field_6 = v616;
                                v577->field_8 = &v612[1];
                                n = v607 + v615;
                                v550 = v8;
                                if (i < n)
                                {
                                    v618 = v10;
                                }
                                else
                                {
                                    v556[v557 * *(long long *)((char *)v3 + v22) >> (v613 & 63)] = v22 + 2;
                                    v556[v557 * *(long long *)((char *)n - 2) >> (v613 & 63)] = n - 2 - v546;
                                    v619 = v10;
                                    if (v619)
                                    {
                                        v620 = v44;
                                        do
                                        {
                                            v44 = v620;
                                            v620 = v619;
                                            v621 = v620 & 0xffffffff;
                                            if (*(int *)n != *(int *)((char *)n - v621))
                                            {
                                                v618 = v620;
                                                break;
                                            }
                                            v622 = n + 4;
                                            v546 = v17;
                                            v623 = n;
                                            v624 = sub_7cdfc(v622, v622 + -v621, v13);
                                            v556[v557 * *(long long *)v623 >> (v613 & 63)] = v623 - v546;
                                            v29 = &v28;
                                            v28 = &v29;
                                            if (v623 > v12)
                                            {
                                                sub_82208(v577->field_18, v623, v623, v12);
                                                v546 = v17;
                                            }
                                            else
                                            {
                                                *v577->field_18 = *(int128_t *)v623;
                                            }
                                            v625 = v577->field_8;
                                            *(unsigned short *)v625->padding_4 = 0;
                                            v625->field_0 = 1;
                                            v626 = v624 + 1;
                                            if (0x10000 <= v626)
                                            {
                                                v627 = (char *)v625 - v577->field_0;
                                                v577->field_48 = 2;
                                                v577->field_4c = v627 >> 3;
                                            }
                                            n = v622 + v624;
                                            v625->field_6 = v626;
                                            v577->field_8 = &v625[1];
                                            v619 = v44;
                                            v618 = v44;
                                            v44 = v620;
                                            v557 = 0xcf1bbcdcbf9b0000;
                                        } while (n <= i);
                                    }
                                    else
                                    {
                                        v618 = 0;
                                    }
                                }
                                v9 = v618;
                                v554 = n + v11;
                                v555 = v554 + 1;
                                v18 = n;
                                if (i <= v555)
                                    goto LABEL_906f8;
                                break;
                            }
                        }
                    }
                }
            }
            v564 = v11;
            do
            {
                v565 = *(int *)((char *)v554 + v15);
                v566 = v557 * v559 >> ((char)v19 & 63);
                v567 = n - v546;
                v556[v562] = v567;
                if (*(int *)v554 == v565)
                {
                    v22 = v567;
                    v577 = v14;
                    v578 = v554 + v15;
                    v579 = *((char *)v554 - 1);
                    v580 = *((char *)v578 - 1);
                    v581 = v579 == v580;
                    v582 = (v579 != v580 ? 4 : 5);
                    n = v554 - v581;
                    v583 = v578 - v581;
                    v556[v566] = v23 - v546;
                    v584 = 1;
                    v44 = v10;
                    v10 = v9;
                    v585 = v18;
                    goto LABEL_8eac8;
                }
                v21 = v564;
                j = v561;
                v568 = v550;
                v569 = v546;
                if (sub_92cac(n, v546 + (v563 & 0xffffffff), v563, v550))
                {
                    v22 = v567;
                    v586 = v4;
                    v557 = 0xcf1bbcdcbf9b0000;
                    goto LABEL_8e9ec;
                }
                v570 = v556[v566];
                v571 = 0xcf1bbcdcbf9b0000 * *(long long *)v554 >> ((char)v19 & 63);
                v572 = v23;
                v573 = v572 - v569;
                v556[v566] = v573;
                if (sub_92cac(v572, v569 + v570, v570, v568))
                {
                    v566 = v571;
                    v587 = v554;
                    v588 = v570;
                    v586 = v4;
                    goto LABEL_8ea04;
                }
                v550 = v568;
                v563 = v556[v571];
                v559 = *(long long *)v555;
                v574 = v21;
                v575 = v554 + v574;
                v561 = j;
                v562 = v571;
                if (v575 < v561)
                {
                    v576 = v574;
                }
                else
                {
                    v576 = v574 + 1;
                    v561 += 128;
                }
                v546 = v17;
                v557 = 0xcf1bbcdcbf9b0000;
                v23 = v555;
                n = v554;
                v554 = v575;
                v555 += v574;
                v564 = v576;
            } while (i > v555);
        }
    }
    n = v18;
    v44 = v10;
LABEL_906f8:
    v710 = v7;
    v711 = arm64g_calculate_condition((v44 ? 3 : 0) | 128, (v44 ? v7 : 0), (v44 ? v5 : 0), 0);
    v712 = v9;
    v713 = a2;
    *v713 = (v44 ? v44 : v5 < v710 ? v710 : 0);
    v713[1] = (!v712 ? (v711 & 1 ? v710 : v5 < v6 ? v6 : 0) : v712);
    v545 = v13;
LABEL_90738:
    return v545 - n;
}
