/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd194c..0xbd1a60 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd194c_1 {
    struct st_bd194c_2 *field_0;
    unsigned long long field_8;
} st_bd194c_1;

typedef struct st_bd194c_0 {
    double *field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_bd194c_0;

typedef struct st_bd194c_2 {
    unsigned long long field_0;
} st_bd194c_2;


unsigned int sub_bd194c(st_bd194c_0 *a0, st_bd194c_1 *a1)
{
    unsigned long long v0;  // x8
    double *v1;  // x9
    unsigned long long v10;  // 4133
    unsigned int v11;  // x0
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    __m128i v16;  // q2
    unsigned long v18;  // x1
    unsigned long long v19;  // x1
    unsigned long long *v2;  // x10
    unsigned long long v20;  // x1
    unsigned long long v21;  // 4128
    unsigned long long v22;  // 4130
    unsigned int v23;  // x2
    unsigned long long v24;  // x2
    unsigned long long v25;  // x2
    uint128_t v26;  // q2
    unsigned int i;  // x15
    unsigned long long v5;  // x14
    unsigned long long *v6;  // x10
    unsigned int v8;  // x16
    unsigned long long v9;  // 4131

    v0 = a0->field_18;
    if (v0 != a1[1].field_8)
        return 0;
    v1 = a0->field_0;
    v2 = a0->field_0 + 1;
    i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_0)) & 0x8080808080808080;
    v5 = v0;
LABEL_bd19f4:
    if (!v5)
        return 1;
    v6 = v2;
    if (!i)
    {
        do
        {
            v6 = v2 + 1;
            v1 = (char *)v1 - 64;
            i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v2)) & 0x8080808080808080;
            v2 = v6;
        } while (!i);
    }
    v2 = v6;
    if (!v0)
        return 0;
    v8 = 0;
    v9 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
    v10 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
    v11 = ((((v10 | v9) & 0xffff0000ffff0000) >> 16 | (v10 | v9) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v10 | v9) & 0xffff0000ffff0000) >> 16 | (v10 | v9) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
    if (!v11)
        v12 = 64;
    else
        v12 = Clz(v11);
    i &= i - 1;
    v5 -= 1;
    v13 = 5871781006564002453 * (*(long long *)((char *)v1 - (v12 & 120) - 8) + 8);
    v14 = v13;
    while (1)
    {
        v15 = v14 & a1->field_8;
        v16 = *(long long *)((char *)a1->field_0 + v15);
        v18 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v16, (uint128_t)(v13 >> 57 & 0xff | (v13 >> 57 & 0xff) * 0x100 | (v13 >> 57 & 0xff | (v13 >> 57 & 0xff) * 0x100) * 0x10000 | (v13 >> 57 & 0xff | (v13 >> 57 & 0xff) * 0x100 | (v13 >> 57 & 0xff | (v13 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
        v19 = v18 & 0x8080808080808080;
        if (v18 & 0x8080808080808080)
        {
            do
            {
                v20 = v19;
                v21 = ((((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v22 = (((((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v23 = ((((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v23)
                    v24 = 64;
                else
                    v24 = Clz(v23);
                if (*(long long *)((char *)v1 - (v12 & 120) - 8) == *(long long *)((char *)&a1->field_0[-1 * (v15 + (v24 >> 3) & a1->field_8)].field_0 - 8))
                    goto LABEL_bd19f4;
            } while ((v25 = v20 - 1, v19 = v25 & v20, v25 & v20));
        }
        v26 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v16, _mm_set1_epi8(-1)));
        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))))))) & 1)
            return 0;
        v8 += 8;
        v14 = v15 + v8;
    }
}
