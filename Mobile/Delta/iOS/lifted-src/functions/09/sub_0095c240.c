/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95c240..0x95c29c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_95c240(long long a0, unsigned long long a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned int v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a0)
    {
        return 0;
    }
    else if (a1)
    {
        v1 = v6;
        v2 = v7;
        v3 = &v5;
        v4 = v8;
        v0 = a1;
        v9 = sub_ad66d4(a0, &v0);
        if (!(v9 >> 31 & 1))
            v10 = sub_ad69f8(a0, v9);
        else
            v10 = 0;
        return v10;
    }
    else
    {
        return 0;
    }
}
