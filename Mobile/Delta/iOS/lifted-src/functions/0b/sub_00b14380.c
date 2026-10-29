/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb14380..0xb143c4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b14380_1 {
    char padding_0[264];
    struct st_b14380_0 *field_108;
} st_b14380_1;

typedef struct st_b14380_0 {
    char padding_0[24];
    unsigned int field_18;
} st_b14380_0;


long long sub_b14380(unsigned long a0, st_b14380_1 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long v18;  // 4112
    unsigned long long v7;  // x30
    unsigned long long v19;  // 4126
    unsigned int v8;  // w0
    unsigned int v9;  // w8
    unsigned long v10;  // 4112
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a198e8();
    v9 = a1->field_108->field_18;
    if (v9 != 1172)
    {
        v10 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
        v11 = 3;
        v12 = (v10 & 1 ? v9 : 0x40000000);
        v13 = (v10 & 1 ? 408 : 0);
    }
    else
    {
        v18 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
        v11 = 0;
        v12 = (v18 & 1 ? v9 : 0x40000000);
        v13 = (v18 & 1 ? 408 : 0);
    }
    v19 = arm64g_calculate_condition(v11 | 16, v12, v13, 0);
    if (v8 & 4)
        return !(v19 & 1);
    return v9 != 1172;
}
