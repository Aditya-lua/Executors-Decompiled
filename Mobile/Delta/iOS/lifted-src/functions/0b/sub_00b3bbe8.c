/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3bbe8..0xb3be28 (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b3bbe8(long long a0, long long a1, long long a2, long long a3, long long *a4)
{
    long long v3;  // x0
    long long v4;  // x24
    long long v13;  // x0
    long long v14;  // x0
    long long v16;  // w0
    long long v5;  // x22
    long long v6;  // x0
    long long v7;  // x25
    long long v8;  // x19
    long long v9;  // x22
    long long v10;  // x27
    long long v11;  // x0
    long long v12;  // x28
    long long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0)
        return 0;
    v3 = sub_9ffdd0();
    if (v3)
    {
        v4 = v3;
        v5 = sub_962b90(a0);
        v6 = sub_975ff4(a0);
        if (v6)
        {
            v7 = v6;
            v8 = sub_9dddcc(sub_a19700(a0));
            if (v8)
            {
                v5 = v5;
                if (a1)
                {
                    v9 = 0;
                    v0 = 0;
                    v10 = 0;
                }
                else
                {
                    v10 = sub_a6fbc4(a2, "pub");
                    v0 = sub_a6fbc4(a2, "qx");
                    v9 = sub_a6fbc4(a2, "qy");
                    if (!v10)
                        goto LABEL_b3bd48;
                }
                v11 = sub_a1dbcc(v4, v7, sub_9d4f84(a0), a4, v8);
                if (v11 && sub_a6f968(a1, v10, "pub", *a4, v11))
                {
LABEL_b3bd48:
                    if (v0 || v9)
                    {
                        v12 = v9;
                        if (v0)
                        {
                            v13 = sub_9de208(v8);
                            if (v13)
                                goto LABEL_b3bd80;
                        }
                        else
                        {
                            v13 = 0;
LABEL_b3bd80:
                            if (v12)
                            {
                                v14 = sub_9de208(v8);
                                if (v14)
                                    goto LABEL_b3bd9c;
                            }
                            else
                            {
                                v14 = 0;
LABEL_b3bd9c:
                                if (sub_a1b3cc(v4, v7, v13, v14, v8) && (!v0 || sub_a6fa7c(a1)) && (!v12 || sub_a6fa7c(a1, v12, "qy", v14)))
                                    goto LABEL_b3bc80;
                            }
                        }
                    }
                    else
                    {
LABEL_b3bc80:
                        if (!a3)
                        {
                            sub_9dded4(v8);
                            return 1;
                        }
                        else if (v5)
                        {
                            v16 = (unsigned int)sub_a1ab64(v4);
                            if (v16 >= 1 && sub_a6f9cc(a1, a2, "priv", v5, (unsigned long long)(v16 + 7) >> 3))
                            {
                                sub_9dded4(v8);
                                return 1;
                            }
                        }
                        else
                        {
                            sub_9dded4(v8);
                            return 1;
                        }
                    }
                }
            }
            sub_9dded4(v8);
            return 0;
        }
        v8 = 0;
        goto LABEL_b3bc80;
    }
    return 0;
}
