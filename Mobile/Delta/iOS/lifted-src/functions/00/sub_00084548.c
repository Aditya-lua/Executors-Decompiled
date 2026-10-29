/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x84548..0x845c4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_84548(unsigned short *a0, unsigned long long a1, unsigned long long a2, unsigned long a3, unsigned long a4, unsigned int a5)
{
    unsigned long v0;  // x9
    unsigned long long v1;  // x8
    unsigned long long v6;  // 4102
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long long v13;  // x10
    unsigned short *v14;  // x9
    unsigned long long v15;  // x0
    unsigned long v16;  // x11
    unsigned long long v17;  // x11
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long v2;  // 4110
    unsigned long v3;  // cc_op
    unsigned long long v4;  // cc_dep1
    unsigned long long v5;  // cc_dep2

    v0 = a0[2];
    v1 = a4 + a5 * 0x7800 + a3 * v0;
    if (v1 <= a2)
    {
        v2 = arm64g_calculate_condition(v7 | 144, v8, v9, v10);
        v3 = 4;
        v4 = (v2 & 1 ? a1 : 0);
        v5 = (v2 & 1 ? 2 : 0);
        v6 = arm64g_calculate_condition(36, v4, v5, 0);
        if (v6 & 1)
            goto LABEL_8456c;
    }
    else
    {
        v11 = arm64g_calculate_condition(v7 | 144, v8, v9, v10);
        v3 = 0;
        v4 = (v11 & 1 ? a1 : 0);
        v5 = (v11 & 1 ? 2 : 0);
        v12 = arm64g_calculate_condition(32, v4, v5, 0);
        if (v12 & 1)
        {
LABEL_8456c:
            v13 = v0 + a0[3] + 3;
            v14 = a0 + 7;
            v15 = 1;
            while (1)
            {
                v16 = *(short *)((char *)v14 - 2);
                v1 = v1 + a4 + a3 * v16;
                v13 = v13 + v16 + *v14 + 3;
                v17 = v13 * 0x100;
                if (a2 < v1)
                {
                    v18 = arm64g_calculate_condition(v3 | 128, v4, v5, 0);
                    v19 = arm64g_calculate_condition(52, (v18 & 1 ? v1 : 0x20000000), (v18 & 1 ? v17 : 0), 0);
                    if (v19 & 1)
                        return v15;
                }
                else
                {
                    v20 = arm64g_calculate_condition(v3 | 128, v4, v5, 0);
                    v21 = arm64g_calculate_condition(48, (v20 & 1 ? v1 : 0x20000000), (v20 & 1 ? v17 : 0), 0);
                    if (v21 & 1)
                        return v15;
                }
                v14 += 4;
                v5 = v15 + 1;
                v3 = 4;
                v15 = v5;
                v4 = a1;
                if (v4 == v15)
                    return a1;
            }
        }
    }
    return 1;
}
