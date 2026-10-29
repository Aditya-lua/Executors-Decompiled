/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x797d8..0x79960 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_797d8(unsigned short *a0, long long a1, unsigned long a2, unsigned long long a3, long long a4)
{
    unsigned long long v2;  // x22
    unsigned long v3;  // x23
    long long v12;  // x24
    unsigned long long v13;  // x0
    unsigned long long v14;  // 4106
    unsigned long long v15;  // x0
    unsigned long long v16;  // 4106
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4106
    unsigned short *v6;  // x26
    long long v7;  // x23
    long long v8;  // x24
    unsigned long long v9;  // x0
    unsigned long long v10;  // 4106
    long long v11;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((unsigned long long)a1 < 0x11)
    {
        return 0;
    }
    else if (a3 >= 12)
    {
        v2 = a3 + 3 >> 2;
        v3 = a0 + 3;
        v4 = sub_7ad50(v3, a1 - 6);
        v5 = arm64g_calculate_condition(130, v4, 120, 0);
        if (v5 & 1)
        {
            return v4;
        }
        else if (0xffffffffffff0001 > v4 - 0x10000)
        {
            return 0;
        }
        else
        {
            v6 = (char *)a0 + a1;
            *a0 = v4;
            v7 = v3 + v4;
            v8 = a2 + v2;
            v9 = sub_7ad50(v7, (char *)v6 - v7, v8, v2, a4);
            v10 = arm64g_calculate_condition(130, v9, 120, 0);
            if (v10 & 1)
            {
                return v9;
            }
            else if (0xffffffffffff0001 > v9 - 0x10000)
            {
                return 0;
            }
            else
            {
                a0[1] = v9;
                v11 = v7 + v9;
                v12 = v8 + v2;
                v13 = sub_7ad50(v11, (char *)v6 - v11, v12, v2, a4);
                v14 = arm64g_calculate_condition(130, v13, 120, 0);
                if (v14 & 1)
                {
                    return v13;
                }
                else if (v13 - 0x10000 < 0xffffffffffff0001)
                {
                    return 0;
                }
                else
                {
                    a0[2] = v13;
                    v15 = sub_7ad50(v11 + v13, (char *)v6 - v11 - v13, v12 + v2, a2 + a3 - (v12 + v2), a4);
                    v16 = arm64g_calculate_condition(130, v15, 120, 0);
                    if (v16 & 1)
                    {
                        return v15;
                    }
                    else if (v15 - 0x10000 < 0xffffffffffff0001)
                    {
                        return 0;
                    }
                    else
                    {
                        return v11 + v13 + v15 - (char *)a0;
                    }
                }
            }
        }
    }
    else
    {
        return 0;
    }
}
