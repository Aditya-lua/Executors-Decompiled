/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa89780..0xa8a6c0 (3904 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a89780(long long a0, unsigned long long a1, unsigned long a2, unsigned long a3, uint128_t *a4, uint128_t *a5)
{
    unsigned long long v10;  // d8
    unsigned long long v11;  // d9
    uint128_t v20;  // q27
    uint128_t v110;  // 4127
    uint128_t v111;  // 4131
    uint128_t v112;  // 4133
    uint128_t v113;  // 4137
    uint128_t v114;  // 4139
    uint128_t v115;  // 4143
    uint128_t v116;  // 4145
    uint128_t v117;  // 4149
    uint128_t v118;  // 4151
    uint128_t v119;  // q26
    uint128_t v120;  // q27
    uint128_t v121;  // 4159
    uint128_t v122;  // 4161
    uint128_t v123;  // 4165
    uint128_t v124;  // 4167
    uint128_t v125;  // 4171
    uint128_t v126;  // 4173
    uint128_t v127;  // 4177
    uint128_t v128;  // 4179
    uint128_t v129;  // 4183
    uint128_t v22;  // 4152
    uint128_t v130;  // 4185
    uint128_t v131;  // 4189
    uint128_t v132;  // 4191
    uint128_t v133;  // 4195
    uint128_t v134;  // 4197
    uint128_t v135;  // 4201
    uint128_t v136;  // 4203
    uint128_t v137;  // 4207
    uint128_t v138;  // 4209
    uint128_t v139;  // 4213
    uint128_t v23;  // 4154
    uint128_t v140;  // 4215
    uint128_t v141;  // 4219
    uint128_t v142;  // 4221
    uint128_t v143;  // 4225
    uint128_t v144;  // 4227
    uint128_t v145;  // 4231
    uint128_t v146;  // 4233
    uint128_t v147;  // 4237
    uint128_t v148;  // 4239
    uint128_t v149;  // 4243
    __m128i v24;  // q30
    uint128_t v150;  // 4245
    uint128_t v151;  // 4249
    uint128_t v152;  // 4251
    uint128_t v153;  // 4255
    uint128_t v154;  // 4257
    uint128_t v155;  // 4261
    uint128_t v156;  // 4263
    uint128_t v157;  // 4267
    uint128_t v158;  // 4269
    uint128_t v159;  // 4273
    uint128_t v25;  // q1
    uint128_t v160;  // 4275
    uint128_t v161;  // 4279
    uint128_t v162;  // 4281
    uint128_t v163;  // q28
    uint128_t v164;  // q26
    uint128_t v165;  // 4289
    uint128_t v166;  // 4291
    uint128_t v167;  // 4295
    uint128_t v168;  // 4297
    uint128_t v169;  // 4301
    __m128i v26;  // q30
    uint128_t v170;  // 4303
    uint128_t v171;  // 4312
    uint128_t v172;  // 4314
    uint128_t v173;  // 4318
    uint128_t v174;  // 4320
    uint128_t v175;  // 4324
    uint128_t v176;  // 4326
    uint128_t v177;  // 4330
    uint128_t v178;  // 4332
    uint128_t v179;  // 4336
    uint128_t v27;  // q2
    uint128_t v180;  // 4338
    uint128_t v181;  // 4342
    uint128_t v182;  // 4344
    uint128_t v183;  // 4348
    uint128_t v184;  // 4350
    uint128_t v185;  // 4354
    uint128_t v186;  // 4356
    __m128i v28;  // q30
    uint128_t v29;  // 4164
    unsigned long long v12;  // d10
    uint128_t v30;  // 4166
    uint128_t v31;  // q3
    __m128i v32;  // q30
    uint128_t v33;  // 4172
    uint128_t v34;  // 4174
    uint128_t v35;  // 4178
    uint128_t v36;  // 4180
    uint128_t v37;  // q4
    __m128i v38;  // q30
    uint128_t v39;  // q5
    unsigned long long v13;  // d11
    __m128i v40;  // q30
    uint128_t v41;  // 4188
    uint128_t v42;  // 4190
    uint128_t v43;  // q6
    uint128_t v44;  // 4196
    uint128_t v45;  // 4198
    uint128_t v46;  // 4202
    uint128_t v47;  // 4204
    uint128_t v48;  // 4208
    uint128_t v49;  // 4210
    unsigned long long v14;  // d12
    uint128_t v50;  // q7
    uint128_t v51;  // 4215
    uint128_t v52;  // 4217
    uint128_t v53;  // 4221
    uint128_t v54;  // 4223
    uint128_t v55;  // 4227
    uint128_t v56;  // 4229
    uint128_t v57;  // q28
    uint128_t v58;  // q26
    uint128_t v59;  // 4237
    unsigned long long v15;  // d13
    uint128_t v60;  // 4239
    uint128_t v61;  // 4243
    uint128_t v62;  // 4245
    uint128_t v63;  // 4249
    uint128_t v64;  // 4251
    uint128_t v65;  // 4255
    uint128_t v66;  // 4257
    uint128_t v67;  // 4261
    uint128_t v68;  // 4263
    uint128_t v69;  // 4267
    unsigned long long v16;  // d14
    uint128_t v70;  // 4269
    uint128_t v71;  // 4273
    uint128_t v72;  // 4275
    uint128_t v73;  // 4279
    uint128_t v74;  // 4281
    uint128_t v75;  // 4285
    uint128_t v76;  // 4287
    uint128_t v77;  // 4291
    uint128_t v78;  // 4293
    uint128_t v79;  // 4297
    unsigned long long v17;  // d15
    uint128_t v80;  // 4299
    uint128_t v81;  // 4303
    uint128_t v82;  // 4305
    uint128_t v83;  // 4309
    uint128_t v84;  // 4311
    uint128_t v85;  // 4315
    uint128_t v86;  // 4317
    uint128_t v87;  // 4321
    uint128_t v88;  // 4323
    uint128_t v89;  // q27
    uint128_t v18;  // q0
    uint128_t v90;  // q28
    uint128_t v91;  // 4331
    uint128_t v92;  // 4333
    uint128_t v93;  // 4337
    uint128_t v94;  // 4339
    uint128_t v95;  // 4343
    uint128_t v96;  // 4345
    uint128_t v97;  // 4349
    uint128_t v98;  // 4351
    uint128_t v99;  // 4355
    uint128_t v19;  // q26
    uint128_t v100;  // 4097
    uint128_t v101;  // 4101
    uint128_t v102;  // 4103
    uint128_t v103;  // 4107
    uint128_t v104;  // 4109
    uint128_t v105;  // 4113
    uint128_t v106;  // 4115
    uint128_t v107;  // 4119
    uint128_t v108;  // 4121
    uint128_t v109;  // 4125
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
    v19 = *a5;
    v20 = a5[1];
    v22 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v18 ^ v19) >> 64), (unsigned long long)v18 ^ (unsigned long long)v19);
    v23 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v22 >> 64), (unsigned long long)v22);
    v24 = _mm_add_epi32(__dirty_unsupported_Iop_Reverse8sIn32_x4(v18), _mm_set_epi32(1, 0, 0, 0));
    v25 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v24);
    v26 = _mm_add_epi32(v24, _mm_set_epi32(1, 0, 0, 0));
    v27 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v26);
    v28 = _mm_add_epi32(v26, _mm_set_epi32(1, 0, 0, 0));
    v29 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v25 ^ v19) >> 64), (unsigned long long)v25 ^ (unsigned long long)v19);
    v30 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v29 >> 64), (unsigned long long)v29);
    v31 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v28);
    v32 = _mm_add_epi32(v28, _mm_set_epi32(1, 0, 0, 0));
    v33 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v23 ^ v20) >> 64), (unsigned long long)v23 ^ (unsigned long long)v20);
    v34 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v33 >> 64), (unsigned long long)v33);
    v35 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v30 ^ v20) >> 64), (unsigned long long)v30 ^ (unsigned long long)v20);
    v36 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v35 >> 64), (unsigned long long)v35);
    v37 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v32);
    v38 = _mm_add_epi32(v32, _mm_set_epi32(1, 0, 0, 0));
    v39 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v38);
    v40 = _mm_add_epi32(v38, _mm_set_epi32(1, 0, 0, 0));
    v41 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v27 ^ v19) >> 64), (unsigned long long)v27 ^ (unsigned long long)v19);
    v42 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v41 >> 64), (unsigned long long)v41);
    v43 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v40);
    v44 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v39 ^ v19) >> 64), (unsigned long long)v39 ^ (unsigned long long)v19);
    v45 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v44 >> 64), (unsigned long long)v44);
    v46 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v31 ^ v19) >> 64), (unsigned long long)v31 ^ (unsigned long long)v19);
    v47 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v46 >> 64), (unsigned long long)v46);
    v48 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v37 ^ v19) >> 64), (unsigned long long)v37 ^ (unsigned long long)v19);
    v49 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v48 >> 64), (unsigned long long)v48);
    v50 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_add_epi32(v40, _mm_set_epi32(1, 0, 0, 0)));
    v51 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v43 ^ v19) >> 64), (unsigned long long)v43 ^ (unsigned long long)v19);
    v52 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v51 >> 64), (unsigned long long)v51);
    v53 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v42 ^ v20) >> 64), (unsigned long long)v42 ^ (unsigned long long)v20);
    v54 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v53 >> 64), (unsigned long long)v53);
    v55 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v50 ^ v19) >> 64), (unsigned long long)v50 ^ (unsigned long long)v19);
    v56 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v55 >> 64), (unsigned long long)v55);
    v57 = a5[2];
    v58 = a5[3];
    v59 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v52 ^ v20) >> 64), (unsigned long long)v52 ^ (unsigned long long)v20);
    v60 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v59 >> 64), (unsigned long long)v59);
    v61 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v45 ^ v20) >> 64), (unsigned long long)v45 ^ (unsigned long long)v20);
    v62 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v61 >> 64), (unsigned long long)v61);
    v63 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v49 ^ v20) >> 64), (unsigned long long)v49 ^ (unsigned long long)v20);
    v64 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v63 >> 64), (unsigned long long)v63);
    v65 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v56 ^ v20) >> 64), (unsigned long long)v56 ^ (unsigned long long)v20);
    v66 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v65 >> 64), (unsigned long long)v65);
    v67 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v66 ^ v57) >> 64), (unsigned long long)v66 ^ (unsigned long long)v57);
    v68 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v67 >> 64), (unsigned long long)v67);
    v69 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v34 ^ v57) >> 64), (unsigned long long)v34 ^ (unsigned long long)v57);
    v70 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v69 >> 64), (unsigned long long)v69);
    v71 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v47 ^ v20) >> 64), (unsigned long long)v47 ^ (unsigned long long)v20);
    v72 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v71 >> 64), (unsigned long long)v71);
    v73 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v60 ^ v57) >> 64), (unsigned long long)v60 ^ (unsigned long long)v57);
    v74 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v73 >> 64), (unsigned long long)v73);
    v75 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v54 ^ v57) >> 64), (unsigned long long)v54 ^ (unsigned long long)v57);
    v76 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v75 >> 64), (unsigned long long)v75);
    v77 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v62 ^ v57) >> 64), (unsigned long long)v62 ^ (unsigned long long)v57);
    v78 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v77 >> 64), (unsigned long long)v77);
    v79 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v64 ^ v57) >> 64), (unsigned long long)v64 ^ (unsigned long long)v57);
    v80 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v79 >> 64), (unsigned long long)v79);
    v81 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v72 ^ v57) >> 64), (unsigned long long)v72 ^ (unsigned long long)v57);
    v82 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v81 >> 64), (unsigned long long)v81);
    v83 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v36 ^ v57) >> 64), (unsigned long long)v36 ^ (unsigned long long)v57);
    v84 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v83 >> 64), (unsigned long long)v83);
    v85 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v74 ^ v58) >> 64), (unsigned long long)v74 ^ (unsigned long long)v58);
    v86 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v85 >> 64), (unsigned long long)v85);
    v87 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v76 ^ v58) >> 64), (unsigned long long)v76 ^ (unsigned long long)v58);
    v88 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v87 >> 64), (unsigned long long)v87);
    v89 = a5[4];
    v90 = a5[5];
    v91 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v78 ^ v58) >> 64), (unsigned long long)v78 ^ (unsigned long long)v58);
    v92 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v91 >> 64), (unsigned long long)v91);
    v93 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v70 ^ v58) >> 64), (unsigned long long)v70 ^ (unsigned long long)v58);
    v94 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v93 >> 64), (unsigned long long)v93);
    v95 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v68 ^ v58) >> 64), (unsigned long long)v68 ^ (unsigned long long)v58);
    v96 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v95 >> 64), (unsigned long long)v95);
    v97 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v82 ^ v58) >> 64), (unsigned long long)v82 ^ (unsigned long long)v58);
    v98 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v97 >> 64), (unsigned long long)v97);
    v99 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v84 ^ v58) >> 64), (unsigned long long)v84 ^ (unsigned long long)v58);
    v100 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v99 >> 64), (unsigned long long)v99);
    v101 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v94 ^ v89) >> 64), (unsigned long long)v94 ^ (unsigned long long)v89);
    v102 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v101 >> 64), (unsigned long long)v101);
    v103 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v96 ^ v89) >> 64), (unsigned long long)v96 ^ (unsigned long long)v89);
    v104 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v103 >> 64), (unsigned long long)v103);
    v105 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v80 ^ v58) >> 64), (unsigned long long)v80 ^ (unsigned long long)v58);
    v106 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v105 >> 64), (unsigned long long)v105);
    v107 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v86 ^ v89) >> 64), (unsigned long long)v86 ^ (unsigned long long)v89);
    v108 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v107 >> 64), (unsigned long long)v107);
    v109 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v100 ^ v89) >> 64), (unsigned long long)v100 ^ (unsigned long long)v89);
    v110 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v109 >> 64), (unsigned long long)v109);
    v111 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v98 ^ v89) >> 64), (unsigned long long)v98 ^ (unsigned long long)v89);
    v112 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v111 >> 64), (unsigned long long)v111);
    v113 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v92 ^ v89) >> 64), (unsigned long long)v92 ^ (unsigned long long)v89);
    v114 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v113 >> 64), (unsigned long long)v113);
    v115 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v106 ^ v89) >> 64), (unsigned long long)v106 ^ (unsigned long long)v89);
    v116 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v115 >> 64), (unsigned long long)v115);
    v117 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v88 ^ v89) >> 64), (unsigned long long)v88 ^ (unsigned long long)v89);
    v118 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v117 >> 64), (unsigned long long)v117);
    v119 = a5[6];
    v120 = a5[7];
    v121 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v118 ^ v90) >> 64), (unsigned long long)v118 ^ (unsigned long long)v90);
    v122 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v121 >> 64), (unsigned long long)v121);
    v123 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v112 ^ v90) >> 64), (unsigned long long)v112 ^ (unsigned long long)v90);
    v124 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v123 >> 64), (unsigned long long)v123);
    v125 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v108 ^ v90) >> 64), (unsigned long long)v108 ^ (unsigned long long)v90);
    v126 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v125 >> 64), (unsigned long long)v125);
    v127 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v110 ^ v90) >> 64), (unsigned long long)v110 ^ (unsigned long long)v90);
    v128 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v127 >> 64), (unsigned long long)v127);
    v129 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v104 ^ v90) >> 64), (unsigned long long)v104 ^ (unsigned long long)v90);
    v130 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v129 >> 64), (unsigned long long)v129);
    v131 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v114 ^ v90) >> 64), (unsigned long long)v114 ^ (unsigned long long)v90);
    v132 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v131 >> 64), (unsigned long long)v131);
    v133 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v116 ^ v90) >> 64), (unsigned long long)v116 ^ (unsigned long long)v90);
    v134 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v133 >> 64), (unsigned long long)v133);
    v135 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v124 ^ v119) >> 64), (unsigned long long)v124 ^ (unsigned long long)v119);
    v136 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v135 >> 64), (unsigned long long)v135);
    v137 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v122 ^ v119) >> 64), (unsigned long long)v122 ^ (unsigned long long)v119);
    v138 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v137 >> 64), (unsigned long long)v137);
    v139 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v102 ^ v90) >> 64), (unsigned long long)v102 ^ (unsigned long long)v90);
    v140 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v139 >> 64), (unsigned long long)v139);
    v141 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v132 ^ v119) >> 64), (unsigned long long)v132 ^ (unsigned long long)v119);
    v142 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v141 >> 64), (unsigned long long)v141);
    v143 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v134 ^ v119) >> 64), (unsigned long long)v134 ^ (unsigned long long)v119);
    v144 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v143 >> 64), (unsigned long long)v143);
    v145 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v128 ^ v119) >> 64), (unsigned long long)v128 ^ (unsigned long long)v119);
    v146 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v145 >> 64), (unsigned long long)v145);
    v147 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v140 ^ v119) >> 64), (unsigned long long)v140 ^ (unsigned long long)v119);
    v148 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v147 >> 64), (unsigned long long)v147);
    v149 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v130 ^ v119) >> 64), (unsigned long long)v130 ^ (unsigned long long)v119);
    v150 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v149 >> 64), (unsigned long long)v149);
    v151 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v126 ^ v119) >> 64), (unsigned long long)v126 ^ (unsigned long long)v119);
    v152 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v151 >> 64), (unsigned long long)v151);
    v153 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v136 ^ v120) >> 64), (unsigned long long)v136 ^ (unsigned long long)v120);
    v154 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v153 >> 64), (unsigned long long)v153);
    v155 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v144 ^ v120) >> 64), (unsigned long long)v144 ^ (unsigned long long)v120);
    v156 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v155 >> 64), (unsigned long long)v155);
    v157 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v146 ^ v120) >> 64), (unsigned long long)v146 ^ (unsigned long long)v120);
    v158 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v157 >> 64), (unsigned long long)v157);
    v159 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v150 ^ v120) >> 64), (unsigned long long)v150 ^ (unsigned long long)v120);
    v160 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v159 >> 64), (unsigned long long)v159);
    v161 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v142 ^ v120) >> 64), (unsigned long long)v142 ^ (unsigned long long)v120);
    v162 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v161 >> 64), (unsigned long long)v161);
    v163 = a5[8];
    v164 = a5[9];
    v165 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v152 ^ v120) >> 64), (unsigned long long)v152 ^ (unsigned long long)v120);
    v166 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v165 >> 64), (unsigned long long)v165);
    v167 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v138 ^ v120) >> 64), (unsigned long long)v138 ^ (unsigned long long)v120);
    v168 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v167 >> 64), (unsigned long long)v167);
    v169 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v148 ^ v120) >> 64), (unsigned long long)v148 ^ (unsigned long long)v120);
    v170 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v169 >> 64), (unsigned long long)v169);
    v171 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v166 ^ v163) >> 64), (unsigned long long)v166 ^ (unsigned long long)v163);
    v172 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v171 >> 64), (unsigned long long)v171);
    v173 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v170 ^ v163) >> 64), (unsigned long long)v170 ^ (unsigned long long)v163);
    v174 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v173 >> 64), (unsigned long long)v173);
    v175 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v158 ^ v163) >> 64), (unsigned long long)v158 ^ (unsigned long long)v163);
    v176 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v175 >> 64), (unsigned long long)v175);
    v177 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v160 ^ v163) >> 64), (unsigned long long)v160 ^ (unsigned long long)v163);
    v178 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v177 >> 64), (unsigned long long)v177);
    v179 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v154 ^ v163) >> 64), (unsigned long long)v154 ^ (unsigned long long)v163);
    v180 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v179 >> 64), (unsigned long long)v179);
    v181 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v162 ^ v163) >> 64), (unsigned long long)v162 ^ (unsigned long long)v163);
    v182 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v181 >> 64), (unsigned long long)v181);
    v183 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v168 ^ v163) >> 64), (unsigned long long)v168 ^ (unsigned long long)v163);
    v184 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v183 >> 64), (unsigned long long)v183);
    v185 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v156 ^ v163) >> 64), (unsigned long long)v156 ^ (unsigned long long)v163);
    v186 = __dirty_arm64g_dirtyhelper_AESMC(/* unsupported instruction */, (unsigned long long)(v185 >> 64), (unsigned long long)v185);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v174 ^ v164) >> 64), (unsigned long long)v174 ^ (unsigned long long)v164);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v176 ^ v164) >> 64), (unsigned long long)v176 ^ (unsigned long long)v164);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v172 ^ v164) >> 64), (unsigned long long)v172 ^ (unsigned long long)v164);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v186 ^ v164) >> 64), (unsigned long long)v186 ^ (unsigned long long)v164);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v180 ^ v164) >> 64), (unsigned long long)v180 ^ (unsigned long long)v164);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v184 ^ v164) >> 64), (unsigned long long)v184 ^ (unsigned long long)v164);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v182 ^ v164) >> 64), (unsigned long long)v182 ^ (unsigned long long)v164);
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, (unsigned long long)((v178 ^ v164) >> 64), (unsigned long long)v178 ^ (unsigned long long)v164);
}
