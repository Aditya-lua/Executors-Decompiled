/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e1d7c..0x9e203c (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e1d7c_0 {
    void* field_0;
    unsigned int field_8;
} st_9e1d7c_0;


int sub_9e1d7c(st_9e1d7c_0 *a0, st_9e1d7c_0 *a1, unsigned int *a2)
{
    unsigned int v2;  // w10
    unsigned int v3;  // x0
    uint128_t v12;  // q1
    unsigned long long v14;  // x12
    unsigned long long *node;  // x11
    unsigned long long *v16;  // x10
    unsigned long long j;  // x8
    unsigned int v18;  // x8
    void* v21;  // x8
    unsigned int v4;  // x9
    int v22;  // w11
    unsigned long idx;  // x12
    unsigned long long v24;  // 4131
    unsigned int v25;  // w13
    unsigned long index;  // x9
    unsigned int l;  // x17
    unsigned long long *v28;  // x16
    unsigned int v29;  // w1
    unsigned int *iter;  // x3
    unsigned int m;  // w4
    unsigned int v5;  // x8
    unsigned int v32;  // w5
    unsigned long long v33;  // 4140
    unsigned int v34;  // w4
    unsigned long long *v35;  // x5
    unsigned int v36;  // w10
    unsigned long v37;  // x15
    unsigned int k;  // x11
    unsigned int v39;  // w13
    unsigned int v40;  // x15
    unsigned int *iter1;  // x15
    void* v6;  // x10
    unsigned int v42;  // w16
    unsigned int v43;  // w17
    unsigned int v44;  // w17
    unsigned long long *v45;  // x16
    unsigned long long v46;  // x17
    unsigned long long v47;  // 4251
    void* v7;  // x11
    uint128_t *iter2;  // x12
    uint128_t *v9;  // x13
    unsigned long long i;  // x14
    unsigned int v11;  // x14
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a2;
    if (v2)
    {
        if (a1 != a0)
        {
            v3 = sub_9e4cdc();
            if (!v3)
                return v3;
            v4 = a1->field_8;
            if ((int)v4 >= 1)
            {
                v5 = 0;
                v6 = a1->field_0;
                v7 = a0->field_0;
                if (v4 >= 4 && v7 - v6 >= 32)
                {
                    v5 = v4 & 0x7ffffffc;
                    iter2 = v6 + 16;
                    v9 = v7 + 16;
                    i = v5;
                    do
                    {
                        v11 = i;
                        v12 = *iter2;
                        *(int128_t *)((char *)v9 - 16) = *(int128_t *)((char *)iter2 - 16);
                        *v9 = v12;
                        iter2 += 2;
                        v9 += 2;
                        i = v11 - 4;
                    } while (i);
                    if (v5 == v4)
                        goto LABEL_9e1e38;
                }
                v14 = v5 * 8;
                node = v7 + v14;
                v16 = v6 + v14;
                j = v4 - v5;
                do
                {
                    v18 = j;
                    *node = *v16;
                    node += 1;
                    v16 += 1;
                    j = v18 - 1;
                } while (j);
            }
LABEL_9e1e38:
            a0->field_8 = v4;
            v2 = *a2;
        }
        else
        {
            v4 = a0->field_8;
        }
        v21 = a0->field_0;
        v22 = (int)(((int)v2 < 0 ? v2 + 63 : v2)) >> 6;
        idx = v4 - 1;
        if ((int)idx > v22)
        {
            v24 = arm64g_calculate_condition(67, 0, v2, 0);
            if (v24 & 1)
                v25 = v2 & 63;
            else
                v25 = -(-v2 & 63);
            idx = v4 - 1;
            index = v22;
            do
            {
                l = *(long long *)((char *)v21 + 8 * idx);
                if (l)
                {
                    v28 = v21 + (idx - index) * 8;
                    v29 = a2[1];
                    do
                    {
                        *(unsigned long long *)((char *)v21 + 8 * idx) = 0;
                        if (v29)
                        {
                            iter = a2 + 2;
                            m = v29;
                            do
                            {
                                v32 = v2 - m;
                                v33 = arm64g_calculate_condition(67, 0, v32, 0);
                                if (v33 & 1)
                                    v34 = v32 & 63;
                                else
                                    v34 = -(-v32 & 63);
                                if ((int)v32 < 0)
                                    v32 += 63;
                                v35 = v21 + ((unsigned int)idx - ((int)(v32) >> 6)) * 8;
                                *v35 = *v35 ^ l >> ((char)v34 & 63);
                                if (v34)
                                    *(long long *)((char *)v35 - 8) = *(long long *)((char *)v35 - 8) ^ l << ((char)-v34 & 63);
                                m = *iter;
                                iter += 1;
                            } while (m);
                        }
                        *v28 = *v28 ^ l >> ((char)v25 & 63);
                        if (v25)
                            *(long long *)((char *)v28 - 8) = *(long long *)((char *)v28 - 8) ^ l << ((char)(64 - v25) & 63);
                        l = *(long long *)((char *)v21 + 8 * idx);
                    } while (l);
                }
            } while ((idx -= 1, (long long)idx > (long long)index));
        }
        else
        {
            index = v22;
        }
        if ((unsigned int)idx == v22)
        {
            v36 = v2 - v22 * 64;
            v37 = *(long long *)((char *)v21 + 8 * index);
            k = v37 >> ((char)v36 & 63);
            if (k)
            {
                v39 = a2[1];
                do
                {
                    v40 = v37 & 0xffffffffffffffff >> ((char)-v36 & 63);
                    if (!v36)
                        v40 = 0;
                    *(unsigned long long *)((char *)v21 + 8 * index) = v40;
                    *(long long *)v21 = *(long long *)v21 ^ k;
                    if (v39)
                    {
                        iter1 = a2 + 2;
                        v42 = v39;
                        do
                        {
                            v43 = ((int)v42 < 0 ? v42 + 63 : v42);
                            v44 = v42 - (v43 & 0xffffffc0);
                            v45 = v21 + ((int)(v43) >> 6) * 8;
                            *v45 = *v45 ^ k << ((char)v44 & 63);
                            v46 = k >> ((char)-v44 & 63);
                            v47 = arm64g_calculate_condition((v44 ? 4 : 0), (v44 ? v46 : 0x40000000), 0, 0);
                            if (!(v47 & 1))
                                v45[1] = v45[1] ^ v46;
                        } while ((v42 = *iter1, iter1 += 1, v42));
                    }
                    v37 = *(long long *)((char *)v21 + 8 * index);
                    k = v37 >> ((char)v36 & 63);
                } while (k);
            }
        }
        sub_9e5708();
    }
    else
    {
        sub_9e5b4c();
    }
    return 1;
}
