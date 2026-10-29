/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5637c4..0x5638ec (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5637c4_0 {
    char field_0;
} st_5637c4_0;


unsigned int sub_5637c4(unsigned int a0, unsigned int a1)
{
    __m128i v2;  // q0
    __m128i v3;  // q1
    unsigned int v12;  // w8
    unsigned int v13;  // w9
    unsigned int v14;  // w10
    unsigned int v15;  // w8
    unsigned int v16;  // w8
    unsigned int v17;  // w9
    unsigned int v18;  // w12
    char v19;  // x9
    char v20;  // x11
    __m128i v4;  // q2
    uint128_t v5;  // q0
    uint128_t v6;  // q1
    __m128i v9;  // q2
    unsigned long long v11;  // d0
    st_5637c4_0 *v0;  // [bp-0x10], Other Possible Types: unsigned int
    st_5637c4_0 **v1;  // [bp-0x8], Other Possible Types: char

    v0 = &v1;
    v1 = &v0;
    v2 = (__m128i)_INSERT((unsigned int)v1, 4, (unsigned int)v0);
    v3 = __dirty_unsupported_Iop_ZeroHI64ofV128(reverse(v2));
    v4 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v3, ~v2));
    v5 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v2, v3));
    v6 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v4, v4));
    v9 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(__dirty_unsupported_Iop_ZeroHI64ofV128(v6 | ~v5), __dirty_unsupported_Iop_ZeroHI64ofV128(~v5)));
    v11 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v9, __dirty_unsupported_Iop_ZeroHI64ofV128(v6 | v5)));
    v12 = *(unsigned int *)((void*)&v11 + 4);
    v13 = (v12 + 1 + ~v12 * 2 | 1) + (v12 + 1 & 1);
    v14 = (unsigned int)v11;
    v15 = (v14 - v12 + (v12 - 1 & ~v14)) * 2 + 3;
    v16 = ((v14 | v13) - (v13 & v14) ^ v15) + ((v14 | v13) - (v13 & v14) & v15) * 2;
    v17 = v16 - 1;
    v18 = -v16;
    v0 = (v17 ^ 175 | 0xfffffffe) + ((v17 ^ 175) + ((v18 | 175) + v16) * 2 & 0xfffffffe) + 1;
    v1 = v16 + ((v18 | 8) + v16) * 2 + (16 & ~(v17 * 2)) - 10;
    v19 = -(a1 * (v1 + v0) + (0xffffffff ^ a1 * (v1 + v0) * 2));
    v20 = (char)a0 + 1;
    return v20 + a1 * (v1 + v0) + (0xffffffff ^ a1 * (v1 + v0) * 2) + (v19 & ~a0) * 2 + (v20 + (v19 | ~a0)) * 2 - 2 & 0xff;
}
