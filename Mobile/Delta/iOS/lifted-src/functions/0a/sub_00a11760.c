/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa11760..0xa11a14 (692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_a11760(void* a0, unsigned int *a1, long long a2)
{
    void* v2;  // x22
    __m128i v3;  // q0
    __m128i v12;  // q1
    __m128i v13;  // q3
    __m128i v14;  // q5
    unsigned long v16;  // d6
    __m128i v17;  // q5
    __m128i v18;  // q7
    __m128i v19;  // q5
    uint128_t v20;  // q3
    __m128i v4;  // q0
    __m128i v22;  // q2
    __m128i v23;  // q3
    __m128i v24;  // q6
    unsigned long v25;  // d2
    unsigned long v28;  // d3
    uint128_t v29;  // q4
    __m128i v30;  // q4
    __m128i v31;  // q6
    unsigned int v5;  // w9
    __m128i v32;  // q7
    __m128i v33;  // q1
    __m128i v34;  // q2
    uint128_t v37;  // q3
    __m128i v38;  // q4
    __m128i v39;  // q5
    __m128i v41;  // q5
    unsigned int v6;  // w10
    __m128i v43;  // q0
    unsigned int v7;  // w11
    unsigned int v8;  // w12
    unsigned int v9;  // w8
    unsigned int v10;  // w15
    __m128i v11;  // q2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned int *)a0 = *a1 + a1[10];
    *(unsigned int *)&a0[4] = a1[1] + a1[11];
    *(unsigned int *)&a0[8] = a1[2] + a1[12];
    *(unsigned int *)&a0[12] = a1[3] + a1[13];
    *(unsigned int *)&a0[16] = a1[4] + a1[14];
    *(unsigned int *)&a0[20] = a1[5] + a1[15];
    *(unsigned int *)&a0[24] = a1[6] + a1[16];
    *(unsigned int *)&a0[28] = a1[7] + a1[0x11];
    *(unsigned int *)&a0[32] = a1[8] + a1[18];
    *(unsigned int *)&a0[36] = a1[9] + a1[19];
    *(unsigned int *)&a0[40] = a1[10] - *a1;
    v2 = a0 + 40;
    *(unsigned int *)&a0[44] = a1[11] - a1[1];
    *(unsigned int *)&a0[48] = a1[12] - a1[2];
    *(unsigned int *)&a0[52] = a1[13] - a1[3];
    *(unsigned int *)&a0[56] = a1[14] - a1[4];
    *(unsigned int *)&a0[60] = a1[15] - a1[5];
    *(unsigned int *)&a0[64] = a1[16] - a1[6];
    *(unsigned int *)&a0[0x44] = a1[0x11] - a1[7];
    *(unsigned int *)&a0[72] = a1[18] - a1[8];
    *(unsigned int *)&a0[76] = a1[19] - a1[9];
    sub_a10314(a0 + 80, a0);
    sub_a10314(v2, v2, a2 + 40);
    sub_a10314(a0 + 120, a2 + 120, a1 + 30);
    sub_a10314(a0, a1 + 20, a2 + 80);
    v3 = __double_as_longlong((double)a0[32]);
    v4 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v3, v3));
    v5 = (int)a0[88];
    v6 = (int)a0[92];
    v7 = (int)a0[48];
    v8 = (int)a0[52];
    v9 = (int)a0[96];
    v10 = (int)a0[116];
    v11 = (int128_t)a0[72];
    v12 = (int128_t)a0[100];
    v13 = (__m128i)_INSERT(CatOddLanesV(_mm_unpackhi_epi64(v12, v12), _mm_unpackhi_epi64(v12, v12)), 4, v10);
    *(unsigned int *)&a0[48] = v7 + v5;
    *(unsigned int *)&a0[52] = v8 + v6;
    *(unsigned int *)&a0[76] = _mm_extract_epi32(v11, 1) + v10;
    v14 = *(unsigned long long *)&*(double *)v2;
    v16 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(__dirty_unsupported_Iop_SliceV128(v11, v11, 8), v14));
    v17 = (__m128i)_INSERT(v14, 8, _mm_cvtsi128_si64(v14));
    v18 = (int128_t)a0[16];
    v19 = _mm_add_epi32(*(int128_t *)a0, *(int128_t *)a0);
    *(unsigned int *)&a0[8] = v5 - v7;
    *(unsigned int *)&a0[12] = v6 - v8;
    v20 = _INSERT(_mm_sub_epi32(v13, v11), 8, _mm_extract_epi64(_mm_add_epi32(v17, v11), 1));
    *(uint128_t *)&a0[32] = v20;
    *(unsigned long *)a0 = v16;
    v22 = (__m128i)_INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v12, v12), _mm_unpacklo_epi64(v12, v12))), 0, __int_as_float(v9));
    v23 = __double_as_longlong((double)a0[56]);
    v24 = __double_as_longlong((double)a0[64]);
    v25 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v22, v23));
    v28 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(__dirty_unsupported_Iop_SliceV128(v12, v12, 4), v24));
    v29 = _INSERT(_INSERT(CatEvenLanesV(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), 0, __int_as_float(_mm_extract_epi32(v23, 1))), 4, _mm_cvtsi128_si32(v24));
    v30 = (__m128i)_INSERT(v29, 8, _mm_extract_epi32(v24, 1));
    v31 = (int128_t)a0[120];
    v32 = _mm_add_epi32(v18, v18);
    *(unsigned int *)&a0[56] = _mm_cvtsi128_si32(v23) + v9;
    *(__m128i *)&a0[60] = _mm_add_epi32(v30, v12);
    *(unsigned long *)&a0[16] = v25;
    *(unsigned long *)&a0[24] = v28;
    v33 = (int128_t)a0[0x88];
    *(__m128i *)&a0[80] = _mm_add_epi32(v31, v19);
    *(__m128i *)&a0[96] = _mm_add_epi32(v33, v32);
    v34 = __double_as_longlong((double)a0[152]);
    v37 = _INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v34, v4)), 8, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v19, v31)));
    v38 = __dirty_unsupported_Iop_SliceV128(v32, v19, 8);
    v39 = __dirty_unsupported_Iop_SliceV128(v33, v31, 8);
    v41 = (__m128i)_INSERT(__dirty_unsupported_Iop_SliceV128(v32, v32, 8), 8, _mm_cvtsi128_si64(v4));
    *(uint128_t *)&a0[112] = v37;
    *(__m128i *)&a0[128] = _mm_sub_epi32(v38, v39);
    v43 = (__m128i)_INSERT(__dirty_unsupported_Iop_SliceV128(v33, v33, 8), 8, _mm_cvtsi128_si64(v34));
    *(__m128i *)&a0[144] = _mm_sub_epi32(v41, v43);
    return _mm_cvtsi128_si64(_mm_sub_epi32(v41, v43));
}
