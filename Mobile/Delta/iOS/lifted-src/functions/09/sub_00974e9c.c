/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x974e9c..0x974ed8 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_974e9c_0 {
    unsigned long long field_0;
    char padding_8[24];
    char field_20;
} st_974e9c_0;


st_974e9c_0 * sub_974e9c(unsigned long a0, st_974e9c_0 *a1)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w8
    unsigned long v5;  // cc_dep1
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned int v2;  // w9
    unsigned long long v3;  // 4112
    unsigned long long v4;  // 4102

    if (!a1)
        return 0;
    v0 = a1->field_20;
    v1 = v0 & 3;
    v2 = v0 & 12;
    if (v1 != 3)
    {
        v3 = arm64g_calculate_condition(v10 | 16, v5, v6, v7);
        v4 = arm64g_calculate_condition(3, (v3 & 1 ? v2 : 0), 0, 0);
        if (!(v4 & 1))
            return 0;
    }
    else
    {
        v8 = arm64g_calculate_condition(v10 | 16, v5, v6, v7);
        v9 = arm64g_calculate_condition(0, (v8 & 1 ? v2 : 0), 0, 0);
        if (!(v9 & 1))
            return 0;
    }
    *(unsigned long long *)(a0 + v1 * 48 + 40) = a1->field_0;
    return 1;
}
