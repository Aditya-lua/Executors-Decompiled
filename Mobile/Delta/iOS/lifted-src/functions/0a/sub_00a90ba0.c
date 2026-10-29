/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa90ba0..0xa91640 (2720 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a90ba0_9 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
    unsigned long long field_78;
} st_a90ba0_9;

typedef struct st_a90ba0_8 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    unsigned long long field_80;
    unsigned long long field_88;
} st_a90ba0_8;

typedef struct st_a90ba0_7 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    unsigned long long field_90;
    unsigned long long field_98;
} st_a90ba0_7;

typedef struct st_a90ba0_6 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    unsigned long long field_a0;
    unsigned long long field_a8;
} st_a90ba0_6;

typedef struct st_a90ba0_4 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    unsigned long long field_b0;
    unsigned long long field_b8;
} st_a90ba0_4;

typedef struct st_a90ba0_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    unsigned long long field_c0;
    unsigned long long field_c8;
} st_a90ba0_0;

typedef struct st_a90ba0_5 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    unsigned long long field_28;
} st_a90ba0_5;

typedef struct st_a90ba0_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    unsigned long long field_38;
} st_a90ba0_3;

typedef struct st_a90ba0_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
} st_a90ba0_2;

typedef struct st_a90ba0_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
    unsigned long long field_58;
} st_a90ba0_1;

typedef struct st_a90ba0_10 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned long long field_60;
    unsigned long long field_68;
} st_a90ba0_10;


uint128_t sub_a90ba0(uint128_t *a0, uint128_t a1, unsigned long long *iter, uint128_t *a3, void* a4, st_a90ba0_0 *a5)
{
    unsigned long long v14;  // x19
    unsigned long long v15;  // x20
    unsigned long long v24;  // d12
    uint128_t v114;  // 4121
    uint128_t v115;  // 4123
    uint128_t v116;  // 4127
    uint128_t v117;  // 4129
    uint128_t v118;  // 4133
    uint128_t v119;  // 4135
    uint128_t v120;  // 4139
    uint128_t v121;  // 4141
    uint128_t v122;  // 4145
    uint128_t v123;  // 4147
    unsigned long long v25;  // d13
    uint128_t v124;  // 4151
    uint128_t v125;  // 4153
    uint128_t v126;  // 4157
    uint128_t v127;  // 4159
    uint128_t v128;  // 4163
    uint128_t v129;  // 4165
    uint128_t v130;  // 4169
    uint128_t v131;  // 4171
    uint128_t v132;  // 4175
    uint128_t v133;  // 4177
    unsigned long long v26;  // d14
    uint128_t v134;  // 4181
    uint128_t v135;  // 4183
    uint128_t v136;  // 4187
    uint128_t v137;  // 4189
    uint128_t v138;  // 4193
    uint128_t v139;  // 4195
    uint128_t v140;  // 4199
    uint128_t v141;  // 4201
    uint128_t v142;  // 4208
    uint128_t v143;  // 4210
    unsigned long long v27;  // d15
    uint128_t v144;  // 4215
    uint128_t v145;  // 4217
    uint128_t *v146;  // x5
    uint128_t v147;  // 4225
    uint128_t v148;  // 4227
    uint128_t v149;  // 4236
    uint128_t v150;  // 4238
    uint128_t v151;  // 4245
    uint128_t v152;  // q3
    uint128_t v153;  // 4249
    unsigned long v28;  // x10
    uint128_t v154;  // 4251
    uint128_t v155;  // 4255
    uint128_t v156;  // 4257
    uint128_t v157;  // 4261
    uint128_t v158;  // 4263
    __m128i v159;  // q16
    uint128_t v160;  // 4271
    uint128_t v161;  // q2
    uint128_t v162;  // 4275
    uint128_t v163;  // q1
    unsigned long v29;  // x13
    __m128i v164;  // q17
    uint128_t v165;  // 4283
    uint128_t v166;  // q0
    uint128_t *i;  // x0
    uint128_t *v168;  // x0
    uint128_t v169;  // q1
    uint128_t v170;  // q0
    uint128_t v171;  // q7
    uint128_t v172;  // q6
    unsigned long v173;  // x12
    unsigned long v30;  // x14
    uint128_t v174;  // q4
    uint128_t v175;  // q5
    uint128_t v176;  // q0
    unsigned long v177;  // x12
    uint128_t v178;  // q1
    unsigned long long *v179;  // x2
    unsigned long long v180;  // x9
    unsigned long long *v181;  // x2
    unsigned long v182;  // x12
    uint128_t v183;  // q2
    uint128_t v31;  // q18
    uint128_t v184;  // 4099
    uint128_t v185;  // 4101
    uint128_t v187;  // 4105
    uint128_t v188;  // q3
    uint128_t v189;  // q7
    uint128_t v190;  // 4114
    uint128_t v191;  // 4116
    uint128_t v192;  // 4120
    uint128_t v193;  // 4122
    st_a90ba0_4 *v32;  // x8
    uint128_t v194;  // q4
    uint128_t v195;  // 4127
    uint128_t v196;  // q2
    uint128_t v197;  // 4131
    uint128_t v198;  // 4133
    uint128_t v199;  // 4137
    uint128_t v200;  // 4139
    uint128_t v201;  // 4140
    uint128_t v202;  // 4142
    uint128_t v203;  // 4154
    uint128_t v33;  // q19
    uint128_t v204;  // 4156
    uint128_t v205;  // q3
    uint128_t v207;  // 4169
    uint128_t v208;  // 4171
    uint128_t v209;  // 4175
    uint128_t v210;  // 4177
    uint128_t v211;  // 4185
    uint128_t v212;  // 4187
    unsigned long long v16;  // x21
    st_a90ba0_6 *v34;  // x8
    uint128_t v214;  // 4192
    uint128_t v215;  // 4196
    uint128_t v216;  // 4198
    uint128_t v217;  // q6
    uint128_t v218;  // 4203
    uint128_t v219;  // 4205
    uint128_t v220;  // 4206
    uint128_t v221;  // 4218
    uint128_t v222;  // 4220
    uint128_t v223;  // 4224
    unsigned long long v35;  // x12
    uint128_t v224;  // 4226
    uint128_t v225;  // 4235
    uint128_t v226;  // 4237
    uint128_t v227;  // 4245
    uint128_t v228;  // 4247
    uint128_t v229;  // 4248
    uint128_t v230;  // q31
    uint128_t v231;  // 4253
    uint128_t v232;  // 4257
    uint128_t v233;  // 4259
    unsigned long long v36;  // x11
    uint128_t v234;  // 4268
    uint128_t v235;  // 4270
    uint128_t v236;  // 4271
    uint128_t v237;  // 4275
    uint128_t v238;  // 4277
    uint128_t v240;  // 4285
    uint128_t v241;  // 4287
    uint128_t v242;  // 4291
    uint128_t v243;  // 4293
    unsigned long v37;  // x12
    uint128_t v245;  // 4297
    uint128_t v246;  // 4299
    uint128_t v247;  // 4300
    uint128_t v248;  // 4308
    uint128_t v249;  // 4310
    uint128_t v250;  // 4311
    uint128_t v251;  // q9
    uint128_t v252;  // 4319
    uint128_t v253;  // 4321
    uint128_t v38;  // q20
    uint128_t v254;  // 4325
    uint128_t v255;  // 4327
    uint128_t v256;  // 4328
    uint128_t v257;  // 4332
    uint128_t v258;  // 4334
    uint128_t v259;  // 4342
    uint128_t v260;  // 4344
    uint128_t v261;  // 4099
    uint128_t v262;  // 4101
    uint128_t v263;  // q11
    st_a90ba0_7 *v39;  // x8
    uint128_t v264;  // 4109
    uint128_t v265;  // 4111
    uint128_t v266;  // 4115
    uint128_t v267;  // 4117
    uint128_t v268;  // 4125
    uint128_t v269;  // 4127
    uint128_t v270;  // 4131
    uint128_t v271;  // 4133
    uint128_t v272;  // 4141
    uint128_t v273;  // 4143
    uint128_t v40;  // 4180
    uint128_t v274;  // 4147
    uint128_t v275;  // 4149
    unsigned long v276;  // d8
    uint128_t v277;  // 4153
    uint128_t v278;  // 4155
    uint128_t v279;  // 4159
    uint128_t v280;  // 4161
    uint128_t v281;  // q4
    uint128_t *v282;  // x0
    uint128_t v283;  // 4169
    uint128_t v41;  // 4182
    uint128_t v284;  // 4171
    uint128_t v285;  // 4176
    uint128_t v286;  // q5
    uint128_t *v287;  // x0
    uint128_t v288;  // 4188
    uint128_t v289;  // 4190
    uint128_t v290;  // q9
    uint128_t v291;  // 4197
    unsigned long v292;  // x12
    uint128_t v293;  // 4204
    unsigned long v42;  // x12
    uint128_t v294;  // 4206
    uint128_t v295;  // 4214
    uint128_t v296;  // 4216
    uint128_t *v297;  // x0
    uint128_t v298;  // 4224
    uint128_t v299;  // 4239
    uint128_t v300;  // 4241
    unsigned long long *v301;  // x2
    uint128_t v302;  // 4249
    uint128_t v303;  // 4251
    uint128_t v43;  // q21
    uint128_t v304;  // q10
    uint128_t v305;  // q0
    uint128_t v306;  // q1
    uint128_t v307;  // 4276
    uint128_t v308;  // 4278
    uint128_t v309;  // 4286
    uint128_t v310;  // 4288
    uint128_t v311;  // 4289
    unsigned long long *v312;  // x2
    uint128_t v313;  // 4298
    unsigned long long v17;  // x22
    st_a90ba0_8 *v44;  // x8
    uint128_t v314;  // 4302
    uint128_t v315;  // 4304
    unsigned long v316;  // x12
    uint128_t v317;  // q10
    unsigned long v318;  // x12
    unsigned long long *v319;  // x2
    uint128_t v320;  // 4375
    uint128_t v322;  // q3
    uint128_t v323;  // 4106
    uint128_t v45;  // q1
    uint128_t v324;  // 4108
    uint128_t v325;  // 4112
    uint128_t v326;  // 4114
    uint128_t v327;  // q4
    uint128_t v328;  // 4123
    uint128_t v329;  // 4125
    uint128_t v330;  // 4129
    uint128_t v331;  // 4131
    uint128_t v332;  // 4132
    uint128_t v333;  // 4137
    unsigned long v46;  // x12
    uint128_t v334;  // 4139
    uint128_t v335;  // q6
    uint128_t v336;  // 4141
    uint128_t v337;  // q2
    uint128_t v339;  // 4158
    uint128_t v340;  // q3
    uint128_t v341;  // 4166
    uint128_t v342;  // 4168
    uint128_t v343;  // 4173
    uint128_t v47;  // q2
    unsigned long v344;  // d4
    uint128_t v345;  // 4182
    unsigned long long *v346;  // x2
    uint128_t v347;  // q7
    uint128_t v348;  // 4199
    uint128_t v349;  // 4201
    uint128_t v350;  // 4206
    uint128_t v351;  // 4210
    uint128_t v352;  // 4218
    uint128_t v353;  // 4220
    uint128_t v48;  // 4225
    uint128_t v354;  // 4229
    uint128_t v355;  // 4231
    uint128_t v356;  // 4235
    uint128_t v357;  // 4237
    uint128_t v358;  // q31
    uint128_t v359;  // 4246
    uint128_t v360;  // 4250
    uint128_t v361;  // 4252
    uint128_t v362;  // 4257
    uint128_t v363;  // 4259
    uint128_t v49;  // 4227
    uint128_t v365;  // 4260
    uint128_t v366;  // 4264
    uint128_t v367;  // 4266
    uint128_t v369;  // 4274
    uint128_t v370;  // 4276
    uint128_t v371;  // 4277
    uint128_t v372;  // 4285
    uint128_t v373;  // 4287
    uint128_t v50;  // q3
    uint128_t v374;  // 4288
    uint128_t v375;  // 4289
    uint128_t v376;  // 4293
    uint128_t v377;  // 4295
    unsigned long v378;  // d8
    uint128_t v379;  // q9
    uint128_t v380;  // 4303
    uint128_t v381;  // 4305
    uint128_t v382;  // 4313
    uint128_t v383;  // 4315
    uint128_t v51;  // q22
    uint128_t v384;  // 4316
    uint128_t v385;  // q11
    uint128_t v386;  // 4324
    uint128_t v387;  // 4326
    uint128_t v388;  // 4330
    uint128_t v389;  // 4332
    uint128_t v390;  // 4340
    uint128_t v391;  // 4342
    uint128_t v392;  // 4346
    uint128_t v393;  // 4097
    st_a90ba0_9 *v52;  // x8
    uint128_t v394;  // 4105
    uint128_t v395;  // 4107
    uint128_t v396;  // 4111
    uint128_t v397;  // 4113
    uint128_t v399;  // 4120
    uint128_t v400;  // 4122
    uint128_t v401;  // 4126
    uint128_t v402;  // 4128
    uint128_t v403;  // 4136
    uint128_t v53;  // 4239
    uint128_t v404;  // 4138
    uint128_t v405;  // 4142
    uint128_t v406;  // 4144
    uint128_t v407;  // 4148
    uint128_t v408;  // 4150
    uint128_t v409;  // 4154
    uint128_t v410;  // 4156
    uint128_t v411;  // 4160
    uint128_t v412;  // 4162
    uint128_t v413;  // 4170
    unsigned long long v18;  // x23
    uint128_t v54;  // 4241
    uint128_t v414;  // 4172
    uint128_t v415;  // 4176
    uint128_t v416;  // 4178
    uint128_t v417;  // 4182
    uint128_t v418;  // 4184
    uint128_t v419;  // 4188
    uint128_t v420;  // 4190
    uint128_t v421;  // q10
    uint128_t v422;  // 4198
    uint128_t v423;  // 4200
    uint128_t v55;  // 4245
    uint128_t v424;  // 4204
    uint128_t v425;  // 4206
    uint128_t v426;  // 4210
    uint128_t v427;  // 4212
    uint128_t v428;  // 4216
    uint128_t v429;  // 4218
    uint128_t v430;  // 4222
    uint128_t v431;  // 4224
    uint128_t v432;  // 4225
    uint128_t v433;  // 4229
    uint128_t v56;  // 4247
    uint128_t v434;  // 4231
    uint128_t v435;  // 4235
    uint128_t v436;  // 4237
    uint128_t v437;  // 4241
    uint128_t v438;  // 4243
    uint128_t v440;  // 4250
    uint128_t v441;  // 4252
    uint128_t *v442;  // x0
    long long v443;  // x5
    uint128_t v57;  // q23
    uint128_t v444;  // q5
    uint128_t *node;  // x0
    uint128_t v446;  // q0
    uint128_t v447;  // q8
    unsigned long long v448;  // x7
    unsigned long long v449;  // x6
    uint128_t v450;  // q11
    uint128_t v451;  // q9
    uint128_t v452;  // q10
    uint128_t v453;  // q4
    st_a90ba0_10 *v58;  // x8
    uint128_t v454;  // q4
    uint128_t v455;  // q0
    uint128_t v456;  // 4113
    uint128_t v458;  // 4120
    uint128_t v459;  // 4125
    uint128_t v460;  // q4
    uint128_t v461;  // q4
    uint128_t v462;  // q0
    uint128_t v463;  // 4110
    uint128_t v59;  // 4255
    uint128_t v465;  // 4123
    uint128_t v466;  // 4124
    uint128_t v468;  // q4
    uint128_t v469;  // 4106
    uint128_t v470;  // q0
    uint128_t v471;  // q22
    uint128_t v472;  // 4123
    uint128_t v60;  // 4257
    uint128_t v474;  // 4124
    unsigned long long v475;  // x5
    unsigned long long v476;  // x1
    uint128_t v477;  // x14
    unsigned long v478;  // cc_dep1
    uint128_t v479;  // x9
    unsigned long long v480;  // 4104
    unsigned long long v481;  // 4104
    uint128_t v482;  // x10
    unsigned long long v483;  // x4
    __m128i v61;  // q15
    uint128_t v484;  // q0
    uint128_t v485;  // q4
    uint128_t v486;  // q4
    uint128_t v487;  // 4132
    uint128_t v488;  // 4134
    uint128_t v490;  // q9
    uint128_t v491;  // 4143
    uint128_t v492;  // q11
    unsigned long v493;  // d8
    uint128_t v62;  // 4265
    uint128_t v494;  // 4160
    uint128_t v496;  // q10
    uint128_t v497;  // 4180
    uint128_t v498;  // q10
    uint128_t v500;  // q11
    uint128_t v63;  // 4267
    unsigned long long v19;  // x24
    __m128i v64;  // q13
    uint128_t v65;  // 4275
    uint128_t v66;  // 4277
    __m128i v67;  // q14
    uint128_t v68;  // 4285
    uint128_t v69;  // 4287
    uint128_t v70;  // 4291
    uint128_t v71;  // 4293
    __m128i v72;  // q12
    uint128_t v73;  // 4301
    unsigned long long v20;  // d8
    uint128_t v74;  // 4303
    uint128_t v75;  // q24
    st_a90ba0_1 *v76;  // x8
    uint128_t v77;  // 4311
    uint128_t v78;  // 4313
    uint128_t v79;  // q25
    st_a90ba0_2 *v80;  // x8
    uint128_t v81;  // 4321
    uint128_t v82;  // 4323
    uint128_t v83;  // q26
    unsigned long long v21;  // d9
    st_a90ba0_3 *v84;  // x8
    uint128_t v85;  // 4331
    uint128_t v86;  // 4333
    uint128_t v87;  // q27
    st_a90ba0_5 *v88;  // x8
    uint128_t v89;  // 4341
    uint128_t v90;  // 4343
    uint128_t v91;  // q11
    uint128_t v92;  // q11
    uint128_t v93;  // 4354
    unsigned long long v22;  // d10
    uint128_t v94;  // 4356
    unsigned long v95;  // x12
    uint128_t v96;  // 4363
    uint128_t v97;  // 4365
    uint128_t v98;  // 4372
    uint128_t v99;  // 4374
    uint128_t v100;  // q28
    uint128_t v101;  // 4382
    uint128_t v102;  // 4384
    uint128_t v103;  // 4391
    unsigned long long v23;  // d11
    uint128_t v104;  // 4393
    uint128_t v105;  // 4397
    uint128_t v106;  // 4399
    uint128_t v107;  // 4099
    uint128_t v108;  // 4101
    uint128_t v109;  // q29
    uint128_t v110;  // 4109
    uint128_t v111;  // 4111
    uint128_t v112;  // 4115
    uint128_t v113;  // 4117
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    unsigned long long v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]

    if (!a1)
        return 0;
    v0 = v14;
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
    v12 = v26;
    v13 = v27;
    v28 = *(long long *)a4;
    v29 = a5->field_c0;
    v30 = a5->field_c8;
    v31 = a5->field_0;
    v32 = &a5->field_10;
    v33 = v32->field_0;
    v34 = &v32->field_10;
    v35 = (unsigned long long)((long long)a4[8]) >> 32;
    v36 = (long long)a4[8] & 0xffffffff;
    v37 = (unsigned int)((((((v35 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v35 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v35 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v35 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) + 1;
    v38 = v34->field_0;
    v39 = &v34->field_10;
    v40 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((*(int128_t *)a4 ^ v31) >> 64), (long long)*(int128_t *)a4 ^ (unsigned long long)v31);
    v41 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v40 >> 64), (unsigned long long)v40);
    v42 = (unsigned int)v37 + 1;
    v43 = v39->field_0;
    v44 = &v39->field_10;
    v45 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v36 | ((((((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v46 = (unsigned int)v42 + 1;
    v47 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v36 | ((((((v42 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v42 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v42 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v42 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v48 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v41 ^ v33) >> 64), (unsigned long long)v41 ^ (unsigned long long)v33);
    v49 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v48 >> 64), (unsigned long long)v48);
    v50 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v36 | ((((((v46 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v46 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v46 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v46 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v51 = v44->field_0;
    v52 = &v44->field_10;
    v53 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v49 ^ v38) >> 64), (unsigned long long)v49 ^ (unsigned long long)v38);
    v54 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v53 >> 64), (unsigned long long)v53);
    v55 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v47 ^ v31) >> 64), (unsigned long long)v47 ^ (unsigned long long)v31);
    v56 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v55 >> 64), (unsigned long long)v55);
    v57 = v52->field_0;
    v58 = &v52->field_10;
    v59 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v45 ^ v31) >> 64), (unsigned long long)v45 ^ (unsigned long long)v31);
    v60 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v59 >> 64), (unsigned long long)v59);
    v61 = __dirty_unsupported_Iop_SliceV128(a3[7], a3[7], 8);
    v62 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v50 ^ v31) >> 64), (unsigned long long)v50 ^ (unsigned long long)v31);
    v63 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v62 >> 64), (unsigned long long)v62);
    v64 = __dirty_unsupported_Iop_SliceV128(a3[4], a3[4], 8);
    v65 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v56 ^ v33) >> 64), (unsigned long long)v56 ^ (unsigned long long)v33);
    v66 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v65 >> 64), (unsigned long long)v65);
    v67 = __dirty_unsupported_Iop_SliceV128(a3[5], a3[5], 8);
    v68 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v60 ^ v33) >> 64), (unsigned long long)v60 ^ (unsigned long long)v33);
    v69 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v68 >> 64), (unsigned long long)v68);
    v70 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v63 ^ v33) >> 64), (unsigned long long)v63 ^ (unsigned long long)v33);
    v71 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v70 >> 64), (unsigned long long)v70);
    v72 = __dirty_unsupported_Iop_SliceV128(a3[2], a3[2], 8);
    v73 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v66 ^ v38) >> 64), (unsigned long long)v66 ^ (unsigned long long)v38);
    v74 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v73 >> 64), (unsigned long long)v73);
    v75 = v58->field_0;
    v76 = &v58->field_10;
    v77 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v54 ^ v43) >> 64), (unsigned long long)v54 ^ (unsigned long long)v43);
    v78 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v77 >> 64), (unsigned long long)v77);
    v79 = v76->field_0;
    v80 = &v76->field_10;
    v81 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v69 ^ v38) >> 64), (unsigned long long)v69 ^ (unsigned long long)v38);
    v82 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v81 >> 64), (unsigned long long)v81);
    v83 = v80->field_0;
    v84 = &v80->field_10;
    v85 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v71 ^ v38) >> 64), (unsigned long long)v71 ^ (unsigned long long)v38);
    v86 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v85 >> 64), (unsigned long long)v85);
    v87 = v84->field_0;
    v88 = &v84->field_10;
    v89 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v74 ^ v43) >> 64), (unsigned long long)v74 ^ (unsigned long long)v43);
    v90 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v89 >> 64), (unsigned long long)v89);
    v91 = __dirty_unsupported_Iop_SliceV128(*a3, *a3, 8);
    v92 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v91);
    v93 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v82 ^ v43) >> 64), (unsigned long long)v82 ^ (unsigned long long)v43);
    v94 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v93 >> 64), (unsigned long long)v93);
    v95 = (unsigned int)v46 + 1;
    v96 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v86 ^ v43) >> 64), (unsigned long long)v86 ^ (unsigned long long)v43);
    v97 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v96 >> 64), (unsigned long long)v96);
    v98 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v78 ^ v51) >> 64), (unsigned long long)v78 ^ (unsigned long long)v51);
    v99 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v98 >> 64), (unsigned long long)v98);
    v100 = v88->field_0;
    v101 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v94 ^ v51) >> 64), (unsigned long long)v94 ^ (unsigned long long)v51);
    v102 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v101 >> 64), (unsigned long long)v101);
    v103 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v90 ^ v51) >> 64), (unsigned long long)v90 ^ (unsigned long long)v51);
    v104 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v103 >> 64), (unsigned long long)v103);
    v105 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v97 ^ v51) >> 64), (unsigned long long)v97 ^ (unsigned long long)v51);
    v106 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v105 >> 64), (unsigned long long)v105);
    v107 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v99 ^ v57) >> 64), (unsigned long long)v99 ^ (unsigned long long)v57);
    v108 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v107 >> 64), (unsigned long long)v107);
    v109 = v88->field_10;
    v110 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v102 ^ v57) >> 64), (unsigned long long)v102 ^ (unsigned long long)v57);
    v111 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v110 >> 64), (unsigned long long)v110);
    v112 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v104 ^ v57) >> 64), (unsigned long long)v104 ^ (unsigned long long)v57);
    v113 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v112 >> 64), (unsigned long long)v112);
    v114 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v106 ^ v57) >> 64), (unsigned long long)v106 ^ (unsigned long long)v57);
    v115 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v114 >> 64), (unsigned long long)v114);
    v116 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v108 ^ v75) >> 64), (unsigned long long)v108 ^ (unsigned long long)v75);
    v117 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v116 >> 64), (unsigned long long)v116);
    v118 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v113 ^ v75) >> 64), (unsigned long long)v113 ^ (unsigned long long)v75);
    v119 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v118 >> 64), (unsigned long long)v118);
    v120 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v115 ^ v75) >> 64), (unsigned long long)v115 ^ (unsigned long long)v75);
    v121 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v120 >> 64), (unsigned long long)v120);
    v122 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v117 ^ v79) >> 64), (unsigned long long)v117 ^ (unsigned long long)v79);
    v123 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v122 >> 64), (unsigned long long)v122);
    v124 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v119 ^ v79) >> 64), (unsigned long long)v119 ^ (unsigned long long)v79);
    v125 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v124 >> 64), (unsigned long long)v124);
    v126 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v121 ^ v79) >> 64), (unsigned long long)v121 ^ (unsigned long long)v79);
    v127 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v126 >> 64), (unsigned long long)v126);
    v128 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v111 ^ v75) >> 64), (unsigned long long)v111 ^ (unsigned long long)v75);
    v129 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v128 >> 64), (unsigned long long)v128);
    v130 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v125 ^ v83) >> 64), (unsigned long long)v125 ^ (unsigned long long)v83);
    v131 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v130 >> 64), (unsigned long long)v130);
    v132 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v127 ^ v83) >> 64), (unsigned long long)v127 ^ (unsigned long long)v83);
    v133 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v132 >> 64), (unsigned long long)v132);
    v134 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v129 ^ v79) >> 64), (unsigned long long)v129 ^ (unsigned long long)v79);
    v135 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v134 >> 64), (unsigned long long)v134);
    v136 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v131 ^ v87) >> 64), (unsigned long long)v131 ^ (unsigned long long)v87);
    v137 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v136 >> 64), (unsigned long long)v136);
    v138 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v133 ^ v87) >> 64), (unsigned long long)v133 ^ (unsigned long long)v87);
    v139 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v138 >> 64), (unsigned long long)v138);
    v140 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v135 ^ v83) >> 64), (unsigned long long)v135 ^ (unsigned long long)v83);
    v141 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v140 >> 64), (unsigned long long)v140);
    v142 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v123 ^ v83) >> 64), (unsigned long long)v123 ^ (unsigned long long)v83);
    v143 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v142 >> 64), (unsigned long long)v142);
    v144 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v139 ^ v100) >> 64), (unsigned long long)v139 ^ (unsigned long long)v100);
    v145 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v144 >> 64), (unsigned long long)v144);
    v146 = ((a1 >> 3) - 1 & 0xffffffffffffffc0) + (char *)a0;
    v147 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v141 ^ v87) >> 64), (unsigned long long)v141 ^ (unsigned long long)v87);
    v148 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v147 >> 64), (unsigned long long)v147);
    v149 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v143 ^ v87) >> 64), (unsigned long long)v143 ^ (unsigned long long)v87);
    v150 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v149 >> 64), (unsigned long long)v149);
    v151 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v145 ^ v109) >> 64), (unsigned long long)v145 ^ (unsigned long long)v109);
    v152 = v151;
    v153 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v137 ^ v100) >> 64), (unsigned long long)v137 ^ (unsigned long long)v100);
    v154 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v153 >> 64), (unsigned long long)v153);
    v155 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v148 ^ v100) >> 64), (unsigned long long)v148 ^ (unsigned long long)v100);
    v156 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v155 >> 64), (unsigned long long)v155);
    v157 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v150 ^ v100) >> 64), (unsigned long long)v150 ^ (unsigned long long)v100);
    v158 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v157 >> 64), (unsigned long long)v157);
    v159 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v64, v64)), _mm_unpackhi_epi64(_mm_unpackhi_epi64(v72, v72), _mm_unpackhi_epi64(v64, v64)));
    v160 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v154 ^ v109) >> 64), (unsigned long long)v154 ^ (unsigned long long)v109);
    v161 = v160;
    v162 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v156 ^ v109) >> 64), (unsigned long long)v156 ^ (unsigned long long)v109);
    v163 = v162;
    v164 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v67, v67), _mm_unpacklo_epi64(v61, v61)), _mm_unpackhi_epi64(_mm_unpackhi_epi64(v67, v67), _mm_unpackhi_epi64(v61, v61)));
    v165 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v158 ^ v109) >> 64), (unsigned long long)v158 ^ (unsigned long long)v109);
    v166 = v165;
    i = a0;
    if (v146 > i)
    {
        v168 = a0 + 2;
        v169 = v163 ^ a0[1];
        v170 = v166 ^ *a0;
        v171 = v168[1];
        v172 = *v168;
        i = v168 + 2;
        v173 = (unsigned int)v95 + 1;
        v174 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*a0);
        v175 = __dirty_unsupported_Iop_Reverse8sIn64_x2(a0[1]);
        v176 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v36 | ((((((v95 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v95 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v95 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v95 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        v177 = (unsigned int)v173 + 1;
        v178 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v36 | ((((((v173 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v173 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v173 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v173 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        *iter = *(unsigned long long *)&*(unsigned long long *)(void*)&v170 ^ v29;
        iter[1] = *(unsigned long long *)((void*)&v170 + 8) ^ v30;
        v179 = iter + 2;
        v180 = v36 | ((((((v177 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v177 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v177 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v177 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000;
        *v179 = *(unsigned long long *)&*(unsigned long long *)(void*)&v169 ^ v29;
        v179[1] = *(unsigned long long *)((void*)&v169 + 8) ^ v30;
        v181 = v179 + 2;
        v182 = (unsigned int)v177 + 1;
        v183 = v161 ^ v172;
        if (v146 > i)
        {
            do
            {
                v184 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v178 ^ v31) >> 64), (unsigned long long)v178 ^ (unsigned long long)v31);
                v185 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v184 >> 64), (unsigned long long)v184);
                v187 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v175, _mm_cvtsi128_si64(v67));
                v188 = v152 ^ v171;
                v189 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v171);
                v190 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v185 ^ v33) >> 64), (unsigned long long)v185 ^ (unsigned long long)v33);
                v191 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v190 >> 64), (unsigned long long)v190);
                v192 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v176 ^ v31) >> 64), (unsigned long long)v176 ^ (unsigned long long)v31);
                v193 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v192 >> 64), (unsigned long long)v192);
                v194 = __dirty_unsupported_Iop_SliceV128(v92, v92, 8) ^ v174;
                v195 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v175 >> 64), _mm_extract_epi64(v67, 1));
                v196 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v180);
                v197 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v191 ^ v38) >> 64), (unsigned long long)v191 ^ (unsigned long long)v38);
                v198 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v197 >> 64), (unsigned long long)v197);
                v199 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v193 ^ v33) >> 64), (unsigned long long)v193 ^ (unsigned long long)v33);
                v200 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v199 >> 64), (unsigned long long)v199);
                v201 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v194 >> 64), _mm_extract_epi64(v61, 1));
                v202 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v194, _mm_cvtsi128_si64(v61));
                v203 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v196 ^ v31) >> 64), (unsigned long long)v196 ^ (unsigned long long)v31);
                v204 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v203 >> 64), (unsigned long long)v203);
                v205 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v36 | ((((((v182 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v182 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v182 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v182 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v207 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v198 ^ v43) >> 64), (unsigned long long)v198 ^ (unsigned long long)v43);
                v208 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v207 >> 64), (unsigned long long)v207);
                v209 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v200 ^ v38) >> 64), (unsigned long long)v200 ^ (unsigned long long)v38);
                v210 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v209 >> 64), (unsigned long long)v209);
                v211 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v204 ^ v33) >> 64), (unsigned long long)v204 ^ (unsigned long long)v33);
                v212 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v211 >> 64), (unsigned long long)v211);
                v214 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v194 ^ *(unsigned long long *)((void*)&v194 + 8)), _mm_extract_epi64(v164, 1));
                v215 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v205 ^ v31) >> 64), (unsigned long long)v205 ^ (unsigned long long)v31);
                v216 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v215 >> 64), (unsigned long long)v215);
                v217 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v172);
                v218 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v212 ^ v38) >> 64), (unsigned long long)v212 ^ (unsigned long long)v38);
                v219 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v218 >> 64), (unsigned long long)v218);
                v220 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v175 ^ *(unsigned long long *)((void*)&v175 + 8)), _mm_cvtsi128_si64(v164));
                v221 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v208 ^ v51) >> 64), (unsigned long long)v208 ^ (unsigned long long)v51);
                v222 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v221 >> 64), (unsigned long long)v221);
                v223 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v210 ^ v43) >> 64), (unsigned long long)v210 ^ (unsigned long long)v43);
                v224 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v223 >> 64), (unsigned long long)v223);
                v225 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v216 ^ v33) >> 64), (unsigned long long)v216 ^ (unsigned long long)v33);
                v226 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v225 >> 64), (unsigned long long)v225);
                v227 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v224 ^ v51) >> 64), (unsigned long long)v224 ^ (unsigned long long)v51);
                v228 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v227 >> 64), (unsigned long long)v227);
                v229 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v217 >> 64), _mm_extract_epi64(v64, 1));
                v230 = __dirty_unsupported_Iop_ZeroHI64ofV128(v217 ^ *(unsigned long long *)((void*)&v217 + 8));
                v231 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v217, _mm_cvtsi128_si64(v64));
                v232 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v228 ^ v57) >> 64), (unsigned long long)v228 ^ (unsigned long long)v57);
                v233 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v232 >> 64), (unsigned long long)v232);
                v234 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v222 ^ v57) >> 64), (unsigned long long)v222 ^ (unsigned long long)v57);
                v235 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v234 >> 64), (unsigned long long)v234);
                v236 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v189 >> 64), _mm_extract_epi64(v72, 1));
                v237 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v226 ^ v38) >> 64), (unsigned long long)v226 ^ (unsigned long long)v38);
                v238 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v237 >> 64), (unsigned long long)v237);
                v240 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v235 ^ v75) >> 64), (unsigned long long)v235 ^ (unsigned long long)v75);
                v241 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v240 >> 64), (unsigned long long)v240);
                v242 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v233 ^ v75) >> 64), (unsigned long long)v233 ^ (unsigned long long)v75);
                v243 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v242 >> 64), (unsigned long long)v242);
                v245 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v238 ^ v43) >> 64), (unsigned long long)v238 ^ (unsigned long long)v43);
                v246 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v245 >> 64), (unsigned long long)v245);
                v247 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v189 ^ *(unsigned long long *)((void*)&v189 + 8)), _mm_cvtsi128_si64(v159));
                v248 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v243 ^ v79) >> 64), (unsigned long long)v243 ^ (unsigned long long)v79);
                v249 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v248 >> 64), (unsigned long long)v248);
                v250 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v230, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v230) >> 64, _mm_extract_epi64(v159, 1));
                v251 = v236 ^ v229 ^ v195 ^ v201;
                v252 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v241 ^ v79) >> 64), (unsigned long long)v241 ^ (unsigned long long)v79);
                v253 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v252 >> 64), (unsigned long long)v252);
                v254 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v249 ^ v83) >> 64), (unsigned long long)v249 ^ (unsigned long long)v83);
                v255 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v254 >> 64), (unsigned long long)v254);
                v256 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v189, _mm_cvtsi128_si64(v72));
                v257 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v253 ^ v83) >> 64), (unsigned long long)v253 ^ (unsigned long long)v83);
                v258 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v257 >> 64), (unsigned long long)v257);
                v259 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v219 ^ v43) >> 64), (unsigned long long)v219 ^ (unsigned long long)v43);
                v260 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v259 >> 64), (unsigned long long)v259);
                v261 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v255 ^ v87) >> 64), (unsigned long long)v255 ^ (unsigned long long)v87);
                v262 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v261 >> 64), (unsigned long long)v261);
                v263 = v256 ^ v231 ^ v187 ^ v202;
                v264 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v246 ^ v51) >> 64), (unsigned long long)v246 ^ (unsigned long long)v51);
                v265 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v264 >> 64), (unsigned long long)v264);
                v266 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v260 ^ v51) >> 64), (unsigned long long)v260 ^ (unsigned long long)v51);
                v267 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v266 >> 64), (unsigned long long)v266);
                v268 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v262 ^ v100) >> 64), (unsigned long long)v262 ^ (unsigned long long)v100);
                v269 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v268 >> 64), (unsigned long long)v268);
                v270 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v258 ^ v87) >> 64), (unsigned long long)v258 ^ (unsigned long long)v87);
                v271 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v270 >> 64), (unsigned long long)v270);
                v272 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v267 ^ v57) >> 64), (unsigned long long)v267 ^ (unsigned long long)v57);
                v273 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v272 >> 64), (unsigned long long)v272);
                v274 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v265 ^ v57) >> 64), (unsigned long long)v265 ^ (unsigned long long)v57);
                v275 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v274 >> 64), (unsigned long long)v274);
                v276 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
                v277 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v271 ^ v100) >> 64), (unsigned long long)v271 ^ (unsigned long long)v100);
                v278 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v277 >> 64), (unsigned long long)v277);
                v279 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v273 ^ v75) >> 64), (unsigned long long)v273 ^ (unsigned long long)v75);
                v280 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v279 >> 64), (unsigned long long)v279);
                v281 = *i;
                v282 = i + 1;
                v283 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v275 ^ v75) >> 64), (unsigned long long)v275 ^ (unsigned long long)v75);
                v284 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v283 >> 64), (unsigned long long)v283);
                v285 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v251, v276);
                v286 = *v282;
                v287 = v282 + 1;
                v288 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v280 ^ v79) >> 64), (unsigned long long)v280 ^ (unsigned long long)v79);
                v289 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v288 >> 64), (unsigned long long)v288);
                v290 = __dirty_unsupported_Iop_SliceV128(v251, v251, 8);
                v291 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v269 ^ v109) >> 64), (unsigned long long)v269 ^ (unsigned long long)v109);
                v292 = (unsigned int)v182 + 1;
                v293 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v284 ^ v79) >> 64), (unsigned long long)v284 ^ (unsigned long long)v79);
                v294 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v293 >> 64), (unsigned long long)v293);
                v295 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v289 ^ v83) >> 64), (unsigned long long)v289 ^ (unsigned long long)v83);
                v296 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v295 >> 64), (unsigned long long)v295);
                v172 = *v287;
                v297 = v287 + 1;
                v298 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v278 ^ v109) >> 64), (unsigned long long)v278 ^ (unsigned long long)v109);
                v171 = *v297;
                i = v297 + 1;
                v299 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v294 ^ v83) >> 64), (unsigned long long)v294 ^ (unsigned long long)v83);
                v300 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v299 >> 64), (unsigned long long)v299);
                *v181 = (unsigned long long)v183 ^ v29;
                v181[1] = *(unsigned long long *)((void*)&v183 + 8) ^ v30;
                v301 = v181 + 2;
                v302 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v296 ^ v87) >> 64), (unsigned long long)v296 ^ (unsigned long long)v87);
                v303 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v302 >> 64), (unsigned long long)v302);
                v304 = v290 ^ v285 ^ v251 ^ v263 ^ v247 ^ v250 ^ v220 ^ v214;
                v305 = v291 ^ v281;
                v306 = v298 ^ v286;
                v307 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v303 ^ v100) >> 64), (unsigned long long)v303 ^ (unsigned long long)v100);
                v308 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v307 >> 64), (unsigned long long)v307);
                v309 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v300 ^ v87) >> 64), (unsigned long long)v300 ^ (unsigned long long)v87);
                v310 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v309 >> 64), (unsigned long long)v309);
                v311 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v304, v276);
                *v301 = *(unsigned long long *)&*(unsigned long long *)(void*)&v188 ^ v29;
                v301[1] = *(unsigned long long *)((void*)&v188 + 8) ^ v30;
                v312 = v301 + 2;
                v175 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v286);
                v313 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v308 ^ v109) >> 64), (unsigned long long)v308 ^ (unsigned long long)v109);
                v314 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v310 ^ v100) >> 64), (unsigned long long)v310 ^ (unsigned long long)v100);
                v315 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v314 >> 64), (unsigned long long)v314);
                v316 = (unsigned int)v292 + 1;
                v317 = __dirty_unsupported_Iop_SliceV128(v304, v304, 8);
                v183 = v313 ^ v172;
                v176 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v36 | ((((((v292 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v292 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v292 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v292 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v318 = (unsigned int)v316 + 1;
                v178 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v36 | ((((((v316 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v316 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v316 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v316 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                *v312 = *(unsigned long long *)&*(unsigned long long *)(void*)&v305 ^ v29;
                v312[1] = *(unsigned long long *)((void*)&v305 + 8) ^ v30;
                v319 = v312 + 2;
                v92 = v317 ^ v311 ^ v263;
                v182 = (unsigned int)v318 + 1;
                v174 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v281);
                v180 = v36 | ((((((v318 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v318 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v318 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v318 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000;
                v320 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v315 ^ v109) >> 64), (unsigned long long)v315 ^ (unsigned long long)v109);
                v152 = v320;
                *v319 = *(unsigned long long *)&*(unsigned long long *)(void*)&v306 ^ v29;
                v319[1] = *(unsigned long long *)((void*)&v306 + 8) ^ v30;
                v181 = v319 + 2;
            } while (i < v146);
        }
        v322 = v152 ^ v171;
        v323 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v178 ^ v31) >> 64), (unsigned long long)v178 ^ (unsigned long long)v31);
        v324 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v323 >> 64), (unsigned long long)v323);
        v325 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v176 ^ v31) >> 64), (unsigned long long)v176 ^ (unsigned long long)v31);
        v326 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v325 >> 64), (unsigned long long)v325);
        v327 = __dirty_unsupported_Iop_SliceV128(v92, v92, 8) ^ v174;
        v328 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v324 ^ v33) >> 64), (unsigned long long)v324 ^ (unsigned long long)v33);
        v329 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v328 >> 64), (unsigned long long)v328);
        v330 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v326 ^ v33) >> 64), (unsigned long long)v326 ^ (unsigned long long)v33);
        v331 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v330 >> 64), (unsigned long long)v330);
        v332 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v327, _mm_cvtsi128_si64(v61));
        v333 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v329 ^ v38) >> 64), (unsigned long long)v329 ^ (unsigned long long)v38);
        v334 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v333 >> 64), (unsigned long long)v333);
        v335 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v172);
        v336 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v327 >> 64), _mm_extract_epi64(v61, 1));
        v337 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v180);
        v339 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v175, _mm_cvtsi128_si64(v67));
        v340 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v36 | ((((((v182 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v182 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v182 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v182 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        v341 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v331 ^ v38) >> 64), (unsigned long long)v331 ^ (unsigned long long)v38);
        v342 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v341 >> 64), (unsigned long long)v341);
        v343 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v175 >> 64), _mm_extract_epi64(v67, 1));
        v344 = __dirty_unsupported_Iop_ZeroHI64ofV128(v175 ^ *(unsigned long long *)((void*)&v175 + 8));
        v345 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v327 ^ *(unsigned long long *)((void*)&v327 + 8)), _mm_extract_epi64(v164, 1));
        *v181 = (unsigned long long)v183 ^ v29;
        v181[1] = *(unsigned long long *)((void*)&v183 + 8) ^ v30;
        v346 = v181 + 2;
        v347 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v171);
        *v346 = *(unsigned long long *)&*(unsigned long long *)(void*)&v322 ^ v29;
        v346[1] = *(unsigned long long *)((void*)&v322 + 8) ^ v30;
        iter = v346 + 2;
        v348 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v340 ^ v31) >> 64), (unsigned long long)v340 ^ (unsigned long long)v31);
        v349 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v348 >> 64), (unsigned long long)v348);
        v350 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, v344, _mm_cvtsi128_si64(v164));
        v95 = (unsigned int)v182 + 1;
        v351 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v335 >> 64), _mm_extract_epi64(v64, 1));
        v352 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v337 ^ v31) >> 64), (unsigned long long)v337 ^ (unsigned long long)v31);
        v353 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v352 >> 64), (unsigned long long)v352);
        v354 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v349 ^ v33) >> 64), (unsigned long long)v349 ^ (unsigned long long)v33);
        v355 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v354 >> 64), (unsigned long long)v354);
        v356 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v353 ^ v33) >> 64), (unsigned long long)v353 ^ (unsigned long long)v33);
        v357 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v356 >> 64), (unsigned long long)v356);
        v358 = __dirty_unsupported_Iop_ZeroHI64ofV128(v335 ^ *(unsigned long long *)((void*)&v335 + 8));
        v359 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v335, _mm_cvtsi128_si64(v64));
        v360 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v357 ^ v38) >> 64), (unsigned long long)v357 ^ (unsigned long long)v38);
        v361 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v360 >> 64), (unsigned long long)v360);
        v362 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v355 ^ v38) >> 64), (unsigned long long)v355 ^ (unsigned long long)v38);
        v363 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v362 >> 64), (unsigned long long)v362);
        v365 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v347, _mm_cvtsi128_si64(v72));
        v366 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v342 ^ v43) >> 64), (unsigned long long)v342 ^ (unsigned long long)v43);
        v367 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v366 >> 64), (unsigned long long)v366);
        v369 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v334 ^ v43) >> 64), (unsigned long long)v334 ^ (unsigned long long)v43);
        v370 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v369 >> 64), (unsigned long long)v369);
        v371 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v358, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v358) >> 64, _mm_extract_epi64(v159, 1));
        v372 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v367 ^ v51) >> 64), (unsigned long long)v367 ^ (unsigned long long)v51);
        v373 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v372 >> 64), (unsigned long long)v372);
        v374 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v347 >> 64), _mm_extract_epi64(v72, 1));
        v375 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v347 ^ *(unsigned long long *)((void*)&v347 + 8)), _mm_cvtsi128_si64(v159));
        v376 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v361 ^ v43) >> 64), (unsigned long long)v361 ^ (unsigned long long)v43);
        v377 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v376 >> 64), (unsigned long long)v376);
        v378 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
        v379 = v374 ^ v351 ^ v343 ^ v336;
        v380 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v373 ^ v57) >> 64), (unsigned long long)v373 ^ (unsigned long long)v57);
        v381 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v380 >> 64), (unsigned long long)v380);
        v382 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v377 ^ v51) >> 64), (unsigned long long)v377 ^ (unsigned long long)v51);
        v383 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v382 >> 64), (unsigned long long)v382);
        v384 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v379, v378);
        v385 = v365 ^ v359 ^ v339 ^ v332;
        v386 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v381 ^ v75) >> 64), (unsigned long long)v381 ^ (unsigned long long)v75);
        v387 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v386 >> 64), (unsigned long long)v386);
        v388 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v363 ^ v43) >> 64), (unsigned long long)v363 ^ (unsigned long long)v43);
        v389 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v388 >> 64), (unsigned long long)v388);
        v390 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v383 ^ v57) >> 64), (unsigned long long)v383 ^ (unsigned long long)v57);
        v391 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v390 >> 64), (unsigned long long)v390);
        v392 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v387 ^ v79) >> 64), (unsigned long long)v387 ^ (unsigned long long)v79);
        v393 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v392 >> 64), (unsigned long long)v392);
        v394 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v389 ^ v51) >> 64), (unsigned long long)v389 ^ (unsigned long long)v51);
        v395 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v394 >> 64), (unsigned long long)v394);
        v396 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v391 ^ v75) >> 64), (unsigned long long)v391 ^ (unsigned long long)v75);
        v397 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v396 >> 64), (unsigned long long)v396);
        v399 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v393 ^ v83) >> 64), (unsigned long long)v393 ^ (unsigned long long)v83);
        v400 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v399 >> 64), (unsigned long long)v399);
        v401 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v395 ^ v57) >> 64), (unsigned long long)v395 ^ (unsigned long long)v57);
        v402 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v401 >> 64), (unsigned long long)v401);
        v403 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v370 ^ v51) >> 64), (unsigned long long)v370 ^ (unsigned long long)v51);
        v404 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v403 >> 64), (unsigned long long)v403);
        v405 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v397 ^ v79) >> 64), (unsigned long long)v397 ^ (unsigned long long)v79);
        v406 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v405 >> 64), (unsigned long long)v405);
        v407 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v400 ^ v87) >> 64), (unsigned long long)v400 ^ (unsigned long long)v87);
        v408 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v407 >> 64), (unsigned long long)v407);
        v409 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v404 ^ v57) >> 64), (unsigned long long)v404 ^ (unsigned long long)v57);
        v410 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v409 >> 64), (unsigned long long)v409);
        v411 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v402 ^ v75) >> 64), (unsigned long long)v402 ^ (unsigned long long)v75);
        v412 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v411 >> 64), (unsigned long long)v411);
        v413 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v408 ^ v100) >> 64), (unsigned long long)v408 ^ (unsigned long long)v100);
        v414 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v413 >> 64), (unsigned long long)v413);
        v415 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v410 ^ v75) >> 64), (unsigned long long)v410 ^ (unsigned long long)v75);
        v416 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v415 >> 64), (unsigned long long)v415);
        v417 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v412 ^ v79) >> 64), (unsigned long long)v412 ^ (unsigned long long)v79);
        v418 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v417 >> 64), (unsigned long long)v417);
        v419 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v406 ^ v83) >> 64), (unsigned long long)v406 ^ (unsigned long long)v83);
        v420 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v419 >> 64), (unsigned long long)v419);
        v421 = __dirty_unsupported_Iop_SliceV128(v379, v379, 8) ^ v384 ^ v379 ^ v385 ^ v375 ^ v371 ^ v350 ^ v345;
        v422 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v416 ^ v79) >> 64), (unsigned long long)v416 ^ (unsigned long long)v79);
        v423 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v422 >> 64), (unsigned long long)v422);
        v424 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v418 ^ v83) >> 64), (unsigned long long)v418 ^ (unsigned long long)v83);
        v425 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v424 >> 64), (unsigned long long)v424);
        v426 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v420 ^ v87) >> 64), (unsigned long long)v420 ^ (unsigned long long)v87);
        v427 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v426 >> 64), (unsigned long long)v426);
        v428 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v423 ^ v83) >> 64), (unsigned long long)v423 ^ (unsigned long long)v83);
        v429 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v428 >> 64), (unsigned long long)v428);
        v430 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v425 ^ v87) >> 64), (unsigned long long)v425 ^ (unsigned long long)v87);
        v431 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v430 >> 64), (unsigned long long)v430);
        v432 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v421, v378);
        v433 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v429 ^ v87) >> 64), (unsigned long long)v429 ^ (unsigned long long)v87);
        v434 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v433 >> 64), (unsigned long long)v433);
        v435 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v427 ^ v100) >> 64), (unsigned long long)v427 ^ (unsigned long long)v100);
        v436 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v435 >> 64), (unsigned long long)v435);
        v437 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v431 ^ v100) >> 64), (unsigned long long)v431 ^ (unsigned long long)v100);
        v438 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v437 >> 64), (unsigned long long)v437);
        v440 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v434 ^ v100) >> 64), (unsigned long long)v434 ^ (unsigned long long)v100);
        v441 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v440 >> 64), (unsigned long long)v440);
        v166 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v414 ^ v109) >> 64), (unsigned long long)v414 ^ (unsigned long long)v109);
        v161 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v436 ^ v109) >> 64), (unsigned long long)v436 ^ (unsigned long long)v109);
        v163 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v441 ^ v109) >> 64), (unsigned long long)v441 ^ (unsigned long long)v109);
        v152 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v438 ^ v109) >> 64), (unsigned long long)v438 ^ (unsigned long long)v109);
        v92 = __dirty_unsupported_Iop_SliceV128(v421, v421, 8) ^ v432 ^ v385;
    }
    v442 = i;
    v443 = (char *)a0 + (a1 >> 3) - v442;
    v444 = *v442;
    node = v442 + 1;
    v446 = v166 ^ v444;
    v447 = __dirty_unsupported_Iop_SliceV128(v92, v92, 8);
    v448 = *(unsigned long long *)((void*)&v446 + 8) ^ v30;
    v449 = *(unsigned long long *)&*(unsigned long long *)(void*)&v446 ^ v29;
    if (48 >= v443)
    {
        v450 = 0;
        v451 = 0;
        v152 = v161;
        v161 = v163;
        v95 = (unsigned int)v95 - 1;
        v452 = 0;
        if (32 < v443)
            goto LABEL_a914b4;
        v152 = v163;
        v95 = (unsigned int)v95 - 1;
        if (16 < v443)
            goto LABEL_a914fc;
        v95 = (unsigned int)v95 - 1;
    }
    else
    {
        v453 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v444);
        v444 = *node;
        node += 1;
        *iter = v449;
        iter[1] = v448;
        iter += 2;
        v454 = v447 ^ v453;
        v455 = v163 ^ v444;
        v456 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v454, _mm_cvtsi128_si64(v61));
        v450 = v456;
        v458 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v454 >> 64), _mm_extract_epi64(v61, 1));
        v451 = v458;
        v449 = *(unsigned long long *)&*(unsigned long long *)(void*)&v455 ^ v29;
        v447 = 0;
        v459 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v454 ^ *(unsigned long long *)((void*)&v454 + 8)), _mm_extract_epi64(v164, 1));
        v452 = v459;
        v448 = *(unsigned long long *)((void*)&v455 + 8) ^ v30;
LABEL_a914b4:
        v460 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v444);
        v444 = *node;
        node += 1;
        v461 = v447 ^ v460;
        v447 = 0;
        v462 = v161 ^ v444;
        v463 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v461, _mm_cvtsi128_si64(v67));
        *iter = v449;
        iter[1] = v448;
        iter += 2;
        v450 ^= v463;
        v465 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v461 >> 64), _mm_extract_epi64(v67, 1));
        v466 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v461 ^ *(unsigned long long *)((void*)&v461 + 8)), _mm_cvtsi128_si64(v164));
        v451 ^= v465;
        v448 = *(unsigned long long *)((void*)&v462 + 8) ^ v30;
        v449 = *(unsigned long long *)&*(unsigned long long *)(void*)&v462 ^ v29;
        v452 ^= v466;
LABEL_a914fc:
        v468 = v447 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v444);
        v444 = *node;
        v469 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v468 >> 64), _mm_extract_epi64(v64, 1));
        v470 = v152 ^ v444;
        *iter = v449;
        iter[1] = v448;
        iter += 2;
        v471 = __dirty_unsupported_Iop_ZeroHI64ofV128(v468 ^ *(unsigned long long *)((void*)&v468 + 8));
        v451 ^= v469;
        v472 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v468, _mm_cvtsi128_si64(v64));
        v474 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v471, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v471) >> 64, _mm_extract_epi64(v159, 1));
        v447 = 0;
        v450 ^= v472;
        v448 = *(unsigned long long *)((void*)&v470 + 8) ^ v30;
        v449 = *(unsigned long long *)&*(unsigned long long *)(void*)&v470 ^ v29;
        v452 ^= v474;
    }
    v475 = iter[1];
    v476 = -((a1 & 127) - 128) & 127;
    v477 = 0xffffffffffffffff >> ((char)v476 & 63);
    v478 = v476;
    if ((long long)v476 < 64)
    {
        v479 = 0xffffffffffffffff;
        v480 = arm64g_calculate_condition(180, v478, 64, 0);
        if (!(v480 & 1))
            goto LABEL_a91572;
LABEL_a91571:
        v482 = v477;
    }
    else
    {
        v479 = v477;
        v481 = arm64g_calculate_condition(180, v478, 64, 0);
        if (v481 & 1)
            goto LABEL_a91571;
LABEL_a91572:
        v482 = 0;
    }
    v483 = *iter & ~v479;
    v484 = _INSERT(__double_as_longlong(__longlong_as_double(v479)), 8, v482);
    *(unsigned int *)&a4[12] = (((((v95 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v95 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v95 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v95 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v485 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v444 & v484);
    v486 = v447 ^ v485;
    v487 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v486 >> 64), _mm_extract_epi64(v72, 1));
    v488 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v486, _mm_cvtsi128_si64(v72));
    v490 = v487 ^ v451;
    v491 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v486 ^ *(unsigned long long *)((void*)&v486 + 8)), _mm_cvtsi128_si64(v159));
    v492 = v488 ^ v450;
    v493 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
    v494 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v490, v493);
    *iter = v449 & v479 | v483;
    iter[1] = v448 & v482 | v475 & ~v482;
    v496 = __dirty_unsupported_Iop_SliceV128(v490, v490, 8) ^ v494 ^ v490 ^ v492 ^ v491 ^ v452;
    v497 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v496, v493);
    v498 = __dirty_unsupported_Iop_SliceV128(v496, v496, 8);
    v500 = __dirty_unsupported_Iop_Reverse8sIn64_x2(__dirty_unsupported_Iop_SliceV128(v498 ^ v497 ^ v492, v498 ^ v497 ^ v492, 8));
    *a3 = v500;
    return a1 >> 3;
}
