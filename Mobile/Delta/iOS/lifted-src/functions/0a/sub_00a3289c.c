/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3289c..0xa32950 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a3289c(long long a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 >> 6 & 1)
    {
        v2 = sub_a34f1c(a0);
        if (!(unsigned int)v2)
            return v2;
    }
    if (a1 >> 7 & 1)
    {
        v3 = sub_a35144(a0);
        if (!(unsigned int)v3)
            return v3;
    }
    if (a1 & 1)
    {
        v4 = sub_a35670(a0);
        if (!(unsigned int)v4)
            return v4;
    }
    if (a1 >> 1 & 1)
    {
        v5 = sub_a35288(a0);
        if (!(unsigned int)v5)
            return v5;
    }
    if (a1 >> 2 & 1)
    {
        v6 = sub_a35060(a0);
        if (!(unsigned int)v6)
            return v6;
    }
    if (a1 >> 11 & 1)
    {
        v7 = sub_a3532c(a0);
        if (!(unsigned int)v7)
            return v7;
    }
    if (a1 >> 3 & 1)
    {
        v8 = sub_a355d8(a0);
        if (!(unsigned int)v8)
            return v8;
    }
    if (a1 >> 9 & 1)
    {
        v9 = sub_a35404(a0);
        if (!(unsigned int)v9)
            return v9;
    }
    if (a1 >> 10 & 1)
    {
        v10 = sub_a34b44(a0);
        if (!(unsigned int)v10)
            return v10;
    }
    return 1;
}
