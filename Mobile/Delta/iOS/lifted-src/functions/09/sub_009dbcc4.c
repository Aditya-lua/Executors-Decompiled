/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dbcc4..0x9dc418 (1876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dbcc4_0 {
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
} st_9dbcc4_0;


st_9dbcc4_0 * sub_9dbcc4(st_9dbcc4_0 *a0, unsigned long long *a1, void* a2)
{
    unsigned long v0;  // x10
    unsigned long long v1;  // x13
    unsigned long long v10;  // x11
    unsigned long long v100;  // x8
    unsigned long long v101;  // 4155
    unsigned long long v102;  // x9
    unsigned long long v103;  // x12
    unsigned long long v104;  // x14
    unsigned long long v105;  // x11
    unsigned long long v106;  // x8
    unsigned long long v107;  // 4124
    unsigned long long v108;  // x11
    unsigned long long v109;  // x11
    unsigned long long v11;  // x14
    unsigned long long v110;  // 4115
    unsigned long v111;  // x12
    unsigned long long v112;  // 4126
    unsigned long v113;  // x9
    unsigned long long v114;  // x15
    unsigned long long v115;  // x10
    unsigned long long v116;  // x8
    unsigned long long v117;  // 4135
    unsigned long long v118;  // x10
    unsigned long long v119;  // x10
    unsigned long long v12;  // x8
    unsigned long long v120;  // 4115
    unsigned long long v121;  // x13
    unsigned long long v122;  // x12
    unsigned long long v123;  // x8
    unsigned long long v124;  // 4134
    unsigned long long v125;  // x12
    unsigned long long v126;  // x10
    unsigned long v127;  // 4122
    unsigned long long v128;  // x15
    unsigned long long v129;  // x11
    unsigned long long v13;  // x8
    unsigned long long v130;  // x8
    unsigned long long v131;  // 4151
    unsigned long long v132;  // x11
    unsigned long long v133;  // x10
    unsigned long long v134;  // 4115
    unsigned long long v135;  // x13
    unsigned long long v136;  // x12
    unsigned long long v137;  // 4134
    unsigned long long v138;  // x12
    unsigned long long v139;  // x10
    unsigned long long v14;  // 4140
    unsigned long v140;  // 4121
    unsigned long long v141;  // x9
    unsigned long long v142;  // x13
    unsigned long long v143;  // x8
    unsigned long long v144;  // x8
    unsigned long long v145;  // 4151
    unsigned long long v146;  // x10
    unsigned long long v147;  // x9
    unsigned long long v148;  // 4119
    unsigned long long v149;  // x14
    unsigned long long v15;  // x11
    unsigned long long v150;  // x11
    unsigned long long v151;  // x8
    unsigned long long v152;  // 4142
    unsigned long long v153;  // x11
    unsigned long long v154;  // x9
    unsigned long long v155;  // 4119
    unsigned long long v156;  // x15
    unsigned long long v157;  // x12
    unsigned long long v158;  // x8
    unsigned long long v159;  // 4142
    unsigned long v16;  // 4118
    unsigned long long v160;  // x12
    unsigned long long v161;  // x9
    unsigned long v162;  // 4118
    unsigned long long v163;  // x13
    unsigned long long v164;  // x11
    unsigned long long v165;  // x8
    unsigned long long v166;  // 4143
    unsigned long long v167;  // x11
    unsigned long long v168;  // x9
    unsigned long long v169;  // 4119
    unsigned long long v17;  // x9
    unsigned long long v170;  // x15
    unsigned long long v171;  // x12
    unsigned long long v172;  // x8
    unsigned long long v173;  // 4142
    unsigned long long v174;  // x12
    unsigned long long v175;  // x9
    unsigned long v176;  // 4118
    unsigned long long v177;  // x13
    unsigned long long v178;  // x11
    unsigned long long v179;  // x8
    unsigned long long v18;  // 4130
    unsigned long long v180;  // 4143
    unsigned long long v181;  // x11
    unsigned long long v182;  // x9
    unsigned long long v183;  // 4112
    unsigned long long v184;  // x14
    unsigned long long v185;  // x12
    unsigned long long v186;  // 4111
    unsigned long long v187;  // x12
    unsigned long long v188;  // x9
    unsigned long v189;  // 4123
    unsigned long long v19;  // x14
    unsigned long long v190;  // x10
    unsigned long long v191;  // x14
    unsigned long long v192;  // x8
    unsigned long long v193;  // x8
    unsigned long long v194;  // 4155
    unsigned long long v195;  // x9
    unsigned long long v196;  // x12
    unsigned long long v197;  // x14
    unsigned long long v198;  // x11
    unsigned long long v199;  // x8
    unsigned long long v2;  // x8
    unsigned long long v20;  // x11
    unsigned long long v200;  // 4124
    unsigned long long v201;  // x11
    unsigned long long v202;  // x11
    unsigned long long v203;  // 4115
    unsigned long v204;  // x12
    unsigned long long v205;  // 4126
    unsigned long v206;  // x9
    unsigned long long v207;  // x15
    unsigned long long v208;  // x10
    unsigned long long v209;  // x8
    unsigned long long v21;  // x8
    unsigned long long v210;  // 4135
    unsigned long long v211;  // x10
    unsigned long long v212;  // x10
    unsigned long long v213;  // 4115
    unsigned long long v214;  // x13
    unsigned long long v215;  // x12
    unsigned long long v216;  // x8
    unsigned long long v217;  // 4134
    unsigned long long v218;  // x12
    unsigned long long v219;  // x10
    unsigned long long v22;  // 4153
    unsigned long v220;  // 4122
    unsigned long long v221;  // x15
    unsigned long long v222;  // x11
    unsigned long long v223;  // x8
    unsigned long long v224;  // 4151
    unsigned long long v225;  // x11
    unsigned long long v226;  // x10
    unsigned long long v227;  // 4115
    unsigned long long v228;  // x13
    unsigned long long v229;  // x12
    unsigned long long v23;  // x11
    unsigned long long v230;  // x8
    unsigned long long v231;  // 4134
    unsigned long long v232;  // x12
    unsigned long long v233;  // x10
    unsigned long v234;  // 4122
    unsigned long long v235;  // x15
    unsigned long long v236;  // x11
    unsigned long long v237;  // x8
    unsigned long long v238;  // 4151
    unsigned long long v239;  // x11
    unsigned long long v24;  // x9
    unsigned long long v240;  // x10
    unsigned long long v241;  // 4115
    unsigned long long v242;  // x13
    unsigned long long v243;  // x12
    unsigned long long v244;  // 4134
    unsigned long long v245;  // x12
    unsigned long long v246;  // x10
    unsigned long v247;  // 4121
    unsigned long long v248;  // x9
    unsigned long long v249;  // x13
    unsigned long long v25;  // 4117
    unsigned long long v250;  // x8
    unsigned long long v251;  // x8
    unsigned long long v252;  // 4151
    unsigned long long v253;  // x10
    unsigned long long v254;  // x9
    unsigned long long v255;  // 4119
    unsigned long long v256;  // x14
    unsigned long long v257;  // x11
    unsigned long long v258;  // x8
    unsigned long long v259;  // 4142
    unsigned long long v26;  // x14
    unsigned long long v260;  // x11
    unsigned long long v261;  // x9
    unsigned long long v262;  // 4119
    unsigned long long v263;  // x15
    unsigned long long v264;  // x12
    unsigned long long v265;  // x8
    unsigned long long v266;  // 4142
    unsigned long long v267;  // x12
    unsigned long long v268;  // x9
    unsigned long v269;  // 4118
    unsigned long long v27;  // x12
    unsigned long long v270;  // x13
    unsigned long long v271;  // x11
    unsigned long long v272;  // x8
    unsigned long long v273;  // 4143
    unsigned long long v274;  // x11
    unsigned long long v275;  // x9
    unsigned long long v276;  // 4119
    unsigned long long v277;  // x15
    unsigned long long v278;  // x12
    unsigned long long v279;  // x8
    unsigned long long v28;  // 4138
    unsigned long long v280;  // 4142
    unsigned long long v281;  // x12
    unsigned long long v282;  // x9
    unsigned long v283;  // 4109
    unsigned long long v284;  // x13
    unsigned long long v285;  // x11
    unsigned long long v286;  // x8
    unsigned long long v287;  // 4127
    unsigned long long v288;  // x11
    unsigned long long v289;  // x9
    unsigned long long v29;  // x12
    unsigned long long v290;  // 4117
    unsigned long long v291;  // x14
    unsigned long long v292;  // x12
    unsigned long long v293;  // 4138
    unsigned long long v294;  // x12
    unsigned long long v295;  // x9
    unsigned long v296;  // 4123
    unsigned long long v297;  // x10
    unsigned long long v298;  // x14
    unsigned long long v299;  // x8
    unsigned long long v3;  // x8
    unsigned long long v30;  // x9
    unsigned long long v300;  // x8
    unsigned long long v301;  // 4155
    unsigned long long v302;  // x9
    unsigned long long v303;  // x12
    unsigned long long v304;  // x14
    unsigned long long v305;  // x11
    unsigned long long v306;  // x8
    unsigned long long v307;  // 4124
    unsigned long long v308;  // x11
    unsigned long long v309;  // x11
    unsigned long v31;  // 4123
    unsigned long long v310;  // 4115
    unsigned long v311;  // x12
    unsigned long long v312;  // 4126
    unsigned long v313;  // x9
    unsigned long long v314;  // x15
    unsigned long long v315;  // x10
    unsigned long long v316;  // x8
    unsigned long long v317;  // 4135
    unsigned long long v318;  // x10
    unsigned long long v319;  // x10
    unsigned long long v32;  // x10
    unsigned long long v320;  // 4115
    unsigned long long v321;  // x13
    unsigned long long v322;  // x12
    unsigned long long v323;  // x8
    unsigned long long v324;  // 4134
    unsigned long long v325;  // x12
    unsigned long long v326;  // x10
    unsigned long v327;  // 4122
    unsigned long long v328;  // x15
    unsigned long long v329;  // x11
    unsigned long long v33;  // x14
    unsigned long long v330;  // x8
    unsigned long long v331;  // 4151
    unsigned long long v332;  // x11
    unsigned long long v333;  // x10
    unsigned long long v334;  // 4115
    unsigned long long v335;  // x13
    unsigned long long v336;  // x12
    unsigned long long v337;  // 4134
    unsigned long long v338;  // x12
    unsigned long long v339;  // x10
    unsigned long long v34;  // x8
    unsigned long v340;  // 4121
    unsigned long long v341;  // x9
    unsigned long long v342;  // x13
    unsigned long long v343;  // x8
    unsigned long long v344;  // x8
    unsigned long long v345;  // 4151
    unsigned long long v346;  // x10
    unsigned long long v347;  // x9
    unsigned long long v348;  // 4119
    unsigned long long v349;  // x14
    unsigned long long v35;  // x8
    unsigned long long v350;  // x11
    unsigned long long v351;  // x8
    unsigned long long v352;  // 4142
    unsigned long long v353;  // x11
    unsigned long long v354;  // x9
    unsigned long long v355;  // 4119
    unsigned long long v356;  // x15
    unsigned long long v357;  // x12
    unsigned long long v358;  // x8
    unsigned long long v359;  // 4142
    unsigned long long v36;  // 4155
    unsigned long long v360;  // x12
    unsigned long long v361;  // x9
    unsigned long v362;  // 4118
    unsigned long long v363;  // x13
    unsigned long long v364;  // x11
    unsigned long long v365;  // x8
    unsigned long long v366;  // 4143
    unsigned long long v367;  // x11
    unsigned long long v368;  // x9
    unsigned long long v369;  // 4117
    unsigned long long v37;  // x9
    unsigned long long v370;  // x14
    unsigned long long v371;  // x12
    unsigned long long v372;  // 4138
    unsigned long long v373;  // x12
    unsigned long long v374;  // x9
    unsigned long v375;  // 4118
    unsigned long long v376;  // x10
    unsigned long long v377;  // x14
    unsigned long long v378;  // x8
    unsigned long long v379;  // x8
    unsigned long long v38;  // x12
    unsigned long long v380;  // 4115
    unsigned long long v381;  // x9
    unsigned long long v382;  // x12
    unsigned long long v383;  // x14
    unsigned long long v384;  // x11
    unsigned long long v385;  // x8
    unsigned long long v386;  // 4124
    unsigned long long v387;  // x11
    unsigned long long v388;  // x11
    unsigned long long v389;  // 4123
    unsigned long long v39;  // x14
    unsigned long v390;  // x12
    unsigned long long v391;  // x15
    unsigned long long v392;  // x9
    unsigned long long v393;  // 4150
    unsigned long long v394;  // x8
    unsigned long long v395;  // 4111
    unsigned long long v396;  // x9
    unsigned long long v397;  // x9
    unsigned long long v398;  // 4115
    unsigned long long v399;  // x13
    unsigned long long v4;  // 4155
    unsigned long long v40;  // x11
    unsigned long long v400;  // x10
    unsigned long long v401;  // 4134
    unsigned long long v402;  // x10
    unsigned long long v403;  // x9
    unsigned long v404;  // 4121
    unsigned long long v405;  // x10
    unsigned long long v406;  // x13
    unsigned long long v407;  // x8
    unsigned long long v408;  // x8
    unsigned long long v409;  // 4151
    unsigned long long v41;  // x8
    unsigned long long v410;  // x9
    unsigned long long v411;  // x9
    unsigned long long v412;  // 4119
    unsigned long long v413;  // x14
    unsigned long long v414;  // x11
    unsigned long long v415;  // x8
    unsigned long long v416;  // 4142
    unsigned long long v417;  // x11
    unsigned long long v418;  // x9
    unsigned long long v419;  // 4117
    unsigned long long v42;  // 4124
    unsigned long long v420;  // x14
    unsigned long long v421;  // x12
    unsigned long long v422;  // 4138
    unsigned long long v423;  // x12
    unsigned long long v424;  // x9
    unsigned long v425;  // 4123
    unsigned long long v426;  // x10
    unsigned long long v427;  // x14
    unsigned long long v428;  // x8
    unsigned long long v429;  // x8
    unsigned long long v43;  // x11
    unsigned long long v430;  // 4155
    unsigned long long v431;  // x9
    unsigned long long v432;  // x12
    unsigned long long v433;  // x11
    unsigned long long v434;  // 4119
    unsigned long long v435;  // x11
    unsigned long long v436;  // x9
    unsigned long long v437;  // x12
    unsigned long long v438;  // 4127
    unsigned long long v439;  // x9
    unsigned long long v44;  // x11
    unsigned long long v440;  // 4123
    unsigned long long v441;  // x8
    unsigned long v442;  // 4132
    unsigned long long v45;  // 4115
    unsigned long v46;  // x12
    unsigned long long v47;  // 4126
    unsigned long v48;  // x9
    unsigned long long v49;  // x15
    unsigned long long v5;  // x10
    unsigned long long v50;  // x10
    unsigned long long v51;  // x8
    unsigned long long v52;  // 4135
    unsigned long long v53;  // x10
    unsigned long long v54;  // x10
    unsigned long long v55;  // 4115
    unsigned long long v56;  // x13
    unsigned long long v57;  // x12
    unsigned long long v58;  // 4134
    unsigned long long v59;  // x12
    unsigned long long v6;  // x11
    unsigned long long v60;  // x10
    unsigned long v61;  // 4121
    unsigned long long v62;  // x9
    unsigned long long v63;  // x13
    unsigned long long v64;  // x8
    unsigned long long v65;  // x8
    unsigned long long v66;  // 4151
    unsigned long long v67;  // x10
    unsigned long long v68;  // x9
    unsigned long long v69;  // 4119
    unsigned long long v7;  // x9
    unsigned long long v70;  // x14
    unsigned long long v71;  // x11
    unsigned long long v72;  // x8
    unsigned long long v73;  // 4142
    unsigned long long v74;  // x11
    unsigned long long v75;  // x9
    unsigned long long v76;  // 4119
    unsigned long long v77;  // x15
    unsigned long long v78;  // x12
    unsigned long long v79;  // x8
    unsigned long long v8;  // 4119
    unsigned long long v80;  // 4142
    unsigned long long v81;  // x12
    unsigned long long v82;  // x9
    unsigned long v83;  // 4118
    unsigned long long v84;  // x13
    unsigned long long v85;  // x11
    unsigned long long v86;  // x8
    unsigned long long v87;  // 4143
    unsigned long long v88;  // x11
    unsigned long long v89;  // x9
    unsigned long long v9;  // x9
    unsigned long long v90;  // 4112
    unsigned long long v91;  // x14
    unsigned long long v92;  // x12
    unsigned long long v93;  // 4133
    unsigned long long v94;  // x12
    unsigned long long v95;  // x9
    unsigned long v96;  // 4123
    unsigned long long v97;  // x10
    unsigned long long v98;  // x14
    unsigned long long v99;  // x8

    v0 = *(long long *)a2 * *a1 >> 64;
    a0->field_0 = *a1 * *(long long *)a2;
    v1 = (long long)a2[8] * *a1 >> 64;
    v2 = *a1 * (long long)a2[8];
    v3 = v2 + v0;
    v4 = arm64g_calculate_condition(50, v2, v0, 0);
    if (v4 & 1)
        v5 = v1;
    else
        v5 = v1 + 1;
    v6 = *(long long *)a2 * a1[1] >> 64;
    v7 = a1[1] * *(long long *)a2;
    v8 = arm64g_calculate_condition(50, v3, v7, 0);
    if (v8 & 1)
        v9 = v6;
    else
        v9 = v6 + 1;
    v10 = v5 + v9;
    a0->field_8 = v3 + v7;
    v11 = *(long long *)a2 * a1[2] >> 64;
    v12 = a1[2] * *(long long *)a2;
    v13 = v10 + v12;
    v14 = arm64g_calculate_condition(50, v10, v12, 0);
    if (v14 & 1)
        v15 = v11;
    else
        v15 = v11 + 1;
    v16 = arm64g_calculate_flag_c(2, v5, v9, 0);
    v17 = v15 + v16;
    v18 = arm64g_calculate_condition(54, v15, 0, v16);
    v19 = (long long)a2[8] * a1[1] >> 64;
    v20 = a1[1] * (long long)a2[8];
    v21 = v13 + v20;
    v22 = arm64g_calculate_condition(50, v13, v20, 0);
    if (v22 & 1)
        v23 = v19;
    else
        v23 = v19 + 1;
    v24 = v17 + v23;
    v25 = arm64g_calculate_condition(50, v17, v23, 0);
    v26 = (long long)a2[16] * *a1 >> 64;
    v27 = *a1 * (long long)a2[16];
    v28 = arm64g_calculate_condition(50, v21, v27, 0);
    if (v28 & 1)
        v29 = v26;
    else
        v29 = v26 + 1;
    v30 = v24 + v29;
    v31 = arm64g_calculate_flag_c(2, v24, v29, 0);
    v32 = !(v25 & 1) + !(v18 & 1) + v31;
    a0->field_10 = v21 + v27;
    v33 = (long long)a2[24] * *a1 >> 64;
    v34 = *a1 * (long long)a2[24];
    v35 = v30 + v34;
    v36 = arm64g_calculate_condition(50, v30, v34, 0);
    if (v36 & 1)
        v37 = v33;
    else
        v37 = v33 + 1;
    v38 = v32 + v37;
    v39 = (long long)a2[16] * a1[1] >> 64;
    v40 = a1[1] * (long long)a2[16];
    v41 = v35 + v40;
    v42 = arm64g_calculate_condition(50, v35, v40, 0);
    if (v42 & 1)
        v43 = v39;
    else
        v43 = v39 + 1;
    v44 = v38 + v43;
    v45 = arm64g_calculate_condition(50, v38, v43, 0);
    v46 = !(v45 & 1);
    v47 = arm64g_calculate_condition(50, v32, v37, 0);
    if (v47 & 1)
        v48 = v46;
    else
        v48 = v46 + 1;
    v49 = (long long)a2[8] * a1[2] >> 64;
    v50 = a1[2] * (long long)a2[8];
    v51 = v41 + v50;
    v52 = arm64g_calculate_condition(50, v41, v50, 0);
    if (v52 & 1)
        v53 = v49;
    else
        v53 = v49 + 1;
    v54 = v44 + v53;
    v55 = arm64g_calculate_condition(50, v44, v53, 0);
    v56 = *(long long *)a2 * a1[3] >> 64;
    v57 = a1[3] * *(long long *)a2;
    v58 = arm64g_calculate_condition(50, v51, v57, 0);
    if (v58 & 1)
        v59 = v56;
    else
        v59 = v56 + 1;
    v60 = v59 + v54;
    v61 = arm64g_calculate_flag_c(2, v59, v54, 0);
    v62 = v48 + !(v55 & 1) + v61;
    a0->field_18 = v51 + v57;
    v63 = *(long long *)a2 * a1[4] >> 64;
    v64 = a1[4] * *(long long *)a2;
    v65 = v60 + v64;
    v66 = arm64g_calculate_condition(50, v60, v64, 0);
    if (v66 & 1)
        v67 = v63;
    else
        v67 = v63 + 1;
    v68 = v62 + v67;
    v69 = arm64g_calculate_condition(50, v62, v67, 0);
    v70 = (long long)a2[8] * a1[3] >> 64;
    v71 = a1[3] * (long long)a2[8];
    v72 = v65 + v71;
    v73 = arm64g_calculate_condition(50, v65, v71, 0);
    if (v73 & 1)
        v74 = v70;
    else
        v74 = v70 + 1;
    v75 = v68 + v74;
    v76 = arm64g_calculate_condition(50, v68, v74, 0);
    v77 = (long long)a2[16] * a1[2] >> 64;
    v78 = a1[2] * (long long)a2[16];
    v79 = v72 + v78;
    v80 = arm64g_calculate_condition(50, v72, v78, 0);
    if (v80 & 1)
        v81 = v77;
    else
        v81 = v77 + 1;
    v82 = v75 + v81;
    v83 = arm64g_calculate_flag_c(2, v75, v81, 0);
    v84 = (long long)a2[24] * a1[1] >> 64;
    v85 = a1[1] * (long long)a2[24];
    v86 = v79 + v85;
    v87 = arm64g_calculate_condition(50, v79, v85, 0);
    if (v87 & 1)
        v88 = v84;
    else
        v88 = v84 + 1;
    v89 = v88 + v82;
    v90 = arm64g_calculate_condition(50, v88, v82, 0);
    v91 = (long long)a2[32] * *a1 >> 64;
    v92 = *a1 * (long long)a2[32];
    v93 = arm64g_calculate_condition(50, v86, v92, 0);
    if (v93 & 1)
        v94 = v91;
    else
        v94 = v91 + 1;
    v95 = v94 + v89;
    v96 = arm64g_calculate_flag_c(2, v94, v89, 0);
    v97 = !(v76 & 1) + !(v69 & 1) + v83 + !(v90 & 1) + v96;
    a0->field_20 = v86 + v92;
    v98 = (long long)a2[40] * *a1 >> 64;
    v99 = *a1 * (long long)a2[40];
    v100 = v95 + v99;
    v101 = arm64g_calculate_condition(50, v95, v99, 0);
    if (v101 & 1)
        v102 = v98;
    else
        v102 = v98 + 1;
    v103 = v97 + v102;
    v104 = (long long)a2[32] * a1[1] >> 64;
    v105 = a1[1] * (long long)a2[32];
    v106 = v100 + v105;
    v107 = arm64g_calculate_condition(50, v100, v105, 0);
    if (v107 & 1)
        v108 = v104;
    else
        v108 = v104 + 1;
    v109 = v103 + v108;
    v110 = arm64g_calculate_condition(50, v103, v108, 0);
    v111 = !(v110 & 1);
    v112 = arm64g_calculate_condition(50, v97, v102, 0);
    if (v112 & 1)
        v113 = v111;
    else
        v113 = v111 + 1;
    v114 = (long long)a2[24] * a1[2] >> 64;
    v115 = a1[2] * (long long)a2[24];
    v116 = v106 + v115;
    v117 = arm64g_calculate_condition(50, v106, v115, 0);
    if (v117 & 1)
        v118 = v114;
    else
        v118 = v114 + 1;
    v119 = v109 + v118;
    v120 = arm64g_calculate_condition(50, v109, v118, 0);
    v121 = (long long)a2[16] * a1[3] >> 64;
    v122 = a1[3] * (long long)a2[16];
    v123 = v116 + v122;
    v124 = arm64g_calculate_condition(50, v116, v122, 0);
    if (v124 & 1)
        v125 = v121;
    else
        v125 = v121 + 1;
    v126 = v125 + v119;
    v127 = arm64g_calculate_flag_c(2, v125, v119, 0);
    v128 = (long long)a2[8] * a1[4] >> 64;
    v129 = a1[4] * (long long)a2[8];
    v130 = v123 + v129;
    v131 = arm64g_calculate_condition(50, v123, v129, 0);
    if (v131 & 1)
        v132 = v128;
    else
        v132 = v128 + 1;
    v133 = v132 + v126;
    v134 = arm64g_calculate_condition(50, v132, v126, 0);
    v135 = *(long long *)a2 * a1[5] >> 64;
    v136 = a1[5] * *(long long *)a2;
    v137 = arm64g_calculate_condition(50, v130, v136, 0);
    if (v137 & 1)
        v138 = v135;
    else
        v138 = v135 + 1;
    v139 = v138 + v133;
    v140 = arm64g_calculate_flag_c(2, v138, v133, 0);
    v141 = v113 + !(v120 & 1) + v127 + !(v134 & 1) + v140;
    a0->field_28 = v130 + v136;
    v142 = *(long long *)a2 * a1[6] >> 64;
    v143 = a1[6] * *(long long *)a2;
    v144 = v139 + v143;
    v145 = arm64g_calculate_condition(50, v139, v143, 0);
    if (v145 & 1)
        v146 = v142;
    else
        v146 = v142 + 1;
    v147 = v141 + v146;
    v148 = arm64g_calculate_condition(50, v141, v146, 0);
    v149 = (long long)a2[8] * a1[5] >> 64;
    v150 = a1[5] * (long long)a2[8];
    v151 = v144 + v150;
    v152 = arm64g_calculate_condition(50, v144, v150, 0);
    if (v152 & 1)
        v153 = v149;
    else
        v153 = v149 + 1;
    v154 = v147 + v153;
    v155 = arm64g_calculate_condition(50, v147, v153, 0);
    v156 = (long long)a2[16] * a1[4] >> 64;
    v157 = a1[4] * (long long)a2[16];
    v158 = v151 + v157;
    v159 = arm64g_calculate_condition(50, v151, v157, 0);
    if (v159 & 1)
        v160 = v156;
    else
        v160 = v156 + 1;
    v161 = v154 + v160;
    v162 = arm64g_calculate_flag_c(2, v154, v160, 0);
    v163 = (long long)a2[24] * a1[3] >> 64;
    v164 = a1[3] * (long long)a2[24];
    v165 = v158 + v164;
    v166 = arm64g_calculate_condition(50, v158, v164, 0);
    if (v166 & 1)
        v167 = v163;
    else
        v167 = v163 + 1;
    v168 = v167 + v161;
    v169 = arm64g_calculate_condition(50, v167, v161, 0);
    v170 = (long long)a2[32] * a1[2] >> 64;
    v171 = a1[2] * (long long)a2[32];
    v172 = v165 + v171;
    v173 = arm64g_calculate_condition(50, v165, v171, 0);
    if (v173 & 1)
        v174 = v170;
    else
        v174 = v170 + 1;
    v175 = v174 + v168;
    v176 = arm64g_calculate_flag_c(2, v174, v168, 0);
    v177 = (long long)a2[40] * a1[1] >> 64;
    v178 = a1[1] * (long long)a2[40];
    v179 = v172 + v178;
    v180 = arm64g_calculate_condition(50, v172, v178, 0);
    if (v180 & 1)
        v181 = v177;
    else
        v181 = v177 + 1;
    v182 = v181 + v175;
    v183 = arm64g_calculate_condition(50, v181, v175, 0);
    v184 = (long long)a2[48] * *a1 >> 64;
    v185 = *a1 * (long long)a2[48];
    v186 = arm64g_calculate_condition(50, v179, v185, 0);
    if (v186 & 1)
        v187 = v184;
    else
        v187 = v184 + 1;
    v188 = v187 + v182;
    v189 = arm64g_calculate_flag_c(2, v187, v182, 0);
    v190 = !(v155 & 1) + !(v148 & 1) + v162 + !(v169 & 1) + v176 + !(v183 & 1) + v189;
    a0->field_30 = v179 + v185;
    v191 = (long long)a2[56] * *a1 >> 64;
    v192 = *a1 * (long long)a2[56];
    v193 = v188 + v192;
    v194 = arm64g_calculate_condition(50, v188, v192, 0);
    if (v194 & 1)
        v195 = v191;
    else
        v195 = v191 + 1;
    v196 = v190 + v195;
    v197 = (long long)a2[48] * a1[1] >> 64;
    v198 = a1[1] * (long long)a2[48];
    v199 = v193 + v198;
    v200 = arm64g_calculate_condition(50, v193, v198, 0);
    if (v200 & 1)
        v201 = v197;
    else
        v201 = v197 + 1;
    v202 = v196 + v201;
    v203 = arm64g_calculate_condition(50, v196, v201, 0);
    v204 = !(v203 & 1);
    v205 = arm64g_calculate_condition(50, v190, v195, 0);
    if (v205 & 1)
        v206 = v204;
    else
        v206 = v204 + 1;
    v207 = (long long)a2[40] * a1[2] >> 64;
    v208 = a1[2] * (long long)a2[40];
    v209 = v199 + v208;
    v210 = arm64g_calculate_condition(50, v199, v208, 0);
    if (v210 & 1)
        v211 = v207;
    else
        v211 = v207 + 1;
    v212 = v202 + v211;
    v213 = arm64g_calculate_condition(50, v202, v211, 0);
    v214 = (long long)a2[32] * a1[3] >> 64;
    v215 = a1[3] * (long long)a2[32];
    v216 = v209 + v215;
    v217 = arm64g_calculate_condition(50, v209, v215, 0);
    if (v217 & 1)
        v218 = v214;
    else
        v218 = v214 + 1;
    v219 = v218 + v212;
    v220 = arm64g_calculate_flag_c(2, v218, v212, 0);
    v221 = (long long)a2[24] * a1[4] >> 64;
    v222 = a1[4] * (long long)a2[24];
    v223 = v216 + v222;
    v224 = arm64g_calculate_condition(50, v216, v222, 0);
    if (v224 & 1)
        v225 = v221;
    else
        v225 = v221 + 1;
    v226 = v225 + v219;
    v227 = arm64g_calculate_condition(50, v225, v219, 0);
    v228 = (long long)a2[16] * a1[5] >> 64;
    v229 = a1[5] * (long long)a2[16];
    v230 = v223 + v229;
    v231 = arm64g_calculate_condition(50, v223, v229, 0);
    if (v231 & 1)
        v232 = v228;
    else
        v232 = v228 + 1;
    v233 = v232 + v226;
    v234 = arm64g_calculate_flag_c(2, v232, v226, 0);
    v235 = (long long)a2[8] * a1[6] >> 64;
    v236 = a1[6] * (long long)a2[8];
    v237 = v230 + v236;
    v238 = arm64g_calculate_condition(50, v230, v236, 0);
    if (v238 & 1)
        v239 = v235;
    else
        v239 = v235 + 1;
    v240 = v239 + v233;
    v241 = arm64g_calculate_condition(50, v239, v233, 0);
    v242 = *(long long *)a2 * a1[7] >> 64;
    v243 = a1[7] * *(long long *)a2;
    v244 = arm64g_calculate_condition(50, v237, v243, 0);
    if (v244 & 1)
        v245 = v242;
    else
        v245 = v242 + 1;
    v246 = v245 + v240;
    v247 = arm64g_calculate_flag_c(2, v245, v240, 0);
    v248 = v206 + !(v213 & 1) + v220 + !(v227 & 1) + v234 + !(v241 & 1) + v247;
    a0->field_38 = v237 + v243;
    v249 = (long long)a2[8] * a1[7] >> 64;
    v250 = a1[7] * (long long)a2[8];
    v251 = v246 + v250;
    v252 = arm64g_calculate_condition(50, v246, v250, 0);
    if (v252 & 1)
        v253 = v249;
    else
        v253 = v249 + 1;
    v254 = v248 + v253;
    v255 = arm64g_calculate_condition(50, v248, v253, 0);
    v256 = (long long)a2[16] * a1[6] >> 64;
    v257 = a1[6] * (long long)a2[16];
    v258 = v251 + v257;
    v259 = arm64g_calculate_condition(50, v251, v257, 0);
    if (v259 & 1)
        v260 = v256;
    else
        v260 = v256 + 1;
    v261 = v254 + v260;
    v262 = arm64g_calculate_condition(50, v254, v260, 0);
    v263 = (long long)a2[24] * a1[5] >> 64;
    v264 = a1[5] * (long long)a2[24];
    v265 = v258 + v264;
    v266 = arm64g_calculate_condition(50, v258, v264, 0);
    if (v266 & 1)
        v267 = v263;
    else
        v267 = v263 + 1;
    v268 = v261 + v267;
    v269 = arm64g_calculate_flag_c(2, v261, v267, 0);
    v270 = (long long)a2[32] * a1[4] >> 64;
    v271 = a1[4] * (long long)a2[32];
    v272 = v265 + v271;
    v273 = arm64g_calculate_condition(50, v265, v271, 0);
    if (v273 & 1)
        v274 = v270;
    else
        v274 = v270 + 1;
    v275 = v274 + v268;
    v276 = arm64g_calculate_condition(50, v274, v268, 0);
    v277 = (long long)a2[40] * a1[3] >> 64;
    v278 = a1[3] * (long long)a2[40];
    v279 = v272 + v278;
    v280 = arm64g_calculate_condition(50, v272, v278, 0);
    if (v280 & 1)
        v281 = v277;
    else
        v281 = v277 + 1;
    v282 = v281 + v275;
    v283 = arm64g_calculate_flag_c(2, v281, v275, 0);
    v284 = (long long)a2[48] * a1[2] >> 64;
    v285 = a1[2] * (long long)a2[48];
    v286 = v279 + v285;
    v287 = arm64g_calculate_condition(50, v279, v285, 0);
    if (v287 & 1)
        v288 = v284;
    else
        v288 = v284 + 1;
    v289 = v288 + v282;
    v290 = arm64g_calculate_condition(50, v288, v282, 0);
    v291 = (long long)a2[56] * a1[1] >> 64;
    v292 = a1[1] * (long long)a2[56];
    v293 = arm64g_calculate_condition(50, v286, v292, 0);
    if (v293 & 1)
        v294 = v291;
    else
        v294 = v291 + 1;
    v295 = v294 + v289;
    v296 = arm64g_calculate_flag_c(2, v294, v289, 0);
    v297 = !(v262 & 1) + !(v255 & 1) + v269 + !(v276 & 1) + v283 + !(v290 & 1) + v296;
    a0->field_40 = v286 + v292;
    v298 = (long long)a2[56] * a1[2] >> 64;
    v299 = a1[2] * (long long)a2[56];
    v300 = v295 + v299;
    v301 = arm64g_calculate_condition(50, v295, v299, 0);
    if (v301 & 1)
        v302 = v298;
    else
        v302 = v298 + 1;
    v303 = v297 + v302;
    v304 = (long long)a2[48] * a1[3] >> 64;
    v305 = a1[3] * (long long)a2[48];
    v306 = v300 + v305;
    v307 = arm64g_calculate_condition(50, v300, v305, 0);
    if (v307 & 1)
        v308 = v304;
    else
        v308 = v304 + 1;
    v309 = v303 + v308;
    v310 = arm64g_calculate_condition(50, v303, v308, 0);
    v311 = !(v310 & 1);
    v312 = arm64g_calculate_condition(50, v297, v302, 0);
    if (v312 & 1)
        v313 = v311;
    else
        v313 = v311 + 1;
    v314 = (long long)a2[40] * a1[4] >> 64;
    v315 = a1[4] * (long long)a2[40];
    v316 = v306 + v315;
    v317 = arm64g_calculate_condition(50, v306, v315, 0);
    if (v317 & 1)
        v318 = v314;
    else
        v318 = v314 + 1;
    v319 = v309 + v318;
    v320 = arm64g_calculate_condition(50, v309, v318, 0);
    v321 = (long long)a2[32] * a1[5] >> 64;
    v322 = a1[5] * (long long)a2[32];
    v323 = v316 + v322;
    v324 = arm64g_calculate_condition(50, v316, v322, 0);
    if (v324 & 1)
        v325 = v321;
    else
        v325 = v321 + 1;
    v326 = v325 + v319;
    v327 = arm64g_calculate_flag_c(2, v325, v319, 0);
    v328 = (long long)a2[24] * a1[6] >> 64;
    v329 = a1[6] * (long long)a2[24];
    v330 = v323 + v329;
    v331 = arm64g_calculate_condition(50, v323, v329, 0);
    if (v331 & 1)
        v332 = v328;
    else
        v332 = v328 + 1;
    v333 = v332 + v326;
    v334 = arm64g_calculate_condition(50, v332, v326, 0);
    v335 = (long long)a2[16] * a1[7] >> 64;
    v336 = a1[7] * (long long)a2[16];
    v337 = arm64g_calculate_condition(50, v330, v336, 0);
    if (v337 & 1)
        v338 = v335;
    else
        v338 = v335 + 1;
    v339 = v338 + v333;
    v340 = arm64g_calculate_flag_c(2, v338, v333, 0);
    v341 = v313 + !(v320 & 1) + v327 + !(v334 & 1) + v340;
    a0->field_48 = v330 + v336;
    v342 = (long long)a2[24] * a1[7] >> 64;
    v343 = a1[7] * (long long)a2[24];
    v344 = v339 + v343;
    v345 = arm64g_calculate_condition(50, v339, v343, 0);
    if (v345 & 1)
        v346 = v342;
    else
        v346 = v342 + 1;
    v347 = v341 + v346;
    v348 = arm64g_calculate_condition(50, v341, v346, 0);
    v349 = (long long)a2[32] * a1[6] >> 64;
    v350 = a1[6] * (long long)a2[32];
    v351 = v344 + v350;
    v352 = arm64g_calculate_condition(50, v344, v350, 0);
    if (v352 & 1)
        v353 = v349;
    else
        v353 = v349 + 1;
    v354 = v347 + v353;
    v355 = arm64g_calculate_condition(50, v347, v353, 0);
    v356 = (long long)a2[40] * a1[5] >> 64;
    v357 = a1[5] * (long long)a2[40];
    v358 = v351 + v357;
    v359 = arm64g_calculate_condition(50, v351, v357, 0);
    if (v359 & 1)
        v360 = v356;
    else
        v360 = v356 + 1;
    v361 = v354 + v360;
    v362 = arm64g_calculate_flag_c(2, v354, v360, 0);
    v363 = (long long)a2[48] * a1[4] >> 64;
    v364 = a1[4] * (long long)a2[48];
    v365 = v358 + v364;
    v366 = arm64g_calculate_condition(50, v358, v364, 0);
    if (v366 & 1)
        v367 = v363;
    else
        v367 = v363 + 1;
    v368 = v367 + v361;
    v369 = arm64g_calculate_condition(50, v367, v361, 0);
    v370 = (long long)a2[56] * a1[3] >> 64;
    v371 = a1[3] * (long long)a2[56];
    v372 = arm64g_calculate_condition(50, v365, v371, 0);
    if (v372 & 1)
        v373 = v370;
    else
        v373 = v370 + 1;
    v374 = v373 + v368;
    v375 = arm64g_calculate_flag_c(2, v373, v368, 0);
    v376 = !(v355 & 1) + !(v348 & 1) + v362 + !(v369 & 1) + v375;
    a0->field_50 = v365 + v371;
    v377 = (long long)a2[56] * a1[4] >> 64;
    v378 = a1[4] * (long long)a2[56];
    v379 = v374 + v378;
    v380 = arm64g_calculate_condition(50, v374, v378, 0);
    if (v380 & 1)
        v381 = v377;
    else
        v381 = v377 + 1;
    v382 = v376 + v381;
    v383 = (long long)a2[48] * a1[5] >> 64;
    v384 = a1[5] * (long long)a2[48];
    v385 = v379 + v384;
    v386 = arm64g_calculate_condition(50, v379, v384, 0);
    if (v386 & 1)
        v387 = v383;
    else
        v387 = v383 + 1;
    v388 = v382 + v387;
    v389 = arm64g_calculate_condition(50, v382, v387, 0);
    v390 = !(v389 & 1);
    v391 = (long long)a2[40] * a1[6] >> 64;
    v392 = a1[6] * (long long)a2[40];
    v393 = arm64g_calculate_condition(50, v376, v381, 0);
    if (!(v393 & 1))
        v390 += 1;
    v394 = v385 + v392;
    v395 = arm64g_calculate_condition(50, v385, v392, 0);
    if (v395 & 1)
        v396 = v391;
    else
        v396 = v391 + 1;
    v397 = v388 + v396;
    v398 = arm64g_calculate_condition(50, v388, v396, 0);
    v399 = (long long)a2[32] * a1[7] >> 64;
    v400 = a1[7] * (long long)a2[32];
    v401 = arm64g_calculate_condition(50, v394, v400, 0);
    if (v401 & 1)
        v402 = v399;
    else
        v402 = v399 + 1;
    v403 = v402 + v397;
    v404 = arm64g_calculate_flag_c(2, v402, v397, 0);
    v405 = v390 + !(v398 & 1) + v404;
    a0->field_58 = v394 + v400;
    v406 = (long long)a2[40] * a1[7] >> 64;
    v407 = a1[7] * (long long)a2[40];
    v408 = v403 + v407;
    v409 = arm64g_calculate_condition(50, v403, v407, 0);
    if (v409 & 1)
        v410 = v406;
    else
        v410 = v406 + 1;
    v411 = v405 + v410;
    v412 = arm64g_calculate_condition(50, v405, v410, 0);
    v413 = (long long)a2[48] * a1[6] >> 64;
    v414 = a1[6] * (long long)a2[48];
    v415 = v408 + v414;
    v416 = arm64g_calculate_condition(50, v408, v414, 0);
    if (v416 & 1)
        v417 = v413;
    else
        v417 = v413 + 1;
    v418 = v411 + v417;
    v419 = arm64g_calculate_condition(50, v411, v417, 0);
    v420 = (long long)a2[56] * a1[5] >> 64;
    v421 = a1[5] * (long long)a2[56];
    v422 = arm64g_calculate_condition(50, v415, v421, 0);
    if (v422 & 1)
        v423 = v420;
    else
        v423 = v420 + 1;
    v424 = v418 + v423;
    v425 = arm64g_calculate_flag_c(2, v418, v423, 0);
    v426 = !(v419 & 1) + !(v412 & 1) + v425;
    a0->field_60 = v415 + v421;
    v427 = (long long)a2[56] * a1[6] >> 64;
    v428 = a1[6] * (long long)a2[56];
    v429 = v424 + v428;
    v430 = arm64g_calculate_condition(50, v424, v428, 0);
    if (v430 & 1)
        v431 = v427;
    else
        v431 = v427 + 1;
    v432 = (long long)a2[48] * a1[7] >> 64;
    v433 = a1[7] * (long long)a2[48];
    v434 = arm64g_calculate_condition(50, v429, v433, 0);
    if (v434 & 1)
        v435 = v432;
    else
        v435 = v432 + 1;
    v436 = v426 + v431;
    a0->field_68 = v429 + v433;
    v437 = (long long)a2[56] * a1[7] >> 64;
    v438 = arm64g_calculate_condition(50, v426, v431, 0);
    if (!(v438 & 1))
        v437 += 1;
    v439 = v436 + v435;
    v440 = arm64g_calculate_condition(50, v436, v435, 0);
    v441 = a1[7] * (long long)a2[56];
    v442 = arm64g_calculate_flag_c(2, v439, v441, 0);
    a0->field_70 = v439 + v441;
    a0->field_78 = v437 + !(v440 & 1) + v442;
    return a0;
}
