/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x952e0..0x9594c (1644 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_952e0_2 {
    struct st_952e0_3 *field_0;
} st_952e0_2;

typedef struct st_952e0_3 {
    struct st_952e0_2 *field_0;
} st_952e0_3;

typedef struct st_952e0_0 {
    char field_0;
} st_952e0_0;

typedef struct st_952e0_1 {
    long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[24];
    unsigned int field_34;
    unsigned long long field_38;
    char padding_40[48];
    unsigned long long field_70;
} st_952e0_1;

extern char g_10002b0;

unsigned long long sub_952e0(void* a0, void* a1, void* a2, unsigned long long *a3)
{
    unsigned long v20;  // x10
    unsigned long v21;  // x9
    unsigned long v27;  // cc_ndep
    unsigned long long v104;  // x0
    void* v105;  // x8
    unsigned long long v106;  // x11
    __m128i v107;  // q1
    unsigned long v108;  // d0
    unsigned long long v109;  // x8
    unsigned long long v110;  // x8
    unsigned long long v111;  // 4112
    unsigned long long v112;  // 4102
    unsigned long long v113;  // 4112
    unsigned long long v28;  // 4112
    unsigned long long v114;  // 4102
    unsigned long long idx;  // x26
    st_952e0_1 *v116;  // x9
    unsigned int v117;  // w10
    long long v118;  // x23
    unsigned long long v119;  // x19
    unsigned long long v120;  // 4128
    unsigned long long v121;  // 4130
    unsigned long long v122;  // x13
    unsigned int v123;  // w13
    unsigned long long v29;  // 4108
    unsigned long long v124;  // w13
    unsigned long long v125;  // x13
    unsigned long long v126;  // x8
    unsigned int v127;  // w28
    st_952e0_3 **v128;  // x21
    unsigned long long v129;  // x26
    unsigned long v130;  // x27
    unsigned int *v131;  // x8
    unsigned long long v132;  // x8
    unsigned long v30;  // cc_op
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    unsigned long long v33;  // 4112
    unsigned long long v34;  // 4108
    char v22;  // x12
    unsigned long long *v23;  // x25
    char v35;  // x15
    unsigned long long v36;  // x13
    unsigned long long iter;  // w24
    st_952e0_1 *v38;  // x14
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
    unsigned long long v78;  // x14
    __m128i v79;  // q0
    __m128i v80;  // q1
    unsigned long long v82;  // x12
    unsigned long long v83;  // x13
    unsigned long long v84;  // x26
    unsigned long long v85;  // x13
    unsigned long long v86;  // 4128
    unsigned long long v87;  // 4130
    unsigned long long v88;  // x16
    unsigned int v89;  // w16
    unsigned long long v90;  // w16
    unsigned long long v91;  // x16
    unsigned long long v92;  // x13
    unsigned int v93;  // w8
    unsigned long v94;  // cc_op
    unsigned long v95;  // cc_dep1
    unsigned long v96;  // cc_dep2
    unsigned long long v97;  // x12
    unsigned long long v98;  // x8
    unsigned int v99;  // w9
    st_952e0_3 **v100;  // x21
    unsigned long long v101;  // x22
    unsigned long long v102;  // x26
    unsigned long v103;  // x27
    st_952e0_1 *v0;  // [bp-0x1f0]
    void* v1;  // [bp-0x1e8]
    void* v2;  // [bp-0x1e0]
    unsigned int v3;  // [bp-0x1d8], Other Possible Types: unsigned long long
    unsigned long v4;  // [bp-0x1d0]
    st_952e0_0 **v5;  // [bp-0x1b8], Other Possible Types: char
    st_952e0_0 *v6;  // [bp-0x1b0]
    st_952e0_0 **v7;  // [bp-0x1a8], Other Possible Types: char
    st_952e0_0 *v8;  // [bp-0x1a0]
    st_952e0_0 **v9;  // [bp-0x198], Other Possible Types: char
    st_952e0_0 *v10;  // [bp-0x190]
    char *v11;  // [bp-0x188], Other Possible Types: st_952e0_0 *
    st_952e0_0 **v12;  // [bp-0x180]
    st_952e0_3 **v13;  // [bp-0x178]
    st_952e0_3 **v14;  // [bp-0x170]
    st_952e0_3 **v15;  // [bp-0x170], Other Possible Types: unsigned long
    st_952e0_3 **v16;  // [bp-0x170]
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
            goto LABEL_95376;
LABEL_95375:
        v26 = (unsigned int)(v24 - v25);
    }
    else
    {
        v33 = arm64g_calculate_condition(v30 | 128, v31, v32, v27);
        v34 = arm64g_calculate_condition(0, (v33 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v34 & 1)
            goto LABEL_95375;
LABEL_95376:
    }
    if ((unsigned int)(int)a0[268] < 4)
        v35 = (int)a0[268];
    else
        v35 = 4;
    v36 = (long long)a0[96];
    iter = 1 << (v35 & 31);
    v38 = (long long)a0[248];
    v39 = v38->field_70;
    v0 = v38;
    v1 = v24;
    v40 = 0xcf1bbcdcbf9b0000 * *(long long *)a1;
    v3 = v40 >> ((char)(56 - (char)v38->field_34) & 63);
    v41 = v3 >> 4 & 0xffffff0;
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
                goto LABEL_95440;
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
                    v43[idx1] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v23 + j + 8) ^ (long long)a0[96]) >> ((char)(56 - v22) & 63);
                    v52 = v51 >> 4 & 0xffffff0;
                    v53 = v21 + v52;
                    v54 = *v53 - 1;
                    if (!(v54 & 15))
                        v55 = 15;
                    else
                        v55 = 0;
                    index = v55 + (v54 & 15);
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
                    v43[v62 & 7] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v23 + v62) ^ (long long)a0[96]) >> ((char)(56 - (int)a0[52]) & 63);
                    v62 += 1;
                    k = v63 - 1;
                } while (k);
            }
            v45 = (long long)a0[8];
            v10 = &v9;
            v9 = &v10;
            if ((unsigned int)v44 < (unsigned int)v24)
            {
LABEL_95440:
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
                    v43[idx2] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v45 + i + 8) ^ (long long)a0[96]) >> (v65 & 63);
                    v69 = v68 >> 4 & 0xffffff0;
                    v70 = v46 + v69;
                    v13 = &v16;
                    v15 = &v13;
                    v71 = *v70 - 1;
                    if (!(v71 & 15))
                        v72 = 15;
                    else
                        v72 = 0;
                    v73 = v72 + (v71 & 15);
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
        v43[v74] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v23 + (v24 & 0xffffffff) + 8) ^ v36) >> ((char)(56 - v22) & 63);
    }
    *(unsigned int *)&a0[104] = (int)a0[104] + v42;
    v75 = v42 >> 4 & 0xffffff0;
    v76 = v20 + v75 * 4;
    v77 = v21 + v75;
    v78 = *(char *)v77 * 4;
    v79 = *(int128_t *)v77;
    v80 = (__m128i)(CONCAT(v42 & 0xff | (v42 & 0xff) * 0x100 | (v42 & 0xff | (v42 & 0xff) * 0x100) * 0x10000 | (v42 & 0xff | (v42 & 0xff) * 0x100 | (v42 & 0xff | (v42 & 0xff) * 0x100) * 0x10000) * 0x100000000, v42 & 0xff | (v42 & 0xff) * 0x100 | (v42 & 0xff | (v42 & 0xff) * 0x100) * 0x10000 | (v42 & 0xff | (v42 & 0xff) * 0x100 | (v42 & 0xff | (v42 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v82 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v79, v80), 4), _mm_srli_epi16(_mm_cmpeq_epi8(v79, v80), 4)));
    if (!(v78 & 63))
        v83 = v82;
    else
        v83 = v82 << (char)(64 - (v78 & 63)) | v82 >> ((char)v78 & 63);
    v84 = 0;
    v85 = v83 & 0x8888888888888888;
    if (v83 & 0x8888888888888888)
    {
        do
        {
            v86 = ((((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v87 = (((((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v88 = ((((v87 | v86) & 0xffff0000ffff0000) >> 16 | (v87 | v86) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v87 | v86) & 0xffff0000ffff0000) >> 16 | (v87 | v86) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v88)
                v89 = 64;
            else
                v89 = Clz(v88);
            v90 = __ROL__(v89 + ((unsigned int)v78 & 252), 30) & 0xc000000f & 15;
            if (!v90)
                continue;
            if (v76[v90] < v26)
                break;
            *(unsigned int *)((char *)&v15 + 4 * v84) = v76[v90];
            v84 += 1;
            iter -= 1;
        } while ((v91 = v85 - 1, v92 = v91 & v85, v91 & v85 && (v85 &= v91, iter)));
    }
    v93 = (char)_mm_extract_epi8(v79, 0) - 1;
    v94 = 9;
    v95 = v93 & 15;
    v96 = 0;
    if (!(v93 & 15))
        v97 = 15;
    else
        v97 = 0;
    v98 = v97 + (v93 & 15);
    *(char *)v77 = v98;
    *((char *)v77 + v98) = v42;
    v99 = (int)a0[44];
    *(unsigned int *)&a0[44] = v99 + 1;
    v76[v98] = v99;
    if (v84)
    {
        v100 = &v15;
        v101 = 3;
        do
        {
            v102 = v84;
            v103 = *(int *)v100;
            v100 = (char *)v100 + 4;
            if (*(int *)((char *)v23 + v103 + v101 - 3) != *(int *)((char *)a1 + v101 - 3) || !(v104 = sub_7cdfc(a1), v104 > v101))
                continue;
            *a3 = (unsigned int)v24 + 3 - v103;
            v105 = a1 + v104;
            v101 = v104;
            v94 = 4;
            v95 = v105;
            v96 = a2;
            if (v105 == a2)
                break;
        } while ((v84 = v102 - 1, v94 = 4, v95 = v102, v96 = 1, v102 != 1));
    }
    else
    {
        v101 = 3;
    }
    v106 = *(char *)v2 * 4;
    v107 = (__m128i)(CONCAT(v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000 | (v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000) * 0x100000000, v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000 | (v3 & 0xff | (v3 & 0xff) * 0x100 | (v3 & 0xff | (v3 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v108 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)v2, v107), 4), _mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)v2, v107), 4)));
    v109 = __double_as_longlong(v108);
    if (v106 & 63)
        v109 = v109 << (char)(64 - (v106 & 63)) | v109 >> ((char)v106 & 63);
    v110 = v109 & 0x8888888888888888;
    if (v110)
    {
        v111 = arm64g_calculate_condition(v94 | 16, v95, v96, 0);
        v112 = arm64g_calculate_condition(3, (v111 & 1 ? iter : 0x40000000), 0, 0);
        if (!(v112 & 1))
            goto LABEL_956b0;
    }
    else
    {
        v113 = arm64g_calculate_condition(v94 | 16, v95, v96, 0);
        v114 = arm64g_calculate_condition(0, (v113 & 1 ? iter : 0x40000000), 0, 0);
        if (!(v114 & 1))
        {
LABEL_956b0:
            idx = 0;
            v116 = v0;
            v117 = v116->field_18;
            v118 = v116->field_0;
            v119 = v116->field_8;
            do
            {
                v120 = ((((((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v121 = (((((((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v122 = ((((v121 | v120) & 0xffff0000ffff0000) >> 16 | (v121 | v120) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v121 | v120) & 0xffff0000ffff0000) >> 16 | (v121 | v120) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v122)
                    v123 = 64;
                else
                    v123 = Clz(v122);
                v124 = __ROL__(v123 + ((unsigned int)v106 & 252), 30) & 0xc000000f & 15;
                if (!v124)
                    continue;
                if ((unsigned int)*(int *)(v39 + v41 * 4 + v124 * 4) < v117)
                    break;
                *(int *)((char *)&v15 + 4 * idx) = *(int *)(v39 + v41 * 4 + v124 * 4);
                idx += 1;
                iter -= 1;
            } while ((v125 = v110 - 1, v126 = v125 & v110, v125 & v110 && (v110 &= v125, iter)));
            if (idx)
            {
                v127 = *(int *)a1;
                v3 = (unsigned int)((v1 & 0xffffffff) - v4) + (unsigned int)(v118 - v119) + 3;
                v128 = &v15;
                do
                {
                    v129 = idx;
                    v130 = *(int *)v128;
                    v128 = (char *)v128 + 4;
                    v131 = v119 + v130;
                    if (*v131 == v127 && !(v132 = sub_84f30(a1 + 4, v131 + 1, a2, v118, (char *)v23 + v4) + 4, v132 <= v101 || (*a3 = v3 - v130, v101 = v132, a1 + v101 != a2)))
                        break;
                } while ((idx = v129 - 1, v129 != 1));
            }
        }
    }
    if (*(long long *)&g_10002b0 == v17)
        return v101;
    ___stack_chk_fail();
}
