/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa85848..0xa85900 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a85848_0 {
    char padding_0[32];
    long long field_20;
} st_a85848_0;


unsigned long long sub_a85848(long long a0, long long a1, long long a2, long long a3, st_a85848_0 *a4)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v13;  // 4105
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4105
    unsigned int v7;  // w8
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4112
    unsigned int v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a3fe04(a3, a4->field_20, 0);
    if (!(unsigned int)v3)
        return v3;
    v0 = 32;
    v4 = sub_a3fe10(a3, a1, a2);
    if (!(unsigned int)v4)
    {
        return v4;
    }
    else if (sub_a50b14(sub_a2d030(a3)))
    {
        return sub_a400f8(a3, a0, 32) != 0;
    }
    else
    {
        v7 = v0;
        if (!sub_a3ff7c(a3, a0, &v0))
        {
            v18 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
            v19 = arm64g_calculate_condition(16, (v18 & 1 ? v7 : 0), (v18 & 1 ? 32 : 0), 0);
            return !(v19 & 1);
        }
        v12 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
        v13 = arm64g_calculate_condition(19, (v12 & 1 ? v7 : 0), (v12 & 1 ? 32 : 0), 0);
        return !(v13 & 1);
    }
}
