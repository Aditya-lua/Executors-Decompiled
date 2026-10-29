/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96319c..0x9631b4 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96319c_0 {
    char padding_0[24];
    unsigned int field_18;
} st_96319c_0;


long long sub_96319c(st_96319c_0 *a0, st_96319c_0 *a1)
{
    unsigned long v0;  // cc_dep1
    unsigned long v1;  // cc_dep2
    unsigned int v2;  // w8
    unsigned long long v3;  // 4107
    unsigned long long v4;  // 4107

    v0 = a0->field_18;
    v1 = a1->field_18;
    if (a1->field_18 <= a0->field_18)
    {
        v2 = 0;
        v3 = arm64g_calculate_condition(147, v0, v1, 0);
        if (!(v3 & 1))
            return 1;
    }
    else
    {
        v2 = 0xffffffff;
        v4 = arm64g_calculate_condition(147, v0, v1, 0);
        if (!(v4 & 1))
            return 1;
    }
    return v2;
}
