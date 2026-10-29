/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99a6d4..0x99a780 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99a6d4_1 {
    unsigned int field_0;
    char padding_4[212];
    struct st_99a6d4_0 *field_d8;
} st_99a6d4_1;

typedef struct st_99a6d4_2 {
    char padding_0[24];
    struct st_99a6d4_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
} st_99a6d4_2;

typedef struct st_99a6d4_0 {
    char padding_0[80];
    unsigned int field_50;
} st_99a6d4_0;


unsigned long long sub_99a6d4(st_99a6d4_2 *a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v0;  // w8
    unsigned int v1;  // w8
    unsigned long v4;  // cc_dep2
    unsigned long v5;  // cc_ndep
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4105
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long long v10;  // w9
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // 4112
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // 4112
    unsigned long long v16;  // 4105
    unsigned long long v2;  // 4112
    unsigned long long v3;  // 4105

    if (a2 & 0x800 || a0->field_18->field_d8->field_50 & 8)
    {
        v0 = (a2 * 0x200000 | a2 >> 11) & 0xffe00001 & 1;
        if (a1 >> 2 & 1 && !(!(a0->field_18->field_d8->field_50 & 8) & a2 >> 11))
            return 0;
    }
    else
    {
        v1 = a0->field_18->field_0;
        if (0x303 < (int)v1)
        {
            v2 = arm64g_calculate_condition(v8 | 192, v9, v4, v5);
            v3 = arm64g_calculate_condition(3, (v2 & 1 ? v1 : 0x40000000), (v2 & 1 ? 0x10000 : 0), 0);
            v0 = (unsigned int)!(v3 & 1);
        }
        else
        {
            v6 = arm64g_calculate_condition(v8 | 192, v9, v4, v5);
            v7 = arm64g_calculate_condition(0, (v6 & 1 ? v1 : 0x40000000), (v6 & 1 ? 0x10000 : 0), 0);
            v0 = (unsigned int)!(v7 & 1);
        }
    }
    if (!(a1 >> 3 & 1) && a0->field_48 == 0x300)
        return 0;
    if (v0 & 1 & (unsigned int)a1 >> 4 & 1)
        return 0;
    if ((unsigned int)a1 & 32)
        v10 = (a2 * 0x2000000 | a2 >> 7) & 4261412865 & 1;
    else
        v10 = 1;
    if ((v10 | v0) != 1)
        return 0;
    v11 = *(int *)&a0[1].padding_20[12];
    if (!*(int *)&a0[1].padding_20[12])
        v0 = 1;
    if (a1 >> 5 & 1 && !v0)
        return 0;
    if ((unsigned int)a1 & 64)
    {
        v12 = arm64g_calculate_condition(19, v11, 0, 0);
        v13 = 3;
        v14 = (v12 & 1 ? a0[16].field_48 : 0x40000000);
    }
    else
    {
        v15 = arm64g_calculate_condition(19, v11, 0, 0);
        v13 = 0;
        v14 = (v15 & 1 ? a0[16].field_48 : 0x40000000);
    }
    v16 = arm64g_calculate_condition(v13 | 16, v14, 0, 0);
    return !(v16 & 1);
}
