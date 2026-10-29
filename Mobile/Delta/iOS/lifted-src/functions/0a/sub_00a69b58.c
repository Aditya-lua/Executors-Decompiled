/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa69b58..0xa69c48 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a69b58(long long a0, unsigned long long a1)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    char v0;  // [bp-0x40], Other Possible Types: unsigned long
    unsigned long v1;  // [bp-0x38]
    char v2;  // [bp-0x30], Other Possible Types: unsigned long
    char v3;  // [bp-0x28], Other Possible Types: unsigned long
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_c68eb8();
    if (!(unsigned int)v6)
        return v6;
    v7 = sub_a6e970(a0);
    if (!(unsigned int)v7)
        return v7;
    v8 = sub_c68eb8(a0, &v0);
    if (!(unsigned int)v8)
        return v8;
    if (v1 == v0)
    {
        v9 = sub_c689f4(a0, 2);
        if (!(unsigned int)v9)
            return v9;
    }
    else
    {
        v10 = sub_c68d5c(a0, 48, 1);
        if (!(unsigned int)v10)
            return v10;
    }
    if (a1 >> 31 & 1)
        return 1;
    if (30 >= (unsigned int)a1)
    {
        v11 = sub_c68eb8(a0, &v3);
        if (!(unsigned int)v11)
            return v11;
        v12 = sub_a6e970(a0);
        if (!(unsigned int)v12)
            return v12;
        v13 = sub_c68eb8(a0, &v2);
        if (!(unsigned int)v13)
        {
            return v13;
        }
        else if (v3 != v2)
        {
            return sub_c68d5c(a0, (unsigned int)a1 | 160, 1) != 0;
        }
    }
    else
    {
        return 0;
    }
    return 1;
}
