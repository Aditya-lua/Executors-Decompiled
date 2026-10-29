/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x70f04..0x71004 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_70f04_0 {
    char field_0;
} st_70f04_0;


long long sub_70f04(long long a0, unsigned long a1, unsigned long a2, long long *a3)
{
    void* v12;  // x0
    st_70f04_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_70f04_0 *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x70]
    long long v4;  // [bp-0x68]
    char v5;  // [bp-0x60], Other Possible Types: long long
    char v6;  // [bp-0x5f]
    long long v7;  // [bp-0x58]
    st_70f04_0 **v8;  // [bp-0x50], Other Possible Types: char
    st_70f04_0 *v9;  // [bp-0x48]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    v12 = sub_620ac();
    if (!*(long long *)v12)
    {
        v9 = &v8;
        v8 = &v9;
        v3 = sub_10574(a0, 1);
        v4 = a0;
        v5 = 0;
        sub_16f34(&v6);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v3 + 32, *a3);
        memset(v3 + 56, 0, 24);
        v5 = 1;
        sub_626e0(a0, v7, v12, v3);
        v2 = 0;
        sub_62a84(&v2, 0);
        return v3;
    }
    return *(long long *)v12;
}
