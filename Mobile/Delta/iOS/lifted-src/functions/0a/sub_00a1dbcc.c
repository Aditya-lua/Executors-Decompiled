/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1dbcc..0xa1dc80 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a1dbcc(long long a0, long long a1, long long a2, long long *a3, long long a4)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x24
    long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a1d9f8();
    if (!v2)
        return v2;
    v3 = sub_a6bf4c();
    if (!v3)
        return v3;
    v4 = v3;
    v5 = sub_a1d9f8(a0, a1, a2, v4, v2, a4);
    if (!v5)
    {
        sub_a6c2e4(v4, "crypto/ec/ec_oct.c", 151);
        return 0;
    }
    *a3 = v4;
    return v5;
}
