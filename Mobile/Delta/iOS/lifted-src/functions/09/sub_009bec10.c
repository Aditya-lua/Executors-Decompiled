/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bec10..0x9bedc0 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bec10_0 {
    uint128_t field_0;
    uint128_t field_10;
    char field_20;
    char padding_21[207];
    unsigned int field_f0;
} st_9bec10_0;

extern char g_d2ae00;

double sub_9bec10(unsigned long a0, unsigned long a1, st_9bec10_0 *a2)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x11
    __m128i v10;  // q0
    __m128i v11;  // q19
    __m128i v12;  // q2
    __m128i v13;  // q1
    __m128i v14;  // q18
    __m128i v15;  // q3
    __m128i v16;  // q4
    __m128i v17;  // q2
    __m128i v18;  // q3
    uint128_t *v19;  // x9
    uint128_t *v2;  // x9
    __m128i v20;  // q26
    __m128i v21;  // q4
    __m128i v22;  // q25
    __m128i v23;  // q24
    __m128i v26;  // q31
    __m128i v27;  // q30
    __m128i v28;  // q29
    __m128i v29;  // q28
    __m128i v3;  // q5
    __m128i v30;  // q27
    __m128i v31;  // q22
    __m128i v32;  // q23
    __m128i v4;  // q20
    __m128i v5;  // q14
    __m128i v6;  // q17
    __m128i v7;  // q21
    __m128i v8;  // q0
    __m128i v9;  // q1

    v0 = a2->field_f0;
    v1 = (v0 * 16 ^ 48) & 48;
    v2 = &a2->field_10;
    v3 = _mm_set_epi64x(579568010885793285, 846628450668045);
    v8 = _mm_xor_si128(_mm_xor_si128(a2->field_0, _mm_and_si128(PermV(v4, _mm_and_si128(_mm_and_si128(v5, v6), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v5, v6)))), _mm_and_si128(PermV(v7, _mm_and_si128(ShrNV(v5, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v5, 4))));
    while (1)
    {
        v9 = _mm_and_si128(v8, v6);
        v10 = ShrNV(v8, 4);
        v12 = _mm_and_si128(PermV(v11, _mm_and_si128(v9, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v9));
        v13 = _mm_xor_si128(v10, v9);
        v15 = _mm_xor_si128(v12, _mm_and_si128(PermV(v14, _mm_and_si128(v10, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v10)));
        v16 = _mm_xor_si128(v12, _mm_and_si128(PermV(v14, _mm_and_si128(v13, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v13)));
        v17 = _mm_xor_si128(v13, _mm_and_si128(PermV(v14, _mm_and_si128(v15, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v15)));
        v18 = _mm_xor_si128(v10, _mm_and_si128(PermV(v14, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16)));
        v19 = v2 + 1;
        if (!(unsigned int)v0)
            break;
        v21 = _mm_and_si128(PermV(v20, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17));
        v8 = _mm_xor_si128(_mm_and_si128(PermV(v26, _mm_and_si128(v18, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v18)), _mm_xor_si128(_mm_and_si128(PermV(v27, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17)), _mm_and_si128(PermV(_mm_xor_si128(_mm_and_si128(PermV(v28, _mm_and_si128(v18, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v18)), _mm_xor_si128(_mm_and_si128(PermV(v29, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17)), _mm_and_si128(PermV(_mm_xor_si128(_mm_and_si128(PermV(v30, _mm_and_si128(v18, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v18)), _mm_xor_si128(v21, _mm_and_si128(PermV(_mm_xor_si128(_mm_and_si128(PermV(v22, _mm_and_si128(v18, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v18)), _mm_xor_si128(*v2, _mm_and_si128(PermV(v23, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17)))), _mm_and_si128(v3, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v3)))), _mm_and_si128(v3, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v3)))), _mm_and_si128(v3, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v3))));
        v0 = (unsigned int)v0 - 1;
        v2 = v19;
        v3 = __dirty_unsupported_Iop_SliceV128(v3, v3, 12);
    }
    return _mm_cvtsi128_si64(_mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(*v2, _mm_and_si128(PermV(v31, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17))), _mm_and_si128(PermV(v32, _mm_and_si128(v18, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v18))), _mm_and_si128(*(int128_t *)&(&g_d2ae00)[v1], _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), *(int128_t *)&(&g_d2ae00)[v1])));
}
