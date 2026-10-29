/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a8dac..0x1a8ea4 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a8dac_0 {
    char field_0;
} st_1a8dac_0;


long long sub_1a8dac(long long a0, long long a1)
{
    unsigned long v0;  // [bp-0x58]
    long long v1;  // [bp-0x58]
    long long v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    char v4;  // [bp-0x47]
    st_1a8dac_0 **v5;  // [bp-0x40], Other Possible Types: char
    st_1a8dac_0 *v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = &v5;
    v5 = &v6;
    v1 = sub_10574();
    v2 = a0;
    v3 = 0;
    sub_16f34(&v4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v1 + 32, a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v1 + 56, a1 + 24);
    v3 = 1;
    sub_626e0(a0, v6, sub_1bc104(a0, &v6, v1 + 32), v1);
    v0 = 0;
    sub_62a84(&v0, 0);
    return v1;
}
