/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3ac70..0xb3ad14 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b3ac70(unsigned int a0, unsigned long long a1)
{
    unsigned int v2;  // w0
    unsigned int v3;  // x0
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4105
    unsigned long v12;  // cc_op
    unsigned int v13;  // x0
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4105
    unsigned int v6;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (!v2)
    {
        return 0;
    }
    else if ((unsigned int)a1 & 135)
    {
        if (!(a1 >> 1 & 1))
        {
            if (a1 & 1)
                goto LABEL_b3acd4;
            if (!(a1 >> 2 & 1))
                return 1;
        }
        else
        {
            v3 = sub_975ff4(a0);
            if (!(a1 & 1))
            {
                v4 = arm64g_calculate_condition(v12, v7, v8, v9);
                v5 = arm64g_calculate_condition(4, (v4 & 1 ? v3 : 0x40000000), 0, 0);
                v6 = !(v5 & 1);
                if (a1 & 1)
                    goto LABEL_b3acd0;
            }
            else
            {
                v10 = arm64g_calculate_condition(v12, v7, v8, v9);
                v11 = arm64g_calculate_condition(0, (v10 & 1 ? v3 : 0x40000000), 0, 0);
                v6 = !(v11 & 1);
                if (a1 & 1)
                {
LABEL_b3acd0:
                    if (v3)
                    {
LABEL_b3acd4:
                        v6 = sub_962b90(a0) != 0;
                    }
                }
            }
            v13 = !((unsigned int)a1 & 4) & v6;
            if (!(a1 >> 2 & 1))
            {
                return v13;
            }
            else if (!v6)
            {
                return v13;
            }
        }
        return sub_9ffdd0(a0) != 0;
    }
    else
    {
        return 1;
    }
}
