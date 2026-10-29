/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f64c..0xa0318 (3276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f64c_2 {
    char padding_0[8];
    void* field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[12];
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
    char padding_118[20];
    unsigned int field_12c;
} st_9f64c_2;

typedef struct st_9f64c_0 {
    unsigned int field_0;
    unsigned int field_4;
} st_9f64c_0;

typedef struct st_9f64c_5 {
    unsigned int field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_9f64c_5;

typedef struct st_9f64c_4 {
    unsigned long long field_0;
    struct st_9f64c_3 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned long long field_48;
    unsigned int field_4c;
} st_9f64c_4;

typedef struct st_9f64c_1 {
    char field_0;
} st_9f64c_1;

typedef struct st_9f64c_3 {
    unsigned long long field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_9f64c_3;


char * sub_9f64c(st_9f64c_2 *a0, st_9f64c_4 *a1, st_9f64c_0 *a2, void* a3, unsigned long a4)
{
    void* v22;  // x23
    st_9f64c_0 *v23;  // x5
    unsigned int v32;  // w4
    unsigned long long v122;  // x10
    unsigned long long v123;  // 4171
    unsigned long long v124;  // 4352
    unsigned int v33;  // w7
    void* v34;  // x25
    unsigned int v35;  // w10
    unsigned int v36;  // w8
    unsigned int v37;  // w11
    unsigned long node;  // x8
    unsigned long long v39;  // 4721
    unsigned int v40;  // w9
    unsigned long v41;  // x19
    char *v24;  // x26
    unsigned long v42;  // x21
    void* v43;  // x9
    unsigned int v44;  // w10
    unsigned long long v45;  // w9
    st_9f64c_2 *v46;  // x16
    unsigned long long v47;  // x12
    char v48;  // x13
    char v49;  // x14
    unsigned int *v50;  // x15
    void* v51;  // w16
    void* v25;  // x6
    unsigned long long v52;  // w9
    unsigned int v53;  // w1
    unsigned long long v54;  // x1
    unsigned long long v55;  // w9
    unsigned long long v56;  // x1
    unsigned int v57;  // w1
    unsigned long long v58;  // w9
    unsigned long long v59;  // x1
    unsigned int v60;  // w1
    unsigned long long v61;  // x22
    void* v26;  // x13
    void* v62;  // x20
    void* v63;  // x20
    unsigned long long v64;  // x9
    void* v65;  // w8
    unsigned long long v66;  // x0
    void* v67;  // x27
    void* v68;  // w8
    void* v69;  // w8
    void* v70;  // x8
    void* i;  // x27
    unsigned long v27;  // x9
    void* v72;  // x26
    unsigned long long v73;  // x22
    void* v74;  // x0
    unsigned long long v75;  // 4106
    void* v76;  // x8
    unsigned int v77;  // w9
    unsigned int v78;  // w10
    void* v79;  // x20
    unsigned long long v80;  // x24
    void* v81;  // x9
    unsigned long long v28;  // x20
    void* v82;  // w8
    void* v83;  // x25
    void* v84;  // w8
    unsigned long long v85;  // x9
    void* v86;  // x8
    void* v87;  // x26
    void* v88;  // x8
    unsigned long v89;  // x20
    unsigned long v90;  // x24
    void* v91;  // x19
    void* v29;  // w8
    st_9f64c_4 *v92;  // x10
    uint128_t *v93;  // x9
    uint128_t *iter;  // x9
    uint128_t *v95;  // x10
    uint128_t *v96;  // x10
    st_9f64c_4 *v97;  // x9
    void* v98;  // x1
    st_9f64c_5 *v99;  // x8
    st_9f64c_2 *v100;  // x0
    void* v101;  // w2
    void* v30;  // w28
    unsigned int *v102;  // x6
    void* v103;  // x9
    st_9f64c_4 *v104;  // x22
    st_9f64c_4 *v105;  // x10
    unsigned long long v106;  // x9
    unsigned long long v107;  // x10
    unsigned long v108;  // x8
    void* v109;  // x9
    void* v110;  // x12
    unsigned int v111;  // w10
    void* v31;  // w8
    unsigned long long j;  // w9
    char v113;  // x14
    unsigned long long v114;  // x12
    unsigned long long v115;  // w9
    unsigned long long v116;  // x15
    unsigned int v117;  // w15
    unsigned long long v118;  // x8
    void* v119;  // x23
    st_9f64c_5 *v120;  // x8
    void* v121;  // x9
    unsigned int v0;  // [bp-0x108]
    unsigned int v1;  // [bp-0x104]
    st_9f64c_0 *v2;  // [bp-0x100]
    unsigned int v3;  // [bp-0xf4]
    unsigned long long v4;  // [bp-0xf0]
    unsigned int *v5;  // [bp-0xe8]
    void* v6;  // [bp-0xdc]
    void* v7;  // [bp-0xd0]
    unsigned long long v8;  // [bp-0xc8]
    char *v9;  // [bp-0xc0]
    void* v10;  // [bp-0xb8]
    void* v11;  // [bp-0xb0]
    void* v12;  // [bp-0x9c]
    st_9f64c_1 **v13;  // [bp-0x98], Other Possible Types: char
    st_9f64c_1 *v14;  // [bp-0x90]
    char v15;  // [bp-0x88]
    st_9f64c_1 **v16;  // [bp-0x88]
    st_9f64c_1 *v17;  // [bp-0x80], Other Possible Types: unsigned long long
    st_9f64c_1 **v18;  // [bp-0x78], Other Possible Types: char
    st_9f64c_1 *v19;  // [bp-0x70]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v22 = a3;
    v23 = a2;
    v14 = &v13;
    v13 = &v14;
    v24 = a3 + a4;
    v25 = v24 - 16;
    v26 = a0->field_8;
    v27 = a0->field_18;
    v28 = v26 + v27;
    v29 = (void*)((unsigned int)(int)a0->field_10c < 6 ? (int)a0->field_10c : 6);
    v30 = (4 < v29 ? v29 : 4);
    v6 = (void*)*(int *)&(a0->padding_104)[1];
    v31 = (v6 < 6 ? v6 : 6);
    v12 = (4 < v31 ? v31 : 4);
    v32 = a2->field_0;
    v33 = a2->field_4;
    v34 = ((unsigned int)v22 != (unsigned int)v28 ? a3 : a3 + 1);
    v35 = v34 - v26;
    v36 = 1 << ((char)a0->field_100 & 31);
    v37 = v35 - v27;
    node = a0->field_2c;
    v39 = arm64g_calculate_condition((v36 < v37 ? 3 : 0), (v36 < v37 ? a0->field_28 : 0), 0, 0);
    v40 = v35 - (v39 & 1 ? v35 - v36 : (unsigned int)v27);
    v41 = (v40 < v33 ? 0 : v33);
    v3 = v40;
    v42 = (v40 < v32 ? 0 : v32);
    *(unsigned int *)&a0->padding_118[12] = 0;
    v19 = &v18;
    v18 = &v19;
    v7 = v26;
    v43 = v26 + node;
    v44 = v25 - v43;
    v45 = (v25 < v43 ? 0 : 8 <= v44 + 1 ? 8 : v44 + 1);
    if (v45 + (unsigned int)node > (unsigned int)node)
    {
        v46 = a0;
        v47 = v46->field_60;
        v48 = 24 - v46->field_34;
        v49 = 56 - v46->field_34;
        v50 = &v46->field_40;
        v51 = v6;
        if (4 >= v51)
        {
            do
            {
                v52 = v45;
                if (v30 == 4)
                {
                    v53 = (2654435761 * *(int *)((char *)v7 + node) ^ (unsigned int)v47) >> (v48 & 31);
                }
                else
                {
                    if (v30 == 5)
                        v54 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v7 + node);
                    else
                        v54 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v7 + node);
                    v53 = (v54 ^ v47) >> (v49 & 63);
                }
            } while ((v50[node & 7] = v53, node += 1, v45 = v52 - 1, v52 != 1));
        }
        else if (v51 == 5)
        {
            do
            {
                v55 = v45;
                if (v30 == 6)
                {
                    v56 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v7 + node);
                    goto LABEL_9f874;
                }
                else if (v30 == 5)
                {
                    v56 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v7 + node);
LABEL_9f874:
                    v57 = (v56 ^ v47) >> (v49 & 63);
                    continue;
                }
                else
                {
                    v57 = (2654435761 * *(int *)((char *)v7 + node) ^ (unsigned int)v47) >> (v48 & 31);
                }
            } while ((v50[node & 7] = v57, node += 1, v45 = v55 - 1, v55 != 1));
        }
        else
        {
            do
            {
                v58 = v45;
                if (v30 == 6)
                {
                    v59 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v7 + node);
                    goto LABEL_9f918;
                }
                else if (v30 == 5)
                {
                    v59 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v7 + node);
LABEL_9f918:
                    v60 = (v59 ^ v47) >> (v49 & 63);
                    continue;
                }
                else
                {
                    v60 = (2654435761 * *(int *)((char *)v7 + node) ^ (unsigned int)v47) >> (v48 & 31);
                }
            } while ((v50[node & 7] = v60, node += 1, v45 = v58 - 1, v58 != 1));
        }
    }
    if (v25 > v34)
    {
        v0 = v33;
        v1 = v32;
        v2 = v23;
        v10 = v25;
        v11 = v24 - 32;
        v4 = v28;
        v5 = &a0->field_40;
        v9 = v24;
        do
        {
            v61 = 0;
            v62 = v34;
            v63 = v62 + 1;
            v64 = v42 & 0xffffffff;
            v8 = -v64;
            if ((unsigned int)v42 && *(int *)((char *)v63 - v64) == (int)v62[1])
                v61 = sub_7cdfc(v34 + 5, v34 + 5 + v8, v24) + 4;
            v17 = 0x3b9ac9ff;
            v19 = &v18;
            v18 = &v19;
            if (v30 == 6)
            {
                v69 = v12;
                if (v69 != 6)
                {
                    if (v69 == 5)
                    {
                        v66 = sub_a4c34(a0, v34, v24);
                        v67 = (v61 < v66 ? v66 : v61);
                        if (v67 >= 4)
                            goto LABEL_9fbe0;
                        goto LABEL_9f9c0;
                    }
                    else
                    {
                        v66 = sub_97130(a0, v34, v24);
                        v67 = (v61 < v66 ? v66 : v61);
                        if (v67 < 4)
                            goto LABEL_9f9c0;
                    }
                }
                else
                {
                    v66 = sub_a0ee4(a0, v34, v24);
                    v67 = (v61 < v66 ? v66 : v61);
                    if (v67 >= 4)
                        goto LABEL_9fbe0;
LABEL_9f9c0:
                    v70 = v34 - v22;
                    v34 = v34 + (v70 >> 8) + 1;
                    *(unsigned int *)&a0->padding_118[12] = v70 > 0x7ff;
                    i = v10;
                    continue;
                }
            }
            else if (v30 == 5)
            {
                v65 = v12;
                if (v65 == 6)
                {
                    v66 = sub_9761c(a0, v34, v24);
                    v67 = (v61 < v66 ? v66 : v61);
                    if (4 <= v67)
                        goto LABEL_9fbe0;
                    goto LABEL_9f9c0;
                }
                else if (v65 == 5)
                {
                    v66 = sub_b2c6c(a0, v34, v24);
                    v67 = (v61 < v66 ? v66 : v61);
                    if (v67 >= 4)
                        goto LABEL_9fbe0;
                    goto LABEL_9f9c0;
                }
                else
                {
                    v66 = sub_9c6f0(a0, v34, v24);
                    v67 = (v61 < v66 ? v66 : v61);
                    if (v67 < 4)
                        goto LABEL_9f9c0;
                }
            }
            else
            {
                v68 = v12;
                if (v68 == 6)
                {
                    v66 = sub_a13fc(a0, v34, v24);
                    v67 = (v61 < v66 ? v66 : v61);
                    if (v67 < 4)
                        goto LABEL_9f9c0;
                }
                else if (v68 == 5)
                {
                    v66 = sub_aa624(a0, v34, v24);
                    v67 = (v61 < v66 ? v66 : v61);
                    if (v67 >= 4)
                        goto LABEL_9fbe0;
                    goto LABEL_9f9c0;
                }
                else
                {
                    v66 = sub_a6954(a0, v34, v24);
                    v67 = (v61 < v66 ? v66 : v61);
                    if (v67 < 4)
                        goto LABEL_9f9c0;
                }
            }
LABEL_9fbe0:
            v72 = (v61 < v66 ? v34 : v63);
            v73 = (v61 < v66 ? v17 : 1);
            if (v10 > v34)
            {
                do
                {
                    if (!v73)
                    {
                        v80 = 0;
                        v79 = v67;
                    }
                    else if ((unsigned int)v42 && (int)v34[1] == *(int *)((char *)v34 + v8 + 1) && !(v74 = sub_7cdfc(v34 + 5, v34 + 5 + v8, v9), v75 = arm64g_calculate_condition(130, v74, 5, 0), v75 & 1))
                    {
                        v76 = v74 + 4;
                        v77 = (unsigned int)v67 * 3 + (unsigned int)(!((v73 & 0xffffffff) * 0x100000000) ? 32 : Clz((v73 & 0xffffffff) * 0x100000000)) - 30;
                        v78 = (unsigned int)v76 * 3;
                        v79 = ((int)v78 <= (int)v77 ? v67 : v76);
                        v80 = ((int)v78 <= (int)v77 ? v73 : 1);
                        v81 = ((int)v78 <= (int)v77 ? v72 : v34 + 1);
                        goto LABEL_9fc7c;
                    }
                    else
                    {
                        v79 = v67;
                        v80 = v73;
                    }
                    v81 = v72;
LABEL_9fc7c:
                    v72 = v34 + 1;
                    v17 = 0x3b9ac9ff;
                    v19 = &v18;
                    v18 = &v19;
                    if (v30 != 6)
                    {
                        v82 = v12;
                        v83 = v81;
                        if (v30 == 5)
                        {
                            if (v82 == 6)
                            {
                                v67 = sub_9761c(a0, v72, v9);
                                if (4 > v67)
                                    goto LABEL_9fea8;
                            }
                            else if (v82 == 5)
                            {
                                v67 = sub_b2c6c(a0, v72, v9);
                                if (4 > v67)
                                    goto LABEL_9fea8;
                            }
                            else
                            {
                                v67 = sub_9c6f0(a0, v72, v9);
                                if (4 > v67)
                                    goto LABEL_9fea8;
                            }
                        }
                        else
                        {
                            if (v82 == 6)
                            {
                                v67 = sub_a13fc(a0, v72, v9);
                                if (4 > v67)
                                    goto LABEL_9fea8;
                            }
                            else if (v82 == 5)
                            {
                                v67 = sub_aa624(a0, v72, v9);
                                if (4 > v67)
                                    goto LABEL_9fea8;
                            }
                            else
                            {
                                v67 = sub_a6954(a0, v72, v9);
                                if (v67 < 4)
                                    goto LABEL_9fea8;
                            }
                        }
                    }
                    else
                    {
                        v84 = v12;
                        v83 = v81;
                        if (v84 == 6)
                        {
                            v67 = sub_a0ee4(a0, v72, v9);
                            if (4 > v67)
                                goto LABEL_9fea8;
                        }
                        else if (v84 == 5)
                        {
                            v67 = sub_a4c34(a0, v72, v9);
                            if (4 > v67)
                                goto LABEL_9fea8;
                        }
                        else
                        {
                            v67 = sub_97130(a0, v72, v9);
                            if (4 > v67)
                                goto LABEL_9fea8;
                        }
                    }
                    v73 = v17;
                    if ((int)((unsigned int)(!((v73 & 0xffffffff) * 0x100000000) ? 32 : Clz((v73 & 0xffffffff) * 0x100000000)) + (unsigned int)v67 * 4 - 31) <= (int)((unsigned int)(!((v80 & 0xffffffff) * 0x100000000) ? 32 : Clz((v80 & 0xffffffff) * 0x100000000)) + (unsigned int)v79 * 4 - 27))
                    {
LABEL_9fea8:
                        v67 = v79;
                        v73 = v80;
                        v72 = v83;
                        if (3 >= v80)
                            goto LABEL_9febc;
                        goto LABEL_9fe4c;
                    }
                } while ((v34 = v72, v72 < v10));
            }
            if (v73 > 3)
            {
LABEL_9fe4c:
                if (v72 > v22 && v72 - v73 + 3 > v4)
                {
                    v85 = 2 - v73;
                    v86 = v72;
                    do
                    {
                        v87 = v72;
                        v88 = v86 - 1;
                        if (*((char *)v86 - 1) != *((char *)v87 + v85))
                        {
                            v88 = v87;
                            break;
                        }
                    } while ((v67 += 1, v88 > v22 && (v72 = v88, v86 = v88, v4 < v87 + v85)));
                }
                else
                {
                    v88 = v72;
                }
                v89 = (unsigned int)v73 - 3;
                v72 = v88;
            }
            else
            {
LABEL_9febc:
                v89 = v42;
                v42 = v41;
            }
            v90 = v42;
            v91 = v72 - v22;
            v19 = &v18;
            v18 = &v19;
            v92 = a1;
            if (v72 > v11)
            {
                sub_82208(v92->field_18, v22, v72, v11);
            }
            else
            {
                *v92->field_18 = *(int128_t *)v22;
                v93 = v92->field_18;
                if (v91 > 16)
                {
                    v93[1] = (int128_t)v22[16];
                    if (v91 >= 33)
                    {
                        iter = v93 + 2;
                        v95 = v22 + 48;
                        do
                        {
                            *iter = *(int128_t *)((char *)v95 - 16);
                            v96 = v95 + 2;
                            iter[1] = *v95;
                            iter += 2;
                            v95 = v96;
                        } while (iter < v93 + v91);
                    }
                }
                else
                {
                    v92->field_18 = v93 + v91;
                    v99 = v92->field_8;
                    v100 = a0;
                    v101 = v6;
                    v102 = v5;
                    v99->field_4 = (unsigned short)v91;
                    v99->field_0 = v73;
                    v103 = v67 - 3;
                    v104 = a1;
                    v98 = v7;
                    if (v103 >= 0x10000)
                        goto LABEL_a025c;
LABEL_9ff7c:
                    v99->field_6 = (unsigned short)v103;
                    v104->field_8 = v99 + 1;
                    if (!*(int *)&v100->padding_118[12])
                        goto LABEL_a009c;
                    goto LABEL_9ff90;
                }
            }
            v97 = a1;
            v98 = v7;
            v97->field_18 = v97->field_18 + v91;
            v99 = v97->field_8;
            v100 = a0;
            v101 = v6;
            v102 = v5;
            if (0x10000 > v91)
            {
                v99->field_4 = (unsigned short)v91;
                v99->field_0 = v73;
                v103 = v67 - 3;
                v104 = a1;
                if (0x10000 <= v103)
                    goto LABEL_a025c;
                goto LABEL_9ff7c;
            }
            v105 = a1;
            v106 = (char *)v99 - v105->field_0;
            *(unsigned int *)&v105->field_48 = 1;
            *(unsigned int *)((char *)&v105->field_48 + 4) = v106 >> 3;
            v99->field_4 = (unsigned short)v91;
            v99->field_0 = v73;
            v103 = v67 - 3;
            v104 = a1;
            if (v103 < 0x10000)
                goto LABEL_9ff7c;
LABEL_a025c:
            v107 = (char *)v99 - v104->field_0;
            *(unsigned int *)&v104->field_48 = 2;
            *(unsigned int *)((char *)&v104->field_48 + 4) = v107 >> 3;
            v99->field_6 = (unsigned short)v103;
            v104->field_8 = v99 + 1;
            if (!*(int *)&v100->padding_118[12])
                goto LABEL_a009c;
LABEL_9ff90:
            v108 = v100->field_2c;
            v17 = &v15;
            v16 = &v17;
            v109 = v98 + v108;
            v110 = v10;
            v111 = v110 - v109;
            j = (v110 < v109 ? 0 : 8 <= v111 + 1 ? 8 : v111 + 1);
            if (j + (unsigned int)v108 > (unsigned int)v108)
            {
                v113 = v100->field_34;
                v114 = v100->field_60;
                do
                {
                    v115 = j;
                    if (v30 == 6)
                    {
                        v116 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v98 + v108);
                    }
                    else if (v30 == 5)
                    {
                        v116 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v98 + v108);
                    }
                    else
                    {
                        v117 = (2654435761 * *(int *)((char *)v98 + v108) ^ (unsigned int)v114) >> ((char)(24 - v113) & 31);
                        continue;
                    }
                    v117 = (v116 ^ v114) >> ((char)(56 - v113) & 63);
                    v19 = &v18;
                    v18 = &v19;
                    v102[v108 & 7] = v117;
                    v108 += 1;
                    j = v115 - 1;
                } while (j);
            }
            *(unsigned int *)&v100->padding_118[12] = 0;
LABEL_a009c:
            v34 = v72 + v67;
            i = v10;
            if (i >= v34)
            {
                v24 = v9;
                if ((unsigned int)v90)
                {
                    do
                    {
                        v41 = v89;
                        v89 = v90;
                        v118 = v90 & 0xffffffff;
                        if (*(int *)v34 != *(int *)((char *)v34 - v118))
                        {
                            v22 = v34;
                            v42 = v41;
                            v41 = v89;
                            break;
                        }
                        v119 = sub_7cdfc(v34 + 4, v34 + 4 + -v118, v24);
                        v19 = &v18;
                        v18 = &v19;
                        if (v34 > v11)
                            sub_82208(v104->field_18, v34, v34, v11);
                        else
                            *v104->field_18 = *(int128_t *)v34;
                        v120 = v104->field_8;
                        v120->field_4 = 0;
                        v120->field_0 = 1;
                        v121 = v119 + 1;
                        if (0x10000 <= v121)
                        {
                            v122 = (char *)v120 - v104->field_0;
                            *(unsigned int *)&v104->field_48 = 2;
                            *(unsigned int *)((char *)&v104->field_48 + 4) = v122 >> 3;
                        }
                        v120->field_6 = (unsigned short)v121;
                        v104->field_8 = v120 + 1;
                        v34 += v119 + 4;
                        v90 = v41;
                        v22 = v34;
                        v42 = v89;
                        v123 = arm64g_calculate_condition((v34 <= i ? 3 : 0) | 16, (v34 <= i ? v41 & 0xffffffff : 0x40000000), 0, 0);
                    } while (v123 & 1);
                }
                else
                {
                    v22 = v34;
                    v42 = v89;
                    v41 = v90;
                }
            }
            else
            {
                v22 = v34;
                v42 = v89;
                v41 = v90;
                v24 = v9;
            }
        } while (i > v34);
        v23 = v2;
        v33 = v0;
        v32 = v1;
    }
    v124 = arm64g_calculate_condition(((unsigned int)v42 ? 3 : 0) | 128, ((unsigned int)v42 ? v32 : 0), ((unsigned int)v42 ? v3 : 0), 0);
    v23->field_0 = ((unsigned int)v42 ? (unsigned int)v42 : v3 < v32 ? v32 : 0);
    v23->field_4 = (!(unsigned int)v41 ? (v124 & 1 ? v32 : v3 < v33 ? v33 : 0) : (unsigned int)v41);
    return v24 - v22;
}
