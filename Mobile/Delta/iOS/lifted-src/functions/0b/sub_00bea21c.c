/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbea21c..0xbea8ec (1744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bea21c_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    void* field_58;
    unsigned long long field_60;
} st_bea21c_0;

extern long long g_efa788;
extern long long g_efa7a0;
extern long long g_efa7b8;
extern long long g_efa7e8;

void sub_bea21c(st_bea21c_0 *a0, unsigned long a1, unsigned long a2, void* a3, unsigned long long a4)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x26
    unsigned int v12;  // w12
    uint128_t v102;  // q0
    unsigned long v104;  // d0
    unsigned long long j;  // x9
    void* v106;  // x8
    unsigned long long v107;  // x9
    void* v108;  // x8
    unsigned long long v110;  // x9
    unsigned long long v111;  // x10
    unsigned int v13;  // w13
    unsigned long long v112;  // x8
    unsigned long long v113;  // x11
    unsigned long long v114;  // x9
    unsigned long long v115;  // x10
    unsigned long long v116;  // x12
    unsigned long long v117;  // x0
    unsigned int v118;  // w13
    unsigned int v119;  // w8
    unsigned long long v120;  // x14
    unsigned long long v121;  // x16
    unsigned long long v14;  // x14
    unsigned long v122;  // cc_dep1
    unsigned long v123;  // cc_dep2
    unsigned long long v124;  // x16
    unsigned long long v125;  // 4105
    unsigned long long v126;  // 4105
    unsigned long long v127;  // x11
    unsigned long v128;  // cc_dep1
    unsigned long v129;  // cc_dep2
    unsigned long long v130;  // x8
    unsigned long long v131;  // 4104
    unsigned long long v15;  // x16
    unsigned long long v132;  // 4104
    unsigned long long v133;  // x13
    unsigned long long v134;  // 4106
    unsigned long long v135;  // 4106
    unsigned long long v136;  // x16
    unsigned long long v137;  // 4105
    unsigned long long v138;  // 4105
    unsigned long long v139;  // x17
    unsigned long long v140;  // 4105
    unsigned long long v141;  // 4105
    unsigned long v16;  // cc_dep1
    unsigned long long v142;  // 4104
    unsigned long long v143;  // 4104
    unsigned long long v144;  // 4106
    unsigned long long v145;  // 4106
    unsigned long long v146;  // 4105
    unsigned long long v147;  // 4105
    unsigned long long v148;  // x11
    unsigned long long v149;  // x10
    unsigned long long v150;  // x12
    unsigned long long v151;  // x13
    unsigned long v17;  // cc_dep2
    unsigned int v152;  // w14
    unsigned int v153;  // w8
    unsigned long long v154;  // x15
    unsigned long long v155;  // x17
    unsigned long v156;  // cc_dep1
    unsigned long v157;  // cc_dep2
    unsigned long long v158;  // x17
    unsigned long long v159;  // 4105
    unsigned long long v160;  // 4105
    unsigned long long v161;  // x11
    unsigned long long v18;  // x16
    unsigned long v162;  // cc_dep1
    unsigned long v163;  // cc_dep2
    unsigned long long v164;  // x8
    unsigned long long v165;  // 4104
    unsigned long long v166;  // 4104
    unsigned long long v167;  // x14
    unsigned long long v168;  // 4106
    unsigned long long v169;  // 4106
    unsigned long long v170;  // x17
    unsigned long long v171;  // 4105
    unsigned long long v19;  // 4105
    unsigned long long v172;  // 4105
    unsigned long long v173;  // x0
    unsigned long long v174;  // 4105
    unsigned long long v175;  // 4105
    unsigned long long v176;  // 4104
    unsigned long long v177;  // 4104
    unsigned long long v178;  // 4106
    unsigned long long v179;  // 4106
    unsigned long long v180;  // 4105
    unsigned long long v181;  // 4105
    unsigned long long v20;  // 4105
    unsigned long long v21;  // x10
    unsigned long long v4;  // x8
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    unsigned long long v24;  // x12
    unsigned long long v25;  // 4105
    unsigned long long v26;  // 4105
    unsigned long long v27;  // x9
    unsigned long long v28;  // 4104
    unsigned long long v29;  // 4104
    unsigned long long v30;  // x13
    unsigned long long v31;  // 4106
    unsigned long long v5;  // x10
    unsigned long long v32;  // 4106
    unsigned long long v33;  // 4105
    unsigned long long v34;  // 4105
    unsigned long long v35;  // x8
    unsigned long long v36;  // 4105
    unsigned long long v37;  // 4105
    unsigned long long v38;  // 4104
    unsigned long long v39;  // 4104
    unsigned long long v40;  // 4106
    unsigned long long v41;  // 4106
    unsigned long long v6;  // x9
    unsigned long long v42;  // x12
    unsigned long long k;  // x14
    unsigned long long v44;  // x13
    unsigned int v45;  // w14
    unsigned int v46;  // w15
    unsigned long long v47;  // x16
    unsigned long long v48;  // x0
    unsigned long v49;  // cc_dep1
    unsigned long v50;  // cc_dep2
    unsigned long long v51;  // x0
    unsigned long long v7;  // x11
    unsigned long long v52;  // 4105
    unsigned long long v53;  // 4105
    unsigned long long v54;  // x12
    unsigned long v55;  // cc_dep1
    unsigned long v56;  // cc_dep2
    unsigned long long v57;  // x14
    unsigned long long v58;  // 4105
    unsigned long long v59;  // 4105
    unsigned long long v60;  // x11
    unsigned long long v61;  // 4104
    unsigned long long v8;  // x10
    unsigned long long v62;  // 4104
    unsigned long long v63;  // x15
    unsigned long long v64;  // 4106
    unsigned long long v65;  // 4106
    unsigned long long v66;  // 4105
    unsigned long long v67;  // 4105
    unsigned long long v68;  // x10
    unsigned long long v69;  // 4105
    unsigned long long v70;  // 4105
    unsigned long long v71;  // 4104
    unsigned long long v9;  // x12
    unsigned long long v72;  // 4104
    unsigned long long v73;  // 4106
    unsigned long long v74;  // 4106
    unsigned long v75;  // cc_dep1
    unsigned long v76;  // cc_dep2
    unsigned long long v77;  // x24
    unsigned long long v78;  // 4105
    unsigned long long v79;  // 4105
    unsigned long long v80;  // x27
    unsigned long long v81;  // 4107
    unsigned long long v10;  // x11
    unsigned long long v82;  // x8
    unsigned long long v83;  // x11
    void* v84;  // x9
    unsigned long long v85;  // q0
    __m128i v86;  // q1
    uint128_t v87;  // q2
    unsigned long long i;  // x10
    unsigned long long v89;  // q3
    unsigned long long v90;  // q4
    unsigned long long v91;  // q5
    unsigned long long v11;  // x0
    unsigned long long v92;  // x10
    __m128i v93;  // q6
    __m128i v95;  // q6
    __m128i v96;  // q7
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a4;
    v3 = a4 - 1;
    if (a4 != 1)
    {
        v8 = 0;
        v4 = 0;
        v6 = 1;
        v9 = 1;
        v10 = 1;
        while (1)
        {
            v11 = v4 + v8;
            if (v2 <= v11)
                break;
            v12 = *((char *)a3 + v9);
            v13 = *((char *)a3 + v11);
            v14 = v10 + v8;
            v15 = v8 + 1;
            v16 = v15;
            v17 = v6;
            if (v15 == v6)
            {
                v18 = 0;
                v19 = arm64g_calculate_condition(20, v16, v17, 0);
                if (!(v19 & 1))
                    goto LABEL_bea2aa;
                goto LABEL_bea2a9;
            }
            else
            {
                v18 = v8 + 1;
                v20 = arm64g_calculate_condition(20, v16, v17, 0);
                if (v20 & 1)
                {
LABEL_bea2a9:
                    v21 = 0;
                    goto LABEL_bea2ac;
                }
                else
                {
LABEL_bea2aa:
                    v21 = v8 + 1;
LABEL_bea2ac:
                    v22 = v12 & 0xff;
                    v23 = v13 & 0xff;
                    if (v12 == v13)
                    {
                        v24 = v4;
                        v25 = arm64g_calculate_condition(3, v22, v23, 0);
                        if (!(v25 & 1))
                            goto LABEL_bea2ba;
                        goto LABEL_bea2b9;
                    }
                    else
                    {
                        v24 = v10;
                        v26 = arm64g_calculate_condition(3, v22, v23, 0);
                        if (v26 & 1)
                        {
LABEL_bea2b9:
                            v27 = v6;
                            v28 = arm64g_calculate_condition(3, v22, v23, 0);
                            if (!(v28 & 1))
                                goto LABEL_bea2be;
                            goto LABEL_bea2bd;
                        }
                        else
                        {
LABEL_bea2ba:
                            v27 = 1;
                            v29 = arm64g_calculate_condition(3, v22, v23, 0);
                            if (v29 & 1)
                            {
LABEL_bea2bd:
                                v30 = v18;
                                v31 = arm64g_calculate_condition(3, v22, v23, 0);
                                if (!(v31 & 1))
                                    goto LABEL_bea2c2;
                                goto LABEL_bea2c1;
                            }
                            else
                            {
LABEL_bea2be:
                                v30 = 0;
                                v32 = arm64g_calculate_condition(3, v22, v23, 0);
                                if (v32 & 1)
                                {
LABEL_bea2c1:
                                    v10 += v21;
                                    v33 = arm64g_calculate_condition(0x33, v22, v23, 0);
                                    if (!(v33 & 1))
                                        goto LABEL_bea2c6;
                                    goto LABEL_bea2c5;
                                }
                                else
                                {
LABEL_bea2c2:
                                    v10 += 1;
                                    v34 = arm64g_calculate_condition(0x33, v22, v23, 0);
                                    if (v34 & 1)
                                    {
LABEL_bea2c5:
                                        v35 = v4;
                                        v36 = arm64g_calculate_condition(0x33, v22, v23, 0);
                                        if (!(v36 & 1))
                                            goto LABEL_bea2ca;
                                        goto LABEL_bea2c9;
                                    }
                                    else
                                    {
LABEL_bea2c6:
                                        v35 = v24;
                                        v37 = arm64g_calculate_condition(0x33, v22, v23, 0);
                                        if (v37 & 1)
                                        {
LABEL_bea2c9:
                                            v6 = v14 + 1 - v4;
                                            v38 = arm64g_calculate_condition(0x33, v22, v23, 0);
                                            if (!(v38 & 1))
                                                goto LABEL_bea2ce;
                                            goto LABEL_bea2cd;
                                        }
                                        else
                                        {
LABEL_bea2ca:
                                            v6 = v27;
                                            v39 = arm64g_calculate_condition(0x33, v22, v23, 0);
                                            if (v39 & 1)
                                            {
LABEL_bea2cd:
                                                v8 = 0;
                                                v40 = arm64g_calculate_condition(35, v22, v23, 0);
                                                if (!(v40 & 1))
                                                    goto LABEL_bea2d2;
                                                goto LABEL_bea2d1;
                                            }
                                            else
                                            {
LABEL_bea2ce:
                                                v8 = v30;
                                                v41 = arm64g_calculate_condition(35, v22, v23, 0);
                                                if (v41 & 1)
                                                {
LABEL_bea2d1:
                                                    goto LABEL_bea2d4;
                                                }
                                                else
                                                {
LABEL_bea2d2:
                                                    v10 = v14 + 1;
LABEL_bea2d4:
                                                    v4 = v35;
                                                    v9 = v10 + v8;
                                                    if (v9 >= v2)
                                                    {
                                                        v42 = 0;
                                                        v5 = 0;
                                                        v7 = 1;
                                                        k = 1;
                                                        v44 = 1;
                                                        do
                                                        {
                                                            v11 = v5 + v42;
                                                            if (v2 <= v11)
                                                                goto LABEL_bea8b8;
                                                            v45 = *((char *)a3 + k);
                                                            v46 = *((char *)a3 + v11);
                                                            v47 = v44 + v42;
                                                            v48 = v42 + 1;
                                                            v49 = v48;
                                                            v50 = v7;
                                                            if (v48 == v7)
                                                            {
                                                                v51 = 0;
                                                                v52 = arm64g_calculate_condition(20, v49, v50, 0);
                                                                if (!(v52 & 1))
                                                                    goto LABEL_bea322;
                                                                goto LABEL_bea321;
                                                            }
                                                            else
                                                            {
                                                                v51 = v42 + 1;
                                                                v53 = arm64g_calculate_condition(20, v49, v50, 0);
                                                                if (v53 & 1)
                                                                {
LABEL_bea321:
                                                                    v54 = 0;
                                                                    goto LABEL_bea324;
                                                                }
                                                                else
                                                                {
LABEL_bea322:
                                                                    v54 = v42 + 1;
LABEL_bea324:
                                                                    v55 = v45 & 0xff;
                                                                    v56 = v46 & 0xff;
                                                                    if (v45 == v46)
                                                                    {
                                                                        v57 = v5;
                                                                        v58 = arm64g_calculate_condition(3, v55, v56, 0);
                                                                        if (!(v58 & 1))
                                                                            goto LABEL_bea332;
                                                                        goto LABEL_bea331;
                                                                    }
                                                                    else
                                                                    {
                                                                        v57 = v44;
                                                                        v59 = arm64g_calculate_condition(3, v55, v56, 0);
                                                                        if (v59 & 1)
                                                                        {
LABEL_bea331:
                                                                            v60 = v7;
                                                                            v61 = arm64g_calculate_condition(3, v55, v56, 0);
                                                                            if (!(v61 & 1))
                                                                                goto LABEL_bea336;
                                                                            goto LABEL_bea335;
                                                                        }
                                                                        else
                                                                        {
LABEL_bea332:
                                                                            v60 = 1;
                                                                            v62 = arm64g_calculate_condition(3, v55, v56, 0);
                                                                            if (v62 & 1)
                                                                            {
LABEL_bea335:
                                                                                v63 = v51;
                                                                                v64 = arm64g_calculate_condition(3, v55, v56, 0);
                                                                                if (!(v64 & 1))
                                                                                    goto LABEL_bea33a;
                                                                                goto LABEL_bea339;
                                                                            }
                                                                            else
                                                                            {
LABEL_bea336:
                                                                                v63 = 0;
                                                                                v65 = arm64g_calculate_condition(3, v55, v56, 0);
                                                                                if (v65 & 1)
                                                                                {
LABEL_bea339:
                                                                                    v44 += v54;
                                                                                    v66 = arm64g_calculate_condition(131, v55, v56, 0);
                                                                                    if (!(v66 & 1))
                                                                                        goto LABEL_bea33e;
                                                                                    goto LABEL_bea33d;
                                                                                }
                                                                                else
                                                                                {
LABEL_bea33a:
                                                                                    v44 += 1;
                                                                                    v67 = arm64g_calculate_condition(131, v55, v56, 0);
                                                                                    if (v67 & 1)
                                                                                    {
LABEL_bea33d:
                                                                                        v68 = v5;
                                                                                        v69 = arm64g_calculate_condition(131, v55, v56, 0);
                                                                                        if (!(v69 & 1))
                                                                                            goto LABEL_bea342;
                                                                                        goto LABEL_bea341;
                                                                                    }
                                                                                    else
                                                                                    {
LABEL_bea33e:
                                                                                        v68 = v57;
                                                                                        v70 = arm64g_calculate_condition(131, v55, v56, 0);
                                                                                        if (v70 & 1)
                                                                                        {
LABEL_bea341:
                                                                                            v7 = v47 + 1 - v5;
                                                                                            v71 = arm64g_calculate_condition(131, v55, v56, 0);
                                                                                            if (!(v71 & 1))
                                                                                                goto LABEL_bea346;
                                                                                            goto LABEL_bea345;
                                                                                        }
                                                                                        else
                                                                                        {
LABEL_bea342:
                                                                                            v7 = v60;
                                                                                            v72 = arm64g_calculate_condition(131, v55, v56, 0);
                                                                                            if (v72 & 1)
                                                                                            {
LABEL_bea345:
                                                                                                v42 = 0;
                                                                                                v73 = arm64g_calculate_condition(147, v55, v56, 0);
                                                                                                if (!(v73 & 1))
                                                                                                    goto LABEL_bea34a;
                                                                                                goto LABEL_bea349;
                                                                                            }
                                                                                            else
                                                                                            {
LABEL_bea346:
                                                                                                v42 = v63;
                                                                                                v74 = arm64g_calculate_condition(147, v55, v56, 0);
                                                                                                if (v74 & 1)
                                                                                                {
LABEL_bea349:
                                                                                                    continue;
                                                                                                }
                                                                                                else
                                                                                                {
LABEL_bea34a:
                                                                                                    v44 = v47 + 1;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            v5 = v68;
                                                            k = v44 + v42;
                                                        } while (k < v2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        goto LABEL_bea8b8;
    }
    v4 = 0;
    v5 = 0;
    v6 = 1;
    v7 = 1;
    v75 = v4;
    v76 = v5;
    if (v5 < v4)
    {
        v77 = v4;
        v78 = arm64g_calculate_condition(132, v75, v76, 0);
        if (!(v78 & 1))
            goto LABEL_bea362;
LABEL_bea361:
    }
    else
    {
        v77 = v5;
        v79 = arm64g_calculate_condition(132, v75, v76, 0);
        if (v79 & 1)
            goto LABEL_bea361;
LABEL_bea362:
        v6 = v7;
    }
    v80 = v2 - v77;
    if (v2 < v77)
    {
        sub_c73bb0(0, v77, v2, &g_efa7e8);
LABEL_bea8a4:
        v11 = sub_c73bb0(v6);
LABEL_bea8b8:
        v117 = sub_c73c94(v11, v2, &g_efa788);
LABEL_bea8c8:
        sub_c73c94(v117, v2, &g_efa7a0);
LABEL_bea8d8:
        sub_c73c94(v4, v2, &g_efa7b8);
    }
    v81 = arm64g_calculate_condition(0x22, v6, v77, 0);
    if (v81 & 1 || v2 < v6 + v77)
        goto LABEL_bea8a4;
    if (_memcmp(a3, a3 + v6, v77))
    {
        if (8 > v2)
        {
            v82 = 0;
            v83 = 0;
        }
        else
        {
            v82 = v2 & 24;
            v84 = a3 + 4;
            v85 = 0;
            v86 = _mm_set1_epi64x(0xff);
            v87 = CONCAT(1, 1);
            i = v2 & 24;
            v89 = 0;
            v90 = 0;
            v91 = 0;
            do
            {
                v92 = i;
                v93 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(unsigned int *)&*(float *)((char *)v84 - 4)), 8), _mm_set1_epi32(0xff3fff3f)));
                v95 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v93), 16);
                v96 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(unsigned int *)&*(float *)v84), 8), _mm_set1_epi32(0xff3fff3f)))), 16);
                v90 |= __dirty_unsupported_Iop_Sh64Ux2(v87, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v95), 32), v86));
                v89 |= __dirty_unsupported_Iop_Sh64Ux2(v87, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v95), 32), v86));
                v85 |= __dirty_unsupported_Iop_Sh64Ux2(v87, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v96), 32), v86));
                v91 |= __dirty_unsupported_Iop_Sh64Ux2(v87, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v96), 32), v86));
                v84 += 8;
                i = v92 - 8;
            } while (i);
            v102 = v91 | v89 | v85 | v90;
            v104 = __dirty_unsupported_Iop_ZeroHI64ofV128(v102 | __dirty_unsupported_Iop_SliceV128(v102, v102, 8));
            v83 = __double_as_longlong(v104);
            if (v2 == v82)
                goto LABEL_bea5c0;
        }
        j = v2 - v82;
        v106 = a3 + v82;
        do
        {
            v107 = j;
            v108 = v106 + 1;
            v83 |= 1 << (*(char *)v106 & 63);
            v106 = v108;
            j = v107 - 1;
        } while (j);
LABEL_bea5c0:
        if (v77 >= v80)
            v80 = v77;
        v6 = v80 + 1;
        v110 = 0xffffffffffffffff;
        v111 = 0xffffffffffffffff;
        v112 = v77;
        a0->field_50 = a2;
        a0->field_58 = a3;
        a0->field_60 = v2;
        *(unsigned long long *)a0->padding_0 = 1;
        a0->field_8 = v77;
        a0->field_10 = v112;
        a0->field_18 = v6;
        a0->field_20 = v83;
        *(unsigned long long *)a0->padding_28 = 0;
        a0->field_30 = a2;
        a0->field_38 = v110;
        a0->field_40 = v111;
        a0->field_48 = a1;
        return;
    }
    v113 = 0;
    v114 = 0;
    v115 = 1;
    v116 = 1;
    while (1)
    {
        if (v2 <= v116 + v113)
        {
LABEL_bea438:
            v148 = 0;
            v149 = 0;
            v150 = 1;
            v151 = 1;
            break;
        }
        v4 = ~v116;
        v117 = v2 - v113 + v4;
        if (v2 <= v117)
            goto LABEL_bea8c8;
        v4 = v3 - (v113 + v114);
        if (v2 <= v4)
            goto LABEL_bea8d8;
        v118 = *((char *)a3 + v117);
        v119 = *((char *)a3 + v4);
        v120 = v113 + v116;
        v121 = v113 + 1;
        v122 = v121;
        v123 = v115;
        if (v121 == v115)
        {
            v124 = 0;
            v125 = arm64g_calculate_condition(20, v122, v123, 0);
            if (!(v125 & 1))
                goto LABEL_bea406;
            goto LABEL_bea405;
        }
        else
        {
            v124 = v113 + 1;
            v126 = arm64g_calculate_condition(20, v122, v123, 0);
            if (v126 & 1)
            {
LABEL_bea405:
                v127 = 0;
                goto LABEL_bea408;
            }
            else
            {
LABEL_bea406:
                v127 = v113 + 1;
LABEL_bea408:
                v128 = v118 & 0xff;
                v129 = v119 & 0xff;
                if (v118 == v119)
                {
                    v130 = v115;
                    v131 = arm64g_calculate_condition(3, v128, v129, 0);
                    if (!(v131 & 1))
                        goto LABEL_bea416;
                    goto LABEL_bea415;
                }
                else
                {
                    v130 = 1;
                    v132 = arm64g_calculate_condition(3, v128, v129, 0);
                    if (v132 & 1)
                    {
LABEL_bea415:
                        v133 = v124;
                        v134 = arm64g_calculate_condition(3, v128, v129, 0);
                        if (!(v134 & 1))
                            goto LABEL_bea41a;
                        goto LABEL_bea419;
                    }
                    else
                    {
LABEL_bea416:
                        v133 = 0;
                        v135 = arm64g_calculate_condition(3, v128, v129, 0);
                        if (v135 & 1)
                        {
LABEL_bea419:
                            v136 = v127 + v116;
                            v137 = arm64g_calculate_condition(3, v128, v129, 0);
                            if (!(v137 & 1))
                                goto LABEL_bea41e;
                            goto LABEL_bea41d;
                        }
                        else
                        {
LABEL_bea41a:
                            v136 = v116 + 1;
                            v138 = arm64g_calculate_condition(3, v128, v129, 0);
                            if (v138 & 1)
                            {
LABEL_bea41d:
                                v139 = v114;
                                v140 = arm64g_calculate_condition(0x33, v128, v129, 0);
                                if (!(v140 & 1))
                                    goto LABEL_bea422;
                                goto LABEL_bea421;
                            }
                            else
                            {
LABEL_bea41e:
                                v139 = v116;
                                v141 = arm64g_calculate_condition(0x33, v128, v129, 0);
                                if (v141 & 1)
                                {
LABEL_bea421:
                                    v115 = v120 + 1 - v114;
                                    v142 = arm64g_calculate_condition(0x33, v128, v129, 0);
                                    if (!(v142 & 1))
                                        goto LABEL_bea426;
                                    goto LABEL_bea425;
                                }
                                else
                                {
LABEL_bea422:
                                    v115 = v130;
                                    v143 = arm64g_calculate_condition(0x33, v128, v129, 0);
                                    if (v143 & 1)
                                    {
LABEL_bea425:
                                        v113 = 0;
                                        v144 = arm64g_calculate_condition(35, v128, v129, 0);
                                        if (!(v144 & 1))
                                            goto LABEL_bea42a;
                                        goto LABEL_bea429;
                                    }
                                    else
                                    {
LABEL_bea426:
                                        v113 = v133;
                                        v145 = arm64g_calculate_condition(35, v128, v129, 0);
                                        if (v145 & 1)
                                        {
LABEL_bea429:
                                            v116 = v136;
                                            v146 = arm64g_calculate_condition(0x33, v128, v129, 0);
                                            if (!(v146 & 1))
                                                goto LABEL_bea42e;
                                            goto LABEL_bea42d;
                                        }
                                        else
                                        {
LABEL_bea42a:
                                            v116 = v120 + 1;
                                            v147 = arm64g_calculate_condition(0x33, v128, v129, 0);
                                            if (v147 & 1)
                                            {
LABEL_bea42d:
                                                goto LABEL_bea430;
                                            }
                                            else
                                            {
LABEL_bea42e:
                                                v114 = v139;
LABEL_bea430:
                                                if (v115 == v6)
                                                    goto LABEL_bea438;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
LABEL_bea448:
    v4 = ~v151;
    v117 = v2 - v148 + v4;
    if (v2 <= v117)
        goto LABEL_bea8c8;
    v4 = v3 - (v148 + v149);
    if (v2 <= v4)
        goto LABEL_bea8d8;
    v152 = *((char *)a3 + v117);
    v153 = *((char *)a3 + v4);
    v154 = v148 + v151;
    v155 = v148 + 1;
    v156 = v155;
    v157 = v150;
    if (v155 == v150)
    {
        v158 = 0;
        v159 = arm64g_calculate_condition(20, v156, v157, 0);
        if (!(v159 & 1))
            goto LABEL_bea49a;
        goto LABEL_bea499;
    }
    else
    {
        v158 = v148 + 1;
        v160 = arm64g_calculate_condition(20, v156, v157, 0);
        if (v160 & 1)
        {
LABEL_bea499:
            v161 = 0;
            goto LABEL_bea49c;
        }
        else
        {
LABEL_bea49a:
            v161 = v148 + 1;
LABEL_bea49c:
            v162 = v152 & 0xff;
            v163 = v153 & 0xff;
            if (v152 == v153)
            {
                v164 = v150;
                v165 = arm64g_calculate_condition(3, v162, v163, 0);
                if (!(v165 & 1))
                    goto LABEL_bea4aa;
                goto LABEL_bea4a9;
            }
            else
            {
                v164 = 1;
                v166 = arm64g_calculate_condition(3, v162, v163, 0);
                if (v166 & 1)
                {
LABEL_bea4a9:
                    v167 = v158;
                    v168 = arm64g_calculate_condition(3, v162, v163, 0);
                    if (!(v168 & 1))
                        goto LABEL_bea4ae;
                    goto LABEL_bea4ad;
                }
                else
                {
LABEL_bea4aa:
                    v167 = 0;
                    v169 = arm64g_calculate_condition(3, v162, v163, 0);
                    if (v169 & 1)
                    {
LABEL_bea4ad:
                        v170 = v161 + v151;
                        v171 = arm64g_calculate_condition(3, v162, v163, 0);
                        if (!(v171 & 1))
                            goto LABEL_bea4b2;
                        goto LABEL_bea4b1;
                    }
                    else
                    {
LABEL_bea4ae:
                        v170 = v151 + 1;
                        v172 = arm64g_calculate_condition(3, v162, v163, 0);
                        if (v172 & 1)
                        {
LABEL_bea4b1:
                            v173 = v149;
                            v174 = arm64g_calculate_condition(131, v162, v163, 0);
                            if (!(v174 & 1))
                                goto LABEL_bea4b6;
                            goto LABEL_bea4b5;
                        }
                        else
                        {
LABEL_bea4b2:
                            v173 = v151;
                            v175 = arm64g_calculate_condition(131, v162, v163, 0);
                            if (v175 & 1)
                            {
LABEL_bea4b5:
                                v150 = v154 + 1 - v149;
                                v176 = arm64g_calculate_condition(131, v162, v163, 0);
                                if (!(v176 & 1))
                                    goto LABEL_bea4ba;
                                goto LABEL_bea4b9;
                            }
                            else
                            {
LABEL_bea4b6:
                                v150 = v164;
                                v177 = arm64g_calculate_condition(131, v162, v163, 0);
                                if (v177 & 1)
                                {
LABEL_bea4b9:
                                    v148 = 0;
                                    v178 = arm64g_calculate_condition(147, v162, v163, 0);
                                    if (!(v178 & 1))
                                        goto LABEL_bea4be;
                                    goto LABEL_bea4bd;
                                }
                                else
                                {
LABEL_bea4ba:
                                    v148 = v167;
                                    v179 = arm64g_calculate_condition(147, v162, v163, 0);
                                    if (v179 & 1)
                                    {
LABEL_bea4bd:
                                        v151 = v170;
                                        v180 = arm64g_calculate_condition(131, v162, v163, 0);
                                        if (!(v180 & 1))
                                            goto LABEL_bea4c2;
                                        goto LABEL_bea4c1;
                                    }
                                    else
                                    {
LABEL_bea4be:
                                        v151 = v154 + 1;
                                        v181 = arm64g_calculate_condition(131, v162, v163, 0);
                                        if (v181 & 1)
                                        {
LABEL_bea4c1:
                                            continue;
                                        }
                                        else
                                        {
LABEL_bea4c2:
                                            v149 = v173;
                                            if (v150 != v6)
                                                goto LABEL_bea448;
                                            goto LABEL_bea448;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
