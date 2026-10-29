/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bc080..0x9bc908 (2184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bc080_9 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    char padding_60[64];
    unsigned int field_a0;
} st_9bc080_9;

typedef struct st_9bc080_3 {
    uint128_t field_0;
    char field_10;
} st_9bc080_3;

typedef struct st_9bc080_8 {
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
} st_9bc080_8;

typedef struct st_9bc080_5 {
    uint128_t field_0;
    char padding_10[176];
    unsigned int field_c0;
} st_9bc080_5;

typedef struct st_9bc080_7 {
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
} st_9bc080_7;

typedef struct st_9bc080_4 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char padding_30[176];
    unsigned int field_e0;
} st_9bc080_4;

typedef struct st_9bc080_1 {
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
} st_9bc080_1;

typedef struct st_9bc080_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40;
    char padding_41[175];
    unsigned int field_f0;
} st_9bc080_0;

typedef struct st_9bc080_12 {
    uint128_t field_0;
    uint128_t field_10;
    char field_20;
} st_9bc080_12;

typedef struct st_9bc080_11 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char field_30;
} st_9bc080_11;

typedef struct st_9bc080_10 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40;
} st_9bc080_10;

typedef struct st_9bc080_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char field_50;
} st_9bc080_2;

typedef struct st_9bc080_6 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char padding_30[64];
    unsigned int field_70;
} st_9bc080_6;


void sub_9bc080(void* a0, void* iter, unsigned long a2, st_9bc080_1 *a3, st_9bc080_0 *a4, uint128_t *a5)
{
    uint128_t v8;  // q0
    st_9bc080_4 *v9;  // x4
    unsigned int v18;  // w6
    uint128_t v108;  // q22
    uint128_t v109;  // q7
    unsigned long long v110;  // x10
    unsigned long v111;  // x9
    uint128_t v112;  // q10
    uint128_t *v113;  // x7
    unsigned long long v114;  // x2
    unsigned long v115;  // cc_dep1
    uint128_t v116;  // q0
    char *node;  // x0
    uint128_t v19;  // 4115
    unsigned long long v118;  // 4108
    unsigned long long v119;  // 4108
    void* v120;  // x0
    unsigned long long v121;  // x2
    unsigned long v122;  // x6
    uint128_t v123;  // q28
    uint128_t v124;  // q29
    uint128_t v125;  // q1
    char *v126;  // x0
    uint128_t v127;  // q3
    uint128_t v20;  // 4117
    uint128_t v128;  // q24
    uint128_t v129;  // q6
    uint128_t v130;  // q8
    char *v131;  // x0
    unsigned long long v132;  // x10
    unsigned long long v133;  // x9
    uint128_t v134;  // q11
    uint128_t v135;  // q25
    uint128_t v136;  // q26
    unsigned long long v137;  // x2
    uint128_t v21;  // 4099
    unsigned int v138;  // w6
    uint128_t v139;  // q8
    unsigned int m;  // w6
    uint128_t v141;  // 4099
    uint128_t v142;  // 4101
    uint128_t v143;  // 4105
    uint128_t v144;  // 4107
    uint128_t v145;  // 4111
    uint128_t v146;  // 4113
    uint128_t v147;  // 4117
    uint128_t v22;  // 4101
    uint128_t v148;  // 4119
    uint128_t v149;  // 4123
    uint128_t v150;  // 4125
    st_9bc080_8 *v151;  // x7
    unsigned int v152;  // w6
    uint128_t v153;  // 4139
    uint128_t v154;  // 4141
    uint128_t v155;  // 4145
    uint128_t v156;  // 4147
    uint128_t v157;  // 4151
    uint128_t v23;  // 4108
    uint128_t v158;  // 4153
    uint128_t v159;  // 4157
    uint128_t v160;  // 4159
    uint128_t v161;  // 4163
    uint128_t v162;  // 4165
    uint128_t v163;  // 4099
    uint128_t v164;  // 4101
    uint128_t v165;  // 4105
    uint128_t v166;  // 4107
    uint128_t v167;  // 4111
    uint128_t v24;  // q6
    uint128_t v168;  // 4113
    uint128_t v169;  // 4117
    uint128_t v170;  // 4119
    uint128_t v171;  // 4123
    uint128_t v172;  // 4125
    uint128_t v173;  // 4133
    uint128_t v174;  // 4135
    uint128_t v175;  // 4139
    uint128_t v176;  // 4141
    uint128_t v177;  // 4145
    uint128_t *v25;  // x3
    uint128_t v178;  // 4147
    uint128_t v179;  // 4151
    uint128_t v180;  // 4153
    uint128_t v181;  // 4157
    uint128_t v182;  // 4159
    unsigned long long v183;  // x6
    uint128_t v184;  // 4103
    uint128_t v185;  // 4105
    uint128_t v186;  // 4109
    uint128_t v187;  // 4111
    uint128_t v26;  // 4129
    uint128_t v188;  // 4115
    uint128_t v189;  // 4117
    uint128_t v190;  // 4121
    uint128_t v191;  // 4123
    uint128_t v192;  // 4127
    uint128_t v193;  // 4129
    st_9bc080_2 *v194;  // x0
    uint128_t v195;  // 4140
    uint128_t v196;  // 4142
    uint128_t v197;  // 4146
    uint128_t v27;  // 4131
    uint128_t v198;  // 4148
    uint128_t v199;  // 4152
    uint128_t v200;  // 4154
    uint128_t v201;  // 4158
    uint128_t v202;  // 4160
    uint128_t v203;  // 4164
    uint128_t v204;  // 4166
    uint128_t v205;  // 4170
    uint128_t v206;  // 4172
    uint128_t v207;  // 4176
    uint128_t v10;  // q6
    uint128_t v28;  // q17
    uint128_t v208;  // 4178
    uint128_t v209;  // 4182
    uint128_t v210;  // 4184
    uint128_t v211;  // 4188
    uint128_t v212;  // 4190
    uint128_t v213;  // 4194
    uint128_t v214;  // 4196
    uint128_t v215;  // 4200
    uint128_t v216;  // 4202
    uint128_t v217;  // 4206
    uint128_t v29;  // q16
    uint128_t v218;  // 4208
    uint128_t v219;  // 4212
    uint128_t v220;  // 4214
    uint128_t v221;  // 4218
    uint128_t v222;  // 4220
    uint128_t v223;  // 4224
    uint128_t v224;  // 4226
    uint128_t v225;  // 4230
    uint128_t v226;  // 4232
    uint128_t v227;  // 4236
    uint128_t *v30;  // x3
    uint128_t v228;  // 4238
    uint128_t v229;  // 4242
    uint128_t v230;  // 4244
    uint128_t v231;  // 4248
    uint128_t v232;  // 4250
    uint128_t v233;  // 4254
    uint128_t v234;  // 4256
    uint128_t v235;  // q4
    uint128_t v236;  // 4264
    unsigned long long v237;  // x10
    uint128_t v31;  // 4139
    unsigned long v238;  // x9
    uint128_t v239;  // q2
    st_9bc080_10 *v240;  // x0
    uint128_t v241;  // 4290
    uint128_t v242;  // q1
    unsigned long long v243;  // x10
    unsigned long v244;  // x9
    uint128_t v245;  // q17
    st_9bc080_11 *v246;  // x0
    uint128_t v247;  // 4316
    uint128_t v32;  // 4141
    uint128_t v248;  // q24
    unsigned long long v249;  // x10
    unsigned long v250;  // x9
    uint128_t v251;  // q30
    uint128_t v252;  // q27
    st_9bc080_12 *v253;  // x0
    uint128_t v254;  // 4107
    uint128_t v255;  // q25
    unsigned long long v256;  // x10
    unsigned long v257;  // x9
    uint128_t v33;  // q0
    uint128_t v258;  // q31
    st_9bc080_3 *v259;  // x0
    uint128_t v260;  // 4133
    uint128_t v261;  // q26
    st_9bc080_7 *v262;  // x7
    void* v263;  // x1
    void* v264;  // x1
    void* v265;  // x1
    void* v266;  // x1
    unsigned long long v267;  // 4186
    unsigned int v34;  // w6
    unsigned long long v268;  // 4106
    unsigned long long v269;  // 4140
    char *v270;  // x0
    void* v271;  // x1
    void* v272;  // x1
    unsigned long v273;  // x6
    uint128_t v274;  // 4099
    uint128_t v275;  // 4101
    uint128_t v276;  // 4105
    uint128_t v277;  // 4107
    unsigned int j;  // w6
    uint128_t v278;  // 4111
    uint128_t v279;  // 4113
    st_9bc080_8 *v280;  // x7
    unsigned long v281;  // x6
    uint128_t v282;  // 4127
    uint128_t v283;  // 4129
    uint128_t v284;  // 4133
    uint128_t v285;  // 4135
    uint128_t v286;  // 4139
    uint128_t v287;  // 4141
    uint128_t v36;  // 4099
    uint128_t v288;  // 4099
    uint128_t v289;  // 4101
    uint128_t v290;  // 4105
    uint128_t v291;  // 4107
    uint128_t v292;  // 4111
    uint128_t v293;  // 4113
    unsigned long long v294;  // x2
    uint128_t v295;  // 4099
    uint128_t v296;  // 4101
    uint128_t v297;  // 4105
    uint128_t v37;  // 4101
    uint128_t v298;  // 4107
    uint128_t v299;  // 4111
    uint128_t v300;  // 4113
    st_9bc080_3 *v301;  // x0
    uint128_t v302;  // 4160
    uint128_t v303;  // 4162
    uint128_t v304;  // 4166
    uint128_t v305;  // 4168
    uint128_t v306;  // 4172
    uint128_t v307;  // 4174
    unsigned int v11;  // w6
    st_9bc080_9 *v38;  // x3
    uint128_t v308;  // 4178
    uint128_t v309;  // 4180
    uint128_t v310;  // 4184
    uint128_t v311;  // 4186
    uint128_t v312;  // 4190
    uint128_t v313;  // 4192
    uint128_t v314;  // 4196
    uint128_t v315;  // 4198
    uint128_t v316;  // 4202
    uint128_t v317;  // 4204
    uint128_t v39;  // 4109
    uint128_t v318;  // 4208
    uint128_t v319;  // 4210
    uint128_t v320;  // q27
    uint128_t v321;  // 4218
    uint128_t v322;  // 4222
    uint128_t v323;  // 4226
    st_9bc080_7 *v324;  // x7
    void* v325;  // x1
    void* v326;  // x1
    unsigned long long v327;  // 4367
    uint128_t v40;  // 4111
    uint128_t v328;  // q1
    uint128_t v329;  // q24
    unsigned long long v330;  // 4114
    unsigned long v331;  // x6
    uint128_t v332;  // 4099
    uint128_t v333;  // 4101
    uint128_t v334;  // 4105
    uint128_t v335;  // 4107
    st_9bc080_8 *v336;  // x7
    unsigned long v337;  // x6
    uint128_t v338;  // 4121
    uint128_t v339;  // 4123
    uint128_t v340;  // 4127
    uint128_t v341;  // 4129
    uint128_t v342;  // 4099
    uint128_t v343;  // 4101
    uint128_t v344;  // 4105
    uint128_t v345;  // 4107
    uint128_t v346;  // 4111
    uint128_t v347;  // 4113
    uint128_t *v42;  // x3
    uint128_t v348;  // 4117
    uint128_t v349;  // 4119
    uint128_t v350;  // 4123
    uint128_t v351;  // 4125
    uint128_t v352;  // 4129
    uint128_t v353;  // 4131
    uint128_t v354;  // 4139
    uint128_t v355;  // 4141
    uint128_t v356;  // 4145
    uint128_t v357;  // 4147
    uint128_t v43;  // 4103
    uint128_t v358;  // q5
    uint128_t v359;  // 4155
    uint128_t v360;  // 4157
    uint128_t v361;  // 4161
    uint128_t v362;  // 4163
    uint128_t v363;  // 4171
    uint128_t v364;  // 4175
    uint128_t v365;  // q24
    unsigned long long v366;  // 4226
    void* v367;  // x1
    uint128_t v44;  // 4105
    uint128_t v368;  // q26
    uint128_t v369;  // q0
    st_9bc080_7 *v370;  // x3
    unsigned int v371;  // w6
    uint128_t v372;  // q1
    uint128_t *v373;  // x3
    unsigned int l;  // w6
    uint128_t v375;  // 4099
    uint128_t v376;  // 4101
    st_9bc080_8 *v377;  // x3
    uint128_t v45;  // 4109
    unsigned int v378;  // w6
    uint128_t v379;  // 4115
    uint128_t v380;  // 4117
    uint128_t v381;  // 4099
    uint128_t v382;  // 4101
    uint128_t v383;  // 4108
    unsigned long long v384;  // x21
    char v385;  // x14
    uint128_t v46;  // 4111
    st_9bc080_6 *v47;  // x3
    uint128_t v12;  // q1
    uint128_t v48;  // 4119
    uint128_t v49;  // 4121
    uint128_t v50;  // 4125
    uint128_t v51;  // 4127
    uint128_t v52;  // 4135
    uint128_t v53;  // 4137
    uint128_t v54;  // 4141
    uint128_t v55;  // 4143
    uint128_t v56;  // 4150
    uint128_t v57;  // 4152
    uint128_t *v13;  // x4
    uint128_t v58;  // 4156
    unsigned long long v59;  // x19
    unsigned long long v60;  // x20
    unsigned long long v61;  // x21
    unsigned long long v62;  // x22
    unsigned long long v63;  // d8
    unsigned long long v64;  // d9
    unsigned long long v65;  // d10
    unsigned long long v66;  // d11
    unsigned long long v67;  // x21
    unsigned int i;  // w6
    unsigned long long v68;  // x2
    unsigned long long v69;  // x2
    unsigned long long v70;  // x8
    uint128_t v71;  // q0
    st_9bc080_4 *v72;  // x4
    uint128_t v73;  // q6
    unsigned int v74;  // w6
    uint128_t v75;  // q1
    uint128_t *v76;  // x4
    unsigned int k;  // w6
    uint128_t v15;  // 4099
    uint128_t v78;  // 4099
    uint128_t v79;  // 4101
    st_9bc080_5 *v80;  // x4
    unsigned int v81;  // w6
    uint128_t v82;  // 4115
    uint128_t v83;  // 4117
    uint128_t v84;  // 4099
    uint128_t v85;  // 4101
    uint128_t v86;  // 4108
    uint128_t v87;  // q6
    uint128_t v16;  // 4101
    unsigned long long v88;  // x9
    unsigned long v89;  // x10
    unsigned long long v90;  // x10
    unsigned long v91;  // x9
    uint128_t v92;  // q8
    unsigned long long v93;  // x10
    unsigned long v94;  // x9
    uint128_t v95;  // q9
    uint128_t v96;  // q17
    uint128_t v97;  // q16
    st_9bc080_5 *v17;  // x4
    unsigned long v98;  // x5
    st_9bc080_1 *v99;  // x7
    unsigned int v100;  // w5
    uint128_t v101;  // q19
    uint128_t v102;  // q18
    uint128_t *v103;  // x7
    uint128_t v104;  // q21
    uint128_t v105;  // q20
    uint128_t *v106;  // x7
    uint128_t v107;  // q23
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    unsigned long long v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]

    if (a2 == 16)
    {
        v8 = a4->field_0;
        v9 = &a4->field_10;
        v10 = *a5;
        v11 = a4->field_f0 - 2;
        v12 = v9->field_0;
        v13 = &v9->field_10;
        do
        {
            i = v11;
            v15 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v10 ^ v8) >> 64), (unsigned long long)v10 ^ (unsigned long long)v8);
            v16 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v15 >> 64), (unsigned long long)v15);
            v8 = *v13;
            v17 = v13 + 1;
            v18 = i - 2;
            v19 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v16 ^ v12) >> 64), (unsigned long long)v16 ^ (unsigned long long)v12);
            v20 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v19 >> 64), (unsigned long long)v19);
            v10 = v20;
            v12 = v17->field_0;
            v13 = v17->padding_10;
            v11 = v18;
        } while (2 < (int)i);
        v21 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v10 ^ v8) >> 64), (unsigned long long)v10 ^ (unsigned long long)v8);
        v22 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v21 >> 64), (unsigned long long)v21);
        v23 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v22 ^ v12) >> 64), (unsigned long long)v22 ^ (unsigned long long)v12);
        v24 = *v13 ^ v23;
        v25 = &a3->field_20;
        v26 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((*(int128_t *)a0 ^ v24 ^ a3->field_0) >> 64), (long long)*(int128_t *)a0 ^ (unsigned long long)v24 ^ (unsigned long long)a3->field_0);
        v27 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v26 >> 64), (unsigned long long)v26);
        v28 = v25[1];
        v29 = *v25;
        v30 = v25 + 2;
        v31 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v27 ^ a3->field_10) >> 64), (unsigned long long)v27 ^ (unsigned long long)a3->field_10);
        v32 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v31 >> 64), (unsigned long long)v31);
        v33 = v32;
        v34 = a3->field_f0 - 10;
        if (a3->field_f0 != 10)
        {
            do
            {
                j = v34;
                v36 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v33 ^ v29) >> 64), (unsigned long long)v33 ^ (unsigned long long)v29);
                v37 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v36 >> 64), (unsigned long long)v36);
                v29 = *v30;
                v38 = v30 + 1;
                v39 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v37 ^ v28) >> 64), (unsigned long long)v37 ^ (unsigned long long)v28);
                v40 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v39 >> 64), (unsigned long long)v39);
                v33 = v40;
                v28 = v38->field_0;
                v30 = &v38->field_10;
                v34 = j - 2;
            } while (2 < (int)j);
        }
        v42 = v30 + 2;
        v43 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v33 ^ v29) >> 64), (unsigned long long)v33 ^ (unsigned long long)v29);
        v44 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v43 >> 64), (unsigned long long)v43);
        v45 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v44 ^ v28) >> 64), (unsigned long long)v44 ^ (unsigned long long)v28);
        v46 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v45 >> 64), (unsigned long long)v45);
        v47 = v42 + 2;
        v48 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v46 ^ *v30) >> 64), (unsigned long long)v46 ^ (unsigned long long)*v30);
        v49 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v48 >> 64), (unsigned long long)v48);
        v50 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v49 ^ v30[1]) >> 64), (unsigned long long)v49 ^ (unsigned long long)v30[1]);
        v51 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v50 >> 64), (unsigned long long)v50);
        v52 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v51 ^ *v42) >> 64), (unsigned long long)v51 ^ (unsigned long long)*v42);
        v53 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v52 >> 64), (unsigned long long)v52);
        v54 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v53 ^ v42[1]) >> 64), (unsigned long long)v53 ^ (unsigned long long)v42[1]);
        v55 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v54 >> 64), (unsigned long long)v54);
        v56 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v55 ^ v47->field_0) >> 64), (unsigned long long)v55 ^ (unsigned long long)v47->field_0);
        v57 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v56 >> 64), (unsigned long long)v56);
        v58 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v57 ^ v47->field_10) >> 64), (unsigned long long)v57 ^ (unsigned long long)v47->field_10);
        *(uint128_t *)iter = v47->field_20 ^ v58 ^ v24;
    }
    else
    {
        v0 = v59;
        v1 = v60;
        v6 = v61;
        v7 = v62;
        v4 = v63;
        v5 = v64;
        v2 = v65;
        v3 = v66;
        v67 = a2 & 15;
        v68 = a2 & 0xfffffffffffffff0;
        v69 = v68 - 16;
        v70 = 16;
        if (v68 < 16)
            goto LABEL_0x9bc974;
        v71 = a4->field_0;
        v72 = &a4->field_10;
        v73 = *a5;
        v74 = a4->field_f0 - 2;
        v75 = v72->field_0;
        v76 = &v72->field_10;
        do
        {
            k = v74;
            v78 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v73 ^ v71) >> 64), (unsigned long long)v73 ^ (unsigned long long)v71);
            v79 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v78 >> 64), (unsigned long long)v78);
            v71 = *v76;
            v80 = v76 + 1;
            v81 = k - 2;
            v82 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v79 ^ v75) >> 64), (unsigned long long)v79 ^ (unsigned long long)v75);
            v83 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v82 >> 64), (unsigned long long)v82);
            v73 = v83;
            v75 = v80->field_0;
            v76 = v80->padding_10;
            v74 = v81;
        } while (2 < (int)k);
        v84 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v73 ^ v71) >> 64), (unsigned long long)v73 ^ (unsigned long long)v71);
        v85 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v84 >> 64), (unsigned long long)v84);
        v86 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v85 ^ v75) >> 64), (unsigned long long)v85 ^ (unsigned long long)v75);
        v87 = *v76 ^ v86;
        v88 = (unsigned long long)v87;
        v89 = *(unsigned long long *)((void*)&v87 + 8);
        v90 = v89 * 2 | v88 >> 63;
        v91 = 135 & (int)((unsigned int)(__ROL__(v89, 32))) >> 31 ^ v88 * 2;
        v92 = _INSERT(__double_as_longlong(__longlong_as_double(v91)), 8, v90);
        v93 = v90 * 2 | v91 >> 63;
        v94 = 135 & (int)((unsigned int)(__ROL__(v90, 32))) >> 31 ^ v91 * 2;
        v95 = _INSERT(__double_as_longlong(__longlong_as_double(v94)), 8, v93);
        v96 = a3->field_10;
        v97 = a3->field_0;
        v98 = a3->field_f0 - 6;
        v99 = &(&a3->field_0)[v98];
        v100 = (unsigned int)v98 - 2;
        v101 = v99->field_10;
        v102 = v99->field_0;
        v103 = &v99->field_20;
        v104 = v103[1];
        v105 = *v103;
        v106 = v103 + 2;
        v107 = v106[1];
        v108 = *v106;
        v109 = v106[2];
        v110 = v93 * 2 | v94 >> 63;
        v111 = 135 & (int)((unsigned int)(__ROL__(v93, 32))) >> 31 ^ v94 * 2;
        v112 = _INSERT(__double_as_longlong(__longlong_as_double(v111)), 8, v110);
        v113 = &a3->field_20;
        if (v67 & 15)
        {
            v114 = v69 - 16;
            v115 = v69;
            if (v69 == 16)
            {
                v70 = 0;
                v116 = *(int128_t *)a0;
                node = a0 + 16;
                v118 = arm64g_calculate_condition(52, v115, 16, 0);
                if (!(v118 & 1))
                    goto LABEL_9bc298;
            }
            else
            {
                v116 = *(int128_t *)a0;
                node = a0 + 16;
                v119 = arm64g_calculate_condition(52, v115, 16, 0);
                if (v119 & 1)
                    goto LABEL_9bc89c;
LABEL_9bc298:
                a0 = node - 16;
                v69 = v114;
                goto LABEL_9bc29c;
            }
        }
        else
        {
LABEL_9bc29c:
            v116 = *(int128_t *)a0;
            v120 = a0 + v70;
            v121 = v69 - 32;
            v122 = v100 + 2;
            v123 = v116;
            node = v120 + 16;
            v124 = *(int128_t *)v120;
            if (v69 >= 32)
            {
                v116 ^= v87;
                v125 = v92 ^ *(int128_t *)v120;
                v126 = node + 16;
                v127 = v125;
                v128 = v95 ^ *(int128_t *)node;
                v129 = v87;
                v130 = v92;
                if (v121 >= 32)
                {
                    v131 = v126 + 16;
                    v132 = v110 * 2 | v111 >> 63;
                    v133 = 135 & (int)((unsigned int)(__ROL__(v110, 32))) >> 31 ^ v111 * 2;
                    v134 = _INSERT(__double_as_longlong(__longlong_as_double(v133)), 8, v132);
                    node = v131 + 16;
                    v135 = v112 ^ *(int128_t *)v126;
                    v136 = v134 ^ *(int128_t *)v131;
                    v137 = v121 - 32;
                    v138 = v100;
                    v129 = v87;
                    v139 = v92;
                    while (1)
                    {
                        do
                        {
                            m = v138;
                            v141 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v116 ^ v97) >> 64), (unsigned long long)v116 ^ (unsigned long long)v97);
                            v142 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v141 >> 64), (unsigned long long)v141);
                            v143 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v125 ^ v97) >> 64), (unsigned long long)v125 ^ (unsigned long long)v97);
                            v144 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v143 >> 64), (unsigned long long)v143);
                            v145 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v128 ^ v97) >> 64), (unsigned long long)v128 ^ (unsigned long long)v97);
                            v146 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v145 >> 64), (unsigned long long)v145);
                            v147 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v135 ^ v97) >> 64), (unsigned long long)v135 ^ (unsigned long long)v97);
                            v148 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v147 >> 64), (unsigned long long)v147);
                            v149 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v136 ^ v97) >> 64), (unsigned long long)v136 ^ (unsigned long long)v97);
                            v150 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v149 >> 64), (unsigned long long)v149);
                            v97 = *v113;
                            v151 = v113 + 1;
                            v152 = m - 2;
                            v153 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v142 ^ v96) >> 64), (unsigned long long)v142 ^ (unsigned long long)v96);
                            v154 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v153 >> 64), (unsigned long long)v153);
                            v116 = v154;
                            v155 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v144 ^ v96) >> 64), (unsigned long long)v144 ^ (unsigned long long)v96);
                            v156 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v155 >> 64), (unsigned long long)v155);
                            v125 = v156;
                            v157 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v146 ^ v96) >> 64), (unsigned long long)v146 ^ (unsigned long long)v96);
                            v158 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v157 >> 64), (unsigned long long)v157);
                            v128 = v158;
                            v159 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v148 ^ v96) >> 64), (unsigned long long)v148 ^ (unsigned long long)v96);
                            v160 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v159 >> 64), (unsigned long long)v159);
                            v135 = v160;
                            v161 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v150 ^ v96) >> 64), (unsigned long long)v150 ^ (unsigned long long)v96);
                            v162 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v161 >> 64), (unsigned long long)v161);
                            v136 = v162;
                            v96 = v151->field_0;
                            v113 = &v151->field_10;
                            v138 = v152;
                        } while (2 < (int)m);
                        v163 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v116 ^ v97) >> 64), (unsigned long long)v116 ^ (unsigned long long)v97);
                        v164 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v163 >> 64), (unsigned long long)v163);
                        v165 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v125 ^ v97) >> 64), (unsigned long long)v125 ^ (unsigned long long)v97);
                        v166 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v165 >> 64), (unsigned long long)v165);
                        v167 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v128 ^ v97) >> 64), (unsigned long long)v128 ^ (unsigned long long)v97);
                        v168 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v167 >> 64), (unsigned long long)v167);
                        v169 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v135 ^ v97) >> 64), (unsigned long long)v135 ^ (unsigned long long)v97);
                        v170 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v169 >> 64), (unsigned long long)v169);
                        v171 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v136 ^ v97) >> 64), (unsigned long long)v136 ^ (unsigned long long)v97);
                        v172 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v171 >> 64), (unsigned long long)v171);
                        v114 = v137 - 80;
                        v173 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v164 ^ v96) >> 64), (unsigned long long)v164 ^ (unsigned long long)v96);
                        v174 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v173 >> 64), (unsigned long long)v173);
                        v175 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v166 ^ v96) >> 64), (unsigned long long)v166 ^ (unsigned long long)v96);
                        v176 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v175 >> 64), (unsigned long long)v175);
                        v177 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v168 ^ v96) >> 64), (unsigned long long)v168 ^ (unsigned long long)v96);
                        v178 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v177 >> 64), (unsigned long long)v177);
                        v179 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v170 ^ v96) >> 64), (unsigned long long)v170 ^ (unsigned long long)v96);
                        v180 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v179 >> 64), (unsigned long long)v179);
                        v181 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v172 ^ v96) >> 64), (unsigned long long)v172 ^ (unsigned long long)v96);
                        v182 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v181 >> 64), (unsigned long long)v181);
                        if (80 < (long long)v137)
                            v183 = 0;
                        else
                            v183 = v114;
                        v184 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v174 ^ v102) >> 64), (unsigned long long)v174 ^ (unsigned long long)v102);
                        v185 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v184 >> 64), (unsigned long long)v184);
                        v186 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v176 ^ v102) >> 64), (unsigned long long)v176 ^ (unsigned long long)v102);
                        v187 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v186 >> 64), (unsigned long long)v186);
                        v188 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v178 ^ v102) >> 64), (unsigned long long)v178 ^ (unsigned long long)v102);
                        v189 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v188 >> 64), (unsigned long long)v188);
                        v190 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v180 ^ v102) >> 64), (unsigned long long)v180 ^ (unsigned long long)v102);
                        v191 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v190 >> 64), (unsigned long long)v190);
                        v192 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v182 ^ v102) >> 64), (unsigned long long)v182 ^ (unsigned long long)v102);
                        v193 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v192 >> 64), (unsigned long long)v192);
                        v194 = &node[v183];
                        v195 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v185 ^ v101) >> 64), (unsigned long long)v185 ^ (unsigned long long)v101);
                        v196 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v195 >> 64), (unsigned long long)v195);
                        v197 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v187 ^ v101) >> 64), (unsigned long long)v187 ^ (unsigned long long)v101);
                        v198 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v197 >> 64), (unsigned long long)v197);
                        v199 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v189 ^ v101) >> 64), (unsigned long long)v189 ^ (unsigned long long)v101);
                        v200 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v199 >> 64), (unsigned long long)v199);
                        v201 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v191 ^ v101) >> 64), (unsigned long long)v191 ^ (unsigned long long)v101);
                        v202 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v201 >> 64), (unsigned long long)v201);
                        v203 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v193 ^ v101) >> 64), (unsigned long long)v193 ^ (unsigned long long)v101);
                        v204 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v203 >> 64), (unsigned long long)v203);
                        v205 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v196 ^ v105) >> 64), (unsigned long long)v196 ^ (unsigned long long)v105);
                        v206 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v205 >> 64), (unsigned long long)v205);
                        v207 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v198 ^ v105) >> 64), (unsigned long long)v198 ^ (unsigned long long)v105);
                        v208 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v207 >> 64), (unsigned long long)v207);
                        v209 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v200 ^ v105) >> 64), (unsigned long long)v200 ^ (unsigned long long)v105);
                        v210 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v209 >> 64), (unsigned long long)v209);
                        v211 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v202 ^ v105) >> 64), (unsigned long long)v202 ^ (unsigned long long)v105);
                        v212 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v211 >> 64), (unsigned long long)v211);
                        v213 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v204 ^ v105) >> 64), (unsigned long long)v204 ^ (unsigned long long)v105);
                        v214 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v213 >> 64), (unsigned long long)v213);
                        v215 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v206 ^ v104) >> 64), (unsigned long long)v206 ^ (unsigned long long)v104);
                        v216 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v215 >> 64), (unsigned long long)v215);
                        v217 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v208 ^ v104) >> 64), (unsigned long long)v208 ^ (unsigned long long)v104);
                        v218 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v217 >> 64), (unsigned long long)v217);
                        v219 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v210 ^ v104) >> 64), (unsigned long long)v210 ^ (unsigned long long)v104);
                        v220 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v219 >> 64), (unsigned long long)v219);
                        v221 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v212 ^ v104) >> 64), (unsigned long long)v212 ^ (unsigned long long)v104);
                        v222 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v221 >> 64), (unsigned long long)v221);
                        v223 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v214 ^ v104) >> 64), (unsigned long long)v214 ^ (unsigned long long)v104);
                        v224 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v223 >> 64), (unsigned long long)v223);
                        v225 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v216 ^ v108) >> 64), (unsigned long long)v216 ^ (unsigned long long)v108);
                        v226 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v225 >> 64), (unsigned long long)v225);
                        v227 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v218 ^ v108) >> 64), (unsigned long long)v218 ^ (unsigned long long)v108);
                        v228 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v227 >> 64), (unsigned long long)v227);
                        v229 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v220 ^ v108) >> 64), (unsigned long long)v220 ^ (unsigned long long)v108);
                        v230 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v229 >> 64), (unsigned long long)v229);
                        v231 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v222 ^ v108) >> 64), (unsigned long long)v222 ^ (unsigned long long)v108);
                        v232 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v231 >> 64), (unsigned long long)v231);
                        v233 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v224 ^ v108) >> 64), (unsigned long long)v224 ^ (unsigned long long)v108);
                        v234 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v233 >> 64), (unsigned long long)v233);
                        v235 = v129 ^ v109;
                        v236 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v226 ^ v107) >> 64), (unsigned long long)v226 ^ (unsigned long long)v107);
                        v237 = v132 * 2 | v133 >> 63;
                        v238 = 135 & (int)((unsigned int)(__ROL__(v132, 32))) >> 31 ^ v133 * 2;
                        v129 = _INSERT(__double_as_longlong(__longlong_as_double(v238)), 8, v237);
                        v239 = v194->field_0;
                        v240 = &v194->field_10;
                        v241 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v228 ^ v107) >> 64), (unsigned long long)v228 ^ (unsigned long long)v107);
                        v242 = v241;
                        v243 = v237 * 2 | v238 >> 63;
                        v244 = 135 & (int)((unsigned int)(__ROL__(v237, 32))) >> 31 ^ v238 * 2;
                        v130 = _INSERT(__double_as_longlong(__longlong_as_double(v244)), 8, v243);
                        v245 = v95 ^ v109;
                        v127 = v240->field_0;
                        v246 = &v240->field_10;
                        v247 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v230 ^ v107) >> 64), (unsigned long long)v230 ^ (unsigned long long)v107);
                        v248 = v247;
                        v249 = v243 * 2 | v244 >> 63;
                        v250 = 135 & (int)((unsigned int)(__ROL__(v243, 32))) >> 31 ^ v244 * 2;
                        v95 = _INSERT(__double_as_longlong(__longlong_as_double(v250)), 8, v249);
                        v251 = v112 ^ v109;
                        v252 = v246->field_0;
                        v253 = &v246->field_10;
                        v254 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v232 ^ v107) >> 64), (unsigned long long)v232 ^ (unsigned long long)v107);
                        v255 = v254;
                        v256 = v249 * 2 | v250 >> 63;
                        v257 = 135 & (int)((unsigned int)(__ROL__(v249, 32))) >> 31 ^ v250 * 2;
                        v112 = _INSERT(__double_as_longlong(__longlong_as_double(v257)), 8, v256);
                        v258 = v134 ^ v109;
                        v123 = v253->field_0;
                        v259 = &v253->field_10;
                        v260 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v234 ^ v107) >> 64), (unsigned long long)v234 ^ (unsigned long long)v107);
                        v261 = v260;
                        v132 = v256 * 2 | v257 >> 63;
                        v133 = 135 & (int)((unsigned int)(__ROL__(v256, 32))) >> 31 ^ v257 * 2;
                        v134 = _INSERT(__double_as_longlong(__longlong_as_double(v133)), 8, v132);
                        v124 = v259->field_0;
                        node = &v259->field_10;
                        if (v114 == 0xffffffffffffffa0)
                            break;
                        v97 = a3->field_0;
                        v262 = &a3->field_10;
                        v116 = v129 ^ v239;
                        v125 = v130 ^ v127;
                        v128 = v95 ^ v252;
                        v135 = v112 ^ v123;
                        *(uint128_t *)iter = v236 ^ v235;
                        v263 = iter + 16;
                        v136 = v134 ^ v124;
                        *(uint128_t *)v263 = v242 ^ v139 ^ v109;
                        v264 = v263 + 16;
                        *(uint128_t *)v264 = v248 ^ v245;
                        v265 = v264 + 16;
                        v96 = v262->field_0;
                        v113 = &v262->field_10;
                        *(uint128_t *)v265 = v255 ^ v251;
                        v266 = v265 + 16;
                        *(uint128_t *)v266 = v261 ^ v258;
                        iter = v266 + 16;
                        v267 = arm64g_calculate_condition(36, v137, 80, 0);
                        v137 = v114;
                        v138 = v100;
                        v139 = v130;
                        if (!(v267 & 1))
                        {
                            v268 = arm64g_calculate_condition(18, v114, 16, 0);
                            if (!(v268 & 1))
                            {
                                v134 = v112;
                                v112 = v95;
                                v95 = v130;
                                v139 = v129;
                                v133 = (unsigned long long)v134;
                                v132 = *(unsigned long long *)((void*)&v134 + 8);
                                v116 = v239 ^ v129;
                                v125 = v127 ^ v139;
                                v128 = v95 ^ v252;
                                v135 = v112 ^ v123;
                                v136 = v134 ^ v124;
                                v269 = arm64g_calculate_condition(2, v114, 16, 0);
                                v137 = v114;
                                v138 = v100;
                                v130 = v139;
                                if (!(v269 & 1))
                                    goto LABEL_9bc5e8;
                            }
                            else
                            {
LABEL_9bc5e8:
                                v114 += 80;
                                if (!v114)
                                    goto LABEL_9bc89c;
                                v122 = v100 + 2;
                                v121 = v114 - 48;
                                if (v114 >= 48)
                                {
                                    v116 = v252 ^ v129;
                                    v125 = v123 ^ v130;
                                    v128 = v95 ^ v124;
                                    v126 = node;
                                    goto LABEL_9bc640;
                                }
                                goto LABEL_9bc7bc;
                            }
                        }
                    }
                    v270 = node + 16;
                    *(uint128_t *)iter = v235 ^ v242;
                    v271 = iter + 16;
                    *(uint128_t *)v271 = v245 ^ v248;
                    v272 = v271 + 16;
                    *(uint128_t *)&v272[16] = v258 ^ v261;
                    *(uint128_t *)v272 = v251 ^ v255;
                    iter = v272 + 32;
                    if (!(v67 & 15))
                        goto LABEL_0x9bc974;
                    v116 = *(int128_t *)v270;
                    node = v270 + 16;
                }
                else
                {
                    do
                    {
LABEL_9bc640:
                        v273 = v122;
                        v274 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v116 ^ v97) >> 64), (unsigned long long)v116 ^ (unsigned long long)v97);
                        v275 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v274 >> 64), (unsigned long long)v274);
                        v276 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v125 ^ v97) >> 64), (unsigned long long)v125 ^ (unsigned long long)v97);
                        v277 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v276 >> 64), (unsigned long long)v276);
                        v278 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v128 ^ v97) >> 64), (unsigned long long)v128 ^ (unsigned long long)v97);
                        v279 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v278 >> 64), (unsigned long long)v278);
                        v97 = *v113;
                        v280 = v113 + 1;
                        v281 = (unsigned int)v273 - 2;
                        v282 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v275 ^ v96) >> 64), (unsigned long long)v275 ^ (unsigned long long)v96);
                        v283 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v282 >> 64), (unsigned long long)v282);
                        v116 = v283;
                        v284 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v277 ^ v96) >> 64), (unsigned long long)v277 ^ (unsigned long long)v96);
                        v285 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v284 >> 64), (unsigned long long)v284);
                        v125 = v285;
                        v286 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v279 ^ v96) >> 64), (unsigned long long)v279 ^ (unsigned long long)v96);
                        v287 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v286 >> 64), (unsigned long long)v286);
                        v128 = v287;
                        v96 = v280->field_0;
                        v113 = &v280->field_10;
                        v122 = v281;
                    } while (2 < (int)v273);
                    v288 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v116 ^ v97) >> 64), (unsigned long long)v116 ^ (unsigned long long)v97);
                    v289 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v288 >> 64), (unsigned long long)v288);
                    v290 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v125 ^ v97) >> 64), (unsigned long long)v125 ^ (unsigned long long)v97);
                    v291 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v290 >> 64), (unsigned long long)v290);
                    v292 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v128 ^ v97) >> 64), (unsigned long long)v128 ^ (unsigned long long)v97);
                    v293 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v292 >> 64), (unsigned long long)v292);
                    v294 = v121 - 48;
                    if (v121 < 48)
                        v281 = v294;
                    v295 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v289 ^ v96) >> 64), (unsigned long long)v289 ^ (unsigned long long)v96);
                    v296 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v295 >> 64), (unsigned long long)v295);
                    v297 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v291 ^ v96) >> 64), (unsigned long long)v291 ^ (unsigned long long)v96);
                    v298 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v297 >> 64), (unsigned long long)v297);
                    v299 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v293 ^ v96) >> 64), (unsigned long long)v293 ^ (unsigned long long)v96);
                    v300 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v299 >> 64), (unsigned long long)v299);
                    v301 = &v126[32 + v281];
                    v302 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v296 ^ v105) >> 64), (unsigned long long)v296 ^ (unsigned long long)v105);
                    v303 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v302 >> 64), (unsigned long long)v302);
                    v304 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v298 ^ v105) >> 64), (unsigned long long)v298 ^ (unsigned long long)v105);
                    v305 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v304 >> 64), (unsigned long long)v304);
                    v306 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v300 ^ v105) >> 64), (unsigned long long)v300 ^ (unsigned long long)v105);
                    v307 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v306 >> 64), (unsigned long long)v306);
                    v308 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v303 ^ v104) >> 64), (unsigned long long)v303 ^ (unsigned long long)v104);
                    v309 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v308 >> 64), (unsigned long long)v308);
                    v310 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v305 ^ v104) >> 64), (unsigned long long)v305 ^ (unsigned long long)v104);
                    v311 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v310 >> 64), (unsigned long long)v310);
                    v312 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v307 ^ v104) >> 64), (unsigned long long)v307 ^ (unsigned long long)v104);
                    v313 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v312 >> 64), (unsigned long long)v312);
                    v314 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v309 ^ v108) >> 64), (unsigned long long)v309 ^ (unsigned long long)v108);
                    v315 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v314 >> 64), (unsigned long long)v314);
                    v316 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v311 ^ v108) >> 64), (unsigned long long)v311 ^ (unsigned long long)v108);
                    v317 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v316 >> 64), (unsigned long long)v316);
                    v318 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v313 ^ v108) >> 64), (unsigned long long)v313 ^ (unsigned long long)v108);
                    v319 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v318 >> 64), (unsigned long long)v318);
                    v320 = v301->field_0;
                    node = &v301->field_10;
                    v321 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v315 ^ v107) >> 64), (unsigned long long)v315 ^ (unsigned long long)v107);
                    v116 = v321;
                    v322 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v317 ^ v107) >> 64), (unsigned long long)v317 ^ (unsigned long long)v107);
                    v323 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v319 ^ v107) >> 64), (unsigned long long)v319 ^ (unsigned long long)v107);
                    v97 = a3->field_0;
                    v324 = &a3->field_10;
                    v122 = v100 + 2;
                    v96 = v324->field_0;
                    v113 = &v324->field_10;
                    *(uint128_t *)iter = v116 ^ v109 ^ v129;
                    v325 = iter + 16;
                    *(uint128_t *)v325 = v322 ^ v109 ^ v130;
                    v326 = v325 + 16;
                    *(uint128_t *)v326 = v109 ^ v95 ^ v323;
                    iter = v326 + 16;
                    v114 = v294 + 48;
                    v327 = arm64g_calculate_condition(2, v294, 48, 0);
                    if (v327 & 1)
                        goto LABEL_9bc89c;
                    v121 = v114 - 48;
                    v123 = v127;
                    v124 = v320;
                    goto LABEL_9bc7bc;
                }
            }
            else
            {
LABEL_9bc7bc:
                v328 = v87 ^ v123;
                v329 = v92 ^ v124;
                v330 = arm64g_calculate_condition(2, v121, 16, 0);
                if (!(v330 & 1))
                    v329 = v87 ^ v124;
                do
                {
                    v331 = v122;
                    v332 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v328 ^ v97) >> 64), (unsigned long long)v328 ^ (unsigned long long)v97);
                    v333 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v332 >> 64), (unsigned long long)v332);
                    v334 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v329 ^ v97) >> 64), (unsigned long long)v329 ^ (unsigned long long)v97);
                    v335 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v334 >> 64), (unsigned long long)v334);
                    v97 = *v113;
                    v336 = v113 + 1;
                    v337 = (unsigned int)v331 - 2;
                    v338 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v333 ^ v96) >> 64), (unsigned long long)v333 ^ (unsigned long long)v96);
                    v339 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v338 >> 64), (unsigned long long)v338);
                    v328 = v339;
                    v340 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v335 ^ v96) >> 64), (unsigned long long)v335 ^ (unsigned long long)v96);
                    v341 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v340 >> 64), (unsigned long long)v340);
                    v329 = v341;
                    v96 = v336->field_0;
                    v113 = &v336->field_10;
                    v122 = v337;
                } while (2 < (int)v331);
                v342 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v328 ^ v97) >> 64), (unsigned long long)v328 ^ (unsigned long long)v97);
                v343 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v342 >> 64), (unsigned long long)v342);
                v344 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v329 ^ v97) >> 64), (unsigned long long)v329 ^ (unsigned long long)v97);
                v345 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v344 >> 64), (unsigned long long)v344);
                v346 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v343 ^ v96) >> 64), (unsigned long long)v343 ^ (unsigned long long)v96);
                v347 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v346 >> 64), (unsigned long long)v346);
                v348 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v345 ^ v96) >> 64), (unsigned long long)v345 ^ (unsigned long long)v96);
                v349 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v348 >> 64), (unsigned long long)v348);
                v350 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v347 ^ v105) >> 64), (unsigned long long)v347 ^ (unsigned long long)v105);
                v351 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v350 >> 64), (unsigned long long)v350);
                v352 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v349 ^ v105) >> 64), (unsigned long long)v349 ^ (unsigned long long)v105);
                v353 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v352 >> 64), (unsigned long long)v352);
                v354 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v351 ^ v104) >> 64), (unsigned long long)v351 ^ (unsigned long long)v104);
                v355 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v354 >> 64), (unsigned long long)v354);
                v356 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v353 ^ v104) >> 64), (unsigned long long)v353 ^ (unsigned long long)v104);
                v357 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v356 >> 64), (unsigned long long)v356);
                v358 = v109 ^ v87;
                v359 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v355 ^ v108) >> 64), (unsigned long long)v355 ^ (unsigned long long)v108);
                v360 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v359 >> 64), (unsigned long long)v359);
                v361 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v357 ^ v108) >> 64), (unsigned long long)v357 ^ (unsigned long long)v108);
                v362 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v361 >> 64), (unsigned long long)v361);
                v363 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v360 ^ v107) >> 64), (unsigned long long)v360 ^ (unsigned long long)v107);
                v364 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v362 ^ v107) >> 64), (unsigned long long)v362 ^ (unsigned long long)v107);
                v365 = v364;
                v366 = arm64g_calculate_condition(2, v121, 32, 0);
                if (!(v366 & 1))
                {
                    *(uint128_t *)iter = v363 ^ v358;
                    v367 = iter + 16;
                    *(uint128_t *)v367 = v365 ^ v109 ^ v92;
                    iter = v367 + 16;
                    v114 = v121 + 16;
                }
                else
                {
                    *(uint128_t *)iter = v365 ^ v358;
                    iter += 16;
                    v114 = v121 + 32;
                }
            }
        }
LABEL_9bc89c:
        if (!(v67 & 15))
            goto LABEL_0x9bc974;
        if (!v114)
        {
            v116 = *(int128_t *)node;
            node += 16;
        }
        v368 = v92 ^ v116;
        v369 = a3->field_0;
        v370 = &a3->field_10;
        v371 = a3->field_f0 - 2;
        v372 = v370->field_0;
        v373 = &v370->field_10;
        do
        {
            l = v371;
            v375 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v368 ^ v369) >> 64), (unsigned long long)v368 ^ (unsigned long long)v369);
            v376 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v375 >> 64), (unsigned long long)v375);
            v369 = *v373;
            v377 = v373 + 1;
            v378 = l - 2;
            v379 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v376 ^ v372) >> 64), (unsigned long long)v376 ^ (unsigned long long)v372);
            v380 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v379 >> 64), (unsigned long long)v379);
            v368 = v380;
            v372 = v377->field_0;
            v373 = &v377->field_10;
            v371 = v378;
        } while (2 < (int)l);
        v381 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v368 ^ v369) >> 64), (unsigned long long)v368 ^ (unsigned long long)v369);
        v382 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v381 >> 64), (unsigned long long)v381);
        v383 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v382 ^ v372) >> 64), (unsigned long long)v382 ^ (unsigned long long)v372);
        *(uint128_t *)iter = v92 ^ *v373 ^ v383;
        v384 = v67 - 1;
        v385 = node[v384];
        *((char *)iter + v384 + 16) = *((char *)iter + v384);
        *((char *)iter + v384) = v385;
        if (1 < (long long)v67)
            goto LABEL_0x9bc908;
        else
            goto LABEL_0x9bc920;
    }
}
