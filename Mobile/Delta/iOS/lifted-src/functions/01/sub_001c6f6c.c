/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c6f6c..0x1c6fa8 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c6f6c_1 {
    char padding_0[8];
    long long field_8;
} st_1c6f6c_1;

typedef struct st_1c6f6c_0 {
    char field_0;
} st_1c6f6c_0;


int sub_1c6f6c(st_1c6f6c_1 *a0, long long *a1, long long *a2)
{
    st_1c6f6c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1c6f6c_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a0->field_8, *a1, *a2);
    return 1;
}
