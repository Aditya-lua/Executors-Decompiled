/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa77fc..0xa7fa4 (1960 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a77fc_1 {
    char padding_0[8];
    struct st_a77fc_2 *field_8;
    struct st_a77fc_2 *field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    char padding_2c[212];
    unsigned int field_100;
    char padding_104[12];
    void* field_110;
} st_a77fc_1;

typedef struct st_a77fc_2 {
    unsigned int field_0;
} st_a77fc_2;

typedef struct st_a77fc_4 {
    unsigned long long field_0;
    struct st_a77fc_3 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned int field_48;
    unsigned int field_4c;
} st_a77fc_4;

typedef struct st_a77fc_5 {
    struct st_a77fc_6 *field_0;
} st_a77fc_5;

typedef struct st_a77fc_6 {
    struct st_a77fc_5 *field_0;
} st_a77fc_6;

typedef struct st_a77fc_3 {
    unsigned int field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_a77fc_3;

typedef struct st_a77fc_0 {
    char field_0;
} st_a77fc_0;


char * sub_a77fc(st_a77fc_1 *a0, st_a77fc_4 *a1, unsigned int *a2, void* a3, unsigned long a4)
{
    void* v26;  // x25
    char *v27;  // x27
    unsigned long v36;  // x24
    unsigned long long v126;  // x9
    unsigned int v127;  // w10
    unsigned long v128;  // cc_dep1
    unsigned long v129;  // cc_dep2
    void* v130;  // x10
    unsigned int v131;  // w13
    unsigned long long v132;  // 4112
    unsigned long long v133;  // 4108
    unsigned long long v134;  // 4112
    unsigned long long v135;  // 4108
    unsigned long v37;  // x20
    unsigned int v136;  // w11
    unsigned long long v137;  // x8
    unsigned int v138;  // w13
    unsigned int v139;  // w12
    unsigned long v140;  // cc_dep1
    unsigned long v141;  // cc_dep2
    unsigned int *v142;  // x9
    unsigned long long v143;  // 4112
    unsigned long long v144;  // 4102
    unsigned long long v145;  // 4112
    void* l;  // x26
    unsigned long long v146;  // 4102
    void* v147;  // x25
    st_a77fc_3 *v148;  // x8
    void* v149;  // x9
    unsigned long long v150;  // x10
    unsigned long v39;  // cc_dep1
    unsigned long v40;  // cc_dep2
    void* v41;  // x19
    unsigned long v42;  // x10
    unsigned int v43;  // w13
    unsigned long long v44;  // 4112
    unsigned long long v45;  // 4108
    void* v28;  // x12
    unsigned long long v46;  // 4112
    unsigned long long v47;  // 4108
    unsigned int v48;  // w11
    unsigned long long v49;  // x8
    unsigned int v50;  // w9
    unsigned int v51;  // w12
    unsigned long v52;  // cc_dep1
    unsigned long v53;  // cc_dep2
    unsigned int *v54;  // x9
    unsigned long long v55;  // 4112
    unsigned int *v29;  // x21
    unsigned long long v56;  // 4102
    unsigned long long v57;  // 4112
    unsigned long long v58;  // 4102
    unsigned long long v59;  // x21
    void* v60;  // w8
    unsigned long long v61;  // x0
    void* v62;  // x23
    void* v63;  // x8
    unsigned long v64;  // x8
    unsigned long v65;  // cc_dep1
    unsigned int *v30;  // x23
    unsigned long v66;  // cc_dep2
    void* v67;  // x21
    unsigned long long v68;  // 4105
    unsigned long long v69;  // 4105
    unsigned long long v70;  // x19
    unsigned long long v71;  // x28
    void* v72;  // x27
    unsigned long v73;  // cc_dep1
    unsigned long v74;  // cc_dep2
    void* v75;  // x1
    unsigned long v31;  // x13
    unsigned int v76;  // w11
    unsigned long long v77;  // 4112
    unsigned long long v78;  // 4108
    unsigned long long v79;  // 4112
    unsigned long long v80;  // 4108
    unsigned int v81;  // w10
    unsigned long long v82;  // x8
    unsigned long v83;  // cc_dep1
    unsigned long v84;  // cc_dep2
    unsigned int *v85;  // x9
    unsigned long v32;  // x9
    unsigned int v86;  // w12
    unsigned long long v87;  // 4112
    unsigned long long v88;  // 4102
    unsigned long long v89;  // 4112
    unsigned long long v90;  // 4102
    void* v91;  // x0
    unsigned long long v92;  // 4106
    void* v93;  // x8
    unsigned int v94;  // w9
    void* v95;  // w8
    void* v33;  // x14
    void* v96;  // x0
    unsigned long long v97;  // x8
    unsigned int v98;  // w9
    unsigned int v99;  // w10
    void* j;  // x9
    unsigned int v101;  // w10
    unsigned long v102;  // cc_dep1
    unsigned long v103;  // cc_dep2
    unsigned int *v104;  // x9
    void* v105;  // x8
    char v34;  // x8
    void* v106;  // x11
    unsigned long long v107;  // 4113
    unsigned long long v108;  // 4113
    unsigned long v109;  // x10
    void* v110;  // x9
    void* v111;  // x10
    void* v112;  // x9
    void* v113;  // x11
    unsigned long v114;  // x28
    void* v115;  // x20
    void* v35;  // w10
    st_a77fc_4 *v116;  // x10
    uint128_t *v117;  // x9
    uint128_t *iter;  // x9
    uint128_t *v119;  // x10
    uint128_t *v120;  // x10
    st_a77fc_4 *v121;  // x9
    st_a77fc_3 *v122;  // x8
    void* v123;  // x9
    st_a77fc_4 *v124;  // x19
    st_a77fc_4 *v125;  // x10
    unsigned int v0;  // [bp-0x11c]
    unsigned int v1;  // [bp-0x118]
    unsigned int v2;  // [bp-0x114]
    void* v3;  // [bp-0x110]
    void* v4;  // [bp-0x108]
    unsigned long long v5;  // [bp-0xf8]
    unsigned long long v6;  // [bp-0xf0]
    void* v7;  // [bp-0xe8]
    void* v8;  // [bp-0xe0]
    unsigned int *v9;  // [bp-0xd8]
    unsigned int *v10;  // [bp-0xd0]
    void* v11;  // [bp-0xc8]
    unsigned long long v12;  // [bp-0xc0]
    char *v13;  // [bp-0xb8]
    void* v14;  // [bp-0xb0]
    void* v15;  // [bp-0xa8]
    unsigned int v16;  // [bp-0xa4]
    unsigned long v17;  // [bp-0xa0]
    void* i;  // [bp-0x98]
    st_a77fc_0 **v19;  // [bp-0x90], Other Possible Types: char
    st_a77fc_0 *v20;  // [bp-0x88]
    unsigned long long v21;  // [bp-0x80]
    st_a77fc_6 **v22;  // [bp-0x78]
    st_a77fc_6 **v23;  // [bp-0x70]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v26 = a3;
    v20 = &v19;
    v19 = &v20;
    v27 = a3 + a4;
    v28 = v27 - 8;
    v29 = a0->field_8;
    v30 = a0->field_10;
    v31 = a0->field_18;
    v32 = a0->field_1c;
    v33 = (char *)v29 + v31;
    v34 = a0->field_100;
    v35 = (void*)(int)a0->field_110;
    if ((unsigned int)(int)a0->field_110 >= 6)
        v35 = (void*)6;
    if (4 >= v35)
        v35 = (void*)4;
    v15 = v35;
    v36 = *a2;
    v37 = a2[1];
    *(unsigned int *)((char *)&a0[1].field_10 + 4) = 0;
    v14 = v33;
    if (v33 != a3)
        l = a3;
    else
        l = a3 + 1;
    i = v28;
    v39 = l;
    v40 = v28;
    if (v28 > l)
    {
        v12 = (char *)v30 + v31;
        v13 = v27;
        v3 = (char *)v30 + v32;
        v10 = v29;
        v11 = v27 - 32;
        v16 = 1 << (v34 & 31);
        v2 = (unsigned int)(unsigned int *)(-0x1 * v29 - v16 + 1);
        v1 = (unsigned int)(unsigned int *)(-0x1 * v29 + 1);
        v17 = v31;
        v0 = (unsigned int)(unsigned int *)(-1 * v31 - (char *)v29 + 1);
        v9 = v30;
        do
        {
            v41 = l + 1;
            v42 = (unsigned int)(l - v29) + 1;
            v43 = v16;
            if (v43 < (unsigned int)(v42 - a0->field_1c))
            {
                v44 = arm64g_calculate_condition(132, v39, v40, 0);
                v45 = arm64g_calculate_condition(3, (v44 & 1 ? a0->field_28 : 0), 0, 0);
                if (!(v45 & 1))
                    goto LABEL_a793e;
                goto LABEL_a793d;
            }
            else
            {
                v46 = arm64g_calculate_condition(132, v39, v40, 0);
                v47 = arm64g_calculate_condition(0, (v46 & 1 ? a0->field_28 : 0), 0, 0);
                if (v47 & 1)
                {
LABEL_a793d:
                    v48 = v42 - v43;
                    goto LABEL_a7940;
                }
                else
                {
LABEL_a793e:
                    v48 = a0->field_1c;
LABEL_a7940:
                    v49 = v42 - v36;
                    v50 = v17;
                    v51 = v49 - v50;
                    v52 = v49 & 0xffffffff;
                    v53 = v50;
                    if ((unsigned int)v49 < v50)
                        v54 = v30;
                    else
                        v54 = v29;
                    if ((unsigned int)v36 <= (unsigned int)(v42 - v48))
                    {
                        v55 = arm64g_calculate_condition(147, v52, v53, 0);
                        v56 = arm64g_calculate_condition(129, (v55 & 1 ? v51 : 0x20000000), (v55 & 1 ? 4 : 0), 0);
                        if (v56 & 1)
                            goto LABEL_a79a0;
                    }
                    else
                    {
                        v57 = arm64g_calculate_condition(147, v52, v53, 0);
                        v58 = arm64g_calculate_condition(128, (v57 & 1 ? v51 : 0x20000000), (v57 & 1 ? 4 : 0), 0);
                        if (v58 & 1)
                            goto LABEL_a79a0;
                    }
                    if (*(int *)v41 == *(int *)((char *)v54 + v49))
                    {
                        v59 = sub_84f30() + 4;
                        goto LABEL_a79a4;
                    }
LABEL_a79a0:
                    v59 = 0;
LABEL_a79a4:
                    v21 = 0x3b9ac9ff;
                    v23 = &v22;
                    v22 = &v23;
                    v60 = v15;
                    if (v60 != 6)
                    {
                        if (v60 == 5)
                        {
                            v61 = sub_a46f8();
                            if (v59 < v61)
                                v62 = v61;
                            else
                                v62 = v59;
                            if (v62 >= 4)
                                goto LABEL_a7a28;
                            goto LABEL_a78e4;
                        }
                        v61 = sub_ae06c();
                        if (v59 < v61)
                            v62 = v61;
                        else
                            v62 = v59;
                        if (v62 < 4)
                            goto LABEL_a78e4;
LABEL_a7a28:
                        v65 = v61;
                        v66 = v59;
                        if (v59 < v61)
                        {
                            v67 = l;
                            v68 = arm64g_calculate_condition(132, v65, v66, 0);
                            if (!(v68 & 1))
                                goto LABEL_a7a36;
                            goto LABEL_a7a35;
                        }
                        else
                        {
                            v67 = v41;
                            v69 = arm64g_calculate_condition(132, v65, v66, 0);
                            if (v69 & 1)
                            {
LABEL_a7a35:
                                v70 = v21;
                                goto LABEL_a7a38;
                            }
                            else
                            {
LABEL_a7a36:
                                v70 = 1;
LABEL_a7a38:
                                if (i > l)
                                {
                                    v71 = 0;
                                    v8 = v2 + l;
                                    v6 = v0 + l - v36;
                                    v7 = v1 + l;
                                    v5 = v7 - v36;
                                    v72 = l;
                                    v73 = l;
                                    v74 = i;
                                    do
                                    {
                                        v75 = l + v71 + 1;
                                        if (v70)
                                        {
                                            v76 = (unsigned int)v7 + (unsigned int)v71;
                                            if (v16 < v76 + -a0->field_1c)
                                            {
                                                v77 = arm64g_calculate_condition(132, v73, v74, 0);
                                                v78 = arm64g_calculate_condition(3, (v77 & 1 ? a0->field_28 : 0), 0, 0);
                                                if (!(v78 & 1))
                                                    goto LABEL_a7aae;
                                            }
                                            else
                                            {
                                                v79 = arm64g_calculate_condition(132, v73, v74, 0);
                                                v80 = arm64g_calculate_condition(0, (v79 & 1 ? a0->field_28 : 0), 0, 0);
                                                if (!(v80 & 1))
                                                {
LABEL_a7aae:
                                                    v81 = a0->field_1c;
LABEL_a7ab0:
                                                    v82 = v5 + v71;
                                                    v83 = v82 & 0xffffffff;
                                                    v84 = v17 & 0xffffffff;
                                                    if ((unsigned int)v82 < (unsigned int)v17)
                                                        v85 = v9;
                                                    else
                                                        v85 = v10;
                                                    v86 = (unsigned int)v6 + (unsigned int)v71;
                                                    if ((unsigned int)v36 <= v76 - v81)
                                                    {
                                                        v87 = arm64g_calculate_condition(147, v83, v84, 0);
                                                        v88 = arm64g_calculate_condition(129, (v87 & 1 ? v86 : 0x20000000), (v87 & 1 ? 4 : 0), 0);
                                                        if (v88 & 1)
                                                            goto LABEL_a7b5c;
                                                    }
                                                    else
                                                    {
                                                        v89 = arm64g_calculate_condition(147, v83, v84, 0);
                                                        v90 = arm64g_calculate_condition(128, (v89 & 1 ? v86 : 0x20000000), (v89 & 1 ? 4 : 0), 0);
                                                        if (v90 & 1)
                                                            goto LABEL_a7b5c;
                                                    }
                                                    if (*(int *)v75 == *(int *)((char *)v85 + v82))
                                                    {
                                                        v4 = v75;
                                                        v91 = sub_84f30();
                                                        v92 = arm64g_calculate_condition(130, v91, 5, 0);
                                                        if (!(v92 & 1))
                                                        {
                                                            v93 = v91 + 4;
                                                            if (!((v70 & 0xffffffff) * 0x100000000))
                                                                v94 = 32;
                                                            else
                                                                v94 = Clz((v70 & 0xffffffff) * 0x100000000);
                                                            if ((int)((unsigned int)v93 * 3) > (int)((unsigned int)v62 * 3 + v94 - 30))
                                                            {
                                                                v62 = v93;
                                                                v70 = 1;
                                                                v67 = v4;
                                                                goto LABEL_a7b5c;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            goto LABEL_a7b5c;
                                                        }
                                                    }
                                                }
                                            }
                                            v81 = (unsigned int)v8 + (unsigned int)v71;
                                            goto LABEL_a7ab0;
                                        }
                                        else
                                        {
LABEL_a7b5c:
                                            v21 = 0x3b9ac9ff;
                                            v23 = &v22;
                                            v22 = &v23;
                                            v95 = v15;
                                            if (v95 == 6)
                                            {
                                                v96 = sub_ae2b4(a0);
                                                if (4 <= v96)
                                                    goto LABEL_a7bcc;
                                                else
                                                    goto LABEL_a7c20;
                                            }
                                            else if (v95 == 5)
                                            {
                                                v96 = sub_a46f8();
                                                if (4 <= v96)
                                                    goto LABEL_a7bcc;
                                                else
                                                    goto LABEL_a7c20;
                                            }
                                            else
                                            {
                                                v96 = sub_ae06c();
                                                if (v96 < 4)
                                                    goto LABEL_a7c20;
                                                else
                                                    goto LABEL_a7bcc;
                                            }
LABEL_a7bcc:
                                            v97 = v21;
                                            if (!((v70 & 0xffffffff) * 0x100000000))
                                                v98 = 32;
                                            else
                                                v98 = Clz((v70 & 0xffffffff) * 0x100000000);
                                            if (!((v97 & 0xffffffff) * 0x100000000))
                                                v99 = 32;
                                            else
                                                v99 = Clz((v97 & 0xffffffff) * 0x100000000);
                                            if ((int)(v99 + (unsigned int)v96 * 4 - 31) <= (int)(v98 + (unsigned int)v62 * 4 - 27))
                                                goto LABEL_a7c20;
                                            else
                                                goto LABEL_a7bf0;
                                        }
LABEL_a7bf0:
                                        v67 = v72 + 1;
                                        v71 += 1;
                                        j = l + v71;
                                        v70 = v97;
                                        v62 = v96;
                                        v72 = v67;
                                        v73 = j;
                                        v74 = i;
                                    } while (j < i);
                                    v62 = v96;
                                    v70 = v97;
                                    v67 = j;
LABEL_a7c20:
                                    v27 = v13;
                                }
                                if (v70 > 3)
                                {
                                    v101 = (unsigned int)(v67 - (v70 + (char *)v10)) + 3;
                                    v102 = v17 & 0xffffffff;
                                    v103 = v101;
                                    if (v101 < (unsigned int)v17)
                                    {
                                        v104 = v9;
                                        v105 = v14;
                                        v106 = v3;
                                        v107 = arm64g_calculate_condition(131, v102, v103, 0);
                                        if (!(v107 & 1))
                                            goto LABEL_a7c56;
                                    }
                                    else
                                    {
                                        v104 = v10;
                                        v105 = v14;
                                        v106 = v3;
                                        v108 = arm64g_calculate_condition(131, v102, v103, 0);
                                        if (!(v108 & 1))
                                        {
LABEL_a7c56:
LABEL_a7c58:
                                            if (v67 > v26)
                                            {
                                                v109 = v101;
                                                if ((char *)v104 + v109 > v105)
                                                {
                                                    v110 = (char *)v104 + v109 - 1;
                                                    v111 = v67 - 1;
                                                    do
                                                    {
                                                        v112 = v110;
                                                        if (*(char *)v111 != *(char *)v112)
                                                        {
                                                            v67 = v111 + 1;
                                                            goto LABEL_a7cc8;
                                                        }
                                                    } while ((v62 += 1, v113 = v111 - 1, v111 > v26 && (v111 = v113, v110 = v112 - 1, v105 < v112)));
                                                    v67 = v113 + 1;
                                                }
                                            }
LABEL_a7cc8:
                                            v114 = (unsigned int)v70 - 3;
                                            goto LABEL_a7ccc;
                                        }
                                    }
                                    v105 = v106;
                                    goto LABEL_a7c58;
                                }
                                else
                                {
                                    v114 = v36;
                                    v36 = v37;
LABEL_a7ccc:
                                    v115 = v67 - v26;
                                    v23 = &v22;
                                    v22 = &v23;
                                    v116 = a1;
                                    if (v67 > v11)
                                    {
                                        sub_82208(v116->field_18, v26, v67, v11);
                                    }
                                    else
                                    {
                                        *v116->field_18 = *(int128_t *)v26;
                                        v117 = v116->field_18;
                                        if (v115 > 16)
                                        {
                                            v117[1] = (int128_t)v26[16];
                                            if (v115 >= 33)
                                            {
                                                iter = v117 + 2;
                                                v119 = v26 + 48;
                                                do
                                                {
                                                    *iter = *(int128_t *)((char *)v119 - 16);
                                                    v120 = v119 + 2;
                                                    iter[1] = *v119;
                                                    iter += 2;
                                                    v119 = v120;
                                                } while (iter < v117 + v115);
                                            }
                                        }
                                        else
                                        {
                                            v116->field_18 = v117 + v115;
                                            v122 = v116->field_8;
                                            v122->field_4 = (unsigned short)v115;
                                            v122->field_0 = v70;
                                            v123 = v62 - 3;
                                            v124 = a1;
                                            if (v123 >= 0x10000)
                                                goto LABEL_a7f14;
LABEL_a7d34:
                                            v122->field_6 = (unsigned short)v123;
                                            v124->field_8 = &v122[1];
                                            if (!*(int *)((char *)&a0[1].field_10 + 4))
                                                goto LABEL_a7d4c;
                                            goto LABEL_a7d48;
                                        }
                                    }
                                    v121 = a1;
                                    v121->field_18 = v121->field_18 + v115;
                                    v122 = v121->field_8;
                                    if (0x10000 > v115)
                                    {
                                        v122->field_4 = (unsigned short)v115;
                                        v122->field_0 = v70;
                                        v123 = v62 - 3;
                                        v124 = a1;
                                        if (0x10000 <= v123)
                                            goto LABEL_a7f14;
                                        goto LABEL_a7d34;
                                    }
                                    v125 = a1;
                                    v126 = (char *)v122 - v125->field_0;
                                    v125->field_48 = 1;
                                    v125->field_4c = v126 >> 3;
                                    v122->field_4 = (unsigned short)v115;
                                    v122->field_0 = v70;
                                    v123 = v62 - 3;
                                    v124 = a1;
                                    if (v123 < 0x10000)
                                        goto LABEL_a7d34;
LABEL_a7f14:
                                    v127 = (char *)v122 - v124->field_0 >> 3;
                                    v124->field_48 = 2;
                                    v124->field_4c = v127;
                                    v122->field_6 = (unsigned short)v123;
                                    v124->field_8 = &v122[1];
                                    if (!*(int *)((char *)&a0[1].field_10 + 4))
                                        goto LABEL_a7d4c;
LABEL_a7d48:
                                    *(unsigned int *)((char *)&a0[1].field_10 + 4) = 0;
LABEL_a7d4c:
                                    l = v67 + v62;
                                    v128 = l;
                                    v129 = i;
                                    if (l > i)
                                    {
                                        v26 = l;
                                        v64 = v114;
                                        v37 = v36;
LABEL_a7900:
                                        v30 = v9;
                                        v29 = v10;
                                        continue;
                                    }
                                    else
                                    {
                                        v30 = v9;
                                        v29 = v10;
                                        do
                                        {
                                            v37 = v114;
                                            v114 = v36;
                                            v130 = l - v29;
                                            v131 = v16;
                                            if (v131 < (unsigned int)(v130 - a0->field_1c))
                                            {
                                                v132 = arm64g_calculate_condition(132, v128, v129, 0);
                                                v133 = arm64g_calculate_condition(3, (v132 & 1 ? a0->field_28 : 0), 0, 0);
                                                if (!(v133 & 1))
                                                    goto LABEL_a7dea;
                                                goto LABEL_a7de9;
                                            }
                                            else
                                            {
                                                v134 = arm64g_calculate_condition(132, v128, v129, 0);
                                                v135 = arm64g_calculate_condition(0, (v134 & 1 ? a0->field_28 : 0), 0, 0);
                                                if (v135 & 1)
                                                {
LABEL_a7de9:
                                                    v136 = (unsigned int)(v130 - v131);
                                                    goto LABEL_a7dec;
                                                }
                                                else
                                                {
LABEL_a7dea:
                                                    v136 = a0->field_1c;
LABEL_a7dec:
                                                    v137 = v130 - v36;
                                                    v138 = v17;
                                                    v139 = v137 - v138;
                                                    v140 = v137 & 0xffffffff;
                                                    v141 = v138;
                                                    if ((unsigned int)v137 < v138)
                                                        v142 = v30;
                                                    else
                                                        v142 = v29;
                                                    if ((unsigned int)v36 <= (unsigned int)(v130 - v136))
                                                    {
                                                        v143 = arm64g_calculate_condition(147, v140, v141, 0);
                                                        v144 = arm64g_calculate_condition(129, (v143 & 1 ? v139 : 0x20000000), (v143 & 1 ? 4 : 0), 0);
                                                        if (v144 & 1)
                                                            goto LABEL_a7ee0;
                                                    }
                                                    else
                                                    {
                                                        v145 = arm64g_calculate_condition(147, v140, v141, 0);
                                                        v146 = arm64g_calculate_condition(128, (v145 & 1 ? v139 : 0x20000000), (v145 & 1 ? 4 : 0), 0);
                                                        if (v146 & 1)
                                                            goto LABEL_a7ee0;
                                                    }
                                                    if (*(int *)l != *(int *)((char *)v142 + v137))
                                                    {
LABEL_a7ee0:
                                                        v26 = l;
                                                        v64 = v37;
                                                        v37 = v114;
                                                        break;
                                                    }
                                                }
                                            }
                                            v147 = sub_84f30();
                                            v23 = &v22;
                                            v22 = &v23;
                                            if (l > v11)
                                                sub_82208(v124->field_18, l, l, v11);
                                            else
                                                *v124->field_18 = *(int128_t *)l;
                                            v148 = v124->field_8;
                                            v148->field_4 = 0;
                                            v148->field_0 = 1;
                                            v149 = v147 + 1;
                                            if (0x10000 <= v149)
                                            {
                                                v150 = (char *)v148 - v124->field_0;
                                                v124->field_48 = 2;
                                                v124->field_4c = v150 >> 3;
                                            }
                                            v148->field_6 = (unsigned short)v149;
                                            l += v147 + 4;
                                            v124->field_8 = &v148[1];
                                            v36 = v37;
                                            v26 = l;
                                            v64 = v114;
                                            v128 = l;
                                            v129 = i;
                                        } while (l <= i);
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        v61 = sub_ae2b4(a0, l, v27, &v21);
                        if (v59 < v61)
                            v62 = v61;
                        else
                            v62 = v59;
                        if (4 <= v62)
                            goto LABEL_a7a28;
LABEL_a78e4:
                        v63 = l - v26;
                        l = l + (v63 >> 8) + 1;
                        *(unsigned int *)((char *)&a0[1].field_10 + 4) = v63 > 0x8ff;
                        v64 = v36;
                        goto LABEL_a7900;
                    }
                }
            }
            v36 = v64;
            v39 = l;
            v40 = i;
        } while (i > l);
    }
    else
    {
        v64 = v36;
    }
    *a2 = v64;
    a2[1] = v37;
    return v27 - v26;
}
