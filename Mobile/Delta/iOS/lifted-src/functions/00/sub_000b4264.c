/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4264..0xb42f0 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_b4264(void* a0, unsigned int a1, unsigned int a2)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x9
    void* iter;  // x10
    unsigned long long v12;  // x8
    unsigned long long v13;  // x8
    unsigned long long v14;  // w9
    unsigned long long v2;  // x9
    unsigned long long v3;  // x10
    unsigned long long i;  // x10
    void* v5;  // x12
    void* v6;  // x11
    unsigned long long v7;  // x10
    void* v8;  // x11
    __m128i v9;  // q1

    if (!a1)
        return a0;
    v0 = a1;
    if (5 > a1)
    {
        v1 = 0;
    }
    else
    {
        v2 = v0 & 3;
        v3 = 4;
        if (!(v0 & 3))
            v2 = v3;
        v1 = v0 - v2;
        i = v1;
        v5 = a0;
        v6 = a0;
        do
        {
            v7 = i;
            v8 = v6 + 32;
            v9 = QSubV(CatEvenLanesV((int128_t)v6[16], *(int128_t *)v6), CONCAT(a2 | a2 * 0x100000000, a2 | a2 * 0x100000000));
            *(int *)v5 = _mm_cvtsi128_si32(v9);
            *(int *)&v5[8] = _mm_extract_epi32(v9, 1);
            *(int *)&v5[16] = _mm_extract_epi32(v9, 2);
            *(int *)&v5[24] = _mm_extract_epi32(v9, 3);
            i = v7 - 4;
            v5 = v8;
            v6 = v8;
        } while (i);
    }
    iter = a0 + v1 * 8;
    v12 = v0 - v1;
    do
    {
        v13 = v12;
        if ((unsigned int)*(int *)iter < a2)
            v14 = 0;
        else
            v14 = *(int *)iter - a2;
    } while ((*(unsigned int *)iter = v14, iter += 8, v12 = v13 - 1, v13 != 1));
    return a0;
}
