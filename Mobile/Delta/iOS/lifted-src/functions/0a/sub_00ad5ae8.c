/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad5ae8..0xad5d28 (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ad5ae8(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    long long v4;  // x0
    long long v5;  // x20
    long long v6;  // x19
    long long v7;  // x0
    long long v8;  // x19
    long long v9;  // x23
    long long v10;  // x24
    long long v11;  // x0
    long long v12;  // x26
    long long v0;  // [bp-0x78]
    long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a4)
    {
        return 0;
    }
    else if (!a3)
    {
        return 0;
    }
    else if (!a2)
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (!a1)
    {
        return 0;
    }
    else if (a5)
    {
        v4 = sub_9dddcc(a6);
        if (!v4)
            return v4;
        v5 = v4;
        v6 = sub_9e4958();
        if (v6 && !(v1 = sub_9e4958(), !v1))
        {
            v0 = sub_9e4958();
            if (v0)
            {
                v7 = sub_9e4958();
                if (v7)
                {
                    v8 = v7;
                    sub_9e5cb4();
                    sub_9e5d14(v6, 4);
                    v9 = v8;
                    if (sub_9dea6c(v6, a2, v8, a0, v5))
                    {
                        v10 = sub_ad5468(a0, a2, a0, a6, a7);
                        if (!v10)
                            goto LABEL_ad5cc8;
                        v6 = v6;
                        v1 = v1;
                        v0 = v0;
                        if (sub_9e6404(v1, v6, v10, a0, v5) && sub_9e6138(v6, a1, v1, a0, v5) && sub_9e7dc8(v0, a5, v9, v5) && sub_9db29c(v1, a4, v0) && !(v11 = sub_9e4958(), !v11))
                        {
                            v12 = v11;
                            if (sub_9dea6c())
                                goto LABEL_ad5cd4;
                            sub_9e48d4(v12);
                        }
                        v12 = 0;
                    }
                    else
                    {
                        v10 = 0;
LABEL_ad5cc8:
                        v12 = 0;
LABEL_ad5ccc:
                    }
                }
                else
                {
                    v10 = 0;
                    v9 = 0;
                    goto LABEL_ad5ccc;
                }
            }
            else
            {
                v0 = 0;
                v10 = 0;
                v12 = 0;
                v9 = 0;
            }
        }
        else
        {
            v1 = 0;
            v0 = 0;
            v10 = 0;
            v12 = 0;
            v9 = 0;
        }
LABEL_ad5cd4:
        sub_9dded4(v5);
        sub_9e48d4(v9);
        sub_9e4838(v6);
        sub_9e4838(v1);
        sub_9e4838(v0);
        sub_9e48d4(v10);
        return v12;
    }
    else
    {
        return 0;
    }
}
