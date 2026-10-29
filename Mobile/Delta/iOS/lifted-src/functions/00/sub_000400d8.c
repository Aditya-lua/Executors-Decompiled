/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x400d8..0x400fc (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_400d8_0 {
    char padding_0[8];
    unsigned int field_8;
} st_400d8_0;

extern unsigned int g_f00c20;
extern unsigned int g_f00d10;

long long sub_400d8(unsigned long a0, st_400d8_0 *a1)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long v9;  // 4112
    unsigned long long v10;  // 4105
    unsigned long v2;  // 4112
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2

    v0 = a1->field_8;
    if (v0 != g_f00c20)
    {
        v2 = arm64g_calculate_condition(v1 | 16, v6, v7, v8);
        v3 = 3;
        v4 = (v2 & 1 ? v0 : 0x40000000);
        v5 = (v2 & 1 ? g_f00d10 : 0);
    }
    else
    {
        v9 = arm64g_calculate_condition(v1 | 16, v6, v7, v8);
        v3 = 0;
        v4 = (v9 & 1 ? v0 : 0x40000000);
        v5 = (v9 & 1 ? g_f00d10 : 0);
    }
    v10 = arm64g_calculate_condition(v3, v4, v5, 0);
    return !(v10 & 1);
}
