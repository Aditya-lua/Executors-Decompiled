/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be178..0x1be1ac (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1be178_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_1be178_0;


unsigned long long sub_1be178(st_1be178_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::copy(&a0->padding_0[8]);
    a0->field_20 = a0->field_20 + v2;
    return v2;
}
