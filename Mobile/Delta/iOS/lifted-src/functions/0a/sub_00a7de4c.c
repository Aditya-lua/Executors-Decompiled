/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7de4c..0xa7e1f0 (932 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7de4c_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned int field_20;
    char field_24;
    unsigned int field_25;
    char field_29;
    unsigned int field_2a;
    char field_2e;
    unsigned int field_2f;
    char field_33;
    unsigned int field_34;
    char field_38;
    unsigned int field_39;
    char field_3d;
    unsigned int field_3e;
    char field_42;
    unsigned int field_43;
    char field_47;
    unsigned int field_48;
    char field_4c;
    unsigned int field_4d;
    char field_51;
    unsigned int field_52;
    char field_56;
    unsigned int field_57;
    char field_5b;
    unsigned int field_5c;
    char field_60;
    unsigned int field_61;
    char field_65;
    unsigned int field_66;
    char field_6a;
    unsigned int field_6b;
    char field_6f;
} st_a7de4c_2;

typedef struct st_a7de4c_1 {
    char padding_0[8];
    struct st_a7de4c_0 *field_8;
    char padding_10[16];
    uint128_t field_20;
    uint128_t field_30;
    char padding_40[96];
    unsigned long long field_a0;
    char padding_a8[24];
    uint128_t *field_c0;
} st_a7de4c_1;

typedef struct st_a7de4c_3 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned int field_c;
} st_a7de4c_3;

typedef struct st_a7de4c_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_a7de4c_0;


unsigned long long sub_a7de4c(st_a7de4c_1 *a0, st_a7de4c_2 *a1, unsigned long long a2)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    unsigned long long v21;  // x0
    unsigned long long v22;  // x23
    unsigned long long v23;  // x8
    uint128_t v24;  // q1
    unsigned long long v25;  // x10
    unsigned long long i;  // x11
    unsigned int *iter;  // x6
    __m128i v28;  // q2
    uint128_t *v29;  // x17
    uint128_t *v30;  // x17
    unsigned long long v13;  // x24
    unsigned long long v31;  // x1
    unsigned long long v32;  // x1
    unsigned long long v33;  // x1
    unsigned long long v34;  // x8
    unsigned long long v35;  // x4
    unsigned long long v36;  // x5
    unsigned long v37;  // cc_dep1
    unsigned long long v38;  // x7
    unsigned long long v39;  // 4110
    unsigned long long v40;  // 4102
    unsigned long long v14;  // x23
    unsigned long long v41;  // 4110
    unsigned long long v42;  // 4102
    unsigned long long v43;  // x1
    unsigned long long v44;  // x4
    unsigned long long j;  // x4
    unsigned long long v46;  // x1
    char *v47;  // x6
    uint128_t *v48;  // x7
    unsigned long long v49;  // x4
    uint128_t v50;  // q3
    unsigned long long v15;  // x22
    uint128_t v51;  // q3
    __m128i v52;  // q3
    uint128_t v53;  // q5
    uint128_t v54;  // q5
    char *v55;  // x23
    __m128i v56;  // q5
    uint128_t v57;  // q4
    uint128_t v58;  // q4
    __m128i v59;  // q4
    uint128_t v60;  // q6
    unsigned long long v16;  // x21
    uint128_t v61;  // q6
    __m128i v62;  // q6
    uint128_t v63;  // q16
    uint128_t v64;  // q16
    __m128i v65;  // q16
    uint128_t v66;  // q7
    uint128_t v67;  // q7
    __m128i v68;  // q7
    uint128_t v69;  // q17
    uint128_t v70;  // q17
    unsigned long long v17;  // x20
    __m128i v71;  // q17
    uint128_t v72;  // q18
    uint128_t v73;  // q18
    __m128i v74;  // q18
    __m128i v75;  // q22
    __m128i v76;  // q23
    __m128i v77;  // q20
    __m128i v78;  // q21
    uint128_t *v79;  // x22
    uint128_t *v80;  // x22
    unsigned long long v18;  // x19
    __m128i v81;  // q20
    __m128i v82;  // q21
    __m128i v83;  // q18
    __m128i v84;  // q19
    __m128i v85;  // q24
    __m128i v86;  // q25
    __m128i v87;  // q22
    __m128i v88;  // q23
    uint128_t *v89;  // x22
    __m128i v90;  // q20
    unsigned long long v19;  // x30
    __m128i v91;  // q21
    __m128i v92;  // q18
    __m128i v93;  // q19
    uint128_t *v94;  // x22
    unsigned long long k;  // x1
    st_a7de4c_3 *v96;  // x5
    unsigned int v97;  // w7
    unsigned int v98;  // w6
    unsigned long v100;  // d3
    unsigned long long v20;  // x0
    unsigned long long v101;  // x0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (*(long long *)&a0->padding_a8[0])
    {
        return 0;
    }
    else if (a0->field_a0)
    {
        return 0;
    }
    else
    {
        v0 = v11;
        v1 = v12;
        v2 = v13;
        v3 = v14;
        v4 = v15;
        v5 = v16;
        v6 = v17;
        v7 = v18;
        v8 = &v10;
        v9 = v19;
        if (a0->field_8->field_48 != a2)
            return 0;
        v20 = sub_a7fb0c();
        if (!(unsigned int)v20)
            return v20;
        v21 = sub_a3f728();
        v22 = 0;
        v23 = a2 - 32;
        if ((long long)a2 >= 32 && v21)
        {
            v24 = a1->field_10;
            a0->field_20 = a1->field_0;
            a0->field_30 = v24;
            v25 = (unsigned long long)a0[1].padding_0;
            if (v25)
            {
                i = 0;
                iter = &a1->field_20;
                v28 = _mm_set1_epi32(0x3ff);
                v29 = a0->field_c0;
                v30 = v29;
                do
                {
                    if (4 < v23)
                        v31 = v23;
                    else
                        v31 = 4;
                    v32 = v31 / 5;
                    if (v32 >= 63)
                        v32 = 63;
                    if (80 > v23)
                    {
                        v33 = 0;
                        v34 = v23;
                        continue;
                    }
                    v35 = &v29[64 * i];
                    v36 = v23 / 5;
                    v37 = v36;
                    if (v36 >= 63)
                        v36 = 63;
                    v38 = v35 + v36 * 16 + 16;
                    if (v35 < (char *)iter + 5 * v36 + 5)
                    {
                        v39 = arm64g_calculate_condition(52, v37, 63, 0);
                        v40 = arm64g_calculate_condition(52, (v39 & 1 ? iter : 0x20000000), (v39 & 1 ? v38 : 0), 0);
                        if (v40 & 1)
                            goto LABEL_a7e118;
                        goto LABEL_a7df60;
                    }
                    else
                    {
                        v41 = arm64g_calculate_condition(52, v37, 63, 0);
                        v42 = arm64g_calculate_condition(48, (v41 & 1 ? iter : 0x20000000), (v41 & 1 ? v38 : 0), 0);
                        if (!(v42 & 1))
                        {
LABEL_a7df60:
                            v43 = v32 + 1;
                            v44 = v43 & 15;
                            if (!(v43 & 15))
                                v44 = 16;
                            j = v43 - v44;
                            v46 = j * 5;
                            v34 = v23 - v46;
                            v33 = j * 16;
                            v47 = (char *)&iter[9] + 3;
                            v48 = v30;
                            do
                            {
                                v49 = j;
                                v50 = _INSERT(*(int *)&v47[21], 4, *(int *)&v47[26]);
                                v51 = _INSERT(v50, 8, *(int *)&v47[31]);
                                v52 = (__m128i)_INSERT(v51, 12, *(int *)&v47[36]);
                                v53 = _INSERT(*(v47 - 15), 4, *(v47 - 10));
                                v54 = _INSERT(v53, 8, *(v47 - 5));
                                v55 = v47;
                                v56 = (__m128i)_INSERT(v54, 12, *v55);
                                v57 = _INSERT(*(int *)&v55[1], 4, *(int *)&v47[6]);
                                v58 = _INSERT(v57, 8, *(int *)&v47[11]);
                                v59 = (__m128i)_INSERT(v58, 12, *(int *)&v47[16]);
                                v60 = _INSERT(*(int *)(v47 - 19), 4, *(int *)(v47 - 14));
                                v61 = _INSERT(v60, 8, *(int *)(v47 - 9));
                                v62 = (__m128i)_INSERT(v61, 12, *(int *)(v47 - 4));
                                v63 = _INSERT(*(int *)(v47 - 39), 4, *(int *)(v47 - 0x22));
                                v64 = _INSERT(v63, 8, *(int *)(v47 - 29));
                                v65 = (__m128i)_INSERT(v64, 12, *(int *)(v47 - 24));
                                v66 = _INSERT(v47[25], 4, v47[30]);
                                v67 = _INSERT(v66, 8, v47[35]);
                                v68 = (__m128i)_INSERT(v67, 12, v47[40]);
                                v69 = _INSERT(v47[5], 4, v47[10]);
                                v70 = _INSERT(v69, 8, v47[15]);
                                v71 = (__m128i)_INSERT(v70, 12, v47[20]);
                                v72 = _INSERT(*(v47 - 35), 4, *(v47 - 30));
                                v73 = _INSERT(v72, 8, *(v47 - 25));
                                v74 = (__m128i)_INSERT(v73, 12, *(v47 - 20));
                                v75 = _mm_and_si128(_mm_srli_epi32(v65, 20), _mm_set1_epi32(-0xc01));
                                v76 = _mm_add_epi32(_mm_slli_epi32(v74, 2), _mm_srli_epi32(v65, 30));
                                v77 = _mm_and_si128(v65, v28);
                                v78 = _mm_and_si128(_mm_srli_epi32(v65, 10), v28);
                                v79 = v48;
                                v79[3] = CatOddLanesV(_mm_unpackhi_epi64(v75, v76), _mm_unpackhi_epi64(v77, v78));
                                v79[2] = CatEvenLanesV(_mm_unpackhi_epi64(v75, v76), _mm_unpackhi_epi64(v77, v78));
                                v79[1] = CatOddLanesV(_mm_unpacklo_epi64(v75, v76), _mm_unpacklo_epi64(v77, v78));
                                *v79 = CatEvenLanesV(_mm_unpacklo_epi64(v75, v76), _mm_unpacklo_epi64(v77, v78));
                                v80 = v79 + 4;
                                v81 = _mm_and_si128(_mm_srli_epi32(v62, 20), _mm_set1_epi32(-0xc01));
                                v82 = _mm_add_epi32(_mm_slli_epi32(v56, 2), _mm_srli_epi32(v62, 30));
                                v83 = _mm_and_si128(v62, v28);
                                v84 = _mm_and_si128(_mm_srli_epi32(v62, 10), v28);
                                v80[3] = CatOddLanesV(_mm_unpackhi_epi64(v81, v82), _mm_unpackhi_epi64(v83, v84));
                                v80[2] = CatEvenLanesV(_mm_unpackhi_epi64(v81, v82), _mm_unpackhi_epi64(v83, v84));
                                v80[1] = CatOddLanesV(_mm_unpacklo_epi64(v81, v82), _mm_unpacklo_epi64(v83, v84));
                                *v80 = CatEvenLanesV(_mm_unpacklo_epi64(v81, v82), _mm_unpacklo_epi64(v83, v84));
                                v85 = _mm_and_si128(_mm_srli_epi32(v59, 20), _mm_set1_epi32(-0xc01));
                                v86 = _mm_add_epi32(_mm_slli_epi32(v71, 2), _mm_srli_epi32(v59, 30));
                                v87 = _mm_and_si128(v59, v28);
                                v88 = _mm_and_si128(_mm_srli_epi32(v59, 10), v28);
                                v89 = v48 + 8;
                                v89[3] = CatOddLanesV(_mm_unpackhi_epi64(v85, v86), _mm_unpackhi_epi64(v87, v88));
                                v89[2] = CatEvenLanesV(_mm_unpackhi_epi64(v85, v86), _mm_unpackhi_epi64(v87, v88));
                                v89[1] = CatOddLanesV(_mm_unpacklo_epi64(v85, v86), _mm_unpacklo_epi64(v87, v88));
                                *v89 = CatEvenLanesV(_mm_unpacklo_epi64(v85, v86), _mm_unpacklo_epi64(v87, v88));
                                v90 = _mm_and_si128(_mm_srli_epi32(v52, 20), _mm_set1_epi32(-0xc01));
                                v91 = _mm_add_epi32(_mm_slli_epi32(v68, 2), _mm_srli_epi32(v52, 30));
                                v92 = _mm_and_si128(v52, v28);
                                v93 = _mm_and_si128(_mm_srli_epi32(v52, 10), v28);
                                v94 = v48 + 12;
                                v94[3] = CatOddLanesV(_mm_unpackhi_epi64(v90, v91), _mm_unpackhi_epi64(v92, v93));
                                v94[2] = CatEvenLanesV(_mm_unpackhi_epi64(v90, v91), _mm_unpackhi_epi64(v92, v93));
                                v94[1] = CatOddLanesV(_mm_unpacklo_epi64(v90, v91), _mm_unpacklo_epi64(v92, v93));
                                *v94 = CatEvenLanesV(_mm_unpacklo_epi64(v90, v91), _mm_unpacklo_epi64(v92, v93));
                                v48 += 16;
                                v47 += 80;
                                j = v49 - 16;
                            } while (j);
                            iter = (char *)iter + v46;
                            continue;
                        }
                        else
                        {
LABEL_a7e118:
                            v33 = 0;
                            v34 = v23;
                        }
                    }
                    do
                    {
                        k = v33;
                        v23 = v34 - 5;
                        if (v34 < 5)
                        {
                            sub_a3f73c();
                            return 0;
                        }
                        v96 = (char *)v30 + k;
                        v97 = *iter;
                        v98 = (char)iter[1];
                        v96->field_0 = v97 & 0x3ff;
                        v100 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_Sh32Ux4(v97 | v97 * 0x100000000, 0xffffffecfffffff6)) & 0x3ff000003ff);
                        *(unsigned long *)&(&v96->field_0)[1] = v100;
                        *(unsigned int *)((char *)&v96->field_4 + 4) = v98 * 4 | v97 >> 30;
                        iter = (char *)&iter[1] + 1;
                        v33 = k + 16;
                        v34 = v23;
                    } while (k < 1008);
                    i += 1;
                    v30 += 64;
                } while (i != v25);
            }
            if (sub_a7e1f0())
            {
                v101 = sub_a6dac4(a1, a2, "crypto/ml_dsa/ml_dsa_encoders.c", 692);
                a0->field_a0 = v101;
                v22 = v101 != 0;
            }
            else
            {
                v22 = 0;
            }
        }
        sub_a3f73c();
        return v22;
    }
}
