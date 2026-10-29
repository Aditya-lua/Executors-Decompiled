/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9beaf0..0x9bebf0 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9beaf0_0 {
    uint128_t field_0;
    uint128_t field_10;
    char field_20;
    char padding_21[207];
    unsigned int field_f0;
} st_9beaf0_0;

extern char g_d2ae00;

double sub_9beaf0(unsigned long a0, unsigned long a1, st_9beaf0_0 *a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x11
    __m128i v10;  // q19
    __m128i v11;  // q2
    __m128i v12;  // q1
    __m128i v13;  // q18
    __m128i v14;  // q3
    __m128i v15;  // q4
    __m128i v16;  // q2
    __m128i v17;  // q3
    uint128_t *v18;  // x9
    __m128i v19;  // q26
    uint128_t *v2;  // x9
    __m128i v20;  // q4
    __m128i v21;  // q25
    __m128i v22;  // q24
    __m128i v25;  // q31
    __m128i v26;  // q30
    __m128i v27;  // q29
    __m128i v28;  // q28
    __m128i v29;  // q27
    __m128i v3;  // q5
    __m128i v30;  // q22
    __m128i v31;  // q23
    __m128i v4;  // q20
    __m128i v5;  // q17
    __m128i v6;  // q21
    __m128i v7;  // q0
    __m128i v8;  // q1
    __m128i v9;  // q0

    v0 = a2->field_f0;
    v1 = (v0 * 16 ^ 48) & 48;
    v2 = &a2->field_10;
    v3 = _mm_set_epi64x(579568010885793285, 846628450668045);
    v7 = _mm_xor_si128(_mm_xor_si128(a2->field_0, _mm_and_si128(PermV(v4, _mm_and_si128(_mm_and_si128(a10, v5), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(a10, v5)))), _mm_and_si128(PermV(v6, _mm_and_si128(ShrNV(a10, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(a10, 4))));
    while (1)
    {
        v8 = _mm_and_si128(v7, v5);
        v9 = ShrNV(v7, 4);
        v11 = _mm_and_si128(PermV(v10, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8));
        v12 = _mm_xor_si128(v9, v8);
        v14 = _mm_xor_si128(v11, _mm_and_si128(PermV(v13, _mm_and_si128(v9, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v9)));
        v15 = _mm_xor_si128(v11, _mm_and_si128(PermV(v13, _mm_and_si128(v12, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v12)));
        v16 = _mm_xor_si128(v12, _mm_and_si128(PermV(v13, _mm_and_si128(v14, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v14)));
        v17 = _mm_xor_si128(v9, _mm_and_si128(PermV(v13, _mm_and_si128(v15, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v15)));
        v18 = v2 + 1;
        if (!(unsigned int)v0)
            break;
        v20 = _mm_and_si128(PermV(v19, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16));
        v7 = _mm_xor_si128(_mm_and_si128(PermV(v25, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17)), _mm_xor_si128(_mm_and_si128(PermV(v26, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16)), _mm_and_si128(PermV(_mm_xor_si128(_mm_and_si128(PermV(v27, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17)), _mm_xor_si128(_mm_and_si128(PermV(v28, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16)), _mm_and_si128(PermV(_mm_xor_si128(_mm_and_si128(PermV(v29, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17)), _mm_xor_si128(v20, _mm_and_si128(PermV(_mm_xor_si128(_mm_and_si128(PermV(v21, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17)), _mm_xor_si128(*v2, _mm_and_si128(PermV(v22, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16)))), _mm_and_si128(v3, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v3)))), _mm_and_si128(v3, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v3)))), _mm_and_si128(v3, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v3))));
        v0 = (unsigned int)v0 - 1;
        v2 = v18;
        v3 = __dirty_unsupported_Iop_SliceV128(v3, v3, 12);
    }
    return _mm_cvtsi128_si64(_mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(*v2, _mm_and_si128(PermV(v30, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16))), _mm_and_si128(PermV(v31, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17))), _mm_and_si128(*(int128_t *)&(&g_d2ae00)[v1], _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), *(int128_t *)&(&g_d2ae00)[v1])));
}
