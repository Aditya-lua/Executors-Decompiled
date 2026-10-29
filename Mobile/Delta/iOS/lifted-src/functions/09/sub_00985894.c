/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985894..0x9858b0 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985894_0 {
    char padding_0[920];
    uint128_t field_398;
} st_985894_0;


double sub_985894(void)
{
    st_985894_0 *v0;  // x19
    uint128_t *v1;  // x9
    __m128i v2;  // q0

    v1 = (v0->padding_0)[1];
    v2 = *v1;
    *v1 = _mm_add_epi64(v2, _mm_set1_epi64x(1));
    return _mm_cvtsi128_si64(v2) + 1;
}
