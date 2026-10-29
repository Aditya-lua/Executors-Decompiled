/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bd040..0x9bd640 (1536 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_9bd040(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, unsigned int a8, unsigned int a9, unsigned int a10, unsigned int a11, unsigned int a12, unsigned int a13, unsigned int a14, unsigned int a15)
{
    unsigned long long v0;  // x10
    unsigned long long v1;  // x10
    uint128_t v10;  // q4
    __m128i v98;  // q16
    __m128i v99;  // q2
    __m128i v100;  // q19
    __m128i v101;  // q8
    __m128i v102;  // q6
    __m128i v103;  // q25
    __m128i v104;  // q23
    __m128i v105;  // q24
    __m128i v106;  // q25
    __m128i v107;  // q17
    __m128i v11;  // q4
    __m128i v108;  // q10
    __m128i v109;  // q20
    __m128i v110;  // q9
    __m128i v111;  // q1
    __m128i v112;  // q8
    __m128i v113;  // q4
    __m128i v114;  // q10
    __m128i v115;  // q0
    __m128i v116;  // q7
    __m128i v117;  // q5
    uint128_t v12;  // q3
    __m128i v118;  // q2
    __m128i v119;  // q4
    __m128i v120;  // q3
    __m128i v121;  // q0
    __m128i v122;  // q1
    __m128i v123;  // q4
    __m128i v124;  // q6
    unsigned long long v125;  // 4226
    __m128i v126;  // q8
    __m128i v127;  // q9
    __m128i v13;  // q3
    __m128i v128;  // q28
    __m128i v129;  // q10
    __m128i v130;  // q16
    __m128i v131;  // q17
    __m128i v132;  // q18
    __m128i v133;  // q0
    __m128i v134;  // q4
    __m128i v135;  // q6
    __m128i v136;  // q19
    __m128i v137;  // q20
    uint128_t v14;  // q5
    __m128i v138;  // q1
    __m128i v139;  // q3
    __m128i v140;  // q7
    __m128i v141;  // q2
    __m128i v142;  // q5
    __m128i v143;  // q0
    __m128i v144;  // q1
    __m128i v145;  // q3
    __m128i v146;  // q7
    __m128i v147;  // q6
    __m128i v15;  // q5
    __m128i v148;  // q21
    __m128i v149;  // q2
    __m128i v150;  // q22
    unsigned long long v151;  // 4278
    uint128_t *v152;  // x9
    uint128_t *v153;  // x9
    uint128_t *v154;  // x9
    uint128_t *v155;  // x9
    __m128i v156;  // q9
    __m128i v157;  // q17
    uint128_t v16;  // q6
    __m128i v158;  // q0
    __m128i v159;  // q3
    __m128i v160;  // q4
    __m128i v161;  // q17
    __m128i v162;  // q0
    __m128i v17;  // q6
    __m128i v18;  // q10
    uint128_t v19;  // q7
    uint128_t v2;  // q8
    __m128i v20;  // q7
    __m128i v21;  // q16
    __m128i v22;  // q18
    __m128i v23;  // q8
    __m128i v24;  // q9
    __m128i v25;  // q17
    __m128i v26;  // q1
    __m128i v27;  // q10
    __m128i v28;  // q5
    __m128i v29;  // q3
    uint128_t v3;  // q0
    __m128i v30;  // q0
    __m128i v31;  // q7
    __m128i v32;  // q4
    __m128i v33;  // q2
    __m128i v34;  // q6
    __m128i v35;  // q9
    __m128i v36;  // q8
    __m128i v37;  // q10
    __m128i v38;  // q16
    __m128i v39;  // q3
    __m128i v4;  // q9
    __m128i v40;  // q2
    __m128i v41;  // q7
    __m128i v42;  // q6
    __m128i v43;  // q1
    __m128i v44;  // q0
    __m128i v45;  // q5
    __m128i v46;  // q4
    __m128i v47;  // q8
    __m128i v48;  // q9
    __m128i v49;  // q10
    __m128i v5;  // q0
    __m128i v50;  // q16
    __m128i v51;  // q7
    __m128i v52;  // q6
    __m128i v53;  // q5
    __m128i v54;  // q4
    __m128i v55;  // q3
    __m128i v56;  // q2
    __m128i v57;  // q1
    __m128i v58;  // q0
    uint128_t *v163;  // x9
    uint128_t v6;  // q1
    uint128_t *v59;  // x9
    uint128_t *iter;  // x11
    __m128i v61;  // q3
    unsigned long long v62;  // x10
    unsigned long v63;  // cc_dep1
    __m128i v64;  // q2
    __m128i v65;  // q5
    __m128i v66;  // q7
    __m128i v67;  // q3
    __m128i v7;  // q1
    __m128i v68;  // q4
    __m128i v69;  // q6
    __m128i v70;  // q2
    __m128i v71;  // q1
    __m128i v72;  // q8
    __m128i v73;  // q9
    __m128i v74;  // q10
    __m128i v75;  // q16
    __m128i v76;  // q17
    __m128i v77;  // q18
    uint128_t v8;  // q2
    __m128i v78;  // q19
    __m128i v79;  // q8
    __m128i v80;  // q17
    __m128i v81;  // q18
    __m128i v82;  // q8
    __m128i v83;  // q9
    __m128i v84;  // q10
    __m128i v85;  // q16
    __m128i v86;  // q17
    __m128i v87;  // q19
    __m128i v9;  // q2
    __m128i v88;  // q20
    __m128i v89;  // q18
    __m128i v90;  // q22
    __m128i v91;  // q23
    __m128i v92;  // q23
    __m128i v93;  // q29
    __m128i v94;  // q30
    __m128i v95;  // q9
    __m128i v96;  // q5
    __m128i v97;  // q1

    v1 = v0 - 1;
    v5 = _mm_and_si128(PermV(_mm_xor_si128(v2, v3), _mm_and_si128(v4, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v4));
    v7 = _mm_and_si128(PermV(_mm_xor_si128(v2, v6), _mm_and_si128(v4, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v4));
    v9 = _mm_and_si128(PermV(_mm_xor_si128(v2, v8), _mm_and_si128(v4, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v4));
    v11 = _mm_and_si128(PermV(_mm_xor_si128(v2, v10), _mm_and_si128(v4, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v4));
    v13 = _mm_and_si128(PermV(_mm_xor_si128(v2, v12), _mm_and_si128(v4, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v4));
    v15 = _mm_and_si128(PermV(_mm_xor_si128(v2, v14), _mm_and_si128(v4, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v4));
    v17 = _mm_and_si128(PermV(_mm_xor_si128(v2, v16), _mm_and_si128(v4, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v4));
    v18 = _mm_set1_epi32(0x55555555);
    v20 = _mm_and_si128(PermV(_mm_xor_si128(v2, v19), _mm_and_si128(v4, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v4));
    v21 = _mm_set1_epi32(0x33333333);
    v22 = _mm_set1_epi32(0xf0f0f0f);
    v23 = _mm_and_si128(_mm_xor_si128(v7, _mm_srli_epi64(v5, 1)), v18);
    v24 = _mm_and_si128(_mm_xor_si128(v15, _mm_srli_epi64(v11, 1)), v18);
    v25 = _mm_and_si128(_mm_xor_si128(v13, _mm_srli_epi64(v9, 1)), v18);
    v26 = _mm_xor_si128(v23, v7);
    v27 = _mm_and_si128(_mm_xor_si128(v20, _mm_srli_epi64(v17, 1)), v18);
    v28 = _mm_xor_si128(v24, v15);
    v29 = _mm_xor_si128(v25, v13);
    v30 = _mm_xor_si128(_mm_slli_epi64(v23, 1), v5);
    v31 = _mm_xor_si128(v27, v20);
    v32 = _mm_xor_si128(_mm_slli_epi64(v24, 1), v11);
    v33 = _mm_xor_si128(_mm_slli_epi64(v25, 1), v9);
    v34 = _mm_xor_si128(_mm_slli_epi64(v27, 1), v17);
    v35 = _mm_and_si128(_mm_xor_si128(v29, _mm_srli_epi64(v26, 2)), v21);
    v36 = _mm_and_si128(_mm_xor_si128(v33, _mm_srli_epi64(v30, 2)), v21);
    v37 = _mm_and_si128(_mm_xor_si128(v31, _mm_srli_epi64(v28, 2)), v21);
    v38 = _mm_and_si128(_mm_xor_si128(v34, _mm_srli_epi64(v32, 2)), v21);
    v39 = _mm_xor_si128(v35, v29);
    v40 = _mm_xor_si128(v36, v33);
    v41 = _mm_xor_si128(v37, v31);
    v42 = _mm_xor_si128(v38, v34);
    v43 = _mm_xor_si128(_mm_slli_epi64(v35, 2), v26);
    v44 = _mm_xor_si128(_mm_slli_epi64(v36, 2), v30);
    v45 = _mm_xor_si128(_mm_slli_epi64(v37, 2), v28);
    v46 = _mm_xor_si128(_mm_slli_epi64(v38, 2), v32);
    v47 = _mm_and_si128(_mm_xor_si128(v41, _mm_srli_epi64(v39, 4)), v22);
    v48 = _mm_and_si128(_mm_xor_si128(v42, _mm_srli_epi64(v40, 4)), v22);
    v49 = _mm_and_si128(_mm_xor_si128(v45, _mm_srli_epi64(v43, 4)), v22);
    v50 = _mm_and_si128(_mm_xor_si128(v46, _mm_srli_epi64(v44, 4)), v22);
    v51 = _mm_xor_si128(v47, v41);
    v52 = _mm_xor_si128(v48, v42);
    v53 = _mm_xor_si128(v49, v45);
    v54 = _mm_xor_si128(v50, v46);
    v55 = _mm_xor_si128(_mm_slli_epi64(v47, 4), v39);
    v56 = _mm_xor_si128(_mm_slli_epi64(v48, 4), v40);
    v57 = _mm_xor_si128(_mm_slli_epi64(v49, 4), v43);
    v58 = _mm_xor_si128(_mm_slli_epi64(v50, 4), v44);
    while (1)
    {
        v61 = _mm_xor_si128(v58, v55);
        v62 = v1 - 1;
        v63 = v1;
        v64 = _mm_xor_si128(v57, v56);
        v65 = _mm_xor_si128(v58, _mm_xor_si128(v52, v53));
        v66 = _mm_xor_si128(v65, v51);
        v67 = _mm_xor_si128(v61, _mm_xor_si128(v64, v52));
        v68 = _mm_xor_si128(v65, v54);
        v69 = _mm_xor_si128(v65, v57);
        v70 = _mm_xor_si128(v66, v64);
        v71 = _mm_xor_si128(v57, _mm_xor_si128(v54, _mm_xor_si128(v51, v61)));
        v72 = _mm_xor_si128(v68, v66);
        v73 = _mm_xor_si128(v58, v67);
        v74 = _mm_xor_si128(v69, v66);
        v75 = _mm_xor_si128(v67, v65);
        v76 = _mm_xor_si128(v70, v69);
        v77 = _mm_xor_si128(v71, v65);
        v78 = _mm_and_si128(_mm_xor_si128(v68, v70), _mm_xor_si128(v58, v71));
        v79 = _mm_and_si128(v72, v73);
        v80 = _mm_and_si128(_mm_xor_si128(v76, v72), _mm_xor_si128(v77, v73));
        v81 = _mm_or_si128(v66, v67);
        v82 = _mm_xor_si128(v79, _mm_xor_si128(_mm_and_si128(v74, v75), _mm_and_si128(v76, v77)));
        v83 = _mm_xor_si128(_mm_and_si128(v70, v71), _mm_xor_si128(v80, _mm_xor_si128(v78, _mm_or_si128(v72, v73))));
        v84 = _mm_xor_si128(v58, v67);
        v85 = _mm_xor_si128(_mm_and_si128(v68, v58), _mm_xor_si128(v79, _mm_xor_si128(v78, _mm_or_si128(v76, v77))));
        v86 = _mm_xor_si128(v71, v65);
        v87 = _mm_xor_si128(_mm_and_si128(v69, v65), _mm_xor_si128(v79, _mm_xor_si128(v80, _mm_or_si128(v74, v75))));
        v88 = _mm_xor_si128(v81, v82);
        v89 = _mm_xor_si128(v68, v66);
        v90 = _mm_xor_si128(v70, v69);
        v91 = _mm_and_si128(v83, v87);
        v92 = _mm_xor_si128(v91, v88);
        v93 = _mm_xor_si128(v88, _mm_and_si128(_mm_xor_si128(v88, v87), _mm_xor_si128(v91, v85)));
        v94 = _mm_xor_si128(v85, _mm_and_si128(_mm_xor_si128(v85, v83), _mm_xor_si128(v91, v88)));
        v95 = _mm_xor_si128(v93, v94);
        v96 = _mm_and_si128(v65, v94);
        v97 = _mm_and_si128(v71, v93);
        v98 = _mm_xor_si128(_mm_xor_si128(v93, _mm_and_si128(_mm_xor_si128(v93, v92), v88)), v87);
        v99 = _mm_and_si128(v70, v93);
        v100 = _mm_xor_si128(v93, v95);
        v101 = _mm_xor_si128(_mm_xor_si128(v85, v83), _mm_and_si128(_mm_xor_si128(v92, _mm_and_si128(_mm_xor_si128(v92, v93), _mm_xor_si128(v81, v82))), v94));
        v102 = _mm_and_si128(v69, v100);
        v103 = _mm_xor_si128(v98, v101);
        v104 = _mm_xor_si128(v98, v103);
        v105 = _mm_and_si128(_mm_xor_si128(v86, v84), v103);
        v106 = _mm_and_si128(_mm_xor_si128(v90, v89), v103);
        v107 = _mm_xor_si128(v105, _mm_and_si128(v86, v95));
        v108 = _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v103, v95), v84), v105);
        v109 = _mm_xor_si128(v106, _mm_and_si128(v90, v95));
        v110 = _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v103, v95), v89), v106);
        v111 = _mm_xor_si128(v108, _mm_xor_si128(v97, _mm_and_si128(_mm_xor_si128(v71, v58), v98)));
        v112 = _mm_xor_si128(v107, _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v101, v94), v67), v96));
        v113 = _mm_xor_si128(v109, _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v98, v93), v68), v99));
        v114 = _mm_xor_si128(v108, _mm_xor_si128(v96, _mm_and_si128(_mm_xor_si128(v65, v67), v101)));
        v115 = _mm_xor_si128(v107, _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v98, v93), v58), v97));
        v116 = _mm_xor_si128(v111, _mm_xor_si128(v110, _mm_xor_si128(v102, _mm_and_si128(_mm_xor_si128(v69, v66), v104))));
        v117 = _mm_xor_si128(v113, v112);
        v118 = _mm_xor_si128(v115, v113);
        v119 = _mm_xor_si128(v114, _mm_xor_si128(v109, _mm_xor_si128(_mm_and_si128(_mm_xor_si128(v104, v100), v66), v102)));
        v120 = _mm_xor_si128(v117, v115);
        v121 = _mm_xor_si128(v119, v111);
        v122 = _mm_xor_si128(v112, v119);
        v123 = _mm_xor_si128(v117, _mm_xor_si128(v116, _mm_xor_si128(v110, _mm_xor_si128(v99, _mm_and_si128(_mm_xor_si128(v70, v68), v98)))));
        v124 = _mm_xor_si128(v120, _mm_xor_si128(v111, v114));
        v125 = arm64g_calculate_condition(52, v63, 1, 0);
        if (v125 & 1)
            break;
        v126 = __dirty_unsupported_Iop_SliceV128(v121, v121, 12);
        v127 = __dirty_unsupported_Iop_SliceV128(v123, v123, 12);
        v128 = *iter;
        v129 = __dirty_unsupported_Iop_SliceV128(v124, v124, 12);
        v130 = __dirty_unsupported_Iop_SliceV128(v122, v122, 12);
        v131 = __dirty_unsupported_Iop_SliceV128(v120, v120, 12);
        v132 = __dirty_unsupported_Iop_SliceV128(v116, v116, 12);
        v133 = _mm_xor_si128(v126, v121);
        v134 = _mm_xor_si128(v127, v123);
        v135 = _mm_xor_si128(v129, v124);
        v136 = __dirty_unsupported_Iop_SliceV128(v118, v118, 12);
        v137 = __dirty_unsupported_Iop_SliceV128(v117, v117, 12);
        v138 = _mm_xor_si128(v130, v122);
        v139 = _mm_xor_si128(v131, v120);
        v140 = _mm_xor_si128(v132, v116);
        v141 = _mm_xor_si128(v136, v118);
        v142 = _mm_xor_si128(v137, v117);
        v143 = __dirty_unsupported_Iop_SliceV128(v133, v133, 8);
        v144 = __dirty_unsupported_Iop_SliceV128(v138, v138, 8);
        v145 = __dirty_unsupported_Iop_SliceV128(v139, v139, 8);
        v146 = __dirty_unsupported_Iop_SliceV128(v140, v140, 8);
        v147 = __dirty_unsupported_Iop_SliceV128(v135, v135, 8);
        v148 = __dirty_unsupported_Iop_SliceV128(v142, v142, 8);
        v149 = __dirty_unsupported_Iop_SliceV128(v141, v141, 8);
        v150 = __dirty_unsupported_Iop_SliceV128(v134, v134, 8);
        v151 = arm64g_calculate_condition(20, v63, 1, 0);
        if (!(v151 & 1))
        {
            v128 = iter[1];
            iter += 1;
        }
        v152 = v59 + 4;
        v153 = v152 + 2;
        v154 = v153 + 1;
        v155 = v154 + 1;
        v58 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v142, v126), v143), *v59), _mm_and_si128(v128, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v128));
        v57 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v142, _mm_xor_si128(v133, v130)), v144), v59[1]), _mm_and_si128(v128, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v128));
        v56 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v138, v127), v150), v59[2]), _mm_and_si128(v128, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v128));
        v55 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v142, _mm_xor_si128(v134, v129)), v147), v59[3]), _mm_and_si128(v128, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v128));
        v54 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v142, _mm_xor_si128(v135, v131)), v145), *v152), _mm_and_si128(v128, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v128));
        v53 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v139, v132), v146), v152[1]), _mm_and_si128(v128, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v128));
        v52 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v140, v136), v149), *v153), _mm_and_si128(v128, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v128));
        v51 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v141, v137), v148), *v154), _mm_and_si128(v128, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v128));
        v1 = v62;
        v163 = v155;
    }
    v156 = _mm_set1_epi32(0x55555555);
    v157 = _mm_set1_epi32(0x33333333);
    v158 = _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v122, _mm_srli_epi64(v121, 1)), v156), 1), v121);
    v159 = _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v116, _mm_srli_epi64(v120, 1)), v156), 1), v120);
    v160 = _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v124, _mm_srli_epi64(v123, 1)), v156), 1), v123);
    v161 = _mm_and_si128(_mm_xor_si128(_mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v117, _mm_srli_epi64(v118, 1)), v156), 1), v118), _mm_srli_epi64(_mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v116, _mm_srli_epi64(v120, 1)), v156), 1), v120), 2)), v157);
    v162 = _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(_mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v124, _mm_srli_epi64(v123, 1)), v156), 1), v123), _mm_srli_epi64(v158, 2)), v157), 2), v158);
    return _mm_cvtsi128_si64(_mm_xor_si128(*v59, _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(_mm_xor_si128(_mm_slli_epi64(v161, 2), v159), _mm_srli_epi64(v162, 4)), _mm_set1_epi32(0xf0f0f0f)), 4), _mm_xor_si128(_mm_slli_epi64(_mm_and_si128(_mm_xor_si128(v160, _mm_srli_epi64(v158, 2)), v157), 2), v158))));
}
