/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbc3b18..0xbc40d8 (1472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bc3b18_0 {
    char padding_0[248];
    void* field_f8;
    unsigned long long field_100;
    char padding_108[8];
    unsigned long long field_110;
    void* field_118;
    unsigned long long field_120;
    char padding_128[8];
    unsigned long long field_130;
} st_bc3b18_0;

extern uint128_t g_efc958;
extern uint128_t g_efc968;

double sub_bc3b18(st_bc3b18_0 *a0, unsigned int a1, long long a2, long long a3)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x24
    unsigned long v102;  // x15
    unsigned long long v103;  // x15
    unsigned long long v104;  // 4128
    unsigned long long v105;  // 4130
    unsigned long long v106;  // x16
    unsigned long long v107;  // x16
    void* v108;  // x16
    unsigned long long v109;  // x16
    unsigned long long v110;  // 4102
    unsigned long v111;  // x12
    unsigned long v13;  // x13
    unsigned long v113;  // x11
    unsigned long long v114;  // 4137
    unsigned long long v115;  // 4139
    unsigned long long v116;  // x11
    unsigned long long v117;  // x11
    __m128i v118;  // q0
    void* v119;  // x8
    unsigned long long v14;  // x13
    uint128_t v15;  // q1
    unsigned int v16;  // s1
    unsigned long v18;  // x13
    unsigned long long v19;  // x13
    unsigned long long v20;  // 4128
    unsigned long long v21;  // 4130
    unsigned long long v4;  // x26
    unsigned long long v22;  // x14
    unsigned long long v23;  // x14
    void* v24;  // x23
    unsigned long long v25;  // x14
    unsigned long long v26;  // 4102
    void* v27;  // x8
    unsigned long long v28;  // x9
    unsigned long long v29;  // x10
    unsigned long v30;  // d0
    unsigned long long i;  // x12
    char v5;  // x25
    unsigned long long v32;  // x11
    unsigned long long v34;  // 4128
    unsigned long long v35;  // 4130
    unsigned long long v36;  // x11
    unsigned long long v37;  // x11
    unsigned long v38;  // x10
    unsigned long v40;  // x10
    unsigned long long v41;  // 4137
    void* v6;  // x10
    unsigned long long v42;  // 4139
    unsigned long long v43;  // x10
    unsigned long long v44;  // x10
    unsigned long long v45;  // x8
    void* v46;  // x9
    unsigned long long v47;  // x10
    unsigned long long v48;  // x12
    __m128i v49;  // q1
    unsigned long v51;  // x13
    unsigned long long v7;  // x9
    unsigned long long v52;  // x13
    uint128_t v53;  // q1
    unsigned int v54;  // s1
    unsigned long v56;  // x13
    unsigned long long v57;  // x13
    unsigned long long v58;  // 4128
    unsigned long long v59;  // 4130
    unsigned long long v60;  // x14
    unsigned long long v61;  // x14
    __m128i v8;  // q8
    unsigned long long v62;  // x14
    unsigned long long v63;  // 4102
    void* v64;  // x8
    unsigned long long v65;  // x9
    unsigned long long v66;  // x10
    unsigned long v67;  // d0
    unsigned long long j;  // x12
    unsigned long long v69;  // x11
    unsigned long long v71;  // 4128
    unsigned long long v9;  // x11
    unsigned long long v72;  // 4130
    unsigned long long v73;  // x11
    unsigned long long v74;  // x11
    unsigned long v75;  // x10
    unsigned long v77;  // x10
    unsigned long long v78;  // 4137
    unsigned long long v79;  // 4139
    unsigned long long v80;  // x10
    unsigned long long v81;  // x10
    unsigned long long v10;  // x12
    unsigned long long v82;  // x13
    unsigned long long v83;  // x12
    unsigned long long v84;  // x14
    void* v85;  // x8
    unsigned long long v86;  // x10
    char v87;  // x9
    __m128i v88;  // q0
    unsigned long long v89;  // x14
    __m128i v90;  // q2
    __m128i v11;  // q1
    unsigned long v92;  // x15
    unsigned long long v93;  // x15
    unsigned long long v95;  // 4128
    unsigned long long v96;  // 4130
    unsigned long long v97;  // x11
    unsigned long long v98;  // x11
    uint128_t v99;  // q2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((long long)/* unsupported instruction */ >= 0)
    {
        v2 = 0;
        v3 = 5871781006564002453;
        v4 = 5871781006564002453 * (a2 + 8);
        v5 = v4 >> 57;
        v6 = a0->field_118;
        v7 = a0->field_120;
        v8 = v5 | v5 * 0x100 | (v5 | v5 * 0x100) * 0x10000 | (v5 | v5 * 0x100 | (v5 | v5 * 0x100) * 0x10000) * 0x100000000;
        v9 = 40;
        v10 = v4 & v7;
        v11 = *(long long *)((char *)v6 + v10);
        v13 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, v8));
        v14 = v13 & 0x8080808080808080;
        if (!(v13 & 0x8080808080808080))
            goto LABEL_bc3bd0;
        do
        {
            v2 += 8;
            v10 = v10 + v2 & v7;
            v11 = *(long long *)((char *)v6 + v10);
            v18 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, v8));
            v14 = v18 & 0x8080808080808080;
            if (v18 & 0x8080808080808080)
            {
                do
                {
                    v19 = v14;
                    v20 = ((((((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v21 = (((((((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v22 = ((((v21 | v20) & 0xffff0000ffff0000) >> 16 | (v21 | v20) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v21 | v20) & 0xffff0000ffff0000) >> 16 | (v21 | v20) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v22)
                        v23 = 64;
                    else
                        v23 = Clz(v22);
                    v24 = v6 + -(40 * (v10 + (v23 >> 3) & v7));
                    if (*(long long *)((char *)v24 - 40) == a2)
                    {
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v26 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (!(v26 & 1))
                        {
                            /* unsupported instruction */;
                            sub_b86a90(a2);
                            goto LABEL_bc3cb0;
                        }
                    }
                } while ((v25 = v19 - 1, v14 = v25 & v19, v25 & v19));
            }
LABEL_bc3bd0:
        } while ((v15 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v11, _mm_set1_epi8(-1))), v16 = __dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))))))), !((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15)))))))))) & 1)));
        if (!a0->padding_128)
            sub_c7133c(&a0->field_118, a0 + 1);
        v27 = a0->field_118;
        v28 = a0->field_120;
        v29 = v28 & v4;
        v30 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v27 + v29)));
        i = __double_as_longlong(v30);
        if (!i)
        {
            v32 = 8;
            do
            {
                v29 = v29 + v32 & v28;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v27 + v29)));
                v32 += 8;
            } while (!i);
        }
        v34 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v35 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v36 = ((((v35 | v34) & 0xffff0000ffff0000) >> 16 | (v35 | v34) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v35 | v34) & 0xffff0000ffff0000) >> 16 | (v35 | v34) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v36)
            v37 = 64;
        else
            v37 = Clz(v36);
        v9 = v29 + (v37 >> 3) & v28;
        v38 = *((char *)v27 + v9);
        if (!(v38 >> 31 & 1))
        {
            v40 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v27));
            v41 = ((((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v42 = (((((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v43 = ((((v42 | v41) & 0xffff0000ffff0000) >> 16 | (v42 | v41) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v42 | v41) & 0xffff0000ffff0000) >> 16 | (v42 | v41) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v43)
                v44 = 64;
            else
                v44 = Clz(v43);
            v9 = v44 >> 3;
            v38 = *((char *)v27 + v9);
        }
        *((char *)v27 + v9) = v5;
        *((char *)v27 + (v9 - 8 & v28) + 8) = v5;
        v24 = v27 + -(40 * v9);
        a0->padding_128 = a0->padding_128 - (v38 & 1);
        *(long long *)((char *)v24 - 40) = a2;
        *(uint128_t *)((char *)v24 - 32) = g_efc958;
        *(uint128_t *)((char *)v24 - 16) = g_efc968;
        a0->field_130 = a0->field_130 + 1;
        do
        {
LABEL_bc3cb0:
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if ((long long)/* unsupported instruction */ >= 0)
        {
            sub_bb081c(v24 - 32, a3);
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            if ((long long)/* unsupported instruction */ >= 0)
            {
                v45 = 0;
                v46 = a0->field_f8;
                v47 = a0->field_100;
                v9 = 40;
                v48 = v4 & v47;
                v49 = *(long long *)((char *)v46 + v48);
                v51 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v49, v8));
                v52 = v51 & 0x8080808080808080;
                if (!(v51 & 0x8080808080808080))
                    goto LABEL_bc3d40;
                do
                {
                    v45 += 8;
                    v48 = v48 + v45 & v47;
                    v49 = *(long long *)((char *)v46 + v48);
                    v56 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v49, v8));
                    v52 = v56 & 0x8080808080808080;
                    if (v56 & 0x8080808080808080)
                    {
                        do
                        {
                            v57 = v52;
                            v58 = ((((((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v59 = (((((((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v57 & 0xaaaaaaaaaaaaaaaa) >> 1 | v57 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v60 = ((((v59 | v58) & 0xffff0000ffff0000) >> 16 | (v59 | v58) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v59 | v58) & 0xffff0000ffff0000) >> 16 | (v59 | v58) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v60)
                                v61 = 64;
                            else
                                v61 = Clz(v60);
                            v24 = v46 + -(40 * (v48 + (v61 >> 3) & v47));
                            if (*(long long *)((char *)v24 - 40) == a2)
                            {
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                v63 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                if (!(v63 & 1))
                                {
                                    /* unsupported instruction */;
                                    sub_b86a90(a2);
                                    goto LABEL_bc3e20;
                                }
                            }
                        } while ((v62 = v57 - 1, v52 = v62 & v57, v62 & v57));
                    }
LABEL_bc3d40:
                } while ((v53 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v49, _mm_set1_epi8(-1))), v54 = __dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))))))), !((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v53, v53), _mm_unpacklo_epi64(v53, v53)))))))))) & 1)));
                if (!a0->padding_108)
                    sub_c7133c();
                v64 = a0->field_f8;
                v65 = a0->field_100;
                v66 = v65 & v4;
                v67 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v64 + v66)));
                j = __double_as_longlong(v67);
                if (!j)
                {
                    v69 = 8;
                    do
                    {
                        v66 = v66 + v69 & v65;
                        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v64 + v66)));
                        v69 += 8;
                    } while (!j);
                }
                v71 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v72 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v73 = ((((v72 | v71) & 0xffff0000ffff0000) >> 16 | (v72 | v71) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v72 | v71) & 0xffff0000ffff0000) >> 16 | (v72 | v71) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v73)
                    v74 = 64;
                else
                    v74 = Clz(v73);
                v9 = v66 + (v74 >> 3) & v65;
                v75 = *((char *)v64 + v9);
                if (!(v75 >> 31 & 1))
                {
                    v77 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v64));
                    v78 = ((((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v79 = (((((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v80 = ((((v79 | v78) & 0xffff0000ffff0000) >> 16 | (v79 | v78) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v79 | v78) & 0xffff0000ffff0000) >> 16 | (v79 | v78) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v80)
                        v81 = 64;
                    else
                        v81 = Clz(v80);
                    v9 = v81 >> 3;
                    v75 = *((char *)v64 + v9);
                }
                *((char *)v64 + v9) = v5;
                *((char *)v64 + (v9 - 8 & v65) + 8) = v5;
                v24 = v64 + -(40 * v9);
                a0->padding_108 = a0->padding_108 - (v75 & 1);
                *(long long *)((char *)v24 - 40) = a2;
                *(uint128_t *)((char *)v24 - 32) = g_efc958;
                *(uint128_t *)((char *)v24 - 16) = g_efc968;
                a0->field_110 = a0->field_110 + 1;
                do
                {
LABEL_bc3e20:
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                if ((long long)/* unsupported instruction */ >= 0)
                {
                    if (*(long long *)((char *)v24 - 16))
                        goto LABEL_bc3e3c;
                    goto LABEL_bc3fa0;
                }
            }
        }
    }
    sub_c769bc();
LABEL_bc3fa0:
    sub_c6f054(v24 - 32, v24);
LABEL_bc3e3c:
    v82 = 0;
    v83 = 0;
    v84 = v3 * a1;
    v85 = *(long long *)((char *)v24 - 32);
    v86 = *(long long *)((char *)v24 - 24);
    v87 = v84 >> 57;
    v88 = v87 | v87 * 0x100 | (v87 | v87 * 0x100) * 0x10000 | (v87 | v87 * 0x100 | (v87 | v87 * 0x100) * 0x10000) * 0x100000000;
    v89 = v84 & v86;
    v90 = *(long long *)((char *)v85 + v89);
    v92 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v90, v88));
    v93 = v92 & 0x8080808080808080;
    if (!(v92 & 0x8080808080808080))
        goto LABEL_bc3ea0;
    while (1)
    {
        do
        {
            v103 = v93;
            v104 = ((((((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v105 = (((((((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v106 = ((((v105 | v104) & 0xffff0000ffff0000) >> 16 | (v105 | v104) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v105 | v104) & 0xffff0000ffff0000) >> 16 | (v105 | v104) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v106)
                v107 = 64;
            else
                v107 = Clz(v106);
            v108 = v85 - (v89 + (v107 >> 3) & v86) * 16;
            if (a1 == *(int *)((char *)v108 - 16))
            {
                *(long long *)((char *)v108 - 8) = a3;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v110 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (v110 & 1)
                    return _mm_cvtsi128_si64(v88);
                /* unsupported instruction */;
                sub_b86a90();
                return _mm_cvtsi128_si64(v88);
            }
            v109 = v103 - 1;
            v93 = v109 & v103;
        } while (v109 & v103);
        do
        {
LABEL_bc3ea0:
            if (v82 != 1)
            {
                v9 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v90));
                if (v9)
                {
                    v95 = ((((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v96 = (((((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v97 = ((((v96 | v95) & 0xffff0000ffff0000) >> 16 | (v96 | v95) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v96 | v95) & 0xffff0000ffff0000) >> 16 | (v96 | v95) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v97)
                        v98 = 64;
                    else
                        v98 = Clz(v97);
                    v9 = v89 + (v98 >> 3) & v86;
                }
                else
                {
                    v82 = 0;
                    continue;
                }
            }
            v99 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v90, _mm_set1_epi8(-1)));
            if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)))))))))) & 1))
            {
                v82 = 1;
            }
            else
            {
                v111 = *((char *)v85 + v9);
                if (!(v111 >> 31 & 1))
                {
                    v113 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v85));
                    v114 = ((((((v113 & 0xaaaaaaaaaaaaaaaa) >> 1 | v113 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v113 & 0xaaaaaaaaaaaaaaaa) >> 1 | v113 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v113 & 0xaaaaaaaaaaaaaaaa) >> 1 | v113 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v113 & 0xaaaaaaaaaaaaaaaa) >> 1 | v113 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v115 = (((((((v113 & 0xaaaaaaaaaaaaaaaa) >> 1 | v113 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v113 & 0xaaaaaaaaaaaaaaaa) >> 1 | v113 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v113 & 0xaaaaaaaaaaaaaaaa) >> 1 | v113 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v113 & 0xaaaaaaaaaaaaaaaa) >> 1 | v113 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v116 = ((((v115 | v114) & 0xffff0000ffff0000) >> 16 | (v115 | v114) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v115 | v114) & 0xffff0000ffff0000) >> 16 | (v115 | v114) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v116)
                        v117 = 64;
                    else
                        v117 = Clz(v116);
                    v9 = v117 >> 3;
                    v111 = *((char *)v85 + v9);
                }
                *((char *)v85 + v9) = v87;
                *((char *)v85 + (v86 & v9 - 8) + 8) = v87;
                v118 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v111 & 1));
                v88 = _mm_sub_epi64(*(int128_t *)((char *)v24 - 16), v118);
                *(__m128i *)((char *)v24 - 16) = v88;
                v119 = v85 - v9 * 16;
                *(unsigned int *)((char *)v119 - 16) = a1;
                *(long long *)((char *)v119 - 8) = a3;
                return _mm_cvtsi128_si64(v88);
            }
            v83 += 8;
            v89 = v83 + v89 & v86;
            v90 = *(long long *)((char *)v85 + v89);
            v102 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v90, v88));
            v93 = v102 & 0x8080808080808080;
        } while (!(v102 & 0x8080808080808080));
    }
}
