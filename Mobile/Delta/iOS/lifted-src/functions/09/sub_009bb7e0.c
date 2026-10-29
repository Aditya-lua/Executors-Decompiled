/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bb7e0..0x9bbff4 (2068 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bb7e0_9 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    char padding_60[64];
    unsigned int field_a0;
} st_9bb7e0_9;

typedef struct st_9bb7e0_3 {
    uint128_t field_0;
    char field_10;
} st_9bb7e0_3;

typedef struct st_9bb7e0_8 {
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
} st_9bb7e0_8;

typedef struct st_9bb7e0_5 {
    uint128_t field_0;
    char padding_10[176];
    unsigned int field_c0;
} st_9bb7e0_5;

typedef struct st_9bb7e0_7 {
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
} st_9bb7e0_7;

typedef struct st_9bb7e0_4 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char padding_30[176];
    unsigned int field_e0;
} st_9bb7e0_4;

typedef struct st_9bb7e0_1 {
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
} st_9bb7e0_1;

typedef struct st_9bb7e0_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40;
    char padding_41[175];
    unsigned int field_f0;
} st_9bb7e0_0;

typedef struct st_9bb7e0_12 {
    uint128_t field_0;
    uint128_t field_10;
    char field_20;
} st_9bb7e0_12;

typedef struct st_9bb7e0_11 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char field_30;
} st_9bb7e0_11;

typedef struct st_9bb7e0_10 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40;
} st_9bb7e0_10;

typedef struct st_9bb7e0_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char field_50;
} st_9bb7e0_2;

typedef struct st_9bb7e0_6 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char padding_30[64];
    unsigned int field_70;
} st_9bb7e0_6;


void sub_9bb7e0(void* a0, void* iter, unsigned long a2, st_9bb7e0_1 *a3, st_9bb7e0_0 *a4, uint128_t *a5)
{
    uint128_t v8;  // q0
    st_9bb7e0_4 *v9;  // x4
    unsigned int v18;  // w6
    uint128_t v108;  // q7
    uint128_t *v109;  // x7
    char *node;  // x0
    unsigned long long v111;  // x2
    unsigned long v112;  // x6
    uint128_t v113;  // q28
    uint128_t v114;  // q29
    uint128_t v115;  // q0
    unsigned long long v116;  // x10
    unsigned long v117;  // x9
    uint128_t v19;  // 4115
    uint128_t v118;  // q9
    uint128_t v119;  // q1
    char *v120;  // x0
    uint128_t v121;  // q3
    uint128_t v122;  // q24
    uint128_t v123;  // q6
    unsigned long long v124;  // x10
    unsigned long v125;  // x9
    uint128_t v126;  // q10
    st_9bb7e0_3 *v127;  // x0
    uint128_t v20;  // 4117
    unsigned long long v128;  // x10
    unsigned long long v129;  // x9
    uint128_t v130;  // q11
    uint128_t v131;  // q25
    uint128_t v132;  // q26
    unsigned long long v133;  // x2
    unsigned int v134;  // w6
    uint128_t v135;  // q6
    unsigned int l;  // w6
    uint128_t v137;  // 4099
    uint128_t v21;  // 4099
    uint128_t v138;  // 4101
    uint128_t v139;  // 4105
    uint128_t v140;  // 4107
    uint128_t v141;  // 4111
    uint128_t v142;  // 4113
    uint128_t v143;  // 4117
    uint128_t v144;  // 4119
    uint128_t v145;  // 4123
    uint128_t v146;  // 4125
    st_9bb7e0_8 *v147;  // x7
    uint128_t v22;  // 4101
    unsigned int v148;  // w6
    uint128_t v149;  // 4139
    uint128_t v150;  // 4141
    uint128_t v151;  // 4145
    uint128_t v152;  // 4147
    uint128_t v153;  // 4151
    uint128_t v154;  // 4153
    uint128_t v155;  // 4157
    uint128_t v156;  // 4159
    uint128_t v157;  // 4163
    uint128_t v23;  // 4108
    uint128_t v158;  // 4165
    uint128_t v159;  // 4099
    uint128_t v160;  // 4101
    uint128_t v161;  // 4105
    uint128_t v162;  // 4107
    uint128_t v163;  // 4111
    uint128_t v164;  // 4113
    uint128_t v165;  // 4117
    uint128_t v166;  // 4119
    uint128_t v167;  // 4123
    uint128_t v24;  // q6
    uint128_t v168;  // 4125
    unsigned long long v169;  // x2
    uint128_t v170;  // 4133
    uint128_t v171;  // 4135
    uint128_t v172;  // 4139
    uint128_t v173;  // 4141
    uint128_t v174;  // 4145
    uint128_t v175;  // 4147
    uint128_t v176;  // 4151
    uint128_t v177;  // 4153
    uint128_t *v25;  // x3
    uint128_t v178;  // 4157
    uint128_t v179;  // 4159
    unsigned long long v180;  // x6
    uint128_t v181;  // 4103
    uint128_t v182;  // 4105
    uint128_t v183;  // 4109
    uint128_t v184;  // 4111
    uint128_t v185;  // 4115
    uint128_t v186;  // 4117
    uint128_t v187;  // 4121
    uint128_t v26;  // 4129
    uint128_t v188;  // 4123
    uint128_t v189;  // 4127
    uint128_t v190;  // 4129
    st_9bb7e0_2 *v191;  // x0
    uint128_t v192;  // 4140
    uint128_t v193;  // 4142
    uint128_t v194;  // 4146
    uint128_t v195;  // 4148
    uint128_t v196;  // 4152
    uint128_t v197;  // 4154
    uint128_t v27;  // 4131
    uint128_t v198;  // 4158
    uint128_t v199;  // 4160
    uint128_t v200;  // 4164
    uint128_t v201;  // 4166
    uint128_t v202;  // 4170
    uint128_t v203;  // 4172
    uint128_t v204;  // 4176
    uint128_t v205;  // 4178
    uint128_t v206;  // 4182
    uint128_t v207;  // 4184
    uint128_t v10;  // q6
    uint128_t v28;  // q17
    uint128_t v208;  // 4188
    uint128_t v209;  // 4190
    uint128_t v210;  // 4194
    uint128_t v211;  // 4196
    uint128_t v212;  // 4200
    uint128_t v213;  // 4202
    uint128_t v214;  // 4206
    uint128_t v215;  // 4208
    uint128_t v216;  // 4212
    uint128_t v217;  // 4214
    uint128_t v29;  // q16
    uint128_t v218;  // 4218
    uint128_t v219;  // 4220
    uint128_t v220;  // 4224
    uint128_t v221;  // 4226
    uint128_t v222;  // 4230
    uint128_t v223;  // 4232
    uint128_t v224;  // 4236
    uint128_t v225;  // 4238
    uint128_t v226;  // 4242
    uint128_t v227;  // 4244
    uint128_t *v30;  // x3
    uint128_t v228;  // 4248
    uint128_t v229;  // 4250
    uint128_t v230;  // 4254
    uint128_t v231;  // 4256
    uint128_t v232;  // 4264
    unsigned long long v233;  // x10
    unsigned long v234;  // x9
    uint128_t v235;  // q5
    uint128_t v236;  // q2
    st_9bb7e0_10 *v237;  // x0
    uint128_t v31;  // 4139
    uint128_t v238;  // 4290
    uint128_t v239;  // q1
    unsigned long long v240;  // x10
    unsigned long v241;  // x9
    uint128_t v242;  // q17
    st_9bb7e0_11 *v243;  // x0
    uint128_t v244;  // 4316
    uint128_t v245;  // q24
    unsigned long long v246;  // x10
    unsigned long v247;  // x9
    uint128_t v32;  // 4141
    uint128_t v248;  // q30
    uint128_t v249;  // q27
    st_9bb7e0_12 *v250;  // x0
    uint128_t v251;  // 4107
    uint128_t v252;  // q25
    unsigned long long v253;  // x10
    unsigned long v254;  // x9
    uint128_t v255;  // q31
    st_9bb7e0_3 *v256;  // x0
    uint128_t v257;  // 4133
    uint128_t v33;  // q0
    uint128_t v258;  // q26
    st_9bb7e0_7 *v259;  // x7
    void* v260;  // x1
    void* v261;  // x1
    void* v262;  // x1
    void* v263;  // x1
    unsigned long long v264;  // 4186
    unsigned long long v265;  // 4106
    unsigned long long v266;  // 4140
    unsigned long long v267;  // x2
    unsigned int v34;  // w6
    void* v268;  // x1
    void* v269;  // x1
    unsigned long v270;  // x6
    uint128_t v271;  // 4099
    uint128_t v272;  // 4101
    uint128_t v273;  // 4105
    uint128_t v274;  // 4107
    uint128_t v275;  // 4111
    uint128_t v276;  // 4113
    st_9bb7e0_8 *v277;  // x7
    unsigned int j;  // w6
    unsigned long v278;  // x6
    uint128_t v279;  // 4127
    uint128_t v280;  // 4129
    uint128_t v281;  // 4133
    uint128_t v282;  // 4135
    uint128_t v283;  // 4139
    uint128_t v284;  // 4141
    uint128_t v285;  // 4099
    uint128_t v286;  // 4101
    uint128_t v287;  // 4105
    uint128_t v36;  // 4099
    uint128_t v288;  // 4107
    uint128_t v289;  // 4111
    uint128_t v290;  // 4113
    unsigned long long v291;  // x2
    uint128_t v292;  // 4099
    uint128_t v293;  // 4101
    uint128_t v294;  // 4105
    uint128_t v295;  // 4107
    uint128_t v296;  // 4111
    uint128_t v297;  // 4113
    uint128_t v37;  // 4101
    st_9bb7e0_3 *v298;  // x0
    uint128_t v299;  // 4132
    uint128_t v300;  // 4134
    uint128_t v301;  // 4138
    uint128_t v302;  // 4140
    uint128_t v303;  // 4144
    uint128_t v304;  // 4146
    uint128_t v305;  // 4150
    uint128_t v306;  // 4152
    uint128_t v307;  // 4156
    unsigned int v11;  // w6
    st_9bb7e0_9 *v38;  // x3
    uint128_t v308;  // 4158
    uint128_t v309;  // 4162
    uint128_t v310;  // 4164
    uint128_t v311;  // 4168
    uint128_t v312;  // 4170
    uint128_t v313;  // 4174
    uint128_t v314;  // 4176
    uint128_t v315;  // 4180
    uint128_t v316;  // 4182
    uint128_t v317;  // 4186
    uint128_t v39;  // 4109
    uint128_t v318;  // 4190
    uint128_t v319;  // 4194
    uint128_t v320;  // q27
    st_9bb7e0_7 *v321;  // x7
    void* v322;  // x1
    void* v323;  // x1
    unsigned long long v324;  // 4310
    uint128_t v325;  // q1
    uint128_t v326;  // q24
    unsigned long long v327;  // 4114
    uint128_t v40;  // 4111
    unsigned long v328;  // x6
    uint128_t v329;  // 4099
    uint128_t v330;  // 4101
    uint128_t v331;  // 4105
    uint128_t v332;  // 4107
    st_9bb7e0_8 *v333;  // x7
    unsigned long v334;  // x6
    uint128_t v335;  // 4121
    uint128_t v336;  // 4123
    uint128_t v337;  // 4127
    uint128_t v338;  // 4129
    uint128_t v339;  // 4099
    uint128_t v340;  // 4101
    uint128_t v341;  // 4105
    uint128_t v342;  // 4107
    uint128_t v343;  // 4111
    uint128_t v344;  // 4113
    uint128_t v345;  // 4117
    uint128_t v346;  // 4119
    uint128_t v347;  // 4123
    uint128_t *v42;  // x3
    uint128_t v348;  // 4125
    uint128_t v349;  // 4129
    uint128_t v350;  // 4131
    uint128_t v351;  // 4139
    uint128_t v352;  // 4141
    uint128_t v353;  // 4145
    uint128_t v354;  // 4147
    uint128_t v355;  // q5
    uint128_t v356;  // 4155
    uint128_t v357;  // 4157
    uint128_t v43;  // 4103
    uint128_t v358;  // 4161
    uint128_t v359;  // 4163
    uint128_t v360;  // 4171
    uint128_t v361;  // 4175
    uint128_t v362;  // q24
    unsigned long long v363;  // 4226
    void* v364;  // x1
    char *v365;  // x1
    unsigned long long v366;  // x21
    char v367;  // x14
    uint128_t v44;  // 4105
    uint128_t v45;  // 4109
    uint128_t v46;  // 4111
    st_9bb7e0_6 *v47;  // x3
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
    unsigned long long v71;  // 4104
    uint128_t v72;  // q0
    st_9bb7e0_4 *v73;  // x4
    uint128_t v74;  // q6
    unsigned int v75;  // w6
    uint128_t v76;  // q1
    uint128_t *v77;  // x4
    uint128_t v15;  // 4099
    unsigned int k;  // w6
    uint128_t v79;  // 4099
    uint128_t v80;  // 4101
    st_9bb7e0_5 *v81;  // x4
    unsigned int v82;  // w6
    uint128_t v83;  // 4115
    uint128_t v84;  // 4117
    uint128_t v85;  // 4099
    uint128_t v86;  // 4101
    uint128_t v87;  // 4108
    uint128_t v16;  // 4101
    uint128_t v88;  // q6
    unsigned long long v89;  // x9
    unsigned long v90;  // x10
    unsigned long long v91;  // x10
    unsigned long v92;  // x9
    uint128_t v93;  // q8
    void* v94;  // x0
    uint128_t v95;  // q17
    uint128_t v96;  // q16
    unsigned long v97;  // x5
    st_9bb7e0_5 *v17;  // x4
    st_9bb7e0_1 *v98;  // x7
    unsigned int v99;  // w5
    uint128_t v100;  // q19
    uint128_t v101;  // q18
    uint128_t *v102;  // x7
    uint128_t v103;  // q21
    uint128_t v104;  // q20
    uint128_t *v105;  // x7
    uint128_t v106;  // q23
    uint128_t v107;  // q22
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
        v26 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((*(int128_t *)a0 ^ v24 ^ a3->field_0) >> 64), (long long)*(int128_t *)a0 ^ (unsigned long long)v24 ^ (unsigned long long)a3->field_0);
        v27 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v26 >> 64), (unsigned long long)v26);
        v28 = v25[1];
        v29 = *v25;
        v30 = v25 + 2;
        v31 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v27 ^ a3->field_10) >> 64), (unsigned long long)v27 ^ (unsigned long long)a3->field_10);
        v32 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v31 >> 64), (unsigned long long)v31);
        v33 = v32;
        v34 = a3->field_f0 - 10;
        if (a3->field_f0 != 10)
        {
            do
            {
                j = v34;
                v36 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v33 ^ v29) >> 64), (unsigned long long)v33 ^ (unsigned long long)v29);
                v37 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v36 >> 64), (unsigned long long)v36);
                v29 = *v30;
                v38 = v30 + 1;
                v39 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v37 ^ v28) >> 64), (unsigned long long)v37 ^ (unsigned long long)v28);
                v40 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v39 >> 64), (unsigned long long)v39);
                v33 = v40;
                v28 = v38->field_0;
                v30 = &v38->field_10;
                v34 = j - 2;
            } while (2 < (int)j);
        }
        v42 = v30 + 2;
        v43 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v33 ^ v29) >> 64), (unsigned long long)v33 ^ (unsigned long long)v29);
        v44 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v43 >> 64), (unsigned long long)v43);
        v45 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v44 ^ v28) >> 64), (unsigned long long)v44 ^ (unsigned long long)v28);
        v46 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v45 >> 64), (unsigned long long)v45);
        v47 = v42 + 2;
        v48 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v46 ^ *v30) >> 64), (unsigned long long)v46 ^ (unsigned long long)*v30);
        v49 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v48 >> 64), (unsigned long long)v48);
        v50 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v49 ^ v30[1]) >> 64), (unsigned long long)v49 ^ (unsigned long long)v30[1]);
        v51 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v50 >> 64), (unsigned long long)v50);
        v52 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v51 ^ *v42) >> 64), (unsigned long long)v51 ^ (unsigned long long)*v42);
        v53 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v52 >> 64), (unsigned long long)v52);
        v54 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v53 ^ v42[1]) >> 64), (unsigned long long)v53 ^ (unsigned long long)v42[1]);
        v55 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v54 >> 64), (unsigned long long)v54);
        v56 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v55 ^ v47->field_0) >> 64), (unsigned long long)v55 ^ (unsigned long long)v47->field_0);
        v57 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v56 >> 64), (unsigned long long)v56);
        v58 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v57 ^ v47->field_10) >> 64), (unsigned long long)v57 ^ (unsigned long long)v47->field_10);
        *(uint128_t *)iter = v24 ^ v47->field_20 ^ v58;
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
            goto LABEL_0x9bc060;
        v71 = arm64g_calculate_condition(4, v68, 16, 0);
        if (v71 & 1)
            v70 = 0;
        v72 = a4->field_0;
        v73 = &a4->field_10;
        v74 = *a5;
        v75 = a4->field_f0 - 2;
        v76 = v73->field_0;
        v77 = &v73->field_10;
        do
        {
            k = v75;
            v79 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v74 ^ v72) >> 64), (unsigned long long)v74 ^ (unsigned long long)v72);
            v80 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v79 >> 64), (unsigned long long)v79);
            v72 = *v77;
            v81 = v77 + 1;
            v82 = k - 2;
            v83 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v80 ^ v76) >> 64), (unsigned long long)v80 ^ (unsigned long long)v76);
            v84 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v83 >> 64), (unsigned long long)v83);
            v74 = v84;
            v76 = v81->field_0;
            v77 = v81->padding_10;
            v75 = v82;
        } while (2 < (int)k);
        v85 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v74 ^ v72) >> 64), (unsigned long long)v74 ^ (unsigned long long)v72);
        v86 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v85 >> 64), (unsigned long long)v85);
        v87 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v86 ^ v76) >> 64), (unsigned long long)v86 ^ (unsigned long long)v76);
        v88 = *v77 ^ v87;
        v89 = (unsigned long long)v88;
        v90 = *(unsigned long long *)((void*)&v88 + 8);
        v91 = v90 * 2 | v89 >> 63;
        v92 = 135 & (int)((unsigned int)(__ROL__(v90, 32))) >> 31 ^ v89 * 2;
        v93 = _INSERT(__double_as_longlong(__longlong_as_double(v92)), 8, v91);
        v94 = a0 + v70;
        v95 = a3->field_10;
        v96 = a3->field_0;
        v97 = a3->field_f0 - 6;
        v98 = &(&a3->field_0)[v97];
        v99 = (unsigned int)v97 - 2;
        v100 = v98->field_10;
        v101 = v98->field_0;
        v102 = &v98->field_20;
        v103 = v102[1];
        v104 = *v102;
        v105 = v102 + 2;
        v106 = v105[1];
        v107 = *v105;
        v108 = v105[2];
        v109 = &a3->field_20;
        node = v94 + 16;
        v111 = v69 - 32;
        v112 = v99 + 2;
        v113 = *(int128_t *)a0;
        v114 = *(int128_t *)v94;
        if (v69 >= 32)
        {
            v115 = v88 ^ *(int128_t *)a0;
            v116 = v91 * 2 | v92 >> 63;
            v117 = 135 & (int)((unsigned int)(__ROL__(v91, 32))) >> 31 ^ v92 * 2;
            v118 = _INSERT(__double_as_longlong(__longlong_as_double(v117)), 8, v116);
            v119 = v93 ^ *(int128_t *)v94;
            v120 = node + 16;
            v121 = v119;
            v122 = v118 ^ *(int128_t *)node;
            v123 = v88;
            if (v111 >= 32)
            {
                v124 = v116 * 2 | v117 >> 63;
                v125 = 135 & (int)((unsigned int)(__ROL__(v116, 32))) >> 31 ^ v117 * 2;
                v126 = _INSERT(__double_as_longlong(__longlong_as_double(v125)), 8, v124);
                v127 = v120 + 16;
                v128 = v124 * 2 | v125 >> 63;
                v129 = 135 & (int)((unsigned int)(__ROL__(v124, 32))) >> 31 ^ v125 * 2;
                v130 = _INSERT(__double_as_longlong(__longlong_as_double(v129)), 8, v128);
                node = &v127->field_10;
                v131 = v126 ^ *(int128_t *)v120;
                v132 = v130 ^ v127->field_0;
                v133 = v111 - 32;
                v134 = v99;
                v135 = v88;
                while (1)
                {
                    do
                    {
                        l = v134;
                        v137 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v115 ^ v96) >> 64), (unsigned long long)v115 ^ (unsigned long long)v96);
                        v138 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v137 >> 64), (unsigned long long)v137);
                        v139 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v119 ^ v96) >> 64), (unsigned long long)v119 ^ (unsigned long long)v96);
                        v140 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v139 >> 64), (unsigned long long)v139);
                        v141 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v122 ^ v96) >> 64), (unsigned long long)v122 ^ (unsigned long long)v96);
                        v142 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v141 >> 64), (unsigned long long)v141);
                        v143 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v131 ^ v96) >> 64), (unsigned long long)v131 ^ (unsigned long long)v96);
                        v144 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v143 >> 64), (unsigned long long)v143);
                        v145 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v132 ^ v96) >> 64), (unsigned long long)v132 ^ (unsigned long long)v96);
                        v146 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v145 >> 64), (unsigned long long)v145);
                        v96 = *v109;
                        v147 = v109 + 1;
                        v148 = l - 2;
                        v149 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v138 ^ v95) >> 64), (unsigned long long)v138 ^ (unsigned long long)v95);
                        v150 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v149 >> 64), (unsigned long long)v149);
                        v115 = v150;
                        v151 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v140 ^ v95) >> 64), (unsigned long long)v140 ^ (unsigned long long)v95);
                        v152 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v151 >> 64), (unsigned long long)v151);
                        v119 = v152;
                        v153 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v142 ^ v95) >> 64), (unsigned long long)v142 ^ (unsigned long long)v95);
                        v154 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v153 >> 64), (unsigned long long)v153);
                        v122 = v154;
                        v155 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v144 ^ v95) >> 64), (unsigned long long)v144 ^ (unsigned long long)v95);
                        v156 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v155 >> 64), (unsigned long long)v155);
                        v131 = v156;
                        v157 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v146 ^ v95) >> 64), (unsigned long long)v146 ^ (unsigned long long)v95);
                        v158 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v157 >> 64), (unsigned long long)v157);
                        v132 = v158;
                        v95 = v147->field_0;
                        v109 = &v147->field_10;
                        v134 = v148;
                    } while (2 < (int)l);
                    v159 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v115 ^ v96) >> 64), (unsigned long long)v115 ^ (unsigned long long)v96);
                    v160 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v159 >> 64), (unsigned long long)v159);
                    v161 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v119 ^ v96) >> 64), (unsigned long long)v119 ^ (unsigned long long)v96);
                    v162 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v161 >> 64), (unsigned long long)v161);
                    v163 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v122 ^ v96) >> 64), (unsigned long long)v122 ^ (unsigned long long)v96);
                    v164 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v163 >> 64), (unsigned long long)v163);
                    v165 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v131 ^ v96) >> 64), (unsigned long long)v131 ^ (unsigned long long)v96);
                    v166 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v165 >> 64), (unsigned long long)v165);
                    v167 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v132 ^ v96) >> 64), (unsigned long long)v132 ^ (unsigned long long)v96);
                    v168 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v167 >> 64), (unsigned long long)v167);
                    v169 = v133 - 80;
                    v170 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v160 ^ v95) >> 64), (unsigned long long)v160 ^ (unsigned long long)v95);
                    v171 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v170 >> 64), (unsigned long long)v170);
                    v172 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v162 ^ v95) >> 64), (unsigned long long)v162 ^ (unsigned long long)v95);
                    v173 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v172 >> 64), (unsigned long long)v172);
                    v174 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v164 ^ v95) >> 64), (unsigned long long)v164 ^ (unsigned long long)v95);
                    v175 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v174 >> 64), (unsigned long long)v174);
                    v176 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v166 ^ v95) >> 64), (unsigned long long)v166 ^ (unsigned long long)v95);
                    v177 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v176 >> 64), (unsigned long long)v176);
                    v178 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v168 ^ v95) >> 64), (unsigned long long)v168 ^ (unsigned long long)v95);
                    v179 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v178 >> 64), (unsigned long long)v178);
                    if (80 < (long long)v133)
                        v180 = 0;
                    else
                        v180 = v169;
                    v181 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v171 ^ v101) >> 64), (unsigned long long)v171 ^ (unsigned long long)v101);
                    v182 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v181 >> 64), (unsigned long long)v181);
                    v183 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v173 ^ v101) >> 64), (unsigned long long)v173 ^ (unsigned long long)v101);
                    v184 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v183 >> 64), (unsigned long long)v183);
                    v185 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v175 ^ v101) >> 64), (unsigned long long)v175 ^ (unsigned long long)v101);
                    v186 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v185 >> 64), (unsigned long long)v185);
                    v187 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v177 ^ v101) >> 64), (unsigned long long)v177 ^ (unsigned long long)v101);
                    v188 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v187 >> 64), (unsigned long long)v187);
                    v189 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v179 ^ v101) >> 64), (unsigned long long)v179 ^ (unsigned long long)v101);
                    v190 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v189 >> 64), (unsigned long long)v189);
                    v191 = &node[v180];
                    v192 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v182 ^ v100) >> 64), (unsigned long long)v182 ^ (unsigned long long)v100);
                    v193 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v192 >> 64), (unsigned long long)v192);
                    v194 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v184 ^ v100) >> 64), (unsigned long long)v184 ^ (unsigned long long)v100);
                    v195 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v194 >> 64), (unsigned long long)v194);
                    v196 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v186 ^ v100) >> 64), (unsigned long long)v186 ^ (unsigned long long)v100);
                    v197 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v196 >> 64), (unsigned long long)v196);
                    v198 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v188 ^ v100) >> 64), (unsigned long long)v188 ^ (unsigned long long)v100);
                    v199 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v198 >> 64), (unsigned long long)v198);
                    v200 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v190 ^ v100) >> 64), (unsigned long long)v190 ^ (unsigned long long)v100);
                    v201 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v200 >> 64), (unsigned long long)v200);
                    v202 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v193 ^ v104) >> 64), (unsigned long long)v193 ^ (unsigned long long)v104);
                    v203 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v202 >> 64), (unsigned long long)v202);
                    v204 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v195 ^ v104) >> 64), (unsigned long long)v195 ^ (unsigned long long)v104);
                    v205 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v204 >> 64), (unsigned long long)v204);
                    v206 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v197 ^ v104) >> 64), (unsigned long long)v197 ^ (unsigned long long)v104);
                    v207 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v206 >> 64), (unsigned long long)v206);
                    v208 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v199 ^ v104) >> 64), (unsigned long long)v199 ^ (unsigned long long)v104);
                    v209 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v208 >> 64), (unsigned long long)v208);
                    v210 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v201 ^ v104) >> 64), (unsigned long long)v201 ^ (unsigned long long)v104);
                    v211 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v210 >> 64), (unsigned long long)v210);
                    v212 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v203 ^ v103) >> 64), (unsigned long long)v203 ^ (unsigned long long)v103);
                    v213 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v212 >> 64), (unsigned long long)v212);
                    v214 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v205 ^ v103) >> 64), (unsigned long long)v205 ^ (unsigned long long)v103);
                    v215 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v214 >> 64), (unsigned long long)v214);
                    v216 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v207 ^ v103) >> 64), (unsigned long long)v207 ^ (unsigned long long)v103);
                    v217 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v216 >> 64), (unsigned long long)v216);
                    v218 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v209 ^ v103) >> 64), (unsigned long long)v209 ^ (unsigned long long)v103);
                    v219 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v218 >> 64), (unsigned long long)v218);
                    v220 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v211 ^ v103) >> 64), (unsigned long long)v211 ^ (unsigned long long)v103);
                    v221 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v220 >> 64), (unsigned long long)v220);
                    v222 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v213 ^ v107) >> 64), (unsigned long long)v213 ^ (unsigned long long)v107);
                    v223 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v222 >> 64), (unsigned long long)v222);
                    v224 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v215 ^ v107) >> 64), (unsigned long long)v215 ^ (unsigned long long)v107);
                    v225 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v224 >> 64), (unsigned long long)v224);
                    v226 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v217 ^ v107) >> 64), (unsigned long long)v217 ^ (unsigned long long)v107);
                    v227 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v226 >> 64), (unsigned long long)v226);
                    v228 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v219 ^ v107) >> 64), (unsigned long long)v219 ^ (unsigned long long)v107);
                    v229 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v228 >> 64), (unsigned long long)v228);
                    v230 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v221 ^ v107) >> 64), (unsigned long long)v221 ^ (unsigned long long)v107);
                    v231 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v230 >> 64), (unsigned long long)v230);
                    v232 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v223 ^ v106) >> 64), (unsigned long long)v223 ^ (unsigned long long)v106);
                    v233 = v128 * 2 | v129 >> 63;
                    v234 = 135 & (int)((unsigned int)(__ROL__(v128, 32))) >> 31 ^ v129 * 2;
                    v123 = _INSERT(__double_as_longlong(__longlong_as_double(v234)), 8, v233);
                    v235 = v93 ^ v108;
                    v236 = v191->field_0;
                    v237 = &v191->field_10;
                    v238 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v225 ^ v106) >> 64), (unsigned long long)v225 ^ (unsigned long long)v106);
                    v239 = v238;
                    v240 = v233 * 2 | v234 >> 63;
                    v241 = 135 & (int)((unsigned int)(__ROL__(v233, 32))) >> 31 ^ v234 * 2;
                    v93 = _INSERT(__double_as_longlong(__longlong_as_double(v241)), 8, v240);
                    v242 = v118 ^ v108;
                    v121 = v237->field_0;
                    v243 = &v237->field_10;
                    v244 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v227 ^ v106) >> 64), (unsigned long long)v227 ^ (unsigned long long)v106);
                    v245 = v244;
                    v246 = v240 * 2 | v241 >> 63;
                    v247 = 135 & (int)((unsigned int)(__ROL__(v240, 32))) >> 31 ^ v241 * 2;
                    v118 = _INSERT(__double_as_longlong(__longlong_as_double(v247)), 8, v246);
                    v248 = v126 ^ v108;
                    v249 = v243->field_0;
                    v250 = &v243->field_10;
                    v251 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v229 ^ v106) >> 64), (unsigned long long)v229 ^ (unsigned long long)v106);
                    v252 = v251;
                    v253 = v246 * 2 | v247 >> 63;
                    v254 = 135 & (int)((unsigned int)(__ROL__(v246, 32))) >> 31 ^ v247 * 2;
                    v126 = _INSERT(__double_as_longlong(__longlong_as_double(v254)), 8, v253);
                    v255 = v130 ^ v108;
                    v113 = v250->field_0;
                    v256 = &v250->field_10;
                    v257 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v231 ^ v106) >> 64), (unsigned long long)v231 ^ (unsigned long long)v106);
                    v258 = v257;
                    v128 = v253 * 2 | v254 >> 63;
                    v129 = 135 & (int)((unsigned int)(__ROL__(v253, 32))) >> 31 ^ v254 * 2;
                    v130 = _INSERT(__double_as_longlong(__longlong_as_double(v129)), 8, v128);
                    v114 = v256->field_0;
                    node = &v256->field_10;
                    if (v169 == 0xffffffffffffffa0)
                        break;
                    v96 = a3->field_0;
                    v259 = &a3->field_10;
                    v115 = v123 ^ v236;
                    v119 = v93 ^ v121;
                    v122 = v118 ^ v249;
                    v131 = v126 ^ v113;
                    *(uint128_t *)iter = v232 ^ v135 ^ v108;
                    v260 = iter + 16;
                    v132 = v130 ^ v114;
                    *(uint128_t *)v260 = v239 ^ v235;
                    v261 = v260 + 16;
                    *(uint128_t *)v261 = v245 ^ v242;
                    v262 = v261 + 16;
                    v95 = v259->field_0;
                    v109 = &v259->field_10;
                    *(uint128_t *)v262 = v252 ^ v248;
                    v263 = v262 + 16;
                    *(uint128_t *)v263 = v258 ^ v255;
                    iter = v263 + 16;
                    v264 = arm64g_calculate_condition(36, v133, 80, 0);
                    v133 = v169;
                    v134 = v99;
                    v135 = v123;
                    if (!(v264 & 1))
                    {
                        v265 = arm64g_calculate_condition(18, v169, 16, 0);
                        if (!(v265 & 1))
                        {
                            v130 = v126;
                            v126 = v118;
                            v118 = v93;
                            v93 = v123;
                            v129 = (unsigned long long)v130;
                            v128 = *(unsigned long long *)((void*)&v130 + 8);
                            v115 = v236 ^ v123;
                            v119 = v121 ^ v93;
                            v122 = v118 ^ v249;
                            v131 = v126 ^ v113;
                            v132 = v130 ^ v114;
                            v266 = arm64g_calculate_condition(2, v169, 16, 0);
                            v133 = v169;
                            v134 = v99;
                            v135 = v123;
                            if (!(v266 & 1))
                                goto LABEL_9bbd28;
                        }
                        else
                        {
LABEL_9bbd28:
                            v267 = v169 + 80;
                            if (!v267)
                                goto LABEL_9bbfe0;
                            v112 = v99 + 2;
                            v111 = v267 - 48;
                            if (v267 >= 48)
                            {
                                v115 = v249 ^ v123;
                                v119 = v113 ^ v93;
                                v122 = v118 ^ v114;
                                v120 = node;
                                goto LABEL_9bbd80;
                            }
                            goto LABEL_9bbec0;
                        }
                    }
                }
                node += 16;
                *(uint128_t *)iter = v235 ^ v239;
                v268 = iter + 16;
                *(uint128_t *)v268 = v242 ^ v245;
                v269 = v268 + 16;
                *(uint128_t *)&v269[16] = v255 ^ v258;
                *(uint128_t *)v269 = v248 ^ v252;
                iter = v269 + 32;
            }
            else
            {
                do
                {
LABEL_9bbd80:
                    v270 = v112;
                    v271 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v115 ^ v96) >> 64), (unsigned long long)v115 ^ (unsigned long long)v96);
                    v272 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v271 >> 64), (unsigned long long)v271);
                    v273 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v119 ^ v96) >> 64), (unsigned long long)v119 ^ (unsigned long long)v96);
                    v274 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v273 >> 64), (unsigned long long)v273);
                    v275 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v122 ^ v96) >> 64), (unsigned long long)v122 ^ (unsigned long long)v96);
                    v276 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v275 >> 64), (unsigned long long)v275);
                    v96 = *v109;
                    v277 = v109 + 1;
                    v278 = (unsigned int)v270 - 2;
                    v279 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v272 ^ v95) >> 64), (unsigned long long)v272 ^ (unsigned long long)v95);
                    v280 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v279 >> 64), (unsigned long long)v279);
                    v115 = v280;
                    v281 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v274 ^ v95) >> 64), (unsigned long long)v274 ^ (unsigned long long)v95);
                    v282 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v281 >> 64), (unsigned long long)v281);
                    v119 = v282;
                    v283 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v276 ^ v95) >> 64), (unsigned long long)v276 ^ (unsigned long long)v95);
                    v284 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v283 >> 64), (unsigned long long)v283);
                    v122 = v284;
                    v95 = v277->field_0;
                    v109 = &v277->field_10;
                    v112 = v278;
                } while (2 < (int)v270);
                v285 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v115 ^ v96) >> 64), (unsigned long long)v115 ^ (unsigned long long)v96);
                v286 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v285 >> 64), (unsigned long long)v285);
                v287 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v119 ^ v96) >> 64), (unsigned long long)v119 ^ (unsigned long long)v96);
                v288 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v287 >> 64), (unsigned long long)v287);
                v289 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v122 ^ v96) >> 64), (unsigned long long)v122 ^ (unsigned long long)v96);
                v290 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v289 >> 64), (unsigned long long)v289);
                v291 = v111 - 48;
                if (v111 < 48)
                    v278 = v291;
                v292 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v286 ^ v95) >> 64), (unsigned long long)v286 ^ (unsigned long long)v95);
                v293 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v292 >> 64), (unsigned long long)v292);
                v294 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v288 ^ v95) >> 64), (unsigned long long)v288 ^ (unsigned long long)v95);
                v295 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v294 >> 64), (unsigned long long)v294);
                v296 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v290 ^ v95) >> 64), (unsigned long long)v290 ^ (unsigned long long)v95);
                v297 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v296 >> 64), (unsigned long long)v296);
                v298 = &v120[32 + v278];
                v299 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v293 ^ v104) >> 64), (unsigned long long)v293 ^ (unsigned long long)v104);
                v300 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v299 >> 64), (unsigned long long)v299);
                v301 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v295 ^ v104) >> 64), (unsigned long long)v295 ^ (unsigned long long)v104);
                v302 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v301 >> 64), (unsigned long long)v301);
                v303 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v297 ^ v104) >> 64), (unsigned long long)v297 ^ (unsigned long long)v104);
                v304 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v303 >> 64), (unsigned long long)v303);
                v305 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v300 ^ v103) >> 64), (unsigned long long)v300 ^ (unsigned long long)v103);
                v306 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v305 >> 64), (unsigned long long)v305);
                v307 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v302 ^ v103) >> 64), (unsigned long long)v302 ^ (unsigned long long)v103);
                v308 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v307 >> 64), (unsigned long long)v307);
                v309 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v304 ^ v103) >> 64), (unsigned long long)v304 ^ (unsigned long long)v103);
                v310 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v309 >> 64), (unsigned long long)v309);
                v311 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v306 ^ v107) >> 64), (unsigned long long)v306 ^ (unsigned long long)v107);
                v312 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v311 >> 64), (unsigned long long)v311);
                v313 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v308 ^ v107) >> 64), (unsigned long long)v308 ^ (unsigned long long)v107);
                v314 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v313 >> 64), (unsigned long long)v313);
                v315 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v310 ^ v107) >> 64), (unsigned long long)v310 ^ (unsigned long long)v107);
                v316 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v315 >> 64), (unsigned long long)v315);
                v317 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v312 ^ v106) >> 64), (unsigned long long)v312 ^ (unsigned long long)v106);
                v318 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v314 ^ v106) >> 64), (unsigned long long)v314 ^ (unsigned long long)v106);
                v319 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v316 ^ v106) >> 64), (unsigned long long)v316 ^ (unsigned long long)v106);
                v320 = v298->field_0;
                node = &v298->field_10;
                v112 = v99 + 2;
                v96 = a3->field_0;
                v321 = &a3->field_10;
                v95 = v321->field_0;
                v109 = &v321->field_10;
                *(uint128_t *)iter = v317 ^ v108 ^ v123;
                v322 = iter + 16;
                *(uint128_t *)v322 = v318 ^ v108 ^ v93;
                v323 = v322 + 16;
                *(uint128_t *)v323 = v108 ^ v118 ^ v319;
                iter = v323 + 16;
                v324 = arm64g_calculate_condition(2, v291, 48, 0);
                if (v324 & 1)
                    goto LABEL_9bbfe0;
                v113 = v121;
                v114 = v320;
                v111 = v291;
                goto LABEL_9bbec0;
            }
        }
        else
        {
LABEL_9bbec0:
            v325 = v88 ^ v113;
            v326 = v93 ^ v114;
            v327 = arm64g_calculate_condition(2, v111, 16, 0);
            if (!(v327 & 1))
                v326 = v88 ^ v114;
            do
            {
                v328 = v112;
                v329 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v325 ^ v96) >> 64), (unsigned long long)v325 ^ (unsigned long long)v96);
                v330 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v329 >> 64), (unsigned long long)v329);
                v331 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v326 ^ v96) >> 64), (unsigned long long)v326 ^ (unsigned long long)v96);
                v332 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v331 >> 64), (unsigned long long)v331);
                v96 = *v109;
                v333 = v109 + 1;
                v334 = (unsigned int)v328 - 2;
                v335 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v330 ^ v95) >> 64), (unsigned long long)v330 ^ (unsigned long long)v95);
                v336 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v335 >> 64), (unsigned long long)v335);
                v325 = v336;
                v337 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v332 ^ v95) >> 64), (unsigned long long)v332 ^ (unsigned long long)v95);
                v338 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v337 >> 64), (unsigned long long)v337);
                v326 = v338;
                v95 = v333->field_0;
                v109 = &v333->field_10;
                v112 = v334;
            } while (2 < (int)v328);
            v339 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v325 ^ v96) >> 64), (unsigned long long)v325 ^ (unsigned long long)v96);
            v340 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v339 >> 64), (unsigned long long)v339);
            v341 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v326 ^ v96) >> 64), (unsigned long long)v326 ^ (unsigned long long)v96);
            v342 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v341 >> 64), (unsigned long long)v341);
            v343 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v340 ^ v95) >> 64), (unsigned long long)v340 ^ (unsigned long long)v95);
            v344 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v343 >> 64), (unsigned long long)v343);
            v345 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v342 ^ v95) >> 64), (unsigned long long)v342 ^ (unsigned long long)v95);
            v346 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v345 >> 64), (unsigned long long)v345);
            v347 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v344 ^ v104) >> 64), (unsigned long long)v344 ^ (unsigned long long)v104);
            v348 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v347 >> 64), (unsigned long long)v347);
            v349 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v346 ^ v104) >> 64), (unsigned long long)v346 ^ (unsigned long long)v104);
            v350 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v349 >> 64), (unsigned long long)v349);
            v351 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v348 ^ v103) >> 64), (unsigned long long)v348 ^ (unsigned long long)v103);
            v352 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v351 >> 64), (unsigned long long)v351);
            v353 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v350 ^ v103) >> 64), (unsigned long long)v350 ^ (unsigned long long)v103);
            v354 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v353 >> 64), (unsigned long long)v353);
            v355 = v108 ^ v88;
            v356 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v352 ^ v107) >> 64), (unsigned long long)v352 ^ (unsigned long long)v107);
            v357 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v356 >> 64), (unsigned long long)v356);
            v358 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v354 ^ v107) >> 64), (unsigned long long)v354 ^ (unsigned long long)v107);
            v359 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v358 >> 64), (unsigned long long)v358);
            v360 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v357 ^ v106) >> 64), (unsigned long long)v357 ^ (unsigned long long)v106);
            v361 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v359 ^ v106) >> 64), (unsigned long long)v359 ^ (unsigned long long)v106);
            v362 = v361;
            v363 = arm64g_calculate_condition(2, v111, 32, 0);
            if (!(v363 & 1))
            {
                *(uint128_t *)iter = v360 ^ v355;
                v364 = iter + 16;
                *(uint128_t *)v364 = v362 ^ v108 ^ v93;
                iter = v364 + 16;
            }
            else
            {
                *(uint128_t *)iter = v362 ^ v355;
                iter += 16;
            }
        }
LABEL_9bbfe0:
        if (!(v67 & 15))
            goto LABEL_0x9bc060;
        v365 = iter - 16;
        v366 = v67 - 1;
        v367 = node[v366];
        *((char *)iter + v366) = v365[v366];
        v365[v366] = v367;
        if (1 < (long long)v67)
            goto LABEL_0x9bbff4;
        else
            goto LABEL_0x9bc00c;
    }
}
