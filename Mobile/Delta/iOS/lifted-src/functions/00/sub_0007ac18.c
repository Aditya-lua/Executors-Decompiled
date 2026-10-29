/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7ac18..0x7ad24 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_7ac18(long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x20
    unsigned int v3;  // w9
    long long v12;  // x0
    unsigned long long *v4;  // x8
    unsigned long idx;  // x10
    unsigned long long v6;  // d0
    unsigned long index;  // x11
    unsigned long v8;  // x13
    void* v9;  // x14
    unsigned int v10;  // w22
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = a2 - a1;
    if (8 > (int)v3)
    {
        if ((int)v3 >= 1)
        {
            v4 = a0 + (int)v2 * 8;
            idx = 1;
            do
            {
                v6 = v4[idx];
                index = idx;
                while (1)
                {
                    v8 = index - 1;
                    v9 = &v4[v8 & 0xffffffff];
                    if ((unsigned int)v6 <= (unsigned int)*(int *)v9)
                        break;
                    v4[index] = *(long long *)v9;
                    index = v8;
                    if (1 >= (long long)(index + 1))
                    {
                        index = 0;
                        break;
                    }
                }
                *(unsigned long long *)((char *)v4 + ((long long)(index * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(index, 3) & 0x7fffffff8 & 0x7ffffffff)) = v6;
                idx += 1;
            } while (idx != v3 + 1);
            return a0;
        }
        else
        {
            return a0;
        }
    }
    else
    {
        if ((int)v2 < (int)a2)
        {
            while (1)
            {
                v10 = sub_7a764(a0, v2, a2);
                if ((int)(a2 - v10) <= (int)(v10 - v2))
                {
                    v11 = sub_7ac18(a0, v10 + 1, a2);
                    a2 = v10 - 1;
                    if ((int)a2 <= (int)v2)
                        return v11;
                }
                else
                {
                    v12 = sub_7ac18(a0, v2, v10 - 1);
                    v2 = v10 + 1;
                    if ((int)v2 >= (int)a2)
                        return v12;
                }
            }
        }
        else
        {
            return a0;
        }
    }
}
