/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fa8f4..0x1fa964 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fa8f4_0 {
    char field_0;
} st_1fa8f4_0;


unsigned long long sub_1fa8f4(unsigned long long *a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v2;  // x8
    unsigned long v3;  // cc_op
    unsigned long long v12;  // 4105
    unsigned long long v13;  // 4112
    unsigned long long v4;  // x9
    unsigned long v5;  // x8
    unsigned long long v6;  // x10
    unsigned long v7;  // 4112
    unsigned long long v8;  // 4105
    unsigned long long v9;  // x0
    unsigned long long v10;  // 4112
    unsigned long v11;  // 4112
    st_1fa8f4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1fa8f4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0[1];
    v3 = 4;
    if (v2 <= a1)
        return 0;
    v4 = ~a1 + v2;
    v5 = *a0 + 40 * a1 + 4;
    while (1)
    {
        v6 = v4;
        if (*(int *)(v5 - 4) == 15)
        {
            v7 = arm64g_calculate_condition(v3, v2, a1, 0);
            v3 = 3;
            v2 = (v7 & 1 ? *(int *)v5 : 0);
            a1 = (v7 & 1 ? /* unsupported instruction */ : 0);
            v8 = arm64g_calculate_condition(19, v2, a1, 0);
            v9 = !(v8 & 1);
            v10 = arm64g_calculate_condition(3, v2, a1, 0);
            if (v10 & 1)
                return !(v8 & 1);
        }
        else
        {
            v11 = arm64g_calculate_condition(v3, v2, a1, 0);
            v3 = 0;
            v2 = (v11 & 1 ? *(int *)v5 : 0);
            a1 = (v11 & 1 ? /* unsupported instruction */ : 0);
            v12 = arm64g_calculate_condition(16, v2, a1, 0);
            v9 = !(v12 & 1);
            v13 = arm64g_calculate_condition(0, v2, a1, 0);
            if (v13 & 1)
                return !(v12 & 1);
        }
        v4 = v6 - 1;
        v5 += 40;
        if (!v6)
            return v9;
    }
}
