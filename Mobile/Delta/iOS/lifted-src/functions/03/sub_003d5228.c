/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d5228..0x3d5ea8 (3200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d5228_1 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_8;
    char padding_10[168];
    unsigned int field_b8;
    char padding_bc[4];
    unsigned int field_c0;
    char padding_c4[12];
    unsigned int field_d0;
} st_3d5228_1;

typedef struct st_3d5228_3 {
    char field_0;
    unsigned short field_1;
} st_3d5228_3;

typedef struct st_3d5228_4 {
    struct st_3d5228_7 *field_0;
} st_3d5228_4;

typedef struct st_3d5228_7 {
    struct st_3d5228_4 *field_0;
} st_3d5228_7;

typedef struct st_3d5228_8 {
    struct st_3d5228_7 *field_0;
    unsigned short field_1;
} st_3d5228_8;

typedef struct st_3d5228_0 {
    char field_0;
} st_3d5228_0;

typedef struct st_3d5228_2 {
    unsigned long long field_0;
} st_3d5228_2;

extern unsigned long long g_e7d988;
extern unsigned long long g_e7d990;
extern unsigned long long g_e7d9e8;
extern unsigned long long g_e7d9f8;
extern unsigned long long g_e7db50;
extern unsigned long long g_e7db80;
extern st_3d5228_2 *g_f0b120;
extern char g_1000000;
extern char g_1000001;
extern char g_10002b0;

unsigned long long sub_3d5228(st_3d5228_1 *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v37;  // w11
    unsigned long long v38;  // 4125
    unsigned long long v47;  // 4154
    unsigned long long v137;  // x1
    unsigned long long v138;  // x5
    unsigned long long v139;  // x6
    unsigned long long v140;  // x1
    unsigned long long v141;  // 4110
    unsigned long long v142;  // 4102
    unsigned long long v143;  // 4110
    unsigned long long v144;  // 4102
    unsigned long long v145;  // x6
    uint128_t *node;  // x1
    unsigned long long v48;  // w8
    uint128_t *iter;  // x2
    unsigned long long l;  // x5
    unsigned long long v149;  // x5
    uint128_t v150;  // q0
    uint128_t v151;  // q1
    uint128_t v152;  // q3
    unsigned long long v154;  // x5
    unsigned long long *iter1;  // x1
    unsigned long long *iter2;  // x2
    unsigned long v49;  // x25
    unsigned long long v157;  // x5
    unsigned long v158;  // d0
    unsigned long long v160;  // 4120
    char *v161;  // x1
    char *v162;  // x2
    unsigned long long k;  // x5
    unsigned long long v164;  // x5
    char v165;  // x6
    unsigned long long ptr;  // x24
    unsigned long long v51;  // x8
    unsigned long long i;  // x19
    unsigned long v53;  // x21
    unsigned long long v54;  // x19
    unsigned long long v55;  // x19
    unsigned long long v56;  // w8
    unsigned long long v39;  // w9
    unsigned long long v57;  // w9
    unsigned long v58;  // x4
    unsigned long long v59;  // x9
    unsigned long v60;  // cc_dep1
    unsigned long long v61;  // x8
    unsigned long long v62;  // 4105
    unsigned long long v63;  // 4105
    st_3d5228_3 *v64;  // x9
    st_3d5228_3 *v65;  // x12
    unsigned long long v66;  // w27
    unsigned long long v40;  // w10
    st_3d5228_3 *v67;  // x8
    unsigned long v68;  // x10
    st_3d5228_3 *v69;  // x11
    unsigned int v70;  // w0
    unsigned int v71;  // w9
    st_3d5228_8 *v72;  // x10
    st_3d5228_3 *v73;  // x13
    unsigned long v74;  // cc_dep1
    unsigned long long v75;  // w9
    unsigned long v76;  // 4112
    unsigned long long v41;  // w23
    unsigned long v77;  // cc_op
    unsigned long v78;  // cc_dep1
    unsigned long v79;  // cc_dep2
    unsigned long long v80;  // w9
    unsigned long long v81;  // 4119
    unsigned long v82;  // 4112
    unsigned long long v83;  // 4119
    unsigned long v84;  // 4112
    unsigned long v85;  // cc_op
    unsigned long v86;  // cc_dep1
    unsigned long v42;  // x22
    unsigned long v87;  // cc_dep2
    unsigned long v88;  // 4112
    unsigned long long v89;  // 4111
    unsigned long v90;  // x8
    unsigned long v91;  // x19
    unsigned int v92;  // w0
    unsigned long long v93;  // w22
    unsigned long v94;  // x19
    unsigned int v95;  // w0
    unsigned long v96;  // x19
    unsigned long long v43;  // w28
    unsigned int v97;  // w0
    unsigned long v98;  // x19
    unsigned long long v99;  // w8
    unsigned long long v100;  // x22
    unsigned long long v101;  // w26
    unsigned int v102;  // w27
    unsigned int v103;  // w0
    unsigned int v104;  // w22
    unsigned int v105;  // w0
    unsigned int v106;  // w0
    unsigned long v44;  // x26
    unsigned int v107;  // w0
    unsigned long v108;  // x21
    char *v109;  // x19
    unsigned long long v110;  // w8
    unsigned long long v111;  // w0
    char *v112;  // x22
    unsigned int v113;  // w8
    unsigned long v114;  // x11
    unsigned long long v115;  // 4130
    unsigned long long v116;  // x8
    unsigned long long v45;  // w27
    unsigned long long v117;  // x9
    unsigned long long v118;  // x10
    unsigned long long v119;  // x11
    unsigned long long j;  // x13
    unsigned long long v121;  // x13
    unsigned long v123;  // x8
    unsigned long long v124;  // x8
    unsigned long v125;  // x3
    unsigned long v126;  // x9
    unsigned int v46;  // w8
    unsigned long long v127;  // w17
    unsigned long long v128;  // x10
    unsigned long long v129;  // x11
    unsigned long v130;  // x12
    unsigned long v131;  // x14
    unsigned long v132;  // x15
    unsigned int v133;  // w0
    unsigned long v134;  // x17
    unsigned long v135;  // x0
    unsigned long v136;  // cc_dep1
    unsigned long long *v0;  // [bp-0x520]
    unsigned long long *v1;  // [bp-0x518]
    unsigned long long v2;  // [bp-0x50c]
    unsigned long long v3;  // [bp-0x508], Other Possible Types: unsigned long
    unsigned long long v4;  // [bp-0x500]
    unsigned long long v5;  // [bp-0x4fc]
    unsigned long long v6;  // [bp-0x4f8]
    unsigned long long v7;  // [bp-0x4f4]
    unsigned int v8;  // [bp-0x4f0], Other Possible Types: unsigned long
    unsigned long v9;  // [bp-0x4e8], Other Possible Types: unsigned long long
    unsigned long v10;  // [bp-0x4e0], Other Possible Types: unsigned long long
    unsigned long v11;  // [bp-0x4d8], Other Possible Types: unsigned long long
    unsigned long long v12;  // [bp-0x4d0]
    unsigned long long v13;  // [bp-0x4cc]
    unsigned int v14;  // [bp-0x4c8], Other Possible Types: unsigned long long
    unsigned long long v15;  // [bp-0x4c4]
    st_3d5228_0 **v16;  // [bp-0x4c0], Other Possible Types: char
    st_3d5228_0 *v17;  // [bp-0x4b8]
    unsigned long long v18;  // [bp-0x4ac]
    unsigned int v19;  // [bp-0x4a8]
    unsigned int v20;  // [bp-0x4a4]
    unsigned long long v21;  // [bp-0x4a0]
    unsigned long long v22;  // [bp-0x49c]
    unsigned long long v23;  // [bp-0x498]
    unsigned long long v24;  // [bp-0x494]
    unsigned long long v25;  // [bp-0x490]
    unsigned int v26;  // [bp-0x48c]
    st_3d5228_7 **v27;  // [bp-0x488]
    st_3d5228_7 **v28;  // [bp-0x488]
    st_3d5228_7 **v29;  // [bp-0x480]
    st_3d5228_7 **v30;  // [bp-0x478]
    st_3d5228_7 **v31;  // [bp-0x478]
    st_3d5228_7 **v32;  // [bp-0x470], Other Possible Types: char
    st_3d5228_7 **v33;  // [bp-0x470], Other Possible Types: char
    unsigned long v34;  // [bp-0x70]
    char *v35;  // [bp-0x10]
    char v36;  // [bp+0x0]

    v35 = &v36;
    v34 = *(long long *)&g_10002b0;
    v17 = &v16;
    v16 = &v17;
    v25 = 0xff;
    if (sub_3cd4ac())
    {
        v37 = (&a0->field_0)[1];
        v38 = arm64g_calculate_condition(83, v37, 0, 0);
        if (v38 & 1)
            v39 = v37;
        else
            v39 = -v37;
        (&a0->field_0)[1] = v39;
        if (&g_1000001 <= v39)
        {
            g_f0b120();
        }
        else if (a0->field_0 >= &g_1000001)
        {
            g_f0b120();
        }
        else
        {
            v12 = v23;
            v13 = v22;
            v40 = v24;
            v41 = v25;
            v42 = v20;
            v14 = v21;
            v15 = v40;
            if ((unsigned int)v42 == 12)
            {
                v43 = v18;
                if (23 < v43 || !(v44 = v19, v45 = (((unsigned int)(v44 - v26) - 24) * 1431655766 >> 32) + (((unsigned int)(v44 - v26) - 24) * 1431655766 >> 63), v45))
                    goto LABEL_3d544c;
LABEL_3d539c:
                v11 = v40 == 0xff000000;
LABEL_3d53ac:
                v0 = a1;
                v1 = a2;
                if (!v40)
                    v48 = 3;
                else
                    v48 = 4;
            }
            else
            {
                v43 = v18;
                if (15 >= v43 && (v44 = v19, v45 = (int)((unsigned int)(v44 - (v42 + v26))) >> 2, v45))
                    goto LABEL_3d539c;
LABEL_3d544c:
                v46 = *(int *)&a0->padding_10[160] + a0->field_b8 - *(int *)&a0->padding_c4[4];
                v47 = arm64g_calculate_condition(129, v46 - 1025, 1025, 0);
                if (!(v47 & 1))
                    g_f0b120();
                v44 = v19;
                if ((int)v44 < (int)v46 || (int)(v44 - v46) >= 1025)
                    g_f0b120();
                v2 = v37;
                sub_3d44fc(a0);
                v45 = 0;
                v40 = v15;
                v11 = CONCAT(1, v40 == 0xff000000);
                v37 = v2;
                if (v43 != 24 || v40 != 0xff000000)
                    goto LABEL_3d53ac;
                v0 = a1;
                v1 = a2;
                v48 = 3;
                v43 = 24;
            }
            v2 = v37;
            *(unsigned int *)&a0->field_4 = v48;
            if (2 < a4)
                v49 = a4;
            else
                v49 = v48;
            if (!sub_3cfce4())
                g_f0b120();
            ptr = sub_3d6ef0(v49, a0->field_0, (&a0->field_0)[1], 0);
            if (!ptr)
                g_f0b120();
            if (15 >= v43)
            {
                if (v45 <= 0x100)
                    v51 = *(unsigned int *)((void*)&v11 + 4);
                else
                    v51 = 1;
                if (v51 & 1)
                {
                    _free(ptr);
                    g_f0b120();
                }
                if (v45 >= 1)
                {
                    i = v45;
                    v53 = &v33 + 1;
                    if ((unsigned int)v42 == 12)
                    {
                        do
                        {
                            v54 = i;
                            *(char *)(v53 - 1) = sub_3d706c(a0);
                            *(char *)(v53 - 2) = sub_3d706c(a0);
                            *(char *)(v53 - 3) = sub_3d706c(a0);
                            *(char *)v53 = 0xff;
                            v53 += 4;
                            i = v54 - 1;
                        } while (i);
                    }
                    else
                    {
                        do
                        {
                            v55 = i;
                            *(char *)(v53 - 1) = sub_3d706c(a0);
                            *(char *)(v53 - 2) = sub_3d706c(a0);
                            *(char *)(v53 - 3) = sub_3d706c(a0);
                            sub_3d706c(a0);
                            *(char *)v53 = 0xff;
                            v53 += 4;
                            i = v55 - 1;
                        } while (i);
                    }
                }
                sub_3d44fc();
                switch (v43)
                {
                case 1:
                    v14 = -(a0->field_0 + 7 >> 3);
                    v58 = (&a0->field_0)[1];
                    if ((int)v58 > 0)
                    {
                        v15 = 0;
                        v70 = sub_3d706c(a0);
                        v71 = a0->field_0;
                        if ((int)v71 <= 0)
                            return sub_3d5da4();
                        v72 = &(&v32)[4 * (v70 >> 7 & 1)];
                        v73 = ptr;
                        v73->field_0 = (char)v72->field_0;
                        *(short *)&(&v73->field_0)[1] = *(short *)((char *)&v72->field_0 + 1);
                        if ((unsigned int)v49 == 4)
                            *(char *)(ptr + 3) = 0xff;
                        if (v71 == 1)
                        {
                            goto *((void *)(g_e7d9e8));
                        }
                        else
                        {
                            if (!1)
                                sub_3d706c(a0);
                            goto *((void *)(g_e7db50));
                        }
                    }
                    break;
                case 8:
                    v56 = a0->field_0;
LABEL_3d5c3c:
                    v57 = 0;
                    v14 = -v56;
                    while (1)
                    {
                        v58 = (&a0->field_0)[1];
                        if ((int)v58 <= v57)
                            break;
                        v15 = v57;
                        if ((int)a0->field_0 <= 0)
                        {
                            sub_3d44fc(a0, v14 & 3);
                            v57 = v15 + 1;
                        }
                        else
                        {
                            v59 = sub_3d706c(a0) & 0xffffffff;
                            v60 = v43;
                            if (v43 != 4)
                            {
                                v61 = 0;
                                v62 = arm64g_calculate_condition(19, v60, 4, 0);
                                if (!(v62 & 1))
                                    goto LABEL_3d5cb6;
                            }
                            else
                            {
                                v61 = v59 & 15;
                                v63 = arm64g_calculate_condition(19, v60, 4, 0);
                                if (!(v63 & 1))
                                {
LABEL_3d5cb6:
                                    v59 >>= 4;
LABEL_3d5cb8:
                                    v64 = &(&v32)[4 * v59];
                                    v65 = ptr;
                                    v65->field_0 = v64->field_0;
                                    *(short *)&(&v65->field_0)[1] = *(short *)&(&v64->field_0)[1];
                                    v66 = 3;
                                    if ((unsigned int)v49 == 4)
                                    {
                                        v66 = 4;
                                        *(char *)(ptr + 3) = 0xff;
                                    }
                                    if (a0->field_0 == 1)
                                    {
                                        goto *((void *)(g_e7db80));
                                    }
                                    else
                                    {
                                        if (v43 == 8)
                                            v61 = sub_3d706c(a0) & 0xffffffff;
                                        v67 = &(&v32)[4 * v61];
                                        v68 = v66;
                                        v69 = ptr + v68;
                                        v69->field_0 = v67->field_0;
                                        *(short *)&(&v69->field_0)[1] = *(short *)&(&v67->field_0)[1];
                                        if ((unsigned int)v49 == 4)
                                            *(char *)(ptr + v68 + 3) = 0xff;
                                        goto *((void *)(g_e7d9f8));
                                    }
                                }
                            }
                            goto LABEL_3d5cb8;
                        }
                    }
                case 4:
                    v56 = a0->field_0 + 1 >> 1;
                    goto LABEL_3d5c3c;
                default:
                    _free(ptr);
                    g_f0b120();
                }
                goto LABEL_3d59d0;
            }
            sub_3d44fc(a0, v44 - (v42 + v26));
            switch (v43)
            {
            case 16:
                *(unsigned int *)((char *)&v3 + 4) = __ROL__(a0->field_0, 1) & 2 & 3;
                break;
            case 32:
                v74 = v43;
                v75 = v13;
                if (v12 == 0xff)
                {
                    v76 = arm64g_calculate_condition(3, v74, 32, 0);
                    v77 = 3;
                    v78 = (v76 & 1 ? v75 : 0);
                    v79 = (v76 & 1 ? 0xff00 : 0);
                    v80 = v14;
                    v81 = arm64g_calculate_condition(3, v78, v79, 0);
                    if (!(v81 & 1))
                        goto LABEL_3d5676;
LABEL_3d5675:
                    v84 = arm64g_calculate_condition(v77, v78, v79, 0);
                    v85 = 3;
                    v86 = (v84 & 1 ? v80 : 0);
                    v87 = (v84 & 1 ? 0xff0000 : 0);
                }
                else
                {
                    v82 = arm64g_calculate_condition(3, v74, 32, 0);
                    v77 = 0;
                    v78 = (v82 & 1 ? v75 : 0);
                    v79 = (v82 & 1 ? 0xff00 : 0);
                    v80 = v14;
                    v83 = arm64g_calculate_condition(0, v78, v79, 0);
                    if (v83 & 1)
                        goto LABEL_3d5675;
LABEL_3d5676:
                    v88 = arm64g_calculate_condition(v77, v78, v79, 0);
                    v85 = 0;
                    v86 = (v88 & 1 ? v80 : 0);
                    v87 = (v88 & 1 ? 0xff0000 : 0);
                }
                v89 = arm64g_calculate_condition(v85 | 16, v86, v87, 0);
                if (!(v89 & 1) & (unsigned int)v11 & 1)
                {
                    v3 = 0;
                    v5 = 0;
                    v6 = 0;
                    v10 = 0;
                    v11 = 0;
                    v9 = 0;
                    v90 = g_e7d990;
                    goto LABEL_3d57a0;
                }
                goto LABEL_3d56a4;
            case 24:
                v5 = 0;
                v6 = 0;
                v10 = 0;
                v11 = 0;
                v9 = 0;
                v3 = CONCAT(a0->field_0 & 3, 0);
                goto LABEL_3d5798;
            default:
LABEL_3d56a4:
                *(unsigned int *)((char *)&v3 + 4) = 0;
                break;
            }
            if (!v14 || !v13 || !v12)
            {
LABEL_3d5a08:
                _free(ptr);
                g_f0b120();
            }
            v91 = v14;
            v92 = sub_3ce834(v91);
            v93 = (unsigned int)sub_3d6eb8(v91);
            v94 = v13;
            v95 = sub_3ce834(v94);
            *(unsigned int *)((char *)&v11 + 4) = sub_3d6eb8(v94);
            v96 = v12;
            v97 = sub_3ce834(v96);
            *(unsigned int *)&v11 = sub_3d6eb8(v96);
            v98 = v15;
            v8 = sub_3ce834(v98);
            v6 = (unsigned int)sub_3d6eb8(v98);
            *(unsigned long long *)((char *)&v10 + 4) = v93;
            if (8 < v93 || 8 < *(unsigned int *)((void*)&v11 + 4) || 8 < (unsigned int)v11 || 9 <= v6)
                goto LABEL_3d5a08;
            *(unsigned int *)((char *)&v9 + 4) = v95 - 7;
            *(unsigned int *)&v10 = v92 - 7;
            *(unsigned int *)&v9 = v97 - 7;
            v5 = v8 - 7;
            *(unsigned int *)&v3 = 1;
LABEL_3d5798:
            v90 = g_e7d988;
LABEL_3d57a0:
            v8 = v90;
            v58 = (&a0->field_0)[1];
            if ((int)v58 >= 1)
            {
                v7 = v43;
                v99 = 0;
                v100 = 0;
                do
                {
                    v4 = v99;
                    if ((unsigned int)v3 & 1)
                    {
                        if ((int)a0->field_0 >= 1)
                        {
                            v101 = 0;
                            v102 = v100;
                            v28 = v27;
                            v31 = v30;
                            v33 = v32;
                            do
                            {
                                if (v7 == 16)
                                {
                                    v33 = &v31;
                                    v31 = &v33;
                                    v103 = sub_3d706c(a0);
                                    v104 = v103 | sub_3d706c(a0) * 0x100;
                                }
                                else
                                {
                                    v29 = &v28;
                                    v28 = &v29;
                                    v31 = &v33;
                                    v33 = &v31;
                                    v105 = sub_3d706c(a0);
                                    v106 = sub_3d706c(a0);
                                    v31 = &v33;
                                    v33 = &v31;
                                    v107 = sub_3d706c(a0);
                                    v104 = v107 * 0x10000 | (unsigned int)sub_3d706c(a0) * &g_1000000 | v105 | v106 * 0x100;
                                }
                                v108 = v102;
                                v109 = ptr + v108;
                                *v109 = sub_3d3f44(v104 & v14, (unsigned int)v10, *(unsigned int *)((void*)&v10 + 4));
                                v109[1] = sub_3d3f44(v104 & v13, *(unsigned int *)((void*)&v9 + 4), *(unsigned int *)((void*)&v11 + 4));
                                v109[2] = sub_3d3f44(v104 & v12, (unsigned int)v9, (unsigned int)v11);
                                v110 = v15;
                                if (v110)
                                {
                                    v111 = (unsigned int)sub_3d3f44(v104 & v110, v5, v6);
                                    v100 = v108 + 3;
                                    if ((unsigned int)v49 != 4)
                                        continue;
                                }
                                else
                                {
                                    v111 = 0xff;
                                    v100 = v108 + 3;
                                    if ((unsigned int)v49 != 4)
                                        continue;
                                }
                                *(char *)(ptr + v100) = v111;
                                v100 = v102 + 4;
                            } while ((v41 |= v111, v101 += 1, v102 = v100, (int)a0->field_0 > v101));
                        }
                    }
                    else
                    {
                        if ((int)a0->field_0 >= 1)
                        {
                            v112 = ptr + (int)v100;
                            v112[2] = sub_3d706c(a0);
                            v112[1] = sub_3d706c(a0);
                            *v112 = sub_3d706c(a0);
                            goto *((void *)(v8));
                        }
                    }
                } while ((sub_3d44fc(a0, *(unsigned int *)((void*)&v3 + 4)), v99 = v4 + 1, v58 = (&a0->field_0)[1], v99 < (int)v58));
            }
LABEL_3d59d0:
            if ((unsigned int)v49 == 4 && !v41)
            {
                v113 = (unsigned int)v58 * a0->field_0 * 4;
                v114 = v113 - 1;
                v115 = arm64g_calculate_condition(67, v113, 1, 0);
                if (!(v115 & 1))
                {
                    if ((unsigned int)v114 == 3)
                    {
                        v116 = 3;
                        *(char *)(ptr + 3) = 0xff;
                    }
                    else
                    {
                        v117 = (v114 >> 2) + 1;
                        v118 = v117 & 0x3ffffffe;
                        v116 = v114 - v118 * 4;
                        v119 = ptr + v114;
                        j = v118;
                        do
                        {
                            v121 = j;
                            *(char *)v119 = 0xff;
                            *(char *)(v119 - 4) = 0xff;
                            v119 -= 8;
                            j = v121 - 2;
                        } while (j);
                        if (v117 == v118)
                            goto LABEL_3d5a84;
                        *(char *)(ptr + v116) = 0xff;
                    }
                    while (1)
                    {
                        v123 = v116 - 4;
                        if (4 > (long long)v116)
                            break;
                        *(char *)(ptr + v123) = 0xff;
                        v116 = v123;
                    }
                }
            }
LABEL_3d5a84:
            if (v2 > 0)
            {
                v124 = (int)((unsigned int)v58) >> 1;
                v125 = a0->field_0;
                if ((int)v124 >= 1)
                {
                    v126 = v125 * v49;
                    if ((int)v126 >= 1)
                    {
                        v127 = 0;
                        v128 = 0;
                        v129 = ptr + v126;
                        v130 = v126 & 0x7fffffe0;
                        v131 = v126 & 0x7ffffff8;
                        v132 = ptr + 16;
                        v133 = ((unsigned int)v58 - 1) * (unsigned int)v126;
                        do
                        {
                            v134 = v127;
                            v135 = v133;
                            v136 = v126 & 0xffffffff;
                            if ((unsigned int)v126 >= 8)
                            {
                                v137 = v128 * v126;
                                v138 = (v58 + ~(unsigned int)v128) * v126;
                                v139 = ptr + v138;
                                v140 = v129 + v137;
                                if (ptr + v137 < v129 + v138)
                                {
                                    v141 = arm64g_calculate_condition(0x33, v136, 8, 0);
                                    v142 = arm64g_calculate_condition(52, (v141 & 1 ? v139 : 0x20000000), (v141 & 1 ? v140 : 0), 0);
                                    if (v142 & 1)
                                        goto LABEL_3d5b38;
                                }
                                else
                                {
                                    v143 = arm64g_calculate_condition(0x33, v136, 8, 0);
                                    v144 = arm64g_calculate_condition(48, (v143 & 1 ? v139 : 0x20000000), (v143 & 1 ? v140 : 0), 0);
                                    if (v144 & 1)
                                        goto LABEL_3d5b38;
                                }
                                if (32 > (unsigned int)v126)
                                {
                                    v145 = 0;
                                }
                                else
                                {
                                    node = v132 + v134;
                                    iter = v132 + v135;
                                    l = v130;
                                    do
                                    {
                                        v149 = l;
                                        v150 = *(int128_t *)((char *)node - 16);
                                        v151 = *node;
                                        v152 = *iter;
                                        *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)iter - 16);
                                        *node = v152;
                                        *(uint128_t *)((char *)iter - 16) = v150;
                                        *iter = v151;
                                        node += 2;
                                        iter += 2;
                                        l = v149 - 32;
                                    } while (l);
                                    if (v130 == v126)
                                        continue;
                                    v145 = v130;
                                    v154 = v130;
                                    if (!(v126 & 24))
                                        goto LABEL_3d5b3c;
                                }
                                iter1 = ptr + v145 + v134;
                                iter2 = ptr + v145 + v135;
                                v157 = -v131 + v145;
                                do
                                {
                                    v158 = *(unsigned long *)&*(double *)iter1;
                                    *(double *)iter1 = *(double *)iter2;
                                    iter1 += 1;
                                    *iter2 = v158;
                                    iter2 += 1;
                                    v160 = arm64g_calculate_condition(18, v157, 8, 0);
                                    v157 += 8;
                                } while (v160 & 1);
                                v154 = v131;
                                if (v131 == v126)
                                    continue;
                                goto LABEL_3d5b3c;
                            }
                            else
                            {
LABEL_3d5b38:
                                v154 = 0;
LABEL_3d5b3c:
                                v161 = ptr + v154 + v134;
                                v162 = ptr + v154 + v135;
                                k = v126 - v154;
                                do
                                {
                                    v164 = k;
                                    v165 = *v161;
                                    *v161 = *v162;
                                    v161 += 1;
                                    *v162 = v165;
                                    v162 += 1;
                                    k = v164 - 1;
                                } while (k);
                            }
                        } while ((v128 += 1, v127 = (unsigned int)v134 + (unsigned int)v126, v133 = v135 - v126, v128 != v124));
                    }
                }
            }
            else
            {
                v125 = a0->field_0;
            }
            if (a4 && (unsigned int)v49 != a4)
            {
                ptr = sub_3cf884(ptr, v49);
                if (!ptr)
                {
                    if (*(long long *)&g_10002b0 == v34)
                        return ptr;
                    ___stack_chk_fail();
                }
                else
                {
                    v125 = a0->field_0;
                }
            }
            *(unsigned int *)v0 = v125;
            *(unsigned int *)v1 = (&a0->field_0)[1];
            if (!a3)
            {
                if (*(long long *)&g_10002b0 == v34)
                    return ptr;
                ___stack_chk_fail();
            }
            else
            {
                *(int *)a3 = a0->field_4;
                if (*(long long *)&g_10002b0 == v34)
                    return ptr;
                ___stack_chk_fail();
            }
        }
    }
    else
    {
        if (*(long long *)&g_10002b0 == v34)
            return 0;
        ___stack_chk_fail();
    }
}
