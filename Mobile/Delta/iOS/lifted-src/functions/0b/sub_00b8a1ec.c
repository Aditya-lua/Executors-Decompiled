/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8a1ec..0xb8a3c0 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b8a1ec_1 {
    unsigned int field_0;
    unsigned int field_4;
    struct st_b8a1ec_0 *field_8;
} st_b8a1ec_1;

typedef struct st_b8a1ec_0 {
    struct st_b8a1ec_0 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
} st_b8a1ec_0;


long long sub_b8a1ec(st_b8a1ec_1 *a0)
{
    unsigned long v0;  // x0
    unsigned long v1;  // x1
    unsigned long long v10;  // x15
    unsigned long v11;  // x12
    unsigned long long v12;  // x13
    unsigned long long v13;  // x11
    unsigned long v14;  // x14
    unsigned long v15;  // x12
    unsigned long long v16;  // x11
    unsigned long long v17;  // x13
    unsigned long v18;  // x14
    unsigned long v19;  // x12
    unsigned long v2;  // cc_dep1
    unsigned long long v20;  // x13
    unsigned long long v21;  // x11
    unsigned long v22;  // x14
    unsigned long v23;  // x12
    unsigned long long v24;  // x12
    st_b8a1ec_0 *v25;  // x10
    unsigned long long v26;  // x11
    __m128i v27;  // q0
    unsigned long long v28;  // x12
    __m128i v29;  // q2
    st_b8a1ec_0 *v3;  // x10
    unsigned long v31;  // x13
    unsigned long long v32;  // x13
    uint128_t v33;  // q2
    unsigned long v36;  // x13
    unsigned long long v37;  // x13
    unsigned long long v38;  // 4128
    unsigned long long v39;  // 4130
    unsigned long long v4;  // 4110
    unsigned long long v40;  // x14
    unsigned long long v41;  // x14
    unsigned int *v42;  // x14
    unsigned long long v43;  // x14
    unsigned long long v5;  // 4102
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v8;  // x9
    unsigned long v9;  // x14

    v0 = a0->field_0;
    v1 = a0->field_4;
    a0->field_0 = 0;
    v2 = v0 & 0xffffffff;
    if ((unsigned int)v0 != 1)
        return v0;
    v3 = a0->field_8;
    if ((unsigned int)v1 != v3->field_30)
    {
        v4 = arm64g_calculate_condition(19, v2, 1, 0);
        v5 = arm64g_calculate_condition(20, (v4 & 1 ? v3->field_18 : 0x40000000), 0, 0);
        if (!(v5 & 1))
        {
            a0->field_0 = 0;
            a0->field_4 = (unsigned int)v3;
            return v0;
        }
    }
    else
    {
        v6 = arm64g_calculate_condition(19, v2, 1, 0);
        v7 = arm64g_calculate_condition(16, (v6 & 1 ? v3->field_18 : 0x40000000), 0, 0);
        if (!(v7 & 1))
        {
            a0->field_0 = 0;
            a0->field_4 = (unsigned int)v3;
            return v0;
        }
    }
    v8 = 0;
    v9 = v3->field_28 ^ 7237128888997146477;
    v10 = v1 | 0x400000000000000;
    v11 = v3->field_28 ^ v10 ^ 8387220255154660723;
    v12 = v9 + (v3->field_20 ^ 8317987319222330741);
    v13 = v11 + (v3->field_20 ^ 7816392313619706465);
    v14 = v12 ^ __ROL__(v9, 13);
    v15 = v13 ^ __ROL__(v11, 16);
    v16 = v13 + v14;
    v17 = v15 + __ROL__(v12, 32);
    v18 = v16 ^ __ROL__(v14, 0x11);
    v19 = v17 ^ __ROL__(v15, 21);
    v20 = (v17 ^ v10) + v18;
    v21 = v19 + (__ROL__(v16, 32) ^ 0xff);
    v22 = v20 ^ __ROL__(v18, 13);
    v23 = v21 ^ __ROL__(v19, 16);
    v24 = __ROL__((((v23 + __ROL__(v20, 32) ^ __ROL__(v23, 21)) + __ROL__(v22 + v21, 32) ^ __ROL__(v23 + __ROL__(v20, 32) ^ __ROL__(v23, 21), 16)) + __ROL__((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32), 32) ^ __ROL__((v23 + __ROL__(v20, 32) ^ __ROL__(v23, 21)) + __ROL__(v22 + v21, 32) ^ __ROL__(v23 + __ROL__(v20, 32) ^ __ROL__(v23, 21), 16), 21)) + __ROL__(((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v22 + v21 ^ __ROL__(v22, 0x11), 13)) + ((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32), 32) ^ __ROL__(((v23 + __ROL__(v20, 32) ^ __ROL__(v23, 21)) + __ROL__(v22 + v21, 32) ^ __ROL__(v23 + __ROL__(v20, 32) ^ __ROL__(v23, 21), 16)) + __ROL__((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32), 32) ^ __ROL__((v23 + __ROL__(v20, 32) ^ __ROL__(v23, 21)) + __ROL__(v22 + v21, 32) ^ __ROL__(v23 + __ROL__(v20, 32) ^ __ROL__(v23, 21), 16), 21), 16), 21) ^ __ROL__((((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v22 + v21 ^ __ROL__(v22, 0x11), 13)) + ((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v22 + v21 ^ __ROL__(v22, 0x11), 13), 0x11)) + (((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21), 16)) + __ROL__(((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32), 32) ^ __ROL__(((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v22 + v21 ^ __ROL__(v22, 0x11), 13)) + ((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v22 + v21 ^ __ROL__(v22, 0x11), 13), 0x11), 13), 0x11) ^ __ROL__(((((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v22 + v21 ^ __ROL__(v22, 0x11), 13)) + ((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v22 + v21 ^ __ROL__(v22, 0x11), 13), 0x11)) + (((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21), 16)) + __ROL__(((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32), 32) ^ __ROL__(((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v22 + v21 ^ __ROL__(v22, 0x11), 13)) + ((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v22 + v21 ^ __ROL__(v22, 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v22 + v21 ^ __ROL__(v22, 0x11), 13), 0x11), 13)) + ((((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21), 16)) + __ROL__(((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32), 32) ^ __ROL__(((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21), 16), 21)) + __ROL__((((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11), 13)) + ((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32), 32), 32) ^ (((((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11), 13)) + ((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__(((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11), 13), 0x11)) + (((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21), 16)) + __ROL__(((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32), 32) ^ __ROL__((((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11), 13)) + ((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__(((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11), 13), 0x11), 13)) + ((((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21), 16)) + __ROL__(((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32), 32) ^ __ROL__(((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32) ^ __ROL__((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21), 16), 21)) + __ROL__((((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11)) + (v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__((v20 ^ __ROL__(v18, 13)) + v21 ^ __ROL__(v20 ^ __ROL__(v18, 13), 0x11), 13)) + ((v21 ^ __ROL__(v19, 16)) + __ROL__(v20, 32) ^ __ROL__(v21 ^ __ROL__(v19, 16), 21)) + __ROL__((v20 ^ __ROL__(v18, 13)) + v21, 32), 32);
    v25 = v3->field_0;
    v26 = v3->field_8;
    v27 = v24 >> 57 & 0xff | (v24 >> 57 & 0xff) * 0x100 | (v24 >> 57 & 0xff | (v24 >> 57 & 0xff) * 0x100) * 0x10000 | (v24 >> 57 & 0xff | (v24 >> 57 & 0xff) * 0x100 | (v24 >> 57 & 0xff | (v24 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
    v28 = v24 & v26;
    v29 = *(long long *)((char *)v25 + v28);
    v31 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v29, v27));
    v32 = v31 & 0x8080808080808080;
    if (!(v31 & 0x8080808080808080))
        goto LABEL_b8a37c;
    while (1)
    {
        do
        {
            v37 = v32;
            v38 = ((((((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v39 = (((((((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v40 = ((((v39 | v38) & 0xffff0000ffff0000) >> 16 | (v39 | v38) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v39 | v38) & 0xffff0000ffff0000) >> 16 | (v39 | v38) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v40)
                v41 = 64;
            else
                v41 = Clz(v40);
            v42 = &(&v25->field_0)[-1 * (v28 + (v41 >> 3) & v26)];
            if ((unsigned int)v1 == *(int *)((char *)v42 - 8))
            {
                v3 = *(int *)((char *)v42 - 4);
                a0->field_0 = 1;
                a0->field_4 = (unsigned int)v3;
                return v0;
            }
            v43 = v37 - 1;
            v32 = v43 & v37;
        } while (v43 & v37);
        do
        {
LABEL_b8a37c:
            v33 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v29, _mm_set1_epi8(-1)));
            v3 = v25;
            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))))))) & 1)
            {
                a0->field_0 = 0;
                a0->field_4 = (unsigned int)v3;
                return v0;
            }
            v8 += 8;
            v28 = v28 + v8 & v26;
            v29 = *(long long *)((char *)v25 + v28);
            v36 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v29, v27));
            v32 = v36 & 0x8080808080808080;
        } while (!(v36 & 0x8080808080808080));
    }
}
