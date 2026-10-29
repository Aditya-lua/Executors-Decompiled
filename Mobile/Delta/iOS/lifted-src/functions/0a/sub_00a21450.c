/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa21450..0xa214c0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a21450(unsigned long long *a0)
{
    unsigned long long v0;  // x14
    unsigned long v1;  // 4158
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // x14
    unsigned long long v12;  // 4105
    unsigned long long v13;  // 4105
    unsigned long long v14;  // x15
    unsigned long long v15;  // 4105
    unsigned long long v16;  // 4105
    unsigned long long v17;  // x16
    unsigned long long v18;  // 4105
    unsigned long long v19;  // 4105
    unsigned long long v2;  // x15
    unsigned long long v20;  // x17
    unsigned long long v21;  // 4104
    unsigned long long v22;  // 4104
    unsigned long v3;  // x12
    unsigned long v4;  // 4159
    unsigned long long v5;  // x16
    unsigned long v6;  // 4160
    unsigned long long v7;  // x17
    unsigned long v8;  // x13
    unsigned long long v9;  // 4161

    v1 = arm64g_calculate_flag_c(4, v0, 1, 0);
    v4 = arm64g_calculate_flag_c(6, v2, v3, v1);
    v6 = arm64g_calculate_flag_c(6, v5, 0, v4);
    v9 = arm64g_calculate_flag_c(6, v7, v8, v6);
    v10 = v0 & 1;
    if (!(v0 & 1))
    {
        v11 = v0;
        v12 = arm64g_calculate_condition(10, v10, 0, 0);
        if (!(v12 & 1))
            goto LABEL_a2146e;
LABEL_a2146d:
        v14 = v2;
        v15 = arm64g_calculate_condition(10, v10, 0, 0);
        if (!(v15 & 1))
            goto LABEL_a21472;
LABEL_a21471:
        v17 = v5;
        v18 = arm64g_calculate_condition(10, v10, 0, 0);
        if (!(v18 & 1))
            goto LABEL_a21476;
LABEL_a21475:
        v20 = v7;
        v21 = arm64g_calculate_condition(10, v10, 0, 0);
        if (!(v21 & 1))
            goto LABEL_a2147a;
        goto LABEL_a21479;
    }
    else
    {
        v11 = v0 - 1;
        v13 = arm64g_calculate_condition(10, v10, 0, 0);
        if (v13 & 1)
            goto LABEL_a2146d;
LABEL_a2146e:
        v14 = v2 + v3 + v1;
        v16 = arm64g_calculate_condition(10, v10, 0, 0);
        if (v16 & 1)
            goto LABEL_a21471;
LABEL_a21472:
        v17 = v5 + v4;
        v19 = arm64g_calculate_condition(10, v10, 0, 0);
        if (v19 & 1)
            goto LABEL_a21475;
LABEL_a21476:
        v20 = v7 + v8 + v6;
        v22 = arm64g_calculate_condition(10, v10, 0, 0);
        if (v22 & 1)
        {
LABEL_a21479:
            v9 = 0;
        }
        else
        {
LABEL_a2147a:
        }
    }
    *a0 = v11 >> 1 | v14 * 0x8000000000000000;
    a0[1] = v14 >> 1 | v17 * 0x8000000000000000;
    a0[2] = v17 >> 1 | v20 * 0x8000000000000000;
    a0[3] = v20 >> 1 | v9 * 0x8000000000000000;
    return a0;
}
