/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8c18..0xab8c50 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8c18_0 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned int field_10;
} st_ab8c18_0;

extern unsigned long long g_f12f88;

long long sub_ab8c18(st_ab8c18_0 *a0)
{
    unsigned long v0;  // x13
    unsigned long v1;  // cc_op
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long v10;  // 4110
    unsigned long long v11;  // 4110
    unsigned long v12;  // 4110
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // 4110
    unsigned long long v17;  // 4105
    unsigned long v2;  // 4110
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long long v6;  // 4110

    if (!a0)
        return 1;
    v0 = a0->field_10;
    if (a0->field_0 == g_f12f88)
    {
        v2 = arm64g_calculate_condition(v1, v7, v8, v9);
        v3 = 4;
        v4 = (unsigned long)(v2 & 1 ? a0->padding_8 : 0);
        v5 = (v2 & 1 ? *(long long *)15806352 : 0);
        v6 = arm64g_calculate_condition(4, v4, v5, 0);
        if (!(v6 & 1))
            goto LABEL_ab8c3e;
LABEL_ab8c3d:
        v12 = arm64g_calculate_condition(v3, v4, v5, 0);
        v13 = 4;
        v14 = (v12 & 1 ? v0 : 0);
        v15 = (v12 & 1 ? *(int *)15806360 : 0);
    }
    else
    {
        v10 = arm64g_calculate_condition(v1, v7, v8, v9);
        v3 = 0;
        v4 = (unsigned long)(v10 & 1 ? a0->padding_8 : 0);
        v5 = (v10 & 1 ? *(long long *)15806352 : 0);
        v11 = arm64g_calculate_condition(0, v4, v5, 0);
        if (v11 & 1)
            goto LABEL_ab8c3d;
LABEL_ab8c3e:
        v16 = arm64g_calculate_condition(v3, v4, v5, 0);
        v13 = 0;
        v14 = (v16 & 1 ? v0 : 0);
        v15 = (v16 & 1 ? *(int *)15806360 : 0);
    }
    v17 = arm64g_calculate_condition(v13 | 16, v14, v15, 0);
    return !(v17 & 1);
}
