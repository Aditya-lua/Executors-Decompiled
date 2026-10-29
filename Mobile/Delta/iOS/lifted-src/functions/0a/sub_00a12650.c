/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12650..0xa12720 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a12650_0 {
    char padding_0[64];
    long long field_40;
    unsigned int field_48;
    unsigned int field_4c;
    unsigned int field_50;
    unsigned int field_54;
    unsigned int field_58;
    unsigned int field_5c;
    long long field_60;
    long long field_68;
} st_a12650_0;


unsigned long long sub_a12650(st_a12650_0 *a0, st_a12650_0 *a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned int v5;  // w8
    unsigned long long v6;  // 4195
    unsigned long long v7;  // x0
    unsigned int v8;  // w8
    unsigned long long v9;  // 4135
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4c34(a0->field_40, a1->field_40);
    if (!v2)
        return v2;
    v3 = sub_9e4c34(a0->field_60, a1->field_60);
    if (!v3)
        return v3;
    v4 = sub_9e4c34(a0->field_68, a1->field_68);
    if (!v4)
        return v4;
    v5 = a1->field_48;
    a0->field_48 = v5;
    a0->field_4c = a1->field_4c;
    a0->field_50 = a1->field_50;
    a0->field_54 = a1->field_54;
    a0->field_58 = a1->field_58;
    a0->field_5c = a1->field_5c;
    v6 = arm64g_calculate_condition(177, v5, 63, 0);
    v7 = sub_9e4cdc(a0->field_60, (int)((v6 & 1 ? v5 + 126 : v5 + 63)) >> 6);
    if (!v7)
        return v7;
    v8 = a0->field_48;
    v9 = arm64g_calculate_condition(177, v8, 63, 0);
    v10 = sub_9e4cdc(a0->field_68, (int)((v9 & 1 ? v8 + 126 : v8 + 63)) >> 6);
    if (!v10)
        return v10;
    sub_9e4298(a0->field_60);
    sub_9e4298(a0->field_68);
    return 1;
}
