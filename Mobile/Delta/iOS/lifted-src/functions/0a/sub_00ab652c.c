/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab652c..0xab6964 (1080 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;
extern char g_10002b0;

unsigned long long sub_ab652c(unsigned long a0, void* a1, unsigned long a2, void* a3, unsigned long long a4, unsigned int a5, unsigned int a6)
{
    unsigned long long v6;  // x8
    unsigned int v7;  // w10
    uint128_t *iter;  // x10
    __m128i v17;  // q2
    __m128i v18;  // q3
    __m128i v19;  // q4
    __m128i v20;  // q6
    __m128i v21;  // q5
    __m128i v22;  // q7
    unsigned long long j;  // x12
    unsigned long long v24;  // x12
    __m128i v25;  // q16
    unsigned long long v8;  // x9
    __m128i v26;  // q18
    __m128i v27;  // q16
    __m128i v28;  // q17
    __m128i v29;  // q21
    __m128i v30;  // q17
    __m128i v32;  // q0
    unsigned long v34;  // d0
    unsigned long long v35;  // x14
    unsigned long long v9;  // x12
    __m128i v36;  // q0
    unsigned int *v37;  // x10
    unsigned long long v38;  // x11
    unsigned int *v39;  // x10
    __m128i v40;  // q1
    unsigned long long v42;  // 4136
    unsigned long v44;  // d0
    unsigned long long v45;  // w9
    unsigned long long v10;  // w13
    unsigned int v46;  // w12
    void* v47;  // x9
    unsigned int v48;  // w12
    unsigned int v49;  // w14
    unsigned int v50;  // w13
    unsigned long v51;  // cc_dep1
    unsigned long long v52;  // 4112
    unsigned long long v53;  // 4107
    unsigned long long v54;  // 4112
    unsigned long long v55;  // 4107
    unsigned long long v11;  // x11
    unsigned long long v56;  // w11
    unsigned int v57;  // w10
    char v58;  // x11
    unsigned long long i;  // x8
    uint128_t v60;  // q0
    uint128_t v61;  // q1
    unsigned long long v62;  // w0
    long long v63;  // x1
    unsigned long long v12;  // 4112
    unsigned long long v13;  // x11
    __m128i v14;  // q1
    __m128i v15;  // q0
    uint128_t v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x70]
    uint128_t v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (a2 < 48 || a4 <= 58)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_pk1.c", 561, "ossl_rsa_padding_check_PKCS1_type_2_TLS");
        v63 = 159;
        goto LABEL_ab66ec;
    }
    else if ((int)sub_aa845c() > 0)
    {
        v6 = a4 - 49;
        v7 = (int)(((char)a3[1] ^ 2) - 1 & *(char *)a3 - 1) >> 31;
        v8 = a4 - 0x33;
        if (4 > v8)
        {
            v9 = 2;
            v10 = 2;
        }
        else
        {
            v11 = a4 - 52;
            v9 = 2;
            v10 = 2;
            if (~((unsigned int)v11 >> 1 & 0x7fffffff) && !(v12 = arm64g_calculate_condition(129, v11 & 0xffffffff, 4, 0), v12 & 1 || v11 > 0xffffffff))
            {
                if (32 > v8)
                {
                    v13 = 0;
LABEL_ab68ec:
                    v35 = v8 & 0xfffffffffffffffc;
                    v9 = v35 | 2;
                    v10 = (unsigned int)v35 | 2;
                    v36 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __int_as_float(v7));
                    v37 = v13 + a3 + 2;
                    v38 = v13 - v35;
                    do
                    {
                        v39 = v37 + 1;
                        v40 = _mm_cmpeq_epi32(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v37), 8)), 16), _mm_setzero_si128());
                        v36 = _mm_and_si128(_mm_or_si128(_mm_and_si128(v40, _mm_set1_epi32(-0x100)), ~v40), v36);
                        v42 = arm64g_calculate_condition(18, v38, 4, 0);
                        v37 = v39;
                        v38 += 4;
                    } while (v42 & 1);
                    v44 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v36, __dirty_unsupported_Iop_SliceV128(v36, v36, 8)));
                    v7 = (unsigned int)__double_as_longlong(v44) & (unsigned int)(__double_as_longlong(v44) >> 32);
                    if (v8 == v35)
                        goto LABEL_ab65ec;
                }
                else
                {
                    v13 = v8 & 0xffffffffffffffe0;
                    v14 = _mm_set1_epi32(-1);
                    v15 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __int_as_float(v7));
                    iter = a3 + 18;
                    v17 = _mm_set1_epi32(-1);
                    v18 = _mm_set1_epi32(-1);
                    v19 = _mm_set1_epi32(-1);
                    v20 = _mm_set1_epi32(-1);
                    v21 = _mm_set1_epi32(-1);
                    v22 = _mm_set1_epi32(-1);
                    j = v13;
                    do
                    {
                        v24 = j;
                        v25 = _mm_cmpeq_epi8(*(int128_t *)((char *)iter - 16), _mm_setzero_si128());
                        v26 = _mm_srai_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v25), 8);
                        v27 = _mm_srai_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v25), 8);
                        v28 = _mm_cmpeq_epi8(*iter, _mm_setzero_si128());
                        v29 = _mm_srai_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v28), 8);
                        v30 = _mm_srai_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v28), 8);
                        v18 = _mm_and_si128(_mm_or_si128(_mm_and_si128(_mm_srai_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v26), 16), _mm_set1_epi32(-0x100)), ~_mm_srai_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v26), 16)), v18);
                        v17 = _mm_and_si128(_mm_or_si128(_mm_and_si128(_mm_srai_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v26), 16), _mm_set1_epi32(-0x100)), ~_mm_srai_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v26), 16)), v17);
                        v14 = _mm_and_si128(_mm_or_si128(_mm_and_si128(_mm_srai_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v27), 16), _mm_set1_epi32(-0x100)), ~_mm_srai_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v27), 16)), v14);
                        v15 = _mm_and_si128(_mm_or_si128(_mm_and_si128(_mm_srai_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v27), 16), _mm_set1_epi32(-0x100)), ~_mm_srai_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v27), 16)), v15);
                        v22 = _mm_and_si128(_mm_or_si128(_mm_and_si128(_mm_srai_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v29), 16), _mm_set1_epi32(-0x100)), ~_mm_srai_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v29), 16)), v22);
                        v21 = _mm_and_si128(_mm_or_si128(_mm_and_si128(_mm_srai_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v29), 16), _mm_set1_epi32(-0x100)), ~_mm_srai_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v29), 16)), v21);
                        v20 = _mm_and_si128(_mm_or_si128(_mm_and_si128(_mm_srai_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v30), 16), _mm_set1_epi32(-0x100)), ~_mm_srai_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v30), 16)), v20);
                        v19 = _mm_and_si128(_mm_or_si128(_mm_and_si128(_mm_srai_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v30), 16), _mm_set1_epi32(-0x100)), ~_mm_srai_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v30), 16)), v19);
                        iter += 2;
                        j = v24 - 32;
                    } while (j);
                    v32 = _mm_and_si128(_mm_and_si128(_mm_and_si128(v19, v15), _mm_and_si128(v21, v17)), _mm_and_si128(_mm_and_si128(v20, v14), _mm_and_si128(v22, v18)));
                    v34 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v32, __dirty_unsupported_Iop_SliceV128(v32, v32, 8)));
                    v7 = (unsigned int)__double_as_longlong(v34) & (unsigned int)(__double_as_longlong(v34) >> 32);
                    if (v8 == v13)
                        goto LABEL_ab65ec;
                    if (v8 & 28)
                        goto LABEL_ab68ec;
                    v10 = (unsigned int)v13 | 2;
                    v9 = v13 | 2;
                }
            }
        }
        v45 = v10 + 1;
        do
        {
            if (!*((char *)a3 + v9))
                v46 = 0xffffff00;
            else
                v46 = 0xffffffff;
        } while ((v7 &= v46, v9 = v45, v45 += 1, v9 < v6));
LABEL_ab65ec:
        v47 = a3 + a4;
        v48 = *((char *)v47 - 48);
        v49 = *((char *)v47 - 47);
        v50 = (a5 & 0xff ^ v49) - 1 & ((a5 * &g_1000000 | a5 >> 8) & 0xff0000ff & 0xff ^ v48) - 1;
        v51 = a6;
        if ((int)a6 >= 1)
            v50 |= (a6 & 0xff ^ v49) - 1 & ((a6 * &g_1000000 | a6 >> 8) & 0xff0000ff & 0xff ^ v48) - 1;
        if (!*((char *)a3 + v6))
        {
            v52 = arm64g_calculate_condition(3, v51, 1, 0);
            v53 = arm64g_calculate_condition(179, (v52 & 1 ? v50 : 0), 0, 0);
            if (!(v53 & 1))
                goto LABEL_ab6652;
LABEL_ab6651:
            v56 = 0xff;
        }
        else
        {
            v54 = arm64g_calculate_condition(3, v51, 1, 0);
            v55 = arm64g_calculate_condition(176, (v54 & 1 ? v50 : 0), 0, 0);
            if (v55 & 1)
                goto LABEL_ab6651;
LABEL_ab6652:
            v56 = 0;
        }
        v57 = v56 & v7;
        v58 = ~v57;
        if (15 >= a1 - v47 + 48)
        {
            i = 0;
            do
            {
                *((char *)a1 + i) = v58 & *((char *)&v0 + i) | (char)v57 & *((char *)v47 + i - 48);
                i += 1;
            } while (i != 48);
        }
        else
        {
            v60 = CONCAT(v58 | v58 * 0x100 | (v58 | v58 * 0x100) * 0x10000 | (v58 | v58 * 0x100 | (v58 | v58 * 0x100) * 0x10000) * 0x100000000, v58 | v58 * 0x100 | (v58 | v58 * 0x100) * 0x10000 | (v58 | v58 * 0x100 | (v58 | v58 * 0x100) * 0x10000) * 0x100000000);
            v61 = CONCAT(v57 & 0xff | (v57 & 0xff) * 0x100 | (v57 & 0xff | (v57 & 0xff) * 0x100) * 0x10000 | (v57 & 0xff | (v57 & 0xff) * 0x100 | (v57 & 0xff | (v57 & 0xff) * 0x100) * 0x10000) * 0x100000000, v57 & 0xff | (v57 & 0xff) * 0x100 | (v57 & 0xff | (v57 & 0xff) * 0x100) * 0x10000 | (v57 & 0xff | (v57 & 0xff) * 0x100 | (v57 & 0xff | (v57 & 0xff) * 0x100) * 0x10000) * 0x100000000);
            *(uint128_t *)a1 = v60 & v0 | v61 & *(int128_t *)((char *)v47 - 48);
            *(uint128_t *)&a1[16] = v60 & v1 | v61 & *(int128_t *)((char *)v47 - 32);
            *(uint128_t *)&a1[32] = v60 & v2 | v61 & *(int128_t *)((char *)v47 - 16);
        }
        v62 = 48;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_pk1.c", 572, "ossl_rsa_padding_check_PKCS1_type_2_TLS");
        v63 = 786691;
LABEL_ab66ec:
        sub_a36abc(4, v63, 0);
        v62 = 0xffffffff;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v62;
    ___stack_chk_fail();
}
