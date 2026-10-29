/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c52ec..0x9c5344 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c52ec(long long a0, long long a1)
{
    unsigned int v5;  // w8
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4121
    unsigned int v6;  // w9
    unsigned long long v16;  // x0
    unsigned long long v7;  // 4112
    int v8;  // w8
    unsigned long long v9;  // 4121
    char v0;  // [bp-0x18]
    char v1;  // [bp-0x14]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!sub_9c5048(&v1, &v0, a1, a0))
        return 0xfffffffe;
    v5 = v1;
    v6 = v0;
    if ((int)v5 <= 0)
    {
        v7 = arm64g_calculate_condition(v10 | 208, v11, v12, v13);
        v8 = (int)(v5 | v6) >> 31;
        v9 = arm64g_calculate_condition(195, (v7 & 1 ? v6 : 0), 0, 0);
        if (!(v9 & 1))
            goto LABEL_9c532e;
LABEL_9c532d:
        v16 = 1;
    }
    else
    {
        v14 = arm64g_calculate_condition(v10 | 208, v11, v12, v13);
        v8 = (int)(v5 | v6) >> 31;
        v15 = arm64g_calculate_condition(192, (v14 & 1 ? v6 : 0), 0, 0);
        if (v15 & 1)
            goto LABEL_9c532d;
LABEL_9c532e:
        v16 = v8;
    }
    return v16;
}
