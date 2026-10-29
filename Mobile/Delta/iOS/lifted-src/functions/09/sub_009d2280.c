/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d2280..0x9d297c (1788 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d2280_0 {
    int field_0;
    int field_4;
    unsigned long long field_8;
    unsigned int field_10;
    int field_14;
    unsigned long long field_18;
    unsigned int field_20;
    int field_24;
} st_9d2280_0;

typedef struct st_9d2280_1 {
    char padding_0[64];
    struct st_9d2280_0 *field_40;
} st_9d2280_1;


double sub_9d2280(st_9d2280_1 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    st_9d2280_0 *v3;  // x23
    unsigned long long v4;  // d0
    unsigned long long v13;  // d0
    unsigned long long v14;  // d0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v18;  // d0
    unsigned long long v19;  // d0
    unsigned long long v20;  // d0
    int v21;  // w22
    int v22;  // w21
    unsigned long long v5;  // d0
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    unsigned long long v25;  // d0
    unsigned long long v26;  // d0
    unsigned long long v27;  // d0
    unsigned long long v28;  // x8
    unsigned long long v29;  // x9
    unsigned long v30;  // x10
    unsigned long long v31;  // x11
    unsigned long long v32;  // x0
    unsigned long long v6;  // w22
    unsigned long long v33;  // q0
    __m128i v34;  // q1
    __m128i v35;  // q2
    unsigned long long v36;  // q3
    unsigned long long v37;  // q4
    uint128_t *iter;  // x12
    unsigned long long v39;  // q7
    unsigned long long v40;  // q5
    unsigned long long v41;  // q16
    unsigned long long v42;  // q6
    unsigned int v7;  // w8
    unsigned long long v43;  // q19
    unsigned long long v44;  // q17
    unsigned long long v45;  // q21
    unsigned long long v46;  // q20
    unsigned long long v47;  // q24
    unsigned long long v48;  // q18
    unsigned long long v49;  // q23
    unsigned long long v50;  // q22
    unsigned long long v51;  // q25
    unsigned long long v52;  // x13
    unsigned long long v8;  // d0
    unsigned long long v53;  // x13
    __m128i v54;  // q28
    __m128i v55;  // q27
    __m128i v56;  // q28
    __m128i v57;  // q29
    __m128i v58;  // q30
    __m128i v59;  // q28
    __m128i v60;  // q27
    __m128i v61;  // q26
    __m128i v62;  // q29
    unsigned long long v9;  // d0
    __m128i v63;  // q26
    __m128i v64;  // q27
    __m128i v65;  // q28
    __m128i v66;  // q26
    __m128i v67;  // q26
    unsigned long long v69;  // d0
    unsigned long long v70;  // x13
    unsigned long long v71;  // q0
    __m128i v72;  // q1
    unsigned long long v10;  // d0
    double *v73;  // x12
    unsigned long long v74;  // x13
    __m128i v75;  // q3
    unsigned long long v76;  // q4
    unsigned long long v77;  // q5
    __m128i v80;  // q6
    __m128i v81;  // q7
    __m128i v82;  // q6
    unsigned long long v11;  // d0
    unsigned long long v84;  // 4174
    unsigned long v85;  // x9
    unsigned long long v86;  // x8
    unsigned long long v87;  // x8
    unsigned long long v89;  // d0
    unsigned long long v12;  // d0
    char v0;  // [bp-0x41]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_40;
    if (12 >= a1)
    {
        if (9 < a1)
        {
            if (a1 == 10)
            {
                if (!v3->field_10)
                {
                    if (*(long long *)&a0[1].padding_0[0])
                    {
                        sub_9d46fc();
                        return v5;
                    }
                    return v10;
                }
                else
                {
                    return v11;
                }
            }
            if (a1 == 11)
            {
                if (*(long long *)&a0[1].padding_0[0])
                {
                    if ((int)v3->field_20 >= 1)
                    {
                        sub_9d3d58(a0, 15);
                        if ((int)v3->field_20 >= 1)
                        {
                            do
                            {
                                v6 = (unsigned int)sub_9d3fec(*(long long *)&a0[1].padding_0[0], v3->field_18 + v3->field_24);
                                sub_9d5054(a0);
                                if (v6 <= 0)
                                    return v8;
                            } while ((v7 = v3->field_24 + v6, v3->field_20 = v3->field_20 - v6, v3->field_24 = v3->field_24 + v6, sub_9d3d58(a0, 15), 0 < (int)v3->field_20));
                        }
                        *(unsigned long long *)&v3->field_20 = 0;
                        sub_9d46fc();
                        sub_9d5054(a0);
                        return v12;
                    }
                    else
                    {
                        sub_9d46fc();
                        sub_9d5054(a0);
                        return v12;
                    }
                }
                else
                {
                    return v9;
                }
            }
            if (a1 != 12)
                goto LABEL_9d2568;
            if (sub_9d4d58(a3, 117, v3->field_0, 0) >= 1 && 0 < sub_9d4d58(a3, 117, v3->field_4, 1))
                goto LABEL_9d26bc;
        }
        else if (a1 == 1)
        {
            *(unsigned long long *)&v3->field_10 = 0;
            *(unsigned long long *)&v3->field_20 = 0;
            if (!*(long long *)&a0[1].padding_0[0])
                return 0;
            sub_9d46fc();
            return 0;
        }
        else if (a1 != 2)
        {
            if (a1 != 3)
                goto LABEL_9d2568;
            return v4;
        }
        else if ((int)v3->field_10 <= 0)
        {
            sub_9d46fc();
            return v5;
        }
    }
    else
    {
        if (115 >= a1)
        {
            switch (a1)
            {
            case 13:
                if (v3->field_20)
                {
                    return v14;
                }
                else if (*(long long *)&a0[1].padding_0[0])
                {
                    sub_9d46fc();
                    return v5;
                }
                else
                {
                    return v13;
                }
            case 29:
                sub_9d1fec(a0, &v0, 0);
                _memcpy();
                return v12;
            case 101:
                if (*(long long *)&a0[1].padding_0[0])
                {
                    sub_9d3d58(a0, 15);
                    sub_9d46fc();
                    sub_9d5054(a0);
                    return v12;
                }
                break;
            default:
LABEL_9d2568:
                if (!*(long long *)&a0[1].padding_0[0])
                    return v20;
                sub_9d46fc();
                return v5;
            }
        }
        else
        {
            switch (a1)
            {
            case 116:
                v28 = v3->field_10;
                if ((int)v28 >= 1)
                {
                    v29 = v3->field_8;
                    v30 = v3->field_14;
                    if (8 > (unsigned int)v28)
                    {
                        v31 = 0;
                    }
                    else if (32 > (unsigned int)v28)
                    {
                        v32 = 0;
                        v31 = 0;
LABEL_9d287c:
                        v70 = v31;
                        v31 = v28 & 0x7ffffff8;
                        v71 = 0;
                        v72 = __double_as_longlong(__longlong_as_double(v32));
                        v73 = v29 + v70 + v30;
                        v74 = v70 - v31;
                        v75 = _mm_set1_epi64x(1);
                        v76 = 0;
                        v77 = 0;
                        do
                        {
                            v80 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(unsigned long long *)&*v73, _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, 10, 10, 10, 10, 10, 10, 10, 10)))), 8);
                            v81 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v80), 16);
                            v82 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v80), 16);
                            v77 = (unsigned long long)_mm_add_epi64(v77, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v82), 32), v75));
                            v76 = (unsigned long long)_mm_add_epi64(v76, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v82), 32), v75));
                            v71 = (unsigned long long)_mm_add_epi64(v71, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v81), 32), v75));
                            v72 = _mm_add_epi64(v72, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v81), 32), v75));
                            v84 = arm64g_calculate_condition(18, v74, 8, 0);
                            v73 += 1;
                            v74 += 8;
                        } while (v84 & 1);
                        v69 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v72, v76), _mm_add_epi64(v71, v77)), _mm_unpackhi_epi64(_mm_add_epi64(_mm_add_epi64(v72, v76), _mm_add_epi64(v71, v77)), _mm_add_epi64(_mm_add_epi64(v72, v76), _mm_add_epi64(v71, v77)))));
                        if (v31 == v28)
                            return v69;
                    }
                    else
                    {
                        v33 = 0;
                        v34 = _mm_set1_epi32(0xa0a0a0a);
                        v35 = _mm_set1_epi64x(1);
                        v31 = v28 & 0x7fffffe0;
                        v36 = 0;
                        v37 = 0;
                        iter = v30 + v29 + 16;
                        v39 = 0;
                        v40 = 0;
                        v41 = 0;
                        v42 = 0;
                        v43 = 0;
                        v44 = 0;
                        v45 = 0;
                        v46 = 0;
                        v47 = 0;
                        v48 = 0;
                        v49 = 0;
                        v50 = 0;
                        v51 = 0;
                        v52 = v31;
                        do
                        {
                            v53 = v52;
                            v54 = _mm_cmpeq_epi8(*(int128_t *)((char *)iter - 16), v34);
                            v55 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v54), 8);
                            v56 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v54), 8);
                            v57 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v56), 16);
                            v43 = (unsigned long long)_mm_add_epi64(v43, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v57), 32), v35));
                            v58 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v55), 16);
                            v59 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v56), 16);
                            v42 = (unsigned long long)_mm_add_epi64(v42, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v57), 32), v35));
                            v41 = (unsigned long long)_mm_add_epi64(v41, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v59), 32), v35));
                            v39 = (unsigned long long)_mm_add_epi64(v39, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v58), 32), v35));
                            v60 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v55), 16);
                            v40 = (unsigned long long)_mm_add_epi64(v40, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v59), 32), v35));
                            v61 = _mm_cmpeq_epi8(*iter, v34);
                            v37 = (unsigned long long)_mm_add_epi64(v37, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v58), 32), v35));
                            v62 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v61), 8);
                            v63 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v61), 8);
                            v36 = (unsigned long long)_mm_add_epi64(v36, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v60), 32), v35));
                            v64 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v63), 16);
                            v33 = (unsigned long long)_mm_add_epi64(v33, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v60), 32), v35));
                            v51 = (unsigned long long)_mm_add_epi64(v51, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v64), 32), v35));
                            v65 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v62), 16);
                            v66 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v63), 16);
                            v50 = (unsigned long long)_mm_add_epi64(v50, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v64), 32), v35));
                            v49 = (unsigned long long)_mm_add_epi64(v49, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v66), 32), v35));
                            v47 = (unsigned long long)_mm_add_epi64(v47, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v65), 32), v35));
                            v48 = (unsigned long long)_mm_add_epi64(v48, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v66), 32), v35));
                            v67 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v62), 16);
                            v46 = (unsigned long long)_mm_add_epi64(v46, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v65), 32), v35));
                            v45 = (unsigned long long)_mm_add_epi64(v45, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v67), 32), v35));
                            v44 = (unsigned long long)_mm_add_epi64(v44, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v67), 32), v35));
                            iter += 2;
                            v52 = v53 - 32;
                        } while (v52);
                        v69 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v44, v33), _mm_add_epi64(v48, v40)), _mm_add_epi64(_mm_add_epi64(v46, v37), _mm_add_epi64(v50, v42))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v45, v36), _mm_add_epi64(v49, v41)), _mm_add_epi64(_mm_add_epi64(v47, v39), _mm_add_epi64(v51, v43)))), _mm_unpackhi_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v44, v33), _mm_add_epi64(v48, v40)), _mm_add_epi64(_mm_add_epi64(v46, v37), _mm_add_epi64(v50, v42))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v45, v36), _mm_add_epi64(v49, v41)), _mm_add_epi64(_mm_add_epi64(v47, v39), _mm_add_epi64(v51, v43)))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v44, v33), _mm_add_epi64(v48, v40)), _mm_add_epi64(_mm_add_epi64(v46, v37), _mm_add_epi64(v50, v42))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v45, v36), _mm_add_epi64(v49, v41)), _mm_add_epi64(_mm_add_epi64(v47, v39), _mm_add_epi64(v51, v43)))))));
                        v32 = __double_as_longlong(v69);
                        if (v31 == v28)
                            return v69;
                        if (v28 & 24)
                            goto LABEL_9d287c;
                    }
                    v85 = v29 + v31 + v30;
                    v86 = v28 - v31;
                    do
                    {
                        v87 = v86;
                    } while ((v86 = v87 - 1, v85 += 1, v87 != 1));
                    return v69;
                }
                break;
            case 117:
                if (!a3)
                {
                    v21 = a2;
                    goto LABEL_9d25b4;
                }
                else if (*(int *)a3)
                {
                    v21 = v3->field_0;
LABEL_9d25b4:
                    v22 = a2;
                }
                else
                {
                    v22 = v3->field_4;
                    v21 = a2;
                }
                v23 = v3->field_8;
                v24 = v3->field_18;
                if (v21 <= 0x1000 || v21 == v3->field_0)
                {
LABEL_9d263c:
                    if (v22 <= 0x1000 || v22 == v3->field_4 || (v24 = sub_a6bf4c(a2, "crypto/bio/bf_buff.c", 328), v24))
                    {
                        if (v3->field_8 != v23)
                        {
                            sub_a6c2e4(v3->field_8, "crypto/bio/bf_buff.c", 336);
                            v3->field_8 = v23;
                            *(unsigned long long *)&v3->field_10 = 0;
                            v3->field_0 = v21;
                        }
                        if (v3->field_18 != v24)
                        {
                            sub_a6c2e4(v3->field_18, "crypto/bio/bf_buff.c", 343);
                            v3->field_18 = v24;
                            *(unsigned long long *)&v3->field_20 = 0;
                            v3->field_4 = v22;
                            return v26;
                        }
LABEL_9d26bc:
                        return v27;
                    }
                    else
                    {
                        if (v23 != v3->field_8)
                        {
                            sub_a6c2e4(v23, "crypto/bio/bf_buff.c", 331);
                            break;
                        }
                    }
                }
                else if ((long long)a2 >= 1)
                {
                    v23 = sub_a6bf4c(a2, "crypto/bio/bf_buff.c", 323);
                    if (!v23)
                        return v25;
                    goto LABEL_9d263c;
                }
            case 122:
                if ((long long)a2 <= v3->field_0)
                {
                    v17 = v3->field_8;
                    v3->field_10 = a2;
                    v3->field_14 = 0;
                    _memcpy(v17, a3, (int)a2);
                    return v19;
                }
                else if ((long long)a2 >= 1)
                {
                    v16 = sub_a6bf4c(a2, "crypto/bio/bf_buff.c", 292);
                    if (!v16)
                        return v18;
                    sub_a6c2e4(v3->field_8, "crypto/bio/bf_buff.c", 295);
                    v17 = v16;
                    v3->field_8 = v17;
                    v3->field_10 = a2;
                    v3->field_14 = 0;
                    _memcpy(v17, a3, (int)a2);
                    return v19;
                }
            default:
LABEL_9d2568:
                if (!*(long long *)&a0[1].padding_0[0])
                    return v20;
                sub_9d46fc();
                return v5;
            }
        }
    }
    return v89;
}
