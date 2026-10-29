/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x53f7e0..0x541fd4 (10228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_53f7e0_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_53f7e0_0;

typedef struct st_53f7e0_2 {
    char field_0;
} st_53f7e0_2;

typedef struct st_53f7e0_1 {
    char padding_0[96];
    struct st_53f7e0_0 *field_60;
} st_53f7e0_1;

extern unsigned long long g_e824a8;
extern st_53f7e0_1 *g_f0d198;
extern char g_10002b0;

void sub_53f7e0(unsigned long long a0)
{
    unsigned long long v35;  // x28
    unsigned long long v36;  // x27
    unsigned long long v45;  // x30
    unsigned long long v135;  // x6
    unsigned long long v136;  // x0
    unsigned long long v137;  // x19
    unsigned long long v138;  // x19
    unsigned long long v139;  // x0
    unsigned long long v140;  // x0
    char v141;  // x0
    unsigned long long v142;  // x20
    unsigned long v143;  // x21
    unsigned int v144;  // w0
    st_53f7e0_2 *v46;  // x8
    unsigned int v145;  // w8
    unsigned int v146;  // w11
    char v147;  // x11
    char v148;  // x1
    char v149;  // x8
    char v150;  // x11
    st_53f7e0_2 **v151;  // x8
    st_53f7e0_2 *v152;  // x11
    unsigned long long v153;  // x0
    unsigned long long v154;  // x26
    st_53f7e0_2 **v47;  // x9
    unsigned long long v155;  // x8
    unsigned long long v156;  // x8
    unsigned long long v157;  // x10
    unsigned long long v158;  // x11
    char v159;  // x11
    unsigned long long v160;  // x8
    unsigned int v161;  // w8
    unsigned int v162;  // w10
    unsigned int v163;  // w17
    unsigned int v164;  // w8
    unsigned long long v48;  // x10
    unsigned long long v165;  // x10
    unsigned long long v166;  // x11
    unsigned long v167;  // x0
    unsigned long long v168;  // x22
    unsigned long long v169;  // x17
    unsigned long long v170;  // x17
    unsigned long long v171;  // x10
    unsigned long long v172;  // x10
    unsigned long long v173;  // x10
    unsigned long long v174;  // x17
    unsigned long long v49;  // x12
    unsigned long v175;  // x17
    unsigned int v176;  // w11
    unsigned int v177;  // w10
    unsigned int v178;  // w10
    unsigned int v179;  // w8
    char v180;  // x8
    char v181;  // x10
    st_53f7e0_2 **v182;  // x8
    st_53f7e0_2 *v183;  // x10
    unsigned long long v184;  // x17
    unsigned long long v50;  // x8
    unsigned long long v185;  // x0
    unsigned long long v186;  // x8
    unsigned long long v187;  // x8
    unsigned long long v188;  // x10
    unsigned long long v189;  // x11
    unsigned long long v190;  // x8
    char v191;  // x11
    unsigned int v192;  // w8
    unsigned int v193;  // w10
    unsigned int v194;  // w17
    unsigned long long v51;  // x9
    unsigned int v195;  // w8
    unsigned long long v196;  // x8
    unsigned long long v197;  // x10
    unsigned long v198;  // x17
    unsigned long long v199;  // x25
    unsigned long long v200;  // x11
    unsigned long long v201;  // x11
    unsigned long long v202;  // x8
    unsigned long long v203;  // x8
    unsigned long long v204;  // x8
    unsigned long v52;  // x8
    unsigned long long v205;  // x11
    unsigned long v206;  // x11
    unsigned int v207;  // w10
    unsigned int v208;  // w8
    unsigned int v209;  // w11
    unsigned int v210;  // w8
    char v211;  // x8
    char v212;  // x10
    st_53f7e0_2 **v213;  // x8
    st_53f7e0_2 *v214;  // x10
    unsigned long long v53;  // x8
    unsigned long long v215;  // x17
    unsigned long long v216;  // x0
    unsigned long long v217;  // x8
    unsigned long long v218;  // x8
    unsigned long long v219;  // x10
    unsigned long long v220;  // x11
    unsigned long long v221;  // x8
    unsigned int v222;  // w11
    unsigned int v223;  // w8
    unsigned int v224;  // w10
    unsigned long long v54;  // x8
    unsigned int v225;  // w8
    unsigned long long v226;  // x10
    unsigned long long v227;  // x11
    unsigned long v228;  // x0
    unsigned long long v229;  // x25
    unsigned long long v230;  // x17
    unsigned long long v231;  // x17
    unsigned long long v232;  // x10
    unsigned long long v233;  // x10
    unsigned long long v234;  // x10
    unsigned long long v37;  // x26
    unsigned long long v55;  // x10
    unsigned long long v235;  // x17
    unsigned long v236;  // x17
    unsigned int v237;  // w11
    unsigned int v238;  // w8
    unsigned int v239;  // w10
    char v240;  // x10
    char v241;  // x17
    char v242;  // x8
    char v243;  // x10
    st_53f7e0_2 **v244;  // x8
    unsigned long long v56;  // x12
    st_53f7e0_2 *v245;  // x10
    unsigned long long v246;  // x17
    unsigned long long v247;  // x0
    unsigned long long v248;  // x8
    unsigned long long v249;  // x8
    char v250;  // x0
    unsigned long long v251;  // x11
    unsigned long long v252;  // x10
    unsigned int v253;  // w11
    unsigned long long v254;  // x8
    unsigned long long v57;  // x10
    unsigned int v255;  // w8
    unsigned int v256;  // w10
    unsigned int v257;  // w8
    unsigned long long v258;  // x10
    unsigned long v259;  // x11
    unsigned long long v260;  // x17
    unsigned long long v261;  // x25
    unsigned long long v262;  // x0
    unsigned long long v263;  // x0
    unsigned long long v264;  // x10
    unsigned long long v58;  // x13
    unsigned long long v265;  // x10
    unsigned long long v266;  // x10
    unsigned long long v267;  // x17
    unsigned long v268;  // x17
    unsigned int v269;  // w8
    unsigned int v270;  // w11
    unsigned int v271;  // w10
    unsigned int v272;  // w10
    char v273;  // x8
    char v274;  // x10
    unsigned long long v59;  // x8
    st_53f7e0_2 **v275;  // x8
    st_53f7e0_2 *v276;  // x10
    unsigned long long v277;  // x0
    unsigned long long v278;  // x22
    unsigned long long v279;  // x8
    unsigned long long v280;  // x8
    char v281;  // x23
    unsigned int v282;  // w22
    unsigned long long v283;  // x17
    unsigned long long v284;  // x10
    unsigned long long v60;  // x8
    unsigned long long v285;  // x8
    unsigned int v286;  // w8
    unsigned int v287;  // w10
    unsigned int v288;  // w8
    unsigned long long v289;  // x10
    unsigned long v290;  // x17
    unsigned long long v291;  // x0
    unsigned long long v292;  // x28
    unsigned long long v293;  // x22
    unsigned long long v294;  // x22
    unsigned long v61;  // x10
    char v295;  // x23
    unsigned int v296;  // w8
    unsigned long long v297;  // x10
    unsigned long long v298;  // x10
    unsigned long long v299;  // x10
    unsigned long long v300;  // x22
    unsigned long v301;  // x10
    unsigned int v302;  // w17
    unsigned int v303;  // w17
    unsigned int v304;  // w11
    unsigned long long v62;  // x13
    char v305;  // x8
    char v306;  // x11
    st_53f7e0_2 **v307;  // x8
    st_53f7e0_2 *v308;  // x11
    unsigned long long v309;  // x0
    unsigned long long v310;  // x22
    unsigned long long v311;  // x8
    unsigned long long v312;  // x8
    unsigned int v313;  // w22
    unsigned long long v314;  // x17
    unsigned long long v63;  // x12
    unsigned long long v315;  // x11
    unsigned long long v316;  // x8
    unsigned int v317;  // w8
    unsigned int v318;  // w11
    unsigned int v319;  // w8
    unsigned long long v320;  // x11
    unsigned long v321;  // x17
    unsigned long long v322;  // x0
    unsigned long long v323;  // x28
    unsigned long long v324;  // x22
    unsigned long long v64;  // x13
    unsigned long long v325;  // x22
    unsigned int v326;  // w8
    unsigned long long v327;  // x11
    unsigned long long v328;  // x11
    unsigned long long v329;  // x11
    unsigned long long v330;  // x22
    unsigned long v331;  // x11
    unsigned int v332;  // w17
    unsigned int v333;  // w11
    unsigned int v334;  // w11
    unsigned long long v38;  // x25
    unsigned long long v65;  // x8
    char v335;  // x8
    char v336;  // x11
    st_53f7e0_2 **v337;  // x8
    st_53f7e0_2 *v338;  // x11
    unsigned long long v339;  // x17
    unsigned long long v340;  // x0
    unsigned long long v341;  // x8
    unsigned long long v342;  // x8
    unsigned long long v343;  // x15
    unsigned long long v344;  // x11
    unsigned long long v66;  // x8
    char v345;  // x0
    unsigned int v346;  // w15
    unsigned long long v347;  // x8
    unsigned int v348;  // w8
    unsigned int v349;  // w11
    unsigned int v350;  // w8
    unsigned long long v351;  // x11
    unsigned long v352;  // x15
    unsigned long long v353;  // x16
    unsigned long long v354;  // x4
    unsigned long v67;  // x10
    unsigned long long v355;  // x17
    unsigned long long v356;  // x17
    unsigned long long v357;  // x11
    unsigned long long v358;  // x11
    unsigned long long v359;  // x11
    unsigned long long v360;  // x16
    unsigned long v361;  // x11
    unsigned int v362;  // w8
    unsigned int v363;  // w16
    unsigned int v364;  // w11
    unsigned long long v68;  // x8
    char v365;  // x11
    char v366;  // x17
    char v367;  // x8
    char v368;  // x10
    char *v369;  // x8
    char *v370;  // x10
    unsigned long long v371;  // x11
    unsigned long long v372;  // x16
    unsigned long long v373;  // x8
    unsigned long long v374;  // x10
    unsigned long long v69;  // x8
    unsigned long long v375;  // x11
    unsigned long long v376;  // x10
    unsigned long long v377;  // x8
    unsigned long long v378;  // x0
    unsigned long long v379;  // x17
    char *v380;  // x10
    char *v381;  // x0
    char *v382;  // x21
    unsigned long long v383;  // x7
    unsigned long long v384;  // x10
    unsigned long long v70;  // x8
    unsigned long long v385;  // x21
    unsigned long long v386;  // x7
    unsigned long long v387;  // x10
    char *v388;  // x10
    unsigned int v389;  // w8
    st_53f7e0_2 **v390;  // x0
    st_53f7e0_2 *v391;  // x7
    unsigned long long v392;  // x19
    unsigned long long v393;  // x19
    unsigned long long v394;  // x20
    unsigned long long v71;  // x10
    unsigned long long v395;  // x0
    unsigned long long v396;  // x7
    unsigned int v397;  // w0
    unsigned int v398;  // w10
    unsigned int v399;  // w7
    unsigned int v400;  // w24
    unsigned int v401;  // w7
    unsigned int v402;  // w8
    unsigned int v403;  // w8
    unsigned int v404;  // w8
    unsigned long long v72;  // x13
    unsigned int v405;  // w8
    unsigned long long v406;  // x10
    unsigned long long v407;  // x0
    unsigned long long v408;  // x20
    unsigned long long v409;  // x24
    unsigned long long v410;  // x0
    unsigned long long v411;  // x20
    unsigned long long v412;  // x0
    unsigned long long v413;  // x10
    unsigned long long v414;  // x10
    unsigned long long v73;  // x12
    unsigned long long v415;  // x0
    unsigned long long v416;  // x19
    unsigned int v417;  // w10
    unsigned int v418;  // w0
    unsigned int v419;  // w10
    unsigned long long v420;  // x8
    char *v421;  // x10
    unsigned long long v422;  // x19
    unsigned long long v423;  // x7
    unsigned long long v424;  // x10
    char v74;  // x8
    unsigned long long v425;  // x7
    unsigned long long v426;  // x0
    unsigned long long v427;  // x10
    unsigned long long v428;  // x10
    unsigned long long v429;  // x0
    unsigned long long v430;  // x19
    unsigned long long v431;  // x7
    unsigned long long v432;  // x10
    unsigned long long v433;  // x8
    unsigned long long v434;  // x8
    unsigned long long v39;  // x24
    unsigned long long v75;  // x8
    unsigned long long v435;  // x9
    unsigned long long v436;  // x10
    unsigned long long v437;  // x8
    unsigned long long v76;  // x10
    unsigned long long v77;  // x12
    unsigned long long v78;  // x8
    unsigned long long v79;  // x8
    unsigned long long v80;  // x10
    unsigned long long v81;  // x13
    unsigned long long v82;  // x12
    char v83;  // x23
    unsigned long long v84;  // x8
    unsigned long long v40;  // x23
    unsigned long v85;  // x12
    unsigned long long v86;  // x14
    unsigned long long v87;  // x13
    unsigned long long v88;  // x8
    unsigned long long v89;  // x8
    unsigned long long v90;  // x12
    unsigned long long v91;  // x8
    unsigned long long v92;  // x8
    unsigned long long v93;  // x12
    unsigned long long v94;  // x13
    unsigned long long v41;  // x22
    unsigned long long v95;  // x14
    unsigned long long v96;  // x13
    unsigned long long v97;  // x13
    unsigned long long v98;  // x1
    unsigned long long v99;  // x8
    unsigned long long v100;  // x13
    unsigned long long v101;  // x14
    unsigned long long v102;  // x12
    unsigned long long v103;  // x1
    unsigned long v104;  // x8
    unsigned long long v42;  // x21
    unsigned long long v105;  // x12
    unsigned long v106;  // x13
    unsigned long long v107;  // x14
    unsigned long long v108;  // x13
    unsigned long long v109;  // x8
    unsigned long long v110;  // x8
    unsigned long long v111;  // x12
    unsigned long long v112;  // x8
    unsigned long long v113;  // x12
    unsigned long long v114;  // x13
    unsigned long long v43;  // x20
    unsigned long long v115;  // x13
    unsigned long long v116;  // x14
    unsigned long long v117;  // x1
    unsigned long long v118;  // x8
    unsigned long long v119;  // x1
    unsigned long long v120;  // x13
    unsigned long long v121;  // x8
    unsigned long long v122;  // x8
    unsigned long long v123;  // x13
    st_53f7e0_2 **v124;  // x8
    unsigned long long v44;  // x19
    st_53f7e0_2 *v125;  // x1
    unsigned long long v126;  // x4
    unsigned long long v127;  // x3
    unsigned long long v128;  // x5
    unsigned long long v129;  // x8
    unsigned long long v130;  // x7
    unsigned long long v131;  // x8
    unsigned long long v132;  // x8
    unsigned long long v133;  // x1
    unsigned long v134;  // x5
    unsigned long long v2;  // [bp-0xe8]
    unsigned long long v3;  // [bp-0xe0]
    unsigned long long v4;  // [bp-0xd8]
    unsigned long long v5;  // [bp-0xd0]
    st_53f7e0_0 *v6;  // [bp-0xc8]
    unsigned long long v7;  // [bp-0xc0]
    char *v8;  // [bp-0xb8], Other Possible Types: char
    char *v9;  // [bp-0xb0], Other Possible Types: st_53f7e0_2 **, char, unsigned long
    unsigned long v10;  // [bp-0xb0], Other Possible Types: unsigned long long
    st_53f7e0_2 *v11;  // [bp-0xa8], Other Possible Types: unsigned long long
    unsigned long v12;  // [bp-0xa8], Other Possible Types: unsigned long long
    st_53f7e0_2 *v13;  // [bp-0xa0], Other Possible Types: unsigned long, unsigned long long
    st_53f7e0_2 *v14;  // [bp-0x98], Other Possible Types: st_53f7e0_2 **, unsigned long, char, unsigned long long
    char v15;  // [bp-0x98]
    st_53f7e0_2 **v16;  // [bp-0x90], Other Possible Types: unsigned long long, char
    char v17;  // [bp-0x90]
    unsigned long long v18;  // [bp-0x88]
    unsigned long long v19;  // [bp-0x80]
    unsigned long long v20;  // [bp-0x79]
    unsigned long v21;  // [bp-0x68]
    unsigned long long v22;  // [bp-0x60]
    unsigned long long v23;  // [bp-0x58]
    unsigned long long v24;  // [bp-0x50]
    unsigned long long v25;  // [bp-0x48]
    unsigned long long v26;  // [bp-0x40]
    unsigned long long v27;  // [bp-0x38]
    unsigned long long v28;  // [bp-0x30]
    unsigned long long v29;  // [bp-0x28]
    unsigned long long v30;  // [bp-0x20]
    unsigned long long v31;  // [bp-0x18]
    char *v32;  // [bp-0x10]
    unsigned long long v33;  // [bp-0x8]
    char v34;  // [bp+0x0]

    v22 = v35;
    v23 = v36;
    v24 = v37;
    v25 = v38;
    v26 = v39;
    v27 = v40;
    v28 = v41;
    v29 = v42;
    v30 = v43;
    v31 = v44;
    v32 = &v34;
    v33 = v45;
    v7 = a0;
    v21 = *(long long *)&g_10002b0;
    v6 = g_f0d198->field_60;
    v11 = &v9;
    v9 = &v11;
    v46 = v11;
    v47 = v9;
    v48 = v47 | v46;
    v49 = &v46[(v47 | ~v46) + v48 + 2 * (~&v46[v47 | ~v46] & ~v48) + 2 * (v48 & ~&v46[v47 | ~v46]) + 1];
    v50 = (v46 | ~v47) + (char *)v47;
    v51 = v50 + v48 + (~v50 & ~v48) * 2;
    v52 = v51 + (v48 & ~v50) * 2 + 1 + (0xffffffffffffffff ^ (v51 + (v48 & ~v50) * 2 + 1) * 2);
    v53 = v49 + (v52 | ~v49) + (v52 | v49) + 1;
    v54 = (v53 * 2 & 4) + (v53 ^ 2);
    v55 = v54 * 2;
    v56 = v55 + ~v54;
    v57 = v54 - v55 + v56 + (~(unsigned int)(v54 - v55) | 0xfffffffffffffffb) + 6;
    v58 = ((-v54 | 4) ^ v54) + ((-v54 | 4) & v54) * 2;
    v59 = (v56 | 1) + (1 & ~v54) + 4;
    v9 = (v57 ^ (v56 | 4) + 1) + (v57 & (v56 | 4) + 1) * 2 - 1;
    v11 = v59 + ~(v56 & 4) + v58 * 2 + (v59 + ~(v56 & 4) | ~v58) + ((v56 & 4) - v59 | ~v58) + 2;
    v60 = v11;
    v61 = v9;
    v62 = v60 + 1;
    v63 = v62 + ~v60 * 2;
    v64 = (v60 ^ -v61) + ((-v61 | ~v60) + v62) * 2;
    v65 = v61 - (v60 + (v61 | ~v60));
    v66 = v63 + v61 + ~((v65 & v60 + ~v61) * 4 + (v65 ^ v60 + ~v61) * 2) + ((v65 & v60 + ~v61) * 4 + (v65 ^ v60 + ~v61) * 2) * 2 + 2;
    v67 = ((v61 | ~v63) + v63) * 2 + 2;
    v68 = v64 + (v67 | ~v64) + (v64 | v67) + v66 + 1;
    v69 = v68 + ~(v66 * 2) + (v68 + ~(v66 * 2) & 0xfffffffffffffffe) + (v66 * 2 - v68 | 1);
    v10 = (v69 + 2 | 1) + (v69 + 2 & 1) - (v69 + 2 & 2) + ((unsigned int)v69 + 2 & 2) + 1;
    v12 = v69 + 16;
    v70 = v10;
    v71 = v12;
    v72 = v70 + 1;
    v73 = (v71 - v70 + (v70 | ~v71) ^ v72) + (v71 - v70 + (v70 | ~v71) & v72) * 2;
    v74 = (char)v72 + (char)v72 + (char)~v70 * 2 + ((char)v71 | (char)~(v72 + ~v70 * 2));
    v75 = v12;
    v76 = v10;
    v77 = -v76;
    v78 = (v76 | ~v75) + v75;
    v79 = (v75 ^ v77) - ((v76 | v75) + v78) + 1;
    v80 = v79 + (v75 - (v76 + (v75 | v77))) * 2 + ((v76 & ~v75) + v78) * 2;
    v81 = v80 | 10;
    v82 = (v80 + 10 ^ -v81) + (v80 + 10 & -v81) * 2;
    v10 = v82 + (v81 | ~v82) + (v82 | v81) + 1;
    v12 = (v80 ^ 0xfffffffffffffff1) + v80 + (v80 & 14) + (v80 & 14 ^ 14) - ((v80 | 1) + (v79 & 1) + 14) + ((v80 | 1) + (v79 & 1) + 14 - (v80 & 14)) * 2;
    v83 = (char)v12 + 1 + (char)v12 + 1 + (char)~v12 * 2 + ((char)v12 + (char)~(v12 | v10) ^ (char)v10 + 1) + ((char)v10 | (char)~(v12 + 1 + ~v12 * 2)) + ((char)v12 + (char)~(v12 | v10) & (char)v10 + 1) * 2;
    v84 = v12;
    v85 = v10;
    v86 = ((v84 + ~v84 * 2 + 1 | ~v85) + v85) * 2;
    v87 = (0xfffffffffffffffd - v86 & v84 - v85) + v86 + 2 + (v86 + 2 & v84 - v85);
    v88 = v85 - v84 + ((v85 | v84) ^ -v85) * 2 + ((v85 | v84) & -v85) * 4;
    v89 = (v87 & v88 - 1) + ~v87 + (v87 | -v88) + (v87 + 1 - v88 + v87 + 1 + ~v87 * 2 + (v88 - 1 | ~(v87 + 1 + ~v87 * 2))) * 2;
    v90 = v89 + 3;
    v91 = v89 + (28 - v89 | 0xffffffffffffffe7) + 28;
    v10 = v89 + (v90 & 8) + (v89 + 11 ^ -(v90 | 8)) + (v89 + 11 & -(v90 | 8)) * 2 + ((0xffffffff ^ (unsigned int)v90 * 2) & 16) - 5;
    v12 = v91 + (v89 + (0xffffffffffffffe7 & ~v90)) * 2 + (0xffffffffffffffe3 - (v89 + (0xffffffffffffffe7 & ~v90)) | v91) - (v89 + (0xffffffffffffffe7 & ~v90) + 28 & v91) + 57;
    v3 = ((v12 + 1 ^ v10) + (v12 + 1 & v10) * 2 | 1) + ((v12 + 1 ^ v10) & 1);
    v92 = v12;
    v93 = v10;
    v94 = v92 * 2 + ~v92 * 4 + (v92 ^ 1) + (v92 * 2 & 2);
    v95 = v94 + 3;
    v96 = v93 - v95 + (v94 + 2 | ~v93) + 1;
    v97 = (((v96 & v95) * 4 + (v96 ^ v95) * 2 | 1) ^ v92 - v93) + (((v96 & v95) * 4 + (v96 ^ v95) * 2 | 1) & v92 - v93) * 2;
    v98 = v93 * 2 + ~v93 * 4 + (v93 ^ 1) + (v93 * 2 & 2) + 9223372036854775810 & v92;
    v99 = (~v97 + v97 * 2 ^ v93 - v92 + v98 * 4 + 1 + ~(v98 * 2)) - (v97 + v93 - v92 + v98 * 4 + 1 + ~(v98 * 2) + (-v97 | -(v93 - v92 + v98 * 4 + 1 + ~(v98 * 2)))) * 2 + (~v97 + v97 * 2 & v93 - v92 + v98 * 4 + 1 + ~(v98 * 2)) * 2 + (~v97 + v97 * 2 & v93 - v92 + v98 * 4 + 1 + ~(v98 * 2) + (v98 * 2 - (v93 - v92 + v98 * 4 + 1)) * 2 + 2) * 2 + 1;
    v100 = v99 - v99 * 2;
    v101 = v99 + v100 + (~v100 | 0xffffffffffffffe0) + 32;
    v102 = (-(unsigned int)v99 | 0xffffffffffffffe0) + v99;
    v103 = v100 + (0xfffffffffffffff6 | ~v100) + 10;
    v10 = (v101 & 0xffffffffffffffe0 - v102) + v102 + 31 + (v101 & v102 + 31);
    v12 = v99 + (v100 | 0xfffffffffffffff6) + (v103 ^ -v100) + (v103 & -v100) * 2 + 9;
    v5 = v12 + v10;
    v104 = v12;
    v105 = v10;
    v106 = ~v104;
    v107 = v104 - v105 + (((0xfffffffffffffffc - (v104 * 3 + v106 * 4) | v105) & v104 * 3 + v106 * 4 + 4) * 4 + ((0xfffffffffffffffc - (v104 * 3 + v106 * 4) | v105) ^ v104 * 3 + v106 * 4 + 4) * 2 | ~(v104 - v105)) + (((0xfffffffffffffffc - (v104 * 3 + v106 * 4) | v105) & v104 * 3 + v106 * 4 + 4) * 4 + ((0xfffffffffffffffc - (v104 * 3 + v106 * 4) | v105) ^ v104 * 3 + v106 * 4 + 4) * 2 | v104 - v105) + 1;
    v108 = v104 + 1 + v105 + (v104 + 1 + v106 * 2 | ~v105);
    v109 = v108 + 1 + (v105 & v104) + (-(v105 & v104) & ~v108) * 2 + (v108 + 1 + (-(v105 & v104) | ~v108)) * 2;
    v110 = (((v107 & v109 - 2) - (v109 - 1) ^ v109 - 1 - v107 + (v107 | 1 - v109)) + ((v107 & v109 - 2) - (v109 - 1) & v109 - 1 - v107 + (v107 | 1 - v109)) * 2 ^ (0xffffffffffffffff ^ (v107 & 1 - v109) * 2) + (v107 & 1 - v109) * 4 + 2) + (((v107 & v109 - 2) - (v109 - 1) ^ v109 - 1 - v107 + (v107 | 1 - v109)) + ((v107 & v109 - 2) - (v109 - 1) & v109 - 1 - v107 + (v107 | 1 - v109)) * 2 & (0xffffffffffffffff ^ (v107 & 1 - v109) * 2) + (v107 & 1 - v109) * 4 + 2) * 2;
    v111 = v110 - 1;
    v10 = (v110 - (v111 & 47) + 47 ^ (-v110 | 47) + v110) + (v110 - (v111 & 47) + 47 & (-v110 | 47) + v110) * 2 - 1;
    v12 = (v111 ^ 0xfffffffffffffffe) + v111 + (v111 & 1 ^ 1) + (v110 + 1 & ~(v111 & 1));
    v4 = (~v10 & ~v12) + (v12 - v10 + (v10 | ~v12) ^ v10 + 1) + ((v12 | v10) + (v12 - v10 + (v10 | ~v12) & v10 + 1)) * 2;
    v112 = v12;
    v113 = v10;
    v114 = v112 + (0xffffffffffffffff ^ v112 * 2) & v113;
    v115 = ((0xffffffffffffffff ^ v114 * 2) + v114 * 4 + 2 ^ (v112 ^ -v113) + (v112 + (-v113 | ~v112)) * 2 + 2) + ((0xffffffffffffffff ^ v114 * 2) + v114 * 4 + 2 & (v112 ^ -v113) + (v112 + (-v113 | ~v112)) * 2 + 2) * 2;
    v116 = ~v115 + v115 * 2;
    v117 = (v113 ^ 1) + ~v113 * 2 + ((v113 * 2 | v113 >> 63) & 2 & 3);
    v118 = v113 + v112 + (v117 + v112 & -(v117 | v112)) * 4 + (v113 + (-v112 | ~v113) + (-v112 & ~v113) + (v117 + v112 ^ -(v117 | v112))) * 2;
    v119 = v118 + 2;
    v120 = (v116 ^ v119) + ((v115 - 1 | 0xfffffffffffffffe - v118) - v115 + (v116 & v119)) * 2 + 2;
    v121 = v120 + ((v119 - (v118 + 1 & v116) & v116 - v119) * 4 + (v119 - (v118 + 1 & v116) ^ v116 - v119) * 2 | ~v120) + ((v119 - (v118 + 1 & v116) & v116 - v119) * 4 + (v119 - (v118 + 1 & v116) ^ v116 - v119) * 2 | v120);
    v10 = v121 + 23;
    v12 = ((v121 + 2 + ~(v121 + 1) * 2 | 0xffffffffffffffdd) + v121 + 1 + 36 ^ v121 + 2 + (v121 + 2 + ~(v121 + 1) * 2 | 0x22)) + ((v121 + 2 + ~(v121 + 1) * 2 | 0xffffffffffffffdd) + v121 + 1 + 36 & v121 + 2 + (v121 + 2 + ~(v121 + 1) * 2 | 0x22)) * 2 - 1;
    v122 = v12 | v10;
    v123 = (v12 + v10 ^ -v122) + (v12 + v10 & -v122) * 2;
    v2 = (v123 | v122) + (v123 & v122);
    v14 = &v16;
    v16 = &v14;
    v124 = v16;
    v125 = v14;
    v126 = v125 + v124;
    v127 = v126 + ~v125 * 2 + (v126 + (0xffffffffffffffff ^ v124 * 2) + ~(v126 + (0xffffffffffffffff ^ v124 * 2) + (v124 | ~v125))) * 2 + 2;
    v128 = ((char *)v124 + 0x2 * ~v124 + 1 & v125) + (char *)v124;
    v129 = (v126 ^ -(v125 | v124)) + (v126 & -(v125 | v124)) * 2;
    v130 = v129 + v128;
    v131 = v130 + ((-v129 & ~v128) + v128 - (v129 + (v128 | -v129))) * 2;
    v132 = (v131 - v127 & 0xfffffffffffffffe | v130 - v126 & 1) + (v127 - v131) * 2;
    v14 = v132 + (20969080088 & v132 * 2) + (20969080088 & v132 * 2 ^ 20969080088) + 0xfffffffd8f129d73;
    v16 = v132 + 3663957656;
    v133 = v16;
    v134 = v14;
    v135 = ~v133;
    v136 = v133 + 1;
    v137 = ((v133 * 3 + v135 * 4 + 3 & v134) - (v133 * 3 + v135 * 4 + 3 + v134) & v133 * 3 + v135 * 4 + 3 + v134) * 4 + ((v133 * 3 + v135 * 4 + 3 & v134) - (v133 * 3 + v135 * 4 + 3 + v134) ^ v133 * 3 + v135 * 4 + 3 + v134) * 2 + ~(((v133 * 3 + v135 * 4 + 3 & v134) - (v133 * 3 + v135 * 4 + 3 + v134) & v133 * 3 + v135 * 4 + 3 + v134) * 4 + ((v133 * 3 + v135 * 4 + 3 & v134) - (v133 * 3 + v135 * 4 + 3 + v134) ^ v133 * 3 + v135 * 4 + 3 + v134) * 2) * 2 | 1;
    v138 = v137 - ((v133 ^ -v134) + ((-v134 | ~v133) + v136) * 2 + 1) + ((v133 ^ -v134) + ((-v134 | ~v133) + v136) * 2 + 1 + ~v137) * 2;
    v139 = (-((v134 + v133 ^ -(v134 | v133)) + (v134 + v133 & -(v134 | v133)) * 2) ^ (v136 + v135 * 2 & v134) + v133) + (-((v134 + v133 ^ -(v134 | v133)) + (v134 + v133 & -(v134 | v133)) * 2) & (v136 + v135 * 2 & v134) + v133) * 2;
    v140 = (v139 ^ 1) + ~(v139 * 2) + (v139 * 2 & 2);
    v141 = (v138 ^ v140 | 0xfffffffffffffffe) + (v138 ^ v140) + (v138 & v140) * 2 + (v138 ^ v140) + (v138 & v140) * 2 - (~((v138 ^ v140) + (v138 & v140) * 2) + ((v138 ^ v140) + (v138 & v140) * 2) * 2 | 1) + 1;
    v142 = v141 & 1665517283;
    v143 = v141 + 0xffffffff9cba391d + v142 + ((0xffffffff ^ v141 * 2) & 3331034566);
    v15 = v141 + 355696674;
    v17 = (v141 ^ 0xffffffff9cba391c) + v141 + (v142 ^ 1665517283) + (0xfffffffffffffffe - ((v141 ^ 0xffffffff9cba391c) + v141 + (v142 ^ 1665517283)) | v143) + ((v141 ^ 0xffffffff9cba391c) + v141 + (v142 ^ 1665517283) + 1 | v143) + 2;
    v144 = (unsigned int)(v17 * 2 + (v17 ^ 0xfffffffe) - (v17 * 2 & 2)) + 3;
    v145 = (unsigned int)v16 + (unsigned int)v14 + 0x11 + (~((unsigned int)v16 + (unsigned int)v14) | 0xffffffef) + (unsigned int)v16 + (unsigned int)v14 + 0x11 + (0xffffffef & ~((unsigned int)v16 + (unsigned int)v14)) + ((unsigned int)v16 + (unsigned int)v14 + 0x11 + (~((unsigned int)v16 + (unsigned int)v14) | 0xffffffef) | ~((unsigned int)v16 + (unsigned int)v14 + 0x11 + (0xffffffef & ~((unsigned int)v16 + (unsigned int)v14)))) + ((unsigned int)v16 + (unsigned int)v14 + 0x11 + (0xffffffef & ~((unsigned int)v16 + (unsigned int)v14)) & ~((unsigned int)v16 + (unsigned int)v14 + 0x11 + (~((unsigned int)v16 + (unsigned int)v14) | 0xffffffef))) + 1;
    v146 = (unsigned int)((v15 & 0xffffffff) - v144) + (v144 & v15) * 2 + (v144 & ~v15) * 2 + 1;
    v147 = (char)~v146 + (char)v146 * 2;
    v148 = v147 - 1;
    v149 = v148 + (char)v145 + ((char)(1 - v147) & (char)~v145) * 2 + (char)(v145 - v147 - ((unsigned int)(1 - v147) | v145)) * 2 + 2;
    v150 = 1 | (v148 & ((char)v145 ^ 1) + (char)v145 * 2 + (char)~v145 * 4 + ((char)v145 * 2 & 2) + 2) * 2;
    v16 = _INSERT(v17, 0, (v149 ^ v150) + (v149 & v150) * 2 - 1);
    v13 = &v15;
    v14 = &v13;
    v151 = v14;
    v152 = v13;
    v153 = v152 + v151;
    v154 = ((char *)v151 + 0x2 * ~v151 + 1 & v152) + (char *)v151;
    v155 = (v153 ^ -(v152 | v151)) + (v153 & -(v152 | v151)) * 2;
    v156 = v155 + v154;
    v157 = v156 + ((-v155 & ~v154) + v154 - (v155 + (v154 | -v155))) * 2;
    v158 = v153 + ~v152 * 2 + (v153 + (0xffffffffffffffff ^ v151 * 2) + ~(v153 + (0xffffffffffffffff ^ v151 * 2) + (v151 | ~v152))) * 2 + 2;
    v159 = v9 + v11 + ~v11 * 2 + 1 + (v9 - (v11 + ~v11 * 2 + 1 + (v9 | ~(v11 + ~v11 * 2))) + (~(v11 + ~v11 * 2) & ~v9)) * 2 - 1;
    v160 = (v157 - v158 & 0xfffffffffffffffe | v156 - v153 & 1) + (v158 - v157) * 2;
    v13 = v160 + (20969080088 & v160 * 2) + (20969080088 & v160 * 2 ^ 20969080088) + 0xfffffffd8f129d73;
    v14 = v160 + 3663957656;
    v161 = (unsigned int)v14 + (unsigned int)v13;
    v162 = 16 >> (v159 & 63);
    v163 = v161 + v162;
    v164 = v163 + (v162 + (int)(-0x11 >> (v159 & 63)) * 2 + 1 | ~v161) + 1;
    v165 = v14;
    v166 = ~v165;
    v167 = v13;
    v168 = v165 + 1;
    v169 = ((v165 * 3 + v166 * 4 + 3 & v167) - (v165 * 3 + v166 * 4 + 3 + v167) & v165 * 3 + v166 * 4 + 3 + v167) * 4 + ((v165 * 3 + v166 * 4 + 3 & v167) - (v165 * 3 + v166 * 4 + 3 + v167) ^ v165 * 3 + v166 * 4 + 3 + v167) * 2 + ~(((v165 * 3 + v166 * 4 + 3 & v167) - (v165 * 3 + v166 * 4 + 3 + v167) & v165 * 3 + v166 * 4 + 3 + v167) * 4 + ((v165 * 3 + v166 * 4 + 3 & v167) - (v165 * 3 + v166 * 4 + 3 + v167) ^ v165 * 3 + v166 * 4 + 3 + v167) * 2) * 2 | 1;
    v170 = v169 - ((v165 ^ -v167) + ((-v167 | ~v165) + v168) * 2 + 1) + ((v165 ^ -v167) + ((-v167 | ~v165) + v168) * 2 + 1 + ~v169) * 2;
    v171 = (-((v167 + v165 ^ -(v167 | v165)) + (v167 + v165 & -(v167 | v165)) * 2) ^ (v168 + v166 * 2 & v167) + v165) + (-((v167 + v165 ^ -(v167 | v165)) + (v167 + v165 & -(v167 | v165)) * 2) & (v168 + v166 * 2 & v167) + v165) * 2;
    v172 = (v171 ^ 1) + ~(v171 * 2) + (v171 * 2 & 2);
    v173 = (v170 ^ v172 | 0xfffffffffffffffe) + (v170 ^ v172) + (v170 & v172) * 2 + (v170 ^ v172) + (v170 & v172) * 2 - (~((v170 ^ v172) + (v170 & v172) * 2) + ((v170 ^ v172) + (v170 & v172) * 2) * 2 | 1) + 1;
    v174 = v173 & 1665517283;
    v175 = v173 + 0xffffffff9cba391d + v174 + ((0xffffffff ^ (unsigned int)v173 * 2) & 3331034566);
    v13 = v173 + 355696674;
    v14 = (v173 ^ 0xffffffff9cba391c) + v173 + (v174 ^ 1665517283) + (0xfffffffffffffffe - ((v173 ^ 0xffffffff9cba391c) + v173 + (v174 ^ 1665517283)) | v175) + ((v173 ^ 0xffffffff9cba391c) + v173 + (v174 ^ 1665517283) + 1 | v175) + 2;
    v176 = (unsigned int)(v14 * 2 + (v14 ^ 0xfffffffe) - (v14 * 2 & 2)) + 3;
    v177 = (unsigned int)((v13 & 0xffffffff) - v176) + (v176 & (unsigned int)v13) * 2 + (v176 & ~(unsigned int)v13) * 2 + 1;
    v178 = ~v177 + v177 * 2;
    v179 = v163 - (v162 | v161) + v164 + (v164 | ~(v163 - (v162 | v161))) + (v163 - (v162 | v161) & ~v164) + 1;
    v180 = (char)v178 + (char)v179 + ((char)-v178 & (char)~v179) * 2 + (char)(v179 - v178 - (v179 | -v178)) * 2;
    v181 = 1 | ((char)v178 & ((char)v179 ^ 1) + (char)v179 * 2 + (char)~v179 * 4 + ((char)v179 * 2 & 2) + 2) * 2;
    (&v16)[1] = (v180 ^ v181) + (v180 & v181) * 2 - 1;
    v13 = &v14;
    v14 = &v13;
    v182 = v14;
    v183 = v13;
    v184 = v183 + v182;
    v185 = ((char *)v182 + 0x2 * ~v182 + 1 & v183) + (char *)v182;
    v186 = (v184 ^ -(v183 | v182)) + (v184 & -(v183 | v182)) * 2;
    v187 = v186 + v185;
    v188 = v187 + ((-v186 & ~v185) + v185 - (v186 + (v185 | -v186))) * 2;
    v189 = v184 + ~v183 * 2 + (v184 + (0xffffffffffffffff ^ v182 * 2) + ~(v184 + (0xffffffffffffffff ^ v182 * 2) + (v182 | ~v183))) * 2 + 2;
    v190 = (v188 - v189 & 0xfffffffffffffffe | v187 - v184 & 1) + (v189 - v188) * 2;
    v191 = (char)v73 + (v74 | (char)~v73) + ((char)v73 | v74) + 1;
    v13 = v190 + (20969080088 & v190 * 2) + (20969080088 & v190 * 2 ^ 20969080088) + 0xfffffffd8f129d73;
    v14 = v190 + 3663957656;
    v192 = (unsigned int)v14 + (unsigned int)v13;
    v193 = 16 >> (v191 & 63);
    v194 = v192 + v193;
    v195 = v194 + (v193 + (int)(-0x11 >> (v191 & 63)) * 2 + 1 | ~v192) + 1;
    v196 = v14;
    v197 = ~v196;
    v198 = v13;
    v199 = v196 + 1;
    v200 = ((v196 * 3 + v197 * 4 + 3 & v198) - (v196 * 3 + v197 * 4 + 3 + v198) & v196 * 3 + v197 * 4 + 3 + v198) * 4 + ((v196 * 3 + v197 * 4 + 3 & v198) - (v196 * 3 + v197 * 4 + 3 + v198) ^ v196 * 3 + v197 * 4 + 3 + v198) * 2 + ~(((v196 * 3 + v197 * 4 + 3 & v198) - (v196 * 3 + v197 * 4 + 3 + v198) & v196 * 3 + v197 * 4 + 3 + v198) * 4 + ((v196 * 3 + v197 * 4 + 3 & v198) - (v196 * 3 + v197 * 4 + 3 + v198) ^ v196 * 3 + v197 * 4 + 3 + v198) * 2) * 2 | 1;
    v201 = v200 - ((v196 ^ -v198) + ((-v198 | ~v196) + v199) * 2 + 1) + ((v196 ^ -v198) + ((-v198 | ~v196) + v199) * 2 + 1 + ~v200) * 2;
    v202 = (-((v198 + v196 ^ -(v198 | v196)) + (v198 + v196 & -(v198 | v196)) * 2) ^ (v199 + v197 * 2 & v198) + v196) + (-((v198 + v196 ^ -(v198 | v196)) + (v198 + v196 & -(v198 | v196)) * 2) & (v199 + v197 * 2 & v198) + v196) * 2;
    v203 = (v202 ^ 1) + ~(v202 * 2) + (v202 * 2 & 2);
    v204 = (v201 ^ v203 | 0xfffffffffffffffe) + (v201 ^ v203) + (v201 & v203) * 2 + (v201 ^ v203) + (v201 & v203) * 2 - (~((v201 ^ v203) + (v201 & v203) * 2) + ((v201 ^ v203) + (v201 & v203) * 2) * 2 | 1) + 1;
    v205 = v204 & 1665517283;
    v206 = v204 + 0xffffffff9cba391d + v205 + ((0xffffffff ^ (unsigned int)v204 * 2) & 3331034566);
    v13 = v204 + 355696674;
    v14 = (v204 ^ 0xffffffff9cba391c) + v204 + (v205 ^ 1665517283) + (0xfffffffffffffffe - ((v204 ^ 0xffffffff9cba391c) + v204 + (v205 ^ 1665517283)) | v206) + ((v204 ^ 0xffffffff9cba391c) + v204 + (v205 ^ 1665517283) + 1 | v206) + 2;
    v207 = (unsigned int)(v14 * 2 + (v14 ^ 0xfffffffe) - (v14 * 2 & 2)) + 3;
    v208 = (unsigned int)((v13 & 0xffffffff) - v207) + (v207 & (unsigned int)v13) * 2 + (v207 & ~(unsigned int)v13) * 2 - 1;
    v209 = v194 - (v193 | v192) + v195 + (v195 | ~(v194 - (v193 | v192))) + (v194 - (v193 | v192) & ~v195) + 1;
    v210 = ((v208 | 0xfffffffd) ^ 3) + (v208 | 2) + (__ROL__(v208 | 0xfffffffd, 1) & 6 & 7);
    v211 = (char)v210 + (char)v209 + ((char)-v210 & (char)~v209) * 2 + (char)(v209 - v210 - (v209 | -v210)) * 2;
    v212 = 1 | ((char)v210 & ((char)v209 ^ 1) + (char)v209 * 2 + (char)~v209 * 4 + ((char)v209 * 2 & 2) + 2) * 2;
    (&v16)[2] = (v211 ^ v212) + (v211 & v212) * 2 - 1;
    v13 = &v14;
    v14 = &v13;
    v213 = v14;
    v214 = v13;
    v215 = v214 + v213;
    v216 = ((char *)v213 + 0x2 * ~v213 + 1 & v214) + (char *)v213;
    v217 = (v215 ^ -(v214 | v213)) + (v215 & -(v214 | v213)) * 2;
    v218 = v217 + v216;
    v219 = v218 + ((-v217 & ~v216) + v216 - (v217 + (v216 | -v217))) * 2;
    v220 = v215 + ~v214 * 2 + (v215 + (0xffffffffffffffff ^ v213 * 2) + ~(v215 + (0xffffffffffffffff ^ v213 * 2) + (v213 | ~v214))) * 2 + 2;
    v221 = (v219 - v220 & 0xfffffffffffffffe | v218 - v215 & 1) + (v220 - v219) * 2;
    v222 = 16 >> (v83 & 63);
    v13 = v221 + (20969080088 & v221 * 2) + (20969080088 & v221 * 2 ^ 20969080088) + 0xfffffffd8f129d73;
    v14 = v221 + 3663957656;
    v223 = (unsigned int)v14 + (unsigned int)v13;
    v224 = v223 + v222;
    v225 = v224 + (v222 + (int)(-0x11 >> (v83 & 63)) * 2 + 1 | ~v223) + 1;
    v226 = v14;
    v227 = ~v226;
    v228 = v13;
    v229 = v226 + 1;
    v230 = ((v226 * 3 + v227 * 4 + 3 & v228) - (v226 * 3 + v227 * 4 + 3 + v228) & v226 * 3 + v227 * 4 + 3 + v228) * 4 + ((v226 * 3 + v227 * 4 + 3 & v228) - (v226 * 3 + v227 * 4 + 3 + v228) ^ v226 * 3 + v227 * 4 + 3 + v228) * 2 + ~(((v226 * 3 + v227 * 4 + 3 & v228) - (v226 * 3 + v227 * 4 + 3 + v228) & v226 * 3 + v227 * 4 + 3 + v228) * 4 + ((v226 * 3 + v227 * 4 + 3 & v228) - (v226 * 3 + v227 * 4 + 3 + v228) ^ v226 * 3 + v227 * 4 + 3 + v228) * 2) * 2 | 1;
    v231 = v230 - ((v226 ^ -v228) + ((-v228 | ~v226) + v229) * 2 + 1) + ((v226 ^ -v228) + ((-v228 | ~v226) + v229) * 2 + 1 + ~v230) * 2;
    v232 = (-((v228 + v226 ^ -(v228 | v226)) + (v228 + v226 & -(v228 | v226)) * 2) ^ (v229 + v227 * 2 & v228) + v226) + (-((v228 + v226 ^ -(v228 | v226)) + (v228 + v226 & -(v228 | v226)) * 2) & (v229 + v227 * 2 & v228) + v226) * 2;
    v233 = (v232 ^ 1) + ~(v232 * 2) + (v232 * 2 & 2);
    v234 = (v231 ^ v233 | 0xfffffffffffffffe) + (v231 ^ v233) + (v231 & v233) * 2 + (v231 ^ v233) + (v231 & v233) * 2 - (~((v231 ^ v233) + (v231 & v233) * 2) + ((v231 ^ v233) + (v231 & v233) * 2) * 2 | 1) + 1;
    v235 = v234 & 1665517283;
    v236 = v234 + 0xffffffff9cba391d + v235 + ((0xffffffff ^ (unsigned int)v234 * 2) & 3331034566);
    v13 = v234 + 355696674;
    v14 = (v234 ^ 0xffffffff9cba391c) + v234 + (v235 ^ 1665517283) + (0xfffffffffffffffe - ((v234 ^ 0xffffffff9cba391c) + v234 + (v235 ^ 1665517283)) | v236) + ((v234 ^ 0xffffffff9cba391c) + v234 + (v235 ^ 1665517283) + 1 | v236) + 2;
    v237 = (unsigned int)(v14 * 2 + (v14 ^ 0xfffffffe) - (v14 * 2 & 2)) + 3;
    v238 = v224 - (v222 | v223) + v225 + (v225 | ~(v224 - (v222 | v223))) + (v224 - (v222 | v223) & ~v225) + 1;
    v239 = (unsigned int)((v13 & 0xffffffff) - v237) + (v237 & (unsigned int)v13) * 2 + (v237 & ~(unsigned int)v13) * 2 + 1;
    v240 = (char)~v239 + (char)v239 * 2;
    v241 = v240 + 2;
    v242 = v241 + v238 + ((unsigned int)(0xfffffffe - v240) & ~v238) * 2 + (unsigned int)(v238 - v240 - ((unsigned int)(0xfffffffe - v240) | v238)) * 2 - 4;
    v243 = 1 | (v241 & ((char)v238 ^ 1) + (char)v238 * 2 + (char)~v238 * 4 + ((char)v238 * 2 & 2) + 2) * 2;
    (&v16)[3] = (v242 ^ v243) + (v242 & v243) * 2 - 1;
    v13 = &v14;
    v14 = &v13;
    v244 = v14;
    v245 = v13;
    v246 = v245 + v244;
    v247 = ((char *)v244 + 0x2 * ~v244 + 1 & v245) + (char *)v244;
    v248 = (v246 ^ -(v245 | v244)) + (v246 & -(v245 | v244)) * 2;
    v249 = v248 + v247;
    v250 = v3 - 2;
    v251 = v246 + ~v245 * 2 + (v246 + (0xffffffffffffffff ^ v244 * 2) + ~(v246 + (0xffffffffffffffff ^ v244 * 2) + (v244 | ~v245))) * 2 + 2;
    v252 = v249 + ((-v248 & ~v247) + v247 - (v248 + (v247 | -v248))) * 2;
    v253 = 16 >> (v250 & 63);
    v254 = (v252 - v251 & 0xfffffffffffffffe | v249 - v246 & 1) + (v251 - v252) * 2;
    v13 = v254 + (20969080088 & v254 * 2) + (20969080088 & v254 * 2 ^ 20969080088) + 0xfffffffd8f129d73;
    v14 = v254 + 3663957656;
    v255 = (unsigned int)v14 + (unsigned int)v13;
    v256 = v255 + v253;
    v257 = v256 + (v253 + (int)(-0x11 >> (v250 & 63)) * 2 + 1 | ~v255) + 1;
    v258 = v14;
    v259 = v13;
    v260 = ~v258;
    v261 = v258 + 1;
    v262 = ((v258 * 3 + v260 * 4 + 3 & v259) - (v258 * 3 + v260 * 4 + 3 + v259) & v258 * 3 + v260 * 4 + 3 + v259) * 4 + ((v258 * 3 + v260 * 4 + 3 & v259) - (v258 * 3 + v260 * 4 + 3 + v259) ^ v258 * 3 + v260 * 4 + 3 + v259) * 2 + ~(((v258 * 3 + v260 * 4 + 3 & v259) - (v258 * 3 + v260 * 4 + 3 + v259) & v258 * 3 + v260 * 4 + 3 + v259) * 4 + ((v258 * 3 + v260 * 4 + 3 & v259) - (v258 * 3 + v260 * 4 + 3 + v259) ^ v258 * 3 + v260 * 4 + 3 + v259) * 2) * 2 | 1;
    v263 = v262 - ((v258 ^ -v259) + ((-v259 | ~v258) + v261) * 2 + 1) + ((v258 ^ -v259) + ((-v259 | ~v258) + v261) * 2 + 1 + ~v262) * 2;
    v264 = (-((v259 + v258 ^ -(v259 | v258)) + (v259 + v258 & -(v259 | v258)) * 2) ^ (v261 + v260 * 2 & v259) + v258) + (-((v259 + v258 ^ -(v259 | v258)) + (v259 + v258 & -(v259 | v258)) * 2) & (v261 + v260 * 2 & v259) + v258) * 2;
    v265 = (v264 ^ 1) + ~(v264 * 2) + (v264 * 2 & 2);
    v266 = (v263 ^ v265 | 0xfffffffffffffffe) + (v263 ^ v265) + (v263 & v265) * 2 + (v263 ^ v265) + (v263 & v265) * 2 - (~((v263 ^ v265) + (v263 & v265) * 2) + ((v263 ^ v265) + (v263 & v265) * 2) * 2 | 1) + 1;
    v267 = v266 & 1665517283;
    v268 = v266 + 0xffffffff9cba391d + v267 + ((0xffffffff ^ (unsigned int)v266 * 2) & 3331034566);
    v269 = v256 - (v253 | v255) + v257 + (v257 | ~(v256 - (v253 | v255))) + (v256 - (v253 | v255) & ~v257) + 1;
    v13 = v266 + 355696674;
    v14 = (v266 ^ 0xffffffff9cba391c) + v266 + (v267 ^ 1665517283) + (0xfffffffffffffffe - ((v266 ^ 0xffffffff9cba391c) + v266 + (v267 ^ 1665517283)) | v268) + ((v266 ^ 0xffffffff9cba391c) + v266 + (v267 ^ 1665517283) + 1 | v268) + 2;
    v270 = (unsigned int)(v14 * 2 + (v14 ^ 0xfffffffe) - (v14 * 2 & 2)) + 3;
    v271 = (unsigned int)((v13 & 0xffffffff) - v270) + (v270 & (unsigned int)v13) * 2 + (v270 & ~(unsigned int)v13) * 2 - 1;
    v272 = ((v271 | 0xfffffffb) ^ 5) + (v271 | 4) + (10 & (v271 | 0xfffffffb) * 2);
    v273 = (char)v272 + (char)v269 + ((char)-v272 & (char)~v269) * 2 + (char)(v269 - v272 - (v269 | -v272)) * 2;
    v274 = 1 | ((char)v272 & ((char)v269 ^ 1) + (char)v269 * 2 + (char)~v269 * 4 + ((char)v269 * 2 & 2) + 2) * 2;
    (&v16)[4] = (v273 ^ v274) + (v273 & v274) * 2 - 1;
    v13 = &v14;
    v14 = &v13;
    v275 = v14;
    v276 = v13;
    v277 = v276 + v275;
    v278 = ((char *)v275 + 0x2 * ~v275 + 1 & v276) + (char *)v275;
    v279 = (v277 ^ -(v276 | v275)) + (v277 & -(v276 | v275)) * 2;
    v280 = v279 + v278;
    v281 = v5;
    v282 = 16 >> (v281 & 63);
    v283 = v277 + ~v276 * 2 + (v277 + (0xffffffffffffffff ^ v275 * 2) + ~(v277 + (0xffffffffffffffff ^ v275 * 2) + (v275 | ~v276))) * 2 + 2;
    v284 = v280 + ((-v279 & ~v278) + v278 - (v279 + (v278 | -v279))) * 2;
    v285 = (v284 - v283 & 0xfffffffffffffffe | v280 - v277 & 1) + (v283 - v284) * 2;
    v13 = v285 + (20969080088 & v285 * 2) + (20969080088 & v285 * 2 ^ 20969080088) + 0xfffffffd8f129d73;
    v14 = v285 + 3663957656;
    v286 = (unsigned int)v14 + (unsigned int)v13;
    v287 = v286 + v282;
    v288 = v287 + (v282 + (int)(-0x11 >> (v281 & 63)) * 2 + 1 | ~v286) + 1;
    v289 = v14;
    v290 = v13;
    v291 = ~v289;
    v292 = v289 + 1;
    v293 = ((v289 * 3 + v291 * 4 + 3 & v290) - (v289 * 3 + v291 * 4 + 3 + v290) & v289 * 3 + v291 * 4 + 3 + v290) * 4 + ((v289 * 3 + v291 * 4 + 3 & v290) - (v289 * 3 + v291 * 4 + 3 + v290) ^ v289 * 3 + v291 * 4 + 3 + v290) * 2 + ~(((v289 * 3 + v291 * 4 + 3 & v290) - (v289 * 3 + v291 * 4 + 3 + v290) & v289 * 3 + v291 * 4 + 3 + v290) * 4 + ((v289 * 3 + v291 * 4 + 3 & v290) - (v289 * 3 + v291 * 4 + 3 + v290) ^ v289 * 3 + v291 * 4 + 3 + v290) * 2) * 2 | 1;
    v294 = v293 - ((v289 ^ -v290) + ((-v290 | ~v289) + v292) * 2 + 1) + ((v289 ^ -v290) + ((-v290 | ~v289) + v292) * 2 + 1 + ~v293) * 2;
    v295 = (char)v4 + 1;
    v296 = v287 - (v282 | v286) + v288 + (v288 | ~(v287 - (v282 | v286))) + (v287 - (v282 | v286) & ~v288) + 1;
    v297 = (-((v290 + v289 ^ -(v290 | v289)) + (v290 + v289 & -(v290 | v289)) * 2) ^ (v292 + v291 * 2 & v290) + v289) + (-((v290 + v289 ^ -(v290 | v289)) + (v290 + v289 & -(v290 | v289)) * 2) & (v292 + v291 * 2 & v290) + v289) * 2;
    v298 = (v297 ^ 1) + ~(v297 * 2) + (v297 * 2 & 2);
    v299 = (v294 ^ v298 | 0xfffffffffffffffe) + (v294 ^ v298) + (v294 & v298) * 2 + (v294 ^ v298) + (v294 & v298) * 2 - (~((v294 ^ v298) + (v294 & v298) * 2) + ((v294 ^ v298) + (v294 & v298) * 2) * 2 | 1) + 1;
    v300 = v299 & 1665517283;
    v301 = v299 + 0xffffffff9cba391d + v300 + ((0xffffffff ^ (unsigned int)v299 * 2) & 3331034566);
    v13 = v299 + 355696674;
    v14 = (v299 ^ 0xffffffff9cba391c) + v299 + (v300 ^ 1665517283) + (0xfffffffffffffffe - ((v299 ^ 0xffffffff9cba391c) + v299 + (v300 ^ 1665517283)) | v301) + ((v299 ^ 0xffffffff9cba391c) + v299 + (v300 ^ 1665517283) + 1 | v301) + 2;
    v302 = (unsigned int)(v14 * 2 + (v14 ^ 0xfffffffe) - (v14 * 2 & 2)) + 3;
    v303 = (unsigned int)((v13 & 0xffffffff) - v302) + (v302 & (unsigned int)v13) * 2 + (v302 & ~(unsigned int)v13) * 2 - 1;
    v304 = ((v303 | 0xfffffffa) ^ 6) + (v303 | 5) + ((v303 | 0xfffffffa) * 2 & 12);
    v305 = (char)v304 + (char)v296 + ((char)-v304 & (char)~v296) * 2 + (char)(v296 - v304 - (v296 | -v304)) * 2;
    v306 = 1 | ((char)v304 & ((char)v296 ^ 1) + (char)v296 * 2 + (char)~v296 * 4 + ((char)v296 * 2 & 2) + 2) * 2;
    (&v16)[5] = (v305 ^ v306) + (v305 & v306) * 2 - 1;
    v13 = &v14;
    v14 = &v13;
    v307 = v14;
    v308 = v13;
    v309 = v308 + v307;
    v310 = ((char *)v307 + 0x2 * ~v307 + 1 & v308) + (char *)v307;
    v311 = (v309 ^ -(v308 | v307)) + (v309 & -(v308 | v307)) * 2;
    v312 = v311 + v310;
    v313 = 16 >> (v295 & 63);
    v314 = v309 + ~v308 * 2 + (v309 + (0xffffffffffffffff ^ v307 * 2) + ~(v309 + (0xffffffffffffffff ^ v307 * 2) + (v307 | ~v308))) * 2 + 2;
    v315 = v312 + ((-v311 & ~v310) + v310 - (v311 + (v310 | -v311))) * 2;
    v316 = (v315 - v314 & 0xfffffffffffffffe | v312 - v309 & 1) + (v314 - v315) * 2;
    v13 = v316 + (20969080088 & v316 * 2) + (20969080088 & v316 * 2 ^ 20969080088) + 0xfffffffd8f129d73;
    v14 = v316 + 3663957656;
    v317 = (unsigned int)v14 + (unsigned int)v13;
    v318 = v317 + v313;
    v319 = v318 + (v313 + (int)(-0x11 >> (v295 & 63)) * 2 + 1 | ~v317) + 1;
    v320 = v14;
    v321 = v13;
    v322 = ~v320;
    v323 = v320 + 1;
    v324 = ((v320 * 3 + v322 * 4 + 3 & v321) - (v320 * 3 + v322 * 4 + 3 + v321) & v320 * 3 + v322 * 4 + 3 + v321) * 4 + ((v320 * 3 + v322 * 4 + 3 & v321) - (v320 * 3 + v322 * 4 + 3 + v321) ^ v320 * 3 + v322 * 4 + 3 + v321) * 2 + ~(((v320 * 3 + v322 * 4 + 3 & v321) - (v320 * 3 + v322 * 4 + 3 + v321) & v320 * 3 + v322 * 4 + 3 + v321) * 4 + ((v320 * 3 + v322 * 4 + 3 & v321) - (v320 * 3 + v322 * 4 + 3 + v321) ^ v320 * 3 + v322 * 4 + 3 + v321) * 2) * 2 | 1;
    v325 = v324 - ((v320 ^ -v321) + ((-v321 | ~v320) + v323) * 2 + 1) + ((v320 ^ -v321) + ((-v321 | ~v320) + v323) * 2 + 1 + ~v324) * 2;
    v326 = v318 - (v313 | v317) + v319 + (v319 | ~(v318 - (v313 | v317))) + (v318 - (v313 | v317) & ~v319) + 1;
    v327 = (-((v321 + v320 ^ -(v321 | v320)) + (v321 + v320 & -(v321 | v320)) * 2) ^ (v323 + v322 * 2 & v321) + v320) + (-((v321 + v320 ^ -(v321 | v320)) + (v321 + v320 & -(v321 | v320)) * 2) & (v323 + v322 * 2 & v321) + v320) * 2;
    v328 = (v327 ^ 1) + ~(v327 * 2) + (v327 * 2 & 2);
    v329 = (v325 ^ v328 | 0xfffffffffffffffe) + (v325 ^ v328) + (v325 & v328) * 2 + (v325 ^ v328) + (v325 & v328) * 2 - (~((v325 ^ v328) + (v325 & v328) * 2) + ((v325 ^ v328) + (v325 & v328) * 2) * 2 | 1) + 1;
    v330 = v329 & 1665517283;
    v331 = v329 + 0xffffffff9cba391d + v330 + ((0xffffffff ^ (unsigned int)v329 * 2) & 3331034566);
    v13 = v329 + 355696674;
    v14 = (v329 ^ 0xffffffff9cba391c) + v329 + (v330 ^ 1665517283) + (0xfffffffffffffffe - ((v329 ^ 0xffffffff9cba391c) + v329 + (v330 ^ 1665517283)) | v331) + ((v329 ^ 0xffffffff9cba391c) + v329 + (v330 ^ 1665517283) + 1 | v331) + 2;
    v332 = (unsigned int)(v14 * 2 + (v14 ^ 0xfffffffe) - (v14 * 2 & 2)) + 3;
    v333 = (unsigned int)((v13 & 0xffffffff) - v332) + (v332 & (unsigned int)v13) * 2 + (v332 & ~(unsigned int)v13) * 2 - 1;
    v334 = ((v333 | 0xfffffff9) ^ 7) + (v333 | 6) + (__ROL__(v333 | 0xfffffff9, 1) & 14 & 15);
    v335 = (char)v334 + (char)v326 + ((char)-v334 & (char)~v326) * 2 + (char)(v326 - v334 - (v326 | -v334)) * 2;
    v336 = 1 | ((char)v334 & ((char)v326 ^ 1) + (char)v326 * 2 + (char)~v326 * 4 + ((char)v326 * 2 & 2) + 2) * 2;
    (&v16)[6] = (v335 ^ v336) + (v335 & v336) * 2 - 1;
    v13 = &v14;
    v14 = &v13;
    v337 = v14;
    v338 = v13;
    v339 = v338 + v337;
    v340 = ((char *)v337 + 0x2 * ~v337 + 1 & v338) + (char *)v337;
    v341 = (v339 ^ -(v338 | v337)) + (v339 & -(v338 | v337)) * 2;
    v342 = v341 + v340;
    v343 = v339 + ~v338 * 2 + (v339 + (0xffffffffffffffff ^ v337 * 2) + ~(v339 + (0xffffffffffffffff ^ v337 * 2) + (v337 | ~v338))) * 2 + 2;
    v344 = v342 + ((-v341 & ~v340) + v340 - (v341 + (v340 | -v341))) * 2;
    v345 = v2;
    v346 = 16 >> (v345 & 63);
    v347 = (v344 - v343 & 0xfffffffffffffffe | v342 - v339 & 1) + (v343 - v344) * 2;
    v13 = v347 + (20969080088 & v347 * 2) + (20969080088 & v347 * 2 ^ 20969080088) + 0xfffffffd8f129d73;
    v14 = v347 + 3663957656;
    v348 = (unsigned int)v14 + (unsigned int)v13;
    v349 = v348 + v346;
    v350 = v349 + (v346 + (int)(-0x11 >> (v345 & 63)) * 2 + 1 | ~v348) + 1;
    v351 = v14;
    v352 = v13;
    v353 = ~v351;
    v354 = v351 + 1;
    v355 = ((v351 * 3 + v353 * 4 + 3 & v352) - (v351 * 3 + v353 * 4 + 3 + v352) & v351 * 3 + v353 * 4 + 3 + v352) * 4 + ((v351 * 3 + v353 * 4 + 3 & v352) - (v351 * 3 + v353 * 4 + 3 + v352) ^ v351 * 3 + v353 * 4 + 3 + v352) * 2 + ~(((v351 * 3 + v353 * 4 + 3 & v352) - (v351 * 3 + v353 * 4 + 3 + v352) & v351 * 3 + v353 * 4 + 3 + v352) * 4 + ((v351 * 3 + v353 * 4 + 3 & v352) - (v351 * 3 + v353 * 4 + 3 + v352) ^ v351 * 3 + v353 * 4 + 3 + v352) * 2) * 2 | 1;
    v356 = v355 - ((v351 ^ -v352) + ((-v352 | ~v351) + v354) * 2 + 1) + ((v351 ^ -v352) + ((-v352 | ~v351) + v354) * 2 + 1 + ~v355) * 2;
    v357 = (-((v352 + v351 ^ -(v352 | v351)) + (v352 + v351 & -(v352 | v351)) * 2) ^ (v354 + v353 * 2 & v352) + v351) + (-((v352 + v351 ^ -(v352 | v351)) + (v352 + v351 & -(v352 | v351)) * 2) & (v354 + v353 * 2 & v352) + v351) * 2;
    v358 = (v357 ^ 1) + ~(v357 * 2) + (v357 * 2 & 2);
    v359 = (v356 ^ v358 | 0xfffffffffffffffe) + (v356 ^ v358) + (v356 & v358) * 2 + (v356 ^ v358) + (v356 & v358) * 2 - (~((v356 ^ v358) + (v356 & v358) * 2) + ((v356 ^ v358) + (v356 & v358) * 2) * 2 | 1) + 1;
    v360 = v359 & 1665517283;
    v361 = v359 + 0xffffffff9cba391d + v360 + ((0xffffffff ^ (unsigned int)v359 * 2) & 3331034566);
    v362 = v349 - (v346 | v348) + v350 + (v350 | ~(v349 - (v346 | v348))) + (v349 - (v346 | v348) & ~v350) + 1;
    v13 = v359 + 355696674;
    v14 = (v359 ^ 0xffffffff9cba391c) + v359 + (v360 ^ 1665517283) + (0xfffffffffffffffe - ((v359 ^ 0xffffffff9cba391c) + v359 + (v360 ^ 1665517283)) | v361) + ((v359 ^ 0xffffffff9cba391c) + v359 + (v360 ^ 1665517283) + 1 | v361) + 2;
    v363 = (unsigned int)(v14 * 2 + (v14 ^ 0xfffffffe) - (v14 * 2 & 2)) + 3;
    v364 = (unsigned int)((v13 & 0xffffffff) - v363) + (v363 & (unsigned int)v13) * 2 + (v363 & ~(unsigned int)v13) * 2 + 1;
    v365 = (char)~v364 + (char)v364 * 2;
    v366 = v365 + 6;
    v367 = v366 + (char)v362 + ((char)(0xfffffffa - v365) & (char)~v362) * 2 + (char)(v362 + 0x7ffffffffffffffa - (v365 + ((unsigned int)(0xfffffffa - v365) | v362))) * 2;
    v368 = 1 | (v366 & ((char)v362 ^ 1) + (char)v362 * 2 + (char)~v362 * 4 + ((char)v362 * 2 & 2) + 2) * 2;
    *((char *)&v16 + 7) = (v367 ^ v368) + (v367 & v368) * 2 - 1;
    v20 = 0;
    v18 = 0;
    v19 = 0;
    v9 = &v8;
    v8 = &v9;
    v369 = v9;
    v370 = v8;
    v371 = v370 + 0x2 * ~v370 + 1;
    v372 = &v370[(v371 & v369) + ((v370 | ~v369) ^ v369 + 0x2 * ~v369) + -2 * ((v370 | ~v369) & v369 + 1) + 1];
    v373 = (v372 | v369) - ((v372 & ~v369) - v372) + ((v372 & ~v369) - v372 & (v372 | v369)) * 2 + ((v372 & ~v369) - v372 & ~(v372 | v369)) * 2;
    v374 = &v370[(v372 & v371) + ((v372 | v370) - 1 ^ &v370[v372]) + -2 * (&v370[v372] & -(v372 | v370))];
    v375 = v374 + 1;
    v376 = v373 - v375 + ((v375 & ~v373) * 2 | ~(v373 - v375)) + (v373 - v375 | (v375 & ~v373) * 2) + 1;
    v377 = (((v374 - v375 * 2 + v373 & ~(v374 - v375 * 2 + v373 + (v375 | ~v373))) * 4 + (v374 - v375 * 2 + v373 + (v375 | ~v373) ^ ~(v374 - v375 * 2 + v373)) * 2 | 1) ^ (-v373 ^ v375) + (v374 + (-v373 | 0x7ffffffffffffffe - v374)) * 2 + 4) + (((v374 - v375 * 2 + v373 & ~(v374 - v375 * 2 + v373 + (v375 | ~v373))) * 4 + (v374 - v375 * 2 + v373 + (v375 | ~v373) ^ ~(v374 - v375 * 2 + v373)) * 2 | 1) & (-v373 ^ v375) + (v374 + (-v373 | 0x7ffffffffffffffe - v374)) * 2 + 4) * 2;
    v378 = v377 + 0x7ffffffffffffffe;
    v379 = v377 + v376 - 1 + ((v378 & v376) - (v377 + v376 - 1)) * 2;
    v11 = (v379 & 0xfffffffffffffffb - ((v378 | v376) - v377) * 2) + ((v378 | v376) - v377) * 2 + 4 + (v379 & ((v378 | v376) - v377) * 2 + 4);
    while (1)
    {
        v380 = v9;
        v381 = v8;
        v382 = v380 + 1;
        v383 = ((v381 | ~v380) ^ -0x1 * v380 + 0xfffffffffffffffe) - ((v381 | ~v380) & v382) * 2 + (v381 | v380);
        v384 = (&v381[v380 | ~v381] ^ ~&v380[v382 + 0x2 * ~v380 & v381]) + (&v380[v382 + 0x2 * ~v380 & v381] & ~&v381[v380 | ~v381]) * 2;
        v385 = 0xfffffffffffffffe - v383;
        v386 = v383 + 2;
        v387 = (v386 + v385 * 2 & v384 - 1) - v384;
        v388 = (((v387 & v386) * 4 + (v387 ^ v386) * 2 | 1) ^ (v383 + 1 | -v384) + ~((v385 | -v384) + v383 + 1)) + (((v387 & v386) * 4 + (v387 ^ v386) * 2 | 1) & (v383 + 1 | -v384) + ~((v385 | -v384) + v383 + 1)) * 2;
        v8 = ((unsigned int)v388 - 1 & 18) + (v388 - 1 | 18);
        v9 = v388 + 8;
        if (&v8[(v8 + 0x2 * ~v8 + 1 | v9) + (-0x1 * &v8[v8 + 0x2 * ~v8 + 1 | v9] + 0xfffffffffffffffe | v8 * 2 + ~v8 * 2 + (v9 | ~(v8 + 0x2 * ~v8 + 1)) + 2) + (&v8[(v8 + 0x2 * ~v8 + 1 | v9) + 1] | v8 * 2 + ~v8 * 2 + (v9 | ~(v8 + 0x2 * ~v8 + 1)) + 2) + 2] <= v11)
            break;
        v389 = *((char *)&v16 + v11);
        v13 = &v14;
        v14 = &v13;
        v390 = v14;
        v391 = v13;
        v392 = (char *)v390 + 0x2 * ~v390;
        v393 = v392 + 2;
        v394 = v393 + ~(v392 + 1) * 2 | v391;
        v395 = (v390 - v391 + (v394 ^ v393) * 2 + (v394 & v393) * 4 ^ -(v391 ^ v390)) + (v390 - v391 + (v394 ^ v393) * 2 + (v394 & v393) * 4 & -(v391 ^ v390)) * 2;
        v396 = (v395 ^ 1482021477) + (v395 + (1482021477 | ~v395)) * 2 + 2;
        v13 = ~v396 + v396 * 2;
        v14 = v395 + 539192481;
        v397 = ((unsigned int)v14 + 1 ^ (unsigned int)v13) + ((unsigned int)v13 + ((unsigned int)v14 + 1 | ~(unsigned int)v13)) * 2 + 2;
        v398 = (v397 ^ (unsigned int)v11 | 0xfffffffe) + ((v397 ^ (unsigned int)v11) + (v397 & (unsigned int)v11) * 2 | 1);
        v399 = v398 | v389;
        v400 = v389 + 1;
        v401 = (v398 | ~v389) + v400 + v399;
        v402 = (v398 & v400 + ~v389 * 2) + v389;
        v403 = v401 + v402 + (-v402 & ~v401) * 2 + (v401 + (-v402 | ~v401)) * 2;
        v404 = (v403 + 3 ^ v403 + 2) + (v403 + 3 + (v403 + 3 | ~(v403 + 2))) * 2 + 1;
        v405 = v398 + 1 + (v398 + v389 ^ -v399) + (v398 + v389 & -v399) * 2 + (v398 + 1 + ~v398 * 2 & v389) + (v404 | 1) - v404 * 2;
        v406 = v14;
        v407 = v13;
        v408 = -v406;
        v409 = v407 + 1;
        v410 = (v407 ^ v408) + (v409 + (v408 | ~v407)) * 2;
        v411 = (v409 + ~v407 * 2 & v406) * 2;
        v412 = v410 + v411 + (v410 & v411) + (~v410 | ~v411) + 1;
        v413 = v409 + v406 + ((v407 | v406) & v408) * 4 + v412 + (v406 - v407 - (v406 | -v407) + (-v407 & ~v406) + ((v407 | v406) ^ v408) + ~v412) * 2;
        v414 = v413 + (v413 & 0xfffffffffffffffe) + (~v413 | 1);
        v415 = v414 + 3;
        v416 = (v415 - v415 * 2 | 7341831305) + v415;
        v13 = (v414 + 2 | 1) + (v414 + 2 & 1) + 6806666393;
        v14 = (v416 & 0xfffffffe4a648b76 - ((0xfffffffffffffffd - v414 | 0xfffffffe4a648b76) + v415)) + (0xfffffffffffffffd - v414 | 0xfffffffe4a648b76) + v415 + 7341831305 + (v416 & (0xfffffffffffffffd - v414 | 0xfffffffe4a648b76) + v415 + 7341831305);
        v417 = v14 | (unsigned int)v13;
        v418 = (v14 + (unsigned int)v13 ^ -v417) + (v14 + (unsigned int)v13 & -v417) * 2;
        v419 = (v418 ^ v417 + 1) + (v418 & v417 + 1) * 2;
        *((char *)&v16 + v11) = (char)~v419 + (char)v419 * 2 + (char)v405 + (char)((v405 | ~v419 + v419 * 2 - 1) - (~v419 + v419 * 2)) * 2 + ((char)v405 + (char)~v405 * 2 + ((char)-(~v419 + v419 * 2) | (char)~(v405 + ~v405 * 2 + 1))) * 2 + 6;
        v420 = v11;
        v421 = v8;
        v422 = ((v421 | 0xfffffffffffffff4) ^ 0xfffffffffffffff3) - ((v421 | 0xfffffffffffffff4) * 2 & 24) + 1;
        v423 = (v422 ^ (v421 | 11)) + ((v421 | 11) + (v422 | ~(v421 | 11))) * 2 + 2;
        v424 = &v421[v423 + 4 * (v421 & ~v423) + -2 * (v421 & ~v423)] + 2 * v423 + -0x2 * v421 + -2 * (v423 | -v421) + 2 * (-v421 & ~v423);
        v425 = v424 * 2;
        v426 = (-((v425 & 4) + (v424 ^ 2)) | 1) + (v425 & 4) + (v424 ^ 2) + ((v425 & 4) + (v424 ^ 2) - 1 | 1);
        v427 = (v424 ^ 1) + ~v424 * 2 + (v425 & 2);
        v428 = v427 + (~v427 | 1) - 1 + v426 + (v426 & -(v427 + (~v427 | 1))) + (v427 + (~v427 | 1) - 1 | ~v426);
        v429 = v428 + 1;
        v430 = v428 + 3;
        v431 = v430 & (~(unsigned int)v429 | 0xfffffffffffffffe);
        v432 = v429 + v431 + (1 - v431 & 0x7ffffffffffffffd - v428) * 2 + ((1 - v431 | 0x7ffffffffffffffd - v428) + v430) * 2;
        v433 = v432 + 1 + v420 + (v432 + 1 + ~v432 * 2 | ~v420);
        v11 = (v432 & v420) + v433 + (v432 & v420 & ~v433) + (v433 | ~(v432 & v420)) + 1;
    }
    v434 = v16;
    v435 = v6->field_100;
    v436 = v435 + (v434 | ~v435) + (v435 | v434) + 1;
    v437 = (v436 ^ 2) + ~(v435 & v434) + (v436 * 2 & 4);
    v6->field_100 = ~v437 + v437 * 2;
    (g_e824a8 - 0x791f4100)();
}
