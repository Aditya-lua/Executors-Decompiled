/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x77f48..0x783ac (1124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e6afd0;
extern unsigned long long g_e6b018;
extern unsigned long long g_e6b038;

unsigned long long sub_77f48(unsigned short *a0, unsigned long a1, short *a2, unsigned int a3, unsigned int a4, unsigned long long a5)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x23
    unsigned short *iter;  // x9
    unsigned int v13;  // w1
    unsigned long long v14;  // 4135
    unsigned long v15;  // x15
    unsigned long v16;  // x21
    unsigned int v17;  // w15
    int v18;  // w16
    unsigned long long v19;  // w1
    int v20;  // w24
    unsigned long v21;  // x22
    int k;  // w10
    unsigned long long v22;  // x21
    unsigned long long v23;  // x22
    unsigned long long v24;  // x24
    unsigned long long v25;  // x26
    unsigned long long v26;  // 4124
    unsigned int i;  // w20
    unsigned long long v28;  // 4128
    unsigned long long v29;  // x25
    unsigned int v30;  // w27
    unsigned long long v31;  // x23
    unsigned long v5;  // x13
    unsigned int v32;  // w13
    unsigned long v33;  // x23
    unsigned long long v34;  // x23
    unsigned int v35;  // w13
    unsigned long v36;  // x23
    unsigned long long v37;  // x24
    unsigned long long v38;  // x27
    unsigned long long v39;  // x28
    unsigned long long v40;  // x15
    unsigned long long v41;  // x15
    unsigned long v6;  // x7
    unsigned long long v42;  // x1
    unsigned int v43;  // w26
    unsigned long long v44;  // x3
    unsigned long long v45;  // x16
    unsigned long long v46;  // x28
    unsigned long v47;  // x16
    unsigned long long v48;  // x27
    unsigned long long v49;  // q4
    __m128i v50;  // q5
    __m128i v51;  // q6
    unsigned long v7;  // x6
    unsigned int v52;  // w13
    unsigned int j;  // w13
    unsigned int v54;  // w13
    unsigned long long v59;  // 4140
    unsigned short *v8;  // x8
    unsigned int v9;  // w12
    unsigned long long v10;  // x19
    uint128_t v11;  // q2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = 0;
    k = 1 << ((char)a4 & 31);
    v5 = a4 - 5;
    v6 = k + 1;
    v7 = a4 + 1;
    v8 = (char *)a0 + a1 - 2;
    v9 = ~a3;
    v10 = 4;
    v11 = CONCAT(12884901891, 12884901891);
    iter = a0;
    while (1)
    {
        if (a3 + 1 > (unsigned int)v3 && (int)v6 >= 2)
        {
            if (v2 & 1)
            {
                v22 = 0;
                v23 = v3 & 0xffffffff;
                v24 = v23 + 1;
                v25 = 0xffffffffffffffff;
                while (!a2[v22 + (v3 & 0xffffffff)])
                {
                    v25 -= 1;
                    v24 += 1;
                    v26 = arm64g_calculate_condition(0x11, v9 + v23 & 0xffffffff, v22 + 1 & 0xffffffff, 0);
                    if (!(v26 & 1))
                        goto *((void *)(g_e6b038));
                }
                i = (unsigned int)v23 + (unsigned int)v22;
                v28 = arm64g_calculate_condition(1, v9 + v23 & 0xffffffff, v22 & 0xffffffff, 0);
                if (v28 & 1)
                {
                    goto *((void *)(g_e6b038));
                }
                else if ((unsigned int)v3 + 24 > i)
                {
                    v29 = v23;
                    break;
                }
                else
                {
                    v30 = 0xffff << ((char)v10 & 31);
                    if (a5)
                    {
                        do
                        {
                            v31 = v3;
                            v32 = (unsigned int)v5 + v30;
                            *iter = v32;
                            iter += 1;
                            v5 = v32 >> 16;
                            v33 = (unsigned int)v31 + 24;
                            v3 = v33;
                        } while ((unsigned int)v31 + 48 <= i);
                        v29 = v33;
                        break;
                    }
                    else
                    {
                        do
                        {
                            v34 = v3;
                            v35 = (unsigned int)v5 + v30;
                            if (v8 < iter)
                                goto *((void *)(g_e6b018));
                        } while ((*iter = v35, v5 = v35 >> 16, iter += 1, v29 = (unsigned int)v34 + 24, v3 = v29, (unsigned int)v34 + 48 <= i));
                    }
                }
            }
            v13 = a2[v3 & 0xffffffff];
            v3 = (unsigned int)v3 + 1;
            v14 = arm64g_calculate_condition(83, v13, 0, 0);
            if (v14 & 1)
                v15 = v13;
            else
                v15 = -v13;
            v16 = v6 - v15;
            v17 = v13 + 1;
            v18 = ~(unsigned int)v6 + k * 2;
            if ((int)v17 < k)
                v19 = 0;
            else
                v19 = v18;
            v20 = v19 + v17;
            v2 = v20 == 1;
            if ((int)v16 < 1)
                return 0xffffffffffffffff;
            v21 = v7;
            if (k > (int)v16)
            {
                do
                {
                    k >>= 1;
                    v21 = (unsigned int)v21 - 1;
                } while ((int)v16 < k);
            }
            v5 += v20 << ((char)v10 & 31);
            v10 = v10 + v7 - (v18 > v20);
            v6 = v16;
            v7 = v21;
            if ((int)v10 < 0x11)
                continue;
            if (!a5 && iter > v8)
                goto LABEL_7835c;
            *iter = v5;
            iter += 1;
            v5 = (unsigned int)v5 >> 16;
            v10 = (unsigned int)v10 - 16;
            v6 = v16;
            v7 = v21;
        }
        else
        {
            if ((unsigned int)v6 != 1)
            {
                return 0xffffffffffffffff;
            }
            else if (a5 || iter <= v8)
            {
                *iter = v5;
                v59 = arm64g_calculate_condition(177, v10 & 0xffffffff, 7, 0);
                return (char *)iter + ((int)((v59 & 1 ? (unsigned int)v10 + 14 : (unsigned int)v10 + 7)) >> 3) - a0;
            }
LABEL_7835c:
            return 0xffffffffffffffba;
        }
    }
    v36 = (unsigned int)v29 + 3;
    if ((unsigned int)v36 > i)
    {
        v37 = v10;
    }
    else
    {
        v38 = (unsigned int)v29 + 6;
        v39 = v23 - v25;
        if (v24 < v38)
            v40 = v24;
        else
            v40 = v38;
        if (v39 > v38)
            v40 += 1;
        v41 = (v23 - v40 - v25) / 3;
        if (v39 <= v38)
            v42 = v41;
        else
            v42 = v41 + 1;
        v43 = (unsigned int)v42 + 1;
        if (52 > v43)
        {
LABEL_78128:
            goto LABEL_78130;
        }
        else
        {
            v44 = (v42 & 0xffffffff) * 3;
            if (0xfffffff9 - (unsigned int)v29 < (unsigned int)v44 || v44 & 0xffffffff00000000)
            {
                goto LABEL_78128;
            }
            else if (v42 <= 0xffffffff)
            {
                if (v24 < v38)
                    v45 = v24;
                else
                    v45 = v38;
                v46 = v43 & 0xfffffff8;
                v47 = (unsigned int)v46 * 2;
                v48 = v47 + v46;
                v36 += v48;
                v37 = v10 + v47;
                v49 = 0;
                v50 = __float_as_int(__int_as_float((unsigned int)v5));
                v51 = _mm_add_epi32(CONCAT(v10 & 0xffffffff | (v10 & 0xffffffff) * 0x100000000, v10 & 0xffffffff | (v10 & 0xffffffff) * 0x100000000), _mm_set_epi32(6, 4, 2, 0));
                v52 = (v24 - (v39 > v38) - v45) / 3;
                if (v39 > v38)
                    v52 += 1;
                j = v52 + 1 & 0xfffffff8;
                do
                {
                    v54 = j;
                    v50 = _mm_add_epi32(v50, __dirty_unsupported_Iop_Sh32Ux4(v11, v51));
                    v49 = (unsigned long long)_mm_add_epi32(v49, __dirty_unsupported_Iop_Sh32Ux4(v11, _mm_add_epi32(v51, _mm_set1_epi32(8))));
                    v51 = _mm_add_epi32(v51, _mm_set1_epi32(16));
                    j = v54 - 8;
                } while (j);
                v5 = (unsigned int)__dirty_unsupported_Iop_ZeroHI96ofV128(_mm_add_epi32(_mm_add_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v49, v50), _mm_add_epi32(v49, v50)), _mm_unpackhi_epi64(_mm_add_epi32(v49, v50), _mm_add_epi32(v49, v50))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v49, v50), _mm_add_epi32(v49, v50)), _mm_unpackhi_epi64(_mm_add_epi32(v49, v50), _mm_add_epi32(v49, v50)))), _mm_add_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v49, v50), _mm_add_epi32(v49, v50)), _mm_unpacklo_epi64(_mm_add_epi32(v49, v50), _mm_add_epi32(v49, v50))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v49, v50), _mm_add_epi32(v49, v50)), _mm_unpacklo_epi64(_mm_add_epi32(v49, v50), _mm_add_epi32(v49, v50))))));
                if (v43 == (unsigned int)v46)
                {
                    v29 += v48;
                }
                else
                {
                    v10 = v37;
LABEL_78130:
                    do
                    {
                        v37 = (unsigned int)v10 + 2;
                        v5 += 3 << ((char)v10 & 31);
                        v36 = (unsigned int)v36 + 3;
                        v10 = v37;
                    } while ((unsigned int)v36 <= i);
                    v29 = (unsigned int)v36 - 3;
                }
            }
            else
            {
                goto LABEL_78128;
            }
        }
    }
    if ((int)v37 > 14)
    {
        if (!a5 && iter > v8)
            goto *((void *)(g_e6b018));
        *iter = (unsigned short)v5 + (unsigned short)((unsigned int)(v23 - v29) + (unsigned int)v22 << ((char)v37 & 31));
        goto *((void *)(g_e6afd0));
    }
    else
    {
        goto *((void *)(g_e6afd0));
    }
}
