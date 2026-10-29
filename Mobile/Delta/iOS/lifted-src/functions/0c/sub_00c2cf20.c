/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2cf20..0xc2d0c8 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c2cf20_0 {
    struct st_c2cf20_1 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_c2cf20_0;

typedef struct st_c2cf20_1 {
    unsigned long long field_0;
} st_c2cf20_1;


unsigned long long sub_c2cf20(st_c2cf20_0 *a0, unsigned int a1)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // x12
    unsigned long v10;  // x12
    unsigned long v11;  // x10
    unsigned long long v12;  // x11
    unsigned long long v13;  // x9
    unsigned long v14;  // x12
    unsigned long v15;  // x10
    unsigned long long v16;  // x9
    unsigned long long v17;  // x11
    unsigned long v18;  // x12
    unsigned long v19;  // x10
    unsigned long long v2;  // x13
    unsigned long long v20;  // x11
    unsigned long long v21;  // x9
    unsigned long v22;  // x12
    unsigned long v23;  // x10
    unsigned long long v24;  // x9
    unsigned long long v25;  // x11
    unsigned long v26;  // x11
    unsigned long long v27;  // x11
    unsigned long long *v28;  // x10
    unsigned long long v29;  // x9
    unsigned long v3;  // x10
    __m128i v30;  // q0
    unsigned long long v31;  // x11
    __m128i v32;  // q2
    unsigned long v34;  // x12
    unsigned long long v35;  // x12
    uint128_t v36;  // q2
    unsigned long v39;  // x12
    unsigned long long v4;  // x11
    unsigned long long v40;  // x12
    unsigned long long v41;  // 4128
    unsigned long long v42;  // 4130
    unsigned long long v43;  // x13
    unsigned long long v44;  // x13
    unsigned long long v45;  // x13
    unsigned long long v5;  // x9
    unsigned long v6;  // x12
    unsigned long v7;  // x10
    unsigned long long v8;  // x9
    unsigned long long v9;  // x11

    if (!a0->field_18)
        return 0;
    v0 = 0;
    v1 = a0->field_28 ^ 7237128888997146477;
    v2 = a1 | 0x400000000000000;
    v3 = a0->field_28 ^ v2 ^ 8387220255154660723;
    v4 = v1 + (a0->field_20 ^ 8317987319222330741);
    v5 = v3 + (a0->field_20 ^ 7816392313619706465);
    v6 = v4 ^ __ROL__(v1, 13);
    v7 = v5 ^ __ROL__(v3, 16);
    v8 = v5 + v6;
    v9 = v7 + __ROL__(v4, 32);
    v10 = v8 ^ __ROL__(v6, 0x11);
    v11 = v9 ^ __ROL__(v7, 21);
    v12 = (v9 ^ v2) + v10;
    v13 = v11 + (__ROL__(v8, 32) ^ 0xff);
    v14 = v12 ^ __ROL__(v10, 13);
    v15 = v13 ^ __ROL__(v11, 16);
    v16 = v14 + v13;
    v17 = v15 + __ROL__(v12, 32);
    v18 = v16 ^ __ROL__(v14, 0x11);
    v19 = v17 ^ __ROL__(v15, 21);
    v20 = v18 + v17;
    v21 = v19 + __ROL__(v16, 32);
    v22 = v20 ^ __ROL__(v18, 13);
    v23 = v21 ^ __ROL__(v19, 16);
    v24 = v22 + v21;
    v25 = v23 + __ROL__(v20, 32);
    v26 = (v24 ^ __ROL__(v22, 0x11)) + v25 ^ __ROL__(v24 ^ __ROL__(v22, 0x11), 13);
    v27 = __ROL__((v25 ^ __ROL__(v23, 21)) + __ROL__(v24, 32) ^ __ROL__(v25 ^ __ROL__(v23, 21), 16), 21) ^ __ROL__(v26, 0x11) ^ __ROL__(v26 + (v25 ^ __ROL__(v23, 21)) + __ROL__(v24, 32), 32) ^ v26 + (v25 ^ __ROL__(v23, 21)) + __ROL__(v24, 32);
    v28 = a0->field_0;
    v29 = a0->field_8;
    v30 = v27 >> 57 & 0xff | (v27 >> 57 & 0xff) * 0x100 | (v27 >> 57 & 0xff | (v27 >> 57 & 0xff) * 0x100) * 0x10000 | (v27 >> 57 & 0xff | (v27 >> 57 & 0xff) * 0x100 | (v27 >> 57 & 0xff | (v27 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
    v31 = v27 & v29;
    v32 = *(long long *)((char *)v28 + v31);
    v34 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v32, v30));
    v35 = v34 & 0x8080808080808080;
    if (!(v34 & 0x8080808080808080))
        goto LABEL_c2d084;
    while (1)
    {
        do
        {
            v40 = v35;
            v41 = ((((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v42 = (((((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v43 = ((((v42 | v41) & 0xffff0000ffff0000) >> 16 | (v42 | v41) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v42 | v41) & 0xffff0000ffff0000) >> 16 | (v42 | v41) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v43)
                v44 = 64;
            else
                v44 = Clz(v43);
            if (a1 == *(int *)((char *)&v28[-1 * (v31 + (v44 >> 3) & v29)] - 8))
                return 1;
            v45 = v40 - 1;
            v35 = v45 & v40;
        } while (v45 & v40);
        do
        {
LABEL_c2d084:
            v36 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v32, _mm_set1_epi8(-1)));
            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))))))) & 1)
                return 0;
            v0 += 8;
            v31 = v31 + v0 & v29;
            v32 = *(long long *)((char *)v28 + v31);
            v39 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v32, v30));
            v35 = v39 & 0x8080808080808080;
        } while (!(v39 & 0x8080808080808080));
    }
}
