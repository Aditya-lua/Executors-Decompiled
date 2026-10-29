/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4172a8..0x417304 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_4172a8(unsigned long a0, long long i, long long a2, long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (i == a2)
        return i;
    do
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a3, i);
        a3 += 24;
        i += 24;
    } while (i != a2);
    return a2;
}
