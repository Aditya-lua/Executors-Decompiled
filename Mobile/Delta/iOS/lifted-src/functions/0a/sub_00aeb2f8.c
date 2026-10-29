/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb2f8..0xaeb374 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aeb2f8_0 {
    char padding_0[232];
    unsigned int field_e8;
    char field_ec;
    char padding_ed[7];
    char field_f4;
} st_aeb2f8_0;


unsigned long long sub_aeb2f8(st_aeb2f8_0 *a0)
{
    unsigned long long v2;  // x0
    unsigned long v3;  // x8
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned int v4;  // w9
    unsigned int v5;  // w11
    unsigned long v6;  // cc_dep1
    unsigned long long v7;  // x0
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aea7f4();
    if (!(unsigned int)v2)
        return v2;
    v3 = a0->field_e8;
    if (v3 >> 1 & 1 && !(a0->field_ec >> 2 & 1))
        return 0;
    if (v3 & 1)
        return __ROL__((unsigned int)v3, 28) & 4026531841 & 1;
    v4 = (unsigned int)v3 & 2;
    v5 = (unsigned int)v3 & 8256;
    v6 = v5;
    if (v5 == 8256)
    {
        v7 = 3;
        v8 = arm64g_calculate_condition(19, v6, 8256, 0);
        if (!(v8 & 1))
            goto LABEL_aeb33e;
LABEL_aeb33d:
        v10 = arm64g_calculate_condition(19, v6, 8256, 0);
        v11 = arm64g_calculate_condition(19, (v10 & 1 ? v4 : 0), 0, 0);
        if (v11 & 1)
            return v7;
    }
    else
    {
        v7 = 4;
        v9 = arm64g_calculate_condition(19, v6, 8256, 0);
        if (v9 & 1)
            goto LABEL_aeb33d;
LABEL_aeb33e:
        v12 = arm64g_calculate_condition(19, v6, 8256, 0);
        v13 = arm64g_calculate_condition(16, (v12 & 1 ? v4 : 0), 0, 0);
        if (v13 & 1)
            return v7;
    }
    if (v3 >> 3 & 1 && a0->field_f4 & 7)
        return 5;
    return 0;
}
