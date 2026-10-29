/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaee7d4..0xaee87c (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aee7d4(unsigned long long *a0, long long a1)
{
    unsigned long v8;  // x0
    unsigned long v9;  // x0
    unsigned long v10;  // x0
    unsigned long v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    unsigned long v4;  // [bp-0x30]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = 0;
    v3 = 0;
    v4 = 0;
    if (!*a0)
        return 0;
    v8 = sub_9c1674(&v5);
    if (!(unsigned int)v8)
        return v8;
    if (a0[1])
    {
        v9 = sub_9c1674(&v4);
        if (!(unsigned int)v9)
            return v9;
    }
    if (a0[2])
    {
        v10 = sub_9c1674(&v3);
        if (!(unsigned int)v10)
            return v10;
    }
    else
    {
        v3 = 0;
    }
    v1 = v4;
    v2 = v3;
    v0 = v5;
    return (int)sub_9d524c(a1, "%02lld:%02lld:%02lld") > 0;
}
