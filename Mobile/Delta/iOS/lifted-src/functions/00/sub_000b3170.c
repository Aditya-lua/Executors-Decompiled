/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3170..0xb3550 (992 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3170_0 {
    char padding_0[8];
    void* field_8;
    char padding_10[28];
    unsigned int field_2c;
    char padding_30[64];
    struct st_b3170_1 *field_70;
    char padding_78[8];
    struct st_b3170_1 *field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    int field_110;
} st_b3170_0;

typedef struct st_b3170_1 {
    unsigned int field_0;
} st_b3170_1;

typedef struct st_b3170_2 {
    char field_0;
} st_b3170_2;


double sub_b3170(st_b3170_0 *a0, unsigned int a1)
{
    void* v2;  // x9
    unsigned int v3;  // w8
    unsigned long long v12;  // x2
    unsigned int *v13;  // x15
    unsigned int *v14;  // x3
    void* v15;  // x4
    char v16;  // x20
    int v17;  // w24
    unsigned long long index;  // x24
    unsigned long v19;  // x5
    unsigned long v20;  // x6
    unsigned long iter;  // x7
    unsigned int v4;  // w10
    unsigned long v22;  // x19
    unsigned int v23;  // w20
    unsigned long long v24;  // x20
    unsigned int v25;  // w21
    unsigned long v26;  // x23
    unsigned long v27;  // x22
    unsigned int *iter1;  // x1
    unsigned long i;  // x2
    unsigned long v30;  // x2
    unsigned long v5;  // x6
    unsigned int v32;  // w17
    unsigned int *node;  // x1
    unsigned int v34;  // w2
    void* v35;  // x3
    unsigned int v36;  // w4
    unsigned long j;  // x17
    int v38;  // w4
    unsigned long long v39;  // x4
    unsigned long long v40;  // x4
    unsigned long long v41;  // x4
    unsigned int v6;  // w1
    unsigned long v42;  // d0
    unsigned int v7;  // w7
    unsigned int v8;  // w19
    char v9;  // x16
    char v10;  // x17
    unsigned int v11;  // w10
    st_b3170_2 **v0;  // [bp-0x50], Other Possible Types: char
    st_b3170_2 *v1;  // [bp-0x48]

    v2 = a0->field_8;
    v3 = (unsigned int)(a1 - v2);
    v4 = 1 << ((char)a0->field_104 & 31);
    v5 = a0->field_2c;
    if (v4 < (unsigned int)(v3 - v5))
        v6 = v3 - v4;
    else
        v6 = v5;
    v7 = (1 << ((char)a0->field_10c & 31)) - 3;
    if (v7 < 0xff)
        v8 = v7;
    else
        v8 = 0xff;
    v9 = a0->field_108;
    v10 = v9 - 2;
    v11 = 3 << (v10 & 31);
    if (v11 < v3)
        v12 = v3 - v11 & 0xffffffff;
    else
        v12 = v5 & 0xffffffff;
    v1 = &v0;
    v0 = &v1;
    v13 = a0->field_70;
    v14 = a0->field_80;
    v15 = &v13[1 << (v10 & 63)];
    if (v3 > (unsigned int)v5)
    {
        v16 = 66 - v9;
        do
        {
            v17 = a0->field_110;
            if (6 >= v17)
            {
                if (v17 != 5)
                {
                    if (v17 == 6)
                    {
                        index = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v2 + v5) >> (v16 & 63) & 0xffffffff;
                        if (v5 < v12)
                            continue;
                        goto LABEL_b3260;
                    }
                }
                else
                {
                    index = 0xcf1bbcdcbb000000 * *(long long *)((char *)v2 + v5) >> (v16 & 63) & 0xffffffff;
                    if (v5 < v12)
                        continue;
                    goto LABEL_b3260;
                }
                goto LABEL_b32e0;
            }
            else if (v17 != 7)
            {
                if (v17 == 8)
                {
                    index = 14923729446382167139 * *(long long *)((char *)v2 + v5) >> (v16 & 63) & 0xffffffff;
                    if (v5 < v12)
                        continue;
                    goto LABEL_b3260;
                }
LABEL_b32e0:
                index = 2654435761 * *(int *)((char *)v2 + v5) >> ((char)(0x22 - v9) & 31);
                if (v12 > v5)
                    continue;
                goto LABEL_b3260;
            }
            else
            {
                index = 0xcf1bbcdcbfa56300 * *(long long *)((char *)v2 + v5) >> (v16 & 63) & 0xffffffff;
                if (v5 < v12)
                    continue;
LABEL_b3260:
                *(unsigned int *)((char *)v15 + 4 * (-(unsigned int)v12 + v5 & 0xffffffff)) = v13[index];
            }
        } while ((v13[index] = v5, v5 += 1, v3 > v5));
    }
    v19 = 1 << (v10 & 31);
    if (1 < v8)
        v20 = v8;
    else
        v20 = 1;
    if (v7)
    {
        iter = 0;
        v22 = 0;
        while (1)
        {
            v23 = v13[iter];
            if (v23 < (unsigned int)v12)
            {
LABEL_b3350:
                v13[iter] = 0;
                iter += 1;
                if (iter == v19)
                    break;
            }
            else
            {
                v24 = v6 > v23;
                v25 = *(int *)((char *)v15 + 4 * (v23 - v12 & 0xffffffff));
                if (v25 >= (unsigned int)v12)
                {
                    if (v6 <= v25)
                        v24 &= 1;
                    else
                        v24 = (unsigned int)v24 + 1;
                    v25 = *(int *)((char *)v15 + 4 * (v25 - v12 & 0xffffffff));
                    if ((unsigned int)v12 > v25)
                        goto LABEL_b3398;
                    if (v6 <= v25)
                        v24 &= 0xffffffff;
                    else
                        v24 = (unsigned int)v24 + 1;
                    v25 = *(int *)((char *)v15 + 4 * (v25 - v12 & 0xffffffff));
                    if (0)
                        goto LABEL_b3350;
LABEL_b33b8:
                    v26 = 0;
                    while (1)
                    {
                        v27 = v26;
                        if (v6 > v25 && (!v25 || !(v24 = (unsigned int)v24 + 1, 3 >= (unsigned int)v24)))
                            break;
                        v14[v22 + v27 & 0xffffffff] = v25;
                        v26 = (unsigned int)v27 + 1;
                        if (v25 >= (unsigned int)v12)
                        {
                            v25 = *(int *)((char *)v15 + 4 * (v25 - v12 & 0xffffffff));
                            if ((unsigned int)v20 == (unsigned int)v26)
                            {
                                v26 = v20;
                                goto LABEL_b33fc;
                            }
                        }
                        else
                        {
LABEL_b33fc:
                            v22 = (unsigned int)v22 + (unsigned int)v27 + 1;
                            v27 = v26;
                            goto LABEL_b3408;
                        }
                    }
                    v22 += v27;
                    if (!(unsigned int)v27)
                        goto LABEL_b3350;
LABEL_b3408:
                    v13[iter] = (unsigned int)v27 + (unsigned int)(v22 - v27) * 0x100;
                    iter += 1;
                    if (iter == v19)
                        break;
                }
                else
                {
LABEL_b3398:
                    if (!1)
                        goto LABEL_b33b8;
                    goto LABEL_b3350;
                }
            }
        }
    }
    else
    {
        iter1 = v13;
        i = v19;
        do
        {
            v30 = i;
            *iter1 = 0;
            iter1 += 1;
            i = v30 - 1;
        } while (i);
    }
    v32 = (4 << (v10 & 31)) - 4;
    node = (char *)v13 + 4 * v19 - 4;
    v34 = (unsigned int)v19 * 4 - 1;
    do
    {
        v35 = &v13[v32];
        v36 = *node;
        node = (char *)node - 4;
        *(unsigned int *)&v35[8] = 0;
        *(unsigned long long *)v35 = 0;
        v13[v34] = v36;
        v32 -= 4;
        v34 -= 4;
        v19 = (unsigned int)v19 - 1;
    } while ((unsigned int)v19);
    j = a0->field_2c;
    if (v3 > (unsigned int)j)
    {
        do
        {
            v38 = a0->field_110;
            if (6 < v38)
            {
                if (v38 == 7)
                {
                    v39 = 0xcf1bbcdcbfa56300 * *(long long *)((char *)v2 + j);
                    goto LABEL_b34b4;
                }
                if (v38 == 8)
                {
                    v39 = 14923729446382167139 * *(long long *)((char *)v2 + j);
LABEL_b34b4:
                    v40 = v39 >> ((char)(66 - v9) & 63);
                    continue;
                }
                else
                {
LABEL_b3518:
                    v40 = 2654435761 * *(int *)((char *)v2 + j) >> ((char)(0x22 - v9) & 31);
                }
            }
            else if (v38 != 5)
            {
                if (v38 != 6)
                    goto LABEL_b3518;
                v39 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v2 + j);
                goto LABEL_b34b4;
            }
            else
            {
                v39 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v2 + j);
                goto LABEL_b34b4;
            }
            v41 = (v40 * 16 | v40 >> 60) & 0x3fffffff0 & 0x3ffffffff;
            v42 = *(long long *)((char *)v13 + v41);
            *(unsigned long *)((char *)v13 + v41 + 4) = v42;
            *(unsigned int *)((char *)v13 + v41) = j;
            j += 1;
        } while (v3 > j);
    }
    a0->field_2c = v3;
    return v42;
}
