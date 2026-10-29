/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbaf540..0xbaf6a8 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* * sub_baf540(void* *a0, void* a1, unsigned long a2)
{
    unsigned int v3;  // x8
    unsigned long long v4;  // x21
    uint128_t v13;  // q2
    unsigned long v16;  // x13
    unsigned long long v17;  // x13
    unsigned long long v18;  // 4128
    unsigned long long v19;  // 4130
    unsigned int v20;  // x14
    unsigned long long v21;  // x14
    void* v22;  // x14
    unsigned long long *v5;  // x10
    unsigned long long v23;  // x14
    unsigned long long v24;  // 4102
    void* *v25;  // x0
    void* *v26;  // x0
    unsigned long long v6;  // x9
    __m128i v7;  // q0
    unsigned long long v8;  // x12
    __m128i v9;  // q2
    unsigned long v11;  // x13
    unsigned long long v12;  // x13
    void* v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = 0;
    v4 = 5871781006564002453 * (a2 + 8);
    v5 = *(long long *)a1;
    v6 = (long long)a1[8];
    v7 = v4 >> 57 & 0xff | (v4 >> 57 & 0xff) * 0x100 | (v4 >> 57 & 0xff | (v4 >> 57 & 0xff) * 0x100) * 0x10000 | (v4 >> 57 & 0xff | (v4 >> 57 & 0xff) * 0x100 | (v4 >> 57 & 0xff | (v4 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
    v8 = v4 & v6;
    v9 = *(long long *)((char *)v5 + v8);
    v11 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v9, v7));
    v12 = v11 & 0x8080808080808080;
    if (!(v11 & 0x8080808080808080))
        goto LABEL_baf5d4;
    while (1)
    {
        do
        {
            v17 = v12;
            v18 = ((((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v19 = (((((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v20 = ((((v19 | v18) & 0xffff0000ffff0000) >> 16 | (v19 | v18) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v19 | v18) & 0xffff0000ffff0000) >> 16 | (v19 | v18) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v20)
                v21 = 64;
            else
                v21 = Clz(v20);
            v22 = (char *)v5 + -(40 * (v8 + (v21 >> 3) & v6));
            if (*(long long *)((char *)v22 - 40) == a2)
            {
                a0[1] = v22;
                a0[2] = a1;
                *a0 = 0;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v24 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (v24 & 1)
                    return a0;
                /* unsupported instruction */;
                return sub_b86a90();
            }
            v23 = v17 - 1;
            v12 = v23 & v17;
        } while (v23 & v17);
        do
        {
LABEL_baf5d4:
            v13 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v9, _mm_set1_epi8(-1)));
            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))))))) & 1)
            {
                v25 = a0;
                if (!(long long)a1[16])
                {
                    v0 = a1;
                    v25 = sub_c7133c(v0, a1 + 32);
                    a1 = v0;
                }
                v26 = v25;
                *a0 = a2;
                a0[1] = a1;
                a0[2] = v4;
                return v26;
            }
            v3 += 8;
            v8 = v8 + v3 & v6;
            v9 = *(long long *)((char *)v5 + v8);
            v16 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v9, v7));
            v12 = v16 & 0x8080808080808080;
        } while (!(v16 & 0x8080808080808080));
    }
}
