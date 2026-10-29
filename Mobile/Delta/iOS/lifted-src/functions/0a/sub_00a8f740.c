/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8f740..0xa90110 (2512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a8f740_5 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
    unsigned long long field_78;
} st_a8f740_5;

typedef struct st_a8f740_4 {
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
} st_a8f740_4;

typedef struct st_a8f740_3 {
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
} st_a8f740_3;

typedef struct st_a8f740_0 {
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
} st_a8f740_0;

typedef struct st_a8f740_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    unsigned long long field_28;
} st_a8f740_2;

typedef struct st_a8f740_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    unsigned long long field_38;
} st_a8f740_1;

typedef struct st_a8f740_8 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
} st_a8f740_8;

typedef struct st_a8f740_7 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
    unsigned long long field_58;
} st_a8f740_7;

typedef struct st_a8f740_6 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned long long field_60;
    unsigned long long field_68;
} st_a8f740_6;


uint128_t sub_a8f740(uint128_t *a0, uint128_t a1, unsigned long long *iter, uint128_t *a3, void* a4, st_a8f740_0 *a5)
{
    unsigned long long v14;  // x19
    unsigned long long v15;  // x20
    unsigned long long v24;  // d12
    uint128_t v114;  // 4117
    uint128_t v115;  // 4121
    uint128_t v116;  // 4123
    uint128_t v117;  // 4127
    uint128_t v118;  // 4129
    __m128i v119;  // q15
    uint128_t *v120;  // x5
    uint128_t v121;  // 4147
    uint128_t v122;  // 4149
    uint128_t v123;  // 4153
    unsigned long long v25;  // d13
    uint128_t v124;  // 4155
    uint128_t v125;  // 4159
    uint128_t v126;  // 4161
    __m128i v127;  // q16
    uint128_t v128;  // 4169
    uint128_t v129;  // 4171
    uint128_t v130;  // 4175
    uint128_t v131;  // 4177
    uint128_t v132;  // 4184
    uint128_t v133;  // 4186
    unsigned long long v26;  // d14
    uint128_t v134;  // 4190
    uint128_t v135;  // 4192
    uint128_t v136;  // 4196
    uint128_t v137;  // 4198
    uint128_t v138;  // 4205
    uint128_t v139;  // q2
    uint128_t v140;  // 4209
    uint128_t v141;  // q3
    uint128_t v142;  // 4213
    uint128_t v143;  // q0
    unsigned long long v27;  // d15
    uint128_t v144;  // 4222
    uint128_t v145;  // q1
    __m128i v146;  // q17
    uint128_t *i;  // x0
    uint128_t *v148;  // x0
    uint128_t v149;  // q1
    uint128_t v150;  // q6
    uint128_t *v151;  // x0
    uint128_t v152;  // q0
    uint128_t v153;  // q4
    unsigned long v28;  // x10
    unsigned long v154;  // x12
    uint128_t v155;  // q7
    uint128_t v156;  // q5
    uint128_t v157;  // q0
    unsigned long v158;  // x12
    uint128_t v159;  // q1
    unsigned long v160;  // x12
    unsigned long long v161;  // x9
    uint128_t v162;  // q2
    unsigned long long *v163;  // x2
    unsigned long v29;  // x13
    unsigned long long *v164;  // x2
    uint128_t v165;  // q3
    uint128_t v167;  // 4103
    uint128_t v168;  // 4107
    uint128_t v169;  // 4109
    uint128_t v170;  // q6
    uint128_t v171;  // q2
    uint128_t v172;  // q4
    uint128_t v173;  // 4126
    unsigned long v30;  // x14
    uint128_t v174;  // 4128
    uint128_t v175;  // q7
    uint128_t v176;  // 4130
    uint128_t v177;  // 4135
    uint128_t v179;  // 4143
    uint128_t v180;  // 4145
    uint128_t v181;  // q3
    uint128_t v182;  // 4149
    uint128_t v183;  // 4151
    uint128_t v31;  // q18
    uint128_t v184;  // 4153
    uint128_t v185;  // 4158
    uint128_t v186;  // 4162
    uint128_t v187;  // 4164
    uint128_t v188;  // 4169
    uint128_t v189;  // 4171
    uint128_t v190;  // 4179
    uint128_t v191;  // 4181
    uint128_t v192;  // 4182
    st_a8f740_3 *v32;  // x8
    uint128_t v194;  // 4190
    uint128_t v195;  // 4192
    uint128_t v196;  // 4197
    uint128_t v197;  // 4206
    uint128_t v198;  // 4208
    uint128_t v199;  // 4213
    uint128_t v200;  // 4217
    uint128_t v201;  // 4219
    uint128_t v202;  // q31
    uint128_t v203;  // 4227
    __m128i v33;  // q13
    uint128_t v204;  // 4229
    uint128_t v205;  // 4233
    uint128_t v206;  // 4235
    uint128_t v207;  // 4240
    uint128_t v208;  // 4244
    uint128_t v209;  // 4246
    uint128_t v211;  // 4247
    uint128_t v212;  // 4251
    uint128_t v213;  // 4253
    unsigned long long v16;  // x21
    unsigned long long v34;  // x12
    uint128_t v214;  // 4258
    uint128_t v215;  // 4260
    uint128_t v216;  // 4265
    uint128_t v217;  // 4273
    uint128_t v218;  // 4275
    unsigned long v219;  // d30
    uint128_t v220;  // 4283
    uint128_t v221;  // 4285
    uint128_t v222;  // 4293
    uint128_t v223;  // 4295
    uint128_t v35;  // q19
    uint128_t v224;  // 4299
    uint128_t v225;  // 4301
    uint128_t v226;  // q11
    uint128_t v227;  // 4309
    uint128_t v228;  // 4311
    uint128_t v229;  // 4315
    uint128_t v230;  // 4317
    uint128_t v231;  // 4325
    uint128_t v232;  // 4327
    unsigned long long *v233;  // x2
    st_a8f740_4 *v36;  // x8
    uint128_t v234;  // 4332
    uint128_t v235;  // q9
    uint128_t v236;  // q4
    uint128_t *v237;  // x0
    uint128_t v238;  // 4344
    uint128_t v239;  // 4346
    unsigned long v240;  // x12
    uint128_t v241;  // 4099
    uint128_t v242;  // 4101
    unsigned long v243;  // d8
    unsigned long long v37;  // x11
    uint128_t v244;  // 4105
    uint128_t v245;  // 4107
    uint128_t v246;  // 4115
    uint128_t v247;  // 4117
    unsigned long long *v248;  // x2
    uint128_t v249;  // 4125
    uint128_t v250;  // 4127
    uint128_t v251;  // 4135
    uint128_t v252;  // 4137
    uint128_t v253;  // 4145
    unsigned long v38;  // x12
    uint128_t *v254;  // x0
    uint128_t v255;  // q9
    uint128_t v256;  // 4156
    uint128_t v257;  // 4164
    uint128_t v258;  // 4166
    uint128_t v259;  // 4174
    uint128_t v260;  // 4178
    uint128_t v261;  // 4180
    uint128_t v262;  // q0
    uint128_t v263;  // 4188
    uint128_t v39;  // 4180
    uint128_t v264;  // 4190
    uint128_t *v265;  // x0
    unsigned long v266;  // x12
    uint128_t v267;  // q1
    uint128_t v268;  // 4209
    uint128_t v269;  // 4211
    uint128_t v270;  // 4219
    uint128_t v271;  // 4221
    uint128_t v272;  // q10
    uint128_t v273;  // 4230
    uint128_t v40;  // 4182
    uint128_t v274;  // 4232
    uint128_t v275;  // 4236
    uint128_t v276;  // 4238
    uint128_t v277;  // 4239
    uint128_t v278;  // 4250
    uint128_t v280;  // 4261
    uint128_t v281;  // 4263
    unsigned long v282;  // x12
    uint128_t v283;  // 4286
    uint128_t v41;  // q20
    unsigned long long *v284;  // x2
    uint128_t v286;  // 4103
    uint128_t v287;  // 4105
    uint128_t v288;  // q3
    uint128_t v289;  // 4113
    uint128_t v290;  // 4115
    uint128_t v291;  // q4
    uint128_t v292;  // q6
    uint128_t v293;  // 4124
    st_a8f740_5 *v42;  // x8
    uint128_t v294;  // 4126
    uint128_t v295;  // q2
    uint128_t v297;  // 4138
    uint128_t v298;  // 4143
    uint128_t v299;  // 4145
    uint128_t v300;  // 4150
    uint128_t v301;  // 4152
    uint128_t v302;  // 4157
    uint128_t v303;  // 4162
    unsigned long v43;  // x12
    uint128_t v304;  // 4164
    uint128_t v305;  // q3
    uint128_t v306;  // 4165
    uint128_t v307;  // q31
    uint128_t v308;  // q7
    uint128_t v309;  // 4174
    uint128_t v310;  // 4176
    uint128_t v312;  // 4181
    uint128_t v313;  // 4185
    unsigned long long v17;  // x22
    uint128_t v44;  // q1
    uint128_t v314;  // 4187
    uint128_t v316;  // 4188
    uint128_t v317;  // 4189
    uint128_t v318;  // 4194
    uint128_t v319;  // 4195
    uint128_t v320;  // 4204
    uint128_t v321;  // 4205
    uint128_t v322;  // 4210
    uint128_t v323;  // 4212
    unsigned long v45;  // x12
    uint128_t v324;  // 4217
    uint128_t v325;  // 4225
    uint128_t v326;  // 4227
    uint128_t v328;  // 4239
    uint128_t v329;  // 4241
    uint128_t v330;  // q9
    uint128_t v331;  // 4249
    uint128_t v332;  // 4251
    uint128_t v333;  // 4256
    uint128_t v46;  // 4214
    uint128_t v334;  // q11
    uint128_t v335;  // 4268
    uint128_t v336;  // 4270
    uint128_t v337;  // 4274
    uint128_t v338;  // 4276
    unsigned long v339;  // d8
    uint128_t v340;  // 4280
    uint128_t v341;  // 4282
    uint128_t v342;  // 4286
    uint128_t v343;  // 4288
    uint128_t v47;  // 4216
    uint128_t v344;  // 4296
    uint128_t v345;  // 4298
    uint128_t v346;  // 4302
    uint128_t v347;  // 4304
    uint128_t v348;  // 4312
    uint128_t v349;  // 4314
    uint128_t v350;  // 4318
    uint128_t v351;  // 4320
    uint128_t v352;  // 4324
    uint128_t v353;  // 4326
    uint128_t v48;  // q2
    uint128_t v354;  // 4330
    uint128_t v355;  // 4332
    uint128_t v356;  // 4337
    uint128_t v357;  // 4341
    uint128_t v358;  // 4343
    uint128_t v360;  // 4102
    uint128_t v361;  // 4104
    uint128_t v362;  // 4108
    uint128_t v363;  // 4110
    unsigned long v49;  // x12
    uint128_t v364;  // 4118
    uint128_t v365;  // 4120
    uint128_t v366;  // 4124
    uint128_t v367;  // 4126
    uint128_t v368;  // 4130
    uint128_t v369;  // 4132
    uint128_t v370;  // 4136
    uint128_t v371;  // 4138
    uint128_t v372;  // q10
    uint128_t v373;  // 4146
    uint128_t v50;  // q3
    uint128_t v374;  // 4148
    uint128_t v375;  // 4152
    uint128_t v376;  // 4154
    uint128_t v377;  // 4158
    uint128_t v378;  // 4159
    uint128_t v379;  // 4167
    uint128_t v380;  // 4169
    uint128_t v381;  // q10
    uint128_t v382;  // 4176
    uint128_t v383;  // 4178
    uint128_t v51;  // 4242
    uint128_t v384;  // 4182
    uint128_t v385;  // 4184
    uint128_t v386;  // 4192
    uint128_t v387;  // 4194
    uint128_t v388;  // 4198
    uint128_t v389;  // 4200
    uint128_t v390;  // 4208
    unsigned long long *v391;  // x2
    uint128_t v392;  // 4216
    uint128_t *v393;  // x0
    uint128_t v52;  // 4244
    long long v394;  // x5
    uint128_t v395;  // q5
    uint128_t *node;  // x0
    uint128_t v397;  // q0
    unsigned long long v398;  // x7
    uint128_t v399;  // q8
    unsigned long long v400;  // x6
    uint128_t v401;  // q11
    uint128_t v402;  // q9
    uint128_t v403;  // q10
    uint128_t v53;  // q21
    uint128_t v404;  // q4
    uint128_t v405;  // q4
    uint128_t v406;  // q0
    uint128_t v407;  // 4115
    uint128_t v408;  // 4116
    uint128_t v410;  // 4125
    uint128_t v411;  // q4
    uint128_t v412;  // q4
    uint128_t v413;  // q0
    unsigned long long v18;  // x23
    st_a8f740_6 *v54;  // x8
    uint128_t v414;  // 4114
    uint128_t v415;  // 4115
    uint128_t v417;  // 4120
    uint128_t v418;  // q4
    uint128_t v419;  // q4
    uint128_t v420;  // q0
    uint128_t v421;  // q22
    uint128_t v423;  // 4118
    uint128_t v55;  // 4252
    uint128_t v424;  // 4119
    uint128_t v425;  // 4120
    unsigned long long v426;  // x1
    uint128_t v427;  // x14
    unsigned long v428;  // cc_dep1
    uint128_t v429;  // x10
    unsigned long long v430;  // 4105
    unsigned long long v431;  // 4105
    uint128_t v432;  // x9
    uint128_t v56;  // 4254
    uint128_t v434;  // q4
    uint128_t v435;  // q4
    uint128_t v436;  // 4110
    uint128_t v438;  // q9
    uint128_t v439;  // 4120
    uint128_t v440;  // 4121
    unsigned long long v441;  // x4
    uint128_t v442;  // q11
    unsigned long long v443;  // x5
    uint128_t v57;  // q22
    unsigned long v444;  // d8
    uint128_t v445;  // 4155
    uint128_t v447;  // q10
    uint128_t v448;  // 4184
    uint128_t v449;  // q10
    uint128_t v451;  // q11
    st_a8f740_7 *v58;  // x8
    uint128_t v59;  // 4262
    uint128_t v60;  // 4264
    uint128_t v61;  // q23
    st_a8f740_8 *v62;  // x8
    uint128_t v63;  // 4272
    unsigned long long v19;  // x24
    uint128_t v64;  // 4274
    uint128_t v65;  // q24
    st_a8f740_1 *v66;  // x8
    uint128_t v67;  // 4282
    uint128_t v68;  // 4284
    uint128_t v69;  // 4288
    uint128_t v70;  // 4290
    uint128_t v71;  // 4294
    uint128_t v72;  // 4296
    uint128_t v73;  // 4300
    unsigned long long v20;  // d8
    uint128_t v74;  // 4302
    uint128_t v75;  // q11
    uint128_t v76;  // q11
    uint128_t v77;  // 4313
    uint128_t v78;  // 4315
    uint128_t v79;  // q25
    st_a8f740_2 *v80;  // x8
    uint128_t v81;  // 4323
    uint128_t v82;  // 4325
    uint128_t v83;  // 4329
    unsigned long long v21;  // d9
    uint128_t v84;  // 4331
    uint128_t v85;  // 4335
    uint128_t v86;  // 4337
    uint128_t v87;  // q26
    uint128_t v88;  // 4345
    uint128_t v89;  // 4347
    uint128_t v90;  // 4351
    uint128_t v91;  // 4353
    uint128_t v92;  // 4357
    uint128_t v93;  // 4359
    unsigned long long v22;  // d10
    __m128i v94;  // q14
    uint128_t v95;  // 4367
    uint128_t v96;  // 4369
    uint128_t v97;  // q27
    uint128_t v98;  // 4377
    uint128_t v99;  // 4379
    uint128_t v100;  // 4383
    uint128_t v101;  // 4385
    uint128_t v102;  // 4389
    uint128_t v103;  // 4391
    unsigned long long v23;  // d11
    uint128_t v104;  // 4395
    uint128_t v105;  // 4397
    uint128_t v106;  // 4401
    uint128_t v107;  // 4403
    __m128i v108;  // q12
    uint128_t v109;  // 4103
    uint128_t v110;  // 4105
    uint128_t v111;  // 4109
    uint128_t v112;  // 4111
    uint128_t v113;  // 4115
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
    v29 = a5->field_a0;
    v30 = a5->field_a8;
    v31 = a5->field_0;
    v32 = &a5->field_10;
    v33 = __dirty_unsupported_Iop_SliceV128(a3[4], a3[4], 8);
    v34 = (unsigned long long)((long long)a4[8]) >> 32;
    v35 = v32->field_0;
    v36 = &v32->field_10;
    v37 = (long long)a4[8] & 0xffffffff;
    v38 = (unsigned int)((((((v34 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v34 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v34 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v34 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) + 1;
    v39 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((*(int128_t *)a4 ^ v31) >> 64), (long long)*(int128_t *)a4 ^ (unsigned long long)v31);
    v40 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v39 >> 64), (unsigned long long)v39);
    v41 = v36->field_0;
    v42 = &v36->field_10;
    v43 = (unsigned int)v38 + 1;
    v44 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v37 | ((((((v38 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v38 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v38 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v38 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v45 = (unsigned int)v43 + 1;
    v46 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v40 ^ v35) >> 64), (unsigned long long)v40 ^ (unsigned long long)v35);
    v47 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v46 >> 64), (unsigned long long)v46);
    v48 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v37 | ((((((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v49 = (unsigned int)v45 + 1;
    v50 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v37 | ((((((v45 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v45 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v45 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v45 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v51 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v44 ^ v31) >> 64), (unsigned long long)v44 ^ (unsigned long long)v31);
    v52 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v51 >> 64), (unsigned long long)v51);
    v53 = v42->field_0;
    v54 = &v42->field_10;
    v55 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v47 ^ v41) >> 64), (unsigned long long)v47 ^ (unsigned long long)v41);
    v56 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v55 >> 64), (unsigned long long)v55);
    v57 = v54->field_0;
    v58 = &v54->field_10;
    v59 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v48 ^ v31) >> 64), (unsigned long long)v48 ^ (unsigned long long)v31);
    v60 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v59 >> 64), (unsigned long long)v59);
    v61 = v58->field_0;
    v62 = &v58->field_10;
    v63 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v52 ^ v35) >> 64), (unsigned long long)v52 ^ (unsigned long long)v35);
    v64 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v63 >> 64), (unsigned long long)v63);
    v65 = v62->field_0;
    v66 = &v62->field_10;
    v67 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v50 ^ v31) >> 64), (unsigned long long)v50 ^ (unsigned long long)v31);
    v68 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v67 >> 64), (unsigned long long)v67);
    v69 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v60 ^ v35) >> 64), (unsigned long long)v60 ^ (unsigned long long)v35);
    v70 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v69 >> 64), (unsigned long long)v69);
    v71 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v64 ^ v41) >> 64), (unsigned long long)v64 ^ (unsigned long long)v41);
    v72 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v71 >> 64), (unsigned long long)v71);
    v73 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v68 ^ v35) >> 64), (unsigned long long)v68 ^ (unsigned long long)v35);
    v74 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v73 >> 64), (unsigned long long)v73);
    v75 = __dirty_unsupported_Iop_SliceV128(*a3, *a3, 8);
    v76 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v75);
    v77 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v56 ^ v53) >> 64), (unsigned long long)v56 ^ (unsigned long long)v53);
    v78 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v77 >> 64), (unsigned long long)v77);
    v79 = v66->field_0;
    v80 = &v66->field_10;
    v81 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v72 ^ v53) >> 64), (unsigned long long)v72 ^ (unsigned long long)v53);
    v82 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v81 >> 64), (unsigned long long)v81);
    v83 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v74 ^ v41) >> 64), (unsigned long long)v74 ^ (unsigned long long)v41);
    v84 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v83 >> 64), (unsigned long long)v83);
    v85 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v70 ^ v41) >> 64), (unsigned long long)v70 ^ (unsigned long long)v41);
    v86 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v85 >> 64), (unsigned long long)v85);
    v87 = v80->field_0;
    v88 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v82 ^ v57) >> 64), (unsigned long long)v82 ^ (unsigned long long)v57);
    v89 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v88 >> 64), (unsigned long long)v88);
    v90 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v84 ^ v53) >> 64), (unsigned long long)v84 ^ (unsigned long long)v53);
    v91 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v90 >> 64), (unsigned long long)v90);
    v92 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v86 ^ v53) >> 64), (unsigned long long)v86 ^ (unsigned long long)v53);
    v93 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v92 >> 64), (unsigned long long)v92);
    v94 = __dirty_unsupported_Iop_SliceV128(a3[5], a3[5], 8);
    v95 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v78 ^ v57) >> 64), (unsigned long long)v78 ^ (unsigned long long)v57);
    v96 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v95 >> 64), (unsigned long long)v95);
    v97 = v80->field_10;
    v98 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v89 ^ v61) >> 64), (unsigned long long)v89 ^ (unsigned long long)v61);
    v99 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v98 >> 64), (unsigned long long)v98);
    v100 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v93 ^ v57) >> 64), (unsigned long long)v93 ^ (unsigned long long)v57);
    v101 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v100 >> 64), (unsigned long long)v100);
    v102 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v91 ^ v57) >> 64), (unsigned long long)v91 ^ (unsigned long long)v57);
    v103 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v102 >> 64), (unsigned long long)v102);
    v104 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v96 ^ v61) >> 64), (unsigned long long)v96 ^ (unsigned long long)v61);
    v105 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v104 >> 64), (unsigned long long)v104);
    v106 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v101 ^ v61) >> 64), (unsigned long long)v101 ^ (unsigned long long)v61);
    v107 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v106 >> 64), (unsigned long long)v106);
    v108 = __dirty_unsupported_Iop_SliceV128(a3[2], a3[2], 8);
    v109 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v103 ^ v61) >> 64), (unsigned long long)v103 ^ (unsigned long long)v61);
    v110 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v109 >> 64), (unsigned long long)v109);
    v111 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v105 ^ v65) >> 64), (unsigned long long)v105 ^ (unsigned long long)v65);
    v112 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v111 >> 64), (unsigned long long)v111);
    v113 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v99 ^ v65) >> 64), (unsigned long long)v99 ^ (unsigned long long)v65);
    v114 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v113 >> 64), (unsigned long long)v113);
    v115 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v110 ^ v65) >> 64), (unsigned long long)v110 ^ (unsigned long long)v65);
    v116 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v115 >> 64), (unsigned long long)v115);
    v117 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v107 ^ v65) >> 64), (unsigned long long)v107 ^ (unsigned long long)v65);
    v118 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v117 >> 64), (unsigned long long)v117);
    v119 = __dirty_unsupported_Iop_SliceV128(a3[7], a3[7], 8);
    v120 = ((a1 >> 3) - 1 & 0xffffffffffffffc0) + (char *)a0;
    v121 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v114 ^ v79) >> 64), (unsigned long long)v114 ^ (unsigned long long)v79);
    v122 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v121 >> 64), (unsigned long long)v121);
    v123 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v118 ^ v79) >> 64), (unsigned long long)v118 ^ (unsigned long long)v79);
    v124 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v123 >> 64), (unsigned long long)v123);
    v125 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v112 ^ v79) >> 64), (unsigned long long)v112 ^ (unsigned long long)v79);
    v126 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v125 >> 64), (unsigned long long)v125);
    v127 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpackhi_epi64(v108, v108), _mm_unpackhi_epi64(v33, v33)));
    v128 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v116 ^ v79) >> 64), (unsigned long long)v116 ^ (unsigned long long)v79);
    v129 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v128 >> 64), (unsigned long long)v128);
    v130 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v122 ^ v87) >> 64), (unsigned long long)v122 ^ (unsigned long long)v87);
    v131 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v130 >> 64), (unsigned long long)v130);
    v132 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v124 ^ v87) >> 64), (unsigned long long)v124 ^ (unsigned long long)v87);
    v133 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v132 >> 64), (unsigned long long)v132);
    v134 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v129 ^ v87) >> 64), (unsigned long long)v129 ^ (unsigned long long)v87);
    v135 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v134 >> 64), (unsigned long long)v134);
    v136 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v126 ^ v87) >> 64), (unsigned long long)v126 ^ (unsigned long long)v87);
    v137 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v136 >> 64), (unsigned long long)v136);
    v138 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v133 ^ v97) >> 64), (unsigned long long)v133 ^ (unsigned long long)v97);
    v139 = v138;
    v140 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v135 ^ v97) >> 64), (unsigned long long)v135 ^ (unsigned long long)v97);
    v141 = v140;
    v142 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v137 ^ v97) >> 64), (unsigned long long)v137 ^ (unsigned long long)v97);
    v143 = v142;
    v144 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v131 ^ v97) >> 64), (unsigned long long)v131 ^ (unsigned long long)v97);
    v145 = v144;
    v146 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v94, v94), _mm_unpacklo_epi64(v119, v119)), _mm_unpackhi_epi64(_mm_unpackhi_epi64(v94, v94), _mm_unpackhi_epi64(v119, v119)));
    i = a0;
    if (v120 > i)
    {
        v148 = a0 + 2;
        v149 = v145 ^ a0[1];
        v150 = *v148;
        v151 = v148 + 1;
        v152 = v143 ^ *a0;
        v153 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*a0);
        v154 = (unsigned int)v49 + 1;
        v155 = *v151;
        i = v151 + 1;
        v156 = __dirty_unsupported_Iop_Reverse8sIn64_x2(a0[1]);
        v157 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v37 | ((((((v49 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v49 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v49 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v49 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        v158 = (unsigned int)v154 + 1;
        v159 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v37 | ((((((v154 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v154 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v154 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v154 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        v160 = (unsigned int)v158 + 1;
        v161 = v37 | ((((((v158 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v158 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v158 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v158 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000;
        v162 = v139 ^ v150;
        *iter = *(unsigned long long *)&*(unsigned long long *)(void*)&v152 ^ v29;
        iter[1] = *(unsigned long long *)((void*)&v152 + 8) ^ v30;
        v163 = iter + 2;
        *v163 = *(unsigned long long *)&*(unsigned long long *)(void*)&v149 ^ v29;
        v163[1] = *(unsigned long long *)((void*)&v149 + 8) ^ v30;
        v164 = v163 + 2;
        if (v120 > i)
        {
            do
            {
                v165 = v141 ^ v155;
                v167 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v156 >> 64), _mm_extract_epi64(v94, 1));
                v168 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v159 ^ v31) >> 64), (unsigned long long)v159 ^ (unsigned long long)v31);
                v169 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v168 >> 64), (unsigned long long)v168);
                v170 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v150);
                v171 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v161);
                v172 = __dirty_unsupported_Iop_SliceV128(v76, v76, 8) ^ v153;
                v173 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v169 ^ v35) >> 64), (unsigned long long)v169 ^ (unsigned long long)v35);
                v174 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v173 >> 64), (unsigned long long)v173);
                v175 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v155);
                v176 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v156, _mm_cvtsi128_si64(v94));
                v177 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v172, _mm_cvtsi128_si64(v119));
                v179 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v174 ^ v41) >> 64), (unsigned long long)v174 ^ (unsigned long long)v41);
                v180 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v179 >> 64), (unsigned long long)v179);
                v181 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v37 | ((((((v160 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v160 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v160 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v160 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v182 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v171 ^ v31) >> 64), (unsigned long long)v171 ^ (unsigned long long)v31);
                v183 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v182 >> 64), (unsigned long long)v182);
                v184 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v172 >> 64), _mm_extract_epi64(v119, 1));
                v185 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v175, _mm_cvtsi128_si64(v108));
                v186 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v180 ^ v53) >> 64), (unsigned long long)v180 ^ (unsigned long long)v53);
                v187 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v186 >> 64), (unsigned long long)v186);
                v188 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v181 ^ v31) >> 64), (unsigned long long)v181 ^ (unsigned long long)v31);
                v189 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v188 >> 64), (unsigned long long)v188);
                v190 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v157 ^ v31) >> 64), (unsigned long long)v157 ^ (unsigned long long)v31);
                v191 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v190 >> 64), (unsigned long long)v190);
                v192 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v170, _mm_cvtsi128_si64(v33));
                v194 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v189 ^ v35) >> 64), (unsigned long long)v189 ^ (unsigned long long)v35);
                v195 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v194 >> 64), (unsigned long long)v194);
                v196 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v156 ^ *(unsigned long long *)((void*)&v156 + 8)), _mm_cvtsi128_si64(v146));
                v197 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v191 ^ v35) >> 64), (unsigned long long)v191 ^ (unsigned long long)v35);
                v198 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v197 >> 64), (unsigned long long)v197);
                v199 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v172 ^ *(unsigned long long *)((void*)&v172 + 8)), _mm_extract_epi64(v146, 1));
                v200 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v195 ^ v41) >> 64), (unsigned long long)v195 ^ (unsigned long long)v41);
                v201 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v200 >> 64), (unsigned long long)v200);
                v202 = __dirty_unsupported_Iop_ZeroHI64ofV128(v170 ^ *(unsigned long long *)((void*)&v170 + 8));
                v203 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v198 ^ v41) >> 64), (unsigned long long)v198 ^ (unsigned long long)v41);
                v204 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v203 >> 64), (unsigned long long)v203);
                v205 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v187 ^ v57) >> 64), (unsigned long long)v187 ^ (unsigned long long)v57);
                v206 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v205 >> 64), (unsigned long long)v205);
                v207 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v170 >> 64), _mm_extract_epi64(v33, 1));
                v208 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v204 ^ v53) >> 64), (unsigned long long)v204 ^ (unsigned long long)v53);
                v209 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v208 >> 64), (unsigned long long)v208);
                v211 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v175 >> 64), _mm_extract_epi64(v108, 1));
                v212 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v183 ^ v35) >> 64), (unsigned long long)v183 ^ (unsigned long long)v35);
                v213 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v212 >> 64), (unsigned long long)v212);
                v214 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v209 ^ v57) >> 64), (unsigned long long)v209 ^ (unsigned long long)v57);
                v215 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v214 >> 64), (unsigned long long)v214);
                v216 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v202, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v202) >> 64, _mm_extract_epi64(v127, 1));
                v217 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v213 ^ v41) >> 64), (unsigned long long)v213 ^ (unsigned long long)v41);
                v218 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v217 >> 64), (unsigned long long)v217);
                v219 = __dirty_unsupported_Iop_ZeroHI64ofV128(v175 ^ *(unsigned long long *)((void*)&v175 + 8));
                v220 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v206 ^ v61) >> 64), (unsigned long long)v206 ^ (unsigned long long)v61);
                v221 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v220 >> 64), (unsigned long long)v220);
                v222 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v215 ^ v61) >> 64), (unsigned long long)v215 ^ (unsigned long long)v61);
                v223 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v222 >> 64), (unsigned long long)v222);
                v224 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v218 ^ v53) >> 64), (unsigned long long)v218 ^ (unsigned long long)v53);
                v225 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v224 >> 64), (unsigned long long)v224);
                v226 = v185 ^ v192 ^ v176 ^ v177;
                v227 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v221 ^ v65) >> 64), (unsigned long long)v221 ^ (unsigned long long)v65);
                v228 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v227 >> 64), (unsigned long long)v227);
                v229 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v223 ^ v65) >> 64), (unsigned long long)v223 ^ (unsigned long long)v65);
                v230 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v229 >> 64), (unsigned long long)v229);
                v231 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v225 ^ v57) >> 64), (unsigned long long)v225 ^ (unsigned long long)v57);
                v232 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v231 >> 64), (unsigned long long)v231);
                *v164 = (unsigned long long)v162 ^ v29;
                v164[1] = *(unsigned long long *)((void*)&v162 + 8) ^ v30;
                v233 = v164 + 2;
                v234 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, v219, _mm_cvtsi128_si64(v127));
                v235 = v211 ^ v207 ^ v167 ^ v184;
                v236 = *i;
                v237 = i + 1;
                v238 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v228 ^ v79) >> 64), (unsigned long long)v228 ^ (unsigned long long)v79);
                v239 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v238 >> 64), (unsigned long long)v238);
                v240 = (unsigned int)v160 + 1;
                v241 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v230 ^ v79) >> 64), (unsigned long long)v230 ^ (unsigned long long)v79);
                v242 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v241 >> 64), (unsigned long long)v241);
                v243 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
                v244 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v232 ^ v61) >> 64), (unsigned long long)v232 ^ (unsigned long long)v61);
                v245 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v244 >> 64), (unsigned long long)v244);
                v246 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v239 ^ v87) >> 64), (unsigned long long)v239 ^ (unsigned long long)v87);
                v247 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v246 >> 64), (unsigned long long)v246);
                *v233 = *(unsigned long long *)&*(unsigned long long *)(void*)&v165 ^ v29;
                v233[1] = *(unsigned long long *)((void*)&v165 + 8) ^ v30;
                v248 = v233 + 2;
                v249 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v242 ^ v87) >> 64), (unsigned long long)v242 ^ (unsigned long long)v87);
                v250 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v249 >> 64), (unsigned long long)v249);
                v251 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v201 ^ v53) >> 64), (unsigned long long)v201 ^ (unsigned long long)v53);
                v252 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v251 >> 64), (unsigned long long)v251);
                v253 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v235, v243);
                v254 = v237 + 1;
                v255 = __dirty_unsupported_Iop_SliceV128(v235, v235, 8);
                v256 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v250 ^ v97) >> 64), (unsigned long long)v250 ^ (unsigned long long)v97);
                v257 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v252 ^ v57) >> 64), (unsigned long long)v252 ^ (unsigned long long)v57);
                v258 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v257 >> 64), (unsigned long long)v257);
                v259 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v247 ^ v97) >> 64), (unsigned long long)v247 ^ (unsigned long long)v97);
                v260 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v245 ^ v65) >> 64), (unsigned long long)v245 ^ (unsigned long long)v65);
                v261 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v260 >> 64), (unsigned long long)v260);
                v262 = v256 ^ v236;
                v263 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v258 ^ v61) >> 64), (unsigned long long)v258 ^ (unsigned long long)v61);
                v264 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v263 >> 64), (unsigned long long)v263);
                v150 = *v254;
                v265 = v254 + 1;
                v266 = (unsigned int)v240 + 1;
                v267 = v259 ^ *v237;
                v268 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v261 ^ v79) >> 64), (unsigned long long)v261 ^ (unsigned long long)v79);
                v269 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v268 >> 64), (unsigned long long)v268);
                v155 = *v265;
                i = v265 + 1;
                v270 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v264 ^ v65) >> 64), (unsigned long long)v264 ^ (unsigned long long)v65);
                v271 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v270 >> 64), (unsigned long long)v270);
                v156 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v237);
                v272 = v255 ^ v253 ^ v235 ^ v226 ^ v234 ^ v216 ^ v196 ^ v199;
                v273 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v269 ^ v87) >> 64), (unsigned long long)v269 ^ (unsigned long long)v87);
                v274 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v273 >> 64), (unsigned long long)v273);
                v275 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v271 ^ v79) >> 64), (unsigned long long)v271 ^ (unsigned long long)v79);
                v276 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v275 >> 64), (unsigned long long)v275);
                v277 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v272, v243);
                v157 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v37 | ((((((v240 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v240 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v240 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v240 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v278 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v274 ^ v97) >> 64), (unsigned long long)v274 ^ (unsigned long long)v97);
                v280 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v276 ^ v87) >> 64), (unsigned long long)v276 ^ (unsigned long long)v87);
                v281 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v280 >> 64), (unsigned long long)v280);
                v162 = v278 ^ v150;
                v282 = (unsigned int)v266 + 1;
                v283 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v281 ^ v97) >> 64), (unsigned long long)v281 ^ (unsigned long long)v97);
                v141 = v283;
                v153 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v236);
                v76 = __dirty_unsupported_Iop_SliceV128(v272, v272, 8) ^ v277 ^ v226;
                v159 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v37 | ((((((v266 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v266 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v266 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v266 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v160 = (unsigned int)v282 + 1;
                *v248 = *(unsigned long long *)&*(unsigned long long *)(void*)&v262 ^ v29;
                v248[1] = *(unsigned long long *)((void*)&v262 + 8) ^ v30;
                v284 = v248 + 2;
                *v284 = *(unsigned long long *)&*(unsigned long long *)(void*)&v267 ^ v29;
                v284[1] = *(unsigned long long *)((void*)&v267 + 8) ^ v30;
                v164 = v284 + 2;
                v161 = v37 | ((((((v282 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v282 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v282 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v282 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000;
            } while (i < v120);
        }
        v286 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v157 ^ v31) >> 64), (unsigned long long)v157 ^ (unsigned long long)v31);
        v287 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v286 >> 64), (unsigned long long)v286);
        v288 = v141 ^ v155;
        v289 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v159 ^ v31) >> 64), (unsigned long long)v159 ^ (unsigned long long)v31);
        v290 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v289 >> 64), (unsigned long long)v289);
        v291 = __dirty_unsupported_Iop_SliceV128(v76, v76, 8) ^ v153;
        v292 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v150);
        v293 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v287 ^ v35) >> 64), (unsigned long long)v287 ^ (unsigned long long)v35);
        v294 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v293 >> 64), (unsigned long long)v293);
        v295 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v161);
        v297 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v291, _mm_cvtsi128_si64(v119));
        v298 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v290 ^ v35) >> 64), (unsigned long long)v290 ^ (unsigned long long)v35);
        v299 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v298 >> 64), (unsigned long long)v298);
        v300 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v294 ^ v41) >> 64), (unsigned long long)v294 ^ (unsigned long long)v41);
        v301 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v300 >> 64), (unsigned long long)v300);
        v302 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v156, _mm_cvtsi128_si64(v94));
        v303 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v295 ^ v31) >> 64), (unsigned long long)v295 ^ (unsigned long long)v31);
        v304 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v303 >> 64), (unsigned long long)v303);
        v305 = _INSERT(__double_as_longlong(__longlong_as_double(v28)), 8, v37 | ((((((v160 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v160 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v160 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v160 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        v306 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v156 ^ *(unsigned long long *)((void*)&v156 + 8)), _mm_cvtsi128_si64(v146));
        v307 = __dirty_unsupported_Iop_ZeroHI64ofV128(v292 ^ *(unsigned long long *)((void*)&v292 + 8));
        v308 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v155);
        v309 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v304 ^ v35) >> 64), (unsigned long long)v304 ^ (unsigned long long)v35);
        v310 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v309 >> 64), (unsigned long long)v309);
        v312 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v291 >> 64), _mm_extract_epi64(v119, 1));
        v313 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v305 ^ v31) >> 64), (unsigned long long)v305 ^ (unsigned long long)v31);
        v314 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v313 >> 64), (unsigned long long)v313);
        v316 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v156 >> 64), _mm_extract_epi64(v94, 1));
        v317 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v291 ^ *(unsigned long long *)((void*)&v291 + 8)), _mm_extract_epi64(v146, 1));
        v318 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v308, _mm_cvtsi128_si64(v108));
        v319 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v307, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v307) >> 64, _mm_extract_epi64(v127, 1));
        v320 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v308 >> 64), _mm_extract_epi64(v108, 1));
        v321 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v292 >> 64), _mm_extract_epi64(v33, 1));
        v322 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v299 ^ v41) >> 64), (unsigned long long)v299 ^ (unsigned long long)v41);
        v323 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v322 >> 64), (unsigned long long)v322);
        v324 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v292, _mm_cvtsi128_si64(v33));
        v325 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v314 ^ v35) >> 64), (unsigned long long)v314 ^ (unsigned long long)v35);
        v326 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v325 >> 64), (unsigned long long)v325);
        v328 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v310 ^ v41) >> 64), (unsigned long long)v310 ^ (unsigned long long)v41);
        v329 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v328 >> 64), (unsigned long long)v328);
        v330 = v320 ^ v321 ^ v316 ^ v312;
        v331 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v326 ^ v41) >> 64), (unsigned long long)v326 ^ (unsigned long long)v41);
        v332 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v331 >> 64), (unsigned long long)v331);
        v333 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v308 ^ *(unsigned long long *)((void*)&v308 + 8)), _mm_cvtsi128_si64(v127));
        v334 = v318 ^ v324 ^ v302 ^ v297;
        v335 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v329 ^ v53) >> 64), (unsigned long long)v329 ^ (unsigned long long)v53);
        v336 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v335 >> 64), (unsigned long long)v335);
        v337 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v323 ^ v53) >> 64), (unsigned long long)v323 ^ (unsigned long long)v53);
        v338 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v337 >> 64), (unsigned long long)v337);
        v339 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
        v340 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v301 ^ v53) >> 64), (unsigned long long)v301 ^ (unsigned long long)v53);
        v341 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v340 >> 64), (unsigned long long)v340);
        v342 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v336 ^ v57) >> 64), (unsigned long long)v336 ^ (unsigned long long)v57);
        v343 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v342 >> 64), (unsigned long long)v342);
        v344 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v338 ^ v57) >> 64), (unsigned long long)v338 ^ (unsigned long long)v57);
        v345 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v344 >> 64), (unsigned long long)v344);
        v346 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v332 ^ v53) >> 64), (unsigned long long)v332 ^ (unsigned long long)v53);
        v347 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v346 >> 64), (unsigned long long)v346);
        v348 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v343 ^ v61) >> 64), (unsigned long long)v343 ^ (unsigned long long)v61);
        v349 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v348 >> 64), (unsigned long long)v348);
        v350 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v345 ^ v61) >> 64), (unsigned long long)v345 ^ (unsigned long long)v61);
        v351 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v350 >> 64), (unsigned long long)v350);
        v352 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v347 ^ v57) >> 64), (unsigned long long)v347 ^ (unsigned long long)v57);
        v353 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v352 >> 64), (unsigned long long)v352);
        v354 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v341 ^ v57) >> 64), (unsigned long long)v341 ^ (unsigned long long)v57);
        v355 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v354 >> 64), (unsigned long long)v354);
        v356 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v330, v339);
        v357 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v351 ^ v65) >> 64), (unsigned long long)v351 ^ (unsigned long long)v65);
        v358 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v357 >> 64), (unsigned long long)v357);
        v360 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v353 ^ v61) >> 64), (unsigned long long)v353 ^ (unsigned long long)v61);
        v361 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v360 >> 64), (unsigned long long)v360);
        v362 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v355 ^ v61) >> 64), (unsigned long long)v355 ^ (unsigned long long)v61);
        v363 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v362 >> 64), (unsigned long long)v362);
        v364 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v358 ^ v79) >> 64), (unsigned long long)v358 ^ (unsigned long long)v79);
        v365 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v364 >> 64), (unsigned long long)v364);
        v366 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v349 ^ v65) >> 64), (unsigned long long)v349 ^ (unsigned long long)v65);
        v367 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v366 >> 64), (unsigned long long)v366);
        v368 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v363 ^ v65) >> 64), (unsigned long long)v363 ^ (unsigned long long)v65);
        v369 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v368 >> 64), (unsigned long long)v368);
        v370 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v365 ^ v87) >> 64), (unsigned long long)v365 ^ (unsigned long long)v87);
        v371 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v370 >> 64), (unsigned long long)v370);
        v372 = __dirty_unsupported_Iop_SliceV128(v330, v330, 8) ^ v356 ^ v330 ^ v334 ^ v333 ^ v319 ^ v306 ^ v317;
        v373 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v361 ^ v65) >> 64), (unsigned long long)v361 ^ (unsigned long long)v65);
        v374 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v373 >> 64), (unsigned long long)v373);
        v375 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v369 ^ v79) >> 64), (unsigned long long)v369 ^ (unsigned long long)v79);
        v376 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v375 >> 64), (unsigned long long)v375);
        v377 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v371 ^ v97) >> 64), (unsigned long long)v371 ^ (unsigned long long)v97);
        v145 = v377;
        v378 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v372, v339);
        v379 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v367 ^ v79) >> 64), (unsigned long long)v367 ^ (unsigned long long)v79);
        v380 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v379 >> 64), (unsigned long long)v379);
        v381 = __dirty_unsupported_Iop_SliceV128(v372, v372, 8);
        v382 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v374 ^ v79) >> 64), (unsigned long long)v374 ^ (unsigned long long)v79);
        v383 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v382 >> 64), (unsigned long long)v382);
        v384 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v376 ^ v87) >> 64), (unsigned long long)v376 ^ (unsigned long long)v87);
        v385 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v384 >> 64), (unsigned long long)v384);
        v386 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v380 ^ v87) >> 64), (unsigned long long)v380 ^ (unsigned long long)v87);
        v387 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v386 >> 64), (unsigned long long)v386);
        v388 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v383 ^ v87) >> 64), (unsigned long long)v383 ^ (unsigned long long)v87);
        v389 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v388 >> 64), (unsigned long long)v388);
        v390 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v385 ^ v97) >> 64), (unsigned long long)v385 ^ (unsigned long long)v97);
        v143 = v390;
        *v164 = (unsigned long long)v162 ^ v29;
        v164[1] = *(unsigned long long *)((void*)&v162 + 8) ^ v30;
        v391 = v164 + 2;
        v392 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v387 ^ v97) >> 64), (unsigned long long)v387 ^ (unsigned long long)v97);
        v139 = v392;
        v49 = (unsigned int)v160 + 1;
        *v391 = *(unsigned long long *)&*(unsigned long long *)(void*)&v288 ^ v29;
        v391[1] = *(unsigned long long *)((void*)&v288 + 8) ^ v30;
        iter = v391 + 2;
        v141 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v389 ^ v97) >> 64), (unsigned long long)v389 ^ (unsigned long long)v97);
        v76 = v381 ^ v378 ^ v334;
    }
    v393 = i;
    v394 = (char *)a0 + (a1 >> 3) - v393;
    v395 = *v393;
    node = v393 + 1;
    v397 = v143 ^ v395;
    v398 = *(unsigned long long *)((void*)&v397 + 8) ^ v30;
    v399 = __dirty_unsupported_Iop_SliceV128(v76, v76, 8);
    v400 = *(unsigned long long *)&*(unsigned long long *)(void*)&v397 ^ v29;
    if (48 >= v394)
    {
        v141 = v139;
        v49 = (unsigned int)v49 - 1;
        v401 = 0;
        v402 = 0;
        v139 = v145;
        v403 = 0;
        if (32 < v394)
            goto LABEL_a8ff90;
        v141 = v145;
        v49 = (unsigned int)v49 - 1;
        if (16 < v394)
            goto LABEL_a8ffd8;
        v49 = (unsigned int)v49 - 1;
    }
    else
    {
        v404 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v395);
        v395 = *node;
        node += 1;
        v405 = v399 ^ v404;
        *iter = v400;
        iter[1] = v398;
        iter += 2;
        v406 = v145 ^ v395;
        v407 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v405, _mm_cvtsi128_si64(v119));
        v401 = v407;
        v408 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v405 >> 64), _mm_extract_epi64(v119, 1));
        v402 = v408;
        v399 = 0;
        v398 = *(unsigned long long *)((void*)&v406 + 8) ^ v30;
        v410 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v405 ^ *(unsigned long long *)((void*)&v405 + 8)), _mm_extract_epi64(v146, 1));
        v403 = v410;
        v400 = *(unsigned long long *)&*(unsigned long long *)(void*)&v406 ^ v29;
LABEL_a8ff90:
        v411 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v395);
        v395 = *node;
        node += 1;
        v412 = v399 ^ v411;
        v413 = v139 ^ v395;
        *iter = v400;
        iter[1] = v398;
        iter += 2;
        v414 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v412, _mm_cvtsi128_si64(v94));
        v415 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v412 >> 64), _mm_extract_epi64(v94, 1));
        v399 = 0;
        v417 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v412 ^ *(unsigned long long *)((void*)&v412 + 8)), _mm_cvtsi128_si64(v146));
        v400 = *(unsigned long long *)&*(unsigned long long *)(void*)&v413 ^ v29;
        v401 ^= v414;
        v402 ^= v415;
        v403 ^= v417;
        v398 = *(unsigned long long *)((void*)&v413 + 8) ^ v30;
LABEL_a8ffd8:
        v418 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v395);
        v395 = *node;
        v419 = v399 ^ v418;
        v420 = v141 ^ v395;
        v421 = __dirty_unsupported_Iop_ZeroHI64ofV128(v419 ^ *(unsigned long long *)((void*)&v419 + 8));
        *iter = v400;
        iter[1] = v398;
        iter += 2;
        v423 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v419, _mm_cvtsi128_si64(v33));
        v424 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v419 >> 64), _mm_extract_epi64(v33, 1));
        v425 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v421, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v421) >> 64, _mm_extract_epi64(v127, 1));
        v399 = 0;
        v401 ^= v423;
        v402 ^= v424;
        v398 = *(unsigned long long *)((void*)&v420 + 8) ^ v30;
        v400 = *(unsigned long long *)&*(unsigned long long *)(void*)&v420 ^ v29;
        v403 ^= v425;
    }
    v426 = -((a1 & 127) - 128) & 127;
    v427 = 0xffffffffffffffff >> ((char)v426 & 63);
    v428 = v426;
    if ((long long)v426 < 64)
    {
        v429 = v427;
        v430 = arm64g_calculate_condition(180, v428, 64, 0);
        if (!(v430 & 1))
            goto LABEL_a9004a;
LABEL_a90049:
        v432 = 0xffffffffffffffff;
    }
    else
    {
        v429 = 0;
        v431 = arm64g_calculate_condition(180, v428, 64, 0);
        if (v431 & 1)
            goto LABEL_a90049;
LABEL_a9004a:
        v432 = v427;
    }
    v434 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v395 & _INSERT(__double_as_longlong(__longlong_as_double(v432)), 8, v429));
    v435 = v399 ^ v434;
    v436 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v435 >> 64), _mm_extract_epi64(v108, 1));
    v438 = v436 ^ v402;
    v439 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v435 ^ *(unsigned long long *)((void*)&v435 + 8)), _mm_cvtsi128_si64(v127));
    v440 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v435, _mm_cvtsi128_si64(v108));
    v441 = *iter & ~v432;
    v442 = v440 ^ v401;
    v443 = iter[1] & ~v429;
    v444 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
    v445 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v438, v444);
    *(unsigned int *)&a4[12] = (((((v49 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v49 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v49 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v49 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    *iter = v400 & v432 | v441;
    iter[1] = v398 & v429 | v443;
    v447 = __dirty_unsupported_Iop_SliceV128(v438, v438, 8) ^ v445 ^ v438 ^ v442 ^ v439 ^ v403;
    v448 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v447, v444);
    v449 = __dirty_unsupported_Iop_SliceV128(v447, v447, 8);
    v451 = __dirty_unsupported_Iop_Reverse8sIn64_x2(__dirty_unsupported_Iop_SliceV128(v449 ^ v448 ^ v442, v449 ^ v448 ^ v442, 8));
    *a3 = v451;
    return a1 >> 3;
}
