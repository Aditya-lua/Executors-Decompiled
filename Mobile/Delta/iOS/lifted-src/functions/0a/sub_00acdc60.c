/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xacdc60..0xacdd30 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_df9b00;

uint128_t * sub_acdc60(uint128_t *a0, unsigned int *iter, unsigned int a2)
{
    uint128_t v1;  // q5
    __m128i v9;  // q4
    __m128i v10;  // q4
    unsigned int v12;  // w7
    unsigned int v13;  // w8
    uint128_t v14;  // q5
    unsigned long long v2;  // x6
    unsigned int *v3;  // x5
    __m128i v4;  // q0
    __m128i v5;  // q4
    unsigned long long v6;  // x6
    unsigned int *v7;  // x5
    __m128i v8;  // q4

    v1 = 0xb27022dc677d919756aa3350a3b1bac6 ^ __dirty_unsupported_Iop_Reverse8sIn32_x4(*a0);
    v2 = 32;
    v3 = &g_df9b00;
    v4 = _mm_set1_epi32(0x40404040);
    if (!a2)
        iter += 31;
    do
    {
        v6 = v2;
        v7 = v3 + 1;
        v8 = (__m128i)_INSERT(v5, 0, __int_as_float(*v3 ^ *(unsigned int *)((void*)&v1 + 4) ^ *(unsigned int *)((void*)&v1 + 8) ^ *(unsigned int *)((void*)&v1 + 12)));
        v9 = _mm_sub_epi8(v8, v4);
        v10 = _mm_sub_epi8(v9, v4);
        v5 = _mm_sub_epi8(v10, v4);
        v12 = _mm_cvtsi128_si32(_mm_or_si128(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(v5, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v5, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(v5, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v5, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(v5, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v5, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(v5, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v5))))), _mm_and_si128(_mm_cvtsi128_si32(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(v10, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v10, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(v10, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v10, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(v10, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v10, _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(v10, _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), v10)) | (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(v9, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v9, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(v9, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v9, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(v9, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v9, _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(v9, _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), v9)) | (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v8, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v8, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v8, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v8, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v8, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v8, _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), v8))) & (unsigned int)~CmpGTV(_mm_add_epi8(_mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), v9)) & (unsigned int)~CmpGTV(_mm_add_epi8(_mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), v10), ~CmpGTV(_mm_add_epi8(_mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), v5))));
        v13 = v12 ^ (v12 * 0x2000 | v12 >> 19) ^ (v12 * 0x800000 | v12 >> 9) ^ (unsigned int)v1;
        v14 = _INSERT(v1, 0, __int_as_float(v13));
        if (a2)
        {
            *iter = v13;
            iter += 1;
        }
        else
        {
            *iter = v13;
            iter = (char *)iter - 4;
        }
    } while ((v1 = _mm_and_si128(PermV(v14, _mm_and_si128(_mm_set_epi64x(216736831831411980, 795458214266537220), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 2, 1, 0, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4))), v2 = v6 - 1, v3 = v7, v6 != 1));
    return a0;
}
