/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbcf85c..0xbd0270 (2580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bcf85c_8 {
    char padding_0[217];
    char *field_d9;
} st_bcf85c_8;

typedef struct st_bcf85c_0 {
    char *field_0;
    struct st_bcf85c_1 *field_8;
    struct st_bcf85c_1 *field_10;
} st_bcf85c_0;

typedef struct st_bcf85c_2 {
    char *field_0;
    struct st_bcf85c_1 *field_8;
    unsigned long long field_10;
} st_bcf85c_2;

typedef struct st_bcf85c_3 {
    char padding_0[272];
    char *field_110;
} st_bcf85c_3;

typedef struct st_bcf85c_6 {
    char *field_0;
    char padding_8[352];
    char *field_168;
} st_bcf85c_6;

typedef struct st_bcf85c_4 {
    char *field_0;
    struct st_bcf85c_1 *field_8;
    struct st_bcf85c_1 *field_10;
    char padding_18[240];
    struct st_bcf85c_1 *field_108;
    char padding_110[80];
    struct st_bcf85c_1 *field_160;
    struct st_bcf85c_1 *field_162;
    struct st_bcf85c_1 *field_168;
    struct st_bcf85c_1 *field_170;
} st_bcf85c_4;

typedef struct st_bcf85c_1 {
    struct st_bcf85c_1 *field_0;
    struct st_bcf85c_1 *field_8;
    struct st_bcf85c_1 *field_10;
    struct st_bcf85c_1 *field_18;
    char padding_20[240];
    struct st_bcf85c_1 *field_110;
    char padding_118[80];
    struct st_bcf85c_1 *field_168;
    struct st_bcf85c_1 *field_16a;
    struct st_bcf85c_1 *field_170;
    struct st_bcf85c_1 *field_178;
} st_bcf85c_1;

typedef struct st_bcf85c_7 {
    char *field_0;
    struct st_bcf85c_1 *field_1;
    struct st_bcf85c_1 *field_7;
    struct st_bcf85c_1 *field_8;
    struct st_bcf85c_1 *field_9;
    struct st_bcf85c_1 *field_10;
    struct st_bcf85c_1 *field_11;
    char padding_19[231];
    struct st_bcf85c_1 *field_100;
    struct st_bcf85c_1 *field_107;
    struct st_bcf85c_1 *field_108;
    struct st_bcf85c_1 *field_109;
    char padding_111[71];
    struct st_bcf85c_1 *field_158;
    struct st_bcf85c_1 *field_15a;
    struct st_bcf85c_1 *field_15f;
    struct st_bcf85c_1 *field_160;
    struct st_bcf85c_1 *field_161;
    struct st_bcf85c_1 *field_162;
    struct st_bcf85c_1 *field_163;
    struct st_bcf85c_6 *field_167;
    struct st_bcf85c_1 *field_168;
    struct st_bcf85c_1 *field_169;
    struct st_bcf85c_1 *field_170;
    struct st_bcf85c_1 *field_171;
} st_bcf85c_7;

typedef struct st_bcf85c_5 {
    char *field_0;
    struct st_bcf85c_1 *field_1;
    struct st_bcf85c_1 *field_2;
    struct st_bcf85c_1 *field_8;
    struct st_bcf85c_1 *field_9;
    struct st_bcf85c_1 *field_a;
    struct st_bcf85c_1 *field_11;
    struct st_bcf85c_1 *field_12;
    char padding_1a[231];
    struct st_bcf85c_1 *field_101;
    struct st_bcf85c_1 *field_108;
    struct st_bcf85c_1 *field_109;
    struct st_bcf85c_1 *field_10a;
    char padding_112[71];
    struct st_bcf85c_1 *field_159;
    struct st_bcf85c_1 *field_15b;
    struct st_bcf85c_1 *field_160;
    struct st_bcf85c_1 *field_161;
    struct st_bcf85c_1 *field_162;
    struct st_bcf85c_1 *field_163;
    struct st_bcf85c_1 *field_164;
    struct st_bcf85c_6 *field_168;
    struct st_bcf85c_1 *field_169;
    struct st_bcf85c_1 *field_16a;
    struct st_bcf85c_1 *field_171;
    struct st_bcf85c_1 *field_172;
} st_bcf85c_5;

extern long long g_ef8c80;
extern long long g_ef8cf8;
extern long long g_ef8db8;

char * sub_bcf85c(st_bcf85c_2 *a0, st_bcf85c_0 *a1, char *a2)
{
    char *v14;  // x19
    char *v15;  // x24
    char *v24;  // x12
    char *v120;  // x20
    st_bcf85c_3 *v122;  // x8
    char *v123;  // x0
    unsigned long v25;  // cc_dep1
    char *v124;  // x21
    char *ptr1;  // x0
    char *v126;  // x8
    unsigned long v26;  // cc_dep2
    char v27;  // x12
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4102
    char *v30;  // w12
    char *ptr2;  // x21
    st_bcf85c_4 *v32;  // x8
    char *v33;  // x27
    char *v16;  // x8
    char *v34;  // x20
    char **v35;  // x9
    char *v36;  // x8
    char *v37;  // x28
    unsigned long long v38;  // 4102
    char *v39;  // x28
    char *v40;  // x0
    char *v41;  // x21
    st_bcf85c_4 *v42;  // x8
    st_bcf85c_0 *v43;  // x9
    char *v17;  // x22
    char *v44;  // x28
    char *v45;  // x10
    st_bcf85c_7 *v46;  // x8
    st_bcf85c_2 *v47;  // x0
    char *v48;  // x22
    char *v49;  // x26
    char *v50;  // x12
    char *v51;  // x22
    char *v52;  // x28
    st_bcf85c_4 *v53;  // x8
    char *v18;  // x26
    char *v54;  // x15
    st_bcf85c_0 *v55;  // x23
    unsigned long long v56;  // x27
    unsigned long long v57;  // x25
    unsigned long long n;  // x23
    st_bcf85c_8 *v59;  // x8
    unsigned long v60;  // x10
    char **v61;  // x8
    char *v62;  // x9
    unsigned long v63;  // cc_dep1
    char *v19;  // x23
    char *v64;  // x9
    unsigned long long v65;  // 4104
    unsigned long long v66;  // 4104
    char *v67;  // x8
    unsigned long long v68;  // 4108
    unsigned long long v69;  // 4108
    unsigned long v70;  // cc_dep1
    char *v71;  // x9
    unsigned long long v72;  // 4105
    unsigned long long v73;  // 4105
    char *node;  // x9
    char *v74;  // x8
    unsigned long long v75;  // 4106
    unsigned long long v76;  // 4106
    char *v77;  // w10
    unsigned long long v78;  // 4106
    unsigned long long v79;  // 4106
    char *v80;  // x27
    unsigned long long v81;  // 4105
    unsigned long long v82;  // 4105
    char *v83;  // x19
    char *iter;  // x10
    unsigned long long v84;  // 4106
    unsigned long long v85;  // 4106
    char *v86;  // w25
    char *v87;  // x0
    char *v88;  // x23
    char **v89;  // x24
    st_bcf85c_4 *v90;  // x8
    st_bcf85c_0 *v91;  // x9
    char *v92;  // x22
    char *v93;  // x23
    char *iter1;  // x11
    char *v94;  // x1
    char *v95;  // x22
    char *v96;  // x8
    unsigned long v97;  // x9
    unsigned long v98;  // cc_dep1
    unsigned long v99;  // cc_dep2
    char *v100;  // x9
    unsigned long long v101;  // 4102
    unsigned long long v102;  // 4102
    char *v103;  // x28
    char *iter2;  // x25
    char *v104;  // x27
    st_bcf85c_5 *v105;  // x8
    char *v106;  // x25
    st_bcf85c_0 *v107;  // x23
    unsigned long long v108;  // x24
    unsigned long long v109;  // x22
    unsigned long long v110;  // x25
    unsigned long long n1;  // x23
    st_bcf85c_8 *v112;  // x8
    unsigned long v113;  // x10
    char *v0;  // [bp-0xc0]
    st_bcf85c_2 *v1;  // [bp-0xb8]
    char *v2;  // [bp-0xb0]
    char *v3;  // [bp-0xa8]
    char *v4;  // [bp-0xa0]
    char *v5;  // [bp-0x98], Other Possible Types: unsigned long
    char *v6;  // [bp-0x90]
    char *v7;  // [bp-0x88]
    char *v8;  // [bp-0x80]
    char **v9;  // [bp-0x78], Other Possible Types: char *
    char *v10;  // [bp-0x70]
    char *v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a2;
    v15 = a0->field_0;
    if (a0->field_0)
    {
        v16 = a0->field_8;
        v17 = a1->field_0;
        v18 = a1->field_8;
        v19 = a1->field_10;
        while (1)
        {
            node = *(short *)&v15[362];
            iter = v15 + 24;
            iter1 = node * 24;
            iter2 = 0xffffffffffffffff;
            do
            {
                if (iter1)
                {
                    v24 = *(long long *)(iter - 16);
                    v25 = v17;
                    v26 = v24;
                    if (v24 <= v17)
                    {
                        v27 = v17 > v24;
                        v28 = arm64g_calculate_condition(20, v25, v26, 0);
                        if (v28 & 1)
                            continue;
                    }
                    else
                    {
                        v27 = 0xff;
                        v29 = arm64g_calculate_condition(20, v25, v26, 0);
                        if (v29 & 1)
                            continue;
                    }
                    if (v18 != *(long long *)(iter - 8))
                    {
                        v27 = (char)&v18[-1 * *(long long *)(iter - 8)];
                    }
                    else if ((unsigned long long)*(long long *)iter <= v19)
                    {
                        v27 = v19 > (unsigned long long)*(long long *)iter;
                    }
                    else
                    {
                        v27 = 0xff;
                    }
                }
                else
                {
                    goto LABEL_bcf90c;
                }
            } while ((iter += 24, iter2 += 1, iter1 -= 24, v30 = (char *)v27, v30 == 1));
            node = iter2;
            if (v30)
            {
LABEL_bcf90c:
                if (v16)
                {
                    v15 = *(long long *)(v15 + 0x8 * node + 368);
                    v16 -= 1;
                }
                else
                {
                    iter2 = v15;
                    if (v18 == 2)
                        goto LABEL_bcf93c;
                    ptr2 = *(short *)&v15[362];
                    if (11 > (unsigned int)ptr2)
                    {
                        v32 = v15 + 8;
                        v33 = node + 1;
                        v34 = (char *)v32 + 0x18 * node;
                        if (v33 > ptr2)
                        {
                            *(char **)v34 = v17;
                            *(char **)&v34[8] = v18;
                            *(char **)&v34[16] = v19;
                        }
                        else
                        {
                            _memmove((char *)v32 + 0x18 * v33, v34, (ptr2 - node) * 24);
                            *(char **)v34 = v17;
                            *(char **)&v34[8] = v18;
                            *(char **)&v34[16] = v19;
                            _memmove(v15 + 0x8 * v33 + 272, v15 + 0x8 * node + 272, (ptr2 - node) * 8);
                            a0 = a0;
                        }
                        *(char **)(v15 + 0x8 * node + 272) = v14;
                        *(unsigned short *)&v15[362] = (unsigned short)ptr2 + 1;
                        v35 = &v11;
                        v36 = 2;
                    }
                    else
                    {
                        v1 = a0;
                        if (5 > node)
                        {
                            v9 = (char *)0;
                            v37 = 4;
                        }
                        else
                        {
                            v38 = arm64g_calculate_condition(4, node, 5, 0);
                            if (v38 & 1)
                            {
                                v9 = (char *)0;
                                v37 = node;
                            }
                            else if (node == 6)
                            {
                                node = 0;
                                v9 = (char *)1;
                                v37 = 5;
                            }
                            else
                            {
                                node -= 7;
                                v9 = (char *)1;
                                v37 = 6;
                            }
                        }
                        v39 = v37;
                        v40 = _malloc(368);
                        if (v40)
                        {
                            *(unsigned long long *)v40 = 0;
                            *(unsigned short *)&v40[362] = 0;
                            v41 = &(~v39)[*(short *)&v15[362]];
                            *(unsigned short *)&v40[362] = (unsigned short)v41;
                            v34 = *(long long *)(v15 + 0x8 * v39 + 272);
                            v33 = v40;
                            if (12 > v41)
                            {
                                v42 = v15 + 8;
                                v43 = (char *)v42 + 0x18 * v39;
                                v2 = v43->field_0;
                                v6 = v43->field_8;
                                v8 = v43->field_10;
                                _memcpy(v33 + 8, (char *)v42 + 0x18 * v39 + 24, v41 * 24);
                                _memcpy(v33 + 272, v15 + 0x8 * v39 + 280, v41 * 8);
                                *(unsigned short *)&v15[362] = (unsigned short)v39;
                                if (v9)
                                    v44 = v33;
                                else
                                    v44 = v15;
                                v45 = *(short *)&v44[362];
                                v46 = v44 + 8;
                                ptr2 = (char *)v46 + 0x18 * node;
                                iter1 = v33;
                                if (v45 > node)
                                {
                                    v7 = iter1;
                                    v9 = v45;
                                    v33 = v45 - node;
                                    _memmove((char *)v46 + 0x18 * node + 24, ptr2, v33 * 24);
                                    *(char **)ptr2 = v17;
                                    *(char **)&ptr2[8] = v18;
                                    *(char **)&ptr2[16] = v19;
                                    _memmove(v44 + 0x8 * node + 280, v44 + 0x8 * node + 272, v33 * 8);
                                    v45 = v9;
                                    iter1 = v7;
                                }
                                else
                                {
                                    *(char **)ptr2 = v17;
                                    *(char **)&ptr2[8] = v18;
                                    *(char **)&ptr2[16] = v19;
                                }
                                v36 = 0;
                                *(char **)(v44 + 0x8 * node + 272) = v14;
                                *(unsigned short *)&v44[362] = (unsigned short)v45 + 1;
                                v11 = v6;
                                v35 = &v10;
                                iter = v8;
                                a0 = v1;
                                node = v2;
                            }
                            else
                            {
                                sub_c73bb0(0, v41, 11, &g_ef8db8);
                                goto LABEL_bd014c;
                            }
                        }
                        else
                        {
                            sub_c6ba70(8, 368);
                            goto LABEL_bd014c;
                        }
                    }
                    v47 = a0;
                    *v35 = v36;
                    v9 = v11;
                    if (v11 == 2)
                        goto LABEL_0xbcf980;
                    v48 = v10;
                    v49 = *(long long *)v15;
                    if (v49)
                    {
                        v50 = 0;
                        v1 = v47;
                        break;
                    }
                    else
                    {
                        v14 = v34;
                        v33 = iter;
                        v6 = node;
                        ptr2 = iter1;
                    }
                }
            }
            else
            {
                v19 = v15;
                goto LABEL_bcf93c;
            }
        }
LABEL_bcfc08:
        if (v48 == v50)
        {
            v51 = *(short *)&v15[360];
            v52 = *(short *)&v49[362];
            if (11 > (unsigned int)v52)
            {
                v53 = v49 + 8;
                v54 = v51 + 1;
                v55 = (char *)v53 + (unsigned int)v51 * 24;
                if ((unsigned int)v52 > (unsigned int)v51)
                {
                    v7 = iter1;
                    v8 = iter;
                    v5 = v50;
                    _memmove((char *)v53 + (unsigned int)v54 * 24, v55, (v52 - v51) * 24);
                    v4 = v33;
                    v56 = v51 * 8;
                    v55->field_0 = node;
                    v55->field_8 = v9;
                    v57 = (v51 + 1) * 8;
                    v55->field_10 = v8;
                    n = (v52 - v51) * 8;
                    v9 = v49 + 272;
                    _memmove(&v49[272 + v57], &v49[272 + v56], n);
                    *(char **)((char *)v9 + v56) = v34;
                    v33 = v4;
                    _memmove(&v49[368 + v56 + 16], &v49[368 + v57], n);
                    v54 = v51 + 1;
                    v50 = v5;
                    iter1 = v7;
                    v47 = v1;
                }
                else
                {
                    v55->field_0 = node;
                    v55->field_8 = v9;
                    v55->field_10 = iter;
                    *(char **)(v49 + 0x8 * v51 + 272) = v34;
                }
                *(char **)(v49 + 0x8 * v54 + 368) = iter1;
                *(unsigned short *)&v49[362] = (unsigned short)v52 + 1;
                if (v52 + 2 > v54)
                {
                    v59 = v51 + 47;
                    do
                    {
                        v60 = *(long long *)(v49 + 0x8 * v59);
                        *(char **)v60 = v49;
                        *(unsigned short *)(v60 + 360) = (unsigned int)v59 - 46;
                        v59 = &v59->padding_0[1];
                    } while (-v52 + v59 != 48);
                }
                v61 = &v11;
                v62 = 2;
                goto LABEL_bcff90;
            }
            else
            {
                v2 = node;
                v7 = iter1;
                v8 = iter;
                v5 = v50 + 1;
                v63 = v51 & 0xffff;
                if ((unsigned int)v51 == 6)
                {
                    v64 = 5;
                    v65 = arm64g_calculate_condition(3, v63, 6, 0);
                    if (!(v65 & 1))
                        goto LABEL_bcfcfa;
                    goto LABEL_bcfcf9;
                }
                else
                {
                    v64 = 6;
                    v66 = arm64g_calculate_condition(3, v63, 6, 0);
                    if (v66 & 1)
                    {
LABEL_bcfcf9:
                        v67 = 0;
                        v68 = arm64g_calculate_condition(19, v63, 6, 0);
                        if (!(v68 & 1))
                            goto LABEL_bcfd02;
                        goto LABEL_bcfd01;
                    }
                    else
                    {
LABEL_bcfcfa:
                        v67 = v51 - 7;
                        v69 = arm64g_calculate_condition(19, v63, 6, 0);
                        if (v69 & 1)
                        {
LABEL_bcfd01:
                            goto LABEL_bcfd04;
                        }
                        else
                        {
LABEL_bcfd02:
LABEL_bcfd04:
                            v70 = v51 & 0xffff;
                            if ((unsigned int)v51 == 5)
                            {
                                v71 = v51;
                                v72 = arm64g_calculate_condition(3, v70, 5, 0);
                                if (!(v72 & 1))
                                    goto LABEL_bcfd0e;
                                goto LABEL_bcfd0d;
                            }
                            else
                            {
                                v71 = v64;
                                v73 = arm64g_calculate_condition(3, v70, 5, 0);
                                if (v73 & 1)
                                {
LABEL_bcfd0d:
                                    v74 = v51;
                                    v75 = arm64g_calculate_condition(3, v70, 5, 0);
                                    if (!(v75 & 1))
                                        goto LABEL_bcfd12;
                                    goto LABEL_bcfd11;
                                }
                                else
                                {
LABEL_bcfd0e:
                                    v74 = v67;
                                    v76 = arm64g_calculate_condition(3, v70, 5, 0);
                                    if (v76 & 1)
                                    {
LABEL_bcfd11:
                                        v77 = (char *)0;
                                        v78 = arm64g_calculate_condition(0x33, v70, 5, 0);
                                        if (!(v78 & 1))
                                            goto LABEL_bcfd1a;
                                        goto LABEL_bcfd19;
                                    }
                                    else
                                    {
LABEL_bcfd12:
                                        v77 = (char *)1;
                                        v79 = arm64g_calculate_condition(0x33, v70, 5, 0);
                                        if (v79 & 1)
                                        {
LABEL_bcfd19:
                                            v80 = 4;
                                            v81 = arm64g_calculate_condition(0x33, v70, 5, 0);
                                            if (!(v81 & 1))
                                                goto LABEL_bcfd1e;
                                            goto LABEL_bcfd1d;
                                        }
                                        else
                                        {
LABEL_bcfd1a:
                                            v80 = v71;
                                            v82 = arm64g_calculate_condition(0x33, v70, 5, 0);
                                            if (v82 & 1)
                                            {
LABEL_bcfd1d:
                                                v83 = v51;
                                                v84 = arm64g_calculate_condition(0x33, v70, 5, 0);
                                                if (!(v84 & 1))
                                                    goto LABEL_bcfd22;
                                                goto LABEL_bcfd21;
                                            }
                                            else
                                            {
LABEL_bcfd1e:
                                                v83 = v74;
                                                v85 = arm64g_calculate_condition(0x33, v70, 5, 0);
                                                if (v85 & 1)
                                                {
LABEL_bcfd21:
                                                    v86 = (char *)0;
                                                    goto LABEL_bcfd24;
                                                }
                                                else
                                                {
LABEL_bcfd22:
                                                    v86 = v77;
LABEL_bcfd24:
                                                    v87 = _malloc();
                                                    if (v87)
                                                    {
                                                        ptr2 = v87;
                                                        v3 = v83;
                                                        *(unsigned long long *)v87 = 0;
                                                        *(unsigned short *)&v87[362] = 0;
                                                        v88 = &(~v80)[*(short *)&v49[362]];
                                                        *(unsigned short *)&v87[362] = (unsigned short)v88;
                                                        v89 = v49 + 272;
                                                        v14 = *(long long *)((char *)v89 + 0x8 * v80);
                                                        if (12 > v88)
                                                        {
                                                            v90 = v49 + 8;
                                                            v91 = (char *)v90 + (unsigned int)v80 * 24;
                                                            v6 = v91->field_0;
                                                            v0 = v91->field_8;
                                                            v4 = v91->field_10;
                                                            v92 = v80 + 1;
                                                            _memcpy(ptr2 + 8, (char *)v90 + (unsigned int)v92 * 24, v88 * 24);
                                                            _memcpy(ptr2 + 272, (char *)v89 + 0x8 * v92, v88 * 8);
                                                            *(unsigned short *)&v49[362] = (unsigned short)v80;
                                                            v93 = *(short *)&ptr2[362];
                                                            v94 = v93 + 1;
                                                            if (12 > v93)
                                                            {
                                                                v95 = v3;
                                                                if (v52 - v80 == v94)
                                                                {
                                                                    _memcpy(ptr2 + 368, v49 + 0x8 * v80 + 376, v94 * 8);
                                                                    v96 = 0;
                                                                    do
                                                                    {
                                                                        v97 = *(long long *)(ptr2 + 0x8 * v96 + 368);
                                                                        *(char **)v97 = ptr2;
                                                                        *(unsigned short *)(v97 + 360) = (unsigned short)v96;
                                                                        v98 = v96;
                                                                        v99 = v93;
                                                                        if (v93 <= v96)
                                                                        {
                                                                            v100 = v96;
                                                                            v101 = arm64g_calculate_condition(36, v98, v99, 0);
                                                                            if (v101 & 1)
                                                                                break;
                                                                        }
                                                                        else
                                                                        {
                                                                            v100 = v96 + 1;
                                                                            v102 = arm64g_calculate_condition(36, v98, v99, 0);
                                                                            if (v102 & 1)
                                                                                break;
                                                                        }
                                                                    } while ((v96 = v100, v100 <= v93));
                                                                    if (v86)
                                                                        v103 = ptr2;
                                                                    else
                                                                        v103 = v49;
                                                                    v104 = *(short *)&v103[362];
                                                                    v105 = v103 + 8;
                                                                    v106 = v95 + 1;
                                                                    v107 = (char *)v105 + (unsigned int)v95 * 24;
                                                                    v108 = v104 - v95;
                                                                    if (v104 > v95)
                                                                    {
                                                                        _memmove((char *)v105 + (unsigned int)v106 * 24, v107, v108 * 24);
                                                                        v109 = v3 * 8;
                                                                        v107->field_0 = v2;
                                                                        v107->field_8 = v9;
                                                                        v9 = v106;
                                                                        v110 = v106 * 8;
                                                                        v107->field_10 = v8;
                                                                        n1 = v108 * 8;
                                                                        _memmove(&v103[272 + v110], &v103[272 + v109], n1);
                                                                        *(char **)&v103[272 + v109] = v34;
                                                                        v95 = v3;
                                                                        v106 = v9;
                                                                        _memmove(&v103[368 + v109 + 16], &v103[368 + v110], n1);
                                                                    }
                                                                    else
                                                                    {
                                                                        v107->field_0 = v2;
                                                                        v107->field_8 = v9;
                                                                        v107->field_10 = v8;
                                                                        *(char **)(v103 + 0x8 * v95 + 272) = v34;
                                                                    }
                                                                    v47 = v1;
                                                                    v50 = v5;
                                                                    *(char **)(v103 + 0x8 * v106 + 368) = v7;
                                                                    *(unsigned short *)&v103[362] = (unsigned short)v104 + 1;
                                                                    if (v104 + 2 > v106)
                                                                    {
                                                                        v112 = v95 + 47;
                                                                        do
                                                                        {
                                                                            v113 = *(long long *)(v103 + 0x8 * v112);
                                                                            *(char **)v113 = v103;
                                                                            *(unsigned short *)(v113 + 360) = (unsigned int)v112 - 46;
                                                                            v112 = &v112->padding_0[1];
                                                                        } while (-v104 + v112 != 48);
                                                                    }
                                                                    v11 = v0;
                                                                    v61 = &v10;
                                                                    v15 = v49;
                                                                    v62 = v50;
                                                                    v33 = v4;
LABEL_bcff90:
                                                                    *v61 = v62;
                                                                    v9 = v11;
                                                                    v48 = v10;
                                                                    v49 = *(long long *)v15;
                                                                    v34 = v14;
                                                                    iter = v33;
                                                                    node = v6;
                                                                    iter1 = ptr2;
                                                                    if (v49)
                                                                        goto LABEL_bcfc08;
                                                                    goto LABEL_bcfc08;
                                                                }
                                                                else
                                                                {
                                                                    sub_c73c80("assertion failed: src.len() == dst.len()assertion failed: idx < CAPACITYassertion failed: edge.height == self.height - 1Hash table capacity overflow", 40, &g_ef8cf8);
                                                                    goto LABEL_bd014c;
                                                                }
                                                            }
                                                            else
                                                            {
                                                                sub_c73bb0(0);
                                                                goto LABEL_bd014c;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            sub_c73bb0(0, v88, 11, &g_ef8db8);
                                                            goto LABEL_bd014c;
                                                        }
                                                    }
                                                    else
                                                    {
                                                        sub_c6ba70(8, 464);
                                                        goto LABEL_bd014c;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else
        {
            sub_c73c80("assertion failed: edge.height == self.node.height - 1", 53, &g_ef8c80);
            goto LABEL_bd014c;
        }
    }
    else
    {
        v120 = a1->field_8;
        v19 = a1->field_10;
        if (v120 == 2)
        {
            iter2 = 0;
LABEL_bcf93c:
            v122 = v19 + 0x8 * iter2;
            v123 = v122->field_110;
            v122->field_110 = v14;
            return v123;
        }
        v124 = a1->field_0;
        ptr1 = _malloc(368);
        if (!ptr1)
        {
            sub_c6ba70(8, 368);
LABEL_bd014c:
            __debugbreak();
        }
        v126 = ptr1;
        v47 = a0;
        a0->field_0 = v126;
        a0->field_8 = 0;
        *(unsigned short *)&v126[362] = 1;
        *(unsigned long long *)v126 = 0;
        *(char **)&v126[8] = v124;
        *(char **)&v126[16] = v120;
        *(char **)&v126[24] = v19;
        *(char **)&v126[272] = v14;
    }
}
