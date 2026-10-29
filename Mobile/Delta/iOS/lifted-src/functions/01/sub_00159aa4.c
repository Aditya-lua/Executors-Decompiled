/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x159aa4..0x159b30 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_159aa4_0 {
    char padding_0[16];
    void* field_10;
} st_159aa4_0;


st_159aa4_0 * sub_159aa4(st_159aa4_0 *a0, void* a1, unsigned long a2)
{
    void* v0;  // x13
    void* node;  // x8
    unsigned long long i;  // x15
    unsigned long long v11;  // x15
    uint128_t v12;  // q1
    void* v14;  // x1
    void* v2;  // x9
    unsigned long long v3;  // x10
    unsigned long long v4;  // x10
    unsigned long long v5;  // x11
    unsigned long long v6;  // x12
    void* v7;  // x12
    uint128_t *iter;  // x14
    uint128_t *iter1;  // x13

    v0 = a0->field_10;
    node = v0;
    if (a2)
    {
        v2 = v0 + a2 * 8;
        v3 = a2 - 1 & 0x1fffffffffffffff;
        if (v3 >= 3 && v0 - a1 >= 32)
        {
            v4 = v3 + 1;
            v5 = v4 & 0x3ffffffffffffffc;
            v6 = v5 * 8;
            node = v0 + v6;
            v7 = a1 + v6;
            iter = a1 + 16;
            iter1 = v0 + 16;
            i = v5;
            do
            {
                v11 = i;
                v12 = *iter;
                *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)iter - 16);
                *iter1 = v12;
                iter += 2;
                iter1 += 2;
                i = v11 - 4;
            } while (i);
            a1 = v7;
            if (v4 == v5)
                goto LABEL_159b24;
        }
        do
        {
            v14 = a1 + 8;
            *(long long *)node = *(long long *)a1;
            node += 8;
            a1 = v14;
        } while (node != v2);
LABEL_159b24:
        node = v2;
    }
    a0->field_10 = node;
    return a0;
}
