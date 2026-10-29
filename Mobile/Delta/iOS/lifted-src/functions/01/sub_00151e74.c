/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x151e74..0x151ed0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_151e74(long long a0, unsigned long long *i, unsigned long long *a2)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned long long *v13;  // x20
    long long v14;  // x0
    unsigned long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (i == a2)
        return a0;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    do
    {
        v13 = i + 1;
        v0 = *i;
        v14 = sub_159b30(a0, &v0);
        i = v13;
    } while (i != a2);
    return v14;
}
