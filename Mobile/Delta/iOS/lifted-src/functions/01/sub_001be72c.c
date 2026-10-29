/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be72c..0x1be7cc (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1be72c_0 {
    char padding_0[40];
    unsigned int field_28;
    unsigned int field_2c;
    unsigned int field_30;
} st_1be72c_0;


st_1be72c_0 * sub_1be72c(st_1be72c_0 *a0, unsigned long long *a1)
{
    unsigned int v0;  // w8
    unsigned long v1;  // x9
    unsigned long long v10;  // x15
    unsigned long long j;  // x9
    char *node;  // x10
    unsigned long long v14;  // x9
    unsigned long v2;  // x14
    unsigned long long v3;  // x8
    unsigned long long v4;  // x10
    unsigned long long v5;  // x12
    unsigned long v6;  // x11
    unsigned long long v7;  // x13
    unsigned long long *iter;  // x14
    unsigned long long i;  // x15

    v0 = a0->field_2c;
    *(unsigned long long *)(a1[7] + a0->field_28 * 16 + 8) = a1[2];
    if (v0 == a0->field_30)
        return a0;
    v1 = a0->field_30 - 1;
    v2 = v0 - 1;
    v3 = a1[3];
    v4 = a1[4];
    v5 = v1 - v2;
    if (1 >= v5)
    {
        v6 = v2;
    }
    else
    {
        v7 = v5 & 0xfffffffffffffffe;
        v6 = v7 + v2;
        iter = v4 + (unsigned int)v2 * 24 + 24;
        i = v7;
        do
        {
            v10 = i;
            *(unsigned long long *)((char *)iter - 24) = v3;
            *(unsigned long long *)((char *)iter - 16) = v3;
            *iter = v3;
            iter[1] = v3;
            *((char *)iter - 8) = 0;
            *(char *)&iter[2] = 0;
            iter += 6;
            i = v10 - 2;
        } while (i);
        if (v5 == v7)
            return a0;
    }
    j = v1 - v6;
    node = v4 + 24 * v6 + 16;
    do
    {
        v14 = j;
        *(unsigned long long *)(node - 16) = v3;
        *(unsigned long long *)(node - 8) = v3;
        *node = 0;
        node += 24;
        j = v14 - 1;
    } while (j);
    return a0;
}
