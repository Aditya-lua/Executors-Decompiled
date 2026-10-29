/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfef4..0xc020c (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfef4_0 {
    char field_0;
} st_bfef4_0;


unsigned long long sub_bfef4(void* a0, long long a1, long long a2, void* a3, unsigned long a4, unsigned int a5)
{
    unsigned int v7;  // w23
    unsigned int v8;  // w20
    void* v17;  // x4
    unsigned int *v18;  // x9
    unsigned long idx;  // x8
    unsigned long v20;  // x11
    unsigned int *iter;  // x12
    unsigned long long i;  // x13
    unsigned long long v23;  // x13
    unsigned long v24;  // x14
    unsigned long j;  // x11
    void* v9;  // x22
    unsigned long v27;  // x12
    unsigned long index;  // x14
    unsigned long v29;  // x15
    unsigned long long v30;  // x21
    unsigned long v31;  // x11
    unsigned int v32;  // w12
    unsigned long long v33;  // x9
    unsigned long long k;  // x13
    void* node;  // x14
    unsigned long long v36;  // x13
    void* v10;  // x21
    unsigned long long l;  // x10
    unsigned long long v39;  // x11
    unsigned long v40;  // x8
    void* v41;  // x12
    void* v42;  // x13
    unsigned long long m;  // x14
    unsigned long long v44;  // x14
    unsigned long v46;  // x12
    unsigned long long v11;  // x0
    unsigned long long v47;  // x13
    unsigned long v48;  // x16
    unsigned long long iter1;  // x17
    unsigned long long v50;  // x2
    __m128i v51;  // q0
    void* v52;  // x2
    unsigned long long n;  // x1
    unsigned long long v54;  // x1
    uint128_t v55;  // q1
    uint128_t v56;  // q2
    unsigned long long v12;  // 4106
    void* v57;  // x3
    void* v59;  // x1
    unsigned long long i0;  // x2
    unsigned long long v61;  // x2
    unsigned long v13;  // x10
    unsigned int v14;  // w8
    unsigned long v15;  // x20
    unsigned long v16;  // x5
    long long v0;  // [bp-0x78]
    st_bfef4_0 **v1;  // [bp-0x68], Other Possible Types: char
    st_bfef4_0 *v2;  // [bp-0x60]
    char v3;  // [bp-0x58]
    char v4;  // [bp-0x54]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = &v1;
    v1 = &v2;
    if (2124 > a4)
        return 0xffffffffffffffff;
    v7 = *(int *)a0;
    *(uint128_t *)&a3[704] = 0;
    *(uint128_t *)&a3[720] = 0;
    v8 = v7 & 0xff;
    memset(a3 + 624, 0, 80);
    if (v8 > 12)
        return 0xffffffffffffffd4;
    v9 = a3 + 624;
    v10 = a3 + 992;
    *(unsigned int *)&v0 = a5;
    v11 = sub_76818(v10, 0x100, v9, &v3, &v4, a1, a2, a3 + 1248, 876, v0);
    v12 = arm64g_calculate_condition(130, v11, 120, 0);
    if (v12 & 1)
        return v11;
    v13 = v4;
    if (v8 >= (unsigned int)v13)
    {
        if (v8 < 11)
            v14 = v8;
        else
            v14 = 11;
        if ((unsigned int)v13 < 12)
            v15 = v14;
        else
            v15 = v8;
        if (*(int *)((char *)v9 + 4 * (v13 & 0xffffffff)))
        {
            v16 = v13;
            v17 = a3;
        }
        else
        {
            v17 = a3;
            v16 = v13;
            do
            {
                v16 = (unsigned int)v16 - 1;
            } while (!*(int *)((char *)v9 + 4 * (v16 & 0xffffffff)));
        }
        v18 = v17 + 680;
        idx = (unsigned int)v16 + 1;
        if (2 > (unsigned int)idx)
        {
            v20 = 0;
        }
        else
        {
            v20 = 0;
            iter = v17 + 628;
            i = idx - 1;
            do
            {
                v23 = i;
                v24 = *iter;
                iter[14] = v20;
                v20 += v24;
                iter += 1;
                i = v23 - 1;
            } while (i);
        }
        *v18 = v20;
        v18[idx] = v20;
        j = v3;
        if ((unsigned int)j)
        {
            v27 = 0;
            do
            {
                index = *((char *)v10 + v27);
                v29 = v18[index];
                v18[index] = (unsigned int)v29 + 1;
                *((char *)v17 + v29 + 736) = v27;
                v27 += 1;
            } while (j != v27);
        }
        *v18 = 0;
        if (2 > (unsigned int)idx)
        {
            v30 = v11;
        }
        else
        {
            v31 = 0;
            v32 = v15 - v13;
            v33 = idx - 1;
            k = v33;
            node = v17;
            do
            {
                v36 = k;
                *(unsigned int *)&node[4] = v31;
                node += 4;
                v31 += (int)node[624] << ((char)v32 & 31);
                v32 += 1;
                k = v36 - 1;
            } while (k);
            l = (unsigned int)v13 + 1 - v16;
            v39 = (unsigned int)(v15 - l) + 1;
            if ((unsigned int)v39 > (unsigned int)l)
            {
                if (9 > (unsigned int)idx)
                {
                    v40 = (unsigned int)l * 52;
                    v41 = v17 + 4;
                    do
                    {
                        v42 = v41;
                        m = v33;
                        do
                        {
                            v44 = m;
                            *(int *)((char *)v42 + v40) = (unsigned int)(*(int *)v42) >> ((char)l & 31);
                            v42 += 4;
                            m = v44 - 1;
                        } while (m);
                        l += 1;
                        v40 += 52;
                    } while (l < v39);
                }
                else
                {
                    v46 = 0;
                    v47 = v33 & 0xfffffffffffffff8;
                    v48 = (unsigned int)l * 52;
                    iter1 = l;
                    do
                    {
                        if (32 > (v46 + l) * 52)
                        {
                            v50 = 1;
                        }
                        else
                        {
                            v51 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT(iter1 & 0xffffffff | (iter1 & 0xffffffff) * 0x100000000, iter1 & 0xffffffff | (iter1 & 0xffffffff) * 0x100000000));
                            v52 = v17;
                            n = v47;
                            do
                            {
                                v54 = n;
                                v55 = __dirty_unsupported_Iop_Sh32Ux4((int128_t)v52[4], v51);
                                v56 = __dirty_unsupported_Iop_Sh32Ux4((int128_t)v52[20], v51);
                                v57 = v52 + v48;
                                *(uint128_t *)&v57[4] = v55;
                                *(uint128_t *)&v57[20] = v56;
                                v52 += 32;
                                n = v54 - 8;
                            } while (n);
                            v50 = v47 | 1;
                            if (v33 == v47)
                                continue;
                        }
                        v59 = v17 + v50 * 4;
                        i0 = idx - v50;
                        do
                        {
                            v61 = i0;
                            *(int *)((char *)v59 + v48) = (unsigned int)(*(int *)v59) >> ((char)iter1 & 31);
                            v59 += 4;
                            i0 = v61 - 1;
                        } while (i0);
                    } while ((iter1 += 1, v46 += 1, v48 += 52, v39 > iter1));
                }
            }
            v30 = v11;
        }
        sub_c4598(a0 + 4, v15, v17 + 736, v17 + 676);
        *(char *)a0 = v7;
        *(char *)&a0[1] = 1;
        *(char *)&a0[2] = v15;
        *(char *)&a0[3] = v7 >> 24;
        return v30;
    }
    return 0xffffffffffffffd4;
}
