/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6b6ec..0xc6b944 (600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_c6b6ec(unsigned long long *a0, unsigned long long a1, unsigned long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, unsigned long long a7)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x27
    unsigned long long i;  // x11
    unsigned long long v16;  // x11
    unsigned long long v17;  // x14
    char *v19;  // x11
    unsigned long long j;  // x14
    unsigned long long v21;  // x14
    unsigned long long v22;  // w17
    char *v23;  // x11
    unsigned long long v7;  // x26
    char *iter;  // x20
    char *v9;  // x23
    unsigned long long v10;  // x28
    unsigned long long v11;  // x25
    unsigned long long v12;  // x8
    unsigned long long v13;  // x9
    unsigned long long v14;  // x10
    char v0;  // [bp-0x130]
    char v1;  // [bp-0xf0]
    unsigned long v2;  // [bp-0x70]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = 0;
    v2 = *(long long *)&g_10002b0;
    if (a1 >= a6 && 64 >= a6)
    {
        if (a6)
        {
            v6 = *a0;
            v7 = v6 - a6;
            *a0 = v7;
            if (a5 == 1)
            {
                if (a3)
                    *(unsigned long long *)a3 = a2 + v7;
                if (a4)
                {
                    *(unsigned int *)a4 = 0;
                    goto LABEL_c6b8fc;
                }
            }
            else if ((int)sub_aa8658(v4, &v0, a6, 0) >= 1)
            {
                v5 = 0;
                if (a3 && a4 && (v5 = sub_a6bf4c(a6, "ssl/record/methods/tls_pad.c", 245), *(unsigned long long *)a3 = v5, v5))
                {
                    iter = v5;
                    *(unsigned int *)a4 = 1;
                    v9 = &(&v1)[-(unsigned int)&v1 & 63];
                    v10 = a6 | 0x100;
                    if (a1 < v10)
                        v11 = 0;
                    else
                        v11 = a1 - v10;
                    _bzero();
                    v12 = 0;
                    if (a1 > v11)
                    {
                        v13 = 0;
                        v12 = 0;
                        v14 = 0;
                        if (a1 < v10)
                            i = a1;
                        else
                            i = v10;
                        do
                        {
                            v16 = i;
                            v17 = (v11 ^ v7) - 1 & ~(v11 ^ v7);
                            v13 = (v13 | (long long)(v17) >> 63) & (long long)((-v6 + v11 ^ v6 | v11 ^ v6) ^ v11) >> 63;
                            v12 |= v14 & (long long)(v17) >> 63;
                            v9[v14] = *(char *)(a2 + v11) & (char)v13 | v9[v14];
                            v14 = v14 + 1 & (long long)(v14 + 1 - a6 & 0xfffffffffffffffe - v14) >> 63;
                            v11 += 1;
                            i = v16 - 1;
                        } while (i);
                    }
                    v19 = &v0;
                    j = a6;
                    do
                    {
                        v21 = j;
                        if (!(v12 & 32))
                            v22 = 0xff;
                        else
                            v22 = 0;
                        v23 = v19 + 1;
                        *iter = (char)~((unsigned int)a7 & 0xff) & *v19 | (char)a7 & ((char)~v22 & v9[v12 | 32] | (char)v22 & v9[v12 & 0xffffffffffffffdf]);
                        iter += 1;
                        v12 = v12 + 1 & (long long)(v12 + 1 - a6 & 0xfffffffffffffffe - v12) >> 63;
                        j = v21 - 1;
                        v19 = v23;
                    } while (j);
LABEL_c6b8fc:
                    v5 = 1;
                }
            }
            else
            {
                v5 = 0;
            }
        }
        else
        {
            v5 = a7 != 0;
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v5;
    ___stack_chk_fail();
}
