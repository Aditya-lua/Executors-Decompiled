/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa24320..0xa248a0 (1408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a24320(long long *a0, long long a1)
{
    long long v5;  // x0
    long long v6;  // x20
    long long v15;  // x19
    long long v16;  // x26
    long long v17;  // x0
    long long v18;  // x23
    long long v19;  // x25
    long long v20;  // x1
    long long v21;  // x1
    long long v22;  // x1
    long long v7;  // x0
    long long v8;  // x28
    long long v9;  // x0
    long long v10;  // x27
    long long v11;  // x24
    long long v12;  // x0
    long long v13;  // x21
    long long v14;  // x0
    long long v0;  // [bp-0x78]
    long long v1;  // [bp-0x70]
    long long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_9dddcc(a0[21]);
    if (!v5)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_nistz256.c", 1458, "ecp_nistz256group_full_init");
        sub_a36abc(16, 0xc0100, 0);
        return 0;
    }
    v2 = v5;
    if (!sub_a1abf0(a0, a1, 20))
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_nistz256.c", 1463, "ecp_nistz256group_full_init");
        sub_a36abc(16, 0x80010, 0);
        v6 = 0;
        v1 = 0;
        goto LABEL_a24604;
    }
    v6 = sub_9e4db0(a1 + 20, 32, 0);
    if (v6 && !(v1 = sub_9e4db0(a1 + 52, 32, 0), !v1))
    {
        v7 = sub_9e4db0(a1 + 84, 32, 0);
        if (v7)
        {
            v8 = v7;
            v9 = sub_9e6c04();
            v10 = v9;
            if (v9)
            {
                if (!sub_9e70f4(v10, v6, 0x100, a1 + 212, 32, 1, 0))
                    goto LABEL_a247c4;
                v11 = sub_9e4958();
                if (!v11)
                {
                    sub_a368c8();
                    v22 = 1489;
                    goto LABEL_a246f4;
                }
                if (!sub_9e5ca4(v11, sub_9e4624(), v10, v2))
                {
                    sub_a368c8();
                    v22 = 1493;
LABEL_a246f4:
                    sub_a369bc("crypto/ec/ecp_nistz256.c", v22, "ecp_nistz256group_full_init");
                    sub_a36abc(16, 0x80003, 0);
                    goto LABEL_a247d4;
                }
                a0[15] = v10;
                a0[16] = v11;
                if (sub_a271e4(a0, v6, v1, v8, v2))
                {
                    v12 = sub_a1a56c(a0);
                    if (v12)
                    {
                        v0 = v12;
                        v13 = sub_9e4db0(a1 + 116, 32, 0);
                        if (v13 && !(v14 = sub_9e4db0(a1 + 148, 32, 0), !v14))
                        {
                            v15 = v14;
                            if (sub_a1b250(a0, v0, v13, v15, v2))
                            {
                                v16 = sub_9e4db0(a1 + 180, 32, 0);
                                if (v16 && sub_9e4d58(v13, 1))
                                {
                                    v17 = sub_a1a56c(a0);
                                    a0[1] = v17;
                                    if (v17)
                                    {
                                        if (!sub_a1a654() || !sub_9e4c34(a0[2], v16) || !sub_9e4d58(a0[3], 1))
                                            goto LABEL_a24814;
                                        v18 = sub_9e6c04();
                                        if (!v18 || !sub_9e70f4(v18, v16, 0x100, a1 + 244, 32, 3993025615, 3436300458))
                                            goto LABEL_a24818;
                                        a0[18] = v18;
                                        v19 = 1;
                                        v18 = 0;
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        sub_a369bc("crypto/ec/ecp_nistz256.c", 1531, "ecp_nistz256group_full_init");
                                        v20 = 524304;
LABEL_a2480c:
                                        sub_a36abc(16, v20, 0);
LABEL_a24814:
                                        v18 = 0;
LABEL_a24818:
                                        v19 = 0;
                                    }
                                }
                                else
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/ec/ecp_nistz256.c", 1522, "ecp_nistz256group_full_init");
                                    v20 = 524291;
                                    goto LABEL_a2480c;
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/ec/ecp_nistz256.c", 1517, "ecp_nistz256group_full_init");
                                sub_a36abc(16, 0x80010, 0);
                                v19 = 0;
                                v18 = 0;
LABEL_a2477c:
                                v16 = 0;
                            }
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/ec/ecp_nistz256.c", 1513, "ecp_nistz256group_full_init");
                            sub_a36abc(16, 0x80003, 0);
                            v15 = 0;
                            goto LABEL_a2477c;
                        }
                        v10 = 0;
                        v11 = 0;
                        v9 = v0;
                    }
                    else
                    {
                        sub_a368c8();
                        v21 = 1507;
LABEL_a247a0:
                        sub_a369bc("crypto/ec/ecp_nistz256.c", v21, "ecp_nistz256group_full_init");
                        sub_a36abc(16, 0x80010, 0);
                        v10 = 0;
LABEL_a247c4:
                        v11 = 0;
                        v19 = 0;
                        v18 = 0;
                        v13 = 0;
                        v15 = 0;
LABEL_a247d4:
                        v16 = 0;
                        v9 = 0;
                    }
                }
                else
                {
                    sub_a368c8();
                    v21 = 1502;
                    goto LABEL_a247a0;
                }
            }
            else
            {
                v18 = 0;
                v19 = 0;
                v13 = 0;
                v15 = 0;
                v11 = 0;
                v16 = 0;
            }
        }
        else
        {
LABEL_a2457c:
            sub_a368c8();
            sub_a369bc("crypto/ec/ecp_nistz256.c", 1471, "ecp_nistz256group_full_init");
            sub_a36abc(16, 0x80003, 0);
            v10 = 0;
            v19 = 0;
            v18 = 0;
LABEL_a24604:
            v8 = 0;
            v13 = 0;
            v15 = 0;
            v11 = 0;
            v16 = 0;
            v9 = 0;
        }
    }
    else
    {
        v1 = 0;
        goto LABEL_a2457c;
    }
    sub_a1a254(v9);
    sub_9dded4(v2);
    sub_9e6c64(v10);
    sub_9e6c64(v18);
    sub_9e48d4(v6);
    sub_9e48d4(v11);
    sub_9e48d4(v1);
    sub_9e48d4(v8);
    sub_9e48d4(v16);
    sub_9e48d4(v13);
    sub_9e48d4(v15);
    return v19;
}
