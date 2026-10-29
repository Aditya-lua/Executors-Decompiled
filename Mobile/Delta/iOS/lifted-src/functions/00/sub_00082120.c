/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82120..0x82208 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_82120_1 {
    unsigned int field_0;
    char padding_4[132];
    unsigned long long field_88;
} st_82120_1;

typedef struct st_82120_0 {
    char field_0;
} st_82120_0;


unsigned long long sub_82120(long long a0, unsigned long long a1, long long a2, st_82120_1 *a3, long long a4, unsigned long a5, unsigned long long a6)
{
    unsigned long long v5;  // x19
    unsigned long long v6;  // x9
    unsigned int v7;  // w9
    unsigned long long v8;  // x8
    unsigned long long v9;  // 4106
    unsigned long long v10;  // x0
    unsigned long long v11;  // x8
    st_82120_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_82120_0 *v1;  // [bp-0x50]
    unsigned int v2;  // [bp-0x44]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1;
    v1 = &v0;
    v0 = &v1;
    v2 = 0xff;
    v6 = 3;
    if (a1 > 0x3ff)
        v6 = 4;
    if (a1 & 0xffffffffffffc000)
        v6 += 1;
    v7 = a3->field_0;
    if (v7 - 2 >= 2)
    {
        v8 = 1;
        if (v7 != 1)
            v8 = 0;
        if (!v7)
            v8 = v5;
        return v8;
    }
    else
    {
        v9 = arm64g_calculate_condition(130, sub_794c0(a4, &v2, a0, v5), 120, 0);
        if (v9 & 1)
            return v5;
        v10 = sub_79df8(a2, a4, v2);
        if (a6)
            v10 += a3->field_88;
        v11 = v10 + 6;
        if (v5 >= 0x100)
            v10 = v11;
        return v6 + v10;
    }
}
