/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b9440..0x9b9660 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9b9440(void* a0, unsigned int a1, unsigned int iter)
{
    unsigned long long v3;  // x30
    __m128i v4;  // q3
    __m128i v13;  // q5
    unsigned long v14;  // x2
    __m128i v15;  // 4127
    unsigned int v16;  // w1
    __m128i v17;  // q5
    __m128i v19;  // q3
    __m128i v20;  // q6
    unsigned int v22;  // w12
    void* v5;  // x0
    unsigned long v23;  // x2
    __m128i v24;  // q4
    unsigned int v25;  // w1
    __m128i v26;  // q6
    __m128i v27;  // q5
    unsigned long v28;  // x2
    __m128i v29;  // 4127
    unsigned int v30;  // w1
    __m128i v31;  // q5
    unsigned int i;  // w1
    __m128i v33;  // q1
    __m128i v34;  // q5
    __m128i v35;  // 4105
    __m128i v36;  // q5
    unsigned int v38;  // w1
    __m128i v39;  // q6
    __m128i v40;  // q5
    __m128i v41;  // 4127
    __m128i v7;  // q1
    __m128i v43;  // q5
    __m128i v46;  // q6
    __m128i v47;  // q5
    unsigned long v48;  // x2
    uint128_t v49;  // 4130
    __m128i v50;  // q5
    __m128i v52;  // q3
    unsigned long long v8;  // 4102
    __m128i v53;  // q6
    __m128i v54;  // q5
    unsigned long v55;  // x2
    __m128i v56;  // 4189
    __m128i v57;  // q5
    __m128i v9;  // q4
    unsigned long v10;  // x2
    unsigned int j;  // w1
    __m128i v12;  // q6
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    if (!a0)
    {
        return 0xffffffffffffffff;
    }
    else if (!iter)
    {
        return 0xffffffffffffffff;
    }
    else if ((int)a1 < 128)
    {
        return 0xfffffffffffffffe;
    }
    else if (0x100 < (int)a1)
    {
        return 0xfffffffffffffffe;
    }
    else if (!(a1 & 63))
    {
        v4 = *(int128_t *)a0;
        v5 = a0 + 16;
        i = 8;
        v7 = _mm_set1_epi32(1);
        if ((int)a1 >= 192)
        {
            v8 = arm64g_calculate_condition(3, a1, 192, 0);
            if (v8 & 1)
            {
                v9 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(long long *)v5);
                *(__m128i *)iter = v4;
                v10 = iter + 16;
                do
                {
                    j = i;
                    v12 = _mm_and_si128(PermV(v9, _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13), _mm_set1_epi8(8)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13), _mm_set1_epi8(8))));
                    v13 = __dirty_unsupported_Iop_SliceV128(v4, 0, 12);
                    *(long long *)v10 = _mm_cvtsi128_si64(v9);
                    v14 = v10 + 8;
                    v15 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(v12, _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v12) ^ 0);
                    v16 = j - 1;
                    v17 = __dirty_unsupported_Iop_SliceV128(v13, 0, 12);
                    v19 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(v17, 0, 12), _mm_xor_si128(v17, _mm_xor_si128(v13, v4)));
                    v20 = _mm_xor_si128(v7, v15);
                    v7 = ShlNV(v7, 1);
                    v4 = _mm_xor_si128(v20, v19);
                    v9 = _mm_xor_si128(v20, _mm_xor_si128(_mm_xor_si128(v9, CatOddLanesV(_mm_unpackhi_epi64(v19, v19), _mm_unpackhi_epi64(v19, v19))), __dirty_unsupported_Iop_SliceV128(v9, 0, 12)));
                    *(__m128i *)v14 = v4;
                    v10 = v14 + 16;
                    i = v16;
                } while (j != 1);
                v22 = 12;
                v23 = v10 + 32;
            }
            else
            {
                v24 = *(int128_t *)v5;
                v25 = 7;
                v22 = 14;
                *(__m128i *)iter = v4;
                v23 = iter + 16;
                while (1)
                {
                    v26 = _mm_and_si128(PermV(v24, _mm_and_si128(_mm_set1_epi32(202313229), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13)));
                    v27 = __dirty_unsupported_Iop_SliceV128(v4, 0, 12);
                    *(__m128i *)v23 = v24;
                    v28 = v23 + 16;
                    v29 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(v26, _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v26) ^ 0);
                    v30 = v25 - 1;
                    v31 = __dirty_unsupported_Iop_SliceV128(v27, 0, 12);
                    v33 = ShlNV(v7, 1);
                    v4 = _mm_xor_si128(_mm_xor_si128(v7, v29), _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(v31, 0, 12), _mm_xor_si128(v31, _mm_xor_si128(v27, v4))));
                    *(__m128i *)v28 = v4;
                    v23 = v28 + 16;
                    if (v25 == 1)
                        break;
                    v34 = __dirty_unsupported_Iop_SliceV128(v24, 0, 12);
                    v35 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(CatOddLanesV(_mm_unpackhi_epi64(v4, v4), _mm_unpackhi_epi64(v4, v4)), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v4, v4), _mm_unpackhi_epi64(v4, v4))) ^ 0);
                    v36 = __dirty_unsupported_Iop_SliceV128(v34, 0, 12);
                    v24 = _mm_xor_si128(v35, _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(v36, 0, 12), _mm_xor_si128(v36, _mm_xor_si128(v34, v24))));
                    v25 = v30;
                    v7 = v33;
                }
            }
        }
        else
        {
            do
            {
                v38 = i;
                v39 = _mm_and_si128(PermV(v4, _mm_and_si128(_mm_set1_epi32(202313229), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13)));
                v40 = __dirty_unsupported_Iop_SliceV128(v4, 0, 12);
                *(__m128i *)iter = v4;
                iter += 16;
                v41 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(v39, _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v39) ^ 0);
                v43 = __dirty_unsupported_Iop_SliceV128(v40, 0, 12);
                v4 = _mm_xor_si128(_mm_xor_si128(v7, v41), _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(v43, 0, 12), _mm_xor_si128(v43, _mm_xor_si128(v40, v4))));
                i = v38 - 1;
                v7 = ShlNV(v7, 1);
            } while (i);
            v46 = _mm_and_si128(PermV(v4, _mm_and_si128(_mm_set1_epi32(202313229), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13)));
            v47 = __dirty_unsupported_Iop_SliceV128(v4, 0, 12);
            *(__m128i *)iter = v4;
            v48 = iter + 16;
            v49 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(v46, _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v46) ^ 0);
            v50 = __dirty_unsupported_Iop_SliceV128(v47, 0, 12);
            v52 = _mm_xor_si128(_mm_xor_si128(_mm_set1_epi32(27), v49), _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(v50, 0, 12), _mm_xor_si128(v50, _mm_xor_si128(v47, v4))));
            v53 = _mm_and_si128(PermV(v52, _mm_and_si128(_mm_set1_epi32(202313229), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13, 12, 15, 14, 13)));
            v54 = __dirty_unsupported_Iop_SliceV128(v52, 0, 12);
            *(__m128i *)v48 = v52;
            v55 = v48 + 16;
            v56 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(v53, _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v53) ^ 0);
            v57 = __dirty_unsupported_Iop_SliceV128(v54, 0, 12);
            *(__m128i *)v55 = _mm_xor_si128(_mm_xor_si128(ShlNV(_mm_set_epi8(0, 0, 0, 27, 0, 0, 0, 27, 0, 0, 0, 27, 0, 0, 0, 27), 1), v56), _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(v57, 0, 12), _mm_xor_si128(v57, _mm_xor_si128(v54, v52))));
            v23 = v55 + 80;
            v22 = 10;
        }
        *(unsigned int *)v23 = v22;
        return 0;
    }
    else
    {
        return 0xfffffffffffffffe;
    }
}
