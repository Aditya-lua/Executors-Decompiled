/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbaf1a4..0xbaf260 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_baf1a4_0 {
    struct st_baf1a4_1 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_baf1a4_0;

typedef struct st_baf1a4_1 {
    unsigned long long field_0;
} st_baf1a4_1;


unsigned int sub_baf1a4(st_baf1a4_0 *a0, unsigned int a1)
{
    unsigned int v0;  // x8
    unsigned long long v1;  // x11
    uint128_t v10;  // q2
    unsigned long v13;  // x12
    unsigned long long v14;  // x12
    unsigned long long v15;  // 4128
    unsigned long long v16;  // 4130
    unsigned int v17;  // x13
    unsigned long long v18;  // x13
    unsigned long long v19;  // x13
    unsigned long long *v2;  // x10
    unsigned long long v3;  // x9
    __m128i v4;  // q0
    unsigned long long v5;  // x11
    __m128i v6;  // q2
    unsigned long v8;  // x12
    unsigned long long v9;  // x12

    if (!a0->field_18)
        return 0;
    v0 = 0;
    v1 = 5871781006564002453 * a1;
    v2 = a0->field_0;
    v3 = a0->field_8;
    v4 = v1 >> 57 & 0xff | (v1 >> 57 & 0xff) * 0x100 | (v1 >> 57 & 0xff | (v1 >> 57 & 0xff) * 0x100) * 0x10000 | (v1 >> 57 & 0xff | (v1 >> 57 & 0xff) * 0x100 | (v1 >> 57 & 0xff | (v1 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
    v5 = v1 & v3;
    v6 = *(long long *)((char *)v2 + v5);
    v8 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v6, v4));
    v9 = v8 & 0x8080808080808080;
    if (!(v8 & 0x8080808080808080))
        goto LABEL_baf21c;
    while (1)
    {
        do
        {
            v14 = v9;
            v15 = ((((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v16 = (((((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v17 = ((((v16 | v15) & 0xffff0000ffff0000) >> 16 | (v16 | v15) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v16 | v15) & 0xffff0000ffff0000) >> 16 | (v16 | v15) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v17)
                v18 = 64;
            else
                v18 = Clz(v17);
            if (a1 == *(int *)((char *)v2 + -4 * (v5 + (v18 >> 3) & v3) - 4))
                return 1;
            v19 = v14 - 1;
            v9 = v19 & v14;
        } while (v19 & v14);
        do
        {
LABEL_baf21c:
            v10 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v6, _mm_set1_epi8(-1)));
            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v10, v10), _mm_unpacklo_epi64(v10, v10)))))))))) & 1)
                return 0;
            v0 += 8;
            v5 = v5 + v0 & v3;
            v6 = *(long long *)((char *)v2 + v5);
            v13 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v6, v4));
            v9 = v13 & 0x8080808080808080;
        } while (!(v13 & 0x8080808080808080));
    }
}
