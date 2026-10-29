/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabf6b0..0xac03b0 (3328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern void g_df8200;

unsigned int * sub_abf6b0(unsigned int *a0, uint128_t *a1, unsigned long a2)
{
    unsigned long long v6;  // x30
    uint128_t *v7;  // x2
    __m128i v16;  // q3
    unsigned int v106;  // w15
    unsigned long v107;  // x8
    uint128_t *v108;  // x16
    unsigned long long v109;  // x4
    unsigned long long v110;  // x8
    unsigned int v111;  // w11
    unsigned int v112;  // w14
    unsigned int v113;  // w15
    unsigned long v114;  // x7
    unsigned long long v115;  // x3
    uint128_t *v17;  // x17
    uint128_t *v116;  // x17
    __m128i v117;  // q4
    unsigned long long v119;  // x7
    unsigned int v120;  // w11
    unsigned int v121;  // w13
    unsigned int v122;  // w15
    unsigned long v123;  // x6
    unsigned int v124;  // w11
    unsigned int v125;  // w14
    unsigned long v18;  // x3
    unsigned int v126;  // w15
    unsigned long v127;  // x5
    __m128i v128;  // q3
    unsigned int v129;  // w11
    unsigned int v130;  // w13
    unsigned int v131;  // w15
    unsigned long v132;  // x4
    unsigned int v133;  // w11
    unsigned int v134;  // w15
    unsigned int i;  // w12
    unsigned long v19;  // x4
    void* v136;  // x16
    unsigned long v137;  // x17
    uint128_t *v138;  // x1
    uint128_t *v139;  // x1
    void* v140;  // x16
    unsigned long long v141;  // x3
    unsigned int v142;  // w11
    unsigned int v143;  // w13
    unsigned int v144;  // w15
    unsigned long v145;  // x10
    unsigned long v20;  // x5
    unsigned long long v146;  // x6
    unsigned long long v147;  // x10
    unsigned int v148;  // w11
    unsigned int v149;  // w14
    unsigned int v150;  // w15
    unsigned long v151;  // x9
    unsigned long long v152;  // x5
    unsigned long long v153;  // x9
    unsigned int v154;  // w11
    unsigned int v155;  // w13
    unsigned long v21;  // x6
    unsigned int v156;  // w15
    unsigned long v157;  // x8
    unsigned long long v158;  // x4
    unsigned long long v159;  // x8
    unsigned int v160;  // w11
    unsigned int v161;  // w14
    unsigned int v162;  // w15
    unsigned long v163;  // x7
    unsigned long long v164;  // x3
    uint128_t *v165;  // x1
    unsigned long v22;  // x7
    void* v166;  // x16
    unsigned long long v167;  // x7
    unsigned int v168;  // w11
    unsigned int v169;  // w13
    unsigned int v170;  // w15
    unsigned long v171;  // x6
    unsigned long long v172;  // x10
    unsigned long long v173;  // x6
    unsigned int v174;  // w11
    unsigned int v175;  // w14
    unsigned long v23;  // x8
    unsigned int v176;  // w15
    unsigned long v177;  // x5
    unsigned long long v178;  // x9
    unsigned long long v179;  // x5
    unsigned int v180;  // w11
    unsigned int v181;  // w13
    unsigned int v182;  // w15
    unsigned long v183;  // x4
    unsigned long long v184;  // x8
    unsigned long long v185;  // x4
    unsigned long v24;  // x9
    unsigned int v186;  // w11
    unsigned int v187;  // w14
    unsigned int v188;  // w15
    unsigned long v189;  // x3
    unsigned long long v190;  // x7
    uint128_t *v191;  // x1
    void* v192;  // x16
    unsigned long long v193;  // x3
    unsigned int v194;  // w11
    unsigned int v195;  // w13
    unsigned long v25;  // x10
    unsigned int v196;  // w15
    unsigned long v197;  // x10
    unsigned long long v198;  // x6
    unsigned long long v199;  // x10
    unsigned int v200;  // w11
    unsigned int v201;  // w14
    unsigned int v202;  // w15
    unsigned long v203;  // x9
    unsigned long long v204;  // x5
    unsigned long long v205;  // x9
    uint128_t *v8;  // x1
    unsigned long v26;  // x12
    unsigned int v206;  // w11
    unsigned int v207;  // w13
    unsigned int v208;  // w15
    unsigned long v209;  // x8
    unsigned long long v210;  // x4
    unsigned long long v211;  // x8
    unsigned int v212;  // w11
    unsigned int v213;  // w14
    unsigned int v214;  // w15
    unsigned long v215;  // x7
    unsigned long v27;  // x13
    unsigned long long v216;  // x3
    uint128_t *v217;  // x1
    unsigned long long v218;  // x7
    unsigned int v219;  // w11
    unsigned int v220;  // w13
    unsigned int v221;  // w15
    unsigned long v222;  // x6
    unsigned long long v223;  // x10
    unsigned long long v224;  // x6
    unsigned int v225;  // w11
    unsigned int v28;  // w14
    unsigned int v226;  // w14
    unsigned int v227;  // w15
    unsigned long v228;  // x5
    unsigned long long v229;  // x9
    unsigned long long v230;  // x5
    unsigned int v231;  // w11
    unsigned int v232;  // w13
    unsigned int v233;  // w15
    unsigned long v234;  // x4
    unsigned long long v235;  // x8
    unsigned long v29;  // x15
    unsigned long long v236;  // x4
    unsigned int v237;  // w11
    unsigned int v238;  // w15
    unsigned long v239;  // x3
    unsigned long v240;  // x13
    unsigned long v241;  // x14
    unsigned long long v242;  // 4619
    __m128i v30;  // q4
    unsigned long long v32;  // x3
    unsigned int v33;  // w11
    unsigned int v34;  // w13
    unsigned int v35;  // w15
    uint128_t *v9;  // x1
    unsigned long v36;  // x10
    unsigned long long v37;  // x6
    unsigned long long v38;  // x10
    unsigned int v39;  // w11
    unsigned int v40;  // w14
    unsigned int v41;  // w15
    unsigned long v42;  // x9
    unsigned long long v43;  // x5
    __m128i v44;  // q0
    unsigned long long v45;  // x9
    uint128_t *v10;  // x1
    unsigned int v46;  // w11
    unsigned int v47;  // w13
    unsigned int v48;  // w15
    unsigned long v49;  // x8
    uint128_t *v50;  // x16
    unsigned long long v51;  // x4
    unsigned long long v52;  // x8
    unsigned int v53;  // w11
    unsigned int v54;  // w14
    unsigned int v55;  // w15
    uint128_t *v11;  // x1
    unsigned long v56;  // x7
    unsigned long long v57;  // x3
    uint128_t *v58;  // x17
    __m128i v59;  // q4
    unsigned long long v61;  // x7
    unsigned int v62;  // w11
    unsigned int v63;  // w13
    unsigned int v64;  // w15
    unsigned long v65;  // x6
    void* v12;  // x16
    unsigned long long v66;  // x10
    unsigned long long v67;  // x6
    unsigned int v68;  // w11
    unsigned int v69;  // w14
    unsigned int v70;  // w15
    unsigned long v71;  // x5
    unsigned long long v72;  // x9
    __m128i v73;  // q1
    unsigned long long v74;  // x5
    unsigned int v75;  // w11
    __m128i v13;  // q0
    unsigned int v76;  // w13
    unsigned int v77;  // w15
    unsigned long v78;  // x4
    uint128_t *v79;  // x16
    unsigned long long v80;  // x8
    unsigned long long v81;  // x4
    unsigned int v82;  // w11
    unsigned int v83;  // w14
    unsigned int v84;  // w15
    unsigned long v85;  // x3
    __m128i v14;  // q1
    unsigned long long v86;  // x7
    uint128_t *v87;  // x17
    __m128i v88;  // q4
    unsigned long long v90;  // x3
    unsigned int v91;  // w11
    unsigned int v92;  // w13
    unsigned int v93;  // w15
    unsigned long v94;  // x10
    unsigned long long v95;  // x6
    __m128i v15;  // q2
    unsigned long long v96;  // x10
    unsigned int v97;  // w11
    unsigned int v98;  // w14
    unsigned int v99;  // w15
    unsigned long v100;  // x9
    unsigned long long v101;  // x5
    __m128i v102;  // q2
    unsigned long long v103;  // x9
    unsigned int v104;  // w11
    unsigned int v105;  // w13
    uint512_t v0;  // [bp-0x50]
    uint512_t v1;  // [bp-0x50]
    uint512_t v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    v3 = &v5;
    v4 = v6;
    v7 = &a1[4 * a2];
    v8 = a1 + 1;
    v9 = v8 + 1;
    v10 = v9 + 1;
    v11 = v10 + 1;
    v12 = &g_df8200;
    v13 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*a1);
    v14 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*v8);
    v15 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*v9);
    v16 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*v10);
    *(__m128i *)((char *)&v0 + 16) = _mm_add_epi32(_mm_set_epi32(2870763221, 2453635748, 1508970993, 961987163), v14);
    *(__m128i *)&v0 = _mm_add_epi32(_mm_set_epi32(3921009573, 3049323471, 1899447441, 1116352408), v13);
    *(__m128i *)((char *)&v0 + 48) = _mm_add_epi32(_mm_set_epi32(3248222580, 2614888103, 0x80deb1fe, 1925078388), v16);
    *(__m128i *)((char *)&v0 + 32) = _mm_add_epi32(_mm_set_epi32(1426881987, 607225278, 310598401, 3624381080), v15);
    v17 = &v0;
    v18 = *a0;
    v19 = a0[1];
    v20 = a0[2];
    v21 = a0[3];
    v22 = a0[4];
    v23 = a0[5];
    v24 = a0[6];
    v25 = a0[7];
    v26 = *(unsigned int *)&v0;
    v27 = 0;
    v28 = (unsigned int)v19 ^ (unsigned int)v20;
    v29 = 0;
    do
    {
        do
        {
            v30 = __dirty_unsupported_Iop_SliceV128(v14, v13, 4);
            v32 = v18 + v29 + v27;
            v33 = (unsigned int)v22 ^ ((unsigned int)v22 * 0x8000000 | (unsigned int)v22 >> 5) ^ ((unsigned int)v22 * 0x2000 | (unsigned int)v22 >> 19);
            v34 = (unsigned int)v32 ^ (unsigned int)v19;
            v35 = (unsigned int)v32 ^ ((unsigned int)v32 * 0x200000 | (unsigned int)v32 >> 11) ^ ((unsigned int)v32 * 0x1000 | (unsigned int)v32 >> 20);
            v36 = v25 + v26 + ((unsigned int)v23 & (unsigned int)v22 | (unsigned int)v24 & ~(unsigned int)v22) + (v33 * 0x4000000 | v33 >> 6);
            v37 = v21 + v36;
            v38 = v36 + (v35 * 0x40000000 | v35 >> 2) + (v28 & v34 ^ (unsigned int)v19);
            v39 = (unsigned int)v37 ^ ((unsigned int)v37 * 0x8000000 | (unsigned int)v37 >> 5) ^ ((unsigned int)v37 * 0x2000 | (unsigned int)v37 >> 19);
            v40 = (unsigned int)v38 ^ (unsigned int)v32;
            v41 = (unsigned int)v38 ^ ((unsigned int)v38 * 0x200000 | (unsigned int)v38 >> 11) ^ ((unsigned int)v38 * 0x1000 | (unsigned int)v38 >> 20);
            v42 = v24 + *(unsigned int *)((void*)&v0 + 4) + ((unsigned int)v22 & (unsigned int)v37 | (unsigned int)v23 & ~(unsigned int)v37) + (v39 * 0x4000000 | v39 >> 6);
            v43 = v20 + v42;
            v44 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(v13, __dirty_unsupported_Iop_SliceV128(v16, v15, 4)), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v30, 14), _mm_and_si128(_mm_srli_epi32(v30, 18), _mm_srli_epi32(_mm_set1_epi32(-1), 18))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v30, 25), _mm_and_si128(_mm_srli_epi32(v30, 7), _mm_srli_epi32(_mm_set1_epi32(-1), 7))), _mm_srli_epi32(v30, 3)))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(_mm_extract_epi64(v16, 1), 13), _mm_and_si128(_mm_srli_epi32(_mm_extract_epi64(v16, 1), 19), _mm_srli_epi32(_mm_set1_epi32(-1), 19))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(_mm_extract_epi64(v16, 1), 15), _mm_and_si128(_mm_srli_epi32(_mm_extract_epi64(v16, 1), 0x11), _mm_srli_epi32(_mm_set1_epi32(-1), 0x11))), _mm_srli_epi32(_mm_extract_epi64(v16, 1), 10))));
            v45 = v42 + (v41 * 0x40000000 | v41 >> 2) + (v34 & v40 ^ (unsigned int)v32);
            v46 = (unsigned int)v43 ^ ((unsigned int)v43 * 0x8000000 | (unsigned int)v43 >> 5) ^ ((unsigned int)v43 * 0x2000 | (unsigned int)v43 >> 19);
            v47 = (unsigned int)v45 ^ (unsigned int)v38;
            v48 = (unsigned int)v45 ^ ((unsigned int)v45 * 0x200000 | (unsigned int)v45 >> 11) ^ ((unsigned int)v45 * 0x1000 | (unsigned int)v45 >> 20);
            v49 = v23 + *(unsigned int *)((void*)&v0 + 8) + ((unsigned int)v37 & (unsigned int)v43 | (unsigned int)v22 & ~(unsigned int)v43) + (v46 * 0x4000000 | v46 >> 6);
            v50 = v12 + 16;
            v51 = v19 + v49;
            v52 = v49 + (v48 * 0x40000000 | v48 >> 2) + (v40 & v47 ^ (unsigned int)v38);
            v13 = _mm_add_epi32(v44, _mm_cvtsi128_si64(_mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v44, 13), _mm_and_si128(_mm_srli_epi32(v44, 19), _mm_srli_epi32(_mm_set1_epi32(-1), 19))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v44, 15), _mm_and_si128(_mm_srli_epi32(v44, 0x11), _mm_srli_epi32(_mm_set1_epi32(-1), 0x11))), _mm_srli_epi32(v44, 10)))) * 0x10000000000000000);
            v53 = (unsigned int)v51 ^ ((unsigned int)v51 * 0x8000000 | (unsigned int)v51 >> 5) ^ ((unsigned int)v51 * 0x2000 | (unsigned int)v51 >> 19);
            v54 = (unsigned int)v52 ^ (unsigned int)v45;
            v55 = (unsigned int)v52 ^ ((unsigned int)v52 * 0x200000 | (unsigned int)v52 >> 11) ^ ((unsigned int)v52 * 0x1000 | (unsigned int)v52 >> 20);
            v56 = v22 + *(unsigned int *)((void*)&v0 + 12) + ((unsigned int)v43 & (unsigned int)v51 | (unsigned int)v37 & ~(unsigned int)v51) + (v53 * 0x4000000 | v53 >> 6);
            v57 = v32 + v56;
            *v17 = _mm_add_epi32(*(int128_t *)v12, v13);
            v58 = v17 + 1;
            v59 = __dirty_unsupported_Iop_SliceV128(v15, v14, 4);
            v61 = v56 + (v55 * 0x40000000 | v55 >> 2) + (v47 & v54 ^ (unsigned int)v45);
            v62 = (unsigned int)v57 ^ ((unsigned int)v57 * 0x8000000 | (unsigned int)v57 >> 5) ^ ((unsigned int)v57 * 0x2000 | (unsigned int)v57 >> 19);
            v63 = (unsigned int)v61 ^ (unsigned int)v52;
            v64 = (unsigned int)v61 ^ ((unsigned int)v61 * 0x200000 | (unsigned int)v61 >> 11) ^ ((unsigned int)v61 * 0x1000 | (unsigned int)v61 >> 20);
            v65 = v37 + *(unsigned int *)((void*)&v0 + 16) + ((unsigned int)v51 & (unsigned int)v57 | (unsigned int)v43 & ~(unsigned int)v57) + (v62 * 0x4000000 | v62 >> 6);
            v66 = v38 + v65;
            v67 = v65 + (v64 * 0x40000000 | v64 >> 2) + (v54 & v63 ^ (unsigned int)v52);
            v68 = (unsigned int)v66 ^ ((unsigned int)v66 * 0x8000000 | (unsigned int)v66 >> 5) ^ ((unsigned int)v66 * 0x2000 | (unsigned int)v66 >> 19);
            v69 = (unsigned int)v67 ^ (unsigned int)v61;
            v70 = (unsigned int)v67 ^ ((unsigned int)v67 * 0x200000 | (unsigned int)v67 >> 11) ^ ((unsigned int)v67 * 0x1000 | (unsigned int)v67 >> 20);
            v71 = v43 + *(unsigned int *)((void*)&v0 + 20) + ((unsigned int)v57 & (unsigned int)v66 | (unsigned int)v51 & ~(unsigned int)v66) + (v68 * 0x4000000 | v68 >> 6);
            v72 = v45 + v71;
            v73 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(v14, __dirty_unsupported_Iop_SliceV128(v13, v16, 4)), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v59, 14), _mm_and_si128(_mm_srli_epi32(v59, 18), _mm_srli_epi32(_mm_set1_epi32(-1), 18))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v59, 25), _mm_and_si128(_mm_srli_epi32(v59, 7), _mm_srli_epi32(_mm_set1_epi32(-1), 7))), _mm_srli_epi32(v59, 3)))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(_mm_extract_epi64(v13, 1), 13), _mm_and_si128(_mm_srli_epi32(_mm_extract_epi64(v13, 1), 19), _mm_srli_epi32(_mm_set1_epi32(-1), 19))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(_mm_extract_epi64(v13, 1), 15), _mm_and_si128(_mm_srli_epi32(_mm_extract_epi64(v13, 1), 0x11), _mm_srli_epi32(_mm_set1_epi32(-1), 0x11))), _mm_srli_epi32(_mm_extract_epi64(v13, 1), 10))));
            v74 = v71 + (v70 * 0x40000000 | v70 >> 2) + (v63 & v69 ^ (unsigned int)v61);
            v75 = (unsigned int)v72 ^ ((unsigned int)v72 * 0x8000000 | (unsigned int)v72 >> 5) ^ ((unsigned int)v72 * 0x2000 | (unsigned int)v72 >> 19);
            v76 = (unsigned int)v74 ^ (unsigned int)v67;
            v77 = (unsigned int)v74 ^ ((unsigned int)v74 * 0x200000 | (unsigned int)v74 >> 11) ^ ((unsigned int)v74 * 0x1000 | (unsigned int)v74 >> 20);
            v78 = v51 + *(unsigned int *)((void*)&v0 + 24) + ((unsigned int)v66 & (unsigned int)v72 | (unsigned int)v57 & ~(unsigned int)v72) + (v75 * 0x4000000 | v75 >> 6);
            v79 = v50 + 1;
            v80 = v52 + v78;
            v81 = v78 + (v77 * 0x40000000 | v77 >> 2) + (v69 & v76 ^ (unsigned int)v67);
            v14 = _mm_add_epi32(v73, _mm_cvtsi128_si64(_mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v73, 13), _mm_and_si128(_mm_srli_epi32(v73, 19), _mm_srli_epi32(_mm_set1_epi32(-1), 19))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v73, 15), _mm_and_si128(_mm_srli_epi32(v73, 0x11), _mm_srli_epi32(_mm_set1_epi32(-1), 0x11))), _mm_srli_epi32(v73, 10)))) * 0x10000000000000000);
            v82 = (unsigned int)v80 ^ ((unsigned int)v80 * 0x8000000 | (unsigned int)v80 >> 5) ^ ((unsigned int)v80 * 0x2000 | (unsigned int)v80 >> 19);
            v83 = (unsigned int)v81 ^ (unsigned int)v74;
            v84 = (unsigned int)v81 ^ ((unsigned int)v81 * 0x200000 | (unsigned int)v81 >> 11) ^ ((unsigned int)v81 * 0x1000 | (unsigned int)v81 >> 20);
            v85 = v57 + *(unsigned int *)((void*)&v0 + 28) + ((unsigned int)v72 & (unsigned int)v80 | (unsigned int)v66 & ~(unsigned int)v80) + (v82 * 0x4000000 | v82 >> 6);
            v86 = v61 + v85;
            *v58 = _mm_add_epi32(*v50, v14);
            v87 = v58 + 1;
            v88 = __dirty_unsupported_Iop_SliceV128(v16, v15, 4);
            v90 = v85 + (v84 * 0x40000000 | v84 >> 2) + (v76 & v83 ^ (unsigned int)v74);
            v91 = (unsigned int)v86 ^ ((unsigned int)v86 * 0x8000000 | (unsigned int)v86 >> 5) ^ ((unsigned int)v86 * 0x2000 | (unsigned int)v86 >> 19);
            v92 = (unsigned int)v90 ^ (unsigned int)v81;
            v93 = (unsigned int)v90 ^ ((unsigned int)v90 * 0x200000 | (unsigned int)v90 >> 11) ^ ((unsigned int)v90 * 0x1000 | (unsigned int)v90 >> 20);
            v94 = v66 + *(unsigned int *)((void*)&v0 + 32) + ((unsigned int)v80 & (unsigned int)v86 | (unsigned int)v72 & ~(unsigned int)v86) + (v91 * 0x4000000 | v91 >> 6);
            v95 = v67 + v94;
            v96 = v94 + (v93 * 0x40000000 | v93 >> 2) + (v83 & v92 ^ (unsigned int)v81);
            v97 = (unsigned int)v95 ^ ((unsigned int)v95 * 0x8000000 | (unsigned int)v95 >> 5) ^ ((unsigned int)v95 * 0x2000 | (unsigned int)v95 >> 19);
            v98 = (unsigned int)v96 ^ (unsigned int)v90;
            v99 = (unsigned int)v96 ^ ((unsigned int)v96 * 0x200000 | (unsigned int)v96 >> 11) ^ ((unsigned int)v96 * 0x1000 | (unsigned int)v96 >> 20);
            v100 = v72 + *(unsigned int *)((void*)&v0 + 36) + ((unsigned int)v86 & (unsigned int)v95 | (unsigned int)v80 & ~(unsigned int)v95) + (v97 * 0x4000000 | v97 >> 6);
            v101 = v74 + v100;
            v102 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(v15, __dirty_unsupported_Iop_SliceV128(v14, v13, 4)), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v88, 14), _mm_and_si128(_mm_srli_epi32(v88, 18), _mm_srli_epi32(_mm_set1_epi32(-1), 18))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v88, 25), _mm_and_si128(_mm_srli_epi32(v88, 7), _mm_srli_epi32(_mm_set1_epi32(-1), 7))), _mm_srli_epi32(v88, 3)))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(_mm_extract_epi64(v14, 1), 13), _mm_and_si128(_mm_srli_epi32(_mm_extract_epi64(v14, 1), 19), _mm_srli_epi32(_mm_set1_epi32(-1), 19))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(_mm_extract_epi64(v14, 1), 15), _mm_and_si128(_mm_srli_epi32(_mm_extract_epi64(v14, 1), 0x11), _mm_srli_epi32(_mm_set1_epi32(-1), 0x11))), _mm_srli_epi32(_mm_extract_epi64(v14, 1), 10))));
            v103 = v100 + (v99 * 0x40000000 | v99 >> 2) + (v92 & v98 ^ (unsigned int)v90);
            v104 = (unsigned int)v101 ^ ((unsigned int)v101 * 0x8000000 | (unsigned int)v101 >> 5) ^ ((unsigned int)v101 * 0x2000 | (unsigned int)v101 >> 19);
            v105 = (unsigned int)v103 ^ (unsigned int)v96;
            v106 = (unsigned int)v103 ^ ((unsigned int)v103 * 0x200000 | (unsigned int)v103 >> 11) ^ ((unsigned int)v103 * 0x1000 | (unsigned int)v103 >> 20);
            v107 = v80 + *(unsigned int *)((void*)&v0 + 40) + ((unsigned int)v95 & (unsigned int)v101 | (unsigned int)v86 & ~(unsigned int)v101) + (v104 * 0x4000000 | v104 >> 6);
            v108 = v79 + 1;
            v109 = v81 + v107;
            v110 = v107 + (v106 * 0x40000000 | v106 >> 2) + (v98 & v105 ^ (unsigned int)v96);
            v15 = _mm_add_epi32(v102, _mm_cvtsi128_si64(_mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v102, 13), _mm_and_si128(_mm_srli_epi32(v102, 19), _mm_srli_epi32(_mm_set1_epi32(-1), 19))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v102, 15), _mm_and_si128(_mm_srli_epi32(v102, 0x11), _mm_srli_epi32(_mm_set1_epi32(-1), 0x11))), _mm_srli_epi32(v102, 10)))) * 0x10000000000000000);
            v111 = (unsigned int)v109 ^ ((unsigned int)v109 * 0x8000000 | (unsigned int)v109 >> 5) ^ ((unsigned int)v109 * 0x2000 | (unsigned int)v109 >> 19);
            v112 = (unsigned int)v110 ^ (unsigned int)v103;
            v113 = (unsigned int)v110 ^ ((unsigned int)v110 * 0x200000 | (unsigned int)v110 >> 11) ^ ((unsigned int)v110 * 0x1000 | (unsigned int)v110 >> 20);
            v114 = v86 + *(unsigned int *)((void*)&v0 + 44) + ((unsigned int)v101 & (unsigned int)v109 | (unsigned int)v95 & ~(unsigned int)v109) + (v111 * 0x4000000 | v111 >> 6);
            v115 = v90 + v114;
            *v87 = _mm_add_epi32(*v79, v15);
            v116 = v87 + 1;
            v117 = __dirty_unsupported_Iop_SliceV128(v13, v16, 4);
            v119 = v114 + (v113 * 0x40000000 | v113 >> 2) + (v105 & v112 ^ (unsigned int)v103);
            v120 = (unsigned int)v115 ^ ((unsigned int)v115 * 0x8000000 | (unsigned int)v115 >> 5) ^ ((unsigned int)v115 * 0x2000 | (unsigned int)v115 >> 19);
            v121 = (unsigned int)v119 ^ (unsigned int)v110;
            v122 = (unsigned int)v119 ^ ((unsigned int)v119 * 0x200000 | (unsigned int)v119 >> 11) ^ ((unsigned int)v119 * 0x1000 | (unsigned int)v119 >> 20);
            v123 = v95 + *(unsigned int *)((void*)&v0 + 48) + ((unsigned int)v109 & (unsigned int)v115 | (unsigned int)v101 & ~(unsigned int)v115) + (v120 * 0x4000000 | v120 >> 6);
            v25 = v96 + v123;
            v21 = v123 + (v122 * 0x40000000 | v122 >> 2) + (v112 & v121 ^ (unsigned int)v110);
            v124 = (unsigned int)v25 ^ ((unsigned int)v25 * 0x8000000 | (unsigned int)v25 >> 5) ^ ((unsigned int)v25 * 0x2000 | (unsigned int)v25 >> 19);
            v125 = (unsigned int)v21 ^ (unsigned int)v119;
            v126 = (unsigned int)v21 ^ ((unsigned int)v21 * 0x200000 | (unsigned int)v21 >> 11) ^ ((unsigned int)v21 * 0x1000 | (unsigned int)v21 >> 20);
            v127 = v101 + *(unsigned int *)((void*)&v0 + 52) + ((unsigned int)v115 & (unsigned int)v25 | (unsigned int)v109 & ~(unsigned int)v25) + (v124 * 0x4000000 | v124 >> 6);
            v24 = v103 + v127;
            v128 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(v16, __dirty_unsupported_Iop_SliceV128(v15, v14, 4)), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v117, 14), _mm_and_si128(_mm_srli_epi32(v117, 18), _mm_srli_epi32(_mm_set1_epi32(-1), 18))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v117, 25), _mm_and_si128(_mm_srli_epi32(v117, 7), _mm_srli_epi32(_mm_set1_epi32(-1), 7))), _mm_srli_epi32(v117, 3)))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(_mm_extract_epi64(v15, 1), 13), _mm_and_si128(_mm_srli_epi32(_mm_extract_epi64(v15, 1), 19), _mm_srli_epi32(_mm_set1_epi32(-1), 19))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(_mm_extract_epi64(v15, 1), 15), _mm_and_si128(_mm_srli_epi32(_mm_extract_epi64(v15, 1), 0x11), _mm_srli_epi32(_mm_set1_epi32(-1), 0x11))), _mm_srli_epi32(_mm_extract_epi64(v15, 1), 10))));
            v20 = v127 + (v126 * 0x40000000 | v126 >> 2) + (v121 & v125 ^ (unsigned int)v119);
            v129 = (unsigned int)v24 ^ ((unsigned int)v24 * 0x8000000 | (unsigned int)v24 >> 5) ^ ((unsigned int)v24 * 0x2000 | (unsigned int)v24 >> 19);
            v130 = (unsigned int)v20 ^ (unsigned int)v21;
            v131 = (unsigned int)v20 ^ ((unsigned int)v20 * 0x200000 | (unsigned int)v20 >> 11) ^ __ROL__((unsigned int)v20, 12);
            v132 = v109 + *(unsigned int *)((void*)&v0 + 56) + ((unsigned int)v25 & (unsigned int)v24 | (unsigned int)v115 & ~(unsigned int)v24) + (v129 * 0x4000000 | v129 >> 6);
            v12 = v108 + 1;
            v23 = v110 + v132;
            v19 = v132 + (v131 * 0x40000000 | v131 >> 2) + (v125 & v130 ^ (unsigned int)v21);
            v16 = _mm_add_epi32(v128, _mm_cvtsi128_si64(_mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v128, 13), _mm_and_si128(_mm_srli_epi32(v128, 19), _mm_srli_epi32(_mm_set1_epi32(-1), 19))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v128, 15), _mm_and_si128(_mm_srli_epi32(v128, 0x11), _mm_srli_epi32(_mm_set1_epi32(-1), 0x11))), _mm_srli_epi32(v128, 10)))) * 0x10000000000000000);
            v133 = (unsigned int)v23 ^ __ROL__((unsigned int)v23, 27) ^ __ROL__((unsigned int)v23, 13);
            v28 = (unsigned int)v19 ^ (unsigned int)v20;
            v134 = (unsigned int)v19 ^ __ROL__((unsigned int)v19, 21) ^ __ROL__((unsigned int)v19, 12);
            v18 = v115 + *(unsigned int *)((void*)&v0 + 60) + ((unsigned int)v24 & (unsigned int)v23 | (unsigned int)v25 & ~(unsigned int)v23) + (v133 * 0x4000000 | v133 >> 6);
            i = *(int *)v12;
            v29 = v134 * 0x40000000 | v134 >> 2;
            v22 = v119 + v18;
            v27 = v130 & v28 ^ (unsigned int)v20;
            *v116 = _mm_add_epi32(*v108, v16);
            v26 = *(unsigned int *)&v0;
            v17 = (char *)v116 - 48;
        } while (i);
        v136 = v12 - 0x100;
        v137 = 64;
        if (v11 != v7)
            v137 = 0;
        v138 = (char *)v11 - v137;
        v139 = v138 + 1;
        v140 = v136 + 16;
        v141 = v18 + v29 + v27;
        v142 = (unsigned int)v22 ^ ((unsigned int)v22 * 0x8000000 | (unsigned int)v22 >> 5) ^ ((unsigned int)v22 * 0x2000 | (unsigned int)v22 >> 19);
        v13 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*v138);
        v143 = (unsigned int)v141 ^ (unsigned int)v19;
        v144 = (unsigned int)v141 ^ ((unsigned int)v141 * 0x200000 | (unsigned int)v141 >> 11) ^ ((unsigned int)v141 * 0x1000 | (unsigned int)v141 >> 20);
        v145 = v25 + v26 + ((unsigned int)v23 & (unsigned int)v22 | (unsigned int)v24 & ~(unsigned int)v22) + (v142 * 0x4000000 | v142 >> 6);
        v146 = v21 + v145;
        v147 = v145 + (v144 * 0x40000000 | v144 >> 2) + (v28 & v143 ^ (unsigned int)v19);
        v148 = (unsigned int)v146 ^ ((unsigned int)v146 * 0x8000000 | (unsigned int)v146 >> 5) ^ ((unsigned int)v146 * 0x2000 | (unsigned int)v146 >> 19);
        v149 = (unsigned int)v147 ^ (unsigned int)v141;
        v150 = (unsigned int)v147 ^ ((unsigned int)v147 * 0x200000 | (unsigned int)v147 >> 11) ^ ((unsigned int)v147 * 0x1000 | (unsigned int)v147 >> 20);
        v151 = v24 + *(unsigned int *)((void*)&v0 + 4) + ((unsigned int)v22 & (unsigned int)v146 | (unsigned int)v23 & ~(unsigned int)v146) + (v148 * 0x4000000 | v148 >> 6);
        v152 = v20 + v151;
        v153 = v151 + (v150 * 0x40000000 | v150 >> 2) + (v143 & v149 ^ (unsigned int)v141);
        v154 = (unsigned int)v152 ^ ((unsigned int)v152 * 0x8000000 | (unsigned int)v152 >> 5) ^ ((unsigned int)v152 * 0x2000 | (unsigned int)v152 >> 19);
        v155 = (unsigned int)v153 ^ (unsigned int)v147;
        v156 = (unsigned int)v153 ^ ((unsigned int)v153 * 0x200000 | (unsigned int)v153 >> 11) ^ ((unsigned int)v153 * 0x1000 | (unsigned int)v153 >> 20);
        v157 = v23 + *(unsigned int *)((void*)&v0 + 8) + ((unsigned int)v146 & (unsigned int)v152 | (unsigned int)v22 & ~(unsigned int)v152) + (v154 * 0x4000000 | v154 >> 6);
        v158 = v19 + v157;
        v159 = v157 + (v156 * 0x40000000 | v156 >> 2) + (v149 & v155 ^ (unsigned int)v147);
        v160 = (unsigned int)v158 ^ ((unsigned int)v158 * 0x8000000 | (unsigned int)v158 >> 5) ^ ((unsigned int)v158 * 0x2000 | (unsigned int)v158 >> 19);
        v161 = (unsigned int)v159 ^ (unsigned int)v153;
        v162 = (unsigned int)v159 ^ ((unsigned int)v159 * 0x200000 | (unsigned int)v159 >> 11) ^ ((unsigned int)v159 * 0x1000 | (unsigned int)v159 >> 20);
        v163 = v22 + *(unsigned int *)((void*)&v0 + 12) + ((unsigned int)v152 & (unsigned int)v158 | (unsigned int)v146 & ~(unsigned int)v158) + (v160 * 0x4000000 | v160 >> 6);
        v164 = v141 + v163;
        v1 = _INSERT(v0, 0, _mm_add_epi32(*(int128_t *)v136, v13));
        v165 = v139 + 1;
        v166 = v140 + 16;
        v167 = v163 + (v162 * 0x40000000 | v162 >> 2) + (v155 & v161 ^ (unsigned int)v153);
        v168 = (unsigned int)v164 ^ ((unsigned int)v164 * 0x8000000 | (unsigned int)v164 >> 5) ^ ((unsigned int)v164 * 0x2000 | (unsigned int)v164 >> 19);
        v14 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*v139);
        v169 = (unsigned int)v167 ^ (unsigned int)v159;
        v170 = (unsigned int)v167 ^ ((unsigned int)v167 * 0x200000 | (unsigned int)v167 >> 11) ^ ((unsigned int)v167 * 0x1000 | (unsigned int)v167 >> 20);
        v171 = v146 + *(unsigned int *)((void*)&v0 + 16) + ((unsigned int)v158 & (unsigned int)v164 | (unsigned int)v152 & ~(unsigned int)v164) + (v168 * 0x4000000 | v168 >> 6);
        v172 = v147 + v171;
        v173 = v171 + (v170 * 0x40000000 | v170 >> 2) + (v161 & v169 ^ (unsigned int)v159);
        v174 = (unsigned int)v172 ^ ((unsigned int)v172 * 0x8000000 | (unsigned int)v172 >> 5) ^ ((unsigned int)v172 * 0x2000 | (unsigned int)v172 >> 19);
        v175 = (unsigned int)v173 ^ (unsigned int)v167;
        v176 = (unsigned int)v173 ^ ((unsigned int)v173 * 0x200000 | (unsigned int)v173 >> 11) ^ ((unsigned int)v173 * 0x1000 | (unsigned int)v173 >> 20);
        v177 = v152 + *(unsigned int *)((void*)&v1 + 20) + ((unsigned int)v164 & (unsigned int)v172 | (unsigned int)v158 & ~(unsigned int)v172) + (v174 * 0x4000000 | v174 >> 6);
        v178 = v153 + v177;
        v179 = v177 + (v176 * 0x40000000 | v176 >> 2) + (v169 & v175 ^ (unsigned int)v167);
        v180 = (unsigned int)v178 ^ ((unsigned int)v178 * 0x8000000 | (unsigned int)v178 >> 5) ^ ((unsigned int)v178 * 0x2000 | (unsigned int)v178 >> 19);
        v181 = (unsigned int)v179 ^ (unsigned int)v173;
        v182 = (unsigned int)v179 ^ ((unsigned int)v179 * 0x200000 | (unsigned int)v179 >> 11) ^ ((unsigned int)v179 * 0x1000 | (unsigned int)v179 >> 20);
        v183 = v158 + *(unsigned int *)((void*)&v1 + 24) + ((unsigned int)v172 & (unsigned int)v178 | (unsigned int)v164 & ~(unsigned int)v178) + (v180 * 0x4000000 | v180 >> 6);
        v184 = v159 + v183;
        v185 = v183 + (v182 * 0x40000000 | v182 >> 2) + (v175 & v181 ^ (unsigned int)v173);
        v186 = (unsigned int)v184 ^ ((unsigned int)v184 * 0x8000000 | (unsigned int)v184 >> 5) ^ ((unsigned int)v184 * 0x2000 | (unsigned int)v184 >> 19);
        v187 = (unsigned int)v185 ^ (unsigned int)v179;
        v188 = (unsigned int)v185 ^ ((unsigned int)v185 * 0x200000 | (unsigned int)v185 >> 11) ^ ((unsigned int)v185 * 0x1000 | (unsigned int)v185 >> 20);
        v189 = v164 + *(unsigned int *)((void*)&v1 + 28) + ((unsigned int)v178 & (unsigned int)v184 | (unsigned int)v172 & ~(unsigned int)v184) + (v186 * 0x4000000 | v186 >> 6);
        v190 = v167 + v189;
        v2 = _INSERT(v1, 16, _mm_add_epi32(*(int128_t *)v140, v14));
        v191 = v165 + 1;
        v192 = v166 + 16;
        v193 = v189 + (v188 * 0x40000000 | v188 >> 2) + (v181 & v187 ^ (unsigned int)v179);
        v194 = (unsigned int)v190 ^ ((unsigned int)v190 * 0x8000000 | (unsigned int)v190 >> 5) ^ ((unsigned int)v190 * 0x2000 | (unsigned int)v190 >> 19);
        v15 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*v165);
        v195 = (unsigned int)v193 ^ (unsigned int)v185;
        v196 = (unsigned int)v193 ^ ((unsigned int)v193 * 0x200000 | (unsigned int)v193 >> 11) ^ ((unsigned int)v193 * 0x1000 | (unsigned int)v193 >> 20);
        v197 = v172 + *(unsigned int *)((void*)&v1 + 32) + ((unsigned int)v184 & (unsigned int)v190 | (unsigned int)v178 & ~(unsigned int)v190) + (v194 * 0x4000000 | v194 >> 6);
        v198 = v173 + v197;
        v199 = v197 + (v196 * 0x40000000 | v196 >> 2) + (v187 & v195 ^ (unsigned int)v185);
        v200 = (unsigned int)v198 ^ ((unsigned int)v198 * 0x8000000 | (unsigned int)v198 >> 5) ^ ((unsigned int)v198 * 0x2000 | (unsigned int)v198 >> 19);
        v201 = (unsigned int)v199 ^ (unsigned int)v193;
        v202 = (unsigned int)v199 ^ ((unsigned int)v199 * 0x200000 | (unsigned int)v199 >> 11) ^ ((unsigned int)v199 * 0x1000 | (unsigned int)v199 >> 20);
        v203 = v178 + *(unsigned int *)((void*)&v2 + 36) + ((unsigned int)v190 & (unsigned int)v198 | (unsigned int)v184 & ~(unsigned int)v198) + (v200 * 0x4000000 | v200 >> 6);
        v204 = v179 + v203;
        v205 = v203 + (v202 * 0x40000000 | v202 >> 2) + (v195 & v201 ^ (unsigned int)v193);
        v206 = (unsigned int)v204 ^ ((unsigned int)v204 * 0x8000000 | (unsigned int)v204 >> 5) ^ ((unsigned int)v204 * 0x2000 | (unsigned int)v204 >> 19);
        v207 = (unsigned int)v205 ^ (unsigned int)v199;
        v208 = (unsigned int)v205 ^ ((unsigned int)v205 * 0x200000 | (unsigned int)v205 >> 11) ^ ((unsigned int)v205 * 0x1000 | (unsigned int)v205 >> 20);
        v209 = v184 + *(unsigned int *)((void*)&v2 + 40) + ((unsigned int)v198 & (unsigned int)v204 | (unsigned int)v190 & ~(unsigned int)v204) + (v206 * 0x4000000 | v206 >> 6);
        v210 = v185 + v209;
        v211 = v209 + (v208 * 0x40000000 | v208 >> 2) + (v201 & v207 ^ (unsigned int)v199);
        v212 = (unsigned int)v210 ^ ((unsigned int)v210 * 0x8000000 | (unsigned int)v210 >> 5) ^ ((unsigned int)v210 * 0x2000 | (unsigned int)v210 >> 19);
        v213 = (unsigned int)v211 ^ (unsigned int)v205;
        v214 = (unsigned int)v211 ^ ((unsigned int)v211 * 0x200000 | (unsigned int)v211 >> 11) ^ ((unsigned int)v211 * 0x1000 | (unsigned int)v211 >> 20);
        v215 = v190 + *(unsigned int *)((void*)&v2 + 44) + ((unsigned int)v204 & (unsigned int)v210 | (unsigned int)v198 & ~(unsigned int)v210) + (v212 * 0x4000000 | v212 >> 6);
        v216 = v193 + v215;
        v0 = _INSERT(v2, 32, _mm_add_epi32(*(int128_t *)v166, v15));
        v217 = v191 + 1;
        v12 = v192 + 16;
        v218 = v215 + (v214 * 0x40000000 | v214 >> 2) + (v207 & v213 ^ (unsigned int)v205);
        v219 = (unsigned int)v216 ^ ((unsigned int)v216 * 0x8000000 | (unsigned int)v216 >> 5) ^ ((unsigned int)v216 * 0x2000 | (unsigned int)v216 >> 19);
        v16 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*v191);
        v220 = (unsigned int)v218 ^ (unsigned int)v211;
        v221 = (unsigned int)v218 ^ ((unsigned int)v218 * 0x200000 | (unsigned int)v218 >> 11) ^ ((unsigned int)v218 * 0x1000 | (unsigned int)v218 >> 20);
        v222 = v198 + *(unsigned int *)((void*)&v2 + 48) + ((unsigned int)v210 & (unsigned int)v216 | (unsigned int)v204 & ~(unsigned int)v216) + (v219 * 0x4000000 | v219 >> 6);
        v223 = v199 + v222;
        v224 = v222 + (v221 * 0x40000000 | v221 >> 2) + (v213 & v220 ^ (unsigned int)v211);
        v225 = (unsigned int)v223 ^ ((unsigned int)v223 * 0x8000000 | (unsigned int)v223 >> 5) ^ ((unsigned int)v223 * 0x2000 | (unsigned int)v223 >> 19);
        v226 = (unsigned int)v224 ^ (unsigned int)v218;
        v227 = (unsigned int)v224 ^ ((unsigned int)v224 * 0x200000 | (unsigned int)v224 >> 11) ^ ((unsigned int)v224 * 0x1000 | (unsigned int)v224 >> 20);
        v228 = v204 + *(unsigned int *)((void*)&v0 + 52) + ((unsigned int)v216 & (unsigned int)v223 | (unsigned int)v210 & ~(unsigned int)v223) + (v225 * 0x4000000 | v225 >> 6);
        v229 = v205 + v228;
        v230 = v228 + (v227 * 0x40000000 | v227 >> 2) + (v220 & v226 ^ (unsigned int)v218);
        v231 = (unsigned int)v229 ^ ((unsigned int)v229 * 0x8000000 | (unsigned int)v229 >> 5) ^ ((unsigned int)v229 * 0x2000 | (unsigned int)v229 >> 19);
        v232 = (unsigned int)v230 ^ (unsigned int)v224;
        v233 = (unsigned int)v230 ^ ((unsigned int)v230 * 0x200000 | (unsigned int)v230 >> 11) ^ ((unsigned int)v230 * 0x1000 | (unsigned int)v230 >> 20);
        v234 = v210 + *(unsigned int *)((void*)&v0 + 56) + ((unsigned int)v223 & (unsigned int)v229 | (unsigned int)v216 & ~(unsigned int)v229) + (v231 * 0x4000000 | v231 >> 6);
        v235 = v211 + v234;
        v236 = v234 + (v233 * 0x40000000 | v233 >> 2) + (v226 & v232 ^ (unsigned int)v224);
        v237 = (unsigned int)v235 ^ ((unsigned int)v235 * 0x8000000 | (unsigned int)v235 >> 5) ^ ((unsigned int)v235 * 0x2000 | (unsigned int)v235 >> 19);
        v238 = (unsigned int)v236 ^ ((unsigned int)v236 * 0x200000 | (unsigned int)v236 >> 11) ^ ((unsigned int)v236 * 0x1000 | (unsigned int)v236 >> 20);
        v239 = v216 + *(unsigned int *)((void*)&v0 + 60) + ((unsigned int)v229 & (unsigned int)v235 | (unsigned int)v223 & ~(unsigned int)v235) + (v237 * 0x4000000 | v237 >> 6);
        *(__m128i *)((char *)&v0 + 48) = _mm_add_epi32(*(int128_t *)v192, v16);
        v18 = v239 + (v238 * 0x40000000 | v238 >> 2) + (v232 & ((unsigned int)v236 ^ (unsigned int)v230) ^ (unsigned int)v230) + *a0;
        v19 = v236 + a0[1];
        v20 = v230 + a0[2];
        v21 = v224 + a0[3];
        v240 = a0[6];
        v241 = a0[7];
        v22 = v218 + v239 + a0[4];
        v23 = v235 + a0[5];
        v26 = *(unsigned int *)&v0;
        *a0 = v18;
        a0[1] = v19;
        v24 = v229 + v240;
        v27 = 0;
        a0[2] = v20;
        a0[3] = v21;
        v25 = v223 + v241;
        a0[4] = v22;
        a0[5] = v23;
        v28 = (unsigned int)v19 ^ (unsigned int)v20;
        a0[6] = v24;
        a0[7] = v25;
        v29 = 0;
        v17 = &v0;
        v242 = arm64g_calculate_condition(20, v11, v7, 0);
        v11 = v217;
    } while (v242 & 1);
    return a0;
}
