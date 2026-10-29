/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8ad88..0x8b010 (648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8ad88_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[28];
    unsigned int field_2c;
    char padding_30[64];
    struct st_8ad88_2 *field_70;
    char padding_78[8];
    struct st_8ad88_2 *field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
    char padding_10c[4];
    int field_110;
} st_8ad88_1;

typedef struct st_8ad88_2 {
    unsigned int field_0;
} st_8ad88_2;

typedef struct st_8ad88_0 {
    char field_0;
} st_8ad88_0;


void sub_8ad88(st_8ad88_1 *a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v2;  // x4
    unsigned long v3;  // x3
    unsigned long long node;  // x2
    unsigned int v13;  // w3
    unsigned long v14;  // x4
    unsigned long long v15;  // x5
    unsigned long long v16;  // x5
    unsigned long long v17;  // x5
    unsigned long long index;  // x4
    unsigned long long v19;  // x4
    unsigned long long idx;  // x5
    unsigned long long iter;  // x2
    unsigned long long i;  // x8
    unsigned int v22;  // w3
    unsigned long v23;  // x4
    unsigned long long v24;  // x5
    unsigned int *v5;  // x9
    int v6;  // w10
    unsigned int *v7;  // x11
    char v8;  // x1
    char v9;  // x17
    char v10;  // x0
    char v11;  // x1
    st_8ad88_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_8ad88_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_8;
    v3 = a0->field_2c;
    i = a1 - 8;
    if (v2 + v3 + 2 > i)
        return;
    v5 = a0->field_70;
    v6 = a0->field_110;
    v7 = a0->field_80;
    v8 = a0->field_104;
    v9 = 56 - v8;
    v10 = 24 - v8;
    v11 = 56 - a0->field_108;
    if (a2)
    {
        node = v3 + v2 + 2;
        v13 = (unsigned int)v3 * 0x100 + 0x200;
        do
        {
            if (6 >= v6)
            {
                if (v6 != 5)
                {
                    if (v6 == 6)
                    {
                        v14 = *(long long *)(node - 2);
                        v15 = 0xcf1bbcdcbf9b0000 * v14;
                        goto LABEL_8aeb8;
                    }
                }
                else
                {
                    v14 = *(long long *)(node - 2);
                    v15 = 0xcf1bbcdcbb000000 * v14;
                    goto LABEL_8aeb8;
                }
                goto LABEL_8ae90;
            }
            else if (v6 != 7)
            {
                if (v6 == 8)
                {
                    v14 = *(long long *)(node - 2);
                    v15 = 14923729446382167139 * v14;
                    goto LABEL_8aeb8;
                }
LABEL_8ae90:
                v16 = 2654435761 * *(int *)(node - 2) >> (v10 & 31);
                v14 = *(long long *)(node - 2);
                goto LABEL_8aebc;
            }
            else
            {
                v14 = *(long long *)(node - 2);
                v15 = 0xcf1bbcdcbfa56300 * v14;
LABEL_8aeb8:
                v16 = v15 >> (v9 & 63);
LABEL_8aebc:
                *(unsigned int *)((char *)v7 + (v16 >> 6 & 0x3fffffffffffffc)) = v13 + ((unsigned int)v16 & 0xff) - 0x200;
                *(unsigned int *)((char *)v5 + (14923729446382167139 * v14 >> (v11 & 63) >> 6 & 0x3fffffffffffffc)) = v13 + ((unsigned int)(14923729446382167139 * v14 >> (v11 & 63)) & 0xff) - 0x200;
                v17 = 14923729446382167139 * *(long long *)(node - 1) >> (v11 & 63);
                index = v17 >> 8;
                if (v5[index])
                {
                    v19 = 14923729446382167139 * *(long long *)node >> (v11 & 63);
                    idx = v19 >> 8;
                    if (v5[idx])
                        continue;
                }
                else
                {
                    v5[index] = v13 + ((unsigned int)v17 & 0xff) - 0x100;
                    v19 = 14923729446382167139 * *(long long *)node >> (v11 & 63);
                    idx = v19 >> 8;
                    if (v5[idx])
                        continue;
                }
                v5[idx] = v13 + ((unsigned int)v19 & 0xff);
            }
        } while ((node += 3, v13 += 0x300, i >= node));
        return;
    }
    else
    {
        iter = v3 + v2 + 2;
        v22 = (unsigned int)v3 * 0x100;
        do
        {
            if (6 >= v6)
            {
                if (v6 != 5)
                {
                    if (v6 == 6)
                    {
                        v23 = *(long long *)(iter - 2);
                        v24 = 0xcf1bbcdcbf9b0000 * *(long long *)(iter - 2) >> (v9 & 63);
                        continue;
                    }
                }
                else
                {
                    v23 = *(long long *)(iter - 2);
                    v24 = 0xcf1bbcdcbb000000 * *(long long *)(iter - 2) >> (v9 & 63);
                    continue;
                }
                goto LABEL_8af60;
            }
            else if (v6 != 8)
            {
                if (v6 == 7)
                {
                    v23 = *(long long *)(iter - 2);
                    v24 = 0xcf1bbcdcbfa56300 * *(long long *)(iter - 2) >> (v9 & 63);
                    continue;
                }
LABEL_8af60:
                v24 = 2654435761 * *(int *)(iter - 2) >> (v10 & 31);
                v23 = *(long long *)(iter - 2);
                continue;
            }
            else
            {
                v23 = *(long long *)(iter - 2);
                v24 = 14923729446382167139 * *(long long *)(iter - 2) >> (v9 & 63);
            }
            *(unsigned int *)((char *)v7 + (v24 >> 6 & 0x3fffffffffffffc)) = v22 + ((unsigned int)v24 & 0xff);
            *(unsigned int *)((char *)v5 + (14923729446382167139 * v23 >> (v11 & 63) >> 6 & 0x3fffffffffffffc)) = v22 + ((unsigned int)(14923729446382167139 * v23 >> (v11 & 63)) & 0xff);
            iter += 3;
            v22 += 0x300;
        } while (i >= iter);
        return;
    }
}
