/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0cc4..0x9d0e0c (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_9d0cc4(char *a0, char *a1, unsigned long long a2, long long a3, void* a4, unsigned int *a5, unsigned long long a6)
{
    unsigned long long iter;  // x22
    char *iter1;  // x23
    char v15;  // x8
    char v16;  // x9
    char *node;  // x24
    unsigned long long v8;  // x25
    unsigned long v9;  // x8
    unsigned long v10;  // x9
    char *v11;  // x24
    char v12;  // x8
    unsigned long v13;  // x8
    unsigned long v14;  // x9
    unsigned int v0;  // [bp-0x60]
    unsigned int v1;  // [bp-0x5c]
    unsigned long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    iter = a2;
    iter1 = a1;
    node = a0;
    v2 = *(long long *)&g_10002b0;
    v8 = *a5 & 7;
    if (a6)
    {
        if (iter)
        {
            do
            {
                if (!v8)
                {
                    v9 = *(int *)a4;
                    v10 = (int)a4[4];
                    v0 = (((((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v9 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v9 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    v1 = (((((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    sub_9d0e94(&v0, a3);
                    *(unsigned int *)a4 = (((((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    *(unsigned int *)&a4[4] = (((((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                }
                v11 = node + 1;
                v12 = *((char *)a4 + v8) ^ *node;
                *iter1 = v12;
                iter1 += 1;
                *((char *)a4 + v8) = v12;
                v8 = (unsigned int)v8 + 1 & 7;
                iter -= 1;
                node = v11;
            } while (iter);
        }
    }
    else
    {
        if (iter)
        {
            do
            {
                if (!v8)
                {
                    v13 = *(int *)a4;
                    v14 = (int)a4[4];
                    v0 = (((((v13 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v13 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v13 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v13 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    v1 = (((((v14 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v14 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v14 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v14 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    sub_9d0e94(&v0, a3);
                    *(unsigned int *)a4 = (((((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    *(unsigned int *)&a4[4] = (((((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                }
                v15 = *node;
                node += 1;
                v16 = *((char *)a4 + v8);
                *((char *)a4 + v8) = v15;
                *iter1 = v16 ^ v15;
                iter1 += 1;
                v8 = (unsigned int)v8 + 1 & 7;
                iter -= 1;
            } while (iter);
        }
    }
    *a5 = v8;
    if (*(long long *)&g_10002b0 == v2)
        return;
    ___stack_chk_fail();
}
