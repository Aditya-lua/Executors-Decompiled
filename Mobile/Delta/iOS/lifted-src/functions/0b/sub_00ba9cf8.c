/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xba9cf8..0xbaa178 (1152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_ef83a8;

unsigned long long * sub_ba9cf8(void* a0, long long a1)
{
    uint128_t v9;  // q8
    unsigned long long v10;  // x8
    unsigned long v19;  // x12
    unsigned long long v20;  // x12
    uint128_t v21;  // q1
    unsigned int v22;  // s1
    unsigned long v24;  // x12
    unsigned long long v25;  // x12
    unsigned long long v26;  // 4128
    unsigned long long v27;  // 4130
    unsigned long long v28;  // x13
    unsigned long long v11;  // x21
    unsigned long long v29;  // x13
    unsigned long long *v30;  // x22
    unsigned long long v31;  // x13
    unsigned long long v32;  // 4102
    unsigned long long v33;  // 4102
    void* v34;  // x0
    unsigned long long v35;  // x8
    unsigned long long *v36;  // x10
    unsigned long v37;  // x9
    unsigned long long v38;  // x12
    char v12;  // x20
    __m128i v39;  // q1
    unsigned long v41;  // x13
    unsigned long long v42;  // x13
    uint128_t v43;  // q1
    unsigned long v46;  // x13
    unsigned long long v47;  // x13
    unsigned long long v48;  // 4128
    void* v13;  // x10
    unsigned long long v49;  // 4130
    unsigned long long v50;  // x14
    unsigned long long v51;  // x14
    void* v52;  // x14
    unsigned long long v53;  // x14
    void* v54;  // x23
    unsigned long long v55;  // 4102
    unsigned long long ptr;  // x0
    void* v57;  // x9
    unsigned long long v58;  // x10
    unsigned long long v14;  // x9
    unsigned long long v59;  // x11
    unsigned long v60;  // d0
    unsigned long long i;  // x13
    long long v62;  // x12
    unsigned long long v64;  // 4128
    unsigned long long v65;  // 4130
    unsigned long long v66;  // x12
    unsigned long long v67;  // x12
    unsigned long long v68;  // x12
    __m128i v15;  // q8
    unsigned long v69;  // x11
    unsigned long v71;  // x11
    unsigned long long v72;  // 4137
    unsigned long long v73;  // 4139
    unsigned long long v74;  // x11
    unsigned long long v75;  // x11
    __m128i v76;  // q1
    unsigned long long v16;  // x11
    __m128i v17;  // q1
    uint128_t v0;  // [bp-0xe0]
    unsigned long long v1;  // [bp-0xd0]
    unsigned long v2;  // [bp-0xc8]
    uint128_t v3;  // [bp-0xc0]
    uint128_t v4;  // [bp-0xb0]
    uint256_t v5;  // [bp-0xa0]
    unsigned long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v6 = *(unsigned long long *)&v9;
    v7 = &v8;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((long long)/* unsupported instruction */ >= 0)
    {
        v10 = 0;
        v11 = 5871781006564002453 * (a1 + 8);
        v12 = v11 >> 57;
        v13 = (long long)a0[288];
        v14 = (long long)a0[296];
        v15 = v12 | v12 * 0x100 | (v12 | v12 * 0x100) * 0x10000 | (v12 | v12 * 0x100 | (v12 | v12 * 0x100) * 0x10000) * 0x100000000;
        v16 = v11 & v14;
        v17 = *(long long *)((char *)v13 + v16);
        v19 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v17, v15));
        v20 = v19 & 0x8080808080808080;
        if (!(v19 & 0x8080808080808080))
            goto LABEL_ba9d9c;
        do
        {
            v10 += 8;
            v16 = v16 + v10 & v14;
            v17 = *(long long *)((char *)v13 + v16);
            v24 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v17, v15));
            v20 = v24 & 0x8080808080808080;
            if (v24 & 0x8080808080808080)
            {
                do
                {
                    v25 = v20;
                    v26 = ((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v27 = (((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v28 = ((((v27 | v26) & 0xffff0000ffff0000) >> 16 | (v27 | v26) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v27 | v26) & 0xffff0000ffff0000) >> 16 | (v27 | v26) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v28)
                        v29 = 64;
                    else
                        v29 = Clz(v28);
                    if (*(long long *)((char *)v13 + -16 * (v16 + (v29 >> 3) & v14) - 16) == a1)
                    {
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v32 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (!(v32 & 1))
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
                        v33 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (v33 & 1)
                            return v13 - (v16 + (v29 >> 3) & v14) * 16 - 8;
                        /* unsupported instruction */;
                        sub_b86a90(a1);
                        return v13 - (v16 + (v29 >> 3) & v14) * 16 - 8;
                    }
                    v31 = v25 - 1;
                    v20 = v31 & v25;
                } while (v31 & v25);
            }
LABEL_ba9d9c:
        } while ((v21 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v17, _mm_set1_epi8(-1))), v22 = __dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))))))), !((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v21, v21), _mm_unpacklo_epi64(v21, v21)))))))))) & 1)));
        v34 = a0;
        if ((long long)v34[304])
            goto LABEL_ba9e1c;
    }
    else
    {
        v34 = sub_c769bc();
    }
    a0 = v34;
    sub_c70f38(v34 + 288, a0 + 320);
LABEL_ba9e1c:
    *(unsigned long long *)&v0 = 0;
    v1 = 0;
    if (!(long long)a0[408])
    {
        sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in eve", 22, &g_ef83a8);
        __debugbreak();
    }
    v35 = 0;
    v36 = (long long)a0[384];
    v37 = (long long)a0[392];
    v38 = v11 & v37;
    v39 = *(long long *)((char *)v36 + v38);
    v41 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v39, v15));
    v42 = v41 & 0x8080808080808080;
    if (!(v41 & 0x8080808080808080))
        goto LABEL_ba9e84;
    while (1)
    {
        do
        {
            v47 = v42;
            v48 = ((((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v49 = (((((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v50 = ((((v49 | v48) & 0xffff0000ffff0000) >> 16 | (v49 | v48) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v49 | v48) & 0xffff0000ffff0000) >> 16 | (v49 | v48) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v50)
                v51 = 64;
            else
                v51 = Clz(v50);
            v52 = (char *)v36 + -(40 * (v38 + (v51 >> 3) & v37));
            if (a1 == *(long long *)((char *)v52 - 40))
            {
                v54 = a0;
                v2 = *(long long *)((char *)v52 - 32);
                v3 = *(int128_t *)((char *)v52 - 16);
                if (sub_bcf85c(&v0, &v2, a1))
                {
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v55 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (!(v55 & 1))
                    {
                        /* unsupported instruction */;
                        sub_b86a90();
                    }
                }
                *(uint128_t *)((char *)&v5 + 8) = v0;
                *(unsigned long long *)((char *)&v5 + 24) = v1;
                v4 = CONCAT(1, 1);
                *(unsigned long long *)&v5 = 0;
                ptr = _malloc(48);
                if (ptr)
                {
                    *(uint128_t *)ptr = v4;
                    *(uint128_t *)(ptr + 16) = *(uint128_t *)&v5;
                    *(uint128_t *)(ptr + 32) = *(uint128_t *)((void*)&v5 + 16);
                    v57 = (long long)v54[288];
                    v58 = (long long)v54[296];
                    v59 = v58 & v11;
                    v60 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v57 + v59)));
                    i = __double_as_longlong(v60);
                    if (!i)
                    {
                        v62 = 8;
                        do
                        {
                            v59 = v59 + v62 & v58;
                            i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v57 + v59)));
                            v62 += 8;
                        } while (!i);
                    }
                    v64 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v65 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v66 = ((((v65 | v64) & 0xffff0000ffff0000) >> 16 | (v65 | v64) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v65 | v64) & 0xffff0000ffff0000) >> 16 | (v65 | v64) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v66)
                        v67 = 64;
                    else
                        v67 = Clz(v66);
                    v68 = v59 + (v67 >> 3) & v58;
                    v69 = *((char *)v57 + v68);
                    if (!(v69 >> 31 & 1))
                    {
                        v71 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v57));
                        v72 = ((((((v71 & 0xaaaaaaaaaaaaaaaa) >> 1 | v71 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v71 & 0xaaaaaaaaaaaaaaaa) >> 1 | v71 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v71 & 0xaaaaaaaaaaaaaaaa) >> 1 | v71 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v71 & 0xaaaaaaaaaaaaaaaa) >> 1 | v71 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v73 = (((((((v71 & 0xaaaaaaaaaaaaaaaa) >> 1 | v71 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v71 & 0xaaaaaaaaaaaaaaaa) >> 1 | v71 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v71 & 0xaaaaaaaaaaaaaaaa) >> 1 | v71 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v71 & 0xaaaaaaaaaaaaaaaa) >> 1 | v71 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v74 = ((((v73 | v72) & 0xffff0000ffff0000) >> 16 | (v73 | v72) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v73 | v72) & 0xffff0000ffff0000) >> 16 | (v73 | v72) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v74)
                            v75 = 64;
                        else
                            v75 = Clz(v74);
                        v68 = v75 >> 3;
                        v69 = *((char *)v57 + v68);
                    }
                    *((char *)v57 + v68) = v12;
                    *((char *)v57 + (v68 - 8 & v58) + 8) = v12;
                    v30 = v57 - v68 * 16;
                    *(long long *)((char *)v30 - 16) = a1;
                    *(unsigned long long *)((char *)v30 - 8) = ptr;
                    v76 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v69 & 1));
                    *(__m128i *)&v54[304] = _mm_sub_epi64((int128_t)v54[304], v76);
                    return (char *)v30 - 8;
                }
                sub_c6ba70(8, 48);
                __debugbreak();
            }
            v53 = v47 - 1;
            v42 = v53 & v47;
        } while (v53 & v47);
        do
        {
LABEL_ba9e84:
            v43 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v39, _mm_set1_epi8(-1)));
            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))))))) & 1)
            {
                sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in eve", 22, &g_ef83a8);
                __debugbreak();
            }
            v35 += 8;
            v38 = v38 + v35 & v37;
            v39 = *(long long *)((char *)v36 + v38);
            v46 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v39, v15));
            v42 = v46 & 0x8080808080808080;
        } while (!(v46 & 0x8080808080808080));
    }
}
