/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa254e0..0xa25540 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a254e0(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x7
    unsigned long long v1;  // x8
    unsigned long long v10;  // 4104
    unsigned long long v11;  // x13
    unsigned long long v12;  // 4104
    unsigned long long v13;  // 4104
    unsigned long v14;  // 4125
    unsigned long v15;  // 4132
    unsigned long v16;  // 4139
    unsigned long long v17;  // x10
    unsigned long long v2;  // x9
    unsigned long long v3;  // x14
    unsigned long v4;  // cc_dep1
    unsigned long long v5;  // x11
    unsigned long long v6;  // 4104
    unsigned long long v7;  // 4104
    unsigned long long v8;  // x12
    unsigned long long v9;  // 4104

    v0 = a1[1] * 0x8000000000000000 | *a1 >> 1;
    v1 = a1[2] * 0x8000000000000000 | a1[1] >> 1;
    v2 = a1[3] * 0x8000000000000000 | a1[2] >> 1;
    v3 = 0x7fffffff7fffffff;
    v4 = *a1 & 1;
    if (!(*a1 & 1))
    {
        v5 = 0;
        v6 = arm64g_calculate_condition(10, v4, 0, 0);
        if (!(v6 & 1))
            goto LABEL_a25516;
LABEL_a25515:
        v8 = 0;
        v9 = arm64g_calculate_condition(10, v4, 0, 0);
        if (!(v9 & 1))
            goto LABEL_a2551a;
LABEL_a25519:
        v11 = 0;
        v12 = arm64g_calculate_condition(10, v4, 0, 0);
        if (!(v12 & 1))
            goto LABEL_a2551e;
LABEL_a2551d:
        v3 = 0;
    }
    else
    {
        v5 = 12240214259982311570;
        v7 = arm64g_calculate_condition(10, v4, 0, 0);
        if (v7 & 1)
            goto LABEL_a25515;
LABEL_a25516:
        v8 = 13331199935092294293;
        v10 = arm64g_calculate_condition(10, v4, 0, 0);
        if (v10 & 1)
            goto LABEL_a25519;
LABEL_a2551a:
        v11 = 0xffffffffffffffff;
        v13 = arm64g_calculate_condition(10, v4, 0, 0);
        if (v13 & 1)
            goto LABEL_a2551d;
LABEL_a2551e:
    }
    v14 = arm64g_calculate_flag_c(2, v0, v5, 0);
    v15 = arm64g_calculate_flag_c(6, v1, v8, v14);
    v16 = arm64g_calculate_flag_c(6, v2, v11, v15);
    v17 = (a1[3] >> 1) + v3 + v16;
    *a0 = v0 + v5;
    a0[1] = v1 + v8 + v14;
    a0[2] = v2 + v11 + v15;
    a0[3] = v17;
    return a0;
}
