/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44ff4..0xb45178 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b44ff4(char *a0, unsigned long long *a1, unsigned long long a2, unsigned long long n)
{
    unsigned long long v5;  // w16
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v9;  // x8
    unsigned long long v10;  // x19
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a2)
    {
        *a1 = 0;
        return 1;
    }
    if (!n)
    {
        v5 = 0;
    }
    else if (n >= 32)
    {
        if (n <= 0x1fffffffffffff)
            v5 = 7;
        else
            v5 = 8;
        if (n <= 0x1fffffffffff)
            v5 = 6;
        if (n <= 0x1fffffffff)
            v5 = 5;
        if (n <= 0x1fffffff)
            v5 = 4;
        if (n < 0x200000)
            v5 = 3;
        if (n < 0x2000)
            v5 = 2;
    }
    else
    {
        v5 = 1;
    }
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    if (1 < v5)
        v9 = v5;
    else
        v9 = 1;
    v10 = n + v9 + 1;
    if (517 <= v10)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/macs/kmac_prov.c", 575, "encode_string");
        sub_a36abc(57, 202, 0);
        return 0;
    }
    *a0 = v9;
    a0[v9] = (char)n * 8;
    if (v9 != 1)
    {
        *(&a0[v9] - 1) = n >> 5;
        if (v9 != 2)
        {
            *(&a0[v9] - 2) = n >> 13;
            if (v9 != 3)
            {
                *(&a0[v9] - 3) = n >> 21;
                if (v9 != 4)
                {
                    *(&a0[v9] - 4) = n >> 29;
                    if (v9 != 5)
                    {
                        *(&a0[v9] - 5) = n >> 37;
                        if (v9 != 6)
                        {
                            *(&a0[v9] - 6) = n >> 45;
                            if (v9 != 7)
                                *(&a0[v9] - 7) = n >> 53;
                        }
                    }
                }
            }
        }
    }
    _memcpy(&a0[v9 + 1], a2, n);
    *a1 = v10;
    return 1;
}
