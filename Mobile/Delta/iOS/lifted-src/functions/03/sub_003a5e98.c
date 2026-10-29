/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a5e98..0x3a5efc (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_3a5e98(long long a0)
{
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v0, "/dev/urandom", 12);
    std::__1::random_device::random_device(a0, &v0);
    return a0;
}
