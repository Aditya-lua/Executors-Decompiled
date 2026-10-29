/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9854e8..0x985584 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9854e8_0 {
    struct st_9854e8_0 *field_0;
    struct st_9854e8_0 *field_8;
    struct st_9854e8_0 *field_10;
} st_9854e8_0;

typedef struct st_9854e8_2 {
    struct st_9854e8_0 *field_0;
    struct st_9854e8_0 *field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_9854e8_2;

typedef struct st_9854e8_1 {
    unsigned long long field_0;
    char padding_8[872];
    struct st_9854e8_0 *field_370;
    struct st_9854e8_0 *field_378;
    char padding_380[8];
    struct st_9854e8_0 *field_388;
    struct st_9854e8_0 *field_390;
    uint128_t field_398;
    char padding_3a8[8];
    struct st_9854e8_0 *field_3b0;
    struct st_9854e8_0 *field_3b8;
    char padding_3c0[8];
    unsigned long long field_3c8;
} st_9854e8_1;


st_9854e8_1 * sub_9854e8(st_9854e8_1 *a0)
{
    st_9854e8_0 *v0;  // x10
    st_9854e8_2 *v1;  // x8
    st_9854e8_0 *v2;  // x9
    st_9854e8_0 *v3;  // x11
    unsigned long long v4;  // x10
    st_9854e8_0 *v5;  // x9

    v0 = (st_9854e8_0 *)a0->padding_3a8;
    if (!v0)
        return a0;
    v1 = a0->padding_3a8;
    v2 = v0->field_10;
    if (v2)
    {
        v3 = a0->field_390;
        if (v3)
            v3->field_0 = v0;
        v0->field_0 = 0;
        v0->field_8 = v3;
        a0->field_390 = v0;
        if (!a0->field_388)
            a0->field_388 = v0;
        *(__m128i *)&(&a0->field_390)[1] = _mm_add_epi64(*(int128_t *)&(&a0->field_390)[1], _mm_set1_epi64x(1));
        v4 = 936;
    }
    else
    {
        v5 = a0->field_378;
        if (v5)
            v5->field_0 = v0;
        v0->field_0 = 0;
        v0->field_8 = v5;
        a0->field_378 = v0;
        if (!a0->field_370)
            a0->field_370 = v0;
        v2 = 1;
        v4 = 896;
    }
    *(st_9854e8_0 **)((char *)a0 + v4) = *(long long *)((char *)a0 + v4) + (char *)v2;
    v1->field_0 = 0;
    v1->field_8 = 0;
    a0->padding_3c0 = a0->padding_3c0 + 1;
    return a0;
}
