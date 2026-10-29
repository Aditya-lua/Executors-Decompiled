/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5a17c..0xc5a240 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5a17c_0 {
    uint128_t field_0;
    unsigned long long field_10;
    char padding_18[16];
    unsigned long long field_28;
    char padding_30[16];
    unsigned long long field_40;
} st_c5a17c_0;


double sub_c5a17c(st_c5a17c_0 *a0, unsigned long long a1)
{
    unsigned long long *v0;  // x11
    unsigned long long iter;  // x10
    unsigned long long *iter1;  // x9
    unsigned long long *node;  // x10
    uint128_t v12;  // q0
    unsigned long long v13;  // x11
    unsigned long v14;  // d0
    unsigned long v15;  // d0
    unsigned long long v2;  // x12
    unsigned long long v3;  // x12
    unsigned long long v4;  // x12
    unsigned long long v5;  // x13
    unsigned long long *v6;  // x11
    unsigned long long v7;  // x13
    unsigned long long *v8;  // x11
    unsigned long long i;  // x8

    v0 = &a0->field_40;
    iter = 2;
    v2 = a0->field_28;
    v3 = v2;
    v4 = v2;
    if (a0->field_10 > v3)
    {
        do
        {
            v5 = *v0;
            v6 = v0 + 3;
            if (v3 <= *v0)
                goto LABEL_c5a1d8;
        } while ((iter += 1, v0 = v6, v3 = v5, a1 != iter));
    }
    else
    {
        while (1)
        {
            v7 = *v0;
            v8 = v0 + 3;
            if (*v0 < v4)
                break;
            iter += 1;
            v0 = v8;
            v4 = v7;
            if (a1 == iter)
                goto LABEL_c5a1e0;
        }
LABEL_c5a1d8:
    }
LABEL_c5a1e0:
    if (a0->field_10 <= v2)
        return v15;
    i = a1 >> 1;
    iter1 = &a0->field_10;
    node = (char *)a0 + 24 * a1 - 8;
    do
    {
        v12 = *(int128_t *)((char *)iter1 - 16);
        *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)node - 16);
        *(uint128_t *)((char *)node - 16) = v12;
        v13 = *iter1;
        *iter1 = *node;
        iter1 += 3;
        *node = v13;
        node = (char *)node - 24;
        i -= 1;
    } while (i);
    return v14;
}
