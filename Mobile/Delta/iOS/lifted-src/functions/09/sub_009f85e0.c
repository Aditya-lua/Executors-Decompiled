/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f85e0..0x9f8794 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_9f85e0(char *a0, char *a1, unsigned long long a2, long long a3, long long a4, long long a5, void* a6, unsigned int *a7)
{
    unsigned long long iter;  // x24
    char *iter1;  // x25
    char v14;  // x8
    char v15;  // x9
    char *node;  // x26
    unsigned long long v7;  // x27
    unsigned int v8;  // w8
    unsigned int v9;  // w9
    char *v10;  // x26
    char v11;  // x8
    unsigned int v12;  // w8
    unsigned int v13;  // w9
    unsigned long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0], Other Possible Types: unsigned long long

    v2 = &v3;
    iter = a2;
    iter1 = a1;
    node = a0;
    v1 = *(long long *)&g_10002b0;
    v7 = *a7 & 7;
    if (v3)
    {
        if (iter)
        {
            do
            {
                if (!v7)
                {
                    *(double *)&v0 = *(double *)a6;
                    sub_9fb3ec(&v0, a3, a4, a5);
                    v8 = v0;
                    v9 = *(unsigned int *)((void*)&v0 + 4);
                    *(char *)a6 = v8;
                    *(char *)&a6[1] = v8 >> 8;
                    *(char *)&a6[2] = v8 >> 16;
                    *(char *)&a6[3] = v8 >> 24;
                    *(char *)&a6[4] = v9;
                    *(char *)&a6[5] = v9 >> 8;
                    *(char *)&a6[6] = v9 >> 16;
                    *(char *)&a6[7] = v9 >> 24;
                }
                v10 = node + 1;
                v11 = *((char *)a6 + v7) ^ *node;
                *iter1 = v11;
                iter1 += 1;
                *((char *)a6 + v7) = v11;
                v7 = (unsigned int)v7 + 1 & 7;
                iter -= 1;
                node = v10;
            } while (iter);
        }
    }
    else
    {
        if (iter)
        {
            do
            {
                if (!v7)
                {
                    *(double *)&v0 = *(double *)a6;
                    sub_9fb3ec(&v0, a3, a4, a5);
                    v12 = v0;
                    v13 = *(unsigned int *)((void*)&v0 + 4);
                    *(char *)a6 = v12;
                    *(char *)&a6[1] = v12 >> 8;
                    *(char *)&a6[2] = v12 >> 16;
                    *(char *)&a6[3] = v12 >> 24;
                    *(char *)&a6[4] = v13;
                    *(char *)&a6[5] = v13 >> 8;
                    *(char *)&a6[6] = v13 >> 16;
                    *(char *)&a6[7] = v13 >> 24;
                }
                v14 = *node;
                node += 1;
                v15 = *((char *)a6 + v7);
                *((char *)a6 + v7) = v14;
                *iter1 = v15 ^ v14;
                iter1 += 1;
                v7 = (unsigned int)v7 + 1 & 7;
                iter -= 1;
            } while (iter);
        }
    }
    *a7 = v7;
    if (*(long long *)&g_10002b0 == v1)
        return;
    ___stack_chk_fail();
}
