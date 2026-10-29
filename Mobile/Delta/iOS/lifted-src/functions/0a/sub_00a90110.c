/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa90110..0xa90ba0 (2704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a90110_9 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
    unsigned long long field_78;
} st_a90110_9;

typedef struct st_a90110_8 {
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
} st_a90110_8;

typedef struct st_a90110_7 {
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
} st_a90110_7;

typedef struct st_a90110_6 {
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
} st_a90110_6;

typedef struct st_a90110_4 {
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
} st_a90110_4;

typedef struct st_a90110_0 {
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
} st_a90110_0;

typedef struct st_a90110_5 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    unsigned long long field_28;
} st_a90110_5;

typedef struct st_a90110_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    unsigned long long field_38;
} st_a90110_3;

typedef struct st_a90110_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
} st_a90110_2;

typedef struct st_a90110_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
    unsigned long long field_58;
} st_a90110_1;

typedef struct st_a90110_10 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned long long field_60;
    unsigned long long field_68;
} st_a90110_10;


double sub_a90110(unsigned long long *a0, uint128_t a1, uint128_t *iter, uint128_t *a3, void* a4, st_a90110_0 *a5)
{
    unsigned long long v10;  // x19
    unsigned long long v11;  // x20
    unsigned long v20;  // x10
    __m128i v110;  // q13
    uint128_t v111;  // 4121
    uint128_t v112;  // 4123
    uint128_t v113;  // 4127
    uint128_t v114;  // 4129
    uint128_t v115;  // 4133
    uint128_t v116;  // 4135
    uint128_t v117;  // 4139
    uint128_t v118;  // 4141
    uint128_t v119;  // 4148
    unsigned long v21;  // x13
    uint128_t v120;  // 4150
    uint128_t v121;  // 4154
    uint128_t v122;  // 4156
    uint128_t v123;  // 4160
    uint128_t v124;  // 4162
    uint128_t v125;  // 4169
    uint128_t v126;  // 4171
    uint128_t v127;  // 4175
    uint128_t v128;  // 4177
    uint128_t v129;  // 4181
    unsigned long v22;  // x14
    uint128_t v130;  // 4183
    uint128_t v131;  // 4187
    uint128_t v132;  // 4189
    uint128_t v133;  // 4193
    uint128_t v134;  // 4195
    uint128_t v135;  // 4199
    uint128_t v136;  // 4201
    uint128_t v137;  // 4205
    uint128_t v138;  // 4207
    uint128_t v139;  // 4211
    uint128_t v23;  // q18
    uint128_t v140;  // 4213
    uint128_t v141;  // 4217
    uint128_t v142;  // 4219
    uint128_t v143;  // 4223
    uint128_t v144;  // 4225
    uint128_t v145;  // 4233
    uint128_t v146;  // 4235
    __m128i v147;  // q16
    __m128i v148;  // q17
    uint128_t v149;  // 4251
    st_a90110_4 *v24;  // x8
    uint128_t v150;  // q2
    unsigned long long *v151;  // x5
    uint128_t v152;  // 4263
    uint128_t v153;  // q1
    uint128_t v154;  // 4272
    uint128_t v155;  // q0
    unsigned long v156;  // x12
    uint128_t v157;  // 4279
    uint128_t v158;  // q3
    unsigned long long *v159;  // x0
    uint128_t v25;  // q19
    unsigned long v160;  // x22
    unsigned long v161;  // x24
    unsigned long long *i;  // x0
    uint128_t v163;  // q4
    unsigned long v164;  // x21
    uint128_t v165;  // q5
    unsigned long v166;  // x23
    unsigned long v167;  // x12
    uint128_t v168;  // q4
    uint128_t v169;  // q0
    st_a90110_6 *v26;  // x8
    unsigned long v170;  // x12
    uint128_t *v171;  // x2
    uint128_t v172;  // q6
    uint128_t v173;  // q5
    uint128_t *v174;  // x2
    uint128_t v175;  // q7
    uint128_t v176;  // q1
    unsigned long v177;  // x12
    uint128_t v178;  // q6
    uint128_t v179;  // q2
    uint128_t v27;  // q20
    unsigned long long v180;  // x9
    uint128_t *v181;  // x2
    uint128_t v182;  // q7
    uint128_t v183;  // 4099
    uint128_t v184;  // 4101
    uint128_t v185;  // q5
    uint128_t v186;  // 4106
    uint128_t v187;  // 4108
    st_a90110_7 *v28;  // x8
    uint128_t v190;  // 4120
    uint128_t v191;  // 4122
    uint128_t v192;  // q3
    uint128_t v193;  // 4123
    uint128_t v194;  // q7
    uint128_t v195;  // 4132
    uint128_t v196;  // 4134
    uint128_t v197;  // 4139
    uint128_t v198;  // q4
    uint128_t v199;  // 4147
    unsigned long long v29;  // x12
    uint128_t v200;  // 4149
    uint128_t v201;  // 4153
    uint128_t v202;  // 4155
    uint128_t v203;  // q6
    uint128_t v204;  // 4160
    uint128_t v205;  // 4162
    uint128_t v206;  // 4167
    uint128_t v207;  // 4172
    uint128_t v208;  // 4174
    uint128_t v209;  // 4178
    unsigned long long v12;  // d8
    uint128_t v30;  // q21
    uint128_t v210;  // 4180
    uint128_t v212;  // 4196
    uint128_t v213;  // 4198
    uint128_t v214;  // 4206
    uint128_t v215;  // 4208
    uint128_t v216;  // 4210
    uint128_t v217;  // 4215
    uint128_t v218;  // 4217
    uint128_t v219;  // 4221
    st_a90110_8 *v31;  // x8
    uint128_t v220;  // 4223
    uint128_t v221;  // 4232
    uint128_t v222;  // 4234
    uint128_t v223;  // q31
    uint128_t v224;  // 4239
    uint128_t v225;  // 4243
    uint128_t v226;  // 4245
    uint128_t v228;  // 4253
    uint128_t v229;  // 4255
    unsigned long long v32;  // x11
    uint128_t v230;  // 4256
    uint128_t v232;  // 4264
    uint128_t v233;  // 4266
    unsigned long v234;  // x12
    uint128_t v235;  // 4273
    uint128_t v236;  // 4275
    uint128_t v237;  // 4280
    uint128_t v238;  // 4285
    uint128_t v239;  // 4291
    uint128_t v33;  // q22
    uint128_t v240;  // 4299
    uint128_t v241;  // 4307
    uint128_t v242;  // 4309
    unsigned long v243;  // d30
    uint128_t v244;  // 4317
    uint128_t v245;  // 4319
    uint128_t v246;  // 4327
    uint128_t v247;  // 4329
    uint128_t v248;  // 4337
    uint128_t v249;  // 4339
    st_a90110_9 *v34;  // x8
    uint128_t v250;  // 4346
    uint128_t v251;  // 4348
    uint128_t v252;  // 4349
    uint128_t v253;  // 4361
    uint128_t v254;  // 4363
    uint128_t v255;  // 4099
    uint128_t v256;  // 4101
    unsigned long v257;  // d8
    uint128_t v258;  // 4105
    uint128_t v259;  // 4107
    unsigned long v35;  // x12
    uint128_t v260;  // q9
    uint128_t v261;  // 4115
    uint128_t v262;  // 4117
    uint128_t v263;  // 4121
    uint128_t v264;  // 4123
    uint128_t v265;  // 4131
    uint128_t v266;  // 4133
    uint128_t v267;  // q5
    uint128_t v268;  // 4137
    uint128_t v269;  // 4139
    unsigned long v36;  // x12
    uint128_t v270;  // q11
    uint128_t v271;  // 4144
    uint128_t v272;  // 4153
    uint128_t v273;  // 4155
    uint128_t v274;  // q4
    uint128_t v275;  // 4159
    uint128_t v276;  // 4161
    unsigned long v277;  // x12
    uint128_t v278;  // 4176
    uint128_t v279;  // 4178
    uint128_t v37;  // q1
    uint128_t v280;  // q7
    uint128_t v281;  // 4179
    uint128_t v283;  // 4186
    uint128_t v284;  // 4188
    uint128_t v285;  // 4192
    uint128_t v286;  // 4194
    uint128_t v287;  // 4202
    uint128_t v288;  // 4204
    uint128_t v289;  // 4208
    unsigned long v38;  // x12
    uint128_t v290;  // 4210
    uint128_t v291;  // 4214
    uint128_t v292;  // 4216
    uint128_t v293;  // 4220
    uint128_t v294;  // 4222
    uint128_t v295;  // 4230
    uint128_t v296;  // 4232
    uint128_t v297;  // 4236
    uint128_t v298;  // 4238
    uint128_t v299;  // 4242
    uint128_t v39;  // q2
    uint128_t v300;  // 4246
    uint128_t v301;  // 4248
    uint128_t v302;  // q10
    uint128_t v303;  // 4256
    uint128_t v304;  // 4258
    uint128_t v305;  // 4266
    uint128_t v306;  // 4274
    uint128_t v307;  // q6
    uint128_t *v308;  // x2
    uint128_t v309;  // 4282
    unsigned long long v13;  // d9
    uint128_t v40;  // q23
    uint128_t v310;  // 4284
    unsigned long v311;  // x12
    uint128_t v312;  // 4299
    uint128_t v313;  // q10
    uint128_t *v314;  // x2
    uint128_t v315;  // 4328
    uint128_t *v316;  // x2
    uint128_t v317;  // 4099
    uint128_t v318;  // 4101
    st_a90110_10 *v41;  // x8
    uint128_t v321;  // 4112
    uint128_t v322;  // 4114
    uint128_t v323;  // q5
    uint128_t v324;  // 4119
    uint128_t v325;  // 4121
    uint128_t v326;  // q3
    uint128_t v327;  // q4
    uint128_t v328;  // 4130
    uint128_t v329;  // 4132
    uint128_t v42;  // q3
    uint128_t v330;  // q6
    uint128_t v331;  // 4134
    uint128_t v332;  // 4135
    uint128_t v333;  // 4137
    uint128_t v334;  // q7
    uint128_t v335;  // 4139
    uint128_t v337;  // 4153
    uint128_t v338;  // 4155
    uint128_t v339;  // 4160
    uint128_t v43;  // q24
    uint128_t v341;  // q31
    uint128_t v342;  // 4172
    uint128_t v343;  // 4174
    uint128_t v344;  // 4178
    uint128_t v345;  // 4180
    uint128_t v346;  // 4188
    uint128_t v347;  // 4190
    uint128_t v348;  // 4194
    uint128_t v349;  // 4196
    st_a90110_1 *v44;  // x8
    uint128_t v350;  // 4198
    uint128_t v352;  // 4202
    uint128_t v353;  // 4204
    uint128_t v354;  // 4205
    uint128_t v356;  // 4213
    uint128_t v357;  // 4215
    uint128_t v358;  // 4216
    uint128_t v359;  // 4217
    uint128_t v45;  // q25
    uint128_t v360;  // 4218
    uint128_t v361;  // q9
    uint128_t v362;  // 4223
    uint128_t v363;  // 4227
    uint128_t v364;  // 4229
    uint128_t v365;  // 4237
    uint128_t v366;  // 4239
    uint128_t v367;  // 4243
    uint128_t v368;  // 4245
    uint128_t v369;  // 4253
    st_a90110_2 *v46;  // x8
    uint128_t v370;  // 4255
    uint128_t v371;  // 4259
    uint128_t v372;  // 4261
    uint128_t v373;  // 4269
    uint128_t v374;  // 4271
    uint128_t v375;  // 4272
    uint128_t v376;  // 4276
    uint128_t v377;  // 4278
    uint128_t v378;  // 4282
    uint128_t v379;  // 4284
    uint128_t v47;  // 4231
    uint128_t v380;  // 4288
    uint128_t v381;  // 4290
    uint128_t v382;  // 4298
    uint128_t v383;  // 4300
    uint128_t v384;  // 4304
    uint128_t v385;  // 4306
    uint128_t v386;  // 4310
    uint128_t v387;  // 4312
    uint128_t v388;  // q11
    uint128_t v389;  // 4320
    uint128_t v48;  // 4233
    uint128_t v390;  // 4322
    uint128_t v391;  // 4326
    uint128_t v392;  // 4328
    uint128_t v393;  // 4336
    uint128_t v394;  // 4338
    uint128_t v395;  // 4342
    uint128_t v396;  // 4344
    unsigned long v397;  // d8
    uint128_t v398;  // 4348
    uint128_t v399;  // 4350
    uint128_t v49;  // q11
    uint128_t v400;  // 4099
    uint128_t v401;  // 4101
    uint128_t v402;  // 4109
    uint128_t v403;  // 4111
    uint128_t v404;  // 4112
    uint128_t v405;  // 4116
    uint128_t v406;  // 4118
    uint128_t v408;  // 4125
    uint128_t v409;  // 4127
    unsigned long long v14;  // d10
    uint128_t v50;  // q11
    uint128_t v410;  // 4131
    uint128_t v411;  // 4133
    uint128_t v412;  // 4141
    uint128_t v413;  // 4143
    uint128_t v414;  // 4147
    uint128_t v415;  // 4149
    uint128_t v416;  // 4153
    uint128_t v417;  // 4155
    uint128_t v418;  // 4159
    uint128_t v419;  // 4161
    uint128_t v51;  // 4244
    uint128_t v420;  // q10
    uint128_t v421;  // 4169
    uint128_t v422;  // 4171
    uint128_t v423;  // 4175
    uint128_t v424;  // 4177
    uint128_t v425;  // 4181
    uint128_t v426;  // 4183
    uint128_t v427;  // 4184
    uint128_t v429;  // 4191
    uint128_t v52;  // 4246
    uint128_t v430;  // 4193
    uint128_t v431;  // 4197
    uint128_t v432;  // 4199
    uint128_t v433;  // 4203
    uint128_t v434;  // 4205
    uint128_t v435;  // 4209
    uint128_t v436;  // 4211
    unsigned long long *v437;  // x0
    long long v438;  // x5
    unsigned long long *v439;  // x0
    uint128_t v53;  // q26
    uint128_t v440;  // q4
    uint128_t v441;  // q5
    uint128_t v442;  // q8
    uint128_t v443;  // q10
    uint128_t v444;  // q9
    uint128_t v445;  // q11
    unsigned long long *v446;  // x0
    uint128_t v448;  // q4
    uint128_t v449;  // q5
    st_a90110_3 *v54;  // x8
    uint128_t v450;  // 4118
    uint128_t v452;  // 4124
    uint128_t v453;  // 4125
    unsigned long long *v455;  // x0
    uint128_t v456;  // q4
    uint128_t v457;  // 4113
    uint128_t v458;  // 4115
    uint128_t v459;  // q5
    uint128_t v55;  // 4254
    uint128_t v461;  // 4132
    uint128_t v463;  // q4
    uint128_t v464;  // q22
    uint128_t v465;  // 4122
    uint128_t v466;  // q5
    uint128_t v468;  // 4127
    uint128_t v469;  // 4128
    uint128_t v56;  // 4256
    uint128_t v470;  // q18
    unsigned long long v471;  // x1
    uint128_t v472;  // x14
    unsigned long v473;  // cc_dep1
    uint128_t v474;  // x6
    unsigned long long v475;  // 4104
    unsigned long long v476;  // 4104
    uint128_t v477;  // x7
    uint128_t v478;  // q0
    uint128_t v479;  // q5
    __m128i v57;  // q15
    uint128_t v481;  // q4
    uint128_t v482;  // 4103
    uint128_t v483;  // 4104
    uint128_t v485;  // q11
    uint128_t v486;  // q9
    uint128_t v487;  // 4117
    unsigned long v488;  // d8
    uint128_t v489;  // 4134
    uint128_t v58;  // 4264
    uint128_t v491;  // q10
    uint128_t v492;  // 4146
    uint128_t v493;  // q10
    uint128_t v495;  // q11
    unsigned long v496;  // d0
    uint128_t v59;  // 4266
    unsigned long long v15;  // d11
    uint128_t v60;  // q27
    st_a90110_5 *v61;  // x8
    uint128_t v62;  // 4274
    uint128_t v63;  // 4276
    uint128_t v64;  // q28
    uint128_t v65;  // 4284
    uint128_t v66;  // 4286
    __m128i v67;  // q12
    uint128_t v68;  // 4294
    uint128_t v69;  // 4296
    unsigned long long v16;  // d12
    uint128_t v70;  // q29
    uint128_t v71;  // 4304
    uint128_t v72;  // 4306
    __m128i v73;  // q14
    uint128_t v74;  // 4314
    uint128_t v75;  // 4316
    uint128_t v76;  // 4320
    uint128_t v77;  // 4322
    uint128_t v78;  // 4326
    uint128_t v79;  // 4328
    unsigned long long v17;  // d13
    uint128_t v80;  // 4332
    uint128_t v81;  // 4334
    uint128_t v82;  // 4341
    uint128_t v83;  // 4343
    uint128_t v84;  // 4347
    uint128_t v85;  // 4349
    uint128_t v86;  // 4356
    uint128_t v87;  // 4358
    uint128_t v88;  // 4362
    uint128_t v89;  // 4364
    unsigned long long v18;  // d14
    uint128_t v90;  // 4368
    uint128_t v91;  // 4370
    uint128_t v92;  // 4374
    uint128_t v93;  // 4376
    uint128_t v94;  // 4380
    uint128_t v95;  // 4382
    uint128_t v96;  // 4386
    uint128_t v97;  // 4388
    uint128_t v98;  // 4392
    uint128_t v99;  // 4394
    unsigned long long v19;  // d15
    uint128_t v100;  // 4398
    uint128_t v101;  // 4400
    uint128_t v102;  // 4404
    uint128_t v103;  // 4406
    uint128_t v104;  // 4099
    uint128_t v105;  // 4101
    uint128_t v106;  // 4105
    uint128_t v107;  // 4107
    uint128_t v108;  // 4111
    uint128_t v109;  // 4113
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    unsigned long long v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]

    if (!a1)
        return v496;
    v0 = v10;
    v1 = v11;
    v2 = v12;
    v3 = v13;
    v4 = v14;
    v5 = v15;
    v6 = v16;
    v7 = v17;
    v8 = v18;
    v9 = v19;
    v20 = *(long long *)a4;
    v21 = a5->field_c0;
    v22 = a5->field_c8;
    v23 = a5->field_0;
    v24 = &a5->field_10;
    v25 = v24->field_0;
    v26 = &v24->field_10;
    v27 = v26->field_0;
    v28 = &v26->field_10;
    v29 = (unsigned long long)((long long)a4[8]) >> 32;
    v30 = v28->field_0;
    v31 = &v28->field_10;
    v32 = (long long)a4[8] & 0xffffffff;
    v33 = v31->field_0;
    v34 = &v31->field_10;
    v35 = (unsigned int)((((((v29 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v29 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v29 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v29 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) + 1;
    v36 = (unsigned int)v35 + 1;
    v37 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v32 | ((((((v35 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v35 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v35 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v35 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v38 = (unsigned int)v36 + 1;
    v39 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v32 | ((((((v36 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v36 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v36 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v36 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v40 = v34->field_0;
    v41 = &v34->field_10;
    v42 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v32 | ((((((v38 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v38 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v38 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v38 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v43 = v41->field_0;
    v44 = &v41->field_10;
    v45 = v44->field_0;
    v46 = &v44->field_10;
    v47 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((*(int128_t *)a4 ^ v23) >> 64), (long long)*(int128_t *)a4 ^ (unsigned long long)v23);
    v48 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v47 >> 64), (unsigned long long)v47);
    v49 = __dirty_unsupported_Iop_SliceV128(*a3, *a3, 8);
    v50 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v49);
    v51 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v42 ^ v23) >> 64), (unsigned long long)v42 ^ (unsigned long long)v23);
    v52 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v51 >> 64), (unsigned long long)v51);
    v53 = v46->field_0;
    v54 = &v46->field_10;
    v55 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v37 ^ v23) >> 64), (unsigned long long)v37 ^ (unsigned long long)v23);
    v56 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v55 >> 64), (unsigned long long)v55);
    v57 = __dirty_unsupported_Iop_SliceV128(a3[7], a3[7], 8);
    v58 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v39 ^ v23) >> 64), (unsigned long long)v39 ^ (unsigned long long)v23);
    v59 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v58 >> 64), (unsigned long long)v58);
    v60 = v54->field_0;
    v61 = &v54->field_10;
    v62 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v48 ^ v25) >> 64), (unsigned long long)v48 ^ (unsigned long long)v25);
    v63 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v62 >> 64), (unsigned long long)v62);
    v64 = v61->field_0;
    v65 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v56 ^ v25) >> 64), (unsigned long long)v56 ^ (unsigned long long)v25);
    v66 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v65 >> 64), (unsigned long long)v65);
    v67 = __dirty_unsupported_Iop_SliceV128(a3[2], a3[2], 8);
    v68 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v59 ^ v25) >> 64), (unsigned long long)v59 ^ (unsigned long long)v25);
    v69 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v68 >> 64), (unsigned long long)v68);
    v70 = v61->field_10;
    v71 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v52 ^ v25) >> 64), (unsigned long long)v52 ^ (unsigned long long)v25);
    v72 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v71 >> 64), (unsigned long long)v71);
    v73 = __dirty_unsupported_Iop_SliceV128(a3[5], a3[5], 8);
    v74 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v63 ^ v27) >> 64), (unsigned long long)v63 ^ (unsigned long long)v27);
    v75 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v74 >> 64), (unsigned long long)v74);
    v76 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v69 ^ v27) >> 64), (unsigned long long)v69 ^ (unsigned long long)v27);
    v77 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v76 >> 64), (unsigned long long)v76);
    v78 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v72 ^ v27) >> 64), (unsigned long long)v72 ^ (unsigned long long)v27);
    v79 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v78 >> 64), (unsigned long long)v78);
    v80 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v75 ^ v30) >> 64), (unsigned long long)v75 ^ (unsigned long long)v30);
    v81 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v80 >> 64), (unsigned long long)v80);
    v82 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v77 ^ v30) >> 64), (unsigned long long)v77 ^ (unsigned long long)v30);
    v83 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v82 >> 64), (unsigned long long)v82);
    v84 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v66 ^ v27) >> 64), (unsigned long long)v66 ^ (unsigned long long)v27);
    v85 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v84 >> 64), (unsigned long long)v84);
    v86 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v81 ^ v33) >> 64), (unsigned long long)v81 ^ (unsigned long long)v33);
    v87 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v86 >> 64), (unsigned long long)v86);
    v88 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v79 ^ v30) >> 64), (unsigned long long)v79 ^ (unsigned long long)v30);
    v89 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v88 >> 64), (unsigned long long)v88);
    v90 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v85 ^ v30) >> 64), (unsigned long long)v85 ^ (unsigned long long)v30);
    v91 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v90 >> 64), (unsigned long long)v90);
    v92 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v87 ^ v40) >> 64), (unsigned long long)v87 ^ (unsigned long long)v40);
    v93 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v92 >> 64), (unsigned long long)v92);
    v94 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v83 ^ v33) >> 64), (unsigned long long)v83 ^ (unsigned long long)v33);
    v95 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v94 >> 64), (unsigned long long)v94);
    v96 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v91 ^ v33) >> 64), (unsigned long long)v91 ^ (unsigned long long)v33);
    v97 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v96 >> 64), (unsigned long long)v96);
    v98 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v93 ^ v43) >> 64), (unsigned long long)v93 ^ (unsigned long long)v43);
    v99 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v98 >> 64), (unsigned long long)v98);
    v100 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v89 ^ v33) >> 64), (unsigned long long)v89 ^ (unsigned long long)v33);
    v101 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v100 >> 64), (unsigned long long)v100);
    v102 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v95 ^ v40) >> 64), (unsigned long long)v95 ^ (unsigned long long)v40);
    v103 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v102 >> 64), (unsigned long long)v102);
    v104 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v97 ^ v40) >> 64), (unsigned long long)v97 ^ (unsigned long long)v40);
    v105 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v104 >> 64), (unsigned long long)v104);
    v106 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v101 ^ v40) >> 64), (unsigned long long)v101 ^ (unsigned long long)v40);
    v107 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v106 >> 64), (unsigned long long)v106);
    v108 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v103 ^ v43) >> 64), (unsigned long long)v103 ^ (unsigned long long)v43);
    v109 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v108 >> 64), (unsigned long long)v108);
    v110 = __dirty_unsupported_Iop_SliceV128(a3[4], a3[4], 8);
    v111 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v105 ^ v43) >> 64), (unsigned long long)v105 ^ (unsigned long long)v43);
    v112 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v111 >> 64), (unsigned long long)v111);
    v113 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v107 ^ v43) >> 64), (unsigned long long)v107 ^ (unsigned long long)v43);
    v114 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v113 >> 64), (unsigned long long)v113);
    v115 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v99 ^ v45) >> 64), (unsigned long long)v99 ^ (unsigned long long)v45);
    v116 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v115 >> 64), (unsigned long long)v115);
    v117 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v112 ^ v45) >> 64), (unsigned long long)v112 ^ (unsigned long long)v45);
    v118 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v117 >> 64), (unsigned long long)v117);
    v119 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v114 ^ v45) >> 64), (unsigned long long)v114 ^ (unsigned long long)v45);
    v120 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v119 >> 64), (unsigned long long)v119);
    v121 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v116 ^ v53) >> 64), (unsigned long long)v116 ^ (unsigned long long)v53);
    v122 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v121 >> 64), (unsigned long long)v121);
    v123 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v109 ^ v45) >> 64), (unsigned long long)v109 ^ (unsigned long long)v45);
    v124 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v123 >> 64), (unsigned long long)v123);
    v125 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v118 ^ v53) >> 64), (unsigned long long)v118 ^ (unsigned long long)v53);
    v126 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v125 >> 64), (unsigned long long)v125);
    v127 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v120 ^ v53) >> 64), (unsigned long long)v120 ^ (unsigned long long)v53);
    v128 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v127 >> 64), (unsigned long long)v127);
    v129 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v124 ^ v53) >> 64), (unsigned long long)v124 ^ (unsigned long long)v53);
    v130 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v129 >> 64), (unsigned long long)v129);
    v131 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v122 ^ v60) >> 64), (unsigned long long)v122 ^ (unsigned long long)v60);
    v132 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v131 >> 64), (unsigned long long)v131);
    v133 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v128 ^ v60) >> 64), (unsigned long long)v128 ^ (unsigned long long)v60);
    v134 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v133 >> 64), (unsigned long long)v133);
    v135 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v130 ^ v60) >> 64), (unsigned long long)v130 ^ (unsigned long long)v60);
    v136 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v135 >> 64), (unsigned long long)v135);
    v137 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v126 ^ v60) >> 64), (unsigned long long)v126 ^ (unsigned long long)v60);
    v138 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v137 >> 64), (unsigned long long)v137);
    v139 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v132 ^ v64) >> 64), (unsigned long long)v132 ^ (unsigned long long)v64);
    v140 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v139 >> 64), (unsigned long long)v139);
    v141 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v136 ^ v64) >> 64), (unsigned long long)v136 ^ (unsigned long long)v64);
    v142 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v141 >> 64), (unsigned long long)v141);
    v143 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v138 ^ v64) >> 64), (unsigned long long)v138 ^ (unsigned long long)v64);
    v144 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v143 >> 64), (unsigned long long)v143);
    v145 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v134 ^ v64) >> 64), (unsigned long long)v134 ^ (unsigned long long)v64);
    v146 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v145 >> 64), (unsigned long long)v145);
    v147 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v67, v67), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpackhi_epi64(v67, v67), _mm_unpackhi_epi64(v110, v110)));
    v148 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v57, v57)), _mm_unpackhi_epi64(_mm_unpackhi_epi64(v73, v73), _mm_unpackhi_epi64(v57, v57)));
    v149 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v142 ^ v70) >> 64), (unsigned long long)v142 ^ (unsigned long long)v70);
    v150 = v149;
    v151 = ((a1 >> 3) - 1 & 0xffffffffffffffc0) + (char *)a0;
    v152 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v144 ^ v70) >> 64), (unsigned long long)v144 ^ (unsigned long long)v70);
    v153 = v152;
    v154 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v140 ^ v70) >> 64), (unsigned long long)v140 ^ (unsigned long long)v70);
    v155 = v154;
    v156 = (unsigned int)v38 + 1;
    v157 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v146 ^ v70) >> 64), (unsigned long long)v146 ^ (unsigned long long)v70);
    v158 = v157;
    v159 = a0;
    if (v151 > v159)
    {
        v160 = a0[5];
        v161 = a0[7];
        i = a0 + 8;
        v163 = _INSERT(__double_as_longlong(__longlong_as_double(*a0 ^ v21)), 8, a0[1] ^ v22);
        v164 = a0[4] ^ v21;
        v165 = _INSERT(__double_as_longlong(__longlong_as_double(a0[2] ^ v21)), 8, a0[3] ^ v22);
        v166 = a0[6] ^ v21;
        v167 = (unsigned int)v156 + 1;
        v168 = v155 ^ v163;
        v169 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v32 | ((((((v156 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v156 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v156 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v156 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        v170 = (unsigned int)v167 + 1;
        *iter = v168;
        v171 = iter + 1;
        v172 = _INSERT(__double_as_longlong(__longlong_as_double(v164)), 8, v160 ^ v22);
        v173 = v153 ^ v165;
        *v171 = v173;
        v174 = v171 + 1;
        v175 = _INSERT(__double_as_longlong(__longlong_as_double(v166)), 8, v161 ^ v22);
        v176 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v32 | ((((((v167 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v167 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v167 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v167 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        v177 = (unsigned int)v170 + 1;
        v178 = v150 ^ v172;
        v179 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v32 | ((((((v170 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v170 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v170 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v170 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        v180 = v32 | ((((((v177 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v177 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v177 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v177 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000;
        *v174 = v178;
        v181 = v174 + 1;
        v182 = v158 ^ v175;
        *v181 = v182;
        iter = v181 + 1;
        v159 = i;
        if (v151 > v159)
        {
            do
            {
                v183 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v179 ^ v23) >> 64), (unsigned long long)v179 ^ (unsigned long long)v23);
                v184 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v183 >> 64), (unsigned long long)v183);
                v185 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v173);
                v186 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v176 ^ v23) >> 64), (unsigned long long)v176 ^ (unsigned long long)v23);
                v187 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v186 >> 64), (unsigned long long)v186);
                v190 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v184 ^ v25) >> 64), (unsigned long long)v184 ^ (unsigned long long)v25);
                v191 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v190 >> 64), (unsigned long long)v190);
                v192 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v180);
                v193 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v185 >> 64), _mm_extract_epi64(v73, 1));
                v194 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v182);
                v195 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v169 ^ v23) >> 64), (unsigned long long)v169 ^ (unsigned long long)v23);
                v196 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v195 >> 64), (unsigned long long)v195);
                v197 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v185, _mm_cvtsi128_si64(v73));
                v198 = __dirty_unsupported_Iop_SliceV128(v50, v50, 8) ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v168);
                v199 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v187 ^ v25) >> 64), (unsigned long long)v187 ^ (unsigned long long)v25);
                v200 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v199 >> 64), (unsigned long long)v199);
                v201 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v196 ^ v25) >> 64), (unsigned long long)v196 ^ (unsigned long long)v25);
                v202 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v201 >> 64), (unsigned long long)v201);
                v203 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v178);
                v204 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v192 ^ v23) >> 64), (unsigned long long)v192 ^ (unsigned long long)v23);
                v205 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v204 >> 64), (unsigned long long)v204);
                v206 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v198, _mm_cvtsi128_si64(v57));
                v207 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v202 ^ v27) >> 64), (unsigned long long)v202 ^ (unsigned long long)v27);
                v208 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v207 >> 64), (unsigned long long)v207);
                v209 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v205 ^ v25) >> 64), (unsigned long long)v205 ^ (unsigned long long)v25);
                v210 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v209 >> 64), (unsigned long long)v209);
                v212 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v208 ^ v30) >> 64), (unsigned long long)v208 ^ (unsigned long long)v30);
                v213 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v212 >> 64), (unsigned long long)v212);
                v214 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v200 ^ v27) >> 64), (unsigned long long)v200 ^ (unsigned long long)v27);
                v215 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v214 >> 64), (unsigned long long)v214);
                v216 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v198 >> 64), _mm_extract_epi64(v57, 1));
                v217 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v191 ^ v27) >> 64), (unsigned long long)v191 ^ (unsigned long long)v27);
                v218 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v217 >> 64), (unsigned long long)v217);
                v219 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v215 ^ v30) >> 64), (unsigned long long)v215 ^ (unsigned long long)v30);
                v220 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v219 >> 64), (unsigned long long)v219);
                v221 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v210 ^ v27) >> 64), (unsigned long long)v210 ^ (unsigned long long)v27);
                v222 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v221 >> 64), (unsigned long long)v221);
                v223 = __dirty_unsupported_Iop_ZeroHI64ofV128(v203 ^ *(unsigned long long *)((void*)&v203 + 8));
                v224 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v203 >> 64), _mm_extract_epi64(v110, 1));
                v225 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v213 ^ v33) >> 64), (unsigned long long)v213 ^ (unsigned long long)v33);
                v226 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v225 >> 64), (unsigned long long)v225);
                v228 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v222 ^ v30) >> 64), (unsigned long long)v222 ^ (unsigned long long)v30);
                v229 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v228 >> 64), (unsigned long long)v228);
                v230 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v194 >> 64), _mm_extract_epi64(v67, 1));
                v232 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v226 ^ v40) >> 64), (unsigned long long)v226 ^ (unsigned long long)v40);
                v233 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v232 >> 64), (unsigned long long)v232);
                v234 = (unsigned int)v177 + 1;
                v235 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v229 ^ v33) >> 64), (unsigned long long)v229 ^ (unsigned long long)v33);
                v236 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v235 >> 64), (unsigned long long)v235);
                v237 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v185 ^ *(unsigned long long *)((void*)&v185 + 8)), _mm_cvtsi128_si64(v148));
                v238 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v223, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v223) >> 64, _mm_extract_epi64(v147, 1));
                v239 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v198 ^ *(unsigned long long *)((void*)&v198 + 8)), _mm_extract_epi64(v148, 1));
                v240 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v203, _mm_cvtsi128_si64(v110));
                v241 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v218 ^ v30) >> 64), (unsigned long long)v218 ^ (unsigned long long)v30);
                v242 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v241 >> 64), (unsigned long long)v241);
                v243 = __dirty_unsupported_Iop_ZeroHI64ofV128(v194 ^ *(unsigned long long *)((void*)&v194 + 8));
                v244 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v220 ^ v33) >> 64), (unsigned long long)v220 ^ (unsigned long long)v33);
                v245 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v244 >> 64), (unsigned long long)v244);
                v246 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v233 ^ v43) >> 64), (unsigned long long)v233 ^ (unsigned long long)v43);
                v247 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v246 >> 64), (unsigned long long)v246);
                v248 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v242 ^ v33) >> 64), (unsigned long long)v242 ^ (unsigned long long)v33);
                v249 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v248 >> 64), (unsigned long long)v248);
                v159 = i + 8;
                v250 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v245 ^ v40) >> 64), (unsigned long long)v245 ^ (unsigned long long)v40);
                v251 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v250 >> 64), (unsigned long long)v250);
                v252 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v194, _mm_cvtsi128_si64(v67));
                v253 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v249 ^ v40) >> 64), (unsigned long long)v249 ^ (unsigned long long)v40);
                v254 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v253 >> 64), (unsigned long long)v253);
                v255 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v251 ^ v43) >> 64), (unsigned long long)v251 ^ (unsigned long long)v43);
                v256 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v255 >> 64), (unsigned long long)v255);
                v257 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
                v258 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v236 ^ v40) >> 64), (unsigned long long)v236 ^ (unsigned long long)v40);
                v259 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v258 >> 64), (unsigned long long)v258);
                v260 = v230 ^ v224 ^ v193 ^ v216;
                v261 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v247 ^ v45) >> 64), (unsigned long long)v247 ^ (unsigned long long)v45);
                v262 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v261 >> 64), (unsigned long long)v261);
                v263 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v256 ^ v45) >> 64), (unsigned long long)v256 ^ (unsigned long long)v45);
                v264 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v263 >> 64), (unsigned long long)v263);
                v265 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v259 ^ v43) >> 64), (unsigned long long)v259 ^ (unsigned long long)v43);
                v266 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v265 >> 64), (unsigned long long)v265);
                v267 = _INSERT(__double_as_longlong(__longlong_as_double(i[2] ^ v21)), 8, i[3] ^ v22);
                v268 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v262 ^ v53) >> 64), (unsigned long long)v262 ^ (unsigned long long)v53);
                v269 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v268 >> 64), (unsigned long long)v268);
                v270 = v252 ^ v240 ^ v197 ^ v206;
                v271 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, v243, _mm_cvtsi128_si64(v147));
                v272 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v254 ^ v43) >> 64), (unsigned long long)v254 ^ (unsigned long long)v43);
                v273 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v272 >> 64), (unsigned long long)v272);
                v274 = _INSERT(__double_as_longlong(__longlong_as_double(*i ^ v21)), 8, i[1] ^ v22);
                v275 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v264 ^ v53) >> 64), (unsigned long long)v264 ^ (unsigned long long)v53);
                v276 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v275 >> 64), (unsigned long long)v275);
                v277 = (unsigned int)v234 + 1;
                v278 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v273 ^ v45) >> 64), (unsigned long long)v273 ^ (unsigned long long)v45);
                v279 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v278 >> 64), (unsigned long long)v278);
                v280 = _INSERT(__double_as_longlong(__longlong_as_double(i[6] ^ v21)), 8, i[7] ^ v22);
                v281 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v260, v257);
                v283 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v266 ^ v45) >> 64), (unsigned long long)v266 ^ (unsigned long long)v45);
                v284 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v283 >> 64), (unsigned long long)v283);
                v285 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v269 ^ v60) >> 64), (unsigned long long)v269 ^ (unsigned long long)v60);
                v286 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v285 >> 64), (unsigned long long)v285);
                v287 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v279 ^ v53) >> 64), (unsigned long long)v279 ^ (unsigned long long)v53);
                v288 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v287 >> 64), (unsigned long long)v287);
                v289 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v284 ^ v53) >> 64), (unsigned long long)v284 ^ (unsigned long long)v53);
                v290 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v289 >> 64), (unsigned long long)v289);
                v291 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v276 ^ v60) >> 64), (unsigned long long)v276 ^ (unsigned long long)v60);
                v292 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v291 >> 64), (unsigned long long)v291);
                v293 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v286 ^ v64) >> 64), (unsigned long long)v286 ^ (unsigned long long)v64);
                v294 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v293 >> 64), (unsigned long long)v293);
                v295 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v290 ^ v60) >> 64), (unsigned long long)v290 ^ (unsigned long long)v60);
                v296 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v295 >> 64), (unsigned long long)v295);
                v297 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v288 ^ v60) >> 64), (unsigned long long)v288 ^ (unsigned long long)v60);
                v298 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v297 >> 64), (unsigned long long)v297);
                v299 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v294 ^ v70) >> 64), (unsigned long long)v294 ^ (unsigned long long)v70);
                v300 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v292 ^ v64) >> 64), (unsigned long long)v292 ^ (unsigned long long)v64);
                v301 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v300 >> 64), (unsigned long long)v300);
                v302 = __dirty_unsupported_Iop_SliceV128(v260, v260, 8) ^ v281 ^ v260 ^ v270 ^ v271 ^ v238 ^ v237 ^ v239;
                v303 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v298 ^ v64) >> 64), (unsigned long long)v298 ^ (unsigned long long)v64);
                v304 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v303 >> 64), (unsigned long long)v303);
                v168 = v299 ^ v274;
                v305 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v301 ^ v70) >> 64), (unsigned long long)v301 ^ (unsigned long long)v70);
                v169 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v32 | ((((((v234 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v234 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v234 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v234 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v306 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v302, v257);
                v307 = _INSERT(__double_as_longlong(__longlong_as_double(i[4] ^ v21)), 8, i[5] ^ v22);
                *iter = v168;
                v308 = iter + 1;
                v309 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v296 ^ v64) >> 64), (unsigned long long)v296 ^ (unsigned long long)v64);
                v310 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v309 >> 64), (unsigned long long)v309);
                v173 = v305 ^ v267;
                v311 = (unsigned int)v277 + 1;
                v312 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v304 ^ v70) >> 64), (unsigned long long)v304 ^ (unsigned long long)v70);
                v176 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v32 | ((((((v277 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v277 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v277 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v277 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v177 = (unsigned int)v311 + 1;
                v313 = __dirty_unsupported_Iop_SliceV128(v302, v302, 8);
                *v308 = v173;
                v314 = v308 + 1;
                v315 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v310 ^ v70) >> 64), (unsigned long long)v310 ^ (unsigned long long)v70);
                v178 = v312 ^ v307;
                *v314 = v178;
                v316 = v314 + 1;
                v179 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v32 | ((((((v311 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v311 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v311 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v311 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v50 = v313 ^ v306 ^ v270;
                v180 = v32 | ((((((v177 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v177 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v177 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v177 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000;
                v182 = v315 ^ v280;
                *v316 = v182;
                iter = v316 + 1;
                i = v159;
            } while (i < v151);
        }
        v317 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v169 ^ v23) >> 64), (unsigned long long)v169 ^ (unsigned long long)v23);
        v318 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v317 >> 64), (unsigned long long)v317);
        v156 = (unsigned int)v177 + 1;
        v321 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v176 ^ v23) >> 64), (unsigned long long)v176 ^ (unsigned long long)v23);
        v322 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v321 >> 64), (unsigned long long)v321);
        v323 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v173);
        v324 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v179 ^ v23) >> 64), (unsigned long long)v179 ^ (unsigned long long)v23);
        v325 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v324 >> 64), (unsigned long long)v324);
        v326 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v180);
        v327 = __dirty_unsupported_Iop_SliceV128(v50, v50, 8) ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v168);
        v328 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v322 ^ v25) >> 64), (unsigned long long)v322 ^ (unsigned long long)v25);
        v329 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v328 >> 64), (unsigned long long)v328);
        v330 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v178);
        v331 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v323 >> 64), _mm_extract_epi64(v73, 1));
        v332 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v327, _mm_cvtsi128_si64(v57));
        v333 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v323, _mm_cvtsi128_si64(v73));
        v334 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v182);
        v335 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v327 >> 64), _mm_extract_epi64(v57, 1));
        v337 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v326 ^ v23) >> 64), (unsigned long long)v326 ^ (unsigned long long)v23);
        v338 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v337 >> 64), (unsigned long long)v337);
        v339 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v330 >> 64), _mm_extract_epi64(v110, 1));
        v341 = __dirty_unsupported_Iop_ZeroHI64ofV128(v330 ^ *(unsigned long long *)((void*)&v330 + 8));
        v342 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v338 ^ v25) >> 64), (unsigned long long)v338 ^ (unsigned long long)v25);
        v343 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v342 >> 64), (unsigned long long)v342);
        v344 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v325 ^ v25) >> 64), (unsigned long long)v325 ^ (unsigned long long)v25);
        v345 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v344 >> 64), (unsigned long long)v344);
        v346 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v318 ^ v25) >> 64), (unsigned long long)v318 ^ (unsigned long long)v25);
        v347 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v346 >> 64), (unsigned long long)v346);
        v348 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v329 ^ v27) >> 64), (unsigned long long)v329 ^ (unsigned long long)v27);
        v349 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v348 >> 64), (unsigned long long)v348);
        v350 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v334 >> 64), _mm_extract_epi64(v67, 1));
        v352 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v347 ^ v27) >> 64), (unsigned long long)v347 ^ (unsigned long long)v27);
        v353 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v352 >> 64), (unsigned long long)v352);
        v354 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v327 ^ *(unsigned long long *)((void*)&v327 + 8)), _mm_extract_epi64(v148, 1));
        v356 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v349 ^ v30) >> 64), (unsigned long long)v349 ^ (unsigned long long)v30);
        v357 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v356 >> 64), (unsigned long long)v356);
        v358 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v341, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v341) >> 64, _mm_extract_epi64(v147, 1));
        v359 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v323 ^ *(unsigned long long *)((void*)&v323 + 8)), _mm_cvtsi128_si64(v148));
        v360 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v334 ^ *(unsigned long long *)((void*)&v334 + 8)), _mm_cvtsi128_si64(v147));
        v361 = v350 ^ v339 ^ v331 ^ v335;
        v362 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v330, _mm_cvtsi128_si64(v110));
        v363 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v353 ^ v30) >> 64), (unsigned long long)v353 ^ (unsigned long long)v30);
        v364 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v363 >> 64), (unsigned long long)v363);
        v365 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v343 ^ v27) >> 64), (unsigned long long)v343 ^ (unsigned long long)v27);
        v366 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v365 >> 64), (unsigned long long)v365);
        v367 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v345 ^ v27) >> 64), (unsigned long long)v345 ^ (unsigned long long)v27);
        v368 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v367 >> 64), (unsigned long long)v367);
        v369 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v364 ^ v33) >> 64), (unsigned long long)v364 ^ (unsigned long long)v33);
        v370 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v369 >> 64), (unsigned long long)v369);
        v371 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v366 ^ v30) >> 64), (unsigned long long)v366 ^ (unsigned long long)v30);
        v372 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v371 >> 64), (unsigned long long)v371);
        v373 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v368 ^ v30) >> 64), (unsigned long long)v368 ^ (unsigned long long)v30);
        v374 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v373 >> 64), (unsigned long long)v373);
        v375 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v334, _mm_cvtsi128_si64(v67));
        v376 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v372 ^ v33) >> 64), (unsigned long long)v372 ^ (unsigned long long)v33);
        v377 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v376 >> 64), (unsigned long long)v376);
        v378 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v374 ^ v33) >> 64), (unsigned long long)v374 ^ (unsigned long long)v33);
        v379 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v378 >> 64), (unsigned long long)v378);
        v380 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v357 ^ v33) >> 64), (unsigned long long)v357 ^ (unsigned long long)v33);
        v381 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v380 >> 64), (unsigned long long)v380);
        v382 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v377 ^ v40) >> 64), (unsigned long long)v377 ^ (unsigned long long)v40);
        v383 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v382 >> 64), (unsigned long long)v382);
        v384 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v379 ^ v40) >> 64), (unsigned long long)v379 ^ (unsigned long long)v40);
        v385 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v384 >> 64), (unsigned long long)v384);
        v386 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v381 ^ v40) >> 64), (unsigned long long)v381 ^ (unsigned long long)v40);
        v387 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v386 >> 64), (unsigned long long)v386);
        v388 = v375 ^ v362 ^ v333 ^ v332;
        v389 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v370 ^ v40) >> 64), (unsigned long long)v370 ^ (unsigned long long)v40);
        v390 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v389 >> 64), (unsigned long long)v389);
        v391 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v383 ^ v43) >> 64), (unsigned long long)v383 ^ (unsigned long long)v43);
        v392 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v391 >> 64), (unsigned long long)v391);
        v393 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v387 ^ v43) >> 64), (unsigned long long)v387 ^ (unsigned long long)v43);
        v394 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v393 >> 64), (unsigned long long)v393);
        v395 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v390 ^ v43) >> 64), (unsigned long long)v390 ^ (unsigned long long)v43);
        v396 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v395 >> 64), (unsigned long long)v395);
        v397 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
        v398 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v392 ^ v45) >> 64), (unsigned long long)v392 ^ (unsigned long long)v45);
        v399 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v398 >> 64), (unsigned long long)v398);
        v400 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v394 ^ v45) >> 64), (unsigned long long)v394 ^ (unsigned long long)v45);
        v401 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v400 >> 64), (unsigned long long)v400);
        v402 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v396 ^ v45) >> 64), (unsigned long long)v396 ^ (unsigned long long)v45);
        v403 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v402 >> 64), (unsigned long long)v402);
        v404 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v361, v397);
        v405 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v385 ^ v43) >> 64), (unsigned long long)v385 ^ (unsigned long long)v43);
        v406 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v405 >> 64), (unsigned long long)v405);
        v408 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v403 ^ v53) >> 64), (unsigned long long)v403 ^ (unsigned long long)v53);
        v409 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v408 >> 64), (unsigned long long)v408);
        v410 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v401 ^ v53) >> 64), (unsigned long long)v401 ^ (unsigned long long)v53);
        v411 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v410 >> 64), (unsigned long long)v410);
        v412 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v406 ^ v45) >> 64), (unsigned long long)v406 ^ (unsigned long long)v45);
        v413 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v412 >> 64), (unsigned long long)v412);
        v414 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v399 ^ v53) >> 64), (unsigned long long)v399 ^ (unsigned long long)v53);
        v415 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v414 >> 64), (unsigned long long)v414);
        v416 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v409 ^ v60) >> 64), (unsigned long long)v409 ^ (unsigned long long)v60);
        v417 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v416 >> 64), (unsigned long long)v416);
        v418 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v413 ^ v53) >> 64), (unsigned long long)v413 ^ (unsigned long long)v53);
        v419 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v418 >> 64), (unsigned long long)v418);
        v420 = __dirty_unsupported_Iop_SliceV128(v361, v361, 8) ^ v404 ^ v388 ^ v361 ^ v360 ^ v358 ^ v359 ^ v354;
        v421 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v415 ^ v60) >> 64), (unsigned long long)v415 ^ (unsigned long long)v60);
        v422 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v421 >> 64), (unsigned long long)v421);
        v423 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v411 ^ v60) >> 64), (unsigned long long)v411 ^ (unsigned long long)v60);
        v424 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v423 >> 64), (unsigned long long)v423);
        v425 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v419 ^ v60) >> 64), (unsigned long long)v419 ^ (unsigned long long)v60);
        v426 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v425 >> 64), (unsigned long long)v425);
        v427 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v420, v397);
        v429 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v422 ^ v64) >> 64), (unsigned long long)v422 ^ (unsigned long long)v64);
        v430 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v429 >> 64), (unsigned long long)v429);
        v431 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v417 ^ v64) >> 64), (unsigned long long)v417 ^ (unsigned long long)v64);
        v432 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v431 >> 64), (unsigned long long)v431);
        v433 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v426 ^ v64) >> 64), (unsigned long long)v426 ^ (unsigned long long)v64);
        v434 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v433 >> 64), (unsigned long long)v433);
        v435 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v424 ^ v64) >> 64), (unsigned long long)v424 ^ (unsigned long long)v64);
        v436 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v435 >> 64), (unsigned long long)v435);
        v155 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v432 ^ v70) >> 64), (unsigned long long)v432 ^ (unsigned long long)v70);
        v158 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v430 ^ v70) >> 64), (unsigned long long)v430 ^ (unsigned long long)v70);
        v150 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v434 ^ v70) >> 64), (unsigned long long)v434 ^ (unsigned long long)v70);
        v153 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v436 ^ v70) >> 64), (unsigned long long)v436 ^ (unsigned long long)v70);
        v50 = __dirty_unsupported_Iop_SliceV128(v420, v420, 8) ^ v427 ^ v388;
    }
    v437 = v159;
    v438 = (char *)a0 + (a1 >> 3) - v437;
    v439 = v437 + 2;
    v440 = _INSERT(__double_as_longlong(__longlong_as_double(*v437 ^ v21)), 8, v437[1] ^ v22);
    v441 = v155 ^ v440;
    v442 = __dirty_unsupported_Iop_SliceV128(v50, v50, 8);
    if (48 >= v438)
    {
        v156 = (unsigned int)v156 - 1;
        v443 = 0;
        v158 = v150;
        v444 = 0;
        v150 = v153;
        v445 = 0;
        if (32 < v438)
            goto LABEL_a90a34;
        v156 = (unsigned int)v156 - 1;
        v158 = v153;
        if (16 < v438)
            goto LABEL_a90a7c;
        v156 = (unsigned int)v156 - 1;
    }
    else
    {
        *iter = v441;
        iter += 1;
        v446 = v439 + 2;
        v448 = v442 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v441);
        v449 = _INSERT(__double_as_longlong(__longlong_as_double(*v439 ^ v21)), 8, v439[1] ^ v22);
        v450 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v448, _mm_cvtsi128_si64(v57));
        v445 = v450;
        v442 = 0;
        v452 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v448 >> 64), _mm_extract_epi64(v57, 1));
        v444 = v452;
        v453 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v448 ^ *(unsigned long long *)((void*)&v448 + 8)), _mm_extract_epi64(v148, 1));
        v443 = v453;
        v441 = v153 ^ v449;
        v439 = v446;
LABEL_a90a34:
        *iter = v441;
        iter += 1;
        v455 = v439 + 2;
        v456 = v442 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v441);
        v457 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v456 >> 64), _mm_extract_epi64(v73, 1));
        v458 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v456, _mm_cvtsi128_si64(v73));
        v459 = _INSERT(__double_as_longlong(__longlong_as_double(*v439 ^ v21)), 8, v439[1] ^ v22);
        v444 ^= v457;
        v445 ^= v458;
        v461 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v456 ^ *(unsigned long long *)((void*)&v456 + 8)), _mm_cvtsi128_si64(v148));
        v442 = 0;
        v441 = v150 ^ v459;
        v443 ^= v461;
        v439 = v455;
LABEL_a90a7c:
        *iter = v441;
        iter += 1;
        v463 = v442 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v441);
        v442 = 0;
        v464 = __dirty_unsupported_Iop_ZeroHI64ofV128(v463 ^ *(unsigned long long *)((void*)&v463 + 8));
        v465 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v463 >> 64), _mm_extract_epi64(v110, 1));
        v466 = _INSERT(__double_as_longlong(__longlong_as_double(*v439 ^ v21)), 8, v439[1] ^ v22);
        v444 ^= v465;
        v468 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v463, _mm_cvtsi128_si64(v110));
        v469 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v464, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v464) >> 64, _mm_extract_epi64(v147, 1));
        v441 = v158 ^ v466;
        v445 ^= v468;
        v443 ^= v469;
    }
    v470 = *iter;
    v471 = -((a1 & 127) - 128) & 127;
    v472 = 0xffffffffffffffff >> ((char)v471 & 63);
    v473 = v471;
    if ((long long)v471 < 64)
    {
        v474 = 0xffffffffffffffff;
        v475 = arm64g_calculate_condition(180, v473, 64, 0);
        if (!(v475 & 1))
            goto LABEL_a90af6;
LABEL_a90af5:
        v477 = v472;
    }
    else
    {
        v474 = v472;
        v476 = arm64g_calculate_condition(180, v473, 64, 0);
        if (v476 & 1)
            goto LABEL_a90af5;
LABEL_a90af6:
        v477 = 0;
    }
    v478 = _INSERT(__double_as_longlong(__longlong_as_double(v474)), 8, v477);
    v479 = v441 & v478;
    v481 = v442 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v479);
    v482 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v481, _mm_cvtsi128_si64(v67));
    v483 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v481 >> 64), _mm_extract_epi64(v67, 1));
    v485 = v482 ^ v445;
    v486 = v483 ^ v444;
    v487 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v481 ^ *(unsigned long long *)((void*)&v481 + 8)), _mm_cvtsi128_si64(v147));
    v488 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
    v489 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v486, v488);
    v491 = __dirty_unsupported_Iop_SliceV128(v486, v486, 8) ^ v489 ^ v486 ^ v485 ^ v487 ^ v443;
    v492 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v491, v488);
    v493 = __dirty_unsupported_Iop_SliceV128(v491, v491, 8);
    *(unsigned int *)&a4[12] = (((((v156 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v156 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v156 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v156 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    *iter = v479 ^ (v479 ^ v470) & ~v478;
    v495 = __dirty_unsupported_Iop_Reverse8sIn64_x2(__dirty_unsupported_Iop_SliceV128(v493 ^ v492 ^ v485, v493 ^ v492 ^ v485, 8));
    *a3 = v495;
    return *(unsigned long long *)&v478;
}
