/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac1b80..0xac2360 (2016 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern uint128_t g_df8380;

double sub_ac1b80(uint128_t *a0, uint128_t *a1, unsigned long long i)
{
    unsigned long long v3;  // x30
    uint128_t *v4;  // x1
    __m128i v13;  // q18
    uint128_t v103;  // 4453
    uint128_t v104;  // q7
    __m128i v105;  // 4466
    __m128i v106;  // q2
    __m128i v107;  // 4476
    __m128i v108;  // q22
    __m128i v109;  // q1
    __m128i v110;  // 4487
    __m128i v111;  // q2
    uint128_t *v112;  // x3
    __m128i v14;  // q19
    __m128i v113;  // q25
    uint128_t v114;  // q5
    uint128_t v115;  // q6
    uint128_t v116;  // 4509
    uint128_t v117;  // q7
    __m128i v118;  // 4108
    __m128i v119;  // q4
    __m128i v120;  // 4118
    __m128i v121;  // q23
    __m128i v122;  // q0
    __m128i v15;  // q20
    __m128i v123;  // 4129
    __m128i v124;  // q4
    uint128_t *v125;  // x3
    __m128i v126;  // q24
    uint128_t v127;  // q5
    uint128_t v128;  // q6
    uint128_t v129;  // 4151
    uint128_t v130;  // q7
    __m128i v131;  // 4164
    __m128i v132;  // q1
    __m128i v16;  // q21
    __m128i v133;  // 4174
    __m128i v134;  // q16
    __m128i v135;  // q3
    __m128i v136;  // 4185
    __m128i v137;  // q1
    uint128_t *v138;  // x3
    __m128i v139;  // q25
    uint128_t v140;  // q5
    uint128_t v141;  // q6
    uint128_t v142;  // 4207
    __m128i v17;  // q22
    uint128_t v143;  // q7
    __m128i v144;  // 4220
    __m128i v145;  // q0
    __m128i v146;  // 4230
    __m128i v147;  // q17
    __m128i v148;  // q2
    __m128i v149;  // 4241
    __m128i v150;  // q0
    uint128_t *v151;  // x3
    __m128i v152;  // q24
    __m128i v18;  // q23
    uint128_t v153;  // q5
    uint128_t v154;  // q6
    uint128_t v155;  // 4263
    uint128_t v156;  // q7
    __m128i v157;  // 4276
    __m128i v158;  // q3
    __m128i v159;  // 4286
    __m128i v160;  // q18
    __m128i v161;  // q4
    __m128i v162;  // 4297
    uint128_t *v19;  // x3
    __m128i v163;  // q3
    uint128_t *v164;  // x3
    __m128i v165;  // q25
    uint128_t v166;  // q5
    uint128_t v167;  // q6
    uint128_t v168;  // 4319
    uint128_t v169;  // q7
    __m128i v170;  // 4332
    __m128i v171;  // q2
    __m128i v172;  // 4342
    unsigned long long v20;  // x2
    __m128i v173;  // q19
    __m128i v174;  // q1
    __m128i v175;  // 4353
    __m128i v176;  // q2
    uint128_t *v177;  // x3
    __m128i v178;  // q24
    uint128_t v179;  // q5
    uint128_t v180;  // q6
    uint128_t v181;  // 4375
    uint128_t v182;  // q7
    uint128_t *v21;  // x3
    __m128i v183;  // 4388
    __m128i v184;  // q4
    __m128i v185;  // 4398
    __m128i v186;  // q20
    __m128i v187;  // q0
    __m128i v188;  // 4409
    __m128i v189;  // q4
    uint128_t *v190;  // x3
    __m128i v191;  // q25
    uint128_t v192;  // q5
    __m128i v22;  // q24
    uint128_t v193;  // q6
    uint128_t v194;  // 4431
    uint128_t v195;  // q7
    __m128i v196;  // 4444
    __m128i v197;  // q1
    __m128i v198;  // 4454
    __m128i v199;  // q21
    __m128i v200;  // q3
    __m128i v201;  // 4465
    __m128i v202;  // q1
    uint128_t *v5;  // x1
    uint128_t v23;  // q5
    uint128_t *v203;  // x3
    __m128i v204;  // q24
    uint128_t v205;  // q5
    uint128_t v206;  // q6
    uint128_t v207;  // 4487
    uint128_t v208;  // q7
    __m128i v209;  // 4500
    __m128i v210;  // q0
    __m128i v211;  // 4510
    __m128i v212;  // q22
    uint128_t v24;  // q6
    __m128i v213;  // q2
    __m128i v214;  // 4521
    __m128i v215;  // q0
    uint128_t *v216;  // x3
    __m128i v217;  // q25
    uint128_t v218;  // q5
    uint128_t v219;  // q6
    uint128_t v220;  // 4543
    uint128_t v221;  // q7
    __m128i v222;  // 4556
    uint128_t v25;  // 4117
    __m128i v223;  // q3
    __m128i v224;  // 4566
    __m128i v225;  // q23
    __m128i v226;  // q4
    __m128i v227;  // 4106
    __m128i v228;  // q3
    uint128_t *v229;  // x3
    __m128i v230;  // q24
    uint128_t v231;  // q5
    uint128_t v232;  // q6
    uint128_t v26;  // q7
    uint128_t v233;  // 4128
    uint128_t v234;  // q7
    __m128i v235;  // 4141
    __m128i v236;  // q2
    __m128i v237;  // 4151
    __m128i v238;  // q16
    __m128i v239;  // q1
    __m128i v240;  // 4162
    __m128i v241;  // q2
    uint128_t *v242;  // x3
    __m128i v27;  // 4130
    __m128i v243;  // q25
    uint128_t v244;  // q5
    uint128_t v245;  // q6
    uint128_t v246;  // 4184
    uint128_t v247;  // q7
    __m128i v248;  // 4197
    __m128i v249;  // q4
    __m128i v250;  // 4207
    __m128i v251;  // q17
    __m128i v252;  // q0
    __m128i v28;  // q3
    __m128i v253;  // 4218
    __m128i v254;  // q4
    uint128_t *v255;  // x3
    __m128i v256;  // q24
    uint128_t v257;  // q5
    uint128_t v258;  // q6
    uint128_t v259;  // 4240
    uint128_t v260;  // q7
    __m128i v261;  // 4253
    __m128i v262;  // q1
    __m128i v29;  // 4140
    __m128i v263;  // 4263
    __m128i v264;  // q18
    __m128i v265;  // q3
    __m128i v266;  // 4274
    __m128i v267;  // q1
    uint128_t *v268;  // x3
    __m128i v269;  // q25
    uint128_t v270;  // q5
    uint128_t v271;  // q6
    uint128_t v272;  // 4296
    __m128i v30;  // q16
    uint128_t v273;  // q7
    __m128i v274;  // 4309
    __m128i v275;  // q0
    __m128i v276;  // 4319
    __m128i v277;  // q19
    __m128i v278;  // q2
    __m128i v279;  // 4330
    __m128i v280;  // q0
    uint128_t *v281;  // x3
    __m128i v282;  // q24
    __m128i v31;  // q4
    uint128_t v283;  // q5
    uint128_t v284;  // q6
    uint128_t v285;  // 4352
    uint128_t v286;  // q7
    __m128i v287;  // 4365
    __m128i v288;  // q3
    __m128i v289;  // 4375
    __m128i v290;  // q20
    __m128i v291;  // q4
    __m128i v292;  // 4386
    __m128i v32;  // 4151
    __m128i v293;  // q3
    uint128_t *v294;  // x3
    __m128i v295;  // q25
    uint128_t v296;  // q5
    uint128_t v297;  // q6
    uint128_t v298;  // 4408
    uint128_t v299;  // q7
    __m128i v300;  // 4421
    __m128i v301;  // q2
    __m128i v302;  // 4431
    __m128i v6;  // q3
    __m128i v33;  // q3
    __m128i v303;  // q21
    __m128i v304;  // q1
    __m128i v305;  // 4442
    __m128i v306;  // q2
    uint128_t *v307;  // x3
    __m128i v308;  // q24
    uint128_t v309;  // q5
    uint128_t v310;  // q6
    uint128_t v311;  // 4464
    uint128_t v312;  // q7
    uint128_t *v34;  // x3
    __m128i v313;  // 4477
    __m128i v314;  // q4
    __m128i v315;  // 4487
    __m128i v316;  // q22
    __m128i v317;  // q0
    __m128i v318;  // 4498
    __m128i v319;  // q4
    uint128_t *v320;  // x3
    __m128i v321;  // q25
    uint128_t v322;  // q5
    __m128i v35;  // q25
    uint128_t v323;  // q6
    uint128_t v324;  // 4520
    uint128_t v325;  // q7
    __m128i v326;  // 4533
    __m128i v327;  // q1
    __m128i v328;  // 4543
    __m128i v329;  // q23
    __m128i v330;  // q3
    __m128i v331;  // 4554
    __m128i v332;  // q1
    uint128_t v36;  // q5
    uint128_t *v333;  // x3
    __m128i v334;  // q24
    uint128_t v335;  // q5
    uint128_t v336;  // q6
    uint128_t v337;  // 4116
    uint128_t v338;  // q7
    __m128i v339;  // 4129
    __m128i v340;  // q0
    __m128i v341;  // 4139
    __m128i v342;  // q16
    uint128_t v37;  // q6
    __m128i v343;  // q2
    __m128i v344;  // 4150
    __m128i v345;  // q0
    uint128_t *v346;  // x3
    __m128i v347;  // q25
    uint128_t v348;  // q5
    uint128_t v349;  // q6
    uint128_t v350;  // 4172
    uint128_t v351;  // q7
    __m128i v352;  // 4185
    uint128_t v38;  // 4173
    __m128i v353;  // q3
    __m128i v354;  // 4195
    __m128i v355;  // q17
    __m128i v356;  // q4
    __m128i v357;  // 4206
    __m128i v358;  // q3
    uint128_t *v359;  // x3
    __m128i v360;  // q24
    uint128_t v361;  // q5
    uint128_t v362;  // q6
    uint128_t v39;  // q7
    uint128_t v363;  // 4228
    uint128_t v364;  // q7
    __m128i v365;  // 4241
    __m128i v366;  // q2
    __m128i v367;  // 4251
    __m128i v368;  // q18
    __m128i v369;  // q1
    __m128i v370;  // 4262
    __m128i v371;  // q2
    uint128_t *v372;  // x3
    __m128i v40;  // 4186
    __m128i v373;  // q25
    uint128_t v374;  // q5
    uint128_t v375;  // q6
    uint128_t v376;  // 4284
    uint128_t v377;  // q7
    __m128i v378;  // 4297
    __m128i v379;  // q4
    __m128i v380;  // 4307
    __m128i v381;  // q19
    __m128i v382;  // q0
    __m128i v41;  // q2
    __m128i v383;  // 4318
    __m128i v384;  // q4
    uint128_t *v385;  // x3
    __m128i v386;  // q24
    uint128_t v387;  // q5
    uint128_t v388;  // q6
    uint128_t v389;  // 4340
    uint128_t v390;  // q7
    __m128i v391;  // 4353
    __m128i v392;  // q1
    __m128i v42;  // 4196
    __m128i v393;  // 4363
    __m128i v394;  // q20
    __m128i v395;  // q3
    __m128i v396;  // 4374
    __m128i v397;  // q1
    uint128_t *v398;  // x3
    __m128i v399;  // q25
    uint128_t v400;  // q5
    uint128_t v401;  // q6
    uint128_t v402;  // 4396
    __m128i v7;  // q2
    __m128i v43;  // q17
    uint128_t v403;  // q7
    __m128i v404;  // 4409
    __m128i v405;  // q0
    __m128i v406;  // 4419
    __m128i v407;  // q21
    __m128i v408;  // q2
    __m128i v409;  // 4430
    __m128i v410;  // q0
    uint128_t *v411;  // x3
    __m128i v412;  // q24
    __m128i v44;  // q1
    uint128_t v413;  // q5
    uint128_t v414;  // q6
    uint128_t v415;  // 4452
    uint128_t v416;  // q7
    __m128i v417;  // 4465
    __m128i v418;  // q3
    __m128i v419;  // 4475
    __m128i v420;  // q22
    __m128i v421;  // q4
    __m128i v422;  // 4486
    __m128i v45;  // 4207
    __m128i v423;  // q3
    uint128_t *v424;  // x3
    __m128i v425;  // q25
    uint128_t v426;  // q5
    uint128_t v427;  // q6
    uint128_t v428;  // 4508
    uint128_t v429;  // q7
    __m128i v430;  // 4521
    __m128i v431;  // q2
    __m128i v432;  // 4531
    __m128i v46;  // q2
    __m128i v433;  // q1
    __m128i v434;  // 4542
    __m128i v435;  // q2
    uint128_t *v436;  // x3
    uint128_t *v437;  // x1
    __m128i v438;  // q24
    uint128_t v439;  // q5
    uint128_t v440;  // q6
    __m128i v441;  // 4112
    __m128i v442;  // q4
    uint128_t *v47;  // x3
    __m128i v443;  // q0
    __m128i v444;  // 4124
    __m128i v445;  // q4
    uint128_t *v446;  // x3
    uint128_t *v447;  // x1
    __m128i v448;  // q25
    uint128_t v449;  // q5
    uint128_t v450;  // q6
    __m128i v451;  // 4153
    __m128i v452;  // q1
    __m128i v48;  // q24
    __m128i v453;  // q3
    __m128i v454;  // 4165
    __m128i v455;  // q1
    uint128_t *v456;  // x3
    uint128_t *v457;  // x1
    __m128i v458;  // q24
    uint128_t v459;  // q5
    uint128_t v460;  // q6
    __m128i v461;  // 4194
    __m128i v462;  // q0
    uint128_t v49;  // q5
    __m128i v463;  // q2
    __m128i v464;  // 4206
    __m128i v465;  // q0
    uint128_t *v466;  // x3
    uint128_t *v467;  // x1
    __m128i v468;  // q25
    uint128_t v469;  // q5
    uint128_t v470;  // q6
    __m128i v471;  // 4235
    __m128i v472;  // q3
    uint128_t v50;  // q6
    __m128i v473;  // q4
    __m128i v474;  // 4247
    __m128i v475;  // q3
    uint128_t *v476;  // x3
    uint128_t *v477;  // x1
    __m128i v478;  // q24
    uint128_t v479;  // q5
    uint128_t v480;  // q6
    __m128i v481;  // 4276
    __m128i v482;  // q2
    uint128_t v51;  // 4229
    __m128i v483;  // q1
    __m128i v484;  // 4288
    __m128i v485;  // q2
    uint128_t *v486;  // x3
    uint128_t *v487;  // x1
    __m128i v488;  // q25
    uint128_t v489;  // q5
    uint128_t v490;  // q6
    __m128i v491;  // 4317
    __m128i v492;  // q4
    uint128_t v52;  // q7
    __m128i v493;  // q0
    __m128i v494;  // 4329
    __m128i v495;  // q4
    uint128_t *v496;  // x1
    __m128i v497;  // q24
    uint128_t v498;  // q5
    uint128_t v499;  // q6
    __m128i v500;  // 4358
    __m128i v501;  // q1
    __m128i v502;  // q3
    __m128i v8;  // q1
    __m128i v53;  // 4242
    __m128i v503;  // 4370
    __m128i v504;  // q1
    __m128i v505;  // q25
    uint128_t v506;  // q5
    uint128_t v507;  // q6
    __m128i v508;  // 4398
    __m128i v509;  // q0
    __m128i v510;  // 4410
    __m128i v54;  // q4
    __m128i v55;  // 4252
    __m128i v56;  // q18
    __m128i v57;  // q0
    __m128i v58;  // 4263
    __m128i v59;  // q4
    uint128_t *v60;  // x3
    __m128i v61;  // q25
    uint128_t v62;  // q5
    __m128i v9;  // q0
    uint128_t v63;  // q6
    uint128_t v64;  // 4285
    uint128_t v65;  // q7
    __m128i v66;  // 4298
    __m128i v67;  // q1
    __m128i v68;  // 4308
    __m128i v69;  // q19
    __m128i v70;  // q3
    __m128i v71;  // 4319
    __m128i v72;  // q1
    uint128_t *v10;  // x3
    uint128_t *v73;  // x3
    __m128i v74;  // q24
    uint128_t v75;  // q5
    uint128_t v76;  // q6
    uint128_t v77;  // 4341
    uint128_t v78;  // q7
    __m128i v79;  // 4354
    __m128i v80;  // q0
    __m128i v81;  // 4364
    __m128i v82;  // q20
    __m128i v11;  // q16
    __m128i v83;  // q2
    __m128i v84;  // 4375
    __m128i v85;  // q0
    uint128_t *v86;  // x3
    __m128i v87;  // q25
    uint128_t v88;  // q5
    uint128_t v89;  // q6
    uint128_t v90;  // 4397
    uint128_t v91;  // q7
    __m128i v92;  // 4410
    __m128i v12;  // q17
    __m128i v93;  // q3
    __m128i v94;  // 4420
    __m128i v95;  // q21
    __m128i v96;  // q4
    __m128i v97;  // 4431
    __m128i v98;  // q3
    uint128_t *v99;  // x3
    __m128i v100;  // q24
    uint128_t v101;  // q5
    uint128_t v102;  // q6
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = a1 + 4;
    v5 = v4 + 4;
    v6 = a0[3];
    v7 = a0[2];
    v8 = a0[1];
    v9 = *a0;
    v10 = &g_df8380;
    v11 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*a1);
    v12 = __dirty_unsupported_Iop_Reverse8sIn64_x2(a1[1]);
    v13 = __dirty_unsupported_Iop_Reverse8sIn64_x2(a1[2]);
    v14 = __dirty_unsupported_Iop_Reverse8sIn64_x2(a1[3]);
    v15 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v4);
    v16 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v4[1]);
    v17 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v4[2]);
    v18 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v4[3]);
    do
    {
        v19 = v10 + 1;
        v20 = i - 1;
        if (i == 1)
            v5 = (char *)v5 - 128;
        v21 = v19 + 1;
        v22 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v10, v11), _mm_add_epi64(*v10, v11), 8);
        v23 = __dirty_unsupported_Iop_SliceV128(v6, v7, 8);
        v24 = __dirty_unsupported_Iop_SliceV128(v7, v8, 8);
        v25 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v11, 1), _mm_cvtsi128_si64(v11), 0, _mm_cvtsi128_si64(v12));
        v26 = __dirty_unsupported_Iop_SliceV128(v16, v15, 8);
        v27 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v6, v22), 1), _mm_cvtsi128_si64(v6) + _mm_cvtsi128_si64(v22), (unsigned long long)(v23 >> 64), (unsigned long long)v23, (unsigned long long)(v24 >> 64), (unsigned long long)v24);
        v28 = v27;
        v29 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v25 >> 64), (unsigned long long)v25, _mm_extract_epi64(v18, 1), _mm_cvtsi128_si64(v18), (unsigned long long)(v26 >> 64), (unsigned long long)v26);
        v30 = v29;
        v31 = _mm_add_epi64(v8, v28);
        v32 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v28, 1), _mm_cvtsi128_si64(v28), 0, _mm_cvtsi128_si64(v8), _mm_extract_epi64(v9, 1), _mm_cvtsi128_si64(v9));
        v33 = v32;
        v34 = v21 + 1;
        v35 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v19, v12), _mm_add_epi64(*v19, v12), 8);
        v36 = __dirty_unsupported_Iop_SliceV128(v7, v31, 8);
        v37 = __dirty_unsupported_Iop_SliceV128(v31, v9, 8);
        v38 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v12, 1), _mm_cvtsi128_si64(v12), 0, _mm_cvtsi128_si64(v13));
        v39 = __dirty_unsupported_Iop_SliceV128(v17, v16, 8);
        v40 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v7, v35), 1), _mm_cvtsi128_si64(v7) + _mm_cvtsi128_si64(v35), (unsigned long long)(v36 >> 64), (unsigned long long)v36, (unsigned long long)(v37 >> 64), (unsigned long long)v37);
        v41 = v40;
        v42 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v38 >> 64), (unsigned long long)v38, _mm_extract_epi64(v30, 1), _mm_cvtsi128_si64(v30), (unsigned long long)(v39 >> 64), (unsigned long long)v39);
        v43 = v42;
        v44 = _mm_add_epi64(v9, v41);
        v45 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v41, 1), _mm_cvtsi128_si64(v41), 0, _mm_cvtsi128_si64(v9), _mm_extract_epi64(v33, 1), _mm_cvtsi128_si64(v33));
        v46 = v45;
        v47 = v34 + 1;
        v48 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v21, v13), _mm_add_epi64(*v21, v13), 8);
        v49 = __dirty_unsupported_Iop_SliceV128(v31, v44, 8);
        v50 = __dirty_unsupported_Iop_SliceV128(v44, v33, 8);
        v51 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v13, 1), _mm_cvtsi128_si64(v13), 0, _mm_cvtsi128_si64(v14));
        v52 = __dirty_unsupported_Iop_SliceV128(v18, v17, 8);
        v53 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v31, v48), 1), _mm_cvtsi128_si64(v31) + _mm_cvtsi128_si64(v48), (unsigned long long)(v49 >> 64), (unsigned long long)v49, (unsigned long long)(v50 >> 64), (unsigned long long)v50);
        v54 = v53;
        v55 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v51 >> 64), (unsigned long long)v51, _mm_extract_epi64(v43, 1), _mm_cvtsi128_si64(v43), (unsigned long long)(v52 >> 64), (unsigned long long)v52);
        v56 = v55;
        v57 = _mm_add_epi64(v33, v54);
        v58 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v54, 1), _mm_cvtsi128_si64(v54), 0, _mm_cvtsi128_si64(v33), _mm_extract_epi64(v46, 1), _mm_cvtsi128_si64(v46));
        v59 = v58;
        v60 = v47 + 1;
        v61 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v34, v14), _mm_add_epi64(*v34, v14), 8);
        v62 = __dirty_unsupported_Iop_SliceV128(v44, v57, 8);
        v63 = __dirty_unsupported_Iop_SliceV128(v57, v46, 8);
        v64 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v14, 1), _mm_cvtsi128_si64(v14), 0, _mm_cvtsi128_si64(v15));
        v65 = __dirty_unsupported_Iop_SliceV128(v30, v18, 8);
        v66 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v44, v61), 1), _mm_cvtsi128_si64(v44) + _mm_cvtsi128_si64(v61), (unsigned long long)(v62 >> 64), (unsigned long long)v62, (unsigned long long)(v63 >> 64), (unsigned long long)v63);
        v67 = v66;
        v68 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v64 >> 64), (unsigned long long)v64, _mm_extract_epi64(v56, 1), _mm_cvtsi128_si64(v56), (unsigned long long)(v65 >> 64), (unsigned long long)v65);
        v69 = v68;
        v70 = _mm_add_epi64(v46, v67);
        v71 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v67, 1), _mm_cvtsi128_si64(v67), 0, _mm_cvtsi128_si64(v46), _mm_extract_epi64(v59, 1), _mm_cvtsi128_si64(v59));
        v72 = v71;
        v73 = v60 + 1;
        v74 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v47, v15), _mm_add_epi64(*v47, v15), 8);
        v75 = __dirty_unsupported_Iop_SliceV128(v57, v70, 8);
        v76 = __dirty_unsupported_Iop_SliceV128(v70, v59, 8);
        v77 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v15, 1), _mm_cvtsi128_si64(v15), 0, _mm_cvtsi128_si64(v16));
        v78 = __dirty_unsupported_Iop_SliceV128(v43, v30, 8);
        v79 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v57, v74), 1), _mm_cvtsi128_si64(v57) + _mm_cvtsi128_si64(v74), (unsigned long long)(v75 >> 64), (unsigned long long)v75, (unsigned long long)(v76 >> 64), (unsigned long long)v76);
        v80 = v79;
        v81 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v77 >> 64), (unsigned long long)v77, _mm_extract_epi64(v69, 1), _mm_cvtsi128_si64(v69), (unsigned long long)(v78 >> 64), (unsigned long long)v78);
        v82 = v81;
        v83 = _mm_add_epi64(v59, v80);
        v84 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v80, 1), _mm_cvtsi128_si64(v80), 0, _mm_cvtsi128_si64(v59), _mm_extract_epi64(v72, 1), _mm_cvtsi128_si64(v72));
        v85 = v84;
        v86 = v73 + 1;
        v87 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v60, v16), _mm_add_epi64(*v60, v16), 8);
        v88 = __dirty_unsupported_Iop_SliceV128(v70, v83, 8);
        v89 = __dirty_unsupported_Iop_SliceV128(v83, v72, 8);
        v90 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v16, 1), _mm_cvtsi128_si64(v16), 0, _mm_cvtsi128_si64(v17));
        v91 = __dirty_unsupported_Iop_SliceV128(v56, v43, 8);
        v92 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v70, v87), 1), _mm_cvtsi128_si64(v70) + _mm_cvtsi128_si64(v87), (unsigned long long)(v88 >> 64), (unsigned long long)v88, (unsigned long long)(v89 >> 64), (unsigned long long)v89);
        v93 = v92;
        v94 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v90 >> 64), (unsigned long long)v90, _mm_extract_epi64(v82, 1), _mm_cvtsi128_si64(v82), (unsigned long long)(v91 >> 64), (unsigned long long)v91);
        v95 = v94;
        v96 = _mm_add_epi64(v72, v93);
        v97 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v93, 1), _mm_cvtsi128_si64(v93), 0, _mm_cvtsi128_si64(v72), _mm_extract_epi64(v85, 1), _mm_cvtsi128_si64(v85));
        v98 = v97;
        v99 = v86 + 1;
        v100 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v73, v17), _mm_add_epi64(*v73, v17), 8);
        v101 = __dirty_unsupported_Iop_SliceV128(v83, v96, 8);
        v102 = __dirty_unsupported_Iop_SliceV128(v96, v85, 8);
        v103 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v17, 1), _mm_cvtsi128_si64(v17), 0, _mm_cvtsi128_si64(v18));
        v104 = __dirty_unsupported_Iop_SliceV128(v69, v56, 8);
        v105 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v83, v100), 1), _mm_cvtsi128_si64(v83) + _mm_cvtsi128_si64(v100), (unsigned long long)(v101 >> 64), (unsigned long long)v101, (unsigned long long)(v102 >> 64), (unsigned long long)v102);
        v106 = v105;
        v107 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v103 >> 64), (unsigned long long)v103, _mm_extract_epi64(v95, 1), _mm_cvtsi128_si64(v95), (unsigned long long)(v104 >> 64), (unsigned long long)v104);
        v108 = v107;
        v109 = _mm_add_epi64(v85, v106);
        v110 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v106, 1), _mm_cvtsi128_si64(v106), 0, _mm_cvtsi128_si64(v85), _mm_extract_epi64(v98, 1), _mm_cvtsi128_si64(v98));
        v111 = v110;
        v112 = v99 + 1;
        v113 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v86, v18), _mm_add_epi64(*v86, v18), 8);
        v114 = __dirty_unsupported_Iop_SliceV128(v96, v109, 8);
        v115 = __dirty_unsupported_Iop_SliceV128(v109, v98, 8);
        v116 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v18, 1), _mm_cvtsi128_si64(v18), 0, _mm_cvtsi128_si64(v30));
        v117 = __dirty_unsupported_Iop_SliceV128(v82, v69, 8);
        v118 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v96, v113), 1), _mm_cvtsi128_si64(v96) + _mm_cvtsi128_si64(v113), (unsigned long long)(v114 >> 64), (unsigned long long)v114, (unsigned long long)(v115 >> 64), (unsigned long long)v115);
        v119 = v118;
        v120 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v116 >> 64), (unsigned long long)v116, _mm_extract_epi64(v108, 1), _mm_cvtsi128_si64(v108), (unsigned long long)(v117 >> 64), (unsigned long long)v117);
        v121 = v120;
        v122 = _mm_add_epi64(v98, v119);
        v123 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v119, 1), _mm_cvtsi128_si64(v119), 0, _mm_cvtsi128_si64(v98), _mm_extract_epi64(v111, 1), _mm_cvtsi128_si64(v111));
        v124 = v123;
        v125 = v112 + 1;
        v126 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v99, v30), _mm_add_epi64(*v99, v30), 8);
        v127 = __dirty_unsupported_Iop_SliceV128(v109, v122, 8);
        v128 = __dirty_unsupported_Iop_SliceV128(v122, v111, 8);
        v129 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v30, 1), _mm_cvtsi128_si64(v30), 0, _mm_cvtsi128_si64(v43));
        v130 = __dirty_unsupported_Iop_SliceV128(v95, v82, 8);
        v131 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v109, v126), 1), _mm_cvtsi128_si64(v109) + _mm_cvtsi128_si64(v126), (unsigned long long)(v127 >> 64), (unsigned long long)v127, (unsigned long long)(v128 >> 64), (unsigned long long)v128);
        v132 = v131;
        v133 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v129 >> 64), (unsigned long long)v129, _mm_extract_epi64(v121, 1), _mm_cvtsi128_si64(v121), (unsigned long long)(v130 >> 64), (unsigned long long)v130);
        v134 = v133;
        v135 = _mm_add_epi64(v111, v132);
        v136 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v132, 1), _mm_cvtsi128_si64(v132), 0, _mm_cvtsi128_si64(v111), _mm_extract_epi64(v124, 1), _mm_cvtsi128_si64(v124));
        v137 = v136;
        v138 = v125 + 1;
        v139 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v112, v43), _mm_add_epi64(*v112, v43), 8);
        v140 = __dirty_unsupported_Iop_SliceV128(v122, v135, 8);
        v141 = __dirty_unsupported_Iop_SliceV128(v135, v124, 8);
        v142 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v43, 1), _mm_cvtsi128_si64(v43), 0, _mm_cvtsi128_si64(v56));
        v143 = __dirty_unsupported_Iop_SliceV128(v108, v95, 8);
        v144 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v122, v139), 1), _mm_cvtsi128_si64(v122) + _mm_cvtsi128_si64(v139), (unsigned long long)(v140 >> 64), (unsigned long long)v140, (unsigned long long)(v141 >> 64), (unsigned long long)v141);
        v145 = v144;
        v146 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v142 >> 64), (unsigned long long)v142, _mm_extract_epi64(v134, 1), _mm_cvtsi128_si64(v134), (unsigned long long)(v143 >> 64), (unsigned long long)v143);
        v147 = v146;
        v148 = _mm_add_epi64(v124, v145);
        v149 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v145, 1), _mm_cvtsi128_si64(v145), 0, _mm_cvtsi128_si64(v124), _mm_extract_epi64(v137, 1), _mm_cvtsi128_si64(v137));
        v150 = v149;
        v151 = v138 + 1;
        v152 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v125, v56), _mm_add_epi64(*v125, v56), 8);
        v153 = __dirty_unsupported_Iop_SliceV128(v135, v148, 8);
        v154 = __dirty_unsupported_Iop_SliceV128(v148, v137, 8);
        v155 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v56, 1), _mm_cvtsi128_si64(v56), 0, _mm_cvtsi128_si64(v69));
        v156 = __dirty_unsupported_Iop_SliceV128(v121, v108, 8);
        v157 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v135, v152), 1), _mm_cvtsi128_si64(v135) + _mm_cvtsi128_si64(v152), (unsigned long long)(v153 >> 64), (unsigned long long)v153, (unsigned long long)(v154 >> 64), (unsigned long long)v154);
        v158 = v157;
        v159 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v155 >> 64), (unsigned long long)v155, _mm_extract_epi64(v147, 1), _mm_cvtsi128_si64(v147), (unsigned long long)(v156 >> 64), (unsigned long long)v156);
        v160 = v159;
        v161 = _mm_add_epi64(v137, v158);
        v162 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v158, 1), _mm_cvtsi128_si64(v158), 0, _mm_cvtsi128_si64(v137), _mm_extract_epi64(v150, 1), _mm_cvtsi128_si64(v150));
        v163 = v162;
        v164 = v151 + 1;
        v165 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v138, v69), _mm_add_epi64(*v138, v69), 8);
        v166 = __dirty_unsupported_Iop_SliceV128(v148, v161, 8);
        v167 = __dirty_unsupported_Iop_SliceV128(v161, v150, 8);
        v168 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v69, 1), _mm_cvtsi128_si64(v69), 0, _mm_cvtsi128_si64(v82));
        v169 = __dirty_unsupported_Iop_SliceV128(v134, v121, 8);
        v170 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v148, v165), 1), _mm_cvtsi128_si64(v148) + _mm_cvtsi128_si64(v165), (unsigned long long)(v166 >> 64), (unsigned long long)v166, (unsigned long long)(v167 >> 64), (unsigned long long)v167);
        v171 = v170;
        v172 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v168 >> 64), (unsigned long long)v168, _mm_extract_epi64(v160, 1), _mm_cvtsi128_si64(v160), (unsigned long long)(v169 >> 64), (unsigned long long)v169);
        v173 = v172;
        v174 = _mm_add_epi64(v150, v171);
        v175 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v171, 1), _mm_cvtsi128_si64(v171), 0, _mm_cvtsi128_si64(v150), _mm_extract_epi64(v163, 1), _mm_cvtsi128_si64(v163));
        v176 = v175;
        v177 = v164 + 1;
        v178 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v151, v82), _mm_add_epi64(*v151, v82), 8);
        v179 = __dirty_unsupported_Iop_SliceV128(v161, v174, 8);
        v180 = __dirty_unsupported_Iop_SliceV128(v174, v163, 8);
        v181 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v82, 1), _mm_cvtsi128_si64(v82), 0, _mm_cvtsi128_si64(v95));
        v182 = __dirty_unsupported_Iop_SliceV128(v147, v134, 8);
        v183 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v161, v178), 1), _mm_cvtsi128_si64(v161) + _mm_cvtsi128_si64(v178), (unsigned long long)(v179 >> 64), (unsigned long long)v179, (unsigned long long)(v180 >> 64), (unsigned long long)v180);
        v184 = v183;
        v185 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v181 >> 64), (unsigned long long)v181, _mm_extract_epi64(v173, 1), _mm_cvtsi128_si64(v173), (unsigned long long)(v182 >> 64), (unsigned long long)v182);
        v186 = v185;
        v187 = _mm_add_epi64(v163, v184);
        v188 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v184, 1), _mm_cvtsi128_si64(v184), 0, _mm_cvtsi128_si64(v163), _mm_extract_epi64(v176, 1), _mm_cvtsi128_si64(v176));
        v189 = v188;
        v190 = v177 + 1;
        v191 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v164, v95), _mm_add_epi64(*v164, v95), 8);
        v192 = __dirty_unsupported_Iop_SliceV128(v174, v187, 8);
        v193 = __dirty_unsupported_Iop_SliceV128(v187, v176, 8);
        v194 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v95, 1), _mm_cvtsi128_si64(v95), 0, _mm_cvtsi128_si64(v108));
        v195 = __dirty_unsupported_Iop_SliceV128(v160, v147, 8);
        v196 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v174, v191), 1), _mm_cvtsi128_si64(v174) + _mm_cvtsi128_si64(v191), (unsigned long long)(v192 >> 64), (unsigned long long)v192, (unsigned long long)(v193 >> 64), (unsigned long long)v193);
        v197 = v196;
        v198 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v194 >> 64), (unsigned long long)v194, _mm_extract_epi64(v186, 1), _mm_cvtsi128_si64(v186), (unsigned long long)(v195 >> 64), (unsigned long long)v195);
        v199 = v198;
        v200 = _mm_add_epi64(v176, v197);
        v201 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v197, 1), _mm_cvtsi128_si64(v197), 0, _mm_cvtsi128_si64(v176), _mm_extract_epi64(v189, 1), _mm_cvtsi128_si64(v189));
        v202 = v201;
        v203 = v190 + 1;
        v204 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v177, v108), _mm_add_epi64(*v177, v108), 8);
        v205 = __dirty_unsupported_Iop_SliceV128(v187, v200, 8);
        v206 = __dirty_unsupported_Iop_SliceV128(v200, v189, 8);
        v207 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v108, 1), _mm_cvtsi128_si64(v108), 0, _mm_cvtsi128_si64(v121));
        v208 = __dirty_unsupported_Iop_SliceV128(v173, v160, 8);
        v209 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v187, v204), 1), _mm_cvtsi128_si64(v187) + _mm_cvtsi128_si64(v204), (unsigned long long)(v205 >> 64), (unsigned long long)v205, (unsigned long long)(v206 >> 64), (unsigned long long)v206);
        v210 = v209;
        v211 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v207 >> 64), (unsigned long long)v207, _mm_extract_epi64(v199, 1), _mm_cvtsi128_si64(v199), (unsigned long long)(v208 >> 64), (unsigned long long)v208);
        v212 = v211;
        v213 = _mm_add_epi64(v189, v210);
        v214 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v210, 1), _mm_cvtsi128_si64(v210), 0, _mm_cvtsi128_si64(v189), _mm_extract_epi64(v202, 1), _mm_cvtsi128_si64(v202));
        v215 = v214;
        v216 = v203 + 1;
        v217 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v190, v121), _mm_add_epi64(*v190, v121), 8);
        v218 = __dirty_unsupported_Iop_SliceV128(v200, v213, 8);
        v219 = __dirty_unsupported_Iop_SliceV128(v213, v202, 8);
        v220 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v121, 1), _mm_cvtsi128_si64(v121), 0, _mm_cvtsi128_si64(v134));
        v221 = __dirty_unsupported_Iop_SliceV128(v186, v173, 8);
        v222 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v200, v217), 1), _mm_cvtsi128_si64(v200) + _mm_cvtsi128_si64(v217), (unsigned long long)(v218 >> 64), (unsigned long long)v218, (unsigned long long)(v219 >> 64), (unsigned long long)v219);
        v223 = v222;
        v224 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v220 >> 64), (unsigned long long)v220, _mm_extract_epi64(v212, 1), _mm_cvtsi128_si64(v212), (unsigned long long)(v221 >> 64), (unsigned long long)v221);
        v225 = v224;
        v226 = _mm_add_epi64(v202, v223);
        v227 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v223, 1), _mm_cvtsi128_si64(v223), 0, _mm_cvtsi128_si64(v202), _mm_extract_epi64(v215, 1), _mm_cvtsi128_si64(v215));
        v228 = v227;
        v229 = v216 + 1;
        v230 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v203, v134), _mm_add_epi64(*v203, v134), 8);
        v231 = __dirty_unsupported_Iop_SliceV128(v213, v226, 8);
        v232 = __dirty_unsupported_Iop_SliceV128(v226, v215, 8);
        v233 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v134, 1), _mm_cvtsi128_si64(v134), 0, _mm_cvtsi128_si64(v147));
        v234 = __dirty_unsupported_Iop_SliceV128(v199, v186, 8);
        v235 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v213, v230), 1), _mm_cvtsi128_si64(v213) + _mm_cvtsi128_si64(v230), (unsigned long long)(v231 >> 64), (unsigned long long)v231, (unsigned long long)(v232 >> 64), (unsigned long long)v232);
        v236 = v235;
        v237 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v233 >> 64), (unsigned long long)v233, _mm_extract_epi64(v225, 1), _mm_cvtsi128_si64(v225), (unsigned long long)(v234 >> 64), (unsigned long long)v234);
        v238 = v237;
        v239 = _mm_add_epi64(v215, v236);
        v240 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v236, 1), _mm_cvtsi128_si64(v236), 0, _mm_cvtsi128_si64(v215), _mm_extract_epi64(v228, 1), _mm_cvtsi128_si64(v228));
        v241 = v240;
        v242 = v229 + 1;
        v243 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v216, v147), _mm_add_epi64(*v216, v147), 8);
        v244 = __dirty_unsupported_Iop_SliceV128(v226, v239, 8);
        v245 = __dirty_unsupported_Iop_SliceV128(v239, v228, 8);
        v246 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v147, 1), _mm_cvtsi128_si64(v147), 0, _mm_cvtsi128_si64(v160));
        v247 = __dirty_unsupported_Iop_SliceV128(v212, v199, 8);
        v248 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v226, v243), 1), _mm_cvtsi128_si64(v226) + _mm_cvtsi128_si64(v243), (unsigned long long)(v244 >> 64), (unsigned long long)v244, (unsigned long long)(v245 >> 64), (unsigned long long)v245);
        v249 = v248;
        v250 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v246 >> 64), (unsigned long long)v246, _mm_extract_epi64(v238, 1), _mm_cvtsi128_si64(v238), (unsigned long long)(v247 >> 64), (unsigned long long)v247);
        v251 = v250;
        v252 = _mm_add_epi64(v228, v249);
        v253 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v249, 1), _mm_cvtsi128_si64(v249), 0, _mm_cvtsi128_si64(v228), _mm_extract_epi64(v241, 1), _mm_cvtsi128_si64(v241));
        v254 = v253;
        v255 = v242 + 1;
        v256 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v229, v160), _mm_add_epi64(*v229, v160), 8);
        v257 = __dirty_unsupported_Iop_SliceV128(v239, v252, 8);
        v258 = __dirty_unsupported_Iop_SliceV128(v252, v241, 8);
        v259 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v160, 1), _mm_cvtsi128_si64(v160), 0, _mm_cvtsi128_si64(v173));
        v260 = __dirty_unsupported_Iop_SliceV128(v225, v212, 8);
        v261 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v239, v256), 1), _mm_cvtsi128_si64(v239) + _mm_cvtsi128_si64(v256), (unsigned long long)(v257 >> 64), (unsigned long long)v257, (unsigned long long)(v258 >> 64), (unsigned long long)v258);
        v262 = v261;
        v263 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v259 >> 64), (unsigned long long)v259, _mm_extract_epi64(v251, 1), _mm_cvtsi128_si64(v251), (unsigned long long)(v260 >> 64), (unsigned long long)v260);
        v264 = v263;
        v265 = _mm_add_epi64(v241, v262);
        v266 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v262, 1), _mm_cvtsi128_si64(v262), 0, _mm_cvtsi128_si64(v241), _mm_extract_epi64(v254, 1), _mm_cvtsi128_si64(v254));
        v267 = v266;
        v268 = v255 + 1;
        v269 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v242, v173), _mm_add_epi64(*v242, v173), 8);
        v270 = __dirty_unsupported_Iop_SliceV128(v252, v265, 8);
        v271 = __dirty_unsupported_Iop_SliceV128(v265, v254, 8);
        v272 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v173, 1), _mm_cvtsi128_si64(v173), 0, _mm_cvtsi128_si64(v186));
        v273 = __dirty_unsupported_Iop_SliceV128(v238, v225, 8);
        v274 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v252, v269), 1), _mm_cvtsi128_si64(v252) + _mm_cvtsi128_si64(v269), (unsigned long long)(v270 >> 64), (unsigned long long)v270, (unsigned long long)(v271 >> 64), (unsigned long long)v271);
        v275 = v274;
        v276 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v272 >> 64), (unsigned long long)v272, _mm_extract_epi64(v264, 1), _mm_cvtsi128_si64(v264), (unsigned long long)(v273 >> 64), (unsigned long long)v273);
        v277 = v276;
        v278 = _mm_add_epi64(v254, v275);
        v279 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v275, 1), _mm_cvtsi128_si64(v275), 0, _mm_cvtsi128_si64(v254), _mm_extract_epi64(v267, 1), _mm_cvtsi128_si64(v267));
        v280 = v279;
        v281 = v268 + 1;
        v282 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v255, v186), _mm_add_epi64(*v255, v186), 8);
        v283 = __dirty_unsupported_Iop_SliceV128(v265, v278, 8);
        v284 = __dirty_unsupported_Iop_SliceV128(v278, v267, 8);
        v285 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v186, 1), _mm_cvtsi128_si64(v186), 0, _mm_cvtsi128_si64(v199));
        v286 = __dirty_unsupported_Iop_SliceV128(v251, v238, 8);
        v287 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v265, v282), 1), _mm_cvtsi128_si64(v265) + _mm_cvtsi128_si64(v282), (unsigned long long)(v283 >> 64), (unsigned long long)v283, (unsigned long long)(v284 >> 64), (unsigned long long)v284);
        v288 = v287;
        v289 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v285 >> 64), (unsigned long long)v285, _mm_extract_epi64(v277, 1), _mm_cvtsi128_si64(v277), (unsigned long long)(v286 >> 64), (unsigned long long)v286);
        v290 = v289;
        v291 = _mm_add_epi64(v267, v288);
        v292 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v288, 1), _mm_cvtsi128_si64(v288), 0, _mm_cvtsi128_si64(v267), _mm_extract_epi64(v280, 1), _mm_cvtsi128_si64(v280));
        v293 = v292;
        v294 = v281 + 1;
        v295 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v268, v199), _mm_add_epi64(*v268, v199), 8);
        v296 = __dirty_unsupported_Iop_SliceV128(v278, v291, 8);
        v297 = __dirty_unsupported_Iop_SliceV128(v291, v280, 8);
        v298 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v199, 1), _mm_cvtsi128_si64(v199), 0, _mm_cvtsi128_si64(v212));
        v299 = __dirty_unsupported_Iop_SliceV128(v264, v251, 8);
        v300 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v278, v295), 1), _mm_cvtsi128_si64(v278) + _mm_cvtsi128_si64(v295), (unsigned long long)(v296 >> 64), (unsigned long long)v296, (unsigned long long)(v297 >> 64), (unsigned long long)v297);
        v301 = v300;
        v302 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v298 >> 64), (unsigned long long)v298, _mm_extract_epi64(v290, 1), _mm_cvtsi128_si64(v290), (unsigned long long)(v299 >> 64), (unsigned long long)v299);
        v303 = v302;
        v304 = _mm_add_epi64(v280, v301);
        v305 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v301, 1), _mm_cvtsi128_si64(v301), 0, _mm_cvtsi128_si64(v280), _mm_extract_epi64(v293, 1), _mm_cvtsi128_si64(v293));
        v306 = v305;
        v307 = v294 + 1;
        v308 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v281, v212), _mm_add_epi64(*v281, v212), 8);
        v309 = __dirty_unsupported_Iop_SliceV128(v291, v304, 8);
        v310 = __dirty_unsupported_Iop_SliceV128(v304, v293, 8);
        v311 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v212, 1), _mm_cvtsi128_si64(v212), 0, _mm_cvtsi128_si64(v225));
        v312 = __dirty_unsupported_Iop_SliceV128(v277, v264, 8);
        v313 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v291, v308), 1), _mm_cvtsi128_si64(v291) + _mm_cvtsi128_si64(v308), (unsigned long long)(v309 >> 64), (unsigned long long)v309, (unsigned long long)(v310 >> 64), (unsigned long long)v310);
        v314 = v313;
        v315 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v311 >> 64), (unsigned long long)v311, _mm_extract_epi64(v303, 1), _mm_cvtsi128_si64(v303), (unsigned long long)(v312 >> 64), (unsigned long long)v312);
        v316 = v315;
        v317 = _mm_add_epi64(v293, v314);
        v318 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v314, 1), _mm_cvtsi128_si64(v314), 0, _mm_cvtsi128_si64(v293), _mm_extract_epi64(v306, 1), _mm_cvtsi128_si64(v306));
        v319 = v318;
        v320 = v307 + 1;
        v321 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v294, v225), _mm_add_epi64(*v294, v225), 8);
        v322 = __dirty_unsupported_Iop_SliceV128(v304, v317, 8);
        v323 = __dirty_unsupported_Iop_SliceV128(v317, v306, 8);
        v324 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v225, 1), _mm_cvtsi128_si64(v225), 0, _mm_cvtsi128_si64(v238));
        v325 = __dirty_unsupported_Iop_SliceV128(v290, v277, 8);
        v326 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v304, v321), 1), _mm_cvtsi128_si64(v304) + _mm_cvtsi128_si64(v321), (unsigned long long)(v322 >> 64), (unsigned long long)v322, (unsigned long long)(v323 >> 64), (unsigned long long)v323);
        v327 = v326;
        v328 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v324 >> 64), (unsigned long long)v324, _mm_extract_epi64(v316, 1), _mm_cvtsi128_si64(v316), (unsigned long long)(v325 >> 64), (unsigned long long)v325);
        v329 = v328;
        v330 = _mm_add_epi64(v306, v327);
        v331 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v327, 1), _mm_cvtsi128_si64(v327), 0, _mm_cvtsi128_si64(v306), _mm_extract_epi64(v319, 1), _mm_cvtsi128_si64(v319));
        v332 = v331;
        v333 = v320 + 1;
        v334 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v307, v238), _mm_add_epi64(*v307, v238), 8);
        v335 = __dirty_unsupported_Iop_SliceV128(v317, v330, 8);
        v336 = __dirty_unsupported_Iop_SliceV128(v330, v319, 8);
        v337 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v238, 1), _mm_cvtsi128_si64(v238), 0, _mm_cvtsi128_si64(v251));
        v338 = __dirty_unsupported_Iop_SliceV128(v303, v290, 8);
        v339 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v317, v334), 1), _mm_cvtsi128_si64(v317) + _mm_cvtsi128_si64(v334), (unsigned long long)(v335 >> 64), (unsigned long long)v335, (unsigned long long)(v336 >> 64), (unsigned long long)v336);
        v340 = v339;
        v341 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v337 >> 64), (unsigned long long)v337, _mm_extract_epi64(v329, 1), _mm_cvtsi128_si64(v329), (unsigned long long)(v338 >> 64), (unsigned long long)v338);
        v342 = v341;
        v343 = _mm_add_epi64(v319, v340);
        v344 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v340, 1), _mm_cvtsi128_si64(v340), 0, _mm_cvtsi128_si64(v319), _mm_extract_epi64(v332, 1), _mm_cvtsi128_si64(v332));
        v345 = v344;
        v346 = v333 + 1;
        v347 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v320, v251), _mm_add_epi64(*v320, v251), 8);
        v348 = __dirty_unsupported_Iop_SliceV128(v330, v343, 8);
        v349 = __dirty_unsupported_Iop_SliceV128(v343, v332, 8);
        v350 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v251, 1), _mm_cvtsi128_si64(v251), 0, _mm_cvtsi128_si64(v264));
        v351 = __dirty_unsupported_Iop_SliceV128(v316, v303, 8);
        v352 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v330, v347), 1), _mm_cvtsi128_si64(v330) + _mm_cvtsi128_si64(v347), (unsigned long long)(v348 >> 64), (unsigned long long)v348, (unsigned long long)(v349 >> 64), (unsigned long long)v349);
        v353 = v352;
        v354 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v350 >> 64), (unsigned long long)v350, _mm_extract_epi64(v342, 1), _mm_cvtsi128_si64(v342), (unsigned long long)(v351 >> 64), (unsigned long long)v351);
        v355 = v354;
        v356 = _mm_add_epi64(v332, v353);
        v357 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v353, 1), _mm_cvtsi128_si64(v353), 0, _mm_cvtsi128_si64(v332), _mm_extract_epi64(v345, 1), _mm_cvtsi128_si64(v345));
        v358 = v357;
        v359 = v346 + 1;
        v360 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v333, v264), _mm_add_epi64(*v333, v264), 8);
        v361 = __dirty_unsupported_Iop_SliceV128(v343, v356, 8);
        v362 = __dirty_unsupported_Iop_SliceV128(v356, v345, 8);
        v363 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v264, 1), _mm_cvtsi128_si64(v264), 0, _mm_cvtsi128_si64(v277));
        v364 = __dirty_unsupported_Iop_SliceV128(v329, v316, 8);
        v365 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v343, v360), 1), _mm_cvtsi128_si64(v343) + _mm_cvtsi128_si64(v360), (unsigned long long)(v361 >> 64), (unsigned long long)v361, (unsigned long long)(v362 >> 64), (unsigned long long)v362);
        v366 = v365;
        v367 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v363 >> 64), (unsigned long long)v363, _mm_extract_epi64(v355, 1), _mm_cvtsi128_si64(v355), (unsigned long long)(v364 >> 64), (unsigned long long)v364);
        v368 = v367;
        v369 = _mm_add_epi64(v345, v366);
        v370 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v366, 1), _mm_cvtsi128_si64(v366), 0, _mm_cvtsi128_si64(v345), _mm_extract_epi64(v358, 1), _mm_cvtsi128_si64(v358));
        v371 = v370;
        v372 = v359 + 1;
        v373 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v346, v277), _mm_add_epi64(*v346, v277), 8);
        v374 = __dirty_unsupported_Iop_SliceV128(v356, v369, 8);
        v375 = __dirty_unsupported_Iop_SliceV128(v369, v358, 8);
        v376 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v277, 1), _mm_cvtsi128_si64(v277), 0, _mm_cvtsi128_si64(v290));
        v377 = __dirty_unsupported_Iop_SliceV128(v342, v329, 8);
        v378 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v356, v373), 1), _mm_cvtsi128_si64(v356) + _mm_cvtsi128_si64(v373), (unsigned long long)(v374 >> 64), (unsigned long long)v374, (unsigned long long)(v375 >> 64), (unsigned long long)v375);
        v379 = v378;
        v380 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v376 >> 64), (unsigned long long)v376, _mm_extract_epi64(v368, 1), _mm_cvtsi128_si64(v368), (unsigned long long)(v377 >> 64), (unsigned long long)v377);
        v381 = v380;
        v382 = _mm_add_epi64(v358, v379);
        v383 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v379, 1), _mm_cvtsi128_si64(v379), 0, _mm_cvtsi128_si64(v358), _mm_extract_epi64(v371, 1), _mm_cvtsi128_si64(v371));
        v384 = v383;
        v385 = v372 + 1;
        v386 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v359, v290), _mm_add_epi64(*v359, v290), 8);
        v387 = __dirty_unsupported_Iop_SliceV128(v369, v382, 8);
        v388 = __dirty_unsupported_Iop_SliceV128(v382, v371, 8);
        v389 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v290, 1), _mm_cvtsi128_si64(v290), 0, _mm_cvtsi128_si64(v303));
        v390 = __dirty_unsupported_Iop_SliceV128(v355, v342, 8);
        v391 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v369, v386), 1), _mm_cvtsi128_si64(v369) + _mm_cvtsi128_si64(v386), (unsigned long long)(v387 >> 64), (unsigned long long)v387, (unsigned long long)(v388 >> 64), (unsigned long long)v388);
        v392 = v391;
        v393 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v389 >> 64), (unsigned long long)v389, _mm_extract_epi64(v381, 1), _mm_cvtsi128_si64(v381), (unsigned long long)(v390 >> 64), (unsigned long long)v390);
        v394 = v393;
        v395 = _mm_add_epi64(v371, v392);
        v396 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v392, 1), _mm_cvtsi128_si64(v392), 0, _mm_cvtsi128_si64(v371), _mm_extract_epi64(v384, 1), _mm_cvtsi128_si64(v384));
        v397 = v396;
        v398 = v385 + 1;
        v399 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v372, v303), _mm_add_epi64(*v372, v303), 8);
        v400 = __dirty_unsupported_Iop_SliceV128(v382, v395, 8);
        v401 = __dirty_unsupported_Iop_SliceV128(v395, v384, 8);
        v402 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v303, 1), _mm_cvtsi128_si64(v303), 0, _mm_cvtsi128_si64(v316));
        v403 = __dirty_unsupported_Iop_SliceV128(v368, v355, 8);
        v404 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v382, v399), 1), _mm_cvtsi128_si64(v382) + _mm_cvtsi128_si64(v399), (unsigned long long)(v400 >> 64), (unsigned long long)v400, (unsigned long long)(v401 >> 64), (unsigned long long)v401);
        v405 = v404;
        v406 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v402 >> 64), (unsigned long long)v402, _mm_extract_epi64(v394, 1), _mm_cvtsi128_si64(v394), (unsigned long long)(v403 >> 64), (unsigned long long)v403);
        v407 = v406;
        v408 = _mm_add_epi64(v384, v405);
        v409 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v405, 1), _mm_cvtsi128_si64(v405), 0, _mm_cvtsi128_si64(v384), _mm_extract_epi64(v397, 1), _mm_cvtsi128_si64(v397));
        v410 = v409;
        v411 = v398 + 1;
        v412 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v385, v316), _mm_add_epi64(*v385, v316), 8);
        v413 = __dirty_unsupported_Iop_SliceV128(v395, v408, 8);
        v414 = __dirty_unsupported_Iop_SliceV128(v408, v397, 8);
        v415 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v316, 1), _mm_cvtsi128_si64(v316), 0, _mm_cvtsi128_si64(v329));
        v416 = __dirty_unsupported_Iop_SliceV128(v381, v368, 8);
        v417 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v395, v412), 1), _mm_cvtsi128_si64(v395) + _mm_cvtsi128_si64(v412), (unsigned long long)(v413 >> 64), (unsigned long long)v413, (unsigned long long)(v414 >> 64), (unsigned long long)v414);
        v418 = v417;
        v419 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v415 >> 64), (unsigned long long)v415, _mm_extract_epi64(v407, 1), _mm_cvtsi128_si64(v407), (unsigned long long)(v416 >> 64), (unsigned long long)v416);
        v420 = v419;
        v421 = _mm_add_epi64(v397, v418);
        v422 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v418, 1), _mm_cvtsi128_si64(v418), 0, _mm_cvtsi128_si64(v397), _mm_extract_epi64(v410, 1), _mm_cvtsi128_si64(v410));
        v423 = v422;
        v424 = v411 + 1;
        v425 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v398, v329), _mm_add_epi64(*v398, v329), 8);
        v426 = __dirty_unsupported_Iop_SliceV128(v408, v421, 8);
        v427 = __dirty_unsupported_Iop_SliceV128(v421, v410, 8);
        v428 = __dirty_arm64g_dirtyhelper_SHA512SU0(/* unsupported instruction */, _mm_extract_epi64(v329, 1), _mm_cvtsi128_si64(v329), 0, _mm_cvtsi128_si64(v342));
        v429 = __dirty_unsupported_Iop_SliceV128(v394, v381, 8);
        v430 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v408, v425), 1), _mm_cvtsi128_si64(v408) + _mm_cvtsi128_si64(v425), (unsigned long long)(v426 >> 64), (unsigned long long)v426, (unsigned long long)(v427 >> 64), (unsigned long long)v427);
        v431 = v430;
        v432 = __dirty_arm64g_dirtyhelper_SHA512SU1(/* unsupported instruction */, (unsigned long long)(v428 >> 64), (unsigned long long)v428, _mm_extract_epi64(v420, 1), _mm_cvtsi128_si64(v420), (unsigned long long)(v429 >> 64), (unsigned long long)v429);
        v433 = _mm_add_epi64(v410, v431);
        v434 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v431, 1), _mm_cvtsi128_si64(v431), 0, _mm_cvtsi128_si64(v410), _mm_extract_epi64(v423, 1), _mm_cvtsi128_si64(v423));
        v435 = v434;
        v436 = v424 + 1;
        v437 = v5 + 1;
        v438 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v411, v342), _mm_add_epi64(*v411, v342), 8);
        v439 = __dirty_unsupported_Iop_SliceV128(v421, v433, 8);
        v440 = __dirty_unsupported_Iop_SliceV128(v433, v423, 8);
        v441 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v421, v438), 1), _mm_cvtsi128_si64(v421) + _mm_cvtsi128_si64(v438), (unsigned long long)(v439 >> 64), (unsigned long long)v439, (unsigned long long)(v440 >> 64), (unsigned long long)v440);
        v442 = v441;
        v11 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v5);
        v443 = _mm_add_epi64(v423, v442);
        v444 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v442, 1), _mm_cvtsi128_si64(v442), 0, _mm_cvtsi128_si64(v423), _mm_extract_epi64(v435, 1), _mm_cvtsi128_si64(v435));
        v445 = v444;
        v446 = v436 + 1;
        v447 = v437 + 1;
        v448 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v424, v355), _mm_add_epi64(*v424, v355), 8);
        v449 = __dirty_unsupported_Iop_SliceV128(v433, v443, 8);
        v450 = __dirty_unsupported_Iop_SliceV128(v443, v435, 8);
        v451 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v433, v448), 1), _mm_cvtsi128_si64(v433) + _mm_cvtsi128_si64(v448), (unsigned long long)(v449 >> 64), (unsigned long long)v449, (unsigned long long)(v450 >> 64), (unsigned long long)v450);
        v452 = v451;
        v12 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v437);
        v453 = _mm_add_epi64(v435, v452);
        v454 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v452, 1), _mm_cvtsi128_si64(v452), 0, _mm_cvtsi128_si64(v435), _mm_extract_epi64(v445, 1), _mm_cvtsi128_si64(v445));
        v455 = v454;
        v456 = v446 + 1;
        v457 = v447 + 1;
        v458 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v436, v368), _mm_add_epi64(*v436, v368), 8);
        v459 = __dirty_unsupported_Iop_SliceV128(v443, v453, 8);
        v460 = __dirty_unsupported_Iop_SliceV128(v453, v445, 8);
        v461 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v443, v458), 1), _mm_cvtsi128_si64(v443) + _mm_cvtsi128_si64(v458), (unsigned long long)(v459 >> 64), (unsigned long long)v459, (unsigned long long)(v460 >> 64), (unsigned long long)v460);
        v462 = v461;
        v13 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v447);
        v463 = _mm_add_epi64(v445, v462);
        v464 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v462, 1), _mm_cvtsi128_si64(v462), 0, _mm_cvtsi128_si64(v445), _mm_extract_epi64(v455, 1), _mm_cvtsi128_si64(v455));
        v465 = v464;
        v466 = v456 + 1;
        v467 = v457 + 1;
        v468 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v446, v381), _mm_add_epi64(*v446, v381), 8);
        v469 = __dirty_unsupported_Iop_SliceV128(v453, v463, 8);
        v470 = __dirty_unsupported_Iop_SliceV128(v463, v455, 8);
        v471 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v453, v468), 1), _mm_cvtsi128_si64(v453) + _mm_cvtsi128_si64(v468), (unsigned long long)(v469 >> 64), (unsigned long long)v469, (unsigned long long)(v470 >> 64), (unsigned long long)v470);
        v472 = v471;
        v14 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v457);
        v473 = _mm_add_epi64(v455, v472);
        v474 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v472, 1), _mm_cvtsi128_si64(v472), 0, _mm_cvtsi128_si64(v455), _mm_extract_epi64(v465, 1), _mm_cvtsi128_si64(v465));
        v475 = v474;
        v476 = v466 + 1;
        v477 = v467 + 1;
        v478 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v456, v394), _mm_add_epi64(*v456, v394), 8);
        v479 = __dirty_unsupported_Iop_SliceV128(v463, v473, 8);
        v480 = __dirty_unsupported_Iop_SliceV128(v473, v465, 8);
        v481 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v463, v478), 1), _mm_cvtsi128_si64(v463) + _mm_cvtsi128_si64(v478), (unsigned long long)(v479 >> 64), (unsigned long long)v479, (unsigned long long)(v480 >> 64), (unsigned long long)v480);
        v482 = v481;
        v15 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v467);
        v483 = _mm_add_epi64(v465, v482);
        v484 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v482, 1), _mm_cvtsi128_si64(v482), 0, _mm_cvtsi128_si64(v465), _mm_extract_epi64(v475, 1), _mm_cvtsi128_si64(v475));
        v485 = v484;
        v486 = v476 + 1;
        v487 = v477 + 1;
        v488 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v466, v407), _mm_add_epi64(*v466, v407), 8);
        v489 = __dirty_unsupported_Iop_SliceV128(v473, v483, 8);
        v490 = __dirty_unsupported_Iop_SliceV128(v483, v475, 8);
        v491 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v473, v488), 1), _mm_cvtsi128_si64(v473) + _mm_cvtsi128_si64(v488), (unsigned long long)(v489 >> 64), (unsigned long long)v489, (unsigned long long)(v490 >> 64), (unsigned long long)v490);
        v492 = v491;
        v16 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v477);
        v493 = _mm_add_epi64(v475, v492);
        v494 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v492, 1), _mm_cvtsi128_si64(v492), 0, _mm_cvtsi128_si64(v475), _mm_extract_epi64(v485, 1), _mm_cvtsi128_si64(v485));
        v495 = v494;
        v496 = v487 + 1;
        v497 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v476, v420), _mm_add_epi64(*v476, v420), 8);
        v498 = __dirty_unsupported_Iop_SliceV128(v483, v493, 8);
        v499 = __dirty_unsupported_Iop_SliceV128(v493, v485, 8);
        v500 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v483, v497), 1), _mm_cvtsi128_si64(v483) + _mm_cvtsi128_si64(v497), (unsigned long long)(v498 >> 64), (unsigned long long)v498, (unsigned long long)(v499 >> 64), (unsigned long long)v499);
        v501 = v500;
        v17 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v487);
        v502 = _mm_add_epi64(v485, v501);
        v503 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v501, 1), _mm_cvtsi128_si64(v501), 0, _mm_cvtsi128_si64(v485), _mm_extract_epi64(v495, 1), _mm_cvtsi128_si64(v495));
        v504 = v503;
        v10 = (char *)v486 - 624;
        v5 = v496 + 1;
        v505 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(*v486, v432), _mm_add_epi64(*v486, v432), 8);
        v506 = __dirty_unsupported_Iop_SliceV128(v493, v502, 8);
        v507 = __dirty_unsupported_Iop_SliceV128(v502, v495, 8);
        v508 = __dirty_arm64g_dirtyhelper_SHA512H(/* unsupported instruction */, _mm_extract_epi64(_mm_add_epi64(v493, v505), 1), _mm_cvtsi128_si64(v493) + _mm_cvtsi128_si64(v505), (unsigned long long)(v506 >> 64), (unsigned long long)v506, (unsigned long long)(v507 >> 64), (unsigned long long)v507);
        v509 = v508;
        v18 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v496);
        v510 = __dirty_arm64g_dirtyhelper_SHA512H2(/* unsupported instruction */, _mm_extract_epi64(v509, 1), _mm_cvtsi128_si64(v509), 0, _mm_cvtsi128_si64(v495), _mm_extract_epi64(v504, 1), _mm_cvtsi128_si64(v504));
        v9 = _mm_add_epi64(v510, v9);
        v8 = _mm_add_epi64(v504, v8);
        v7 = _mm_add_epi64(_mm_add_epi64(v495, v509), v7);
        v6 = _mm_add_epi64(v502, v6);
        i = v20;
    } while (i);
    a0[3] = v6;
    a0[2] = v7;
    a0[1] = v8;
    *a0 = v9;
    return _mm_cvtsi128_si64(v9);
}
