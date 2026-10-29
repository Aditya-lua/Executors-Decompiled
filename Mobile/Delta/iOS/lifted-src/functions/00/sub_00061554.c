/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x61554..0x615d4 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_61554(unsigned long a0, long long a1, long long a2)
{
    unsigned long long v2;  // x0
    unsigned long long *v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "no error");
    if (sub_60b58(a2))
    {
        v2 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "cancellation requested");
        *v3 = 0;
        v3[1] = 0;
        return v2;
    }
}
