/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f8f74..0x9f96d4 (1888 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;
extern char g_10002b0;

void sub_9f8f74(char *a0, char *a1, unsigned int a2, unsigned long long a3, long long a4, void* a5, unsigned int a6)
{
    unsigned int v26;  // w9
    unsigned int v27;  // w8
    unsigned long long v36;  // 4102
    unsigned int v37;  // w9
    unsigned long v38;  // x28
    unsigned int v39;  // w10
    char *v40;  // x8
    unsigned int v41;  // w11
    unsigned int v42;  // w9
    unsigned int v43;  // w9
    char *v44;  // x8
    char *v45;  // x8
    unsigned long long v28;  // 4118
    char *v46;  // x8
    char *v47;  // x8
    char *v48;  // x8
    char *v49;  // x8
    char *v50;  // x8
    char *v51;  // x8
    unsigned long v52;  // x11
    char *iter;  // x10
    char v54;  // x12
    char v55;  // x13
    unsigned long long iter1;  // x21
    __m128i v56;  // q0
    uint128_t v59;  // q2
    __m128i v60;  // q2
    __m128i v61;  // q0
    __m128i v62;  // q0
    unsigned long v63;  // d1
    uint128_t v65;  // q4
    char *v30;  // x23
    uint128_t v66;  // q2
    uint128_t v67;  // q1
    unsigned long long v70;  // d0
    unsigned long long v71;  // 4102
    unsigned int v72;  // w10
    unsigned int v73;  // w27
    unsigned long v74;  // x28
    unsigned int v75;  // x10
    char *v31;  // x24
    char *v76;  // x8
    unsigned int v77;  // w9
    unsigned int v78;  // x11
    unsigned int v79;  // w9
    char *v80;  // x8
    char *v81;  // x8
    char *v82;  // x8
    char *v83;  // x8
    char *v84;  // x8
    char *v85;  // x8
    unsigned long long v32;  // x26
    char *v86;  // x8
    char *v87;  // x8
    __m128i v88;  // q0
    uint128_t v91;  // q2
    __m128i v92;  // q2
    __m128i v93;  // q0
    __m128i v94;  // q0
    unsigned long v95;  // d1
    unsigned long v33;  // x25
    uint128_t v96;  // q4
    uint128_t v97;  // q4
    uint128_t v98;  // q2
    uint128_t v99;  // q1
    unsigned long long v102;  // d0
    unsigned int v103;  // w12
    char *node;  // x11
    unsigned int v105;  // w10
    unsigned long v34;  // x28
    unsigned long v35;  // cc_dep1
    __m128i v0;  // [bp-0xd0]
    uint128_t v1;  // [bp-0xc0], Other Possible Types: unsigned long
    uint128_t v2;  // [bp-0xb0], Other Possible Types: unsigned long
    unsigned int v3;  // [bp-0x9c]
    unsigned long v4;  // [bp-0x98]
    char v5;  // [bp-0x90], Other Possible Types: unsigned long, unsigned long long
    char v6;  // [bp-0x8f]
    char v7;  // [bp-0x8e]
    char v8;  // [bp-0x8d]
    char v9;  // [bp-0x8c]
    char v10;  // [bp-0x8b]
    char v11;  // [bp-0x8a]
    char v12;  // [bp-0x89]
    char v13;  // [bp-0x88]
    char v14;  // [bp-0x87]
    char v15;  // [bp-0x86]
    char v16;  // [bp-0x85]
    char v17;  // [bp-0x84]
    char v18;  // [bp-0x83]
    char v19;  // [bp-0x82]
    char v20;  // [bp-0x81]
    unsigned int v21;  // [bp-0x80]
    unsigned int v22;  // [bp-0x7c]
    unsigned long v23;  // [bp-0x78]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v23 = *(long long *)&g_10002b0;
    v26 = a2 + 7;
    if ((int)a2 < 0)
        v27 = v26;
    else
        v27 = a2;
    if ((int)v26 < 0)
        v26 = a2 + 14;
    v28 = arm64g_calculate_condition(49, a2 - 65, 64, 0);
    if (!(v28 & 1))
    {
        iter1 = a3;
        v30 = a1;
        v31 = a0;
        v4 = (int)(v27) >> 3;
        v32 = (int)(v26) >> 3;
        v3 = a2 - (v27 & 0xfffffff8);
        v33 = *(int *)a5;
        v34 = (int)a5[4];
        v35 = v32;
        if (a6)
        {
            v36 = arm64g_calculate_condition(132, v35, a3, 0);
            if (v36 & 1)
                goto LABEL_9f9328;
            v37 = v3;
            v1 = v4 + 1;
            v2 = CONCAT(v37 | v37 * 0x100000000, v37 | v37 * 0x100000000);
            v0 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT(8 - v37 & 0xffffffff | (8 - v37 & 0xffffffff) * 0x100000000, 8 - v37 & 0xffffffff | (8 - v37 & 0xffffffff) * 0x100000000));
            do
            {
                v38 = v34;
                v21 = v33;
                v22 = v38;
                sub_9f96d4(&v21, a4, 1);
                v39 = 0;
                v40 = &v31[v32];
                if (4 >= (int)v32)
                {
                    if (2 >= (int)v32)
                    {
                        if ((unsigned int)v32 != 1)
                        {
                            v41 = 0;
                            v42 = 0;
                            if ((unsigned int)v32 != 2)
                                goto LABEL_9f9138;
                            goto LABEL_9f9128;
                        }
                        else
                        {
                            v43 = 0;
LABEL_9f9130:
                            v51 = v40 - 1;
                            v42 = v43 | *(v40 - 1);
                            v40 = v51;
                            goto LABEL_9f9138;
                        }
                    }
                    v42 = 0;
                    if ((unsigned int)v32 == 3)
                        goto LABEL_9f9120;
                    if ((unsigned int)v32 != 4)
                        goto LABEL_9f9138;
                    goto LABEL_9f9118;
                }
                if (6 >= (int)v32)
                {
                    if ((unsigned int)v32 == 5)
                        goto LABEL_9f9110;
                    v42 = 0;
                    if ((unsigned int)v32 != 6)
                        goto LABEL_9f9138;
                    goto LABEL_9f9108;
                }
                if ((unsigned int)v32 == 7)
                {
LABEL_9f9100:
                    v45 = v40 - 1;
                    v39 |= *(v40 - 1) * 0x10000;
                    v40 = v45;
LABEL_9f9108:
                    v46 = v40 - 1;
                    v39 |= *(v40 - 1) * 0x100;
                    v40 = v46;
LABEL_9f9110:
                    v47 = v40 - 1;
                    v39 |= *(v40 - 1);
                    v40 = v47;
LABEL_9f9118:
                    v48 = v40 - 1;
                    v42 = *(v40 - 1) * &_NSHomeDirectory;
                    v40 = v48;
LABEL_9f9120:
                    v49 = v40 - 1;
                    v41 = v42 | *(v40 - 1) * 0x10000;
                    v40 = v49;
LABEL_9f9128:
                    v50 = v40 - 1;
                    v43 = v41 | *(v40 - 1) * 0x100;
                    v40 = v50;
                    goto LABEL_9f9130;
                }
                else if ((unsigned int)v32 == 8)
                {
                    v44 = v40 - 1;
                    v39 = *(v40 - 1) * &_NSHomeDirectory;
                    v40 = v44;
                    goto LABEL_9f9100;
                }
                else
                {
                    v42 = 0;
LABEL_9f9138:
                    v34 = v21 ^ v42;
                    v52 = v22 ^ v39;
                    iter = &v30[v32];
                    v54 = (unsigned int)v34 >> 8;
                    v55 = (unsigned int)v34 >> 16;
                    if (4 >= (int)v32)
                    {
                        if (2 >= (int)v32)
                        {
                            if ((unsigned int)v32 == 1)
                                goto LABEL_9f91e0;
                            if ((unsigned int)v32 != 2)
                                continue;
                            goto LABEL_9f91dc;
                        }
                        if ((unsigned int)v32 == 3)
                            goto LABEL_9f91d8;
                        if ((unsigned int)v32 != 4)
                            continue;
                        goto LABEL_9f91d0;
                    }
                    if (6 >= (int)v32)
                    {
                        if ((unsigned int)v32 == 5)
                            goto LABEL_9f91cc;
                        if ((unsigned int)v32 != 6)
                            continue;
                    }
                    else
                    {
                        if ((unsigned int)v32 != 7)
                        {
                            if ((unsigned int)v32 != 8)
                                continue;
                            *(iter - 1) = (unsigned int)v52 >> 24;
                            iter -= 1;
                        }
                        *(iter - 1) = (unsigned int)v52 >> 16;
                        iter -= 1;
                    }
                    *(iter - 1) = (unsigned int)v52 >> 8;
                    iter -= 1;
LABEL_9f91cc:
                    *(iter - 1) = v52;
                    iter -= 1;
LABEL_9f91d0:
                    *(iter - 1) = (unsigned int)v34 >> 24;
                    iter -= 1;
LABEL_9f91d8:
                    *(iter - 1) = v55;
                    iter -= 1;
LABEL_9f91dc:
                    *(iter - 1) = v54;
                    iter -= 1;
LABEL_9f91e0:
                    *(iter - 1) = v34;
                    iter -= 1;
                }
                switch (a2)
                {
                case 32:
                    break;
                case 64:
                    v38 = v34;
                    v34 = v52;
                    break;
                default:
                    v5 = v33;
                    v6 = (unsigned int)v33 >> 8;
                    v7 = (unsigned int)v33 >> 16;
                    v8 = (unsigned int)v33 >> 24;
                    v9 = v38;
                    v10 = (unsigned int)v38 >> 8;
                    v11 = (unsigned int)v38 >> 16;
                    v12 = (unsigned int)v38 >> 24;
                    v13 = v34;
                    v14 = v54;
                    v15 = v55;
                    v16 = (unsigned int)v34 >> 24;
                    v17 = v52;
                    v18 = (unsigned int)v52 >> 8;
                    v19 = (unsigned int)v52 >> 16;
                    v20 = (unsigned int)v52 >> 24;
                    if (v3)
                    {
                        v56 = *(long long *)&(&v5)[v1];
                        v59 = _INSERT(_INSERT(__float_as_int(__int_as_float((unsigned int)(char)_mm_extract_epi8(v56, 3))), 2, (char)_mm_extract_epi8(v56, 4)), 4, (char)_mm_extract_epi8(v56, 5));
                        v60 = (__m128i)_INSERT(v59, 6, (char)_mm_extract_epi8(v56, 6));
                        v61 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v56), 8);
                        v62 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v61), 16);
                        v63 = __dirty_unsupported_Iop_ZeroHI64ofV128(_INSERT(__float_as_int(__int_as_float((unsigned int)(char)_mm_extract_epi8(v56, 1))), 4, (char)_mm_extract_epi8(v56, 2)) & 0xff000000ff);
                        v65 = _INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi32(__float_as_int(__int_as_float((unsigned int)(&v5)[v4])), v62)), 8, __double_as_longlong(v63));
                        v66 = __dirty_unsupported_Iop_Sh32Ux4(v65, v2);
                        v67 = __dirty_unsupported_Iop_Sh32Ux4(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v60), 16), v2);
                        v70 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(CatEvenLanesV(_mm_or_si128(__dirty_unsupported_Iop_Sh32Ux4(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v61), 16), v0), v67), _mm_or_si128(__dirty_unsupported_Iop_Sh32Ux4(v62, v0), v66))));
                        v5 = v70;
                        v38 = (unsigned int)v5;
                        v34 = *(unsigned int *)((void*)&v5 + 4);
                        break;
                    }
                    else
                    {
                        v38 = *(long long *)&(&v5)[v4];
                        v5 = v38;
                        v34 = v38 >> 32;
                        break;
                    }
                }
                v33 = v38;
                iter1 -= v32;
                v31 = &v40[v32];
                v30 = &iter[v32];
            } while (iter1 >= v32);
        }
        else
        {
            v71 = arm64g_calculate_condition(148, v35, a3, 0);
            if (!(v71 & 1))
            {
LABEL_9f9328:
            }
            else
            {
                v72 = v3;
                v2 = v4 + 1;
                v0 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT(8 - v72 & 0xffffffff | (8 - v72 & 0xffffffff) * 0x100000000, 8 - v72 & 0xffffffff | (8 - v72 & 0xffffffff) * 0x100000000));
                v1 = CONCAT(v72 | v72 * 0x100000000, v72 | v72 * 0x100000000);
                do
                {
                    v73 = v33;
                    v74 = v34;
                    v21 = v33;
                    v22 = v34;
                    sub_9f96d4(&v21, a4, 1);
                    v75 = 0;
                    v76 = &v31[v32];
                    if (4 >= (int)v32)
                    {
                        if (2 >= (int)v32)
                        {
                            v77 = 0;
                            if ((unsigned int)v32 == 1)
                                goto LABEL_9f94e8;
                            v78 = 0;
                            if ((unsigned int)v32 != 2)
                                goto LABEL_9f94f0;
                            goto LABEL_9f94e0;
                        }
                        if ((unsigned int)v32 != 3)
                        {
                            v78 = 0;
                            if ((unsigned int)v32 != 4)
                                goto LABEL_9f94f0;
                            goto LABEL_9f94d0;
                        }
                        else
                        {
                            v79 = 0;
LABEL_9f94d8:
                            v85 = v76 - 1;
                            v77 = v79 | *(v76 - 1) * 0x10000;
                            v76 = v85;
LABEL_9f94e0:
                            v86 = v76 - 1;
                            v77 |= *(v76 - 1) * 0x100;
                            v76 = v86;
LABEL_9f94e8:
                            v87 = v76 - 1;
                            v78 = v77 | *(v76 - 1);
                            v76 = v87;
LABEL_9f94f0:
                            if (a2 == 32)
                                goto LABEL_9f9644;
                            goto LABEL_9f94f8;
                        }
                    }
                    if (6 >= (int)v32)
                    {
                        if ((unsigned int)v32 == 5)
                            goto LABEL_9f94c8;
                        v78 = 0;
                        if ((unsigned int)v32 != 6)
                            goto LABEL_9f94f0;
                        goto LABEL_9f94c0;
                    }
                    if ((unsigned int)v32 == 7)
                    {
LABEL_9f94b8:
                        v81 = v76 - 1;
                        v75 |= *(v76 - 1) * 0x10000;
                        v76 = v81;
LABEL_9f94c0:
                        v82 = v76 - 1;
                        v75 |= *(v76 - 1) * 0x100;
                        v76 = v82;
LABEL_9f94c8:
                        v83 = v76 - 1;
                        v75 |= *(v76 - 1);
                        v76 = v83;
LABEL_9f94d0:
                        v84 = v76 - 1;
                        v79 = *(v76 - 1) * &_NSHomeDirectory;
                        v76 = v84;
                        goto LABEL_9f94d8;
                    }
                    else if ((unsigned int)v32 == 8)
                    {
                        v80 = v76 - 1;
                        v75 = *(v76 - 1) * &_NSHomeDirectory;
                        v76 = v80;
                        goto LABEL_9f94b8;
                    }
                    else
                    {
                        v78 = 0;
                        if (a2 != 32)
                        {
LABEL_9f94f8:
                            v33 = v78;
                            v34 = v75;
                            if (a2 != 64)
                            {
                                v5 = v73;
                                v6 = v73 >> 8;
                                v7 = v73 >> 16;
                                v8 = v73 >> 24;
                                v9 = v74;
                                v10 = (unsigned int)v74 >> 8;
                                v11 = (unsigned int)v74 >> 16;
                                v12 = (unsigned int)v74 >> 24;
                                v13 = v78;
                                v14 = v78 >> 8;
                                v15 = v78 >> 16;
                                v16 = v78 >> 24;
                                v17 = v75;
                                v18 = v75 >> 8;
                                v19 = v75 >> 16;
                                v20 = v75 >> 24;
                                if (v3)
                                {
                                    v88 = *(long long *)&(&v5)[v2];
                                    v91 = _INSERT(_INSERT(__float_as_int(__int_as_float((unsigned int)(char)_mm_extract_epi8(v88, 3))), 2, (char)_mm_extract_epi8(v88, 4)), 4, (char)_mm_extract_epi8(v88, 5));
                                    v92 = (__m128i)_INSERT(v91, 6, (char)_mm_extract_epi8(v88, 6));
                                    v93 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v88), 8);
                                    v94 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v93), 16);
                                    v95 = __dirty_unsupported_Iop_ZeroHI64ofV128(_INSERT(__float_as_int(__int_as_float((unsigned int)(char)_mm_extract_epi8(v88, 1))), 4, (char)_mm_extract_epi8(v88, 2)) & 0xff000000ff);
                                    v96 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi32(__float_as_int(__int_as_float((unsigned int)(&v5)[v4])), v94));
                                    v97 = _INSERT(v96, 8, __double_as_longlong(v95));
                                    v98 = __dirty_unsupported_Iop_Sh32Ux4(v97, v1);
                                    v99 = __dirty_unsupported_Iop_Sh32Ux4(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v92), 16), v1);
                                    v102 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(CatEvenLanesV(_mm_or_si128(__dirty_unsupported_Iop_Sh32Ux4(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v93), 16), v0), v99), _mm_or_si128(__dirty_unsupported_Iop_Sh32Ux4(v94, v0), v98))));
                                    v5 = v102;
                                    v33 = (unsigned int)v5;
                                    v34 = *(unsigned int *)((void*)&v5 + 4);
                                    goto LABEL_9f964c;
                                }
                                else
                                {
                                    v33 = *(long long *)&(&v5)[v4];
                                    v5 = v33;
                                    v34 = v33 >> 32;
                                    goto LABEL_9f964c;
                                }
                            }
                        }
                        else
                        {
LABEL_9f9644:
                            v33 = v74;
                            v34 = v78;
LABEL_9f964c:
                            v103 = v21 ^ v78;
                            node = &v30[v32];
                            if (4 < (int)v32)
                            {
                                v105 = v22 ^ v75;
                                if (6 >= (int)v32)
                                {
                                    if ((unsigned int)v32 == 5)
                                    {
LABEL_9f93e4:
                                        *(node - 1) = v105;
                                        node -= 1;
                                        goto LABEL_9f93e8;
                                    }
                                    else
                                    {
                                        if ((unsigned int)v32 != 6)
                                            continue;
                                    }
                                }
                                else
                                {
                                    if ((unsigned int)v32 != 7)
                                    {
                                        if ((unsigned int)v32 != 8)
                                            continue;
                                        *(node - 1) = v105 >> 24;
                                        node -= 1;
                                    }
                                    *(node - 1) = v105 >> 16;
                                    node -= 1;
                                }
                                *(node - 1) = v105 >> 8;
                                node -= 1;
                                goto LABEL_9f93e4;
                            }
                            else if (2 < (int)v32)
                            {
                                if ((unsigned int)v32 == 3)
                                {
LABEL_9f93f0:
                                    *(node - 1) = v103 >> 16;
                                    node -= 1;
                                    goto LABEL_9f93f8;
                                }
                                else
                                {
                                    if ((unsigned int)v32 != 4)
                                        continue;
                                }
LABEL_9f93e8:
                                *(node - 1) = v103 >> 24;
                                node -= 1;
                                goto LABEL_9f93f0;
                            }
                            else if ((unsigned int)v32 == 1)
                            {
LABEL_9f9400:
                                *(node - 1) = v103;
                                node -= 1;
                            }
                            else
                            {
                                if ((unsigned int)v32 != 2)
                                    continue;
LABEL_9f93f8:
                                *(node - 1) = v103 >> 8;
                                node -= 1;
                                goto LABEL_9f9400;
                            }
                        }
                    }
                } while ((iter1 -= v32, v31 = &v76[v32], v30 = &node[v32], iter1 >= v32));
            }
        }
        *(char *)a5 = v33;
        *(char *)&a5[1] = (unsigned int)v33 >> 8;
        *(char *)&a5[2] = (unsigned int)v33 >> 16;
        *(char *)&a5[3] = (unsigned int)v33 >> 24;
        *(char *)&a5[4] = v34;
        *(char *)&a5[5] = (unsigned int)v34 >> 8;
        *(char *)&a5[6] = (unsigned int)v34 >> 16;
        *(char *)&a5[7] = (unsigned int)v34 >> 24;
    }
    if (*(long long *)&g_10002b0 == v23)
        return;
    ___stack_chk_fail();
}
