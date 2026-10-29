/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b7348..0x1b73bc (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b7348_0 {
    char field_0;
} st_1b7348_0;


long long sub_1b7348(char *a0, char *a1)
{
    unsigned long v4;  // x20
    unsigned long v5;  // x20
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4105
    unsigned long v14;  // cc_op
    unsigned int v6;  // w0
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4105
    st_1b7348_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b7348_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0 == a1)
        return 1;
    v4 = a0 + 1;
    while (1)
    {
        v5 = v4;
        v6 = sub_58b10(*(char *)(v5 - 1), 0x400);
        if (v6)
        {
            v7 = arm64g_calculate_condition(v14 | 16, v9, v10, v11);
            v4 = v5 + 1;
            v8 = arm64g_calculate_condition(20, (v7 & 1 ? v5 : 0x40000000), (v7 & 1 ? a1 : 0), 0);
            if (!(v8 & 1))
                break;
        }
        else
        {
            v12 = arm64g_calculate_condition(v14 | 16, v9, v10, v11);
            v4 = v5 + 1;
            v13 = arm64g_calculate_condition(16, (v12 & 1 ? v5 : 0x40000000), (v12 & 1 ? a1 : 0), 0);
            if (!(v13 & 1))
                break;
        }
    }
    return v6 != 0;
}
