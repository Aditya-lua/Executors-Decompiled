/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98de80..0x98e004 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_98de80(unsigned int a0, unsigned int a1, unsigned long a2, unsigned int *a3, unsigned long long *a4)
{
    unsigned int v0;  // x8
    unsigned int v1;  // x9
    unsigned int v10;  // w16
    unsigned int v11;  // x17
    unsigned int v12;  // x17
    unsigned int v13;  // x2
    unsigned int v14;  // x5
    unsigned int v15;  // w0
    unsigned long v16;  // cc_dep1
    unsigned int v17;  // x15
    unsigned long long v18;  // 4105
    unsigned long long v19;  // 4105
    unsigned int v2;  // w10
    unsigned long v20;  // cc_dep1
    unsigned int v21;  // x12
    unsigned long long v22;  // 4105
    unsigned long long v23;  // 4105
    unsigned int v24;  // x0
    unsigned long v25;  // cc_dep1
    unsigned long long v26;  // x9
    unsigned long long v27;  // 4105
    unsigned long long v28;  // 4105
    unsigned int v3;  // x11
    unsigned int v4;  // x11
    unsigned int v5;  // x12
    unsigned int v6;  // w13
    unsigned int v7;  // x14
    unsigned int v8;  // x14
    unsigned int v9;  // x15

    v0 = a2 + 1;
    if (!a1 && a0 >= v0)
    {
        v1 = 0;
        v2 = 0;
        v3 = a2 + 2;
        if (1)
            goto LABEL_98ded4;
    }
    else
    {
        v1 = 63;
        if (a1 < 63)
            v1 = a1;
        v4 = a0 - v0;
        if (a0 < v0)
            v4 = 0;
        if (a0 < v0 + v1)
            v1 = v4;
        v2 = !v1;
        v3 = a2 + 2;
        if (!a1)
        {
LABEL_98ded4:
            if (a0 >= v3)
            {
                v5 = 0;
                v6 = 0;
                v7 = a2 + 4;
                if (!a1)
                    goto LABEL_98df20;
                goto LABEL_98df3c;
            }
        }
    }
    v5 = 0x3fff;
    if (a1 < 0x3fff)
        v5 = a1;
    v8 = a0 - v3;
    if (a0 < v3)
        v8 = 0;
    if (a0 < v3 + v5)
        v5 = v8;
    v6 = !v5;
    v7 = a2 + 4;
    if (!a1)
    {
LABEL_98df20:
        if (a0 >= v7)
        {
            v9 = 0;
            v10 = 0;
            v11 = a2 + 8;
            if (!a1)
                goto LABEL_98df6c;
            goto LABEL_98df7c;
        }
    }
LABEL_98df3c:
    v9 = 0x3fffffff;
    if (a1 < 0x3fffffff)
        v9 = a1;
    v12 = a0 - v7;
    if (a0 < v7)
        v12 = 0;
    if (a0 < v7 + v9)
        v9 = v12;
    v10 = !v9;
    v11 = a2 + 8;
    if (!a1)
    {
LABEL_98df6c:
        if (a0 >= v11)
        {
            a1 = 0;
            goto LABEL_98dfa0;
        }
    }
LABEL_98df7c:
    v13 = 0x3fffffffffffffff;
    if (a1 >= 0x3fffffffffffffff)
        a1 = v13;
    v14 = a0 - v11;
    if (a0 < v11)
        v14 = 0;
    if (a0 < v11 + a1)
        a1 = v14;
    switch (a1)
    {
    case 0:
        v15 = 0;
        v11 = 0;
        break;
    default:
LABEL_98dfa0:
        v15 = 1;
    }
    if (a1 > v9)
        v10 = 1;
    v16 = v10;
    if (v10)
    {
        v17 = a1;
        v18 = arm64g_calculate_condition(19, v16, 0, 0);
        if (!(v18 & 1))
            goto LABEL_98dfb6;
LABEL_98dfb5:
        v7 = v11;
    }
    else
    {
        v17 = v9;
        v19 = arm64g_calculate_condition(19, v16, 0, 0);
        if (v19 & 1)
            goto LABEL_98dfb5;
LABEL_98dfb6:
    }
    if (v17 > v5)
        v6 = 1;
    v20 = v6;
    if (v6)
    {
        v21 = v17;
        v22 = arm64g_calculate_condition(19, v20, 0, 0);
        if (!(v22 & 1))
            goto LABEL_98dfce;
LABEL_98dfcd:
        v3 = v7;
    }
    else
    {
        v21 = v5;
        v23 = arm64g_calculate_condition(19, v20, 0, 0);
        if (v23 & 1)
            goto LABEL_98dfcd;
LABEL_98dfce:
    }
    if (v21 > v1)
        v2 = 1;
    if (v2 & v6 & v10)
        v24 = v15;
    else
        v24 = 1;
    v25 = v2;
    if (v2)
    {
        v26 = v21;
        v27 = arm64g_calculate_condition(19, v25, 0, 0);
        if (!(v27 & 1))
            goto LABEL_98dfea;
LABEL_98dfe9:
    }
    else
    {
        v26 = v1;
        v28 = arm64g_calculate_condition(19, v25, 0, 0);
        if (v28 & 1)
            goto LABEL_98dfe9;
LABEL_98dfea:
        v3 = v0;
    }
    *(unsigned long long *)a3 = v3;
    *a4 = v26;
    return v24;
}
