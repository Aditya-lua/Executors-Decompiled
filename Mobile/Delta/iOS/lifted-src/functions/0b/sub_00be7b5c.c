/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe7b5c..0xbe7e80 (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_be7b5c(void* a0, unsigned long a1)
{
    void* v0;  // x13
    unsigned long long v1;  // x11
    void* v10;  // x12
    unsigned long long v11;  // 4143
    unsigned long long node;  // x11
    unsigned long long v13;  // 4121
    unsigned long long v14;  // 4121
    unsigned long long v15;  // 4121
    unsigned long long v16;  // 4121
    unsigned long long v17;  // 4121
    unsigned long long v18;  // 4121
    unsigned long long v19;  // x0
    unsigned long long v2;  // x10
    unsigned long long v20;  // x9
    __m128i v21;  // q0
    unsigned long long v22;  // x0
    void* v23;  // x11
    unsigned long long v24;  // x12
    unsigned long long v25;  // x13
    unsigned long long v26;  // x1
    unsigned long long v27;  // x14
    void* i;  // x14
    unsigned long long v29;  // x16
    unsigned long long v3;  // x9
    unsigned long long v30;  // x17
    uint128_t *iter;  // x1
    unsigned long long v32;  // q1
    unsigned long long v33;  // x2
    unsigned long long v34;  // q2
    unsigned long long v35;  // x2
    void* v36;  // x3
    __m128i v37;  // q6
    __m128i v38;  // q5
    __m128i v39;  // q4
    void* v4;  // x8
    __m128i v40;  // q3
    __m128i v41;  // q19
    __m128i v42;  // q18
    __m128i v43;  // q17
    __m128i v44;  // q16
    void* v46;  // x14
    __m128i v47;  // q4
    __m128i v48;  // q3
    __m128i v49;  // q1
    void* v5;  // x0
    __m128i v50;  // q2
    unsigned long long v52;  // x14
    void* v53;  // x9
    unsigned long long v54;  // x8
    unsigned long long v6;  // 4121
    void* v7;  // x8
    unsigned long long v8;  // 4106
    unsigned long long v9;  // x8

    v0 = a0 + 7 & 0xfffffffffffffff8;
    v1 = a1 - (v0 - a0);
    v2 = v1 & 7;
    if (v0 == a0)
    {
        v3 = 0;
    }
    else
    {
        v3 = 0;
        v4 = a0 - v0;
        do
        {
            v5 = a0 + 1;
            v6 = arm64g_calculate_condition(209, *(char *)a0, 65, 0);
            if (!(v6 & 1))
                v3 += 1;
        } while ((v7 = v4 + 1, v8 = arm64g_calculate_condition(50, v4, 1, 0), a0 = v5, v4 += 1, v8 & 1));
    }
    v9 = v1 >> 3;
    if (v2)
    {
        v10 = v0 + (v1 & 0x7ffffffffffffff8);
        v11 = arm64g_calculate_condition(209, *(char *)v10, 65, 0);
        node = !(v11 & 1);
        if (v2 != 1)
        {
            v13 = arm64g_calculate_condition(209, (char)v10[1], 65, 0);
            if (!(v13 & 1))
                node += 1;
            if (v2 != 2)
            {
                v14 = arm64g_calculate_condition(209, (char)v10[2], 65, 0);
                if (!(v14 & 1))
                    node += 1;
                if (v2 != 3)
                {
                    v15 = arm64g_calculate_condition(209, (char)v10[3], 65, 0);
                    if (!(v15 & 1))
                        node += 1;
                    if (v2 != 4)
                    {
                        v16 = arm64g_calculate_condition(209, (char)v10[4], 65, 0);
                        if (!(v16 & 1))
                            node += 1;
                        if (v2 != 5)
                        {
                            v17 = arm64g_calculate_condition(209, (char)v10[5], 65, 0);
                            if (!(v17 & 1))
                                node += 1;
                            if (v2 != 6)
                            {
                                v18 = arm64g_calculate_condition(209, (char)v10[6], 65, 0);
                                if (!(v18 & 1))
                                    node += 1;
                            }
                        }
                    }
                }
            }
        }
    }
    else
    {
        node = 0;
    }
    v19 = node + v3;
    v20 = 192;
    v21 = _mm_set1_epi32(0x1010101);
    do
    {
        v22 = v19;
        if (!v9)
            return v22;
        v23 = v0;
        if (v9 < 192)
            v24 = v9;
        else
            v24 = v20;
        v25 = v24 * 8;
        if (!(v25 & 2016))
        {
            v26 = 0;
            continue;
        }
        else
        {
            v27 = v25 - 32;
            if (96 > v27)
            {
                v26 = 0;
                i = v23;
            }
            else
            {
                v29 = (v27 >> 5) + 1;
                v30 = v29 & 0xffffffffffffffc;
                i = v23 + v30 * 32;
                iter = v23 + 64;
                v32 = 0;
                v33 = v29 & 0xffffffffffffffc;
                v34 = 0;
                do
                {
                    v35 = v33;
                    v36 = (char *)iter - 64;
                    v37 = _mm_unpackhi_epi64((int128_t)v36[16], (int128_t)v36[48]);
                    v38 = _mm_unpacklo_epi64((int128_t)v36[16], (int128_t)v36[48]);
                    v39 = _mm_unpackhi_epi64(*(int128_t *)v36, (int128_t)v36[32]);
                    v40 = _mm_unpacklo_epi64(*(int128_t *)v36, (int128_t)v36[32]);
                    v41 = _mm_unpackhi_epi64(iter[1], iter[3]);
                    v42 = _mm_unpacklo_epi64(iter[1], iter[3]);
                    v43 = _mm_unpackhi_epi64(*iter, iter[2]);
                    v44 = _mm_unpacklo_epi64(*iter, iter[2]);
                    v32 = (unsigned long long)_mm_add_epi64(_mm_and_si128(_mm_or_si128(_mm_srli_epi64(~v37, 7), _mm_srli_epi64(v37, 6)), v21), _mm_add_epi64(_mm_add_epi64(_mm_and_si128(_mm_or_si128(_mm_srli_epi64(~v38, 7), _mm_srli_epi64(v38, 6)), v21), _mm_and_si128(_mm_or_si128(_mm_srli_epi64(~v39, 7), _mm_srli_epi64(v39, 6)), v21)), _mm_add_epi64(_mm_and_si128(_mm_or_si128(_mm_srli_epi64(~v40, 7), _mm_srli_epi64(v40, 6)), v21), v32)));
                } while ((v34 = (unsigned long long)_mm_add_epi64(_mm_and_si128(_mm_or_si128(_mm_srli_epi64(~v41, 7), _mm_srli_epi64(v41, 6)), v21), _mm_add_epi64(_mm_add_epi64(_mm_and_si128(_mm_or_si128(_mm_srli_epi64(~v42, 7), _mm_srli_epi64(v42, 6)), v21), _mm_and_si128(_mm_or_si128(_mm_srli_epi64(~v43, 7), _mm_srli_epi64(v43, 6)), v21)), _mm_add_epi64(_mm_and_si128(_mm_or_si128(_mm_srli_epi64(~v44, 7), _mm_srli_epi64(v44, 6)), v21), v34))), iter += 8, v33 = v35 - 4, v35 != 4));
                v26 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(v34, v32), _mm_unpackhi_epi64(_mm_add_epi64(v34, v32), _mm_add_epi64(v34, v32))));
                if (v29 == v30)
                    continue;
            }
            do
            {
                v46 = i + 32;
                v47 = _mm_srli_epi64(~(int128_t)i[16], 7);
                v48 = _mm_srli_epi64(~*(int128_t *)i, 7);
                v49 = _mm_srli_epi64((int128_t)i[16], 6);
                v50 = _mm_srli_epi64(*(int128_t *)i, 6);
                v26 += (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_and_si128(_mm_or_si128(v48, v50), v21), _mm_and_si128(_mm_or_si128(v47, v49), v21)), _mm_unpackhi_epi64(_mm_add_epi64(_mm_and_si128(_mm_or_si128(v48, v50), v21), _mm_and_si128(_mm_or_si128(v47, v49), v21)), _mm_add_epi64(_mm_and_si128(_mm_or_si128(v48, v50), v21), _mm_and_si128(_mm_or_si128(v47, v49), v21)))));
                i = v46;
            } while (i != v23 + (v25 & 2016));
        }
    } while ((v0 = v23 + v25, v9 -= v24, v19 = v22 + (281479271743489 * ((v26 >> 8 & 0xff00ff00ff00ff) + (v26 & 0xff00ff00ff00ff)) >> 48), v52 = v24 & 3, !v52));
    v53 = v23 + (v24 & 252) * 8;
    v54 = ((unsigned long long)(~*(long long *)v53) >> 7 | (unsigned long long)(*(long long *)v53) >> 6) & 0x101010101010101;
    if (v52 != 1)
    {
        v54 += ((unsigned long long)(~(long long)v53[8]) >> 7 | (unsigned long long)((long long)v53[8]) >> 6) & 0x101010101010101;
        if (v52 != 2)
            v54 += ((unsigned long long)(~(long long)v53[16]) >> 7 | (unsigned long long)((long long)v53[16]) >> 6) & 0x101010101010101;
    }
    return v22 + (281479271743489 * ((v26 >> 8 & 0xff00ff00ff00ff) + (v26 & 0xff00ff00ff00ff)) >> 48) + (281479271743489 * ((v54 >> 8 & 0xff00ff00ff00ff) + (v54 & 0xff00ff00ff00ff)) >> 48);
}
