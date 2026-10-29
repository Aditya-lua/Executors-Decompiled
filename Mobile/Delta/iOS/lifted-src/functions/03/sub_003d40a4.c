/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d40a4..0x3d42b8 (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d40a4_0 {
    char field_0;
    uint128_t field_1;
} st_3d40a4_0;


void* sub_3d40a4(void* a0, char *a1, st_3d40a4_0 *a2, unsigned long long a3)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x9
    char *v10;  // x13
    char *v11;  // x14
    st_3d40a4_0 *v12;  // x10
    unsigned long v13;  // 4110
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long long v17;  // 4129
    unsigned long v18;  // x10
    unsigned long v19;  // 4110
    char v2;  // x8
    unsigned long long v20;  // 4129
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4103
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4103
    unsigned long long v25;  // x10
    unsigned long long v26;  // x11
    __m128i v27;  // q5
    char *v28;  // x12
    st_3d40a4_0 *v29;  // x13
    unsigned long long v3;  // x12
    void* iter;  // x14
    __m128i v31;  // q1
    uint128_t v32;  // q2
    __m128i v33;  // q3
    unsigned long long j;  // x15
    unsigned long long v35;  // x15
    char *v36;  // x12
    __m128i v37;  // q7
    __m128i v38;  // q6
    st_3d40a4_0 *v39;  // x13
    char v4;  // x8
    __m128i v40;  // q19
    __m128i v41;  // q17
    __m128i v42;  // q16
    __m128i v43;  // q17
    __m128i v44;  // q20
    __m128i v45;  // q6
    __m128i v46;  // q7
    __m128i v47;  // q18
    __m128i v48;  // q19
    __m128i v49;  // q19
    unsigned long v5;  // x8
    __m128i v50;  // q20
    unsigned long long v52;  // x13
    st_3d40a4_0 *v53;  // x10
    char *v54;  // x11
    unsigned long long i;  // x8
    void* node;  // x9
    unsigned long long v57;  // x8
    char *v58;  // x11
    st_3d40a4_0 *v59;  // x10
    unsigned long v6;  // cc_dep1
    unsigned long long v7;  // x9
    void* v8;  // x9
    char *v9;  // x11

    v0 = a2->field_0;
    v1 = *a1 * 3;
    if (a3 == 1)
    {
        v2 = (unsigned int)v0 + (unsigned int)v1 + 2 >> 2;
        *(char *)&a0[1] = v2;
        *(char *)a0 = v2;
        return a0;
    }
    v3 = v1 + v0;
    v4 = (unsigned int)v3 + 2 >> 2;
    *(char *)a0 = v4;
    if (a3 >= 2)
    {
        v5 = a3;
        v6 = a3;
        if (0x11 > a3)
        {
            v7 = 1;
            goto LABEL_3d40f8;
        }
        else
        {
            v8 = a0 + 1;
            v9 = a0 + v5 * 2 - 1;
            v10 = a1 + 1;
            v11 = &a1[v5];
            v12 = &(&a2->field_0)[1];
            if (v8 < &(&a2->field_0)[v5])
            {
                v13 = arm64g_calculate_condition(0x33, v6, 0x11, 0);
                v14 = 4;
                v15 = (v13 & 1 ? v12 : 0x20000000);
                v16 = (v13 & 1 ? v9 : 0);
                v17 = arm64g_calculate_condition(36, v15, v16, 0);
                v18 = !(v17 & 1);
                if (v10 >= v9)
                    goto LABEL_3d4192;
LABEL_3d4191:
                v21 = arm64g_calculate_condition(v14 | 48, v15, v16, 0);
                v7 = 1;
                v22 = arm64g_calculate_condition(52, (v21 & 1 ? v8 : 0x20000000), (v21 & 1 ? v11 : 0), 0);
                if (!(v22 & 1))
                    goto LABEL_3d419c;
LABEL_3d40f8:
                v53 = &(&a2->field_0)[v7];
                v54 = &a1[v7];
                i = v5 - v7;
                node = a0 + v7 * 2;
                do
                {
                    v57 = i;
                    v58 = v54 + 1;
                    v59 = &(&v53->field_0)[1];
                    v52 = *v54 * 3 + v53->field_0;
                    *((char *)node - 1) = (unsigned int)v3 * 3 + (unsigned int)v52 + 8 >> 4;
                    *(char *)node = (unsigned int)v3 + (unsigned int)v52 * 3 + 8 >> 4;
                    node += 2;
                    i = v57 - 1;
                    v3 = v52;
                    v53 = v59;
                    v54 = v58;
                } while (i);
            }
            else
            {
                v19 = arm64g_calculate_condition(0x33, v6, 0x11, 0);
                v14 = 0;
                v15 = (v19 & 1 ? v12 : 0x20000000);
                v16 = (v19 & 1 ? v9 : 0);
                v20 = arm64g_calculate_condition(32, v15, v16, 0);
                v18 = !(v20 & 1);
                if (v10 < v9)
                    goto LABEL_3d4191;
LABEL_3d4192:
                v23 = arm64g_calculate_condition(v14 | 48, v15, v16, 0);
                v7 = 1;
                v24 = arm64g_calculate_condition(48, (v23 & 1 ? v8 : 0x20000000), (v23 & 1 ? v11 : 0), 0);
                if (v24 & 1)
                    goto LABEL_3d40f8;
                v7 = 1;
LABEL_3d419c:
                if (v18 & 1)
                    goto LABEL_3d40f8;
                v25 = v5 - 1;
                v26 = v25 & 0xfffffffffffffff0;
                v7 = v26 | 1;
                v27 = (__m128i)(CONCAT(v3 & 0xffffffff | (v3 & 0xffffffff) * 0x100000000, v3 & 0xffffffff | (v3 & 0xffffffff) * 0x100000000));
                v28 = a1 + 1;
                v29 = &(&a2->field_0)[1];
                iter = a0 + 1;
                v31 = _mm_set1_epi32(3);
                v32 = CONCAT(844437815230467, 844437815230467);
                v33 = _mm_set1_epi32(8);
                j = v26;
                do
                {
                    v35 = j;
                    v36 = v28 + 16;
                    v37 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int128_t *)v28), 8);
                    v38 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), *(int128_t *)v28), 8);
                    v39 = &v29->field_1;
                    v40 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), *(int128_t *)&v29->field_0), 8);
                    v41 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int128_t *)&v29->field_0), 8);
                    v42 = _mm_add_epi32(MullV(_mm_cvtsi128_si64(v37), 844437815230467), _mm_srli_epi32(_mm_unpacklo_epi16(v41, v41), 16));
                    v43 = __dirty_unsupported_Iop_SliceV128(v42, v27, 12);
                    v44 = _mm_add_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v41), 16), MullV(_mm_extract_epi64(v37, 1), (unsigned long long)(v32 >> 64)));
                    v27 = _mm_add_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v40), 16), MullV(_mm_extract_epi64(v38, 1), (unsigned long long)(v32 >> 64)));
                    v45 = _mm_add_epi32(MullV(_mm_cvtsi128_si64(v38), 844437815230467), _mm_srli_epi32(_mm_unpacklo_epi16(v40, v40), 16));
                    v46 = __dirty_unsupported_Iop_SliceV128(v44, v42, 12);
                    v47 = __dirty_unsupported_Iop_SliceV128(v45, v44, 12);
                    v48 = __dirty_unsupported_Iop_SliceV128(v27, v45, 12);
                    v49 = _mm_or_si128(_mm_and_si128(PermV(_mm_srli_epi32(_mm_add_epi32(_mm_add_epi32(v27, _mm_mullo_epi32(v48, v31)), v33), 4), _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_srli_epi32(_mm_add_epi32(_mm_add_epi32(v45, _mm_mullo_epi32(v47, v31)), v33), 4), _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_srli_epi32(_mm_add_epi32(_mm_add_epi32(v44, _mm_mullo_epi32(v46, v31)), v33), 4), _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_srli_epi32(_mm_add_epi32(_mm_add_epi32(v42, _mm_mullo_epi32(v43, v31)), v33), 4), _mm_and_si128(_mm_set_epi64x(4339275622475375648, 0x1c1814100c080400), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0))))));
                    v50 = _mm_or_si128(_mm_and_si128(PermV(_mm_srli_epi32(_mm_add_epi32(_mm_add_epi32(v48, _mm_mullo_epi32(v27, v31)), v33), 4), _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_srli_epi32(_mm_add_epi32(_mm_add_epi32(v47, _mm_mullo_epi32(v45, v31)), v33), 4), _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_srli_epi32(_mm_add_epi32(_mm_add_epi32(v46, _mm_mullo_epi32(v44, v31)), v33), 4), _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_srli_epi32(_mm_add_epi32(_mm_add_epi32(v43, _mm_mullo_epi32(v42, v31)), v33), 4), _mm_and_si128(_mm_set_epi64x(4339275622475375648, 0x1c1814100c080400), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0))))));
                    *(__m128i *)&iter[16] = _mm_unpackhi_epi8(v49, v50);
                    *(__m128i *)iter = _mm_unpacklo_epi8(v49, v50);
                    iter += 32;
                    v28 = v36;
                    v29 = v39;
                    j = v35 - 16;
                } while (j);
                v3 = _mm_extract_epi32(v27, 3);
                v52 = v3;
                if (v25 != v26)
                    goto LABEL_3d40f8;
            }
        }
        v4 = (unsigned int)v52 + 2 >> 2;
    }
    *((char *)a0 + 2 * a3 - 1) = v4;
    return a0;
}
