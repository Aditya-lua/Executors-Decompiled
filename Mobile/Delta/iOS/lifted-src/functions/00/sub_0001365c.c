/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1365c..0x13778 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1365c_0 {
    char field_0;
} st_1365c_0;


long long sub_1365c(void* a0, uint128_t *a1, long long a2)
{
    long long v11;  // x0
    long long n;  // x2
    long long v14;  // x20
    long long v15;  // x8
    unsigned long v16;  // x9
    uint128_t v0;  // [bp-0x90]
    st_1365c_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_1365c_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    uint128_t *v5;  // [bp-0x58], Other Possible Types: long long, uint128_t
    unsigned long v6;  // [bp-0x50]
    st_1365c_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_1365c_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_1ed6c();
    sub_1acbc(&v3, v11, 14757395258967641293 * ((long long)a0[8] - *(long long *)a0 >> 3), a0);
    *v5 = *a1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v5 + 1, a2, _strlen(a2));
    v5 = _INSERT(CONCAT(v5, 0), 0, (char *)&v5[2] + 8);
    v8 = &v7;
    v7 = &v8;
    n = (long long)a0[8] - *(long long *)a0;
    v14 = v4 - n;
    _memcpy(v14, *(long long *)a0, n);
    v15 = *(long long *)a0;
    *(long long *)a0 = v14;
    v16 = (long long)a0[16];
    v0 = v5;
    *(uint128_t *)&a0[8] = v5;
    v5 = v15;
    v6 = v16;
    v3 = v15;
    v4 = v15;
    sub_18e78(&v3);
    return (unsigned long long)v0;
}
