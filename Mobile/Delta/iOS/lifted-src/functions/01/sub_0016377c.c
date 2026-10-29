/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16377c..0x1638a8 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16377c_0 {
    char field_0;
} st_16377c_0;

typedef struct st_16377c_2 {
    unsigned long long field_0;
} st_16377c_2;

typedef struct st_16377c_1 {
    char padding_0[24];
    struct st_16377c_2 *field_18;
} st_16377c_1;

extern st_16377c_1 *g_f0d3d8;
extern char g_10002b0;

void sub_16377c(unsigned long a0)
{
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    st_16377c_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_16377c_0 *v1;  // [bp-0x70]
    char v2;  // [bp-0x68]
    uint128_t v3;  // [bp-0x50], Other Possible Types: uint128_t
    uint128_t v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v6 = v11;
    v7 = v12;
    v8 = &v10;
    v9 = v13;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = CONCAT(14429746110317900549, 9157764608167004267);
    v4 = CONCAT(14429746110317888822, 5631685737297962585);
    v3 ^= v4;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, &v3, _strlen(&v3));
    _strlen(sub_a0c8(&v2));
    g_f0d3d8->field_18();
}
