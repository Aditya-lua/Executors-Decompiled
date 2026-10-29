/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbaf6a8..0xbaf7cc (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_baf6a8_0 {
    struct st_baf6a8_1 *field_0;
    unsigned long long field_8;
} st_baf6a8_0;

typedef struct st_baf6a8_2 {
    char padding_0[8];
    void* field_8;
    struct st_baf6a8_0 *field_10;
    unsigned long long field_18;
} st_baf6a8_2;

typedef struct st_baf6a8_1 {
    unsigned long long field_0;
} st_baf6a8_1;


st_baf6a8_2 * sub_baf6a8(st_baf6a8_2 *a0, st_baf6a8_0 *a1, unsigned int a2)
{
    unsigned int v4;  // x8
    unsigned long long v5;  // x3
    unsigned long long v14;  // x13
    unsigned long v15;  // cc_dep1
    uint128_t v16;  // q2
    unsigned long v19;  // x13
    unsigned long long v20;  // x13
    unsigned long long v21;  // 4128
    unsigned long long v22;  // 4130
    unsigned int v23;  // x14
    unsigned long long v6;  // x19
    unsigned long long v24;  // x14
    void* v25;  // x14
    unsigned long long v26;  // 4110
    unsigned long long v27;  // 4102
    unsigned long long v28;  // 4110
    unsigned long long v29;  // 4102
    unsigned long long v30;  // x14
    unsigned long long *v7;  // x10
    unsigned long long v8;  // x9
    __m128i v9;  // q0
    unsigned long long v10;  // x12
    __m128i v11;  // q2
    unsigned long v13;  // x13
    unsigned long long v0;  // [bp-0x38]
    st_baf6a8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = 0;
    v6 = 5871781006564002453 * (v5 ^ __ROL__(5871781006564002453 * a2, 5));
    v7 = a1->field_0;
    v8 = a1->field_8;
    v9 = v6 >> 57 & 0xff | (v6 >> 57 & 0xff) * 0x100 | (v6 >> 57 & 0xff | (v6 >> 57 & 0xff) * 0x100) * 0x10000 | (v6 >> 57 & 0xff | (v6 >> 57 & 0xff) * 0x100 | (v6 >> 57 & 0xff | (v6 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
    v10 = v6 & v8;
    v11 = *(long long *)((char *)v7 + v10);
    v13 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, v9));
    v14 = v13 & 0x8080808080808080;
    v15 = v13 & 0x8080808080808080;
    if (!(v13 & 0x8080808080808080))
        goto LABEL_baf740;
    while (1)
    {
        do
        {
            v20 = v14;
            v21 = ((((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v22 = (((((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v23 = ((((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v23)
                v24 = 64;
            else
                v24 = Clz(v23);
            v25 = (char *)v7 + -(48 * (v10 + (v24 >> 3) & v8));
            if (*(int *)((char *)v25 - 48) == a2)
            {
                v26 = arm64g_calculate_condition(10, v15, 0, 0);
                v27 = arm64g_calculate_condition(4, (v26 & 1 ? *(long long *)((char *)v25 - 40) : 0), (v26 & 1 ? v5 : 0), 0);
                if (v27 & 1)
                {
                    a0->field_8 = v25;
                    a0->field_10 = a1;
                    *(unsigned long long *)a0->padding_0 = 0;
                    return a0;
                }
            }
            else
            {
                v28 = arm64g_calculate_condition(10, v15, 0, 0);
                v29 = arm64g_calculate_condition(0, (v28 & 1 ? *(long long *)((char *)v25 - 40) : 0), (v28 & 1 ? v5 : 0), 0);
                if (v29 & 1)
                {
                    a0->field_8 = v25;
                    a0->field_10 = a1;
                    *(unsigned long long *)a0->padding_0 = 0;
                    return a0;
                }
            }
            v30 = v20 - 1;
            v15 = v30 & v20;
            v14 = v30 & v20;
        } while (v30 & v20);
        do
        {
LABEL_baf740:
            v16 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, _mm_set1_epi8(-1)));
            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))))))) & 1)
            {
                if (!a1[1].field_0)
                {
                    v1 = a1;
                    sub_c72050(v1, a1 + 2);
                    a1 = v1;
                }
                *(st_baf6a8_0 **)a0->padding_0 = a1;
                a0->field_8 = v6;
                *(unsigned int *)&a0->field_10 = a2;
                a0->field_18 = v0;
                return a0;
            }
            v4 += 8;
            v10 = v10 + v4 & v8;
            v11 = *(long long *)((char *)v7 + v10);
            v19 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, v9));
            v14 = v19 & 0x8080808080808080;
            v15 = v19 & 0x8080808080808080;
        } while (!(v19 & 0x8080808080808080));
    }
}
