/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x167aa4..0x1684c4 (2592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_167aa4_0 {
    char field_0;
} st_167aa4_0;

typedef struct st_167aa4_2 {
    unsigned long long field_0;
} st_167aa4_2;

typedef struct st_167aa4_1 {
    char padding_0[72];
    struct st_167aa4_2 *field_48;
} st_167aa4_1;

extern st_167aa4_1 *g_f0d3d8;
extern unsigned long long g_f0d528;
extern long long g_f0fd08;
extern char g_10002b0;

void sub_167aa4(unsigned long a0)
{
    unsigned long long v16;  // x24
    unsigned long long v17;  // x23
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    long long len1;  // x0
    long long v25;  // x0
    st_167aa4_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_167aa4_0 *v1;  // [bp-0xb8]
    uint128_t v2;  // [bp-0xb0], Other Possible Types: uint128_t
    char v3;  // [bp-0xa0]
    char v4;  // [bp-0x80]
    uint128_t v5;  // [bp-0x60]
    unsigned long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = v19;
    v11 = v20;
    v12 = v21;
    v13 = &v15;
    v14 = v22;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = CONCAT(14429746110317888822, 5631685596971467549);
    v5 = CONCAT(14429746110317888822, 5631685737297962585);
    v2 ^= v5;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, &v2, _strlen(&v2));
    len1 = _strlen(g_f0d528 + 263);
    v25 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, g_f0d528 + 263, len1);
    sub_5c38(&v4, v25);
    sub_5ccc(&g_f0fd08, &v4);
    g_f0d3d8->field_48();
}
