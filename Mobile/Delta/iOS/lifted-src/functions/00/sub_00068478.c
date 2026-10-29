/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x68478..0x684f4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_68478_0 {
    char field_0;
} st_68478_0;


long long sub_68478(unsigned long a0, long long a1, unsigned long a2, long long a3)
{
    long long v4;  // x0
    st_68478_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_68478_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_95fa88(a1);
    if (!v4)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a3, "OpenSSL failed - peer didn't present a X509 certificate.");
        return v4 != 0;
    }
    sub_afc404(v4);
    return v4 != 0;
}
