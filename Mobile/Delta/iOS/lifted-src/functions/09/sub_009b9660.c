/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b9660..0x9b96e0 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_9b9660(unsigned long a0, unsigned long a1, uint128_t *a2)
{
    uint128_t *v2;  // x2
    unsigned long v3;  // x12
    unsigned long v12;  // d0
    uint128_t *v4;  // x0
    uint128_t v5;  // q1
    unsigned long iter;  // x0
    unsigned long node;  // x2
    uint128_t v8;  // 4103
    uint128_t v9;  // 4105
    uint128_t v10;  // 4100
    unsigned long v11;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_9b9440())
        return v12;
    v2 = (char *)a2 - 240;
    v4 = &v2[v3];
    v5 = *v4;
    *v4 = *v2;
    iter = v4 + 0xfffffffffffffff;
    *v2 = v5;
    node = v2 + 1;
    do
    {
        v8 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (long long)((uint128_t)(*(int128_t *)node) >> 64), (long long)*(int128_t *)node);
        v9 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (long long)((uint128_t)(*(int128_t *)iter) >> 64), (long long)*(int128_t *)iter);
        *(uint128_t *)iter = v8;
        iter += 0xfffffffffffffff0;
        *(uint128_t *)node = v9;
        node += 16;
    } while (node < iter);
    v10 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (long long)((uint128_t)(*(int128_t *)node) >> 64), (long long)*(int128_t *)node);
    *(uint128_t *)iter = v10;
    return v11;
}
