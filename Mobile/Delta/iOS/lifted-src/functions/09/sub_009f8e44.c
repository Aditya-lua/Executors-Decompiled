/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f8e44..0x9f8f74 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_9f8e44(char *a0, char *a1, unsigned long long a2, long long a3, void* a4, unsigned int *a5, unsigned long long a6)
{
    unsigned long long iter;  // x22
    char *iter1;  // x23
    char *node;  // x24
    unsigned long long v7;  // x25
    char *v8;  // x24
    char v9;  // x8
    char v10;  // x8
    char v11;  // x9
    unsigned long v0;  // [bp-0x60]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    iter = a2;
    iter1 = a1;
    node = a0;
    v1 = *(long long *)&g_10002b0;
    v7 = *a5 & 7;
    if (a6)
    {
        if (iter)
        {
            do
            {
                if (!v7)
                {
                    *(double *)&v0 = *(double *)a4;
                    sub_9f96d4(&v0, a3, 1);
                    *(unsigned int *)a4 = v0;
                    *(unsigned int *)&a4[4] = *(unsigned int *)((void*)&v0 + 4);
                }
                v8 = node + 1;
                v9 = *((char *)a4 + v7) ^ *node;
                *iter1 = v9;
                iter1 += 1;
                *((char *)a4 + v7) = v9;
                v7 = (unsigned int)v7 + 1 & 7;
                iter -= 1;
                node = v8;
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
                    *(double *)&v0 = *(double *)a4;
                    sub_9f96d4(&v0, a3, 1);
                    *(unsigned int *)a4 = v0;
                    *(unsigned int *)&a4[4] = *(unsigned int *)((void*)&v0 + 4);
                }
                v10 = *node;
                node += 1;
                v11 = *((char *)a4 + v7);
                *((char *)a4 + v7) = v10;
                *iter1 = v11 ^ v10;
                iter1 += 1;
                v7 = (unsigned int)v7 + 1 & 7;
                iter -= 1;
            } while (iter);
        }
    }
    *a5 = v7;
    if (*(long long *)&g_10002b0 == v1)
        return;
    ___stack_chk_fail();
}
