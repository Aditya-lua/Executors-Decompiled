/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x28d78..0x28e54 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_28d78(unsigned long a0, void* a1)
{
    unsigned int v0;  // w8
    __m128i v1;  // q0
    unsigned long v3;  // d0
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned int v6;  // w8

    v0 = *(int *)a1;
    if (v0 == 5)
    {
        return 19349663 * ((int)a1[20] ^ (int)a1[16]) ^ 73856093 * ((int)a1[12] ^ (int)a1[8]) ^ 0x4f9ffb7 * ((int)a1[28] ^ (int)a1[24]) ^ 39916801 * ((int)a1[36] ^ (int)a1[32]);
    }
    else if (v0 == 4)
    {
        v1 = _mm_mullo_epi32(_mm_xor_si128((int128_t)a1[8], _mm_srli_epi32((int128_t)a1[8], 0x11)), _mm_set_epi32(39916801, 0x4f9ffb7, 19349663, 73856093));
        v3 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(__dirty_unsupported_Iop_SliceV128(v1, v1, 8), v1));
        return (unsigned int)__double_as_longlong(v3) ^ (unsigned int)(__double_as_longlong(v3) >> 32);
    }
    else
    {
        v4 = 1540483477 * v0 ^ (int)a1[12];
        v5 = 1540483477 * ((int)a1[8] ^ v4 >> 18);
        v6 = 1540483477 * (v4 ^ v5 >> 22);
        return 1540483477 * (v6 ^ 1540483477 * (v5 ^ v6 >> 0x11) >> 19);
    }
}
