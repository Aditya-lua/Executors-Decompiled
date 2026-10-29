/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6a9e8..0xa6abf8 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a6abf8;
extern char g_10002b0;

unsigned long long sub_a6a9e8(unsigned int a0, unsigned long a1, void* *a2)
{
    void* v4;  // x0
    void* v5;  // x25
    void* v14;  // x22
    void* v15;  // x25
    unsigned long v16;  // x23
    unsigned long long v17;  // x0
    unsigned long long *v6;  // x26
    unsigned long long v7;  // x0
    unsigned long long v8;  // x22
    void* v9;  // x21
    void* v10;  // x24
    void* i;  // x22
    unsigned int *iter;  // x27
    unsigned int *node;  // x24
    char v0;  // [bp-0x108]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_a68358(*a2);
    if (v4)
    {
        if (a0 >= 18)
        {
            sub_a368c8();
            sub_a369bc("crypto/ex_data.c", 37, "get_and_lock");
            sub_a36abc(15, 0x80106, 0);
        }
        else if (*(long long *)v4)
        {
            v5 = v4;
            if (sub_a7c17c(*(long long *)v4))
            {
                v6 = v5 + 8;
                v7 = sub_ad69e4(v6[a0]);
                if ((int)v7 >= 1)
                {
                    v8 = v7;
                    if (10 > (unsigned int)v7)
                    {
                        v9 = &v0;
                    }
                    else
                    {
                        v9 = sub_a6bf4c((v8 * 16 | v8 >> 60) & 0xffffffff0 & 0xfffffffff, "crypto/ex_data.c", 388);
                        if (!v9)
                            goto LABEL_a6ab90;
                    }
                    v10 = 0;
                    i = v8 & 0xffffffff;
                    iter = v9 + 8;
                    do
                    {
                        *(unsigned long long *)((char *)iter - 8) = sub_ad69f8(v6[a0], v10);
                        *iter = (unsigned int)v10;
                        iter += 4;
                        v10 += 1;
                    } while (i != v10);
                    sub_a7c1b4(*(long long *)v5);
                    _qsort(v9, i, 16, &g_a6abf8);
                    node = v9 + 8;
                    do
                    {
                        v14 = i;
                        v15 = *(long long *)((char *)node - 8);
                        if (v15 && (long long)v15[32])
                        {
                            if (a2[1] && !(v16 = *node, (int)sub_ad69e4(a2[1]) <= (int)v16))
                                sub_ad69f8(a2[1], v16);
                            (long long)v15[32]();
                        }
                    } while ((node += 4, i = v14 - 1, v14 != 1));
                    if (v9 == &v0)
                    {
                        v17 = sub_ad6020(a2[1]);
                        *a2 = 0;
                        a2[1] = 0;
                        if (*(long long *)&g_10002b0 == v1)
                            return v17;
                        ___stack_chk_fail();
                    }
                }
                else
                {
LABEL_a6ab90:
                    sub_a7c1b4(*(long long *)v5);
                    v9 = 0;
                }
                sub_a6c2e4(v9, "crypto/ex_data.c", 411);
            }
        }
    }
    v17 = sub_ad6020(a2[1]);
    *a2 = 0;
    a2[1] = 0;
    if (*(long long *)&g_10002b0 == v1)
        return v17;
    ___stack_chk_fail();
}
