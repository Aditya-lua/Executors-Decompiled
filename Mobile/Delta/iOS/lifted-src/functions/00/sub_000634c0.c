/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x634c0..0x63590 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_634c0_0 {
    char field_0;
} st_634c0_0;


unsigned long long sub_634c0(long long a0)
{
    unsigned long v4;  // x8
    char *v5;  // x20
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    char *v8;  // x21
    char *v9;  // cc_dep2
    char *v10;  // x20
    unsigned int v11;  // w8
    unsigned long long v12;  // x9
    unsigned long long v13;  // 4110
    st_634c0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_634c0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    memset(v4, 0, 24);
    v5 = sub_a0c8();
    v6 = sub_a0c8(a0);
    v7 = sub_6b08(a0);
    v8 = v6 + v7;
    if (v5 == v8)
        return v7;
    v9 = v8;
    do
    {
        v10 = v5;
        v11 = *v10;
        v12 = 1 << ((char)v11 & 63) & 0x100002400;
        if (v11 <= 32)
        {
            v13 = arm64g_calculate_condition(148, v5, v9, 0);
            v14 = arm64g_calculate_condition(20, (v13 & 1 ? v12 : 0x40000000), 0, 0);
            if (v14 & 1)
                continue;
        }
        else
        {
            v15 = arm64g_calculate_condition(148, v5, v9, 0);
            v16 = arm64g_calculate_condition(16, (v15 & 1 ? v12 : 0x40000000), 0, 0);
            if (v16 & 1)
                continue;
        }
        v7 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v4, (char)v11);
    } while ((v5 = v10 + 1, v9 = v8, v5 != v9));
    return v7;
}
