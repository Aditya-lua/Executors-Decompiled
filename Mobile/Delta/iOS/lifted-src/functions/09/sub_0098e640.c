/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e640..0x98e6d0 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_98e640(unsigned long long *a0)
{
    unsigned long long v10;  // 4110
    unsigned long long v12;  // 4109
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4109
    unsigned long long v2;  // x11
    unsigned long long v3;  // x12
    unsigned long long v4;  // x9
    unsigned long v6;  // cc_dep2
    unsigned long long v7;  // x9
    unsigned long long v8;  // x11

    v2 = 4;
    v3 = *a0;
    v4 = a0[1];
    if (v3 > 0x3fffffff)
        v2 = ((v3 <= 0x3fffffffffffffff) * 8 | (char)(v3 <= 0x3fffffffffffffff) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    if (v3 < 0x4000)
        v2 = 2;
    if (v3 < 64)
        v2 = 1;
    v6 = 64;
    if (64 > v4)
    {
        v7 = 1;
    }
    else
    {
        v6 = 0x4000;
        if (0x4000 > v4)
        {
            v7 = 2;
        }
        else
        {
            v7 = 4;
            v8 = v4 >> 30;
            v6 = 0;
            if (!v8)
            {
                v4 = v8;
            }
            else
            {
                v7 = ((v4 <= 0x3fffffffffffffff) * 8 | (char)(v4 <= 0x3fffffffffffffff) >> 61) & 0x7fffffff8 & 0x7ffffffff;
                v4 = v8;
            }
        }
    }
    if (v7)
    {
        v10 = arm64g_calculate_condition(20, v4, v6, 0);
        v12 = arm64g_calculate_condition(4, (v10 & 1 ? v2 : 0x40000000), 0, 0);
        v2 += v7;
        if (!(v12 & 1))
            return v2 + 1;
    }
    else
    {
        v13 = arm64g_calculate_condition(20, v4, v6, 0);
        v14 = arm64g_calculate_condition(0, (v13 & 1 ? v2 : 0x40000000), 0, 0);
        if (!(v14 & 1))
            return v2 + 1;
    }
    return 0;
}
