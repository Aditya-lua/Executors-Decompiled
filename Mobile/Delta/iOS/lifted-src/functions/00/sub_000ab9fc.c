/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab9fc..0xac69c (3232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab9fc_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_ab9fc_0;

typedef struct st_ab9fc_1 {
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
    struct st_ab9fc_0 *field_f8;
    char padding_100[12];
    void* field_10c;
    void* field_110;
} st_ab9fc_1;

typedef struct st_ab9fc_6 {
    struct st_ab9fc_7 *field_0;
} st_ab9fc_6;

typedef struct st_ab9fc_7 {
    struct st_ab9fc_6 *field_0;
} st_ab9fc_7;

typedef struct st_ab9fc_5 {
    unsigned int field_0;
    unsigned int field_4;
} st_ab9fc_5;

typedef struct st_ab9fc_8 {
    unsigned int field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_ab9fc_8;

typedef struct st_ab9fc_3 {
    unsigned long long field_0;
    struct st_ab9fc_2 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned long long field_48;
    unsigned int field_4c;
} st_ab9fc_3;

typedef struct st_ab9fc_4 {
    char field_0;
} st_ab9fc_4;

typedef struct st_ab9fc_2 {
    unsigned long long field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_ab9fc_2;


char * sub_ab9fc(st_ab9fc_1 *a0, st_ab9fc_3 *a1, st_ab9fc_5 *a2, void* a3, unsigned long a4)
{
    st_ab9fc_1 *v33;  // x24
    void* i;  // x22
    st_ab9fc_0 *v43;  // x8
    unsigned long long v44;  // 4585
    void* l;  // x26
    unsigned long node;  // x8
    void* v47;  // x9
    unsigned int v48;  // w10
    unsigned long long v49;  // w9
    unsigned long v50;  // x12
    char v51;  // x13
    char v52;  // x14
    void* v35;  // x19
    unsigned int *v53;  // x15
    unsigned long long v54;  // w9
    unsigned int v55;  // w1
    unsigned long long v56;  // x1
    unsigned long long v57;  // w9
    unsigned long long v58;  // x1
    unsigned int v59;  // w1
    unsigned long long v60;  // w9
    unsigned long long v61;  // x1
    unsigned int v62;  // w1
    unsigned long v36;  // x23
    unsigned long v63;  // x9
    unsigned int v64;  // w10
    void* v65;  // x12
    unsigned int v66;  // w9
    unsigned long v67;  // x20
    unsigned long v68;  // x8
    unsigned int *v69;  // x9
    unsigned long long v70;  // 4222
    unsigned long long v71;  // x21
    unsigned long long v72;  // x0
    void* v37;  // w8
    void* v73;  // x23
    void* v74;  // x8
    void* v75;  // x22
    unsigned long long v76;  // x20
    unsigned long long v77;  // x21
    unsigned long v78;  // x9
    void* v79;  // x27
    void* v80;  // x1
    unsigned long v81;  // x8
    unsigned int *v82;  // x9
    void* v38;  // w28
    unsigned long long v83;  // 4228
    void* v84;  // x0
    unsigned long long v85;  // 4106
    void* v86;  // x8
    void* v87;  // x0
    unsigned long v88;  // x27
    void* v89;  // x1
    unsigned int v90;  // w10
    char *v91;  // x8
    void* v92;  // x9
    void* v39;  // w8
    unsigned long v93;  // x11
    void* v94;  // x10
    char *v95;  // x9
    char *v96;  // x9
    unsigned long v97;  // x11
    unsigned long v98;  // x21
    void* v99;  // x25
    st_ab9fc_3 *v100;  // x10
    uint128_t *v101;  // x9
    uint128_t *iter;  // x9
    void* v40;  // w5
    unsigned long v103;  // x10
    unsigned long v104;  // x10
    st_ab9fc_3 *v105;  // x9
    st_ab9fc_8 *v106;  // x8
    st_ab9fc_3 *v107;  // x10
    unsigned long long v108;  // x9
    void* v109;  // x9
    st_ab9fc_3 *v110;  // x20
    unsigned int v111;  // w10
    unsigned long v112;  // x8
    unsigned int v41;  // w7
    void* v113;  // x9
    unsigned int v114;  // w10
    unsigned long long k;  // w9
    char v116;  // x14
    unsigned long v117;  // x12
    unsigned long long v118;  // w9
    unsigned long long v119;  // x15
    unsigned int v120;  // w15
    unsigned long long v121;  // x8
    unsigned long long v122;  // 4186
    unsigned long v42;  // x25
    unsigned int *v123;  // x9
    void* v124;  // x24
    st_ab9fc_2 *v125;  // x8
    void* v126;  // x9
    unsigned long long v127;  // x10
    unsigned int v0;  // [bp-0x154]
    unsigned int v1;  // [bp-0x150]
    unsigned int v2;  // [bp-0x14c]
    unsigned long v3;  // [bp-0x148]
    char *v4;  // [bp-0x140]
    unsigned int *v5;  // [bp-0x138]
    void* v6;  // [bp-0x12c]
    void* v7;  // [bp-0x128]
    unsigned int v8;  // [bp-0x11c]
    void* v9;  // [bp-0x110]
    unsigned int v10;  // [bp-0x104]
    unsigned long long v11;  // [bp-0x100]
    unsigned long long v12;  // [bp-0xf8]
    unsigned long long v13;  // [bp-0xf0]
    unsigned long long v14;  // [bp-0xe8]
    void* v15;  // [bp-0xe0]
    void* v16;  // [bp-0xd8]
    st_ab9fc_1 *v17;  // [bp-0xd0]
    unsigned long v18;  // [bp-0xc8]
    char *v19;  // [bp-0xc0]
    unsigned long v20;  // [bp-0xb8]
    unsigned long v21;  // [bp-0xb0]
    char *v22;  // [bp-0xa8]
    void* v23;  // [bp-0x9c]
    st_ab9fc_4 **v24;  // [bp-0x98], Other Possible Types: char
    st_ab9fc_4 *v25;  // [bp-0x90]
    char v26;  // [bp-0x88]
    st_ab9fc_4 **v27;  // [bp-0x88]
    st_ab9fc_4 *v28;  // [bp-0x80], Other Possible Types: unsigned long long
    st_ab9fc_7 **v29;  // [bp-0x78]
    st_ab9fc_7 **v30;  // [bp-0x70]
    char *v31;  // [bp-0x10]
    char v32;  // [bp+0x0]

    v31 = &v32;
    v33 = a0;
    v25 = &v24;
    v24 = &v25;
    v22 = a3 + a4;
    i = v22 - 16;
    v35 = a0->field_8;
    v36 = a0->field_18;
    v37 = (void*)((unsigned int)(int)a0->field_10c < 6 ? (int)a0->field_10c : 6);
    v38 = (4 < v37 ? v37 : 4);
    v6 = (void*)*(int *)&(a0->padding_100)[1];
    v39 = (v6 < 6 ? v6 : 6);
    v40 = (4 < v39 ? v39 : 4);
    v41 = a2->field_0;
    v42 = a2->field_4;
    v43 = a0->field_f8;
    v19 = v35 + v36;
    v20 = v43->field_8;
    v4 = v43->field_8 + v43->field_18;
    v18 = v43->field_0;
    v44 = arm64g_calculate_condition(0x11, a3 - v19 - v4 & 0xffffffff, v43->field_0 & 0xffffffff, 0);
    l = (v44 & 1 ? a3 : a3 + 1);
    *(unsigned int *)((char *)&a0[1].field_8 + 4) = 0;
    node = a0->field_2c;
    v30 = &v29;
    v29 = &v30;
    v47 = v35 + node;
    v48 = i - v47;
    v49 = (i < v47 ? 0 : 8 <= v48 + 1 ? 8 : v48 + 1);
    if (v49 + (unsigned int)node > (unsigned int)node)
    {
        v50 = v33->field_60;
        v51 = 24 - v33->field_34;
        v52 = 56 - v33->field_34;
        v53 = &v33->field_40;
        if (4 >= v6)
        {
            do
            {
                v54 = v49;
                if (v38 == 4)
                {
                    v55 = (2654435761 * *(int *)((char *)v35 + node) ^ (unsigned int)v50) >> (v51 & 31);
                }
                else
                {
                    if (v38 == 5)
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
                if (v38 == 6)
                {
                    v58 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v35 + node);
                    goto LABEL_abbf0;
                }
                else if (v38 == 5)
                {
                    v58 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v35 + node);
LABEL_abbf0:
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
                if (v38 == 6)
                {
                    v61 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v35 + node);
                    goto LABEL_abc84;
                }
                else if (v38 == 5)
                {
                    v61 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v35 + node);
LABEL_abc84:
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
    if (i > l)
    {
        v63 = v20;
        v64 = v18;
        v16 = v22 - 32;
        v5 = &v33->field_40;
        v65 = a3;
        v3 = a4 + a3 - 16;
        v2 = (unsigned int)(1 - (v36 + v35));
        v1 = -(unsigned int)v35;
        v0 = (unsigned int)(v64 - v36 - v63 - v35) + 1;
        v8 = (unsigned int)v36 + (unsigned int)(v63 - v64);
        v15 = v63 - v8;
        v17 = v33;
        v21 = v36;
        v23 = v40;
        v66 = v41;
        v7 = i;
        do
        {
            v10 = v66;
            v67 = l + 1;
            v68 = (unsigned int)(l - v35 - v66) + 1;
            v69 = ((unsigned int)v68 < (unsigned int)v36 ? v20 + v68 - v8 : v35 + v68);
            v70 = arm64g_calculate_condition(129, v68 - v36 & 0xffffffff, 4, 0);
            if (!(v70 & 1) && *v69 == *(int *)v67)
            {
                v40 = v23;
                v71 = sub_84f30(l + 5, v69 + 1, v22, ((unsigned int)v68 < (unsigned int)v36 ? v18 : v22), v19) + 4;
            }
            else
            {
                v71 = 0;
            }
            v28 = 0x3b9ac9ff;
            v30 = &v29;
            v29 = &v30;
            v9 = v65;
            if (v38 != 6)
            {
                if (v38 == 5)
                {
                    if (v40 == 6)
                    {
                        v72 = sub_b3b38();
                        v73 = (v71 < v72 ? v72 : v71);
                        if (4 <= v73)
                            goto LABEL_abf90;
                        goto LABEL_abd80;
                    }
                    else if (v40 == 5)
                    {
                        v72 = sub_a0850();
                        v73 = (v71 < v72 ? v72 : v71);
                        if (v73 >= 4)
                            goto LABEL_abf90;
                        goto LABEL_abd80;
                    }
                    else
                    {
                        v72 = sub_96ac4();
                        v73 = (v71 < v72 ? v72 : v71);
                        if (v73 < 4)
                            goto LABEL_abd80;
                    }
                }
                else
                {
                    if (v40 == 6)
                    {
                        v72 = sub_af450();
                        v73 = (v71 < v72 ? v72 : v71);
                        if (v73 < 4)
                            goto LABEL_abd80;
                    }
                    else if (v40 == 5)
                    {
                        v72 = sub_9cbdc();
                        v73 = (v71 < v72 ? v72 : v71);
                        if (v73 >= 4)
                            goto LABEL_abf90;
                        goto LABEL_abd80;
                    }
                    else
                    {
                        v72 = sub_97b34();
                        v73 = (v71 < v72 ? v72 : v71);
                        if (v73 < 4)
                            goto LABEL_abd80;
                    }
                }
            }
            else
            {
                if (v40 == 6)
                {
                    v72 = sub_acfd0();
                    v73 = (v71 < v72 ? v72 : v71);
                    if (v73 >= 4)
                        goto LABEL_abf90;
LABEL_abd80:
                    v65 = v9;
                    v74 = l - v65;
                    l = l + (v74 >> 8) + 1;
                    *(unsigned int *)((char *)&v33[1].field_8 + 4) = v74 > 0x7ff;
                    v36 = v21;
                    v40 = v23;
                    v66 = v10;
                    continue;
                }
                else if (v40 == 5)
                {
                    v72 = sub_ac69c();
                    v73 = (v71 < v72 ? v72 : v71);
                    if (v73 >= 4)
                        goto LABEL_abf90;
                    goto LABEL_abd80;
                }
                else
                {
                    v72 = sub_952e0();
                    v73 = (v71 < v72 ? v72 : v71);
                    if (v73 < 4)
                        goto LABEL_abd80;
                }
            }
LABEL_abf90:
            v75 = (v71 < v72 ? l : v67);
            v76 = (v71 < v72 ? v28 : 1);
            v40 = v23;
            if (i > l)
            {
                v77 = 0;
                v11 = v3 - l;
                v78 = v10;
                v14 = v2 + l - v78;
                v13 = v1 + l - v78;
                v12 = v0 + l - v78;
                v79 = l;
                do
                {
                    v80 = l + v77 + 1;
                    v81 = (unsigned int)v13 + (unsigned int)v77 + 1;
                    v82 = ((unsigned int)v81 < (unsigned int)v21 ? v20 + v12 + v77 : v35 + v81);
                    v83 = arm64g_calculate_condition(129, v14 + v77 & 0xffffffff, 4, 0);
                    if (!(v83 & 1) && *v82 == *(int *)v80)
                    {
                        v84 = sub_84f30(l + v77 + 5, v82 + 1, v22, ((unsigned int)v81 < (unsigned int)v21 ? v18 : v22), v19);
                        v85 = arm64g_calculate_condition(130, v84, 5, 0);
                        if (!(v85 & 1))
                        {
                            v86 = v84 + 4;
                            v33 = v17;
                            v40 = v23;
                            if ((int)((unsigned int)v86 * 3) > (int)((unsigned int)v73 * 3 + (unsigned int)(!((v76 & 0xffffffff) * 0x100000000) ? 32 : Clz((v76 & 0xffffffff) * 0x100000000)) - 30))
                            {
                                v73 = v86;
                                v76 = 1;
                                v75 = v80;
                                v33 = v17;
                                v40 = v23;
                            }
                        }
                        else
                        {
                            v33 = v17;
                            v40 = v23;
                        }
                    }
                    v28 = 0x3b9ac9ff;
                    v30 = &v29;
                    v29 = &v30;
                    if (v38 != 6)
                    {
                        if (v38 == 5)
                        {
                            if (v40 == 6)
                            {
                                v87 = sub_b3b38();
                                v40 = v23;
                                if (4 <= v87)
                                    goto LABEL_ac1f4;
                                else
                                    goto LABEL_ac244;
                            }
                            else if (v40 == 5)
                            {
                                v87 = sub_a0850();
                                v40 = v23;
                                if (4 <= v87)
                                    goto LABEL_ac1f4;
                                else
                                    goto LABEL_ac244;
                            }
                            else
                            {
                                v87 = sub_96ac4();
                                v40 = v23;
                                if (4 <= v87)
                                    goto LABEL_ac1f4;
                                else
                                    goto LABEL_ac244;
                            }
                        }
                        else
                        {
                            if (v40 == 6)
                            {
                                v87 = sub_af450();
                                v40 = v23;
                                if (4 <= v87)
                                    goto LABEL_ac1f4;
                                else
                                    goto LABEL_ac244;
                            }
                            else if (v40 == 5)
                            {
                                v87 = sub_9cbdc();
                                v40 = v23;
                                if (4 <= v87)
                                    goto LABEL_ac1f4;
                                else
                                    goto LABEL_ac244;
                            }
                            else
                            {
                                v87 = sub_97b34();
                                v40 = v23;
                                if (v87 < 4)
                                    goto LABEL_ac244;
                                else
                                    goto LABEL_ac1f4;
                            }
                        }
                    }
                    else
                    {
                        if (v40 == 6)
                        {
                            v87 = sub_acfd0();
                            v40 = v23;
                            if (4 <= v87)
                                goto LABEL_ac1f4;
                            else
                                goto LABEL_ac244;
                        }
                        else if (v40 == 5)
                        {
                            v87 = sub_ac69c();
                            v40 = v23;
                            if (4 <= v87)
                                goto LABEL_ac1f4;
                            else
                                goto LABEL_ac244;
                        }
                        else
                        {
                            v87 = sub_952e0();
                            v40 = v23;
                            if (4 <= v87)
                                goto LABEL_ac1f4;
                            else
                                goto LABEL_ac244;
                        }
                    }
LABEL_ac1f4:
                    if ((int)((unsigned int)(!((v28 & 0xffffffff) * 0x100000000) ? 32 : Clz((v28 & 0xffffffff) * 0x100000000)) + (unsigned int)v87 * 4 - 31) <= (int)((unsigned int)(!((v76 & 0xffffffff) * 0x100000000) ? 32 : Clz((v76 & 0xffffffff) * 0x100000000)) + (unsigned int)v73 * 4 - 27))
                        goto LABEL_ac244;
                } while ((v75 = v79 + 1, v77 += 1, v76 = v28, v73 = v87, v79 = v75, v11 != v77));
                v75 = l + v77;
                v73 = v87;
            }
LABEL_ac244:
            v88 = v10;
            v89 = v9;
            if (v76 > 3)
            {
                v90 = (unsigned int)(v75 - v35 - v76) + 3;
                v91 = (v90 < (unsigned int)v21 ? v4 : v19);
                v92 = (v90 < (unsigned int)v21 ? v15 : v35);
                if (v75 > v89)
                {
                    v93 = v90;
                    if (v92 + v93 > v91)
                    {
                        v94 = v75 - 1;
                        v95 = v92 + v93 - 1;
                        do
                        {
                            v96 = v95;
                            if (*(char *)v94 != *v96)
                            {
                                v75 = v94 + 1;
                                goto LABEL_ac2f0;
                            }
                        } while ((v73 += 1, v97 = v94 - 1, v94 > v89 && (v94 = v97, v95 = v96 - 1, v91 < v96)));
                        v75 = v97 + 1;
                    }
                }
LABEL_ac2f0:
                v98 = (unsigned int)v76 - 3;
            }
            else
            {
                v98 = v88;
                v88 = v42;
            }
            v99 = v75 - v89;
            v30 = &v29;
            v29 = &v30;
            v100 = a1;
            if (v75 > v16)
            {
                sub_82208(v100->field_18);
                v40 = v23;
                goto LABEL_ac328;
            }
            else
            {
                *v100->field_18 = *(int128_t *)v89;
                v101 = v100->field_18;
                if (v99 > 16)
                {
                    v101[1] = (int128_t)v89[16];
                    if (v99 >= 33)
                    {
                        iter = v101 + 2;
                        v103 = v89 + 48;
                        do
                        {
                            *iter = *(int128_t *)(v103 - 16);
                            v104 = v103 + 32;
                            iter[1] = *(int128_t *)v103;
                            iter += 2;
                            v103 = v104;
                        } while (iter < v101 + v99);
                    }
LABEL_ac328:
                    v105 = a1;
                    v105->field_18 = v105->field_18 + v99;
                    v106 = v105->field_8;
                    if (v99 >= 0x10000)
                    {
                        v107 = a1;
                        v108 = (char *)v106 - v107->field_0;
                        *(unsigned int *)&v107->field_48 = 1;
                        *(unsigned int *)((char *)&v107->field_48 + 4) = v108 >> 3;
                        goto LABEL_ac3bc;
                    }
                }
                else
                {
                    v100->field_18 = v101 + v99;
                    v106 = v100->field_8;
LABEL_ac3bc:
                    v106->field_4 = (unsigned short)v99;
                    v106->field_0 = v76;
                    v109 = v73 - 3;
                    v110 = a1;
                    if (0x10000 <= v109)
                    {
                        v111 = (char *)v106 - v110->field_0 >> 3;
                        *(unsigned int *)&v110->field_48 = 2;
                        *(unsigned int *)((char *)&v110->field_48 + 4) = v111;
                    }
                    v106->field_6 = (unsigned short)v109;
                    v110->field_8 = v106 + 1;
                    if (*(int *)((char *)&v33[1].field_8 + 4))
                    {
                        v112 = v33->field_2c;
                        v28 = &v26;
                        v27 = &v28;
                        v113 = v35 + v112;
                        v114 = v7 - v113;
                        k = (v7 < v113 ? 0 : 8 <= v114 + 1 ? 8 : v114 + 1);
                        if (k + (unsigned int)v112 > (unsigned int)v112)
                        {
                            v116 = v33->field_34;
                            v117 = v33->field_60;
                            do
                            {
                                v118 = k;
                                if (v38 == 6)
                                {
                                    v119 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v35 + v112);
                                }
                                else if (v38 == 5)
                                {
                                    v119 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v35 + v112);
                                }
                                else
                                {
                                    v120 = (2654435761 * *(int *)((char *)v35 + v112) ^ (unsigned int)v117) >> ((char)(24 - v116) & 31);
                                    continue;
                                }
                                v120 = (v119 ^ v117) >> ((char)(56 - v116) & 63);
                                v30 = &v29;
                                v29 = &v30;
                                v5[v112 & 7] = v120;
                                v112 += 1;
                                k = v118 - 1;
                            } while (k);
                        }
                        *(unsigned int *)((char *)&v33[1].field_8 + 4) = 0;
                    }
                    l = v75 + v73;
                    i = v7;
                    if (l > i)
                    {
                        v65 = l;
                        v66 = v98;
                        v42 = v88;
                        v36 = v21;
                    }
                    else
                    {
                        v36 = v21;
                        do
                        {
                            v42 = v98;
                            v98 = v88;
                            v121 = l - v35 - v88;
                            v122 = arm64g_calculate_condition(129, v121 - v36 & 0xffffffff, 4, 0);
                            if (v122 & 1 || (v123 = ((unsigned int)v121 < (unsigned int)v36 ? v15 : v35) + v121, *v123 != *(int *)l))
                            {
                                v65 = l;
                                v66 = v42;
                                v42 = v98;
                                break;
                            }
                            v124 = sub_84f30(l + 4, v123 + 1, v22, ((unsigned int)v121 < (unsigned int)v36 ? v18 : v22), v19);
                            v30 = &v29;
                            v29 = &v30;
                            if (l > v16)
                                sub_82208(v110->field_18, l, l, v16);
                            else
                                *v110->field_18 = *(int128_t *)l;
                            v125 = v110->field_8;
                            *(unsigned short *)((char *)&v125->field_0 + 4) = 0;
                            *(unsigned int *)&v125->field_0 = 1;
                            v126 = v124 + 1;
                            v40 = v23;
                            if (0x10000 <= v126)
                            {
                                v127 = (char *)v125 - v110->field_0;
                                *(unsigned int *)&v110->field_48 = 2;
                                *(unsigned int *)((char *)&v110->field_48 + 4) = v127 >> 3;
                            }
                            *(unsigned short *)((char *)&v125->field_0 + 6) = (unsigned short)v126;
                            l += v124 + 4;
                            v110->field_8 = &v125->field_4;
                            v88 = v42;
                            v65 = l;
                            v66 = v98;
                            v33 = v17;
                        } while (l <= i);
                    }
                }
            }
        } while (i > l);
    }
    else
    {
        v65 = a3;
        v66 = v41;
    }
    a2->field_0 = v66;
    a2->field_4 = v42;
    return v22 - v65;
}
