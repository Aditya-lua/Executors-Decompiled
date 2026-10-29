/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd40e4..0xbd4538 (1108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd40e4_1 {
    uint128_t field_0;
} st_bd40e4_1;

typedef struct st_bd40e4_3 {
    char padding_0[12];
    unsigned int field_c;
} st_bd40e4_3;

typedef struct st_bd40e4_0 {
    char padding_0[8];
    struct st_bd40e4_1 *field_8;
    unsigned long long field_10;
    char padding_18[8];
    void* field_20;
    unsigned long long field_28;
    void* field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
} st_bd40e4_0;

typedef struct st_bd40e4_4 {
    char padding_0[4];
    unsigned int field_4;
} st_bd40e4_4;

typedef struct st_bd40e4_5 {
    unsigned long long field_0;
    char field_8;
} st_bd40e4_5;

typedef struct st_bd40e4_2 {
    char padding_0[8];
    unsigned int field_8;
} st_bd40e4_2;


unsigned long long sub_bd40e4(st_bd40e4_0 *a0, unsigned int a1)
{
    unsigned long long v2;  // x12
    unsigned long long v3;  // x10
    unsigned long long v12;  // x3
    unsigned int v13;  // w16
    st_bd40e4_2 *v14;  // x4
    unsigned long long v15;  // x3
    unsigned long long v16;  // x4
    unsigned long long v17;  // x17
    st_bd40e4_3 *v18;  // x2
    unsigned long long v19;  // x17
    st_bd40e4_4 *v20;  // x2
    unsigned long v21;  // x16
    uint128_t *v4;  // x13
    unsigned long long v22;  // x17
    unsigned long long v23;  // x15
    st_bd40e4_2 *v24;  // x2
    unsigned long long v25;  // x17
    unsigned long long v26;  // x2
    unsigned long long v27;  // x16
    st_bd40e4_3 *v28;  // x17
    unsigned long long v29;  // x16
    st_bd40e4_4 *v30;  // x17
    unsigned long long v31;  // x14
    void* v5;  // x11
    unsigned long long v32;  // 4118
    void* v33;  // x15
    unsigned long v34;  // x17
    unsigned long long v35;  // x3
    unsigned int v36;  // w16
    st_bd40e4_2 *v37;  // x4
    unsigned long long v38;  // x3
    unsigned long long v39;  // x4
    unsigned long long v40;  // x17
    st_bd40e4_3 *v41;  // x2
    void* v6;  // x8
    unsigned long long v42;  // x17
    st_bd40e4_4 *v43;  // x2
    unsigned long v44;  // x16
    unsigned long long v45;  // x17
    unsigned long long v46;  // x15
    st_bd40e4_2 *v47;  // x2
    unsigned long long v48;  // x17
    unsigned long long v49;  // x2
    unsigned long long v50;  // x16
    st_bd40e4_3 *v51;  // x17
    unsigned long long iter;  // x9
    unsigned long long v52;  // x16
    st_bd40e4_4 *v53;  // x17
    unsigned long v54;  // x19
    unsigned long long index;  // x12
    unsigned long long j;  // x10
    unsigned long long i;  // x11
    unsigned int *v58;  // x12
    unsigned int *v59;  // x11
    unsigned long long v60;  // x9
    unsigned long long v61;  // x11
    unsigned long long v8;  // x14
    void* v62;  // x8
    unsigned long long v63;  // x10
    __m128i v64;  // q0
    unsigned long long v65;  // x13
    __m128i v66;  // q2
    unsigned long v68;  // x11
    unsigned long long v69;  // x14
    uint128_t v70;  // q2
    unsigned long long v9;  // 4118
    unsigned long v73;  // x11
    unsigned long long v74;  // x14
    unsigned long long v75;  // 4128
    unsigned long long v76;  // 4130
    unsigned long long v77;  // x11
    unsigned long long v78;  // x11
    unsigned long long v79;  // x12
    unsigned long long v80;  // x11
    st_bd40e4_5 *v81;  // x9
    void* v10;  // x15
    __m128i v82;  // q1
    unsigned long v83;  // d0
    unsigned long long v84;  // x10
    unsigned long v85;  // d0
    unsigned long v86;  // x13
    unsigned long long v87;  // x10
    unsigned long long v88;  // 4128
    unsigned long long v89;  // 4130
    unsigned long long v90;  // x13
    unsigned long long v91;  // x13
    unsigned long v11;  // x17
    char v92;  // x10
    unsigned long long v93;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    v3 = a1;
    if (v2 <= v3)
        return 0;
    v4 = a0->field_8;
    v5 = &v4[v3];
    v6 = a0->field_20;
    iter = a0->field_28;
    while (1)
    {
        v8 = (int)v5[8];
        v9 = arm64g_calculate_condition(1, v8 & 0xffffffff, 1, 0);
        if (v9 & 1)
            break;
        if (iter > v8)
        {
            v10 = v6 + v8 * 16;
            v11 = (long long)v10[8];
            v12 = v11 & 0xffffffff;
            if (v2 > v12)
            {
                v13 = (int)v10[4];
                v14 = &v4[v12];
                if (v14->field_8 == v8)
                {
                    v14->field_8 = *(int *)v10;
                }
                else
                {
                    while (iter > v15)
                    {
                        v16 = v15 * 16;
                        if (*(int *)((char *)v6 + v16) == v8)
                        {
                            *(int *)((char *)v6 + v16) = *(int *)v10;
                            break;
                        }
                    }
                }
                v17 = v11 >> 32;
                if (v2 > v17)
                {
                    v18 = &v4[v17];
                    if (v18->field_c == v8)
                    {
                        v18->field_c = v13;
                    }
                    else
                    {
                        while (iter > v19)
                        {
                            v20 = v6 + v19 * 16;
                            if (v20->field_4 == v8)
                            {
                                v20->field_4 = v13;
                                break;
                            }
                        }
                    }
                }
            }
            iter -= 1;
            *(int128_t *)v10 = *(int128_t *)((char *)v6 + 16 * iter);
            a0->field_28 = iter;
            if (iter > v8 && (v21 = (long long)v10[8], v22 = v21 & 0xffffffff, v2 > v22))
            {
                v23 = iter & 0xffffffff;
                v24 = &v4[v22];
                if (v24->field_8 == v23)
                {
                    v24->field_8 = v8;
                }
                else
                {
                    while (iter > v25)
                    {
                        v26 = v25 * 16;
                        if (*(int *)((char *)v6 + v26) == v23)
                        {
                            *(unsigned int *)((char *)v6 + v26) = v8;
                            break;
                        }
                    }
                }
                v27 = v21 >> 32;
                if (v2 > v27)
                {
                    v28 = &v4[v27];
                    if (v28->field_c == v23)
                    {
                        v28->field_c = v8;
                    }
                    else
                    {
                        while (iter > v29)
                        {
                            v30 = v6 + v29 * 16;
                            if (v30->field_4 == v23)
                            {
                                v30->field_4 = v8;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    while (1)
    {
        v31 = (int)v5[12];
        v32 = arm64g_calculate_condition(1, v31 & 0xffffffff, 1, 0);
        if (v32 & 1)
            break;
        if (iter > v31)
        {
            v33 = v6 + v31 * 16;
            v34 = (long long)v33[8];
            v35 = v34 & 0xffffffff;
            if (v2 > v35)
            {
                v36 = (int)v33[4];
                v37 = &v4[v35];
                if (v37->field_8 == v31)
                {
                    v37->field_8 = *(int *)v33;
                }
                else
                {
                    while (iter > v38)
                    {
                        v39 = v38 * 16;
                        if (*(int *)((char *)v6 + v39) == v31)
                        {
                            *(int *)((char *)v6 + v39) = *(int *)v33;
                            break;
                        }
                    }
                }
                v40 = v34 >> 32;
                if (v2 > v40)
                {
                    v41 = &v4[v40];
                    if (v41->field_c == v31)
                    {
                        v41->field_c = v36;
                    }
                    else
                    {
                        while (iter > v42)
                        {
                            v43 = v6 + v42 * 16;
                            if (v43->field_4 == v31)
                            {
                                v43->field_4 = v36;
                                break;
                            }
                        }
                    }
                }
            }
            iter -= 1;
            *(int128_t *)v33 = *(int128_t *)((char *)v6 + 16 * iter);
            a0->field_28 = iter;
            if (iter > v31 && (v44 = (long long)v33[8], v45 = v44 & 0xffffffff, v2 > v45))
            {
                v46 = iter & 0xffffffff;
                v47 = &v4[v45];
                if (v47->field_8 == v46)
                {
                    v47->field_8 = v31;
                }
                else
                {
                    while (iter > v48)
                    {
                        v49 = v48 * 16;
                        if (*(int *)((char *)v6 + v49) == v46)
                        {
                            *(unsigned int *)((char *)v6 + v49) = v31;
                            break;
                        }
                    }
                }
                v50 = v44 >> 32;
                if (v2 > v50)
                {
                    v51 = &v4[v50];
                    if (v51->field_c == v46)
                    {
                        v51->field_c = v31;
                    }
                    else
                    {
                        while (iter > v52)
                        {
                            v53 = v6 + v52 * 16;
                            if (v53->field_4 == v46)
                            {
                                v53->field_4 = v31;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    v54 = *(long long *)v5;
    index = v2 - 1;
    *(uint128_t *)v5 = v4[index];
    a0->field_10 = index;
    if (index > v3)
    {
        j = (unsigned long long)((long long)v5[8]) >> 32;
        i = (long long)v5[8] & 0xffffffff;
        if (iter > i)
        {
            do
            {
                v58 = v6 + i * 16;
                i = *v58;
                v58[2] = a1;
            } while (i < iter);
        }
        for (; j < iter; v59[3] = a1)
        {
            v59 = v6 + j * 16;
            j = v59[1];
        }
    }
    v60 = 0;
    v61 = 5871781006564002453 * (v54 + 8);
    v62 = a0->field_30;
    v63 = a0->field_38;
    v64 = v61 >> 57 & 0xff | (v61 >> 57 & 0xff) * 0x100 | (v61 >> 57 & 0xff | (v61 >> 57 & 0xff) * 0x100) * 0x10000 | (v61 >> 57 & 0xff | (v61 >> 57 & 0xff) * 0x100 | (v61 >> 57 & 0xff | (v61 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
    v65 = v61 & v63;
    v66 = *(long long *)((char *)v62 + v65);
    v68 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v66, v64));
    v69 = v68 & 0x8080808080808080;
    if (!(v68 & 0x8080808080808080))
        goto LABEL_bd4464;
    while (1)
    {
        do
        {
            v74 = v69;
            v75 = ((((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v76 = (((((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v77 = ((((v76 | v75) & 0xffff0000ffff0000) >> 16 | (v76 | v75) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v76 | v75) & 0xffff0000ffff0000) >> 16 | (v76 | v75) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v77)
                v78 = 64;
            else
                v78 = Clz(v77);
            v79 = v65 + (v78 >> 3) & v63;
            if (v54 == *(long long *)((char *)v62 + -16 * v79 - 16))
            {
                v81 = v62 + (v79 - 8 & v63);
                v82 = _mm_set1_epi32(-1);
                v83 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(unsigned long long *)&*(double *)&v81->field_0, v82));
                v84 = __double_as_longlong(v83);
                v85 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(long long *)((char *)v62 + v79), v82));
                v86 = __double_as_longlong(v85);
                if (!v84)
                    v87 = 64;
                else
                    v87 = Clz(v84);
                v88 = ((((((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v89 = (((((((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v90 = ((((v89 | v88) & 0xffff0000ffff0000) >> 16 | (v89 | v88) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v89 | v88) & 0xffff0000ffff0000) >> 16 | (v89 | v88) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v90)
                    v91 = 64;
                else
                    v91 = Clz(v90);
                if ((v91 >> 3) + (v87 >> 3) > 7)
                {
                    v92 = 128;
                }
                else
                {
                    a0->field_40 = a0->field_40 + 1;
                    v92 = 0xff;
                }
                *((char *)v62 + v79) = v92;
                v81->field_8 = v92;
                a0->field_48 = a0->field_48 - 1;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v93 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (v93 & 1)
                    return v54;
                /* unsupported instruction */;
                sub_b86a90();
                return v54;
            }
            v80 = v74 - 1;
            v69 = v80 & v74;
        } while (v80 & v74);
        do
        {
LABEL_bd4464:
            v70 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v66, _mm_set1_epi8(-1)));
            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v70, v70), _mm_unpacklo_epi64(v70, v70)))))))))) & 1)
                return v54;
            v60 += 8;
            v65 = v65 + v60 & v63;
            v66 = *(long long *)((char *)v62 + v65);
            v73 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v66, v64));
            v69 = v73 & 0x8080808080808080;
        } while (!(v73 & 0x8080808080808080));
    }
}
