/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b97a0..0x9ba220 (2688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b97a0_4 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    char padding_60[64];
    unsigned int field_a0;
} st_9b97a0_4;

typedef struct st_9b97a0_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    char padding_80[64];
    unsigned int field_c0;
} st_9b97a0_3;

typedef struct st_9b97a0_2 {
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
    char padding_a0[64];
    unsigned int field_e0;
} st_9b97a0_2;

typedef struct st_9b97a0_0 {
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
    char padding_b0[64];
    unsigned int field_f0;
} st_9b97a0_0;

typedef struct st_9b97a0_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char padding_30[64];
    unsigned int field_70;
} st_9b97a0_1;


double sub_9b97a0(uint128_t *a0, uint128_t *a1, unsigned long long a2, st_9b97a0_0 *a3, unsigned long long a4)
{
    uint128_t v2;  // q0
    unsigned int v3;  // w5
    uint128_t v12;  // 4109
    uint128_t v102;  // q26
    unsigned long long v103;  // x2
    unsigned int v104;  // w6
    unsigned int k;  // w6
    uint128_t v106;  // 4099
    uint128_t v107;  // 4101
    uint128_t v108;  // 4105
    uint128_t v109;  // 4107
    uint128_t v110;  // 4111
    uint128_t v111;  // 4113
    uint128_t v13;  // 4111
    uint128_t v112;  // 4117
    uint128_t v113;  // 4119
    uint128_t v114;  // 4123
    uint128_t v115;  // 4125
    st_9b97a0_3 *v116;  // x7
    unsigned int v117;  // w6
    uint128_t v118;  // 4139
    uint128_t v119;  // 4141
    uint128_t v120;  // 4145
    uint128_t v121;  // 4147
    uint128_t v14;  // q0
    uint128_t v122;  // 4151
    uint128_t v123;  // 4153
    uint128_t v124;  // 4157
    uint128_t v125;  // 4159
    uint128_t v126;  // 4163
    uint128_t v127;  // 4165
    uint128_t v128;  // 4099
    uint128_t v129;  // 4101
    uint128_t v130;  // 4105
    uint128_t v131;  // 4107
    unsigned int v15;  // w5
    uint128_t v132;  // 4111
    uint128_t v133;  // 4113
    uint128_t v134;  // 4117
    uint128_t v135;  // 4119
    uint128_t v136;  // 4123
    uint128_t v137;  // 4125
    unsigned long long v138;  // x2
    uint128_t v139;  // 4136
    uint128_t v140;  // 4138
    uint128_t v141;  // 4142
    unsigned int i;  // w5
    uint128_t v142;  // 4144
    uint128_t v143;  // 4148
    uint128_t v144;  // 4150
    uint128_t v145;  // 4154
    uint128_t v146;  // 4156
    uint128_t v147;  // 4160
    uint128_t v148;  // 4162
    unsigned long long v149;  // x6
    uint128_t v150;  // 4103
    uint128_t v151;  // 4105
    uint128_t v17;  // 4099
    uint128_t v152;  // 4109
    uint128_t v153;  // 4111
    uint128_t v154;  // 4115
    uint128_t v155;  // 4117
    uint128_t v156;  // 4121
    uint128_t v157;  // 4123
    uint128_t v158;  // 4127
    uint128_t v159;  // 4129
    uint128_t *v160;  // x0
    uint128_t v161;  // 4140
    uint128_t v18;  // 4101
    uint128_t v162;  // 4142
    uint128_t v163;  // 4146
    uint128_t v164;  // 4148
    uint128_t v165;  // 4152
    uint128_t v166;  // 4154
    uint128_t v167;  // 4158
    uint128_t v168;  // 4160
    uint128_t v169;  // 4164
    uint128_t v170;  // 4166
    uint128_t v171;  // 4170
    st_9b97a0_4 *v19;  // x3
    uint128_t v172;  // 4172
    uint128_t v173;  // 4176
    uint128_t v174;  // 4178
    uint128_t v175;  // 4182
    uint128_t v176;  // 4184
    uint128_t v177;  // 4188
    uint128_t v178;  // 4190
    uint128_t v179;  // 4194
    uint128_t v180;  // 4196
    uint128_t v181;  // 4200
    uint128_t v20;  // 4109
    uint128_t v182;  // 4202
    uint128_t v183;  // 4206
    uint128_t v184;  // 4208
    uint128_t v185;  // 4212
    uint128_t v186;  // 4214
    uint128_t v187;  // 4218
    uint128_t v188;  // 4220
    uint128_t v189;  // 4224
    uint128_t v190;  // 4226
    uint128_t v191;  // 4230
    uint128_t v21;  // 4111
    uint128_t v192;  // 4232
    uint128_t v193;  // 4236
    uint128_t v194;  // 4238
    uint128_t v195;  // 4242
    uint128_t v196;  // 4244
    uint128_t v197;  // 4248
    uint128_t v198;  // 4250
    uint128_t v199;  // 4254
    uint128_t v200;  // 4256
    uint128_t v201;  // 4260
    uint128_t v4;  // q6
    uint128_t v202;  // q0
    uint128_t *v203;  // x0
    uint128_t v204;  // 4268
    uint128_t v205;  // q1
    uint128_t *v206;  // x0
    uint128_t v207;  // 4276
    uint128_t v208;  // q24
    uint128_t *v209;  // x0
    uint128_t v210;  // 4284
    uint128_t v211;  // q25
    uint128_t *v23;  // x3
    uint128_t *v212;  // x0
    uint128_t v213;  // 4292
    uint128_t v214;  // q26
    uint128_t v215;  // q29
    st_9b97a0_2 *v216;  // x7
    uint128_t *v217;  // x1
    uint128_t *v218;  // x1
    uint128_t *v219;  // x1
    uint128_t *v220;  // x1
    unsigned long long v221;  // 4186
    uint128_t v24;  // 4103
    unsigned long long v222;  // x2
    uint128_t *v223;  // x1
    uint128_t *v224;  // x1
    unsigned long v225;  // x6
    uint128_t v226;  // 4099
    uint128_t v227;  // 4101
    uint128_t v228;  // 4105
    uint128_t v229;  // 4107
    uint128_t v230;  // 4111
    uint128_t v231;  // 4113
    uint128_t v25;  // 4105
    st_9b97a0_3 *v232;  // x7
    unsigned long long v233;  // x6
    uint128_t v234;  // 4127
    uint128_t v235;  // 4129
    uint128_t v236;  // 4133
    uint128_t v237;  // 4135
    uint128_t v238;  // 4139
    uint128_t v239;  // 4141
    uint128_t v240;  // 4099
    uint128_t v241;  // 4101
    uint128_t v26;  // 4109
    uint128_t v242;  // 4105
    uint128_t v243;  // 4107
    uint128_t v244;  // 4111
    uint128_t v245;  // 4113
    unsigned long long v246;  // x2
    uint128_t v247;  // 4099
    uint128_t v248;  // 4101
    uint128_t v249;  // 4105
    uint128_t v250;  // 4107
    uint128_t v251;  // 4111
    uint128_t v27;  // 4111
    uint128_t v252;  // 4113
    uint128_t *v253;  // x0
    uint128_t v254;  // 4125
    uint128_t v255;  // 4127
    uint128_t v256;  // 4131
    uint128_t v257;  // 4133
    uint128_t v258;  // 4137
    uint128_t v259;  // 4139
    uint128_t v260;  // q2
    uint128_t *v261;  // x0
    st_9b97a0_1 *v28;  // x3
    uint128_t v262;  // 4147
    uint128_t v263;  // 4149
    uint128_t v264;  // 4153
    uint128_t v265;  // 4155
    uint128_t v266;  // 4159
    uint128_t v267;  // 4161
    uint128_t v268;  // q3
    uint128_t *v269;  // x0
    uint128_t v270;  // 4169
    uint128_t v271;  // 4171
    uint128_t v29;  // 4119
    uint128_t v272;  // 4175
    uint128_t v273;  // 4177
    uint128_t v274;  // 4181
    uint128_t v275;  // 4183
    uint128_t v276;  // q27
    uint128_t v277;  // 4191
    uint128_t v278;  // 4195
    uint128_t v279;  // 4199
    st_9b97a0_2 *v280;  // x7
    uint128_t *v281;  // x1
    uint128_t v30;  // 4121
    uint128_t *v282;  // x1
    unsigned long long v283;  // 4323
    unsigned long long v284;  // 4106
    unsigned long v285;  // x6
    uint128_t v286;  // 4099
    uint128_t v287;  // 4101
    uint128_t v288;  // 4105
    uint128_t v289;  // 4107
    st_9b97a0_3 *v290;  // x7
    unsigned long long v291;  // x6
    uint128_t v31;  // 4125
    uint128_t v292;  // 4121
    uint128_t v293;  // 4123
    uint128_t v294;  // 4127
    uint128_t v295;  // 4129
    uint128_t v296;  // 4099
    uint128_t v297;  // 4101
    uint128_t v298;  // 4105
    uint128_t v299;  // 4107
    uint128_t v300;  // 4111
    uint128_t v301;  // 4113
    uint128_t v5;  // q5
    uint128_t v32;  // 4127
    uint128_t v302;  // 4117
    uint128_t v303;  // 4119
    uint128_t v304;  // 4123
    uint128_t v305;  // 4125
    uint128_t v306;  // 4129
    uint128_t v307;  // 4131
    uint128_t v308;  // 4139
    uint128_t v309;  // 4141
    uint128_t v310;  // 4145
    uint128_t v311;  // 4147
    uint128_t v33;  // 4135
    uint128_t v312;  // 4151
    uint128_t v313;  // 4153
    uint128_t v314;  // 4157
    uint128_t v315;  // 4159
    uint128_t v316;  // 4163
    uint128_t v317;  // 4167
    uint128_t v318;  // q24
    unsigned long long v319;  // 4218
    uint128_t *v320;  // x0
    unsigned long long v321;  // x2
    uint128_t v34;  // 4137
    unsigned long v322;  // x6
    uint128_t v323;  // q24
    uint128_t v324;  // q1
    unsigned long v325;  // x0
    uint128_t v326;  // q25
    uint128_t *v327;  // x0
    uint128_t v328;  // q26
    unsigned long long v329;  // x2
    unsigned int v330;  // w6
    unsigned int l;  // w6
    uint128_t v35;  // 4141
    uint128_t v332;  // 4099
    uint128_t v333;  // 4101
    uint128_t v334;  // 4105
    uint128_t v335;  // 4107
    uint128_t v336;  // 4111
    uint128_t v337;  // 4113
    uint128_t v338;  // 4117
    uint128_t v339;  // 4119
    uint128_t v340;  // 4123
    uint128_t v341;  // 4125
    uint128_t v36;  // 4143
    st_9b97a0_3 *v342;  // x7
    unsigned int v343;  // w6
    uint128_t v344;  // 4139
    uint128_t v345;  // 4141
    uint128_t v346;  // 4145
    uint128_t v347;  // 4147
    uint128_t v348;  // 4151
    uint128_t v349;  // 4153
    uint128_t v350;  // 4157
    uint128_t v351;  // 4159
    uint128_t v37;  // 4150
    uint128_t v352;  // 4163
    uint128_t v353;  // 4165
    uint128_t v354;  // 4099
    uint128_t v355;  // 4101
    uint128_t v356;  // 4105
    uint128_t v357;  // 4107
    uint128_t v358;  // 4111
    uint128_t v359;  // 4113
    uint128_t v360;  // 4117
    uint128_t v361;  // 4119
    uint128_t v38;  // 4152
    uint128_t v362;  // 4123
    uint128_t v363;  // 4125
    unsigned long long v364;  // x2
    uint128_t v365;  // 4136
    uint128_t v366;  // 4138
    uint128_t v367;  // 4142
    uint128_t v368;  // 4144
    uint128_t v369;  // 4148
    uint128_t v370;  // 4150
    uint128_t v371;  // 4154
    uint128_t v39;  // 4156
    uint128_t v372;  // 4156
    uint128_t v373;  // 4160
    uint128_t v374;  // 4162
    unsigned long long v375;  // x6
    uint128_t v376;  // 4103
    uint128_t v377;  // 4105
    uint128_t v378;  // 4109
    uint128_t v379;  // 4111
    uint128_t v380;  // 4115
    uint128_t v381;  // 4117
    uint128_t v40;  // q0
    uint128_t v382;  // 4121
    uint128_t v383;  // 4123
    uint128_t v384;  // 4127
    uint128_t v385;  // 4129
    uint128_t *v386;  // x0
    uint128_t v387;  // 4140
    uint128_t v388;  // 4142
    uint128_t v389;  // 4146
    uint128_t v390;  // 4148
    uint128_t v391;  // 4152
    uint128_t v41;  // 4099
    uint128_t v392;  // 4154
    uint128_t v393;  // 4158
    uint128_t v394;  // 4160
    uint128_t v395;  // 4164
    uint128_t v396;  // 4166
    uint128_t v397;  // 4170
    uint128_t v398;  // 4172
    uint128_t v399;  // 4176
    uint128_t v400;  // 4178
    uint128_t v401;  // 4182
    uint128_t *v6;  // x3
    uint128_t v42;  // 4101
    uint128_t v402;  // 4184
    uint128_t v403;  // 4188
    uint128_t v404;  // 4190
    uint128_t v405;  // 4194
    uint128_t v406;  // 4196
    uint128_t v407;  // 4200
    uint128_t v408;  // 4202
    uint128_t v409;  // 4206
    uint128_t v410;  // 4208
    uint128_t v411;  // 4212
    uint128_t v43;  // q17
    uint128_t v412;  // 4214
    uint128_t v413;  // 4218
    uint128_t v414;  // 4220
    uint128_t v415;  // 4224
    uint128_t v416;  // 4226
    uint128_t v417;  // 4230
    uint128_t v418;  // 4232
    uint128_t v419;  // 4236
    uint128_t v420;  // 4238
    uint128_t v421;  // 4242
    uint128_t v44;  // q16
    uint128_t v422;  // 4244
    uint128_t v423;  // 4248
    uint128_t v424;  // 4250
    uint128_t v425;  // 4254
    uint128_t v426;  // 4256
    uint128_t v427;  // 4260
    uint128_t v428;  // q0
    uint128_t *v429;  // x0
    uint128_t v430;  // 4268
    uint128_t v431;  // q1
    uint128_t *v45;  // x3
    uint128_t *v432;  // x0
    uint128_t v433;  // 4276
    uint128_t v434;  // q24
    uint128_t *v435;  // x0
    uint128_t v436;  // 4284
    uint128_t v437;  // q25
    uint128_t *v438;  // x0
    uint128_t v439;  // 4292
    uint128_t v440;  // q26
    uint128_t v441;  // q29
    uint128_t v46;  // 4109
    st_9b97a0_2 *v442;  // x7
    uint128_t *v443;  // x1
    uint128_t *v444;  // x1
    uint128_t *v445;  // x1
    uint128_t *v446;  // x1
    unsigned long long v447;  // 4186
    unsigned long long v448;  // x2
    uint128_t *v449;  // x1
    uint128_t *v450;  // x1
    unsigned long v451;  // x6
    uint128_t v47;  // 4111
    uint128_t v452;  // 4099
    uint128_t v453;  // 4101
    uint128_t v454;  // 4105
    uint128_t v455;  // 4107
    uint128_t v456;  // 4111
    uint128_t v457;  // 4113
    st_9b97a0_3 *v458;  // x7
    unsigned long long v459;  // x6
    uint128_t v460;  // 4127
    uint128_t v461;  // 4129
    uint128_t v48;  // q0
    uint128_t v462;  // 4133
    uint128_t v463;  // 4135
    uint128_t v464;  // 4139
    uint128_t v465;  // 4141
    uint128_t v466;  // 4099
    uint128_t v467;  // 4101
    uint128_t v468;  // 4105
    uint128_t v469;  // 4107
    uint128_t v470;  // 4111
    uint128_t v471;  // 4113
    unsigned int v49;  // w5
    unsigned long long v472;  // x2
    uint128_t v473;  // 4099
    uint128_t v474;  // 4101
    uint128_t v475;  // 4105
    uint128_t v476;  // 4107
    uint128_t v477;  // 4111
    uint128_t v478;  // 4113
    uint128_t *v479;  // x0
    uint128_t v480;  // 4125
    uint128_t v481;  // 4127
    unsigned int j;  // w5
    uint128_t v482;  // 4131
    uint128_t v483;  // 4133
    uint128_t v484;  // 4137
    uint128_t v485;  // 4139
    uint128_t v486;  // q2
    uint128_t *v487;  // x0
    uint128_t v488;  // 4147
    uint128_t v489;  // 4149
    uint128_t v490;  // 4153
    uint128_t v491;  // 4155
    uint128_t v51;  // 4099
    uint128_t v492;  // 4159
    uint128_t v493;  // 4161
    uint128_t v494;  // q3
    uint128_t *v495;  // x0
    uint128_t v496;  // 4169
    uint128_t v497;  // 4171
    uint128_t v498;  // 4175
    uint128_t v499;  // 4177
    uint128_t v500;  // 4181
    uint128_t v501;  // 4183
    uint128_t v7;  // 4099
    uint128_t v52;  // 4101
    uint128_t v502;  // q27
    uint128_t v503;  // 4191
    uint128_t v504;  // 4195
    uint128_t v505;  // 4199
    st_9b97a0_2 *v506;  // x7
    uint128_t *v507;  // x1
    uint128_t *v508;  // x1
    unsigned long long v509;  // 4323
    unsigned long long v510;  // 4106
    unsigned long v511;  // x6
    st_9b97a0_4 *v53;  // x3
    uint128_t v512;  // 4099
    uint128_t v513;  // 4101
    uint128_t v514;  // 4105
    uint128_t v515;  // 4107
    st_9b97a0_3 *v516;  // x7
    unsigned long long v517;  // x6
    uint128_t v518;  // 4121
    uint128_t v519;  // 4123
    uint128_t v520;  // 4127
    uint128_t v521;  // 4129
    uint128_t v54;  // 4109
    uint128_t v522;  // 4099
    uint128_t v523;  // 4101
    uint128_t v524;  // 4105
    uint128_t v525;  // 4107
    uint128_t v526;  // 4111
    uint128_t v527;  // 4113
    uint128_t v528;  // 4117
    uint128_t v529;  // 4119
    uint128_t v530;  // 4123
    uint128_t v531;  // 4125
    uint128_t v55;  // 4111
    uint128_t v532;  // 4129
    uint128_t v533;  // 4131
    uint128_t v534;  // 4139
    uint128_t v535;  // 4141
    uint128_t v536;  // 4145
    uint128_t v537;  // 4147
    uint128_t v538;  // 4151
    uint128_t v539;  // 4153
    uint128_t v540;  // 4157
    uint128_t v541;  // 4159
    uint128_t v542;  // 4163
    uint128_t v543;  // 4167
    uint128_t v544;  // q24
    unsigned long long v545;  // 4218
    uint128_t *v57;  // x3
    uint128_t v58;  // 4103
    uint128_t v59;  // 4105
    uint128_t v60;  // 4109
    uint128_t v61;  // 4111
    uint128_t v8;  // 4101
    st_9b97a0_1 *v62;  // x3
    uint128_t v63;  // 4119
    uint128_t v64;  // 4121
    uint128_t v65;  // 4125
    uint128_t v66;  // 4127
    uint128_t v67;  // 4135
    uint128_t v68;  // 4137
    uint128_t v69;  // 4141
    uint128_t v70;  // 4143
    uint128_t v71;  // 4150
    uint128_t v9;  // q17
    uint128_t v72;  // 4152
    uint128_t v73;  // 4156
    unsigned long long v74;  // x8
    unsigned long long v75;  // 4113
    unsigned long long v76;  // 4104
    unsigned long long v77;  // x2
    uint128_t *v78;  // x0
    uint128_t v79;  // q17
    uint128_t v80;  // q16
    unsigned long v81;  // x5
    uint128_t v10;  // q16
    st_9b97a0_0 *v82;  // x7
    unsigned int v83;  // w5
    uint128_t v84;  // q19
    uint128_t v85;  // q18
    uint128_t *v86;  // x7
    uint128_t v87;  // q21
    uint128_t v88;  // q20
    uint128_t *v89;  // x7
    uint128_t v90;  // q23
    uint128_t v91;  // q22
    uint128_t *v11;  // x3
    uint128_t v92;  // q7
    uint128_t *v93;  // x7
    uint128_t *v94;  // x0
    unsigned long long v95;  // x2
    unsigned long v96;  // x6
    uint128_t v97;  // q24
    uint128_t v98;  // q1
    unsigned long v99;  // x0
    uint128_t v100;  // q25
    uint128_t *v101;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (a2 == 16)
    {
        v2 = *a0;
        v3 = a3->field_f0;
        v4 = a3->field_10;
        v5 = a3->field_0;
        v6 = &a3->field_20;
        if (a4)
        {
            v7 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v2 ^ v5) >> 64), (unsigned long long)v2 ^ (unsigned long long)v5);
            v8 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v7 >> 64), (unsigned long long)v7);
            v9 = v6[1];
            v10 = *v6;
            v11 = v6 + 2;
            v12 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v8 ^ v4) >> 64), (unsigned long long)v8 ^ (unsigned long long)v4);
            v13 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v12 >> 64), (unsigned long long)v12);
            v14 = v13;
            v15 = v3 - 10;
            if (v3 != 10)
            {
                do
                {
                    i = v15;
                    v17 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v14 ^ v10) >> 64), (unsigned long long)v14 ^ (unsigned long long)v10);
                    v18 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v17 >> 64), (unsigned long long)v17);
                    v10 = *v11;
                    v19 = v11 + 1;
                    v20 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v18 ^ v9) >> 64), (unsigned long long)v18 ^ (unsigned long long)v9);
                    v21 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v20 >> 64), (unsigned long long)v20);
                    v14 = v21;
                    v9 = v19->field_0;
                    v11 = &v19->field_10;
                    v15 = i - 2;
                } while (2 < (int)i);
            }
            v23 = v11 + 2;
            v24 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v14 ^ v10) >> 64), (unsigned long long)v14 ^ (unsigned long long)v10);
            v25 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v24 >> 64), (unsigned long long)v24);
            v26 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v25 ^ v9) >> 64), (unsigned long long)v25 ^ (unsigned long long)v9);
            v27 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v26 >> 64), (unsigned long long)v26);
            v28 = v23 + 2;
            v29 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v27 ^ *v11) >> 64), (unsigned long long)v27 ^ (unsigned long long)*v11);
            v30 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v29 >> 64), (unsigned long long)v29);
            v31 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v30 ^ v11[1]) >> 64), (unsigned long long)v30 ^ (unsigned long long)v11[1]);
            v32 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v31 >> 64), (unsigned long long)v31);
            v33 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v32 ^ *v23) >> 64), (unsigned long long)v32 ^ (unsigned long long)*v23);
            v34 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v33 >> 64), (unsigned long long)v33);
            v35 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v34 ^ v23[1]) >> 64), (unsigned long long)v34 ^ (unsigned long long)v23[1]);
            v36 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v35 >> 64), (unsigned long long)v35);
            v37 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v36 ^ v28->field_0) >> 64), (unsigned long long)v36 ^ (unsigned long long)v28->field_0);
            v38 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v37 >> 64), (unsigned long long)v37);
            v39 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v28->field_10) >> 64), (unsigned long long)v38 ^ (unsigned long long)v28->field_10);
            v40 = v28->field_20 ^ v39;
            *a1 = v40;
        }
        else
        {
            v41 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v2 ^ v5) >> 64), (unsigned long long)v2 ^ (unsigned long long)v5);
            v42 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v41 >> 64), (unsigned long long)v41);
            v43 = v6[1];
            v44 = *v6;
            v45 = v6 + 2;
            v46 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v42 ^ v4) >> 64), (unsigned long long)v42 ^ (unsigned long long)v4);
            v47 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v46 >> 64), (unsigned long long)v46);
            v48 = v47;
            v49 = v3 - 10;
            if (v3 != 10)
            {
                do
                {
                    j = v49;
                    v51 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v48 ^ v44) >> 64), (unsigned long long)v48 ^ (unsigned long long)v44);
                    v52 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v51 >> 64), (unsigned long long)v51);
                    v44 = *v45;
                    v53 = v45 + 1;
                    v54 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v52 ^ v43) >> 64), (unsigned long long)v52 ^ (unsigned long long)v43);
                    v55 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v54 >> 64), (unsigned long long)v54);
                    v48 = v55;
                    v43 = v53->field_0;
                    v45 = &v53->field_10;
                    v49 = j - 2;
                } while (2 < (int)j);
            }
            v57 = v45 + 2;
            v58 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v48 ^ v44) >> 64), (unsigned long long)v48 ^ (unsigned long long)v44);
            v59 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v58 >> 64), (unsigned long long)v58);
            v60 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v59 ^ v43) >> 64), (unsigned long long)v59 ^ (unsigned long long)v43);
            v61 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v60 >> 64), (unsigned long long)v60);
            v62 = v57 + 2;
            v63 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v61 ^ *v45) >> 64), (unsigned long long)v61 ^ (unsigned long long)*v45);
            v64 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v63 >> 64), (unsigned long long)v63);
            v65 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v64 ^ v45[1]) >> 64), (unsigned long long)v64 ^ (unsigned long long)v45[1]);
            v66 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v65 >> 64), (unsigned long long)v65);
            v67 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v66 ^ *v57) >> 64), (unsigned long long)v66 ^ (unsigned long long)*v57);
            v68 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v67 >> 64), (unsigned long long)v67);
            v69 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v68 ^ v57[1]) >> 64), (unsigned long long)v68 ^ (unsigned long long)v57[1]);
            v70 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v69 >> 64), (unsigned long long)v69);
            v71 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v70 ^ v62->field_0) >> 64), (unsigned long long)v70 ^ (unsigned long long)v62->field_0);
            v72 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v71 >> 64), (unsigned long long)v71);
            v73 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v72 ^ v62->field_10) >> 64), (unsigned long long)v72 ^ (unsigned long long)v62->field_10);
            v40 = v62->field_20 ^ v73;
            *a1 = v40;
        }
    }
    else
    {
        v0 = &v1;
        v74 = 16;
        v75 = arm64g_calculate_condition(52, a2, 16, 0);
        if (!(v75 & 1))
        {
            v76 = arm64g_calculate_condition(4, a2, 16, 0);
            if (v76 & 1)
                v74 = 0;
            v77 = a2 - 16 & 0xfffffffffffffff0;
            v40 = *a0;
            v78 = (char *)a0 + v74;
            v79 = a3->field_10;
            v80 = a3->field_0;
            v81 = a3->field_f0 - 6;
            v82 = &(&a3->field_0)[v81];
            v83 = (unsigned int)v81 - 2;
            v84 = v82->field_10;
            v85 = v82->field_0;
            v86 = &v82->field_20;
            v87 = v86[1];
            v88 = *v86;
            v89 = v86 + 2;
            v90 = v89[1];
            v91 = *v89;
            v92 = v89[2];
            v93 = &a3->field_20;
            if (a4)
            {
                v94 = v78 + 1;
                v95 = v77 - 32;
                v96 = v83 + 2;
                v97 = *v78;
                v98 = v40;
                if (v77 >= 32)
                {
                    v98 = *v78;
                    v97 = *v94;
                    v99 = v94 + 1;
                    if (v95 >= 32)
                    {
                        v100 = *(int128_t *)v99;
                        v101 = v99 + 16;
                        v102 = *v101;
                        v99 = v101 + 1;
                        v103 = v95 - 32;
                        v104 = v83;
                        do
                        {
                            do
                            {
                                k = v104;
                                v106 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v40 ^ v80) >> 64), (unsigned long long)v40 ^ (unsigned long long)v80);
                                v107 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v106 >> 64), (unsigned long long)v106);
                                v108 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v98 ^ v80) >> 64), (unsigned long long)v98 ^ (unsigned long long)v80);
                                v109 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v108 >> 64), (unsigned long long)v108);
                                v110 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v97 ^ v80) >> 64), (unsigned long long)v97 ^ (unsigned long long)v80);
                                v111 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v110 >> 64), (unsigned long long)v110);
                                v112 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v100 ^ v80) >> 64), (unsigned long long)v100 ^ (unsigned long long)v80);
                                v113 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v112 >> 64), (unsigned long long)v112);
                                v114 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v102 ^ v80) >> 64), (unsigned long long)v102 ^ (unsigned long long)v80);
                                v115 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v114 >> 64), (unsigned long long)v114);
                                v80 = *v93;
                                v116 = v93 + 1;
                                v117 = k - 2;
                                v118 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v107 ^ v79) >> 64), (unsigned long long)v107 ^ (unsigned long long)v79);
                                v119 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v118 >> 64), (unsigned long long)v118);
                                v40 = v119;
                                v120 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v109 ^ v79) >> 64), (unsigned long long)v109 ^ (unsigned long long)v79);
                                v121 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v120 >> 64), (unsigned long long)v120);
                                v98 = v121;
                                v122 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v111 ^ v79) >> 64), (unsigned long long)v111 ^ (unsigned long long)v79);
                                v123 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v122 >> 64), (unsigned long long)v122);
                                v97 = v123;
                                v124 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v113 ^ v79) >> 64), (unsigned long long)v113 ^ (unsigned long long)v79);
                                v125 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v124 >> 64), (unsigned long long)v124);
                                v100 = v125;
                                v126 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v115 ^ v79) >> 64), (unsigned long long)v115 ^ (unsigned long long)v79);
                                v127 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v126 >> 64), (unsigned long long)v126);
                                v102 = v127;
                                v79 = v116->field_0;
                                v93 = &v116->field_10;
                                v104 = v117;
                            } while (2 < (int)k);
                            v128 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v40 ^ v80) >> 64), (unsigned long long)v40 ^ (unsigned long long)v80);
                            v129 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v128 >> 64), (unsigned long long)v128);
                            v130 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v98 ^ v80) >> 64), (unsigned long long)v98 ^ (unsigned long long)v80);
                            v131 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v130 >> 64), (unsigned long long)v130);
                            v132 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v97 ^ v80) >> 64), (unsigned long long)v97 ^ (unsigned long long)v80);
                            v133 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v132 >> 64), (unsigned long long)v132);
                            v134 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v100 ^ v80) >> 64), (unsigned long long)v100 ^ (unsigned long long)v80);
                            v135 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v134 >> 64), (unsigned long long)v134);
                            v136 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v102 ^ v80) >> 64), (unsigned long long)v102 ^ (unsigned long long)v80);
                            v137 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v136 >> 64), (unsigned long long)v136);
                            v138 = v103 - 80;
                            v139 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v129 ^ v79) >> 64), (unsigned long long)v129 ^ (unsigned long long)v79);
                            v140 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v139 >> 64), (unsigned long long)v139);
                            v141 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v131 ^ v79) >> 64), (unsigned long long)v131 ^ (unsigned long long)v79);
                            v142 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v141 >> 64), (unsigned long long)v141);
                            v143 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v133 ^ v79) >> 64), (unsigned long long)v133 ^ (unsigned long long)v79);
                            v144 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v143 >> 64), (unsigned long long)v143);
                            v145 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v135 ^ v79) >> 64), (unsigned long long)v135 ^ (unsigned long long)v79);
                            v146 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v145 >> 64), (unsigned long long)v145);
                            v147 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v137 ^ v79) >> 64), (unsigned long long)v137 ^ (unsigned long long)v79);
                            v148 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v147 >> 64), (unsigned long long)v147);
                            if (64 < (long long)v103)
                                v149 = 0;
                            else
                                v149 = v138;
                            v150 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v140 ^ v85) >> 64), (unsigned long long)v140 ^ (unsigned long long)v85);
                            v151 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v150 >> 64), (unsigned long long)v150);
                            v152 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v142 ^ v85) >> 64), (unsigned long long)v142 ^ (unsigned long long)v85);
                            v153 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v152 >> 64), (unsigned long long)v152);
                            v154 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v144 ^ v85) >> 64), (unsigned long long)v144 ^ (unsigned long long)v85);
                            v155 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v154 >> 64), (unsigned long long)v154);
                            v156 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v146 ^ v85) >> 64), (unsigned long long)v146 ^ (unsigned long long)v85);
                            v157 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v156 >> 64), (unsigned long long)v156);
                            v158 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v148 ^ v85) >> 64), (unsigned long long)v148 ^ (unsigned long long)v85);
                            v159 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v158 >> 64), (unsigned long long)v158);
                            v160 = v99 + v149;
                            v161 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v151 ^ v84) >> 64), (unsigned long long)v151 ^ (unsigned long long)v84);
                            v162 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v161 >> 64), (unsigned long long)v161);
                            v163 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v153 ^ v84) >> 64), (unsigned long long)v153 ^ (unsigned long long)v84);
                            v164 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v163 >> 64), (unsigned long long)v163);
                            v165 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v155 ^ v84) >> 64), (unsigned long long)v155 ^ (unsigned long long)v84);
                            v166 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v165 >> 64), (unsigned long long)v165);
                            v167 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v157 ^ v84) >> 64), (unsigned long long)v157 ^ (unsigned long long)v84);
                            v168 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v167 >> 64), (unsigned long long)v167);
                            v169 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v159 ^ v84) >> 64), (unsigned long long)v159 ^ (unsigned long long)v84);
                            v170 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v169 >> 64), (unsigned long long)v169);
                            v171 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v162 ^ v88) >> 64), (unsigned long long)v162 ^ (unsigned long long)v88);
                            v172 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v171 >> 64), (unsigned long long)v171);
                            v173 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v164 ^ v88) >> 64), (unsigned long long)v164 ^ (unsigned long long)v88);
                            v174 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v173 >> 64), (unsigned long long)v173);
                            v175 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v166 ^ v88) >> 64), (unsigned long long)v166 ^ (unsigned long long)v88);
                            v176 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v175 >> 64), (unsigned long long)v175);
                            v177 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v168 ^ v88) >> 64), (unsigned long long)v168 ^ (unsigned long long)v88);
                            v178 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v177 >> 64), (unsigned long long)v177);
                            v179 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v170 ^ v88) >> 64), (unsigned long long)v170 ^ (unsigned long long)v88);
                            v180 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v179 >> 64), (unsigned long long)v179);
                            v181 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v172 ^ v87) >> 64), (unsigned long long)v172 ^ (unsigned long long)v87);
                            v182 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v181 >> 64), (unsigned long long)v181);
                            v183 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v174 ^ v87) >> 64), (unsigned long long)v174 ^ (unsigned long long)v87);
                            v184 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v183 >> 64), (unsigned long long)v183);
                            v185 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v176 ^ v87) >> 64), (unsigned long long)v176 ^ (unsigned long long)v87);
                            v186 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v185 >> 64), (unsigned long long)v185);
                            v187 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v178 ^ v87) >> 64), (unsigned long long)v178 ^ (unsigned long long)v87);
                            v188 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v187 >> 64), (unsigned long long)v187);
                            v189 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v180 ^ v87) >> 64), (unsigned long long)v180 ^ (unsigned long long)v87);
                            v190 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v189 >> 64), (unsigned long long)v189);
                            v191 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v182 ^ v91) >> 64), (unsigned long long)v182 ^ (unsigned long long)v91);
                            v192 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v191 >> 64), (unsigned long long)v191);
                            v193 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v184 ^ v91) >> 64), (unsigned long long)v184 ^ (unsigned long long)v91);
                            v194 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v193 >> 64), (unsigned long long)v193);
                            v195 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v186 ^ v91) >> 64), (unsigned long long)v186 ^ (unsigned long long)v91);
                            v196 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v195 >> 64), (unsigned long long)v195);
                            v197 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v188 ^ v91) >> 64), (unsigned long long)v188 ^ (unsigned long long)v91);
                            v198 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v197 >> 64), (unsigned long long)v197);
                            v199 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v190 ^ v91) >> 64), (unsigned long long)v190 ^ (unsigned long long)v91);
                            v200 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v199 >> 64), (unsigned long long)v199);
                            v201 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v192 ^ v90) >> 64), (unsigned long long)v192 ^ (unsigned long long)v90);
                            v202 = v201;
                            v203 = v160 + 1;
                            v204 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v194 ^ v90) >> 64), (unsigned long long)v194 ^ (unsigned long long)v90);
                            v205 = v204;
                            v206 = v203 + 1;
                            v207 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v196 ^ v90) >> 64), (unsigned long long)v196 ^ (unsigned long long)v90);
                            v208 = v207;
                            v209 = v206 + 1;
                            v210 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v198 ^ v90) >> 64), (unsigned long long)v198 ^ (unsigned long long)v90);
                            v211 = v210;
                            v212 = v209 + 1;
                            v213 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v200 ^ v90) >> 64), (unsigned long long)v200 ^ (unsigned long long)v90);
                            v214 = v213;
                            v215 = *v212;
                            v99 = v212 + 1;
                            if (v138 == 0xffffffffffffffa0)
                            {
                                *a1 = v205 ^ v92;
                                v223 = a1 + 1;
                                *v223 = v208 ^ v92;
                                v224 = v223 + 1;
                                *v224 = v211 ^ v92;
                                v224[1] = v214 ^ v92;
                                v40 = v202;
                                goto LABEL_9ba20c;
                            }
                            v80 = a3->field_0;
                            v216 = &a3->field_10;
                            v40 = *v160;
                            v98 = *v203;
                            v97 = *v206;
                            v100 = *v209;
                            *a1 = v202 ^ v92;
                            v217 = a1 + 1;
                            v102 = v215;
                            *v217 = v205 ^ v92;
                            v218 = v217 + 1;
                            v104 = v83;
                            *v218 = v208 ^ v92;
                            v219 = v218 + 1;
                            v79 = v216->field_0;
                            v93 = &v216->field_10;
                            *v219 = v211 ^ v92;
                            v220 = v219 + 1;
                            *v220 = v214 ^ v92;
                            a1 = v220 + 1;
                            v221 = arm64g_calculate_condition(36, v103, 64, 0);
                            v103 = v138;
                        } while (v221 & 1);
                        v222 = v138 + 80;
                        if (!v222)
                            goto LABEL_9ba20c;
                        v96 = v83 + 2;
                        v95 = v222 - 48;
                        v40 = v97;
                        v98 = v100;
                        v97 = v102;
                        if (v222 >= 48)
                            goto LABEL_9b9bd0;
                    }
                    else
                    {
                        while (1)
                        {
LABEL_9b9bd0:
                            v225 = v96;
                            v226 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v40 ^ v80) >> 64), (unsigned long long)v40 ^ (unsigned long long)v80);
                            v227 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v226 >> 64), (unsigned long long)v226);
                            v228 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v98 ^ v80) >> 64), (unsigned long long)v98 ^ (unsigned long long)v80);
                            v229 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v228 >> 64), (unsigned long long)v228);
                            v230 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v97 ^ v80) >> 64), (unsigned long long)v97 ^ (unsigned long long)v80);
                            v231 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v230 >> 64), (unsigned long long)v230);
                            v80 = *v93;
                            v232 = v93 + 1;
                            v233 = (unsigned int)v225 - 2;
                            v234 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v227 ^ v79) >> 64), (unsigned long long)v227 ^ (unsigned long long)v79);
                            v235 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v234 >> 64), (unsigned long long)v234);
                            v40 = v235;
                            v236 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v229 ^ v79) >> 64), (unsigned long long)v229 ^ (unsigned long long)v79);
                            v237 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v236 >> 64), (unsigned long long)v236);
                            v98 = v237;
                            v238 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v231 ^ v79) >> 64), (unsigned long long)v231 ^ (unsigned long long)v79);
                            v239 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v238 >> 64), (unsigned long long)v238);
                            v97 = v239;
                            v79 = v232->field_0;
                            v93 = &v232->field_10;
                            v96 = v233;
                            if (2 < (int)v225)
                                continue;
                            v240 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v40 ^ v80) >> 64), (unsigned long long)v40 ^ (unsigned long long)v80);
                            v241 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v240 >> 64), (unsigned long long)v240);
                            v242 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v98 ^ v80) >> 64), (unsigned long long)v98 ^ (unsigned long long)v80);
                            v243 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v242 >> 64), (unsigned long long)v242);
                            v244 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v97 ^ v80) >> 64), (unsigned long long)v97 ^ (unsigned long long)v80);
                            v245 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v244 >> 64), (unsigned long long)v244);
                            v246 = v95 - 48;
                            if (v95 < 48)
                                v233 = v246;
                            v247 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v241 ^ v79) >> 64), (unsigned long long)v241 ^ (unsigned long long)v79);
                            v248 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v247 >> 64), (unsigned long long)v247);
                            v249 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v243 ^ v79) >> 64), (unsigned long long)v243 ^ (unsigned long long)v79);
                            v250 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v249 >> 64), (unsigned long long)v249);
                            v251 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v245 ^ v79) >> 64), (unsigned long long)v245 ^ (unsigned long long)v79);
                            v252 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v251 >> 64), (unsigned long long)v251);
                            v253 = v99 + v233;
                            v254 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v248 ^ v88) >> 64), (unsigned long long)v248 ^ (unsigned long long)v88);
                            v255 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v254 >> 64), (unsigned long long)v254);
                            v256 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v250 ^ v88) >> 64), (unsigned long long)v250 ^ (unsigned long long)v88);
                            v257 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v256 >> 64), (unsigned long long)v256);
                            v258 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v252 ^ v88) >> 64), (unsigned long long)v252 ^ (unsigned long long)v88);
                            v259 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v258 >> 64), (unsigned long long)v258);
                            v260 = *v253;
                            v261 = v253 + 1;
                            v262 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v255 ^ v87) >> 64), (unsigned long long)v255 ^ (unsigned long long)v87);
                            v263 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v262 >> 64), (unsigned long long)v262);
                            v264 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v257 ^ v87) >> 64), (unsigned long long)v257 ^ (unsigned long long)v87);
                            v265 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v264 >> 64), (unsigned long long)v264);
                            v266 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v259 ^ v87) >> 64), (unsigned long long)v259 ^ (unsigned long long)v87);
                            v267 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v266 >> 64), (unsigned long long)v266);
                            v268 = *v261;
                            v269 = v261 + 1;
                            v270 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v263 ^ v91) >> 64), (unsigned long long)v263 ^ (unsigned long long)v91);
                            v271 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v270 >> 64), (unsigned long long)v270);
                            v272 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v265 ^ v91) >> 64), (unsigned long long)v265 ^ (unsigned long long)v91);
                            v273 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v272 >> 64), (unsigned long long)v272);
                            v274 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v267 ^ v91) >> 64), (unsigned long long)v267 ^ (unsigned long long)v91);
                            v275 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v274 >> 64), (unsigned long long)v274);
                            v276 = *v269;
                            v99 = v269 + 1;
                            v277 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v271 ^ v90) >> 64), (unsigned long long)v271 ^ (unsigned long long)v90);
                            v278 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v273 ^ v90) >> 64), (unsigned long long)v273 ^ (unsigned long long)v90);
                            v279 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v275 ^ v90) >> 64), (unsigned long long)v275 ^ (unsigned long long)v90);
                            v80 = a3->field_0;
                            v280 = &a3->field_10;
                            v96 = v83 + 2;
                            v79 = v280->field_0;
                            v93 = &v280->field_10;
                            *a1 = v277 ^ v92;
                            v281 = a1 + 1;
                            v40 = v260;
                            *v281 = v278 ^ v92;
                            v282 = v281 + 1;
                            v98 = v268;
                            *v282 = v92 ^ v279;
                            a1 = v282 + 1;
                            v97 = v276;
                            v283 = arm64g_calculate_condition(36, v95, 48, 0);
                            v95 = v246;
                            if (!(v283 & 1))
                                break;
                        }
                        v284 = arm64g_calculate_condition(2, v246, 48, 0);
                        v95 = v246;
                        if (v284 & 1)
                            goto LABEL_9ba20c;
                    }
                }
                do
                {
                    v285 = v96;
                    v286 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v98 ^ v80) >> 64), (unsigned long long)v98 ^ (unsigned long long)v80);
                    v287 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v286 >> 64), (unsigned long long)v286);
                    v288 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v97 ^ v80) >> 64), (unsigned long long)v97 ^ (unsigned long long)v80);
                    v289 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v288 >> 64), (unsigned long long)v288);
                    v80 = *v93;
                    v290 = v93 + 1;
                    v291 = (unsigned int)v285 - 2;
                    v292 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v287 ^ v79) >> 64), (unsigned long long)v287 ^ (unsigned long long)v79);
                    v293 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v292 >> 64), (unsigned long long)v292);
                    v98 = v293;
                    v294 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v289 ^ v79) >> 64), (unsigned long long)v289 ^ (unsigned long long)v79);
                    v295 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v294 >> 64), (unsigned long long)v294);
                    v97 = v295;
                    v79 = v290->field_0;
                    v93 = &v290->field_10;
                    v96 = v291;
                } while (2 < (int)v285);
                v296 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v98 ^ v80) >> 64), (unsigned long long)v98 ^ (unsigned long long)v80);
                v297 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v296 >> 64), (unsigned long long)v296);
                v298 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v97 ^ v80) >> 64), (unsigned long long)v97 ^ (unsigned long long)v80);
                v299 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v298 >> 64), (unsigned long long)v298);
                v300 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v297 ^ v79) >> 64), (unsigned long long)v297 ^ (unsigned long long)v79);
                v301 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v300 >> 64), (unsigned long long)v300);
                v302 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v299 ^ v79) >> 64), (unsigned long long)v299 ^ (unsigned long long)v79);
                v303 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v302 >> 64), (unsigned long long)v302);
                v304 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v301 ^ v88) >> 64), (unsigned long long)v301 ^ (unsigned long long)v88);
                v305 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v304 >> 64), (unsigned long long)v304);
                v306 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v303 ^ v88) >> 64), (unsigned long long)v303 ^ (unsigned long long)v88);
                v307 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v306 >> 64), (unsigned long long)v306);
                v308 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v305 ^ v87) >> 64), (unsigned long long)v305 ^ (unsigned long long)v87);
                v309 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v308 >> 64), (unsigned long long)v308);
                v310 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v307 ^ v87) >> 64), (unsigned long long)v307 ^ (unsigned long long)v87);
                v311 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v310 >> 64), (unsigned long long)v310);
                v312 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v309 ^ v91) >> 64), (unsigned long long)v309 ^ (unsigned long long)v91);
                v313 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v312 >> 64), (unsigned long long)v312);
                v314 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v311 ^ v91) >> 64), (unsigned long long)v311 ^ (unsigned long long)v91);
                v315 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v314 >> 64), (unsigned long long)v314);
                v316 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v313 ^ v90) >> 64), (unsigned long long)v313 ^ (unsigned long long)v90);
                v317 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v315 ^ v90) >> 64), (unsigned long long)v315 ^ (unsigned long long)v90);
                v318 = v317;
                v319 = arm64g_calculate_condition(2, v95, 32, 0);
                if (!(v319 & 1))
                {
                    *a1 = v316 ^ v92;
                    a1[1] = v318 ^ v92;
                }
                else
                {
                    *a1 = v318 ^ v92;
                }
            }
            else
            {
                v320 = v78 + 1;
                v321 = v77 - 32;
                v322 = v83 + 2;
                v323 = *v78;
                v324 = v40;
                if (v77 >= 32)
                {
                    v324 = *v78;
                    v323 = *v320;
                    v325 = v320 + 1;
                    if (v321 >= 32)
                    {
                        v326 = *(int128_t *)v325;
                        v327 = v325 + 16;
                        v328 = *v327;
                        v325 = v327 + 1;
                        v329 = v321 - 32;
                        v330 = v83;
                        do
                        {
                            do
                            {
                                l = v330;
                                v332 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v40 ^ v80) >> 64), (unsigned long long)v40 ^ (unsigned long long)v80);
                                v333 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v332 >> 64), (unsigned long long)v332);
                                v334 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v324 ^ v80) >> 64), (unsigned long long)v324 ^ (unsigned long long)v80);
                                v335 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v334 >> 64), (unsigned long long)v334);
                                v336 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v323 ^ v80) >> 64), (unsigned long long)v323 ^ (unsigned long long)v80);
                                v337 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v336 >> 64), (unsigned long long)v336);
                                v338 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v326 ^ v80) >> 64), (unsigned long long)v326 ^ (unsigned long long)v80);
                                v339 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v338 >> 64), (unsigned long long)v338);
                                v340 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v328 ^ v80) >> 64), (unsigned long long)v328 ^ (unsigned long long)v80);
                                v341 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v340 >> 64), (unsigned long long)v340);
                                v80 = *v93;
                                v342 = v93 + 1;
                                v343 = l - 2;
                                v344 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v333 ^ v79) >> 64), (unsigned long long)v333 ^ (unsigned long long)v79);
                                v345 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v344 >> 64), (unsigned long long)v344);
                                v40 = v345;
                                v346 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v335 ^ v79) >> 64), (unsigned long long)v335 ^ (unsigned long long)v79);
                                v347 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v346 >> 64), (unsigned long long)v346);
                                v324 = v347;
                                v348 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v337 ^ v79) >> 64), (unsigned long long)v337 ^ (unsigned long long)v79);
                                v349 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v348 >> 64), (unsigned long long)v348);
                                v323 = v349;
                                v350 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v339 ^ v79) >> 64), (unsigned long long)v339 ^ (unsigned long long)v79);
                                v351 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v350 >> 64), (unsigned long long)v350);
                                v326 = v351;
                                v352 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v341 ^ v79) >> 64), (unsigned long long)v341 ^ (unsigned long long)v79);
                                v353 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v352 >> 64), (unsigned long long)v352);
                                v328 = v353;
                                v79 = v342->field_0;
                                v93 = &v342->field_10;
                                v330 = v343;
                            } while (2 < (int)l);
                            v354 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v40 ^ v80) >> 64), (unsigned long long)v40 ^ (unsigned long long)v80);
                            v355 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v354 >> 64), (unsigned long long)v354);
                            v356 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v324 ^ v80) >> 64), (unsigned long long)v324 ^ (unsigned long long)v80);
                            v357 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v356 >> 64), (unsigned long long)v356);
                            v358 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v323 ^ v80) >> 64), (unsigned long long)v323 ^ (unsigned long long)v80);
                            v359 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v358 >> 64), (unsigned long long)v358);
                            v360 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v326 ^ v80) >> 64), (unsigned long long)v326 ^ (unsigned long long)v80);
                            v361 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v360 >> 64), (unsigned long long)v360);
                            v362 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v328 ^ v80) >> 64), (unsigned long long)v328 ^ (unsigned long long)v80);
                            v363 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v362 >> 64), (unsigned long long)v362);
                            v364 = v329 - 80;
                            v365 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v355 ^ v79) >> 64), (unsigned long long)v355 ^ (unsigned long long)v79);
                            v366 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v365 >> 64), (unsigned long long)v365);
                            v367 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v357 ^ v79) >> 64), (unsigned long long)v357 ^ (unsigned long long)v79);
                            v368 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v367 >> 64), (unsigned long long)v367);
                            v369 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v359 ^ v79) >> 64), (unsigned long long)v359 ^ (unsigned long long)v79);
                            v370 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v369 >> 64), (unsigned long long)v369);
                            v371 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v361 ^ v79) >> 64), (unsigned long long)v361 ^ (unsigned long long)v79);
                            v372 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v371 >> 64), (unsigned long long)v371);
                            v373 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v363 ^ v79) >> 64), (unsigned long long)v363 ^ (unsigned long long)v79);
                            v374 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v373 >> 64), (unsigned long long)v373);
                            if (64 < (long long)v329)
                                v375 = 0;
                            else
                                v375 = v364;
                            v376 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v366 ^ v85) >> 64), (unsigned long long)v366 ^ (unsigned long long)v85);
                            v377 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v376 >> 64), (unsigned long long)v376);
                            v378 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v368 ^ v85) >> 64), (unsigned long long)v368 ^ (unsigned long long)v85);
                            v379 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v378 >> 64), (unsigned long long)v378);
                            v380 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v370 ^ v85) >> 64), (unsigned long long)v370 ^ (unsigned long long)v85);
                            v381 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v380 >> 64), (unsigned long long)v380);
                            v382 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v372 ^ v85) >> 64), (unsigned long long)v372 ^ (unsigned long long)v85);
                            v383 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v382 >> 64), (unsigned long long)v382);
                            v384 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v374 ^ v85) >> 64), (unsigned long long)v374 ^ (unsigned long long)v85);
                            v385 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v384 >> 64), (unsigned long long)v384);
                            v386 = v325 + v375;
                            v387 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v377 ^ v84) >> 64), (unsigned long long)v377 ^ (unsigned long long)v84);
                            v388 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v387 >> 64), (unsigned long long)v387);
                            v389 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v379 ^ v84) >> 64), (unsigned long long)v379 ^ (unsigned long long)v84);
                            v390 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v389 >> 64), (unsigned long long)v389);
                            v391 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v381 ^ v84) >> 64), (unsigned long long)v381 ^ (unsigned long long)v84);
                            v392 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v391 >> 64), (unsigned long long)v391);
                            v393 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v383 ^ v84) >> 64), (unsigned long long)v383 ^ (unsigned long long)v84);
                            v394 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v393 >> 64), (unsigned long long)v393);
                            v395 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v385 ^ v84) >> 64), (unsigned long long)v385 ^ (unsigned long long)v84);
                            v396 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v395 >> 64), (unsigned long long)v395);
                            v397 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v388 ^ v88) >> 64), (unsigned long long)v388 ^ (unsigned long long)v88);
                            v398 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v397 >> 64), (unsigned long long)v397);
                            v399 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v390 ^ v88) >> 64), (unsigned long long)v390 ^ (unsigned long long)v88);
                            v400 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v399 >> 64), (unsigned long long)v399);
                            v401 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v392 ^ v88) >> 64), (unsigned long long)v392 ^ (unsigned long long)v88);
                            v402 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v401 >> 64), (unsigned long long)v401);
                            v403 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v394 ^ v88) >> 64), (unsigned long long)v394 ^ (unsigned long long)v88);
                            v404 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v403 >> 64), (unsigned long long)v403);
                            v405 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v396 ^ v88) >> 64), (unsigned long long)v396 ^ (unsigned long long)v88);
                            v406 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v405 >> 64), (unsigned long long)v405);
                            v407 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v398 ^ v87) >> 64), (unsigned long long)v398 ^ (unsigned long long)v87);
                            v408 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v407 >> 64), (unsigned long long)v407);
                            v409 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v400 ^ v87) >> 64), (unsigned long long)v400 ^ (unsigned long long)v87);
                            v410 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v409 >> 64), (unsigned long long)v409);
                            v411 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v402 ^ v87) >> 64), (unsigned long long)v402 ^ (unsigned long long)v87);
                            v412 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v411 >> 64), (unsigned long long)v411);
                            v413 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v404 ^ v87) >> 64), (unsigned long long)v404 ^ (unsigned long long)v87);
                            v414 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v413 >> 64), (unsigned long long)v413);
                            v415 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v406 ^ v87) >> 64), (unsigned long long)v406 ^ (unsigned long long)v87);
                            v416 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v415 >> 64), (unsigned long long)v415);
                            v417 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v408 ^ v91) >> 64), (unsigned long long)v408 ^ (unsigned long long)v91);
                            v418 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v417 >> 64), (unsigned long long)v417);
                            v419 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v410 ^ v91) >> 64), (unsigned long long)v410 ^ (unsigned long long)v91);
                            v420 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v419 >> 64), (unsigned long long)v419);
                            v421 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v412 ^ v91) >> 64), (unsigned long long)v412 ^ (unsigned long long)v91);
                            v422 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v421 >> 64), (unsigned long long)v421);
                            v423 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v414 ^ v91) >> 64), (unsigned long long)v414 ^ (unsigned long long)v91);
                            v424 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v423 >> 64), (unsigned long long)v423);
                            v425 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v416 ^ v91) >> 64), (unsigned long long)v416 ^ (unsigned long long)v91);
                            v426 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v425 >> 64), (unsigned long long)v425);
                            v427 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v418 ^ v90) >> 64), (unsigned long long)v418 ^ (unsigned long long)v90);
                            v428 = v427;
                            v429 = v386 + 1;
                            v430 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v420 ^ v90) >> 64), (unsigned long long)v420 ^ (unsigned long long)v90);
                            v431 = v430;
                            v432 = v429 + 1;
                            v433 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v422 ^ v90) >> 64), (unsigned long long)v422 ^ (unsigned long long)v90);
                            v434 = v433;
                            v435 = v432 + 1;
                            v436 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v424 ^ v90) >> 64), (unsigned long long)v424 ^ (unsigned long long)v90);
                            v437 = v436;
                            v438 = v435 + 1;
                            v439 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v426 ^ v90) >> 64), (unsigned long long)v426 ^ (unsigned long long)v90);
                            v440 = v439;
                            v441 = *v438;
                            v325 = v438 + 1;
                            if (v364 == 0xffffffffffffffa0)
                            {
                                *a1 = v431 ^ v92;
                                v449 = a1 + 1;
                                *v449 = v434 ^ v92;
                                v450 = v449 + 1;
                                *v450 = v437 ^ v92;
                                v450[1] = v440 ^ v92;
                                v40 = v428;
                                goto LABEL_9ba20c;
                            }
                            v80 = a3->field_0;
                            v442 = &a3->field_10;
                            v40 = *v386;
                            v324 = *v429;
                            v323 = *v432;
                            v326 = *v435;
                            *a1 = v428 ^ v92;
                            v443 = a1 + 1;
                            v328 = v441;
                            *v443 = v431 ^ v92;
                            v444 = v443 + 1;
                            v330 = v83;
                            *v444 = v434 ^ v92;
                            v445 = v444 + 1;
                            v79 = v442->field_0;
                            v93 = &v442->field_10;
                            *v445 = v437 ^ v92;
                            v446 = v445 + 1;
                            *v446 = v440 ^ v92;
                            a1 = v446 + 1;
                            v447 = arm64g_calculate_condition(36, v329, 64, 0);
                            v329 = v364;
                        } while (v447 & 1);
                        v448 = v364 + 80;
                        if (!v448)
                            goto LABEL_9ba20c;
                        v322 = v83 + 2;
                        v321 = v448 - 48;
                        v40 = v323;
                        v324 = v326;
                        v323 = v328;
                        if (v448 >= 48)
                            goto LABEL_9ba040;
                    }
                    else
                    {
                        while (1)
                        {
LABEL_9ba040:
                            v451 = v322;
                            v452 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v40 ^ v80) >> 64), (unsigned long long)v40 ^ (unsigned long long)v80);
                            v453 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v452 >> 64), (unsigned long long)v452);
                            v454 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v324 ^ v80) >> 64), (unsigned long long)v324 ^ (unsigned long long)v80);
                            v455 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v454 >> 64), (unsigned long long)v454);
                            v456 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v323 ^ v80) >> 64), (unsigned long long)v323 ^ (unsigned long long)v80);
                            v457 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v456 >> 64), (unsigned long long)v456);
                            v80 = *v93;
                            v458 = v93 + 1;
                            v459 = (unsigned int)v451 - 2;
                            v460 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v453 ^ v79) >> 64), (unsigned long long)v453 ^ (unsigned long long)v79);
                            v461 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v460 >> 64), (unsigned long long)v460);
                            v40 = v461;
                            v462 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v455 ^ v79) >> 64), (unsigned long long)v455 ^ (unsigned long long)v79);
                            v463 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v462 >> 64), (unsigned long long)v462);
                            v324 = v463;
                            v464 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v457 ^ v79) >> 64), (unsigned long long)v457 ^ (unsigned long long)v79);
                            v465 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v464 >> 64), (unsigned long long)v464);
                            v323 = v465;
                            v79 = v458->field_0;
                            v93 = &v458->field_10;
                            v322 = v459;
                            if (2 < (int)v451)
                                continue;
                            v466 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v40 ^ v80) >> 64), (unsigned long long)v40 ^ (unsigned long long)v80);
                            v467 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v466 >> 64), (unsigned long long)v466);
                            v468 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v324 ^ v80) >> 64), (unsigned long long)v324 ^ (unsigned long long)v80);
                            v469 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v468 >> 64), (unsigned long long)v468);
                            v470 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v323 ^ v80) >> 64), (unsigned long long)v323 ^ (unsigned long long)v80);
                            v471 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v470 >> 64), (unsigned long long)v470);
                            v472 = v321 - 48;
                            if (v321 < 48)
                                v459 = v472;
                            v473 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v467 ^ v79) >> 64), (unsigned long long)v467 ^ (unsigned long long)v79);
                            v474 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v473 >> 64), (unsigned long long)v473);
                            v475 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v469 ^ v79) >> 64), (unsigned long long)v469 ^ (unsigned long long)v79);
                            v476 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v475 >> 64), (unsigned long long)v475);
                            v477 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v471 ^ v79) >> 64), (unsigned long long)v471 ^ (unsigned long long)v79);
                            v478 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v477 >> 64), (unsigned long long)v477);
                            v479 = v325 + v459;
                            v480 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v474 ^ v88) >> 64), (unsigned long long)v474 ^ (unsigned long long)v88);
                            v481 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v480 >> 64), (unsigned long long)v480);
                            v482 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v476 ^ v88) >> 64), (unsigned long long)v476 ^ (unsigned long long)v88);
                            v483 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v482 >> 64), (unsigned long long)v482);
                            v484 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v478 ^ v88) >> 64), (unsigned long long)v478 ^ (unsigned long long)v88);
                            v485 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v484 >> 64), (unsigned long long)v484);
                            v486 = *v479;
                            v487 = v479 + 1;
                            v488 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v481 ^ v87) >> 64), (unsigned long long)v481 ^ (unsigned long long)v87);
                            v489 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v488 >> 64), (unsigned long long)v488);
                            v490 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v483 ^ v87) >> 64), (unsigned long long)v483 ^ (unsigned long long)v87);
                            v491 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v490 >> 64), (unsigned long long)v490);
                            v492 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v485 ^ v87) >> 64), (unsigned long long)v485 ^ (unsigned long long)v87);
                            v493 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v492 >> 64), (unsigned long long)v492);
                            v494 = *v487;
                            v495 = v487 + 1;
                            v496 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v489 ^ v91) >> 64), (unsigned long long)v489 ^ (unsigned long long)v91);
                            v497 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v496 >> 64), (unsigned long long)v496);
                            v498 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v491 ^ v91) >> 64), (unsigned long long)v491 ^ (unsigned long long)v91);
                            v499 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v498 >> 64), (unsigned long long)v498);
                            v500 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v493 ^ v91) >> 64), (unsigned long long)v493 ^ (unsigned long long)v91);
                            v501 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v500 >> 64), (unsigned long long)v500);
                            v502 = *v495;
                            v325 = v495 + 1;
                            v503 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v497 ^ v90) >> 64), (unsigned long long)v497 ^ (unsigned long long)v90);
                            v504 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v499 ^ v90) >> 64), (unsigned long long)v499 ^ (unsigned long long)v90);
                            v505 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v501 ^ v90) >> 64), (unsigned long long)v501 ^ (unsigned long long)v90);
                            v80 = a3->field_0;
                            v506 = &a3->field_10;
                            v322 = v83 + 2;
                            v79 = v506->field_0;
                            v93 = &v506->field_10;
                            *a1 = v503 ^ v92;
                            v507 = a1 + 1;
                            v40 = v486;
                            *v507 = v504 ^ v92;
                            v508 = v507 + 1;
                            v324 = v494;
                            *v508 = v92 ^ v505;
                            a1 = v508 + 1;
                            v323 = v502;
                            v509 = arm64g_calculate_condition(36, v321, 48, 0);
                            v321 = v472;
                            if (!(v509 & 1))
                                break;
                        }
                        v510 = arm64g_calculate_condition(2, v472, 48, 0);
                        v321 = v472;
                        if (v510 & 1)
                            goto LABEL_9ba20c;
                    }
                }
                do
                {
                    v511 = v322;
                    v512 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v324 ^ v80) >> 64), (unsigned long long)v324 ^ (unsigned long long)v80);
                    v513 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v512 >> 64), (unsigned long long)v512);
                    v514 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v323 ^ v80) >> 64), (unsigned long long)v323 ^ (unsigned long long)v80);
                    v515 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v514 >> 64), (unsigned long long)v514);
                    v80 = *v93;
                    v516 = v93 + 1;
                    v517 = (unsigned int)v511 - 2;
                    v518 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v513 ^ v79) >> 64), (unsigned long long)v513 ^ (unsigned long long)v79);
                    v519 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v518 >> 64), (unsigned long long)v518);
                    v324 = v519;
                    v520 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v515 ^ v79) >> 64), (unsigned long long)v515 ^ (unsigned long long)v79);
                    v521 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v520 >> 64), (unsigned long long)v520);
                    v323 = v521;
                    v79 = v516->field_0;
                    v93 = &v516->field_10;
                    v322 = v517;
                } while (2 < (int)v511);
                v522 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v324 ^ v80) >> 64), (unsigned long long)v324 ^ (unsigned long long)v80);
                v523 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v522 >> 64), (unsigned long long)v522);
                v524 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v323 ^ v80) >> 64), (unsigned long long)v323 ^ (unsigned long long)v80);
                v525 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v524 >> 64), (unsigned long long)v524);
                v526 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v523 ^ v79) >> 64), (unsigned long long)v523 ^ (unsigned long long)v79);
                v527 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v526 >> 64), (unsigned long long)v526);
                v528 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v525 ^ v79) >> 64), (unsigned long long)v525 ^ (unsigned long long)v79);
                v529 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v528 >> 64), (unsigned long long)v528);
                v530 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v527 ^ v88) >> 64), (unsigned long long)v527 ^ (unsigned long long)v88);
                v531 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v530 >> 64), (unsigned long long)v530);
                v532 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v529 ^ v88) >> 64), (unsigned long long)v529 ^ (unsigned long long)v88);
                v533 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v532 >> 64), (unsigned long long)v532);
                v534 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v531 ^ v87) >> 64), (unsigned long long)v531 ^ (unsigned long long)v87);
                v535 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v534 >> 64), (unsigned long long)v534);
                v536 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v533 ^ v87) >> 64), (unsigned long long)v533 ^ (unsigned long long)v87);
                v537 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v536 >> 64), (unsigned long long)v536);
                v538 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v535 ^ v91) >> 64), (unsigned long long)v535 ^ (unsigned long long)v91);
                v539 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v538 >> 64), (unsigned long long)v538);
                v540 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v537 ^ v91) >> 64), (unsigned long long)v537 ^ (unsigned long long)v91);
                v541 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v540 >> 64), (unsigned long long)v540);
                v542 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v539 ^ v90) >> 64), (unsigned long long)v539 ^ (unsigned long long)v90);
                v543 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v541 ^ v90) >> 64), (unsigned long long)v541 ^ (unsigned long long)v90);
                v544 = v543;
                v545 = arm64g_calculate_condition(2, v321, 32, 0);
                if (!(v545 & 1))
                {
                    *a1 = v542 ^ v92;
                    a1[1] = v544 ^ v92;
                }
                else
                {
                    *a1 = v544 ^ v92;
                }
            }
        }
LABEL_9ba20c:
    }
    return (unsigned long long)v40;
}
