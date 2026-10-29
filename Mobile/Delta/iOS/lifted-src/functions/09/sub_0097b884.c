/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b884..0x97b8d8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b884_0 {
    char padding_0[24];
    struct st_97b884_1 *field_18;
} st_97b884_0;

typedef struct st_97b884_1 {
    unsigned long long field_0;
} st_97b884_1;


unsigned long long sub_97b884(st_97b884_0 *a0, unsigned long long a1)
{
    unsigned long long v2;  // x9
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1 + 1;
    if (a0->field_18)
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(36, (v4 & 1 ? v2 : 0), (v4 & 1 ? 2 : 0), 0);
        if (!(v5 & 1))
            return a1;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(32, (v7 & 1 ? v2 : 0), (v7 & 1 ? 2 : 0), 0);
        if (!(v8 & 1))
            return a1;
    }
    a0->field_18();
}
