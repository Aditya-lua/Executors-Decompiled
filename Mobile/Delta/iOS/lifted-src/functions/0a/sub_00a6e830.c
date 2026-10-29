/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e830..0xa6e86c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6e830_0 {
    char padding_0[16];
    uint128_t field_10;
} st_a6e830_0;


double sub_a6e830(st_a6e830_0 *a0, unsigned long a1)
{
    __m128i v2;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_c68684())
    {
        v2 = _mm_add_epi64(a0->field_10, CONCAT(a1, a1));
        *(__m128i *)&a0->field_10 = v2;
    }
    return _mm_cvtsi128_si64(v2);
}
