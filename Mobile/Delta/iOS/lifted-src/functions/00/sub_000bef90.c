/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbef90..0xbf0a4 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bef90_0 {
    char field_0;
} st_bef90_0;


unsigned long long sub_bef90(long long a0, unsigned long long a1, long long idx)
{
    unsigned long long v4;  // x20
    unsigned long long v5;  // x0
    unsigned long long v6;  // x8
    unsigned long long v7;  // 4111
    unsigned long long v8;  // x11
    st_bef90_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_bef90_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    _bzero(idx, 0x2010);
    sub_79548(idx, a0, 0x200);
    sub_79548(idx + 4104, a0 + a1 - 0x200, 0x200);
    *(unsigned long long *)(idx + 8200) = 0x200;
    *(unsigned long long *)(idx + 0x1000) = 0x200;
    if (sub_beed0(idx, idx + 4104, 8) < 0x38000)
        return a1;
    sub_79548(idx + 0x800, a0 + (a1 >> 1) - 0x100, 0x200);
    *(unsigned long long *)(idx + 0x1800) = 0x200;
    v4 = sub_beed0(idx, idx + 0x800, 8);
    v5 = sub_beed0(idx + 4104, idx + 0x800, 8);
    v6 = v4 - v5;
    v7 = arm64g_calculate_condition(84, v4, v5, 0);
    if (!(v7 & 1))
        v6 = -v6;
    v8 = 0x18000;
    if (v5 < v4)
        v8 = 0x8000;
    if (v6 >= 87381)
        return v8;
    return 0x10000;
}
