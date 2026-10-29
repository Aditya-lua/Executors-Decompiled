/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbaf968..0xbafae4 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_baf968(void* a0, unsigned int a1)
{
    unsigned long long v2;  // x20
    unsigned int v3;  // x13
    unsigned long v12;  // x15
    unsigned long long v13;  // x15
    unsigned int v14;  // x11
    unsigned long long v16;  // 4128
    unsigned long long v17;  // 4130
    unsigned int v18;  // x11
    unsigned long long v19;  // x11
    uint128_t v20;  // q2
    unsigned int v4;  // x12
    unsigned long v23;  // x15
    unsigned long long v24;  // x15
    unsigned long long v25;  // 4128
    unsigned long long v26;  // 4130
    unsigned int v27;  // x16
    unsigned long long v28;  // x16
    unsigned long long v29;  // x16
    unsigned long v30;  // x12
    void* v5;  // x8
    unsigned long v32;  // x11
    unsigned long long v33;  // 4137
    unsigned long long v34;  // 4139
    unsigned int v35;  // x11
    unsigned long long v36;  // x11
    __m128i v37;  // q1
    unsigned long long v6;  // x10
    char v7;  // x9
    __m128i v8;  // q0
    unsigned long long v9;  // x14
    __m128i v10;  // q2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 5871781006564002453 * a1;
    if (!(long long)a0[16])
        sub_c7031c();
    v3 = 0;
    v4 = 0;
    v5 = *(long long *)a0;
    v6 = (long long)a0[8];
    v7 = v2 >> 57;
    v8 = v7 | v7 * 0x100 | (v7 | v7 * 0x100) * 0x10000 | (v7 | v7 * 0x100 | (v7 | v7 * 0x100) * 0x10000) * 0x100000000;
    v9 = v2 & v6;
    v10 = *(long long *)((char *)v5 + v9);
    v12 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v10, v8));
    v13 = v12 & 0x8080808080808080;
    if (!(v12 & 0x8080808080808080))
        goto LABEL_baf9f4;
    while (1)
    {
        do
        {
            v24 = v13;
            v25 = ((((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v26 = (((((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v27 = ((((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v27)
                v28 = 64;
            else
                v28 = Clz(v27);
            if (a1 == *(int *)((char *)v5 + -4 * (v9 + (v28 >> 3) & v6) - 4))
                return _mm_cvtsi128_si64(v8);
            v29 = v24 - 1;
            v13 = v29 & v24;
        } while (v29 & v24);
        do
        {
LABEL_baf9f4:
            if (v3 != 1)
            {
                v14 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v10));
                if (v14)
                {
                    v16 = ((((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v17 = (((((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v18 = ((((v17 | v16) & 0xffff0000ffff0000) >> 16 | (v17 | v16) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v17 | v16) & 0xffff0000ffff0000) >> 16 | (v17 | v16) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v18)
                        v19 = 64;
                    else
                        v19 = Clz(v18);
                    v14 = v9 + (v19 >> 3) & v6;
                }
                else
                {
                    v3 = 0;
                    continue;
                }
            }
            v20 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v10, _mm_set1_epi8(-1)));
            if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))))))) & 1))
            {
                v3 = 1;
            }
            else
            {
                v30 = *((char *)v5 + v14);
                if (!(v30 >> 31 & 1))
                {
                    v32 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v5));
                    v33 = ((((((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v34 = (((((((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v35 = ((((v34 | v33) & 0xffff0000ffff0000) >> 16 | (v34 | v33) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v34 | v33) & 0xffff0000ffff0000) >> 16 | (v34 | v33) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v35)
                        v36 = 64;
                    else
                        v36 = Clz(v35);
                    v14 = v36 >> 3;
                    v30 = *((char *)v5 + v14);
                }
                *((char *)v5 + v14) = v7;
                *((char *)v5 + (v6 & v14 - 8) + 8) = v7;
                v37 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v30 & 1));
                v8 = _mm_sub_epi64((int128_t)a0[16], v37);
                *(__m128i *)&a0[16] = v8;
                *(unsigned int *)((char *)v5 + -4 * v14 - 4) = a1;
                return _mm_cvtsi128_si64(v8);
            }
            v4 += 8;
            v9 = v4 + v9 & v6;
            v10 = *(long long *)((char *)v5 + v9);
            v23 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v10, v8));
            v13 = v23 & 0x8080808080808080;
        } while (!(v23 & 0x8080808080808080));
    }
}
