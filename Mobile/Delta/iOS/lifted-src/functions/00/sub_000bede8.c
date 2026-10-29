/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbede8..0xbee64 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_bede8(void* a0, void* a1)
{
    unsigned long v0;  // x8
    void* v1;  // x9
    unsigned long v4;  // cc_dep2
    unsigned long v5;  // cc_ndep
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    uint128_t *node;  // x10
    uint128_t *iter;  // x11
    unsigned long long i;  // x12
    unsigned long long v13;  // x12
    __m128i v14;  // q1
    __m128i v15;  // q3
    unsigned long long j;  // x10
    unsigned long long v2;  // 4110
    unsigned long long v3;  // 4102

    v0 = a0 + 0x1000;
    v1 = a1 + 0x1000;
    if (a0 < v1)
    {
        v2 = arm64g_calculate_condition(v8 | 128, v9, v4, v5);
        v3 = arm64g_calculate_condition(132, (v2 & 1 ? v0 : 0), (v2 & 1 ? a1 : 0), 0);
        if (v3 & 1)
            goto LABEL_bee30;
LABEL_bedfc:
        node = a1 + 16;
        iter = a0 + 16;
        i = 0x400;
        do
        {
            v13 = i;
            v14 = *node;
            v15 = *iter;
            *(uint128_t *)((char *)iter - 16) = _mm_add_epi32(*(int128_t *)((char *)iter - 16), *(int128_t *)((char *)node - 16));
            *iter = _mm_add_epi32(v15, v14);
            node += 2;
            iter += 2;
            i = v13 - 8;
        } while (i);
    }
    else
    {
        v6 = arm64g_calculate_condition(v8 | 128, v9, v4, v5);
        v7 = arm64g_calculate_condition(128, (v6 & 1 ? v0 : 0), (v6 & 1 ? a1 : 0), 0);
        if (!(v7 & 1))
            goto LABEL_bedfc;
LABEL_bee30:
        j = 0;
        do
        {
            *(int *)((char *)a0 + j) = *(int *)((char *)a0 + j) + *(int *)((char *)a1 + j);
            j += 4;
        } while (j != 0x1000);
    }
    *(long long *)v0 = *(long long *)v0 + *(long long *)v1;
    return a0;
}
