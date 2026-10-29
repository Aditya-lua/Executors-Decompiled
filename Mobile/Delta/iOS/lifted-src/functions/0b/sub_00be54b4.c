/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe54b4..0xbe5834 (896 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern uint128_t g_efc958;
extern uint128_t g_efc968;

double sub_be54b4(uint128_t *a0, char *i, char *a2)
{
    unsigned long long v18;  // x21
    unsigned long long iter;  // x22
    void* v28;  // x10
    char v29;  // x9
    __m128i v30;  // q0
    unsigned long long v31;  // x14
    __m128i v32;  // q1
    unsigned long v34;  // x15
    unsigned long long v35;  // x15
    unsigned long long v37;  // 4128
    unsigned long long v20;  // x23
    unsigned long long v38;  // 4130
    unsigned long long v39;  // x11
    unsigned long long v40;  // x11
    uint128_t v41;  // q1
    unsigned long v44;  // x15
    unsigned long long v45;  // x15
    unsigned long long v46;  // 4128
    unsigned long long v47;  // 4130
    unsigned long long *v21;  // x8
    unsigned long long v48;  // x16
    unsigned long long v49;  // x16
    void* v50;  // x16
    unsigned long long v51;  // x16
    unsigned long long v52;  // 4102
    unsigned long v53;  // x12
    unsigned long v55;  // x11
    unsigned long long v56;  // 4137
    unsigned long long v57;  // 4139
    unsigned long long v22;  // x10
    unsigned long long v58;  // x11
    unsigned long long v59;  // x11
    void* v61;  // x8
    unsigned long long v23;  // x11
    unsigned long long v24;  // x13
    unsigned long long v25;  // x12
    unsigned long long v26;  // x14
    void* v27;  // x8
    uint128_t v0;  // [bp-0x150]
    __m128i v1;  // [bp-0x140]
    char v2;  // [bp-0x130]
    unsigned long long v3;  // [bp-0x128]
    uint128_t v4;  // [bp-0x120]
    uint128_t v5;  // [bp-0x110]
    uint128_t v6;  // [bp-0x100]
    uint128_t v7;  // [bp-0xf0]
    uint128_t v8;  // [bp-0xe0]
    uint128_t v9;  // [bp-0xd0]
    uint128_t v10;  // [bp-0xc0]
    uint128_t v11;  // [bp-0xb0]
    uint128_t v12;  // [bp-0xa0]
    uint128_t v13;  // [bp-0x90]
    uint128_t v14;  // [bp-0x80]
    uint128_t v15;  // [bp-0x70]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v0 = g_efc958;
    v1 = g_efc968;
    v18 = a2 - i;
    if (a2 != i)
        goto LABEL_be5788;
    while (i != a2)
    {
        iter = 0;
        v20 = 10248191152060862009 * (v18 >> 3);
        while (1)
        {
LABEL_be5544:
            v21 = &i[72 * iter];
            do
            {
                /* unsupported instruction */;
                v22 = /* unsupported instruction */;
                v23 = v22 + 1;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            if ((long long)v22 < 0)
                break;
            v3 = *v21;
            sub_bd2788(&v4, v21 + 1);
            v18 = v3;
            v8 = v4;
            v9 = v5;
            v10 = v6;
            v11 = v7;
            if (!_mm_cvtsi128_si64(v1))
            {
                a2 = &v2;
                sub_c71798(&v0, 1, &v2);
            }
            v24 = 0;
            v25 = 0;
            v26 = 5871781006564002453 * (v18 + 8);
            v27 = *(unsigned long long *)&v0;
            v28 = *(unsigned long long *)((void*)&v0 + 8);
            v29 = v26 >> 57;
            v30 = v29 | v29 * 0x100 | (v29 | v29 * 0x100) * 0x10000 | (v29 | v29 * 0x100 | (v29 | v29 * 0x100) * 0x10000) * 0x100000000;
            v31 = v26 & v28;
            v32 = *(long long *)((char *)v27 + v31);
            v34 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v32, v30));
            v35 = v34 & 0x8080808080808080;
            if (!(v34 & 0x8080808080808080))
            {
                do
                {
LABEL_be55f8:
                    if (v24 != 1)
                    {
                        v23 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v32));
                        if (v23)
                        {
                            v37 = ((((((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v38 = (((((((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v39 = ((((v38 | v37) & 0xffff0000ffff0000) >> 16 | (v38 | v37) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v38 | v37) & 0xffff0000ffff0000) >> 16 | (v38 | v37) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v39)
                                v40 = 64;
                            else
                                v40 = Clz(v39);
                            v23 = v31 + (v40 >> 3) & v28;
                        }
                        else
                        {
                            v24 = 0;
                            continue;
                        }
                    }
                    v41 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v32, _mm_set1_epi8(-1)));
                    if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)))))))))) & 1))
                    {
                        v24 = 1;
                    }
                    else
                    {
                        v53 = *((char *)v27 + v23);
                        if (!(v53 >> 31 & 1))
                        {
                            v55 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v27));
                            v56 = ((((((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v57 = (((((((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v58 = ((((v57 | v56) & 0xffff0000ffff0000) >> 16 | (v57 | v56) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v57 | v56) & 0xffff0000ffff0000) >> 16 | (v57 | v56) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v58)
                                v59 = 64;
                            else
                                v59 = Clz(v58);
                            v23 = v59 >> 3;
                            v53 = *((char *)v27 + v23);
                        }
                        *((char *)v27 + v23) = v29;
                        *((char *)v27 + (v28 & v23 - 8) + 8) = v29;
                        v1 = _mm_sub_epi64(v1, _INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v53 & 1)));
                        v61 = v27 + -(72 * v23);
                        *(unsigned long long *)((char *)v61 - 72) = v18;
                        *(uint128_t *)((char *)v61 - 32) = v6;
                        *(uint128_t *)((char *)v61 - 16) = v7;
                        *(uint128_t *)((char *)v61 - 64) = v4;
                        *(uint128_t *)((char *)v61 - 48) = v5;
                        iter += 1;
                        if (iter == v20)
                        {
                            *a0 = v0;
                            a0[1] = v1;
                            return *(unsigned long long *)&v0;
                        }
                        goto LABEL_be5544;
                    }
                    v25 += 8;
                    v31 = v25 + v31 & v28;
                    v32 = *(long long *)((char *)v27 + v31);
                    v44 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v32, v30));
                    v35 = v44 & 0x8080808080808080;
                } while (!(v44 & 0x8080808080808080));
            }
            while (1)
            {
                v45 = v35;
                v46 = ((((((v45 & 0xaaaaaaaaaaaaaaaa) >> 1 | v45 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v45 & 0xaaaaaaaaaaaaaaaa) >> 1 | v45 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v45 & 0xaaaaaaaaaaaaaaaa) >> 1 | v45 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v45 & 0xaaaaaaaaaaaaaaaa) >> 1 | v45 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v47 = (((((((v45 & 0xaaaaaaaaaaaaaaaa) >> 1 | v45 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v45 & 0xaaaaaaaaaaaaaaaa) >> 1 | v45 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v45 & 0xaaaaaaaaaaaaaaaa) >> 1 | v45 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v45 & 0xaaaaaaaaaaaaaaaa) >> 1 | v45 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v48 = ((((v47 | v46) & 0xffff0000ffff0000) >> 16 | (v47 | v46) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v47 | v46) & 0xffff0000ffff0000) >> 16 | (v47 | v46) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v48)
                    v49 = 64;
                else
                    v49 = Clz(v48);
                v50 = v27 + -(72 * (v31 + (v49 >> 3) & v28));
                if (v18 == *(long long *)((char *)v50 - 72))
                {
                    v14 = *(int128_t *)((char *)v50 - 32);
                    v15 = *(int128_t *)((char *)v50 - 16);
                    v12 = *(int128_t *)((char *)v50 - 64);
                    v13 = *(int128_t *)((char *)v50 - 48);
                    *(uint128_t *)((char *)v50 - 64) = v4;
                    *(uint128_t *)((char *)v50 - 48) = v5;
                    *(uint128_t *)((char *)v50 - 32) = v6;
                    *(uint128_t *)((char *)v50 - 16) = v7;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v52 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (!(v52 & 1))
                    {
                        /* unsupported instruction */;
                        sub_b86a90(v18);
                    }
                    if ((unsigned long long)v12 != 12)
                        sub_bd2d8c(&v12);
                    iter += 1;
                    if (iter == v20)
                    {
                        *a0 = v0;
                        a0[1] = v1;
                        return *(unsigned long long *)&v0;
                    }
                    break;
                }
                v51 = v45 - 1;
                v35 = v51 & v45;
                if (!(v51 & v45))
                    goto LABEL_be55f8;
            }
        }
        sub_c769bc();
LABEL_be5788:
        sub_c71798(&v0, 10248191152060862009 * (v18 >> 3), &v2);
    }
    *a0 = v0;
    a0[1] = v1;
    return *(unsigned long long *)&v0;
}
