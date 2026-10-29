/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991b0c..0x991b48 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991b0c_0 {
    char padding_0[8];
    struct st_991b0c_0 *field_8;
    struct st_991b0c_0 *field_10;
    unsigned long long field_18;
} st_991b0c_0;


st_991b0c_0 * sub_991b0c(st_991b0c_0 *iter, st_991b0c_0 *a1)
{
    unsigned long v0;  // cc_op
    unsigned long v1;  // cc_dep1
    unsigned long long v10;  // 4112
    unsigned long v11;  // 4110
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long long v14;  // 4105
    unsigned long long v15;  // 4112
    unsigned long v2;  // cc_dep2
    unsigned long v3;  // cc_ndep
    unsigned long v4;  // x9
    unsigned long v5;  // 4110
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long long v8;  // 4105
    st_991b0c_0 *v9;  // x8

    if (!iter->field_10)
        return iter->field_10;
    while (1)
    {
        iter = iter->field_8;
        if (!iter)
            return 0;
        v4 = iter->field_18;
        if (iter->field_10 <= a1)
        {
            v5 = arm64g_calculate_condition(v0 | 144, v1, v2, v3);
            v6 = (v5 & 1 ? v4 : 0);
            v7 = (v5 & 1 ? a1 : 0);
            v8 = arm64g_calculate_condition(52, v6, v7, 0);
            v9 = !(v8 & 1);
            v10 = arm64g_calculate_condition(36, v6, v7, 0);
            if (v10 & 1)
                return !(v8 & 1);
        }
        else
        {
            v11 = arm64g_calculate_condition(v0 | 144, v1, v2, v3);
            v12 = (v11 & 1 ? v4 : 0);
            v13 = (v11 & 1 ? a1 : 0);
            v14 = arm64g_calculate_condition(48, v12, v13, 0);
            v9 = !(v14 & 1);
            v15 = arm64g_calculate_condition(32, v12, v13, 0);
            if (v15 & 1)
                return !(v14 & 1);
        }
        v0 = 4;
        v3 = 0;
        v1 = v4;
        v2 = a1;
        if (v2 > v1)
            return v9;
    }
}
