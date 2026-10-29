/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d6e2c..0x3d6e70 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_3d6e2c(unsigned int a0, unsigned int a1, unsigned int a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long v17;  // 4112
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // cc_dep2
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long long v9;  // x20
    unsigned long v23;  // 4112
    unsigned long long v24;  // 4117
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int v13;  // w8
    unsigned int v14;  // w9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v13 = a0 * a1;
    v14 = a2 ^ 0x7fffffff;
    if (sub_3c9590())
    {
        v17 = arm64g_calculate_condition(v21 | 16, v22, v15, v16);
        v18 = 3;
        v19 = (v17 & 1 ? v14 : 0x80000000);
        v20 = (v17 & 1 ? v13 : 0);
    }
    else
    {
        v23 = arm64g_calculate_condition(v21 | 16, v22, v15, v16);
        v18 = 0;
        v19 = (v23 & 1 ? v14 : 0x80000000);
        v20 = (v23 & 1 ? v13 : 0);
    }
    v24 = arm64g_calculate_condition(v18 | 176, v19, v20, 0);
    return !(v24 & 1);
}
