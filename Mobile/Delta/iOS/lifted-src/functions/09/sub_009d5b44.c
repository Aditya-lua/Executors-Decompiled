/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d5b44..0x9d5ba4 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9d5b44(unsigned long a0, unsigned long a1, long long a2)
{
    unsigned long long v8;  // x30
    unsigned long v14;  // cc_dep1
    unsigned long long v15;  // 4112
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long v20;  // 4110
    unsigned long long v21;  // 4112
    unsigned int v10;  // w8
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4107
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4107
    unsigned long long v11;  // x10
    unsigned long v12;  // 4110
    unsigned long v13;  // cc_op
    char *v0;  // [bp-0x38]
    char v1;  // [bp-0x2c]
    char v2;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long v3;  // [bp-0x20]
    unsigned long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v5 = &v7;
    v6 = v8;
    v0 = &v7;
    v3 = a1;
    v4 = a0;
    v10 = v1;
    v11 = v2 >> 31;
    if (sub_9d5358(&v4, 0, &v3, &v2, &v1, a2, &v7))
    {
        v12 = arm64g_calculate_condition(v16 | 16, v17, v18, v19);
        v13 = 4;
        v14 = (v12 & 1 ? v11 : 0);
        v15 = arm64g_calculate_condition(4, v14, 0, 0);
        if (!(v15 & 1))
            goto LABEL_9d5b92;
LABEL_9d5b91:
        v22 = arm64g_calculate_condition(v13, v14, 0, 0);
        v23 = arm64g_calculate_condition(3, (v22 & 1 ? v10 : 0), 0, 0);
        if (!(v23 & 1))
            return 0xffffffff;
    }
    else
    {
        v20 = arm64g_calculate_condition(v16 | 16, v17, v18, v19);
        v13 = 0;
        v14 = (v20 & 1 ? v11 : 0);
        v21 = arm64g_calculate_condition(0, v14, 0, 0);
        if (v21 & 1)
            goto LABEL_9d5b91;
LABEL_9d5b92:
        v24 = arm64g_calculate_condition(v13, v14, 0, 0);
        v25 = arm64g_calculate_condition(0, (v24 & 1 ? v10 : 0), 0, 0);
        if (!(v25 & 1))
            return 0xffffffff;
    }
    return v2 & 0xffffffff;
}
