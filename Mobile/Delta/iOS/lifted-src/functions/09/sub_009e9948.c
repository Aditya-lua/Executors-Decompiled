/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e9948..0x9e9a04 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9e9948(long long a0, long long a1, long long a2, long long a3, long long a4)
{
    long long v2;  // x23
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    sub_9de064(a4);
    v3 = sub_9de208(a4);
    if (v3)
    {
        if (a2)
        {
            if (v2 != a2)
            {
                v2 = v3;
                if (!sub_9e7dc8())
                    goto LABEL_9e99e0;
            }
            else
            {
                v2 = v3;
                if (!sub_9eac28())
                    goto LABEL_9e99e0;
            }
        }
        v4 = sub_9e9a04(0, a0, v2, a3, a4);
    }
    else
    {
LABEL_9e99e0:
        v4 = 0;
    }
    sub_9de17c(a4);
    return v4;
}
