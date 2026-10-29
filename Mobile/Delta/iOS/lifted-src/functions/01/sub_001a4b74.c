/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a4b74..0x1a4cf0 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a4b74_0 {
    char field_0;
} st_1a4b74_0;


unsigned long long sub_1a4b74(long long a0)
{
    unsigned long v4;  // x8
    unsigned long long v14;  // x0
    char *v6;  // x20
    unsigned long long v7;  // x0
    char *v8;  // x23
    unsigned long long v9;  // w21
    unsigned int v10;  // w8
    unsigned long long v11;  // 4127
    unsigned int i;  // w24
    unsigned long long v13;  // 4112
    st_1a4b74_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1a4b74_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    memset(v4, 0, 24);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(v4, sub_6b08());
    v6 = sub_a0c8(a0);
    v7 = sub_a0c8(a0);
    v8 = v7 + sub_6b08(a0);
    if (v6 != v8)
    {
        v9 = 0;
        v10 = 0xfffffffa;
        do
        {
            v9 = *v6 | v9 * 0x100;
            v11 = arm64g_calculate_condition(177, v10, 8, 0);
            if (v11 & 1)
            {
                v10 += 8;
            }
            else
            {
                i = v10 + 14;
                do
                {
                    i -= 6;
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v4, *(char *)(((long long)(v9) >> ((char)i & 31) & 63) + 0xc7f9ed));
                    v10 = i - 6;
                } while (6 <= i);
            }
        } while ((v6 += 1, v6 != v8));
        v13 = arm64g_calculate_condition(145, v10, 6, 0);
        if (!(v13 & 1))
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v4, *(char *)(((long long)(v9 * 0x100) >> ((char)v10 + 8 & 31) & 62) + 0xc7f9ed));
    }
    while (1)
    {
        v14 = sub_6b08(v4);
        if (!(v14 & 3))
            break;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v4, 61);
    }
    return v14;
}
