/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab0a8c..0xab11bc (1840 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ab0a8c(long long *a0, unsigned long a1, unsigned long a2, unsigned long a3, long long a4, long long a5, long long a6)
{
    unsigned long long v6;  // x19
    unsigned long long v7;  // x0
    unsigned long long v16;  // x22
    long long v17;  // x0
    long long v18;  // x0
    long long v19;  // x1
    unsigned long long v20;  // x21
    unsigned long long v21;  // x21
    unsigned long long v22;  // x1
    long long v23;  // x0
    unsigned long long v24;  // x26
    unsigned long long v25;  // x22
    unsigned long long v8;  // x0
    unsigned long long v26;  // x28
    unsigned long long i;  // w22
    unsigned long v28;  // x1
    long long v29;  // x0
    unsigned long long v30;  // x24
    long long v31;  // x0
    unsigned long long v32;  // x21
    unsigned long v33;  // x1
    long long v34;  // x0
    unsigned long long v35;  // x25
    unsigned long long v9;  // x20
    long long v10;  // x26
    long long v11;  // x24
    unsigned long long v12;  // x27
    long long v13;  // x28
    long long v14;  // x26
    unsigned long long v15;  // x20
    long long v0;  // [bp-0x80], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_9dddcc(a0[1]);
    v3 = v6;
    if (v6)
    {
        v7 = sub_ad61b4(sub_9de064(v6));
        if (v7)
        {
            v2 = v7;
            v8 = sub_ad61b4();
            if (!v8)
            {
                v9 = 0;
                v24 = 0;
                v12 = 0;
                goto LABEL_ab0fe0;
            }
            v9 = v8;
            v10 = sub_9de208(v6);
            v11 = sub_9de208(v6);
            v12 = sub_9de208(v6);
            if (!v12)
            {
LABEL_ab0fd4:
                v24 = 0;
                goto LABEL_ab0fd8;
            }
            v1 = v9;
            sub_9e5d14(v10, 4);
            sub_9e5d14(v11, 4);
            sub_9e5d14(v12, 4);
            if (!sub_9e4c34(v11, a0[5]))
                goto LABEL_ab10c0;
            v0 = v10;
            v13 = sub_ad69f8(a4, 0);
            v14 = sub_ad69f8(a4, 1);
            v15 = v2;
            if ((int)sub_ad69e4(a4) >= 1)
            {
                v16 = 0;
                while (1)
                {
                    if ((unsigned int)v16 == 1)
                    {
                        v18 = v11;
                        v19 = v13;
                        v17 = v14;
                        goto LABEL_ab0c1c;
                    }
                    if ((unsigned int)v16)
                        break;
                    if (!sub_9db58c(v12, v13, sub_9e4624()))
                        goto LABEL_ab0ff8;
                    sub_9e5d14(v12, 4);
                    if (!sub_9e1750(v11, v12, a0[6], v6))
                        goto LABEL_ab10d0;
LABEL_ab0b94:
                    v16 = (unsigned int)v16 + 1;
                    if ((int)sub_ad69e4(a4) <= (int)v16)
                        goto LABEL_ab0ccc;
                }
                v17 = sub_ad69f8(a4, v16);
                v18 = v11;
                v19 = v11;
LABEL_ab0c1c:
                if (!sub_9e7dc8(v18, v19, v17, v6))
                    goto LABEL_ab0ff8;
                v20 = sub_9e4b00(v11);
                if (v20 && sub_ad64b4(v15, v20, sub_ad69e4(v15)))
                    goto LABEL_ab0b94;
LABEL_ab102c:
                v35 = 0;
                v26 = 0;
                v12 = 0;
                v24 = 0;
                v30 = 0;
                v25 = 0;
LABEL_ab1030:
                v6 = v1;
            }
            else
            {
LABEL_ab0ccc:
                if (sub_9db58c(v11, v13, sub_9e4624()) && sub_9db58c(v12, v14, sub_9e4624()))
                {
                    if (!sub_9e7dc8(v0, v11, v12, v6))
                    {
LABEL_ab10c0:
                        v25 = 0;
                        goto LABEL_ab0cb4;
                    }
                    v9 = v1;
                    if ((int)sub_ad69e4(a4) >= 3)
                    {
                        v21 = 2;
                        do
                        {
                            v22 = v21;
                            v23 = sub_ad69f8(a4, v22);
                            v24 = sub_9e4958(v23, v22);
                            if (!v24)
                            {
                                v12 = 0;
                                goto LABEL_ab0fd8;
                            }
                            else if (!sub_9db58c(v24, v23, sub_9e4624(sub_9e5d14(v24, 4), 4)) || !sub_9e7dc8(v0, v0, v24, v6) || !sub_ad64b4(v9, v24, sub_ad69e4(v9)))
                            {
                                v12 = 0;
                                goto LABEL_ab0fd8;
                            }
                        } while ((v21 = (unsigned int)v21 + 1, (int)v21 < (int)sub_ad69e4(a4)));
                    }
                    v25 = sub_9e4988();
                    if (v25)
                    {
                        v26 = sub_9e4988();
                        if (v26 && sub_9de520(0, v25, a0[7], v11, v6) && sub_ad64b4(a5, v25, sub_ad69e4(a5)))
                        {
                            if (sub_9de520(0, v26, a0[7], v12, v6) && sub_ad64b4(a5, v26, sub_ad69e4(a5)))
                            {
                                v9 = v1;
                                if ((int)sub_ad69e4(a4) >= 3)
                                {
                                    i = 2;
                                    do
                                    {
                                        v28 = i - 2;
                                        v29 = sub_ad69f8(v9, v28);
                                        v12 = sub_9e4958(v29, v28);
                                        if (!v12)
                                            goto LABEL_ab0fd4;
                                        if (!sub_9de520(0, v12, a0[7], v29, v6) || !sub_ad64b4(a5, v12, sub_ad69e4(a5)))
                                        {
                                            v24 = 0;
LABEL_ab0fd8:
LABEL_ab0fe0:
                                            v30 = 0;
                                            goto LABEL_ab0fe8;
                                        }
                                        i += 1;
                                    } while (i < (int)sub_ad69e4(a4));
                                }
                                v30 = sub_9e4958();
                                if (v30)
                                {
                                    v31 = sub_ad69f8(a4, 1);
                                    if (!sub_9e1750(v30, v31, sub_ad69f8(a4, 0), v6))
                                        goto LABEL_ab115c;
                                    if (!sub_ad64b4(a6, v30, sub_ad69e4(a6)))
                                    {
LABEL_ab115c:
                                        v25 = 0;
                                        v26 = 0;
LABEL_ab0cbc:
                                        v35 = 0;
                                        goto LABEL_ab0cc4;
                                    }
                                    if ((int)sub_ad69e4(a4) >= 3)
                                    {
                                        v32 = 2;
                                        v15 = v2;
                                        while (1)
                                        {
                                            v33 = (unsigned int)v32 - 2;
                                            v34 = sub_ad69f8(v15, v33);
                                            v0 = sub_9e4958(v34, v33);
                                            if (!v0)
                                                break;
                                            if (sub_9e1750(v0, v34, sub_ad69f8(a4, v32), v3) && sub_ad64b4(a6, v0, sub_ad69e4(a6)))
                                            {
                                                v32 = (unsigned int)v32 + 1;
                                                v35 = 1;
                                                if ((int)v32 >= (int)sub_ad69e4(a4))
                                                {
                                                    v20 = 0;
                                                    goto LABEL_ab1030;
                                                }
                                            }
                                            else
                                            {
                                                v20 = 0;
                                                v35 = 0;
                                                goto LABEL_ab1030;
                                            }
                                        }
LABEL_ab10d0:
LABEL_ab1004:
                                        v20 = 0;
                                        goto LABEL_ab102c;
                                    }
                                    else
                                    {
                                        v25 = 0;
                                        v26 = 0;
                                        v30 = 0;
                                        v35 = 1;
                                        v12 = 0;
                                        v24 = 0;
                                        v20 = 0;
LABEL_ab0cc4:
                                        v15 = v2;
                                        v6 = v1;
                                        goto LABEL_ab1034;
                                    }
                                }
                                else
                                {
                                    v24 = 0;
                                    v12 = 0;
                                    v26 = 0;
                                    v25 = 0;
LABEL_ab0fe8:
                                    v20 = 0;
                                    v35 = 0;
                                    v15 = v2;
                                    v6 = v9;
                                    goto LABEL_ab1034;
                                }
                                goto LABEL_ab1034;
                            }
                            else
                            {
                                v25 = 0;
                            }
                        }
                    }
                    else
                    {
LABEL_ab0cb4:
                        v26 = 0;
                    }
                    v30 = 0;
                    goto LABEL_ab0cbc;
                }
LABEL_ab0ff8:
                goto LABEL_ab1004;
            }
        }
        else
        {
            v6 = 0;
            v15 = 0;
LABEL_ab0c74:
            v24 = 0;
            v12 = 0;
            v25 = 0;
            v26 = 0;
            v30 = 0;
            v20 = 0;
            v35 = 0;
        }
    }
    else
    {
        goto LABEL_ab0c74;
    }
LABEL_ab1034:
    sub_9e48d4();
    sub_9e48d4(v12);
    sub_9e48d4(v24);
    sub_9e48d4(v20);
    sub_ad6958(v15, sub_9e48d4);
    sub_ad6958(v6, sub_9e48d4);
    sub_9de17c(v3);
    sub_9dded4(v3);
    sub_9e4838(v25);
    sub_9e4838(v26);
    sub_9e4838(v30);
    return v35;
}
