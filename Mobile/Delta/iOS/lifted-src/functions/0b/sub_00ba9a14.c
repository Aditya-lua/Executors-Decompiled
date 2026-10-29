/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xba9a14..0xba9cf8 (740 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ba9a14_0 {
    char padding_0[256];
    void* field_100;
    unsigned long long field_108;
    uint128_t field_110;
} st_ba9a14_0;

extern uint128_t g_efc958;
extern uint128_t g_efc968;

unsigned int * sub_ba9a14(st_ba9a14_0 *a0, long long a1)
{
    unsigned int v6;  // x8
    unsigned long long v7;  // x21
    unsigned long long v16;  // x12
    uint128_t v17;  // q2
    unsigned int v18;  // s2
    unsigned long v20;  // x12
    unsigned long long v21;  // x12
    unsigned long long v22;  // 4128
    unsigned long long v23;  // 4130
    unsigned int v24;  // x13
    unsigned long long v25;  // x13
    char v8;  // x20
    void* v26;  // x22
    unsigned long long v27;  // x13
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4102
    st_ba9a14_0 *v30;  // x22
    unsigned int ptr;  // x0
    void* v32;  // x9
    unsigned long long v33;  // x10
    unsigned long long v34;  // x11
    unsigned long v35;  // d0
    void* v9;  // x10
    unsigned int i;  // x13
    long long v37;  // x12
    unsigned long long v39;  // 4128
    unsigned long long v40;  // 4130
    unsigned int v41;  // x12
    unsigned long long v42;  // x12
    unsigned long long v43;  // x12
    unsigned long v44;  // x11
    unsigned long long v10;  // x9
    unsigned long v46;  // x11
    unsigned long long v47;  // 4137
    unsigned long long v48;  // 4139
    unsigned int v49;  // x11
    unsigned long long v50;  // x11
    __m128i v51;  // q1
    __m128i v11;  // q0
    unsigned long long v12;  // x11
    __m128i v13;  // q2
    unsigned long v15;  // x12
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint320_t v3;  // [bp-0x60]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((long long)/* unsupported instruction */ >= 0)
    {
        v6 = 0;
        v7 = 5871781006564002453 * (a1 + 8);
        v8 = v7 >> 57;
        v9 = a0->field_100;
        v10 = a0->field_108;
        v11 = v8 | v8 * 0x100 | (v8 | v8 * 0x100) * 0x10000 | (v8 | v8 * 0x100 | (v8 | v8 * 0x100) * 0x10000) * 0x100000000;
        v12 = v7 & v10;
        v13 = *(long long *)((char *)v9 + v12);
        v15 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v13, v11));
        v16 = v15 & 0x8080808080808080;
        if (!(v15 & 0x8080808080808080))
            goto LABEL_ba9ab0;
        do
        {
            v6 += 8;
            v12 = v12 + v6 & v10;
            v13 = *(long long *)((char *)v9 + v12);
            v20 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v13, v11));
            v16 = v20 & 0x8080808080808080;
            if (v20 & 0x8080808080808080)
            {
                do
                {
                    v21 = v16;
                    v22 = ((((((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v23 = (((((((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v24 = ((((v23 | v22) & 0xffff0000ffff0000) >> 16 | (v23 | v22) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v23 | v22) & 0xffff0000ffff0000) >> 16 | (v23 | v22) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v24)
                        v25 = 64;
                    else
                        v25 = Clz(v24);
                    if (*(long long *)((char *)v9 + -16 * (v12 + (v25 >> 3) & v10) - 16) == a1)
                    {
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v28 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (!(v28 & 1))
                        {
                            /* unsupported instruction */;
                            sub_b86a90(a1);
                        }
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v29 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (v29 & 1)
                            return v9 - (v12 + (v25 >> 3) & v10) * 16 - 8;
                        /* unsupported instruction */;
                        sub_b86a90(a1);
                        return v9 - (v12 + (v25 >> 3) & v10) * 16 - 8;
                    }
                    v27 = v21 - 1;
                    v16 = v27 & v21;
                } while (v27 & v21);
            }
LABEL_ba9ab0:
        } while ((v17 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v13, _mm_set1_epi8(-1))), v18 = __dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))))))), !((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)))))))))) & 1)));
        v30 = a0;
        if ((long long)a0->field_110)
            goto LABEL_ba9b34;
    }
    else
    {
        sub_c769bc();
    }
    sub_c70f38(&v30->field_100, v30 + 1);
LABEL_ba9b34:
    v0 = g_efc958;
    v1 = g_efc968;
    sub_bb081c(&v0, a1);
    *(uint128_t *)((char *)&v3 + 8) = v0;
    *(uint128_t *)((char *)&v3 + 24) = v1;
    v2 = CONCAT(1, 1);
    *(unsigned long long *)&v3 = 0;
    ptr = _malloc(56);
    if (ptr)
    {
        *(uint128_t *)ptr = v2;
        *(uint128_t *)(ptr + 16) = *(uint128_t *)&v3;
        *(uint128_t *)(ptr + 32) = *(uint128_t *)((void*)&v3 + 16);
        *(unsigned long long *)(ptr + 48) = *(unsigned long long *)((void*)&v3 + 32);
        v32 = v30->field_100;
        v33 = v30->field_108;
        v34 = v33 & v7;
        v35 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v32 + v34)));
        i = __double_as_longlong(v35);
        if (!i)
        {
            v37 = 8;
            do
            {
                v34 = v34 + v37 & v33;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v32 + v34)));
                v37 += 8;
            } while (!i);
        }
        v39 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v40 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v41 = ((((v40 | v39) & 0xffff0000ffff0000) >> 16 | (v40 | v39) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v40 | v39) & 0xffff0000ffff0000) >> 16 | (v40 | v39) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v41)
            v42 = 64;
        else
            v42 = Clz(v41);
        v43 = v34 + (v42 >> 3) & v33;
        v44 = *((char *)v32 + v43);
        if (!(v44 >> 31 & 1))
        {
            v46 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v32));
            v47 = ((((((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v48 = (((((((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v49 = ((((v48 | v47) & 0xffff0000ffff0000) >> 16 | (v48 | v47) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v48 | v47) & 0xffff0000ffff0000) >> 16 | (v48 | v47) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v49)
                v50 = 64;
            else
                v50 = Clz(v49);
            v43 = v50 >> 3;
            v44 = *((char *)v32 + v43);
        }
        *((char *)v32 + v43) = v8;
        *((char *)v32 + (v43 - 8 & v33) + 8) = v8;
        v26 = v32 - v43 * 16;
        *(long long *)((char *)v26 - 16) = a1;
        *(unsigned long long *)((char *)v26 - 8) = ptr;
        v51 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v44 & 1));
        *(__m128i *)&v30->field_110 = _mm_sub_epi64(v30->field_110, v51);
        return v26 - 8;
    }
    sub_c6ba70(8, 56);
    __debugbreak();
}
