/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991444..0x991508 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_991444(void* a0, unsigned long long a1, unsigned long long a2, unsigned long long *a3)
{
    unsigned long v0;  // cc_dep2
    unsigned long v1;  // x8
    unsigned long long v10;  // x9
    unsigned long v11;  // 4110
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v15;  // 4104
    unsigned long v16;  // 4110
    unsigned long long v17;  // 4104
    unsigned long long v18;  // x9
    unsigned long long v19;  // x9
    unsigned long v2;  // x8
    unsigned long long v20;  // x10
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4105
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4105
    unsigned long v3;  // x8
    unsigned long v4;  // cc_dep1
    unsigned long long v5;  // x9
    unsigned long long v6;  // x10
    unsigned long long v7;  // x11
    unsigned long long v8;  // x8
    unsigned long long v9;  // x13

    if (2 >= (long long)a1)
    {
        v0 = 1;
        if (a1 != 1)
        {
            v0 = 2;
            if (a1 != 2)
                return 0;
            v1 = *(short *)a0;
            v2 = (unsigned int)((v1 & 0xff00) >> 8) | (unsigned int)v1 * 0x100 & 0xff00ff00;
        }
        else
        {
            v2 = *(char *)a0;
        }
    }
    else
    {
        v0 = 3;
        if (a1 != 3)
        {
            v0 = 4;
            if (a1 != 4)
                return 0;
            v3 = *(int *)a0;
            v2 = (((((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        }
        else
        {
            v2 = *(char *)a0 * 0x10000 | (char)a0[1] * 0x100 | (char)a0[2];
        }
    }
    v4 = a1;
    v5 = a2 + 1;
    v6 = 1 << ((char)a1 * 8 & 63);
    v7 = v6 >> 1;
    v8 = v2 | v5 & -v6;
    v9 = 0x4000000000000000 - v6;
    v10 = v7 + v5;
    if ((long long)v6 <= (long long)v8)
    {
        v11 = arm64g_calculate_condition(164, v4, v0, 0);
        v12 = 4;
        v13 = (v11 & 1 ? v8 : 0x40000000);
        v14 = (v11 & 1 ? v10 : 0);
        v15 = arm64g_calculate_condition(212, v13, v14, 0);
        if (!(v15 & 1))
            goto LABEL_9914e2;
LABEL_9914e1:
        v18 = 0;
    }
    else
    {
        v16 = arm64g_calculate_condition(164, v4, v0, 0);
        v12 = 0;
        v13 = (v16 & 1 ? v8 : 0x40000000);
        v14 = (v16 & 1 ? v10 : 0);
        v17 = arm64g_calculate_condition(208, v13, v14, 0);
        if (v17 & 1)
            goto LABEL_9914e1;
LABEL_9914e2:
        v18 = v6;
    }
    v19 = v8 - v18;
    v20 = v8 + v6;
    if ((long long)v8 <= (long long)(v5 - v7))
    {
        v21 = arm64g_calculate_condition(v12 | 208, v13, v14, 0);
        v22 = arm64g_calculate_condition(164, (v21 & 1 ? v8 : 0), (v21 & 1 ? v9 : 0), 0);
        if (!(v22 & 1))
            goto LABEL_9914f6;
LABEL_9914f5:
    }
    else
    {
        v23 = arm64g_calculate_condition(v12 | 208, v13, v14, 0);
        v24 = arm64g_calculate_condition(160, (v23 & 1 ? v8 : 0), (v23 & 1 ? v9 : 0), 0);
        if (v24 & 1)
            goto LABEL_9914f5;
LABEL_9914f6:
        v19 = v20;
    }
    *a3 = v19;
    return 1;
}
