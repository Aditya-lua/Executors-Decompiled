/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d9c14..0x3da060 (1100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d9c14_0 {
    char field_0;
} st_3d9c14_0;

extern char g_10002b0;

char * sub_3d9c14(void)
{
    unsigned long long v15;  // x0
    __m128i v25;  // q4
    __m128i v26;  // q6
    __m128i v27;  // q0
    unsigned long long idx;  // x14
    unsigned long long v29;  // x10
    unsigned long long v30;  // x9
    uint128_t v31;  // q2
    unsigned long long v32;  // d0
    unsigned long long index;  // x8
    unsigned long long v37;  // d1
    unsigned long v38;  // x8
    unsigned int v39;  // x20
    unsigned long v40;  // x24
    unsigned long long idx1;  // x9
    unsigned int v19;  // x13
    unsigned int v20;  // x14
    unsigned long long v21;  // x11
    unsigned long long v22;  // x8
    uint128_t v23;  // q0
    __m128i v24;  // q2
    st_3d9c14_0 **v0;  // [bp-0xa78], Other Possible Types: char
    st_3d9c14_0 *v1;  // [bp-0xa70]
    unsigned long long v2;  // [bp-0xa68]
    unsigned long long v3;  // [bp-0xa8]
    char v4;  // [bp-0x9c]
    unsigned int iter;  // [bp-0x98]
    char v6;  // [bp-0x90], Other Possible Types: unsigned int
    unsigned int v7;  // [bp-0x88]
    unsigned int v8;  // [bp-0x80]
    unsigned int v9;  // [bp-0x79]
    unsigned long v10;  // [bp-0x68], Other Possible Types: unsigned long long
    char v11;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long v12;  // [bp-0x58]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, "/dev/urandom", 12);
    std::__1::random_device::random_device(&v4, &v2);
    v15 = std::__1::random_device::operator()(&v4);
    sub_3d9bdc(&v2, std::__1::random_device::operator()(&v4) & 0xffffffff | v15 * 0x100000000);
    index = v3;
    idx1 = index + 1 - 312 * (index + 1 >> 3) / 39;
    v19 = 13043109905998158313;
    if ((&v2)[idx1] & 1)
        v20 = 13043109905998158313;
    else
        v20 = 0;
    v21 = v20 ^ (&v2)[156 + index + -0x138 * (index + 156 >> 3) / 39] ^ ((&v2)[idx1] & 0x7ffffffe | (&v2)[index] & 0xffffffff80000000) >> 1;
    (&v2)[index] = v21;
    v22 = 0x71d67fffeda60000 & (v21 >> 29 & 0x5555555555555555 ^ v21) * 0x20000 ^ v21 >> 29 & 0x5555555555555555 ^ v21;
    v23 = CONCAT(0xfff7eee000000000 & v22 * 0x2000000000 ^ v22 ^ (0xfff7eee000000000 & v22 * 0x2000000000 ^ v22) >> 43, 0xfff7eee000000000 & v22 * 0x2000000000 ^ v22 ^ (0xfff7eee000000000 & v22 * 0x2000000000 ^ v22) >> 43);
    v24 = __dirty_unsupported_Iop_Sh64Ux2(v23, 0xffffffffffffffe8fffffffffffffff0);
    v25 = __dirty_unsupported_Iop_Sh64Ux2(v23, 0xfffffffffffffff80000000000000000);
    v26 = __dirty_unsupported_Iop_Sh64Ux2(v23, 0xffffffffffffffc8ffffffffffffffd0);
    v27 = __dirty_unsupported_Iop_Sh64Ux2(v23, 0xffffffffffffffd8ffffffffffffffe0);
    if (idx1 == 311)
        idx = 0;
    else
        idx = idx1 + 1;
    if (!((&v2)[idx] & 1))
        v19 = 0;
    v29 = v19 ^ (&v2)[156 + idx1 + -0x138 * (idx1 + 156) / 312] ^ ((&v2)[idx] & 0x7ffffffe | (&v2)[idx1] & 0xffffffff80000000) >> 1;
    (&v2)[idx1] = v29;
    v30 = 0x71d67fffeda60000 & (v29 >> 29 & 0x5555555555555555 ^ v29) * 0x20000 ^ v29 >> 29 & 0x5555555555555555 ^ v29;
    v31 = CONCAT(0xfff7eee000000000 & v30 * 0x2000000000 ^ v30 ^ (0xfff7eee000000000 & v30 * 0x2000000000 ^ v30) >> 43, 0xfff7eee000000000 & v30 * 0x2000000000 ^ v30 ^ (0xfff7eee000000000 & v30 * 0x2000000000 ^ v30) >> 43);
    v32 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(CatEvenLanesV(CatEvenLanesV(v26, v27), CatEvenLanesV(v24, v25))));
    v37 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(CatEvenLanesV(CatEvenLanesV(__dirty_unsupported_Iop_Sh64Ux2(v31, 0xffffffffffffffc8ffffffffffffffd0), __dirty_unsupported_Iop_Sh64Ux2(v31, 0xffffffffffffffd8ffffffffffffffe0)), CatEvenLanesV(__dirty_unsupported_Iop_Sh64Ux2(v31, 0xffffffffffffffe8fffffffffffffff0), __dirty_unsupported_Iop_Sh64Ux2(v31, 0xfffffffffffffff80000000000000000)))));
    v10 = v32;
    v11 = v37;
    v3 = idx;
    v6 = 0;
    v7 = 0;
    v9 = 0;
    v8 = 0;
    v6 = (unsigned int)(8.238662617e-315 >> 0);
    iter = 0;
    if (26 >= iter)
    {
        do
        {
            *((char *)&v6 + iter) = (char)(iter + 2425438417 + *((char *)&v6 + iter) - (iter + 2425438417 & *((char *)&v6 + iter)) * 2) + 73;
            iter += 1;
        } while (iter < 27);
    }
    *((char *)&v10 + 6) = *(char *)((void*)&v10 + 6) & 15 | (char)v6;
    v6 = 0;
    v7 = 0;
    v9 = 0;
    v8 = 0;
    v6 = (unsigned int)(1.6226699665e-314 >> 0);
    iter = 0;
    if (26 >= iter)
    {
        do
        {
            (&v6)[iter] = iter + 1731038880 + (&v6)[iter] - (iter + 1731038880 & (&v6)[iter]) * 2 - 96;
            iter += 1;
        } while (iter < 27);
    }
    v11 = (char)v11 & 63 | v6;
    memset(v38, 0, 24);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(v38, 36);
    v39 = 0;
    do
    {
        v40 = *((char *)&v10 + v39);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v38, *(char *)((v40 >> 4) + 0xc7fcaf));
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v38, *(char *)((v40 & 15) + 0xc7fcaf));
        if ((v39 & 11) == 3 || v39 == 9 || v39 == 5)
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v38, 45);
    } while ((v39 += 1, v39 != 16));
    if (*(long long *)&g_10002b0 == v12)
        return &v4;
    __Unwind_Resume(___stack_chk_fail());
}
