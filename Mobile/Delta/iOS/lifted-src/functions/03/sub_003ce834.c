/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ce834..0x3ce8a0 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_3ce834(unsigned int a0)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned long v10;  // cc_dep1
    unsigned int v11;  // w9
    unsigned long long v12;  // 4108
    unsigned long long v13;  // 4108
    unsigned long v2;  // cc_dep1
    unsigned int v3;  // w10
    unsigned long long v4;  // 4108
    unsigned long long v5;  // 4108
    unsigned long v6;  // cc_dep1
    unsigned int v7;  // w9
    unsigned long long v8;  // 4108
    unsigned long long v9;  // 4108

    if (!a0)
        return 0xffffffff;
    v0 = a0 >> 16;
    v1 = v0 != 0;
    if (v0)
        a0 = v0;
    v2 = a0;
    if (0xff < a0)
    {
        v3 = (8 | (v1 * 16 | v1 >> 28) & 16) & 31;
        v4 = arm64g_calculate_condition(131, v2, 0xff, 0);
        if (!(v4 & 1))
            goto LABEL_3ce862;
LABEL_3ce861:
        a0 >>= 8;
    }
    else
    {
        v3 = v1 * 16;
        v5 = arm64g_calculate_condition(131, v2, 0xff, 0);
        if (v5 & 1)
            goto LABEL_3ce861;
LABEL_3ce862:
    }
    v6 = a0;
    if (15 < a0)
    {
        v7 = v3 | 4;
        v8 = arm64g_calculate_condition(131, v6, 15, 0);
        if (!(v8 & 1))
            goto LABEL_3ce876;
LABEL_3ce875:
        a0 >>= 4;
    }
    else
    {
        v7 = v3;
        v9 = arm64g_calculate_condition(131, v6, 15, 0);
        if (v9 & 1)
            goto LABEL_3ce875;
LABEL_3ce876:
    }
    v10 = a0;
    if (3 < a0)
    {
        v11 = v7 | 2;
        v12 = arm64g_calculate_condition(131, v10, 3, 0);
        if (!(v12 & 1))
            goto LABEL_3ce88a;
LABEL_3ce889:
        a0 >>= 2;
    }
    else
    {
        v11 = v7;
        v13 = arm64g_calculate_condition(131, v10, 3, 0);
        if (v13 & 1)
            goto LABEL_3ce889;
LABEL_3ce88a:
    }
    if (a0 > 1)
        return v11 + 1;
    return v11;
}
