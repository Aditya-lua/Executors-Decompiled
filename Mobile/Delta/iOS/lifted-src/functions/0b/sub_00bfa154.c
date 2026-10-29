/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfa154..0xbfa334 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfa154_0 {
    char padding_0[256];
    struct st_bfa154_1 *field_100;
    unsigned long long field_108;
    struct st_bfa154_1 *field_110;
} st_bfa154_0;

typedef struct st_bfa154_1 {
    unsigned long long field_0;
} st_bfa154_1;


long long sub_bfa154(st_bfa154_0 *a0, unsigned long long *a1)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x21
    unsigned long long v12;  // x12
    uint128_t v13;  // q2
    unsigned long v16;  // x12
    unsigned long long v17;  // x12
    unsigned long long v18;  // 4128
    unsigned long long v19;  // 4130
    unsigned long long v20;  // x13
    unsigned long long v21;  // x13
    char v4;  // x20
    void* v22;  // x13
    unsigned long long v23;  // x13
    unsigned long long *v24;  // x22
    unsigned long long *v25;  // x8
    unsigned long long ptr;  // x0
    unsigned long long i;  // x13
    unsigned long v29;  // d0
    unsigned long v30;  // x11
    unsigned long long v31;  // 4137
    unsigned long long *v5;  // x10
    unsigned long long v32;  // 4139
    unsigned long long v33;  // x11
    unsigned long long v34;  // x11
    unsigned long long v35;  // x12
    __m128i v36;  // q1
    long long v37;  // x12
    unsigned long long v39;  // 4128
    unsigned long long v40;  // 4130
    unsigned long long v41;  // x12
    unsigned long v6;  // x9
    unsigned long long v42;  // x12
    __m128i v7;  // q0
    unsigned long long v8;  // x11
    __m128i v9;  // q2
    unsigned long v11;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = 5871781006564002453 * a1;
    v4 = v3 >> 57;
    v5 = a0->field_100;
    v6 = a0->field_108;
    v7 = v4 | v4 * 0x100 | (v4 | v4 * 0x100) * 0x10000 | (v4 | v4 * 0x100 | (v4 | v4 * 0x100) * 0x10000) * 0x100000000;
    v8 = v3 & v6;
    v9 = *(long long *)((char *)v5 + v8);
    v11 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v9, v7));
    v12 = v11 & 0x8080808080808080;
    if (!(v11 & 0x8080808080808080))
        goto LABEL_bfa1d4;
    while (1)
    {
        do
        {
            v17 = v12;
            v18 = ((((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v19 = (((((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v20 = ((((v19 | v18) & 0xffff0000ffff0000) >> 16 | (v19 | v18) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v19 | v18) & 0xffff0000ffff0000) >> 16 | (v19 | v18) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v20)
                v21 = 64;
            else
                v21 = Clz(v20);
            v22 = &v5[-2 * (v8 + (v21 >> 3) & v6)];
            if (*(long long *)((char *)v22 - 16) == a1)
                goto LABEL_bfa29c;
            v23 = v17 - 1;
            v12 = v23 & v17;
        } while (v23 & v17);
        do
        {
LABEL_bfa1d4:
            v13 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v9, _mm_set1_epi8(-1)));
            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))))))) & 1)
            {
                v24 = a1;
                v25 = a0->field_110;
                if (v25)
                {
                    ptr = _malloc(40);
                    if (!ptr)
                        goto LABEL_bfa308;
                }
                else
                {
                    sub_c74750(&a0->field_100, &a0[1].padding_0[8]);
                    ptr = _malloc(40);
                    if (!ptr)
                    {
LABEL_bfa308:
                        ptr = sub_c6ba70(8, 40);
                        goto LABEL_bfa314;
                    }
                }
                *(unsigned long long *)ptr = 1;
                *(char *)(ptr + 8) = 0;
                *(unsigned long *)(ptr + 16) = 0x8000000000000000;
                v25 = a0->field_100;
                v6 = a0->field_108;
                v8 = v6 & v3;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v25 + v8)));
                if (!i)
                    goto LABEL_bfa2c8;
                v5 = v24;
                goto LABEL_bfa250;
            }
            v2 += 8;
            v8 = v8 + v2 & v6;
            v9 = *(long long *)((char *)v5 + v8);
            v16 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v9, v7));
            v12 = v16 & 0x8080808080808080;
        } while (!(v16 & 0x8080808080808080));
    }
    while (1)
    {
LABEL_bfa250:
        v39 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v40 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v41 = ((((v40 | v39) & 0xffff0000ffff0000) >> 16 | (v40 | v39) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v40 | v39) & 0xffff0000ffff0000) >> 16 | (v40 | v39) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v41)
            v42 = 64;
        else
            v42 = Clz(v41);
        v35 = v8 + (v42 >> 3) & v6;
        v8 = *((char *)v25 + v35);
        if (!(v8 >> 31 & 1))
        {
LABEL_bfa314:
            v29 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v25));
            v30 = __double_as_longlong(v29);
            v31 = ((((((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v32 = (((((((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v33 = ((((v32 | v31) & 0xffff0000ffff0000) >> 16 | (v32 | v31) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v32 | v31) & 0xffff0000ffff0000) >> 16 | (v32 | v31) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v33)
                v34 = 64;
            else
                v34 = Clz(v33);
            v35 = v34 >> 3;
            v8 = *((char *)v25 + v35);
        }
        *((char *)v25 + v35) = v4;
        *((char *)v25 + (v35 - 8 & v6) + 8) = v4;
        v22 = &v25[-2 * v35];
        *(unsigned long long **)((char *)v22 - 16) = v5;
        *(unsigned long long *)((char *)v22 - 8) = ptr;
        v36 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v8 & 1));
        *(__m128i *)&a0->field_110 = _mm_sub_epi64(*(int128_t *)&a0->field_110, v36);
LABEL_bfa29c:
        do
        {
            /* unsupported instruction */;
            v25 = /* unsupported instruction */;
            v6 = (char *)v25 + 1;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if (v25 >= 0)
            break;
        ptr = sub_c769bc();
LABEL_bfa2c8:
        v37 = 8;
        v5 = v24;
        do
        {
            v8 = v8 + v37 & v6;
            i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v25 + v8)));
            v37 += 8;
        } while (!i);
    }
    return *(long long *)((char *)v22 - 8);
}
