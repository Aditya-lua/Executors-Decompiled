/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13c728..0x13c898 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13c728_1 {
    struct st_13c728_0 *field_0;
    char field_8;
    char padding_9[7];
    uint128_t field_10;
} st_13c728_1;

typedef struct st_13c728_0 {
    char padding_0[84];
    unsigned int field_54;
} st_13c728_0;


st_13c728_1 * sub_13c728(st_13c728_1 *iter, st_13c728_1 *a1, st_13c728_1 *iter1, st_13c728_1 *a3, st_13c728_1 *a4)
{
    st_13c728_1 *iter2;  // x8
    st_13c728_0 *v1;  // x9
    unsigned long long v10;  // x13
    uint128_t *v11;  // x13
    unsigned long long l;  // x14
    unsigned long long v13;  // x14
    uint128_t v14;  // q1
    st_13c728_1 *v16;  // x9
    unsigned long long v17;  // x9
    unsigned long long v18;  // x11
    unsigned long long v19;  // x12
    st_13c728_0 *v2;  // x10
    unsigned long long v20;  // x10
    st_13c728_1 *k;  // x9
    st_13c728_1 *v22;  // x10
    uint128_t *node;  // x8
    uint128_t *v24;  // x13
    unsigned long long j;  // x14
    unsigned long long v26;  // x14
    uint128_t v27;  // q1
    st_13c728_1 *v29;  // x9
    unsigned int v3;  // w11
    unsigned int v4;  // w12
    unsigned long long v5;  // x9
    st_13c728_1 *m;  // x9
    uint128_t *v7;  // x10
    unsigned long long v8;  // x11
    unsigned long long v9;  // x12

    if (iter != a1)
    {
        iter2 = a4;
        do
        {
            if (iter1 == a3)
            {
                if (iter != a1)
                {
                    v5 = a1 - iter - 8;
                    if (56 > v5)
                    {
                        m = iter;
                    }
                    else if (32 > a4 - iter)
                    {
                        m = iter;
                    }
                    else
                    {
                        v7 = &iter2->field_10;
                        v8 = (v5 >> 3) + 1;
                        v9 = v8 & 0x3ffffffffffffffc;
                        v10 = v9 * 8;
                        m = (char *)iter + v10;
                        iter2 = (char *)iter2 + v10;
                        v11 = &iter->field_10;
                        l = v9;
                        do
                        {
                            v13 = l;
                            v14 = *v11;
                            *(int128_t *)((char *)v7 - 16) = *(int128_t *)((char *)v11 - 16);
                            *v7 = v14;
                            v7 += 2;
                            v11 += 2;
                            l = v13 - 4;
                        } while (l);
                        if (v8 == v9)
                            return iter;
                    }
                    do
                    {
                        v16 = &m->field_8;
                        iter2->field_0 = m->field_0;
                        iter2 = &iter2->field_8;
                        m = v16;
                    } while (m != a1);
                    return iter;
                }
                else
                {
                    return iter;
                }
            }
            v1 = iter1->field_0;
            v2 = iter->field_0;
            v3 = iter1->field_0->field_54;
            v4 = iter->field_0->field_54;
            if ((int)v3 >= (int)v4)
                v1 = v2;
            iter = &(&iter->field_0)[(int)v3 >= (int)v4];
            iter1 = &(&iter1->field_0)[(int)v4 > (int)v3];
            iter2->field_0 = v1;
            iter2 = &iter2->field_8;
            a4 = &a4->field_8;
        } while (iter != a1);
        if (iter1 == a3)
            return iter;
    }
    else
    {
        iter2 = a4;
        if (iter1 == a3)
            return iter;
    }
    v17 = a3 - iter1 - 8;
    if (v17 >= 24 && iter2 - iter1 > 31)
    {
        v18 = (v17 >> 3) + 1;
        v19 = v18 & 0x3ffffffffffffffc;
        v20 = v19 * 8;
        k = (char *)iter1 + v20;
        v22 = (char *)iter2 + v20;
        node = &iter2->field_10;
        v24 = &iter1->field_10;
        j = v19;
        do
        {
            v26 = j;
            v27 = *v24;
            *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v24 - 16);
            *node = v27;
            node += 2;
            v24 += 2;
            j = v26 - 4;
        } while (j);
        if (v18 == v19)
            return iter;
    }
    else
    {
        k = iter1;
        v22 = iter2;
    }
    do
    {
        v29 = &k->field_8;
        v22->field_0 = k->field_0;
        v22 = &v22->field_8;
        k = v29;
    } while (k != a3);
    return iter;
}
