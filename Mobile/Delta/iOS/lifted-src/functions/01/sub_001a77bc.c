/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a77bc..0x1a7904 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

char * sub_1a77bc(void)
{
    long long v11;  // x8
    long long v12;  // x0
    long long v13;  // x0
    char v0;  // [bp-0x5c]
    char v1;  // [bp-0x58], Other Possible Types: unsigned long
    unsigned long v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x38], Other Possible Types: unsigned int
    unsigned int v5;  // [bp-0x34]
    unsigned int v6;  // [bp-0x30]
    unsigned int v7;  // [bp-0x2c]
    unsigned long v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v1, "/dev/urandom", 12);
    std::__1::random_device::random_device(&v0, &v1);
    v4 = std::__1::random_device::operator()(&v0);
    v5 = std::__1::random_device::operator()(&v0);
    v6 = std::__1::random_device::operator()(&v0);
    v7 = std::__1::random_device::operator()(&v0);
    v2 = 0;
    v3 = 0;
    v1 = 0;
    sub_1b5e34(&v1, &v4, &v8);
    sub_1bb3cc(v11, &v1);
    v4 = &v1;
    sub_1aedc(&v4);
    if (*(long long *)&g_10002b0 == v8)
        return &v0;
    v12 = ___stack_chk_fail();
    v4 = &v1;
    sub_1aedc(&v4);
    v13 = __Unwind_Resume(__Unwind_Resume(__Unwind_Resume(v12)));
    __Unwind_Resume(v13);
}
