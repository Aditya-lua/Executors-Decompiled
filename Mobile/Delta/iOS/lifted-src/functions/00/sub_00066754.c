/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66754..0x667d0 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66754_0 {
    char field_0;
} st_66754_0;


int sub_66754(long long a0, long long a1)
{
    unsigned int v4;  // w20
    unsigned long long v5;  // 4116
    unsigned long long v6;  // 4126
    unsigned long long v7;  // 4126
    st_66754_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_66754_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_66808(a0 + 8, 5);
    v5 = arm64g_calculate_condition(1, v4, 1, 0);
    if (v5 & 1)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "Socket is uninitialized");
        v7 = arm64g_calculate_condition(1, v4, 1, 0);
        return !(v7 & 1);
    }
    v6 = arm64g_calculate_condition(1, v4, 1, 0);
    return !(v6 & 1);
}
