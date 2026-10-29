/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d5358..0x9d5b44 (2028 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d5358_0 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_9d5358_0;

extern char g_9d53c0;
extern st_9d5358_0 g_d2d8c8;

long long sub_9d5358(long long a0, unsigned long a1, unsigned long long *a2, unsigned long long *a3, unsigned int *a4, char *a5, unsigned long long a6)
{
    unsigned int i;  // w9
    char v5;  // x23
    unsigned long long v14;  // 4105
    unsigned int v15;  // w8
    unsigned long v16;  // x8
    unsigned long v17;  // x0
    char *iter;  // x24
    unsigned long v7;  // x28
    unsigned int v8;  // w8
    char *v9;  // x8
    unsigned int v10;  // w9
    char *v11;  // x8
    unsigned long v12;  // cc_dep1
    unsigned long long v13;  // 4105
    unsigned long v0;  // [bp-0x70]
    unsigned long long node;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = 0;
    v0 = 0;
    node = a6;
    v5 = *a5;
    iter = a5 + 1;
    do
    {
        if (!v5)
            break;
        if (!a1 && *a2 <= v0)
            goto LABEL_9d5ad4;
        v7 = v5;
        if ((int)i > 2)
        {
            if (4 < (int)i)
            {
                if (i != 5)
                {
                    if (i != 6)
                        continue;
                    if (83 >= v5 - 37)
                    {
                        goto *((void *)(&(&g_9d53c0)[4 * *(short *)((char *)&(&g_d2d8c8.field_0)[v5] - 74)]));
                    }
                    else
                    {
                        i = 0;
                        goto LABEL_9d53c0;
                    }
                }
                v8 = v5;
                i = 6;
                if (107 >= (int)v8)
                {
                    if (v8 == 76)
                        goto LABEL_9d53b4;
                    if (v8 == 104)
                    {
LABEL_9d53b4:
                        goto LABEL_9d53b8;
                    }
                    else if (!(v8 == 106))
                    {
                        continue;
                    }
                    goto LABEL_9d5614;
                }
                if (v8 == 122)
                    goto LABEL_9d53b4;
                if (v8 == 113)
                {
LABEL_9d5614:
                    goto LABEL_9d53b4;
                }
                if (v8 != 108)
                    continue;
                v9 = iter;
                v10 = *v9;
                v11 = v9 + 1;
                v12 = v10 & 0xff;
                if (v10 == 108)
                {
                    v13 = arm64g_calculate_condition(19, v12, 108, 0);
                    if (!(v13 & 1))
                        goto LABEL_9d558e;
                }
                else
                {
                    v14 = arm64g_calculate_condition(19, v12, 108, 0);
                    if (!(v14 & 1))
                    {
LABEL_9d558e:
                        iter = v11;
LABEL_9d5590:
                        i = 6;
                        goto LABEL_9d53b4;
                    }
                }
                goto LABEL_9d5590;
            }
            if (i != 3)
            {
                if (i != 4)
                    continue;
                if (sub_a69974(v7))
                {
                    i = 4;
                }
                else if (v5 == 42)
                {
                    node += 8;
                    i = 5;
                }
                else
                {
LABEL_9d55dc:
                    i = 5;
                    continue;
                }
LABEL_9d53bc:
                goto LABEL_9d53c0;
            }
            else
            {
                if (v5 == 46)
                {
                    i = 4;
                    goto LABEL_9d53b0;
                }
                goto LABEL_9d55dc;
            }
        }
        else
        {
            if (i)
            {
                if (i != 1)
                {
                    if (i != 2)
                        continue;
                    if (sub_a69974(v7))
                    {
                        i = 2;
                    }
                    else if (v5 == 42)
                    {
                        node += 8;
                        i = 3;
                    }
                    else
                    {
                        i = 3;
                        continue;
                    }
                    goto LABEL_9d53c0;
                }
                else
                {
                    v15 = v5;
                    i = 2;
                    if ((int)v15 > 42)
                    {
                        if (v15 != 43 && v15 != 48 && v15 != 45)
                            continue;
                    }
                    else
                    {
                        if (v15 != 32 && v15 != 35)
                            continue;
                    }
                    i = 1;
                }
LABEL_9d53b8:
                goto LABEL_9d53bc;
            }
            if (v5 == 37)
            {
                i = 1;
LABEL_9d53b0:
                goto LABEL_9d53b4;
            }
            else
            {
                i = 0;
                if (!sub_c65cec(a0, a1, &v0, a2, v7))
                    return 0;
LABEL_9d53c0:
                v5 = *iter;
                iter += 1;
            }
        }
    } while (i != 7);
    if (a1)
        goto LABEL_9d5af8;
LABEL_9d5ad4:
    v16 = *a2 - 1;
    *a4 = v0 > v16;
    if (v0 > v16)
        v0 = v16;
LABEL_9d5af8:
    v17 = sub_c65cec(a0, a1, &v0, a2, 0);
    if (!(unsigned int)v17)
        return v17;
    *a3 = v0 - 1;
    return 1;
}
