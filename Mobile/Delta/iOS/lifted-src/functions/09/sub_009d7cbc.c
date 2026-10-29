/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d7cbc..0x9d7e3c (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9d7cbc(void* a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v2;  // x20
    char v3;  // x19
    char i;  // x8
    unsigned long long v13;  // x9
    char v14;  // x23
    unsigned long v15;  // x9
    unsigned long v16;  // x10
    unsigned long v4;  // x8
    char v5;  // x28
    unsigned long long v6;  // x19
    char v7;  // x20
    unsigned long long v8;  // x9
    unsigned long long v9;  // x8
    char v10;  // x25
    char v11;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
        return 0;
    v2 = a2;
    v3 = 0;
    v4 = (long long)a0[16];
    v5 = (long long)a0[32];
    while (1)
    {
        v6 = v3;
        v7 = v2;
        v8 = v4 - v5;
        v9 = v4 - (long long)a0[24];
        if (v8 < v9)
            v10 = v8;
        else
            v10 = v9;
        if (!v10)
        {
            if ((char)((char)a0[88]) >> 3 & 1)
            {
                v11 = (long long)a0[48];
                i = v11 + v7;
                if (v11 < i)
                {
                    do
                    {
                        if (0x7ffffffffffffffe < v11)
                            return v6;
                        if (v11 > 0x1fffffffffffffff)
                            v13 = (103 * (__ROL__((unsigned int)(v11 - (unsigned int)(v11 / 5) * 5), 3) & 248 & 0xff) >> 9) + v11 / 5 * 8;
                        else
                            v13 = v11 * 8 / 5;
                        if (v13 < 0x7fffffffffffffff)
                            v11 = v13;
                        else
                            v11 = 0x7fffffffffffffff;
                    } while (i > v11);
                }
                else if (!v11)
                {
                    return v6;
                }
                if (!sub_9d7e3c(a0 + 8, v11))
                    return v6;
                *(unsigned long long *)&a0[48] = v11;
            }
            else
            {
                return v6;
            }
        }
        if (v10 < v7)
            v14 = v10;
        else
            v14 = v7;
        _memcpy();
        v4 = (long long)a0[16];
        v5 = (long long)a0[32];
        if (v4 - v5 >= v14)
        {
            v15 = (long long)a0[24] + v14;
            if (v4 >= v15)
            {
                v16 = v5 + v14;
                if (v16 == v4)
                    v5 = 0;
                else
                    v5 = v16;
                *(unsigned long *)&a0[24] = v15;
                *(unsigned long long *)&a0[32] = v5;
            }
        }
        v3 = v14 + v6;
        v2 = v7 - v14;
        if (v7 == v14)
            return v14 + v6;
    }
}
