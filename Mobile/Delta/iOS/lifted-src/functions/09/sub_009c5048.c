/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5048..0x9c5120 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c5048(long long a0, long long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    uint128_t v0;  // [bp-0xb0], Other Possible Types: char
    uint128_t v1;  // [bp-0xa0]
    uint128_t v2;  // [bp-0x90]
    unsigned long v3;  // [bp-0x80]
    uint128_t v4;  // [bp-0x70], Other Possible Types: char
    uint128_t v5;  // [bp-0x60]
    uint128_t v6;  // [bp-0x50]
    unsigned long v7;  // [bp-0x40]
    char v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    if (a2)
    {
        v11 = sub_9c4808(&v4, a2);
        if (!(unsigned int)v11)
            return v11;
    }
    else
    {
        _time(&v0);
        v4 = 0;
        v5 = 0;
        v6 = 0;
        v7 = 0;
        v12 = sub_a6e2fc(&v0, &v4) != 0;
        if (!(unsigned int)v12)
            return v12;
    }
    if (a3)
    {
        v13 = sub_9c4808(&v0, a3);
        if (!(unsigned int)v13)
            return v13;
    }
    else
    {
        _time(&v8);
        v0 = 0;
        v1 = 0;
        v2 = 0;
        v3 = 0;
        v14 = sub_a6e2fc(&v8, &v0) != 0;
        if (!(unsigned int)v14)
            return v14;
    }
    return sub_a6e5dc(a0, a1, &v4, &v0);
}
