/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb09e0..0xbb0b64 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_bb09e0(void* a0, unsigned long long *a1)
{
    unsigned long long v2;  // x21
    unsigned long long *v3;  // x1
    unsigned long v13;  // x15
    unsigned long long v14;  // x15
    unsigned long long v15;  // x11
    unsigned long long v17;  // 4128
    unsigned long long v18;  // 4130
    unsigned long long v19;  // x11
    unsigned long long v20;  // x11
    unsigned long long v4;  // x13
    uint128_t v21;  // q2
    unsigned long v24;  // x15
    unsigned long long v25;  // x15
    unsigned long long v26;  // 4128
    unsigned long long v27;  // 4130
    unsigned long long v28;  // x16
    unsigned long long v29;  // x16
    unsigned long long v30;  // x16
    unsigned long long v5;  // x12
    unsigned long v31;  // x12
    unsigned long v33;  // x11
    unsigned long long v34;  // 4137
    unsigned long long v35;  // 4139
    unsigned long long v36;  // x11
    unsigned long long v37;  // x11
    __m128i v38;  // q1
    void* v6;  // x8
    unsigned long long v7;  // x10
    char v8;  // x9
    __m128i v9;  // q0
    unsigned long long v10;  // x14
    __m128i v11;  // q2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 5871781006564002453 * (*a1 + 8);
    v3 = a1;
    if (!(long long)a0[16])
    {
        sub_c71c54();
        v3 = a1;
    }
    v4 = 0;
    v5 = 0;
    v6 = *(long long *)a0;
    v7 = (long long)a0[8];
    v8 = v2 >> 57;
    v9 = v8 | v8 * 0x100 | (v8 | v8 * 0x100) * 0x10000 | (v8 | v8 * 0x100 | (v8 | v8 * 0x100) * 0x10000) * 0x100000000;
    v10 = v2 & v7;
    v11 = *(long long *)((char *)v6 + v10);
    v13 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, v9));
    v14 = v13 & 0x8080808080808080;
    if (!(v13 & 0x8080808080808080))
        goto LABEL_bb0a74;
    while (1)
    {
        do
        {
            v25 = v14;
            v26 = ((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v27 = (((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v28 = ((((v27 | v26) & 0xffff0000ffff0000) >> 16 | (v27 | v26) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v27 | v26) & 0xffff0000ffff0000) >> 16 | (v27 | v26) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v28)
                v29 = 64;
            else
                v29 = Clz(v28);
            if (*a1 == *(long long *)*(long long *)((char *)v6 + -8 * (v10 + (v29 >> 3) & v7) - 8))
                return _mm_cvtsi128_si64(v9);
            v30 = v25 - 1;
            v14 = v30 & v25;
        } while (v30 & v25);
        do
        {
LABEL_bb0a74:
            if (v4 != 1)
            {
                v15 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v11));
                if (v15)
                {
                    v17 = ((((((v15 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v15 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v15 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v15 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v18 = (((((((v15 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v15 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v15 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v15 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v19 = ((((v18 | v17) & 0xffff0000ffff0000) >> 16 | (v18 | v17) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v18 | v17) & 0xffff0000ffff0000) >> 16 | (v18 | v17) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v19)
                        v20 = 64;
                    else
                        v20 = Clz(v19);
                    v15 = v10 + (v20 >> 3) & v7;
                }
                else
                {
                    v4 = 0;
                    continue;
                }
            }
            v21 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, _mm_set1_epi8(-1)));
            if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))))))) & 1))
            {
                v4 = 1;
            }
            else
            {
                v31 = *((char *)v6 + v15);
                if (!(v31 >> 31 & 1))
                {
                    v33 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v6));
                    v34 = ((((((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v35 = (((((((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v36 = ((((v35 | v34) & 0xffff0000ffff0000) >> 16 | (v35 | v34) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v35 | v34) & 0xffff0000ffff0000) >> 16 | (v35 | v34) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v36)
                        v37 = 64;
                    else
                        v37 = Clz(v36);
                    v15 = v37 >> 3;
                    v31 = *((char *)v6 + v15);
                }
                *((char *)v6 + v15) = v8;
                *((char *)v6 + (v7 & v15 - 8) + 8) = v8;
                v38 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v31 & 1));
                v9 = _mm_sub_epi64((int128_t)a0[16], v38);
                *(__m128i *)&a0[16] = v9;
                *(unsigned long long **)((char *)v6 + -8 * v15 - 8) = v3;
                return _mm_cvtsi128_si64(v9);
            }
            v5 += 8;
            v10 = v5 + v10 & v7;
            v11 = *(long long *)((char *)v6 + v10);
            v24 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, v9));
            v14 = v24 & 0x8080808080808080;
        } while (!(v24 & 0x8080808080808080));
    }
}
