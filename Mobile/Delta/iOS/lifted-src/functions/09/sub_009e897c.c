/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e897c..0x9e8dbc (1088 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9e897c(long long a0, long long a1, long long a2, long long a3, long long a4, long long *a5)
{
    long long v8;  // w25
    long long v9;  // x27
    long long v18;  // w9
    long long v19;  // w8
    long long v20;  // x25
    long long v21;  // x20
    long long v10;  // x21
    long long v11;  // x22
    long long v12;  // x24
    long long v13;  // x28
    long long v14;  // x26
    long long v15;  // w27
    long long v16;  // w27
    long long v17;  // x28
    long long v0;  // [bp-0xa0]
    long long v1;  // [bp-0x94]
    long long v2;  // [bp-0x90]
    long long v3;  // [bp-0x8c]
    long long v4;  // [bp-0x70]
    long long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a1;
    if (!sub_9e5c70())
        return 0;
    sub_9de064(a2);
    v9 = sub_9de208(a2);
    v10 = sub_9de208(a2);
    v11 = sub_9de208(a2);
    v12 = sub_9de208(a2);
    v13 = sub_9de208(a2);
    v5 = sub_9de208(a2);
    v14 = sub_9de208(a2);
    v4 = v13;
    if (!v14 || !sub_9e4c34(v10, a0) || !sub_9ebaf8(v10, 1) || !sub_9e4c34(v11, a0) || !sub_9ebaf8(v11, 3) || sub_9e4828(v11) || sub_9e5c94(v11))
    {
        v17 = 0;
        goto LABEL_9e8a88;
    }
    v15 = -0x1;
    do
    {
        v16 = v15;
        v15 = v16 + 1;
    } while (!sub_9e5748(v10, v16 + 2));
    v1 = v15 + 1;
    if (sub_9ea8ac(v13, v10, v1))
    {
        v17 = sub_9e6c04();
        if (v17 && sub_9e6cc0(v17, a0, a2))
        {
            if (v8)
            {
                if (1 > v8)
                    goto LABEL_9e8b64;
            }
            else
            {
                if (0x800 < (int)sub_9e46a8(a0))
                    v8 = 128;
                else
                    v8 = 64;
            }
            v2 = 0;
            while (1)
            {
                if (!sub_9e93c8(v14, v11, 0, a2) || !sub_9eb9e0(v14, 2))
                    goto LABEL_9e8d74;
                if (a4)
                {
                    if (!sub_9e18c0(v9, v14, a0, a2))
                        goto LABEL_9e8d74;
                    if (!sub_9e5b90(v9))
                    {
                        v19 = 1;
LABEL_9e8b68:
                        v0 = v12;
LABEL_9e8b70:
                        v20 = v5;
                        *(int *)a5 = v19;
                        v21 = 1;
                        break;
                    }
                }
                if (!sub_9defb0(v5, v14, v4, a0, a2, v17))
                    goto LABEL_9e8d74;
                if (!sub_9e5b90(v5) && sub_9e5528(v5, v10))
                {
                    v0 = v12;
                    v18 = v15;
                    if (v1 >= 2)
                    {
                        while (1)
                        {
                            v3 = v18;
                            if (!sub_9e4c34(v12, v5))
                                goto LABEL_9e8a8c;
                            if (!sub_9e6404(v5, v0, v0, a0, a2))
                                goto LABEL_9e8d74;
                            if (!sub_9e5528(v5, v10))
                                break;
                            if (sub_9e5b90(v5))
                                goto LABEL_9e8d24;
                            v18 = v3 - 1;
                            if (v3 == 1)
                                goto LABEL_9e8cd4;
                        }
                    }
                    else
                    {
LABEL_9e8cd4:
                        v0 = v12;
                        v20 = v5;
                        if (!sub_9e4c34(v12, v20))
                        {
                            v21 = 0;
                            break;
                        }
                        if (!sub_9e6404(v20, v0, v0, a0, a2))
                        {
                            v21 = 0;
                            v0 = v12;
                            break;
                        }
                        else if (!sub_9e5b90(v20) && !sub_9e4c34(v12, v5))
                        {
                            goto LABEL_9e8d74;
                        }
LABEL_9e8d24:
                        v19 = a4;
                        if (!v19)
                            goto LABEL_9e8b68;
                        v0 = v12;
                        v9 = v9;
                        if (sub_9ebaf8(v12, 1) && sub_9e18c0(v9, v0, a0, a2))
                        {
                            if (!sub_9e5b90(v9))
                                v19 = 1;
                            else
                                v19 = 2;
                            goto LABEL_9e8b70;
                        }
                        v21 = 0;
LABEL_9e8a8c:
                        v20 = v5;
                        break;
                    }
                }
                if (!sub_9e804c(a3, 1, v2))
                    goto LABEL_9e8d74;
                v2 += 1;
                if (v2 == v8)
                {
LABEL_9e8b64:
                    v19 = 3;
                    goto LABEL_9e8b68;
                }
            }
        }
        else
        {
LABEL_9e8d74:
LABEL_9e8a88:
            v0 = v12;
            goto LABEL_9e8a8c;
        }
    }
    else
    {
        v17 = 0;
        goto LABEL_9e8a88;
    }
    sub_9e4cf0(v9);
    sub_9e4cf0(v10);
    sub_9e4cf0(v11);
    sub_9e4cf0(v0);
    sub_9e4cf0(v4);
    sub_9e4cf0(v20);
    sub_9e4cf0(v14);
    sub_9de17c(a2);
    sub_9e6c64(v17);
    return v21;
}
