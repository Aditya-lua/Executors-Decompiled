/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa85a88..0xa85fdc (1364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a85a88(uint128_t *a0, long long a1, long long a2, long long a3)
{
    uint128_t *iter;  // x19
    long long v5;  // x8
    __m128i v14;  // 4278
    __m128i v15;  // 4279
    __m128i v16;  // 4280
    __m128i v17;  // 4281
    __m128i v18;  // 4284
    __m128i v19;  // 4287
    __m128i v20;  // 4290
    __m128i v21;  // 4293
    __m128i v22;  // 4296
    __m128i v23;  // 4299
    __m128i v6;  // q4
    __m128i v24;  // 4302
    __m128i v25;  // 4305
    __m128i v26;  // 4322
    __m128i v27;  // 4323
    __m128i v28;  // 4324
    __m128i v29;  // 4327
    __m128i v30;  // 4330
    __m128i v31;  // 4333
    __m128i v32;  // 4336
    __m128i v33;  // 4345
    uint128_t *v7;  // x9
    __m128i v34;  // 4346
    __m128i v35;  // 4347
    __m128i v36;  // 4352
    __m128i v37;  // 4353
    __m128i v38;  // 4355
    __m128i v39;  // 4357
    __m128i v40;  // 4359
    __m128i v41;  // q7
    __m128i v42;  // q6
    __m128i v43;  // q5
    uint128_t v8;  // 4269
    __m128i v44;  // q16
    __m128i v45;  // q18
    __m128i v46;  // q16
    __m128i v47;  // q17
    __m128i v48;  // q18
    __m128i v49;  // q20
    __m128i v50;  // q21
    __m128i v51;  // q19
    __m128i v52;  // q23
    __m128i v53;  // q22
    uint128_t v9;  // 4271
    __m128i v54;  // q18
    __m128i v55;  // q19
    __m128i v56;  // q24
    __m128i v57;  // q25
    __m128i v58;  // q21
    __m128i v59;  // q25
    __m128i v60;  // q22
    __m128i v61;  // q17
    __m128i v62;  // q16
    __m128i v63;  // q20
    __m128i v10;  // 4273
    uint128_t *v64;  // x19
    __m128i v65;  // q16
    __m128i v66;  // q17
    __m128i v67;  // q23
    __m128i v68;  // q19
    __m128i v69;  // q21
    __m128i v70;  // q20
    __m128i v71;  // q18
    __m128i v72;  // q5
    __m128i v73;  // q19
    __m128i v11;  // 4275
    __m128i v74;  // q20
    __m128i v75;  // q7
    __m128i v76;  // q6
    __m128i v77;  // q22
    __m128i v78;  // q7
    __m128i v79;  // q6
    __m128i v80;  // q21
    long long v81;  // x19
    __m128i v12;  // 4276
    __m128i v13;  // 4277
    char v0;  // [bp-0xe8]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    iter = a0;
    v1 = *(long long *)&g_10002b0;
    if (sub_a8668c(&v0, 192, a1, a2, a3))
    {
        v5 = 0;
        v6 = _mm_set1_epi32(3329);
        do
        {
            v7 = &(&v0)[v5];
            v8 = v7[2];
            v9 = v7[1];
            v10 = *v7;
            v11 = __dirty_unsupported_Iop_SliceV128(v9, v10, 6);
            v12 = __dirty_unsupported_Iop_SliceV128(v9, v10, 12);
            v13 = __dirty_unsupported_Iop_SliceV128(v8, v9, 2);
            v14 = __dirty_unsupported_Iop_SliceV128(v8, v9, 8);
            v15 = __dirty_unsupported_Iop_SliceV128(v8, v9, 14);
            v16 = __dirty_unsupported_Iop_SliceV128(v10, v8, 4);
            v17 = __dirty_unsupported_Iop_SliceV128(v10, v8, 10);
            v18 = __dirty_unsupported_Iop_SliceV128(v10, v10, 3);
            v19 = __dirty_unsupported_Iop_SliceV128(v11, v11, 3);
            v20 = __dirty_unsupported_Iop_SliceV128(v12, v12, 3);
            v21 = __dirty_unsupported_Iop_SliceV128(v13, v13, 3);
            v22 = __dirty_unsupported_Iop_SliceV128(v14, v14, 3);
            v23 = __dirty_unsupported_Iop_SliceV128(v15, v15, 3);
            v24 = __dirty_unsupported_Iop_SliceV128(v16, v16, 3);
            v25 = __dirty_unsupported_Iop_SliceV128(v17, v17, 3);
            v26 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v15, v23), _mm_set_epi64x(0, 0xffffffffffff)) * 0x10000000000000000000000000000, _mm_and_si128(_mm_unpacklo_epi8(v14, v22), _mm_set_epi64x(0, 0xffffffffffff)) * 0x10000000000000000), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v13, v21), _mm_set_epi64x(0, 0xffffffffffff)) * 0x10000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)), 4))), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), 12);
            v27 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v17, v25), _mm_set_epi64x(0, 0xffffffffffff)) * 0x100000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v16, v24), _mm_set_epi64x(0, 0xffffffffffff)) * 0x100000000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi8(v15, v23), _mm_set_epi64x(0, 0xffffffffffff)), 2))), _mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v15, v23), _mm_set_epi64x(0, 0xffffffffffff)) * 0x10000000000000000000000000000, _mm_and_si128(_mm_unpacklo_epi8(v14, v22), _mm_set_epi64x(0, 0xffffffffffff)) * 0x10000000000000000), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v13, v21), _mm_set_epi64x(0, 0xffffffffffff)) * 0x10000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)), 4))), 8);
            v28 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v17, v25), _mm_set_epi64x(0, 0xffffffffffff)) * 0x100000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v16, v24), _mm_set_epi64x(0, 0xffffffffffff)) * 0x100000000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi8(v15, v23), _mm_set_epi64x(0, 0xffffffffffff)), 2))), 4);
            v29 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), 6);
            v30 = __dirty_unsupported_Iop_SliceV128(v26, v26, 6);
            v31 = __dirty_unsupported_Iop_SliceV128(v27, v27, 6);
            v32 = __dirty_unsupported_Iop_SliceV128(v28, v28, 6);
            v33 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(v27, v31), _mm_set_epi64x(0xffffffff, -1)) * 0x10000000000000000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi16(v26, v30), _mm_set_epi64x(0xffffffff, -1)), 4)), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), v29), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v26, v30), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), 12);
            v34 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(v28, v32), _mm_set_epi64x(0xffffffff, -1)) * 0x100000000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi16(v27, v31), _mm_set_epi64x(0xffffffff, -1)), 8)), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(v27, v31), _mm_set_epi64x(0xffffffff, -1)) * 0x10000000000000000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi16(v26, v30), _mm_set_epi64x(0xffffffff, -1)), 4)), 8);
            v35 = __dirty_unsupported_Iop_SliceV128(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), v29), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v26, v30), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(v28, v32), _mm_set_epi64x(0xffffffff, -1)) * 0x100000000, _mm_srli_si128(_mm_and_si128(_mm_unpacklo_epi16(v27, v31), _mm_set_epi64x(0xffffffff, -1)), 8)), 4);
            v36 = __dirty_unsupported_Iop_SliceV128(v34, v34, 4);
            v37 = __dirty_unsupported_Iop_SliceV128(v35, v35, 4);
            v38 = __dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi32(v36, v37), _mm_unpacklo_epi32(v36, v37), 8);
            v39 = __dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), v29), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v26, v30), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v33), _mm_unpacklo_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), v29), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v26, v30), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v33), 8);
            v40 = __dirty_unsupported_Iop_SliceV128(_mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), v29), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v26, v30), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v33), _mm_unpacklo_epi32(v34, v35)), _mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), v29), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v26, v30), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v33), _mm_unpacklo_epi32(v34, v35)), 8);
            v41 = _mm_unpacklo_epi64(_mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), v29), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v26, v30), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v33), _mm_unpacklo_epi32(v34, v35)), v38);
            v42 = _mm_unpacklo_epi64(v39, _mm_unpacklo_epi32(v36, v37));
            v43 = _mm_unpacklo_epi64(_mm_unpacklo_epi32(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi16(_mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v12, v20), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000000000000000, _mm_or_si128(_mm_and_si128(_mm_unpacklo_epi8(v11, v19), _mm_set_epi64x(0, 0xffffffffffff)) * 0x1000000000000, _mm_and_si128(_mm_unpacklo_epi8(v10, v18), _mm_set_epi64x(0, 0xffffffffffff)))), v29), _mm_set_epi64x(0xffffffff, -1)), _mm_and_si128(_mm_unpacklo_epi16(v26, v30), _mm_set_epi64x(0xffffffff, -1)) * 0x1000000000000000000000000), v33), v40);
            v44 = _mm_and_si128(PermV(v43, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4)));
            v45 = _mm_and_si128(PermV(v43, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0)));
            v46 = _mm_and_si128(PermV(v42, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4)));
            v47 = _mm_and_si128(PermV(v42, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0)));
            v48 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(v44, _mm_set1_epi32(-255)), _mm_srai_epi32(_mm_slli_epi32(v44, 27), 31)), _mm_srai_epi32(_mm_slli_epi32(v44, 28), 31)), _mm_srai_epi32(_mm_slli_epi32(v44, 26), 31)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v44, 1), _mm_set1_epi32(-127)), _mm_and_si128(_mm_srli_epi32(v44, 2), _mm_set1_epi32(-63))));
            v49 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(v45, _mm_set1_epi32(-255)), _mm_srai_epi32(_mm_slli_epi32(v45, 27), 31)), _mm_srai_epi32(_mm_slli_epi32(v45, 28), 31)), _mm_srai_epi32(_mm_slli_epi32(v45, 26), 31)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v45, 1), _mm_set1_epi32(-127)), _mm_and_si128(_mm_srli_epi32(v45, 2), _mm_set1_epi32(-63))));
            v50 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v45, 6), _mm_set1_epi32(-3)), _mm_srli_epi32(v45, 7)), _mm_and_si128(v47, _mm_set1_epi32(-255))), _mm_srai_epi32(_mm_slli_epi32(v47, 29), 31)), _mm_srai_epi32(_mm_slli_epi32(v47, 30), 31)), _mm_srai_epi32(_mm_slli_epi32(v47, 28), 31));
            v51 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v44, 6), _mm_set1_epi32(-3)), _mm_srli_epi32(v44, 7)), _mm_and_si128(v46, _mm_set1_epi32(-255))), _mm_srai_epi32(_mm_slli_epi32(v46, 29), 31)), _mm_srai_epi32(_mm_slli_epi32(v46, 30), 31)), _mm_srai_epi32(_mm_slli_epi32(v46, 28), 31));
            v52 = _mm_and_si128(PermV(v41, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4)));
            v53 = _mm_and_si128(PermV(v41, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0)));
            v54 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v48), v6), v48), _mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v49), v6), v49));
            v55 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v51, 15), v6), v51), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v50, 15), v6), v50));
            v56 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v52, 3), _mm_set1_epi32(-31)), _mm_srli_epi32(v52, 7)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v52, 2), _mm_set1_epi32(-63)), _mm_and_si128(_mm_srli_epi32(v52, 4), _mm_set1_epi32(-15)))), _mm_srai_epi32(_mm_slli_epi32(v52, 25), 31)), _mm_srai_epi32(_mm_slli_epi32(v52, 26), 31));
            v57 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v53, 3), _mm_set1_epi32(-31)), _mm_srli_epi32(v53, 7)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v53, 2), _mm_set1_epi32(-63)), _mm_and_si128(_mm_srli_epi32(v53, 4), _mm_set1_epi32(-15)))), _mm_srai_epi32(_mm_slli_epi32(v53, 25), 31)), _mm_srai_epi32(_mm_slli_epi32(v53, 26), 31));
            v58 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v56), v6), v56), _mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v57), v6), v57));
            v59 = _mm_and_si128(PermV(v43, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12)));
            v60 = _mm_and_si128(PermV(v43, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8)));
            v61 = _mm_add_epi32(_mm_sub_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v47, 5), _mm_set1_epi32(-7)), _mm_srli_epi32(v47, 7)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v47, 4), _mm_set1_epi32(-15)), _mm_and_si128(_mm_srli_epi32(v47, 6), _mm_set1_epi32(-3)))), _mm_and_si128(v53, _mm_set1_epi32(-255))), _mm_srai_epi32(_mm_slli_epi32(v53, 30), 31));
            v62 = _mm_add_epi32(_mm_sub_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v46, 5), _mm_set1_epi32(-7)), _mm_srli_epi32(v46, 7)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v46, 4), _mm_set1_epi32(-15)), _mm_and_si128(_mm_srli_epi32(v46, 6), _mm_set1_epi32(-3)))), _mm_and_si128(v52, _mm_set1_epi32(-255))), _mm_srai_epi32(_mm_slli_epi32(v52, 30), 31));
            v63 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v62, 15), v6), v62), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v61, 15), v6), v61));
            iter[3] = CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v63, v58), _mm_unpackhi_epi64(v54, v55)), CatOddLanesV(_mm_unpackhi_epi64(v63, v58), _mm_unpackhi_epi64(v54, v55)) * 0x10000);
            iter[2] = CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v63, v58), _mm_unpackhi_epi64(v54, v55)), CatEvenLanesV(_mm_unpackhi_epi64(v63, v58), _mm_unpackhi_epi64(v54, v55)) * 0x10000);
            iter[1] = CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v63, v58), _mm_unpacklo_epi64(v54, v55)), CatOddLanesV(_mm_unpacklo_epi64(v63, v58), _mm_unpacklo_epi64(v54, v55)) * 0x10000);
            *iter = CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v63, v58), _mm_unpacklo_epi64(v54, v55)), CatEvenLanesV(_mm_unpacklo_epi64(v63, v58), _mm_unpacklo_epi64(v54, v55)) * 0x10000);
            v64 = iter + 4;
            v65 = _mm_and_si128(PermV(v42, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12)));
            v66 = _mm_and_si128(PermV(v42, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8)));
            v67 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(v59, _mm_set1_epi32(-255)), _mm_srai_epi32(_mm_slli_epi32(v59, 27), 31)), _mm_srai_epi32(_mm_slli_epi32(v59, 28), 31)), _mm_srai_epi32(_mm_slli_epi32(v59, 26), 31)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v59, 1), _mm_set1_epi32(-127)), _mm_and_si128(_mm_srli_epi32(v59, 2), _mm_set1_epi32(-63))));
            v68 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(v60, _mm_set1_epi32(-255)), _mm_srai_epi32(_mm_slli_epi32(v60, 27), 31)), _mm_srai_epi32(_mm_slli_epi32(v60, 28), 31)), _mm_srai_epi32(_mm_slli_epi32(v60, 26), 31)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v60, 1), _mm_set1_epi32(-127)), _mm_and_si128(_mm_srli_epi32(v60, 2), _mm_set1_epi32(-63))));
            v69 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v60, 6), _mm_set1_epi32(-3)), _mm_srli_epi32(v60, 7)), _mm_and_si128(v66, _mm_set1_epi32(-255))), _mm_srai_epi32(_mm_slli_epi32(v66, 29), 31)), _mm_srai_epi32(_mm_slli_epi32(v66, 30), 31)), _mm_srai_epi32(_mm_slli_epi32(v66, 28), 31));
            v70 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v59, 6), _mm_set1_epi32(-3)), _mm_srli_epi32(v59, 7)), _mm_and_si128(v65, _mm_set1_epi32(-255))), _mm_srai_epi32(_mm_slli_epi32(v65, 29), 31)), _mm_srai_epi32(_mm_slli_epi32(v65, 30), 31)), _mm_srai_epi32(_mm_slli_epi32(v65, 28), 31));
            v71 = _mm_and_si128(PermV(v41, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12)));
            v72 = _mm_and_si128(PermV(v41, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8)));
            v73 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v67), v6), v67), _mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v68), v6), v68));
            v74 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v70, 15), v6), v70), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v69, 15), v6), v69));
            v75 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v71, 3), _mm_set1_epi32(-31)), _mm_srli_epi32(v71, 7)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v71, 2), _mm_set1_epi32(-63)), _mm_and_si128(_mm_srli_epi32(v71, 4), _mm_set1_epi32(-15)))), _mm_srai_epi32(_mm_slli_epi32(v71, 25), 31)), _mm_srai_epi32(_mm_slli_epi32(v71, 26), 31));
            v76 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v72, 3), _mm_set1_epi32(-31)), _mm_srli_epi32(v72, 7)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v72, 2), _mm_set1_epi32(-63)), _mm_and_si128(_mm_srli_epi32(v72, 4), _mm_set1_epi32(-15)))), _mm_srai_epi32(_mm_slli_epi32(v72, 25), 31)), _mm_srai_epi32(_mm_slli_epi32(v72, 26), 31));
            v77 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v75), v6), v75), _mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v76), v6), v76));
            v78 = _mm_add_epi32(_mm_sub_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v66, 5), _mm_set1_epi32(-7)), _mm_srli_epi32(v66, 7)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v66, 4), _mm_set1_epi32(-15)), _mm_and_si128(_mm_srli_epi32(v66, 6), _mm_set1_epi32(-3)))), _mm_and_si128(v72, _mm_set1_epi32(-255))), _mm_srai_epi32(_mm_slli_epi32(v72, 30), 31));
            v79 = _mm_add_epi32(_mm_sub_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v65, 5), _mm_set1_epi32(-7)), _mm_srli_epi32(v65, 7)), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v65, 4), _mm_set1_epi32(-15)), _mm_and_si128(_mm_srli_epi32(v65, 6), _mm_set1_epi32(-3)))), _mm_and_si128(v71, _mm_set1_epi32(-255))), _mm_srai_epi32(_mm_slli_epi32(v71, 30), 31));
            v80 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v79, 15), v6), v79), _mm_add_epi32(_mm_and_si128(_mm_srli_epi32(v78, 15), v6), v78));
            v64[3] = CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v80, v77), _mm_unpackhi_epi64(v73, v74)), CatOddLanesV(_mm_unpackhi_epi64(v80, v77), _mm_unpackhi_epi64(v73, v74)) * 0x10000);
            v64[2] = CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v80, v77), _mm_unpackhi_epi64(v73, v74)), CatEvenLanesV(_mm_unpackhi_epi64(v80, v77), _mm_unpackhi_epi64(v73, v74)) * 0x10000);
            v64[1] = CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v80, v77), _mm_unpacklo_epi64(v73, v74)), CatOddLanesV(_mm_unpacklo_epi64(v80, v77), _mm_unpacklo_epi64(v73, v74)) * 0x10000);
            *v64 = CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v80, v77), _mm_unpacklo_epi64(v73, v74)), CatEvenLanesV(_mm_unpacklo_epi64(v80, v77), _mm_unpacklo_epi64(v73, v74)) * 0x10000);
        } while ((v5 += 48, iter += 8, v5 != 192));
        v81 = 1;
    }
    else
    {
        v81 = 0;
    }
    sub_a66ec0(&v0, 192);
    if (*(long long *)&g_10002b0 == v1)
        return v81;
    ___stack_chk_fail();
}
