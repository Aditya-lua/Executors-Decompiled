/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa67718..0xa67850 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a67718(long long a0, long long a1, void* *a2, long long a3)
{
    void* v4;  // x9
    long long v5;  // x11
    void* v6;  // x10
    long long v7;  // x8
    void* v8;  // x20
    unsigned long long v9;  // 4112
    long long v10;  // x10
    void* v11;  // x9
    unsigned long v12;  // x10
    long long v13;  // x8
    void* v0;  // [bp-0x40]
    long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    if (a3 < 1)
    {
        return 0;
    }
    else if (a3 != 1)
    {
        v2 = &v3;
        v4 = *a2;
        if (*(char *)v4 != 48)
            return 0;
        v5 = (char)v4[1];
        v6 = v4 + 2;
        v7 = a3 - 2;
        if (v5 < 0)
        {
            v9 = arm64g_calculate_condition(1, v5 & 0xff, 126, 0);
            if (!(v9 & 1))
            {
                if ((char)v5 == 129)
                {
                    if (!v7)
                        return v7;
                    v10 = *(char *)v6;
                    if ((unsigned long long)(a3 - 3) >= (unsigned long long)v10)
                    {
                        v11 = v4 + 3;
LABEL_a67844:
                        v8 = v11 + v10;
                        v0 = v11;
                        v1 = v10;
LABEL_a6777c:
                        if (sub_a67630(&v0, a0))
                        {
                            if (sub_a67630(&v0, a1))
                            {
                                if (!v1)
                                {
                                    v13 = v8 - *a2;
                                    *a2 = v8;
                                    return v13;
                                }
                                return 0;
                            }
                            else
                            {
                                return 0;
                            }
                        }
                    }
                }
            }
            else
            {
                if ((unsigned long long)a3 >= 4 && (v12 = (short)v4[2], v10 = (unsigned int)((v12 & 0xff00) >> 8) | (unsigned int)v12 * 0x100 & 0xff00ff00, (unsigned long long)v10 <= (unsigned long long)(a3 - 4)))
                {
                    v11 = v4 + 4;
                    goto LABEL_a67844;
                }
            }
        }
        else if ((unsigned long long)v7 >= (unsigned long long)v5)
        {
            v0 = v6;
            v1 = v5;
            v8 = v6 + v5;
            goto LABEL_a6777c;
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
