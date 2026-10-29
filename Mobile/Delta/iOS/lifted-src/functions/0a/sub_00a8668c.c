/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8668c..0xa8673c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a8668c_0 {
    char padding_0[24];
    long long field_18;
} st_a8668c_0;


unsigned long long sub_a8668c(long long a0, long long a1, long long a2, long long a3, st_a8668c_0 *a4)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v12;  // 4105
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4105
    unsigned long long v6;  // x8
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3fe04(a3, a4->field_18, 0);
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_a3fe10(a3, a2, 33);
    if (!(unsigned int)v3)
    {
        return v3;
    }
    else if (sub_a50b14(sub_a2d030(a3)))
    {
        return sub_a400f8(a3, a0, a1) != 0;
    }
    else
    {
        v6 = a1 & 0xffffffff;
        if (!sub_a3ff7c(a3, a0, &(int)a1))
        {
            v17 = arm64g_calculate_condition(v13 | 16, v14, v15, v16);
            v18 = arm64g_calculate_condition(16, (v17 & 1 ? v6 : 0), (v17 & 1 ? a1 : 0), 0);
            return !(v18 & 1);
        }
        v11 = arm64g_calculate_condition(v7 | 16, v8, v9, v10);
        v12 = arm64g_calculate_condition(20, (v11 & 1 ? v6 : 0), (v11 & 1 ? a1 : 0), 0);
        return !(v12 & 1);
    }
}
