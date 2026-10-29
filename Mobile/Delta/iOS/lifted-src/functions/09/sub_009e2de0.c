/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e2de0..0x9e3408 (1576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e2de0_2 {
    void* field_0;
    unsigned long long field_8;
} st_9e2de0_2;

typedef struct st_9e2de0_0 {
    unsigned long long field_0;
    uint128_t field_8;
} st_9e2de0_0;

typedef struct st_9e2de0_1 {
    struct st_9e2de0_0 *field_0;
    unsigned int field_8;
} st_9e2de0_1;


unsigned long long sub_9e2de0(long long a0, long long a1, st_9e2de0_1 *a2, long long a3)
{
    long long v12;  // x0
    long long v13;  // x22
    void* v22;  // x0
    unsigned long v112;  // x11
    unsigned long v113;  // 4110
    unsigned long long v114;  // 4129
    unsigned long v115;  // 4110
    unsigned long v116;  // cc_op
    unsigned long v117;  // cc_dep1
    unsigned long v118;  // cc_dep2
    unsigned long long v119;  // 4129
    unsigned long v120;  // x12
    unsigned long v121;  // 4110
    unsigned long long v23;  // x6
    unsigned long long v122;  // 4129
    unsigned long v123;  // 4110
    unsigned long v124;  // cc_op
    unsigned long v125;  // cc_dep1
    unsigned long v126;  // cc_dep2
    unsigned long long v127;  // 4129
    unsigned long v128;  // x13
    unsigned long v129;  // 4110
    unsigned long long v130;  // 4129
    unsigned long long v131;  // 4110
    unsigned long v24;  // x26
    unsigned long long v132;  // 4102
    unsigned long long v133;  // 4110
    unsigned long long v134;  // 4102
    uint128_t *iter;  // x9
    uint128_t *iter1;  // x10
    uint128_t *node;  // x11
    uint128_t *iter2;  // x12
    unsigned long long j;  // x13
    unsigned long long v140;  // x13
    uint128_t v141;  // q1
    unsigned long v25;  // cc_op
    uint128_t v142;  // q3
    uint128_t v143;  // q1
    uint128_t v144;  // q3
    unsigned long long i;  // x10
    unsigned long long v147;  // x13
    unsigned long long *v148;  // x9
    unsigned long long *v149;  // x11
    unsigned long long *v150;  // x12
    unsigned long long *v151;  // x13
    unsigned long v26;  // cc_dep1
    unsigned long long v152;  // x10
    unsigned long v156;  // x8
    unsigned long long v157;  // x8
    unsigned long long v158;  // x28
    unsigned long long v159;  // x8
    unsigned long v27;  // cc_dep2
    unsigned long long v162;  // x0
    unsigned long long v163;  // x20
    unsigned long v28;  // cc_ndep
    unsigned long v29;  // x7
    unsigned long long v30;  // x17
    unsigned long long v31;  // x25
    unsigned long long v14;  // w0
    unsigned long v32;  // x9
    void* v33;  // x10
    unsigned long v34;  // 4110
    unsigned long v35;  // cc_op
    unsigned long v36;  // cc_dep1
    unsigned long v37;  // cc_dep2
    unsigned long v38;  // 4110
    unsigned long long v39;  // 4115
    uint128_t *v40;  // x12
    uint128_t *v41;  // x13
    void* v15;  // x28
    unsigned long long v42;  // x8
    unsigned long long v43;  // x8
    unsigned long v44;  // x15
    unsigned long long v45;  // x14
    st_9e2de0_0 *v46;  // x16
    unsigned long long v47;  // x17
    unsigned long long idx;  // x2
    unsigned long v49;  // cc_dep1
    unsigned long long v50;  // x2
    uint128_t *v51;  // x4
    unsigned long long v16;  // w0
    void* v52;  // x1
    unsigned long v53;  // 4110
    unsigned long v54;  // cc_op
    unsigned long v55;  // cc_dep1
    unsigned long v56;  // cc_dep2
    unsigned long long v57;  // 4107
    unsigned long v58;  // 4110
    unsigned long long v59;  // 4107
    unsigned long long v60;  // x3
    unsigned long long v61;  // 4110
    unsigned long v17;  // x27
    unsigned long long v62;  // 4105
    unsigned long v63;  // x1
    unsigned long long v64;  // 4110
    unsigned long long v65;  // 4105
    __m128i v66;  // q2
    __m128i v67;  // q0
    uint128_t *v68;  // x15
    uint128_t *v69;  // x2
    uint128_t *v70;  // x1
    unsigned long long l;  // x17
    void* v18;  // x23
    unsigned long long v72;  // x17
    __m128i v73;  // q0
    __m128i v76;  // q2
    unsigned long long v79;  // x3
    unsigned long long *v80;  // x7
    unsigned long long *v81;  // x1
    unsigned long v19;  // x8
    unsigned long long k;  // x2
    unsigned long long *v83;  // x16
    unsigned long long v84;  // x17
    unsigned long v85;  // x15
    unsigned long long v86;  // x2
    unsigned long long v89;  // x2
    st_9e2de0_2 *v90;  // x1
    void* v20;  // x24
    unsigned long v92;  // cc_dep1
    unsigned long long v93;  // x9
    void* v94;  // x14
    unsigned long long v95;  // x15
    void* v96;  // x16
    void* v97;  // x12
    void* v98;  // x13
    unsigned long v99;  // 4110
    unsigned long v100;  // cc_op
    unsigned long v101;  // cc_dep1
    unsigned long long v21;  // x25
    unsigned long v102;  // cc_dep2
    unsigned long long v103;  // 4129
    unsigned long v104;  // x10
    unsigned long v105;  // 4110
    unsigned long long v106;  // 4129
    unsigned long v107;  // 4110
    unsigned long v108;  // cc_op
    unsigned long v109;  // cc_dep1
    unsigned long v110;  // cc_dep2
    unsigned long long v111;  // 4129
    unsigned long v0;  // [bp-0xb0]
    unsigned long v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0xa0]
    void* v3;  // [bp-0x98], Other Possible Types: unsigned long long
    void* v4;  // [bp-0x90]
    void* v5;  // [bp-0x88]
    st_9e2de0_2 *v6;  // [bp-0x80]
    st_9e2de0_2 *v7;  // [bp-0x78]
    unsigned long long v8;  // [bp-0x70]
    unsigned long v9;  // [bp-0x68], Other Possible Types: unsigned long long
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    sub_9de064(a3);
    v12 = sub_9de208(a3);
    if (v12)
    {
        v13 = v12;
        v14 = (unsigned int)sub_9e46a8(a2);
        if (v14 >= 2)
        {
            while (sub_9e9188(v13, v14 - 1, 0xffffffff, 0, 0, a3))
            {
                if (!sub_9e4828(v13) && sub_9e2c40(a0, a1, v13, a2, a3))
                {
                    sub_9de064(a3);
                    v7 = sub_9de208(a3);
                    v6 = sub_9de208(a3);
                    v15 = sub_9de208(a3);
                    v8 = sub_9de208(a3);
                    if (v8 && sub_9e203c(v15, a0, a2) && !sub_9e4828(v15) && sub_9e4c34(v8, a2))
                    {
                        v3 = (unsigned int)sub_9e46a8(v15);
                        v16 = (unsigned int)sub_9e46a8(v8);
                        v17 = a2->field_8;
                        if (sub_9e4cdc(v15, v17))
                        {
                            v9 = v16;
                            v18 = *(long long *)v15;
                            v19 = (int)v15[8];
                            if ((int)v17 > (int)v19)
                                _bzero(v18 + v19 * 8, (((v17 + ~(unsigned int)v19) * 8 | v17 + ~(unsigned int)v19 >> 61) & 0x7fffffff8 & 0x7ffffffff) + 8);
                            *(unsigned int *)&v15[8] = v17;
                            if (sub_9e4cdc(v7, v17))
                            {
                                v20 = v7->field_0;
                                *(unsigned long long *)v20 = 1;
                                if ((int)v17 >= 2)
                                    _bzero(v20 + 8, (((unsigned int)v17 - 1) * 8 | (unsigned int)v17 - 1 >> 61) & 0x7fffffff8 & 0x7ffffffff);
                                *(unsigned int *)&v7->field_8 = v17;
                                v21 = v9;
                                if (sub_9e4cdc(v6, v17))
                                {
                                    v22 = v6->field_0;
                                    v23 = v17 * 8;
                                    v24 = (unsigned int)v17 - 1;
                                    v25 = 3;
                                    v26 = v17 & 0xffffffff;
                                    v27 = 1;
                                    v28 = 0;
                                    v2 = v23;
                                    if ((int)v17 >= 1)
                                    {
                                        v4 = v15;
                                        _bzero(v22, v23);
                                        v15 = v4;
                                        v23 = v2;
                                        v21 = v9;
                                    }
                                    *(unsigned int *)&v6->field_8 = v17;
                                    v5 = *(long long *)v8;
                                    v1 = ((v24 * 8 | v24 >> 61) & 0x7fffffff8 & 0x7ffffffff) + 8;
                                    v29 = v24 & 0xfffffffe;
                                    v0 = v17 & 0x7ffffffc;
                                    v9 = v29;
                                    v30 = v3;
                                    while (1)
                                    {
                                        v31 = v21;
                                        if ((unsigned int)v30)
                                        {
                                            v32 = v18 + v1;
                                            v33 = v20 + v1;
                                            if (v18 < v33)
                                            {
                                                v34 = arm64g_calculate_condition(v25 | 48, v26, v27, v28);
                                                v35 = 4;
                                                v36 = (v34 & 1 ? v20 : 0x20000000);
                                                v37 = (v34 & 1 ? v32 : 0);
                                            }
                                            else
                                            {
                                                v38 = arm64g_calculate_condition(v25 | 48, v26, v27, v28);
                                                v35 = 0;
                                                v36 = (v38 & 1 ? v20 : 0x20000000);
                                                v37 = (v38 & 1 ? v32 : 0);
                                            }
                                            v39 = arm64g_calculate_condition(v35 | 32, v36, v37, 0);
                                            v40 = v18 + 8;
                                            v41 = v20 + 8;
                                            v42 = v30;
                                            do
                                            {
                                                v43 = v42;
                                                v44 = *(long long *)v18;
                                                if (v44 & 1)
                                                {
                                                    if ((int)v43 <= 64)
                                                        goto LABEL_9e31f0;
                                                    goto LABEL_9e31fc;
                                                }
                                                v45 = -(*(long long *)v20 & 1);
                                                v46 = a2->field_0;
                                                v47 = v46->field_0 & v45 ^ *(long long *)v20;
                                                if ((int)v17 < 2)
                                                {
                                                    idx = 0;
                                                    goto LABEL_9e3084;
                                                }
                                                v49 = v17 & 0xffffffff;
                                                if (5 > (unsigned int)v17)
                                                {
                                                    v50 = 0;
                                                    goto LABEL_9e30d4;
                                                }
                                                v50 = 0;
                                                v51 = &(&v46->field_0)[1];
                                                v52 = (char *)v46 + v1;
                                                if (v18 < v52)
                                                {
                                                    v53 = arm64g_calculate_condition(0x33, v49, 5, 0);
                                                    v54 = 4;
                                                    v55 = (v53 & 1 ? v51 : 0x20000000);
                                                    v56 = (v53 & 1 ? v32 : 0);
                                                    v57 = arm64g_calculate_condition(36, v55, v56, 0);
                                                    if (!(v57 & 1))
                                                        goto LABEL_9e314a;
                                                    goto LABEL_9e3149;
                                                }
                                                else
                                                {
                                                    v58 = arm64g_calculate_condition(0x33, v49, 5, 0);
                                                    v54 = 0;
                                                    v55 = (v58 & 1 ? v51 : 0x20000000);
                                                    v56 = (v58 & 1 ? v32 : 0);
                                                    v59 = arm64g_calculate_condition(32, v55, v56, 0);
                                                    if (v59 & 1)
                                                    {
LABEL_9e3149:
                                                        v60 = !(v39 & 1);
                                                        goto LABEL_9e314c;
                                                    }
                                                    else
                                                    {
LABEL_9e314a:
                                                        v60 = 1;
LABEL_9e314c:
                                                        if (v20 < v52)
                                                        {
                                                            v61 = arm64g_calculate_condition(v54 | 48, v55, v56, 0);
                                                            v62 = arm64g_calculate_condition(36, (v61 & 1 ? v51 : 0x20000000), (v61 & 1 ? v33 : 0), 0);
                                                            v63 = !(v62 & 1);
                                                            if (v60 & 1)
                                                                goto LABEL_9e30d4;
                                                        }
                                                        else
                                                        {
                                                            v64 = arm64g_calculate_condition(v54 | 48, v55, v56, 0);
                                                            v65 = arm64g_calculate_condition(32, (v64 & 1 ? v51 : 0x20000000), (v64 & 1 ? v33 : 0), 0);
                                                            v63 = !(v65 & 1);
                                                            if (v60 & 1)
                                                                goto LABEL_9e30d4;
                                                        }
                                                        if (!(v63 & 1))
                                                        {
                                                            v66 = (__m128i)(CONCAT(v47, v47));
                                                            v67 = (__m128i)(CONCAT(v44, v44));
                                                            v68 = &(&v46->field_0)[1];
                                                            v69 = v41;
                                                            v70 = v40;
                                                            l = v29;
                                                            do
                                                            {
                                                                v72 = l;
                                                                v73 = *v70;
                                                                *(uint128_t *)((char *)v70 - 8) = _mm_add_epi64(_mm_slli_epi64(v73, 63), _mm_srli_epi64(__dirty_unsupported_Iop_SliceV128(v73, v67, 8), 1));
                                                                v76 = _mm_xor_si128(*v69, _mm_and_si128(*v68, CONCAT(v45, v45)));
                                                                *(uint128_t *)((char *)v69 - 8) = _mm_add_epi64(_mm_slli_epi64(v76, 63), _mm_srli_epi64(__dirty_unsupported_Iop_SliceV128(v76, v66, 8), 1));
                                                                v70 += 1;
                                                                v69 += 1;
                                                                l = v72 - 2;
                                                                v68 += 1;
                                                                v66 = v76;
                                                                v67 = v73;
                                                            } while (l);
                                                            v47 = _mm_extract_epi64(v76, 1);
                                                            v44 = _mm_extract_epi64(v73, 1);
                                                            if (v29 == v24)
                                                            {
                                                                idx = v24;
                                                                continue;
                                                            }
                                                            else
                                                            {
                                                                v50 = v29;
                                                            }
                                                        }
LABEL_9e30d4:
                                                        v79 = v50 * 8;
                                                        v80 = (char *)v41 + v79;
                                                        v81 = (char *)v40 + v79;
                                                        k = v24 - v50;
                                                        v83 = (char *)v46 + v79 + 8;
                                                        v84 = v47;
                                                        v85 = v44;
                                                        do
                                                        {
                                                            v86 = k;
                                                            v44 = *v81;
                                                            *(unsigned long *)((char *)v81 - 8) = v44 * 0x8000000000000000 | v85 >> 1;
                                                            v47 = *v83 & v45 ^ *v80;
                                                            *(unsigned long long *)((char *)v80 - 8) = v47 * 0x8000000000000000 | v84 >> 1;
                                                            v80 += 1;
                                                            v81 += 1;
                                                            k = v86 - 1;
                                                            v84 = v47;
                                                            v85 = v44;
                                                            v83 += 1;
                                                        } while (k);
                                                        idx = v24;
                                                        v29 = v9;
                                                    }
                                                }
LABEL_9e3084:
                                                *(unsigned long *)((char *)v18 + 8 * idx) = v44 >> 1;
                                                *(unsigned long long *)((char *)v20 + 8 * idx) = v47 >> 1;
                                                v42 = (unsigned int)v43 - 1;
                                            } while ((unsigned int)v43 != 1);
                                        }
                                        v43 = 0;
                                        v44 = *(long long *)v18;
LABEL_9e31f0:
                                        if (!v44)
                                            break;
                                        if (v44 == 1)
                                        {
                                            sub_9e5708(v7);
                                            v162 = sub_9e4c34(a0, v7);
                                            sub_9de17c(a3);
                                            if (v162)
                                            {
                                                v163 = sub_9e2c40(a0, a0, v13, a2, a3) != 0;
                                                sub_9de17c(a3);
                                                return v163;
                                            }
                                            sub_9de17c(a3);
                                            return 0;
                                        }
LABEL_9e31fc:
                                        if ((int)v31 > (int)v43)
                                        {
                                            v18 = v5;
                                            v30 = v31;
                                            v89 = v43;
                                            v20 = v22;
                                            v90 = v7;
                                            v22 = v90->field_0;
                                            v7 = v6;
                                            v8 = v15;
                                            v5 = *(long long *)v15;
                                            v6 = v90;
                                        }
                                        else
                                        {
                                            v30 = v43;
                                            v89 = v31;
                                        }
                                        if ((int)v17 >= 1)
                                        {
                                            v92 = v17 & 0xffffffff;
                                            if (6 > (unsigned int)v17)
                                            {
                                                v93 = 0;
                                                goto LABEL_9e3254;
                                            }
                                            v93 = 0;
                                            v94 = v18 + v23;
                                            v95 = v20 + v23;
                                            v96 = v5;
                                            v97 = v96 + v23;
                                            v98 = v22 + v23;
                                            if (v18 < v97)
                                            {
                                                v99 = arm64g_calculate_condition(0x33, v92, 6, 0);
                                                v100 = 4;
                                                v101 = (v99 & 1 ? v96 : 0x20000000);
                                                v102 = (v99 & 1 ? v94 : 0);
                                                v103 = arm64g_calculate_condition(36, v101, v102, 0);
                                                v104 = !(v103 & 1);
                                                if (v18 >= v98)
                                                    goto LABEL_9e3316;
                                            }
                                            else
                                            {
                                                v105 = arm64g_calculate_condition(0x33, v92, 6, 0);
                                                v100 = 0;
                                                v101 = (v105 & 1 ? v96 : 0x20000000);
                                                v102 = (v105 & 1 ? v94 : 0);
                                                v106 = arm64g_calculate_condition(32, v101, v102, 0);
                                                v104 = !(v106 & 1);
                                                if (v18 >= v98)
                                                {
LABEL_9e3316:
                                                    v113 = arm64g_calculate_condition(v100 | 48, v101, v102, 0);
                                                    v108 = 0;
                                                    v109 = (v113 & 1 ? v22 : 0x20000000);
                                                    v110 = (v113 & 1 ? v94 : 0);
                                                    v114 = arm64g_calculate_condition(32, v109, v110, 0);
                                                    v112 = !(v114 & 1);
                                                    if (v20 >= v97)
                                                    {
LABEL_9e3322:
                                                        v121 = arm64g_calculate_condition(v108 | 48, v109, v110, 0);
                                                        v116 = 0;
                                                        v117 = (v121 & 1 ? v96 : 0x20000000);
                                                        v118 = (v121 & 1 ? v95 : 0);
                                                        v122 = arm64g_calculate_condition(32, v117, v118, 0);
                                                        v120 = !(v122 & 1);
                                                        if (v20 >= v98)
                                                        {
LABEL_9e332e:
                                                            v129 = arm64g_calculate_condition(v116 | 48, v117, v118, 0);
                                                            v124 = 0;
                                                            v125 = (v129 & 1 ? v22 : 0x20000000);
                                                            v126 = (v129 & 1 ? v95 : 0);
                                                            v130 = arm64g_calculate_condition(32, v125, v126, 0);
                                                            v128 = !(v130 & 1);
                                                            if (v20 >= v94)
                                                            {
LABEL_9e333a:
                                                                v133 = arm64g_calculate_condition(v124 | 48, v125, v126, 0);
                                                                v134 = arm64g_calculate_condition(48, (v133 & 1 ? v18 : 0x20000000), (v133 & 1 ? v95 : 0), 0);
                                                                if (v134 & 1)
                                                                    goto LABEL_9e3254;
LABEL_9e3340:
                                                                if (!(v104 & 1) && !(v112 & 1) && !(v120 & 1) && !(v128 & 1))
                                                                {
                                                                    iter = v5 + 16;
                                                                    iter1 = v20 + 16;
                                                                    node = v18 + 16;
                                                                    iter2 = v22 + 16;
                                                                    j = v0;
                                                                    do
                                                                    {
                                                                        v140 = j;
                                                                        v141 = *iter;
                                                                        v142 = *node;
                                                                        *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)iter - 16) ^ *(int128_t *)((char *)node - 16);
                                                                        *node = v141 ^ v142;
                                                                        v143 = *iter2;
                                                                        v144 = *iter1;
                                                                        iter += 2;
                                                                        *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)iter2 - 16) ^ *(int128_t *)((char *)iter1 - 16);
                                                                        *iter1 = v143 ^ v144;
                                                                        iter1 += 2;
                                                                        node += 2;
                                                                        iter2 += 2;
                                                                        j = v140 - 4;
                                                                    } while (j);
                                                                    v93 = v0;
                                                                    if (v0 == v17)
                                                                        goto LABEL_9e3298;
                                                                }
LABEL_9e3254:
                                                                i = v17 - v93;
                                                                v147 = v93 * 8;
                                                                v148 = v20 + v147;
                                                                v149 = v22 + v147;
                                                                v150 = v18 + v147;
                                                                v151 = v5 + v147;
                                                                do
                                                                {
                                                                    v152 = i;
                                                                    *v150 = *v150 ^ *v151;
                                                                    v150 += 1;
                                                                    *v148 = *v148 ^ *v149;
                                                                    v148 += 1;
                                                                    i = v152 - 1;
                                                                    v149 += 1;
                                                                    v151 += 1;
                                                                } while (i);
                                                                goto LABEL_9e3298;
                                                            }
LABEL_9e3339:
                                                            v131 = arm64g_calculate_condition(v124 | 48, v125, v126, 0);
                                                            v132 = arm64g_calculate_condition(52, (v131 & 1 ? v18 : 0x20000000), (v131 & 1 ? v95 : 0), 0);
                                                            if (v132 & 1)
                                                                goto LABEL_9e3254;
                                                            goto LABEL_9e3340;
                                                        }
LABEL_9e332d:
                                                        v123 = arm64g_calculate_condition(v116 | 48, v117, v118, 0);
                                                        v124 = 4;
                                                        v125 = (v123 & 1 ? v22 : 0x20000000);
                                                        v126 = (v123 & 1 ? v95 : 0);
                                                        v127 = arm64g_calculate_condition(36, v125, v126, 0);
                                                        v128 = !(v127 & 1);
                                                        if (v20 >= v94)
                                                            goto LABEL_9e333a;
                                                        goto LABEL_9e3339;
                                                    }
LABEL_9e3321:
                                                    v115 = arm64g_calculate_condition(v108 | 48, v109, v110, 0);
                                                    v116 = 4;
                                                    v117 = (v115 & 1 ? v96 : 0x20000000);
                                                    v118 = (v115 & 1 ? v95 : 0);
                                                    v119 = arm64g_calculate_condition(36, v117, v118, 0);
                                                    v120 = !(v119 & 1);
                                                    if (v20 >= v98)
                                                        goto LABEL_9e332e;
                                                    goto LABEL_9e332d;
                                                }
                                            }
                                            v107 = arm64g_calculate_condition(v100 | 48, v101, v102, 0);
                                            v108 = 4;
                                            v109 = (v107 & 1 ? v22 : 0x20000000);
                                            v110 = (v107 & 1 ? v94 : 0);
                                            v111 = arm64g_calculate_condition(36, v109, v110, 0);
                                            v112 = !(v111 & 1);
                                            if (v20 >= v97)
                                                goto LABEL_9e3322;
                                            goto LABEL_9e3321;
                                        }
                                        else
                                        {
LABEL_9e3298:
                                            v25 = 3;
                                            v26 = v31 & 0xffffffff;
                                            v27 = v43 & 0xffffffff;
                                            v28 = 0;
                                            v21 = v89;
                                            if ((unsigned int)v31 == (unsigned int)v43)
                                            {
                                                v21 = v89;
                                                v3 = v22;
                                                v4 = v15;
                                                v156 = ((int)v30 < 1 ? (unsigned int)v30 + 62 : (unsigned int)v30 - 1);
                                                v157 = (long long)(v156 * 0x100000000) >> 63 & 0xfffffffffc000000 | __ROL__(v156, 58) & 0xfc00000003ffffff & 0x3ffffff;
                                                v158 = ~((int)((unsigned int)v156) >> 6) * 64;
                                                do
                                                {
                                                    v159 = v157;
                                                    v158 = (unsigned int)v158 + 64;
                                                } while (v159 >= 1 && (v157 = v159 - 1, !*(long long *)((char *)v18 + 8 * v159)));
                                                v30 = sub_9e4630(*(long long *)((char *)v18 + 8 * v159)) - v158;
                                                v23 = v2;
                                                v22 = v3;
                                                v15 = v4;
                                                v29 = v9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    sub_9de17c(a3);
                    break;
                }
            }
        }
    }
    sub_9de17c(a3);
    return 0;
}
