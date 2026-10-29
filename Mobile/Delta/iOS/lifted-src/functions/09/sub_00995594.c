/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x995594..0x995b38 (1444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_995594(long long index, void* a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v8;  // x22
    char *v9;  // x25
    unsigned long long v18;  // x22
    unsigned long long v19;  // x19
    unsigned int v20;  // w0
    long long v21;  // x8
    unsigned long long v22;  // 4102
    char *v10;  // x23
    long long v11;  // x1
    unsigned long v12;  // x24
    unsigned long long v13;  // x0
    unsigned long v14;  // x27
    long long idx;  // x28
    unsigned long n;  // x26
    unsigned long long v17;  // x0
    char v0;  // [bp-0x100]
    char v1;  // [bp-0xc8]
    char v2;  // [bp-0xc0]
    char v3;  // [bp-0xb5]
    int v4;  // [bp-0xb0]
    unsigned long v5;  // [bp-0x70]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (a2 == 1)
    {
        v8 = *(long long *)(index + 4128);
        v9 = *(long long *)(index + 4288);
        v10 = *(long long *)(index + 4296);
        if (v8 || *(long long *)(index + 4136))
        {
            if ((int)a1[4] == 21)
            {
                _memmove((long long)a1[32], (long long)a1[40], (long long)a1[8]);
                *(long long *)&a1[40] = (long long)a1[32];
                if (*(long long *)&g_10002b0 == v5)
                    return 1;
                ___stack_chk_fail();
            }
            if (*(long long *)(index + 4136))
            {
                v12 = sub_a58044(*(long long *)(index + 4136));
                if ((unsigned int)a3)
                {
LABEL_99569c:
                    v14 = v12 - 7;
                    if (7 < v12)
                        goto LABEL_9956f8;
                    goto LABEL_9956a4;
                }
                goto LABEL_9956d4;
            }
            else
            {
                v13 = sub_a4fbf0(v8);
                if (!(v13 >> 31 & 1))
                {
                    v12 = v13 & 0xffffffff;
                    if ((unsigned int)a3)
                        goto LABEL_99569c;
LABEL_9956d4:
                    if ((unsigned long long)(long long)a1[8] < (unsigned long long)(*(long long *)(index + 4312) + 1))
                    {
                        if (*(long long *)&g_10002b0 == v5)
                            return 0;
                        ___stack_chk_fail();
                    }
                    *(long long *)&a1[8] = (long long)a1[8] - *(long long *)(index + 4312);
                    v14 = v12 - 7;
                    if (v12 <= 7)
                    {
LABEL_9956a4:
                        sub_a368c8();
                        v11 = 159;
                    }
                    else
                    {
LABEL_9956f8:
                        idx = index + 0x1000;
                        n = v12 - 8;
                        _memcpy(v10, v9, n);
                        v10[n] = *(char *)idx ^ v9[n];
                        v10[v14] = *(char *)(idx + 1) ^ v9[v14];
                        *(&v10[v12] - 6) = *(char *)(idx + 2) ^ *(&v9[v12] - 6);
                        *(&v10[v12] - 5) = *(char *)(idx + 3) ^ *(&v9[v12] - 5);
                        *(&v10[v12] - 4) = *(char *)(idx + 4) ^ *(&v9[v12] - 4);
                        *(&v10[v12] - 3) = *(char *)(idx + 5) ^ *(&v9[v12] - 3);
                        *(&v10[v12] - 2) = *(char *)(idx + 6) ^ *(&v9[v12] - 2);
                        *(&v10[v12] - 1) = *(char *)(idx + 7) ^ *(&v9[v12] - 1);
                        v17 = sub_999d2c(index);
                        if (!(unsigned int)v17)
                        {
                            if (*(long long *)&g_10002b0 == v5)
                                return v17;
                            ___stack_chk_fail();
                        }
                        else if (!sub_c68800(&v0, &v3, 5, 0) || !sub_c68d5c(&v0, (int)a1[4], 1) || !sub_c68d5c(&v0, *(int *)a1, 2) || !sub_c68d5c(&v0, *(long long *)(index + 4312) + (long long)a1[8], 2) || !sub_c68eb8(&v0, &v2) || v2 != 5 || !sub_a6eaf8(&v0))
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/record/methods/tls13_meth.c", 180, "tls13_cipher");
                            sub_996e84(index, 80, 0xc0103, 0);
                            sub_a6ed4c(&v0);
                            if (*(long long *)&g_10002b0 == v5)
                                return 0;
                            ___stack_chk_fail();
                        }
                        else if (*(long long *)(index + 4136))
                        {
                            v18 = sub_a57f5c(*(long long *)(index + 4136));
                            if (v18 && sub_a58164(v18, v10, v12) && sub_a58164(v18, &v3, 5) && sub_a58164(v18, (long long)a1[40], (long long)a1[8]) && sub_a58170(v18, &v4, &v1, *(long long *)(index + 4312)))
                            {
                                if ((unsigned int)a3)
                                {
                                    _memcpy((long long)a1[32] + (long long)a1[8], &v4);
                                    *(long long *)&a1[8] = (long long)a1[8] + *(long long *)(index + 4312);
                                }
                                else
                                {
                                    if (sub_a66f20(&v4, (long long)a1[32] + (long long)a1[8]))
                                        goto LABEL_995980;
                                }
                                v19 = 1;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/record/methods/tls13_meth.c", 193, "tls13_cipher");
                                sub_996e84(index, 80, 0xc0103, 0);
LABEL_995980:
                                v19 = 0;
                            }
                            sub_a57f0c(v18);
                            if (*(long long *)&g_10002b0 == v5)
                                return v19;
                            ___stack_chk_fail();
                        }
                        else if (sub_a2d030(v8))
                        {
                            v20 = sub_a4fdf4();
                            if ((int)sub_a4c694(v8, 0, 0, 0, v10, a3) < 1 || !(unsigned int)a3 && (int)sub_a4d5dc(v8, 0x11, *(int *)(index + 4312), (long long)a1[32] + (long long)a1[8]) <= 0)
                            {
                                sub_a368c8();
                                v11 = 220;
                            }
                            else if (v20 == 7 && (int)sub_a4c6a0(v8, 0, &v4, 0, (int)a1[8]) < 1 || (int)sub_a4c6a0(v8, 0, &v4, &v3, 5) < 1 || (int)sub_a4c6a0(v8, (long long)a1[32], &v4, (long long)a1[40], (int)a1[8]) < 1 || (int)sub_a4ca14(v8, (long long)a1[32] + v4, &v1) < 1)
                            {
                                if (*(long long *)&g_10002b0 == v5)
                                    return 0;
                                ___stack_chk_fail();
                            }
                            else
                            {
                                v21 = v1 + v4;
                                v17 = (long long)a1[8] == v21;
                                if (!(unsigned int)a3)
                                {
                                    if (*(long long *)&g_10002b0 == v5)
                                        return v17;
                                    ___stack_chk_fail();
                                }
                                else
                                {
                                    v22 = arm64g_calculate_condition(20, (long long)a1[8], v21, 0);
                                    if (v22 & 1)
                                    {
                                        if (*(long long *)&g_10002b0 == v5)
                                            return v17;
                                        ___stack_chk_fail();
                                    }
                                    else if ((int)sub_a4d5dc(v8, 16, *(int *)(index + 4312), (long long)a1[32] + v21) > 0)
                                    {
                                        *(long long *)&a1[8] = (long long)a1[8] + *(long long *)(index + 4312);
                                        if (*(long long *)&g_10002b0 == v5)
                                            return 1;
                                        ___stack_chk_fail();
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        v11 = 247;
                                    }
                                }
                            }
                        }
                        else
                        {
                            sub_a368c8();
                            v11 = 213;
                        }
                    }
                }
                else
                {
                    sub_a368c8();
                    v11 = 140;
                }
            }
        }
        else
        {
            sub_a368c8();
            v11 = 116;
        }
    }
    else
    {
        sub_a368c8();
        v11 = 107;
    }
    sub_a369bc("ssl/record/methods/tls13_meth.c", v11, "tls13_cipher");
    sub_996e84(index, 80, 0xc0103, 0);
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
