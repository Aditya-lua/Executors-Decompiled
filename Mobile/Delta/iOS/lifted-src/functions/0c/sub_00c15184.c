/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc15184..0xc15a4c (2248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c15184_0 {
    char padding_0[24];
    char field_18;
    char padding_19[7];
    struct st_c15184_1 *field_20;
    char padding_28[16];
    unsigned long long field_38;
    unsigned long long field_40;
    char padding_48[52];
    unsigned int field_7c;
} st_c15184_0;

typedef struct st_c15184_2 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_c15184_2;

typedef struct st_c15184_3 {
    char padding_0[24];
    unsigned long long field_18;
} st_c15184_3;

typedef struct st_c15184_4 {
    unsigned long long field_0;
    struct st_c15184_3 *field_8;
    char padding_10[12];
    unsigned int field_1c;
} st_c15184_4;

typedef struct st_c15184_1 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
} st_c15184_1;

typedef struct st_c15184_5 {
    char padding_0[40];
    unsigned int field_28;
} st_c15184_5;

typedef struct st_c15184_7 {
    char padding_0[36];
    unsigned int field_24;
    unsigned int field_28;
} st_c15184_7;

typedef struct st_c15184_6 {
    char padding_0[32];
    unsigned int field_20;
    char padding_24[8];
    unsigned int field_2c;
} st_c15184_6;

typedef struct st_c15184_8 {
    char padding_0[8];
    struct st_c15184_1 *field_8;
    char padding_10[16];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[52];
    unsigned int field_64;
} st_c15184_8;

extern unsigned long long g_bef1c8;
extern long long g_cb9f36;
extern long long g_efbc50;
extern long long g_efbc68;
extern long long g_efbc80;
extern long long g_efbc98;
extern long long g_efc830;
extern uint128_t g_efc958;
extern uint128_t g_efc968;

unsigned int sub_c15184(st_c15184_0 *a0)
{
    unsigned long long v25;  // x27
    unsigned long long idx;  // x26
    st_c15184_2 *v35;  // x9
    unsigned long long v36;  // x9
    unsigned long long v37;  // x24
    unsigned long long v38;  // x22
    unsigned long long v39;  // x28
    st_c15184_6 *v40;  // x10
    unsigned int v41;  // w20
    st_c15184_7 *v42;  // x10
    unsigned long long v43;  // 4127
    unsigned long long v44;  // x10
    st_c15184_8 *v27;  // x8
    unsigned long long v45;  // x20
    unsigned long long v46;  // x24
    unsigned long long v47;  // w25
    unsigned long long v48;  // x0
    unsigned int v49;  // w22
    unsigned long long v50;  // x9
    unsigned long long v51;  // x8
    unsigned long long v52;  // 4112
    unsigned long long v53;  // x9
    unsigned long long v54;  // x8
    unsigned long v28;  // x12
    unsigned long long v55;  // 4112
    unsigned long long iter;  // x22
    unsigned long long *v57;  // x26
    unsigned long long *v58;  // x27
    unsigned long long *v59;  // x26
    unsigned long v60;  // cc_op
    unsigned long v61;  // cc_dep1
    unsigned long v62;  // cc_dep2
    unsigned long v63;  // cc_ndep
    unsigned int v64;  // w19
    unsigned long long v29;  // x11
    unsigned long long *v65;  // x26
    unsigned long long v66;  // x9
    unsigned long long v67;  // x10
    unsigned long long v68;  // x10
    unsigned long long v69;  // x10
    __m128i v70;  // q2
    unsigned long v72;  // x11
    unsigned long long v73;  // x11
    unsigned long long v74;  // x11
    unsigned long long v30;  // 4106
    unsigned long long v75;  // 4128
    unsigned long long v76;  // 4130
    unsigned long long v77;  // x12
    unsigned long long v78;  // x12
    unsigned long long v79;  // x12
    uint128_t v80;  // q2
    unsigned long long ptr;  // x0
    unsigned long long index;  // x23
    unsigned long long *v84;  // x26
    unsigned long long v31;  // x19
    unsigned int v85;  // w28
    unsigned long long v86;  // x8
    unsigned long long v87;  // x9
    unsigned long long v88;  // x9
    unsigned long long v89;  // x9
    __m128i v90;  // q1
    unsigned long v92;  // x10
    unsigned long long v93;  // x10
    unsigned long long v94;  // x10
    unsigned long long v32;  // x12
    unsigned long long v95;  // 4128
    unsigned long long v96;  // 4130
    unsigned long long v97;  // x11
    unsigned long long v98;  // x11
    unsigned long long v99;  // x11
    uint128_t v100;  // q1
    unsigned int *node;  // x22
    unsigned int *v103;  // x27
    unsigned long long v104;  // x8
    unsigned int v33;  // w13
    st_c15184_4 *v105;  // x9
    unsigned long v106;  // x12
    unsigned long long v107;  // x12
    st_c15184_5 *v108;  // x13
    unsigned long long v109;  // 4130
    unsigned long long v110;  // x23
    unsigned long long v111;  // x23
    unsigned long long v112;  // x9
    unsigned long long v113;  // x8
    unsigned long long v114;  // x9
    unsigned int v34;  // w14
    unsigned long long v115;  // 4110
    unsigned long long v116;  // 4102
    unsigned long long v117;  // 4110
    unsigned long long v118;  // 4102
    unsigned long long v119;  // x9
    unsigned long long v120;  // x8
    unsigned long long v121;  // 4112
    unsigned long long v122;  // x8
    unsigned long long v123;  // 4118
    unsigned long long ptr2;  // [bp-0x1a0]
    unsigned int *ptr1;  // [bp-0x198]
    char *v2;  // [bp-0x190], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x188]
    uint128_t v4;  // [bp-0x180], Other Possible Types: char
    uint128_t v5;  // [bp-0x170], Other Possible Types: unsigned long long
    unsigned long long v6;  // [bp-0x170]
    uint128_t v7;  // [bp-0x160]
    char v8;  // [bp-0x150], Other Possible Types: unsigned long long
    st_c15184_8 *v9;  // [bp-0x148]
    long long v10;  // [bp-0x140]
    uint128_t v11;  // [bp-0x120]
    uint128_t v12;  // [bp-0x110]
    uint128_t v13;  // [bp-0x100]
    unsigned long long v14;  // [bp-0xf0]
    uint128_t v15;  // [bp-0xe0]
    uint128_t v16;  // [bp-0xd0]
    uint128_t v17;  // [bp-0xc0]
    unsigned long long v18;  // [bp-0xb0]
    char *v19;  // [bp-0xa8], Other Possible Types: uint128_t, unsigned long long
    unsigned long long v20;  // [bp-0xa0]
    char *v21;  // [bp-0x98], Other Possible Types: uint320_t, unsigned long long
    unsigned long long v22;  // [bp-0x90]
    char *v23;  // [bp-0x10]
    char v24;  // [bp+0x0]

    v23 = &v24;
    if (*(int *)&a0->padding_48[48] == 1)
    {
        sub_bd972c(&v4, a0->field_20, *(long long *)&a0->padding_28[0]);
        v19 = CONCAT(4, 0);
        *((char *)&v21 + 8) = v4;
        *(uint128_t *)((char *)&v21 + 24) = v5;
        v21 = 0;
        sub_c6c494(&v19);
        *(unsigned int *)*(unsigned long long *)((void*)&v19 + 8) = a0->field_7c;
        v21 = _INSERT(CONCAT(v21, 0), 0, 1);
        v4 = v19;
        v5 = *(uint128_t *)&v21;
        v7 = *(uint128_t *)((void*)&v21 + 16);
        v2 = &v8;
        v15 = g_efc958;
        v16 = g_efc968;
        v8 = *(unsigned long long *)((void*)&v21 + 32);
        v9 = &a0->field_18;
        v25 = *(unsigned long long *)((void*)&v4 + 8);
        idx = *(unsigned long long *)&v5;
LABEL_c15238:
        v27 = v9;
        v28 = idx - 1;
        v29 = *(unsigned long long *)&v7;
        while (1)
        {
            v30 = arm64g_calculate_condition(2, v28, 1, 0);
            if (!(v30 & 1))
            {
                idx = v28;
                v31 = *(int *)(v25 + v28 * 4);
                *(unsigned long long *)&v11 = v31;
                if (v8 > v31)
                {
                    v32 = v31 >> 3 & 0x1ffffffc;
                    v33 = *(int *)(v29 + v32);
                    v34 = 1 << ((char)v31 & 31);
                    *(unsigned int *)(v29 + v32) = v33 | v34;
                    v28 = idx - 1;
                    if (!(v33 & v34))
                    {
                        *(unsigned long long *)&v5 = idx;
                        if ((unsigned long long)*(long long *)&v27->padding_10[0] <= v31 || (v35 = &(&v27->field_8->field_0)[4 * v31], v35->field_0 == 0x8000000000000000))
                            v36 = 0xffffffff;
                        else
                            v36 = v35->field_18;
                        v3 = v36;
                        v37 = v27->field_20;
                        v38 = v27->field_28;
                        v39 = 0xffffffff;
                        while (1)
                        {
                            do
                            {
                                if (v38 > v3)
                                {
                                    v40 = v37 + 48 * v3;
                                    v3 = v40->field_20;
                                    v41 = v40->field_2c;
                                }
                                else
                                {
                                    do
                                    {
                                        if (v38 <= v39)
                                        {
                                            sub_baf968(&v15, v31);
                                            goto LABEL_c15238;
                                        }
                                    } while ((v42 = v37 + 48 * v39, v39 = v42->field_24, v41 = v42->field_28, v43 = arm64g_calculate_condition(1, v41, 1, 0), v43 & 1));
                                }
                            } while ((v44 = v41 >> 5, *(unsigned long long *)((void*)&v7 + 8) > v44 && (unsigned int)(*(int *)(*(unsigned long long *)&v7 + v44 * 4)) >> ((char)v41 & 31) & 1));
                            if (idx == *(unsigned long long *)&v4)
                            {
                                sub_c6c494(&v4);
                                v25 = *(unsigned long long *)((void*)&v4 + 8);
                            }
                            *(unsigned int *)(v25 + idx * 4) = v41;
                            idx += 1;
                            v6 = idx;
                        }
                    }
                }
                else
                {
                    v5 = idx;
                    v19 = &v11;
                    v20 = &g_bef1c8;
                    v21 = v2;
                    v22 = &g_bef1c8;
                    sub_c73b38(&g_cb9f36, &v19, &g_efc830);
                    break;
                }
            }
            else
            {
                if (*(unsigned long long *)&v4)
                    _free(*(unsigned long long *)((void*)&v4 + 8));
                if (*(unsigned long long *)((void*)&v5 + 8))
                    _free(*(unsigned long long *)&v7);
                v45 = *(unsigned long long *)((void*)&v15 + 8);
                v3 = *(unsigned long long *)&v15;
                if (!(*(int *)&a0->padding_48[48] & 1))
                    goto LABEL_c158b4;
                v46 = *(unsigned long long *)((void*)&v16 + 8);
                sub_bd97c0(&v4, a0->field_20, *(long long *)&a0->padding_28[0], a0->field_7c);
                if (*(int *)&a0->padding_48[48] == 1)
                {
                    sub_c39878(&v11, &a0->field_18, a0->field_7c);
                    sub_c17a74(&v15, &a0->field_18);
                    v47 = 0;
                    while (1)
                    {
                        if (sub_bd98f0(&v4, &a0->field_18) == 1)
                        {
                            v48 = sub_c19124(a0);
                            v49 = v48;
                            if (!(v48 & 1))
                            {
                                v47 |= v49;
                            }
                            else if (*(int *)&a0->padding_48[48] == 1)
                            {
                                sub_c39878(&v19, &a0->field_18, a0->field_7c);
                                v50 = *(unsigned long long *)((void*)&v11 + 8);
                                if (v50)
                                {
                                    v51 = v50 * 8;
                                    v52 = arm64g_calculate_condition(2, v51 + v50, 0x11, 0);
                                    if (!(v52 & 1))
                                        _free(*(unsigned long long *)&v11 - v51 - 8);
                                }
                                v11 = v19;
                                v12 = *(uint128_t *)&v21;
                                v13 = *(uint128_t *)((void*)&v21 + 16);
                                v14 = *(unsigned long long *)((void*)&v21 + 32);
                                sub_c17a74(&v19, &a0->field_18);
                                v53 = *(unsigned long long *)((void*)&v15 + 8);
                                if (v53)
                                {
                                    v54 = v53 * 8;
                                    v55 = arm64g_calculate_condition(2, v54 + v53, 0x11, 0);
                                    if (!(v55 & 1))
                                        _free(*(unsigned long long *)&v15 - v54 - 8);
                                }
                                v15 = v19;
                                v16 = *(uint128_t *)&v21;
                                v17 = *(uint128_t *)((void*)&v21 + 16);
                                v18 = *(unsigned long long *)((void*)&v21 + 32);
                                v47 |= v49;
                            }
                            else
                            {
                                sub_c73c64(&g_efbc98);
                                break;
                            }
                        }
                        else
                        {
                            iter = 0;
                            v57 = &a0->field_20->field_0;
                            v58 = &(&a0->field_20->field_0)[4 * *(long long *)&a0->padding_28[0]];
                            do
                            {
LABEL_c15528:
                                v59 = v57;
                                v60 = 4;
                                v61 = v59;
                                v62 = v58;
                                v63 = 0;
                                if (v59 == v58)
                                {
LABEL_c15794:
                                    v112 = *(unsigned long long *)((void*)&v15 + 8);
                                    v113 = v112 * 8;
                                    v114 = v113 + v112;
                                    if (v112)
                                    {
                                        v115 = arm64g_calculate_condition(v60 | 16, v61, v62, v63);
                                        v116 = arm64g_calculate_condition(2, (v115 & 1 ? v114 : 0x40000000), (v115 & 1 ? 0x11 : 0), 0);
                                        if (v116 & 1)
                                            goto LABEL_c157bc;
                                    }
                                    else
                                    {
                                        v117 = arm64g_calculate_condition(v60 | 16, v61, v62, v63);
                                        v118 = arm64g_calculate_condition(0, (v117 & 1 ? v114 : 0x40000000), (v117 & 1 ? 0x11 : 0), 0);
                                        if (v118 & 1)
                                            goto LABEL_c157bc;
                                    }
                                    _free(*(unsigned long long *)&v15 - v113 - 8);
LABEL_c157bc:
                                    v119 = *(unsigned long long *)((void*)&v11 + 8);
                                    if (v119)
                                    {
                                        v120 = v119 * 8;
                                        v121 = arm64g_calculate_condition(2, v120 + v119, 0x11, 0);
                                        if (!(v121 & 1))
                                            _free(*(unsigned long long *)&v11 - v120 - 8);
                                    }
                                    if (*(unsigned long long *)&v4)
                                        _free(*(unsigned long long *)((void*)&v4 + 8));
                                    if (*(unsigned long long *)((void*)&v5 + 8))
                                        _free(*(unsigned long long *)&v7);
                                    if (v9)
                                        _free(v10);
                                    if (!v45)
                                        return v47 & 1;
                                    v122 = v45 * 4 + 11 & 0xfffffffffffffff8;
                                    v123 = arm64g_calculate_condition(2, v45 + v122, 9, 0);
                                    if (!(v123 & 1))
                                        _free(v3 - v122);
                                    return v47 & 1;
                                }
                            } while ((v64 = iter, v65 = v59 + 4, iter += 1, v57 = v65, *v59 == 0x8000000000000000));
                            if (v46)
                            {
                                v66 = 0;
                                v67 = 5871781006564002453 * v64;
                                v68 = v67;
                                while (1)
                                {
                                    v69 = v68 & v45;
                                    v70 = *(long long *)(v3 + v69);
                                    v72 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v70, (uint128_t)(v67 >> 57 & 0xff | (v67 >> 57 & 0xff) * 0x100 | (v67 >> 57 & 0xff | (v67 >> 57 & 0xff) * 0x100) * 0x10000 | (v67 >> 57 & 0xff | (v67 >> 57 & 0xff) * 0x100 | (v67 >> 57 & 0xff | (v67 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                                    v73 = v72 & 0x8080808080808080;
                                    if (v72 & 0x8080808080808080)
                                    {
                                        do
                                        {
                                            v74 = v73;
                                            v75 = ((((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v76 = (((((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v77 = ((((v76 | v75) & 0xffff0000ffff0000) >> 16 | (v76 | v75) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v76 | v75) & 0xffff0000ffff0000) >> 16 | (v76 | v75) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            if (!v77)
                                                v78 = 64;
                                            else
                                                v78 = Clz(v77);
                                            v57 = v65;
                                            if (*(int *)(v3 - (v69 + (v78 >> 3) & v45) * 4 - 4) == v64)
                                                goto LABEL_c15528;
                                        } while ((v79 = v74 - 1, v73 = v79 & v74, v79 & v74));
                                    }
                                    v80 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v70, _mm_set1_epi8(-1)));
                                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))))))) & 1)
                                        break;
                                    v66 += 8;
                                    v68 = v69 + v66;
                                }
                            }
                            ptr = _malloc(16);
                            if (ptr)
                            {
                                *(unsigned int *)ptr = v64;
                                v19 = 4;
                                v20 = ptr;
                                index = 1;
                                while (1)
                                {
                                    v21 = index;
                                    do
                                    {
LABEL_c15610:
                                        v84 = v65;
                                        if (v84 == v58)
                                        {
                                            node = v20;
                                            ptr1 = node;
                                            v2 = v19;
                                            v103 = &node[index];
                                            do
                                            {
                                                v104 = *node;
                                                node += 1;
                                                if ((unsigned long long)*(long long *)&a0->padding_28[0] > v104)
                                                {
                                                    v105 = &(&a0->field_20->field_0)[4 * v104];
                                                    if (v105->field_0 != 0x8000000000000000 && a0->field_40 <= 0xffffffff)
                                                    {
                                                        v106 = &v105->field_1c;
                                                        do
                                                        {
                                                            v107 = *(int *)v106;
                                                            if (a0->field_40 <= v107)
                                                            {
                                                                if (*(long long *)&v105->padding_10[0] && v105->field_8->field_18 == 18)
                                                                {
                                                                    v47 |= (unsigned int)sub_c19124(a0, v104, &v11, &v15);
                                                                    break;
                                                                }
                                                                else
                                                                {
                                                                    sub_bd8578(&v19, a0, v104);
                                                                    if (v19 != 0x8000000000000000)
                                                                    {
                                                                        v110 = v21 + 1;
                                                                        ptr2 = v20;
                                                                        while (1)
                                                                        {
                                                                            v111 = v110 - 1;
                                                                            if (v110 == 1)
                                                                                break;
                                                                            sub_c259a4();
                                                                            v110 = v111;
                                                                        }
                                                                        if (v19)
                                                                        {
                                                                            _free(ptr2);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } while ((v108 = a0->field_38 + (unsigned int)v107 * 48, v106 = &v108->padding_0[36], v109 = arm64g_calculate_condition(1, v108->field_28, 1, 0), v109 & 1));
                                                    }
                                                }
                                            } while ((v60 = 4, v61 = node, v62 = v103, v63 = 0, node != v103));
                                            if (v2)
                                            {
                                                _free(ptr1);
                                                goto LABEL_c15794;
                                            }
                                        }
                                    } while ((v85 = iter, v65 = v84 + 4, iter += 1, *v84 == 0x8000000000000000));
                                    if (v46)
                                    {
                                        v86 = 0;
                                        v87 = 5871781006564002453 * v85;
                                        v88 = v87;
                                        while (1)
                                        {
                                            v89 = v88 & v45;
                                            v90 = *(long long *)(v3 + v89);
                                            v92 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v90, (uint128_t)(v87 >> 57 & 0xff | (v87 >> 57 & 0xff) * 0x100 | (v87 >> 57 & 0xff | (v87 >> 57 & 0xff) * 0x100) * 0x10000 | (v87 >> 57 & 0xff | (v87 >> 57 & 0xff) * 0x100 | (v87 >> 57 & 0xff | (v87 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                                            v93 = v92 & 0x8080808080808080;
                                            if (v92 & 0x8080808080808080)
                                            {
                                                do
                                                {
                                                    v94 = v93;
                                                    v95 = ((((((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                    v96 = (((((((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                    v97 = ((((v96 | v95) & 0xffff0000ffff0000) >> 16 | (v96 | v95) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v96 | v95) & 0xffff0000ffff0000) >> 16 | (v96 | v95) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                    if (!v97)
                                                        v98 = 64;
                                                    else
                                                        v98 = Clz(v97);
                                                    if (*(int *)(v3 - (v89 + (v98 >> 3) & v45) * 4 - 4) == v85)
                                                        goto LABEL_c15610;
                                                } while ((v99 = v94 - 1, v93 = v99 & v94, v99 & v94));
                                            }
                                            v100 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v90, _mm_set1_epi8(-1)));
                                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v100, v100), _mm_unpacklo_epi64(v100, v100)))))))))) & 1)
                                                break;
                                            v86 += 8;
                                            v88 = v89 + v86;
                                        }
                                    }
                                    if (index == v19)
                                    {
                                        sub_c736c8(&v19, index, 1, 4, 4);
                                        ptr = v20;
                                    }
                                    *(unsigned int *)(ptr + index * 4) = v85;
                                    index += 1;
                                }
                            }
                            else
                            {
                                sub_c6b970(4, 16);
                                break;
                            }
                        }
                    }
                }
                else
                {
                    sub_c73c64(&g_efbc80);
                    break;
                }
            }
        }
    }
    else
    {
        sub_c73c64(&g_efbc50);
LABEL_c158b4:
        sub_c73c64(&g_efbc68);
    }
    __debugbreak();
}
