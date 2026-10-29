/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7dcf8..0x7dd6c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


uint128_t * sub_7dcf8(uint128_t *a0, int a1, unsigned int a2)
{
    int v0;  // w8
    int i;  // w8
    __m128i v2;  // q0
    __m128i v3;  // q1
    uint128_t *iter;  // x9
    int v5;  // w8
    __m128i v6;  // q4
    __m128i v7;  // q3
    __m128i v8;  // q4
    __m128i v9;  // q3

    if (a1 < 0)
        v0 = a1 + 15;
    else
        v0 = a1;
    if (a1 < 16)
        return a0;
    i = v0 >> 4;
    v2 = (__m128i)(CONCAT(a2 + 2 | (a2 + 2) * 0x100000000, a2 + 2 | (a2 + 2) * 0x100000000));
    v3 = (__m128i)(CONCAT(a2 | a2 * 0x100000000, a2 | a2 * 0x100000000));
    iter = a0 + 2;
    do
    {
        v5 = i;
        v6 = CmpGTV(v2, *(int128_t *)((char *)iter - 16));
        v7 = _mm_sub_epi32(*(int128_t *)((char *)iter - 16), v3);
        *(uint128_t *)((char *)iter - 32) = _mm_and_si128(_mm_sub_epi32(*(int128_t *)((char *)iter - 32), v3), ~CmpGTV(v2, *(int128_t *)((char *)iter - 32)));
        *(uint128_t *)((char *)iter - 16) = _mm_and_si128(v7, ~v6);
        v8 = CmpGTV(v2, iter[1]);
        v9 = _mm_sub_epi32(iter[1], v3);
        *iter = _mm_and_si128(_mm_sub_epi32(*iter, v3), ~CmpGTV(v2, *iter));
        iter[1] = _mm_and_si128(v9, ~v8);
        iter += 4;
        i = v5 - 1;
    } while (i);
    return a0;
}
