/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14160..0xa141e4 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a14160_0 {
    char padding_0[32];
    long long field_20;
} st_a14160_0;


long long sub_a14160(st_a14160_0 *a0, st_a14160_0 *a1)
{
    long long v2;  // x21
    long long v3;  // x20
    unsigned long long v8;  // 4110
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long v13;  // 4110
    unsigned long long v14;  // 4110
    long long v4;  // x0
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    long long v19;  // w0
    long long v20;  // w8
    unsigned long v5;  // 4110
    unsigned long v6;  // cc_op
    unsigned long v7;  // cc_dep1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd0(a1->field_20);
    v3 = sub_975ff4(a0->field_20);
    v4 = sub_975ff4(a1->field_20);
    if (v2)
    {
        v5 = arm64g_calculate_condition(v9 | 16, v10, v11, v12);
        v6 = 4;
        v7 = (v5 & 1 ? v3 : 0x40000000);
        v8 = arm64g_calculate_condition(20, v7, 0, 0);
        if (!(v8 & 1))
            goto LABEL_a141a6;
LABEL_a141a5:
        v15 = arm64g_calculate_condition(v6 | 16, v7, 0, 0);
        v16 = arm64g_calculate_condition(4, (v15 & 1 ? v4 : 0x40000000), 0, 0);
        if (v16 & 1)
            return 0xfffffffe;
    }
    else
    {
        v13 = arm64g_calculate_condition(v9 | 16, v10, v11, v12);
        v6 = 0;
        v7 = (v13 & 1 ? v3 : 0x40000000);
        v14 = arm64g_calculate_condition(16, v7, 0, 0);
        if (v14 & 1)
            goto LABEL_a141a5;
LABEL_a141a6:
        v17 = arm64g_calculate_condition(v6 | 16, v7, 0, 0);
        v18 = arm64g_calculate_condition(0, (v17 & 1 ? v4 : 0x40000000), 0, 0);
        if (v18 & 1)
            return 0xfffffffe;
    }
    v19 = (unsigned int)sub_a1afd8(v2, v3, v4, 0);
    if (v19 == 1)
        v20 = 0;
    else
        v20 = -0x2;
    if (!v19)
        return 1;
    return v20;
}
