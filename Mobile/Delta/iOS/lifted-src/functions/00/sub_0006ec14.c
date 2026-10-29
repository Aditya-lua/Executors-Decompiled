/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6ec14..0x6ed9c (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6ec14_0 {
    char field_0;
} st_6ec14_0;


char * sub_6ec14(unsigned long a0, unsigned int a1)
{
    unsigned long v10;  // x8
    unsigned long i;  // x21
    char *v12;  // x0
    char *v13;  // x0
    st_6ec14_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_6ec14_0 *v1;  // [bp-0x70]
    char v2;  // [bp-0x68]
    char v3;  // [bp-0x64]
    char v4;  // [bp-0x60]
    char v5;  // [bp-0x48], Other Possible Types: unsigned int
    unsigned int v6;  // [bp-0x44]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v4, "0123456789ABCDEFGHabcdefgh", 26);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, "/dev/urandom", 12);
    std::__1::random_device::random_device(&v3, &v5);
    sub_6e8dc(&v2, std::__1::random_device::operator()(&v3));
    v5 = 0;
    v6 = sub_6b08(&v4) - 1;
    memset(v10, 0, 24);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(v10, a1, 0);
    if ((int)a1 >= 1)
    {
        i = 0;
        do
        {
            v12 = sub_9c78(&v4, sub_6d614(&v5, &v2, &v5));
            v13 = sub_9c78(v10, i);
            *v13 = *v12;
            i += 1;
        } while (a1 != i);
    }
    return &v4;
}
