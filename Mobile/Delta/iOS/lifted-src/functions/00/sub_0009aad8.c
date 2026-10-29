/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9aad8..0x9b75c (3204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9aad8_2 {
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
} st_9aad8_2;

typedef struct st_9aad8_0 {
    unsigned long long field_0;
    struct st_9aad8_1 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[44];
    unsigned int field_4c;
} st_9aad8_0;

typedef struct st_9aad8_5 {
    struct st_9aad8_6 *field_0;
} st_9aad8_5;

typedef struct st_9aad8_6 {
    struct st_9aad8_5 *field_0;
} st_9aad8_6;

typedef struct st_9aad8_4 {
    unsigned int field_0;
    unsigned int field_4;
} st_9aad8_4;

typedef struct st_9aad8_1 {
    char padding_0[4];
    unsigned short field_4;
    unsigned short field_6;
} st_9aad8_1;

typedef struct st_9aad8_3 {
    char field_0;
} st_9aad8_3;


char * sub_9aad8(st_9aad8_2 *a0, st_9aad8_0 *a1, st_9aad8_4 *a2, void* a3, unsigned long a4)
{
    st_9aad8_0 *v32;  // x23
    char *v33;  // x19
    void* v42;  // w7
    unsigned long long v132;  // 4351
    unsigned int *v133;  // x9
    void* v134;  // x25
    unsigned short *v135;  // x8
    void* v136;  // x9
    unsigned long long v137;  // x10
    unsigned long v43;  // x20
    unsigned int v44;  // w25
    void* m;  // x26
    unsigned long node;  // x10
    void* v47;  // x11
    unsigned int v48;  // w12
    unsigned long long v49;  // w11
    unsigned long v50;  // x14
    char v51;  // x15
    void* i;  // x27
    char v52;  // x16
    unsigned int *v53;  // x17
    unsigned long long v54;  // w11
    unsigned int v55;  // w3
    unsigned long long v56;  // x3
    unsigned long long v57;  // w11
    unsigned long long v58;  // x3
    unsigned int v59;  // w3
    unsigned long long v60;  // w11
    unsigned long long v61;  // x3
    void* v35;  // x28
    unsigned int v62;  // w3
    void* v63;  // x10
    void* v64;  // x14
    unsigned long v65;  // x24
    unsigned long v66;  // x10
    unsigned int v67;  // w11
    unsigned int v68;  // w13
    unsigned long long v69;  // 4324
    unsigned long long v70;  // x8
    unsigned int v71;  // w10
    unsigned long v36;  // x21
    unsigned long long v72;  // 4360
    unsigned int *v73;  // x9
    unsigned long long v74;  // x25
    unsigned long long v75;  // x0
    void* v76;  // x21
    void* v77;  // x8
    unsigned long v78;  // x8
    void* v79;  // x25
    unsigned long long v80;  // x28
    unsigned long long v81;  // x24
    unsigned long v37;  // x9
    void* v82;  // x27
    void* v83;  // x1
    unsigned int v84;  // w11
    unsigned int v85;  // w10
    unsigned int v86;  // w12
    unsigned long long v87;  // 4333
    unsigned long long v88;  // x8
    unsigned int v89;  // w10
    unsigned long long v90;  // 4370
    unsigned int *v91;  // x9
    char v38;  // x8
    void* v92;  // x0
    unsigned long long v93;  // 4106
    void* v94;  // x8
    void* v95;  // x0
    void* j;  // x9
    void* v97;  // x1
    unsigned int v98;  // w10
    void* v99;  // x9
    void* v100;  // x8
    unsigned long v101;  // x10
    void* v39;  // w10
    void* v102;  // x9
    void* v103;  // x10
    void* v104;  // x9
    unsigned long v105;  // x11
    unsigned long v106;  // x24
    void* v107;  // x26
    uint128_t *v108;  // x9
    uint128_t *iter;  // x9
    unsigned long v110;  // x10
    unsigned long v111;  // x10
    void* v40;  // w6
    unsigned short *v112;  // x8
    unsigned long long v113;  // x9
    void* v114;  // x9
    unsigned int v115;  // w10
    unsigned long v116;  // x8
    void* v117;  // x9
    unsigned int v118;  // w10
    unsigned long long l;  // w9
    char v120;  // x14
    unsigned long v121;  // x12
    void* v41;  // w10
    unsigned long long v122;  // w9
    unsigned long long v123;  // x15
    unsigned int v124;  // w15
    unsigned long v125;  // x15
    void* v126;  // x10
    unsigned int v127;  // w11
    unsigned int v128;  // w13
    unsigned long long v129;  // 4316
    unsigned long long v130;  // x8
    unsigned int v131;  // w10
    unsigned int v0;  // [bp-0x134]
    unsigned int v1;  // [bp-0x130]
    unsigned int v2;  // [bp-0x12c]
    void* v3;  // [bp-0x128]
    st_9aad8_0 *v4;  // [bp-0x120]
    unsigned int *v5;  // [bp-0x118]
    void* v6;  // [bp-0x110]
    unsigned int v7;  // [bp-0x10c]
    unsigned long long v8;  // [bp-0x108]
    unsigned long long v9;  // [bp-0x100]
    void* v10;  // [bp-0xf8]
    void* v11;  // [bp-0xf0]
    void* v12;  // [bp-0xe8]
    void* v13;  // [bp-0xe0]
    void* v14;  // [bp-0xd8]
    void* v15;  // [bp-0xd0]
    unsigned long long v16;  // [bp-0xc8]
    unsigned long v17;  // [bp-0xc0]
    void* v18;  // [bp-0xb8]
    unsigned int v19;  // [bp-0xac]
    void* v20;  // [bp-0xa8]
    void* v21;  // [bp-0xa0]
    void* v22;  // [bp-0x9c]
    st_9aad8_3 **v23;  // [bp-0x98], Other Possible Types: char
    st_9aad8_3 *v24;  // [bp-0x90]
    char v25;  // [bp-0x88]
    st_9aad8_3 **v26;  // [bp-0x88]
    st_9aad8_3 *v27;  // [bp-0x80], Other Possible Types: unsigned long long
    st_9aad8_6 **v28;  // [bp-0x78]
    st_9aad8_6 **v29;  // [bp-0x70]
    char *v30;  // [bp-0x10]
    char v31;  // [bp+0x0]

    v30 = &v31;
    v32 = a1;
    v24 = &v23;
    v23 = &v24;
    v33 = a3 + a4;
    i = v33 - 16;
    v35 = a0->field_8;
    v20 = a0->field_10;
    v36 = a0->field_18;
    v37 = a0->field_1c;
    v38 = a0->field_100;
    v39 = (void*)((unsigned int)(int)a0->field_10c < 6 ? (int)a0->field_10c : 6);
    v40 = (4 < v39 ? v39 : 4);
    v6 = (void*)*(int *)&(a0->padding_104)[1];
    v41 = (v6 < 6 ? v6 : 6);
    v42 = (4 < v41 ? v41 : 4);
    v43 = a2->field_0;
    v44 = a2->field_4;
    *(unsigned int *)((char *)&a0[1].field_8 + 4) = 0;
    v18 = v35 + v36;
    m = (v18 != a3 ? a3 : a3 + 1);
    node = a0->field_2c;
    v29 = &v28;
    v28 = &v29;
    v47 = v35 + node;
    v48 = i - v47;
    v49 = (i < v47 ? 0 : 8 <= v48 + 1 ? 8 : v48 + 1);
    if (v49 + (unsigned int)node > (unsigned int)node)
    {
        v50 = a0->field_60;
        v51 = 24 - a0->field_34;
        v52 = 56 - a0->field_34;
        v53 = &a0->field_40;
        if (4 >= v6)
        {
            do
            {
                v54 = v49;
                if (v40 == 4)
                {
                    v55 = (2654435761 * *(int *)((char *)v35 + node) ^ (unsigned int)v50) >> (v51 & 31);
                }
                else
                {
                    if (v40 == 5)
                        v56 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v35 + node);
                    else
                        v56 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v35 + node);
                    v55 = (v56 ^ v50) >> (v52 & 63);
                }
            } while ((v53[node & 7] = v55, node += 1, v49 = v54 - 1, v54 != 1));
        }
        else if (v6 == 5)
        {
            do
            {
                v57 = v49;
                if (v40 == 6)
                {
                    v58 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v35 + node);
                    goto LABEL_9acb0;
                }
                else if (v40 == 5)
                {
                    v58 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v35 + node);
LABEL_9acb0:
                    v59 = (v58 ^ v50) >> (v52 & 63);
                    continue;
                }
                else
                {
                    v59 = (2654435761 * *(int *)((char *)v35 + node) ^ (unsigned int)v50) >> (v51 & 31);
                }
            } while ((v53[node & 7] = v59, node += 1, v49 = v57 - 1, v57 != 1));
        }
        else
        {
            do
            {
                v60 = v49;
                if (v40 == 6)
                {
                    v61 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v35 + node);
                    goto LABEL_9ad44;
                }
                else if (v40 == 5)
                {
                    v61 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v35 + node);
LABEL_9ad44:
                    v62 = (v61 ^ v50) >> (v52 & 63);
                    continue;
                }
                else
                {
                    v62 = (2654435761 * *(int *)((char *)v35 + node) ^ (unsigned int)v50) >> (v51 & 31);
                }
            } while ((v53[node & 7] = v62, node += 1, v49 = v60 - 1, v60 != 1));
        }
    }
    if (i > m)
    {
        v63 = v20;
        v3 = v63 + v37;
        v15 = v33 - 32;
        v16 = v63 + v36;
        v5 = &a0->field_40;
        v19 = 1 << (v38 & 31);
        v2 = (unsigned int)(1 - v35 - v19);
        v1 = (unsigned int)(1 - v35);
        v0 = (unsigned int)(1 - (v36 + v35));
        v17 = v36;
        v21 = v42;
        v22 = v40;
        v64 = a3;
        v4 = v32;
        v13 = v35;
        v14 = i;
        do
        {
            v65 = m + 1;
            v66 = (unsigned int)(m - v35) + 1;
            v67 = v66 - a0->field_1c;
            v68 = v19;
            v69 = arm64g_calculate_condition((v68 < v67 ? 3 : 0), (v68 < v67 ? a0->field_28 : 0), 0, 0);
            v70 = v66 - v43;
            v71 = v66 - (v69 & 1 ? (unsigned int)(v66 - v68) : a0->field_1c);
            v7 = v44;
            v72 = arm64g_calculate_condition((unsigned int)v43 <= v71 | 128, ((unsigned int)v43 <= v71 ? v70 - v36 & 0xffffffff : 0x20000000), ((unsigned int)v43 <= v71 ? 4 : 0), 0);
            if (!(v72 & 1) && !(v73 = ((unsigned int)v70 < (unsigned int)v36 ? v20 : v35) + v70, *(int *)v65 != *v73))
            {
                v42 = v21;
                v40 = v22;
                v74 = sub_84f30(m + 5, v73 + 1, v33, ((unsigned int)v70 < (unsigned int)v36 ? v16 : v33), v18) + 4;
            }
            else
            {
                v74 = 0;
            }
            v27 = 0x3b9ac9ff;
            v29 = &v28;
            v28 = &v29;
            v12 = v64;
            if (v40 != 6)
            {
                if (v40 == 5)
                {
                    if (v42 == 6)
                    {
                        v75 = sub_a2ea8();
                        v76 = (v74 < v75 ? v75 : v74);
                        if (4 <= v76)
                            goto LABEL_9b034;
                        goto LABEL_9ae1c;
                    }
                    else if (v42 == 5)
                    {
                        v75 = sub_9e96c();
                        v76 = (v74 < v75 ? v75 : v74);
                        if (v76 >= 4)
                            goto LABEL_9b034;
                        goto LABEL_9ae1c;
                    }
                    else
                    {
                        v75 = sub_ad664();
                        v76 = (v74 < v75 ? v75 : v74);
                        if (v76 < 4)
                            goto LABEL_9ae1c;
                    }
                }
                else
                {
                    if (v42 == 6)
                    {
                        v75 = sub_9819c();
                        v76 = (v74 < v75 ? v75 : v74);
                        if (v76 < 4)
                            goto LABEL_9ae1c;
                    }
                    else if (v42 == 5)
                    {
                        v75 = sub_a7fa4();
                        v76 = (v74 < v75 ? v75 : v74);
                        if (v76 >= 4)
                            goto LABEL_9b034;
                        goto LABEL_9ae1c;
                    }
                    else
                    {
                        v75 = sub_aa0f0();
                        v76 = (v74 < v75 ? v75 : v74);
                        if (v76 < 4)
                            goto LABEL_9ae1c;
                    }
                }
            }
            else
            {
                if (v42 == 6)
                {
                    v75 = sub_b0c18();
                    v76 = (v74 < v75 ? v75 : v74);
                    if (v76 >= 4)
                        goto LABEL_9b034;
LABEL_9ae1c:
                    v64 = v12;
                    v77 = m - v64;
                    m = m + (v77 >> 8) + 1;
                    *(unsigned int *)((char *)&a0[1].field_8 + 4) = v77 > 0x8ff;
                    v78 = v43;
                    v36 = v17;
                    v42 = v21;
                    v40 = v22;
                    v44 = v7;
                    continue;
                }
                else if (v42 == 5)
                {
                    v75 = sub_b35e8();
                    v76 = (v74 < v75 ? v75 : v74);
                    if (v76 >= 4)
                        goto LABEL_9b034;
                    goto LABEL_9ae1c;
                }
                else
                {
                    v75 = sub_a0318();
                    v76 = (v74 < v75 ? v75 : v74);
                    if (v76 < 4)
                        goto LABEL_9ae1c;
                }
            }
LABEL_9b034:
            v79 = (v74 < v75 ? m : v65);
            v80 = (v74 < v75 ? v27 : 1);
            v42 = v21;
            v40 = v22;
            if (i > m)
            {
                v81 = 0;
                v11 = v2 + m;
                v9 = v0 + m - v43;
                v10 = v1 + m;
                v8 = v10 - v43;
                v82 = m;
                do
                {
                    v83 = m + v81 + 1;
                    if (v80)
                    {
                        v84 = (unsigned int)v10 + (unsigned int)v81;
                        v85 = v84 + -a0->field_1c;
                        v86 = v19;
                        v87 = arm64g_calculate_condition((v86 < v85 ? 3 : 0), (v86 < v85 ? a0->field_28 : 0), 0, 0);
                        v88 = v8 + v81;
                        v89 = v84 - (v87 & 1 ? (unsigned int)v11 + (unsigned int)v81 : a0->field_1c);
                        v90 = arm64g_calculate_condition((unsigned int)v43 <= v89 | 128, ((unsigned int)v43 <= v89 ? v9 + v81 & 0xffffffff : 0x20000000), ((unsigned int)v43 <= v89 ? 4 : 0), 0);
                        if (!(v90 & 1))
                        {
                            v91 = ((unsigned int)v88 < (unsigned int)v17 ? v20 : v13) + v88;
                            if (*(int *)v83 == *v91)
                            {
                                v92 = sub_84f30(m + v81 + 5, v91 + 1, v33, ((unsigned int)v88 < (unsigned int)v17 ? v16 : v33), v18);
                                v93 = arm64g_calculate_condition(130, v92, 5, 0);
                                if (!(v93 & 1))
                                {
                                    v94 = v92 + 4;
                                    v40 = v22;
                                    v42 = v21;
                                    if ((int)((unsigned int)v94 * 3) > (int)((unsigned int)v76 * 3 + (unsigned int)(!((v80 & 0xffffffff) * 0x100000000) ? 32 : Clz((v80 & 0xffffffff) * 0x100000000)) - 30))
                                    {
                                        v76 = v94;
                                        v80 = 1;
                                        v79 = v83;
                                        v40 = v22;
                                        v42 = v21;
                                    }
                                }
                                else
                                {
                                    v42 = v21;
                                    v40 = v22;
                                }
                            }
                        }
                    }
                    v29 = &v28;
                    v27 = 0x3b9ac9ff;
                    v28 = &v29;
                    if (v40 != 6)
                    {
                        if (v40 == 5)
                        {
                            if (v42 == 6)
                            {
                                v95 = sub_a2ea8();
                                v42 = v21;
                                v40 = v22;
                                if (4 <= v95)
                                    goto LABEL_9b298;
                                else
                                    goto LABEL_9b2ec;
                            }
                            else if (v42 == 5)
                            {
                                v95 = sub_9e96c();
                                v42 = v21;
                                v40 = v22;
                                if (4 <= v95)
                                    goto LABEL_9b298;
                                else
                                    goto LABEL_9b2ec;
                            }
                            else
                            {
                                v95 = sub_ad664();
                                v42 = v21;
                                v40 = v22;
                                if (4 <= v95)
                                    goto LABEL_9b298;
                                else
                                    goto LABEL_9b2ec;
                            }
                        }
                        else
                        {
                            if (v42 == 6)
                            {
                                v95 = sub_9819c();
                                v42 = v21;
                                v40 = v22;
                                if (4 <= v95)
                                    goto LABEL_9b298;
                                else
                                    goto LABEL_9b2ec;
                            }
                            else if (v42 == 5)
                            {
                                v95 = sub_a7fa4();
                                v42 = v21;
                                v40 = v22;
                                if (4 <= v95)
                                    goto LABEL_9b298;
                                else
                                    goto LABEL_9b2ec;
                            }
                            else
                            {
                                v95 = sub_aa0f0();
                                v42 = v21;
                                v40 = v22;
                                if (v95 < 4)
                                    goto LABEL_9b2ec;
                                else
                                    goto LABEL_9b298;
                            }
                        }
                    }
                    else
                    {
                        if (v42 == 6)
                        {
                            v95 = sub_b0c18();
                            v42 = v21;
                            v40 = v22;
                            if (4 <= v95)
                                goto LABEL_9b298;
                            else
                                goto LABEL_9b2ec;
                        }
                        else if (v42 == 5)
                        {
                            v95 = sub_b35e8();
                            v42 = v21;
                            v40 = v22;
                            if (4 <= v95)
                                goto LABEL_9b298;
                            else
                                goto LABEL_9b2ec;
                        }
                        else
                        {
                            v95 = sub_a0318();
                            v42 = v21;
                            v40 = v22;
                            if (4 <= v95)
                                goto LABEL_9b298;
                            else
                                goto LABEL_9b2ec;
                        }
                    }
LABEL_9b298:
                    if ((int)((unsigned int)(!((v27 & 0xffffffff) * 0x100000000) ? 32 : Clz((v27 & 0xffffffff) * 0x100000000)) + (unsigned int)v95 * 4 - 31) <= (int)((unsigned int)(!((v80 & 0xffffffff) * 0x100000000) ? 32 : Clz((v80 & 0xffffffff) * 0x100000000)) + (unsigned int)v76 * 4 - 27))
                        goto LABEL_9b2ec;
                    v79 = v82 + 1;
                    v81 += 1;
                    j = m + v81;
                    v80 = v27;
                    v76 = v95;
                    v82 = v79;
                } while (j < v14);
                v76 = v95;
                v79 = j;
LABEL_9b2ec:
                v32 = v4;
                i = v14;
            }
            v97 = v12;
            if (v80 > 3)
            {
                v98 = (unsigned int)(v79 - (v80 + v13)) + 3;
                v99 = (v98 < (unsigned int)v17 ? v20 : v13);
                v100 = (v98 < (unsigned int)v17 ? v3 : v18);
                if (v79 > v97)
                {
                    v101 = v98;
                    if (v99 + v101 > v100)
                    {
                        v102 = v99 + v101 - 1;
                        v103 = v79 - 1;
                        do
                        {
                            v104 = v102;
                            if (*(char *)v103 != *(char *)v104)
                            {
                                v79 = v103 + 1;
                                goto LABEL_9b39c;
                            }
                        } while ((v76 += 1, v105 = v103 - 1, v103 > v97 && (v103 = v105, v102 = v104 - 1, v100 < v104)));
                        v79 = v105 + 1;
                    }
                }
LABEL_9b39c:
                v106 = (unsigned int)v80 - 3;
            }
            else
            {
                v106 = v43;
                v43 = v7;
            }
            v107 = v79 - v97;
            v29 = &v28;
            v28 = &v29;
            if (v79 > v15)
            {
                sub_82208(v32->field_18);
                v42 = v21;
                v40 = v22;
                goto LABEL_9b3d0;
            }
            else
            {
                *v32->field_18 = *(int128_t *)v97;
                v108 = v32->field_18;
                if (v107 > 16)
                {
                    v108[1] = (int128_t)v97[16];
                    if (v107 >= 33)
                    {
                        iter = v108 + 2;
                        v110 = v97 + 48;
                        do
                        {
                            *iter = *(int128_t *)(v110 - 16);
                            v111 = v110 + 32;
                            iter[1] = *(int128_t *)v110;
                            iter += 2;
                            v110 = v111;
                        } while (iter < v108 + v107);
                    }
LABEL_9b3d0:
                    v32->field_18 = v32->field_18 + v107;
                    v112 = v32->field_8;
                    if (v107 >= 0x10000)
                    {
                        v113 = (char *)v112 - v32->field_0;
                        *(unsigned int *)&v32->padding_20[40] = 1;
                        v32->field_4c = v113 >> 3;
                        goto LABEL_9b45c;
                    }
                }
                else
                {
                    v32->field_18 = v108 + v107;
                    v112 = v32->field_8;
LABEL_9b45c:
                    v112[2] = (unsigned short)v107;
                    *(unsigned int *)v112 = v80;
                    v114 = v76 - 3;
                    if (0x10000 <= v114)
                    {
                        v115 = (char *)v112 - v32->field_0 >> 3;
                        *(unsigned int *)&v32->padding_20[40] = 2;
                        v32->field_4c = v115;
                    }
                    v112[3] = (unsigned short)v114;
                    v32->field_8 = v112 + 4;
                    v35 = v13;
                    if (*(int *)((char *)&a0[1].field_8 + 4))
                    {
                        v116 = a0->field_2c;
                        v27 = &v25;
                        v26 = &v27;
                        v117 = v35 + v116;
                        v118 = i - v117;
                        l = (i < v117 ? 0 : 8 <= v118 + 1 ? 8 : v118 + 1);
                        if (l + (unsigned int)v116 > (unsigned int)v116)
                        {
                            v120 = a0->field_34;
                            v121 = a0->field_60;
                            do
                            {
                                v122 = l;
                                if (v40 == 6)
                                {
                                    v123 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v35 + v116);
                                }
                                else if (v40 == 5)
                                {
                                    v123 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v35 + v116);
                                }
                                else
                                {
                                    v124 = (2654435761 * *(int *)((char *)v35 + v116) ^ (unsigned int)v121) >> ((char)(24 - v120) & 31);
                                    continue;
                                }
                                v124 = (v123 ^ v121) >> ((char)(56 - v120) & 63);
                                v29 = &v28;
                                v28 = &v29;
                                v5[v116 & 7] = v124;
                                v116 += 1;
                                l = v122 - 1;
                            } while (l);
                        }
                        *(unsigned int *)((char *)&a0[1].field_8 + 4) = 0;
                    }
                    m = v79 + v76;
                    if (m > i)
                    {
                        v64 = m;
                        v78 = v106;
                        v44 = v43;
                        v36 = v17;
                    }
                    else
                    {
                        v36 = v17;
                        do
                        {
                            v125 = v106;
                            v106 = v43;
                            v126 = m - v35;
                            v127 = (unsigned int)(v126 - a0->field_1c);
                            v128 = v19;
                            v129 = arm64g_calculate_condition((v128 < v127 ? 3 : 0), (v128 < v127 ? a0->field_28 : 0), 0, 0);
                            v130 = v126 - v43;
                            v131 = (unsigned int)(v126 - (v129 & 1 ? (unsigned int)(v126 - v128) : a0->field_1c));
                            v132 = arm64g_calculate_condition((unsigned int)v43 <= v131 | 128, ((unsigned int)v43 <= v131 ? v130 - v36 & 0xffffffff : 0x20000000), ((unsigned int)v43 <= v131 ? 4 : 0), 0);
                            if (v132 & 1 || (v133 = ((unsigned int)v130 < (unsigned int)v36 ? v20 : v35) + v130, *(int *)m != *v133))
                            {
                                v64 = m;
                                v78 = v125;
                                v44 = v106;
                                break;
                            }
                            v43 = v125;
                            v134 = sub_84f30(m + 4, v133 + 1, v33, ((unsigned int)v130 < (unsigned int)v36 ? v16 : v33), v18);
                            v29 = &v28;
                            v28 = &v29;
                            if (m > v15)
                                sub_82208(v32->field_18, m, m, v15);
                            else
                                *v32->field_18 = *(int128_t *)m;
                            v135 = v32->field_8;
                            v135[2] = 0;
                            *(unsigned int *)v135 = 1;
                            v136 = v134 + 1;
                            v42 = v21;
                            v40 = v22;
                            if (0x10000 <= v136)
                            {
                                v137 = (char *)v135 - v32->field_0;
                                *(unsigned int *)&v32->padding_20[40] = 2;
                                v32->field_4c = v137 >> 3;
                            }
                            v135[3] = (unsigned short)v136;
                            m += v134 + 4;
                            v32->field_8 = v135 + 4;
                            v44 = v43;
                            v64 = m;
                            v78 = v106;
                        } while (m <= i);
                    }
                }
            }
            v43 = v78;
        } while (i > m);
    }
    else
    {
        v78 = v43;
        v64 = a3;
    }
    a2->field_0 = v78;
    a2->field_4 = v44;
    return v33 - v64;
}
