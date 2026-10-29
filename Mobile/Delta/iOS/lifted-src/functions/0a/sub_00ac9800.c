/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac9800..0xacba80 (8832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_ac9800(unsigned int *a0)
{
    unsigned int *v28;  // x0
    unsigned long long v29;  // x2
    unsigned int v38;  // w25
    unsigned int v127;  // w20
    unsigned int v128;  // w8
    unsigned int v129;  // w1
    unsigned int v130;  // w9
    unsigned int v131;  // w21
    unsigned int v132;  // w9
    unsigned int v133;  // w19
    unsigned int v134;  // w0
    unsigned int v135;  // w11
    unsigned int v136;  // w24
    unsigned long long i;  // x2
    unsigned int v137;  // w9
    unsigned int v138;  // w28
    unsigned int v139;  // w8
    unsigned int v140;  // w27
    unsigned int v141;  // w25
    unsigned int v142;  // w11
    unsigned int v143;  // w26
    unsigned int v144;  // w20
    unsigned int v145;  // w8
    unsigned int v146;  // w10
    unsigned int v147;  // w3
    unsigned int v148;  // w17
    unsigned int v149;  // w8
    unsigned int v150;  // w16
    unsigned int v151;  // w2
    unsigned int v152;  // w21
    unsigned int v153;  // w11
    unsigned int v154;  // w15
    unsigned int v155;  // w13
    unsigned int v156;  // w8
    unsigned int *v40;  // x1
    unsigned int v157;  // w9
    unsigned int v158;  // w26
    unsigned int v159;  // w9
    unsigned int v160;  // w20
    unsigned int v161;  // w19
    unsigned int v162;  // w0
    unsigned int v163;  // w28
    unsigned int v164;  // w11
    unsigned int v165;  // w24
    unsigned int v166;  // w9
    unsigned int v41;  // w8
    unsigned int v167;  // w27
    unsigned int v168;  // w8
    unsigned int v169;  // w1
    unsigned int v170;  // w28
    unsigned int v171;  // w14
    unsigned int v172;  // w25
    unsigned int v173;  // w10
    unsigned int v174;  // w11
    unsigned int v175;  // w21
    unsigned int v176;  // w8
    unsigned long v42;  // x9
    unsigned int v177;  // w4
    unsigned int v178;  // w16
    unsigned int v179;  // w8
    unsigned int v180;  // w6
    unsigned int v181;  // w26
    unsigned int v182;  // w24
    unsigned int v183;  // w10
    unsigned int v184;  // w0
    unsigned int v185;  // w8
    unsigned int v186;  // w9
    unsigned long v43;  // x10
    unsigned int v187;  // w23
    unsigned int v188;  // w9
    unsigned int v189;  // w20
    unsigned int v190;  // w19
    unsigned int v191;  // w13
    unsigned int v192;  // w21
    unsigned int v193;  // w10
    unsigned int v194;  // w17
    unsigned int v195;  // w24
    unsigned int v196;  // w9
    unsigned int v44;  // w9
    unsigned int v197;  // w0
    unsigned int v198;  // w8
    unsigned int v199;  // w25
    unsigned int v200;  // w22
    unsigned int v201;  // w10
    unsigned int v202;  // w8
    unsigned int v203;  // w1
    unsigned int v204;  // w20
    unsigned int v205;  // w23
    unsigned int v206;  // w6
    unsigned long v45;  // x11
    unsigned int v207;  // w26
    unsigned int v208;  // w24
    unsigned int v209;  // w12
    unsigned int v210;  // w1
    unsigned int v211;  // w2
    unsigned int v212;  // w14
    unsigned int v213;  // w7
    unsigned int v214;  // w10
    unsigned int v215;  // w20
    unsigned int v216;  // w8
    unsigned long v46;  // x12
    unsigned int v217;  // w11
    unsigned int v218;  // w0
    unsigned int v219;  // w1
    unsigned int v220;  // w20
    unsigned int v221;  // w23
    unsigned int v222;  // w21
    unsigned int v223;  // w20
    unsigned int v224;  // w12
    unsigned int v225;  // w23
    unsigned int v226;  // w19
    unsigned int *v30;  // x8
    unsigned int v47;  // w0
    unsigned int v227;  // w25
    unsigned int v228;  // w26
    unsigned int v229;  // w16
    unsigned int v230;  // w27
    unsigned int v231;  // w6
    unsigned int v232;  // w8
    unsigned int v233;  // w0
    unsigned int v234;  // w9
    unsigned int v235;  // w1
    unsigned int v236;  // w22
    unsigned int v48;  // w15
    unsigned int v237;  // w1
    unsigned int v238;  // w13
    unsigned int v239;  // w25
    unsigned int v240;  // w26
    unsigned int v241;  // w7
    unsigned int v242;  // w8
    unsigned int v243;  // w28
    unsigned int v244;  // w21
    unsigned int v245;  // w26
    unsigned int v246;  // w2
    unsigned int v49;  // w7
    unsigned int v247;  // w25
    unsigned int v248;  // w15
    unsigned int v249;  // w8
    unsigned int v250;  // w19
    unsigned int v251;  // w20
    unsigned int v252;  // w21
    unsigned int v253;  // w23
    unsigned int v254;  // w20
    unsigned int v255;  // w12
    unsigned int v256;  // w1
    unsigned int v50;  // w6
    unsigned int v257;  // w16
    unsigned int v258;  // w0
    unsigned int v259;  // w25
    unsigned int v260;  // w20
    unsigned int v261;  // w7
    unsigned int v262;  // w22
    unsigned int v263;  // w10
    unsigned int v264;  // w6
    unsigned int v265;  // w17
    unsigned int v266;  // w7
    unsigned long v51;  // x10
    unsigned int v267;  // w8
    unsigned int v268;  // w20
    unsigned int v269;  // w2
    unsigned int v270;  // w13
    unsigned int v271;  // w11
    unsigned int v272;  // w9
    unsigned int v273;  // w21
    unsigned int v274;  // w19
    unsigned int v275;  // w3
    unsigned int v276;  // w4
    unsigned long v52;  // x11
    unsigned int v277;  // w0
    unsigned int v278;  // w28
    unsigned int v279;  // w1
    unsigned int v280;  // w23
    unsigned int v281;  // w19
    unsigned int v282;  // w21
    unsigned int v283;  // w10
    unsigned int v284;  // w12
    unsigned int v285;  // w23
    unsigned int v286;  // w8
    unsigned int v53;  // w10
    unsigned int v287;  // w20
    unsigned int v288;  // w15
    unsigned int v289;  // w27
    unsigned int v290;  // w24
    unsigned int v291;  // w6
    unsigned int v292;  // w9
    unsigned int v293;  // w7
    unsigned int v294;  // w0
    unsigned int v295;  // w9
    unsigned int v296;  // w19
    unsigned int v54;  // w26
    unsigned int v297;  // w22
    unsigned int v298;  // w1
    unsigned int v299;  // w12
    unsigned int v300;  // w11
    unsigned int v301;  // w14
    unsigned int v302;  // w10
    unsigned int v303;  // w26
    unsigned int v304;  // w24
    unsigned int v305;  // w3
    unsigned int v306;  // w2
    unsigned long v55;  // x12
    unsigned int v307;  // w8
    unsigned int v308;  // w17
    unsigned int v309;  // w20
    unsigned int v310;  // w21
    unsigned int v311;  // w23
    unsigned int v312;  // w19
    unsigned int v313;  // w5
    unsigned int v314;  // w12
    unsigned int v315;  // w11
    unsigned int v316;  // w10
    unsigned long v56;  // x13
    unsigned int v317;  // w7
    unsigned int v318;  // w13
    unsigned int v319;  // w0
    unsigned int v320;  // w10
    unsigned int v321;  // w20
    unsigned int v322;  // w9
    unsigned int v323;  // w22
    unsigned int v324;  // w28
    unsigned int v325;  // w24
    unsigned int v326;  // w23
    unsigned int v31;  // w9
    unsigned int v57;  // w4
    unsigned int v327;  // w8
    unsigned int v328;  // w10
    unsigned int v329;  // w2
    unsigned int v330;  // w20
    unsigned int v331;  // w1
    unsigned int v332;  // w20
    unsigned int v333;  // w0
    unsigned int v334;  // w11
    unsigned int v335;  // w8
    unsigned int v336;  // w9
    unsigned int v58;  // w3
    unsigned int v337;  // w1
    unsigned int v338;  // w7
    unsigned int v339;  // w13
    unsigned int v340;  // w16
    unsigned int v341;  // w4
    unsigned int v342;  // w21
    unsigned int v343;  // w22
    unsigned int v344;  // w20
    unsigned int v345;  // w15
    unsigned int v346;  // w27
    unsigned int v59;  // w17
    unsigned int v347;  // w6
    unsigned int v348;  // w21
    unsigned int v349;  // w10
    unsigned int v350;  // w3
    unsigned int v351;  // w26
    unsigned int v352;  // w1
    unsigned int v353;  // w0
    unsigned int v354;  // w20
    unsigned int v355;  // w25
    unsigned int v356;  // w9
    unsigned long v60;  // x11
    unsigned int v357;  // w10
    unsigned int v358;  // w12
    unsigned int v359;  // w1
    unsigned int v360;  // w19
    unsigned int v361;  // w11
    unsigned int v362;  // w23
    unsigned int v363;  // w13
    unsigned int v364;  // w24
    unsigned int v365;  // w20
    unsigned int v366;  // w0
    unsigned long v61;  // x12
    unsigned int v367;  // w26
    unsigned int v368;  // w2
    unsigned int v369;  // w13
    unsigned int v370;  // w11
    unsigned int v371;  // w21
    unsigned int v372;  // w15
    unsigned int v373;  // w27
    unsigned int v374;  // w17
    unsigned int v375;  // w22
    unsigned int v376;  // w10
    unsigned int v62;  // w16
    unsigned int v377;  // w21
    unsigned int v378;  // w27
    unsigned int v379;  // w3
    unsigned int v380;  // w1
    unsigned int v381;  // w8
    unsigned int v382;  // w25
    unsigned int v383;  // w16
    unsigned int v384;  // w9
    unsigned int v385;  // w6
    unsigned int v386;  // w22
    unsigned int v63;  // w2
    unsigned int v387;  // w0
    unsigned int v388;  // w15
    unsigned int v389;  // w8
    unsigned int v390;  // w28
    unsigned int v391;  // w22
    unsigned int v392;  // w24
    unsigned int v393;  // w7
    unsigned int v394;  // w20
    unsigned int v395;  // w25
    unsigned int v396;  // w21
    unsigned long v64;  // x11
    unsigned int v397;  // w0
    unsigned int v398;  // w10
    unsigned int v399;  // w22
    unsigned int v400;  // w9
    unsigned int v401;  // w13
    unsigned int v402;  // w2
    unsigned int v403;  // w27
    unsigned int v404;  // w6
    unsigned int v405;  // w28
    unsigned int v406;  // w11
    unsigned long v65;  // x13
    unsigned int v407;  // w25
    unsigned int v408;  // w26
    unsigned int v409;  // w14
    unsigned int v410;  // w10
    unsigned int v411;  // w15
    unsigned int v412;  // w24
    unsigned int v413;  // w1
    unsigned int v414;  // w20
    unsigned int v415;  // w3
    unsigned int v416;  // w10
    unsigned int v66;  // w14
    unsigned int v417;  // w9
    unsigned int v418;  // w5
    unsigned int v419;  // w8
    unsigned int v420;  // w16
    unsigned int v421;  // w12
    unsigned int v422;  // w21
    unsigned int v423;  // w0
    unsigned int v424;  // w15
    unsigned int v425;  // w8
    unsigned int v426;  // w17
    unsigned int v32;  // w5
    unsigned long v67;  // x11
    unsigned int v427;  // w19
    unsigned int v428;  // w25
    unsigned int v429;  // w10
    unsigned int v430;  // w12
    unsigned int v431;  // w17
    unsigned int v432;  // w1
    unsigned int v433;  // w22
    unsigned int v434;  // w17
    unsigned int v435;  // w5
    unsigned int v436;  // w8
    unsigned int v68;  // w13
    unsigned int v437;  // w20
    unsigned int v438;  // w23
    unsigned int v439;  // w6
    unsigned int v440;  // w26
    unsigned int v441;  // w11
    unsigned int v442;  // w12
    unsigned int v443;  // w24
    unsigned int v444;  // w1
    unsigned int v445;  // w0
    unsigned int v446;  // w12
    unsigned long v69;  // x1
    unsigned int v447;  // w2
    unsigned int v448;  // w3
    unsigned int v449;  // w9
    unsigned int v450;  // w20
    unsigned int v451;  // w27
    unsigned int v452;  // w12
    unsigned int v453;  // w24
    unsigned int v454;  // w15
    unsigned int v455;  // w5
    unsigned int v456;  // w15
    unsigned long v70;  // x19
    unsigned int v457;  // w21
    unsigned int v458;  // w3
    unsigned int v459;  // w17
    unsigned int v460;  // w6
    unsigned int v461;  // w22
    unsigned int v462;  // w12
    unsigned int v463;  // w25
    unsigned int v464;  // w5
    unsigned int v465;  // w1
    unsigned int v466;  // w12
    unsigned int v71;  // w1
    unsigned int v467;  // w4
    unsigned int v468;  // w16
    unsigned int v469;  // w11
    unsigned int v470;  // w24
    unsigned int v471;  // w20
    unsigned int v472;  // w16
    unsigned int v473;  // w0
    unsigned int v474;  // w25
    unsigned int v475;  // w6
    unsigned int v476;  // w0
    unsigned int v72;  // w5
    unsigned int v477;  // w15
    unsigned int v478;  // w14
    unsigned int v479;  // w8
    unsigned int v480;  // w9
    unsigned int v481;  // w3
    unsigned int v482;  // w21
    unsigned int v483;  // w14
    unsigned int v484;  // w22
    unsigned int v485;  // w1
    unsigned int v486;  // w14
    unsigned int v73;  // w21
    unsigned int v487;  // w12
    unsigned int v488;  // w5
    unsigned int v489;  // w7
    unsigned int v490;  // w7
    unsigned int v491;  // w5
    unsigned int v492;  // w20
    unsigned int v493;  // w22
    unsigned int v494;  // w22
    unsigned int v495;  // w20
    unsigned int v496;  // w6
    unsigned int v74;  // w7
    unsigned int v497;  // w0
    unsigned int v498;  // w17
    unsigned int v499;  // w21
    unsigned int v500;  // w13
    unsigned int v501;  // w19
    unsigned int v502;  // w21
    unsigned int v503;  // w22
    unsigned int v504;  // w1
    unsigned int v505;  // w7
    unsigned int v506;  // w14
    unsigned int v75;  // w19
    unsigned int v507;  // w15
    unsigned int v508;  // w22
    unsigned int v509;  // w21
    unsigned int v510;  // w9
    unsigned int v511;  // w22
    unsigned int v512;  // w24
    unsigned int v513;  // w12
    unsigned int v514;  // w23
    unsigned int v515;  // w0
    unsigned int v516;  // w22
    unsigned int v76;  // w8
    unsigned int v517;  // w6
    unsigned int v518;  // w2
    unsigned int v519;  // w27
    unsigned int v520;  // w3
    unsigned int v521;  // w12
    unsigned int v522;  // w2
    unsigned int v523;  // w23
    unsigned int v524;  // w19
    unsigned int v525;  // w25
    unsigned int v526;  // w20
    unsigned int v33;  // w21
    unsigned int v77;  // w9
    unsigned int v527;  // w19
    unsigned int v528;  // w1
    unsigned int v529;  // w13
    unsigned int v530;  // w14
    unsigned int v531;  // w16
    unsigned int v532;  // w21
    unsigned int v533;  // w24
    unsigned int v534;  // w2
    unsigned int v535;  // w10
    unsigned int v536;  // w13
    unsigned int v78;  // w20
    unsigned int v537;  // w21
    unsigned int v538;  // w7
    unsigned int v539;  // w6
    unsigned int v540;  // w9
    unsigned int v541;  // w13
    unsigned int v542;  // w13
    unsigned int v543;  // w22
    unsigned int v544;  // w0
    unsigned int v545;  // w23
    unsigned int v546;  // w25
    unsigned int v79;  // w22
    unsigned int v547;  // w1
    unsigned int v548;  // w0
    unsigned int v549;  // w19
    unsigned int v550;  // w17
    unsigned int v551;  // w4
    unsigned int v552;  // w20
    unsigned int v553;  // w4
    unsigned int v554;  // w19
    unsigned int v555;  // w23
    unsigned int v556;  // w7
    unsigned int v80;  // w24
    unsigned int v557;  // w23
    unsigned int v558;  // w6
    unsigned int v559;  // w19
    unsigned int v560;  // w7
    unsigned int v561;  // w21
    unsigned int v562;  // w22
    unsigned int v563;  // w22
    unsigned int v564;  // w20
    unsigned int v565;  // w1
    unsigned int v566;  // w24
    unsigned int v81;  // w25
    unsigned int v567;  // w0
    unsigned int v568;  // w21
    unsigned int v569;  // w22
    unsigned int v570;  // w19
    unsigned int v571;  // w22
    unsigned int v572;  // w7
    unsigned int v573;  // w6
    unsigned int v574;  // w24
    unsigned int v575;  // w19
    unsigned int v576;  // w23
    unsigned int v82;  // w19
    unsigned int v577;  // w0
    unsigned int v578;  // w20
    unsigned int v579;  // w21
    unsigned int v580;  // w20
    unsigned int v581;  // w23
    unsigned int v582;  // w25
    unsigned int v583;  // w3
    unsigned int v584;  // w24
    unsigned int v585;  // w7
    unsigned int v586;  // w1
    unsigned int v83;  // w9
    unsigned int v587;  // w22
    unsigned int v588;  // w19
    unsigned int v589;  // w7
    unsigned int v590;  // w6
    unsigned int v591;  // w25
    unsigned int v592;  // w24
    unsigned int v593;  // w6
    unsigned int v594;  // w0
    unsigned int v595;  // w20
    unsigned int v596;  // w0
    unsigned int v84;  // w22
    unsigned int v597;  // w21
    unsigned int v598;  // w15
    unsigned int v599;  // w19
    unsigned int v600;  // w17
    unsigned int v601;  // w23
    unsigned int v602;  // w1
    unsigned int v603;  // w19
    unsigned int v604;  // w14
    unsigned int v605;  // w22
    unsigned int v606;  // w17
    unsigned int v85;  // w0
    unsigned int v607;  // w16
    unsigned int v608;  // w20
    unsigned int v609;  // w21
    unsigned int v610;  // w16
    unsigned int v611;  // w11
    unsigned int v612;  // w7
    unsigned int v613;  // w0
    unsigned int v614;  // w11
    unsigned int v615;  // w3
    unsigned int v616;  // w19
    unsigned int v86;  // w28
    unsigned int v617;  // w9
    unsigned int v618;  // w3
    unsigned int v619;  // w1
    unsigned int v620;  // w19
    unsigned int v621;  // w6
    unsigned int v622;  // w9
    unsigned int v623;  // w0
    unsigned int v624;  // w5
    unsigned int v625;  // w10
    unsigned int v626;  // w16
    unsigned int v34;  // w22
    unsigned int v87;  // w0
    unsigned int v627;  // w7
    unsigned int v628;  // w5
    unsigned int v629;  // w0
    unsigned int v630;  // w20
    unsigned int v631;  // w19
    unsigned int v632;  // w19
    unsigned int v633;  // w1
    unsigned int v634;  // w20
    unsigned int v635;  // w10
    unsigned int v636;  // w6
    unsigned int v88;  // w22
    unsigned int v637;  // w4
    unsigned int v638;  // w7
    unsigned int v639;  // w16
    unsigned int v640;  // w4
    unsigned int v641;  // w3
    unsigned int v642;  // w0
    unsigned int v643;  // w15
    unsigned int v644;  // w17
    unsigned int v645;  // w5
    unsigned int v646;  // w4
    unsigned int v89;  // w24
    unsigned int v647;  // w17
    unsigned int v648;  // w8
    unsigned int v649;  // w14
    unsigned int v650;  // w10
    unsigned int v651;  // w3
    unsigned int v652;  // w1
    unsigned int v653;  // w0
    unsigned int v654;  // w16
    unsigned int v655;  // w11
    unsigned int v656;  // w12
    unsigned int v90;  // w8
    unsigned int v657;  // w15
    unsigned int v658;  // w17
    unsigned int v659;  // w12
    unsigned int *v660;  // x8
    unsigned int v91;  // w23
    unsigned int v92;  // w0
    unsigned int v93;  // w22
    unsigned int v94;  // w21
    unsigned int v95;  // w7
    unsigned int v96;  // w25
    unsigned int v35;  // w13
    unsigned int v97;  // w20
    unsigned int v98;  // w7
    unsigned int v99;  // w9
    unsigned int v100;  // w19
    unsigned int v101;  // w28
    unsigned int v102;  // w27
    unsigned int v103;  // w9
    unsigned int v104;  // w11
    unsigned int v105;  // w0
    unsigned int v106;  // w9
    unsigned int v36;  // w23
    unsigned int v107;  // w28
    unsigned int v108;  // w21
    unsigned int v109;  // w8
    unsigned int v110;  // w6
    unsigned int v111;  // w9
    unsigned int v112;  // w10
    unsigned int v113;  // w10
    unsigned int v114;  // w25
    unsigned int v115;  // w24
    unsigned int v116;  // w22
    unsigned int v37;  // w24
    unsigned int v117;  // w20
    unsigned int v118;  // w12
    unsigned int v119;  // w19
    unsigned int v120;  // w8
    unsigned int v121;  // w8
    unsigned int v122;  // w28
    unsigned int v123;  // w3
    unsigned int v124;  // w26
    unsigned int v125;  // w11
    unsigned int v126;  // w4
    unsigned int v0;  // [bp-0xd8]
    unsigned int v1;  // [bp-0xd4]
    unsigned int v2;  // [bp-0xd0]
    unsigned int v3;  // [bp-0xcc]
    unsigned int v4;  // [bp-0xc8]
    unsigned int v5;  // [bp-0xc4]
    unsigned int v6;  // [bp-0xc0]
    unsigned int v7;  // [bp-0xbc]
    unsigned int v8;  // [bp-0xb8]
    unsigned int v9;  // [bp-0xb4]
    unsigned int v10;  // [bp-0xb0]
    unsigned int v11;  // [bp-0xac]
    unsigned int v12;  // [bp-0xa8]
    unsigned int v13;  // [bp-0xa4]
    unsigned long long v14;  // [bp-0xa0]
    unsigned int v15;  // [bp-0x94]
    unsigned int v16;  // [bp-0x90]
    unsigned int v17;  // [bp-0x8c]
    unsigned int v18;  // [bp-0x88]
    unsigned int v19;  // [bp-0x84]
    unsigned int v20;  // [bp-0x80]
    unsigned int v21;  // [bp-0x7c]
    unsigned int v22;  // [bp-0x78]
    unsigned int v23;  // [bp-0x74]
    unsigned int *v24;  // [bp-0x70]
    unsigned int v25;  // [bp-0x64]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v28 = a0;
    if (v29)
    {
        v30 = a0;
        v31 = *v30;
        v32 = v30[1];
        v33 = v30[2];
        v34 = v30[3];
        v35 = v30[4];
        v36 = v30[5];
        v37 = v30[6];
        v38 = v30[7];
        do
        {
            v11 = v38;
            v12 = v36;
            v21 = v37;
            v22 = v33;
            v13 = v34;
            v23 = v32;
            v25 = v31;
            v24 = v40;
            v14 = i;
            v41 = __ROL__(v31, 12);
            v42 = *v40;
            v43 = v40[1];
            v44 = (((((v42 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v42 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v42 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v42 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v45 = v40[2];
            v46 = v40[3];
            v47 = (((((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v48 = (((((v45 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v45 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v45 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v45 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v49 = __ROL__(v41 + v35 + 2043430169, 7);
            v50 = (((((v46 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v46 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v46 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v46 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v51 = v40[4];
            v52 = v40[5];
            v53 = (((((v51 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v51 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v51 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v51 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v54 = v35;
            v55 = v40[6];
            v56 = v40[7];
            v57 = (((((v52 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v52 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v52 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v52 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v58 = (((((v55 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v55 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v55 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v55 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v59 = (((((v56 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v56 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v56 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v56 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v60 = v40[8];
            v61 = v40[9];
            v62 = (((((v60 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v60 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v60 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v60 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v63 = (((((v61 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v61 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v61 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v61 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v64 = v40[10];
            v65 = v40[11];
            v66 = (((((v64 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v64 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v64 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v64 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v20 = v40[12];
            v67 = v40[13];
            v68 = (((((v65 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v65 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v65 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v65 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v19 = (((((v67 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v67 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v67 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v67 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v69 = v24[14];
            v70 = v24[15];
            v71 = (((((v69 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v69 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v69 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v69 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v72 = (((((v70 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v70 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v70 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v70 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v73 = __ROL__(v23, 9);
            v74 = (v32 ^ v25 ^ v33) + v34 + (v49 ^ v41) + (v53 ^ v44);
            v75 = v38 + (v36 ^ v54 ^ v37) + v49 + v44;
            v76 = __ROL__(v36, 19);
            v77 = v44 ^ (v19 * 0x8000 | v19 >> 0x11) ^ v59;
            v78 = (v75 * 0x20000 | v75 >> 15) ^ (v75 * 0x200 | v75 >> 23) ^ v75;
            v79 = __ROL__(v74, 12);
            v16 = (v50 * 128 | v50 >> 25) ^ (v77 * 0x800000 | v77 >> 9) ^ (v77 * 0x8000 | v77 >> 0x11) ^ v66 ^ v77;
            v80 = __ROL__(v78 + v79 + 4086860338, 7);
            v10 = v54;
            v81 = __ROL__(v25, 9);
            v82 = __ROL__(v54, 19);
            v83 = (v73 ^ v25 ^ v74) + v22 + (v57 ^ v47) + (v80 ^ v79);
            v84 = v47 + v21 + (v76 ^ v54 ^ v78) + v80;
            v85 = v47 ^ (v71 * 0x8000 | v71 >> 0x11) ^ v62;
            v86 = (v84 * 0x20000 | v84 >> 15) ^ (v84 * 0x200 | v84 >> 23) ^ v84;
            v87 = __ROL__(v83, 12);
            v88 = __ROL__(v87 + 3878753381 + v86, 7);
            v89 = v48 + v76 + (v78 ^ v82 ^ v86) + v88;
            v90 = (v58 ^ v48) + v73 + (v74 ^ v81 ^ v83) + (v88 ^ v87);
            v91 = __ROL__(v74, 9);
            v92 = __ROL__(v78, 19);
            v93 = v48 ^ (v72 * 0x8000 | v72 >> 0x11) ^ v63;
            v94 = (v89 * 0x20000 | v89 >> 15) ^ (v89 * 0x200 | v89 >> 23) ^ v89;
            v95 = __ROL__(v90, 12);
            v17 = (v53 * 128 | v53 >> 25) ^ (v85 * 0x800000 | v85 >> 9) ^ (v85 * 0x8000 | v85 >> 0x11) ^ v68 ^ v85;
            w30 = __ROL__(v95 + 3462539467 + v94, 7);
            v96 = __ROL__(v83, 9);
            v97 = __ROL__(v86, 19);
            v98 = (v59 ^ v50) + v81 + (v83 ^ v91 ^ v90) + (w30 ^ v95);
            v99 = v50 + v82 + (v86 ^ v92 ^ v94) + w30;
            v100 = v50 ^ (v16 * 0x8000 | v16 >> 0x11) ^ v66;
            v101 = __ROL__(v98, 12);
            v102 = (v99 * 0x20000 | v99 >> 15) ^ (v99 * 0x200 | v99 >> 23) ^ v99;
            v103 = __ROL__(v101 + 2630111639 + v102, 7);
            v104 = __ROL__(v90, 9);
            v105 = (v62 ^ v53) + v91 + (v90 ^ v96 ^ v98) + (v103 ^ v101);
            v106 = v53 + v92 + (v94 ^ v97 ^ v102) + v103;
            v107 = __ROL__(v94, 19);
            v108 = v53 ^ (v17 * 0x8000 | v17 >> 0x11) ^ v68;
            v109 = __ROL__(v105, 12);
            v110 = (((((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v18 = (v57 * 128 | v57 >> 25) ^ (v93 * 0x800000 | v93 >> 9) ^ (v93 * 0x8000 | v93 >> 0x11) ^ v110 ^ v93;
            v111 = (v106 * 0x20000 | v106 >> 15) ^ (v106 * 0x200 | v106 >> 23) ^ v106;
            v112 = __ROL__(v109 + 965255983 + v111, 7);
            v113 = v97 + v57 + (v102 ^ v107 ^ v111) + v112;
            v114 = __ROL__(v102, 19);
            v115 = (v63 ^ v57) + v96 + (v98 ^ v104 ^ v105) + (v112 ^ v109);
            v116 = v57 ^ (v18 * 0x8000 | v18 >> 0x11) ^ v110;
            v117 = __ROL__(v115, 12);
            w30 = __ROL__(v98, 9);
            v118 = v19;
            v5 = (v58 * 128 | v58 >> 25) ^ (v100 * 0x800000 | v100 >> 9) ^ (v100 * 0x8000 | v100 >> 0x11) ^ v118 ^ v100;
            v119 = (v113 * 0x20000 | v113 >> 15) ^ (v113 * 0x200 | v113 >> 23) ^ v113;
            v120 = __ROL__(v117 + 1930511966 + v119, 7);
            v121 = v107 + v58 + (v111 ^ v114 ^ v119) + v120;
            v122 = __ROL__(v111, 19);
            v123 = v58 ^ (v5 * 0x8000 | v5 >> 0x11) ^ v118;
            v124 = (v66 ^ v58) + v104 + (v105 ^ w30 ^ v115) + (v120 ^ v117);
            v125 = __ROL__(v124, 12);
            v126 = v71;
            v127 = __ROL__(v105, 9);
            v4 = (v59 * 128 | v59 >> 25) ^ (v108 * 0x800000 | v108 >> 9) ^ (v108 * 0x8000 | v108 >> 0x11) ^ v71 ^ v108;
            v128 = (v121 * 0x20000 | v121 >> 15) ^ (v121 * 0x200 | v121 >> 23) ^ v121;
            v129 = v68;
            v130 = __ROL__(v125 + 3861023932 + v128, 7);
            v131 = __ROL__(v115, 9);
            v132 = v114 + v59 + (v119 ^ v122 ^ v128) + v130;
            w30 = __ROL__(v119, 19);
            v133 = v59 ^ (v4 * 0x8000 | v4 >> 0x11) ^ v126;
            v134 = (v68 ^ v59) + w30 + (v115 ^ v127 ^ v124) + (v130 ^ v125);
            v135 = __ROL__(v134, 12);
            v7 = (v62 * 128 | v62 >> 25) ^ (v116 * 0x800000 | v116 >> 9) ^ (v116 * 0x8000 | v116 >> 0x11) ^ v72 ^ v116;
            v136 = (v132 * 0x20000 | v132 >> 15) ^ (v132 * 0x200 | v132 >> 23) ^ v132;
            v137 = __ROL__(v135 + 3427080569 + v136, 7);
            v138 = __ROL__(v128, 19);
            v139 = v122 + v62 + (v128 ^ w30 ^ v136) + v137;
            v140 = v62 ^ (v7 * 0x8000 | v7 >> 0x11) ^ v72;
            v141 = (v110 ^ v62) + v127 + (v124 ^ v131 ^ v134) + (v137 ^ v135);
            v142 = __ROL__(v141, 12);
            v143 = __ROL__(v124, 9);
            v144 = (v139 * 0x20000 | v139 >> 15) ^ (v139 * 0x200 | v139 >> 23) ^ v139;
            v145 = __ROL__(v142 + 2559193843 + v144, 7);
            v146 = v16;
            v147 = (v63 * 128 | v63 >> 25) ^ (v123 * 0x800000 | v123 >> 9) ^ (v123 * 0x8000 | v123 >> 0x11) ^ v146 ^ v123;
            v148 = v118;
            v149 = w30 + v63 + (v136 ^ v138 ^ v144) + v145;
            w30 = __ROL__(v136, 19);
            v150 = v63 ^ (v147 * 0x8000 | v147 >> 0x11) ^ v146;
            v151 = v146;
            v152 = v131 + (v118 ^ v63) + (v134 ^ v143 ^ v141) + (v145 ^ v142);
            v153 = __ROL__(v152, 12);
            v154 = v17;
            v155 = __ROL__(v134, 9);
            v6 = (v66 * 128 | v66 >> 25) ^ (v133 * 0x800000 | v133 >> 9) ^ (v133 * 0x8000 | v133 >> 0x11) ^ v154 ^ v133;
            v156 = (v149 * 0x20000 | v149 >> 15) ^ (v149 * 0x200 | v149 >> 23) ^ v149;
            v157 = __ROL__(v153 + 823420391 + v156, 7);
            v158 = __ROL__(v141, 9);
            v159 = v138 + v66 + (v144 ^ w30 ^ v156) + v157;
            v160 = __ROL__(v144, 19);
            v161 = v66 ^ (v6 * 0x8000 | v6 >> 0x11) ^ v154;
            v162 = v143 + (v126 ^ v66) + (v141 ^ v155 ^ v152) + (v157 ^ v153);
            v163 = __ROL__(v162, 12);
            v164 = v18;
            v2 = (v68 * 128 | v68 >> 25) ^ (v140 * 0x800000 | v140 >> 9) ^ (v140 * 0x8000 | v140 >> 0x11) ^ v164 ^ v140;
            v165 = (v159 * 0x20000 | v159 >> 15) ^ (v159 * 0x200 | v159 >> 23) ^ v159;
            v166 = __ROL__(v163 + 1646840782 + v165, 7);
            v167 = __ROL__(v156, 19);
            v168 = w30 + v129 + (v156 ^ v160 ^ v165) + v166;
            v169 = v126;
            v170 = v129 ^ (v2 * 0x8000 | v2 >> 0x11) ^ v164;
            v171 = v164;
            v172 = v155 + (v72 ^ v129) + (v152 ^ v158 ^ v162) + (v166 ^ v163);
            v173 = __ROL__(v172, 12);
            v174 = __ROL__(v152, 9);
            v175 = (v168 * 0x20000 | v168 >> 15) ^ (v168 * 0x200 | v168 >> 23) ^ v168;
            v176 = __ROL__(v173 + 3293681564 + v175, 7);
            v177 = v5;
            v20 = (v110 * 128 | v110 >> 25) ^ (v150 * 0x800000 | v150 >> 9) ^ (v150 * 0x8000 | v150 >> 0x11) ^ v177 ^ v150;
            v178 = v151;
            v179 = v160 + v110 + (v165 ^ v167 ^ v175) + v176;
            w30 = __ROL__(v165, 19);
            v180 = v110 ^ (v20 * 0x8000 | v20 >> 0x11) ^ v177;
            v181 = v158 + (v151 ^ v110) + (v162 ^ v174 ^ v172) + (v176 ^ v173);
            v182 = __ROL__(v181, 12);
            v183 = v4;
            v184 = __ROL__(v162, 9);
            v15 = (v148 * 128 | v148 >> 25) ^ (v161 * 0x800000 | v161 >> 9) ^ (v161 * 0x8000 | v161 >> 0x11) ^ v183 ^ v161;
            v185 = (v179 * 0x20000 | v179 >> 15) ^ (v179 * 0x200 | v179 >> 23) ^ v179;
            v186 = __ROL__(v182 + 2292395833 + v185, 7);
            v187 = __ROL__(v172, 9);
            v188 = v167 + v148 + (v175 ^ w30 ^ v185) + v186;
            v189 = __ROL__(v175, 19);
            v190 = v148 ^ (v15 * 0x8000 | v15 >> 0x11) ^ v183;
            v191 = v183;
            v192 = v174 + (v154 ^ v148) + (v172 ^ v184 ^ v181) + (v186 ^ v182);
            v193 = __ROL__(v192, 12);
            v194 = v7;
            v9 = (v126 * 128 | v126 >> 25) ^ (v170 * 0x800000 | v170 >> 9) ^ (v170 * 0x8000 | v170 >> 0x11) ^ v194 ^ v170;
            v195 = (v188 * 0x20000 | v188 >> 15) ^ (v188 * 0x200 | v188 >> 23) ^ v188;
            v196 = __ROL__(v193 + 289824371 + v195, 7);
            v197 = __ROL__(v185, 19);
            v198 = w30 + v169 + (v185 ^ v189 ^ v195) + v196;
            v199 = v169 ^ (v9 * 0x8000 | v9 >> 0x11) ^ v194;
            v200 = v184 + (v171 ^ v169) + (v181 ^ v187 ^ v192) + (v196 ^ v193);
            v201 = __ROL__(v200, 12);
            w30 = __ROL__(v181, 9);
            v202 = (v198 * 0x20000 | v198 >> 15) ^ (v198 * 0x200 | v198 >> 23) ^ v198;
            v203 = __ROL__(v201 + 579648742 + v202, 7);
            v19 = (v72 * 128 | v72 >> 25) ^ (v180 * 0x800000 | v180 >> 9) ^ (v180 * 0x8000 | v180 >> 0x11) ^ v147 ^ v180;
            v204 = v189 + v72 + (v195 ^ v197 ^ v202) + v203;
            v205 = __ROL__(v195, 19);
            v206 = v72 ^ (v19 * 0x8000 | v19 >> 0x11) ^ v147;
            v207 = v187 + (v177 ^ v72) + (v192 ^ w30 ^ v200) + (v203 ^ v201);
            v208 = __ROL__(v207, 12);
            v209 = v6;
            v8 = (v178 * 128 | v178 >> 25) ^ (v190 * 0x800000 | v190 >> 9) ^ (v190 * 0x8000 | v190 >> 0x11) ^ v209 ^ v190;
            v210 = __ROL__(v192, 9);
            v211 = __ROL__(v200, 9);
            v212 = v2;
            v3 = (v154 * 128 | v154 >> 25) ^ (v199 * 0x800000 | v199 >> 9) ^ (v199 * 0x8000 | v199 >> 0x11) ^ v212 ^ v199;
            v213 = __ROL__(v202, 19);
            v214 = (v204 * 0x20000 | v204 >> 15) ^ (v204 * 0x200 | v204 >> 23) ^ v204;
            v215 = __ROL__(v208 + 2643098247 + v214, 7);
            v216 = v197 + v178 + (v202 & v214 | v205 & ~v214) + v215;
            w30 = v178 ^ (v8 * 0x8000 | v8 >> 0x11) ^ v209;
            v217 = v209;
            v218 = w30 + (v191 ^ v178) + ((v207 | v200) & v210 | v207 & v200) + (v215 ^ v208);
            v219 = (v216 * 0x20000 | v216 >> 15) ^ (v216 * 0x200 | v216 >> 23) ^ v216;
            v220 = __ROL__(v218, 12);
            v221 = __ROL__(v220 + 991229199 + v219, 7);
            v222 = __ROL__(v214, 19);
            v223 = v205 + v154 + (v214 & v219 | v213 & ~v219) + v221;
            v224 = v191;
            v225 = v154 ^ (v3 * 0x8000 | v3 >> 0x11) ^ v212;
            v226 = v210 + (v194 ^ v154) + ((v218 | v207) & v211 | v218 & v207) + (v221 ^ v220);
            v227 = __ROL__(v226, 12);
            v228 = __ROL__(v207, 9);
            v229 = v20;
            v230 = v15;
            v16 = (v177 * 128 | v177 >> 25) ^ (w30 * 0x800000 | (unsigned int)(w30) >> 9) ^ (w30 * 0x8000 | (unsigned int)(w30) >> 0x11) ^ v230 ^ w30;
            v17 = (v171 * 128 | v171 >> 25) ^ (v206 * 0x800000 | v206 >> 9) ^ (v206 * 0x8000 | v206 >> 0x11) ^ v229 ^ v206;
            v231 = __ROL__(v218, 9);
            v232 = (v223 * 0x20000 | v223 >> 15) ^ (v223 * 0x200 | v223 >> 23) ^ v223;
            w30 = __ROL__(v227 + 1982458398 + v232, 7);
            v233 = __ROL__(v219, 19);
            v234 = v18;
            v235 = v213 + v234 + (v219 & v232 | v222 & ~v232) + w30;
            v236 = v211 + (v147 ^ v234) + ((v226 | v218) & v228 | v226 & v218) + (w30 ^ v227);
            v237 = (v235 * 0x20000 | v235 >> 15) ^ (v235 * 0x200 | v235 >> 23) ^ v235;
            v238 = v217;
            v239 = __ROL__(v236, 12);
            v240 = __ROL__(v239 + 3964916796 + v237, 7);
            v241 = __ROL__(v232, 19);
            v242 = v234 ^ (v17 * 0x8000 | v17 >> 0x11) ^ v229;
            v243 = v229;
            v244 = v222 + v177 + (v232 & v237 | v233 & ~v237) + v240;
            v245 = v177 ^ (v16 * 0x8000 | v16 >> 0x11) ^ v230;
            v246 = v228 + (v217 ^ v177) + ((v236 | v226) & v231 | v236 & v226) + (v240 ^ v239);
            v247 = __ROL__(v246, 12);
            v248 = v9;
            v0 = (v191 * 128 | v191 >> 25) ^ (v225 * 0x800000 | v225 >> 9) ^ (v225 * 0x8000 | v225 >> 0x11) ^ v248 ^ v225;
            v18 = (v194 * 128 | v194 >> 25) ^ (v242 * 0x800000 | v242 >> 9) ^ (v242 * 0x8000 | v242 >> 0x11) ^ v19 ^ v242;
            v249 = __ROL__(v226, 9);
            v250 = (v244 * 0x20000 | v244 >> 15) ^ (v244 * 0x200 | v244 >> 23) ^ v244;
            v251 = __ROL__(v247 + 3634866297 + v250, 7);
            v252 = __ROL__(v236, 9);
            v253 = __ROL__(v237, 19);
            v254 = v233 + v224 + (v237 & v250 | v241 & ~v250) + v251;
            v255 = v238;
            v256 = v224 ^ (v0 * 0x8000 | v0 >> 0x11) ^ v248;
            v257 = v248;
            v258 = v231 + (v212 ^ v224) + ((v246 | v236) & v249 | v246 & v236) + (v251 ^ v247);
            v259 = (v254 * 0x20000 | v254 >> 15) ^ (v254 * 0x200 | v254 >> 23) ^ v254;
            v260 = __ROL__(v258, 12);
            v261 = __ROL__(v260 + 2974765299 + v259, 7);
            v262 = v241 + v194 + (v250 & v259 | v253 & ~v259) + v261;
            v263 = __ROL__(v250, 19);
            v264 = v194 ^ (v18 * 0x8000 | v18 >> 0x11) ^ v19;
            v265 = v19;
            v266 = v249 + (v243 ^ v194) + ((v258 | v246) & v252 | v258 & v246) + (v261 ^ v260);
            v267 = __ROL__(v266, 12);
            v1 = (v147 * 128 | v147 >> 25) ^ (v245 * 0x800000 | v245 >> 9) ^ (v245 * 0x8000 | v245 >> 0x11) ^ v8 ^ v245;
            v268 = __ROL__(v246, 9);
            v269 = __ROL__(v258, 9);
            v270 = v3;
            v7 = (v238 * 128 | v238 >> 25) ^ (v256 * 0x800000 | v256 >> 9) ^ (v256 * 0x8000 | v256 >> 0x11) ^ v270 ^ v256;
            v271 = __ROL__(v259, 19);
            v272 = (v262 * 0x20000 | v262 >> 15) ^ (v262 * 0x200 | v262 >> 23) ^ v262;
            v273 = __ROL__(v267 + 1654563303 + v272, 7);
            v274 = v253 + v147 + (v259 & v272 | v263 & ~v272) + v273;
            v275 = v147 ^ (v1 * 0x8000 | v1 >> 0x11) ^ v8;
            v276 = v8;
            v277 = v252 + (v230 ^ v147) + ((v266 | v258) & v268 | v266 & v258) + (v273 ^ v267);
            v278 = v257;
            v279 = (v274 * 0x20000 | v274 >> 15) ^ (v274 * 0x200 | v274 >> 23) ^ v274;
            v280 = __ROL__(v277, 12);
            v281 = __ROL__(v280 + 3309126606 + v279, 7);
            v282 = __ROL__(v272, 19);
            v283 = v263 + v255 + (v272 & v279 | v271 & ~v279) + v281;
            v284 = v255 ^ (v7 * 0x8000 | v7 >> 0x11) ^ v270;
            v285 = v268 + (v257 ^ v255) + ((v277 | v266) & v269 | v277 & v266) + (v281 ^ v280);
            v286 = __ROL__(v285, 12);
            v287 = __ROL__(v266, 9);
            v288 = v16;
            v289 = v17;
            v5 = (v243 * 128 | v243 >> 25) ^ (v275 * 0x800000 | v275 >> 9) ^ (v275 * 0x8000 | v275 >> 0x11) ^ v288 ^ v275;
            v6 = (v212 * 128 | v212 >> 25) ^ (v264 * 0x800000 | v264 >> 9) ^ (v264 * 0x8000 | v264 >> 0x11) ^ v289 ^ v264;
            v290 = (v283 * 0x20000 | v283 >> 15) ^ (v283 * 0x200 | v283 >> 23) ^ v283;
            v291 = v0;
            v4 = (v230 * 128 | v230 >> 25) ^ (v284 * 0x800000 | v284 >> 9) ^ (v284 * 0x8000 | v284 >> 0x11) ^ v291 ^ v284;
            v292 = __ROL__(v286 + 2323285917 + v290, 7);
            v293 = __ROL__(v277, 9);
            v294 = __ROL__(v279, 19);
            v295 = v271 + v212 + (v279 & v290 | v282 & ~v290) + v292;
            v296 = v212 ^ (v6 * 0x8000 | v6 >> 0x11) ^ v289;
            v297 = v269 + (v265 ^ v212) + ((v285 | v277) & v287 | v285 & v277) + (v292 ^ v286);
            v298 = (v295 * 0x20000 | v295 >> 15) ^ (v295 * 0x200 | v295 >> 23) ^ v295;
            v299 = v20;
            v300 = __ROL__(v297, 12);
            v301 = __ROL__(v300 + 351604539 + v298, 7);
            v302 = v282 + v299 + (v290 & v298 | v294 & ~v298) + v301;
            v303 = __ROL__(v290, 19);
            v304 = v299 ^ (v5 * 0x8000 | v5 >> 0x11) ^ v288;
            v305 = v288;
            v306 = v287 + (v276 ^ v299) + ((v297 | v285) & v293 | v297 & v285) + (v301 ^ v300);
            v307 = __ROL__(v306, 12);
            v308 = v18;
            v309 = __ROL__(v285, 9);
            v2 = (v257 * 128 | v257 >> 25) ^ (v296 * 0x800000 | v296 >> 9) ^ (v296 * 0x8000 | v296 >> 0x11) ^ v308 ^ v296;
            v310 = __ROL__(v297, 9);
            v311 = (v302 * 0x20000 | v302 >> 15) ^ (v302 * 0x200 | v302 >> 23) ^ v302;
            v312 = __ROL__(v298, 19);
            v313 = v1;
            v20 = (v265 * 128 | v265 >> 25) ^ (v304 * 0x800000 | v304 >> 9) ^ (v304 * 0x8000 | v304 >> 0x11) ^ v313 ^ v304;
            v314 = v15;
            v315 = __ROL__(v307 + 703209078 + v311, 7);
            v316 = v294 + v314 + (v298 & v311 | v303 & ~v311) + v315;
            v317 = v314 ^ (v4 * 0x8000 | v4 >> 0x11) ^ v291;
            v318 = v293 + (v270 ^ v314) + ((v306 | v297) & v309 | v306 & v297) + (v315 ^ v307);
            v319 = (v316 * 0x20000 | v316 >> 15) ^ (v316 * 0x200 | v316 >> 23) ^ v316;
            v320 = __ROL__(v318, 12);
            v321 = __ROL__(v320 + 1406418156 + v319, 7);
            v322 = v303 + v278 + (v311 & v319 | v312 & ~v319) + v321;
            v323 = __ROL__(v311, 19);
            v324 = v270;
            v325 = v278 ^ (v2 * 0x8000 | v2 >> 0x11) ^ v308;
            v326 = v309 + (v289 ^ v278) + ((v318 | v306) & v310 | v318 & v306) + (v321 ^ v320);
            v327 = __ROL__(v326, 12);
            v328 = __ROL__(v306, 9);
            v15 = (v276 * 128 | v276 >> 25) ^ (v317 * 0x800000 | v317 >> 9) ^ (v317 * 0x8000 | v317 >> 0x11) ^ v7 ^ v317;
            v329 = (v322 * 0x20000 | v322 >> 15) ^ (v322 * 0x200 | v322 >> 23) ^ v322;
            v330 = v19;
            v331 = __ROL__(v327 + 2812836312 + v329, 7);
            v332 = v312 + v330 + (v319 & v329 | v323 & ~v329) + v331;
            v333 = __ROL__(v319, 19);
            v334 = v310 + (v305 ^ v330) + ((v326 | v318) & v328 | v326 & v318) + (v331 ^ v327);
            v335 = __ROL__(v334, 12);
            v336 = v330 ^ (v20 * 0x8000 | v20 >> 0x11) ^ v313;
            v337 = __ROL__(v318, 9);
            v338 = v6;
            v19 = (v324 * 128 | v324 >> 25) ^ (v325 * 0x800000 | v325 >> 9) ^ (v325 * 0x8000 | v325 >> 0x11) ^ v338 ^ v325;
            v339 = (v332 * 0x20000 | v332 >> 15) ^ (v332 * 0x200 | v332 >> 23) ^ v332;
            v340 = v276;
            v341 = v291;
            v342 = __ROL__(v335 + 1330705329 + v339, 7);
            v343 = __ROL__(v326, 9);
            v344 = v323 + v340 + (v329 & v339 | v333 & ~v339) + v342;
            v345 = __ROL__(v329, 19);
            v346 = v340 ^ (v15 * 0x8000 | v15 >> 0x11) ^ v7;
            v347 = v7;
            v348 = v328 + (v291 ^ v340) + ((v334 | v326) & v337 | v334 & v326) + (v342 ^ v335);
            v349 = __ROL__(v348, 12);
            v350 = v5;
            v9 = (v289 * 128 | v289 >> 25) ^ (v336 * 0x800000 | v336 >> 9) ^ (v336 * 0x8000 | v336 >> 0x11) ^ v350 ^ v336;
            v351 = (v344 * 0x20000 | v344 >> 15) ^ (v344 * 0x200 | v344 >> 23) ^ v344;
            v352 = __ROL__(v349 + 2661410658 + v351, 7);
            v353 = v333 + v324 + (v339 & v351 | v345 & ~v351) + v352;
            v354 = v324 ^ (v19 * 0x8000 | v19 >> 0x11) ^ v338;
            v355 = __ROL__(v339, 19);
            v356 = v337 + (v308 ^ v324) + ((v348 | v334) & v343 | v348 & v334) + (v352 ^ v349);
            v357 = __ROL__(v356, 12);
            v8 = (v305 * 128 | v305 >> 25) ^ (v346 * 0x800000 | v346 >> 9) ^ (v346 * 0x8000 | v346 >> 0x11) ^ v4 ^ v346;
            v358 = __ROL__(v334, 9);
            v359 = (v353 * 0x20000 | v353 >> 15) ^ (v353 * 0x200 | v353 >> 23) ^ v353;
            v360 = v2;
            v361 = __ROL__(v357 + 1027854021 + v359, 7);
            v362 = (v341 * 128 | v341 >> 25) ^ (v354 * 0x800000 | v354 >> 9) ^ (v354 * 0x8000 | v354 >> 0x11) ^ v360 ^ v354;
            v363 = v17;
            v364 = v345 + v363 + (v351 & v359 | v355 & ~v359) + v361;
            v365 = __ROL__(v348, 9);
            v366 = __ROL__(v351, 19);
            v367 = v363 ^ (v9 * 0x8000 | v9 >> 0x11) ^ v350;
            v368 = v350;
            v369 = v308;
            v370 = v343 + (v313 ^ v363) + ((v356 | v348) & v358 | v356 & v348) + (v361 ^ v357);
            v371 = __ROL__(v370, 12);
            v372 = (v364 * 0x20000 | v364 >> 15) ^ (v364 * 0x200 | v364 >> 23) ^ v364;
            v373 = v16;
            v374 = v347;
            v375 = __ROL__(v371 + 2055708042 + v372, 7);
            v376 = v355 + v373 + (v359 & v372 | v366 & ~v372) + v375;
            v377 = __ROL__(v359, 19);
            v378 = v373 ^ (v8 * 0x8000 | v8 >> 0x11) ^ v4;
            v379 = v4;
            v380 = v358 + (v347 ^ v373) + ((v370 | v356) & v365 | v370 & v356) + (v375 ^ v371);
            v381 = __ROL__(v380, 12);
            v382 = __ROL__(v356, 9);
            v383 = v20;
            v17 = (v308 * 128 | v308 >> 25) ^ (v367 * 0x800000 | v367 >> 9) ^ (v367 * 0x8000 | v367 >> 0x11) ^ v383 ^ v367;
            v384 = (v376 * 0x20000 | v376 >> 15) ^ (v376 * 0x200 | v376 >> 23) ^ v376;
            v385 = v338;
            v386 = __ROL__(v381 + 4111416084 + v384, 7);
            v387 = v366 + v341 + (v372 & v384 | v377 & ~v384) + v386;
            v388 = __ROL__(v372, 19);
            v389 = v365 + (v338 ^ v341) + ((v380 | v370) & v382 | v380 & v370) + (v386 ^ v381);
            v390 = v341 ^ (v362 * 0x8000 | v362 >> 0x11) ^ v360;
            v391 = __ROL__(v389, 12);
            v392 = __ROL__(v370, 9);
            v393 = v15;
            v16 = (v313 * 128 | v313 >> 25) ^ (v378 * 0x800000 | v378 >> 9) ^ (v378 * 0x8000 | v378 >> 0x11) ^ v393 ^ v378;
            v394 = (v387 * 0x20000 | v387 >> 15) ^ (v387 * 0x200 | v387 >> 23) ^ v387;
            v395 = __ROL__(v391 + 3927864873 + v394, 7);
            v396 = __ROL__(v380, 9);
            v397 = v382 + (v368 ^ v369) + ((v389 | v380) & v392 | v389 & v380) + (v395 ^ v391);
            v398 = v377 + v369 + (v384 & v394 | v388 & ~v394) + v395;
            v399 = __ROL__(v384, 19);
            v400 = v369 ^ (v17 * 0x8000 | v17 >> 0x11) ^ v383;
            v401 = v383;
            v402 = v385;
            v403 = __ROL__(v397, 12);
            v404 = v19;
            v405 = (v374 * 128 | v374 >> 25) ^ (v390 * 0x800000 | v390 >> 9) ^ (v390 * 0x8000 | v390 >> 0x11) ^ v404 ^ v390;
            v406 = v9;
            v407 = (v398 * 0x20000 | v398 >> 15) ^ (v398 * 0x200 | v398 >> 23) ^ v398;
            v408 = (v385 * 128 | v385 >> 25) ^ (v400 * 0x800000 | v400 >> 9) ^ (v400 * 0x8000 | v400 >> 0x11) ^ v406 ^ v400;
            v409 = v379;
            v410 = __ROL__(v403 + 3560762451 + v407, 7);
            v411 = v388 + v313 + (v394 & v407 | v399 & ~v407) + v410;
            v412 = __ROL__(v389, 9);
            v413 = __ROL__(v394, 19);
            v414 = v392 + (v379 ^ v313) + ((v397 | v389) & v396 | v397 & v389) + (v410 ^ v403);
            v415 = v368;
            v416 = v313 ^ (v16 * 0x8000 | v16 >> 0x11) ^ v393;
            v417 = v8;
            v18 = (v415 * 128 | v415 >> 25) ^ (v416 * 0x800000 | v416 >> 9) ^ (v416 * 0x8000 | v416 >> 0x11) ^ v417 ^ v416;
            v418 = (v411 * 0x20000 | v411 >> 15) ^ (v411 * 0x200 | v411 >> 23) ^ v411;
            v419 = __ROL__(v414, 12);
            v420 = v360;
            v421 = __ROL__(v419 + 2826557607 + v418, 7);
            v422 = __ROL__(v397, 9);
            v423 = __ROL__(v407, 19);
            v424 = v396 + (v360 ^ v374) + ((v414 | v397) & v412 | v414 & v397) + (v421 ^ v419);
            v425 = v399 + v374 + (v407 & v418 | v413 & ~v418) + v421;
            v426 = v374 ^ (v405 * 0x8000 | v405 >> 0x11) ^ v404;
            v427 = v404;
            v428 = (v425 * 0x20000 | v425 >> 15) ^ (v425 * 0x200 | v425 >> 23) ^ v425;
            v429 = (v409 * 128 | v409 >> 25) ^ (v426 * 0x800000 | v426 >> 9) ^ (v426 * 0x8000 | v426 >> 0x11) ^ v362 ^ v426;
            v430 = __ROL__(v424, 12);
            v431 = __ROL__(v430 + 1358147919 + v428, 7);
            v432 = v413 + v402 + (v418 & v428 | v423 & ~v428) + v431;
            v433 = __ROL__(v414, 9);
            v434 = v412 + (v401 ^ v402) + ((v424 | v414) & v422 | v424 & v414) + (v431 ^ v430);
            v435 = __ROL__(v418, 19);
            v436 = v408;
            v437 = v402 ^ (v408 * 0x8000 | v408 >> 0x11) ^ v406;
            v438 = v406;
            v439 = (v432 * 0x20000 | v432 >> 15) ^ (v432 * 0x200 | v432 >> 23) ^ v432;
            v440 = v17;
            v441 = (v420 * 128 | v420 >> 25) ^ (v437 * 0x800000 | v437 >> 9) ^ (v437 * 0x8000 | v437 >> 0x11) ^ v440 ^ v437;
            v442 = __ROL__(v434, 12);
            v443 = __ROL__(v442 + 2716295838 + v439, 7);
            v444 = __ROL__(v428, 19);
            v445 = v422 + (v393 ^ v415) + ((v434 | v424) & v433 | v434 & v424) + (v443 ^ v442);
            v446 = v423 + v415 + (v428 & v439 | v435 & ~v439) + v443;
            v447 = v417;
            v448 = v415 ^ (v18 * 0x8000 | v18 >> 0x11) ^ v417;
            v449 = v16;
            v450 = (v446 * 0x20000 | v446 >> 15) ^ (v446 * 0x200 | v446 >> 23) ^ v446;
            v451 = (v401 * 128 | v401 >> 25) ^ (v448 * 0x800000 | v448 >> 9) ^ (v448 * 0x8000 | v448 >> 0x11) ^ v449 ^ v448;
            v452 = __ROL__(v445, 12);
            v453 = __ROL__(v424, 9);
            v454 = __ROL__(v452 + 1137624381 + v450, 7);
            v455 = v435 + v409 + (v439 & v450 | v444 & ~v450) + v454;
            v456 = v433 + (v427 ^ v409) + ((v445 | v434) & v453 | v445 & v434) + (v454 ^ v452);
            v457 = __ROL__(v434, 9);
            v458 = __ROL__(v439, 19);
            v459 = v409 ^ (v429 * 0x8000 | v429 >> 0x11) ^ v362;
            v7 = (v393 * 128 | v393 >> 25) ^ (v459 * 0x800000 | v459 >> 9) ^ (v459 * 0x8000 | v459 >> 0x11) ^ v405 ^ v459;
            v460 = __ROL__(v456, 12);
            v461 = (v455 * 0x20000 | v455 >> 15) ^ (v455 * 0x200 | v455 >> 23) ^ v455;
            v462 = __ROL__(v460 + 2275248762 + v461, 7);
            v463 = v444 + v420 + (v450 & v461 | v458 & ~v461) + v462;
            v464 = __ROL__(v445, 9);
            v465 = __ROL__(v450, 19);
            v466 = v453 + (v438 ^ v420) + ((v456 | v445) & v457 | v456 & v445) + (v462 ^ v460);
            v467 = v441;
            v468 = v420 ^ (v441 * 0x8000 | v441 >> 0x11) ^ v440;
            v469 = v436;
            v470 = __ROL__(v466, 12);
            v471 = (v463 * 0x20000 | v463 >> 15) ^ (v463 * 0x200 | v463 >> 23) ^ v463;
            v472 = (v427 * 128 | v427 >> 25) ^ (v468 * 0x800000 | v468 >> 9) ^ (v468 * 0x8000 | v468 >> 0x11) ^ v436 ^ v468;
            v473 = __ROL__(v470 + 255530229 + v471, 7);
            v474 = v458 + v401 + (v461 & v471 | v465 & ~v471) + v473;
            v475 = __ROL__(v456, 9);
            v476 = __ROL__(v461, 19);
            v477 = v457 + (v447 ^ v401) + ((v466 | v456) & v464 | v466 & v456) + (v473 ^ v470);
            v6 = v451;
            v478 = v401 ^ (v451 * 0x8000 | v451 >> 0x11) ^ v449;
            v479 = v449;
            v480 = v18;
            v481 = (v438 * 128 | v438 >> 25) ^ (v478 * 0x800000 | v478 >> 9) ^ (v478 * 0x8000 | v478 >> 0x11) ^ v480 ^ v478;
            v482 = (v474 * 0x20000 | v474 >> 15) ^ (v474 * 0x200 | v474 >> 23) ^ v474;
            v483 = __ROL__(v477, 12);
            v484 = __ROL__(v483 + 511060458 + v482, 7);
            v485 = __ROL__(v466, 9);
            v486 = __ROL__(v471, 19);
            v487 = v464 + (v362 ^ v393) + ((v477 | v466) & v475 | v477 & v466) + (v484 ^ v483);
            v488 = v465 + v393 + (v471 & v482 | v476 & ~v482) + v484;
            v489 = v393 ^ (v7 * 0x8000 | v7 >> 0x11) ^ v405;
            v490 = (v488 * 0x20000 | v488 >> 15) ^ (v488 * 0x200 | v488 >> 23) ^ v488;
            v491 = (v447 * 128 | v447 >> 25) ^ (v489 * 0x800000 | v489 >> 9) ^ (v489 * 0x8000 | v489 >> 0x11) ^ v429 ^ v489;
            v492 = __ROL__(v487, 12);
            v493 = __ROL__(v492 + 1022120916 + v490, 7);
            v494 = v476 + v427 + (v482 & v490 | v486 & ~v490) + v493;
            v495 = __ROL__(v477, 9);
            v496 = v475 + (v440 ^ v427) + ((v487 | v477) & v485 | v487 & v477) + (v493 ^ v492);
            v497 = __ROL__(v482, 19);
            v498 = v472;
            v499 = v427 ^ (v472 * 0x8000 | v472 >> 0x11) ^ v469;
            v500 = v362;
            v501 = (v494 * 0x20000 | v494 >> 15) ^ (v494 * 0x200 | v494 >> 23) ^ v494;
            v19 = (v362 * 128 | v362 >> 25) ^ (v499 * 0x800000 | v499 >> 9) ^ (v499 * 0x8000 | v499 >> 0x11) ^ v467 ^ v499;
            v502 = __ROL__(v496, 12);
            v503 = __ROL__(v502 + 2044241832 + v501, 7);
            v504 = __ROL__(v490, 19);
            v505 = v485 + (v479 ^ v438) + ((v496 | v487) & v495 | v496 & v487) + (v503 ^ v502);
            v506 = v486 + v438 + (v490 & v501 | v497 & ~v501) + v503;
            v507 = v481;
            v508 = v438 ^ (v481 * 0x8000 | v481 >> 0x11) ^ v480;
            v509 = (v506 * 0x20000 | v506 >> 15) ^ (v506 * 0x200 | v506 >> 23) ^ v506;
            v510 = (v440 * 128 | v440 >> 25) ^ (v508 * 0x800000 | v508 >> 9) ^ (v508 * 0x8000 | v508 >> 0x11) ^ v451 ^ v508;
            v20 = v510;
            v511 = __ROL__(v505, 12);
            v512 = __ROL__(v487, 9);
            v513 = __ROL__(v511 + 4088483664 + v509, 7);
            v514 = v497 + v447 + (v501 & v509 | v504 & ~v509) + v513;
            v515 = v495 + (v405 ^ v447) + ((v505 | v496) & v512 | v505 & v496) + (v513 ^ v511);
            v516 = __ROL__(v496, 9);
            v517 = __ROL__(v501, 19);
            v518 = v447 ^ (v491 * 0x8000 | v491 >> 0x11) ^ v429;
            v519 = v429;
            v520 = v7;
            v521 = (v479 * 128 | v479 >> 25) ^ (v518 * 0x800000 | v518 >> 9) ^ (v518 * 0x8000 | v518 >> 0x11) ^ v520 ^ v518;
            v522 = __ROL__(v515, 12);
            v523 = (v514 * 0x20000 | v514 >> 15) ^ (v514 * 0x200 | v514 >> 23) ^ v514;
            v524 = __ROL__(v522 + 3882000033 + v523, 7);
            v525 = v504 + v500 + (v509 & v523 | v517 & ~v523) + v524;
            v526 = __ROL__(v505, 9);
            v527 = __ROL__(v509, 19);
            v528 = v512 + (v469 ^ v500) + ((v515 | v505) & v516 | v515 & v505) + (v524 ^ v522);
            v529 = v500 ^ (v19 * 0x8000 | v19 >> 0x11) ^ v467;
            v530 = v467;
            v531 = v498;
            v532 = __ROL__(v528, 12);
            v533 = (v525 * 0x20000 | v525 >> 15) ^ (v525 * 0x200 | v525 >> 23) ^ v525;
            v534 = (v405 * 128 | v405 >> 25) ^ (v529 * 0x800000 | v529 >> 9) ^ (v529 * 0x8000 | v529 >> 0x11) ^ v498 ^ v529;
            v535 = v480;
            v536 = __ROL__(v532 + 3469032771 + v533, 7);
            v536 += v517 + v440 + (v523 & v533 | v527 & ~v533);
            v537 = __ROL__(v515, 9);
            v538 = __ROL__(v523, 19);
            v539 = v516 + (v535 ^ v440) + ((v528 | v515) & v526 | v528 & v515) + (v536 ^ v532);
            v540 = v6;
            v541 = v440 ^ (v510 * 0x8000 | v510 >> 0x11) ^ v540;
            v542 = (v469 * 128 | v469 >> 25) ^ (v541 * 0x800000 | v541 >> 9) ^ (v541 * 0x8000 | v541 >> 0x11) ^ v507 ^ v541;
            v543 = (v536 * 0x20000 | v536 >> 15) ^ (v536 * 0x200 | v536 >> 23) ^ v536;
            v544 = __ROL__(v539, 12);
            v545 = __ROL__(v544 + 2643098247 + v543, 7);
            v546 = __ROL__(v528, 9);
            v547 = __ROL__(v533, 19);
            v548 = v526 + (v519 ^ v479) + ((v539 | v528) & v537 | v539 & v528) + (v545 ^ v544);
            v549 = v527 + v479 + (v533 & v543 | v538 & ~v543) + v545;
            v550 = v520;
            v551 = v479 ^ (v521 * 0x8000 | v521 >> 0x11) ^ v520;
            v552 = (v549 * 0x20000 | v549 >> 15) ^ (v549 * 0x200 | v549 >> 23) ^ v549;
            v553 = (v535 * 128 | v535 >> 25) ^ (v551 * 0x800000 | v551 >> 9) ^ (v551 * 0x8000 | v551 >> 0x11) ^ v491 ^ v551;
            v554 = __ROL__(v548, 12);
            v555 = __ROL__(v554 + 991229199 + v552, 7);
            v556 = v538 + v405 + (v543 & v552 | v547 & ~v552) + v555;
            v557 = __ROL__(v539, 9);
            v558 = v537 + (v530 ^ v405) + ((v548 | v539) & v546 | v548 & v539) + (v555 ^ v554);
            v559 = __ROL__(v543, 19);
            v560 = (v556 * 0x20000 | v556 >> 15) ^ (v556 * 0x200 | v556 >> 23) ^ v556;
            v561 = __ROL__(v558, 12);
            v562 = __ROL__(v561 + 1982458398 + v560, 7);
            v563 = v547 + v469 + (v552 & v560 | v559 & ~v560) + v562;
            v564 = __ROL__(v552, 19);
            v565 = v546 + (v540 ^ v469) + ((v558 | v548) & v557 | v558 & v548) + (v562 ^ v561);
            v566 = __ROL__(v565, 12);
            v567 = __ROL__(v548, 9);
            v568 = (v563 * 0x20000 | v563 >> 15) ^ (v563 * 0x200 | v563 >> 23) ^ v563;
            v569 = __ROL__(v566 + 3964916796 + v568, 7);
            v570 = v559 + v535 + (v560 & v568 | v564 & ~v568) + v569;
            v571 = __ROL__(v558, 9);
            v572 = __ROL__(v560, 19);
            v573 = v557 + (v520 ^ v535) + ((v565 | v558) & v567 | v565 & v558) + (v569 ^ v566);
            v574 = __ROL__(v573, 12);
            v575 = (v570 * 0x20000 | v570 >> 15) ^ (v570 * 0x200 | v570 >> 23) ^ v570;
            v576 = __ROL__(v574 + 3634866297 + v575, 7);
            v577 = v567 + (v531 ^ v519) + ((v573 | v565) & v571 | v573 & v565) + (v576 ^ v574);
            v578 = v564 + v519 + (v568 & v575 | v572 & ~v575) + v576;
            v579 = __ROL__(v568, 19);
            v580 = (v578 * 0x20000 | v578 >> 15) ^ (v578 * 0x200 | v578 >> 23) ^ v578;
            v581 = __ROL__(v577, 12);
            v582 = __ROL__(v565, 9);
            v583 = v507;
            v584 = __ROL__(v581 + 2974765299 + v580, 7);
            v585 = v572 + v530 + (v575 & v580 | v579 & ~v580) + v584;
            v586 = v571 + (v507 ^ v530) + ((v577 | v573) & v582 | v577 & v573) + (v584 ^ v581);
            v587 = __ROL__(v573, 9);
            v588 = __ROL__(v575, 19);
            v589 = (v585 * 0x20000 | v585 >> 15) ^ (v585 * 0x200 | v585 >> 23) ^ v585;
            v590 = __ROL__(v586, 12);
            v591 = __ROL__(v590 + 1654563303 + v589, 7);
            v592 = __ROL__(v577, 9);
            v593 = v582 + (v491 ^ v540) + ((v586 | v577) & v587 | v586 & v577) + (v591 ^ v590);
            v594 = v579 + v540 + (v580 & v589 | v588 & ~v589) + v591;
            v595 = __ROL__(v580, 19);
            v596 = (v594 * 0x20000 | v594 >> 15) ^ (v594 * 0x200 | v594 >> 23) ^ v594;
            v597 = __ROL__(v593, 12);
            v598 = v19;
            v599 = __ROL__(v597 + 3309126606 + v596, 7);
            v600 = v588 + v550 + (v589 & v596 | v595 & ~v596) + v599;
            v601 = __ROL__(v586, 9);
            v602 = v587 + (v598 ^ v550) + ((v593 | v586) & v592 | v593 & v586) + (v599 ^ v597);
            v603 = __ROL__(v589, 19);
            v604 = v20;
            v605 = (v600 * 0x20000 | v600 >> 15) ^ (v600 * 0x200 | v600 >> 23) ^ v600;
            v606 = v405 ^ (v534 * 0x8000 | v534 >> 0x11) ^ v531;
            v607 = __ROL__(v602, 12);
            v608 = __ROL__(v607 + 2323285917 + v605, 7);
            v609 = __ROL__(v593, 9);
            v610 = v592 + (v604 ^ v531) + ((v602 | v593) & v601 | v602 & v593) + (v608 ^ v607);
            v611 = v595 + v531 + (v596 & v605 | v603 & ~v605) + v608;
            v612 = (v611 * 0x20000 | v611 >> 15) ^ (v611 * 0x200 | v611 >> 23) ^ v611;
            v613 = __ROL__(v596, 19);
            v614 = v469 ^ (v542 * 0x8000 | v542 >> 0x11) ^ v583;
            v615 = __ROL__(v610, 12);
            v616 = __ROL__(v615 + 351604539 + v612, 7);
            v617 = v603 + v583 + (v605 & v612 | v613 & ~v612) + v616;
            v618 = v601 + (v521 ^ v583) + ((v610 | v602) & v609 | v610 & v602) + (v616 ^ v615);
            v619 = __ROL__(v602, 9);
            v620 = __ROL__(v605, 19);
            v621 = (v617 * 0x20000 | v617 >> 15) ^ (v617 * 0x200 | v617 >> 23) ^ v617;
            v622 = v535 ^ (v553 * 0x8000 | v553 >> 0x11) ^ v491;
            v623 = __ROL__(v618, 12);
            v624 = __ROL__(v623 + 703209078 + v621, 7);
            v625 = v613 + v491 + (v612 & v621 | v620 & ~v621) + v624;
            v626 = __ROL__(v610, 9);
            v627 = __ROL__(v612, 19);
            v628 = v609 + (v534 ^ v491) + ((v618 | v610) & v619 | v618 & v610) + (v624 ^ v623);
            v629 = (v625 * 0x20000 | v625 >> 15) ^ (v625 * 0x200 | v625 >> 23) ^ v625;
            v630 = __ROL__(v628, 12);
            v631 = __ROL__(v630 + 1406418156 + v629, 7);
            v632 = v620 + v598 + (v621 & v629 | v627 & ~v629) + v631;
            v633 = v619 + (v542 ^ v598) + ((v628 | v618) & v626 | v628 & v618) + (v631 ^ v630);
            v634 = __ROL__(v618, 9);
            v635 = (v632 * 0x20000 | v632 >> 15) ^ (v632 * 0x200 | v632 >> 23) ^ v632;
            v636 = __ROL__(v621, 19);
            v637 = __ROL__(v633, 12);
            v638 = __ROL__(v637 + 2812836312 + v635, 7);
            v639 = v626 + (v553 ^ v604) + ((v633 | v628) & v634 | v633 & v628) + (v638 ^ v637);
            v640 = v627 + v604 + (v629 & v635 | v636 & ~v635) + v638;
            v641 = __ROL__(v628, 9);
            v642 = __ROL__(v629, 19);
            v643 = (v640 * 0x20000 | v640 >> 15) ^ (v640 * 0x200 | v640 >> 23) ^ v640;
            v644 = __ROL__(v639, 12);
            v645 = __ROL__(v644 + 1330705329 + v643, 7);
            v646 = v636 + v521 + (v635 & v643 | v642 & ~v643) + v645;
            v647 = __ROL__(v633, 9);
            v648 = v634 + ((v519 * 128 | v519 >> 25) ^ (v606 * 0x800000 | v606 >> 9) ^ (v606 * 0x8000 | v606 >> 0x11) ^ v598 ^ v521 ^ v606) + ((v639 | v633) & v641 | v639 & v633) + (v645 ^ v644);
            v649 = __ROL__(v635, 19);
            v650 = (v646 * 0x20000 | v646 >> 15) ^ (v646 * 0x200 | v646 >> 23) ^ v646;
            v651 = __ROL__(v648, 12);
            v652 = __ROL__(v651 + 2661410658 + v650, 7);
            v653 = v642 + v534 + (v643 & v650 | v649 & ~v650) + v652;
            v654 = __ROL__(v639, 9);
            v655 = v641 + ((v530 * 128 | v530 >> 25) ^ (v614 * 0x800000 | v614 >> 9) ^ (v614 * 0x8000 | v614 >> 0x11) ^ v604 ^ v534 ^ v614) + ((v648 | v639) & v647 | v648 & v639) + (v652 ^ v651);
            v28 = (v653 * 0x20000 | v653 >> 15) ^ (v653 * 0x200 | v653 >> 23) ^ v653;
            v656 = __ROL__(v655, 12);
            v657 = __ROL__(v643, 19);
            v658 = __ROL__(v656 + 1027854021 + (unsigned int)v28, 7);
            v659 = v649 + v542 + (v650 & (unsigned int)v28 | v657 & ~(unsigned int)v28) + v658;
            v32 = v655 ^ v23;
            v34 = v654 ^ v13;
            v36 = (unsigned int)v28 ^ v12;
            v25 ^= v647 + ((v540 * 128 | v540 >> 25) ^ (v622 * 0x800000 | v622 >> 9) ^ (v622 * 0x8000 | v622 >> 0x11) ^ v521 ^ v542 ^ v622) + ((v655 | v648) & v654 | v655 & v648) + (v658 ^ v656);
            v38 = v657 ^ v11;
            v35 = (v659 * 0x20000 | v659 >> 15) ^ (v659 * 0x200 | v659 >> 23) ^ v10 ^ v659;
            v31 = v25;
            v33 = v22 ^ (v648 * 0x200 | v648 >> 23);
            v37 = v21 ^ (v650 * 0x80000 | v650 >> 13);
            v660 = a0;
            v660[2] = v33;
            v660[3] = v34;
            *v660 = v31;
            v660[1] = v32;
            v660[4] = v35;
            v660[5] = v36;
            v660[6] = v37;
            v660[7] = v38;
            v40 = v24 + 16;
            i = v14 - 1;
        } while (i);
    }
    return (unsigned int)v28;
}
