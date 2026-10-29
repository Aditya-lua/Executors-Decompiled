/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ce37c..0x3ce5fc (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_3ce37c(unsigned long a0, char *a1, unsigned int a2, long long a3)
{
    unsigned long v0;  // x8
    unsigned long v1;  // cc_dep1
    uint128_t *iter;  // x10
    uint128_t *iter1;  // x12
    __m128i v12;  // q1
    unsigned long long l;  // x13
    __m128i v14;  // q2
    __m128i v15;  // q0
    __m128i v16;  // q3
    uint128_t *v17;  // x14
    unsigned long long v18;  // x12
    unsigned long long v19;  // x10
    void* v2;  // x12
    unsigned long long m;  // x13
    unsigned long long *v21;  // x14
    unsigned long long *iter2;  // x8
    __m128i v23;  // q1
    __m128i v24;  // q0
    char *v25;  // x8
    unsigned long long j;  // x10
    unsigned long v28;  // cc_dep1
    void* v29;  // x12
    unsigned long v3;  // x9
    unsigned long v30;  // x9
    unsigned long long v31;  // x10
    unsigned long long v32;  // 4110
    unsigned long long v33;  // 4102
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    unsigned long v36;  // x9
    unsigned long long v37;  // x11
    uint128_t *v38;  // x12
    uint128_t *v39;  // x13
    unsigned long long v4;  // 4110
    __m128i v40;  // q5
    unsigned long long n;  // x14
    __m128i v42;  // q19
    __m128i v43;  // q21
    __m128i v44;  // q18
    __m128i v45;  // q4
    __m128i v46;  // q2
    __m128i v47;  // q3
    unsigned long long v48;  // x13
    long long v49;  // x12
    unsigned long long v5;  // 4102
    unsigned long long i;  // x14
    unsigned long long *node;  // x8
    unsigned long long *v52;  // x10
    __m128i v53;  // q3
    unsigned long v54;  // 4163
    unsigned long v55;  // 4166
    unsigned long v56;  // 4169
    __m128i v57;  // 4171
    __m128i v58;  // 4172
    __m128i v59;  // 4173
    unsigned long long v6;  // 4110
    __m128i v60;  // 4176
    __m128i v61;  // 4179
    __m128i v62;  // 4182
    __m128i v63;  // 4185
    __m128i v64;  // 4194
    __m128i v65;  // 4195
    __m128i v66;  // 4196
    __m128i v67;  // 4201
    __m128i v68;  // 4202
    __m128i v69;  // 4204
    unsigned long long v7;  // 4102
    __m128i v70;  // 4206
    __m128i v71;  // 4208
    __m128i v72;  // 4209
    __m128i v73;  // q2
    __m128i v74;  // 4210
    __m128i v75;  // q1
    __m128i v76;  // 4211
    __m128i v77;  // q0
    long long v78;  // x8
    char *v79;  // x9
    unsigned long v8;  // x9
    char *v80;  // x10
    long long k;  // x8
    unsigned long long v9;  // x11

    v0 = a2 - 1;
    if (a3 == 1)
    {
        if (!(v0 >> 31 & 1))
        {
            v1 = v0 & 0xffffffff;
            if ((unsigned int)v0 >= 7)
            {
                v2 = a0 + v0 * 2;
                v3 = v2 + 2;
                if (a0 < &a1[v0 + 1])
                {
                    v4 = arm64g_calculate_condition(131, v1, 7, 0);
                    v5 = arm64g_calculate_condition(132, (v4 & 1 ? v3 : 0), (v4 & 1 ? a1 : 0), 0);
                    if (!(v5 & 1))
                        goto LABEL_3ce3b0;
                }
                else
                {
                    v6 = arm64g_calculate_condition(131, v1, 7, 0);
                    v7 = arm64g_calculate_condition(128, (v6 & 1 ? v3 : 0), (v6 & 1 ? a1 : 0), 0);
                    if (!(v7 & 1))
                    {
LABEL_3ce3b0:
                        v8 = v0 + 1;
                        if (31 > (unsigned int)v0)
                        {
                            v9 = 0;
LABEL_3ce520:
                            v18 = v8 & 0xfffffff8;
                            v19 = v0 - v18;
                            m = v9 - v18;
                            v21 = &a1[v0 + -1 * v9] - 7;
                            iter2 = a0 - v9 * 2 + v0 * 2 - 14;
                            v23 = _mm_set1_epi32(-1);
                            do
                            {
                                v24 = *(unsigned long long *)&*(double *)v21;
                                v21 = (char *)v21 - 8;
                                iter2[1] = _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi16(_mm_unpacklo_epi8(v24, v24), _mm_unpacklo_epi8(v23, v23)), _mm_unpackhi_epi16(_mm_unpacklo_epi8(v24, v24), _mm_unpacklo_epi8(v23, v23))));
                                *iter2 = _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v24, v24), _mm_unpacklo_epi8(v23, v23)), _mm_unpacklo_epi16(_mm_unpacklo_epi8(v24, v24), _mm_unpacklo_epi8(v23, v23))));
                                iter2 = (char *)iter2 - 16;
                                m += 8;
                            } while (m);
                            if (v8 == v18)
                                return a0;
                        }
                        else
                        {
                            v9 = v8 & 0xffffffe0;
                            iter = &a1[v0] - 15;
                            iter1 = v2 - 30;
                            v12 = _mm_set1_epi32(-1);
                            l = v9;
                            do
                            {
                                v14 = *(int128_t *)((char *)iter - 16);
                                v15 = *iter;
                                iter1[1] = _mm_unpackhi_epi8(v15, v12);
                                *iter1 = _mm_unpacklo_epi8(v15, v12);
                                v16 = v12;
                                v17 = (char *)iter1 - 32;
                                v17[1] = _mm_unpackhi_epi8(v14, v16);
                                *v17 = _mm_unpacklo_epi8(v14, v16);
                                iter = (char *)iter - 32;
                                iter1 = (char *)iter1 - 64;
                                l -= 32;
                            } while (l);
                            if (v8 == v9)
                                return a0;
                            if (v8 & 24)
                                goto LABEL_3ce520;
                            v19 = v0 - v9;
                            goto LABEL_3ce454;
                        }
                        goto LABEL_3ce454;
                    }
                }
            }
            v19 = v0;
LABEL_3ce454:
            v25 = a0 + v19 * 2 + 1;
            do
            {
                j = v19;
                *v25 = 0xff;
                *(v25 - 1) = a1[j];
                v25 -= 2;
                v19 = j - 1;
            } while (0 < (long long)j);
            return a0;
        }
        else
        {
            return a0;
        }
    }
    else
    {
        if (!(v0 >> 31 & 1))
        {
            v28 = v0 & 0xffffffff;
            if ((unsigned int)v0 >= 7)
            {
                v29 = a0 + v0 * 4;
                v30 = v29 + 4;
                v31 = v0 * 3;
                if (a0 < &a1[v31 + 3])
                {
                    v32 = arm64g_calculate_condition(131, v28, 7, 0);
                    v33 = arm64g_calculate_condition(132, (v32 & 1 ? v30 : 0), (v32 & 1 ? a1 : 0), 0);
                    if (!(v33 & 1))
                        goto LABEL_3ce3f0;
                }
                else
                {
                    v34 = arm64g_calculate_condition(131, v28, 7, 0);
                    v35 = arm64g_calculate_condition(128, (v34 & 1 ? v30 : 0), (v34 & 1 ? a1 : 0), 0);
                    if (!(v35 & 1))
                    {
LABEL_3ce3f0:
                        v36 = v0 + 1;
                        if (15 > (unsigned int)v0)
                        {
                            v37 = 0;
LABEL_3ce400:
                            v48 = v36 & 0xfffffff8;
                            v49 = v0 - v48;
                            i = v37 - v48;
                            node = a0 - v37 * 4 + v0 * 4 - 28;
                            v52 = &a1[v31 + -3 * v37] - 21;
                            v53 = _mm_set1_epi32(-1);
                            do
                            {
                                v54 = v52[2];
                                v55 = v52[1];
                                v56 = *v52;
                                v57 = __dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi8(v55, v55), _mm_unpacklo_epi8(v56, v56), 12);
                                v58 = __dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi8(v54, v54), _mm_unpacklo_epi8(v55, v55), 8);
                                v59 = __dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi8(v56, v56), _mm_unpacklo_epi8(v54, v54), 4);
                                v60 = __dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi8(v56, v56), _mm_unpacklo_epi8(v56, v56), 6);
                                v61 = __dirty_unsupported_Iop_SliceV128(v57, v57, 6);
                                v62 = __dirty_unsupported_Iop_SliceV128(v58, v58, 6);
                                v63 = __dirty_unsupported_Iop_SliceV128(v59, v59, 6);
                                v64 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(v58, v62), _mm_set_epi64x(0xffffffff, -1)) * 0x10000000000000000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)), 4)), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v56, v56), v60), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), 12);
                                v65 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(v59, v63), _mm_set_epi64x(0xffffffff, -1)) * 0x100000000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi16(v58, v62), _mm_set_epi64x(0xffffffff, -1)), 8)), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(v58, v62), _mm_set_epi64x(0xffffffff, -1)) * 0x10000000000000000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)), 4)), 8);
                                v66 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v56, v56), v60), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(v59, v63), _mm_set_epi64x(0xffffffff, -1)) * 0x100000000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi16(v58, v62), _mm_set_epi64x(0xffffffff, -1)), 8)), 4);
                                v67 = __dirty_unsupported_Iop_SliceV128(v65, v65, 4);
                                v68 = __dirty_unsupported_Iop_SliceV128(v66, v66, 4);
                                v69 = __dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi32(v67, v68), _mm_unpacklo_epi32(v67, v68), 8);
                                v70 = __dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v56, v56), v60), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v64), _mm_unpacklo_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v56, v56), v60), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v64), 8);
                                v71 = __dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v56, v56), v60), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v64), _mm_unpacklo_epi32(v65, v66)), _mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v56, v56), v60), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v64), _mm_unpacklo_epi32(v65, v66)), 8);
                                v72 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v56, v56), v60), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v64), _mm_unpacklo_epi32(v65, v66)), v69), _mm_unpacklo_epi64(_mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v56, v56), v60), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v64), _mm_unpacklo_epi32(v65, v66)), v69)));
                                v73 = v72;
                                v74 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v70, _mm_unpacklo_epi32(v67, v68)), _mm_unpacklo_epi64(v70, _mm_unpacklo_epi32(v67, v68))));
                                v75 = v74;
                                v76 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v56, v56), v60), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v64), v71), _mm_unpacklo_epi64(_mm_unpacklo_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v56, v56), v60), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v57, v61), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v64), v71)));
                                v77 = v76;
                                v52 = (char *)v52 - 24;
                                node[3] = _mm_cvtsi128_si64(CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))) * 0x10000), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))) * 0x10000)));
                                node[2] = _mm_cvtsi128_si64(CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))) * 0x10000), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))) * 0x10000)));
                                node[1] = _mm_cvtsi128_si64(CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))) * 0x10000), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))) * 0x10000)));
                                *node = _mm_cvtsi128_si64(CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))) * 0x10000), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi8(v73, v73), _mm_unpacklo_epi8(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi8(v77, v77), _mm_unpacklo_epi8(v75, v75))) * 0x10000)));
                                node = (char *)node - 32;
                                i += 8;
                            } while (i);
                            if (v36 == v48)
                                return a0;
                        }
                        else
                        {
                            v37 = v36 & 0xfffffff0;
                            v38 = v29 - 60;
                            v39 = &a1[v31] - 45;
                            v40 = _mm_set1_epi32(-1);
                            n = v37;
                            do
                            {
                                v42 = v39[1];
                                v43 = v39[2];
                                v44 = *v39;
                                v39 = (char *)v39 - 48;
                                v45 = _mm_or_si128(_mm_and_si128(PermV(v43, _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(31, 28, 25, 22, 19, 16, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(31, 28, 25, 22, 19, 16, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_or_si128(_mm_and_si128(PermV(v42, _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(-1, -1, -1, -1, -1, -1, 29, 26, 23, 20, 0x11, 14, 11, 8, 5, 2), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(-1, -1, -1, -1, -1, -1, 29, 26, 23, 20, 0x11, 14, 11, 8, 5, 2), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v44, _mm_and_si128(_mm_set_epi64x(-0xe2e6, 1662972914418844930), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, -1, -1, -1, 29, 26, 23, 20, 0x11, 14, 11, 8, 5, 2)))), _mm_and_si128(_mm_set_epi64x(2241694297123457288, 0x706050403020100), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(31, 28, 25, 22, 19, 16, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0))));
                                v46 = _mm_or_si128(_mm_and_si128(PermV(v43, _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(29, 26, 23, 20, 0x11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(29, 26, 23, 20, 0x11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_or_si128(_mm_and_si128(PermV(v42, _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(-1, -1, -1, -1, -1, 30, 27, 24, 21, 18, 15, 12, 9, 6, 3, 0), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(-1, -1, -1, -1, -1, 30, 27, 24, 21, 18, 15, 12, 9, 6, 3, 0), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v44, _mm_and_si128(_mm_set_epi64x(0xffffffffff1e1b18, 0x15120f0c09060300), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, -1, -1, 30, 27, 24, 21, 18, 15, 12, 9, 6, 3, 0)))), _mm_and_si128(_mm_set_epi64x(2097013951447042312, 0x706050403020100), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(29, 26, 23, 20, 0x11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0))));
                                v47 = _mm_or_si128(_mm_and_si128(PermV(v43, _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(30, 27, 24, 21, 18, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(30, 27, 24, 21, 18, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_or_si128(_mm_and_si128(PermV(v42, _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(-1, -1, -1, -1, -1, 31, 28, 25, 22, 19, 16, 13, 10, 7, 4, 1), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(-1, -1, -1, -1, -1, 31, 28, 25, 22, 19, 16, 13, 10, 7, 4, 1), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v44, _mm_and_si128(_mm_set_epi64x(0xffffffffff1f1c19, 1590632741580768257), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, -1, -1, 31, 28, 25, 22, 19, 16, 13, 10, 7, 4, 1)))), _mm_and_si128(_mm_set_epi64x(2169354124285053192, 0x706050403020100), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(30, 27, 24, 21, 18, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0))));
                                v38[3] = _mm_unpackhi_epi32(CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)), CatOddLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)) * 0x10000), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)), CatOddLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)) * 0x10000)), CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)), CatOddLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)) * 0x10000), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)), CatOddLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)) * 0x10000)));
                                v38[2] = _mm_unpackhi_epi32(CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)), CatEvenLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)) * 0x10000), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)), CatEvenLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)) * 0x10000)), CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)), CatEvenLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)) * 0x10000), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)), CatEvenLanesV(_mm_unpackhi_epi64(v45, v40), _mm_unpackhi_epi64(v46, v47)) * 0x10000)));
                                v38[1] = _mm_unpackhi_epi32(CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)), CatOddLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)) * 0x10000), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)), CatOddLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)) * 0x10000)), CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)), CatOddLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)) * 0x10000), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)), CatOddLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)) * 0x10000)));
                                *v38 = _mm_unpackhi_epi32(CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)), CatEvenLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)) * 0x10000), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)), CatEvenLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)) * 0x10000)), CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)), CatEvenLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)) * 0x10000), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)), CatEvenLanesV(_mm_unpacklo_epi64(v45, v40), _mm_unpacklo_epi64(v46, v47)) * 0x10000)));
                                v38 = (char *)v38 - 64;
                                n -= 16;
                            } while (n);
                            if (v36 == v37)
                                return a0;
                            if (v36 >> 3 & 1)
                                goto LABEL_3ce400;
                            v49 = v0 - v37;
                            goto LABEL_3ce488;
                        }
                        goto LABEL_3ce488;
                    }
                }
            }
            v49 = v0;
LABEL_3ce488:
            v78 = v49 + 1;
            v79 = a0 + v49 * 4 + 3;
            v80 = &a1[3 * v49 + 2];
            do
            {
                k = v78;
                *v79 = 0xff;
                *(v79 - 1) = *v80;
                *(v79 - 2) = *(v80 - 1);
                *(v79 - 3) = *(v80 - 2);
                v79 -= 4;
                v80 -= 3;
                v78 = k - 1;
            } while (1 < k);
            return a0;
        }
        else
        {
            return a0;
        }
    }
}
