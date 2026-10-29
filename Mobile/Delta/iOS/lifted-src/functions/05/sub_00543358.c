/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x543358..0x545990 (9784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_543358_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_543358_0;

typedef struct st_543358_2 {
    char field_0;
} st_543358_2;

typedef struct st_543358_1 {
    char padding_0[96];
    struct st_543358_0 *field_60;
} st_543358_1;

extern char g_6e5c88;
extern unsigned long long g_e82498;
extern st_543358_1 *g_f0d198;
extern char g_10002b0;
extern unsigned int g_fffffffffffffffc;

void sub_543358(unsigned long long a0)
{
    unsigned long long v34;  // x28
    unsigned long long v35;  // x27
    unsigned long long v44;  // x30
    st_543358_2 *v134;  // x11
    unsigned long long v135;  // x0
    unsigned long long v136;  // x8
    unsigned long long v137;  // x8
    unsigned long long v138;  // x8
    unsigned long long v139;  // x9
    unsigned long long v140;  // x12
    unsigned int v141;  // w8
    unsigned int v142;  // w10
    unsigned int v143;  // w9
    st_543358_2 **v45;  // x9
    unsigned int v144;  // w10
    unsigned int v145;  // w8
    unsigned int v146;  // w9
    unsigned int v147;  // w8
    unsigned long v148;  // x8
    unsigned long long v149;  // x9
    unsigned long long v150;  // x10
    unsigned long long v151;  // x11
    unsigned long long v152;  // x8
    unsigned long long v153;  // x8
    st_543358_2 *v46;  // x10
    unsigned long long v154;  // x9
    unsigned long long v155;  // x10
    unsigned long long v156;  // x8
    unsigned long long v157;  // x8
    unsigned int v158;  // w8
    unsigned int v159;  // w9
    unsigned int v160;  // w8
    st_543358_2 **v161;  // x8
    st_543358_2 *v162;  // x9
    unsigned long long v163;  // x10
    unsigned long long v47;  // x12
    unsigned long long v164;  // x8
    unsigned long long v165;  // x8
    unsigned long long v166;  // x8
    unsigned long long v167;  // x9
    unsigned long long v168;  // x12
    unsigned int v169;  // w8
    unsigned int v170;  // w11
    unsigned int v171;  // w10
    unsigned int v172;  // w11
    unsigned int v173;  // w8
    unsigned long long v48;  // x12
    unsigned int v174;  // w9
    unsigned int v175;  // w8
    unsigned long v176;  // x8
    unsigned long long v177;  // x9
    unsigned long long v178;  // x10
    unsigned long long v179;  // x11
    unsigned long long v180;  // x8
    unsigned long long v181;  // x8
    unsigned long long v182;  // x9
    unsigned long long v183;  // x10
    unsigned long long v49;  // x10
    unsigned long long v184;  // x8
    unsigned long long v185;  // x8
    unsigned int v186;  // w8
    unsigned int v187;  // w9
    unsigned int v188;  // w8
    st_543358_2 **v189;  // x8
    st_543358_2 *v190;  // x9
    unsigned long long v191;  // x11
    unsigned long long v192;  // x8
    unsigned long long v193;  // x8
    unsigned long long v50;  // x13
    unsigned long long v194;  // x8
    unsigned long long v195;  // x9
    unsigned long long v196;  // x12
    unsigned int v197;  // w11
    unsigned int v198;  // w8
    unsigned int v199;  // w12
    unsigned int v200;  // w10
    unsigned int v201;  // w8
    unsigned int v202;  // w9
    unsigned int v203;  // w8
    unsigned long long v51;  // x10
    unsigned long v204;  // x8
    unsigned long long v205;  // x9
    unsigned long long v206;  // x10
    unsigned long long v207;  // x11
    unsigned long long v208;  // x8
    unsigned long long v209;  // x8
    unsigned long long v210;  // x9
    unsigned long long v211;  // x10
    unsigned long long v212;  // x8
    unsigned long long v213;  // x8
    unsigned long long v52;  // x10
    unsigned int v214;  // w8
    unsigned int v215;  // w9
    unsigned int v216;  // w8
    st_543358_2 **v217;  // x8
    st_543358_2 *v218;  // x9
    unsigned long long v219;  // x11
    unsigned int v220;  // w25
    unsigned long long v221;  // x8
    unsigned long long v222;  // x8
    unsigned long long v223;  // x8
    unsigned long long v53;  // x10
    unsigned long long v224;  // x9
    unsigned long long v225;  // x10
    unsigned int v226;  // w8
    unsigned int v227;  // w11
    unsigned int v228;  // w10
    unsigned int v229;  // w8
    unsigned int v230;  // w9
    unsigned int v231;  // w8
    unsigned long v232;  // x8
    unsigned long long v233;  // x9
    unsigned long long v36;  // x26
    unsigned long long v54;  // x12
    unsigned long long v234;  // x10
    unsigned long long v235;  // x11
    unsigned long long v236;  // x8
    unsigned long long v237;  // x8
    unsigned long long v238;  // x9
    unsigned long long v239;  // x10
    unsigned long long v240;  // x8
    unsigned long long v241;  // x10
    unsigned int v242;  // w8
    unsigned int v243;  // w9
    unsigned long long v55;  // x10
    unsigned int v244;  // w8
    unsigned int v245;  // w24
    st_543358_2 **v246;  // x8
    st_543358_2 *v247;  // x10
    unsigned long long v248;  // x12
    unsigned long long v249;  // x8
    unsigned long long v250;  // x8
    unsigned long long v251;  // x8
    unsigned long long v252;  // x9
    unsigned long long v253;  // x10
    unsigned long v56;  // x13
    unsigned int v254;  // w8
    unsigned int v255;  // w11
    unsigned int v256;  // w10
    unsigned int v257;  // w8
    unsigned int v258;  // w9
    unsigned int v259;  // w8
    unsigned long v260;  // x8
    unsigned long long v261;  // x9
    unsigned long long v262;  // x10
    unsigned long long v263;  // x11
    unsigned long long v57;  // x15
    unsigned long long v264;  // x8
    unsigned long long v265;  // x8
    unsigned long long v266;  // x9
    unsigned long long v267;  // x10
    unsigned long long v268;  // x8
    unsigned long long v269;  // x10
    unsigned int v270;  // w8
    unsigned int v271;  // w10
    unsigned int v272;  // w8
    unsigned int v273;  // w23
    unsigned long long v58;  // x16
    st_543358_2 **v274;  // x8
    st_543358_2 *v275;  // x10
    unsigned long long v276;  // x12
    unsigned long long v277;  // x8
    unsigned long long v278;  // x8
    unsigned long long v279;  // x8
    unsigned long long v280;  // x9
    unsigned long long v281;  // x10
    unsigned int v282;  // w8
    unsigned int v283;  // w11
    unsigned long long v59;  // x1
    unsigned int v284;  // w10
    unsigned int v285;  // w8
    unsigned int v286;  // w9
    unsigned int v287;  // w8
    unsigned long v288;  // x8
    unsigned long long v289;  // x9
    unsigned long long v290;  // x10
    unsigned long long v291;  // x11
    unsigned long long v292;  // x8
    unsigned long long v293;  // x8
    unsigned long long v60;  // x16
    unsigned long long v294;  // x9
    unsigned long long v295;  // x10
    unsigned long long v296;  // x8
    unsigned long long v297;  // x10
    unsigned int v298;  // w8
    unsigned int v299;  // w9
    unsigned int v300;  // w8
    st_543358_2 **v301;  // x8
    st_543358_2 *v302;  // x10
    unsigned long long v303;  // x12
    unsigned long long v61;  // x10
    unsigned long long v304;  // x8
    unsigned long long v305;  // x8
    unsigned long long v306;  // x8
    unsigned long long v307;  // x9
    unsigned long long v308;  // x12
    unsigned int v309;  // w11
    unsigned int v310;  // w8
    unsigned int v311;  // w12
    unsigned int v312;  // w10
    unsigned int v313;  // w8
    unsigned long long v62;  // x13
    unsigned int v314;  // w9
    unsigned int v315;  // w8
    unsigned long v316;  // x8
    unsigned long long v317;  // x9
    unsigned long long v318;  // x10
    unsigned long long v319;  // x11
    unsigned long long v320;  // x8
    unsigned long long v321;  // x8
    unsigned long long v322;  // x9
    unsigned long long v323;  // x10
    unsigned long long v63;  // x10
    unsigned long long v324;  // x8
    unsigned long long v325;  // x10
    unsigned int v326;  // w8
    unsigned int v327;  // w9
    unsigned int v328;  // w8
    char *v329;  // x8
    char *v330;  // x9
    unsigned long long v331;  // x10
    unsigned long long v332;  // x11
    unsigned long long v333;  // x0
    unsigned long long v37;  // x25
    unsigned long v64;  // x10
    unsigned long long v334;  // x8
    unsigned long long v335;  // x8
    unsigned long v336;  // x0
    unsigned long long v337;  // x9
    unsigned long long v338;  // x10
    unsigned long long v339;  // x8
    unsigned long long v340;  // x12
    unsigned long long v341;  // x11
    unsigned long long v342;  // x8
    unsigned long long v343;  // x9
    unsigned long long v65;  // x13
    unsigned long long v344;  // x8
    char *v345;  // x8
    char *v346;  // x9
    unsigned long long v347;  // x10
    unsigned long long v348;  // x12
    unsigned long long v349;  // x12
    unsigned long long v350;  // x10
    unsigned long long v351;  // x8
    unsigned long long v352;  // x9
    unsigned long long v353;  // x10
    unsigned long long v66;  // x16
    unsigned long long v354;  // x8
    char *v355;  // x9
    unsigned long long v356;  // x8
    char *v357;  // x8
    unsigned int v359;  // w23
    unsigned int v360;  // w24
    st_543358_2 **v361;  // x8
    st_543358_2 *v362;  // x9
    unsigned long long v363;  // x10
    unsigned long long v67;  // x16
    unsigned long long v364;  // x8
    unsigned long long v365;  // x10
    unsigned long long v366;  // x8
    unsigned long long v367;  // x12
    unsigned int v368;  // w8
    unsigned int v369;  // w9
    unsigned int v370;  // w8
    unsigned int v371;  // w9
    unsigned int v372;  // w12
    unsigned int v373;  // w12
    unsigned long long v68;  // x17
    unsigned int v374;  // w9
    unsigned int v375;  // w23
    unsigned long v376;  // x8
    unsigned long v377;  // x10
    unsigned long long v378;  // x8
    unsigned long long v379;  // x9
    unsigned long long v380;  // x8
    unsigned long long v381;  // x9
    unsigned long long v382;  // x8
    unsigned long long v383;  // x10
    unsigned long long v69;  // x10
    unsigned long v384;  // x12
    unsigned int v385;  // w8
    unsigned int v386;  // w9
    unsigned int v387;  // w8
    unsigned int v388;  // w8
    char *v389;  // x8
    unsigned long v390;  // x12
    unsigned long long v391;  // x10
    unsigned long long v392;  // x9
    unsigned long long v393;  // x8
    unsigned long long v70;  // x10
    unsigned long long v394;  // x8
    unsigned long long v395;  // x9
    unsigned long long v396;  // x8
    unsigned long long v397;  // x8
    unsigned long long v398;  // x8
    unsigned long long v399;  // x9
    unsigned long long v400;  // x10
    unsigned long long v401;  // x8
    unsigned long long v71;  // x10
    unsigned long long v72;  // x13
    unsigned long long v73;  // x16
    unsigned long long v38;  // x24
    unsigned long long v74;  // x10
    unsigned long long v75;  // x10
    unsigned long v76;  // x13
    unsigned long long v77;  // x1
    unsigned long long v78;  // x16
    unsigned long long v79;  // x17
    unsigned long long v80;  // x2
    unsigned long long v81;  // x16
    unsigned long long v82;  // x13
    unsigned long long v83;  // x10
    unsigned long long v39;  // x23
    unsigned long long v84;  // x13
    unsigned long long v85;  // x13
    unsigned long long v86;  // x13
    unsigned long v87;  // x17
    unsigned long v88;  // x1
    unsigned long long v89;  // x13
    unsigned long long v90;  // x16
    unsigned long long v91;  // x13
    unsigned long long v92;  // x13
    unsigned long long v93;  // x17
    unsigned long long v40;  // x22
    unsigned long long v94;  // x13
    unsigned long long v95;  // x13
    unsigned long long v96;  // x13
    unsigned long long v97;  // x13
    unsigned long v98;  // x17
    unsigned long long v99;  // x3
    unsigned long long v100;  // x1
    unsigned long long v101;  // x13
    unsigned long long v102;  // x16
    unsigned long long v103;  // x13
    unsigned long long v41;  // x21
    unsigned long long v104;  // x16
    unsigned long long v105;  // x13
    unsigned long long v106;  // x16
    unsigned long long v107;  // x1
    unsigned long long v108;  // x3
    unsigned long long v109;  // x13
    st_543358_2 **v110;  // x16
    st_543358_2 *v111;  // x2
    unsigned long long v112;  // x4
    unsigned long long v113;  // x16
    unsigned long long v42;  // x20
    unsigned long long v114;  // x16
    unsigned long long v115;  // x16
    unsigned long long v116;  // x1
    unsigned long long v117;  // x2
    unsigned int v118;  // w16
    unsigned int v119;  // w3
    unsigned int v120;  // w2
    unsigned int v121;  // w16
    unsigned int v122;  // w16
    unsigned long v123;  // x1
    unsigned long long v43;  // x19
    unsigned long long v124;  // x3
    unsigned long long v125;  // x4
    unsigned long long v126;  // x5
    unsigned long long v127;  // x1
    unsigned long long v128;  // x1
    unsigned long long v129;  // x6
    unsigned long long v130;  // x7
    unsigned long long v131;  // x11
    char v132;  // x8
    st_543358_2 **v133;  // x8
    unsigned long long v0;  // [bp-0xd0]
    st_543358_0 *v1;  // [bp-0xc8]
    unsigned long long v2;  // [bp-0xc0]
    char *v3;  // [bp-0xb8], Other Possible Types: char
    char *v4;  // [bp-0xb0], Other Possible Types: st_543358_2 *, unsigned long
    unsigned long long v5;  // [bp-0xb0]
    unsigned long v6;  // [bp-0xb0]
    unsigned long v7;  // [bp-0xb0]
    unsigned long v8;  // [bp-0xb0]
    st_543358_2 **v9;  // [bp-0xa8], Other Possible Types: char, unsigned long long
    char v10;  // [bp-0xa8]
    unsigned long long v11;  // [bp-0xa8]
    unsigned long long v12;  // [bp-0xa8]
    char v13;  // [bp-0xa8], Other Possible Types: unsigned long long
    st_543358_2 *v14;  // [bp-0xa0], Other Possible Types: unsigned long, unsigned long long
    st_543358_2 *v15;  // [bp-0x98], Other Possible Types: st_543358_2 **, unsigned long long, char, unsigned long
    st_543358_2 **v16;  // [bp-0x90], Other Possible Types: unsigned long long, char
    unsigned long long v17;  // [bp-0x88]
    unsigned long long v18;  // [bp-0x80]
    unsigned long long v19;  // [bp-0x79]
    unsigned long v20;  // [bp-0x68]
    unsigned long long v21;  // [bp-0x60]
    unsigned long long v22;  // [bp-0x58]
    unsigned long long v23;  // [bp-0x50]
    unsigned long long v24;  // [bp-0x48]
    unsigned long long v25;  // [bp-0x40]
    unsigned long long v26;  // [bp-0x38]
    unsigned long long v27;  // [bp-0x30]
    unsigned long long v28;  // [bp-0x28]
    unsigned long long v29;  // [bp-0x20]
    unsigned long long v30;  // [bp-0x18]
    char *v31;  // [bp-0x10]
    unsigned long long v32;  // [bp-0x8]
    char v33;  // [bp+0x0]

    v21 = v34;
    v22 = v35;
    v23 = v36;
    v24 = v37;
    v25 = v38;
    v26 = v39;
    v27 = v40;
    v28 = v41;
    v29 = v42;
    v30 = v43;
    v31 = &v33;
    v32 = v44;
    v2 = a0;
    v20 = *(long long *)&g_10002b0;
    v1 = g_f0d198->field_60;
    v4 = &v9;
    v9 = &v4;
    v45 = v9;
    v46 = v4;
    v47 = v45 - v46 + (v46 & ~v45) * 2;
    v48 = v47 + (v46 & v45) + (v46 & v45) + (-(v46 & v45) & ~(v47 + (v46 & v45))) * 2 + (v47 - (v47 + (v46 & v45) | -(v46 & v45))) * 2;
    v49 = v46 + v45 + (-v45 & ~v46) * 2 + &v46[-v45 | ~v46] * 2 + 2;
    v50 = 1 | (&v46[(char *)&g_fffffffffffffffc + 3 ^ v46 * 2] & v45) * 2;
    v51 = -((v50 ^ v49) + (v50 & v49) * 2);
    v52 = v48 + (v51 | ~v48) + (v51 | v48) + 1;
    v53 = v52 + (v52 & 1) + (~(unsigned int)v52 | (char *)&g_fffffffffffffffc + 2) + 2;
    v54 = (v53 * 2 | v53 >> 63) & 6 & 7;
    v4 = (v54 ^ 6) + v54 + v53 - 4;
    v9 = (v53 ^ 7) + (v53 + (~v53 | 7)) * 2 + 1;
    v55 = v9;
    v56 = v4;
    v57 = v56 | v55;
    v58 = -((v56 - v55 + (v55 | ~v56) ^ v55 + 1) + (v56 - v55 + (v55 | ~v56) & v55 + 1) * 2);
    v59 = v57 + 1;
    v60 = (v58 ^ v57) + (v59 + (v58 | ~v57)) * 2;
    v61 = v59 + (v56 + v55 ^ -v57) + (v56 + v55 & -v57) * 2 + ~((v56 + v55 ^ -v57) + (v56 + v55 & -v57) * 2) * 2;
    v62 = (v60 - v61 + (v61 | ~v60) ^ (v60 & v61) - v60) + (v60 - v61 + (v61 | ~v60) & (v60 & v61) - v60) * 2;
    v63 = v62 + ((v60 & ~v61) * 2 | ~v62) + (v62 | (v60 & ~v61) * 2) + 1;
    v5 = ~((v63 | 1) + (v63 & 1) + 2) + ((v63 | 1) + (v63 & 1) + 2) * 2;
    v10 = (v63 ^ 15) + (v63 + (~v63 | 15)) * 2 + 1;
    v64 = v10;
    v65 = v5;
    v66 = v64 - v65 + (v65 & ~v64) * 2;
    v67 = v66 + (v65 & v64) + (v65 & v64) + (-(v65 & v64) & ~(v66 + (v65 & v64))) * 2 + (v66 - (v66 + (v65 & v64) | -(v65 & v64))) * 2;
    v68 = (v65 ^ 1) + ~v65 * 2 + ((v65 * 2 | v65 >> 63) & 2 & 3);
    v69 = v64 + ~v64 * 2 + v65;
    v70 = v69 + ((v68 + v64 & -(v68 | v64)) * 4 + (v68 + v64 ^ -(v68 | v64)) * 2 | (char *)&g_fffffffffffffffc - v69 + 1) + ((v68 + v64 & -(v68 | v64)) * 4 + (v68 + v64 ^ -(v68 | v64)) * 2 | v69 + 2);
    v71 = v67 + v70 + 4 + ((v70 + 9223372036854775810 & v67) - (v67 + v70 + 4)) * 2 + ((v70 + 4 & 1) + ((char *)&g_fffffffffffffffc - v70 | 1) + v67 ^ -((v70 + 4 & 1) + ((char *)&g_fffffffffffffffc - v70 | 1) | v67)) * 2 + ((v70 + 4 & 1) + ((char *)&g_fffffffffffffffc - v70 | 1) + v67 & -((v70 + 4 & 1) + ((char *)&g_fffffffffffffffc - v70 | 1) | v67)) * 4;
    v72 = v71 + 2;
    v73 = ~v72 + v72 * 2;
    v74 = (char *)&g_fffffffffffffffc - v71 + 2;
    v6 = v73 + (v74 | 22) + (v74 | 22) + v72 + (v73 ^ 22) + ((char *)&g_fffffffffffffffc - v73 - (v74 | 22) + 2 | (v74 | 22) + v72 + (v73 ^ 22)) + (v73 + (v74 | 22) + 1 & ~((v74 | 22) + v72 + (v73 ^ 22))) + 2;
    v11 = (v74 | (char *)&g_fffffffffffffffc + 1) + v72 + (v73 | (char *)&g_fffffffffffffffc + 1) + 3 + ((char *)&g_fffffffffffffffc - (v73 | (char *)&g_fffffffffffffffc + 1) | (char *)&g_fffffffffffffffc - (v74 | (char *)&g_fffffffffffffffc + 1) - v72 + 1) + ((v73 | (char *)&g_fffffffffffffffc + 1) + 3 & (v74 | (char *)&g_fffffffffffffffc + 1) + v72 + 2) + 3;
    v75 = v11;
    v76 = v6;
    v77 = v75 + 1;
    v78 = v77 + (v76 | ~v75) + (v76 ^ v75);
    v79 = v76 & v75;
    v80 = -v79;
    v81 = (v78 ^ v80) + (v78 - v79 - (v78 | v80)) * 2;
    v82 = v77 + v76;
    v83 = v82 + (v80 & ~(v76 | v75)) * 2 + ((v76 | v75) + (v80 | ~(v76 | v75))) * 2;
    v84 = (v81 + (~v83 | ~v81) ^ ~(~v83 + (v81 & v83))) + (v81 + (v82 & 1) + ((char *)&g_fffffffffffffffc - v83 + 2 | 1) & -(v81 | (v82 & 1) + ((char *)&g_fffffffffffffffc - v83 + 2 | 1))) * 4 + ((~v83 + (v81 & v83) & ~(v81 + (~v83 | ~v81))) + (v81 + (v82 & 1) + ((char *)&g_fffffffffffffffc - v83 + 2 | 1) ^ -(v81 | (v82 & 1) + ((char *)&g_fffffffffffffffc - v83 + 2 | 1)))) * 2;
    v7 = v84 + ((0xffffffff ^ (unsigned int)v84 * 2) & 58) + (v84 + (29 | ~v84)) * 2 - 28;
    v12 = v84 + 4;
    v85 = (v7 + (v12 | ~v7) + 1 ^ (v7 | v12) + 1) + (v7 + (v12 | ~v7) + 1 & (v7 | v12) + 1) * 2;
    v86 = v12;
    v87 = v7;
    v88 = (v87 | v86) - ((v87 | ~v86) & v86 + 1) * 2 + ((v87 | ~v86) ^ v86 + ~v86 * 2);
    v89 = (v87 ^ -v86) + (v87 - v86 - (v87 | -v86)) * 2;
    v90 = 1 | (v86 - v87 + (v87 & ~v86)) * 2;
    v91 = -((v89 ^ v90) + (v89 & v90) * 2);
    v92 = v88 + (v91 | (char *)&g_fffffffffffffffc - v88 + 2) + (v91 | v88 + 1);
    v93 = v92 + 3;
    v7 = (v93 | 1) + (v93 & 1) + 30;
    v12 = v92 + 2 + (v92 + 2 + (0x7ffffffffffffffc - v92 | 10)) * 2 + ((0xffffffff ^ (unsigned int)v93 * 2) & 20) - 6;
    v94 = ((v12 | ~v7) + v7 + v12 - ((v12 | ~v7) + (v7 | v12) * 2) ^ (v7 | v12) + ~((v12 | ~v7) + v7)) + ((v12 | ~v7) + v7 + v12 - ((v12 | ~v7) + (v7 | v12) * 2) & (v7 | v12) + ~((v12 | ~v7) + v7)) * 2;
    v95 = (-v94 | 1) + v94 + (v94 - 1 | 1);
    v8 = (v95 | 1) + (v95 & 1) + 14;
    v13 = (v95 + 0x22 + (0xffffffffffffffde & ~v95) & (v95 & 33) - (v95 + 0x22)) + v95 + 0x22 + ~(v95 & 33) + (v95 + 0x22 + (0xffffffffffffffde & ~v95) & v95 + 0x22 + ~(v95 & 33));
    v96 = v8 + ~v13 + v13 * 2 + 2;
    v0 = 0x8000000 >> ((char)~v96 + (char)v96 * 2 & 63);
    v97 = v13;
    v98 = v8;
    v99 = v98 + ~v98 * 2 + 1;
    v100 = v97 + 1 + v99 + (v97 + 1 + ~v97 * 2 + 1 ^ (v98 | ~(v97 + 1 + ~v97 * 2))) * 2 + (v97 + 1 + ~v97 * 2 + 1 & (v98 | ~(v97 + 1 + ~v97 * 2))) * 4;
    v101 = v98 + v97 + (-v97 & ~v98) * 2 + (v98 - v97 - (v98 | -v97)) * 2;
    v102 = ((v99 + ~v99 * 2 + 1 | v97) + v99) * 2 + 3;
    v103 = ~((v102 ^ v101) + (v102 & v101) * 2) + ((v102 ^ v101) + (v102 & v101) * 2) * 2;
    v104 = -v103;
    v105 = v103 - v100 + (v100 | v104) + (v103 - 1 & v100) - v103;
    v106 = v105 + (v100 & v104) * 2;
    v107 = ~v106;
    v108 = v106 + 1;
    v8 = ((v106 ^ 2) + (v108 + (v107 | 2)) * 2 | 1) + (v105 & 1) - 2;
    v13 = v106 + ((0xffffffff ^ (unsigned int)v106 * 2) & 112) + (v108 + (v107 | 56)) * 2 - 57;
    v109 = v8 + ~v13 + (v13 + 1 & ~v8) * 2 + (v8 + (v13 + 1 | ~v8)) * 2 + 2;
    v15 = &v16;
    v16 = &v15;
    v110 = v16;
    v111 = v15;
    v112 = v110 - v111 + (v111 & ~v110) * 2;
    v113 = ((v111 ^ -v110) + (v111 - v110 - (v111 | -v110)) * 2 | ((v111 | v110) & -v111) * 4 + ((v111 | v110) ^ -v111) * 2) + ((v111 ^ -v110) + (v111 - v110 - (v111 | -v110)) * 2 & ((v111 | v110) & -v111) * 4 + ((v111 | v110) ^ -v111) * 2);
    v114 = v112 - v113 + (v113 | ~v112) + (v112 & ~v113);
    v115 = (v114 * 2 & 4) + (v114 ^ 2);
    v116 = v115 - 1;
    v117 = -v115;
    v15 = (((v117 | 62576620) ^ v115) + ((v117 | 62576620) & v115) * 2 | (v117 | 62576620) + v115 + (v116 ^ 62576620)) + (((v117 | 62576620) ^ v115) + ((v117 | 62576620) & v115) * 2 & (v117 | 62576620) + v115 + (v116 ^ 62576620));
    v16 = (v116 ^ 217494340) + ((v117 | 217494340) + v115) * 2 - 1;
    v118 = v15;
    v119 = v118 + 1;
    v120 = v119 + ~v118 * 2 | v16;
    v121 = (v120 ^ v119) + (v120 & v119) * 2 + (v118 | v16 | ~((v120 ^ v119) + (v120 & v119) * 2)) + ((v120 ^ v119) + (v120 & v119) * 2 | v118 | v16) + 1;
    v122 = v121 - (v121 * 2 + 2) + (v121 * 2 + 2 + ~v121) * 2;
    v123 = v16;
    v124 = v15;
    v125 = (v123 ^ -v124) + (v123 + ((char *)&g_fffffffffffffffc + 3 ^ v123 * 2) + v124 & -(v123 + ((char *)&g_fffffffffffffffc + 3 ^ v123 * 2) | v124)) * 4 + (v123 - v124 - (v123 | -v124) + (v123 + ((char *)&g_fffffffffffffffc + 3 ^ v123 * 2) + v124 ^ -(v123 + ((char *)&g_fffffffffffffffc + 3 ^ v123 * 2) | v124))) * 2;
    v126 = (v124 ^ 1) + ~v124 * 2 + ((v124 * 2 | v124 >> 63) & 2 & 3);
    v127 = (v124 ^ -v123) + (v124 - v123 - (v124 | -v123) + v126 + (v126 + ~v126 * 2 + 1 | v123)) * 2;
    v128 = v127 + 2 + ~v125 + (v125 | (char *)&g_fffffffffffffffc - v127 + 2) * 2 + (v127 + 2 + ~(v127 + 2) * 2 + (0x7ffffffffffffffd - (v127 + 2 + ~(v127 + 2) * 2) | v125)) * 2;
    v123 = v128 + 4;
    v129 = v128 + 7;
    v130 = 0xfffffffffffffff8 - v128;
    v131 = (v123 + 32777495 ^ -(v129 | 32777492)) + (v123 + 32777495 & -(v129 | 32777492)) * 2;
    v15 = v129 + v123 + v130 * 2 + 4 + (&(&g_6e5c88)[v123] ^ 0xffffffffff91a377 - v123 - (v130 | 0xffffffffff91a37a)) - (v123 + v130 * 2 + 4 & 0xffffffffff91a37a) + (&(&g_6e5c88)[v123] & 0xffffffffff91a377 - v123 - (v130 | 0xffffffffff91a37a)) * 2;
    v16 = v131 + (v123 + 32777496 + (v130 | 0xfffffffffe0bdaeb) | ~v131) + (v131 | v123 + 32777496 + (v130 | 0xfffffffffe0bdaeb)) + 1;
    v132 = v15 + (v16 ^ 0xfffffffe) - ~v16 * 2 - (__ROL__(v16, 1) & 2 & 3);
    v16 = v122 - v132 + (v132 & (char)~v122) * 4 - (v132 & (char)~v122) * 2;
    v14 = &v15;
    v15 = &v14;
    v133 = v15;
    v134 = v14;
    v135 = v133 - v134 + (v134 & ~v133) * 2;
    v136 = ((v134 ^ -v133) + (v134 - v133 - (v134 | -v133)) * 2 | ((v134 | v133) & -v134) * 4 + ((v134 | v133) ^ -v134) * 2) + ((v134 ^ -v133) + (v134 - v133 - (v134 | -v133)) * 2 & ((v134 | v133) & -v134) * 4 + ((v134 | v133) ^ -v134) * 2);
    v137 = v135 - v136 + (v136 | ~v135) + (v135 & ~v136);
    v138 = (v137 * 2 & 4) + (v137 ^ 2);
    v139 = -v138;
    v140 = v138 - 1;
    v14 = (((v139 | 62576620) ^ v138) + ((v139 | 62576620) & v138) * 2 | (v139 | 62576620) + v138 + (v140 ^ 62576620)) + (((v139 | 62576620) ^ v138) + ((v139 | 62576620) & v138) * 2 & (v139 | 62576620) + v138 + (v140 ^ 62576620));
    v15 = (v140 ^ 217494340) + ((v139 | 217494340) + v138) * 2 - 1;
    v141 = v14;
    v142 = v141 + 1;
    v143 = v142 + ~v141 * 2 | (unsigned int)v15;
    v144 = (unsigned int)(0x8000000 >> (((char)v4 & (char)~v9) + ((char)v4 | (char)~v9) + (char)v9 * 2 + 1 & 63)) & 0xff;
    v145 = (v143 ^ v142) + (v143 & v142) * 2 + (v141 | (unsigned int)v15 | ~((v143 ^ v142) + (v143 & v142) * 2)) + ((v143 ^ v142) + (v143 & v142) * 2 | v141 | (unsigned int)v15) + 1;
    v146 = (v144 + ~v144 * 2 ^ ~(v145 | v144 + ~v144 * 2 + 1)) + ((v145 | v144 + ~v144 * 2 + 1) & ~(v144 + ~v144 * 2)) * 2;
    v147 = v144 - v145 + (v145 & v144) + (v145 & ~v144) * 2 + 1;
    v148 = v15;
    v149 = v14;
    v150 = (v148 ^ -v149) + (v148 + ((char *)&g_fffffffffffffffc + 3 ^ v148 * 2) + v149 & -(v148 + ((char *)&g_fffffffffffffffc + 3 ^ v148 * 2) | v149)) * 4 + (v148 - v149 - (v148 | -v149) + (v148 + ((char *)&g_fffffffffffffffc + 3 ^ v148 * 2) + v149 ^ -(v148 + ((char *)&g_fffffffffffffffc + 3 ^ v148 * 2) | v149))) * 2;
    v151 = (v149 ^ 1) + ~v149 * 2 + ((v149 * 2 | v149 >> 63) & 2 & 3);
    v152 = (v149 ^ -v148) + (v149 - v148 - (v149 | -v148) + v151 + (v151 + ~v151 * 2 + 1 | v148)) * 2;
    v153 = v152 + 2 + ~v150 + (v150 | (char *)&g_fffffffffffffffc - v152 + 2) * 2 + (v152 + 2 + ~(v152 + 2) * 2 + (0x7ffffffffffffffd - (v152 + 2 + ~(v152 + 2) * 2) | v150)) * 2;
    v154 = v153 + 4;
    v155 = 0xfffffffffffffff8 - v153;
    v156 = v153 + 7;
    v157 = (v154 + 32777495 ^ -(v156 | 32777492)) + (v154 + 32777495 & -(v156 | 32777492)) * 2;
    v14 = v156 + v154 + v155 * 2 + 4 + (&(&g_6e5c88)[v154] ^ 0xffffffffff91a377 - v154 - (v155 | 0xffffffffff91a37a)) - (v154 + v155 * 2 + 4 & 0xffffffffff91a37a) + (&(&g_6e5c88)[v154] & 0xffffffffff91a377 - v154 - (v155 | 0xffffffffff91a37a)) * 2;
    v15 = v157 + (v154 + 32777496 + (v155 | 0xfffffffffe0bdaeb) | ~v157) + (v157 | v154 + 32777496 + (v155 | 0xfffffffffe0bdaeb)) + 1;
    v158 = (unsigned int)v14 + (v15 ^ 0xfffffffe) - ~v15 * 2 - (__ROL__(v15, 1) & 2 & 3);
    v159 = v158 + (~v158 | 1) + 1;
    v160 = (v159 ^ (v158 | 1) + 1) + (v159 & (v158 | 1) + 1) * 2;
    (&v16)[1] = (unsigned int)((v147 ^ v146) + (v147 & v146) * 2 - ((char)~v160 + (char)v160 * 2)) + ((char)~v160 + (char)v160 * 2 & -((v147 ^ v146) + (v147 & v146) * 2)) * 2 - 1;
    v14 = &v15;
    v15 = &v14;
    v161 = v15;
    v162 = v14;
    v163 = v161 - v162 + (v162 & ~v161) * 2;
    v164 = ((v162 ^ -v161) + (v162 - v161 - (v162 | -v161)) * 2 | ((v162 | v161) & -v162) * 4 + ((v162 | v161) ^ -v162) * 2) + ((v162 ^ -v161) + (v162 - v161 - (v162 | -v161)) * 2 & ((v162 | v161) & -v162) * 4 + ((v162 | v161) ^ -v162) * 2);
    v165 = v163 - v164 + (v164 | ~v163) + (v163 & ~v164);
    v166 = (v165 * 2 & 4) + (v165 ^ 2);
    v167 = -v166;
    v168 = v166 - 1;
    v14 = (((v167 | 62576620) ^ v166) + ((v167 | 62576620) & v166) * 2 | (v167 | 62576620) + v166 + (v168 ^ 62576620)) + (((v167 | 62576620) ^ v166) + ((v167 | 62576620) & v166) * 2 & (v167 | 62576620) + v166 + (v168 ^ 62576620));
    v15 = (v168 ^ 217494340) + ((v167 | 217494340) + v166) * 2 - 1;
    v169 = v14;
    v170 = v169 + 1;
    v171 = v170 + ~v169 * 2 | (unsigned int)v15;
    v172 = (unsigned int)(0x8000000 >> (v10 + (char)v5 & 63)) & 0xff;
    v173 = (v171 ^ v170) + (v171 & v170) * 2 + (v169 | (unsigned int)v15 | ~((v171 ^ v170) + (v171 & v170) * 2)) + ((v171 ^ v170) + (v171 & v170) * 2 | v169 | (unsigned int)v15) + 1;
    v174 = (v172 + ~v172 * 2 ^ ~(v173 | v172 + ~v172 * 2 + 1)) + ((v173 | v172 + ~v172 * 2 + 1) & ~(v172 + ~v172 * 2)) * 2;
    v175 = v172 - v173 + (v173 & v172) + (v173 & ~v172) * 2 + 1;
    v176 = v15;
    v177 = v14;
    v178 = (v176 ^ -v177) + (v176 + ((char *)&g_fffffffffffffffc + 3 ^ v176 * 2) + v177 & -(v176 + ((char *)&g_fffffffffffffffc + 3 ^ v176 * 2) | v177)) * 4 + (v176 - v177 - (v176 | -v177) + (v176 + ((char *)&g_fffffffffffffffc + 3 ^ v176 * 2) + v177 ^ -(v176 + ((char *)&g_fffffffffffffffc + 3 ^ v176 * 2) | v177))) * 2;
    v179 = (v177 ^ 1) + ~v177 * 2 + ((v177 * 2 | v177 >> 63) & 2 & 3);
    v180 = (v177 ^ -v176) + (v177 - v176 - (v177 | -v176) + v179 + (v179 + ~v179 * 2 + 1 | v176)) * 2;
    v181 = v180 + 2 + ~v178 + (v178 | (char *)&g_fffffffffffffffc - v180 + 2) * 2 + (v180 + 2 + ~(v180 + 2) * 2 + (0x7ffffffffffffffd - (v180 + 2 + ~(v180 + 2) * 2) | v178)) * 2;
    v182 = v181 + 4;
    v183 = 0xfffffffffffffff8 - v181;
    v184 = v181 + 7;
    v185 = (v182 + 32777495 ^ -(v184 | 32777492)) + (v182 + 32777495 & -(v184 | 32777492)) * 2;
    v14 = v184 + v182 + v183 * 2 + 4 + (&(&g_6e5c88)[v182] ^ 0xffffffffff91a377 - v182 - (v183 | 0xffffffffff91a37a)) - (v182 + v183 * 2 + 4 & 0xffffffffff91a37a) + (&(&g_6e5c88)[v182] & 0xffffffffff91a377 - v182 - (v183 | 0xffffffffff91a37a)) * 2;
    v15 = v185 + (v182 + 32777496 + (v183 | 0xfffffffffe0bdaeb) | ~v185) + (v185 | v182 + 32777496 + (v183 | 0xfffffffffe0bdaeb)) + 1;
    v186 = (unsigned int)v14 + (v15 ^ 0xfffffffe) - ~v15 * 2 - (__ROL__(v15, 1) & 2 & 3);
    v187 = v186 + (~v186 | 2) + 1;
    v188 = (v187 ^ (v186 | 2) + 1) + (v187 & (v186 | 2) + 1) * 2;
    (&v16)[2] = (unsigned int)((v175 ^ v174) + (v175 & v174) * 2 - ((char)~v188 + (char)v188 * 2)) + ((char)~v188 + (char)v188 * 2 & -((v175 ^ v174) + (v175 & v174) * 2)) * 2 - 1;
    v14 = &v15;
    v15 = &v14;
    v189 = v15;
    v190 = v14;
    v191 = v189 - v190 + (v190 & ~v189) * 2;
    v192 = ((v190 ^ -v189) + (v190 - v189 - (v190 | -v189)) * 2 | ((v190 | v189) & -v190) * 4 + ((v190 | v189) ^ -v190) * 2) + ((v190 ^ -v189) + (v190 - v189 - (v190 | -v189)) * 2 & ((v190 | v189) & -v190) * 4 + ((v190 | v189) ^ -v190) * 2);
    v193 = v191 - v192 + (v192 | ~v191) + (v191 & ~v192);
    v194 = (v193 * 2 & 4) + (v193 ^ 2);
    v195 = -v194;
    v196 = v194 - 1;
    v197 = (unsigned int)(0x8000000 >> ((char)v6 + (char)v11 * 4 + (char)((v11 & 0xff) - (char)v11 * 4) & 63)) & 0xff;
    v14 = (((v195 | 62576620) ^ v194) + ((v195 | 62576620) & v194) * 2 | (v195 | 62576620) + v194 + (v196 ^ 62576620)) + (((v195 | 62576620) ^ v194) + ((v195 | 62576620) & v194) * 2 & (v195 | 62576620) + v194 + (v196 ^ 62576620));
    v15 = (v196 ^ 217494340) + ((v195 | 217494340) + v194) * 2 - 1;
    v198 = v14;
    v199 = v198 + 1;
    v200 = v199 + ~v198 * 2 | (unsigned int)v15;
    v201 = (v200 ^ v199) + (v200 & v199) * 2 + (v198 | (unsigned int)v15 | ~((v200 ^ v199) + (v200 & v199) * 2)) + ((v200 ^ v199) + (v200 & v199) * 2 | v198 | (unsigned int)v15) + 1;
    v202 = (v197 + ~v197 * 2 ^ ~(v201 | v197 + ~v197 * 2 + 1)) + ((v201 | v197 + ~v197 * 2 + 1) & ~(v197 + ~v197 * 2)) * 2;
    v203 = v197 - v201 + (v201 & v197) + (v201 & ~v197) * 2 + 1;
    v204 = v15;
    v205 = v14;
    v206 = (v204 ^ -v205) + (v204 + ((char *)&g_fffffffffffffffc + 3 ^ v204 * 2) + v205 & -(v204 + ((char *)&g_fffffffffffffffc + 3 ^ v204 * 2) | v205)) * 4 + (v204 - v205 - (v204 | -v205) + (v204 + ((char *)&g_fffffffffffffffc + 3 ^ v204 * 2) + v205 ^ -(v204 + ((char *)&g_fffffffffffffffc + 3 ^ v204 * 2) | v205))) * 2;
    v207 = (v205 ^ 1) + ~v205 * 2 + ((v205 * 2 | v205 >> 63) & 2 & 3);
    v208 = (v205 ^ -v204) + (v205 - v204 - (v205 | -v204) + v207 + (v207 + ~v207 * 2 + 1 | v204)) * 2;
    v209 = v208 + 2 + ~v206 + (v206 | (char *)&g_fffffffffffffffc - v208 + 2) * 2 + (v208 + 2 + ~(v208 + 2) * 2 + (0x7ffffffffffffffd - (v208 + 2 + ~(v208 + 2) * 2) | v206)) * 2;
    v210 = v209 + 4;
    v211 = 0xfffffffffffffff8 - v209;
    v212 = v209 + 7;
    v213 = (v210 + 32777495 ^ -(v212 | 32777492)) + (v210 + 32777495 & -(v212 | 32777492)) * 2;
    v14 = v212 + v210 + v211 * 2 + 4 + (&(&g_6e5c88)[v210] ^ 0xffffffffff91a377 - v210 - (v211 | 0xffffffffff91a37a)) - (v210 + v211 * 2 + 4 & 0xffffffffff91a37a) + (&(&g_6e5c88)[v210] & 0xffffffffff91a377 - v210 - (v211 | 0xffffffffff91a37a)) * 2;
    v15 = v213 + (v210 + 32777496 + (v211 | 0xfffffffffe0bdaeb) | ~v213) + (v213 | v210 + 32777496 + (v211 | 0xfffffffffe0bdaeb)) + 1;
    v214 = (unsigned int)v14 + (v15 ^ 0xfffffffe) - ~v15 * 2 - (__ROL__(v15, 1) & 2 & 3);
    v215 = v214 + (~v214 | 3) + 1;
    v216 = (v215 ^ (v214 | 3) + 1) + (v215 & (v214 | 3) + 1) * 2;
    (&v16)[3] = (unsigned int)((v203 ^ v202) + (v203 & v202) * 2 - ((char)~v216 + (char)v216 * 2)) + ((char)~v216 + (char)v216 * 2 & -((v203 ^ v202) + (v203 & v202) * 2)) * 2 - 1;
    v14 = &v15;
    v15 = &v14;
    v217 = v15;
    v218 = v14;
    v219 = v217 - v218 + (v218 & ~v217) * 2;
    v220 = (unsigned int)(0x8000000 >> ((char)~v85 + (char)v85 * 2 & 63)) & 0xff;
    v221 = ((v218 ^ -v217) + (v218 - v217 - (v218 | -v217)) * 2 | ((v218 | v217) & -v218) * 4 + ((v218 | v217) ^ -v218) * 2) + ((v218 ^ -v217) + (v218 - v217 - (v218 | -v217)) * 2 & ((v218 | v217) & -v218) * 4 + ((v218 | v217) ^ -v218) * 2);
    v222 = v219 - v221 + (v221 | ~v219) + (v219 & ~v221);
    v223 = (v222 * 2 & 4) + (v222 ^ 2);
    v224 = v223 - 1;
    v225 = -v223;
    v14 = (((v225 | 62576620) ^ v223) + ((v225 | 62576620) & v223) * 2 | (v225 | 62576620) + v223 + (v224 ^ 62576620)) + (((v225 | 62576620) ^ v223) + ((v225 | 62576620) & v223) * 2 & (v225 | 62576620) + v223 + (v224 ^ 62576620));
    v15 = (v224 ^ 217494340) + ((v225 | 217494340) + v223) * 2 - 1;
    v226 = v14;
    v227 = v226 + 1;
    v228 = v227 + ~v226 * 2 | (unsigned int)v15;
    v229 = (v228 ^ v227) + (v228 & v227) * 2 + (v226 | (unsigned int)v15 | ~((v228 ^ v227) + (v228 & v227) * 2)) + ((v228 ^ v227) + (v228 & v227) * 2 | v226 | (unsigned int)v15) + 1;
    v230 = (v220 + ~v220 * 2 ^ ~(v229 | v220 + ~v220 * 2 + 1)) + ((v229 | v220 + ~v220 * 2 + 1) & ~(v220 + ~v220 * 2)) * 2;
    v231 = v220 - v229 + (v229 & v220) + (v229 & ~v220) * 2 + 1;
    v232 = v15;
    v233 = v14;
    v234 = (v232 ^ -v233) + (v232 + ((char *)&g_fffffffffffffffc + 3 ^ v232 * 2) + v233 & -(v232 + ((char *)&g_fffffffffffffffc + 3 ^ v232 * 2) | v233)) * 4 + (v232 - v233 - (v232 | -v233) + (v232 + ((char *)&g_fffffffffffffffc + 3 ^ v232 * 2) + v233 ^ -(v232 + ((char *)&g_fffffffffffffffc + 3 ^ v232 * 2) | v233))) * 2;
    v235 = (v233 ^ 1) + ~v233 * 2 + ((v233 * 2 | v233 >> 63) & 2 & 3);
    v236 = (v233 ^ -v232) + (v233 - v232 - (v233 | -v232) + v235 + (v235 + ~v235 * 2 + 1 | v232)) * 2;
    v237 = v236 + 2 + ~v234 + (v234 | (char *)&g_fffffffffffffffc - v236 + 2) * 2 + (v236 + 2 + ~(v236 + 2) * 2 + (0x7ffffffffffffffd - (v236 + 2 + ~(v236 + 2) * 2) | v234)) * 2;
    v238 = v237 + 4;
    v239 = v237 + 7;
    v240 = 0xfffffffffffffff8 - v237;
    v241 = (v238 + 32777495 ^ -(v239 | 32777492)) + (v238 + 32777495 & -(v239 | 32777492)) * 2;
    v14 = v239 + v238 + v240 * 2 + 4 + (&(&g_6e5c88)[v238] ^ 0xffffffffff91a377 - v238 - (v240 | 0xffffffffff91a37a)) - (v238 + v240 * 2 + 4 & 0xffffffffff91a37a) + (&(&g_6e5c88)[v238] & 0xffffffffff91a377 - v238 - (v240 | 0xffffffffff91a37a)) * 2;
    v15 = v241 + (v238 + 32777496 + (v240 | 0xfffffffffe0bdaeb) | ~v241) + (v241 | v238 + 32777496 + (v240 | 0xfffffffffe0bdaeb)) + 1;
    v242 = (unsigned int)v14 + (v15 ^ 0xfffffffe) - ~v15 * 2 - (__ROL__(v15, 1) & 2 & 3);
    v243 = v242 + (~v242 | 4) + 1;
    v244 = (v243 ^ (v242 | 4) + 1) + (v243 & (v242 | 4) + 1) * 2;
    (&v16)[4] = (unsigned int)((v231 ^ v230) + (v231 & v230) * 2 - ((char)~v244 + (char)v244 * 2)) + ((char)~v244 + (char)v244 * 2 & -((v231 ^ v230) + (v231 & v230) * 2)) * 2 - 1;
    v14 = &v15;
    v15 = &v14;
    v245 = (unsigned int)(0x8000000 >> ((char)((char)v7 + (char)~v12 + ((char)v12 + 1 & (char)v7) * 2 + (v12 + 1 & ~v7) * 2 - 1) & 63)) & 0xff;
    v246 = v15;
    v247 = v14;
    v248 = v246 - v247 + (v247 & ~v246) * 2;
    v249 = ((v247 ^ -v246) + (v247 - v246 - (v247 | -v246)) * 2 | ((v247 | v246) & -v247) * 4 + ((v247 | v246) ^ -v247) * 2) + ((v247 ^ -v246) + (v247 - v246 - (v247 | -v246)) * 2 & ((v247 | v246) & -v247) * 4 + ((v247 | v246) ^ -v247) * 2);
    v250 = v248 - v249 + (v249 | ~v248) + (v248 & ~v249);
    v251 = (v250 * 2 & 4) + (v250 ^ 2);
    v252 = v251 - 1;
    v253 = -v251;
    v14 = (((v253 | 62576620) ^ v251) + ((v253 | 62576620) & v251) * 2 | (v253 | 62576620) + v251 + (v252 ^ 62576620)) + (((v253 | 62576620) ^ v251) + ((v253 | 62576620) & v251) * 2 & (v253 | 62576620) + v251 + (v252 ^ 62576620));
    v15 = (v252 ^ 217494340) + ((v253 | 217494340) + v251) * 2 - 1;
    v254 = v14;
    v255 = v254 + 1;
    v256 = v255 + ~v254 * 2 | (unsigned int)v15;
    v257 = (v256 ^ v255) + (v256 & v255) * 2 + (v254 | (unsigned int)v15 | ~((v256 ^ v255) + (v256 & v255) * 2)) + ((v256 ^ v255) + (v256 & v255) * 2 | v254 | (unsigned int)v15) + 1;
    v258 = (v245 + ~v245 * 2 ^ ~(v257 | v245 + ~v245 * 2 + 1)) + ((v257 | v245 + ~v245 * 2 + 1) & ~(v245 + ~v245 * 2)) * 2;
    v259 = v245 - v257 + (v257 & v245) + (v257 & ~v245) * 2 + 1;
    v260 = v15;
    v261 = v14;
    v262 = (v260 ^ -v261) + (v260 + ((char *)&g_fffffffffffffffc + 3 ^ v260 * 2) + v261 & -(v260 + ((char *)&g_fffffffffffffffc + 3 ^ v260 * 2) | v261)) * 4 + (v260 - v261 - (v260 | -v261) + (v260 + ((char *)&g_fffffffffffffffc + 3 ^ v260 * 2) + v261 ^ -(v260 + ((char *)&g_fffffffffffffffc + 3 ^ v260 * 2) | v261))) * 2;
    v263 = (v261 ^ 1) + ~v261 * 2 + ((v261 * 2 | v261 >> 63) & 2 & 3);
    v264 = (v261 ^ -v260) + (v261 - v260 - (v261 | -v260) + v263 + (v263 + ~v263 * 2 + 1 | v260)) * 2;
    v265 = v264 + 2 + ~v262 + (v262 | (char *)&g_fffffffffffffffc - v264 + 2) * 2 + (v264 + 2 + ~(v264 + 2) * 2 + (0x7ffffffffffffffd - (v264 + 2 + ~(v264 + 2) * 2) | v262)) * 2;
    v266 = v265 + 4;
    v267 = v265 + 7;
    v268 = 0xfffffffffffffff8 - v265;
    v269 = (v266 + 32777495 ^ -(v267 | 32777492)) + (v266 + 32777495 & -(v267 | 32777492)) * 2;
    v14 = v267 + v266 + v268 * 2 + 4 + (&(&g_6e5c88)[v266] ^ 0xffffffffff91a377 - v266 - (v268 | 0xffffffffff91a37a)) - (v266 + v268 * 2 + 4 & 0xffffffffff91a37a) + (&(&g_6e5c88)[v266] & 0xffffffffff91a377 - v266 - (v268 | 0xffffffffff91a37a)) * 2;
    v15 = v269 + (v266 + 32777496 + (v268 | 0xfffffffffe0bdaeb) | ~v269) + (v269 | v266 + 32777496 + (v268 | 0xfffffffffe0bdaeb)) + 1;
    v270 = (unsigned int)v14 + (v15 ^ 0xfffffffe) - ~v15 * 2 - (__ROL__(v15, 1) & 2 & 3);
    v271 = v270 + (5 | ~v270) + 1;
    v272 = (v271 ^ (v270 | 5) + 1) + (v271 & (v270 | 5) + 1) * 2;
    (&v16)[5] = (unsigned int)((v259 ^ v258) + (v259 & v258) * 2 - ((char)~v272 + (char)v272 * 2)) + ((char)~v272 + (char)v272 * 2 & -((v259 ^ v258) + (v259 & v258) * 2)) * 2 - 1;
    v14 = &v15;
    v15 = &v14;
    v273 = (unsigned int)v0 & 0xff;
    v274 = v15;
    v275 = v14;
    v276 = v274 - v275 + (v275 & ~v274) * 2;
    v277 = ((v275 ^ -v274) + (v275 - v274 - (v275 | -v274)) * 2 | ((v275 | v274) & -v275) * 4 + ((v275 | v274) ^ -v275) * 2) + ((v275 ^ -v274) + (v275 - v274 - (v275 | -v274)) * 2 & ((v275 | v274) & -v275) * 4 + ((v275 | v274) ^ -v275) * 2);
    v278 = v276 - v277 + (v277 | ~v276) + (v276 & ~v277);
    v279 = (v278 * 2 & 4) + (v278 ^ 2);
    v280 = v279 - 1;
    v281 = -v279;
    v14 = (((v281 | 62576620) ^ v279) + ((v281 | 62576620) & v279) * 2 | (v281 | 62576620) + v279 + (v280 ^ 62576620)) + (((v281 | 62576620) ^ v279) + ((v281 | 62576620) & v279) * 2 & (v281 | 62576620) + v279 + (v280 ^ 62576620));
    v15 = (v280 ^ 217494340) + ((v281 | 217494340) + v279) * 2 - 1;
    v282 = v14;
    v283 = v282 + 1;
    v284 = v283 + ~v282 * 2 | (unsigned int)v15;
    v285 = (v284 ^ v283) + (v284 & v283) * 2 + (v282 | (unsigned int)v15 | ~((v284 ^ v283) + (v284 & v283) * 2)) + ((v284 ^ v283) + (v284 & v283) * 2 | v282 | (unsigned int)v15) + 1;
    v286 = (v273 + ~v273 * 2 ^ ~(v285 | v273 + ~v273 * 2 + 1)) + ((v285 | v273 + ~v273 * 2 + 1) & ~(v273 + ~v273 * 2)) * 2;
    v287 = v273 - v285 + (v285 & v273) + (v285 & ~v273) * 2 + 1;
    v288 = v15;
    v289 = v14;
    v290 = (v288 ^ -v289) + (v288 + ((char *)&g_fffffffffffffffc + 3 ^ v288 * 2) + v289 & -(v288 + ((char *)&g_fffffffffffffffc + 3 ^ v288 * 2) | v289)) * 4 + (v288 - v289 - (v288 | -v289) + (v288 + ((char *)&g_fffffffffffffffc + 3 ^ v288 * 2) + v289 ^ -(v288 + ((char *)&g_fffffffffffffffc + 3 ^ v288 * 2) | v289))) * 2;
    v291 = (v289 ^ 1) + ~v289 * 2 + ((v289 * 2 | v289 >> 63) & 2 & 3);
    v292 = (v289 ^ -v288) + (v289 - v288 - (v289 | -v288) + v291 + (v291 + ~v291 * 2 + 1 | v288)) * 2;
    v293 = v292 + 2 + ~v290 + (v290 | (char *)&g_fffffffffffffffc - v292 + 2) * 2 + (v292 + 2 + ~(v292 + 2) * 2 + (0x7ffffffffffffffd - (v292 + 2 + ~(v292 + 2) * 2) | v290)) * 2;
    v294 = v293 + 4;
    v295 = v293 + 7;
    v296 = 0xfffffffffffffff8 - v293;
    v297 = (v294 + 32777495 ^ -(v295 | 32777492)) + (v294 + 32777495 & -(v295 | 32777492)) * 2;
    v14 = v295 + v294 + v296 * 2 + 4 + (&(&g_6e5c88)[v294] ^ 0xffffffffff91a377 - v294 - (v296 | 0xffffffffff91a37a)) - (v294 + v296 * 2 + 4 & 0xffffffffff91a37a) + (&(&g_6e5c88)[v294] & 0xffffffffff91a377 - v294 - (v296 | 0xffffffffff91a37a)) * 2;
    v15 = v297 + (v294 + 32777496 + (v296 | 0xfffffffffe0bdaeb) | ~v297) + (v297 | v294 + 32777496 + (v296 | 0xfffffffffe0bdaeb)) + 1;
    v298 = (unsigned int)v14 + (v15 ^ 0xfffffffe) - ~v15 * 2 - (__ROL__(v15, 1) & 2 & 3);
    v299 = v298 + (~v298 | 6) + 1;
    v300 = (v299 ^ (v298 | 6) + 1) + (v299 & (v298 | 6) + 1) * 2;
    (&v16)[6] = (unsigned int)((v287 ^ v286) + (v287 & v286) * 2 - ((char)~v300 + (char)v300 * 2)) + ((char)~v300 + (char)v300 * 2 & -((v287 ^ v286) + (v287 & v286) * 2)) * 2 - 1;
    v14 = &v15;
    v15 = &v14;
    v301 = v15;
    v302 = v14;
    v303 = v301 - v302 + (v302 & ~v301) * 2;
    v304 = ((v302 ^ -v301) + (v302 - v301 - (v302 | -v301)) * 2 | ((v302 | v301) & -v302) * 4 + ((v302 | v301) ^ -v302) * 2) + ((v302 ^ -v301) + (v302 - v301 - (v302 | -v301)) * 2 & ((v302 | v301) & -v302) * 4 + ((v302 | v301) ^ -v302) * 2);
    v305 = v303 - v304 + (v304 | ~v303) + (v303 & ~v304);
    v306 = (v305 * 2 & 4) + (v305 ^ 2);
    v307 = -v306;
    v308 = v306 - 1;
    v309 = (unsigned int)(0x8000000 >> ((char)~v109 + (char)v109 * 2 & 63)) & 0xff;
    v14 = (((v307 | 62576620) ^ v306) + ((v307 | 62576620) & v306) * 2 | (v307 | 62576620) + v306 + (v308 ^ 62576620)) + (((v307 | 62576620) ^ v306) + ((v307 | 62576620) & v306) * 2 & (v307 | 62576620) + v306 + (v308 ^ 62576620));
    v15 = (v308 ^ 217494340) + ((v307 | 217494340) + v306) * 2 - 1;
    v310 = v14;
    v311 = v310 + 1;
    v312 = v311 + ~v310 * 2 | (unsigned int)v15;
    v313 = (v312 ^ v311) + (v312 & v311) * 2 + (v310 | (unsigned int)v15 | ~((v312 ^ v311) + (v312 & v311) * 2)) + ((v312 ^ v311) + (v312 & v311) * 2 | v310 | (unsigned int)v15) + 1;
    v314 = (v309 + ~v309 * 2 ^ ~(v313 | v309 + ~v309 * 2 + 1)) + ((v313 | v309 + ~v309 * 2 + 1) & ~(v309 + ~v309 * 2)) * 2;
    v315 = v309 - v313 + (v313 & v309) + (v313 & ~v309) * 2 + 1;
    v316 = v15;
    v317 = v14;
    v318 = (v316 ^ -v317) + (v316 + ((char *)&g_fffffffffffffffc + 3 ^ v316 * 2) + v317 & -(v316 + ((char *)&g_fffffffffffffffc + 3 ^ v316 * 2) | v317)) * 4 + (v316 - v317 - (v316 | -v317) + (v316 + ((char *)&g_fffffffffffffffc + 3 ^ v316 * 2) + v317 ^ -(v316 + ((char *)&g_fffffffffffffffc + 3 ^ v316 * 2) | v317))) * 2;
    v319 = (v317 ^ 1) + ~v317 * 2 + ((v317 * 2 | v317 >> 63) & 2 & 3);
    v320 = (v317 ^ -v316) + (v317 - v316 - (v317 | -v316) + v319 + (v319 + ~v319 * 2 + 1 | v316)) * 2;
    v321 = v320 + 2 + ~v318 + (v318 | (char *)&g_fffffffffffffffc - v320 + 2) * 2 + (v320 + 2 + ~(v320 + 2) * 2 + (0x7ffffffffffffffd - (v320 + 2 + ~(v320 + 2) * 2) | v318)) * 2;
    v322 = v321 + 4;
    v323 = v321 + 7;
    v324 = 0xfffffffffffffff8 - v321;
    v325 = (v322 + 32777495 ^ -(v323 | 32777492)) + (v322 + 32777495 & -(v323 | 32777492)) * 2;
    v14 = v323 + v322 + v324 * 2 + 4 + (&(&g_6e5c88)[v322] ^ 0xffffffffff91a377 - v322 - (v324 | 0xffffffffff91a37a)) - (v322 + v324 * 2 + 4 & 0xffffffffff91a37a) + (&(&g_6e5c88)[v322] & 0xffffffffff91a377 - v322 - (v324 | 0xffffffffff91a37a)) * 2;
    v15 = v325 + (v322 + 32777496 + (v324 | 0xfffffffffe0bdaeb) | ~v325) + (v325 | v322 + 32777496 + (v324 | 0xfffffffffe0bdaeb)) + 1;
    v326 = (unsigned int)v14 + (v15 ^ 0xfffffffe) - ~v15 * 2 - (__ROL__(v15, 1) & 2 & 3);
    v327 = v326 + (~v326 | 7) + 1;
    v328 = (v327 ^ (v326 | 7) + 1) + (v327 & (v326 | 7) + 1) * 2;
    *((char *)&v16 + 7) = (unsigned int)((v315 ^ v314) + (v315 & v314) * 2 - ((char)~v328 + (char)v328 * 2)) + ((char)~v328 + (char)v328 * 2 & -((v315 ^ v314) + (v315 & v314) * 2)) * 2 - 1;
    v19 = 0;
    v17 = 0;
    v18 = 0;
    v4 = &v3;
    v3 = &v4;
    v329 = v4;
    v330 = v3;
    v331 = &v329[1 + (v329 + 0x2 * ~v329 + 1 & v330) + 2 * ((v329 + 0x2 * ~v329 + 1 | v330) & v329 + 1) + ((v329 + 0x2 * ~v329 + 1 | v330) ^ v329 + 1) + 2 * ~(((v329 + 0x2 * ~v329 + 1 | v330) ^ v329 + 1) + ((v329 + 0x2 * ~v329 + 1 | v330) & v329 + 1) * 2)];
    v332 = v331 + 1;
    v333 = v332 | v329;
    v334 = ((char *)&g_fffffffffffffffc - v331 + 2 | v329) + v332;
    v335 = (v333 & ~v334) * 2;
    v336 = v335 + (v334 ^ ~v333);
    v337 = (v332 & v330 + 0x2 * ~v330 + 1) - v331 + (v332 | v330);
    v338 = v337 - 1;
    v339 = v336 - v337 + (v336 & v338) + ((v334 ^ v333) - v335 & v338) * 2 + 1;
    v340 = v336 | v338;
    v341 = (v336 + v338 ^ -v340) + (v336 + v338 & -v340) * 2;
    v342 = v339 + v341 + (-v341 & ~v339) * 2 + (v339 + (-v341 | ~v339)) * 2 + 2;
    v343 = ((v336 | -v337) ^ v338 - v337 * 2) - ((v336 | -v337) & v337) * 2 + v340;
    v344 = ((v342 & v343) - v342 + (v342 | ~v343) ^ ~((v343 + ~(v342 | v343)) * 2)) + ((v342 & v343) - v342 + (v342 | ~v343) & ~((v343 + ~(v342 | v343)) * 2)) * 2;
    v9 = ~v344 + v344 * 2;
    while (1)
    {
        v345 = v4;
        v346 = v3;
        v347 = (v345 ^ 1) + v345 * 2 + ~v345 * 4 + (v345 * 2 & 2);
        v348 = &v346[~(v347 + 2 | v346)];
        v349 = (v345 ^ -v346) + &v345[-v346 | ~v345] * 2;
        v350 = (v348 & v347 + 3) * 4 + (v348 ^ v347 + 3) * 2 + v349 * 2 + ((v348 & v347 + 3) * 4 + (v348 ^ v347 + 3) * 2 | ~(v349 + 2)) + (~((v348 & v347 + 3) * 4 + (v348 ^ v347 + 3) * 2) | ~(v349 + 2)) + 6;
        v351 = &(~&v346[v346 + 0x2 * ~v346 + 1 | v345])[v346 | v345];
        v352 = v351 - v350;
        v353 = (v352 | 1) + v350;
        v354 = (v352 & (char *)&g_fffffffffffffffc + 2) + v351;
        v355 = v353 + ~v354;
        v356 = (v354 - (v353 + (v354 - v353) * 2) ^ (v354 - v353 | 24)) + (v355 & 24) - ((v355 | 1) + (v355 & 1) + 24) + ((v355 | 1) + (v355 & 1) + 24 - (v355 & 24) + (v354 - (v353 + (v354 - v353) * 2) & (v354 - v353 | 24))) * 2;
        v3 = v355 + 7;
        v4 = ~v356 + v356 * 2;
        v357 = v3;
        if ((v4 & v357) + (v357 + v4 + v4 + 0x2 * ~v4 + (v357 + 0x2 * ~v357 + 1 & ~(v4 + 0x2 * ~v4 + 1)) + 2 | ~(v4 & v357)) + (v357 + v4 + v4 + 0x2 * ~v4 + (v357 + 0x2 * ~v357 + 1 & ~(v4 + 0x2 * ~v4 + 1)) + 2 | v4 & v357) + 1 <= v9)
            break;
        v359 = *((char *)&v16 + v9);
        v360 = v9;
        v14 = &v15;
        v15 = &v14;
        v361 = v15;
        v362 = v14;
        v363 = (v361 ^ -v362) + ((v362 | v361) ^ -v361) * 2 + ((v362 | v361) & -v361) * 4 + (v361 - v362 - (v361 | -v362)) * 2 + 1;
        v364 = (v362 ^ v361) + (v362 ^ ~v361) * 4 + ~v363 + (v363 + (v362 ^ v361)) * 2;
        v365 = 0xfffffffffffffffb - v364;
        v366 = v364 + 5;
        v367 = ((v366 + v365 * 2 | 24759528) ^ v366) + ((v366 + v365 * 2 | 24759528) & v366) * 2;
        v14 = (v364 + 4 ^ 15250610) + (30501220 & (v364 + 4) * 2) - 1;
        v15 = (v365 | 0xfffffffffe863317) + v366 + 24759528 + v367 + ((v365 | 0xfffffffffe863317) + v366 + 24759528 | ~v367) + (v367 & 0xfffffffffe863317 - ((v365 | 0xfffffffffe863317) + v366)) + 1;
        v368 = (unsigned int)v14 + ((unsigned int)v15 ^ 0xfffffffe) - ~(unsigned int)v15 * 2 - (__ROL__((unsigned int)v15, 1) & 2 & 3);
        v369 = (v360 + ~v360 * 2 ^ ~(v368 | v360 + ~v360 * 2 + 1)) + ((v368 | v360 + ~v360 * 2 + 1) & ~(v360 + ~v360 * 2)) * 2;
        v370 = (v369 ^ (v368 | v360) + 1) + (v369 & (v368 | v360) + 1) * 2;
        v371 = v370 - 1;
        v372 = ~v359 * 2;
        v373 = v372 + (v359 ^ 1) + (__ROL__(v359, 1) & 2 & 3);
        v374 = (unsigned int)(~v373 - (v359 + v372 + 1) + v371 - (v371 & v359 + v372 + 1)) * 2 + (v373 - (v371 & ~(v359 + v372 + 1))) * 4 | 1;
        v375 = v370 + v359 + (v374 | ~(v371 + v359)) + (v374 | v371 + v359);
        v376 = v15;
        v377 = v14;
        v378 = (v377 & v376) + v376 + (v376 & ~v377);
        v379 = v378 + ((v377 & ~v376) - (v377 + v376) - (-v376 & ~v377) + v377 - (v377 | v376) + v376 + (v377 | -v376) - v377) * 2;
        v380 = (-v379 | 1) + (v378 | (char *)&g_fffffffffffffffc + 2) + v379 * 2;
        v381 = v380 + 1;
        v382 = v380 + 2;
        v383 = 171279118 + v381 + v382 + ~v381 * 2 + (0xfffffffff5ca7cf1 | ~(v382 + ~v381 * 2)) + 2;
        v384 = v382 + 0xfffffffff5ca7cf1 + (171279118 | ~v381) + v382 + ((0xffffffff ^ (unsigned int)v381 * 2) & 342558236);
        v14 = (v383 | v384) + (v383 & v384);
        v15 = ((v381 | 108791841) + 1 ^ v382 + 108791841 + (0xfffffffff983f7de & ~v381)) + ((v381 | 108791841) + 1 & v382 + 108791841 + (0xfffffffff983f7de & ~v381)) * 2 - 1;
        v385 = v15 + (unsigned int)v14;
        v386 = (v385 + ~v375 + (v375 + 1 | -v385) ^ (v375 + 1 | -v385)) + (v385 + ~v375 + (v375 + 1 | -v385) & (v375 + 1 | -v385)) * 2;
        v387 = ((unsigned int)(0xfffffffe - v375) & v385 - 1) - v385;
        v388 = (v387 & v375 + 2) * 4 + (v387 ^ v375 + 2) * 2;
        *((char *)&v16 + v9) = (char)v386 + (char)v388 + ((char)v386 & (char)~v388) + ((char)v388 | (char)~v386) + 1;
        v389 = v3;
        v390 = (unsigned int)v389 * 128 - (unsigned int)v389 * 2 & 0x66;
        v391 = &v389[-(v389 * 2) & 0xffffffffffffff98];
        v392 = ((1 | ((0x7fffffffffffff9a & (v389 | 0x33) * 2) + ((v389 | 0x33) ^ 0x7fffffffffffffcd)) * 2) ^ v391 + v390 + 0x33) + ((1 | ((0x7fffffffffffff9a & (v389 | 0x33) * 2) + ((v389 | 0x33) ^ 0x7fffffffffffffcd)) * 2) & v391 + v390 + 0x33) * 2;
        v393 = &v389[v392 + -1 * (v392 - 1 & v389) + ((v392 - 1 | v389) - 1 ^ v392 + v389 - 1) + -2 * (v392 + v389 - 1 & -(v392 - 1 | v389))];
        v394 = (v393 ^ 2) + v393 + (v393 | 1);
        v395 = v394 + ~v393 * 2 + (v393 * 2 & 4);
        v396 = (v395 ^ (char *)&g_fffffffffffffffc + 2) + v395 * 2 - ((v394 * 2 | v394 >> 63) & 2 & 3) + 3;
        v397 = (~v395 | 1) - v396 + (v396 & ~(~v395 | 1)) * 2 + ((~v395 | 1) + (v396 | ~(~v395 | 1))) * 2 + 2;
        v9 = v9 + (v397 ^ (char *)&g_fffffffffffffffc + 2) + v397 * 4 - (v397 * 2 + (v397 * 2 & 2)) + 2;
    }
    v398 = v16;
    v399 = v1->field_100;
    v400 = v399 + (v398 | ~v399) + (v399 | v398) + 1;
    v401 = (v400 ^ 2) + ~(v399 & v398) + (v400 * 2 & 4);
    v1->field_100 = ~v401 + v401 * 2;
    (g_e82498 - 0xed56400)();
}
