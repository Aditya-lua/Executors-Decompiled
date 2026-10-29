/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f2e94..0x1f328c (1016 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f2e94_1 {
    void* field_0;
    char padding_8[16];
    unsigned long long field_18;
    char padding_20[16];
    char field_30;
    char padding_31[23];
    unsigned long long field_48;
} st_1f2e94_1;

typedef struct st_1f2e94_0 {
    char field_0;
} st_1f2e94_0;


long long sub_1f2e94(st_1f2e94_1 *a0, void* *a1, unsigned long long a2, unsigned int a3)
{
    unsigned long long i;  // w25
    unsigned long long iter;  // w27
    unsigned int v19;  // w10
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long v23;  // cc_ndep
    unsigned long v24;  // 4112
    unsigned long v25;  // cc_op
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // cc_dep2
    unsigned long long v28;  // 4107
    unsigned int iter1;  // w26
    unsigned long long v29;  // w10
    unsigned long v30;  // 4112
    unsigned long long v31;  // 4107
    void* v12;  // x8
    unsigned long long v32;  // x10
    unsigned long long v33;  // x11
    unsigned long long v34;  // x12
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v39;  // x11
    unsigned long long l;  // x10
    unsigned long long v13;  // w28
    uint128_t *iter2;  // x12
    unsigned long long j;  // x13
    unsigned long long v43;  // x13
    uint128_t *v44;  // x14
    uint128_t v45;  // q0
    uint128_t v46;  // q1
    unsigned long long idx;  // x10
    unsigned int v14;  // w21
    unsigned long long v50;  // x10
    unsigned long v51;  // x11
    unsigned long long i0;  // x12
    unsigned long long v53;  // x12
    uint128_t *v54;  // x13
    uint128_t v55;  // q1
    unsigned long long v15;  // x23
    unsigned int *v57;  // x9
    unsigned long long k;  // x10
    unsigned long long v59;  // x10
    unsigned long long index;  // x21
    unsigned int v62;  // w0
    unsigned long v16;  // x24
    unsigned long long v63;  // 4112
    unsigned long v64;  // x21
    void* v65;  // x8
    unsigned long long v66;  // x9
    __m128i v67;  // q0
    uint128_t *node;  // x10
    unsigned long long m;  // x11
    unsigned long long v70;  // x11
    __m128i v71;  // q2
    void* v17;  // x8
    unsigned int *v73;  // x8
    unsigned long long n;  // x9
    unsigned long long v75;  // x9
    unsigned int v77;  // w8
    unsigned long long v78;  // 4127
    unsigned long long v18;  // x9
    st_1f2e94_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_1f2e94_0 *v1;  // [bp-0x88]
    unsigned int v2;  // [bp-0x80]
    unsigned int v3;  // [bp-0x7c]
    unsigned long long v4;  // [bp-0x78]
    unsigned long long v5;  // [bp-0x70]
    unsigned long long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    i = (int)a1[1];
    v4 = 0;
    v5 = 0;
    v6 = 0;
    *(unsigned long long *)&a0->padding_8[0] = 0;
    *(unsigned long long *)&a0->padding_20[0] = 0;
    *(unsigned long long *)&a0->padding_31[7] = 0;
    a0->field_48 = 4294967297;
    if (i)
    {
        iter = 0;
        do
        {
            iter1 = iter + 1;
            v12 = *a1;
            v13 = *(int *)((char *)v12 + 4 * iter);
            v14 = v13 - 2;
            if (v13 != 2)
            {
                v15 = v13 - 1;
                if (v13 == 1)
                {
                    v2 = *(int *)((char *)v12 + 4 * iter1);
                    v3 = *(int *)((char *)v12 + 4 * iter + 8);
                    sub_1fa300(&a0->field_30, &v2);
                    iter += 3;
                    continue;
                }
                if (v13 < 3)
                {
                    iter = iter1;
                    continue;
                }
                sub_1f7538(a0, v15);
                v16 = *(int *)((char *)a0->field_0 + 4 * v14);
                sub_1fb614(&v4, v15);
                v17 = *a1;
                v18 = v4;
                v19 = 0xfffffffe - iter;
                if (13 <= v13)
                {
                    v24 = arm64g_calculate_condition(v20 | 32, v21, v22, v23);
                    v25 = 3;
                    v26 = (v24 & 1 ? v19 : 0);
                    v27 = (v24 & 1 ? v14 : 0);
                    v28 = arm64g_calculate_condition(35, v26, v27, 0);
                    v29 = (unsigned int)!(v28 & 1);
                    if (!(a3 & 1))
                        goto LABEL_1f3038;
                }
                else
                {
                    v30 = arm64g_calculate_condition(v20 | 32, v21, v22, v23);
                    v25 = 0;
                    v26 = (v30 & 1 ? v19 : 0);
                    v27 = (v30 & 1 ? v14 : 0);
                    v31 = arm64g_calculate_condition(32, v26, v27, 0);
                    v29 = (unsigned int)!(v31 & 1);
                    if (!(a3 & 1))
                    {
LABEL_1f3038:
                        if (v29 || 32 > v18 - (v17 + iter1 * 4))
                        {
                            v50 = 0;
                            iter = iter1;
                        }
                        else
                        {
                            v50 = v15 & 0xfffffff8;
                            iter = iter1 + (unsigned int)v50;
                            v51 = v18 + 16;
                            i0 = v50;
                            do
                            {
                                v53 = i0;
                                v54 = v17 + iter1 * 4;
                                v55 = v54[1];
                                *(uint128_t *)(v51 - 16) = *v54;
                                *(uint128_t *)v51 = v55;
                                v51 += 32;
                                iter1 += 8;
                                i0 = v53 - 8;
                            } while (i0);
                            if (v50 == v15)
                                goto LABEL_1f3094;
                        }
                        v57 = v18 + v50 * 4;
                        k = v15 - v50;
                        do
                        {
                            v59 = k;
                            *v57 = *(int *)((char *)v17 + 4 * iter);
                            v57 += 1;
                            iter += 1;
                            k = v59 - 1;
                        } while (k);
                        goto LABEL_1f3094;
                    }
                }
                if (!v29)
                {
                    v32 = v15 * 4;
                    v33 = v18 + v32;
                    v34 = v17 + iter1 * 4;
                    if (v18 < v34 + v32)
                    {
                        v35 = arm64g_calculate_condition(v25 | 48, v26, v27, 0);
                        v36 = arm64g_calculate_condition(52, (v35 & 1 ? v34 : 0x20000000), (v35 & 1 ? v33 : 0), 0);
                        if (v36 & 1)
                            goto LABEL_1f3074;
                    }
                    else
                    {
                        v37 = arm64g_calculate_condition(v25 | 48, v26, v27, 0);
                        v38 = arm64g_calculate_condition(48, (v37 & 1 ? v34 : 0x20000000), (v37 & 1 ? v33 : 0), 0);
                        if (v38 & 1)
                            goto LABEL_1f3074;
                    }
                    v39 = v15 & 0xfffffff8;
                    l = v15 & 7;
                    iter = iter1 + (unsigned int)v39;
                    iter2 = v18 + v15 * 4 - 16;
                    j = v39;
                    do
                    {
                        v43 = j;
                        v44 = v17 + iter1 * 4;
                        v45 = __dirty_unsupported_Iop_SliceV128(reverse(*v44), reverse(*v44), 8);
                        v46 = __dirty_unsupported_Iop_SliceV128(reverse(v44[1]), reverse(v44[1]), 8);
                        *(uint128_t *)((char *)iter2 - 16) = v46;
                        *iter2 = v45;
                        iter2 = (char *)iter2 - 32;
                        iter1 += 8;
                        j = v43 - 8;
                    } while (j);
                    if (v39 == v15)
                        goto LABEL_1f3094;
                    goto LABEL_1f307c;
                }
                else
                {
LABEL_1f3074:
                    l = v15;
                    iter = iter1;
LABEL_1f307c:
                    do
                    {
                        idx = l;
                        *(int *)(v18 - 4 + idx * 4) = *(int *)((char *)v17 + 4 * iter);
                        iter += 1;
                        l = idx - 1;
                    } while (l);
LABEL_1f3094:
                    if ((unsigned int)a2 && v5)
                    {
                        index = 0;
                        do
                        {
                            v62 = sub_1f4470(*(int *)(v4 + index * 4));
                            v63 = arm64g_calculate_condition(1, v62, 1, 0);
                            if (!(v63 & 1))
                                *(unsigned int *)(v4 + index * 4) = v62 | 0x200000;
                        } while ((index += 1, v5 > index));
                    }
                    v64 = *(int *)((char *)a0->field_0 + 4 * v15);
                    if ((unsigned int)v64 != (unsigned int)v16)
                    {
                        do
                        {
                            if (sub_1f4d6c(a0, a0->field_18 + (v64 & 0xffffffff) * 4, v4, v15) & 1)
                                goto LABEL_1f2f04;
                        } while ((v64 += v15, (unsigned int)v64 != (unsigned int)v16));
                    }
                    sub_1ee86c(&a0->field_18, v16, &v4);
                    v65 = a0->field_0;
                    if (8 >= v13)
                    {
                        v66 = 0;
                    }
                    else
                    {
                        v66 = v15 & 0xfffffff8;
                        v67 = (__m128i)(CONCAT(v15 & 0xffffffff | (v15 & 0xffffffff) * 0x100000000, v15 & 0xffffffff | (v15 & 0xffffffff) * 0x100000000));
                        node = v65 + 16;
                        m = v66;
                        do
                        {
                            v70 = m;
                            v71 = *node;
                            *(uint128_t *)((char *)node - 16) = _mm_add_epi32(*(int128_t *)((char *)node - 16), v67);
                            *node = _mm_add_epi32(v71, v67);
                            node += 2;
                            m = v70 - 8;
                        } while (m);
                        if (v66 == v15)
                            continue;
                    }
                    v73 = v65 + v66 * 4;
                    n = v15 - v66;
                    do
                    {
                        v75 = n;
                        *v73 = *v73 + (unsigned int)v15;
                        v73 += 1;
                        n = v75 - 1;
                    } while (n);
                }
            }
            else
            {
                iter += 2;
                v77 = *(int *)((char *)v12 + 4 * iter1);
                v78 = arm64g_calculate_condition(1, v77, 1, 0);
                if (!(v78 & 1))
                {
                    v2 = v77;
                    v3 = v77;
                    sub_1fa300(&a0->field_30, &v2);
                }
                else
                {
                    sub_1ebcb0(a0);
                }
            }
LABEL_1f2f04:
        } while (i > iter);
    }
    if (a2 & 1)
        sub_1f0f04(&a0->field_30);
    sub_1f2420(a0);
    return sub_1eccac(&v4);
}
