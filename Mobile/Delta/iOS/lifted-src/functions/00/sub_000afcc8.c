/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafcc8..0xb0230 (1384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afcc8_3 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_6;
} st_afcc8_3;

typedef struct st_afcc8_1 {
    char padding_0[8];
    struct st_afcc8_2 *field_8;
    struct st_afcc8_2 *field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    char padding_2c[212];
    unsigned int field_100;
    char padding_104[12];
    unsigned int field_110;
    char padding_114[24];
    unsigned long long field_12c;
} st_afcc8_1;

typedef struct st_afcc8_2 {
    unsigned int field_0;
} st_afcc8_2;

typedef struct st_afcc8_4 {
    unsigned long long field_0;
    struct st_afcc8_3 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned int field_48;
    unsigned int field_4c;
} st_afcc8_4;

typedef struct st_afcc8_5 {
    struct st_afcc8_6 *field_0;
} st_afcc8_5;

typedef struct st_afcc8_6 {
    struct st_afcc8_5 *field_0;
} st_afcc8_6;

typedef struct st_afcc8_0 {
    char field_0;
} st_afcc8_0;


char * sub_afcc8(st_afcc8_1 *a0, st_afcc8_4 *a1, unsigned int *a2, void* a3, unsigned long a4)
{
    void* v17;  // x25
    char *v18;  // x28
    unsigned long v27;  // x20
    void* k;  // x27
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned int v31;  // w24
    void* v32;  // x26
    unsigned long v33;  // x10
    unsigned long long v34;  // 4112
    unsigned long long v35;  // 4108
    unsigned long long v36;  // 4112
    void* v19;  // x26
    unsigned long long v37;  // 4108
    unsigned int v38;  // w11
    unsigned long long v39;  // x8
    unsigned int v40;  // w12
    unsigned long v41;  // cc_dep1
    unsigned long v42;  // cc_dep2
    unsigned int *v43;  // x9
    unsigned long long v44;  // 4112
    unsigned long long v45;  // 4102
    unsigned long long v46;  // 4112
    unsigned int *v20;  // x19
    unsigned long long v47;  // 4102
    unsigned long long v48;  // x28
    unsigned long v49;  // x19
    unsigned int v50;  // w13
    unsigned long long v51;  // x0
    unsigned long v52;  // x8
    unsigned long v53;  // cc_dep1
    unsigned long long v54;  // 4105
    unsigned long long v55;  // 4105
    void* v56;  // x8
    unsigned long v21;  // x14
    unsigned long v57;  // x8
    void* i;  // x26
    unsigned int v59;  // w10
    unsigned long v60;  // cc_dep1
    unsigned long v61;  // cc_dep2
    unsigned int *v62;  // x9
    void* v63;  // x8
    void* v64;  // x11
    unsigned long long v65;  // 4113
    unsigned long long v66;  // 4113
    unsigned long v22;  // x9
    unsigned long v67;  // x10
    void* v68;  // x9
    void* v69;  // x10
    void* v70;  // x9
    void* v71;  // x11
    unsigned long long v72;  // x20
    uint128_t *v73;  // x9
    uint128_t *iter;  // x9
    uint128_t *v75;  // x10
    uint128_t *v76;  // x10
    void* v23;  // x12
    st_afcc8_3 *v77;  // x8
    unsigned long long v78;  // x9
    unsigned long long v79;  // x9
    unsigned int v80;  // w10
    unsigned long v81;  // cc_dep1
    unsigned long v82;  // cc_dep2
    unsigned int *v83;  // x13
    void* v84;  // x10
    unsigned long long v85;  // 4112
    unsigned long long v86;  // 4108
    char v24;  // x8
    unsigned long long v87;  // 4112
    unsigned long long v88;  // 4108
    unsigned int v89;  // w11
    unsigned long long v90;  // x8
    unsigned int v91;  // w12
    unsigned long v92;  // cc_dep1
    unsigned long v93;  // cc_dep2
    unsigned int *v94;  // x9
    unsigned long long v95;  // 4112
    unsigned long long v96;  // 4102
    unsigned int v25;  // w10
    unsigned long long v97;  // 4112
    unsigned long long v98;  // 4102
    unsigned long long v99;  // x25
    st_afcc8_3 *v100;  // x8
    unsigned long long v101;  // x9
    unsigned long long v102;  // x10
    unsigned long v26;  // x23
    void* v0;  // [bp-0xd8]
    unsigned int v1;  // [bp-0xcc]
    void* v2;  // [bp-0xc8]
    char *v3;  // [bp-0xc0]
    unsigned long long v4;  // [bp-0xb8]
    void* v5;  // [bp-0xb0]
    void* v6;  // [bp-0xa8]
    unsigned int *v7;  // [bp-0xa0]
    unsigned long v8;  // [bp-0x98]
    unsigned int *v9;  // [bp-0x90]
    st_afcc8_0 **v10;  // [bp-0x88], Other Possible Types: char
    st_afcc8_0 *v11;  // [bp-0x80]
    unsigned long v12;  // [bp-0x78]
    st_afcc8_6 **v13;  // [bp-0x70]
    st_afcc8_6 **v14;  // [bp-0x68]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = a3;
    v11 = &v10;
    v10 = &v11;
    v18 = a3 + a4;
    v19 = v18 - 8;
    v20 = a0->field_10;
    v21 = a0->field_18;
    v22 = a0->field_1c;
    v9 = a0->field_8;
    v23 = (char *)a0->field_8 + v21;
    v24 = a0->field_100;
    v25 = a0->field_110;
    if (a0->field_110 >= 6)
        v25 = 6;
    if (4 >= v25)
        v25 = 4;
    v26 = *a2;
    v27 = a2[1];
    *(unsigned int *)&(a0->padding_114)[1] = 0;
    v5 = v23;
    if (v23 != a3)
        k = a3;
    else
        k = a3 + 1;
    v29 = k;
    v30 = v19;
    if (v19 > k)
    {
        v1 = v25;
        v3 = v18;
        v4 = (char *)v20 + v21;
        v0 = (char *)v20 + v22;
        v31 = 1 << (v24 & 31);
        v6 = v18 - 32;
        v7 = v20;
        v8 = v21;
        v2 = v19;
        do
        {
            v32 = k + 1;
            v33 = (unsigned int)(k - v9) + 1;
            if (v31 < (unsigned int)(v33 - a0->field_1c))
            {
                v34 = arm64g_calculate_condition(132, v29, v30, 0);
                v35 = arm64g_calculate_condition(3, (v34 & 1 ? a0->field_28 : 0), 0, 0);
                if (!(v35 & 1))
                    goto LABEL_afde6;
                goto LABEL_afde5;
            }
            else
            {
                v36 = arm64g_calculate_condition(132, v29, v30, 0);
                v37 = arm64g_calculate_condition(0, (v36 & 1 ? a0->field_28 : 0), 0, 0);
                if (v37 & 1)
                {
LABEL_afde5:
                    v38 = v33 - v31;
                    goto LABEL_afde8;
                }
                else
                {
LABEL_afde6:
                    v38 = a0->field_1c;
LABEL_afde8:
                    v39 = v33 - v26;
                    v40 = v39 - v21;
                    v41 = v39 & 0xffffffff;
                    v42 = v21 & 0xffffffff;
                    if ((unsigned int)v39 < (unsigned int)v21)
                        v43 = v20;
                    else
                        v43 = v9;
                    if ((unsigned int)v26 <= (unsigned int)(v33 - v38))
                    {
                        v44 = arm64g_calculate_condition(147, v41, v42, 0);
                        v45 = arm64g_calculate_condition(129, (v44 & 1 ? v40 : 0x20000000), (v44 & 1 ? 4 : 0), 0);
                        if (v45 & 1)
                            goto LABEL_afe48;
                    }
                    else
                    {
                        v46 = arm64g_calculate_condition(147, v41, v42, 0);
                        v47 = arm64g_calculate_condition(128, (v46 & 1 ? v40 : 0x20000000), (v46 & 1 ? 4 : 0), 0);
                        if (v47 & 1)
                            goto LABEL_afe48;
                    }
                    if (*(int *)v32 == *(int *)((char *)v43 + v39))
                    {
                        v48 = sub_84f30() + 4;
                        v49 = v26;
                        v26 = v27;
                        v50 = 1;
                        goto LABEL_aff5c;
                    }
LABEL_afe48:
                    v12 = 0x3b9ac9ff;
                    v14 = &v13;
                    v13 = &v14;
                    if (v1 == 6)
                    {
                        v51 = sub_ae2b4(a0, k, v18, &v12);
                    }
                    else if (v1 == 5)
                    {
                        v51 = sub_a46f8();
                    }
                    else
                    {
                        v51 = sub_ae06c();
                    }
                    v48 = v51;
                    v52 = v12;
                    v53 = v51;
                    if (v51)
                    {
                        v50 = v52;
                        v54 = arm64g_calculate_condition(4, v53, 0, 0);
                        if (!(v54 & 1))
                            goto LABEL_afeae;
                        goto LABEL_afead;
                    }
                    else
                    {
                        v50 = 1;
                        v55 = arm64g_calculate_condition(4, v53, 0, 0);
                        if (v55 & 1)
                        {
LABEL_afead:
                            goto LABEL_afeb0;
                        }
                        else
                        {
LABEL_afeae:
                            v32 = k;
LABEL_afeb0:
                            v21 = v8;
                            if (v51 <= 3)
                            {
                                v56 = k - v17;
                                k = k + (v56 >> 8) + 1;
                                *(unsigned int *)&(a0->padding_114)[1] = v56 > 0x8ff;
                                v57 = v26;
                                i = v2;
                                v18 = v3;
                                continue;
                            }
                            if (v52 >= 4)
                            {
                                v59 = (unsigned int)(k - v9 - v52) + 3;
                                v60 = v21 & 0xffffffff;
                                v61 = v59;
                                if (v59 < (unsigned int)v21)
                                {
                                    v62 = v20;
                                    v63 = v5;
                                    v64 = v0;
                                    v65 = arm64g_calculate_condition(131, v60, v61, 0);
                                    if (!(v65 & 1))
                                        goto LABEL_afee6;
                                }
                                else
                                {
                                    v62 = v9;
                                    v63 = v5;
                                    v64 = v0;
                                    v66 = arm64g_calculate_condition(131, v60, v61, 0);
                                    if (!(v66 & 1))
                                    {
LABEL_afee6:
LABEL_afee8:
                                        if (k > v17)
                                        {
                                            v67 = v59;
                                            if ((char *)v62 + v67 > v63)
                                            {
                                                v68 = (char *)v62 + v67 - 1;
                                                v69 = v32 - 1;
                                                do
                                                {
                                                    v70 = v68;
                                                    if (*(char *)v69 != *(char *)v70)
                                                    {
                                                        v32 = v69 + 1;
                                                        goto LABEL_aff58;
                                                    }
                                                } while ((v48 += 1, v71 = v69 - 1, v69 > v17 && (v69 = v71, v68 = v70 - 1, v63 < v70)));
                                                v32 = v71 + 1;
                                            }
                                        }
LABEL_aff58:
                                        v49 = v50 - 3;
                                        goto LABEL_aff5c;
                                    }
                                }
                                v63 = v64;
                                goto LABEL_afee8;
                            }
                            else
                            {
                                v49 = v26;
                                v26 = v27;
LABEL_aff5c:
                                v72 = v32 - v17;
                                v14 = &v13;
                                v13 = &v14;
                                if (v32 > v6)
                                {
                                    sub_82208(a1->field_18, v17, v32, v6);
                                    v21 = v8;
                                }
                                else
                                {
                                    *a1->field_18 = *(int128_t *)v17;
                                    v73 = a1->field_18;
                                    if (v72 > 16)
                                    {
                                        v73[1] = (int128_t)v17[16];
                                        v21 = v8;
                                        if ((long long)v72 >= 33)
                                        {
                                            iter = v73 + 2;
                                            v75 = v17 + 48;
                                            do
                                            {
                                                *iter = *(int128_t *)((char *)v75 - 16);
                                                v76 = v75 + 2;
                                                iter[1] = *v75;
                                                iter += 2;
                                                v21 = v8;
                                                v75 = v76;
                                            } while (iter < (char *)v73 + v72);
                                        }
                                    }
                                    else
                                    {
                                        a1->field_18 = (char *)v73 + v72;
                                        v77 = a1->field_8;
                                        v21 = v8;
                                        *(unsigned short *)&(&v77->field_0)[1] = v72;
                                        v77->field_0 = v50;
                                        v78 = v48 - 3;
                                        if (v78 >= 0x10000)
                                            goto LABEL_b01a8;
LABEL_affc4:
                                        *(unsigned short *)((char *)&(&v77->field_0)[1] + 2) = v78;
                                        a1->field_8 = &v77->field_4;
                                        if (!*(int *)&(a0->padding_114)[1])
                                            goto LABEL_affdc;
                                        goto LABEL_affd8;
                                    }
                                }
                                a1->field_18 = (char *)a1->field_18 + v72;
                                v77 = a1->field_8;
                                if (0x10000 > v72)
                                {
                                    *(unsigned short *)&(&v77->field_0)[1] = v72;
                                    v77->field_0 = v50;
                                    v78 = v48 - 3;
                                    if (0x10000 <= v78)
                                        goto LABEL_b01a8;
                                    goto LABEL_affc4;
                                }
                                v79 = (char *)v77 - a1->field_0;
                                a1->field_48 = 1;
                                a1->field_4c = v79 >> 3;
                                *(unsigned short *)&(&v77->field_0)[1] = v72;
                                v77->field_0 = v50;
                                v78 = v48 - 3;
                                if (v78 < 0x10000)
                                    goto LABEL_affc4;
LABEL_b01a8:
                                v80 = (char *)v77 - a1->field_0 >> 3;
                                a1->field_48 = 2;
                                a1->field_4c = v80;
                                *(unsigned short *)((char *)&(&v77->field_0)[1] + 2) = v78;
                                a1->field_8 = &v77->field_4;
                                if (!*(int *)&(a0->padding_114)[1])
                                    goto LABEL_affdc;
LABEL_affd8:
                                *(unsigned int *)&(a0->padding_114)[1] = 0;
LABEL_affdc:
                                k = v32 + v48;
                                i = v2;
                                v81 = k;
                                v82 = i;
                                if (k > i)
                                {
                                    v17 = k;
                                    v57 = v49;
                                    v27 = v26;
                                    v18 = v3;
                                }
                                else
                                {
                                    do
                                    {
                                        v27 = v49;
                                        v49 = v26;
                                        v83 = v9;
                                        v84 = k - v83;
                                        if (v31 < (unsigned int)(v84 - a0->field_1c))
                                        {
                                            v85 = arm64g_calculate_condition(132, v81, v82, 0);
                                            v86 = arm64g_calculate_condition(3, (v85 & 1 ? a0->field_28 : 0), 0, 0);
                                            if (!(v86 & 1))
                                                goto LABEL_b0082;
                                            goto LABEL_b0081;
                                        }
                                        else
                                        {
                                            v87 = arm64g_calculate_condition(132, v81, v82, 0);
                                            v88 = arm64g_calculate_condition(0, (v87 & 1 ? a0->field_28 : 0), 0, 0);
                                            if (v88 & 1)
                                            {
LABEL_b0081:
                                                v89 = (unsigned int)(v84 - v31);
                                                goto LABEL_b0084;
                                            }
                                            else
                                            {
LABEL_b0082:
                                                v89 = a0->field_1c;
LABEL_b0084:
                                                v90 = v84 - v26;
                                                v91 = v90 - v21;
                                                v92 = v90 & 0xffffffff;
                                                v93 = v21 & 0xffffffff;
                                                if ((unsigned int)v90 < (unsigned int)v21)
                                                    v94 = v7;
                                                else
                                                    v94 = v83;
                                                if ((unsigned int)v26 <= (unsigned int)(v84 - v89))
                                                {
                                                    v95 = arm64g_calculate_condition(147, v92, v93, 0);
                                                    v96 = arm64g_calculate_condition(129, (v95 & 1 ? v91 : 0x20000000), (v95 & 1 ? 4 : 0), 0);
                                                    if (v96 & 1)
                                                        goto LABEL_b0174;
                                                }
                                                else
                                                {
                                                    v97 = arm64g_calculate_condition(147, v92, v93, 0);
                                                    v98 = arm64g_calculate_condition(128, (v97 & 1 ? v91 : 0x20000000), (v97 & 1 ? 4 : 0), 0);
                                                    if (v98 & 1)
                                                        goto LABEL_b0174;
                                                }
                                                if (*(int *)k != *(int *)((char *)v94 + v90))
                                                {
LABEL_b0174:
                                                    v17 = k;
                                                    v57 = v27;
                                                    v27 = v49;
                                                    v18 = v3;
                                                    break;
                                                }
                                            }
                                        }
                                        v99 = sub_84f30();
                                        v14 = &v13;
                                        v13 = &v14;
                                        if (k > v6)
                                            sub_82208(a1->field_18, k, k, v6);
                                        else
                                            *a1->field_18 = *(int128_t *)k;
                                        v100 = a1->field_8;
                                        *(unsigned short *)&(&v100->field_0)[1] = 0;
                                        v100->field_0 = 1;
                                        v101 = v99 + 1;
                                        v21 = v8;
                                        if (0x10000 <= v101)
                                        {
                                            v102 = (char *)v100 - a1->field_0;
                                            a1->field_48 = 2;
                                            a1->field_4c = v102 >> 3;
                                        }
                                        *(unsigned short *)((char *)&(&v100->field_0)[1] + 2) = v101;
                                        k += v99 + 4;
                                        a1->field_8 = &v100->field_4;
                                        v26 = v27;
                                        v17 = k;
                                        v57 = v49;
                                        v81 = k;
                                        v82 = i;
                                        v18 = v3;
                                    } while (k <= i);
                                }
                            }
                        }
                    }
                }
            }
            v26 = v57;
            v29 = k;
            v30 = i;
            v20 = v7;
        } while (i > k);
    }
    else
    {
        v57 = v26;
    }
    *a2 = v57;
    a2[1] = v27;
    return v18 - v17;
}
