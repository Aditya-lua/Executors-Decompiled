/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ba8c0..0x9bb300 (2624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ba8c0_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char padding_30[144];
    unsigned int field_c0;
} st_9ba8c0_2;

typedef struct st_9ba8c0_0 {
    uint128_t field_0;
    unsigned int field_c;
} st_9ba8c0_0;

typedef struct st_9ba8c0_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    char padding_60[144];
    unsigned int field_f0;
} st_9ba8c0_1;


long long sub_9ba8c0(unsigned long a0, unsigned long a1, int a2, st_9ba8c0_1 *a3, st_9ba8c0_0 *a4)
{
    unsigned long long v21;  // x30
    unsigned long long v22;  // d8
    uint128_t v31;  // q24
    uint128_t v121;  // 4141
    uint128_t v122;  // 4143
    uint128_t v123;  // 4147
    uint128_t v124;  // 4149
    uint128_t v125;  // 4153
    uint128_t v126;  // 4155
    uint128_t v127;  // 4159
    uint128_t v128;  // 4161
    uint128_t v129;  // 4165
    uint128_t v130;  // 4167
    uint128_t v32;  // q3
    uint128_t v131;  // q2
    st_9ba8c0_2 *v132;  // x7
    uint128_t v133;  // 4175
    uint128_t v134;  // 4177
    uint128_t v135;  // 4181
    uint128_t v136;  // 4183
    uint128_t v137;  // 4187
    uint128_t v138;  // 4189
    uint128_t v139;  // 4193
    uint128_t v140;  // 4195
    uint128_t v33;  // q2
    uint128_t v141;  // 4199
    uint128_t v142;  // 4201
    uint128_t v143;  // 4205
    uint128_t v144;  // 4207
    uint128_t v145;  // 4211
    uint128_t v146;  // 4213
    uint128_t v147;  // 4217
    uint128_t v148;  // 4219
    uint128_t v149;  // 4223
    uint128_t v150;  // 4225
    uint128_t *v34;  // x7
    uint128_t v151;  // 4229
    uint128_t v152;  // 4231
    uint128_t v153;  // 4235
    uint128_t v154;  // 4237
    uint128_t v155;  // 4241
    uint128_t v156;  // 4243
    uint128_t v157;  // q3
    uint128_t *v158;  // x7
    uint128_t v159;  // 4251
    uint128_t v160;  // 4253
    int v35;  // w6
    uint128_t v161;  // 4263
    uint128_t v162;  // 4265
    uint128_t v163;  // 4275
    uint128_t v164;  // 4277
    uint128_t v165;  // 4294
    uint128_t v166;  // 4296
    uint128_t v167;  // 4320
    uint128_t v168;  // 4322
    uint128_t v169;  // 4346
    uint128_t v170;  // 4348
    unsigned int v36;  // w8
    uint128_t v171;  // 4372
    uint128_t v172;  // 4374
    uint128_t v173;  // 4392
    uint128_t v174;  // 4394
    uint128_t v175;  // 4412
    uint128_t v176;  // 4414
    uint128_t v177;  // 4425
    uint128_t v178;  // 4427
    uint128_t v179;  // 4431
    uint128_t v180;  // 4433
    unsigned long v37;  // x8
    uint128_t v181;  // 4437
    uint128_t v182;  // 4439
    uint128_t v183;  // q2
    uint128_t v184;  // 4099
    uint128_t v185;  // 4101
    uint128_t v186;  // 4105
    uint128_t v187;  // 4107
    uint128_t v188;  // 4111
    uint128_t v189;  // 4113
    uint128_t v190;  // 4117
    uint128_t v38;  // q25
    uint128_t v191;  // 4119
    uint128_t v192;  // 4129
    uint128_t v193;  // 4131
    uint128_t v194;  // 4135
    uint128_t v195;  // 4137
    uint128_t v196;  // 4141
    uint128_t v197;  // 4143
    uint128_t v198;  // 4147
    uint128_t v199;  // 4149
    uint128_t v200;  // 4159
    uint128_t v39;  // q26
    uint128_t v201;  // 4161
    uint128_t v202;  // 4165
    uint128_t v203;  // 4167
    uint128_t v204;  // 4171
    uint128_t v205;  // 4173
    uint128_t v206;  // 4177
    uint128_t v207;  // 4179
    uint128_t v208;  // 4197
    uint128_t v209;  // 4199
    uint128_t v210;  // 4203
    unsigned long v40;  // x8
    uint128_t v211;  // 4209
    uint128_t v212;  // 4215
    uint128_t v213;  // 4221
    uint128_t v214;  // 4227
    uint128_t v215;  // 4233
    uint128_t v216;  // 4239
    uint128_t v217;  // 4245
    uint128_t v218;  // 4251
    uint128_t v219;  // 4257
    uint128_t v220;  // 4263
    unsigned long long v23;  // d9
    uint128_t v41;  // q27
    int j;  // w6
    uint128_t v222;  // 4099
    uint128_t v223;  // 4101
    uint128_t v224;  // 4105
    uint128_t v225;  // 4107
    uint128_t v226;  // 4111
    uint128_t v227;  // 4113
    uint128_t v228;  // 4117
    uint128_t v229;  // 4119
    uint128_t v230;  // 4123
    uint128_t v42;  // q28
    uint128_t v231;  // 4125
    uint128_t v232;  // 4129
    uint128_t v233;  // 4131
    st_9ba8c0_2 *v234;  // x7
    int v235;  // w6
    uint128_t v236;  // 4145
    uint128_t v237;  // 4147
    uint128_t v238;  // 4151
    uint128_t v239;  // 4153
    uint128_t v240;  // 4157
    uint128_t v43;  // q29
    uint128_t v241;  // 4159
    uint128_t v242;  // 4163
    uint128_t v243;  // 4165
    uint128_t v244;  // 4169
    uint128_t v245;  // 4171
    uint128_t v246;  // 4175
    uint128_t v247;  // 4177
    uint128_t v248;  // 4099
    uint128_t v249;  // 4101
    uint128_t v250;  // 4105
    unsigned long long v44;  // x19
    uint128_t v251;  // 4107
    uint128_t v252;  // 4111
    uint128_t v253;  // 4113
    uint128_t v254;  // 4117
    uint128_t v255;  // 4119
    uint128_t v256;  // 4123
    uint128_t v257;  // 4125
    uint128_t v258;  // 4129
    uint128_t v259;  // 4131
    uint128_t v260;  // q2
    unsigned long long v45;  // x20
    st_9ba8c0_2 *v261;  // x7
    uint128_t v262;  // 4139
    uint128_t v263;  // 4141
    uint128_t v264;  // 4145
    uint128_t v265;  // 4147
    uint128_t v266;  // 4151
    uint128_t v267;  // 4153
    uint128_t v268;  // 4157
    uint128_t v269;  // 4159
    uint128_t v270;  // 4163
    unsigned long long v46;  // x21
    uint128_t v271;  // 4165
    uint128_t v272;  // 4169
    uint128_t v273;  // 4171
    uint128_t v274;  // q3
    uint128_t *v275;  // x7
    uint128_t v276;  // 4179
    uint128_t v277;  // 4181
    uint128_t v278;  // 4191
    uint128_t v279;  // 4193
    uint128_t v280;  // 4203
    unsigned long long v47;  // x22
    uint128_t v281;  // 4205
    uint128_t v282;  // 4222
    uint128_t v283;  // 4224
    uint128_t v284;  // 4242
    uint128_t v285;  // 4244
    uint128_t v286;  // 4262
    uint128_t v287;  // 4264
    uint128_t v288;  // q2
    uint128_t v289;  // 4279
    uint128_t v290;  // 4281
    unsigned long long v48;  // x23
    uint128_t v291;  // 4285
    uint128_t v292;  // 4287
    uint128_t v293;  // 4297
    uint128_t v294;  // 4299
    uint128_t v295;  // 4303
    uint128_t v296;  // 4305
    uint128_t v297;  // 4313
    uint128_t v298;  // 4315
    uint128_t v299;  // 4319
    uint128_t v300;  // 4321
    unsigned long long v49;  // x24
    uint128_t v301;  // 4333
    uint128_t v302;  // 4335
    uint128_t v303;  // 4339
    uint128_t v304;  // 4345
    uint128_t v305;  // 4351
    uint128_t v306;  // 4357
    uint128_t v307;  // 4363
    int k;  // w6
    uint128_t v309;  // 4099
    uint128_t v310;  // 4101
    uint128_t v50;  // q30
    uint128_t v311;  // 4105
    uint128_t v312;  // 4107
    uint128_t v313;  // 4111
    uint128_t v314;  // 4113
    st_9ba8c0_2 *v315;  // x7
    int v316;  // w6
    uint128_t v317;  // 4127
    uint128_t v318;  // 4129
    uint128_t v319;  // 4133
    uint128_t v320;  // 4135
    unsigned long long v24;  // d10
    uint128_t v51;  // q31
    uint128_t v321;  // 4139
    uint128_t v322;  // 4141
    uint128_t v323;  // 4099
    uint128_t v324;  // 4101
    uint128_t v325;  // 4105
    uint128_t v326;  // 4107
    uint128_t v327;  // 4117
    uint128_t v328;  // 4119
    uint128_t v329;  // q2
    st_9ba8c0_2 *v330;  // x7
    uint128_t v52;  // q8
    uint128_t v331;  // 4128
    uint128_t v332;  // 4130
    uint128_t v333;  // 4134
    uint128_t v334;  // 4136
    uint128_t v335;  // 4140
    uint128_t v336;  // 4142
    uint128_t v337;  // q3
    uint128_t *v338;  // x7
    uint128_t v339;  // 4154
    uint128_t v340;  // 4156
    uint128_t v53;  // q9
    uint128_t v341;  // 4160
    uint128_t v342;  // 4162
    uint128_t v343;  // 4169
    uint128_t v344;  // 4171
    uint128_t v345;  // q2
    uint128_t v346;  // 4182
    uint128_t v347;  // 4184
    uint128_t v348;  // 4188
    uint128_t v349;  // 4190
    uint128_t v350;  // 4201
    uint128_t v54;  // q10
    uint128_t v351;  // 4203
    uint128_t v352;  // q3
    uint128_t v353;  // 4222
    uint128_t v354;  // 4224
    uint128_t v355;  // 4228
    uint128_t v356;  // 4230
    uint128_t v357;  // 4241
    uint128_t v358;  // 4243
    int l;  // w6
    uint128_t v360;  // 4099
    uint128_t v55;  // q11
    uint128_t v361;  // 4101
    uint128_t v362;  // 4105
    uint128_t v363;  // 4107
    st_9ba8c0_2 *v364;  // x7
    int v365;  // w6
    uint128_t v366;  // 4121
    uint128_t v367;  // 4123
    uint128_t v368;  // 4127
    uint128_t v369;  // 4129
    uint128_t v370;  // 4099
    int i;  // w6
    uint128_t v371;  // 4101
    uint128_t v372;  // 4105
    uint128_t v373;  // 4107
    uint128_t v374;  // q2
    st_9ba8c0_2 *v375;  // x7
    uint128_t v376;  // 4115
    uint128_t v377;  // 4117
    uint128_t v378;  // 4121
    uint128_t v379;  // 4123
    uint128_t v380;  // q3
    uint128_t v57;  // 4099
    uint128_t *v381;  // x7
    uint128_t v382;  // 4135
    uint128_t v383;  // 4137
    uint128_t v384;  // 4141
    uint128_t v385;  // 4143
    uint128_t v386;  // q2
    uint128_t v387;  // 4151
    uint128_t v388;  // 4153
    uint128_t v389;  // 4157
    uint128_t v390;  // 4159
    uint128_t v58;  // 4101
    uint128_t v391;  // q3
    uint128_t v392;  // 4167
    uint128_t v393;  // 4169
    uint128_t v394;  // 4173
    uint128_t v395;  // 4175
    int m;  // w6
    uint128_t v397;  // 4099
    uint128_t v398;  // 4101
    st_9ba8c0_2 *v399;  // x7
    int v400;  // w6
    uint128_t v59;  // 4105
    uint128_t v401;  // 4115
    uint128_t v402;  // 4117
    uint128_t v403;  // 4099
    uint128_t v404;  // 4101
    st_9ba8c0_2 *v405;  // x7
    uint128_t v406;  // 4109
    uint128_t v407;  // 4111
    uint128_t *v408;  // x7
    uint128_t v409;  // 4122
    uint128_t v410;  // 4124
    uint128_t v60;  // 4107
    uint128_t v411;  // 4132
    uint128_t v412;  // 4134
    uint128_t v413;  // 4142
    uint128_t v414;  // 4144
    unsigned long long v25;  // d11
    uint128_t v61;  // 4111
    uint128_t v62;  // 4113
    uint128_t v63;  // 4117
    uint128_t v64;  // 4119
    uint128_t v65;  // 4123
    uint128_t v66;  // 4125
    uint128_t v67;  // 4129
    uint128_t v68;  // 4131
    uint128_t v69;  // 4135
    uint128_t v70;  // 4137
    unsigned long long v26;  // d12
    uint128_t v71;  // 4141
    uint128_t v72;  // 4143
    uint128_t v73;  // 4147
    uint128_t v74;  // 4149
    uint128_t v75;  // 4153
    uint128_t v76;  // 4155
    uint128_t v77;  // 4159
    uint128_t v78;  // 4161
    uint128_t v79;  // 4165
    uint128_t v80;  // 4167
    unsigned long long v27;  // d13
    st_9ba8c0_2 *v81;  // x7
    int v82;  // w6
    uint128_t v83;  // 4181
    uint128_t v84;  // 4183
    uint128_t v85;  // 4187
    uint128_t v86;  // 4189
    uint128_t v87;  // 4193
    uint128_t v88;  // 4195
    uint128_t v89;  // 4199
    uint128_t v90;  // 4201
    unsigned long long v28;  // d14
    uint128_t v91;  // 4205
    uint128_t v92;  // 4207
    uint128_t v93;  // 4211
    uint128_t v94;  // 4213
    uint128_t v95;  // 4217
    uint128_t v96;  // 4219
    uint128_t v97;  // 4223
    uint128_t v98;  // 4225
    uint128_t v99;  // 4229
    uint128_t v100;  // 4231
    unsigned long long v29;  // d15
    uint128_t v101;  // 4235
    uint128_t v102;  // 4237
    uint128_t v103;  // 4241
    uint128_t v104;  // 4243
    uint128_t v105;  // 4247
    uint128_t v106;  // 4249
    uint128_t v107;  // 4099
    uint128_t v108;  // 4101
    uint128_t v109;  // 4105
    uint128_t v110;  // 4107
    unsigned long v30;  // x8
    uint128_t v111;  // 4111
    uint128_t v112;  // 4113
    uint128_t v113;  // 4117
    uint128_t v114;  // 4119
    uint128_t v115;  // 4123
    uint128_t v116;  // 4125
    uint128_t v117;  // 4129
    uint128_t v118;  // 4131
    uint128_t v119;  // 4135
    uint128_t v120;  // 4137
    unsigned long long v0;  // [bp-0xc0]
    unsigned long long v1;  // [bp-0xb8]
    unsigned long long v2;  // [bp-0xa0]
    unsigned long long v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x78]
    unsigned long long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x68]
    unsigned long long v8;  // [bp-0x60]
    unsigned long long v9;  // [bp-0x58]
    char *v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x48]
    unsigned long long v12;  // [bp-0x40]
    unsigned long long v13;  // [bp-0x38]
    unsigned long long v14;  // [bp-0x30]
    unsigned long long v15;  // [bp-0x28]
    unsigned long long v16;  // [bp-0x20]
    unsigned long long v17;  // [bp-0x18]
    unsigned long long v18;  // [bp-0x10]
    unsigned long long v19;  // [bp-0x8]
    char v20;  // [bp+0x0]

    v10 = &v20;
    v11 = v21;
    v12 = v22;
    v13 = v23;
    v14 = v24;
    v15 = v25;
    v16 = v26;
    v17 = v27;
    v18 = v28;
    v19 = v29;
    v30 = *(int *)((char *)&a4->field_0 + 12);
    v31 = a4->field_0;
    v32 = a3->field_10;
    v33 = a3->field_0;
    v34 = &a3->field_20;
    v35 = a3->field_f0 - 6;
    v36 = (((((v30 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v30 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v30 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v30 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v37 = v36 + 2;
    v38 = _INSERT(v31, 12, ((((((v36 + 1) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v36 + 1) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v36 + 1) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v36 + 1) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
    if (a2 > 2)
    {
        v39 = _INSERT(v31, 12, (((((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
        if (a2 >= 6)
        {
            v40 = (unsigned int)v37 + 3;
            v41 = _INSERT(v31, 12, (((((((unsigned int)v37 + 1) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v37 + 1) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((((unsigned int)v37 + 1) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v37 + 1) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
            v42 = _INSERT(v31, 12, (((((((unsigned int)v37 + 2) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v37 + 2) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((((unsigned int)v37 + 2) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v37 + 2) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
            v43 = _INSERT(v31, 12, (((((v40 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v40 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v40 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v40 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
            if ((unsigned long long)(a2 - 3) >= 9)
            {
                v8 = v44;
                v9 = v45;
                v6 = v46;
                v7 = v47;
                v4 = v48;
                v5 = v49;
                v2 = v22;
                v3 = v23;
                v0 = v24;
                v1 = v25;
                v50 = _INSERT(v31, 12, (((((((unsigned int)v40 + 1) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 1) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((((unsigned int)v40 + 1) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 1) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                v51 = _INSERT(v31, 12, (((((((unsigned int)v40 + 2) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 2) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((((unsigned int)v40 + 2) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 2) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                v52 = _INSERT(v31, 12, (((((((unsigned int)v40 + 3) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 3) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((((unsigned int)v40 + 3) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 3) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                v53 = _INSERT(v31, 12, (((((((unsigned int)v40 + 4) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 4) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((((unsigned int)v40 + 4) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 4) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                v54 = _INSERT(v31, 12, (((((((unsigned int)v40 + 5) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 5) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((((unsigned int)v40 + 5) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 5) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                v55 = _INSERT(v31, 12, (((((((unsigned int)v40 + 6) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 6) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((((unsigned int)v40 + 6) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v40 + 6) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                do
                {
                    i = v35;
                    v57 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v33) >> 64), (unsigned long long)v31 ^ (unsigned long long)v33);
                    v58 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v57 >> 64), (unsigned long long)v57);
                    v59 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v33) >> 64), (unsigned long long)v38 ^ (unsigned long long)v33);
                    v60 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v59 >> 64), (unsigned long long)v59);
                    v61 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v39 ^ v33) >> 64), (unsigned long long)v39 ^ (unsigned long long)v33);
                    v62 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v61 >> 64), (unsigned long long)v61);
                    v63 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v41 ^ v33) >> 64), (unsigned long long)v41 ^ (unsigned long long)v33);
                    v64 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v63 >> 64), (unsigned long long)v63);
                    v65 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v42 ^ v33) >> 64), (unsigned long long)v42 ^ (unsigned long long)v33);
                    v66 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v65 >> 64), (unsigned long long)v65);
                    v67 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v43 ^ v33) >> 64), (unsigned long long)v43 ^ (unsigned long long)v33);
                    v68 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v67 >> 64), (unsigned long long)v67);
                    v69 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v50 ^ v33) >> 64), (unsigned long long)v50 ^ (unsigned long long)v33);
                    v70 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v69 >> 64), (unsigned long long)v69);
                    v71 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v51 ^ v33) >> 64), (unsigned long long)v51 ^ (unsigned long long)v33);
                    v72 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v71 >> 64), (unsigned long long)v71);
                    v73 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v52 ^ v33) >> 64), (unsigned long long)v52 ^ (unsigned long long)v33);
                    v74 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v73 >> 64), (unsigned long long)v73);
                    v75 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v53 ^ v33) >> 64), (unsigned long long)v53 ^ (unsigned long long)v33);
                    v76 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v75 >> 64), (unsigned long long)v75);
                    v77 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v54 ^ v33) >> 64), (unsigned long long)v54 ^ (unsigned long long)v33);
                    v78 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v77 >> 64), (unsigned long long)v77);
                    v79 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v55 ^ v33) >> 64), (unsigned long long)v55 ^ (unsigned long long)v33);
                    v80 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v79 >> 64), (unsigned long long)v79);
                    v33 = *v34;
                    v81 = v34 + 1;
                    v82 = i - 2;
                    v83 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v58 ^ v32) >> 64), (unsigned long long)v58 ^ (unsigned long long)v32);
                    v84 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v83 >> 64), (unsigned long long)v83);
                    v31 = v84;
                    v85 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v60 ^ v32) >> 64), (unsigned long long)v60 ^ (unsigned long long)v32);
                    v86 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v85 >> 64), (unsigned long long)v85);
                    v38 = v86;
                    v87 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v62 ^ v32) >> 64), (unsigned long long)v62 ^ (unsigned long long)v32);
                    v88 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v87 >> 64), (unsigned long long)v87);
                    v39 = v88;
                    v89 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v64 ^ v32) >> 64), (unsigned long long)v64 ^ (unsigned long long)v32);
                    v90 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v89 >> 64), (unsigned long long)v89);
                    v41 = v90;
                    v91 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v66 ^ v32) >> 64), (unsigned long long)v66 ^ (unsigned long long)v32);
                    v92 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v91 >> 64), (unsigned long long)v91);
                    v42 = v92;
                    v93 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v68 ^ v32) >> 64), (unsigned long long)v68 ^ (unsigned long long)v32);
                    v94 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v93 >> 64), (unsigned long long)v93);
                    v43 = v94;
                    v95 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v70 ^ v32) >> 64), (unsigned long long)v70 ^ (unsigned long long)v32);
                    v96 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v95 >> 64), (unsigned long long)v95);
                    v50 = v96;
                    v97 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v72 ^ v32) >> 64), (unsigned long long)v72 ^ (unsigned long long)v32);
                    v98 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v97 >> 64), (unsigned long long)v97);
                    v51 = v98;
                    v99 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v74 ^ v32) >> 64), (unsigned long long)v74 ^ (unsigned long long)v32);
                    v100 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v99 >> 64), (unsigned long long)v99);
                    v52 = v100;
                    v101 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v76 ^ v32) >> 64), (unsigned long long)v76 ^ (unsigned long long)v32);
                    v102 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v101 >> 64), (unsigned long long)v101);
                    v53 = v102;
                    v103 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v78 ^ v32) >> 64), (unsigned long long)v78 ^ (unsigned long long)v32);
                    v104 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v103 >> 64), (unsigned long long)v103);
                    v54 = v104;
                    v105 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v80 ^ v32) >> 64), (unsigned long long)v80 ^ (unsigned long long)v32);
                    v106 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v105 >> 64), (unsigned long long)v105);
                    v55 = v106;
                    v32 = v81->field_0;
                    v34 = &v81->field_10;
                    v35 = v82;
                } while (2 < i);
                v107 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v33) >> 64), (unsigned long long)v31 ^ (unsigned long long)v33);
                v108 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v107 >> 64), (unsigned long long)v107);
                v109 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v33) >> 64), (unsigned long long)v38 ^ (unsigned long long)v33);
                v110 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v109 >> 64), (unsigned long long)v109);
                v111 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v39 ^ v33) >> 64), (unsigned long long)v39 ^ (unsigned long long)v33);
                v112 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v111 >> 64), (unsigned long long)v111);
                v113 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v41 ^ v33) >> 64), (unsigned long long)v41 ^ (unsigned long long)v33);
                v114 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v113 >> 64), (unsigned long long)v113);
                v115 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v42 ^ v33) >> 64), (unsigned long long)v42 ^ (unsigned long long)v33);
                v116 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v115 >> 64), (unsigned long long)v115);
                v117 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v43 ^ v33) >> 64), (unsigned long long)v43 ^ (unsigned long long)v33);
                v118 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v117 >> 64), (unsigned long long)v117);
                v119 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v50 ^ v33) >> 64), (unsigned long long)v50 ^ (unsigned long long)v33);
                v120 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v119 >> 64), (unsigned long long)v119);
                v121 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v51 ^ v33) >> 64), (unsigned long long)v51 ^ (unsigned long long)v33);
                v122 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v121 >> 64), (unsigned long long)v121);
                v123 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v52 ^ v33) >> 64), (unsigned long long)v52 ^ (unsigned long long)v33);
                v124 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v123 >> 64), (unsigned long long)v123);
                v125 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v53 ^ v33) >> 64), (unsigned long long)v53 ^ (unsigned long long)v33);
                v126 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v125 >> 64), (unsigned long long)v125);
                v127 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v54 ^ v33) >> 64), (unsigned long long)v54 ^ (unsigned long long)v33);
                v128 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v127 >> 64), (unsigned long long)v127);
                v129 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v55 ^ v33) >> 64), (unsigned long long)v55 ^ (unsigned long long)v33);
                v130 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v129 >> 64), (unsigned long long)v129);
                v131 = *v34;
                v132 = v34 + 1;
                v133 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v108 ^ v32) >> 64), (unsigned long long)v108 ^ (unsigned long long)v32);
                v134 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v133 >> 64), (unsigned long long)v133);
                v135 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v110 ^ v32) >> 64), (unsigned long long)v110 ^ (unsigned long long)v32);
                v136 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v135 >> 64), (unsigned long long)v135);
                v137 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v112 ^ v32) >> 64), (unsigned long long)v112 ^ (unsigned long long)v32);
                v138 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v137 >> 64), (unsigned long long)v137);
                v139 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v114 ^ v32) >> 64), (unsigned long long)v114 ^ (unsigned long long)v32);
                v140 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v139 >> 64), (unsigned long long)v139);
                v141 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v116 ^ v32) >> 64), (unsigned long long)v116 ^ (unsigned long long)v32);
                v142 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v141 >> 64), (unsigned long long)v141);
                v143 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v118 ^ v32) >> 64), (unsigned long long)v118 ^ (unsigned long long)v32);
                v144 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v143 >> 64), (unsigned long long)v143);
                v145 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v120 ^ v32) >> 64), (unsigned long long)v120 ^ (unsigned long long)v32);
                v146 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v145 >> 64), (unsigned long long)v145);
                v147 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v122 ^ v32) >> 64), (unsigned long long)v122 ^ (unsigned long long)v32);
                v148 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v147 >> 64), (unsigned long long)v147);
                v149 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v124 ^ v32) >> 64), (unsigned long long)v124 ^ (unsigned long long)v32);
                v150 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v149 >> 64), (unsigned long long)v149);
                v151 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v126 ^ v32) >> 64), (unsigned long long)v126 ^ (unsigned long long)v32);
                v152 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v151 >> 64), (unsigned long long)v151);
                v153 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v128 ^ v32) >> 64), (unsigned long long)v128 ^ (unsigned long long)v32);
                v154 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v153 >> 64), (unsigned long long)v153);
                v155 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v130 ^ v32) >> 64), (unsigned long long)v130 ^ (unsigned long long)v32);
                v156 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v155 >> 64), (unsigned long long)v155);
                v157 = v132->field_0;
                v158 = &v132->field_10;
                v159 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v134 ^ v131) >> 64), (unsigned long long)v134 ^ (unsigned long long)v131);
                v160 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v159 >> 64), (unsigned long long)v159);
                v161 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v136 ^ v131) >> 64), (unsigned long long)v136 ^ (unsigned long long)v131);
                v162 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v161 >> 64), (unsigned long long)v161);
                v163 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v138 ^ v131) >> 64), (unsigned long long)v138 ^ (unsigned long long)v131);
                v164 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v163 >> 64), (unsigned long long)v163);
                v165 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v140 ^ v131) >> 64), (unsigned long long)v140 ^ (unsigned long long)v131);
                v166 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v165 >> 64), (unsigned long long)v165);
                v167 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v142 ^ v131) >> 64), (unsigned long long)v142 ^ (unsigned long long)v131);
                v168 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v167 >> 64), (unsigned long long)v167);
                v169 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v144 ^ v131) >> 64), (unsigned long long)v144 ^ (unsigned long long)v131);
                v170 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v169 >> 64), (unsigned long long)v169);
                v171 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v146 ^ v131) >> 64), (unsigned long long)v146 ^ (unsigned long long)v131);
                v172 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v171 >> 64), (unsigned long long)v171);
                v173 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v148 ^ v131) >> 64), (unsigned long long)v148 ^ (unsigned long long)v131);
                v174 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v173 >> 64), (unsigned long long)v173);
                v175 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v150 ^ v131) >> 64), (unsigned long long)v150 ^ (unsigned long long)v131);
                v176 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v175 >> 64), (unsigned long long)v175);
                v177 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v152 ^ v131) >> 64), (unsigned long long)v152 ^ (unsigned long long)v131);
                v178 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v177 >> 64), (unsigned long long)v177);
                v179 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v154 ^ v131) >> 64), (unsigned long long)v154 ^ (unsigned long long)v131);
                v180 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v179 >> 64), (unsigned long long)v179);
                v181 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v156 ^ v131) >> 64), (unsigned long long)v156 ^ (unsigned long long)v131);
                v182 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v181 >> 64), (unsigned long long)v181);
                v183 = *v158;
                v184 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v160 ^ v157) >> 64), (unsigned long long)v160 ^ (unsigned long long)v157);
                v185 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v184 >> 64), (unsigned long long)v184);
                v186 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v162 ^ v157) >> 64), (unsigned long long)v162 ^ (unsigned long long)v157);
                v187 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v186 >> 64), (unsigned long long)v186);
                v188 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v164 ^ v157) >> 64), (unsigned long long)v164 ^ (unsigned long long)v157);
                v189 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v188 >> 64), (unsigned long long)v188);
                v190 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v166 ^ v157) >> 64), (unsigned long long)v166 ^ (unsigned long long)v157);
                v191 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v190 >> 64), (unsigned long long)v190);
                v192 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v168 ^ v157) >> 64), (unsigned long long)v168 ^ (unsigned long long)v157);
                v193 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v192 >> 64), (unsigned long long)v192);
                v194 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v170 ^ v157) >> 64), (unsigned long long)v170 ^ (unsigned long long)v157);
                v195 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v194 >> 64), (unsigned long long)v194);
                v196 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v172 ^ v157) >> 64), (unsigned long long)v172 ^ (unsigned long long)v157);
                v197 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v196 >> 64), (unsigned long long)v196);
                v198 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v174 ^ v157) >> 64), (unsigned long long)v174 ^ (unsigned long long)v157);
                v199 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v198 >> 64), (unsigned long long)v198);
                v200 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v176 ^ v157) >> 64), (unsigned long long)v176 ^ (unsigned long long)v157);
                v201 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v200 >> 64), (unsigned long long)v200);
                v202 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v178 ^ v157) >> 64), (unsigned long long)v178 ^ (unsigned long long)v157);
                v203 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v202 >> 64), (unsigned long long)v202);
                v204 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v180 ^ v157) >> 64), (unsigned long long)v180 ^ (unsigned long long)v157);
                v205 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v204 >> 64), (unsigned long long)v204);
                v206 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v182 ^ v157) >> 64), (unsigned long long)v182 ^ (unsigned long long)v157);
                v207 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v206 >> 64), (unsigned long long)v206);
                v208 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v185 ^ v183) >> 64), (unsigned long long)v185 ^ (unsigned long long)v183);
                v209 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v208 >> 64), (unsigned long long)v208);
                v210 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v187 ^ v183) >> 64), (unsigned long long)v187 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v210 >> 64), (unsigned long long)v210);
                v211 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v189 ^ v183) >> 64), (unsigned long long)v189 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v211 >> 64), (unsigned long long)v211);
                v212 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v191 ^ v183) >> 64), (unsigned long long)v191 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v212 >> 64), (unsigned long long)v212);
                v213 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v193 ^ v183) >> 64), (unsigned long long)v193 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v213 >> 64), (unsigned long long)v213);
                v214 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v195 ^ v183) >> 64), (unsigned long long)v195 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v214 >> 64), (unsigned long long)v214);
                v215 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v197 ^ v183) >> 64), (unsigned long long)v197 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v215 >> 64), (unsigned long long)v215);
                v216 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v199 ^ v183) >> 64), (unsigned long long)v199 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v216 >> 64), (unsigned long long)v216);
                v217 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v201 ^ v183) >> 64), (unsigned long long)v201 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v217 >> 64), (unsigned long long)v217);
                v218 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v203 ^ v183) >> 64), (unsigned long long)v203 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v218 >> 64), (unsigned long long)v218);
                v219 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v205 ^ v183) >> 64), (unsigned long long)v205 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v219 >> 64), (unsigned long long)v219);
                v220 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v207 ^ v183) >> 64), (unsigned long long)v207 ^ (unsigned long long)v183);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v220 >> 64), (unsigned long long)v220);
                __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v209 ^ v158[1]) >> 64), (unsigned long long)v209 ^ (unsigned long long)v158[1]);
            }
            else
            {
                do
                {
                    j = v35;
                    v222 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v33) >> 64), (unsigned long long)v31 ^ (unsigned long long)v33);
                    v223 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v222 >> 64), (unsigned long long)v222);
                    v224 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v33) >> 64), (unsigned long long)v38 ^ (unsigned long long)v33);
                    v225 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v224 >> 64), (unsigned long long)v224);
                    v226 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v39 ^ v33) >> 64), (unsigned long long)v39 ^ (unsigned long long)v33);
                    v227 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v226 >> 64), (unsigned long long)v226);
                    v228 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v41 ^ v33) >> 64), (unsigned long long)v41 ^ (unsigned long long)v33);
                    v229 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v228 >> 64), (unsigned long long)v228);
                    v230 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v42 ^ v33) >> 64), (unsigned long long)v42 ^ (unsigned long long)v33);
                    v231 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v230 >> 64), (unsigned long long)v230);
                    v232 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v43 ^ v33) >> 64), (unsigned long long)v43 ^ (unsigned long long)v33);
                    v233 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v232 >> 64), (unsigned long long)v232);
                    v33 = *v34;
                    v234 = v34 + 1;
                    v235 = j - 2;
                    v236 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v223 ^ v32) >> 64), (unsigned long long)v223 ^ (unsigned long long)v32);
                    v237 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v236 >> 64), (unsigned long long)v236);
                    v31 = v237;
                    v238 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v225 ^ v32) >> 64), (unsigned long long)v225 ^ (unsigned long long)v32);
                    v239 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v238 >> 64), (unsigned long long)v238);
                    v38 = v239;
                    v240 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v227 ^ v32) >> 64), (unsigned long long)v227 ^ (unsigned long long)v32);
                    v241 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v240 >> 64), (unsigned long long)v240);
                    v39 = v241;
                    v242 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v229 ^ v32) >> 64), (unsigned long long)v229 ^ (unsigned long long)v32);
                    v243 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v242 >> 64), (unsigned long long)v242);
                    v41 = v243;
                    v244 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v231 ^ v32) >> 64), (unsigned long long)v231 ^ (unsigned long long)v32);
                    v245 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v244 >> 64), (unsigned long long)v244);
                    v42 = v245;
                    v246 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v233 ^ v32) >> 64), (unsigned long long)v233 ^ (unsigned long long)v32);
                    v247 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v246 >> 64), (unsigned long long)v246);
                    v43 = v247;
                    v32 = v234->field_0;
                    v34 = &v234->field_10;
                    v35 = v235;
                } while (2 < j);
                v248 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v33) >> 64), (unsigned long long)v31 ^ (unsigned long long)v33);
                v249 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v248 >> 64), (unsigned long long)v248);
                v250 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v33) >> 64), (unsigned long long)v38 ^ (unsigned long long)v33);
                v251 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v250 >> 64), (unsigned long long)v250);
                v252 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v39 ^ v33) >> 64), (unsigned long long)v39 ^ (unsigned long long)v33);
                v253 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v252 >> 64), (unsigned long long)v252);
                v254 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v41 ^ v33) >> 64), (unsigned long long)v41 ^ (unsigned long long)v33);
                v255 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v254 >> 64), (unsigned long long)v254);
                v256 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v42 ^ v33) >> 64), (unsigned long long)v42 ^ (unsigned long long)v33);
                v257 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v256 >> 64), (unsigned long long)v256);
                v258 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v43 ^ v33) >> 64), (unsigned long long)v43 ^ (unsigned long long)v33);
                v259 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v258 >> 64), (unsigned long long)v258);
                v260 = *v34;
                v261 = v34 + 1;
                v262 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v249 ^ v32) >> 64), (unsigned long long)v249 ^ (unsigned long long)v32);
                v263 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v262 >> 64), (unsigned long long)v262);
                v264 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v251 ^ v32) >> 64), (unsigned long long)v251 ^ (unsigned long long)v32);
                v265 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v264 >> 64), (unsigned long long)v264);
                v266 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v253 ^ v32) >> 64), (unsigned long long)v253 ^ (unsigned long long)v32);
                v267 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v266 >> 64), (unsigned long long)v266);
                v268 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v255 ^ v32) >> 64), (unsigned long long)v255 ^ (unsigned long long)v32);
                v269 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v268 >> 64), (unsigned long long)v268);
                v270 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v257 ^ v32) >> 64), (unsigned long long)v257 ^ (unsigned long long)v32);
                v271 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v270 >> 64), (unsigned long long)v270);
                v272 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v259 ^ v32) >> 64), (unsigned long long)v259 ^ (unsigned long long)v32);
                v273 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v272 >> 64), (unsigned long long)v272);
                v274 = v261->field_0;
                v275 = &v261->field_10;
                v276 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v263 ^ v260) >> 64), (unsigned long long)v263 ^ (unsigned long long)v260);
                v277 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v276 >> 64), (unsigned long long)v276);
                v278 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v265 ^ v260) >> 64), (unsigned long long)v265 ^ (unsigned long long)v260);
                v279 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v278 >> 64), (unsigned long long)v278);
                v280 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v267 ^ v260) >> 64), (unsigned long long)v267 ^ (unsigned long long)v260);
                v281 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v280 >> 64), (unsigned long long)v280);
                v282 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v269 ^ v260) >> 64), (unsigned long long)v269 ^ (unsigned long long)v260);
                v283 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v282 >> 64), (unsigned long long)v282);
                v284 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v271 ^ v260) >> 64), (unsigned long long)v271 ^ (unsigned long long)v260);
                v285 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v284 >> 64), (unsigned long long)v284);
                v286 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v273 ^ v260) >> 64), (unsigned long long)v273 ^ (unsigned long long)v260);
                v287 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v286 >> 64), (unsigned long long)v286);
                v288 = *v275;
                v289 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v277 ^ v274) >> 64), (unsigned long long)v277 ^ (unsigned long long)v274);
                v290 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v289 >> 64), (unsigned long long)v289);
                v291 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v279 ^ v274) >> 64), (unsigned long long)v279 ^ (unsigned long long)v274);
                v292 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v291 >> 64), (unsigned long long)v291);
                v293 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v281 ^ v274) >> 64), (unsigned long long)v281 ^ (unsigned long long)v274);
                v294 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v293 >> 64), (unsigned long long)v293);
                v295 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v283 ^ v274) >> 64), (unsigned long long)v283 ^ (unsigned long long)v274);
                v296 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v295 >> 64), (unsigned long long)v295);
                v297 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v285 ^ v274) >> 64), (unsigned long long)v285 ^ (unsigned long long)v274);
                v298 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v297 >> 64), (unsigned long long)v297);
                v299 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v287 ^ v274) >> 64), (unsigned long long)v287 ^ (unsigned long long)v274);
                v300 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v299 >> 64), (unsigned long long)v299);
                v301 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v290 ^ v288) >> 64), (unsigned long long)v290 ^ (unsigned long long)v288);
                v302 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v301 >> 64), (unsigned long long)v301);
                v303 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v292 ^ v288) >> 64), (unsigned long long)v292 ^ (unsigned long long)v288);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v303 >> 64), (unsigned long long)v303);
                v304 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v294 ^ v288) >> 64), (unsigned long long)v294 ^ (unsigned long long)v288);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v304 >> 64), (unsigned long long)v304);
                v305 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v296 ^ v288) >> 64), (unsigned long long)v296 ^ (unsigned long long)v288);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v305 >> 64), (unsigned long long)v305);
                v306 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v298 ^ v288) >> 64), (unsigned long long)v298 ^ (unsigned long long)v288);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v306 >> 64), (unsigned long long)v306);
                v307 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v300 ^ v288) >> 64), (unsigned long long)v300 ^ (unsigned long long)v288);
                __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v307 >> 64), (unsigned long long)v307);
                __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v302 ^ v275[1]) >> 64), (unsigned long long)v302 ^ (unsigned long long)v275[1]);
            }
        }
        else
        {
            do
            {
                k = v35;
                v309 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v33) >> 64), (unsigned long long)v31 ^ (unsigned long long)v33);
                v310 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v309 >> 64), (unsigned long long)v309);
                v311 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v33) >> 64), (unsigned long long)v38 ^ (unsigned long long)v33);
                v312 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v311 >> 64), (unsigned long long)v311);
                v313 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v39 ^ v33) >> 64), (unsigned long long)v39 ^ (unsigned long long)v33);
                v314 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v313 >> 64), (unsigned long long)v313);
                v33 = *v34;
                v315 = v34 + 1;
                v316 = k - 2;
                v317 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v310 ^ v32) >> 64), (unsigned long long)v310 ^ (unsigned long long)v32);
                v318 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v317 >> 64), (unsigned long long)v317);
                v31 = v318;
                v319 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v312 ^ v32) >> 64), (unsigned long long)v312 ^ (unsigned long long)v32);
                v320 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v319 >> 64), (unsigned long long)v319);
                v38 = v320;
                v321 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v314 ^ v32) >> 64), (unsigned long long)v314 ^ (unsigned long long)v32);
                v322 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v321 >> 64), (unsigned long long)v321);
                v39 = v322;
                v32 = v315->field_0;
                v34 = &v315->field_10;
                v35 = v316;
            } while (2 < k);
            v323 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v33) >> 64), (unsigned long long)v31 ^ (unsigned long long)v33);
            v324 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v323 >> 64), (unsigned long long)v323);
            v325 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v33) >> 64), (unsigned long long)v38 ^ (unsigned long long)v33);
            v326 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v325 >> 64), (unsigned long long)v325);
            v327 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v39 ^ v33) >> 64), (unsigned long long)v39 ^ (unsigned long long)v33);
            v328 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v327 >> 64), (unsigned long long)v327);
            v329 = *v34;
            v330 = v34 + 1;
            v331 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v324 ^ v32) >> 64), (unsigned long long)v324 ^ (unsigned long long)v32);
            v332 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v331 >> 64), (unsigned long long)v331);
            v333 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v326 ^ v32) >> 64), (unsigned long long)v326 ^ (unsigned long long)v32);
            v334 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v333 >> 64), (unsigned long long)v333);
            v335 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v328 ^ v32) >> 64), (unsigned long long)v328 ^ (unsigned long long)v32);
            v336 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v335 >> 64), (unsigned long long)v335);
            v337 = v330->field_0;
            v338 = &v330->field_10;
            v339 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v332 ^ v329) >> 64), (unsigned long long)v332 ^ (unsigned long long)v329);
            v340 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v339 >> 64), (unsigned long long)v339);
            v341 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v334 ^ v329) >> 64), (unsigned long long)v334 ^ (unsigned long long)v329);
            v342 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v341 >> 64), (unsigned long long)v341);
            v343 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v336 ^ v329) >> 64), (unsigned long long)v336 ^ (unsigned long long)v329);
            v344 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v343 >> 64), (unsigned long long)v343);
            v345 = *v338;
            v346 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v340 ^ v337) >> 64), (unsigned long long)v340 ^ (unsigned long long)v337);
            v347 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v346 >> 64), (unsigned long long)v346);
            v348 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v342 ^ v337) >> 64), (unsigned long long)v342 ^ (unsigned long long)v337);
            v349 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v348 >> 64), (unsigned long long)v348);
            v350 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v344 ^ v337) >> 64), (unsigned long long)v344 ^ (unsigned long long)v337);
            v351 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v350 >> 64), (unsigned long long)v350);
            v352 = v338[1];
            v353 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v347 ^ v345) >> 64), (unsigned long long)v347 ^ (unsigned long long)v345);
            v354 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v353 >> 64), (unsigned long long)v353);
            v355 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v349 ^ v345) >> 64), (unsigned long long)v349 ^ (unsigned long long)v345);
            v356 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v355 >> 64), (unsigned long long)v355);
            v357 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v351 ^ v345) >> 64), (unsigned long long)v351 ^ (unsigned long long)v345);
            v358 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v357 >> 64), (unsigned long long)v357);
            __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v354 ^ v352) >> 64), (unsigned long long)v354 ^ (unsigned long long)v352);
            __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v356 ^ v352) >> 64), (unsigned long long)v356 ^ (unsigned long long)v352);
            __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v358 ^ v352) >> 64), (unsigned long long)v358 ^ (unsigned long long)v352);
        }
    }
    else if (a2 != 1)
    {
        do
        {
            l = v35;
            v360 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v33) >> 64), (unsigned long long)v31 ^ (unsigned long long)v33);
            v361 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v360 >> 64), (unsigned long long)v360);
            v362 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v33) >> 64), (unsigned long long)v38 ^ (unsigned long long)v33);
            v363 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v362 >> 64), (unsigned long long)v362);
            v33 = *v34;
            v364 = v34 + 1;
            v365 = l - 2;
            v366 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v361 ^ v32) >> 64), (unsigned long long)v361 ^ (unsigned long long)v32);
            v367 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v366 >> 64), (unsigned long long)v366);
            v31 = v367;
            v368 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v363 ^ v32) >> 64), (unsigned long long)v363 ^ (unsigned long long)v32);
            v369 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v368 >> 64), (unsigned long long)v368);
            v38 = v369;
            v32 = v364->field_0;
            v34 = &v364->field_10;
            v35 = v365;
        } while (2 < l);
        v370 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v33) >> 64), (unsigned long long)v31 ^ (unsigned long long)v33);
        v371 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v370 >> 64), (unsigned long long)v370);
        v372 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v33) >> 64), (unsigned long long)v38 ^ (unsigned long long)v33);
        v373 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v372 >> 64), (unsigned long long)v372);
        v374 = *v34;
        v375 = v34 + 1;
        v376 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v371 ^ v32) >> 64), (unsigned long long)v371 ^ (unsigned long long)v32);
        v377 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v376 >> 64), (unsigned long long)v376);
        v378 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v373 ^ v32) >> 64), (unsigned long long)v373 ^ (unsigned long long)v32);
        v379 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v378 >> 64), (unsigned long long)v378);
        v380 = v375->field_0;
        v381 = &v375->field_10;
        v382 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v377 ^ v374) >> 64), (unsigned long long)v377 ^ (unsigned long long)v374);
        v383 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v382 >> 64), (unsigned long long)v382);
        v384 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v379 ^ v374) >> 64), (unsigned long long)v379 ^ (unsigned long long)v374);
        v385 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v384 >> 64), (unsigned long long)v384);
        v386 = *v381;
        v387 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v383 ^ v380) >> 64), (unsigned long long)v383 ^ (unsigned long long)v380);
        v388 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v387 >> 64), (unsigned long long)v387);
        v389 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v385 ^ v380) >> 64), (unsigned long long)v385 ^ (unsigned long long)v380);
        v390 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v389 >> 64), (unsigned long long)v389);
        v391 = v381[1];
        v392 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v388 ^ v386) >> 64), (unsigned long long)v388 ^ (unsigned long long)v386);
        v393 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v392 >> 64), (unsigned long long)v392);
        v394 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v390 ^ v386) >> 64), (unsigned long long)v390 ^ (unsigned long long)v386);
        v395 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v394 >> 64), (unsigned long long)v394);
        __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v393 ^ v391) >> 64), (unsigned long long)v393 ^ (unsigned long long)v391);
        __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v395 ^ v391) >> 64), (unsigned long long)v395 ^ (unsigned long long)v391);
    }
    else
    {
        do
        {
            m = v35;
            v397 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v33) >> 64), (unsigned long long)v31 ^ (unsigned long long)v33);
            v398 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v397 >> 64), (unsigned long long)v397);
            v33 = *v34;
            v399 = v34 + 1;
            v400 = m - 2;
            v401 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v398 ^ v32) >> 64), (unsigned long long)v398 ^ (unsigned long long)v32);
            v402 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v401 >> 64), (unsigned long long)v401);
            v31 = v402;
            v32 = v399->field_0;
            v34 = &v399->field_10;
            v35 = v400;
        } while (2 < m);
        v403 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v33) >> 64), (unsigned long long)v31 ^ (unsigned long long)v33);
        v404 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v403 >> 64), (unsigned long long)v403);
        v405 = v34 + 1;
        v406 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v404 ^ v32) >> 64), (unsigned long long)v404 ^ (unsigned long long)v32);
        v407 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v406 >> 64), (unsigned long long)v406);
        v408 = &v405->field_10;
        v409 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v407 ^ *v34) >> 64), (unsigned long long)v407 ^ (unsigned long long)*v34);
        v410 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v409 >> 64), (unsigned long long)v409);
        v411 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v410 ^ v405->field_0) >> 64), (unsigned long long)v410 ^ (unsigned long long)v405->field_0);
        v412 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v411 >> 64), (unsigned long long)v411);
        v413 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v412 ^ *v408) >> 64), (unsigned long long)v412 ^ (unsigned long long)*v408);
        v414 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v413 >> 64), (unsigned long long)v413);
        __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v414 ^ v408[1]) >> 64), (unsigned long long)v414 ^ (unsigned long long)v408[1]);
    }
}
