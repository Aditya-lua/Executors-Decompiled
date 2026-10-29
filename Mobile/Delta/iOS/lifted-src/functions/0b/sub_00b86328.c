/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb86328..0xb86358 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b86328_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_b86328_0;


void sub_b86328(st_b86328_0 *a0)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x9
    unsigned long v4;  // cc_dep2
    unsigned long v5;  // cc_ndep
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long long v2;  // 4110
    unsigned long long v3;  // 4102

    v0 = a0->field_10;
    v1 = v0 + (v0 * 4 + 11 & 0xfffffffffffffff8);
    if (v0)
    {
        v2 = arm64g_calculate_condition(v8 | 16, v9, v4, v5);
        v3 = arm64g_calculate_condition(18, (v2 & 1 ? v1 : 0x40000000), (v2 & 1 ? 9 : 0), 0);
        if (!(v3 & 1))
            return;
    }
    else
    {
        v6 = arm64g_calculate_condition(v8 | 16, v9, v4, v5);
        v7 = arm64g_calculate_condition(16, (v6 & 1 ? v1 : 0x40000000), (v6 & 1 ? 9 : 0), 0);
        if (!(v7 & 1))
            return;
    }
}
