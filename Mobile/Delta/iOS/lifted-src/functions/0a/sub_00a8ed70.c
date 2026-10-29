/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8ed70..0xa8f740 (2512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a8ed70_5 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
    unsigned long long field_78;
} st_a8ed70_5;

typedef struct st_a8ed70_4 {
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
} st_a8ed70_4;

typedef struct st_a8ed70_3 {
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
} st_a8ed70_3;

typedef struct st_a8ed70_0 {
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
} st_a8ed70_0;

typedef struct st_a8ed70_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    unsigned long long field_28;
} st_a8ed70_2;

typedef struct st_a8ed70_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    unsigned long long field_38;
} st_a8ed70_1;

typedef struct st_a8ed70_8 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
} st_a8ed70_8;

typedef struct st_a8ed70_7 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
    unsigned long long field_58;
} st_a8ed70_7;

typedef struct st_a8ed70_6 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned long long field_60;
    unsigned long long field_68;
} st_a8ed70_6;


double sub_a8ed70(unsigned long long *a0, uint128_t a1, uint128_t *iter, uint128_t *a3, void* a4, st_a8ed70_0 *a5)
{
    unsigned long long v10;  // x19
    unsigned long long v11;  // x20
    unsigned long v20;  // x10
    uint128_t v110;  // 4150
    uint128_t v111;  // 4152
    uint128_t v112;  // 4156
    uint128_t v113;  // 4158
    uint128_t v114;  // 4162
    uint128_t v115;  // 4164
    uint128_t v116;  // 4168
    uint128_t v117;  // 4170
    uint128_t v118;  // 4174
    uint128_t v119;  // 4176
    unsigned long v21;  // x13
    uint128_t v120;  // 4180
    uint128_t v121;  // 4182
    uint128_t v122;  // 4186
    uint128_t v123;  // 4188
    uint128_t v124;  // 4192
    uint128_t v125;  // 4194
    uint128_t v126;  // 4198
    uint128_t v127;  // 4200
    uint128_t v128;  // 4204
    uint128_t v129;  // 4206
    unsigned long v22;  // x14
    uint128_t v130;  // 4210
    uint128_t v131;  // q2
    uint128_t v132;  // 4214
    uint128_t v133;  // q0
    __m128i v134;  // q16
    uint128_t v135;  // 4222
    uint128_t v136;  // q1
    uint128_t v137;  // 4226
    uint128_t v138;  // q3
    unsigned long long v139;  // 4316
    uint128_t v23;  // q11
    unsigned long long *v140;  // x0
    unsigned long v141;  // x24
    uint128_t v142;  // q4
    unsigned long v143;  // x23
    uint128_t v144;  // q5
    uint128_t v145;  // q6
    uint128_t v146;  // q4
    unsigned long v147;  // x12
    uint128_t v148;  // q0
    uint128_t v149;  // q5
    uint128_t v24;  // q11
    unsigned long v150;  // x12
    unsigned long long *i;  // x0
    uint128_t v152;  // q1
    uint128_t *v153;  // x2
    uint128_t v154;  // q7
    unsigned long v155;  // x12
    uint128_t v156;  // q6
    uint128_t *v157;  // x2
    uint128_t v158;  // q2
    uint128_t *v159;  // x2
    uint128_t v25;  // q18
    unsigned long long v160;  // x9
    uint128_t v161;  // q7
    uint128_t v163;  // q6
    uint128_t v164;  // 4105
    uint128_t v165;  // 4107
    uint128_t v167;  // q5
    uint128_t v168;  // 4115
    uint128_t v169;  // 4117
    st_a8ed70_3 *v26;  // x8
    unsigned long v170;  // x12
    uint128_t v171;  // q3
    uint128_t v172;  // 4124
    uint128_t v173;  // 4126
    uint128_t v174;  // 4131
    uint128_t v175;  // 4133
    uint128_t v176;  // 4138
    uint128_t v177;  // 4140
    uint128_t v178;  // q4
    uint128_t v179;  // 4148
    unsigned long long v27;  // x12
    uint128_t v180;  // 4150
    uint128_t v181;  // 4155
    uint128_t v182;  // q31
    uint128_t v183;  // 4167
    uint128_t v184;  // 4169
    uint128_t v186;  // 4186
    unsigned long v187;  // x12
    uint128_t v188;  // 4194
    uint128_t v189;  // 4196
    __m128i v28;  // q15
    uint128_t v190;  // 4197
    uint128_t v192;  // 4205
    uint128_t v193;  // 4207
    uint128_t v194;  // 4211
    uint128_t v195;  // 4213
    uint128_t v196;  // 4218
    uint128_t v197;  // 4219
    uint128_t v198;  // q7
    uint128_t v199;  // 4221
    unsigned long v29;  // x12
    uint128_t v200;  // 4222
    uint128_t v202;  // 4223
    uint128_t v203;  // 4236
    uint128_t v204;  // 4238
    uint128_t v205;  // 4246
    uint128_t v206;  // 4248
    uint128_t v207;  // 4256
    uint128_t v208;  // 4258
    unsigned long long v12;  // d8
    unsigned long long v30;  // x11
    uint128_t v210;  // 4263
    uint128_t v211;  // 4267
    uint128_t v212;  // 4269
    uint128_t v213;  // 4274
    uint128_t v214;  // 4275
    uint128_t v215;  // 4276
    uint128_t v216;  // 4284
    uint128_t v217;  // 4286
    uint128_t v218;  // 4290
    uint128_t v219;  // 4292
    uint128_t v31;  // q19
    unsigned long v220;  // d8
    uint128_t v221;  // 4296
    uint128_t v222;  // 4298
    uint128_t v223;  // q9
    uint128_t v224;  // 4306
    uint128_t v225;  // 4308
    uint128_t v226;  // 4316
    uint128_t v227;  // 4318
    uint128_t v228;  // 4326
    uint128_t v229;  // 4328
    st_a8ed70_4 *v32;  // x8
    uint128_t v230;  // 4333
    uint128_t v231;  // q11
    uint128_t v232;  // 4341
    uint128_t v233;  // 4343
    uint128_t v234;  // 4351
    uint128_t v235;  // 4353
    uint128_t v236;  // 4361
    uint128_t v237;  // 4097
    uint128_t v238;  // 4105
    uint128_t v239;  // 4107
    unsigned long v33;  // x12
    uint128_t v240;  // 4115
    uint128_t v241;  // 4117
    uint128_t v242;  // q4
    uint128_t v243;  // q9
    uint128_t v244;  // 4127
    uint128_t v245;  // 4129
    uint128_t v246;  // 4133
    uint128_t v247;  // 4135
    uint128_t v248;  // 4143
    uint128_t v249;  // 4145
    uint128_t v34;  // q1
    uint128_t v250;  // 4153
    uint128_t v251;  // 4155
    uint128_t v252;  // q5
    uint128_t v253;  // 4159
    uint128_t v254;  // 4161
    uint128_t v255;  // q7
    uint128_t v256;  // 4165
    uint128_t v257;  // 4167
    uint128_t v258;  // 4176
    uint128_t v259;  // 4178
    unsigned long v35;  // x12
    uint128_t v260;  // 4186
    uint128_t v261;  // 4198
    uint128_t v262;  // 4200
    uint128_t v263;  // 4204
    uint128_t v264;  // q6
    uint128_t v265;  // 4208
    uint128_t v266;  // 4210
    uint128_t v267;  // 4218
    uint128_t v268;  // 4220
    uint128_t v269;  // q10
    uint128_t v36;  // q2
    uint128_t v270;  // 4235
    uint128_t v271;  // 4237
    unsigned long v272;  // x12
    uint128_t v273;  // 4249
    uint128_t v274;  // 4260
    uint128_t *v275;  // x2
    uint128_t v276;  // 4276
    uint128_t v277;  // q10
    uint128_t *v278;  // x2
    uint128_t *v279;  // x2
    uint128_t v37;  // q20
    uint128_t v281;  // q5
    uint128_t v283;  // q3
    uint128_t v284;  // 4107
    uint128_t v285;  // 4109
    uint128_t v286;  // q6
    uint128_t v287;  // 4111
    uint128_t v288;  // q7
    uint128_t v289;  // q4
    st_a8ed70_5 *v38;  // x8
    uint128_t v290;  // 4117
    uint128_t v291;  // 4121
    uint128_t v292;  // 4123
    uint128_t v293;  // 4125
    uint128_t v294;  // 4132
    uint128_t v295;  // 4134
    uint128_t v298;  // 4143
    uint128_t v299;  // q31
    unsigned long v39;  // x12
    uint128_t v300;  // 4151
    uint128_t v301;  // 4153
    uint128_t v302;  // 4154
    uint128_t v303;  // 4159
    uint128_t v304;  // 4163
    uint128_t v305;  // 4165
    uint128_t v307;  // 4169
    uint128_t v308;  // 4171
    uint128_t v309;  // 4180
    unsigned long long v13;  // d9
    uint128_t v40;  // q3
    uint128_t v310;  // 4182
    uint128_t v311;  // 4187
    uint128_t v312;  // 4188
    uint128_t v314;  // 4193
    uint128_t v315;  // 4194
    uint128_t v316;  // 4198
    uint128_t v317;  // 4200
    uint128_t v318;  // 4208
    uint128_t v319;  // 4210
    __m128i v41;  // q14
    uint128_t v320;  // 4211
    uint128_t v321;  // 4215
    uint128_t v322;  // 4217
    uint128_t v323;  // 4225
    uint128_t v324;  // 4227
    uint128_t v325;  // 4228
    uint128_t v326;  // 4236
    uint128_t v327;  // 4238
    uint128_t v328;  // 4242
    uint128_t v329;  // 4244
    uint128_t v42;  // 4240
    uint128_t v330;  // q9
    uint128_t v331;  // 4252
    uint128_t v332;  // 4254
    unsigned long v333;  // d8
    uint128_t v334;  // 4262
    uint128_t v335;  // 4264
    uint128_t v336;  // q11
    uint128_t v337;  // 4272
    uint128_t v338;  // 4274
    uint128_t v339;  // 4275
    uint128_t v43;  // 4242
    uint128_t v340;  // 4283
    uint128_t v341;  // 4285
    uint128_t v342;  // 4289
    uint128_t v343;  // 4291
    uint128_t v345;  // 4298
    uint128_t v346;  // 4300
    uint128_t v347;  // 4304
    uint128_t v348;  // 4306
    uint128_t v349;  // 4314
    uint128_t v44;  // q21
    uint128_t v350;  // 4316
    uint128_t v351;  // 4320
    uint128_t v352;  // 4322
    uint128_t v353;  // 4326
    uint128_t v354;  // 4328
    uint128_t v355;  // 4332
    uint128_t v356;  // 4334
    uint128_t v357;  // 4342
    uint128_t v358;  // 4344
    uint128_t v359;  // 4348
    st_a8ed70_6 *v45;  // x8
    uint128_t v360;  // 4350
    uint128_t v361;  // 4099
    uint128_t v362;  // 4101
    uint128_t v363;  // 4105
    uint128_t v364;  // 4107
    uint128_t v365;  // q10
    uint128_t v366;  // 4115
    uint128_t v367;  // 4117
    uint128_t v368;  // 4121
    uint128_t v369;  // 4123
    uint128_t v46;  // 4250
    uint128_t v370;  // 4127
    uint128_t v371;  // 4129
    uint128_t v372;  // 4130
    uint128_t v373;  // 4134
    uint128_t v374;  // 4136
    uint128_t v376;  // 4143
    uint128_t v377;  // 4145
    uint128_t v378;  // 4149
    uint128_t v379;  // 4151
    uint128_t v47;  // 4252
    uint128_t v380;  // 4159
    uint128_t v381;  // 4161
    uint128_t v382;  // 4169
    uint128_t v383;  // 4171
    unsigned long long *v384;  // x0
    long long v385;  // x5
    unsigned long long *v386;  // x0
    uint128_t v387;  // q8
    uint128_t v388;  // q4
    uint128_t v389;  // q5
    __m128i v48;  // q12
    uint128_t v390;  // q11
    uint128_t v391;  // q9
    uint128_t v392;  // q10
    unsigned long long *v393;  // x0
    uint128_t v395;  // q4
    uint128_t v396;  // q5
    uint128_t v397;  // 4117
    uint128_t v398;  // 4119
    uint128_t v49;  // 4260
    uint128_t v400;  // 4129
    unsigned long long *v402;  // x0
    uint128_t v403;  // q4
    uint128_t v404;  // 4117
    uint128_t v405;  // q5
    uint128_t v406;  // 4119
    uint128_t v408;  // 4136
    unsigned long long v14;  // d10
    uint128_t v50;  // 4262
    uint128_t v410;  // q4
    uint128_t v411;  // 4117
    uint128_t v412;  // q5
    uint128_t v413;  // 4119
    uint128_t v414;  // q22
    uint128_t v416;  // 4128
    unsigned long long v417;  // x1
    uint128_t v418;  // x14
    unsigned long v419;  // cc_dep1
    uint128_t v51;  // q22
    uint128_t v420;  // x6
    unsigned long long v421;  // 4104
    unsigned long long v422;  // 4104
    uint128_t v423;  // x7
    uint128_t v424;  // q0
    uint128_t v425;  // q5
    uint128_t v427;  // q4
    uint128_t v428;  // 4103
    st_a8ed70_7 *v52;  // x8
    uint128_t v430;  // 4118
    uint128_t v431;  // 4119
    uint128_t v432;  // q11
    uint128_t v433;  // q9
    unsigned long v434;  // d8
    uint128_t v435;  // 4140
    uint128_t v437;  // q10
    uint128_t v438;  // 4152
    uint128_t v439;  // q10
    uint128_t v53;  // 4270
    uint128_t v441;  // q11
    unsigned long v442;  // d0
    uint128_t v54;  // 4272
    uint128_t v55;  // q23
    st_a8ed70_8 *v56;  // x8
    uint128_t v57;  // 4280
    uint128_t v58;  // 4282
    uint128_t v59;  // 4289
    unsigned long long v15;  // d11
    uint128_t v60;  // 4291
    uint128_t v61;  // q24
    st_a8ed70_1 *v62;  // x8
    uint128_t v63;  // 4299
    uint128_t v64;  // 4301
    uint128_t v65;  // q25
    st_a8ed70_2 *v66;  // x8
    uint128_t v67;  // 4309
    uint128_t v68;  // 4311
    uint128_t v69;  // 4318
    unsigned long long v16;  // d12
    uint128_t v70;  // 4320
    uint128_t v71;  // q26
    uint128_t v72;  // 4328
    uint128_t v73;  // 4330
    __m128i v74;  // q13
    uint128_t v75;  // 4338
    uint128_t v76;  // 4340
    uint128_t v77;  // 4344
    uint128_t v78;  // 4346
    __m128i v79;  // q17
    unsigned long long v17;  // d13
    uint128_t v80;  // 4354
    uint128_t v81;  // 4356
    uint128_t v82;  // 4360
    uint128_t v83;  // 4362
    uint128_t v84;  // 4366
    uint128_t v85;  // 4368
    uint128_t v86;  // q27
    uint128_t v87;  // 4376
    uint128_t v88;  // 4378
    uint128_t v89;  // 4386
    unsigned long long v18;  // d14
    uint128_t v90;  // 4388
    unsigned long long *v91;  // x5
    uint128_t v92;  // 4396
    uint128_t v93;  // 4398
    uint128_t v94;  // 4099
    uint128_t v95;  // 4101
    uint128_t v96;  // 4105
    uint128_t v97;  // 4107
    uint128_t v98;  // 4111
    uint128_t v99;  // 4113
    unsigned long long v19;  // d15
    uint128_t v100;  // 4117
    uint128_t v101;  // 4119
    uint128_t v102;  // 4123
    uint128_t v103;  // 4125
    uint128_t v104;  // 4129
    uint128_t v105;  // 4131
    uint128_t v106;  // 4135
    uint128_t v107;  // 4137
    uint128_t v108;  // 4144
    uint128_t v109;  // 4146
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
        return v442;
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
    v21 = a5->field_a0;
    v22 = a5->field_a8;
    v23 = __dirty_unsupported_Iop_SliceV128(*a3, *a3, 8);
    v24 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v23);
    v25 = a5->field_0;
    v26 = &a5->field_10;
    v27 = (unsigned long long)((long long)a4[8]) >> 32;
    v28 = __dirty_unsupported_Iop_SliceV128(a3[7], a3[7], 8);
    v29 = (unsigned int)((((((v27 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v27 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v27 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v27 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) + 1;
    v30 = (long long)a4[8] & 0xffffffff;
    v31 = v26->field_0;
    v32 = &v26->field_10;
    v33 = (unsigned int)v29 + 1;
    v34 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v30 | ((((((v29 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v29 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v29 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v29 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v35 = (unsigned int)v33 + 1;
    v36 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v30 | ((((((v33 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v33 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v33 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v33 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v37 = v32->field_0;
    v38 = &v32->field_10;
    v39 = (unsigned int)v35 + 1;
    v40 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v30 | ((((((v35 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v35 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v35 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v35 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v41 = __dirty_unsupported_Iop_SliceV128(a3[5], a3[5], 8);
    v42 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v34 ^ v25) >> 64), (unsigned long long)v34 ^ (unsigned long long)v25);
    v43 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v42 >> 64), (unsigned long long)v42);
    v44 = v38->field_0;
    v45 = &v38->field_10;
    v46 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v36 ^ v25) >> 64), (unsigned long long)v36 ^ (unsigned long long)v25);
    v47 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v46 >> 64), (unsigned long long)v46);
    v48 = __dirty_unsupported_Iop_SliceV128(a3[2], a3[2], 8);
    v49 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((*(int128_t *)a4 ^ v25) >> 64), (long long)*(int128_t *)a4 ^ (unsigned long long)v25);
    v50 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v49 >> 64), (unsigned long long)v49);
    v51 = v45->field_0;
    v52 = &v45->field_10;
    v53 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v40 ^ v25) >> 64), (unsigned long long)v40 ^ (unsigned long long)v25);
    v54 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v53 >> 64), (unsigned long long)v53);
    v55 = v52->field_0;
    v56 = &v52->field_10;
    v57 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v47 ^ v31) >> 64), (unsigned long long)v47 ^ (unsigned long long)v31);
    v58 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v57 >> 64), (unsigned long long)v57);
    v59 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v50 ^ v31) >> 64), (unsigned long long)v50 ^ (unsigned long long)v31);
    v60 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v59 >> 64), (unsigned long long)v59);
    v61 = v56->field_0;
    v62 = &v56->field_10;
    v63 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v43 ^ v31) >> 64), (unsigned long long)v43 ^ (unsigned long long)v31);
    v64 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v63 >> 64), (unsigned long long)v63);
    v65 = v62->field_0;
    v66 = &v62->field_10;
    v67 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v54 ^ v31) >> 64), (unsigned long long)v54 ^ (unsigned long long)v31);
    v68 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v67 >> 64), (unsigned long long)v67);
    v69 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v60 ^ v37) >> 64), (unsigned long long)v60 ^ (unsigned long long)v37);
    v70 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v69 >> 64), (unsigned long long)v69);
    v71 = v66->field_0;
    v72 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v64 ^ v37) >> 64), (unsigned long long)v64 ^ (unsigned long long)v37);
    v73 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v72 >> 64), (unsigned long long)v72);
    v74 = __dirty_unsupported_Iop_SliceV128(a3[4], a3[4], 8);
    v75 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v68 ^ v37) >> 64), (unsigned long long)v68 ^ (unsigned long long)v37);
    v76 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v75 >> 64), (unsigned long long)v75);
    v77 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v58 ^ v37) >> 64), (unsigned long long)v58 ^ (unsigned long long)v37);
    v78 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v77 >> 64), (unsigned long long)v77);
    v79 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpackhi_epi64(v41, v41), _mm_unpackhi_epi64(v28, v28)));
    v80 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v70 ^ v44) >> 64), (unsigned long long)v70 ^ (unsigned long long)v44);
    v81 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v80 >> 64), (unsigned long long)v80);
    v82 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v73 ^ v44) >> 64), (unsigned long long)v73 ^ (unsigned long long)v44);
    v83 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v82 >> 64), (unsigned long long)v82);
    v84 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v78 ^ v44) >> 64), (unsigned long long)v78 ^ (unsigned long long)v44);
    v85 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v84 >> 64), (unsigned long long)v84);
    v86 = v66->field_10;
    v87 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v76 ^ v44) >> 64), (unsigned long long)v76 ^ (unsigned long long)v44);
    v88 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v87 >> 64), (unsigned long long)v87);
    v89 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v88 ^ v51) >> 64), (unsigned long long)v88 ^ (unsigned long long)v51);
    v90 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v89 >> 64), (unsigned long long)v89);
    v91 = ((a1 >> 3) - 1 & 0xffffffffffffffc0) + (char *)a0;
    v92 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v85 ^ v51) >> 64), (unsigned long long)v85 ^ (unsigned long long)v51);
    v93 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v92 >> 64), (unsigned long long)v92);
    v94 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v81 ^ v51) >> 64), (unsigned long long)v81 ^ (unsigned long long)v51);
    v95 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v94 >> 64), (unsigned long long)v94);
    v96 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v90 ^ v55) >> 64), (unsigned long long)v90 ^ (unsigned long long)v55);
    v97 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v96 >> 64), (unsigned long long)v96);
    v98 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v93 ^ v55) >> 64), (unsigned long long)v93 ^ (unsigned long long)v55);
    v99 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v98 >> 64), (unsigned long long)v98);
    v100 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v95 ^ v55) >> 64), (unsigned long long)v95 ^ (unsigned long long)v55);
    v101 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v100 >> 64), (unsigned long long)v100);
    v102 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v97 ^ v61) >> 64), (unsigned long long)v97 ^ (unsigned long long)v61);
    v103 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v102 >> 64), (unsigned long long)v102);
    v104 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v83 ^ v51) >> 64), (unsigned long long)v83 ^ (unsigned long long)v51);
    v105 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v104 >> 64), (unsigned long long)v104);
    v106 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v99 ^ v61) >> 64), (unsigned long long)v99 ^ (unsigned long long)v61);
    v107 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v106 >> 64), (unsigned long long)v106);
    v108 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v101 ^ v61) >> 64), (unsigned long long)v101 ^ (unsigned long long)v61);
    v109 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v108 >> 64), (unsigned long long)v108);
    v110 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v105 ^ v55) >> 64), (unsigned long long)v105 ^ (unsigned long long)v55);
    v111 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v110 >> 64), (unsigned long long)v110);
    v112 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v103 ^ v65) >> 64), (unsigned long long)v103 ^ (unsigned long long)v65);
    v113 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v112 >> 64), (unsigned long long)v112);
    v114 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v109 ^ v65) >> 64), (unsigned long long)v109 ^ (unsigned long long)v65);
    v115 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v114 >> 64), (unsigned long long)v114);
    v116 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v111 ^ v61) >> 64), (unsigned long long)v111 ^ (unsigned long long)v61);
    v117 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v116 >> 64), (unsigned long long)v116);
    v118 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v107 ^ v65) >> 64), (unsigned long long)v107 ^ (unsigned long long)v65);
    v119 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v118 >> 64), (unsigned long long)v118);
    v120 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v115 ^ v71) >> 64), (unsigned long long)v115 ^ (unsigned long long)v71);
    v121 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v120 >> 64), (unsigned long long)v120);
    v122 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v117 ^ v65) >> 64), (unsigned long long)v117 ^ (unsigned long long)v65);
    v123 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v122 >> 64), (unsigned long long)v122);
    v124 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v119 ^ v71) >> 64), (unsigned long long)v119 ^ (unsigned long long)v71);
    v125 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v124 >> 64), (unsigned long long)v124);
    v126 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v113 ^ v71) >> 64), (unsigned long long)v113 ^ (unsigned long long)v71);
    v127 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v126 >> 64), (unsigned long long)v126);
    v128 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v123 ^ v71) >> 64), (unsigned long long)v123 ^ (unsigned long long)v71);
    v129 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v128 >> 64), (unsigned long long)v128);
    v130 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v125 ^ v86) >> 64), (unsigned long long)v125 ^ (unsigned long long)v86);
    v131 = v130;
    v132 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v121 ^ v86) >> 64), (unsigned long long)v121 ^ (unsigned long long)v86);
    v133 = v132;
    v134 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v74, v74)), _mm_unpackhi_epi64(_mm_unpackhi_epi64(v48, v48), _mm_unpackhi_epi64(v74, v74)));
    v135 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v129 ^ v86) >> 64), (unsigned long long)v129 ^ (unsigned long long)v86);
    v136 = v135;
    v137 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v127 ^ v86) >> 64), (unsigned long long)v127 ^ (unsigned long long)v86);
    v138 = v137;
    v139 = arm64g_calculate_condition(164, a0, v91, 0);
    v140 = a0;
    if (!(v139 & 1))
    {
        v141 = a0[7];
        v142 = _INSERT(__double_as_longlong(__longlong_as_double(*a0 ^ v21)), 8, a0[1] ^ v22);
        v143 = a0[6] ^ v21;
        v144 = _INSERT(__double_as_longlong(__longlong_as_double(a0[2] ^ v21)), 8, a0[3] ^ v22);
        v145 = _INSERT(__double_as_longlong(__longlong_as_double(a0[4] ^ v21)), 8, a0[5] ^ v22);
        v146 = v133 ^ v142;
        v147 = (unsigned int)v39 + 1;
        v148 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v30 | ((((((v39 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v39 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v39 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v39 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        v149 = v136 ^ v144;
        v150 = (unsigned int)v147 + 1;
        i = a0 + 8;
        v152 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v30 | ((((((v147 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v147 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v147 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v147 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        *iter = v146;
        v153 = iter + 1;
        v154 = _INSERT(__double_as_longlong(__longlong_as_double(v143)), 8, v141 ^ v22);
        v155 = (unsigned int)v150 + 1;
        v156 = v131 ^ v145;
        *v153 = v149;
        v157 = v153 + 1;
        v158 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v30 | ((((((v150 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v150 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v150 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v150 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        *v157 = v156;
        v159 = v157 + 1;
        v160 = v30 | ((((((v155 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v155 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v155 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v155 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000;
        v161 = v138 ^ v154;
        *v159 = v161;
        iter = v159 + 1;
        v140 = i;
        if (v91 > v140)
        {
            do
            {
                v163 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v156);
                v164 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v158 ^ v25) >> 64), (unsigned long long)v158 ^ (unsigned long long)v25);
                v165 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v164 >> 64), (unsigned long long)v164);
                v167 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v149);
                v168 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v152 ^ v25) >> 64), (unsigned long long)v152 ^ (unsigned long long)v25);
                v169 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v168 >> 64), (unsigned long long)v168);
                v170 = (unsigned int)v155 + 1;
                v171 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v160);
                v172 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v148 ^ v25) >> 64), (unsigned long long)v148 ^ (unsigned long long)v25);
                v173 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v172 >> 64), (unsigned long long)v172);
                v174 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v165 ^ v31) >> 64), (unsigned long long)v165 ^ (unsigned long long)v31);
                v175 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v174 >> 64), (unsigned long long)v174);
                v176 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v169 ^ v31) >> 64), (unsigned long long)v169 ^ (unsigned long long)v31);
                v177 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v176 >> 64), (unsigned long long)v176);
                v178 = __dirty_unsupported_Iop_SliceV128(v24, v24, 8) ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v146);
                v179 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v171 ^ v25) >> 64), (unsigned long long)v171 ^ (unsigned long long)v25);
                v180 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v179 >> 64), (unsigned long long)v179);
                v181 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v167 >> 64), _mm_extract_epi64(v41, 1));
                v182 = __dirty_unsupported_Iop_ZeroHI64ofV128(v163 ^ *(unsigned long long *)((void*)&v163 + 8));
                v183 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v173 ^ v31) >> 64), (unsigned long long)v173 ^ (unsigned long long)v31);
                v184 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v183 >> 64), (unsigned long long)v183);
                v186 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v178 >> 64), _mm_extract_epi64(v28, 1));
                v187 = (unsigned int)v170 + 1;
                v188 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v184 ^ v37) >> 64), (unsigned long long)v184 ^ (unsigned long long)v37);
                v189 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v188 >> 64), (unsigned long long)v188);
                v190 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v178, _mm_cvtsi128_si64(v28));
                v192 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v177 ^ v37) >> 64), (unsigned long long)v177 ^ (unsigned long long)v37);
                v193 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v192 >> 64), (unsigned long long)v192);
                v194 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v189 ^ v44) >> 64), (unsigned long long)v189 ^ (unsigned long long)v44);
                v195 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v194 >> 64), (unsigned long long)v194);
                v196 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v163, _mm_cvtsi128_si64(v74));
                v197 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v178 ^ *(unsigned long long *)((void*)&v178 + 8)), _mm_extract_epi64(v79, 1));
                v198 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v161);
                v199 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v167 ^ *(unsigned long long *)((void*)&v167 + 8)), _mm_cvtsi128_si64(v79));
                v200 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v167, _mm_cvtsi128_si64(v41));
                v202 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v163 >> 64), _mm_extract_epi64(v74, 1));
                v203 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v180 ^ v31) >> 64), (unsigned long long)v180 ^ (unsigned long long)v31);
                v204 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v203 >> 64), (unsigned long long)v203);
                v205 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v175 ^ v37) >> 64), (unsigned long long)v175 ^ (unsigned long long)v37);
                v206 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v205 >> 64), (unsigned long long)v205);
                v207 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v193 ^ v44) >> 64), (unsigned long long)v193 ^ (unsigned long long)v44);
                v208 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v207 >> 64), (unsigned long long)v207);
                v210 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v198 >> 64), _mm_extract_epi64(v48, 1));
                v211 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v206 ^ v44) >> 64), (unsigned long long)v206 ^ (unsigned long long)v44);
                v212 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v211 >> 64), (unsigned long long)v211);
                v213 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v182, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v182) >> 64, _mm_extract_epi64(v134, 1));
                v214 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v198, _mm_cvtsi128_si64(v48));
                v215 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v198 ^ *(unsigned long long *)((void*)&v198 + 8)), _mm_cvtsi128_si64(v134));
                v216 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v208 ^ v51) >> 64), (unsigned long long)v208 ^ (unsigned long long)v51);
                v217 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v216 >> 64), (unsigned long long)v216);
                v218 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v204 ^ v37) >> 64), (unsigned long long)v204 ^ (unsigned long long)v37);
                v219 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v218 >> 64), (unsigned long long)v218);
                v220 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
                v221 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v195 ^ v51) >> 64), (unsigned long long)v195 ^ (unsigned long long)v51);
                v222 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v221 >> 64), (unsigned long long)v221);
                v223 = v210 ^ v202 ^ v181 ^ v186;
                v224 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v217 ^ v55) >> 64), (unsigned long long)v217 ^ (unsigned long long)v55);
                v225 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v224 >> 64), (unsigned long long)v224);
                v226 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v219 ^ v44) >> 64), (unsigned long long)v219 ^ (unsigned long long)v44);
                v227 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v226 >> 64), (unsigned long long)v226);
                v228 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v222 ^ v55) >> 64), (unsigned long long)v222 ^ (unsigned long long)v55);
                v229 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v228 >> 64), (unsigned long long)v228);
                v230 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v223, v220);
                v231 = v214 ^ v196 ^ v200 ^ v190;
                v232 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v212 ^ v51) >> 64), (unsigned long long)v212 ^ (unsigned long long)v51);
                v233 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v232 >> 64), (unsigned long long)v232);
                v234 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v227 ^ v51) >> 64), (unsigned long long)v227 ^ (unsigned long long)v51);
                v235 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v234 >> 64), (unsigned long long)v234);
                v236 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v225 ^ v61) >> 64), (unsigned long long)v225 ^ (unsigned long long)v61);
                v237 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v236 >> 64), (unsigned long long)v236);
                v238 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v233 ^ v55) >> 64), (unsigned long long)v233 ^ (unsigned long long)v55);
                v239 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v238 >> 64), (unsigned long long)v238);
                v240 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v229 ^ v61) >> 64), (unsigned long long)v229 ^ (unsigned long long)v61);
                v241 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v240 >> 64), (unsigned long long)v240);
                v242 = _INSERT(__double_as_longlong(__longlong_as_double(*i ^ v21)), 8, i[1] ^ v22);
                v140 = i + 8;
                v243 = __dirty_unsupported_Iop_SliceV128(v223, v223, 8);
                v244 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v235 ^ v55) >> 64), (unsigned long long)v235 ^ (unsigned long long)v55);
                v245 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v244 >> 64), (unsigned long long)v244);
                v246 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v241 ^ v65) >> 64), (unsigned long long)v241 ^ (unsigned long long)v65);
                v247 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v246 >> 64), (unsigned long long)v246);
                v248 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v239 ^ v61) >> 64), (unsigned long long)v239 ^ (unsigned long long)v61);
                v249 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v248 >> 64), (unsigned long long)v248);
                v250 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v237 ^ v65) >> 64), (unsigned long long)v237 ^ (unsigned long long)v65);
                v251 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v250 >> 64), (unsigned long long)v250);
                v252 = _INSERT(__double_as_longlong(__longlong_as_double(i[2] ^ v21)), 8, i[3] ^ v22);
                v253 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v247 ^ v71) >> 64), (unsigned long long)v247 ^ (unsigned long long)v71);
                v254 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v253 >> 64), (unsigned long long)v253);
                v255 = _INSERT(__double_as_longlong(__longlong_as_double(i[6] ^ v21)), 8, i[7] ^ v22);
                v256 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v245 ^ v61) >> 64), (unsigned long long)v245 ^ (unsigned long long)v61);
                v257 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v256 >> 64), (unsigned long long)v256);
                v258 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v251 ^ v71) >> 64), (unsigned long long)v251 ^ (unsigned long long)v71);
                v259 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v258 >> 64), (unsigned long long)v258);
                v260 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v254 ^ v86) >> 64), (unsigned long long)v254 ^ (unsigned long long)v86);
                v261 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v257 ^ v65) >> 64), (unsigned long long)v257 ^ (unsigned long long)v65);
                v262 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v261 >> 64), (unsigned long long)v261);
                v263 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v259 ^ v86) >> 64), (unsigned long long)v259 ^ (unsigned long long)v86);
                v264 = _INSERT(__double_as_longlong(__longlong_as_double(i[4] ^ v21)), 8, i[5] ^ v22);
                v265 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v249 ^ v65) >> 64), (unsigned long long)v249 ^ (unsigned long long)v65);
                v266 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v265 >> 64), (unsigned long long)v265);
                v146 = v260 ^ v242;
                v267 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v262 ^ v71) >> 64), (unsigned long long)v262 ^ (unsigned long long)v71);
                v268 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v267 >> 64), (unsigned long long)v267);
                v148 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v30 | ((((((v170 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v170 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v170 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v170 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v269 = v243 ^ v230 ^ v223 ^ v231 ^ v215 ^ v213 ^ v199 ^ v197;
                v270 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v266 ^ v71) >> 64), (unsigned long long)v266 ^ (unsigned long long)v71);
                v271 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v270 >> 64), (unsigned long long)v270);
                v149 = v263 ^ v252;
                v272 = (unsigned int)v187 + 1;
                v273 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v269, v220);
                v152 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v30 | ((((((v187 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v187 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v187 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v187 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v274 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v271 ^ v86) >> 64), (unsigned long long)v271 ^ (unsigned long long)v86);
                *iter = v146;
                v275 = iter + 1;
                v156 = v274 ^ v264;
                v276 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v268 ^ v86) >> 64), (unsigned long long)v268 ^ (unsigned long long)v86);
                v155 = (unsigned int)v272 + 1;
                v277 = __dirty_unsupported_Iop_SliceV128(v269, v269, 8);
                *v275 = v149;
                v278 = v275 + 1;
                v158 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v30 | ((((((v272 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v272 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v272 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v272 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                *v278 = v156;
                v279 = v278 + 1;
                v160 = v30 | ((((((v155 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v155 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v155 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v155 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000;
                v161 = v276 ^ v255;
                v24 = v277 ^ v273 ^ v231;
                *v279 = v161;
                iter = v279 + 1;
                i = v140;
            } while (i < v91);
        }
        v281 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v149);
        v39 = (unsigned int)v155 + 1;
        v283 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v160);
        v284 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v152 ^ v25) >> 64), (unsigned long long)v152 ^ (unsigned long long)v25);
        v285 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v284 >> 64), (unsigned long long)v284);
        v286 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v156);
        v287 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v281, _mm_cvtsi128_si64(v41));
        v288 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v161);
        v289 = __dirty_unsupported_Iop_SliceV128(v24, v24, 8) ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v146);
        v290 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v281 >> 64), _mm_extract_epi64(v41, 1));
        v291 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v283 ^ v25) >> 64), (unsigned long long)v283 ^ (unsigned long long)v25);
        v292 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v291 >> 64), (unsigned long long)v291);
        v293 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v289, _mm_cvtsi128_si64(v28));
        v294 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v285 ^ v31) >> 64), (unsigned long long)v285 ^ (unsigned long long)v31);
        v295 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v294 >> 64), (unsigned long long)v294);
        v298 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v289 >> 64), _mm_extract_epi64(v28, 1));
        v299 = __dirty_unsupported_Iop_ZeroHI64ofV128(v286 ^ *(unsigned long long *)((void*)&v286 + 8));
        v300 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v292 ^ v31) >> 64), (unsigned long long)v292 ^ (unsigned long long)v31);
        v301 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v300 >> 64), (unsigned long long)v300);
        v302 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v281 ^ *(unsigned long long *)((void*)&v281 + 8)), _mm_cvtsi128_si64(v79));
        v303 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v289 ^ *(unsigned long long *)((void*)&v289 + 8)), _mm_extract_epi64(v79, 1));
        v304 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v148 ^ v25) >> 64), (unsigned long long)v148 ^ (unsigned long long)v25);
        v305 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v304 >> 64), (unsigned long long)v304);
        v307 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v158 ^ v25) >> 64), (unsigned long long)v158 ^ (unsigned long long)v25);
        v308 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v307 >> 64), (unsigned long long)v307);
        v309 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v305 ^ v31) >> 64), (unsigned long long)v305 ^ (unsigned long long)v31);
        v310 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v309 >> 64), (unsigned long long)v309);
        v311 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v299, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v299) >> 64, _mm_extract_epi64(v134, 1));
        v312 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v286 >> 64), _mm_extract_epi64(v74, 1));
        v314 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v288 >> 64), _mm_extract_epi64(v48, 1));
        v315 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v286, _mm_cvtsi128_si64(v74));
        v316 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v308 ^ v31) >> 64), (unsigned long long)v308 ^ (unsigned long long)v31);
        v317 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v316 >> 64), (unsigned long long)v316);
        v318 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v310 ^ v37) >> 64), (unsigned long long)v310 ^ (unsigned long long)v37);
        v319 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v318 >> 64), (unsigned long long)v318);
        v320 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v288, _mm_cvtsi128_si64(v48));
        v321 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v317 ^ v37) >> 64), (unsigned long long)v317 ^ (unsigned long long)v37);
        v322 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v321 >> 64), (unsigned long long)v321);
        v323 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v301 ^ v37) >> 64), (unsigned long long)v301 ^ (unsigned long long)v37);
        v324 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v323 >> 64), (unsigned long long)v323);
        v325 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v288 ^ *(unsigned long long *)((void*)&v288 + 8)), _mm_cvtsi128_si64(v134));
        v326 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v322 ^ v44) >> 64), (unsigned long long)v322 ^ (unsigned long long)v44);
        v327 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v326 >> 64), (unsigned long long)v326);
        v328 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v295 ^ v37) >> 64), (unsigned long long)v295 ^ (unsigned long long)v37);
        v329 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v328 >> 64), (unsigned long long)v328);
        v330 = v314 ^ v312 ^ v290 ^ v298;
        v331 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v319 ^ v44) >> 64), (unsigned long long)v319 ^ (unsigned long long)v44);
        v332 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v331 >> 64), (unsigned long long)v331);
        v333 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
        v334 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v329 ^ v44) >> 64), (unsigned long long)v329 ^ (unsigned long long)v44);
        v335 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v334 >> 64), (unsigned long long)v334);
        v336 = v320 ^ v315 ^ v287 ^ v293;
        v337 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v332 ^ v51) >> 64), (unsigned long long)v332 ^ (unsigned long long)v51);
        v338 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v337 >> 64), (unsigned long long)v337);
        v339 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v330, v333);
        v340 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v335 ^ v51) >> 64), (unsigned long long)v335 ^ (unsigned long long)v51);
        v341 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v340 >> 64), (unsigned long long)v340);
        v342 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v338 ^ v55) >> 64), (unsigned long long)v338 ^ (unsigned long long)v55);
        v343 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v342 >> 64), (unsigned long long)v342);
        v345 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v324 ^ v44) >> 64), (unsigned long long)v324 ^ (unsigned long long)v44);
        v346 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v345 >> 64), (unsigned long long)v345);
        v347 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v327 ^ v51) >> 64), (unsigned long long)v327 ^ (unsigned long long)v51);
        v348 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v347 >> 64), (unsigned long long)v347);
        v349 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v343 ^ v61) >> 64), (unsigned long long)v343 ^ (unsigned long long)v61);
        v350 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v349 >> 64), (unsigned long long)v349);
        v351 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v346 ^ v51) >> 64), (unsigned long long)v346 ^ (unsigned long long)v51);
        v352 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v351 >> 64), (unsigned long long)v351);
        v353 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v341 ^ v55) >> 64), (unsigned long long)v341 ^ (unsigned long long)v55);
        v354 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v353 >> 64), (unsigned long long)v353);
        v355 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v348 ^ v55) >> 64), (unsigned long long)v348 ^ (unsigned long long)v55);
        v356 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v355 >> 64), (unsigned long long)v355);
        v357 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v352 ^ v55) >> 64), (unsigned long long)v352 ^ (unsigned long long)v55);
        v358 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v357 >> 64), (unsigned long long)v357);
        v359 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v354 ^ v61) >> 64), (unsigned long long)v354 ^ (unsigned long long)v61);
        v360 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v359 >> 64), (unsigned long long)v359);
        v361 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v356 ^ v61) >> 64), (unsigned long long)v356 ^ (unsigned long long)v61);
        v362 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v361 >> 64), (unsigned long long)v361);
        v363 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v358 ^ v61) >> 64), (unsigned long long)v358 ^ (unsigned long long)v61);
        v364 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v363 >> 64), (unsigned long long)v363);
        v365 = __dirty_unsupported_Iop_SliceV128(v330, v330, 8) ^ v339 ^ v336 ^ v330 ^ v325 ^ v311 ^ v302 ^ v303;
        v366 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v350 ^ v65) >> 64), (unsigned long long)v350 ^ (unsigned long long)v65);
        v367 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v366 >> 64), (unsigned long long)v366);
        v368 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v362 ^ v65) >> 64), (unsigned long long)v362 ^ (unsigned long long)v65);
        v369 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v368 >> 64), (unsigned long long)v368);
        v370 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v364 ^ v65) >> 64), (unsigned long long)v364 ^ (unsigned long long)v65);
        v371 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v370 >> 64), (unsigned long long)v370);
        v372 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v365, v333);
        v373 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v360 ^ v65) >> 64), (unsigned long long)v360 ^ (unsigned long long)v65);
        v374 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v373 >> 64), (unsigned long long)v373);
        v376 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v371 ^ v71) >> 64), (unsigned long long)v371 ^ (unsigned long long)v71);
        v377 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v376 >> 64), (unsigned long long)v376);
        v378 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v367 ^ v71) >> 64), (unsigned long long)v367 ^ (unsigned long long)v71);
        v379 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v378 >> 64), (unsigned long long)v378);
        v380 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v374 ^ v71) >> 64), (unsigned long long)v374 ^ (unsigned long long)v71);
        v381 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v380 >> 64), (unsigned long long)v380);
        v138 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v377 ^ v86) >> 64), (unsigned long long)v377 ^ (unsigned long long)v86);
        v382 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v369 ^ v71) >> 64), (unsigned long long)v369 ^ (unsigned long long)v71);
        v383 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v382 >> 64), (unsigned long long)v382);
        v133 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v379 ^ v86) >> 64), (unsigned long long)v379 ^ (unsigned long long)v86);
        v136 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v381 ^ v86) >> 64), (unsigned long long)v381 ^ (unsigned long long)v86);
        v24 = __dirty_unsupported_Iop_SliceV128(v365, v365, 8) ^ v372 ^ v336;
        v131 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v383 ^ v86) >> 64), (unsigned long long)v383 ^ (unsigned long long)v86);
    }
    v384 = v140;
    v385 = (char *)a0 + (a1 >> 3) - v384;
    v386 = v384 + 2;
    v387 = __dirty_unsupported_Iop_SliceV128(v24, v24, 8);
    v388 = _INSERT(__double_as_longlong(__longlong_as_double(*v384 ^ v21)), 8, v384[1] ^ v22);
    v389 = v133 ^ v388;
    if (48 >= v385)
    {
        v39 = (unsigned int)v39 - 1;
        v390 = 0;
        v138 = v131;
        v131 = v136;
        v391 = 0;
        v392 = 0;
        if (32 < v385)
            goto LABEL_a8f5cc;
        v138 = v136;
        v39 = (unsigned int)v39 - 1;
        if (16 < v385)
            goto LABEL_a8f614;
        v39 = (unsigned int)v39 - 1;
    }
    else
    {
        *iter = v389;
        iter += 1;
        v393 = v386 + 2;
        v395 = v387 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v389);
        v387 = 0;
        v396 = _INSERT(__double_as_longlong(__longlong_as_double(*v386 ^ v21)), 8, v386[1] ^ v22);
        v397 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v395, _mm_cvtsi128_si64(v28));
        v390 = v397;
        v398 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v395 >> 64), _mm_extract_epi64(v28, 1));
        v391 = v398;
        v389 = v136 ^ v396;
        v400 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v395 ^ *(unsigned long long *)((void*)&v395 + 8)), _mm_extract_epi64(v79, 1));
        v392 = v400;
        v386 = v393;
LABEL_a8f5cc:
        *iter = v389;
        iter += 1;
        v402 = v386 + 2;
        v403 = v387 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v389);
        v404 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v403 >> 64), _mm_extract_epi64(v41, 1));
        v405 = _INSERT(__double_as_longlong(__longlong_as_double(*v386 ^ v21)), 8, v386[1] ^ v22);
        v406 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v403, _mm_cvtsi128_si64(v41));
        v391 ^= v404;
        v389 = v131 ^ v405;
        v390 ^= v406;
        v408 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v403 ^ *(unsigned long long *)((void*)&v403 + 8)), _mm_cvtsi128_si64(v79));
        v387 = 0;
        v392 ^= v408;
        v386 = v402;
LABEL_a8f614:
        *iter = v389;
        iter += 1;
        v410 = v387 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v389);
        v411 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v410 >> 64), _mm_extract_epi64(v74, 1));
        v412 = _INSERT(__double_as_longlong(__longlong_as_double(*v386 ^ v21)), 8, v386[1] ^ v22);
        v413 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v410, _mm_cvtsi128_si64(v74));
        v414 = __dirty_unsupported_Iop_ZeroHI64ofV128(v410 ^ *(unsigned long long *)((void*)&v410 + 8));
        v389 = v138 ^ v412;
        v416 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v414, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v414) >> 64, _mm_extract_epi64(v134, 1));
        v390 ^= v413;
        v391 ^= v411;
        v392 ^= v416;
        v387 = 0;
    }
    v417 = -((a1 & 127) - 128) & 127;
    v418 = 0xffffffffffffffff >> ((char)v417 & 63);
    v419 = v417;
    if ((long long)v417 < 64)
    {
        v420 = 0xffffffffffffffff;
        v421 = arm64g_calculate_condition(180, v419, 64, 0);
        if (!(v421 & 1))
            goto LABEL_a8f686;
LABEL_a8f685:
        v423 = v418;
    }
    else
    {
        v420 = v418;
        v422 = arm64g_calculate_condition(180, v419, 64, 0);
        if (v422 & 1)
            goto LABEL_a8f685;
LABEL_a8f686:
        v423 = 0;
    }
    v424 = _INSERT(__double_as_longlong(__longlong_as_double(v420)), 8, v423);
    v425 = v389 & v424;
    v427 = v387 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v425);
    v428 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v427, _mm_cvtsi128_si64(v48));
    v430 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v427 >> 64), _mm_extract_epi64(v48, 1));
    v431 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v427 ^ *(unsigned long long *)((void*)&v427 + 8)), _mm_cvtsi128_si64(v134));
    v432 = v428 ^ v390;
    v433 = v430 ^ v391;
    v434 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
    v435 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v433, v434);
    v437 = __dirty_unsupported_Iop_SliceV128(v433, v433, 8) ^ v435 ^ v433 ^ v432 ^ v431 ^ v392;
    v438 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v437, v434);
    v439 = __dirty_unsupported_Iop_SliceV128(v437, v437, 8);
    *iter = v425 ^ (v425 ^ *iter) & ~v424;
    *(unsigned int *)&a4[12] = (((((v39 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v39 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v39 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v39 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v441 = __dirty_unsupported_Iop_Reverse8sIn64_x2(__dirty_unsupported_Iop_SliceV128(v439 ^ v438 ^ v432, v439 ^ v438 ^ v432, 8));
    *a3 = v441;
    return *(unsigned long long *)&v424;
}
