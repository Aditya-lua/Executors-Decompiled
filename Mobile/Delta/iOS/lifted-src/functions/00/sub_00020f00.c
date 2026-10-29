/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20f00..0x20f3c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20f00_0 {
    char padding_0[8];
    unsigned int field_8;
} st_20f00_0;

extern unsigned int g_f00c60;
extern unsigned int g_f00c70;
extern unsigned int g_f00c80;

long long sub_20f00(st_20f00_0 *a0)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_op
    unsigned long v4;  // cc_ndep
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long long v2;  // 4112
    unsigned long long v3;  // 4102

    v0 = a0->field_8;
    if (v0 != g_f00c60)
    {
        v2 = arm64g_calculate_condition(v1 | 16, v7, v8, v4);
        v3 = arm64g_calculate_condition(19, (v2 & 1 ? v0 : 0x40000000), (v2 & 1 ? g_f00c70 : 0), 0);
        if (!(v3 & 1))
            return 1;
    }
    else
    {
        v5 = arm64g_calculate_condition(v1 | 16, v7, v8, v4);
        v6 = arm64g_calculate_condition(16, (v5 & 1 ? v0 : 0x40000000), (v5 & 1 ? g_f00c70 : 0), 0);
        if (!(v6 & 1))
            return 1;
    }
    return v0 == g_f00c80;
}
