/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b18e8..0x1b1974 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b18e8_0 {
    char field_0;
} st_1b18e8_0;


char * sub_1b18e8(unsigned long a0, char *a1, char *a2)
{
    char *v4;  // x8
    unsigned int v5;  // w9
    unsigned long v6;  // cc_dep1
    unsigned int v7;  // w9
    unsigned long long v8;  // x9
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    st_1b18e8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b18e8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v4 = a1 + 1;
    if (v4 == a2)
        return a1;
    v5 = *a1;
    v6 = v5 & 0xff;
    if (v5 != 92)
        return a1;
    v7 = *v4 - 36;
    v8 = 1 << ((char)v7 & 63) & 396316767208604737;
    if (v7 <= 58)
    {
        v9 = arm64g_calculate_condition(147, v6, 92, 0);
        v10 = arm64g_calculate_condition(4, (v9 & 1 ? v8 : 0x40000000), 0, 0);
        if (v10 & 1)
            return a1;
    }
    else
    {
        v11 = arm64g_calculate_condition(147, v6, 92, 0);
        v12 = arm64g_calculate_condition(0, (v11 & 1 ? v8 : 0x40000000), 0, 0);
        if (v12 & 1)
            return a1;
    }
    sub_1bbad0();
    return a1 + 2;
}
