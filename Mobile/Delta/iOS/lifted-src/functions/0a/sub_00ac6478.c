/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac6478..0xac686c (1012 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac6478_3 {
    char padding_0[160];
    struct st_ac6478_0 *field_a0;
    struct st_ac6478_1 *field_a8;
    unsigned long long field_b0;
} st_ac6478_3;

typedef struct st_ac6478_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac6478_0;

typedef struct st_ac6478_1 {
    char padding_0[40];
    struct st_ac6478_2 *field_28;
} st_ac6478_1;

typedef struct st_ac6478_2 {
    unsigned long long field_0;
} st_ac6478_2;

extern char g_10002b0;

unsigned long long sub_ac6478(st_ac6478_3 **a0, unsigned long a1, void* a2, unsigned long a3, unsigned long a4, unsigned long long a5, unsigned long long a6)
{
    st_ac6478_3 *v10;  // x8
    unsigned long v11;  // x28
    unsigned long long v20;  // 4102
    unsigned long long v21;  // x9
    uint128_t *iter;  // x10
    uint128_t *node;  // x11
    __m128i v24;  // q0
    unsigned long long k;  // x12
    unsigned long long v26;  // x12
    uint128_t *v27;  // x13
    __m128i v28;  // q2
    __m128i v29;  // q3
    unsigned long long *v12;  // x19
    __m128i v30;  // q4
    __m128i v31;  // q3
    __m128i v32;  // q4
    unsigned long long v34;  // x14
    void* v35;  // x11
    void* v36;  // x12
    unsigned long long v37;  // x13
    unsigned long long *iter1;  // x14
    __m128i v39;  // q1
    unsigned long long v13;  // x8
    __m128i v40;  // q2
    __m128i v41;  // q3
    unsigned long long v43;  // 4133
    unsigned long long i;  // x9
    unsigned long long v45;  // x9
    unsigned int v46;  // w12
    unsigned long long v48;  // x10
    unsigned long long v49;  // x9
    char *iter2;  // x10
    uint128_t *v50;  // x10
    unsigned long long v51;  // q0
    unsigned long long v52;  // q1
    unsigned long long v53;  // q2
    unsigned long long v54;  // q3
    unsigned long long j;  // x11
    unsigned long long v56;  // x11
    __m128i v57;  // q4
    __m128i v58;  // q5
    unsigned long v15;  // cc_dep1
    unsigned long long v61;  // x11
    __m128i v62;  // q0
    double *v63;  // x10
    unsigned long long v64;  // x11
    __m128i v65;  // q1
    unsigned long long v67;  // 4116
    unsigned long long v69;  // x11
    char *v16;  // x9
    char *v70;  // x9
    unsigned long long v73;  // 4122
    char *v74;  // x9
    unsigned int v75;  // w10
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4110
    unsigned long v0;  // [bp-0x998]
    unsigned long long v1;  // [bp-0x990]
    unsigned long long v2;  // [bp-0x988]
    st_ac6478_1 *v3;  // [bp-0x980]
    unsigned long long v4;  // [bp-0x978]
    char v5;  // [bp-0x970]
    char v6;  // [bp-0x913]
    uint896_t v7;  // [bp-0xb3]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    *(long long *)((char *)&v7 + 67) = *(long long *)&g_10002b0;
    v10 = *a0;
    v11 = v10->field_a0->field_10;
    v3 = v10->field_a8;
    v4 = 0;
    v12 = v10->field_a8->field_28;
    if (sub_c68800(&v5, &v6, 2144, 0))
    {
        v13 = v11 * 2;
        v1 = a5;
        v2 = a6;
        v0 = v10->field_b0;
        if (!(unsigned int)v11)
        {
            v74 = (char *)&v7 + v13;
            v75 = v13 * 15 - 0;
            *v74 = (char)(__ROL__(v75, 24)) & 15;
            v74[1] = (char)(__ROL__(v75, 28)) & 15;
            v74[2] = (char)v75 & 15;
            v12();
        }
        iter2 = &v7;
        v15 = v11 & 0xffffffff;
        if ((unsigned int)v11 >= 8)
        {
            v16 = (char *)&v7 + v13;
            if (&v7 < a2 + v11)
            {
                v17 = arm64g_calculate_condition(0x33, v15, 8, 0);
                v18 = arm64g_calculate_condition(132, (v17 & 1 ? v16 : 0), (v17 & 1 ? a2 : 0), 0);
                if (!(v18 & 1))
                    goto LABEL_ac6524;
            }
            else
            {
                v19 = arm64g_calculate_condition(0x33, v15, 8, 0);
                v20 = arm64g_calculate_condition(128, (v19 & 1 ? v16 : 0), (v19 & 1 ? a2 : 0), 0);
                if (!(v20 & 1))
                {
LABEL_ac6524:
                    if (32 > (unsigned int)v11)
                    {
                        v21 = 0;
                        goto LABEL_ac6810;
                    }
                    v21 = v11 & 0xffffffe0;
                    iter = a2 + 16;
                    node = (char *)&v7 + 32;
                    v24 = _mm_set1_epi32(0xf0f0f0f);
                    k = v21;
                    do
                    {
                        v26 = k;
                        v27 = (char *)node - 32;
                        v28 = *iter;
                        v29 = ShrNV(*(int128_t *)((char *)iter - 16), 4);
                        v30 = _mm_and_si128(*(int128_t *)((char *)iter - 16), v24);
                        v27[1] = _mm_unpackhi_epi8(v29, v30);
                        *v27 = _mm_unpacklo_epi8(v29, v30);
                        v31 = ShrNV(v28, 4);
                        v32 = _mm_and_si128(v28, v24);
                        node[1] = _mm_unpackhi_epi8(v31, v32);
                        *node = _mm_unpacklo_epi8(v31, v32);
                        iter += 2;
                        node += 4;
                        k = v26 - 32;
                    } while (k);
                    if (v21 == v11)
                        goto LABEL_ac6568;
                    if (v11 & 24)
                    {
LABEL_ac6810:
                        v34 = v21;
                        v21 = v11 & 0xfffffff8;
                        iter2 = (char *)&v7 + 2 * v21;
                        v35 = a2 + v21;
                        v36 = a2 + v34;
                        v37 = v34 - v21;
                        iter1 = (char *)&v7 + 2 * v34;
                        do
                        {
                            v39 = *(unsigned long long *)&*(double *)v36;
                            v36 += 8;
                            v40 = __dirty_unsupported_Iop_ZeroHI64ofV128(ShrNV(v39, 4));
                            v41 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v39, _mm_set_epi64x(0, 0xf0f0f0f0f0f0f0f)));
                            iter1[1] = _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi16(_mm_unpacklo_epi8(v40, v40), _mm_unpacklo_epi8(v41, v41)), _mm_unpackhi_epi16(_mm_unpacklo_epi8(v40, v40), _mm_unpacklo_epi8(v41, v41))));
                            *iter1 = _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v40, v40), _mm_unpacklo_epi8(v41, v41)), _mm_unpacklo_epi16(_mm_unpacklo_epi8(v40, v40), _mm_unpacklo_epi8(v41, v41))));
                            iter1 += 2;
                            v43 = arm64g_calculate_condition(18, v37, 8, 0);
                            v37 += 8;
                        } while (v43 & 1);
                        if (v21 == v11)
                            goto LABEL_ac6568;
                        goto LABEL_ac6544;
                    }
                    else
                    {
                        v35 = a2 + v21;
                        iter2 = (char *)&v7 + 2 * v21;
                        goto LABEL_ac6544;
                    }
                }
            }
        }
        v21 = 0;
        v35 = a2;
LABEL_ac6544:
        i = v11 - v21;
        do
        {
            v45 = i;
            v46 = *(char *)v35;
            v35 += 1;
            *iter2 = v46 >> 4;
            iter2[1] = (char)v46 & 15;
            iter2 += 2;
            i = v45 - 1;
        } while (i);
LABEL_ac6568:
        if (4 > (unsigned int)v11)
        {
            v48 = 0;
            v49 = 0;
        }
        else if (16 > (unsigned int)v11)
        {
            v48 = 0;
            v49 = 0;
LABEL_ac65fc:
            v61 = v49;
            v49 = v13 & 0x1fffffff8;
            v62 = (unsigned short)v48;
            v63 = (char *)&v7 + v61;
            v64 = v61 - v49;
            do
            {
                v65 = *(unsigned long long *)&*v63;
                v63 += 1;
                v62 = _mm_add_epi16(v62, _mm_srli_epi16(_mm_unpacklo_epi8(v65, v65), 8));
                v67 = arm64g_calculate_condition(18, v64, 8, 0);
                v64 += 8;
            } while (v67 & 1);
            v48 = (unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_add_epi16(_mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v62, v62), _mm_unpackhi_epi64(v62, v62)), CatOddLanesV(_mm_unpackhi_epi64(v62, v62), _mm_unpackhi_epi64(v62, v62))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(v62, v62), _mm_unpackhi_epi64(v62, v62)), CatOddLanesV(_mm_unpackhi_epi64(v62, v62), _mm_unpackhi_epi64(v62, v62)))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v62, v62), _mm_unpackhi_epi64(v62, v62)), CatEvenLanesV(_mm_unpackhi_epi64(v62, v62), _mm_unpackhi_epi64(v62, v62))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v62, v62), _mm_unpackhi_epi64(v62, v62)), CatEvenLanesV(_mm_unpackhi_epi64(v62, v62), _mm_unpackhi_epi64(v62, v62))))), _mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v62, v62), _mm_unpacklo_epi64(v62, v62)), CatOddLanesV(_mm_unpacklo_epi64(v62, v62), _mm_unpacklo_epi64(v62, v62))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(v62, v62), _mm_unpacklo_epi64(v62, v62)), CatOddLanesV(_mm_unpacklo_epi64(v62, v62), _mm_unpacklo_epi64(v62, v62)))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v62, v62), _mm_unpacklo_epi64(v62, v62)), CatEvenLanesV(_mm_unpacklo_epi64(v62, v62), _mm_unpacklo_epi64(v62, v62))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v62, v62), _mm_unpacklo_epi64(v62, v62)), CatEvenLanesV(_mm_unpacklo_epi64(v62, v62), _mm_unpacklo_epi64(v62, v62)))))));
            if (v13 == v49)
            {
                v74 = (char *)&v7 + v13;
                v75 = v13 * 15 - v48;
                *v74 = (char)(__ROL__(v75, 24)) & 15;
                v74[1] = (char)(__ROL__(v75, 28)) & 15;
                v74[2] = (char)v75 & 15;
                v12();
            }
        }
        else
        {
            v49 = v13 & 0x1ffffffe0;
            v50 = (char *)&v7 + 16;
            v51 = 0;
            v52 = 0;
            v53 = 0;
            v54 = 0;
            j = v49;
            do
            {
                v56 = j;
                v57 = *(int128_t *)((char *)v50 - 16);
                v58 = *v50;
                v52 = (unsigned long long)_mm_add_epi16(v52, _mm_srli_epi16(_mm_unpackhi_epi8(v57, v57), 8));
                v51 = (unsigned long long)_mm_add_epi16(v51, _mm_srli_epi16(_mm_unpacklo_epi8(v57, v57), 8));
                v54 = (unsigned long long)_mm_add_epi16(v54, _mm_srli_epi16(_mm_unpackhi_epi8(v58, v58), 8));
                v53 = (unsigned long long)_mm_add_epi16(v53, _mm_srli_epi16(_mm_unpacklo_epi8(v58, v58), 8));
                v50 += 2;
                j = v56 - 32;
            } while (j);
            v48 = (unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_add_epi16(_mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))), CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))), CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))))))), _mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))), CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))), CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)), _mm_add_epi16(_mm_add_epi16(v53, v51), _mm_add_epi16(v54, v52)))))))));
            if (v13 == v49)
            {
                v74 = (char *)&v7 + v13;
                v75 = v13 * 15 - v48;
                *v74 = (char)(__ROL__(v75, 24)) & 15;
                v74[1] = (char)(__ROL__(v75, 28)) & 15;
                v74[2] = (char)v75 & 15;
                v12();
            }
            if (v11 & 12)
                goto LABEL_ac65fc;
        }
        v69 = v49 - v13;
        v70 = (char *)&v7 + v49;
        do
        {
            v48 += *v70;
            v73 = arm64g_calculate_condition(50, v69, 1, 0);
            v70 += 1;
            v69 += 1;
        } while (v73 & 1);
        v74 = (char *)&v7 + v13;
        v75 = v13 * 15 - v48;
        *v74 = (char)(__ROL__(v75, 24)) & 15;
        v74[1] = (char)(__ROL__(v75, 28)) & 15;
        v74[2] = (char)v75 & 15;
        v12();
    }
    else
    {
        if (*(long long *)&g_10002b0 == *(unsigned long long *)((void*)&v7 + 67))
            return 0;
        ___stack_chk_fail();
    }
}
