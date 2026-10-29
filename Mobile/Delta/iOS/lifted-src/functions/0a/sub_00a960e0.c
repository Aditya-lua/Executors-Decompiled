/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa960e0..0xa96340 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


uint128_t * sub_a960e0(uint128_t *a0, uint128_t *a1)
{
    __m128i v0;  // q17
    __m128i v1;  // q19
    __m128i v10;  // q16
    uint128_t v100;  // q5
    uint128_t v101;  // 4145
    uint128_t v102;  // q2
    uint128_t v103;  // 4146
    uint128_t v104;  // q7
    uint128_t v105;  // 4147
    uint128_t v106;  // 4148
    uint128_t v109;  // q1
    uint128_t v11;  // 4138
    uint128_t v110;  // 4175
    uint128_t v111;  // q6
    uint128_t v112;  // 4180
    uint128_t v117;  // q0
    uint128_t v118;  // q5
    uint128_t v12;  // q2
    uint128_t v121;  // 4195
    uint128_t v122;  // 4196
    uint128_t v123;  // q29
    uint128_t v124;  // q31
    uint128_t v127;  // q30
    uint128_t v13;  // 4139
    uint128_t v15;  // q1
    uint128_t v16;  // 4155
    uint128_t v19;  // q0
    __m128i v2;  // q3
    uint128_t v21;  // 4163
    uint128_t v22;  // q22
    uint128_t v24;  // q17
    uint128_t v25;  // q21
    uint128_t *v26;  // x0
    uint128_t v27;  // 4186
    uint128_t v28;  // q0
    uint128_t v29;  // 4187
    __m128i v3;  // q16
    uint128_t v30;  // q5
    uint128_t v31;  // 4188
    uint128_t v32;  // q2
    uint128_t v33;  // 4189
    uint128_t v34;  // q7
    uint128_t v35;  // 4190
    uint128_t v36;  // 4191
    uint128_t v39;  // q1
    uint128_t v40;  // 4218
    uint128_t v41;  // q6
    uint128_t v42;  // 4223
    uint128_t v47;  // q0
    uint128_t v48;  // q5
    __m128i v5;  // q20
    uint128_t v51;  // 4238
    uint128_t v52;  // 4239
    uint128_t v53;  // q23
    uint128_t v54;  // q25
    unsigned long long v57;  // d18
    uint128_t v58;  // q16
    uint128_t v59;  // q24
    uint128_t *v6;  // x0
    uint128_t *v60;  // x0
    uint128_t v61;  // 4285
    uint128_t v62;  // q0
    uint128_t v63;  // 4286
    uint128_t v64;  // q5
    uint128_t v65;  // 4287
    uint128_t v66;  // q2
    uint128_t v67;  // 4288
    uint128_t v68;  // q7
    uint128_t v69;  // 4289
    uint128_t v70;  // 4290
    uint128_t v73;  // q1
    uint128_t v74;  // 4317
    uint128_t v75;  // q6
    uint128_t v76;  // 4322
    uint128_t v8;  // 4133
    uint128_t v81;  // q0
    uint128_t v82;  // q5
    uint128_t v85;  // 4096
    uint128_t v86;  // 4097
    uint128_t v87;  // q26
    uint128_t v88;  // q28
    uint128_t v9;  // q0
    uint128_t v92;  // q16
    uint128_t v93;  // q17
    unsigned long v94;  // d18
    uint128_t v95;  // q27
    uint128_t *v96;  // x0
    uint128_t v97;  // 4143
    uint128_t v98;  // q0
    uint128_t v99;  // 4144

    v0 = *a1;
    v1 = _mm_slli_epi64(_mm_set1_epi64x(0xe1e1e1e1e1e1e1e1), 57);
    v2 = __dirty_unsupported_Iop_SliceV128(v0, v0, 8);
    v3 = __dirty_unsupported_Iop_SliceV128(v1, _mm_srli_epi64(v1, 63), 8);
    v5 = _mm_xor_si128(_mm_and_si128(v3, _mm_srai_epi32(CatOddLanesV(_mm_unpacklo_epi64(v0, v0), _mm_unpacklo_epi64(v0, v0)), 31)), _mm_or_si128(_mm_slli_epi64(v2, 1), __dirty_unsupported_Iop_SliceV128(_mm_and_si128(_mm_srli_epi64(v2, 63), v3), _mm_and_si128(_mm_srli_epi64(v2, 63), v3), 8)));
    *a0 = v5;
    v6 = a0 + 1;
    v8 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _mm_cvtsi128_si64(v5), _mm_cvtsi128_si64(v5));
    v9 = v8;
    v10 = _mm_xor_si128(v5, __dirty_unsupported_Iop_SliceV128(v5, v5, 8));
    v11 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _mm_extract_epi64(v5, 1), _mm_extract_epi64(v5, 1));
    v12 = v11;
    v13 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _mm_cvtsi128_si64(v10), _mm_cvtsi128_si64(v10));
    v15 = v12 ^ v9 ^ __dirty_unsupported_Iop_SliceV128(v12, v9, 8) ^ v13;
    v16 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v9, _mm_cvtsi128_si64(v1));
    v19 = v16 ^ _INSERT(v15, 8, (unsigned long long)v9);
    v21 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v19, _mm_cvtsi128_si64(v1));
    v22 = _INSERT(v12, 0, *(double *)&*(unsigned long long *)((void*)&v15 + 8)) ^ __dirty_unsupported_Iop_SliceV128(v19, v19, 8) ^ v21;
    v24 = v22 ^ __dirty_unsupported_Iop_SliceV128(v22, v22, 8);
    v25 = __dirty_unsupported_Iop_SliceV128(v24, v10, 8);
    v6[1] = v22;
    *v6 = v25;
    v26 = v6 + 2;
    v27 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _mm_cvtsi128_si64(v5), (unsigned long long)v22);
    v28 = v27;
    v29 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v22, (unsigned long long)v22);
    v30 = v29;
    v31 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _mm_extract_epi64(v5, 1), (unsigned long long)(v22 >> 64));
    v32 = v31;
    v33 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v22 >> 64), (unsigned long long)(v22 >> 64));
    v34 = v33;
    v35 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, _mm_cvtsi128_si64(v10), (unsigned long long)v24);
    v36 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v24, (unsigned long long)v24);
    v39 = v32 ^ v28 ^ __dirty_unsupported_Iop_SliceV128(v32, v28, 8) ^ v35;
    v40 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v28, _mm_cvtsi128_si64(v1));
    v41 = v34 ^ v30 ^ __dirty_unsupported_Iop_SliceV128(v34, v30, 8) ^ v36;
    v42 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v30, _mm_cvtsi128_si64(v1));
    v47 = v40 ^ _INSERT(v39, 8, (unsigned long long)v28);
    v48 = v42 ^ _INSERT(v41, 8, (unsigned long long)v30);
    v51 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v47, _mm_cvtsi128_si64(v1));
    v52 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v48, _mm_cvtsi128_si64(v1));
    v53 = _INSERT(v32, 0, *(double *)&*(unsigned long long *)((void*)&v39 + 8)) ^ __dirty_unsupported_Iop_SliceV128(v47, v47, 8) ^ v51;
    v54 = _INSERT(v34, 0, *(double *)&*(unsigned long long *)((void*)&v41 + 8)) ^ __dirty_unsupported_Iop_SliceV128(v48, v48, 8) ^ v52;
    v57 = __dirty_unsupported_Iop_SliceV128(v22, v22, 8);
    v58 = v53 ^ __dirty_unsupported_Iop_SliceV128(v53, v53, 8);
    v59 = __dirty_unsupported_Iop_SliceV128(v54 ^ __dirty_unsupported_Iop_SliceV128(v54, v54, 8), v58, 8);
    v26[2] = v54;
    v26[1] = v59;
    *v26 = v53;
    v60 = v26 + 3;
    v61 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v22, (unsigned long long)v53);
    v62 = v61;
    v63 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v53, (unsigned long long)v53);
    v64 = v63;
    v65 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v22 >> 64), (unsigned long long)(v53 >> 64));
    v66 = v65;
    v67 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v53 >> 64), (unsigned long long)(v53 >> 64));
    v68 = v67;
    v69 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v58, (unsigned long long)v22 ^ v57);
    v70 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v58, (unsigned long long)v58);
    v73 = v66 ^ v62 ^ __dirty_unsupported_Iop_SliceV128(v66, v62, 8) ^ v69;
    v74 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v62, _mm_cvtsi128_si64(v1));
    v75 = v68 ^ v64 ^ __dirty_unsupported_Iop_SliceV128(v68, v64, 8) ^ v70;
    v76 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v64, _mm_cvtsi128_si64(v1));
    v81 = v74 ^ _INSERT(v73, 8, (unsigned long long)v62);
    v82 = v76 ^ _INSERT(v75, 8, (unsigned long long)v64);
    v85 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v81, _mm_cvtsi128_si64(v1));
    v86 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v82, _mm_cvtsi128_si64(v1));
    v87 = _INSERT(v66, 0, *(double *)&*(unsigned long long *)((void*)&v73 + 8)) ^ __dirty_unsupported_Iop_SliceV128(v81, v81, 8) ^ v85;
    v88 = _INSERT(v68, 0, *(double *)&*(unsigned long long *)((void*)&v75 + 8)) ^ __dirty_unsupported_Iop_SliceV128(v82, v82, 8) ^ v86;
    v92 = v87 ^ __dirty_unsupported_Iop_SliceV128(v87, v87, 8);
    v93 = v88 ^ __dirty_unsupported_Iop_SliceV128(v88, v88, 8);
    v94 = (unsigned long long)v22 ^ (unsigned long long)__dirty_unsupported_Iop_SliceV128(v22, v22, 8);
    v95 = __dirty_unsupported_Iop_SliceV128(v93, v92, 8);
    v60[2] = v88;
    v60[1] = v95;
    *v60 = v87;
    v96 = v60 + 3;
    v97 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v22, (unsigned long long)v87);
    v98 = v97;
    v99 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v22, (unsigned long long)v88);
    v100 = v99;
    v101 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v22 >> 64), (unsigned long long)(v87 >> 64));
    v102 = v101;
    v103 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v22 >> 64), (unsigned long long)(v88 >> 64));
    v104 = v103;
    v105 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v92, v94);
    v106 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v93, v94);
    v109 = v102 ^ v98 ^ __dirty_unsupported_Iop_SliceV128(v102, v98, 8) ^ v105;
    v110 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v98, _mm_cvtsi128_si64(v1));
    v111 = v104 ^ v100 ^ __dirty_unsupported_Iop_SliceV128(v104, v100, 8) ^ v106;
    v112 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v100, _mm_cvtsi128_si64(v1));
    v117 = v110 ^ _INSERT(v109, 8, (unsigned long long)v98);
    v118 = v112 ^ _INSERT(v111, 8, (unsigned long long)v100);
    v121 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v117, _mm_cvtsi128_si64(v1));
    v122 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v118, _mm_cvtsi128_si64(v1));
    v123 = _INSERT(v102, 0, *(double *)&*(unsigned long long *)((void*)&v109 + 8)) ^ __dirty_unsupported_Iop_SliceV128(v117, v117, 8) ^ v121;
    v124 = _INSERT(v104, 0, *(double *)&*(unsigned long long *)((void*)&v111 + 8)) ^ __dirty_unsupported_Iop_SliceV128(v118, v118, 8) ^ v122;
    v127 = __dirty_unsupported_Iop_SliceV128(v124 ^ __dirty_unsupported_Iop_SliceV128(v124, v124, 8), v123 ^ __dirty_unsupported_Iop_SliceV128(v123, v123, 8), 8);
    v96[2] = v124;
    v96[1] = v127;
    *v96 = v123;
    return v96;
}
