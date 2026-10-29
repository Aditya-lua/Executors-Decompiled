/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e414..0x9e96c (1368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e414_4 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_6;
} st_9e414_4;

typedef struct st_9e414_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_9e414_1;

typedef struct st_9e414_2 {
    char padding_0[8];
    struct st_9e414_3 *field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[220];
    struct st_9e414_1 *field_f8;
    char padding_100[16];
    unsigned long long field_110;
    char padding_118[20];
    unsigned long long field_12c;
} st_9e414_2;

typedef struct st_9e414_3 {
    unsigned int field_0;
} st_9e414_3;

typedef struct st_9e414_5 {
    unsigned long long field_0;
    struct st_9e414_4 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned int field_48;
    unsigned int field_4c;
} st_9e414_5;

typedef struct st_9e414_0 {
    char field_0;
} st_9e414_0;


void* sub_9e414(st_9e414_2 *a0, st_9e414_5 *a1, unsigned int *a2, void* node, unsigned long a4)
{
    void* v18;  // x25
    void* v19;  // x28
    unsigned long v28;  // x13
    unsigned long v29;  // x12
    unsigned long long v30;  // 4182
    unsigned long v31;  // x20
    void* v32;  // x26
    unsigned long v33;  // x8
    unsigned int *v34;  // x9
    unsigned long long v35;  // 4112
    unsigned long long v36;  // x28
    unsigned long v37;  // x24
    void* v20;  // x26
    unsigned int v38;  // w13
    st_9e414_2 *v39;  // x27
    unsigned long long v40;  // x0
    unsigned long long v41;  // x8
    unsigned long v42;  // cc_dep1
    unsigned long long v43;  // 4105
    unsigned long long v44;  // 4105
    void* v45;  // x8
    void* i;  // x26
    unsigned int v47;  // w10
    unsigned int *v21;  // x22
    unsigned long v48;  // cc_dep1
    unsigned long v49;  // cc_dep2
    char *v50;  // x8
    unsigned int *v51;  // x9
    unsigned long long v52;  // 4109
    unsigned long long v53;  // 4109
    unsigned long v54;  // x11
    void* v55;  // x10
    char *v56;  // x9
    char *v57;  // x9
    unsigned long v22;  // x23
    void* v58;  // x11
    unsigned long long v59;  // x19
    uint128_t *v60;  // x9
    uint128_t *iter;  // x9
    uint128_t *v62;  // x10
    uint128_t *v63;  // x10
    st_9e414_4 *v64;  // x8
    unsigned long long v65;  // x9
    unsigned long long v66;  // x9
    unsigned int v67;  // w10
    char *v23;  // x11
    unsigned long long v68;  // x8
    unsigned int *v69;  // x9
    unsigned long long v70;  // 4112
    unsigned long long v71;  // x25
    st_9e414_4 *v72;  // x8
    unsigned long long v73;  // x9
    unsigned long long v74;  // x10
    unsigned long long v24;  // w8
    unsigned long v25;  // x8
    unsigned long v26;  // x19
    st_9e414_1 *v27;  // x9
    char *v0;  // [bp-0xd8]
    unsigned long long v1;  // [bp-0xd0]
    unsigned int v2;  // [bp-0xcc]
    unsigned long v3;  // [bp-0xc8]
    void* v4;  // [bp-0xc0]
    void* v5;  // [bp-0xb8]
    st_9e414_2 *v6;  // [bp-0xb0]
    unsigned long v7;  // [bp-0xa8]
    unsigned int *v8;  // [bp-0xa0]
    char *v9;  // [bp-0x98]
    void* v10;  // [bp-0x90]
    st_9e414_0 **v11;  // [bp-0x88], Other Possible Types: char
    st_9e414_0 *v12;  // [bp-0x80]
    unsigned long long v13;  // [bp-0x78]
    st_9e414_0 **v14;  // [bp-0x70]
    st_9e414_0 *v15;  // [bp-0x68]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v18 = node;
    v12 = &v11;
    v11 = &v12;
    v19 = node + a4;
    v20 = v19 - 8;
    v21 = a0->field_8;
    v22 = a0->field_18;
    v23 = (char *)v21 + v22;
    v24 = (int)a0->field_110;
    if ((unsigned int)a0->field_110 >= 6)
        v24 = 6;
    if (4 >= v24)
        v24 = 4;
    v1 = v24;
    v25 = *a2;
    v26 = a2[1];
    v27 = a0->field_f8;
    v28 = v27->field_0;
    v29 = v27->field_8;
    v9 = v23;
    v0 = v29 + v27->field_18;
    v30 = arm64g_calculate_condition(0x11, v18 - v23 - v0 & 0xffffffff, v28 & 0xffffffff, 0);
    if (!(v30 & 1))
        node += 1;
    v6 = a0;
    *(unsigned int *)&(a0->padding_118)[1] = 0;
    if (v20 > node)
    {
        v2 = (unsigned int)v22 + (unsigned int)(v29 - v28);
        v7 = v28;
        v8 = v29 - v2;
        v10 = v19 - 32;
        v4 = v20;
        v5 = v19;
        v3 = v29;
        do
        {
            v31 = v25;
            v32 = node + 1;
            v33 = (unsigned int)(node - v21 - v31) + 1;
            v34 = v29 + v33 - v2;
            if ((unsigned int)v33 >= (unsigned int)v22)
                v34 = (char *)v21 + v33;
            v35 = arm64g_calculate_condition(129, v33 - v22 & 0xffffffff, 4, 0);
            if (!(v35 & 1) && *v34 == *(int *)v32)
            {
                v36 = sub_84f30() + 4;
                v37 = v31;
                v31 = v26;
                v38 = 1;
                v39 = v6;
                goto LABEL_9e6d0;
            }
            v13 = 0x3b9ac9ff;
            v15 = &v14;
            v14 = &v15;
            if (v1 == 6)
            {
                v40 = sub_a9be8(v6, node, v19);
            }
            else if (v1 == 5)
            {
                v40 = sub_ae508(v6, node, v19);
            }
            else
            {
                v40 = sub_a96c0(v6, node, v19);
            }
            v36 = v40;
            v41 = v13;
            v42 = v40;
            if (v40)
            {
                v38 = v41;
                v43 = arm64g_calculate_condition(4, v42, 0, 0);
                if (!(v43 & 1))
                    goto LABEL_9e612;
                goto LABEL_9e611;
            }
            else
            {
                v38 = 1;
                v44 = arm64g_calculate_condition(4, v42, 0, 0);
                if (v44 & 1)
                {
LABEL_9e611:
                    goto LABEL_9e614;
                }
                else
                {
LABEL_9e612:
                    v32 = node;
LABEL_9e614:
                    if (v40 <= 3)
                    {
                        v45 = node - v18;
                        node = node + (v45 >> 8) + 1;
                        v19 = v5;
                        *(unsigned int *)&(v6->padding_118)[1] = v45 > 0x7ff;
                        v25 = v31;
                        i = v4;
                        continue;
                    }
                    if (v41 >= 4)
                    {
                        v47 = (unsigned int)(node - (v41 + (char *)v21)) + 3;
                        v48 = v22 & 0xffffffff;
                        v49 = v47;
                        if (v47 < (unsigned int)v22)
                        {
                            v50 = v0;
                            v51 = v8;
                            v52 = arm64g_calculate_condition(131, v48, v49, 0);
                            if (!(v52 & 1))
                                goto LABEL_9e64a;
                        }
                        else
                        {
                            v50 = v9;
                            v51 = v8;
                            v53 = arm64g_calculate_condition(131, v48, v49, 0);
                            if (!(v53 & 1))
                            {
LABEL_9e64a:
                                v51 = v21;
LABEL_9e64c:
                                if (node > v18 && !(v54 = v47, (char *)v51 + v54 <= v50))
                                {
                                    v55 = v32 - 1;
                                    v56 = (char *)v51 + v54 - 1;
                                    do
                                    {
                                        v57 = v56;
                                        if (*(char *)v55 != *v57)
                                        {
                                            v32 = v55 + 1;
                                            v39 = v6;
                                            goto LABEL_9e6cc;
                                        }
                                    } while ((v36 += 1, v58 = v55 - 1, v55 > v18 && (v55 = v58, v56 = v57 - 1, v50 < v57)));
                                    v32 = v58 + 1;
                                    v39 = v6;
                                }
                                else
                                {
                                    v39 = v6;
                                }
LABEL_9e6cc:
                                v37 = v38 - 3;
                                goto LABEL_9e6d0;
                            }
                        }
                        goto LABEL_9e64c;
                    }
                    else
                    {
                        v37 = v31;
                        v31 = v26;
                        v39 = v6;
LABEL_9e6d0:
                        v59 = v32 - v18;
                        v15 = &v14;
                        v14 = &v15;
                        if (v32 > v10)
                        {
                            sub_82208(a1->field_18, v18, v32, v10);
                        }
                        else
                        {
                            *a1->field_18 = *(int128_t *)v18;
                            v60 = a1->field_18;
                            if (v59 > 16)
                            {
                                v60[1] = (int128_t)v18[16];
                                if ((long long)v59 >= 33)
                                {
                                    iter = v60 + 2;
                                    v62 = v18 + 48;
                                    do
                                    {
                                        *iter = *(int128_t *)((char *)v62 - 16);
                                        v63 = v62 + 2;
                                        iter[1] = *v62;
                                        iter += 2;
                                        v62 = v63;
                                    } while (iter < (char *)v60 + v59);
                                }
                            }
                            else
                            {
                                a1->field_18 = (char *)v60 + v59;
                                v64 = a1->field_8;
                                *(unsigned short *)&(&v64->field_0)[1] = v59;
                                v64->field_0 = v38;
                                v65 = v36 - 3;
                                if (v65 >= 0x10000)
                                    goto LABEL_9e8e8;
LABEL_9e734:
                                *(unsigned short *)((char *)&(&v64->field_0)[1] + 2) = v65;
                                a1->field_8 = &v64->field_4;
                                if (!*(int *)&(v39->padding_118)[1])
                                    goto LABEL_9e74c;
                                goto LABEL_9e748;
                            }
                        }
                        a1->field_18 = (char *)a1->field_18 + v59;
                        v64 = a1->field_8;
                        if (0x10000 > v59)
                        {
                            *(unsigned short *)&(&v64->field_0)[1] = v59;
                            v64->field_0 = v38;
                            v65 = v36 - 3;
                            if (0x10000 <= v65)
                                goto LABEL_9e8e8;
                            goto LABEL_9e734;
                        }
                        v66 = (char *)v64 - a1->field_0;
                        a1->field_48 = 1;
                        a1->field_4c = v66 >> 3;
                        *(unsigned short *)&(&v64->field_0)[1] = v59;
                        v64->field_0 = v38;
                        v65 = v36 - 3;
                        if (v65 < 0x10000)
                            goto LABEL_9e734;
LABEL_9e8e8:
                        v67 = (char *)v64 - a1->field_0 >> 3;
                        a1->field_48 = 2;
                        a1->field_4c = v67;
                        *(unsigned short *)((char *)&(&v64->field_0)[1] + 2) = v65;
                        a1->field_8 = &v64->field_4;
                        if (!*(int *)&(v39->padding_118)[1])
                            goto LABEL_9e74c;
LABEL_9e748:
                        *(unsigned int *)&(v39->padding_118)[1] = 0;
LABEL_9e74c:
                        node = v32 + v36;
                        i = v4;
                        if (node > i)
                        {
                            v18 = node;
                            v25 = v37;
                            v26 = v31;
                            v19 = v5;
                        }
                        else
                        {
                            do
                            {
                                v26 = v37;
                                v37 = v31;
                                v68 = node - v21 - v31;
                                if ((unsigned int)v68 < (unsigned int)v22)
                                    v69 = v8;
                                else
                                    v69 = v21;
                                v70 = arm64g_calculate_condition(129, v68 - v22 & 0xffffffff, 4, 0);
                                if (v70 & 1 || *(int *)((char *)v69 + v68) != *(int *)node)
                                {
                                    v18 = node;
                                    v25 = v26;
                                    v26 = v37;
                                    v19 = v5;
                                    break;
                                }
                                v71 = sub_84f30();
                                v15 = &v14;
                                v14 = &v15;
                                if (node > v10)
                                    sub_82208(a1->field_18, node, node, v10);
                                else
                                    *a1->field_18 = *(int128_t *)node;
                                v72 = a1->field_8;
                                *(unsigned short *)&(&v72->field_0)[1] = 0;
                                v72->field_0 = 1;
                                v73 = v71 + 1;
                                if (0x10000 <= v73)
                                {
                                    v74 = (char *)v72 - a1->field_0;
                                    a1->field_48 = 2;
                                    a1->field_4c = v74 >> 3;
                                }
                                *(unsigned short *)((char *)&(&v72->field_0)[1] + 2) = v73;
                                node += v71 + 4;
                                a1->field_8 = &v72->field_4;
                                v31 = v26;
                                v18 = node;
                                v25 = v37;
                                v19 = v5;
                            } while (node <= i);
                        }
                    }
                }
            }
            v29 = v3;
        } while (i > node);
        a2 = a2;
    }
    *a2 = v25;
    a2[1] = v26;
    return v19 - v18;
}
