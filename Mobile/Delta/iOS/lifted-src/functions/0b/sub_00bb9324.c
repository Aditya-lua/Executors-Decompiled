/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb9324..0xbb9918 (1524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb9324_2 {
    unsigned long long field_0;
    struct st_bb9324_1 *field_8;
} st_bb9324_2;

typedef struct st_bb9324_3 {
    struct st_bb9324_4 *field_0;
    unsigned long long field_8;
} st_bb9324_3;

typedef struct st_bb9324_6 {
    char padding_0[8];
    struct st_bb9324_5 *field_8;
    unsigned long long field_10;
} st_bb9324_6;

typedef struct st_bb9324_5 {
    unsigned long long field_0;
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
} st_bb9324_5;

typedef struct st_bb9324_0 {
    unsigned long long field_0;
    char padding_8[16];
    double field_18;
} st_bb9324_0;

typedef struct st_bb9324_7 {
    struct st_bb9324_6 *field_0;
    char padding_8[4];
    unsigned int field_c;
    char padding_10[8];
    char field_18;
    char padding_19[11];
    unsigned int field_24;
} st_bb9324_7;

typedef struct st_bb9324_1 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    long long field_28;
    long long field_30;
    char padding_38[8];
    long long field_40;
} st_bb9324_1;

typedef struct st_bb9324_4 {
    unsigned long long field_0;
} st_bb9324_4;

extern long long g_ef8e30;
extern long long g_ef8e48;

long long sub_bb9324(void* a0, unsigned long long *a1, unsigned int a2, unsigned int a3, st_bb9324_3 *a4)
{
    unsigned long v17;  // x23
    st_bb9324_0 *v18;  // x10
    unsigned long long v27;  // x26
    st_bb9324_5 *v28;  // x8
    unsigned int v29;  // x11
    unsigned long long i;  // x12
    st_bb9324_5 *v31;  // x16
    st_bb9324_5 *v32;  // x16
    unsigned int v33;  // x17
    unsigned long long v34;  // x1
    unsigned long long v35;  // x1
    unsigned long long v36;  // x1
    double v19;  // d0
    __m128i v37;  // q2
    unsigned long v39;  // x2
    unsigned long long v40;  // x2
    unsigned long long v41;  // x2
    unsigned long long v42;  // 4128
    unsigned long long v43;  // 4130
    unsigned int v44;  // x3
    unsigned long long v45;  // x3
    unsigned long long v46;  // x3
    st_bb9324_2 *v20;  // x8
    uint128_t v47;  // q2
    st_bb9324_7 *v49;  // x28
    st_bb9324_5 *v50;  // x16
    st_bb9324_5 *v51;  // x16
    unsigned int v52;  // x17
    unsigned long long v53;  // x1
    unsigned long long v54;  // x1
    unsigned long long v55;  // x1
    __m128i v56;  // q2
    unsigned int v21;  // x9
    unsigned long v58;  // x2
    unsigned long long v59;  // x2
    unsigned long long v60;  // x2
    unsigned long long v61;  // 4128
    unsigned long long v62;  // 4130
    unsigned int v63;  // x3
    unsigned long long v64;  // x3
    unsigned long long v65;  // x3
    uint128_t v66;  // q2
    st_bb9324_1 *v22;  // x23
    unsigned long v68;  // x22
    st_bb9324_7 *v69;  // x14
    st_bb9324_5 *v70;  // x14
    st_bb9324_5 *v71;  // x14
    unsigned int v72;  // x17
    unsigned long long v73;  // x0
    unsigned long long v74;  // x0
    unsigned long long v75;  // x0
    __m128i v76;  // q2
    unsigned long long *v23;  // x13
    unsigned long v78;  // x1
    unsigned long long v79;  // x1
    unsigned long long v80;  // x1
    unsigned long long v81;  // 4128
    unsigned long long v82;  // 4130
    unsigned int v83;  // x2
    unsigned long long v84;  // x2
    unsigned long long v85;  // x2
    uint128_t v86;  // q2
    st_bb9324_7 *v24;  // x10
    unsigned long long v88;  // 4110
    unsigned long long v89;  // 4102
    unsigned long long v90;  // 4110
    unsigned long long v91;  // 4102
    st_bb9324_5 *v92;  // x8
    st_bb9324_5 *v93;  // x8
    unsigned int v94;  // x9
    st_bb9324_5 *v95;  // x25
    unsigned long long v96;  // x11
    unsigned int v25;  // x25
    unsigned long long v97;  // x11
    unsigned long long v98;  // x11
    __m128i v99;  // q1
    unsigned long v101;  // x12
    unsigned long long v102;  // x12
    unsigned long long v103;  // x12
    unsigned long long v104;  // 4128
    unsigned long long v105;  // 4130
    unsigned long long v106;  // x13
    unsigned long long *v26;  // x27
    unsigned long long v107;  // x13
    unsigned long long *v108;  // x13
    unsigned long long v109;  // x13
    uint128_t v110;  // q1
    char v0;  // [bp-0x100]
    st_bb9324_7 *v1;  // [bp-0xf8]
    unsigned int v2;  // [bp-0xf0]
    unsigned int v3;  // [bp-0xe8]
    unsigned long v4;  // [bp-0xe0]
    unsigned long v5;  // [bp-0xd8]
    double v6;  // [bp-0xd0]
    unsigned int v7;  // [bp-0xc8]
    unsigned int v8;  // [bp-0xc0]
    st_bb9324_4 **ptr;  // [bp-0xb8]
    unsigned int v10;  // [bp-0xb0]
    uint128_t v11;  // [bp-0xa8]
    uint128_t v12;  // [bp-0x98]
    uint128_t v13;  // [bp-0x88]
    uint128_t v14;  // [bp-0x78]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = a2;
    if (a1[5] <= v17 || (v18 = a1[4] + v17 * 32, v18->field_0 == 0x8000000000000000))
        v19 = nan;
    else
        v19 = v18->field_18;
    v7 = a2;
    v4 = a1[7];
    v5 = a1[8];
    v6 = v19;
    v3 = 0;
    sub_b9b9f0(&v0, &v3);
    if (a1[5] <= v17 || (v20 = a1[4] + v17 * 32, v20->field_0 == 0x8000000000000000))
    {
        sub_c73c64(&g_ef8e30);
        goto LABEL_bb98cc;
    }
    v21 = v20[1].field_0;
    if (!v21 || (v22 = v20->field_8, v23 = (char *)v22 + 264 * v21, *(long long *)((char *)v23 - 240) != 16 || v2 != 2))
    {
LABEL_bb9810:
        *(unsigned long long *)a0 = 12;
        goto LABEL_bb9818;
    }
    v24 = v1;
    v25 = a4[1].field_8;
    v26 = a4->field_0;
    v27 = a4->field_8;
    if (v24->field_c != a3)
    {
LABEL_bb94cc:
        if (v24->field_24 == a3)
        {
            v49 = &v24->field_18;
            v28 = v49->field_0->field_8;
            v29 = v49->field_0->field_10;
            i = 48;
            v50 = v28;
LABEL_bb9560:
            v51 = v50;
            if (v51 == &v28[3 * v49->field_0->field_10])
                goto LABEL_bb958c;
            if (v25)
            {
                v52 = 0;
                v50 = v51 + 3;
                v53 = 5871781006564002453 * (v51->field_0 + 8);
                v54 = v53;
                while (1)
                {
                    v55 = v54 & v27;
                    v56 = *(long long *)((char *)v26 + v55);
                    v58 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v56, (uint128_t)(v53 >> 57 & 0xff | (v53 >> 57 & 0xff) * 0x100 | (v53 >> 57 & 0xff | (v53 >> 57 & 0xff) * 0x100) * 0x10000 | (v53 >> 57 & 0xff | (v53 >> 57 & 0xff) * 0x100 | (v53 >> 57 & 0xff | (v53 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                    v59 = v58 & 0x8080808080808080;
                    if (v58 & 0x8080808080808080)
                    {
                        do
                        {
                            v60 = v59;
                            v61 = ((((((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v62 = (((((((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v63 = ((((v62 | v61) & 0xffff0000ffff0000) >> 16 | (v62 | v61) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v62 | v61) & 0xffff0000ffff0000) >> 16 | (v62 | v61) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v63)
                                v64 = 64;
                            else
                                v64 = Clz(v63);
                            if (v51->field_0 == *(long long *)((char *)v26 + -(72 * (v55 + (v64 >> 3) & v27)) - 72))
                                goto LABEL_bb9560;
                        } while ((v65 = v60 - 1, v59 = v65 & v60, v65 & v60));
                    }
                    v66 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v56, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))))))) & 1)
                        break;
                    v52 += 8;
                    v54 = v55 + v52;
                }
            }
        }
        goto LABEL_bb9810;
    }
    v28 = v24->field_0->field_8;
    v29 = v24->field_0->field_10;
    i = 24;
    v31 = v28;
LABEL_bb94a4:
    v32 = v31;
    if (v32 != &v28[3 * v24->field_0->field_10])
    {
        if (v25)
        {
            v33 = 0;
            v31 = v32 + 3;
            v34 = 5871781006564002453 * (v32->field_0 + 8);
            v35 = v34;
            while (1)
            {
                v36 = v35 & v27;
                v37 = *(long long *)((char *)v26 + v36);
                v39 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v37, (uint128_t)(v34 >> 57 & 0xff | (v34 >> 57 & 0xff) * 0x100 | (v34 >> 57 & 0xff | (v34 >> 57 & 0xff) * 0x100) * 0x10000 | (v34 >> 57 & 0xff | (v34 >> 57 & 0xff) * 0x100 | (v34 >> 57 & 0xff | (v34 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                v40 = v39 & 0x8080808080808080;
                if (v39 & 0x8080808080808080)
                {
                    do
                    {
                        v41 = v40;
                        v42 = ((((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v43 = (((((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v44 = ((((v43 | v42) & 0xffff0000ffff0000) >> 16 | (v43 | v42) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v43 | v42) & 0xffff0000ffff0000) >> 16 | (v43 | v42) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v44)
                            v45 = 64;
                        else
                            v45 = Clz(v44);
                        if (v32->field_0 == *(long long *)((char *)v26 + -(72 * (v36 + (v45 >> 3) & v27)) - 72))
                            goto LABEL_bb94a4;
                    } while ((v46 = v41 - 1, v40 = v46 & v41, v46 & v41));
                }
                v47 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v37, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))))))) & 1)
                    break;
                v33 += 8;
                v35 = v36 + v33;
            }
        }
        goto LABEL_bb94cc;
    }
    else
    {
        v49 = v24;
LABEL_bb958c:
        v68 = (char *)v23 - 232;
    }
    while (i != 48)
    {
        v69 = (char *)v24 + i;
        i += 24;
        if (v69->field_c != a3)
            continue;
        v70 = v69->field_0->field_8;
LABEL_bb9600:
        v71 = v70;
        if (v71 == &v69->field_0->field_8[3 * v69->field_0->field_10])
            goto LABEL_bb9810;
        v70 = v71 + 3;
        if (v25)
        {
            v72 = 0;
            v73 = 5871781006564002453 * (v71->field_0 + 8);
            v74 = v73;
            while (1)
            {
                v75 = v74 & v27;
                v76 = *(long long *)((char *)v26 + v75);
                v78 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v76, (uint128_t)(v73 >> 57 & 0xff | (v73 >> 57 & 0xff) * 0x100 | (v73 >> 57 & 0xff | (v73 >> 57 & 0xff) * 0x100) * 0x10000 | (v73 >> 57 & 0xff | (v73 >> 57 & 0xff) * 0x100 | (v73 >> 57 & 0xff | (v73 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                v79 = v78 & 0x8080808080808080;
                if (v78 & 0x8080808080808080)
                {
                    do
                    {
                        v80 = v79;
                        v81 = ((((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v82 = (((((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v83 = ((((v82 | v81) & 0xffff0000ffff0000) >> 16 | (v82 | v81) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v82 | v81) & 0xffff0000ffff0000) >> 16 | (v82 | v81) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v83)
                            v84 = 64;
                        else
                            v84 = Clz(v83);
                        if (v71->field_0 == *(long long *)((char *)v26 + -(72 * (v75 + (v84 >> 3) & v27)) - 72))
                            goto LABEL_bb9600;
                    } while ((v85 = v80 - 1, v79 = v85 & v80, v85 & v80));
                }
                v86 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v76, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v86, v86), _mm_unpacklo_epi64(v86, v86)))))))))) & 1)
                    break;
                v72 += 8;
                v74 = v75 + v72;
            }
        }
    }
    if (v21 == 1)
    {
        if (v25)
        {
            v92 = v28;
            while (1)
            {
                v93 = v92;
                if (v93 == &v28[3 * v29])
                    break;
                v94 = 0;
                v95 = v93;
                v92 = v95 + 3;
                v96 = 5871781006564002453 * (v95->field_0 + 8);
                v97 = v96;
                while (1)
                {
                    v98 = v97 & v27;
                    v99 = *(long long *)((char *)v26 + v98);
                    v101 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v99, (uint128_t)(v96 >> 57 & 0xff | (v96 >> 57 & 0xff) * 0x100 | (v96 >> 57 & 0xff | (v96 >> 57 & 0xff) * 0x100) * 0x10000 | (v96 >> 57 & 0xff | (v96 >> 57 & 0xff) * 0x100 | (v96 >> 57 & 0xff | (v96 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                    v102 = v101 & 0x8080808080808080;
                    if (v101 & 0x8080808080808080)
                        break;
LABEL_bb9760:
                    v110 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v99, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v110, v110), _mm_unpacklo_epi64(v110, v110)))))))))) & 1)
                        goto LABEL_bb9810;
                    v94 += 8;
                    v97 = v98 + v94;
                }
                while (1)
                {
                    v103 = v102;
                    v104 = ((((((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v105 = (((((((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v103 & 0xaaaaaaaaaaaaaaaa) >> 1 | v103 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v106 = ((((v105 | v104) & 0xffff0000ffff0000) >> 16 | (v105 | v104) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v105 | v104) & 0xffff0000ffff0000) >> 16 | (v105 | v104) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v106)
                        v107 = 64;
                    else
                        v107 = Clz(v106);
                    v108 = (char *)v26 + -(72 * (v98 + (v107 >> 3) & v27));
                    if (v95->field_0 == *(long long *)((char *)v108 - 72))
                        break;
                    v109 = v103 - 1;
                    v102 = v109 & v103;
                    if (!(v109 & v103))
                        goto LABEL_bb9760;
                }
            }
            goto LABEL_bb97c0;
        }
        if (!v29)
        {
LABEL_bb97c0:
            sub_bb813c(&v11, v68);
            *(uint128_t *)a0 = v11;
            *(uint128_t *)&a0[16] = v12;
            *(uint128_t *)&a0[32] = v13;
            *(uint128_t *)&a0[48] = v14;
            *(char *)&a0[64] = 0;
            goto LABEL_bb9818;
        }
    }
    if (v21 != 2 || v22->field_18 != 15)
        goto LABEL_bb9810;
    sub_b8c520(&v8, v22->field_28, v22->field_30);
    if (v10 == 1)
    {
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if ((long long)/* unsupported instruction */ < 0)
        {
            sub_c769bc();
LABEL_bb98b4:
            sub_c73c80("assertion failed: assign.right.len() == 1assertion failed: skip_over_node(function, pattern.first_node, other_edge)assertion failed: first_to_sc_edges.len() == 1assertion failed: second_to_sc_edges.len() == 1assertion failed: new_upvalues_in.contains(&value)assertion failed: self.incomplete_params.is_empty()assertion failed: function.predecessor_blocks(function.entry().unwrap()).next().is_none()assertion failed: new_rvalue.is_none()assertion failed: table.0.iter().filter(|(k, _)| k.is_none()).count() == set_list.index - 1assertion failed: !table.0.last().map_or(false,\n        |(k, v)|\n            k.is_none() &&\n                matches!(v, ast::RValue::VarArg(_) | ast::RValue::Call(_) |\n                    ast::RValue::MethodCall(_)))Range start can not be after range endassertion failed: T::is_node_index() != U::is_node_index() || i.index() != j.index()Pre-condition of values_read violated: self.has_block(node)assertion failed: res.1.weight().branch_type == BranchType::Elseassertion failed: res.0.weight().bra", 41, &g_ef8e48);
LABEL_bb98cc:
            __debugbreak();
        }
        v11 = CONCAT(*(long long *)*ptr, 0);
        if (sub_bb4954(v68, &v11) & 1)
        {
            sub_bb3264(&v11);
            if (v25 == 1)
            {
                if (v49->field_0->field_10 == 1 && !*(long long *)&v49->field_0->field_8->field_8)
                {
                    if (v49->field_0->field_8->field_10 != *(long long *)*ptr)
                    {
                        v88 = arm64g_calculate_condition(20, v49->field_0->field_10, 1, 0);
                        v89 = arm64g_calculate_condition(20, (v88 & 1 ? 1 : 0x40000000), 0, 0);
                        if (!(v89 & 1))
                            goto LABEL_bb9850;
                    }
                    else
                    {
                        v90 = arm64g_calculate_condition(20, v49->field_0->field_10, 1, 0);
                        v91 = arm64g_calculate_condition(16, (v90 & 1 ? 1 : 0x40000000), 0, 0);
                        if (!(v91 & 1))
                            goto LABEL_bb9850;
                    }
                }
            }
            else
            {
                if (!v25)
                {
LABEL_bb9850:
                    if (*(long long *)&v22[1].padding_0[0] != 1)
                        goto LABEL_bb98b4;
                    sub_bb813c(&v11, v22->field_40);
                    *(uint128_t *)a0 = v11;
                    *(uint128_t *)&a0[16] = v12;
                    *(uint128_t *)&a0[32] = v13;
                    *(uint128_t *)&a0[48] = v14;
                    *(char *)&a0[64] = 1;
                    if (v8)
                        _free(ptr);
LABEL_bb9818:
                    if (!v0)
                        return sub_b9a58c(a4);
                    _free(v1);
                    return sub_b9a58c(a4);
                }
            }
        }
        else
        {
            sub_bb3264(&v11);
        }
    }
    if (v8)
    {
        _free(ptr);
        goto LABEL_bb9810;
    }
}
