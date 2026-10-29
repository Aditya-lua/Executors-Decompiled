/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb41b98..0xb41c24 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b41b98(long long a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    unsigned int v3;  // w0
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4105
    unsigned int v4;  // w0
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4105
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if ((unsigned int)a1 & 131)
    {
        if (!~(a1 & 3))
        {
            v3 = sub_aaf378(a0);
        }
        else
        {
            if (a1 & 1)
            {
                v4 = sub_aaf374(a0);
                if (!((unsigned int)a1 & 2))
                {
                    v5 = arm64g_calculate_condition(v8, v9, v10, v11);
                    v6 = arm64g_calculate_condition(3, (v5 & 1 ? v4 : 0x40000000), 0, 0);
                    v7 = !(v6 & 1);
                    if (!(a1 >> 1 & 1))
                        return !(v6 & 1);
                }
                else
                {
                    v12 = arm64g_calculate_condition(v8, v9, v10, v11);
                    v13 = arm64g_calculate_condition(0, (v12 & 1 ? v4 : 0x40000000), 0, 0);
                    v7 = !(v13 & 1);
                    if (!(a1 >> 1 & 1))
                        return !(v13 & 1);
                }
                if (!v4)
                    return v7;
            }
            else if (!(a1 >> 1 & 1))
            {
                return 1;
            }
            v3 = sub_aaf370(a0);
        }
        return v3 != 0;
    }
    else
    {
        return 1;
    }
}
