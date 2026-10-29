/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d5ba4..0x9d5c00 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9d5ba4(unsigned long a0, unsigned long a1, long long a2, long long a3)
{
    unsigned long long v7;  // x30
    unsigned long v13;  // cc_dep1
    unsigned long long v14;  // 4112
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long v19;  // 4110
    unsigned long long v20;  // 4112
    unsigned int v9;  // w8
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4107
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4107
    unsigned long long v10;  // x10
    unsigned long v11;  // 4110
    unsigned long v12;  // cc_op
    char v0;  // [bp-0x2c]
    char v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long v2;  // [bp-0x20]
    unsigned long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v3 = a0;
    v2 = a1;
    v9 = v0;
    v10 = v1 >> 31;
    if (sub_9d5358(&v3, 0, &v2, &v1, &v0, a2, a3))
    {
        v11 = arm64g_calculate_condition(v15 | 16, v16, v17, v18);
        v12 = 4;
        v13 = (v11 & 1 ? v10 : 0);
        v14 = arm64g_calculate_condition(4, v13, 0, 0);
        if (!(v14 & 1))
            goto LABEL_9d5bee;
LABEL_9d5bed:
        v21 = arm64g_calculate_condition(v12, v13, 0, 0);
        v22 = arm64g_calculate_condition(3, (v21 & 1 ? v9 : 0), 0, 0);
        if (!(v22 & 1))
            return 0xffffffff;
    }
    else
    {
        v19 = arm64g_calculate_condition(v15 | 16, v16, v17, v18);
        v12 = 0;
        v13 = (v19 & 1 ? v10 : 0);
        v20 = arm64g_calculate_condition(0, v13, 0, 0);
        if (v20 & 1)
            goto LABEL_9d5bed;
LABEL_9d5bee:
        v23 = arm64g_calculate_condition(v12, v13, 0, 0);
        v24 = arm64g_calculate_condition(0, (v23 & 1 ? v9 : 0), 0, 0);
        if (!(v24 & 1))
            return 0xffffffff;
    }
    return v1 & 0xffffffff;
}
