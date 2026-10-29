/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x67110..0x6725c (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_67110(unsigned long a0, long long a1, long long a2, long long a3)
{
    long long *v3;  // x8
    long long v4;  // x0
    long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    sub_30d84(a2);
    *v3 = 0;
    if (a0 & 1)
    {
        v4 = operatornew(312);
        sub_67f3c(v4, a3, a1);
        v0 = 0;
        sub_63c08(v3, v4);
        sub_670f8(&v0, 0);
    }
    else
    {
        v5 = operatornew(88);
        sub_669b4(v5, a1);
        v0 = 0;
        sub_63c08(v3, v5);
        sub_63c08(&v0, 0);
    }
    v6 = sub_663f0(*v3, a2);
    if (v6 & 1)
        return v6;
    return sub_63c08(v3, 0);
}
