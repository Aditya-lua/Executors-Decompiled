/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f21e0..0x9f2534 (852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f21e0_0 {
    char field_0;
    uint128_t field_1;
    uint128_t field_11;
    char padding_21[31];
    unsigned int field_40;
} st_9f21e0_0;

extern long long g_d35f7c;
extern char _NSHomeDirectory;

unsigned long long sub_9f21e0(void* a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, long long a4, long long a5)
{
    void* v2;  // x23
    void* v12;  // x23
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // x22
    void* v17;  // x21
    unsigned int v18;  // w10
    unsigned long long v19;  // x8
    unsigned long long v20;  // x11
    unsigned int v21;  // w12
    unsigned long long v4;  // 4123
    __m128i v22;  // q0
    uint128_t *iter;  // x12
    unsigned long long i;  // x13
    unsigned long long v25;  // x13
    __m128i v26;  // q1
    __m128i v27;  // q2
    __m128i v28;  // q3
    unsigned int v30;  // w12
    char *iter1;  // x13
    unsigned long long v5;  // x0
    unsigned long long j;  // x11
    unsigned long long v33;  // x11
    unsigned long long v35;  // x13
    char v36;  // x11
    char *v37;  // x9
    unsigned int v38;  // w10
    unsigned long long v39;  // x12
    unsigned int v40;  // w13
    __m128i v41;  // q0
    unsigned long long v6;  // x0
    unsigned long long k;  // x13
    char *node;  // x14
    unsigned long long v44;  // x13
    __m128i v45;  // q0
    __m128i v47;  // q1
    __m128i v48;  // q1
    unsigned long long v49;  // d1
    unsigned int v51;  // w13
    unsigned long v7;  // x1
    char *iter2;  // x14
    unsigned long long l;  // x12
    unsigned long long v54;  // x12
    unsigned long long v56;  // x0
    st_9f21e0_0 *v8;  // x0
    long long v9;  // x20
    unsigned long long v10;  // w0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a4 && !a1 && !a2 && !a3)
    {
        v2 = a0;
        v4 = arm64g_calculate_condition(1, (int)v2[0x88], 1, 0);
        if (!(v4 & 1))
        {
            v5 = sub_a4d03c(*(long long *)a0, 0, 0, &g_d35f7c, a5);
            if (!(unsigned int)v5)
                return v5;
            v6 = sub_a50638(*(long long *)a0);
            if (!(unsigned int)v6)
                return v6;
            _bzero(a0 + 72, (int)v6);
            *(unsigned int *)&v2[0x88] = 0;
            return 1;
        }
    }
    else
    {
        if (a3)
        {
            *(unsigned int *)&a0[0x88] = 0xffffffff;
            if (a4)
            {
                v9 = a5;
                v10 = (unsigned int)sub_a4d02c(*(long long *)a0, a3, a4, 0, 0);
            }
            else
            {
                v9 = a5;
                v10 = (unsigned int)sub_a4d03c(*(long long *)a0, a3, 0, 0, a5);
            }
            v11 = v10 != 0;
            if (!a1)
            {
                return v11;
            }
            else if (!v10)
            {
                return v11;
            }
        }
        else
        {
            v9 = a5;
            if (!a1)
                return 1;
        }
        v12 = a0;
        *(unsigned int *)&v12[0x88] = 0xffffffff;
        v13 = sub_a2d030(*(long long *)a0);
        if (!v13)
        {
            return v13;
        }
        else if ((int)sub_a4d408(*(long long *)a0, a2) >= 1)
        {
            v14 = sub_a4d03c(*(long long *)a0, 0, a1, &g_d35f7c, v9);
            if (!(unsigned int)v14)
                return v14;
            v15 = sub_a50638(*(long long *)a0);
            if (!(v15 >> 31 & 1))
            {
                v16 = v15;
                v17 = a0;
                v8 = v17 + 72;
                if ((int)sub_a50654(*(long long *)v17, v8, &g_d35f7c, v16) >= 1)
                {
                    v18 = (char)a0[72];
                    v19 = (unsigned int)v16 - 1;
                    if ((unsigned int)v16 >= 2)
                    {
                        if (33 > (unsigned int)v16)
                        {
                            v20 = 0;
                            v21 = v18;
                        }
                        else
                        {
                            v20 = v19 & 0x7fffffe0;
                            v22 = (__m128i)(CONCAT(v18 & 0xff | (v18 & 0xff) * 0x100 | (v18 & 0xff | (v18 & 0xff) * 0x100) * 0x10000 | (v18 & 0xff | (v18 & 0xff) * 0x100 | (v18 & 0xff | (v18 & 0xff) * 0x100) * 0x10000) * 0x100000000, v18 & 0xff | (v18 & 0xff) * 0x100 | (v18 & 0xff | (v18 & 0xff) * 0x100) * 0x10000 | (v18 & 0xff | (v18 & 0xff) * 0x100 | (v18 & 0xff | (v18 & 0xff) * 0x100) * 0x10000) * 0x100000000));
                            iter = a0 + 73;
                            i = v20;
                            do
                            {
                                v25 = i;
                                v26 = *iter;
                                v27 = __dirty_unsupported_Iop_SliceV128(v26, v22, 15);
                                v22 = iter[1];
                                v28 = __dirty_unsupported_Iop_SliceV128(v22, v26, 15);
                                *(uint128_t *)((char *)iter - 65) = _mm_add_epi8(_mm_add_epi8(v27, v27), ShrNV(ShrNV(v26, 1), 6));
                                *(uint128_t *)((char *)iter - 49) = _mm_add_epi8(_mm_add_epi8(v28, v28), ShrNV(ShrNV(v22, 1), 6));
                                iter += 2;
                                i = v25 - 32;
                            } while (i);
                            v21 = (char)_mm_extract_epi8(v22, 15);
                            v30 = v21;
                            if (v20 == v19)
                                goto LABEL_9f241c;
                        }
                        iter1 = v20 + a0 + 73;
                        j = v19 - v20;
                        do
                        {
                            v33 = j;
                            v30 = *iter1;
                            *(iter1 - 65) = (char)v21 * 2 | (char)(v30 * &_NSHomeDirectory >> 31);
                            iter1 += 1;
                            v21 = v30;
                            j = v33 - 1;
                        } while (j);
LABEL_9f241c:
                        v35 = v19;
                    }
                    else
                    {
                        v35 = 0;
                        v30 = v18;
                    }
                    if ((unsigned int)v16 == 16)
                        v36 = 135;
                    else
                        v36 = 27;
                    *((char *)a0 + v35 + 8) = v36 & (char)(v18 >> 7) ^ (char)v30 * 2;
                    v37 = a0 + 40;
                    v38 = (char)a0[8];
                    if ((unsigned int)v16 >= 2)
                    {
                        if ((unsigned int)v16 == 2)
                        {
                            v39 = 0;
                            v40 = v38;
                        }
                        else
                        {
                            v39 = v19 & 0x7ffffffe;
                            v41 = v38 | v38 * 0x100000000;
                            k = v39;
                            node = v37;
                            do
                            {
                                v44 = k;
                                v45 = (__m128i)_INSERT(__float_as_int(__int_as_float((unsigned int)(char)*(char *)((char *)node - 31))), 4, *(node - 30));
                                v47 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi32(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi64(_mm_cvtsi128_si64(v41), v45), _mm_unpacklo_epi64(_mm_cvtsi128_si64(v41), v45), 4)), 8));
                                v48 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(v47, v45));
                                v49 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_srli_epi32(v48, 7));
                                node[1] = *(unsigned int *)((void*)&v49 + 4);
                                *node = (unsigned int)v49;
                                node += 2;
                                k = v44 - 2;
                                v41 = v45;
                            } while (k);
                            v40 = _mm_extract_epi32(v45, 1);
                            v51 = v40;
                            if (v39 == v19)
                                goto LABEL_9f24ec;
                        }
                        iter2 = v39 + a0 + 40;
                        l = v19 - v39;
                        do
                        {
                            v54 = l;
                            v51 = *(iter2 - 31);
                            *iter2 = (char)v40 * 2 | (char)(v51 * &_NSHomeDirectory >> 31);
                            iter2 += 1;
                            v40 = v51;
                            l = v54 - 1;
                        } while (l);
                    }
                    else
                    {
                        v19 = 0;
                        v51 = v38;
                    }
LABEL_9f24ec:
                    v37[v19] = v36 & (char)(v38 >> 7) ^ (char)v51 * 2;
                    v7 = v16 & 0xffffffff;
                    sub_a66ec0(v8, v7);
                    v56 = sub_a4d03c(*(long long *)a0, 0, 0, &g_d35f7c, v9);
                    if ((unsigned int)v56)
                    {
                        _bzero(v8, v7);
                        *(unsigned int *)&v12[0x88] = 0;
                        return 1;
                    }
                    return v56;
                }
            }
        }
    }
    return 0;
}
