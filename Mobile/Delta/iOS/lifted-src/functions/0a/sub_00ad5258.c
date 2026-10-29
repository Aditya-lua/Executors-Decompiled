/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad5258..0xad5430 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

long long sub_ad5258(unsigned long a0, unsigned long a1, unsigned long a2, unsigned int *a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, char a8, double a9, double a10, double a11, double a12, double a13, double a14, double a15, unsigned long a16, unsigned long a17, unsigned long a18, unsigned long a19, unsigned long a20, unsigned long a21, unsigned long a22, unsigned long a23, unsigned long a24, unsigned long a25, unsigned long a26, unsigned long a27, unsigned long a28, unsigned long a29, unsigned long a30, unsigned long a31)
{
    void* v1;  // x26
    char v2;  // x7
    unsigned int *v11;  // x10
    __m128i v12;  // q3
    __m128i v13;  // q26
    __m128i v14;  // q0
    __m128i v15;  // q28
    __m128i v16;  // q31
    __m128i v17;  // q0
    __m128i v18;  // q27
    __m128i v19;  // q2
    __m128i v20;  // 4189
    uint128_t v3;  // q18
    __m128i v21;  // q29
    __m128i v22;  // q30
    unsigned int v23;  // w7
    __m128i v24;  // q3
    __m128i v25;  // q0
    __m128i v26;  // q0
    __m128i v27;  // q2
    __m128i v28;  // 4352
    unsigned int v29;  // w7
    __m128i v30;  // q3
    uint128_t v4;  // q4
    __m128i v31;  // q0
    __m128i v32;  // q0
    __m128i v33;  // q2
    __m128i v34;  // 4519
    unsigned int v35;  // w7
    __m128i v36;  // q0
    __m128i v37;  // q0
    __m128i v38;  // q2
    __m128i v39;  // 4682
    unsigned int v40;  // w7
    char *v5;  // w11
    uint128_t v42;  // q4
    uint128_t v43;  // q4
    uint128_t v44;  // q4
    uint128_t v45;  // q4
    unsigned int v6;  // w12
    unsigned int v7;  // w13
    unsigned int v8;  // w14
    unsigned int v9;  // w15
    char *v10;  // w11
    char v0;  // [bp-0x1]

    do
    {
        v2 = *(char *)(v1 + &v0);
        *(char *)(v1 + &v0) = (&v0)[a0];
        (&v0)[a1] = v2;
    } while (1 < &a8);
    v4 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v3 ^ *(int128_t *)v1);
    v5 = (char *)8;
    v6 = *(unsigned int *)&*(unsigned int *)(void*)&v4;
    v7 = *(unsigned int *)((void*)&v4 + 4);
    v8 = *(unsigned int *)((void*)&v4 + 8);
    v9 = *(unsigned int *)((void*)&v4 + 12);
    do
    {
        v10 = v5;
        v11 = a3 + 2;
        v12 = (__m128i)_INSERT(a12, 0, __int_as_float(v8 ^ v9 ^ *a3 ^ v7));
        v14 = _mm_and_si128(PermV(v12, _mm_and_si128(v13, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v13));
        v17 = _mm_and_si128(PermV(v15, _mm_and_si128(_mm_and_si128(v14, v16), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v14, v16)));
        v19 = _mm_and_si128(PermV(v18, _mm_and_si128(ShrNV(v14, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v14, 4)));
        v20 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v19, v17), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v19) ^ _mm_cvtsi128_si64(v17) ^ 0);
        v23 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v21, _mm_and_si128(ShrNV(v20, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v20, 4))), _mm_and_si128(PermV(v22, _mm_and_si128(_mm_and_si128(v20, v16), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v20, v16)))));
        v6 ^= v23 ^ (v23 * 4 | v23 >> 30) ^ (v23 * 0x400 | v23 >> 22) ^ (v23 * 0x40000 | v23 >> 14) ^ (v23 * &g_1000000 | v23 >> 8);
        v24 = (__m128i)_INSERT(v12, 0, __int_as_float(v8 ^ v9 ^ v6 ^ a3[1]));
        v25 = _mm_and_si128(PermV(v24, _mm_and_si128(v13, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v13));
        v26 = _mm_and_si128(PermV(v15, _mm_and_si128(_mm_and_si128(v25, v16), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v25, v16)));
        v27 = _mm_and_si128(PermV(v18, _mm_and_si128(ShrNV(v25, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v25, 4)));
        v28 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v27, v26), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v27) ^ _mm_cvtsi128_si64(v26) ^ 0);
        v29 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v21, _mm_and_si128(ShrNV(v28, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v28, 4))), _mm_and_si128(PermV(v22, _mm_and_si128(_mm_and_si128(v28, v16), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v28, v16)))));
        a3 = v11 + 2;
        v7 ^= v29 ^ (v29 * 4 | v29 >> 30) ^ (v29 * 0x400 | v29 >> 22) ^ (v29 * 0x40000 | v29 >> 14) ^ (v29 * &g_1000000 | v29 >> 8);
        v30 = (__m128i)_INSERT(v24, 0, __int_as_float(v6 ^ v7 ^ *v11 ^ v9));
        v31 = _mm_and_si128(PermV(v30, _mm_and_si128(v13, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v13));
        v32 = _mm_and_si128(PermV(v15, _mm_and_si128(_mm_and_si128(v31, v16), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v31, v16)));
        v33 = _mm_and_si128(PermV(v18, _mm_and_si128(ShrNV(v31, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v31, 4)));
        v34 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v33, v32), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v33) ^ _mm_cvtsi128_si64(v32) ^ 0);
        v35 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v21, _mm_and_si128(ShrNV(v34, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v34, 4))), _mm_and_si128(PermV(v22, _mm_and_si128(_mm_and_si128(v34, v16), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v34, v16)))));
        v8 ^= v35 ^ (v35 * 4 | v35 >> 30) ^ (v35 * 0x400 | v35 >> 22) ^ (v35 * 0x40000 | v35 >> 14) ^ (v35 * &g_1000000 | v35 >> 8);
        a12 = (__m128i)_INSERT(v30, 0, __int_as_float(v6 ^ v7 ^ v8 ^ v11[1]));
        v36 = _mm_and_si128(PermV(a12, _mm_and_si128(v13, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v13));
        v37 = _mm_and_si128(PermV(v15, _mm_and_si128(_mm_and_si128(v36, v16), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v36, v16)));
        v38 = _mm_and_si128(PermV(v18, _mm_and_si128(ShrNV(v36, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v36, 4)));
        v39 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v38, v37), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v38) ^ _mm_cvtsi128_si64(v37) ^ 0);
        v40 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v21, _mm_and_si128(ShrNV(v39, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v39, 4))), _mm_and_si128(PermV(v22, _mm_and_si128(_mm_and_si128(v39, v16), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v39, v16)))));
    } while ((v9 ^= v40 ^ (v40 * 4 | v40 >> 30) ^ __ROL__(v40, 10) ^ __ROL__(v40, 18) ^ __ROL__(v40, 24), v5 = v10 - 1, v10 != 1));
    v42 = _INSERT(_INSERT(v4, 0, __int_as_float(v9)), 4, v8);
    v43 = _INSERT(v42, 8, v7);
    v44 = _INSERT(v43, 12, v6);
    v45 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v44);
    *(uint128_t *)v1 = v3 ^ v45;
    return a0;
}
