/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc1460c..0xc14884 (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c1460c(unsigned long a0, long long a1, long long a2, long long a3)
{
    unsigned long long v0;  // x8
    void* v1;  // x9
    unsigned long long v10;  // 4128
    unsigned long long v11;  // 4130
    unsigned long long v12;  // x10
    unsigned long long v13;  // x10
    unsigned long long v14;  // x13
    unsigned long long v15;  // x12
    void* v16;  // x11
    void* v17;  // x13
    void* v18;  // x13
    void* v19;  // x11
    void* v2;  // x10
    void* iter;  // x11
    __m128i v21;  // q3
    __m128i v22;  // q2
    __m128i v23;  // q1
    __m128i v24;  // q0
    unsigned long v26;  // x10
    unsigned long long v27;  // x10
    unsigned long v29;  // x10
    void* node;  // x11
    unsigned long v31;  // x10
    void* v32;  // x10
    unsigned long long v34;  // x11
    unsigned long long v35;  // 4128
    unsigned long long v36;  // 4130
    unsigned long long v37;  // x10
    unsigned long long v38;  // x10
    void* v39;  // x12
    unsigned long long v4;  // x13
    unsigned long v41;  // x13
    unsigned long long v42;  // x13
    unsigned long long v43;  // 4128
    unsigned long long v44;  // 4130
    unsigned long long v45;  // x10
    unsigned long long v46;  // x10
    unsigned long v48;  // x11
    unsigned long long v49;  // 4128
    unsigned long long v5;  // x13
    unsigned long long v50;  // 4130
    unsigned long long v51;  // x11
    unsigned long long v52;  // x11
    unsigned long long v6;  // 4106
    unsigned long v8;  // x11
    unsigned long long v9;  // x11

    v0 = a3 - a2;
    if ((unsigned long long)a3 < (unsigned long long)a2 || (unsigned long long)a1 < (unsigned long long)a3 || (unsigned long long)a3 <= (unsigned long long)a2)
        return 0;
    v1 = a0 + a2;
    v2 = a0 + a3;
    if (15 >= v0)
    {
        node = v1;
        v4 = v0 & 3;
        if (v0 & 3)
        {
            do
            {
                v5 = v4;
                if (!*(char *)node)
                    goto LABEL_c146b4;
            } while ((node += 1, v4 = v5 - 1, v5 != 1));
        }
        v6 = arm64g_calculate_condition(130, a2 - a3, 4, 0);
        if (!(v6 & 1))
        {
            while (*(char *)node)
            {
                if ((char)node[1])
                {
                    if ((char)node[2])
                    {
                        if ((char)node[3])
                        {
                            if (node + 4 == v2)
                                return 0;
                        }
                        else
                        {
                            if (v0 < node + 3 - v1)
                                return 0;
                            return v1;
                        }
                    }
                    else
                    {
                        if (v0 < node + 2 - v1)
                            return 0;
                        return v1;
                    }
                }
                else
                {
                    if (v0 < node + 1 - v1)
                        return 0;
                    return v1;
                }
            }
            goto LABEL_c146b4;
        }
    }
    else
    {
        v8 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)v1, _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)v1, _mm_setzero_si128()), 4)));
        v9 = v8 & 0x8888888888888888;
        if (v8 & 0x8888888888888888)
        {
            v10 = ((((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v11 = (((((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v12 = ((((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v12)
                v13 = 64;
            else
                v13 = Clz(v12);
            node = v1 + (v13 >> 2);
LABEL_c146b4:
            if (v0 >= node - v1)
                return v1;
            return 0;
        }
        else
        {
            v14 = v1 & 15;
            v15 = 16 - v14;
            v16 = v1 + v15;
            if (v0 >= 64 && a3 - 64 >= (long long)(v15 + a2))
            {
                v17 = a2 - v14 + a0 + 64;
                do
                {
                    v18 = v17;
                    v19 = v18;
                    iter = v19 - 48;
                    v21 = _mm_cmpeq_epi8(*(int128_t *)((char *)v19 - 48), _mm_setzero_si128());
                    v22 = _mm_cmpeq_epi8(*(int128_t *)((char *)v18 - 32), _mm_setzero_si128());
                    v23 = _mm_cmpeq_epi8(*(int128_t *)((char *)v18 - 16), _mm_setzero_si128());
                    v24 = _mm_cmpeq_epi8(*(int128_t *)v18, _mm_setzero_si128());
                    if (_mm_cvtsi128_si64(_mm_max_epu8(CatEvenLanesV(_mm_or_si128(_mm_or_si128(v22, v21), _mm_or_si128(v23, v24)), _mm_or_si128(_mm_or_si128(v22, v21), _mm_or_si128(v23, v24))), CatOddLanesV(_mm_or_si128(_mm_or_si128(v22, v21), _mm_or_si128(v23, v24)), _mm_or_si128(_mm_or_si128(v22, v21), _mm_or_si128(v23, v24))))))
                    {
                        v26 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(v21, 4), _mm_srli_epi16(v21, 4)));
                        v27 = v26 & 0x8888888888888888;
                        if (!(v26 & 0x8888888888888888))
                        {
                            v29 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(v22, 4), _mm_srli_epi16(v22, 4)));
                            v27 = v29 & 0x8888888888888888;
                            if (v29 & 0x8888888888888888)
                            {
                                iter += 16;
                                goto LABEL_c14854;
                            }
                            v31 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(v23, 4), _mm_srli_epi16(v23, 4)));
                            v27 = v31 & 0x8888888888888888;
                            if (v31 & 0x8888888888888888)
                            {
                                iter += 32;
                                goto LABEL_c14854;
                            }
                            else
                            {
                                v32 = iter + 48;
                                v34 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(v24, 4), _mm_srli_epi16(v24, 4))) & 0x8888888888888888;
                                goto LABEL_c1479c;
                            }
                        }
                        else
                        {
LABEL_c14854:
                            v35 = ((((((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v36 = (((((((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v37 = ((((v36 | v35) & 0xffff0000ffff0000) >> 16 | (v36 | v35) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v36 | v35) & 0xffff0000ffff0000) >> 16 | (v36 | v35) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v37)
                                v38 = 64;
                            else
                                v38 = Clz(v37);
                            if (v0 >= iter + (v38 >> 2) - v1)
                                return v1;
                            return 0;
                        }
                    }
                } while ((v17 = v18 + 64, v18 + 16 <= v2 - 64));
                v16 = v17 - 48;
            }
            v39 = v2 - 16;
            if (v39 >= v16)
            {
                do
                {
                    v41 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)v16, _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)v16, _mm_setzero_si128()), 4)));
                    v42 = v41 & 0x8888888888888888;
                    if (v41 & 0x8888888888888888)
                    {
                        v43 = ((((((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v44 = (((((((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v45 = ((((v44 | v43) & 0xffff0000ffff0000) >> 16 | (v44 | v43) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v44 | v43) & 0xffff0000ffff0000) >> 16 | (v44 | v43) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v45)
                            v46 = 64;
                        else
                            v46 = Clz(v45);
                        if (v0 >= v16 + (v46 >> 2) - v1)
                            return v1;
                        return 0;
                    }
                } while ((v16 += 16, v16 <= v39));
            }
            if (v2 > v16)
            {
                v32 = v2 - 16;
                v48 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)((char *)v2 - 16), _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)((char *)v2 - 16), _mm_setzero_si128()), 4)));
                v34 = v48 & 0x8888888888888888;
                if (v48 & 0x8888888888888888)
                {
LABEL_c1479c:
                    v49 = ((((((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v50 = (((((((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v34 & 0xaaaaaaaaaaaaaaaa) >> 1 | v34 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v51 = ((((v50 | v49) & 0xffff0000ffff0000) >> 16 | (v50 | v49) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v50 | v49) & 0xffff0000ffff0000) >> 16 | (v50 | v49) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v51)
                        v52 = 64;
                    else
                        v52 = Clz(v51);
                    if (v0 >= v32 + (v52 >> 2) - v1)
                        return v1;
                    return 0;
                }
            }
        }
    }
    return 0;
}
