/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18a3f8..0x18a4d4 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_18a3f8_2 {
    struct st_18a3f8_1 *field_0;
    unsigned long long field_8;
    char field_10;
} st_18a3f8_2;

typedef struct st_18a3f8_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
    char padding_11[23];
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
} st_18a3f8_1;

typedef struct st_18a3f8_0 {
    char field_0;
} st_18a3f8_0;


unsigned long long sub_18a3f8(unsigned long a0, unsigned long a1, long long *a2)
{
    st_18a3f8_2 *v4;  // x8
    st_18a3f8_1 *v5;  // x22
    st_18a3f8_1 *v6;  // x0
    unsigned long long *v7;  // x0
    unsigned long long v8;  // x0
    st_18a3f8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_18a3f8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4->field_0 = sub_159c04();
    v4->field_8 = a0;
    v4->field_10 = 0;
    sub_16f34(v4 + 1);
    v5 = v4->field_0;
    v5->field_0 = 0;
    v5->field_8 = a1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v5->field_10, a2);
    v6 = v5;
    v6->field_28 = 0;
    v6->field_30 = 0;
    v7 = &v6->field_28;
    v7[2] = 0;
    v8 = sub_1754ac(v7, a2[3], a2[4], 12297829382473034411 * (a2[4] - a2[3] >> 3));
    v4->field_10 = 1;
    return v8;
}
