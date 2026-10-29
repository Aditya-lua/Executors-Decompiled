/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad2620..0xad2900 (736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

uint128_t * sub_ad2620(uint128_t *a0, void* iter, unsigned long long a2, unsigned int *a3)
{
    unsigned int v2;  // w2
    unsigned int v3;  // w2
    __m128i v12;  // q3
    __m128i v13;  // q2
    __m128i v14;  // q1
    __m128i v15;  // q0
    void* v16;  // x1
    unsigned long long v17;  // 4102
    uint128_t v18;  // q4
    unsigned int v19;  // w11
    unsigned int v20;  // w12
    unsigned int v21;  // w13
    __m128i v4;  // 4132
    unsigned int v22;  // w14
    unsigned int v23;  // w15
    __m128i v24;  // q3
    unsigned int v25;  // w11
    unsigned int *v26;  // x10
    __m128i v27;  // q3
    __m128i v28;  // q0
    __m128i v29;  // q0
    __m128i v30;  // q2
    __m128i v31;  // 4189
    __m128i v5;  // 4134
    unsigned int v32;  // w7
    __m128i v33;  // q3
    __m128i v34;  // q0
    __m128i v35;  // q0
    __m128i v36;  // q2
    __m128i v37;  // 4352
    unsigned int v38;  // w7
    __m128i v39;  // q3
    __m128i v40;  // q0
    __m128i v41;  // q0
    __m128i v6;  // 4136
    __m128i v42;  // q2
    __m128i v43;  // 4519
    unsigned int v44;  // w7
    __m128i v45;  // q0
    __m128i v46;  // q0
    __m128i v47;  // q2
    __m128i v48;  // 4682
    unsigned int v49;  // w7
    uint128_t v51;  // q4
    __m128i v7;  // 4138
    uint128_t v52;  // q4
    uint128_t v53;  // q4
    uint128_t v54;  // q4
    uint128_t *v55;  // x0
    uint128_t *v56;  // x0
    void* v57;  // x1
    uint128_t *v58;  // x0
    void* v59;  // x1
    void* v60;  // x1
    __m128i v8;  // q4
    __m128i v9;  // q5
    __m128i v10;  // q6
    __m128i v11;  // q7
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v2 = a2 >> 4;
    v0 = &v1;
    while (1)
    {
        v3 = v2;
        if ((int)v3 < 8)
            break;
        v4 = a0[3];
        v5 = a0[2];
        v6 = a0[1];
        v7 = *a0;
        v8 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpacklo_epi64(_mm_unpacklo_epi32(v7, v6), _mm_unpacklo_epi32(v5, v4)));
        v9 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpackhi_epi64(_mm_unpacklo_epi32(v7, v6), _mm_unpacklo_epi32(v5, v4)));
        v10 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpacklo_epi64(_mm_unpackhi_epi32(v7, v6), _mm_unpackhi_epi32(v5, v4)));
        v11 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpackhi_epi64(_mm_unpackhi_epi32(v7, v6), _mm_unpackhi_epi32(v5, v4)));
        a0 = sub_ad1e20(a0 + 8);
        *(__m128i *)&iter[48] = CatOddLanesV(_mm_unpackhi_epi64(v13, v12), _mm_unpackhi_epi64(v15, v14));
        *(__m128i *)&iter[32] = CatEvenLanesV(_mm_unpackhi_epi64(v13, v12), _mm_unpackhi_epi64(v15, v14));
        *(__m128i *)&iter[16] = CatOddLanesV(_mm_unpacklo_epi64(v13, v12), _mm_unpacklo_epi64(v15, v14));
        *(__m128i *)iter = CatEvenLanesV(_mm_unpacklo_epi64(v13, v12), _mm_unpacklo_epi64(v15, v14));
        v16 = iter + 64;
        *(__m128i *)&v16[48] = CatOddLanesV(_mm_unpackhi_epi64(v10, v11), _mm_unpackhi_epi64(v8, v9));
        *(__m128i *)&v16[32] = CatEvenLanesV(_mm_unpackhi_epi64(v10, v11), _mm_unpackhi_epi64(v8, v9));
        *(__m128i *)&v16[16] = CatOddLanesV(_mm_unpacklo_epi64(v10, v11), _mm_unpacklo_epi64(v8, v9));
        *(__m128i *)v16 = CatEvenLanesV(_mm_unpacklo_epi64(v10, v11), _mm_unpacklo_epi64(v8, v9));
        iter = v16 + 64;
        v2 = v3 - 8;
        if (8 >= (int)v3)
            return a0;
    }
    if ((int)v3 >= 4)
    {
        a0 = sub_ad1c00(a0 + 4);
        *(__m128i *)&iter[48] = CatOddLanesV(_mm_unpackhi_epi64(v13, v12), _mm_unpackhi_epi64(v15, v14));
        *(__m128i *)&iter[32] = CatEvenLanesV(_mm_unpackhi_epi64(v13, v12), _mm_unpackhi_epi64(v15, v14));
        *(__m128i *)&iter[16] = CatOddLanesV(_mm_unpacklo_epi64(v13, v12), _mm_unpacklo_epi64(v15, v14));
        *(__m128i *)iter = CatEvenLanesV(_mm_unpacklo_epi64(v13, v12), _mm_unpacklo_epi64(v15, v14));
        iter += 64;
        v3 -= 4;
    }
    if ((int)v3 < 1)
        return a0;
    v17 = arm64g_calculate_condition(195, v3, 1, 0);
    if (!(v17 & 1))
    {
        v18 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*a0);
        v19 = 8;
        v20 = *(unsigned int *)&*(unsigned int *)(void*)&v18;
        v21 = *(unsigned int *)((void*)&v18 + 4);
        v22 = *(unsigned int *)((void*)&v18 + 8);
        v23 = *(unsigned int *)((void*)&v18 + 12);
        do
        {
            v25 = v19;
            v26 = a3 + 2;
            v27 = (__m128i)_INSERT(v24, 0, __int_as_float(v22 ^ v23 ^ *a3 ^ v21));
            v28 = _mm_and_si128(PermV(v27, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
            v29 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v28, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v28, _mm_set1_epi32(0xf0f0f0f))));
            v30 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v28, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v28, 4)));
            v31 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v30, v29), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v30) ^ _mm_cvtsi128_si64(v29) ^ 0);
            v32 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v31, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v31, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v31, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v31, _mm_set1_epi32(0xf0f0f0f))))));
            v20 ^= v32 ^ (v32 * 4 | v32 >> 30) ^ (v32 * 0x400 | v32 >> 22) ^ (v32 * 0x40000 | v32 >> 14) ^ (v32 * &g_1000000 | v32 >> 8);
            v33 = (__m128i)_INSERT(v27, 0, __int_as_float(v22 ^ v23 ^ v20 ^ a3[1]));
            v34 = _mm_and_si128(PermV(v33, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
            v35 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v34, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v34, _mm_set1_epi32(0xf0f0f0f))));
            v36 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v34, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v34, 4)));
            v37 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v36, v35), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v36) ^ _mm_cvtsi128_si64(v35) ^ 0);
            v38 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v37, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v37, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v37, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v37, _mm_set1_epi32(0xf0f0f0f))))));
            a3 = v26 + 2;
            v21 ^= v38 ^ (v38 * 4 | v38 >> 30) ^ (v38 * 0x400 | v38 >> 22) ^ (v38 * 0x40000 | v38 >> 14) ^ (v38 * &g_1000000 | v38 >> 8);
            v39 = (__m128i)_INSERT(v33, 0, __int_as_float(v20 ^ v21 ^ *v26 ^ v23));
            v40 = _mm_and_si128(PermV(v39, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
            v41 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v40, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v40, _mm_set1_epi32(0xf0f0f0f))));
            v42 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v40, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v40, 4)));
            v43 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v42, v41), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v42) ^ _mm_cvtsi128_si64(v41) ^ 0);
            v44 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v43, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v43, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v43, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v43, _mm_set1_epi32(0xf0f0f0f))))));
            v22 ^= v44 ^ (v44 * 4 | v44 >> 30) ^ (v44 * 0x400 | v44 >> 22) ^ (v44 * 0x40000 | v44 >> 14) ^ (v44 * &g_1000000 | v44 >> 8);
            v24 = (__m128i)_INSERT(v39, 0, __int_as_float(v20 ^ v21 ^ v22 ^ v26[1]));
            v45 = _mm_and_si128(PermV(v24, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
            v46 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v45, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v45, _mm_set1_epi32(0xf0f0f0f))));
            v47 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v45, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v45, 4)));
            v48 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v47, v46), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v47) ^ _mm_cvtsi128_si64(v46) ^ 0);
            v49 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v48, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v48, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v48, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v48, _mm_set1_epi32(0xf0f0f0f))))));
        } while ((v23 ^= v49 ^ (v49 * 4 | v49 >> 30) ^ (v49 * 0x400 | v49 >> 22) ^ __ROL__(v49, 18) ^ __ROL__(v49, 24), v19 = v25 - 1, v25 != 1));
        v51 = _INSERT(_INSERT(v18, 0, __int_as_float(v23)), 4, v22);
        v52 = _INSERT(v51, 8, v21);
        v53 = _INSERT(v52, 12, v20);
        v54 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v53);
        *(uint128_t *)iter = v54;
        return a0;
    }
    else
    {
        v55 = a0 + 2;
        if (2 < (int)v3)
        {
            v58 = sub_ad1c00(v55 + 1);
            v59 = iter + 16;
            *(int *)&iter[12] = _mm_cvtsi128_si32(v24);
            *(int *)&iter[8] = _mm_cvtsi128_si32(v13);
            *(int *)&iter[4] = _mm_cvtsi128_si32(v14);
            *(int *)iter = _mm_cvtsi128_si32(v15);
            v60 = v59 + 16;
            *(int *)&v59[12] = _mm_extract_epi32(v24, 1);
            *(int *)&v59[8] = _mm_extract_epi32(v13, 1);
            *(int *)&v59[4] = _mm_extract_epi32(v14, 1);
            *(int *)v59 = _mm_extract_epi32(v15, 1);
            *(int *)&v60[12] = _mm_extract_epi32(v24, 2);
            *(int *)&v60[8] = _mm_extract_epi32(v13, 2);
            *(int *)&v60[4] = _mm_extract_epi32(v14, 2);
            *(int *)v60 = _mm_extract_epi32(v15, 2);
            return v58;
        }
        v56 = sub_ad1c00(v55);
        v57 = iter + 16;
        *(int *)&iter[12] = _mm_cvtsi128_si32(v24);
        *(int *)&iter[8] = _mm_cvtsi128_si32(v13);
        *(int *)&iter[4] = _mm_cvtsi128_si32(v14);
        *(int *)iter = _mm_cvtsi128_si32(v15);
        *(int *)&v57[12] = _mm_extract_epi32(v24, 1);
        *(int *)&v57[8] = _mm_extract_epi32(v13, 1);
        *(int *)&v57[4] = _mm_extract_epi32(v14, 1);
        *(int *)v57 = _mm_extract_epi32(v15, 1);
        return v56;
    }
}
