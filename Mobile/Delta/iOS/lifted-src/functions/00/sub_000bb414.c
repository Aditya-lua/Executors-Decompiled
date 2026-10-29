/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb414..0xbb478 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_bb414(unsigned int *a0, unsigned int *a1, unsigned int *a2, unsigned int a3, unsigned int a4)
{
    unsigned int v0;  // w10
    unsigned int v1;  // w8
    unsigned long long v6;  // 4112
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long v11;  // 4112
    unsigned long long v12;  // 4112
    unsigned long v13;  // 4112
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long long v17;  // 4102
    unsigned long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned long v20;  // x9
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4102
    unsigned int v25;  // w10
    unsigned long v2;  // 4112
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2

    v0 = a2[11];
    v1 = v0 - a3;
    if (a2[10] <= a3)
    {
        v2 = arm64g_calculate_condition(v7 | 144, v8, v9, v10);
        v3 = 3;
        v4 = (v2 & 1 ? v0 : 0);
        v5 = (v2 & 1 ? a3 : 0);
        v6 = arm64g_calculate_condition(131, v4, v5, 0);
        if (!(v6 & 1))
            goto LABEL_bb426;
LABEL_bb425:
        v13 = arm64g_calculate_condition(v3 | 128, v4, v5, 0);
        v14 = 3;
        v15 = (v13 & 1 ? v1 : 0);
        v16 = (v13 & 1 ? /* unsupported instruction */ : 0);
        v17 = arm64g_calculate_condition(0x33, v15, v16, 0);
        if (v17 & 1)
            return a0;
    }
    else
    {
        v11 = arm64g_calculate_condition(v7 | 144, v8, v9, v10);
        v3 = 0;
        v4 = (v11 & 1 ? v0 : 0);
        v5 = (v11 & 1 ? a3 : 0);
        v12 = arm64g_calculate_condition(128, v4, v5, 0);
        if (v12 & 1)
            goto LABEL_bb425;
LABEL_bb426:
        v18 = arm64g_calculate_condition(v3 | 128, v4, v5, 0);
        v14 = 0;
        v15 = (v18 & 1 ? v1 : 0);
        v16 = (v18 & 1 ? /* unsupported instruction */ : 0);
        v19 = arm64g_calculate_condition(48, v15, v16, 0);
        if (v19 & 1)
            return a0;
    }
    v20 = *a1;
    if ((unsigned int)v20)
    {
        if ((unsigned int)v20 <= 0xfff)
        {
            v21 = arm64g_calculate_condition(v14 | 144, v15, v16, 0);
            v22 = arm64g_calculate_condition(147, (v21 & 1 ? v1 : 0), (v21 & 1 ? *(int *)((char *)&a0[2 * v20] - 4) : 0), 0);
            if (v22 & 1)
                return a0;
        }
        else
        {
            v23 = arm64g_calculate_condition(v14 | 144, v15, v16, 0);
            v24 = arm64g_calculate_condition(144, (v23 & 1 ? v1 : 0), (v23 & 1 ? *(int *)((char *)&a0[2 * v20] - 4) : 0), 0);
            if (v24 & 1)
                return a0;
        }
    }
    v25 = a2[12] + 3;
    a0[1 + 2 * v20] = v1;
    a0[2 * *a1] = v25;
    *a1 = *a1 + 1;
    return a0;
}
