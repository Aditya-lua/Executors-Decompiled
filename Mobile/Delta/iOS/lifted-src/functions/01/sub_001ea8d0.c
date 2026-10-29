/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ea8d0..0x1ea924 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1ea8d0(unsigned long a0, char *i, char *a2, long long a3)
{
    char *v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (i == a2)
        return i;
    do
    {
        v2 = i + 1;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a3, *i);
        i = v2;
    } while (i != a2);
    return a2;
}
