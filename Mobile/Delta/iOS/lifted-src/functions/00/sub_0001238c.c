/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1238c..0x123f0 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


uint128_t * sub_1238c(uint128_t *a0, unsigned long long a1, unsigned long long *a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    uint128_t v2;  // q0
    uint128_t *iter;  // x10
    unsigned long long i;  // x11
    unsigned long long v5;  // x11
    unsigned long long *node;  // x10
    unsigned long long j;  // x9
    unsigned long long v9;  // x9

    if (!a1)
        return a0;
    v0 = *a2;
    if (3 >= a1)
    {
        v1 = 0;
    }
    else
    {
        v1 = a1 & 0xfffffffffffffffc;
        v2 = __double_as_longlong(__longlong_as_double(v0));
        iter = a0 + 2;
        i = v1;
        do
        {
            v5 = i;
            *(uint128_t *)((char *)iter - 32) = v2;
            *(uint128_t *)((char *)iter - 16) = v2;
            *iter = v2;
            iter[1] = v2;
            iter += 4;
            i = v5 - 4;
        } while (i);
        if (v1 == a1)
            return a0;
    }
    node = (char *)&a0[v1] + 8;
    j = a1 - v1;
    do
    {
        v9 = j;
        *(unsigned long long *)((char *)node - 8) = v0;
        *node = 0;
        node += 2;
        j = v9 - 1;
    } while (j);
    return a0;
}
