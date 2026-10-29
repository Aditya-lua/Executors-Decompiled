/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb41a80..0xb41b98 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b41a80(long long a0, long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x0
    long long v3;  // x0
    unsigned long v8;  // 4110
    unsigned long v9;  // cc_dep1
    unsigned long long v10;  // 4105
    unsigned long v11;  // x8
    unsigned long long v12;  // 4112
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long v17;  // 4110
    unsigned int v4;  // w21
    unsigned long v18;  // cc_dep1
    unsigned long long v19;  // 4105
    unsigned long long v20;  // 4112
    unsigned int v5;  // w0
    unsigned int v21;  // w8
    unsigned long v22;  // 4110
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // 4110
    unsigned long long v26;  // 4132
    unsigned long v27;  // x9
    unsigned int v6;  // x23
    long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_97725c(a0);
    v4 = sub_9e5528(v3, sub_97725c(a1));
    v5 = !v4;
    if (!(a2 & 3))
        return !v4;
    if (!(a2 >> 1 & 1))
    {
LABEL_b41ae0:
        if (!(a2 & 1))
        {
            v21 = 0;
        }
        else
        {
            v6 = sub_975fec(a0);
            v7 = sub_975fec(a1);
            if (v6)
            {
                v22 = arm64g_calculate_condition(v13 | 16, v14, v15, v16);
                v23 = 4;
                v24 = (v22 & 1 ? v7 : 0x40000000);
            }
            else
            {
                v25 = arm64g_calculate_condition(v13 | 16, v14, v15, v16);
                v23 = 0;
                v24 = (v25 & 1 ? v7 : 0x40000000);
            }
            v26 = arm64g_calculate_condition(v23 | 16, v24, 0, 0);
            v27 = !(v26 & 1);
            v21 = (unsigned int)v27 ^ 1;
            if (v4)
                v5 = 0;
            else
                v5 = (unsigned int)v27 & 1;
            if (v27 & 1)
                return ((unsigned int)v27 ^ 1) & v5;
            if (!v4)
            {
LABEL_b41b60:
                v5 = !sub_9e5528(v6, v7);
                goto LABEL_b41b7c;
            }
        }
    }
    else
    {
        v6 = sub_962b90(a0);
        v7 = sub_962b90(a1);
        if (v6)
        {
            v8 = arm64g_calculate_condition(v13 | 16, v14, v15, v16);
            v9 = (v8 & 1 ? v7 : 0x40000000);
            v10 = arm64g_calculate_condition(4, v9, 0, 0);
            v11 = !(v10 & 1);
            v12 = arm64g_calculate_condition(4, v9, 0, 0);
            if (!(v12 & 1))
                goto LABEL_b41b14;
        }
        else
        {
            v17 = arm64g_calculate_condition(v13 | 16, v14, v15, v16);
            v18 = (v17 & 1 ? v7 : 0x40000000);
            v19 = arm64g_calculate_condition(0, v18, 0, 0);
            v11 = !(v19 & 1);
            v20 = arm64g_calculate_condition(0, v18, 0, 0);
            if (!(v20 & 1))
            {
LABEL_b41b14:
                if (!v4)
                    goto LABEL_b41b60;
            }
        }
        if (!(v11 & 1))
            goto LABEL_b41ae0;
        v5 = 0;
LABEL_b41b7c:
        v21 = 1;
    }
    return v21 & v5;
}
