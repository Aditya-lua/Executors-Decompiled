/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a8ea4..0x1a8f18 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a8ea4_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
} st_1a8ea4_0;

typedef struct st_1a8ea4_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
    char padding_11[7];
    unsigned long long field_18;
    unsigned long long field_20;
    char field_28;
} st_1a8ea4_1;


st_1a8ea4_1 * sub_1a8ea4(st_1a8ea4_1 *a0, unsigned long long a1, st_1a8ea4_0 *a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    st_1a8ea4_1 *v10;  // x0
    unsigned long long v11;  // x11
    char v2;  // x10
    unsigned long long j;  // x11
    st_1a8ea4_1 *v4;  // x0
    unsigned long long v5;  // x12
    st_1a8ea4_1 *iter;  // x13
    unsigned long long i;  // x14
    unsigned long long v8;  // x14

    if (!a1)
        return a0;
    v0 = a2->field_0;
    v1 = a2->field_8;
    v2 = a2->field_10;
    if (a1 == 1)
    {
        j = 1;
        v4 = a0;
    }
    else
    {
        v5 = a1 & 0xfffffffffffffffe;
        j = a1 & 1;
        v4 = &(&a0->field_0)[3 * v5];
        iter = &a0->field_18;
        i = v5;
        do
        {
            v8 = i;
            *(unsigned long long *)((char *)iter - 24) = v0;
            *(unsigned long long *)((char *)iter - 16) = v1;
            iter->field_0 = v0;
            iter->field_8 = v1;
            *((char *)iter - 8) = v2;
            iter->field_10 = v2;
            iter = (char *)&iter[1].field_0 + 7;
            i = v8 - 2;
        } while (i);
        if (v5 == a1)
            return &(&a0->field_0)[3 * v5];
    }
    do
    {
        v10 = v4;
        v11 = j;
        v10->field_0 = v0;
        v10->field_8 = v1;
        v10->field_10 = v2;
        j = v11 - 1;
        v4 = &v10->field_18;
    } while (j);
    return &v10->field_18;
}
