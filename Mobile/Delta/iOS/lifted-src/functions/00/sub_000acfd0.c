/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xacfd0..0xad664 (1684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_acfd0_2 {
    struct st_acfd0_3 *field_0;
} st_acfd0_2;

typedef struct st_acfd0_3 {
    struct st_acfd0_2 *field_0;
} st_acfd0_3;

typedef struct st_acfd0_0 {
    char field_0;
} st_acfd0_0;

typedef struct st_acfd0_1 {
    long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[24];
    unsigned int field_34;
    unsigned long long field_38;
    char padding_40[48];
    unsigned long long field_70;
} st_acfd0_1;

extern char g_10002b0;

unsigned long long sub_acfd0(void* a0, void* a1, void* a2, unsigned long long *a3)
{
    unsigned long v19;  // x10
    unsigned long v20;  // x9
    unsigned long v26;  // cc_ndep
    unsigned long v103;  // cc_op
    unsigned long v104;  // cc_dep1
    unsigned long v105;  // cc_dep2
    unsigned long long v106;  // x12
    unsigned long long idx;  // x8
    unsigned int v108;  // w9
    st_acfd0_3 **v109;  // x21
    unsigned long long v110;  // x22
    unsigned long long v111;  // x26
    unsigned long v112;  // x20
    unsigned long long v27;  // 4112
    unsigned long long v113;  // x0
    void* v114;  // x8
    void* v115;  // x10
    __m128i v116;  // 4159
    __m128i v117;  // 4161
    __m128i v118;  // 4163
    __m128i v119;  // 4165
    __m128i v120;  // 4257
    __m128i v121;  // 4258
    __m128i v122;  // 4259
    unsigned long long v28;  // 4108
    __m128i v123;  // 4260
    __m128i v124;  // 4261
    __m128i v125;  // 4262
    __m128i v126;  // 4263
    __m128i v127;  // 4264
    __m128i v128;  // q4
    __m128i v129;  // q0
    unsigned long long v131;  // x11
    unsigned long long v132;  // 4112
    unsigned long v29;  // cc_op
    unsigned long long v133;  // 4102
    unsigned long long v134;  // 4112
    unsigned long long v135;  // 4102
    unsigned long long idx1;  // x26
    st_acfd0_1 *v137;  // x8
    unsigned int v138;  // w9
    long long v139;  // x23
    unsigned long long v140;  // x19
    unsigned long v141;  // x10
    unsigned long long v142;  // 4128
    unsigned long v30;  // cc_dep1
    unsigned long long v143;  // 4130
    unsigned long long v144;  // x13
    unsigned int v145;  // w13
    unsigned int v146;  // w13
    unsigned long v147;  // x13
    unsigned long long v148;  // x11
    unsigned int v149;  // w28
    st_acfd0_3 **v150;  // x21
    unsigned long long v151;  // x26
    unsigned long v152;  // x20
    unsigned long v31;  // cc_dep2
    unsigned int *v153;  // x8
    unsigned long long v154;  // x8
    unsigned long long v32;  // 4112
    unsigned long long v33;  // 4108
    char v21;  // x12
    unsigned long long *v22;  // x25
    char v34;  // x15
    unsigned long long v35;  // x13
    unsigned long long iter;  // w24
    st_acfd0_1 *v37;  // x14
    unsigned long long v38;  // x16
    unsigned long long v39;  // x14
    unsigned long long v40;  // x1
    unsigned int v41;  // w11
    unsigned int *v42;  // x14
    void* v23;  // x27
    unsigned long v43;  // x17
    unsigned long long *v44;  // x1
    unsigned long v45;  // x15
    unsigned long v46;  // x16
    unsigned long long v47;  // 4120
    unsigned long j;  // x17
    unsigned long long idx2;  // x4
    unsigned long v50;  // x5
    unsigned long long v51;  // x3
    char *v52;  // x3
    unsigned int v24;  // w8
    unsigned int v53;  // w6
    unsigned long long v54;  // x7
    unsigned long long index;  // x6
    unsigned long long v56;  // x1
    unsigned long long v57;  // x2
    unsigned int v58;  // w3
    unsigned int v59;  // w3
    unsigned long long k;  // w1
    unsigned long v61;  // x6
    unsigned long long v62;  // w1
    unsigned int v25;  // w13
    char v64;  // x2
    unsigned long long i;  // x17
    unsigned long long v66;  // x21
    unsigned long v67;  // x22
    unsigned long long v68;  // x20
    char *v69;  // x20
    unsigned int v70;  // w23
    unsigned long long v71;  // x26
    unsigned long long v72;  // x23
    unsigned long long v73;  // x13
    unsigned long v74;  // x12
    unsigned int *v75;  // x10
    void* v76;  // x9
    unsigned long v77;  // x12
    __m128i v78;  // 4178
    __m128i v79;  // 4180
    __m128i v80;  // 4182
    __m128i v81;  // 4184
    __m128i v82;  // 4188
    __m128i v83;  // 4190
    __m128i v84;  // 4193
    __m128i v85;  // 4195
    __m128i v86;  // 4198
    __m128i v87;  // 4200
    __m128i v88;  // 4203
    __m128i v89;  // 4205
    __m128i v90;  // q4
    __m128i v91;  // q0
    unsigned long long v93;  // x26
    unsigned long long v94;  // x13
    unsigned long long v95;  // 4128
    unsigned long long v96;  // 4130
    unsigned long long v97;  // x15
    unsigned int v98;  // w15
    unsigned int v99;  // w15
    unsigned long v100;  // x15
    unsigned long long v101;  // x13
    unsigned int v102;  // w8
    st_acfd0_1 *v0;  // [bp-0x1f0]
    unsigned long long v1;  // [bp-0x1e8]
    void* v2;  // [bp-0x1e0]
    unsigned long v3;  // [bp-0x1d8]
    st_acfd0_0 **v4;  // [bp-0x1b8], Other Possible Types: char
    st_acfd0_0 *v5;  // [bp-0x1b0]
    st_acfd0_0 **v6;  // [bp-0x1a8], Other Possible Types: char
    st_acfd0_0 *v7;  // [bp-0x1a0]
    st_acfd0_0 **v8;  // [bp-0x198], Other Possible Types: char
    st_acfd0_0 *v9;  // [bp-0x190]
    char *v10;  // [bp-0x188], Other Possible Types: st_acfd0_0 *
    st_acfd0_0 **v11;  // [bp-0x180]
    st_acfd0_3 **v12;  // [bp-0x178]
    st_acfd0_3 **v13;  // [bp-0x170]
    st_acfd0_3 **v14;  // [bp-0x170], Other Possible Types: unsigned long
    st_acfd0_3 **v15;  // [bp-0x170]
    unsigned long v16;  // [bp-0x70]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v16 = *(long long *)&g_10002b0;
    v5 = &v4;
    v4 = &v5;
    v19 = (long long)a0[112];
    v20 = (long long)a0[56];
    v21 = (int)a0[52];
    v22 = (long long)a0[8];
    v23 = a1 - v22;
    v24 = 1 << ((char)(int)a0[0x100] & 31);
    v3 = (int)a0[24];
    v25 = (int)a0[28];
    if (v24 < (unsigned int)(v23 - (int)a0[28]))
    {
        v27 = arm64g_calculate_condition(v29 | 128, v30, v31, v26);
        v28 = arm64g_calculate_condition(3, (v27 & 1 ? (int)a0[40] : 0), 0, 0);
        if (!(v28 & 1))
            goto LABEL_ad066;
LABEL_ad065:
        v25 = (unsigned int)(v23 - v24);
    }
    else
    {
        v32 = arm64g_calculate_condition(v29 | 128, v30, v31, v26);
        v33 = arm64g_calculate_condition(0, (v32 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v33 & 1)
            goto LABEL_ad065;
LABEL_ad066:
    }
    if ((unsigned int)(int)a0[268] < 6)
        v34 = (int)a0[268];
    else
        v34 = 6;
    v35 = (long long)a0[96];
    iter = 1 << (v34 & 31);
    v37 = (long long)a0[248];
    v38 = v37->field_70;
    v0 = v37;
    v39 = 0xcf1bbcdcbf9b0000 * *(long long *)a1;
    v1 = v39 >> ((char)(56 - (char)v37->field_34) & 63);
    v40 = v1 >> 2 & 0x3fffffc0;
    v2 = v37->field_38 + v40;
    if ((int)a0[300])
    {
        v41 = (v39 ^ v35) >> ((char)(56 - v21) & 63);
        *(unsigned int *)&a0[44] = (unsigned int)v23;
    }
    else
    {
        v42 = a0 + 64;
        v7 = &v6;
        v6 = &v7;
        v43 = (int)a0[44];
        if (385 > (unsigned int)(v23 - v43))
        {
            v44 = v22;
            v45 = v20;
            v46 = v19;
            v9 = &v8;
            v8 = &v9;
            if ((unsigned int)v23 > (unsigned int)v43)
                goto LABEL_ad138;
        }
        else
        {
            v45 = v20;
            v46 = v19;
            v47 = arm64g_calculate_condition(129, v43 & 0xffffffff, 97, 0);
            if (!(v47 & 1))
            {
                j = v43;
                do
                {
                    idx2 = j & 7;
                    v50 = v42[idx2];
                    v42[idx2] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v22 + j + 8) ^ (long long)a0[96]) >> ((char)(56 - v21) & 63);
                    v51 = v50 >> 2 & 0x3fffffc0;
                    v52 = v20 + v51;
                    v53 = *v52 - 1;
                    if (!(v53 & 63))
                        v54 = 63;
                    else
                        v54 = 0;
                    index = v54 + (v53 & 63);
                    *v52 = index;
                    v52[index] = v50;
                    *(unsigned int *)(v19 + v51 * 4 + index * 4) = j;
                    j += 1;
                } while (v43 + 96 != j);
                v46 = (long long)a0[112];
                v45 = (long long)a0[56];
            }
            v43 = (unsigned int)v23 - 32;
            v56 = a1 + 1;
            v11 = &v10;
            v10 = &v11;
            v57 = (char *)v22 + v43;
            v58 = v56 - v57;
            if (8 <= v58 + 1)
                v59 = 8;
            else
                v59 = v58 + 1;
            if (v56 < v57)
                k = 0;
            else
                k = v59;
            if (k + (unsigned int)v43 > (unsigned int)v43)
            {
                v14 = v13;
                v61 = v43;
                do
                {
                    v62 = k;
                    v12 = &v14;
                    v14 = &v12;
                    v42[v61 & 7] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v22 + v61) ^ (long long)a0[96]) >> ((char)(56 - (int)a0[52]) & 63);
                    v61 += 1;
                    k = v62 - 1;
                } while (k);
            }
            v44 = (long long)a0[8];
            v9 = &v8;
            v8 = &v9;
            if ((unsigned int)v43 < (unsigned int)v23)
            {
LABEL_ad138:
                v64 = 56 - (int)a0[52];
                i = v43 & 0xffffffff;
                v14 = v13;
                do
                {
                    v10 = &v11;
                    v11 = &v10;
                    v12 = &v14;
                    v15 = &v12;
                    v66 = i & 7;
                    v67 = v42[v66];
                    v42[v66] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v44 + i + 8) ^ (long long)a0[96]) >> (v64 & 63);
                    v68 = v67 >> 2 & 0x3fffffc0;
                    v69 = v45 + v68;
                    v12 = &v15;
                    v14 = &v12;
                    v70 = *v69 - 1;
                    if (!(v70 & 63))
                        v71 = 63;
                    else
                        v71 = 0;
                    v72 = v71 + (v70 & 63);
                    *v69 = v72;
                    v69[v72] = v67;
                    *(unsigned int *)(v46 + v68 * 4 + v72 * 4) = i;
                    i += 1;
                } while (i < (v23 & 0xffffffff));
            }
        }
        *(unsigned int *)&a0[44] = (unsigned int)v23;
        v73 = v23 & 7;
        v41 = v42[v73];
        v42[v73] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v22 + (v23 & 0xffffffff) + 8) ^ v35) >> ((char)(56 - v21) & 63);
    }
    *(unsigned int *)&a0[104] = (int)a0[104] + v41;
    v74 = v41 >> 2 & 0x3fffffc0;
    v75 = v19 + v74 * 4;
    v76 = v20 + v74;
    v77 = *(char *)v76;
    v78 = (int128_t)v76[48];
    v79 = (int128_t)v76[32];
    v80 = (int128_t)v76[16];
    v81 = *(int128_t *)v76;
    v82 = __dirty_unsupported_Iop_SliceV128(v81, v81, 12);
    v83 = __dirty_unsupported_Iop_SliceV128(v81, v81, 12);
    v84 = __dirty_unsupported_Iop_SliceV128(v80, v80, 12);
    v85 = __dirty_unsupported_Iop_SliceV128(v80, v80, 12);
    v86 = __dirty_unsupported_Iop_SliceV128(v79, v79, 12);
    v87 = __dirty_unsupported_Iop_SliceV128(v79, v79, 12);
    v88 = __dirty_unsupported_Iop_SliceV128(v78, v78, 12);
    v89 = __dirty_unsupported_Iop_SliceV128(v78, v78, 12);
    v90 = (__m128i)(CONCAT(v41 & 0xff | (v41 & 0xff) * 0x100 | (v41 & 0xff | (v41 & 0xff) * 0x100) * 0x10000 | (v41 & 0xff | (v41 & 0xff) * 0x100 | (v41 & 0xff | (v41 & 0xff) * 0x100) * 0x10000) * 0x100000000, v41 & 0xff | (v41 & 0xff) * 0x100 | (v41 & 0xff | (v41 & 0xff) * 0x100) * 0x10000 | (v41 & 0xff | (v41 & 0xff) * 0x100 | (v41 & 0xff | (v41 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v91 = _mm_or_si128(ShrNV(_mm_or_si128(ShrNV(_mm_cmpeq_epi8(_mm_unpacklo_epi64(_mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v82, v81), _mm_unpackhi_epi8(v83, v81)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v82, v81), _mm_unpackhi_epi8(v83, v81))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v84, v80), _mm_unpackhi_epi8(v85, v80)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v84, v80), _mm_unpackhi_epi8(v85, v80)))), _mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v86, v79), _mm_unpackhi_epi8(v87, v79)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v86, v79), _mm_unpackhi_epi8(v87, v79))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v88, v78), _mm_unpackhi_epi8(v89, v78)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v88, v78), _mm_unpackhi_epi8(v89, v78))))), v90), 1), _mm_and_si128(_mm_cmpeq_epi8(_mm_unpackhi_epi64(_mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v82, v81), _mm_unpackhi_epi8(v83, v81)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v82, v81), _mm_unpackhi_epi8(v83, v81))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v84, v80), _mm_unpackhi_epi8(v85, v80)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v84, v80), _mm_unpackhi_epi8(v85, v80)))), _mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v86, v79), _mm_unpackhi_epi8(v87, v79)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v86, v79), _mm_unpackhi_epi8(v87, v79))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v88, v78), _mm_unpackhi_epi8(v89, v78)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v88, v78), _mm_unpackhi_epi8(v89, v78))))), v90), ShlNV(_mm_set1_epi8(-1), 7))), 2), _mm_and_si128(_mm_or_si128(ShrNV(_mm_cmpeq_epi8(_mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v82, v81), _mm_unpackhi_epi8(v83, v81)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v82, v81), _mm_unpackhi_epi8(v83, v81))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v84, v80), _mm_unpackhi_epi8(v85, v80)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v84, v80), _mm_unpackhi_epi8(v85, v80)))), _mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v86, v79), _mm_unpackhi_epi8(v87, v79)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v86, v79), _mm_unpackhi_epi8(v87, v79))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v88, v78), _mm_unpackhi_epi8(v89, v78)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v88, v78), _mm_unpackhi_epi8(v89, v78))))), v90), 1), _mm_and_si128(_mm_cmpeq_epi8(_mm_unpackhi_epi64(_mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v82, v81), _mm_unpackhi_epi8(v83, v81)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v82, v81), _mm_unpackhi_epi8(v83, v81))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v84, v80), _mm_unpackhi_epi8(v85, v80)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v84, v80), _mm_unpackhi_epi8(v85, v80)))), _mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v86, v79), _mm_unpackhi_epi8(v87, v79)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v86, v79), _mm_unpackhi_epi8(v87, v79))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v88, v78), _mm_unpackhi_epi8(v89, v78)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v88, v78), _mm_unpackhi_epi8(v89, v78))))), v90), ShlNV(_mm_set1_epi8(-1), 7))), ShlNV(_mm_set1_epi8(-1), 6)));
    v93 = 0;
    v94 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_or_si128(ShrNV(v91, 4), _mm_and_si128(v91, ShlNV(_mm_set1_epi8(-1), 4))), 4), _mm_srli_epi16(_mm_or_si128(ShrNV(v91, 4), _mm_and_si128(v91, ShlNV(_mm_set1_epi8(-1), 4))), 4)));
    if (v94)
    {
        if (v77 & 63)
            v94 = v94 << (char)(64 - (v77 & 63)) | v94 >> ((char)v77 & 63);
        do
        {
            v95 = ((((((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v96 = (((((((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v94 & 0xaaaaaaaaaaaaaaaa) >> 1 | v94 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v97 = ((((v96 | v95) & 0xffff0000ffff0000) >> 16 | (v96 | v95) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v96 | v95) & 0xffff0000ffff0000) >> 16 | (v96 | v95) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v97)
                v98 = 64;
            else
                v98 = Clz(v97);
            v99 = v98 + (unsigned int)v77;
            if (!(v99 & 63))
                continue;
            if (v75[v99 & 63] < v25)
                break;
            *(unsigned int *)((char *)&v14 + 4 * v93) = v75[v99 & 63];
            v93 += 1;
            iter -= 1;
        } while ((v100 = v94 - 1, v101 = v100 & v94, v100 & v94 && (v94 &= v100, iter)));
    }
    v102 = (unsigned int)v77 - 1;
    v103 = 9;
    v104 = v102 & 63;
    v105 = 0;
    if (!(v102 & 63))
        v106 = 63;
    else
        v106 = 0;
    idx = v106 + (v102 & 63);
    *(char *)v76 = idx;
    *((char *)v76 + idx) = v41;
    v108 = (int)a0[44];
    *(unsigned int *)&a0[44] = v108 + 1;
    v75[idx] = v108;
    if (v93)
    {
        v109 = &v14;
        v110 = 3;
        do
        {
            v111 = v93;
            v112 = *(int *)v109;
            v109 = (char *)v109 + 4;
            if (*(int *)((char *)v22 + v112 + v110 - 3) != *(int *)((char *)a1 + v110 - 3) || !(v113 = sub_7cdfc(a1), v113 > v110))
                continue;
            *a3 = (unsigned int)v23 + 3 - v112;
            v114 = a1 + v113;
            v110 = v113;
            v103 = 4;
            v104 = v114;
            v105 = a2;
            if (v114 == a2)
                break;
        } while ((v93 = v111 - 1, v103 = 4, v104 = v111, v105 = 1, v111 != 1));
    }
    else
    {
        v110 = 3;
    }
    v115 = v2;
    v116 = (int128_t)v115[48];
    v117 = (int128_t)v115[32];
    v118 = (int128_t)v115[16];
    v119 = *(int128_t *)v115;
    v120 = __dirty_unsupported_Iop_SliceV128(v119, v119, 12);
    v121 = __dirty_unsupported_Iop_SliceV128(v119, v119, 12);
    v122 = __dirty_unsupported_Iop_SliceV128(v118, v118, 12);
    v123 = __dirty_unsupported_Iop_SliceV128(v118, v118, 12);
    v124 = __dirty_unsupported_Iop_SliceV128(v117, v117, 12);
    v125 = __dirty_unsupported_Iop_SliceV128(v117, v117, 12);
    v126 = __dirty_unsupported_Iop_SliceV128(v116, v116, 12);
    v127 = __dirty_unsupported_Iop_SliceV128(v116, v116, 12);
    v128 = (__m128i)(CONCAT(v1 & 0xff | (v1 & 0xff) * 0x100 | (v1 & 0xff | (v1 & 0xff) * 0x100) * 0x10000 | (v1 & 0xff | (v1 & 0xff) * 0x100 | (v1 & 0xff | (v1 & 0xff) * 0x100) * 0x10000) * 0x100000000, v1 & 0xff | (v1 & 0xff) * 0x100 | (v1 & 0xff | (v1 & 0xff) * 0x100) * 0x10000 | (v1 & 0xff | (v1 & 0xff) * 0x100 | (v1 & 0xff | (v1 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v129 = _mm_or_si128(ShrNV(_mm_or_si128(ShrNV(_mm_cmpeq_epi8(_mm_unpacklo_epi64(_mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v120, v119), _mm_unpackhi_epi8(v121, v119)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v120, v119), _mm_unpackhi_epi8(v121, v119))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v122, v118), _mm_unpackhi_epi8(v123, v118)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v122, v118), _mm_unpackhi_epi8(v123, v118)))), _mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v124, v117), _mm_unpackhi_epi8(v125, v117)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v124, v117), _mm_unpackhi_epi8(v125, v117))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v126, v116), _mm_unpackhi_epi8(v127, v116)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v126, v116), _mm_unpackhi_epi8(v127, v116))))), v128), 1), _mm_and_si128(_mm_cmpeq_epi8(_mm_unpackhi_epi64(_mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v120, v119), _mm_unpackhi_epi8(v121, v119)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v120, v119), _mm_unpackhi_epi8(v121, v119))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v122, v118), _mm_unpackhi_epi8(v123, v118)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v122, v118), _mm_unpackhi_epi8(v123, v118)))), _mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v124, v117), _mm_unpackhi_epi8(v125, v117)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v124, v117), _mm_unpackhi_epi8(v125, v117))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v126, v116), _mm_unpackhi_epi8(v127, v116)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v126, v116), _mm_unpackhi_epi8(v127, v116))))), v128), ShlNV(_mm_set1_epi8(-1), 7))), 2), _mm_and_si128(_mm_or_si128(ShrNV(_mm_cmpeq_epi8(_mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v120, v119), _mm_unpackhi_epi8(v121, v119)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v120, v119), _mm_unpackhi_epi8(v121, v119))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v122, v118), _mm_unpackhi_epi8(v123, v118)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v122, v118), _mm_unpackhi_epi8(v123, v118)))), _mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v124, v117), _mm_unpackhi_epi8(v125, v117)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v124, v117), _mm_unpackhi_epi8(v125, v117))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v126, v116), _mm_unpackhi_epi8(v127, v116)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v126, v116), _mm_unpackhi_epi8(v127, v116))))), v128), 1), _mm_and_si128(_mm_cmpeq_epi8(_mm_unpackhi_epi64(_mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v120, v119), _mm_unpackhi_epi8(v121, v119)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v120, v119), _mm_unpackhi_epi8(v121, v119))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v122, v118), _mm_unpackhi_epi8(v123, v118)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v122, v118), _mm_unpackhi_epi8(v123, v118)))), _mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v124, v117), _mm_unpackhi_epi8(v125, v117)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v124, v117), _mm_unpackhi_epi8(v125, v117))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v126, v116), _mm_unpackhi_epi8(v127, v116)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v126, v116), _mm_unpackhi_epi8(v127, v116))))), v128), ShlNV(_mm_set1_epi8(-1), 7))), ShlNV(_mm_set1_epi8(-1), 6)));
    v131 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_or_si128(ShrNV(v129, 4), _mm_and_si128(v129, ShlNV(_mm_set1_epi8(-1), 4))), 4), _mm_srli_epi16(_mm_or_si128(ShrNV(v129, 4), _mm_and_si128(v129, ShlNV(_mm_set1_epi8(-1), 4))), 4)));
    if (v131)
    {
        v132 = arm64g_calculate_condition(v103 | 16, v104, v105, 0);
        v133 = arm64g_calculate_condition(3, (v132 & 1 ? iter : 0x40000000), 0, 0);
        if (!(v133 & 1))
            goto LABEL_ad3c0;
    }
    else
    {
        v134 = arm64g_calculate_condition(v103 | 16, v104, v105, 0);
        v135 = arm64g_calculate_condition(0, (v134 & 1 ? iter : 0x40000000), 0, 0);
        if (!(v135 & 1))
        {
LABEL_ad3c0:
            idx1 = 0;
            v137 = v0;
            v138 = v137->field_18;
            v139 = v137->field_0;
            v140 = v137->field_8;
            v141 = *(char *)v115;
            if (v141 & 63)
                v131 = v131 << (char)(64 - (v141 & 63)) | v131 >> ((char)v141 & 63);
            do
            {
                v142 = ((((((v131 & 0xaaaaaaaaaaaaaaaa) >> 1 | v131 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v131 & 0xaaaaaaaaaaaaaaaa) >> 1 | v131 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v131 & 0xaaaaaaaaaaaaaaaa) >> 1 | v131 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v131 & 0xaaaaaaaaaaaaaaaa) >> 1 | v131 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v143 = (((((((v131 & 0xaaaaaaaaaaaaaaaa) >> 1 | v131 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v131 & 0xaaaaaaaaaaaaaaaa) >> 1 | v131 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v131 & 0xaaaaaaaaaaaaaaaa) >> 1 | v131 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v131 & 0xaaaaaaaaaaaaaaaa) >> 1 | v131 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v144 = ((((v143 | v142) & 0xffff0000ffff0000) >> 16 | (v143 | v142) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v143 | v142) & 0xffff0000ffff0000) >> 16 | (v143 | v142) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v144)
                    v145 = 64;
                else
                    v145 = Clz(v144);
                v146 = v145 + (unsigned int)v141;
                if (!(v146 & 63))
                    continue;
                if ((unsigned int)*(int *)(v38 + v40 * 4 + (v146 & 63) * 4) < v138)
                    break;
                *(int *)((char *)&v14 + 4 * idx1) = *(int *)(v38 + v40 * 4 + (v146 & 63) * 4);
                idx1 += 1;
                iter -= 1;
            } while ((v147 = v131 - 1, v148 = v147 & v131, v147 & v131 && (v131 &= v147, iter)));
            if (idx1)
            {
                v149 = *(int *)a1;
                v150 = &v14;
                do
                {
                    v151 = idx1;
                    v152 = *(int *)v150;
                    v150 = (char *)v150 + 4;
                    v153 = v140 + v152;
                    if (*v153 == v149 && !(v154 = sub_84f30(a1 + 4, v153 + 1, a2, v139, (char *)v22 + v3) + 4, v154 <= v110 || (*a3 = (unsigned int)(v23 - v3) + (unsigned int)(v139 - v140) + 3 - v152, v110 = v154, a1 + v110 != a2)))
                        break;
                } while ((idx1 = v151 - 1, v151 != 1));
            }
        }
    }
    if (*(long long *)&g_10002b0 == v16)
        return v110;
    ___stack_chk_fail();
}
