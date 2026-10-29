/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b31a8..0x1b32f0 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b31a8_0 {
    struct st_1b31a8_0 *field_0;
} st_1b31a8_0;


st_1b31a8_0 ** sub_1b31a8(st_1b31a8_0 **a0)
{
    unsigned long v3;  // x8
    st_1b31a8_0 **i;  // x21
    st_1b31a8_0 **v5;  // x25
    long long v6;  // x0
    long long v8;  // x0
    char v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    memset(v3, 0, 24);
    i = *a0;
    v5 = a0 + 1;
    if (*a0 == v5)
        return a0;
    do
    {
        if (i != *a0)
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v3, "&", 1);
        v6 = sub_a0c8(i + 4);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v3, v6, sub_6b08(i + 4));
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v3, L"=,›Ⰰ ):]⸥㜱g[{㨺⸀", 1);
        sub_1bbc88(i + 7);
        v8 = sub_a0c8(&v0);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v3, v8, sub_6b08(&v0));
        i = sub_62b88(i);
    } while (i != v5);
    return i;
}
