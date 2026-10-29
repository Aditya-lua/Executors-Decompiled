/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8620..0xa8860 (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a8620_0 {
    char padding_0[8];
    void* field_8;
    char padding_10[28];
    unsigned int field_2c;
    char padding_30[64];
    struct st_a8620_1 *field_70;
    char padding_78[8];
    struct st_a8620_1 *field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
    char padding_10c[4];
    int field_110;
} st_a8620_0;

typedef struct st_a8620_1 {
    unsigned int field_0;
} st_a8620_1;

typedef struct st_a8620_2 {
    char field_0;
} st_a8620_2;


int sub_a8620(st_a8620_0 *a0, void* a1)
{
    int v2;  // w10
    unsigned int *v3;  // x8
    unsigned long idx;  // x3
    unsigned long index;  // x3
    unsigned long idx1;  // x3
    unsigned int v15;  // w3
    unsigned long idx2;  // x3
    unsigned long v17;  // x10
    unsigned long long v18;  // x11
    unsigned int v4;  // w9
    void* v5;  // x12
    unsigned int v6;  // w11
    unsigned long iter;  // x13
    unsigned int *v8;  // x14
    unsigned int v9;  // w15
    char v10;  // x17
    unsigned long v11;  // x16
    st_a8620_2 **v0;  // [bp-0x10], Other Possible Types: char
    st_a8620_2 *v1;  // [bp-0x8]

    v2 = a0->field_110;
    v1 = &v0;
    v0 = &v1;
    v3 = a0->field_70;
    v4 = a0->field_108;
    v5 = a0->field_8;
    v6 = a1 - v5;
    iter = a0->field_2c;
    if (v6 > (unsigned int)iter)
    {
        v8 = a0->field_80;
        v9 = ~(0xffffffff << ((char)a0->field_104 & 31));
        v10 = 64 - v4;
        v11 = v6;
        if (6 >= v2)
        {
            if (v2 != 5)
            {
                if (v2 != 6)
                    goto LABEL_a8710;
                do
                {
                    idx = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v5 + iter) >> (v10 & 63);
                    v8[(unsigned int)iter & v9] = v3[idx];
                    v3[idx] = iter;
                    iter += 1;
                } while (iter < v11);
            }
            else
            {
                do
                {
                    index = 0xcf1bbcdcbb000000 * *(long long *)((char *)v5 + iter) >> (v10 & 63);
                    v8[(unsigned int)iter & v9] = v3[index];
                    v3[index] = iter;
                    iter += 1;
                } while (iter < v11);
            }
        }
        else
        {
            if (v2 == 8)
            {
                do
                {
                    idx2 = 14923729446382167139 * *(long long *)((char *)v5 + iter) >> (v10 & 63);
                    v8[(unsigned int)iter & v9] = v3[idx2];
                    v3[idx2] = iter;
                    iter += 1;
                } while (iter < v11);
            }
            else if (v2 == 7)
            {
                do
                {
                    idx1 = 0xcf1bbcdcbfa56300 * *(long long *)((char *)v5 + iter) >> (v10 & 63);
                    v8[(unsigned int)iter & v9] = v3[idx1];
                    v3[idx1] = iter;
                    iter += 1;
                } while (iter < v11);
            }
            else
            {
LABEL_a8710:
                do
                {
                    v15 = 2654435761 * *(int *)((char *)v5 + iter) >> ((char)(32 - v4) & 31);
                    v8[(unsigned int)iter & v9] = v3[v15];
                    v3[v15] = iter;
                    iter += 1;
                } while (iter < v11);
            }
        }
    }
    a0->field_2c = v6;
    if (6 >= v2)
    {
        if (v2 == 5)
        {
            v17 = *(long long *)a1;
            v18 = 0xbb000000;
        }
        else if (v2 == 6)
        {
            v17 = *(long long *)a1;
            v18 = 0xbf9b0000;
        }
        else
        {
            return v3[2654435761 * *(int *)a1 >> ((char)-v4 & 31)];
        }
    }
    else
    {
        if (v2 == 7)
        {
            v17 = *(long long *)a1;
            v18 = 0xbfa56300;
        }
        else if (v2 == 8)
        {
            v17 = *(long long *)a1;
            v18 = 3081069667;
        }
        else
        {
            return v3[2654435761 * *(int *)a1 >> ((char)-v4 & 31)];
        }
    }
    return v3[((v18 & 0xffff0000ffffffff | 0xbcdc00000000) & 0xffffffffffff | 14923521790222270464) * v17 >> ((char)-v4 & 63)];
}
