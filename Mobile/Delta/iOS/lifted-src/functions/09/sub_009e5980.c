/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5980..0x9e5ab0 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5980_1 {
    uint128_t field_0;
} st_9e5980_1;

typedef struct st_9e5980_0 {
    struct st_9e5980_1 *field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
    unsigned int field_14;
} st_9e5980_0;


long long sub_9e5980(unsigned long a0, st_9e5980_0 *a1, st_9e5980_0 *a2, unsigned long long a3)
{
    unsigned long long v0;  // x8
    unsigned int v1;  // w10
    unsigned long v10;  // x12
    unsigned long long j;  // x13
    uint128_t *iter;  // x14
    uint128_t *node;  // x15
    unsigned long long v14;  // x13
    uint128_t v15;  // q2
    uint128_t v16;  // q3
    unsigned long long v18;  // x13
    unsigned long long *iter1;  // x11
    unsigned int v2;  // w10
    unsigned long long *iter2;  // x9
    unsigned long long i;  // x10
    unsigned long long v22;  // x10
    unsigned long long v23;  // x13
    unsigned int v3;  // w11
    unsigned int v4;  // w12
    unsigned int v5;  // w10
    uint128_t *v6;  // x9
    uint128_t *v7;  // x11
    unsigned long v8;  // x10
    unsigned long long v9;  // x12

    v0 = ((a0 - 1 & ~a0) >> 63) - 1;
    v1 = (a2->field_8 ^ a1->field_8) & (unsigned int)v0;
    a1->field_8 = v1 ^ a1->field_8;
    a2->field_8 = a2->field_8 ^ v1;
    v2 = a1->field_14;
    v3 = (a2->field_10 ^ a1->field_10) & (unsigned int)v0;
    v4 = (unsigned int)v0 & (a2->field_14 ^ v2) & 4;
    a1->field_10 = v3 ^ a1->field_10;
    a1->field_14 = v4 ^ v2;
    v5 = v4 ^ a2->field_14;
    a2->field_10 = a2->field_10 ^ v3;
    a2->field_14 = v5;
    if (a3 < 1)
        return a0;
    v6 = a1->field_0;
    v7 = a2->field_0;
    v8 = a3;
    if (a3 < 4 || (v9 = v8 * 8, (char *)v7 + 8 * v8 > v6 && (char *)v6 + 8 * v8 > v7))
    {
        v10 = 0;
    }
    else
    {
        v10 = v8 & 0x7ffffffe;
        j = v10;
        iter = v7;
        node = v6;
        do
        {
            v14 = j;
            v15 = *iter;
            v16 = (*node ^ v15) & CONCAT(v0, v0);
            *node = *node ^ v16;
            node += 1;
            *iter = v16 ^ v15;
            iter += 1;
            j = v14 - 2;
        } while (j);
        if (v10 == v8)
            return a0;
    }
    v18 = v10 * 8;
    iter1 = (char *)v7 + v18;
    iter2 = (char *)v6 + v18;
    i = v8 - v10;
    do
    {
        v22 = i;
        v23 = (*iter1 ^ *iter2) & v0;
        *iter2 = v23 ^ *iter2;
        iter2 += 1;
        *iter1 = *iter1 ^ v23;
        iter1 += 1;
        i = v22 - 1;
    } while (i);
    return a0;
}
