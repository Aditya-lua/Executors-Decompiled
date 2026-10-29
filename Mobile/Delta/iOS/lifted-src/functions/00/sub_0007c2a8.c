/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7c2a8..0x7c31c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_7c2a8(unsigned long a0, long long a1, unsigned long a2, long long a3, long long a4, long long a5, long long a6)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long v12;  // x1
    long long v13;  // x0
    long long v14;  // x8
    unsigned long long v15;  // 4109
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a2 - a1;
    if (a5)
        v13 = sub_797d8(a1, v12, a3, a4, a6);
    else
        v13 = sub_7ad50(a1, v12, a3, a4, a6);
    v14 = a1 + v13 - a0;
    if ((unsigned long long)v14 >= (unsigned long long)(a4 - 1))
        v14 = 0;
    if (!v13)
        v14 = 0;
    v15 = arm64g_calculate_condition(130, v13, 120, 0);
    if (!(v15 & 1))
        return v14;
    return v13;
}
