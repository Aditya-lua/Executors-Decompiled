/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4542c..0xa4567c (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a4542c(long long a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x20
    void* v3;  // x0
    long long v13;  // x0
    long long v14;  // x0
    void* v4;  // x19
    long long v5;  // x22
    long long v6;  // x0
    long long v7;  // x25
    long long v8;  // x23
    void* v10;  // x19
    void* v11;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    v3 = sub_9ffdd8();
    if (!(int)v3[280])
        return 0xffffffff;
    if ((int)v3[756] >= 0)
    {
        v4 = sub_9ffdd8(a0);
        if (a1 != a2)
            return 0xffffffff;
        v5 = v2 - 24;
        if ((unsigned long long)v2 < 24)
            return 0xffffffff;
        if ((int)sub_a4d5dc() >= 1)
        {
            v6 = sub_a507c8(a0);
            if (!sub_a94dd8(v4 + 288, v6, (int)v4[756]))
            {
                v7 = a2 + 8;
                v8 = a1 + 8;
                if (sub_a50720(a0))
                {
                    if (!sub_a94fe8(v4 + 288, v7, v8, v5))
                    {
                        sub_a95e44(v4 + 288, v8 + v5, 16);
                        *(unsigned int *)&v4[284] = 0;
                        *(int *)&v4[756] = -0x1;
                        return v2;
                    }
                }
                else
                {
                    if (!sub_a95348(v4 + 288, v7, v8, v5))
                    {
                        sub_a95e44(v4 + 288, sub_a507c8(a0), 16);
                        if (!sub_a66f20(sub_a507c8(a0), v7 + v5, 16))
                        {
                            v2 = v5;
                            *(unsigned int *)&v4[284] = 0;
                            *(int *)&v4[756] = -0x1;
                            return v2;
                        }
                        sub_a66ec0(v8, v5);
                    }
                }
            }
        }
        *(unsigned int *)&v4[284] = 0;
        *(int *)&v4[756] = -0x1;
        return 0xffffffff;
    }
    else if ((int)v3[284])
    {
        if (!a2)
        {
            v11 = v3;
            if (sub_a50720(a0))
            {
                sub_a95e44(v11 + 288, sub_a507c8(a0), 16);
                *(unsigned int *)&v11[748] = 16;
                *(unsigned int *)&v11[284] = 0;
                return 0;
            }
            if ((int)v11[748] >= 0)
            {
                v14 = sub_a507c8(a0);
                v13 = sub_a95d28(v11 + 288, v14, (int)v11[748]);
                if (!(int)v13)
                {
                    *(unsigned int *)&v11[284] = 0;
                    return v13;
                }
            }
        }
        else if (a1)
        {
            v10 = v3;
            if (sub_a50720(a0))
            {
                if (!sub_a94fe8(v10 + 288, a2, a1, v2))
                    return v2;
            }
            else
            {
                if (!sub_a95348(v10 + 288, a2, a1, v2))
                    return v2;
            }
        }
        else if (!sub_a94dd8(v3 + 288, a2, v2))
        {
            return v2;
        }
    }
    return 0xffffffff;
}
