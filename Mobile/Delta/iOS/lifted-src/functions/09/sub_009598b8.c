/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9598b8..0x9599fc (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9598b8(long long a0, long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x22
    unsigned long long v4;  // x0
    unsigned long long v5;  // x23
    unsigned long long v6;  // w0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad7048(a1, 0, 0, 0, 0);
    if (!v2)
    {
        sub_ad753c(0);
        sub_ad763c(v2);
        return 0;
    }
    v3 = 1;
    if (sub_ad74bc(v2))
    {
        sub_a35af4();
        sub_ad763c(v2);
        return 1;
    }
    while (!sub_ad761c(v2))
    {
        v4 = sub_ad733c(v2);
        if (v4)
        {
            v5 = v4;
            sub_9c7b68();
            switch (v6)
            {
            case 5:
                if (!sub_ad7a44(v5))
                {
                    sub_ad753c(v5);
                    sub_ad763c(v2);
                    return 0;
                }
                else if (!sub_ab1c50())
                {
                    sub_ad753c(v5);
                    sub_ad763c(v2);
                    return 0;
                }
                else
                {
                    v7 = sub_afa39c();
                    if (!v7)
                    {
                        sub_ad753c(v5);
                        sub_ad763c(v2);
                        return 0;
                    }
                    v8 = v7;
                    if (!(sub_ad66d4(a0, v8) >> 31 & 1))
                    {
                        sub_afa390(v8);
                    }
                    else if (!sub_ad68a0(a0, v8))
                    {
                        sub_afa390(v8);
                        sub_ad753c(v5);
                        sub_ad763c(v2);
                        return 0;
                    }
                }
                goto LABEL_959944;
            case 1:
                if (a2 >= 1)
                {
                    v3 = sub_9598b8(a0, sub_ad7a28(v5), 0);
                    goto LABEL_959944;
                }
            default:
LABEL_959944:
                sub_ad753c(v5);
            }
        }
        if (sub_ad74bc(v2))
        {
            sub_a35af4();
            sub_ad763c(v2);
            return v3;
        }
    }
    sub_a35af4();
    sub_ad763c(v2);
    return v3;
}
