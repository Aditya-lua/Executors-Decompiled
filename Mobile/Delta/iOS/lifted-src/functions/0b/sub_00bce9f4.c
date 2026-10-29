/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbce9f4..0xbcf4ec (2808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bce9f4_2 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bce9f4_2;

typedef struct st_bce9f4_3 {
    void* field_0;
    void* field_8;
    unsigned long long field_10;
} st_bce9f4_3;

typedef struct st_bce9f4_1 {
    uint128_t field_0;
    char field_10;
    char field_11[7];
    char field_14;
} st_bce9f4_1;

typedef struct st_bce9f4_0 {
    char padding_0[272];
    uint128_t field_110;
    unsigned long long field_120;
} st_bce9f4_0;

typedef struct st_bce9f4_4 {
    void* field_0;
    char padding_8[528];
    void* field_218;
} st_bce9f4_4;

extern long long g_ef8c68;
extern long long g_ef8cf8;
extern long long g_ef8d10;
extern long long g_ef8e00;

double sub_bce9f4(void* a0, st_bce9f4_3 *a1, void* a2, st_bce9f4_2 *a3)
{
    void* v22;  // x20
    void* v23;  // x25
    unsigned int v32;  // w23
    void* v122;  // x25
    st_bce9f4_2 *ptr;  // x24
    unsigned long long v124;  // x19
    unsigned long long v125;  // x20
    unsigned long long n;  // x25
    void* v127;  // x8
    unsigned long long *ptr1;  // x24
    void* v129;  // x8
    void* v130;  // x8
    void* v131;  // x10
    st_bce9f4_0 *v33;  // x8
    unsigned long v132;  // x28
    unsigned long v133;  // x26
    void* v134;  // x10
    void* v135;  // x8
    void* v136;  // x28
    st_bce9f4_2 *ptr2;  // x22
    unsigned long long v138;  // x19
    unsigned long long n1;  // x24
    void* v140;  // x8
    unsigned long long *v141;  // x22
    uint128_t v34;  // q0
    unsigned long long *v142;  // x8
    st_bce9f4_4 **iter;  // x8
    void* k;  // x9
    void* v145;  // x9
    void* *v146;  // x10
    void* v148;  // x19
    void* v149;  // x23
    void* v150;  // x0
    void* v151;  // x21
    uint128_t v35;  // q0
    unsigned long long v152;  // 4121
    st_bce9f4_3 *v153;  // x9
    void* v154;  // x0
    void* v36;  // x24
    void* v37;  // x8
    void* v38;  // x9
    st_bce9f4_1 *v39;  // x21
    unsigned long long v40;  // x19
    unsigned long long n2;  // x22
    void* v24;  // x8
    st_bce9f4_0 *v42;  // x8
    void* v43;  // w19
    void* v44;  // x26
    unsigned long long v45;  // 4102
    void* v46;  // x28
    void* v47;  // x0
    void* v48;  // x22
    void* v49;  // x1
    void* v50;  // x8
    unsigned long long v51;  // x9
    void* v25;  // x10
    st_bce9f4_2 *v52;  // x10
    void* v53;  // x19
    unsigned long long *v54;  // x9
    unsigned long long v55;  // x27
    unsigned long long v56;  // x21
    void* v57;  // x26
    void* v58;  // x27
    void* v59;  // x8
    st_bce9f4_1 *v60;  // x21
    unsigned long long v61;  // x19
    void* v26;  // x11
    unsigned long long v62;  // x24
    st_bce9f4_2 *v63;  // x9
    st_bce9f4_2 *v64;  // x8
    void* v65;  // x8
    unsigned long long v66;  // x27
    st_bce9f4_3 *v67;  // x9
    void* i;  // x8
    void* v69;  // x10
    unsigned long v70;  // x12
    unsigned long v71;  // x24
    void* v27;  // x12
    unsigned long long v72;  // x23
    void* v73;  // x11
    void* v74;  // x21
    void* v75;  // x26
    void* v76;  // x25
    unsigned long v77;  // cc_dep1
    void* v78;  // x9
    unsigned long long v79;  // 4104
    unsigned long long v80;  // 4104
    void* v81;  // x8
    void* node;  // x28
    unsigned long long v82;  // 4108
    unsigned long long v83;  // 4108
    unsigned long v84;  // cc_dep1
    void* v85;  // x9
    unsigned long long v86;  // 4105
    unsigned long long v87;  // 4105
    void* v88;  // x8
    unsigned long long v89;  // 4106
    unsigned long long v90;  // 4106
    void* v91;  // w10
    unsigned long long v92;  // 4106
    unsigned long long v93;  // 4106
    void* v94;  // x23
    unsigned long long v95;  // 4105
    unsigned long long v96;  // 4105
    void* v97;  // x28
    unsigned long long v98;  // 4106
    unsigned long long v99;  // 4106
    void* v100;  // w26
    void* v101;  // x0
    char v30;  // x13
    void* v102;  // x1
    void* v103;  // x8
    unsigned long long v104;  // x9
    st_bce9f4_2 *v105;  // x10
    void* v106;  // x19
    unsigned long long *v107;  // x9
    unsigned long v108;  // x27
    unsigned long long v109;  // x24
    void* v110;  // x24
    void* v111;  // x1
    void* j;  // w13
    void* v112;  // x8
    unsigned long v113;  // x9
    unsigned long v114;  // cc_dep1
    unsigned long v115;  // cc_dep2
    void* v116;  // x9
    unsigned long long v117;  // 4102
    unsigned long long v118;  // 4102
    void* v119;  // x26
    void* v120;  // x23
    void* v121;  // x8
    unsigned long v0;  // [bp-0x158]
    unsigned long v1;  // [bp-0x150]
    void* v2;  // [bp-0x148], Other Possible Types: unsigned long long
    void* v3;  // [bp-0x140]
    st_bce9f4_2 *v4;  // [bp-0x138], Other Possible Types: unsigned long
    unsigned long v5;  // [bp-0x128]
    unsigned long v6;  // [bp-0x120]
    unsigned long long v7;  // [bp-0x118]
    uint56_t v8;  // [bp-0x110]
    uint56_t v9;  // [bp-0x108]
    uint128_t v10;  // [bp-0x100]
    unsigned long v11;  // [bp-0xf0]
    uint128_t v12;  // [bp-0xe0]
    unsigned long v13;  // [bp-0xd0]
    uint128_t v14;  // [bp-0xc0]
    unsigned long v15;  // [bp-0xb0]
    uint128_t v16;  // [bp-0xa0]
    unsigned long v17;  // [bp-0x90]
    uint128_t v18;  // [bp-0x80]
    unsigned long v19;  // [bp-0x70]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v22 = a0;
    v23 = a1->field_0;
    if (v23)
    {
        v24 = a1->field_8;
        while (1)
        {
            v25 = v23 + 8;
            v26 = (short)v23[538];
            v27 = v26 * 24;
            node = 0xffffffffffffffff;
            do
            {
                if (!v27)
                    goto LABEL_bcea70;
                if ((unsigned long long)*(long long *)v25 <= (unsigned long long)*(long long *)a2)
                    v30 = (unsigned long long)*(long long *)a2 > (unsigned long long)*(long long *)v25;
                else
                    v30 = 0xff;
                node += 1;
                v27 -= 24;
                j = (void*)v30;
                v25 += 24;
            } while (j == 1);
            v26 = node;
            if (!j)
                break;
LABEL_bcea70:
            if (!v24)
                goto LABEL_bcea84;
            v23 = *(long long *)((char *)v23 + 0x8 * v26 + 544);
            v24 -= 1;
        }
    }
    else
    {
LABEL_bcea84:
        v32 = (char)a2[16];
        *(int *)&v8 = (int)a2[0x11];
        *(int *)((char *)&v8 + 3) = (int)a2[20];
        node = v26;
        if (v32 != 2)
        {
            if (v23)
            {
                *(unsigned int *)&v9 = *(unsigned int *)&v8;
                *(unsigned int *)((char *)&v9 + 3) = *(unsigned int *)((void*)&v8 + 3);
                v36 = (short)v23[538];
                if (11 > (unsigned int)v36)
                {
                    v37 = v23 + 8;
                    v38 = v26 + 1;
                    v39 = v37 + 24 * v26;
                    if (v38 > v36)
                    {
                        v39->field_0 = *(int128_t *)a2;
                        v39->field_10 = v32;
                        *(unsigned int *)&v39->field_11[0] = *(unsigned int *)&v9;
                        *(unsigned int *)&v39->field_11[3] = *(unsigned int *)((void*)&v9 + 3);
                        v18 = a3->field_0;
                        v19 = a3->field_10;
                    }
                    else
                    {
                        v40 = v38 * 24;
                        n2 = (v36 - v26) * 24;
                        _memmove(v37 + v40, v39, n2);
                        v39->field_0 = *(int128_t *)a2;
                        v39->field_10 = v32;
                        *(unsigned int *)&v39->field_11[3] = *(unsigned int *)((void*)&v9 + 3);
                        *(unsigned int *)&v39->field_11[0] = *(unsigned int *)&v9;
                        v18 = a3->field_0;
                        v19 = a3->field_10;
                        _memmove(v23 + 272 + v40, v23 + 272 + 24 * v26, n2);
                    }
                    v42 = v23 + 24 * v26;
                    v42->field_120 = v19;
                    v42->field_110 = v18;
                    *(unsigned short *)&v23[538] = (unsigned short)v36 + 1;
                    a1->field_10 = a1->field_10 + 1;
                    *(unsigned long *)v22 = 0x8000000000000000;
                    return *(unsigned long long *)&v18;
                }
                v3 = a2;
                v4 = a3;
                if (5 > v26)
                {
                    v43 = (void*)0;
                    v44 = 4;
                }
                else
                {
                    v45 = arm64g_calculate_condition(4, v26, 5, 0);
                    if (v45 & 1)
                    {
                        v43 = (void*)0;
                        v44 = v26;
                    }
                    else if (v26 == 6)
                    {
                        v26 = 0;
                        v43 = (void*)1;
                        v44 = 5;
                    }
                    else
                    {
                        v26 -= 7;
                        v43 = (void*)1;
                        v44 = 6;
                    }
                }
                v46 = v26;
                v47 = _malloc(544);
                if (v47)
                {
                    v48 = v47;
                    v2 = v43;
                    *(unsigned long long *)v47 = 0;
                    *(unsigned short *)&v47[538] = 0;
                    v49 = (short)v23[538] + ~v44;
                    *(unsigned short *)&v47[538] = (unsigned short)v49;
                    v50 = v23 + 8;
                    v51 = v44 * 24;
                    v52 = v50 + v51;
                    v19 = v52->field_10;
                    v18 = v52->field_0;
                    v53 = v23 + 272;
                    v54 = v53 + v51;
                    v6 = v54[1];
                    v7 = *v54;
                    if (12 > v49)
                    {
                        v5 = v54[2];
                        v55 = 24 + 24 * v44;
                        v56 = v49 * 24;
                        _memcpy(v48 + 8, v50 + v55, v56);
                        _memcpy(v48 + 272, v53 + v55, v56);
                        *(unsigned short *)&v23[538] = (unsigned short)v44;
                        v16 = v18;
                        v17 = v19;
                        if (v2)
                            v57 = v48;
                        else
                            v57 = v23;
                        v58 = (short)v57[538];
                        v59 = v57 + 8;
                        v60 = v59 + 24 * v46;
                        if (v58 > v46)
                        {
                            v61 = v46 * 24;
                            v62 = (v58 - v46) * 24;
                            _memmove(v59 + v61 + 24, v60, v62);
                            v60->field_0 = *(int128_t *)v3;
                            v60->field_10 = v32;
                            *(unsigned int *)&v60->field_11[3] = *(unsigned int *)((void*)&v9 + 3);
                            *(unsigned int *)&v60->field_11[0] = *(unsigned int *)&v9;
                            v63 = v4;
                            v18 = v63->field_0;
                            v19 = v63->field_10;
                            _memmove(v57 + 272 + v61 + 24, v57 + 272 + v61, v62);
                        }
                        else
                        {
                            v60->field_0 = *(int128_t *)v3;
                            v60->field_10 = v32;
                            *(unsigned int *)&v60->field_11[0] = *(unsigned int *)&v9;
                            *(unsigned int *)&v60->field_11[3] = *(unsigned int *)((void*)&v9 + 3);
                            v64 = v4;
                            v18 = v64->field_0;
                            v19 = v64->field_10;
                        }
                        v65 = v57 + 24 * v46;
                        *(unsigned long *)&v65[288] = v19;
                        *(uint128_t *)&v65[272] = v18;
                        *(unsigned short *)&v57[538] = (unsigned short)v58 + 1;
                        v14 = v16;
                        v15 = v17;
                        v66 = v7;
                        if (v66 == 0x8000000000000000)
                        {
                            a1->field_10 = a1->field_10 + 1;
                            *(unsigned long *)v22 = 0x8000000000000000;
                            return *(unsigned long long *)&v16;
                        }
                        v10 = v14;
                        v11 = v15;
                        i = *(long long *)v23;
                        if (i)
                        {
                            v69 = 0;
                            v70 = v5;
                            v71 = v6;
                            v72 = v66;
                            v73 = v48;
                            do
                            {
                                v74 = i;
                                v75 = (short)v23[536];
                                v76 = (short)i[538];
                                v3 = v73;
                                v4 = v71;
                                if ((unsigned int)v76 < 11)
                                {
                                    v134 = (void*)((unsigned short)v76 + 1);
                                    v135 = v74 + 8;
                                    v136 = v75 + 1;
                                    ptr2 = v135 + (unsigned int)v75 * 24;
                                    if ((unsigned int)v76 > (unsigned int)v75)
                                    {
                                        v138 = v136 * 24;
                                        n1 = (v76 - v75) * 24;
                                        _memmove(v135 + v138, ptr2, n1);
                                        v35 = v10;
                                        ptr2->field_0 = v35;
                                        ptr2->field_10 = v11;
                                        v140 = v74 + 272;
                                        v141 = v140 + (unsigned int)v75 * 24;
                                        _memmove(v140 + v138, v141, n1);
                                        *v141 = v72;
                                        v141[1] = v4;
                                        v141[2] = v70;
                                        _memmove(v74 + 544 + v75 * 8 + 16, v74 + 544 + v136 * 8, (v76 - v75) * 8);
                                        v134 = (void*)((unsigned short)v76 + 1);
                                        v73 = v3;
                                    }
                                    else
                                    {
                                        v35 = v10;
                                        ptr2->field_0 = v35;
                                        ptr2->field_10 = v11;
                                        v142 = v74 + (unsigned int)v75 * 24;
                                        v142[0x22] = v72;
                                        v142[35] = v71;
                                        v142[36] = v70;
                                    }
                                    *(void* *)((char *)v74 + 0x8 * v136 + 544) = v73;
                                    *(unsigned short *)&v74[538] = (unsigned short)v134;
                                    if (v76 + 2 > v136)
                                    {
                                        iter = v74 + v75 * 8 + 552;
                                        k = v76 - v75 + 1;
                                        do
                                        {
                                            v145 = k;
                                            v146 = &*iter->field_0;
                                            iter += 1;
                                            *(unsigned short *)&v146[67] = (unsigned short)v136;
                                            v136 += 1;
                                            *v146 = v74;
                                            k = v145 - 1;
                                        } while (k);
                                    }
                                }
                                v1 = v70;
                                v2 = v72;
                                v0 = v69 + 1;
                                v77 = v75 & 0xffff;
                                if ((unsigned int)v75 == 6)
                                {
                                    v78 = 5;
                                    v79 = arm64g_calculate_condition(3, v77, 6, 0);
                                    if (!(v79 & 1))
                                        goto LABEL_bcee9e;
                                    goto LABEL_bcee9d;
                                }
                                else
                                {
                                    v78 = 6;
                                    v80 = arm64g_calculate_condition(3, v77, 6, 0);
                                    if (v80 & 1)
                                    {
LABEL_bcee9d:
                                        v81 = 0;
                                        v82 = arm64g_calculate_condition(19, v77, 6, 0);
                                        if (!(v82 & 1))
                                            goto LABEL_bceea6;
                                        goto LABEL_bceea5;
                                    }
                                    else
                                    {
LABEL_bcee9e:
                                        v81 = v75 - 7;
                                        v83 = arm64g_calculate_condition(19, v77, 6, 0);
                                        if (v83 & 1)
                                        {
LABEL_bceea5:
                                            goto LABEL_bceea8;
                                        }
                                        else
                                        {
LABEL_bceea6:
LABEL_bceea8:
                                            v84 = v75 & 0xffff;
                                            if ((unsigned int)v75 == 5)
                                            {
                                                v85 = v75;
                                                v86 = arm64g_calculate_condition(3, v84, 5, 0);
                                                if (!(v86 & 1))
                                                    goto LABEL_bceeb2;
                                                goto LABEL_bceeb1;
                                            }
                                            else
                                            {
                                                v85 = v78;
                                                v87 = arm64g_calculate_condition(3, v84, 5, 0);
                                                if (v87 & 1)
                                                {
LABEL_bceeb1:
                                                    v88 = v75;
                                                    v89 = arm64g_calculate_condition(3, v84, 5, 0);
                                                    if (!(v89 & 1))
                                                        goto LABEL_bceeb6;
                                                    goto LABEL_bceeb5;
                                                }
                                                else
                                                {
LABEL_bceeb2:
                                                    v88 = v81;
                                                    v90 = arm64g_calculate_condition(3, v84, 5, 0);
                                                    if (v90 & 1)
                                                    {
LABEL_bceeb5:
                                                        v91 = (void*)0;
                                                        v92 = arm64g_calculate_condition(0x33, v84, 5, 0);
                                                        if (!(v92 & 1))
                                                            goto LABEL_bceebe;
                                                        goto LABEL_bceebd;
                                                    }
                                                    else
                                                    {
LABEL_bceeb6:
                                                        v91 = (void*)1;
                                                        v93 = arm64g_calculate_condition(0x33, v84, 5, 0);
                                                        if (v93 & 1)
                                                        {
LABEL_bceebd:
                                                            v94 = 4;
                                                            v95 = arm64g_calculate_condition(0x33, v84, 5, 0);
                                                            if (!(v95 & 1))
                                                                goto LABEL_bceec2;
                                                            goto LABEL_bceec1;
                                                        }
                                                        else
                                                        {
LABEL_bceebe:
                                                            v94 = v85;
                                                            v96 = arm64g_calculate_condition(0x33, v84, 5, 0);
                                                            if (v96 & 1)
                                                            {
LABEL_bceec1:
                                                                v97 = v75;
                                                                v98 = arm64g_calculate_condition(0x33, v84, 5, 0);
                                                                if (!(v98 & 1))
                                                                    goto LABEL_bceec6;
                                                                goto LABEL_bceec5;
                                                            }
                                                            else
                                                            {
LABEL_bceec2:
                                                                v97 = v88;
                                                                v99 = arm64g_calculate_condition(0x33, v84, 5, 0);
                                                                if (v99 & 1)
                                                                {
LABEL_bceec5:
                                                                    v100 = (void*)0;
                                                                    continue;
                                                                }
                                                                else
                                                                {
LABEL_bceec6:
                                                                    v100 = v91;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                v101 = _malloc();
                                if (!v101)
                                {
                                    sub_c6ba70(8, 640);
                                    __debugbreak();
                                }
                                v48 = v101;
                                *(unsigned long long *)v101 = 0;
                                *(unsigned short *)&v101[538] = 0;
                                v102 = (short)v74[538] + ~v94;
                                *(unsigned short *)&v101[538] = (unsigned short)v102;
                                v103 = v74 + 8;
                                v104 = v94 * 24;
                                v105 = v103 + v104;
                                v18 = v105->field_0;
                                v19 = v105->field_10;
                                v106 = v74 + 272;
                                v107 = v106 + v104;
                                v6 = v107[1];
                                if (12 <= v102)
                                {
                                    sub_c73bb0(0);
                                    __debugbreak();
                                }
                                v7 = *v107;
                                v5 = v107[2];
                                v108 = (unsigned int)v94 * 24 + 24;
                                v109 = v102 * 24;
                                _memcpy(v48 + 8, v103 + v108, v109);
                                _memcpy(v48 + 272, v106 + v108, v109);
                                *(unsigned short *)&v74[538] = (unsigned short)v94;
                                v16 = v18;
                                v17 = v19;
                                v110 = (short)v48[538];
                                v111 = v110 + 1;
                                if (12 <= v110)
                                {
                                    sub_c73bb0(0);
                                    __debugbreak();
                                }
                                if (v76 - v94 != v111)
                                {
                                    sub_c73c80("assertion failed: src.len() == dst.len()assertion failed: idx < CAPACITY", 40, &g_ef8cf8);
                                    __debugbreak();
                                }
                                _memcpy(v48 + 544, v74 + v94 * 8 + 552, v111 * 8);
                                v112 = 0;
                                do
                                {
                                    v113 = *(long long *)((char *)v48 + 0x8 * v112 + 544);
                                    *(void* *)v113 = v48;
                                    *(unsigned short *)(v113 + 536) = (unsigned short)v112;
                                    v114 = v112;
                                    v115 = v110;
                                    if (v110 <= v112)
                                    {
                                        v116 = v112;
                                        v117 = arm64g_calculate_condition(36, v114, v115, 0);
                                        if (v117 & 1)
                                            break;
                                    }
                                    else
                                    {
                                        v116 = v112 + 1;
                                        v118 = arm64g_calculate_condition(36, v114, v115, 0);
                                        if (v118 & 1)
                                            break;
                                    }
                                } while ((v112 = v116, v116 <= v110));
                                v14 = v16;
                                v15 = v17;
                                if (v100)
                                    v119 = v48;
                                else
                                    v119 = v74;
                                v120 = (short)v119[538];
                                v121 = v119 + 8;
                                v122 = v97 + 1;
                                ptr = v121 + (unsigned int)v97 * 24;
                                v124 = v120 - v97;
                                if (v120 > v97)
                                {
                                    v125 = v122 * 24;
                                    n = v124 * 24;
                                    _memmove(v121 + v125, ptr, n);
                                    ptr->field_0 = v10;
                                    ptr->field_10 = v11;
                                    v127 = v119 + 272;
                                    ptr1 = v127 + (unsigned int)v97 * 24;
                                    v122 = v97 + 1;
                                    _memmove(v127 + v125, ptr1, n);
                                    *ptr1 = v2;
                                    ptr1[1] = v4;
                                    ptr1[2] = v1;
                                    _memmove(v119 + 544 + v97 * 8 + 16, v119 + 544 + v122 * 8, v124 * 8);
                                }
                                else
                                {
                                    ptr->field_0 = v10;
                                    ptr->field_10 = v11;
                                    v129 = v119 + (unsigned int)v97 * 24;
                                    *(unsigned long long *)&v129[272] = v2;
                                    *(unsigned long *)&v129[280] = v4;
                                    *(unsigned long *)&v129[288] = v1;
                                }
                                v66 = v7;
                                *(void* *)((char *)v119 + 0x8 * v122 + 544) = v3;
                                *(unsigned short *)&v119[538] = (unsigned short)v120 + 1;
                                if (v120 + 2 > v122)
                                {
                                    v130 = v97 + 69;
                                    do
                                    {
                                        v131 = *(long long *)((char *)v119 + 0x8 * v130);
                                        *(void* *)v131 = v119;
                                        *(unsigned short *)&v131[536] = (unsigned int)v130 - 0x44;
                                        v130 += 1;
                                    } while (-v120 + v130 != 70);
                                }
                                v12 = v14;
                                v13 = v15;
                                if (v66 == 0x8000000000000000)
                                {
                                    a1->field_10 = a1->field_10 + 1;
                                    *(unsigned long *)v22 = 0x8000000000000000;
                                    return *(unsigned long long *)&v14;
                                }
                                v10 = v12;
                                v11 = v13;
                                v132 = v5;
                                v133 = v6;
                                v71 = v133;
                                i = *(long long *)v74;
                                v70 = v132;
                                v72 = v66;
                                v23 = v74;
                                v73 = v48;
                                v69 = v0;
                            } while (i);
                        }
                        else
                        {
                            v69 = 0;
                            v132 = v5;
                            v133 = v6;
                        }
                        v148 = a1->field_0;
                        if (v148)
                        {
                            v149 = a1->field_8;
                            v150 = _malloc(640);
                            if (v150)
                            {
                                v151 = v150;
                                *(unsigned long long *)v150 = 0;
                                *(unsigned short *)&v150[538] = 0;
                                *(void* *)&v150[544] = v148;
                                v152 = arm64g_calculate_condition(0x22, v149, 1, 0);
                                if (!(v152 & 1))
                                {
                                    *(void* *)v148 = v151;
                                    *(unsigned short *)&v148[536] = 0;
                                    v153 = a1;
                                    v153->field_0 = v151;
                                    v153->field_8 = v149 + 1;
                                    if (v69 == v149)
                                    {
                                        *(unsigned short *)&v151[538] = 1;
                                        v35 = v10;
                                        *(uint128_t *)&v151[8] = v35;
                                        *(unsigned long *)&v151[24] = v11;
                                        *(unsigned long long *)&v151[272] = v66;
                                        *(unsigned long *)&v151[280] = v133;
                                        *(unsigned long *)&v151[288] = v132;
                                        *(void* *)&v151[552] = v48;
                                        *(void* *)v48 = v151;
                                        *(unsigned short *)&v48[536] = 1;
                                        a1->field_10 = a1->field_10 + 1;
                                        *(unsigned long *)v22 = 0x8000000000000000;
                                        return *(unsigned long long *)&v35;
                                    }
                                    sub_c73c80("assertion failed: edge.height == self.height - 1Hash table capacity overflow", 48, &g_ef8e00);
                                }
                                else
                                {
                                    sub_c73c64(&g_ef8c68);
                                }
                            }
                            else
                            {
                                sub_c6ba70(8, 640);
                            }
                        }
                        else
                        {
                            sub_c73c64(&g_ef8d10);
                        }
                    }
                    else
                    {
                        sub_c73bb0(0);
                    }
                }
                else
                {
                    sub_c6ba70(8, 544);
                }
            }
            else
            {
                v154 = _malloc(544);
                if (v154)
                {
                    *(unsigned long long *)v154 = 0;
                    v67 = a1;
                    v67->field_0 = v154;
                    v67->field_8 = 0;
                    *(unsigned short *)&v154[538] = 1;
                    *(int128_t *)&v154[8] = *(int128_t *)a2;
                    *(char *)&v154[24] = v32;
                    *(unsigned int *)&v154[25] = *(unsigned int *)&v8;
                    *(unsigned int *)&v154[28] = *(unsigned int *)((void*)&v8 + 3);
                    v35 = a3->field_0;
                    *(uint128_t *)&v154[272] = v35;
                    *(unsigned long long *)&v154[288] = a3->field_10;
                    v67->field_10 = v67->field_10 + 1;
                    *(unsigned long *)v22 = 0x8000000000000000;
                    return *(unsigned long long *)&v35;
                }
                sub_c6ba70(8, 544);
            }
            __debugbreak();
        }
    }
    v33 = v23 + 24 * node;
    v34 = v33->field_110;
    *(unsigned long long *)&v22[16] = v33->field_120;
    *(uint128_t *)v22 = v34;
    v35 = a3->field_0;
    v33->field_120 = a3->field_10;
    v33->field_110 = v35;
    return *(unsigned long long *)&v35;
}
