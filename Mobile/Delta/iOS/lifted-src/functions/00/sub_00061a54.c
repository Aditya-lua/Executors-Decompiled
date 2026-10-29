/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x61a54..0x61b54 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_61a54_0 {
    char field_0;
} st_61a54_0;


long long sub_61a54(void* a0, long long a1)
{
    long long v11;  // x0
    long long n;  // x2
    long long v13;  // x20
    long long v14;  // x8
    unsigned long v15;  // x9
    uint128_t v0;  // [bp-0x90]
    st_61a54_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_61a54_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x58], Other Possible Types: long long
    unsigned long v6;  // [bp-0x50]
    st_61a54_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_61a54_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_1e4b0();
    sub_16a40(&v3, v11, 12297829382473034411 * ((long long)a0[8] - *(long long *)a0 >> 3), a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v5, a1);
    v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 24);
    v8 = &v7;
    v7 = &v8;
    n = (long long)a0[8] - *(long long *)a0;
    v13 = v4 - n;
    _memcpy(v13, *(long long *)a0, n);
    v14 = *(long long *)a0;
    *(long long *)a0 = v13;
    v15 = (long long)a0[16];
    v0 = v5;
    *(uint128_t *)&a0[8] = v5;
    v5 = v14;
    v6 = v15;
    v3 = v14;
    v4 = v14;
    sub_2db70(&v3);
    return (unsigned long long)v0;
}
