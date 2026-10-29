/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e3c..0xa77fc (2496 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6e3c_2 {
    unsigned long long field_0;
    unsigned long long field_4;
    unsigned long long field_6;
} st_a6e3c_2;

typedef struct st_a6e3c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_a6e3c_1;

typedef struct st_a6e3c_3 {
    unsigned long long field_0;
    struct st_a6e3c_2 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned long long field_48;
    unsigned int field_4c;
} st_a6e3c_3;

typedef struct st_a6e3c_0 {
    char field_0;
} st_a6e3c_0;


void* sub_a6e3c(void* a0, st_a6e3c_3 *a1, unsigned int *a2, void* iter, unsigned long a4)
{
    void* v24;  // x24
    unsigned int *v25;  // x5
    st_a6e3c_1 *v34;  // x9
    unsigned long long v35;  // 4190
    unsigned long node;  // x9
    void* v37;  // x10
    unsigned int v38;  // w11
    unsigned int v39;  // w11
    unsigned long long v40;  // w10
    void* v41;  // x2
    unsigned long long v42;  // x16
    char v43;  // x17
    void* v26;  // x28
    char v44;  // x0
    unsigned int *v45;  // x1
    unsigned int v46;  // w2
    unsigned long long v47;  // w10
    unsigned long long v48;  // x2
    unsigned int v49;  // w2
    unsigned long long v50;  // w10
    unsigned long long v51;  // x2
    unsigned int v52;  // w2
    unsigned long long v53;  // w10
    void* v27;  // x27
    unsigned int v54;  // w2
    unsigned long long v55;  // x2
    unsigned long v56;  // x11
    unsigned long v57;  // x25
    void* v58;  // x27
    unsigned long v59;  // x8
    unsigned int *v60;  // x9
    unsigned long long v61;  // 4112
    unsigned long long v62;  // x28
    unsigned long v63;  // x22
    void* v28;  // x23
    unsigned long long v64;  // w13
    void* v65;  // x26
    unsigned int v66;  // w8
    unsigned long long v67;  // x0
    unsigned int v68;  // w8
    unsigned int v69;  // w8
    unsigned long v70;  // x8
    unsigned long v71;  // cc_dep1
    unsigned long long v72;  // 4105
    unsigned long long v73;  // 4105
    char *v29;  // x11
    void* v74;  // x8
    void* i;  // x27
    unsigned int v76;  // w10
    unsigned long v77;  // cc_dep1
    unsigned long v78;  // cc_dep2
    char *v79;  // x8
    void* v80;  // x9
    unsigned long long v81;  // 4109
    unsigned long long v82;  // 4109
    unsigned long v83;  // x11
    unsigned int v30;  // w8
    void* v84;  // x10
    char *v85;  // x9
    char *v86;  // x9
    void* v87;  // x11
    unsigned long long v88;  // x20
    uint128_t *v89;  // x9
    uint128_t *iter1;  // x9
    uint128_t *v91;  // x10
    uint128_t *v92;  // x10
    st_a6e3c_2 *v93;  // x8
    unsigned int v31;  // w8
    unsigned int v94;  // w0
    unsigned int *v95;  // x5
    unsigned long long v96;  // x9
    unsigned long long v97;  // x9
    unsigned int v98;  // w10
    unsigned long v99;  // x8
    void* v100;  // x9
    void* v101;  // x12
    unsigned int v102;  // w10
    unsigned int v103;  // w10
    unsigned long v32;  // x8
    unsigned long long j;  // w9
    char v105;  // x14
    unsigned long long v106;  // x12
    unsigned long long v107;  // w9
    unsigned long long v108;  // x15
    unsigned int v109;  // w15
    unsigned long long v110;  // x8
    void* v111;  // x9
    unsigned long long v112;  // 4112
    unsigned long long v113;  // x24
    unsigned long v33;  // x20
    st_a6e3c_2 *v114;  // x8
    unsigned long long v115;  // x9
    unsigned long long v116;  // x10
    unsigned int *v0;  // [bp-0x108]
    char *v1;  // [bp-0x100]
    unsigned int *v2;  // [bp-0xf8]
    unsigned int v3;  // [bp-0xf0]
    unsigned int v4;  // [bp-0xec]
    void* v5;  // [bp-0xe8]
    unsigned long v6;  // [bp-0xe0]
    void* v7;  // [bp-0xd8]
    void* v8;  // [bp-0xd0]
    unsigned int v9;  // [bp-0xc4]
    unsigned long v10;  // [bp-0xc0]
    void* v11;  // [bp-0xb8]
    char *v12;  // [bp-0xb0]
    void* v13;  // [bp-0xa8]
    unsigned long v14;  // [bp-0xa0]
    st_a6e3c_0 **v15;  // [bp-0x98], Other Possible Types: char
    st_a6e3c_0 *v16;  // [bp-0x90]
    char v17;  // [bp-0x88]
    st_a6e3c_0 **v18;  // [bp-0x88]
    st_a6e3c_0 *v19;  // [bp-0x80], Other Possible Types: unsigned long
    st_a6e3c_0 **v20;  // [bp-0x78], Other Possible Types: char
    st_a6e3c_0 *v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v24 = iter;
    v25 = a2;
    v16 = &v15;
    v15 = &v16;
    v26 = iter + a4;
    v27 = v26 - 16;
    v28 = (long long)a0[8];
    v14 = (int)a0[24];
    v29 = v28 + v14;
    v30 = (int)a0[272];
    if ((unsigned int)(int)a0[272] >= 6)
        v30 = 6;
    if (4 >= v30)
        v30 = 4;
    v31 = (int)a0[268];
    v3 = v31;
    if (v31 >= 6)
        v31 = 6;
    if (4 >= v31)
        v31 = 4;
    v9 = v31;
    v32 = *a2;
    v33 = a2[1];
    v34 = (long long)a0[248];
    v6 = v34->field_8;
    v12 = v29;
    v1 = v34->field_8 + v34->field_18;
    v10 = v34->field_0;
    v35 = arm64g_calculate_condition(0x11, v24 - v29 - v1 & 0xffffffff, v34->field_0 & 0xffffffff, 0);
    if (!(v35 & 1))
        iter += 1;
    *(unsigned int *)&a0[300] = 0;
    v8 = a0;
    node = (int)a0[44];
    v21 = &v20;
    v20 = &v21;
    v37 = v28 + node;
    v38 = v27 - v37;
    if (8 <= v38 + 1)
        v39 = 8;
    else
        v39 = v38 + 1;
    if (v27 < v37)
        v40 = 0;
    else
        v40 = v39;
    if (v40 + (unsigned int)node > (unsigned int)node)
    {
        v41 = v8;
        v42 = (long long)v41[96];
        v43 = 24 - (int)v41[52];
        v44 = 56 - (int)v41[52];
        v45 = v41 + 64;
        v46 = v3;
        if (v46 <= 4)
        {
            do
            {
                v53 = v40;
                if (v30 == 4)
                {
                    v54 = (2654435761 * *(int *)((char *)v28 + node) ^ (unsigned int)v42) >> (v43 & 31);
                }
                else
                {
                    if (v30 == 5)
                        v55 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v28 + node);
                    else
                        v55 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v28 + node);
                    v54 = (v55 ^ v42) >> (v44 & 63);
                }
            } while ((v45[node & 7] = v54, node += 1, v40 = v53 - 1, v53 != 1));
        }
        else if (v46 == 5)
        {
            do
            {
                v47 = v40;
                if (v30 == 6)
                {
                    v48 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v28 + node);
                    goto LABEL_a701c;
                }
                else if (v30 == 5)
                {
                    v48 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v28 + node);
LABEL_a701c:
                    v49 = (v48 ^ v42) >> (v44 & 63);
                    continue;
                }
                else
                {
                    v49 = (2654435761 * *(int *)((char *)v28 + node) ^ (unsigned int)v42) >> (v43 & 31);
                }
            } while ((v45[node & 7] = v49, node += 1, v40 = v47 - 1, v47 != 1));
        }
        else
        {
            do
            {
                v50 = v40;
                if (v30 == 6)
                {
                    v51 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v28 + node);
                    goto LABEL_a7090;
                }
                else if (v30 == 5)
                {
                    v51 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v28 + node);
LABEL_a7090:
                    v52 = (v51 ^ v42) >> (v44 & 63);
                    continue;
                }
                else
                {
                    v52 = (2654435761 * *(int *)((char *)v28 + node) ^ (unsigned int)v42) >> (v43 & 31);
                }
            } while ((v45[node & 7] = v52, node += 1, v40 = v50 - 1, v50 != 1));
        }
    }
    if (v27 > iter)
    {
        v0 = v25;
        v56 = v6;
        v13 = v26 - 32;
        v2 = v8 + 64;
        v4 = (unsigned int)v14 + (unsigned int)(v56 - v10);
        v11 = v56 - v4;
        v5 = v26;
        v7 = v27;
        do
        {
            v57 = v32;
            v58 = iter + 1;
            v59 = (unsigned int)(iter - v28 - v57) + 1;
            v60 = v6 + v59 - v4;
            if ((unsigned int)v59 >= (unsigned int)v14)
                v60 = v28 + v59;
            v61 = arm64g_calculate_condition(129, v59 - v14 & 0xffffffff, 4, 0);
            if (!(v61 & 1) && *v60 == *(int *)v58)
            {
                v62 = sub_84f30() + 4;
                v63 = v57;
                v57 = v33;
                v64 = 1;
                v65 = v8;
                goto LABEL_a73f8;
            }
            v19 = 0x3b9ac9ff;
            v21 = &v20;
            v20 = &v21;
            if (v30 == 6)
            {
                v69 = v9;
                if (v69 != 6)
                {
                    if (v69 == 5)
                        v67 = sub_ac69c(v8, iter, v26);
                    else
                        v67 = sub_952e0(v8, iter, v26);
                }
                else
                {
                    v67 = sub_acfd0(v8, iter, v26);
                }
            }
            else if (v30 == 5)
            {
                v66 = v9;
                if (v66 == 6)
                {
                    v67 = sub_b3b38(v8, iter, v26);
                }
                else if (v66 == 5)
                {
                    v67 = sub_a0850(v8, iter, v26);
                }
                else
                {
                    v67 = sub_96ac4(v8, iter, v26);
                }
            }
            else
            {
                v68 = v9;
                if (v68 == 6)
                {
                    v67 = sub_af450(v8, iter, v26);
                }
                else if (v68 == 5)
                {
                    v67 = sub_9cbdc(v8, iter, v26);
                }
                else
                {
                    v67 = sub_97b34(v8, iter, v26);
                }
            }
            v62 = v67;
            v70 = v19;
            v71 = v67;
            if (v67)
            {
                v64 = (unsigned int)v70;
                v72 = arm64g_calculate_condition(4, v71, 0, 0);
                if (!(v72 & 1))
                    goto LABEL_a7336;
                goto LABEL_a7335;
            }
            else
            {
                v64 = 1;
                v73 = arm64g_calculate_condition(4, v71, 0, 0);
                if (v73 & 1)
                {
LABEL_a7335:
                    goto LABEL_a7338;
                }
                else
                {
LABEL_a7336:
                    v58 = iter;
LABEL_a7338:
                    if (v67 <= 3)
                    {
                        v74 = iter - v24;
                        iter = iter + (v74 >> 8) + 1;
                        i = v7;
                        *(unsigned int *)&v8[300] = v74 > 0x7ff;
                        v32 = v57;
                        goto LABEL_a716c;
                    }
                    if (v70 >= 4)
                    {
                        v76 = (unsigned int)(iter - v28 - v70) + 3;
                        v77 = v14 & 0xffffffff;
                        v78 = v76;
                        if (v76 < (unsigned int)v14)
                        {
                            v79 = v1;
                            v80 = v11;
                            v81 = arm64g_calculate_condition(131, v77, v78, 0);
                            if (!(v81 & 1))
                                goto LABEL_a7372;
                        }
                        else
                        {
                            v79 = v12;
                            v80 = v11;
                            v82 = arm64g_calculate_condition(131, v77, v78, 0);
                            if (!(v82 & 1))
                            {
LABEL_a7372:
                                v80 = v28;
LABEL_a7374:
                                if (iter > v24 && !(v83 = v76, v80 + v83 <= v79))
                                {
                                    v84 = v58 - 1;
                                    v85 = v80 + v83 - 1;
                                    do
                                    {
                                        v86 = v85;
                                        if (*(char *)v84 != *v86)
                                        {
                                            v58 = v84 + 1;
                                            v65 = v8;
                                            goto LABEL_a73f4;
                                        }
                                    } while ((v62 += 1, v87 = v84 - 1, v84 > v24 && (v84 = v87, v85 = v86 - 1, v79 < v86)));
                                    v58 = v87 + 1;
                                    v65 = v8;
                                }
                                else
                                {
                                    v65 = v8;
                                }
LABEL_a73f4:
                                v63 = v64 - 3;
                                goto LABEL_a73f8;
                            }
                        }
                        goto LABEL_a7374;
                    }
                    else
                    {
                        v63 = v57;
                        v57 = v33;
                        v65 = v8;
LABEL_a73f8:
                        v88 = v58 - v24;
                        v21 = &v20;
                        v20 = &v21;
                        if (v58 > v13)
                        {
                            sub_82208(a1->field_18, v24, v58, v13);
                        }
                        else
                        {
                            *a1->field_18 = *(int128_t *)v24;
                            v89 = a1->field_18;
                            if (v88 > 16)
                            {
                                v89[1] = (int128_t)v24[16];
                                if ((long long)v88 >= 33)
                                {
                                    iter1 = v89 + 2;
                                    v91 = v24 + 48;
                                    do
                                    {
                                        *iter1 = *(int128_t *)((char *)v91 - 16);
                                        v92 = v91 + 2;
                                        iter1[1] = *v91;
                                        iter1 += 2;
                                        v91 = v92;
                                    } while (iter1 < (char *)v89 + v88);
                                }
                            }
                            else
                            {
                                a1->field_18 = (char *)v89 + v88;
                                v93 = a1->field_8;
                                v94 = v3;
                                v95 = v2;
                                *(unsigned short *)((char *)&v93->field_0 + 4) = v88;
                                *(unsigned int *)&v93->field_0 = v64;
                                v96 = v62 - 3;
                                if (v96 >= 0x10000)
                                    goto LABEL_a7778;
LABEL_a7490:
                                *(unsigned short *)((char *)&v93->field_0 + 6) = v96;
                                a1->field_8 = &v93->field_4;
                                if (!(int)v65[300])
                                    goto LABEL_a75a4;
                                goto LABEL_a74a4;
                            }
                        }
                        a1->field_18 = (char *)a1->field_18 + v88;
                        v93 = a1->field_8;
                        v94 = v3;
                        v95 = v2;
                        if (0x10000 > v88)
                        {
                            *(unsigned short *)((char *)&v93->field_0 + 4) = v88;
                            *(unsigned int *)&v93->field_0 = v64;
                            v96 = v62 - 3;
                            if (0x10000 <= v96)
                                goto LABEL_a7778;
                            goto LABEL_a7490;
                        }
                        v97 = (char *)v93 - a1->field_0;
                        *(unsigned int *)&a1->field_48 = 1;
                        *(unsigned int *)((char *)&a1->field_48 + 4) = v97 >> 3;
                        *(unsigned short *)((char *)&v93->field_0 + 4) = v88;
                        *(unsigned int *)&v93->field_0 = v64;
                        v96 = v62 - 3;
                        if (v96 < 0x10000)
                            goto LABEL_a7490;
LABEL_a7778:
                        v98 = (char *)v93 - a1->field_0 >> 3;
                        *(unsigned int *)&a1->field_48 = 2;
                        *(unsigned int *)((char *)&a1->field_48 + 4) = v98;
                        *(unsigned short *)((char *)&v93->field_0 + 6) = v96;
                        a1->field_8 = &v93->field_4;
                        if (!(int)v65[300])
                            goto LABEL_a75a4;
LABEL_a74a4:
                        v99 = (int)v65[44];
                        v19 = &v17;
                        v18 = &v19;
                        v100 = v28 + v99;
                        v101 = v7;
                        v102 = v101 - v100;
                        if (8 <= v102 + 1)
                            v103 = 8;
                        else
                            v103 = v102 + 1;
                        if (v101 < v100)
                            j = 0;
                        else
                            j = v103;
                        if (j + (unsigned int)v99 > (unsigned int)v99)
                        {
                            v105 = (int)v65[52];
                            v106 = (long long)v65[96];
                            do
                            {
                                v107 = j;
                                if (v30 == 6)
                                {
                                    v108 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v28 + v99);
                                }
                                else if (v30 == 5)
                                {
                                    v108 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v28 + v99);
                                }
                                else
                                {
                                    v109 = (2654435761 * *(int *)((char *)v28 + v99) ^ (unsigned int)v106) >> ((char)(24 - v105) & 31);
                                    continue;
                                }
                                v109 = (v108 ^ v106) >> ((char)(56 - v105) & 63);
                                v20 = &v21;
                                v21 = &v20;
                                v95[v99 & 7] = v109;
                                v99 += 1;
                                j = v107 - 1;
                            } while (j);
                        }
                        *(unsigned int *)&v65[300] = 0;
LABEL_a75a4:
                        iter = v58 + v62;
                        i = v7;
                        if (iter > i)
                        {
                            v24 = iter;
                            v32 = v63;
                            v33 = v57;
LABEL_a716c:
                            v26 = v5;
                            continue;
                        }
                        else
                        {
                            do
                            {
                                v33 = v63;
                                v63 = v57;
                                v110 = iter - v28 - v57;
                                if ((unsigned int)v110 < (unsigned int)v14)
                                    v111 = v11;
                                else
                                    v111 = v28;
                                v112 = arm64g_calculate_condition(129, v110 - v14 & 0xffffffff, 4, 0);
                                if (v112 & 1 || *(int *)((char *)v111 + v110) != *(int *)iter)
                                {
                                    v24 = iter;
                                    v32 = v33;
                                    v33 = v63;
                                    v26 = v5;
                                    break;
                                }
                                v113 = sub_84f30();
                                v21 = &v20;
                                v20 = &v21;
                                if (iter > v13)
                                    sub_82208(a1->field_18, iter, iter, v13);
                                else
                                    *a1->field_18 = *(int128_t *)iter;
                                v114 = a1->field_8;
                                *(unsigned short *)((char *)&v114->field_0 + 4) = 0;
                                *(unsigned int *)&v114->field_0 = 1;
                                v115 = v113 + 1;
                                if (0x10000 <= v115)
                                {
                                    v116 = (char *)v114 - a1->field_0;
                                    *(unsigned int *)&a1->field_48 = 2;
                                    *(unsigned int *)((char *)&a1->field_48 + 4) = v116 >> 3;
                                }
                                *(unsigned short *)((char *)&v114->field_0 + 6) = v115;
                                iter += v113 + 4;
                                a1->field_8 = &v114->field_4;
                                v57 = v33;
                                v24 = iter;
                                v32 = v63;
                                v26 = v5;
                            } while (iter <= i);
                        }
                    }
                }
            }
        } while (i > iter);
        v25 = v0;
    }
    *v25 = v32;
    v25[1] = v33;
    return v26 - v24;
}
