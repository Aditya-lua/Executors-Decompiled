/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8673c..0xa8835c (7200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a8673c_1 {
    struct st_a8673c_0 *field_0;
    char padding_8[56];
    long long field_40;
    void* field_48;
} st_a8673c_1;

typedef struct st_a8673c_0 {
    char padding_0[56];
    unsigned long long field_38;
    unsigned int field_40;
    char padding_44[4];
    unsigned int field_48;
    int field_4c;
    unsigned int field_50;
} st_a8673c_0;

extern void g_defd00;
extern void g_defe00;
extern char g_10002b0;

unsigned int sub_a8673c(unsigned long long *a0, uint128_t *a1, uint128_t *a2, void* a3, long long a4, st_a8673c_1 *a5)
{
    st_a8673c_0 *v41;  // x20
    unsigned long v42;  // x27
    unsigned long long v51;  // x14
    unsigned long long v141;  // 4133
    unsigned long v142;  // 4110
    unsigned long v143;  // cc_op
    unsigned long v144;  // cc_dep1
    unsigned long v145;  // cc_dep2
    unsigned long v146;  // 4110
    unsigned long long v147;  // 4135
    unsigned long v148;  // 4110
    unsigned long v149;  // cc_op
    unsigned long v150;  // cc_dep1
    void* iter;  // x0
    unsigned long v151;  // cc_dep2
    unsigned long long v152;  // 4129
    unsigned int v153;  // w14
    unsigned long v154;  // 4110
    unsigned long long v155;  // 4129
    unsigned long v156;  // 4110
    unsigned long v157;  // cc_op
    unsigned long v158;  // cc_dep1
    unsigned long v159;  // cc_dep2
    unsigned long v160;  // 4110
    unsigned long long v53;  // x3
    unsigned long long v161;  // 4137
    unsigned long v162;  // 4110
    unsigned long v163;  // cc_op
    unsigned long v164;  // cc_dep1
    unsigned long v165;  // cc_dep2
    unsigned long v166;  // 4110
    unsigned long long v167;  // 4151
    void* v168;  // x26
    uint128_t v169;  // q0
    __m128i v170;  // q1
    void* v54;  // x17
    uint128_t v171;  // q2
    __m128i v172;  // q3
    __m128i v173;  // q4
    void* v174;  // x12
    void* v175;  // x11
    unsigned long long v176;  // x22
    unsigned long long v177;  // x23
    unsigned long long v178;  // x8
    unsigned long v179;  // cc_dep1
    unsigned long v180;  // cc_dep2
    unsigned int v55;  // w1
    unsigned short *v181;  // x8
    void* v182;  // x9
    void* v183;  // x13
    void* v184;  // x15
    unsigned long v185;  // 4110
    unsigned long v186;  // cc_op
    unsigned long v187;  // cc_dep1
    unsigned long v188;  // cc_dep2
    unsigned long v189;  // 4110
    unsigned long long v190;  // 4133
    unsigned long long v56;  // x5
    unsigned long v191;  // 4110
    unsigned long v192;  // cc_op
    unsigned long v193;  // cc_dep1
    unsigned long v194;  // cc_dep2
    unsigned long long v195;  // 4107
    unsigned long v196;  // 4110
    unsigned long long v197;  // 4107
    unsigned int v198;  // w8
    unsigned long v199;  // 4110
    unsigned long v200;  // cc_op
    unsigned long long v57;  // x6
    unsigned long v201;  // cc_dep1
    unsigned long v202;  // cc_dep2
    unsigned long long v203;  // 4107
    unsigned long v204;  // 4110
    unsigned long long v205;  // 4107
    unsigned int v206;  // w8
    unsigned long long v207;  // 4110
    unsigned long long v208;  // 4107
    unsigned long long v209;  // 4110
    unsigned long long v210;  // 4107
    unsigned long long v58;  // x4
    unsigned int i2;  // x13
    void* v212;  // x14
    uint128_t *v213;  // x8
    __m128i v214;  // q7
    __m128i v215;  // q6
    void* v216;  // x8
    __m128i v217;  // q17
    __m128i v218;  // q16
    void* v219;  // x14
    uint128_t v220;  // q19
    unsigned long long v59;  // x4
    uint128_t v221;  // q20
    __m128i v223;  // q20
    __m128i v225;  // q19
    __m128i v226;  // q19
    __m128i v227;  // q19
    __m128i v228;  // q18
    __m128i v229;  // q20
    unsigned long v60;  // cc_dep1
    __m128i v232;  // q23
    __m128i v233;  // q21
    __m128i v234;  // q22
    __m128i v235;  // q21
    __m128i v237;  // q19
    __m128i v239;  // q16
    __m128i v240;  // q16
    unsigned long v43;  // x28
    unsigned long v61;  // cc_dep2
    __m128i v241;  // q17
    void* v242;  // x8
    unsigned int v243;  // x9
    void* v244;  // x8
    void* v245;  // x13
    unsigned long long i1;  // x9
    void* v247;  // x14
    unsigned short *v248;  // x15
    unsigned int v249;  // w17
    unsigned int v250;  // w0
    unsigned long long v62;  // x2
    unsigned int v251;  // w15
    unsigned int v252;  // w14
    void* v253;  // x13
    unsigned short v254;  // x3
    unsigned long long v255;  // w1
    short v256;  // x1
    short v257;  // x14
    void* v259;  // x8
    unsigned long v260;  // cc_dep1
    unsigned long long v63;  // x5
    unsigned long long v261;  // x7
    unsigned long long v262;  // x9
    void* v263;  // x13
    void* v264;  // x14
    void* v265;  // x15
    void* v266;  // x16
    unsigned long v267;  // 4110
    unsigned long v268;  // cc_op
    unsigned long v269;  // cc_dep1
    unsigned long v270;  // cc_dep2
    unsigned long long v64;  // 4110
    unsigned long v271;  // 4110
    unsigned long long v272;  // 4137
    void* v273;  // x2
    void* v274;  // x1
    unsigned long v275;  // 4110
    unsigned long v276;  // cc_op
    unsigned long v277;  // cc_dep1
    unsigned long v278;  // cc_dep2
    unsigned long long v279;  // 4107
    unsigned long v280;  // 4110
    unsigned long long v65;  // 4102
    unsigned long long v281;  // 4107
    unsigned int v282;  // w17
    unsigned long v283;  // 4110
    unsigned long v284;  // cc_op
    unsigned long v285;  // cc_dep1
    unsigned long v286;  // cc_dep2
    unsigned long long v287;  // 4107
    unsigned long v288;  // 4110
    unsigned long long v289;  // 4107
    void* v290;  // x4
    unsigned long long v66;  // 4110
    void* v291;  // x3
    unsigned long v292;  // 4110
    unsigned long v293;  // cc_op
    unsigned long v294;  // cc_dep1
    unsigned long v295;  // cc_dep2
    unsigned long long v296;  // 4107
    unsigned long v297;  // 4110
    unsigned long long v298;  // 4107
    unsigned long v299;  // 4110
    unsigned long v300;  // cc_op
    unsigned long long v67;  // 4102
    unsigned long v301;  // cc_dep1
    unsigned long v302;  // cc_dep2
    unsigned long long v303;  // 4107
    unsigned long v304;  // 4110
    unsigned long long v305;  // 4107
    unsigned int v306;  // w9
    unsigned long v307;  // 4110
    unsigned long v308;  // cc_op
    unsigned long v309;  // cc_dep1
    unsigned long v310;  // cc_dep2
    unsigned long long v68;  // x5
    unsigned long long v311;  // 4107
    unsigned long v312;  // 4110
    unsigned long long v313;  // 4107
    unsigned long v314;  // 4110
    unsigned long v315;  // cc_op
    unsigned long v316;  // cc_dep1
    unsigned long v317;  // cc_dep2
    unsigned long long v318;  // 4107
    unsigned long v319;  // 4110
    unsigned long long v320;  // 4107
    unsigned long long v69;  // x4
    unsigned long v321;  // 4110
    unsigned long v322;  // cc_op
    unsigned long v323;  // cc_dep1
    unsigned long v324;  // cc_dep2
    unsigned long long v325;  // 4129
    unsigned int v326;  // w14
    unsigned long v327;  // 4110
    unsigned long long v328;  // 4129
    unsigned long v329;  // 4110
    unsigned long v330;  // cc_op
    unsigned long long v70;  // x6
    unsigned long v331;  // cc_dep1
    unsigned long v332;  // cc_dep2
    unsigned long v333;  // 4110
    unsigned long long v334;  // 4138
    unsigned long v335;  // 4110
    unsigned long v336;  // cc_op
    unsigned long v337;  // cc_dep1
    unsigned long v338;  // cc_dep2
    unsigned long v339;  // 4110
    unsigned long long v340;  // 4138
    void* v44;  // x9
    __m128i v71;  // q5
    unsigned long v341;  // 4110
    unsigned long v342;  // cc_op
    unsigned long v343;  // cc_dep1
    unsigned long v344;  // cc_dep2
    unsigned long v345;  // 4110
    unsigned long long v346;  // 4121
    unsigned int v347;  // w17
    unsigned int v348;  // w17
    unsigned int v349;  // x8
    void* v350;  // x9
    void* iter1;  // x0
    unsigned long long i8;  // x8
    void* v352;  // x13
    unsigned short *v353;  // x14
    void* v354;  // x16
    unsigned int v355;  // w0
    unsigned int v356;  // w1
    unsigned int v357;  // w14
    unsigned int v358;  // w13
    unsigned long long v359;  // x2
    void* v360;  // x9
    unsigned long long i6;  // x7
    unsigned short v361;  // x7
    unsigned long long v362;  // w3
    short v363;  // x3
    unsigned long long v364;  // w13
    short v365;  // x13
    unsigned int i9;  // x13
    void* v367;  // x14
    uint128_t *v368;  // x8
    __m128i v369;  // q7
    __m128i v370;  // q6
    unsigned long long v74;  // x7
    uint128_t *v371;  // x8
    __m128i v372;  // q17
    __m128i v373;  // q16
    void* v374;  // x16
    __m128i v375;  // q19
    __m128i v376;  // q18
    void* v377;  // x14
    uint128_t v378;  // q23
    uint128_t v379;  // q24
    __m128i v75;  // q6
    __m128i v381;  // q24
    __m128i v383;  // q23
    __m128i v384;  // q23
    __m128i v385;  // q23
    __m128i v386;  // q22
    __m128i v387;  // q21
    __m128i v389;  // q25
    __m128i v76;  // q7
    __m128i v391;  // q23
    __m128i v392;  // q6
    __m128i v393;  // q7
    __m128i v395;  // q21
    __m128i v397;  // q18
    __m128i v398;  // q16
    __m128i v399;  // q17
    unsigned int v400;  // x24
    __m128i v77;  // q17
    void* v401;  // x0
    unsigned int v402;  // x19
    unsigned long long v403;  // x4
    void* iter2;  // x1
    unsigned long long v405;  // x22
    void* v406;  // x3
    unsigned int v407;  // w2
    unsigned long long v408;  // x9
    unsigned long long v409;  // x7
    unsigned long long v410;  // x8
    __m128i v78;  // q16
    unsigned long long v411;  // x20
    unsigned long long v412;  // x8
    unsigned long v413;  // cc_dep1
    unsigned long v414;  // cc_dep2
    unsigned long long v415;  // x9
    unsigned long long v416;  // x7
    unsigned long long v417;  // 4110
    unsigned long long v418;  // 4102
    unsigned long long v419;  // 4110
    unsigned long long v420;  // 4102
    unsigned long long v421;  // x8
    unsigned long long v422;  // x9
    unsigned long long v423;  // x7
    unsigned long long v424;  // x20
    __m128i v425;  // q6
    void* v426;  // x7
    unsigned long long v427;  // x27
    unsigned long long v428;  // x25
    unsigned long long i10;  // x19
    unsigned long long v430;  // x19
    __m128i v80;  // q21
    __m128i v431;  // q7
    __m128i v432;  // q16
    __m128i v433;  // q18
    __m128i v434;  // q17
    __m128i v436;  // q22
    __m128i v438;  // q20
    unsigned int v440;  // x8
    char *v45;  // x10
    unsigned int v441;  // w8
    unsigned int v442;  // w9
    short v443;  // x7
    unsigned int i3;  // x8
    uint128_t v445;  // q6
    uint128_t v446;  // q7
    uint128_t v447;  // q16
    __m128i v449;  // q16
    __m128i v82;  // q19
    __m128i v451;  // q7
    __m128i v452;  // q6
    unsigned long v453;  // x25
    uint128_t *v454;  // x24
    unsigned int v455;  // w20
    unsigned int v456;  // w19
    void* v457;  // x26
    unsigned long v458;  // x11
    unsigned long v459;  // cc_dep1
    unsigned int v460;  // x8
    __m128i v83;  // q16
    unsigned long long v461;  // x8
    unsigned long long v462;  // x9
    void* v463;  // x0
    unsigned long v464;  // 4110
    unsigned long v465;  // cc_op
    unsigned long v466;  // cc_dep1
    unsigned long v467;  // cc_dep2
    unsigned long v468;  // 4110
    unsigned long long v469;  // 4119
    __m128i v470;  // q0
    void* v471;  // x9
    void* v472;  // x10
    unsigned long v473;  // x11
    unsigned int i4;  // x12
    unsigned short *v475;  // x13
    short v476;  // x14
    uint128_t *v477;  // x13
    uint128_t *v478;  // x14
    __m128i v479;  // q2
    __m128i v480;  // q3
    unsigned int v85;  // w3
    uint128_t v481;  // q0
    __m128i v482;  // q1
    uint128_t v483;  // q2
    void* v484;  // x8
    unsigned int v485;  // w9
    unsigned int k;  // w9
    unsigned int i5;  // x10
    __m128i v488;  // q6
    __m128i v489;  // q7
    unsigned int v86;  // w4
    __m128i v491;  // q19
    __m128i v493;  // q17
    unsigned long long *v494;  // x9
    unsigned int v495;  // w17
    unsigned int l;  // w17
    unsigned int v497;  // x10
    unsigned int v498;  // x12
    unsigned int v499;  // x13
    unsigned long long *v500;  // x11
    short v87;  // x5
    unsigned long v501;  // x15
    unsigned long long v502;  // x14
    unsigned long v503;  // cc_dep1
    unsigned long long v504;  // 4106
    unsigned long long v505;  // 4106
    void* v506;  // x20
    uint128_t *node;  // x8
    void* v508;  // x9
    unsigned long long m;  // x10
    __m128i v510;  // q0
    unsigned int i;  // x8
    unsigned long long v511;  // x10
    __m128i v512;  // q2
    __m128i v513;  // q3
    unsigned int n;  // x8
    void* v516;  // x9
    unsigned long v517;  // x16
    __m128i v518;  // q30
    __m128i v519;  // q25
    __m128i v520;  // q1
    uint128_t v89;  // q0
    uint128_t v521;  // q3
    uint128_t v522;  // q3
    uint128_t v523;  // q3
    uint128_t v524;  // q3
    uint128_t v525;  // q3
    uint128_t v526;  // q3
    __m128i v527;  // q3
    uint128_t v528;  // q4
    uint128_t v529;  // q4
    uint128_t v530;  // q4
    uint128_t v90;  // q1
    uint128_t v531;  // q4
    uint128_t v532;  // q4
    uint128_t v533;  // q4
    __m128i v535;  // q0
    __m128i v536;  // q10
    __m128i v537;  // q15
    __m128i v538;  // q1
    uint128_t v539;  // q3
    uint128_t v540;  // q3
    unsigned int v46;  // x11
    uint128_t v91;  // q5
    uint128_t v541;  // q3
    uint128_t v542;  // q3
    uint128_t v543;  // q3
    uint128_t v544;  // q3
    __m128i v545;  // q3
    uint128_t v546;  // q4
    uint128_t v547;  // q4
    uint128_t v548;  // q4
    uint128_t v549;  // q4
    uint128_t v550;  // q4
    uint128_t v92;  // q6
    uint128_t v551;  // q4
    __m128i v552;  // q4
    __m128i v553;  // q11
    __m128i v554;  // q31
    __m128i v555;  // q1
    uint128_t v556;  // q3
    uint128_t v557;  // q3
    uint128_t v558;  // q3
    uint128_t v559;  // q3
    uint128_t v560;  // q3
    uint128_t v93;  // q7
    uint128_t v561;  // q3
    __m128i v562;  // q3
    uint128_t v563;  // q4
    uint128_t v564;  // q4
    uint128_t v565;  // q4
    uint128_t v566;  // q4
    uint128_t v567;  // q4
    uint128_t v568;  // q4
    __m128i v569;  // q4
    __m128i v570;  // q1
    __m128i v571;  // q5
    __m128i v572;  // q2
    uint128_t v573;  // q6
    uint128_t v574;  // q6
    uint128_t v575;  // q6
    uint128_t v576;  // q6
    uint128_t v577;  // q6
    uint128_t v578;  // q6
    __m128i v579;  // q6
    uint128_t v580;  // q7
    __m128i v95;  // q7
    uint128_t v581;  // q7
    uint128_t v582;  // q7
    uint128_t v583;  // q7
    uint128_t v584;  // q7
    uint128_t v585;  // q7
    __m128i v586;  // q7
    __m128i v587;  // q4
    __m128i v588;  // q17
    __m128i v589;  // q6
    uint128_t v590;  // q19
    uint128_t v591;  // q19
    uint128_t v592;  // q19
    uint128_t v593;  // q19
    uint128_t v594;  // q19
    uint128_t v595;  // q19
    __m128i v596;  // q19
    uint128_t v597;  // q18
    uint128_t v598;  // q18
    uint128_t v599;  // q18
    uint128_t v600;  // q18
    __m128i v97;  // q6
    uint128_t v601;  // q18
    uint128_t v602;  // q18
    __m128i v603;  // q18
    __m128i v604;  // q18
    __m128i v605;  // q19
    __m128i v606;  // q20
    uint128_t v607;  // q23
    uint128_t v608;  // q23
    uint128_t v609;  // q23
    uint128_t v610;  // q23
    __m128i v98;  // q5
    uint128_t v611;  // q23
    uint128_t v612;  // q23
    __m128i v613;  // q23
    uint128_t v614;  // q22
    uint128_t v615;  // q22
    uint128_t v616;  // q22
    uint128_t v617;  // q22
    uint128_t v618;  // q22
    uint128_t v619;  // q22
    __m128i v620;  // q22
    unsigned long v99;  // x19
    __m128i v621;  // q22
    __m128i v622;  // q2
    __m128i v623;  // q24
    uint128_t v624;  // q26
    uint128_t v625;  // q26
    uint128_t v626;  // q26
    uint128_t v627;  // q26
    uint128_t v628;  // q26
    uint128_t v629;  // q26
    __m128i v630;  // q26
    void* v100;  // x21
    uint128_t v631;  // q27
    uint128_t v632;  // q27
    uint128_t v633;  // q27
    uint128_t v634;  // q27
    uint128_t v635;  // q27
    uint128_t v636;  // q27
    __m128i v638;  // q25
    __m128i v639;  // q26
    uint128_t v640;  // q27
    __m128i v47;  // q0
    unsigned int v101;  // x17
    uint128_t v641;  // q27
    uint128_t v642;  // q27
    uint128_t v643;  // q27
    uint128_t v644;  // q27
    uint128_t v645;  // q27
    __m128i v646;  // q24
    __m128i v647;  // q23
    uint128_t v648;  // q3
    uint128_t v649;  // q3
    uint128_t v650;  // q3
    void* v102;  // x6
    uint128_t v651;  // q3
    uint128_t v652;  // q3
    uint128_t v653;  // q3
    __m128i v654;  // q3
    __m128i v655;  // q5
    __m128i v656;  // q3
    __m128i v657;  // q27
    __m128i v658;  // q5
    __m128i v659;  // q10
    __m128i v660;  // q9
    unsigned long v103;  // x11
    __m128i v661;  // q0
    __m128i v662;  // q16
    __m128i v663;  // q17
    __m128i v664;  // q19
    __m128i v665;  // q21
    __m128i v666;  // q20
    __m128i v667;  // q17
    __m128i v668;  // q16
    __m128i v669;  // q4
    __m128i v670;  // q3
    unsigned long long v104;  // x0
    __m128i v671;  // q14
    __m128i v672;  // q29
    __m128i v674;  // q2
    __m128i v675;  // q15
    uint128_t v677;  // q1
    uint128_t v680;  // q13
    void* v105;  // x10
    __m128i v681;  // q30
    __m128i v683;  // q5
    __m128i v684;  // q6
    __m128i v685;  // q8
    uint128_t v687;  // q7
    __m128i v689;  // q31
    __m128i v690;  // q1
    unsigned long long v106;  // x12
    uint128_t v691;  // q27
    __m128i v693;  // q24
    uint128_t v694;  // q22
    __m128i v696;  // q23
    uint128_t v697;  // q28
    __m128i v698;  // q0
    __m128i v699;  // q5
    void* v107;  // x1
    uint128_t v701;  // q25
    __m128i v703;  // q18
    __m128i v704;  // q12
    __m128i v705;  // q11
    uint128_t v707;  // q26
    uint128_t v710;  // q30
    void* v108;  // x2
    uint128_t v712;  // q27
    uint128_t v714;  // q28
    uint128_t v716;  // q29
    uint128_t v718;  // q31
    __m128i v719;  // q15
    __m128i v720;  // q14
    unsigned long v109;  // cc_dep1
    __m128i v722;  // q1
    uint128_t v724;  // q8
    __m128i v725;  // q8
    __m128i v726;  // q6
    uint128_t v729;  // q31
    __m128i v730;  // q5
    unsigned int v110;  // x9
    __m128i v731;  // q0
    uint128_t v734;  // q29
    uint128_t v737;  // q19
    __m128i v739;  // q24
    __m128i v740;  // q23
    uint128_t v48;  // q1
    unsigned long long v111;  // x9
    uint128_t v742;  // q20
    uint128_t v745;  // q20
    uint128_t v748;  // q3
    unsigned int i0;  // x8
    uint128_t v750;  // q0
    void* v112;  // x14
    __m128i v751;  // q1
    __m128i v752;  // q3
    __m128i v753;  // q4
    uint128_t v754;  // q5
    __m128i v756;  // q5
    __m128i v758;  // q7
    unsigned int v759;  // x8
    unsigned int v760;  // x10
    unsigned long long v113;  // x8
    unsigned int v761;  // x12
    unsigned long long *v762;  // x9
    unsigned long v763;  // x14
    unsigned long long v764;  // x13
    unsigned long v765;  // cc_dep1
    unsigned long long v766;  // 4106
    unsigned long long v767;  // 4106
    unsigned int v768;  // x19
    unsigned short *v114;  // x9
    void* v115;  // x15
    void* v116;  // x20
    void* v117;  // x16
    void* v118;  // x8
    void* v119;  // x28
    unsigned long v120;  // 4110
    __m128i v49;  // q3
    unsigned long v121;  // cc_op
    unsigned long v122;  // cc_dep1
    unsigned long v123;  // cc_dep2
    unsigned long long v124;  // 4129
    unsigned int v125;  // w11
    unsigned long v126;  // 4110
    unsigned long long v127;  // 4129
    unsigned long v128;  // 4110
    unsigned long v129;  // cc_op
    unsigned long v130;  // cc_dep1
    unsigned int v50;  // x2
    unsigned long v131;  // cc_dep2
    unsigned long long v132;  // 4129
    unsigned int v133;  // w9
    unsigned long v134;  // 4110
    unsigned long long v135;  // 4129
    unsigned long v136;  // 4110
    unsigned long v137;  // cc_op
    unsigned long v138;  // cc_dep1
    unsigned long v139;  // cc_dep2
    unsigned long v140;  // 4110
    st_a8673c_0 *v0;  // [bp-0x4d8]
    unsigned int v1;  // [bp-0x4cc]
    unsigned long v2;  // [bp-0x4b8]
    uint128_t *v3;  // [bp-0x4b0], Other Possible Types: uint128_t
    long long v4;  // [bp-0x4a0], Other Possible Types: uint128_t
    uint128_t v5;  // [bp-0x490], Other Possible Types: unsigned long long
    st_a8673c_1 *v6;  // [bp-0x480], Other Possible Types: uint128_t
    uint128_t v7;  // [bp-0x470], Other Possible Types: unsigned int
    uint128_t v8;  // [bp-0x460], Other Possible Types: unsigned int
    void* v9;  // [bp-0x450], Other Possible Types: uint128_t
    uint128_t v10;  // [bp-0x440], Other Possible Types: unsigned long long
    void* v11;  // [bp-0x430], Other Possible Types: uint128_t
    void* v12;  // [bp-0x420], Other Possible Types: uint128_t
    void* v13;  // [bp-0x410], Other Possible Types: uint128_t
    void* v14;  // [bp-0x400], Other Possible Types: uint128_t
    uint128_t v15;  // [bp-0x3f0], Other Possible Types: unsigned long long
    void* v16;  // [bp-0x3e0], Other Possible Types: uint128_t
    void* v17;  // [bp-0x3d0], Other Possible Types: uint128_t
    uint128_t v18;  // [bp-0x3c0], Other Possible Types: unsigned long long
    __m128i v19;  // [bp-0x3b0], Other Possible Types: void*
    void* v20;  // [bp-0x3a0], Other Possible Types: uint128_t
    uint128_t v21;  // [bp-0x390], Other Possible Types: void*
    void* v22;  // [bp-0x380], Other Possible Types: uint128_t
    __m128i v23;  // [bp-0x370], Other Possible Types: void*
    __m128i v24;  // [bp-0x360]
    uint128_t v25;  // [bp-0x350], Other Possible Types: unsigned long
    __m128i v26;  // [bp-0x340], Other Possible Types: unsigned long
    uint128_t v27;  // [bp-0x330], Other Possible Types: unsigned int
    uint128_t v28;  // [bp-0x320], Other Possible Types: uint128_t, unsigned long long
    unsigned long long v29;  // [bp-0x310], Other Possible Types: uint128_t
    uint128_t v30;  // [bp-0x300], Other Possible Types: unsigned int
    unsigned int j;  // [bp-0x300]
    char v32;  // [bp-0x2e1], Other Possible Types: unsigned int
    uint4096_t v33;  // [bp-0x2e0], Other Possible Types: char
    uint4096_t v34;  // [bp-0x2e0]
    uint128_t v35;  // [bp-0xe0]
    uint128_t v36;  // [bp-0xd0]
    char v37;  // [bp-0xc0]
    unsigned long v38;  // [bp-0xb8]
    char *v39;  // [bp-0x10]
    char v40;  // [bp+0x0]

    v39 = &v40;
    v38 = *(long long *)&g_10002b0;
    v41 = a5->field_0;
    v32 = 0;
    v42 = v41->field_48;
    v43 = v41->field_4c;
    if (sub_a86338())
    {
        v0 = v41;
        v1 = v41->field_50;
        v25 = (int)v42;
        v19 = (__m128i)(a3 + v25 * 0x200);
        v23 = (__m128i)a3;
        v26 = (__m128i)v42;
        sub_a8835c(&v33, a5->field_40, a3, v42);
        v44 = &g_defe00;
        v45 = ~&v33;
        v46 = 2;
        v47 = _mm_set1_epi32(3329);
        v48 = CONCAT(21642340209583, 21642340209583);
        v49 = _mm_set1_epi32(0xf2fff2ff);
        do
        {
            v50 = 0;
            v51 = (long long)(v46 * 0x100000000) >> 63 & 0xfffffffe00000000 | __ROL__(v46, 1) & 0x1fffffffe & 0x1ffffffff;
            while (1)
            {
                iter = &(&v33)[v50];
                v53 = v50 + v51;
                v54 = &(&v33)[v53];
                v55 = (short)v44[2];
                v44 += 2;
                v56 = &(&v33)[v51 + v50];
                v57 = &(&v33)[2 + v50];
                if (v57 < v56)
                    v58 = v56;
                else
                    v58 = v57;
                v59 = &v45[v58 + -1 * v50];
                if (v59 >= 14)
                {
                    v60 = v56;
                    v61 = v57;
                    if (v57 >= v56)
                        v56 = v57;
                    v62 = v50 + (&v45[v56 + -1 * v50] & 0xfffffffffffffffe);
                    v63 = &(&v33)[2 + v51 + v62];
                    if (v54 < &(&v33)[v62 + 2])
                    {
                        v64 = arm64g_calculate_condition(52, v60, v61, 0);
                        v65 = arm64g_calculate_condition(52, (v64 & 1 ? iter : 0x20000000), (v64 & 1 ? v63 : 0), 0);
                        if (!(v65 & 1))
                            goto LABEL_a868e0;
                    }
                    else
                    {
                        v66 = arm64g_calculate_condition(52, v60, v61, 0);
                        v67 = arm64g_calculate_condition(48, (v66 & 1 ? iter : 0x20000000), (v66 & 1 ? v63 : 0), 0);
                        if (!(v67 & 1))
                        {
LABEL_a868e0:
                            v68 = (v59 >> 1) + 1;
                            v69 = v68 & 0xfffffffffffffff8;
                            v70 = v69 * 2;
                            v50 = v53 + v70;
                            v71 = (__m128i)(CONCAT(v55 & 0xffff | (v55 & 0xffff) * 0x100000000, v55 & 0xffff | (v55 & 0xffff) * 0x100000000));
                            iter1 = iter;
                            i6 = v69;
                            do
                            {
                                v74 = i6;
                                v75 = *(int128_t *)iter1;
                                v76 = *(int128_t *)((char *)iter1 + v51);
                                v77 = _mm_mullo_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_srli_epi32(_mm_unpacklo_epi16(v75, v75), 16), _mm_srli_epi32(_mm_unpacklo_epi16(v76, v76), 16)), v47), v71);
                                v78 = _mm_mullo_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(v75, v75), 16), _mm_srli_epi32(_mm_unpackhi_epi16(v76, v76), 16)), v47), v71);
                                v80 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v78), (unsigned long long)v48), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v78), (unsigned long long)v48), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v78, 1), (unsigned long long)(v48 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v78, 1), (unsigned long long)(v48 >> 64)), 24))));
                                v82 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v77), (unsigned long long)v48), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v77), (unsigned long long)v48), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v77, 1), (unsigned long long)(v48 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v77, 1), (unsigned long long)(v48 >> 64)), 24))));
                                v83 = CatEvenLanesV(_mm_add_epi32(v78, _mm_mullo_epi32(v80, _mm_set1_epi32(0xf2ff))), _mm_add_epi32(v77, _mm_mullo_epi32(v82, _mm_set1_epi32(0xf2ff))));
                                *(__m128i *)((char *)iter1 + v51) = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v83, v49)), v83), _mm_max_epi16(_mm_add_epi16(v83, v49), _mm_setzero_si128()));
                                *(__m128i *)iter1 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(_mm_add_epi16(v76, v75), v49)), _mm_add_epi16(v76, v75)), _mm_max_epi16(_mm_add_epi16(_mm_add_epi16(v76, v75), v49), _mm_setzero_si128()));
                                iter1 += 16;
                                i6 = v74 - 8;
                            } while (i6);
                            if (v68 != v69)
                            {
                                v53 = v50;
                                iter += v70;
                            }
                            else if (0x1fe <= (long long)(v53 + v69 * 2 - 2))
                            {
                                break;
                            }
                            else
                            {
                                continue;
                            }
                        }
                    }
                }
                do
                {
                    v85 = *(short *)&(&v33)[v53];
                    v86 = *(short *)iter;
                    v87 = (unsigned short)v55 * ((unsigned short)(v86 - v85) + 3329) + 0xf2ff * (unsigned short)((v55 * (v86 - v85 + 3329)) * 5039 >> 24);
                    *(short *)&(&v33)[v53] = v87 & (unsigned short)(v87 - 3329) >> 15 | v87 - 3329 & (short)~(v87 - 3329 >> 31);
                    v50 = v53 + 2;
                    *(unsigned short *)iter = (unsigned short)v85 + (unsigned short)v86 & (unsigned short)(v85 + v86 - 3329) >> 15 | (unsigned short)(v85 + v86 - 3329) & (short)~((short)(v85 + v86 - 3329) >> 31);
                    iter += 2;
                    v53 = v50;
                } while (iter < v54);
                if ((long long)(v50 - 2) >= 0x1fe)
                    break;
            }
            v46 *= 2;
        } while (0x100 > (int)v46);
        v2 = v43;
        v3 = a2;
        v4 = a4;
        v6 = a5;
        i = 0;
        v89 = CONCAT(929726034568744167, 929726034568744167);
        v90 = CONCAT(21642340209583, 21642340209583);
        v34 = v33;
        do
        {
            v91 = *(int128_t *)((char *)&v34 + i);
            v92 = MullV((unsigned long long)v91, (unsigned long long)v89);
            v93 = MullV((unsigned long long)(v91 >> 64), (unsigned long long)(v89 >> 64));
            v95 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v93, (unsigned long long)v90), 24), _mm_srli_epi64(MullV((unsigned long long)v93, (unsigned long long)v90), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v93 >> 64), (unsigned long long)(v90 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v93 >> 64), (unsigned long long)(v90 >> 64)), 24))));
            v97 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v92, (unsigned long long)v90), 24), _mm_srli_epi64(MullV((unsigned long long)v92, (unsigned long long)v90), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v92 >> 64), (unsigned long long)(v90 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v92 >> 64), (unsigned long long)(v90 >> 64)), 24))));
            v98 = CatEvenLanesV(_mm_add_epi32(_mm_mullo_epi32(v95, _mm_set1_epi32(0xf2ff)), MullV((unsigned long long)(v91 >> 64), (unsigned long long)(v89 >> 64))), _mm_add_epi32(_mm_mullo_epi32(v97, _mm_set1_epi32(0xf2ff)), MullV((unsigned long long)v91, (unsigned long long)v89)));
            *(__m128i *)((char *)&v34 + i) = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v98, _mm_set1_epi16(-0xd01))), v98), _mm_max_epi16(_mm_add_epi16(v98, _mm_set1_epi16(-0xd01)), _mm_setzero_si128()));
            i += 16;
        } while (i != 0x200);
        v5 = v25 * 0x200;
        v99 = (unsigned long)v26;
        v100 = (void*)v23;
        if ((int)v99 >= 1)
        {
            v101 = 0;
            v102 = v6->field_48;
            v103 = v25;
            v104 = 2 | (v103 * 0x200 | v103 >> 55) & 0xfffffffffffffe00;
            v105 = ~v100;
            v106 = v5;
            v107 = v106 + v100;
            v108 = v107 + 2;
            v109 = v99 & 0xffffffff;
            if ((int)v99 < 2)
                v110 = v99 & 0xffffffff;
            else
                v110 = 2;
            v111 = ((v99 - v110) * 0x200 | v99 - v110 >> 55) & 0x1fffffffe00 & 0x1ffffffffff;
            v112 = v100 + 0x200;
            v18 = v111 + 0x3fe;
            v16 = v100 + v18;
            v14 = v100 + 0x202;
            v15 = v111 + 0x400;
            v13 = v100 + v15;
            v113 = (v103 + (unsigned int)v99 - 1) * 0x200;
            v114 = v100 + 0x1fe;
            v115 = (char *)v114 + v113;
            v116 = v100 + v104;
            v117 = v112 + v113;
            v118 = v100 + 2;
            v10 = (char *)v114 + v106;
            v9 = v107 + 0x200;
            v119 = (void*)v19;
            if (v100 < v115)
            {
                v120 = arm64g_calculate_condition(131, v109, 2, 0);
                v121 = 4;
                v122 = (v120 & 1 ? v119 : 0x20000000);
                v123 = (v120 & 1 ? v114 : 0);
                v124 = arm64g_calculate_condition(36, v122, v123, 0);
                v125 = !(v124 & 1);
                if (v100 >= v117)
                    goto LABEL_a86b6a;
LABEL_a86b69:
                v128 = arm64g_calculate_condition(v121 | 128, v122, v123, 0);
                v129 = 4;
                v130 = (v128 & 1 ? v116 : 0x20000000);
                v131 = (v128 & 1 ? v114 : 0);
                v132 = arm64g_calculate_condition(36, v130, v131, 0);
                v133 = !(v132 & 1);
                if (v118 >= v115)
                    goto LABEL_a86b76;
LABEL_a86b75:
                v136 = arm64g_calculate_condition(v129 | 48, v130, v131, 0);
                v137 = 4;
                v138 = (v136 & 1 ? v119 : 0x20000000);
                v139 = (v136 & 1 ? v112 : 0);
            }
            else
            {
                v126 = arm64g_calculate_condition(131, v109, 2, 0);
                v121 = 0;
                v122 = (v126 & 1 ? v119 : 0x20000000);
                v123 = (v126 & 1 ? v114 : 0);
                v127 = arm64g_calculate_condition(32, v122, v123, 0);
                v125 = !(v127 & 1);
                if (v100 < v117)
                    goto LABEL_a86b69;
LABEL_a86b6a:
                v134 = arm64g_calculate_condition(v121 | 128, v122, v123, 0);
                v129 = 0;
                v130 = (v134 & 1 ? v116 : 0x20000000);
                v131 = (v134 & 1 ? v114 : 0);
                v135 = arm64g_calculate_condition(32, v130, v131, 0);
                v133 = !(v135 & 1);
                if (v118 < v115)
                    goto LABEL_a86b75;
LABEL_a86b76:
                v140 = arm64g_calculate_condition(v129 | 48, v130, v131, 0);
                v137 = 0;
                v138 = (v140 & 1 ? v119 : 0x20000000);
                v139 = (v140 & 1 ? v112 : 0);
            }
            v141 = arm64g_calculate_condition(v137 | 32, v138, v139, 0);
            v17 = v112;
            if (v118 < v117)
            {
                v142 = arm64g_calculate_condition(v137 | 48, v138, v139, 0);
                v143 = 4;
                v144 = (v142 & 1 ? v116 : 0x20000000);
                v145 = (v142 & 1 ? v112 : 0);
            }
            else
            {
                v146 = arm64g_calculate_condition(v137 | 48, v138, v139, 0);
                v143 = 0;
                v144 = (v146 & 1 ? v116 : 0x20000000);
                v145 = (v146 & 1 ? v112 : 0);
            }
            v147 = arm64g_calculate_condition(v143 | 32, v144, v145, 0);
            if (&g_defd00 < v115)
            {
                v148 = arm64g_calculate_condition(v143 | 128, v144, v145, 0);
                v149 = 4;
                v150 = (v148 & 1 ? v119 : 0x20000000);
                v151 = (v148 & 1 ? &g_defe00 : 0);
                v152 = arm64g_calculate_condition(36, v150, v151, 0);
                v153 = !(v152 & 1);
                if (&g_defd00 >= v117)
                    goto LABEL_a86baa;
LABEL_a86ba9:
                v156 = arm64g_calculate_condition(v149 | 128, v150, v151, 0);
                v157 = 4;
                v158 = (v156 & 1 ? v116 : 0x20000000);
                v159 = (v156 & 1 ? &g_defe00 : 0);
            }
            else
            {
                v154 = arm64g_calculate_condition(v143 | 128, v144, v145, 0);
                v149 = 0;
                v150 = (v154 & 1 ? v119 : 0x20000000);
                v151 = (v154 & 1 ? &g_defe00 : 0);
                v155 = arm64g_calculate_condition(32, v150, v151, 0);
                v153 = !(v155 & 1);
                if (&g_defd00 < v117)
                    goto LABEL_a86ba9;
LABEL_a86baa:
                v160 = arm64g_calculate_condition(v149 | 128, v150, v151, 0);
                v157 = 0;
                v158 = (v160 & 1 ? v116 : 0x20000000);
                v159 = (v160 & 1 ? &g_defe00 : 0);
            }
            v161 = arm64g_calculate_condition(v157 | 32, v158, v159, 0);
            v11 = v117;
            v12 = v115;
            if (v119 < v117)
            {
                v162 = arm64g_calculate_condition(v157 | 48, v158, v159, 0);
                v163 = 4;
                v164 = (v162 & 1 ? v116 : 0x20000000);
                v165 = (v162 & 1 ? v115 : 0);
            }
            else
            {
                v166 = arm64g_calculate_condition(v157 | 48, v158, v159, 0);
                v163 = 0;
                v164 = (v166 & 1 ? v116 : 0x20000000);
                v165 = (v166 & 1 ? v115 : 0);
            }
            v167 = arm64g_calculate_condition(v163 | 32, v164, v165, 0);
            v168 = ~v107;
            v169 = CONCAT(929726034568744167, 929726034568744167);
            v170 = _mm_set1_epi32(3329);
            v171 = CONCAT(21642340209583, 21642340209583);
            v8 = v125 | v133;
            v172 = _mm_set1_epi32(0xf2ff);
            v173 = _mm_set1_epi32(0xf2fff2ff);
            v7 = (unsigned int)!(v141 & 1) | (unsigned int)!(v147 & 1) | v153 | (unsigned int)!(v161 & 1) | (unsigned int)!(v167 & 1);
            v21 = v108;
            v174 = v108;
            v22 = v107;
            v175 = v107;
            v30 = v99;
            v20 = v116;
            do
            {
                j = v30;
                v29 = v101;
                v176 = v101 * 0x200;
                v177 = v116 + v176;
                v28 = v104;
                if (v119 + 508 < v119 || (v178 = v177 + 508, v179 = v178, v180 = v177, v178 < v177))
                {
LABEL_a86ca8:
                    v243 = 0;
                    v244 = v100 + v104;
                    v245 = &g_defd00;
                    do
                    {
                        i1 = v243;
                        v247 = v100 + i1;
                        v248 = v102 + i1;
                        v249 = *v248;
                        v250 = *(short *)v247;
                        v251 = v248[1];
                        v252 = (short)v247[2];
                        v253 = v245 + 2;
                        v254 = (unsigned short)v251 * (unsigned short)v252 + 0xf2ff * (unsigned short)((v251 * v252) * 5039 >> 24);
                        v255 = v249 * v250 + *(short *)v245 * ((v254 & v254 - 3329 >> 15 | v254 - 3329 & ~((short)(v254 - 3329) >> 31)) & 0xffff);
                        v256 = (unsigned short)v255 + 0xf2ff * (unsigned short)(v255 * 5039 >> 24);
                        *(short *)((char *)v244 + i1 - 2) = v256 & (unsigned short)(v256 - 3329) >> 15 | v256 - 3329 & (short)~(v256 - 3329 >> 31);
                        v257 = (unsigned short)v250 * (unsigned short)v251 + (unsigned short)v249 * (unsigned short)v252 + 0xf2ff * (unsigned short)((v250 * v251 + v249 * v252) * 5039 >> 24);
                        *(short *)((char *)v244 + i1) = v257 & (unsigned short)(v257 - 3329) >> 15 | v257 - 3329 & (short)~(v257 - 3329 >> 31);
                        v243 = i1 + 4;
                        v245 = v253;
                    } while (i1 < 508);
                    goto LABEL_a86e90;
                }
                v181 = v102 + 0x1fe;
                v182 = v102 + 2;
                v183 = v102 + 0x200;
                v184 = (void*)v19;
                if (v102 < v12)
                {
                    v185 = arm64g_calculate_condition(52, v179, v180, 0);
                    v186 = 4;
                    v187 = (v185 & 1 ? v184 : 0x20000000);
                    v188 = (v185 & 1 ? v181 : 0);
                }
                else
                {
                    v189 = arm64g_calculate_condition(52, v179, v180, 0);
                    v186 = 0;
                    v187 = (v189 & 1 ? v184 : 0x20000000);
                    v188 = (v189 & 1 ? v181 : 0);
                }
                v190 = arm64g_calculate_condition(v186 | 32, v187, v188, 0);
                if (v102 < v11)
                {
                    v191 = arm64g_calculate_condition(v186 | 48, v187, v188, 0);
                    v192 = 4;
                    v193 = (v191 & 1 ? v116 : 0x20000000);
                    v194 = (v191 & 1 ? v181 : 0);
                    v195 = arm64g_calculate_condition(36, v193, v194, 0);
                    if (!(v195 & 1))
                        goto LABEL_a86c7a;
                    goto LABEL_a86c79;
                }
                else
                {
                    v196 = arm64g_calculate_condition(v186 | 48, v187, v188, 0);
                    v192 = 0;
                    v193 = (v196 & 1 ? v116 : 0x20000000);
                    v194 = (v196 & 1 ? v181 : 0);
                    v197 = arm64g_calculate_condition(32, v193, v194, 0);
                    if (v197 & 1)
                    {
LABEL_a86c79:
                        v198 = !(v190 & 1);
                        goto LABEL_a86c7c;
                    }
                    else
                    {
LABEL_a86c7a:
                        v198 = 1;
LABEL_a86c7c:
                        if (v182 < v12)
                        {
                            v199 = arm64g_calculate_condition(v192 | 48, v193, v194, 0);
                            v200 = 4;
                            v201 = (v199 & 1 ? v184 : 0x20000000);
                            v202 = (v199 & 1 ? v183 : 0);
                            v203 = arm64g_calculate_condition(36, v201, v202, 0);
                            if (!(v203 & 1))
                                goto LABEL_a86c8e;
                            goto LABEL_a86c8d;
                        }
                        else
                        {
                            v204 = arm64g_calculate_condition(v192 | 48, v193, v194, 0);
                            v200 = 0;
                            v201 = (v204 & 1 ? v184 : 0x20000000);
                            v202 = (v204 & 1 ? v183 : 0);
                            v205 = arm64g_calculate_condition(32, v201, v202, 0);
                            if (v205 & 1)
                            {
LABEL_a86c8d:
                                v206 = v198 | v8;
                                goto LABEL_a86c90;
                            }
                            else
                            {
LABEL_a86c8e:
                                v206 = 1;
LABEL_a86c90:
                                if (v182 < v11)
                                {
                                    v207 = arm64g_calculate_condition(v200 | 48, v201, v202, 0);
                                    v208 = arm64g_calculate_condition(36, (v207 & 1 ? v116 : 0x20000000), (v207 & 1 ? v183 : 0), 0);
                                    if (!(v208 & 1))
                                        goto LABEL_a86c9a;
                                    goto LABEL_a86c99;
                                }
                                else
                                {
                                    v209 = arm64g_calculate_condition(v200 | 48, v201, v202, 0);
                                    v210 = arm64g_calculate_condition(32, (v209 & 1 ? v116 : 0x20000000), (v209 & 1 ? v183 : 0), 0);
                                    if (v210 & 1)
                                    {
LABEL_a86c99:
                                        goto LABEL_a86c9c;
                                    }
                                    else
                                    {
LABEL_a86c9a:
                                        v206 = 1;
LABEL_a86c9c:
                                        if ((v206 | v7) & 1)
                                            goto LABEL_a86ca8;
                                        i2 = 0;
                                        v212 = &g_defd00;
                                        do
                                        {
                                            v213 = v102 + i2;
                                            v214 = CatOddLanesV(v213[1], *v213);
                                            v215 = CatEvenLanesV(v213[1], *v213);
                                            v216 = v100 + i2;
                                            v217 = CatOddLanesV((int128_t)v216[16], *(int128_t *)v216);
                                            v218 = CatEvenLanesV((int128_t)v216[16], *(int128_t *)v216);
                                            v219 = v212 + 16;
                                            v220 = MullV(_mm_cvtsi128_si64(v217), _mm_cvtsi128_si64(v214));
                                            v221 = MullV(_mm_extract_epi64(v217, 1), _mm_extract_epi64(v214, 1));
                                            v223 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v221, (unsigned long long)v171), 24), _mm_srli_epi64(MullV((unsigned long long)v221, (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v221 >> 64), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v221 >> 64), (unsigned long long)(v171 >> 64)), 24))));
                                            v225 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v220, (unsigned long long)v171), 24), _mm_srli_epi64(MullV((unsigned long long)v220, (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v220 >> 64), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v220 >> 64), (unsigned long long)(v171 >> 64)), 24))));
                                            v226 = CatEvenLanesV(_mm_add_epi32(_mm_mullo_epi32(v223, v172), MullV(_mm_extract_epi64(v217, 1), _mm_extract_epi64(v214, 1))), _mm_add_epi32(_mm_mullo_epi32(v225, v172), MullV(_mm_cvtsi128_si64(v217), _mm_cvtsi128_si64(v214))));
                                            v227 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v226, v173)), v226), _mm_max_epi16(_mm_add_epi16(v226, v173), _mm_setzero_si128()));
                                            v228 = _mm_add_epi32(MullV(_mm_cvtsi128_si64(v227), (long long)*(int128_t *)v212), MullV(_mm_cvtsi128_si64(v218), _mm_cvtsi128_si64(v215)));
                                            v229 = _mm_add_epi32(MullV(_mm_extract_epi64(v227, 1), (long long)((uint128_t)(*(int128_t *)v212) >> 64)), MullV(_mm_extract_epi64(v218, 1), _mm_extract_epi64(v215, 1)));
                                            v232 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v229), (unsigned long long)v171), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v229), (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v229, 1), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v229, 1), (unsigned long long)(v171 >> 64)), 24))));
                                            v233 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v228), (unsigned long long)v171), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v228), (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v228, 1), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v228, 1), (unsigned long long)(v171 >> 64)), 24))));
                                            v234 = _mm_add_epi32(MullV(_mm_cvtsi128_si64(v217), _mm_cvtsi128_si64(v215)), MullV(_mm_cvtsi128_si64(v214), _mm_cvtsi128_si64(v218)));
                                            v235 = _mm_add_epi32(MullV(_mm_extract_epi64(v217, 1), _mm_extract_epi64(v215, 1)), MullV(_mm_extract_epi64(v214, 1), _mm_extract_epi64(v218, 1)));
                                            v237 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v235), (unsigned long long)v171), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v235), (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v235, 1), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v235, 1), (unsigned long long)(v171 >> 64)), 24))));
                                            v239 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v234), (unsigned long long)v171), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v234), (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v234, 1), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v234, 1), (unsigned long long)(v171 >> 64)), 24))));
                                            v240 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v229, _mm_mullo_epi32(v232, v172)), _mm_add_epi32(v228, _mm_mullo_epi32(v233, v172))), v173)), CatEvenLanesV(_mm_add_epi32(v229, _mm_mullo_epi32(v232, v172)), _mm_add_epi32(v228, _mm_mullo_epi32(v233, v172)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v229, _mm_mullo_epi32(v232, v172)), _mm_add_epi32(v228, _mm_mullo_epi32(v233, v172))), v173), _mm_setzero_si128()));
                                            v241 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v235, _mm_mullo_epi32(v237, v172)), _mm_add_epi32(v234, _mm_mullo_epi32(v239, v172))), v173)), CatEvenLanesV(_mm_add_epi32(v235, _mm_mullo_epi32(v237, v172)), _mm_add_epi32(v234, _mm_mullo_epi32(v239, v172)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v235, _mm_mullo_epi32(v237, v172)), _mm_add_epi32(v234, _mm_mullo_epi32(v239, v172))), v173), _mm_setzero_si128()));
                                            v242 = v119 + i2;
                                            *(__m128i *)&v242[16] = _mm_unpackhi_epi16(v240, v241);
                                            *(__m128i *)v242 = _mm_unpacklo_epi16(v240, v241);
                                            i2 += 32;
                                            v212 = v219;
                                        } while (i2 != 0x200);
LABEL_a86e90:
                                        v259 = v102 + 0x200;
                                        v260 = v99 & 0xffffffff;
                                        if ((unsigned int)v99 == 1)
                                        {
                                            v102 = v259;
                                            continue;
                                        }
                                        v261 = v10;
                                        v262 = v261 + v176;
                                        v263 = v9 + v176;
                                        v264 = v102 + v18;
                                        v265 = v102 + 0x202;
                                        v266 = v102 + v15;
                                        if (v119 < v264)
                                        {
                                            v267 = arm64g_calculate_condition(0x33, v260, 1, 0);
                                            v268 = 4;
                                            v269 = (v267 & 1 ? v259 : 0x20000000);
                                            v270 = (v267 & 1 ? v262 : 0);
                                        }
                                        else
                                        {
                                            v271 = arm64g_calculate_condition(0x33, v260, 1, 0);
                                            v268 = 0;
                                            v269 = (v271 & 1 ? v259 : 0x20000000);
                                            v270 = (v271 & 1 ? v262 : 0);
                                        }
                                        v272 = arm64g_calculate_condition(v268 | 32, v269, v270, 0);
                                        v273 = v16;
                                        v274 = v17;
                                        if (v119 < v273)
                                        {
                                            v275 = arm64g_calculate_condition(v268 | 48, v269, v270, 0);
                                            v276 = 4;
                                            v277 = (v275 & 1 ? v274 : 0x20000000);
                                            v278 = (v275 & 1 ? v262 : 0);
                                            v279 = arm64g_calculate_condition(36, v277, v278, 0);
                                            if (!(v279 & 1))
                                                goto LABEL_a871aa;
                                            goto LABEL_a871a9;
                                        }
                                        else
                                        {
                                            v280 = arm64g_calculate_condition(v268 | 48, v269, v270, 0);
                                            v276 = 0;
                                            v277 = (v280 & 1 ? v274 : 0x20000000);
                                            v278 = (v280 & 1 ? v262 : 0);
                                            v281 = arm64g_calculate_condition(32, v277, v278, 0);
                                            if (v281 & 1)
                                            {
LABEL_a871a9:
                                                v282 = !(v272 & 1);
                                                goto LABEL_a871ac;
                                            }
                                            else
                                            {
LABEL_a871aa:
                                                v282 = 1;
LABEL_a871ac:
                                                if (v119 < v266)
                                                {
                                                    v283 = arm64g_calculate_condition(v276 | 48, v277, v278, 0);
                                                    v284 = 4;
                                                    v285 = (v283 & 1 ? v265 : 0x20000000);
                                                    v286 = (v283 & 1 ? v262 : 0);
                                                    v287 = arm64g_calculate_condition(36, v285, v286, 0);
                                                    if (!(v287 & 1))
                                                        goto LABEL_a871b6;
                                                    goto LABEL_a871b5;
                                                }
                                                else
                                                {
                                                    v288 = arm64g_calculate_condition(v276 | 48, v277, v278, 0);
                                                    v284 = 0;
                                                    v285 = (v288 & 1 ? v265 : 0x20000000);
                                                    v286 = (v288 & 1 ? v262 : 0);
                                                    v289 = arm64g_calculate_condition(32, v285, v286, 0);
                                                    if (v289 & 1)
                                                    {
LABEL_a871b5:
                                                        goto LABEL_a871b8;
                                                    }
                                                    else
                                                    {
LABEL_a871b6:
                                                        v282 = 1;
LABEL_a871b8:
                                                        v290 = v13;
                                                        v291 = v14;
                                                        if (v119 < v290)
                                                        {
                                                            v292 = arm64g_calculate_condition(v284 | 48, v285, v286, 0);
                                                            v293 = 4;
                                                            v294 = (v292 & 1 ? v291 : 0x20000000);
                                                            v295 = (v292 & 1 ? v262 : 0);
                                                            v296 = arm64g_calculate_condition(36, v294, v295, 0);
                                                            if (!(v296 & 1))
                                                                goto LABEL_a871ca;
                                                            goto LABEL_a871c9;
                                                        }
                                                        else
                                                        {
                                                            v297 = arm64g_calculate_condition(v284 | 48, v285, v286, 0);
                                                            v293 = 0;
                                                            v294 = (v297 & 1 ? v291 : 0x20000000);
                                                            v295 = (v297 & 1 ? v262 : 0);
                                                            v298 = arm64g_calculate_condition(32, v294, v295, 0);
                                                            if (v298 & 1)
                                                            {
LABEL_a871c9:
                                                                goto LABEL_a871cc;
                                                            }
                                                            else
                                                            {
LABEL_a871ca:
                                                                v282 = 1;
LABEL_a871cc:
                                                                if (v119 < &g_defe00)
                                                                {
                                                                    v299 = arm64g_calculate_condition(v293 | 48, v294, v295, 0);
                                                                    v300 = 4;
                                                                    v301 = (v299 & 1 ? v262 : 0);
                                                                    v302 = (v299 & 1 ? &g_defd00 : 0);
                                                                    v303 = arm64g_calculate_condition(148, v301, v302, 0);
                                                                    if (!(v303 & 1))
                                                                        goto LABEL_a871e2;
                                                                    goto LABEL_a871e1;
                                                                }
                                                                else
                                                                {
                                                                    v304 = arm64g_calculate_condition(v293 | 48, v294, v295, 0);
                                                                    v300 = 0;
                                                                    v301 = (v304 & 1 ? v262 : 0);
                                                                    v302 = (v304 & 1 ? &g_defd00 : 0);
                                                                    v305 = arm64g_calculate_condition(144, v301, v302, 0);
                                                                    if (v305 & 1)
                                                                    {
LABEL_a871e1:
                                                                        v306 = v282;
                                                                        goto LABEL_a871e4;
                                                                    }
                                                                    else
                                                                    {
LABEL_a871e2:
                                                                        v306 = 1;
LABEL_a871e4:
                                                                        if (v119 < v263)
                                                                        {
                                                                            v307 = arm64g_calculate_condition(v300 | 48, v301, v302, 0);
                                                                            v308 = 4;
                                                                            v309 = (v307 & 1 ? v116 : 0x20000000);
                                                                            v310 = (v307 & 1 ? v261 : 0);
                                                                            v311 = arm64g_calculate_condition(36, v309, v310, 0);
                                                                            if (!(v311 & 1))
                                                                                goto LABEL_a871ee;
                                                                            goto LABEL_a871ed;
                                                                        }
                                                                        else
                                                                        {
                                                                            v312 = arm64g_calculate_condition(v300 | 48, v301, v302, 0);
                                                                            v308 = 0;
                                                                            v309 = (v312 & 1 ? v116 : 0x20000000);
                                                                            v310 = (v312 & 1 ? v261 : 0);
                                                                            v313 = arm64g_calculate_condition(32, v309, v310, 0);
                                                                            if (v313 & 1)
                                                                            {
LABEL_a871ed:
                                                                                goto LABEL_a871f0;
                                                                            }
                                                                            else
                                                                            {
LABEL_a871ee:
                                                                                v306 = 1;
LABEL_a871f0:
                                                                                if (v259 < v263)
                                                                                {
                                                                                    v314 = arm64g_calculate_condition(v308 | 48, v309, v310, 0);
                                                                                    v315 = 4;
                                                                                    v316 = (v314 & 1 ? v177 : 0x20000000);
                                                                                    v317 = (v314 & 1 ? v264 : 0);
                                                                                    v318 = arm64g_calculate_condition(36, v316, v317, 0);
                                                                                    if (!(v318 & 1))
                                                                                        goto LABEL_a871fa;
                                                                                    goto LABEL_a871f9;
                                                                                }
                                                                                else
                                                                                {
                                                                                    v319 = arm64g_calculate_condition(v308 | 48, v309, v310, 0);
                                                                                    v315 = 0;
                                                                                    v316 = (v319 & 1 ? v177 : 0x20000000);
                                                                                    v317 = (v319 & 1 ? v264 : 0);
                                                                                    v320 = arm64g_calculate_condition(32, v316, v317, 0);
                                                                                    if (v320 & 1)
                                                                                    {
LABEL_a871f9:
                                                                                        goto LABEL_a871fc;
                                                                                    }
                                                                                    else
                                                                                    {
LABEL_a871fa:
                                                                                        v306 = 1;
LABEL_a871fc:
                                                                                        if (v274 < v263)
                                                                                        {
                                                                                            v321 = arm64g_calculate_condition(v315 | 48, v316, v317, 0);
                                                                                            v322 = 4;
                                                                                            v323 = (v321 & 1 ? v177 : 0x20000000);
                                                                                            v324 = (v321 & 1 ? v273 : 0);
                                                                                            v325 = arm64g_calculate_condition(36, v323, v324, 0);
                                                                                            v326 = !(v325 & 1);
                                                                                            if (v265 >= v263)
                                                                                                goto LABEL_a8720e;
                                                                                            goto LABEL_a8720d;
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            v327 = arm64g_calculate_condition(v315 | 48, v316, v317, 0);
                                                                                            v322 = 0;
                                                                                            v323 = (v327 & 1 ? v177 : 0x20000000);
                                                                                            v324 = (v327 & 1 ? v273 : 0);
                                                                                            v328 = arm64g_calculate_condition(32, v323, v324, 0);
                                                                                            v326 = !(v328 & 1);
                                                                                            if (v265 < v263)
                                                                                            {
LABEL_a8720d:
                                                                                                v329 = arm64g_calculate_condition(v322 | 48, v323, v324, 0);
                                                                                                v330 = 4;
                                                                                                v331 = (v329 & 1 ? v177 : 0x20000000);
                                                                                                v332 = (v329 & 1 ? v266 : 0);
                                                                                                goto LABEL_a87210;
                                                                                            }
                                                                                            else
                                                                                            {
LABEL_a8720e:
                                                                                                v333 = arm64g_calculate_condition(v322 | 48, v323, v324, 0);
                                                                                                v330 = 0;
                                                                                                v331 = (v333 & 1 ? v177 : 0x20000000);
                                                                                                v332 = (v333 & 1 ? v266 : 0);
LABEL_a87210:
                                                                                                v334 = arm64g_calculate_condition(v330 | 32, v331, v332, 0);
                                                                                                if (v291 < v263)
                                                                                                {
                                                                                                    v335 = arm64g_calculate_condition(v330 | 48, v331, v332, 0);
                                                                                                    v336 = 4;
                                                                                                    v337 = (v335 & 1 ? v177 : 0x20000000);
                                                                                                    v338 = (v335 & 1 ? v290 : 0);
                                                                                                }
                                                                                                else
                                                                                                {
                                                                                                    v339 = arm64g_calculate_condition(v330 | 48, v331, v332, 0);
                                                                                                    v336 = 0;
                                                                                                    v337 = (v339 & 1 ? v177 : 0x20000000);
                                                                                                    v338 = (v339 & 1 ? v290 : 0);
                                                                                                }
                                                                                                v340 = arm64g_calculate_condition(v336 | 32, v337, v338, 0);
                                                                                                if (&g_defd00 < v263)
                                                                                                {
                                                                                                    v341 = arm64g_calculate_condition(v336 | 128, v337, v338, 0);
                                                                                                    v342 = 4;
                                                                                                    v343 = (v341 & 1 ? v177 : 0x20000000);
                                                                                                    v344 = (v341 & 1 ? &g_defe00 : 0);
                                                                                                }
                                                                                                else
                                                                                                {
                                                                                                    v345 = arm64g_calculate_condition(v336 | 128, v337, v338, 0);
                                                                                                    v342 = 0;
                                                                                                    v343 = (v345 & 1 ? v177 : 0x20000000);
                                                                                                    v344 = (v345 & 1 ? &g_defe00 : 0);
                                                                                                }
                                                                                                v346 = arm64g_calculate_condition(v342 | 32, v343, v344, 0);
                                                                                                v102 = v259;
                                                                                                v347 = v99;
                                                                                                do
                                                                                                {
                                                                                                    v348 = v347;
                                                                                                    if (v177 > v177 + 508 || v306 & 1 || v326 & 1 || !(v334 & 1) || !(v340 & 1) || !(v346 & 1))
                                                                                                    {
                                                                                                        v349 = 0;
                                                                                                        v350 = &g_defd00;
                                                                                                        do
                                                                                                        {
                                                                                                            i8 = v349;
                                                                                                            v352 = v100 + i8;
                                                                                                            v353 = v102 + i8;
                                                                                                            v354 = v119 + i8;
                                                                                                            v355 = *v353;
                                                                                                            v356 = (short)v352[0x200];
                                                                                                            v357 = v353[1];
                                                                                                            v358 = (short)v352[0x202];
                                                                                                            v359 = i8 + 4;
                                                                                                            v360 = v350 + 2;
                                                                                                            v361 = (unsigned short)v357 * (unsigned short)v358 + 0xf2ff * (unsigned short)((v357 * v358) * 5039 >> 24);
                                                                                                            v362 = *(short *)v354 + v355 * v356 + *(short *)v350 * ((v361 & v361 - 3329 >> 15 | v361 - 3329 & ~((short)(v361 - 3329) >> 31)) & 0xffff);
                                                                                                            v363 = (unsigned short)v362 + 0xf2ff * (unsigned short)(v362 * 5039 >> 24);
                                                                                                            *(short *)v354 = v363 & (unsigned short)(v363 - 3329) >> 15 | v363 - 3329 & (short)~(v363 - 3329 >> 31);
                                                                                                            v364 = v356 * v357 + v355 * v358 + (short)v354[2];
                                                                                                            v365 = (unsigned short)v364 + 0xf2ff * (unsigned short)(v364 * 5039 >> 24);
                                                                                                            *(short *)&v354[2] = v365 & (unsigned short)(v365 - 3329) >> 15 | v365 - 3329 & (short)~(v365 - 3329 >> 31);
                                                                                                            v349 = v359;
                                                                                                            v350 = v360;
                                                                                                        } while (i8 < 508);
                                                                                                    }
                                                                                                    else
                                                                                                    {
                                                                                                        i9 = 0;
                                                                                                        v367 = &g_defd00;
                                                                                                        do
                                                                                                        {
                                                                                                            v368 = v102 + i9;
                                                                                                            v369 = CatOddLanesV(v368[1], *v368);
                                                                                                            v370 = CatEvenLanesV(v368[1], *v368);
                                                                                                            v371 = v100 + i9 + 0x200;
                                                                                                            v372 = CatOddLanesV(v371[1], *v371);
                                                                                                            v373 = CatEvenLanesV(v371[1], *v371);
                                                                                                            v374 = v119 + i9;
                                                                                                            v375 = CatOddLanesV((int128_t)v374[16], *(int128_t *)v374);
                                                                                                            v376 = CatEvenLanesV((int128_t)v374[16], *(int128_t *)v374);
                                                                                                            v377 = v367 + 16;
                                                                                                            v378 = MullV(_mm_cvtsi128_si64(v372), _mm_cvtsi128_si64(v369));
                                                                                                            v379 = MullV(_mm_extract_epi64(v372, 1), _mm_extract_epi64(v369, 1));
                                                                                                            v381 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v379, (unsigned long long)v171), 24), _mm_srli_epi64(MullV((unsigned long long)v379, (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v379 >> 64), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v379 >> 64), (unsigned long long)(v171 >> 64)), 24))));
                                                                                                            v383 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v378, (unsigned long long)v171), 24), _mm_srli_epi64(MullV((unsigned long long)v378, (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v378 >> 64), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v378 >> 64), (unsigned long long)(v171 >> 64)), 24))));
                                                                                                            v384 = CatEvenLanesV(_mm_add_epi32(_mm_mullo_epi32(v381, v172), MullV(_mm_extract_epi64(v372, 1), _mm_extract_epi64(v369, 1))), _mm_add_epi32(_mm_mullo_epi32(v383, v172), MullV(_mm_cvtsi128_si64(v372), _mm_cvtsi128_si64(v369))));
                                                                                                            v385 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v384, v173)), v384), _mm_max_epi16(_mm_add_epi16(v384, v173), _mm_setzero_si128()));
                                                                                                            v386 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_cvtsi128_si64(v373), _mm_cvtsi128_si64(v370)), _mm_srli_epi32(_mm_unpacklo_epi16(v376, v376), 16)), MullV(_mm_cvtsi128_si64(v385), (long long)*(int128_t *)v367));
                                                                                                            v387 = _mm_add_epi32(_mm_add_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v376), 16), MullV(_mm_extract_epi64(v373, 1), _mm_extract_epi64(v370, 1))), MullV(_mm_extract_epi64(v385, 1), (long long)((uint128_t)(*(int128_t *)v367) >> 64)));
                                                                                                            v389 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v387), (unsigned long long)v171), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v387), (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v387, 1), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v387, 1), (unsigned long long)(v171 >> 64)), 24))));
                                                                                                            v391 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v386), (unsigned long long)v171), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v386), (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v386, 1), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v386, 1), (unsigned long long)(v171 >> 64)), 24))));
                                                                                                            v392 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_cvtsi128_si64(v372), _mm_cvtsi128_si64(v370)), MullV(_mm_cvtsi128_si64(v369), _mm_cvtsi128_si64(v373))), _mm_srli_epi32(_mm_unpacklo_epi16(v375, v375), 16));
                                                                                                            v393 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_extract_epi64(v372, 1), _mm_extract_epi64(v370, 1)), MullV(_mm_extract_epi64(v369, 1), _mm_extract_epi64(v373, 1))), _mm_srli_epi32(_mm_unpackhi_epi16(v375, v375), 16));
                                                                                                            v395 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v393), (unsigned long long)v171), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v393), (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v393, 1), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v393, 1), (unsigned long long)(v171 >> 64)), 24))));
                                                                                                            v397 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v392), (unsigned long long)v171), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v392), (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v392, 1), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v392, 1), (unsigned long long)(v171 >> 64)), 24))));
                                                                                                            v398 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v387, _mm_mullo_epi32(v389, v172)), _mm_add_epi32(v386, _mm_mullo_epi32(v391, v172))), v173)), CatEvenLanesV(_mm_add_epi32(v387, _mm_mullo_epi32(v389, v172)), _mm_add_epi32(v386, _mm_mullo_epi32(v391, v172)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v387, _mm_mullo_epi32(v389, v172)), _mm_add_epi32(v386, _mm_mullo_epi32(v391, v172))), v173), _mm_setzero_si128()));
                                                                                                            v399 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v393, _mm_mullo_epi32(v395, v172)), _mm_add_epi32(v392, _mm_mullo_epi32(v397, v172))), v173)), CatEvenLanesV(_mm_add_epi32(v393, _mm_mullo_epi32(v395, v172)), _mm_add_epi32(v392, _mm_mullo_epi32(v397, v172)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v393, _mm_mullo_epi32(v395, v172)), _mm_add_epi32(v392, _mm_mullo_epi32(v397, v172))), v173), _mm_setzero_si128()));
                                                                                                            *(__m128i *)&v374[16] = _mm_unpackhi_epi16(v398, v399);
                                                                                                            *(__m128i *)v374 = _mm_unpacklo_epi16(v398, v399);
                                                                                                            i9 += 32;
                                                                                                            v367 = v377;
                                                                                                        } while (i9 != 0x200);
                                                                                                    }
                                                                                                } while ((v100 += 0x200, v102 += 0x200, v347 = v348 - 1, (int)v348 > 2));
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
                v27 = j - 1;
                v400 = 2;
                v401 = &g_defe00;
                do
                {
                    v402 = 0;
                    v403 = (long long)(v400 * 0x100000000) >> 63 & 0xfffffffe00000000 | __ROL__(v400, 1) & 0x1fffffffe & 0x1ffffffff;
                    do
                    {
                        iter2 = v119 + v402;
                        v405 = v402 + v403;
                        v406 = v119 + v405;
                        v407 = (short)v401[2];
                        v401 += 2;
                        v408 = v22 + v176 + v403 + v402;
                        v409 = v21 + v176 + v402;
                        if (v409 < v408)
                            v410 = v408;
                        else
                            v410 = v409;
                        v411 = (v29 + v25) * 0x200 + v402;
                        v412 = v410 + v105 - v411;
                        if (v412 >= 14)
                        {
                            v413 = v408;
                            v414 = v409;
                            if (v409 >= v408)
                                v408 = v409;
                            v415 = v402 + (v408 + v105 - v411 & 0xfffffffffffffffe);
                            v416 = v177 + v403 + v415;
                            if (v406 < v177 + v415)
                            {
                                v417 = arm64g_calculate_condition(52, v413, v414, 0);
                                v418 = arm64g_calculate_condition(52, (v417 & 1 ? iter2 : 0x20000000), (v417 & 1 ? v416 : 0), 0);
                                if (v418 & 1)
                                    goto LABEL_a8704c;
                            }
                            else
                            {
                                v419 = arm64g_calculate_condition(52, v413, v414, 0);
                                v420 = arm64g_calculate_condition(48, (v419 & 1 ? iter2 : 0x20000000), (v419 & 1 ? v416 : 0), 0);
                                if (v420 & 1)
                                    goto LABEL_a8704c;
                            }
                            v421 = (v412 >> 1) + 1;
                            v422 = v421 & 0xfffffffffffffff8;
                            v423 = v422 * 2;
                            v424 = v405 + v423;
                            iter2 += v423;
                            v425 = (__m128i)(CONCAT(v407 & 0xffff | (v407 & 0xffff) * 0x100000000, v407 & 0xffff | (v407 & 0xffff) * 0x100000000));
                            v426 = v119 + v402;
                            v427 = v175 + v403 + v402;
                            v428 = v174 + v402;
                            if (v428 < v427)
                                v428 = v427;
                            i10 = (v168 + v428 - v402 >> 1) + 1 & 0xfffffffffffffff8;
                            do
                            {
                                v430 = i10;
                                v431 = *(int128_t *)v426;
                                v432 = *(int128_t *)((char *)v426 + v403);
                                v433 = _mm_mullo_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_srli_epi32(_mm_unpacklo_epi16(v431, v431), 16), _mm_srli_epi32(_mm_unpacklo_epi16(v432, v432), 16)), v170), v425);
                                v434 = _mm_mullo_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(v431, v431), 16), _mm_srli_epi32(_mm_unpackhi_epi16(v432, v432), 16)), v170), v425);
                                v436 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v434), (unsigned long long)v171), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v434), (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v434, 1), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v434, 1), (unsigned long long)(v171 >> 64)), 24))));
                                v438 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v433), (unsigned long long)v171), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v433), (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v433, 1), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v433, 1), (unsigned long long)(v171 >> 64)), 24))));
                                *(__m128i *)((char *)v426 + v403) = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v434, _mm_mullo_epi32(v436, v172)), _mm_add_epi32(v433, _mm_mullo_epi32(v438, v172))), v173)), CatEvenLanesV(_mm_add_epi32(v434, _mm_mullo_epi32(v436, v172)), _mm_add_epi32(v433, _mm_mullo_epi32(v438, v172)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v434, _mm_mullo_epi32(v436, v172)), _mm_add_epi32(v433, _mm_mullo_epi32(v438, v172))), v173), _mm_setzero_si128()));
                                *(__m128i *)v426 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(_mm_add_epi16(v432, v431), v173)), _mm_add_epi16(v432, v431)), _mm_max_epi16(_mm_add_epi16(_mm_add_epi16(v432, v431), v173), _mm_setzero_si128()));
                                v426 += 16;
                                i10 = v430 - 8;
                            } while (i10);
                            if (v421 == v422)
                            {
                                v440 = v405 + v422 * 2 - 2;
                                continue;
                            }
                            else
                            {
                                v405 = v424;
                            }
                        }
LABEL_a8704c:
                        do
                        {
                            v441 = *(short *)((char *)v119 + v405);
                            v442 = *(short *)iter2;
                            v443 = (unsigned short)v407 * ((unsigned short)(v442 - v441) + 3329) + 0xf2ff * (unsigned short)((v407 * (v442 - v441 + 3329)) * 5039 >> 24);
                            *(short *)((char *)v119 + v405) = v443 & (unsigned short)(v443 - 3329) >> 15 | v443 - 3329 & (short)~(v443 - 3329 >> 31);
                            v424 = v405 + 2;
                            *(unsigned short *)iter2 = (unsigned short)v441 + (unsigned short)v442 & (unsigned short)(v441 + v442 - 3329) >> 15 | (unsigned short)(v441 + v442 - 3329) & (short)~((short)(v441 + v442 - 3329) >> 31);
                            iter2 += 2;
                            v405 = v424;
                        } while (iter2 < v406);
                        v440 = v424 - 2;
                    } while ((v402 = v424, 0x1fe > v440));
                    v400 *= 2;
                } while (0x100 > (int)v400);
                i3 = 0;
                do
                {
                    v445 = *(int128_t *)((char *)v119 + i3);
                    v446 = MullV((unsigned long long)v445, (unsigned long long)v169);
                    v447 = MullV((unsigned long long)(v445 >> 64), (unsigned long long)(v169 >> 64));
                    v449 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v447, (unsigned long long)v171), 24), _mm_srli_epi64(MullV((unsigned long long)v447, (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v447 >> 64), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v447 >> 64), (unsigned long long)(v171 >> 64)), 24))));
                    v451 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v446, (unsigned long long)v171), 24), _mm_srli_epi64(MullV((unsigned long long)v446, (unsigned long long)v171), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v446 >> 64), (unsigned long long)(v171 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v446 >> 64), (unsigned long long)(v171 >> 64)), 24))));
                    v452 = CatEvenLanesV(_mm_add_epi32(_mm_mullo_epi32(v449, v172), MullV((unsigned long long)(v445 >> 64), (unsigned long long)(v169 >> 64))), _mm_add_epi32(_mm_mullo_epi32(v451, v172), MullV((unsigned long long)v445, (unsigned long long)v169)));
                    *(__m128i *)((char *)v119 + i3) = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v452, v173)), v452), _mm_max_epi16(_mm_add_epi16(v452, v173), _mm_setzero_si128()));
                    i3 += 16;
                } while (i3 != 0x200);
                v119 += 0x200;
                v101 = v29 + 1;
                v104 = v28 + 0x200;
                v168 -= 0x200;
                v175 += 0x200;
                v174 += 0x200;
                v30 = v27;
                v100 = (void*)v23;
                v99 = (unsigned long)v26;
                v116 = v20;
            } while (1 < (int)j);
        }
        v453 = v2;
        v454 = v3;
        v35 = *v454;
        v36 = v454[1];
        v455 = v32;
        v456 = (unsigned int)v99 + 1;
        v457 = v100;
        do
        {
            v37 = v455;
            if (!sub_a85fdc(v457, &v35, v4, v6))
            {
                sub_a66ec0(&v35, 33);
                goto LABEL_a882e8;
            }
        } while ((v455 += 1, v457 += 0x200, v456 -= 1, 1 < (int)v456));
        v32 = v455;
        sub_a66ec0(&v35, 33);
        v458 = (unsigned long)v26;
        v459 = v458 & 0xffffffff;
        if ((int)v458 < 1)
            v460 = v458 & 0xffffffff;
        else
            v460 = 1;
        v461 = v458 - v460;
        v462 = v100 + (v25 + v461) * 0x200 + 0x200;
        v463 = (void*)v19;
        if (v463 < v100 + v461 * 0x200 + 0x200)
        {
            v464 = arm64g_calculate_condition(0x33, v459, 1, 0);
            v465 = 4;
            v466 = (v464 & 1 ? v462 : 0);
            v467 = (v464 & 1 ? v100 : 0);
        }
        else
        {
            v468 = arm64g_calculate_condition(0x33, v459, 1, 0);
            v465 = 0;
            v466 = (v468 & 1 ? v462 : 0);
            v467 = (v468 & 1 ? v100 : 0);
        }
        v469 = arm64g_calculate_condition(v465 | 144, v466, v467, 0);
        v470 = _mm_set1_epi32(0xf2fff2ff);
        v471 = v463;
        v472 = v100;
        do
        {
            v473 = v458;
            i4 = 0;
            if (!(v469 & 1))
            {
                v475 = v472 + v5;
                do
                {
                    v476 = *(short *)((char *)v472 + i4) + *(short *)((char *)v475 + i4);
                    *(short *)((char *)v475 + i4) = v476 & (unsigned short)(v476 - 3329) >> 15 | v476 - 3329 & (short)~(v476 - 3329 >> 31);
                    i4 += 2;
                } while (i4 != 0x200);
            }
            else
            {
                do
                {
                    v477 = v471 + i4;
                    v478 = v472 + i4;
                    v479 = _mm_add_epi16(*v478, *v477);
                    v480 = _mm_add_epi16(v478[1], v477[1]);
                    *v477 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v479, v470)), v479), _mm_max_epi16(_mm_add_epi16(v479, v470), _mm_setzero_si128()));
                    v477[1] = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v480, v470)), v480), _mm_max_epi16(_mm_add_epi16(v480, v470), _mm_setzero_si128()));
                    i4 += 32;
                } while (i4 != 0x200);
            }
        } while ((v471 += 0x200, v472 += 0x200, v458 = (unsigned int)v473 - 1, (int)v473 > 1));
        v481 = CONCAT(v453 & 0xffffffff | (v453 & 0xffffffff) * 0x100000000, v453 & 0xffffffff | (v453 & 0xffffffff) * 0x100000000);
        v482 = (__m128i)(CONCAT(~(0xffffffff << ((char)v453 & 31)) | ~(0xffffffff << ((char)v453 & 31)) * 0x100000000, ~(0xffffffff << ((char)v453 & 31)) | ~(0xffffffff << ((char)v453 & 31)) * 0x100000000));
        v483 = CONCAT(21642340209583, 21642340209583);
        v484 = v463;
        v485 = (unsigned int)v26;
        do
        {
            k = v485;
            i5 = 0;
            do
            {
                v488 = __dirty_unsupported_Iop_Sh32Ux4(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), *(int128_t *)((char *)v484 + i5)), 16), v481);
                v489 = __dirty_unsupported_Iop_Sh32Ux4(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), *(int128_t *)((char *)v484 + i5)), 16), v481);
                v491 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v489), (unsigned long long)v483), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v489), (unsigned long long)v483), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v489, 1), (unsigned long long)(v483 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v489, 1), (unsigned long long)(v483 >> 64)), 24))));
                v493 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v488), (unsigned long long)v483), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v488), (unsigned long long)v483), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v488, 1), (unsigned long long)(v483 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v488, 1), (unsigned long long)(v483 >> 64)), 24))));
                *(__m128i *)((char *)v484 + i5) = CatEvenLanesV(_mm_and_si128(_mm_add_epi32(_mm_add_epi32(v493, _mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(1664), _mm_add_epi32(v488, _mm_mullo_epi32(v493, _mm_set1_epi32(-0xd01)))), _mm_add_epi32(v488, _mm_mullo_epi32(v493, _mm_set1_epi32(-0xd01)))), 31)), _mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(4993), _mm_add_epi32(v488, _mm_mullo_epi32(v493, _mm_set1_epi32(-0xd01)))), _mm_add_epi32(v488, _mm_mullo_epi32(v493, _mm_set1_epi32(-0xd01)))), 31)), v482), _mm_and_si128(_mm_add_epi32(_mm_add_epi32(v491, _mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(1664), _mm_add_epi32(v489, _mm_mullo_epi32(v491, _mm_set1_epi32(-0xd01)))), _mm_add_epi32(v489, _mm_mullo_epi32(v491, _mm_set1_epi32(-0xd01)))), 31)), _mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(4993), _mm_add_epi32(v489, _mm_mullo_epi32(v491, _mm_set1_epi32(-0xd01)))), _mm_add_epi32(v489, _mm_mullo_epi32(v491, _mm_set1_epi32(-0xd01)))), 31)), v482));
                i5 += 16;
            } while (i5 != 0x200);
            v484 += 0x200;
            v485 = k - 1;
        } while (1 < (int)k);
        if ((int)(unsigned int)v26 >= 1)
        {
            v494 = a0;
            v495 = (unsigned int)v26;
            do
            {
                l = v495;
                v497 = 0;
                v498 = 0;
                v499 = 0;
                v500 = v494;
                do
                {
                    v501 = *(short *)((char *)v463 + v497);
                    v502 = v499 + v453;
                    if (63 < (int)v502)
                    {
                        *v500 = v501 << ((char)v499 & 63) | v498;
                        v500 += 1;
                        v503 = v502 & 0xffffffff;
                        if ((unsigned int)v502 == 64)
                        {
                            v498 = 0;
                            v504 = arm64g_calculate_condition(3, v503, 64, 0);
                            if (!(v504 & 1))
                                goto LABEL_a87716;
                        }
                        else
                        {
                            v498 = v501 >> ((char)-v499 & 63);
                            v505 = arm64g_calculate_condition(3, v503, 64, 0);
                            if (!(v505 & 1))
                            {
LABEL_a87716:
                                v499 = (unsigned int)v502 - 64;
                                continue;
                            }
                        }
                        v499 = 0;
                        continue;
                    }
                    else
                    {
                        v498 |= v501 << ((char)v499 & 63);
                        v499 = v502;
                    }
                } while ((v497 += 2, 0x1fe > v497 - 2));
                v463 += 0x200;
                v494 = &v494[4 * v453];
                v495 = l - 1;
            } while ((int)l > 1);
            v455 = v32;
        }
        v35 = *v454;
        v36 = v454[1];
        v37 = v455;
        v506 = (void*)v23;
        if (sub_a85fdc(v506, &v35, v4, v6))
        {
            node = (char *)&v34 + 16;
            v508 = v506 + 16;
            m = 0x100;
            v510 = _mm_set1_epi32(0xf2fff2ff);
            do
            {
                v511 = m;
                v512 = _mm_add_epi16(*(int128_t *)((char *)v508 - 16), *(int128_t *)((char *)node - 16));
                v513 = _mm_add_epi16(*(int128_t *)v508, *node);
                *(uint128_t *)((char *)node - 16) = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v512, v510)), v512), _mm_max_epi16(_mm_add_epi16(v512, v510), _mm_setzero_si128()));
                *node = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v513, v510)), v513), _mm_max_epi16(_mm_add_epi16(v513, v510), _mm_setzero_si128()));
                node += 2;
                v508 += 32;
                m = v511 - 16;
            } while (m);
            n = 0;
            v15 = CONCAT(468662987452909185, 468662987452909185);
            v20 = 0x11100100fffefffefffefffefffefffe;
            v19 = _mm_set_epi64x(0xfffefffe11100100, 0xfffefffefffefffe);
            v18 = 0xfffefffefffefffe11100100fffefffe;
            v17 = 0x13120302fffefffefffefffefffefffe;
            v30 = 0xfffefffe13120302fffefffefffefffe;
            v16 = 0x15140504fffefffefffefffefffefffe;
            v14 = 0xfffefffefffefffefffefffe15140504;
            v13 = 0xfffefffe17160706fffefffefffefffe;
            v12 = 0xfffefffefffefffefffefffe17160706;
            v11 = 0x19180908fffefffefffefffefffefffe;
            v10 = 0xfffefffefffefffe19180908fffefffe;
            v9 = 0x1b1a0b0afffefffefffefffefffefffe;
            v8 = 0xfffefffefffefffefffefffe1b1a0b0a;
            v7 = 0xfffefffefffefffe1d1c0d0cfffefffe;
            v6 = 0xfffefffefffefffefffefffe1d1c0d0c;
            v5 = 0xfffefffe1f1e0f0efffefffefffefffe;
            v4 = 0xfffefffefffefffe1f1e0f0efffefffe;
            v3 = 0xfffefffefffefffefffefffe1f1e0f0e;
            v516 = &v33 + 128;
            v517 = v1;
            do
            {
                v518 = *(int128_t *)((char *)a1 + n);
                v519 = _mm_set1_epi32(0x1010101);
                v520 = _mm_and_si128(v518, v519);
                v521 = _INSERT(__float_as_int(__int_as_float((unsigned int)(unsigned short)*(short *)((char *)v516 - 128))), 2, *(short *)((char *)v516 - 112));
                v522 = _INSERT(v521, 4, *(short *)((char *)v516 - 96));
                v523 = _INSERT(v522, 6, *(short *)((char *)v516 - 80));
                v524 = _INSERT(v523, 8, *(short *)((char *)v516 - 64));
                v525 = _INSERT(v524, 10, *(short *)((char *)v516 - 48));
                v526 = _INSERT(v525, 12, *(short *)((char *)v516 - 32));
                v527 = (__m128i)_INSERT(v526, 14, *(short *)((char *)v516 - 16));
                v528 = _INSERT(*(short *)v516, 2, (short)v516[16]);
                v529 = _INSERT(v528, 4, (short)v516[32]);
                v530 = _INSERT(v529, 6, (short)v516[48]);
                v531 = _INSERT(v530, 8, (short)v516[64]);
                v532 = _INSERT(v531, 10, (short)v516[80]);
                v533 = _INSERT(v532, 12, (short)v516[96]);
                v535 = v15;
                v26 = _mm_add_epi16(_mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpackhi_epi8(v520, v520), 8)), v535), _INSERT(v533, 14, (short)v516[112]));
                v536 = _mm_add_epi16(_mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v520), 8)), v535), v527);
                v537 = _mm_set1_epi32(0xf2fff2ff);
                v29 = _mm_add_epi16(v26, v537);
                v538 = _mm_and_si128(ShrNV(v518, 1), v519);
                v539 = _INSERT(__float_as_int(__int_as_float((unsigned int)(unsigned short)*(short *)((char *)v516 - 126))), 2, *(short *)((char *)v516 - 110));
                v540 = _INSERT(v539, 4, *(short *)((char *)v516 - 94));
                v541 = _INSERT(v540, 6, *(short *)((char *)v516 - 78));
                v542 = _INSERT(v541, 8, *(short *)((char *)v516 - 62));
                v543 = _INSERT(v542, 10, *(short *)((char *)v516 - 46));
                v544 = _INSERT(v543, 12, *(short *)((char *)v516 - 30));
                v545 = (__m128i)_INSERT(v544, 14, *(short *)((char *)v516 - 14));
                v546 = _INSERT((short)v516[2], 2, (short)v516[18]);
                v547 = _INSERT(v546, 4, (short)v516[0x22]);
                v548 = _INSERT(v547, 6, (short)v516[50]);
                v549 = _INSERT(v548, 8, (short)v516[66]);
                v550 = _INSERT(v549, 10, (short)v516[82]);
                v551 = _INSERT(v550, 12, (short)v516[98]);
                v552 = (__m128i)_INSERT(v551, 14, (short)v516[114]);
                v553 = _mm_add_epi16(_mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpackhi_epi8(v538, v538), 8)), v535), v552);
                v554 = _mm_add_epi16(_mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v538), 8)), v535), v545);
                v28 = _mm_add_epi16(v553, v537);
                v555 = _mm_and_si128(ShrNV(v518, 2), v519);
                v556 = _INSERT(__float_as_int(__int_as_float((unsigned int)(unsigned short)*(short *)((char *)v516 - 124))), 2, *(short *)((char *)v516 - 108));
                v557 = _INSERT(v556, 4, *(short *)((char *)v516 - 92));
                v558 = _INSERT(v557, 6, *(short *)((char *)v516 - 76));
                v559 = _INSERT(v558, 8, *(short *)((char *)v516 - 60));
                v560 = _INSERT(v559, 10, *(short *)((char *)v516 - 44));
                v561 = _INSERT(v560, 12, *(short *)((char *)v516 - 28));
                v562 = (__m128i)_INSERT(v561, 14, *(short *)((char *)v516 - 12));
                v563 = _INSERT((short)v516[4], 2, (short)v516[20]);
                v564 = _INSERT(v563, 4, (short)v516[36]);
                v565 = _INSERT(v564, 6, (short)v516[52]);
                v566 = _INSERT(v565, 8, (short)v516[0x44]);
                v567 = _INSERT(v566, 10, (short)v516[84]);
                v568 = _INSERT(v567, 12, (short)v516[100]);
                v569 = (__m128i)_INSERT(v568, 14, (short)v516[116]);
                v570 = _mm_add_epi16(v569, _mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpackhi_epi8(v555, v555), 8)), v535));
                v571 = _mm_add_epi16(v562, _mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v555), 8)), v535));
                v27 = _mm_add_epi16(v570, v537);
                v572 = _mm_and_si128(ShrNV(v518, 3), v519);
                v573 = _INSERT(__float_as_int(__int_as_float((unsigned int)(unsigned short)*(short *)((char *)v516 - 122))), 2, *(short *)((char *)v516 - 106));
                v574 = _INSERT(v573, 4, *(short *)((char *)v516 - 90));
                v575 = _INSERT(v574, 6, *(short *)((char *)v516 - 74));
                v576 = _INSERT(v575, 8, *(short *)((char *)v516 - 58));
                v577 = _INSERT(v576, 10, *(short *)((char *)v516 - 42));
                v578 = _INSERT(v577, 12, *(short *)((char *)v516 - 26));
                v579 = (__m128i)_INSERT(v578, 14, *(short *)((char *)v516 - 10));
                v580 = _INSERT((short)v516[6], 2, (short)v516[22]);
                v581 = _INSERT(v580, 4, (short)v516[38]);
                v582 = _INSERT(v581, 6, (short)v516[54]);
                v583 = _INSERT(v582, 8, (short)v516[70]);
                v584 = _INSERT(v583, 10, (short)v516[86]);
                v585 = _INSERT(v584, 12, (short)v516[0x66]);
                v586 = (__m128i)_INSERT(v585, 14, (short)v516[118]);
                v587 = _mm_add_epi16(v586, _mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpackhi_epi8(v572, v572), 8)), v535));
                v588 = _mm_add_epi16(v579, _mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v572), 8)), v535));
                v589 = _mm_and_si128(ShrNV(v518, 4), v519);
                v590 = _INSERT(__float_as_int(__int_as_float((unsigned int)(unsigned short)*(short *)((char *)v516 - 120))), 2, *(short *)((char *)v516 - 104));
                v591 = _INSERT(v590, 4, *(short *)((char *)v516 - 88));
                v592 = _INSERT(v591, 6, *(short *)((char *)v516 - 72));
                v593 = _INSERT(v592, 8, *(short *)((char *)v516 - 56));
                v594 = _INSERT(v593, 10, *(short *)((char *)v516 - 40));
                v595 = _INSERT(v594, 12, *(short *)((char *)v516 - 24));
                v596 = (__m128i)_INSERT(v595, 14, *(short *)((char *)v516 - 8));
                v597 = _INSERT((short)v516[8], 2, (short)v516[24]);
                v598 = _INSERT(v597, 4, (short)v516[40]);
                v599 = _INSERT(v598, 6, (short)v516[56]);
                v600 = _INSERT(v599, 8, (short)v516[72]);
                v601 = _INSERT(v600, 10, (short)v516[88]);
                v602 = _INSERT(v601, 12, (short)v516[104]);
                v603 = (__m128i)_INSERT(v602, 14, (short)v516[120]);
                v604 = _mm_add_epi16(v603, _mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpackhi_epi8(v589, v589), 8)), v535));
                v605 = _mm_add_epi16(v596, _mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v589), 8)), v535));
                v606 = _mm_and_si128(ShrNV(v518, 5), v519);
                v607 = _INSERT(__float_as_int(__int_as_float((unsigned int)(unsigned short)*(short *)((char *)v516 - 118))), 2, *(short *)((char *)v516 - 0x66));
                v608 = _INSERT(v607, 4, *(short *)((char *)v516 - 86));
                v609 = _INSERT(v608, 6, *(short *)((char *)v516 - 70));
                v610 = _INSERT(v609, 8, *(short *)((char *)v516 - 54));
                v611 = _INSERT(v610, 10, *(short *)((char *)v516 - 38));
                v612 = _INSERT(v611, 12, *(short *)((char *)v516 - 22));
                v613 = (__m128i)_INSERT(v612, 14, *(short *)((char *)v516 - 6));
                v614 = _INSERT((short)v516[10], 2, (short)v516[26]);
                v615 = _INSERT(v614, 4, (short)v516[42]);
                v616 = _INSERT(v615, 6, (short)v516[58]);
                v617 = _INSERT(v616, 8, (short)v516[74]);
                v618 = _INSERT(v617, 10, (short)v516[90]);
                v619 = _INSERT(v618, 12, (short)v516[106]);
                v620 = (__m128i)_INSERT(v619, 14, (short)v516[122]);
                v621 = _mm_add_epi16(v620, _mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpackhi_epi8(v606, v606), 8)), v535));
                v622 = _mm_add_epi16(v613, _mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v606), 8)), v535));
                v623 = _mm_and_si128(ShrNV(v518, 6), v519);
                v624 = _INSERT(__float_as_int(__int_as_float((unsigned int)(unsigned short)*(short *)((char *)v516 - 116))), 2, *(short *)((char *)v516 - 100));
                v625 = _INSERT(v624, 4, *(short *)((char *)v516 - 84));
                v626 = _INSERT(v625, 6, *(short *)((char *)v516 - 0x44));
                v627 = _INSERT(v626, 8, *(short *)((char *)v516 - 52));
                v628 = _INSERT(v627, 10, *(short *)((char *)v516 - 36));
                v629 = _INSERT(v628, 12, *(short *)((char *)v516 - 20));
                v630 = (__m128i)_INSERT(v629, 14, *(short *)((char *)v516 - 4));
                v631 = _INSERT((short)v516[12], 2, (short)v516[28]);
                v632 = _INSERT(v631, 4, (short)v516[44]);
                v633 = _INSERT(v632, 6, (short)v516[60]);
                v634 = _INSERT(v633, 8, (short)v516[76]);
                v635 = _INSERT(v634, 10, (short)v516[92]);
                v636 = _INSERT(v635, 12, (short)v516[108]);
                v638 = _mm_add_epi16(_INSERT(v636, 14, (short)v516[124]), _mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpackhi_epi8(v623, v623), 8)), v535));
                v639 = _mm_add_epi16(v630, _mm_and_si128(_mm_sub_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v623), 8)), v535));
                v640 = _INSERT(__float_as_int(__int_as_float((unsigned int)(unsigned short)*(short *)((char *)v516 - 114))), 2, *(short *)((char *)v516 - 98));
                v641 = _INSERT(v640, 4, *(short *)((char *)v516 - 82));
                v642 = _INSERT(v641, 6, *(short *)((char *)v516 - 66));
                v643 = _INSERT(v642, 8, *(short *)((char *)v516 - 50));
                v644 = _INSERT(v643, 10, *(short *)((char *)v516 - 0x22));
                v645 = _INSERT(v644, 12, *(short *)((char *)v516 - 18));
                v646 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v588, v537)), v588), _mm_max_epi16(_mm_add_epi16(v588, v537), _mm_setzero_si128()));
                v647 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v571, v537)), v571), _mm_max_epi16(_mm_add_epi16(v571, v537), _mm_setzero_si128()));
                v648 = _INSERT((short)v516[14], 2, (short)v516[30]);
                v649 = _INSERT(v648, 4, (short)v516[46]);
                v650 = _INSERT(v649, 6, (short)v516[62]);
                v651 = _INSERT(v650, 8, (short)v516[78]);
                v652 = _INSERT(v651, 10, (short)v516[94]);
                v653 = _INSERT(v652, 12, (short)v516[110]);
                v654 = (__m128i)_INSERT(v653, 14, (short)v516[126]);
                v655 = _mm_cmpgt_epi8(_mm_setzero_si128(), v518);
                v656 = _mm_add_epi16(v654, _mm_and_si128(_mm_srai_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v655), 8), v535));
                v657 = (__m128i)_INSERT(v645, 14, *(short *)((char *)v516 - 2));
                v658 = _mm_add_epi16(v657, _mm_and_si128(_mm_srai_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v655), 8), v535));
                v659 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v554, v537)), v554), _mm_max_epi16(_mm_add_epi16(v554, v537), _mm_setzero_si128()));
                v660 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v536, v537)), v536), _mm_max_epi16(_mm_add_epi16(v536, v537), _mm_setzero_si128()));
                v661 = v29;
                v662 = v28;
                v25 = _mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), v662), v553);
                v26 = _mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), v661), v26);
                v663 = v27;
                v22 = _mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), v663), v570);
                v21 = _mm_max_epi16(v661, _mm_setzero_si128());
                v28 = _mm_max_epi16(v662, _mm_setzero_si128());
                v664 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v587, v537)), v587), _mm_max_epi16(_mm_add_epi16(v587, v537), _mm_setzero_si128()));
                v665 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v621, v537)), v621), _mm_max_epi16(_mm_add_epi16(v621, v537), _mm_setzero_si128()));
                v666 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v604, v537)), v604), _mm_max_epi16(_mm_add_epi16(v604, v537), _mm_setzero_si128()));
                v667 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v622, v537)), v622), _mm_max_epi16(_mm_add_epi16(v622, v537), _mm_setzero_si128()));
                v668 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v605, v537)), v605), _mm_max_epi16(_mm_add_epi16(v605, v537), _mm_setzero_si128()));
                v669 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v658, v537)), v658), _mm_max_epi16(_mm_add_epi16(v658, v537), _mm_setzero_si128()));
                v670 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v639, v537)), v639), _mm_max_epi16(_mm_add_epi16(v639, v537), _mm_setzero_si128()));
                v671 = v19;
                v672 = v20;
                v674 = v17;
                v675 = v18;
                v677 = _INSERT(_INSERT(_mm_unpacklo_epi16(v660, v659), 4, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v646, _mm_and_si128(_mm_sub_epi8(v675, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v675, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v647, _mm_and_si128(v675, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v675))), 1)), 8, _INSERT(_mm_or_si128(_mm_and_si128(PermV(v667, _mm_and_si128(_mm_sub_epi8(v671, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v671, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v668, _mm_and_si128(v671, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v671))), 12, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v669, _mm_and_si128(_mm_sub_epi8(v672, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v672, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v670, _mm_and_si128(v672, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v672))), 3)) >> 64);
                v29 = v677;
                v680 = _INSERT(_INSERT(_mm_unpackhi_epi16(CatOddLanesV(v660, v660), CatOddLanesV(v659, v659)), 4, _mm_extract_epi32(_mm_unpacklo_epi16(v647, v646), 1)), 8, _INSERT(_mm_or_si128(_mm_and_si128(PermV(v667, _mm_and_si128(_mm_sub_epi8(v30, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v30, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v668, _mm_and_si128(v30, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v30))), 12, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v669, _mm_and_si128(_mm_sub_epi8(v674, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v674, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v670, _mm_and_si128(v674, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v674))), 3)) >> 64);
                v681 = v16;
                v683 = v647;
                v684 = v646;
                v685 = v14;
                v687 = _INSERT(_INSERT(_mm_or_si128(_mm_and_si128(PermV(v659, _mm_and_si128(_mm_sub_epi8(v685, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v685, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v660, _mm_and_si128(v685, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v685))), 4, (_INSERT(v683, 6, _mm_extract_epi16(v684, 2)) & 0xffffffffffffffff) >> 32), 8, _INSERT(_mm_unpacklo_epi16(v668, v667), 12, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v669, _mm_and_si128(_mm_sub_epi8(v681, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v681, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v670, _mm_and_si128(v681, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v681))), 3)) >> 64);
                v689 = v10;
                v690 = v11;
                v691 = _INSERT(_INSERT(v668, 10, _mm_extract_epi16(v667, 4)), 12, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v669, _mm_and_si128(_mm_sub_epi8(v690, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v690, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v670, _mm_and_si128(v690, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v690))), 3));
                v24 = v646;
                v23 = v647;
                v693 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v656, v537)), v656), _mm_max_epi16(_mm_add_epi16(v656, v537), _mm_setzero_si128()));
                v694 = _INSERT(_INSERT(_mm_unpackhi_epi16(v660, v659), 4, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v646, _mm_and_si128(_mm_sub_epi8(v689, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v689, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v647, _mm_and_si128(v689, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v689))), 1)), 8, *(unsigned long long *)((void*)&v691 + 8));
                v696 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v638, v537)), v638), _mm_max_epi16(_mm_add_epi16(v638, v537), _mm_setzero_si128()));
                v697 = _INSERT(_mm_unpackhi_epi16(v668, v667), 12, _INSERT(v670, 14, _mm_extract_epi16(v669, 6)) >> 96);
                v698 = v7;
                v699 = v6;
                v701 = _INSERT(_INSERT(_mm_or_si128(_mm_and_si128(PermV(v659, _mm_and_si128(_mm_sub_epi8(v699, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v699, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v660, _mm_and_si128(v699, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v699))), 4, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v684, _mm_and_si128(_mm_sub_epi8(v698, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v698, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v683, _mm_and_si128(v698, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v698))), 1)), 8, *(unsigned long long *)((void*)&v697 + 8));
                v703 = _mm_or_si128(v22, _mm_max_epi16(v663, _mm_setzero_si128()));
                v704 = _mm_or_si128(v25, v28);
                v705 = _mm_or_si128(v26, v21);
                v707 = _INSERT(_INSERT(_mm_unpacklo_epi16(v705, v704), 4, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v664, _mm_and_si128(_mm_sub_epi8(v675, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v675, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v703, _mm_and_si128(v675, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v675))), 1)), 8, _INSERT(_mm_or_si128(_mm_and_si128(PermV(v665, _mm_and_si128(_mm_sub_epi8(v671, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v671, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v666, _mm_and_si128(v671, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v671))), 12, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v693, _mm_and_si128(_mm_sub_epi8(v672, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v672, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v696, _mm_and_si128(v672, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v672))), 3)) >> 64);
                v710 = _INSERT(_INSERT(_mm_or_si128(_mm_and_si128(PermV(v704, _mm_and_si128(_mm_sub_epi8(v685, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v685, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v705, _mm_and_si128(v685, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v685))), 4, (_INSERT(v703, 6, _mm_extract_epi16(v664, 2)) & 0xffffffffffffffff) >> 32), 8, _INSERT(_mm_unpacklo_epi16(v666, v665), 12, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v693, _mm_and_si128(_mm_sub_epi8(v681, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v681, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v696, _mm_and_si128(v681, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v681))), 3)) >> 64);
                v712 = _INSERT(_INSERT(v666, 10, _mm_extract_epi16(v665, 4)), 12, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v693, _mm_and_si128(_mm_sub_epi8(v690, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v690, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v696, _mm_and_si128(v690, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v690))), 3));
                v714 = _INSERT(_INSERT(_mm_unpackhi_epi16(v705, v704), 4, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v664, _mm_and_si128(_mm_sub_epi8(v689, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v689, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v703, _mm_and_si128(v689, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v689))), 1)), 8, *(unsigned long long *)((void*)&v712 + 8));
                v716 = _INSERT(_mm_unpackhi_epi16(v666, v665), 12, _INSERT(v696, 14, _mm_extract_epi16(v693, 6)) >> 96);
                v718 = _INSERT(_INSERT(_mm_or_si128(_mm_and_si128(PermV(v704, _mm_and_si128(_mm_sub_epi8(v699, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v699, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v705, _mm_and_si128(v699, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v699))), 4, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v664, _mm_and_si128(_mm_sub_epi8(v698, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v698, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v703, _mm_and_si128(v698, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v698))), 1)), 8, *(unsigned long long *)((void*)&v716 + 8));
                v719 = v4;
                v720 = v5;
                v722 = v3;
                v724 = _INSERT(_INSERT(_mm_or_si128(_mm_and_si128(PermV(v704, _mm_and_si128(_mm_sub_epi8(v722, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v722, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v705, _mm_and_si128(v722, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v722))), 4, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v664, _mm_and_si128(_mm_sub_epi8(v719, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v719, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v703, _mm_and_si128(v719, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v719))), 1)), 8, _INSERT(_mm_or_si128(_mm_and_si128(PermV(v665, _mm_and_si128(_mm_sub_epi8(v720, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v720, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v666, _mm_and_si128(v720, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v720))), 12, _mm_extract_epi32(_mm_unpackhi_epi16(v696, v693), 3)) >> 64);
                *(uint128_t *)&v516[96] = v718;
                *(uint128_t *)&v516[112] = v724;
                v725 = v8;
                v726 = v9;
                v729 = _INSERT(_INSERT(_mm_or_si128(_mm_and_si128(PermV(v704, _mm_and_si128(_mm_sub_epi8(v725, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v725, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v705, _mm_and_si128(v725, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v725))), 4, _mm_extract_epi32(_mm_unpackhi_epi16(v703, v664), 1)), 8, _INSERT(_mm_unpackhi_epi16(CatOddLanesV(v666, v666), CatOddLanesV(v665, v665)), 12, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v693, _mm_and_si128(_mm_sub_epi8(v726, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v726, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v696, _mm_and_si128(v726, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v726))), 3)) >> 64);
                *(uint128_t *)&v516[64] = v714;
                *(uint128_t *)&v516[80] = v729;
                v730 = v12;
                v731 = v13;
                v734 = _INSERT(_INSERT(_mm_or_si128(_mm_and_si128(PermV(v704, _mm_and_si128(_mm_sub_epi8(v730, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v730, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v705, _mm_and_si128(v730, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v730))), 4, _mm_extract_epi32(_mm_unpackhi_epi16(CatOddLanesV(v703, v703), CatOddLanesV(v664, v664)), 1)), 8, _INSERT(_mm_or_si128(_mm_and_si128(PermV(v665, _mm_and_si128(_mm_sub_epi8(v731, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v731, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v666, _mm_and_si128(v731, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v731))), 12, _mm_extract_epi32(_mm_unpacklo_epi16(v696, v693), 3)) >> 64);
                *(uint128_t *)&v516[32] = v710;
                *(uint128_t *)&v516[48] = v734;
                v737 = _INSERT(_INSERT(_mm_unpackhi_epi16(CatOddLanesV(v705, v705), CatOddLanesV(v704, v704)), 4, _mm_extract_epi32(_mm_unpacklo_epi16(v703, v664), 1)), 8, _INSERT(_mm_or_si128(_mm_and_si128(PermV(v665, _mm_and_si128(_mm_sub_epi8(v30, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v30, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v666, _mm_and_si128(v30, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v30))), 12, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v693, _mm_and_si128(_mm_sub_epi8(v674, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v674, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v696, _mm_and_si128(v674, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v674))), 3)) >> 64);
                *(uint128_t *)v516 = v707;
                *(uint128_t *)&v516[16] = v737;
                v739 = v24;
                v740 = v23;
                v742 = _INSERT(_INSERT(_mm_or_si128(_mm_and_si128(PermV(v659, _mm_and_si128(_mm_sub_epi8(v722, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v722, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v660, _mm_and_si128(v722, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v722))), 4, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v739, _mm_and_si128(_mm_sub_epi8(v719, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v719, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v740, _mm_and_si128(v719, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v719))), 1)), 8, _INSERT(_mm_or_si128(_mm_and_si128(PermV(v667, _mm_and_si128(_mm_sub_epi8(v720, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v720, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v668, _mm_and_si128(v720, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v720))), 12, _mm_extract_epi32(_mm_unpackhi_epi16(v670, v669), 3)) >> 64);
                *(uint128_t *)((char *)v516 - 32) = v701;
                *(uint128_t *)((char *)v516 - 16) = v742;
                v745 = _INSERT(_INSERT(_mm_or_si128(_mm_and_si128(PermV(v659, _mm_and_si128(_mm_sub_epi8(v725, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v725, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v660, _mm_and_si128(v725, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v725))), 4, _mm_extract_epi32(_mm_unpackhi_epi16(v740, v739), 1)), 8, _INSERT(_mm_unpackhi_epi16(CatOddLanesV(v668, v668), CatOddLanesV(v667, v667)), 12, _mm_extract_epi32(_mm_or_si128(_mm_and_si128(PermV(v669, _mm_and_si128(_mm_sub_epi8(v726, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v726, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v670, _mm_and_si128(v726, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v726))), 3)) >> 64);
                *(uint128_t *)((char *)v516 - 64) = v694;
                *(uint128_t *)((char *)v516 - 48) = v745;
                v748 = _INSERT(_INSERT(_mm_or_si128(_mm_and_si128(PermV(v659, _mm_and_si128(_mm_sub_epi8(v730, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v730, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v660, _mm_and_si128(v730, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v730))), 4, _mm_extract_epi32(_mm_unpackhi_epi16(CatOddLanesV(v740, v740), CatOddLanesV(v739, v739)), 1)), 8, _INSERT(_mm_or_si128(_mm_and_si128(PermV(v667, _mm_and_si128(_mm_sub_epi8(v731, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v731, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v668, _mm_and_si128(v731, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v731))), 12, _mm_extract_epi32(_mm_unpacklo_epi16(v670, v669), 3)) >> 64);
                *(uint128_t *)((char *)v516 - 96) = v687;
                *(uint128_t *)((char *)v516 - 80) = v748;
                *(uint128_t *)((char *)v516 - 128) = v29;
                *(uint128_t *)((char *)v516 - 112) = v680;
                n += 16;
                v516 += 0x100;
            } while (n != 32);
            i0 = 0;
            v750 = CONCAT(v517 & 0xffffffff | (v517 & 0xffffffff) * 0x100000000, v517 & 0xffffffff | (v517 & 0xffffffff) * 0x100000000);
            v751 = (__m128i)(CONCAT(~(0xffffffff << ((char)v517 & 31)) | ~(0xffffffff << ((char)v517 & 31)) * 0x100000000, ~(0xffffffff << ((char)v517 & 31)) | ~(0xffffffff << ((char)v517 & 31)) * 0x100000000));
            do
            {
                v752 = __dirty_unsupported_Iop_Sh32Ux4(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), *(int128_t *)((char *)&v34 + i0)), 16), v750);
                v753 = __dirty_unsupported_Iop_Sh32Ux4(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), *(int128_t *)((char *)&v34 + i0)), 16), v750);
                v754 = CONCAT(21642340209583, 21642340209583);
                v756 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v753), (unsigned long long)v754), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v753), (unsigned long long)v754), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v753, 1), (unsigned long long)(v754 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v753, 1), (unsigned long long)(v754 >> 64)), 24))));
                v758 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v752), (unsigned long long)v754), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v752), (unsigned long long)v754), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v752, 1), (unsigned long long)(v754 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v752, 1), (unsigned long long)(v754 >> 64)), 24))));
                *(__m128i *)((char *)&v34 + i0) = CatEvenLanesV(_mm_and_si128(_mm_add_epi32(_mm_add_epi32(v758, _mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(1664), _mm_add_epi32(v752, _mm_mullo_epi32(v758, _mm_set1_epi32(-0xd01)))), _mm_add_epi32(v752, _mm_mullo_epi32(v758, _mm_set1_epi32(-0xd01)))), 31)), _mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(4993), _mm_add_epi32(v752, _mm_mullo_epi32(v758, _mm_set1_epi32(-0xd01)))), _mm_add_epi32(v752, _mm_mullo_epi32(v758, _mm_set1_epi32(-0xd01)))), 31)), v751), _mm_and_si128(_mm_add_epi32(_mm_add_epi32(v756, _mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(1664), _mm_add_epi32(v753, _mm_mullo_epi32(v756, _mm_set1_epi32(-0xd01)))), _mm_add_epi32(v753, _mm_mullo_epi32(v756, _mm_set1_epi32(-0xd01)))), 31)), _mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(4993), _mm_add_epi32(v753, _mm_mullo_epi32(v756, _mm_set1_epi32(-0xd01)))), _mm_add_epi32(v753, _mm_mullo_epi32(v756, _mm_set1_epi32(-0xd01)))), 31)), v751));
                i0 += 16;
            } while (i0 != 0x200);
            v759 = 0;
            v760 = 0;
            v761 = 0;
            v762 = (char *)a0 + v0->field_38;
            do
            {
                v763 = *(short *)((char *)&v34 + v759);
                v764 = v761 + v517;
                if (63 < (int)v764)
                {
                    *v762 = v763 << ((char)v761 & 63) | v760;
                    v762 += 1;
                    v765 = v764 & 0xffffffff;
                    if ((unsigned int)v764 == 64)
                    {
                        v760 = 0;
                        v766 = arm64g_calculate_condition(3, v765, 64, 0);
                        if (!(v766 & 1))
                            goto LABEL_a882b6;
                    }
                    else
                    {
                        v760 = v763 >> ((char)-v761 & 63);
                        v767 = arm64g_calculate_condition(3, v765, 64, 0);
                        if (!(v767 & 1))
                        {
LABEL_a882b6:
                            v761 = (unsigned int)v764 - 64;
                            continue;
                        }
                    }
                    v761 = 0;
                    continue;
                }
                else
                {
                    v760 |= v763 << ((char)v761 & 63);
                    v761 = v764;
                }
            } while ((v759 += 2, 0x1fe > v759 - 2));
            v768 = 1;
            goto LABEL_a882ec;
        }
    }
LABEL_a882e8:
    v768 = 0;
    v34 = v33;
LABEL_a882ec:
    sub_a66ec0(&v35, 33);
    sub_a66ec0(&v34, 0x200);
    if (*(long long *)&g_10002b0 == v38)
        return v768;
    ___stack_chk_fail();
}
