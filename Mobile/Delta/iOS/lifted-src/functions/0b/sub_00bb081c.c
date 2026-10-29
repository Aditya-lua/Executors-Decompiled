/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb081c..0xbb09e0 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_bb081c(void* a0, unsigned long a1)
{
    unsigned long long v2;  // x13
    unsigned long long v3;  // x12
    unsigned long v12;  // x15
    unsigned long long v13;  // x15
    unsigned long long v14;  // x11
    unsigned long long v16;  // 4128
    unsigned long long v17;  // 4130
    unsigned long long v18;  // x11
    unsigned long long v19;  // x11
    uint128_t v20;  // q2
    unsigned long long v4;  // x14
    unsigned long v23;  // x15
    unsigned long long v24;  // x15
    unsigned long long v25;  // 4128
    unsigned long long v26;  // 4130
    unsigned long long v27;  // x16
    unsigned long long v28;  // x16
    unsigned long long v29;  // x16
    unsigned long long v30;  // 4102
    void* v5;  // x8
    unsigned long v31;  // x12
    unsigned long v33;  // x11
    unsigned long long v34;  // 4137
    unsigned long long v35;  // 4139
    unsigned long long v36;  // x11
    unsigned long long v37;  // x11
    __m128i v38;  // q1
    unsigned long long v6;  // x10
    char v7;  // x9
    __m128i v8;  // q0
    unsigned long long v9;  // x14
    __m128i v10;  // q2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(long long)a0[16])
        sub_c6e2f4();
    v2 = 0;
    v3 = 0;
    v4 = 5871781006564002453 * (a1 + 8);
    v5 = *(long long *)a0;
    v6 = (long long)a0[8];
    v7 = v4 >> 57;
    v8 = v7 | v7 * 0x100 | (v7 | v7 * 0x100) * 0x10000 | (v7 | v7 * 0x100 | (v7 | v7 * 0x100) * 0x10000) * 0x100000000;
    v9 = v4 & v6;
    v10 = *(long long *)((char *)v5 + v9);
    v12 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v10, v8));
    v13 = v12 & 0x8080808080808080;
    if (!(v12 & 0x8080808080808080))
        goto LABEL_bb08a8;
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
            if (a1 == *(long long *)((char *)v5 + -8 * (v9 + (v28 >> 3) & v6) - 8))
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v30 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (v30 & 1)
                    return _mm_cvtsi128_si64(v8);
                /* unsupported instruction */;
                sub_b86a90();
                return _mm_cvtsi128_si64(v8);
            }
            v29 = v24 - 1;
            v13 = v29 & v24;
        } while (v29 & v24);
        do
        {
LABEL_bb08a8:
            if (v2 != 1)
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
                    v2 = 0;
                    continue;
                }
            }
            v20 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v10, _mm_set1_epi8(-1)));
            if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))))))) & 1))
            {
                v2 = 1;
            }
            else
            {
                v31 = *((char *)v5 + v14);
                if (!(v31 >> 31 & 1))
                {
                    v33 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v5));
                    v34 = ((((((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v35 = (((((((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v33 & 0xaaaaaaaaaaaaaaaa) >> 1 | v33 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v36 = ((((v35 | v34) & 0xffff0000ffff0000) >> 16 | (v35 | v34) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v35 | v34) & 0xffff0000ffff0000) >> 16 | (v35 | v34) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v36)
                        v37 = 64;
                    else
                        v37 = Clz(v36);
                    v14 = v37 >> 3;
                    v31 = *((char *)v5 + v14);
                }
                *((char *)v5 + v14) = v7;
                *((char *)v5 + (v6 & v14 - 8) + 8) = v7;
                v38 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v31 & 1));
                v8 = _mm_sub_epi64((int128_t)a0[16], v38);
                *(__m128i *)&a0[16] = v8;
                *(unsigned long *)((char *)v5 + -8 * v14 - 8) = a1;
                return _mm_cvtsi128_si64(v8);
            }
            v3 += 8;
            v9 = v3 + v9 & v6;
            v10 = *(long long *)((char *)v5 + v9);
            v23 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v10, v8));
            v13 = v23 & 0x8080808080808080;
        } while (!(v23 & 0x8080808080808080));
    }
}
