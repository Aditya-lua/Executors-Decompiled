/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5138..0xa58c8 (1936 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5138_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_a5138_1;

typedef struct st_a5138_2 {
    char padding_0[8];
    struct st_a5138_3 *field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[220];
    struct st_a5138_1 *field_f8;
    char padding_100[16];
    void* field_110;
    char padding_118[20];
    unsigned int field_12c;
} st_a5138_2;

typedef struct st_a5138_3 {
    unsigned int field_0;
} st_a5138_3;

typedef struct st_a5138_6 {
    struct st_a5138_7 *field_0;
} st_a5138_6;

typedef struct st_a5138_7 {
    struct st_a5138_6 *field_0;
} st_a5138_7;

typedef struct st_a5138_8 {
    unsigned int field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_a5138_8;

typedef struct st_a5138_5 {
    unsigned long long field_0;
    struct st_a5138_4 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned long long field_48;
    unsigned int field_4c;
} st_a5138_5;

typedef struct st_a5138_0 {
    char field_0;
} st_a5138_0;

typedef struct st_a5138_4 {
    unsigned long long field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_a5138_4;


void* sub_a5138(st_a5138_2 *a0, st_a5138_5 *a1, unsigned int *a2, void* node, unsigned long a4)
{
    void* v28;  // x25
    void* v29;  // x27
    unsigned long v38;  // x14
    unsigned long v39;  // x12
    unsigned long long v40;  // 4182
    void* v41;  // x19
    unsigned long v42;  // x8
    unsigned int *v43;  // x9
    unsigned long long v44;  // 4112
    unsigned long long v45;  // x20
    void* v46;  // w8
    void* v47;  // x0
    void* v30;  // x10
    void* v48;  // x28
    void* v49;  // x8
    void* i;  // x19
    unsigned long v51;  // cc_dep1
    unsigned long v52;  // cc_dep2
    void* v53;  // x19
    unsigned long long v54;  // 4105
    unsigned long long v55;  // 4105
    unsigned long long v56;  // x21
    unsigned long long v57;  // x22
    unsigned int *v31;  // x28
    void* v58;  // x27
    st_a5138_2 *v59;  // x20
    void* v60;  // x1
    unsigned long v61;  // x8
    unsigned int *v62;  // x9
    unsigned long long v63;  // 4125
    void* v64;  // x0
    unsigned long long v65;  // 4106
    void* v66;  // x8
    unsigned int v67;  // w9
    unsigned long v32;  // x13
    void* v68;  // w8
    void* v69;  // x0
    unsigned long long v70;  // x8
    unsigned int v71;  // w9
    unsigned int v72;  // w10
    unsigned int v73;  // w10
    unsigned long v74;  // cc_dep1
    unsigned long v75;  // cc_dep2
    char *v76;  // x8
    unsigned int *v77;  // x11
    char *v33;  // x11
    unsigned long long v78;  // 4109
    unsigned long long v79;  // 4109
    unsigned int *v80;  // x9
    unsigned long v81;  // x11
    void* v82;  // x10
    char *v83;  // x9
    char *v84;  // x9
    void* v85;  // x11
    unsigned long v86;  // x22
    unsigned long v87;  // x20
    void* v34;  // w8
    void* v88;  // x23
    st_a5138_5 *v89;  // x10
    uint128_t *v90;  // x9
    uint128_t *iter;  // x9
    uint128_t *v92;  // x10
    uint128_t *v93;  // x10
    st_a5138_5 *v94;  // x9
    st_a5138_8 *v95;  // x8
    st_a5138_5 *v96;  // x10
    unsigned long long v97;  // x9
    unsigned long v35;  // x23
    void* v98;  // x9
    st_a5138_5 *v99;  // x21
    st_a5138_2 *v100;  // x9
    unsigned int v101;  // w10
    unsigned long long v102;  // x8
    unsigned int *v103;  // x9
    unsigned long long v104;  // 4112
    void* v105;  // x25
    st_a5138_8 *v106;  // x8
    void* v107;  // x9
    unsigned long v36;  // x24
    unsigned long long v108;  // x10
    st_a5138_1 *v37;  // x8
    unsigned int v0;  // [bp-0x134]
    unsigned int v1;  // [bp-0x130]
    unsigned int v2;  // [bp-0x12c]
    unsigned long v3;  // [bp-0x128]
    char *v4;  // [bp-0x120]
    unsigned int v5;  // [bp-0x114]
    void* v6;  // [bp-0x108]
    unsigned long long v7;  // [bp-0x100]
    st_a5138_2 *v8;  // [bp-0xf8]
    unsigned long long v9;  // [bp-0xf0]
    unsigned long long v10;  // [bp-0xe8]
    unsigned long long v11;  // [bp-0xe0]
    unsigned int *v12;  // [bp-0xd8]
    void* v13;  // [bp-0xd0]
    unsigned long v14;  // [bp-0xc8]
    void* v15;  // [bp-0xc0]
    unsigned long v16;  // [bp-0xb8]
    void* v17;  // [bp-0xac]
    char *v18;  // [bp-0xa8]
    unsigned int *v19;  // [bp-0xa0]
    unsigned long v20;  // [bp-0x98]
    st_a5138_0 **v21;  // [bp-0x90], Other Possible Types: char
    st_a5138_0 *v22;  // [bp-0x88]
    unsigned long long v23;  // [bp-0x80]
    st_a5138_7 **v24;  // [bp-0x78]
    st_a5138_7 **v25;  // [bp-0x70]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v28 = node;
    v22 = &v21;
    v21 = &v22;
    v29 = node + a4;
    v30 = v29 - 8;
    v31 = a0->field_8;
    v32 = a0->field_18;
    v33 = (char *)v31 + v32;
    v34 = (void*)(int)a0->field_110;
    if ((unsigned int)(int)a0->field_110 >= 6)
        v34 = (void*)6;
    if (4 >= v34)
        v34 = (void*)4;
    v17 = v34;
    v35 = *a2;
    v36 = a2[1];
    v37 = a0->field_f8;
    v38 = v37->field_0;
    v39 = v37->field_8;
    v18 = v33;
    v4 = v39 + v37->field_18;
    v40 = arm64g_calculate_condition(0x11, v28 - v33 - v4 & 0xffffffff, v38 & 0xffffffff, 0);
    if (!(v40 & 1))
        node += 1;
    a0->field_12c = 0;
    if (v30 > node)
    {
        v8 = a0;
        v13 = v29 - 32;
        v14 = v38;
        v3 = a4 + v28 - 8;
        v2 = (unsigned int)(unsigned int *)(-1 * v32 - (char *)v31 + 1);
        v1 = -(unsigned int)v31;
        v0 = (unsigned int)(unsigned int *)(v38 - v32 - v39 - (char *)v31) + 1;
        v5 = (unsigned int)v32 + (unsigned int)(v39 - v38);
        v12 = v39 - v5;
        v6 = v30;
        v19 = v31;
        v20 = v32;
        v15 = v29;
        v16 = v39;
        do
        {
            v41 = node + 1;
            v42 = (unsigned int)(node - v31 - v35) + 1;
            v43 = v39 + v42 - v5;
            if ((unsigned int)v42 >= (unsigned int)v32)
                v43 = (char *)v31 + v42;
            v44 = arm64g_calculate_condition(129, v42 - v32 & 0xffffffff, 4, 0);
            if (!(v44 & 1) && *v43 == *(int *)v41)
                v45 = sub_84f30() + 4;
            else
                v45 = 0;
            v23 = 0x3b9ac9ff;
            v25 = &v24;
            v24 = &v25;
            v46 = v17;
            if (v46 != 6)
            {
                if (v46 == 5)
                {
                    v47 = sub_a440c(v8, node, v29);
                    if (v45 < v47)
                        v48 = v47;
                    else
                        v48 = v45;
                    v32 = v20;
                    if (v48 >= 4)
                        goto LABEL_a538c;
                    goto LABEL_a5248;
                }
                v47 = sub_a494c(v8, node, v29);
                if (v45 < v47)
                    v48 = v47;
                else
                    v48 = v45;
                v32 = v20;
                if (v48 < 4)
                    goto LABEL_a5248;
LABEL_a538c:
                v51 = v47;
                v52 = v45;
                if (v45 < v47)
                {
                    v53 = node;
                    v54 = arm64g_calculate_condition(132, v51, v52, 0);
                    if (!(v54 & 1))
                        goto LABEL_a539a;
                    goto LABEL_a5399;
                }
                else
                {
                    v53 = v41;
                    v55 = arm64g_calculate_condition(132, v51, v52, 0);
                    if (v55 & 1)
                    {
LABEL_a5399:
                        v56 = v23;
                        goto LABEL_a539c;
                    }
                    else
                    {
LABEL_a539a:
                        v56 = 1;
LABEL_a539c:
                        if (v6 > node)
                        {
                            v57 = 0;
                            v7 = v3 - node;
                            v11 = v2 + node - v35;
                            v10 = v1 + node - v35;
                            v9 = v0 + node - v35;
                            v58 = node;
                            v59 = v8;
                            do
                            {
                                v60 = node + v57 + 1;
                                v61 = (unsigned int)v10 + (unsigned int)v57 + 1;
                                v62 = v16 + v9 + v57;
                                if ((unsigned int)v61 >= (unsigned int)v32)
                                    v62 = (char *)v19 + v61;
                                v63 = arm64g_calculate_condition(129, v11 + v57 & 0xffffffff, 4, 0);
                                if (!(v63 & 1) && *v62 == *(int *)v60)
                                {
                                    v64 = sub_84f30();
                                    v65 = arm64g_calculate_condition(130, v64, 5, 0);
                                    if (!(v65 & 1))
                                    {
                                        v66 = v64 + 4;
                                        if (!((v56 & 0xffffffff) * 0x100000000))
                                            v67 = 32;
                                        else
                                            v67 = Clz((v56 & 0xffffffff) * 0x100000000);
                                        v59 = v8;
                                        if ((int)((unsigned int)v66 * 3) > (int)((unsigned int)v48 * 3 + v67 - 30))
                                        {
                                            v48 = v66;
                                            v56 = 1;
                                            v53 = v60;
                                            v59 = v8;
                                        }
                                    }
                                    else
                                    {
                                        v59 = v8;
                                    }
                                }
                                v23 = 0x3b9ac9ff;
                                v25 = &v24;
                                v24 = &v25;
                                v68 = v17;
                                if (v68 == 6)
                                {
                                    v69 = sub_aea10(v59);
                                    v32 = v20;
                                    if (4 <= v69)
                                        goto LABEL_a5528;
                                    else
                                        goto LABEL_a5578;
                                }
                                else if (v68 == 5)
                                {
                                    v69 = sub_a440c();
                                    v32 = v20;
                                    if (4 <= v69)
                                        goto LABEL_a5528;
                                    else
                                        goto LABEL_a5578;
                                }
                                else
                                {
                                    v69 = sub_a494c();
                                    v32 = v20;
                                    if (v69 < 4)
                                        goto LABEL_a5578;
                                    else
                                        goto LABEL_a5528;
                                }
LABEL_a5528:
                                v70 = v23;
                                if (!((v56 & 0xffffffff) * 0x100000000))
                                    v71 = 32;
                                else
                                    v71 = Clz((v56 & 0xffffffff) * 0x100000000);
                                if (!((v70 & 0xffffffff) * 0x100000000))
                                    v72 = 32;
                                else
                                    v72 = Clz((v70 & 0xffffffff) * 0x100000000);
                                if ((int)(v72 + (unsigned int)v69 * 4 - 31) <= (int)(v71 + (unsigned int)v48 * 4 - 27))
                                    goto LABEL_a5578;
                            } while ((v53 = v58 + 1, v57 += 1, v56 = v70, v48 = v69, v58 = v53, v7 != v57));
                            v53 = node + v57;
                            v48 = v69;
                            v56 = v70;
LABEL_a5578:
                            v29 = v15;
                        }
                        if (v56 > 3)
                        {
                            v73 = (unsigned int)(v53 - (v56 + (char *)v19)) + 3;
                            v74 = v32 & 0xffffffff;
                            v75 = v73;
                            if (v73 < (unsigned int)v32)
                            {
                                v76 = v4;
                                v77 = v12;
                                v78 = arm64g_calculate_condition(131, v74, v75, 0);
                                if (!(v78 & 1))
                                    goto LABEL_a55ae;
                            }
                            else
                            {
                                v76 = v18;
                                v77 = v12;
                                v79 = arm64g_calculate_condition(131, v74, v75, 0);
                                if (!(v79 & 1))
                                {
LABEL_a55ae:
                                    v80 = v19;
LABEL_a55b0:
                                    if (v53 > v28)
                                    {
                                        v81 = v73;
                                        if ((char *)v80 + v81 > v76)
                                        {
                                            v82 = v53 - 1;
                                            v83 = (char *)v80 + v81 - 1;
                                            do
                                            {
                                                v84 = v83;
                                                if (*(char *)v82 != *v84)
                                                {
                                                    v53 = v82 + 1;
                                                    goto LABEL_a5620;
                                                }
                                            } while ((v48 += 1, v85 = v82 - 1, v82 > v28 && (v82 = v85, v83 = v84 - 1, v76 < v84)));
                                            v53 = v85 + 1;
                                        }
                                    }
LABEL_a5620:
                                    v86 = (unsigned int)v56 - 3;
                                    goto LABEL_a5624;
                                }
                            }
                            v80 = v77;
                            goto LABEL_a55b0;
                        }
                        else
                        {
                            v86 = v35;
                            v35 = v36;
LABEL_a5624:
                            v87 = v35;
                            v88 = v53 - v28;
                            v25 = &v24;
                            v24 = &v25;
                            v89 = a1;
                            if (v53 > v13)
                            {
                                sub_82208(v89->field_18, v28, v53, v13);
                                goto LABEL_a565c;
                            }
                            else
                            {
                                *v89->field_18 = *(int128_t *)v28;
                                v90 = v89->field_18;
                                if (v88 > 16)
                                {
                                    v90[1] = (int128_t)v28[16];
                                    if (v88 >= 33)
                                    {
                                        iter = v90 + 2;
                                        v92 = v28 + 48;
                                        do
                                        {
                                            *iter = *(int128_t *)((char *)v92 - 16);
                                            v93 = v92 + 2;
                                            iter[1] = *v92;
                                            iter += 2;
                                            v92 = v93;
                                        } while (iter < v90 + v88);
                                    }
LABEL_a565c:
                                    v94 = a1;
                                    v94->field_18 = v94->field_18 + v88;
                                    v95 = v94->field_8;
                                    if (0x10000 <= v88)
                                    {
                                        v96 = a1;
                                        v97 = (char *)v95 - v96->field_0;
                                        *(unsigned int *)&v96->field_48 = 1;
                                        *(unsigned int *)((char *)&v96->field_48 + 4) = v97 >> 3;
                                    }
                                    v32 = v20;
                                    v95->field_4 = (unsigned short)v88;
                                    v95->field_0 = v56;
                                    v98 = v48 - 3;
                                    v99 = a1;
                                    if (0x10000 <= v98)
                                        goto LABEL_a5850;
                                    goto LABEL_a5694;
                                }
                                else
                                {
                                    v89->field_18 = v90 + v88;
                                    v95 = v89->field_8;
                                    v95->field_4 = (unsigned short)v88;
                                    v95->field_0 = v56;
                                    v98 = v48 - 3;
                                    v99 = a1;
                                    if (v98 < 0x10000)
                                    {
LABEL_a5694:
                                        v95->field_6 = (unsigned short)v98;
                                        v99->field_8 = v95 + 1;
                                        v100 = v8;
                                        if (!v100->field_12c)
                                            goto LABEL_a56b0;
                                        goto LABEL_a56ac;
                                    }
                                    else
                                    {
LABEL_a5850:
                                        v101 = (char *)v95 - v99->field_0 >> 3;
                                        *(unsigned int *)&v99->field_48 = 2;
                                        *(unsigned int *)((char *)&v99->field_48 + 4) = v101;
                                        v95->field_6 = (unsigned short)v98;
                                        v99->field_8 = v95 + 1;
                                        v100 = v8;
                                        if (!v100->field_12c)
                                            goto LABEL_a56b0;
LABEL_a56ac:
                                        v100->field_12c = 0;
LABEL_a56b0:
                                        node = v53 + v48;
                                        i = v6;
                                        if (node > i)
                                        {
                                            v28 = node;
                                            v35 = v86;
                                            v36 = v87;
LABEL_a5268:
                                            v31 = v19;
                                            continue;
                                        }
                                        else
                                        {
                                            v31 = v19;
                                            do
                                            {
                                                v36 = v86;
                                                v86 = v87;
                                                v102 = node - v31 - v87;
                                                if ((unsigned int)v102 < (unsigned int)v32)
                                                    v103 = v12;
                                                else
                                                    v103 = v31;
                                                v104 = arm64g_calculate_condition(129, v102 - v32 & 0xffffffff, 4, 0);
                                                if (v104 & 1 || *(int *)((char *)v103 + v102) != *(int *)node)
                                                {
                                                    v28 = node;
                                                    v35 = v36;
                                                    v36 = v86;
                                                    break;
                                                }
                                                v105 = sub_84f30();
                                                v25 = &v24;
                                                v24 = &v25;
                                                if (node > v13)
                                                    sub_82208(v99->field_18, node, node, v13);
                                                else
                                                    *v99->field_18 = *(int128_t *)node;
                                                v106 = v99->field_8;
                                                v106->field_4 = 0;
                                                v106->field_0 = 1;
                                                v107 = v105 + 1;
                                                v32 = v20;
                                                if (0x10000 <= v107)
                                                {
                                                    v108 = (char *)v106 - v99->field_0;
                                                    *(unsigned int *)&v99->field_48 = 2;
                                                    *(unsigned int *)((char *)&v99->field_48 + 4) = v108 >> 3;
                                                }
                                                v106->field_6 = (unsigned short)v107;
                                                node += v105 + 4;
                                                v99->field_8 = v106 + 1;
                                                v87 = v36;
                                                v28 = node;
                                                v35 = v86;
                                            } while (node <= i);
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
                v47 = sub_aea10(v8, node, v29);
                if (v45 < v47)
                    v48 = v47;
                else
                    v48 = v45;
                v32 = v20;
                if (4 <= v48)
                    goto LABEL_a538c;
LABEL_a5248:
                v49 = node - v28;
                node = node + (v49 >> 8) + 1;
                v8->field_12c = v49 > 0x7ff;
                i = v6;
                goto LABEL_a5268;
            }
            v39 = v16;
        } while (i > node);
        a2 = a2;
    }
    *a2 = v35;
    a2[1] = v36;
    return v29 - v28;
}
