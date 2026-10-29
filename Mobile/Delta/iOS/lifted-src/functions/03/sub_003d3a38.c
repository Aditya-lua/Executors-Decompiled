/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d3a38..0x3d3afc (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d3a38_0 {
    char field_0;
} st_3d3a38_0;

typedef struct st_3d3a38_1 {
    unsigned long long field_0;
} st_3d3a38_1;

extern st_3d3a38_1 *g_f0b120;

unsigned long long sub_3d3a38(long long a0, char *a1)
{
    unsigned long long v4;  // x19
    unsigned int v5;  // w8
    unsigned long long v6;  // 4124
    char v7;  // x0
    unsigned long long v8;  // 4102
    st_3d3a38_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3d3a38_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = 0;
    v1 = &v0;
    v0 = &v1;
    do
    {
        if (sub_3d2248(a0))
            return v4;
        v5 = *a1;
        v6 = arm64g_calculate_condition(49, v5 - 58, 10, 0);
        if (v6 & 1)
            return v4;
        v4 = v5 + 10 * (unsigned int)v4 - 48;
        v7 = sub_3d706c(a0);
        *a1 = v7;
    } while (214748364 >= (int)v4 && (v8 = arm64g_calculate_condition(19, v4 & 0xffffffff, 214748364, 0), v8 & 1 || (char)v7 < 56));
    g_f0b120();
}
