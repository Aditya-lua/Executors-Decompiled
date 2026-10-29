/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6a520..0x6a7ec (716 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6a520_0 {
    char field_0;
} st_6a520_0;


unsigned long long sub_6a520(void* a0, void* a1, char *a2)
{
    void* v2;  // x10
    unsigned int v3;  // w9
    unsigned long long v12;  // q7
    unsigned long long v13;  // q5
    unsigned long long v14;  // q16
    unsigned long long v15;  // q6
    unsigned long long v16;  // q19
    unsigned long long v17;  // q17
    unsigned long long v18;  // q21
    unsigned long long v19;  // q20
    unsigned long long v20;  // q24
    unsigned long long v21;  // q18
    unsigned long long v4;  // x8
    unsigned long long v22;  // q23
    unsigned long long v23;  // q22
    unsigned long long v24;  // q25
    unsigned long long i;  // x12
    unsigned long long v26;  // x12
    __m128i v27;  // q28
    __m128i v28;  // q27
    __m128i v29;  // q28
    __m128i v30;  // q29
    __m128i v31;  // q30
    unsigned long long v5;  // x11
    __m128i v32;  // q28
    __m128i v33;  // q27
    __m128i v34;  // q26
    __m128i v35;  // q29
    __m128i v36;  // q26
    __m128i v37;  // q27
    __m128i v38;  // q28
    __m128i v39;  // q26
    __m128i v40;  // q26
    __m128i v6;  // q1
    unsigned long long v43;  // x13
    void* v44;  // x12
    unsigned long long v45;  // q0
    __m128i v46;  // q1
    void* v47;  // x8
    unsigned long long v48;  // x11
    __m128i v49;  // q3
    unsigned long long v50;  // q4
    unsigned long long v51;  // q5
    unsigned long long v7;  // q0
    void* v52;  // x8
    __m128i v54;  // q6
    __m128i v55;  // q7
    __m128i v56;  // q6
    unsigned long long v58;  // 4174
    unsigned long v59;  // d0
    void* v60;  // x12
    __m128i v8;  // q2
    unsigned long long v9;  // q3
    unsigned long long v10;  // q4
    uint128_t *iter;  // x8
    st_6a520_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_6a520_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a1 - a0;
    if (a1 == a0)
        return 0;
    v3 = *a2;
    if (8 > v2)
    {
        v4 = 0;
    }
    else if (32 > v2)
    {
        v4 = 0;
        v5 = 0;
LABEL_6a72c:
        v43 = v2 & 0xfffffffffffffff8;
        v44 = a0 + v43;
        v45 = 0;
        v46 = __double_as_longlong(__longlong_as_double(v4));
        v47 = a0 + v5;
        v48 = v5 - v43;
        v49 = _mm_set1_epi64x(1);
        v50 = 0;
        v51 = 0;
        do
        {
            v52 = v47 + 8;
            v54 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(unsigned long long *)&*(double *)v47, v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000 | (v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000) * 0x100000000))), 8);
            v55 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v54), 16);
            v56 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v54), 16);
            v51 = (unsigned long long)_mm_add_epi64(v51, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v56), 32), v49));
            v50 = (unsigned long long)_mm_add_epi64(v50, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v56), 32), v49));
            v45 = (unsigned long long)_mm_add_epi64(v45, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v55), 32), v49));
            v46 = _mm_add_epi64(v46, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v55), 32), v49));
            v58 = arm64g_calculate_condition(18, v48, 8, 0);
            v47 = v52;
            v48 += 8;
        } while (v58 & 1);
        v59 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v46, v50), _mm_add_epi64(v45, v51)), _mm_unpackhi_epi64(_mm_add_epi64(_mm_add_epi64(v46, v50), _mm_add_epi64(v45, v51)), _mm_add_epi64(_mm_add_epi64(v46, v50), _mm_add_epi64(v45, v51)))));
        v4 = __double_as_longlong(v59);
        a0 = v44;
        if (v2 == v43)
            return __double_as_longlong(v59);
    }
    else
    {
        v6 = (__m128i)(CONCAT(v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000 | (v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000) * 0x100000000, v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000 | (v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000) * 0x100000000));
        v7 = 0;
        v8 = _mm_set1_epi64x(1);
        v9 = 0;
        v5 = v2 & 0xffffffffffffffe0;
        v10 = 0;
        iter = a0 + 16;
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
        v23 = 0;
        v24 = 0;
        i = v5;
        do
        {
            v26 = i;
            v27 = _mm_cmpeq_epi8(*(int128_t *)((char *)iter - 16), v6);
            v28 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v27), 8);
            v29 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v27), 8);
            v30 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v29), 16);
            v16 = (unsigned long long)_mm_add_epi64(v16, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v30), 32), v8));
            v31 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v28), 16);
            v32 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v29), 16);
            v15 = (unsigned long long)_mm_add_epi64(v15, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v30), 32), v8));
            v14 = (unsigned long long)_mm_add_epi64(v14, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v32), 32), v8));
            v12 = (unsigned long long)_mm_add_epi64(v12, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v31), 32), v8));
            v33 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v28), 16);
            v13 = (unsigned long long)_mm_add_epi64(v13, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v32), 32), v8));
            v34 = _mm_cmpeq_epi8(*iter, v6);
            v10 = (unsigned long long)_mm_add_epi64(v10, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v31), 32), v8));
            v35 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v34), 8);
            v36 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v34), 8);
            v9 = (unsigned long long)_mm_add_epi64(v9, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v33), 32), v8));
            v37 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v36), 16);
            v7 = (unsigned long long)_mm_add_epi64(v7, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v33), 32), v8));
            v24 = (unsigned long long)_mm_add_epi64(v24, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v37), 32), v8));
            v38 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v35), 16);
            v39 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v36), 16);
            v23 = (unsigned long long)_mm_add_epi64(v23, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v37), 32), v8));
            v22 = (unsigned long long)_mm_add_epi64(v22, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v39), 32), v8));
            v20 = (unsigned long long)_mm_add_epi64(v20, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v38), 32), v8));
            v21 = (unsigned long long)_mm_add_epi64(v21, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v39), 32), v8));
            v40 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v35), 16);
            v19 = (unsigned long long)_mm_add_epi64(v19, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v38), 32), v8));
            v18 = (unsigned long long)_mm_add_epi64(v18, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v40), 32), v8));
            v17 = (unsigned long long)_mm_add_epi64(v17, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v40), 32), v8));
            iter += 2;
            i = v26 - 32;
        } while (i);
        v4 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v17, v7), _mm_add_epi64(v21, v13)), _mm_add_epi64(_mm_add_epi64(v19, v10), _mm_add_epi64(v23, v15))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v18, v9), _mm_add_epi64(v22, v14)), _mm_add_epi64(_mm_add_epi64(v20, v12), _mm_add_epi64(v24, v16)))), _mm_unpackhi_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v17, v7), _mm_add_epi64(v21, v13)), _mm_add_epi64(_mm_add_epi64(v19, v10), _mm_add_epi64(v23, v15))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v18, v9), _mm_add_epi64(v22, v14)), _mm_add_epi64(_mm_add_epi64(v20, v12), _mm_add_epi64(v24, v16)))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v17, v7), _mm_add_epi64(v21, v13)), _mm_add_epi64(_mm_add_epi64(v19, v10), _mm_add_epi64(v23, v15))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v18, v9), _mm_add_epi64(v22, v14)), _mm_add_epi64(_mm_add_epi64(v20, v12), _mm_add_epi64(v24, v16)))))));
        if (v2 == v5)
            return v4;
        if (v2 & 24)
            goto LABEL_6a72c;
        a0 += v5;
    }
    do
    {
        v60 = a0 + 1;
        if (*(char *)a0 == v3)
            v4 += 1;
    } while ((a0 = v60, a0 != a1));
    return v4;
}
