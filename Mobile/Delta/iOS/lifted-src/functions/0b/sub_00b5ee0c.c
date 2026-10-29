/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5ee0c..0xb5f14c (832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b5ee0c(unsigned long long *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long long a5, unsigned long long a6, unsigned long long a7)
{
    unsigned long long v0;  // x11
    unsigned long long v1;  // x9
    __m128i v10;  // q3
    __m128i v11;  // q4
    __m128i v12;  // q5
    __m128i v13;  // q6
    __m128i v14;  // q7
    __m128i v15;  // q16
    __m128i v16;  // q17
    __m128i v17;  // q19
    __m128i v18;  // q18
    __m128i v19;  // q22
    unsigned long long v2;  // x10
    __m128i v20;  // q25
    __m128i v21;  // q20
    __m128i v22;  // q24
    __m128i v23;  // q26
    __m128i v24;  // q23
    unsigned long long i;  // x16
    unsigned long long v26;  // x16
    uint128_t *v27;  // x15
    uint128_t v28;  // q8
    unsigned long long v3;  // x15
    __m128i v30;  // q8
    __m128i v31;  // q9
    __m128i v32;  // q8
    __m128i v33;  // q10
    __m128i v34;  // q11
    __m128i v35;  // q8
    __m128i v36;  // q9
    __m128i v38;  // q1
    unsigned long long v4;  // x11
    unsigned long v40;  // d1
    unsigned long long v41;  // x16
    __m128i v42;  // q1
    __m128i v43;  // q2
    uint128_t v44;  // q4
    __m128i v45;  // q3
    __m128i v46;  // q4
    unsigned int *v47;  // x13
    unsigned long long v48;  // x14
    __m128i v49;  // q6
    unsigned long long v5;  // x12
    __m128i v50;  // q7
    unsigned int *v51;  // x13
    __m128i v53;  // q18
    __m128i v54;  // q18
    unsigned long long v56;  // 4176
    __m128i v57;  // q0
    unsigned long v59;  // d0
    __m128i v6;  // q0
    char *v60;  // x13
    char *v61;  // x13
    unsigned long long v62;  // x14
    unsigned long long v63;  // x11
    unsigned long v64;  // cc_dep1
    unsigned long long v65;  // 4105
    unsigned long long v66;  // 4105
    unsigned long long v67;  // x10
    __m128i v7;  // q1
    __m128i v8;  // q2
    uint128_t *v9;  // x15

    if (a5 == 1)
        v0 = a6;
    else
        v0 = a6 + 1;
    v1 = *a0;
    if (v0 > v1)
    {
        return 0;
    }
    else if (a5 != 1)
    {
        v2 = *(char *)(a2 + v1 - 1);
        if (a7)
        {
            *a0 = v1 + ~a6 - v2;
            return 1;
        }
        v3 = (long long)((v1 - (v0 + v2) ^ v0 + v2 | v0 + v2 ^ v1) ^ ~v1) >> 63;
        v4 = 0x100;
        if (v1 < 0x100)
            v4 = v1;
        if (v1)
        {
            if (4 > v1)
            {
                v5 = 0;
            }
            else
            {
                v6 = (__m128i)(CONCAT(v2, v2));
                if (16 > v1)
                {
                    v5 = 0;
LABEL_b5eec4:
                    v41 = v5;
                    v5 = v4 & 508;
                    v42 = _mm_set1_epi32(-1);
                    v43 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v3));
                    v44 = CONCAT(v41, v41);
                    v45 = _mm_or_si128(v44, _mm_set_epi64x(3, 2));
                    v46 = _mm_or_si128(v44, _mm_set_epi64x(1, 0));
                    v47 = v1 - v41 + a2 - 4;
                    v48 = v41 - v5;
                    v49 = _mm_set1_epi64x(0xff);
                    v50 = _mm_set1_epi64x(4);
                    do
                    {
                        v51 = (char *)v47 - 4;
                        v53 = __dirty_unsupported_Iop_ZeroHI64ofV128((v2 & 0xff | (v2 & 0xff) * 0x10000 | (v2 & 0xff | (v2 & 0xff) * 0x10000) * 0x100000000) ^ __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_Reverse16sIn64_x2(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v47), 8))));
                        v54 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v53), 16);
                        v42 = _mm_and_si128(_mm_or_si128(CmpGTV(v45, v6), ~_mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v54), 32), v49)), v42);
                        v43 = _mm_and_si128(_mm_or_si128(CmpGTV(v46, v6), ~_mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v54), 32), v49)), v43);
                        v45 = _mm_add_epi64(v45, v50);
                        v46 = _mm_add_epi64(v46, v50);
                        v56 = arm64g_calculate_condition(18, v48, 4, 0);
                        v47 = v51;
                        v48 += 4;
                    } while (v56 & 1);
                    v57 = _mm_and_si128(v43, v42);
                    v59 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v57, __dirty_unsupported_Iop_SliceV128(v57, v57, 8)));
                    v3 = __double_as_longlong(v59);
                    if (v4 == v5)
                        goto LABEL_b5f124;
                }
                else
                {
                    v5 = v4 & 496;
                    v7 = _mm_set1_epi32(-1);
                    v8 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v3));
                    v9 = v1 + a2 - 16;
                    v10 = _mm_set_epi64x(15, 14);
                    v11 = _mm_set_epi64x(13, 12);
                    v12 = _mm_set_epi64x(11, 10);
                    v13 = _mm_set_epi64x(9, 8);
                    v14 = _mm_set_epi64x(7, 6);
                    v15 = _mm_set1_epi64x(16);
                    v16 = _mm_set_epi64x(5, 4);
                    v17 = _mm_set1_epi32(-1);
                    v18 = _mm_set1_epi32(-1);
                    v19 = _mm_set1_epi32(-1);
                    v20 = _mm_set_epi64x(3, 2);
                    v21 = _mm_set1_epi32(-1);
                    v22 = _mm_set1_epi32(-1);
                    v23 = _mm_set_epi64x(1, 0);
                    v24 = _mm_set1_epi32(-1);
                    i = v5;
                    do
                    {
                        v26 = i;
                        v27 = (char *)v9 - 16;
                        v28 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v9);
                        v30 = _mm_xor_si128(CONCAT(v2 & 0xff | (v2 & 0xff) * 0x100 | (v2 & 0xff | (v2 & 0xff) * 0x100) * 0x10000 | (v2 & 0xff | (v2 & 0xff) * 0x100 | (v2 & 0xff | (v2 & 0xff) * 0x100) * 0x10000) * 0x100000000, v2 & 0xff | (v2 & 0xff) * 0x100 | (v2 & 0xff | (v2 & 0xff) * 0x100) * 0x10000 | (v2 & 0xff | (v2 & 0xff) * 0x100 | (v2 & 0xff | (v2 & 0xff) * 0x100) * 0x10000) * 0x100000000), __dirty_unsupported_Iop_SliceV128(v28, v28, 8));
                        v31 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v30), 8);
                        v32 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v30), 8);
                        v33 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v32), 16);
                        v34 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v31), 16);
                        v35 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v32), 16);
                        v36 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v31), 16);
                        v24 = _mm_and_si128(_mm_or_si128(CmpGTV(v10, v6), ~_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v36), 32)), v24);
                        v22 = _mm_and_si128(_mm_or_si128(CmpGTV(v11, v6), ~_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v36), 32)), v22);
                        v21 = _mm_and_si128(_mm_or_si128(CmpGTV(v12, v6), ~_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v34), 32)), v21);
                        v18 = _mm_and_si128(_mm_or_si128(CmpGTV(v14, v6), ~_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v35), 32)), v18);
                        v19 = _mm_and_si128(_mm_or_si128(CmpGTV(v13, v6), ~_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v34), 32)), v19);
                        v17 = _mm_and_si128(_mm_or_si128(CmpGTV(v16, v6), ~_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v35), 32)), v17);
                        v7 = _mm_and_si128(_mm_or_si128(CmpGTV(v20, v6), ~_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v33), 32)), v7);
                        v8 = _mm_and_si128(_mm_or_si128(CmpGTV(v23, v6), ~_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v33), 32)), v8);
                        v16 = _mm_add_epi64(v16, v15);
                        v20 = _mm_add_epi64(v20, v15);
                        v23 = _mm_add_epi64(v23, v15);
                        v14 = _mm_add_epi64(v14, v15);
                        v13 = _mm_add_epi64(v13, v15);
                        v12 = _mm_add_epi64(v12, v15);
                        v11 = _mm_add_epi64(v11, v15);
                        v10 = _mm_add_epi64(v10, v15);
                        v9 = v27;
                        i = v26 - 16;
                    } while (i);
                    v38 = _mm_and_si128(_mm_and_si128(_mm_and_si128(v8, v19), _mm_and_si128(v17, v22)), _mm_and_si128(_mm_and_si128(v7, v21), _mm_and_si128(v18, v24)));
                    v40 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v38, __dirty_unsupported_Iop_SliceV128(v38, v38, 8)));
                    v3 = __double_as_longlong(v40);
                    if (v4 == v5)
                        goto LABEL_b5f124;
                    if (v4 & 12)
                        goto LABEL_b5eec4;
                }
            }
            v60 = a2 + v1 + ~v5;
            do
            {
                v61 = v60 - 1;
                v62 = *v60 ^ ~(unsigned int)v2 | 0xffffffffffffff00;
                if (v5 > v2)
                    v62 = 0xffffffffffffffff;
            } while ((v3 &= v62, v5 += 1, v60 = v61, v4 != v5));
        }
LABEL_b5f124:
        v63 = v3 & 0xff;
        v64 = v63;
        if (v63 != 0xff)
        {
            v65 = arm64g_calculate_condition(20, v64, 0xff, 0);
            if (!(v65 & 1))
                goto LABEL_b5f132;
LABEL_b5f131:
            v67 = 0;
        }
        else
        {
            v66 = arm64g_calculate_condition(20, v64, 0xff, 0);
            if (v66 & 1)
                goto LABEL_b5f131;
LABEL_b5f132:
            v67 = ~v2;
        }
        *a0 = v67 + v1;
    }
}
