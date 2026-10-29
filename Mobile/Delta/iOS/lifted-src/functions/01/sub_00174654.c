/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174654..0x1746a8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_174654(long long a0, long long i, long long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long v12;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (i == a2)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    do
    {
        v12 = sub_174068(a0, a0 + 8, i, i);
        i += 8;
    } while (i != a2);
    return v12;
}
