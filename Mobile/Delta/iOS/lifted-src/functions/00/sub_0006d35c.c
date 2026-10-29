/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6d35c..0x6d614 (696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

double sub_6d35c(void* a0, void* a1)
{
    uint128_t v9;  // q0
    uint128_t v10;  // q2
    unsigned int v19;  // w14
    unsigned int v20;  // w9
    unsigned int v21;  // w12
    unsigned int v22;  // w9
    unsigned int v23;  // w11
    __m128i v24;  // q1
    __m128i v26;  // q2
    uint128_t v27;  // q1
    uint128_t v28;  // q3
    uint128_t v11;  // q0
    unsigned int v29;  // w10
    unsigned int v30;  // w12
    unsigned int v31;  // w13
    unsigned int v32;  // w11
    uint128_t v33;  // q3
    __m128i v35;  // q0
    unsigned long long v37;  // d1
    unsigned int v38;  // w10
    uint128_t v12;  // q1
    unsigned int v39;  // w9
    unsigned int v40;  // w11
    unsigned int v41;  // w8
    __m128i v42;  // q0
    __m128i v43;  // q1
    uint128_t v13;  // q2
    unsigned int v14;  // w11
    unsigned int v15;  // w10
    unsigned int v16;  // w12
    unsigned int v17;  // w14
    unsigned int v18;  // w10
    char v0;  // [bp-0x41]
    uint128_t v1;  // [bp-0x40]
    unsigned int v2;  // [bp-0x40]
    uint128_t v3;  // [bp-0x3c]
    unsigned int v4;  // [bp-0x38]
    unsigned int v5;  // [bp-0x30]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v9 = __dirty_unsupported_Iop_SliceV128(reverse((int128_t)a0[4]), reverse((int128_t)a0[4]), 8);
    v1 = v9;
    v5 = *(int *)a0;
    sub_7081c(&v0, &v1, a1);
    v10 = __double_as_longlong((double)a1[52]);
    v11 = __double_as_longlong((double)a1[8]);
    v12 = __dirty_unsupported_Iop_ZeroHI64ofV128(v11 ^ v10);
    v13 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)a1 ^ __double_as_longlong((double)a1[32]));
    v14 = *(unsigned int *)&v1;
    v15 = *(unsigned int *)((void*)&v1 + 4);
    v16 = v5;
    v17 = *(unsigned int *)((void*)&v1 + 8);
    v18 = __ROL__(v15, 30);
    v19 = __ROL__(v17, 30);
    v20 = *(unsigned int *)&*(unsigned int *)(void*)&v10 + (v14 & v15 | v16 & ~v15) + (v17 * 32 | v17 >> 27) + *(unsigned int *)((void*)&v1 + 12) + 1518500249;
    v21 = v16 + (v18 & v17 | v14 & ~v17) + *(unsigned int *)((void*)&v10 + 4) + 1518500249 + (v20 * 32 | v20 >> 27);
    v22 = __ROL__(v20, 30);
    v23 = v14 + (int)a1[60] + (v19 & v20 | v18 & ~v20) + 1518500249 + (v21 * 32 | v21 >> 27);
    v24 = __dirty_unsupported_Iop_ZeroHI64ofV128(v12 ^ v13);
    v26 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v24, v24)), _mm_srli_epi32(v24, 31)));
    v27 = __dirty_unsupported_Iop_ZeroHI64ofV128(__double_as_longlong((double)a1[16]) ^ __double_as_longlong((double)a1[40]));
    v28 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)));
    v29 = v18 + (v22 & v21 | v19 & ~v21) + _mm_cvtsi128_si32(v26) + 1518500249 + (v23 * 32 | v23 >> 27);
    v30 = __ROL__(v21, 30);
    v31 = v19 + (v30 & v23 | v22 & ~v23) + _mm_extract_epi32(v26, 1) + 1518500249 + (v29 * 32 | v29 >> 27);
    v32 = __ROL__(v23, 30);
    v33 = _INSERT(v28, 0, (int)a1[60]);
    v35 = __dirty_unsupported_Iop_ZeroHI64ofV128(v33 ^ __dirty_unsupported_Iop_ZeroHI64ofV128(v11 ^ v27));
    v37 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v35, v35)), _mm_srli_epi32(v35, 31)));
    *(long long *)a1 = _mm_cvtsi128_si64(v26);
    *(unsigned long long *)&a1[8] = v37;
    v38 = __ROL__(v29, 30);
    v2 = v32;
    v3 = _INSERT(v1, 0, v38);
    v39 = v22 + (v32 & v29 | v30 & ~v29) + (unsigned int)v37 + (v31 * 32 | v31 >> 27) + 1518500249;
    *(unsigned int *)((char *)&v3 + 8) = v39;
    v5 = v30 + (v38 & v31 | v32 & ~v31) + (v39 * 32 | v39 >> 27) + *(unsigned int *)((void*)&v37 + 4) + 1518500249;
    v4 = __ROL__(v31, 30);
    sub_6e04c(&v0, &v2, a1);
    sub_6def4(&v0, &v2, a1);
    v40 = v4;
    v41 = __ROL__((int)a1[12] ^ (int)a1[32] ^ (int)a1[52] ^ (int)a1[44], 1);
    *(unsigned int *)&a1[44] = v41;
    *(unsigned int *)((char *)&v3 + 12) = v41 + ((*(unsigned int *)&v3 | v40) & v2 | *(unsigned int *)&v3 & v40) + (*(unsigned int *)((void*)&v3 + 8) * 32 | *(unsigned int *)((void*)&v3 + 8) >> 27) + v5 + 2400959708;
    *(unsigned int *)((char *)&v3 + 4) = v40 * 0x40000000 | v40 >> 2;
    sub_6e410(&v0, &v2, a1);
    v42 = __dirty_unsupported_Iop_SliceV128(reverse(v3), reverse(v3), 8);
    v43 = *(int128_t *)a0;
    *(__m128i *)a0 = _mm_add_epi32(v43, v42);
    *(unsigned int *)&a0[16] = (int)a0[16] + v2;
    if (*(long long *)&g_10002b0 == v6)
        return _mm_cvtsi128_si64(_mm_add_epi32(v43, v42));
    ___stack_chk_fail();
}
