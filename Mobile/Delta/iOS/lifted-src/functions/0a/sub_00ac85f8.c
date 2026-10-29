/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac85f8..0xac8958 (864 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ac85f8(long long a0, long long a1)
{
    long long v5;  // x25
    long long v6;  // x26
    long long v15;  // x28
    long long v16;  // x22
    long long v17;  // x23
    long long v18;  // x24
    long long v19;  // x0
    long long v7;  // x27
    long long v8;  // x0
    long long v9;  // x28
    long long v10;  // x19
    long long v11;  // x20
    long long v12;  // x0
    long long v13;  // x0
    long long v14;  // x0
    long long v0;  // [bp-0x80]
    long long v1;  // [bp-0x78]
    long long v2;  // [bp-0x70]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_962b90();
    v6 = sub_9ffdd0(a0);
    v7 = sub_c4ba8(v6);
    v8 = sub_a19700(a0);
    if (v5)
    {
        v9 = 524291;
        v10 = sub_a1a56c(v6);
        if (v10)
        {
            v11 = sub_9dddcc(v8);
            if (v11)
            {
                sub_9de064(v11);
                v12 = sub_9de208(v11);
                v13 = sub_9de208(v11);
                v14 = sub_9de208(v11);
                v1 = sub_9de208(v11);
                if (v1)
                {
                    v2 = v14;
                    v0 = v13;
                    v15 = v12;
                    v16 = sub_9e4958();
                    v17 = sub_9e4958(v16);
                    v18 = 258;
                    if (v16 && v17)
                    {
                        if (!sub_9e93c8(v15, v7, 0, v11))
                        {
                            v18 = 273;
                            goto LABEL_ac88a8;
                        }
                        while (1)
                        {
                            if (!sub_a1b804(v6, v10, v15, 0, 0, v11) || !sub_a1b3cc(v6, v10, v2, 0, v11) || !sub_9e5e68(v16, a1, v2, v7, v11))
                            {
                                v18 = 281;
LABEL_ac88a8:
                                v9 = 786691;
                                break;
                            }
                            else if (sub_9e4828(v16))
                            {
LABEL_ac8714:
                                v18 = 273;
                                if (!sub_9e93c8(v15, v7, 0, v11))
                                    goto LABEL_ac88a8;
                            }
                            else
                            {
                                if (sub_9db29c(v0, v16, v15))
                                {
                                    if (!sub_9e5528(v0, v7))
                                        goto LABEL_ac8714;
                                    if (!sub_9db29c(v17, v5, sub_9e4624()) || !sub_a1b9a0(v6, v17, v17, v11) || !sub_9e6404(v1, v5, v16, v7, v11) || !sub_9db58c(v1, v15, v1) || !sub_9e6404(v17, v17, v1, v7, v11))
                                    {
                                        v18 = 302;
                                        goto LABEL_ac88b8;
                                    }
                                    if (sub_9e4828(v17))
                                        goto LABEL_ac8714;
                                    v19 = sub_a1697c();
                                    if (v19)
                                    {
                                        sub_a16acc();
                                        goto LABEL_ac8900;
                                    }
                                    else
                                    {
                                        v9 = 524330;
                                        v18 = 312;
                                        break;
                                    }
                                }
                                else
                                {
                                    v18 = 290;
                                    goto LABEL_ac88a8;
                                }
                                goto LABEL_ac88a8;
                            }
                        }
                    }
                    else
                    {
LABEL_ac88b8:
                        v9 = 524291;
                    }
                }
                else
                {
                    v16 = 0;
                    v17 = 0;
                    v18 = 246;
                }
            }
            else
            {
                v16 = 0;
                v17 = 0;
                v18 = 236;
            }
        }
        else
        {
            v11 = 0;
            v16 = 0;
            v17 = 0;
            v9 = 524304;
            v18 = 231;
        }
    }
    else
    {
        v10 = 0;
        v11 = 0;
        v16 = 0;
        v17 = 0;
        v9 = 113;
        v18 = 226;
    }
    sub_a368c8();
    sub_a369bc("crypto/sm2/sm2_sign.c", v18, "sm2_sig_gen");
    sub_a36abc(53, v9, 0);
    sub_9e48d4(v16);
    sub_9e48d4(v17);
    v19 = 0;
LABEL_ac8900:
    sub_9de17c(v11);
    sub_9dded4(v11);
    sub_a1a254(v10);
    return v19;
}
