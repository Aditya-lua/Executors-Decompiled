/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7de58..0x7df1c (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7de58_0 {
    char padding_0[28];
    unsigned int field_1c;
} st_7de58_0;

typedef struct st_7de58_1 {
    char field_0;
} st_7de58_1;


unsigned long long sub_7de58(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long a3, unsigned long long a4, unsigned long a5, unsigned long a6, unsigned long a7, st_7de58_0 *a8, unsigned long long a9, unsigned long long a10, unsigned int a11)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // 4106
    unsigned long long v8;  // 4106
    char v9;  // x8
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned int v2;  // [bp-0x50]
    st_7de58_1 **v3;  // [bp-0x40], Other Possible Types: char
    st_7de58_1 *v4;  // [bp-0x38]
    st_7de58_0 **v5;  // [bp-0x10]

    v5 = &a8;
    v4 = &v3;
    v3 = &v4;
    v2 = a11;
    v0 = a9;
    v1 = a10;
    v6 = sub_7e4fc();
    if (!v6)
        return v6;
    if (a1 >= a4)
    {
        v7 = arm64g_calculate_condition(18, v6, 70, 0);
        if (!(v7 & 1))
            return 0;
    }
    v8 = arm64g_calculate_condition(130, v6, 120, 0);
    if (v8 & 1)
        return v6;
    if (7 < a8->field_1c)
        v9 = a8->field_1c - 1;
    else
        v9 = 6;
    if (v6 >= a4 - (a4 >> (v9 & 63)) - 2)
        return 0;
    return v6;
}
