/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaae94..0xaac550 (5820 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_aaae94(unsigned int *a0, unsigned int *a1, unsigned long long i)
{
    unsigned int *v22;  // x8
    unsigned int v23;  // w9
    unsigned int v32;  // w13
    unsigned int v122;  // w10
    unsigned int v123;  // w28
    unsigned int v124;  // w11
    unsigned int v125;  // w11
    unsigned int v126;  // w14
    unsigned int v127;  // w12
    unsigned int v128;  // w12
    unsigned int v129;  // w10
    unsigned int v130;  // w13
    unsigned int v131;  // w11
    unsigned int v33;  // w19
    unsigned int v132;  // w13
    unsigned int v133;  // w14
    unsigned int v134;  // w14
    unsigned int v135;  // w12
    unsigned int v136;  // w10
    unsigned int v137;  // w10
    unsigned int v138;  // w13
    unsigned int v139;  // w21
    unsigned int v140;  // w11
    unsigned int v141;  // w14
    unsigned int v34;  // w11
    unsigned int v142;  // w11
    unsigned int v143;  // w12
    unsigned int v144;  // w12
    unsigned int v145;  // w10
    unsigned int v146;  // w13
    unsigned int v147;  // w13
    unsigned int v148;  // w11
    unsigned int v149;  // w14
    unsigned int v150;  // w12
    unsigned int v151;  // w14
    unsigned int v35;  // w28
    unsigned int v152;  // w10
    unsigned int v153;  // w15
    unsigned int v154;  // w17
    unsigned int v155;  // w10
    unsigned int v156;  // w11
    unsigned int v157;  // w13
    unsigned int v158;  // w20
    unsigned int v159;  // w10
    unsigned int v160;  // w10
    unsigned int v161;  // w12
    unsigned int v36;  // w6
    unsigned int v162;  // w14
    unsigned int v163;  // w5
    unsigned int v164;  // w4
    unsigned int v165;  // w1
    unsigned int v166;  // w14
    unsigned int v167;  // w15
    unsigned int v168;  // w17
    unsigned int v169;  // w17
    unsigned int v170;  // w1
    unsigned int v171;  // w16
    unsigned int v37;  // w10
    unsigned int v172;  // w16
    unsigned int v173;  // w15
    unsigned int v174;  // w9
    unsigned int v175;  // w3
    unsigned int v176;  // w11
    unsigned int v177;  // w11
    unsigned int v178;  // w13
    unsigned int v179;  // w17
    unsigned int v180;  // w26
    unsigned int v181;  // w8
    unsigned int v38;  // w12
    unsigned int v182;  // w8
    unsigned int v183;  // w15
    unsigned int v184;  // w16
    unsigned int v185;  // w5
    unsigned int v186;  // w9
    unsigned int v187;  // w9
    unsigned int v188;  // w16
    unsigned int v189;  // w21
    unsigned int v190;  // w13
    unsigned int v191;  // w10
    unsigned int v39;  // w11
    unsigned int v192;  // w17
    unsigned int v193;  // w8
    unsigned int v194;  // w15
    unsigned int v195;  // w14
    unsigned int v196;  // w10
    unsigned int v197;  // w10
    unsigned int v198;  // w23
    unsigned int v199;  // w3
    unsigned long v200;  // x19
    unsigned int v201;  // w13
    unsigned int v40;  // w2
    unsigned int v202;  // w12
    unsigned int v203;  // w16
    unsigned int v204;  // w17
    unsigned int v205;  // w5
    unsigned int v206;  // w12
    unsigned int v207;  // w8
    unsigned int v208;  // w8
    unsigned int v209;  // w0
    unsigned int v210;  // w11
    unsigned int v211;  // w2
    unsigned int v41;  // w13
    unsigned int v212;  // w15
    unsigned int v213;  // w13
    unsigned int v214;  // w13
    unsigned int v215;  // w22
    unsigned int v216;  // w16
    unsigned int v217;  // w17
    unsigned int v218;  // w9
    unsigned int v219;  // w17
    unsigned int v220;  // w5
    unsigned int v221;  // w11
    unsigned int v24;  // w15
    unsigned int v42;  // w14
    unsigned int v222;  // w14
    unsigned int v223;  // w15
    unsigned int v224;  // w24
    unsigned int v225;  // w13
    unsigned int v226;  // w16
    unsigned int v227;  // w11
    unsigned int v228;  // w10
    unsigned int v229;  // w14
    unsigned int v230;  // w4
    unsigned int v231;  // w17
    unsigned int v43;  // w12
    unsigned int v232;  // w3
    unsigned int v233;  // w3
    unsigned int v234;  // w15
    unsigned int v235;  // w13
    unsigned int v236;  // w13
    unsigned int v237;  // w14
    unsigned int v238;  // w12
    unsigned int v239;  // w28
    unsigned int v240;  // w16
    unsigned int v241;  // w16
    unsigned int v44;  // w13
    unsigned int v242;  // w17
    unsigned int v243;  // w9
    unsigned int v244;  // w12
    unsigned int v245;  // w15
    unsigned int v246;  // w12
    unsigned int v247;  // w13
    unsigned int v248;  // w25
    unsigned int v249;  // w14
    unsigned int v250;  // w8
    unsigned int v251;  // w8
    unsigned int v45;  // w10
    unsigned int v252;  // w14
    unsigned int v253;  // w16
    unsigned int v254;  // w11
    unsigned int v255;  // w4
    unsigned int v256;  // w17
    unsigned int v257;  // w17
    unsigned int v258;  // w12
    unsigned int v259;  // w10
    unsigned int v260;  // w13
    unsigned int v261;  // w13
    unsigned int v46;  // w25
    unsigned int v262;  // w14
    unsigned int v263;  // w15
    unsigned int v264;  // w10
    unsigned int v265;  // w9
    unsigned int v266;  // w3
    unsigned int v267;  // w17
    unsigned int v268;  // w12
    unsigned int v269;  // w10
    unsigned int v270;  // w10
    unsigned int v271;  // w12
    unsigned int v47;  // w14
    unsigned int v272;  // w13
    unsigned int v273;  // w8
    unsigned int v274;  // w14
    unsigned int v275;  // w14
    unsigned int v276;  // w16
    unsigned int v277;  // w11
    unsigned int v278;  // w7
    unsigned int v279;  // w17
    unsigned int v280;  // w17
    unsigned int v281;  // w12
    unsigned int v48;  // w11
    unsigned int v282;  // w11
    unsigned int v283;  // w9
    unsigned int v284;  // w13
    unsigned int v285;  // w3
    unsigned int v286;  // w14
    unsigned int v287;  // w16
    unsigned int v288;  // w9
    unsigned int v289;  // w9
    unsigned int v290;  // w20
    unsigned int v291;  // w15
    unsigned int v49;  // w26
    unsigned int v292;  // w16
    unsigned int v293;  // w5
    unsigned int v294;  // w12
    unsigned int v295;  // w12
    unsigned int v296;  // w17
    unsigned int v297;  // w8
    unsigned int v298;  // w10
    unsigned int v299;  // w14
    unsigned int v300;  // w15
    unsigned int v301;  // w10
    unsigned int v50;  // w10
    unsigned int v302;  // w8
    unsigned int v303;  // w11
    unsigned int v304;  // w16
    unsigned int v305;  // w12
    unsigned int v306;  // w24
    unsigned int v307;  // w17
    unsigned int v308;  // w8
    unsigned int v309;  // w8
    unsigned int v310;  // w13
    unsigned int v311;  // w14
    unsigned int v51;  // w21
    unsigned int v312;  // w6
    unsigned int v313;  // w15
    unsigned int v314;  // w15
    unsigned int v315;  // w26
    unsigned int v316;  // w16
    unsigned int v317;  // w12
    unsigned int v318;  // w3
    unsigned int v319;  // w12
    unsigned int v320;  // w13
    unsigned int v321;  // w14
    unsigned int v25;  // w17
    unsigned int v52;  // w5
    unsigned int v322;  // w9
    unsigned int v323;  // w9
    unsigned int v324;  // w14
    unsigned int v325;  // w15
    unsigned int v326;  // w11
    unsigned int v327;  // w16
    unsigned int v328;  // w13
    unsigned int v329;  // w3
    unsigned int v330;  // w11
    unsigned int v331;  // w3
    unsigned int v53;  // w12
    unsigned int v332;  // w14
    unsigned int v333;  // w15
    unsigned int v334;  // w10
    unsigned int v335;  // w15
    unsigned int v336;  // w16
    unsigned int v337;  // w13
    unsigned int v338;  // w13
    unsigned int v339;  // w24
    unsigned int v340;  // w17
    unsigned int v341;  // w14
    unsigned int v54;  // w13
    unsigned int v342;  // w10
    unsigned int v343;  // w14
    unsigned int v344;  // w12
    unsigned int v345;  // w15
    unsigned int v346;  // w15
    unsigned int v347;  // w21
    unsigned int v348;  // w13
    unsigned int v349;  // w16
    unsigned int v350;  // w16
    unsigned int v351;  // w12
    unsigned int v55;  // w11
    unsigned int v352;  // w14
    unsigned int v353;  // w17
    unsigned int v354;  // w8
    unsigned int v355;  // w8
    unsigned int v356;  // w17
    unsigned int v357;  // w15
    unsigned int v358;  // w13
    unsigned int v359;  // w13
    unsigned int v360;  // w1
    unsigned int v361;  // w16
    unsigned int v56;  // w12
    unsigned int v362;  // w14
    unsigned int v363;  // w9
    unsigned int v364;  // w14
    unsigned int v365;  // w17
    unsigned int v366;  // w2
    unsigned int v367;  // w28
    unsigned int v368;  // w15
    unsigned int v369;  // w11
    unsigned int v370;  // w15
    unsigned int v371;  // w13
    unsigned int v57;  // w14
    unsigned int v372;  // w16
    unsigned int v373;  // w11
    unsigned int v374;  // w10
    unsigned int v375;  // w16
    unsigned int v376;  // w14
    unsigned int v377;  // w17
    unsigned int v378;  // w17
    unsigned long v379;  // x7
    unsigned int v380;  // w15
    unsigned int v381;  // w13
    unsigned int v58;  // w22
    unsigned int v382;  // w13
    unsigned int v383;  // w16
    unsigned int v384;  // w12
    unsigned int v385;  // w14
    unsigned int v386;  // w14
    unsigned int v387;  // w17
    unsigned int v388;  // w9
    unsigned int v389;  // w12
    unsigned int v390;  // w8
    unsigned int v391;  // w12
    unsigned int v59;  // w1
    unsigned int v392;  // w13
    unsigned int v393;  // w16
    unsigned int v394;  // w15
    unsigned int v395;  // w15
    unsigned int v396;  // w16
    unsigned int v397;  // w14
    unsigned int v398;  // w11
    unsigned int v399;  // w27
    unsigned int v400;  // w17
    unsigned int v401;  // w17
    unsigned int v60;  // w13
    unsigned int v402;  // w12
    unsigned int v403;  // w10
    unsigned int v404;  // w13
    unsigned int v405;  // w13
    unsigned int v406;  // w16
    unsigned int v407;  // w8
    unsigned int v408;  // w10
    unsigned int v409;  // w9
    unsigned int v410;  // w14
    unsigned int v411;  // w14
    unsigned int v61;  // w10
    unsigned int v412;  // w10
    unsigned int v413;  // w17
    unsigned int v414;  // w15
    unsigned int v415;  // w11
    unsigned int v416;  // w12
    unsigned int v417;  // w12
    unsigned int v418;  // w13
    unsigned int v419;  // w19
    unsigned int v420;  // w9
    unsigned int v421;  // w11
    unsigned int v26;  // w11
    unsigned int v62;  // w14
    unsigned int v422;  // w8
    unsigned int v423;  // w16
    unsigned int v424;  // w16
    unsigned int v425;  // w11
    unsigned int v426;  // w10
    unsigned int v427;  // w14
    unsigned int v428;  // w15
    unsigned int v429;  // w17
    unsigned int v430;  // w17
    unsigned int v431;  // w12
    unsigned int v63;  // w0
    unsigned int v432;  // w4
    unsigned int v433;  // w8
    unsigned int v434;  // w13
    unsigned int v435;  // w9
    unsigned int v436;  // w15
    unsigned int v437;  // w15
    unsigned int v438;  // w13
    unsigned int v439;  // w11
    unsigned int v440;  // w16
    unsigned int v441;  // w14
    unsigned long v64;  // x24
    unsigned int v442;  // w10
    unsigned int v443;  // w10
    unsigned int v444;  // w17
    unsigned int v445;  // w9
    unsigned int v446;  // w12
    unsigned int v447;  // w8
    unsigned int v448;  // w14
    unsigned int v449;  // w14
    unsigned int v450;  // w2
    unsigned int v451;  // w12
    unsigned int v65;  // w11
    unsigned int v452;  // w13
    unsigned int v453;  // w15
    unsigned int v454;  // w16
    unsigned int v455;  // w11
    unsigned int v456;  // w11
    unsigned int v457;  // w10
    unsigned int v458;  // w4
    unsigned int v459;  // w8
    unsigned int v460;  // w16
    unsigned int v461;  // w9
    unsigned int v66;  // w12
    unsigned int v462;  // w17
    unsigned int v463;  // w17
    unsigned int v464;  // w16
    unsigned int v465;  // w12
    unsigned int v466;  // w14
    unsigned int v467;  // w15
    unsigned int v468;  // w13
    unsigned int v469;  // w13
    unsigned int v470;  // w3
    unsigned int v471;  // w11
    unsigned int v67;  // w10
    unsigned int v472;  // w10
    unsigned int v473;  // w5
    unsigned int v474;  // w8
    unsigned int v475;  // w9
    unsigned int v476;  // w14
    unsigned int v477;  // w15
    unsigned int v478;  // w8
    unsigned int v479;  // w12
    unsigned int v480;  // w13
    unsigned int v481;  // w10
    unsigned int v68;  // w11
    unsigned int v482;  // w16
    unsigned int v483;  // w14
    unsigned int v484;  // w15
    unsigned int v485;  // w12
    unsigned int v486;  // w10
    unsigned int v487;  // w13
    unsigned int v488;  // w16
    unsigned int v489;  // w2
    unsigned int v490;  // w14
    unsigned int v491;  // w11
    unsigned int v69;  // w13
    unsigned int v492;  // w15
    unsigned int v493;  // w13
    unsigned int v494;  // w12
    unsigned long long v495;  // x9
    unsigned int v496;  // w16
    unsigned int v497;  // w0
    unsigned int v498;  // w11
    unsigned int v499;  // w14
    unsigned int v500;  // w8
    unsigned int v501;  // w15
    unsigned int v70;  // w3
    unsigned int v502;  // w12
    unsigned int v503;  // w16
    unsigned int v504;  // w13
    unsigned int v505;  // w10
    unsigned int v506;  // w14
    unsigned int v507;  // w17
    unsigned int v508;  // w15
    unsigned int v509;  // w13
    unsigned int v510;  // w12
    unsigned int v511;  // w16
    unsigned int v71;  // w27
    unsigned int v512;  // w17
    unsigned int v513;  // w12
    unsigned int v514;  // w15
    unsigned int v515;  // w13
    unsigned int v516;  // w16
    unsigned int v517;  // w9
    unsigned int v518;  // w11
    unsigned int v519;  // w12
    unsigned int *v520;  // x0
    unsigned int v521;  // w15
    unsigned int v27;  // w10
    unsigned int v72;  // w12
    unsigned int *v522;  // x9
    unsigned int v73;  // w14
    unsigned int v74;  // w10
    unsigned int v75;  // w13
    unsigned int v76;  // w11
    unsigned int v77;  // w11
    unsigned int v78;  // w14
    unsigned int v79;  // w12
    unsigned int v80;  // w12
    unsigned int v81;  // w10
    unsigned int v28;  // w20
    unsigned int v82;  // w13
    unsigned int v83;  // w13
    unsigned int v84;  // w11
    unsigned int v85;  // w14
    unsigned int v86;  // w14
    unsigned int v87;  // w12
    unsigned int v88;  // w10
    unsigned int v89;  // w10
    unsigned int v90;  // w13
    unsigned int v91;  // w11
    unsigned int v29;  // w4
    unsigned int v92;  // w11
    unsigned int v93;  // w14
    unsigned int v94;  // w12
    unsigned int v95;  // w12
    unsigned int v96;  // w10
    unsigned int v97;  // w13
    unsigned int v98;  // w13
    unsigned int v99;  // w11
    unsigned int v100;  // w14
    unsigned int v101;  // w14
    unsigned int v30;  // w10
    unsigned int v102;  // w12
    unsigned int v103;  // w6
    unsigned int v104;  // w10
    unsigned int v105;  // w10
    unsigned int v106;  // w13
    unsigned int v107;  // w11
    unsigned int v108;  // w11
    unsigned int v109;  // w14
    unsigned int v110;  // w12
    unsigned int v111;  // w12
    unsigned int v31;  // w7
    unsigned int v112;  // w10
    unsigned int v113;  // w20
    unsigned int v114;  // w13
    unsigned int v115;  // w13
    unsigned int v116;  // w11
    unsigned int v117;  // w14
    unsigned int v118;  // w12
    unsigned int v119;  // w14
    unsigned int v120;  // w10
    unsigned int v121;  // w13
    unsigned int v0;  // [bp-0xbc]
    unsigned int v1;  // [bp-0xb8]
    unsigned int v2;  // [bp-0xb4]
    unsigned int v3;  // [bp-0xb0]
    unsigned int v4;  // [bp-0xac]
    unsigned int v5;  // [bp-0xa8]
    unsigned int v6;  // [bp-0xa4]
    unsigned int v7;  // [bp-0xa0]
    unsigned int v8;  // [bp-0x9c]
    unsigned long long v9;  // [bp-0x98]
    unsigned int v10;  // [bp-0x8c]
    unsigned int v11;  // [bp-0x88]
    unsigned int v12;  // [bp-0x84]
    unsigned int v13;  // [bp-0x80]
    unsigned int v14;  // [bp-0x7c]
    unsigned int v15;  // [bp-0x78]
    unsigned int v16;  // [bp-0x74]
    unsigned int v17;  // [bp-0x70]
    unsigned int v18;  // [bp-0x6c]
    unsigned int *v19;  // [bp-0x68]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    if (!i)
        return a0;
    v22 = a0;
    v23 = *v22;
    v24 = v22[1];
    v25 = v22[2];
    v26 = v22[3];
    v27 = v22[4];
    do
    {
        v19 = a1;
        v15 = v25;
        v16 = v27;
        v17 = v23;
        v9 = i;
        v28 = *a1;
        v29 = a1[1];
        v30 = (((v25 ^ v24 ^ v26) + v23 + v28) * 0x800 | (v25 ^ v24 ^ v26) + v23 + v28 >> 21) + v27;
        v31 = __ROL__(v25, 10);
        v32 = v26;
        v33 = __ROL__(v24, 10);
        v13 = v24;
        v14 = v32;
        v34 = ((v29 + v27 + (v31 ^ v24 ^ v30)) * 0x4000 | v29 + v27 + (v31 ^ v24 ^ v30) >> 18) + v32;
        v35 = a1[2];
        v36 = a1[3];
        v37 = __ROL__(v30, 10);
        v38 = ((v35 + v32 + (v30 ^ v33 ^ v34)) * 0x8000 | v35 + v32 + (v30 ^ v33 ^ v34) >> 0x11) + v31;
        v39 = __ROL__(v34, 10);
        v40 = a1[5];
        v41 = ((v36 + v31 + (v34 ^ v37 ^ v38)) * 0x1000 | v36 + v31 + (v34 ^ v37 ^ v38) >> 20) + v33;
        w30 = a1[4];
        v42 = ((w30 + v33 + (v38 ^ v39 ^ v41)) * 32 | w30 + v33 + (v38 ^ v39 ^ v41) >> 27) + v37;
        v43 = __ROL__(v38, 10);
        v5 = v40;
        v44 = __ROL__(v41, 10);
        v45 = ((v40 + v37 + (v41 ^ v43 ^ v42)) * 0x100 | v40 + v37 + (v41 ^ v43 ^ v42) >> 24) + v39;
        v46 = a1[6];
        v47 = __ROL__(v42, 10);
        v48 = ((v46 + v39 + (v42 ^ v44 ^ v45)) * 128 | v46 + v39 + (v42 ^ v44 ^ v45) >> 25) + v43;
        v49 = a1[7];
        v50 = __ROL__(v45, 10);
        v51 = a1[8];
        v52 = a1[9];
        v53 = ((v49 + v43 + (v45 ^ v47 ^ v48)) * 0x200 | v49 + v43 + (v45 ^ v47 ^ v48) >> 23) + v44;
        v54 = ((v51 + v44 + (v48 ^ v50 ^ v53)) * 0x800 | v51 + v44 + (v48 ^ v50 ^ v53) >> 21) + v47;
        v55 = __ROL__(v48, 10);
        v56 = __ROL__(v53, 10);
        v57 = ((v52 + v47 + (v53 ^ v55 ^ v54)) * 0x2000 | v52 + v47 + (v53 ^ v55 ^ v54) >> 19) + v50;
        v58 = a1[11];
        v59 = a1[10];
        v60 = __ROL__(v54, 10);
        v61 = ((v59 + v50 + (v54 ^ v56 ^ v57)) * 0x4000 | v59 + v50 + (v54 ^ v56 ^ v57) >> 18) + v55;
        v62 = __ROL__(v57, 10);
        v63 = v19[12];
        v64 = v19[13];
        v65 = ((v58 + v55 + (v57 ^ v60 ^ v61)) * 0x8000 | v58 + v55 + (v57 ^ v60 ^ v61) >> 0x11) + v56;
        v7 = v63;
        v66 = ((v63 + v56 + (v61 ^ v62 ^ v65)) * 64 | v63 + v56 + (v61 ^ v62 ^ v65) >> 26) + v60;
        v67 = __ROL__(v61, 10);
        v68 = __ROL__(v65, 10);
        v69 = ((v60 + (unsigned int)v64 + (v65 ^ v67 ^ v66)) * 128 | v60 + (unsigned int)v64 + (v65 ^ v67 ^ v66) >> 25) + v62;
        v70 = v19[15];
        v71 = v19[14];
        v72 = __ROL__(v66, 10);
        v73 = ((v62 + v71 + (v66 ^ v68 ^ v69)) * 0x200 | v62 + v71 + (v66 ^ v68 ^ v69) >> 23) + v67;
        v74 = ((v67 + v70 + (v69 ^ v72 ^ v73)) * 0x100 | v67 + v70 + (v69 ^ v72 ^ v73) >> 24) + v68;
        v75 = __ROL__(v69, 10);
        v76 = v49 + 1518500249 + v68 + (v73 & v74 | v75 & ~v74);
        v77 = (v76 * 128 | v76 >> 25) + v72;
        v78 = __ROL__(v73, 10);
        v79 = w30 + 1518500249 + v72 + (v74 & v77 | v78 & ~v77);
        v80 = (v79 * 64 | v79 >> 26) + v75;
        v81 = __ROL__(v74, 10);
        v82 = (unsigned int)v64 + 1518500249 + v75 + (v77 & v80 | v81 & ~v80);
        v83 = (v82 * 0x100 | v82 >> 24) + v78;
        v84 = __ROL__(v77, 10);
        v18 = v29;
        v85 = v29 + 1518500249 + v78 + (v80 & v83 | v84 & ~v83);
        v86 = (v85 * 0x2000 | v85 >> 19) + v81;
        v87 = __ROL__(v80, 10);
        v12 = v59;
        v88 = v59 + 1518500249 + v81 + (v83 & v86 | v87 & ~v86);
        v89 = (v88 * 0x800 | v88 >> 21) + v84;
        v90 = __ROL__(v83, 10);
        v91 = v46 + 1518500249 + v84 + (v86 & v89 | v90 & ~v89);
        v92 = (v91 * 0x200 | v91 >> 23) + v87;
        v93 = __ROL__(v86, 10);
        v6 = v70;
        v94 = v70 + 1518500249 + v87 + (v89 & v92 | v93 & ~v92);
        v95 = (v94 * 128 | v94 >> 25) + v90;
        v96 = __ROL__(v89, 10);
        v8 = v36;
        v97 = v36 + 1518500249 + v90 + (v92 & v95 | v96 & ~v95);
        v98 = (v97 * 0x8000 | v97 >> 0x11) + v93;
        v99 = __ROL__(v92, 10);
        v100 = v63 + 1518500249 + v93 + (v95 & v98 | v99 & ~v98);
        v101 = (v100 * 128 | v100 >> 25) + v96;
        v102 = __ROL__(v95, 10);
        v103 = v28;
        v104 = v28 + 1518500249 + v96 + (v98 & v101 | v102 & ~v101);
        v105 = (v104 * 0x1000 | v104 >> 20) + v99;
        v106 = __ROL__(v98, 10);
        v107 = v52 + 1518500249 + v99 + (v101 & v105 | v106 & ~v105);
        v108 = (v107 * 0x8000 | v107 >> 0x11) + v102;
        v109 = __ROL__(v101, 10);
        v110 = v40 + 1518500249 + v102 + (v105 & v108 | v109 & ~v108);
        v111 = (v110 * 0x200 | v110 >> 23) + v106;
        v112 = __ROL__(v105, 10);
        v113 = v35;
        v114 = v35 + 1518500249 + v106 + (v108 & v111 | v112 & ~v111);
        v115 = (v114 * 0x800 | v114 >> 21) + v109;
        v116 = __ROL__(v108, 10);
        v117 = v71 + 1518500249 + v109 + (v111 & v115 | v116 & ~v115);
        v118 = __ROL__(v111, 10);
        v119 = (v117 * 128 | v117 >> 25) + v112;
        v120 = v58 + 1518500249 + v112 + (v115 & v119 | v118 & ~v119);
        v121 = __ROL__(v115, 10);
        v122 = (v120 * 0x2000 | v120 >> 19) + v116;
        v123 = v51;
        v124 = v51 + 1518500249 + v116 + (v119 & v122 | v121 & ~v122);
        v125 = (v124 * 0x1000 | v124 >> 20) + v118;
        v126 = __ROL__(v119, 10);
        v127 = v36 + 1859775393 + v118 + ((v125 | ~v122) ^ v126);
        v128 = (v127 * 0x800 | v127 >> 21) + v121;
        v129 = __ROL__(v122, 10);
        v130 = v59 + 1859775393 + v121 + ((v128 | ~v125) ^ v129);
        v131 = __ROL__(v125, 10);
        v132 = (v130 * 0x2000 | v130 >> 19) + v126;
        v10 = v71;
        v133 = v71 + 1859775393 + v126 + ((v132 | ~v128) ^ v131);
        v134 = (v133 * 64 | v133 >> 26) + v129;
        v135 = __ROL__(v128, 10);
        v1 = w30;
        v136 = w30 + 1859775393 + v129 + ((v134 | ~v132) ^ v135);
        v137 = (v136 * 128 | v136 >> 25) + v131;
        v138 = __ROL__(v132, 10);
        v139 = v52;
        v140 = v52 + 1859775393 + v131 + ((v137 | ~v134) ^ v138);
        v141 = __ROL__(v134, 10);
        v142 = (v140 * 0x4000 | v140 >> 18) + v135;
        v143 = v70 + 1859775393 + v135 + ((v142 | ~v137) ^ v141);
        v144 = (v143 * 0x200 | v143 >> 23) + v138;
        v145 = __ROL__(v137, 10);
        v146 = v123 + 1859775393 + v138 + ((v144 | ~v142) ^ v145);
        v147 = (v146 * 0x2000 | v146 >> 19) + v141;
        v148 = __ROL__(v142, 10);
        v149 = v29 + 1859775393 + v141 + ((v147 | ~v144) ^ v148);
        v150 = __ROL__(v144, 10);
        v151 = (v149 * 0x8000 | v149 >> 0x11) + v145;
        v4 = v113;
        v152 = v113 + 1859775393 + v145 + ((v151 | ~v147) ^ v150);
        v153 = (v152 * 0x4000 | v152 >> 18) + v148;
        v154 = __ROL__(v147, 10);
        v155 = v49 + 1859775393 + v148 + ((v153 | ~v151) ^ v154);
        v156 = (v155 * 0x100 | v155 >> 24) + v150;
        v157 = __ROL__(v151, 10);
        v158 = v103;
        v159 = v103 + 1859775393 + v150 + ((v156 | ~v153) ^ v157);
        v160 = (v159 * 0x2000 | v159 >> 19) + v154;
        v161 = __ROL__(v153, 10);
        v162 = v46 + 1859775393 + v154 + ((v160 | ~v156) ^ v161);
        v163 = v14;
        v164 = v13;
        v165 = v16;
        v166 = (v162 * 64 | v162 >> 26) + v157;
        v167 = ((v17 + 1352829926 + ((v15 | ~v163) ^ v164) + v5) * 0x100 | v17 + 1352829926 + ((v15 | ~v163) ^ v164) + v5 >> 24) + v165;
        v168 = v165 + 1352829926 + v71 + (v167 ^ (v164 | ~v31));
        v169 = (v168 * 0x200 | v168 >> 23) + v163;
        v170 = v49;
        v171 = v163 + 1352829926 + v49 + (v169 ^ (v167 | ~v33));
        v172 = (v171 * 0x200 | v171 >> 23) + v31;
        v173 = __ROL__(v167, 10);
        v174 = v31 + 1352829926 + v158 + (v172 ^ (v169 | ~v173));
        v175 = __ROL__(v156, 10);
        v176 = (unsigned int)v64 + 1859775393 + v157 + ((v166 | ~v160) ^ v175);
        v177 = (v176 * 32 | v176 >> 27) + v161;
        v178 = (v174 * 0x800 | v174 >> 21) + v33;
        v179 = __ROL__(v169, 10);
        v180 = v139;
        v181 = v33 + 1352829926 + v139 + (v178 ^ (v172 | ~v179));
        v182 = (v181 * 0x2000 | v181 >> 19) + v173;
        v183 = __ROL__(v172, 10);
        v184 = v113 + 1352829926 + v173 + (v182 ^ (v178 | ~v183));
        v185 = __ROL__(v160, 10);
        v186 = v58 + 1859775393 + v161 + ((v177 | ~v166) ^ v185);
        v187 = (v186 * 0x1000 | v186 >> 20) + v175;
        v188 = (v184 * 0x8000 | v184 >> 0x11) + v179;
        v189 = v58;
        v190 = __ROL__(v178, 10);
        v191 = v58 + 1352829926 + v179 + (v188 ^ (v182 | ~v190));
        v192 = (v191 * 0x8000 | v191 >> 0x11) + v183;
        v193 = __ROL__(v182, 10);
        v194 = w30 + 1352829926 + v183 + (v192 ^ (v188 | ~v193));
        v195 = __ROL__(v166, 10);
        v196 = v5 + 1859775393 + v175 + ((v187 | ~v177) ^ v195);
        v197 = (v196 * 128 | v196 >> 25) + v185;
        v198 = v7;
        v199 = (v194 * 32 | v194 >> 27) + v190;
        v200 = v64;
        v201 = __ROL__(v188, 10);
        v202 = (unsigned int)v64 + 1352829926 + v190 + (v199 ^ (v192 | ~v201));
        v203 = (v202 * 128 | v202 >> 25) + v193;
        v204 = __ROL__(v192, 10);
        v205 = v46 + 1352829926 + v193 + (v203 ^ (v199 | ~v204));
        v206 = __ROL__(v177, 10);
        v207 = v198 + 1859775393 + v185 + ((v197 | ~v187) ^ v206);
        v208 = (v207 * 32 | v207 >> 27) + v195;
        v209 = v18;
        v210 = (v205 * 128 | v205 >> 25) + v201;
        v211 = v6;
        v212 = __ROL__(v199, 10);
        v213 = v211 + 1352829926 + v201 + (v210 ^ (v203 | ~v212));
        v214 = (v213 * 0x100 | v213 >> 24) + v204;
        v215 = v123;
        v216 = __ROL__(v203, 10);
        v217 = v123 + 1352829926 + v204 + (v214 ^ (v210 | ~v216));
        v218 = __ROL__(v187, 10);
        v219 = (v217 * 0x800 | v217 >> 21) + v212;
        v220 = __ROL__(v210, 10);
        v221 = v209 + 1352829926 + v212 + (v219 ^ (v214 | ~v220));
        v222 = v209 + 2400959708 + v195 + (v208 & v218 | v197 & ~v218);
        v223 = (v221 * 0x4000 | v221 >> 18) + v216;
        v224 = v12;
        v225 = __ROL__(v214, 10);
        v226 = v224 + 1352829926 + v216 + (v223 ^ (v219 | ~v225));
        v227 = (v222 * 0x800 | v222 >> 21) + v206;
        v228 = __ROL__(v197, 10);
        v229 = (v226 * 0x4000 | v226 >> 18) + v220;
        v230 = v8;
        v231 = __ROL__(v219, 10);
        v232 = v230 + 1352829926 + v220 + (v229 ^ (v223 | ~v231));
        v233 = (v232 * 0x1000 | v232 >> 20) + v225;
        v234 = __ROL__(v223, 10);
        v235 = v198 + 1352829926 + v225 + (v233 ^ (v229 | ~v234));
        v236 = (v235 * 64 | v235 >> 26) + v231;
        v237 = __ROL__(v229, 10);
        v238 = v180 + 2400959708 + v206 + (v227 & v228 | v208 & ~v228);
        v239 = v46;
        v240 = v46 + 1548603684 + v231 + (v236 & v237 | v233 & ~v237);
        v241 = (v240 * 0x200 | v240 >> 23) + v234;
        v242 = __ROL__(v233, 10);
        v3 = v189;
        v243 = (v238 * 0x1000 | v238 >> 20) + v218;
        v244 = v189 + 1548603684 + v234 + (v241 & v242 | v236 & ~v242);
        v245 = __ROL__(v208, 10);
        v246 = (v244 * 0x2000 | v244 >> 19) + v237;
        v247 = __ROL__(v236, 10);
        v248 = v230;
        v249 = v230 + 1548603684 + v237 + (v246 & v247 | v241 & ~v247);
        v250 = v189 + 2400959708 + v218 + (v243 & v245 | v227 & ~v245);
        v251 = (v250 * 0x4000 | v250 >> 18) + v228;
        v252 = (v249 * 0x8000 | v249 >> 0x11) + v242;
        v253 = __ROL__(v241, 10);
        v254 = __ROL__(v227, 10);
        v255 = v170;
        v256 = v170 + 1548603684 + v242 + (v252 & v253 | v246 & ~v253);
        v257 = (v256 * 128 | v256 >> 25) + v247;
        v258 = __ROL__(v246, 10);
        v259 = v224 + 2400959708 + v228 + (v251 & v254 | v243 & ~v254);
        v11 = v158;
        v260 = v158 + 1548603684 + v247 + (v257 & v258 | v252 & ~v258);
        v261 = (v260 * 0x1000 | v260 >> 20) + v253;
        v262 = __ROL__(v252, 10);
        v263 = (v259 * 0x8000 | v259 >> 0x11) + v245;
        v264 = (unsigned int)v200 + 1548603684 + v253 + (v261 & v262 | v257 & ~v262);
        v265 = __ROL__(v243, 10);
        v266 = (v264 * 0x100 | v264 >> 24) + v258;
        v267 = __ROL__(v257, 10);
        v268 = v5 + 1548603684 + v258 + (v266 & v267 | v261 & ~v267);
        v269 = v158 + 2400959708 + v245 + (v263 & v265 | v251 & ~v265);
        v270 = (v269 * 0x4000 | v269 >> 18) + v254;
        v271 = (v268 * 0x200 | v268 >> 23) + v262;
        v272 = __ROL__(v261, 10);
        v273 = __ROL__(v251, 10);
        v274 = v224 + 1548603684 + v262 + (v271 & v272 | v266 & ~v272);
        v275 = (v274 * 0x800 | v274 >> 21) + v267;
        v276 = __ROL__(v266, 10);
        v277 = v215 + 2400959708 + v254 + (v270 & v273 | v263 & ~v273);
        v278 = v10;
        v279 = v278 + 1548603684 + v267 + (v275 & v276 | v271 & ~v276);
        v280 = (v279 * 128 | v279 >> 25) + v272;
        v281 = __ROL__(v271, 10);
        v282 = (v277 * 0x8000 | v277 >> 0x11) + v265;
        v283 = v211 + 1548603684 + v272 + (v280 & v281 | v275 & ~v281);
        v284 = __ROL__(v263, 10);
        v285 = (v283 * 128 | v283 >> 25) + v276;
        v286 = __ROL__(v275, 10);
        v287 = v215 + 1548603684 + v276 + (v285 & v286 | v280 & ~v286);
        v288 = v198 + 2400959708 + v265 + (v282 & v284 | v270 & ~v284);
        v289 = (v288 * 0x200 | v288 >> 23) + v273;
        v290 = v1;
        v291 = (v287 * 0x1000 | v287 >> 20) + v281;
        v292 = __ROL__(v280, 10);
        v293 = __ROL__(v270, 10);
        v294 = v198 + 1548603684 + v281 + (v291 & v292 | v285 & ~v292);
        v295 = (v294 * 128 | v294 >> 25) + v286;
        v296 = __ROL__(v285, 10);
        v297 = v290 + 2400959708 + v273 + (v289 & v293 | v282 & ~v293);
        v298 = v290 + 1548603684 + v286 + (v295 & v296 | v291 & ~v296);
        v299 = (v298 * 64 | v298 >> 26) + v292;
        v300 = __ROL__(v291, 10);
        v0 = v180;
        v301 = (v297 * 0x100 | v297 >> 24) + v284;
        v302 = v180 + 1548603684 + v292 + (v299 & v300 | v295 & ~v300);
        v303 = __ROL__(v282, 10);
        v304 = (v302 * 0x8000 | v302 >> 0x11) + v296;
        v305 = __ROL__(v295, 10);
        v306 = v18;
        v307 = v306 + 1548603684 + v296 + (v304 & v305 | v299 & ~v305);
        v308 = (unsigned int)v200 + 2400959708 + v284 + (v301 & v303 | v289 & ~v303);
        v309 = (v308 * 0x200 | v308 >> 23) + v293;
        v310 = (v307 * 0x2000 | v307 >> 19) + v300;
        v311 = __ROL__(v299, 10);
        v312 = v4;
        v313 = v312 + 1548603684 + v300 + (v310 & v311 | v304 & ~v311);
        v314 = (v313 * 0x800 | v313 >> 21) + v305;
        v315 = v211;
        v316 = __ROL__(v304, 10);
        v317 = v211 + 1836072691 + v305 + ((v314 | ~v310) ^ v316);
        v318 = (v317 * 0x200 | v317 >> 23) + v311;
        v319 = __ROL__(v289, 10);
        v320 = __ROL__(v310, 10);
        v321 = v5 + 1836072691 + v311 + ((v318 | ~v314) ^ v320);
        v322 = v248 + 2400959708 + v293 + (v309 & v319 | v301 & ~v319);
        v323 = (v322 * 0x4000 | v322 >> 18) + v303;
        v2 = v255;
        v324 = (v321 * 128 | v321 >> 25) + v316;
        v325 = __ROL__(v314, 10);
        v326 = v306 + 1836072691 + v316 + ((v324 | ~v318) ^ v325);
        v327 = (v326 * 0x8000 | v326 >> 0x11) + v320;
        v328 = __ROL__(v318, 10);
        v329 = v248 + 1836072691 + v320 + ((v327 | ~v324) ^ v328);
        v330 = __ROL__(v301, 10);
        v331 = (v329 * 0x800 | v329 >> 21) + v325;
        v332 = __ROL__(v324, 10);
        v333 = v255 + 1836072691 + v325 + ((v331 | ~v327) ^ v332);
        v334 = v255 + 2400959708 + v303 + (v323 & v330 | v309 & ~v330);
        v335 = (v333 * 0x100 | v333 >> 24) + v328;
        v336 = __ROL__(v327, 10);
        v337 = v278 + 1836072691 + v328 + ((v335 | ~v331) ^ v336);
        v338 = (v337 * 64 | v337 >> 26) + v332;
        v339 = v239;
        v340 = __ROL__(v331, 10);
        v341 = v239 + 1836072691 + v332 + ((v338 | ~v335) ^ v340);
        v342 = (v334 * 32 | v334 >> 27) + v319;
        v343 = (v341 * 64 | v341 >> 26) + v336;
        v344 = __ROL__(v335, 10);
        v345 = v180 + 1836072691 + v336 + ((v343 | ~v338) ^ v344);
        v346 = (v345 * 0x4000 | v345 >> 18) + v340;
        v347 = v3;
        v348 = __ROL__(v338, 10);
        v349 = v347 + 1836072691 + v340 + ((v346 | ~v343) ^ v348);
        v350 = (v349 * 0x1000 | v349 >> 20) + v344;
        v351 = __ROL__(v309, 10);
        v352 = __ROL__(v343, 10);
        v353 = v215 + 1836072691 + v344 + ((v350 | ~v346) ^ v352);
        v354 = v211 + 2400959708 + v319 + (v342 & v351 | v323 & ~v351);
        v355 = (v354 * 64 | v354 >> 26) + v330;
        v356 = (v353 * 0x2000 | v353 >> 19) + v348;
        v357 = __ROL__(v346, 10);
        v358 = v198 + 1836072691 + v348 + ((v356 | ~v350) ^ v357);
        v359 = (v358 * 32 | v358 >> 27) + v352;
        v360 = v312;
        v361 = __ROL__(v350, 10);
        v362 = v312 + 1836072691 + v352 + ((v359 | ~v356) ^ v361);
        v363 = __ROL__(v323, 10);
        v364 = (v362 * 0x4000 | v362 >> 18) + v357;
        v365 = __ROL__(v356, 10);
        v366 = v11;
        v367 = v12;
        v368 = v367 + 1836072691 + v357 + ((v364 | ~v359) ^ v365);
        v369 = v278 + 2400959708 + v330 + (v355 & v363 | v342 & ~v363);
        v370 = (v368 * 0x2000 | v368 >> 19) + v361;
        v371 = __ROL__(v359, 10);
        v372 = v366 + 1836072691 + v361 + ((v370 | ~v364) ^ v371);
        v373 = (v369 * 0x100 | v369 >> 24) + v351;
        v374 = __ROL__(v342, 10);
        v375 = (v372 * 0x2000 | v372 >> 19) + v365;
        v376 = __ROL__(v364, 10);
        v377 = v290 + 1836072691 + v365 + ((v375 | ~v370) ^ v376);
        v378 = (v377 * 128 | v377 >> 25) + v371;
        v379 = v200;
        v380 = __ROL__(v370, 10);
        v381 = (unsigned int)v200 + 1836072691 + v371 + ((v378 | ~v375) ^ v380);
        v382 = (v381 * 32 | v381 >> 27) + v376;
        v383 = __ROL__(v375, 10);
        v384 = v5 + 2400959708 + v351 + (v373 & v374 | v355 & ~v374);
        v385 = v215 + 2053994217 + v376 + (v378 & v382 | v383 & ~v382);
        v386 = (v385 * 0x8000 | v385 >> 0x11) + v380;
        v387 = __ROL__(v378, 10);
        v388 = (v384 * 64 | v384 >> 26) + v363;
        v389 = v339 + 2053994217 + v380 + (v382 & v386 | v387 & ~v386);
        v390 = __ROL__(v355, 10);
        v391 = (v389 * 32 | v389 >> 27) + v383;
        v392 = __ROL__(v382, 10);
        v393 = v290 + 2053994217 + v383 + (v386 & v391 | v392 & ~v391);
        v394 = v339 + 2400959708 + v363 + (v388 & v390 | v373 & ~v390);
        v395 = (v394 * 32 | v394 >> 27) + v374;
        v396 = (v393 * 0x100 | v393 >> 24) + v387;
        v397 = __ROL__(v386, 10);
        v398 = __ROL__(v373, 10);
        v399 = v18;
        v400 = v399 + 2053994217 + v387 + (v391 & v396 | v397 & ~v396);
        v401 = (v400 * 0x800 | v400 >> 21) + v392;
        v402 = __ROL__(v391, 10);
        v403 = v360 + 2400959708 + v374 + (v395 & v398 | v388 & ~v398);
        v404 = v248 + 2053994217 + v392 + (v396 & v401 | v402 & ~v401);
        v405 = (v404 * 0x4000 | v404 >> 18) + v397;
        v406 = __ROL__(v396, 10);
        v407 = (v403 * 0x1000 | v403 >> 20) + v390;
        v408 = v347 + 2053994217 + v397 + (v401 & v405 | v406 & ~v405);
        v409 = __ROL__(v388, 10);
        v410 = v290 + 0xa953fd4e + v390 + (v407 ^ (v395 | ~v409));
        v411 = (v410 * 0x200 | v410 >> 23) + v398;
        v412 = (v408 * 0x4000 | v408 >> 18) + v402;
        v413 = __ROL__(v401, 10);
        v414 = __ROL__(v395, 10);
        v415 = v366 + 0xa953fd4e + v398 + (v411 ^ (v407 | ~v414));
        v416 = v315 + 2053994217 + v402 + (v405 & v412 | v413 & ~v412);
        v417 = (v416 * 64 | v416 >> 26) + v406;
        v418 = __ROL__(v405, 10);
        v419 = v5;
        v420 = (v415 * 0x8000 | v415 >> 0x11) + v409;
        v421 = v366 + 2053994217 + v406 + (v412 & v417 | v418 & ~v417);
        v422 = __ROL__(v407, 10);
        v423 = v5 + 0xa953fd4e + v409 + (v420 ^ (v411 | ~v422));
        v424 = (v423 * 32 | v423 >> 27) + v414;
        v425 = (v421 * 0x4000 | v421 >> 18) + v413;
        v426 = __ROL__(v412, 10);
        v427 = __ROL__(v411, 10);
        v428 = v0 + 0xa953fd4e + v414 + (v424 ^ (v420 | ~v427));
        v429 = v419 + 2053994217 + v413 + (v417 & v425 | v426 & ~v425);
        v430 = (v429 * 64 | v429 >> 26) + v418;
        v431 = __ROL__(v417, 10);
        v432 = v2;
        v433 = (v428 * 0x800 | v428 >> 21) + v422;
        v434 = v198 + 2053994217 + v418 + (v425 & v430 | v431 & ~v430);
        v435 = __ROL__(v420, 10);
        v436 = v432 + 0xa953fd4e + v422 + (v433 ^ (v424 | ~v435));
        v437 = (v436 * 64 | v436 >> 26) + v427;
        v438 = (v434 * 0x200 | v434 >> 23) + v426;
        v439 = __ROL__(v425, 10);
        v440 = __ROL__(v424, 10);
        v441 = v198 + 0xa953fd4e + v427 + (v437 ^ (v433 | ~v440));
        v442 = v360 + 2053994217 + v426 + (v430 & v438 | v439 & ~v438);
        v443 = (v442 * 0x1000 | v442 >> 20) + v431;
        v444 = __ROL__(v430, 10);
        v445 = (v441 * 0x100 | v441 >> 24) + v435;
        v446 = (unsigned int)v379 + 2053994217 + v431 + (v438 & v443 | v444 & ~v443);
        v447 = __ROL__(v433, 10);
        v448 = v360 + 0xa953fd4e + v435 + (v445 ^ (v437 | ~v447));
        v449 = (v448 * 0x2000 | v448 >> 19) + v440;
        v450 = v367;
        v451 = (v446 * 0x200 | v446 >> 23) + v439;
        v452 = __ROL__(v438, 10);
        v453 = __ROL__(v437, 10);
        v454 = v367 + 0xa953fd4e + v440 + (v449 ^ (v445 | ~v453));
        v455 = v0 + 2053994217 + v439 + (v443 & v451 | v452 & ~v451);
        v456 = (v455 * 0x1000 | v455 >> 20) + v444;
        v457 = __ROL__(v443, 10);
        v458 = v10;
        v459 = (v454 * 0x1000 | v454 >> 20) + v447;
        v460 = v432 + 2053994217 + v444 + (v451 & v456 | v457 & ~v456);
        v461 = __ROL__(v445, 10);
        v462 = v458 + 0xa953fd4e + v447 + (v459 ^ (v449 | ~v461));
        v463 = (v462 * 32 | v462 >> 27) + v453;
        v464 = (v460 * 32 | v460 >> 27) + v452;
        v465 = __ROL__(v451, 10);
        v466 = __ROL__(v449, 10);
        v467 = v399 + 0xa953fd4e + v453 + (v463 ^ (v459 | ~v466));
        v468 = v450 + 2053994217 + v452 + (v456 & v464 | v465 & ~v464);
        v469 = (v468 * 0x8000 | v468 >> 0x11) + v457;
        v470 = __ROL__(v456, 10);
        v471 = (v467 * 0x1000 | v467 >> 20) + v461;
        v472 = v458 + 2053994217 + v457 + (v464 & v469 | v470 & ~v469);
        v473 = __ROL__(v459, 10);
        v474 = v248 + 0xa953fd4e + v461 + (v471 ^ (v463 | ~v473));
        v475 = (v474 * 0x2000 | v474 >> 19) + v466;
        v476 = (v472 * 0x100 | v472 >> 24) + v465;
        v477 = __ROL__(v464, 10);
        v478 = __ROL__(v463, 10);
        v479 = ((v465 + v198 + (v469 ^ v477 ^ v476)) * 0x100 | v465 + v198 + (v469 ^ v477 ^ v476) >> 24) + v470;
        v480 = __ROL__(v469, 10);
        v481 = v215 + 0xa953fd4e + v466 + (v475 ^ (v471 | ~v478));
        v482 = ((v470 + v315 + (v476 ^ v480 ^ v479)) * 32 | v470 + v315 + (v476 ^ v480 ^ v479) >> 27) + v477;
        v483 = __ROL__(v476, 10);
        v484 = ((v477 + v450 + (v479 ^ v483 ^ v482)) * 0x1000 | v477 + v450 + (v479 ^ v483 ^ v482) >> 20) + v480;
        v485 = __ROL__(v479, 10);
        v486 = (v481 * 0x4000 | v481 >> 18) + v473;
        v487 = ((v480 + v290 + (v482 ^ v485 ^ v484)) * 0x200 | v480 + v290 + (v482 ^ v485 ^ v484) >> 23) + v483;
        v488 = __ROL__(v482, 10);
        v489 = __ROL__(v471, 10);
        v490 = v347 + 0xa953fd4e + v473 + (v486 ^ (v475 | ~v489));
        v491 = ((v483 + v399 + (v484 ^ v488 ^ v487)) * 0x1000 | v483 + v399 + (v484 ^ v488 ^ v487) >> 20) + v485;
        v492 = __ROL__(v484, 10);
        v493 = __ROL__(v487, 10);
        v494 = ((v485 + v419 + (v487 ^ v492 ^ v491)) * 32 | v485 + v419 + (v487 ^ v492 ^ v491) >> 27) + v488;
        v495 = v475 * 0x400 | v475 >> 22;
        v496 = ((v488 + v215 + (v491 ^ v493 ^ v494)) * 0x4000 | v488 + v215 + (v491 ^ v493 ^ v494) >> 18) + v492;
        v497 = __ROL__(v491, 10);
        v498 = (v490 * 0x800 | v490 >> 21) + v478;
        v499 = v339 + 0xa953fd4e + v478 + (v498 ^ (v486 | ~(unsigned int)v495));
        v500 = (v499 * 0x100 | v499 >> 24) + v489;
        v501 = ((v492 + v432 + (v494 ^ v497 ^ v496)) * 64 | v492 + v432 + (v494 ^ v497 ^ v496) >> 26) + v493;
        v502 = __ROL__(v494, 10);
        v503 = __ROL__(v496, 10);
        v504 = ((v493 + v339 + (v496 ^ v502 ^ v501)) * 0x100 | v493 + v339 + (v496 ^ v502 ^ v501) >> 24) + v497;
        v505 = __ROL__(v486, 10);
        v506 = v315 + 0xa953fd4e + v489 + (v500 ^ (v498 | ~v505));
        v507 = ((v497 + v360 + (v501 ^ v503 ^ v504)) * 0x2000 | v497 + v360 + (v501 ^ v503 ^ v504) >> 19) + v502;
        v508 = __ROL__(v501, 10);
        v509 = __ROL__(v504, 10);
        v510 = ((v502 + (unsigned int)v379 + (v504 ^ v508 ^ v507)) * 64 | v502 + (unsigned int)v379 + (v504 ^ v508 ^ v507) >> 26) + v503;
        v511 = ((v503 + v458 + (v507 ^ v509 ^ v510)) * 32 | v503 + v458 + (v507 ^ v509 ^ v510) >> 27) + v508;
        v512 = __ROL__(v507, 10);
        v513 = __ROL__(v510, 10);
        v514 = ((v508 + v11 + (v510 ^ v512 ^ v511)) * 0x8000 | v508 + v11 + (v510 ^ v512 ^ v511) >> 0x11) + v509;
        v515 = ((v509 + v248 + (v511 ^ v513 ^ v514)) * 0x2000 | v509 + v248 + (v511 ^ v513 ^ v514) >> 19) + v512;
        v516 = __ROL__(v511, 10);
        v517 = (v506 * 32 | v506 >> 27) + (unsigned int)v495;
        v518 = __ROL__(v498, 10);
        v519 = ((v512 + v0 + (v514 ^ v516 ^ v515)) * 0x800 | v512 + v0 + (v514 ^ v516 ^ v515) >> 21) + v513;
        v520 = v379 + 0xa953fd4e + v495 + (v517 ^ (v500 | ~v518));
        v521 = __ROL__(v514, 10);
        v24 = (v500 * 0x400 | v500 >> 22) + v15 + v521;
        v25 = v518 + v14 + v516;
        v23 = v517 + v13 + (v515 * 0x400 | v515 >> 22);
        v26 = v505 + v16 + v516 + ((v513 + v347 + (v515 ^ v521 ^ v519)) * 0x800 | v513 + v347 + (v515 ^ v521 ^ v519) >> 21);
        v27 = v505 + v17 + v519 + ((unsigned int)v520 * 64 | (unsigned int)v520 >> 26);
        v522 = a0;
        v522[2] = v25;
        v522[3] = v26;
        v522[4] = v27;
        *v522 = v23;
        v522[1] = v24;
        a1 = v19 + 16;
        i = v9 - 1;
    } while (i);
    return v520;
}
