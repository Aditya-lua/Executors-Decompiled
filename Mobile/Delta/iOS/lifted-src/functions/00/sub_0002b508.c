/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b508..0x2b570 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2b508_0 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned int field_8;
    unsigned long long field_c;
} st_2b508_0;


st_2b508_0 * sub_2b508(st_2b508_0 *a0, unsigned long long a1, unsigned int *a2)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x9
    unsigned int *iter;  // x10
    unsigned long long i;  // x11
    unsigned long long v4;  // x11
    unsigned short *node;  // x10
    unsigned long long j;  // x9
    unsigned long long v8;  // x9

    if (!a1)
        return a0;
    v0 = *a2;
    if (a1 == 1)
    {
        v1 = 0;
    }
    else
    {
        v1 = a1 & 0xfffffffffffffffe;
        iter = &a0->field_4;
        i = v1;
        do
        {
            v4 = i;
            *(unsigned int *)((char *)iter - 8) = v0;
            *iter = v0;
            *(unsigned short *)((char *)iter - 4) = 0;
            *(unsigned short *)&iter[1] = 0;
            iter += 4;
            i = v4 - 2;
        } while (i);
        if (v1 == a1)
            return a0;
    }
    node = &(&a0->field_0)[2 * v1 + 1];
    j = a1 - v1;
    do
    {
        v8 = j;
        *(unsigned int *)((char *)node - 4) = v0;
        *node = 0;
        node += 4;
        j = v8 - 1;
    } while (j);
    return a0;
}
