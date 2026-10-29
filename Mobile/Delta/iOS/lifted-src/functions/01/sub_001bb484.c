/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bb484..0x1bb550 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bb484_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    uint128_t field_38;
    unsigned long long field_48;
    char field_50[13];
    char field_55;
} st_1bb484_2;

typedef struct st_1bb484_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    uint128_t field_38;
    unsigned long long field_48;
    char field_50[13];
    unsigned long long field_55;
} st_1bb484_1;

typedef struct st_1bb484_0 {
    char field_0;
} st_1bb484_0;


double sub_1bb484(void* a0, st_1bb484_1 *a1)
{
    st_1bb484_2 *v6;  // x8
    uint128_t v7;  // q0
    unsigned long v8;  // x9
    __m128i v9;  // q0
    st_1bb484_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1bb484_0 *v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x30]
    st_1bb484_1 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!(long long)a0[32])
        sub_1c5cec(a0);
    v2 = sub_1a40d0(a0);
    v3 = a1;
    v6 = *(long long *)(sub_1a7248(&v2) + 8);
    v7 = a1->field_10;
    v6->field_0 = a1->field_0;
    v6->field_10 = v7;
    memset(&v6->field_20, 0, 24);
    v6->field_20 = a1->field_20;
    v6->field_30 = a1->field_30;
    memset(&a1->field_20, 0, 24);
    memset(&(&v6->field_30)[1], 0, 24);
    *(int128_t *)&(&v6->field_30)[1] = *(int128_t *)&(&a1->field_30)[1];
    *(long long *)((char *)&v6->field_38 + 8) = *(long long *)((char *)&a1->field_38 + 8);
    memset(&(&a1->field_30)[1], 0, 24);
    v8 = *(long long *)((char *)&a1->field_48 + 5);
    v6->field_48 = a1->field_48;
    *(unsigned long *)((char *)&v6->field_48 + 5) = v8;
    v9 = (int128_t)a0[32];
    *(__m128i *)&a0[32] = _mm_add_epi64(v9, _mm_set_epi64x(1, -1));
    return _mm_cvtsi128_si64(v9) + 0xffffffffffffffff;
}
