/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa06334..0xa06d48 (2580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_d37300;
extern char g_10002b0;

int sub_a06334(long long a0, unsigned long a1, char *a2)
{
    uint256_t v49;  // x10
    unsigned int v50;  // w23
    unsigned long v59;  // x2
    __m128i v149;  // q3
    __m128i v151;  // q0
    unsigned long long v153;  // x9
    __m128i v154;  // q0
    __m128i v156;  // q0
    __m128i v157;  // q2
    unsigned long long v158;  // x8
    unsigned long v60;  // x9
    __m128i v159;  // q1
    __m128i v161;  // q4
    unsigned long long v162;  // x8
    unsigned long long v163;  // x9
    __m128i v164;  // q2
    __m128i v165;  // q0
    unsigned long v166;  // x11
    unsigned long long v167;  // x12
    unsigned long long v168;  // x10
    unsigned long long v61;  // x11
    __m128i v169;  // q3
    __m128i v171;  // q0
    unsigned long long v173;  // x8
    __m128i v174;  // q0
    __m128i v176;  // q0
    __m128i v177;  // q2
    unsigned long long v178;  // x8
    unsigned long v62;  // x3
    __m128i v179;  // q1
    __m128i v181;  // q4
    unsigned long long v182;  // 4122
    uint128_t v183;  // q0
    uint128_t v184;  // q2
    uint128_t v185;  // q3
    uint128_t v186;  // q4
    uint128_t v187;  // q5
    uint128_t v188;  // q5
    unsigned long v63;  // x10
    uint128_t v189;  // q2
    uint128_t v190;  // q3
    uint128_t v191;  // q4
    uint128_t v192;  // q5
    uint128_t v193;  // q5
    uint128_t v194;  // q2
    uint128_t v195;  // q3
    uint128_t v196;  // q4
    uint128_t v197;  // q5
    uint128_t v198;  // q5
    unsigned long long v64;  // x17
    uint128_t v199;  // q2
    uint256_t v200;  // q3
    uint256_t v201;  // q4
    uint128_t v202;  // q5
    uint128_t v203;  // q0
    unsigned int v204;  // w0
    unsigned long v65;  // x5
    unsigned long v66;  // x11
    unsigned long long v67;  // x12
    unsigned long v68;  // x6
    char v51;  // x8
    unsigned long v69;  // x12
    unsigned long v70;  // x13
    unsigned long v71;  // x16
    unsigned long v72;  // x17
    unsigned long v73;  // x0
    unsigned long long v74;  // x1
    unsigned long v75;  // x27
    unsigned long long v76;  // x13
    unsigned long long v77;  // x17
    unsigned long v78;  // x28
    unsigned long v52;  // x10
    unsigned long v79;  // x16
    unsigned long long v80;  // x20
    unsigned long long v81;  // x22
    unsigned long v82;  // x19
    unsigned long v83;  // x17
    unsigned long long v84;  // x1
    unsigned long v85;  // x26
    unsigned long long v86;  // x1
    unsigned long v87;  // x0
    unsigned long long v88;  // x20
    unsigned long v53;  // x4
    unsigned long long v89;  // x14
    unsigned long long v90;  // x22
    unsigned long long v91;  // x14
    unsigned long long v92;  // x7
    uint128_t v93;  // q6
    uint128_t v94;  // q4
    uint128_t v95;  // q1
    uint128_t v96;  // q0
    uint128_t v97;  // q2
    __m128i v98;  // q16
    unsigned long long v54;  // x9
    uint128_t v99;  // q5
    unsigned long long v100;  // x2
    unsigned long long v101;  // x5
    unsigned long long v102;  // x2
    unsigned long long v103;  // x3
    unsigned long long v104;  // x6
    uint128_t v105;  // q7
    __m128i v106;  // q4
    uint128_t v107;  // q3
    uint128_t v108;  // q6
    unsigned long v55;  // x15
    __m128i v109;  // q18
    unsigned long long v111;  // x4
    __m128i v112;  // q16
    __m128i v114;  // q18
    unsigned long long v115;  // x15
    unsigned long v117;  // d20
    unsigned long long v118;  // x9
    unsigned long v56;  // x8
    unsigned long long v119;  // x11
    unsigned long long v120;  // x10
    unsigned long long v121;  // x9
    unsigned long long v122;  // x11
    unsigned long long v123;  // x8
    __m128i v125;  // q4
    __m128i v127;  // q0
    unsigned long long v128;  // x11
    unsigned long long v57;  // x9
    __m128i v129;  // q1
    __m128i v130;  // q2
    __m128i v132;  // q6
    unsigned long long v133;  // x9
    __m128i v134;  // q0
    __m128i v136;  // q0
    __m128i v137;  // q2
    unsigned long long v138;  // x8
    unsigned long v58;  // x14
    __m128i v139;  // q1
    __m128i v141;  // q4
    unsigned long long v142;  // x8
    unsigned long long v143;  // x9
    __m128i v144;  // q2
    __m128i v145;  // q0
    unsigned long long v146;  // x12
    unsigned long long v147;  // x11
    unsigned long long v148;  // x10
    uint256_t v0;  // [bp-0x2d8]
    __m128i v1;  // [bp-0x2d0]
    unsigned long v2;  // [bp-0x2c0]
    __m128i v3;  // [bp-0x2b8]
    unsigned long long v4;  // [bp-0x2a8]
    unsigned long v5;  // [bp-0x2a0], Other Possible Types: unsigned long long
    unsigned long long v6;  // [bp-0x298]
    uint128_t v7;  // [bp-0x290], Other Possible Types: unsigned long long
    unsigned long long v8;  // [bp-0x288]
    __m128i v9;  // [bp-0x280], Other Possible Types: uint320_t
    unsigned long long v10;  // [bp-0x270]
    __m128i v11;  // [bp-0x268]
    uint192_t v12;  // [bp-0x258], Other Possible Types: unsigned long long
    __m128i v13;  // [bp-0x250]
    uint128_t v14;  // [bp-0x240], Other Possible Types: uint256_t, uint256_t
    __m128i v15;  // [bp-0x230]
    uint128_t v16;  // [bp-0x220], Other Possible Types: uint256_t
    unsigned long long v17;  // [bp-0x220]
    __m128i v18;  // [bp-0x218]
    uint128_t v19;  // [bp-0x210], Other Possible Types: uint256_t
    unsigned long long v20;  // [bp-0x208]
    uint128_t v21;  // [bp-0x200], Other Possible Types: uint256_t, uint256_t
    uint128_t v22;  // [bp-0x1f0]
    uint128_t v23;  // [bp-0x1e0], Other Possible Types: uint256_t, uint256_t
    uint128_t v24;  // [bp-0x1d0]
    __m128i v25;  // [bp-0x1c0], Other Possible Types: uint512_t, uint512_t, unsigned long
    __m128i v26;  // [bp-0x1b8]
    uint128_t v27;  // [bp-0x1b0], Other Possible Types: unsigned long long
    uint128_t v28;  // [bp-0x1a8], Other Possible Types: unsigned long long
    uint128_t v29;  // [bp-0x1a0], Other Possible Types: uint128_t, unsigned long long
    unsigned long long v30;  // [bp-0x198]
    __m128i v31;  // [bp-0x190], Other Possible Types: unsigned long long
    unsigned long long v32;  // [bp-0x188]
    uint128_t v33;  // [bp-0x180], Other Possible Types: uint256_t, uint256_t
    uint128_t v34;  // [bp-0x170]
    uint128_t v35;  // [bp-0x160], Other Possible Types: uint256_t, uint256_t
    uint128_t v36;  // [bp-0x150]
    char v37;  // [bp-0x140]
    uint128_t v38;  // [bp-0x130]
    uint128_t v39;  // [bp-0x120]
    uint128_t v40;  // [bp-0x110]
    uint128_t v41;  // [bp-0x100]
    uint128_t v42;  // [bp-0xf0]
    uint128_t v43;  // [bp-0xe0]
    __m128i v44;  // [bp-0xd0]
    char v45;  // [bp-0xc0]
    unsigned long v46;  // [bp-0x78]
    char *v47;  // [bp-0x10]
    char v48;  // [bp+0x0]

    v47 = &v48;
    v46 = *(long long *)&g_10002b0;
    sub_a08a54(&v37);
    v49 = 0;
    v33 = 1;
    v35 = 0;
    *(uint128_t *)&v25 = 0;
    *(uint128_t *)&(&v25)[1] = 0;
    *(uint128_t *)&(&v25)[2] = 0;
    *(uint128_t *)&(&v25)[3] = 0;
    v23 = CONCAT(v40, v39);
    v21 = CONCAT(v38, v37);
    v16 = 0;
    v19 = 0;
    v50 = 447;
    v14 = 1;
    v1 = _mm_set1_epi64x(0x1fffffffffffffe);
    do
    {
        v51 = a2[v50 >> 3];
        if (v50 == 447)
            v51 = 0xff;
        if (v50 < 8)
            v51 = a2[v50 >> 3] & 252;
        v52 = v33;
        v0 = -(v51 >> ((char)v50 & 7 & 31) & 1);
        v53 = v49 ^ v0;
        v54 = ((unsigned long long)v21 ^ v52) & v53;
        v55 = v54 ^ v52;
        v56 = v54 ^ (unsigned long long)v21;
        v57 = (*(unsigned long long *)((void*)&v21 + 24) ^ *(unsigned long long *)((void*)&v33 + 24)) & v53;
        v58 = *(unsigned long long *)((void*)&v23 + 8);
        v59 = v57 ^ *(unsigned long long *)((void*)&v33 + 24);
        v60 = v57 ^ *(unsigned long long *)((void*)&v21 + 24);
        v61 = ((unsigned long long)v23 ^ (unsigned long long)v35) & v53;
        v62 = v61 ^ (unsigned long long)v35;
        v63 = v61 ^ (unsigned long long)v23;
        v64 = (*(unsigned long long *)((void*)&v23 + 16) ^ *(unsigned long long *)((void*)&v35 + 16)) & v53;
        v65 = v64 ^ *(unsigned long long *)((void*)&v35 + 16);
        v66 = v64 ^ *(unsigned long long *)((void*)&v23 + 16);
        v67 = (*(unsigned long long *)((void*)&v23 + 24) ^ *(unsigned long long *)((void*)&v35 + 24)) & v53;
        v68 = v67 ^ *(unsigned long long *)((void*)&v35 + 24);
        v69 = v67 ^ *(unsigned long long *)((void*)&v23 + 24);
        v70 = *(unsigned long long *)((void*)&v25 + 32);
        v71 = *(unsigned long long *)((void*)&v25 + 40);
        v72 = v16;
        v73 = *(unsigned long long *)((void*)&v16 + 8);
        v74 = (v72 ^ v70) & v53;
        *(unsigned long *)&v35 = v62;
        v75 = v74 ^ v70;
        v76 = v74 ^ v72;
        v77 = (v73 ^ v71) & v53;
        v78 = v77 ^ v71;
        v79 = v77 ^ v73;
        v80 = (v58 ^ *(unsigned long long *)((void*)&v35 + 8)) & v53;
        v81 = ((unsigned long long)v19 ^ *(unsigned long long *)((void*)&v25 + 48)) & v53;
        x30 = v81 ^ *(unsigned long long *)((void*)&v25 + 48);
        v82 = v80 ^ *(unsigned long long *)((void*)&v35 + 8);
        v83 = v81 ^ (unsigned long long)v19;
        v84 = (*(unsigned long long *)((void*)&v19 + 8) ^ *(unsigned long long *)((void*)&v25 + 56)) & v53;
        v85 = v84 ^ *(unsigned long long *)((void*)&v25 + 56);
        v86 = v84 ^ *(unsigned long long *)((void*)&v19 + 8);
        v87 = v80 ^ v58;
        v88 = x30 + v65;
        v89 = v85 + v68;
        v12 = _INSERT(CONCAT(v12, 0), 16, (v89 & 0xffffffffffffff) + (v88 >> 56));
        v90 = v78 + v82;
        v91 = v89 >> 56;
        v92 = v75 + v62 + v91;
        *(unsigned long long *)&v12 = (v90 & 0xffffffffffffff) + (v92 >> 56);
        *(unsigned long long *)((char *)&v12 + 8) = (v88 & 0xffffffffffffff) + (v90 >> 56);
        v93 = CONCAT(v53, v53);
        v94 = *(uint128_t *)&v25;
        v95 = v14;
        v96 = *(uint128_t *)((void*)&v14 + 16);
        v97 = (*(uint128_t *)((void*)&v25 + 16) ^ v96) & v93;
        v98 = _mm_xor_si128(*(uint128_t *)((void*)&v25 + 16), v97);
        v99 = v96 ^ v97;
        v15 = (__m128i)_INSERT(*(uint128_t *)((void*)&v14 + 8), 8, *(unsigned long long *)((void*)&v99 + 8));
        *(unsigned long *)((char *)&v33 + 24) = v59;
        *(unsigned long *)((char *)&v35 + 16) = v65;
        *(unsigned long *)((char *)&v35 + 24) = v68;
        *(unsigned long *)((char *)&v35 + 8) = v82;
        v100 = v68 - v85 + 0x1fffffffffffffe;
        v101 = v65 - x30 + 0x1fffffffffffffe;
        v8 = (v100 & 0xffffffffffffff) + (v101 >> 56);
        v102 = v100 >> 56;
        v103 = v62 - v75 + 0x1fffffffffffffc + v102;
        v104 = v82 - v78 + 0x1fffffffffffffe;
        v6 = (v104 & 0xffffffffffffff) + (v103 >> 56);
        v7 = (v101 & 0xffffffffffffff) + (v104 >> 56);
        *(unsigned long *)&v33 = v55;
        v105 = (v94 ^ v95) & v93;
        v106 = _mm_xor_si128(v94, v105);
        v107 = *(uint128_t *)((void*)&v21 + 8);
        v108 = (*(uint128_t *)((void*)&v33 + 8) ^ v107) & v93;
        v109 = _mm_xor_si128(*(uint128_t *)((void*)&v33 + 8), v108);
        *(long long *)((char *)&v33 + 16) = _mm_extract_epi64(v109, 1);
        *(long long *)((char *)&v33 + 8) = _mm_cvtsi128_si64(v109);
        v111 = v59 - _mm_extract_epi64(v98, 1) + 0x1fffffffffffffe;
        v112 = _mm_add_epi64(v98, *(uint128_t *)((void*)&v33 + 16));
        v114 = _mm_add_epi64(_mm_sub_epi64(v109, __dirty_unsupported_Iop_SliceV128(v98, v106, 8)), v1);
        v4 = (v111 & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v114, 1)) >> 56);
        v5 = (v103 & 0xffffffffffffff) + (v111 >> 56);
        v115 = v55 - _mm_cvtsi128_si64(v106) + 0x1fffffffffffffe;
        v117 = (unsigned long long)v95 ^ (unsigned long long)v105;
        v2 = v102 + (v115 & 0xffffffffffffff);
        v20 = v86;
        *(unsigned long *)&v21 = v56;
        *(unsigned long *)((char *)&v21 + 24) = v60;
        *(unsigned long *)&v23 = v63;
        *(unsigned long *)((char *)&v23 + 16) = v66;
        *(unsigned long *)((char *)&v23 + 24) = v69;
        v17 = v76;
        v18 = (__m128i)_INSERT(v16, 0, v79);
        *(unsigned long *)((char *)&v23 + 8) = v87;
        *(unsigned long *)((char *)&v18 + 8) = v83;
        v118 = v69 - v86 + 0x1fffffffffffffe;
        v119 = v66 - v83 + 0x1fffffffffffffe;
        v120 = v87 - v79 + 0x1fffffffffffffe;
        v31 = (__m128i)((v119 & 0xffffffffffffff) + (v120 >> 56));
        v32 = (v118 & 0xffffffffffffff) + (v119 >> 56);
        v121 = v118 >> 56;
        v122 = v63 - v76 + 0x1fffffffffffffc + v121;
        v123 = v60 - *(unsigned long long *)((void*)&v99 + 8) + 0x1fffffffffffffe;
        v29 = (v122 & 0xffffffffffffff) + (v123 >> 56);
        v30 = (v120 & 0xffffffffffffff) + (v122 >> 56);
        v125 = _mm_add_epi64(v106, v33);
        v127 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(v96, v95, 8), __dirty_unsupported_Iop_SliceV128(v97, v105, 8));
        *(long long *)&v15 = _mm_extract_epi64(v127, 1);
        v128 = v56 - __double_as_longlong(v117) + 0x1fffffffffffffe;
        v129 = _mm_xor_si128(v107, v108);
        v130 = _mm_add_epi64(_mm_sub_epi64(v129, v127), v1);
        v28 = (v123 & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v130, 1)) >> 56);
        v25 = (__m128i)(v121 + (v128 & 0xffffffffffffff));
        v9 = (__m128i)_INSERT(CONCAT(v9, 0), 0, (_mm_cvtsi128_si64(v125) & 0xffffffffffffff) + v91);
        v132 = _mm_set1_epi64x(0xffffffffffffff);
        *(__m128i *)((char *)&v9 + 8) = _mm_add_epi64(_mm_and_si128(_mm_unpacklo_epi64(_mm_unpackhi_epi64(v125, v125), v112), v132), _mm_srli_epi64(v125, 56));
        v14 = CONCAT(_mm_cvtsi128_si64(v127), v117);
        v3 = _mm_add_epi64(_mm_and_si128(v114, v132), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v114, v114), 0, __longlong_as_double(v115)), 56));
        *(__m128i *)((char *)&v21 + 8) = v129;
        v26 = _mm_add_epi64(_mm_and_si128(v130, v132), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v130, v130), 0, __longlong_as_double(v128)), 56));
        *(__m128i *)((char *)&(&v9)[1] + 8) = _mm_add_epi64(_mm_and_si128(_INSERT(_mm_unpackhi_epi64(v112, v112), 8, v92), v132), _mm_srli_epi64(v112, 56));
        sub_a04850(&v33, &v9, &v25);
        v133 = *(unsigned long long *)((void*)&v23 + 24) + v20;
        v134 = _mm_add_epi64(*(uint128_t *)((void*)&v23 + 8), v18);
        v31 = _mm_add_epi64(_mm_and_si128(_INSERT(_mm_unpackhi_epi64(v134, v134), 8, v133), _mm_set1_epi64x(0xffffffffffffff)), _mm_srli_epi64(v134, 56));
        v136 = _mm_add_epi64(v21, v14);
        v137 = (__m128i)_INSERT(_mm_unpacklo_epi64(v136, v136), 0, __longlong_as_double(v133));
        v138 = (unsigned long long)v23 + v17 + ((unsigned long long)(_mm_cvtsi128_si64(v137)) >> 56);
        v139 = _mm_add_epi64(*(uint128_t *)((void*)&v21 + 16), v15);
        v141 = _mm_set1_epi64x(0xffffffffffffff);
        v28 = _mm_add_epi64(_mm_and_si128(_INSERT(_mm_unpackhi_epi64(v139, v139), 8, v138), v141), _mm_srli_epi64(v139, 56));
        v30 = (_mm_cvtsi128_si64(v134) & 0xffffffffffffff) + (v138 >> 56);
        v27 = (_mm_cvtsi128_si64(v139) & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v136, 1)) >> 56);
        v25 = _mm_add_epi64(_mm_and_si128(v136, v141), _mm_srli_epi64(v137, 56));
        sub_a04850(&v21, &v2, &v25);
        v142 = (unsigned long long)v33 - (unsigned long long)v21 + 0x1fffffffffffffe;
        v143 = *(unsigned long long *)((void*)&v33 + 24) - *(unsigned long long *)((void*)&v21 + 24) + 0x1fffffffffffffe;
        v144 = v1;
        v145 = _mm_add_epi64(_mm_sub_epi64(*(uint128_t *)((void*)&v35 + 16), *(uint128_t *)((void*)&v23 + 16)), v144);
        v146 = (unsigned long long)(_mm_extract_epi64(v145, 1)) >> 56;
        v147 = *(unsigned long long *)((void*)&v35 + 8) - *(unsigned long long *)((void*)&v23 + 8) + 0x1fffffffffffffe;
        v148 = (unsigned long long)v35 - (unsigned long long)v23 + 0x1fffffffffffffc + v146;
        v149 = _mm_set1_epi64x(0xffffffffffffff);
        v19 = (uint256_t)_mm_add_epi64(_mm_and_si128(v145, v149), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v145, v145), 0, __longlong_as_double(v147)), 56));
        v16 = CONCAT((v147 & 0xffffffffffffff) + (v148 >> 56), (v148 & 0xffffffffffffff) + (v143 >> 56));
        v151 = _mm_add_epi64(_mm_sub_epi64(*(uint128_t *)((void*)&v33 + 8), *(uint128_t *)((void*)&v21 + 8)), v144);
        v14 = _INSERT(CONCAT(v14, 0), 8, _mm_add_epi64(_mm_and_si128(v151, v149), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v151, v151), 0, __longlong_as_double(v142)), 56)));
        *(unsigned long long *)((char *)&v14 + 24) = (v143 & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v151, 1)) >> 56);
        *(unsigned long long *)&v14 = v146 + (v142 & 0xffffffffffffff);
        sub_a04c64(&v25, &v14);
        sub_a04850(&v14, &v37, &v25);
        v153 = *(unsigned long long *)((void*)&v23 + 24) + *(unsigned long long *)((void*)&v35 + 24);
        v154 = _mm_add_epi64(*(uint128_t *)((void*)&v23 + 8), *(uint128_t *)((void*)&v35 + 8));
        v25 = (__m128i)_INSERT(CONCAT(v25, 0), 48, _mm_add_epi64(_mm_and_si128(_INSERT(_mm_unpackhi_epi64(v154, v154), 8, v153), _mm_set1_epi64x(0xffffffffffffff)), _mm_srli_epi64(v154, 56)));
        v156 = _mm_add_epi64(v21, v33);
        v157 = (__m128i)_INSERT(_mm_unpacklo_epi64(v156, v156), 0, __longlong_as_double(v153));
        v158 = (unsigned long long)v23 + (unsigned long long)v35 + ((unsigned long long)(_mm_cvtsi128_si64(v157)) >> 56);
        v159 = _mm_add_epi64(*(uint128_t *)((void*)&v21 + 16), *(uint128_t *)((void*)&v33 + 16));
        v161 = _mm_set1_epi64x(0xffffffffffffff);
        *(__m128i *)((char *)&(&v25)[1] + 8) = _mm_add_epi64(_mm_and_si128(_INSERT(_mm_unpackhi_epi64(v159, v159), 8, v158), v161), _mm_srli_epi64(v159, 56));
        *(unsigned long long *)((char *)&(&v25)[2] + 8) = (_mm_cvtsi128_si64(v154) & 0xffffffffffffff) + (v158 >> 56);
        *(unsigned long long *)&(&v25)[1] = (_mm_cvtsi128_si64(v159) & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v156, 1)) >> 56);
        v25 = _mm_add_epi64(_mm_and_si128(v156, v161), _mm_srli_epi64(v157, 56));
        sub_a04c64(&v21, &v25);
        sub_a04c64(&v25, &v9);
        sub_a04c64(&v9, &v2);
        sub_a04850(&v33, &v25, &v9);
        v162 = *(unsigned long long *)&v25 - *(unsigned long long *)&v9 + 0x1fffffffffffffe;
        v163 = *(unsigned long long *)((void*)&v25 + 24) - *(unsigned long long *)((void*)&v9 + 24) + 0x1fffffffffffffe;
        v164 = v1;
        v165 = _mm_add_epi64(_mm_sub_epi64(*(uint128_t *)((void*)&v25 + 48), *(uint128_t *)((void*)&v12 + 8)), v164);
        v166 = (unsigned long long)(_mm_extract_epi64(v165, 1)) >> 56;
        v167 = *(unsigned long long *)((void*)&v25 + 40) - *(unsigned long long *)&v12 + 0x1fffffffffffffe;
        v168 = *(unsigned long long *)((void*)&v25 + 32) - *(unsigned long long *)((void*)&v9 + 32) + 0x1fffffffffffffc + v166;
        v169 = _mm_set1_epi64x(0xffffffffffffff);
        v7 = _mm_add_epi64(_mm_and_si128(v165, v169), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v165, v165), 0, __longlong_as_double(v167)), 56));
        v171 = _mm_add_epi64(_mm_sub_epi64(*(uint128_t *)((void*)&v25 + 8), *(uint128_t *)((void*)&v9 + 8)), v164);
        v5 = (v168 & 0xffffffffffffff) + (v163 >> 56);
        v6 = (v167 & 0xffffffffffffff) + (v168 >> 56);
        v4 = (v163 & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v171, 1)) >> 56);
        v3 = _mm_add_epi64(_mm_and_si128(v171, v169), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v171, v171), 0, __longlong_as_double(v162)), 56));
        v2 = v166 + (v162 & 0xffffffffffffff);
        sub_a04b70(&v9, &v2, 0x98a9);
        v173 = *(unsigned long long *)((void*)&v25 + 56) + *(unsigned long long *)((void*)&v12 + 16);
        v174 = _mm_add_epi64(*(uint128_t *)((void*)&v25 + 40), *(uint128_t *)&v12);
        v13 = _mm_add_epi64(_mm_and_si128(_INSERT(_mm_unpackhi_epi64(v174, v174), 8, v173), _mm_set1_epi64x(0xffffffffffffff)), _mm_srli_epi64(v174, 56));
        v176 = _mm_add_epi64(*(uint128_t *)&v25, *(uint128_t *)&v9);
        v177 = (__m128i)_INSERT(_mm_unpacklo_epi64(v176, v176), 0, __longlong_as_double(v173));
        v178 = *(unsigned long long *)((void*)&v25 + 32) + *(unsigned long long *)((void*)&v9 + 32) + ((unsigned long long)(_mm_cvtsi128_si64(v177)) >> 56);
        v12 = (_mm_cvtsi128_si64(v174) & 0xffffffffffffff) + (v178 >> 56);
        v179 = _mm_add_epi64(*(uint128_t *)((void*)&v25 + 16), *(uint128_t *)((void*)&v9 + 16));
        v181 = _mm_set1_epi64x(0xffffffffffffff);
        v11 = _mm_add_epi64(_mm_and_si128(_INSERT(_mm_unpackhi_epi64(v179, v179), 8, v178), v181), _mm_srli_epi64(v179, 56));
        v10 = (_mm_cvtsi128_si64(v179) & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v176, 1)) >> 56);
        v9 = _mm_add_epi64(_mm_and_si128(v176, v181), _mm_srli_epi64(v177, 56));
        sub_a04850(&v25, &v2, &v9);
        v49 = v0;
        v50 -= 1;
        v182 = arm64g_calculate_condition(0x11, v50, 1, 0);
    } while (v182 & 1);
    v183 = CONCAT(v49, v49);
    v184 = *(uint128_t *)((void*)&v33 + 16);
    v185 = v21;
    v186 = *(uint128_t *)((void*)&v21 + 16);
    v187 = ((uint128_t)v33 ^ v185) & v183;
    v188 = (v184 ^ v186) & v183;
    v33 = (uint128_t)v33 ^ v187;
    v34 = v184 ^ v188;
    v21 = v185 ^ v187;
    v22 = v186 ^ v188;
    v189 = *(uint128_t *)((void*)&v35 + 16);
    v190 = v23;
    v191 = *(uint128_t *)((void*)&v23 + 16);
    v192 = ((uint128_t)v35 ^ v190) & v183;
    v193 = (v189 ^ v191) & v183;
    v35 = (uint128_t)v35 ^ v192;
    v36 = v189 ^ v193;
    v23 = v190 ^ v192;
    v24 = v191 ^ v193;
    v194 = *(uint128_t *)((void*)&v25 + 16);
    v195 = v14;
    v196 = *(uint128_t *)((void*)&v14 + 16);
    v197 = (*(uint128_t *)&v25 ^ v195) & v183;
    v198 = (v194 ^ v196) & v183;
    *(uint128_t *)&v25 = *(uint128_t *)&v25 ^ v197;
    *(uint128_t *)&(&v25)[1] = v194 ^ v198;
    v14 = v195 ^ v197;
    v15 = _mm_xor_si128(v196, v198);
    v199 = *(uint128_t *)((void*)&v25 + 48);
    v200 = v16;
    v201 = v19;
    v202 = (*(uint128_t *)((void*)&v25 + 32) ^ v200) & v183;
    v203 = (v199 ^ v201) & v183;
    v29 = *(uint128_t *)((void*)&v25 + 32) ^ v202;
    v31 = _mm_xor_si128(v199, v203);
    v16 = v200 ^ v202;
    v19 = v201 ^ v203;
    sub_a04c64(&v45, &v25);
    sub_a08f10(&v41, &v45);
    sub_a04c64(&v45, &v41);
    sub_a04850(&v41, &v45, &v25);
    v25 = v41;
    v27 = v42;
    v29 = v43;
    v31 = v44;
    sub_a04850(&v37, &v33, &v25);
    sub_a08514(a0, &v37, 1);
    v204 = sub_a08e88(&v37, &g_d37300);
    sub_a66ec0(&v37, 64);
    sub_a66ec0(&v33, 64);
    sub_a66ec0(&v25, 64);
    sub_a66ec0(&v21, 64);
    sub_a66ec0(&v14, 64);
    sub_a66ec0(&v9, 64);
    sub_a66ec0(&v2, 64);
    if (*(long long *)&g_10002b0 == v46)
        return ~v204;
    ___stack_chk_fail();
}
