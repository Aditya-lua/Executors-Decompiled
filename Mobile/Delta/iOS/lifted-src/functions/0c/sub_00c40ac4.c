/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc40ac4..0xc40ff0 (1324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_efd030;
extern long long g_efd448;
extern char g_f143f8;
extern unsigned int g_f14418;
extern unsigned long long g_f14421;

unsigned int sub_c40ac4(void)
{
    unsigned int v14;  // x0
    __m128i v15;  // q0
    unsigned int v24;  // x9
    unsigned long long v25;  // 4106
    unsigned int v26;  // x10
    unsigned int v27;  // x23
    unsigned int v28;  // x24
    unsigned int v29;  // x24
    unsigned long long v30;  // 4106
    unsigned int v31;  // w8
    unsigned int v32;  // w8
    unsigned long long v34;  // 4102
    unsigned int len;  // x20
    unsigned int ptr;  // x0
    unsigned int v37;  // x1
    unsigned int v38;  // x9
    unsigned int v39;  // x0
    unsigned int v40;  // w10
    unsigned int v41;  // x0
    __m128i v18;  // q1
    __m128i v20;  // q1
    __m128i v21;  // q0
    uint128_t v22;  // q0
    unsigned int v0;  // [bp-0x218], Other Possible Types: unsigned long long
    void* v1;  // [bp-0x210], Other Possible Types: unsigned long
    unsigned int v2;  // [bp-0x208]
    char v3[8];  // [bp-0x200]
    unsigned int v4;  // [bp-0x1f8]
    unsigned int v5;  // [bp-0x1f4]
    unsigned int v6;  // [bp-0x1f3]
    unsigned int v7;  // [bp-0x1f2]
    unsigned int v8;  // [bp-0x80], Other Possible Types: unsigned long, unsigned long long
    unsigned int *v9;  // [bp-0x78], Other Possible Types: unsigned int
    unsigned int v10;  // [bp-0x70]
    unsigned int v11;  // [bp-0x60]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = g_f143f8 - 1;
    if ((char)v14 < 3)
        return v14;
    strncpy(&v3[6], "ACKTRACE", 8);
    strncpy(v3, "RUST_BAC", 8);
    v7 = 0;
    v15 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpeq_epi8((uint128_t)v3, _mm_setzero_si128()));
    v18 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi8(v15, v15)) & ~__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi16(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v4), 8), _mm_setzero_si128())));
    v20 = (__m128i)_INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v18, v15), _mm_unpacklo_epi64(v18, v15))), 4, _mm_extract_epi32(v15, 1));
    v21 = __dirty_unsupported_Iop_ZeroHI64ofV128(ShlNV(v20, 7));
    v22 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v21));
    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_min_epu8(_mm_min_epu8(_mm_min_epu8(_mm_min_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))))), _mm_min_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))))))), _mm_min_epu8(_mm_min_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))))), _mm_min_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))))))), _mm_min_epu8(_mm_min_epu8(_mm_min_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))))), _mm_min_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))))))), _mm_min_epu8(_mm_min_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))))), _mm_min_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v22, v22), _mm_unpacklo_epi64(v22, v22)))))))))) & 1 && v5 && v6)
    {
        v24 = *(long long *)&g_f14418;
        while (1)
        {
            v25 = arm64g_calculate_condition(130, v24, 0x11, 0);
            if (!(v25 & 1) && v24 != 1 && !(v24 >> 1 & 1))
            {
                /* unsupported instruction */;
                v26 = /* unsupported instruction */;
                /* unsupported instruction */;
                if (v26 == v24)
                {
                    /* unsupported instruction */;
                    v24 = v26;
                    if (!(/* unsupported instruction */ ^ 1))
                        break;
                }
                else
                {
                    /* unsupported instruction */;
                    v24 = v26;
                    if (0)
                        break;
                }
            }
            else
            {
                v27 = 0;
                v11 = 0;
                v8 = 0;
                v10 = 0;
                v28 = *(long long *)&g_f14418;
                while (1)
                {
                    v29 = v28;
                    if (v29 != 1 && (v30 = arm64g_calculate_condition(130, v29, 0x11, 0), !(v30 & 1) && !(v29 >> 1 & 1)))
                    {
                        /* unsupported instruction */;
                        v28 = /* unsupported instruction */;
                        /* unsupported instruction */;
                        if (v28 == v29)
                        {
                            /* unsupported instruction */;
                            if (!(/* unsupported instruction */ ^ 1))
                                break;
                            else
                                goto LABEL_c40c14;
                        }
                        else
                        {
                            /* unsupported instruction */;
                            if (0)
                                break;
                            else
                                goto LABEL_c40c14;
                        }
                        goto LABEL_c40c14;
                    }
                    else if (v29 >> 1 & 1 || v27 >= 7)
                    {
                        if (!*(unsigned long long *)((void*)&v10 + 8))
                            sub_c7687c(&v10 + 2);
                        *(char *)&v11 = 0;
                        v8 = v29 & 0xfffffffffffffff0;
                        v9 = 0;
                        if (!(v29 >> 1 & 1))
                        {
                            *(unsigned long **)&v10 = &v8;
                            /* unsupported instruction */;
                            v28 = /* unsupported instruction */;
                            /* unsupported instruction */;
                            if (v28 == v29)
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                if (!(/* unsupported instruction */ ^ 1))
                                    goto LABEL_c40d68;
                            }
                            else
                            {
                                /* unsupported instruction */;
                                if (0)
                                {
                                    while (1)
                                    {
LABEL_c40d68:
                                        /* unsupported instruction */;
                                        if ((char)v11)
                                            break;
                                        if (!*(unsigned long long *)((void*)&v10 + 8))
                                        {
                                            sub_c73c64(&g_efd448);
                                            __debugbreak();
                                        }
                                        do
                                        {
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                        } while (/* unsupported instruction */ ^ 1);
                                        if (/* unsupported instruction */ != 1)
                                        {
                                            do
                                            { } while (_dispatch_semaphore_wait(*(long long *)(*(unsigned long long *)((void*)&v10 + 8) + 40), -0x1));
                                            do
                                            {
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                                /* unsupported instruction */;
                                            } while (/* unsupported instruction */ ^ 1);
                                        }
                                    }
                                    v27 = 0;
                                    v28 = *(long long *)&g_f14418;
                                    continue;
                                }
                            }
                        }
                        else
                        {
                            *(unsigned long long *)&v10 = 0;
                            /* unsupported instruction */;
                            v28 = /* unsupported instruction */;
                            /* unsupported instruction */;
                            if (v28 == v29)
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                if (!(/* unsupported instruction */ ^ 1))
                                    goto LABEL_c40ccc;
                            }
                            else
                            {
                                /* unsupported instruction */;
                                if (0)
                                {
LABEL_c40ccc:
                                    if (!(v29 >> 2 & 1))
                                    {
                                        sub_c40784(&g_f14418);
                                        goto LABEL_c40d68;
                                    }
                                }
                            }
                        }
LABEL_c40c14:
                    }
                    else
                    {
                        v31 = 1;
                        do
                        {
                            v32 = v31;
                            /* unsupported instruction */;
                            v31 = v32 + 1;
                        } while (!(v32 >> ((char)v27 & 31)));
                        v28 = *(long long *)&g_f14418;
                        v27 += 1;
                    }
                }
                if (*(unsigned long long *)((void*)&v10 + 8))
                {
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v34 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (!(v34 & 1))
                    {
                        /* unsupported instruction */;
                        sub_c40714(*(unsigned long long *)((void*)&v10 + 8));
                        break;
                    }
                }
            }
        }
        v8 = &g_f14421;
        v9 = &g_f14418;
        if (_getenv(v3))
        {
            len = _strlen();
            if (len)
            {
                ptr = _malloc(len);
                if (!ptr)
                {
                    sub_c6b970(1, len);
                    __debugbreak();
                }
                _memcpy();
            }
            else
            {
                ptr = 1;
            }
            v0 = len;
            v1 = (void*)ptr;
            v2 = len;
        }
        else
        {
            v0 = 0x8000000000000000;
        }
        v37 = *(long long *)&g_f14418;
        /* unsupported instruction */;
        while (1)
        {
            if (v37 >> 1 & 1 && !(v37 >> 3 & 1))
            {
                sub_c79b24(&g_f14418);
                break;
            }
            /* unsupported instruction */;
            v38 = /* unsupported instruction */;
            /* unsupported instruction */;
            if (v38 == v37)
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                v37 = v38;
                if (!(/* unsupported instruction */ ^ 1))
                    break;
            }
            else
            {
                /* unsupported instruction */;
                v37 = v38;
                if (0)
                    break;
            }
        }
        if (v0 == 9223372036854775809)
        {
            sub_c40ff0(&v1);
        }
        else if (v0 != 0x8000000000000000)
        {
            switch (v2)
            {
            case 4:
                if (*(int *)v1 != 1819047270)
                    goto LABEL_c40f28;
                if (v0)
                    _free();
                v39 = 1;
                goto LABEL_c40eb4;
            case 1:
                if (*(char *)v1 != 48)
                    goto LABEL_c40f28;
                if (v0)
                {
                    _free();
                    break;
                }
                break;
            default:
LABEL_c40f28:
                if (v0)
                    _free();
                v39 = 0;
LABEL_c40eb4:
                while (1)
                {
                    /* unsupported instruction */;
                    v40 = /* unsupported instruction */;
                    if (v40)
                        break;
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        return v39;
                }
                /* unsupported instruction */;
                if (v40 < 4)
                    v41 = 33619971 >> ((char)v40 * 8 & 31);
                else
                    v41 = 3;
                return v41;
            }
        }
    }
    else
    {
        v0 = 9223372036854775809;
        v1 = &g_efd030;
        sub_c40ff0(&v1);
    }
    v39 = 2;
    goto LABEL_c40eb4;
}
