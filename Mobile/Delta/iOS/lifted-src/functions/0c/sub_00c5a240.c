/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5a240..0xc5a3b4 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5a240_0 {
    unsigned long long field_0[2];
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    char field_28;
    char padding_29[15];
    unsigned long long field_38;
} st_c5a240_0;


double sub_c5a240(st_c5a240_0 *a0, unsigned long long a1)
{
    unsigned long v2;  // x24
    unsigned long long v3;  // x22
    unsigned long long v12;  // x27
    unsigned long long v13;  // w0
    unsigned long v14;  // x8
    unsigned long long i;  // x8
    unsigned long long *iter;  // x9
    unsigned long long *iter1;  // x10
    uint128_t v18;  // q0
    unsigned long v19;  // x11
    unsigned long v20;  // d0
    unsigned long v21;  // d0
    unsigned long long v4;  // w0
    unsigned long long *node;  // x25
    unsigned long long iter2;  // x23
    unsigned long v7;  // x26
    unsigned long long v8;  // x27
    unsigned long long v9;  // w0
    unsigned long v10;  // x8
    unsigned long v11;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned long)a0->padding_18;
    v3 = v2 - a0->field_0[1];
    v4 = (unsigned int)_memcmp();
    node = &a0->padding_29[7];
    iter2 = 2;
    if (v4)
        v3 = v4;
    if ((long long)v3 >= 0)
    {
        do
        {
            v7 = *node;
            v8 = v7 - v2;
            v9 = (unsigned int)_memcmp();
            v10 = v9;
            if (v9)
                v8 = v10;
            if ((long long)v8 < 0)
                goto LABEL_c5a318;
        } while ((node += 3, iter2 += 1, v2 = v7, a1 != iter2));
    }
    else
    {
        while (1)
        {
            v11 = *node;
            v12 = v11 - v2;
            v13 = (unsigned int)_memcmp();
            v14 = v13;
            if (v13)
                v12 = v14;
            if ((long long)v12 >= 0)
                break;
            node += 3;
            iter2 += 1;
            v2 = v11;
            if (a1 == iter2)
                goto LABEL_c5a320;
        }
LABEL_c5a318:
    }
LABEL_c5a320:
    if ((long long)v3 >= 0)
        return v21;
    i = a1 >> 1;
    iter = &a0->field_8;
    iter1 = (char *)a0 + 24 * a1 - 8;
    do
    {
        v18 = *(int128_t *)((char *)iter - 16);
        *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)iter1 - 16);
        *(uint128_t *)((char *)iter1 - 16) = v18;
        v19 = *iter;
        *iter = *iter1;
        iter += 3;
        *iter1 = v19;
        iter1 = (char *)iter1 - 24;
        i -= 1;
    } while (i);
    return v20;
}
