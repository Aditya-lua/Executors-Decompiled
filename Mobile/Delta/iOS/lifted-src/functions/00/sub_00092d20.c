/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x92d20..0x93364 (1604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_92d20_1 {
    unsigned long long field_0;
    unsigned long long field_4;
} st_92d20_1;

typedef struct st_92d20_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[12];
    unsigned int field_28;
    char padding_2c[212];
    unsigned int field_100;
    char padding_104[12];
    void* field_110;
    char padding_118[20];
    unsigned int field_12c;
} st_92d20_2;

typedef struct st_92d20_4 {
    unsigned long long field_0;
    struct st_92d20_3 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[44];
    unsigned int field_4c;
} st_92d20_4;

typedef struct st_92d20_3 {
    char padding_0[6];
    unsigned short field_6;
} st_92d20_3;

typedef struct st_92d20_0 {
    char field_0;
} st_92d20_0;


void* sub_92d20(st_92d20_2 *a0, st_92d20_4 *a1, st_92d20_1 *a2, void* node, unsigned long a4)
{
    unsigned long long v28;  // x28
    unsigned long long v29;  // x27
    unsigned long long v38;  // x30
    unsigned long long v128;  // 4112
    unsigned long long v129;  // 4108
    unsigned long long v130;  // 4112
    unsigned long long v131;  // 4108
    void* v39;  // x24
    void* v40;  // x26
    void* v41;  // x19
    unsigned long v42;  // x9
    unsigned long long v43;  // x12
    void* v44;  // w10
    unsigned long long v45;  // w14
    unsigned long long v46;  // w15
    unsigned long v47;  // cc_dep1
    unsigned long long v30;  // x26
    unsigned long v48;  // cc_dep2
    unsigned int v49;  // w8
    unsigned int v50;  // w10
    unsigned long long v51;  // 4112
    unsigned long long v52;  // 4108
    unsigned long long v53;  // 4112
    unsigned long long v54;  // 4108
    unsigned int v55;  // w9
    unsigned long long v56;  // x28
    unsigned long long v57;  // x20
    unsigned long long v31;  // x25
    st_92d20_2 *v58;  // x27
    void* v59;  // x21
    void* v60;  // x19
    void* v61;  // x19
    unsigned long long v62;  // x9
    void* v63;  // w8
    unsigned long long v64;  // x0
    void* v65;  // x27
    void* v66;  // x8
    void* i;  // x19
    unsigned long long v32;  // x24
    unsigned long v68;  // cc_dep1
    unsigned long v69;  // cc_dep2
    void* j;  // x26
    unsigned long long v71;  // 4105
    unsigned long long v72;  // 4105
    unsigned long long v73;  // x19
    void* v74;  // x0
    unsigned long long v75;  // 4106
    void* v76;  // x8
    unsigned int v77;  // w9
    unsigned long long v33;  // x23
    unsigned int v78;  // w9
    unsigned int v79;  // w10
    unsigned long v80;  // cc_dep1
    unsigned long v81;  // cc_dep2
    void* v82;  // x22
    unsigned long long v83;  // 4106
    unsigned long long v84;  // 4106
    unsigned long long v85;  // x23
    unsigned long long v86;  // 4106
    unsigned long long v87;  // 4106
    unsigned long long v34;  // x22
    void* v88;  // x21
    void* v89;  // w8
    unsigned int v90;  // w8
    unsigned int v91;  // w9
    st_92d20_4 *v92;  // x21
    void* v93;  // x3
    unsigned long long v94;  // x9
    void* v95;  // x8
    void* v96;  // x26
    void* v97;  // x8
    unsigned long long v35;  // x21
    unsigned long long v98;  // x23
    unsigned long long v99;  // x22
    void* v100;  // x20
    uint128_t *v101;  // x9
    uint128_t *iter;  // x9
    uint128_t *v103;  // x10
    uint128_t *v104;  // x10
    st_92d20_3 *v105;  // x8
    unsigned long long v106;  // x9
    void* v107;  // x9
    unsigned long long v36;  // x20
    unsigned long long v108;  // x10
    unsigned long long v109;  // x8
    void* v110;  // x24
    st_92d20_3 *v111;  // x8
    void* v112;  // x9
    unsigned long v113;  // cc_dep1
    unsigned long long v114;  // x10
    unsigned long v115;  // 4112
    unsigned long v116;  // cc_op
    unsigned long v117;  // cc_dep1
    unsigned long long v37;  // x19
    unsigned long v118;  // 4112
    unsigned long long v119;  // 4114
    unsigned long long v120;  // w9
    unsigned long long v121;  // w10
    unsigned long long v122;  // w11
    unsigned long long v123;  // w8
    unsigned long v124;  // cc_dep1
    unsigned long long v125;  // w8
    unsigned long long v126;  // 4112
    unsigned long long v127;  // 4112
    unsigned long long v0;  // [bp-0xdc]
    unsigned long long v1;  // [bp-0xd8]
    unsigned long long v2;  // [bp-0xd4]
    unsigned long long v3;  // [bp-0xc8]
    unsigned long long v4;  // [bp-0xb8]
    void* v5;  // [bp-0xac]
    void* v6;  // [bp-0xa8]
    void* v7;  // [bp-0xa0]
    st_92d20_2 *v8;  // [bp-0x98]
    void* v9;  // [bp-0x90]
    st_92d20_0 **v10;  // [bp-0x88], Other Possible Types: char
    st_92d20_0 *v11;  // [bp-0x80]
    unsigned long long v12;  // [bp-0x78]
    st_92d20_0 **v13;  // [bp-0x70]
    st_92d20_0 *v14;  // [bp-0x68]
    unsigned long long v15;  // [bp-0x60]
    unsigned long long v16;  // [bp-0x58]
    unsigned long long v17;  // [bp-0x50]
    unsigned long long v18;  // [bp-0x48]
    unsigned long long v19;  // [bp-0x40]
    unsigned long long v20;  // [bp-0x38]
    unsigned long long v21;  // [bp-0x30]
    unsigned long long v22;  // [bp-0x28]
    unsigned long long v23;  // [bp-0x20]
    unsigned long long v24;  // [bp-0x18]
    char *v25;  // [bp-0x10]
    unsigned long long v26;  // [bp-0x8]
    char v27;  // [bp+0x0]

    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = v32;
    v20 = v33;
    v21 = v34;
    v22 = v35;
    v23 = v36;
    v24 = v37;
    v25 = &v27;
    v26 = v38;
    v39 = node;
    v11 = &v10;
    v10 = &v11;
    v40 = node + a4;
    v41 = v40 - 8;
    v42 = a0->field_18;
    v43 = a0->field_8 + v42;
    v44 = (void*)(int)a0->field_110;
    if ((unsigned int)(int)a0->field_110 >= 6)
        v44 = (void*)6;
    if (4 >= v44)
        v44 = (void*)4;
    v5 = v44;
    v45 = (int)a2->field_0;
    v46 = *(int *)((char *)&a2->field_0 + 4);
    v3 = v43;
    v47 = v39 & 0xffffffff;
    v48 = v43 & 0xffffffff;
    if ((unsigned int)v39 == (unsigned int)v43)
        node += 1;
    v49 = (unsigned int)(node - a0->field_8);
    v50 = 1 << ((char)a0->field_100 & 31);
    if (v50 < (unsigned int)(v49 - v42))
    {
        v51 = arm64g_calculate_condition(131, v47, v48, 0);
        v52 = arm64g_calculate_condition(3, (v51 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v52 & 1))
            goto LABEL_92dbe;
LABEL_92dbd:
        v55 = v49 - v50;
    }
    else
    {
        v53 = arm64g_calculate_condition(131, v47, v48, 0);
        v54 = arm64g_calculate_condition(0, (v53 & 1 ? a0->field_28 : 0), 0, 0);
        if (v54 & 1)
            goto LABEL_92dbd;
LABEL_92dbe:
        v55 = v42;
    }
    v0 = v49 - v55;
    v1 = v46;
    if (v0 < v46)
        v56 = 0;
    else
        v56 = v46;
    v2 = v45;
    if (v0 < v45)
        v57 = 0;
    else
        v57 = v45;
    a0->field_12c = 0;
    if (v41 > node)
    {
        v58 = a0;
        v8 = a0;
        v9 = v40 - 32;
        v6 = v41;
        v7 = v40;
        do
        {
            v59 = 0;
            v60 = node;
            v61 = v60 + 1;
            v62 = v57 & 0xffffffff;
            v4 = -v62;
            if ((unsigned int)v57 && *(int *)((char *)v61 - v62) == (int)v60[1])
                v59 = sub_7cdfc(node + 5, node + 5 + v4, v40) + 4;
            v12 = 0x3b9ac9ff;
            v14 = &v13;
            v13 = &v14;
            v63 = v5;
            if (v63 != 6)
            {
                if (v63 == 5)
                {
                    v64 = sub_a676c();
                    if (v59 < v64)
                        v65 = v64;
                    else
                        v65 = v59;
                    if (v65 >= 4)
                        goto LABEL_92ef0;
                    goto LABEL_92e00;
                }
                v64 = sub_afae4();
                if (v59 < v64)
                    v65 = v64;
                else
                    v65 = v59;
                if (v65 < 4)
                    goto LABEL_92e00;
LABEL_92ef0:
                v68 = v64;
                v69 = v59;
                if (v59 < v64)
                {
                    j = node;
                    v71 = arm64g_calculate_condition(132, v68, v69, 0);
                    if (!(v71 & 1))
                        goto LABEL_92efe;
                    goto LABEL_92efd;
                }
                else
                {
                    j = v61;
                    v72 = arm64g_calculate_condition(132, v68, v69, 0);
                    if (v72 & 1)
                    {
LABEL_92efd:
                        v73 = v12;
                        goto LABEL_92f00;
                    }
                    else
                    {
LABEL_92efe:
                        v73 = 1;
LABEL_92f00:
                        if (v6 > node)
                        {
                            do
                            {
                                if (v73)
                                {
                                    if (!(unsigned int)v57 || (int)node[1] != *(int *)((char *)node + v4 + 1) || (v74 = sub_7cdfc(node + 5, node + 5 + v4, v7), v75 = arm64g_calculate_condition(130, v74, 5, 0), v75 & 1))
                                    {
                                        v82 = v65;
                                        v85 = v73;
                                        goto LABEL_92f88;
                                    }
                                    v76 = v74 + 4;
                                    if (!((v73 & 0xffffffff) * 0x100000000))
                                        v77 = 32;
                                    else
                                        v77 = Clz((v73 & 0xffffffff) * 0x100000000);
                                    v78 = (unsigned int)v65 * 3 + v77 - 30;
                                    v79 = (unsigned int)v76 * 3;
                                    v80 = v79;
                                    v81 = v78;
                                    if ((int)v79 <= (int)v78)
                                    {
                                        v82 = v65;
                                        v83 = arm64g_calculate_condition(211, v80, v81, 0);
                                        if (!(v83 & 1))
                                            goto LABEL_92f6a;
                                    }
                                    else
                                    {
                                        v82 = v76;
                                        v84 = arm64g_calculate_condition(211, v80, v81, 0);
                                        if (!(v84 & 1))
                                        {
LABEL_92f6a:
                                            v85 = 1;
                                            v87 = arm64g_calculate_condition(211, v80, v81, 0);
                                            if (!(v87 & 1))
                                            {
LABEL_92f6e:
                                                v88 = node + 1;
LABEL_92f70:
                                                continue;
                                            }
LABEL_92f6d:
                                            v88 = j;
                                            goto LABEL_92f70;
                                        }
                                    }
                                    v85 = v73;
                                    v86 = arm64g_calculate_condition(211, v80, v81, 0);
                                    if (!(v86 & 1))
                                        goto LABEL_92f6e;
                                    goto LABEL_92f6d;
                                }
                                else
                                {
                                    v85 = 0;
                                    v82 = v65;
LABEL_92f88:
                                    v88 = j;
                                }
                                j = node + 1;
                                v12 = 0x3b9ac9ff;
                                v14 = &v13;
                                v13 = &v14;
                                v89 = v5;
                                if (v89 == 6)
                                {
                                    v65 = sub_b0a30(v8, j, v7, &v12);
                                    if (4 > v65)
                                        goto LABEL_930c0;
                                }
                                else if (v89 == 5)
                                {
                                    v65 = sub_a676c();
                                    if (4 > v65)
                                        goto LABEL_930c0;
                                }
                                else
                                {
                                    v65 = sub_afae4();
                                    if (v65 < 4)
                                        goto LABEL_930c0;
                                }
                                v73 = v12;
                                if (!((v85 & 0xffffffff) * 0x100000000))
                                    v90 = 32;
                                else
                                    v90 = Clz((v85 & 0xffffffff) * 0x100000000);
                                if (!((v73 & 0xffffffff) * 0x100000000))
                                    v91 = 32;
                                else
                                    v91 = Clz((v73 & 0xffffffff) * 0x100000000);
                                if ((int)(v91 + (unsigned int)v65 * 4 - 31) <= (int)(v90 + (unsigned int)v82 * 4 - 27))
                                {
LABEL_930c0:
                                    v65 = v82;
                                    v73 = v85;
                                    j = v88;
                                    v92 = a1;
                                    v93 = v9;
                                    if (3 >= v85)
                                        goto LABEL_930dc;
                                    goto LABEL_93054;
                                }
                                node = j;
                            } while (j < v6);
                        }
                        v92 = a1;
                        v93 = v9;
                        if (v73 > 3)
                        {
LABEL_93054:
                            if (j > v39 && j - v73 + 3 > v3)
                            {
                                v94 = 2 - v73;
                                v95 = j;
                                do
                                {
                                    v96 = j;
                                    v97 = v95 - 1;
                                    if (*((char *)v95 - 1) != *((char *)j + v94))
                                        goto LABEL_930ac;
                                } while ((v65 += 1, v97 > v39 && (j = v97, v95 = v97, v3 < v96 + v94)));
                            }
                            else
                            {
LABEL_930ac:
                                v97 = j;
                            }
                            v98 = (unsigned int)v73 - 3;
                            j = v97;
                            v93 = v9;
                        }
                        else
                        {
LABEL_930dc:
                            v98 = v57;
                            v57 = v56;
                        }
                        v99 = v57;
                        v100 = j - v39;
                        v14 = &v13;
                        v13 = &v14;
                        if (j > v93)
                        {
                            sub_82208(v92->field_18, v39, j);
                            goto LABEL_93114;
                        }
                        else
                        {
                            *v92->field_18 = *(int128_t *)v39;
                            v101 = v92->field_18;
                            if (v100 > 16)
                            {
                                v101[1] = (int128_t)v39[16];
                                if (v100 >= 33)
                                {
                                    iter = v101 + 2;
                                    v103 = v39 + 48;
                                    do
                                    {
                                        *iter = *(int128_t *)((char *)v103 - 16);
                                        v104 = v103 + 2;
                                        iter[1] = *v103;
                                        iter += 2;
                                        v103 = v104;
                                    } while (iter < v101 + v100);
                                }
LABEL_93114:
                                v92->field_18 = v92->field_18 + v100;
                                v105 = v92->field_8;
                                if (v100 >= 0x10000)
                                {
                                    v106 = &v105->padding_0[-1 * v92->field_0];
                                    *(unsigned int *)&v92->padding_20[40] = 1;
                                    v92->field_4c = v106 >> 3;
                                    goto LABEL_931a0;
                                }
                            }
                            else
                            {
                                v92->field_18 = v101 + v100;
                                v105 = v92->field_8;
LABEL_931a0:
                                *(unsigned short *)&v105->padding_0[4] = (unsigned short)v100;
                                *(unsigned int *)&v105->padding_0[0] = v73;
                                v107 = v65 - 3;
                                if (0x10000 <= v107)
                                {
                                    v108 = &v105->padding_0[-1 * v92->field_0];
                                    *(unsigned int *)&v92->padding_20[40] = 2;
                                    v92->field_4c = v108 >> 3;
                                }
                                v105->field_6 = (unsigned short)v107;
                                v92->field_8 = &v105[1];
                                i = v6;
                                if (v8->field_12c)
                                    v8->field_12c = 0;
                                node = j + v65;
                                if (i >= node)
                                {
                                    v40 = v7;
                                    if ((unsigned int)v99)
                                    {
                                        do
                                        {
                                            v56 = v98;
                                            v98 = v99;
                                            v109 = v99 & 0xffffffff;
                                            if (*(int *)node != *(int *)((char *)node - v109))
                                            {
                                                v39 = node;
                                                v57 = v56;
                                                v56 = v98;
                                                v58 = v8;
                                                break;
                                            }
                                            v110 = sub_7cdfc(node + 4, node + 4 + -v109, v40);
                                            v14 = &v13;
                                            v13 = &v14;
                                            if (node > v9)
                                                sub_82208(v92->field_18, node, node, v9);
                                            else
                                                *v92->field_18 = *(int128_t *)node;
                                            v111 = v92->field_8;
                                            *(unsigned short *)&v111->padding_0[4] = 0;
                                            *(unsigned int *)&v111->padding_0[0] = 1;
                                            v112 = v110 + 1;
                                            v113 = v112;
                                            if (0x10000 <= v112)
                                            {
                                                v114 = &v111->padding_0[-1 * v92->field_0];
                                                *(unsigned int *)&v92->padding_20[40] = 2;
                                                v92->field_4c = v114 >> 3;
                                            }
                                            v111->field_6 = (unsigned short)v112;
                                            v92->field_8 = &v111[1];
                                            node += v110 + 4;
                                            if (node <= i)
                                            {
                                                v115 = arm64g_calculate_condition(148, v113, 0x10000, 0);
                                                v116 = 3;
                                                v117 = (v115 & 1 ? v56 & 0xffffffff : 0x40000000);
                                            }
                                            else
                                            {
                                                v118 = arm64g_calculate_condition(148, v113, 0x10000, 0);
                                                v116 = 0;
                                                v117 = (v118 & 1 ? v56 & 0xffffffff : 0x40000000);
                                            }
                                            v99 = v56;
                                            v39 = node;
                                            v57 = v98;
                                            v119 = arm64g_calculate_condition(v116 | 16, v117, 0, 0);
                                            v58 = v8;
                                        } while (v119 & 1);
                                    }
                                    else
                                    {
                                        v39 = node;
                                        v57 = v98;
                                        v56 = v99;
                                        v58 = v8;
                                    }
                                }
                                else
                                {
                                    v39 = node;
                                    v57 = v98;
                                    v56 = v99;
                                    v40 = v7;
                                    v58 = v8;
                                }
                            }
                        }
                    }
                }
            }
            else
            {
                v64 = sub_b0a30(v58, node, v40, &v12);
                if (v59 < v64)
                    v65 = v64;
                else
                    v65 = v59;
                if (4 <= v65)
                    goto LABEL_92ef0;
LABEL_92e00:
                v66 = node - v39;
                node = node + (v66 >> 8) + 1;
                v58 = v8;
                v58->field_12c = v66 > 0x7ff;
                i = v6;
                continue;
            }
        } while (i > node);
    }
    v120 = v1;
    v121 = v2;
    v122 = v0;
    if (v122 < v121)
        v123 = v121;
    else
        v123 = 0;
    if (v122 >= v120)
        v120 = 0;
    v124 = v57 & 0xffffffff;
    if ((unsigned int)v57)
    {
        v125 = (unsigned int)v57;
        v126 = arm64g_calculate_condition(19, v124, 0, 0);
        if (!(v126 & 1))
            goto LABEL_9332a;
LABEL_93329:
        v128 = arm64g_calculate_condition(19, v124, 0, 0);
        v129 = arm64g_calculate_condition(131, (v128 & 1 ? v121 : 0), (v128 & 1 ? v122 : 0), 0);
        if (!(v129 & 1))
            goto LABEL_9332e;
LABEL_9332d:
        v120 = v121;
    }
    else
    {
        v125 = v123;
        v127 = arm64g_calculate_condition(19, v124, 0, 0);
        if (v127 & 1)
            goto LABEL_93329;
LABEL_9332a:
        v130 = arm64g_calculate_condition(19, v124, 0, 0);
        v131 = arm64g_calculate_condition(128, (v130 & 1 ? v121 : 0), (v130 & 1 ? v122 : 0), 0);
        if (v131 & 1)
            goto LABEL_9332d;
LABEL_9332e:
    }
    if ((unsigned int)v56)
        v120 = (unsigned int)v56;
    *(unsigned int *)&a2->field_0 = v125;
    *(unsigned int *)((char *)&a2->field_0 + 4) = v120;
    return v40 - v39;
}
