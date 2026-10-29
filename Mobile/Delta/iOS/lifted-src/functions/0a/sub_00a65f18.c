/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa65f18..0xa66074 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_a65f18(char *a0, char *a1, unsigned long long a2, long long a3, void* a4, unsigned int *a5, unsigned long long a6)
{
    unsigned long v5;  // x8
    unsigned long long iter;  // x22
    char v15;  // x8
    unsigned long v16;  // x8
    unsigned long v17;  // x9
    unsigned long v18;  // x8
    unsigned long v19;  // x9
    char v20;  // x8
    char v21;  // x9
    char *iter1;  // x23
    char *node;  // x24
    unsigned long long v9;  // x25
    unsigned long v10;  // x8
    unsigned long v11;  // x9
    unsigned long v12;  // x8
    unsigned long v13;  // x9
    char *v14;  // x24
    unsigned long v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = *a5;
    if (!(v5 >> 31 & 1))
    {
        iter = a2;
        iter1 = a1;
        node = a0;
        v9 = v5 & 7;
        if (a6)
        {
            if (iter)
            {
                do
                {
                    if (!v9)
                    {
                        v10 = *(int *)a4;
                        v11 = (int)a4[4];
                        v0 = (((((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                        v1 = (((((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                        sub_a6587c(&v0, a3);
                        v12 = (unsigned int)v0;
                        v13 = (unsigned int)v1;
                        *(unsigned int *)a4 = (((((v12 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v12 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                        *(unsigned int *)&a4[4] = (((((v13 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v13 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    }
                    v14 = node + 1;
                    v15 = *((char *)a4 + v9) ^ *node;
                    *iter1 = v15;
                    iter1 += 1;
                    *((char *)a4 + v9) = v15;
                    v9 = (unsigned int)v9 + 1 & 7;
                    iter -= 1;
                    node = v14;
                } while (iter);
            }
        }
        else
        {
            if (iter)
            {
                do
                {
                    if (!v9)
                    {
                        v16 = *(int *)a4;
                        v17 = (int)a4[4];
                        v0 = (((((v16 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v16 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v16 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v16 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                        v1 = (((((v17 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v17 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v17 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v17 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                        sub_a6587c(&v0, a3);
                        v18 = (unsigned int)v0;
                        v19 = (unsigned int)v1;
                        *(unsigned int *)a4 = (((((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                        *(unsigned int *)&a4[4] = (((((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    }
                    v20 = *node;
                    node += 1;
                    v21 = *((char *)a4 + v9);
                    *((char *)a4 + v9) = v20;
                    *iter1 = v21 ^ v20;
                    iter1 += 1;
                    v9 = (unsigned int)v9 + 1 & 7;
                    iter -= 1;
                } while (iter);
            }
        }
    }
    else
    {
        v9 = 0xffffffff;
    }
    *a5 = v9;
    if (*(long long *)&g_10002b0 == v2)
        return;
    ___stack_chk_fail();
}
