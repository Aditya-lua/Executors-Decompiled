/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa109e0..0xa10c84 (676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a109e0_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    unsigned int field_24;
    unsigned int field_28;
    unsigned int field_2c;
    unsigned int field_30;
    unsigned int field_34;
    unsigned int field_38;
    unsigned int field_3c;
    unsigned int field_40;
    unsigned int field_44;
    unsigned int field_48;
    unsigned int field_4c;
    uint128_t field_50;
    uint128_t field_60;
    double field_70;
} st_a109e0_0;


double sub_a109e0(void* a0, st_a109e0_0 *a1, long long a2)
{
    void* v2;  // x22
    __m128i v3;  // q0
    __m128i v12;  // q5
    __m128i v13;  // q6
    __m128i v14;  // q2
    __m128i v15;  // q3
    __m128i v16;  // q1
    __m128i v17;  // q16
    unsigned long v19;  // d18
    __m128i v20;  // q16
    uint128_t v21;  // q6
    __m128i v4;  // q0
    __m128i v23;  // q4
    __m128i v24;  // q16
    __m128i v25;  // q18
    unsigned long v26;  // d4
    uint128_t v27;  // q7
    unsigned long v29;  // d16
    uint128_t v30;  // q7
    __m128i v31;  // q7
    unsigned int v5;  // w8
    __m128i v32;  // q4
    __m128i v33;  // q5
    uint128_t v36;  // q6
    __m128i v37;  // q2
    __m128i v38;  // q3
    __m128i v40;  // q1
    unsigned int v6;  // w9
    __m128i v42;  // q0
    unsigned int v7;  // w10
    unsigned int v8;  // w11
    unsigned int v9;  // w14
    unsigned int v10;  // w15
    __m128i v11;  // q4
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned int *)a0 = a1->field_0 + a1->field_28;
    *(unsigned int *)&a0[4] = a1->field_4 + a1->field_2c;
    *(unsigned int *)&a0[8] = a1->field_8 + a1->field_30;
    *(unsigned int *)&a0[12] = a1->field_c + a1->field_34;
    *(unsigned int *)&a0[16] = a1->field_10 + a1->field_38;
    *(unsigned int *)&a0[20] = a1->field_14 + a1->field_3c;
    *(unsigned int *)&a0[24] = a1->field_18 + a1->field_40;
    *(unsigned int *)&a0[28] = a1->field_1c + a1->field_44;
    *(unsigned int *)&a0[32] = a1->field_20 + a1->field_48;
    *(unsigned int *)&a0[36] = a1->field_24 + a1->field_4c;
    *(unsigned int *)&a0[40] = a1->field_28 - a1->field_0;
    v2 = a0 + 40;
    *(unsigned int *)&a0[44] = a1->field_2c - a1->field_4;
    *(unsigned int *)&a0[48] = a1->field_30 - a1->field_8;
    *(unsigned int *)&a0[52] = a1->field_34 - a1->field_c;
    *(unsigned int *)&a0[56] = a1->field_38 - a1->field_10;
    *(unsigned int *)&a0[60] = a1->field_3c - a1->field_14;
    *(unsigned int *)&a0[64] = a1->field_40 - a1->field_18;
    *(unsigned int *)&a0[0x44] = a1->field_44 - a1->field_1c;
    *(unsigned int *)&a0[72] = a1->field_48 - a1->field_20;
    *(unsigned int *)&a0[76] = a1->field_4c - a1->field_24;
    sub_a10314(a0 + 80, a0);
    sub_a10314(v2, v2, a2 + 40);
    sub_a10314(a0 + 120, a2 + 80, a1 + 1);
    v3 = *(unsigned long long *)&a1->field_70;
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
    v14 = _mm_add_epi32(a1->field_50, a1->field_50);
    v15 = (int128_t)a0[120];
    v16 = _mm_add_epi32(a1->field_60, a1->field_60);
    v17 = *(unsigned long long *)&*(double *)v2;
    v19 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(__dirty_unsupported_Iop_SliceV128(v11, v11, 8), v17));
    v20 = (__m128i)_INSERT(v17, 8, _mm_cvtsi128_si64(v17));
    *(unsigned int *)&a0[8] = v5 - v7;
    *(unsigned int *)&a0[12] = v6 - v8;
    v21 = _INSERT(_mm_sub_epi32(v13, v11), 8, _mm_extract_epi64(_mm_add_epi32(v20, v11), 1));
    *(unsigned long *)a0 = v19;
    *(unsigned int *)&a0[48] = v7 + v5;
    *(unsigned int *)&a0[52] = v8 + v6;
    v23 = (__m128i)_INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v12, v12), _mm_unpacklo_epi64(v12, v12))), 0, __int_as_float(v9));
    v24 = __double_as_longlong((double)a0[56]);
    v25 = __double_as_longlong((double)a0[64]);
    v26 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v23, v24));
    v27 = _INSERT(CatEvenLanesV(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), 0, __int_as_float(_mm_extract_epi32(v24, 1)));
    *(unsigned int *)&a0[56] = _mm_cvtsi128_si32(v24) + v9;
    v29 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(__dirty_unsupported_Iop_SliceV128(v12, v12, 4), v25));
    v30 = _INSERT(v27, 4, _mm_cvtsi128_si32(v25));
    v31 = (__m128i)_INSERT(v30, 8, _mm_extract_epi32(v25, 1));
    *(unsigned long *)&a0[16] = v26;
    *(unsigned long *)&a0[24] = v29;
    *(uint128_t *)&a0[32] = v21;
    *(__m128i *)&a0[60] = _mm_add_epi32(v31, v12);
    *(unsigned int *)&a0[76] = _mm_extract_epi32(v11, 1) + v10;
    v32 = (int128_t)a0[0x88];
    *(__m128i *)&a0[80] = _mm_add_epi32(v15, v14);
    *(__m128i *)&a0[96] = _mm_add_epi32(v32, v16);
    v33 = __double_as_longlong((double)a0[152]);
    v36 = _INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v33, v4)), 8, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v14, v15)));
    v37 = __dirty_unsupported_Iop_SliceV128(v16, v14, 8);
    v38 = __dirty_unsupported_Iop_SliceV128(v32, v15, 8);
    v40 = (__m128i)_INSERT(__dirty_unsupported_Iop_SliceV128(v16, v16, 8), 8, _mm_cvtsi128_si64(v4));
    *(uint128_t *)&a0[112] = v36;
    *(__m128i *)&a0[128] = _mm_sub_epi32(v37, v38);
    v42 = (__m128i)_INSERT(__dirty_unsupported_Iop_SliceV128(v32, v32, 8), 8, _mm_cvtsi128_si64(v33));
    *(__m128i *)&a0[144] = _mm_sub_epi32(v40, v42);
    return _mm_cvtsi128_si64(_mm_sub_epi32(v40, v42));
}
