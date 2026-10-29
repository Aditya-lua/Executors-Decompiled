/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab4904..0xab5158 (2132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab4904_2 {
    char padding_0[24];
    struct st_ab4904_0 *field_18;
    char padding_20[32];
    long long field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    long long field_60;
    char padding_68[32];
    long long field_88;
    char padding_90[20];
    char field_a4;
    char padding_a5[3];
    char field_a8;
    char padding_a9[7];
    long long field_b0;
    long long field_b8;
    char padding_c0[16];
    long long field_d0;
} st_ab4904_2;

typedef struct st_ab4904_0 {
    char padding_0[48];
    struct st_ab4904_1 *field_30;
} st_ab4904_0;

typedef struct st_ab4904_1 {
    unsigned long long field_0;
} st_ab4904_1;

extern char g_10002b0;

unsigned long long sub_ab4904(long long a0, long long a1, st_ab4904_2 *a2, long long a3)
{
    long long v4;  // x23
    long long v5;  // x24
    long long *v14;  // x20
    unsigned int v15;  // w0
    unsigned long long v16;  // x0
    long long v6;  // x26
    unsigned long long v7;  // x0
    unsigned long long v8;  // w0
    unsigned long long v9;  // 4122
    unsigned long long v10;  // x20
    unsigned long long v11;  // x0
    unsigned long long v12;  // x28
    unsigned long long v13;  // x23
    unsigned long long v0;  // [bp-0x88]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    v1 = *(long long *)&g_10002b0;
    sub_9de064(a3);
    v5 = sub_9de208(a3);
    sub_9de208(a3);
    v6 = sub_9de208(a3);
    v7 = sub_9de208(a3);
    if (v7)
    {
        v0 = v7;
        if (*(int *)&a2->padding_0[16] == 1)
        {
            v8 = (unsigned int)sub_ad69e4(a2->field_88);
            v9 = arm64g_calculate_condition(49, v8 - 4, 3, 0);
            if (!(v9 & 1))
            {
                if (a2->field_a4 >> 2 & 1)
                    goto LABEL_ab4d88;
                goto LABEL_ab49ac;
            }
        }
        else
        {
            v8 = 0;
            if (!(a2->field_a4 >> 2 & 1))
            {
LABEL_ab49ac:
                v10 = 1;
                goto LABEL_ab49b0;
            }
LABEL_ab4d88:
            v11 = sub_9e4958();
            if (v11)
            {
                v12 = v11;
                sub_9e5cb4();
                if (sub_9e6fac(&a2->field_b0, a2->field_d0, v12, a3) && !(sub_9e5cb4(v12, a2->field_48, 4), !sub_9e6fac(&a2->field_b8, a2->field_d0, v12, a3)))
                {
                    v4 = v4;
                    if (v8)
                    {
                        v13 = 0;
                        do
                        {
                            v14 = sub_ad69f8(a2->field_88, v13);
                            sub_9e5cb4(v12, *v14, 4);
                            if (!sub_9e6fac(v14 + 4, a2->field_d0, v12, a3))
                                goto LABEL_ab4ffc;
                        } while ((v13 = (unsigned int)v13 + 1, v8 != (unsigned int)v13));
                    }
                    sub_9e48d4(v12);
                    v10 = 1;
                    if (!v8 && a2->field_18->field_30 == sub_9defb0)
                    {
                        v15 = sub_9e46a8(a2->field_48);
                        v10 = v15 != sub_9e46a8(a2->field_40);
                    }
LABEL_ab49b0:
                    if (!(a2->field_a4 >> 1 & 1) || sub_9e6fac(&a2->field_a8, a2->field_d0, *(long long *)&a2->padding_20[8], a3))
                    {
                        if (v10 & 1)
                        {
                            v16 = sub_9e4958();
                            if (v16)
                            {
                                v12 = v16;
                                sub_9e5cb4();
                                if (sub_9de520(0, v5, v12, a2->field_48, a3))
                                {
                                    v4 = v4;
                                    if (sub_9e4958())
                                    {
                                        sub_9e5cb4();
                                        a2->field_18->field_30();
                                    }
                                }
                                goto LABEL_ab4ffc;
                            }
                        }
                        else if (sub_9e6b70(v6, a1, a2->field_b8, a3) && sub_9e6bf4(v6, v6, a2->field_b8, a3) && sub_9e6b70(v5, a1, a2->field_b0, a3) && sub_9e6bf4(v5, v5, a2->field_b0, a3) && sub_9e073c(v6, v6, a2->field_58, a2->field_48, a2->field_b8, v5, v5, a2->field_50, a2->field_40, a2->field_b0, a3) && sub_9e620c(v5, v5, v6, a2->field_40) && sub_9e6bf4(v5, v5, a2->field_b0, a3) && sub_9e671c(v5, v5, a2->field_60, a2->field_b0, a3) && sub_9e7df8(v4, v5, a2->field_48, a3) && sub_9e5f3c(v4, v4, v6, *(long long *)&a2->padding_20[8]))
                        {
                            if (*(long long *)&a2->padding_20[16] && *(long long *)&a2->padding_20[8])
                            {
                                if (a2->field_18->field_30 != sub_9defb0)
                                {
                                    sub_9e5708(v4);
                                    a2->field_18->field_30();
                                }
                                if (sub_9defb0(v0, v4) && sub_9db58c(v0, v0, a1))
                                {
                                    if (sub_9e4828(v0))
                                        goto LABEL_ab5094;
                                    if (sub_9de520(0, v0, v0, *(long long *)&a2->padding_20[8], a3) && (!sub_9e5c94(v0) || sub_9db29c(v0, v0, *(long long *)&a2->padding_20[8])))
                                    {
                                        if (sub_9e4828(v0))
                                            goto LABEL_ab5094;
                                        if (sub_9e4958())
                                        {
                                            sub_9e5cb4();
                                            a2->field_18->field_30();
                                        }
                                    }
                                }
                            }
                            else
                            {
LABEL_ab5094:
                                sub_9e5708(v4);
                                sub_9de17c(a3);
                                if (*(long long *)&g_10002b0 == v1)
                                    return 1;
                                ___stack_chk_fail();
                            }
                        }
                    }
                }
                else
                {
LABEL_ab4ffc:
                    sub_9e48d4(v12);
                }
            }
        }
    }
    sub_9de17c(a3);
    if (*(long long *)&g_10002b0 == v1)
        return 0;
    ___stack_chk_fail();
}
