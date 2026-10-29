/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dbbc8..0x9dbcc4 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_fffffffffffffffc;

unsigned int sub_9dbbc8(unsigned long long *node, unsigned long long *iter, unsigned long long *iter1, unsigned int i)
{
    unsigned int v0;  // w8
    unsigned long v1;  // x8
    unsigned long long v10;  // x10
    unsigned long long v11;  // x10
    unsigned long long v12;  // x8
    unsigned int v13;  // w11
    unsigned int v14;  // w3
    unsigned long long *v15;  // x1
    unsigned long v16;  // x8
    unsigned long long v17;  // x8
    unsigned long long v18;  // x9
    unsigned int v19;  // w10
    unsigned long long v2;  // x8
    unsigned int v3;  // x9
    unsigned long long v4;  // x10
    unsigned long long v5;  // x9
    unsigned long long v6;  // x8
    unsigned long long v7;  // x10
    unsigned long long v8;  // x10
    unsigned long long v9;  // x8

    if ((int)i < 1)
        return 0;
    if (4 > i)
    {
        v0 = 0;
    }
    else
    {
        v0 = 0;
        do
        {
            v1 = v0;
            v2 = *iter - v1;
            if (v1 <= *iter)
                v3 = 0;
            else
                v3 = (unsigned int)((char *)&g_fffffffffffffffc + 3);
            v4 = *iter1;
            *node = v2 - v4;
            v5 = iter[1];
            v6 = v3 - (v4 > v2) + iter[1];
            v7 = iter1[1];
            node[1] = v6 - v7;
            v8 = iter[2];
            v9 = v8 - (v7 > v6) - (v6 > v5);
            v10 = iter1[2];
            node[2] = v9 - v10;
            v11 = iter[3];
            v12 = v11 - (v10 > v9) - (v9 > v8);
            v13 = iter1[3] > v12;
            node[3] = v12 - iter1[3];
            if (v12 <= v11)
                v0 = v13 & 1;
            else
                v0 = v13 + 1;
            iter += 4;
            iter1 += 4;
            node += 4;
            i -= 4;
        } while (4 <= i);
        if (!i)
            return v0;
    }
    do
    {
        v14 = i;
        v15 = iter + 1;
        v16 = v0;
        v17 = *iter - v16;
        v18 = *iter1;
        iter1 += 1;
        v19 = v16 > *iter;
        *node = v17 - v18;
        node += 1;
        if (v18 <= v17)
            v0 = v19 & 1;
        else
            v0 = v19 + 1;
    } while ((i = v14 - 1, iter = v15, v14 != 1));
    return v0;
}
