/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x214e78..0x214ff4 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_214e78_0 {
    char field_0;
} st_214e78_0;


int sub_214e78(void* a0, int a1)
{
    unsigned long v2;  // x10
    void* v3;  // x11
    unsigned int v12;  // w13
    unsigned long long k;  // x10
    unsigned long long v14;  // x10
    unsigned long v15;  // x9
    unsigned int v16;  // w13
    unsigned int v18;  // w8
    __m128i v4;  // q0
    void* i;  // x9
    void* j;  // x9
    __m128i v7;  // q0
    __m128i v8;  // q1
    unsigned int v9;  // w13
    void* v10;  // x14
    void* v11;  // x9
    st_214e78_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_214e78_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a1;
    v3 = a0 + v2;
    if (a1 >= 16)
    {
        v4 = _mm_set_epi64x(7046029471270305834, 9650029420016256082);
        i = a0;
        do
        {
            j = i + 16;
            v7 = _mm_add_epi32(v4, _mm_mullo_epi32(*(int128_t *)i, _mm_set1_epi32(2246822519)));
            v8 = _mm_add_epi32(_mm_slli_epi32(v7, 13), _mm_srli_epi32(v7, 19));
            v4 = _mm_mullo_epi32(v8, _mm_set1_epi32(2654435761));
            i = j;
        } while (i <= v3 - 16);
        v9 = (1013904226 * _mm_cvtsi128_si32(v8) & 0xfffffffe | (_mm_cvtsi128_si32(v4) * 2 | (unsigned int)(_mm_cvtsi128_si32(v4)) >> 31) & 1) + 465361024 * _mm_extract_epi32(v8, 1) + ((unsigned int)(_mm_extract_epi32(v4, 1)) >> 25) + 0x779b1000 * _mm_extract_epi32(v8, 2) + ((unsigned int)(_mm_extract_epi32(v4, 2)) >> 20) + 0xe6c40000 * _mm_extract_epi32(v8, 3) + ((unsigned int)(_mm_extract_epi32(v4, 3)) >> 14) + a1;
        v10 = v3 - 4;
        v11 = j;
        if (v11 <= v10)
            goto LABEL_214f80;
    }
    else
    {
        j = a0;
        v9 = 374761435 + a1;
        v10 = v3 - 4;
        v11 = j;
        if (v10 >= a0)
        {
LABEL_214f80:
            do
            {
                v11 = j + 4;
                v12 = v9 + 3266489917 * *(int *)j;
                v9 = 668265263 * (v12 * 0x20000 | v12 >> 15);
                j = v11;
            } while (j <= v10);
        }
    }
    if (v3 > v11)
    {
        k = a0 + v2 - v11;
        do
        {
            v14 = k;
            v15 = v11 + 1;
            v16 = v9 + 374761393 * *(char *)v11;
            v9 = 2654435761 * (v16 * 0x800 | v16 >> 21);
            v11 = v15;
            k = v14 - 1;
        } while (k);
    }
    v18 = 3266489917 * (2246822519 * (v9 ^ v9 >> 15) ^ 2246822519 * (v9 ^ v9 >> 15) >> 13);
    return v18 ^ v18 >> 16;
}
