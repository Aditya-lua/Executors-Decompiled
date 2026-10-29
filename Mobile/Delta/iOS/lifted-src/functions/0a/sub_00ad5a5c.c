/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad5a5c..0xad5ae8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ad5a5c(long long a0, long long a1, long long a2)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (!a1)
    {
        return 0;
    }
    else if (a2)
    {
        v2 = sub_9dde10();
        if (!v2)
            return v2;
        v3 = sub_9e4958();
        if (v3)
        {
            if (!sub_9dea6c())
            {
                sub_9e48d4(v3);
            }
            else
            {
                sub_9dded4(v2);
                return v3;
            }
        }
        sub_9dded4(v2);
        return 0;
    }
    else
    {
        return 0;
    }
}
