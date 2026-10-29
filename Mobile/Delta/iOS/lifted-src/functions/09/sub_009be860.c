/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9be860..0x9be930 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9be860_0 {
    uint128_t field_0;
    uint128_t field_10;
    char field_20;
    char padding_21[207];
    unsigned int field_f0;
} st_9be860_0;

extern uint128_t g_d2ad90[9];

double sub_9be860(unsigned long a0, unsigned long a1, st_9be860_0 *a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10)
{
    unsigned int v0;  // w8
    uint128_t *v1;  // x11
    __m128i v10;  // q5
    __m128i v11;  // q1
    __m128i v12;  // q18
    __m128i v13;  // q3
    __m128i v14;  // q4
    __m128i v15;  // q2
    __m128i v16;  // q3
    uint128_t *v17;  // x9
    __m128i v18;  // q1
    __m128i v19;  // q25
    uint128_t *v2;  // x9
    __m128i v20;  // q24
    __m128i v21;  // q0
    __m128i v22;  // q27
    __m128i v23;  // q26
    __m128i v24;  // q3
    uint128_t *v25;  // x11
    __m128i v26;  // q22
    __m128i v27;  // q23
    __m128i v3;  // q21
    __m128i v4;  // q20
    __m128i v5;  // q17
    __m128i v6;  // q0
    __m128i v7;  // q1
    __m128i v8;  // q0
    __m128i v9;  // q19

    v0 = a2->field_f0;
    v1 = &g_d2ad90[0];
    v2 = &a2->field_10;
    v6 = _mm_xor_si128(_mm_and_si128(PermV(v3, _mm_and_si128(ShrNV(a10, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(a10, 4))), _mm_xor_si128(a2->field_0, _mm_and_si128(PermV(v4, _mm_and_si128(_mm_and_si128(a10, v5), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(a10, v5)))));
    while (1)
    {
        v7 = _mm_and_si128(v6, v5);
        v8 = ShrNV(v6, 4);
        v10 = _mm_and_si128(PermV(v9, _mm_and_si128(v7, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v7));
        v11 = _mm_xor_si128(v8, v7);
        v13 = _mm_xor_si128(v10, _mm_and_si128(PermV(v12, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8)));
        v14 = _mm_xor_si128(v10, _mm_and_si128(PermV(v12, _mm_and_si128(v11, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v11)));
        v15 = _mm_xor_si128(v11, _mm_and_si128(PermV(v12, _mm_and_si128(v13, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v13)));
        v16 = _mm_xor_si128(v8, _mm_and_si128(PermV(v12, _mm_and_si128(v14, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v14)));
        v17 = v2 + 1;
        if (!v0)
            break;
        v18 = *v1;
        v21 = _mm_xor_si128(_mm_xor_si128(*v2, _mm_and_si128(PermV(v19, _mm_and_si128(v15, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v15))), _mm_and_si128(PermV(v20, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16)));
        v24 = _mm_xor_si128(_mm_xor_si128(_mm_and_si128(PermV(v22, _mm_and_si128(v15, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v15)), _mm_and_si128(PermV(v23, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16))), _mm_and_si128(PermV(v21, _mm_and_si128(v18, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v18)));
        v25 = v1 + 1 & 0xffffffffffffffbf;
        v6 = _mm_xor_si128(_mm_and_si128(PermV(v24, _mm_and_si128(v18, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v18)), _mm_xor_si128(v24, _mm_and_si128(PermV(v21, _mm_and_si128(v1[4], _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v1[4]))));
        v0 -= 1;
        v2 = v17;
        v1 = v25;
    }
    return _mm_cvtsi128_si64(_mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(*v2, _mm_and_si128(PermV(v26, _mm_and_si128(v15, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v15))), _mm_and_si128(PermV(v27, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16))), _mm_and_si128(v1[8], _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v1[8])));
}
