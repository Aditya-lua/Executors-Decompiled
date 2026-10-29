/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb32fc0..0xb331fc (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;
extern char g_10002b0;

long long sub_b32fc0(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long iter, long long n)
{
    long long v7;  // x0
    long long v8;  // w0
    long long v9;  // x19
    long long v10;  // x28
    unsigned long long v11;  // x20
    long long v12;  // x21
    long long v0;  // [bp-0xbc]
    long long v1;  // [bp-0xb8]
    unsigned int v2;  // [bp-0xac]
    char v3;  // [bp-0xa8]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = 0;
    v4 = *(long long *)&g_10002b0;
    if (0x40000000 >= (unsigned long long)a2 && 0x40000000 >= (unsigned long long)a4 && (unsigned long long)(n + 0xffffffffbfffffff) >= 0xffffffffc0000000)
    {
        v8 = (unsigned int)sub_a50ac8(a0);
        if (v8 >= 1)
        {
            v0 = v8;
            v9 = sub_a3f728();
            v7 = 0;
            v1 = sub_a3f728(v9);
            if (v9 && v1)
            {
                if (sub_a3fd98(v1, a0) && !(v2 = (unsigned int)&g_1000000, !sub_a40520(v9, v1)))
                {
                    v10 = v0;
                    v11 = 2;
                    while (1)
                    {
                        if (a5)
                        {
                            break;
                        }
                        else
                        {
                            if (!sub_a3fe10(v9, &v2, 4) || !sub_a3fe10(v9, a1, a2) || !sub_a3fe10(v9, a3, a4))
                                break;
                            if ((unsigned long long)n >= (unsigned long long)v10)
                            {
                                if (!sub_a3ff7c(v9, iter, 0))
                                    break;
                                v12 = n - v10;
                                if (n == v10)
                                    goto LABEL_b33190;
                                iter += v10;
                                v2 = (((((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                                v7 = 0;
                                v11 += 1;
                                n = v12;
                                if (!sub_a40520(v9, v1))
                                    goto LABEL_b3319c;
                            }
                            else if (sub_a3ff7c(v9, &v3, 0))
                            {
                                _memcpy(iter, &v3, n);
LABEL_b33190:
                                v7 = 1;
                                goto LABEL_b3319c;
                            }
                        }
                    }
                }
                v7 = 0;
            }
LABEL_b3319c:
            sub_a3f73c(v9);
            sub_a3f73c(v1);
            sub_a66ec0(&v3, 64);
        }
        else
        {
            v7 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v4)
        return v7;
    ___stack_chk_fail();
}
