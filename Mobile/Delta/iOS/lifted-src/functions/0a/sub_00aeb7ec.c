/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb7ec..0xaeb854 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aeb7ec_0 {
    char padding_0[232];
    unsigned int field_e8;
    char field_ec;
    char padding_ed[7];
    char field_f4;
} st_aeb7ec_0;


unsigned long long sub_aeb7ec(unsigned long a0, st_aeb7ec_0 *a1, unsigned int a2)
{
    unsigned long v0;  // x8
    unsigned int v1;  // w9
    unsigned long long v10;  // 4102
    unsigned int v2;  // w11
    unsigned long v3;  // cc_dep1
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4112

    if (!a2)
        return 1;
    v0 = a1->field_e8;
    if (v0 >> 1 & 1 && !(a1->field_ec >> 2 & 1))
        return 0;
    if (v0 & 1)
        return __ROL__((unsigned int)v0, 28) & 4026531841 & 1;
    v1 = (unsigned int)v0 & 2;
    v2 = (unsigned int)v0 & 8256;
    v3 = v2;
    if (v2 == 8256)
    {
        v4 = 3;
        v5 = arm64g_calculate_condition(19, v3, 8256, 0);
        if (!(v5 & 1))
            goto LABEL_aeb81e;
LABEL_aeb81d:
        v7 = arm64g_calculate_condition(19, v3, 8256, 0);
        v8 = arm64g_calculate_condition(19, (v7 & 1 ? v1 : 0), 0, 0);
        if (v8 & 1)
            return v4;
    }
    else
    {
        v4 = 4;
        v6 = arm64g_calculate_condition(19, v3, 8256, 0);
        if (v6 & 1)
            goto LABEL_aeb81d;
LABEL_aeb81e:
        v9 = arm64g_calculate_condition(19, v3, 8256, 0);
        v10 = arm64g_calculate_condition(16, (v9 & 1 ? v1 : 0), 0, 0);
        if (v10 & 1)
            return v4;
    }
    if (v0 >> 3 & 1 && a1->field_f4 & 7)
        return 5;
    return 0;
}
