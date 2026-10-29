/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb0614..0xbb081c (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_bb0614(void* a0, void* a1, unsigned long a2, uint128_t *a3)
{
    void* v2;  // x22
    unsigned long long v3;  // x14
    unsigned long v13;  // x16
    unsigned long long v14;  // x16
    unsigned long long v15;  // x11
    unsigned long long v17;  // 4128
    unsigned long long v18;  // 4130
    unsigned long long v19;  // x11
    unsigned long long v20;  // x11
    unsigned long long v4;  // x12
    uint128_t v21;  // q2
    unsigned long v24;  // x16
    unsigned long long v25;  // x16
    unsigned long long v26;  // 4128
    unsigned long long v27;  // 4130
    unsigned long long v28;  // x17
    unsigned long long v29;  // x17
    void* v30;  // x17
    unsigned long long v5;  // x15
    unsigned long long v31;  // x17
    uint128_t v32;  // q1
    uint128_t v33;  // q0
    uint128_t v34;  // q1
    unsigned long long v35;  // 4102
    unsigned long v36;  // x12
    unsigned long v38;  // x11
    unsigned long long v39;  // 4137
    unsigned long long v40;  // 4139
    void* v6;  // x8
    unsigned long long v41;  // x11
    unsigned long long v42;  // x11
    __m128i v43;  // q1
    void* v44;  // x8
    uint128_t v45;  // q1
    unsigned long long v7;  // x10
    char v8;  // x9
    __m128i v9;  // q0
    unsigned long long v10;  // x15
    __m128i v11;  // q2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(long long)a1[16])
    {
        v2 = a1;
        sub_c7133c(v2, a1 + 32);
        a1 = v2;
    }
    v3 = 0;
    v4 = 0;
    v5 = 5871781006564002453 * (a2 + 8);
    v6 = *(long long *)a1;
    v7 = (long long)a1[8];
    v8 = v5 >> 57;
    v9 = v8 | v8 * 0x100 | (v8 | v8 * 0x100) * 0x10000 | (v8 | v8 * 0x100 | (v8 | v8 * 0x100) * 0x10000) * 0x100000000;
    v10 = v5 & v7;
    v11 = *(long long *)((char *)v6 + v10);
    v13 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, v9));
    v14 = v13 & 0x8080808080808080;
    if (!(v13 & 0x8080808080808080))
        goto LABEL_bb06b4;
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
            v30 = v6 + -(40 * (v10 + (v29 >> 3) & v7));
            if (a2 == *(long long *)((char *)v30 - 40))
            {
                v32 = *(int128_t *)((char *)v30 - 16);
                *(int128_t *)a0 = *(int128_t *)((char *)v30 - 32);
                *(uint128_t *)&a0[16] = v32;
                v33 = *a3;
                v34 = a3[1];
                *(uint128_t *)((char *)v30 - 32) = v33;
                *(uint128_t *)((char *)v30 - 16) = v34;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v35 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (v35 & 1)
                    return *(unsigned long long *)&v33;
                /* unsupported instruction */;
                sub_b86a90();
                return *(unsigned long long *)&v33;
            }
            v31 = v25 - 1;
            v14 = v31 & v25;
        } while (v31 & v25);
        do
        {
LABEL_bb06b4:
            if (v3 != 1)
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
                    v3 = 0;
                    continue;
                }
            }
            v21 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, _mm_set1_epi8(-1)));
            if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))))))) & 1))
            {
                v3 = 1;
            }
            else
            {
                v36 = *((char *)v6 + v15);
                if (!(v36 >> 31 & 1))
                {
                    v38 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v6));
                    v39 = ((((((v38 & 0xaaaaaaaaaaaaaaaa) >> 1 | v38 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v38 & 0xaaaaaaaaaaaaaaaa) >> 1 | v38 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v38 & 0xaaaaaaaaaaaaaaaa) >> 1 | v38 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v38 & 0xaaaaaaaaaaaaaaaa) >> 1 | v38 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v40 = (((((((v38 & 0xaaaaaaaaaaaaaaaa) >> 1 | v38 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v38 & 0xaaaaaaaaaaaaaaaa) >> 1 | v38 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v38 & 0xaaaaaaaaaaaaaaaa) >> 1 | v38 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v38 & 0xaaaaaaaaaaaaaaaa) >> 1 | v38 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v41 = ((((v40 | v39) & 0xffff0000ffff0000) >> 16 | (v40 | v39) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v40 | v39) & 0xffff0000ffff0000) >> 16 | (v40 | v39) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v41)
                        v42 = 64;
                    else
                        v42 = Clz(v41);
                    v15 = v42 >> 3;
                    v36 = *((char *)v6 + v15);
                }
                *((char *)v6 + v15) = v8;
                *((char *)v6 + (v7 & v15 - 8) + 8) = v8;
                v43 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v36 & 1));
                *(__m128i *)&a1[16] = _mm_sub_epi64((int128_t)a1[16], v43);
                v44 = v6 + -(40 * v15);
                *(unsigned long *)((char *)v44 - 40) = a2;
                v33 = *a3;
                v45 = a3[1];
                *(uint128_t *)((char *)v44 - 32) = v33;
                *(uint128_t *)((char *)v44 - 16) = v45;
                *(unsigned long long *)&a0[16] = 2;
                return *(unsigned long long *)&v33;
            }
            v4 += 8;
            v10 = v4 + v10 & v7;
            v11 = *(long long *)((char *)v6 + v10);
            v24 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, v9));
            v14 = v24 & 0x8080808080808080;
        } while (!(v24 & 0x8080808080808080));
    }
}
