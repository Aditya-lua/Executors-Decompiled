/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9594c..0x95b30 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9594c_1 {
    char padding_0[8];
    void* field_8;
    char padding_10[28];
    unsigned int field_2c;
    char padding_30[64];
    struct st_9594c_2 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
} st_9594c_1;

typedef struct st_9594c_2 {
    unsigned int field_0;
} st_9594c_2;

typedef struct st_9594c_0 {
    char field_0;
} st_9594c_0;


st_9594c_1 * sub_9594c(st_9594c_1 *a0, unsigned int a1, unsigned long a2, int a3)
{
    void* v2;  // x9
    unsigned int v3;  // w8
    unsigned int *v12;  // x3
    unsigned long index;  // x1
    unsigned int v14;  // w2
    unsigned int *v15;  // x3
    unsigned long idx;  // x1
    unsigned int v17;  // w2
    unsigned int *v18;  // x3
    unsigned int v19;  // w15
    unsigned int v20;  // w17
    unsigned int *v21;  // x15
    unsigned long iter;  // x10
    unsigned long idx1;  // x1
    unsigned int v23;  // w2
    unsigned int *v24;  // x3
    unsigned int *v5;  // x11
    unsigned long long v6;  // x12
    unsigned int v7;  // w13
    char v8;  // x15
    unsigned long v9;  // x14
    unsigned long idx2;  // x1
    unsigned int v11;  // w2
    st_9594c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_9594c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_8;
    v3 = (unsigned int)(a1 - v2);
    iter = a0->field_2c;
    if (v3 > (unsigned int)iter)
    {
        v5 = a0->field_70;
        v6 = a0->field_80;
        v7 = ~(0xffffffff << ((char)(a0->field_104 - 1) & 31));
        v8 = 64 - a0->field_108;
        v9 = v3;
        if (6 >= a3)
        {
            if (a3 != 5)
            {
                if (a3 != 6)
                    goto LABEL_95a5c;
                do
                {
                    idx2 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v2 + iter) >> (v8 & 63);
                    v11 = v5[idx2];
                    v12 = v6 + ((unsigned int)iter & v7) * 2 * 4;
                    v5[idx2] = iter;
                    *v12 = v11;
                    v12[1] = 1;
                    iter += 1;
                } while (iter < v9);
            }
            else
            {
                do
                {
                    index = 0xcf1bbcdcbb000000 * *(long long *)((char *)v2 + iter) >> (v8 & 63);
                    v14 = v5[index];
                    v15 = v6 + ((unsigned int)iter & v7) * 2 * 4;
                    v5[index] = iter;
                    *v15 = v14;
                    v15[1] = 1;
                    iter += 1;
                } while (iter < v9);
            }
        }
        else
        {
            if (a3 == 8)
            {
                do
                {
                    idx1 = 14923729446382167139 * *(long long *)((char *)v2 + iter) >> (v8 & 63);
                    v23 = v5[idx1];
                    v24 = v6 + ((unsigned int)iter & v7) * 2 * 4;
                    v5[idx1] = iter;
                    *v24 = v23;
                    v24[1] = 1;
                    iter += 1;
                } while (iter < v9);
            }
            else if (a3 == 7)
            {
                do
                {
                    idx = 0xcf1bbcdcbfa56300 * *(long long *)((char *)v2 + iter) >> (v8 & 63);
                    v17 = v5[idx];
                    v18 = v6 + ((unsigned int)iter & v7) * 2 * 4;
                    v5[idx] = iter;
                    *v18 = v17;
                    v18[1] = 1;
                    iter += 1;
                } while (iter < v9);
            }
            else
            {
                do
                {
LABEL_95a5c:
                    v19 = 2654435761 * *(int *)((char *)v2 + iter) >> ((char)(32 - a0->field_108) & 31);
                    v20 = v5[v19];
                    v5[v19] = iter;
                    v21 = v6 + ((unsigned int)iter & v7) * 2 * 4;
                    *v21 = v20;
                    v21[1] = 1;
                    iter += 1;
                } while (iter < v9);
            }
        }
    }
    a0->field_2c = v3;
    return a0;
}
