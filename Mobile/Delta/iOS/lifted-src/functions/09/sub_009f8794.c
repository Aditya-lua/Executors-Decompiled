/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f8794..0x9f8e44 (1712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;
extern char g_10002b0;

void sub_9f8794(char *a0, char *a1, unsigned int a2, unsigned long long a3, long long a4, long long a5, long long a6, void* a7)
{
    unsigned long long iter;  // x23
    char *v28;  // x25
    unsigned int v37;  // w9
    unsigned long v38;  // x27
    unsigned int v39;  // w8
    char *v40;  // x28
    unsigned int v41;  // w9
    char *v42;  // x28
    char *v43;  // x28
    char *v44;  // x28
    char *v45;  // x28
    char *v46;  // x28
    char *v29;  // x28
    char *v47;  // x28
    char *v48;  // x28
    char *v49;  // x28
    unsigned long v50;  // x9
    char *iter1;  // x19
    char v52;  // x10
    char v53;  // x11
    __m128i v54;  // q0
    __m128i v55;  // q1
    __m128i v56;  // q0
    unsigned long long v30;  // x26
    uint128_t v59;  // q3
    uint128_t v60;  // q3
    uint128_t v61;  // q2
    unsigned long v64;  // d0
    unsigned long long v65;  // 4102
    unsigned int v66;  // w8
    unsigned int v31;  // w20
    unsigned int v67;  // w8
    unsigned int v68;  // w9
    unsigned int v69;  // w22
    unsigned int v70;  // w21
    unsigned int v71;  // x19
    char *v72;  // x27
    unsigned int v73;  // x28
    char *v74;  // x27
    char *v75;  // x27
    char *v76;  // x27
    unsigned long v32;  // x27
    char *v77;  // x27
    char *v78;  // x27
    char *v79;  // x27
    char *v80;  // x27
    char *v81;  // x27
    __m128i v82;  // q0
    __m128i v83;  // q1
    __m128i v84;  // q0
    unsigned long v33;  // cc_dep1
    uint128_t v87;  // q3
    uint128_t v88;  // q3
    uint128_t v89;  // q2
    unsigned long v92;  // d0
    unsigned int v93;  // w10
    char *node;  // x9
    unsigned int v95;  // w11
    unsigned long long v34;  // 4102
    unsigned int v35;  // w8
    unsigned int v36;  // w8
    __m128i v0;  // [bp-0xf0]
    uint128_t v1;  // [bp-0xe0]
    uint128_t n1;  // [bp-0xc0], Other Possible Types: long long
    uint128_t v3;  // [bp-0xb0], Other Possible Types: unsigned int
    long long n;  // [bp-0xa0]
    uint72_t v5;  // [bp-0x80]
    uint72_t v6;  // [bp-0x80]
    uint72_t v7;  // [bp-0x80]
    uint72_t v8;  // [bp-0x80]
    uint72_t v9;  // [bp-0x80]
    uint72_t v10;  // [bp-0x80]
    uint72_t v11;  // [bp-0x80]
    uint72_t v12;  // [bp-0x80]
    char v13;  // [bp-0x80]
    char v14;  // [bp-0x80]
    char v15;  // [bp-0x77]
    char v16;  // [bp-0x76]
    char v17;  // [bp-0x75]
    char v18;  // [bp-0x74]
    char v19;  // [bp-0x73]
    char v20;  // [bp-0x72]
    char v21;  // [bp-0x71]
    unsigned int v22;  // [bp-0x70]
    unsigned int v23;  // [bp-0x6c]
    unsigned long v24;  // [bp-0x68]
    char *v25;  // [bp-0x10]
    char v26;  // [bp+0x0], Other Possible Types: unsigned int

    v25 = &v26;
    v24 = *(long long *)&g_10002b0;
    if (64 >= (int)a2)
    {
        iter = a3;
        v28 = a1;
        v29 = a0;
        v30 = a2 + 7 >> 3;
        v31 = *(int *)a7;
        v32 = (int)a7[4];
        v33 = v30;
        if (v26)
        {
            v34 = arm64g_calculate_condition(132, v33, a3, 0);
            if (v34 & 1)
                goto LABEL_9f8ad4;
            v35 = ((int)a2 < 0 ? a2 + 7 : a2);
            v36 = v35 & 0xfffffff8;
            v37 = a2 - v36;
            n = (a2 == v36 ? 8 : 9);
            n1 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT(8 - v37 | (8 - v37) * 0x100000000, 8 - v37 | (8 - v37) * 0x100000000));
            v3 = CONCAT(v37 | v37 * 0x100000000, v37 | v37 * 0x100000000);
            v14 = v13;
            do
            {
                v38 = v32;
                v22 = v31;
                v23 = v38;
                sub_9fb3ec(&v22, a4, a5, a6);
                v39 = 0;
                v40 = &v29[v30];
                if (4 >= (int)v30)
                {
                    v41 = 0;
                    if (2 >= (int)v30)
                    {
                        if ((unsigned int)v30 == 1)
                            goto LABEL_9f8934;
                        if ((unsigned int)v30 != 2)
                            goto LABEL_9f893c;
                        goto LABEL_9f892c;
                    }
                    if ((unsigned int)v30 == 3)
                        goto LABEL_9f8924;
                    if ((unsigned int)v30 != 4)
                        goto LABEL_9f893c;
                    goto LABEL_9f8918;
                }
                if (6 >= (int)v30)
                {
                    if ((unsigned int)v30 == 5)
                        goto LABEL_9f8910;
                    v41 = 0;
                    if ((unsigned int)v30 != 6)
                        goto LABEL_9f893c;
                    goto LABEL_9f8908;
                }
                if ((unsigned int)v30 == 7)
                {
LABEL_9f8900:
                    v43 = v40 - 1;
                    v39 |= *(v40 - 1) * 0x10000;
                    v40 = v43;
LABEL_9f8908:
                    v44 = v40 - 1;
                    v39 |= *(v40 - 1) * 0x100;
                    v40 = v44;
LABEL_9f8910:
                    v45 = v40 - 1;
                    v39 |= *(v40 - 1);
                    v40 = v45;
LABEL_9f8918:
                    v41 = v39;
                    v46 = v40 - 1;
                    v39 = *(v40 - 1) * &_NSHomeDirectory;
                    v40 = v46;
LABEL_9f8924:
                    v47 = v40 - 1;
                    v39 |= *(v40 - 1) * 0x10000;
                    v40 = v47;
LABEL_9f892c:
                    v48 = v40 - 1;
                    v39 |= *(v40 - 1) * 0x100;
                    v40 = v48;
LABEL_9f8934:
                    v49 = v40 - 1;
                    v39 |= *(v40 - 1);
                    v40 = v49;
                    goto LABEL_9f893c;
                }
                else if ((unsigned int)v30 == 8)
                {
                    v42 = v40 - 1;
                    v39 = *(v40 - 1) * &_NSHomeDirectory;
                    v40 = v42;
                    goto LABEL_9f8900;
                }
                else
                {
                    v41 = 0;
LABEL_9f893c:
                    v32 = v22 ^ v39;
                    v50 = v23 ^ v41;
                    iter1 = &v28[v30];
                    v52 = (unsigned int)v32 >> 8;
                    v53 = (unsigned int)v32 >> 16;
                    if (4 >= (int)v30)
                    {
                        if (2 >= (int)v30)
                        {
                            if ((unsigned int)v30 == 1)
                                goto LABEL_9f89e4;
                            if ((unsigned int)v30 != 2)
                                continue;
                            goto LABEL_9f89e0;
                        }
                        if ((unsigned int)v30 == 3)
                            goto LABEL_9f89dc;
                        if ((unsigned int)v30 != 4)
                            continue;
                        goto LABEL_9f89d4;
                    }
                    if (6 >= (int)v30)
                    {
                        if ((unsigned int)v30 == 5)
                            goto LABEL_9f89d0;
                        if ((unsigned int)v30 != 6)
                            continue;
                    }
                    else
                    {
                        if ((unsigned int)v30 != 7)
                        {
                            if ((unsigned int)v30 != 8)
                                continue;
                            *(iter1 - 1) = (unsigned int)v50 >> 24;
                            iter1 -= 1;
                        }
                        *(iter1 - 1) = (unsigned int)v50 >> 16;
                        iter1 -= 1;
                    }
                    *(iter1 - 1) = (unsigned int)v50 >> 8;
                    iter1 -= 1;
LABEL_9f89d0:
                    *(iter1 - 1) = v50;
                    iter1 -= 1;
LABEL_9f89d4:
                    *(iter1 - 1) = (unsigned int)v32 >> 24;
                    iter1 -= 1;
LABEL_9f89dc:
                    *(iter1 - 1) = v53;
                    iter1 -= 1;
LABEL_9f89e0:
                    *(iter1 - 1) = v52;
                    iter1 -= 1;
LABEL_9f89e4:
                    *(iter1 - 1) = v32;
                    iter1 -= 1;
                }
                switch (a2)
                {
                case 32:
                    break;
                case 64:
                    v38 = v32;
                    v32 = v50;
                    break;
                default:
                    v5 = _INSERT(v14, 0, v31);
                    v6 = _INSERT(v5, 1, v31 >> 8);
                    v7 = _INSERT(v6, 2, v31 >> 16);
                    v8 = _INSERT(v7, 3, v31 >> 24);
                    v9 = _INSERT(v8, 4, v38);
                    v10 = _INSERT(v9, 5, (unsigned int)v38 >> 8);
                    v11 = _INSERT(v10, 6, (unsigned int)v38 >> 16);
                    v12 = _INSERT(v11, 7, (unsigned int)v38 >> 24);
                    v14 = _INSERT(v12, 8, v32);
                    v15 = v52;
                    v16 = v53;
                    v17 = (unsigned int)v32 >> 24;
                    v18 = v50;
                    v19 = (unsigned int)v50 >> 8;
                    v20 = (unsigned int)v50 >> 16;
                    v21 = (unsigned int)v50 >> 24;
                    ___memmove_chk(&v14, &(&v14)[(int)(v35) >> 3], n, 16);
                    if (v37)
                    {
                        v54 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(unsigned long long *)((void*)&v14 + 1)), 8);
                        v55 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v54), 16);
                        v56 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v54), 16);
                        v59 = _INSERT(__dirty_unsupported_Iop_SliceV128(v56, v56, 12), 0, *&v14);
                        v60 = __dirty_unsupported_Iop_Sh32Ux4(v59, v3);
                        v61 = __dirty_unsupported_Iop_Sh32Ux4(__dirty_unsupported_Iop_SliceV128(v55, v56, 12), v3);
                        v64 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(CatEvenLanesV(_mm_or_si128(__dirty_unsupported_Iop_Sh32Ux4(v55, n1), v61), _mm_or_si128(__dirty_unsupported_Iop_Sh32Ux4(v56, n1), v60))));
                        *(unsigned long *)&v14 = v64;
                    }
                    v38 = *(unsigned int *)&v14;
                    v32 = *(unsigned int *)((void*)&v14 + 4);
                    break;
                }
                v31 = v38;
                iter -= v30;
                v29 = &v40[v30];
                v28 = &iter1[v30];
            } while (iter >= v30);
        }
        else
        {
            v65 = arm64g_calculate_condition(148, v33, a3, 0);
            if (!(v65 & 1))
            {
LABEL_9f8ad4:
            }
            else
            {
                v66 = ((int)a2 < 0 ? a2 + 7 : a2);
                n = &(&v13)[(int)(v66) >> 3];
                v67 = v66 & 0xfffffff8;
                v68 = a2 - v67;
                n1 = (a2 == v67 ? 8 : 9);
                v3 = v68;
                v0 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT(8 - v68 | (8 - v68) * 0x100000000, 8 - v68 | (8 - v68) * 0x100000000));
                v1 = CONCAT(v68 | v68 * 0x100000000, v68 | v68 * 0x100000000);
                do
                {
                    v69 = v31;
                    v70 = v32;
                    v22 = v31;
                    v23 = v32;
                    sub_9fb3ec(&v22, a4, a5, a6);
                    v71 = 0;
                    v72 = &v29[v30];
                    if (4 >= (int)v30)
                    {
                        v73 = 0;
                        if (2 >= (int)v30)
                        {
                            if ((unsigned int)v30 == 1)
                                goto LABEL_9f8cac;
                            if ((unsigned int)v30 != 2)
                                goto LABEL_9f8cb4;
                            goto LABEL_9f8ca4;
                        }
                        if ((unsigned int)v30 == 3)
                            goto LABEL_9f8c9c;
                        if ((unsigned int)v30 != 4)
                            goto LABEL_9f8cb4;
                        goto LABEL_9f8c90;
                    }
                    if (6 >= (int)v30)
                    {
                        if ((unsigned int)v30 == 5)
                            goto LABEL_9f8c88;
                        v73 = 0;
                        if ((unsigned int)v30 != 6)
                            goto LABEL_9f8cb4;
                        goto LABEL_9f8c80;
                    }
                    if ((unsigned int)v30 == 7)
                    {
LABEL_9f8c78:
                        v75 = v72 - 1;
                        v71 |= *(v72 - 1) * 0x10000;
                        v72 = v75;
LABEL_9f8c80:
                        v76 = v72 - 1;
                        v71 |= *(v72 - 1) * 0x100;
                        v72 = v76;
LABEL_9f8c88:
                        v77 = v72 - 1;
                        v71 |= *(v72 - 1);
                        v72 = v77;
LABEL_9f8c90:
                        v73 = v71;
                        v78 = v72 - 1;
                        v71 = *(v72 - 1) * &_NSHomeDirectory;
                        v72 = v78;
LABEL_9f8c9c:
                        v79 = v72 - 1;
                        v71 |= *(v72 - 1) * 0x10000;
                        v72 = v79;
LABEL_9f8ca4:
                        v80 = v72 - 1;
                        v71 |= *(v72 - 1) * 0x100;
                        v72 = v80;
LABEL_9f8cac:
                        v81 = v72 - 1;
                        v71 |= *(v72 - 1);
                        v72 = v81;
LABEL_9f8cb4:
                        if (a2 == 32)
                            goto LABEL_9f8db4;
                        goto LABEL_9f8cbc;
                    }
                    else if ((unsigned int)v30 == 8)
                    {
                        v74 = v72 - 1;
                        v71 = *(v72 - 1) * &_NSHomeDirectory;
                        v72 = v74;
                        goto LABEL_9f8c78;
                    }
                    else
                    {
                        v73 = 0;
                        if (a2 != 32)
                        {
LABEL_9f8cbc:
                            v31 = v71;
                            v32 = v73;
                            if (a2 != 64)
                            {
                                v5 = _INSERT(v13, 0, v69);
                                *((char *)&v5 + 1) = v69 >> 8;
                                *((char *)&v5 + 2) = v69 >> 16;
                                *((char *)&v5 + 3) = v69 >> 24;
                                *((char *)&v5 + 4) = v70;
                                *((char *)&v5 + 5) = v70 >> 8;
                                *((char *)&v5 + 6) = v70 >> 16;
                                *((char *)&v5 + 7) = v70 >> 24;
                                v13 = _INSERT(v5, 8, v71);
                                v15 = v71 >> 8;
                                v16 = v71 >> 16;
                                v17 = v71 >> 24;
                                v18 = v73;
                                v19 = v73 >> 8;
                                v20 = v73 >> 16;
                                v21 = v73 >> 24;
                                ___memmove_chk(&v13, n, n1, 16);
                                if (v3)
                                {
                                    v82 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(unsigned long long *)((void*)&v13 + 1)), 8);
                                    v83 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v82), 16);
                                    v84 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v82), 16);
                                    v87 = _INSERT(__dirty_unsupported_Iop_SliceV128(v84, v84, 12), 0, *&v13);
                                    v88 = __dirty_unsupported_Iop_Sh32Ux4(v87, v1);
                                    v89 = __dirty_unsupported_Iop_Sh32Ux4(__dirty_unsupported_Iop_SliceV128(v83, v84, 12), v1);
                                    v92 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(CatEvenLanesV(_mm_or_si128(__dirty_unsupported_Iop_Sh32Ux4(v83, v0), v89), _mm_or_si128(__dirty_unsupported_Iop_Sh32Ux4(v84, v0), v88))));
                                    *(unsigned long *)&v13 = v92;
                                }
                                v31 = *(unsigned int *)&v13;
                                v32 = *(unsigned int *)((void*)&v13 + 4);
                                goto LABEL_9f8dbc;
                            }
                        }
                        else
                        {
LABEL_9f8db4:
                            v31 = v70;
                            v32 = v71;
LABEL_9f8dbc:
                            v93 = v22 ^ v71;
                            node = &v28[v30];
                            if (4 < (int)v30)
                            {
                                v95 = v23 ^ v73;
                                if (6 >= (int)v30)
                                {
                                    if ((unsigned int)v30 == 5)
                                    {
LABEL_9f8bac:
                                        *(node - 1) = v95;
                                        node -= 1;
                                        goto LABEL_9f8bb0;
                                    }
                                    else
                                    {
                                        if ((unsigned int)v30 != 6)
                                            continue;
                                    }
                                }
                                else
                                {
                                    if ((unsigned int)v30 != 7)
                                    {
                                        if ((unsigned int)v30 != 8)
                                            continue;
                                        *(node - 1) = v95 >> 24;
                                        node -= 1;
                                    }
                                    *(node - 1) = v95 >> 16;
                                    node -= 1;
                                }
                                *(node - 1) = v95 >> 8;
                                node -= 1;
                                goto LABEL_9f8bac;
                            }
                            else if (2 < (int)v30)
                            {
                                if ((unsigned int)v30 == 3)
                                {
LABEL_9f8bb8:
                                    *(node - 1) = v93 >> 16;
                                    node -= 1;
                                    goto LABEL_9f8bc0;
                                }
                                else
                                {
                                    if ((unsigned int)v30 != 4)
                                        continue;
                                }
LABEL_9f8bb0:
                                *(node - 1) = v93 >> 24;
                                node -= 1;
                                goto LABEL_9f8bb8;
                            }
                            else if ((unsigned int)v30 == 1)
                            {
LABEL_9f8bc8:
                                *(node - 1) = v93;
                                node -= 1;
                            }
                            else
                            {
                                if ((unsigned int)v30 != 2)
                                    continue;
LABEL_9f8bc0:
                                *(node - 1) = v93 >> 8;
                                node -= 1;
                                goto LABEL_9f8bc8;
                            }
                        }
                    }
                } while ((iter -= v30, v29 = &v72[v30], v28 = &node[v30], iter >= v30));
            }
        }
        *(char *)a7 = v31;
        *(char *)&a7[1] = v31 >> 8;
        *(char *)&a7[2] = v31 >> 16;
        *(char *)&a7[3] = v31 >> 24;
        *(char *)&a7[4] = v32;
        *(char *)&a7[5] = (unsigned int)v32 >> 8;
        *(char *)&a7[6] = (unsigned int)v32 >> 16;
        *(char *)&a7[7] = (unsigned int)v32 >> 24;
    }
    if (*(long long *)&g_10002b0 == v24)
        return;
    ___stack_chk_fail();
}
