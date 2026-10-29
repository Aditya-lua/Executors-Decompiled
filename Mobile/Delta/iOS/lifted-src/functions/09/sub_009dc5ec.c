/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dc5ec..0x9dcbd0 (1508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_9dc5ec(void* a0, void* a1)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x9
    unsigned long v10;  // x8
    unsigned long v100;  // x14
    unsigned long long v101;  // 4106
    unsigned long v102;  // x10
    unsigned long long v103;  // x12
    unsigned long v104;  // x11
    unsigned long long v105;  // x8
    unsigned long long v106;  // 4119
    unsigned long long v107;  // x13
    unsigned long long v108;  // x9
    unsigned long long v109;  // 4115
    unsigned long long v11;  // x13
    unsigned long long v110;  // x8
    unsigned long long v111;  // 4126
    unsigned long long v112;  // x11
    unsigned long long v113;  // x9
    unsigned long v114;  // 4118
    unsigned long long v115;  // x13
    unsigned long v116;  // x11
    unsigned long long v117;  // x8
    unsigned long long v118;  // 4143
    unsigned long long v119;  // x12
    unsigned long v12;  // x8
    unsigned long long v120;  // x9
    unsigned long long v121;  // 4115
    unsigned long long v122;  // 4126
    unsigned long long v123;  // x11
    unsigned long long v124;  // x9
    unsigned long v125;  // 4119
    unsigned long long v126;  // x10
    unsigned long v127;  // x8
    unsigned long long v128;  // x12
    unsigned long v129;  // x8
    unsigned long long v13;  // x8
    unsigned long long v130;  // x8
    unsigned long long v131;  // 4147
    unsigned long long v132;  // x9
    unsigned long long v133;  // x9
    unsigned long long v134;  // 4119
    unsigned long long v135;  // x14
    unsigned long v136;  // x11
    unsigned long long v137;  // x8
    unsigned long long v138;  // 4142
    unsigned long long v139;  // x12
    unsigned long long v14;  // 4136
    unsigned long long v140;  // x9
    unsigned long long v141;  // 4115
    unsigned long long v142;  // x8
    unsigned long long v143;  // 4126
    unsigned long long v144;  // x11
    unsigned long long v145;  // x9
    unsigned long v146;  // 4118
    unsigned long long v147;  // x14
    unsigned long v148;  // x11
    unsigned long long v149;  // x8
    unsigned long long v15;  // x11
    unsigned long long v150;  // 4143
    unsigned long long v151;  // x13
    unsigned long long v152;  // x9
    unsigned long long v153;  // 4115
    unsigned long long v154;  // x8
    unsigned long long v155;  // 4126
    unsigned long long v156;  // x11
    unsigned long long v157;  // x9
    unsigned long v158;  // 4116
    unsigned long long v159;  // x13
    unsigned long v16;  // 4116
    unsigned long v160;  // x11
    unsigned long long v161;  // x8
    unsigned long long v162;  // 4139
    unsigned long long v163;  // x12
    unsigned long long v164;  // x9
    unsigned long long v165;  // 4115
    unsigned long long v166;  // 4126
    unsigned long long v167;  // x11
    unsigned long long v168;  // x9
    unsigned long v169;  // 4123
    unsigned long long v17;  // x9
    unsigned long long v170;  // x10
    unsigned long long v171;  // x14
    unsigned long v172;  // x8
    unsigned long long v173;  // x9
    unsigned long long v174;  // 4155
    unsigned long long v175;  // x12
    unsigned long long v176;  // x15
    unsigned long long v177;  // x8
    unsigned long long v178;  // 4116
    unsigned long long v179;  // x9
    unsigned long long v18;  // 4128
    unsigned long long v180;  // x9
    unsigned long long v181;  // 4115
    unsigned long v182;  // x14
    unsigned long long v183;  // 4126
    unsigned long v184;  // x10
    unsigned long long v185;  // x12
    unsigned long v186;  // x11
    unsigned long long v187;  // x8
    unsigned long long v188;  // 4119
    unsigned long long v189;  // x13
    unsigned long long v19;  // x13
    unsigned long long v190;  // x9
    unsigned long long v191;  // 4115
    unsigned long long v192;  // x8
    unsigned long long v193;  // 4126
    unsigned long long v194;  // x11
    unsigned long long v195;  // x9
    unsigned long v196;  // 4122
    unsigned long long v197;  // x15
    unsigned long v198;  // x11
    unsigned long long v199;  // x8
    unsigned long long v2;  // x11
    unsigned long v20;  // x11
    unsigned long long v200;  // 4151
    unsigned long long v201;  // x13
    unsigned long long v202;  // x9
    unsigned long long v203;  // 4115
    unsigned long long v204;  // x8
    unsigned long long v205;  // 4126
    unsigned long long v206;  // x11
    unsigned long long v207;  // x9
    unsigned long v208;  // 4109
    unsigned long long v209;  // x11
    unsigned long long v21;  // x8
    unsigned long v210;  // x12
    unsigned long long v211;  // x8
    unsigned long long v212;  // 4119
    unsigned long long v213;  // x13
    unsigned long long v214;  // x9
    unsigned long long v215;  // 4115
    unsigned long long v216;  // 4126
    unsigned long long v217;  // x9
    unsigned long v218;  // 4119
    unsigned long long v219;  // x10
    unsigned long long v22;  // 4149
    unsigned long v220;  // x8
    unsigned long long v221;  // x12
    unsigned long v222;  // x8
    unsigned long long v223;  // x8
    unsigned long long v224;  // 4147
    unsigned long long v225;  // x9
    unsigned long long v226;  // x9
    unsigned long long v227;  // 4119
    unsigned long long v228;  // x14
    unsigned long v229;  // x11
    unsigned long long v23;  // x12
    unsigned long long v230;  // x8
    unsigned long long v231;  // 4142
    unsigned long long v232;  // x12
    unsigned long long v233;  // x9
    unsigned long long v234;  // 4115
    unsigned long long v235;  // x8
    unsigned long long v236;  // 4126
    unsigned long long v237;  // x11
    unsigned long long v238;  // x9
    unsigned long v239;  // 4118
    unsigned long long v24;  // x9
    unsigned long long v240;  // x14
    unsigned long v241;  // x11
    unsigned long long v242;  // x8
    unsigned long long v243;  // 4143
    unsigned long long v244;  // x13
    unsigned long long v245;  // x9
    unsigned long long v246;  // 4115
    unsigned long long v247;  // x8
    unsigned long long v248;  // 4126
    unsigned long long v249;  // x11
    unsigned long long v25;  // 4115
    unsigned long long v250;  // x9
    unsigned long v251;  // 4116
    unsigned long long v252;  // x13
    unsigned long v253;  // x11
    unsigned long long v254;  // x8
    unsigned long long v255;  // 4139
    unsigned long long v256;  // x12
    unsigned long long v257;  // x9
    unsigned long long v258;  // 4115
    unsigned long long v259;  // 4126
    unsigned long long v26;  // 4126
    unsigned long long v260;  // x11
    unsigned long long v261;  // x9
    unsigned long v262;  // 4123
    unsigned long long v263;  // x10
    unsigned long long v264;  // x14
    unsigned long v265;  // x8
    unsigned long long v266;  // x9
    unsigned long long v267;  // 4155
    unsigned long long v268;  // x12
    unsigned long long v269;  // x15
    unsigned long long v27;  // x11
    unsigned long long v270;  // x8
    unsigned long long v271;  // 4116
    unsigned long long v272;  // x9
    unsigned long long v273;  // x9
    unsigned long long v274;  // 4115
    unsigned long v275;  // x14
    unsigned long long v276;  // 4126
    unsigned long v277;  // x10
    unsigned long long v278;  // x12
    unsigned long v279;  // x11
    unsigned long long v28;  // x9
    unsigned long long v280;  // x8
    unsigned long long v281;  // 4119
    unsigned long long v282;  // x13
    unsigned long long v283;  // x9
    unsigned long long v284;  // 4115
    unsigned long long v285;  // x8
    unsigned long long v286;  // 4126
    unsigned long long v287;  // x11
    unsigned long long v288;  // x9
    unsigned long v289;  // 4118
    unsigned long v29;  // 4123
    unsigned long long v290;  // x13
    unsigned long v291;  // x11
    unsigned long long v292;  // x8
    unsigned long long v293;  // 4143
    unsigned long long v294;  // x12
    unsigned long long v295;  // x9
    unsigned long long v296;  // 4115
    unsigned long long v297;  // 4126
    unsigned long long v298;  // x11
    unsigned long long v299;  // x9
    unsigned long v3;  // x8
    unsigned long long v30;  // x10
    unsigned long v300;  // 4119
    unsigned long long v301;  // x10
    unsigned long v302;  // x8
    unsigned long long v303;  // x12
    unsigned long v304;  // x8
    unsigned long long v305;  // x8
    unsigned long long v306;  // 4147
    unsigned long long v307;  // x9
    unsigned long long v308;  // x9
    unsigned long long v309;  // 4119
    unsigned long long v31;  // x14
    unsigned long long v310;  // x14
    unsigned long v311;  // x11
    unsigned long long v312;  // x8
    unsigned long long v313;  // 4142
    unsigned long long v314;  // x12
    unsigned long long v315;  // x9
    unsigned long long v316;  // 4115
    unsigned long long v317;  // x8
    unsigned long long v318;  // 4126
    unsigned long long v319;  // x11
    unsigned long v32;  // x8
    unsigned long long v320;  // x9
    unsigned long v321;  // 4116
    unsigned long long v322;  // x12
    unsigned long v323;  // x11
    unsigned long long v324;  // x8
    unsigned long long v325;  // 4139
    unsigned long long v326;  // x13
    unsigned long long v327;  // x9
    unsigned long long v328;  // 4115
    unsigned long long v329;  // 4126
    unsigned long long v33;  // x9
    unsigned long long v330;  // x11
    unsigned long long v331;  // x9
    unsigned long v332;  // 4123
    unsigned long long v333;  // x10
    unsigned long long v334;  // x14
    unsigned long v335;  // x8
    unsigned long long v336;  // x9
    unsigned long long v337;  // 4155
    unsigned long long v338;  // x12
    unsigned long long v339;  // x15
    unsigned long long v34;  // 4155
    unsigned long long v340;  // x8
    unsigned long long v341;  // 4116
    unsigned long long v342;  // x9
    unsigned long long v343;  // x9
    unsigned long long v344;  // 4115
    unsigned long v345;  // x14
    unsigned long long v346;  // 4126
    unsigned long v347;  // x10
    unsigned long long v348;  // x12
    unsigned long v349;  // x11
    unsigned long long v35;  // x12
    unsigned long long v350;  // x8
    unsigned long long v351;  // 4119
    unsigned long long v352;  // x13
    unsigned long long v353;  // x9
    unsigned long long v354;  // 4115
    unsigned long long v355;  // 4126
    unsigned long long v356;  // x11
    unsigned long long v357;  // x9
    unsigned long v358;  // 4119
    unsigned long long v359;  // x10
    unsigned long long v36;  // x15
    unsigned long v360;  // x8
    unsigned long long v361;  // x12
    unsigned long v362;  // x8
    unsigned long long v363;  // x8
    unsigned long long v364;  // 4147
    unsigned long long v365;  // x9
    unsigned long long v366;  // x9
    unsigned long long v367;  // 4117
    unsigned long long v368;  // x13
    unsigned long v369;  // x11
    unsigned long long v37;  // x8
    unsigned long long v370;  // x8
    unsigned long long v371;  // 4138
    unsigned long long v372;  // x12
    unsigned long long v373;  // x9
    unsigned long long v374;  // 4115
    unsigned long long v375;  // 4126
    unsigned long long v376;  // x11
    unsigned long long v377;  // x9
    unsigned long v378;  // 4119
    unsigned long long v379;  // x10
    unsigned long long v38;  // 4116
    unsigned long long v380;  // x12
    unsigned long v381;  // x8
    unsigned long long v382;  // x9
    unsigned long long v383;  // 4147
    unsigned long long v384;  // x11
    unsigned long long v385;  // 4111
    unsigned long long v386;  // x9
    unsigned long long v387;  // x10
    unsigned long v388;  // x8
    unsigned long long v389;  // x11
    unsigned long long v39;  // x9
    unsigned long long v390;  // 4123
    unsigned long long v391;  // x9
    unsigned long long v392;  // 4123
    unsigned long v393;  // x8
    unsigned long v394;  // 4132
    unsigned long long v4;  // x9
    unsigned long long v40;  // x9
    unsigned long long v41;  // 4115
    unsigned long v42;  // x14
    unsigned long long v43;  // 4126
    unsigned long v44;  // x10
    unsigned long long v45;  // x12
    unsigned long v46;  // x11
    unsigned long long v47;  // x8
    unsigned long long v48;  // 4119
    unsigned long long v49;  // x13
    unsigned long long v5;  // 4143
    unsigned long long v50;  // x9
    unsigned long long v51;  // 4115
    unsigned long long v52;  // 4126
    unsigned long long v53;  // x11
    unsigned long long v54;  // x9
    unsigned long v55;  // 4119
    unsigned long long v56;  // x10
    unsigned long v57;  // x8
    unsigned long long v58;  // x12
    unsigned long v59;  // x8
    unsigned long long v6;  // x10
    unsigned long long v60;  // x8
    unsigned long long v61;  // 4147
    unsigned long long v62;  // x9
    unsigned long long v63;  // x9
    unsigned long long v64;  // 4119
    unsigned long long v65;  // x14
    unsigned long v66;  // x11
    unsigned long long v67;  // x8
    unsigned long long v68;  // 4142
    unsigned long long v69;  // x12
    unsigned long long v7;  // 4111
    unsigned long long v70;  // x9
    unsigned long long v71;  // 4115
    unsigned long long v72;  // x8
    unsigned long long v73;  // 4126
    unsigned long long v74;  // x11
    unsigned long long v75;  // x9
    unsigned long v76;  // 4116
    unsigned long long v77;  // x12
    unsigned long v78;  // x11
    unsigned long long v79;  // x8
    unsigned long long v8;  // x9
    unsigned long long v80;  // 4139
    unsigned long long v81;  // x13
    unsigned long long v82;  // x9
    unsigned long long v83;  // 4115
    unsigned long long v84;  // 4126
    unsigned long long v85;  // x11
    unsigned long long v86;  // x9
    unsigned long v87;  // 4123
    unsigned long long v88;  // x10
    unsigned long long v89;  // x14
    unsigned long long v9;  // x11
    unsigned long v90;  // x8
    unsigned long long v91;  // x9
    unsigned long long v92;  // 4155
    unsigned long long v93;  // x12
    unsigned long long v94;  // x15
    unsigned long long v95;  // x8
    unsigned long long v96;  // 4116
    unsigned long long v97;  // x9
    unsigned long long v98;  // x9
    unsigned long long v99;  // 4115

    v0 = *(long long *)a1;
    v1 = v0 * v0 >> 64;
    *(unsigned long *)a0 = v0 * v0;
    v2 = (unsigned long long)(*(long long *)a1 * (long long)a1[8]) >> 64;
    v3 = (long long)a1[8] * *(long long *)a1;
    v4 = v3 + v1;
    v5 = arm64g_calculate_condition(50, v3, v1, 0);
    if (v5 & 1)
        v6 = v2;
    else
        v6 = v2 + 1;
    v7 = arm64g_calculate_condition(50, v4, v3, 0);
    if (v7 & 1)
        v8 = v2;
    else
        v8 = v2 + 1;
    v9 = v6 + v8;
    *(unsigned long *)&a0[8] = v4 + v3;
    v10 = (long long)a1[8];
    v11 = v10 * v10 >> 64;
    v12 = v10 * v10;
    v13 = v9 + v12;
    v14 = arm64g_calculate_condition(50, v9, v12, 0);
    if (v14 & 1)
        v15 = v11;
    else
        v15 = v11 + 1;
    v16 = arm64g_calculate_flag_c(2, v6, v8, 0);
    v17 = v15 + v16;
    v18 = arm64g_calculate_condition(54, v15, 0, v16);
    v19 = (unsigned long long)(*(long long *)a1 * (long long)a1[16]) >> 64;
    v20 = (long long)a1[16] * *(long long *)a1;
    v21 = v13 + v20;
    v22 = arm64g_calculate_condition(50, v13, v20, 0);
    if (v22 & 1)
        v23 = v19;
    else
        v23 = v19 + 1;
    v24 = v17 + v23;
    v25 = arm64g_calculate_condition(50, v17, v23, 0);
    v26 = arm64g_calculate_condition(50, v21, v20, 0);
    if (v26 & 1)
        v27 = v19;
    else
        v27 = v19 + 1;
    v28 = v24 + v27;
    v29 = arm64g_calculate_flag_c(2, v24, v27, 0);
    v30 = !(v25 & 1) + !(v18 & 1) + v29;
    *(unsigned long *)&a0[16] = v21 + v20;
    v31 = (unsigned long long)(*(long long *)a1 * (long long)a1[24]) >> 64;
    v32 = (long long)a1[24] * *(long long *)a1;
    v33 = v28 + v32;
    v34 = arm64g_calculate_condition(50, v28, v32, 0);
    if (v34 & 1)
        v35 = v31;
    else
        v35 = v31 + 1;
    v36 = v30 + v35;
    v37 = v33 + v32;
    v38 = arm64g_calculate_condition(50, v33, v32, 0);
    if (v38 & 1)
        v39 = v31;
    else
        v39 = v31 + 1;
    v40 = v36 + v39;
    v41 = arm64g_calculate_condition(50, v36, v39, 0);
    v42 = !(v41 & 1);
    v43 = arm64g_calculate_condition(50, v30, v35, 0);
    if (v43 & 1)
        v44 = v42;
    else
        v44 = v42 + 1;
    v45 = (unsigned long long)((long long)a1[8] * (long long)a1[16]) >> 64;
    v46 = (long long)a1[16] * (long long)a1[8];
    v47 = v37 + v46;
    v48 = arm64g_calculate_condition(50, v37, v46, 0);
    if (v48 & 1)
        v49 = v45;
    else
        v49 = v45 + 1;
    v50 = v40 + v49;
    v51 = arm64g_calculate_condition(50, v40, v49, 0);
    v52 = arm64g_calculate_condition(50, v47, v46, 0);
    if (v52 & 1)
        v53 = v45;
    else
        v53 = v45 + 1;
    v54 = v50 + v53;
    v55 = arm64g_calculate_flag_c(2, v50, v53, 0);
    v56 = v44 + !(v51 & 1) + v55;
    *(unsigned long *)&a0[24] = v47 + v46;
    v57 = (long long)a1[16];
    v58 = v57 * v57 >> 64;
    v59 = v57 * v57;
    v60 = v54 + v59;
    v61 = arm64g_calculate_condition(50, v54, v59, 0);
    if (v61 & 1)
        v62 = v58;
    else
        v62 = v58 + 1;
    v63 = v56 + v62;
    v64 = arm64g_calculate_condition(50, v56, v62, 0);
    v65 = (unsigned long long)((long long)a1[8] * (long long)a1[24]) >> 64;
    v66 = (long long)a1[24] * (long long)a1[8];
    v67 = v60 + v66;
    v68 = arm64g_calculate_condition(50, v60, v66, 0);
    if (v68 & 1)
        v69 = v65;
    else
        v69 = v65 + 1;
    v70 = v63 + v69;
    v71 = arm64g_calculate_condition(50, v63, v69, 0);
    v72 = v67 + v66;
    v73 = arm64g_calculate_condition(50, v67, v66, 0);
    if (v73 & 1)
        v74 = v65;
    else
        v74 = v65 + 1;
    v75 = v70 + v74;
    v76 = arm64g_calculate_flag_c(2, v70, v74, 0);
    v77 = (unsigned long long)(*(long long *)a1 * (long long)a1[32]) >> 64;
    v78 = (long long)a1[32] * *(long long *)a1;
    v79 = v72 + v78;
    v80 = arm64g_calculate_condition(50, v72, v78, 0);
    if (v80 & 1)
        v81 = v77;
    else
        v81 = v77 + 1;
    v82 = v75 + v81;
    v83 = arm64g_calculate_condition(50, v75, v81, 0);
    v84 = arm64g_calculate_condition(50, v79, v78, 0);
    if (v84 & 1)
        v85 = v77;
    else
        v85 = v77 + 1;
    v86 = v82 + v85;
    v87 = arm64g_calculate_flag_c(2, v82, v85, 0);
    v88 = !(v71 & 1) + !(v64 & 1) + v76 + !(v83 & 1) + v87;
    *(unsigned long *)&a0[32] = v79 + v78;
    v89 = (unsigned long long)(*(long long *)a1 * (long long)a1[40]) >> 64;
    v90 = (long long)a1[40] * *(long long *)a1;
    v91 = v86 + v90;
    v92 = arm64g_calculate_condition(50, v86, v90, 0);
    if (v92 & 1)
        v93 = v89;
    else
        v93 = v89 + 1;
    v94 = v88 + v93;
    v95 = v91 + v90;
    v96 = arm64g_calculate_condition(50, v91, v90, 0);
    if (v96 & 1)
        v97 = v89;
    else
        v97 = v89 + 1;
    v98 = v94 + v97;
    v99 = arm64g_calculate_condition(50, v94, v97, 0);
    v100 = !(v99 & 1);
    v101 = arm64g_calculate_condition(50, v88, v93, 0);
    if (v101 & 1)
        v102 = v100;
    else
        v102 = v100 + 1;
    v103 = (unsigned long long)((long long)a1[8] * (long long)a1[32]) >> 64;
    v104 = (long long)a1[32] * (long long)a1[8];
    v105 = v95 + v104;
    v106 = arm64g_calculate_condition(50, v95, v104, 0);
    if (v106 & 1)
        v107 = v103;
    else
        v107 = v103 + 1;
    v108 = v98 + v107;
    v109 = arm64g_calculate_condition(50, v98, v107, 0);
    v110 = v105 + v104;
    v111 = arm64g_calculate_condition(50, v105, v104, 0);
    if (v111 & 1)
        v112 = v103;
    else
        v112 = v103 + 1;
    v113 = v108 + v112;
    v114 = arm64g_calculate_flag_c(2, v108, v112, 0);
    v115 = (unsigned long long)((long long)a1[16] * (long long)a1[24]) >> 64;
    v116 = (long long)a1[24] * (long long)a1[16];
    v117 = v110 + v116;
    v118 = arm64g_calculate_condition(50, v110, v116, 0);
    if (v118 & 1)
        v119 = v115;
    else
        v119 = v115 + 1;
    v120 = v113 + v119;
    v121 = arm64g_calculate_condition(50, v113, v119, 0);
    v122 = arm64g_calculate_condition(50, v117, v116, 0);
    if (v122 & 1)
        v123 = v115;
    else
        v123 = v115 + 1;
    v124 = v120 + v123;
    v125 = arm64g_calculate_flag_c(2, v120, v123, 0);
    v126 = v102 + !(v109 & 1) + v114 + !(v121 & 1) + v125;
    *(unsigned long *)&a0[40] = v117 + v116;
    v127 = (long long)a1[24];
    v128 = v127 * v127 >> 64;
    v129 = v127 * v127;
    v130 = v124 + v129;
    v131 = arm64g_calculate_condition(50, v124, v129, 0);
    if (v131 & 1)
        v132 = v128;
    else
        v132 = v128 + 1;
    v133 = v126 + v132;
    v134 = arm64g_calculate_condition(50, v126, v132, 0);
    v135 = (unsigned long long)((long long)a1[16] * (long long)a1[32]) >> 64;
    v136 = (long long)a1[32] * (long long)a1[16];
    v137 = v130 + v136;
    v138 = arm64g_calculate_condition(50, v130, v136, 0);
    if (v138 & 1)
        v139 = v135;
    else
        v139 = v135 + 1;
    v140 = v133 + v139;
    v141 = arm64g_calculate_condition(50, v133, v139, 0);
    v142 = v137 + v136;
    v143 = arm64g_calculate_condition(50, v137, v136, 0);
    if (v143 & 1)
        v144 = v135;
    else
        v144 = v135 + 1;
    v145 = v140 + v144;
    v146 = arm64g_calculate_flag_c(2, v140, v144, 0);
    v147 = (unsigned long long)((long long)a1[8] * (long long)a1[40]) >> 64;
    v148 = (long long)a1[40] * (long long)a1[8];
    v149 = v142 + v148;
    v150 = arm64g_calculate_condition(50, v142, v148, 0);
    if (v150 & 1)
        v151 = v147;
    else
        v151 = v147 + 1;
    v152 = v145 + v151;
    v153 = arm64g_calculate_condition(50, v145, v151, 0);
    v154 = v149 + v148;
    v155 = arm64g_calculate_condition(50, v149, v148, 0);
    if (v155 & 1)
        v156 = v147;
    else
        v156 = v147 + 1;
    v157 = v152 + v156;
    v158 = arm64g_calculate_flag_c(2, v152, v156, 0);
    v159 = (unsigned long long)(*(long long *)a1 * (long long)a1[48]) >> 64;
    v160 = (long long)a1[48] * *(long long *)a1;
    v161 = v154 + v160;
    v162 = arm64g_calculate_condition(50, v154, v160, 0);
    if (v162 & 1)
        v163 = v159;
    else
        v163 = v159 + 1;
    v164 = v157 + v163;
    v165 = arm64g_calculate_condition(50, v157, v163, 0);
    v166 = arm64g_calculate_condition(50, v161, v160, 0);
    if (v166 & 1)
        v167 = v159;
    else
        v167 = v159 + 1;
    v168 = v164 + v167;
    v169 = arm64g_calculate_flag_c(2, v164, v167, 0);
    v170 = !(v141 & 1) + !(v134 & 1) + v146 + !(v153 & 1) + v158 + !(v165 & 1) + v169;
    *(unsigned long *)&a0[48] = v161 + v160;
    v171 = (unsigned long long)(*(long long *)a1 * (long long)a1[56]) >> 64;
    v172 = (long long)a1[56] * *(long long *)a1;
    v173 = v168 + v172;
    v174 = arm64g_calculate_condition(50, v168, v172, 0);
    if (v174 & 1)
        v175 = v171;
    else
        v175 = v171 + 1;
    v176 = v170 + v175;
    v177 = v173 + v172;
    v178 = arm64g_calculate_condition(50, v173, v172, 0);
    if (v178 & 1)
        v179 = v171;
    else
        v179 = v171 + 1;
    v180 = v176 + v179;
    v181 = arm64g_calculate_condition(50, v176, v179, 0);
    v182 = !(v181 & 1);
    v183 = arm64g_calculate_condition(50, v170, v175, 0);
    if (v183 & 1)
        v184 = v182;
    else
        v184 = v182 + 1;
    v185 = (unsigned long long)((long long)a1[8] * (long long)a1[48]) >> 64;
    v186 = (long long)a1[48] * (long long)a1[8];
    v187 = v177 + v186;
    v188 = arm64g_calculate_condition(50, v177, v186, 0);
    if (v188 & 1)
        v189 = v185;
    else
        v189 = v185 + 1;
    v190 = v180 + v189;
    v191 = arm64g_calculate_condition(50, v180, v189, 0);
    v192 = v187 + v186;
    v193 = arm64g_calculate_condition(50, v187, v186, 0);
    if (v193 & 1)
        v194 = v185;
    else
        v194 = v185 + 1;
    v195 = v190 + v194;
    v196 = arm64g_calculate_flag_c(2, v190, v194, 0);
    v197 = (unsigned long long)((long long)a1[16] * (long long)a1[40]) >> 64;
    v198 = (long long)a1[40] * (long long)a1[16];
    v199 = v192 + v198;
    v200 = arm64g_calculate_condition(50, v192, v198, 0);
    if (v200 & 1)
        v201 = v197;
    else
        v201 = v197 + 1;
    v202 = v195 + v201;
    v203 = arm64g_calculate_condition(50, v195, v201, 0);
    v204 = v199 + v198;
    v205 = arm64g_calculate_condition(50, v199, v198, 0);
    if (v205 & 1)
        v206 = v197;
    else
        v206 = v197 + 1;
    v207 = v202 + v206;
    v208 = arm64g_calculate_flag_c(2, v202, v206, 0);
    v209 = (unsigned long long)((long long)a1[24] * (long long)a1[32]) >> 64;
    v210 = (long long)a1[32] * (long long)a1[24];
    v211 = v204 + v210;
    v212 = arm64g_calculate_condition(50, v204, v210, 0);
    if (v212 & 1)
        v213 = v209;
    else
        v213 = v209 + 1;
    v214 = v207 + v213;
    v215 = arm64g_calculate_condition(50, v207, v213, 0);
    v216 = arm64g_calculate_condition(50, v211, v210, 0);
    if (!(v216 & 1))
        v209 += 1;
    v217 = v214 + v209;
    v218 = arm64g_calculate_flag_c(2, v214, v209, 0);
    v219 = v184 + !(v191 & 1) + v196 + !(v203 & 1) + v208 + !(v215 & 1) + v218;
    *(unsigned long *)&a0[56] = v211 + v210;
    v220 = (long long)a1[32];
    v221 = v220 * v220 >> 64;
    v222 = v220 * v220;
    v223 = v217 + v222;
    v224 = arm64g_calculate_condition(50, v217, v222, 0);
    if (v224 & 1)
        v225 = v221;
    else
        v225 = v221 + 1;
    v226 = v219 + v225;
    v227 = arm64g_calculate_condition(50, v219, v225, 0);
    v228 = (unsigned long long)((long long)a1[24] * (long long)a1[40]) >> 64;
    v229 = (long long)a1[40] * (long long)a1[24];
    v230 = v223 + v229;
    v231 = arm64g_calculate_condition(50, v223, v229, 0);
    if (v231 & 1)
        v232 = v228;
    else
        v232 = v228 + 1;
    v233 = v226 + v232;
    v234 = arm64g_calculate_condition(50, v226, v232, 0);
    v235 = v230 + v229;
    v236 = arm64g_calculate_condition(50, v230, v229, 0);
    if (v236 & 1)
        v237 = v228;
    else
        v237 = v228 + 1;
    v238 = v233 + v237;
    v239 = arm64g_calculate_flag_c(2, v233, v237, 0);
    v240 = (unsigned long long)((long long)a1[16] * (long long)a1[48]) >> 64;
    v241 = (long long)a1[48] * (long long)a1[16];
    v242 = v235 + v241;
    v243 = arm64g_calculate_condition(50, v235, v241, 0);
    if (v243 & 1)
        v244 = v240;
    else
        v244 = v240 + 1;
    v245 = v238 + v244;
    v246 = arm64g_calculate_condition(50, v238, v244, 0);
    v247 = v242 + v241;
    v248 = arm64g_calculate_condition(50, v242, v241, 0);
    if (v248 & 1)
        v249 = v240;
    else
        v249 = v240 + 1;
    v250 = v245 + v249;
    v251 = arm64g_calculate_flag_c(2, v245, v249, 0);
    v252 = (unsigned long long)((long long)a1[8] * (long long)a1[56]) >> 64;
    v253 = (long long)a1[56] * (long long)a1[8];
    v254 = v247 + v253;
    v255 = arm64g_calculate_condition(50, v247, v253, 0);
    if (v255 & 1)
        v256 = v252;
    else
        v256 = v252 + 1;
    v257 = v250 + v256;
    v258 = arm64g_calculate_condition(50, v250, v256, 0);
    v259 = arm64g_calculate_condition(50, v254, v253, 0);
    if (v259 & 1)
        v260 = v252;
    else
        v260 = v252 + 1;
    v261 = v257 + v260;
    v262 = arm64g_calculate_flag_c(2, v257, v260, 0);
    v263 = !(v234 & 1) + !(v227 & 1) + v239 + !(v246 & 1) + v251 + !(v258 & 1) + v262;
    *(unsigned long *)&a0[64] = v254 + v253;
    v264 = (unsigned long long)((long long)a1[16] * (long long)a1[56]) >> 64;
    v265 = (long long)a1[56] * (long long)a1[16];
    v266 = v261 + v265;
    v267 = arm64g_calculate_condition(50, v261, v265, 0);
    if (v267 & 1)
        v268 = v264;
    else
        v268 = v264 + 1;
    v269 = v263 + v268;
    v270 = v266 + v265;
    v271 = arm64g_calculate_condition(50, v266, v265, 0);
    if (v271 & 1)
        v272 = v264;
    else
        v272 = v264 + 1;
    v273 = v269 + v272;
    v274 = arm64g_calculate_condition(50, v269, v272, 0);
    v275 = !(v274 & 1);
    v276 = arm64g_calculate_condition(50, v263, v268, 0);
    if (v276 & 1)
        v277 = v275;
    else
        v277 = v275 + 1;
    v278 = (unsigned long long)((long long)a1[24] * (long long)a1[48]) >> 64;
    v279 = (long long)a1[48] * (long long)a1[24];
    v280 = v270 + v279;
    v281 = arm64g_calculate_condition(50, v270, v279, 0);
    if (v281 & 1)
        v282 = v278;
    else
        v282 = v278 + 1;
    v283 = v273 + v282;
    v284 = arm64g_calculate_condition(50, v273, v282, 0);
    v285 = v280 + v279;
    v286 = arm64g_calculate_condition(50, v280, v279, 0);
    if (v286 & 1)
        v287 = v278;
    else
        v287 = v278 + 1;
    v288 = v283 + v287;
    v289 = arm64g_calculate_flag_c(2, v283, v287, 0);
    v290 = (unsigned long long)((long long)a1[32] * (long long)a1[40]) >> 64;
    v291 = (long long)a1[40] * (long long)a1[32];
    v292 = v285 + v291;
    v293 = arm64g_calculate_condition(50, v285, v291, 0);
    if (v293 & 1)
        v294 = v290;
    else
        v294 = v290 + 1;
    v295 = v288 + v294;
    v296 = arm64g_calculate_condition(50, v288, v294, 0);
    v297 = arm64g_calculate_condition(50, v292, v291, 0);
    if (v297 & 1)
        v298 = v290;
    else
        v298 = v290 + 1;
    v299 = v295 + v298;
    v300 = arm64g_calculate_flag_c(2, v295, v298, 0);
    v301 = v277 + !(v284 & 1) + v289 + !(v296 & 1) + v300;
    *(unsigned long *)&a0[72] = v292 + v291;
    v302 = (long long)a1[40];
    v303 = v302 * v302 >> 64;
    v304 = v302 * v302;
    v305 = v299 + v304;
    v306 = arm64g_calculate_condition(50, v299, v304, 0);
    if (v306 & 1)
        v307 = v303;
    else
        v307 = v303 + 1;
    v308 = v301 + v307;
    v309 = arm64g_calculate_condition(50, v301, v307, 0);
    v310 = (unsigned long long)((long long)a1[32] * (long long)a1[48]) >> 64;
    v311 = (long long)a1[48] * (long long)a1[32];
    v312 = v305 + v311;
    v313 = arm64g_calculate_condition(50, v305, v311, 0);
    if (v313 & 1)
        v314 = v310;
    else
        v314 = v310 + 1;
    v315 = v308 + v314;
    v316 = arm64g_calculate_condition(50, v308, v314, 0);
    v317 = v312 + v311;
    v318 = arm64g_calculate_condition(50, v312, v311, 0);
    if (v318 & 1)
        v319 = v310;
    else
        v319 = v310 + 1;
    v320 = v315 + v319;
    v321 = arm64g_calculate_flag_c(2, v315, v319, 0);
    v322 = (unsigned long long)((long long)a1[24] * (long long)a1[56]) >> 64;
    v323 = (long long)a1[56] * (long long)a1[24];
    v324 = v317 + v323;
    v325 = arm64g_calculate_condition(50, v317, v323, 0);
    if (v325 & 1)
        v326 = v322;
    else
        v326 = v322 + 1;
    v327 = v320 + v326;
    v328 = arm64g_calculate_condition(50, v320, v326, 0);
    v329 = arm64g_calculate_condition(50, v324, v323, 0);
    if (v329 & 1)
        v330 = v322;
    else
        v330 = v322 + 1;
    v331 = v327 + v330;
    v332 = arm64g_calculate_flag_c(2, v327, v330, 0);
    v333 = !(v316 & 1) + !(v309 & 1) + v321 + !(v328 & 1) + v332;
    *(unsigned long *)&a0[80] = v324 + v323;
    v334 = (unsigned long long)((long long)a1[32] * (long long)a1[56]) >> 64;
    v335 = (long long)a1[56] * (long long)a1[32];
    v336 = v331 + v335;
    v337 = arm64g_calculate_condition(50, v331, v335, 0);
    if (v337 & 1)
        v338 = v334;
    else
        v338 = v334 + 1;
    v339 = v333 + v338;
    v340 = v336 + v335;
    v341 = arm64g_calculate_condition(50, v336, v335, 0);
    if (v341 & 1)
        v342 = v334;
    else
        v342 = v334 + 1;
    v343 = v339 + v342;
    v344 = arm64g_calculate_condition(50, v339, v342, 0);
    v345 = !(v344 & 1);
    v346 = arm64g_calculate_condition(50, v333, v338, 0);
    if (v346 & 1)
        v347 = v345;
    else
        v347 = v345 + 1;
    v348 = (unsigned long long)((long long)a1[40] * (long long)a1[48]) >> 64;
    v349 = (long long)a1[48] * (long long)a1[40];
    v350 = v340 + v349;
    v351 = arm64g_calculate_condition(50, v340, v349, 0);
    if (v351 & 1)
        v352 = v348;
    else
        v352 = v348 + 1;
    v353 = v343 + v352;
    v354 = arm64g_calculate_condition(50, v343, v352, 0);
    v355 = arm64g_calculate_condition(50, v350, v349, 0);
    if (v355 & 1)
        v356 = v348;
    else
        v356 = v348 + 1;
    v357 = v353 + v356;
    v358 = arm64g_calculate_flag_c(2, v353, v356, 0);
    v359 = v347 + !(v354 & 1) + v358;
    *(unsigned long *)&a0[88] = v350 + v349;
    v360 = (long long)a1[48];
    v361 = v360 * v360 >> 64;
    v362 = v360 * v360;
    v363 = v357 + v362;
    v364 = arm64g_calculate_condition(50, v357, v362, 0);
    if (v364 & 1)
        v365 = v361;
    else
        v365 = v361 + 1;
    v366 = v359 + v365;
    v367 = arm64g_calculate_condition(50, v359, v365, 0);
    v368 = (unsigned long long)((long long)a1[40] * (long long)a1[56]) >> 64;
    v369 = (long long)a1[56] * (long long)a1[40];
    v370 = v363 + v369;
    v371 = arm64g_calculate_condition(50, v363, v369, 0);
    if (v371 & 1)
        v372 = v368;
    else
        v372 = v368 + 1;
    v373 = v366 + v372;
    v374 = arm64g_calculate_condition(50, v366, v372, 0);
    v375 = arm64g_calculate_condition(50, v370, v369, 0);
    if (v375 & 1)
        v376 = v368;
    else
        v376 = v368 + 1;
    v377 = v373 + v376;
    v378 = arm64g_calculate_flag_c(2, v373, v376, 0);
    v379 = !(v374 & 1) + !(v367 & 1) + v378;
    *(unsigned long *)&a0[96] = v370 + v369;
    v380 = (unsigned long long)((long long)a1[48] * (long long)a1[56]) >> 64;
    v381 = (long long)a1[56] * (long long)a1[48];
    v382 = v377 + v381;
    v383 = arm64g_calculate_condition(50, v377, v381, 0);
    if (v383 & 1)
        v384 = v380;
    else
        v384 = v380 + 1;
    v385 = arm64g_calculate_condition(50, v382, v381, 0);
    if (v385 & 1)
        v386 = v380;
    else
        v386 = v380 + 1;
    v387 = v379 + v384;
    *(unsigned long *)&a0[104] = v382 + v381;
    v388 = (long long)a1[56];
    v389 = v388 * v388 >> 64;
    v390 = arm64g_calculate_condition(50, v379, v384, 0);
    if (!(v390 & 1))
        v389 += 1;
    v391 = v387 + v386;
    v392 = arm64g_calculate_condition(50, v387, v386, 0);
    v393 = v388 * v388;
    v394 = arm64g_calculate_flag_c(2, v391, v393, 0);
    *(unsigned long *)&a0[112] = v391 + v393;
    *(unsigned long *)&a0[120] = v389 + !(v392 & 1) + v394;
    return a0;
}
