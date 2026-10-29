/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x997f0..0x9a59c (3500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_997f0_4 {
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
} st_997f0_4;

typedef struct st_997f0_3 {
    unsigned long long field_0;
    struct st_997f0_2 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[44];
    unsigned int field_4c;
} st_997f0_3;

typedef struct st_997f0_2 {
    char padding_0[6];
    unsigned short field_6;
} st_997f0_2;

typedef struct st_997f0_0 {
    unsigned int field_0;
    unsigned int field_4;
} st_997f0_0;

typedef struct st_997f0_1 {
    char field_0;
} st_997f0_1;


char * sub_997f0(st_997f0_4 *a0, st_997f0_3 *a1, st_997f0_0 *a2, void* a3, unsigned long a4)
{
    void* v23;  // x23
    st_997f0_0 *v24;  // x5
    unsigned int v33;  // w4
    unsigned long long v123;  // x10
    unsigned long long v124;  // 4175
    unsigned long long v125;  // 4356
    unsigned int v34;  // w7
    void* v35;  // x25
    unsigned int v36;  // w10
    unsigned int v37;  // w8
    unsigned int v38;  // w11
    unsigned long node;  // x8
    unsigned long long v40;  // 4725
    unsigned int v41;  // w9
    unsigned long v42;  // x24
    st_997f0_4 *v25;  // x26
    unsigned long v43;  // x22
    void* v44;  // x9
    unsigned int v45;  // w10
    unsigned long long v46;  // w9
    unsigned long long v47;  // x15
    char v48;  // x16
    char v49;  // x17
    unsigned int *v50;  // x0
    void* v51;  // w1
    unsigned long long v52;  // w9
    void* v26;  // x13
    unsigned long long v53;  // x1
    unsigned int v54;  // w1
    unsigned long long v55;  // w9
    unsigned long long v56;  // x1
    unsigned int v57;  // w1
    unsigned long long v58;  // w9
    unsigned int v59;  // w1
    unsigned long long v60;  // x1
    unsigned long long v61;  // x20
    void* v62;  // x19
    void* v27;  // x19
    void* v63;  // x19
    unsigned long long v64;  // x9
    unsigned long long v65;  // x21
    void* v66;  // w8
    unsigned long long v67;  // x0
    void* iter;  // x28
    void* v69;  // w8
    void* v70;  // w8
    void* v71;  // x8
    void* v72;  // x20
    unsigned long v28;  // x9
    unsigned long long v73;  // x21
    void* v74;  // x28
    unsigned long long v75;  // x21
    void* v76;  // x20
    void* v77;  // x0
    unsigned long long v78;  // 4106
    void* v79;  // x8
    unsigned int v80;  // w9
    unsigned int v81;  // w10
    void* v82;  // w8
    unsigned long long v29;  // x20
    void* v83;  // w8
    void* v84;  // w8
    void* v85;  // x0
    unsigned long long v86;  // 4106
    void* v87;  // x8
    void* v88;  // w9
    st_997f0_3 *v89;  // x28
    unsigned long long v90;  // x9
    void* v91;  // x8
    void* v92;  // x26
    void* v30;  // w8
    void* v93;  // x8
    unsigned long v94;  // x20
    unsigned long v95;  // x21
    void* v96;  // x22
    uint128_t *v97;  // x9
    uint128_t *iter1;  // x9
    uint128_t *v99;  // x10
    uint128_t *v100;  // x10
    st_997f0_2 *v101;  // x8
    void* v102;  // w1
    void* v31;  // w27
    unsigned int *v103;  // x6
    unsigned long long v104;  // x9
    void* v105;  // x9
    unsigned long long v106;  // x10
    void* v107;  // x19
    unsigned long v108;  // x8
    void* v109;  // x9
    void* v110;  // x12
    unsigned int v111;  // w10
    unsigned long long k;  // w9
    void* v32;  // w8
    st_997f0_4 *v113;  // x12
    char v114;  // x14
    unsigned long long v115;  // x12
    unsigned long long v116;  // w9
    unsigned long long v117;  // x15
    unsigned int v118;  // w15
    unsigned long long v119;  // x8
    void* v120;  // x23
    st_997f0_2 *v121;  // x8
    void* v122;  // x9
    unsigned int v0;  // [bp-0x108]
    unsigned int v1;  // [bp-0x104]
    st_997f0_0 *v2;  // [bp-0x100]
    unsigned int v3;  // [bp-0xf4]
    unsigned long long v4;  // [bp-0xf0]
    unsigned int *v5;  // [bp-0xe8]
    void* v6;  // [bp-0xe0]
    void* v7;  // [bp-0xcc]
    unsigned long long v8;  // [bp-0xc8]
    void* v9;  // [bp-0xc0]
    st_997f0_4 *v10;  // [bp-0xb8]
    void* v11;  // [bp-0xac]
    void* i;  // [bp-0xa8]
    char *v13;  // [bp-0xa0]
    st_997f0_1 **v14;  // [bp-0x98], Other Possible Types: char
    st_997f0_1 *v15;  // [bp-0x90]
    char v16;  // [bp-0x88]
    st_997f0_1 **v17;  // [bp-0x88]
    st_997f0_1 *v18;  // [bp-0x80], Other Possible Types: unsigned long, unsigned long long
    st_997f0_1 **v19;  // [bp-0x78], Other Possible Types: char
    st_997f0_1 *v20;  // [bp-0x70]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v23 = a3;
    v24 = a2;
    v25 = a0;
    v15 = &v14;
    v14 = &v15;
    v13 = a3 + a4;
    v26 = v13 - 16;
    v27 = a0->field_8;
    v28 = a0->field_18;
    v29 = v27 + v28;
    v30 = (void*)((unsigned int)(int)a0->field_10c < 6 ? (int)a0->field_10c : 6);
    v31 = (4 < v30 ? v30 : 4);
    v7 = (void*)*(int *)&(a0->padding_104)[1];
    v32 = (v7 < 6 ? v7 : 6);
    v11 = (4 < v32 ? v32 : 4);
    v33 = a2->field_0;
    v34 = a2->field_4;
    v35 = ((unsigned int)v23 != (unsigned int)v29 ? a3 : a3 + 1);
    v36 = v35 - v27;
    v37 = 1 << ((char)a0->field_100 & 31);
    v38 = v36 - v28;
    node = a0->field_2c;
    v40 = arm64g_calculate_condition((v37 < v38 ? 3 : 0), (v37 < v38 ? a0->field_28 : 0), 0, 0);
    v41 = v36 - (v40 & 1 ? v36 - v37 : (unsigned int)v28);
    v42 = (v41 < v34 ? 0 : v34);
    v3 = v41;
    v43 = (v41 < v33 ? 0 : v33);
    *(unsigned int *)&a0->padding_118[12] = 0;
    v20 = &v19;
    v19 = &v20;
    v44 = v27 + node;
    v45 = v26 - v44;
    i = v26;
    v46 = (v26 < v44 ? 0 : 8 <= v45 + 1 ? 8 : v45 + 1);
    if (v46 + (unsigned int)node > (unsigned int)node)
    {
        v47 = v25->field_60;
        v48 = 24 - v25->field_34;
        v49 = 56 - v25->field_34;
        v50 = &v25->field_40;
        v51 = v7;
        if (v51 <= 4)
        {
            do
            {
                v58 = v46;
                if (v31 == 4)
                {
                    v59 = (2654435761 * *(int *)((char *)v27 + node) ^ (unsigned int)v47) >> (v48 & 31);
                }
                else
                {
                    if (v31 == 5)
                        v60 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v27 + node);
                    else
                        v60 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v27 + node);
                    v59 = (v60 ^ v47) >> (v49 & 63);
                }
            } while ((v50[node & 7] = v59, node += 1, v46 = v58 - 1, v58 != 1));
        }
        else if (v51 == 5)
        {
            do
            {
                v52 = v46;
                if (v31 == 6)
                {
                    v53 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v27 + node);
                    goto LABEL_999e4;
                }
                else if (v31 == 5)
                {
                    v53 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v27 + node);
LABEL_999e4:
                    v54 = (v53 ^ v47) >> (v49 & 63);
                    continue;
                }
                else
                {
                    v54 = (2654435761 * *(int *)((char *)v27 + node) ^ (unsigned int)v47) >> (v48 & 31);
                }
            } while ((v50[node & 7] = v54, node += 1, v46 = v52 - 1, v52 != 1));
        }
        else
        {
            do
            {
                v55 = v46;
                if (v31 == 6)
                {
                    v56 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v27 + node);
                    goto LABEL_99a58;
                }
                else if (v31 == 5)
                {
                    v56 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v27 + node);
LABEL_99a58:
                    v57 = (v56 ^ v47) >> (v49 & 63);
                    continue;
                }
                else
                {
                    v57 = (2654435761 * *(int *)((char *)v27 + node) ^ (unsigned int)v47) >> (v48 & 31);
                }
            } while ((v50[node & 7] = v57, node += 1, v46 = v55 - 1, v55 != 1));
        }
    }
    if (i > v35)
    {
        v0 = v34;
        v1 = v33;
        v2 = v24;
        v9 = v13 - 32;
        v10 = v25;
        v4 = v29;
        v5 = &v25->field_40;
        v6 = v27;
        do
        {
            v61 = 0;
            v62 = v35;
            v63 = v62 + 1;
            v64 = v43 & 0xffffffff;
            v65 = -v64;
            if ((unsigned int)v43 && *(int *)((char *)v63 - v64) == (int)v62[1])
                v61 = sub_7cdfc(v35 + 5, v35 + 5 + v65, v13) + 4;
            v18 = 0x3b9ac9ff;
            v20 = &v19;
            v19 = &v20;
            if (v31 == 6)
            {
                v70 = v11;
                if (v70 != 6)
                {
                    if (v70 == 5)
                    {
                        v67 = sub_a4c34();
                        iter = (v61 < v67 ? v67 : v61);
                        if (iter >= 4)
                            goto LABEL_99cdc;
                        goto LABEL_99af8;
                    }
                    else
                    {
                        v67 = sub_97130();
                        iter = (v61 < v67 ? v67 : v61);
                        if (iter < 4)
                            goto LABEL_99af8;
                    }
                }
                else
                {
                    v67 = sub_a0ee4(v25, v35, v13, &v18);
                    iter = (v61 < v67 ? v67 : v61);
                    if (iter >= 4)
                        goto LABEL_99cdc;
LABEL_99af8:
                    v71 = v35 - v23;
                    v35 = v35 + (v71 >> 8) + 1;
                    *(unsigned int *)&v25->padding_118[12] = v71 > 0x7ff;
                    continue;
                }
            }
            else if (v31 == 5)
            {
                v66 = v11;
                if (v66 == 6)
                {
                    v67 = sub_9761c(v25, v35, v13, &v18);
                    iter = (v61 < v67 ? v67 : v61);
                    if (4 <= iter)
                        goto LABEL_99cdc;
                    goto LABEL_99af8;
                }
                else if (v66 == 5)
                {
                    v67 = sub_b2c6c();
                    iter = (v61 < v67 ? v67 : v61);
                    if (iter >= 4)
                        goto LABEL_99cdc;
                    goto LABEL_99af8;
                }
                else
                {
                    v67 = sub_9c6f0();
                    iter = (v61 < v67 ? v67 : v61);
                    if (iter < 4)
                        goto LABEL_99af8;
                }
            }
            else
            {
                v69 = v11;
                if (v69 == 6)
                {
                    v67 = sub_a13fc(v25, v35, v13, &v18);
                    iter = (v61 < v67 ? v67 : v61);
                    if (iter < 4)
                        goto LABEL_99af8;
                }
                else if (v69 == 5)
                {
                    v67 = sub_aa624();
                    iter = (v61 < v67 ? v67 : v61);
                    if (iter >= 4)
                        goto LABEL_99cdc;
                    goto LABEL_99af8;
                }
                else
                {
                    v67 = sub_a6954();
                    iter = (v61 < v67 ? v67 : v61);
                    if (iter < 4)
                        goto LABEL_99af8;
                }
            }
LABEL_99cdc:
            v8 = v65;
            v72 = (v61 < v67 ? v35 : v63);
            v73 = (v61 < v67 ? v18 : 1);
            v74 = iter;
            v75 = v73;
            v76 = v72;
            if (v35 < i)
            {
                do
                {
                    v72 = v35 + 1;
                    if (v75 && (unsigned int)v43 && *(int *)v72 == *(int *)((char *)v72 + v8))
                    {
                        v77 = sub_7cdfc(v35 + 5, v35 + 5 + v8, v13);
                        v78 = arm64g_calculate_condition(130, v77, 5, 0);
                        if (!(v78 & 1))
                        {
                            v79 = v77 + 4;
                            v80 = (unsigned int)v74 * 3 + (unsigned int)(!((v75 & 0xffffffff) * 0x100000000) ? 32 : Clz((v75 & 0xffffffff) * 0x100000000)) - 30;
                            v81 = (unsigned int)v79 * 3;
                            v74 = ((int)v81 <= (int)v80 ? v74 : v79);
                            v75 = ((int)v81 <= (int)v80 ? v75 : 1);
                            v76 = ((int)v81 <= (int)v80 ? v76 : v35 + 1);
                        }
                    }
                    v18 = 0x3b9ac9ff;
                    v20 = &v19;
                    v19 = &v20;
                    if (v31 == 6)
                    {
                        v84 = v11;
                        if (v84 != 6)
                        {
                            if (v84 == 5)
                            {
                                iter = sub_a4c34(v10, v72, v13);
                                if (4 > iter)
                                    goto LABEL_99fb8;
                            }
                            else
                            {
                                iter = sub_97130(v10, v72, v13);
                                if (4 > iter)
                                    goto LABEL_99fb8;
                            }
                        }
                        else
                        {
                            iter = sub_a0ee4(v10, v72, v13);
                            if (4 > iter)
                                goto LABEL_99fb8;
                        }
                    }
                    else if (v31 == 5)
                    {
                        v82 = v11;
                        if (v82 == 6)
                        {
                            iter = sub_9761c(v10, v72, v13);
                            if (4 > iter)
                                goto LABEL_99fb8;
                        }
                        else if (v82 == 5)
                        {
                            iter = sub_b2c6c(v10, v72, v13);
                            if (4 > iter)
                                goto LABEL_99fb8;
                        }
                        else
                        {
                            iter = sub_9c6f0(v10, v72, v13);
                            if (4 > iter)
                                goto LABEL_99fb8;
                        }
                    }
                    else
                    {
                        v83 = v11;
                        if (v83 == 6)
                        {
                            iter = sub_a13fc(v10, v72, v13);
                            if (4 > iter)
                                goto LABEL_99fb8;
                        }
                        else if (v83 == 5)
                        {
                            iter = sub_aa624(v10, v72, v13);
                            if (4 > iter)
                                goto LABEL_99fb8;
                        }
                        else
                        {
                            iter = sub_a6954(v10, v72, v13);
                            if (iter < 4)
                                goto LABEL_99fb8;
                        }
                    }
                    v73 = v18;
                    if ((int)((unsigned int)(!((v75 & 0xffffffff) * 0x100000000) ? 32 : Clz((v75 & 0xffffffff) * 0x100000000)) + (unsigned int)v74 * 4 - 27) < (int)((unsigned int)(!((v73 & 0xffffffff) * 0x100000000) ? 32 : Clz((v73 & 0xffffffff) * 0x100000000)) + (unsigned int)iter * 4 - 31))
                        continue;
LABEL_99fb8:
                    if (i > v72)
                    {
                        v72 = v35 + 2;
                        if (v75 && (unsigned int)v43 && *(int *)v72 == *(int *)((char *)v72 + v8) && !(v85 = sub_7cdfc(v35 + 6, v35 + 6 + v8, v13), v86 = arm64g_calculate_condition(130, v85, 5, 0), v86 & 1))
                        {
                            v87 = v85 + 4;
                            v88 = v11;
                            if ((int)((unsigned int)v87 * 4) > (int)((unsigned int)(!((v75 & 0xffffffff) * 0x100000000) ? 32 : Clz((v75 & 0xffffffff) * 0x100000000)) + (unsigned int)v74 * 4 - 30))
                            {
                                v74 = v87;
                                v75 = 1;
                                v76 = v72;
                                v88 = v11;
                            }
                        }
                        else
                        {
                            v88 = v11;
                        }
                        v18 = 0x3b9ac9ff;
                        v20 = &v19;
                        v19 = &v20;
                        if (v31 != 6)
                        {
                            if (v31 == 5)
                            {
                                if (v88 == 6)
                                {
                                    iter = sub_9761c(v10, v72, v13);
                                    if (iter < 4)
                                        goto LABEL_9a168;
                                }
                                else if (v88 == 5)
                                {
                                    iter = sub_b2c6c(v10, v72, v13);
                                    if (4 > iter)
                                        goto LABEL_9a168;
                                }
                                else
                                {
                                    iter = sub_9c6f0(v10, v72, v13);
                                    if (4 > iter)
                                        goto LABEL_9a168;
                                }
                            }
                            else
                            {
                                if (v88 == 6)
                                {
                                    iter = sub_a13fc(v10, v72, v13);
                                    if (4 > iter)
                                        goto LABEL_9a168;
                                }
                                else if (v88 == 5)
                                {
                                    iter = sub_aa624(v10, v72, v13);
                                    if (4 > iter)
                                        goto LABEL_9a168;
                                }
                                else
                                {
                                    iter = sub_a6954(v10, v72, v13);
                                    if (4 > iter)
                                        goto LABEL_9a168;
                                }
                            }
                        }
                        else
                        {
                            if (v88 == 6)
                            {
                                iter = sub_a0ee4(v10, v72, v13);
                                if (4 > iter)
                                    goto LABEL_9a168;
                            }
                            else if (v88 == 5)
                            {
                                iter = sub_a4c34(v10, v72, v13);
                                if (4 > iter)
                                    goto LABEL_9a168;
                            }
                            else
                            {
                                iter = sub_97130(v10, v72, v13);
                                if (4 > iter)
                                    goto LABEL_9a168;
                            }
                        }
                        v73 = v18;
                        if ((int)((unsigned int)(!((v73 & 0xffffffff) * 0x100000000) ? 32 : Clz((v73 & 0xffffffff) * 0x100000000)) + (unsigned int)iter * 4 - 31) <= (int)((unsigned int)(!((v75 & 0xffffffff) * 0x100000000) ? 32 : Clz((v75 & 0xffffffff) * 0x100000000)) + (unsigned int)v74 * 4 - 24))
                            goto LABEL_9a168;
                    }
                    else
                    {
LABEL_9a168:
                        iter = v74;
                        v73 = v75;
                        v72 = v76;
                        v89 = a1;
                        if (3 >= v75)
                            goto LABEL_9a180;
                        goto LABEL_99d14;
                    }
                    v76 = v72;
                    v75 = v73;
                    v74 = iter;
                    v35 = v72;
                } while (i > v72);
            }
            v89 = a1;
            if (v73 > 3)
            {
LABEL_99d14:
                if (v72 > v23 && v72 - v73 + 3 > v4)
                {
                    v90 = 2 - v73;
                    v91 = v72;
                    do
                    {
                        v92 = v72;
                        v93 = v91 - 1;
                        if (*((char *)v91 - 1) != *((char *)v72 + v90))
                            goto LABEL_9a18c;
                    } while ((iter += 1, v93 > v23 && (v72 = v93, v91 = v93, v4 < v92 + v90)));
                }
                else
                {
LABEL_9a18c:
                    v93 = v72;
                }
                v94 = (unsigned int)v73 - 3;
                v72 = v93;
            }
            else
            {
LABEL_9a180:
                v94 = v43;
                v43 = v42;
            }
            v95 = v43;
            v96 = v72 - v23;
            v20 = &v19;
            v19 = &v20;
            if (v72 > v9)
            {
                sub_82208(v89->field_18, v23, v72);
                goto LABEL_9a1dc;
            }
            else
            {
                *v89->field_18 = *(int128_t *)v23;
                v97 = v89->field_18;
                if (v96 > 16)
                {
                    v97[1] = (int128_t)v23[16];
                    if (v96 >= 33)
                    {
                        iter1 = v97 + 2;
                        v99 = v23 + 48;
                        do
                        {
                            *iter1 = *(int128_t *)((char *)v99 - 16);
                            v100 = v99 + 2;
                            iter1[1] = *v99;
                            iter1 += 2;
                            v99 = v100;
                        } while (iter1 < v97 + v96);
                    }
LABEL_9a1dc:
                    v89->field_18 = v89->field_18 + v96;
                    v101 = v89->field_8;
                    v102 = v7;
                    v103 = v5;
                    if (v96 >= 0x10000)
                    {
                        v104 = &v101->padding_0[-1 * v89->field_0];
                        *(unsigned int *)&v89->padding_20[40] = 1;
                        v89->field_4c = v104 >> 3;
                        v102 = v7;
                        v103 = v5;
                        goto LABEL_9a2bc;
                    }
                }
                else
                {
                    v89->field_18 = v97 + v96;
                    v101 = v89->field_8;
                    v102 = v7;
                    v103 = v5;
LABEL_9a2bc:
                    *(unsigned short *)&v101->padding_0[4] = (unsigned short)v96;
                    *(unsigned int *)&v101->padding_0[0] = v73;
                    v105 = iter - 3;
                    if (0x10000 <= v105)
                    {
                        v106 = &v101->padding_0[-1 * v89->field_0];
                        *(unsigned int *)&v89->padding_20[40] = 2;
                        v89->field_4c = v106 >> 3;
                    }
                    v101->field_6 = (unsigned short)v105;
                    v89->field_8 = &v101[1];
                    v107 = v6;
                    if (*(int *)&v10->padding_118[12])
                    {
                        v108 = v10->field_2c;
                        v18 = &v16;
                        v17 = &v18;
                        v109 = v107 + v108;
                        v110 = i;
                        v111 = v110 - v109;
                        k = (v110 < v109 ? 0 : 8 <= v111 + 1 ? 8 : v111 + 1);
                        if (k + (unsigned int)v108 > (unsigned int)v108)
                        {
                            v113 = v10;
                            v114 = v113->field_34;
                            v115 = v113->field_60;
                            do
                            {
                                v116 = k;
                                if (v31 == 6)
                                {
                                    v117 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v107 + v108);
                                }
                                else if (v31 == 5)
                                {
                                    v117 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v107 + v108);
                                }
                                else
                                {
                                    v118 = (2654435761 * *(int *)((char *)v107 + v108) ^ (unsigned int)v115) >> ((char)(24 - v114) & 31);
                                    continue;
                                }
                                v118 = (v117 ^ v115) >> ((char)(56 - v114) & 63);
                                v20 = &v19;
                                v19 = &v20;
                                v103[v108 & 7] = v118;
                                v108 += 1;
                                k = v116 - 1;
                            } while (k);
                        }
                        *(unsigned int *)&v10->padding_118[12] = 0;
                    }
                    v35 = v72 + iter;
                    if (i < v35)
                    {
                        v23 = v35;
                        v43 = v94;
                        v42 = v95;
                        v25 = v10;
                    }
                    else if ((unsigned int)v95)
                    {
                        do
                        {
                            v42 = v94;
                            v94 = v95;
                            v119 = v95 & 0xffffffff;
                            if (*(int *)v35 != *(int *)((char *)v35 - v119))
                            {
                                v23 = v35;
                                v43 = v42;
                                v42 = v94;
                                v25 = v10;
                                break;
                            }
                            v120 = sub_7cdfc(v35 + 4, v35 + 4 + -v119, v13);
                            v20 = &v19;
                            v19 = &v20;
                            if (v35 > v9)
                                sub_82208(v89->field_18, v35, v35, v9);
                            else
                                *v89->field_18 = *(int128_t *)v35;
                            v121 = v89->field_8;
                            *(unsigned short *)&v121->padding_0[4] = 0;
                            *(unsigned int *)&v121->padding_0[0] = 1;
                            v122 = v120 + 1;
                            if (0x10000 <= v122)
                            {
                                v123 = &v121->padding_0[-1 * v89->field_0];
                                *(unsigned int *)&v89->padding_20[40] = 2;
                                v89->field_4c = v123 >> 3;
                            }
                            v121->field_6 = (unsigned short)v122;
                            v89->field_8 = &v121[1];
                            v35 += v120 + 4;
                            v95 = v42;
                            v23 = v35;
                            v43 = v94;
                            v124 = arm64g_calculate_condition((v35 <= i ? 3 : 0) | 16, (v35 <= i ? v42 & 0xffffffff : 0x40000000), 0, 0);
                            v25 = v10;
                        } while (v124 & 1);
                    }
                    else
                    {
                        v23 = v35;
                        v43 = v94;
                        v42 = v95;
                        v25 = v10;
                    }
                }
            }
        } while (i > v35);
        v24 = v2;
        v34 = v0;
        v33 = v1;
    }
    v125 = arm64g_calculate_condition(((unsigned int)v43 ? 3 : 0) | 128, ((unsigned int)v43 ? v33 : 0), ((unsigned int)v43 ? v3 : 0), 0);
    v24->field_0 = ((unsigned int)v43 ? (unsigned int)v43 : v3 < v33 ? v33 : 0);
    v24->field_4 = (!(unsigned int)v42 ? (v125 & 1 ? v33 : v3 < v34 ? v34 : 0) : (unsigned int)v42);
    return v13 - v23;
}
