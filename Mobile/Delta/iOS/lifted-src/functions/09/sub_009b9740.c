/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b9740..0x9b97a0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b9740_2 {
    uint128_t field_0;
    char padding_10[176];
    unsigned int field_c0;
} st_9b9740_2;

typedef struct st_9b9740_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char padding_30[176];
    unsigned int field_e0;
} st_9b9740_1;

typedef struct st_9b9740_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40;
    char padding_41[175];
    unsigned int field_f0;
} st_9b9740_0;


double sub_9b9740(uint128_t *a0, uint128_t *a1, st_9b9740_0 *a2)
{
    uint128_t v0;  // q0
    st_9b9740_1 *v1;  // x2
    unsigned int v10;  // w3
    uint128_t v11;  // 4115
    uint128_t v12;  // 4117
    uint128_t v13;  // 4099
    uint128_t v14;  // 4101
    uint128_t v15;  // q0
    uint128_t v16;  // 4108
    uint128_t v2;  // q2
    unsigned int v3;  // w3
    uint128_t v4;  // q1
    uint128_t *v5;  // x2
    unsigned int i;  // w3
    uint128_t v7;  // 4099
    uint128_t v8;  // 4101
    st_9b9740_2 *v9;  // x2

    v0 = a2->field_0;
    v1 = &a2->field_10;
    v2 = *a0;
    v3 = a2->field_f0 - 2;
    v4 = v1->field_0;
    v5 = &v1->field_10;
    do
    {
        i = v3;
        v7 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v2 ^ v0) >> 64), (unsigned long long)v2 ^ (unsigned long long)v0);
        v8 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v7 >> 64), (unsigned long long)v7);
        v0 = *v5;
        v9 = v5 + 1;
        v10 = i - 2;
        v11 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v8 ^ v4) >> 64), (unsigned long long)v8 ^ (unsigned long long)v4);
        v12 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v11 >> 64), (unsigned long long)v11);
        v2 = v12;
        v4 = v9->field_0;
        v5 = v9->padding_10;
        v3 = v10;
    } while (2 < (int)i);
    v13 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v2 ^ v0) >> 64), (unsigned long long)v2 ^ (unsigned long long)v0);
    v14 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v13 >> 64), (unsigned long long)v13);
    v15 = *v5;
    v16 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v14 ^ v4) >> 64), (unsigned long long)v14 ^ (unsigned long long)v4);
    *a1 = v15 ^ v16;
    return *(unsigned long long *)&v15;
}
