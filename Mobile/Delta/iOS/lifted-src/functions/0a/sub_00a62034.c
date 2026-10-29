/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa62034..0xa62344 (784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a62034(long long a0, long long a1, unsigned long long i, unsigned long long a3, long long a4, long long a5, long long a6, long long a7, unsigned int a8, long long a9, unsigned long long *a10, unsigned int *a11)
{
    long long v9;  // x27
    long long v10;  // x20
    unsigned long long v19;  // x8
    char *v20;  // x9
    unsigned long v21;  // x10
    unsigned long long v22;  // w0
    unsigned long long v11;  // x0
    unsigned long long v12;  // x21
    unsigned long v13;  // x25
    unsigned long long v14;  // x0
    unsigned long long v15;  // x24
    unsigned long long v16;  // x24
    unsigned long long v17;  // x28
    unsigned long long v18;  // x28
    long long v0;  // [bp-0x100]
    unsigned int v1;  // [bp-0xe4]
    unsigned int v2;  // [bp-0xd4]
    long long v3;  // [bp-0xd0]
    long long v4;  // [bp-0xc8]
    unsigned long long v5;  // [bp-0xc0]
    char v6;  // [bp-0xb0]
    unsigned long v7;  // [bp-0x70]
    char *v8;  // [bp-0x10]

    v8 = &a8;
    v7 = *(long long *)&g_10002b0;
    sub_9de064();
    v9 = sub_9de208(a0);
    v4 = sub_9de208(a0);
    v3 = sub_9de208(a0);
    v10 = sub_9de208(a0);
    v11 = sub_9de208(a0);
    if (v11)
    {
        v12 = v11;
        v13 = a8 - 1;
        if (sub_9ea668(v10, sub_9e4624(), v13))
        {
            v1 = v13;
            v14 = sub_a50ac8(a1);
            if ((int)v14 >= 1)
            {
                if (i >= 0)
                {
                    v15 = 0;
                    v2 = (unsigned int)v14 * 8;
                    v5 = a5 & 0xffffffff;
                    do
                    {
                        v16 = v15;
                        if ((unsigned int)v16 && !sub_9e804c(a9, 0, v16))
                            goto LABEL_a622e8;
                        sub_9e5b4c(v9);
                        if (a3 >= 0)
                        {
                            v17 = 0;
                            do
                            {
                                v18 = v17;
                                v19 = v5;
                                do
                                {
                                } while ((int)v19 >= 1 && (v20 = a4 + v19, v19 -= 1, v21 = *(v20 - 1) + 1, *(v20 - 1) = v21, v21 >> 8 & 1));
                                if (!sub_a40abc(a4, a5, &v6, 0, a1, 0))
                                {
                                    sub_9de17c(a0);
                                    if (*(long long *)&g_10002b0 == v7)
                                        return 0xffffffff;
                                    ___stack_chk_fail();
                                }
                                if (!sub_9e4db0(&v6, v14, v12))
                                {
                                    sub_9de17c(a0);
                                    if (*(long long *)&g_10002b0 == v7)
                                        return 0xffffffff;
                                    ___stack_chk_fail();
                                }
                                if (!sub_9ea668(v12, v12, v18 * v2))
                                {
                                    sub_9de17c(a0);
                                    if (*(long long *)&g_10002b0 == v7)
                                        return 0xffffffff;
                                    ___stack_chk_fail();
                                }
                                if (!sub_9db29c(v9, v9, v12))
                                    goto LABEL_a622e8;
                            } while ((v17 = (unsigned int)v18 + 1, (unsigned int)v18 != a3));
                        }
                        if (!sub_9e57d0(v9, v1))
                        {
                            sub_9de17c(a0);
                            if (*(long long *)&g_10002b0 == v7)
                                return 0xffffffff;
                            ___stack_chk_fail();
                        }
                        if (!sub_9e4c34(v4, v9))
                        {
                            sub_9de17c(a0);
                            if (*(long long *)&g_10002b0 == v7)
                                return 0xffffffff;
                            ___stack_chk_fail();
                        }
                        if (!sub_9db29c(v4, v4, v10))
                        {
                            sub_9de17c(a0);
                            if (*(long long *)&g_10002b0 == v7)
                                return 0xffffffff;
                            ___stack_chk_fail();
                        }
                        if (!(sub_9ea45c(v12, a6)) || !(v0 = v10, sub_9de520(0, v3, v4, v12, a0) && sub_9db58c(v12, v3, sub_9e4624()) && sub_9db58c(a7, v4, v12)))
                            goto LABEL_a622e8;
                        v10 = v0;
                        if (!(sub_9e5528(a7, v10) >> 31 & 1))
                        {
                            v22 = (unsigned int)sub_9e892c(a7, a0, a9);
                            if (1 <= v22)
                            {
                                *(unsigned int *)a10 = v16;
                                sub_9de17c(a0);
                                if (*(long long *)&g_10002b0 == v7)
                                    return 1;
                                ___stack_chk_fail();
                            }
                            else if (v22)
                            {
                                sub_9de17c(a0);
                                if (*(long long *)&g_10002b0 == v7)
                                    return 0xffffffff;
                                ___stack_chk_fail();
                            }
                        }
                        v15 = (unsigned int)v16 + 1;
                    } while ((unsigned int)v16 != i);
                }
                *a11 = *a11 | 1;
                sub_9de17c(a0);
                if (*(long long *)&g_10002b0 == v7)
                    return 0;
                ___stack_chk_fail();
            }
        }
    }
LABEL_a622e8:
    sub_9de17c(a0);
    if (*(long long *)&g_10002b0 == v7)
        return 0xffffffff;
    ___stack_chk_fail();
}
