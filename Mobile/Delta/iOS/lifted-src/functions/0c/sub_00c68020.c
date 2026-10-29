/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68020..0xc680bc (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c68020(unsigned long a0, unsigned int a1, long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, unsigned long long a7)
{
    unsigned long v10;  // x21
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned long v0;  // [bp-0x70]
    long long v1;  // [bp-0x68], Other Possible Types: unsigned int
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0], Other Possible Types: unsigned long long

    v8 = &v9;
    v0 = a0;
    v1 = 0;
    v1 = a1;
    v2 = a3;
    v3 = a4;
    v4 = a5;
    v5 = a6;
    v6 = a7;
    v7 = v9;
    if (!a2)
        return sub_a7a0b4(a0, sub_a687c4, &v0);
    v10 = sub_a7a42c(a2);
    v11 = sub_a67ad8(a0);
    v12 = sub_a67ad8(v10);
    if (v11 != v12)
        return v12;
    v0 = v10;
    return sub_a687c4(a2, &v0);
}
