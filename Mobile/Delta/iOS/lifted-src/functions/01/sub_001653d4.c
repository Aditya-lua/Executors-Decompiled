/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1653d4..0x165408 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1653d4_2 {
    char padding_0[8];
    struct st_1653d4_1 *field_8;
} st_1653d4_2;

typedef struct st_1653d4_0 {
    double field_0;
    char padding_8[4];
    unsigned int field_c;
} st_1653d4_0;

typedef struct st_1653d4_1 {
    char padding_0[88];
    struct st_1653d4_0 *field_58;
} st_1653d4_1;


double sub_1653d4(st_1653d4_2 **a0, unsigned int *a1)
{
    st_1653d4_1 *v0;  // x8
    st_1653d4_0 *v1;  // x9
    long long v2;  // d0

    v0 = *a0->field_8;
    v1 = v0->field_58;
    v2 = _mm_cvtsi128_si64(_mm_unpacklo_epi32(_mm_setzero_si128(), *a1)) >> 32;
    v1->field_0 = (double)(long long)__double_as_longlong(v2);
    v1->field_c = 3;
    v0->field_58 = v0->field_58 + 1;
    return (double)(long long)__double_as_longlong(v2);
}
