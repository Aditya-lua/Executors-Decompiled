/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9da2c0..0x9daca0 (2528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9da2c0_0 {
    char field_0;
} st_9da2c0_0;


int sub_9da2c0(unsigned long long *a0, void* a1, void* a2, void* a3, unsigned long long *a4, unsigned long a5)
{
    unsigned long long v15;  // x30
    unsigned long long v16;  // x19
    unsigned long long v25;  // x28
    unsigned long v115;  // 4546
    unsigned long long v116;  // x26
    unsigned long v117;  // x17
    unsigned long v118;  // 4557
    unsigned long long v119;  // x19
    unsigned long v120;  // x14
    unsigned long v121;  // 4568
    unsigned long long v122;  // x20
    unsigned long v123;  // x15
    unsigned long v124;  // x16
    unsigned long v26;  // x6
    unsigned long v125;  // 4583
    unsigned long long v126;  // x25
    unsigned long v127;  // x17
    unsigned long v128;  // 4594
    unsigned long long v129;  // x26
    unsigned long v130;  // x14
    unsigned long v131;  // 4605
    unsigned long long v132;  // x19
    unsigned long v133;  // x15
    unsigned long v134;  // 4616
    unsigned long v27;  // x7
    unsigned long long v135;  // x20
    unsigned long v136;  // x16
    unsigned long long *v137;  // x2
    unsigned long v138;  // 4631
    unsigned long v139;  // 4642
    unsigned long long v140;  // x26
    unsigned long v141;  // x14
    unsigned long v142;  // 4653
    unsigned long long v143;  // x19
    unsigned long v144;  // x15
    unsigned long v28;  // x8
    unsigned long v145;  // 4664
    unsigned long long v146;  // x20
    unsigned long v147;  // x16
    unsigned long v148;  // 4675
    unsigned long long v149;  // x21
    unsigned long v150;  // x17
    unsigned long long v151;  // x26
    unsigned long v152;  // x14
    unsigned long v153;  // 4690
    unsigned long long v154;  // x19
    unsigned long v29;  // x9
    unsigned long v155;  // x15
    unsigned long v156;  // 4133
    unsigned long long v157;  // x20
    unsigned long v158;  // x16
    unsigned long v159;  // 4144
    unsigned long long v160;  // x21
    unsigned long v161;  // 4159
    unsigned long long v162;  // x19
    unsigned long v163;  // x14
    unsigned long v164;  // 4170
    unsigned long v30;  // x10
    unsigned long long v165;  // x20
    unsigned long v166;  // x15
    unsigned long v167;  // 4181
    unsigned long long v168;  // x21
    unsigned long v169;  // x16
    unsigned long v170;  // 4192
    unsigned long long v171;  // x22
    unsigned long v172;  // x17
    unsigned long long v173;  // x20
    unsigned long v174;  // x14
    unsigned long v31;  // x11
    unsigned long v175;  // 4181
    unsigned long long v176;  // x21
    unsigned long v177;  // 4192
    unsigned long long v178;  // x22
    unsigned long v179;  // x16
    unsigned long v180;  // 4203
    unsigned long long v181;  // x21
    unsigned long v182;  // x17
    unsigned long v183;  // 4214
    unsigned long long v184;  // x22
    unsigned long v32;  // x12
    unsigned long v185;  // x14
    unsigned long v186;  // 4225
    unsigned long long v187;  // x23
    unsigned long long v188;  // x22
    unsigned long v189;  // x16
    unsigned long v190;  // 4240
    unsigned long long v191;  // x23
    unsigned long v192;  // 4251
    unsigned long long v193;  // x23
    unsigned long v194;  // 4258
    unsigned long v33;  // x13
    unsigned long long v195;  // x24
    unsigned long long v196;  // x24
    void* v197;  // x14
    unsigned long v198;  // 4265
    unsigned long long v199;  // x25
    unsigned long long v200;  // x13
    unsigned long v201;  // 4192
    unsigned long v202;  // x6
    unsigned long v203;  // x7
    unsigned long v204;  // 4203
    st_9da2c0_0 **iter;  // x2
    unsigned long v205;  // 4210
    unsigned long v206;  // x8
    unsigned long v207;  // x9
    unsigned long v208;  // 4221
    unsigned long v209;  // 4228
    unsigned long v210;  // x10
    unsigned long v211;  // x11
    unsigned long v212;  // 4239
    void* v213;  // x0
    unsigned long v214;  // 4246
    unsigned long long v17;  // x20
    unsigned long long v35;  // x5
    unsigned long long v215;  // cc_dep1
    unsigned long v216;  // x12
    unsigned long v217;  // x13
    void* iter1;  // x1
    unsigned long long l;  // x27
    unsigned long v220;  // x14
    unsigned long v221;  // 4186
    unsigned long v222;  // x15
    unsigned long v223;  // x16
    unsigned long v224;  // x17
    unsigned long long v36;  // x27
    unsigned long v225;  // x14
    unsigned long v226;  // 4209
    unsigned long long v227;  // x20
    unsigned long v228;  // x15
    unsigned long v229;  // 4220
    unsigned long long v230;  // x21
    unsigned long v231;  // x16
    unsigned long v232;  // 4231
    unsigned long long v233;  // x22
    unsigned long v234;  // x17
    void* v37;  // x3
    unsigned long v235;  // 4242
    unsigned long long v236;  // x23
    unsigned long v237;  // x14
    unsigned long v238;  // 4253
    unsigned long long v239;  // x24
    unsigned long v240;  // x15
    unsigned long v241;  // 4264
    unsigned long long v242;  // x25
    unsigned long v243;  // x16
    unsigned long v244;  // 4275
    void* v38;  // x1
    unsigned long long v245;  // x26
    unsigned long v246;  // x17
    unsigned long v247;  // 4286
    unsigned long v248;  // x14
    unsigned long v249;  // 4298
    unsigned long v250;  // x15
    unsigned long v251;  // 4309
    unsigned long v252;  // x16
    unsigned long v253;  // 4320
    unsigned long v254;  // 4335
    unsigned long long v39;  // x19
    unsigned long v255;  // 4342
    unsigned long v256;  // 4349
    unsigned long v258;  // 4189
    unsigned long v260;  // 4200
    unsigned long v262;  // 4207
    unsigned long v264;  // 4218
    unsigned long long v40;  // x20
    unsigned long v266;  // 4225
    unsigned long v268;  // 4236
    unsigned long v270;  // 4243
    unsigned long long v272;  // x14
    unsigned long long *v273;  // x15
    unsigned long v274;  // x7
    unsigned long long v41;  // x21
    unsigned long v275;  // x9
    unsigned long v276;  // x15
    unsigned long v277;  // x16
    unsigned long v278;  // x11
    unsigned long v279;  // x13
    unsigned long long *v280;  // x1
    unsigned long v281;  // x17
    unsigned long v282;  // x14
    unsigned long v283;  // x19
    unsigned long v284;  // x7
    unsigned long long v42;  // x22
    unsigned long v285;  // x8
    unsigned long long v286;  // x9
    unsigned long long v287;  // x20
    unsigned long v288;  // cc_op
    unsigned long v289;  // cc_dep2
    unsigned long v290;  // cc_ndep
    unsigned long long v291;  // x15
    unsigned long long i;  // x27
    void* node;  // x2
    unsigned long v294;  // 4202
    unsigned long long v43;  // x23
    unsigned long long v295;  // x16
    unsigned long v296;  // 4212
    unsigned long v297;  // x15
    unsigned long v298;  // x16
    unsigned long v299;  // x10
    unsigned long v300;  // x7
    unsigned long v301;  // x9
    unsigned long long *v302;  // x1
    unsigned long v303;  // x11
    unsigned long v304;  // x12
    unsigned long long v44;  // x24
    unsigned long v305;  // x13
    unsigned long long v306;  // x17
    unsigned long v307;  // 4250
    unsigned long long v308;  // x14
    unsigned long v309;  // 4264
    unsigned long v310;  // x17
    unsigned long v311;  // x14
    unsigned long long v312;  // x15
    unsigned long v313;  // 4278
    unsigned long long v314;  // x16
    unsigned long long v18;  // x21
    unsigned long long v45;  // x25
    unsigned long v315;  // 4288
    unsigned long v316;  // x15
    unsigned long v317;  // x6
    unsigned long v318;  // x7
    unsigned long long v319;  // x17
    unsigned long v320;  // 4330
    unsigned long long v321;  // x14
    unsigned long v322;  // 4340
    unsigned long v323;  // x4
    unsigned long v324;  // 4213
    unsigned long long v46;  // x26
    unsigned long long v325;  // x16
    unsigned long v326;  // 4223
    unsigned long v327;  // x15
    unsigned long v328;  // x16
    unsigned long v329;  // x10
    unsigned long v330;  // x11
    unsigned long v331;  // x12
    unsigned long long v332;  // x17
    unsigned long v333;  // 4261
    unsigned long long v334;  // x14
    unsigned long long *iter2;  // x2
    unsigned long long v335;  // x19
    unsigned long v336;  // x20
    unsigned long v337;  // 4275
    unsigned long long v338;  // x15
    unsigned long v339;  // x6
    unsigned long v340;  // x7
    unsigned long v341;  // 4289
    unsigned long v342;  // x8
    unsigned long v343;  // x9
    unsigned long v344;  // 4303
    unsigned long v48;  // x14
    unsigned long v345;  // x10
    unsigned long v346;  // x11
    unsigned long long v347;  // x28
    unsigned long v348;  // x12
    unsigned long v349;  // x13
    void* v350;  // x3
    unsigned long v351;  // x21
    unsigned long v352;  // x22
    unsigned long v353;  // x23
    unsigned long v354;  // x24
    unsigned long v49;  // x15
    unsigned long v355;  // x25
    unsigned long v356;  // x26
    unsigned long v357;  // x1
    void* v358;  // x2
    unsigned long long j;  // x27
    unsigned long long v360;  // x15
    unsigned long long v361;  // x16
    unsigned long long v362;  // x17
    unsigned long long v363;  // x14
    unsigned long v364;  // 4193
    unsigned long v50;  // x16
    unsigned long long v365;  // x19
    unsigned long long v366;  // x15
    unsigned long v367;  // 4204
    unsigned long long v368;  // x20
    unsigned long long v369;  // x16
    unsigned long v370;  // 4215
    unsigned long long v371;  // x21
    unsigned long long v372;  // x17
    unsigned long v373;  // 4226
    unsigned long long v374;  // x22
    unsigned long v51;  // x17
    unsigned long v375;  // x14
    unsigned long v376;  // 4237
    unsigned long long v377;  // x23
    unsigned long v378;  // x15
    unsigned long v379;  // 4248
    unsigned long long v380;  // x24
    unsigned long v381;  // x16
    unsigned long v382;  // 4259
    unsigned long long v383;  // x25
    unsigned long v384;  // x17
    unsigned long v52;  // x14
    unsigned long v385;  // 4270
    unsigned long v386;  // x14
    unsigned long v387;  // 4281
    unsigned long v388;  // x15
    unsigned long v389;  // 4292
    unsigned long v390;  // x16
    unsigned long v391;  // 4303
    unsigned long v393;  // 4318
    unsigned long v394;  // 4325
    unsigned long v53;  // 4303
    unsigned long v395;  // 4332
    unsigned long v396;  // 4339
    void* v397;  // x0
    unsigned long long v398;  // x19
    unsigned long v399;  // 4165
    unsigned long long v400;  // x20
    unsigned long v401;  // 4176
    unsigned long long v402;  // x21
    unsigned long v403;  // 4183
    unsigned long long v404;  // x22
    unsigned long long v54;  // x21
    unsigned long v405;  // 4194
    unsigned long long v406;  // x23
    unsigned long v407;  // 4201
    unsigned long long v408;  // x24
    unsigned long v409;  // 4208
    unsigned long long v410;  // x25
    unsigned long v411;  // 4215
    unsigned long long v412;  // x26
    unsigned long long v413;  // cc_dep1
    unsigned long v414;  // cc_dep2
    unsigned long long v19;  // x22
    unsigned long v55;  // x15
    unsigned long v415;  // cc_ndep
    unsigned long v416;  // x4
    unsigned long v417;  // x6
    unsigned long v418;  // x7
    unsigned long v419;  // x8
    unsigned long v420;  // x9
    unsigned long v421;  // x10
    unsigned long v422;  // x11
    unsigned long long m;  // x27
    unsigned long v424;  // x12
    unsigned long v56;  // 4314
    unsigned long v425;  // x13
    unsigned long v426;  // x1
    unsigned long v427;  // x14
    unsigned long v428;  // 4186
    unsigned long v429;  // x15
    unsigned long v430;  // x16
    unsigned long v431;  // x17
    unsigned long v432;  // x14
    unsigned long v433;  // 4209
    unsigned long long v434;  // x20
    unsigned long long v57;  // x22
    unsigned long v435;  // x15
    unsigned long v436;  // 4220
    unsigned long long v437;  // x21
    unsigned long v438;  // x16
    unsigned long v439;  // 4231
    unsigned long long v440;  // x22
    unsigned long v441;  // x17
    unsigned long v442;  // 4242
    unsigned long long v443;  // x23
    unsigned long v444;  // x14
    unsigned long v58;  // x16
    unsigned long v445;  // 4253
    unsigned long long v446;  // x24
    unsigned long v447;  // x15
    unsigned long v448;  // 4264
    unsigned long long v449;  // x25
    unsigned long v450;  // x16
    unsigned long v451;  // 4275
    unsigned long long v452;  // x26
    unsigned long v453;  // x17
    unsigned long v454;  // 4286
    unsigned long v59;  // 4325
    void* v455;  // x2
    unsigned long v456;  // x14
    unsigned long v457;  // 4298
    unsigned long v458;  // x15
    unsigned long v459;  // 4309
    unsigned long v460;  // x16
    unsigned long v461;  // 4320
    unsigned long v462;  // 4335
    unsigned long v463;  // 4342
    unsigned long v464;  // 4349
    unsigned long long v60;  // x23
    unsigned long long v465;  // x6
    unsigned long long v466;  // x7
    void* v467;  // x16
    unsigned long long v468;  // x8
    unsigned long long v469;  // x9
    unsigned long long v470;  // x10
    unsigned long long v471;  // x11
    unsigned long long v472;  // x12
    unsigned long v473;  // x13
    unsigned long v61;  // x17
    unsigned long v475;  // 4157
    unsigned long v477;  // 4168
    unsigned long v479;  // 4175
    unsigned long v481;  // 4186
    unsigned long v483;  // 4193
    unsigned long v62;  // 4336
    unsigned long v485;  // 4204
    unsigned long v487;  // 4211
    unsigned long v489;  // 4325
    unsigned long v490;  // 4326
    unsigned long v491;  // 4327
    unsigned long v492;  // 4328
    unsigned long v493;  // 4329
    unsigned long v494;  // 4330
    unsigned long long v63;  // x24
    unsigned long v495;  // 4331
    unsigned long v496;  // 4332
    unsigned long v497;  // 4333
    unsigned long long *v498;  // x2
    unsigned long long v499;  // x14
    unsigned long long v500;  // 4123
    unsigned long long v501;  // x15
    unsigned long long k;  // x27
    unsigned long long *v503;  // x3
    unsigned long long v504;  // 4192
    unsigned long v64;  // x14
    unsigned long v505;  // x6
    unsigned long v506;  // x7
    unsigned long long v507;  // 4204
    unsigned long long v508;  // 4216
    unsigned long v509;  // x8
    unsigned long v510;  // x9
    unsigned long long v511;  // 4228
    unsigned long long v512;  // 4240
    unsigned long v513;  // x10
    unsigned long v514;  // x11
    unsigned long long v20;  // x23
    unsigned long v65;  // 4347
    unsigned long long v515;  // 4252
    unsigned long v516;  // x12
    unsigned long v517;  // x13
    unsigned long v518;  // x19
    char *v519;  // x20
    unsigned long v520;  // x23
    unsigned long v521;  // x24
    unsigned long v522;  // x25
    unsigned long v523;  // x26
    unsigned long long v524;  // 4284
    unsigned long long v66;  // x25
    unsigned long long v525;  // 4296
    unsigned long long v526;  // 4172
    unsigned long long v527;  // x2
    unsigned long long *v528;  // x1
    unsigned long long v529;  // x6
    unsigned long long v530;  // x7
    unsigned long long v531;  // 4184
    unsigned long long v532;  // 4196
    unsigned long long v533;  // x8
    unsigned long long v534;  // x9
    unsigned long v67;  // x15
    unsigned long long v535;  // 4208
    unsigned long long v536;  // 4220
    unsigned long v537;  // x19
    unsigned long long v538;  // x20
    unsigned long long v539;  // 4232
    unsigned long long v540;  // x21
    unsigned long long v541;  // x22
    unsigned long v542;  // 4244
    unsigned long v543;  // cc_dep1
    unsigned long v544;  // cc_ndep
    unsigned long v68;  // 4358
    unsigned long long v545;  // x27
    unsigned long long v546;  // 4108
    unsigned long long v547;  // x14
    unsigned long long v548;  // 4111
    unsigned long long v549;  // x15
    unsigned long long v550;  // 4121
    unsigned long long v551;  // 4121
    unsigned long long v552;  // x16
    unsigned long long v553;  // 4114
    unsigned long long v554;  // x17
    unsigned long long v69;  // x26
    unsigned long long v555;  // 4108
    unsigned long long v556;  // 4105
    unsigned long v557;  // x14
    unsigned long long v558;  // 4111
    unsigned long long v559;  // x15
    unsigned long long v560;  // 4111
    unsigned long long v561;  // x16
    unsigned long long v562;  // 4105
    unsigned long long v563;  // 4105
    unsigned long v70;  // x16
    unsigned long long v565;  // 4177
    unsigned long long v566;  // x28
    unsigned long long *v567;  // x1
    unsigned long long v568;  // 4188
    unsigned long long v569;  // 4198
    unsigned long long v570;  // 4208
    unsigned long long v571;  // x9
    unsigned long long v572;  // 4218
    unsigned long long v573;  // 4228
    unsigned long long v574;  // x11
    unsigned long long *v71;  // x2
    unsigned long long v575;  // 4238
    unsigned long long v576;  // 4248
    unsigned long long v577;  // x13
    unsigned long v578;  // 4258
    unsigned long v579;  // cc_dep1
    unsigned long v580;  // cc_ndep
    unsigned long long v581;  // 4273
    unsigned long long v582;  // x6
    unsigned long long v583;  // 4105
    unsigned long long v584;  // 4105
    unsigned long v72;  // 4373
    unsigned long long v585;  // x7
    unsigned long long v586;  // 4105
    unsigned long long v587;  // 4105
    unsigned long long v588;  // x8
    unsigned long long v589;  // 4105
    unsigned long long v590;  // 4105
    unsigned long long v591;  // 4113
    unsigned long long v592;  // x10
    unsigned long long v593;  // 4105
    unsigned long long v594;  // 4105
    unsigned long v73;  // x17
    unsigned long long v595;  // 4113
    unsigned long long v596;  // x12
    unsigned long long v597;  // 4105
    unsigned long long v598;  // 4105
    unsigned long v74;  // 4384
    unsigned long long v21;  // x24
    unsigned long long v75;  // x22
    unsigned long v76;  // x14
    unsigned long v77;  // 4395
    unsigned long long v78;  // x23
    unsigned long v79;  // 4406
    unsigned long long v80;  // x24
    unsigned long v81;  // x16
    unsigned long v82;  // 4417
    unsigned long long v83;  // x25
    unsigned long v84;  // x17
    unsigned long long v22;  // x25
    unsigned long v85;  // 4428
    unsigned long long v86;  // x26
    unsigned long v87;  // x14
    unsigned long v88;  // 4439
    unsigned long long v89;  // x19
    unsigned long v90;  // x15
    unsigned long v91;  // x16
    unsigned long v92;  // 4454
    unsigned long long v93;  // x23
    unsigned long v94;  // x17
    unsigned long long v23;  // x26
    unsigned long v95;  // 4465
    unsigned long long v96;  // x24
    unsigned long v97;  // x14
    unsigned long v98;  // 4476
    unsigned long long v99;  // x25
    unsigned long v100;  // x15
    unsigned long v101;  // 4487
    unsigned long long v102;  // x26
    unsigned long v103;  // x16
    unsigned long v104;  // 4498
    unsigned long long v24;  // x27
    unsigned long long v105;  // x19
    unsigned long v106;  // x17
    unsigned long long *v107;  // x2
    unsigned long v108;  // 4513
    unsigned long v109;  // x14
    unsigned long v110;  // 4524
    unsigned long long v111;  // x24
    unsigned long v112;  // 4535
    unsigned long long v113;  // x25
    unsigned long v114;  // x16
    st_9da2c0_0 *v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long *v12;  // [bp-0x20]
    unsigned long v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    if (a1 != a2)
        goto LABEL_0x9daca0;
    v0 = &v14;
    v1 = v15;
    v2 = v16;
    v3 = v17;
    v4 = v18;
    v5 = v19;
    v6 = v20;
    v7 = v21;
    v8 = v22;
    v9 = v23;
    v10 = v24;
    v11 = v25;
    v12 = a0;
    v26 = *(long long *)a1;
    v27 = (long long)a1[8];
    v28 = (long long)a1[16];
    v29 = (long long)a1[24];
    v30 = (long long)a1[32];
    v31 = (long long)a1[40];
    v32 = (long long)a1[48];
    v33 = (long long)a1[56];
    iter = &(&v0)[-2 * a5];
    v35 = a5 * 8;
    xsp = (int)iter;
    v36 = v35 - 64;
    while (1)
    {
        memset(iter + 8, 0, 64);
        iter += 16;
        if (!v36)
            break;
        v36 -= 64;
        memset(iter, 0, 64);
    }
    v37 = a1 + v35;
    v38 = a1 + 64;
    v39 = 0;
    v40 = 0;
    v41 = 0;
    v42 = 0;
    v43 = 0;
    v44 = 0;
    v45 = 0;
    v46 = 0;
    iter2 = (unsigned long long *)xsp;
    v13 = *a4;
    while (1)
    {
        v48 = v26 * v27;
        v49 = v26 * v28;
        v50 = v26 * v29;
        v51 = v26 * v30;
        v52 = v26 * v31;
        v53 = arm64g_calculate_flag_c(2, v40, v48, 0);
        v54 = v41 + v49 + v53;
        v55 = v26 * v32;
        v56 = arm64g_calculate_flag_c(6, v41, v49, v53);
        v57 = v42 + v50 + v56;
        v58 = v26 * v33;
        v59 = arm64g_calculate_flag_c(6, v42, v50, v56);
        v60 = v43 + v51 + v59;
        v61 = v27 * v26 >> 64;
        v62 = arm64g_calculate_flag_c(6, v43, v51, v59);
        v63 = v44 + v52 + v62;
        v64 = v28 * v26 >> 64;
        v65 = arm64g_calculate_flag_c(6, v44, v52, v62);
        v66 = v45 + v55 + v65;
        v67 = v29 * v26 >> 64;
        v68 = arm64g_calculate_flag_c(6, v45, v55, v65);
        v69 = v46 + v58 + v68;
        v70 = v30 * v26 >> 64;
        *iter2 = v39;
        iter2[1] = v40 + v48;
        v71 = iter2 + 2;
        v72 = arm64g_calculate_flag_c(6, v46, v58, v68);
        v73 = v31 * v26 >> 64;
        v74 = arm64g_calculate_flag_c(2, v54, v61, 0);
        v75 = v57 + v64 + v74;
        v76 = v32 * v26 >> 64;
        v77 = arm64g_calculate_flag_c(6, v57, v64, v74);
        v78 = v60 + v67 + v77;
        v79 = arm64g_calculate_flag_c(6, v60, v67, v77);
        v80 = v63 + v70 + v79;
        v81 = v27 * v28;
        v82 = arm64g_calculate_flag_c(6, v63, v70, v79);
        v83 = v66 + v73 + v82;
        v84 = v27 * v29;
        v85 = arm64g_calculate_flag_c(6, v66, v73, v82);
        v86 = v69 + v76 + v85;
        v87 = v27 * v30;
        v88 = arm64g_calculate_flag_c(6, v69, v76, v85);
        v89 = v72 + (v33 * v26 >> 64) + v88;
        v90 = v27 * v31;
        v91 = v27 * v32;
        v92 = arm64g_calculate_flag_c(2, v75, v81, 0);
        v93 = v78 + v84 + v92;
        v94 = v27 * v33;
        v95 = arm64g_calculate_flag_c(6, v78, v84, v92);
        v96 = v80 + v87 + v95;
        v97 = v28 * v27 >> 64;
        v98 = arm64g_calculate_flag_c(6, v80, v87, v95);
        v99 = v83 + v90 + v98;
        v100 = v29 * v27 >> 64;
        v101 = arm64g_calculate_flag_c(6, v83, v90, v98);
        v102 = v86 + v91 + v101;
        v103 = v30 * v27 >> 64;
        v104 = arm64g_calculate_flag_c(6, v86, v91, v101);
        v105 = v89 + v94 + v104;
        v106 = v31 * v27 >> 64;
        *v71 = v54 + v61;
        v71[1] = v75 + v81;
        v107 = v71 + 2;
        v108 = arm64g_calculate_flag_c(6, v89, v94, v104);
        v109 = v32 * v27 >> 64;
        v110 = arm64g_calculate_flag_c(2, v93, v97, 0);
        v111 = v96 + v100 + v110;
        v112 = arm64g_calculate_flag_c(6, v96, v100, v110);
        v113 = v99 + v103 + v112;
        v114 = v28 * v29;
        v115 = arm64g_calculate_flag_c(6, v99, v103, v112);
        v116 = v102 + v106 + v115;
        v117 = v28 * v30;
        v118 = arm64g_calculate_flag_c(6, v102, v106, v115);
        v119 = v105 + v109 + v118;
        v120 = v28 * v31;
        v121 = arm64g_calculate_flag_c(6, v105, v109, v118);
        v122 = v108 + (v33 * v27 >> 64) + v121;
        v123 = v28 * v32;
        v124 = v28 * v33;
        v125 = arm64g_calculate_flag_c(2, v111, v114, 0);
        v126 = v113 + v117 + v125;
        v127 = v29 * v28 >> 64;
        v128 = arm64g_calculate_flag_c(6, v113, v117, v125);
        v129 = v116 + v120 + v128;
        v130 = v30 * v28 >> 64;
        v131 = arm64g_calculate_flag_c(6, v116, v120, v128);
        v132 = v119 + v123 + v131;
        v133 = v31 * v28 >> 64;
        v134 = arm64g_calculate_flag_c(6, v119, v123, v131);
        v135 = v122 + v124 + v134;
        v136 = v32 * v28 >> 64;
        *v107 = v93 + v97;
        v107[1] = v111 + v114;
        v137 = v107 + 2;
        v138 = arm64g_calculate_flag_c(6, v122, v124, v134);
        v139 = arm64g_calculate_flag_c(2, v126, v127, 0);
        v140 = v129 + v130 + v139;
        v141 = v29 * v30;
        v142 = arm64g_calculate_flag_c(6, v129, v130, v139);
        v143 = v132 + v133 + v142;
        v144 = v29 * v31;
        v145 = arm64g_calculate_flag_c(6, v132, v133, v142);
        v146 = v135 + v136 + v145;
        v147 = v29 * v32;
        v148 = arm64g_calculate_flag_c(6, v135, v136, v145);
        v149 = v138 + (v33 * v28 >> 64) + v148;
        v150 = v29 * v33;
        v151 = v140 + v141;
        v152 = v30 * v29 >> 64;
        v153 = arm64g_calculate_flag_c(2, v140, v141, 0);
        v154 = v143 + v144 + v153;
        v155 = v31 * v29 >> 64;
        v156 = arm64g_calculate_flag_c(6, v143, v144, v153);
        v157 = v146 + v147 + v156;
        v158 = v32 * v29 >> 64;
        v159 = arm64g_calculate_flag_c(6, v146, v147, v156);
        v160 = v149 + v150 + v159;
        *v137 = v126 + v127;
        v137[1] = v151;
        iter2 = v137 + 2;
        v161 = arm64g_calculate_flag_c(6, v149, v150, v159);
        v162 = v154 + v152;
        v163 = v30 * v31;
        v164 = arm64g_calculate_flag_c(2, v154, v152, 0);
        v165 = v157 + v155 + v164;
        v166 = v30 * v32;
        v167 = arm64g_calculate_flag_c(6, v157, v155, v164);
        v168 = v160 + v158 + v167;
        v169 = v30 * v33;
        v170 = arm64g_calculate_flag_c(6, v160, v158, v167);
        v171 = v161 + (v33 * v29 >> 64) + v170;
        v172 = v31 * v30 >> 64;
        v173 = v165 + v163;
        v174 = v32 * v30 >> 64;
        v175 = arm64g_calculate_flag_c(2, v165, v163, 0);
        v176 = v168 + v166 + v175;
        v177 = arm64g_calculate_flag_c(6, v168, v166, v175);
        v178 = v171 + v169 + v177;
        v179 = v31 * v32;
        v180 = arm64g_calculate_flag_c(6, v171, v169, v177);
        v181 = v176 + v172;
        v182 = v31 * v33;
        v183 = arm64g_calculate_flag_c(2, v176, v172, 0);
        v184 = v178 + v174 + v183;
        v185 = v32 * v31 >> 64;
        v186 = arm64g_calculate_flag_c(6, v178, v174, v183);
        v187 = v180 + (v33 * v30 >> 64) + v186;
        v188 = v184 + v179;
        v189 = v32 * v33;
        v190 = arm64g_calculate_flag_c(2, v184, v179, 0);
        v191 = v187 + v182 + v190;
        v192 = arm64g_calculate_flag_c(6, v187, v182, v190);
        v193 = v191 + v185;
        v194 = arm64g_calculate_flag_c(2, v191, v185, 0);
        v195 = v192 + (v33 * v31 >> 64) + v194;
        v196 = v195 + v189;
        v197 = v37 - v35;
        v198 = arm64g_calculate_flag_c(2, v195, v189, 0);
        v199 = v198 + (v33 * v32 >> 64);
        if (!(v37 - v38))
            break;
        v200 = iter2[7];
        v39 = v162 + *iter2;
        v201 = arm64g_calculate_flag_c(2, v162, *iter2, 0);
        v40 = v173 + iter2[1] + v201;
        v202 = *(long long *)v38;
        v203 = (long long)v38[8];
        v204 = arm64g_calculate_flag_c(6, v173, iter2[1], v201);
        v41 = v181 + iter2[2] + v204;
        v205 = arm64g_calculate_flag_c(6, v181, iter2[2], v204);
        v42 = v188 + iter2[3] + v205;
        v206 = (long long)v38[16];
        v207 = (long long)v38[24];
        v208 = arm64g_calculate_flag_c(6, v188, iter2[3], v205);
        v43 = v193 + iter2[4] + v208;
        v209 = arm64g_calculate_flag_c(6, v193, iter2[4], v208);
        v44 = v196 + iter2[5] + v209;
        v210 = (long long)v38[32];
        v211 = (long long)v38[40];
        v212 = arm64g_calculate_flag_c(6, v196, iter2[5], v209);
        v45 = v199 + iter2[6] + v212;
        v213 = v38;
        v214 = arm64g_calculate_flag_c(6, v199, iter2[6], v212);
        v46 = iter2[7] + v214;
        v215 = 0;
        v216 = (long long)v38[48];
        v217 = (long long)v38[56];
        iter1 = v38 + 64;
        l = 0xffffffffffffffc0;
        while (1)
        {
            do
            {
                v220 = v26 * v202;
                v221 = arm64g_calculate_flag_c(6, v215, v200, v214);
                v222 = v26 * v203;
                l += 8;
                v223 = v26 * v206;
                v224 = v26 * v207;
                v225 = v26 * v210;
                v226 = arm64g_calculate_flag_c(2, v39, v220, 0);
                v227 = v40 + v222 + v226;
                v228 = v26 * v211;
                v229 = arm64g_calculate_flag_c(6, v40, v222, v226);
                v230 = v41 + v223 + v229;
                v231 = v26 * v216;
                v232 = arm64g_calculate_flag_c(6, v41, v223, v229);
                v233 = v42 + v224 + v232;
                v234 = v26 * v217;
                v235 = arm64g_calculate_flag_c(6, v42, v224, v232);
                v236 = v43 + v225 + v235;
                v237 = v202 * v26 >> 64;
                v238 = arm64g_calculate_flag_c(6, v43, v225, v235);
                v239 = v44 + v228 + v238;
                v240 = v203 * v26 >> 64;
                v241 = arm64g_calculate_flag_c(6, v44, v228, v238);
                v242 = v45 + v231 + v241;
                v243 = v206 * v26 >> 64;
                v244 = arm64g_calculate_flag_c(6, v45, v231, v241);
                v245 = v46 + v234 + v244;
                v246 = v207 * v26 >> 64;
                v247 = arm64g_calculate_flag_c(6, v46, v234, v244);
                v215 = v221 + v247;
                *iter2 = v39 + v220;
                iter2 += 1;
                v39 = v227 + v237;
                v248 = v210 * v26 >> 64;
                v249 = arm64g_calculate_flag_c(2, v227, v237, 0);
                v40 = v230 + v240 + v249;
                v250 = v211 * v26 >> 64;
                v251 = arm64g_calculate_flag_c(6, v230, v240, v249);
                v41 = v233 + v243 + v251;
                v252 = v216 * v26 >> 64;
                v253 = arm64g_calculate_flag_c(6, v233, v243, v251);
                v42 = v236 + v246 + v253;
                v200 = v217 * v26 >> 64;
                v26 = *(long long *)((char *)v213 + l);
                v254 = arm64g_calculate_flag_c(6, v236, v246, v253);
                v43 = v239 + v248 + v254;
                v255 = arm64g_calculate_flag_c(6, v239, v248, v254);
                v44 = v242 + v250 + v255;
                v256 = arm64g_calculate_flag_c(6, v242, v250, v255);
                v45 = v245 + v252 + v256;
                v214 = arm64g_calculate_flag_c(6, v245, v252, v256);
                v46 = v215 + v200 + v214;
            } while (l);
            if (iter1 == v37)
                break;
            v26 = *(long long *)((char *)v213 - 64);
            v258 = arm64g_calculate_flag_c(2, v39, *iter2, 0);
            v202 = *(long long *)iter1;
            v203 = (long long)iter1[8];
            v260 = arm64g_calculate_flag_c(6, v40, iter2[1], v258);
            v262 = arm64g_calculate_flag_c(6, v41, iter2[2], v260);
            v206 = (long long)iter1[16];
            v207 = (long long)iter1[24];
            v264 = arm64g_calculate_flag_c(6, v42, iter2[3], v262);
            v266 = arm64g_calculate_flag_c(6, v43, iter2[4], v264);
            v210 = (long long)iter1[32];
            v211 = (long long)iter1[40];
            v268 = arm64g_calculate_flag_c(6, v44, iter2[5], v266);
            l = 0xffffffffffffffc0;
            v270 = arm64g_calculate_flag_c(6, v45, iter2[6], v268);
            v215 = v46;
            v200 = iter2[7];
            v214 = v270;
            v216 = (long long)iter1[48];
            v217 = (long long)iter1[56];
            iter1 += 64;
            v39 += *iter2;
            v40 = v40 + iter2[1] + v258;
            v41 = v41 + iter2[2] + v260;
            v42 = v42 + iter2[3] + v262;
            v43 = v43 + iter2[4] + v264;
            v44 = v44 + iter2[5] + v266;
            v45 = v45 + iter2[6] + v268;
            v46 = v46 + iter2[7] + v270;
        }
        v26 = *(long long *)v213;
        v27 = (long long)v213[8];
        v38 = v213 + 64;
        v28 = (long long)v213[16];
        v29 = (long long)v213[24];
        v272 = v37 - v38;
        v30 = (long long)v213[32];
        v31 = (long long)v213[40];
        v273 = (char *)iter2 - v272;
        v32 = (long long)v213[48];
        v33 = (long long)v213[56];
        if (v272)
        {
            *iter2 = v39;
            iter2[1] = v40;
            v39 = *v273;
            v40 = v273[1];
            iter2[2] = v41;
            iter2[3] = v42;
            v41 = v273[2];
            v42 = v273[3];
            iter2[4] = v43;
            iter2[5] = v44;
            v43 = v273[4];
            v44 = v273[5];
            iter2[6] = v45;
            iter2[7] = v46;
            iter2 = v273;
            v45 = v273[6];
            v46 = v273[7];
        }
    }
    v274 = *(long long *)v197;
    v275 = (long long)v197[8];
    v276 = *(long long *)(xsp + 8);
    v277 = *(long long *)(xsp + 16);
    v278 = (long long)v197[16];
    v279 = (long long)v197[24];
    v280 = v197 + 32;
    v281 = *(long long *)(xsp + 24);
    v282 = *(long long *)(xsp + 32);
    *iter2 = v162;
    iter2[1] = v173;
    v283 = v274 * v274;
    iter2[2] = v181;
    iter2[3] = v188;
    v284 = v274 * v274 >> 64;
    iter2[4] = v193;
    iter2[5] = v196;
    v285 = v275 * v275;
    iter2[6] = v199;
    iter2[7] = v151;
    v286 = v275 * v275 >> 64;
    v287 = v284 + v276 * 2;
    v288 = 2;
    v289 = v276 * 2;
    v290 = 0;
    v291 = v277 * 2 | v276 >> 63;
    i = v35 - 32;
    node = (void*)xsp;
    do
    {
        v294 = arm64g_calculate_flag_c(v288, v284, v289, v290);
        v295 = v281 * 2 | v277 >> 63;
        i -= 32;
        v296 = arm64g_calculate_flag_c(6, v285, v291, v294);
        v297 = (long long)node[40];
        v298 = (long long)node[48];
        v299 = v278 * v278;
        v300 = *v280;
        v301 = v280[1];
        v302 = v280 + 2;
        v303 = v278 * v278 >> 64;
        v304 = v279 * v279;
        v305 = v279 * v279 >> 64;
        v306 = v282 * 2 | v281 >> 63;
        *(unsigned long *)node = v283;
        *(unsigned long long *)&node[8] = v287;
        v307 = arm64g_calculate_flag_c(6, v286, v295, v296);
        v308 = v297 * 2 | v282 >> 63;
        *(unsigned long *)&node[16] = v285 + v291 + v294;
        *(unsigned long *)&node[24] = v286 + v295 + v296;
        v309 = arm64g_calculate_flag_c(6, v299, v306, v307);
        v310 = (long long)node[56];
        v311 = (long long)node[64];
        v312 = v298 * 2 | v297 >> 63;
        v313 = arm64g_calculate_flag_c(6, v303, v308, v309);
        v314 = v310 * 2 | v298 >> 63;
        v315 = arm64g_calculate_flag_c(6, v304, v312, v313);
        v316 = (long long)node[72];
        v277 = (long long)node[80];
        v317 = v300 * v300;
        v278 = *v302;
        v279 = v302[1];
        v280 = v302 + 2;
        v318 = v300 * v300 >> 64;
        v285 = v301 * v301;
        v286 = v301 * v301 >> 64;
        *(unsigned long *)&node[32] = v299 + v306 + v307;
        *(unsigned long *)&node[40] = v303 + v308 + v309;
        v319 = v311 * 2 | v310 >> 63;
        *(unsigned long *)&node[48] = v304 + v312 + v313;
        *(unsigned long *)&node[56] = v305 + v314 + v315;
        node += 64;
        v320 = arm64g_calculate_flag_c(6, v305, v314, v315);
        v283 = v317 + v319 + v320;
        v321 = v316 * 2 | v311 >> 63;
        v322 = arm64g_calculate_flag_c(6, v317, v319, v320);
        v287 = v318 + v321 + v322;
        v288 = 6;
        v284 = v318;
        v289 = v321;
        v290 = v322;
        v281 = (long long)node[24];
        v282 = (long long)node[32];
        v291 = v277 * 2 | v316 >> 63;
    } while (i);
    v323 = v13;
    v324 = arm64g_calculate_flag_c(6, v284, v289, v290);
    v325 = v281 * 2 | v277 >> 63;
    v326 = arm64g_calculate_flag_c(6, v285, v291, v324);
    v327 = (long long)node[40];
    v328 = (long long)node[48];
    v329 = v278 * v278;
    v330 = v278 * v278 >> 64;
    *(unsigned long *)node = v283;
    *(unsigned long long *)&node[8] = v287;
    v331 = v279 * v279;
    *(unsigned long *)&node[16] = v285 + v291 + v324;
    *(unsigned long *)&node[24] = v286 + v325 + v326;
    v332 = v282 * 2 | v281 >> 63;
    v333 = arm64g_calculate_flag_c(6, v286, v325, v326);
    v334 = v327 * 2 | v282 >> 63;
    v335 = *(long long *)xsp;
    v336 = *(long long *)(xsp + 8);
    v337 = arm64g_calculate_flag_c(6, v329, v332, v333);
    v338 = v328 * 2 | v327 >> 63;
    v339 = *(long long *)a3;
    v340 = (long long)a3[8];
    v341 = arm64g_calculate_flag_c(6, v330, v334, v337);
    v342 = (long long)a3[16];
    v343 = (long long)a3[24];
    v344 = arm64g_calculate_flag_c(6, v331, v338, v341);
    v345 = (long long)a3[32];
    v346 = (long long)a3[40];
    v347 = v335 * v323;
    v348 = (long long)a3[48];
    v349 = (long long)a3[56];
    v350 = a3 + v35;
    v351 = *(long long *)(xsp + 16);
    v352 = *(long long *)(xsp + 24);
    *(unsigned long *)&node[32] = v329 + v332 + v333;
    *(unsigned long *)&node[40] = v330 + v334 + v337;
    v353 = *(long long *)(xsp + 32);
    v354 = *(long long *)(xsp + 40);
    *(unsigned long *)&node[48] = v331 + v338 + v341;
    *(unsigned long *)&node[56] = (v279 * v279 >> 64) + (v328 >> 63) + v344;
    v355 = *(long long *)(xsp + 48);
    v356 = *(long long *)(xsp + 56);
    v357 = a3 + 64;
    v497 = 0;
    v358 = (void*)xsp;
    j = 8;
    while (1)
    {
        do
        {
            v360 = v347 * v340;
            j -= 1;
            v361 = v347 * v342;
            *(unsigned long long *)v358 = v347;
            v358 += 8;
            v362 = v347 * v343;
            v363 = v347 * v345;
            v364 = arm64g_calculate_flag_c(4, v335, 1, 0);
            v365 = v336 + v360 + v364;
            v366 = v347 * v346;
            v367 = arm64g_calculate_flag_c(6, v336, v360, v364);
            v368 = v351 + v361 + v367;
            v369 = v347 * v348;
            v370 = arm64g_calculate_flag_c(6, v351, v361, v367);
            v371 = v352 + v362 + v370;
            v372 = v347 * v349;
            v373 = arm64g_calculate_flag_c(6, v352, v362, v370);
            v374 = v353 + v363 + v373;
            v375 = v339 * v347 >> 64;
            v376 = arm64g_calculate_flag_c(6, v353, v363, v373);
            v377 = v354 + v366 + v376;
            v378 = v340 * v347 >> 64;
            v379 = arm64g_calculate_flag_c(6, v354, v366, v376);
            v380 = v355 + v369 + v379;
            v381 = v342 * v347 >> 64;
            v382 = arm64g_calculate_flag_c(6, v355, v369, v379);
            v383 = v356 + v372 + v382;
            v384 = v343 * v347 >> 64;
            v385 = arm64g_calculate_flag_c(6, v356, v372, v382);
            v335 = v365 + v375;
            v386 = v345 * v347 >> 64;
            v387 = arm64g_calculate_flag_c(2, v365, v375, 0);
            v336 = v368 + v378 + v387;
            v388 = v346 * v347 >> 64;
            v389 = arm64g_calculate_flag_c(6, v368, v378, v387);
            v351 = v371 + v381 + v389;
            v390 = v348 * v347 >> 64;
            v391 = arm64g_calculate_flag_c(6, v371, v381, v389);
            v352 = v374 + v384 + v391;
            v393 = arm64g_calculate_flag_c(6, v374, v384, v391);
            v353 = v377 + v386 + v393;
            v394 = arm64g_calculate_flag_c(6, v377, v386, v393);
            v354 = v380 + v388 + v394;
            v395 = arm64g_calculate_flag_c(6, v380, v388, v394);
            v355 = v383 + v390 + v395;
            v396 = arm64g_calculate_flag_c(6, v383, v390, v395);
            v356 = v385 + (v349 * v347 >> 64) + v396;
            v347 = v335 * v323;
        } while (j);
        v397 = v358;
        v398 = v335 + *(long long *)v358;
        v399 = arm64g_calculate_flag_c(2, v335, *(long long *)v358, 0);
        v400 = v336 + (long long)v358[8] + v399;
        v401 = arm64g_calculate_flag_c(6, v336, (long long)v358[8], v399);
        v402 = v351 + (long long)v358[16] + v401;
        v403 = arm64g_calculate_flag_c(6, v351, (long long)v358[16], v401);
        v404 = v352 + (long long)v358[24] + v403;
        v405 = arm64g_calculate_flag_c(6, v352, (long long)v358[24], v403);
        v406 = v353 + (long long)v358[32] + v405;
        v407 = arm64g_calculate_flag_c(6, v353, (long long)v358[32], v405);
        v408 = v354 + (long long)v358[40] + v407;
        v409 = arm64g_calculate_flag_c(6, v354, (long long)v358[40], v407);
        v410 = v355 + (long long)v358[48] + v409;
        v411 = arm64g_calculate_flag_c(6, v355, (long long)v358[48], v409);
        v412 = v356 + (long long)v358[56] + v411;
        v413 = v356;
        v414 = (long long)v358[56];
        v415 = v411;
        if (!(v350 - v357))
            break;
        v416 = *(long long *)((char *)v358 - 64);
        v417 = *(long long *)v357;
        v418 = *(long long *)(v357 + 8);
        v419 = *(long long *)(v357 + 16);
        v420 = *(long long *)(v357 + 24);
        v421 = *(long long *)(v357 + 32);
        v422 = *(long long *)(v357 + 40);
        m = 0xffffffffffffffc0;
        v424 = *(long long *)(v357 + 48);
        v425 = *(long long *)(v357 + 56);
        v426 = v357 + 64;
        while (1)
        {
            do
            {
                v427 = v416 * v417;
                v428 = arm64g_calculate_flag_c(6, v413, v414, v415);
                v429 = v416 * v418;
                m += 8;
                v430 = v416 * v419;
                v431 = v416 * v420;
                v432 = v416 * v421;
                v433 = arm64g_calculate_flag_c(2, v398, v427, 0);
                v434 = v400 + v429 + v433;
                v435 = v416 * v422;
                v436 = arm64g_calculate_flag_c(6, v400, v429, v433);
                v437 = v402 + v430 + v436;
                v438 = v416 * v424;
                v439 = arm64g_calculate_flag_c(6, v402, v430, v436);
                v440 = v404 + v431 + v439;
                v441 = v416 * v425;
                v442 = arm64g_calculate_flag_c(6, v404, v431, v439);
                v443 = v406 + v432 + v442;
                v444 = v417 * v416 >> 64;
                v445 = arm64g_calculate_flag_c(6, v406, v432, v442);
                v446 = v408 + v435 + v445;
                v447 = v418 * v416 >> 64;
                v448 = arm64g_calculate_flag_c(6, v408, v435, v445);
                v449 = v410 + v438 + v448;
                v450 = v419 * v416 >> 64;
                v451 = arm64g_calculate_flag_c(6, v410, v438, v448);
                v452 = v412 + v441 + v451;
                v453 = v420 * v416 >> 64;
                v454 = arm64g_calculate_flag_c(6, v412, v441, v451);
                v413 = v428 + v454;
                *(unsigned long *)v358 = v398 + v427;
                v455 = v358 + 8;
                v398 = v434 + v444;
                v456 = v421 * v416 >> 64;
                v457 = arm64g_calculate_flag_c(2, v434, v444, 0);
                v400 = v437 + v447 + v457;
                v458 = v422 * v416 >> 64;
                v459 = arm64g_calculate_flag_c(6, v437, v447, v457);
                v402 = v440 + v450 + v459;
                v460 = v424 * v416 >> 64;
                v461 = arm64g_calculate_flag_c(6, v440, v450, v459);
                v404 = v443 + v453 + v461;
                v414 = v425 * v416 >> 64;
                v416 = *(long long *)((char *)v397 + m);
                v462 = arm64g_calculate_flag_c(6, v443, v453, v461);
                v406 = v446 + v456 + v462;
                v463 = arm64g_calculate_flag_c(6, v446, v456, v462);
                v408 = v449 + v458 + v463;
                v464 = arm64g_calculate_flag_c(6, v449, v458, v463);
                v410 = v452 + v460 + v464;
                v415 = arm64g_calculate_flag_c(6, v452, v460, v464);
                v412 = v413 + v414 + v415;
                v358 = v455;
            } while (m);
            v465 = *(long long *)v455;
            v466 = (long long)v455[8];
            v467 = v350 - v35;
            v468 = (long long)v455[16];
            v469 = (long long)v455[24];
            v470 = (long long)v455[32];
            v471 = (long long)v455[40];
            v472 = (long long)v455[48];
            v473 = (long long)v455[56];
            if (!(v350 - v426))
                break;
            v416 = *(long long *)((char *)v397 - 64);
            v475 = arm64g_calculate_flag_c(2, v398, v465, 0);
            v417 = *(long long *)v426;
            v418 = *(long long *)(v426 + 8);
            v477 = arm64g_calculate_flag_c(6, v400, v466, v475);
            v479 = arm64g_calculate_flag_c(6, v402, v468, v477);
            v419 = *(long long *)(v426 + 16);
            v420 = *(long long *)(v426 + 24);
            v481 = arm64g_calculate_flag_c(6, v404, v469, v479);
            v483 = arm64g_calculate_flag_c(6, v406, v470, v481);
            v421 = *(long long *)(v426 + 32);
            v422 = *(long long *)(v426 + 40);
            v485 = arm64g_calculate_flag_c(6, v408, v471, v483);
            m = 0xffffffffffffffc0;
            v487 = arm64g_calculate_flag_c(6, v410, v472, v485);
            v413 = v412;
            v414 = v473;
            v415 = v487;
            v424 = *(long long *)(v426 + 48);
            v425 = *(long long *)(v426 + 56);
            v426 += 64;
            v358 = v455;
            v398 += v465;
            v400 = v400 + v466 + v475;
            v402 = v402 + v468 + v477;
            v404 = v404 + v469 + v479;
            v406 = v406 + v470 + v481;
            v408 = v408 + v471 + v483;
            v410 = v410 + v472 + v485;
            v412 = v412 + v473 + v487;
        }
        v323 = v13;
        v489 = arm64g_calculate_flag_c(4, v497, 1, 0);
        v490 = arm64g_calculate_flag_c(6, v398, v465, v489);
        v335 = *(long long *)v397;
        v336 = (long long)v397[8];
        v491 = arm64g_calculate_flag_c(6, v400, v466, v490);
        v339 = *(long long *)v467;
        v340 = (long long)v467[8];
        v492 = arm64g_calculate_flag_c(6, v402, v468, v491);
        v342 = (long long)v467[16];
        v343 = (long long)v467[24];
        v493 = arm64g_calculate_flag_c(6, v404, v469, v492);
        v494 = arm64g_calculate_flag_c(6, v406, v470, v493);
        v345 = (long long)v467[32];
        v346 = (long long)v467[40];
        v495 = arm64g_calculate_flag_c(6, v408, v471, v494);
        v496 = arm64g_calculate_flag_c(6, v410, v472, v495);
        v348 = (long long)v467[48];
        v349 = (long long)v467[56];
        v357 = v467 + 64;
        v497 = arm64g_calculate_flag_c(6, v412, v473, v496);
        v347 = v335 * v323;
        *(unsigned long *)v455 = v398 + v465 + v489;
        *(unsigned long *)&v455[8] = v400 + v466 + v490;
        *(unsigned long *)&v455[16] = v402 + v468 + v491;
        *(unsigned long *)&v455[24] = v404 + v469 + v492;
        v351 = (long long)v397[16];
        v352 = (long long)v397[24];
        *(unsigned long *)&v455[32] = v406 + v470 + v493;
        *(unsigned long *)&v455[40] = v408 + v471 + v494;
        v353 = (long long)v397[32];
        v354 = (long long)v397[40];
        *(unsigned long *)&v455[48] = v410 + v472 + v495;
        *(unsigned long *)&v455[56] = v412 + v473 + v496;
        v358 = v397;
        v355 = (long long)v397[48];
        v356 = (long long)v397[56];
        j = 8;
        if (v455 + 64 == &v0)
        {
            v498 = v358 + 64;
            v499 = v335 - v339;
            v500 = arm64g_calculate_flag_c(4, v335, v339, 0);
            v501 = v336 - v340 - (v500 ^ 1);
            k = v35 - 64;
            v503 = v12;
            do
            {
                v504 = arm64g_calculate_flag_c(8, v336, v340, v500);
                v505 = *(long long *)v357;
                v506 = *(long long *)(v357 + 8);
                v507 = arm64g_calculate_flag_c(8, v351, v342, v504);
                *v12 = v499;
                v12[1] = v501;
                v508 = arm64g_calculate_flag_c(8, v352, v343, v507);
                v509 = *(long long *)(v357 + 16);
                v510 = *(long long *)(v357 + 24);
                v511 = arm64g_calculate_flag_c(8, v353, v345, v508);
                v12[2] = v351 - v342 - (v504 ^ 1);
                v12[3] = v352 - v343 - (v507 ^ 1);
                v512 = arm64g_calculate_flag_c(8, v354, v346, v511);
                v513 = *(long long *)(v357 + 32);
                v514 = *(long long *)(v357 + 40);
                v515 = arm64g_calculate_flag_c(8, v355, v348, v512);
                v516 = *(long long *)(v357 + 48);
                v517 = *(long long *)(v357 + 56);
                v357 += 64;
                v518 = *v498;
                v519 = v498[1];
                k -= 64;
                v351 = v498[2];
                v352 = v498[3];
                v520 = v498[4];
                v521 = v498[5];
                v522 = v498[6];
                v523 = v498[7];
                v498 += 8;
                v12[4] = v353 - v345 - (v508 ^ 1);
                v12[5] = v354 - v346 - (v511 ^ 1);
                v524 = arm64g_calculate_flag_c(8, v356, v349, v515);
                v499 = v518 - v505 - (v524 ^ 1);
                v12[6] = v355 - v348 - (v512 ^ 1);
                v12[7] = v356 - v349 - (v515 ^ 1);
                v12 += 8;
                v525 = arm64g_calculate_flag_c(8, v518, v505, v524);
                v501 = &v519[-1 * v506 + -1 * (v525 ^ 1)];
                v336 = v519;
                v340 = v506;
                v500 = v525;
                v353 = v520;
                v354 = v521;
                v355 = v522;
                v356 = v523;
                v342 = v509;
                v343 = v510;
                v345 = v513;
                v346 = v514;
                v348 = v516;
                v349 = v517;
            } while (k);
            v526 = arm64g_calculate_flag_c(8, v336, v340, v500);
            v527 = xsp;
            v528 = xsp + v35;
            v529 = *v503;
            v530 = v503[1];
            v531 = arm64g_calculate_flag_c(8, v351, v509, v526);
            *v12 = v499;
            v12[1] = v501;
            v532 = arm64g_calculate_flag_c(8, v352, v510, v531);
            v533 = v503[2];
            v534 = v503[3];
            v535 = arm64g_calculate_flag_c(8, v520, v513, v532);
            v12[2] = v351 - v509 - (v526 ^ 1);
            v12[3] = v352 - v510 - (v531 ^ 1);
            v536 = arm64g_calculate_flag_c(8, v521, v514, v535);
            v537 = *v528;
            v538 = v528[1];
            v539 = arm64g_calculate_flag_c(8, v522, v516, v536);
            v540 = v528[2];
            v541 = v528[3];
            v542 = arm64g_calculate_flag_c(8, v523, v517, v539);
            v543 = v497;
            v544 = v542;
            v12[4] = v520 - v513 - (v532 ^ 1);
            v12[5] = v521 - v514 - (v535 ^ 1);
            v12[6] = v522 - v516 - (v536 ^ 1);
            v12[7] = v523 - v517 - (v539 ^ 1);
            v545 = v35 - 64;
            v546 = arm64g_calculate_condition(56, v543, 0, v544);
            if (!(v546 & 1))
                goto LABEL_9dab86;
            while (1)
            {
                v547 = v537;
                while (1)
                {
                    *(unsigned long long *)v527 = 0;
                    *(unsigned long long *)(v527 + 8) = 0;
                    v548 = arm64g_calculate_condition(56, v543, 0, v544);
                    if (v548 & 1)
                    {
                        v549 = v538;
                        v529 = v503[4];
                        v530 = v503[5];
                        v537 = v528[4];
                        v538 = v528[5];
                        v550 = arm64g_calculate_condition(56, v543, 0, v544);
                        if (!(v550 & 1))
                            goto LABEL_9dab9a;
                        goto LABEL_9dab99;
                    }
                    else
                    {
                        v549 = v530;
                        v529 = v503[4];
                        v530 = v503[5];
                        v537 = v528[4];
                        v538 = v528[5];
                        v551 = arm64g_calculate_condition(56, v543, 0, v544);
                        if (v551 & 1)
                        {
LABEL_9dab99:
                            v552 = v540;
                            goto LABEL_9dab9c;
                        }
                        else
                        {
LABEL_9dab9a:
                            v552 = v533;
LABEL_9dab9c:
                            *(unsigned long long *)(v527 + 16) = 0;
                            *(unsigned long long *)(v527 + 24) = 0;
                            v527 += 32;
                            v553 = arm64g_calculate_condition(56, v543, 0, v544);
                            if (v553 & 1)
                                v554 = v541;
                            else
                                v554 = v534;
                            v533 = v503[6];
                            v534 = v503[7];
                            v540 = v528[6];
                            v541 = v528[7];
                            v528 += 4;
                            *v503 = v547;
                            v503[1] = v549;
                            v503[2] = v552;
                            v503[3] = v554;
                            v503 += 4;
                            memset(v528, 0, 32);
                            if (!v545)
                            {
                                v556 = arm64g_calculate_condition(56, v543, 0, v544);
                                if (v556 & 1)
                                    v557 = v537;
                                else
                                    v557 = v529;
                                *(unsigned long long *)v527 = 0;
                                *(unsigned long long *)(v527 + 8) = 0;
                                v558 = arm64g_calculate_condition(56, v543, 0, v544);
                                if (v558 & 1)
                                    v559 = v538;
                                else
                                    v559 = v530;
                                *(unsigned long long *)(v527 + 16) = 0;
                                *(unsigned long long *)(v527 + 24) = 0;
                                v560 = arm64g_calculate_condition(56, v543, 0, v544);
                                if (v560 & 1)
                                {
                                    v561 = v540;
                                    v562 = arm64g_calculate_condition(56, v543, 0, v544);
                                    if (!(v562 & 1))
                                    {
                                        *v503 = v557;
                                        v503[1] = v559;
                                        v503[2] = v561;
                                        v503[3] = v534;
                                        return 1;
                                    }
                                }
                                else
                                {
                                    v561 = v533;
                                    v563 = arm64g_calculate_condition(56, v543, 0, v544);
                                    if (!(v563 & 1))
                                    {
                                        *v503 = v557;
                                        v503[1] = v559;
                                        v503[2] = v561;
                                        v503[3] = v534;
                                        return 1;
                                    }
                                }
                                *v503 = v557;
                                v503[1] = v559;
                                v503[2] = v561;
                                v503[3] = v541;
                                return 1;
                            }
                            v545 -= 32;
                            v555 = arm64g_calculate_condition(56, v543, 0, v544);
                            if (v555 & 1)
                                break;
LABEL_9dab86:
                            v547 = v529;
                        }
                    }
                }
            }
        }
    }
    v565 = arm64g_calculate_flag_c(6, v413, (long long)v358[56], v415);
    v566 = v565;
    v567 = v12;
    v568 = arm64g_calculate_flag_c(4, v398, v339, 0);
    *(unsigned long long *)xsp = 0;
    *(unsigned long long *)(xsp + 8) = 0;
    v569 = arm64g_calculate_flag_c(8, v400, v340, v568);
    *(unsigned long long *)(xsp + 16) = 0;
    *(unsigned long long *)(xsp + 24) = 0;
    v570 = arm64g_calculate_flag_c(8, v402, v342, v569);
    v571 = v404 - v343 - (v570 ^ 1);
    *(unsigned long long *)(xsp + 32) = 0;
    *(unsigned long long *)(xsp + 40) = 0;
    v572 = arm64g_calculate_flag_c(8, v404, v343, v570);
    *(unsigned long long *)(xsp + 48) = 0;
    *(unsigned long long *)(xsp + 56) = 0;
    v573 = arm64g_calculate_flag_c(8, v406, v345, v572);
    v574 = v408 - v346 - (v573 ^ 1);
    *(unsigned long long *)(xsp + 64) = 0;
    *(unsigned long long *)(xsp + 72) = 0;
    v575 = arm64g_calculate_flag_c(8, v408, v346, v573);
    *(unsigned long long *)(xsp + 80) = 0;
    *(unsigned long long *)(xsp + 88) = 0;
    v576 = arm64g_calculate_flag_c(8, v410, v348, v575);
    v577 = v412 - v349 - (v576 ^ 1);
    *(unsigned long long *)(xsp + 96) = 0;
    *(unsigned long long *)(xsp + 104) = 0;
    v578 = arm64g_calculate_flag_c(8, v412, v349, v576);
    v579 = v566;
    v580 = v578;
    *(unsigned long long *)(xsp + 112) = 0;
    *(unsigned long long *)(xsp + 120) = 0;
    v581 = arm64g_calculate_condition(56, v566, 0, v578);
    if (v581 & 1)
    {
        v582 = v398;
        v583 = arm64g_calculate_condition(56, v579, 0, v580);
        if (!(v583 & 1))
            goto LABEL_9dac46;
LABEL_9dac45:
        v585 = v400;
        v586 = arm64g_calculate_condition(56, v579, 0, v580);
        if (!(v586 & 1))
            goto LABEL_9dac4a;
LABEL_9dac49:
        v588 = v402;
        v589 = arm64g_calculate_condition(56, v579, 0, v580);
        if (!(v589 & 1))
            goto LABEL_9dac4e;
LABEL_9dac4d:
        v571 = v404;
    }
    else
    {
        v582 = v398 - v339;
        v584 = arm64g_calculate_condition(56, v579, 0, v580);
        if (v584 & 1)
            goto LABEL_9dac45;
LABEL_9dac46:
        v585 = v400 - v340 - (v568 ^ 1);
        v587 = arm64g_calculate_condition(56, v579, 0, v580);
        if (v587 & 1)
            goto LABEL_9dac49;
LABEL_9dac4a:
        v588 = v402 - v342 - (v569 ^ 1);
        v590 = arm64g_calculate_condition(56, v579, 0, v580);
        if (v590 & 1)
            goto LABEL_9dac4d;
LABEL_9dac4e:
    }
    *v567 = v582;
    v567[1] = v585;
    v591 = arm64g_calculate_condition(56, v579, 0, v580);
    if (v591 & 1)
    {
        v592 = v406;
        v593 = arm64g_calculate_condition(56, v579, 0, v580);
        if (!(v593 & 1))
            goto LABEL_9dac5a;
LABEL_9dac59:
        v574 = v408;
    }
    else
    {
        v592 = v406 - v345 - (v572 ^ 1);
        v594 = arm64g_calculate_condition(56, v579, 0, v580);
        if (v594 & 1)
            goto LABEL_9dac59;
LABEL_9dac5a:
    }
    v567[2] = v588;
    v567[3] = v571;
    v595 = arm64g_calculate_condition(56, v579, 0, v580);
    if (v595 & 1)
    {
        v596 = v410;
        v597 = arm64g_calculate_condition(56, v579, 0, v580);
        if (!(v597 & 1))
            goto LABEL_9dac66;
LABEL_9dac65:
        v577 = v412;
    }
    else
    {
        v596 = v410 - v348 - (v575 ^ 1);
        v598 = arm64g_calculate_condition(56, v579, 0, v580);
        if (v598 & 1)
            goto LABEL_9dac65;
LABEL_9dac66:
    }
    v567[4] = v592;
    v567[5] = v574;
    v567[6] = v596;
    v567[7] = v577;
    return 1;
}
