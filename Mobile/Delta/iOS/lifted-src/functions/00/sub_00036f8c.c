/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x36f8c..0x36ff4 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_36f8c(unsigned long long *a0, unsigned long long a1, unsigned long long *a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long *iter;  // x10
    unsigned long long i;  // x11
    unsigned long long v4;  // x11
    unsigned int *node;  // x10
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
        iter = a0 + 2;
        i = v1;
        do
        {
            v4 = i;
            *(unsigned long long *)((char *)iter - 16) = v0;
            *iter = v0;
            *(unsigned int *)((char *)iter - 8) = 0;
            *(unsigned int *)&iter[1] = 0;
            iter += 4;
            i = v4 - 2;
        } while (i);
        if (v1 == a1)
            return a0;
    }
    node = &a0[2 * v1 + 1];
    j = a1 - v1;
    do
    {
        v8 = j;
        *(unsigned long long *)((char *)node - 8) = v0;
        *node = 0;
        node += 4;
        j = v8 - 1;
    } while (j);
    return a0;
}
