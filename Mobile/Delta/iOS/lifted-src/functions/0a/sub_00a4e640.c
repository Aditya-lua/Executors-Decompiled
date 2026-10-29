/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4e640..0xa4e68c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a4e640(unsigned long a0, unsigned int *a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // 4126
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned int v12;  // w0
    unsigned int v13;  // w8
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4107
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4107
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a98e90();
    v3 = arm64g_calculate_condition(0x11, *a1, 1, 0);
    if (v3 & 1)
    {
        v4 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v5 = arm64g_calculate_condition(4, (v4 & 1 ? v2 : 0x40000000), 0, 0);
        if (v5 & 1)
            return;
    }
    else
    {
        v8 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v9 = arm64g_calculate_condition(0, (v8 & 1 ? v2 : 0x40000000), 0, 0);
        if (v9 & 1)
            return;
    }
    v12 = sub_9f2ae0();
    v13 = *a1;
    if (v13 != v12)
    {
        v14 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v15 = arm64g_calculate_condition(3, (v14 & 1 ? v13 : 0x40000000), 0, 0);
        if (!(v15 & 1))
            goto LABEL_a4e67a;
LABEL_a4e679:
    }
    else
    {
        v16 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v17 = arm64g_calculate_condition(0, (v16 & 1 ? v13 : 0x40000000), 0, 0);
        if (v17 & 1)
            goto LABEL_a4e679;
LABEL_a4e67a:
        v12 = 0xffffffff;
    }
    *a1 = v12;
    return;
}
