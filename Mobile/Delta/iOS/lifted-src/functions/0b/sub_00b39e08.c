/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb39e08..0xb39f30 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b39e08(long long a0, unsigned long long a1, long long a2)
{
    unsigned long long v4;  // x0
    unsigned int v5;  // w0
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4105
    unsigned long v14;  // cc_op
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4105
    unsigned int v8;  // x0
    unsigned int v0;  // [bp-0x40]
    unsigned int v1;  // [bp-0x34]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a2f9e0();
    if (!(unsigned int)v4)
    {
        return v4;
    }
    else if (!((unsigned int)a1 & 7))
    {
        return 1;
    }
    else if (!(a1 >> 2 & 1))
    {
        if (!(a1 >> 1 & 1))
        {
            if (!(a1 & 1))
                return 1;
            goto LABEL_b39eb4;
        }
LABEL_b39e78:
        v1 = 0;
        v0 = 0;
        sub_a02134(a0, &v0, 0);
        if (v0)
        {
            v8 = sub_a01a04(a0) != 0;
LABEL_b39eac:
            if (a1 & 1)
                goto LABEL_b39eb0;
        }
        else
        {
            v8 = 0;
            if (a1 & 1)
            {
LABEL_b39eb0:
                if (!v8)
                    return v8;
LABEL_b39eb4:
                v1 = 0;
                v0 = 0;
                sub_a02134(a0, 0, &v0);
                if (v0)
                    v8 = sub_a01a5c(a0) != 0;
                else
                    v8 = 0;
            }
        }
        if (~((unsigned int)a1 & 3))
        {
            return v8;
        }
        else if (v8)
        {
            return sub_a01ab4(a0) != 0;
        }
        else
        {
            return v8;
        }
    }
    else
    {
        v0 = 0;
        v5 = sub_a018c8(a0, a2, &v0);
        if (!((unsigned int)a1 & 2))
        {
            v6 = arm64g_calculate_condition(v14, v9, v10, v11);
            v7 = arm64g_calculate_condition(3, (v6 & 1 ? v5 : 0x40000000), 0, 0);
            v8 = !(v7 & 1);
            if (a1 >> 1 & 1)
                goto LABEL_b39e74;
            goto LABEL_b39eac;
        }
        else
        {
            v12 = arm64g_calculate_condition(v14, v9, v10, v11);
            v13 = arm64g_calculate_condition(0, (v12 & 1 ? v5 : 0x40000000), 0, 0);
            v8 = !(v13 & 1);
            if (a1 >> 1 & 1)
            {
LABEL_b39e74:
                if (v5)
                    goto LABEL_b39e78;
                goto LABEL_b39eac;
            }
        }
    }
}
