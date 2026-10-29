/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x691a4..0x6926c (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_691a4_0 {
    char field_0;
} st_691a4_0;


int sub_691a4(char *a0, char *a1, char *a2, char *a3)
{
    unsigned long v4;  // x24
    unsigned long v5;  // x24
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4105
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4105
    unsigned int v6;  // w0
    char *v7;  // x21
    unsigned int v8;  // w0
    st_691a4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_691a4_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a2 == a3)
        return 0;
    v4 = a2 + 1;
    while (1)
    {
        v5 = v4;
        if (a0 == a1)
            return 1;
        v6 = ___tolower(*a0);
        if ((int)v6 < (int)___tolower(*(char *)(v5 - 1)))
            return 1;
        v7 = a0 + 1;
        v8 = ___tolower(*(char *)(v5 - 1));
        if ((int)___tolower(*a0) <= (int)v8)
        {
            v10 = arm64g_calculate_condition(v12 | 160, v13, v14, v15);
            v4 = v5 + 1;
            v11 = arm64g_calculate_condition(20, (v10 & 1 ? v5 : 0x40000000), (v10 & 1 ? a3 : 0), 0);
            a0 = v7;
            if (!(v11 & 1))
                return 0;
        }
        else
        {
            v16 = arm64g_calculate_condition(v12 | 160, v13, v14, v15);
            v4 = v5 + 1;
            v17 = arm64g_calculate_condition(16, (v16 & 1 ? v5 : 0x40000000), (v16 & 1 ? a3 : 0), 0);
            a0 = v7;
            if (!(v17 & 1))
                return 0;
        }
    }
}
