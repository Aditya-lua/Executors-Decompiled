/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b010..0x8b374 (868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b010_2 {
    char padding_0[8];
    void* field_8;
    char padding_10[28];
    unsigned int field_2c;
    char padding_30[64];
    void* field_70;
    char padding_78[8];
    void* field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
    char padding_10c[4];
    int field_110;
} st_8b010_2;

typedef struct st_8b010_1 {
    char padding_0[1];
    char field_1[9];
    char field_2;
} st_8b010_1;

typedef struct st_8b010_0 {
    char field_0;
} st_8b010_0;


st_8b010_2 * sub_8b010(st_8b010_2 *a0, unsigned long long a1, unsigned int a2)
{
    void* v2;  // x14
    unsigned long v3;  // x8
    unsigned long v12;  // x17
    unsigned long v13;  // x5
    unsigned long long v14;  // x6
    unsigned long long idx;  // x6
    unsigned int v16;  // w7
    st_8b010_1 *v17;  // x5
    unsigned long index;  // x6
    unsigned long long idx1;  // x5
    unsigned long long iter;  // x14
    unsigned long v21;  // x17
    unsigned long long v4;  // x9
    unsigned long long node;  // x14
    unsigned long v23;  // x17
    unsigned long long iter1;  // x14
    unsigned long v25;  // x17
    unsigned long long iter2;  // x14
    unsigned long long v27;  // x0
    unsigned long long m;  // x14
    unsigned long long v29;  // x16
    unsigned int *v5;  // x10
    unsigned int v6;  // w16
    unsigned int *v7;  // x11
    char v8;  // x12
    char v9;  // x13
    char v10;  // x15
    char v11;  // x12
    st_8b010_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_8b010_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_8;
    v3 = a0->field_2c;
    v4 = a1 - 8;
    if (v2 + v3 + 2 > v4)
        return a0;
    v5 = a0->field_70;
    v6 = a0->field_110;
    v7 = a0->field_80;
    v8 = a0->field_104;
    v9 = 64 - v8;
    v10 = 32 - v8;
    v11 = 64 - a0->field_108;
    if (a2)
    {
        v12 = 0;
        do
        {
            if (6 >= (int)v6)
            {
                if (v6 != 5)
                {
                    if (v6 == 6)
                    {
                        v13 = *(long long *)((char *)v2 + v3);
                        v14 = 0xcf1bbcdcbf9b0000 * v13;
                        goto LABEL_8b13c;
                    }
                }
                else
                {
                    v13 = *(long long *)((char *)v2 + v3);
                    v14 = 0xcf1bbcdcbb000000 * v13;
                    goto LABEL_8b13c;
                }
                goto LABEL_8b114;
            }
            else if (v6 != 7)
            {
                if (v6 == 8)
                {
                    v13 = *(long long *)((char *)v2 + v3);
                    v14 = 14923729446382167139 * v13;
                    goto LABEL_8b13c;
                }
LABEL_8b114:
                idx = 2654435761 * *(int *)((char *)v2 + v3) >> (v10 & 31);
                v13 = *(long long *)((char *)v2 + v3);
                goto LABEL_8b140;
            }
            else
            {
                v13 = *(long long *)((char *)v2 + v3);
                v14 = 0xcf1bbcdcbfa56300 * v13;
LABEL_8b13c:
                idx = v14 >> (v9 & 63);
LABEL_8b140:
                v16 = (unsigned int)v3 + (unsigned int)v12;
                v7[idx] = v16;
                v5[14923729446382167139 * v13 >> (v11 & 63)] = v16;
                v17 = v2 + v3;
                index = 14923729446382167139 * *(long long *)&v17->field_1[0] >> (v11 & 63);
                if (v5[index])
                {
                    idx1 = 14923729446382167139 * *(long long *)&v17->field_1[1] >> (v11 & 63);
                    if (v5[idx1])
                        continue;
                }
                else
                {
                    v5[index] = (unsigned int)v3 + (unsigned int)v12 + 1;
                    idx1 = 14923729446382167139 * *(long long *)&v17->field_1[1] >> (v11 & 63);
                    if (v5[idx1])
                        continue;
                }
                v5[idx1] = (unsigned int)v3 + (unsigned int)v12 + 2;
            }
        } while ((v2 += 3, v12 += 3, v4 >= v2 + v3 + 2));
        return 0xcf1bbcdcbfa56300;
    }
    else
    {
        if (6 >= (int)v6)
        {
            if (v6 == 5)
            {
                node = v3 + v2 + 2;
                do
                {
                    v23 = *(long long *)(node - 2);
                    v7[0xcf1bbcdcbb000000 * v23 >> (v9 & 63)] = v3;
                    v5[14923729446382167139 * v23 >> (v11 & 63)] = v3;
                    node += 3;
                    v3 = (unsigned int)v3 + 3;
                } while (node <= v4);
                return 0xcf1bbcdcbb000000 * v23 >> (v9 & 63);
            }
            else if (v6 == 6)
            {
                iter = v3 + v2 + 2;
                do
                {
                    v21 = *(long long *)(iter - 2);
                    v7[0xcf1bbcdcbf9b0000 * v21 >> (v9 & 63)] = v3;
                    v5[14923729446382167139 * v21 >> (v11 & 63)] = v3;
                    iter += 3;
                    v3 = (unsigned int)v3 + 3;
                } while (iter <= v4);
                return 0xcf1bbcdcbf9b0000 * v21 >> (v9 & 63);
            }
        }
        else
        {
            if (v6 == 8)
            {
                m = v3 + v2 + 2;
                do
                {
                    v29 = 14923729446382167139 * *(long long *)(m - 2);
                    v7[v29 >> (v9 & 63)] = v3;
                    v5[v29 >> (v11 & 63)] = v3;
                    m += 3;
                    v3 = (unsigned int)v3 + 3;
                } while (m <= v4);
                return 64;
            }
            else if (v6 == 7)
            {
                iter1 = v3 + v2 + 2;
                do
                {
                    v25 = *(long long *)(iter1 - 2);
                    v7[0xcf1bbcdcbfa56300 * v25 >> (v9 & 63)] = v3;
                    v5[14923729446382167139 * v25 >> (v11 & 63)] = v3;
                    iter1 += 3;
                    v3 = (unsigned int)v3 + 3;
                } while (iter1 <= v4);
                return 0xcf1bbcdcbfa56300 * v25 >> (v9 & 63);
            }
        }
        iter2 = v3 + v2 + 2;
        do
        {
            v27 = 14923729446382167139 * *(long long *)(iter2 - 2);
            v7[2654435761 * *(int *)(iter2 - 2) >> (v10 & 31)] = v3;
            v5[v27 >> (v11 & 63)] = v3;
            iter2 += 3;
            v3 = (unsigned int)v3 + 3;
        } while (iter2 <= v4);
        return v27;
    }
}
