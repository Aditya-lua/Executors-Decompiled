/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2afe80..0x2aff80 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2afe80(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x0
    unsigned long long len;  // x0
    unsigned long long v5;  // x0
    unsigned long long len1;  // x0
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    memset(v2, 0, 24);
    v3 = sub_6b08();
    len = _strlen(a1);
    v5 = sub_6b08(a2);
    len1 = _strlen(a3);
    v7 = sub_6b08(a4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(v2, len + v3 + v5 + len1 + v7 + sub_6b08(a5));
    return sub_2ae24c(v2, a0, a1, a2, a3, a4, a5);
}
