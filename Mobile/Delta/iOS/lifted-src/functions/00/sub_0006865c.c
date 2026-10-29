/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6865c..0x686d4 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6865c_0 {
    char padding_0[104];
    long long field_68;
} st_6865c_0;


long long sub_6865c(st_6865c_0 *a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_95419c();
    if (!v2)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "SSLv23_client_method failure");
        return 0;
    }
    a0->field_68 = v2;
    v3 = sub_961bfc();
    if (!v3)
        return v3;
    sub_960f58();
    sub_962f5c(v3, 0x2400000);
    return v3;
}
