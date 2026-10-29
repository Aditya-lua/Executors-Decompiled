/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2ae9c..0xa2aec0 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2ae9c_0 {
    char padding_0[8];
    struct st_a2ae9c_1 *field_8;
} st_a2ae9c_0;

typedef struct st_a2ae9c_1 {
    unsigned int field_0;
} st_a2ae9c_1;


long long sub_a2ae9c(st_a2ae9c_0 *a0)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_op
    unsigned long v4;  // cc_ndep
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4110
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long long v2;  // 4112
    unsigned long long v3;  // 4110

    v0 = *(int *)a0->field_8;
    if (v0 != 1087)
    {
        v2 = arm64g_calculate_condition(v1 | 16, v7, v8, v4);
        v3 = arm64g_calculate_condition(3, (v2 & 1 ? v0 : 0x40000000), (v2 & 1 ? 1034 : 0), 0);
        if (!(v3 & 1))
            return 224;
    }
    else
    {
        v5 = arm64g_calculate_condition(v1 | 16, v7, v8, v4);
        v6 = arm64g_calculate_condition(0, (v5 & 1 ? v0 : 0x40000000), (v5 & 1 ? 1034 : 0), 0);
        if (!(v6 & 1))
            return 224;
    }
    return 128;
}
