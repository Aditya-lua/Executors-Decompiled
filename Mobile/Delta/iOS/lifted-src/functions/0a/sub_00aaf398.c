/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaf398..0xaafbc0 (2088 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aaf398(void* a0, long long a1)
{
    unsigned int v5;  // w0
    long long v6;  // x1
    unsigned long v15;  // x21
    unsigned long v16;  // cc_dep1
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4110
    long long v19;  // x21
    long long v20;  // x0
    long long v21;  // x0
    unsigned long v22;  // x27
    long long v23;  // x1
    long long *v24;  // x0
    unsigned long v7;  // x19
    long long v25;  // x0
    long long v26;  // x0
    long long v27;  // x0
    unsigned long v28;  // x27
    long long v29;  // x1
    long long *v30;  // x0
    long long *v31;  // x28
    long long v32;  // x0
    unsigned long v8;  // x28
    unsigned long v9;  // x21
    unsigned long v10;  // x20
    unsigned long v11;  // x23
    unsigned long v12;  // x24
    unsigned long v13;  // x20
    unsigned long v14;  // x28
    unsigned long v0;  // [bp-0x78]
    unsigned long v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!(long long)a0[64] || !(long long)a0[72] || !(long long)a0[40] || !(long long)a0[48] || !(long long)a0[56])
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_chk.c", 31, "rsa_validate_keypair_multiprime");
        v6 = 147;
    }
    else if ((int)a0[16] == 1)
    {
        v5 = sub_ad69e4((long long)a0[0x88]);
        if ((int)v5 >= 1 && (int)(v5 + 2) <= (int)sub_ab2a14(sub_9e46a8((long long)a0[40])))
            goto LABEL_aaf49c;
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_chk.c", 40, "rsa_validate_keypair_multiprime");
        v6 = 167;
    }
    else
    {
        v5 = 0;
LABEL_aaf49c:
        v7 = sub_9e4958();
        v8 = sub_9e4958(v7);
        v9 = sub_9e4958(v8);
        v10 = sub_9e4958(v9);
        v11 = sub_9e4958(v10);
        v12 = sub_9dddcc((long long)a0[8]);
        if (v7 && v8 && v9 && v10 && v11 && v12)
        {
            v2 = v10;
            if (sub_9e5b90((long long)a0[48]))
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_chk.c", 60, "rsa_validate_keypair_multiprime");
                sub_a36abc(4, 101, 0);
                v13 = 0;
            }
            else
            {
                v13 = 1;
            }
            if (!sub_9e5c70((long long)a0[48]))
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_chk.c", 64, "rsa_validate_keypair_multiprime");
                sub_a36abc(4, 101, 0);
                v13 = 0;
            }
            if (sub_9e892c((long long)a0[64], v12, a1) != 1)
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_chk.c", 70, "rsa_validate_keypair_multiprime");
                sub_a36abc(4, 128, 0);
                v13 = 0;
            }
            if (sub_9e892c((long long)a0[72], v12, a1) != 1)
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_chk.c", 76, "rsa_validate_keypair_multiprime");
                sub_a36abc(4, 129, 0);
                v13 = 0;
            }
            v0 = v9;
            v1 = v8;
            if (v5)
            {
                v14 = 0;
                do
                {
                    if (sub_9e892c(*(long long *)sub_ad69f8((long long)a0[0x88], v14), v12, a1) != 1)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/rsa/rsa_chk.c", 84, "rsa_validate_keypair_multiprime");
                        sub_a36abc(4, 0xaa, 0);
                        v13 = 0;
                    }
                } while ((v14 = (unsigned int)v14 + 1, v5 != (unsigned int)v14));
            }
            if (sub_9e7dc8(v7, (long long)a0[64], (long long)a0[72], v12))
            {
                v8 = v1;
                if (v5)
                {
                    v15 = 0;
                    do
                    {
                        if (!sub_9e7dc8(v7, v7, *(long long *)sub_ad69f8((long long)a0[0x88], v15), v12))
                            goto LABEL_aafa2c;
                    } while ((v15 = (unsigned int)v15 + 1, v5 != (unsigned int)v15));
                }
                if (sub_9e5528(v7, (long long)a0[40]))
                {
                    sub_a368c8();
                    v16 = v5;
                    if (!v5)
                    {
                        v17 = arm64g_calculate_condition(3, v16, 0, 0);
                        if (!(v17 & 1))
                            goto LABEL_aaf72e;
LABEL_aaf72d:
                        v19 = 127;
                    }
                    else
                    {
                        v18 = arm64g_calculate_condition(3, v16, 0, 0);
                        if (v18 & 1)
                            goto LABEL_aaf72d;
LABEL_aaf72e:
                        v19 = 172;
                    }
                    sub_a369bc();
                    sub_a36abc(4, v19, 0);
                    v13 = 0;
                }
                v20 = sub_9e4624();
                if (!sub_9db58c(v7, (long long)a0[64], v20) || (v21 = sub_9e4624(), !sub_9db58c(v8, (long long)a0[72], sub_9e4624())))
                {
LABEL_aafa2c:
                    goto LABEL_aafb58;
                }
                v9 = v0;
                if (!sub_9e7dc8(v2, v7, v8, v12) || !sub_9e18c0(v11, v7, v8, v12) || !sub_9de520(v11, 0, v2, v11, v12))
                {
LABEL_aafa34:
                    goto LABEL_aafb5c;
                }
                if (v5)
                {
                    v22 = 0;
                    do
                    {
                        v23 = v22;
                        v24 = sub_ad69f8((long long)a0[0x88], v23);
                        v25 = sub_9e4624(v24, v23);
                        if (!sub_9db58c(v9, *v24, v25) || !sub_9e7dc8(v2, v11, v9, v12) || !sub_9e18c0(v11, v11, v9, v12) || !sub_9de520(v11, 0, v2, v11, v12))
                            goto LABEL_aafa34;
                    } while ((v22 = (unsigned int)v22 + 1, v5 != (unsigned int)v22));
                    goto LABEL_aaf868;
                    goto LABEL_aafa34;
                }
LABEL_aaf868:
                if (!sub_9e6404(v7, (long long)a0[56], (long long)a0[48], v11, v12))
                    goto LABEL_aafa34;
                if (!sub_9e5b90(v7))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_chk.c", 157, "rsa_validate_keypair_multiprime");
                    sub_a36abc(4, 123, 0);
                    v13 = 0;
                }
                if ((long long)a0[80] && (long long)a0[88])
                {
                    v13 = v13;
                    if ((long long)a0[96])
                    {
                        v26 = sub_9e4624();
                        if (!sub_9db58c(v7, (long long)a0[64], v26))
                            goto LABEL_aafa2c;
                        if (sub_9de520(0, v8, (long long)a0[56], v7, v12))
                        {
                            if (sub_9e5528(v1, (long long)a0[80]))
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/rsa/rsa_chk.c", 172, "rsa_validate_keypair_multiprime");
                                sub_a36abc(4, 124, 0);
                                v13 = 0;
                            }
                            v27 = sub_9e4624();
                            if (sub_9db58c(v7, (long long)a0[72], v27) && sub_9de520(0, v1, (long long)a0[56], v7, v12))
                            {
                                if (sub_9e5528(v1, (long long)a0[88]))
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/rsa/rsa_chk.c", 186, "rsa_validate_keypair_multiprime");
                                    sub_a36abc(4, 125, 0);
                                    v13 = 0;
                                }
                                if (sub_9e1750(v7, (long long)a0[72], (long long)a0[64], v12))
                                {
                                    v9 = v0;
                                    v8 = v1;
                                    v10 = v2;
                                    if (!sub_9e5528(v7, (long long)a0[96]))
                                        goto LABEL_aafa44;
                                    sub_a368c8();
                                    sub_a369bc("crypto/rsa/rsa_chk.c", 196, "rsa_validate_keypair_multiprime");
                                    sub_a36abc(4, 126, 0);
                                    v13 = 0;
                                    if (v5)
                                        goto LABEL_aafa48;
                                    goto LABEL_aafb60;
                                }
                            }
                        }
                        goto LABEL_aafb50;
                    }
                    else
                    {
                        v9 = v0;
                        v10 = v2;
                        if (v5)
                        {
LABEL_aafa48:
                            v28 = 0;
                            while (1)
                            {
                                v29 = v28;
                                v30 = sub_ad69f8((long long)a0[0x88], v29);
                                v31 = v30;
                                v32 = sub_9e4624(v31, v29);
                                if (!sub_9db58c(v7, *v30, v32))
                                    goto LABEL_aafb50;
                                v8 = v1;
                                if (sub_9de520(0, v8, (long long)a0[56], v7, v12))
                                {
                                    if (sub_9e5528(v8, v31[1]))
                                    {
                                        sub_a368c8();
                                        sub_a369bc("crypto/rsa/rsa_chk.c", 213, "rsa_validate_keypair_multiprime");
                                        sub_a36abc(4, 169, 0);
                                        v13 = 0;
                                    }
                                    if (sub_9e1750(v7, v31[3], *v31, v12))
                                    {
                                        if (sub_9e5528(v7, v31[2]))
                                        {
                                            sub_a368c8();
                                            sub_a369bc("crypto/rsa/rsa_chk.c", 222, "rsa_validate_keypair_multiprime");
                                            sub_a36abc(4, 168, 0);
                                            v13 = 0;
                                        }
                                        v28 = (unsigned int)v28 + 1;
                                        v8 = v1;
                                        v9 = v0;
                                        v10 = v2;
                                        if (v5 == (unsigned int)v28)
                                            break;
                                    }
                                    else
                                    {
                                        v13 = 0xffffffff;
                                        v8 = v1;
                                        v9 = v0;
                                        v10 = v2;
                                        break;
                                    }
                                }
                                else
                                {
LABEL_aafb58:
                                    v9 = v0;
                                    v13 = 0xffffffff;
LABEL_aafb5c:
                                    v10 = v2;
                                    break;
                                }
                            }
                        }
                    }
                }
                else
                {
                    v10 = v2;
LABEL_aafa44:
                    if (v5)
                        goto LABEL_aafa48;
                }
            }
            else
            {
LABEL_aafb50:
                v8 = v1;
                goto LABEL_aafb58;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_chk.c", 54, "rsa_validate_keypair_multiprime");
            sub_a36abc(4, 0x80003, 0);
            v13 = 0xffffffff;
        }
LABEL_aafb60:
        sub_9e48d4(v7);
        sub_9e48d4(v8);
        sub_9e48d4(v9);
        sub_9e48d4(v10);
        sub_9e48d4(v11);
        sub_9dded4(v12);
        return v13;
    }
    sub_a36abc(4, v6, 0);
    return 0;
}
