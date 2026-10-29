/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13ea00..0x13eba0 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13ea00_2 {
    struct st_13ea00_1 *field_0;
    char field_8;
    char padding_9[7];
    uint128_t field_10;
} st_13ea00_2;

typedef struct st_13ea00_1 {
    char padding_0[84];
    unsigned int field_54;
} st_13ea00_1;

typedef struct st_13ea00_0 {
    char field_0;
} st_13ea00_0;


long long sub_13ea00(st_13ea00_2 *iter, st_13ea00_2 *a1, st_13ea00_2 *iter1, st_13ea00_2 *a3, st_13ea00_2 *iter2)
{
    st_13ea00_2 *v7;  // x8
    st_13ea00_1 *v8;  // x9
    unsigned long long v17;  // x8
    uint128_t *v18;  // x12
    unsigned long long l;  // x13
    unsigned long long v20;  // x13
    uint128_t v21;  // q1
    unsigned long long v24;  // x8
    unsigned long long v25;  // x10
    unsigned long long v26;  // x11
    unsigned long long v27;  // x9
    st_13ea00_2 *v28;  // x8
    st_13ea00_2 *k;  // x9
    uint128_t *v30;  // x12
    uint128_t *node;  // x13
    unsigned long long j;  // x14
    unsigned long long v33;  // x14
    uint128_t v34;  // q1
    unsigned int v10;  // w11
    unsigned int v11;  // w12
    unsigned long long v12;  // x10
    st_13ea00_2 *m;  // x8
    uint128_t *v14;  // x9
    unsigned long long v15;  // x10
    unsigned long long v16;  // x11
    st_13ea00_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_13ea00_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x20]
    unsigned long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v4 = 0;
    v3 = &v4;
    if (iter != a1)
    {
        v7 = iter2;
        do
        {
            if (iter1 == a3 && iter != a1)
            {
                v12 = a1 - iter - 8;
                if (56 > v12)
                {
                    m = iter;
                }
                else if (32 > v7 - iter)
                {
                    m = iter;
                }
                else
                {
                    v14 = &iter2->field_10;
                    v15 = (v12 >> 3) + 1;
                    v16 = v15 & 0x3ffffffffffffffc;
                    v17 = v16 * 8;
                    iter2 = (char *)iter2 + v17;
                    m = (char *)iter + v17;
                    v18 = &iter->field_10;
                    l = v16;
                    do
                    {
                        v20 = l;
                        v21 = *v18;
                        *(int128_t *)((char *)v14 - 16) = *(int128_t *)((char *)v18 - 16);
                        *v14 = v21;
                        v18 += 2;
                        v14 += 2;
                        l = v20 - 4;
                    } while (l);
                    if (v15 == v16)
                    {
                        v2 = 0;
                        return sub_13e9e8(&v2, 0);
                    }
                }
                do
                {
                    iter2->field_0 = m->field_0;
                    iter2 = &iter2->field_8;
                    m = &m->field_8;
                } while (m != a1);
            }
            v8 = iter1->field_0;
            v10 = iter1->field_0->field_54;
            v11 = iter->field_0->field_54;
            if ((int)v10 >= (int)v11)
                v8 = iter->field_0;
            iter1 = &(&iter1->field_0)[(int)v11 > (int)v10];
            iter = &(&iter->field_0)[(int)v10 >= (int)v11];
            iter2->field_0 = v8;
            iter2 = &iter2->field_8;
            v7 = &v7->field_8;
        } while (iter != a1);
    }
    if (iter1 != a3)
    {
        v24 = a3 - iter1 - 8;
        if (v24 >= 24 && iter2 - iter1 >= 32)
        {
            v25 = (v24 >> 3) + 1;
            v26 = v25 & 0x3ffffffffffffffc;
            v27 = v26 * 8;
            v28 = (char *)iter2 + v27;
            k = (char *)iter1 + v27;
            v30 = &iter1->field_10;
            node = &iter2->field_10;
            j = v26;
            do
            {
                v33 = j;
                v34 = *v30;
                *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v30 - 16);
                *node = v34;
                v30 += 2;
                node += 2;
                j = v33 - 4;
            } while (j);
            if (v25 == v26)
            {
                v2 = 0;
                return sub_13e9e8(&v2, 0);
            }
        }
        else
        {
            v28 = iter2;
            k = iter1;
        }
        do
        {
            v28->field_0 = k->field_0;
            v28 = &v28->field_8;
            k = &k->field_8;
        } while (k != a3);
    }
    v2 = 0;
    return sub_13e9e8(&v2, 0);
}
