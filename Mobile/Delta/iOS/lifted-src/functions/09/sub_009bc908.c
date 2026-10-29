/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bc908..0x9bc9a0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bc908_2 {
    uint128_t field_0;
    char padding_10[176];
    unsigned int field_c0;
} st_9bc908_2;

typedef struct st_9bc908_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char padding_30[176];
    unsigned int field_e0;
} st_9bc908_1;

typedef struct st_9bc908_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40;
    char padding_41[175];
    unsigned int field_f0;
} st_9bc908_0;


double sub_9bc908(unsigned long a0, void* a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, st_9bc908_0 *a7, double a8, double a9, double a10, double a11, double a12, double a13, double a14, unsigned long a15, unsigned long a16, double a17, double a18, double a19, double a20, unsigned long a21, unsigned long a22)
{
    long long i;  // x21
    long long v1;  // x21
    uint128_t *v10;  // x7
    unsigned int j;  // w6
    uint128_t v12;  // 4099
    uint128_t v13;  // 4101
    st_9bc908_2 *v14;  // x7
    unsigned int v15;  // w6
    uint128_t v16;  // 4115
    uint128_t v17;  // 4117
    uint128_t v18;  // 4099
    uint128_t v19;  // 4101
    char *v2;  // x20
    uint128_t v20;  // q0
    uint128_t v21;  // 4108
    char v3;  // x14
    char *v4;  // x13
    uint128_t v5;  // q26
    uint128_t v6;  // q0
    st_9bc908_1 *v7;  // x7
    unsigned int v8;  // w6
    uint128_t v9;  // q1

    do
    {
        v1 = i - 1;
        v3 = v2[v1];
        v4[v1] = *((char *)a1 + v1);
        *((char *)a1 + v1) = v3;
    } while (1 < i);
    v5 = a14 ^ *(int128_t *)a1;
    v6 = a7->field_0;
    v7 = &a7->field_10;
    v8 = a7->field_f0 - 2;
    v9 = v7->field_0;
    v10 = &v7->field_10;
    do
    {
        j = v8;
        v12 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v5 ^ v6) >> 64), (unsigned long long)v5 ^ (unsigned long long)v6);
        v13 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v12 >> 64), (unsigned long long)v12);
        v6 = *v10;
        v14 = v10 + 1;
        v15 = j - 2;
        v16 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v13 ^ v9) >> 64), (unsigned long long)v13 ^ (unsigned long long)v9);
        v17 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v16 >> 64), (unsigned long long)v16);
        v5 = v17;
        v9 = v14->field_0;
        v10 = v14->padding_10;
        v8 = v15;
    } while (2 < (int)j);
    v18 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v5 ^ v6) >> 64), (unsigned long long)v5 ^ (unsigned long long)v6);
    v19 = __dirty_arm64g_dirtyhelper_AESIMC(/* unsupported instruction */, (unsigned long long)(v18 >> 64), (unsigned long long)v18);
    v20 = *v10;
    v21 = __dirty_arm64g_dirtyhelper_AESD(/* unsupported instruction */, (unsigned long long)((v19 ^ v9) >> 64), (unsigned long long)v19 ^ (unsigned long long)v9);
    *(uint128_t *)a1 = a14 ^ v20 ^ v21;
    return *(unsigned long long *)&v20;
}
