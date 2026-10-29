/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ee44..0xa6ee60 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6ee44_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_a6ee44_0;

typedef struct st_a6ee44_1 {
    char padding_0[16];
    uint128_t field_10;
    char padding_20[8];
    struct st_a6ee44_0 *field_28;
} st_a6ee44_1;


double sub_a6ee44(void)
{
    st_a6ee44_1 *v0;  // x19
    __m128i v1;  // q1
    unsigned long v2;  // x20

    v1 = v0->field_10;
    *(__m128i *)&v0->field_10 = _mm_add_epi64(v1, CONCAT(v2, v2));
    v0->field_28->field_8 = 0;
    return _mm_cvtsi128_si64(v1) + v2;
}
