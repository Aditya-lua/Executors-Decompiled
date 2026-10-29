/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa4460..0xaa4520 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa4460_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
} st_aa4460_0;


st_aa4460_0 * sub_aa4460(st_aa4460_0 *a0, unsigned long long *a1, unsigned long a2, unsigned long a3)
{
    unsigned long long i;  // x2
    unsigned long long v1;  // x4
    uint128_t v10;  // x5
    unsigned long long v11;  // x12
    unsigned long v12;  // 4190
    unsigned long long v13;  // x6
    unsigned long long v14;  // x10
    unsigned long long v15;  // x12
    unsigned long long v16;  // x10
    unsigned long v17;  // 4213
    unsigned long long v18;  // x13
    unsigned long long v19;  // x13
    unsigned long long v2;  // x5
    unsigned long long v20;  // x10
    unsigned long v21;  // 4228
    unsigned long long v22;  // x13
    unsigned long long v23;  // x10
    unsigned long v24;  // 4243
    unsigned long long v25;  // x13
    unsigned long v26;  // 4254
    unsigned long long v27;  // x14
    unsigned long long v28;  // x10
    unsigned long v29;  // 4265
    unsigned long long v3;  // x7
    unsigned long v30;  // 4272
    unsigned long long v4;  // x8
    unsigned long long v5;  // x6
    unsigned long long v6;  // x9
    unsigned long long *v7;  // x1
    uint128_t v8;  // x4
    unsigned long v9;  // 4179

    i = a2 & 0xfffffffffffffff0;
    if (!(a2 & 0xfffffffffffffff0))
        return a0;
    v1 = a0->field_0;
    v2 = a0->field_8;
    v3 = a0->field_20;
    v4 = a0->field_28;
    v5 = a0->field_10;
    v6 = v4 + (v4 >> 2);
    do
    {
        v7 = a1 + 2;
        i -= 16;
        v8 = v1 + *a1;
        v9 = arm64g_calculate_flag_c(2, v1, *a1, 0);
        v10 = v2 + a1[1] + v9;
        v11 = v3 * v8;
        v12 = arm64g_calculate_flag_c(6, v2, a1[1], v9);
        v13 = v5 + a3 + v12;
        v14 = v6 * v10;
        v15 = v11 + v14;
        v16 = v4 * v8;
        v17 = arm64g_calculate_flag_c(2, v11, v14, 0);
        v18 = (unsigned long long)(v8 * v3 >> 64) + (unsigned long long)(v10 * v6 >> 64) + v17;
        v19 = v18 + v16;
        v20 = v3 * v10;
        v21 = arm64g_calculate_flag_c(2, v18, v16, 0);
        v22 = v19 + v20;
        v23 = v6 * v13;
        v24 = arm64g_calculate_flag_c(2, v19, v20, 0);
        v25 = v22 + v23;
        v26 = arm64g_calculate_flag_c(2, v22, v23, 0);
        v27 = (unsigned long long)(v8 * v4 >> 64) + v21 + (unsigned long long)(v10 * v3 >> 64) + v24 + v3 * v13 + v26;
        v28 = (v27 & 0xfffffffffffffffc) + (v27 >> 2);
        v1 = v15 + v28;
        v29 = arm64g_calculate_flag_c(2, v15, v28, 0);
        v2 = v25 + v29;
        v30 = arm64g_calculate_flag_c(6, v25, 0, v29);
        v5 = (v27 & 3) + v30;
        a1 = v7;
    } while (i);
    a0->field_0 = v1;
    a0->field_8 = v2;
    a0->field_10 = v5;
    return a0;
}
