/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6bab4..0x6bb00 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_6bab4(long long a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    std::__1::mutex::lock(a0 + 1096);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a0 + 904, a1);
    std::__1::mutex::unlock();
    return;
}
