/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6004..0xa676c (1896 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6004_6 {
    unsigned int field_0;
    char field_4;
    char padding_5[7];
    unsigned int field_c;
} st_a6004_6;

typedef struct st_a6004_5 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[96];
    unsigned long long field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[128];
    unsigned int field_108;
} st_a6004_5;

typedef struct st_a6004_1 {
    struct st_a6004_4 *field_0;
} st_a6004_1;

typedef struct st_a6004_4 {
    struct st_a6004_1 *field_0;
} st_a6004_4;

typedef struct st_a6004_0 {
    char field_0;
} st_a6004_0;

extern char g_10002b0;

unsigned int sub_a6004(void* a0, void* a1, long long a2, unsigned long long *a3)
{
    unsigned long long v26;  // x12
    unsigned long v27;  // x11
    unsigned long v34;  // cc_dep2
    unsigned int v110;  // x27
    unsigned int v111;  // w8
    unsigned int v112;  // w9
    unsigned long v113;  // x26
    unsigned int v114;  // w8
    unsigned int v115;  // w9
    unsigned long long j;  // x8
    unsigned int *v117;  // x9
    unsigned long long v118;  // x8
    unsigned int *v119;  // x9
    unsigned long v35;  // cc_ndep
    unsigned int v121;  // w20
    unsigned long v122;  // x26
    unsigned int *v123;  // x8
    unsigned int v124;  // x8
    unsigned long long v125;  // 4120
    unsigned long long k;  // x1
    unsigned long long idx;  // x5
    unsigned int v128;  // x6
    unsigned long long v129;  // x4
    unsigned long long v36;  // 4112
    char *v130;  // x4
    unsigned int v131;  // w7
    unsigned int v132;  // x19
    unsigned long long idx1;  // x7
    unsigned long v134;  // x2
    unsigned long v135;  // x3
    unsigned int v136;  // w4
    unsigned int v137;  // w4
    unsigned int l;  // w2
    unsigned long long iter;  // x7
    unsigned long long v37;  // 4108
    unsigned int v140;  // w2
    unsigned long v38;  // cc_op
    unsigned long v39;  // cc_dep1
    unsigned long long v40;  // 4112
    unsigned long long v41;  // 4108
    unsigned long long *v28;  // x10
    unsigned int v29;  // x13
    unsigned int v42;  // w8
    unsigned long long i;  // x1
    char v44;  // x8
    unsigned int v45;  // x14
    unsigned int v46;  // x24
    st_a6004_4 **v47;  // x15
    unsigned long v48;  // x8
    unsigned long long v49;  // 4164
    unsigned long long *v30;  // x25
    unsigned int v50;  // w16
    unsigned int v51;  // x12
    unsigned int v52;  // x23
    unsigned long long *v53;  // x2
    unsigned long long *v54;  // x16
    unsigned long v55;  // x17
    char v56;  // x3
    unsigned long long idx2;  // x23
    unsigned int v58;  // x26
    unsigned long long v59;  // x22
    void* v31;  // x23
    char *v60;  // x22
    unsigned int v61;  // w27
    unsigned int v62;  // x28
    unsigned long long v63;  // x27
    unsigned long long v64;  // x14
    unsigned long v65;  // x13
    unsigned int *v66;  // x11
    void* v67;  // x10
    unsigned long v68;  // x13
    __m128i v69;  // 4178
    unsigned int v32;  // w8
    __m128i v70;  // 4180
    __m128i v71;  // 4182
    __m128i v72;  // 4184
    __m128i v73;  // 4188
    __m128i v74;  // 4190
    __m128i v75;  // 4193
    __m128i v76;  // 4195
    __m128i v77;  // 4198
    __m128i v78;  // 4200
    __m128i v79;  // 4203
    unsigned int v33;  // w9
    __m128i v80;  // 4205
    __m128i v81;  // q4
    __m128i v82;  // q0
    unsigned int v84;  // x19
    unsigned int v85;  // x14
    unsigned long long v86;  // 4128
    unsigned long long v87;  // 4130
    unsigned int v88;  // x16
    unsigned int v89;  // w16
    unsigned int v90;  // w16
    unsigned long v91;  // x16
    unsigned int v92;  // w9
    unsigned long long index;  // x9
    unsigned int v94;  // w8
    st_a6004_4 **v95;  // x28
    unsigned int v96;  // x19
    unsigned long v97;  // x27
    unsigned int v98;  // x0
    st_a6004_5 *v99;  // x9
    unsigned long v100;  // x22
    unsigned long v101;  // x28
    st_a6004_6 *v102;  // x26
    unsigned int *v103;  // x19
    unsigned int v104;  // w8
    unsigned int v105;  // w9
    unsigned long long v106;  // 4234
    unsigned int v107;  // x24
    unsigned long v108;  // x20
    unsigned int *v109;  // x8
    unsigned int v0;  // [bp-0x200]
    unsigned int v1;  // [bp-0x1f4]
    unsigned long long *v2;  // [bp-0x1f0]
    unsigned int v3;  // [bp-0x1e4]
    void* v4;  // [bp-0x1e0]
    unsigned int v5;  // [bp-0x1d8]
    st_a6004_5 *v6;  // [bp-0x1d8]
    unsigned long v7;  // [bp-0x1c8]
    st_a6004_0 **v8;  // [bp-0x1b8], Other Possible Types: char
    st_a6004_0 *v9;  // [bp-0x1b0]
    st_a6004_0 **v10;  // [bp-0x1a8], Other Possible Types: char
    st_a6004_0 *v11;  // [bp-0x1a0]
    st_a6004_0 **v13;  // [bp-0x198]
    st_a6004_0 *v14;  // [bp-0x190]
    char *v15;  // [bp-0x188]
    char *v16;  // [bp-0x188]
    st_a6004_0 **v17;  // [bp-0x180]
    st_a6004_4 **v18;  // [bp-0x178]
    st_a6004_4 **v19;  // [bp-0x178]
    st_a6004_4 **v20;  // [bp-0x170]
    st_a6004_4 **v21;  // [bp-0x170], Other Possible Types: unsigned long
    st_a6004_4 **v22;  // [bp-0x170]
    unsigned long long v23;  // [bp-0x70]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v23 = *(long long *)&g_10002b0;
    v26 = 0xcf1bbcdcbf9b0000;
    v9 = &v8;
    v8 = &v9;
    v27 = (long long)a0[112];
    v28 = (long long)a0[56];
    v29 = (int)a0[52];
    v30 = (long long)a0[8];
    v31 = a1 - v30;
    v32 = 1 << ((char)(int)a0[0x100] & 31);
    v7 = (int)a0[24];
    v33 = (int)a0[28];
    if (v32 < (unsigned int)(v31 - (int)a0[28]))
    {
        v36 = arm64g_calculate_condition(v38 | 128, v39, v34, v35);
        v37 = arm64g_calculate_condition(3, (v36 & 1 ? (int)a0[40] : 0), 0, 0);
        if (!(v37 & 1))
            goto LABEL_a609e;
LABEL_a609d:
        v33 = (unsigned int)(v31 - v32);
    }
    else
    {
        v40 = arm64g_calculate_condition(v38 | 128, v39, v34, v35);
        v41 = arm64g_calculate_condition(0, (v40 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v41 & 1)
            goto LABEL_a609d;
LABEL_a609e:
    }
    v42 = (int)a0[268];
    i = v42 - 6;
    if (v42 < 6)
        v44 = v42;
    else
        v44 = 6;
    v45 = (long long)a0[96];
    v46 = 1 << (v44 & 31);
    v47 = 0xcf1bbcdcbf9b0000 * *(long long *)a1;
    v48 = v47 >> ((char)(66 - *(int *)((long long)a0[248] + 264)) & 63);
    v4 = v31;
    v6 = (long long)a0[248];
    v49 = arm64g_calculate_condition(131, v42, 6, 0);
    if (v49 & 1)
        v50 = 1 << ((char)i & 31);
    else
        v50 = 0;
    v3 = v50;
    if ((int)a0[300])
    {
        v51 = (v47 ^ v45) >> ((char)(56 - v29) & 63);
        *(unsigned int *)&a0[44] = (unsigned int)v31;
    }
    else
    {
        v47 = a0 + 64;
        v11 = &v10;
        v10 = &v11;
        i = (int)a0[44];
        v21 = v20;
        v52 = (unsigned int)v31;
        if (385 <= (unsigned int)(v52 - i))
            goto LABEL_a65f8;
        v53 = v30;
        v54 = v28;
        v55 = v27;
        v14 = &v13;
        v13 = &v14;
        if ((unsigned int)v31 > (unsigned int)i)
            goto LABEL_a6158;
        goto LABEL_a6210;
    }
    while (1)
    {
        *(unsigned int *)&a0[104] = (int)a0[104] + v51;
        v65 = v51 >> 2 & 0x3fffffc0;
        v66 = v27 + v65 * 4;
        v67 = (char *)v28 + v65;
        v68 = *(char *)v67;
        v69 = (int128_t)v67[48];
        v70 = (int128_t)v67[32];
        v71 = (int128_t)v67[16];
        v72 = *(int128_t *)v67;
        v73 = __dirty_unsupported_Iop_SliceV128(v72, v72, 12);
        v74 = __dirty_unsupported_Iop_SliceV128(v72, v72, 12);
        v75 = __dirty_unsupported_Iop_SliceV128(v71, v71, 12);
        v76 = __dirty_unsupported_Iop_SliceV128(v71, v71, 12);
        v77 = __dirty_unsupported_Iop_SliceV128(v70, v70, 12);
        v78 = __dirty_unsupported_Iop_SliceV128(v70, v70, 12);
        v79 = __dirty_unsupported_Iop_SliceV128(v69, v69, 12);
        v80 = __dirty_unsupported_Iop_SliceV128(v69, v69, 12);
        v81 = (__m128i)(CONCAT(v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000 | (v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000) * 0x100000000, v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000 | (v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000) * 0x100000000));
        v82 = _mm_or_si128(ShrNV(_mm_or_si128(ShrNV(_mm_cmpeq_epi8(_mm_unpacklo_epi64(_mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)))), _mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69))))), v81), 1), _mm_and_si128(_mm_cmpeq_epi8(_mm_unpackhi_epi64(_mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)))), _mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69))))), v81), ShlNV(_mm_set1_epi8(-1), 7))), 2), _mm_and_si128(_mm_or_si128(ShrNV(_mm_cmpeq_epi8(_mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)))), _mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69))))), v81), 1), _mm_and_si128(_mm_cmpeq_epi8(_mm_unpackhi_epi64(_mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)))), _mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69))))), v81), ShlNV(_mm_set1_epi8(-1), 7))), ShlNV(_mm_set1_epi8(-1), 6)));
        v84 = 0;
        v85 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_or_si128(ShrNV(v82, 4), _mm_and_si128(v82, ShlNV(_mm_set1_epi8(-1), 4))), 4), _mm_srli_epi16(_mm_or_si128(ShrNV(v82, 4), _mm_and_si128(v82, ShlNV(_mm_set1_epi8(-1), 4))), 4)));
        v45 = v85;
        if (v45)
        {
            if (v68 & 63)
                v85 = v85 << (char)(64 - (v68 & 63)) | v85 >> ((char)v68 & 63);
            v47 = &v21;
            do
            {
                v86 = ((((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v87 = (((((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v88 = ((((v87 | v86) & 0xffff0000ffff0000) >> 16 | (v87 | v86) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v87 | v86) & 0xffff0000ffff0000) >> 16 | (v87 | v86) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v88)
                    v89 = 64;
                else
                    v89 = Clz(v88);
                v90 = v89 + (unsigned int)v68;
                if (!(v90 & 63))
                    continue;
                v45 = v85;
                if (v66[v90 & 63] < v33)
                    break;
                *(unsigned int *)((char *)&v21 + 4 * v84) = v66[v90 & 63];
                v84 += 1;
                v46 -= 1;
            } while ((v91 = v85 - 1, v45 = v91 & v85, v91 & v85 && (v85 = v45, v46)));
        }
        v92 = (unsigned int)v68 - 1;
        if (!(v92 & 63))
            v29 = 63;
        else
            v29 = 0;
        index = v29 + (v92 & 63);
        *(char *)v67 = index;
        *((char *)v67 + index) = v51;
        v94 = (int)a0[44];
        *(unsigned int *)&a0[44] = v94 + 1;
        v66[index] = v94;
        if (v84)
        {
            v95 = &v21;
            v52 = 3;
            do
            {
                v96 = v84;
                v97 = *(int *)v95;
                v95 = (char *)v95 + 4;
                i = (char *)v30 + v97;
                if (*(int *)(i + v52 - 3) == *(int *)((char *)a1 + v52 - 3) && !(v98 = sub_7cdfc(a1), v98 <= v52 || (*a3 = (unsigned int)v31 + 3 - v97, v52 = v98, a1 + v98 != a2)))
                    break;
            } while ((v84 = v96 - 1, v96 != 1));
        }
        else
        {
            v52 = 3;
        }
        v21 = &v19;
        v18 = &v21;
        v99 = v6;
        v100 = v99->field_0;
        v101 = v99->field_8;
        v102 = v99->field_70 + v48 * 16;
        v28 = v102->field_c;
        v103 = v99->field_80 + (v28 >> 8) * 4;
        v27 = v100 - v101 - v7;
        v104 = v3;
        v105 = v46 + v104;
        v106 = arm64g_calculate_condition(1, v46 & 0xffffffff, v104, 0);
        if (!(v106 & 1))
        {
            v2 = v28;
            v1 = v105;
            if (v105 < 3)
                v46 = v105;
            else
                v46 = 3;
            v3 = v27;
            v5 = (unsigned int)v4 + (unsigned int)v27 + 3;
            v0 = v46;
            do
            {
                v107 = v46;
                v108 = v102->field_0;
                v102 = &v102->field_4;
                if ((unsigned int)v108)
                {
                    v109 = v101 + v108;
                    v28 = *(int *)a1;
                    if (*v109 == (unsigned int)v28 && (i = v109 + 1, v110 = sub_84f30(a1 + 4, i, a2, v100, (char *)v30 + v7) + 4, v110 > v52 && (*a3 = v5 - v108, v52 = v110, a1 + v110 == a2)))
                        goto LABEL_a6578;
                    else
                        goto LABEL_a6448;
                }
                else
                {
                    v110 = v52;
                    goto LABEL_a6578;
                }
LABEL_a6448:
            } while ((v46 = v107 - 1, v107 != 1));
            v27 = v3;
            v28 = v2;
            v51 = v0;
            v111 = (unsigned int)v28 & 0xff;
            v112 = v1 - v51;
            if (v112 < v111)
                v113 = v112;
            else
                v113 = v111;
            if (!(unsigned int)v113)
                goto LABEL_a65d8;
            goto LABEL_a64d0;
        }
        else
        {
            v51 = 0;
            v114 = (unsigned int)v28 & 0xff;
            v115 = v105 - 0;
            if (v115 < v114)
                v113 = v115;
            else
                v113 = v114;
            if ((unsigned int)v113)
            {
LABEL_a64d0:
                j = (v113 * 4 | v113 >> 62) & 0x3fffffffc & 0x3ffffffff;
                v117 = v103;
                do
                {
                    v118 = j;
                    v119 = v117 + 1;
                    v28 = v101 + *v117;
                    j = v118 - 4;
                    v117 = v119;
                } while (j);
                v121 = *(int *)a1;
                v107 = (unsigned int)(a1 + 4);
                v5 = (unsigned int)v4 + (unsigned int)v27 + 3;
                v110 = v52;
                do
                {
                    v122 = v113;
                    v52 = *v103;
                    v103 += 1;
                    v123 = v101 + v52;
                    if (*v123 == v121 && !(i = v123 + 1, v124 = sub_84f30(v107, i, a2, v100, (char *)v30 + v7) + 4, v124 <= v110 || (v28 = a3, *v28 = v5 - v52, v110 = v124, a1 + v110 != a2)))
                        break;
                } while ((v113 = (unsigned int)v122 - 1, (unsigned int)v122 != 1));
LABEL_a6578:
                v48 = v23;
                v33 = *(long long *)&g_10002b0;
                v46 = v107;
                if (*(long long *)&g_10002b0 == v48)
                    return v110;
                goto LABEL_a65f4;
            }
            else
            {
LABEL_a65d8:
                v48 = v23;
                v33 = *(long long *)&g_10002b0;
                if (*(long long *)&g_10002b0 == v48)
                    return v52;
LABEL_a65f4:
                a0 = ___stack_chk_fail();
                v26 = v51;
LABEL_a65f8:
                v54 = v28;
                v55 = v27;
                v125 = arm64g_calculate_condition(129, i & 0xffffffff, 97, 0);
                if (!(v125 & 1))
                {
                    k = i;
                    do
                    {
                        idx = k & 7;
                        v128 = *(int *)((char *)v47 + 4 * idx);
                        *(unsigned int *)((char *)v47 + 4 * idx) = (v26 * *(long long *)((char *)v30 + k + 8) ^ (long long)a0[96]) >> ((char)(56 - v29) & 63);
                        v129 = v128 >> 2 & 0x3fffffc0;
                        v130 = (char *)v28 + v129;
                        v131 = *v130 - 1;
                        if (!(v131 & 63))
                            v132 = 63;
                        else
                            v132 = 0;
                        idx1 = v132 + (v131 & 63);
                        *v130 = idx1;
                        v130[idx1] = v128;
                        *(unsigned int *)(v27 + v129 * 4 + idx1 * 4) = k;
                        k += 1;
                    } while (i + 96 != k);
                    v55 = (long long)a0[112];
                    v54 = (long long)a0[56];
                    v52 = (unsigned int)v4;
                }
                i = v52 - 32;
                v134 = a1 + 1;
                v17 = &v15;
                v16 = &v17;
                v135 = (char *)v30 + i;
                v136 = v134 - v135;
                if (8 <= v136 + 1)
                    v137 = 8;
                else
                    v137 = v136 + 1;
                if (v134 < v135)
                    l = 0;
                else
                    l = v137;
                if (l + (unsigned int)i > (unsigned int)i)
                {
                    iter = i;
                    do
                    {
                        v140 = l;
                        v18 = &v21;
                        v21 = &v18;
                        *(unsigned int *)((char *)v47 + 4 * (iter & 7)) = (v26 * *(long long *)((char *)v30 + iter) ^ (long long)a0[96]) >> ((char)(56 - (int)a0[52]) & 63);
                        iter += 1;
                        l = v140 - 1;
                    } while (l);
                }
                v53 = (long long)a0[8];
                v14 = &v13;
                v13 = &v14;
                if ((unsigned int)i < v52)
                {
LABEL_a6158:
                    v56 = 56 - (int)a0[52];
                    i &= 0xffffffff;
                    v21 = v20;
                    do
                    {
                        v15 = &v17;
                        v17 = &v15;
                        v18 = &v21;
                        v22 = &v18;
                        idx2 = i & 7;
                        v58 = *(int *)((char *)v47 + 4 * idx2);
                        *(unsigned int *)((char *)v47 + 4 * idx2) = (v26 * *(long long *)((char *)v53 + i + 8) ^ (long long)a0[96]) >> (v56 & 63);
                        v59 = v58 >> 2 & 0x3fffffc0;
                        v60 = (char *)v54 + v59;
                        v19 = &v22;
                        v21 = &v19;
                        v61 = *v60 - 1;
                        if (!(v61 & 63))
                            v62 = 63;
                        else
                            v62 = 0;
                        v63 = v62 + (v61 & 63);
                        *v60 = v63;
                        v60[v63] = v58;
                        *(unsigned int *)(v55 + v59 * 4 + v63 * 4) = i;
                        i += 1;
                    } while (i < (v4 & 0xffffffff));
                }
LABEL_a6210:
                v31 = v4;
                *(unsigned int *)&a0[44] = (unsigned int)v31;
                v64 = v31 & 7;
                v51 = *(int *)((char *)v47 + 4 * v64);
                *(unsigned int *)((char *)v47 + 4 * v64) = (v26 * *(long long *)((char *)v30 + (v31 & 0xffffffff) + 8) ^ v45) >> ((char)(56 - v29) & 63);
            }
        }
    }
}
