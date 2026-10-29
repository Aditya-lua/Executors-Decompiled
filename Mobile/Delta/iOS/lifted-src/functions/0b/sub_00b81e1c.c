/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb81e1c..0xb82970 (2900 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b81e1c_1 {
    unsigned long long field_0;
    long long field_8;
} st_b81e1c_1;

typedef struct st_b81e1c_2 {
    char padding_0[4];
    long long field_4;
} st_b81e1c_2;

typedef struct st_b81e1c_8 {
    long long field_0;
    struct st_b81e1c_7 *field_8;
} st_b81e1c_8;

typedef struct st_b81e1c_7 {
    char padding_0[24];
    unsigned long long field_18;
} st_b81e1c_7;

typedef struct st_b81e1c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_c;
    char padding_d[3];
    long long field_10;
} st_b81e1c_0;

typedef struct st_b81e1c_5 {
    unsigned int field_0;
    char field_1;
} st_b81e1c_5;

typedef struct st_b81e1c_3 {
    long long field_0;
} st_b81e1c_3;

typedef struct st_b81e1c_6 {
    char field_0;
} st_b81e1c_6;

extern unsigned int g_98967f;
extern unsigned long long g_b7233c;
extern unsigned long long g_b8cc78;
extern unsigned long long g_be40c0;
extern unsigned long long g_be766c;
extern unsigned long long g_beda54;
extern long long g_cb8a34;
extern void g_e0a460;
extern void g_e0b8c0;

unsigned long long sub_b81e1c(st_b81e1c_0 **a0, st_b81e1c_8 *a1)
{
    st_b81e1c_0 *v15;  // x9
    unsigned int v16;  // x10
    unsigned long long v25;  // 4112
    unsigned long long v115;  // 4112
    unsigned long long v116;  // 4102
    unsigned int v117;  // x13
    unsigned long long v118;  // x4
    unsigned long long v119;  // 4214
    unsigned int v120;  // x17
    unsigned int v121;  // w10
    unsigned int v122;  // x9
    unsigned long long v123;  // x14
    unsigned long long v124;  // x15
    unsigned long long v26;  // 4102
    unsigned long long v125;  // x16
    unsigned int v126;  // w9
    unsigned long long v127;  // x13
    unsigned long long m;  // x15
    unsigned long long v129;  // x10
    unsigned long long v130;  // x10
    unsigned int v132;  // x20
    unsigned long long v133;  // x24
    unsigned int v134;  // w8
    unsigned long long v27;  // 4112
    unsigned long v135;  // x25
    unsigned long n;  // x22
    unsigned int n1;  // x21
    unsigned long v138;  // x8
    unsigned long v139;  // x22
    unsigned int v140;  // x22
    unsigned int v141;  // x22
    unsigned long long v142;  // x8
    void* iter;  // x9
    unsigned int idx;  // x10
    unsigned long long v28;  // 4102
    unsigned long long v145;  // x25
    st_b81e1c_5 *v146;  // x28
    unsigned int v147;  // w11
    unsigned long long v148;  // x9
    unsigned long v149;  // x9
    unsigned long long v150;  // x0
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4102
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4102
    unsigned long v33;  // cc_dep1
    unsigned long long v34;  // x9
    unsigned int v17;  // x8
    unsigned long long v35;  // 4109
    unsigned long long v36;  // 4109
    unsigned long long v37;  // x11
    unsigned long long i;  // x12
    unsigned long long v39;  // 4112
    unsigned long long v40;  // 4105
    unsigned long v41;  // x14
    unsigned long long v42;  // 4112
    unsigned long long v43;  // 4105
    unsigned long long v44;  // x8
    unsigned long long v18;  // 4183
    unsigned int v45;  // w10
    void* v46;  // x11
    unsigned long v47;  // x13
    unsigned long v48;  // x11
    unsigned long long k;  // x15
    unsigned long long v50;  // x16
    unsigned long long v51;  // x17
    unsigned long v52;  // x2
    unsigned long long v53;  // 4266
    unsigned long long v54;  // x2
    unsigned long v19;  // cc_dep1
    char v55;  // x10
    unsigned long long v56;  // x3
    unsigned long long v57;  // x4
    unsigned long long v58;  // x5
    unsigned long v59;  // x3
    unsigned long long v60;  // 4185
    unsigned long long v61;  // x5
    unsigned long long v62;  // x11
    unsigned long v63;  // x13
    unsigned long long v64;  // 4123
    unsigned long v20;  // x9
    unsigned long v65;  // cc_dep1
    unsigned long long node;  // x13
    unsigned long long v67;  // x11
    unsigned long long v68;  // 4132
    unsigned long long v69;  // x10
    unsigned long long v70;  // 4132
    unsigned long long v71;  // 4139
    unsigned int v72;  // w15
    unsigned int v73;  // x14
    unsigned int v74;  // x15
    unsigned int v21;  // x8
    unsigned long long j;  // x14
    unsigned int v76;  // w12
    unsigned int v77;  // w12
    unsigned long long v78;  // 4170
    unsigned long long v79;  // x15
    unsigned int v80;  // w11
    void* v81;  // x10
    unsigned long v82;  // x13
    unsigned long v83;  // x10
    unsigned long long v84;  // x16
    unsigned int v22;  // w10
    unsigned long long v85;  // x17
    unsigned long long v86;  // x2
    unsigned long v87;  // x16
    unsigned long long v88;  // 4236
    unsigned long long v89;  // x2
    char v90;  // x4
    unsigned long long v91;  // x17
    unsigned long long v92;  // x3
    unsigned long long v93;  // x5
    unsigned long v94;  // x17
    unsigned int v23;  // x23
    unsigned long long v95;  // 4185
    unsigned long long v96;  // x5
    unsigned long long v97;  // x10
    unsigned long v98;  // x13
    unsigned long long v99;  // 4123
    unsigned long v100;  // cc_dep1
    unsigned long long v101;  // 4132
    unsigned long long v102;  // 4132
    unsigned long long v103;  // x17
    unsigned long long l;  // x3
    void* ptr;  // x19
    unsigned int v105;  // x12
    unsigned int v106;  // x13
    unsigned long long v107;  // x11
    unsigned long long v108;  // x10
    unsigned long long v109;  // 4226
    unsigned int v110;  // x13
    unsigned long long v111;  // x17
    unsigned int v112;  // w16
    unsigned long long v113;  // 4112
    unsigned long long v114;  // 4102
    st_b81e1c_2 *v0;  // [bp-0xb8], Other Possible Types: unsigned int *
    unsigned long v1;  // [bp-0xb0]
    st_b81e1c_6 **v2;  // [bp-0xa8], Other Possible Types: unsigned int *, unsigned long long *, unsigned long
    unsigned long long v3;  // [bp-0xa0]
    unsigned long long *v4;  // [bp-0x98]
    char v5;  // [bp-0x92]
    char *v6;  // [bp-0x90], Other Possible Types: st_b81e1c_1 **, unsigned int
    uint24_t v7;  // [bp-0x90]
    long long v8;  // [bp-0x88], Other Possible Types: unsigned long long
    st_b81e1c_2 **v9;  // [bp-0x80]
    unsigned long long v10;  // [bp-0x78]
    st_b81e1c_3 **v11;  // [bp-0x70]
    unsigned long long v12;  // [bp-0x68]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = *a0;
    v16 = v15->field_0 ^ 0x8000000000000000;
    v17 = 4;
    v18 = arm64g_calculate_condition(0x44, v15->field_0, 0, 0);
    if (!(v18 & 1))
        v16 = v17;
    if (2 >= v16)
    {
        if (v16)
        {
            v19 = v16;
            if (v16 == 1)
            {
                v2 = &v15->field_8;
                v6 = &v2;
                v8 = &g_be40c0;
            }
            else
            {
                v20 = v15->field_8;
                v21 = v20 & 0xfffffffffffff;
                v22 = ((unsigned int)v20 * 0x1000 | (unsigned int)(v20 >> 52)) & 0xfffff7ff & 0x7ff;
                if ((long long)v20 >= 0)
                {
                    v23 = 0;
                    ptr = &v7;
                    if (!v21)
                    {
                        v25 = arm64g_calculate_condition(4, v19, 1, 0);
                        v26 = arm64g_calculate_condition(3, (v25 & 1 ? v22 : 0), 0, 0);
                        if (v26 & 1)
                            goto LABEL_b82150;
                        goto LABEL_b81f84;
                    }
                    else
                    {
                        v27 = arm64g_calculate_condition(4, v19, 1, 0);
                        v28 = arm64g_calculate_condition(0, (v27 & 1 ? v22 : 0), 0, 0);
                        if (v28 & 1)
                            goto LABEL_b82150;
                        goto LABEL_b81f84;
                    }
                }
                else
                {
                    ptr = (char *)&v7 + 1;
                    v7 = _INSERT(*&v7, 0, 45);
                    v23 = 1;
                    if (!v21)
                    {
                        v29 = arm64g_calculate_condition(4, v19, 1, 0);
                        v30 = arm64g_calculate_condition(19, (v29 & 1 ? v22 : 0), 0, 0);
                        if (!(v30 & 1))
                            goto LABEL_b82150;
LABEL_b81f84:
                        v33 = v22;
                        if (!v22)
                        {
                            v34 = v21;
                            v35 = arm64g_calculate_condition(3, v33, 0, 0);
                            if (!(v35 & 1))
                                goto LABEL_b81f9a;
LABEL_b81f99:
                            v37 = 0xfffffbcc;
                        }
                        else
                        {
                            v34 = v21 | 0x10000000000000;
                            v36 = arm64g_calculate_condition(3, v33, 0, 0);
                            if (v36 & 1)
                                goto LABEL_b81f99;
LABEL_b81f9a:
                            v37 = v22 - 1077;
                        }
                        i = v34 * 4;
                        if (!v21)
                        {
                            v39 = arm64g_calculate_condition(3, v33, 0, 0);
                            v40 = arm64g_calculate_condition(35, (v39 & 1 ? v22 : 0), (v39 & 1 ? 2 : 0), 0);
                            v41 = !(v40 & 1);
                            if (v37 >> 31 & 1)
                                goto LABEL_b8216c;
LABEL_b81fb0:
                            v44 = (78913 * (unsigned int)v37 >> 18) - ((unsigned int)v37 > 3);
                            v45 = (unsigned int)(v44 - v37) + (1217359 * (unsigned int)v44 >> 19) + 125;
                            v46 = &(&g_e0b8c0)[16 * (v44 & 0xffffffff)];
                            v47 = *(long long *)v46;
                            v48 = (long long)v46[8];
                            k = i | 2;
                            v50 = v48 * k >> 64;
                            v51 = k * v48;
                            v52 = v47 * k >> 64;
                            v53 = arm64g_calculate_condition(50, v52, v51, 0);
                            if (!(v53 & 1))
                                v50 += 1;
                            v54 = v45 & 127 ^ 64;
                            v55 = ~v45;
                            v56 = i + ~(unsigned int)v41;
                            v57 = v48 * v56 >> 64;
                            v58 = v56 * v48;
                            v59 = v47 * v56 >> 64;
                            v60 = arm64g_calculate_condition(50, v59, v58, 0);
                            if (!(v60 & 1))
                                v57 += 1;
                            v61 = v48 * i >> 64;
                            v62 = i * v48;
                            v63 = v47 * i >> 64;
                            v64 = arm64g_calculate_condition(50, v63, v62, 0);
                            if (!(v64 & 1))
                                v61 += 1;
                            v65 = v54 & 64;
                            if (v54 & 64)
                                node = v50 >> ((char)v54 & 63);
                            else
                                node = v50 * 2 << (v55 & 63) | v52 + v51 >> ((char)v54 & 63);
                            v67 = v57 * 2 << (v55 & 63) | v59 + v58 >> ((char)v54 & 63);
                            v68 = arm64g_calculate_condition(26, v65, 0, 0);
                            if (v68 & 1)
                                v67 = v57 >> ((char)v54 & 63);
                            v69 = v61 * 2 << (v55 & 63) | v63 + v62 >> ((char)v54 & 63);
                            v70 = arm64g_calculate_condition(26, v65, 0, 0);
                            if (v70 & 1)
                                v69 = v61 >> ((char)v54 & 63);
                            if (22 > (unsigned int)v44)
                            {
                                v71 = arm64g_calculate_condition(0x11, -((unsigned int)(i / 5) * 5), i & 0xffffffff, 0);
                                if (!(v71 & 1))
                                {
                                    v72 = 0xffffffff;
                                    do
                                    {
                                        i *= 14757395258967641293;
                                        v72 += 1;
                                    } while (i <= 0x3333333333333333);
                                    v73 = 0;
                                    v74 = v72 >= (unsigned int)v44;
                                }
                                else if (!(v34 & 1))
                                {
                                    j = ~v41 + i;
                                    v76 = 0xffffffff;
                                    do
                                    {
                                        j *= 14757395258967641293;
                                        v76 += 1;
                                    } while (j <= 0x3333333333333333);
                                    v74 = 0;
                                    v73 = v76 >= (unsigned int)v44;
                                }
                                else
                                {
                                    v77 = 0xffffffff;
                                    do
                                    {
                                        k *= 14757395258967641293;
                                        v77 += 1;
                                    } while (k <= 0x3333333333333333);
                                    v73 = 0;
                                    v74 = 0;
                                    node -= v77 >= (unsigned int)v44;
                                }
                                if (v73 & 1 || v74 & 1)
                                    goto LABEL_b82364;
                            }
LABEL_b82304:
                            v123 = (node >> 2) / 25;
                            v124 = (v67 >> 2) / 25;
                            if (v123 > v124)
                            {
                                v125 = (v69 >> 2) / 25;
                                v126 = (unsigned int)v69 + 0xffffff9c * (unsigned int)v125 > 49;
                                v105 = 2;
                                v69 = v125;
                                v67 = v124;
                                node = v123;
                            }
                            else
                            {
                                v126 = 0;
                                v105 = 0;
                            }
                            v127 = node / 10;
                            m = v67 / 10;
                            if (v127 > m)
                            {
                                do
                                {
                                    v67 = m;
                                    v129 = v69;
                                    v130 = v129 / 10;
                                    v105 += 1;
                                    v127 /= 10;
                                    v69 = v130;
                                    m = v67 / 10;
                                } while (m < v127);
                                v126 = (unsigned int)v129 + 0xfffffff6 * (unsigned int)v130 > 4;
                                v69 = v130;
                            }
                            v122 = v69 == v67 | v126;
                        }
                        else
                        {
                            v42 = arm64g_calculate_condition(3, v33, 0, 0);
                            v43 = arm64g_calculate_condition(32, (v42 & 1 ? v22 : 0), (v42 & 1 ? 2 : 0), 0);
                            v41 = !(v43 & 1);
                            if (!(v37 >> 31 & 1))
                                goto LABEL_b81fb0;
LABEL_b8216c:
                            v78 = arm64g_calculate_condition(1, v37 & 0xffffffff, 1, 0);
                            v79 = (0xfff4d105 * (unsigned int)v37 >> 20) - !(v78 & 1);
                            v44 = v79 + v37;
                            v80 = (unsigned int)v79 - (65891505 * (unsigned int)v44 >> 19) + 124;
                            v81 = &(&g_e0a460)[16 * -(unsigned int)v44];
                            v82 = *(long long *)v81;
                            v83 = (long long)v81[8];
                            v84 = i | 2;
                            v85 = v83 * v84 >> 64;
                            v86 = v84 * v83;
                            v87 = v82 * v84 >> 64;
                            v88 = arm64g_calculate_condition(50, v87, v86, 0);
                            if (!(v88 & 1))
                                v85 += 1;
                            v89 = v80 & 127 ^ 64;
                            v90 = ~v80;
                            v91 = i + ~(unsigned int)v41;
                            v92 = v83 * v91 >> 64;
                            v93 = v91 * v83;
                            v94 = v82 * v91 >> 64;
                            v95 = arm64g_calculate_condition(50, v94, v93, 0);
                            if (!(v95 & 1))
                                v92 += 1;
                            v96 = v83 * i >> 64;
                            v97 = i * v83;
                            v98 = v82 * i >> 64;
                            v99 = arm64g_calculate_condition(50, v98, v97, 0);
                            if (!(v99 & 1))
                                v96 += 1;
                            v100 = v89 & 64;
                            if (v89 & 64)
                                node = v85 >> ((char)v89 & 63);
                            else
                                node = v85 * 2 << (v90 & 63) | v87 + v86 >> ((char)v89 & 63);
                            v67 = v92 * 2 << (v90 & 63) | v94 + v93 >> ((char)v89 & 63);
                            v101 = arm64g_calculate_condition(26, v100, 0, 0);
                            if (v101 & 1)
                                v67 = v92 >> ((char)v89 & 63);
                            v69 = v96 * 2 << (v90 & 63) | v98 + v97 >> ((char)v89 & 63);
                            v102 = arm64g_calculate_condition(26, v100, 0, 0);
                            if (v102 & 1)
                                v69 = v96 >> ((char)v89 & 63);
                            if (2 > (unsigned int)v79)
                            {
                                node -= v34 & 1;
                                v73 = !(v34 & 1) & (unsigned int)v41;
                            }
                            else
                            {
                                if (63 <= (unsigned int)v79 || i & ~(0xffffffffffffffff << ((char)v79 & 63)))
                                    goto LABEL_b82304;
                                v73 = 0;
                            }
                            v74 = 1;
LABEL_b82364:
                            v103 = node / 10;
                            l = v67 / 10;
                            if (v103 > l)
                            {
                                v105 = 0;
                                v106 = 0;
                                do
                                {
                                    v107 = l;
                                    v108 = v69 / 10;
                                    v109 = arm64g_calculate_condition(0x11, 0xfffffff6 * v107 & 0xffffffff, v67 & 0xffffffff, 0);
                                    v110 = (char)v69 + 246 * (char)v108;
                                    v73 &= (unsigned int)!(v109 & 1);
                                    v74 &= !v106;
                                    v105 += 1;
                                    v103 /= 10;
                                    l = v107 / 10;
                                    v106 = v110;
                                    v69 = v108;
                                    v67 = v107;
                                } while (l < v103);
                            }
                            else
                            {
                                v110 = 0;
                                v105 = 0;
                                v108 = v69;
                                v107 = v67;
                            }
                            v111 = v107 / 10;
                            v112 = 0xfffffff6 * (unsigned int)v111;
                            if (v73)
                            {
                                v113 = arm64g_calculate_condition(20, v103, l, 0);
                                v114 = arm64g_calculate_condition(1, (v113 & 1 ? v112 : 0), (v113 & 1 ? v107 & 0xffffffff : 0), 0);
                                if (v114 & 1)
                                    goto LABEL_b8248c;
LABEL_b82484:
                                v117 = v110;
                                v69 = v108;
                            }
                            else
                            {
                                v115 = arm64g_calculate_condition(20, v103, l, 0);
                                v116 = arm64g_calculate_condition(0, (v115 & 1 ? v112 : 0), (v115 & 1 ? v107 & 0xffffffff : 0), 0);
                                if (!(v116 & 1))
                                    goto LABEL_b82484;
LABEL_b8248c:
                                do
                                {
                                    v107 = v111;
                                    v69 = v108 / 10;
                                    v117 = (char)v108 + 246 * (char)v69;
                                    v74 &= !v110;
                                    v105 += 1;
                                    v118 = v107 / 10;
                                    v119 = arm64g_calculate_condition(1, 0xfffffff6 * v118 & 0xffffffff, v107 & 0xffffffff, 0);
                                    v108 = v69;
                                    v110 = v117;
                                    v111 = v118;
                                } while (v119 & 1);
                            }
                            if (!(v69 & 1))
                                v120 = 4;
                            else
                                v120 = 5;
                            if (v74 & v117 == 5)
                                v117 = v120;
                            if (v34 & 1)
                                v121 = 0;
                            else
                                v121 = v73;
                            if (v117 <= 4)
                                v122 = v69 == v107 & (v121 ^ 1);
                            else
                                v122 = 1;
                        }
                        v132 = v69 + (v122 & 1);
                        v133 = v44 + v105;
                        if (v132 > 0x2386f26fc0ffff)
                        {
                            v134 = 0x11;
                        }
                        else if (v132 > 0x38d7ea4c67fff)
                        {
                            v134 = 16;
                        }
                        else if (v132 > 0x5af3107a3fff)
                        {
                            v134 = 15;
                        }
                        else if (v132 > 0x9184e729fff)
                        {
                            v134 = 14;
                        }
                        else if (v132 > 0xe8d4a50fff)
                        {
                            v134 = 13;
                        }
                        else if (v132 > 0x174876e7ff)
                        {
                            v134 = 12;
                        }
                        else if (v132 > 0x2540be3ff)
                        {
                            v134 = 11;
                        }
                        else if (v132 > 0x3b9ac9ff)
                        {
                            v134 = 10;
                        }
                        else if (v132 > 0x5f5e0ff)
                        {
                            v134 = 9;
                        }
                        else if (v132 > &g_98967f)
                        {
                            v134 = 8;
                        }
                        else if (v132 > 999999)
                        {
                            v134 = 7;
                        }
                        else if ((unsigned long long)(v132 >> 5) > 3124)
                        {
                            v134 = 6;
                        }
                        else if ((unsigned long long)(v132 >> 4) > 624)
                        {
                            v134 = 5;
                        }
                        else if (v132 > 999)
                        {
                            v134 = 4;
                        }
                        else if (v132 > 99)
                        {
                            v134 = 3;
                        }
                        else if (v132 <= 9)
                        {
                            v134 = 1;
                        }
                        else
                        {
                            v134 = 2;
                        }
                        v135 = v134;
                        n = (int)v133;
                        n1 = v135 + n;
                        if (!(v133 >> 31 & 1) && 0x11 > n1)
                        {
                            sub_c3fc28(v132, ptr + v135);
                            if ((unsigned int)v133)
                                _memset(ptr + v135, 48, n);
                            v138 = n1 + v23;
                            *(unsigned short *)((char *)&v7 + v138) = 12334;
                            v139 = v138 + 2;
                        }
                        else
                        {
                            v140 = n1 - 1;
                            if (16 > v140)
                            {
                                v139 = v23 + v135 + 1;
                                sub_c3fc28(v132, (char *)&v7 + v139);
                                _memmove(ptr, ptr + 1, n1);
                                *((char *)ptr + n1) = 46;
                            }
                            else if (5 > n1 + 4)
                            {
                                *((char *)&v7 + v23) = 48;
                                *(char *)&ptr[1] = 46;
                                v141 = 2 - n1;
                                if (n1 < 0)
                                    _memset();
                                v139 = v23 + v135 + v141;
                                sub_c3fc28(v132, (char *)&v7 + v139);
                            }
                            else
                            {
                                if ((unsigned int)v135 == 1)
                                {
                                    *((char *)&v7 + v23) = (char)v132 + 48;
                                    *(char *)&ptr[1] = 101;
                                    v142 = v23 | 2;
                                    iter = (char *)&v7 + v142;
                                    if (n1 >= 1)
                                    {
                                        idx = v140;
                                    }
                                    else
                                    {
                                        *(char *)iter = 45;
                                        iter += 1;
                                        idx = 1 - n1;
                                    }
                                }
                                else
                                {
                                    v145 = v23 + v135;
                                    v146 = (char *)&v7 + v145;
                                    sub_c3fc28(v132, (char *)&v146->field_0 + 1);
                                    *((char *)&v7 + v23) = (char)ptr[1];
                                    *(char *)&ptr[1] = 46;
                                    *((char *)&v146->field_0 + 1) = 101;
                                    v142 = v145 + 2;
                                    iter = (char *)&v7 + v142;
                                    if (n1 >= 1)
                                    {
                                        idx = v140;
                                    }
                                    else
                                    {
                                        *(char *)iter = 45;
                                        iter += 1;
                                        idx = 1 - n1;
                                    }
                                }
                                if (idx > 99)
                                {
                                    v147 = idx / 100;
                                    *(char *)iter = (char)v147 + 48;
                                    *(short *)&iter[1] = *(short *)(2 * idx + -200 * v147 + 14721940);
                                    v148 = (v140 >> 63) + 3;
                                }
                                else if (idx > 9)
                                {
                                    *(short *)iter = *(short *)(2 * idx + 14721940);
                                    v148 = 2 | (v140 * 2 | v140 >> 63) & 1;
                                }
                                else
                                {
                                    *(char *)iter = (char)idx | 48;
                                    v148 = (v140 >> 63) + 1;
                                }
                                v139 = v148 + v142;
                            }
                        }
                    }
                    else
                    {
                        v31 = arm64g_calculate_condition(4, v19, 1, 0);
                        v32 = arm64g_calculate_condition(16, (v31 & 1 ? v22 : 0), 0, 0);
                        if (v32 & 1)
                            goto LABEL_b81f84;
LABEL_b82150:
                        *(char *)&ptr[2] = 48;
                        *(unsigned short *)ptr = 11824;
                        v139 = (v20 >> 63) + 3;
                    }
                }
                if (*(short *)&(&v5)[v139] != 12334)
                    v149 = v139;
                else
                    v149 = v139 - 2;
                v0 = &v7;
                v1 = v149;
                v2 = &v0;
                v3 = &g_be766c;
            }
        }
        else
        {
            goto *((void *)(a1->field_8->field_18));
        }
    }
    else
    {
        if (v16 != 3)
        {
            if (v16 == 4)
            {
                sub_b7ccc0(&v7, v15->field_8, *(long long *)&v15->field_c);
                v2 = &v7;
                v3 = &g_b7233c;
                v150 = sub_be769c(a1->field_0, a1->field_8, &g_cb8a34, &v2);
                if (v6 < 1)
                    return v150;
                _free(v8);
                return v150;
            }
            v0 = (char *)&v15->field_8 + 4;
            v2 = &v15->field_c;
            v4 = &v15->field_8;
            v6 = &v4;
            v8 = &g_b8cc78;
            v9 = &v0;
            v10 = &g_b8cc78;
            v11 = &v2;
            v12 = &g_b8cc78;
        }
        else
        {
            v2 = v15->field_8;
            v6 = &v2;
            v8 = &g_beda54;
        }
    }
    return sub_be769c();
}
