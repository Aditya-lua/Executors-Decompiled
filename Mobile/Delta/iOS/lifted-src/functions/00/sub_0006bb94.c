/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6bb94..0x6bd90 (508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6bb94_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_6bb94_1;

typedef struct st_6bb94_0 {
    char field_0;
} st_6bb94_0;

extern long long g_cbeb80;

long long sub_6bb94(st_6bb94_1 *a0, unsigned short *a1, long long a2, unsigned long long *a3, char *a4)
{
    st_6bb94_0 **v0;  // [bp-0x178], Other Possible Types: char
    st_6bb94_0 *v1;  // [bp-0x170]
    unsigned short v2;  // [bp-0x168]
    char v3;  // [bp-0x160]
    char v4;  // [bp-0x148]
    unsigned long v5;  // [bp-0x140]
    unsigned long v6;  // [bp-0x138]
    unsigned long v7;  // [bp-0x130]
    char *v8;  // [bp-0x128]
    unsigned long v9;  // [bp-0x120]
    unsigned long v10;  // [bp-0x118]
    unsigned long v11;  // [bp-0x110]
    unsigned long v12;  // [bp-0x108]
    unsigned long v13;  // [bp-0x100]
    char v14;  // [bp-0xf8]
    char *v15;  // [bp-0xe0]
    unsigned long v16;  // [bp-0xd8]
    unsigned long v17;  // [bp-0xd0]
    char v18;  // [bp-0xc8]
    uint128_t v19;  // [bp-0xb0]
    uint128_t v20;  // [bp-0xa0]
    uint128_t v21;  // [bp-0x90]
    unsigned long v22;  // [bp-0x80]
    unsigned int v23;  // [bp-0x74]
    char v24;  // [bp-0x70]
    unsigned long v25;  // [bp-0x68]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v1 = &v0;
    v0 = &v1;
    v25 = *a3;
    v23 = 2;
    v22 = 0;
    v20 = 0;
    v21 = 0;
    v19 = 0;
    v11 = 0;
    v12 = 0;
    v13 = 0;
    v9 = 0;
    v10 = 0;
    v7 = 0;
    v8 = &v9;
    v5 = 0;
    v6 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v14, &v11);
    v16 = 0;
    v17 = 0;
    v15 = &v16;
    sub_62144(&v15, v8, &v9);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v18, &v5);
    v2 = *a1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v3, a2);
    v4 = *a4;
    sub_6c024(&v23, &g_cbeb80, &v25, &v19, &v14, &v2);
    sub_6b0cc(a0->field_8 + 1160, &v24);
    sub_6bb04(&v24, 0);
    sub_62aa0(&v15, v16);
    sub_62aa0(&v8, v9);
    return (char *)&v20 + 8;
}
