/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb419f4..0xb41a80 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b419f4(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v11;  // 4105
    unsigned long long v12;  // w8
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4105
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // 4110
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a2f9e0();
    if ((unsigned int)v8)
    {
        if (a1 & 3)
        {
            v9 = sub_962b90(a0);
            if (!((unsigned int)a1 & 2))
            {
                v10 = arm64g_calculate_condition(v13, v14, v15, v16);
                v11 = arm64g_calculate_condition(4, (v10 & 1 ? v9 : 0x40000000), 0, 0);
                v12 = (unsigned int)!(v11 & 1);
                if (a1 >> 1 & 1)
                    goto LABEL_b41a34;
            }
            else
            {
                v17 = arm64g_calculate_condition(v13, v14, v15, v16);
                v18 = arm64g_calculate_condition(0, (v17 & 1 ? v9 : 0x40000000), 0, 0);
                v12 = (unsigned int)!(v18 & 1);
                if (a1 >> 1 & 1)
                {
LABEL_b41a34:
                    if (v9)
                        v12 = sub_97725c(a0) != 0;
                }
            }
            v8 = !((unsigned int)a1 & 1) & v12;
            if (a1 & 1 && v12)
                v8 = sub_975fec(a0) != 0;
        }
        else
        {
            v8 = 1;
        }
    }
    return v8;
}
