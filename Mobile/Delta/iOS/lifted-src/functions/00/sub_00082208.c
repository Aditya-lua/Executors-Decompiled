/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82208..0x82324 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_82208(void* a0, void* a1, void* a2, void* a3)
{
    void* v0;  // x8
    void* v1;  // x10
    uint128_t *iter;  // x12
    unsigned long long j;  // x14
    unsigned long long v12;  // x14
    uint128_t v13;  // q1
    unsigned long long v15;  // x14
    void* k;  // x11
    void* iter1;  // x12
    void* iter2;  // x8
    void* v19;  // x10
    void* v2;  // x9
    unsigned long long v20;  // x13
    void* v21;  // x10
    unsigned long long v23;  // 4112
    void* v24;  // x11
    void* i;  // x9
    uint128_t *v4;  // x10
    uint128_t *v5;  // x10
    void* v6;  // x9
    unsigned long long v7;  // x9
    unsigned long long v8;  // x13
    unsigned long node;  // x11

    v0 = a0;
    v1 = a1;
    if (a3 >= a1)
    {
        v2 = a3 - a1;
        v0 = a0 + v2;
        *(int128_t *)a0 = *(int128_t *)a1;
        if (v2 >= 0x11)
        {
            i = a0 + 16;
            v4 = a1 + 32;
            do
            {
                *(int128_t *)i = *(int128_t *)((char *)v4 - 16);
                v5 = v4 + 2;
                *(uint128_t *)&i[16] = *v4;
                i += 32;
                v4 = v5;
            } while (i < v0);
        }
        v1 = a3;
    }
    if (a2 <= v1)
        return a0;
    if (a1 < a3)
        v6 = a3;
    else
        v6 = a1;
    v7 = a2 - v6;
    if (v7 < 8 || a0 - a1 < 32)
    {
        k = v1;
        iter1 = v0;
    }
    else if (32 > v7)
    {
        v8 = 0;
LABEL_822d4:
        v15 = v7 & 0xfffffffffffffff8;
        k = v1 + v15;
        iter1 = v0 + v15;
        iter2 = v0 + v8;
        v19 = v1 + v8;
        v20 = v8 - v15;
        do
        {
            v21 = v19 + 8;
            *(double *)iter2 = *(double *)v19;
            iter2 += 8;
            v23 = arm64g_calculate_condition(18, v20, 8, 0);
            v19 = v21;
            v20 += 8;
        } while (v23 & 1);
        if (v7 == v15)
            return a0;
    }
    else
    {
        v8 = v7 & 0xffffffffffffffe0;
        node = v0 + 16;
        iter = v1 + 16;
        j = v8;
        do
        {
            v12 = j;
            v13 = *iter;
            *(int128_t *)(node - 16) = *(int128_t *)((char *)iter - 16);
            *(uint128_t *)node = v13;
            node += 32;
            iter += 2;
            j = v12 - 32;
        } while (j);
        if (v7 == v8)
            return a0;
        if (v7 & 24)
            goto LABEL_822d4;
        iter1 = v0 + v8;
        k = v1 + v8;
    }
    do
    {
        v24 = k + 1;
        *(char *)iter1 = *(char *)k;
        iter1 += 1;
        k = v24;
    } while (k < a2);
    return a0;
}
