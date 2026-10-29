/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6a40c..0xa6a614 (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a6a40c(unsigned long a0, unsigned int a1, unsigned long a2, unsigned long long *a3)
{
    unsigned long v4;  // x0
    unsigned long long v5;  // x25
    unsigned long long *v6;  // x26
    unsigned long long v7;  // x23
    unsigned long long v8;  // x21
    unsigned long long idx;  // x24
    unsigned long long v10;  // x22
    char v0;  // [bp-0xb8]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_a68358();
    if (v4)
    {
        if (a1 >= 18)
        {
            sub_a368c8();
            sub_a369bc("crypto/ex_data.c", 37, "get_and_lock");
            sub_a36abc(15, 0x80106, 0);
            v4 = 0;
        }
        else if (*(long long *)v4)
        {
            v5 = v4;
            v4 = sub_a7c17c(*(long long *)v4);
            if ((unsigned int)v4)
            {
                v6 = v5 + 8;
                *a3 = a0;
                a3[1] = 0;
                v7 = sub_ad69e4(v6[a1]);
                if ((int)v7 >= 1)
                {
                    if (10 > (unsigned int)v7)
                    {
                        v8 = &v0;
                    }
                    else
                    {
                        v8 = sub_a6bf4c((v7 * 8 | v7 >> 61) & 0x7fffffff8 & 0x7ffffffff, "crypto/ex_data.c", 242);
                        if (!v8)
                            goto LABEL_a6a520;
                    }
                    idx = 0;
                    do
                    {
                        *(unsigned long long *)(v8 + idx * 8) = sub_ad69f8(v6[a1], idx);
                        idx += 1;
                    } while ((v7 & 0xffffffff) != idx);
                }
                else
                {
                    v8 = 0;
                }
LABEL_a6a520:
                sub_a7c1b4(*(long long *)v5);
                if ((int)v7 >= 1 && !v8)
                    goto LABEL_a6a534;
                if ((int)v7 >= 1)
                {
                    v10 = 0;
                    do
                    {
                        if (*(long long *)(v8 + v10 * 8) && *(long long *)(*(long long *)(v8 + v10 * 8) + 24))
                        {
                            if (a3[1] && sub_ad69e4(a3[1]) > (long long)v10)
                                sub_ad69f8(a3[1], v10);
                            (*(long long *)(*(long long *)(v8 + v10 * 8) + 24))();
                        }
                    } while ((v10 += 1, (v7 & 0xffffffff) != v10));
                }
                if (v8 != &v0)
                    sub_a6c2e4(v8, "crypto/ex_data.c", 259);
                v4 = 1;
            }
        }
        else
        {
LABEL_a6a534:
            v4 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
