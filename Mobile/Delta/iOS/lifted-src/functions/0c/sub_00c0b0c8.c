/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0b0c8..0xc0b344 (636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0b0c8_0 {
    struct st_c0b0c8_1 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_c0b0c8_0;

typedef struct st_c0b0c8_1 {
    unsigned long long field_0;
} st_c0b0c8_1;

extern long long g_efb728;

st_c0b0c8_0 ** sub_c0b0c8(st_c0b0c8_0 **a0, unsigned long long *a1)
{
    st_c0b0c8_0 *v6;  // x20
    unsigned long long v7;  // x8
    unsigned long v17;  // x12
    unsigned long long v18;  // x12
    void* v19;  // x23
    __m128i v20;  // q2
    unsigned long v23;  // x12
    unsigned long long v24;  // x12
    unsigned long v8;  // x22
    unsigned long long v25;  // 4128
    unsigned long long v26;  // 4130
    unsigned long long v27;  // x13
    unsigned long long v28;  // x13
    unsigned long long v29;  // x13
    unsigned long long *v30;  // x24
    long long v31;  // x2
    unsigned long long v32;  // x0
    long long v33;  // x21
    unsigned long long v34;  // x9
    unsigned long v9;  // x19
    unsigned long long i;  // x24
    unsigned long long idx;  // x8
    unsigned long long v37;  // 4102
    st_c0b0c8_0 **v38;  // x0
    unsigned long long v10;  // x11
    unsigned long long *v11;  // x10
    unsigned long v12;  // x9
    __m128i v13;  // q0
    unsigned long long v14;  // x11
    __m128i v15;  // q2
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (*a1 != 10)
        return a0;
    v6 = *a0;
    if (v6->field_18)
    {
        v7 = 0;
        v8 = a1[4];
        v9 = v8 + 8;
        v10 = 5871781006564002453 * v9;
        v11 = v6->field_0;
        v12 = v6->field_8;
        v13 = v10 >> 57 & 0xff | (v10 >> 57 & 0xff) * 0x100 | (v10 >> 57 & 0xff | (v10 >> 57 & 0xff) * 0x100) * 0x10000 | (v10 >> 57 & 0xff | (v10 >> 57 & 0xff) * 0x100 | (v10 >> 57 & 0xff | (v10 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
        v14 = v10 & v12;
        v15 = *(long long *)((char *)v11 + v14);
        v17 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v15, v13));
        v18 = v17 & 0x8080808080808080;
        if (!(v17 & 0x8080808080808080))
            goto LABEL_c0b170;
        while (1)
        {
            do
            {
                v24 = v18;
                v25 = ((((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v26 = (((((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v27 = ((((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v27)
                    v28 = 64;
                else
                    v28 = Clz(v27);
                v19 = &v11[-4 * (v14 + (v28 >> 3) & v12)];
                if (v8 == *(long long *)((char *)v19 - 32))
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    if (/* unsupported instruction */)
                        goto LABEL_c0b2d8;
                    v30 = a1;
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        goto LABEL_c0b1bc;
                    goto LABEL_c0b2e0;
                }
            } while ((v29 = v24 - 1, v18 = v29 & v24, v29 & v24));
            do
            {
LABEL_c0b170:
                v20 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v15, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v20, v20), _mm_unpacklo_epi64(v20, v20)))))))))) & 1)
                    goto LABEL_c0b2bc;
                v7 += 8;
                v14 = v14 + v7 & v12;
                v15 = *(long long *)((char *)v11 + v14);
                v23 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v15, v13));
                v18 = v23 & 0x8080808080808080;
            } while (!(v23 & 0x8080808080808080));
        }
    }
    else
    {
LABEL_c0b2bc:
        v31 = &g_efb728;
        a1 = 22;
        v32 = sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in eve", 22, &g_efb728);
    }
LABEL_c0b2d4:
    sub_c769bc(v32, a1, v31);
LABEL_c0b2d8:
    /* unsupported instruction */;
    v30 = a1;
LABEL_c0b2e0:
    sub_c7573c(v8 + 8);
LABEL_c0b1bc:
    v33 = *(long long *)((char *)v19 - 8);
    v31 = v33;
    v32 = sub_b98708(&v2, 16, v31);
    v0 = v2;
    v1 = v3;
    v34 = v30[3];
    if (v30[3] < (unsigned long long)v33)
        v33 = v34;
    if (v33)
    {
        i = 0;
        v19 = *(long long *)((char *)v19 - 16);
        do
        {
            idx = i;
            i += 1;
            a1 = *(long long *)((char *)v19 + 8 * idx);
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            if ((long long)/* unsupported instruction */ < 0)
                goto LABEL_c0b2d4;
            v31 = *(long long *)(v30[2] + idx * 16 + 8);
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            if ((long long)/* unsupported instruction */ < 0)
                goto LABEL_c0b2d4;
            v32 = sub_c012d0(&v0);
            if (v32)
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v37 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v37 & 1))
                {
                    /* unsupported instruction */;
                    v32 = sub_b86a90();
                }
            }
        } while (i != v33);
    }
    sub_b66934(v8 + 40, v6);
    sub_c093f0(v8 + 40, &v0);
    v38 = sub_b98884(&v0);
    while (1)
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ != 1)
        {
            /* unsupported instruction */;
            return sub_c75418(v9);
        }
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (!(/* unsupported instruction */ ^ 1))
            return v38;
    }
}
