/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8a6c0..0xa8b790 (4304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a8a6c0(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long a3, uint128_t *a4, uint128_t *a5)
{
    unsigned long long v10;  // d8
    unsigned long long v11;  // d9
    __m128i v20;  // q30
    uint128_t v110;  // 4121
    uint128_t v111;  // 4125
    uint128_t v112;  // 4127
    uint128_t v113;  // 4131
    uint128_t v114;  // 4133
    uint128_t v115;  // 4137
    uint128_t v116;  // 4139
    uint128_t v117;  // 4143
    uint128_t v118;  // 4145
    uint128_t v119;  // 4149
    uint128_t v21;  // q1
    uint128_t v120;  // 4151
    uint128_t v121;  // q26
    uint128_t v122;  // q27
    uint128_t v123;  // 4159
    uint128_t v124;  // 4161
    uint128_t v125;  // 4165
    uint128_t v126;  // 4167
    uint128_t v127;  // 4171
    uint128_t v128;  // 4173
    uint128_t v129;  // 4177
    __m128i v22;  // q30
    uint128_t v130;  // 4179
    uint128_t v131;  // 4183
    uint128_t v132;  // 4185
    uint128_t v133;  // 4189
    uint128_t v134;  // 4191
    uint128_t v135;  // 4195
    uint128_t v136;  // 4197
    uint128_t v137;  // 4202
    uint128_t v138;  // 4204
    uint128_t v139;  // 4208
    uint128_t v23;  // q2
    uint128_t v140;  // 4210
    uint128_t v141;  // 4214
    uint128_t v142;  // 4216
    uint128_t v143;  // 4220
    uint128_t v144;  // 4222
    uint128_t v145;  // 4226
    uint128_t v146;  // 4228
    uint128_t v147;  // 4232
    uint128_t v148;  // 4234
    uint128_t v149;  // 4238
    __m128i v24;  // q30
    uint128_t v150;  // 4240
    uint128_t v151;  // 4244
    uint128_t v152;  // 4246
    uint128_t v153;  // q28
    uint128_t v154;  // q26
    uint128_t v155;  // 4254
    uint128_t v156;  // 4256
    uint128_t v157;  // 4260
    uint128_t v158;  // 4262
    uint128_t v159;  // 4266
    uint128_t v25;  // q3
    uint128_t v160;  // 4268
    uint128_t v161;  // 4272
    uint128_t v162;  // 4274
    uint128_t v163;  // 4278
    uint128_t v164;  // 4280
    uint128_t v165;  // 4284
    uint128_t v166;  // 4286
    uint128_t v167;  // 4290
    uint128_t v168;  // 4292
    uint128_t v169;  // 4296
    __m128i v26;  // q30
    uint128_t v170;  // 4298
    uint128_t v171;  // 4302
    uint128_t v172;  // 4304
    uint128_t v173;  // 4308
    uint128_t v174;  // 4310
    uint128_t v175;  // 4314
    uint128_t v176;  // 4316
    uint128_t v177;  // 4320
    uint128_t v178;  // 4322
    uint128_t v179;  // 4326
    uint128_t v27;  // q4
    uint128_t v180;  // 4328
    uint128_t v181;  // 4332
    uint128_t v182;  // 4334
    uint128_t v183;  // 4338
    uint128_t v184;  // 4340
    uint128_t v185;  // 4344
    uint128_t v186;  // 4346
    uint128_t v187;  // 4359
    uint128_t v188;  // 4361
    uint128_t v189;  // q27
    __m128i v28;  // q30
    uint128_t v190;  // q28
    uint128_t v191;  // 4376
    uint128_t v192;  // 4378
    uint128_t v193;  // 4382
    uint128_t v194;  // 4384
    uint128_t v195;  // 4388
    uint128_t v196;  // 4390
    uint128_t v197;  // 4394
    uint128_t v198;  // 4097
    uint128_t v199;  // 4101
    uint128_t v29;  // q5
    uint128_t v200;  // 4103
    uint128_t v201;  // 4107
    uint128_t v202;  // 4109
    uint128_t v203;  // 4113
    uint128_t v204;  // 4115
    uint128_t v205;  // 4119
    uint128_t v206;  // 4121
    uint128_t v207;  // 4125
    uint128_t v208;  // 4127
    uint128_t v209;  // 4131
    unsigned long long v12;  // d10
    __m128i v30;  // q30
    uint128_t v210;  // 4133
    uint128_t v211;  // 4137
    uint128_t v212;  // 4139
    uint128_t v213;  // 4143
    uint128_t v214;  // 4145
    uint128_t v215;  // 4149
    uint128_t v216;  // 4151
    uint128_t v217;  // 4155
    uint128_t v218;  // 4157
    uint128_t v219;  // 4161
    uint128_t v31;  // q26
    uint128_t v220;  // 4163
    unsigned long long v221;  // 4268
    uint128_t v32;  // q27
    uint128_t v33;  // q6
    uint128_t v34;  // q7
    uint128_t v35;  // 4164
    uint128_t v36;  // 4166
    uint128_t v37;  // 4170
    uint128_t v38;  // 4172
    uint128_t v39;  // 4176
    unsigned long long v13;  // d11
    uint128_t v40;  // 4178
    uint128_t v41;  // 4182
    uint128_t v42;  // 4184
    uint128_t v43;  // 4188
    uint128_t v44;  // 4190
    uint128_t v45;  // 4194
    uint128_t v46;  // 4196
    uint128_t v47;  // 4200
    uint128_t v48;  // 4202
    uint128_t v49;  // 4206
    unsigned long long v14;  // d12
    uint128_t v50;  // 4208
    uint128_t v51;  // q28
    uint128_t v52;  // q26
    uint128_t v53;  // 4216
    uint128_t v54;  // 4218
    uint128_t v55;  // 4222
    uint128_t v56;  // 4224
    uint128_t v57;  // 4228
    uint128_t v58;  // 4230
    uint128_t v59;  // 4234
    unsigned long long v15;  // d13
    uint128_t v60;  // 4236
    uint128_t v61;  // 4240
    uint128_t v62;  // 4242
    uint128_t v63;  // 4246
    uint128_t v64;  // 4248
    uint128_t v65;  // 4252
    uint128_t v66;  // 4254
    uint128_t v67;  // 4258
    uint128_t v68;  // 4260
    uint128_t v69;  // 4264
    unsigned long long v16;  // d14
    uint128_t v70;  // 4266
    uint128_t v71;  // 4270
    uint128_t v72;  // 4272
    uint128_t v73;  // 4276
    uint128_t v74;  // 4278
    uint128_t v75;  // 4282
    uint128_t v76;  // 4284
    uint128_t v77;  // 4288
    uint128_t v78;  // 4290
    uint128_t v79;  // 4294
    unsigned long long v17;  // d15
    uint128_t v80;  // 4296
    uint128_t v81;  // 4300
    uint128_t v82;  // 4302
    uint128_t v83;  // 4306
    uint128_t v84;  // 4308
    uint128_t v85;  // q27
    uint128_t v86;  // q28
    uint128_t v87;  // 4316
    uint128_t v88;  // 4318
    uint128_t v89;  // 4322
    uint128_t v18;  // q0
    uint128_t v90;  // 4324
    uint128_t v91;  // 4328
    uint128_t v92;  // 4330
    uint128_t v93;  // 4334
    uint128_t v94;  // 4336
    uint128_t v95;  // 4340
    uint128_t v96;  // 4342
    uint128_t v97;  // 4346
    uint128_t v98;  // 4348
    uint128_t v99;  // 4352
    uint128_t v100;  // 4354
    uint128_t v101;  // 4358
    uint128_t v102;  // 4097
    uint128_t v103;  // 4101
    uint128_t v104;  // 4103
    uint128_t v105;  // 4107
    uint128_t v106;  // 4109
    uint128_t v107;  // 4113
    uint128_t v108;  // 4115
    uint128_t v109;  // 4119
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    unsigned long long v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]

    if (!a1)
        return 0;
    v0 = v10;
    v1 = v11;
    v2 = v12;
    v3 = v13;
    v4 = v14;
    v5 = v15;
    v6 = v16;
    v7 = v17;
    v8 = 0xc200000000000000;
    v9 = 0;
    v18 = *a4;
    v20 = _mm_add_epi32(__dirty_unsupported_Iop_Reverse8sIn32_x4(v18), _mm_set_epi32(1, 0, 0, 0));
    v21 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v20);
    v22 = _mm_add_epi32(v20, _mm_set_epi32(1, 0, 0, 0));
    v23 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v22);
    v24 = _mm_add_epi32(v22, _mm_set_epi32(1, 0, 0, 0));
    v25 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v24);
    v26 = _mm_add_epi32(v24, _mm_set_epi32(1, 0, 0, 0));
    v27 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v26);
    v28 = _mm_add_epi32(v26, _mm_set_epi32(1, 0, 0, 0));
    v29 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v28);
    v30 = _mm_add_epi32(v28, _mm_set_epi32(1, 0, 0, 0));
    v31 = *a5;
    v32 = a5[1];
    v33 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v30);
    v34 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_add_epi32(v30, _mm_set_epi32(1, 0, 0, 0)));
    v35 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v29 ^ v31) >> 64), (unsigned long long)v29 ^ (unsigned long long)v31);
    v36 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v35 >> 64), (unsigned long long)v35);
    v37 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v27 ^ v31) >> 64), (unsigned long long)v27 ^ (unsigned long long)v31);
    v38 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v37 >> 64), (unsigned long long)v37);
    v39 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v25 ^ v31) >> 64), (unsigned long long)v25 ^ (unsigned long long)v31);
    v40 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v39 >> 64), (unsigned long long)v39);
    v41 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v18 ^ v31) >> 64), (unsigned long long)v18 ^ (unsigned long long)v31);
    v42 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v41 >> 64), (unsigned long long)v41);
    v43 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v21 ^ v31) >> 64), (unsigned long long)v21 ^ (unsigned long long)v31);
    v44 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v43 >> 64), (unsigned long long)v43);
    v45 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v34 ^ v31) >> 64), (unsigned long long)v34 ^ (unsigned long long)v31);
    v46 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v45 >> 64), (unsigned long long)v45);
    v47 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v33 ^ v31) >> 64), (unsigned long long)v33 ^ (unsigned long long)v31);
    v48 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v47 >> 64), (unsigned long long)v47);
    v49 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v23 ^ v31) >> 64), (unsigned long long)v23 ^ (unsigned long long)v31);
    v50 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v49 >> 64), (unsigned long long)v49);
    v51 = a5[2];
    v52 = a5[3];
    v53 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v36 ^ v32) >> 64), (unsigned long long)v36 ^ (unsigned long long)v32);
    v54 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v53 >> 64), (unsigned long long)v53);
    v55 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v46 ^ v32) >> 64), (unsigned long long)v46 ^ (unsigned long long)v32);
    v56 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v55 >> 64), (unsigned long long)v55);
    v57 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v50 ^ v32) >> 64), (unsigned long long)v50 ^ (unsigned long long)v32);
    v58 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v57 >> 64), (unsigned long long)v57);
    v59 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v40 ^ v32) >> 64), (unsigned long long)v40 ^ (unsigned long long)v32);
    v60 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v59 >> 64), (unsigned long long)v59);
    v61 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v48 ^ v32) >> 64), (unsigned long long)v48 ^ (unsigned long long)v32);
    v62 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v61 >> 64), (unsigned long long)v61);
    v63 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v54 ^ v51) >> 64), (unsigned long long)v54 ^ (unsigned long long)v51);
    v64 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v63 >> 64), (unsigned long long)v63);
    v65 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v38 ^ v32) >> 64), (unsigned long long)v38 ^ (unsigned long long)v32);
    v66 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v65 >> 64), (unsigned long long)v65);
    v67 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v42 ^ v32) >> 64), (unsigned long long)v42 ^ (unsigned long long)v32);
    v68 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v67 >> 64), (unsigned long long)v67);
    v69 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v44 ^ v32) >> 64), (unsigned long long)v44 ^ (unsigned long long)v32);
    v70 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v69 >> 64), (unsigned long long)v69);
    v71 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v56 ^ v51) >> 64), (unsigned long long)v56 ^ (unsigned long long)v51);
    v72 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v71 >> 64), (unsigned long long)v71);
    v73 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v60 ^ v51) >> 64), (unsigned long long)v60 ^ (unsigned long long)v51);
    v74 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v73 >> 64), (unsigned long long)v73);
    v75 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v58 ^ v51) >> 64), (unsigned long long)v58 ^ (unsigned long long)v51);
    v76 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v75 >> 64), (unsigned long long)v75);
    v77 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v68 ^ v51) >> 64), (unsigned long long)v68 ^ (unsigned long long)v51);
    v78 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v77 >> 64), (unsigned long long)v77);
    v79 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v70 ^ v51) >> 64), (unsigned long long)v70 ^ (unsigned long long)v51);
    v80 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v79 >> 64), (unsigned long long)v79);
    v81 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v66 ^ v51) >> 64), (unsigned long long)v66 ^ (unsigned long long)v51);
    v82 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v81 >> 64), (unsigned long long)v81);
    v83 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v62 ^ v51) >> 64), (unsigned long long)v62 ^ (unsigned long long)v51);
    v84 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v83 >> 64), (unsigned long long)v83);
    v85 = a5[4];
    v86 = a5[5];
    v87 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v82 ^ v52) >> 64), (unsigned long long)v82 ^ (unsigned long long)v52);
    v88 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v87 >> 64), (unsigned long long)v87);
    v89 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v72 ^ v52) >> 64), (unsigned long long)v72 ^ (unsigned long long)v52);
    v90 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v89 >> 64), (unsigned long long)v89);
    v91 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v74 ^ v52) >> 64), (unsigned long long)v74 ^ (unsigned long long)v52);
    v92 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v91 >> 64), (unsigned long long)v91);
    v93 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v76 ^ v52) >> 64), (unsigned long long)v76 ^ (unsigned long long)v52);
    v94 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v93 >> 64), (unsigned long long)v93);
    v95 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v80 ^ v52) >> 64), (unsigned long long)v80 ^ (unsigned long long)v52);
    v96 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v95 >> 64), (unsigned long long)v95);
    v97 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v78 ^ v52) >> 64), (unsigned long long)v78 ^ (unsigned long long)v52);
    v98 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v97 >> 64), (unsigned long long)v97);
    v99 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v84 ^ v52) >> 64), (unsigned long long)v84 ^ (unsigned long long)v52);
    v100 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v99 >> 64), (unsigned long long)v99);
    v101 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v98 ^ v85) >> 64), (unsigned long long)v98 ^ (unsigned long long)v85);
    v102 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v101 >> 64), (unsigned long long)v101);
    v103 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v96 ^ v85) >> 64), (unsigned long long)v96 ^ (unsigned long long)v85);
    v104 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v103 >> 64), (unsigned long long)v103);
    v105 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v64 ^ v52) >> 64), (unsigned long long)v64 ^ (unsigned long long)v52);
    v106 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v105 >> 64), (unsigned long long)v105);
    v107 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v92 ^ v85) >> 64), (unsigned long long)v92 ^ (unsigned long long)v85);
    v108 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v107 >> 64), (unsigned long long)v107);
    v109 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v94 ^ v85) >> 64), (unsigned long long)v94 ^ (unsigned long long)v85);
    v110 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v109 >> 64), (unsigned long long)v109);
    v111 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v88 ^ v85) >> 64), (unsigned long long)v88 ^ (unsigned long long)v85);
    v112 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v111 >> 64), (unsigned long long)v111);
    v113 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v100 ^ v85) >> 64), (unsigned long long)v100 ^ (unsigned long long)v85);
    v114 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v113 >> 64), (unsigned long long)v113);
    v115 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v90 ^ v85) >> 64), (unsigned long long)v90 ^ (unsigned long long)v85);
    v116 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v115 >> 64), (unsigned long long)v115);
    v117 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v106 ^ v85) >> 64), (unsigned long long)v106 ^ (unsigned long long)v85);
    v118 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v117 >> 64), (unsigned long long)v117);
    v119 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v104 ^ v86) >> 64), (unsigned long long)v104 ^ (unsigned long long)v86);
    v120 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v119 >> 64), (unsigned long long)v119);
    v121 = a5[6];
    v122 = a5[7];
    v123 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v110 ^ v86) >> 64), (unsigned long long)v110 ^ (unsigned long long)v86);
    v124 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v123 >> 64), (unsigned long long)v123);
    v125 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v112 ^ v86) >> 64), (unsigned long long)v112 ^ (unsigned long long)v86);
    v126 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v125 >> 64), (unsigned long long)v125);
    v127 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v116 ^ v86) >> 64), (unsigned long long)v116 ^ (unsigned long long)v86);
    v128 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v127 >> 64), (unsigned long long)v127);
    v129 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v102 ^ v86) >> 64), (unsigned long long)v102 ^ (unsigned long long)v86);
    v130 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v129 >> 64), (unsigned long long)v129);
    v131 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v118 ^ v86) >> 64), (unsigned long long)v118 ^ (unsigned long long)v86);
    v132 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v131 >> 64), (unsigned long long)v131);
    v133 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v114 ^ v86) >> 64), (unsigned long long)v114 ^ (unsigned long long)v86);
    v134 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v133 >> 64), (unsigned long long)v133);
    v135 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v108 ^ v86) >> 64), (unsigned long long)v108 ^ (unsigned long long)v86);
    v136 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v135 >> 64), (unsigned long long)v135);
    v137 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v132 ^ v121) >> 64), (unsigned long long)v132 ^ (unsigned long long)v121);
    v138 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v137 >> 64), (unsigned long long)v137);
    v139 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v126 ^ v121) >> 64), (unsigned long long)v126 ^ (unsigned long long)v121);
    v140 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v139 >> 64), (unsigned long long)v139);
    v141 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v136 ^ v121) >> 64), (unsigned long long)v136 ^ (unsigned long long)v121);
    v142 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v141 >> 64), (unsigned long long)v141);
    v143 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v124 ^ v121) >> 64), (unsigned long long)v124 ^ (unsigned long long)v121);
    v144 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v143 >> 64), (unsigned long long)v143);
    v145 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v134 ^ v121) >> 64), (unsigned long long)v134 ^ (unsigned long long)v121);
    v146 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v145 >> 64), (unsigned long long)v145);
    v147 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v120 ^ v121) >> 64), (unsigned long long)v120 ^ (unsigned long long)v121);
    v148 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v147 >> 64), (unsigned long long)v147);
    v149 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v130 ^ v121) >> 64), (unsigned long long)v130 ^ (unsigned long long)v121);
    v150 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v149 >> 64), (unsigned long long)v149);
    v151 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v128 ^ v121) >> 64), (unsigned long long)v128 ^ (unsigned long long)v121);
    v152 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v151 >> 64), (unsigned long long)v151);
    v153 = a5[8];
    v154 = a5[9];
    v155 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v146 ^ v122) >> 64), (unsigned long long)v146 ^ (unsigned long long)v122);
    v156 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v155 >> 64), (unsigned long long)v155);
    v157 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v142 ^ v122) >> 64), (unsigned long long)v142 ^ (unsigned long long)v122);
    v158 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v157 >> 64), (unsigned long long)v157);
    v159 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v140 ^ v122) >> 64), (unsigned long long)v140 ^ (unsigned long long)v122);
    v160 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v159 >> 64), (unsigned long long)v159);
    v161 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v150 ^ v122) >> 64), (unsigned long long)v150 ^ (unsigned long long)v122);
    v162 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v161 >> 64), (unsigned long long)v161);
    v163 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v152 ^ v122) >> 64), (unsigned long long)v152 ^ (unsigned long long)v122);
    v164 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v163 >> 64), (unsigned long long)v163);
    v165 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v148 ^ v122) >> 64), (unsigned long long)v148 ^ (unsigned long long)v122);
    v166 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v165 >> 64), (unsigned long long)v165);
    v167 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v144 ^ v122) >> 64), (unsigned long long)v144 ^ (unsigned long long)v122);
    v168 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v167 >> 64), (unsigned long long)v167);
    v169 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v138 ^ v122) >> 64), (unsigned long long)v138 ^ (unsigned long long)v122);
    v170 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v169 >> 64), (unsigned long long)v169);
    v171 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v164 ^ v153) >> 64), (unsigned long long)v164 ^ (unsigned long long)v153);
    v172 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v171 >> 64), (unsigned long long)v171);
    v173 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v162 ^ v153) >> 64), (unsigned long long)v162 ^ (unsigned long long)v153);
    v174 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v173 >> 64), (unsigned long long)v173);
    v175 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v160 ^ v153) >> 64), (unsigned long long)v160 ^ (unsigned long long)v153);
    v176 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v175 >> 64), (unsigned long long)v175);
    v177 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v158 ^ v153) >> 64), (unsigned long long)v158 ^ (unsigned long long)v153);
    v178 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v177 >> 64), (unsigned long long)v177);
    v179 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v170 ^ v153) >> 64), (unsigned long long)v170 ^ (unsigned long long)v153);
    v180 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v179 >> 64), (unsigned long long)v179);
    v181 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v168 ^ v153) >> 64), (unsigned long long)v168 ^ (unsigned long long)v153);
    v182 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v181 >> 64), (unsigned long long)v181);
    v183 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v166 ^ v153) >> 64), (unsigned long long)v166 ^ (unsigned long long)v153);
    v184 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v183 >> 64), (unsigned long long)v183);
    v185 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v156 ^ v153) >> 64), (unsigned long long)v156 ^ (unsigned long long)v153);
    v186 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v185 >> 64), (unsigned long long)v185);
    v187 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v178 ^ v154) >> 64), (unsigned long long)v178 ^ (unsigned long long)v154);
    v188 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v187 >> 64), (unsigned long long)v187);
    v189 = a5[10];
    v190 = a5[11];
    v191 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v186 ^ v154) >> 64), (unsigned long long)v186 ^ (unsigned long long)v154);
    v192 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v191 >> 64), (unsigned long long)v191);
    v193 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v184 ^ v154) >> 64), (unsigned long long)v184 ^ (unsigned long long)v154);
    v194 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v193 >> 64), (unsigned long long)v193);
    v195 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v180 ^ v154) >> 64), (unsigned long long)v180 ^ (unsigned long long)v154);
    v196 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v195 >> 64), (unsigned long long)v195);
    v197 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v182 ^ v154) >> 64), (unsigned long long)v182 ^ (unsigned long long)v154);
    v198 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v197 >> 64), (unsigned long long)v197);
    v199 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v174 ^ v154) >> 64), (unsigned long long)v174 ^ (unsigned long long)v154);
    v200 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v199 >> 64), (unsigned long long)v199);
    v201 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v176 ^ v154) >> 64), (unsigned long long)v176 ^ (unsigned long long)v154);
    v202 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v201 >> 64), (unsigned long long)v201);
    v203 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v192 ^ v189) >> 64), (unsigned long long)v192 ^ (unsigned long long)v189);
    v204 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v203 >> 64), (unsigned long long)v203);
    v205 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v172 ^ v154) >> 64), (unsigned long long)v172 ^ (unsigned long long)v154);
    v206 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v205 >> 64), (unsigned long long)v205);
    v207 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v188 ^ v189) >> 64), (unsigned long long)v188 ^ (unsigned long long)v189);
    v208 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v207 >> 64), (unsigned long long)v207);
    v209 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v194 ^ v189) >> 64), (unsigned long long)v194 ^ (unsigned long long)v189);
    v210 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v209 >> 64), (unsigned long long)v209);
    v211 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v196 ^ v189) >> 64), (unsigned long long)v196 ^ (unsigned long long)v189);
    v212 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v211 >> 64), (unsigned long long)v211);
    v213 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v202 ^ v189) >> 64), (unsigned long long)v202 ^ (unsigned long long)v189);
    v214 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v213 >> 64), (unsigned long long)v213);
    v215 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v200 ^ v189) >> 64), (unsigned long long)v200 ^ (unsigned long long)v189);
    v216 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v215 >> 64), (unsigned long long)v215);
    v217 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v198 ^ v189) >> 64), (unsigned long long)v198 ^ (unsigned long long)v189);
    v218 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v217 >> 64), (unsigned long long)v217);
    v219 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v206 ^ v189) >> 64), (unsigned long long)v206 ^ (unsigned long long)v189);
    v220 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v219 >> 64), (unsigned long long)v219);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v204 ^ v190) >> 64), (unsigned long long)v204 ^ (unsigned long long)v190);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v208 ^ v190) >> 64), (unsigned long long)v208 ^ (unsigned long long)v190);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v214 ^ v190) >> 64), (unsigned long long)v214 ^ (unsigned long long)v190);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v220 ^ v190) >> 64), (unsigned long long)v220 ^ (unsigned long long)v190);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v210 ^ v190) >> 64), (unsigned long long)v210 ^ (unsigned long long)v190);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v212 ^ v190) >> 64), (unsigned long long)v212 ^ (unsigned long long)v190);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v218 ^ v190) >> 64), (unsigned long long)v218 ^ (unsigned long long)v190);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v216 ^ v190) >> 64), (unsigned long long)v216 ^ (unsigned long long)v190);
    v221 = arm64g_calculate_condition(164, a0, ((a1 >> 3) - 1 & 0xffffffffffffff80) + a0, 0);
}
