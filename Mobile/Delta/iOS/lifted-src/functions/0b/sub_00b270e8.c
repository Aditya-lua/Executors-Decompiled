/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb270e8..0xb27108 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b270e8_0 {
    char padding_0[8];
    unsigned int field_8;
} st_b270e8_0;


unsigned long long sub_b270e8(st_b270e8_0 *a0, st_b270e8_0 *a1)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned long v4;  // cc_dep2
    unsigned long v5;  // cc_ndep
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4108
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long long v2;  // 4112
    unsigned long long v3;  // 4108

    v0 = a0->field_8;
    v1 = a1->field_8;
    if (0 < (int)v1)
    {
        v2 = arm64g_calculate_condition(v8 | 192, v9, v4, v5);
        v3 = arm64g_calculate_condition(195, (v2 & 1 ? v0 : 0x40000000), 0, 0);
        if (!(v3 & 1))
            return v1 - v0 & 0xffffffff;
    }
    else
    {
        v6 = arm64g_calculate_condition(v8 | 192, v9, v4, v5);
        v7 = arm64g_calculate_condition(192, (v6 & 1 ? v0 : 0x40000000), 0, 0);
        if (!(v7 & 1))
            return v1 - v0 & 0xffffffff;
    }
    return v0 - v1 & 0xffffffff;
}
