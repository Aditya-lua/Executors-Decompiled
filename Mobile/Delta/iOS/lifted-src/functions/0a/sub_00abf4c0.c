/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabf4c0..0xabf6b0 (496 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern uint128_t g_df81c0;

double sub_abf4c0(uint128_t *a0, uint128_t *a1, unsigned long long i)
{
    unsigned long long v3;  // x30
    __m128i v4;  // q1
    uint128_t *v13;  // x3
    uint128_t *v103;  // x3
    __m128i v104;  // q16
    uint128_t v105;  // 4616
    uint128_t v106;  // 4629
    uint128_t v107;  // q0
    uint128_t v108;  // 4641
    uint128_t v109;  // q1
    __m128i v110;  // 4653
    __m128i v111;  // q6
    uint128_t *v112;  // x3
    __m128i v14;  // q16
    __m128i v113;  // q17
    uint128_t v114;  // 4665
    uint128_t v115;  // 4678
    uint128_t v116;  // q0
    uint128_t v117;  // 4690
    uint128_t v118;  // q1
    __m128i v119;  // 4702
    uint128_t *v120;  // x3
    __m128i v121;  // q16
    uint128_t v122;  // 4109
    uint128_t v15;  // 4126
    uint128_t v123;  // q0
    uint128_t v124;  // 4121
    uint128_t v125;  // q1
    uint128_t *v126;  // x3
    __m128i v127;  // q17
    uint128_t v128;  // 4109
    uint128_t v129;  // q0
    uint128_t v130;  // 4121
    uint128_t v131;  // q1
    __m128i v132;  // q16
    uint128_t v16;  // 4139
    uint128_t v133;  // 4141
    uint128_t v134;  // q0
    uint128_t v135;  // 4153
    uint128_t v136;  // q1
    __m128i v137;  // q17
    __m128i v138;  // 4167
    __m128i v139;  // 4179
    uint128_t v17;  // q0
    uint128_t v18;  // 4151
    uint128_t v19;  // q1
    __m128i v20;  // 4163
    __m128i v21;  // q4
    uint128_t *v22;  // x3
    __m128i v5;  // q0
    __m128i v23;  // q17
    uint128_t v24;  // 4175
    uint128_t v25;  // 4188
    uint128_t v26;  // q0
    uint128_t v27;  // 4200
    uint128_t v28;  // q1
    __m128i v29;  // 4212
    __m128i v30;  // q5
    uint128_t *v31;  // x3
    __m128i v32;  // q16
    uint128_t *v6;  // x3
    uint128_t v33;  // 4224
    uint128_t v34;  // 4237
    uint128_t v35;  // q0
    uint128_t v36;  // 4249
    uint128_t v37;  // q1
    __m128i v38;  // 4261
    __m128i v39;  // q6
    uint128_t *v40;  // x3
    __m128i v41;  // q17
    uint128_t v42;  // 4273
    uint128_t *v7;  // x1
    uint128_t v43;  // 4286
    uint128_t v44;  // q0
    uint128_t v45;  // 4298
    uint128_t v46;  // q1
    __m128i v47;  // 4310
    __m128i v48;  // q7
    uint128_t *v49;  // x3
    __m128i v50;  // q16
    uint128_t v51;  // 4322
    uint128_t v52;  // 4335
    uint128_t *v8;  // x3
    uint128_t v53;  // q0
    uint128_t v54;  // 4347
    uint128_t v55;  // q1
    __m128i v56;  // 4359
    __m128i v57;  // q4
    uint128_t *v58;  // x3
    __m128i v59;  // q17
    uint128_t v60;  // 4371
    uint128_t v61;  // 4384
    uint128_t v62;  // q0
    __m128i v9;  // q4
    uint128_t v63;  // 4396
    uint128_t v64;  // q1
    __m128i v65;  // 4408
    __m128i v66;  // q5
    uint128_t *v67;  // x3
    __m128i v68;  // q16
    uint128_t v69;  // 4420
    uint128_t v70;  // 4433
    uint128_t v71;  // q0
    uint128_t v72;  // 4445
    __m128i v10;  // q5
    uint128_t v73;  // q1
    __m128i v74;  // 4457
    __m128i v75;  // q6
    uint128_t *v76;  // x3
    __m128i v77;  // q17
    uint128_t v78;  // 4469
    uint128_t v79;  // 4482
    uint128_t v80;  // q0
    uint128_t v81;  // 4494
    uint128_t v82;  // q1
    __m128i v11;  // q6
    __m128i v83;  // 4506
    __m128i v84;  // q7
    uint128_t *v85;  // x3
    __m128i v86;  // q16
    uint128_t v87;  // 4518
    uint128_t v88;  // 4531
    uint128_t v89;  // q0
    uint128_t v90;  // 4543
    uint128_t v91;  // q1
    __m128i v92;  // 4555
    __m128i v12;  // q7
    __m128i v93;  // q4
    uint128_t *v94;  // x3
    __m128i v95;  // q17
    uint128_t v96;  // 4567
    uint128_t v97;  // 4580
    uint128_t v98;  // q0
    uint128_t v99;  // 4592
    uint128_t v100;  // q1
    __m128i v101;  // 4604
    __m128i v102;  // q5
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = a0[1];
    v5 = *a0;
    v6 = &g_df81c0;
    do
    {
        v7 = a1 + 4;
        i -= 1;
        v8 = v6 + 1;
        v9 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*a1);
        v10 = __dirty_unsupported_Iop_Reverse8sIn32_x4(a1[1]);
        v11 = __dirty_unsupported_Iop_Reverse8sIn32_x4(a1[2]);
        v12 = __dirty_unsupported_Iop_Reverse8sIn32_x4(a1[3]);
        v13 = v8 + 1;
        v14 = _mm_add_epi32(*v6, v9);
        v15 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v9, 1), _mm_cvtsi128_si64(v9), _mm_extract_epi64(v10, 1), _mm_cvtsi128_si64(v10));
        v16 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, _mm_extract_epi64(v5, 1), _mm_cvtsi128_si64(v5), _mm_extract_epi64(v4, 1), _mm_cvtsi128_si64(v4), _mm_extract_epi64(v14, 1), _mm_cvtsi128_si64(v14));
        v17 = v16;
        v18 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, _mm_extract_epi64(v4, 1), _mm_cvtsi128_si64(v4), _mm_extract_epi64(v5, 1), _mm_cvtsi128_si64(v5), _mm_extract_epi64(v14, 1), _mm_cvtsi128_si64(v14));
        v19 = v18;
        v20 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v15 >> 64), (unsigned long long)v15, _mm_extract_epi64(v11, 1), _mm_cvtsi128_si64(v11), _mm_extract_epi64(v12, 1), _mm_cvtsi128_si64(v12));
        v21 = v20;
        v22 = v13 + 1;
        v23 = _mm_add_epi32(*v8, v10);
        v24 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v10, 1), _mm_cvtsi128_si64(v10), _mm_extract_epi64(v11, 1), _mm_cvtsi128_si64(v11));
        v25 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v17 >> 64), (unsigned long long)v17, (unsigned long long)(v19 >> 64), (unsigned long long)v19, _mm_extract_epi64(v23, 1), _mm_cvtsi128_si64(v23));
        v26 = v25;
        v27 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v19 >> 64), (unsigned long long)v19, (unsigned long long)(v17 >> 64), (unsigned long long)v17, _mm_extract_epi64(v23, 1), _mm_cvtsi128_si64(v23));
        v28 = v27;
        v29 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v24 >> 64), (unsigned long long)v24, _mm_extract_epi64(v12, 1), _mm_cvtsi128_si64(v12), _mm_extract_epi64(v21, 1), _mm_cvtsi128_si64(v21));
        v30 = v29;
        v31 = v22 + 1;
        v32 = _mm_add_epi32(*v13, v11);
        v33 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v11, 1), _mm_cvtsi128_si64(v11), _mm_extract_epi64(v12, 1), _mm_cvtsi128_si64(v12));
        v34 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v26 >> 64), (unsigned long long)v26, (unsigned long long)(v28 >> 64), (unsigned long long)v28, _mm_extract_epi64(v32, 1), _mm_cvtsi128_si64(v32));
        v35 = v34;
        v36 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v28 >> 64), (unsigned long long)v28, (unsigned long long)(v26 >> 64), (unsigned long long)v26, _mm_extract_epi64(v32, 1), _mm_cvtsi128_si64(v32));
        v37 = v36;
        v38 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v33 >> 64), (unsigned long long)v33, _mm_extract_epi64(v21, 1), _mm_cvtsi128_si64(v21), _mm_extract_epi64(v30, 1), _mm_cvtsi128_si64(v30));
        v39 = v38;
        v40 = v31 + 1;
        v41 = _mm_add_epi32(*v22, v12);
        v42 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v12, 1), _mm_cvtsi128_si64(v12), _mm_extract_epi64(v21, 1), _mm_cvtsi128_si64(v21));
        v43 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v35 >> 64), (unsigned long long)v35, (unsigned long long)(v37 >> 64), (unsigned long long)v37, _mm_extract_epi64(v41, 1), _mm_cvtsi128_si64(v41));
        v44 = v43;
        v45 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v37 >> 64), (unsigned long long)v37, (unsigned long long)(v35 >> 64), (unsigned long long)v35, _mm_extract_epi64(v41, 1), _mm_cvtsi128_si64(v41));
        v46 = v45;
        v47 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v42 >> 64), (unsigned long long)v42, _mm_extract_epi64(v30, 1), _mm_cvtsi128_si64(v30), _mm_extract_epi64(v39, 1), _mm_cvtsi128_si64(v39));
        v48 = v47;
        v49 = v40 + 1;
        v50 = _mm_add_epi32(*v31, v21);
        v51 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v21, 1), _mm_cvtsi128_si64(v21), _mm_extract_epi64(v30, 1), _mm_cvtsi128_si64(v30));
        v52 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v44 >> 64), (unsigned long long)v44, (unsigned long long)(v46 >> 64), (unsigned long long)v46, _mm_extract_epi64(v50, 1), _mm_cvtsi128_si64(v50));
        v53 = v52;
        v54 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v46 >> 64), (unsigned long long)v46, (unsigned long long)(v44 >> 64), (unsigned long long)v44, _mm_extract_epi64(v50, 1), _mm_cvtsi128_si64(v50));
        v55 = v54;
        v56 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v51 >> 64), (unsigned long long)v51, _mm_extract_epi64(v39, 1), _mm_cvtsi128_si64(v39), _mm_extract_epi64(v48, 1), _mm_cvtsi128_si64(v48));
        v57 = v56;
        v58 = v49 + 1;
        v59 = _mm_add_epi32(*v40, v30);
        v60 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v30, 1), _mm_cvtsi128_si64(v30), _mm_extract_epi64(v39, 1), _mm_cvtsi128_si64(v39));
        v61 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v53 >> 64), (unsigned long long)v53, (unsigned long long)(v55 >> 64), (unsigned long long)v55, _mm_extract_epi64(v59, 1), _mm_cvtsi128_si64(v59));
        v62 = v61;
        v63 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v55 >> 64), (unsigned long long)v55, (unsigned long long)(v53 >> 64), (unsigned long long)v53, _mm_extract_epi64(v59, 1), _mm_cvtsi128_si64(v59));
        v64 = v63;
        v65 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v60 >> 64), (unsigned long long)v60, _mm_extract_epi64(v48, 1), _mm_cvtsi128_si64(v48), _mm_extract_epi64(v57, 1), _mm_cvtsi128_si64(v57));
        v66 = v65;
        v67 = v58 + 1;
        v68 = _mm_add_epi32(*v49, v39);
        v69 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v39, 1), _mm_cvtsi128_si64(v39), _mm_extract_epi64(v48, 1), _mm_cvtsi128_si64(v48));
        v70 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v62 >> 64), (unsigned long long)v62, (unsigned long long)(v64 >> 64), (unsigned long long)v64, _mm_extract_epi64(v68, 1), _mm_cvtsi128_si64(v68));
        v71 = v70;
        v72 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v64 >> 64), (unsigned long long)v64, (unsigned long long)(v62 >> 64), (unsigned long long)v62, _mm_extract_epi64(v68, 1), _mm_cvtsi128_si64(v68));
        v73 = v72;
        v74 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v69 >> 64), (unsigned long long)v69, _mm_extract_epi64(v57, 1), _mm_cvtsi128_si64(v57), _mm_extract_epi64(v66, 1), _mm_cvtsi128_si64(v66));
        v75 = v74;
        v76 = v67 + 1;
        v77 = _mm_add_epi32(*v58, v48);
        v78 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v48, 1), _mm_cvtsi128_si64(v48), _mm_extract_epi64(v57, 1), _mm_cvtsi128_si64(v57));
        v79 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v71 >> 64), (unsigned long long)v71, (unsigned long long)(v73 >> 64), (unsigned long long)v73, _mm_extract_epi64(v77, 1), _mm_cvtsi128_si64(v77));
        v80 = v79;
        v81 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v73 >> 64), (unsigned long long)v73, (unsigned long long)(v71 >> 64), (unsigned long long)v71, _mm_extract_epi64(v77, 1), _mm_cvtsi128_si64(v77));
        v82 = v81;
        v83 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v78 >> 64), (unsigned long long)v78, _mm_extract_epi64(v66, 1), _mm_cvtsi128_si64(v66), _mm_extract_epi64(v75, 1), _mm_cvtsi128_si64(v75));
        v84 = v83;
        v85 = v76 + 1;
        v86 = _mm_add_epi32(*v67, v57);
        v87 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v57, 1), _mm_cvtsi128_si64(v57), _mm_extract_epi64(v66, 1), _mm_cvtsi128_si64(v66));
        v88 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v80 >> 64), (unsigned long long)v80, (unsigned long long)(v82 >> 64), (unsigned long long)v82, _mm_extract_epi64(v86, 1), _mm_cvtsi128_si64(v86));
        v89 = v88;
        v90 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v82 >> 64), (unsigned long long)v82, (unsigned long long)(v80 >> 64), (unsigned long long)v80, _mm_extract_epi64(v86, 1), _mm_cvtsi128_si64(v86));
        v91 = v90;
        v92 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v87 >> 64), (unsigned long long)v87, _mm_extract_epi64(v75, 1), _mm_cvtsi128_si64(v75), _mm_extract_epi64(v84, 1), _mm_cvtsi128_si64(v84));
        v93 = v92;
        v94 = v85 + 1;
        v95 = _mm_add_epi32(*v76, v66);
        v96 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v66, 1), _mm_cvtsi128_si64(v66), _mm_extract_epi64(v75, 1), _mm_cvtsi128_si64(v75));
        v97 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v89 >> 64), (unsigned long long)v89, (unsigned long long)(v91 >> 64), (unsigned long long)v91, _mm_extract_epi64(v95, 1), _mm_cvtsi128_si64(v95));
        v98 = v97;
        v99 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v91 >> 64), (unsigned long long)v91, (unsigned long long)(v89 >> 64), (unsigned long long)v89, _mm_extract_epi64(v95, 1), _mm_cvtsi128_si64(v95));
        v100 = v99;
        v101 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v96 >> 64), (unsigned long long)v96, _mm_extract_epi64(v84, 1), _mm_cvtsi128_si64(v84), _mm_extract_epi64(v93, 1), _mm_cvtsi128_si64(v93));
        v102 = v101;
        v103 = v94 + 1;
        v104 = _mm_add_epi32(*v85, v75);
        v105 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v75, 1), _mm_cvtsi128_si64(v75), _mm_extract_epi64(v84, 1), _mm_cvtsi128_si64(v84));
        v106 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v98 >> 64), (unsigned long long)v98, (unsigned long long)(v100 >> 64), (unsigned long long)v100, _mm_extract_epi64(v104, 1), _mm_cvtsi128_si64(v104));
        v107 = v106;
        v108 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v100 >> 64), (unsigned long long)v100, (unsigned long long)(v98 >> 64), (unsigned long long)v98, _mm_extract_epi64(v104, 1), _mm_cvtsi128_si64(v104));
        v109 = v108;
        v110 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v105 >> 64), (unsigned long long)v105, _mm_extract_epi64(v93, 1), _mm_cvtsi128_si64(v93), _mm_extract_epi64(v102, 1), _mm_cvtsi128_si64(v102));
        v111 = v110;
        v112 = v103 + 1;
        v113 = _mm_add_epi32(*v94, v84);
        v114 = __dirty_arm64g_dirtyhelper_SHA256SU0(/* unsupported instruction */, _mm_extract_epi64(v84, 1), _mm_cvtsi128_si64(v84), _mm_extract_epi64(v93, 1), _mm_cvtsi128_si64(v93));
        v115 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v107 >> 64), (unsigned long long)v107, (unsigned long long)(v109 >> 64), (unsigned long long)v109, _mm_extract_epi64(v113, 1), _mm_cvtsi128_si64(v113));
        v116 = v115;
        v117 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v109 >> 64), (unsigned long long)v109, (unsigned long long)(v107 >> 64), (unsigned long long)v107, _mm_extract_epi64(v113, 1), _mm_cvtsi128_si64(v113));
        v118 = v117;
        v119 = __dirty_arm64g_dirtyhelper_SHA256SU1(/* unsupported instruction */, (unsigned long long)(v114 >> 64), (unsigned long long)v114, _mm_extract_epi64(v102, 1), _mm_cvtsi128_si64(v102), _mm_extract_epi64(v111, 1), _mm_cvtsi128_si64(v111));
        v120 = v112 + 1;
        v121 = _mm_add_epi32(*v103, v93);
        v122 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v116 >> 64), (unsigned long long)v116, (unsigned long long)(v118 >> 64), (unsigned long long)v118, _mm_extract_epi64(v121, 1), _mm_cvtsi128_si64(v121));
        v123 = v122;
        v124 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v118 >> 64), (unsigned long long)v118, (unsigned long long)(v116 >> 64), (unsigned long long)v116, _mm_extract_epi64(v121, 1), _mm_cvtsi128_si64(v121));
        v125 = v124;
        v126 = v120 + 1;
        v127 = _mm_add_epi32(*v112, v102);
        v128 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v123 >> 64), (unsigned long long)v123, (unsigned long long)(v125 >> 64), (unsigned long long)v125, _mm_extract_epi64(v127, 1), _mm_cvtsi128_si64(v127));
        v129 = v128;
        v130 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v125 >> 64), (unsigned long long)v125, (unsigned long long)(v123 >> 64), (unsigned long long)v123, _mm_extract_epi64(v127, 1), _mm_cvtsi128_si64(v127));
        v131 = v130;
        v132 = _mm_add_epi32(*v120, v111);
        v6 = (char *)v126 - 240;
        v133 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v129 >> 64), (unsigned long long)v129, (unsigned long long)(v131 >> 64), (unsigned long long)v131, _mm_extract_epi64(v132, 1), _mm_cvtsi128_si64(v132));
        v134 = v133;
        v135 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v131 >> 64), (unsigned long long)v131, (unsigned long long)(v129 >> 64), (unsigned long long)v129, _mm_extract_epi64(v132, 1), _mm_cvtsi128_si64(v132));
        v136 = v135;
        v137 = _mm_add_epi32(*v126, v119);
        v138 = __dirty_arm64g_dirtyhelper_SHA256H(/* unsupported instruction */, (unsigned long long)(v134 >> 64), (unsigned long long)v134, (unsigned long long)(v136 >> 64), (unsigned long long)v136, _mm_extract_epi64(v137, 1), _mm_cvtsi128_si64(v137));
        v139 = __dirty_arm64g_dirtyhelper_SHA256H2(/* unsupported instruction */, (unsigned long long)(v136 >> 64), (unsigned long long)v136, (unsigned long long)(v134 >> 64), (unsigned long long)v134, _mm_extract_epi64(v137, 1), _mm_cvtsi128_si64(v137));
        v5 = _mm_add_epi32(v138, v5);
        v4 = _mm_add_epi32(v139, v4);
        a1 = v7;
    } while (i);
    a0[1] = v4;
    *a0 = v5;
    return _mm_cvtsi128_si64(v5);
}
