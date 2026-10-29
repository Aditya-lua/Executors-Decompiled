/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad2900..0xad35e0 (3296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

double sub_ad2900(uint128_t *k, uint128_t *iter, unsigned long long a2, unsigned int *a3, uint128_t *a4, unsigned int a5)
{
    unsigned int v11;  // w2
    __m128i v12;  // q3
    unsigned int v20;  // w11
    __m128i v110;  // q2
    __m128i v111;  // 4352
    unsigned int v112;  // w7
    __m128i v113;  // q3
    __m128i v114;  // q0
    __m128i v115;  // q0
    __m128i v116;  // q2
    __m128i v117;  // 4519
    unsigned int v118;  // w7
    __m128i v119;  // q0
    unsigned int v21;  // w12
    __m128i v120;  // q0
    __m128i v121;  // q2
    uint128_t v122;  // 4682
    unsigned int v123;  // w7
    uint128_t v125;  // q6
    uint128_t v126;  // q6
    uint128_t v127;  // q6
    uint128_t v128;  // q5
    uint128_t v129;  // q7
    unsigned int v22;  // w13
    unsigned int v130;  // w11
    unsigned int v131;  // w12
    unsigned int v132;  // w13
    unsigned int v133;  // w14
    unsigned int v134;  // w15
    unsigned int *v135;  // x10
    unsigned int v136;  // w11
    unsigned int *v137;  // x10
    __m128i v138;  // q3
    __m128i v139;  // q0
    unsigned int v23;  // w14
    __m128i v140;  // q0
    __m128i v141;  // q2
    __m128i v142;  // 4189
    unsigned int v143;  // w7
    __m128i v144;  // q3
    __m128i v145;  // q0
    __m128i v146;  // q0
    __m128i v147;  // q2
    __m128i v148;  // 4352
    unsigned int v149;  // w7
    unsigned int v24;  // w15
    __m128i v150;  // q3
    __m128i v151;  // q0
    __m128i v152;  // q0
    __m128i v153;  // q2
    __m128i v154;  // 4519
    unsigned int v155;  // w7
    __m128i v156;  // q0
    __m128i v157;  // q0
    __m128i v158;  // q2
    uint128_t v159;  // 4682
    unsigned int *v25;  // x10
    uint128_t v161;  // q7
    uint128_t v162;  // q7
    uint128_t v163;  // q7
    uint128_t v164;  // q6
    __m128i v165;  // q7
    __m128i v168;  // q3
    unsigned int v169;  // w11
    unsigned int v26;  // w11
    unsigned int v170;  // w12
    unsigned int v171;  // w13
    unsigned int v172;  // w14
    unsigned int v173;  // w15
    unsigned int *v174;  // x10
    unsigned int v175;  // w11
    unsigned int *v176;  // x10
    __m128i v177;  // q3
    __m128i v178;  // q0
    __m128i v179;  // q0
    unsigned int *v27;  // x10
    __m128i v180;  // q2
    __m128i v181;  // 4189
    unsigned int v182;  // w7
    __m128i v183;  // q3
    __m128i v184;  // q0
    __m128i v185;  // q0
    __m128i v186;  // q2
    __m128i v187;  // 4352
    unsigned int v188;  // w7
    __m128i v189;  // q3
    __m128i v28;  // q3
    __m128i v190;  // q0
    __m128i v191;  // q0
    __m128i v192;  // q2
    __m128i v193;  // 4519
    unsigned int v194;  // w7
    __m128i v195;  // q0
    __m128i v196;  // q0
    __m128i v197;  // q2
    __m128i v198;  // 4682
    __m128i v29;  // q0
    uint128_t v200;  // q3
    uint128_t v201;  // q3
    uint128_t v202;  // q3
    unsigned long long v203;  // d8
    unsigned long long v204;  // d9
    unsigned long long v205;  // d10
    unsigned long long v206;  // d11
    unsigned long long v207;  // d12
    unsigned long long v208;  // d13
    unsigned long long v209;  // d14
    __m128i v30;  // q0
    unsigned long long v210;  // d15
    unsigned long long v211;  // x30
    __m128i v212;  // q3
    __m128i v213;  // q1
    __m128i v214;  // q2
    unsigned int j;  // w2
    __m128i v216;  // 4133
    __m128i v31;  // q2
    __m128i v217;  // 4135
    __m128i v218;  // 4137
    __m128i v219;  // 4139
    __m128i v220;  // q4
    __m128i v221;  // q5
    __m128i v222;  // q6
    __m128i v223;  // q7
    uint128_t *v224;  // x0
    __m128i v225;  // q8
    __m128i v226;  // q9
    __m128i v32;  // 4189
    __m128i v227;  // q10
    __m128i v228;  // q11
    __m128i v229;  // q8
    __m128i v230;  // q9
    __m128i v231;  // q10
    __m128i v232;  // q11
    __m128i v233;  // q11
    uint128_t *v234;  // x0
    __m128i v235;  // q14
    __m128i v236;  // q13
    unsigned int v33;  // w7
    __m128i v237;  // q12
    uint128_t *v238;  // x1
    unsigned long long v239;  // 4102
    __m128i v240;  // q15
    unsigned int v241;  // w2
    uint128_t *v242;  // x0
    __m128i v243;  // q8
    __m128i v244;  // q9
    __m128i v245;  // q10
    __m128i v246;  // q11
    __m128i v34;  // q3
    unsigned long long v247;  // 4102
    uint128_t v248;  // q4
    uint128_t v249;  // q8
    unsigned int v250;  // w11
    unsigned int v251;  // w12
    unsigned int v252;  // w13
    unsigned int v253;  // w14
    unsigned int v254;  // w15
    unsigned int v255;  // w11
    unsigned int *v256;  // x10
    __m128i v35;  // q0
    __m128i v257;  // q3
    __m128i v258;  // q0
    __m128i v259;  // q0
    __m128i v260;  // q2
    __m128i v261;  // 4189
    unsigned int v262;  // w7
    __m128i v263;  // q3
    __m128i v264;  // q0
    __m128i v265;  // q0
    __m128i v266;  // q2
    __m128i v36;  // q0
    __m128i v267;  // 4352
    unsigned int v268;  // w7
    __m128i v269;  // q3
    __m128i v270;  // q0
    __m128i v271;  // q0
    __m128i v272;  // q2
    __m128i v273;  // 4519
    unsigned int v274;  // w7
    __m128i v275;  // q0
    __m128i v276;  // q0
    __m128i v37;  // q2
    __m128i v277;  // q2
    __m128i v278;  // 4682
    uint128_t v280;  // q8
    uint128_t v281;  // q8
    uint128_t v282;  // q8
    __m128i v283;  // q8
    uint128_t *v284;  // x0
    uint128_t v285;  // q5
    __m128i v286;  // q8
    __m128i v38;  // 4352
    __m128i v287;  // q10
    uint128_t *v288;  // x0
    uint128_t v289;  // q6
    __m128i v290;  // q4
    __m128i v291;  // q8
    __m128i v292;  // q10
    __m128i v293;  // q0
    unsigned int v39;  // w7
    __m128i v13;  // q0
    __m128i v40;  // q3
    __m128i v41;  // q0
    __m128i v42;  // q0
    __m128i v43;  // q2
    __m128i v44;  // 4519
    unsigned int v45;  // w7
    __m128i v46;  // q0
    __m128i v47;  // q0
    __m128i v48;  // q2
    uint128_t v49;  // 4682
    unsigned int i;  // w2
    unsigned int v50;  // w7
    uint128_t v52;  // q4
    uint128_t v53;  // q4
    uint128_t v54;  // q4
    uint128_t v55;  // q5
    unsigned int v56;  // w11
    unsigned int v57;  // w12
    unsigned int v58;  // w13
    unsigned int v59;  // w14
    unsigned int v60;  // w15
    unsigned int *v61;  // x10
    unsigned int v62;  // w11
    unsigned int *v63;  // x10
    __m128i v64;  // q3
    __m128i v65;  // q0
    __m128i v66;  // q0
    __m128i v67;  // q2
    __m128i v68;  // 4189
    unsigned int v69;  // w7
    uint128_t v16;  // q5
    __m128i v70;  // q3
    __m128i v71;  // q0
    __m128i v72;  // q0
    __m128i v73;  // q2
    __m128i v74;  // 4352
    unsigned int v75;  // w7
    __m128i v76;  // q3
    __m128i v77;  // q0
    __m128i v78;  // q0
    __m128i v79;  // q2
    uint128_t v17;  // q4
    __m128i v80;  // 4519
    unsigned int v81;  // w7
    __m128i v82;  // q0
    __m128i v83;  // q0
    __m128i v84;  // q2
    uint128_t v85;  // 4682
    unsigned int v86;  // w7
    uint128_t v88;  // q5
    uint128_t v89;  // q5
    uint128_t v18;  // q6
    uint128_t v90;  // q5
    uint128_t v91;  // q4
    uint128_t v92;  // q6
    unsigned int v93;  // w11
    unsigned int v94;  // w12
    unsigned int v95;  // w13
    unsigned int v96;  // w14
    unsigned int v97;  // w15
    unsigned int *v98;  // x10
    unsigned int v99;  // w11
    uint128_t v19;  // q7
    unsigned int *v100;  // x10
    __m128i v101;  // q3
    __m128i v102;  // q0
    __m128i v103;  // q0
    __m128i v104;  // q2
    __m128i v105;  // 4189
    unsigned int v106;  // w7
    __m128i v107;  // q3
    __m128i v108;  // q0
    __m128i v109;  // q0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v11 = a2 >> 4;
    if (a5)
    {
        v12 = *a4;
        do
        {
            if ((int)i < 4)
            {
                for (i = v11; (int)i >= 1; k += 1)
                {
                    v168 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(*k, v12));
                    v169 = 8;
                    v170 = _mm_cvtsi128_si32(v168);
                    v171 = _mm_extract_epi32(v168, 1);
                    v172 = _mm_extract_epi32(v168, 2);
                    v173 = _mm_extract_epi32(v168, 3);
                    v174 = a3;
                    do
                    {
                        v175 = v169;
                        v176 = v174 + 2;
                        v177 = (__m128i)_INSERT(v168, 0, __int_as_float(v172 ^ v173 ^ *v174 ^ v171));
                        v178 = _mm_and_si128(PermV(v177, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                        v179 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v178, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v178, _mm_set1_epi32(0xf0f0f0f))));
                        v180 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v178, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v178, 4)));
                        v181 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v180, v179), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v180) ^ _mm_cvtsi128_si64(v179) ^ 0);
                        v182 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v181, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v181, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v181, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v181, _mm_set1_epi32(0xf0f0f0f))))));
                        v170 ^= v182 ^ (v182 * 4 | v182 >> 30) ^ (v182 * 0x400 | v182 >> 22) ^ (v182 * 0x40000 | v182 >> 14) ^ (v182 * &g_1000000 | v182 >> 8);
                        v183 = (__m128i)_INSERT(v177, 0, __int_as_float(v172 ^ v173 ^ v170 ^ v174[1]));
                        v184 = _mm_and_si128(PermV(v183, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                        v185 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v184, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v184, _mm_set1_epi32(0xf0f0f0f))));
                        v186 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v184, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v184, 4)));
                        v187 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v186, v185), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v186) ^ _mm_cvtsi128_si64(v185) ^ 0);
                        v188 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v187, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v187, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v187, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v187, _mm_set1_epi32(0xf0f0f0f))))));
                        v174 = v176 + 2;
                        v171 ^= v188 ^ (v188 * 4 | v188 >> 30) ^ (v188 * 0x400 | v188 >> 22) ^ (v188 * 0x40000 | v188 >> 14) ^ (v188 * &g_1000000 | v188 >> 8);
                        v189 = (__m128i)_INSERT(v183, 0, __int_as_float(v170 ^ v171 ^ *v176 ^ v173));
                        v190 = _mm_and_si128(PermV(v189, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                        v191 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v190, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v190, _mm_set1_epi32(0xf0f0f0f))));
                        v192 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v190, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v190, 4)));
                        v193 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v192, v191), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v192) ^ _mm_cvtsi128_si64(v191) ^ 0);
                        v194 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v193, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v193, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v193, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v193, _mm_set1_epi32(0xf0f0f0f))))));
                        v172 ^= v194 ^ (v194 * 4 | v194 >> 30) ^ (v194 * 0x400 | v194 >> 22) ^ (v194 * 0x40000 | v194 >> 14) ^ (v194 * &g_1000000 | v194 >> 8);
                        v168 = (__m128i)_INSERT(v189, 0, __int_as_float(v170 ^ v171 ^ v172 ^ v176[1]));
                        v195 = _mm_and_si128(PermV(v168, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                        v196 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v195, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v195, _mm_set1_epi32(0xf0f0f0f))));
                        v197 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v195, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v195, 4)));
                        v198 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v197, v196), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v197) ^ _mm_cvtsi128_si64(v196) ^ 0);
                        v13 = _mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v198, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v198, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v198, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v198, _mm_set1_epi32(0xf0f0f0f)))));
                    } while ((v173 ^= _mm_cvtsi128_si32(v13) ^ (_mm_cvtsi128_si32(v13) * 4 | (unsigned int)(_mm_cvtsi128_si32(v13)) >> 30) ^ __ROL__(_mm_cvtsi128_si32(v13), 10) ^ __ROL__(_mm_cvtsi128_si32(v13), 18) ^ __ROL__(_mm_cvtsi128_si32(v13), 24), v169 = v175 - 1, v175 != 1));
                    v200 = _INSERT(_INSERT(v168, 0, __int_as_float(v173)), 4, v172);
                    v201 = _INSERT(v200, 8, v171);
                    v202 = _INSERT(v201, 12, v170);
                    v12 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v202);
                    *iter = v12;
                    iter += 1;
                    i -= 1;
                }
            }
            v16 = __dirty_unsupported_Iop_Reverse8sIn32_x4(k[1]);
            v17 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v12, *k));
            v18 = __dirty_unsupported_Iop_Reverse8sIn32_x4(k[2]);
            v19 = __dirty_unsupported_Iop_Reverse8sIn32_x4(k[3]);
            v20 = 8;
            v21 = *(unsigned int *)&*(unsigned int *)(void*)&v17;
            v22 = *(unsigned int *)((void*)&v17 + 4);
            v23 = *(unsigned int *)((void*)&v17 + 8);
            v24 = *(unsigned int *)((void*)&v17 + 12);
            v25 = a3;
            do
            {
                v26 = v20;
                v27 = v25 + 2;
                v28 = (__m128i)_INSERT(v12, 0, __int_as_float(v23 ^ v24 ^ *v25 ^ v22));
                v29 = _mm_and_si128(PermV(v28, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v30 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v29, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v29, _mm_set1_epi32(0xf0f0f0f))));
                v31 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v29, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v29, 4)));
                v32 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v31, v30), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v31) ^ _mm_cvtsi128_si64(v30) ^ 0);
                v33 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v32, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v32, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v32, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v32, _mm_set1_epi32(0xf0f0f0f))))));
                v21 ^= v33 ^ (v33 * 4 | v33 >> 30) ^ (v33 * 0x400 | v33 >> 22) ^ (v33 * 0x40000 | v33 >> 14) ^ (v33 * &g_1000000 | v33 >> 8);
                v34 = (__m128i)_INSERT(v28, 0, __int_as_float(v23 ^ v24 ^ v21 ^ v25[1]));
                v35 = _mm_and_si128(PermV(v34, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v36 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v35, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v35, _mm_set1_epi32(0xf0f0f0f))));
                v37 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v35, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v35, 4)));
                v38 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v37, v36), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v37) ^ _mm_cvtsi128_si64(v36) ^ 0);
                v39 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v38, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v38, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v38, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v38, _mm_set1_epi32(0xf0f0f0f))))));
                v25 = v27 + 2;
                v22 ^= v39 ^ (v39 * 4 | v39 >> 30) ^ (v39 * 0x400 | v39 >> 22) ^ (v39 * 0x40000 | v39 >> 14) ^ (v39 * &g_1000000 | v39 >> 8);
                v40 = (__m128i)_INSERT(v34, 0, __int_as_float(v21 ^ v22 ^ *v27 ^ v24));
                v41 = _mm_and_si128(PermV(v40, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v42 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v41, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v41, _mm_set1_epi32(0xf0f0f0f))));
                v43 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v41, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v41, 4)));
                v44 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v43, v42), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v43) ^ _mm_cvtsi128_si64(v42) ^ 0);
                v45 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v44, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v44, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v44, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v44, _mm_set1_epi32(0xf0f0f0f))))));
                v23 ^= v45 ^ (v45 * 4 | v45 >> 30) ^ (v45 * 0x400 | v45 >> 22) ^ (v45 * 0x40000 | v45 >> 14) ^ (v45 * &g_1000000 | v45 >> 8);
                v12 = (__m128i)_INSERT(v40, 0, __int_as_float(v21 ^ v22 ^ v23 ^ v27[1]));
                v46 = _mm_and_si128(PermV(v12, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v47 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v46, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v46, _mm_set1_epi32(0xf0f0f0f))));
                v48 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v46, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v46, 4)));
                v49 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v48, v47), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v48) ^ _mm_cvtsi128_si64(v47) ^ 0);
            } while ((v50 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v49, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v49, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v49, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v49, _mm_set1_epi32(0xf0f0f0f)))))), v24 ^= v50 ^ __ROL__(v50, 2) ^ __ROL__(v50, 10) ^ __ROL__(v50, 18) ^ __ROL__(v50, 24), v20 = v26 - 1, v26 != 1));
            v52 = _INSERT(_INSERT(v17, 0, __int_as_float(v24)), 4, v23);
            v53 = _INSERT(v52, 8, v22);
            v54 = _INSERT(v53, 12, v21);
            v55 = v54 ^ v16;
            v56 = 8;
            v57 = *(unsigned int *)&*(unsigned int *)(void*)&v55;
            v58 = *(unsigned int *)((void*)&v55 + 4);
            v59 = *(unsigned int *)((void*)&v55 + 8);
            v60 = *(unsigned int *)((void*)&v55 + 12);
            v61 = a3;
            do
            {
                v62 = v56;
                v63 = v61 + 2;
                v64 = (__m128i)_INSERT(v12, 0, __int_as_float(v59 ^ v60 ^ *v61 ^ v58));
                v65 = _mm_and_si128(PermV(v64, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v66 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v65, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v65, _mm_set1_epi32(0xf0f0f0f))));
                v67 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v65, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v65, 4)));
                v68 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v67, v66), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v67) ^ _mm_cvtsi128_si64(v66) ^ 0);
                v69 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v68, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v68, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v68, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v68, _mm_set1_epi32(0xf0f0f0f))))));
                v57 ^= v69 ^ (v69 * 4 | v69 >> 30) ^ (v69 * 0x400 | v69 >> 22) ^ (v69 * 0x40000 | v69 >> 14) ^ (v69 * &g_1000000 | v69 >> 8);
                v70 = (__m128i)_INSERT(v64, 0, __int_as_float(v59 ^ v60 ^ v57 ^ v61[1]));
                v71 = _mm_and_si128(PermV(v70, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v72 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v71, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v71, _mm_set1_epi32(0xf0f0f0f))));
                v73 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v71, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v71, 4)));
                v74 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v73, v72), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v73) ^ _mm_cvtsi128_si64(v72) ^ 0);
                v75 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v74, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v74, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v74, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v74, _mm_set1_epi32(0xf0f0f0f))))));
                v61 = v63 + 2;
                v58 ^= v75 ^ (v75 * 4 | v75 >> 30) ^ (v75 * 0x400 | v75 >> 22) ^ (v75 * 0x40000 | v75 >> 14) ^ (v75 * &g_1000000 | v75 >> 8);
                v76 = (__m128i)_INSERT(v70, 0, __int_as_float(v57 ^ v58 ^ *v63 ^ v60));
                v77 = _mm_and_si128(PermV(v76, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v78 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v77, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v77, _mm_set1_epi32(0xf0f0f0f))));
                v79 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v77, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v77, 4)));
                v80 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v79, v78), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v79) ^ _mm_cvtsi128_si64(v78) ^ 0);
                v81 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v80, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v80, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v80, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v80, _mm_set1_epi32(0xf0f0f0f))))));
                v59 ^= v81 ^ (v81 * 4 | v81 >> 30) ^ (v81 * 0x400 | v81 >> 22) ^ (v81 * 0x40000 | v81 >> 14) ^ (v81 * &g_1000000 | v81 >> 8);
                v12 = (__m128i)_INSERT(v76, 0, __int_as_float(v57 ^ v58 ^ v59 ^ v63[1]));
                v82 = _mm_and_si128(PermV(v12, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v83 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v82, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v82, _mm_set1_epi32(0xf0f0f0f))));
                v84 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v82, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v82, 4)));
                v85 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v84, v83), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v84) ^ _mm_cvtsi128_si64(v83) ^ 0);
            } while ((v86 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v85, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v85, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v85, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v85, _mm_set1_epi32(0xf0f0f0f)))))), v60 ^= v86 ^ __ROL__(v86, 2) ^ __ROL__(v86, 10) ^ __ROL__(v86, 18) ^ __ROL__(v86, 24), v56 = v62 - 1, v62 != 1));
            v88 = _INSERT(_INSERT(v55, 0, __int_as_float(v60)), 4, v59);
            v89 = _INSERT(v88, 8, v58);
            v90 = _INSERT(v89, 12, v57);
            v91 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v54);
            v92 = v90 ^ v18;
            v93 = 8;
            v94 = *(unsigned int *)&*(unsigned int *)(void*)&v92;
            v95 = *(unsigned int *)((void*)&v92 + 4);
            v96 = *(unsigned int *)((void*)&v92 + 8);
            v97 = *(unsigned int *)((void*)&v92 + 12);
            v98 = a3;
            do
            {
                v99 = v93;
                v100 = v98 + 2;
                v101 = (__m128i)_INSERT(v12, 0, __int_as_float(v96 ^ v97 ^ *v98 ^ v95));
                v102 = _mm_and_si128(PermV(v101, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v103 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v102, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v102, _mm_set1_epi32(0xf0f0f0f))));
                v104 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v102, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v102, 4)));
                v105 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v104, v103), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v104) ^ _mm_cvtsi128_si64(v103) ^ 0);
                v106 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v105, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v105, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v105, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v105, _mm_set1_epi32(0xf0f0f0f))))));
                v94 ^= v106 ^ (v106 * 4 | v106 >> 30) ^ (v106 * 0x400 | v106 >> 22) ^ (v106 * 0x40000 | v106 >> 14) ^ (v106 * &g_1000000 | v106 >> 8);
                v107 = (__m128i)_INSERT(v101, 0, __int_as_float(v96 ^ v97 ^ v94 ^ v98[1]));
                v108 = _mm_and_si128(PermV(v107, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v109 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v108, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v108, _mm_set1_epi32(0xf0f0f0f))));
                v110 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v108, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v108, 4)));
                v111 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v110, v109), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v110) ^ _mm_cvtsi128_si64(v109) ^ 0);
                v112 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v111, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v111, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v111, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v111, _mm_set1_epi32(0xf0f0f0f))))));
                v98 = v100 + 2;
                v95 ^= v112 ^ (v112 * 4 | v112 >> 30) ^ (v112 * 0x400 | v112 >> 22) ^ (v112 * 0x40000 | v112 >> 14) ^ (v112 * &g_1000000 | v112 >> 8);
                v113 = (__m128i)_INSERT(v107, 0, __int_as_float(v94 ^ v95 ^ *v100 ^ v97));
                v114 = _mm_and_si128(PermV(v113, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v115 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v114, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v114, _mm_set1_epi32(0xf0f0f0f))));
                v116 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v114, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v114, 4)));
                v117 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v116, v115), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v116) ^ _mm_cvtsi128_si64(v115) ^ 0);
                v118 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v117, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v117, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v117, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v117, _mm_set1_epi32(0xf0f0f0f))))));
                v96 ^= v118 ^ (v118 * 4 | v118 >> 30) ^ (v118 * 0x400 | v118 >> 22) ^ (v118 * 0x40000 | v118 >> 14) ^ (v118 * &g_1000000 | v118 >> 8);
                v12 = (__m128i)_INSERT(v113, 0, __int_as_float(v94 ^ v95 ^ v96 ^ v100[1]));
                v119 = _mm_and_si128(PermV(v12, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v120 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v119, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v119, _mm_set1_epi32(0xf0f0f0f))));
                v121 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v119, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v119, 4)));
                v122 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v121, v120), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v121) ^ _mm_cvtsi128_si64(v120) ^ 0);
            } while ((v123 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v122, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v122, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v122, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v122, _mm_set1_epi32(0xf0f0f0f)))))), v97 ^= v123 ^ __ROL__(v123, 2) ^ __ROL__(v123, 10) ^ __ROL__(v123, 18) ^ __ROL__(v123, 24), v93 = v99 - 1, v99 != 1));
            v125 = _INSERT(_INSERT(v92, 0, __int_as_float(v97)), 4, v96);
            v126 = _INSERT(v125, 8, v95);
            v127 = _INSERT(v126, 12, v94);
            v128 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v90);
            v129 = v127 ^ v19;
            v130 = 8;
            v131 = *(unsigned int *)&*(unsigned int *)(void*)&v129;
            v132 = *(unsigned int *)((void*)&v129 + 4);
            v133 = *(unsigned int *)((void*)&v129 + 8);
            v134 = *(unsigned int *)((void*)&v129 + 12);
            v135 = a3;
            do
            {
                v136 = v130;
                v137 = v135 + 2;
                v138 = (__m128i)_INSERT(v12, 0, __int_as_float(v133 ^ v134 ^ *v135 ^ v132));
                v139 = _mm_and_si128(PermV(v138, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v140 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v139, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v139, _mm_set1_epi32(0xf0f0f0f))));
                v141 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v139, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v139, 4)));
                v142 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v141, v140), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v141) ^ _mm_cvtsi128_si64(v140) ^ 0);
                v143 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v142, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v142, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v142, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v142, _mm_set1_epi32(0xf0f0f0f))))));
                v131 ^= v143 ^ (v143 * 4 | v143 >> 30) ^ (v143 * 0x400 | v143 >> 22) ^ (v143 * 0x40000 | v143 >> 14) ^ (v143 * &g_1000000 | v143 >> 8);
                v144 = (__m128i)_INSERT(v138, 0, __int_as_float(v133 ^ v134 ^ v131 ^ v135[1]));
                v145 = _mm_and_si128(PermV(v144, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v146 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v145, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v145, _mm_set1_epi32(0xf0f0f0f))));
                v147 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v145, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v145, 4)));
                v148 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v147, v146), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v147) ^ _mm_cvtsi128_si64(v146) ^ 0);
                v149 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v148, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v148, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v148, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v148, _mm_set1_epi32(0xf0f0f0f))))));
                v135 = v137 + 2;
                v132 ^= v149 ^ (v149 * 4 | v149 >> 30) ^ (v149 * 0x400 | v149 >> 22) ^ (v149 * 0x40000 | v149 >> 14) ^ (v149 * &g_1000000 | v149 >> 8);
                v150 = (__m128i)_INSERT(v144, 0, __int_as_float(v131 ^ v132 ^ *v137 ^ v134));
                v151 = _mm_and_si128(PermV(v150, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v152 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v151, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v151, _mm_set1_epi32(0xf0f0f0f))));
                v153 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v151, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v151, 4)));
                v154 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v153, v152), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v153) ^ _mm_cvtsi128_si64(v152) ^ 0);
                v155 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v154, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v154, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v154, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v154, _mm_set1_epi32(0xf0f0f0f))))));
                v133 ^= v155 ^ (v155 * 4 | v155 >> 30) ^ (v155 * 0x400 | v155 >> 22) ^ (v155 * 0x40000 | v155 >> 14) ^ (v155 * &g_1000000 | v155 >> 8);
                v12 = (__m128i)_INSERT(v150, 0, __int_as_float(v131 ^ v132 ^ v133 ^ v137[1]));
                v156 = _mm_and_si128(PermV(v12, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v157 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v156, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v156, _mm_set1_epi32(0xf0f0f0f))));
                v158 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v156, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v156, 4)));
                v159 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v158, v157), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v158) ^ _mm_cvtsi128_si64(v157) ^ 0);
            } while ((v13 = _mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v159, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v159, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v159, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v159, _mm_set1_epi32(0xf0f0f0f))))), v134 ^= _mm_cvtsi128_si32(v13) ^ __ROL__(_mm_cvtsi128_si32(v13), 2) ^ __ROL__(_mm_cvtsi128_si32(v13), 10) ^ __ROL__(_mm_cvtsi128_si32(v13), 18) ^ __ROL__(_mm_cvtsi128_si32(v13), 24), v130 = v136 - 1, v136 != 1));
            v161 = _INSERT(_INSERT(v129, 0, __int_as_float(v134)), 4, v133);
            v162 = _INSERT(v161, 8, v132);
            v163 = _INSERT(v162, 12, v131);
            v164 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v127);
            v165 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v163);
            v12 = v165;
            iter[3] = v12;
            iter[2] = v164;
            iter[1] = v128;
            *iter = v91;
            iter += 4;
            v11 = i - 4;
            k += 4;
        } while (i != 4);
        *a4 = v12;
        return _mm_cvtsi128_si64(v13);
    }
    else
    {
        v0 = v203;
        v1 = v204;
        v2 = v205;
        v3 = v206;
        v4 = v207;
        v5 = v208;
        v6 = v209;
        v7 = v210;
        v8 = &v10;
        v9 = v211;
        do
        {
            j = v11;
            if ((int)j < 8)
                goto LABEL_ad32bc;
            v216 = k[3];
            v217 = k[2];
            v218 = k[1];
            v219 = *k;
            v220 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpacklo_epi64(_mm_unpacklo_epi32(v219, v218), _mm_unpacklo_epi32(v217, v216)));
            v221 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpackhi_epi64(_mm_unpacklo_epi32(v219, v218), _mm_unpacklo_epi32(v217, v216)));
            v222 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpacklo_epi64(_mm_unpackhi_epi32(v219, v218), _mm_unpackhi_epi32(v217, v216)));
            v223 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpackhi_epi64(_mm_unpackhi_epi32(v219, v218), _mm_unpackhi_epi32(v217, v216)));
            v224 = sub_ad1e20();
            v225 = _mm_unpacklo_epi32(v13, v213);
            v226 = _mm_unpackhi_epi32(v13, v213);
            v227 = _mm_unpacklo_epi32(v214, v212);
            v228 = _mm_unpackhi_epi32(v214, v212);
            v229 = _mm_unpacklo_epi32(v220, v221);
            v230 = _mm_unpackhi_epi32(v220, v221);
            v231 = _mm_unpacklo_epi32(v222, v223);
            v232 = _mm_unpackhi_epi32(v222, v223);
            v233 = v224[3];
            v234 = v224 + 4;
            v13 = _mm_xor_si128(*a4, _mm_unpacklo_epi64(v225, v227));
            v235 = v234[2];
            v236 = v234[1];
            v237 = *v234;
            k = v234 + 4;
            v213 = _mm_xor_si128(*v224, _mm_unpackhi_epi64(v225, v227));
            v214 = _mm_xor_si128(v224[1], _mm_unpacklo_epi64(v226, v228));
            v212 = _mm_xor_si128(v224[2], _mm_unpackhi_epi64(v226, v228));
            *a4 = v234[3];
            iter[3] = v212;
            iter[2] = v214;
            iter[1] = v213;
            *iter = v13;
            v238 = iter + 4;
            v238[3] = _mm_xor_si128(v235, _mm_unpackhi_epi64(v230, v232));
            v238[2] = _mm_xor_si128(v236, _mm_unpacklo_epi64(v230, v232));
            v238[1] = _mm_xor_si128(v237, _mm_unpackhi_epi64(v229, v231));
            *v238 = _mm_xor_si128(v233, _mm_unpacklo_epi64(v229, v231));
            iter = v238 + 4;
            v11 = j - 8;
        } while (8 < (int)j);
        v239 = arm64g_calculate_condition(3, j, 8, 0);
        j = v11;
        if (v239 & 1)
            return _mm_cvtsi128_si64(v13);
LABEL_ad32bc:
        v240 = *a4;
        while (1)
        {
            v241 = j;
            if ((int)v241 < 4)
                break;
            v242 = sub_ad1c00();
            k = v242 + 4;
            v243 = _mm_unpacklo_epi32(v13, v213);
            v244 = _mm_unpackhi_epi32(v13, v213);
            v245 = _mm_unpacklo_epi32(v214, v212);
            v246 = _mm_unpackhi_epi32(v214, v212);
            v13 = _mm_xor_si128(v240, _mm_unpacklo_epi64(v243, v245));
            v213 = _mm_xor_si128(*v242, _mm_unpackhi_epi64(v243, v245));
            v240 = v242[3];
            v214 = _mm_xor_si128(v242[1], _mm_unpacklo_epi64(v244, v246));
            v212 = _mm_xor_si128(v242[2], _mm_unpackhi_epi64(v244, v246));
            iter[3] = v212;
            iter[2] = v214;
            iter[1] = v213;
            *iter = v13;
            iter += 4;
            j = v241 - 4;
            if (4 >= (int)v241)
            {
                *a4 = v240;
                return _mm_cvtsi128_si64(v13);
            }
        }
        if ((int)v241 < 1)
            return _mm_cvtsi128_si64(v13);
        v247 = arm64g_calculate_condition(195, v241, 1, 0);
        if (!(v247 & 1))
        {
            v248 = *k;
            *a4 = v248;
            v249 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v248);
            v250 = 8;
            v251 = *(unsigned int *)&*(unsigned int *)(void*)&v249;
            v252 = *(unsigned int *)((void*)&v249 + 4);
            v253 = *(unsigned int *)((void*)&v249 + 8);
            v254 = *(unsigned int *)((void*)&v249 + 12);
            do
            {
                v255 = v250;
                v256 = a3 + 2;
                v257 = (__m128i)_INSERT(v212, 0, __int_as_float(v253 ^ v254 ^ *a3 ^ v252));
                v258 = _mm_and_si128(PermV(v257, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v259 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v258, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v258, _mm_set1_epi32(0xf0f0f0f))));
                v260 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v258, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v258, 4)));
                v261 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v260, v259), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v260) ^ _mm_cvtsi128_si64(v259) ^ 0);
                v262 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v261, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v261, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v261, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v261, _mm_set1_epi32(0xf0f0f0f))))));
                v251 ^= v262 ^ (v262 * 4 | v262 >> 30) ^ (v262 * 0x400 | v262 >> 22) ^ (v262 * 0x40000 | v262 >> 14) ^ (v262 * &g_1000000 | v262 >> 8);
                v263 = (__m128i)_INSERT(v257, 0, __int_as_float(v253 ^ v254 ^ v251 ^ a3[1]));
                v264 = _mm_and_si128(PermV(v263, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v265 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v264, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v264, _mm_set1_epi32(0xf0f0f0f))));
                v266 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v264, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v264, 4)));
                v267 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v266, v265), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v266) ^ _mm_cvtsi128_si64(v265) ^ 0);
                v268 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v267, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v267, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v267, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v267, _mm_set1_epi32(0xf0f0f0f))))));
                a3 = v256 + 2;
                v252 ^= v268 ^ (v268 * 4 | v268 >> 30) ^ (v268 * 0x400 | v268 >> 22) ^ (v268 * 0x40000 | v268 >> 14) ^ (v268 * &g_1000000 | v268 >> 8);
                v269 = (__m128i)_INSERT(v263, 0, __int_as_float(v251 ^ v252 ^ *v256 ^ v254));
                v270 = _mm_and_si128(PermV(v269, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v271 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v270, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v270, _mm_set1_epi32(0xf0f0f0f))));
                v272 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v270, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v270, 4)));
                v273 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v272, v271), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v272) ^ _mm_cvtsi128_si64(v271) ^ 0);
                v274 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v273, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v273, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v273, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v273, _mm_set1_epi32(0xf0f0f0f))))));
                v253 ^= v274 ^ (v274 * 4 | v274 >> 30) ^ (v274 * 0x400 | v274 >> 22) ^ (v274 * 0x40000 | v274 >> 14) ^ (v274 * &g_1000000 | v274 >> 8);
                v212 = (__m128i)_INSERT(v269, 0, __int_as_float(v251 ^ v252 ^ v253 ^ v256[1]));
                v275 = _mm_and_si128(PermV(v212, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                v276 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v275, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v275, _mm_set1_epi32(0xf0f0f0f))));
                v277 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v275, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v275, 4)));
                v278 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v277, v276), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v277) ^ _mm_cvtsi128_si64(v276) ^ 0);
                v13 = _mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v278, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v278, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v278, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v278, _mm_set1_epi32(0xf0f0f0f)))));
            } while ((v254 ^= _mm_cvtsi128_si32(v13) ^ (_mm_cvtsi128_si32(v13) * 4 | (unsigned int)(_mm_cvtsi128_si32(v13)) >> 30) ^ __ROL__(_mm_cvtsi128_si32(v13), 10) ^ __ROL__(_mm_cvtsi128_si32(v13), 18) ^ __ROL__(_mm_cvtsi128_si32(v13), 24), v250 = v255 - 1, v255 != 1));
            v280 = _INSERT(_INSERT(v249, 0, __int_as_float(v254)), 4, v253);
            v281 = _INSERT(v280, 8, v252);
            v282 = _INSERT(v281, 12, v251);
            v283 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v282);
            *iter = _mm_xor_si128(v240, v283);
            return _mm_cvtsi128_si64(v13);
        }
        else if (1 >= (int)(v241 - 1))
        {
            v284 = sub_ad1c00();
            v285 = v284[1];
            v286 = _mm_unpacklo_epi32(v13, v213);
            v287 = _mm_unpacklo_epi32(v214, v212);
            iter[1] = _mm_xor_si128(*v284, _mm_unpackhi_epi64(v286, v287));
            *iter = _mm_xor_si128(v240, _mm_unpacklo_epi64(v286, v287));
            *a4 = v285;
            return _mm_cvtsi128_si64(_mm_xor_si128(v240, _mm_unpacklo_epi64(v286, v287)));
        }
        else
        {
            v288 = sub_ad1c00();
            v289 = v288[2];
            v290 = *v288;
            v291 = _mm_unpacklo_epi32(v13, v213);
            v292 = _mm_unpacklo_epi32(v214, v212);
            v293 = _mm_xor_si128(v240, _mm_unpacklo_epi64(v291, v292));
            iter[2] = _mm_xor_si128(v288[1], _mm_unpacklo_epi64(_mm_unpackhi_epi32(v13, v213), _mm_unpackhi_epi32(v214, v212)));
            iter[1] = _mm_xor_si128(v290, _mm_unpackhi_epi64(v291, v292));
            *iter = v293;
            *a4 = v289;
            return _mm_cvtsi128_si64(v293);
        }
    }
}
