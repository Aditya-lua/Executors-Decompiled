/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c77d8..0x1c79cc (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c77d8_0 {
    char field_0;
} st_1c77d8_0;

typedef struct st_1c77d8_2 {
    unsigned long long field_0;
} st_1c77d8_2;

typedef struct st_1c77d8_1 {
    char padding_0[24];
    struct st_1c77d8_2 *field_18;
} st_1c77d8_1;

extern st_1c77d8_1 *g_f0d3d8;
extern char g_10002b0;

void sub_1c77d8(unsigned long a0)
{
    unsigned long long v15;  // x24
    unsigned long long v16;  // x23
    unsigned long long v17;  // x22
    unsigned long long v18;  // x21
    unsigned long long v19;  // x20
    unsigned long long v20;  // x19
    unsigned long long v21;  // x30
    st_1c77d8_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_1c77d8_0 *v1;  // [bp-0x90]
    char v2;  // [bp-0x88]
    uint128_t v3;  // [bp-0x70], Other Possible Types: uint128_t
    uint128_t v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = v19;
    v11 = v20;
    v12 = &v14;
    v13 = v21;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = CONCAT(17168632223062190764, 2892799215476940407);
    v4 = CONCAT(17168632223062190764, 2892799623169342259);
    v3 ^= v4;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, &v3, _strlen(&v3));
    _strlen(sub_a0c8(&v2));
    g_f0d3d8->field_18();
}
