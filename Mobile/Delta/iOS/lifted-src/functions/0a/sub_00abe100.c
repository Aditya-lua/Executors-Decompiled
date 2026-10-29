/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabe100..0xabe2cc (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_abe100_0 {
    uint128_t field_0;
    unsigned int field_10;
} st_abe100_0;


unsigned int * sub_abe100(st_abe100_0 *a0, uint128_t *a1, unsigned long long a2)
{
    unsigned long long v3;  // x30
    uint128_t v4;  // q0
    uint128_t v13;  // 4118
    uint128_t v103;  // q0
    __m128i v104;  // 4716
    __m128i v105;  // q6
    uint128_t v106;  // 4728
    uint128_t v107;  // 4735
    uint128_t v108;  // 4747
    uint128_t v109;  // q0
    __m128i v110;  // 4103
    uint128_t v111;  // 4110
    uint128_t v112;  // 4122
    uint128_t v14;  // 4130
    uint128_t v113;  // q0
    uint128_t v114;  // 4130
    uint128_t v115;  // 4142
    uint128_t v116;  // q0
    uint128_t v117;  // 4149
    uint128_t v118;  // 4161
    uint128_t v15;  // q0
    uint128_t v16;  // 4143
    uint128_t v17;  // 4150
    uint128_t v18;  // 4162
    uint128_t v19;  // q0
    __m128i v20;  // 4170
    __m128i v21;  // q4
    uint128_t v22;  // 4182
    unsigned int *v5;  // x0
    uint128_t v23;  // 4189
    uint128_t v24;  // 4201
    uint128_t v25;  // q0
    __m128i v26;  // 4209
    __m128i v27;  // q5
    uint128_t v28;  // 4221
    uint128_t v29;  // 4228
    uint128_t v30;  // 4240
    uint128_t v31;  // q0
    __m128i v32;  // 4248
    uint128_t v6;  // q1
    __m128i v33;  // q6
    uint128_t v34;  // 4260
    uint128_t v35;  // 4267
    uint128_t v36;  // 4279
    uint128_t v37;  // q0
    __m128i v38;  // 4287
    __m128i v39;  // q7
    uint128_t v40;  // 4299
    uint128_t v41;  // 4306
    uint128_t v42;  // 4318
    st_abe100_0 *v7;  // x0
    uint128_t v43;  // q0
    __m128i v44;  // 4326
    __m128i v45;  // q4
    uint128_t v46;  // 4338
    uint128_t v47;  // 4345
    uint128_t v48;  // 4357
    uint128_t v49;  // q0
    __m128i v50;  // 4365
    __m128i v51;  // q5
    uint128_t v52;  // 4377
    uint128_t *v8;  // x1
    uint128_t v53;  // 4384
    uint128_t v54;  // 4396
    uint128_t v55;  // q0
    __m128i v56;  // 4404
    __m128i v57;  // q6
    uint128_t v58;  // 4416
    uint128_t v59;  // 4423
    uint128_t v60;  // 4435
    uint128_t v61;  // q0
    __m128i v62;  // 4443
    __m128i v9;  // q4
    __m128i v63;  // q7
    uint128_t v64;  // 4455
    uint128_t v65;  // 4462
    uint128_t v66;  // 4474
    uint128_t v67;  // q0
    __m128i v68;  // 4482
    __m128i v69;  // q4
    uint128_t v70;  // 4494
    uint128_t v71;  // 4501
    uint128_t v72;  // 4513
    __m128i v10;  // q5
    uint128_t v73;  // q0
    __m128i v74;  // 4521
    __m128i v75;  // q5
    uint128_t v76;  // 4533
    uint128_t v77;  // 4540
    uint128_t v78;  // 4552
    uint128_t v79;  // q0
    __m128i v80;  // 4560
    __m128i v81;  // q6
    uint128_t v82;  // 4572
    __m128i v11;  // q6
    uint128_t v83;  // 4579
    uint128_t v84;  // 4591
    uint128_t v85;  // q0
    __m128i v86;  // 4599
    __m128i v87;  // q7
    uint128_t v88;  // 4611
    uint128_t v89;  // 4618
    uint128_t v90;  // 4630
    uint128_t v91;  // q0
    __m128i v92;  // 4638
    __m128i v12;  // q7
    __m128i v93;  // q4
    uint128_t v94;  // 4650
    uint128_t v95;  // 4657
    uint128_t v96;  // 4669
    uint128_t v97;  // q0
    __m128i v98;  // 4677
    __m128i v99;  // q5
    uint128_t v100;  // 4689
    uint128_t v101;  // 4696
    uint128_t v102;  // 4708
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = a0->field_0;
    v5 = &a0->field_10;
    v6 = *v5;
    v7 = (char *)v5 - 16;
    do
    {
        v8 = a1 + 4;
        a2 -= 1;
        v9 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*a1);
        v10 = __dirty_unsupported_Iop_Reverse8sIn32_x4(a1[1]);
        v11 = __dirty_unsupported_Iop_Reverse8sIn32_x4(a1[2]);
        v12 = __dirty_unsupported_Iop_Reverse8sIn32_x4(a1[3]);
        v13 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v4);
        v14 = __dirty_arm64g_dirtyhelper_SHA1C(/* unsupported instruction */, (unsigned long long)(v4 >> 64), (unsigned long long)v4, 0, (unsigned int)v6, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(1518500249), v9), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(1518500249), v9)));
        v15 = v14;
        v16 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v9, 1), _mm_cvtsi128_si64(v9), _mm_extract_epi64(v10, 1), _mm_cvtsi128_si64(v10), _mm_extract_epi64(v11, 1), _mm_cvtsi128_si64(v11));
        v17 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v15);
        v18 = __dirty_arm64g_dirtyhelper_SHA1C(/* unsupported instruction */, (unsigned long long)(v15 >> 64), (unsigned long long)v15, 0, (unsigned int)v13, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(1518500249), v10), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(1518500249), v10)));
        v19 = v18;
        v20 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v16 >> 64), (unsigned long long)v16, _mm_extract_epi64(v12, 1), _mm_cvtsi128_si64(v12));
        v21 = v20;
        v22 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v10, 1), _mm_cvtsi128_si64(v10), _mm_extract_epi64(v11, 1), _mm_cvtsi128_si64(v11), _mm_extract_epi64(v12, 1), _mm_cvtsi128_si64(v12));
        v23 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v19);
        v24 = __dirty_arm64g_dirtyhelper_SHA1C(/* unsupported instruction */, (unsigned long long)(v19 >> 64), (unsigned long long)v19, 0, (unsigned int)v17, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(1518500249), v11), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(1518500249), v11)));
        v25 = v24;
        v26 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v22 >> 64), (unsigned long long)v22, _mm_extract_epi64(v21, 1), _mm_cvtsi128_si64(v21));
        v27 = v26;
        v28 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v11, 1), _mm_cvtsi128_si64(v11), _mm_extract_epi64(v12, 1), _mm_cvtsi128_si64(v12), _mm_extract_epi64(v21, 1), _mm_cvtsi128_si64(v21));
        v29 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v25);
        v30 = __dirty_arm64g_dirtyhelper_SHA1C(/* unsupported instruction */, (unsigned long long)(v25 >> 64), (unsigned long long)v25, 0, (unsigned int)v23, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(1518500249), v12), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(1518500249), v12)));
        v31 = v30;
        v32 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v28 >> 64), (unsigned long long)v28, _mm_extract_epi64(v27, 1), _mm_cvtsi128_si64(v27));
        v33 = v32;
        v34 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v12, 1), _mm_cvtsi128_si64(v12), _mm_extract_epi64(v21, 1), _mm_cvtsi128_si64(v21), _mm_extract_epi64(v27, 1), _mm_cvtsi128_si64(v27));
        v35 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v31);
        v36 = __dirty_arm64g_dirtyhelper_SHA1C(/* unsupported instruction */, (unsigned long long)(v31 >> 64), (unsigned long long)v31, 0, (unsigned int)v29, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(1518500249), v21), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(1518500249), v21)));
        v37 = v36;
        v38 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v34 >> 64), (unsigned long long)v34, _mm_extract_epi64(v33, 1), _mm_cvtsi128_si64(v33));
        v39 = v38;
        v40 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v21, 1), _mm_cvtsi128_si64(v21), _mm_extract_epi64(v27, 1), _mm_cvtsi128_si64(v27), _mm_extract_epi64(v33, 1), _mm_cvtsi128_si64(v33));
        v41 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v37);
        v42 = __dirty_arm64g_dirtyhelper_SHA1P(/* unsupported instruction */, (unsigned long long)(v37 >> 64), (unsigned long long)v37, 0, (unsigned int)v35, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(1859775393), v27), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(1859775393), v27)));
        v43 = v42;
        v44 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v40 >> 64), (unsigned long long)v40, _mm_extract_epi64(v39, 1), _mm_cvtsi128_si64(v39));
        v45 = v44;
        v46 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v27, 1), _mm_cvtsi128_si64(v27), _mm_extract_epi64(v33, 1), _mm_cvtsi128_si64(v33), _mm_extract_epi64(v39, 1), _mm_cvtsi128_si64(v39));
        v47 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v43);
        v48 = __dirty_arm64g_dirtyhelper_SHA1P(/* unsupported instruction */, (unsigned long long)(v43 >> 64), (unsigned long long)v43, 0, (unsigned int)v41, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(1859775393), v33), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(1859775393), v33)));
        v49 = v48;
        v50 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v46 >> 64), (unsigned long long)v46, _mm_extract_epi64(v45, 1), _mm_cvtsi128_si64(v45));
        v51 = v50;
        v52 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v33, 1), _mm_cvtsi128_si64(v33), _mm_extract_epi64(v39, 1), _mm_cvtsi128_si64(v39), _mm_extract_epi64(v45, 1), _mm_cvtsi128_si64(v45));
        v53 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v49);
        v54 = __dirty_arm64g_dirtyhelper_SHA1P(/* unsupported instruction */, (unsigned long long)(v49 >> 64), (unsigned long long)v49, 0, (unsigned int)v47, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(1859775393), v39), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(1859775393), v39)));
        v55 = v54;
        v56 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v52 >> 64), (unsigned long long)v52, _mm_extract_epi64(v51, 1), _mm_cvtsi128_si64(v51));
        v57 = v56;
        v58 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v39, 1), _mm_cvtsi128_si64(v39), _mm_extract_epi64(v45, 1), _mm_cvtsi128_si64(v45), _mm_extract_epi64(v51, 1), _mm_cvtsi128_si64(v51));
        v59 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v55);
        v60 = __dirty_arm64g_dirtyhelper_SHA1P(/* unsupported instruction */, (unsigned long long)(v55 >> 64), (unsigned long long)v55, 0, (unsigned int)v53, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(1859775393), v45), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(1859775393), v45)));
        v61 = v60;
        v62 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v58 >> 64), (unsigned long long)v58, _mm_extract_epi64(v57, 1), _mm_cvtsi128_si64(v57));
        v63 = v62;
        v64 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v45, 1), _mm_cvtsi128_si64(v45), _mm_extract_epi64(v51, 1), _mm_cvtsi128_si64(v51), _mm_extract_epi64(v57, 1), _mm_cvtsi128_si64(v57));
        v65 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v61);
        v66 = __dirty_arm64g_dirtyhelper_SHA1P(/* unsupported instruction */, (unsigned long long)(v61 >> 64), (unsigned long long)v61, 0, (unsigned int)v59, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(1859775393), v51), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(1859775393), v51)));
        v67 = v66;
        v68 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v64 >> 64), (unsigned long long)v64, _mm_extract_epi64(v63, 1), _mm_cvtsi128_si64(v63));
        v69 = v68;
        v70 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v51, 1), _mm_cvtsi128_si64(v51), _mm_extract_epi64(v57, 1), _mm_cvtsi128_si64(v57), _mm_extract_epi64(v63, 1), _mm_cvtsi128_si64(v63));
        v71 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v67);
        v72 = __dirty_arm64g_dirtyhelper_SHA1M(/* unsupported instruction */, (unsigned long long)(v67 >> 64), (unsigned long long)v67, 0, (unsigned int)v65, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(2400959708), v57), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(2400959708), v57)));
        v73 = v72;
        v74 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v70 >> 64), (unsigned long long)v70, _mm_extract_epi64(v69, 1), _mm_cvtsi128_si64(v69));
        v75 = v74;
        v76 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v57, 1), _mm_cvtsi128_si64(v57), _mm_extract_epi64(v63, 1), _mm_cvtsi128_si64(v63), _mm_extract_epi64(v69, 1), _mm_cvtsi128_si64(v69));
        v77 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v73);
        v78 = __dirty_arm64g_dirtyhelper_SHA1M(/* unsupported instruction */, (unsigned long long)(v73 >> 64), (unsigned long long)v73, 0, (unsigned int)v71, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(2400959708), v63), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(2400959708), v63)));
        v79 = v78;
        v80 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v76 >> 64), (unsigned long long)v76, _mm_extract_epi64(v75, 1), _mm_cvtsi128_si64(v75));
        v81 = v80;
        v82 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v63, 1), _mm_cvtsi128_si64(v63), _mm_extract_epi64(v69, 1), _mm_cvtsi128_si64(v69), _mm_extract_epi64(v75, 1), _mm_cvtsi128_si64(v75));
        v83 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v79);
        v84 = __dirty_arm64g_dirtyhelper_SHA1M(/* unsupported instruction */, (unsigned long long)(v79 >> 64), (unsigned long long)v79, 0, (unsigned int)v77, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(2400959708), v69), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(2400959708), v69)));
        v85 = v84;
        v86 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v82 >> 64), (unsigned long long)v82, _mm_extract_epi64(v81, 1), _mm_cvtsi128_si64(v81));
        v87 = v86;
        v88 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v69, 1), _mm_cvtsi128_si64(v69), _mm_extract_epi64(v75, 1), _mm_cvtsi128_si64(v75), _mm_extract_epi64(v81, 1), _mm_cvtsi128_si64(v81));
        v89 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v85);
        v90 = __dirty_arm64g_dirtyhelper_SHA1M(/* unsupported instruction */, (unsigned long long)(v85 >> 64), (unsigned long long)v85, 0, (unsigned int)v83, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(2400959708), v75), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(2400959708), v75)));
        v91 = v90;
        v92 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v88 >> 64), (unsigned long long)v88, _mm_extract_epi64(v87, 1), _mm_cvtsi128_si64(v87));
        v93 = v92;
        v94 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v75, 1), _mm_cvtsi128_si64(v75), _mm_extract_epi64(v81, 1), _mm_cvtsi128_si64(v81), _mm_extract_epi64(v87, 1), _mm_cvtsi128_si64(v87));
        v95 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v91);
        v96 = __dirty_arm64g_dirtyhelper_SHA1M(/* unsupported instruction */, (unsigned long long)(v91 >> 64), (unsigned long long)v91, 0, (unsigned int)v89, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(2400959708), v81), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(2400959708), v81)));
        v97 = v96;
        v98 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v94 >> 64), (unsigned long long)v94, _mm_extract_epi64(v93, 1), _mm_cvtsi128_si64(v93));
        v99 = v98;
        v100 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v81, 1), _mm_cvtsi128_si64(v81), _mm_extract_epi64(v87, 1), _mm_cvtsi128_si64(v87), _mm_extract_epi64(v93, 1), _mm_cvtsi128_si64(v93));
        v101 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v97);
        v102 = __dirty_arm64g_dirtyhelper_SHA1P(/* unsupported instruction */, (unsigned long long)(v97 >> 64), (unsigned long long)v97, 0, (unsigned int)v95, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(3395469782), v87), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(3395469782), v87)));
        v103 = v102;
        v104 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v100 >> 64), (unsigned long long)v100, _mm_extract_epi64(v99, 1), _mm_cvtsi128_si64(v99));
        v105 = v104;
        v106 = __dirty_arm64g_dirtyhelper_SHA1SU0(/* unsupported instruction */, _mm_extract_epi64(v87, 1), _mm_cvtsi128_si64(v87), _mm_extract_epi64(v93, 1), _mm_cvtsi128_si64(v93), _mm_extract_epi64(v99, 1), _mm_cvtsi128_si64(v99));
        v107 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v103);
        v108 = __dirty_arm64g_dirtyhelper_SHA1P(/* unsupported instruction */, (unsigned long long)(v103 >> 64), (unsigned long long)v103, 0, (unsigned int)v101, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(3395469782), v93), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(3395469782), v93)));
        v109 = v108;
        v110 = __dirty_arm64g_dirtyhelper_SHA1SU1(/* unsupported instruction */, (unsigned long long)(v106 >> 64), (unsigned long long)v106, _mm_extract_epi64(v105, 1), _mm_cvtsi128_si64(v105));
        v111 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v109);
        v112 = __dirty_arm64g_dirtyhelper_SHA1P(/* unsupported instruction */, (unsigned long long)(v109 >> 64), (unsigned long long)v109, 0, (unsigned int)v107, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(3395469782), v99), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(3395469782), v99)));
        v113 = v112;
        v114 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v113);
        v115 = __dirty_arm64g_dirtyhelper_SHA1P(/* unsupported instruction */, (unsigned long long)(v113 >> 64), (unsigned long long)v113, 0, (unsigned int)v111, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(3395469782), v105), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(3395469782), v105)));
        v116 = v115;
        v117 = __dirty_arm64g_dirtyhelper_SHA1H(/* unsupported instruction */, 0, (unsigned int)v116);
        v118 = __dirty_arm64g_dirtyhelper_SHA1P(/* unsupported instruction */, (unsigned long long)(v116 >> 64), (unsigned long long)v116, 0, (unsigned int)v114, _mm_extract_epi64(_mm_add_epi32(_mm_set1_epi32(3395469782), v110), 1), _mm_cvtsi128_si64(_mm_add_epi32(_mm_set1_epi32(3395469782), v110)));
    } while ((v6 = _mm_add_epi32(v6, v117), v4 = _mm_add_epi32(v118, v4), a1 = v8, a2));
    v7->field_0 = v4;
    v7->field_10 = *(unsigned int *)&v6;
    return &v7->field_10;
}
