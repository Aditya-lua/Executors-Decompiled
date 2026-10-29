/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa4640..0xaa4ce0 (1696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_df6c00;
extern char _NSHomeDirectory;

void* sub_aa4640(void* a0, unsigned long long *a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v11;  // x30
    unsigned long long iter;  // x2
    unsigned long long v21;  // x5
    __m128i v95;  // q12
    __m128i v96;  // q13
    __m128i v97;  // q31
    unsigned long long v98;  // 4411
    unsigned long long v99;  // x2
    __m128i v100;  // q14
    __m128i v101;  // q15
    __m128i v102;  // q16
    __m128i v103;  // q17
    __m128i v104;  // q18
    unsigned long long v22;  // x5
    unsigned long v105;  // x8
    unsigned long v106;  // x12
    unsigned long long *v107;  // x16
    unsigned long v108;  // x9
    unsigned long v109;  // x13
    __m128i v110;  // q23
    __m128i v111;  // q21
    __m128i v112;  // q20
    unsigned long v113;  // d11
    unsigned long v114;  // d9
    unsigned long v23;  // 4188
    unsigned long v115;  // x8
    unsigned long v116;  // x12
    unsigned long long *v117;  // x1
    unsigned long v118;  // x9
    unsigned long v119;  // x13
    unsigned long v120;  // d10
    unsigned long v121;  // d12
    unsigned long v122;  // d13
    __m128i v123;  // q22
    __m128i v124;  // q19
    unsigned long long v24;  // x14
    __m128i v126;  // q23
    __m128i v127;  // q27
    __m128i v128;  // q20
    __m128i v131;  // q28
    __m128i v132;  // q21
    unsigned long long *v25;  // x1
    __m128i v135;  // q19
    __m128i v136;  // q25
    __m128i v137;  // q27
    unsigned long long v141;  // 4251
    __m128i v142;  // q16
    __m128i v143;  // q11
    unsigned long long v144;  // 4113
    unsigned long long v26;  // x10
    __m128i v145;  // q14
    __m128i v146;  // q15
    __m128i v147;  // q17
    __m128i v148;  // q18
    __m128i v149;  // q22
    __m128i v150;  // q19
    __m128i v151;  // q23
    __m128i v152;  // q20
    __m128i v153;  // q21
    unsigned long long v154;  // 4310
    unsigned long long v27;  // x4
    unsigned long v155;  // d9
    unsigned long v156;  // d10
    unsigned long v157;  // d12
    unsigned long v158;  // d13
    unsigned long long v159;  // d22
    unsigned long long v160;  // d19
    unsigned long long v161;  // d23
    unsigned long long v162;  // d20
    unsigned long long v163;  // d21
    unsigned long long v164;  // d19
    unsigned long v28;  // 4203
    unsigned long long v165;  // d22
    unsigned long long v29;  // x5
    unsigned long v30;  // 4210
    unsigned long v13;  // x10
    unsigned long long v31;  // x4
    unsigned long v32;  // 4217
    unsigned long long v33;  // x5
    unsigned long v34;  // 4224
    unsigned long long v35;  // x6
    unsigned long long *v36;  // x16
    unsigned long long v37;  // x2
    unsigned long v38;  // cc_dep1
    unsigned long long v39;  // d8
    unsigned long long v40;  // d9
    unsigned long v14;  // x11
    unsigned long long v41;  // d10
    unsigned long long v42;  // d11
    unsigned long long v43;  // d12
    unsigned long long v44;  // d13
    unsigned long long v45;  // d14
    unsigned long long v46;  // d15
    __m128i v47;  // q24
    __m128i v48;  // q25
    __m128i v49;  // q26
    __m128i v50;  // q27
    unsigned long v15;  // x12
    __m128i v51;  // q28
    unsigned long v52;  // x4
    unsigned long v53;  // x5
    unsigned long v54;  // x6
    unsigned long long *v55;  // x1
    unsigned long long v56;  // x4
    unsigned long v57;  // 4128
    unsigned long long v58;  // x5
    unsigned long v59;  // 4135
    unsigned long v16;  // x13
    long long v60;  // x0
    long long v61;  // x0
    void* v62;  // x0
    unsigned long v17;  // x14
    unsigned long long v63;  // x8
    unsigned long long v64;  // x12
    unsigned long long v18;  // x4
    unsigned long long *v65;  // x16
    unsigned long long v66;  // x9
    unsigned long long v67;  // x13
    unsigned long long *v68;  // x16
    unsigned long long v69;  // x3
    uint128_t *v70;  // x15
    __m128i v71;  // q14
    __m128i v72;  // q15
    __m128i v73;  // q16
    __m128i v74;  // q17
    unsigned long long v19;  // x4
    __m128i v75;  // q18
    unsigned long long v76;  // x8
    unsigned long long v77;  // x12
    unsigned long long *v78;  // x1
    unsigned long long v79;  // x9
    unsigned long long v80;  // x13
    unsigned long long *v81;  // x1
    __m128i v82;  // q3
    __m128i v83;  // q2
    __m128i v84;  // q1
    unsigned long v20;  // 4179
    __m128i v85;  // q0
    uint128_t *v86;  // x15
    __m128i v87;  // q7
    __m128i v88;  // q6
    __m128i v89;  // q5
    __m128i v90;  // q4
    __m128i v91;  // q8
    __m128i v92;  // q9
    __m128i v93;  // q10
    __m128i v94;  // q11
    char *v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    unsigned long long v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (128 > a2)
        if (!(long long)a0[24])
            goto LABEL_0xaa4460;
        else
            goto LABEL_aa4650;
LABEL_aa4650:
    v0 = &v10;
    v1 = v11;
    iter = a2 & 0xfffffffffffffff0;
    if (!(a2 & 0xfffffffffffffff0))
        return a0;
    if ((long long)a0[24])
    {
        v13 = *(int *)a0;
        v14 = (int)a0[4];
        v15 = (int)a0[8];
        v16 = (int)a0[12];
        v17 = (int)a0[16];
        if (iter & 31)
        {
            v18 = v13 + v14 * 0x4000000;
            v19 = v18 + v15 * 0x10000000000000;
            v20 = arm64g_calculate_flag_c(2, v18, v15 * 0x10000000000000, 0);
            v21 = (v15 >> 12) + v16 * 0x4000 + v20;
            v22 = v21 + v17 * 0x10000000000;
            v23 = arm64g_calculate_flag_c(2, v21, v17 * 0x10000000000, 0);
            v24 = (v17 >> 24) + v23;
            v25 = a1 + 2;
            iter -= 16;
            v26 = (v24 & 0xfffffffffffffffc) + (v24 >> 2);
            v27 = v19 + v26;
            v28 = arm64g_calculate_flag_c(2, v19, v26, 0);
            v29 = v22 + v28;
            v30 = arm64g_calculate_flag_c(6, v22, 0, v28);
            v31 = v27 + *a1;
            v32 = arm64g_calculate_flag_c(2, v27, *a1, 0);
            v33 = v29 + a1[1] + v32;
            v34 = arm64g_calculate_flag_c(6, v29, a1[1], v32);
            v35 = (v24 & 3) + v30 + a3 + v34;
            a0 = sub_aa4560();
            if (!a3)
            {
                *(unsigned long long *)a0 = v31;
                *(unsigned long long *)&a0[8] = v33;
                *(unsigned long long *)&a0[16] = v35;
                *(unsigned long long *)&a0[24] = 0;
                return a0;
            }
            v13 = v31 & 0x3ffffff;
            v14 = (v31 * 0x4000000000 | v31 >> 26) & 0xffffffc003ffffff & 0x3ffffff;
            v15 = (v33 * 0x1000 | v31 >> 52) & 0x3ffffff;
            v16 = (v33 * 0x4000000000000 | v33 >> 14) & 0xfffc000003ffffff & 0x3ffffff;
            v17 = v35 * &_NSHomeDirectory | v33 >> 40;
            a1 = v25;
            if (!iter)
            {
                *(unsigned int *)a0 = v13;
                *(unsigned int *)&a0[4] = v14;
                *(unsigned int *)&a0[8] = v15;
                *(unsigned int *)&a0[12] = v16;
                *(unsigned int *)&a0[16] = v17;
                return a0;
            }
        }
        v36 = a1 + 4;
        v37 = iter - 64;
        v38 = iter;
        if (iter < 64)
            v36 = &g_df6c00;
        v2 = v39;
        v3 = v40;
        v4 = v41;
        v5 = v42;
        v6 = v43;
        v7 = v44;
        v8 = v45;
        v9 = v46;
        v47 = __double_as_longlong(__longlong_as_double(v13));
        v48 = __double_as_longlong(__longlong_as_double(v14));
        v49 = __double_as_longlong(__longlong_as_double(v15));
        v50 = __double_as_longlong(__longlong_as_double(v16));
        v51 = __double_as_longlong(__longlong_as_double(v17));
    }
    else
    {
        v52 = *(long long *)a0;
        v53 = (long long)a0[8];
        v54 = (long long)a0[16];
        if (iter & 31)
        {
            v55 = a1 + 2;
            iter -= 16;
            v56 = v52 + *a1;
            v57 = arm64g_calculate_flag_c(2, v52, *a1, 0);
            v58 = v53 + a1[1] + v57;
            v59 = arm64g_calculate_flag_c(6, v53, a1[1], v57);
            v54 = (long long)a0[16] + a3 + v59;
            a0 = sub_aa4560();
            v52 = v56;
            v53 = v58;
            a1 = v55;
        }
        v2 = v39;
        v3 = v40;
        v4 = v41;
        v5 = v42;
        v6 = v43;
        v7 = v44;
        v8 = v45;
        v9 = v46;
        v47 = __double_as_longlong(__longlong_as_double(v52 & 0x3ffffff));
        v48 = __double_as_longlong(__longlong_as_double((v52 * 0x4000000000 | v52 >> 26) & 0xffffffc003ffffff & 0x3ffffff));
        v49 = __double_as_longlong(__longlong_as_double((v53 * 0x1000 | v52 >> 52) & 0x3ffffff));
        v50 = __double_as_longlong(__longlong_as_double((v53 * 0x4000000000000 | v53 >> 14) & 0xfffc000003ffffff & 0x3ffffff));
        v51 = __double_as_longlong(__longlong_as_double(v54 * &_NSHomeDirectory | v53 >> 40));
        v60 = sub_aa4560(sub_aa45e0(a0 + 60));
        v61 = sub_aa4560(sub_aa45e0(v60 - 4));
        v62 = sub_aa45e0(sub_aa4560(sub_aa45e0(v61 - 4)) - 4);
        v36 = a1 + 4;
        v37 = iter - 64;
        v38 = iter;
        if (iter < 64)
            v36 = &g_df6c00;
        *(unsigned long long *)((char *)v62 - 24) = 1;
        a0 = v62 - 48;
    }
    v63 = *v36;
    v64 = v36[1];
    v65 = v36 + 2;
    v66 = *v65;
    v67 = v65[1];
    v68 = v65 + 6;
    v69 = a3 * &_NSHomeDirectory;
    v70 = a0 + 48;
    v71 = __double_as_longlong(__longlong_as_double((v63 & 0x3ffffff) + (v66 & 0x3ffffff) * 0x100000000));
    v72 = __double_as_longlong(__longlong_as_double(((v63 * 0x4000000000 | v63 >> 26) & 0xffffffc003ffffff & 0x3ffffff) + ((v66 * 0x4000000000 | v66 >> 26) & 0xffffffc003ffffff & 0x3ffffff) * 0x100000000));
    v73 = __double_as_longlong(__longlong_as_double(((v64 * 0x1000 | v63 >> 52) & 0x3ffffff) + ((v67 * 0x1000 | v66 >> 52) & 0x3ffffff) * 0x100000000));
    v74 = __double_as_longlong(__longlong_as_double(((v64 * 0x4000000000000 | v64 >> 14) & 0xfffc000003ffffff & 0x3ffffff) + ((v67 * 0x4000000000000 | v67 >> 14) & 0xfffc000003ffffff & 0x3ffffff) * 0x100000000));
    v75 = __double_as_longlong(__longlong_as_double(v69 + (v64 >> 40) + (v69 + (v67 >> 40)) * 0x100000000));
    v76 = *a1;
    v77 = a1[1];
    v78 = a1 + 2;
    v79 = *v78;
    v80 = v78[1];
    v81 = v78 + 6;
    v82 = v70[3];
    v83 = v70[2];
    v84 = v70[1];
    v85 = *v70;
    v86 = v70 + 4;
    v87 = v86[3];
    v88 = v86[2];
    v89 = v86[1];
    v90 = *v86;
    v91 = v86[4];
    v92 = __double_as_longlong(__longlong_as_double((v76 & 0x3ffffff) + (v79 & 0x3ffffff) * 0x100000000));
    v93 = __double_as_longlong(__longlong_as_double(((v76 * 0x4000000000 | v76 >> 26) & 0xffffffc003ffffff & 0x3ffffff) + ((v79 * 0x4000000000 | v79 >> 26) & 0xffffffc003ffffff & 0x3ffffff) * 0x100000000));
    v94 = __double_as_longlong(__longlong_as_double(((v77 * 0x1000 | v76 >> 52) & 0x3ffffff) + ((v80 * 0x1000 | v79 >> 52) & 0x3ffffff) * 0x100000000));
    v95 = __double_as_longlong(__longlong_as_double(((v77 * 0x4000000000000 | v77 >> 14) & 0xfffc000003ffffff & 0x3ffffff) + ((v80 * 0x4000000000000 | v80 >> 14) & 0xfffc000003ffffff & 0x3ffffff) * 0x100000000));
    v96 = __double_as_longlong(__longlong_as_double(v69 + (v77 >> 40) + (v69 + (v80 >> 40)) * 0x100000000));
    v97 = _mm_srli_epi64(_mm_set1_epi64x(-1), 38);
    v98 = arm64g_calculate_condition(148, v38, 64, 0);
    v99 = v37;
    v100 = v71;
    v101 = v72;
    v102 = v73;
    v103 = v74;
    v104 = v75;
    if (!(v98 & 1))
    {
        do
        {
            v99 = v37 - 64;
            if (v37 < 64)
                v68 = &g_df6c00;
            v105 = *v68;
            v106 = v68[1];
            v107 = v68 + 2;
            v108 = *v107;
            v109 = v107[1];
            v68 = v107 + 6;
            v110 = _mm_add_epi64(_mm_add_epi64(MullV(_mm_cvtsi128_si64(v71), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v87, v87), _mm_unpackhi_epi64(v87, v87)))), MullV(_mm_cvtsi128_si64(v72), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v89, v89), _mm_unpackhi_epi64(v89, v89))))), MullV(_mm_cvtsi128_si64(v73), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v82, v82), _mm_unpackhi_epi64(v82, v82)))));
            v111 = _mm_add_epi64(_mm_add_epi64(MullV(_mm_cvtsi128_si64(v71), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v82, v82), _mm_unpackhi_epi64(v82, v82)))), MullV(_mm_cvtsi128_si64(v72), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v84, v84), _mm_unpackhi_epi64(v84, v84))))), MullV(_mm_cvtsi128_si64(v73), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v85, v85), _mm_unpackhi_epi64(v85, v85)))));
            v112 = _mm_add_epi64(_mm_add_epi64(MullV(_mm_cvtsi128_si64(v71), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v84, v84), _mm_unpackhi_epi64(v84, v84)))), MullV(_mm_cvtsi128_si64(v72), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v85, v85), _mm_unpackhi_epi64(v85, v85))))), MullV(_mm_cvtsi128_si64(v73), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v91, v91), _mm_unpackhi_epi64(v91, v91)))));
            v100 = __double_as_longlong(__longlong_as_double((v105 & 0x3ffffff) + (v108 & 0x3ffffff) * 0x100000000));
            v101 = __double_as_longlong(__longlong_as_double(((v105 * 0x4000000000 | v105 >> 26) & 0xffffffc003ffffff & 0x3ffffff) + ((v108 * 0x4000000000 | v108 >> 26) & 0xffffffc003ffffff & 0x3ffffff) * 0x100000000));
            v113 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v94, v49));
            v102 = __double_as_longlong(__longlong_as_double(((v106 * 0x1000 | v105 >> 52) & 0x3ffffff) + ((v109 * 0x1000 | v108 >> 52) & 0x3ffffff) * 0x100000000));
            v103 = __double_as_longlong(__longlong_as_double(((v106 * 0x4000000000000 | v106 >> 14) & 0xfffc000003ffffff & 0x3ffffff) + ((v109 * 0x4000000000000 | v109 >> 14) & 0xfffc000003ffffff & 0x3ffffff) * 0x100000000));
            v114 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v92, v47));
            v104 = __double_as_longlong(__longlong_as_double(v69 + (v106 >> 40) + (v69 + (v109 >> 40)) * 0x100000000));
            v115 = *v81;
            v116 = v81[1];
            v117 = v81 + 2;
            v118 = *v117;
            v119 = v117[1];
            v81 = v117 + 6;
            v120 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v93, v48));
            v121 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v95, v50));
            v92 = __double_as_longlong(__longlong_as_double((v115 & 0x3ffffff) + (v118 & 0x3ffffff) * 0x100000000));
            v122 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v96, v51));
            v93 = __double_as_longlong(__longlong_as_double(((v115 * 0x4000000000 | v115 >> 26) & 0xffffffc003ffffff & 0x3ffffff) + ((v118 * 0x4000000000 | v118 >> 26) & 0xffffffc003ffffff & 0x3ffffff) * 0x100000000));
            v123 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(MullV(_mm_cvtsi128_si64(v71), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v89, v89), _mm_unpackhi_epi64(v89, v89)))), MullV(_mm_cvtsi128_si64(v72), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v82, v82), _mm_unpackhi_epi64(v82, v82))))), MullV(_mm_cvtsi128_si64(v73), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v84, v84), _mm_unpackhi_epi64(v84, v84))))), MullV(_mm_cvtsi128_si64(v74), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v85, v85), _mm_unpackhi_epi64(v85, v85))))), MullV(_mm_cvtsi128_si64(v75), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v91, v91), _mm_unpackhi_epi64(v91, v91))))), MullV(v113, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), MullV(v114, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v89, v89), _mm_unpacklo_epi64(v89, v89))))), MullV(v120, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v82, v82), _mm_unpacklo_epi64(v82, v82))))), MullV(v121, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), MullV(v122, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91)))));
            v124 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(MullV(_mm_cvtsi128_si64(v71), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v85, v85), _mm_unpackhi_epi64(v85, v85)))), MullV(_mm_cvtsi128_si64(v72), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v91, v91), _mm_unpackhi_epi64(v91, v91))))), MullV(_mm_cvtsi128_si64(v73), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v88, v88), _mm_unpackhi_epi64(v88, v88))))), MullV(_mm_cvtsi128_si64(v74), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v90, v90), _mm_unpackhi_epi64(v90, v90))))), MullV(_mm_cvtsi128_si64(v75), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v83, v83), _mm_unpackhi_epi64(v83, v83))))), MullV(v113, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v88, v88), _mm_unpacklo_epi64(v88, v88))))), MullV(v114, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), MullV(v120, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), MullV(v121, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v90, v90), _mm_unpacklo_epi64(v90, v90))))), MullV(v122, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v83, v83), _mm_unpacklo_epi64(v83, v83)))));
            v94 = __double_as_longlong(__longlong_as_double(((v116 * 0x1000 | v115 >> 52) & 0x3ffffff) + ((v119 * 0x1000 | v118 >> 52) & 0x3ffffff) * 0x100000000));
            v95 = __double_as_longlong(__longlong_as_double(((v116 * 0x4000000000000 | v116 >> 14) & 0xfffc000003ffffff & 0x3ffffff) + ((v119 * 0x4000000000000 | v119 >> 14) & 0xfffc000003ffffff & 0x3ffffff) * 0x100000000));
            v96 = __double_as_longlong(__longlong_as_double(v69 + (v116 >> 40) + (v69 + (v119 >> 40)) * 0x100000000));
            v126 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v110, MullV(_mm_cvtsi128_si64(v74), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v84, v84), _mm_unpackhi_epi64(v84, v84))))), MullV(_mm_cvtsi128_si64(v75), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v85, v85), _mm_unpackhi_epi64(v85, v85))))), MullV(v113, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v82, v82), _mm_unpacklo_epi64(v82, v82))))), MullV(v114, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v87, v87), _mm_unpacklo_epi64(v87, v87))))), MullV(v120, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v89, v89), _mm_unpacklo_epi64(v89, v89))))), MullV(v121, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), MullV(v122, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), _mm_srli_epi64(v123, 26));
            v127 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(v123)) & CONCAT(0x3ffffff03ffffff, 0x3ffffff03ffffff));
            v128 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v112, MullV(_mm_cvtsi128_si64(v74), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v88, v88), _mm_unpackhi_epi64(v88, v88))))), MullV(_mm_cvtsi128_si64(v75), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v90, v90), _mm_unpackhi_epi64(v90, v90))))), MullV(v113, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), MullV(v114, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), MullV(v120, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), MullV(v121, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v88, v88), _mm_unpacklo_epi64(v88, v88))))), MullV(v122, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v90, v90), _mm_unpacklo_epi64(v90, v90))))), _mm_srli_epi64(v124, 26));
            v131 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(v126)) & CONCAT(0x3ffffff03ffffff, 0x3ffffff03ffffff));
            v132 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v111, MullV(_mm_cvtsi128_si64(v74), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v91, v91), _mm_unpackhi_epi64(v91, v91))))), MullV(_mm_cvtsi128_si64(v75), _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v88, v88), _mm_unpackhi_epi64(v88, v88))))), MullV(v113, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v85, v85))))), MullV(v114, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v82, v82), _mm_unpacklo_epi64(v82, v82))))), MullV(v120, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), MullV(v121, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v91, v91))))), MullV(v122, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v88, v88), _mm_unpacklo_epi64(v88, v88))))), _mm_srli_epi64(v128, 26));
            v135 = _mm_add_epi64(_mm_add_epi64(_mm_and_si128(v124, v97), _mm_srli_epi64(v126, 26)), _mm_slli_epi64(_mm_srli_epi64(v126, 26), 2));
            v136 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(v128)) & CONCAT(0x3ffffff03ffffff, 0x3ffffff03ffffff));
            v137 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v127, __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(v132, 26), _mm_srli_epi64(v132, 26)))));
            v49 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(v132)) & CONCAT(0x3ffffff03ffffff, 0x3ffffff03ffffff));
            v50 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v137, _mm_set1_epi32(0x3ffffff)));
            v47 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(v135)) & CONCAT(0x3ffffff03ffffff, 0x3ffffff03ffffff));
            v48 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v136, __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(v135, 26), _mm_srli_epi64(v135, 26)))));
            v51 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v131, __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_srli_epi32(v137, 26))));
            v141 = arm64g_calculate_condition(132, v37, 64, 0);
            v37 = v99;
            v71 = v100;
            v72 = v101;
            v73 = v102;
            v74 = v103;
            v75 = v104;
        } while (v141 & 1);
    }
    v142 = _mm_unpacklo_epi64(v102, v102);
    v143 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v94, v49));
    v144 = arm64g_calculate_condition(18, v99, 32, 0);
    if (!(v144 & 1))
    {
        v142 = _mm_unpacklo_epi64(v143, v143);
        v100 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v92, v47));
        v103 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v95, v50));
        v101 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v93, v48));
        v104 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v96, v51));
    }
    v145 = _mm_unpacklo_epi64(v100, v100);
    v146 = _mm_unpacklo_epi64(v101, v101);
    v147 = _mm_unpacklo_epi64(v103, v103);
    v148 = _mm_unpacklo_epi64(v104, v104);
    v149 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(MullV(_mm_extract_epi64(v142, 1), _mm_extract_epi64(v84, 1)), MullV(_mm_extract_epi64(v145, 1), _mm_extract_epi64(v89, 1))), MullV(_mm_extract_epi64(v146, 1), _mm_extract_epi64(v82, 1))), MullV(_mm_extract_epi64(v147, 1), _mm_extract_epi64(v85, 1))), MullV(_mm_extract_epi64(v148, 1), _mm_extract_epi64(v91, 1)));
    v150 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(MullV(_mm_extract_epi64(v142, 1), _mm_extract_epi64(v88, 1)), MullV(_mm_extract_epi64(v145, 1), _mm_extract_epi64(v85, 1))), MullV(_mm_extract_epi64(v146, 1), _mm_extract_epi64(v91, 1))), MullV(_mm_extract_epi64(v147, 1), _mm_extract_epi64(v90, 1))), MullV(_mm_extract_epi64(v148, 1), _mm_extract_epi64(v83, 1)));
    v151 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(MullV(_mm_extract_epi64(v142, 1), _mm_extract_epi64(v82, 1)), MullV(_mm_extract_epi64(v145, 1), _mm_extract_epi64(v87, 1))), MullV(_mm_extract_epi64(v146, 1), _mm_extract_epi64(v89, 1))), MullV(_mm_extract_epi64(v147, 1), _mm_extract_epi64(v84, 1))), MullV(_mm_extract_epi64(v148, 1), _mm_extract_epi64(v85, 1)));
    v152 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(MullV(_mm_extract_epi64(v142, 1), _mm_extract_epi64(v91, 1)), MullV(_mm_extract_epi64(v145, 1), _mm_extract_epi64(v84, 1))), MullV(_mm_extract_epi64(v146, 1), _mm_extract_epi64(v85, 1))), MullV(_mm_extract_epi64(v147, 1), _mm_extract_epi64(v88, 1))), MullV(_mm_extract_epi64(v148, 1), _mm_extract_epi64(v90, 1)));
    v153 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(MullV(_mm_extract_epi64(v142, 1), _mm_extract_epi64(v85, 1)), MullV(_mm_extract_epi64(v145, 1), _mm_extract_epi64(v82, 1))), MullV(_mm_extract_epi64(v146, 1), _mm_extract_epi64(v84, 1))), MullV(_mm_extract_epi64(v147, 1), _mm_extract_epi64(v91, 1))), MullV(_mm_extract_epi64(v148, 1), _mm_extract_epi64(v88, 1)));
    v154 = arm64g_calculate_condition(2, v99, 32, 0);
    if (!(v154 & 1))
    {
        v155 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v92, v47));
        v156 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v93, v48));
        v157 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v95, v50));
        v158 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v96, v51));
        v149 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v149, MullV(_mm_cvtsi128_si64(v143), _mm_cvtsi128_si64(v84))), MullV(v155, _mm_cvtsi128_si64(v89))), MullV(v156, _mm_cvtsi128_si64(v82))), MullV(v157, _mm_cvtsi128_si64(v85))), MullV(v158, _mm_cvtsi128_si64(v91)));
        v150 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v150, MullV(_mm_cvtsi128_si64(v143), _mm_cvtsi128_si64(v88))), MullV(v155, _mm_cvtsi128_si64(v85))), MullV(v156, _mm_cvtsi128_si64(v91))), MullV(v157, _mm_cvtsi128_si64(v90))), MullV(v158, _mm_cvtsi128_si64(v83)));
        v151 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v151, MullV(_mm_cvtsi128_si64(v143), _mm_cvtsi128_si64(v82))), MullV(v155, _mm_cvtsi128_si64(v87))), MullV(v156, _mm_cvtsi128_si64(v89))), MullV(v157, _mm_cvtsi128_si64(v84))), MullV(v158, _mm_cvtsi128_si64(v85)));
        v152 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v152, MullV(_mm_cvtsi128_si64(v143), _mm_cvtsi128_si64(v91))), MullV(v155, _mm_cvtsi128_si64(v84))), MullV(v156, _mm_cvtsi128_si64(v85))), MullV(v157, _mm_cvtsi128_si64(v88))), MullV(v158, _mm_cvtsi128_si64(v90)));
        v153 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v153, MullV(_mm_cvtsi128_si64(v143), _mm_cvtsi128_si64(v85))), MullV(v155, _mm_cvtsi128_si64(v82))), MullV(v156, _mm_cvtsi128_si64(v84))), MullV(v157, _mm_cvtsi128_si64(v91))), MullV(v158, _mm_cvtsi128_si64(v88)));
    }
    v159 = _mm_cvtsi128_si64(_mm_unpacklo_epi64(v149, v149)) + _mm_cvtsi128_si64(_mm_unpackhi_epi64(v149, v149));
    v160 = _mm_cvtsi128_si64(_mm_unpacklo_epi64(v150, v150)) + _mm_cvtsi128_si64(_mm_unpackhi_epi64(v150, v150));
    v161 = _mm_cvtsi128_si64(_mm_unpacklo_epi64(v151, v151)) + _mm_cvtsi128_si64(_mm_unpackhi_epi64(v151, v151)) + (v159 >> 26);
    v162 = _mm_cvtsi128_si64(_mm_unpacklo_epi64(v152, v152)) + _mm_cvtsi128_si64(_mm_unpackhi_epi64(v152, v152)) + (v160 >> 26);
    v163 = _mm_cvtsi128_si64(_mm_unpacklo_epi64(v153, v153)) + _mm_cvtsi128_si64(_mm_unpackhi_epi64(v153, v153)) + (v162 >> 26);
    v164 = _mm_cvtsi128_si64(_mm_and_si128(v160, v97)) + (v161 >> 26) + (v161 >> 26) * 4;
    v165 = _mm_cvtsi128_si64(_mm_and_si128(v159, v97)) + (v163 >> 26);
    *(int *)&a0[12] = _mm_cvtsi128_si32(_mm_and_si128(v165, v97));
    *(int *)&a0[8] = _mm_cvtsi128_si32(_mm_and_si128(v163, v97));
    *(unsigned int *)&a0[4] = _mm_cvtsi128_si64(_mm_and_si128(v162, v97)) + (v164 >> 26);
    *(int *)a0 = _mm_cvtsi128_si32(_mm_and_si128(v164, v97));
    *(unsigned int *)&a0[16] = _mm_cvtsi128_si64(_mm_and_si128(v161, v97)) + (v165 >> 26);
    return a0 + 16;
}
