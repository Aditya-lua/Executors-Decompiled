/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2048..0xa2ea8 (3680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2048_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_a2048_4;

typedef struct st_a2048_5 {
    char padding_0[8];
    void* field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[16];
    unsigned int field_2c;
    char padding_30[4];
    unsigned int field_34;
    char padding_38[8];
    unsigned int field_40;
    char padding_44[28];
    unsigned long long field_60;
    char padding_68[144];
    struct st_a2048_4 *field_f8;
    char padding_100[12];
    void* field_10c;
    void* field_110;
    char padding_118[20];
    unsigned int field_12c;
} st_a2048_5;

typedef struct st_a2048_0 {
    unsigned int field_0;
    unsigned int field_4;
} st_a2048_0;

typedef struct st_a2048_6 {
    unsigned int field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_a2048_6;

typedef struct st_a2048_3 {
    unsigned long long field_0;
    struct st_a2048_2 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned long long field_48;
    unsigned int field_4c;
} st_a2048_3;

typedef struct st_a2048_1 {
    char field_0;
} st_a2048_1;

typedef struct st_a2048_2 {
    unsigned long long field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_a2048_2;


char * sub_a2048(st_a2048_5 *a0, st_a2048_3 *a1, st_a2048_0 *a2, void* a3, unsigned long a4)
{
    st_a2048_0 *v25;  // x5
    st_a2048_5 *v26;  // x27
    unsigned long long v35;  // 4597
    st_a2048_6 *v125;  // x8
    void* v126;  // x9
    unsigned long long v127;  // x10
    void* l;  // x26
    unsigned long node;  // x8
    void* v38;  // x9
    unsigned int v39;  // w10
    unsigned long long v40;  // w9
    unsigned long long v41;  // x15
    char v42;  // x16
    char v43;  // x17
    unsigned int *v44;  // x0
    void* v27;  // x12
    void* v45;  // w1
    unsigned long long v46;  // w9
    unsigned long long v47;  // x1
    unsigned int v48;  // w1
    unsigned long long v49;  // w9
    unsigned long long v50;  // x1
    unsigned int v51;  // w1
    unsigned long long v52;  // w9
    unsigned int v53;  // w1
    unsigned long long v54;  // x1
    void* v28;  // x19
    unsigned long v55;  // x10
    void* v56;  // x20
    unsigned long v57;  // x8
    unsigned int *v58;  // x9
    unsigned long long v59;  // 4220
    unsigned long long v60;  // x21
    unsigned long long v61;  // x0
    void* v62;  // x23
    void* v63;  // x10
    void* v64;  // x8
    void* v29;  // w8
    unsigned int v65;  // w9
    void* v66;  // x20
    unsigned long long v67;  // x21
    void* v68;  // x23
    unsigned long long v69;  // x21
    void* v70;  // x20
    unsigned long long v71;  // x8
    unsigned int *v72;  // x9
    unsigned long long v73;  // 4212
    void* v74;  // x0
    void* v30;  // w25
    unsigned long long v75;  // 4106
    void* v76;  // x8
    unsigned long long v77;  // x8
    unsigned int *v78;  // x9
    unsigned long long v79;  // 4212
    void* v80;  // x0
    unsigned long long v81;  // 4106
    void* v82;  // x8
    unsigned int v83;  // w10
    char *v84;  // x8
    void* v31;  // w8
    void* v85;  // x13
    void* v86;  // x9
    unsigned long v87;  // x11
    void* v88;  // x10
    char *v89;  // x9
    char *v90;  // x9
    void* v91;  // x11
    unsigned long v92;  // x20
    unsigned long v93;  // x21
    void* v94;  // x23
    void* v32;  // w22
    st_a2048_3 *v95;  // x10
    void* v96;  // w1
    unsigned int *v97;  // x5
    uint128_t *v98;  // x9
    uint128_t *iter;  // x9
    uint128_t *v100;  // x10
    uint128_t *v101;  // x10
    st_a2048_3 *v102;  // x9
    st_a2048_6 *v103;  // x8
    void* v104;  // x9
    unsigned long v33;  // x28
    st_a2048_3 *v105;  // x23
    st_a2048_3 *v106;  // x10
    unsigned long long v107;  // x9
    st_a2048_5 *v108;  // x9
    unsigned long long v109;  // x10
    unsigned long v110;  // x8
    void* v111;  // x9
    void* v112;  // x12
    unsigned int v113;  // w10
    unsigned long long j;  // w9
    st_a2048_4 *v34;  // x8
    st_a2048_5 *v115;  // x12
    char v116;  // x14
    unsigned long long v117;  // x12
    unsigned long long v118;  // w9
    unsigned long long v119;  // x15
    unsigned int v120;  // w15
    unsigned long long v121;  // x8
    unsigned long long v122;  // 4190
    unsigned int *v123;  // x9
    void* v124;  // x24
    st_a2048_0 *v0;  // [bp-0x120]
    char *v1;  // [bp-0x118]
    unsigned int *v2;  // [bp-0x110]
    void* v3;  // [bp-0x104]
    unsigned int v4;  // [bp-0xf4]
    void* v5;  // [bp-0xf0]
    void* v6;  // [bp-0xe8]
    void* v7;  // [bp-0xe0]
    unsigned long v8;  // [bp-0xd8]
    char *v9;  // [bp-0xd0]
    unsigned int v10;  // [bp-0xc4]
    unsigned long v11;  // [bp-0xc0]
    st_a2048_5 *v12;  // [bp-0xb8]
    void* i;  // [bp-0xb0]
    char *v14;  // [bp-0xa8]
    unsigned long v15;  // [bp-0xa0]
    st_a2048_1 **v16;  // [bp-0x98], Other Possible Types: char
    st_a2048_1 *v17;  // [bp-0x90]
    char v18;  // [bp-0x88]
    st_a2048_1 **v19;  // [bp-0x88]
    st_a2048_1 *v20;  // [bp-0x80], Other Possible Types: unsigned long long
    st_a2048_1 **v21;  // [bp-0x78], Other Possible Types: char
    st_a2048_1 *v22;  // [bp-0x70]
    char *v23;  // [bp-0x10]
    char v24;  // [bp+0x0]

    v23 = &v24;
    v25 = a2;
    v26 = a0;
    v17 = &v16;
    v16 = &v17;
    v14 = a3 + a4;
    v27 = v14 - 16;
    v28 = a0->field_8;
    v15 = a0->field_18;
    v29 = (void*)((unsigned int)(int)a0->field_10c < 6 ? (int)a0->field_10c : 6);
    v30 = (4 < v29 ? v29 : 4);
    v3 = (void*)*(int *)&(a0->padding_100)[1];
    v31 = (v3 < 6 ? v3 : 6);
    v32 = (4 < v31 ? v31 : 4);
    v33 = a2->field_0;
    v4 = a2->field_4;
    v34 = a0->field_f8;
    v11 = v34->field_8;
    v8 = v34->field_0;
    v9 = v28 + v15;
    v1 = v34->field_8 + v34->field_18;
    v5 = a3;
    v35 = arm64g_calculate_condition(0x11, a3 - v9 - v1 & 0xffffffff, v34->field_0 & 0xffffffff, 0);
    l = (v35 & 1 ? a3 : a3 + 1);
    *(unsigned int *)&a0->padding_118[12] = 0;
    node = a0->field_2c;
    v22 = &v21;
    v21 = &v22;
    v38 = v28 + node;
    v39 = v27 - v38;
    i = v27;
    v40 = (v27 < v38 ? 0 : 8 <= v39 + 1 ? 8 : v39 + 1);
    if (v40 + (unsigned int)node > (unsigned int)node)
    {
        v41 = v26->field_60;
        v42 = 24 - v26->field_34;
        v43 = 56 - v26->field_34;
        v44 = &v26->field_40;
        v45 = v3;
        if (v45 <= 4)
        {
            do
            {
                v52 = v40;
                if (v30 == 4)
                {
                    v53 = (2654435761 * *(int *)((char *)v28 + node) ^ (unsigned int)v41) >> (v42 & 31);
                }
                else
                {
                    if (v30 == 5)
                        v54 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v28 + node);
                    else
                        v54 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v28 + node);
                    v53 = (v54 ^ v41) >> (v43 & 63);
                }
            } while ((v44[node & 7] = v53, node += 1, v40 = v52 - 1, v52 != 1));
        }
        else if (v45 == 5)
        {
            do
            {
                v46 = v40;
                if (v30 == 6)
                {
                    v47 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v28 + node);
                    goto LABEL_a2224;
                }
                else if (v30 == 5)
                {
                    v47 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v28 + node);
LABEL_a2224:
                    v48 = (v47 ^ v41) >> (v43 & 63);
                    continue;
                }
                else
                {
                    v48 = (2654435761 * *(int *)((char *)v28 + node) ^ (unsigned int)v41) >> (v42 & 31);
                }
            } while ((v44[node & 7] = v48, node += 1, v40 = v46 - 1, v46 != 1));
        }
        else
        {
            do
            {
                v49 = v40;
                if (v30 == 6)
                {
                    v50 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v28 + node);
                    goto LABEL_a2294;
                }
                else if (v30 == 5)
                {
                    v50 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v28 + node);
LABEL_a2294:
                    v51 = (v50 ^ v41) >> (v43 & 63);
                    continue;
                }
                else
                {
                    v51 = (2654435761 * *(int *)((char *)v28 + node) ^ (unsigned int)v41) >> (v42 & 31);
                }
            } while ((v44[node & 7] = v51, node += 1, v40 = v49 - 1, v49 != 1));
        }
    }
    if (i > l)
    {
        v0 = v25;
        v55 = v11;
        v2 = &v26->field_40;
        v10 = (unsigned int)v15 + (unsigned int)(v55 - v8);
        v6 = v55 - v10;
        v7 = v14 - 32;
        v12 = v26;
        do
        {
            v56 = l + 1;
            v57 = (unsigned int)(l - v28 - v33) + 1;
            v58 = ((unsigned int)v57 < (unsigned int)v15 ? v11 + v57 - v10 : v28 + v57);
            v59 = arm64g_calculate_condition(129, v57 - v15 & 0xffffffff, 4, 0);
            if (!(v59 & 1) && *v58 == *(int *)v56)
                v60 = sub_84f30(l + 5, v58 + 1, v14, ((unsigned int)v57 < (unsigned int)v15 ? v8 : v14), v9) + 4;
            else
                v60 = 0;
            v20 = 0x3b9ac9ff;
            v22 = &v21;
            v21 = &v22;
            if (v30 != 6)
            {
                if (v30 == 5)
                {
                    if (v32 == 6)
                    {
                        v61 = sub_b0230();
                        v62 = (v60 < v61 ? v61 : v60);
                        if (4 <= v62)
                            goto LABEL_a2550;
                        goto LABEL_a234c;
                    }
                    else if (v32 == 5)
                    {
                        v61 = sub_93dbc();
                        v62 = (v60 < v61 ? v61 : v60);
                        if (v62 >= 4)
                            goto LABEL_a2550;
                        goto LABEL_a234c;
                    }
                    else
                    {
                        v61 = sub_a340c();
                        v62 = (v60 < v61 ? v61 : v60);
                        if (v62 < 4)
                            goto LABEL_a234c;
                    }
                }
                else
                {
                    if (v32 == 6)
                    {
                        v61 = sub_b1abc();
                        v62 = (v60 < v61 ? v61 : v60);
                        if (v62 < 4)
                            goto LABEL_a234c;
                    }
                    else if (v32 == 5)
                    {
                        v61 = sub_b136c();
                        v62 = (v60 < v61 ? v61 : v60);
                        if (v62 >= 4)
                            goto LABEL_a2550;
                        goto LABEL_a234c;
                    }
                    else
                    {
                        v61 = sub_a1910();
                        v62 = (v60 < v61 ? v61 : v60);
                        if (v62 < 4)
                            goto LABEL_a234c;
                    }
                }
            }
            else
            {
                if (v32 == 6)
                {
                    v61 = sub_a6004();
                    v62 = (v60 < v61 ? v61 : v60);
                    if (v62 >= 4)
                        goto LABEL_a2550;
LABEL_a234c:
                    v63 = v5;
                    v64 = l - v63;
                    l = l + (v64 >> 8) + 1;
                    *(unsigned int *)&v26->padding_118[12] = v64 > 0x7ff;
                    v65 = v4;
                    continue;
                }
                else if (v32 == 5)
                {
                    v61 = sub_aecfc();
                    v62 = (v60 < v61 ? v61 : v60);
                    if (v62 >= 4)
                        goto LABEL_a2550;
                    goto LABEL_a234c;
                }
                else
                {
                    v61 = sub_a58c8();
                    v62 = (v60 < v61 ? v61 : v60);
                    if (v62 < 4)
                        goto LABEL_a234c;
                }
            }
LABEL_a2550:
            v66 = (v60 < v61 ? l : v56);
            v67 = (v60 < v61 ? v20 : 1);
            v68 = v62;
            v69 = v67;
            v70 = v66;
            if (l < i)
            {
                do
                {
                    v66 = l + 1;
                    v71 = v66 - v28 - v33;
                    v72 = ((unsigned int)v71 < (unsigned int)v15 ? v11 + v71 - v10 : v28 + v71);
                    v73 = arm64g_calculate_condition(129, v71 - v15 & 0xffffffff, 4, 0);
                    if (!(v73 & 1) && *v72 == *(int *)v66)
                    {
                        v74 = sub_84f30(l + 5, v72 + 1, v14, ((unsigned int)v71 < (unsigned int)v15 ? v8 : v14), v9);
                        v75 = arm64g_calculate_condition(130, v74, 5, 0);
                        if (!(v75 & 1))
                        {
                            v76 = v74 + 4;
                            if ((int)((unsigned int)v76 * 3) > (int)((unsigned int)v68 * 3 + (unsigned int)(!((v69 & 0xffffffff) * 0x100000000) ? 32 : Clz((v69 & 0xffffffff) * 0x100000000)) - 30))
                            {
                                v68 = v76;
                                v69 = 1;
                                v70 = v66;
                            }
                        }
                    }
                    v20 = 0x3b9ac9ff;
                    v22 = &v21;
                    v21 = &v22;
                    if (v30 != 6)
                    {
                        if (v30 == 5)
                        {
                            if (v32 == 6)
                            {
                                v62 = sub_b0230(v12, v66, v14);
                                if (4 > v62)
                                    goto LABEL_a2874;
                            }
                            else if (v32 == 5)
                            {
                                v62 = sub_93dbc(v12, v66, v14);
                                if (4 > v62)
                                    goto LABEL_a2874;
                            }
                            else
                            {
                                v62 = sub_a340c(v12, v66, v14);
                                if (4 > v62)
                                    goto LABEL_a2874;
                            }
                        }
                        else
                        {
                            if (v32 == 6)
                            {
                                v62 = sub_b1abc(v12, v66, v14);
                                if (4 > v62)
                                    goto LABEL_a2874;
                            }
                            else if (v32 == 5)
                            {
                                v62 = sub_b136c(v12, v66, v14);
                                if (4 > v62)
                                    goto LABEL_a2874;
                            }
                            else
                            {
                                v62 = sub_a1910(v12, v66, v14);
                                if (v62 < 4)
                                    goto LABEL_a2874;
                            }
                        }
                    }
                    else
                    {
                        if (v32 == 6)
                        {
                            v62 = sub_a6004(v12, v66, v14);
                            if (4 > v62)
                                goto LABEL_a2874;
                        }
                        else if (v32 == 5)
                        {
                            v62 = sub_aecfc(v12, v66, v14);
                            if (4 > v62)
                                goto LABEL_a2874;
                        }
                        else
                        {
                            v62 = sub_a58c8(v12, v66, v14);
                            if (4 > v62)
                                goto LABEL_a2874;
                        }
                    }
                    v67 = v20;
                    if ((int)((unsigned int)(!((v69 & 0xffffffff) * 0x100000000) ? 32 : Clz((v69 & 0xffffffff) * 0x100000000)) + (unsigned int)v68 * 4 - 27) < (int)((unsigned int)(!((v67 & 0xffffffff) * 0x100000000) ? 32 : Clz((v67 & 0xffffffff) * 0x100000000)) + (unsigned int)v62 * 4 - 31))
                        continue;
LABEL_a2874:
                    if (i > v66)
                    {
                        v66 = l + 2;
                        v77 = v66 - v28 - v33;
                        v78 = ((unsigned int)v77 < (unsigned int)v15 ? v11 + v77 - v10 : v28 + v77);
                        v79 = arm64g_calculate_condition(129, v77 - v15 & 0xffffffff, 4, 0);
                        if (!(v79 & 1) && *v78 == *(int *)v66)
                        {
                            v80 = sub_84f30(l + 6, v78 + 1, v14, ((unsigned int)v77 < (unsigned int)v15 ? v8 : v14), v9);
                            v81 = arm64g_calculate_condition(130, v80, 5, 0);
                            if (!(v81 & 1))
                            {
                                v82 = v80 + 4;
                                if ((int)((unsigned int)v82 * 4) > (int)((unsigned int)(!((v69 & 0xffffffff) * 0x100000000) ? 32 : Clz((v69 & 0xffffffff) * 0x100000000)) + (unsigned int)v68 * 4 - 30))
                                {
                                    v68 = v82;
                                    v69 = 1;
                                    v70 = v66;
                                }
                            }
                        }
                        v20 = 0x3b9ac9ff;
                        v22 = &v21;
                        v21 = &v22;
                        if (v30 != 6)
                        {
                            if (v30 == 5)
                            {
                                if (v32 == 6)
                                {
                                    v62 = sub_b0230(v12, v66, v14);
                                    if (v62 < 4)
                                        goto LABEL_a2a48;
                                }
                                else if (v32 == 5)
                                {
                                    v62 = sub_93dbc(v12, v66, v14);
                                    if (4 > v62)
                                        goto LABEL_a2a48;
                                }
                                else
                                {
                                    v62 = sub_a340c(v12, v66, v14);
                                    if (4 > v62)
                                        goto LABEL_a2a48;
                                }
                            }
                            else
                            {
                                if (v32 == 6)
                                {
                                    v62 = sub_b1abc(v12, v66, v14);
                                    if (4 > v62)
                                        goto LABEL_a2a48;
                                }
                                else if (v32 == 5)
                                {
                                    v62 = sub_b136c(v12, v66, v14);
                                    if (4 > v62)
                                        goto LABEL_a2a48;
                                }
                                else
                                {
                                    v62 = sub_a1910(v12, v66, v14);
                                    if (4 > v62)
                                        goto LABEL_a2a48;
                                }
                            }
                        }
                        else
                        {
                            if (v32 == 6)
                            {
                                v62 = sub_a6004(v12, v66, v14);
                                if (4 > v62)
                                    goto LABEL_a2a48;
                            }
                            else if (v32 == 5)
                            {
                                v62 = sub_aecfc(v12, v66, v14);
                                if (4 > v62)
                                    goto LABEL_a2a48;
                            }
                            else
                            {
                                v62 = sub_a58c8(v12, v66, v14);
                                if (4 > v62)
                                    goto LABEL_a2a48;
                            }
                        }
                        v67 = v20;
                        if ((int)((unsigned int)(!((v67 & 0xffffffff) * 0x100000000) ? 32 : Clz((v67 & 0xffffffff) * 0x100000000)) + (unsigned int)v62 * 4 - 31) <= (int)((unsigned int)(!((v69 & 0xffffffff) * 0x100000000) ? 32 : Clz((v69 & 0xffffffff) * 0x100000000)) + (unsigned int)v68 * 4 - 24))
                            goto LABEL_a2a48;
                    }
                    else
                    {
LABEL_a2a48:
                        v62 = v68;
                        v67 = v69;
                        v66 = v70;
                        if (3 >= v69)
                            goto LABEL_a2a5c;
                        goto LABEL_a2580;
                    }
                    v70 = v66;
                    v69 = v67;
                    v68 = v62;
                    l = v66;
                } while (i > v66);
            }
            if (v67 > 3)
            {
LABEL_a2580:
                v83 = (unsigned int)(v66 - (v67 + v28)) + 3;
                v84 = (v83 < (unsigned int)v15 ? v1 : v9);
                v85 = v5;
                v86 = (v83 < (unsigned int)v15 ? v6 : v28);
                if (v66 > v85)
                {
                    v87 = v83;
                    if (v86 + v87 > v84)
                    {
                        v88 = v66 - 1;
                        v89 = v86 + v87 - 1;
                        do
                        {
                            v90 = v89;
                            if (*(char *)v88 != *v90)
                            {
                                v66 = v88 + 1;
                                goto LABEL_a2a70;
                            }
                        } while ((v62 += 1, v91 = v88 - 1, v88 > v85 && (v88 = v91, v89 = v90 - 1, v84 < v90)));
                        v66 = v91 + 1;
                    }
                }
LABEL_a2a70:
                v92 = (unsigned int)v67 - 3;
            }
            else
            {
LABEL_a2a5c:
                v92 = v33;
                v33 = v4;
                v85 = v5;
            }
            v93 = v33;
            v94 = v66 - v85;
            v22 = &v21;
            v21 = &v22;
            v95 = a1;
            if (v66 > v7)
            {
                sub_82208(v95->field_18, v85, v66);
                v96 = v3;
                v97 = v2;
            }
            else
            {
                *v95->field_18 = *(int128_t *)v85;
                v98 = v95->field_18;
                v96 = v3;
                v97 = v2;
                if (v94 > 16)
                {
                    v98[1] = (int128_t)v85[16];
                    if (v94 >= 33)
                    {
                        iter = v98 + 2;
                        v100 = v85 + 48;
                        do
                        {
                            *iter = *(int128_t *)((char *)v100 - 16);
                            v101 = v100 + 2;
                            iter[1] = *v100;
                            iter += 2;
                            v100 = v101;
                        } while (iter < v98 + v94);
                    }
                }
                else
                {
                    v95->field_18 = v98 + v94;
                    v103 = v95->field_8;
                    v103->field_4 = (unsigned short)v94;
                    v103->field_0 = v67;
                    v104 = v62 - 3;
                    v105 = a1;
                    if (v104 >= 0x10000)
                        goto LABEL_a2e0c;
LABEL_a2b14:
                    v103->field_6 = (unsigned short)v104;
                    v105->field_8 = v103 + 1;
                    v108 = v12;
                    if (!*(int *)&v108->padding_118[12])
                        goto LABEL_a2c40;
                    goto LABEL_a2b2c;
                }
            }
            v102 = a1;
            v102->field_18 = v102->field_18 + v94;
            v103 = v102->field_8;
            if (0x10000 > v94)
            {
                v103->field_4 = (unsigned short)v94;
                v103->field_0 = v67;
                v104 = v62 - 3;
                v105 = a1;
                if (0x10000 <= v104)
                    goto LABEL_a2e0c;
                goto LABEL_a2b14;
            }
            v106 = a1;
            v107 = (char *)v103 - v106->field_0;
            *(unsigned int *)&v106->field_48 = 1;
            *(unsigned int *)((char *)&v106->field_48 + 4) = v107 >> 3;
            v103->field_4 = (unsigned short)v94;
            v103->field_0 = v67;
            v104 = v62 - 3;
            v105 = a1;
            if (v104 < 0x10000)
                goto LABEL_a2b14;
LABEL_a2e0c:
            v109 = (char *)v103 - v105->field_0;
            *(unsigned int *)&v105->field_48 = 2;
            *(unsigned int *)((char *)&v105->field_48 + 4) = v109 >> 3;
            v103->field_6 = (unsigned short)v104;
            v105->field_8 = v103 + 1;
            v108 = v12;
            if (!*(int *)&v108->padding_118[12])
                goto LABEL_a2c40;
LABEL_a2b2c:
            v110 = v108->field_2c;
            v20 = &v18;
            v19 = &v20;
            v111 = v28 + v110;
            v112 = i;
            v113 = v112 - v111;
            j = (v112 < v111 ? 0 : 8 <= v113 + 1 ? 8 : v113 + 1);
            if (j + (unsigned int)v110 > (unsigned int)v110)
            {
                v115 = v12;
                v116 = v115->field_34;
                v117 = v115->field_60;
                do
                {
                    v118 = j;
                    if (v30 == 6)
                    {
                        v119 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v28 + v110);
                    }
                    else if (v30 == 5)
                    {
                        v119 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v28 + v110);
                    }
                    else
                    {
                        v120 = (2654435761 * *(int *)((char *)v28 + v110) ^ (unsigned int)v117) >> ((char)(24 - v116) & 31);
                        continue;
                    }
                    v120 = (v119 ^ v117) >> ((char)(56 - v116) & 63);
                    v22 = &v21;
                    v21 = &v22;
                    v97[v110 & 7] = v120;
                    v110 += 1;
                    j = v118 - 1;
                } while (j);
            }
            *(unsigned int *)&v12->padding_118[12] = 0;
LABEL_a2c40:
            l = v66 + v62;
            if (l > i)
            {
                v63 = l;
                v33 = v92;
                v65 = v93;
                v26 = v12;
            }
            else
            {
                do
                {
                    v33 = v92;
                    v92 = v93;
                    v121 = l - v28 - v93;
                    v122 = arm64g_calculate_condition(129, v121 - v15 & 0xffffffff, 4, 0);
                    if (v122 & 1 || (v123 = ((unsigned int)v121 < (unsigned int)v15 ? v6 : v28) + v121, *v123 != *(int *)l))
                    {
                        v63 = l;
                        v65 = v92;
                        v26 = v12;
                        break;
                    }
                    v124 = sub_84f30(l + 4, v123 + 1, v14, ((unsigned int)v121 < (unsigned int)v15 ? v8 : v14), v9);
                    v22 = &v21;
                    v21 = &v22;
                    if (l > v7)
                        sub_82208(v105->field_18, l, l, v7);
                    else
                        *v105->field_18 = *(int128_t *)l;
                    v125 = v105->field_8;
                    v125->field_4 = 0;
                    v125->field_0 = 1;
                    v126 = v124 + 1;
                    if (0x10000 <= v126)
                    {
                        v127 = (char *)v125 - v105->field_0;
                        *(unsigned int *)&v105->field_48 = 2;
                        *(unsigned int *)((char *)&v105->field_48 + 4) = v127 >> 3;
                    }
                    v125->field_6 = (unsigned short)v126;
                    l += v124 + 4;
                    v105->field_8 = v125 + 1;
                    v93 = v33;
                    v63 = l;
                    v65 = v33;
                    v33 = v92;
                    v26 = v12;
                } while (l <= i);
            }
            v4 = v65;
            v5 = v63;
        } while (i > l);
        v25 = v0;
    }
    v25->field_0 = v33;
    v25->field_4 = v4;
    return v14 - v5;
}
