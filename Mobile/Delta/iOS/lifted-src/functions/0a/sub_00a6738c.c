/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6738c..0xa674bc (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a6738c(long long a0, long long a1)
{
    long long v3;  // x20
    unsigned long long v4;  // w0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x21
    unsigned long long v7;  // x0
    unsigned long long v8;  // x2
    unsigned long long v9;  // x1
    long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    if (sub_9e5c94(a1))
        return 0;
    v4 = (unsigned int)sub_9e46a8(a1);
    if (v4 < 0)
        v4 += 7;
    v5 = sub_c68d10();
    if (!(unsigned int)v5)
    {
        return v5;
    }
    else if (!sub_c68d5c(v3, 2, 1))
    {
        return 0;
    }
    else
    {
        v6 = ((long long)(v4) >> 3) + 1;
        if ((unsigned int)v6 > 0xffff)
            return 0;
        if ((unsigned int)v6 >= 0x100)
        {
            v7 = sub_c68d5c(v3, 130, 1);
            if (!(unsigned int)v7)
                return v7;
            v8 = 2;
            v9 = v6;
            v10 = v3;
        }
        else
        {
            if ((unsigned int)v6 >= 128)
            {
                v11 = sub_c68d5c(v3, 129, 1);
                if (!(unsigned int)v11)
                    return v11;
            }
            v8 = 1;
            v9 = v6;
            v10 = v3;
        }
        v12 = sub_c68d5c(v10, v9, v8);
        if (!(unsigned int)v12)
            return v12;
        v13 = sub_a6e830(v3, v6, &v0);
        if (!(unsigned int)v13)
            return v13;
        v14 = sub_a6e970(v3);
        if (!(unsigned int)v14)
        {
            return v14;
        }
        else if (!v0 || sub_9e5174(a1) == (unsigned int)v6)
        {
            return 1;
        }
    }
    return 0;
}
