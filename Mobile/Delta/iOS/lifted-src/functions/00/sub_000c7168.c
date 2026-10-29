/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc7168..0xc7a68 (2304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c7168_1 {
    struct st_c7168_0 *field_0;
    struct st_c7168_0 *field_8;
    struct st_c7168_0 *field_10;
} st_c7168_1;

typedef struct st_c7168_5 {
    struct st_c7168_6 *field_0;
} st_c7168_5;

typedef struct st_c7168_6 {
    struct st_c7168_5 *field_0;
} st_c7168_6;

typedef struct st_c7168_0 {
    char padding_0[4];
    unsigned int field_4;
} st_c7168_0;

typedef struct st_c7168_4 {
    unsigned short field_0;
    char field_2;
    char field_3;
    unsigned int field_4;
} st_c7168_4;

typedef struct st_c7168_2 {
    char field_0;
} st_c7168_2;

typedef struct st_c7168_3 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_c7168_3;

extern st_c7168_3 g_cc1908;
extern unsigned long long g_cc1988;
extern st_c7168_3 g_cc1990;
extern st_c7168_3 g_cc19b0;

void* sub_c7168(st_c7168_1 *a0, void* a1, long long a2, long long a3, long long a4, void* a5)
{
    void* i;  // w21
    void* v33;  // x22
    unsigned int v42;  // w11
    unsigned long long *node;  // x8
    unsigned long long *v44;  // x12
    uint128_t *v45;  // x4
    unsigned long v46;  // x9
    unsigned long long v47;  // x9
    unsigned long v48;  // x13
    unsigned int v49;  // w10
    unsigned long long *v50;  // x11
    unsigned long v51;  // x9
    unsigned long v34;  // x9
    unsigned long long v52;  // x9
    unsigned long v53;  // x12
    unsigned int v54;  // w10
    unsigned long long *v55;  // x9
    unsigned long v56;  // x12
    unsigned long long v57;  // x9
    unsigned long long *v58;  // x8
    unsigned int v59;  // w9
    void* iter;  // x26
    void* v61;  // w21
    long long v35;  // x24
    st_c7168_4 *v62;  // x10
    st_c7168_4 *v63;  // x12
    st_c7168_4 *v64;  // x1
    void* v65;  // x27
    void* v66;  // x8
    unsigned long v67;  // x0
    void* v68;  // w15
    void* v69;  // w17
    void* v70;  // w16
    unsigned int v71;  // w14
    uint128_t *v36;  // x1
    unsigned int v72;  // w12
    unsigned int v73;  // w10
    unsigned int v74;  // w2
    void* v75;  // x25
    unsigned long v76;  // cc_dep1
    unsigned long long v77;  // 4110
    unsigned long long v78;  // 4120
    unsigned long long *v79;  // x0
    unsigned long long v80;  // 4109
    unsigned long long v81;  // x0
    uint128_t *v37;  // x8
    unsigned int v82;  // w2
    void* v83;  // x1
    unsigned int v84;  // w1
    unsigned long v85;  // x16
    unsigned long long *v86;  // x17
    unsigned long long *v87;  // x0
    unsigned long long v88;  // x1
    unsigned long long v89;  // x0
    unsigned long long *v90;  // x17
    unsigned int v91;  // w16
    void* v38;  // x23
    unsigned int v92;  // w17
    unsigned long long v93;  // x15
    unsigned int v94;  // w16
    unsigned int v95;  // w14
    unsigned int v96;  // w11
    unsigned long long *v97;  // x9
    unsigned long long *v98;  // x10
    unsigned long v99;  // x12
    unsigned long long v100;  // x10
    unsigned long long *v101;  // x9
    unsigned long long v39;  // 4106
    unsigned int v102;  // w10
    void* iter1;  // x20
    uint128_t *v104;  // x11
    uint128_t *v105;  // x10
    void* v106;  // x9
    void* v107;  // x28
    void* iter2;  // x8
    uint128_t *v109;  // x11
    void* v111;  // x22
    unsigned long v40;  // x8
    void* j;  // x10
    void* v113;  // x9
    unsigned long v115;  // x8
    void* v116;  // x9
    void* v117;  // x10
    void* l;  // x11
    void* v119;  // x8
    void* m;  // x10
    unsigned long long v41;  // x9
    uint128_t *v122;  // x9
    unsigned long long v124;  // 4106
    unsigned long long v126;  // x20
    void* v127;  // x8
    long long v0;  // [bp-0x160]
    unsigned long v1;  // [bp-0x158]
    void* v2;  // [bp-0x150]
    unsigned long long v3;  // [bp-0x148]
    unsigned long long v4;  // [bp-0x140]
    uint128_t *v5;  // [bp-0x138]
    st_c7168_2 **v6;  // [bp-0x130], Other Possible Types: char
    st_c7168_2 *v7;  // [bp-0x128]
    unsigned long long v8;  // [bp-0x120]
    unsigned int v9;  // [bp-0x118]
    unsigned long long *v10;  // [bp-0x110]
    unsigned long long *v11;  // [bp-0x108]
    unsigned long long *v12;  // [bp-0x100]
    unsigned long long v13;  // [bp-0xf8]
    unsigned long v14;  // [bp-0xf0]
    unsigned long long v15;  // [bp-0xe8]
    unsigned long v16;  // [bp-0xe0]
    unsigned long long v17;  // [bp-0xd8]
    unsigned long v18;  // [bp-0xd0]
    __m128i v19;  // [bp-0xc8]
    unsigned long v20;  // [bp-0xb8]
    uint128_t *v21;  // [bp-0xb0]
    void* v22;  // [bp-0xa8], Other Possible Types: st_c7168_6 **
    void* v23;  // [bp-0xa0]
    void* v24;  // [bp-0x98]
    st_c7168_6 **v25;  // [bp-0x90]
    st_c7168_6 **v26;  // [bp-0x88]
    st_c7168_6 **v27;  // [bp-0x80]
    st_c7168_6 **v28;  // [bp-0x78]
    st_c7168_6 **v29;  // [bp-0x70]
    char *v30;  // [bp-0x10]
    char v31;  // [bp+0x0]

    v30 = &v31;
    i = a5;
    v33 = a1;
    v34 = (char *)&a0[1111].field_10 + 4;
    v7 = &v6;
    v6 = &v7;
    if (*(int *)(v34 + 3684))
    {
        v35 = a0[1264].field_10;
        v36 = a0[1255].field_0;
        v21 = v36;
        v37 = v36 + a0[1256].field_8;
        if (!i)
            goto LABEL_c72c4;
LABEL_c71cc:
        v5 = v37;
        v38 = a0[1245].field_10;
        v3 = a0[1246].field_8;
        v4 = a0[1246].field_0;
        *(unsigned int *)(v34 + 3320) = 1;
        v19 = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v34), 32);
        v1 = v34;
        v20 = *(int *)(v34 + 8);
        v39 = arm64g_calculate_condition(130, sub_c6a78(&v8, a3, a4), 120, 0);
        if (v39 & 1)
            return 0xffffffffffffffec;
        v40 = a0->field_0->field_4;
        v41 = v8;
        v42 = v9 + (unsigned int)v40;
        v13 = v41 >> ((char)-v42 & 63) & (&g_cc1908.field_0)[v40];
        v22 = &v29;
        v29 = &v22;
        if (65 > v42)
        {
            node = v10;
            if (v12 > node)
            {
                v44 = v11;
                v45 = v5;
                if (node == v44)
                    goto LABEL_c72fc;
                v46 = v42 >> 3;
                if ((char *)node - v46 < v44)
                    v47 = node - v44 & 0xffffffff;
                else
                    v47 = v46 & 0xffffffff;
                node = (char *)node - v47;
                v10 = node;
                v42 -= (unsigned int)v47 * 8;
            }
            else
            {
                node = (char *)node - (v42 >> 3);
                v10 = node;
                v42 &= 7;
            }
            v9 = v42;
            v41 = *node;
            v8 = v41;
            v45 = v5;
        }
        else
        {
            node = &g_cc1988;
            v10 = &g_cc1988;
            v45 = v5;
        }
LABEL_c72fc:
        v14 = a0->field_0 + 1;
        v48 = a0->field_10->field_4;
        v49 = (unsigned int)v48 + v42;
        v15 = v41 >> ((char)-v49 & 63) & (&g_cc1908.field_0)[v48];
        if (65 > v49)
        {
            if (v12 > node)
            {
                v50 = v11;
                if (node == v50)
                    goto LABEL_c7388;
                v51 = v49 >> 3;
                if ((char *)node - v51 < v50)
                    v52 = node - v50 & 0xffffffff;
                else
                    v52 = v51 & 0xffffffff;
                node = (char *)node - v52;
                v10 = node;
                v49 -= (unsigned int)v52 * 8;
            }
            else
            {
                node = (char *)node - (v49 >> 3);
                v10 = node;
                v49 &= 7;
            }
            v41 = *node;
            v8 = v41;
        }
        else
        {
            node = &g_cc1988;
            v10 = &g_cc1988;
        }
LABEL_c7388:
        v16 = a0->field_10 + 1;
        v53 = a0->field_8->field_4;
        v54 = (unsigned int)v53 + v49;
        v9 = v54;
        v17 = v41 >> ((char)-v54 & 63) & (&g_cc1908.field_0)[v53];
        v22 = &v29;
        v29 = &v22;
        v2 = v33;
        if (65 > v54)
        {
            if (v12 > node)
            {
                v55 = v11;
                if (node == v55)
                    goto LABEL_c7434;
                v56 = v54 >> 3;
                if ((char *)node - v56 < v55)
                    v57 = node - v55 & 0xffffffff;
                else
                    v57 = v56 & 0xffffffff;
                v58 = (char *)node - v57;
                v10 = v58;
                v59 = v54 - (unsigned int)v57 * 8;
            }
            else
            {
                v58 = (char *)node - (v54 >> 3);
                v10 = v58;
                v59 = v54 & 7;
            }
            v9 = v59;
            v8 = *v58;
        }
        else
        {
            v10 = &g_cc1988;
        }
LABEL_c7434:
        v0 = v35;
        v18 = a0->field_8 + 1;
        iter = v2;
        do
        {
            v61 = i;
            v25 = &v26;
            v26 = &v25;
            v62 = v14 + v13 * 8;
            v63 = v18 + v17 * 8;
            v64 = v16 + v15 * 8;
            v65 = v63->field_4;
            v66 = v62->field_4;
            v67 = v64->field_4;
            v68 = (void*)v62->field_2;
            v69 = (void*)v63->field_2;
            v70 = (void*)v64->field_2;
            v71 = v62->field_3;
            v72 = v63->field_3;
            v73 = v64->field_3;
            if (v70 >= 2)
            {
                v74 = v9;
                v9 = (unsigned int)(v74 + v70);
                v75 = (v8 << ((char)v74 & 63) >> ((char)-v70 & 63)) + v67;
                goto LABEL_c74c8;
            }
            else
            {
                v76 = v66 & 0xffffffff;
                if (!v70)
                {
                    v77 = arm64g_calculate_condition(3, v76, 0, 0);
                    v78 = arm64g_calculate_condition(19, v76, 0, 0);
                    v75 = *(long long *)((char *)&v19 + 8 * !(v78 & 1));
                    v79 = (char *)&v19 + 8 * !(v77 & 1);
LABEL_c74f0:
                    v19 = (__m128i)(CONCAT(*v79, v75));
                    if (v69)
                    {
                        v84 = v9;
                        v9 = (unsigned int)(v84 + v69);
                        v65 += v8 << ((char)v84 & 63) >> ((char)-v69 & 63);
                    }
                    if (31 <= (char)v69 + (char)v68 + (char)v70)
                    {
                        v27 = &v28;
                        v28 = &v27;
                        v85 = v9;
                        if (65 > (unsigned int)v85)
                        {
                            v86 = v10;
                            if (v12 > v86)
                            {
                                v87 = v11;
                                if (v86 == v87)
                                    goto LABEL_c7530;
                                v88 = v85 >> 3;
                                if ((char *)v86 - v88 < v87)
                                    v89 = v86 - v87 & 0xffffffff;
                                else
                                    v89 = v88 & 0xffffffff;
                                v90 = (char *)v86 - v89;
                                v10 = v90;
                                v91 = (unsigned int)v85 - (unsigned int)v89 * 8;
                            }
                            else
                            {
                                v22 = &v29;
                                v29 = &v22;
                                v90 = (char *)v86 - (v85 >> 3);
                                v10 = v90;
                                v91 = (unsigned int)v85 & 7;
                            }
                            v9 = v91;
                            v8 = *v90;
                        }
                        else
                        {
                            v10 = &g_cc1988;
                        }
                    }
LABEL_c7530:
                    if (v68)
                    {
                        v92 = v9;
                        v9 = (unsigned int)(v92 + v68);
                        v66 += v8 << ((char)v92 & 63) >> ((char)-v68 & 63);
                    }
                    if (v61 != 1)
                    {
                        v93 = v8;
                        v94 = v9 + v71;
                        v95 = v94 + v72;
                        v17 = (v93 >> ((char)-v95 & 63) & (&g_cc1908.field_0)[v72 & 0xff]) + v63->field_0;
                        v96 = v95 + v73;
                        v9 = v96;
                        v13 = (v93 >> ((char)-v94 & 63) & (&g_cc1908.field_0)[v71 & 0xff]) + v62->field_0;
                        v15 = (v93 >> ((char)-v96 & 63) & (&g_cc1908.field_0)[v73 & 0xff]) + v64->field_0;
                        v27 = &v28;
                        v28 = &v27;
                        if (65 > v96)
                        {
                            v97 = v10;
                            if (v12 > v97)
                            {
                                v98 = v11;
                                if (v97 == v98)
                                    goto LABEL_c7640;
                                v99 = v96 >> 3;
                                if ((char *)v97 - v99 < v98)
                                    v100 = v97 - v98 & 0xffffffff;
                                else
                                    v100 = v99 & 0xffffffff;
                                v101 = (char *)v97 - v100;
                                v10 = v101;
                                v102 = v96 - (unsigned int)v100 * 8;
                            }
                            else
                            {
                                v22 = &v29;
                                v29 = &v22;
                                v101 = (char *)v97 - (v96 >> 3);
                                v10 = v101;
                                v102 = v96 & 7;
                            }
                            v9 = v102;
                            v8 = *v101;
                        }
                        else
                        {
                            v10 = &g_cc1988;
                        }
                    }
LABEL_c7640:
                    v27 = &v28;
                    v28 = &v27;
                    iter1 = iter + v66;
                    v104 = v21;
                    v105 = v104 + v66;
                    v106 = iter1 - v75;
                    if (v45 >= v105 && !(v107 = v66 + v65, (unsigned long long)(v35 - 32) < iter + v107))
                    {
                        *(uint128_t *)iter = *v104;
                        if (16 < v66)
                        {
                            *(uint128_t *)&iter[16] = v104[1];
                            if (v66 - 16 >= 0x11)
                            {
                                iter2 = iter + 32;
                                v109 = v104 + 3;
                                do
                                {
                                    *(int128_t *)iter2 = *(int128_t *)((char *)v109 - 16);
                                    *(uint128_t *)&iter2[16] = *v109;
                                    iter2 += 32;
                                    v109 += 2;
                                } while (iter2 < iter1);
                            }
                        }
                        v21 = v105;
                        if (v75 > iter1 - v38)
                        {
                            if (iter1 - v4 < v75)
                                return 0xffffffffffffffec;
                            v111 = v106 - v38;
                            if (v3 + v111 + v65 > v3)
                            {
                                _memmove(iter1);
                                iter1 -= v111;
                                v65 += v111;
                                v106 = v38;
                                v45 = v5;
                            }
                            else
                            {
                                _memmove(iter1);
                                v45 = v5;
                                continue;
                            }
                        }
                        if (v75 >= 16)
                        {
                            *(int128_t *)iter1 = *(int128_t *)v106;
                            if (v65 >= 0x11)
                            {
                                j = iter1 + 16;
                                v113 = v106 + 32;
                                do
                                {
                                    *(int128_t *)j = *(int128_t *)((char *)v113 - 16);
                                    *(int128_t *)&j[16] = *(int128_t *)v113;
                                    j += 32;
                                    v113 += 32;
                                } while (j < iter1 + v65);
                            }
                        }
                        else
                        {
                            v22 = &v29;
                            v29 = &v22;
                            if (7 >= v75)
                            {
                                v115 = *(int *)((char *)&g_cc19b0.field_0 + 0x4 * v75);
                                *(char *)iter1 = *(char *)v106;
                                *(char *)&iter1[1] = (char)v106[1];
                                *(char *)&iter1[2] = (char)v106[2];
                                *(char *)&iter1[3] = (char)v106[3];
                                v116 = v106 + *(int *)((char *)&g_cc1990.field_0 + 0x4 * v75);
                                *(int *)&iter1[4] = *(int *)v116;
                                v106 = v116 - v115;
                            }
                            else
                            {
                                *(double *)iter1 = *(double *)v106;
                            }
                            if (v65 >= 9)
                            {
                                v117 = v106 + 8;
                                l = iter1 + 8;
                                v22 = &v29;
                                v29 = &v22;
                                v119 = iter1 + v65;
                                if (15 >= l - v117)
                                {
                                    do
                                    {
                                        *(double *)l = *(double *)v117;
                                        l += 8;
                                        v117 += 8;
                                    } while (l < v119);
                                }
                                else
                                {
                                    *(int128_t *)l = *(int128_t *)v117;
                                    if (v65 >= 25)
                                    {
                                        m = iter1 + 24;
                                        v122 = v106 + 40;
                                        do
                                        {
                                            *(int128_t *)m = *(int128_t *)((char *)v122 - 16);
                                            *(uint128_t *)&m[16] = *v122;
                                            m += 32;
                                            v122 += 2;
                                        } while (m < v119);
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        v22 = v66;
                        v23 = v65;
                        v24 = v75;
                        v45 = v5;
                        v107 = sub_caa58(iter, v0, &v22, &v21);
                    }
                }
                else
                {
                    v80 = arm64g_calculate_condition(19, v76, 0, 0);
                    if (v80 & 1)
                        v81 = v67 & 0xffffffff;
                    else
                        v81 = (unsigned int)v67 + 1;
                    v82 = v9;
                    v9 = v82 + 1;
                    v83 = v81 + (v8 << ((char)v82 & 63) >> 63);
                    if (v83 == 3)
                    {
                        if (_mm_cvtsi128_si64(v19) != 1)
                            v75 = _mm_cvtsi128_si64(v19) - 1;
                        else
                            v75 = 0xffffffffffffffff;
                    }
                    else
                    {
                        if (*(long long *)((char *)&v19 + 0x8 * v83))
                            v75 = *(long long *)((char *)&v19 + 0x8 * v83);
                        else
                            v75 = 0xffffffffffffffff;
                        v79 = &v19;
                        if (v83 == 1)
                            goto LABEL_c74f0;
                    }
LABEL_c74c8:
                    v20 = _mm_extract_epi64(v19, 1);
                    v79 = &v19;
                    goto LABEL_c74f0;
                }
            }
            v124 = arm64g_calculate_condition(130, v107, 120, 0);
            if (v124 & 1)
                return v107;
            iter += v107;
            i = v61 - 1;
        } while (i);
        v33 = v2;
        if (!sub_bfed0(&v8))
            return 0xffffffffffffffec;
        *(unsigned long long *)v1 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(v19));
        *(unsigned int *)(v1 + 8) = v20;
        v126 = v5 - v21;
        if (v0 - iter >= v126)
            goto LABEL_c79e8;
    }
    else
    {
        v35 = v33 + (a2 & ~(a2 >> 63));
        v36 = a0[1255].field_0;
        v21 = v36;
        v37 = v36 + a0[1256].field_8;
        if (i)
            goto LABEL_c71cc;
LABEL_c72c4:
        iter = v33;
        v126 = v37 - v36;
        if (v126 <= v35 - v33)
        {
LABEL_c79e8:
            if (iter)
            {
                _memcpy(iter);
                v127 = iter + v126;
            }
            else
            {
                v127 = 0;
            }
            return v127 - v33;
        }
    }
    return 0xffffffffffffffba;
}
