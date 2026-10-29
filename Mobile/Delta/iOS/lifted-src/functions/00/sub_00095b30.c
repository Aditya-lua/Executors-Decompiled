/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95b30..0x962c0 (1936 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95b30_4 {
    unsigned long long field_0;
    unsigned long long field_4;
} st_95b30_4;

typedef struct st_95b30_1 {
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
} st_95b30_1;

typedef struct st_95b30_3 {
    unsigned long long field_0;
    struct st_95b30_2 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[44];
    unsigned int field_4c;
} st_95b30_3;

typedef struct st_95b30_2 {
    char padding_0[6];
    unsigned short field_6;
} st_95b30_2;

typedef struct st_95b30_0 {
    char field_0;
} st_95b30_0;


void* sub_95b30(st_95b30_1 *a0, st_95b30_3 *a1, st_95b30_4 *a2, void* node, unsigned long a4)
{
    unsigned long long v28;  // x28
    unsigned long long v29;  // x27
    unsigned long long v38;  // x30
    unsigned long long v128;  // w9
    unsigned long v129;  // cc_dep1
    unsigned long long v130;  // w8
    unsigned long long v131;  // 4112
    unsigned long long v132;  // 4112
    unsigned long long v133;  // 4112
    unsigned long long v134;  // 4108
    unsigned long long v135;  // 4112
    unsigned long long v136;  // 4108
    void* v39;  // x24
    void* v40;  // x25
    void* v41;  // x16
    unsigned long v42;  // x9
    unsigned long long v43;  // x17
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
    unsigned long long v56;  // w10
    unsigned long long v57;  // x28
    unsigned long long v31;  // x25
    unsigned long long v58;  // x23
    st_95b30_1 *v59;  // x27
    void* v60;  // x20
    void* v61;  // x19
    void* v62;  // x19
    unsigned long long v63;  // x9
    unsigned long long v64;  // x22
    void* v65;  // w8
    unsigned long long v66;  // x0
    void* v67;  // x27
    unsigned long long v32;  // x24
    void* v68;  // x8
    unsigned long v69;  // cc_dep1
    unsigned long v70;  // cc_dep2
    void* v71;  // x22
    unsigned long long v72;  // 4105
    unsigned long long v73;  // 4105
    unsigned long long v74;  // x19
    void* v75;  // x27
    void* v76;  // x22
    unsigned long long v77;  // x19
    unsigned long long v33;  // x23
    void* v78;  // w8
    void* v79;  // x0
    unsigned long long v80;  // 4106
    void* v81;  // x8
    unsigned int v82;  // w9
    unsigned int v83;  // w9
    unsigned int v84;  // w10
    unsigned long v85;  // cc_dep1
    unsigned long v86;  // cc_dep2
    unsigned long long v87;  // 4106
    unsigned long long v34;  // x22
    unsigned long long v88;  // 4106
    unsigned long long v89;  // 4106
    unsigned long long v90;  // 4106
    unsigned int v91;  // w8
    unsigned int v92;  // w9
    void* v93;  // x0
    unsigned long long v94;  // 4106
    void* v95;  // x8
    unsigned int v96;  // w9
    void* v97;  // w8
    unsigned long long v35;  // x21
    unsigned int v98;  // w8
    unsigned int v99;  // w9
    unsigned long long v100;  // x9
    void* v101;  // x8
    void* v102;  // x25
    void* v103;  // x8
    unsigned long long v104;  // x19
    unsigned long long v105;  // x22
    void* v106;  // x23
    uint128_t *v107;  // x9
    unsigned long long v36;  // x20
    uint128_t *iter;  // x9
    uint128_t *v109;  // x10
    uint128_t *v110;  // x10
    st_95b30_2 *v111;  // x8
    void* v112;  // x9
    unsigned long long v113;  // x9
    void* v114;  // x20
    unsigned long long v115;  // x10
    unsigned long long v116;  // x8
    void* v117;  // x24
    unsigned long long v37;  // x19
    st_95b30_2 *v118;  // x8
    void* v119;  // x9
    unsigned long v120;  // cc_dep1
    unsigned long long v121;  // x10
    unsigned long v122;  // 4112
    unsigned long v123;  // cc_op
    unsigned long v124;  // cc_dep1
    unsigned long v125;  // 4112
    unsigned long long v126;  // 4114
    unsigned long long v127;  // w8
    unsigned long long v0;  // [bp-0xd4]
    unsigned long long v1;  // [bp-0xd0]
    unsigned long long v2;  // [bp-0xcc]
    unsigned long long v3;  // [bp-0xc0]
    void* v4;  // [bp-0xb8]
    unsigned long long v5;  // [bp-0xb0]
    st_95b30_1 *v6;  // [bp-0xa8]
    void* v7;  // [bp-0xa0]
    void* v8;  // [bp-0x94]
    void* i;  // [bp-0x90]
    st_95b30_0 **v10;  // [bp-0x88], Other Possible Types: char
    st_95b30_0 *v11;  // [bp-0x80]
    unsigned long long v12;  // [bp-0x78]
    st_95b30_0 **v13;  // [bp-0x70]
    st_95b30_0 *v14;  // [bp-0x68]
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
    v8 = v44;
    v45 = (int)a2->field_0;
    v46 = *(int *)((char *)&a2->field_0 + 4);
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
            goto LABEL_95bca;
LABEL_95bc9:
        v55 = v49 - v50;
    }
    else
    {
        v53 = arm64g_calculate_condition(131, v47, v48, 0);
        v54 = arm64g_calculate_condition(0, (v53 & 1 ? a0->field_28 : 0), 0, 0);
        if (v54 & 1)
            goto LABEL_95bc9;
LABEL_95bca:
        v55 = v42;
    }
    v56 = v49 - v55;
    if (v56 < v46)
        v57 = 0;
    else
        v57 = v46;
    if (v56 < v45)
        v58 = 0;
    else
        v58 = v45;
    *(unsigned int *)&a0[1].padding_10[4] = 0;
    i = v41;
    if (v41 > node)
    {
        v59 = a0;
        v0 = v56;
        v1 = v46;
        v3 = v43;
        v2 = v45;
        v6 = a0;
        v7 = v40;
        v4 = v40 - 32;
        do
        {
            v60 = 0;
            v61 = node;
            v62 = v61 + 1;
            v63 = v58 & 0xffffffff;
            v64 = -v63;
            if ((unsigned int)v58 && *(int *)((char *)v62 - v63) == (int)v61[1])
                v60 = sub_7cdfc(node + 5, node + 5 + v64, v40) + 4;
            v12 = 0x3b9ac9ff;
            v14 = &v13;
            v13 = &v14;
            v65 = v8;
            if (v65 != 6)
            {
                if (v65 == 5)
                {
                    v66 = sub_94510();
                    if (v60 < v66)
                        v67 = v66;
                    else
                        v67 = v60;
                    if (v67 >= 4)
                        goto LABEL_95cfc;
                    goto LABEL_95c14;
                }
                v66 = sub_b3550();
                if (v60 < v66)
                    v67 = v66;
                else
                    v67 = v60;
                if (v67 < 4)
                    goto LABEL_95c14;
LABEL_95cfc:
                v5 = v64;
                v69 = v66;
                v70 = v60;
                if (v60 < v66)
                {
                    v71 = node;
                    v72 = arm64g_calculate_condition(132, v69, v70, 0);
                    if (!(v72 & 1))
                        goto LABEL_95d0e;
                    goto LABEL_95d0d;
                }
                else
                {
                    v71 = v62;
                    v73 = arm64g_calculate_condition(132, v69, v70, 0);
                    if (v73 & 1)
                    {
LABEL_95d0d:
                        v74 = v12;
                        goto LABEL_95d10;
                    }
                    else
                    {
LABEL_95d0e:
                        v74 = 1;
LABEL_95d10:
                        v75 = v67;
                        v76 = v71;
                        v77 = v74;
                        if (node < i)
                        {
                            do
                            {
                                v71 = node + 1;
                                v78 = v8;
                                if (v77 && (v78 = v8, (unsigned int)v58))
                                {
                                    if (*(int *)v71 != *(int *)((char *)v71 + v5) || !(v79 = sub_7cdfc(node + 5, node + 5 + v5, v7), v80 = arm64g_calculate_condition(130, v79, 5, 0), !(v80 & 1)))
                                    {
LABEL_95e10:
                                        v78 = v8;
                                        goto LABEL_95e14;
                                    }
                                    v81 = v79 + 4;
                                    if (!((v77 & 0xffffffff) * 0x100000000))
                                        v82 = 32;
                                    else
                                        v82 = Clz((v77 & 0xffffffff) * 0x100000000);
                                    v83 = (unsigned int)v75 * 3 + v82 - 30;
                                    v84 = (unsigned int)v81 * 3;
                                    v85 = v84;
                                    v86 = v83;
                                    if ((int)v84 <= (int)v83)
                                    {
                                        v75 = v75;
                                        v87 = arm64g_calculate_condition(211, v85, v86, 0);
                                        if (!(v87 & 1))
                                            goto LABEL_95e0a;
                                    }
                                    else
                                    {
                                        v75 = v81;
                                        v88 = arm64g_calculate_condition(211, v85, v86, 0);
                                        if (!(v88 & 1))
                                        {
LABEL_95e0a:
                                            v77 = 1;
                                            v90 = arm64g_calculate_condition(211, v85, v86, 0);
                                            if (!(v90 & 1))
                                            {
LABEL_95e0e:
                                                v76 = node + 1;
                                                goto LABEL_95e10;
                                            }
LABEL_95e0d:
                                            goto LABEL_95e10;
                                        }
                                    }
                                    v89 = arm64g_calculate_condition(211, v85, v86, 0);
                                    if (!(v89 & 1))
                                        goto LABEL_95e0e;
                                    goto LABEL_95e0d;
                                }
                                else
                                {
LABEL_95e14:
                                    v12 = 0x3b9ac9ff;
                                    v14 = &v13;
                                    v13 = &v14;
                                    if (v78 == 6)
                                    {
                                        v67 = sub_93d24(v6, v71, v7);
                                        if (4 > v67)
                                            goto LABEL_95eac;
                                    }
                                    else if (v78 == 5)
                                    {
                                        v67 = sub_94510(v6, v71, v7);
                                        if (4 > v67)
                                            goto LABEL_95eac;
                                    }
                                    else
                                    {
                                        v67 = sub_b3550(v6, v71, v7);
                                        if (v67 < 4)
                                            goto LABEL_95eac;
                                    }
                                    v74 = v12;
                                    if (!((v77 & 0xffffffff) * 0x100000000))
                                        v91 = 32;
                                    else
                                        v91 = Clz((v77 & 0xffffffff) * 0x100000000);
                                    if (!((v74 & 0xffffffff) * 0x100000000))
                                        v92 = 32;
                                    else
                                        v92 = Clz((v74 & 0xffffffff) * 0x100000000);
                                    if ((int)(v91 + (unsigned int)v75 * 4 - 27) < (int)(v92 + (unsigned int)v67 * 4 - 31))
                                        continue;
LABEL_95eac:
                                    if (i > v71)
                                    {
                                        v71 = node + 2;
                                        if (v77 && (unsigned int)v58 && *(int *)v71 == *(int *)((char *)v71 + v5))
                                        {
                                            v93 = sub_7cdfc(node + 6, node + 6 + v5, v7);
                                            v94 = arm64g_calculate_condition(130, v93, 5, 0);
                                            if (!(v94 & 1))
                                            {
                                                v95 = v93 + 4;
                                                if (!((v77 & 0xffffffff) * 0x100000000))
                                                    v96 = 32;
                                                else
                                                    v96 = Clz((v77 & 0xffffffff) * 0x100000000);
                                                if ((int)((unsigned int)v95 * 4) > (int)(v96 + (unsigned int)v75 * 4 - 30))
                                                {
                                                    v75 = v95;
                                                    v77 = 1;
                                                    v76 = v71;
                                                }
                                            }
                                        }
                                        v12 = 0x3b9ac9ff;
                                        v14 = &v13;
                                        v13 = &v14;
                                        v97 = v8;
                                        if (v97 == 6)
                                        {
                                            v67 = sub_93d24(v6, v71, v7);
                                            if (4 > v67)
                                                goto LABEL_95fb0;
                                        }
                                        else if (v97 == 5)
                                        {
                                            v67 = sub_94510(v6, v71, v7);
                                            if (4 > v67)
                                                goto LABEL_95fb0;
                                        }
                                        else
                                        {
                                            v67 = sub_b3550(v6, v71, v7);
                                            if (v67 < 4)
                                                goto LABEL_95fb0;
                                        }
                                        v74 = v12;
                                        if (!((v77 & 0xffffffff) * 0x100000000))
                                            v98 = 32;
                                        else
                                            v98 = Clz((v77 & 0xffffffff) * 0x100000000);
                                        if (!((v74 & 0xffffffff) * 0x100000000))
                                            v99 = 32;
                                        else
                                            v99 = Clz((v74 & 0xffffffff) * 0x100000000);
                                        if ((int)(v98 + (unsigned int)v75 * 4 - 24) >= (int)(v99 + (unsigned int)v67 * 4 - 31))
                                            goto LABEL_95fb0;
                                    }
                                    else
                                    {
LABEL_95fb0:
                                        v67 = v75;
                                        v74 = v77;
                                        v71 = v76;
                                        if (3 >= v77)
                                            goto LABEL_95fc4;
                                        goto LABEL_95d30;
                                    }
                                }
                                v76 = v71;
                                v77 = v74;
                                v75 = v67;
                                node = v71;
                            } while (i > v71);
                        }
                        if (v74 > 3)
                        {
LABEL_95d30:
                            if (v71 > v39 && v71 - v74 + 3 > v3)
                            {
                                v100 = 2 - v74;
                                v101 = v71;
                                do
                                {
                                    v102 = v71;
                                    v103 = v101 - 1;
                                    if (*((char *)v101 - 1) != *((char *)v102 + v100))
                                    {
                                        v103 = v102;
                                        v59 = v6;
                                        break;
                                    }
                                } while ((v67 += 1, v59 = v6, v103 > v39 && (v71 = v103, v101 = v103, v59 = v6, v3 < v102 + v100)));
                            }
                            else
                            {
                                v103 = v71;
                                v59 = v6;
                            }
                            v104 = (unsigned int)v74 - 3;
                            v71 = v103;
                        }
                        else
                        {
LABEL_95fc4:
                            v104 = v58;
                            v58 = v57;
                            v59 = v6;
                        }
                        v105 = v58;
                        v106 = v71 - v39;
                        v14 = &v13;
                        v13 = &v14;
                        if (v71 > v4)
                        {
                            sub_82208(a1->field_18, v39, v71);
                        }
                        else
                        {
                            *a1->field_18 = *(int128_t *)v39;
                            v107 = a1->field_18;
                            if (v106 > 16)
                            {
                                v107[1] = (int128_t)v39[16];
                                if (v106 >= 33)
                                {
                                    iter = v107 + 2;
                                    v109 = v39 + 48;
                                    do
                                    {
                                        *iter = *(int128_t *)((char *)v109 - 16);
                                        v110 = v109 + 2;
                                        iter[1] = *v109;
                                        iter += 2;
                                        v109 = v110;
                                    } while (iter < v107 + v106);
                                }
                            }
                            else
                            {
                                a1->field_18 = v107 + v106;
                                v111 = a1->field_8;
                                *(unsigned short *)&v111->padding_0[4] = (unsigned short)v106;
                                *(unsigned int *)&v111->padding_0[0] = v74;
                                v112 = v67 - 3;
                                if (v112 >= 0x10000)
                                    goto LABEL_96208;
LABEL_96058:
                                v111->field_6 = (unsigned short)v112;
                                a1->field_8 = &v111[1];
                                v114 = v4;
                                if (!*(int *)&v59[1].padding_10[4])
                                    goto LABEL_96074;
                                goto LABEL_96070;
                            }
                        }
                        a1->field_18 = a1->field_18 + v106;
                        v111 = a1->field_8;
                        if (0x10000 > v106)
                        {
                            *(unsigned short *)&v111->padding_0[4] = (unsigned short)v106;
                            *(unsigned int *)&v111->padding_0[0] = v74;
                            v112 = v67 - 3;
                            if (0x10000 <= v112)
                                goto LABEL_96208;
                            goto LABEL_96058;
                        }
                        v113 = &v111->padding_0[-1 * a1->field_0];
                        *(unsigned int *)&a1->padding_20[40] = 1;
                        a1->field_4c = v113 >> 3;
                        *(unsigned short *)&v111->padding_0[4] = (unsigned short)v106;
                        *(unsigned int *)&v111->padding_0[0] = v74;
                        v112 = v67 - 3;
                        if (v112 < 0x10000)
                            goto LABEL_96058;
LABEL_96208:
                        v115 = &v111->padding_0[-1 * a1->field_0];
                        *(unsigned int *)&a1->padding_20[40] = 2;
                        a1->field_4c = v115 >> 3;
                        v111->field_6 = (unsigned short)v112;
                        a1->field_8 = &v111[1];
                        v114 = v4;
                        if (!*(int *)&v59[1].padding_10[4])
                            goto LABEL_96074;
LABEL_96070:
                        *(unsigned int *)&v59[1].padding_10[4] = 0;
LABEL_96074:
                        node = v71 + v67;
                        if (i >= node)
                        {
                            v40 = v7;
                            if ((unsigned int)v105)
                            {
                                do
                                {
                                    v57 = v104;
                                    v104 = v105;
                                    v116 = v105 & 0xffffffff;
                                    if (*(int *)node != *(int *)((char *)node - v116))
                                    {
                                        v39 = node;
                                        v58 = v57;
                                        v57 = v104;
                                        break;
                                    }
                                    v117 = sub_7cdfc(node + 4, node + 4 + -v116, v40);
                                    v14 = &v13;
                                    v13 = &v14;
                                    if (node > v114)
                                        sub_82208(a1->field_18, node, node, v114);
                                    else
                                        *a1->field_18 = *(int128_t *)node;
                                    v118 = a1->field_8;
                                    *(unsigned short *)&v118->padding_0[4] = 0;
                                    *(unsigned int *)&v118->padding_0[0] = 1;
                                    v119 = v117 + 1;
                                    v120 = v119;
                                    if (0x10000 <= v119)
                                    {
                                        v121 = &v118->padding_0[-1 * a1->field_0];
                                        *(unsigned int *)&a1->padding_20[40] = 2;
                                        a1->field_4c = v121 >> 3;
                                    }
                                    v118->field_6 = (unsigned short)v119;
                                    a1->field_8 = &v118[1];
                                    node += v117 + 4;
                                    if (node <= i)
                                    {
                                        v122 = arm64g_calculate_condition(148, v120, 0x10000, 0);
                                        v123 = 3;
                                        v124 = (v122 & 1 ? v57 & 0xffffffff : 0x40000000);
                                    }
                                    else
                                    {
                                        v125 = arm64g_calculate_condition(148, v120, 0x10000, 0);
                                        v123 = 0;
                                        v124 = (v125 & 1 ? v57 & 0xffffffff : 0x40000000);
                                    }
                                    v105 = v57;
                                    v39 = node;
                                    v58 = v104;
                                    v126 = arm64g_calculate_condition(v123 | 16, v124, 0, 0);
                                } while (v126 & 1);
                            }
                            else
                            {
                                v39 = node;
                                v58 = v104;
                                v57 = v105;
                            }
                        }
                        else
                        {
                            v39 = node;
                            v58 = v104;
                            v57 = v105;
                            v40 = v7;
                        }
                    }
                }
            }
            else
            {
                v66 = sub_93d24(v59, node, v40, &v12);
                if (v60 < v66)
                    v67 = v66;
                else
                    v67 = v60;
                if (v67 >= 4)
                    goto LABEL_95cfc;
LABEL_95c14:
                v68 = node - v39;
                node = node + (v68 >> 8) + 1;
                v59 = v6;
                *(unsigned int *)&v59[1].padding_10[4] = v68 > 0x7ff;
                continue;
            }
        } while (i > node);
        v46 = v1;
        v45 = v2;
        v56 = v0;
    }
    if (v56 < v45)
        v127 = v45;
    else
        v127 = 0;
    if (v56 < v46)
        v128 = v46;
    else
        v128 = 0;
    v129 = v58 & 0xffffffff;
    if ((unsigned int)v58)
    {
        v130 = (unsigned int)v58;
        v131 = arm64g_calculate_condition(19, v129, 0, 0);
        if (!(v131 & 1))
            goto LABEL_9628a;
LABEL_96289:
        v133 = arm64g_calculate_condition(19, v129, 0, 0);
        v134 = arm64g_calculate_condition(131, (v133 & 1 ? v45 : 0), (v133 & 1 ? v56 : 0), 0);
        if (!(v134 & 1))
            goto LABEL_9628e;
LABEL_9628d:
        v128 = v45;
    }
    else
    {
        v130 = v127;
        v132 = arm64g_calculate_condition(19, v129, 0, 0);
        if (v132 & 1)
            goto LABEL_96289;
LABEL_9628a:
        v135 = arm64g_calculate_condition(19, v129, 0, 0);
        v136 = arm64g_calculate_condition(128, (v135 & 1 ? v45 : 0), (v135 & 1 ? v56 : 0), 0);
        if (v136 & 1)
            goto LABEL_9628d;
LABEL_9628e:
    }
    if ((unsigned int)v57)
        v128 = (unsigned int)v57;
    *(unsigned int *)&a2->field_0 = v130;
    *(unsigned int *)((char *)&a2->field_0 + 4) = v128;
    return v40 - v39;
}
