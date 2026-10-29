/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aca54..0x2acb58 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aca54_0 {
    char field_0;
} st_2aca54_0;

extern long long g_e7f640;

long long sub_2aca54(char *a0, long long a1)
{
    long long v6;  // x0
    st_2aca54_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2aca54_0 *v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (*a0 == 3)
        return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a1, sub_2aa1cc());
    v6 = ___cxa_allocate_exception(32);
    v2 = sub_2aeb88(a0);
    sub_2a9e4c("type must be string, but is ", &v2);
    sub_2ac7c4(302, &v3, a0);
    ___cxa_throw(v6, &g_e7f640, 0x2aedb8);
    __debugbreak();
}
