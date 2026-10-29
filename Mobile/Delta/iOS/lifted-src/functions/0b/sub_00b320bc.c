/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb320bc..0xb323e8 (812 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_b320bc(void* a0, long long a1, unsigned long a2, long long a3)
{
    long long iter;  // x20
    void* v7;  // x19
    long long v16;  // x1
    unsigned long v8;  // x0
    unsigned long v9;  // x0
    unsigned long v10;  // x22
    unsigned long v11;  // x23
    unsigned int v12;  // w8
    unsigned long v13;  // x19
    unsigned long v14;  // x27
    unsigned long v15;  // x28
    unsigned int v0;  // [bp-0xb0]
    char v1;  // [bp-0xa9]
    char v2;  // [bp-0xa8]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    iter = a1;
    v7 = a0;
    v3 = *(long long *)&g_10002b0;
    v8 = sub_a2f9e0();
    if ((unsigned int)v8)
    {
        v8 = sub_b323f4(a0, a3);
        if ((unsigned int)v8)
        {
            v9 = sub_954340(a0 + 8);
            if (v9)
            {
                v10 = (long long)a0[32];
                if (v10)
                {
                    v11 = (long long)a0[48];
                    if (!v11)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kdfs/sshkdf.c", 191, "kdf_sshkdf_derive");
                        v16 = 135;
                    }
                    else if ((long long)a0[72])
                    {
                        v12 = (char)a0[64];
                        if (v12)
                        {
                            v1 = v12;
                            v0 = 0;
                            v8 = sub_a3f728();
                            if (v8)
                            {
                                v13 = v8;
                                if (sub_a3fe04() && sub_a3fe10(v13, v10, (long long)v7[40]) && sub_a3fe10(v13, v11, (long long)v7[56]) && sub_a3fe10(v13, &v1, 1) && sub_a3fe10(v13, (long long)v7[72], (long long)v7[80]) && sub_a3ff7c(v13, &v2, &v0))
                                {
                                    v14 = v0;
                                    if (v14 > a2)
                                    {
                                        goto LABEL_b321f0;
                                    }
                                    else
                                    {
                                        _memcpy(iter);
                                        if (a2 <= v14)
                                            goto LABEL_b323cc;
                                    }
                                    while (1)
                                    {
                                        if (!sub_a3fe04(v13, v9, 0) || !sub_a3fe10(v13, v10, (long long)v7[40]) || !sub_a3fe10(v13, v11, (long long)v7[56]) || !sub_a3fe10(v13, iter, v14) || !sub_a3ff7c(v13, &v2, &v0))
                                            goto LABEL_b323a8;
                                        v15 = v14 + v0;
                                        if (a2 >= v15)
                                        {
                                            _memcpy(iter + v14, &v2);
                                            v8 = 1;
                                            v14 = v15;
                                            if (v14 >= a2)
                                                break;
                                        }
                                        else
                                        {
                                            iter += v14;
LABEL_b321f0:
                                            _memcpy(iter);
LABEL_b323cc:
                                            v8 = 1;
                                            break;
                                        }
                                    }
                                }
                                else
                                {
LABEL_b323a8:
                                    v8 = 0;
                                }
                                sub_a3f73c(v13);
                                sub_a66ec0(&v2, 64);
                                if (*(long long *)&g_10002b0 == v3)
                                    return v8;
                                ___stack_chk_fail();
                            }
                            else
                            {
                                if (*(long long *)&g_10002b0 == v3)
                                    return v8;
                                ___stack_chk_fail();
                            }
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/kdfs/sshkdf.c", 199, "kdf_sshkdf_derive");
                            v16 = 134;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kdfs/sshkdf.c", 195, "kdf_sshkdf_derive");
                        v16 = 133;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/sshkdf.c", 0xbb, "kdf_sshkdf_derive");
                    v16 = 128;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/sshkdf.c", 183, "kdf_sshkdf_derive");
                v16 = 129;
            }
            sub_a36abc(57, v16, 0);
            v8 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return v8;
    ___stack_chk_fail();
}
