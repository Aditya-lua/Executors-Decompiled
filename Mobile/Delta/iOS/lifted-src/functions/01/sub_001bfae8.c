/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bfae8..0x1c0030 (1352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bfae8_0 {
    char field_0;
} st_1bfae8_0;

typedef struct st_1bfae8_1 {
    unsigned long long field_0;
} st_1bfae8_1;

extern st_1bfae8_1 *g_f0b060;

int sub_1bfae8(long long a0, unsigned long a1, unsigned int a2)
{
    unsigned long v7;  // cc_dep1
    unsigned long long v8;  // 4107
    unsigned long long v9;  // 4107
    st_1bfae8_0 **v0;  // [bp-0x278], Other Possible Types: char
    st_1bfae8_0 *v1;  // [bp-0x270]
    st_1bfae8_0 **v2;  // [bp-0x250], Other Possible Types: char
    st_1bfae8_0 *v3;  // [bp-0x1c0]
    char v4;  // [bp-0x130]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = a2;
    if (a2)
    {
        v8 = arm64g_calculate_condition(19, v7, 0, 0);
        if (!(v8 & 1))
            goto LABEL_1bfb46;
LABEL_1bfb45:
    }
    else
    {
        v9 = arm64g_calculate_condition(19, v7, 0, 0);
        if (v9 & 1)
            goto LABEL_1bfb45;
LABEL_1bfb46:
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init();
    v3 = &v2;
    v2 = &v3;
    if (!sub_1bf324(a0 + 56, &v4))
        return 0;
    g_f0b060();
}
