/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bb300..0x9bb7e0 (1248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bb300_3 {
    uint128_t field_0;
    uint128_t field_10;
    char padding_20[160];
    unsigned int field_c0;
} st_9bb300_3;

typedef struct st_9bb300_0 {
    uint128_t field_0;
    unsigned int field_c;
} st_9bb300_0;

typedef struct st_9bb300_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char padding_40[160];
    unsigned int field_e0;
} st_9bb300_2;

typedef struct st_9bb300_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char padding_50[160];
    unsigned int field_f0;
} st_9bb300_1;


double sub_9bb300(uint128_t *a0, uint128_t *a1, unsigned long a2, st_9bb300_1 *a3, st_9bb300_0 *a4)
{
    unsigned long long v3;  // x30
    unsigned long v4;  // x8
    uint128_t v13;  // q20
    uint128_t v103;  // 4311
    uint128_t v104;  // 4313
    uint128_t *v105;  // x0
    uint128_t v106;  // 4321
    uint128_t v107;  // 4323
    uint128_t v108;  // 4331
    uint128_t v109;  // 4339
    uint128_t v110;  // q3
    uint128_t v111;  // 4347
    uint128_t v112;  // q19
    uint128_t *v14;  // x7
    uint128_t v113;  // 4355
    uint128_t v114;  // q26
    uint128_t v115;  // 4363
    uint128_t v116;  // q27
    uint128_t *v117;  // x1
    uint128_t *v118;  // x1
    uint128_t *v119;  // x1
    uint128_t *v120;  // x1
    unsigned long v121;  // cc_dep1
    unsigned long long v122;  // 4102
    uint128_t v15;  // q23
    unsigned long long v123;  // 4102
    unsigned int v124;  // w6
    uint128_t v125;  // 4099
    uint128_t v126;  // 4101
    uint128_t v127;  // 4105
    uint128_t v128;  // 4107
    uint128_t v129;  // 4111
    uint128_t v130;  // 4113
    st_9bb300_3 *v131;  // x7
    uint128_t v16;  // q22
    uint128_t v133;  // 4127
    uint128_t v134;  // 4129
    uint128_t v135;  // 4133
    uint128_t v136;  // 4135
    uint128_t v137;  // 4139
    uint128_t v138;  // 4141
    uint128_t v139;  // 4099
    uint128_t v140;  // 4101
    uint128_t v141;  // 4105
    uint128_t v142;  // 4107
    uint128_t v17;  // q7
    uint128_t *v143;  // x0
    uint128_t v144;  // 4116
    uint128_t v145;  // 4118
    uint128_t *v146;  // x0
    uint128_t v147;  // 4127
    uint128_t v148;  // 4129
    uint128_t v149;  // 4133
    uint128_t v150;  // 4135
    uint128_t v151;  // 4147
    uint128_t v152;  // 4149
    uint128_t *v18;  // x7
    uint128_t v153;  // 4157
    uint128_t v154;  // 4159
    uint128_t v155;  // 4163
    uint128_t v156;  // 4165
    uint128_t v157;  // 4176
    uint128_t v158;  // 4178
    uint128_t v159;  // q3
    uint128_t v160;  // 4189
    uint128_t v161;  // 4191
    uint128_t v162;  // 4195
    unsigned int v19;  // w6
    uint128_t v163;  // 4197
    uint128_t v164;  // q19
    uint128_t v165;  // 4212
    uint128_t v166;  // 4214
    uint128_t v167;  // 4225
    uint128_t v168;  // 4227
    uint128_t v169;  // 4231
    uint128_t v170;  // 4233
    uint128_t v171;  // 4244
    uint128_t v172;  // 4246
    unsigned int v20;  // w8
    uint128_t v173;  // 4254
    uint128_t v174;  // 4258
    uint128_t v175;  // 4262
    st_9bb300_2 *v176;  // x7
    uint128_t *v177;  // x1
    uint128_t *v178;  // x1
    unsigned long long v179;  // 4106
    unsigned int i;  // w6
    uint128_t v181;  // 4099
    uint128_t v182;  // 4101
    unsigned long v21;  // x8
    uint128_t v183;  // 4105
    uint128_t v184;  // 4107
    st_9bb300_3 *v185;  // x7
    uint128_t v187;  // 4121
    uint128_t v188;  // 4123
    uint128_t v189;  // 4127
    uint128_t v190;  // 4129
    uint128_t v191;  // 4099
    uint128_t v192;  // 4101
    uint128_t v22;  // q1
    uint128_t v193;  // 4105
    uint128_t v194;  // 4107
    uint128_t v195;  // 4111
    uint128_t v196;  // 4113
    uint128_t v197;  // 4117
    uint128_t v198;  // 4119
    uint128_t v199;  // 4127
    uint128_t v200;  // 4129
    uint128_t v201;  // 4133
    uint128_t v202;  // 4135
    uint128_t v5;  // q0
    unsigned long long v23;  // 4180
    uint128_t v203;  // 4142
    uint128_t v204;  // 4144
    uint128_t v205;  // 4148
    uint128_t v206;  // 4150
    uint128_t v207;  // 4158
    uint128_t v208;  // 4160
    uint128_t v209;  // 4164
    uint128_t v210;  // 4166
    uint128_t v211;  // q3
    uint128_t v212;  // 4174
    uint128_t *v24;  // x0
    uint128_t v213;  // 4178
    unsigned long v25;  // x2
    uint128_t v26;  // q18
    uint128_t v27;  // q24
    unsigned long iter;  // x2
    uint128_t v29;  // q25
    unsigned int v30;  // w6
    uint128_t v31;  // 4099
    uint128_t v32;  // 4101
    uint128_t v6;  // q17
    uint128_t v33;  // 4105
    uint128_t v34;  // 4107
    uint128_t v35;  // 4111
    uint128_t v36;  // 4113
    uint128_t v37;  // 4117
    uint128_t v38;  // 4119
    uint128_t v39;  // 4123
    uint128_t v40;  // 4125
    st_9bb300_3 *v41;  // x7
    uint128_t v7;  // q16
    uint128_t v43;  // 4139
    uint128_t v44;  // 4141
    uint128_t v45;  // 4145
    uint128_t v46;  // 4147
    uint128_t v47;  // 4151
    uint128_t v48;  // 4153
    uint128_t v49;  // 4157
    uint128_t v50;  // 4159
    uint128_t v51;  // 4163
    uint128_t v52;  // 4165
    unsigned long v8;  // x5
    uint128_t v53;  // 4103
    uint128_t v54;  // 4105
    uint128_t v55;  // 4109
    uint128_t v56;  // 4111
    uint128_t v57;  // 4115
    uint128_t v58;  // 4117
    uint128_t v59;  // 4121
    uint128_t v60;  // 4123
    uint128_t v61;  // 4127
    uint128_t v62;  // 4129
    unsigned long v9;  // x12
    st_9bb300_2 *v63;  // x7
    uint128_t v64;  // 4137
    uint128_t v65;  // 4139
    uint128_t v66;  // 4143
    uint128_t v67;  // 4145
    uint128_t v68;  // 4149
    uint128_t v69;  // 4151
    uint128_t v70;  // 4155
    uint128_t v71;  // 4157
    uint128_t v72;  // 4161
    st_9bb300_1 *v10;  // x7
    uint128_t v73;  // 4163
    uint128_t v74;  // 4171
    uint128_t v75;  // 4173
    uint128_t v76;  // 4183
    uint128_t v77;  // 4185
    uint128_t v78;  // 4195
    uint128_t v79;  // 4197
    uint128_t v80;  // 4211
    uint128_t v81;  // 4213
    uint128_t v82;  // 4231
    unsigned int v11;  // w5
    uint128_t v83;  // 4233
    uint128_t v84;  // 4251
    uint128_t v85;  // 4253
    uint128_t v86;  // 4257
    uint128_t v87;  // 4259
    uint128_t v88;  // 4263
    uint128_t v89;  // 4265
    uint128_t v90;  // 4269
    uint128_t v91;  // 4271
    uint128_t v92;  // 4275
    uint128_t v12;  // q21
    uint128_t v93;  // 4277
    uint128_t v94;  // 4281
    uint128_t v95;  // 4283
    uint128_t *v96;  // x0
    uint128_t v97;  // 4291
    uint128_t v98;  // 4293
    uint128_t *v99;  // x0
    uint128_t v100;  // 4301
    uint128_t v101;  // 4303
    uint128_t *v102;  // x0
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = *(int *)((char *)&a4->field_0 + 12);
    v5 = a4->field_0;
    v6 = a3->field_10;
    v7 = a3->field_0;
    v8 = a3->field_f0 - 4;
    v9 = 16;
    v10 = &(&a3->field_0)[v8];
    v11 = (unsigned int)v8 - 2;
    v12 = v10->field_10;
    v13 = v10->field_0;
    v14 = &v10->field_20;
    v15 = v14[1];
    v16 = *v14;
    v17 = v14[2];
    v18 = &a3->field_20;
    v19 = v11;
    if (a2 < 2)
        v9 = 0;
    v20 = (((((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v21 = v20 + 2;
    v22 = _INSERT(v5, 12, ((((((v20 + 1) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v20 + 1) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v20 + 1) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v20 + 1) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
    v23 = arm64g_calculate_condition(148, a2, 2, 0);
    v24 = a0;
    if (!(v23 & 1))
    {
        v25 = a2 - 3;
        v26 = _INSERT(v5, 12, (((((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
        if (v25 >= 32)
        {
            v27 = _INSERT(v5, 12, (((((((unsigned int)v21 + 1) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v21 + 1) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((((unsigned int)v21 + 1) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v21 + 1) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
            iter = v25 - 2;
            v29 = _INSERT(v5, 12, (((((((unsigned int)v21 + 2) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v21 + 2) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((((unsigned int)v21 + 2) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | ((unsigned int)v21 + 2) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
            while (1)
            {
                v30 = v19;
                v31 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v5 ^ v7) >> 64), (unsigned long long)v5 ^ (unsigned long long)v7);
                v32 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v31 >> 64), (unsigned long long)v31);
                v33 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v22 ^ v7) >> 64), (unsigned long long)v22 ^ (unsigned long long)v7);
                v34 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v33 >> 64), (unsigned long long)v33);
                v35 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v26 ^ v7) >> 64), (unsigned long long)v26 ^ (unsigned long long)v7);
                v36 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v35 >> 64), (unsigned long long)v35);
                v37 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v27 ^ v7) >> 64), (unsigned long long)v27 ^ (unsigned long long)v7);
                v38 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v37 >> 64), (unsigned long long)v37);
                v39 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v29 ^ v7) >> 64), (unsigned long long)v29 ^ (unsigned long long)v7);
                v40 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v39 >> 64), (unsigned long long)v39);
                v7 = *v18;
                v41 = v18 + 1;
                v43 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v32 ^ v6) >> 64), (unsigned long long)v32 ^ (unsigned long long)v6);
                v44 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v43 >> 64), (unsigned long long)v43);
                v45 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v34 ^ v6) >> 64), (unsigned long long)v34 ^ (unsigned long long)v6);
                v46 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v45 >> 64), (unsigned long long)v45);
                v47 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v36 ^ v6) >> 64), (unsigned long long)v36 ^ (unsigned long long)v6);
                v48 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v47 >> 64), (unsigned long long)v47);
                v49 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v6) >> 64), (unsigned long long)v38 ^ (unsigned long long)v6);
                v50 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v49 >> 64), (unsigned long long)v49);
                v51 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v40 ^ v6) >> 64), (unsigned long long)v40 ^ (unsigned long long)v6);
                v52 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v51 >> 64), (unsigned long long)v51);
                v6 = v41->field_0;
                v18 = &v41->field_10;
                v19 = v30 - 2;
                if (2 < (int)v30)
                    continue;
                v53 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v44 ^ v7) >> 64), (unsigned long long)v44 ^ (unsigned long long)v7);
                v54 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v53 >> 64), (unsigned long long)v53);
                v55 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v46 ^ v7) >> 64), (unsigned long long)v46 ^ (unsigned long long)v7);
                v56 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v55 >> 64), (unsigned long long)v55);
                v57 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v48 ^ v7) >> 64), (unsigned long long)v48 ^ (unsigned long long)v7);
                v58 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v57 >> 64), (unsigned long long)v57);
                v59 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v50 ^ v7) >> 64), (unsigned long long)v50 ^ (unsigned long long)v7);
                v60 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v59 >> 64), (unsigned long long)v59);
                v61 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v52 ^ v7) >> 64), (unsigned long long)v52 ^ (unsigned long long)v7);
                v62 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v61 >> 64), (unsigned long long)v61);
                v7 = a3->field_0;
                v63 = &a3->field_10;
                v64 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v54 ^ v6) >> 64), (unsigned long long)v54 ^ (unsigned long long)v6);
                v65 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v64 >> 64), (unsigned long long)v64);
                v66 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v56 ^ v6) >> 64), (unsigned long long)v56 ^ (unsigned long long)v6);
                v67 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v66 >> 64), (unsigned long long)v66);
                v68 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v58 ^ v6) >> 64), (unsigned long long)v58 ^ (unsigned long long)v6);
                v69 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v68 >> 64), (unsigned long long)v68);
                v70 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v60 ^ v6) >> 64), (unsigned long long)v60 ^ (unsigned long long)v6);
                v71 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v70 >> 64), (unsigned long long)v70);
                v72 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v62 ^ v6) >> 64), (unsigned long long)v62 ^ (unsigned long long)v6);
                v73 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v72 >> 64), (unsigned long long)v72);
                v6 = v63->field_0;
                v18 = &v63->field_10;
                v74 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v65 ^ v13) >> 64), (unsigned long long)v65 ^ (unsigned long long)v13);
                v75 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v74 >> 64), (unsigned long long)v74);
                v76 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v67 ^ v13) >> 64), (unsigned long long)v67 ^ (unsigned long long)v13);
                v77 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v76 >> 64), (unsigned long long)v76);
                v78 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v69 ^ v13) >> 64), (unsigned long long)v69 ^ (unsigned long long)v13);
                v79 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v78 >> 64), (unsigned long long)v78);
                v80 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v71 ^ v13) >> 64), (unsigned long long)v71 ^ (unsigned long long)v13);
                v81 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v80 >> 64), (unsigned long long)v80);
                v82 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v73 ^ v13) >> 64), (unsigned long long)v73 ^ (unsigned long long)v13);
                v83 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v82 >> 64), (unsigned long long)v82);
                v84 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v75 ^ v12) >> 64), (unsigned long long)v75 ^ (unsigned long long)v12);
                v85 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v84 >> 64), (unsigned long long)v84);
                v86 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v77 ^ v12) >> 64), (unsigned long long)v77 ^ (unsigned long long)v12);
                v87 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v86 >> 64), (unsigned long long)v86);
                v88 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v79 ^ v12) >> 64), (unsigned long long)v79 ^ (unsigned long long)v12);
                v89 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v88 >> 64), (unsigned long long)v88);
                v90 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v81 ^ v12) >> 64), (unsigned long long)v81 ^ (unsigned long long)v12);
                v91 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v90 >> 64), (unsigned long long)v90);
                v92 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v83 ^ v12) >> 64), (unsigned long long)v83 ^ (unsigned long long)v12);
                v93 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v92 >> 64), (unsigned long long)v92);
                v94 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v85 ^ v16) >> 64), (unsigned long long)v85 ^ (unsigned long long)v16);
                v95 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v94 >> 64), (unsigned long long)v94);
                v96 = a0 + 1;
                v97 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v87 ^ v16) >> 64), (unsigned long long)v87 ^ (unsigned long long)v16);
                v98 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v97 >> 64), (unsigned long long)v97);
                v99 = v96 + 1;
                v100 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v89 ^ v16) >> 64), (unsigned long long)v89 ^ (unsigned long long)v16);
                v101 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v100 >> 64), (unsigned long long)v100);
                v102 = v99 + 1;
                v103 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v91 ^ v16) >> 64), (unsigned long long)v91 ^ (unsigned long long)v16);
                v104 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v103 >> 64), (unsigned long long)v103);
                v105 = v102 + 1;
                v106 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v93 ^ v16) >> 64), (unsigned long long)v93 ^ (unsigned long long)v16);
                v107 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v106 >> 64), (unsigned long long)v106);
                v24 = v105 + 1;
                v108 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v95 ^ v15) >> 64), (unsigned long long)v95 ^ (unsigned long long)v15);
                v109 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v98 ^ v15) >> 64), (unsigned long long)v98 ^ (unsigned long long)v15);
                v110 = v17 ^ *v96;
                v111 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v101 ^ v15) >> 64), (unsigned long long)v101 ^ (unsigned long long)v15);
                v112 = v17 ^ *v99;
                v113 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v104 ^ v15) >> 64), (unsigned long long)v104 ^ (unsigned long long)v15);
                v114 = v17 ^ *v102;
                v115 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v107 ^ v15) >> 64), (unsigned long long)v107 ^ (unsigned long long)v15);
                v116 = v17 ^ *v105;
                *a1 = v108 ^ v17 ^ *a0;
                v117 = a1 + 1;
                *v117 = v109 ^ v110;
                v118 = v117 + 1;
                *v118 = v111 ^ v112;
                v119 = v118 + 1;
                *v119 = v113 ^ v114;
                v120 = v119 + 1;
                *v120 = v115 ^ v116;
                a1 = v120 + 1;
                v19 = v11;
                if (!iter)
                    return (unsigned long long)v5;
                iter -= 5;
                a0 = v24;
                if (5 > iter)
                    break;
            }
            a2 = iter + 5;
            v121 = a2;
            v9 = 16;
            if (a2 < 2)
            {
                v9 = 0;
                v122 = arm64g_calculate_condition(148, v121, 2, 0);
                if (!(v122 & 1))
                    goto LABEL_9bb5c4;
            }
            else
            {
                v123 = arm64g_calculate_condition(148, v121, 2, 0);
                if (!(v123 & 1))
                {
LABEL_9bb5c4:
                    v25 = a2 - 3;
                    a0 = v24;
                    goto LABEL_9bb5d0;
                }
            }
        }
        else
        {
            while (1)
            {
LABEL_9bb5d0:
                v124 = v19;
                v125 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v5 ^ v7) >> 64), (unsigned long long)v5 ^ (unsigned long long)v7);
                v126 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v125 >> 64), (unsigned long long)v125);
                v127 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v22 ^ v7) >> 64), (unsigned long long)v22 ^ (unsigned long long)v7);
                v128 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v127 >> 64), (unsigned long long)v127);
                v129 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v26 ^ v7) >> 64), (unsigned long long)v26 ^ (unsigned long long)v7);
                v130 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v129 >> 64), (unsigned long long)v129);
                v7 = *v18;
                v131 = v18 + 1;
                v133 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v126 ^ v6) >> 64), (unsigned long long)v126 ^ (unsigned long long)v6);
                v134 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v133 >> 64), (unsigned long long)v133);
                v135 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v128 ^ v6) >> 64), (unsigned long long)v128 ^ (unsigned long long)v6);
                v136 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v135 >> 64), (unsigned long long)v135);
                v137 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v130 ^ v6) >> 64), (unsigned long long)v130 ^ (unsigned long long)v6);
                v138 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v137 >> 64), (unsigned long long)v137);
                v6 = v131->field_0;
                v18 = &v131->field_10;
                v19 = v124 - 2;
                if (2 < (int)v124)
                    continue;
                v139 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v134 ^ v7) >> 64), (unsigned long long)v134 ^ (unsigned long long)v7);
                v140 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v139 >> 64), (unsigned long long)v139);
                v141 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v136 ^ v7) >> 64), (unsigned long long)v136 ^ (unsigned long long)v7);
                v142 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v141 >> 64), (unsigned long long)v141);
                v143 = a0 + 1;
                v144 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v138 ^ v7) >> 64), (unsigned long long)v138 ^ (unsigned long long)v7);
                v145 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v144 >> 64), (unsigned long long)v144);
                v146 = v143 + 1;
                v147 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v140 ^ v6) >> 64), (unsigned long long)v140 ^ (unsigned long long)v6);
                v148 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v147 >> 64), (unsigned long long)v147);
                v149 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v142 ^ v6) >> 64), (unsigned long long)v142 ^ (unsigned long long)v6);
                v150 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v149 >> 64), (unsigned long long)v149);
                v24 = v146 + 1;
                v151 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v145 ^ v6) >> 64), (unsigned long long)v145 ^ (unsigned long long)v6);
                v152 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v151 >> 64), (unsigned long long)v151);
                v153 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v148 ^ v13) >> 64), (unsigned long long)v148 ^ (unsigned long long)v13);
                v154 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v153 >> 64), (unsigned long long)v153);
                v155 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v150 ^ v13) >> 64), (unsigned long long)v150 ^ (unsigned long long)v13);
                v156 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v155 >> 64), (unsigned long long)v155);
                v157 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v152 ^ v13) >> 64), (unsigned long long)v152 ^ (unsigned long long)v13);
                v158 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v157 >> 64), (unsigned long long)v157);
                v159 = v17 ^ *v143;
                v160 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v154 ^ v12) >> 64), (unsigned long long)v154 ^ (unsigned long long)v12);
                v161 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v160 >> 64), (unsigned long long)v160);
                v162 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v156 ^ v12) >> 64), (unsigned long long)v156 ^ (unsigned long long)v12);
                v163 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v162 >> 64), (unsigned long long)v162);
                v164 = v17 ^ *v146;
                v165 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v158 ^ v12) >> 64), (unsigned long long)v158 ^ (unsigned long long)v12);
                v166 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v165 >> 64), (unsigned long long)v165);
                v167 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v161 ^ v16) >> 64), (unsigned long long)v161 ^ (unsigned long long)v16);
                v168 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v167 >> 64), (unsigned long long)v167);
                v169 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v163 ^ v16) >> 64), (unsigned long long)v163 ^ (unsigned long long)v16);
                v170 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v169 >> 64), (unsigned long long)v169);
                v171 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v166 ^ v16) >> 64), (unsigned long long)v166 ^ (unsigned long long)v16);
                v172 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v171 >> 64), (unsigned long long)v171);
                v25 -= 3;
                v173 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v168 ^ v15) >> 64), (unsigned long long)v168 ^ (unsigned long long)v15);
                v174 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v170 ^ v15) >> 64), (unsigned long long)v170 ^ (unsigned long long)v15);
                v175 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v172 ^ v15) >> 64), (unsigned long long)v172 ^ (unsigned long long)v15);
                v7 = a3->field_0;
                v176 = &a3->field_10;
                *a1 = v173 ^ v17 ^ *a0;
                v177 = a1 + 1;
                v19 = v11;
                *v177 = v174 ^ v159;
                v178 = v177 + 1;
                v6 = v176->field_0;
                v18 = &v176->field_10;
                *v178 = v175 ^ v164;
                a1 = v178 + 1;
                a0 = v24;
                if (3 > v25)
                    break;
            }
            a2 = v25 + 3;
            v179 = arm64g_calculate_condition(2, v25, 3, 0);
            if (v179 & 1)
                return (unsigned long long)v5;
            v9 = 16;
            if (a2 == 1)
                v9 = 0;
        }
    }
    do
    {
        i = v19;
        v181 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v5 ^ v7) >> 64), (unsigned long long)v5 ^ (unsigned long long)v7);
        v182 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v181 >> 64), (unsigned long long)v181);
        v183 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v22 ^ v7) >> 64), (unsigned long long)v22 ^ (unsigned long long)v7);
        v184 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v183 >> 64), (unsigned long long)v183);
        v7 = *v18;
        v185 = v18 + 1;
        v187 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v182 ^ v6) >> 64), (unsigned long long)v182 ^ (unsigned long long)v6);
        v188 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v187 >> 64), (unsigned long long)v187);
        v189 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v184 ^ v6) >> 64), (unsigned long long)v184 ^ (unsigned long long)v6);
        v190 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v189 >> 64), (unsigned long long)v189);
        v6 = v185->field_0;
        v18 = &v185->field_10;
        v19 = i - 2;
    } while (2 < (int)i);
    v191 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v188 ^ v7) >> 64), (unsigned long long)v188 ^ (unsigned long long)v7);
    v192 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v191 >> 64), (unsigned long long)v191);
    v193 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v190 ^ v7) >> 64), (unsigned long long)v190 ^ (unsigned long long)v7);
    v194 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v193 >> 64), (unsigned long long)v193);
    v195 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v192 ^ v6) >> 64), (unsigned long long)v192 ^ (unsigned long long)v6);
    v196 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v195 >> 64), (unsigned long long)v195);
    v197 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v194 ^ v6) >> 64), (unsigned long long)v194 ^ (unsigned long long)v6);
    v198 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v197 >> 64), (unsigned long long)v197);
    v199 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v196 ^ v13) >> 64), (unsigned long long)v196 ^ (unsigned long long)v13);
    v200 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v199 >> 64), (unsigned long long)v199);
    v201 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v198 ^ v13) >> 64), (unsigned long long)v198 ^ (unsigned long long)v13);
    v202 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v201 >> 64), (unsigned long long)v201);
    v203 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v200 ^ v12) >> 64), (unsigned long long)v200 ^ (unsigned long long)v12);
    v204 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v203 >> 64), (unsigned long long)v203);
    v205 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v202 ^ v12) >> 64), (unsigned long long)v202 ^ (unsigned long long)v12);
    v206 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v205 >> 64), (unsigned long long)v205);
    v207 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v204 ^ v16) >> 64), (unsigned long long)v204 ^ (unsigned long long)v16);
    v208 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v207 >> 64), (unsigned long long)v207);
    v209 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v206 ^ v16) >> 64), (unsigned long long)v206 ^ (unsigned long long)v16);
    v210 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v209 >> 64), (unsigned long long)v209);
    v211 = v17 ^ *(int128_t *)((char *)v24 + v9);
    v212 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v208 ^ v15) >> 64), (unsigned long long)v208 ^ (unsigned long long)v15);
    v213 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v210 ^ v15) >> 64), (unsigned long long)v210 ^ (unsigned long long)v15);
    *a1 = v212 ^ v17 ^ *v24;
    if (a2 == 1)
        return (unsigned long long)v5;
    a1[1] = v213 ^ v211;
    return (unsigned long long)v5;
}
