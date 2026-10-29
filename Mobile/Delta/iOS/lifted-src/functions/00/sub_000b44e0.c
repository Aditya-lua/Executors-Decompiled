/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44e0..0xb4688 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_cc0348[4];

unsigned long long sub_b44e0(unsigned long long *a0, char *a1, unsigned long long a2, unsigned long long *a3, unsigned int *a4)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x10
    unsigned long long v10;  // x9
    unsigned long idx;  // x14
    unsigned int v12;  // w13
    unsigned long idx1;  // x14
    unsigned int v14;  // w13
    unsigned long long v15;  // x8
    unsigned long index;  // x13
    unsigned int v17;  // w13
    char *v2;  // x11
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long idx2;  // x14
    unsigned int v7;  // w14
    unsigned long v8;  // x13
    unsigned int v9;  // w13

    v0 = *a0;
    v1 = a0[1];
    if (a2 >= 4)
    {
        v2 = a1 + 1;
        v3 = 2;
        while (1)
        {
            v4 = v3;
            v5 = g_cc0348[*(v2 - 1)] + v0 * 2;
            if (!(v5 & v1))
            {
                idx2 = *a4;
                a3[idx2] = v4 - 1;
                v7 = (unsigned int)idx2 + 1;
                *a4 = v7;
                if (v7 == 64)
                {
                    *a0 = v5;
                    return v4 - 1;
                }
            }
            v0 = g_cc0348[*v2] + v5 * 2;
            if (!(v0 & v1) && !(v8 = *a4, a3[v8] = v4, v9 = (unsigned int)v8 + 1, *a4 = v9, v9 != 64))
                break;
            v10 = g_cc0348[v2[1]] + v0 * 2;
            if (!(v10 & v1))
            {
                idx = *a4;
                a3[idx] = v4 + 1;
                v12 = (unsigned int)idx + 1;
                *a4 = v12;
                if (v12 == 64)
                {
                    *a0 = v10;
                    return v4 + 1;
                }
            }
            v0 = g_cc0348[v2[2]] + v10 * 2;
            if (v0 & v1 || !(idx1 = *a4, a3[idx1] = v4 + 2, v14 = (unsigned int)idx1 + 1, *a4 = v14, v14 == 64))
            {
                v3 = v4 + 4;
                v2 += 4;
                if (a2 <= v4 + 5)
                {
                    v4 = v3 - 2;
                    if (a2 <= v4)
                        break;
                    else
                        goto LABEL_b4600;
                }
            }
            else
            {
                v4 += 2;
                break;
            }
        }
    }
    else
    {
        v4 = 0;
        if (a2 > 0)
        {
LABEL_b4600:
            while (1)
            {
                v0 = g_cc0348[a1[v4]] + v0 * 2;
                v15 = v4 + 1;
                if (!(v0 & v1))
                {
                    index = *a4;
                    a3[index] = v15;
                    v17 = (unsigned int)index + 1;
                    *a4 = v17;
                    if (v17 == 64)
                    {
                        *a0 = v0;
                        return v4 + 1;
                    }
                }
                v4 = v15;
                if (a2 == v4)
                {
                    *a0 = v0;
                    return a2;
                }
            }
        }
    }
    *a0 = v0;
    return v4;
}
