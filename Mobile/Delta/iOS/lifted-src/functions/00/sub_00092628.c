/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x92628..0x92c04 (1500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_92628_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[28];
    unsigned int field_2c;
    char padding_30[64];
    struct st_92628_2 *field_70;
    char padding_78[144];
    unsigned int field_108;
    char padding_10c[4];
    int field_110;
} st_92628_1;

typedef struct st_92628_2 {
    unsigned long long field_0;
} st_92628_2;

typedef struct st_92628_0 {
    char field_0;
} st_92628_0;


void sub_92628(st_92628_1 *a0, void* a1, unsigned long long a2)
{
    unsigned long long v2;  // x13
    unsigned long v3;  // x12
    unsigned long idx;  // x2
    unsigned long long *v13;  // x2
    unsigned long index;  // x2
    unsigned long idx1;  // x2
    unsigned int v16;  // w2
    unsigned long idx2;  // x2
    void* v18;  // x15
    unsigned long v19;  // x15
    unsigned long v20;  // x16
    unsigned long long v21;  // x16
    void* node;  // x14
    unsigned long long v22;  // x17
    unsigned long long v23;  // x0
    unsigned long long v24;  // x16
    void* v25;  // x16
    unsigned long long i;  // x1
    unsigned long long v27;  // x1
    unsigned long long v28;  // x4
    void* v30;  // x15
    unsigned long v31;  // x15
    void* v5;  // x8
    unsigned long v32;  // x16
    unsigned long long v33;  // x16
    unsigned long long v34;  // x17
    unsigned long long v35;  // x0
    unsigned long long v36;  // x16
    void* v37;  // x16
    unsigned long long l;  // x1
    unsigned long long v39;  // x1
    unsigned long long v40;  // x4
    void* iter;  // x11
    void* v42;  // x15
    unsigned long v43;  // x15
    unsigned long v44;  // x16
    unsigned long long v45;  // x16
    unsigned long long v46;  // x17
    unsigned long long v47;  // x0
    unsigned long long v48;  // x16
    void* v49;  // x16
    unsigned long long j;  // x1
    unsigned long long v51;  // x1
    unsigned long long *v7;  // x9
    unsigned long long v52;  // x4
    void* v54;  // x15
    unsigned long v55;  // x15
    unsigned long v56;  // x16
    unsigned long long v57;  // x16
    unsigned long long v58;  // x17
    unsigned long long v59;  // x0
    unsigned long long v60;  // x16
    void* v61;  // x16
    int v8;  // w16
    unsigned long long m;  // x1
    unsigned long long v63;  // x1
    unsigned long long v64;  // x4
    char v9;  // x15
    char v10;  // x10
    char v11;  // x15
    st_92628_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_92628_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_8;
    v3 = a0->field_2c;
    node = v2 + v3;
    v5 = a1 - 6;
    iter = node + 3;
    if (v5 <= iter)
        return;
    v7 = a0->field_70;
    v8 = a0->field_110;
    v9 = a0->field_108;
    v10 = 64 - v9;
    v11 = 32 - v9;
    if (a2)
    {
        do
        {
            if (6 >= v8)
            {
                if (v8 != 5)
                {
                    if (v8 == 6)
                    {
                        *(unsigned int *)((char *)v7 + 4 * (0xcf1bbcdcbf9b0000 * *(long long *)((char *)iter - 3) >> (v10 & 63))) = v3;
                        idx = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)iter - 2) >> (v10 & 63);
                        if (!*(int *)((char *)v7 + 4 * idx))
                            *(unsigned int *)((char *)v7 + 4 * idx) = (unsigned int)v3 + 1;
                        v13 = (char *)v7 + 4 * (0xcf1bbcdcbf9b0000 * *(long long *)((char *)iter - 1) >> (v10 & 63));
                        if (*(int *)v13)
                            continue;
                        goto LABEL_92858;
                    }
                }
                else
                {
                    *(unsigned int *)((char *)v7 + 4 * (0xcf1bbcdcbb000000 * *(long long *)((char *)iter - 3) >> (v10 & 63))) = v3;
                    index = 0xcf1bbcdcbb000000 * *(long long *)((char *)iter - 2) >> (v10 & 63);
                    if (!*(int *)((char *)v7 + 4 * index))
                        *(unsigned int *)((char *)v7 + 4 * index) = (unsigned int)v3 + 1;
                    v13 = (char *)v7 + 4 * (0xcf1bbcdcbb000000 * *(long long *)((char *)iter - 1) >> (v10 & 63));
                    if (*(int *)v13)
                        continue;
                    goto LABEL_92858;
                }
                goto LABEL_92784;
            }
            else if (v8 != 7)
            {
                if (v8 == 8)
                {
                    *(unsigned int *)((char *)v7 + 4 * (14923729446382167139 * *(long long *)((char *)iter - 3) >> (v10 & 63))) = v3;
                    idx1 = 14923729446382167139 * *(long long *)((char *)iter - 2) >> (v10 & 63);
                    if (!*(int *)((char *)v7 + 4 * idx1))
                        *(unsigned int *)((char *)v7 + 4 * idx1) = (unsigned int)v3 + 1;
                    v13 = (char *)v7 + 4 * (14923729446382167139 * *(long long *)((char *)iter - 1) >> (v10 & 63));
                    if (*(int *)v13)
                        continue;
                    goto LABEL_92858;
                }
LABEL_92784:
                *(unsigned int *)((char *)v7 + 4 * (2654435761 * *(int *)((char *)iter - 3) >> (v11 & 31))) = v3;
                v16 = 2654435761 * *(int *)((char *)iter - 2) >> (v11 & 31);
                if (!*(int *)((char *)v7 + 4 * v16))
                    *(unsigned int *)((char *)v7 + 4 * v16) = (unsigned int)v3 + 1;
                v13 = (char *)v7 + 4 * (2654435761 * *(int *)((char *)iter - 1) >> (v11 & 31));
                if (*(int *)v13)
                    continue;
                goto LABEL_92858;
            }
            else
            {
                *(unsigned int *)((char *)v7 + 4 * (0xcf1bbcdcbfa56300 * *(long long *)((char *)iter - 3) >> (v10 & 63))) = v3;
                idx2 = 0xcf1bbcdcbfa56300 * *(long long *)((char *)iter - 2) >> (v10 & 63);
                if (!*(int *)((char *)v7 + 4 * idx2))
                    *(unsigned int *)((char *)v7 + 4 * idx2) = (unsigned int)v3 + 1;
                v13 = (char *)v7 + 4 * (0xcf1bbcdcbfa56300 * *(long long *)((char *)iter - 1) >> (v10 & 63));
                if (*(int *)v13)
                    continue;
LABEL_92858:
                *(unsigned int *)v13 = (unsigned int)v3 + 2;
            }
        } while ((iter += 3, v3 = (unsigned int)v3 + 3, v5 > iter));
        return;
    }
    else
    {
        if (6 >= v8)
        {
            if (v8 == 5)
            {
                v30 = v2 + v3 + 6;
                if (v5 >= v30)
                    v30 = v5;
                v31 = v30 - v2 - 6;
                if (v31 == v3)
                    v32 = v3;
                else
                    v32 = v3 + 1;
                v33 = (v31 - v32) / 3;
                if (v31 != v3)
                    v33 += 1;
                if (v33)
                {
                    v34 = v33 + 1;
                    v35 = v34 & 0x7ffffffffffffffe;
                    v36 = v35 * 3;
                    iter += v36;
                    v37 = node + v36;
                    l = v35;
                    do
                    {
                        v39 = l;
                        v40 = 0xcf1bbcdcbb000000 * (long long)node[3];
                        *(unsigned int *)((char *)v7 + 4 * (0xcf1bbcdcbb000000 * *(long long *)node >> (v10 & 63))) = v3;
                        *(unsigned int *)((char *)v7 + 4 * (v40 >> (v10 & 63))) = (unsigned int)v3 + 3;
                        v3 = (unsigned int)v3 + 6;
                        node += 6;
                        l = v39 - 2;
                    } while (l);
                    if (v34 == v35)
                        return;
                }
                else
                {
                    v37 = node;
                }
                do
                {
                    *(unsigned int *)((char *)v7 + 4 * (0xcf1bbcdcbb000000 * *(long long *)v37 >> (v10 & 63))) = (unsigned int)(v37 - v2);
                    iter += 3;
                    v37 = iter;
                } while (iter < v5);
                return;
            }
            else if (v8 == 6)
            {
                v18 = v2 + v3 + 6;
                if (v5 >= v18)
                    v18 = v5;
                v19 = v18 - v2 - 6;
                if (v19 == v3)
                    v20 = v3;
                else
                    v20 = v3 + 1;
                v21 = (v19 - v20) / 3;
                if (v19 != v3)
                    v21 += 1;
                if (v21)
                {
                    v22 = v21 + 1;
                    v23 = v22 & 0x7ffffffffffffffe;
                    v24 = v23 * 3;
                    iter += v24;
                    v25 = node + v24;
                    i = v23;
                    do
                    {
                        v27 = i;
                        v28 = 0xcf1bbcdcbf9b0000 * (long long)node[3];
                        *(unsigned int *)((char *)v7 + 4 * (0xcf1bbcdcbf9b0000 * *(long long *)node >> (v10 & 63))) = v3;
                        *(unsigned int *)((char *)v7 + 4 * (v28 >> (v10 & 63))) = (unsigned int)v3 + 3;
                        v3 = (unsigned int)v3 + 6;
                        node += 6;
                        i = v27 - 2;
                    } while (i);
                    if (v22 == v23)
                        return;
                }
                else
                {
                    v25 = node;
                }
                do
                {
                    *(unsigned int *)((char *)v7 + 4 * (0xcf1bbcdcbf9b0000 * *(long long *)v25 >> (v10 & 63))) = (unsigned int)(v25 - v2);
                    iter += 3;
                    v25 = iter;
                } while (iter < v5);
                return;
            }
        }
        else
        {
            if (v8 == 7)
            {
                v54 = v2 + v3 + 6;
                if (v5 >= v54)
                    v54 = v5;
                v55 = v54 - v2 - 6;
                if (v55 == v3)
                    v56 = v3;
                else
                    v56 = v3 + 1;
                v57 = (v55 - v56) / 3;
                if (v55 != v3)
                    v57 += 1;
                if (v57)
                {
                    v58 = v57 + 1;
                    v59 = v58 & 0x7ffffffffffffffe;
                    v60 = v59 * 3;
                    iter += v60;
                    v61 = node + v60;
                    m = v59;
                    do
                    {
                        v63 = m;
                        v64 = 0xcf1bbcdcbfa56300 * (long long)node[3];
                        *(unsigned int *)((char *)v7 + 4 * (0xcf1bbcdcbfa56300 * *(long long *)node >> (v10 & 63))) = v3;
                        *(unsigned int *)((char *)v7 + 4 * (v64 >> (v10 & 63))) = (unsigned int)v3 + 3;
                        v3 = (unsigned int)v3 + 6;
                        node += 6;
                        m = v63 - 2;
                    } while (m);
                    if (v58 == v59)
                        return;
                }
                else
                {
                    v61 = node;
                }
                do
                {
                    *(unsigned int *)((char *)v7 + 4 * (0xcf1bbcdcbfa56300 * *(long long *)v61 >> (v10 & 63))) = (unsigned int)(v61 - v2);
                    iter += 3;
                    v61 = iter;
                } while (iter < v5);
                return;
            }
            else if (v8 == 8)
            {
                v42 = v2 + v3 + 6;
                if (v5 >= v42)
                    v42 = v5;
                v43 = v42 - v2 - 6;
                if (v43 == v3)
                    v44 = v3;
                else
                    v44 = v3 + 1;
                v45 = (v43 - v44) / 3;
                if (v43 != v3)
                    v45 += 1;
                if (v45)
                {
                    v46 = v45 + 1;
                    v47 = v46 & 0x7ffffffffffffffe;
                    v48 = v47 * 3;
                    iter += v48;
                    v49 = node + v48;
                    j = v47;
                    do
                    {
                        v51 = j;
                        v52 = 14923729446382167139 * (long long)node[3];
                        *(unsigned int *)((char *)v7 + 4 * (14923729446382167139 * *(long long *)node >> (v10 & 63))) = v3;
                        *(unsigned int *)((char *)v7 + 4 * (v52 >> (v10 & 63))) = (unsigned int)v3 + 3;
                        v3 = (unsigned int)v3 + 6;
                        node += 6;
                        j = v51 - 2;
                    } while (j);
                    if (v46 == v47)
                        return;
                }
                else
                {
                    v49 = node;
                }
                do
                {
                    *(unsigned int *)((char *)v7 + 4 * (14923729446382167139 * *(long long *)v49 >> (v10 & 63))) = (unsigned int)(v49 - v2);
                    iter += 3;
                    v49 = iter;
                } while (iter < v5);
                return;
            }
        }
        do
        {
            *(unsigned int *)((char *)v7 + 4 * (2654435761 * *(int *)((char *)iter - 3) >> (v11 & 31))) = v3;
            iter += 3;
            v3 = (unsigned int)v3 + 3;
        } while (iter < v5);
        return;
    }
}
