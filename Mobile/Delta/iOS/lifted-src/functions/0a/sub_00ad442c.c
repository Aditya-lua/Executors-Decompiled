/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad442c..0xad45f0 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

long long sub_ad442c(uint128_t *a0, uint128_t *a1, unsigned long a2, unsigned int *a3)
{
    uint128_t v3;  // q17
    uint128_t v4;  // q4
    unsigned int *v12;  // x10
    __m128i v13;  // q3
    __m128i v14;  // q26
    __m128i v15;  // q0
    __m128i v16;  // q28
    __m128i v17;  // q31
    __m128i v18;  // q0
    __m128i v19;  // q27
    __m128i v20;  // q2
    __m128i v21;  // 4189
    char *v5;  // w11
    __m128i v22;  // q29
    __m128i v23;  // q30
    unsigned int v24;  // w7
    __m128i v25;  // q3
    __m128i v26;  // q0
    __m128i v27;  // q0
    __m128i v28;  // q2
    __m128i v29;  // 4352
    unsigned int v30;  // w7
    __m128i v31;  // q3
    unsigned int v6;  // w12
    __m128i v32;  // q0
    __m128i v33;  // q0
    __m128i v34;  // q2
    __m128i v35;  // 4519
    unsigned int v36;  // w7
    __m128i v37;  // q0
    __m128i v38;  // q0
    __m128i v39;  // q2
    __m128i v40;  // 4682
    unsigned int v41;  // w7
    unsigned int v7;  // w13
    uint128_t v43;  // q4
    uint128_t v44;  // q4
    uint128_t v45;  // q4
    uint128_t v46;  // q4
    unsigned long v47;  // x1
    uint128_t *v48;  // x26
    char v49;  // x7
    unsigned int v8;  // w14
    unsigned int v9;  // w15
    __m128i v10;  // q3
    char *v11;  // w11
    char v0;  // [bp-0x1]
    char v1;  // [bp+0x0]
    char v2;  // [bp+0xf]

    v4 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v3 ^ *a0);
    v5 = (char *)8;
    v6 = *(unsigned int *)&*(unsigned int *)(void*)&v4;
    v7 = *(unsigned int *)((void*)&v4 + 4);
    v8 = *(unsigned int *)((void*)&v4 + 8);
    v9 = *(unsigned int *)((void*)&v4 + 12);
    do
    {
        v11 = v5;
        v12 = a3 + 2;
        v13 = (__m128i)_INSERT(v10, 0, __int_as_float(v8 ^ v9 ^ *a3 ^ v7));
        v15 = _mm_and_si128(PermV(v13, _mm_and_si128(v14, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v14));
        v18 = _mm_and_si128(PermV(v16, _mm_and_si128(_mm_and_si128(v15, v17), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v15, v17)));
        v20 = _mm_and_si128(PermV(v19, _mm_and_si128(ShrNV(v15, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v15, 4)));
        v21 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v20, v18), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v20) ^ _mm_cvtsi128_si64(v18) ^ 0);
        v24 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v22, _mm_and_si128(ShrNV(v21, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v21, 4))), _mm_and_si128(PermV(v23, _mm_and_si128(_mm_and_si128(v21, v17), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v21, v17)))));
        v6 ^= v24 ^ (v24 * 4 | v24 >> 30) ^ (v24 * 0x400 | v24 >> 22) ^ (v24 * 0x40000 | v24 >> 14) ^ (v24 * &g_1000000 | v24 >> 8);
        v25 = (__m128i)_INSERT(v13, 0, __int_as_float(v8 ^ v9 ^ v6 ^ a3[1]));
        v26 = _mm_and_si128(PermV(v25, _mm_and_si128(v14, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v14));
        v27 = _mm_and_si128(PermV(v16, _mm_and_si128(_mm_and_si128(v26, v17), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v26, v17)));
        v28 = _mm_and_si128(PermV(v19, _mm_and_si128(ShrNV(v26, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v26, 4)));
        v29 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v28, v27), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v28) ^ _mm_cvtsi128_si64(v27) ^ 0);
        v30 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v22, _mm_and_si128(ShrNV(v29, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v29, 4))), _mm_and_si128(PermV(v23, _mm_and_si128(_mm_and_si128(v29, v17), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v29, v17)))));
        a3 = v12 + 2;
        v7 ^= v30 ^ (v30 * 4 | v30 >> 30) ^ (v30 * 0x400 | v30 >> 22) ^ (v30 * 0x40000 | v30 >> 14) ^ (v30 * &g_1000000 | v30 >> 8);
        v31 = (__m128i)_INSERT(v25, 0, __int_as_float(v6 ^ v7 ^ *v12 ^ v9));
        v32 = _mm_and_si128(PermV(v31, _mm_and_si128(v14, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v14));
        v33 = _mm_and_si128(PermV(v16, _mm_and_si128(_mm_and_si128(v32, v17), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v32, v17)));
        v34 = _mm_and_si128(PermV(v19, _mm_and_si128(ShrNV(v32, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v32, 4)));
        v35 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v34, v33), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v34) ^ _mm_cvtsi128_si64(v33) ^ 0);
        v36 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v22, _mm_and_si128(ShrNV(v35, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v35, 4))), _mm_and_si128(PermV(v23, _mm_and_si128(_mm_and_si128(v35, v17), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v35, v17)))));
        v8 ^= v36 ^ (v36 * 4 | v36 >> 30) ^ (v36 * 0x400 | v36 >> 22) ^ (v36 * 0x40000 | v36 >> 14) ^ (v36 * &g_1000000 | v36 >> 8);
        v10 = (__m128i)_INSERT(v31, 0, __int_as_float(v6 ^ v7 ^ v8 ^ v12[1]));
        v37 = _mm_and_si128(PermV(v10, _mm_and_si128(v14, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v14));
        v38 = _mm_and_si128(PermV(v16, _mm_and_si128(_mm_and_si128(v37, v17), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v37, v17)));
        v39 = _mm_and_si128(PermV(v19, _mm_and_si128(ShrNV(v37, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v37, 4)));
        v40 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v39, v38), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v39) ^ _mm_cvtsi128_si64(v38) ^ 0);
        v41 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v22, _mm_and_si128(ShrNV(v40, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v40, 4))), _mm_and_si128(PermV(v23, _mm_and_si128(_mm_and_si128(v40, v17), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v40, v17)))));
    } while ((v9 ^= v41 ^ (v41 * 4 | v41 >> 30) ^ __ROL__(v41, 10) ^ __ROL__(v41, 18) ^ __ROL__(v41, 24), v5 = v11 - 1, v11 != 1));
    v43 = _INSERT(_INSERT(v4, 0, __int_as_float(v9)), 4, v8);
    v44 = _INSERT(v43, 8, v7);
    v45 = _INSERT(v44, 12, v6);
    v46 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v45);
    *a1 = v3 ^ v46;
    v47 = a1 + 1;
    v48 = v47 - 16;
    v49 = *(char *)(v48 + &v0);
    *(char *)(v48 + &v0) = *(char *)(&v2 + a0);
    (&v0)[v47] = v49;
    if (1 < &v1)
        goto LABEL_0xad45f0;
    else
        goto LABEL_0xad4608;
}
