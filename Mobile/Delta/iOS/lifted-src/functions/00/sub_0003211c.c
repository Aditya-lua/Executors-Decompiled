/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3211c..0x321bc (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3211c_0 {
    char field_0;
} st_3211c_0;


unsigned long long sub_3211c(long long a0, long long a1, long long a2)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    st_3211c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3211c_0 *v1;  // [bp-0x48]
    long long v2;  // [bp-0x40]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a2;
    v0 = &v1;
    v5 = _vsnprintf(0, 0, a1, a2);
    if ((int)v5 < 1)
        return v5;
    v6 = sub_6b08(a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v6 + (v5 & 0xffffffff), 0);
    return _vsnprintf(sub_9c78(a0, 0) + v6, (unsigned int)v5 + 1, a1, a2);
}
