/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad56ec..0xad5840 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ad56ec(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x20
    long long v5;  // x21
    long long v6;  // x0
    long long v7;  // x22
    long long v8;  // x24
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
    else if (!a2)
    {
        return 0;
    }
    else if (a3)
    {
        v2 = sub_9dddcc(a4);
        if (!v2)
            return v2;
        v3 = v2;
        v4 = sub_9e4958();
        if (v4)
        {
            v5 = sub_9e4958();
            if (!v5 || (v6 = sub_9e4958(), !v6))
                goto LABEL_ad57e4;
            v7 = v6;
            if (sub_9dea6c(v5, a2, a0, a1, v3))
            {
                v8 = sub_ad5468(a1, a2, a1, a4, a5);
                if (v8 && sub_9e6404(v4, a3, v8, a1, v3) && sub_9e5e68(v7, v5, v4, a1, v3))
                    goto LABEL_ad5800;
            }
            else
            {
                v8 = 0;
            }
            sub_9e48d4(v7);
            v7 = 0;
        }
        else
        {
            v5 = 0;
LABEL_ad57e4:
            v7 = 0;
            v8 = 0;
        }
LABEL_ad5800:
        sub_9dded4(v3);
        sub_9e4838(v4);
        sub_9e4838(v5);
        sub_9e48d4(v8);
        return v7;
    }
    else
    {
        return 0;
    }
}
