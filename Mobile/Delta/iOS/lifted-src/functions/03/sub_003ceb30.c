/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ceb30..0x3cebbc (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_3ceb30(void* a0, void* a1)
{
    unsigned long v0;  // x8
    unsigned long v1;  // cc_op
    unsigned long v4;  // cc_ndep
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4102
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    __m128i v9;  // q1
    __m128i v10;  // q3
    __m128i v11;  // q1
    __m128i v12;  // q3
    __m128i v13;  // q1
    __m128i v14;  // q3
    __m128i v15;  // q0
    __m128i v16;  // q1
    __m128i v17;  // q2
    __m128i v18;  // q3
    unsigned long long i;  // x8
    unsigned long v20;  // d0
    unsigned long long v2;  // 4110
    unsigned long long v3;  // 4102

    v0 = a0 + 128;
    if (a0 < a1 + 128)
    {
        v2 = arm64g_calculate_condition(v1 | 128, v7, v8, v4);
        v3 = arm64g_calculate_condition(132, (v2 & 1 ? v0 : 0), (v2 & 1 ? a1 : 0), 0);
        if (!(v3 & 1))
        {
            v9 = (int128_t)a1[16];
            v10 = (int128_t)a0[16];
            *(__m128i *)a0 = _mm_mullo_epi16(*(int128_t *)a0, *(int128_t *)a1);
            *(__m128i *)&a0[16] = _mm_mullo_epi16(v10, v9);
            v11 = (int128_t)a1[48];
            v12 = (int128_t)a0[48];
            *(__m128i *)&a0[32] = _mm_mullo_epi16((int128_t)a0[32], (int128_t)a1[32]);
            *(__m128i *)&a0[48] = _mm_mullo_epi16(v12, v11);
            v13 = (int128_t)a1[80];
            v14 = (int128_t)a0[80];
            *(__m128i *)&a0[64] = _mm_mullo_epi16((int128_t)a0[64], (int128_t)a1[64]);
            *(__m128i *)&a0[80] = _mm_mullo_epi16(v14, v13);
            v15 = (int128_t)a1[96];
            v16 = (int128_t)a1[112];
            v17 = (int128_t)a0[96];
            v18 = (int128_t)a0[112];
            *(__m128i *)&a0[96] = _mm_mullo_epi16(v17, v15);
            *(__m128i *)&a0[112] = _mm_mullo_epi16(v18, v16);
            return _mm_cvtsi128_si64(_mm_mullo_epi16(v17, v15));
        }
    }
    else
    {
        v5 = arm64g_calculate_condition(v1 | 128, v7, v8, v4);
        v6 = arm64g_calculate_condition(128, (v5 & 1 ? v0 : 0), (v5 & 1 ? a1 : 0), 0);
        if (!(v6 & 1))
        {
            v9 = (int128_t)a1[16];
            v10 = (int128_t)a0[16];
            *(__m128i *)a0 = _mm_mullo_epi16(*(int128_t *)a0, *(int128_t *)a1);
            *(__m128i *)&a0[16] = _mm_mullo_epi16(v10, v9);
            v11 = (int128_t)a1[48];
            v12 = (int128_t)a0[48];
            *(__m128i *)&a0[32] = _mm_mullo_epi16((int128_t)a0[32], (int128_t)a1[32]);
            *(__m128i *)&a0[48] = _mm_mullo_epi16(v12, v11);
            v13 = (int128_t)a1[80];
            v14 = (int128_t)a0[80];
            *(__m128i *)&a0[64] = _mm_mullo_epi16((int128_t)a0[64], (int128_t)a1[64]);
            *(__m128i *)&a0[80] = _mm_mullo_epi16(v14, v13);
            v15 = (int128_t)a1[96];
            v16 = (int128_t)a1[112];
            v17 = (int128_t)a0[96];
            v18 = (int128_t)a0[112];
            *(__m128i *)&a0[96] = _mm_mullo_epi16(v17, v15);
            *(__m128i *)&a0[112] = _mm_mullo_epi16(v18, v16);
            return _mm_cvtsi128_si64(_mm_mullo_epi16(v17, v15));
        }
    }
    i = 0;
    do
    {
        *(short *)((char *)a0 + i) = *(short *)((char *)a1 + i) * *(short *)((char *)a0 + i);
        i += 2;
    } while (i != 128);
    return v20;
}
