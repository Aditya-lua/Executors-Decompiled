/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ec78..0x3ef2c (692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_3ec78(void* a0, void* a1, char *a2)
{
    unsigned int v0;  // w9
    void* v1;  // x10
    unsigned long long v10;  // q7
    unsigned long long v11;  // q5
    unsigned long long v12;  // q16
    unsigned long long v13;  // q6
    unsigned long long v14;  // q19
    unsigned long long v15;  // q17
    unsigned long long v16;  // q21
    unsigned long long v17;  // q20
    unsigned long long v18;  // q24
    unsigned long long v19;  // q18
    unsigned long long v2;  // x8
    unsigned long long v20;  // q23
    unsigned long long v21;  // q22
    unsigned long long v22;  // q25
    unsigned long long i;  // x12
    unsigned long long v24;  // x12
    __m128i v25;  // q28
    __m128i v26;  // q27
    __m128i v27;  // q28
    __m128i v28;  // q29
    __m128i v29;  // q30
    unsigned long long v3;  // x11
    __m128i v30;  // q28
    __m128i v31;  // q27
    __m128i v32;  // q26
    __m128i v33;  // q29
    __m128i v34;  // q26
    __m128i v35;  // q27
    __m128i v36;  // q28
    __m128i v37;  // q26
    __m128i v38;  // q26
    __m128i v4;  // q1
    unsigned long long v41;  // x13
    void* v42;  // x12
    unsigned long long v43;  // q0
    __m128i v44;  // q1
    void* v45;  // x8
    unsigned long long v46;  // x11
    __m128i v47;  // q3
    unsigned long long v48;  // q4
    unsigned long long v49;  // q5
    unsigned long long v5;  // q0
    void* v50;  // x8
    __m128i v52;  // q6
    __m128i v53;  // q7
    __m128i v54;  // q6
    unsigned long long v56;  // 4174
    unsigned long v57;  // d0
    void* v58;  // x12
    __m128i v6;  // q2
    unsigned long long v7;  // q3
    unsigned long long v8;  // q4
    uint128_t *iter;  // x8

    if (a0 == a1)
        return 0;
    v0 = *a2;
    v1 = a1 - a0;
    if (8 > v1)
    {
        v2 = 0;
    }
    else if (32 > v1)
    {
        v2 = 0;
        v3 = 0;
LABEL_3ee70:
        v41 = v1 & 0xfffffffffffffff8;
        v42 = a0 + v41;
        v43 = 0;
        v44 = __double_as_longlong(__longlong_as_double(v2));
        v45 = a0 + v3;
        v46 = v3 - v41;
        v47 = _mm_set1_epi64x(1);
        v48 = 0;
        v49 = 0;
        do
        {
            v50 = v45 + 8;
            v52 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(unsigned long long *)&*(double *)v45, v0 & 0xff | (v0 & 0xff) * 0x100 | (v0 & 0xff | (v0 & 0xff) * 0x100) * 0x10000 | (v0 & 0xff | (v0 & 0xff) * 0x100 | (v0 & 0xff | (v0 & 0xff) * 0x100) * 0x10000) * 0x100000000))), 8);
            v53 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v52), 16);
            v54 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v52), 16);
            v49 = (unsigned long long)_mm_add_epi64(v49, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v54), 32), v47));
            v48 = (unsigned long long)_mm_add_epi64(v48, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v54), 32), v47));
            v43 = (unsigned long long)_mm_add_epi64(v43, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v53), 32), v47));
            v44 = _mm_add_epi64(v44, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v53), 32), v47));
            v56 = arm64g_calculate_condition(18, v46, 8, 0);
            v45 = v50;
            v46 += 8;
        } while (v56 & 1);
        v57 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v44, v48), _mm_add_epi64(v43, v49)), _mm_unpackhi_epi64(_mm_add_epi64(_mm_add_epi64(v44, v48), _mm_add_epi64(v43, v49)), _mm_add_epi64(_mm_add_epi64(v44, v48), _mm_add_epi64(v43, v49)))));
        v2 = __double_as_longlong(v57);
        a0 = v42;
        if (v1 == v41)
            return __double_as_longlong(v57);
    }
    else
    {
        v4 = (__m128i)(CONCAT(v0 & 0xff | (v0 & 0xff) * 0x100 | (v0 & 0xff | (v0 & 0xff) * 0x100) * 0x10000 | (v0 & 0xff | (v0 & 0xff) * 0x100 | (v0 & 0xff | (v0 & 0xff) * 0x100) * 0x10000) * 0x100000000, v0 & 0xff | (v0 & 0xff) * 0x100 | (v0 & 0xff | (v0 & 0xff) * 0x100) * 0x10000 | (v0 & 0xff | (v0 & 0xff) * 0x100 | (v0 & 0xff | (v0 & 0xff) * 0x100) * 0x10000) * 0x100000000));
        v5 = 0;
        v6 = _mm_set1_epi64x(1);
        v7 = 0;
        v3 = v1 & 0xffffffffffffffe0;
        v8 = 0;
        iter = a0 + 16;
        v10 = 0;
        v11 = 0;
        v12 = 0;
        v13 = 0;
        v14 = 0;
        v15 = 0;
        v16 = 0;
        v17 = 0;
        v18 = 0;
        v19 = 0;
        v20 = 0;
        v21 = 0;
        v22 = 0;
        i = v3;
        do
        {
            v24 = i;
            v25 = _mm_cmpeq_epi8(*(int128_t *)((char *)iter - 16), v4);
            v26 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v25), 8);
            v27 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v25), 8);
            v28 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v27), 16);
            v14 = (unsigned long long)_mm_add_epi64(v14, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v28), 32), v6));
            v29 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v26), 16);
            v30 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v27), 16);
            v13 = (unsigned long long)_mm_add_epi64(v13, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v28), 32), v6));
            v12 = (unsigned long long)_mm_add_epi64(v12, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v30), 32), v6));
            v10 = (unsigned long long)_mm_add_epi64(v10, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v29), 32), v6));
            v31 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v26), 16);
            v11 = (unsigned long long)_mm_add_epi64(v11, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v30), 32), v6));
            v32 = _mm_cmpeq_epi8(*iter, v4);
            v8 = (unsigned long long)_mm_add_epi64(v8, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v29), 32), v6));
            v33 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v32), 8);
            v34 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v32), 8);
            v7 = (unsigned long long)_mm_add_epi64(v7, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v31), 32), v6));
            v35 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v34), 16);
            v5 = (unsigned long long)_mm_add_epi64(v5, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v31), 32), v6));
            v22 = (unsigned long long)_mm_add_epi64(v22, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v35), 32), v6));
            v36 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v33), 16);
            v37 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v34), 16);
            v21 = (unsigned long long)_mm_add_epi64(v21, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v35), 32), v6));
            v20 = (unsigned long long)_mm_add_epi64(v20, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v37), 32), v6));
            v18 = (unsigned long long)_mm_add_epi64(v18, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v36), 32), v6));
            v19 = (unsigned long long)_mm_add_epi64(v19, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v37), 32), v6));
            v38 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v33), 16);
            v17 = (unsigned long long)_mm_add_epi64(v17, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v36), 32), v6));
            v16 = (unsigned long long)_mm_add_epi64(v16, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v38), 32), v6));
            v15 = (unsigned long long)_mm_add_epi64(v15, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v38), 32), v6));
            iter += 2;
            i = v24 - 32;
        } while (i);
        v2 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v15, v5), _mm_add_epi64(v19, v11)), _mm_add_epi64(_mm_add_epi64(v17, v8), _mm_add_epi64(v21, v13))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v16, v7), _mm_add_epi64(v20, v12)), _mm_add_epi64(_mm_add_epi64(v18, v10), _mm_add_epi64(v22, v14)))), _mm_unpackhi_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v15, v5), _mm_add_epi64(v19, v11)), _mm_add_epi64(_mm_add_epi64(v17, v8), _mm_add_epi64(v21, v13))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v16, v7), _mm_add_epi64(v20, v12)), _mm_add_epi64(_mm_add_epi64(v18, v10), _mm_add_epi64(v22, v14)))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v15, v5), _mm_add_epi64(v19, v11)), _mm_add_epi64(_mm_add_epi64(v17, v8), _mm_add_epi64(v21, v13))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v16, v7), _mm_add_epi64(v20, v12)), _mm_add_epi64(_mm_add_epi64(v18, v10), _mm_add_epi64(v22, v14)))))));
        if (v1 == v3)
            return v2;
        if (v1 & 24)
            goto LABEL_3ee70;
        a0 += v3;
    }
    do
    {
        v58 = a0 + 1;
        if (*(char *)a0 == v0)
            v2 += 1;
    } while ((a0 = v58, a0 != a1));
    return v2;
}
