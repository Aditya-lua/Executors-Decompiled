/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98913c..0x989208 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_98913c(void* a0, unsigned long a1, unsigned long a2)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x8
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // 4105
    unsigned long long v12;  // 4105
    unsigned long long v13;  // x9
    unsigned long long v14;  // 4110
    unsigned long long v15;  // x9
    unsigned long long v16;  // x8
    unsigned long long v17;  // 4110
    unsigned long long v2;  // 4110
    unsigned long v3;  // x9
    unsigned long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long v6;  // x10
    unsigned long v7;  // x11
    unsigned long v8;  // x12
    unsigned long v9;  // cc_dep1

    if (a2)
    {
        *(unsigned long *)&a0[8] = a2;
        if (!(char)a0[32])
        {
            *(unsigned long *)a0 = a2;
            *(unsigned long *)&a0[16] = a2;
            *(unsigned long *)&a0[24] = a2 >> 1;
            *(char *)&a0[32] = 1;
            return a0;
        }
    }
    else
    {
        a2 = (long long)a0[8];
        if (!(char)a0[32])
        {
            *(unsigned long *)a0 = a2;
            *(unsigned long *)&a0[16] = a2;
            *(unsigned long *)&a0[24] = a2 >> 1;
            *(char *)&a0[32] = 1;
            return a0;
        }
    }
    v0 = (long long)a0[16];
    if (v0 > a2)
    {
        *(unsigned long *)&a0[16] = a2;
        v0 = a2;
    }
    v1 = v0 + a1;
    v2 = arm64g_calculate_condition(50, v0, a1, 0);
    if (!(v2 & 1))
        v1 = 0xffffffffffffffff;
    v3 = a2 - a1;
    if (a2 < a1)
        v3 = 0;
    if (a2 < v1)
        v4 = a2;
    else
        v4 = v3;
    v5 = (long long)a0[24] * 3;
    if ((long long)a0[24] * 3 > 0xffffffffffffffff)
        v5 = 0xffffffffffffffff;
    v6 = *(long long *)a0;
    v7 = v4 - v6;
    if (v4 < v6)
        v7 = 0;
    v8 = v6 - v4;
    v9 = v6;
    v10 = v4;
    if (v6 < v4)
    {
        v8 = 0;
        v11 = arm64g_calculate_condition(132, v9, v10, 0);
        if (!(v11 & 1))
            goto LABEL_9891a6;
LABEL_9891a5:
        v7 = v8;
    }
    else
    {
        v12 = arm64g_calculate_condition(132, v9, v10, 0);
        if (v12 & 1)
            goto LABEL_9891a5;
LABEL_9891a6:
    }
    v13 = v5 + v7;
    v14 = arm64g_calculate_condition(50, v5, v7, 0);
    if (!(v14 & 1))
        v13 = 0xffffffffffffffff;
    *(unsigned long long *)&a0[24] = v13 >> 2;
    v15 = v6 * 7;
    if (v6 * 7 > 0xffffffffffffffff)
        v15 = 0xffffffffffffffff;
    v16 = v15 + v4;
    v17 = arm64g_calculate_condition(50, v15, v4, 0);
    if (!(v17 & 1))
        v16 = 0xffffffffffffffff;
    *(unsigned long long *)a0 = v16 >> 3;
    return a0;
}
