/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe8a94..0xbe8df8 (868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e08214;
extern char g_e08270;
extern char g_e08344;
extern char g_e0853c;
extern char g_e08588;
extern char g_e086a4;
extern long long g_efa8d8;

unsigned int sub_be8a94(unsigned long long a0)
{
    unsigned int v2;  // w8
    unsigned int v3;  // x8
    char *v12;  // x8
    unsigned long long v13;  // x16
    char *v14;  // x8
    char *v15;  // x8
    unsigned int v16;  // x16
    unsigned int v17;  // x9
    unsigned int v18;  // x12
    unsigned long v19;  // x11
    unsigned long long v20;  // x0
    unsigned long long v21;  // 4120
    unsigned int v4;  // x9
    unsigned int v22;  // x9
    unsigned long v23;  // x11
    unsigned long long v24;  // 4149
    unsigned int v25;  // x9
    unsigned int v26;  // w10
    unsigned int v27;  // w11
    char *v28;  // x14
    unsigned int v29;  // w15
    unsigned long v30;  // x14
    unsigned int v31;  // x1
    unsigned int v5;  // w10
    unsigned long long v32;  // 4102
    char *v33;  // x8
    unsigned long long v34;  // x16
    char *v35;  // x8
    char *v36;  // x8
    unsigned int v37;  // x16
    unsigned int v38;  // x10
    unsigned long long v39;  // x9
    unsigned int v40;  // x13
    unsigned long v41;  // x12
    unsigned int v6;  // w11
    unsigned long long v42;  // x9
    unsigned long long v43;  // 4120
    unsigned int v44;  // x10
    unsigned long v45;  // x12
    unsigned long long v46;  // 4149
    __m128i v47;  // q0
    __m128i v50;  // q2
    __m128i v51;  // q3
    char *v7;  // x14
    __m128i v52;  // q0
    __m128i v53;  // q1
    __m128i v55;  // q0
    unsigned int v8;  // w15
    unsigned long v9;  // x14
    unsigned int v10;  // x1
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (32 > (unsigned int)a0)
    {
LABEL_be8aa4:
        v2 = 0;
    }
    if (127 > (unsigned int)a0)
        v2 = 1;
    if (0x10000 > (unsigned int)a0)
    {
        v3 = 0;
        v4 = 0;
        v5 = (unsigned int)a0 >> 8;
        v6 = (unsigned int)a0 & 0xff;
        while (1)
        {
            v7 = &(&g_e0853c)[v4];
            v4 += 2;
            v8 = *v7;
            v9 = v7[1];
            v10 = v3 + v9;
            if (v8 != v5)
            {
                v11 = arm64g_calculate_condition(131, v8 & 0xff, v5, 0);
                if (v11 & 1)
                    goto LABEL_be8d08;
            }
            else if (v10 < v3 || 284 < v10)
            {
                sub_c73bb0(v3);
                goto LABEL_be8dd8;
            }
            else if ((unsigned int)v9)
            {
                v12 = &(&g_e08588)[v3];
                v13 = v9 & 3;
                v14 = v12;
                v15 = v12;
                if (v9 & 3)
                {
                    do
                    {
                        v16 = v13;
                        v15 = v14 + 1;
                        if (*v14 == v6)
                            goto LABEL_be8aa4;
                    } while ((v13 = v16 - 1, v14 = v15, v16 != 1));
                }
                if ((unsigned int)v9 >= 4)
                {
                    do
                    {
                        if (*v15 == v6 || v15[1] == v6 || v15[2] == v6 || v15[3] == v6)
                            goto LABEL_be8aa4;
                    } while ((v15 += 4, v15 != &v12[v9]));
                }
            }
            v3 = v10;
            if (v4 == 76)
            {
LABEL_be8d08:
                v17 = 0;
                v2 = 1;
                break;
            }
        }
LABEL_be8d34:
        v18 = v17 + 1;
        v19 = (&g_e086a4)[v17];
        if (!(v19 >> 31 & 1))
        {
            v20 = a0 - v19;
            v21 = arm64g_calculate_condition(67, a0 & 0xffffffff, v19 & 0xffffffff, 0);
            if (!(v21 & 1))
                goto LABEL_be8d28;
            goto LABEL_be8d28;
        }
        else
        {
            if (v18 == 292)
                goto LABEL_be8dec;
            v22 = v17 + 2;
            v23 = ((&g_e086a4)[v18] | __ROL__((unsigned int)v19, 8) & 0x7f00) & 0x7fff;
            v20 = a0 - v23;
            v24 = arm64g_calculate_condition(83, a0 & 0xffffffff, v23 & 0xffffffff, 0);
            v18 = v22;
LABEL_be8d28:
            v2 ^= 1;
            a0 = v20;
            v17 = v18;
            if (v17 != 292)
                goto LABEL_be8d34;
            goto LABEL_be8d34;
        }
    }
    if (0x20000 > (unsigned int)a0)
    {
        v3 = 0;
        v25 = 0;
        v26 = __ROL__((unsigned int)a0, 24) & 0xff0000ff & 0xff;
        v27 = (unsigned int)a0 & 0xff;
        while (1)
        {
            v28 = &(&g_e08214)[v25];
            v25 += 2;
            v29 = *v28;
            v30 = v28[1];
            v31 = v3 + v30;
            if (v29 != v26)
            {
                v32 = arm64g_calculate_condition(131, v29 & 0xff, v26, 0);
                if (v32 & 1)
                    goto LABEL_be8d64;
            }
            else if (v31 < v3 || 212 < v31)
            {
LABEL_be8dd8:
                sub_c73bb0(v3);
            }
            else if ((unsigned int)v30)
            {
                v33 = &(&g_e08270)[v3];
                v34 = v30 & 3;
                v35 = v33;
                v36 = v33;
                if (v30 & 3)
                {
                    do
                    {
                        v37 = v34;
                        v36 = v35 + 1;
                        if (*v35 == v27)
                            goto LABEL_be8aa4;
                    } while ((v34 = v37 - 1, v35 = v36, v37 != 1));
                }
                if ((unsigned int)v30 >= 4)
                {
                    do
                    {
                        if (*v36 == v27 || v36[1] == v27 || v36[2] == v27 || v36[3] == v27)
                            goto LABEL_be8aa4;
                    } while ((v36 += 4, v36 != &v33[v30]));
                }
            }
            v3 = v31;
            if (v25 == 92)
            {
LABEL_be8d64:
                v38 = 0;
                v39 = (unsigned int)a0 & 0xffff;
                v2 = 1;
                break;
            }
        }
        while (1)
        {
            v40 = v38 + 1;
            v41 = (&g_e08344)[v38];
            if (!(v41 >> 31 & 1))
            {
                v42 = v39 - v41;
                v43 = arm64g_calculate_condition(67, v39 & 0xffffffff, v41 & 0xffffffff, 0);
                if (v43 & 1)
                    break;
                else
                    goto LABEL_be8d88;
                goto LABEL_be8d88;
            }
            else
            {
                if (v40 == 504)
                {
LABEL_be8dec:
                    sub_c73c64(&g_efa8d8);
                }
                v44 = v38 + 2;
                v45 = ((&g_e08344)[v40] | __ROL__((unsigned int)v41, 8) & 0x7f00) & 0x7fff;
                v42 = v39 - v45;
                v46 = arm64g_calculate_condition(83, v39 & 0xffffffff, v45 & 0xffffffff, 0);
                v40 = v44;
                if (!(v46 & 1))
                    break;
LABEL_be8d88:
                v2 ^= 1;
                v39 = v42;
                v38 = v40;
                if (v38 == 504)
                    break;
            }
        }
    }
    else
    {
        v47 = (__m128i)(CONCAT(a0 & 0xffffffff | (a0 & 0xffffffff) * 0x100000000, a0 & 0xffffffff | (a0 & 0xffffffff) * 0x100000000));
        v50 = _mm_add_epi32(_INSERT(__float_as_int(__int_as_float((unsigned int)a0)), 4, a0), _mm_set_epi32(178206, 173792, 0, 0xfff1ff00));
        v51 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v47, _mm_set_epi64x(0, 0x1ffffe001fffe0))) * 0x10000000000000000;
        v52 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(CatEvenLanesV(CmpGTV(v51, v50), CmpGTV(_mm_set_epi32(-5, -0x5e2, -0x9a2, -15), _mm_add_epi32(v47, _mm_set_epi32(0xfffcecb0, 0xfffd0000, 0xfffd0800, 0xfffd1410))))));
        v53 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(~_mm_cmpeq_epi32(v50, v51)));
        v55 = (__m128i)_INSERT(v52, 6, (__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v52, v53), _mm_unpacklo_epi64(v52, v53))) & 0xffffffffffffffff) >> 48);
        v2 = (unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_min_epu8(_mm_min_epu8(_mm_min_epu8(_mm_min_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))), _mm_min_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))))), _mm_min_epu8(_mm_min_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))), _mm_min_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))))), _mm_min_epu8(_mm_min_epu8(_mm_min_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))), _mm_min_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))))), _mm_min_epu8(_mm_min_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))), _mm_min_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))))))) & ((unsigned int)a0 & 0x1ffffe) != 183982;
    }
}
