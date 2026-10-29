/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc62a8..0xc64b8 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c62a8(void* a0, void* a1, unsigned long long a2)
{
    void* v0;  // x10
    void* v1;  // x8
    unsigned long long v10;  // x12
    void* iter;  // x10
    uint128_t *iter1;  // x11
    unsigned long long j;  // x13
    unsigned long long v14;  // x13
    uint128_t v15;  // q1
    unsigned long long v17;  // x13
    void* v18;  // x10
    void* iter2;  // x11
    unsigned long long v2;  // 4106
    unsigned long long *v20;  // x14
    void* v21;  // x15
    unsigned long long v22;  // x12
    void* v23;  // x15
    unsigned long long v25;  // 4112
    void* v26;  // x10
    void* v27;  // x9
    unsigned long long v28;  // x9
    unsigned long long v29;  // x12
    unsigned long long v3;  // 4106
    void* node;  // x10
    uint128_t *v31;  // x11
    unsigned long long k;  // x13
    unsigned long long v33;  // x13
    uint128_t v34;  // q1
    unsigned long long v36;  // x13
    void* v37;  // x10
    void* m;  // x11
    void* v39;  // x14
    void* v4;  // x8
    void* v40;  // x15
    unsigned long long v41;  // x12
    void* v42;  // x15
    unsigned long long v44;  // 4112
    void* v45;  // x10
    long long v5;  // x9
    void* i;  // x10
    uint128_t *v7;  // x11
    uint128_t *v8;  // x11
    unsigned long long v9;  // x9

    v0 = a0 - a1;
    v1 = a0 + a2;
    if ((long long)a2 >= 8)
    {
        v2 = arm64g_calculate_condition(162, v0, 7, 0);
        if (!(v2 & 1))
        {
            v3 = arm64g_calculate_condition(130, v0, 0x11, 0);
            if (!(v3 & 1) && (v4 = v1 - 32, v5 = v4 - a0, v4 >= a0))
            {
                *(int128_t *)a0 = *(int128_t *)a1;
                if (v5 >= 0x11)
                {
                    i = a0 + 16;
                    v7 = a1 + 32;
                    do
                    {
                        *(int128_t *)i = *(int128_t *)((char *)v7 - 16);
                        v8 = v7 + 2;
                        *(uint128_t *)&i[16] = *v7;
                        i += 32;
                        v7 = v8;
                    } while (i < v4);
                }
                a1 += v5;
                v9 = a0 + a2 - v4;
                if (8 <= v9)
                    goto LABEL_c6370;
            }
            else
            {
                v4 = a0;
                v9 = a0 + a2 - a0;
                if (v9 >= 8)
                {
LABEL_c6370:
                    if (v4 - a1 >= 32)
                    {
                        if (32 > v9)
                        {
                            v10 = 0;
LABEL_c63dc:
                            v17 = v9 & 0xfffffffffffffff8;
                            v18 = a1 + v17;
                            iter2 = v4 + v17;
                            v20 = v4 + v10;
                            v21 = a1 + v10;
                            v22 = v10 - v17;
                            do
                            {
                                v23 = v21 + 8;
                                *(double *)v20 = *(double *)v21;
                                v20 += 1;
                                v25 = arm64g_calculate_condition(18, v22, 8, 0);
                                v22 += 8;
                                v21 = v23;
                            } while (v25 & 1);
                            if (v9 == v17)
                                return a0;
                        }
                        else
                        {
                            v10 = v9 & 0xffffffffffffffe0;
                            iter = v4 + 16;
                            iter1 = a1 + 16;
                            j = v10;
                            do
                            {
                                v14 = j;
                                v15 = *iter1;
                                *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)iter1 - 16);
                                *(uint128_t *)iter = v15;
                                iter += 32;
                                iter1 += 2;
                                j = v14 - 32;
                            } while (j);
                            if (v9 == v10)
                                return a0;
                            if (v9 & 24)
                                goto LABEL_c63dc;
                            iter2 = v4 + v10;
                            v18 = a1 + v10;
                            goto LABEL_c6484;
                        }
                        goto LABEL_c6484;
                    }
                }
            }
            v18 = a1;
            iter2 = v4;
LABEL_c6484:
            do
            {
                v26 = v18 + 1;
                *(char *)iter2 = *(char *)v18;
                iter2 += 1;
                v18 = v26;
            } while (iter2 != v4 + v9);
            return a0;
        }
    }
    if ((long long)a2 < 1)
        return a0;
    v27 = a0 + a2;
    if (a0 + 1 >= v27)
        v27 = a0 + 1;
    v28 = v27 - a0;
    if (v28 < 8 || v0 < 32)
    {
        v37 = a1;
        m = a0;
    }
    else if (32 > v28)
    {
        v29 = 0;
LABEL_c6448:
        v36 = v28 & 0xfffffffffffffff8;
        v37 = a1 + v36;
        m = a0 + v36;
        v39 = a0 + v29;
        v40 = a1 + v29;
        v41 = v29 - v36;
        do
        {
            v42 = v40 + 8;
            *(double *)v39 = *(double *)v40;
            v39 += 8;
            v44 = arm64g_calculate_condition(18, v41, 8, 0);
            v41 += 8;
            v40 = v42;
        } while (v44 & 1);
        if (v28 == v36)
            return a0;
    }
    else
    {
        v29 = v28 & 0xffffffffffffffe0;
        node = a0 + 16;
        v31 = a1 + 16;
        k = v29;
        do
        {
            v33 = k;
            v34 = *v31;
            *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v31 - 16);
            *(uint128_t *)node = v34;
            node += 32;
            v31 += 2;
            k = v33 - 32;
        } while (k);
        if (v28 == v29)
            return a0;
        if (v28 & 24)
            goto LABEL_c6448;
        m = a0 + v29;
        v37 = a1 + v29;
    }
    do
    {
        v45 = v37 + 1;
        *(char *)m = *(char *)v37;
        m += 1;
        v37 = v45;
    } while (m < v1);
    return a0;
}
