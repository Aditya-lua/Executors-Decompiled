/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4fe30..0x4ff3c (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_4fe30(double a0, double a1, double a2)
{
    unsigned long long v0;  // 4132
    unsigned long long v1;  // x8
    unsigned long v10;  // 4112
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long long v14;  // 4112
    unsigned long v15;  // 4112
    unsigned long long v16;  // 4112
    unsigned long v17;  // 4112
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    unsigned long long v2;  // 4132
    unsigned long v20;  // cc_dep2
    unsigned long long v21;  // 4102
    unsigned long v22;  // 4112
    unsigned long long v23;  // 4102
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4102
    unsigned long long v3;  // 4133
    unsigned long long v4;  // x9
    unsigned long long v5;  // 4132
    unsigned long long v6;  // 4133
    unsigned long long v7;  // x10
    double v8;  // d0
    unsigned long v9;  // cc_dep1

    v0 = arm64g_calculate_condition(128, (((((char)(CmpF(__double_as_longlong(fabs(a0)), 32767.0)) >> 5 & 3 | fabs(a0) < 32767.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(fabs(a0))) * 0x10000000, 0, 0);
    if (!(v0 & 1) && (v1 = (int)a0, (double)(int)v1 == a0))
    {
        v2 = arm64g_calculate_condition(144, (((((char)(CmpF(__double_as_longlong(fabs(a1)), 32767.0)) >> 5 & 3 | fabs(a1) < 32767.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(fabs(a1))) * 0x10000000, 0, 0);
        if (v2 & 1)
            goto LABEL_4fe90;
    }
    else
    {
        v1 = 0x80000000;
        v3 = arm64g_calculate_condition(128, (((((char)(CmpF(__double_as_longlong(fabs(a1)), 32767.0)) >> 5 & 3 | fabs(a1) < 32767.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(fabs(a1))) * 0x10000000, 0, 0);
        if (!(v3 & 1))
        {
LABEL_4fe90:
            v4 = (int)a1;
            if ((double)(int)v4 == a1)
            {
                v5 = arm64g_calculate_condition(144, (((((char)(CmpF(__double_as_longlong(fabs(a2)), 32767.0)) >> 5 & 3 | fabs(a2) < 32767.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(fabs(a2))) * 0x10000000, 0, 0);
                if (!(v5 & 1))
                    return 0xffffffff;
                goto LABEL_4fedc;
            }
        }
    }
    v4 = 0x80000000;
    v6 = arm64g_calculate_condition(128, (((((char)(CmpF(__double_as_longlong(fabs(a2)), 32767.0)) >> 5 & 3 | fabs(a2) < 32767.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(fabs(a2))) * 0x10000000, 0, 0);
    if (v6 & 1)
        return 0xffffffff;
LABEL_4fedc:
    v7 = (int)a2;
    v8 = (double)(int)v7;
    v9 = (((((isunordered(v8, a2) ? 2 : v8 == a2 ? 2 : 0) | v8 < a2) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v8, a2)) * 0x10000000;
    if (v8 != a2)
        return 0xffffffff;
    if (v7 & 0x7fffffff)
    {
        v10 = arm64g_calculate_condition(16, v9, 0, 0);
        v11 = 3;
        v12 = (v10 & 1 ? v1 & 0xffffffff : 0x40000000);
        v13 = (v10 & 1 ? 0x80000000 : 0);
        v14 = arm64g_calculate_condition(19, v12, v13, 0);
        if (!(v14 & 1))
            goto LABEL_4fefe;
LABEL_4fefd:
        v17 = arm64g_calculate_condition(v11 | 16, v12, v13, 0);
        v18 = 3;
        v19 = (v17 & 1 ? v4 & 0xffffffff : 0x40000000);
        v20 = (v17 & 1 ? 0x80000000 : 0);
        v21 = arm64g_calculate_condition(19, v19, v20, 0);
        if (!(v21 & 1))
            return 0xffffffff;
    }
    else
    {
        v15 = arm64g_calculate_condition(16, v9, 0, 0);
        v11 = 0;
        v12 = (v15 & 1 ? v1 & 0xffffffff : 0x40000000);
        v13 = (v15 & 1 ? 0x80000000 : 0);
        v16 = arm64g_calculate_condition(16, v12, v13, 0);
        if (v16 & 1)
            goto LABEL_4fefd;
LABEL_4fefe:
        v22 = arm64g_calculate_condition(v11 | 16, v12, v13, 0);
        v18 = 0;
        v19 = (v22 & 1 ? v4 & 0xffffffff : 0x40000000);
        v20 = (v22 & 1 ? 0x80000000 : 0);
        v23 = arm64g_calculate_condition(16, v19, v20, 0);
        if (!(v23 & 1))
            return 0xffffffff;
    }
    if (v7 >> 31 & 1)
    {
        v18 = 3;
        v19 = v4 & 0xffffffff;
        v20 = v1 & 0xffffffff;
        if ((int)v1 < (int)v4)
            return 0;
    }
    if (1 <= (int)v7)
    {
        v24 = arm64g_calculate_condition(v18 | 160, v19, v20, 0);
        v25 = arm64g_calculate_condition(179, (v24 & 1 ? v4 & 0xffffffff : 0), (v24 & 1 ? v1 & 0xffffffff : 0), 0);
        if (v25 & 1)
            return 0;
    }
    else
    {
        v26 = arm64g_calculate_condition(v18 | 160, v19, v20, 0);
        v27 = arm64g_calculate_condition(176, (v26 & 1 ? v4 & 0xffffffff : 0), (v26 & 1 ? v1 & 0xffffffff : 0), 0);
        if (v27 & 1)
            return 0;
    }
    return (unsigned int)((v4 - v1) / v7) + 1;
}
