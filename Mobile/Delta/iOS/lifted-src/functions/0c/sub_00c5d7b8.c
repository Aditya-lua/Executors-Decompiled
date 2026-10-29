/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5d7b8..0xc5de20 (1640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5d7b8_3 {
    unsigned long long field_0;
    struct st_c5d7b8_1 *field_8;
    unsigned int field_10;
    unsigned short field_14;
} st_c5d7b8_3;

typedef struct st_c5d7b8_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
} st_c5d7b8_0;

typedef struct st_c5d7b8_1 {
    char padding_0[24];
    struct st_c5d7b8_2 *field_18;
} st_c5d7b8_1;

typedef struct st_c5d7b8_2 {
    unsigned long long field_0;
} st_c5d7b8_2;

extern char g_be766c;
extern unsigned long long g_bee42c;
extern long long g_cba67f;
extern long long g_cbabdf;
extern unsigned long long g_e0d5fb;

unsigned long long sub_c5d7b8(st_c5d7b8_3 *a0, st_c5d7b8_0 *a1, unsigned long a2, unsigned long long idx)
{
    unsigned long long v35;  // x27
    unsigned long long v36;  // x24
    unsigned long long v45;  // x11
    unsigned long long v46;  // x9
    unsigned long long v47;  // x0
    unsigned long v48;  // x20
    unsigned long long v49;  // x8
    unsigned long long iter;  // x22
    unsigned long long v51;  // x0
    unsigned long long v52;  // x1
    unsigned long long v53;  // x0
    unsigned long long v54;  // x9
    unsigned long long v37;  // x10
    __m128i v56;  // q2
    __m128i v57;  // q1
    __m128i v58;  // q4
    __m128i v59;  // q0
    __m128i v60;  // q1
    __m128i v61;  // q3
    __m128i v62;  // q2
    __m128i v63;  // q3
    unsigned int v38;  // w20
    __m128i v65;  // q4
    __m128i v66;  // q5
    __m128i v67;  // q7
    __m128i v68;  // q4
    __m128i v70;  // q4
    __m128i v71;  // q5
    __m128i v72;  // q7
    __m128i v73;  // q4
    unsigned long long v39;  // w21
    unsigned long long v75;  // x10
    char *v76;  // x9
    unsigned long long v77;  // x10
    unsigned long long v79;  // 4121
    unsigned long long v80;  // x8
    unsigned long long v81;  // x8
    unsigned long long v82;  // x22
    unsigned long v83;  // x20
    unsigned long long v84;  // x8
    unsigned long long v40;  // x28
    st_c5d7b8_1 *v85;  // x19
    unsigned long long v86;  // x23
    unsigned long long v87;  // x22
    unsigned long long v41;  // x23
    unsigned long v42;  // x22
    unsigned long v43;  // x8
    unsigned long v44;  // x10
    uint128_t v0;  // [bp-0x220], Other Possible Types: unsigned long long
    unsigned int v1;  // [bp-0x208]
    char v2;  // [bp-0x204]
    uint128_t v3;  // [bp-0x200]
    uint184_t v4;  // [bp-0x1f0]
    unsigned int v5;  // [bp-0x1d8]
    char v6;  // [bp-0x1d4]
    uint128_t v7;  // [bp-0x1d0]
    uint184_t v8;  // [bp-0x1c0]
    unsigned long v9;  // [bp-0x1a0]
    unsigned long long v10;  // [bp-0x198]
    unsigned int v11;  // [bp-0x190]
    unsigned short v12;  // [bp-0x168]
    unsigned long long v13;  // [bp-0x166]
    char *v14;  // [bp-0x160], Other Possible Types: unsigned long, unsigned long long
    unsigned long v15;  // [bp-0x158], Other Possible Types: unsigned long long
    uint136_t v16;  // [bp-0x150]
    uint184_t v17;  // [bp-0x13f]
    unsigned long long v18;  // [bp-0x128]
    unsigned long long v19;  // [bp-0x127]
    char v20;  // [bp-0x126]
    unsigned int v21;  // [bp-0x125]
    char v22;  // [bp-0x121]
    char v23;  // [bp-0x120]
    char v24;  // [bp-0x11f]
    unsigned long v25;  // [bp-0x110]
    char v27;  // [bp-0xe8], Other Possible Types: unsigned int
    char v28;  // [bp-0xe7]
    unsigned long v29;  // [bp-0xd8]
    uint128_t v31;  // [bp-0xb0]
    uint184_t v32;  // [bp-0xa0]
    char *v33;  // [bp-0x10]
    char v34;  // [bp+0x0]

    v33 = &v34;
    if (a1->field_0 & 1)
    {
        v35 = &g_e0d5fb;
        v36 = 9;
        if (!(a2 & 1))
            goto LABEL_c5d808;
    }
    else
    {
        v35 = a1->field_8;
        v36 = a1->field_10;
        if (!(a2 & 1) && v36)
        {
LABEL_c5d808:
            if (idx && *(char *)v35 == 47)
            {
                if (*(long long *)(idx + 16))
                    v37 = *(char *)*(long long *)(idx + 8) == 47;
                else
                    v37 = 0;
                v9 = *(long long *)(idx + 8);
                v10 = *(long long *)(idx + 16);
                v38 = 6;
                v11 = 6;
                v39 = 1;
                v13 = v37;
                v40 = 2;
                v41 = 1;
                v0 = v35;
                v12 = 513;
                v42 = v36;
                while (1)
                {
                    if (v38 != 6)
                    {
                        v31 = v7;
                        *(uint128_t *)&v32 = *(uint128_t *)&v8;
                        *(unsigned long long *)((char *)&v32 + 15) = *(unsigned long long *)((void*)&v8 + 15);
                    }
                    v14 = v35;
                    v15 = v42;
                    *(char *)&v16 = v38;
                    *(uint128_t *)((char *)&v16 + 1) = v31;
                    *(uint128_t *)&v17 = *(uint128_t *)&v32;
                    *(unsigned long long *)((char *)&v17 + 15) = *(unsigned long long *)((void*)&v32 + 15);
                    v20 = v39;
                    v18 = v41;
                    v19 = v40;
                    sub_c5de20(&v23, &v14);
                    sub_c5de20(&v27, &v9);
                    v43 = v23;
                    v44 = v27;
                    if ((unsigned int)v43 != 10)
                    {
                        if ((unsigned int)v44 == 10)
                            goto LABEL_c5d9d4;
                        if (5 < (unsigned int)v43)
                            v45 = v43 - 5;
                        else
                            v45 = 0;
                        v46 = v44 - 5;
                        if (5 >= (unsigned int)v44)
                            v46 = 0;
                        if (v45 != v46)
                            goto LABEL_c5daac;
                        switch (v45)
                        {
                        case 4:
LABEL_c5d9b8:
                            if (v25 == v29 && !_memcmp())
                                goto LABEL_c5d874;
                            break;
                        case 0:
                            if ((unsigned int)v43 == (unsigned int)v44)
                            {
                                if (2 >= (int)v43)
                                {
                                    if ((unsigned int)v43)
                                    {
                                        if ((unsigned int)v43 == 1)
                                            goto LABEL_c5d990;
                                        goto LABEL_c5d86c;
                                    }
                                    goto LABEL_c5d9b8;
                                }
                                if ((unsigned int)v43 == 3)
                                    goto LABEL_c5d9b8;
                                if ((unsigned int)v43 != 4)
                                {
LABEL_c5d86c:
                                    if (v24 == v28)
                                        goto LABEL_c5d874;
                                    break;
                                }
                                else
                                {
LABEL_c5d990:
                                }
                            }
                            break;
                        default:
LABEL_c5d874:
                            v38 = *(char *)&v16;
                            v7 = *(uint128_t *)((void*)&v16 + 1);
                            *(uint128_t *)&v8 = *(uint128_t *)&v17;
                            *(unsigned long long *)((char *)&v8 + 15) = *(unsigned long long *)((void*)&v17 + 15);
                            v39 = v20;
                            v5 = v21;
                            v6 = v22;
                            v40 = v19;
                            v35 = v14;
                            v41 = v18;
                            v42 = v15;
                            continue;
                        }
                        goto LABEL_c5daac;
                    }
                    else
                    {
                        if ((unsigned int)v44 == 10)
                        {
LABEL_c5d9d4:
                            v3 = v7;
                            *(uint128_t *)&v4 = *(uint128_t *)&v8;
                            *(unsigned long long *)((char *)&v4 + 15) = *(unsigned long long *)((void*)&v8 + 15);
                            v1 = v5;
                            v2 = v6;
                            if (v39 != 2)
                            {
                                *(uint128_t *)((char *)&v16 + 1) = v3;
                                *(uint128_t *)&v17 = *(uint128_t *)&v4;
                                *(unsigned long long *)((char *)&v17 + 15) = *(unsigned long long *)((void*)&v4 + 15);
                                v21 = v1;
                                v22 = v2;
                                v14 = v35;
                                v15 = v42;
                                *(char *)&v16 = v38;
                                v18 = v41;
                                v19 = v40;
                                v20 = v39;
                                v47 = sub_c45c88(&v14);
                                if (v47)
                                {
                                    sub_be8f00(&v14, v47, &v9);
                                    v35 = v0;
                                    if (v14 != 1)
                                    {
                                        v9 = v15;
                                        v10 = *(unsigned long long *)&v16;
                                        v14 = "/";
                                        v15 = &g_bee42c;
                                        *(unsigned long **)&v16 = &v9;
                                        *(char **)((char *)&v16 + 8) = &g_be766c;
                                        return sub_be769c(a0->field_0, a0->field_8, &g_cbabdf, &v14);
                                    }
                                    break;
                                }
                            }
                        }
LABEL_c5daac:
                        v35 = v0;
                        break;
                    }
                }
            }
        }
    }
    v48 = a0->field_10;
    v49 = (v48 * 0x800000000 | v48 >> 29) & 0xfffffff800000003 & 3;
    if (1 >= (int)v49)
    {
        if ((unsigned int)v49)
            v49 = 1;
    }
    else if ((unsigned int)v49 == 2)
    {
        v49 = 2;
    }
    else
    {
        v9 = v35;
        v10 = v36;
        sub_bed234(&v14, &v9);
        if (!v14)
            return v14 != 0;
        a0->field_8->field_18();
    }
    iter = 0;
    v9 = v35;
    v10 = v36;
    v0 = CONCAT(1, 1);
    while (1)
    {
        sub_bed234(&v14, &v9);
        v51 = v14;
        if (!v51)
            break;
        v52 = v15;
        if (32 <= v52)
        {
            v53 = sub_be7b5c();
        }
        else if (v52)
        {
            if (8 > v52)
            {
                v54 = 0;
                v53 = 0;
            }
            else
            {
                v54 = v52 & 24;
                v56 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(*(unsigned long long *)&*(double *)v51, _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, -65, -65, -65, -65, -65, -65, -65, -65)))), 8);
                v57 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v56), 16);
                v58 = v0;
                v59 = _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v57), 32), v58);
                v60 = _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v57), 32), v58);
                v61 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v56), 16);
                v62 = _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v61), 32), v58);
                v63 = _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v61), 32), v58);
                if (v54 != 8)
                {
                    v65 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(*(unsigned long long *)&*(double *)(v51 + 8), _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, -65, -65, -65, -65, -65, -65, -65, -65)))), 8);
                    v66 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v65), 16);
                    v67 = _mm_set1_epi64x(1);
                    v68 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v65), 16);
                    v59 = _mm_add_epi64(v59, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v68), 32), v67));
                    v60 = _mm_add_epi64(v60, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v68), 32), v67));
                    v62 = _mm_add_epi64(v62, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v66), 32), v67));
                    v63 = _mm_add_epi64(v63, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v66), 32), v67));
                    if (v54 != 16)
                    {
                        v70 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(*(unsigned long long *)&*(double *)(v51 + 16), _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, -65, -65, -65, -65, -65, -65, -65, -65)))), 8);
                        v71 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v70), 16);
                        v72 = _mm_set1_epi64x(1);
                        v73 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v70), 16);
                        v59 = _mm_add_epi64(v59, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v73), 32), v72));
                        v60 = _mm_add_epi64(v60, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v73), 32), v72));
                        v62 = _mm_add_epi64(v62, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v71), 32), v72));
                        v63 = _mm_add_epi64(v63, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v71), 32), v72));
                    }
                }
                v53 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v63, v60), _mm_add_epi64(v62, v59)), _mm_unpackhi_epi64(_mm_add_epi64(_mm_add_epi64(v63, v60), _mm_add_epi64(v62, v59)), _mm_add_epi64(_mm_add_epi64(v63, v60), _mm_add_epi64(v62, v59)))));
                if (v52 == v54)
                    goto LABEL_c5dafc;
            }
            v75 = v52 - v54;
            v76 = v51 + v54;
            do
            {
                v77 = v75;
                v79 = arm64g_calculate_condition(209, *v76, 65, 0);
                if (!(v79 & 1))
                    v53 += 1;
            } while ((v75 = v77 - 1, v76 += 1, v77 != 1));
        }
        else
        {
            v53 = 0;
        }
LABEL_c5dafc:
        if (*(unsigned long long *)((void*)&v16 + 8))
            iter += 1;
        iter += v53;
    }
    v80 = a0->field_14;
    v81 = v80 - iter;
    if (v80 < iter)
        v81 = 0;
    if (!((unsigned int)v48 & 0x8000000))
        v81 = 0;
    v27 = (unsigned int)v48 & 0x1fffff;
    if (v49 != 2)
    {
        if (v49 == 1)
        {
            v82 = 0;
            v83 = a0->field_0;
            if (v81)
                goto LABEL_c5dcb4;
        }
        else
        {
            v83 = a0->field_0;
            v82 = v81;
        }
LABEL_c5dd5c:
        v85 = a0->field_8;
    }
    else
    {
        v84 = v81 >> 1;
        v82 = v81 - v84;
        v83 = a0->field_0;
        v81 = v84;
        if (!v81)
            goto LABEL_c5dd5c;
LABEL_c5dcb4:
        v85 = a0->field_8;
        do
        {
            v86 = v81;
            v14 = &v27;
            v15 = &g_bee42c;
            if (sub_be769c(v83, a0->field_8, &g_cba67f, &v14) & 1)
                return 1;
        } while ((v81 = v86 - 1, v86 != 1));
    }
    v9 = v35;
    v10 = v36;
    sub_bed234(&v14, &v9);
    if (v14)
        v85->field_18();
    if (!v82)
        return 0;
    do
    {
        v87 = v82;
        v14 = &v27;
        v15 = &g_bee42c;
        if (sub_be769c(v83, v85, &g_cba67f, &v14))
            return 1;
    } while ((v82 = v87 - 1, v87 != 1));
    return 0;
}
