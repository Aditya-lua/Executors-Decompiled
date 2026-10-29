/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93dbc..0x94510 (1876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_93dbc_6 {
    unsigned int field_0;
    char field_4;
    char padding_5[7];
    unsigned int field_c;
} st_93dbc_6;

typedef struct st_93dbc_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[96];
    unsigned long long field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[128];
    unsigned int field_108;
} st_93dbc_1;

typedef struct st_93dbc_2 {
    struct st_93dbc_5 *field_0;
} st_93dbc_2;

typedef struct st_93dbc_5 {
    struct st_93dbc_2 *field_0;
} st_93dbc_5;

typedef struct st_93dbc_0 {
    char field_0;
} st_93dbc_0;

extern char g_10002b0;

unsigned int sub_93dbc(void* a0, void* a1, long long a2, unsigned long long *a3)
{
    unsigned long long v26;  // x12
    unsigned long v27;  // x11
    unsigned long v34;  // cc_dep2
    unsigned long long j;  // x8
    unsigned int *v111;  // x9
    unsigned long long v112;  // x8
    unsigned int *v113;  // x9
    unsigned int v115;  // w20
    unsigned long v116;  // x26
    unsigned int *v117;  // x8
    unsigned int v118;  // x8
    unsigned long long v119;  // 4120
    unsigned long v35;  // cc_ndep
    unsigned long long k;  // x1
    unsigned long long idx;  // x5
    unsigned int v122;  // x6
    unsigned long long v123;  // x4
    char *v124;  // x4
    unsigned int v125;  // w7
    unsigned int v126;  // x19
    unsigned long long index;  // x7
    unsigned long v128;  // x2
    unsigned long v129;  // x3
    unsigned long long v36;  // 4112
    unsigned int v130;  // w4
    unsigned int v131;  // w4
    unsigned int l;  // w2
    unsigned long long iter;  // x7
    unsigned int v134;  // w2
    unsigned long long v37;  // 4108
    unsigned long v38;  // cc_op
    unsigned long v39;  // cc_dep1
    unsigned long long v40;  // 4112
    unsigned long long v41;  // 4108
    unsigned long long *v28;  // x10
    unsigned int v29;  // x13
    unsigned int v42;  // w8
    unsigned long long i;  // x1
    char v44;  // x8
    unsigned long long v45;  // x14
    unsigned int v46;  // x24
    unsigned long long v47;  // x15
    unsigned long v48;  // x8
    unsigned long long v49;  // 4164
    unsigned long long *v30;  // x25
    unsigned int v50;  // w16
    unsigned int v51;  // x12
    unsigned int *v52;  // x15
    unsigned int v53;  // x23
    unsigned long long *v54;  // x2
    unsigned long long *v55;  // x16
    unsigned long v56;  // x17
    char v57;  // x3
    unsigned long long idx1;  // x23
    unsigned int v59;  // x26
    void* v31;  // x23
    unsigned long long v60;  // x22
    char *v61;  // x22
    unsigned int v62;  // w27
    unsigned int v63;  // x28
    unsigned long long idx2;  // x27
    unsigned long long v65;  // x14
    unsigned long v66;  // x13
    unsigned int *v67;  // x11
    void* v68;  // x10
    __m128i v69;  // q1
    unsigned int v32;  // w8
    __m128i v70;  // q0
    unsigned int v71;  // w13
    __m128i v72;  // q2
    unsigned long v75;  // d3
    unsigned long v76;  // x14
    unsigned int v77;  // x19
    unsigned long long v78;  // x14
    unsigned long long v79;  // 4128
    unsigned int v33;  // w9
    unsigned long long v80;  // 4130
    unsigned int v81;  // x17
    unsigned int v82;  // w17
    unsigned int v83;  // w17
    unsigned long v84;  // x17
    unsigned long long v85;  // x17
    unsigned int v86;  // w9
    unsigned long long v87;  // x9
    unsigned int v88;  // w8
    st_93dbc_5 **v89;  // x28
    unsigned int v90;  // x19
    unsigned long v91;  // x27
    unsigned int v92;  // x0
    st_93dbc_1 *v93;  // x9
    unsigned long v94;  // x22
    unsigned long v95;  // x28
    st_93dbc_6 *v96;  // x26
    unsigned int *v97;  // x19
    unsigned int v98;  // w8
    unsigned int v99;  // w9
    unsigned long long v100;  // 4234
    unsigned int v101;  // x24
    unsigned long v102;  // x20
    unsigned int *v103;  // x8
    unsigned int v104;  // x27
    unsigned int v105;  // w8
    unsigned int v106;  // w9
    unsigned long v107;  // x26
    unsigned int v108;  // w8
    unsigned int v109;  // w9
    unsigned int v0;  // [bp-0x200]
    unsigned int v1;  // [bp-0x1f4]
    unsigned long long *v2;  // [bp-0x1f0]
    unsigned int v3;  // [bp-0x1e4]
    void* v4;  // [bp-0x1e0]
    unsigned int v5;  // [bp-0x1d8]
    st_93dbc_1 *v6;  // [bp-0x1d8]
    unsigned long v7;  // [bp-0x1c8]
    st_93dbc_0 **v8;  // [bp-0x1b8], Other Possible Types: char
    st_93dbc_0 *v9;  // [bp-0x1b0]
    st_93dbc_0 **v10;  // [bp-0x1a8], Other Possible Types: char
    st_93dbc_0 *v11;  // [bp-0x1a0]
    st_93dbc_0 **v13;  // [bp-0x198]
    st_93dbc_0 *v14;  // [bp-0x190]
    char *v15;  // [bp-0x188]
    char *v16;  // [bp-0x188]
    st_93dbc_0 **v17;  // [bp-0x180]
    st_93dbc_5 **v18;  // [bp-0x178]
    st_93dbc_5 **v19;  // [bp-0x178]
    st_93dbc_5 **v20;  // [bp-0x170]
    st_93dbc_5 **v21;  // [bp-0x170], Other Possible Types: unsigned long
    st_93dbc_5 **v22;  // [bp-0x170]
    unsigned long long v23;  // [bp-0x70]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v23 = *(long long *)&g_10002b0;
    v26 = 0xcf1bbcdcbb000000;
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
            goto LABEL_93e56;
LABEL_93e55:
        v33 = (unsigned int)(v31 - v32);
    }
    else
    {
        v40 = arm64g_calculate_condition(v38 | 128, v39, v34, v35);
        v41 = arm64g_calculate_condition(0, (v40 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v41 & 1)
            goto LABEL_93e55;
LABEL_93e56:
    }
    v42 = (int)a0[268];
    i = v42 - 5;
    if (v42 < 5)
        v44 = v42;
    else
        v44 = 5;
    v45 = (long long)a0[96];
    v46 = 1 << (v44 & 31);
    v47 = 0xcf1bbcdcbb000000 * *(long long *)a1;
    v48 = v47 >> ((char)(66 - *(int *)((long long)a0[248] + 264)) & 63);
    v4 = v31;
    v6 = (long long)a0[248];
    v49 = arm64g_calculate_condition(131, v42, 5, 0);
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
        v52 = a0 + 64;
        v11 = &v10;
        v10 = &v11;
        i = (int)a0[44];
        v21 = v20;
        v53 = (unsigned int)v31;
        if (385 <= (unsigned int)(v53 - i))
            goto LABEL_943a4;
        v54 = v30;
        v55 = v28;
        v56 = v27;
        v14 = &v13;
        v13 = &v14;
        if ((unsigned int)v31 > (unsigned int)i)
            goto LABEL_93f10;
        goto LABEL_93fc4;
    }
    while (1)
    {
        *(unsigned int *)&a0[104] = (int)a0[104] + v51;
        v66 = v51 >> 3 & 0x1fffffe0;
        v67 = v27 + v66 * 4;
        v68 = (char *)v28 + v66;
        v69 = CatOddLanesV((int128_t)v68[16], *(int128_t *)v68);
        v70 = CatEvenLanesV((int128_t)v68[16], *(int128_t *)v68);
        v71 = *(char *)v68;
        v52 = v71 * 2;
        v72 = (__m128i)(CONCAT(v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000 | (v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000) * 0x100000000, v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000 | (v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000) * 0x100000000));
        v75 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(ShlNV(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v72, v69), 6), _mm_srli_epi16(_mm_cmpeq_epi8(v72, v69), 6))), 4), _mm_and_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v72, v70), 6), _mm_srli_epi16(_mm_cmpeq_epi8(v72, v70), 6))), ShrNV(_mm_set1_epi8(-1), 4))));
        v76 = __double_as_longlong(v75);
        if (v52 & 0x3f)
            v76 = v76 << (char)(64 - (v52 & 63)) | v76 >> ((char)v52 & 63);
        v77 = 0;
        v78 = v76 & 0x5555555555555555;
        v45 = v78;
        if (v76 & 0x5555555555555555)
        {
            v52 = (unsigned int)v52 & 254;
            do
            {
                v79 = ((((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v80 = (((((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v81 = ((((v80 | v79) & 0xffff0000ffff0000) >> 16 | (v80 | v79) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v80 | v79) & 0xffff0000ffff0000) >> 16 | (v80 | v79) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v81)
                    v82 = 64;
                else
                    v82 = Clz(v81);
                v83 = __ROL__(v82 + (unsigned int)v52, 31) & 0x8000001f & 31;
                if (!v83)
                    continue;
                v84 = v67[v83];
                v45 = v78;
                if ((unsigned int)v84 < v33)
                    break;
                i = (char *)v30 + v84;
                *(unsigned int *)((char *)&v21 + 4 * v77) = v84;
                v77 += 1;
                v46 -= 1;
            } while ((v85 = v78 - 1, v45 = v85 & v78, v85 & v78 && (v78 = v45, v46)));
        }
        v86 = v71 - 1;
        if (!(v86 & 31))
            v29 = 31;
        else
            v29 = 0;
        v87 = v29 + (v86 & 31);
        *(char *)v68 = v87;
        *((char *)v68 + v87) = v51;
        v88 = (int)a0[44];
        *(unsigned int *)&a0[44] = v88 + 1;
        v67[v87] = v88;
        if (v77)
        {
            v89 = &v21;
            v53 = 3;
            do
            {
                v90 = v77;
                v91 = *(int *)v89;
                v89 = (char *)v89 + 4;
                i = (char *)v30 + v91;
                if (*(int *)(i + v53 - 3) == *(int *)((char *)a1 + v53 - 3) && !(v92 = sub_7cdfc(a1), v92 <= v53 || (*a3 = (unsigned int)v31 + 3 - v91, v53 = v92, a1 + v92 != a2)))
                    break;
            } while ((v77 = v90 - 1, v90 != 1));
        }
        else
        {
            v53 = 3;
        }
        v21 = &v19;
        v18 = &v21;
        v93 = v6;
        v94 = v93->field_0;
        v95 = v93->field_8;
        v96 = v93->field_70 + v48 * 16;
        v28 = v96->field_c;
        v97 = v93->field_80 + (v28 >> 8) * 4;
        v27 = v94 - v95 - v7;
        v98 = v3;
        v99 = v46 + v98;
        v100 = arm64g_calculate_condition(1, v46 & 0xffffffff, v98, 0);
        if (!(v100 & 1))
        {
            v2 = v28;
            v1 = v99;
            if (v99 < 3)
                v46 = v99;
            else
                v46 = 3;
            v3 = v27;
            v5 = (unsigned int)v4 + (unsigned int)v27 + 3;
            v0 = v46;
            do
            {
                v101 = v46;
                v102 = v96->field_0;
                v96 = &v96->field_4;
                if ((unsigned int)v102)
                {
                    v103 = v95 + v102;
                    v28 = *(int *)a1;
                    if (*v103 == (unsigned int)v28 && (i = v103 + 1, v104 = sub_84f30(a1 + 4, i, a2, v94, (char *)v30 + v7) + 4, v104 > v53 && (*a3 = v5 - v102, v53 = v104, a1 + v104 == a2)))
                        goto LABEL_94324;
                    else
                        goto LABEL_941f4;
                }
                else
                {
                    v104 = v53;
                    goto LABEL_94324;
                }
LABEL_941f4:
            } while ((v46 = v101 - 1, v101 != 1));
            v27 = v3;
            v28 = v2;
            v51 = v0;
            v105 = (unsigned int)v28 & 0xff;
            v106 = v1 - v51;
            if (v106 < v105)
                v107 = v106;
            else
                v107 = v105;
            if (!(unsigned int)v107)
                goto LABEL_94384;
            goto LABEL_9427c;
        }
        else
        {
            v51 = 0;
            v108 = (unsigned int)v28 & 0xff;
            v109 = v99 - 0;
            if (v109 < v108)
                v107 = v109;
            else
                v107 = v108;
            if ((unsigned int)v107)
            {
LABEL_9427c:
                j = (v107 * 4 | v107 >> 62) & 0x3fffffffc & 0x3ffffffff;
                v111 = v97;
                do
                {
                    v112 = j;
                    v113 = v111 + 1;
                    v28 = v95 + *v111;
                    j = v112 - 4;
                    v111 = v113;
                } while (j);
                v115 = *(int *)a1;
                v101 = (unsigned int)(a1 + 4);
                v5 = (unsigned int)v4 + (unsigned int)v27 + 3;
                v104 = v53;
                do
                {
                    v116 = v107;
                    v53 = *v97;
                    v97 += 1;
                    v117 = v95 + v53;
                    if (*v117 == v115 && !(i = v117 + 1, v118 = sub_84f30(v101, i, a2, v94, (char *)v30 + v7) + 4, v118 <= v104 || (v28 = a3, *v28 = v5 - v53, v104 = v118, a1 + v104 != a2)))
                        break;
                } while ((v107 = (unsigned int)v116 - 1, (unsigned int)v116 != 1));
LABEL_94324:
                v48 = v23;
                v33 = *(long long *)&g_10002b0;
                v46 = v101;
                if (*(long long *)&g_10002b0 == v48)
                    return v104;
                goto LABEL_943a0;
            }
            else
            {
LABEL_94384:
                v48 = v23;
                v33 = *(long long *)&g_10002b0;
                if (*(long long *)&g_10002b0 == v48)
                    return v53;
LABEL_943a0:
                a0 = ___stack_chk_fail();
                v26 = v51;
LABEL_943a4:
                v55 = v28;
                v56 = v27;
                v119 = arm64g_calculate_condition(129, i & 0xffffffff, 97, 0);
                if (!(v119 & 1))
                {
                    k = i;
                    do
                    {
                        idx = k & 7;
                        v122 = v52[idx];
                        v52[idx] = (v26 * *(long long *)((char *)v30 + k + 8) ^ (long long)a0[96]) >> ((char)(56 - v29) & 63);
                        v123 = v122 >> 3 & 0x1fffffe0;
                        v124 = (char *)v28 + v123;
                        v125 = *v124 - 1;
                        if (!(v125 & 31))
                            v126 = 31;
                        else
                            v126 = 0;
                        index = v126 + (v125 & 31);
                        *v124 = index;
                        v124[index] = v122;
                        *(unsigned int *)(v27 + v123 * 4 + index * 4) = k;
                        k += 1;
                    } while (i + 96 != k);
                    v56 = (long long)a0[112];
                    v55 = (long long)a0[56];
                    v53 = (unsigned int)v4;
                }
                i = v53 - 32;
                v128 = a1 + 1;
                v17 = &v15;
                v16 = &v17;
                v129 = (char *)v30 + i;
                v130 = v128 - v129;
                if (8 <= v130 + 1)
                    v131 = 8;
                else
                    v131 = v130 + 1;
                if (v128 < v129)
                    l = 0;
                else
                    l = v131;
                if (l + (unsigned int)i > (unsigned int)i)
                {
                    iter = i;
                    do
                    {
                        v134 = l;
                        v18 = &v21;
                        v21 = &v18;
                        v52[iter & 7] = (v26 * *(long long *)((char *)v30 + iter) ^ (long long)a0[96]) >> ((char)(56 - (int)a0[52]) & 63);
                        iter += 1;
                        l = v134 - 1;
                    } while (l);
                }
                v54 = (long long)a0[8];
                v14 = &v13;
                v13 = &v14;
                if ((unsigned int)i < v53)
                {
LABEL_93f10:
                    v57 = 56 - (int)a0[52];
                    i &= 0xffffffff;
                    v21 = v20;
                    do
                    {
                        v15 = &v17;
                        v17 = &v15;
                        v18 = &v21;
                        v22 = &v18;
                        idx1 = i & 7;
                        v59 = v52[idx1];
                        v52[idx1] = (v26 * *(long long *)((char *)v54 + i + 8) ^ (long long)a0[96]) >> (v57 & 63);
                        v60 = v59 >> 3 & 0x1fffffe0;
                        v61 = (char *)v55 + v60;
                        v19 = &v22;
                        v21 = &v19;
                        v62 = *v61 - 1;
                        if (!(v62 & 31))
                            v63 = 31;
                        else
                            v63 = 0;
                        idx2 = v63 + (v62 & 31);
                        *v61 = idx2;
                        v61[idx2] = v59;
                        *(unsigned int *)(v56 + v60 * 4 + idx2 * 4) = i;
                        i += 1;
                    } while (i < (v4 & 0xffffffff));
                }
LABEL_93fc4:
                v31 = v4;
                *(unsigned int *)&a0[44] = (unsigned int)v31;
                v65 = v31 & 7;
                v51 = v52[v65];
                v52[v65] = (v26 * *(long long *)((char *)v30 + (v31 & 0xffffffff) + 8) ^ v45) >> ((char)(56 - v29) & 63);
            }
        }
    }
}
