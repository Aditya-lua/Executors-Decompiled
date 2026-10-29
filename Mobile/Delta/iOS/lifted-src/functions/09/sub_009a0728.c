/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a0728..0x9a07a4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a0728_1 {
    struct st_9a0728_0 *field_0;
    unsigned long long field_8;
} st_9a0728_1;

typedef struct st_9a0728_0 {
    char padding_0[12];
    unsigned int field_c;
    char padding_10[52];
    unsigned int field_44;
} st_9a0728_0;


st_9a0728_1 * sub_9a0728(st_9a0728_1 *a0)
{
    unsigned long long v0;  // x8
    st_9a0728_0 *v1;  // x11
    unsigned long long j;  // x8
    unsigned long long v11;  // x8
    unsigned long long v2;  // x9
    st_9a0728_0 *v3;  // x10
    unsigned int *iter;  // x11
    unsigned long long i;  // x12
    unsigned long long v6;  // x12
    unsigned int v7;  // w14
    unsigned int *node;  // x10

    v0 = a0->field_8;
    if (!v0)
        return a0;
    v1 = a0->field_0;
    if (v0 == 1)
    {
        v2 = 0;
        v3 = v1;
    }
    else
    {
        v2 = v0 & 0xfffffffffffffffe;
        v3 = (char *)v1 + 56 * v2;
        iter = &v1->field_44;
        i = v2;
        do
        {
            v6 = i;
            v7 = *iter & 0xfffffffc;
            *(unsigned int *)((char *)iter - 56) = *(int *)((char *)iter - 56) & 0xfffffffc;
            *iter = v7;
            iter += 28;
            i = v6 - 2;
        } while (i);
        if (v0 == v2)
            return a0;
    }
    node = &v3->field_c;
    j = v0 - v2;
    do
    {
        v11 = j;
        *node = *node & 0xfffffffc;
        node += 14;
        j = v11 - 1;
    } while (j);
    return a0;
}
