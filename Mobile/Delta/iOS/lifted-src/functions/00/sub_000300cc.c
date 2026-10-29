/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x300cc..0x30188 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_300cc_1 {
    char padding_0[48];
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[584];
    char field_288;
    char padding_289[199];
    char field_350;
    char padding_351[23];
    char field_368;
    char padding_369[55];
    char field_3a0;
} st_300cc_1;

typedef struct st_300cc_0 {
    char field_0;
} st_300cc_0;


st_300cc_1 * sub_300cc(st_300cc_1 *a0, long long a1)
{
    unsigned long long v7;  // x20
    st_300cc_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_300cc_0 *v1;  // [bp-0x50]
    unsigned int v2;  // [bp-0x48], Other Possible Types: unsigned long
    unsigned int v3;  // [bp-0x3c]
    char *v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    if (!(a0->field_3a0 >> 4 & 1))
        return a0;
    v7 = sub_6b08(&a0->field_368);
    v4 = &v6;
    sub_3211c(&a0->field_368, a1, &v6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&a0->field_368, 0);
    v2 = a0->field_38 - a0->field_30 >> 2;
    v3 = v7;
    sub_318bc(&a0->field_350, &v2, &v3);
    v2 = sub_a0c8(&a0->field_368) + v7;
    return sub_2bd8c(&a0[1].padding_0[31], &a0->field_288, &v2);
}
