/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bc9a0..0x9bd030 (1680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern uint128_t g_d2acd0;

double sub_9bc9a0(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, unsigned int a8, unsigned int a9, unsigned int a10, unsigned int a11, unsigned int a12, unsigned int a13, unsigned int a14, unsigned int a15)
{
    uint128_t *v0;  // x9
    uint128_t v1;  // q8
    __m128i v10;  // q0
    __m128i v100;  // q17
    __m128i v101;  // q9
    __m128i v102;  // q7
    __m128i v103;  // q29
    __m128i v104;  // q18
    __m128i v105;  // q25
    __m128i v106;  // q26
    __m128i v107;  // q21
    __m128i v108;  // q19
    __m128i v109;  // q9
    uint128_t v11;  // q1
    __m128i v110;  // q9
    __m128i v111;  // q3
    __m128i v112;  // q17
    __m128i v113;  // q7
    __m128i v114;  // q1
    __m128i v115;  // q2
    __m128i v116;  // q5
    __m128i v117;  // q6
    __m128i v118;  // q0
    __m128i v119;  // q7
    __m128i v12;  // q1
    __m128i v120;  // q3
    __m128i v121;  // q4
    __m128i v122;  // q7
    unsigned long long v123;  // 4230
    __m128i v124;  // q8
    __m128i v125;  // q9
    __m128i v126;  // q28
    uint128_t v13;  // q2
    __m128i v131;  // q16
    __m128i v132;  // q17
    __m128i v135;  // q0
    __m128i v136;  // q6
    __m128i v137;  // q4
    __m128i v138;  // q2
    __m128i v139;  // q1
    __m128i v14;  // q2
    __m128i v140;  // q3
    __m128i v141;  // q5
    __m128i v142;  // q7
    __m128i v143;  // q8
    __m128i v144;  // q9
    __m128i v145;  // q10
    __m128i v146;  // q16
    __m128i v147;  // q17
    __m128i v148;  // q18
    __m128i v149;  // q0
    uint128_t v15;  // q4
    __m128i v150;  // q6
    __m128i v151;  // q4
    __m128i v152;  // q19
    __m128i v153;  // q20
    __m128i v154;  // q1
    __m128i v155;  // q5
    __m128i v156;  // q7
    __m128i v157;  // q2
    __m128i v158;  // q3
    __m128i v159;  // q0
    __m128i v16;  // q4
    __m128i v160;  // q1
    __m128i v161;  // q21
    __m128i v162;  // q5
    __m128i v163;  // q4
    __m128i v164;  // q20
    __m128i v165;  // q2
    __m128i v166;  // q10
    unsigned long long v167;  // 4398
    uint128_t *v168;  // x9
    uint128_t *v169;  // x9
    uint128_t v17;  // q3
    uint128_t *v170;  // x9
    uint128_t *v171;  // x9
    __m128i v172;  // q9
    __m128i v173;  // q17
    __m128i v174;  // q0
    __m128i v175;  // q2
    __m128i v176;  // q6
    __m128i v177;  // q17
    __m128i v178;  // q0
    __m128i v18;  // q3
    uint128_t v19;  // q5
    uint128_t *v2;  // x9
    __m128i v20;  // q5
    uint128_t v21;  // q6
    __m128i v22;  // q6
    uint128_t v23;  // q7
    __m128i v24;  // q7
    __m128i v25;  // q8
    __m128i v26;  // q10
    __m128i v27;  // q18
    __m128i v28;  // q1
    __m128i v29;  // q9
    __m128i v3;  // q9
    __m128i v30;  // q5
    __m128i v31;  // q3
    __m128i v32;  // q0
    __m128i v33;  // q7
    __m128i v34;  // q4
    __m128i v35;  // q2
    __m128i v36;  // q6
    __m128i v37;  // q9
    __m128i v38;  // q8
    __m128i v39;  // q10
    uint128_t *iter;  // x11
    __m128i v40;  // q16
    __m128i v41;  // q3
    __m128i v42;  // q2
    __m128i v43;  // q7
    __m128i v44;  // q6
    __m128i v45;  // q1
    __m128i v46;  // q0
    __m128i v47;  // q5
    __m128i v48;  // q4
    __m128i v49;  // q8
    __m128i v5;  // q16
    __m128i v50;  // q9
    __m128i v51;  // q10
    __m128i v52;  // q16
    __m128i v53;  // q7
    __m128i v54;  // q6
    __m128i v55;  // q5
    __m128i v56;  // q4
    __m128i v57;  // q3
    __m128i v58;  // q2
    __m128i v59;  // q1
    __m128i v6;  // q17
    __m128i v60;  // q0
    unsigned long long v61;  // x10
    unsigned long v62;  // cc_dep1
    __m128i v63;  // q4
    __m128i v64;  // q1
    __m128i v65;  // q6
    __m128i v66;  // q2
    __m128i v67;  // q0
    __m128i v68;  // q7
    __m128i v69;  // q3
    unsigned long long v7;  // x10
    __m128i v70;  // q5
    __m128i v71;  // q16
    __m128i v72;  // q19
    __m128i v73;  // q1
    __m128i v74;  // q20
    __m128i v75;  // q21
    __m128i v76;  // q22
    __m128i v77;  // q8
    __m128i v78;  // q17
    __m128i v79;  // q23
    unsigned long long v8;  // x10
    __m128i v80;  // q25
    __m128i v81;  // q20
    __m128i v82;  // q21
    __m128i v83;  // q23
    __m128i v84;  // q24
    __m128i v85;  // q22
    __m128i v86;  // q16
    __m128i v87;  // q9
    __m128i v88;  // q8
    __m128i v89;  // q21
    uint128_t v9;  // q0
    __m128i v90;  // q17
    __m128i v91;  // q29
    __m128i v92;  // q29
    __m128i v93;  // q30
    __m128i v94;  // q31
    __m128i v95;  // q8
    __m128i v96;  // q1
    __m128i v97;  // q6
    __m128i v98;  // q16
    __m128i v99;  // q4

    v1 = *v0;
    v2 = v0 + 1;
    v3 = _mm_set1_epi32(0x55555555);
    iter = &g_d2acd0;
    v5 = _mm_set1_epi32(0x33333333);
    v6 = _mm_set1_epi32(0xf0f0f0f);
    v8 = v7 - 1;
    v10 = _mm_and_si128(PermV(_mm_xor_si128(v1, v9), _mm_and_si128(_mm_set_epi64x(1134747757643017, 724518814964453123), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(0, 4, 8, 12, 13, 1, 5, 9, 10, 14, 2, 6, 7, 11, 15, 3)));
    v12 = _mm_and_si128(PermV(_mm_xor_si128(v1, v11), _mm_and_si128(_mm_set_epi64x(1134747757643017, 724518814964453123), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(0, 4, 8, 12, 13, 1, 5, 9, 10, 14, 2, 6, 7, 11, 15, 3)));
    v14 = _mm_and_si128(PermV(_mm_xor_si128(v1, v13), _mm_and_si128(_mm_set_epi64x(1134747757643017, 724518814964453123), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(0, 4, 8, 12, 13, 1, 5, 9, 10, 14, 2, 6, 7, 11, 15, 3)));
    v16 = _mm_and_si128(PermV(_mm_xor_si128(v1, v15), _mm_and_si128(_mm_set_epi64x(1134747757643017, 724518814964453123), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(0, 4, 8, 12, 13, 1, 5, 9, 10, 14, 2, 6, 7, 11, 15, 3)));
    v18 = _mm_and_si128(PermV(_mm_xor_si128(v1, v17), _mm_and_si128(_mm_set_epi64x(1134747757643017, 724518814964453123), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(0, 4, 8, 12, 13, 1, 5, 9, 10, 14, 2, 6, 7, 11, 15, 3)));
    v20 = _mm_and_si128(PermV(_mm_xor_si128(v1, v19), _mm_and_si128(_mm_set_epi64x(1134747757643017, 724518814964453123), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(0, 4, 8, 12, 13, 1, 5, 9, 10, 14, 2, 6, 7, 11, 15, 3)));
    v22 = _mm_and_si128(PermV(_mm_xor_si128(v1, v21), _mm_and_si128(_mm_set_epi64x(1134747757643017, 724518814964453123), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(0, 4, 8, 12, 13, 1, 5, 9, 10, 14, 2, 6, 7, 11, 15, 3)));
    v24 = _mm_and_si128(PermV(_mm_xor_si128(v1, v23), _mm_and_si128(_mm_set_epi64x(1134747757643017, 724518814964453123), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(0, 4, 8, 12, 13, 1, 5, 9, 10, 14, 2, 6, 7, 11, 15, 3)));
    v25 = _mm_and_si128(_mm_xor_si128(v12, _mm_srli_epi64(v10, 1)), v3);
    v26 = _mm_and_si128(_mm_xor_si128(v20, _mm_srli_epi64(v16, 1)), v3);
    v27 = _mm_and_si128(_mm_xor_si128(v18, _mm_srli_epi64(v14, 1)), v3);
    v28 = _mm_xor_si128(v25, v12);
    v29 = _mm_and_si128(_mm_xor_si128(v24, _mm_srli_epi64(v22, 1)), v3);
    v30 = _mm_xor_si128(v26, v20);
    v31 = _mm_xor_si128(v27, v18);
    v32 = _mm_xor_si128(_mm_slli_epi64(v25, 1), v10);
    v33 = _mm_xor_si128(v29, v24);
    v34 = _mm_xor_si128(_mm_slli_epi64(v26, 1), v16);
    v35 = _mm_xor_si128(_mm_slli_epi64(v27, 1), v14);
    v36 = _mm_xor_si128(_mm_slli_epi64(v29, 1), v22);
    v37 = _mm_and_si128(_mm_xor_si128(v31, _mm_srli_epi64(v28, 2)), v5);
    v38 = _mm_and_si128(_mm_xor_si128(v35, _mm_srli_epi64(v32, 2)), v5);
    v39 = _mm_and_si128(_mm_xor_si128(v33, _mm_srli_epi64(v30, 2)), v5);
    v40 = _mm_and_si128(_mm_xor_si128(v36, _mm_srli_epi64(v34, 2)), v5);
    v41 = _mm_xor_si128(v37, v31);
    v42 = _mm_xor_si128(v38, v35);
    v43 = _mm_xor_si128(v39, v33);
    v44 = _mm_xor_si128(v40, v36);
    v45 = _mm_xor_si128(_mm_slli_epi64(v37, 2), v28);
    v46 = _mm_xor_si128(_mm_slli_epi64(v38, 2), v32);
    v47 = _mm_xor_si128(_mm_slli_epi64(v39, 2), v30);
    v48 = _mm_xor_si128(_mm_slli_epi64(v40, 2), v34);
    v49 = _mm_and_si128(_mm_xor_si128(v43, _mm_srli_epi64(v41, 4)), v6);
    v50 = _mm_and_si128(_mm_xor_si128(v44, _mm_srli_epi64(v42, 4)), v6);
    v51 = _mm_and_si128(_mm_xor_si128(v47, _mm_srli_epi64(v45, 4)), v6);
    v52 = _mm_and_si128(_mm_xor_si128(v48, _mm_srli_epi64(v46, 4)), v6);
    v53 = _mm_xor_si128(v49, v43);
    v54 = _mm_xor_si128(v50, v44);
    v55 = _mm_xor_si128(v51, v47);
    v56 = _mm_xor_si128(v52, v48);
    v57 = _mm_xor_si128(_mm_slli_epi64(v49, 4), v41);
    v58 = _mm_xor_si128(_mm_slli_epi64(v50, 4), v42);
    v59 = _mm_xor_si128(_mm_slli_epi64(v51, 4), v45);
    v60 = _mm_xor_si128(_mm_slli_epi64(v52, 4), v46);
    while (1)
    {
        v61 = v8 - 1;
        v62 = v8;
        v63 = _mm_xor_si128(v53, v56);
        v64 = _mm_xor_si128(v54, _mm_xor_si128(v56, v59));
        v65 = _mm_xor_si128(v63, v54);
        v66 = _mm_xor_si128(v55, _mm_xor_si128(v53, v58));
        v67 = _mm_xor_si128(v64, v60);
        v68 = _mm_xor_si128(v65, v53);
        v69 = _mm_xor_si128(v67, _mm_xor_si128(v56, v57));
        v70 = _mm_xor_si128(v67, v55);
        v71 = _mm_xor_si128(v63, v68);
        v72 = _mm_xor_si128(v63, v68);
        v73 = _mm_xor_si128(v69, v64);
        v74 = _mm_xor_si128(v67, v69);
        v75 = _mm_xor_si128(v66, v70);
        v76 = _mm_xor_si128(v68, v69);
        v77 = _mm_and_si128(_mm_xor_si128(v67, v63), _mm_xor_si128(v66, v65));
        v78 = _mm_or_si128(v69, v70);
        v79 = _mm_xor_si128(v65, v73);
        v80 = _mm_xor_si128(v70, v73);
        v81 = _mm_and_si128(v74, v75);
        v82 = _mm_and_si128(_mm_xor_si128(v71, v74), _mm_xor_si128(v79, v75));
        v83 = _mm_xor_si128(v66, v70);
        v84 = _mm_xor_si128(v65, v73);
        v85 = _mm_xor_si128(v67, v69);
        v86 = _mm_xor_si128(v81, _mm_xor_si128(_mm_and_si128(v76, v80), _mm_and_si128(v71, v79)));
        v87 = _mm_xor_si128(_mm_and_si128(v63, v65), _mm_xor_si128(v82, _mm_xor_si128(v77, _mm_or_si128(v74, v75))));
        v88 = _mm_xor_si128(_mm_and_si128(v67, v66), _mm_xor_si128(v81, _mm_xor_si128(v77, _mm_or_si128(v71, v79))));
        v89 = _mm_xor_si128(v78, v86);
        v90 = _mm_xor_si128(_mm_and_si128(v68, v73), _mm_xor_si128(v81, _mm_xor_si128(v82, _mm_or_si128(v76, v80))));
        v91 = _mm_and_si128(v87, v90);
        v92 = _mm_xor_si128(v91, v89);
        v93 = _mm_xor_si128(v89, _mm_and_si128(_mm_xor_si128(v89, v90), _mm_xor_si128(v91, v88)));
        v94 = _mm_xor_si128(v88, _mm_and_si128(_mm_xor_si128(v88, v87), _mm_xor_si128(v91, v89)));
        v95 = _mm_xor_si128(v93, v94);
        v96 = _mm_and_si128(v73, v94);
        v97 = _mm_and_si128(v65, v93);
        v98 = _mm_xor_si128(_mm_xor_si128(v93, _mm_and_si128(_mm_xor_si128(v93, v92), v89)), v90);
        v99 = _mm_and_si128(v63, v93);
        v100 = _mm_xor_si128(v93, v95);
        v101 = _mm_xor_si128(_mm_xor_si128(v88, v87), _mm_and_si128(_mm_xor_si128(v92, _mm_and_si128(_mm_xor_si128(v92, v93), _mm_xor_si128(v78, v86))), v94));
        v102 = _mm_and_si128(v68, v100);
        v103 = _mm_xor_si128(v98, v101);
        v104 = _mm_xor_si128(v98, v103);
        v105 = _mm_and_si128(_mm_xor_si128(v84, v83), v103);
        v106 = _mm_and_si128(_mm_xor_si128(v72, v85), v103);
        v107 = _mm_xor_si128(v105, _mm_and_si128(v84, v95));
        v108 = _mm_xor_si128(v106, _mm_and_si128(v72, v95));
        v109 = _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v103, v95), v83), v105);
        v110 = _mm_xor_si128(v109, _mm_xor_si128(v96, _mm_and_si128(_mm_xor_si128(v73, v70), v101)));
        v111 = _mm_xor_si128(v108, _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v104, v100), v69), v102));
        v112 = _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v103, v95), v85), v106);
        v113 = _mm_xor_si128(v110, _mm_xor_si128(v107, _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v98, v93), v66), v97)));
        v114 = _mm_xor_si128(v111, _mm_xor_si128(v107, _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v101, v94), v70), v96)));
        v115 = _mm_xor_si128(v111, _mm_xor_si128(v109, _mm_xor_si128(v97, _mm_and_si128(_mm_xor_si128(v65, v66), v98))));
        v116 = _mm_xor_si128(v111, v110);
        v117 = _mm_xor_si128(v114, v113);
        v118 = _mm_xor_si128(v112, _mm_xor_si128(v99, _mm_and_si128(_mm_xor_si128(v63, v67), v98)));
        v119 = _mm_xor_si128(v116, _mm_xor_si128(v115, _mm_xor_si128(v114, _mm_xor_si128(v108, _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v98, v93), v67), v99)))));
        v120 = _mm_xor_si128(v119, _mm_xor_si128(v113, _mm_xor_si128(v112, _mm_xor_si128(v102, _mm_and_si128(_mm_xor_si128(v68, v69), v104)))));
        v121 = _mm_xor_si128(v118, v119);
        v122 = _mm_xor_si128(v120, _mm_xor_si128(v118, v111));
        v123 = arm64g_calculate_condition(52, v62, 1, 0);
        if (v123 & 1)
            break;
        v124 = __dirty_unsupported_Iop_SliceV128(v118, v118, 8);
        v125 = __dirty_unsupported_Iop_SliceV128(v114, v114, 8);
        v126 = *iter;
        v131 = _mm_xor_si128(v120, __dirty_unsupported_Iop_SliceV128(v120, v120, 8));
        v132 = _mm_xor_si128(v116, __dirty_unsupported_Iop_SliceV128(v116, v116, 8));
        v135 = _mm_xor_si128(v131, v118);
        v136 = _mm_xor_si128(v132, _mm_xor_si128(_mm_xor_si128(v118, v124), v117));
        v137 = _mm_xor_si128(v131, _mm_xor_si128(_mm_xor_si128(v114, v125), v121));
        v138 = _mm_xor_si128(_mm_xor_si128(v115, __dirty_unsupported_Iop_SliceV128(v115, v115, 8)), v120);
        v139 = _mm_xor_si128(v132, _mm_xor_si128(v131, v114));
        v140 = _mm_xor_si128(_mm_xor_si128(v122, __dirty_unsupported_Iop_SliceV128(v122, v122, 8)), v116);
        v141 = _mm_xor_si128(v132, _mm_xor_si128(v131, _mm_xor_si128(_mm_xor_si128(v117, __dirty_unsupported_Iop_SliceV128(v117, v117, 8)), v115)));
        v142 = _mm_xor_si128(v132, _mm_xor_si128(_mm_xor_si128(v121, __dirty_unsupported_Iop_SliceV128(v121, v121, 8)), v122));
        v143 = __dirty_unsupported_Iop_SliceV128(v135, v135, 12);
        v144 = __dirty_unsupported_Iop_SliceV128(v136, v136, 12);
        v145 = __dirty_unsupported_Iop_SliceV128(v137, v137, 12);
        v146 = __dirty_unsupported_Iop_SliceV128(v139, v139, 12);
        v147 = __dirty_unsupported_Iop_SliceV128(v141, v141, 12);
        v148 = __dirty_unsupported_Iop_SliceV128(v142, v142, 12);
        v149 = _mm_xor_si128(v143, v135);
        v150 = _mm_xor_si128(v144, v136);
        v151 = _mm_xor_si128(v145, v137);
        v152 = __dirty_unsupported_Iop_SliceV128(v138, v138, 12);
        v153 = __dirty_unsupported_Iop_SliceV128(v140, v140, 12);
        v154 = _mm_xor_si128(v146, v139);
        v155 = _mm_xor_si128(v147, v141);
        v156 = _mm_xor_si128(v148, v142);
        v157 = _mm_xor_si128(v152, v138);
        v158 = _mm_xor_si128(v153, v140);
        v159 = __dirty_unsupported_Iop_SliceV128(v149, v149, 8);
        v160 = __dirty_unsupported_Iop_SliceV128(v154, v154, 8);
        v161 = __dirty_unsupported_Iop_SliceV128(v155, v155, 8);
        v162 = __dirty_unsupported_Iop_SliceV128(v156, v156, 8);
        v163 = __dirty_unsupported_Iop_SliceV128(v151, v151, 8);
        v164 = __dirty_unsupported_Iop_SliceV128(v158, v158, 8);
        v165 = __dirty_unsupported_Iop_SliceV128(v157, v157, 8);
        v166 = __dirty_unsupported_Iop_SliceV128(v150, v150, 8);
        v167 = arm64g_calculate_condition(20, v62, 1, 0);
        if (!(v167 & 1))
        {
            v126 = iter[1];
            iter += 1;
        }
        v168 = v2 + 4;
        v169 = v168 + 2;
        v170 = v169 + 1;
        v171 = v170 + 1;
        v60 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v158, v143), v159), *v2), _mm_and_si128(v126, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v126));
        v59 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v158, _mm_xor_si128(v149, v146)), v160), v2[1]), _mm_and_si128(v126, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v126));
        v58 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v154, v144), v166), v2[2]), _mm_and_si128(v126, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v126));
        v57 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(v163, _mm_xor_si128(v158, _mm_xor_si128(v150, v145))), v2[3]), _mm_and_si128(v126, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v126));
        v56 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v158, _mm_xor_si128(v151, v147)), v161), *v168), _mm_and_si128(v126, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v126));
        v55 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v155, v148), v162), v168[1]), _mm_and_si128(v126, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v126));
        v54 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v156, v152), v165), *v169), _mm_and_si128(v126, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v126));
        v53 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v157, v153), v164), *v170), _mm_and_si128(v126, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v126));
        v2 = v171;
        v8 = v61;
    }
    v172 = _mm_set1_epi32(0x55555555);
    v173 = _mm_set1_epi32(0x33333333);
    v174 = _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v114, _mm_srli_epi64(v118, 1)), v172), 1), v118);
    v175 = _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v122, _mm_srli_epi64(v115, 1)), v172), 1), v115);
    v176 = _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v121, _mm_srli_epi64(v117, 1)), v172), 1), v117);
    v177 = _mm_and_si128(_mm_xor_si128(_mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v116, _mm_srli_epi64(v120, 1)), v172), 1), v120), _mm_srli_epi64(_mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v122, _mm_srli_epi64(v115, 1)), v172), 1), v115), 2)), v173);
    v178 = _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(_mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v121, _mm_srli_epi64(v117, 1)), v172), 1), v117), _mm_srli_epi64(v174, 2)), v173), 2), v174);
    return _mm_cvtsi128_si64(_mm_xor_si128(*v2, _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(_mm_xor_si128(_mm_slli_epi64(v177, 2), v175), _mm_srli_epi64(v178, 4)), _mm_set1_epi32(0xf0f0f0f)), 4), _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v176, _mm_srli_epi64(v174, 2)), v173), 2), v174))));
}
