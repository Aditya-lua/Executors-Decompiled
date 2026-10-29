/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ba220..0x9ba8c0 (1696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ba220_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char padding_50[112];
    unsigned int field_c0;
} st_9ba220_2;

typedef struct st_9ba220_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    char padding_70[112];
    unsigned int field_e0;
} st_9ba220_1;

typedef struct st_9ba220_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    char padding_80[112];
    unsigned int field_f0;
} st_9ba220_0;


uint128_t * sub_9ba220(uint128_t *a0, uint128_t *iter, unsigned long long a2, st_9ba220_0 *a3, uint128_t *a4, unsigned long long a5)
{
    unsigned long long v3;  // x30
    unsigned long long v4;  // x8
    st_9ba220_0 *v13;  // x7
    uint128_t *v103;  // x0
    uint128_t v104;  // q26
    unsigned long long v105;  // x2
    int v106;  // w6
    uint128_t v107;  // q28
    uint128_t v108;  // q29
    int v109;  // w6
    uint128_t v110;  // 4099
    uint128_t v111;  // 4101
    uint128_t v112;  // 4105
    int v14;  // w5
    uint128_t v113;  // 4107
    uint128_t v114;  // 4111
    uint128_t v115;  // 4113
    uint128_t v116;  // 4117
    uint128_t v117;  // 4119
    uint128_t v118;  // 4123
    uint128_t v119;  // 4125
    st_9ba220_2 *v120;  // x7
    uint128_t v122;  // 4139
    uint128_t v15;  // q19
    uint128_t v123;  // 4141
    uint128_t v124;  // 4145
    uint128_t v125;  // 4147
    uint128_t v126;  // 4151
    uint128_t v127;  // 4153
    uint128_t v128;  // 4157
    uint128_t v129;  // 4159
    uint128_t v130;  // 4163
    uint128_t v131;  // 4165
    uint128_t v132;  // 4099
    uint128_t v16;  // q18
    uint128_t v133;  // 4101
    uint128_t v134;  // 4105
    uint128_t v135;  // 4107
    uint128_t v136;  // 4111
    uint128_t v137;  // 4113
    uint128_t v138;  // 4117
    uint128_t v139;  // 4119
    uint128_t v140;  // 4123
    uint128_t v141;  // 4125
    unsigned long long v142;  // x2
    uint128_t *v17;  // x7
    uint128_t v143;  // 4136
    uint128_t v144;  // 4138
    uint128_t v145;  // 4142
    uint128_t v146;  // 4144
    uint128_t v147;  // 4148
    uint128_t v148;  // 4150
    uint128_t v149;  // 4154
    uint128_t v150;  // 4156
    uint128_t v151;  // 4160
    uint128_t v152;  // 4162
    uint128_t v18;  // q21
    unsigned long long v153;  // x6
    uint128_t v154;  // 4103
    uint128_t v155;  // 4105
    uint128_t v156;  // 4109
    uint128_t v157;  // 4111
    uint128_t v158;  // 4115
    uint128_t v159;  // 4117
    uint128_t v160;  // 4121
    uint128_t v161;  // 4123
    uint128_t v162;  // 4127
    uint128_t v19;  // q20
    uint128_t v163;  // 4129
    uint128_t *v164;  // x0
    uint128_t v165;  // 4140
    uint128_t v166;  // 4142
    uint128_t v167;  // 4146
    uint128_t v168;  // 4148
    uint128_t v169;  // 4152
    uint128_t v170;  // 4154
    uint128_t v171;  // 4158
    uint128_t v172;  // 4160
    uint128_t *v20;  // x7
    uint128_t v173;  // 4164
    uint128_t v174;  // 4166
    uint128_t v175;  // 4170
    uint128_t v176;  // 4172
    uint128_t v177;  // 4176
    uint128_t v178;  // 4178
    uint128_t v179;  // 4182
    uint128_t v180;  // 4184
    uint128_t v181;  // 4188
    uint128_t v182;  // 4190
    uint128_t v21;  // q23
    uint128_t v183;  // 4194
    uint128_t v184;  // 4196
    uint128_t v185;  // 4200
    uint128_t v186;  // 4202
    uint128_t v187;  // 4206
    uint128_t v188;  // 4208
    uint128_t v189;  // 4212
    uint128_t v190;  // 4214
    uint128_t v191;  // 4218
    uint128_t v192;  // 4220
    uint128_t v22;  // q22
    uint128_t v193;  // 4224
    uint128_t v194;  // 4226
    uint128_t v195;  // 4230
    uint128_t v196;  // 4232
    uint128_t v197;  // 4236
    uint128_t v198;  // 4238
    uint128_t v199;  // 4242
    uint128_t v200;  // 4244
    uint128_t v201;  // 4248
    uint128_t v202;  // 4250
    unsigned long long v5;  // 4104
    uint128_t v23;  // q7
    uint128_t v203;  // 4254
    uint128_t v204;  // 4256
    uint128_t v205;  // q4
    uint128_t v206;  // 4264
    uint128_t v207;  // q2
    uint128_t *v208;  // x0
    uint128_t v209;  // 4276
    uint128_t v210;  // q1
    uint128_t v211;  // q17
    uint128_t *v212;  // x0
    uint128_t *v24;  // x7
    uint128_t v213;  // 4288
    uint128_t v214;  // q24
    uint128_t v215;  // q30
    uint128_t *v216;  // x0
    uint128_t v217;  // 4300
    uint128_t v218;  // q25
    uint128_t v219;  // q31
    uint128_t *v220;  // x0
    uint128_t v221;  // 4312
    uint128_t v222;  // q26
    uint128_t v25;  // q0
    st_9ba220_1 *v223;  // x7
    uint128_t *v224;  // x1
    uint128_t *v225;  // x1
    uint128_t *v226;  // x1
    uint128_t *v227;  // x1
    unsigned long long v228;  // 4186
    unsigned long long v229;  // x2
    uint128_t *v230;  // x1
    uint128_t *v231;  // x1
    unsigned long v232;  // x6
    uint128_t v26;  // q5
    uint128_t v233;  // 4099
    uint128_t v234;  // 4101
    uint128_t v235;  // 4105
    uint128_t v236;  // 4107
    uint128_t v237;  // 4111
    uint128_t v238;  // 4113
    st_9ba220_2 *v239;  // x7
    unsigned long long v240;  // x6
    uint128_t v241;  // 4127
    uint128_t v242;  // 4129
    uint128_t v27;  // q3
    uint128_t v243;  // 4133
    uint128_t v244;  // 4135
    uint128_t v245;  // 4139
    uint128_t v246;  // 4141
    uint128_t v247;  // 4099
    uint128_t v248;  // 4101
    uint128_t v249;  // 4105
    uint128_t v250;  // 4107
    uint128_t v251;  // 4111
    uint128_t v252;  // 4113
    uint128_t v28;  // q2
    unsigned long long v253;  // x2
    uint128_t v254;  // 4099
    uint128_t v255;  // 4101
    uint128_t v256;  // 4105
    uint128_t v257;  // 4107
    uint128_t v258;  // 4111
    uint128_t v259;  // 4113
    uint128_t *v260;  // x0
    uint128_t v261;  // 4130
    uint128_t v262;  // 4132
    uint128_t v29;  // 4111
    uint128_t v263;  // 4136
    uint128_t v264;  // 4138
    uint128_t v265;  // 4142
    uint128_t v266;  // 4144
    uint128_t v267;  // q2
    uint128_t *v268;  // x0
    uint128_t v269;  // 4152
    uint128_t v270;  // 4154
    uint128_t v271;  // 4158
    uint128_t v272;  // 4160
    uint128_t v30;  // 4113
    uint128_t v273;  // 4164
    uint128_t v274;  // 4166
    uint128_t *v275;  // x0
    uint128_t v276;  // 4174
    uint128_t v277;  // 4176
    uint128_t v278;  // 4180
    uint128_t v279;  // 4182
    uint128_t v280;  // 4186
    uint128_t v281;  // 4188
    uint128_t v282;  // 4196
    uint128_t v31;  // q0
    uint128_t v283;  // 4200
    uint128_t v284;  // 4204
    st_9ba220_1 *v285;  // x7
    uint128_t *v286;  // x1
    uint128_t *v287;  // x1
    unsigned long long v288;  // 4331
    unsigned long long v289;  // 4106
    unsigned long v290;  // x6
    uint128_t v291;  // 4099
    uint128_t v292;  // 4101
    uint128_t v32;  // 4099
    uint128_t v293;  // 4105
    uint128_t v294;  // 4107
    st_9ba220_2 *v295;  // x7
    uint128_t v297;  // 4121
    uint128_t v298;  // 4123
    uint128_t v299;  // 4127
    uint128_t v300;  // 4129
    uint128_t v301;  // 4099
    uint128_t v302;  // 4101
    unsigned long long v6;  // x2
    uint128_t v33;  // 4101
    uint128_t v303;  // 4105
    uint128_t v304;  // 4107
    uint128_t v305;  // 4111
    uint128_t v306;  // 4113
    uint128_t v307;  // 4117
    uint128_t v308;  // 4119
    uint128_t v309;  // 4123
    uint128_t v310;  // 4125
    uint128_t v311;  // 4129
    uint128_t v312;  // 4131
    uint128_t v34;  // 4105
    uint128_t v313;  // 4139
    uint128_t v314;  // 4141
    uint128_t v315;  // 4145
    uint128_t v316;  // 4147
    uint128_t v317;  // q5
    uint128_t v318;  // 4155
    uint128_t v319;  // 4157
    uint128_t v320;  // 4161
    uint128_t v321;  // 4163
    uint128_t v322;  // 4171
    uint128_t v35;  // 4107
    uint128_t v323;  // 4175
    uint128_t v324;  // q24
    unsigned long long v325;  // 4226
    uint128_t v36;  // q16
    uint128_t v37;  // 4120
    uint128_t v38;  // 4122
    uint128_t v39;  // q0
    uint128_t v40;  // q17
    uint128_t v41;  // 4099
    uint128_t v42;  // 4101
    uint128_t v7;  // q6
    uint128_t v43;  // 4108
    uint128_t v44;  // 4110
    uint128_t v45;  // 4099
    uint128_t v46;  // 4101
    uint128_t v48;  // 4109
    uint128_t v49;  // 4111
    uint128_t v50;  // 4099
    uint128_t v51;  // 4101
    uint128_t v52;  // 4105
    uint128_t v8;  // q0
    uint128_t v53;  // 4107
    uint128_t *node;  // x0
    uint128_t v55;  // 4115
    uint128_t v56;  // 4117
    uint128_t v57;  // 4125
    uint128_t v58;  // 4127
    uint128_t v59;  // 4134
    uint128_t v60;  // 4136
    uint128_t v61;  // 4140
    uint128_t v62;  // q0
    uint128_t *v9;  // x0
    uint128_t v63;  // q6
    unsigned long long v64;  // 4179
    uint128_t v65;  // 4099
    uint128_t v66;  // 4101
    uint128_t v67;  // q3
    uint128_t v68;  // q2
    uint128_t v69;  // 4102
    uint128_t v70;  // 4104
    uint128_t v71;  // q0
    uint128_t v72;  // 4099
    uint128_t v10;  // q17
    uint128_t v73;  // 4101
    uint128_t v75;  // 4109
    uint128_t v76;  // 4111
    uint128_t v77;  // 4099
    uint128_t v78;  // 4101
    uint128_t v79;  // 4105
    uint128_t v80;  // 4107
    uint128_t v81;  // 4111
    uint128_t v82;  // 4113
    uint128_t v11;  // q16
    uint128_t v83;  // 4121
    uint128_t v84;  // 4123
    uint128_t v85;  // 4127
    uint128_t v86;  // 4129
    uint128_t v87;  // 4133
    uint128_t v88;  // 4135
    uint128_t v89;  // 4143
    uint128_t v90;  // q0
    unsigned long long v91;  // 4184
    uint128_t v92;  // 4099
    unsigned long v12;  // x5
    uint128_t v93;  // 4101
    uint128_t v94;  // q24
    unsigned long long v95;  // x2
    unsigned long v96;  // x6
    uint128_t v97;  // q3
    uint128_t v98;  // q1
    uint128_t v99;  // q27
    uint128_t v100;  // q2
    uint128_t v101;  // q3
    uint128_t v102;  // q25
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = 16;
    if (a2 < 16)
        return a0;
    v5 = arm64g_calculate_condition(4, a2, 16, 0);
    if (v5 & 1)
        v4 = 0;
    v6 = a2 - 16 & 0xfffffffffffffff0;
    v7 = *a4;
    v8 = *a0;
    v9 = (char *)a0 + v4;
    v10 = a3->field_10;
    v11 = a3->field_0;
    v12 = a3->field_f0 - 6;
    v13 = &(&a3->field_0)[v12];
    v14 = (unsigned int)v12 - 2;
    v15 = v13->field_10;
    v16 = v13->field_0;
    v17 = &v13->field_20;
    v18 = v17[1];
    v19 = *v17;
    v20 = v17 + 2;
    v21 = v20[1];
    v22 = *v20;
    v23 = v20[2];
    v24 = &a3->field_20;
    if (a5)
    {
        v25 = v7 ^ v8;
        v26 = v23 ^ v11;
        if (v14 != 2)
        {
            v27 = v24[1];
            v28 = *v24;
            v29 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v25 ^ v11) >> 64), (unsigned long long)v25 ^ (unsigned long long)v11);
            v30 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v29 >> 64), (unsigned long long)v29);
            v31 = v30;
            while (1)
            {
                v32 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v10) >> 64), (unsigned long long)v31 ^ (unsigned long long)v10);
                v33 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v32 >> 64), (unsigned long long)v32);
                v34 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v33 ^ v28) >> 64), (unsigned long long)v33 ^ (unsigned long long)v28);
                v35 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v34 >> 64), (unsigned long long)v34);
                v36 = a3->field_40;
                v37 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v35 ^ v27) >> 64), (unsigned long long)v35 ^ (unsigned long long)v27);
                v38 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v37 >> 64), (unsigned long long)v37);
                v39 = v38;
                v40 = a3->field_50;
                if (v14 != 4)
                {
                    v41 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v39 ^ v36) >> 64), (unsigned long long)v39 ^ (unsigned long long)v36);
                    v42 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v41 >> 64), (unsigned long long)v41);
                    v36 = a3->field_60;
                    v43 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v42 ^ v40) >> 64), (unsigned long long)v42 ^ (unsigned long long)v40);
                    v44 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v43 >> 64), (unsigned long long)v43);
                    v39 = v44;
                    v40 = a3->field_70;
                }
                v45 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v39 ^ v36) >> 64), (unsigned long long)v39 ^ (unsigned long long)v36);
                v46 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v45 >> 64), (unsigned long long)v45);
                v48 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v46 ^ v40) >> 64), (unsigned long long)v46 ^ (unsigned long long)v40);
                v49 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v48 >> 64), (unsigned long long)v48);
                if (v6 == 16)
                    v4 = 0;
                v50 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v49 ^ v16) >> 64), (unsigned long long)v49 ^ (unsigned long long)v16);
                v51 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v50 >> 64), (unsigned long long)v50);
                v52 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v51 ^ v15) >> 64), (unsigned long long)v51 ^ (unsigned long long)v15);
                v53 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v52 >> 64), (unsigned long long)v52);
                node = (char *)v9 + v4;
                v55 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v53 ^ v19) >> 64), (unsigned long long)v53 ^ (unsigned long long)v19);
                v56 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v55 >> 64), (unsigned long long)v55);
                v57 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v56 ^ v18) >> 64), (unsigned long long)v56 ^ (unsigned long long)v18);
                v58 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v57 >> 64), (unsigned long long)v57);
                v10 = a3->field_10;
                v59 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v58 ^ v22) >> 64), (unsigned long long)v58 ^ (unsigned long long)v22);
                v60 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v59 >> 64), (unsigned long long)v59);
                v61 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v60 ^ v21) >> 64), (unsigned long long)v60 ^ (unsigned long long)v21);
                v62 = v61;
                v63 = v23 ^ v62;
                v64 = arm64g_calculate_condition(36, v6, 16, 0);
                if (!(v64 & 1))
                    break;
                v65 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v62 ^ v26 ^ *v9) >> 64), (unsigned long long)v62 ^ (unsigned long long)v26 ^ (unsigned long long)*v9);
                v66 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v65 >> 64), (unsigned long long)v65);
                v31 = v66;
                *iter = v63;
                iter += 1;
                v6 -= 16;
                v9 = node;
            }
            *iter = v63;
        }
        else
        {
            v67 = v24[1];
            v68 = *v24;
            v69 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v25 ^ v11) >> 64), (unsigned long long)v25 ^ (unsigned long long)v11);
            v70 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v69 >> 64), (unsigned long long)v69);
            v71 = v70;
            while (1)
            {
                v72 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v71 ^ v10) >> 64), (unsigned long long)v71 ^ (unsigned long long)v10);
                v73 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v72 >> 64), (unsigned long long)v72);
                v75 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v73 ^ v68) >> 64), (unsigned long long)v73 ^ (unsigned long long)v68);
                v76 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v75 >> 64), (unsigned long long)v75);
                if (v6 == 16)
                    v4 = 0;
                v77 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v76 ^ v67) >> 64), (unsigned long long)v76 ^ (unsigned long long)v67);
                v78 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v77 >> 64), (unsigned long long)v77);
                v79 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v78 ^ v16) >> 64), (unsigned long long)v78 ^ (unsigned long long)v16);
                v80 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v79 >> 64), (unsigned long long)v79);
                v81 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v80 ^ v15) >> 64), (unsigned long long)v80 ^ (unsigned long long)v15);
                v82 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v81 >> 64), (unsigned long long)v81);
                node = (char *)v9 + v4;
                v83 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v82 ^ v19) >> 64), (unsigned long long)v82 ^ (unsigned long long)v19);
                v84 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v83 >> 64), (unsigned long long)v83);
                v85 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v84 ^ v18) >> 64), (unsigned long long)v84 ^ (unsigned long long)v18);
                v86 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v85 >> 64), (unsigned long long)v85);
                v87 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v86 ^ v22) >> 64), (unsigned long long)v86 ^ (unsigned long long)v22);
                v88 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v87 >> 64), (unsigned long long)v87);
                v89 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v88 ^ v21) >> 64), (unsigned long long)v88 ^ (unsigned long long)v21);
                v90 = v89;
                v63 = v23 ^ v90;
                v91 = arm64g_calculate_condition(36, v6, 16, 0);
                if (!(v91 & 1))
                    break;
                v92 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v90 ^ v26 ^ *v9) >> 64), (unsigned long long)v90 ^ (unsigned long long)v26 ^ (unsigned long long)*v9);
                v93 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v92 >> 64), (unsigned long long)v92);
                v71 = v93;
                *iter = v63;
                iter += 1;
                v6 -= 16;
                v9 = node;
            }
            *iter = v63;
        }
    }
    else
    {
        v94 = *v9;
        node = v9 + 1;
        v95 = v6 - 32;
        v96 = v14 + 2;
        v97 = v8;
        v98 = v8;
        v99 = v94;
        if (v6 >= 32)
        {
            v98 = v94;
            v94 = *node;
            node += 1;
            v100 = v8;
            v101 = v98;
            v99 = v94;
            if (v95 >= 32)
            {
                v102 = *node;
                v103 = node + 1;
                v104 = *v103;
                node = v103 + 1;
                v105 = v95 - 32;
                v106 = v14;
                v107 = v102;
                v108 = v104;
                while (1)
                {
                    v109 = v106;
                    v110 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v8 ^ v11) >> 64), (unsigned long long)v8 ^ (unsigned long long)v11);
                    v111 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v110 >> 64), (unsigned long long)v110);
                    v112 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v98 ^ v11) >> 64), (unsigned long long)v98 ^ (unsigned long long)v11);
                    v113 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v112 >> 64), (unsigned long long)v112);
                    v114 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v94 ^ v11) >> 64), (unsigned long long)v94 ^ (unsigned long long)v11);
                    v115 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v114 >> 64), (unsigned long long)v114);
                    v116 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v102 ^ v11) >> 64), (unsigned long long)v102 ^ (unsigned long long)v11);
                    v117 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v116 >> 64), (unsigned long long)v116);
                    v118 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v104 ^ v11) >> 64), (unsigned long long)v104 ^ (unsigned long long)v11);
                    v119 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v118 >> 64), (unsigned long long)v118);
                    v11 = *v24;
                    v120 = v24 + 1;
                    v122 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v111 ^ v10) >> 64), (unsigned long long)v111 ^ (unsigned long long)v10);
                    v123 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v122 >> 64), (unsigned long long)v122);
                    v8 = v123;
                    v124 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v113 ^ v10) >> 64), (unsigned long long)v113 ^ (unsigned long long)v10);
                    v125 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v124 >> 64), (unsigned long long)v124);
                    v98 = v125;
                    v126 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v115 ^ v10) >> 64), (unsigned long long)v115 ^ (unsigned long long)v10);
                    v127 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v126 >> 64), (unsigned long long)v126);
                    v94 = v127;
                    v128 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v117 ^ v10) >> 64), (unsigned long long)v117 ^ (unsigned long long)v10);
                    v129 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v128 >> 64), (unsigned long long)v128);
                    v102 = v129;
                    v130 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v119 ^ v10) >> 64), (unsigned long long)v119 ^ (unsigned long long)v10);
                    v131 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v130 >> 64), (unsigned long long)v130);
                    v104 = v131;
                    v10 = v120->field_0;
                    v24 = &v120->field_10;
                    v106 = v109 - 2;
                    if (2 < v109)
                        continue;
                    v132 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v8 ^ v11) >> 64), (unsigned long long)v8 ^ (unsigned long long)v11);
                    v133 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v132 >> 64), (unsigned long long)v132);
                    v134 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v98 ^ v11) >> 64), (unsigned long long)v98 ^ (unsigned long long)v11);
                    v135 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v134 >> 64), (unsigned long long)v134);
                    v136 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v94 ^ v11) >> 64), (unsigned long long)v94 ^ (unsigned long long)v11);
                    v137 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v136 >> 64), (unsigned long long)v136);
                    v138 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v102 ^ v11) >> 64), (unsigned long long)v102 ^ (unsigned long long)v11);
                    v139 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v138 >> 64), (unsigned long long)v138);
                    v140 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v104 ^ v11) >> 64), (unsigned long long)v104 ^ (unsigned long long)v11);
                    v141 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v140 >> 64), (unsigned long long)v140);
                    v142 = v105 - 80;
                    v143 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v133 ^ v10) >> 64), (unsigned long long)v133 ^ (unsigned long long)v10);
                    v144 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v143 >> 64), (unsigned long long)v143);
                    v145 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v135 ^ v10) >> 64), (unsigned long long)v135 ^ (unsigned long long)v10);
                    v146 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v145 >> 64), (unsigned long long)v145);
                    v147 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v137 ^ v10) >> 64), (unsigned long long)v137 ^ (unsigned long long)v10);
                    v148 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v147 >> 64), (unsigned long long)v147);
                    v149 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v139 ^ v10) >> 64), (unsigned long long)v139 ^ (unsigned long long)v10);
                    v150 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v149 >> 64), (unsigned long long)v149);
                    v151 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v141 ^ v10) >> 64), (unsigned long long)v141 ^ (unsigned long long)v10);
                    v152 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v151 >> 64), (unsigned long long)v151);
                    if (64 < (long long)v105)
                        v153 = 0;
                    else
                        v153 = v142;
                    v154 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v144 ^ v16) >> 64), (unsigned long long)v144 ^ (unsigned long long)v16);
                    v155 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v154 >> 64), (unsigned long long)v154);
                    v156 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v146 ^ v16) >> 64), (unsigned long long)v146 ^ (unsigned long long)v16);
                    v157 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v156 >> 64), (unsigned long long)v156);
                    v158 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v148 ^ v16) >> 64), (unsigned long long)v148 ^ (unsigned long long)v16);
                    v159 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v158 >> 64), (unsigned long long)v158);
                    v160 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v150 ^ v16) >> 64), (unsigned long long)v150 ^ (unsigned long long)v16);
                    v161 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v160 >> 64), (unsigned long long)v160);
                    v162 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v152 ^ v16) >> 64), (unsigned long long)v152 ^ (unsigned long long)v16);
                    v163 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v162 >> 64), (unsigned long long)v162);
                    v164 = (char *)node + v153;
                    v165 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v155 ^ v15) >> 64), (unsigned long long)v155 ^ (unsigned long long)v15);
                    v166 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v165 >> 64), (unsigned long long)v165);
                    v167 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v157 ^ v15) >> 64), (unsigned long long)v157 ^ (unsigned long long)v15);
                    v168 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v167 >> 64), (unsigned long long)v167);
                    v169 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v159 ^ v15) >> 64), (unsigned long long)v159 ^ (unsigned long long)v15);
                    v170 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v169 >> 64), (unsigned long long)v169);
                    v171 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v161 ^ v15) >> 64), (unsigned long long)v161 ^ (unsigned long long)v15);
                    v172 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v171 >> 64), (unsigned long long)v171);
                    v173 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v163 ^ v15) >> 64), (unsigned long long)v163 ^ (unsigned long long)v15);
                    v174 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v173 >> 64), (unsigned long long)v173);
                    v175 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v166 ^ v19) >> 64), (unsigned long long)v166 ^ (unsigned long long)v19);
                    v176 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v175 >> 64), (unsigned long long)v175);
                    v177 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v168 ^ v19) >> 64), (unsigned long long)v168 ^ (unsigned long long)v19);
                    v178 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v177 >> 64), (unsigned long long)v177);
                    v179 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v170 ^ v19) >> 64), (unsigned long long)v170 ^ (unsigned long long)v19);
                    v180 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v179 >> 64), (unsigned long long)v179);
                    v181 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v172 ^ v19) >> 64), (unsigned long long)v172 ^ (unsigned long long)v19);
                    v182 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v181 >> 64), (unsigned long long)v181);
                    v183 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v174 ^ v19) >> 64), (unsigned long long)v174 ^ (unsigned long long)v19);
                    v184 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v183 >> 64), (unsigned long long)v183);
                    v185 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v176 ^ v18) >> 64), (unsigned long long)v176 ^ (unsigned long long)v18);
                    v186 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v185 >> 64), (unsigned long long)v185);
                    v187 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v178 ^ v18) >> 64), (unsigned long long)v178 ^ (unsigned long long)v18);
                    v188 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v187 >> 64), (unsigned long long)v187);
                    v189 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v180 ^ v18) >> 64), (unsigned long long)v180 ^ (unsigned long long)v18);
                    v190 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v189 >> 64), (unsigned long long)v189);
                    v191 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v182 ^ v18) >> 64), (unsigned long long)v182 ^ (unsigned long long)v18);
                    v192 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v191 >> 64), (unsigned long long)v191);
                    v193 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v184 ^ v18) >> 64), (unsigned long long)v184 ^ (unsigned long long)v18);
                    v194 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v193 >> 64), (unsigned long long)v193);
                    v195 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v186 ^ v22) >> 64), (unsigned long long)v186 ^ (unsigned long long)v22);
                    v196 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v195 >> 64), (unsigned long long)v195);
                    v197 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v188 ^ v22) >> 64), (unsigned long long)v188 ^ (unsigned long long)v22);
                    v198 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v197 >> 64), (unsigned long long)v197);
                    v199 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v190 ^ v22) >> 64), (unsigned long long)v190 ^ (unsigned long long)v22);
                    v200 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v199 >> 64), (unsigned long long)v199);
                    v201 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v192 ^ v22) >> 64), (unsigned long long)v192 ^ (unsigned long long)v22);
                    v202 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v201 >> 64), (unsigned long long)v201);
                    v203 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v194 ^ v22) >> 64), (unsigned long long)v194 ^ (unsigned long long)v22);
                    v204 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v203 >> 64), (unsigned long long)v203);
                    v205 = v23 ^ v7;
                    v206 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v196 ^ v21) >> 64), (unsigned long long)v196 ^ (unsigned long long)v21);
                    v207 = *v164;
                    v208 = v164 + 1;
                    v209 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v198 ^ v21) >> 64), (unsigned long long)v198 ^ (unsigned long long)v21);
                    v210 = v209;
                    v211 = v23 ^ v101;
                    v101 = *v208;
                    v212 = v208 + 1;
                    v213 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v200 ^ v21) >> 64), (unsigned long long)v200 ^ (unsigned long long)v21);
                    v214 = v213;
                    v215 = v23 ^ v99;
                    v99 = *v212;
                    v216 = v212 + 1;
                    v217 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v202 ^ v21) >> 64), (unsigned long long)v202 ^ (unsigned long long)v21);
                    v218 = v217;
                    v219 = v23 ^ v107;
                    v107 = *v216;
                    v220 = v216 + 1;
                    v221 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v204 ^ v21) >> 64), (unsigned long long)v204 ^ (unsigned long long)v21);
                    v222 = v221;
                    v7 = v108;
                    v108 = *v220;
                    node = v220 + 1;
                    if (v142 == 0xffffffffffffffa0)
                    {
                        *iter = v210 ^ v205;
                        v230 = iter + 1;
                        *v230 = v214 ^ v211;
                        v231 = v230 + 1;
                        *v231 = v218 ^ v215;
                        v231[1] = v222 ^ v219;
                        *a4 = v7;
                        return node;
                    }
                    v11 = a3->field_0;
                    v223 = &a3->field_10;
                    v8 = v207;
                    v98 = v101;
                    v94 = v99;
                    v102 = v107;
                    *iter = v206 ^ v205;
                    v224 = iter + 1;
                    v104 = v108;
                    *v224 = v210 ^ v23 ^ v100;
                    v225 = v224 + 1;
                    v106 = v14;
                    *v225 = v214 ^ v211;
                    v226 = v225 + 1;
                    v10 = v223->field_0;
                    v24 = &v223->field_10;
                    *v226 = v218 ^ v215;
                    v227 = v226 + 1;
                    *v227 = v222 ^ v219;
                    iter = v227 + 1;
                    v228 = arm64g_calculate_condition(36, v105, 64, 0);
                    v105 = v142;
                    v100 = v207;
                    if (!(v228 & 1))
                        break;
                }
                v229 = v142 + 80;
                v63 = v7;
                if (!v229)
                {
                    *a4 = v63;
                    return node;
                }
                v96 = v14 + 2;
                v95 = v229 - 48;
                v8 = v99;
                v100 = v99;
                v98 = v107;
                v101 = v107;
                v94 = v108;
                v99 = v108;
                v97 = v101;
                if (v229 >= 48)
                    goto LABEL_9ba6b0;
            }
            else
            {
                while (1)
                {
LABEL_9ba6b0:
                    v232 = v96;
                    v233 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v8 ^ v11) >> 64), (unsigned long long)v8 ^ (unsigned long long)v11);
                    v234 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v233 >> 64), (unsigned long long)v233);
                    v235 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v98 ^ v11) >> 64), (unsigned long long)v98 ^ (unsigned long long)v11);
                    v236 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v235 >> 64), (unsigned long long)v235);
                    v237 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v94 ^ v11) >> 64), (unsigned long long)v94 ^ (unsigned long long)v11);
                    v238 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v237 >> 64), (unsigned long long)v237);
                    v11 = *v24;
                    v239 = v24 + 1;
                    v240 = (unsigned int)v232 - 2;
                    v241 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v234 ^ v10) >> 64), (unsigned long long)v234 ^ (unsigned long long)v10);
                    v242 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v241 >> 64), (unsigned long long)v241);
                    v8 = v242;
                    v243 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v236 ^ v10) >> 64), (unsigned long long)v236 ^ (unsigned long long)v10);
                    v244 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v243 >> 64), (unsigned long long)v243);
                    v98 = v244;
                    v245 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v238 ^ v10) >> 64), (unsigned long long)v238 ^ (unsigned long long)v10);
                    v246 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v245 >> 64), (unsigned long long)v245);
                    v94 = v246;
                    v10 = v239->field_0;
                    v24 = &v239->field_10;
                    v96 = v240;
                    if (2 < (int)v232)
                        continue;
                    v247 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v8 ^ v11) >> 64), (unsigned long long)v8 ^ (unsigned long long)v11);
                    v248 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v247 >> 64), (unsigned long long)v247);
                    v249 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v98 ^ v11) >> 64), (unsigned long long)v98 ^ (unsigned long long)v11);
                    v250 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v249 >> 64), (unsigned long long)v249);
                    v251 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v94 ^ v11) >> 64), (unsigned long long)v94 ^ (unsigned long long)v11);
                    v252 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v251 >> 64), (unsigned long long)v251);
                    v253 = v95 - 48;
                    if (v95 < 48)
                        v240 = v253;
                    v254 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v248 ^ v10) >> 64), (unsigned long long)v248 ^ (unsigned long long)v10);
                    v255 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v254 >> 64), (unsigned long long)v254);
                    v256 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v250 ^ v10) >> 64), (unsigned long long)v250 ^ (unsigned long long)v10);
                    v257 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v256 >> 64), (unsigned long long)v256);
                    v258 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v252 ^ v10) >> 64), (unsigned long long)v252 ^ (unsigned long long)v10);
                    v259 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v258 >> 64), (unsigned long long)v258);
                    v260 = (char *)node + v240;
                    v63 = v99;
                    v261 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v255 ^ v19) >> 64), (unsigned long long)v255 ^ (unsigned long long)v19);
                    v262 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v261 >> 64), (unsigned long long)v261);
                    v263 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v257 ^ v19) >> 64), (unsigned long long)v257 ^ (unsigned long long)v19);
                    v264 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v263 >> 64), (unsigned long long)v263);
                    v265 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v259 ^ v19) >> 64), (unsigned long long)v259 ^ (unsigned long long)v19);
                    v266 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v265 >> 64), (unsigned long long)v265);
                    v267 = *v260;
                    v268 = v260 + 1;
                    v269 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v262 ^ v18) >> 64), (unsigned long long)v262 ^ (unsigned long long)v18);
                    v270 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v269 >> 64), (unsigned long long)v269);
                    v271 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v264 ^ v18) >> 64), (unsigned long long)v264 ^ (unsigned long long)v18);
                    v272 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v271 >> 64), (unsigned long long)v271);
                    v273 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v266 ^ v18) >> 64), (unsigned long long)v266 ^ (unsigned long long)v18);
                    v274 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v273 >> 64), (unsigned long long)v273);
                    v97 = *v268;
                    v275 = v268 + 1;
                    v276 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v270 ^ v22) >> 64), (unsigned long long)v270 ^ (unsigned long long)v22);
                    v277 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v276 >> 64), (unsigned long long)v276);
                    v278 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v272 ^ v22) >> 64), (unsigned long long)v272 ^ (unsigned long long)v22);
                    v279 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v278 >> 64), (unsigned long long)v278);
                    v280 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v274 ^ v22) >> 64), (unsigned long long)v274 ^ (unsigned long long)v22);
                    v281 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v280 >> 64), (unsigned long long)v280);
                    v99 = *v275;
                    node = v275 + 1;
                    v282 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v277 ^ v21) >> 64), (unsigned long long)v277 ^ (unsigned long long)v21);
                    v283 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v279 ^ v21) >> 64), (unsigned long long)v279 ^ (unsigned long long)v21);
                    v284 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v281 ^ v21) >> 64), (unsigned long long)v281 ^ (unsigned long long)v21);
                    v11 = a3->field_0;
                    v285 = &a3->field_10;
                    v96 = v14 + 2;
                    v10 = v285->field_0;
                    v24 = &v285->field_10;
                    *iter = v282 ^ v23 ^ v7;
                    v286 = iter + 1;
                    v8 = v267;
                    *v286 = v283 ^ v23 ^ v100;
                    v287 = v286 + 1;
                    v98 = v97;
                    *v287 = v23 ^ v101 ^ v284;
                    iter = v287 + 1;
                    v94 = v99;
                    v288 = arm64g_calculate_condition(36, v95, 48, 0);
                    v95 = v253;
                    v7 = v63;
                    v101 = v97;
                    v100 = v267;
                    if (!(v288 & 1))
                        break;
                }
                v289 = arm64g_calculate_condition(2, v253, 48, 0);
                v95 = v253;
                v7 = v63;
                if (v289 & 1)
                {
                    *a4 = v63;
                    return node;
                }
            }
        }
        do
        {
            v290 = v96;
            v291 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v98 ^ v11) >> 64), (unsigned long long)v98 ^ (unsigned long long)v11);
            v292 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v291 >> 64), (unsigned long long)v291);
            v293 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v94 ^ v11) >> 64), (unsigned long long)v94 ^ (unsigned long long)v11);
            v294 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v293 >> 64), (unsigned long long)v293);
            v11 = *v24;
            v295 = v24 + 1;
            v297 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v292 ^ v10) >> 64), (unsigned long long)v292 ^ (unsigned long long)v10);
            v298 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v297 >> 64), (unsigned long long)v297);
            v98 = v298;
            v299 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v294 ^ v10) >> 64), (unsigned long long)v294 ^ (unsigned long long)v10);
            v300 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v299 >> 64), (unsigned long long)v299);
            v94 = v300;
            v10 = v295->field_0;
            v24 = &v295->field_10;
            v96 = (unsigned int)v290 - 2;
        } while (2 < (int)v290);
        v301 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v98 ^ v11) >> 64), (unsigned long long)v98 ^ (unsigned long long)v11);
        v302 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v301 >> 64), (unsigned long long)v301);
        v303 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v94 ^ v11) >> 64), (unsigned long long)v94 ^ (unsigned long long)v11);
        v304 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v303 >> 64), (unsigned long long)v303);
        v305 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v302 ^ v10) >> 64), (unsigned long long)v302 ^ (unsigned long long)v10);
        v306 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v305 >> 64), (unsigned long long)v305);
        v307 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v304 ^ v10) >> 64), (unsigned long long)v304 ^ (unsigned long long)v10);
        v308 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v307 >> 64), (unsigned long long)v307);
        v309 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v306 ^ v19) >> 64), (unsigned long long)v306 ^ (unsigned long long)v19);
        v310 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v309 >> 64), (unsigned long long)v309);
        v311 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v308 ^ v19) >> 64), (unsigned long long)v308 ^ (unsigned long long)v19);
        v312 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v311 >> 64), (unsigned long long)v311);
        v313 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v310 ^ v18) >> 64), (unsigned long long)v310 ^ (unsigned long long)v18);
        v314 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v313 >> 64), (unsigned long long)v313);
        v315 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v312 ^ v18) >> 64), (unsigned long long)v312 ^ (unsigned long long)v18);
        v316 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v315 >> 64), (unsigned long long)v315);
        v317 = v23 ^ v7;
        v318 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v314 ^ v22) >> 64), (unsigned long long)v314 ^ (unsigned long long)v22);
        v319 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v318 >> 64), (unsigned long long)v318);
        v320 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v316 ^ v22) >> 64), (unsigned long long)v316 ^ (unsigned long long)v22);
        v321 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v320 >> 64), (unsigned long long)v320);
        v322 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v319 ^ v21) >> 64), (unsigned long long)v319 ^ (unsigned long long)v21);
        v323 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v321 ^ v21) >> 64), (unsigned long long)v321 ^ (unsigned long long)v21);
        v324 = v323;
        v325 = arm64g_calculate_condition(2, v95, 32, 0);
        if (!(v325 & 1))
        {
            v63 = v99;
            *iter = v322 ^ v317;
            iter[1] = v324 ^ v23 ^ v97;
        }
        else
        {
            v63 = v99;
            *iter = v324 ^ v317;
        }
    }
    *a4 = v63;
    return node;
}
