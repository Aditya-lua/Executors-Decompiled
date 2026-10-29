/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e91a8..0x9e93c8 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9e91a8(long long a0, long long a1, unsigned long a2, long long a3, long long a4)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x24
    unsigned long long v12;  // x0
    unsigned int v13;  // w25
    unsigned long long v14;  // 4113
    long long v15;  // x1
    unsigned int v4;  // w25
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned int v8;  // w25
    unsigned long long v9;  // 4113
    long long v10;  // x1
    unsigned int v11;  // w25
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_rand.c", 140, "bnrand_range");
        v15 = 786690;
    }
    else if (*(int *)(a2 + 16) || sub_9e4828(a2))
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_rand.c", 145, "bnrand_range");
        v15 = 115;
    }
    else
    {
        v2 = sub_9e46a8(a2);
        if ((unsigned int)v2 == 1)
        {
            sub_9e5b4c(a1);
            return 1;
        }
        v3 = v2;
        if (sub_9e5748(a2, (unsigned int)v2 - 2) || sub_9e5748(a2, (unsigned int)v3 - 3))
        {
            v11 = 0xffffff9c;
            while (1)
            {
                v12 = sub_9e8eec(a0, a1, v3, 0xffffffff, 0, a3, a4);
                if (!(unsigned int)v12)
                    return v12;
                v13 = v11 + 1;
                v14 = arm64g_calculate_condition(33, v11, 1, 0);
                if (v14 & 1)
                    break;
                v11 = v13;
                if (sub_9e5528(a1, a2) >> 31 & 1)
                    return 1;
            }
            sub_a368c8();
            v10 = 193;
        }
        else
        {
            v4 = 0xffffff9c;
            while (1)
            {
                v5 = sub_9e8eec(a0, a1, (unsigned int)v3 + 1, 0xffffffff, 0, a3, a4);
                if (!(unsigned int)v5)
                    return v5;
                if (!(sub_9e5528(a1, a2) >> 31 & 1))
                {
                    v6 = sub_9db58c(a1, a1, a2);
                    if (!(unsigned int)v6)
                    {
                        return v6;
                    }
                    else if (!(sub_9e5528(a1, a2) >> 31 & 1))
                    {
                        v7 = sub_9db58c(a1, a1, a2);
                        if (!(unsigned int)v7)
                            return v7;
                    }
                }
                v8 = v4 + 1;
                v9 = arm64g_calculate_condition(33, v4, 1, 0);
                if (v9 & 1)
                    break;
                v4 = v8;
                if (sub_9e5528(a1, a2) >> 31 & 1)
                    return 1;
            }
            sub_a368c8();
            v10 = 180;
        }
        sub_a369bc("crypto/bn/bn_rand.c", v10, "bnrand_range");
        v15 = 113;
    }
    sub_a36abc(3, v15, 0);
    return 0;
}
