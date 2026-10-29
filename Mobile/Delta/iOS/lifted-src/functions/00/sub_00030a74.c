/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30a74..0x30acc (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_30a74(long long a0, unsigned long long a1)
{
    unsigned long long i;  // x19
    unsigned long long v4;  // x0
    char v0;  // [bp-0x21]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    do
    {
        i = a1;
        v0 = (char)i & 127 | (i > 127) * 128;
        v4 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a0, &v0, 1);
        a1 = i >> 7;
    } while (127 < i);
    return v4;
}
