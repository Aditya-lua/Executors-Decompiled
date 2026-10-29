/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2ac74..0xa2acdc (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2ac74_2 {
    char padding_0[32];
    unsigned long long field_20;
} st_a2ac74_2;

typedef struct st_a2ac74_0 {
    char padding_0[8];
    struct st_a2ac74_1 *field_8;
    char padding_10[16];
    unsigned long long field_20;
} st_a2ac74_0;

typedef struct st_a2ac74_1 {
    unsigned int field_0;
} st_a2ac74_1;


unsigned long long sub_a2ac74(st_a2ac74_0 *a0, st_a2ac74_2 *a1)
{
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // x30
    unsigned int v12;  // w10
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0->field_20)
    {
        v5 = arm64g_calculate_condition(v3 | 16, v4, v9, v10);
        v6 = arm64g_calculate_condition(20, (v5 & 1 ? a1->field_20 : 0x40000000), 0, 0);
        if (!(v6 & 1))
            return 0xfffffffe;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v4, v9, v10);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? a1->field_20 : 0x40000000), 0, 0);
        if (!(v8 & 1))
            return 0xfffffffe;
    }
    v0 = &v2;
    v1 = v11;
    v12 = *(int *)a0->field_8;
    return !sub_a66f20();
}
