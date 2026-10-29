/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafda74..0xafdc48 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern int g_f14350;
extern int g_f14358;
extern int g_f14360;
extern int g_f14368;
extern int g_f14370;
extern int g_f14378;
extern int g_f14380;
extern int g_f14388;

int sub_afda74(int *a0)
{
    int v0;  // x12
    int v1;  // x14
    int v2;  // x16
    int v3;  // x17
    int v4;  // x2
    int v5;  // x4
    int v6;  // x5
    unsigned long long *iter;  // x0
    int v8;  // x6
    int v9;  // w7

    v0 = *(long long *)&g_f14388;
    v1 = *(long long *)&g_f14380;
    v2 = *(long long *)&g_f14378;
    v3 = *(long long *)&g_f14370;
    v4 = *(long long *)&g_f14368;
    v5 = *(long long *)&g_f14360;
    v6 = *(long long *)&g_f14358;
    iter = a0 + 2;
    v8 = *(long long *)&g_f14350;
    while (1)
    {
        v9 = *(int *)((char *)iter - 8);
        if (100 >= v9)
        {
            if (97 >= v9)
            {
                if (v9 != 96)
                {
                    if (v9 == 97)
                    {
                        if (!v0)
                        {
                            *(unsigned long long *)&g_f14388 = *iter;
                            v0 = *(long long *)&g_f14388;
                            goto LABEL_afdac4;
                        }
                        else if (v0 != *iter)
                        {
                            return 0;
                        }
                    }
                    else
                    {
                        if (!v9)
                            return 1;
                    }
                }
                else
                {
                    if (!v4)
                    {
                        *(unsigned long long *)&g_f14368 = *iter;
                        v4 = *(long long *)&g_f14368;
                        iter += 2;
                        continue;
                    }
                    else if (v4 != *iter)
                    {
                        return 0;
                    }
                }
            }
            else
            {
                if (v9 != 98)
                {
                    if (v9 == 99)
                    {
                        if (!v2)
                        {
                            *(unsigned long long *)&g_f14378 = *iter;
                            v2 = *(long long *)&g_f14378;
                            iter += 2;
                            continue;
                        }
                        else if (v2 != *iter)
                        {
                            return 0;
                        }
                    }
                }
                else
                {
                    if (!v6)
                    {
                        *(unsigned long long *)&g_f14358 = *iter;
                        v6 = *(long long *)&g_f14358;
                        iter += 2;
                        continue;
                    }
                    else if (v6 != *iter)
                    {
                        return 0;
                    }
                }
            }
        }
        if (0x66 >= v9)
        {
            if (v9 != 101)
            {
                if (v9 == 0x66)
                {
                    if (!v5)
                    {
                        *(unsigned long long *)&g_f14360 = *iter;
                        v5 = *(long long *)&g_f14360;
                        iter += 2;
                        continue;
                    }
                    else if (v5 != *iter)
                    {
                        return 0;
                    }
                }
            }
            else
            {
                if (!v8)
                {
                    *(unsigned long long *)&g_f14350 = *iter;
                    v8 = *(long long *)&g_f14350;
                    iter += 2;
                    continue;
                }
                else if (v8 != *iter)
                {
                    return 0;
                }
            }
            goto LABEL_afdac4;
        }
        if (v9 != 103)
        {
            if (v9 == 104)
            {
                if (v1)
                {
                    if (v1 != *iter)
                        return 0;
                }
                else
                {
                    *(unsigned long long *)&g_f14380 = *iter;
                    v1 = *(long long *)&g_f14380;
                    iter += 2;
                    continue;
                }
            }
            goto LABEL_afdac4;
        }
        else if (v3)
        {
            if (v3 != *iter)
                return 0;
LABEL_afdac4:
            iter += 2;
        }
        else
        {
            *(unsigned long long *)&g_f14370 = *iter;
            v3 = *(long long *)&g_f14370;
            iter += 2;
        }
    }
}
