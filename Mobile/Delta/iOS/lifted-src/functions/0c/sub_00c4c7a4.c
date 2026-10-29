/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4c7a4..0xc4cbcc (1064 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4c7a4_4 {
    struct st_c4c7a4_3 *field_0;
    struct st_c4c7a4_5 *field_8;
    struct st_c4c7a4_2 *field_10;
} st_c4c7a4_4;

typedef struct st_c4c7a4_10 {
    char padding_0[8];
    char *field_8;
    struct st_c4c7a4_2 *field_10;
} st_c4c7a4_10;

typedef struct st_c4c7a4_9 {
    char padding_0[8];
    char *field_8;
    unsigned int field_10;
    unsigned int field_14;
} st_c4c7a4_9;

typedef struct st_c4c7a4_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    char *field_10;
} st_c4c7a4_0;

typedef struct st_c4c7a4_2 {
    struct st_c4c7a4_2 *field_0;
    char padding_8[16];
    struct st_c4c7a4_2 *field_18;
} st_c4c7a4_2;

typedef struct st_c4c7a4_7 {
    struct st_c4c7a4_8 *field_0;
    struct st_c4c7a4_2 *field_8;
    struct st_c4c7a4_2 *field_10;
    struct st_c4c7a4_2 *field_18;
} st_c4c7a4_7;

typedef struct st_c4c7a4_6 {
    char *field_0;
    char *field_8;
    char field_10;
    char field_11[7];
    unsigned int field_14;
    char *field_18;
    struct st_c4c7a4_2 *field_20;
} st_c4c7a4_6;

typedef struct st_c4c7a4_11 {
    char *field_0;
    char *field_8;
    char field_10;
    char field_11[7];
    char field_14;
    char padding_15[3];
    char *field_18;
    char *field_20;
} st_c4c7a4_11;

typedef struct st_c4c7a4_3 {
    char padding_0[96];
    unsigned long long field_60;
    char padding_68[352];
    char *field_1c8;
    struct st_c4c7a4_2 *field_1d0;
    struct st_c4c7a4_2 *field_1d8;
    unsigned short field_1d9;
    char field_1db;
    struct st_c4c7a4_2 *field_1dc;
    struct st_c4c7a4_2 *field_1e0;
    struct st_c4c7a4_2 *field_1e8;
    struct st_c4c7a4_2 *field_1f0;
    struct st_c4c7a4_2 *field_1f8;
    struct st_c4c7a4_2 *field_200;
    struct st_c4c7a4_2 *field_201;
    struct st_c4c7a4_2 *field_204;
    struct st_c4c7a4_2 *field_208;
    struct st_c4c7a4_2 *field_210;
} st_c4c7a4_3;

typedef struct st_c4c7a4_1 {
    char *field_0;
    unsigned int field_8;
    struct st_c4c7a4_2 *field_c;
    struct st_c4c7a4_2 *field_10;
    struct st_c4c7a4_2 *field_11;
    struct st_c4c7a4_2 *field_14;
    struct st_c4c7a4_2 *field_18;
    struct st_c4c7a4_2 *field_20;
} st_c4c7a4_1;

typedef struct st_c4c7a4_5 {
    unsigned long long field_0;
} st_c4c7a4_5;

typedef struct st_c4c7a4_8 {
    char *field_0;
} st_c4c7a4_8;

extern long long g_efd0e0;
extern long long g_efd0f8;
extern char _NSHomeDirectory;

void sub_c4c7a4(st_c4c7a4_1 *a0, st_c4c7a4_4 *a1, st_c4c7a4_0 *a2)
{
    unsigned int v12;  // w23
    unsigned long v13;  // x21
    char *v22;  // x14
    char *v23;  // x14
    char *v24;  // x15
    st_c4c7a4_4 *v25;  // x11
    char *v26;  // x12
    char *v27;  // x13
    unsigned long long v28;  // 4110
    unsigned long long v29;  // 4102
    unsigned long long v30;  // 4110
    unsigned long long v31;  // 4102
    char *v14;  // x20
    st_c4c7a4_6 *v32;  // x8
    char *iter;  // x8
    unsigned int v34;  // w9
    char *v35;  // x9
    char *v36;  // x9
    char *v37;  // x1
    unsigned int v38;  // w11
    char *v39;  // cc_dep1
    unsigned long long v40;  // x13
    st_c4c7a4_7 *v41;  // x11
    st_c4c7a4_3 *v15;  // x19
    unsigned long long v42;  // 4110
    unsigned long long v43;  // 4102
    unsigned long long v44;  // 4110
    unsigned long long v45;  // 4102
    char *v46;  // x1
    char **v47;  // x11
    char *v48;  // x15
    unsigned long long v49;  // 4106
    st_c4c7a4_9 *v50;  // x11
    st_c4c7a4_10 *v51;  // x9
    char *v16;  // x8
    char *v52;  // w9
    char *v54;  // w9
    char *v17;  // x8
    char *v18;  // x22
    char *v19;  // x9
    char *node;  // x10
    char *v21;  // cc_dep1
    uint56_t v0;  // [bp-0x90]
    st_c4c7a4_6 *v1;  // [bp-0x88]
    char v2;  // [bp-0x79]
    unsigned long v3;  // [bp-0x78]
    char *v4;  // [bp-0x70]
    unsigned long long *v5;  // [bp-0x68]
    st_c4c7a4_11 **v6;  // [bp-0x60]
    unsigned long long v7;  // [bp-0x58]
    char *v8;  // [bp-0x50]
    st_c4c7a4_5 **v9;  // [bp-0x48]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a2->field_0;
    v13 = a2->field_8;
    v14 = a2->field_10;
    if (v12 == 3)
    {
        a0->field_c = v13;
        a0->field_10 = v14;
        a0->field_8 = 3;
        return;
    }
    v15 = a1->field_0;
    if (v15->field_1e0 == 1)
    {
        v16 = &v15->field_1e8;
        v17 = v16;
        if (!*(long long *)v17)
            goto LABEL_c4ca70;
LABEL_c4c7f8:
        v18 = a1->field_10;
        v19 = *(long long *)&v16[24];
        if (*(long long *)&v16[24])
            goto LABEL_c4c804;
    }
    else
    {
        v16 = sub_c784ac(&v15->field_1e0, v13, v14);
        v17 = v16;
        if (*(long long *)v17)
            goto LABEL_c4c7f8;
LABEL_c4ca70:
        node = v17[8];
        v16 = *(long long *)&v17[16];
        if ((unsigned int)node != 82)
        {
            *(int *)((char *)&a0->field_c + 1) = *(int *)&v17[9];
            *(int *)((char *)&a0->field_c + 4) = *(int *)&v17[12];
            *(char *)&a0->field_c = (char)node;
            a0->field_10 = v16;
            a0->field_8 = 3;
            return;
        }
        v18 = a1->field_10;
        v19 = *(long long *)&v16[24];
        if (*(long long *)&v16[24])
        {
LABEL_c4c804:
            node = 0;
            v21 = v19;
            v23 = v22;
            if (v21 != 1)
            {
                node = 0;
                v21 = v19;
                do
                {
                    v23 = v21 >> 1;
                    v24 = v23 + node;
                    if (v18 >= (unsigned long long)*(long long *)(*(long long *)&v16[16] + 24 * v24))
                        node = v24;
                } while ((v21 -= v23, 1 < v21));
            }
            v25 = *(long long *)&v16[16] + 24 * node;
            v26 = &v25->field_0->padding_0[0];
            v27 = v25->field_8;
            if (v26 <= v18)
            {
                v28 = arm64g_calculate_condition(36, v21, 1, 0);
                v29 = arm64g_calculate_condition(52, (v28 & 1 ? v18 : 0x20000000), (v28 & 1 ? v27 : 0), 0);
                if (v29 & 1)
                    goto LABEL_c4c864;
            }
            else
            {
                v30 = arm64g_calculate_condition(36, v21, 1, 0);
                v31 = arm64g_calculate_condition(48, (v30 & 1 ? v18 : 0x20000000), (v30 & 1 ? v27 : 0), 0);
                if (v31 & 1)
                {
LABEL_c4c864:
                    if (v19 <= node)
                    {
                        sub_c73c94(node, v19, &g_efd0e0);
LABEL_c4cb98:
                        sub_c73c94(v19, node, &g_efd0f8);
                        sub_c73c94(node);
                        sub_c73c94(node);
                    }
                    v19 = v25->field_10;
                    node = *(long long *)&v16[8];
                    if ((unsigned long long)*(long long *)&v16[8] <= v19)
                        goto LABEL_c4cb98;
                    v32 = *(long long *)v16 + 72 * v19;
                    v1 = v32;
                    v2 = v12;
                    v3 = v13;
                    v4 = v14;
                    v5 = a1->field_8;
                    v6 = &v1;
                    v7 = &v2;
                    node = &v5;
                    v8 = &v3;
                    v9 = &v5;
                    if (v32->field_0 == 1)
                    {
                        iter = &v32->field_8;
                        if (!v32->field_8)
                            goto LABEL_c4c8c8;
                    }
                    else
                    {
                        iter = sub_c790c8(v32, &v6);
                        if (!*(long long *)iter)
                        {
LABEL_c4c8c8:
                            v34 = iter[8];
                            *(int *)&v0 = *(int *)&iter[9];
                            node = *(int *)&iter[12];
                            *(unsigned int *)((char *)&v0 + 3) = (unsigned int)node;
                            iter = *(long long *)&iter[16];
                            if (v34 != 82)
                            {
                                *(unsigned int *)((char *)&a0->field_c + 1) = *(unsigned int *)&v0;
                                *(unsigned int *)((char *)&a0->field_c + 4) = *(unsigned int *)((void*)&v0 + 3);
                                *(char *)&a0->field_c = v34;
                                a0->field_10 = iter;
                                a0->field_8 = 3;
                                return;
                            }
                        }
                    }
LABEL_c4c8e8:
                    if (v15->field_60 != 47)
                    {
                        if (v15->field_1c8 == 1)
                        {
                            v35 = &v15->field_1d0;
                            node = *(long long *)v35;
                            v36 = v35;
                            if (!*(long long *)v36)
                                goto LABEL_c4cae8;
LABEL_c4c90c:
                            v37 = *(long long *)&v35[24];
                            if (*(long long *)&v35[24])
                                goto LABEL_c4c914;
                        }
                        else
                        {
                            v35 = sub_c76d30(&v15->field_1c8, *(long long *)a1->field_8 + 16, v15, &v15->field_60);
                            node = *(long long *)v35;
                            v36 = v35;
                            if (*(long long *)v36)
                                goto LABEL_c4c90c;
LABEL_c4cae8:
                            v38 = v36[8];
                            v35 = *(long long *)&v36[16];
                            if (v38 != 82)
                            {
                                v54 = (char *)*(int *)&v36[12];
                                *(unsigned int *)&a0->field_c = *(short *)&v36[9] * 0x100 | v36[11] * &_NSHomeDirectory | v38;
                                *(unsigned int *)((char *)&a0->field_c + 4) = (unsigned int)v54;
                                a0->field_10 = v35;
                                a0->field_8 = 3;
                                return;
                            }
                            v37 = *(long long *)&v35[24];
                            node = v35;
                            if (*(long long *)&node[24])
                            {
LABEL_c4c914:
                                if (v37 == 1)
                                {
                                    node = 0;
                                    v39 = v37;
                                }
                                else
                                {
                                    node = 0;
                                    v39 = v37;
                                    do
                                    {
                                        v40 = v39 >> 1;
                                        v23 = &node[v40];
                                        if (v18 >= (unsigned long long)*(long long *)(*(long long *)&v35[16] + v23 * 32 + 16))
                                            node = v23;
                                    } while ((v39 = &v39[-1 * v40], 1 < v39));
                                }
                                v41 = *(long long *)&v35[16] + node * 32;
                                v26 = v41->field_10;
                                v27 = v41->field_18;
                                if (v26 <= v18)
                                {
                                    v42 = arm64g_calculate_condition(36, v39, 1, 0);
                                    v43 = arm64g_calculate_condition(36, (v42 & 1 ? v18 : 0x20000000), (v42 & 1 ? v27 : 0), 0);
                                    if (!(v43 & 1))
                                        goto LABEL_c4c968;
                                }
                                else
                                {
                                    v44 = arm64g_calculate_condition(36, v39, 1, 0);
                                    v45 = arm64g_calculate_condition(32, (v44 & 1 ? v18 : 0x20000000), (v44 & 1 ? v27 : 0), 0);
                                    if (!(v45 & 1))
                                    {
LABEL_c4c968:
                                        if (v37 <= node)
                                        {
                                            sub_c73c94(node);
                                            sub_c73c94(node);
                                        }
                                        v46 = v41->field_8;
                                        if (v46)
                                        {
                                            v47 = v41->field_0;
                                            if (v46 == 1)
                                            {
                                                node = 0;
                                            }
                                            else
                                            {
                                                node = 0;
                                                v27 = v46;
                                                do
                                                {
                                                    v23 = v27 >> 1;
                                                    v48 = v23 + node;
                                                    if (v18 >= (unsigned long long)*(long long *)((char *)v47 + 0x18 * v48))
                                                        node = v48;
                                                } while ((v27 -= v23, 1 < v27));
                                            }
                                            v26 = *(long long *)((char *)v47 + 0x18 * node);
                                            if (v26 != v18)
                                            {
                                                v49 = arm64g_calculate_condition(36, v26, v18, 0);
                                                if (!(v49 & 1))
                                                    node += 1;
                                                if (node)
                                                {
                                                    node -= 1;
                                                    goto LABEL_c4c9f8;
                                                }
                                            }
                                            else
                                            {
LABEL_c4c9f8:
                                                if (v46 > node)
                                                {
                                                    v50 = (char *)v47 + 0x18 * node;
                                                    v26 = *(long long *)&v35[8];
                                                    if ((unsigned long long)*(long long *)&v35[8] > v50->field_8)
                                                    {
                                                        v51 = *(long long *)v35 + 24 * v50->field_8;
                                                        node = v51->field_8;
                                                        v26 = v51->field_10;
                                                    }
                                                    else
                                                    {
                                                        node = 0;
                                                    }
                                                    v27 = v50->field_10;
                                                    v23 = v50->field_14;
                                                    v52 = (char *)((unsigned int)v27 != 0);
                                                    *(unsigned int *)&a0->field_c = (unsigned int)v52;
                                                    *(unsigned int *)((char *)&a0->field_c + 4) = (unsigned int)v23;
                                                    a0->field_0 = iter;
                                                    a0->field_8 = (unsigned int)v52;
                                                    (&a0->field_8)[1] = (unsigned int)v27;
                                                    a0->field_10 = node;
                                                    a0->field_11 = v26;
                                                    return;
                                                }
                                                sub_c73c94(node);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    *(unsigned int *)&a0->field_c = 0;
                    *(unsigned int *)((char *)&a0->field_c + 4) = (unsigned int)v23;
                    a0->field_0 = iter;
                    a0->field_8 = 2;
                    (&a0->field_8)[1] = (unsigned int)v27;
                    a0->field_10 = node;
                    a0->field_11 = v26;
                    return;
                }
            }
        }
    }
    iter = 0;
    v23 = v22;
    goto LABEL_c4c8e8;
}
