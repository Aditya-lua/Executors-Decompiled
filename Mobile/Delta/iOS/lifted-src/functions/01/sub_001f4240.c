/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f4240..0x1f4274 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f4240_1 {
    uint128_t field_0;
    char field_10;
} st_1f4240_1;

typedef struct st_1f4240_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_1f4240_0;


double sub_1f4240(st_1f4240_1 *a0, st_1f4240_0 *a1, unsigned long a2)
{
    unsigned long long v0;  // x8
    uint128_t v1;  // q0
    __m128i v2;  // q1

    v0 = a1->field_10 != 0;
    a0->field_10 = v0;
    v1 = a1->field_0;
    v2 = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v0 & 1 | (v0 & 1) * 0x100000000), 32);
    *(__m128i *)&a0->field_0 = v1 ^ (v1 ^ CONCAT(a2, a2)) & ~_mm_cmpgt_epi64(_mm_setzero_si128(), _mm_slli_epi64(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v0 & 1 | (v0 & 1) * 0x100000000), 32), 63));
    return (unsigned long long)((v1 ^ (v1 ^ CONCAT(a2, a2)) & ~_mm_cmpgt_epi64(_mm_setzero_si128(), _mm_slli_epi64(v2, 63))) >> 0);
}
