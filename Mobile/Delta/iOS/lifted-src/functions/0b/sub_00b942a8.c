/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb942a8..0xb944e8 (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b942a8_0 {
    void* field_0;
    unsigned long long field_8;
    uint128_t field_10;
} st_b942a8_0;


st_b942a8_0 * sub_b942a8(st_b942a8_0 *a0, long long i, long long a2)
{
    unsigned long long v2;  // x22
    unsigned int v3;  // x8
    unsigned long long v11;  // x14
    void* v12;  // x8
    unsigned long v13;  // x10
    char v14;  // x9
    unsigned long long v15;  // x14
    __m128i v16;  // q1
    unsigned long v18;  // x15
    unsigned long long v19;  // x15
    unsigned long long v20;  // x15
    long long v4;  // x2
    unsigned long long v21;  // 4128
    unsigned long long v22;  // 4130
    unsigned int v23;  // x16
    unsigned long long v24;  // x16
    unsigned long long v25;  // x16
    unsigned long long v27;  // 4128
    unsigned long long v28;  // 4130
    unsigned int v29;  // x11
    unsigned long long v30;  // x11
    st_b942a8_0 *v5;  // x0
    uint128_t v31;  // q1
    unsigned long long v33;  // 4102
    unsigned long v34;  // x12
    unsigned long v36;  // x11
    unsigned long long v37;  // 4137
    unsigned long long v38;  // 4139
    unsigned int v39;  // x11
    unsigned long long v40;  // x11
    unsigned int iter;  // x23
    __m128i v41;  // q1
    unsigned int v7;  // x11
    unsigned long v8;  // x21
    unsigned int v9;  // x13
    unsigned int v10;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned long long)(a2 - i) >> 4;
    v3 = v2 + 1 >> 1;
    if (!*(long long *)((char *)&a0->field_10 + 8))
        v3 = v2;
    v4 = a2;
    if ((unsigned long long)a0->field_10 < v3)
        goto LABEL_b94490;
    v5 = a0;
    if (i == a2)
        return a0;
    do
    {
        iter = 0;
        while (1)
        {
LABEL_b943c8:
            v8 = *(long long *)(i + iter * 16 + 8);
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            if ((long long)/* unsupported instruction */ < 0)
                break;
            if (!(long long)a0->field_10)
            {
                a2 = a0 + 1;
                v5 = sub_c6e2f4(a0, 1, a2);
            }
            v9 = 0;
            v10 = 0;
            v11 = 5871781006564002453 * (v8 + 8);
            v12 = a0->field_0;
            v13 = a0->field_8;
            v14 = v11 >> 57;
            while (1)
            {
                v15 = v11 & v13;
                v16 = *(long long *)((char *)v12 + v15);
                v18 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v16, (uint128_t)((unsigned long long)v14 | (unsigned long long)v14 * 0x100 | ((unsigned long long)v14 | (unsigned long long)v14 * 0x100) * 0x10000 | ((unsigned long long)v14 | (unsigned long long)v14 * 0x100 | ((unsigned long long)v14 | (unsigned long long)v14 * 0x100) * 0x10000) * 0x100000000)));
                v19 = v18 & 0x8080808080808080;
                if (v18 & 0x8080808080808080)
                {
                    do
                    {
                        v20 = v19;
                        v21 = ((((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v22 = (((((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v23 = ((((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v23)
                            v24 = 64;
                        else
                            v24 = Clz(v23);
                        if (v8 == *(long long *)((char *)v12 + -8 * (v15 + (v24 >> 3) & v13) - 8))
                        {
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v33 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                            if (!(v33 & 1))
                            {
                                /* unsupported instruction */;
                                v5 = sub_b86a90(v8);
                            }
                            iter += 1;
                            if (iter == v2)
                                return v5;
                            goto LABEL_b943c8;
                        }
                    } while ((v25 = v20 - 1, v19 = v25 & v20, v25 & v20));
                }
                if (v9 != 1)
                {
                    v7 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v16));
                    if (v7)
                    {
                        v27 = ((((((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v28 = (((((((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v29 = ((((v28 | v27) & 0xffff0000ffff0000) >> 16 | (v28 | v27) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v28 | v27) & 0xffff0000ffff0000) >> 16 | (v28 | v27) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v29)
                            v30 = 64;
                        else
                            v30 = Clz(v29);
                        v7 = v15 + (v30 >> 3) & v13;
                        goto LABEL_b94370;
                    }
                    else
                    {
                        v9 = 0;
LABEL_b94390:
                        v10 += 8;
                        v11 = v10 + v15;
                    }
                }
                else
                {
LABEL_b94370:
                    v31 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v16, _mm_set1_epi8(-1)));
                    if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v31, v31), _mm_unpacklo_epi64(v31, v31)))))))))) & 1))
                    {
                        v9 = 1;
                        goto LABEL_b94390;
                    }
                    else
                    {
                        v34 = *((char *)v12 + v7);
                        if (!(v34 >> 31 & 1))
                        {
                            v36 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v12));
                            v37 = ((((((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v38 = (((((((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v39 = ((((v38 | v37) & 0xffff0000ffff0000) >> 16 | (v38 | v37) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v38 | v37) & 0xffff0000ffff0000) >> 16 | (v38 | v37) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v39)
                                v40 = 64;
                            else
                                v40 = Clz(v39);
                            v7 = v40 >> 3;
                            v34 = *((char *)v12 + v7);
                        }
                        *((char *)v12 + v7) = v14;
                        *((char *)v12 + (v13 & v7 - 8) + 8) = v14;
                        v41 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v34 & 1));
                        *(__m128i *)&a0->field_10 = _mm_sub_epi64(a0->field_10, v41);
                        *(unsigned long *)((char *)v12 + -8 * v7 - 8) = v8;
                        iter += 1;
                        if (iter == v2)
                            return v5;
                        break;
                    }
                }
            }
        }
        sub_c769bc();
        v4 = a2;
LABEL_b94490:
        a2 = a0 + 1;
        v5 = sub_c6e2f4(a0);
    } while (i != v4);
    return v5;
}
