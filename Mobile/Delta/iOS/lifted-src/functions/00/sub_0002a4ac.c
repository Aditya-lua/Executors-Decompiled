/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a4ac..0x2a544 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a4ac_0 {
    char padding_0[128];
    char field_80;
    char padding_81[127];
    unsigned int field_100;
    char field_104;
} st_2a4ac_0;


long long sub_2a4ac(st_2a4ac_0 *a0, st_2a4ac_0 *a1)
{
    unsigned long v7;  // x8
    unsigned long long v8;  // x22
    unsigned long v17;  // x0
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4102
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned int v13;  // w10
    unsigned int v14;  // w11
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = a0->field_100;
    if ((unsigned int)v7 != a1->field_100)
        return 0;
    v0 = v8;
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = &v6;
    v5 = v12;
    if (_memcmp())
        return 0;
    v13 = a1->field_104;
    v14 = a0->field_104;
    v15 = v14 & 0xff;
    v16 = v13 & 0xff;
    if (v14 != v13)
    {
        v17 = 0;
        v18 = arm64g_calculate_condition(3, v15, v16, 0);
        if (!(v18 & 1))
            goto LABEL_2a516;
LABEL_2a515:
        v20 = arm64g_calculate_condition(3, v15, v16, 0);
        v21 = arm64g_calculate_condition(3, (v20 & 1 ? v14 & 0xff : 0x40000000), 0, 0);
        if (v21 & 1)
            return v17;
    }
    else
    {
        v17 = v14 ^ 1;
        v19 = arm64g_calculate_condition(3, v15, v16, 0);
        if (v19 & 1)
            goto LABEL_2a515;
LABEL_2a516:
        v22 = arm64g_calculate_condition(3, v15, v16, 0);
        v23 = arm64g_calculate_condition(0, (v22 & 1 ? v14 & 0xff : 0x40000000), 0, 0);
        if (v23 & 1)
            return v17;
    }
    return !_memcmp(&a0->field_80, &a1->field_80, v7 * 4);
}
