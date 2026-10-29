/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c8698..0x3c8b5c (1220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c8698_0 {
    unsigned long long field_0;
} st_3c8698_0;

extern float g_f038fc;
extern st_3c8698_0 *g_f0b120;

void* sub_3c8698(void* ptr, void* a1, long long a2, unsigned long long a3)
{
    void* v12;  // x0
    void* v13;  // x23
    void* v22;  // x28
    float v23;  // s1
    float v24;  // s0
    unsigned long long v25;  // 4139
    unsigned long long v26;  // 4127
    unsigned long long idx;  // x8
    float v28;  // s1
    float v29;  // s0
    unsigned long long v30;  // 4153
    unsigned long long v31;  // 4127
    float v14;  // s2
    void* k;  // x25
    void* node;  // x21
    void* v34;  // x22
    void* v35;  // x26
    void* v36;  // x20
    void* v37;  // x19
    void* m;  // x26
    void* v39;  // x26
    unsigned long v15;  // x24
    __m128 v43;  // q4
    uint128_t v44;  // q1
    __m128 v45;  // q1
    __m128 v46;  // q0
    __m128 v47;  // q1
    __m128 v48;  // q0
    uint128_t v49;  // q0
    uint128_t v50;  // q0
    uint128_t v51;  // q0
    void* i;  // x19
    __m128i v53;  // q0
    void* v56;  // x19
    float v57;  // s1
    float v58;  // s0
    unsigned long long v59;  // 4141
    unsigned long long v60;  // 4129
    unsigned long long index;  // x8
    void* iter;  // x22
    float v62;  // s1
    float v63;  // s0
    unsigned long long v64;  // 4159
    unsigned long long v65;  // 4129
    void* v66;  // x8
    void* iter1;  // x9
    void* iter2;  // x10
    __m128 v69;  // q0
    void* j;  // x11
    void* v71;  // x11
    void* v18;  // x25
    __m128 v72;  // q3
    __m128 v73;  // q1
    __m128 v74;  // q2
    __m128 v75;  // q5
    __m128 v76;  // q3
    __m128 v77;  // q1
    uint128_t v78;  // q2
    uint128_t v79;  // q2
    uint128_t v80;  // q2
    void* v19;  // x26
    uint128_t v82;  // q1
    uint128_t v83;  // q1
    uint128_t v84;  // q1
    __m128i v86;  // q2
    __m128i v87;  // q1
    unsigned long long v91;  // x9
    void* v20;  // x27
    unsigned long idx1;  // x10
    void* v93;  // x8
    void* v94;  // x8
    float v95;  // s3
    float v96;  // s2
    unsigned long long v97;  // 4149
    unsigned long long v98;  // 4127
    void* l;  // x28
    unsigned long long v0;  // [bp-0x120]
    unsigned long v1;  // [bp-0x118]
    void* v2;  // [bp-0x110]
    void* v3;  // [bp-0x100]
    __m128 v4;  // [bp-0xf0]
    uint128_t v5;  // [bp-0xe0]
    uint128_t v6;  // [bp-0xd0]
    __m128 v7;  // [bp-0xc0]
    uint128_t v8;  // [bp-0xb0]
    __m128 v9;  // [bp-0xa0]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    if (!ptr)
        return ptr;
    v12 = sub_3d6ef0(a1, a2, a3, 0);
    if (v12)
    {
        v2 = v12;
        v3 = a1 * a2;
        if ((int)(unsigned int)v3 >= 1)
        {
            v13 = (unsigned int)a3 + ((unsigned int)a3 & 1) - 1;
            if ((int)(unsigned int)v13 >= 1)
            {
                v14 = g_f038fc;
                v15 = (int)a3;
                v8 = *(unsigned int *)&g_f038fc;
                if (4 > (unsigned int)v13)
                {
                    i = 0;
                    iter = ptr;
                    v18 = v2;
                    do
                    {
                        v19 = iter;
                        v20 = v18;
                        l = v13;
                        do
                        {
                            v22 = l;
                            _powf();
                            v23 = *(int *)v19 * v14 * 255.0f + 0.5f;
                            v24 = 0.0f;
                            v25 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v23), 0.0f)) >> 5 & 3 | v23 < 0.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v23)) * 0x10000000, 0, 0);
                            if (!(v25 & 1))
                            {
                                v24 = v23;
                                v26 = arm64g_calculate_condition(208, (((((char)(CmpF(__float_as_int(v23), 255.0f)) >> 5 & 3 | v23 < 255.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v23)) * 0x10000000, 0, 0);
                                if (!(v26 & 1))
                                    v24 = 255.0f;
                            }
                            *(char *)v20 = (int)v24;
                            v20 += 1;
                            v19 += 4;
                            l = v22 - 1;
                            v14 = __int_as_float((unsigned int)v8);
                        } while (l);
                        if ((int)a3 > (int)(unsigned int)v13)
                        {
                            idx = v15 * i + v13;
                            v28 = *(int *)((char *)ptr + 4 * idx) * 255.0f + 0.5f;
                            v29 = 0.0f;
                            v30 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v28), 0.0f)) >> 5 & 3 | v28 < 0.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v28)) * 0x10000000, 0, 0);
                            if (!(v30 & 1))
                            {
                                v29 = v28;
                                v31 = arm64g_calculate_condition(208, (((((char)(CmpF(__float_as_int(v28), 255.0f)) >> 5 & 3 | v28 < 255.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v28)) * 0x10000000, 0, 0);
                                if (!(v31 & 1))
                                    v29 = 255.0f;
                            }
                            *((char *)v2 + idx) = (int)v29;
                        }
                        i += 1;
                        v18 += v15;
                        iter += v15 * 4;
                    } while (i != v3);
                }
                else
                {
                    k = 0;
                    v0 = v15 * 4;
                    node = ptr;
                    v34 = v2;
                    v4 = _mm_castsi128_ps(_mm_set1_epi32(0x437f0000));
                    do
                    {
                        v1 = v15 * k;
                        v35 = v13 & 0x7ffffffc;
                        v36 = node;
                        v37 = v34;
                        m = v35;
                        do
                        {
                            v39 = m;
                            v9 = _mm_mul_ps(*(int128_t *)v36, CONCAT(__float_as_int(v14) * 0x100000000 | __float_as_int(v14), __float_as_int(v14) * 0x100000000 | __float_as_int(v14)));
                            v7 = v9;
                            v6 = *(unsigned int *)((void*)&v9 + 4);
                            v5 = *(unsigned int *)((void*)&v9 + 8);
                            _powf(_powf(_powf(_powf())));
                            v43 = v4;
                            v44 = _INSERT(_INSERT(v7, 4, *(unsigned int *)&*(unsigned int *)(void*)&v6), 8, *(unsigned int *)&*(unsigned int *)(void*)&v5);
                            v45 = (__m128)_INSERT(v44, 12, *(unsigned int *)&*(unsigned int *)((void*)&v9 + 12));
                            v46 = _mm_add_ps(_mm_castsi128_ps(_mm_set1_epi32(0x3f000000)), _mm_mul_ps(v43, v45));
                            v47 = _mm_cmplt_ps(v46, _mm_setzero_ps());
                            v48 = _mm_xor_ps(v46, _mm_and_ps(_mm_xor_ps(v46, v43), ~(~v47 & ~_mm_cmplt_ps(v43, v46))));
                            v14 = __int_as_float((unsigned int)v8);
                            v49 = _INSERT(_mm_and_ps(v48, ~v47), 0, __int_as_float((int)(unsigned int)(_mm_and_ps(v48, ~v47) >> 0)));
                            v50 = _INSERT(v49, 4, *(unsigned int *)((void*)&v49 + 4));
                            v51 = _INSERT(v50, 8, *(unsigned int *)((void*)&v50 + 8));
                            v53 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(_INSERT(v51, 12, *(unsigned int *)((void*)&v51 + 12))));
                            *(unsigned int *)v37 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)));
                            m = v39 - 4;
                            v36 += 16;
                            v37 += 4;
                        } while (m);
                        v56 = v35;
                        if (v35 != v13)
                        {
                            do
                            {
                                _powf();
                                v57 = *(int *)((char *)node + 0x4 * v56) * v14 * 255.0f + 0.5f;
                                v58 = 0.0f;
                                v59 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v57), 0.0f)) >> 5 & 3 | v57 < 0.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v57)) * 0x10000000, 0, 0);
                                if (!(v59 & 1))
                                {
                                    v58 = v57;
                                    v60 = arm64g_calculate_condition(208, (((((char)(CmpF(__float_as_int(v57), 255.0f)) >> 5 & 3 | v57 < 255.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v57)) * 0x10000000, 0, 0);
                                    if (!(v60 & 1))
                                        v58 = 255.0f;
                                }
                            } while ((*(char *)(v34 + v56) = (int)v58, v56 += 1, v14 = __int_as_float((unsigned int)v8), v13 != v56));
                        }
                        if ((int)a3 > (int)(unsigned int)v13)
                        {
                            index = v1 + v13;
                            v62 = *(int *)((char *)ptr + 4 * index) * 255.0f + 0.5f;
                            v63 = 0.0f;
                            v64 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v62), 0.0f)) >> 5 & 3 | v62 < 0.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v62)) * 0x10000000, 0, 0);
                            if (!(v64 & 1))
                            {
                                v63 = v62;
                                v65 = arm64g_calculate_condition(208, (((((char)(CmpF(__float_as_int(v62), 255.0f)) >> 5 & 3 | v62 < 255.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v62)) * 0x10000000, 0, 0);
                                if (!(v65 & 1))
                                    v63 = 255.0f;
                            }
                            *((char *)v2 + index) = (int)v63;
                        }
                        k += 1;
                        v34 += v15;
                        node += v0;
                    } while (k != v3);
                }
            }
            else if ((int)a3 >= 1)
            {
                v66 = 0;
                if ((unsigned int)v3 >= 8 && (unsigned int)a3 == 1)
                {
                    v66 = v3 & 0x7ffffff8;
                    iter1 = ptr + 16;
                    iter2 = v2 + 4;
                    v69 = _mm_castsi128_ps(_mm_set1_epi32(0x437f0000));
                    j = v66;
                    do
                    {
                        v71 = j;
                        v72 = _mm_add_ps(_mm_castsi128_ps(_mm_set1_epi32(0x3f000000)), _mm_mul_ps(v69, *(int128_t *)((char *)iter1 - 16)));
                        v73 = _mm_add_ps(_mm_castsi128_ps(_mm_set1_epi32(0x3f000000)), _mm_mul_ps(v69, *(int128_t *)iter1));
                        v74 = _mm_cmplt_ps(v72, _mm_setzero_ps());
                        v75 = _mm_cmplt_ps(v73, _mm_setzero_ps());
                        v76 = _mm_xor_ps(v72, _mm_and_ps(_mm_xor_ps(v72, v69), ~(~v74 & ~_mm_cmplt_ps(v69, v72))));
                        v77 = _mm_xor_ps(v73, _mm_and_ps(_mm_xor_ps(v73, v69), ~(~v75 & ~_mm_cmplt_ps(v69, v73))));
                        v78 = _INSERT(_mm_and_ps(v76, ~v74), 0, __int_as_float((int)(unsigned int)(_mm_and_ps(v76, ~v74) >> 0)));
                        v79 = _INSERT(v78, 4, *(unsigned int *)((void*)&v78 + 4));
                        v80 = _INSERT(v79, 8, *(unsigned int *)((void*)&v79 + 8));
                        v82 = _INSERT(_mm_and_ps(v77, ~v75), 0, __int_as_float((int)(unsigned int)(_mm_and_ps(v77, ~v75) >> 0)));
                        v83 = _INSERT(v82, 4, *(unsigned int *)((void*)&v82 + 4));
                        v84 = _INSERT(v83, 8, *(unsigned int *)((void*)&v83 + 8));
                        v86 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(_INSERT(v80, 12, *(unsigned int *)((void*)&v80 + 12))));
                        v87 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(_INSERT(v84, 12, *(unsigned int *)((void*)&v84 + 12))));
                        *(unsigned long long *)((char *)iter2 - 4) = _INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v86, v69), _mm_unpacklo_epi64(v86, v69))), 4, (unsigned int)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v87, v69), _mm_unpacklo_epi64(v87, v69))));
                        iter1 += 32;
                        iter2 += 8;
                        j = v71 - 8;
                    } while (j);
                    if (v66 == v3)
                    {
                        _free(ptr);
                        return v2;
                    }
                }
                v91 = a3 & 0xffffffff;
                idx1 = (unsigned int)v66 * (unsigned int)v91;
                v93 = v3 - v66;
                do
                {
                    v94 = v93;
                    v95 = *(int *)((char *)ptr + 4 * idx1) * 255.0f + 0.5f;
                    v96 = 0.0f;
                    v97 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v95), 0.0f)) >> 5 & 3 | v95 < 0.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v95)) * 0x10000000, 0, 0);
                    if (!(v97 & 1))
                    {
                        v96 = v95;
                        v98 = arm64g_calculate_condition(208, (((((char)(CmpF(__float_as_int(v95), 255.0f)) >> 5 & 3 | v95 < 255.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v95)) * 0x10000000, 0, 0);
                        if (!(v98 & 1))
                            v96 = 255.0f;
                    }
                } while ((*((char *)v2 + idx1) = (int)v96, idx1 += v91, v93 = v94 - 1, v94 != 1));
            }
        }
        _free(ptr);
        return v2;
    }
    _free(ptr);
    g_f0b120();
}
