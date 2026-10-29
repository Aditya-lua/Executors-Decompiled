/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d9744..0x3d9890 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d9744_0 {
    char field_0;
} st_3d9744_0;


char * sub_3d9744(long long i)
{
    unsigned long v7;  // x8
    long long v9;  // x21
    char v10;  // x0
    st_3d9744_0 **v0;  // [bp-0xa28], Other Possible Types: char
    st_3d9744_0 *v1;  // [bp-0xa20]
    double v2;  // [bp-0xa18]
    char v3;  // [bp-0xa10]
    char v4;  // [bp-0x44]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    memset(v7, 0, 24);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(v7, i, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "/dev/urandom", 12);
    std::__1::random_device::random_device(&v4, &v3);
    sub_63e0c(&v3, std::__1::random_device::operator()(&v4));
    v2 = 5.411089266966e-312;
    if (i)
    {
        v9 = 0;
        do
        {
            v10 = sub_3d98f8(&v2, &v3, &v2);
            *(char *)sub_9c78(v7, v9) = v10;
            v9 += 1;
        } while (i != v9);
    }
    return &v4;
}
