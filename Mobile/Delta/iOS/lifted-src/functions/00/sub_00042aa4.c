/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x42aa4..0x43360 (2236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_42aa4_5 {
    struct st_42aa4_1 *field_0;
    char padding_8[12];
    int field_14;
    char padding_18[240];
    char field_108;
    char padding_109[119];
    char field_180;
    char padding_181[1147];
    unsigned int field_5fc;
} st_42aa4_5;

typedef struct st_42aa4_2 {
    unsigned int field_0;
    char padding_4[20];
    unsigned int field_18;
    char padding_1c[20];
    unsigned int field_30;
    char padding_34[20];
    unsigned int field_48;
    char padding_4c[20];
    unsigned int field_60;
    char padding_64[20];
    unsigned int field_78;
    char padding_7c[20];
    unsigned int field_90;
    char padding_94[20];
    unsigned int field_a8;
} st_42aa4_2;

typedef struct st_42aa4_4 {
    char padding_0[8];
    struct st_42aa4_0 *field_8;
    unsigned long long field_10;
} st_42aa4_4;

typedef struct st_42aa4_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    long long field_20;
    long long field_28;
} st_42aa4_0;

typedef struct st_42aa4_3 {
    char padding_0[12];
    char field_c;
    char padding_d[19];
    struct st_42aa4_2 *field_20;
    unsigned long long field_28;
} st_42aa4_3;

typedef struct st_42aa4_9 {
    char padding_0[4];
    unsigned int field_4;
} st_42aa4_9;

typedef struct st_42aa4_1 {
    char field_0;
} st_42aa4_1;

extern unsigned int g_f00b30;
extern unsigned int g_f00b60;

unsigned long long sub_42aa4(st_42aa4_5 *a0, st_42aa4_3 *a1, unsigned long long a2, unsigned long a3)
{
    unsigned long long v24;  // x28
    unsigned long long v25;  // x8
    unsigned long long v34;  // q3
    unsigned long long v124;  // 4105
    unsigned long long v125;  // w8
    unsigned long long v126;  // 4112
    unsigned long long v127;  // 4105
    char v129;  // x8
    unsigned long v130;  // x2
    unsigned int v131;  // w28
    unsigned long long v132;  // x0
    unsigned int *v133;  // x0
    unsigned long long v35;  // q5
    long long v134;  // x0
    unsigned long long v36;  // q1
    unsigned long long v37;  // q2
    unsigned long long i;  // x12
    unsigned long long v39;  // x12
    uint128_t v40;  // q7
    uint128_t v41;  // q7
    __m128i v42;  // q7
    unsigned long long v26;  // x10
    uint128_t v44;  // q16
    uint128_t v45;  // q16
    __m128i v46;  // q16
    unsigned int *iter;  // x9
    unsigned long long v52;  // x8
    unsigned int v53;  // w10
    unsigned long long v27;  // x27
    unsigned long v54;  // cc_dep1
    unsigned long long v55;  // 4109
    unsigned long long v56;  // 4109
    unsigned long long v57;  // 4112
    unsigned long long v58;  // 4102
    unsigned long long v59;  // 4112
    unsigned long long v60;  // 4102
    unsigned long long v61;  // x20
    unsigned long long v63;  // x23
    unsigned long long v28;  // x25
    unsigned int v64;  // w22
    unsigned long long iter1;  // x22
    unsigned long long v66;  // x20
    unsigned long long iter2;  // x23
    unsigned long long v68;  // x0
    unsigned long long v69;  // w8
    unsigned long v70;  // cc_dep1
    unsigned long v71;  // cc_dep2
    unsigned long long v72;  // 4106
    unsigned long long v73;  // 4106
    unsigned long long v29;  // x26
    unsigned long v76;  // cc_op
    unsigned long v77;  // cc_dep1
    unsigned long v78;  // cc_dep2
    unsigned long v79;  // cc_ndep
    unsigned long long v80;  // 4112
    unsigned long long v81;  // 4102
    unsigned long long v82;  // 4112
    unsigned long long v83;  // 4102
    unsigned long long v30;  // q0
    unsigned long long v84;  // x20
    unsigned long long j;  // x22
    unsigned int *v86;  // x24
    unsigned long long v87;  // x28
    unsigned int v88;  // w0
    unsigned long long v89;  // 4118
    st_42aa4_9 *v90;  // x8
    st_42aa4_9 *v91;  // x9
    unsigned long v92;  // x14
    unsigned long long v93;  // x0
    unsigned int *v31;  // x11
    unsigned int v94;  // w24
    unsigned long long v95;  // x8
    void* v96;  // x8
    unsigned long long v97;  // x24
    unsigned long long v98;  // x8
    unsigned long long v100;  // w25
    unsigned long long v101;  // x0
    unsigned long long v102;  // x23
    unsigned long long v103;  // x22
    __m128i v32;  // q4
    unsigned long long k;  // x26
    unsigned long long v105;  // x20
    unsigned long long v106;  // x24
    unsigned long v107;  // cc_op
    unsigned long v108;  // cc_dep1
    unsigned long v109;  // cc_dep2
    unsigned long v110;  // cc_ndep
    st_42aa4_4 *v111;  // x8
    st_42aa4_0 *v112;  // x28
    unsigned long v113;  // x27
    unsigned long long v33;  // q6
    unsigned long long v114;  // 4110
    unsigned long long v115;  // 4102
    unsigned long long v116;  // 4110
    unsigned long long v117;  // 4102
    unsigned long long v118;  // x0
    unsigned long v119;  // cc_op
    unsigned long v120;  // cc_dep1
    unsigned long v121;  // cc_dep2
    unsigned long v122;  // cc_ndep
    unsigned long long v123;  // 4112
    unsigned long v0;  // [bp-0x210], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x208]
    unsigned int v2;  // [bp-0x200]
    unsigned int v3;  // [bp-0x1f8], Other Possible Types: unsigned long long
    unsigned int v4;  // [bp-0x1f4]
    st_42aa4_1 **v5;  // [bp-0x1f0], Other Possible Types: char
    st_42aa4_1 *v6;  // [bp-0x1e8]
    st_42aa4_5 *v7;  // [bp-0x1e0]
    unsigned int v8;  // [bp-0x1d8]
    unsigned long long v9;  // [bp-0x1cc]
    unsigned long long *v10;  // [bp-0x1c8], Other Possible Types: char, unsigned int
    st_42aa4_1 *v11;  // [bp-0x1c8]
    char v12;  // [bp-0x148]
    unsigned long long node;  // [bp-0xc8]
    unsigned long long v14;  // [bp-0xc4]
    unsigned long long v15;  // [bp-0xc0]
    unsigned long long v16;  // [bp-0xb0]
    unsigned long long v17;  // [bp-0xa0]
    unsigned long long v18;  // [bp-0x90]
    unsigned int v19;  // [bp-0x88]
    st_42aa4_3 *v20;  // [bp-0x78]
    st_42aa4_1 *v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v24 = a2;
    v6 = &v5;
    v5 = &v6;
    v20 = a1;
    v25 = a1->field_28;
    if (!v25)
    {
        sub_40074(&a0->field_180, &v20);
        v133 = sub_12484(&a0->field_180, &v20);
        v0 = v133[3];
        sub_300cc(a0->field_0, "allocation: table hash %d");
        v134 = sub_3f220(v0);
        sub_2ad10(a0->field_0, 53, v24, v134, 0);
        return sub_31514(a0->field_0, v133[2]);
    }
    if (7 >= v25)
    {
        v26 = 0;
        v27 = 0;
        v28 = 0;
        v29 = 0;
    }
    else
    {
        v30 = 0;
        v26 = v25 & 0xfffffffffffffff8;
        v31 = &a1->field_20->field_60;
        v32 = _mm_set1_epi32(1);
        v33 = 0;
        v34 = 0;
        v35 = 0;
        v36 = 0;
        v37 = 0;
        i = v26;
        do
        {
            v39 = i;
            v40 = _INSERT(*(int *)((char *)v31 - 96), 4, *(int *)((char *)v31 - 72));
            v41 = _INSERT(v40, 8, *(int *)((char *)v31 - 48));
            v42 = (__m128i)_INSERT(v41, 12, *(int *)((char *)v31 - 24));
            v44 = _INSERT(*v31, 4, v31[6]);
            v45 = _INSERT(v44, 8, v31[12]);
            v46 = (__m128i)_INSERT(v45, 12, v31[18]);
            v30 = (unsigned long long)_mm_sub_epi32(v30, _mm_cmpeq_epi32(v42, v32));
            v33 = (unsigned long long)_mm_sub_epi32(v33, _mm_cmpeq_epi32(v46, v32));
            v34 = (unsigned long long)_mm_sub_epi32(v34, ~_mm_cmpeq_epi32(v42, _mm_setzero_si128()));
            v35 = (unsigned long long)_mm_sub_epi32(v35, ~_mm_cmpeq_epi32(v46, _mm_setzero_si128()));
            v36 = (unsigned long long)_mm_sub_epi32(v36, _mm_cmpeq_epi32(v42, _mm_setzero_si128()));
            v37 = (unsigned long long)_mm_sub_epi32(v37, _mm_cmpeq_epi32(v46, _mm_setzero_si128()));
            v31 += 48;
            i = v39 - 8;
        } while (i);
        v27 = (unsigned int)__dirty_unsupported_Iop_ZeroHI96ofV128(_mm_add_epi32(_mm_add_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v33, v30), _mm_add_epi32(v33, v30)), _mm_unpackhi_epi64(_mm_add_epi32(v33, v30), _mm_add_epi32(v33, v30))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v33, v30), _mm_add_epi32(v33, v30)), _mm_unpackhi_epi64(_mm_add_epi32(v33, v30), _mm_add_epi32(v33, v30)))), _mm_add_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v33, v30), _mm_add_epi32(v33, v30)), _mm_unpacklo_epi64(_mm_add_epi32(v33, v30), _mm_add_epi32(v33, v30))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v33, v30), _mm_add_epi32(v33, v30)), _mm_unpacklo_epi64(_mm_add_epi32(v33, v30), _mm_add_epi32(v33, v30))))));
        v28 = (unsigned int)__dirty_unsupported_Iop_ZeroHI96ofV128(_mm_add_epi32(_mm_add_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v35, v34), _mm_add_epi32(v35, v34)), _mm_unpackhi_epi64(_mm_add_epi32(v35, v34), _mm_add_epi32(v35, v34))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v35, v34), _mm_add_epi32(v35, v34)), _mm_unpackhi_epi64(_mm_add_epi32(v35, v34), _mm_add_epi32(v35, v34)))), _mm_add_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v35, v34), _mm_add_epi32(v35, v34)), _mm_unpacklo_epi64(_mm_add_epi32(v35, v34), _mm_add_epi32(v35, v34))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v35, v34), _mm_add_epi32(v35, v34)), _mm_unpacklo_epi64(_mm_add_epi32(v35, v34), _mm_add_epi32(v35, v34))))));
        v29 = (unsigned int)__dirty_unsupported_Iop_ZeroHI96ofV128(_mm_add_epi32(_mm_add_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v37, v36), _mm_add_epi32(v37, v36)), _mm_unpackhi_epi64(_mm_add_epi32(v37, v36), _mm_add_epi32(v37, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v37, v36), _mm_add_epi32(v37, v36)), _mm_unpackhi_epi64(_mm_add_epi32(v37, v36), _mm_add_epi32(v37, v36)))), _mm_add_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v37, v36), _mm_add_epi32(v37, v36)), _mm_unpacklo_epi64(_mm_add_epi32(v37, v36), _mm_add_epi32(v37, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v37, v36), _mm_add_epi32(v37, v36)), _mm_unpacklo_epi64(_mm_add_epi32(v37, v36), _mm_add_epi32(v37, v36))))));
        if (v25 == v26)
            goto LABEL_42c68;
    }
    iter = &(&a1->field_20->field_0)[6 * v26];
    v52 = v25 - v26;
    do
    {
        v25 = v52;
        v53 = *iter;
        iter += 6;
        if (v53 != 1)
            v27 &= 0xffffffff;
        else
            v27 = (unsigned int)v27 + 1;
        v54 = v53;
        if (!v53)
        {
            v28 &= 0xffffffff;
            v55 = arm64g_calculate_condition(19, v54, 0, 0);
            if (!(v55 & 1))
                goto LABEL_42c5e;
            goto LABEL_42c5d;
        }
        else
        {
            v28 = (unsigned int)v28 + 1;
            v56 = arm64g_calculate_condition(19, v54, 0, 0);
            if (v56 & 1)
            {
LABEL_42c5d:
                v29 &= 0xffffffff;
                continue;
            }
            else
            {
LABEL_42c5e:
                v29 = (unsigned int)v29 + 1;
            }
        }
    } while ((v52 = v25 - 1, v26 = 1, v25 != 1));
LABEL_42c68:
    if (!(unsigned int)v29)
    {
        v57 = arm64g_calculate_condition(4, v25, v26, 0);
        v58 = arm64g_calculate_condition(19, (v57 & 1 ? v28 & 0xffffffff : 0x40000000), 0, 0);
        if (v58 & 1)
            goto LABEL_42c94;
LABEL_42c74:
        v61 = 0;
        v63 = sub_3f220(v28);
        v64 = a0->field_5fc;
        v4 = v24;
        if (!(a3 & 1))
            goto LABEL_42d34;
    }
    else
    {
        v59 = arm64g_calculate_condition(4, v25, v26, 0);
        v60 = arm64g_calculate_condition(16, (v59 & 1 ? v28 & 0xffffffff : 0x40000000), 0, 0);
        if (!(v60 & 1))
            goto LABEL_42c74;
LABEL_42c94:
        iter1 = 0;
        v66 = 0;
        iter2 = 8;
        while (1)
        {
            v68 = sub_3a7e0(&a0->field_108, (char *)a1->field_20 + iter2);
            if (!v68 || *(int *)(v68 + 8) != 3)
            {
                iter1 += 1;
                v66 = 0 + (unsigned int)v66;
                iter2 += 24;
                if (a1->field_28 <= iter1)
                    break;
            }
            else
            {
                iter1 += 1;
                v66 += *(double *)(v68 + 16) == (double)((unsigned int)v66 + 1);
                iter2 += 24;
                if (iter1 >= a1->field_28)
                    break;
            }
        }
        v69 = (unsigned int)v66 + (unsigned int)v27;
        v70 = v28 & 0xffffffff;
        v71 = v69;
        if ((unsigned int)v28 == v69)
        {
            v28 = v27 & 0xffffffff;
            v72 = arm64g_calculate_condition(3, v70, v71, 0);
            if (!(v72 & 1))
                goto LABEL_42d1a;
LABEL_42d19:
            v61 = v66 & 0xffffffff;
        }
        else
        {
            v28 &= 0xffffffff;
            v73 = arm64g_calculate_condition(3, v70, v71, 0);
            if (v73 & 1)
                goto LABEL_42d19;
LABEL_42d1a:
            v61 = 0;
        }
        v63 = sub_3f220();
        v64 = a0->field_5fc;
        v4 = v24;
        if (!(a3 & 1))
        {
LABEL_42d34:
            v4 = sub_3b87c(a0, a1, 1);
        }
    }
    v18 = 0;
    v16 = 0;
    v17 = 0;
    v15 = 0;
    v19 = 0x3f800000;
    if (!(unsigned int)v29 && !(unsigned int)v61)
    {
        if ((unsigned int)v27 - 1 <= 31)
        {
            v80 = arm64g_calculate_condition(v76 | 144, v77, v78, v79);
            v81 = arm64g_calculate_condition(3, (v80 & 1 ? v28 & 0xffffffff : 0), (v80 & 1 ? v27 & 0xffffffff : 0), 0);
            if (v81 & 1)
                goto LABEL_42dbc;
        }
        else
        {
            v82 = arm64g_calculate_condition(v76 | 144, v77, v78, v79);
            v83 = arm64g_calculate_condition(0, (v82 & 1 ? v28 & 0xffffffff : 0), (v82 & 1 ? v27 & 0xffffffff : 0), 0);
            if (v83 & 1)
            {
LABEL_42dbc:
                node = 0;
                v14 = 0;
                if (a1->field_28)
                {
                    v3 = v63;
                    v2 = v24;
                    v84 = 0;
                    j = 0;
                    do
                    {
                        v86 = &a1->field_20->field_0;
                        if (*(int *)(*(long long *)((char *)v86 + v84 + 8) + 8) == g_f00b30)
                            v87 = *(long long *)((char *)v86 + v84 + 8);
                        else
                            v87 = 0;
                        v9 = (unsigned int)sub_2df40();
                        if (v9 < 0)
                        {
                            sub_45808(v87 + 12, "Exceeded constant limit; simplify the code to compile");
                            __debugbreak();
                        }
                        v88 = sub_45e80(a0, *(long long *)((char *)v86 + v84 + 16));
                        v7 = &v21;
                        v21 = &v7;
                        if (!sub_42300(&v16 + 1, &v9) || (v89 = arm64g_calculate_condition(0x11, *(int *)sub_39b9c(&v15, &v9), 1, 0), v89 & 1))
                            *(unsigned int *)sub_39b9c(&v15, &v9) = v88;
                        j += 1;
                        v84 += 24;
                    } while (a1->field_28 > j);
                    v90 = v15;
                    v91 = *&(&v15)[1];
                    v24 = v2;
                    v63 = v3;
                    if (v90 != v91)
                    {
                        node = node;
                        do
                        {
                            *(char [4])&(&v10)[4 * node] = v90->padding_0;
                            v92 = v90->field_4;
                            *(unsigned int *)&(&v12)[4 * node] = v92;
                            if (!(v92 >> 31 & 1))
                                v14 = 1;
                        } while ((node += 1, node = node, v90 += 1, v90 != v91));
                    }
                }
                v93 = sub_30898(a0->field_0, &v10);
                v94 = v93;
                if (v93 >> 31 & 1)
                {
                    sub_45808(&a1->field_c, "Exceeded constant limit; simplify the code to compile");
                    __debugbreak();
                }
                v0 = v27;
                sub_300cc(a0->field_0, "allocation: table template %d");
                if (v94 <= 0x7fff)
                {
                    sub_2fdb0(a0->field_0, 54, v4, (short)v94);
                }
                else
                {
                    v14 = 0;
                    sub_c84c(&v15, v15);
                    sub_3d0e4(&v16 + 1);
                    sub_2ad10(a0->field_0, 53, v4, v63, 0);
                    sub_31514(a0->field_0, 0);
                }
LABEL_42ef0:
                if ((unsigned int)v29 < 16)
                    v100 = (unsigned int)v29;
                else
                    v100 = 16;
                v101 = sub_3b87c();
                if (a1->field_28)
                {
                    v102 = v101;
                    v2 = v24;
                    v103 = 0;
                    v3 = 0;
                    k = 0;
                    v105 = 0;
                    v106 = 1;
                    do
                    {
                        v111 = (char *)a1->field_20 + v103;
                        v112 = v111->field_8;
                        v113 = v111->field_10;
                        if (*&(&v15)[1] != v15)
                        {
                            v114 = arm64g_calculate_condition(v107 | 16, v108, v109, v110);
                            v115 = arm64g_calculate_condition(4, (v114 & 1 ? v112 : 0x40000000), 0, 0);
                            if (v115 & 1)
                                goto LABEL_42fb8;
                        }
                        else
                        {
                            v116 = arm64g_calculate_condition(v107 | 16, v108, v109, v110);
                            v117 = arm64g_calculate_condition(0, (v116 & 1 ? v112 : 0x40000000), 0, 0);
                            if (v117 & 1)
                                goto LABEL_42fb8;
                        }
                        if (v112->field_8 == g_f00b30)
                        {
                            v10 = sub_2df40(a0->field_0, v112->field_20, v112->field_28);
                            v118 = sub_3efac(&v15, &v10);
                            if (v118 && *(int *)v118 >= 0)
                                continue;
                        }
LABEL_42fb8:
                        sub_395b0(a0, v113);
                        v119 = 3;
                        v120 = a0->field_14;
                        v121 = 2;
                        v122 = 0;
                        if (a0->field_14 >= 2)
                            sub_2ad10(a0->field_0, 69, 0, 0, 0);
                        if (!v112)
                        {
                            v123 = arm64g_calculate_condition(v119, v120, v121, v122);
                            v124 = arm64g_calculate_condition(19, (v123 & 1 ? v105 & 0xffffffff : 0x40000000), (v123 & 1 ? v100 : 0), 0);
                            v125 = (unsigned int)!(v124 & 1);
                            if (!(unsigned int)v105)
                                goto LABEL_4302c;
                        }
                        else
                        {
                            v126 = arm64g_calculate_condition(v119, v120, v121, v122);
                            v127 = arm64g_calculate_condition(16, (v126 & 1 ? v105 & 0xffffffff : 0x40000000), (v126 & 1 ? v100 : 0), 0);
                            v125 = (unsigned int)!(v127 & 1);
                            if (!(unsigned int)v105)
                                goto LABEL_4302c;
                        }
                        if (v125)
                        {
                            sub_2ad10(a0->field_0, 55, v4, v102, (unsigned int)v105 + 1 & 0xff);
                            sub_31514(a0->field_0, v106);
                            v106 += v105;
                            v105 = 0;
                        }
LABEL_4302c:
                        if (v112)
                        {
                            v7 = a0;
                            v8 = a0->field_5fc;
                            sub_420e4(a0, v4, v112, &v7);
                            sub_45198(a0, &v10, sub_385b8(a0, v113, &v7), 1, 0);
                            v7->field_5fc = v8;
                        }
                        else
                        {
                            v129 = (char)v102 + (char)v105;
                            if (k + 1 == a1->field_28)
                            {
                                v3 = (unsigned int)sub_46138(a0, v113, v129);
                            }
                            else
                            {
                                v11 = &v7;
                                v7 = &v11;
                                v130 = v129;
                                v131 = a0->field_5fc;
                                a0->field_5fc = (unsigned int)v130 + 1;
                                sub_47e48(a0, v113, v130, 1);
                                a0->field_5fc = v131;
                            }
                            v105 = (unsigned int)v105 + 1;
                        }
                        k += 1;
                        v103 += 24;
                        v107 = 4;
                        v108 = k;
                        v109 = a1->field_28;
                        v110 = 0;
                    } while (a1->field_28 > k);
                    v24 = v2;
                    if ((unsigned int)v105)
                    {
                        sub_2ad10();
                        sub_31514(a0->field_0, v106);
                    }
                }
                if (v4 != (unsigned int)v24)
                    sub_2ad10(a0->field_0, 6, v24, v4, 0);
                sub_43360(&v16 + 1, *&(&v17)[1]);
                sub_2219c(&v16 + 1, 0);
                v10 = &v15;
                v132 = sub_17470(&v10);
                a0->field_5fc = v64;
                return v132;
            }
        }
    }
    v95 = a1->field_28;
    if (v95)
    {
        v96 = &(&a1->field_20->field_0)[6 * v95];
        if (v96 == 24)
        {
            v95 = 0;
            goto LABEL_42e90;
        }
        if (*(int *)((char *)v96 - 24))
        {
            v97 = v61 + v29;
            if ((unsigned int)v28)
                goto LABEL_42e9c;
        }
        else
        {
            if (*(int *)(*(long long *)((char *)v96 - 8) + 8) != g_f00b60)
                v98 = 0;
            else
                v98 = 0xffffffff;
            v97 = v61 + v29 + v98;
            if ((unsigned int)v28)
                goto LABEL_42e9c;
        }
LABEL_42dac:
        v28 = v97;
        goto LABEL_42ec0;
    }
    else
    {
LABEL_42e90:
        v97 = v61 + v29 + v95;
        if (!(unsigned int)v28)
            goto LABEL_42dac;
LABEL_42e9c:
        if ((unsigned int)v97)
        {
            v0 = v28;
            v1 = v97;
            sub_300cc(a0->field_0, "allocation: table hash %d array %d");
            goto LABEL_42ecc;
        }
LABEL_42ec0:
        v0 = v28;
        sub_300cc(a0->field_0);
    }
LABEL_42ecc:
    sub_2ad10(a0->field_0, 53, v4, v63, 0);
    sub_31514(a0->field_0, v97);
    goto LABEL_42ef0;
}
