/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa91640..0xa921a0 (2912 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a91640_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
    unsigned long long field_78;
} st_a91640_1;

typedef struct st_a91640_12 {
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
} st_a91640_12;

typedef struct st_a91640_11 {
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
} st_a91640_11;

typedef struct st_a91640_10 {
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
} st_a91640_10;

typedef struct st_a91640_9 {
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
} st_a91640_9;

typedef struct st_a91640_8 {
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
} st_a91640_8;

typedef struct st_a91640_4 {
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
    uint128_t field_c0;
    unsigned long long field_d0;
    unsigned long long field_d8;
} st_a91640_4;

typedef struct st_a91640_0 {
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
    uint128_t field_c0;
    uint128_t field_d0;
    unsigned long long field_e0;
    unsigned long long field_e8;
} st_a91640_0;

typedef struct st_a91640_7 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    unsigned long long field_28;
} st_a91640_7;

typedef struct st_a91640_6 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    unsigned long long field_38;
} st_a91640_6;

typedef struct st_a91640_5 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
} st_a91640_5;

typedef struct st_a91640_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
    unsigned long long field_58;
} st_a91640_3;

typedef struct st_a91640_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned long long field_60;
    unsigned long long field_68;
} st_a91640_2;


double sub_a91640(unsigned long long *a0, uint128_t a1, uint128_t *iter, uint128_t *a3, void* a4, st_a91640_0 *a5)
{
    unsigned long long v10;  // x19
    unsigned long long v11;  // x20
    unsigned long v20;  // x10
    uint128_t v110;  // 4123
    uint128_t v111;  // 4125
    uint128_t v112;  // 4132
    uint128_t v113;  // 4134
    uint128_t v114;  // q30
    uint128_t v115;  // 4142
    uint128_t v116;  // 4144
    __m128i v117;  // q12
    uint128_t v118;  // 4152
    uint128_t v119;  // 4154
    unsigned long v21;  // x13
    uint128_t v120;  // q31
    uint128_t v121;  // 4162
    uint128_t v122;  // 4164
    uint128_t v123;  // 4171
    uint128_t v124;  // 4173
    uint128_t v125;  // 4177
    uint128_t v126;  // 4179
    uint128_t v127;  // 4183
    uint128_t v128;  // 4185
    uint128_t v129;  // 4192
    unsigned long v22;  // x14
    uint128_t v130;  // 4194
    uint128_t v131;  // 4198
    uint128_t v132;  // 4200
    uint128_t v133;  // 4204
    uint128_t v134;  // 4206
    uint128_t v135;  // 4210
    uint128_t v136;  // 4212
    uint128_t v137;  // 4216
    uint128_t v138;  // 4218
    uint128_t v139;  // 4222
    uint128_t v23;  // q18
    uint128_t v140;  // 4224
    uint128_t v141;  // 4228
    uint128_t v142;  // 4230
    uint128_t v143;  // 4234
    uint128_t v144;  // 4236
    uint128_t v145;  // 4240
    uint128_t v146;  // 4242
    uint128_t v147;  // 4246
    uint128_t v148;  // 4248
    uint128_t v149;  // 4252
    st_a91640_4 *v24;  // x8
    uint128_t v150;  // 4254
    uint128_t v151;  // 4258
    uint128_t v152;  // 4260
    uint128_t v153;  // 4264
    uint128_t v154;  // 4266
    uint128_t v155;  // 4270
    uint128_t v156;  // 4272
    uint128_t v157;  // 4276
    uint128_t v158;  // 4278
    uint128_t v159;  // 4282
    uint128_t v25;  // q19
    uint128_t v160;  // 4284
    uint128_t v161;  // 4288
    uint128_t v162;  // 4290
    __m128i v163;  // q17
    uint128_t v164;  // 4298
    uint128_t v165;  // 4300
    uint128_t v166;  // 4304
    uint128_t v167;  // q2
    uint128_t v168;  // 4311
    uint128_t v169;  // 4313
    st_a91640_8 *v26;  // x8
    uint128_t v170;  // 4317
    uint128_t v171;  // 4319
    uint128_t v172;  // 4323
    uint128_t v173;  // q1
    uint128_t v174;  // 4327
    uint128_t v175;  // q0
    uint128_t v176;  // 4331
    uint128_t v177;  // q3
    __m128i v178;  // q16
    unsigned long long v179;  // 4498
    unsigned long long *v27;  // x5
    unsigned long long *v180;  // x0
    unsigned long v181;  // x24
    unsigned long long *v182;  // x0
    uint128_t v183;  // q4
    unsigned long v184;  // x23
    uint128_t v185;  // q5
    unsigned long v186;  // x12
    uint128_t v187;  // q6
    uint128_t v188;  // q4
    uint128_t v189;  // q0
    unsigned long long v28;  // x12
    unsigned long v190;  // x12
    uint128_t v191;  // q5
    uint128_t v192;  // q1
    uint128_t *v193;  // x2
    uint128_t v194;  // q7
    uint128_t v195;  // q6
    uint128_t *v196;  // x2
    unsigned long v197;  // x12
    uint128_t v198;  // q2
    uint128_t *v199;  // x2
    unsigned long long v29;  // x11
    unsigned long long v200;  // x9
    uint128_t v201;  // q7
    uint128_t v202;  // 4099
    uint128_t v203;  // 4101
    uint128_t v204;  // q4
    uint128_t v205;  // 4106
    uint128_t v206;  // 4108
    uint128_t v207;  // 4112
    uint128_t v208;  // 4114
    uint128_t v209;  // q11
    unsigned long long v12;  // d8
    uint128_t v30;  // 4186
    uint128_t v210;  // 4121
    uint128_t v211;  // 4123
    uint128_t v212;  // q3
    uint128_t v213;  // 4127
    uint128_t v214;  // 4129
    unsigned long v215;  // x24
    uint128_t v216;  // 4137
    uint128_t v217;  // 4139
    uint128_t v218;  // 4147
    uint128_t v219;  // 4149
    uint128_t v31;  // 4188
    uint128_t v220;  // q4
    uint128_t v221;  // 4157
    uint128_t v222;  // 4159
    uint128_t v223;  // 4163
    uint128_t v224;  // 4165
    unsigned long v225;  // x23
    uint128_t v226;  // 4173
    uint128_t v227;  // 4175
    uint128_t v228;  // 4177
    uint128_t v229;  // 4186
    unsigned long v32;  // x12
    uint128_t v230;  // 4188
    uint128_t v231;  // q5
    uint128_t v232;  // 4193
    uint128_t v233;  // 4195
    uint128_t v234;  // 4196
    uint128_t v236;  // 4204
    uint128_t v237;  // 4206
    uint128_t v238;  // 4210
    uint128_t v239;  // 4212
    unsigned long v33;  // x12
    uint128_t v240;  // q7
    uint128_t v241;  // 4214
    uint128_t v242;  // 4215
    uint128_t v243;  // q6
    uint128_t v244;  // 4217
    uint128_t v245;  // 4226
    uint128_t v246;  // 4228
    uint128_t v247;  // 4232
    uint128_t v248;  // 4234
    uint128_t v249;  // 4242
    uint128_t v34;  // q20
    uint128_t v250;  // 4244
    uint128_t v251;  // 4248
    uint128_t v252;  // 4250
    uint128_t v253;  // 4255
    uint128_t v254;  // 4257
    uint128_t v256;  // 4265
    uint128_t v257;  // 4267
    uint128_t v258;  // 4271
    uint128_t v259;  // 4273
    st_a91640_9 *v35;  // x8
    uint128_t v260;  // q8
    uint128_t v261;  // 4281
    uint128_t v262;  // 4283
    uint128_t v263;  // 4284
    uint128_t v264;  // 4288
    uint128_t v265;  // 4290
    uint128_t v266;  // 4294
    uint128_t v267;  // 4296
    uint128_t v269;  // 4300
    uint128_t v36;  // q1
    uint128_t v270;  // 4302
    uint128_t v271;  // 4306
    uint128_t v272;  // 4308
    uint128_t v273;  // 4312
    uint128_t v274;  // 4314
    uint128_t v275;  // 4318
    uint128_t v276;  // 4320
    uint128_t v277;  // 4325
    uint128_t v278;  // 4326
    uint128_t v279;  // 4330
    unsigned long v37;  // x12
    uint128_t v280;  // 4332
    uint128_t v281;  // 4333
    uint128_t v282;  // 4341
    uint128_t v283;  // 4343
    uint128_t v284;  // 4351
    uint128_t v285;  // 4353
    uint128_t v286;  // 4358
    uint128_t v287;  // 4360
    uint128_t v288;  // 4100
    uint128_t v289;  // 4101
    uint128_t v38;  // q21
    uint128_t v291;  // 4109
    uint128_t v292;  // 4111
    uint128_t v293;  // 4119
    uint128_t v294;  // 4121
    uint128_t v295;  // 4129
    uint128_t v296;  // 4131
    uint128_t v297;  // 4139
    uint128_t v298;  // 4141
    uint128_t v299;  // 4142
    st_a91640_10 *v39;  // x8
    uint128_t v300;  // q9
    uint128_t v301;  // 4150
    uint128_t v302;  // 4152
    uint128_t v303;  // 4160
    uint128_t v304;  // 4162
    unsigned long v305;  // d8
    uint128_t v306;  // 4166
    uint128_t v307;  // 4168
    uint128_t v308;  // q11
    uint128_t v309;  // 4176
    unsigned long long v13;  // d9
    uint128_t v40;  // q2
    uint128_t v310;  // 4178
    uint128_t v311;  // 4182
    uint128_t v312;  // 4184
    uint128_t v313;  // 4192
    uint128_t v314;  // 4194
    unsigned long v315;  // x12
    uint128_t v316;  // 4201
    uint128_t v317;  // 4203
    uint128_t v318;  // 4211
    uint128_t v319;  // 4213
    uint128_t v41;  // 4238
    uint128_t v320;  // 4217
    uint128_t v321;  // q9
    uint128_t v322;  // 4231
    uint128_t v323;  // 4233
    uint128_t v324;  // 4241
    uint128_t v325;  // 4243
    uint128_t v326;  // 4251
    uint128_t v327;  // 4253
    uint128_t v328;  // 4269
    uint128_t v329;  // 4271
    uint128_t v42;  // 4240
    uint128_t v330;  // 4279
    uint128_t v331;  // 4281
    uint128_t v332;  // 4289
    uint128_t v333;  // 4291
    unsigned long v334;  // x12
    uint128_t v335;  // 4298
    uint128_t v336;  // q4
    uint128_t v337;  // q10
    uint128_t v338;  // 4306
    uint128_t v339;  // 4308
    uint128_t v43;  // q3
    uint128_t v340;  // 4312
    uint128_t v341;  // q5
    uint128_t v342;  // q6
    uint128_t v343;  // 4318
    unsigned long v344;  // x12
    uint128_t v345;  // 4344
    uint128_t v346;  // 4346
    uint128_t v347;  // 4350
    uint128_t *v348;  // x2
    uint128_t v349;  // q7
    uint128_t v44;  // 4248
    uint128_t v350;  // q10
    uint128_t *v351;  // x2
    uint128_t v352;  // 4383
    uint128_t *v353;  // x2
    unsigned long long v354;  // 4156
    uint128_t v355;  // 4099
    uint128_t v356;  // 4101
    uint128_t v357;  // q6
    uint128_t v358;  // 4106
    uint128_t v359;  // 4108
    uint128_t v45;  // 4250
    uint128_t v360;  // 4112
    uint128_t v361;  // 4114
    uint128_t v363;  // q3
    uint128_t v365;  // 4122
    uint128_t v366;  // 4124
    uint128_t v367;  // 4128
    uint128_t v368;  // 4130
    uint128_t v369;  // q4
    uint128_t v46;  // q22
    uint128_t v370;  // q5
    uint128_t v371;  // 4139
    uint128_t v372;  // 4141
    uint128_t v373;  // 4145
    uint128_t v374;  // 4147
    uint128_t v375;  // 4152
    uint128_t v376;  // 4154
    uint128_t v377;  // 4155
    uint128_t v378;  // 4157
    uint128_t v379;  // 4161
    st_a91640_11 *v47;  // x8
    uint128_t v380;  // 4163
    uint128_t v381;  // 4167
    uint128_t v382;  // 4169
    uint128_t v384;  // 4177
    uint128_t v385;  // 4179
    uint128_t v386;  // 4183
    uint128_t v387;  // 4185
    uint128_t v388;  // 4189
    uint128_t v389;  // 4191
    uint128_t v48;  // 4258
    uint128_t v390;  // 4192
    uint128_t v391;  // 4193
    uint128_t v392;  // 4194
    uint128_t v393;  // 4198
    uint128_t v394;  // 4200
    uint128_t v395;  // 4209
    uint128_t v396;  // 4211
    uint128_t v397;  // 4219
    uint128_t v398;  // 4221
    uint128_t v49;  // 4260
    uint128_t v400;  // 4230
    uint128_t v401;  // 4232
    uint128_t v402;  // q7
    uint128_t v403;  // 4237
    uint128_t v404;  // 4239
    uint128_t v405;  // 4240
    uint128_t v406;  // q8
    uint128_t v407;  // 4248
    uint128_t v408;  // 4252
    uint128_t v409;  // 4254
    unsigned long long v14;  // d10
    uint128_t v50;  // q23
    uint128_t v410;  // 4258
    uint128_t v411;  // 4260
    uint128_t v412;  // 4265
    uint128_t v414;  // 4273
    uint128_t v415;  // 4275
    uint128_t v416;  // 4284
    uint128_t v417;  // 4286
    uint128_t v418;  // 4287
    st_a91640_12 *v51;  // x8
    uint128_t v420;  // 4292
    uint128_t v421;  // 4296
    uint128_t v422;  // 4298
    uint128_t v423;  // 4299
    uint128_t v424;  // 4307
    uint128_t v425;  // 4309
    uint128_t v426;  // 4313
    uint128_t v427;  // 4315
    uint128_t v428;  // 4319
    uint128_t v429;  // 4321
    uint128_t v52;  // 4268
    uint128_t v430;  // 4325
    uint128_t v431;  // 4327
    uint128_t v432;  // 4331
    uint128_t v433;  // 4333
    uint128_t v434;  // 4337
    uint128_t v435;  // 4339
    uint128_t v436;  // q9
    uint128_t v437;  // 4347
    uint128_t v438;  // 4349
    uint128_t v439;  // 4353
    uint128_t v53;  // 4270
    uint128_t v440;  // 4097
    unsigned long v441;  // d8
    uint128_t v442;  // 4101
    uint128_t v443;  // 4103
    uint128_t v444;  // 4108
    uint128_t v445;  // 4112
    uint128_t v446;  // 4114
    uint128_t v447;  // 4118
    uint128_t v448;  // 4120
    uint128_t v449;  // 4124
    uint128_t v54;  // q24
    uint128_t v450;  // 4126
    uint128_t v451;  // q11
    uint128_t v452;  // 4134
    uint128_t v453;  // 4136
    uint128_t v454;  // 4141
    uint128_t v456;  // 4148
    uint128_t v457;  // 4150
    uint128_t v458;  // 4154
    uint128_t v459;  // 4156
    st_a91640_1 *v55;  // x8
    uint128_t v460;  // 4164
    uint128_t v461;  // 4166
    uint128_t v462;  // 4170
    uint128_t v463;  // 4172
    uint128_t v464;  // 4176
    uint128_t v465;  // 4178
    uint128_t v466;  // 4182
    uint128_t v467;  // 4184
    uint128_t v468;  // 4192
    uint128_t v469;  // 4194
    uint128_t v56;  // 4278
    uint128_t v470;  // 4198
    uint128_t v471;  // 4200
    uint128_t v472;  // 4204
    uint128_t v473;  // 4206
    uint128_t v474;  // 4210
    uint128_t v475;  // 4212
    uint128_t v476;  // q10
    uint128_t v477;  // 4220
    uint128_t v478;  // 4222
    uint128_t v479;  // 4226
    uint128_t v57;  // 4280
    uint128_t v480;  // 4228
    uint128_t v481;  // 4232
    uint128_t v482;  // 4234
    uint128_t v483;  // 4235
    uint128_t v484;  // 4239
    uint128_t v485;  // 4241
    uint128_t v487;  // 4248
    uint128_t v488;  // 4250
    uint128_t v489;  // 4262
    __m128i v58;  // q14
    uint128_t v490;  // 4264
    unsigned long long *v491;  // x0
    uint128_t v492;  // q8
    long long v493;  // x5
    unsigned long long *v494;  // x0
    uint128_t v495;  // q4
    uint128_t v496;  // q5
    uint128_t v497;  // q11
    uint128_t v498;  // q9
    uint128_t v499;  // q10
    uint128_t v59;  // 4288
    unsigned long long *v500;  // x0
    uint128_t v502;  // q4
    uint128_t v503;  // q5
    uint128_t v505;  // 4123
    uint128_t v506;  // 4124
    uint128_t v507;  // 4125
    unsigned long long *v508;  // x0
    unsigned long long v15;  // d11
    uint128_t v60;  // 4290
    uint128_t v510;  // q4
    uint128_t v511;  // q5
    uint128_t v512;  // 4117
    uint128_t v513;  // 4119
    uint128_t v515;  // 4132
    uint128_t v517;  // q4
    uint128_t v518;  // 4114
    uint128_t v519;  // q22
    uint128_t v61;  // q25
    uint128_t v520;  // q22
    uint128_t v521;  // q5
    uint128_t v522;  // 4127
    uint128_t v523;  // 4128
    uint128_t v524;  // q18
    unsigned long long v525;  // x1
    uint128_t v526;  // x14
    unsigned long v527;  // cc_dep1
    uint128_t v528;  // x6
    unsigned long long v529;  // 4104
    st_a91640_2 *v62;  // x8
    unsigned long long v530;  // 4104
    uint128_t v531;  // x7
    uint128_t v532;  // q0
    uint128_t v533;  // q5
    uint128_t v535;  // q4
    uint128_t v536;  // 4106
    uint128_t v537;  // 4115
    uint128_t v538;  // q9
    uint128_t v63;  // 4298
    uint128_t v540;  // 4124
    uint128_t v541;  // q11
    unsigned long v542;  // d8
    uint128_t v543;  // 4141
    uint128_t v545;  // q10
    uint128_t v546;  // 4153
    uint128_t v547;  // q10
    uint128_t v549;  // q11
    uint128_t v64;  // 4300
    unsigned long v550;  // d0
    uint128_t v65;  // q26
    st_a91640_3 *v66;  // x8
    uint128_t v67;  // 4308
    uint128_t v68;  // 4310
    __m128i v69;  // q13
    unsigned long long v16;  // d12
    uint128_t v70;  // 4318
    uint128_t v71;  // 4320
    uint128_t v72;  // q27
    st_a91640_5 *v73;  // x8
    uint128_t v74;  // 4328
    uint128_t v75;  // 4330
    __m128i v76;  // q15
    uint128_t v77;  // 4338
    uint128_t v78;  // 4340
    uint128_t v79;  // q28
    unsigned long long v17;  // d13
    st_a91640_6 *v80;  // x8
    uint128_t v81;  // 4348
    uint128_t v82;  // 4350
    uint128_t v83;  // q29
    st_a91640_7 *v84;  // x8
    uint128_t v85;  // 4358
    uint128_t v86;  // 4360
    unsigned long v87;  // x12
    uint128_t v88;  // 4367
    uint128_t v89;  // 4369
    unsigned long long v18;  // d14
    uint128_t v90;  // 4373
    uint128_t v91;  // 4375
    uint128_t v92;  // q11
    uint128_t v93;  // q11
    uint128_t v94;  // 4386
    uint128_t v95;  // 4388
    uint128_t v96;  // 4392
    uint128_t v97;  // 4394
    uint128_t v98;  // 4398
    uint128_t v99;  // 4400
    unsigned long long v19;  // d15
    uint128_t v100;  // 4404
    uint128_t v101;  // 4406
    uint128_t v102;  // 4099
    uint128_t v103;  // 4101
    uint128_t v104;  // 4105
    uint128_t v105;  // 4107
    uint128_t v106;  // 4111
    uint128_t v107;  // 4113
    uint128_t v108;  // 4117
    uint128_t v109;  // 4119
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
        return v550;
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
    v21 = a5->field_e0;
    v22 = a5->field_e8;
    v23 = a5->field_0;
    v24 = &a5->field_10;
    v25 = v24->field_0;
    v26 = &v24->field_10;
    v27 = ((a1 >> 3) - 1 & 0xffffffffffffffc0) + (char *)a0;
    v28 = (unsigned long long)((long long)a4[8]) >> 32;
    v29 = (long long)a4[8] & 0xffffffff;
    v30 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((*(int128_t *)a4 ^ v23) >> 64), (long long)*(int128_t *)a4 ^ (unsigned long long)v23);
    v31 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v30 >> 64), (unsigned long long)v30);
    v32 = (unsigned int)((((((v28 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v28 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v28 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v28 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) + 1;
    v33 = (unsigned int)v32 + 1;
    v34 = v26->field_0;
    v35 = &v26->field_10;
    v36 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v29 | ((((((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v37 = (unsigned int)v33 + 1;
    v38 = v35->field_0;
    v39 = &v35->field_10;
    v40 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v29 | ((((((v33 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v33 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v33 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v33 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v41 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v25) >> 64), (unsigned long long)v31 ^ (unsigned long long)v25);
    v42 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v41 >> 64), (unsigned long long)v41);
    v43 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v29 | ((((((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
    v44 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v36 ^ v23) >> 64), (unsigned long long)v36 ^ (unsigned long long)v23);
    v45 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v44 >> 64), (unsigned long long)v44);
    v46 = v39->field_0;
    v47 = &v39->field_10;
    v48 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v42 ^ v34) >> 64), (unsigned long long)v42 ^ (unsigned long long)v34);
    v49 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v48 >> 64), (unsigned long long)v48);
    v50 = v47->field_0;
    v51 = &v47->field_10;
    v52 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v40 ^ v23) >> 64), (unsigned long long)v40 ^ (unsigned long long)v23);
    v53 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v52 >> 64), (unsigned long long)v52);
    v54 = v51->field_0;
    v55 = &v51->field_10;
    v56 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v45 ^ v25) >> 64), (unsigned long long)v45 ^ (unsigned long long)v25);
    v57 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v56 >> 64), (unsigned long long)v56);
    v58 = __dirty_unsupported_Iop_SliceV128(a3[5], a3[5], 8);
    v59 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v43 ^ v23) >> 64), (unsigned long long)v43 ^ (unsigned long long)v23);
    v60 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v59 >> 64), (unsigned long long)v59);
    v61 = v55->field_0;
    v62 = &v55->field_10;
    v63 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v53 ^ v25) >> 64), (unsigned long long)v53 ^ (unsigned long long)v25);
    v64 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v63 >> 64), (unsigned long long)v63);
    v65 = v62->field_0;
    v66 = &v62->field_10;
    v67 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v57 ^ v34) >> 64), (unsigned long long)v57 ^ (unsigned long long)v34);
    v68 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v67 >> 64), (unsigned long long)v67);
    v69 = __dirty_unsupported_Iop_SliceV128(a3[4], a3[4], 8);
    v70 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v60 ^ v25) >> 64), (unsigned long long)v60 ^ (unsigned long long)v25);
    v71 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v70 >> 64), (unsigned long long)v70);
    v72 = v66->field_0;
    v73 = &v66->field_10;
    v74 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v64 ^ v34) >> 64), (unsigned long long)v64 ^ (unsigned long long)v34);
    v75 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v74 >> 64), (unsigned long long)v74);
    v76 = __dirty_unsupported_Iop_SliceV128(a3[7], a3[7], 8);
    v77 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v68 ^ v38) >> 64), (unsigned long long)v68 ^ (unsigned long long)v38);
    v78 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v77 >> 64), (unsigned long long)v77);
    v79 = v73->field_0;
    v80 = &v73->field_10;
    v81 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v71 ^ v34) >> 64), (unsigned long long)v71 ^ (unsigned long long)v34);
    v82 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v81 >> 64), (unsigned long long)v81);
    v83 = v80->field_0;
    v84 = &v80->field_10;
    v85 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v75 ^ v38) >> 64), (unsigned long long)v75 ^ (unsigned long long)v38);
    v86 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v85 >> 64), (unsigned long long)v85);
    v87 = (unsigned int)v37 + 1;
    v88 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v49 ^ v38) >> 64), (unsigned long long)v49 ^ (unsigned long long)v38);
    v89 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v88 >> 64), (unsigned long long)v88);
    v90 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v82 ^ v38) >> 64), (unsigned long long)v82 ^ (unsigned long long)v38);
    v91 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v90 >> 64), (unsigned long long)v90);
    v92 = __dirty_unsupported_Iop_SliceV128(*a3, *a3, 8);
    v93 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v92);
    v94 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v86 ^ v46) >> 64), (unsigned long long)v86 ^ (unsigned long long)v46);
    v95 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v94 >> 64), (unsigned long long)v94);
    v96 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v89 ^ v46) >> 64), (unsigned long long)v89 ^ (unsigned long long)v46);
    v97 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v96 >> 64), (unsigned long long)v96);
    v98 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v78 ^ v46) >> 64), (unsigned long long)v78 ^ (unsigned long long)v46);
    v99 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v98 >> 64), (unsigned long long)v98);
    v100 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v91 ^ v46) >> 64), (unsigned long long)v91 ^ (unsigned long long)v46);
    v101 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v100 >> 64), (unsigned long long)v100);
    v102 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v97 ^ v50) >> 64), (unsigned long long)v97 ^ (unsigned long long)v50);
    v103 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v102 >> 64), (unsigned long long)v102);
    v104 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v99 ^ v50) >> 64), (unsigned long long)v99 ^ (unsigned long long)v50);
    v105 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v104 >> 64), (unsigned long long)v104);
    v106 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v101 ^ v50) >> 64), (unsigned long long)v101 ^ (unsigned long long)v50);
    v107 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v106 >> 64), (unsigned long long)v106);
    v108 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v95 ^ v50) >> 64), (unsigned long long)v95 ^ (unsigned long long)v50);
    v109 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v108 >> 64), (unsigned long long)v108);
    v110 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v105 ^ v54) >> 64), (unsigned long long)v105 ^ (unsigned long long)v54);
    v111 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v110 >> 64), (unsigned long long)v110);
    v112 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v107 ^ v54) >> 64), (unsigned long long)v107 ^ (unsigned long long)v54);
    v113 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v112 >> 64), (unsigned long long)v112);
    v114 = v84->field_0;
    v115 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v103 ^ v54) >> 64), (unsigned long long)v103 ^ (unsigned long long)v54);
    v116 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v115 >> 64), (unsigned long long)v115);
    v117 = __dirty_unsupported_Iop_SliceV128(a3[2], a3[2], 8);
    v118 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v109 ^ v54) >> 64), (unsigned long long)v109 ^ (unsigned long long)v54);
    v119 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v118 >> 64), (unsigned long long)v118);
    v120 = v84->field_10;
    v121 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v111 ^ v61) >> 64), (unsigned long long)v111 ^ (unsigned long long)v61);
    v122 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v121 >> 64), (unsigned long long)v121);
    v123 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v116 ^ v61) >> 64), (unsigned long long)v116 ^ (unsigned long long)v61);
    v124 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v123 >> 64), (unsigned long long)v123);
    v125 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v119 ^ v61) >> 64), (unsigned long long)v119 ^ (unsigned long long)v61);
    v126 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v125 >> 64), (unsigned long long)v125);
    v127 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v113 ^ v61) >> 64), (unsigned long long)v113 ^ (unsigned long long)v61);
    v128 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v127 >> 64), (unsigned long long)v127);
    v129 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v122 ^ v65) >> 64), (unsigned long long)v122 ^ (unsigned long long)v65);
    v130 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v129 >> 64), (unsigned long long)v129);
    v131 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v126 ^ v65) >> 64), (unsigned long long)v126 ^ (unsigned long long)v65);
    v132 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v131 >> 64), (unsigned long long)v131);
    v133 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v128 ^ v65) >> 64), (unsigned long long)v128 ^ (unsigned long long)v65);
    v134 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v133 >> 64), (unsigned long long)v133);
    v135 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v130 ^ v72) >> 64), (unsigned long long)v130 ^ (unsigned long long)v72);
    v136 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v135 >> 64), (unsigned long long)v135);
    v137 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v132 ^ v72) >> 64), (unsigned long long)v132 ^ (unsigned long long)v72);
    v138 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v137 >> 64), (unsigned long long)v137);
    v139 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v124 ^ v65) >> 64), (unsigned long long)v124 ^ (unsigned long long)v65);
    v140 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v139 >> 64), (unsigned long long)v139);
    v141 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v136 ^ v79) >> 64), (unsigned long long)v136 ^ (unsigned long long)v79);
    v142 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v141 >> 64), (unsigned long long)v141);
    v143 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v134 ^ v72) >> 64), (unsigned long long)v134 ^ (unsigned long long)v72);
    v144 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v143 >> 64), (unsigned long long)v143);
    v145 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v140 ^ v72) >> 64), (unsigned long long)v140 ^ (unsigned long long)v72);
    v146 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v145 >> 64), (unsigned long long)v145);
    v147 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v138 ^ v79) >> 64), (unsigned long long)v138 ^ (unsigned long long)v79);
    v148 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v147 >> 64), (unsigned long long)v147);
    v149 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v144 ^ v79) >> 64), (unsigned long long)v144 ^ (unsigned long long)v79);
    v150 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v149 >> 64), (unsigned long long)v149);
    v151 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v142 ^ v83) >> 64), (unsigned long long)v142 ^ (unsigned long long)v83);
    v152 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v151 >> 64), (unsigned long long)v151);
    v153 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v148 ^ v83) >> 64), (unsigned long long)v148 ^ (unsigned long long)v83);
    v154 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v153 >> 64), (unsigned long long)v153);
    v155 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v146 ^ v79) >> 64), (unsigned long long)v146 ^ (unsigned long long)v79);
    v156 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v155 >> 64), (unsigned long long)v155);
    v157 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v152 ^ v114) >> 64), (unsigned long long)v152 ^ (unsigned long long)v114);
    v158 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v157 >> 64), (unsigned long long)v157);
    v159 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v154 ^ v114) >> 64), (unsigned long long)v154 ^ (unsigned long long)v114);
    v160 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v159 >> 64), (unsigned long long)v159);
    v161 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v156 ^ v83) >> 64), (unsigned long long)v156 ^ (unsigned long long)v83);
    v162 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v161 >> 64), (unsigned long long)v161);
    v163 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v58, v58), _mm_unpacklo_epi64(v76, v76)), _mm_unpackhi_epi64(_mm_unpackhi_epi64(v58, v58), _mm_unpackhi_epi64(v76, v76)));
    v164 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v150 ^ v83) >> 64), (unsigned long long)v150 ^ (unsigned long long)v83);
    v165 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v164 >> 64), (unsigned long long)v164);
    v166 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v160 ^ v120) >> 64), (unsigned long long)v160 ^ (unsigned long long)v120);
    v167 = v166;
    v168 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v162 ^ v114) >> 64), (unsigned long long)v162 ^ (unsigned long long)v114);
    v169 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v168 >> 64), (unsigned long long)v168);
    v170 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v165 ^ v114) >> 64), (unsigned long long)v165 ^ (unsigned long long)v114);
    v171 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v170 >> 64), (unsigned long long)v170);
    v172 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v158 ^ v120) >> 64), (unsigned long long)v158 ^ (unsigned long long)v120);
    v173 = v172;
    v174 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v169 ^ v120) >> 64), (unsigned long long)v169 ^ (unsigned long long)v120);
    v175 = v174;
    v176 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v171 ^ v120) >> 64), (unsigned long long)v171 ^ (unsigned long long)v120);
    v177 = v176;
    v178 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v117, v117), _mm_unpacklo_epi64(v69, v69)), _mm_unpackhi_epi64(_mm_unpackhi_epi64(v117, v117), _mm_unpackhi_epi64(v69, v69)));
    v179 = arm64g_calculate_condition(164, a0, v27, 0);
    v180 = a0;
    if (!(v179 & 1))
    {
        v181 = a0[7];
        v182 = a0 + 8;
        v183 = _INSERT(__double_as_longlong(__longlong_as_double(*a0 ^ v21)), 8, a0[1] ^ v22);
        v184 = a0[6] ^ v21;
        v185 = _INSERT(__double_as_longlong(__longlong_as_double(a0[2] ^ v21)), 8, a0[3] ^ v22);
        v186 = (unsigned int)v87 + 1;
        v187 = _INSERT(__double_as_longlong(__longlong_as_double(a0[4] ^ v21)), 8, a0[5] ^ v22);
        v188 = v175 ^ v183;
        v189 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v29 | ((((((v87 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v87 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v87 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v87 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        v190 = (unsigned int)v186 + 1;
        v191 = v173 ^ v185;
        v192 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v29 | ((((((v186 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v186 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v186 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v186 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        *iter = v188;
        v193 = iter + 1;
        v194 = _INSERT(__double_as_longlong(__longlong_as_double(v184)), 8, v181 ^ v22);
        v195 = v167 ^ v187;
        *v193 = v191;
        v196 = v193 + 1;
        v197 = (unsigned int)v190 + 1;
        v198 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v29 | ((((((v190 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v190 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v190 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v190 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
        *v196 = v195;
        v199 = v196 + 1;
        v200 = v29 | ((((((v197 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v197 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v197 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v197 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000;
        v201 = v177 ^ v194;
        *v199 = v201;
        iter = v199 + 1;
        v180 = v182;
        if (v27 > v180)
        {
            do
            {
                v202 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v189 ^ v23) >> 64), (unsigned long long)v189 ^ (unsigned long long)v23);
                v203 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v202 >> 64), (unsigned long long)v202);
                v204 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v188);
                v205 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v192 ^ v23) >> 64), (unsigned long long)v192 ^ (unsigned long long)v23);
                v206 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v205 >> 64), (unsigned long long)v205);
                v207 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v198 ^ v23) >> 64), (unsigned long long)v198 ^ (unsigned long long)v23);
                v208 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v207 >> 64), (unsigned long long)v207);
                v209 = __dirty_unsupported_Iop_SliceV128(v93, v93, 8);
                v210 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v203 ^ v25) >> 64), (unsigned long long)v203 ^ (unsigned long long)v25);
                v211 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v210 >> 64), (unsigned long long)v210);
                v212 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v200);
                v213 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v206 ^ v25) >> 64), (unsigned long long)v206 ^ (unsigned long long)v25);
                v214 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v213 >> 64), (unsigned long long)v213);
                v215 = v182[7];
                v216 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v208 ^ v25) >> 64), (unsigned long long)v208 ^ (unsigned long long)v25);
                v217 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v216 >> 64), (unsigned long long)v216);
                v218 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v211 ^ v34) >> 64), (unsigned long long)v211 ^ (unsigned long long)v34);
                v219 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v218 >> 64), (unsigned long long)v218);
                v220 = v209 ^ v204;
                v221 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v214 ^ v34) >> 64), (unsigned long long)v214 ^ (unsigned long long)v34);
                v222 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v221 >> 64), (unsigned long long)v221);
                v223 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v212 ^ v23) >> 64), (unsigned long long)v212 ^ (unsigned long long)v23);
                v224 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v223 >> 64), (unsigned long long)v223);
                v225 = v182[6] ^ v21;
                v226 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v219 ^ v38) >> 64), (unsigned long long)v219 ^ (unsigned long long)v38);
                v227 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v226 >> 64), (unsigned long long)v226);
                v228 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v220 >> 64), _mm_extract_epi64(v76, 1));
                v229 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v224 ^ v25) >> 64), (unsigned long long)v224 ^ (unsigned long long)v25);
                v230 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v229 >> 64), (unsigned long long)v229);
                v231 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v191);
                v232 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v227 ^ v46) >> 64), (unsigned long long)v227 ^ (unsigned long long)v46);
                v233 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v232 >> 64), (unsigned long long)v232);
                v234 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v220, _mm_cvtsi128_si64(v76));
                v236 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v217 ^ v34) >> 64), (unsigned long long)v217 ^ (unsigned long long)v34);
                v237 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v236 >> 64), (unsigned long long)v236);
                v238 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v233 ^ v50) >> 64), (unsigned long long)v233 ^ (unsigned long long)v50);
                v239 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v238 >> 64), (unsigned long long)v238);
                v240 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v201);
                v241 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v231 >> 64), _mm_extract_epi64(v58, 1));
                v242 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v220 ^ *(unsigned long long *)((void*)&v220 + 8)), _mm_extract_epi64(v163, 1));
                v243 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v195);
                v244 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v231, _mm_cvtsi128_si64(v58));
                v245 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v222 ^ v38) >> 64), (unsigned long long)v222 ^ (unsigned long long)v38);
                v246 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v245 >> 64), (unsigned long long)v245);
                v247 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v230 ^ v34) >> 64), (unsigned long long)v230 ^ (unsigned long long)v34);
                v248 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v247 >> 64), (unsigned long long)v247);
                v249 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v237 ^ v38) >> 64), (unsigned long long)v237 ^ (unsigned long long)v38);
                v250 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v249 >> 64), (unsigned long long)v249);
                v251 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v246 ^ v46) >> 64), (unsigned long long)v246 ^ (unsigned long long)v46);
                v252 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v251 >> 64), (unsigned long long)v251);
                v253 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v248 ^ v38) >> 64), (unsigned long long)v248 ^ (unsigned long long)v38);
                v254 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v253 >> 64), (unsigned long long)v253);
                v256 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v250 ^ v46) >> 64), (unsigned long long)v250 ^ (unsigned long long)v46);
                v257 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v256 >> 64), (unsigned long long)v256);
                v258 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v239 ^ v54) >> 64), (unsigned long long)v239 ^ (unsigned long long)v54);
                v259 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v258 >> 64), (unsigned long long)v258);
                v260 = __dirty_unsupported_Iop_ZeroHI64ofV128(v243 ^ *(unsigned long long *)((void*)&v243 + 8));
                v261 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v254 ^ v46) >> 64), (unsigned long long)v254 ^ (unsigned long long)v46);
                v262 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v261 >> 64), (unsigned long long)v261);
                v263 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v231 ^ *(unsigned long long *)((void*)&v231 + 8)), _mm_cvtsi128_si64(v163));
                v264 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v259 ^ v61) >> 64), (unsigned long long)v259 ^ (unsigned long long)v61);
                v265 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v264 >> 64), (unsigned long long)v264);
                v266 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v262 ^ v50) >> 64), (unsigned long long)v262 ^ (unsigned long long)v50);
                v267 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v266 >> 64), (unsigned long long)v266);
                v269 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v252 ^ v50) >> 64), (unsigned long long)v252 ^ (unsigned long long)v50);
                v270 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v269 >> 64), (unsigned long long)v269);
                v271 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v265 ^ v65) >> 64), (unsigned long long)v265 ^ (unsigned long long)v65);
                v272 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v271 >> 64), (unsigned long long)v271);
                v273 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v257 ^ v50) >> 64), (unsigned long long)v257 ^ (unsigned long long)v50);
                v274 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v273 >> 64), (unsigned long long)v273);
                v275 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v270 ^ v54) >> 64), (unsigned long long)v270 ^ (unsigned long long)v54);
                v276 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v275 >> 64), (unsigned long long)v275);
                v277 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v243 >> 64), _mm_extract_epi64(v69, 1));
                v278 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v243, _mm_cvtsi128_si64(v69));
                v279 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v276 ^ v61) >> 64), (unsigned long long)v276 ^ (unsigned long long)v61);
                v280 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v279 >> 64), (unsigned long long)v279);
                v281 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v240, _mm_cvtsi128_si64(v117));
                v282 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v267 ^ v54) >> 64), (unsigned long long)v267 ^ (unsigned long long)v54);
                v283 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v282 >> 64), (unsigned long long)v282);
                v284 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v280 ^ v65) >> 64), (unsigned long long)v280 ^ (unsigned long long)v65);
                v285 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v284 >> 64), (unsigned long long)v284);
                v286 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v274 ^ v54) >> 64), (unsigned long long)v274 ^ (unsigned long long)v54);
                v287 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v286 >> 64), (unsigned long long)v286);
                v288 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v260, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v260) >> 64, _mm_extract_epi64(v178, 1));
                v289 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v240 >> 64), _mm_extract_epi64(v117, 1));
                v291 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v287 ^ v61) >> 64), (unsigned long long)v287 ^ (unsigned long long)v61);
                v292 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v291 >> 64), (unsigned long long)v291);
                v293 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v285 ^ v72) >> 64), (unsigned long long)v285 ^ (unsigned long long)v72);
                v294 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v293 >> 64), (unsigned long long)v293);
                v295 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v283 ^ v61) >> 64), (unsigned long long)v283 ^ (unsigned long long)v61);
                v296 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v295 >> 64), (unsigned long long)v295);
                v297 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v272 ^ v72) >> 64), (unsigned long long)v272 ^ (unsigned long long)v72);
                v298 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v297 >> 64), (unsigned long long)v297);
                v299 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v240 ^ *(unsigned long long *)((void*)&v240 + 8)), _mm_cvtsi128_si64(v178));
                v300 = v289 ^ v277 ^ v241 ^ v228;
                v301 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v292 ^ v65) >> 64), (unsigned long long)v292 ^ (unsigned long long)v65);
                v302 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v301 >> 64), (unsigned long long)v301);
                v303 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v298 ^ v79) >> 64), (unsigned long long)v298 ^ (unsigned long long)v79);
                v304 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v303 >> 64), (unsigned long long)v303);
                v305 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
                v306 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v296 ^ v65) >> 64), (unsigned long long)v296 ^ (unsigned long long)v65);
                v307 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v306 >> 64), (unsigned long long)v306);
                v308 = v281 ^ v278 ^ v244 ^ v234;
                v309 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v302 ^ v72) >> 64), (unsigned long long)v302 ^ (unsigned long long)v72);
                v310 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v309 >> 64), (unsigned long long)v309);
                v311 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v294 ^ v79) >> 64), (unsigned long long)v294 ^ (unsigned long long)v79);
                v312 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v311 >> 64), (unsigned long long)v311);
                v313 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v307 ^ v72) >> 64), (unsigned long long)v307 ^ (unsigned long long)v72);
                v314 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v313 >> 64), (unsigned long long)v313);
                v315 = (unsigned int)v197 + 1;
                v316 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v304 ^ v83) >> 64), (unsigned long long)v304 ^ (unsigned long long)v83);
                v317 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v316 >> 64), (unsigned long long)v316);
                v318 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v312 ^ v83) >> 64), (unsigned long long)v312 ^ (unsigned long long)v83);
                v319 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v318 >> 64), (unsigned long long)v318);
                v180 = v182 + 8;
                v320 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v300, v305);
                v321 = __dirty_unsupported_Iop_SliceV128(v300, v300, 8);
                v322 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v310 ^ v79) >> 64), (unsigned long long)v310 ^ (unsigned long long)v79);
                v323 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v322 >> 64), (unsigned long long)v322);
                v324 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v319 ^ v114) >> 64), (unsigned long long)v319 ^ (unsigned long long)v114);
                v325 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v324 >> 64), (unsigned long long)v324);
                v326 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v314 ^ v79) >> 64), (unsigned long long)v314 ^ (unsigned long long)v79);
                v327 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v326 >> 64), (unsigned long long)v326);
                v328 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v317 ^ v114) >> 64), (unsigned long long)v317 ^ (unsigned long long)v114);
                v329 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v328 >> 64), (unsigned long long)v328);
                v330 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v323 ^ v83) >> 64), (unsigned long long)v323 ^ (unsigned long long)v83);
                v331 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v330 >> 64), (unsigned long long)v330);
                v332 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v327 ^ v83) >> 64), (unsigned long long)v327 ^ (unsigned long long)v83);
                v333 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v332 >> 64), (unsigned long long)v332);
                v334 = (unsigned int)v315 + 1;
                v335 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v329 ^ v120) >> 64), (unsigned long long)v329 ^ (unsigned long long)v120);
                v336 = _INSERT(__double_as_longlong(__longlong_as_double(*v182 ^ v21)), 8, v182[1] ^ v22);
                v337 = v320 ^ v321 ^ v300 ^ v308 ^ v299 ^ v288 ^ v263 ^ v242;
                v338 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v331 ^ v114) >> 64), (unsigned long long)v331 ^ (unsigned long long)v114);
                v339 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v338 >> 64), (unsigned long long)v338);
                v340 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v325 ^ v120) >> 64), (unsigned long long)v325 ^ (unsigned long long)v120);
                v341 = _INSERT(__double_as_longlong(__longlong_as_double(v182[2] ^ v21)), 8, v182[3] ^ v22);
                v342 = _INSERT(__double_as_longlong(__longlong_as_double(v182[4] ^ v21)), 8, v182[5] ^ v22);
                v343 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v337, v305);
                v188 = v335 ^ v336;
                v189 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v29 | ((((((v315 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v315 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v315 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v315 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v344 = (unsigned int)v334 + 1;
                v191 = v340 ^ v341;
                v345 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v333 ^ v114) >> 64), (unsigned long long)v333 ^ (unsigned long long)v114);
                v346 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v345 >> 64), (unsigned long long)v345);
                v192 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v29 | ((((((v334 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v334 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v334 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v334 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v347 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v339 ^ v120) >> 64), (unsigned long long)v339 ^ (unsigned long long)v120);
                *iter = v188;
                v348 = iter + 1;
                v349 = _INSERT(__double_as_longlong(__longlong_as_double(v225)), 8, v215 ^ v22);
                v350 = __dirty_unsupported_Iop_SliceV128(v337, v337, 8);
                *v348 = v191;
                v351 = v348 + 1;
                v197 = (unsigned int)v344 + 1;
                v352 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v346 ^ v120) >> 64), (unsigned long long)v346 ^ (unsigned long long)v120);
                v195 = v347 ^ v342;
                *v351 = v195;
                v353 = v351 + 1;
                v198 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v29 | ((((((v344 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v344 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v344 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v344 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000);
                v93 = v350 ^ v343 ^ v308;
                v200 = v29 | ((((((v197 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v197 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v197 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v197 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) * 0x100000000;
                v201 = v352 ^ v349;
                *v353 = v201;
                iter = v353 + 1;
                v354 = arm64g_calculate_condition(180, v180, v27, 0);
                v182 = v180;
            } while (v354 & 1);
        }
        v355 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v192 ^ v23) >> 64), (unsigned long long)v192 ^ (unsigned long long)v23);
        v356 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v355 >> 64), (unsigned long long)v355);
        v357 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v195);
        v358 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v198 ^ v23) >> 64), (unsigned long long)v198 ^ (unsigned long long)v23);
        v359 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v358 >> 64), (unsigned long long)v358);
        v360 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v189 ^ v23) >> 64), (unsigned long long)v189 ^ (unsigned long long)v23);
        v361 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v360 >> 64), (unsigned long long)v360);
        v363 = _INSERT(__double_as_longlong(__longlong_as_double(v20)), 8, v200);
        v365 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v359 ^ v25) >> 64), (unsigned long long)v359 ^ (unsigned long long)v25);
        v366 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v365 >> 64), (unsigned long long)v365);
        v367 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v361 ^ v25) >> 64), (unsigned long long)v361 ^ (unsigned long long)v25);
        v368 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v367 >> 64), (unsigned long long)v367);
        v369 = __dirty_unsupported_Iop_SliceV128(v93, v93, 8) ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v188);
        v370 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v191);
        v371 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v366 ^ v34) >> 64), (unsigned long long)v366 ^ (unsigned long long)v34);
        v372 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v371 >> 64), (unsigned long long)v371);
        v373 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v363 ^ v23) >> 64), (unsigned long long)v363 ^ (unsigned long long)v23);
        v374 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v373 >> 64), (unsigned long long)v373);
        v375 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v356 ^ v25) >> 64), (unsigned long long)v356 ^ (unsigned long long)v25);
        v376 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v375 >> 64), (unsigned long long)v375);
        v377 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v369, _mm_cvtsi128_si64(v76));
        v378 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v369 >> 64), _mm_extract_epi64(v76, 1));
        v379 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v372 ^ v38) >> 64), (unsigned long long)v372 ^ (unsigned long long)v38);
        v380 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v379 >> 64), (unsigned long long)v379);
        v381 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v376 ^ v34) >> 64), (unsigned long long)v376 ^ (unsigned long long)v34);
        v382 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v381 >> 64), (unsigned long long)v381);
        v384 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v368 ^ v34) >> 64), (unsigned long long)v368 ^ (unsigned long long)v34);
        v385 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v384 >> 64), (unsigned long long)v384);
        v386 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v374 ^ v25) >> 64), (unsigned long long)v374 ^ (unsigned long long)v25);
        v387 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v386 >> 64), (unsigned long long)v386);
        v388 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v382 ^ v38) >> 64), (unsigned long long)v382 ^ (unsigned long long)v38);
        v389 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v388 >> 64), (unsigned long long)v388);
        v390 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v369 ^ *(unsigned long long *)((void*)&v369 + 8)), _mm_extract_epi64(v163, 1));
        v391 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v370 >> 64), _mm_extract_epi64(v58, 1));
        v392 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v370, _mm_cvtsi128_si64(v58));
        v393 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v387 ^ v34) >> 64), (unsigned long long)v387 ^ (unsigned long long)v34);
        v394 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v393 >> 64), (unsigned long long)v393);
        v395 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v385 ^ v38) >> 64), (unsigned long long)v385 ^ (unsigned long long)v38);
        v396 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v395 >> 64), (unsigned long long)v395);
        v397 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v394 ^ v38) >> 64), (unsigned long long)v394 ^ (unsigned long long)v38);
        v398 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v397 >> 64), (unsigned long long)v397);
        v400 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v396 ^ v46) >> 64), (unsigned long long)v396 ^ (unsigned long long)v46);
        v401 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v400 >> 64), (unsigned long long)v400);
        v402 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v201);
        v403 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v398 ^ v46) >> 64), (unsigned long long)v398 ^ (unsigned long long)v46);
        v404 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v403 >> 64), (unsigned long long)v403);
        v405 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v370 ^ *(unsigned long long *)((void*)&v370 + 8)), _mm_cvtsi128_si64(v163));
        v406 = __dirty_unsupported_Iop_ZeroHI64ofV128(v357 ^ *(unsigned long long *)((void*)&v357 + 8));
        v87 = (unsigned int)v197 + 1;
        v407 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v357, _mm_cvtsi128_si64(v69));
        v408 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v404 ^ v50) >> 64), (unsigned long long)v404 ^ (unsigned long long)v50);
        v409 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v408 >> 64), (unsigned long long)v408);
        v410 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v380 ^ v46) >> 64), (unsigned long long)v380 ^ (unsigned long long)v46);
        v411 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v410 >> 64), (unsigned long long)v410);
        v412 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v357 >> 64), _mm_extract_epi64(v69, 1));
        v414 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v411 ^ v50) >> 64), (unsigned long long)v411 ^ (unsigned long long)v50);
        v415 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v414 >> 64), (unsigned long long)v414);
        v416 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v389 ^ v46) >> 64), (unsigned long long)v389 ^ (unsigned long long)v46);
        v417 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v416 >> 64), (unsigned long long)v416);
        v418 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _INSERT(v406, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v406) >> 64, _mm_extract_epi64(v178, 1));
        v420 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v402 >> 64), _mm_extract_epi64(v117, 1));
        v421 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v417 ^ v50) >> 64), (unsigned long long)v417 ^ (unsigned long long)v50);
        v422 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v421 >> 64), (unsigned long long)v421);
        v423 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v402 ^ *(unsigned long long *)((void*)&v402 + 8)), _mm_cvtsi128_si64(v178));
        v424 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v401 ^ v50) >> 64), (unsigned long long)v401 ^ (unsigned long long)v50);
        v425 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v424 >> 64), (unsigned long long)v424);
        v426 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v422 ^ v54) >> 64), (unsigned long long)v422 ^ (unsigned long long)v54);
        v427 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v426 >> 64), (unsigned long long)v426);
        v428 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v415 ^ v54) >> 64), (unsigned long long)v415 ^ (unsigned long long)v54);
        v429 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v428 >> 64), (unsigned long long)v428);
        v430 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v425 ^ v54) >> 64), (unsigned long long)v425 ^ (unsigned long long)v54);
        v431 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v430 >> 64), (unsigned long long)v430);
        v432 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v409 ^ v54) >> 64), (unsigned long long)v409 ^ (unsigned long long)v54);
        v433 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v432 >> 64), (unsigned long long)v432);
        v434 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v427 ^ v61) >> 64), (unsigned long long)v427 ^ (unsigned long long)v61);
        v435 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v434 >> 64), (unsigned long long)v434);
        v436 = v420 ^ v412 ^ v391 ^ v378;
        v437 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v431 ^ v61) >> 64), (unsigned long long)v431 ^ (unsigned long long)v61);
        v438 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v437 >> 64), (unsigned long long)v437);
        v439 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v433 ^ v61) >> 64), (unsigned long long)v433 ^ (unsigned long long)v61);
        v440 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v439 >> 64), (unsigned long long)v439);
        v441 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
        v442 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v435 ^ v65) >> 64), (unsigned long long)v435 ^ (unsigned long long)v65);
        v443 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v442 >> 64), (unsigned long long)v442);
        v444 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v402, _mm_cvtsi128_si64(v117));
        v445 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v440 ^ v65) >> 64), (unsigned long long)v440 ^ (unsigned long long)v65);
        v446 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v445 >> 64), (unsigned long long)v445);
        v447 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v443 ^ v72) >> 64), (unsigned long long)v443 ^ (unsigned long long)v72);
        v448 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v447 >> 64), (unsigned long long)v447);
        v449 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v438 ^ v65) >> 64), (unsigned long long)v438 ^ (unsigned long long)v65);
        v450 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v449 >> 64), (unsigned long long)v449);
        v451 = v444 ^ v407 ^ v392 ^ v377;
        v452 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v446 ^ v72) >> 64), (unsigned long long)v446 ^ (unsigned long long)v72);
        v453 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v452 >> 64), (unsigned long long)v452);
        v454 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v436, v441);
        v456 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v453 ^ v79) >> 64), (unsigned long long)v453 ^ (unsigned long long)v79);
        v457 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v456 >> 64), (unsigned long long)v456);
        v458 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v429 ^ v61) >> 64), (unsigned long long)v429 ^ (unsigned long long)v61);
        v459 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v458 >> 64), (unsigned long long)v458);
        v460 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v448 ^ v79) >> 64), (unsigned long long)v448 ^ (unsigned long long)v79);
        v461 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v460 >> 64), (unsigned long long)v460);
        v462 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v450 ^ v72) >> 64), (unsigned long long)v450 ^ (unsigned long long)v72);
        v463 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v462 >> 64), (unsigned long long)v462);
        v464 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v459 ^ v65) >> 64), (unsigned long long)v459 ^ (unsigned long long)v65);
        v465 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v464 >> 64), (unsigned long long)v464);
        v466 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v461 ^ v83) >> 64), (unsigned long long)v461 ^ (unsigned long long)v83);
        v467 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v466 >> 64), (unsigned long long)v466);
        v468 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v463 ^ v79) >> 64), (unsigned long long)v463 ^ (unsigned long long)v79);
        v469 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v468 >> 64), (unsigned long long)v468);
        v470 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v465 ^ v72) >> 64), (unsigned long long)v465 ^ (unsigned long long)v72);
        v471 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v470 >> 64), (unsigned long long)v470);
        v472 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v467 ^ v114) >> 64), (unsigned long long)v467 ^ (unsigned long long)v114);
        v473 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v472 >> 64), (unsigned long long)v472);
        v474 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v469 ^ v83) >> 64), (unsigned long long)v469 ^ (unsigned long long)v83);
        v475 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v474 >> 64), (unsigned long long)v474);
        v476 = __dirty_unsupported_Iop_SliceV128(v436, v436, 8) ^ v454 ^ v451 ^ v436 ^ v423 ^ v418 ^ v405 ^ v390;
        v477 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v457 ^ v83) >> 64), (unsigned long long)v457 ^ (unsigned long long)v83);
        v478 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v477 >> 64), (unsigned long long)v477);
        v479 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v471 ^ v79) >> 64), (unsigned long long)v471 ^ (unsigned long long)v79);
        v480 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v479 >> 64), (unsigned long long)v479);
        v481 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v475 ^ v114) >> 64), (unsigned long long)v475 ^ (unsigned long long)v114);
        v482 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v481 >> 64), (unsigned long long)v481);
        v483 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v476, v441);
        v484 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v480 ^ v83) >> 64), (unsigned long long)v480 ^ (unsigned long long)v83);
        v485 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v484 >> 64), (unsigned long long)v484);
        v487 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v478 ^ v114) >> 64), (unsigned long long)v478 ^ (unsigned long long)v114);
        v488 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v487 >> 64), (unsigned long long)v487);
        v173 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v473 ^ v120) >> 64), (unsigned long long)v473 ^ (unsigned long long)v120);
        v489 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v485 ^ v114) >> 64), (unsigned long long)v485 ^ (unsigned long long)v114);
        v490 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v489 >> 64), (unsigned long long)v489);
        v177 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v488 ^ v120) >> 64), (unsigned long long)v488 ^ (unsigned long long)v120);
        v175 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v482 ^ v120) >> 64), (unsigned long long)v482 ^ (unsigned long long)v120);
        v167 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v490 ^ v120) >> 64), (unsigned long long)v490 ^ (unsigned long long)v120);
        v93 = __dirty_unsupported_Iop_SliceV128(v476, v476, 8) ^ v483 ^ v451;
    }
    v491 = v180;
    v492 = __dirty_unsupported_Iop_SliceV128(v93, v93, 8);
    v493 = (char *)a0 + (a1 >> 3) - v491;
    v494 = v491 + 2;
    v495 = _INSERT(__double_as_longlong(__longlong_as_double(*v491 ^ v21)), 8, v491[1] ^ v22);
    v496 = v175 ^ v495;
    if (48 >= v493)
    {
        v177 = v167;
        v497 = 0;
        v498 = 0;
        v87 = (unsigned int)v87 - 1;
        v167 = v173;
        v499 = 0;
        if (32 < v493)
            goto LABEL_a9202c;
        v177 = v173;
        v87 = (unsigned int)v87 - 1;
        if (16 < v493)
            goto LABEL_a92074;
        v87 = (unsigned int)v87 - 1;
    }
    else
    {
        *iter = v496;
        iter += 1;
        v500 = v494 + 2;
        v502 = v492 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v496);
        v503 = _INSERT(__double_as_longlong(__longlong_as_double(*v494 ^ v21)), 8, v494[1] ^ v22);
        v492 = 0;
        v505 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v502, _mm_cvtsi128_si64(v76));
        v497 = v505;
        v506 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v502 >> 64), _mm_extract_epi64(v76, 1));
        v498 = v506;
        v507 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v502 ^ *(unsigned long long *)((void*)&v502 + 8)), _mm_extract_epi64(v163, 1));
        v499 = v507;
        v496 = v173 ^ v503;
        v494 = v500;
LABEL_a9202c:
        *iter = v496;
        iter += 1;
        v508 = v494 + 2;
        v510 = v492 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v496);
        v511 = _INSERT(__double_as_longlong(__longlong_as_double(*v494 ^ v21)), 8, v494[1] ^ v22);
        v492 = 0;
        v512 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v510 >> 64), _mm_extract_epi64(v58, 1));
        v513 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v510, _mm_cvtsi128_si64(v58));
        v496 = v167 ^ v511;
        v498 ^= v512;
        v515 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v510 ^ *(unsigned long long *)((void*)&v510 + 8)), _mm_cvtsi128_si64(v163));
        v497 ^= v513;
        v499 ^= v515;
        v494 = v508;
LABEL_a92074:
        *iter = v496;
        iter += 1;
        v517 = v492 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v496);
        v492 = 0;
        v518 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v517 >> 64), _mm_extract_epi64(v69, 1));
        v519 = __dirty_unsupported_Iop_ZeroHI64ofV128(v517 ^ *(unsigned long long *)((void*)&v517 + 8));
        v498 ^= v518;
        v520 = _INSERT(v519, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v519);
        v521 = _INSERT(__double_as_longlong(__longlong_as_double(*v494 ^ v21)), 8, v494[1] ^ v22);
        v522 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v520 >> 64), _mm_extract_epi64(v178, 1));
        v523 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v517, _mm_cvtsi128_si64(v69));
        v496 = v177 ^ v521;
        v499 ^= v522;
        v497 ^= v523;
    }
    v524 = *iter;
    v525 = -((a1 & 127) - 128) & 127;
    v526 = 0xffffffffffffffff >> ((char)v525 & 63);
    v527 = v525;
    if ((long long)v525 < 64)
    {
        v528 = 0xffffffffffffffff;
        v529 = arm64g_calculate_condition(180, v527, 64, 0);
        if (!(v529 & 1))
            goto LABEL_a920ea;
LABEL_a920e9:
        v531 = v526;
    }
    else
    {
        v528 = v526;
        v530 = arm64g_calculate_condition(180, v527, 64, 0);
        if (v530 & 1)
            goto LABEL_a920e9;
LABEL_a920ea:
        v531 = 0;
    }
    v532 = _INSERT(__double_as_longlong(__longlong_as_double(v528)), 8, v531);
    v533 = v496 & v532;
    v535 = v492 ^ __dirty_unsupported_Iop_Reverse8sIn64_x2(v533);
    v536 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v535 >> 64), _mm_extract_epi64(v117, 1));
    v537 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v535, _mm_cvtsi128_si64(v117));
    v538 = v536 ^ v498;
    v540 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(v535 ^ *(unsigned long long *)((void*)&v535 + 8)), _mm_cvtsi128_si64(v178));
    v541 = v537 ^ v497;
    v542 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi64(_mm_set_epi64x(0, 0xc2c2c2c2c2c2c2c2), 56));
    v543 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v538, v542);
    v545 = __dirty_unsupported_Iop_SliceV128(v538, v538, 8) ^ v543 ^ v538 ^ v541 ^ v540 ^ v499;
    v546 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v545, v542);
    v547 = __dirty_unsupported_Iop_SliceV128(v545, v545, 8);
    *(unsigned int *)&a4[12] = (((((v87 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v87 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v87 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v87 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    *iter = v533 ^ (v533 ^ v524) & ~v532;
    v549 = __dirty_unsupported_Iop_Reverse8sIn64_x2(__dirty_unsupported_Iop_SliceV128(v547 ^ v546 ^ v541, v547 ^ v546 ^ v541, 8));
    *a3 = v549;
    return *(unsigned long long *)&v532;
}
