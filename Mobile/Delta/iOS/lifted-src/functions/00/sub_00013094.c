/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13094..0x13160 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13094_1 {
    char padding_0[216];
    long long field_d8;
} st_13094_1;

typedef struct st_13094_0 {
    char field_0;
} st_13094_0;


unsigned long long sub_13094(st_13094_1 *a0, void* a1, unsigned long long a2)
{
    void* v4;  // x0
    unsigned long long v5;  // x8
    void* v14;  // x10
    unsigned long long j;  // x8
    unsigned long long v16;  // x8
    uint128_t *iter;  // x9
    uint128_t *node;  // x10
    unsigned long long i;  // x11
    unsigned long long v9;  // x11
    uint128_t v10;  // q1
    unsigned long long v12;  // x10
    void* iter1;  // x9
    st_13094_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_13094_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
        return 0;
    v4 = sub_404c(a0->field_d8, a2 * 8);
    v5 = 0;
    if (a2 >= 4 && v4 - a1 > 31)
    {
        v5 = a2 & 0xfffffffffffffffc;
        iter = v4 + 16;
        node = a1 + 16;
        i = v5;
        do
        {
            v9 = i;
            v10 = *node;
            *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)node - 16);
            *iter = v10;
            iter += 2;
            node += 2;
            i = v9 - 4;
        } while (i);
        if (v5 == a2)
            return (unsigned int)v4;
    }
    v12 = v5 * 8;
    iter1 = v4 + v12;
    v14 = a1 + v12;
    j = a2 - v5;
    do
    {
        v16 = j;
        *(long long *)iter1 = *(long long *)v14;
        iter1 += 8;
        j = v16 - 1;
        v14 += 8;
    } while (j);
    return (unsigned int)v4;
}
