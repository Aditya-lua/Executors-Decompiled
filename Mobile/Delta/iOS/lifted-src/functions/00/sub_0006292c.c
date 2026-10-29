/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6292c..0x62a38 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6292c_0 {
    char field_0;
} st_6292c_0;


unsigned long long sub_6292c(void* a0)
{
    unsigned long long v4;  // x20
    unsigned long long v5;  // x21
    unsigned long v6;  // x8
    unsigned long long v7;  // x9
    unsigned long long v9;  // x0
    unsigned long long v10;  // x8
    st_6292c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_6292c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *(unsigned long long *)&a0[88] = 0;
    v4 = sub_a0c8(a0 + 64);
    v5 = sub_6b08(a0 + 64);
    v6 = (int)a0[96];
    if (v6 >> 3 & 1)
    {
        v7 = v4 + v5;
        *(unsigned long long *)&a0[88] = v7;
        *(unsigned long long *)&a0[16] = v4;
        *(unsigned long long *)&a0[24] = v4;
        *(unsigned long long *)&a0[32] = v7;
    }
    if (!(v6 >> 4 & 1))
        return v5;
    *(unsigned long long *)&a0[88] = v4 + v5;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0 + 64, sub_62e44(a0 + 64), 0);
    v9 = sub_6b08(a0 + 64);
    *(unsigned long long *)&a0[40] = v4;
    *(unsigned long long *)&a0[48] = v4;
    *(unsigned long long *)&a0[56] = v4 + v9;
    if (!((char)a0[96] & 3))
        return v9;
    if (v5 > 0x7fffffff)
    {
        v10 = (((v5 + 0xffffffff80000000) * 8589934597 >> 64) + (v5 + 0xffffffff80000000 - ((v5 + 0xffffffff80000000) * 8589934597 >> 64) >> 1) >> 30) * 0x7fffffff;
        v5 = v5 - v10 + 0xffffffff80000001;
        v4 = v4 + 0x7fffffff + v10;
        *(unsigned long long *)&a0[48] = v4;
    }
    if (!v5)
        return v9;
    *(unsigned long long *)&a0[48] = v4 + v5;
    return v9;
}
