/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa39eec..0xa3a0a8 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a39eec(long long a0, long long a1, long long a2, long long *a3)
{
    long long v2;  // x22
    long long v3;  // x0
    long long v4;  // w0
    long long v6;  // x19
    long long v7;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_975ffc();
    v3 = sub_9d500c(a0);
    if (a1 > 110)
    {
        if (0x77 < a1)
        {
            switch (a1)
            {
            case 120:
                *a3 = v2;
                sub_9d3d2c(a0, 1);
                return 1;
            case 148:
                if (sub_9880e0(a0))
                {
                    sub_9d3d24(a0, a3);
                    return 1;
                }
                break;
            default:
                return sub_9d46fc();
            }
        }
        else if (a1 == 111)
        {
            v4 = (unsigned int)sub_a3fe04(v2, a3, 0);
            if (1 > v4)
                return v4;
            sub_9d3d2c(a0, 1);
            return v4;
        }
        else if (a1 != 112)
        {
            return sub_9d46fc();
        }
        else if (sub_9880e0(a0))
        {
            *a3 = sub_a2d030(v2);
            return 1;
        }
    }
    else
    {
        if (a1 != 1)
        {
            if (a1 != 12)
            {
                if (a1 == 101)
                {
                    sub_9d3d58(a0, 15);
                    v6 = sub_9d46fc(v3, 101, a2, a3);
                    sub_9d5054(a0);
                    return v6;
                }
                return sub_9d46fc();
            }
            else
            {
                if (sub_a40520(sub_975ffc(a3), v2))
                {
                    sub_9d3d2c(a0, 1);
                    return 1;
                }
            }
        }
        else
        {
            if (sub_9880e0(a0))
            {
                v7 = (unsigned int)sub_a3fe04(v2, sub_a2d030(v2), 0);
                if (v7 < 1)
                    return v7;
                return sub_9d46fc();
            }
        }
    }
    return 0;
}
