/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x153928..0x153a14 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_153928_1 {
    char padding_0[8];
    struct st_153928_2 *field_8;
    struct st_153928_0 *field_10;
    char padding_18[16];
    unsigned long long field_28;
    unsigned int field_30;
} st_153928_1;

typedef struct st_153928_2 {
    unsigned long long field_0;
} st_153928_2;

typedef struct st_153928_0 {
    char field_0;
} st_153928_0;


st_153928_1 * sub_153928(st_153928_1 *a0, unsigned long long a1, unsigned long long j)
{
    unsigned long long *v2;  // x8
    void* v3;  // x13
    char v12;  // x9
    unsigned long long node;  // x9
    unsigned long long v5;  // x11
    unsigned long long index;  // x10
    unsigned long long v7;  // x12
    uint128_t *iter;  // x13
    unsigned long long i;  // x14
    uint128_t v10;  // q0
    char *v11;  // x8
    st_153928_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_153928_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_8;
    v3 = &v2[a1];
    *(long long *)v3 = *(long long *)((char *)v3 - 8);
    node = a1 - 1;
    if (node != j)
    {
        v5 = ~j + a1;
        index = a1;
        if (v5 > 3)
        {
            v7 = v5 & 0xfffffffffffffffc;
            node -= v7;
            index = a1 - v7;
            iter = v3 - 16;
            i = v7;
            do
            {
                v10 = *(int128_t *)((char *)iter - 8);
                *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)iter - 24);
                *iter = v10;
                iter = (char *)iter - 32;
                i -= 4;
            } while (i);
            if (v5 == v7)
                goto LABEL_1539bc;
        }
        do
        {
            v2[node] = *(long long *)((char *)&v2[index] - 16);
            node -= 1;
            index = node;
        } while (j != node);
    }
LABEL_1539bc:
    if (a1 == j)
        return a0;
    v11 = a0->field_10;
    v12 = a0->field_30;
    do
    {
        v11[a1] = *(&v11[a1] - 1) + v12;
        v11 = a0->field_10;
        v12 = a0->field_30;
        if (a0->field_30 + *(char *)&a0->field_10[a1] >= 0x100)
            a0->field_28 = 0;
    } while ((a1 -= 1, j != a1));
    return a0;
}
