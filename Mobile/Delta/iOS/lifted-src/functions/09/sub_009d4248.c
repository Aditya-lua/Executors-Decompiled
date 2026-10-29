/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d4248..0x9d427c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9d4248(unsigned long a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long v11;  // cc_dep1
    unsigned long long v12;  // 4112
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long v17;  // 4110
    unsigned long long v18;  // 4112
    unsigned long long v7;  // x30
    unsigned long v19;  // 4112
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // 4112
    unsigned int v8;  // w0
    unsigned long long v23;  // 4113
    unsigned long v9;  // 4110
    unsigned long v10;  // cc_op
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_9d402c();
    if (a0)
    {
        v9 = arm64g_calculate_condition(v13 | 16, v14, v15, v16);
        v10 = 4;
        v11 = (v9 & 1 ? /* unsupported instruction */ : 0);
        v12 = arm64g_calculate_condition(20, v11, 0, 0);
        if (!(v12 & 1))
            goto LABEL_9d426a;
LABEL_9d4269:
        v19 = arm64g_calculate_condition(v10 | 16, v11, 0, 0);
        v20 = 3;
        v21 = (v19 & 1 ? v8 : 0);
    }
    else
    {
        v17 = arm64g_calculate_condition(v13 | 16, v14, v15, v16);
        v10 = 0;
        v11 = (v17 & 1 ? /* unsupported instruction */ : 0);
        v18 = arm64g_calculate_condition(16, v11, 0, 0);
        if (v18 & 1)
            goto LABEL_9d4269;
LABEL_9d426a:
        v22 = arm64g_calculate_condition(v10 | 16, v11, 0, 0);
        v20 = 0;
        v21 = (v22 & 1 ? v8 : 0);
    }
    v23 = arm64g_calculate_condition(v20 | 208, v21, 0, 0);
    return !(v23 & 1);
}
