/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0cb88..0xc0cdfc (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0cb88_1 {
    void* field_0;
    unsigned long long field_8;
    uint128_t field_10;
} st_c0cb88_1;

typedef struct st_c0cb88_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
} st_c0cb88_0;


void sub_c0cb88(st_c0cb88_0 *a0, st_c0cb88_1 **a1)
{
    unsigned long long v8;  // x21
    st_c0cb88_1 *v9;  // x19
    unsigned long v18;  // x11
    unsigned long long v20;  // 4131
    unsigned long long v21;  // 4133
    unsigned long long v22;  // x12
    unsigned long long v23;  // x12
    unsigned long long v24;  // x11
    unsigned long v25;  // x20
    unsigned long long v26;  // x13
    unsigned long long v27;  // x12
    unsigned long v10;  // cc_op
    unsigned long long v28;  // x14
    void* v29;  // x8
    unsigned long v30;  // x10
    char v31;  // x9
    __m128i v32;  // q0
    unsigned long long v33;  // x14
    __m128i v34;  // q1
    unsigned long v36;  // x15
    unsigned long long v37;  // x15
    unsigned long v11;  // cc_dep1
    unsigned long long v39;  // 4128
    unsigned long long v40;  // 4130
    unsigned long long v41;  // x11
    unsigned long long v42;  // x11
    uint128_t v43;  // q1
    unsigned long v46;  // x15
    unsigned long long v47;  // x15
    unsigned long v12;  // cc_dep2
    unsigned long long v48;  // 4128
    unsigned long long v49;  // 4130
    unsigned long long v50;  // x16
    unsigned long long v51;  // x16
    long long *v52;  // x16
    unsigned long long v53;  // x16
    unsigned long long v54;  // 4102
    unsigned long v55;  // x12
    unsigned long v57;  // x11
    unsigned long v13;  // cc_ndep
    unsigned long long v58;  // 4137
    unsigned long long v59;  // 4139
    unsigned long long v60;  // x11
    unsigned long long v61;  // x11
    __m128i v62;  // q0
    long long *v63;  // x8
    unsigned long long v64;  // 4110
    unsigned long long v65;  // 4102
    unsigned long long v66;  // 4110
    unsigned long long v67;  // 4102
    unsigned long long v14;  // x8
    unsigned long v15;  // x9
    unsigned long long i;  // x10
    unsigned long long v17;  // x11
    uint128_t v0;  // [bp-0x70]
    uint128_t v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x58]
    uint128_t v3;  // [bp-0x50]
    unsigned long v4;  // [bp-0x48]
    uint128_t v5;  // [bp-0x40]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a0->field_40;
    v0 = a0->field_0;
    v1 = a0->field_10;
    v3 = a0->field_20;
    v5 = a0->field_30;
    v9 = *a1;
    while (1)
    {
LABEL_c0cbc4:
        v14 = *(unsigned long long *)((void*)&v5 + 8);
        if (!v14)
            break;
        v15 = *(unsigned long long *)((void*)&v1 + 8);
        i = *(unsigned long long *)&v3;
        if (!i)
        {
            v17 = *(unsigned long long *)((void*)&v3 + 8);
            do
            {
                v18 = v17 + 8;
                v15 -= 64;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v17)) & 0x8080808080808080;
                v17 = v18;
            } while (!i);
            v4 = v18;
            v2 = v15;
        }
        v20 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v21 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v22 = ((((v21 | v20) & 0xffff0000ffff0000) >> 16 | (v21 | v20) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v21 | v20) & 0xffff0000ffff0000) >> 16 | (v21 | v20) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v22)
            v23 = 64;
        else
            v23 = Clz(v22);
        v24 = v23 & 120;
        *(unsigned long long *)&v3 = i - 1 & i;
        *(unsigned long long *)((char *)&v5 + 8) = v14 - 1;
        v25 = *(long long *)(v15 - v24 - 8);
        if (!(long long)v9->field_10)
            sub_c70708(v9, 1, v9 + 1);
        v26 = 0;
        v27 = 0;
        v28 = 5871781006564002453 * (v25 + 8);
        v29 = v9->field_0;
        v30 = v9->field_8;
        v31 = v28 >> 57;
        v32 = v31 | v31 * 0x100 | (v31 | v31 * 0x100) * 0x10000 | (v31 | v31 * 0x100 | (v31 | v31 * 0x100) * 0x10000) * 0x100000000;
        v33 = v28 & v30;
        v34 = *(long long *)((char *)v29 + v33);
        v36 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v34, v32));
        v37 = v36 & 0x8080808080808080;
        if (!(v36 & 0x8080808080808080))
        {
            do
            {
LABEL_c0cc88:
                v10 = 4;
                v11 = v26;
                v12 = 1;
                v13 = 0;
                if (v26 != 1)
                {
                    v24 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v34));
                    if (v24)
                    {
                        v39 = ((((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v40 = (((((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v41 = ((((v40 | v39) & 0xffff0000ffff0000) >> 16 | (v40 | v39) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v40 | v39) & 0xffff0000ffff0000) >> 16 | (v40 | v39) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v41)
                            v42 = 64;
                        else
                            v42 = Clz(v41);
                        v24 = v33 + (v42 >> 3) & v30;
                    }
                    else
                    {
                        v26 = 0;
                        continue;
                    }
                }
                v43 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v34, _mm_set1_epi8(-1)));
                if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))))))) & 1))
                {
                    v26 = 1;
                }
                else
                {
                    v55 = *((char *)v29 + v24);
                    if (!(v55 >> 31 & 1))
                    {
                        v57 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v29));
                        v58 = ((((((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v59 = (((((((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v60 = ((((v59 | v58) & 0xffff0000ffff0000) >> 16 | (v59 | v58) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v59 | v58) & 0xffff0000ffff0000) >> 16 | (v59 | v58) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v60)
                            v61 = 64;
                        else
                            v61 = Clz(v60);
                        v24 = v61 >> 3;
                        v55 = *((char *)v29 + v24);
                    }
                    *((char *)v29 + v24) = v31;
                    *((char *)v29 + (v30 & v24 - 8) + 8) = v31;
                    v62 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v55 & 1));
                    *(__m128i *)&v9->field_10 = _mm_sub_epi64(v9->field_10, v62);
                    v63 = v29 - v24 * 16;
                    *(unsigned long *)((char *)v63 - 16) = v25;
                    *(unsigned long long *)((char *)v63 - 8) = v8;
                    goto LABEL_c0cbc4;
                }
                v27 += 8;
                v33 = v27 + v33 & v30;
                v34 = *(long long *)((char *)v29 + v33);
                v46 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v34, v32));
                v37 = v46 & 0x8080808080808080;
            } while (!(v46 & 0x8080808080808080));
        }
        while (1)
        {
            v47 = v37;
            v48 = ((((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v49 = (((((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v50 = ((((v49 | v48) & 0xffff0000ffff0000) >> 16 | (v49 | v48) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v49 | v48) & 0xffff0000ffff0000) >> 16 | (v49 | v48) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v50)
                v51 = 64;
            else
                v51 = Clz(v50);
            v52 = v29 - (v33 + (v51 >> 3) & v30) * 16;
            if (v25 == *(long long *)((char *)v52 - 16))
                break;
            v53 = v47 - 1;
            v37 = v53 & v47;
            if (!(v53 & v47))
                goto LABEL_c0cc88;
        }
        *(unsigned long long *)((char *)v52 - 8) = v8;
        do
        {
            /* unsupported instruction */;
            v10 = 4;
            v11 = /* unsupported instruction */;
            v12 = 1;
            v13 = 0;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v54 = arm64g_calculate_condition(20, v11, 1, 0);
        if (!(v54 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(v25);
        }
    }
    if (*(unsigned long long *)&v0)
    {
        v64 = arm64g_calculate_condition(v10 | 16, v11, v12, v13);
        v65 = arm64g_calculate_condition(20, (v64 & 1 ? *(unsigned long long *)((void*)&v0 + 8) : 0x40000000), 0, 0);
        if (!(v65 & 1))
            return;
    }
    else
    {
        v66 = arm64g_calculate_condition(v10 | 16, v11, v12, v13);
        v67 = arm64g_calculate_condition(16, (v66 & 1 ? *(unsigned long long *)((void*)&v0 + 8) : 0x40000000), 0, 0);
        if (!(v67 & 1))
            return;
    }
}
