/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d501c..0x3d5228 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d501c_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char padding_4[1];
    unsigned long long field_5;
    unsigned long long field_d[2];
} st_3d501c_0;


void* sub_3d501c(void* a0, char *iter, unsigned long a2, unsigned int a3, unsigned long long a4)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    char v10;  // 4109
    uint128_t v11;  // 4130
    unsigned long long v12;  // d0
    unsigned long long j;  // x12
    void* v14;  // x13
    char v15;  // x14
    void* v16;  // x15
    unsigned long long v17;  // d0
    void* iter1;  // x15
    unsigned long long l;  // x16
    st_3d501c_0 *iter2;  // x10
    unsigned long long v20;  // x16
    unsigned long long v22;  // x11
    unsigned long long i;  // x10
    void* v24;  // x12
    char v25;  // 4115
    uint128_t v26;  // q0
    void* v27;  // x13
    unsigned long long k;  // x14
    unsigned long long v29;  // x14
    unsigned long long v3;  // x9
    unsigned long long v31;  // x12
    void* v32;  // x14
    void* v33;  // x15
    unsigned long long v34;  // x16
    void* v35;  // x17
    char v36;  // x2
    uint128_t v37;  // q0
    unsigned long long m;  // x3
    void* v39;  // x4
    char v4;  // x11
    unsigned long long v40;  // x3
    unsigned long long v42;  // x4
    unsigned long long n;  // x3
    void* v44;  // x4
    unsigned long long v45;  // x3
    char *v47;  // x3
    unsigned long long i0;  // x4
    unsigned long long v49;  // x4
    unsigned long long v5;  // x10
    unsigned long long v6;  // x11
    void* node;  // x11
    unsigned long long v8;  // x9
    char *v9;  // x1

    if ((int)a3 < 1)
    {
        return a0;
    }
    else if (a4 >= 1)
    {
        v0 = a4;
        v1 = a3;
        if (7 >= a4)
        {
            iter2 = a0 + 3;
            do
            {
                v3 = v1;
                v4 = *iter;
                iter += 1;
                *(&iter2->field_0 - 3) = v4;
                if (a4 != 1)
                {
                    *(&iter2->field_0 - 2) = v4;
                    if (a4 != 2)
                    {
                        *(&iter2->field_0 - 1) = v4;
                        if (a4 != 3)
                        {
                            iter2->field_0 = v4;
                            if (a4 != 4)
                            {
                                iter2->field_1 = v4;
                                if (a4 != 5)
                                {
                                    iter2->field_2 = v4;
                                    if (a4 != 6)
                                        iter2->field_3 = v4;
                                }
                            }
                        }
                    }
                }
            } while ((iter2 = &(&iter2->field_0)[v0], v1 = v3 - 1, v3 != 1));
            return a0;
        }
        else
        {
            v5 = v0 & 0x7ffffff8;
            if (31 >= a4)
            {
                v6 = v0 - v5;
                if (v0 == v5)
                {
                    node = a0 + 16;
                    do
                    {
                        v8 = v1;
                        v9 = iter + 1;
                        v10 = *iter;
                        v11 = __dirty_unsupported_Iop_ZeroHI64ofV128(CONCAT(v10 | v10 * 0x100 | (v10 | v10 * 0x100) * 0x10000 | (v10 | v10 * 0x100 | (v10 | v10 * 0x100) * 0x10000) * 0x100000000, v10 | v10 * 0x100 | (v10 | v10 * 0x100) * 0x10000 | (v10 | v10 * 0x100 | (v10 | v10 * 0x100) * 0x10000) * 0x100000000));
                        v12 = v11;
                        *(unsigned long long *)((char *)node - 16) = v12;
                        if (v5 != 8)
                        {
                            *(unsigned long long *)((char *)node - 8) = v12;
                            if (v5 != 16)
                                *(unsigned long long *)node = v12;
                        }
                    } while ((node += v0, v1 = v8 - 1, iter = v9, v8 != 1));
                    return a0;
                }
                else
                {
                    j = 0;
                    v14 = a0 + v5;
                    do
                    {
                        v15 = iter[j];
                        v16 = a0 + v0 * j;
                        v17 = v15 | v15 * 0x100 | (v15 | v15 * 0x100) * 0x10000 | (v15 | v15 * 0x100 | (v15 | v15 * 0x100) * 0x10000) * 0x100000000;
                        *(unsigned long long *)v16 = v17;
                        if (v5 != 8)
                        {
                            *(unsigned long long *)&v16[8] = v17;
                            if (v5 != 16)
                                *(unsigned long long *)&v16[16] = v17;
                        }
                        iter1 = v14;
                        l = v6;
                        do
                        {
                            v20 = l;
                            *(char *)iter1 = v15;
                            iter1 += 1;
                            l = v20 - 1;
                        } while (l);
                        j += 1;
                        v14 += v0;
                    } while (j != v1);
                    return a0;
                }
            }
            else
            {
                v22 = v0 & 0x7fffffe0;
                if (v22 == v0)
                {
                    i = 0;
                    v24 = a0 + 16;
                    do
                    {
                        v25 = iter[i];
                        v26 = CONCAT(v25 | v25 * 0x100 | (v25 | v25 * 0x100) * 0x10000 | (v25 | v25 * 0x100 | (v25 | v25 * 0x100) * 0x10000) * 0x100000000, v25 | v25 * 0x100 | (v25 | v25 * 0x100) * 0x10000 | (v25 | v25 * 0x100 | (v25 | v25 * 0x100) * 0x10000) * 0x100000000);
                        v27 = v24;
                        k = v22;
                        do
                        {
                            v29 = k;
                            *(uint128_t *)((char *)v27 - 16) = v26;
                            *(uint128_t *)v27 = v26;
                            v27 += 32;
                            k = v29 - 32;
                        } while (k);
                        i += 1;
                        v24 += v0;
                    } while (i != v1);
                    return a0;
                }
                else
                {
                    v31 = 0;
                    v32 = a0 + 16;
                    v33 = a0 + v22;
                    v34 = v5 - v22;
                    v35 = a0;
                    do
                    {
                        v36 = iter[v31];
                        v37 = CONCAT(v36 | v36 * 0x100 | (v36 | v36 * 0x100) * 0x10000 | (v36 | v36 * 0x100 | (v36 | v36 * 0x100) * 0x10000) * 0x100000000, v36 | v36 * 0x100 | (v36 | v36 * 0x100) * 0x10000 | (v36 | v36 * 0x100 | (v36 | v36 * 0x100) * 0x10000) * 0x100000000);
                        m = v22;
                        v39 = v32;
                        do
                        {
                            v40 = m;
                            *(uint128_t *)((char *)v39 - 16) = v37;
                            *(uint128_t *)v39 = v37;
                            v39 += 32;
                            m = v40 - 32;
                        } while (m);
                        v42 = v22;
                        if (v0 & 24)
                        {
                            n = v34;
                            v44 = v33;
                            do
                            {
                                v45 = n;
                                *(unsigned long long *)v44 = v36 | v36 * 0x100 | (v36 | v36 * 0x100) * 0x10000 | (v36 | v36 * 0x100 | (v36 | v36 * 0x100) * 0x10000) * 0x100000000;
                                v44 += 8;
                                n = v45 - 8;
                            } while (n);
                            v42 = v5;
                            if (v0 == v5)
                                continue;
                        }
                        v47 = v35 + v42;
                        i0 = v0 - v42;
                        do
                        {
                            v49 = i0;
                            *v47 = v36;
                            v47 += 1;
                            i0 = v49 - 1;
                        } while (i0);
                    } while ((v31 += 1, v32 += v0, v33 += v0, v35 += v0, v31 != v1));
                    return a0;
                }
            }
        }
    }
    else
    {
        return a0;
    }
}
