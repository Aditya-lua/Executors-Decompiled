/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e9cf0..0x9e9fc4 (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9e9cf0(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, unsigned long long a7, unsigned long a8, long long a9, long long a10)
{
    long long v7;  // x22
    long long v8;  // x24
    long long v9;  // x0
    long long v10;  // x26
    unsigned long long v11;  // x8
    long long v12;  // x26
    unsigned int v13;  // w0
    int v14;  // w9
    unsigned int v0;  // [bp-0x8c]
    unsigned int v1;  // [bp-0x88]
    long long v2;  // [bp-0x78]
    long long v3;  // [bp-0x70]
    long long v4;  // [bp-0x70]
    long long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]

    v6 = &a8;
    if (!a0)
    {
        return 0;
    }
    else if (a1)
    {
        v7 = a3;
        sub_9de064(a9);
        v8 = a2;
        if (a2)
        {
            v9 = v7;
            if (!v9)
                goto LABEL_9e9d88;
LABEL_9e9d58:
            v3 = v9;
            v5 = a5;
            if (!a5)
                goto LABEL_9e9d98;
LABEL_9e9d60:
            v2 = a6;
            v4 = v3;
            if (!a6)
                goto LABEL_9e9db0;
LABEL_9e9d68:
            v10 = 0;
            if (v8)
                goto LABEL_9e9dc8;
        }
        else
        {
            v8 = sub_9de208(a9);
            v9 = v7;
            if (v9)
                goto LABEL_9e9d58;
LABEL_9e9d88:
            v9 = sub_9de208(a9);
            v3 = v9;
            v5 = a5;
            if (a5)
                goto LABEL_9e9d60;
LABEL_9e9d98:
            v9 = v3;
            v5 = sub_9de208(a9);
            v2 = a6;
            v3 = v9;
            v4 = v9;
            if (a6)
                goto LABEL_9e9d68;
LABEL_9e9db0:
            v2 = sub_9de208(a9);
            v10 = 0;
            v3 = v4;
            v9 = v4;
            if (v8)
            {
                v10 = 0;
LABEL_9e9dc8:
                if (v9 && v5 && v2)
                {
                    if ((int)a7 > 0xfff)
                    {
                        v11 = 44;
                        v12 = 201;
                        if (!a5)
                            goto LABEL_9e9e20;
                        goto LABEL_9e9e48;
                    }
                    if ((int)a7 > 0xbff)
                    {
                        v11 = 41;
                        v12 = 171;
                        if (!a5)
                            goto LABEL_9e9e20;
                        goto LABEL_9e9e48;
                    }
                    else if ((int)a7 >= 0x800)
                    {
                        v11 = 38;
                        v12 = 141;
                        if (!a5)
                        {
LABEL_9e9e20:
                            v1 = v11;
                            v11 = v1;
                            if (!sub_9e9188(v5, v12, 0, 1, 0, a9))
                                goto LABEL_9e9efc;
                        }
LABEL_9e9e48:
                        if (a6 || sub_9e9188(v2, v12, 0, 1, 0, a9))
                        {
                            if (sub_9e9fc4(v5, v8, a9, v11, a10) && sub_9e9fc4(v2, v3, a9, v11, a10))
                            {
                                v8 = v8;
                                v0 = sub_9e46a8(v8);
                                v13 = sub_9e46a8(v3);
                                if (0xbff < (unsigned int)a7)
                                    v14 = 1518;
                                else
                                    v14 = 1007;
                                if (0xfff < (int)a7)
                                    v14 = 2030;
                                if ((int)(v13 + v0) > v14)
                                    goto LABEL_9e9efc;
                                v10 = sub_9ea080(a0, a1, a4, v8, v3, a7, a8, a9, a10) != 0;
                            }
                            else
                            {
                                v10 = 0;
                            }
                        }
                        else
                        {
LABEL_9e9efc:
                            v10 = 0;
                        }
                    }
                    else
                    {
                        v10 = 0;
                    }
                }
            }
        }
        if (a2)
        {
            if (!v7)
                goto LABEL_9e9fa4;
LABEL_9e9f60:
            if (!a5)
                goto LABEL_9e9fac;
LABEL_9e9f64:
            if (!a6)
                goto LABEL_9e9fb8;
        }
        else
        {
            sub_9e4cf0(v8);
            if (v7)
                goto LABEL_9e9f60;
LABEL_9e9fa4:
            sub_9e4cf0();
            if (a5)
                goto LABEL_9e9f64;
LABEL_9e9fac:
            sub_9e4cf0(v5);
            if (!a6)
            {
LABEL_9e9fb8:
                sub_9e4cf0(v2);
            }
        }
        sub_9de17c(a9);
        return v10;
    }
    else
    {
        return 0;
    }
}
