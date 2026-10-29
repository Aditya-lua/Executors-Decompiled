/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbc47ec..0xbc4f7c (1936 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bc47ec_0 {
    char padding_0[1];
    unsigned long long field_1;
} st_bc47ec_0;

typedef struct st_bc47ec_5 {
    unsigned long long field_0;
    unsigned long long field_8;
    uint128_t field_10;
    char padding_20[32];
    struct st_bc47ec_2 *field_40;
    struct st_bc47ec_2 *field_48;
    char padding_50[16];
    struct st_bc47ec_2 *field_60;
    struct st_bc47ec_2 *field_68;
    char padding_70[144];
    unsigned long long field_100;
} st_bc47ec_5;

typedef struct st_bc47ec_4 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_bc47ec_4;

typedef struct st_bc47ec_3 {
    char padding_0[72];
    char field_48;
    char padding_49[7];
    unsigned long long field_50;
    char padding_58[56];
    struct st_bc47ec_1 *field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
    uint128_t field_a8;
    char padding_b8[32];
    struct st_bc47ec_2 *field_d8;
    struct st_bc47ec_2 *field_e0;
    char padding_e8[16];
    struct st_bc47ec_2 *field_f8;
    struct st_bc47ec_2 *field_100;
    char padding_108[48];
    char field_138;
    char padding_139[95];
    unsigned long long field_198;
} st_bc47ec_3;

typedef struct st_bc47ec_1 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[8];
    struct st_bc47ec_2 *field_38;
    unsigned long long field_40;
} st_bc47ec_1;

typedef struct st_bc47ec_2 {
    unsigned long long field_0;
} st_bc47ec_2;

extern long long g_efa4b8;
extern uint128_t g_efc958;
extern uint128_t g_efc968;

long long sub_bc47ec(st_bc47ec_3 *a0, unsigned long long a1, st_bc47ec_0 **a2)
{
    char v4;  // x24
    unsigned long long v5;  // x8
    unsigned long v14;  // x14
    unsigned long long v105;  // 4128
    unsigned long long v106;  // 4130
    unsigned long long v107;  // x11
    unsigned long long v108;  // x11
    unsigned long long v109;  // x11
    unsigned long v110;  // x10
    unsigned long v112;  // x10
    unsigned long long v113;  // 4137
    unsigned long long v15;  // x14
    unsigned long long v114;  // 4139
    unsigned long long v115;  // x10
    unsigned long long v116;  // x10
    void* v117;  // x13
    __m128i v118;  // q1
    unsigned long long v119;  // 4102
    __m128i v16;  // q2
    unsigned long v19;  // x14
    unsigned long long v20;  // x14
    unsigned long long v21;  // 4128
    unsigned long long v22;  // 4130
    unsigned long long v23;  // x15
    st_bc47ec_0 *v6;  // x9
    unsigned long long v24;  // x15
    void* v25;  // x15
    unsigned long long v26;  // x15
    unsigned long long v27;  // x8
    unsigned long long v28;  // x11
    __m128i v29;  // q0
    unsigned long long v30;  // x11
    __m128i v31;  // q2
    unsigned long v33;  // x12
    unsigned long long v7;  // x13
    unsigned long long v34;  // x12
    __m128i v35;  // q2
    unsigned long v38;  // x12
    unsigned long long v39;  // x12
    unsigned long long v40;  // 4128
    unsigned long long v41;  // 4130
    unsigned long long v42;  // x13
    unsigned long long v43;  // x13
    unsigned long long *v8;  // x11
    void* v44;  // x13
    unsigned long long v45;  // x13
    unsigned long long v46;  // x22
    unsigned long long v47;  // x8
    unsigned long long v48;  // x12
    unsigned long long *v49;  // x11
    __m128i v50;  // q0
    unsigned long long v51;  // x12
    __m128i v52;  // q2
    unsigned long long *v9;  // x10
    unsigned long v54;  // x13
    unsigned long long v55;  // x13
    __m128i v56;  // q2
    unsigned long v59;  // x13
    unsigned long long v60;  // x13
    unsigned long long v61;  // 4128
    unsigned long long v62;  // 4130
    unsigned long long v63;  // x14
    __m128i v10;  // q0
    unsigned long long v64;  // x14
    unsigned long long v65;  // x14
    st_bc47ec_1 *v66;  // x10
    st_bc47ec_4 *v67;  // x9
    unsigned long v68;  // x12
    unsigned long long v69;  // x11
    unsigned long v70;  // x1
    unsigned int *v71;  // x13
    unsigned long long v72;  // 4127
    unsigned int *v73;  // x12
    unsigned long long v11;  // x13
    unsigned long long v74;  // 4127
    unsigned long long ptr;  // x0
    st_bc47ec_0 *v76;  // x23
    unsigned long long v77;  // 4102
    st_bc47ec_0 *v78;  // x1
    unsigned long long ptr1;  // x0
    unsigned long long v80;  // 4102
    st_bc47ec_0 *v81;  // x1
    unsigned long long v82;  // x10
    st_bc47ec_5 *v83;  // x0
    __m128i v12;  // q2
    unsigned long long v84;  // x25
    __m128i v85;  // q0
    unsigned long long v86;  // x12
    __m128i v87;  // q2
    unsigned long v89;  // x13
    unsigned long long v90;  // x14
    uint128_t v91;  // q2
    unsigned long v94;  // x13
    unsigned long long v95;  // x14
    unsigned long long v96;  // 4128
    unsigned long long v97;  // 4130
    unsigned long long v98;  // x13
    unsigned long long v99;  // x13
    unsigned long long v100;  // x13
    unsigned long long i;  // x12
    long long v103;  // x11
    uint288_t v0;  // [bp-0x74]
    uint288_t v1;  // [bp-0x74]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = 149;
    if (*(long long *)&a0->padding_108[0])
    {
        v5 = 0;
        v6 = *a2;
        v7 = 5871781006564002453 * &v6->field_1;
        v8 = *(long long *)&a0->padding_e8[8];
        v9 = a0->field_f8;
        v10 = v7 >> 57 & 0xff | (v7 >> 57 & 0xff) * 0x100 | (v7 >> 57 & 0xff | (v7 >> 57 & 0xff) * 0x100) * 0x10000 | (v7 >> 57 & 0xff | (v7 >> 57 & 0xff) * 0x100 | (v7 >> 57 & 0xff | (v7 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
        v11 = v7 & v9;
        v12 = *(long long *)((char *)v8 + v11);
        v14 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v12, v10));
        v15 = v14 & 0x8080808080808080;
        if (!(v14 & 0x8080808080808080))
            goto LABEL_bc4898;
        while (1)
        {
            do
            {
                v20 = v15;
                v21 = ((((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v22 = (((((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v23 = ((((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v23)
                    v24 = 64;
                else
                    v24 = Clz(v23);
                v25 = (char *)v8 + -(40 * (v11 + (v24 >> 3) & v9));
                if (v6 == *(long long *)((char *)v25 - 40))
                {
                    if (*(long long *)((char *)v25 - 8))
                    {
                        v27 = 0;
                        v28 = 5871781006564002453 * (a1 & 0xffffffff);
                        v9 = *(long long *)((char *)v25 - 32);
                        v6 = *(long long *)((char *)v25 - 24);
                        v29 = v28 >> 57 & 0xff | (v28 >> 57 & 0xff) * 0x100 | (v28 >> 57 & 0xff | (v28 >> 57 & 0xff) * 0x100) * 0x10000 | (v28 >> 57 & 0xff | (v28 >> 57 & 0xff) * 0x100 | (v28 >> 57 & 0xff | (v28 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                        v30 = v28 & v6;
                        v31 = *(long long *)((char *)v9 + v30);
                        v33 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v31, v29));
                        v34 = v33 & 0x8080808080808080;
                        if (!(v33 & 0x8080808080808080))
                            goto LABEL_bc4934;
                        while (1)
                        {
                            do
                            {
                                v39 = v34;
                                v40 = ((((((v39 & 0xaaaaaaaaaaaaaaaa) >> 1 | v39 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v39 & 0xaaaaaaaaaaaaaaaa) >> 1 | v39 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v39 & 0xaaaaaaaaaaaaaaaa) >> 1 | v39 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v39 & 0xaaaaaaaaaaaaaaaa) >> 1 | v39 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v41 = (((((((v39 & 0xaaaaaaaaaaaaaaaa) >> 1 | v39 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v39 & 0xaaaaaaaaaaaaaaaa) >> 1 | v39 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v39 & 0xaaaaaaaaaaaaaaaa) >> 1 | v39 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v39 & 0xaaaaaaaaaaaaaaaa) >> 1 | v39 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v42 = ((((v41 | v40) & 0xffff0000ffff0000) >> 16 | (v41 | v40) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v41 | v40) & 0xffff0000ffff0000) >> 16 | (v41 | v40) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v42)
                                    v43 = 64;
                                else
                                    v43 = Clz(v42);
                                v44 = &v9[-2 * (v30 + (v43 >> 3) & v6)];
                                if ((unsigned int)a1 == *(int *)((char *)v44 - 16))
                                {
                                    v46 = *(long long *)((char *)v44 - 8);
                                    do
                                    {
                                        /* unsupported instruction */;
                                        v47 = /* unsupported instruction */;
                                        v6 = v47 + 1;
                                        /* unsupported instruction */;
                                        v9 = /* unsupported instruction */ ^ 1;
                                    } while ((unsigned int)v9);
                                    if ((long long)v47 < 0)
                                        goto LABEL_bc4e80;
                                    sub_bc3b18(a0, a1, *a2, v46);
                                    return v46;
                                }
                            } while ((v45 = v39 - 1, v34 = v45 & v39, v45 & v39));
                            do
                            {
LABEL_bc4934:
                                v35 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v31, _mm_set1_epi8(-1)));
                                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))))))))) & 1)
                                    goto LABEL_bc4968;
                                v27 += 8;
                                v30 = v30 + v27 & v6;
                                v31 = *(long long *)((char *)v9 + v30);
                                v38 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v31, v29));
                                v34 = v38 & 0x8080808080808080;
                            } while (!(v38 & 0x8080808080808080));
                        }
                    }
                    goto LABEL_bc4968;
                }
            } while ((v26 = v20 - 1, v15 = v26 & v20, v26 & v20));
            do
            {
LABEL_bc4898:
                v16 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v12, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v16, v16), _mm_unpacklo_epi64(v16, v16)))))))))) & 1)
                    goto LABEL_bc4968;
                v5 += 8;
                v11 = v11 + v5 & v9;
                v12 = *(long long *)((char *)v8 + v11);
                v19 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v12, v10));
                v15 = v19 & 0x8080808080808080;
            } while (!(v19 & 0x8080808080808080));
        }
    }
LABEL_bc4968:
    v47 = *(long long *)&a0->padding_e8[0];
    if (*(long long *)&a0->padding_e8[0])
    {
        v47 = 0;
        v6 = a1 & 0xffffffff;
        v48 = 5871781006564002453 * v6;
        v49 = *(long long *)&a0->padding_b8[24];
        v9 = a0->field_d8;
        v50 = v48 >> 57 & 0xff | (v48 >> 57 & 0xff) * 0x100 | (v48 >> 57 & 0xff | (v48 >> 57 & 0xff) * 0x100) * 0x10000 | (v48 >> 57 & 0xff | (v48 >> 57 & 0xff) * 0x100 | (v48 >> 57 & 0xff | (v48 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
        v51 = v48 & v9;
        v52 = *(long long *)((char *)v49 + v51);
        v54 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v52, v50));
        v55 = v54 & 0x8080808080808080;
        if (!(v54 & 0x8080808080808080))
            goto LABEL_bc49d0;
        while (1)
        {
            v60 = v55;
            v61 = ((((((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v62 = (((((((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v60 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v63 = ((((v62 | v61) & 0xffff0000ffff0000) >> 16 | (v62 | v61) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v62 | v61) & 0xffff0000ffff0000) >> 16 | (v62 | v61) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v63)
                v64 = 64;
            else
                v64 = Clz(v63);
            if ((unsigned int)a1 == *(int *)((char *)v49 + -4 * (v51 + (v64 >> 3) & v9) - 4))
                break;
            v65 = v60 - 1;
            v55 = v65 & v60;
            if (!(v65 & v60))
            {
                do
                {
LABEL_bc49d0:
                    v56 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v52, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v56, v56), _mm_unpacklo_epi64(v56, v56)))))))))) & 1)
                        goto LABEL_bc4a04;
                    v47 += 8;
                    v51 = v51 + v47 & v9;
                    v52 = *(long long *)((char *)v49 + v51);
                    v59 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v52, v50));
                    v55 = v59 & 0x8080808080808080;
                } while (!(v59 & 0x8080808080808080));
            }
        }
        v66 = a0->field_90;
        v47 = v66->field_40;
        if (v66->field_28 <= v6 || !(v67 = v66->field_20 + v6 * 32, v67->field_0 != 0x8000000000000000))
        {
            v6 = 0xffffffff;
            v9 = v66->field_38;
            if (v47 <= 0xffffffff)
                goto LABEL_bc4cf4;
            goto LABEL_bc4bbc;
        }
        v6 = v67->field_1c;
        v9 = v66->field_38;
        if (v47 > 0xffffffff)
        {
LABEL_bc4bbc:
            v68 = v9 + 0x5fffffffe;
            v69 = *(int *)v68;
            v70 = *(int *)(v68 + 12);
            goto LABEL_bc4d14;
        }
LABEL_bc4cf4:
        v69 = 0xffffffff;
        do
        {
            if (v47 <= v6)
                goto LABEL_bc4d38;
        } while ((v71 = (char *)v9 + 0x30 * v6, v6 = v71[9], v70 = v71[10], v72 = arm64g_calculate_condition(1, v70 & 0xffffffff, 1, 0), v72 & 1));
LABEL_bc4d14:
        if (v69 >= v47)
        {
            do
            {
                if (v47 <= v6)
                {
                    v46 = sub_bc47ec(a0, v70, a2);
                    sub_bc3b18(a0, a1, *a2, v46);
                    return v46;
                }
            } while ((v73 = (char *)v9 + 0x30 * v6, v6 = v73[9], v74 = arm64g_calculate_condition(1, v73[10], 1, 0), v74 & 1));
        }
LABEL_bc4d38:
        ptr = _malloc(40);
        if (!ptr)
            goto LABEL_bc4e84;
        v46 = ptr;
        *(uint128_t *)ptr = 1;
        *(unsigned long long *)(ptr + 16) = 0x8000000000000000;
        do
        {
            /* unsupported instruction */;
            v47 = /* unsupported instruction */;
            v6 = v47 + 1;
            /* unsupported instruction */;
            v9 = /* unsupported instruction */ ^ 1;
        } while ((unsigned int)v9);
        if ((long long)v47 < 0)
            goto LABEL_bc4e80;
        v76 = *a2;
        do
        {
            /* unsupported instruction */;
            v47 = /* unsupported instruction */;
            v6 = v47 + 1;
            /* unsupported instruction */;
            v9 = /* unsupported instruction */ ^ 1;
        } while ((unsigned int)v9);
        if ((long long)v47 < 0)
            goto LABEL_bc4e80;
        if (sub_bafae4(&a0->padding_108[40], v46, v76))
        {
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v77 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v77 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90();
            }
        }
        v78 = *a2;
        if (sub_bda264(&a0->field_48, v78) != 1)
        {
LABEL_bc4e04:
            *(long long *)&a0->padding_139[87] = *(long long *)&a0->padding_139[87] + 1;
            sub_bc3b18(a0, a1, v76, v46);
            sub_bc3810(a0, a1, a2, v46);
            sub_bc3b18(a0, a1, *a2, v46);
            return v46;
        }
        if ((unsigned long long)*(long long *)&a0->padding_58[0] <= v78)
        {
            sub_c73c94(v78, *(long long *)&a0->padding_58[0], &g_efa4b8);
            __debugbreak();
        }
        v47 = a0->field_50;
        do
        {
            /* unsupported instruction */;
            v6 = /* unsupported instruction */;
            v9 = (v6->padding_0)[1];
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if (v6 < 0)
            goto LABEL_bc4e80;
        sub_bb081c(v47 + 48 * v78 + 8, v46);
        goto LABEL_bc4e04;
        goto LABEL_bc4c00;
    }
    else
    {
LABEL_bc4a04:
        ptr1 = _malloc(40);
        if (!ptr1)
            goto LABEL_bc4e84;
        v46 = ptr1;
        *(uint128_t *)ptr1 = 1;
        *(unsigned long long *)(ptr1 + 16) = 0x8000000000000000;
        do
        {
            /* unsupported instruction */;
            v47 = /* unsupported instruction */;
            v6 = v47 + 1;
            /* unsupported instruction */;
            v9 = /* unsupported instruction */ ^ 1;
        } while ((unsigned int)v9);
        if ((long long)v47 < 0)
            goto LABEL_bc4e80;
        do
        {
            /* unsupported instruction */;
            v47 = /* unsupported instruction */;
            v6 = v47 + 1;
            /* unsupported instruction */;
            v9 = /* unsupported instruction */ ^ 1;
        } while ((unsigned int)v9);
        if ((long long)v47 < 0)
            goto LABEL_bc4e80;
        if (sub_bafae4(&a0->padding_108[40], v46, *a2))
        {
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v80 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v80 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90();
            }
        }
        v81 = *a2;
        if (sub_bda264(&a0->field_48, v81) == 1)
        {
            if ((unsigned long long)*(long long *)&a0->padding_58[0] > v81)
            {
                v47 = a0->field_50;
                do
                {
                    /* unsupported instruction */;
                    v6 = /* unsupported instruction */;
                    v9 = (v6->padding_0)[1];
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                if (v6 < 0)
                    goto LABEL_bc4e80;
                sub_bb081c(v47 + 48 * v81 + 8, v46);
            }
            else
            {
                sub_c73c94(v81, *(long long *)&a0->padding_58[0], &g_efa4b8);
                __debugbreak();
            }
        }
        v82 = 0;
        v47 = a0->field_98;
        v83 = &a0->field_98;
        v83->field_100 = v83->field_100 + 1;
        v84 = 5871781006564002453 * (a1 & 0xffffffff);
        v4 = v84 >> 57;
        v6 = v83->field_8;
        v85 = v4 | v4 * 0x100 | (v4 | v4 * 0x100) * 0x10000 | (v4 | v4 * 0x100 | (v4 | v4 * 0x100) * 0x10000) * 0x100000000;
        v86 = v84 & v6;
        v87 = *(long long *)(v47 + v86);
        v89 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v87, v85));
        v90 = v89 & 0x8080808080808080;
        if (!(v89 & 0x8080808080808080))
            goto LABEL_bc4b4c;
        while (1)
        {
            do
            {
                v95 = v90;
                v96 = ((((((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v97 = (((((((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v98 = ((((v97 | v96) & 0xffff0000ffff0000) >> 16 | (v97 | v96) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v97 | v96) & 0xffff0000ffff0000) >> 16 | (v97 | v96) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v98)
                    v99 = 64;
                else
                    v99 = Clz(v98);
                if (*(int *)(v47 + -(40 * (v86 + (v99 >> 3) & v6)) - 40) == (unsigned int)a1)
                    goto LABEL_bc4c6c;
                v100 = v95 - 1;
                v90 = v100 & v95;
            } while (v100 & v95);
            do
            {
LABEL_bc4b4c:
                v91 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v87, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))))))))) & 1)
                {
                    if (!(&a0->field_a0)[1])
                    {
                        sub_c6e7ac();
                        v47 = a0->field_98;
                        v6 = a0->field_a0;
                    }
                    v1 = _INSERT(v0, 4, g_efc958);
                    *(uint128_t *)((char *)&v1 + 20) = g_efc968;
                    v9 = v6 & v84;
                    i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v47 + (char *)v9)));
                    if (!i)
                        goto LABEL_bc4e90;
                    goto LABEL_bc4c00;
                }
                v82 += 8;
                v86 = v86 + v82 & v6;
                v87 = *(long long *)(v47 + v86);
                v94 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v87, v85));
                v90 = v94 & 0x8080808080808080;
            } while (!(v94 & 0x8080808080808080));
        }
        while (1)
        {
LABEL_bc4c00:
            v105 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v106 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v107 = ((((v106 | v105) & 0xffff0000ffff0000) >> 16 | (v106 | v105) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v106 | v105) & 0xffff0000ffff0000) >> 16 | (v106 | v105) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v107)
                v108 = 64;
            else
                v108 = Clz(v107);
            v109 = (char *)v9 + (v108 >> 3) & v6;
            v110 = *(char *)(v47 + v109);
            if (!(v110 >> 31 & 1))
            {
                v112 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v47));
                v113 = ((((((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v114 = (((((((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v115 = ((((v114 | v113) & 0xffff0000ffff0000) >> 16 | (v114 | v113) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v114 | v113) & 0xffff0000ffff0000) >> 16 | (v114 | v113) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v115)
                    v116 = 64;
                else
                    v116 = Clz(v115);
                v109 = v116 >> 3;
                v110 = *(char *)(v47 + v109);
            }
            *(char *)(v47 + v109) = v4;
            *(char *)(v47 + (v109 - 8 & v6) + 8) = v4;
            v117 = v47 + -(40 * v109);
            *(unsigned int *)((char *)v117 - 40) = a1;
            *(uint128_t *)((char *)v117 - 36) = *(uint128_t *)&v0;
            *(uint128_t *)((char *)v117 - 20) = *(uint128_t *)((void*)&v0 + 16);
            *(unsigned int *)((char *)v117 - 4) = *(unsigned int *)((void*)&v0 + 32);
            v118 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v110 & 1));
            *(__m128i *)&(&a0->field_a0)[1] = _mm_sub_epi64(*(int128_t *)&(&a0->field_a0)[1], v118);
LABEL_bc4c6c:
            do
            {
                /* unsupported instruction */;
                v47 = /* unsupported instruction */;
                v6 = v47 + 1;
                /* unsupported instruction */;
                v9 = /* unsupported instruction */ ^ 1;
            } while ((unsigned int)v9);
            if ((long long)v47 >= 0)
            {
                do
                {
                    /* unsupported instruction */;
                    v47 = /* unsupported instruction */;
                    v6 = v47 + 1;
                    /* unsupported instruction */;
                    v9 = /* unsupported instruction */ ^ 1;
                } while ((unsigned int)v9);
                if ((long long)v47 >= 0)
                    break;
            }
LABEL_bc4e80:
            sub_c769bc();
LABEL_bc4e84:
            sub_c6ba70(8, 40);
LABEL_bc4e90:
            v103 = 8;
            do
            {
                v9 = (char *)v9 + v103 & v6;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v47 + (char *)v9)));
                v103 += 8;
            } while (!i);
        }
        if (sub_bafae4())
        {
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v119 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v119 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90();
            }
        }
        sub_bc3b18(a0, a1, *a2, v46);
        return v46;
    }
}
