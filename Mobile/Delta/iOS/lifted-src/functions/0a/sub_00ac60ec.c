/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac60ec..0xac6478 (908 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac60ec_3 {
    char padding_0[160];
    struct st_ac60ec_0 *field_a0;
    struct st_ac60ec_1 *field_a8;
} st_ac60ec_3;

typedef struct st_ac60ec_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac60ec_0;

typedef struct st_ac60ec_2 {
    unsigned long long field_0;
} st_ac60ec_2;

typedef struct st_ac60ec_1 {
    char padding_0[80];
    struct st_ac60ec_2 *field_50;
} st_ac60ec_1;

extern char g_10002b0;

void sub_ac60ec(st_ac60ec_3 **a0, void* a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned long v7;  // x28
    unsigned long v8;  // x27
    unsigned long long v17;  // x30
    st_ac60ec_1 *v18;  // x24
    unsigned long long v19;  // x8
    unsigned long long v20;  // x27
    char *node;  // x10
    unsigned long v22;  // cc_dep1
    char *v23;  // x9
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long long v26;  // 4110
    unsigned long v9;  // x26
    unsigned long long v27;  // 4102
    unsigned long long v28;  // x9
    uint128_t *iter;  // x10
    uint128_t *iter1;  // x11
    __m128i v31;  // q0
    unsigned long long k;  // x12
    unsigned long long v33;  // x12
    uint128_t *v34;  // x13
    __m128i v35;  // q2
    __m128i v36;  // q3
    unsigned long v10;  // x25
    __m128i v37;  // q4
    __m128i v38;  // q3
    __m128i v39;  // q4
    unsigned long long v41;  // x14
    void* v42;  // x11
    void* v43;  // x12
    unsigned long long v44;  // x13
    unsigned long long *iter2;  // x14
    __m128i v46;  // q1
    unsigned long v11;  // x24
    __m128i v47;  // q2
    __m128i v48;  // q3
    unsigned long long v50;  // 4133
    unsigned long long i;  // x9
    unsigned long long v52;  // x9
    unsigned int v53;  // w12
    unsigned long long v55;  // x10
    unsigned long long v56;  // x9
    unsigned long v12;  // x23
    uint128_t *v57;  // x10
    unsigned long long v58;  // q0
    unsigned long long v59;  // q1
    unsigned long long v60;  // q2
    unsigned long long v61;  // q3
    unsigned long long j;  // x11
    unsigned long long v63;  // x11
    __m128i v64;  // q4
    __m128i v65;  // q5
    unsigned long v13;  // x22
    unsigned long long v68;  // x11
    __m128i v69;  // q0
    double *v70;  // x8
    unsigned long long v71;  // x10
    __m128i v72;  // q1
    unsigned long long v74;  // 4116
    unsigned long long v76;  // x8
    unsigned long long v14;  // x21
    char *v77;  // x9
    char *v78;  // x9
    unsigned long long v80;  // 4122
    char *v81;  // x8
    unsigned int v82;  // w9
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    uint1048_t v0;  // [bp-0xab]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    *(unsigned long *)((char *)&v0 + 75) = v7;
    *(unsigned long *)((char *)&v0 + 83) = v8;
    *(unsigned long *)((char *)&v0 + 91) = v9;
    *(unsigned long *)((char *)&v0 + 99) = v10;
    *(unsigned long *)((char *)&v0 + 107) = v11;
    *(unsigned long *)((char *)&v0 + 115) = v12;
    *(unsigned long *)((char *)&v0 + 123) = v13;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = &v6;
    v5 = v17;
    *(long long *)((char *)&v0 + 67) = *(long long *)&g_10002b0;
    v18 = *a0->field_a8;
    v19 = *a0->field_a0->field_10;
    v20 = v19 * 2;
    if ((unsigned int)v19)
    {
        node = &v0;
        v22 = v19 & 0xffffffff;
        if ((unsigned int)v19 >= 8)
        {
            v23 = (char *)&v0 + v20;
            if (&v0 < a1 + v19)
            {
                v24 = arm64g_calculate_condition(0x33, v22, 8, 0);
                v25 = arm64g_calculate_condition(132, (v24 & 1 ? v23 : 0), (v24 & 1 ? a1 : 0), 0);
                if (!(v25 & 1))
                    goto LABEL_ac6170;
            }
            else
            {
                v26 = arm64g_calculate_condition(0x33, v22, 8, 0);
                v27 = arm64g_calculate_condition(128, (v26 & 1 ? v23 : 0), (v26 & 1 ? a1 : 0), 0);
                if (!(v27 & 1))
                {
LABEL_ac6170:
                    if (32 > (unsigned int)v19)
                    {
                        v28 = 0;
                        goto LABEL_ac641c;
                    }
                    v28 = v19 & 0xffffffe0;
                    iter = a1 + 16;
                    iter1 = (char *)&v0 + 32;
                    v31 = _mm_set1_epi32(0xf0f0f0f);
                    k = v28;
                    do
                    {
                        v33 = k;
                        v34 = (char *)iter1 - 32;
                        v35 = *iter;
                        v36 = ShrNV(*(int128_t *)((char *)iter - 16), 4);
                        v37 = _mm_and_si128(*(int128_t *)((char *)iter - 16), v31);
                        v34[1] = _mm_unpackhi_epi8(v36, v37);
                        *v34 = _mm_unpacklo_epi8(v36, v37);
                        v38 = ShrNV(v35, 4);
                        v39 = _mm_and_si128(v35, v31);
                        iter1[1] = _mm_unpackhi_epi8(v38, v39);
                        *iter1 = _mm_unpacklo_epi8(v38, v39);
                        iter += 2;
                        iter1 += 4;
                        k = v33 - 32;
                    } while (k);
                    if (v28 == v19)
                        goto LABEL_ac61ac;
                    if (v19 & 24)
                    {
LABEL_ac641c:
                        v41 = v28;
                        v28 = v19 & 0xfffffff8;
                        node = (char *)&v0 + 2 * v28;
                        v42 = a1 + v28;
                        v43 = a1 + v41;
                        v44 = v41 - v28;
                        iter2 = (char *)&v0 + 2 * v41;
                        do
                        {
                            v46 = *(unsigned long long *)&*(double *)v43;
                            v43 += 8;
                            v47 = __dirty_unsupported_Iop_ZeroHI64ofV128(ShrNV(v46, 4));
                            v48 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v46, _mm_set_epi64x(0, 0xf0f0f0f0f0f0f0f)));
                            iter2[1] = _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi16(_mm_unpacklo_epi8(v47, v47), _mm_unpacklo_epi8(v48, v48)), _mm_unpackhi_epi16(_mm_unpacklo_epi8(v47, v47), _mm_unpacklo_epi8(v48, v48))));
                            *iter2 = _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v47, v47), _mm_unpacklo_epi8(v48, v48)), _mm_unpacklo_epi16(_mm_unpacklo_epi8(v47, v47), _mm_unpacklo_epi8(v48, v48))));
                            iter2 += 2;
                            v50 = arm64g_calculate_condition(18, v44, 8, 0);
                            v44 += 8;
                        } while (v50 & 1);
                        if (v28 == v19)
                            goto LABEL_ac61ac;
                        goto LABEL_ac6188;
                    }
                    else
                    {
                        v42 = a1 + v28;
                        node = (char *)&v0 + 2 * v28;
                        goto LABEL_ac6188;
                    }
                }
            }
        }
        v28 = 0;
        v42 = a1;
LABEL_ac6188:
        i = v19 - v28;
        do
        {
            v52 = i;
            v53 = *(char *)v42;
            v42 += 1;
            *node = v53 >> 4;
            node[1] = (char)v53 & 15;
            node += 2;
            i = v52 - 1;
        } while (i);
LABEL_ac61ac:
        if (4 > (unsigned int)v19)
        {
            v55 = 0;
            v56 = 0;
        }
        else if (16 > (unsigned int)v19)
        {
            v55 = 0;
            v56 = 0;
LABEL_ac6240:
            v68 = v56;
            v56 = v20 & 0x1fffffff8;
            v69 = (unsigned short)v55;
            v70 = (char *)&v0 + v68;
            v71 = v68 - v56;
            do
            {
                v72 = *(unsigned long long *)&*v70;
                v70 += 1;
                v69 = _mm_add_epi16(v69, _mm_srli_epi16(_mm_unpacklo_epi8(v72, v72), 8));
                v74 = arm64g_calculate_condition(18, v71, 8, 0);
                v71 += 8;
            } while (v74 & 1);
            v55 = (unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_add_epi16(_mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v69, v69), _mm_unpackhi_epi64(v69, v69)), CatOddLanesV(_mm_unpackhi_epi64(v69, v69), _mm_unpackhi_epi64(v69, v69))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(v69, v69), _mm_unpackhi_epi64(v69, v69)), CatOddLanesV(_mm_unpackhi_epi64(v69, v69), _mm_unpackhi_epi64(v69, v69)))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v69, v69), _mm_unpackhi_epi64(v69, v69)), CatEvenLanesV(_mm_unpackhi_epi64(v69, v69), _mm_unpackhi_epi64(v69, v69))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v69, v69), _mm_unpackhi_epi64(v69, v69)), CatEvenLanesV(_mm_unpackhi_epi64(v69, v69), _mm_unpackhi_epi64(v69, v69))))), _mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v69, v69), _mm_unpacklo_epi64(v69, v69)), CatOddLanesV(_mm_unpacklo_epi64(v69, v69), _mm_unpacklo_epi64(v69, v69))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(v69, v69), _mm_unpacklo_epi64(v69, v69)), CatOddLanesV(_mm_unpacklo_epi64(v69, v69), _mm_unpacklo_epi64(v69, v69)))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v69, v69), _mm_unpacklo_epi64(v69, v69)), CatEvenLanesV(_mm_unpacklo_epi64(v69, v69), _mm_unpacklo_epi64(v69, v69))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v69, v69), _mm_unpacklo_epi64(v69, v69)), CatEvenLanesV(_mm_unpacklo_epi64(v69, v69), _mm_unpacklo_epi64(v69, v69)))))));
            if (v20 == v56)
                goto LABEL_ac6298;
        }
        else
        {
            v56 = v20 & 0x1ffffffe0;
            v57 = (char *)&v0 + 16;
            v58 = 0;
            v59 = 0;
            v60 = 0;
            v61 = 0;
            j = v56;
            do
            {
                v63 = j;
                v64 = *(int128_t *)((char *)v57 - 16);
                v65 = *v57;
                v59 = (unsigned long long)_mm_add_epi16(v59, _mm_srli_epi16(_mm_unpackhi_epi8(v64, v64), 8));
                v58 = (unsigned long long)_mm_add_epi16(v58, _mm_srli_epi16(_mm_unpacklo_epi8(v64, v64), 8));
                v61 = (unsigned long long)_mm_add_epi16(v61, _mm_srli_epi16(_mm_unpackhi_epi8(v65, v65), 8));
                v60 = (unsigned long long)_mm_add_epi16(v60, _mm_srli_epi16(_mm_unpacklo_epi8(v65, v65), 8));
                v57 += 2;
                j = v63 - 32;
            } while (j);
            v55 = (unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_add_epi16(_mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))), CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))), CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpackhi_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))))))), _mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))), CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))), CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59))), _mm_unpacklo_epi64(_mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)), _mm_add_epi16(_mm_add_epi16(v60, v58), _mm_add_epi16(v61, v59)))))))));
            if (v20 == v56)
                goto LABEL_ac6298;
            if (v19 & 12)
                goto LABEL_ac6240;
        }
        v76 = v56 - v20;
        v77 = (char *)&v0 + v56;
        do
        {
            v78 = v77 + 1;
            v55 += *v77;
            v80 = arm64g_calculate_condition(50, v76, 1, 0);
            v76 += 1;
            v77 = v78;
        } while (v80 & 1);
    }
    else
    {
        v55 = 0;
    }
LABEL_ac6298:
    v81 = (char *)&v0 + v20;
    v82 = v20 * 15 - v55;
    *v81 = (char)(__ROL__(v82, 24)) & 15;
    v81[1] = (char)(__ROL__(v82, 28)) & 15;
    v81[2] = (char)v82 & 15;
    v18->field_50();
}
