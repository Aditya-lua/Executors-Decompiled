/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0850..0xa0ee4 (1684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0850_2 {
    struct st_a0850_3 *field_0;
} st_a0850_2;

typedef struct st_a0850_3 {
    struct st_a0850_2 *field_0;
} st_a0850_3;

typedef struct st_a0850_0 {
    char field_0;
} st_a0850_0;

typedef struct st_a0850_1 {
    long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[24];
    unsigned int field_34;
    unsigned long long field_38;
    char padding_40[48];
    unsigned long long field_70;
} st_a0850_1;

extern char g_10002b0;

unsigned long long sub_a0850(void* a0, void* a1, void* a2, unsigned long long *a3)
{
    unsigned long v20;  // x10
    unsigned long v21;  // x9
    unsigned long v27;  // cc_ndep
    unsigned long long v104;  // x22
    unsigned long long v105;  // x26
    unsigned long v106;  // x27
    unsigned long long v107;  // x0
    void* v108;  // x8
    void* v109;  // x9
    unsigned long long v110;  // x11
    __m128i v111;  // q1
    __m128i v112;  // q0
    __m128i v113;  // q2
    unsigned long long v28;  // 4112
    unsigned long v116;  // d3
    unsigned long long v117;  // x8
    unsigned long long v118;  // x8
    unsigned long long v119;  // 4112
    unsigned long long v120;  // 4102
    unsigned long long v121;  // 4112
    unsigned long long v122;  // 4102
    unsigned long long idx;  // x26
    unsigned long long v29;  // 4108
    st_a0850_1 *v124;  // x9
    unsigned int v125;  // w10
    long long v126;  // x23
    unsigned long long v127;  // x19
    unsigned long long v128;  // 4128
    unsigned long long v129;  // 4130
    unsigned long long v130;  // x13
    unsigned int v131;  // w13
    unsigned long long v132;  // w13
    unsigned long long v133;  // x13
    unsigned long v30;  // cc_op
    unsigned long long v134;  // x8
    unsigned int v135;  // w28
    st_a0850_3 **v136;  // x21
    unsigned long long v137;  // x26
    unsigned long v138;  // x27
    unsigned int *v139;  // x8
    unsigned long long v140;  // x8
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    unsigned long long v33;  // 4112
    unsigned long long v34;  // 4108
    char v22;  // x12
    unsigned long long *v23;  // x25
    char v35;  // x15
    unsigned long long v36;  // x13
    unsigned long long iter;  // w24
    st_a0850_1 *v38;  // x14
    unsigned long long v39;  // x16
    unsigned long long v40;  // x14
    unsigned long long v41;  // x1
    unsigned int v42;  // w11
    unsigned int *v43;  // x14
    void* v24;  // x22
    unsigned long v44;  // x17
    unsigned long long *v45;  // x1
    unsigned long v46;  // x15
    unsigned long v47;  // x16
    unsigned long long v48;  // 4120
    unsigned long j;  // x17
    unsigned long long idx1;  // x4
    unsigned long v51;  // x5
    unsigned long long v52;  // x3
    char *v53;  // x3
    unsigned int v25;  // w8
    unsigned int v54;  // w6
    unsigned long long v55;  // x7
    unsigned long long index;  // x6
    unsigned long long v57;  // x1
    unsigned long long v58;  // x2
    unsigned int v59;  // w3
    unsigned int v60;  // w3
    unsigned long long k;  // w1
    unsigned long v62;  // x6
    unsigned long long v63;  // w1
    unsigned int v26;  // w13
    char v65;  // x2
    unsigned long long i;  // x17
    unsigned long long idx2;  // x22
    unsigned long v68;  // x23
    unsigned long long v69;  // x21
    char *v70;  // x21
    unsigned int v71;  // w26
    unsigned long long v72;  // x27
    unsigned long long v73;  // x26
    unsigned long long v74;  // x13
    unsigned long v75;  // x12
    unsigned int *v76;  // x10
    void* v77;  // x9
    __m128i v78;  // q1
    __m128i v79;  // q0
    unsigned int v80;  // w12
    unsigned long long v81;  // x14
    __m128i v82;  // q2
    unsigned long v85;  // d3
    unsigned long long v86;  // x13
    unsigned long long v87;  // x26
    unsigned long long v88;  // x13
    unsigned long long v89;  // 4128
    unsigned long long v90;  // 4130
    unsigned long long v91;  // x16
    unsigned int v92;  // w16
    unsigned long long v93;  // w16
    unsigned long long v94;  // x16
    unsigned long long v95;  // x13
    unsigned int v96;  // w8
    unsigned long v97;  // cc_op
    unsigned long v98;  // cc_dep1
    unsigned long v99;  // cc_dep2
    unsigned long long v100;  // x12
    unsigned long long v101;  // x8
    unsigned int v102;  // w9
    st_a0850_3 **v103;  // x21
    st_a0850_1 *v0;  // [bp-0x1f0]
    void* v1;  // [bp-0x1e8]
    void* v2;  // [bp-0x1e0]
    unsigned int v3;  // [bp-0x1d8], Other Possible Types: unsigned long long
    unsigned long v4;  // [bp-0x1d0]
    st_a0850_0 **v5;  // [bp-0x1b8], Other Possible Types: char
    st_a0850_0 *v6;  // [bp-0x1b0]
    st_a0850_0 **v7;  // [bp-0x1a8], Other Possible Types: char
    st_a0850_0 *v8;  // [bp-0x1a0]
    st_a0850_0 **v9;  // [bp-0x198], Other Possible Types: char
    st_a0850_0 *v10;  // [bp-0x190]
    char *v11;  // [bp-0x188], Other Possible Types: st_a0850_0 *
    st_a0850_0 **v12;  // [bp-0x180]
    st_a0850_3 **v13;  // [bp-0x178]
    st_a0850_3 **v14;  // [bp-0x170]
    st_a0850_3 **v15;  // [bp-0x170], Other Possible Types: unsigned long
    st_a0850_3 **v16;  // [bp-0x170]
    unsigned long v17;  // [bp-0x70]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v17 = *(long long *)&g_10002b0;
    v6 = &v5;
    v5 = &v6;
    v20 = (long long)a0[112];
    v21 = (long long)a0[56];
    v22 = (int)a0[52];
    v23 = (long long)a0[8];
    v24 = a1 - v23;
    v25 = 1 << ((char)(int)a0[0x100] & 31);
    v4 = (int)a0[24];
    v26 = (int)a0[28];
    if (v25 < (unsigned int)(v24 - (int)a0[28]))
    {
        v28 = arm64g_calculate_condition(v30 | 128, v31, v32, v27);
        v29 = arm64g_calculate_condition(3, (v28 & 1 ? (int)a0[40] : 0), 0, 0);
        if (!(v29 & 1))
            goto LABEL_a08e6;
LABEL_a08e5:
        v26 = (unsigned int)(v24 - v25);
    }
    else
    {
        v33 = arm64g_calculate_condition(v30 | 128, v31, v32, v27);
        v34 = arm64g_calculate_condition(0, (v33 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v34 & 1)
            goto LABEL_a08e5;
LABEL_a08e6:
    }
    if ((unsigned int)(int)a0[268] < 5)
        v35 = (int)a0[268];
    else
        v35 = 5;
    v36 = (long long)a0[96];
    iter = 1 << (v35 & 31);
    v38 = (long long)a0[248];
    v39 = v38->field_70;
    v0 = v38;
    v1 = v24;
    v40 = 0xcf1bbcdcbb000000 * *(long long *)a1;
    v3 = v40 >> ((char)(56 - (char)v38->field_34) & 63);
    v41 = v3 >> 3 & 0x1fffffe0;
    v2 = v38->field_38 + v41;
    if ((int)a0[300])
    {
        v42 = (v40 ^ v36) >> ((char)(56 - v22) & 63);
        *(unsigned int *)&a0[44] = (unsigned int)v24;
    }
    else
    {
        v43 = a0 + 64;
        v8 = &v7;
        v7 = &v8;
        v44 = (int)a0[44];
        if (385 > (unsigned int)(v24 - v44))
        {
            v45 = v23;
            v46 = v21;
            v47 = v20;
            v10 = &v9;
            v9 = &v10;
            if ((unsigned int)v24 > (unsigned int)v44)
                goto LABEL_a09b4;
        }
        else
        {
            v46 = v21;
            v47 = v20;
            v48 = arm64g_calculate_condition(129, v44 & 0xffffffff, 97, 0);
            if (!(v48 & 1))
            {
                j = v44;
                do
                {
                    idx1 = j & 7;
                    v51 = v43[idx1];
                    v43[idx1] = (0xcf1bbcdcbb000000 * *(long long *)((char *)v23 + j + 8) ^ (long long)a0[96]) >> ((char)(56 - v22) & 63);
                    v52 = v51 >> 3 & 0x1fffffe0;
                    v53 = v21 + v52;
                    v54 = *v53 - 1;
                    if (!(v54 & 31))
                        v55 = 31;
                    else
                        v55 = 0;
                    index = v55 + (v54 & 31);
                    *v53 = index;
                    v53[index] = v51;
                    *(unsigned int *)(v20 + v52 * 4 + index * 4) = j;
                    j += 1;
                } while (v44 + 96 != j);
                v47 = (long long)a0[112];
                v46 = (long long)a0[56];
                v24 = v1;
            }
            v44 = (unsigned int)v24 - 32;
            v57 = a1 + 1;
            v12 = &v11;
            v11 = &v12;
            v58 = (char *)v23 + v44;
            v59 = v57 - v58;
            if (8 <= v59 + 1)
                v60 = 8;
            else
                v60 = v59 + 1;
            if (v57 < v58)
                k = 0;
            else
                k = v60;
            if (k + (unsigned int)v44 > (unsigned int)v44)
            {
                v15 = v14;
                v62 = v44;
                do
                {
                    v63 = k;
                    v13 = &v15;
                    v15 = &v13;
                    v43[v62 & 7] = (0xcf1bbcdcbb000000 * *(long long *)((char *)v23 + v62) ^ (long long)a0[96]) >> ((char)(56 - (int)a0[52]) & 63);
                    v62 += 1;
                    k = v63 - 1;
                } while (k);
            }
            v45 = (long long)a0[8];
            v10 = &v9;
            v9 = &v10;
            if ((unsigned int)v44 < (unsigned int)v24)
            {
LABEL_a09b4:
                v65 = 56 - (int)a0[52];
                i = v44 & 0xffffffff;
                v15 = v14;
                do
                {
                    v11 = &v12;
                    v12 = &v11;
                    v13 = &v15;
                    v16 = &v13;
                    idx2 = i & 7;
                    v68 = v43[idx2];
                    v43[idx2] = (0xcf1bbcdcbb000000 * *(long long *)((char *)v45 + i + 8) ^ (long long)a0[96]) >> (v65 & 63);
                    v69 = v68 >> 3 & 0x1fffffe0;
                    v70 = v46 + v69;
                    v13 = &v16;
                    v15 = &v13;
                    v71 = *v70 - 1;
                    if (!(v71 & 31))
                        v72 = 31;
                    else
                        v72 = 0;
                    v73 = v72 + (v71 & 31);
                    *v70 = v73;
                    v70[v73] = v68;
                    *(unsigned int *)(v47 + v69 * 4 + v73 * 4) = i;
                    i += 1;
                } while (i < (v1 & 0xffffffff));
            }
        }
        v24 = v1;
        *(unsigned int *)&a0[44] = (unsigned int)v24;
        v74 = v24 & 7;
        v42 = v43[v74];
        v43[v74] = (0xcf1bbcdcbb000000 * *(long long *)((char *)v23 + (v24 & 0xffffffff) + 8) ^ v36) >> ((char)(56 - v22) & 63);
    }
    *(unsigned int *)&a0[104] = (int)a0[104] + v42;
    v75 = v42 >> 3 & 0x1fffffe0;
    v76 = v20 + v75 * 4;
    v77 = v21 + v75;
    v78 = CatOddLanesV((int128_t)v77[16], *(int128_t *)v77);
    v79 = CatEvenLanesV((int128_t)v77[16], *(int128_t *)v77);
    v80 = *(char *)v77;
    v81 = v80 * 2;
    v82 = (__m128i)(CONCAT(v42 & 0xff | (v42 & 0xff) * 0x100 | (v42 & 0xff | (v42 & 0xff) * 0x100) * 0x10000 | (v42 & 0xff | (v42 & 0xff) * 0x100 | (v42 & 0xff | (v42 & 0xff) * 0x100) * 0x10000) * 0x100000000, v42 & 0xff | (v42 & 0xff) * 0x100 | (v42 & 0xff | (v42 & 0xff) * 0x100) * 0x10000 | (v42 & 0xff | (v42 & 0xff) * 0x100 | (v42 & 0xff | (v42 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v85 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(ShlNV(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v82, v78), 6), _mm_srli_epi16(_mm_cmpeq_epi8(v82, v78), 6))), 4), _mm_and_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v82, v79), 6), _mm_srli_epi16(_mm_cmpeq_epi8(v82, v79), 6))), ShrNV(_mm_set1_epi8(-1), 4))));
    v86 = __double_as_longlong(v85);
    if (v81 & 63)
        v86 = v86 << (char)(64 - (v81 & 63)) | v86 >> ((char)v81 & 63);
    v87 = 0;
    v88 = v86 & 0x5555555555555555;
    if (v86 & 0x5555555555555555)
    {
        do
        {
            v89 = ((((((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v90 = (((((((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v91 = ((((v90 | v89) & 0xffff0000ffff0000) >> 16 | (v90 | v89) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v90 | v89) & 0xffff0000ffff0000) >> 16 | (v90 | v89) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v91)
                v92 = 64;
            else
                v92 = Clz(v91);
            v93 = __ROL__(v92 + ((unsigned int)v81 & 254), 31) & 0x8000001f & 31;
            if (!v93)
                continue;
            if (v76[v93] < v26)
                break;
            *(unsigned int *)((char *)&v15 + 4 * v87) = v76[v93];
            v87 += 1;
            iter -= 1;
        } while ((v94 = v88 - 1, v95 = v94 & v88, v94 & v88 && (v88 &= v94, iter)));
    }
    v96 = v80 - 1;
    v97 = 9;
    v98 = v96 & 31;
    v99 = 0;
    if (!(v96 & 31))
        v100 = 31;
    else
        v100 = 0;
    v101 = v100 + (v96 & 31);
    *(char *)v77 = v101;
    *((char *)v77 + v101) = v42;
    v102 = (int)a0[44];
    *(unsigned int *)&a0[44] = v102 + 1;
    v76[v101] = v102;
    if (v87)
    {
        v103 = &v15;
        v104 = 3;
        do
        {
            v105 = v87;
            v106 = *(int *)v103;
            v103 = (char *)v103 + 4;
            if (*(int *)((char *)v23 + v106 + v104 - 3) != *(int *)((char *)a1 + v104 - 3) || !(v107 = sub_7cdfc(a1), v107 > v104))
                continue;
            *a3 = (unsigned int)v24 + 3 - v106;
            v108 = a1 + v107;
            v104 = v107;
            v97 = 4;
            v98 = v108;
            v99 = a2;
            if (v108 == a2)
                break;
        } while ((v87 = v105 - 1, v97 = 4, v98 = v105, v99 = 1, v105 != 1));
    }
    else
    {
        v104 = 3;
    }
    v109 = v2;
    v110 = *(char *)v109 * 2;
    v111 = CatOddLanesV((int128_t)v109[16], *(int128_t *)v109);
    v112 = CatEvenLanesV((int128_t)v109[16], *(int128_t *)v109);
    v113 = (__m128i)(CONCAT(v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000 | (v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000) * 0x100000000, v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000 | (v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v116 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(ShlNV(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v113, v111), 6), _mm_srli_epi16(_mm_cmpeq_epi8(v113, v111), 6))), 4), _mm_and_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v113, v112), 6), _mm_srli_epi16(_mm_cmpeq_epi8(v113, v112), 6))), ShrNV(_mm_set1_epi8(-1), 4))));
    v117 = __double_as_longlong(v116);
    if (v110 & 63)
        v117 = v117 << (char)(64 - (v110 & 63)) | v117 >> ((char)v110 & 63);
    v118 = v117 & 0x5555555555555555;
    if (v118)
    {
        v119 = arm64g_calculate_condition(v97 | 16, v98, v99, 0);
        v120 = arm64g_calculate_condition(3, (v119 & 1 ? iter : 0x40000000), 0, 0);
        if (!(v120 & 1))
            goto LABEL_a0c40;
    }
    else
    {
        v121 = arm64g_calculate_condition(v97 | 16, v98, v99, 0);
        v122 = arm64g_calculate_condition(0, (v121 & 1 ? iter : 0x40000000), 0, 0);
        if (!(v122 & 1))
        {
LABEL_a0c40:
            idx = 0;
            v124 = v0;
            v125 = v124->field_18;
            v126 = v124->field_0;
            v127 = v124->field_8;
            do
            {
                v128 = ((((((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v129 = (((((((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v118 & 0xaaaaaaaaaaaaaaaa) >> 1 | v118 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v130 = ((((v129 | v128) & 0xffff0000ffff0000) >> 16 | (v129 | v128) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v129 | v128) & 0xffff0000ffff0000) >> 16 | (v129 | v128) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v130)
                    v131 = 64;
                else
                    v131 = Clz(v130);
                v132 = __ROL__(v131 + ((unsigned int)v110 & 254), 31) & 0x8000001f & 31;
                if (!v132)
                    continue;
                if ((unsigned int)*(int *)(v39 + v41 * 4 + v132 * 4) < v125)
                    break;
                *(int *)((char *)&v15 + 4 * idx) = *(int *)(v39 + v41 * 4 + v132 * 4);
                idx += 1;
                iter -= 1;
            } while ((v133 = v118 - 1, v134 = v133 & v118, v133 & v118 && (v118 &= v133, iter)));
            if (idx)
            {
                v135 = *(int *)a1;
                v3 = (unsigned int)((v1 & 0xffffffff) - v4) + (unsigned int)(v126 - v127) + 3;
                v136 = &v15;
                do
                {
                    v137 = idx;
                    v138 = *(int *)v136;
                    v136 = (char *)v136 + 4;
                    v139 = v127 + v138;
                    if (*v139 == v135 && !(v140 = sub_84f30(a1 + 4, v139 + 1, a2, v126, (char *)v23 + v4) + 4, v140 <= v104 || (*a3 = v3 - v138, v104 = v140, a1 + v104 != a2)))
                        break;
                } while ((idx = v137 - 1, v137 != 1));
            }
        }
    }
    if (*(long long *)&g_10002b0 == v17)
        return v104;
    ___stack_chk_fail();
}
