/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad55f0..0xad56ec (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ad55f0(long long a0, long long a1, long long a2, long long a3, long long a4)
{
    long long v2;  // x19
    long long v3;  // x20
    long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a4)
    {
        return 0;
    }
    else if (!a3)
    {
        return 0;
    }
    else if (!a1)
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (a2)
    {
        v2 = sub_9dde10();
        if (v2)
        {
            v3 = sub_9e4958();
            if (v3 && sub_9dea6c(v3, a1, a2, a4, v2) && sub_9e6404(v3, a0, v3, a4, v2))
            {
                v4 = sub_9e4958();
                if (!v4)
                {
                    sub_9dded4(v2);
                    sub_9e4838(v3);
                    return v4;
                }
                else if (!sub_9dea6c(v4, v3, a3, a4, v2))
                {
                    sub_9e48d4(v4);
                }
                else
                {
                    sub_9dded4(v2);
                    sub_9e4838(v3);
                    return v4;
                }
            }
        }
        else
        {
            v3 = 0;
        }
        sub_9dded4(v2);
        sub_9e4838(v3);
        return 0;
    }
    else
    {
        return 0;
    }
}
