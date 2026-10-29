/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a440..0x2a4ac (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a440_0 {
    char padding_0[16];
    void* field_10;
} st_2a440_0;


st_2a440_0 * sub_2a440(st_2a440_0 *a0, unsigned long a1, unsigned int *a2)
{
    void* v0;  // x13
    void* node;  // x8
    unsigned long long v10;  // x14
    void* v2;  // x9
    unsigned int v3;  // w10
    unsigned long long v4;  // x11
    unsigned long long v5;  // x11
    unsigned long long v6;  // x12
    uint128_t v7;  // q0
    uint128_t *iter;  // x13
    unsigned long long i;  // x14

    v0 = a0->field_10;
    node = v0;
    if (a1)
    {
        v2 = v0 + a1 * 4;
        v3 = *a2;
        v4 = a1 - 1 & 0x3fffffffffffffff;
        if (v4 >= 7)
        {
            v5 = v4 + 1;
            v6 = v5 & 0x7ffffffffffffff8;
            node = v0 + v6 * 4;
            v7 = CONCAT(v3 | v3 * 0x100000000, v3 | v3 * 0x100000000);
            iter = v0 + 16;
            i = v6;
            do
            {
                v10 = i;
                *(uint128_t *)((char *)iter - 16) = v7;
                *iter = v7;
                iter += 2;
                i = v10 - 8;
            } while (i);
            if (v5 == v6)
                goto LABEL_2a4a0;
        }
        do
        {
            *(unsigned int *)node = v3;
            node += 4;
        } while (node != v2);
LABEL_2a4a0:
        node = v2;
    }
    a0->field_10 = node;
    return a0;
}
