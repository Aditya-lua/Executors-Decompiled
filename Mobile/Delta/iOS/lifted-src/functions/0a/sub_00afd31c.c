/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd31c..0xafd4a0 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern int g_f14300;
extern int g_f14308;
extern int g_f14310;
extern int g_f14318;
extern int g_f14320;
extern int g_f14328;
extern int g_f14330;
extern int g_f14338;
extern int g_f14340;
extern unsigned long long g_f14348;

int sub_afd31c(int *a0)
{
    unsigned long v0;  // x9
    int v1;  // x11
    int v10;  // x21
    int v11;  // w22
    unsigned long v12;  // cc_dep1
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    int v2;  // x13
    int v3;  // x15
    int v4;  // x17
    int v5;  // x2
    int v6;  // x4
    int v7;  // x6
    int v8;  // x19
    unsigned long long *iter;  // x0

    v0 = g_f14348;
    v1 = *(long long *)&g_f14340;
    v2 = *(long long *)&g_f14338;
    v3 = *(long long *)&g_f14330;
    v4 = *(long long *)&g_f14328;
    v5 = *(long long *)&g_f14320;
    v6 = *(long long *)&g_f14318;
    v7 = *(long long *)&g_f14310;
    v8 = *(long long *)&g_f14308;
    iter = a0 + 2;
    v10 = *(long long *)&g_f14300;
    while (1)
    {
        v11 = *(int *)((char *)iter - 8);
        if (44 >= v11)
        {
            if (v11 > 41)
            {
                if (v11 != 42)
                {
                    if (v11 != 43)
                    {
                        if (v11 == 44 && !v2)
                        {
                            v2 = *iter;
                            iter += 2;
                            *(long long *)&g_f14338 = v2;
                            continue;
                        }
                    }
                    else
                    {
                        if (!v6)
                        {
                            v6 = *iter;
                            iter += 2;
                            *(long long *)&g_f14318 = v6;
                            continue;
                        }
                    }
                }
                else
                {
                    if (!v7)
                    {
                        v7 = *iter;
                        iter += 2;
                        *(long long *)&g_f14310 = v7;
                        continue;
                    }
                }
            }
            else
            {
                if (v11 != 40)
                {
                    if (v11 == 41)
                    {
                        if (!v8)
                        {
                            v8 = *iter;
                            iter += 2;
                            *(long long *)&g_f14308 = v8;
                            continue;
                        }
                    }
                    else
                    {
                        if (!v11)
                            break;
                        else
                            goto LABEL_afd380;
                    }
                }
                else
                {
                    if (!v10)
                    {
                        v10 = *iter;
                        iter += 2;
                        *(long long *)&g_f14300 = v10;
                        continue;
                    }
                }
            }
            goto LABEL_afd380;
        }
        if (v11 > 47)
        {
            if (v11 != 48)
            {
                if (v11 != 49)
                {
                    if (v11 == 50 && !v3)
                    {
                        v3 = *iter;
                        iter += 2;
                        *(long long *)&g_f14330 = v3;
                        continue;
                    }
                }
                else
                {
                    if (!v5)
                    {
                        v5 = *iter;
                        iter += 2;
                        *(long long *)&g_f14320 = v5;
                        continue;
                    }
                }
            }
            else
            {
                if (!v4)
                {
                    v4 = *iter;
                    iter += 2;
                    *(long long *)&g_f14328 = v4;
                    continue;
                }
            }
            goto LABEL_afd380;
        }
        v12 = v11;
        if (v11 == 45 && !v1)
        {
            v1 = *iter;
            *(long long *)&g_f14340 = v1;
            goto LABEL_afd380;
        }
        switch (v11)
        {
        case 46:
            v13 = arm64g_calculate_condition(3, v12, 45, 0);
            v14 = arm64g_calculate_condition(20, (v13 & 1 ? v0 : 0), 0, 0);
            if (!(v14 & 1))
                goto LABEL_afd424;
            goto LABEL_afd380;
            break;
        default:
            v15 = arm64g_calculate_condition(3, v12, 45, 0);
            v16 = arm64g_calculate_condition(16, (v15 & 1 ? v0 : 0), 0, 0);
            if (v16 & 1)
            {
LABEL_afd380:
                iter += 2;
            }
            else
            {
LABEL_afd424:
                v0 = *iter;
                iter += 2;
                g_f14348 = v0;
            }
        }
    }
    return 1;
}
