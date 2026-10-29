/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2e128..0x2e228 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2e128_0 {
    char field_0;
} st_2e128_0;


long long sub_2e128(unsigned long a0, unsigned long a1, long long a2, void* a3)
{
    void* v2;  // x9
    long long v3;  // x8
    unsigned long v12;  // cc_dep2
    unsigned int v13;  // w11
    unsigned long long v14;  // 4105
    unsigned long long v15;  // 4105
    unsigned long long v16;  // 4105
    unsigned long long v17;  // 4105
    unsigned long v18;  // x11
    void* v19;  // x3
    unsigned long long v20;  // x12
    unsigned int v21;  // w13
    long long v4;  // x11
    void* v22;  // x14
    unsigned int v23;  // w15
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // cc_dep2
    unsigned int v26;  // w13
    unsigned long long v27;  // 4105
    unsigned long long v28;  // 4105
    unsigned long long v29;  // 4105
    unsigned long long v30;  // 4105
    long long v5;  // x10
    void* v6;  // x9
    long long v7;  // x12
    unsigned int v8;  // w11
    void* v9;  // x13
    unsigned int v10;  // w14
    unsigned long v11;  // cc_dep1
    st_2e128_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_2e128_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a2 < 2)
        return a0;
    v2 = a3 - a0;
    v3 = (unsigned long long)(a2 - 2) >> 1;
    if (v3 < (long long)(v2 >> 3))
        return a0;
    v4 = v2 >> 2;
    v5 = v4 + 1;
    v6 = a0 + v5 * 8;
    v7 = v4 + 2;
    if (a2 > v7)
    {
        v8 = *(int *)v6;
        v9 = v6;
        v10 = (int)v9[8];
        v11 = v8;
        v12 = v10;
        if (v10 < v8)
        {
            v13 = v8;
            v14 = arm64g_calculate_condition(0x33, v11, v12, 0);
            if (!(v14 & 1))
                goto LABEL_2e182;
LABEL_2e181:
            v6 = v9 + 8;
            v16 = arm64g_calculate_condition(0x33, v11, v12, 0);
            if (!(v16 & 1))
                goto LABEL_2e186;
LABEL_2e185:
            v5 = v7;
        }
        else
        {
            v13 = v10;
            v15 = arm64g_calculate_condition(0x33, v11, v12, 0);
            if (v15 & 1)
                goto LABEL_2e181;
LABEL_2e182:
            v17 = arm64g_calculate_condition(0x33, v11, v12, 0);
            if (v17 & 1)
                goto LABEL_2e185;
LABEL_2e186:
        }
        if ((unsigned int)*(int *)a3 > v13)
            return a0;
    }
    else if ((unsigned int)*(int *)v6 < (unsigned int)*(int *)a3)
    {
        return a0;
    }
    v18 = *(long long *)a3;
    while (1)
    {
        v19 = v6;
        *(long long *)a3 = *(long long *)v6;
        if (v3 < v5)
            break;
        v20 = 1 | (v5 * 2 | (unsigned long long)(v5) >> 63) & 0xfffffffffffffffe;
        v6 = a0 + v20 * 8;
        v5 = v5 * 2 + 2;
        if (v5 < a2)
        {
            v21 = *(int *)v6;
            v22 = v6;
            v23 = (int)v22[8];
            v24 = v21;
            v25 = v23;
            if (v23 < v21)
            {
                v26 = v21;
                v27 = arm64g_calculate_condition(0x33, v24, v25, 0);
                if (!(v27 & 1))
                    goto LABEL_2e1ca;
            }
            else
            {
                v26 = v23;
                v28 = arm64g_calculate_condition(0x33, v24, v25, 0);
                if (!(v28 & 1))
                {
LABEL_2e1ca:
                    v30 = arm64g_calculate_condition(0x33, v24, v25, 0);
                    if (!(v30 & 1))
                    {
LABEL_2e1ce:
                        v5 = v20;
LABEL_2e1d0:
                        a3 = v19;
                        if (v26 < (unsigned int)v18)
                            break;
                        else
                            continue;
                    }
LABEL_2e1cd:
                    goto LABEL_2e1d0;
                }
            }
            v6 = v22 + 8;
            v29 = arm64g_calculate_condition(0x33, v24, v25, 0);
            if (!(v29 & 1))
                goto LABEL_2e1ce;
            goto LABEL_2e1cd;
        }
        else
        {
            a3 = v19;
            v5 = v20;
            if ((unsigned int)v18 > (unsigned int)*(int *)v6)
                break;
        }
    }
    *(unsigned long *)v19 = v18;
    return a0;
}
