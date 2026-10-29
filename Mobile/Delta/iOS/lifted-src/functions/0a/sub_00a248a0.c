/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa248a0..0xa249b4 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_a248a0(long long *a0)
{
    uint128_t *v2;  // x0
    __m128i v3;  // q0
    unsigned long long v4;  // d0
    uint128_t *v5;  // x0
    __m128i v6;  // q0
    uint128_t *v7;  // x0
    uint128_t v8;  // q0
    unsigned long long v10;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_9e4290(a0[2]) == 4 && sub_9e4290(a0[3]) == 4)
    {
        v2 = sub_954340(a0[2]);
        v3 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(~CatEvenLanesV(_mm_cmpeq_epi64(v2[1], _mm_set_epi64x(1770019616739251654, 8789745728267363600)), _mm_cmpeq_epi64(*v2, _mm_set_epi64x(0x75ba95fc5fedb601, 8784043285714375740)))));
        v4 = __dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v3, v3), _mm_unpacklo_epi64(v3, v3))))))));
        if (!((unsigned int)v4 & 1))
        {
            v5 = sub_954340(a0[3]);
            v6 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(~CatEvenLanesV(_mm_cmpeq_epi64(v5[1], _mm_set_epi64x(0x8571ff1825885d85, 15197544864945402661)), _mm_cmpeq_epi64(*v5, _mm_set_epi64x(10037038012062884956, 15992936863339206154)))));
            v4 = __dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v6, v6), _mm_unpacklo_epi64(v6, v6))))))));
            if (!((unsigned int)v4 & 1))
            {
                v7 = sub_954340(a0[4]);
                if (sub_9e4290(a0[4]) == 4)
                {
                    v8 = 0xffffffff000000000000000000000001 ^ *v7 | 0xfffffffeffffffffffffffff ^ v7[1];
                    v10 = __dirty_unsupported_Iop_ZeroHI64ofV128(v8 | __dirty_unsupported_Iop_SliceV128(v8, v8, 8));
                    return v10;
                }
            }
        }
    }
    return v4;
}
