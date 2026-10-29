/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0cde4..0xb0e678 (6292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0cde4_0 {
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
} st_b0cde4_0;


long long sub_b0cde4(st_b0cde4_0 *a0, unsigned long a1, unsigned long long i)
{
    unsigned long long v34;  // x8
    unsigned long v35;  // x6
    unsigned long iter;  // x16
    unsigned long long v134;  // x12
    unsigned long long v135;  // x10
    unsigned long long v136;  // x13
    unsigned long long v137;  // x3
    unsigned long v138;  // x7
    unsigned long long v139;  // x2
    unsigned long long v140;  // x25
    unsigned long long v141;  // x4
    unsigned long long v142;  // x14
    unsigned long long v143;  // x9
    unsigned long long *v45;  // x9
    unsigned long v144;  // x26
    unsigned long long v145;  // x2
    unsigned long long v146;  // x17
    unsigned long long v147;  // x0
    unsigned long long v148;  // x4
    unsigned long long v149;  // x8
    unsigned long long v150;  // x25
    unsigned long long v151;  // x9
    unsigned long long v152;  // x0
    unsigned long long v153;  // x3
    unsigned long long v46;  // x10
    unsigned long long v154;  // x1
    unsigned long long v155;  // x11
    unsigned long long v156;  // x17
    unsigned long long v157;  // x24
    unsigned long long v158;  // x4
    unsigned long long v159;  // x8
    unsigned long long v160;  // x0
    unsigned long long v161;  // x9
    unsigned long long v162;  // x1
    unsigned long long v163;  // x16
    unsigned long long v47;  // x11
    unsigned long long v164;  // x27
    unsigned long long v165;  // x11
    unsigned long long v166;  // x15
    unsigned long long v167;  // x3
    unsigned long long v168;  // x10
    unsigned long v169;  // x6
    unsigned long long v170;  // x1
    unsigned long long v171;  // x4
    unsigned long long v172;  // x17
    unsigned long long v173;  // x15
    unsigned long long v48;  // x12
    unsigned long long v174;  // x13
    unsigned long long v175;  // x12
    unsigned long long v176;  // x3
    unsigned long long v177;  // x14
    unsigned long v178;  // x22
    unsigned long long v179;  // x16
    unsigned long long v180;  // x8
    unsigned long long v181;  // x13
    unsigned long long v182;  // x12
    unsigned long long v183;  // x15
    unsigned long v49;  // x28
    unsigned long long v184;  // x14
    unsigned long long v185;  // x2
    unsigned long long v186;  // x24
    unsigned long long v187;  // x17
    unsigned long long v188;  // x0
    unsigned long long v189;  // x4
    unsigned long long v190;  // x25
    unsigned long long v191;  // x2
    unsigned long long v192;  // x12
    unsigned long long v193;  // x3
    unsigned long long v50;  // x13
    unsigned long long v194;  // x0
    unsigned long long v195;  // x24
    unsigned long long v196;  // x1
    unsigned long long v197;  // x27
    unsigned long long v198;  // x14
    unsigned long long v199;  // x13
    unsigned long long v200;  // x17
    unsigned long long v201;  // x8
    unsigned long long v202;  // x11
    unsigned long long v203;  // x1
    unsigned long long v51;  // x16
    unsigned long long v204;  // x12
    unsigned long long v205;  // x17
    unsigned long long v206;  // x16
    unsigned long long v207;  // x9
    unsigned long long v208;  // x10
    unsigned long long v209;  // x15
    unsigned long long v210;  // x4
    unsigned long long v211;  // x16
    unsigned long long v212;  // x3
    unsigned long long v213;  // x9
    unsigned long long v52;  // x14
    unsigned long long v214;  // x10
    unsigned long long v215;  // x8
    unsigned long long v216;  // x4
    unsigned long v217;  // x21
    unsigned long long v218;  // x2
    unsigned long long v219;  // x9
    unsigned long long v220;  // x17
    unsigned long long v221;  // x0
    unsigned long long v222;  // x24
    unsigned long long v223;  // x3
    unsigned long v53;  // x6
    unsigned long long v224;  // x25
    unsigned long long v225;  // x10
    unsigned long long v226;  // x8
    unsigned long v227;  // x28
    unsigned long long v228;  // x0
    unsigned long long v229;  // x9
    unsigned long long v230;  // x1
    unsigned long long v231;  // x24
    unsigned long long v232;  // x27
    unsigned long long v233;  // x14
    unsigned long v36;  // x7
    unsigned long long v54;  // x15
    unsigned long long v234;  // x13
    unsigned long long v235;  // x17
    unsigned long long v236;  // x10
    unsigned long long v237;  // x1
    unsigned long long v238;  // x4
    unsigned long long v239;  // x13
    unsigned long v240;  // x7
    unsigned long long v241;  // x16
    unsigned long long v242;  // x12
    unsigned long long v243;  // x11
    unsigned long v55;  // x7
    unsigned long long v244;  // x3
    unsigned long long v245;  // x24
    unsigned long v246;  // x22
    unsigned long long v247;  // x2
    unsigned long long v248;  // x8
    unsigned long long v249;  // x12
    unsigned long long v250;  // x11
    unsigned long long v251;  // x15
    unsigned long long v252;  // x16
    unsigned long long v253;  // x17
    unsigned long long v56;  // x17
    unsigned long long v254;  // x24
    unsigned long long v255;  // x13
    unsigned long long v256;  // x0
    unsigned long long v257;  // x4
    unsigned long long v258;  // x25
    unsigned long long v259;  // x17
    unsigned long long v260;  // x11
    unsigned long long v261;  // x3
    unsigned long long v262;  // x0
    unsigned long long v263;  // x24
    unsigned long long v57;  // x2
    unsigned long long v264;  // x1
    unsigned long long v265;  // x12
    unsigned long long v266;  // x16
    unsigned long long v267;  // x13
    unsigned long long v268;  // x14
    unsigned long long v269;  // x8
    unsigned long long v270;  // x11
    unsigned long long v271;  // x1
    unsigned long long v272;  // x12
    unsigned long long v273;  // x14
    unsigned long long v58;  // x3
    unsigned long v274;  // x23
    unsigned long long v275;  // x2
    unsigned long long v276;  // x9
    unsigned long long v277;  // x10
    unsigned long long v278;  // x15
    unsigned long long v279;  // x4
    unsigned long long v280;  // x2
    unsigned long long v281;  // x3
    unsigned long long v282;  // x9
    unsigned long long v283;  // x10
    unsigned long long v59;  // x0
    unsigned long long v284;  // x8
    unsigned long long v285;  // x4
    unsigned long long v286;  // x17
    unsigned long long v287;  // x9
    unsigned long long v288;  // x14
    unsigned long long v289;  // x0
    unsigned long long v290;  // x24
    unsigned long long v291;  // x3
    unsigned long long v292;  // x17
    unsigned long long v293;  // x10
    unsigned long long v60;  // x24
    unsigned long long v294;  // x8
    unsigned long long v295;  // x0
    unsigned long long v296;  // x9
    unsigned long long v297;  // x1
    unsigned long long v298;  // x16
    unsigned long long v299;  // x24
    unsigned long long v300;  // x14
    unsigned long long v301;  // x13
    unsigned long long v302;  // x4
    unsigned long long v303;  // x10
    unsigned long v61;  // x19
    unsigned long v304;  // x5
    unsigned long long v305;  // x1
    unsigned long long v306;  // x16
    unsigned long long v307;  // x13
    unsigned long long v308;  // x2
    unsigned long long v309;  // x12
    unsigned long long v310;  // x11
    unsigned long long v311;  // x3
    unsigned long long v312;  // x25
    unsigned long long v313;  // x6
    unsigned long v62;  // x20
    unsigned long long v314;  // x2
    unsigned long long v315;  // x8
    unsigned long long v316;  // x12
    unsigned long long v317;  // x11
    unsigned long long v318;  // x15
    unsigned long long v319;  // x4
    unsigned long long v320;  // x17
    unsigned long long v321;  // x24
    unsigned long long v322;  // x13
    unsigned long long v323;  // x0
    unsigned long long v63;  // x14
    unsigned long long v324;  // x16
    unsigned long long v325;  // x4
    unsigned long long v326;  // x17
    unsigned long long v327;  // x11
    unsigned long long v328;  // x3
    unsigned long long v329;  // x0
    unsigned long long v330;  // x24
    unsigned long long v331;  // x1
    unsigned long long v332;  // x12
    unsigned long long v333;  // x16
    unsigned long v37;  // x21
    unsigned long long v64;  // x1
    unsigned long long v334;  // x13
    unsigned long long v335;  // x14
    unsigned long long v336;  // x8
    unsigned long long v337;  // x11
    unsigned long long v338;  // x1
    unsigned long long v339;  // x12
    unsigned long long v340;  // x14
    unsigned long v341;  // x26
    unsigned long long v342;  // x2
    unsigned long long v343;  // x9
    unsigned long long v65;  // x13
    unsigned long long v344;  // x10
    unsigned long long v345;  // x15
    unsigned long long v346;  // x4
    unsigned long v347;  // x21
    unsigned long long v348;  // x2
    unsigned long long v349;  // x3
    unsigned long long v350;  // x9
    unsigned long long v351;  // x10
    unsigned long long v352;  // x8
    unsigned long long v353;  // x4
    unsigned long long v66;  // x15
    unsigned long long v354;  // x17
    unsigned long long v355;  // x9
    unsigned long long v356;  // x14
    unsigned long v357;  // x27
    unsigned long long v358;  // x0
    unsigned long long v359;  // x24
    unsigned long long v360;  // x3
    unsigned long long v361;  // x17
    unsigned long long v362;  // x10
    unsigned long long v363;  // x8
    unsigned long long v67;  // x3
    unsigned long v364;  // x7
    unsigned long long v365;  // x0
    unsigned long long v366;  // x9
    unsigned long long v367;  // x1
    unsigned long long v368;  // x16
    unsigned long long v369;  // x24
    unsigned long long v370;  // x14
    unsigned long long v371;  // x13
    unsigned long long v372;  // x4
    unsigned long long v373;  // x10
    unsigned long long v68;  // x8
    unsigned long long v374;  // x1
    unsigned long long v375;  // x16
    unsigned long long v376;  // x13
    unsigned long v377;  // x19
    unsigned long long v378;  // x2
    unsigned long long v379;  // x12
    unsigned long long v380;  // x11
    unsigned long long v381;  // x3
    unsigned long long v382;  // x25
    unsigned long v383;  // x22
    unsigned long long v69;  // x10
    unsigned long long v384;  // x2
    unsigned long long v385;  // x8
    unsigned long long v386;  // x12
    unsigned long long v387;  // x11
    unsigned long long v388;  // x15
    unsigned long long v389;  // x4
    unsigned long long v390;  // x17
    unsigned long long v391;  // x24
    unsigned long long v392;  // x13
    unsigned long long v393;  // x0
    unsigned long long v70;  // x12
    unsigned long long v394;  // x16
    unsigned long long v395;  // x4
    unsigned long long v396;  // x17
    unsigned long long v397;  // x11
    unsigned long long v398;  // x3
    unsigned long long v399;  // x0
    unsigned long long v400;  // x24
    unsigned long long v401;  // x1
    unsigned long long v402;  // x12
    unsigned long long v403;  // x16
    unsigned long long v71;  // x13
    unsigned long long v404;  // x13
    unsigned long long v405;  // x14
    unsigned long long v406;  // x8
    unsigned long long v407;  // x11
    unsigned long long v408;  // x1
    unsigned long long v409;  // x12
    unsigned long long v410;  // x14
    unsigned long long v411;  // x2
    unsigned long long v412;  // x9
    unsigned long long v413;  // x10
    unsigned long long v72;  // x3
    unsigned long long v414;  // x15
    unsigned long long v415;  // x4
    unsigned long long v416;  // x2
    unsigned long long v417;  // x3
    unsigned long long v418;  // x9
    unsigned long long v419;  // x10
    unsigned long long v420;  // x8
    unsigned long long v421;  // x4
    unsigned long long v422;  // x17
    unsigned long long v423;  // x9
    unsigned long long v73;  // x15
    unsigned long long v424;  // x14
    unsigned long long v425;  // x0
    unsigned long long v426;  // x24
    unsigned long long v427;  // x3
    unsigned long long v428;  // x17
    unsigned long long v429;  // x10
    unsigned long long v430;  // x8
    unsigned long long v431;  // x0
    unsigned long long v432;  // x9
    unsigned long long v433;  // x1
    unsigned long v38;  // x22
    unsigned long long v74;  // x25
    unsigned long long v434;  // x16
    unsigned long long v435;  // x24
    unsigned long long v436;  // x14
    unsigned long long v437;  // x13
    unsigned long long v438;  // x4
    unsigned long long v439;  // x10
    unsigned long v440;  // x28
    unsigned long long v441;  // x1
    unsigned long long v442;  // x16
    unsigned long long v443;  // x13
    unsigned long long v75;  // x8
    unsigned long long v444;  // x2
    unsigned long long v445;  // x12
    unsigned long long v446;  // x11
    unsigned long long v447;  // x3
    unsigned long long v448;  // x25
    unsigned long v449;  // x27
    unsigned long long v450;  // x2
    unsigned long long v451;  // x8
    unsigned long long v452;  // x12
    unsigned long long v453;  // x11
    unsigned long long v76;  // x27
    unsigned long long v454;  // x15
    unsigned long long v455;  // x4
    unsigned long long v456;  // x17
    unsigned long long v457;  // x24
    unsigned long long v458;  // x13
    unsigned long long v459;  // x0
    unsigned long long v460;  // x16
    unsigned long long v461;  // x4
    unsigned long long v462;  // x17
    unsigned long long v463;  // x11
    unsigned long long v77;  // x15
    unsigned long long v464;  // x3
    unsigned long long v465;  // x0
    unsigned long long v466;  // x24
    unsigned long long v467;  // x1
    unsigned long long v468;  // x12
    unsigned long long v469;  // x16
    unsigned long long v470;  // x13
    unsigned long long v471;  // x14
    unsigned long long v472;  // x8
    unsigned long long v473;  // x11
    unsigned long long v78;  // x2
    unsigned long long v474;  // x1
    unsigned long long v475;  // x12
    unsigned long long v476;  // x14
    unsigned long long v477;  // x2
    unsigned long long v478;  // x9
    unsigned long long v479;  // x10
    unsigned long long v480;  // x15
    unsigned long long v481;  // x4
    unsigned long long v482;  // x2
    unsigned long long v483;  // x3
    unsigned long long v79;  // x25
    unsigned long long v484;  // x9
    unsigned long long v485;  // x10
    unsigned long long v486;  // x8
    unsigned long long v487;  // x4
    unsigned long long v488;  // x17
    unsigned long long v489;  // x9
    unsigned long long v490;  // x14
    unsigned long v491;  // x23
    unsigned long long v492;  // x0
    unsigned long long v493;  // x24
    unsigned long long v80;  // x8
    unsigned long long v494;  // x3
    unsigned long long v495;  // x17
    unsigned long long v496;  // x10
    unsigned long long v497;  // x8
    unsigned long long v498;  // x0
    unsigned long long v499;  // x9
    unsigned long long v500;  // x1
    unsigned long long v501;  // x16
    unsigned long long v502;  // x24
    unsigned long long v503;  // x14
    unsigned long long v81;  // x9
    unsigned long long v504;  // x13
    unsigned long long v505;  // x4
    unsigned long long v506;  // x10
    unsigned long v507;  // x5
    unsigned long long v508;  // x1
    unsigned long long v509;  // x16
    unsigned long long v510;  // x13
    unsigned long long v511;  // x7
    unsigned long long v512;  // x2
    unsigned long long v513;  // x12
    unsigned long long v82;  // x27
    unsigned long long v514;  // x11
    unsigned long long v515;  // x3
    unsigned long long v516;  // x25
    unsigned long long v517;  // x2
    unsigned long long v518;  // x8
    unsigned long long v519;  // x12
    unsigned long long v520;  // x11
    unsigned long long v521;  // x15
    unsigned long long v522;  // x4
    unsigned long long v523;  // x17
    unsigned long long v83;  // x16
    unsigned long long v524;  // x24
    unsigned long long v525;  // x13
    unsigned long long v526;  // x0
    unsigned long long v527;  // x16
    unsigned long long v528;  // x4
    unsigned long long v529;  // x17
    unsigned long long v530;  // x11
    unsigned long long v531;  // x3
    unsigned long long v532;  // x0
    unsigned long v533;  // x21
    unsigned long v39;  // x14
    unsigned long long v84;  // x25
    unsigned long long v534;  // x24
    unsigned long long v535;  // x1
    unsigned long long v536;  // x12
    unsigned long long v537;  // x16
    unsigned long long v538;  // x13
    unsigned long long v539;  // x14
    unsigned long long v540;  // x8
    unsigned long long v541;  // x11
    unsigned long long v542;  // x1
    unsigned long long v543;  // x12
    unsigned long long v85;  // x3
    unsigned long long v544;  // x14
    unsigned long long v545;  // x2
    unsigned long long v546;  // x9
    unsigned long long v547;  // x10
    unsigned long long v548;  // x15
    unsigned long long v549;  // x4
    unsigned long long v550;  // x2
    unsigned long long v551;  // x3
    unsigned long long v552;  // x9
    unsigned long long v553;  // x10
    unsigned long long v86;  // x24
    unsigned long long v554;  // x8
    unsigned long long v555;  // x4
    unsigned long long v556;  // x17
    unsigned long long v557;  // x9
    unsigned long long v558;  // x14
    unsigned long long v559;  // x0
    unsigned long long v560;  // x24
    unsigned long long v561;  // x3
    unsigned long long v562;  // x17
    unsigned long long v563;  // x10
    unsigned long long v87;  // x17
    unsigned long long v564;  // x8
    unsigned long v565;  // x6
    unsigned long long v566;  // x0
    unsigned long long v567;  // x9
    unsigned long long v568;  // x1
    unsigned long long v569;  // x16
    unsigned long long v570;  // x24
    unsigned long long v571;  // x14
    unsigned long long v572;  // x13
    unsigned long long v573;  // x4
    unsigned long long v88;  // x2
    unsigned long long v574;  // x10
    unsigned long long v575;  // x1
    unsigned long long v576;  // x16
    unsigned long long v577;  // x13
    unsigned long long v578;  // x2
    unsigned long long v579;  // x12
    unsigned long long v580;  // x11
    unsigned long long v581;  // x3
    unsigned long long v582;  // x25
    unsigned long v583;  // x28
    unsigned long long v89;  // x16
    unsigned long long v584;  // x2
    unsigned long long v585;  // x8
    unsigned long long v586;  // x12
    unsigned long long v587;  // x11
    unsigned long long v588;  // x15
    unsigned long long v589;  // x4
    unsigned long long v590;  // x17
    unsigned long long v591;  // x24
    unsigned long long v592;  // x13
    unsigned long long v593;  // x0
    unsigned long long v90;  // x8
    unsigned long long v594;  // x16
    unsigned long long v595;  // x4
    unsigned long long v596;  // x17
    unsigned long long v597;  // x11
    unsigned long long v598;  // x3
    unsigned long long v599;  // x0
    unsigned long long v600;  // x24
    unsigned long long v601;  // x1
    unsigned long long v602;  // x12
    unsigned long long v603;  // x16
    unsigned long long v91;  // x9
    unsigned long long v604;  // x13
    unsigned long long v605;  // x14
    unsigned long long v606;  // x8
    unsigned long long v607;  // x11
    unsigned long long v608;  // x1
    unsigned long long v609;  // x12
    unsigned long long v610;  // x14
    unsigned long long v611;  // x2
    unsigned long long v612;  // x9
    unsigned long long v613;  // x10
    unsigned long long v92;  // x24
    unsigned long long v614;  // x15
    unsigned long long v615;  // x4
    unsigned long long v616;  // x2
    unsigned long long v617;  // x3
    unsigned long long v618;  // x9
    unsigned long long v619;  // x10
    unsigned long long v620;  // x8
    unsigned long long v621;  // x4
    unsigned long long v622;  // x17
    unsigned long long v623;  // x9
    unsigned long v93;  // x21
    unsigned long long v624;  // x14
    unsigned long v625;  // x22
    unsigned long long v626;  // x0
    unsigned long long v627;  // x24
    unsigned long long v628;  // x3
    unsigned long long v629;  // x17
    unsigned long long v630;  // x10
    unsigned long long v631;  // x8
    unsigned long v632;  // x7
    unsigned long long v633;  // x0
    unsigned long v40;  // x15
    unsigned long long v94;  // x25
    unsigned long v634;  // x20
    unsigned long long v635;  // x9
    unsigned long long v636;  // x1
    unsigned long long v637;  // x16
    unsigned long long v638;  // x24
    unsigned long long v639;  // x14
    unsigned long long v640;  // x13
    unsigned long long v641;  // x4
    unsigned long long v642;  // x10
    unsigned long long v643;  // x1
    unsigned long long v95;  // x10
    unsigned long long v644;  // x25
    unsigned long long v645;  // x13
    unsigned long long v646;  // x2
    unsigned long long v647;  // x12
    unsigned long long v648;  // x11
    unsigned long long v649;  // x4
    unsigned long long v650;  // x15
    unsigned long v651;  // x5
    unsigned long long v652;  // x2
    unsigned long long v653;  // x8
    unsigned long long v96;  // x14
    unsigned long long v654;  // x12
    unsigned long long v655;  // x11
    unsigned long long v656;  // x16
    unsigned long long v657;  // x15
    unsigned long long v658;  // x17
    unsigned long long v659;  // x3
    unsigned long long v660;  // x13
    unsigned long long v661;  // x0
    unsigned long long v662;  // x24
    unsigned long long v663;  // x25
    unsigned long long v97;  // x11
    unsigned long long v664;  // x17
    unsigned long long v665;  // x11
    unsigned long long v666;  // x4
    unsigned long long v667;  // x0
    unsigned long long v668;  // x24
    unsigned long long v669;  // x1
    unsigned long long v670;  // x12
    unsigned long long v671;  // x15
    unsigned long long v672;  // x13
    unsigned long long v673;  // x14
    unsigned long long v98;  // x17
    unsigned long long v674;  // x8
    unsigned long long v675;  // x11
    unsigned long long v676;  // x1
    unsigned long long v677;  // x12
    unsigned long long v678;  // x14
    unsigned long long v679;  // x2
    unsigned long long v680;  // x25
    unsigned long long v681;  // x10
    unsigned long long v682;  // x9
    unsigned long long v683;  // x3
    unsigned long long v99;  // x0
    unsigned long long v684;  // x16
    unsigned long long v685;  // x2
    unsigned long long v686;  // x4
    unsigned long long v687;  // x10
    unsigned long long v688;  // x8
    unsigned long long v689;  // x3
    unsigned long long v690;  // x17
    unsigned long long v691;  // x4
    unsigned long long v692;  // x14
    unsigned long v693;  // x7
    unsigned long long v100;  // x3
    unsigned long long v694;  // x0
    unsigned long long v695;  // x24
    unsigned long long v696;  // x2
    unsigned long long v697;  // x17
    unsigned long long v698;  // x25
    unsigned long long v699;  // x8
    unsigned long v700;  // x21
    unsigned long long v701;  // x0
    unsigned long long v702;  // x10
    unsigned long long v703;  // x1
    unsigned long long v101;  // x4
    unsigned long long v704;  // x15
    unsigned long long v705;  // x4
    unsigned long long v706;  // x14
    unsigned long long v707;  // x24
    unsigned long long v708;  // x3
    unsigned long long v709;  // x13
    unsigned long long v710;  // x1
    unsigned long long v711;  // x15
    unsigned long long v712;  // x24
    unsigned long long v713;  // x16
    unsigned long long v102;  // x10
    unsigned long long v714;  // x12
    unsigned long long v715;  // x11
    unsigned long long v716;  // x2
    unsigned long long v717;  // x9
    unsigned long long v718;  // x16
    unsigned long long v719;  // x8
    unsigned long long v720;  // x25
    unsigned long long v721;  // x11
    unsigned long long v722;  // x27
    unsigned long long v723;  // x9
    unsigned long long v103;  // x14
    unsigned long long v724;  // x12
    unsigned long long v725;  // x17
    unsigned long long v726;  // x4
    unsigned long long v727;  // x24
    unsigned long long v728;  // x9
    unsigned long long v729;  // x12
    unsigned long long v730;  // x15
    unsigned long long v731;  // x11
    unsigned long long v732;  // x3
    unsigned long long v733;  // x17
    unsigned long v41;  // x25
    unsigned long long v104;  // x0
    unsigned long long v734;  // x2
    unsigned long long v735;  // x20
    unsigned long long v736;  // x0
    unsigned long long v737;  // x15
    unsigned long long v738;  // x12
    unsigned long long v739;  // x11
    unsigned long long v740;  // x1
    unsigned long long v741;  // x8
    unsigned long long v742;  // x24
    unsigned long long v743;  // x14
    unsigned long long v105;  // x15
    unsigned long long v744;  // x11
    unsigned long long v745;  // x17
    unsigned long long v746;  // x10
    unsigned long long v747;  // x13
    unsigned long long v748;  // x16
    unsigned long long v749;  // x1
    unsigned long long v750;  // x25
    unsigned long long v751;  // x17
    unsigned long long v752;  // x10
    unsigned long long v753;  // x8
    unsigned long long v106;  // x13
    unsigned long long v754;  // x27
    unsigned long long v755;  // x9
    unsigned long long v756;  // x15
    unsigned long long v757;  // x13
    unsigned long long v758;  // x11
    unsigned long long v759;  // x2
    unsigned long long v760;  // x3
    unsigned long long v761;  // x9
    unsigned long long v762;  // x25
    unsigned long long v763;  // x10
    unsigned long long v107;  // x1
    unsigned long long v764;  // x2
    unsigned long long v765;  // x8
    unsigned long long v766;  // x14
    unsigned long long v767;  // x5
    unsigned long long v768;  // x16
    unsigned long long v769;  // x27
    unsigned long long v770;  // x3
    unsigned long long v771;  // x19
    unsigned long long v772;  // x8
    unsigned long long v773;  // x17
    unsigned long long v108;  // x27
    unsigned long long v774;  // x14
    unsigned long long v775;  // x9
    unsigned long long v776;  // x9
    unsigned long long v777;  // x1
    unsigned long long v778;  // x0
    unsigned long long v779;  // x5
    unsigned long long v780;  // x2
    unsigned long long v781;  // x9
    unsigned long long v782;  // x13
    unsigned long long v783;  // x1
    unsigned long long v109;  // x12
    unsigned long long v784;  // x4
    unsigned long long v785;  // x11
    unsigned long long v786;  // x0
    unsigned long long v787;  // x15
    unsigned long long v788;  // x15
    unsigned long long v789;  // x10
    unsigned long long v790;  // x10
    unsigned long long v791;  // x8
    unsigned long long v792;  // x16
    unsigned long long v793;  // x0
    unsigned long v110;  // x5
    unsigned long long v794;  // x11
    unsigned long long v795;  // x14
    unsigned long long v796;  // x3
    unsigned long long v797;  // x16
    unsigned long long v798;  // x17
    unsigned long long v799;  // x4
    unsigned long long v800;  // x3
    unsigned long long v801;  // x6
    unsigned long long v802;  // x9
    unsigned long long v803;  // x12
    unsigned long long v111;  // x2
    unsigned long long v804;  // x7
    unsigned long long v805;  // x8
    unsigned long long v806;  // x17
    unsigned long long v807;  // x10
    unsigned long long v808;  // x12
    unsigned long long v809;  // x16
    unsigned long long v810;  // x2
    unsigned long long v811;  // x13
    unsigned long long v812;  // x15
    unsigned long long v813;  // x4
    unsigned long long v112;  // x8
    unsigned long long v814;  // x0
    unsigned long long v815;  // x1
    unsigned long long v816;  // x2
    unsigned long long v817;  // x5
    unsigned long long v818;  // x13
    unsigned long long v819;  // x15
    unsigned long long v820;  // x4
    unsigned long long v821;  // x1
    unsigned long long v822;  // x11
    unsigned long long v823;  // x8
    unsigned long long v113;  // x13
    unsigned long long v824;  // x14
    unsigned long long v825;  // x5
    unsigned long long v826;  // x12
    unsigned long long v827;  // x16
    unsigned long long v828;  // x3
    unsigned long long v829;  // x0
    unsigned long long v830;  // x4
    unsigned long long v831;  // x1
    unsigned long long v832;  // x3
    unsigned long long v833;  // x0
    unsigned long v42;  // x4
    unsigned long long v114;  // x15
    unsigned long long v834;  // x16
    unsigned long long v835;  // x10
    unsigned long long v836;  // x13
    unsigned long long v837;  // x15
    unsigned long long v838;  // x17
    unsigned long long v839;  // x9
    unsigned long long v840;  // x11
    unsigned long long v841;  // x8
    unsigned long long v842;  // x17
    unsigned long long v843;  // x9
    unsigned long long v115;  // x9
    unsigned long long v844;  // x9
    unsigned long long v845;  // x15
    unsigned long long v846;  // x14
    unsigned long long v847;  // x10
    unsigned long long v116;  // x12
    unsigned long long v117;  // x16
    unsigned long long v118;  // x11
    unsigned long long v119;  // x0
    unsigned long long v120;  // x1
    unsigned long long v121;  // x14
    unsigned long long v122;  // x3
    unsigned long long v123;  // x24
    unsigned long long v43;  // x10
    unsigned long long v124;  // x12
    unsigned long long v125;  // x27
    unsigned long long v126;  // x1
    unsigned long long v127;  // x11
    unsigned long long v128;  // x10
    unsigned long long v129;  // x13
    unsigned long long v130;  // x16
    unsigned long long v131;  // x15
    unsigned long long v132;  // x14
    unsigned long long v133;  // x8
    unsigned long long v0;  // [bp-0x170]
    unsigned long long v1;  // [bp-0x168]
    unsigned long v2;  // [bp-0x160]
    unsigned long long v3;  // [bp-0x158]
    unsigned long v4;  // [bp-0x140]
    unsigned long v5;  // [bp-0x138]
    unsigned long v6;  // [bp-0x130]
    unsigned long v7;  // [bp-0x128]
    unsigned long v8;  // [bp-0x120]
    unsigned long v9;  // [bp-0x118]
    unsigned long v10;  // [bp-0x110]
    unsigned long v11;  // [bp-0x108]
    unsigned long long v12;  // [bp-0x100]
    unsigned long long v13;  // [bp-0xf8]
    unsigned long v14;  // [bp-0xf0]
    unsigned long v15;  // [bp-0xe8]
    unsigned long v16;  // [bp-0xe0]
    unsigned long v17;  // [bp-0xd8]
    unsigned long v18;  // [bp-0xd0]
    unsigned long v19;  // [bp-0xc8]
    unsigned long long v20;  // [bp-0xc0]
    unsigned long v21;  // [bp-0xb8]
    unsigned long v22;  // [bp-0xb0]
    unsigned long v23;  // [bp-0xa8]
    unsigned long v24;  // [bp-0xa0]
    unsigned long v25;  // [bp-0x98]
    unsigned long v26;  // [bp-0x90]
    unsigned long long v27;  // [bp-0x88]
    unsigned long v28;  // [bp-0x80]
    unsigned long v29;  // [bp-0x78]
    unsigned long v30;  // [bp-0x70]
    unsigned long v31;  // [bp-0x68]
    char *v32;  // [bp-0x10]
    char v33;  // [bp+0x0]

    v32 = &v33;
    v34 = 0;
    v35 = a0->field_0;
    v36 = a0->field_8;
    v37 = a0->field_10;
    v38 = a0->field_18;
    v39 = a0->field_20;
    v40 = a0->field_28;
    v41 = a0->field_30;
    v42 = a0->field_38;
    if (i < 128)
        v43 = i;
    else
        v43 = 128;
    iter = a0->field_48;
    v13 = v43;
    v3 = a0->field_40 + v43;
    v2 = a1 + 64;
    v1 = a0->field_50 ^ 2270897969802886507;
    v0 = a0->field_58 ^ 6620516959819538809;
    do
    {
        v4 = v42;
        v5 = v37;
        v6 = v38;
        v7 = v35;
        v9 = v36;
        v27 = v34;
        v45 = v2 + v34;
        v11 = v39;
        v12 = v3 + v34;
        v29 = *(long long *)((char *)v45 - 64);
        v31 = *(long long *)((char *)v45 - 56);
        v46 = v39 + v35 + *(long long *)((char *)v45 - 64);
        v24 = *(long long *)((char *)v45 - 48);
        v25 = *(long long *)((char *)v45 - 40);
        v47 = __ROL__(v12 ^ 0x510e527fade682d1 ^ v46, 32);
        v48 = v47 + 7640891576956012808;
        v49 = *(long long *)((char *)v45 - 32);
        v30 = *(long long *)((char *)v45 - 24);
        v50 = __ROL__(v48 ^ v39, 40);
        if (v13 > v12)
            iter += 1;
        v14 = *(long long *)((char *)v45 - 16);
        v15 = iter;
        v22 = *(long long *)((char *)v45 - 8);
        v51 = *(long long *)((char *)v45 - 56) + v46 + v50;
        v52 = v40 + v36 + *(long long *)((char *)v45 - 48);
        v53 = v45[1];
        v10 = v40;
        v54 = __ROL__(v15 ^ 11170449401992604703 ^ v52, 32);
        v55 = v45[2];
        v18 = v45[3];
        v56 = __ROL__(v51 ^ v47, 48);
        v57 = v54 + 13503953896175478587;
        v58 = __ROL__(v57 ^ v40, 40);
        v59 = v56 + v48;
        v60 = *(long long *)((char *)v45 - 40) + v52 + v58;
        v61 = v45[5];
        v62 = v45[6];
        v28 = v45[7];
        v63 = __ROL__(v60 ^ v54, 48);
        v64 = v63 + v57;
        v8 = v41;
        v65 = v41 + v37 + v49;
        v23 = v49;
        v66 = __ROL__(v1 ^ v65, 32);
        v67 = v66 + 4354685564936845355;
        v68 = __ROL__(v67 ^ v41, 40);
        v69 = *(long long *)((char *)v45 - 24) + v65 + v68;
        v70 = __ROL__(v59 ^ v50, 1);
        v71 = __ROL__(v69 ^ v66, 48);
        v72 = v71 + v67;
        v73 = v42 + v38 + *(long long *)((char *)v45 - 16);
        v74 = __ROL__(v0 ^ v73, 32);
        v75 = v74 + 0xa54ff53a5f1d36f1;
        v76 = __ROL__(v75 ^ v42, 40);
        v77 = *(long long *)((char *)v45 - 8) + v73 + v76;
        v78 = __ROL__(v64 ^ v58, 1);
        v79 = __ROL__(v77 ^ v74, 48);
        v80 = v79 + v75;
        v81 = __ROL__(v72 ^ v68, 1);
        v82 = __ROL__(v80 ^ v76, 1);
        x30 = *v45;
        v83 = v78 + v51 + *v45;
        v84 = __ROL__(v83 ^ v79, 32);
        v85 = v84 + v72;
        v21 = v53;
        v17 = v55;
        v86 = v81 + v60 + v55;
        v87 = __ROL__(v86 ^ v56, 32);
        v88 = __ROL__(v85 ^ v78, 40);
        v89 = v53 + v83 + v88;
        v90 = v87 + v80;
        v91 = __ROL__(v90 ^ v81, 40);
        v92 = v45[3] + v86 + v91;
        v93 = v45[4];
        v94 = __ROL__(v89 ^ v84, 48);
        v95 = v82 + v69 + v45[4];
        v96 = __ROL__(v95 ^ v63, 32);
        v97 = __ROL__(v92 ^ v87, 48);
        v98 = v94 + v85;
        v99 = v96 + v59;
        v100 = __ROL__(v99 ^ v82, 40);
        v101 = v97 + v90;
        v102 = v61 + v95 + v100;
        v103 = __ROL__(v102 ^ v96, 48);
        v104 = v103 + v99;
        v16 = v62;
        v105 = v77 + v62 + v70;
        v106 = __ROL__(v105 ^ v71, 32);
        v107 = v106 + v64;
        v108 = __ROL__(v98 ^ v88, 1);
        v109 = __ROL__(v107 ^ v70, 40);
        v110 = v28;
        v111 = v110 + v105 + v109;
        v112 = __ROL__(v101 ^ v91, 1);
        v113 = __ROL__(v111 ^ v106, 48);
        v114 = v113 + v107;
        v115 = __ROL__(v104 ^ v100, 1);
        v116 = __ROL__(v114 ^ v109, 1);
        v117 = v62 + v89 + v116;
        v118 = __ROL__(v117 ^ v97, 32);
        v119 = v118 + v104;
        v120 = v108 + v49 + v92;
        v121 = __ROL__(v103 ^ v120, 32);
        v122 = __ROL__(v119 ^ v116, 40);
        v123 = v117 + v55 + v122;
        v124 = v114 + v121;
        v125 = __ROL__(v124 ^ v108, 40);
        v20 = x30;
        v126 = v120 + x30 + v125;
        v127 = __ROL__(v123 ^ v118, 48);
        v128 = v112 + v53 + v102;
        v129 = __ROL__(v113 ^ v128, 32);
        v130 = __ROL__(v126 ^ v121, 48);
        v131 = v127 + v119;
        v132 = v129 + v98;
        v133 = __ROL__(v132 ^ v112, 40);
        v134 = v130 + v124;
        v135 = v110 + v128 + v133;
        v136 = __ROL__(v135 ^ v129, 48);
        v137 = v136 + v132;
        v138 = v61;
        v139 = v115 + v61 + v111;
        v140 = __ROL__(v139 ^ v94, 32);
        v141 = v140 + v101;
        v142 = __ROL__(v131 ^ v122, 1);
        v143 = __ROL__(v141 ^ v115, 40);
        v144 = v14;
        v145 = v139 + v144 + v143;
        v146 = __ROL__(v134 ^ v125, 1);
        v147 = __ROL__(v145 ^ v140, 48);
        v148 = v147 + v141;
        v149 = __ROL__(v137 ^ v133, 1);
        v150 = __ROL__(v148 ^ v143, 1);
        v151 = v146 + v31 + v123;
        v152 = __ROL__(v151 ^ v147, 32);
        v153 = v152 + v137;
        v26 = v93;
        v154 = v149 + v126 + v29;
        v155 = __ROL__(v154 ^ v127, 32);
        v156 = __ROL__(v153 ^ v146, 40);
        v157 = v151 + v93 + v156;
        v158 = v155 + v148;
        v159 = __ROL__(v158 ^ v149, 40);
        v160 = v24 + v154 + v159;
        v161 = __ROL__(v157 ^ v152, 48);
        v162 = v135 + v18 + v150;
        v163 = __ROL__(v162 ^ v130, 32);
        v164 = __ROL__(v160 ^ v155, 48);
        v165 = v161 + v153;
        v166 = v163 + v131;
        v167 = __ROL__(v166 ^ v150, 40);
        v168 = v164 + v158;
        v169 = v22;
        v170 = v162 + v169 + v167;
        v171 = __ROL__(v170 ^ v163, 48);
        v172 = v171 + v166;
        v173 = v142 + v145 + v30;
        v174 = __ROL__(v173 ^ v136, 32);
        v175 = v174 + v134;
        v176 = __ROL__(v165 ^ v156, 1);
        v177 = __ROL__(v175 ^ v142, 40);
        v178 = v25;
        v179 = v178 + v173 + v177;
        v180 = __ROL__(v168 ^ v159, 1);
        v181 = __ROL__(v179 ^ v174, 48);
        v182 = v181 + v175;
        v183 = __ROL__(v172 ^ v167, 1);
        v184 = __ROL__(v182 ^ v177, 1);
        v185 = v157 + v18 + v184;
        v186 = __ROL__(v185 ^ v164, 32);
        v187 = v186 + v172;
        v188 = v176 + v93 + v160;
        v189 = __ROL__(v188 ^ v171, 32);
        v190 = __ROL__(v187 ^ v184, 40);
        v191 = v185 + x30 + v190;
        v192 = v182 + v189;
        v193 = __ROL__(v192 ^ v176, 40);
        v194 = v188 + v29 + v193;
        v195 = __ROL__(v191 ^ v186, 48);
        v196 = v180 + v170 + v30;
        v197 = __ROL__(v181 ^ v196, 32);
        v198 = __ROL__(v194 ^ v189, 48);
        v199 = v195 + v187;
        v200 = v197 + v165;
        v201 = __ROL__(v200 ^ v180, 40);
        v202 = v198 + v192;
        v203 = v196 + v24 + v201;
        v204 = __ROL__(v203 ^ v197, 48);
        v205 = v204 + v200;
        v206 = v183 + v110 + v179;
        v207 = __ROL__(v206 ^ v161, 32);
        v208 = v207 + v168;
        v209 = __ROL__(v199 ^ v190, 1);
        v210 = __ROL__(v208 ^ v183, 40);
        v19 = v138;
        v211 = v210 + v206 + v138;
        v212 = __ROL__(v202 ^ v193, 1);
        v213 = __ROL__(v211 ^ v207, 48);
        v214 = v213 + v208;
        v215 = __ROL__(v205 ^ v201, 1);
        v216 = __ROL__(v214 ^ v210, 1);
        v217 = v17;
        v218 = v191 + v217 + v212;
        v219 = __ROL__(v218 ^ v213, 32);
        v220 = v219 + v205;
        v221 = v194 + v178 + v215;
        v222 = __ROL__(v195 ^ v221, 32);
        v223 = __ROL__(v220 ^ v212, 40);
        v224 = v16 + v218 + v223;
        v225 = v214 + v222;
        v226 = __ROL__(v225 ^ v215, 40);
        v227 = v144;
        v228 = v226 + v221 + v144;
        v229 = __ROL__(v224 ^ v219, 48);
        v230 = v216 + v203 + v169;
        v231 = __ROL__(v230 ^ v198, 32);
        v232 = __ROL__(v228 ^ v222, 48);
        v233 = v229 + v220;
        v234 = v231 + v199;
        v235 = __ROL__(v234 ^ v216, 40);
        v236 = v232 + v225;
        v237 = v31 + v230 + v235;
        v238 = __ROL__(v237 ^ v231, 48);
        v239 = v238 + v234;
        v240 = v21;
        v241 = v211 + v240 + v209;
        v242 = __ROL__(v241 ^ v204, 32);
        v243 = v242 + v202;
        v244 = __ROL__(v233 ^ v223, 1);
        v245 = __ROL__(v243 ^ v209, 40);
        v246 = v23;
        v247 = v246 + v241 + v245;
        v248 = __ROL__(v236 ^ v226, 1);
        v249 = __ROL__(v247 ^ v242, 48);
        v250 = v249 + v243;
        v251 = __ROL__(v239 ^ v235, 1);
        v252 = __ROL__(v250 ^ v245, 1);
        v253 = v169 + v224 + v252;
        v254 = __ROL__(v253 ^ v232, 32);
        v255 = v254 + v239;
        v256 = v244 + v178 + v228;
        v257 = __ROL__(v238 ^ v256, 32);
        v258 = __ROL__(v255 ^ v252, 40);
        v259 = v253 + v240 + v258;
        v260 = v250 + v257;
        v261 = __ROL__(v260 ^ v244, 40);
        v262 = v31 + v256 + v261;
        v263 = __ROL__(v259 ^ v254, 48);
        v264 = v248 + v138 + v237;
        v265 = __ROL__(v249 ^ v264, 32);
        v266 = __ROL__(v262 ^ v257, 48);
        v267 = v263 + v255;
        v268 = v265 + v233;
        v269 = __ROL__(v268 ^ v248, 40);
        v270 = v266 + v260;
        v271 = v269 + v264 + v26;
        v272 = __ROL__(v271 ^ v265, 48);
        v273 = v272 + v268;
        v274 = v18;
        v275 = v247 + v274 + v251;
        v276 = __ROL__(v275 ^ v229, 32);
        v277 = v276 + v236;
        v278 = __ROL__(v267 ^ v258, 1);
        v279 = __ROL__(v277 ^ v251, 40);
        v280 = v275 + v16 + v279;
        v281 = __ROL__(v270 ^ v261, 1);
        v282 = __ROL__(v280 ^ v276, 48);
        v283 = v282 + v277;
        v284 = __ROL__(v273 ^ v269, 1);
        v285 = __ROL__(v283 ^ v279, 1);
        v286 = v259 + v24 + v281;
        v287 = __ROL__(v282 ^ v286, 32);
        v288 = v287 + v273;
        v289 = v284 + v262 + v30;
        v290 = __ROL__(v289 ^ v263, 32);
        v291 = __ROL__(v288 ^ v281, 40);
        v292 = v286 + v227 + v291;
        v293 = v290 + v283;
        v294 = __ROL__(v293 ^ v284, 40);
        v295 = v289 + v217 + v294;
        v296 = __ROL__(v292 ^ v287, 48);
        v297 = v271 + v246 + v285;
        v298 = __ROL__(v297 ^ v266, 32);
        v299 = __ROL__(v295 ^ v290, 48);
        v300 = v296 + v288;
        v301 = v298 + v267;
        v302 = __ROL__(v301 ^ v285, 40);
        v303 = v299 + v293;
        v304 = v28;
        v305 = v302 + v297 + v29;
        v306 = __ROL__(v305 ^ v298, 48);
        v307 = v306 + v301;
        v308 = v280 + v304 + v278;
        v309 = __ROL__(v308 ^ v272, 32);
        v310 = v309 + v270;
        v311 = __ROL__(v300 ^ v291, 1);
        v312 = __ROL__(v310 ^ v278, 40);
        v313 = v20;
        v314 = v313 + v308 + v312;
        v315 = __ROL__(v303 ^ v294, 1);
        v316 = __ROL__(v314 ^ v309, 48);
        v317 = v316 + v310;
        v318 = __ROL__(v307 ^ v302, 1);
        v319 = __ROL__(v317 ^ v312, 1);
        v320 = v292 + v240 + v319;
        v321 = __ROL__(v320 ^ v299, 32);
        v322 = v321 + v307;
        v323 = v311 + v30 + v295;
        v324 = __ROL__(v306 ^ v323, 32);
        v325 = __ROL__(v322 ^ v319, 40);
        v326 = v320 + v29 + v325;
        v327 = v317 + v324;
        v328 = __ROL__(v327 ^ v311, 40);
        v329 = v323 + v169 + v328;
        v330 = __ROL__(v326 ^ v321, 48);
        v331 = v315 + v24 + v305;
        v332 = __ROL__(v316 ^ v331, 32);
        v333 = __ROL__(v329 ^ v324, 48);
        v334 = v330 + v322;
        v335 = v332 + v300;
        v336 = __ROL__(v335 ^ v315, 40);
        v337 = v333 + v327;
        v338 = v331 + v246 + v336;
        v339 = __ROL__(v338 ^ v332, 48);
        v340 = v339 + v335;
        v341 = v217;
        v342 = v314 + v217 + v318;
        v343 = __ROL__(v342 ^ v296, 32);
        v344 = v343 + v303;
        v345 = __ROL__(v334 ^ v325, 1);
        v346 = __ROL__(v344 ^ v318, 40);
        v347 = v304;
        v348 = v342 + v304 + v346;
        v349 = __ROL__(v337 ^ v328, 1);
        v350 = __ROL__(v348 ^ v343, 48);
        v351 = v350 + v344;
        v352 = __ROL__(v340 ^ v336, 1);
        v353 = __ROL__(v351 ^ v346, 1);
        v354 = v326 + v16 + v349;
        v355 = __ROL__(v350 ^ v354, 32);
        v356 = v355 + v340;
        v357 = v31;
        v358 = v329 + v274 + v352;
        v359 = __ROL__(v330 ^ v358, 32);
        v360 = __ROL__(v356 ^ v349, 40);
        v361 = v357 + v354 + v360;
        v362 = v351 + v359;
        v363 = __ROL__(v362 ^ v352, 40);
        v364 = v26;
        v365 = v358 + v364 + v363;
        v366 = __ROL__(v361 ^ v355, 48);
        v367 = v353 + v338 + v227;
        v368 = __ROL__(v367 ^ v333, 32);
        v369 = __ROL__(v365 ^ v359, 48);
        v370 = v366 + v356;
        v371 = v368 + v334;
        v372 = __ROL__(v371 ^ v353, 40);
        v373 = v369 + v362;
        v374 = v367 + v313 + v372;
        v375 = __ROL__(v374 ^ v368, 48);
        v376 = v375 + v371;
        v377 = v25;
        v378 = v348 + v377 + v345;
        v379 = __ROL__(v378 ^ v339, 32);
        v380 = v379 + v337;
        v381 = __ROL__(v370 ^ v360, 1);
        v382 = __ROL__(v380 ^ v345, 40);
        v383 = v19;
        v384 = v383 + v378 + v382;
        v385 = __ROL__(v373 ^ v363, 1);
        v386 = __ROL__(v384 ^ v379, 48);
        v387 = v386 + v380;
        v388 = __ROL__(v376 ^ v372, 1);
        v389 = __ROL__(v387 ^ v382, 1);
        v390 = v361 + v24 + v389;
        v391 = __ROL__(v390 ^ v369, 32);
        v392 = v391 + v376;
        v393 = v381 + v365 + v227;
        v394 = __ROL__(v375 ^ v393, 32);
        v395 = __ROL__(v392 ^ v389, 40);
        v396 = v390 + v364 + v395;
        v397 = v387 + v394;
        v398 = __ROL__(v397 ^ v381, 40);
        v399 = v393 + v341 + v398;
        v400 = __ROL__(v396 ^ v391, 48);
        v401 = v385 + v29 + v374;
        v402 = __ROL__(v386 ^ v401, 32);
        v403 = __ROL__(v399 ^ v394, 48);
        v404 = v400 + v392;
        v405 = v402 + v370;
        v406 = __ROL__(v405 ^ v385, 40);
        v407 = v403 + v397;
        v408 = v406 + v401 + v274;
        v409 = __ROL__(v408 ^ v402, 48);
        v410 = v409 + v405;
        v411 = v388 + v313 + v384;
        v412 = __ROL__(v411 ^ v366, 32);
        v413 = v412 + v373;
        v414 = __ROL__(v404 ^ v395, 1);
        v415 = __ROL__(v413 ^ v388, 40);
        v416 = v411 + v377 + v415;
        v417 = __ROL__(v407 ^ v398, 1);
        v418 = __ROL__(v416 ^ v412, 48);
        v419 = v418 + v413;
        v420 = __ROL__(v410 ^ v406, 1);
        v421 = __ROL__(v419 ^ v415, 1);
        v422 = v396 + v23 + v417;
        v423 = __ROL__(v422 ^ v418, 32);
        v424 = v423 + v410;
        v425 = v420 + v399 + v22;
        v426 = __ROL__(v425 ^ v400, 32);
        v427 = __ROL__(v424 ^ v417, 40);
        v428 = v422 + v383 + v427;
        v429 = v426 + v419;
        v430 = __ROL__(v429 ^ v420, 40);
        v431 = v30 + v425 + v430;
        v432 = __ROL__(v428 ^ v423, 48);
        v433 = v408 + v347 + v421;
        v434 = __ROL__(v433 ^ v403, 32);
        v435 = __ROL__(v431 ^ v426, 48);
        v436 = v432 + v424;
        v437 = v434 + v404;
        v438 = __ROL__(v437 ^ v421, 40);
        v439 = v435 + v429;
        v440 = v16;
        v441 = v433 + v440 + v438;
        v442 = __ROL__(v441 ^ v434, 48);
        v443 = v442 + v437;
        v444 = v416 + v357 + v414;
        v445 = __ROL__(v409 ^ v444, 32);
        v446 = v445 + v407;
        v447 = __ROL__(v436 ^ v427, 1);
        v448 = __ROL__(v446 ^ v414, 40);
        v449 = v21;
        v450 = v448 + v444 + v449;
        v451 = __ROL__(v439 ^ v430, 1);
        v452 = __ROL__(v450 ^ v445, 48);
        v453 = v452 + v446;
        v454 = __ROL__(v443 ^ v438, 1);
        v455 = __ROL__(v448 ^ v453, 1);
        v456 = v428 + v364 + v455;
        v457 = __ROL__(v435 ^ v456, 32);
        v458 = v443 + v457;
        v459 = v447 + v431 + v357;
        v460 = __ROL__(v442 ^ v459, 32);
        v461 = __ROL__(v455 ^ v458, 40);
        v462 = v456 + v30 + v461;
        v463 = v453 + v460;
        v464 = __ROL__(v447 ^ v463, 40);
        v465 = v459 + v347 + v464;
        v466 = __ROL__(v457 ^ v462, 48);
        v467 = v451 + v441 + v440;
        v468 = __ROL__(v452 ^ v467, 32);
        v469 = __ROL__(v460 ^ v465, 48);
        v470 = v458 + v466;
        v471 = v436 + v468;
        v472 = __ROL__(v451 ^ v471, 40);
        v473 = v463 + v469;
        v474 = v467 + v383 + v472;
        v475 = __ROL__(v468 ^ v474, 48);
        v476 = v471 + v475;
        v477 = v454 + v450 + v23;
        v478 = __ROL__(v432 ^ v477, 32);
        v479 = v439 + v478;
        v480 = __ROL__(v461 ^ v470, 1);
        v481 = __ROL__(v454 ^ v479, 40);
        v482 = v477 + v341 + v481;
        v483 = __ROL__(v464 ^ v473, 1);
        v484 = __ROL__(v478 ^ v482, 48);
        v485 = v479 + v484;
        v486 = __ROL__(v472 ^ v476, 1);
        v487 = __ROL__(v481 ^ v485, 1);
        v488 = v483 + v462 + v29;
        v489 = __ROL__(v484 ^ v488, 32);
        v490 = v476 + v489;
        v491 = v14;
        v492 = v486 + v465 + v491;
        v493 = __ROL__(v466 ^ v492, 32);
        v494 = __ROL__(v483 ^ v490, 40);
        v495 = v488 + v22 + v494;
        v496 = v485 + v493;
        v497 = __ROL__(v486 ^ v496, 40);
        v498 = v492 + v377 + v497;
        v499 = __ROL__(v489 ^ v495, 48);
        v500 = v487 + v474 + v449;
        v501 = __ROL__(v469 ^ v500, 32);
        v502 = __ROL__(v493 ^ v498, 48);
        v503 = v490 + v499;
        v504 = v470 + v501;
        v505 = __ROL__(v487 ^ v504, 40);
        v506 = v496 + v502;
        v507 = v24;
        v508 = v500 + v507 + v505;
        v509 = __ROL__(v501 ^ v508, 48);
        v510 = v504 + v509;
        v511 = v20;
        v512 = v480 + v482 + v511;
        v513 = __ROL__(v475 ^ v512, 32);
        v514 = v473 + v513;
        v515 = __ROL__(v494 ^ v503, 1);
        v516 = __ROL__(v480 ^ v514, 40);
        v517 = v512 + v18 + v516;
        v518 = __ROL__(v497 ^ v506, 1);
        v519 = __ROL__(v513 ^ v517, 48);
        v520 = v514 + v519;
        v521 = __ROL__(v505 ^ v510, 1);
        v522 = __ROL__(v516 ^ v520, 1);
        v523 = v495 + v383 + v522;
        v524 = __ROL__(v502 ^ v523, 32);
        v525 = v510 + v524;
        v526 = v515 + v498 + v22;
        v527 = __ROL__(v509 ^ v526, 32);
        v528 = __ROL__(v522 ^ v525, 40);
        v529 = v523 + v18 + v528;
        v530 = v520 + v527;
        v531 = __ROL__(v515 ^ v530, 40);
        v532 = v526 + v440 + v531;
        v533 = v26;
        v534 = __ROL__(v524 ^ v529, 48);
        v535 = v518 + v508 + v533;
        v536 = __ROL__(v519 ^ v535, 32);
        v537 = __ROL__(v527 ^ v532, 48);
        v538 = v525 + v534;
        v539 = v503 + v536;
        v540 = __ROL__(v518 ^ v539, 40);
        v541 = v530 + v537;
        v542 = v535 + v31 + v540;
        v543 = __ROL__(v536 ^ v542, 48);
        v544 = v539 + v543;
        v545 = v521 + v517 + v377;
        v546 = __ROL__(v499 ^ v545, 32);
        v547 = v506 + v546;
        v548 = __ROL__(v528 ^ v538, 1);
        v549 = __ROL__(v521 ^ v547, 40);
        v550 = v545 + v449 + v549;
        v551 = __ROL__(v531 ^ v541, 1);
        v552 = __ROL__(v546 ^ v550, 48);
        v553 = v547 + v552;
        v554 = __ROL__(v540 ^ v544, 1);
        v555 = __ROL__(v549 ^ v553, 1);
        v556 = v551 + v529 + v30;
        v557 = __ROL__(v552 ^ v556, 32);
        v558 = v544 + v557;
        v559 = v554 + v532 + v28;
        v560 = __ROL__(v534 ^ v559, 32);
        v561 = __ROL__(v551 ^ v558, 40);
        v562 = v556 + v29 + v561;
        v563 = v553 + v560;
        v564 = __ROL__(v554 ^ v563, 40);
        v565 = v23;
        v566 = v559 + v565 + v564;
        v567 = __ROL__(v557 ^ v562, 48);
        v568 = v555 + v542 + v511;
        v569 = __ROL__(v537 ^ v568, 32);
        v570 = __ROL__(v560 ^ v566, 48);
        v571 = v558 + v567;
        v572 = v538 + v569;
        v573 = __ROL__(v555 ^ v572, 40);
        v574 = v563 + v570;
        v575 = v568 + v491 + v573;
        v576 = __ROL__(v569 ^ v575, 48);
        v577 = v572 + v576;
        v578 = v548 + v550 + v507;
        v579 = __ROL__(v543 ^ v578, 32);
        v580 = v541 + v579;
        v581 = __ROL__(v561 ^ v571, 1);
        v582 = __ROL__(v548 ^ v580, 40);
        v583 = v17;
        v584 = v578 + v583 + v582;
        v585 = __ROL__(v564 ^ v574, 1);
        v586 = __ROL__(v579 ^ v584, 48);
        v587 = v580 + v586;
        v588 = __ROL__(v573 ^ v577, 1);
        v589 = __ROL__(v582 ^ v587, 1);
        v590 = v562 + v491 + v589;
        v591 = __ROL__(v570 ^ v590, 32);
        v592 = v577 + v591;
        v593 = v581 + v566 + v440;
        v594 = __ROL__(v576 ^ v593, 32);
        v595 = __ROL__(v589 ^ v592, 40);
        v596 = v590 + v28 + v595;
        v597 = v587 + v594;
        v598 = __ROL__(v581 ^ v597, 40);
        v599 = v593 + v449 + v598;
        v600 = __ROL__(v591 ^ v596, 48);
        v601 = v585 + v575 + v18;
        v602 = __ROL__(v586 ^ v601, 32);
        v603 = __ROL__(v594 ^ v599, 48);
        v604 = v592 + v600;
        v605 = v571 + v602;
        v606 = __ROL__(v585 ^ v605, 40);
        v607 = v597 + v603;
        v608 = v601 + v377 + v606;
        v609 = __ROL__(v602 ^ v608, 48);
        v610 = v605 + v609;
        v611 = v588 + v584 + v29;
        v612 = __ROL__(v567 ^ v611, 32);
        v613 = v574 + v612;
        v614 = __ROL__(v595 ^ v604, 1);
        v615 = __ROL__(v588 ^ v613, 40);
        v616 = v611 + v511 + v615;
        v617 = __ROL__(v598 ^ v607, 1);
        v618 = __ROL__(v612 ^ v616, 48);
        v619 = v613 + v618;
        v620 = __ROL__(v606 ^ v610, 1);
        v621 = __ROL__(v615 ^ v619, 1);
        v622 = v617 + v596 + v533;
        v623 = __ROL__(v618 ^ v622, 32);
        v624 = v610 + v623;
        v625 = v507;
        v626 = v620 + v599 + v19;
        v627 = __ROL__(v600 ^ v626, 32);
        v628 = __ROL__(v617 ^ v624, 40);
        v629 = v622 + v507 + v628;
        v630 = v619 + v627;
        v631 = __ROL__(v620 ^ v630, 40);
        v632 = v22;
        v633 = v626 + v632 + v631;
        v634 = v31;
        v635 = __ROL__(v623 ^ v629, 48);
        v636 = v621 + v608 + v634;
        v637 = __ROL__(v603 ^ v636, 32);
        v638 = __ROL__(v627 ^ v633, 48);
        v639 = v624 + v635;
        v640 = v604 + v637;
        v641 = __ROL__(v621 ^ v640, 40);
        v642 = v630 + v638;
        v643 = v636 + v565 + v641;
        v644 = __ROL__(v637 ^ v643, 48);
        v645 = v640 + v644;
        v646 = v614 + v616 + v583;
        v647 = __ROL__(v609 ^ v646, 32);
        v648 = v607 + v647;
        v649 = __ROL__(v628 ^ v639, 1);
        v650 = __ROL__(v614 ^ v648, 40);
        v651 = v30;
        v652 = v646 + v651 + v650;
        v653 = __ROL__(v631 ^ v642, 1);
        v654 = __ROL__(v647 ^ v652, 48);
        v655 = v648 + v654;
        v656 = __ROL__(v641 ^ v645, 1);
        v657 = __ROL__(v650 ^ v655, 1);
        v658 = v629 + v583 + v657;
        v659 = __ROL__(v638 ^ v658, 32);
        v660 = v645 + v659;
        v661 = v649 + v633 + v511;
        v662 = __ROL__(v644 ^ v661, 32);
        v663 = __ROL__(v657 ^ v660, 40);
        v664 = v658 + v625 + v663;
        v665 = v655 + v662;
        v666 = __ROL__(v649 ^ v665, 40);
        v667 = v661 + v565 + v666;
        v668 = __ROL__(v659 ^ v664, 48);
        v669 = v653 + v643 + v632;
        v670 = __ROL__(v654 ^ v669, 32);
        v671 = __ROL__(v662 ^ v667, 48);
        v672 = v660 + v668;
        v673 = v639 + v670;
        v674 = __ROL__(v653 ^ v673, 40);
        v675 = v665 + v671;
        v676 = v669 + v491 + v674;
        v677 = __ROL__(v670 ^ v676, 48);
        v678 = v673 + v677;
        v679 = v656 + v652 + v634;
        v680 = __ROL__(v635 ^ v679, 32);
        v681 = v642 + v680;
        v682 = __ROL__(v663 ^ v672, 1);
        v683 = __ROL__(v656 ^ v681, 40);
        v684 = v679 + v651 + v683;
        v685 = __ROL__(v666 ^ v675, 1);
        v686 = __ROL__(v680 ^ v684, 48);
        v687 = v681 + v686;
        v688 = __ROL__(v674 ^ v678, 1);
        v689 = __ROL__(v683 ^ v687, 1);
        v690 = v685 + v664 + v28;
        v691 = __ROL__(v686 ^ v690, 32);
        v692 = v678 + v691;
        v693 = v18;
        v694 = v688 + v667 + v21;
        v695 = __ROL__(v668 ^ v694, 32);
        v696 = __ROL__(v685 ^ v692, 40);
        v697 = v690 + v18 + v696;
        v698 = v687 + v695;
        v699 = __ROL__(v688 ^ v698, 40);
        v700 = v16;
        v701 = v694 + v700 + v699;
        v702 = __ROL__(v691 ^ v697, 48);
        v703 = v689 + v676 + v25;
        v704 = __ROL__(v671 ^ v703, 32);
        v705 = __ROL__(v695 ^ v701, 48);
        v706 = v692 + v702;
        v707 = v672 + v704;
        v708 = __ROL__(v689 ^ v707, 40);
        v709 = v698 + v705;
        v710 = v703 + v533 + v708;
        v711 = __ROL__(v704 ^ v710, 48);
        v712 = v707 + v711;
        v713 = v682 + v684 + v19;
        v714 = __ROL__(v677 ^ v713, 32);
        v715 = v675 + v714;
        v716 = __ROL__(v696 ^ v706, 1);
        v717 = __ROL__(v682 ^ v715, 40);
        v718 = v713 + v29 + v717;
        v719 = __ROL__(v699 ^ v709, 1);
        v720 = __ROL__(v714 ^ v718, 48);
        v721 = v715 + v720;
        v722 = __ROL__(v708 ^ v712, 1);
        v723 = __ROL__(v717 ^ v721, 1);
        v724 = v697 + v29 + v723;
        v725 = __ROL__(v705 ^ v724, 32);
        v726 = v712 + v725;
        v727 = __ROL__(v723 ^ v726, 40);
        v728 = v724 + v634 + v727;
        v729 = v716 + v701 + v625;
        v730 = __ROL__(v711 ^ v729, 32);
        v731 = v721 + v730;
        v732 = __ROL__(v725 ^ v728, 48);
        v733 = __ROL__(v716 ^ v731, 40);
        v734 = v729 + v25 + v733;
        v735 = v726 + v732;
        v736 = __ROL__(v730 ^ v734, 48);
        v737 = v719 + v710 + v23;
        v738 = v731 + v736;
        v739 = __ROL__(v720 ^ v737, 32);
        v740 = v706 + v739;
        v741 = __ROL__(v719 ^ v740, 40);
        v742 = v737 + v651 + v741;
        v743 = __ROL__(v739 ^ v742, 48);
        v744 = v740 + v743;
        v745 = v722 + v718 + v491;
        v746 = __ROL__(v702 ^ v745, 32);
        v747 = v709 + v746;
        v748 = __ROL__(v727 ^ v735, 1);
        v749 = __ROL__(v722 ^ v747, 40);
        v750 = __ROL__(v733 ^ v738, 1);
        v751 = v745 + v632 + v749;
        v752 = __ROL__(v746 ^ v751, 48);
        v753 = __ROL__(v741 ^ v744, 1);
        v754 = v747 + v752;
        v755 = v750 + v728 + v20;
        v756 = __ROL__(v752 ^ v755, 32);
        v757 = v744 + v756;
        v758 = __ROL__(v750 ^ v757, 40);
        v759 = v753 + v734 + v17;
        v760 = __ROL__(v732 ^ v759, 32);
        v761 = v755 + v21 + v758;
        v762 = v754 + v760;
        v763 = __ROL__(v753 ^ v762, 40);
        v764 = v759 + v693 + v763;
        v765 = v748 + v751 + v700;
        v766 = __ROL__(v743 ^ v765, 32);
        v767 = v738 + v766;
        v768 = __ROL__(v760 ^ v764, 48);
        v769 = __ROL__(v748 ^ v767, 40);
        v770 = v765 + v28 + v769;
        v771 = v762 + v768;
        v772 = __ROL__(v766 ^ v770, 48);
        v773 = v767 + v772;
        v774 = __ROL__(v769 ^ v773, 1);
        v775 = v761 + v700 + v774;
        v776 = __ROL__(v749 ^ v754, 1);
        v777 = v776 + v742 + v26;
        v778 = __ROL__(v736 ^ v777, 32);
        v779 = __ROL__(v756 ^ v761, 48);
        v780 = v735 + v778;
        v781 = __ROL__(v776 ^ v780, 40);
        v782 = v757 + v779;
        v783 = v777 + v19 + v781;
        v784 = __ROL__(v758 ^ v782, 1);
        v785 = __ROL__(v778 ^ v783, 48);
        v786 = v780 + v785;
        v787 = v784 + v764 + v23;
        v788 = __ROL__(v763 ^ v771, 1);
        v789 = v788 + v783 + v21;
        v790 = __ROL__(v781 ^ v786, 1);
        v791 = v790 + v770 + v19;
        v792 = __ROL__(v768 ^ v775, 32);
        v793 = v786 + v792;
        v794 = __ROL__(v774 ^ v793, 40);
        v795 = v775 + v17 + v794;
        v796 = __ROL__(v785 ^ v787, 32);
        v797 = v773 + v796;
        v798 = __ROL__(v784 ^ v797, 40);
        v799 = v787 + v20 + v798;
        v800 = __ROL__(v796 ^ v799, 48);
        v801 = __ROL__(v779 ^ v791, 32);
        v802 = v797 + v800;
        v803 = v771 + v801;
        v804 = __ROL__(v790 ^ v803, 40);
        v805 = v791 + v491 + v804;
        v806 = __ROL__(v801 ^ v805, 48);
        v807 = v803 + v806;
        v808 = __ROL__(v798 ^ v802, 1);
        v809 = v808 + v795 + v31;
        v810 = __ROL__(v772 ^ v789, 32);
        v811 = v782 + v810;
        v812 = __ROL__(v788 ^ v811, 40);
        v813 = __ROL__(v792 ^ v795, 48);
        v814 = v793 + v813;
        v815 = v789 + v28 + v812;
        v816 = __ROL__(v810 ^ v815, 48);
        v817 = v811 + v816;
        v818 = __ROL__(v812 ^ v817, 1);
        v819 = v818 + v799 + v29;
        v820 = __ROL__(v804 ^ v807, 1);
        v821 = v820 + v815 + v693;
        v822 = __ROL__(v794 ^ v814, 1);
        v823 = v822 + v805 + v30;
        v824 = __ROL__(v806 ^ v809, 32);
        v825 = v817 + v824;
        v826 = __ROL__(v808 ^ v825, 40);
        v827 = v809 + v26 + v826;
        v828 = __ROL__(v800 ^ v821, 32);
        v829 = v814 + v828;
        v830 = __ROL__(v820 ^ v829, 40);
        v831 = v821 + v22 + v830;
        v832 = __ROL__(v828 ^ v831, 48);
        v833 = v829 + v832;
        v35 = v7 ^ v827 ^ v833;
        v834 = __ROL__(v813 ^ v819, 32);
        v835 = v807 + v834;
        v836 = __ROL__(v818 ^ v835, 40);
        v837 = v819 + v24 + v836;
        v838 = __ROL__(v816 ^ v823, 32);
        v839 = v802 + v838;
        v840 = __ROL__(v822 ^ v839, 40);
        v841 = v823 + v25 + v840;
        v842 = __ROL__(v838 ^ v841, 48);
        v843 = v839 + v842;
        v36 = v9 ^ v837 ^ v843;
        v844 = __ROL__(v824 ^ v827, 48);
        v845 = v825 + v844;
        v37 = v5 ^ v831 ^ v845;
        v846 = __ROL__(v834 ^ v837, 48);
        iter = v15;
        v847 = v835 + v846;
        v38 = v6 ^ v841 ^ v847;
        v39 = v11 ^ __ROL__(v840 ^ v843, 1) ^ v846;
        v40 = v10 ^ __ROL__(v826 ^ v845, 1) ^ v832;
        v41 = v8 ^ __ROL__(v836 ^ v847, 1) ^ v842;
        v42 = v4 ^ __ROL__(v830 ^ v833, 1) ^ v844;
        a0->field_40 = v12;
        a0->field_48 = iter;
        a0->field_0 = v35;
        a0->field_8 = v36;
        a0->field_10 = v37;
        a0->field_18 = v38;
        a0->field_20 = v39;
        a0->field_28 = v40;
        a0->field_30 = v41;
        a0->field_38 = v42;
        v34 = v27 + v13;
    } while (i != v34);
    return v9;
}
