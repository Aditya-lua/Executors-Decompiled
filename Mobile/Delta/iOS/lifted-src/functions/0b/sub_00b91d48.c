/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb91d48..0xb92b0c (3524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b91d48_2 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    struct st_b91d48_3 *field_38;
    unsigned long long field_40;
    void* field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_70;
    void* field_78;
    unsigned long long field_80;
    uint128_t field_88;
} st_b91d48_2;

typedef struct st_b91d48_7 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned long long field_8;
} st_b91d48_7;

typedef struct st_b91d48_0 {
    long long field_0;
    char padding_8[16];
    long long field_18;
    char padding_20[48];
    unsigned long long field_50;
    char padding_58[8];
    unsigned long long field_60;
    void* field_68;
    char padding_70[48];
    unsigned long long field_a0;
    unsigned long long field_a8;
    char padding_b0[56];
    unsigned long long field_e8;
} st_b91d48_0;

typedef struct st_b91d48_1 {
    char padding_0[8];
    char field_8;
    char padding_9[15];
    struct st_b91d48_0 *field_18;
    unsigned long long field_20;
} st_b91d48_1;

typedef struct st_b91d48_6 {
    char padding_0[8];
    void* field_8;
    unsigned long long field_10;
    uint128_t field_18;
} st_b91d48_6;

typedef struct st_b91d48_3 {
    unsigned long long field_0;
} st_b91d48_3;

extern long long g_efa240;
extern long long g_efa640;
extern long long g_efa658;
extern long long g_efb4a0;
extern uint128_t g_efc958;
extern uint128_t g_efc968;

int sub_b91d48(st_b91d48_2 *a0, st_b91d48_1 *a1)
{
    unsigned long long i;  // x13
    unsigned long long v14;  // x12
    unsigned long v23;  // x15
    unsigned long long *v112;  // x15
    unsigned long long v113;  // x0
    unsigned long long v114;  // x15
    unsigned long long v115;  // x0
    st_b91d48_6 *v116;  // x20
    unsigned long long v117;  // 4102
    unsigned long long v118;  // x10
    unsigned long long v119;  // x11
    unsigned long v120;  // x12
    unsigned long long v121;  // 4137
    unsigned long long v24;  // x15
    unsigned long long v122;  // 4139
    unsigned long long v123;  // x11
    unsigned long long v124;  // x10
    unsigned long v125;  // x24
    unsigned long v126;  // x11
    unsigned long long v127;  // x10
    unsigned long long v128;  // 4138
    unsigned long long v129;  // 4140
    unsigned long long v130;  // x10
    unsigned long long v131;  // x10
    unsigned long long v132;  // x11
    unsigned long v133;  // x12
    unsigned long long v134;  // 4137
    unsigned long long v135;  // 4139
    unsigned long long v136;  // x11
    unsigned long long v137;  // x10
    unsigned long long v138;  // 4135
    unsigned long long v139;  // 4137
    unsigned long long v140;  // x10
    unsigned long long v141;  // x8
    unsigned long long v25;  // x11
    unsigned long long v142;  // x24
    unsigned long long v143;  // x27
    uint128_t *v144;  // x8
    unsigned long long v145;  // x1
    unsigned long long v146;  // x10
    st_b91d48_6 *v147;  // x0
    void* v148;  // x8
    unsigned long long v149;  // x9
    unsigned long long v150;  // x11
    unsigned long long v151;  // x11
    unsigned long long v26;  // x15
    __m128i v152;  // q0
    unsigned long v154;  // x12
    unsigned long long v155;  // x12
    unsigned long long v156;  // x12
    unsigned long long v157;  // 4154
    unsigned long long v158;  // 4156
    unsigned long long v159;  // x13
    unsigned long long v160;  // x13
    uint128_t v161;  // q0
    unsigned long long v27;  // 4150
    unsigned long long v163;  // x10
    unsigned long v164;  // d0
    unsigned long long j;  // x12
    unsigned long v166;  // d0
    unsigned long v167;  // x11
    unsigned long long v169;  // 4137
    unsigned long long v170;  // 4139
    unsigned long long v171;  // x11
    unsigned long long v28;  // 4152
    unsigned long long v172;  // x10
    unsigned long v173;  // x11
    unsigned long v175;  // x10
    unsigned long long v176;  // 4138
    unsigned long long v177;  // 4140
    unsigned long long v178;  // x10
    char v179;  // x12
    void* v180;  // x8
    __m128i v181;  // q1
    unsigned long long v29;  // x16
    unsigned long v182;  // x1
    unsigned long long v183;  // x8
    unsigned int v184;  // w0
    unsigned long v185;  // x25
    unsigned long long v186;  // 4116
    unsigned int v187;  // w24
    unsigned long v188;  // x20
    unsigned int *v189;  // x9
    unsigned int *v190;  // x8
    unsigned int v191;  // w26
    void* v30;  // x16
    unsigned int v192;  // w27
    st_b91d48_7 *v193;  // x9
    unsigned int v194;  // w0
    unsigned long v195;  // x25
    unsigned long long v196;  // 4116
    unsigned long v197;  // x26
    unsigned int *v198;  // x9
    unsigned int *v199;  // x8
    unsigned int v200;  // w27
    unsigned int v201;  // w28
    unsigned long long v31;  // x16
    st_b91d48_7 *v202;  // x9
    unsigned int v203;  // w0
    unsigned long v204;  // x20
    unsigned long long v205;  // 4116
    unsigned long v206;  // x25
    unsigned long v207;  // x26
    unsigned int *v208;  // x9
    unsigned int *v209;  // x8
    unsigned int v210;  // w24
    unsigned int v211;  // w27
    unsigned long long v15;  // x14
    st_b91d48_7 *v212;  // x9
    unsigned long long v214;  // 4102
    unsigned long long v33;  // 4136
    unsigned long long v34;  // 4138
    unsigned long long v35;  // x11
    uint128_t v36;  // q2
    unsigned long v39;  // x15
    unsigned long long v40;  // 4102
    unsigned long v41;  // x12
    void* v16;  // x8
    unsigned long v43;  // x11
    unsigned long long v44;  // 4138
    unsigned long long v45;  // 4140
    unsigned long long v46;  // x11
    __m128i v47;  // q0
    void* v48;  // x8
    unsigned long long v49;  // x22
    unsigned long long *iter;  // x23
    unsigned long v51;  // x20
    unsigned long long v17;  // x10
    unsigned long long v52;  // 4102
    unsigned long long v53;  // x8
    long long v54;  // x9
    unsigned long long ptr;  // x0
    unsigned long long v56;  // x8
    unsigned long long v57;  // x9
    unsigned long long v58;  // x24
    unsigned long long v59;  // x24
    unsigned long long v60;  // x28
    char v18;  // x9
    unsigned long v62;  // x25
    unsigned long long v63;  // x10
    unsigned long v64;  // x12
    unsigned long v65;  // x13
    unsigned long v66;  // x9
    unsigned long long v67;  // x8
    unsigned long v68;  // x9
    unsigned long long v69;  // x11
    unsigned long long v70;  // x14
    unsigned long v71;  // x11
    __m128i v19;  // q0
    unsigned long long v72;  // x8
    unsigned long v73;  // x8
    unsigned long v74;  // x9
    unsigned long long v75;  // x11
    unsigned long long v76;  // x12
    unsigned long v77;  // x8
    unsigned long v78;  // x9
    unsigned long long v79;  // x12
    unsigned long long v80;  // x11
    unsigned long v81;  // x8
    unsigned long long v20;  // x14
    unsigned long v82;  // x9
    unsigned long long v83;  // x11
    unsigned long long v84;  // x12
    unsigned long v85;  // x8
    unsigned long v86;  // x9
    unsigned long long v87;  // x12
    unsigned long long v88;  // x11
    unsigned long v89;  // x8
    unsigned long v90;  // x9
    unsigned long long v91;  // x11
    __m128i v21;  // q2
    unsigned long long v92;  // x12
    unsigned long v93;  // x8
    unsigned long v94;  // x9
    unsigned long long v95;  // x12
    unsigned long long v96;  // x11
    unsigned long v97;  // x8
    unsigned long long v98;  // x20
    unsigned long long v99;  // x26
    void* v100;  // x8
    unsigned long v101;  // x9
    unsigned long long v102;  // x27
    unsigned long long v103;  // x12
    unsigned long long v104;  // x12
    unsigned long v105;  // x13
    unsigned long long v106;  // x14
    unsigned long long v107;  // x14
    unsigned long long v108;  // x14
    unsigned long long v109;  // 4150
    unsigned long long v110;  // 4152
    unsigned long long v111;  // x15
    unsigned long v0;  // [bp-0xf0]
    unsigned long long v1;  // [bp-0xe8]
    unsigned long long v2;  // [bp-0xe0]
    unsigned long v3;  // [bp-0xd8]
    unsigned long long v4;  // [bp-0xd0]
    unsigned long long v5;  // [bp-0xc8]
    unsigned long long *v6;  // [bp-0xc0]
    unsigned long long v7;  // [bp-0xb8]
    unsigned int v8;  // [bp-0xac]
    st_b91d48_1 *v9;  // [bp-0xa8]
    uint384_t v10;  // [bp-0xa0]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v9 = a1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((long long)/* unsupported instruction */ >= 0)
    {
        v8 = sub_b7f924(a0, a1);
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if ((long long)/* unsupported instruction */ >= 0)
        {
            *(st_b91d48_1 **)&v10 = a1;
            if (!(&a0->field_80)[1])
                sub_c6c9ec(&a0->field_78, (char *)&a0->field_88 + 8);
            i = 0;
            v14 = 0;
            v15 = 5871781006564002453 * &a1->field_8;
            v16 = a0->field_78;
            v17 = a0->field_80;
            v18 = v15 >> 57;
            v19 = v18 | v18 * 0x100 | (v18 | v18 * 0x100) * 0x10000 | (v18 | v18 * 0x100 | (v18 | v18 * 0x100) * 0x10000) * 0x100000000;
            v20 = v15 & v17;
            v21 = *(long long *)((char *)v16 + v20);
            v23 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v21, v19));
            v24 = v23 & 0x8080808080808080;
            if (!(v23 & 0x8080808080808080))
                goto LABEL_b91e30;
            do
            {
                v25 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v21));
                if (v25)
                {
                    v33 = ((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v34 = (((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v35 = ((((v34 | v33) & 0xffff0000ffff0000) >> 16 | (v34 | v33) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v34 | v33) & 0xffff0000ffff0000) >> 16 | (v34 | v33) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    v25 = v20 + ((!v35 ? 64 : Clz(v35)) >> 3) & v17;
                    break;
                }
                i = 0;
LABEL_b91e70:
                v14 += 8;
                v20 = v14 + v20 & v17;
                v21 = *(long long *)((char *)v16 + v20);
                v39 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v21, v19));
                v24 = v39 & 0x8080808080808080;
                if (v39 & 0x8080808080808080)
                {
                    do
                    {
                        v26 = v24;
                        v27 = ((((((v26 & 0xaaaaaaaaaaaaaaaa) >> 1 | v26 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v26 & 0xaaaaaaaaaaaaaaaa) >> 1 | v26 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v26 & 0xaaaaaaaaaaaaaaaa) >> 1 | v26 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v26 & 0xaaaaaaaaaaaaaaaa) >> 1 | v26 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v28 = (((((((v26 & 0xaaaaaaaaaaaaaaaa) >> 1 | v26 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v26 & 0xaaaaaaaaaaaaaaaa) >> 1 | v26 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v26 & 0xaaaaaaaaaaaaaaaa) >> 1 | v26 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v26 & 0xaaaaaaaaaaaaaaaa) >> 1 | v26 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v29 = ((((v28 | v27) & 0xffff0000ffff0000) >> 16 | (v28 | v27) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v28 | v27) & 0xffff0000ffff0000) >> 16 | (v28 | v27) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        v30 = v16 - (v20 + ((!v29 ? 64 : Clz(v29)) >> 3) & v17) * 16;
                        if (a1 == *(long long *)((char *)v30 - 16))
                        {
                            *(unsigned int *)((char *)v30 - 8) = v8;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v40 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                            if (!(v40 & 1))
                            {
                                /* unsupported instruction */;
                                sub_b869ec(&v10);
                            }
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            if (/* unsupported instruction */)
                                goto LABEL_b928e8;
                            goto LABEL_b91ec8;
                        }
                    } while ((v31 = v26 - 1, v24 = v31 & v26, v31 & v26));
                }
LABEL_b91e30:
            } while (i != 1);
            v36 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v21, _mm_set1_epi8(-1)));
            if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))))))) & 1))
            {
                i = 1;
                goto LABEL_b91e70;
            }
            v41 = *((char *)v16 + v25);
            if (!(v41 >> 31 & 1))
            {
                v43 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v16));
                v44 = ((((((v43 & 0xaaaaaaaaaaaaaaaa) >> 1 | v43 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v43 & 0xaaaaaaaaaaaaaaaa) >> 1 | v43 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v43 & 0xaaaaaaaaaaaaaaaa) >> 1 | v43 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v43 & 0xaaaaaaaaaaaaaaaa) >> 1 | v43 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v45 = (((((((v43 & 0xaaaaaaaaaaaaaaaa) >> 1 | v43 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v43 & 0xaaaaaaaaaaaaaaaa) >> 1 | v43 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v43 & 0xaaaaaaaaaaaaaaaa) >> 1 | v43 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v43 & 0xaaaaaaaaaaaaaaaa) >> 1 | v43 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v46 = ((((v45 | v44) & 0xffff0000ffff0000) >> 16 | (v45 | v44) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v45 | v44) & 0xffff0000ffff0000) >> 16 | (v45 | v44) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                v25 = (!v46 ? 64 : Clz(v46)) >> 3;
                v41 = *((char *)v16 + v25);
            }
            *((char *)v16 + v25) = v18;
            *((char *)v16 + (v17 & v25 - 8) + 8) = v18;
            v47 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v41 & 1));
            *(__m128i *)&(&a0->field_80)[1] = _mm_sub_epi64(*(int128_t *)&(&a0->field_80)[1], v47);
            v48 = v16 - v25 * 16;
            *(st_b91d48_1 **)((char *)v48 - 16) = a1;
            *(unsigned int *)((char *)v48 - 8) = v8;
            /* unsupported instruction */;
            /* unsupported instruction */;
            if (!/* unsupported instruction */)
            {
LABEL_b91ec8:
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_b91ed4;
            }
            else
            {
LABEL_b928e8:
                /* unsupported instruction */;
            }
            sub_c7573c(&a1->field_8);
LABEL_b91ed4:
            if (a1->field_20)
            {
                v49 = 0;
                iter = a1->field_18;
                v3 = v8;
                v6 = &iter[33 * a1->field_20];
                v7 = 5871781006564002453 * v3;
                v4 = v7 >> 57;
                do
                {
                    v51 = (11 < iter[3] ? iter[3] - 12 : 9);
                    if (v51 == 11)
                    {
LABEL_b925d0:
                        v182 = iter[29];
                        do
                        {
                            /* unsupported instruction */;
                            v183 = /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        goto LABEL_b925e4;
                    }
                    switch (v51)
                    {
                    case 14:
LABEL_b91f30:
                        v182 = iter[10];
                        do
                        {
                            /* unsupported instruction */;
                            v183 = /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        goto LABEL_b925e4;
                        break;
                    }
                    if (9 >= (long long)v51)
                    {
                        if ((long long)v51 > 3)
                        {
                            if (v51 - 4 >= 5)
                            {
                                sub_b838c4(&v10, iter);
                                goto LABEL_b91ff8;
                            }
                        }
                        else
                        {
                            v52 = arm64g_calculate_condition(52, v51, 3, 0);
                            if (v52 & 1)
                                goto LABEL_b925ac;
                            goto LABEL_b91f9c;
                        }
                        goto LABEL_b91f7c;
                    }
                    else if ((long long)v51 > 14)
                    {
LABEL_b91f7c:
                        *(unsigned long long *)&v10 = 0;
                        goto LABEL_b925ac;
                    }
                    else
                    {
                        if (v51 == 10)
                        {
                            if (iter[20] != 0x8000000000000000)
                                continue;
                            ptr = _malloc(8);
                            if (!ptr)
                            {
                                sub_c6ba70(8, 8);
                                __debugbreak();
                            }
                            v0 = 10;
                            v59 = ptr;
                            *(unsigned long long **)v59 = iter + 21;
                            v58 = v59 + 8;
                            v2 = 1;
                            goto LABEL_b92010;
                        }
                        if (v51 == 12)
                        {
LABEL_b91f9c:
                            v53 = 40;
                            v54 = 48;
                            goto LABEL_b91fe8;
                        }
                        else
                        {
                            v53 = 168;
                            v54 = 176;
LABEL_b91fe8:
                            sub_b8c520(&v10, *(long long *)((char *)iter + v53), *(long long *)((char *)iter + v54));
LABEL_b91ff8:
                            ptr = *(unsigned long long *)((void*)&v10 + 8);
                            v56 = *(unsigned long long *)((void*)&v10 + 16);
                            v57 = *(unsigned long long *)&v10;
                            if (v56)
                            {
                                v0 = v51;
                                v2 = v57;
                                v58 = ptr + v56 * 8;
LABEL_b92010:
                                v1 = ptr;
                                v60 = ptr;
                                v5 = v58;
                                while (1)
                                {
                                    v62 = *(long long *)*(long long *)v60;
                                    do
                                    {
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
                                    if ((long long)/* unsupported instruction */ < 0)
                                        break;
                                    v63 = 0;
                                    v64 = a0->field_70 ^ 7237128888997146477;
                                    v65 = v62 + 8;
                                    v66 = a0->field_70 ^ v65 ^ 8387220255154660723;
                                    v67 = v66 + (a0->field_68 ^ 7816392313619706465);
                                    v68 = v67 ^ __ROL__(v66, 16);
                                    v69 = (a0->field_68 ^ 8317987319222330741) + v64;
                                    v70 = __ROL__(v69, 32) + v68;
                                    v71 = v69 ^ __ROL__(v64, 13);
                                    v72 = v71 + v67;
                                    v73 = v72 ^ __ROL__(v71, 0x11);
                                    v74 = v70 ^ __ROL__(v68, 21) ^ 0x800000000000000;
                                    v75 = v73 + (v70 ^ v65);
                                    v76 = v74 + __ROL__(v72, 32);
                                    v77 = v75 ^ __ROL__(v73, 13);
                                    v78 = v76 ^ __ROL__(v74, 16);
                                    v79 = v76 + v77;
                                    v80 = v78 + __ROL__(v75, 32);
                                    v81 = v79 ^ __ROL__(v77, 0x11);
                                    v82 = v80 ^ __ROL__(v78, 21);
                                    v83 = (v80 ^ 0x800000000000000) + v81;
                                    v84 = v82 + (__ROL__(v79, 32) ^ 0xff);
                                    v85 = v83 ^ __ROL__(v81, 13);
                                    v86 = v84 ^ __ROL__(v82, 16);
                                    v87 = v85 + v84;
                                    v88 = v86 + __ROL__(v83, 32);
                                    v89 = v87 ^ __ROL__(v85, 0x11);
                                    v90 = v88 ^ __ROL__(v86, 21);
                                    v91 = v89 + v88;
                                    v92 = v90 + __ROL__(v87, 32);
                                    v93 = v91 ^ __ROL__(v89, 13);
                                    v94 = v92 ^ __ROL__(v90, 16);
                                    v95 = v93 + v92;
                                    v96 = v94 + __ROL__(v91, 32);
                                    v97 = (v95 ^ __ROL__(v93, 0x11)) + v96 ^ __ROL__(v95 ^ __ROL__(v93, 0x11), 13);
                                    v98 = __ROL__((v96 ^ __ROL__(v94, 21)) + __ROL__(v95, 32) ^ __ROL__(v96 ^ __ROL__(v94, 21), 16), 21) ^ __ROL__(v97, 0x11) ^ __ROL__(v97 + (v96 ^ __ROL__(v94, 21)) + __ROL__(v95, 32), 32) ^ v97 + (v96 ^ __ROL__(v94, 21)) + __ROL__(v95, 32);
                                    v99 = a0->field_40;
                                    v100 = a0->field_48;
                                    v101 = a0->field_50;
                                    v102 = v98 >> 57;
                                    v103 = v98;
                                    while (1)
                                    {
                                        v104 = v103 & v101;
                                        v105 = *(long long *)((char *)v100 + v104);
                                        v106 = (v105 ^ 0x101010101010101 * v102) + 0xfefefefefefefeff & ~(v105 ^ 0x101010101010101 * v102);
                                        v107 = v106 & 0x8080808080808080;
                                        if (v106 & 0x8080808080808080)
                                        {
                                            do
                                            {
                                                v108 = v107;
                                                v109 = ((((((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                v110 = (((((((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                v111 = ((((v110 | v109) & 0xffff0000ffff0000) >> 16 | (v110 | v109) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v110 | v109) & 0xffff0000ffff0000) >> 16 | (v110 | v109) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                v112 = v100 - (v104 + ((!v111 ? 64 : Clz(v111)) >> 3) & v101) * 8;
                                                v113 = *(long long *)((char *)v112 - 8);
                                                if (v99 <= v113)
                                                {
                                                    sub_c73c94(v113, v99, &g_efb4a0);
                                                    __debugbreak();
                                                }
                                                if (v62 == *(long long *)&a0->field_38[6 * v113])
                                                {
                                                    v115 = *(long long *)((char *)v112 - 8);
                                                    if (v99 <= v115)
                                                    {
                                                        sub_c73c94(v115, v99, &g_efa240);
                                                        __debugbreak();
                                                    }
                                                    v116 = &a0->field_38[6 * v115];
                                                    do
                                                    {
                                                        /* unsupported instruction */;
                                                        /* unsupported instruction */;
                                                        /* unsupported instruction */;
                                                    } while (/* unsupported instruction */ ^ 1);
                                                    v117 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                                    if (!(v117 & 1))
                                                    {
                                                        /* unsupported instruction */;
                                                        sub_b86a90(v62);
                                                        goto LABEL_b92444;
                                                    }
                                                }
                                            } while ((v114 = v108 - 1, v107 = v114 & v108, v114 & v108));
                                        }
                                        if (v105 & v105 * 2 & 0x8080808080808080)
                                            break;
                                        v63 += 8;
                                        v103 = v104 + v63;
                                    }
                                    v118 = v101 & v98;
                                    v119 = *(long long *)((char *)v100 + v118) & 0x8080808080808080;
                                    if (!(*(long long *)((char *)v100 + v118) & 0x8080808080808080))
                                    {
                                        v120 = 8;
                                        do
                                        {
                                            v118 = v118 + v120 & v101;
                                            v120 += 8;
                                            v119 = *(long long *)((char *)v100 + v118) & 0x8080808080808080;
                                        } while (!(*(long long *)((char *)v100 + v118) & 0x8080808080808080));
                                    }
                                    v121 = ((((((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v122 = (((((((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v123 = ((((v122 | v121) & 0xffff0000ffff0000) >> 16 | (v122 | v121) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v122 | v121) & 0xffff0000ffff0000) >> 16 | (v122 | v121) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v124 = v118 + ((!v123 ? 64 : Clz(v123)) >> 3) & v101;
                                    v125 = *((char *)v100 + v124);
                                    if (v125 >> 31 & 1)
                                    {
                                        v126 = a0->field_58;
                                        if (!v126)
                                            goto LABEL_b92370;
                                    }
                                    else
                                    {
                                        v127 = *(long long *)v100 & 0x8080808080808080;
                                        v128 = ((((((v127 & 0xaaaaaaaaaaaaaaaa) >> 1 | v127 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v127 & 0xaaaaaaaaaaaaaaaa) >> 1 | v127 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v127 & 0xaaaaaaaaaaaaaaaa) >> 1 | v127 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v127 & 0xaaaaaaaaaaaaaaaa) >> 1 | v127 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v129 = (((((((v127 & 0xaaaaaaaaaaaaaaaa) >> 1 | v127 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v127 & 0xaaaaaaaaaaaaaaaa) >> 1 | v127 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v127 & 0xaaaaaaaaaaaaaaaa) >> 1 | v127 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v127 & 0xaaaaaaaaaaaaaaaa) >> 1 | v127 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v130 = ((((v129 | v128) & 0xffff0000ffff0000) >> 16 | (v129 | v128) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v129 | v128) & 0xffff0000ffff0000) >> 16 | (v129 | v128) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        v124 = (!v130 ? 64 : Clz(v130)) >> 3;
                                        v125 = *((char *)v100 + v124);
                                        v126 = a0->field_58;
                                        if (!v126)
                                        {
LABEL_b92370:
                                            if (v125 & 1)
                                            {
                                                sub_c6bb70(&a0->field_48);
                                                v100 = a0->field_48;
                                                v101 = a0->field_50;
                                                v131 = v98 & v101;
                                                v132 = *(long long *)((char *)v100 + v131) & 0x8080808080808080;
                                                if (!(*(long long *)((char *)v100 + v131) & 0x8080808080808080))
                                                {
                                                    v133 = 8;
                                                    do
                                                    {
                                                        v131 = v131 + v133 & v101;
                                                        v133 += 8;
                                                        v132 = *(long long *)((char *)v100 + v131) & 0x8080808080808080;
                                                    } while (!(*(long long *)((char *)v100 + v131) & 0x8080808080808080));
                                                }
                                                v134 = ((((((v132 & 0xaaaaaaaaaaaaaaaa) >> 1 | v132 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v132 & 0xaaaaaaaaaaaaaaaa) >> 1 | v132 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v132 & 0xaaaaaaaaaaaaaaaa) >> 1 | v132 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v132 & 0xaaaaaaaaaaaaaaaa) >> 1 | v132 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                v135 = (((((((v132 & 0xaaaaaaaaaaaaaaaa) >> 1 | v132 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v132 & 0xaaaaaaaaaaaaaaaa) >> 1 | v132 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v132 & 0xaaaaaaaaaaaaaaaa) >> 1 | v132 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v132 & 0xaaaaaaaaaaaaaaaa) >> 1 | v132 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                v136 = ((((v135 | v134) & 0xffff0000ffff0000) >> 16 | (v135 | v134) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v135 | v134) & 0xffff0000ffff0000) >> 16 | (v135 | v134) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                v124 = v131 + ((!v136 ? 64 : Clz(v136)) >> 3) & v101;
                                                if (*((char *)v100 + v124) >= 0)
                                                {
                                                    v137 = *(long long *)v100 & 0x8080808080808080;
                                                    v138 = ((((((v137 & 0xaaaaaaaaaaaaaaaa) >> 1 | v137 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v137 & 0xaaaaaaaaaaaaaaaa) >> 1 | v137 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v137 & 0xaaaaaaaaaaaaaaaa) >> 1 | v137 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v137 & 0xaaaaaaaaaaaaaaaa) >> 1 | v137 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                    v139 = (((((((v137 & 0xaaaaaaaaaaaaaaaa) >> 1 | v137 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v137 & 0xaaaaaaaaaaaaaaaa) >> 1 | v137 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v137 & 0xaaaaaaaaaaaaaaaa) >> 1 | v137 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v137 & 0xaaaaaaaaaaaaaaaa) >> 1 | v137 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                    v140 = ((((v139 | v138) & 0xffff0000ffff0000) >> 16 | (v139 | v138) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v139 | v138) & 0xffff0000ffff0000) >> 16 | (v139 | v138) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                    v124 = (!v140 ? 64 : Clz(v140)) >> 3;
                                                }
                                                v126 = a0->field_58;
                                            }
                                        }
                                    }
                                    a0->field_58 = v126 - (v125 & 1);
                                    *((char *)v100 + v124) = v102;
                                    *((char *)a0->field_48 + (v124 - 8 & v101) + 8) = v102;
                                    a0->field_60 = a0->field_60 + 1;
                                    *(unsigned long long *)((char *)a0->field_48 + -8 * v124 - 8) = v99;
                                    v141 = a0->field_30;
                                    v142 = a0->field_40;
                                    if (v99 == v141)
                                    {
                                        v143 = a0->field_58 + a0->field_60;
                                        v141 = v99;
                                        if (v99 - v142 < v143 - v142)
                                        {
                                            if (v143 >= v142)
                                            {
                                                sub_c6c158(&v10, v99, a0->field_38, v143, 8, 48);
                                                if (*(unsigned long long *)&v10 == 1)
                                                {
                                                    sub_c6b970(*(unsigned long long *)((void*)&v10 + 8));
                                                    __debugbreak();
                                                }
                                                a0->field_30 = v143;
                                                a0->field_38 = *(unsigned long long *)((void*)&v10 + 8);
                                                v142 = a0->field_40;
                                                v141 = v143;
                                            }
                                            else
                                            {
                                                sub_c6b970(0);
                                                __debugbreak();
                                            }
                                        }
                                    }
                                    *(uint128_t *)((char *)&v10 + 8) = g_efc958;
                                    *(uint128_t *)((char *)&v10 + 24) = g_efc968;
                                    *(unsigned long long *)((char *)&v10 + 40) = v98;
                                    *(unsigned long *)&v10 = v62;
                                    if (v142 == v141)
                                        sub_c6c2f4(&a0->field_30);
                                    v144 = &a0->field_38[6 * v142];
                                    *v144 = *(uint128_t *)&v10;
                                    v144[1] = *(uint128_t *)((void*)&v10 + 16);
                                    v144[2] = *(uint128_t *)((void*)&v10 + 32);
                                    v145 = v142 + 1;
                                    a0->field_40 = v145;
                                    if (v145 <= v99)
                                    {
                                        sub_c73c94(v99);
                                        __debugbreak();
                                    }
                                    v116 = &a0->field_38[6 * v99];
                                    v58 = v5;
LABEL_b92444:
                                    v146 = 0;
                                    v147 = v116;
                                    v148 = v147->field_8;
                                    v149 = v147->field_10;
                                    v150 = v7;
                                    while (1)
                                    {
                                        v151 = v150 & v149;
                                        v152 = *(long long *)((char *)v148 + v151);
                                        v154 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v152, (uint128_t)(v4 & 0xff | (v4 & 0xff) * 0x100 | (v4 & 0xff | (v4 & 0xff) * 0x100) * 0x10000 | (v4 & 0xff | (v4 & 0xff) * 0x100 | (v4 & 0xff | (v4 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                                        v155 = v154 & 0x8080808080808080;
                                        if (v154 & 0x8080808080808080)
                                        {
                                            do
                                            {
                                                v156 = v155;
                                                v157 = ((((((v156 & 0xaaaaaaaaaaaaaaaa) >> 1 | v156 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v156 & 0xaaaaaaaaaaaaaaaa) >> 1 | v156 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v156 & 0xaaaaaaaaaaaaaaaa) >> 1 | v156 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v156 & 0xaaaaaaaaaaaaaaaa) >> 1 | v156 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                v158 = (((((((v156 & 0xaaaaaaaaaaaaaaaa) >> 1 | v156 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v156 & 0xaaaaaaaaaaaaaaaa) >> 1 | v156 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v156 & 0xaaaaaaaaaaaaaaaa) >> 1 | v156 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v156 & 0xaaaaaaaaaaaaaaaa) >> 1 | v156 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                v159 = ((((v158 | v157) & 0xffff0000ffff0000) >> 16 | (v158 | v157) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v158 | v157) & 0xffff0000ffff0000) >> 16 | (v158 | v157) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                if (*(int *)((char *)v148 + -16 * (v151 + ((!v159 ? 64 : Clz(v159)) >> 3) & v149) - 16) == v8)
                                                    goto LABEL_b92100;
                                            } while ((v160 = v156 - 1, v155 = v160 & v156, v160 & v156));
                                        }
                                        v161 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v152, _mm_set1_epi8(-1)));
                                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))))))) & 1)
                                            break;
                                        v146 += 8;
                                        v150 = v151 + v146;
                                    }
                                    if ((&v116->field_10)[1])
                                    {
                                        v163 = v149 & v7;
                                        v164 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v148 + v163)));
                                        j = __double_as_longlong(v164);
                                        if (!j)
                                            goto LABEL_b92540;
                                    }
                                    else
                                    {
                                        sub_c6d67c();
                                        v148 = v116->field_8;
                                        v149 = v116->field_10;
                                        v163 = v149 & v7;
                                        v166 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v148 + v163)));
                                        j = __double_as_longlong(v166);
                                        if (!j)
                                        {
LABEL_b92540:
                                            v167 = 8;
                                            do
                                            {
                                                v163 = v163 + v167 & v149;
                                                j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v148 + v163)));
                                                v167 += 8;
                                            } while (!j);
                                        }
                                    }
                                    v169 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v170 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v171 = ((((v170 | v169) & 0xffff0000ffff0000) >> 16 | (v170 | v169) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v170 | v169) & 0xffff0000ffff0000) >> 16 | (v170 | v169) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v172 = v163 + ((!v171 ? 64 : Clz(v171)) >> 3) & v149;
                                    v173 = *((char *)v148 + v172);
                                    if (!(v173 >> 31 & 1))
                                    {
                                        v175 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v148));
                                        v176 = ((((((v175 & 0xaaaaaaaaaaaaaaaa) >> 1 | v175 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v175 & 0xaaaaaaaaaaaaaaaa) >> 1 | v175 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v175 & 0xaaaaaaaaaaaaaaaa) >> 1 | v175 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v175 & 0xaaaaaaaaaaaaaaaa) >> 1 | v175 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v177 = (((((((v175 & 0xaaaaaaaaaaaaaaaa) >> 1 | v175 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v175 & 0xaaaaaaaaaaaaaaaa) >> 1 | v175 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v175 & 0xaaaaaaaaaaaaaaaa) >> 1 | v175 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v175 & 0xaaaaaaaaaaaaaaaa) >> 1 | v175 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v178 = ((((v177 | v176) & 0xffff0000ffff0000) >> 16 | (v177 | v176) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v177 | v176) & 0xffff0000ffff0000) >> 16 | (v177 | v176) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        v172 = (!v178 ? 64 : Clz(v178)) >> 3;
                                        v173 = *((char *)v148 + v172);
                                    }
                                    v179 = v4;
                                    *((char *)v148 + v172) = v179;
                                    *((char *)v148 + (v172 - 8 & v149) + 8) = v179;
                                    v180 = v148 - v172 * 16;
                                    *(unsigned int *)((char *)v180 - 16) = v8;
                                    *(unsigned long long *)((char *)v180 - 8) = v49;
                                    v181 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v173 & 1));
                                    *(__m128i *)&(&v116->field_10)[1] = _mm_sub_epi64(*(int128_t *)&(&v116->field_10)[1], v181);
LABEL_b92100:
                                    v60 += 8;
                                    if (v60 == v58)
                                    {
                                        v57 = v2;
                                        v51 = v0;
                                        goto LABEL_b925a4;
                                    }
                                }
                            }
                            else
                            {
LABEL_b925a4:
                                if (v57)
                                    _free();
                            }
LABEL_b925ac:
                            if ((long long)v51 > 7)
                            {
                                if (v51 != 8)
                                {
                                    if (v51 == 11)
                                        goto LABEL_b925d0;
                                    if (v51 != 14)
                                        continue;
                                }
                                else
                                {
                                    v182 = iter[12];
                                    do
                                    {
                                        /* unsupported instruction */;
                                        v183 = /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
LABEL_b925e4:
                                    if ((long long)v183 < 0)
                                        goto LABEL_b928f8;
                                    v203 = sub_b91d48(a0, v182);
                                    v187 = v8;
                                    goto LABEL_b925f8;
                                }
                                goto LABEL_b91f30;
                            }
                            else if (v51 != 4)
                            {
                                if (v51 != 7)
                                    continue;
                                v182 = iter[12];
                                do
                                {
                                    /* unsupported instruction */;
                                    v183 = /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                goto LABEL_b925e4;
                            }
                            else
                            {
                                v184 = sub_b7f924(a0, 0, v49);
                                v185 = a0->field_28;
                                v186 = arm64g_calculate_condition(1, v185 & 0xffffffff, 1, 0);
                                if (v186 & 1)
                                {
                                    sub_c73c80("assertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *co", 88, &g_efa640);
                                    __debugbreak();
                                }
                                v187 = v184;
                                v188 = v184;
                                if (a0->field_10 <= (v3 < v188 ? v188 : v3))
                                {
                                    sub_c76860("Graph::add_edge: node indices out of boundsIndexSet: index out of bounds (exhausted)", 43, &g_efa658);
                                    __debugbreak();
                                }
                                v189 = a0->field_8 + (unsigned int)v188 * 24;
                                v190 = (v8 == v187 ? v189 : a0->field_8 + (unsigned int)v3 * 24);
                                v191 = v190[4];
                                v192 = v189[5];
                                v190[4] = v185;
                                v189[5] = v185;
                                if (v185 == a0->field_18)
                                    sub_c6c35c(&a0->field_18);
                                v193 = a0->field_20 + v185 * 16;
                                v193->field_0 = v191;
                                v193->field_4 = v192;
                                v193->field_8 = v3 | v188 * 0x100000000;
                                a0->field_28 = v185 + 1;
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ < 0)
                                    goto LABEL_b928f8;
                                v194 = sub_b91d48(a0, iter[12]);
                                v195 = a0->field_28;
                                v196 = arm64g_calculate_condition(1, v195 & 0xffffffff, 1, 0);
                                if (v196 & 1)
                                {
                                    sub_c73c80("assertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *co", 88, &g_efa640);
                                    __debugbreak();
                                }
                                v197 = v194;
                                if (a0->field_10 <= (v188 < v197 ? v197 : v188))
                                {
                                    sub_c76860("Graph::add_edge: node indices out of boundsIndexSet: index out of bounds (exhausted)", 43, &g_efa658);
                                    __debugbreak();
                                }
                                v198 = a0->field_8 + (unsigned int)v197 * 24;
                                v199 = (v187 == v194 ? v198 : a0->field_8 + (unsigned int)v188 * 24);
                                v200 = v199[4];
                                v201 = v198[5];
                                v199[4] = v195;
                                v198[5] = v195;
                                if (v195 == a0->field_18)
                                    sub_c6c35c(&a0->field_18);
                                v202 = a0->field_20 + v195 * 16;
                                v202->field_0 = v200;
                                v202->field_4 = v201;
                                v202->field_8 = v188 | v197 * 0x100000000;
                                a0->field_28 = v195 + 1;
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                if ((long long)/* unsupported instruction */ < 0)
                                    goto LABEL_b928f8;
                                v203 = sub_b91d48(a0, iter[13]);
LABEL_b925f8:
                                v204 = a0->field_28;
                                v205 = arm64g_calculate_condition(1, v204 & 0xffffffff, 1, 0);
                                if (v205 & 1)
                                {
                                    sub_c73c80("assertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *co", 88, &g_efa640);
                                    __debugbreak();
                                }
                                v206 = v203;
                                v207 = v187;
                                if (a0->field_10 <= (v207 < v206 ? v206 : v207))
                                {
                                    sub_c76860("Graph::add_edge: node indices out of boundsIndexSet: index out of bounds (exhausted)", 43, &g_efa658);
                                    __debugbreak();
                                }
                                v208 = a0->field_8 + (unsigned int)v206 * 24;
                                v209 = (v187 == v203 ? v208 : a0->field_8 + (unsigned int)v207 * 24);
                                v210 = v209[4];
                                v211 = v208[5];
                                v209[4] = v204;
                                v208[5] = v204;
                                if (v204 == a0->field_18)
                                    sub_c6c35c(&a0->field_18);
                                v212 = a0->field_20 + v204 * 16;
                                v212->field_0 = v210;
                                v212->field_4 = v211;
                                v212->field_8 = v207 | v206 * 0x100000000;
                                a0->field_28 = v204 + 1;
                            }
                        }
                    }
                } while ((iter += 33, v49 += 1, iter != v6));
            }
            do
            {
                /* unsupported instruction */;
                if (/* unsupported instruction */ != 1)
                {
                    /* unsupported instruction */;
                    sub_c75418(&a1->field_8);
                    break;
                }
            } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v214 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (v214 & 1)
                return v8;
            /* unsupported instruction */;
            sub_b869ec(&v9);
            return v8;
        }
    }
LABEL_b928f8:
    sub_c769bc();
    sub_c73c80("assertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *co", 88, &g_efa640);
    __debugbreak();
}
