/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9eb0e4..0x9eb810 (1836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_9db29c;
extern unsigned long long g_9db58c;

unsigned long long sub_9eb0e4(unsigned long long a0, long long a1, unsigned long a2, long long a3)
{
    unsigned long long v5;  // x20
    long long v6;  // x23
    long long v15;  // x0
    unsigned long long v16;  // x26
    unsigned long long v17;  // w0
    unsigned long long v18;  // 4112
    unsigned long long *v19;  // x8
    long long v20;  // x24
    long long v21;  // x26
    unsigned long long v22;  // 4112
    unsigned long v23;  // cc_dep1
    unsigned long long v24;  // 4109
    long long v7;  // x0
    unsigned long long v25;  // 4109
    unsigned long long v27;  // x0
    unsigned long long v28;  // x22
    long long idx;  // x24
    long long v9;  // x25
    long long v10;  // x26
    unsigned long long v11;  // x0
    unsigned long long v12;  // x27
    unsigned long long v13;  // x21
    unsigned long long v14;  // x28
    long long v1;  // [bp-0x70]
    long long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0;
    if (!sub_9e5c70(a2) || sub_9e5b58(a2, 1))
    {
        if (!sub_9e5b58(a2, 2))
        {
            sub_a368c8();
            sub_a369bc("crypto/bn/bn_sqrt.c", 43, "BN_mod_sqrt");
            sub_a36abc(3, 112, 0);
            return 0;
        }
        v13 = v5;
        if (!v13 && (v13 = sub_9e4958(), !v13))
            goto LABEL_9eb210;
        if (sub_9e4d58(v13, sub_9e5748(a1, 0)))
            return v13;
        if (v13 == v5)
            goto LABEL_9eb208;
        goto LABEL_9eb178;
    }
    if (sub_9e4828(a1) || sub_9e5b90(a1))
    {
        v13 = v5;
        if (!v13 && (v13 = sub_9e4958(), !v13))
        {
LABEL_9eb210:
            v28 = 1;
            if (v13 != v5)
                goto LABEL_9eb21c;
            goto LABEL_9eb224;
        }
        if (sub_9e4d58(v13, sub_9e5b90(a1)))
            return v13;
        if (v13 == v5)
        {
LABEL_9eb208:
            return 0;
        }
LABEL_9eb178:
        sub_9e48d4(v13);
        return 0;
    }
    sub_9de064(a3);
    v6 = sub_9de208(a3);
    v7 = sub_9de208(a3);
    idx = sub_9de208(a3);
    v9 = sub_9de208(a3);
    v10 = sub_9de208(a3);
    v11 = sub_9de208(a3);
    if (!v11)
    {
        v13 = 0;
        goto LABEL_9eb22c;
    }
    v12 = v11;
    v2 = v7;
    v13 = v5;
    if (v13 || (v13 = sub_9e4958(), v13))
    {
        if (!sub_9e5dac(v6, a1, a2, a3))
            goto LABEL_9eb588;
        v14 = 0;
        do
        {
            v14 = (unsigned int)v14 + 1;
        } while (!sub_9e5748(a2, v14));
        if ((unsigned int)v14 != 2)
        {
            v15 = idx;
            if ((unsigned int)v14 == 1)
            {
                goto LABEL_9eb588;
            }
            else if (sub_9e4c34(v15, a2))
            {
                v1 = v10;
                *(unsigned int *)(idx + 16) = 0;
                v16 = 2;
                while (1)
                {
                    if (v16 > 21)
                    {
                        if (!sub_9e9188(v12, sub_9e46a8(a2), 0, 0, 0, a3))
                            goto LABEL_9eb588;
                        if (!(sub_9e53a8(v12, a2) >> 31 & 1))
                        {
                            v19 = &g_9db29c;
                            if (!*(int *)(a2 + 16))
                                v19 = &g_9db58c;
                            v19();
                        }
                        if (!sub_9e4828(v12))
                            goto LABEL_9eb500;
                    }
                    if (!sub_9e4d58(v12, v16))
                        goto LABEL_9eb588;
LABEL_9eb500:
                    v17 = (unsigned int)sub_9e43b0(v12, idx, a3);
                    v18 = arm64g_calculate_condition(177, v17, 1, 0);
                    if (v18 & 1)
                        goto LABEL_9eb588;
                    if (v17 != 1)
                        break;
                    v16 += 1;
                    if (v16 == 82)
                    {
                        v20 = 113;
                        v21 = 214;
                    }
                }
                v22 = arm64g_calculate_condition(1, v17, 1, 0);
                if (v22 & 1)
                {
                    if (!sub_9ea8ac(idx, idx, v14) || !sub_9dea6c(v12, v12, idx, a2, a3))
                        goto LABEL_9eb588;
                    if (sub_9e5b90(v12))
                    {
                        v20 = 112;
                        v21 = 229;
                    }
                    if (!sub_9ea50c(v9, idx))
                        goto LABEL_9eb588;
                    if (sub_9e4828(v9))
                    {
                        if (!sub_9e5dac(v9, v6, a2, a3))
                            goto LABEL_9eb588;
                        if (!sub_9e4828(v9))
                        {
                            if (!sub_9e4d58(v1, 1))
                                goto LABEL_9eb588;
LABEL_9eb668:
                            if (!sub_9e6528(v2, v1, a2, a3) || !sub_9e6404(v2, v2, v6, a2, a3) || !sub_9e6404(v1, v1, v6, a2, a3))
                                goto LABEL_9eb588;
                            v21 = 321;
                        }
                    }
                    else
                    {
                        if (!sub_9dea6c(v1, v6, v9, a2, a3))
                            goto LABEL_9eb588;
                        if (!sub_9e4828(v1))
                            goto LABEL_9eb668;
                    }
                    sub_9e5b4c(v13);
                    goto LABEL_9eb22c;
                }
                v23 = v17;
                if (!v17)
                {
                    v21 = 203;
                    v24 = arm64g_calculate_condition(3, v23, 0, 0);
                    if (!(v24 & 1))
                        goto LABEL_9eb55a;
                }
                else
                {
                    v21 = 214;
                    v25 = arm64g_calculate_condition(3, v23, 0, 0);
                    if (!(v25 & 1))
                    {
LABEL_9eb55a:
                        v20 = 113;
                    }
                }
                v20 = 112;
            }
        }
        else
        {
            if (!sub_9e6584(v9, v6, a2) || !sub_9ea8ac(idx, a2, 3) || !(*(unsigned int *)(idx + 16) = 0, sub_9dea6c(v2, v9, idx, a2, a3) && sub_9e6528(v12, v2, a2, a3) && sub_9e6404(v9, v9, v12, a2, a3) && sub_9ebaf8(v9, 1) && sub_9e6404(v10, v6, v2, a2, a3) && sub_9e6404(v10, v10, v9, a2, a3)))
                goto LABEL_9eb588;
            v27 = v13;
        }
    }
    else
    {
LABEL_9eb588:
        v28 = 0;
        if (v13 != v5)
        {
LABEL_9eb21c:
            sub_9e4838(v13);
        }
LABEL_9eb224:
        v13 = 0;
        if (v28 & 1)
            return 0;
LABEL_9eb22c:
        sub_9de17c(a3);
        return v13;
    }
}
