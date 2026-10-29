/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb34924..0xb34b5c (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;
extern char g_10002b0;

unsigned long long sub_b34924(long long a0, long long a1, long long a2, long long a3, long long a4, unsigned int *a5, long long a6, long long a7)
{
    long long n;  // x21
    long long iter;  // x22
    unsigned long long v8;  // w0
    unsigned long long v9;  // x19
    unsigned long long v10;  // x9
    unsigned long long v11;  // x8
    unsigned long long v12;  // x20
    long long v13;  // x28
    unsigned long long v14;  // x20
    long long v15;  // x21
    unsigned long long v0;  // [bp-0xb4]
    unsigned long long v1;  // [bp-0xb0]
    char v2;  // [bp-0xa8]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (0x40000000 >= (unsigned long long)a2 && 0x40000000 >= (unsigned long long)a4 && !(n = a7, (unsigned long long)(a7 + 0xffffffffbfffffff) <= 0xffffffffbfffffff))
    {
        iter = a6;
        v8 = (unsigned int)sub_a50ac8();
        if (v8 < 1)
            goto LABEL_b34aa8;
        v0 = v8;
        v9 = sub_a3f728();
        v10 = sub_a3f728(v9);
        v11 = 0;
        if (v9 && v10)
        {
            v12 = v10;
            if (sub_a3fd98(v10, a0))
            {
                *a5 = (unsigned int)&g_1000000;
                v1 = v12;
                if (sub_a40520(v9, v12))
                {
                    v13 = v0;
                    v14 = 2;
                }
                else
                {
LABEL_b34ae8:
                    v11 = 0;
LABEL_b34aec:
                    v10 = v1;
                    goto LABEL_b34af0;
                }
                while (1)
                {
                    if (!sub_a3fe10(v9, a1, a2) || !sub_a3fe10(v9, a3, a4))
                        goto LABEL_b34ae8;
                    if ((unsigned long long)n < (unsigned long long)v13)
                    {
                        if (sub_a3ff7c(v9, &v2, 0))
                        {
                            _memcpy(iter, &v2, n);
                            v11 = 1;
                            goto LABEL_b34aec;
                        }
                        goto LABEL_b34ae8;
                    }
                    if (!sub_a3ff7c(v9, iter, 0))
                        goto LABEL_b34ae8;
                    v15 = n - v13;
                    v10 = v1;
                    if (n == v13)
                        break;
                    iter += v13;
                    *a5 = (((((v14 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v14 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v14 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v14 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    v14 += 1;
                    n = v15;
                    if (!sub_a40520(v9, v10))
                        goto LABEL_b34ae8;
                }
                v11 = 1;
            }
            else
            {
                v11 = 0;
                v10 = v12;
            }
        }
LABEL_b34af0:
        sub_a3f73c(v9);
        sub_a3f73c(v10);
        sub_a66ec0(&v2, 64);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/x942kdf.c", 283, "x942kdf_hash_kdm");
        sub_a36abc(57, 142, 0);
LABEL_b34aa8:
        v11 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v11;
    ___stack_chk_fail();
}
