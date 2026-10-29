/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd0d98..0xd0ecc (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d0d98_0 {
    char field_0;
} st_d0d98_0;


char * sub_d0d98(long long a0)
{
    long long v5;  // x20
    long long v6;  // x21
    void* ptr;  // x8
    st_d0d98_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_d0d98_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2);
    v5 = sub_d0ed0(a0, &v2);
    if (!v5)
    {
        memset(ptr, 0, 24);
        return &v2;
    }
    _fseek(v5, 0, 2);
    v6 = _ftell(v5);
    _fseek(v5, 0, 0);
    memset(ptr, 0, 24);
    if (v6 < 1)
        return _fclose(v5);
    sub_31ef8(ptr, v6);
    sub_31ef8(ptr, _fread(*(long long *)ptr, 1, v6, v5));
    return _fclose(v5);
}
