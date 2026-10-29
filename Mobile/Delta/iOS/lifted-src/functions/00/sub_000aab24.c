/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaab24..0xab9fc (3800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aab24_0 {
    char padding_0[8];
    void* field_8;
    void* field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[4];
    unsigned int field_34;
    char padding_38[8];
    unsigned int field_40;
    char padding_44[28];
    unsigned long long field_60;
    char padding_68[152];
    unsigned int field_100;
    char padding_104[8];
    void* field_10c;
    void* field_110;
} st_aab24_0;

typedef struct st_aab24_2 {
    unsigned long long field_0;
    struct st_aab24_1 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[44];
    unsigned int field_4c;
} st_aab24_2;

typedef struct st_aab24_4 {
    struct st_aab24_5 *field_0;
} st_aab24_4;

typedef struct st_aab24_5 {
    struct st_aab24_4 *field_0;
} st_aab24_5;

typedef struct st_aab24_1 {
    char padding_0[6];
    unsigned short field_6;
} st_aab24_1;

typedef struct st_aab24_3 {
    char field_0;
} st_aab24_3;


char * sub_aab24(st_aab24_0 *a0, st_aab24_2 *a1, unsigned int *a2, void* a3, unsigned long a4)
{
    void* v26;  // x25
    st_aab24_0 *v27;  // x22
    unsigned long v36;  // x21
    uint128_t *v126;  // x10
    st_aab24_1 *v127;  // x8
    void* v128;  // x9
    unsigned long long v129;  // x9
    unsigned int v130;  // w10
    void* v131;  // w1
    unsigned long v132;  // x8
    void* v133;  // x9
    void* v134;  // x12
    unsigned int v135;  // w10
    unsigned long v37;  // x6
    unsigned long long j;  // w9
    char v137;  // x14
    unsigned long v138;  // x12
    unsigned long long v139;  // w9
    unsigned long long v140;  // x15
    unsigned int v141;  // w15
    unsigned long v142;  // x14
    void* v143;  // x10
    unsigned int v144;  // w11
    unsigned int v145;  // w13
    void* l;  // x26
    unsigned long long v146;  // 4316
    unsigned long long v147;  // x8
    unsigned int v148;  // w10
    unsigned long long v149;  // 4351
    unsigned int *v150;  // x9
    void* v151;  // x25
    st_aab24_1 *v152;  // x8
    void* v153;  // x9
    unsigned long long v154;  // x10
    unsigned long node;  // x10
    void* v40;  // x11
    unsigned int v41;  // w12
    unsigned long long v42;  // w11
    unsigned long v43;  // x17
    char v44;  // x0
    char v45;  // x1
    void* v28;  // x14
    unsigned int *v46;  // x2
    unsigned long long v47;  // w11
    void* v48;  // w3
    unsigned long long v49;  // x3
    unsigned int v50;  // w3
    unsigned long long v51;  // w11
    void* v52;  // w3
    unsigned long long v53;  // x3
    unsigned int v54;  // w3
    unsigned long long v55;  // w11
    void* v29;  // x23
    void* v56;  // w3
    unsigned int v57;  // w3
    unsigned long long v58;  // x3
    void* v59;  // x10
    unsigned long v60;  // x14
    void* v61;  // x20
    void* v62;  // x19
    unsigned long v63;  // x10
    unsigned int v64;  // w11
    unsigned int v65;  // w13
    unsigned long v30;  // x24
    unsigned long long v66;  // 4319
    unsigned long long v67;  // x8
    unsigned int v68;  // w10
    unsigned long long v69;  // 4354
    unsigned int *v70;  // x9
    unsigned long long v71;  // x23
    void* v72;  // w8
    void* v73;  // w8
    unsigned long long v74;  // x0
    void* iter;  // x25
    unsigned long v31;  // x9
    void* v76;  // w8
    void* v77;  // w8
    void* v78;  // x8
    unsigned long v79;  // x8
    void* v80;  // x28
    unsigned long long v81;  // x23
    void* v82;  // x28
    void* v83;  // x25
    unsigned long long v84;  // x23
    unsigned long v85;  // x20
    void* v32;  // x27
    unsigned int v86;  // w10
    unsigned int v87;  // w12
    unsigned long long v88;  // 4310
    unsigned long long v89;  // x8
    unsigned int v90;  // w10
    unsigned long long v91;  // 4346
    void* v92;  // w24
    unsigned int *v93;  // x9
    void* v94;  // x0
    unsigned long long v95;  // 4106
    char v33;  // x8
    void* v96;  // x8
    void* v97;  // w8
    void* v98;  // w8
    void* v99;  // w8
    unsigned int v100;  // w10
    unsigned int v101;  // w12
    unsigned long long v102;  // 4290
    unsigned long long v103;  // x8
    void* v104;  // w24
    void* v105;  // w20
    void* v34;  // w10
    unsigned long long v106;  // 4112
    unsigned int *v107;  // x9
    void* v108;  // x0
    unsigned long long v109;  // 4106
    void* v110;  // x8
    st_aab24_2 *v111;  // x28
    unsigned int v112;  // w10
    void* v113;  // x9
    void* v114;  // x8
    void* v115;  // x1
    void* v35;  // w10
    unsigned long v116;  // x10
    void* v117;  // x9
    void* v118;  // x10
    void* v119;  // x9
    void* v120;  // x11
    unsigned long v121;  // x20
    void* v122;  // x19
    uint128_t *v123;  // x9
    uint128_t *iter1;  // x9
    uint128_t *v125;  // x10
    st_aab24_0 *v0;  // [bp-0x120]
    void* v1;  // [bp-0x118]
    unsigned int *v2;  // [bp-0x110]
    void* v3;  // [bp-0xfc]
    void* v4;  // [bp-0xf8]
    unsigned int v5;  // [bp-0xec]
    void* v6;  // [bp-0xe8]
    void* v7;  // [bp-0xe0]
    unsigned long long v8;  // [bp-0xd8]
    void* v9;  // [bp-0xd0]
    unsigned long v10;  // [bp-0xc8]
    unsigned int v11;  // [bp-0xbc]
    void* v12;  // [bp-0xb8]
    void* v13;  // [bp-0xb0]
    void* v14;  // [bp-0xac]
    char *v15;  // [bp-0xa8]
    void* i;  // [bp-0xa0]
    st_aab24_3 **v17;  // [bp-0x98], Other Possible Types: char
    st_aab24_3 *v18;  // [bp-0x90]
    char v19;  // [bp-0x88]
    st_aab24_3 **v20;  // [bp-0x88]
    st_aab24_3 *v21;  // [bp-0x80], Other Possible Types: unsigned long, unsigned long long
    st_aab24_5 **v22;  // [bp-0x78]
    st_aab24_5 **v23;  // [bp-0x70]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v26 = a3;
    v27 = a0;
    v18 = &v17;
    v17 = &v18;
    v15 = a3 + a4;
    v28 = v15 - 16;
    v29 = a0->field_8;
    v12 = a0->field_10;
    v30 = a0->field_18;
    v31 = a0->field_1c;
    v32 = v29 + v30;
    v33 = a0->field_100;
    v34 = (void*)((unsigned int)(int)a0->field_10c < 6 ? (int)a0->field_10c : 6);
    v13 = (4 < v34 ? v34 : 4);
    v3 = (void*)*(int *)&(a0->padding_104)[1];
    v35 = (v3 < 6 ? v3 : 6);
    v14 = (4 < v35 ? v35 : 4);
    v36 = *a2;
    v37 = a2[1];
    *(unsigned int *)((char *)&a0[1].field_8 + 4) = 0;
    l = (v32 != a3 ? a3 : a3 + 1);
    node = a0->field_2c;
    v23 = &v22;
    v22 = &v23;
    v40 = v29 + node;
    v41 = v28 - v40;
    i = v28;
    v42 = (v28 < v40 ? 0 : 8 <= v41 + 1 ? 8 : v41 + 1);
    if (v42 + (unsigned int)node > (unsigned int)node)
    {
        v43 = v27->field_60;
        v44 = 24 - v27->field_34;
        v45 = 56 - v27->field_34;
        v46 = &v27->field_40;
        if (v3 <= 4)
        {
            do
            {
                v55 = v42;
                v56 = v13;
                if (v56 == 4)
                {
                    v57 = (2654435761 * *(int *)((char *)v29 + node) ^ (unsigned int)v43) >> (v44 & 31);
                }
                else
                {
                    if (v56 == 5)
                        v58 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v29 + node);
                    else
                        v58 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v29 + node);
                    v57 = (v58 ^ v43) >> (v45 & 63);
                }
            } while ((v46[node & 7] = v57, node += 1, v42 = v55 - 1, v55 != 1));
        }
        else if (v3 == 5)
        {
            do
            {
                v47 = v42;
                v48 = v13;
                if (v48 == 6)
                {
                    v49 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v29 + node);
                    goto LABEL_aacec;
                }
                else if (v48 == 5)
                {
                    v49 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v29 + node);
LABEL_aacec:
                    v50 = (v49 ^ v43) >> (v45 & 63);
                    continue;
                }
                else
                {
                    v50 = (2654435761 * *(int *)((char *)v29 + node) ^ (unsigned int)v43) >> (v44 & 31);
                }
            } while ((v46[node & 7] = v50, node += 1, v42 = v47 - 1, v47 != 1));
        }
        else
        {
            do
            {
                v51 = v42;
                v52 = v13;
                if (v52 == 6)
                {
                    v53 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v29 + node);
                    goto LABEL_aad64;
                }
                else if (v52 == 5)
                {
                    v53 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v29 + node);
LABEL_aad64:
                    v54 = (v53 ^ v43) >> (v45 & 63);
                    continue;
                }
                else
                {
                    v54 = (2654435761 * *(int *)((char *)v29 + node) ^ (unsigned int)v43) >> (v44 & 31);
                }
            } while ((v46[node & 7] = v54, node += 1, v42 = v51 - 1, v51 != 1));
        }
    }
    if (i > l)
    {
        v59 = v12;
        v0 = v27;
        v1 = v59 + v31;
        v11 = 1 << (v33 & 31);
        v7 = v15 - 32;
        v8 = v59 + v30;
        v2 = &v27->field_40;
        v9 = v29;
        v10 = v30;
        v60 = v37;
        v4 = v32;
        do
        {
            v61 = l + 1;
            v62 = l - v29;
            v63 = (unsigned int)v62 + 1;
            v64 = v63 - v27->field_1c;
            v65 = v11;
            v66 = arm64g_calculate_condition((v65 < v64 ? 3 : 0), (v65 < v64 ? v27->field_28 : 0), 0, 0);
            v67 = v63 - v36;
            v68 = v63 - (v66 & 1 ? (unsigned int)(v63 - v65) : v27->field_1c);
            v69 = arm64g_calculate_condition((unsigned int)v36 <= v68 | 128, ((unsigned int)v36 <= v68 ? v67 - v30 & 0xffffffff : 0x20000000), ((unsigned int)v36 <= v68 ? 4 : 0), 0);
            if (!(v69 & 1) && !(v70 = ((unsigned int)v67 < (unsigned int)v30 ? v12 : v29) + v67, *(int *)v61 != *v70))
            {
                v71 = sub_84f30(l + 5, v70 + 1, v15, ((unsigned int)v67 < (unsigned int)v30 ? v8 : v15), v32) + 4;
                v27 = v0;
            }
            else
            {
                v71 = 0;
            }
            v21 = 0x3b9ac9ff;
            v23 = &v22;
            v22 = &v23;
            v72 = v13;
            v6 = v26;
            v5 = v60;
            if (v72 == 6)
            {
                v77 = v14;
                if (v77 != 6)
                {
                    if (v77 == 5)
                    {
                        v74 = sub_b35e8();
                        iter = (v71 < v74 ? v74 : v71);
                        if (iter >= 4)
                            goto LABEL_ab09c;
                        goto LABEL_aae24;
                    }
                    else
                    {
                        v74 = sub_a0318();
                        iter = (v71 < v74 ? v74 : v71);
                        if (iter < 4)
                            goto LABEL_aae24;
                    }
                }
                else
                {
                    v74 = sub_b0c18(v27, l, v15, &v21);
                    iter = (v71 < v74 ? v74 : v71);
                    if (iter >= 4)
                        goto LABEL_ab09c;
LABEL_aae24:
                    v26 = v6;
                    v78 = l - v26;
                    l = l + (v78 >> 8) + 1;
                    *(unsigned int *)((char *)&v27[1].field_8 + 4) = v78 > 0x8ff;
                    v79 = v36;
                    v29 = v9;
                    v60 = v5;
                    continue;
                }
            }
            else if (v72 == 5)
            {
                v73 = v14;
                if (v73 == 6)
                {
                    v74 = sub_a2ea8(v27, l, v15, &v21);
                    iter = (v71 < v74 ? v74 : v71);
                    if (4 <= iter)
                        goto LABEL_ab09c;
                    goto LABEL_aae24;
                }
                else if (v73 == 5)
                {
                    v74 = sub_9e96c();
                    iter = (v71 < v74 ? v74 : v71);
                    if (iter >= 4)
                        goto LABEL_ab09c;
                    goto LABEL_aae24;
                }
                else
                {
                    v74 = sub_ad664();
                    iter = (v71 < v74 ? v74 : v71);
                    if (iter < 4)
                        goto LABEL_aae24;
                }
            }
            else
            {
                v76 = v14;
                if (v76 == 6)
                {
                    v74 = sub_9819c(v27, l, v15, &v21);
                    iter = (v71 < v74 ? v74 : v71);
                    if (iter < 4)
                        goto LABEL_aae24;
                }
                else if (v76 == 5)
                {
                    v74 = sub_a7fa4();
                    iter = (v71 < v74 ? v74 : v71);
                    if (iter >= 4)
                        goto LABEL_ab09c;
                    goto LABEL_aae24;
                }
                else
                {
                    v74 = sub_aa0f0();
                    iter = (v71 < v74 ? v74 : v71);
                    if (iter < 4)
                        goto LABEL_aae24;
                }
            }
LABEL_ab09c:
            v80 = (v71 < v74 ? l : v61);
            v81 = (v71 < v74 ? v21 : 1);
            v82 = v80;
            v83 = iter;
            v84 = v81;
            if (l < i)
            {
                do
                {
                    v80 = l + 1;
                    v85 = (unsigned int)v62 + 1;
                    if (v84)
                    {
                        v86 = v85 - v27->field_1c;
                        v87 = v11;
                        v88 = arm64g_calculate_condition((v87 < v86 ? 3 : 0), (v87 < v86 ? v27->field_28 : 0), 0, 0);
                        v89 = v85 - v36;
                        v90 = v85 - (v88 & 1 ? (unsigned int)(v85 - v87) : v27->field_1c);
                        v91 = arm64g_calculate_condition((unsigned int)v36 <= v90 | 128, ((unsigned int)v36 <= v90 ? v89 - v10 & 0xffffffff : 0x20000000), ((unsigned int)v36 <= v90 ? 4 : 0), 0);
                        v92 = v13;
                        if (!(v91 & 1))
                        {
                            v93 = ((unsigned int)v89 < (unsigned int)v10 ? v12 : v9) + v89;
                            v92 = v13;
                            if (*(int *)v80 == *v93)
                            {
                                v94 = sub_84f30(l + 5, v93 + 1, v15, ((unsigned int)v89 < (unsigned int)v10 ? v8 : v15), v4);
                                v95 = arm64g_calculate_condition(130, v94, 5, 0);
                                v92 = v13;
                                if (!(v95 & 1))
                                {
                                    v96 = v94 + 4;
                                    v92 = v13;
                                    if ((int)((unsigned int)v96 * 3) > (int)((unsigned int)v83 * 3 + (unsigned int)(!((v84 & 0xffffffff) * 0x100000000) ? 32 : Clz((v84 & 0xffffffff) * 0x100000000)) - 30))
                                    {
                                        v83 = v96;
                                        v84 = 1;
                                        v82 = v80;
                                        v92 = v13;
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        v92 = v13;
                    }
                    v21 = 0x3b9ac9ff;
                    v23 = &v22;
                    v22 = &v23;
                    if (v92 == 6)
                    {
                        v99 = v14;
                        if (v99 != 6)
                        {
                            if (v99 == 5)
                            {
                                iter = sub_b35e8();
                                if (4 > iter)
                                    goto LABEL_ab3e4;
                            }
                            else
                            {
                                iter = sub_a0318();
                                if (4 > iter)
                                    goto LABEL_ab3e4;
                            }
                        }
                        else
                        {
                            iter = sub_b0c18(v27, v80, v15, &v21);
                            if (4 > iter)
                                goto LABEL_ab3e4;
                        }
                    }
                    else if (v92 == 5)
                    {
                        v97 = v14;
                        if (v97 == 6)
                        {
                            iter = sub_a2ea8(v27, v80, v15, &v21);
                            if (4 > iter)
                                goto LABEL_ab3e4;
                        }
                        else if (v97 == 5)
                        {
                            iter = sub_9e96c();
                            if (4 > iter)
                                goto LABEL_ab3e4;
                        }
                        else
                        {
                            iter = sub_ad664();
                            if (4 > iter)
                                goto LABEL_ab3e4;
                        }
                    }
                    else
                    {
                        v98 = v14;
                        if (v98 == 6)
                        {
                            iter = sub_9819c(v27, v80, v15, &v21);
                            if (4 > iter)
                                goto LABEL_ab3e4;
                        }
                        else if (v98 == 5)
                        {
                            iter = sub_a7fa4();
                            if (4 > iter)
                                goto LABEL_ab3e4;
                        }
                        else
                        {
                            iter = sub_aa0f0();
                            if (iter < 4)
                                goto LABEL_ab3e4;
                        }
                    }
                    v81 = v21;
                    if ((int)((unsigned int)(!((v81 & 0xffffffff) * 0x100000000) ? 32 : Clz((v81 & 0xffffffff) * 0x100000000)) + (unsigned int)iter * 4 - 31) > (int)((unsigned int)(!((v84 & 0xffffffff) * 0x100000000) ? 32 : Clz((v84 & 0xffffffff) * 0x100000000)) + (unsigned int)v83 * 4 - 27))
                    {
                        v62 = v85;
                        continue;
                    }
LABEL_ab3e4:
                    if (i > v80)
                    {
                        v80 = l + 2;
                        v62 = (unsigned int)v62 + 2;
                        if (v84)
                        {
                            v100 = (unsigned int)(v62 - v27->field_1c);
                            v101 = v11;
                            v102 = arm64g_calculate_condition((v101 < v100 ? 3 : 0), (v101 < v100 ? v27->field_28 : 0), 0, 0);
                            v103 = v62 - v36;
                            v104 = v14;
                            v105 = v13;
                            if ((unsigned int)(v62 - (v102 & 1 ? (unsigned int)(v62 - v101) : v27->field_1c)) >= (unsigned int)v36)
                            {
                                v106 = arm64g_calculate_condition(129, v103 - v10 & 0xffffffff, 4, 0);
                                v104 = v14;
                                v105 = v13;
                                if (!(v106 & 1))
                                {
                                    v107 = ((unsigned int)v103 < (unsigned int)v10 ? v12 : v9) + v103;
                                    v104 = v14;
                                    v105 = v13;
                                    if (*(int *)v80 == *v107)
                                    {
                                        v108 = sub_84f30(l + 6, v107 + 1, v15, ((unsigned int)v103 < (unsigned int)v10 ? v8 : v15), v4);
                                        v109 = arm64g_calculate_condition(130, v108, 5, 0);
                                        v104 = v14;
                                        v105 = v13;
                                        if (!(v109 & 1))
                                        {
                                            v110 = v108 + 4;
                                            v104 = v14;
                                            v105 = v13;
                                            if ((int)((unsigned int)v110 * 4) > (int)((unsigned int)(!((v84 & 0xffffffff) * 0x100000000) ? 32 : Clz((v84 & 0xffffffff) * 0x100000000)) + (unsigned int)v83 * 4 - 30))
                                            {
                                                v83 = v110;
                                                v84 = 1;
                                                v82 = v80;
                                                v104 = v14;
                                                v105 = v13;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        else
                        {
                            v105 = v13;
                            v104 = v14;
                        }
                        v21 = 0x3b9ac9ff;
                        v23 = &v22;
                        v22 = &v23;
                        if (v105 != 6)
                        {
                            if (v105 == 5)
                            {
                                if (v104 == 6)
                                {
                                    iter = sub_a2ea8();
                                    if (iter < 4)
                                        goto LABEL_ab5bc;
                                }
                                else if (v104 == 5)
                                {
                                    iter = sub_9e96c();
                                    if (4 > iter)
                                        goto LABEL_ab5bc;
                                }
                                else
                                {
                                    iter = sub_ad664();
                                    if (4 > iter)
                                        goto LABEL_ab5bc;
                                }
                            }
                            else
                            {
                                if (v104 == 6)
                                {
                                    iter = sub_9819c();
                                    if (4 > iter)
                                        goto LABEL_ab5bc;
                                }
                                else if (v104 == 5)
                                {
                                    iter = sub_a7fa4();
                                    if (4 > iter)
                                        goto LABEL_ab5bc;
                                }
                                else
                                {
                                    iter = sub_aa0f0();
                                    if (4 > iter)
                                        goto LABEL_ab5bc;
                                }
                            }
                        }
                        else
                        {
                            if (v104 == 6)
                            {
                                iter = sub_b0c18();
                                if (4 > iter)
                                    goto LABEL_ab5bc;
                            }
                            else if (v104 == 5)
                            {
                                iter = sub_b35e8();
                                if (4 > iter)
                                    goto LABEL_ab5bc;
                            }
                            else
                            {
                                iter = sub_a0318();
                                if (4 > iter)
                                    goto LABEL_ab5bc;
                            }
                        }
                        v81 = v21;
                        if ((int)((unsigned int)(!((v81 & 0xffffffff) * 0x100000000) ? 32 : Clz((v81 & 0xffffffff) * 0x100000000)) + (unsigned int)iter * 4 - 31) <= (int)((unsigned int)(!((v84 & 0xffffffff) * 0x100000000) ? 32 : Clz((v84 & 0xffffffff) * 0x100000000)) + (unsigned int)v83 * 4 - 24))
                            goto LABEL_ab5bc;
                    }
                    else
                    {
LABEL_ab5bc:
                        iter = v83;
                        v81 = v84;
                        v80 = v82;
                        v111 = a1;
                        if (3 >= v84)
                            goto LABEL_ab5d4;
                        goto LABEL_ab0d0;
                    }
                    v82 = v80;
                    v84 = v81;
                    v83 = iter;
                    l = v80;
                } while (i > v80);
            }
            v111 = a1;
            if (v81 > 3)
            {
LABEL_ab0d0:
                v29 = v9;
                v112 = (unsigned int)(v80 - (v81 + v29)) + 3;
                v113 = (v112 < (unsigned int)v10 ? v12 : v29);
                v114 = (v112 < (unsigned int)v10 ? v1 : v4);
                v115 = v6;
                if (v80 > v115)
                {
                    v116 = v112;
                    if (v113 + v116 > v114)
                    {
                        v117 = v113 + v116 - 1;
                        v118 = v80 - 1;
                        do
                        {
                            v119 = v117;
                            if (*(char *)v118 != *(char *)v119)
                            {
                                v80 = v118 + 1;
                                goto LABEL_ab5ec;
                            }
                        } while ((iter += 1, v120 = v118 - 1, v118 > v115 && (v118 = v120, v117 = v119 - 1, v114 < v119)));
                        v80 = v120 + 1;
                    }
                }
LABEL_ab5ec:
                v121 = (unsigned int)v81 - 3;
            }
            else
            {
LABEL_ab5d4:
                v121 = v36;
                v36 = v5;
                v29 = v9;
                v115 = v6;
            }
            v122 = v80 - v115;
            v23 = &v22;
            v22 = &v23;
            if (v80 > v7)
            {
                sub_82208(v111->field_18);
                goto LABEL_ab628;
            }
            else
            {
                *v111->field_18 = *(int128_t *)v115;
                v123 = v111->field_18;
                if (v122 > 16)
                {
                    v123[1] = (int128_t)v115[16];
                    if (v122 >= 33)
                    {
                        iter1 = v123 + 2;
                        v125 = v115 + 48;
                        do
                        {
                            *iter1 = *(int128_t *)((char *)v125 - 16);
                            v126 = v125 + 2;
                            iter1[1] = *v125;
                            iter1 += 2;
                            v125 = v126;
                        } while (iter1 < v123 + v122);
                    }
LABEL_ab628:
                    v111->field_18 = v111->field_18 + v122;
                    v127 = v111->field_8;
                    if (0x10000 > v122)
                    {
                        v29 = v9;
                        *(unsigned short *)&v127->padding_0[4] = (unsigned short)v122;
                        *(unsigned int *)&v127->padding_0[0] = v81;
                        v128 = iter - 3;
                        if (0x10000 > v128)
                            goto LABEL_ab658;
                        goto LABEL_ab97c;
                    }
                    else
                    {
                        v129 = &v127->padding_0[-1 * v111->field_0];
                        *(unsigned int *)&v111->padding_20[40] = 1;
                        v111->field_4c = v129 >> 3;
                        v29 = v9;
                        *(unsigned short *)&v127->padding_0[4] = (unsigned short)v122;
                        *(unsigned int *)&v127->padding_0[0] = v81;
                        v128 = iter - 3;
                        if (v128 < 0x10000)
                            goto LABEL_ab658;
                        goto LABEL_ab97c;
                    }
                }
                else
                {
                    v111->field_18 = v123 + v122;
                    v127 = v111->field_8;
                    *(unsigned short *)&v127->padding_0[4] = (unsigned short)v122;
                    *(unsigned int *)&v127->padding_0[0] = v81;
                    v128 = iter - 3;
                    if (v128 < 0x10000)
                        goto LABEL_ab658;
LABEL_ab97c:
                    v130 = &v127->padding_0[-1 * v111->field_0] >> 3;
                    *(unsigned int *)&v111->padding_20[40] = 2;
                    v111->field_4c = v130;
LABEL_ab658:
                    v127->field_6 = (unsigned short)v128;
                    v111->field_8 = &v127[1];
                    v131 = v13;
                    if (*(int *)((char *)&v27[1].field_8 + 4))
                    {
                        v132 = v27->field_2c;
                        v21 = &v19;
                        v20 = &v21;
                        v133 = v29 + v132;
                        v134 = i;
                        v135 = v134 - v133;
                        j = (v134 < v133 ? 0 : 8 <= v135 + 1 ? 8 : v135 + 1);
                        if (j + (unsigned int)v132 > (unsigned int)v132)
                        {
                            v137 = v27->field_34;
                            v138 = v27->field_60;
                            do
                            {
                                v139 = j;
                                if (v131 == 6)
                                {
                                    v140 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v29 + v132);
                                }
                                else if (v131 == 5)
                                {
                                    v140 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v29 + v132);
                                }
                                else
                                {
                                    v141 = (2654435761 * *(int *)((char *)v29 + v132) ^ (unsigned int)v138) >> ((char)(24 - v137) & 31);
                                    continue;
                                }
                                v141 = (v140 ^ v138) >> ((char)(56 - v137) & 63);
                                v23 = &v22;
                                v22 = &v23;
                                v2[v132 & 7] = v141;
                                v132 += 1;
                                j = v139 - 1;
                            } while (j);
                        }
                        *(unsigned int *)((char *)&v27[1].field_8 + 4) = 0;
                    }
                    l = v80 + iter;
                    if (l > i)
                    {
                        v26 = l;
                        v79 = v121;
                        v60 = v36;
                        v30 = v10;
                        v32 = v4;
                    }
                    else
                    {
                        v30 = v10;
                        v32 = v4;
                        do
                        {
                            v142 = v121;
                            v121 = v36;
                            v143 = l - v29;
                            v144 = (unsigned int)(v143 - v27->field_1c);
                            v145 = v11;
                            v146 = arm64g_calculate_condition((v145 < v144 ? 3 : 0), (v145 < v144 ? v27->field_28 : 0), 0, 0);
                            v147 = v143 - v36;
                            v148 = (unsigned int)(v143 - (v146 & 1 ? (unsigned int)(v143 - v145) : v27->field_1c));
                            v149 = arm64g_calculate_condition((unsigned int)v36 <= v148 | 128, ((unsigned int)v36 <= v148 ? v147 - v30 & 0xffffffff : 0x20000000), ((unsigned int)v36 <= v148 ? 4 : 0), 0);
                            if (v149 & 1 || (v150 = ((unsigned int)v147 < (unsigned int)v30 ? v12 : v29) + v147, *(int *)l != *v150))
                            {
                                v26 = l;
                                v79 = v142;
                                v60 = v121;
                                break;
                            }
                            v151 = sub_84f30(l + 4, v150 + 1, v15, ((unsigned int)v147 < (unsigned int)v30 ? v8 : v15), v32);
                            v23 = &v22;
                            v22 = &v23;
                            if (l > v7)
                                sub_82208(v111->field_18, l, l, v7);
                            else
                                *v111->field_18 = *(int128_t *)l;
                            v152 = v111->field_8;
                            *(unsigned short *)&v152->padding_0[4] = 0;
                            *(unsigned int *)&v152->padding_0[0] = 1;
                            v153 = v151 + 1;
                            v60 = v142;
                            if (0x10000 <= v153)
                            {
                                v154 = &v152->padding_0[-1 * v111->field_0];
                                *(unsigned int *)&v111->padding_20[40] = 2;
                                v111->field_4c = v154 >> 3;
                            }
                            v152->field_6 = (unsigned short)v153;
                            l += v151 + 4;
                            v111->field_8 = &v152[1];
                            v36 = v60;
                            v26 = l;
                            v79 = v121;
                        } while (l <= i);
                    }
                }
            }
            v36 = v79;
        } while (i > l);
    }
    else
    {
        v79 = v36;
        v60 = v37;
    }
    *a2 = v79;
    a2[1] = v60;
    return v15 - v26;
}
