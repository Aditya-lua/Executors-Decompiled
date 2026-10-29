/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fadcc..0x1fae28 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fadcc_0 {
    char field_0;
} st_1fadcc_0;


unsigned long long sub_1fadcc(unsigned long a0, unsigned int a1, unsigned long long *a2, unsigned int a3, unsigned long long a4)
{
    unsigned int *v2;  // x9
    unsigned long v3;  // cc_dep1
    unsigned int *v4;  // x9
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    st_1fadcc_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1fadcc_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = *a2 + 40 * a4 + 44;
    while (1)
    {
        a4 += 1;
        v3 = a4;
        if (a2[1] <= a4)
            return 0;
        v4 = v2 + 10;
        if (*(int *)((char *)v2 - 4) == a1)
        {
            v5 = arm64g_calculate_condition(4, v3, a2[1], 0);
            v6 = arm64g_calculate_condition(19, (v5 & 1 ? *v2 : 0), (v5 & 1 ? a3 : 0), 0);
            v2 = v4;
            if (!(v6 & 1))
                return a4;
        }
        else
        {
            v7 = arm64g_calculate_condition(4, v3, a2[1], 0);
            v8 = arm64g_calculate_condition(16, (v7 & 1 ? *v2 : 0), (v7 & 1 ? a3 : 0), 0);
            v2 = v4;
            if (!(v8 & 1))
                return a4;
        }
    }
}
