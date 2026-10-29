/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9be950..0x9beac0 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9be950_0 {
    uint128_t field_0;
    uint128_t field_10;
    char field_20;
    char padding_21[207];
    unsigned int field_f0;
} st_9be950_0;

extern uint128_t g_d2ad90[9];

double sub_9be950(unsigned long a0, unsigned long a1, st_9be950_0 *a2)
{
    unsigned int v0;  // w8
    uint128_t *v1;  // x11
    __m128i v10;  // q19
    __m128i v11;  // q5
    __m128i v12;  // q1
    __m128i v13;  // q18
    __m128i v14;  // q3
    __m128i v15;  // q4
    __m128i v16;  // q2
    __m128i v17;  // q3
    uint128_t *v18;  // x9
    __m128i v19;  // q1
    uint128_t *v2;  // x9
    __m128i v20;  // q25
    __m128i v21;  // q24
    __m128i v22;  // q0
    __m128i v23;  // q27
    __m128i v24;  // q26
    __m128i v25;  // q3
    uint128_t *v26;  // x11
    __m128i v27;  // q22
    __m128i v28;  // q23
    __m128i v3;  // q21
    __m128i v4;  // q14
    __m128i v5;  // q20
    __m128i v6;  // q17
    __m128i v7;  // q0
    __m128i v8;  // q1
    __m128i v9;  // q0

    v0 = a2->field_f0;
    v1 = &g_d2ad90[0];
    v2 = &a2->field_10;
    v7 = _mm_xor_si128(_mm_and_si128(PermV(v3, _mm_and_si128(ShrNV(v4, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v4, 4))), _mm_xor_si128(a2->field_0, _mm_and_si128(PermV(v5, _mm_and_si128(_mm_and_si128(v4, v6), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v4, v6)))));
    while (1)
    {
        v8 = _mm_and_si128(v7, v6);
        v9 = ShrNV(v7, 4);
        v11 = _mm_and_si128(PermV(v10, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8));
        v12 = _mm_xor_si128(v9, v8);
        v14 = _mm_xor_si128(v11, _mm_and_si128(PermV(v13, _mm_and_si128(v9, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v9)));
        v15 = _mm_xor_si128(v11, _mm_and_si128(PermV(v13, _mm_and_si128(v12, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v12)));
        v16 = _mm_xor_si128(v12, _mm_and_si128(PermV(v13, _mm_and_si128(v14, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v14)));
        v17 = _mm_xor_si128(v9, _mm_and_si128(PermV(v13, _mm_and_si128(v15, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v15)));
        v18 = v2 + 1;
        if (!v0)
            break;
        v19 = *v1;
        v22 = _mm_xor_si128(_mm_xor_si128(*v2, _mm_and_si128(PermV(v20, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16))), _mm_and_si128(PermV(v21, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17)));
        v25 = _mm_xor_si128(_mm_xor_si128(_mm_and_si128(PermV(v23, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16)), _mm_and_si128(PermV(v24, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17))), _mm_and_si128(PermV(v22, _mm_and_si128(v19, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v19)));
        v26 = v1 + 1 & 0xffffffffffffffbf;
        v7 = _mm_xor_si128(_mm_and_si128(PermV(v25, _mm_and_si128(v19, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v19)), _mm_xor_si128(v25, _mm_and_si128(PermV(v22, _mm_and_si128(v1[4], _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v1[4]))));
        v0 -= 1;
        v2 = v18;
        v1 = v26;
    }
    return _mm_cvtsi128_si64(_mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(*v2, _mm_and_si128(PermV(v27, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16))), _mm_and_si128(PermV(v28, _mm_and_si128(v17, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v17))), _mm_and_si128(v1[8], _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v1[8])));
}
