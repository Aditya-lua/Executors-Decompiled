/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x975738..0x9758f0 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_fffffffffffffffc;

unsigned long long sub_975738(void* a0, unsigned int *a1)
{
    unsigned long long v4;  // x10
    unsigned long long v5;  // 4110
    unsigned long long v14;  // 4114
    unsigned long long v15;  // x10
    unsigned long long v16;  // 4110
    unsigned long long v17;  // x11
    unsigned long long v18;  // w11
    unsigned long v19;  // x9
    unsigned long long v20;  // x11
    unsigned long long v21;  // x8
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4109
    uint128_t v6;  // x9
    unsigned long long v24;  // x9
    unsigned long long v25;  // x8
    unsigned long long v26;  // 4110
    unsigned long v27;  // cc_dep1
    unsigned long v28;  // cc_dep2
    unsigned long long v29;  // 4105
    unsigned long long v30;  // 4105
    char v7;  // x8
    unsigned long long v8;  // x8
    unsigned long long v9;  // x21
    unsigned long long v10;  // x10
    unsigned long long v11;  // 4123
    unsigned long long v12;  // x11
    unsigned long long v13;  // x12
    char v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x40]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    sub_989228((long long)a0[0x100], &v0);
    v4 = v1 * 4;
    if (1000000 >= v4)
        v4 = 1000000;
    if (v1 > 0x3fffffffffffffff)
        v4 = (char *)&g_fffffffffffffffc + 3;
    v5 = arm64g_calculate_condition(50, v0, v4, 0);
    if (v5 & 1)
        v6 = v0 + v4;
    else
        v6 = (uint128_t)((char *)&g_fffffffffffffffc + 3);
    if ((unsigned int)(int)a0[280] < 16)
        v7 = (int)a0[280];
    else
        v7 = 16;
    v8 = 1 << (v7 & 63);
    if (v6 * v8 <= (char *)&g_fffffffffffffffc + 3)
        v9 = v8 * v6;
    else
        v9 = (char *)&g_fffffffffffffffc + 3;
    v10 = (long long)a0[416];
    v11 = arm64g_calculate_condition(18, (long long)a0[424], (long long)a0[408] + v10, 0);
    if (!(v11 & 1))
    {
        *a1 = (char)a0[459] != 0;
        (long long)a0[240]();
    }
    if ((long long)a0[408] || (char)a0[456] != 1 && (char)a0[457] != 1)
    {
        v12 = (long long)a0[312];
        v13 = v12 + v9;
        v14 = arm64g_calculate_condition(50, v12, v9, 0);
        if (!(v14 & 1))
            v13 = (char *)&g_fffffffffffffffc + 3;
        if (!v12)
            v13 = (char *)&g_fffffffffffffffc + 3;
        if (!v10)
            goto LABEL_975830;
    }
    else
    {
        v13 = (char *)&g_fffffffffffffffc + 3;
        if (!v10)
        {
LABEL_975830:
            if ((char)a0[456] == 1 || (char)a0[457] == 1)
            {
                v15 = 0;
                goto LABEL_97586c;
            }
        }
    }
    v15 = (long long)a0[320];
    if (v15)
    {
        v16 = arm64g_calculate_condition(50, v15, v9, 0);
        if (v16 & 1)
            v17 = v15 + v9;
        else
            v17 = (char *)&g_fffffffffffffffc + 3;
        v15 = v13 > v17;
        if (v17 < v13)
            v13 = v17;
    }
LABEL_97586c:
    v18 = (char)a0[456];
    if (((long long)a0[424] || v18 != 1 && (char)a0[457] != 1) && v18)
    {
        v19 = (long long)a0[2352];
        v20 = v8 * v19;
        if (v19 * v8 > (char *)&g_fffffffffffffffc + 3)
            v20 = (char *)&g_fffffffffffffffc + 3;
        v21 = v9 + v20;
        v22 = arm64g_calculate_condition(50, v9, v20, 0);
        if (!(v22 & 1))
            v21 = (char *)&g_fffffffffffffffc + 3;
        v23 = arm64g_calculate_condition(2, v19, 1, 0);
        if (!(v23 & 1))
            v9 = v21;
        v24 = (long long)a0[328];
        if (v24)
        {
            v25 = v24 + v9;
            v26 = arm64g_calculate_condition(50, v24, v9, 0);
            if (!(v26 & 1))
                v25 = (char *)&g_fffffffffffffffc + 3;
            v27 = v25;
            v28 = v13;
            if (v25 < v13)
            {
                v15 = 2;
                v29 = arm64g_calculate_condition(52, v27, v28, 0);
                if (!(v29 & 1))
                    goto LABEL_9758ba;
LABEL_9758b9:
                v13 = v25;
            }
            else
            {
                v15 &= 0xffffffff;
                v30 = arm64g_calculate_condition(52, v27, v28, 0);
                if (v30 & 1)
                    goto LABEL_9758b9;
LABEL_9758ba:
            }
        }
    }
    *a1 = v15;
    return v13;
}
