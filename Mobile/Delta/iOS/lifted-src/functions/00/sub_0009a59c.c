/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a59c..0x9aad8 (1340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a59c_1 {
    void* field_0;
    void* field_4;
} st_9a59c_1;

typedef struct st_9a59c_2 {
    unsigned int field_0;
    void* field_4;
    void* field_6;
} st_9a59c_2;

typedef struct st_9a59c_4 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[12];
    unsigned int field_28;
    char padding_2c[212];
    unsigned int field_100;
    char padding_104[12];
    unsigned int field_110;
    char padding_114[24];
    void* field_12c;
} st_9a59c_4;

typedef struct st_9a59c_3 {
    unsigned long long field_0;
    struct st_9a59c_2 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned int field_48;
    unsigned int field_4c;
} st_9a59c_3;

typedef struct st_9a59c_5 {
    struct st_9a59c_6 *field_0;
} st_9a59c_5;

typedef struct st_9a59c_6 {
    struct st_9a59c_5 *field_0;
} st_9a59c_6;

typedef struct st_9a59c_0 {
    char field_0;
} st_9a59c_0;


void* sub_9a59c(st_9a59c_4 *a0, st_9a59c_3 *a1, st_9a59c_1 *a2, void* iter, unsigned long a4)
{
    unsigned long long v24;  // x28
    unsigned long long v25;  // x27
    unsigned long long v34;  // x30
    void* v35;  // x25
    void* v36;  // x26
    void* i;  // x19
    unsigned long v38;  // x9
    unsigned long long v39;  // x12
    unsigned int v40;  // w10
    void* v41;  // w14
    void* v42;  // w15
    unsigned long v43;  // cc_dep1
    unsigned long long v26;  // x26
    unsigned long v44;  // cc_dep2
    unsigned int v45;  // w8
    unsigned int v46;  // w10
    unsigned long long v47;  // 4112
    unsigned long long v48;  // 4108
    unsigned long long v49;  // 4112
    unsigned long long v50;  // 4108
    unsigned int v51;  // w9
    void* v52;  // w11
    void* v53;  // x27
    unsigned long long v27;  // x25
    void* v54;  // x8
    void* v55;  // x23
    void* v56;  // x22
    void* v57;  // x20
    void* v58;  // x20
    unsigned long long v59;  // x8
    void* v60;  // x26
    void* v61;  // x28
    unsigned int v62;  // w13
    st_9a59c_4 *v63;  // x20
    unsigned long long v28;  // x24
    st_9a59c_4 *v64;  // x0
    void* v65;  // x1
    void* v66;  // x2
    unsigned long v67;  // x8
    void* v68;  // x8
    unsigned long long v69;  // x9
    void* v70;  // x8
    void* v71;  // x24
    void* v72;  // x8
    void* v73;  // x27
    unsigned long long v29;  // x23
    st_9a59c_4 *v74;  // x20
    uint128_t *v75;  // x9
    uint128_t *node;  // x9
    uint128_t *v77;  // x10
    uint128_t *v78;  // x10
    st_9a59c_2 *v79;  // x8
    void* v80;  // x9
    unsigned long long v81;  // x9
    unsigned int v82;  // w10
    unsigned long long v83;  // x8
    unsigned long long v30;  // x22
    void* v84;  // x25
    st_9a59c_2 *v85;  // x8
    void* v86;  // x9
    unsigned long v87;  // cc_dep1
    unsigned long long v88;  // x10
    unsigned long v89;  // 4112
    unsigned long v90;  // cc_op
    unsigned long v91;  // cc_dep1
    unsigned long v92;  // 4112
    unsigned long long v93;  // 4114
    unsigned long long v31;  // x21
    void* v94;  // w9
    void* v95;  // w10
    unsigned long v96;  // cc_dep1
    void* v97;  // w8
    unsigned long long v98;  // 4112
    unsigned long long v99;  // 4112
    unsigned long long v100;  // 4112
    unsigned long long v101;  // 4108
    unsigned long long v102;  // 4112
    unsigned long long v103;  // 4108
    unsigned long long v32;  // x20
    void* v104;  // w9
    unsigned long long v33;  // x19
    void* v0;  // [bp-0xbc]
    void* v1;  // [bp-0xb8]
    void* v2;  // [bp-0xb4]
    unsigned long long v3;  // [bp-0xa8]
    unsigned int v4;  // [bp-0x9c]
    void* v5;  // [bp-0x98]
    st_9a59c_0 **v6;  // [bp-0x88], Other Possible Types: char
    st_9a59c_0 *v7;  // [bp-0x80]
    unsigned long v8;  // [bp-0x78]
    st_9a59c_6 **v9;  // [bp-0x70]
    st_9a59c_6 **v10;  // [bp-0x68]
    unsigned long long v11;  // [bp-0x60]
    unsigned long long v12;  // [bp-0x58]
    unsigned long long v13;  // [bp-0x50]
    unsigned long long v14;  // [bp-0x48]
    unsigned long long v15;  // [bp-0x40]
    unsigned long long v16;  // [bp-0x38]
    unsigned long long v17;  // [bp-0x30]
    unsigned long long v18;  // [bp-0x28]
    unsigned long long v19;  // [bp-0x20]
    unsigned long long v20;  // [bp-0x18]
    char *v21;  // [bp-0x10]
    unsigned long long v22;  // [bp-0x8]
    char v23;  // [bp+0x0]

    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = v32;
    v20 = v33;
    v21 = &v23;
    v22 = v34;
    v35 = iter;
    v7 = &v6;
    v6 = &v7;
    v36 = iter + a4;
    i = v36 - 8;
    v38 = a0->field_18;
    v39 = a0->field_8 + v38;
    v40 = a0->field_110;
    if (a0->field_110 >= 6)
        v40 = 6;
    if (4 >= v40)
        v40 = 4;
    v4 = v40;
    v41 = (void*)(int)a2->field_0;
    v42 = (void*)*(int *)((char *)&a2->field_0 + 4);
    v3 = v39;
    v43 = v35 & 0xffffffff;
    v44 = v39 & 0xffffffff;
    if ((unsigned int)v35 == (unsigned int)v39)
        iter += 1;
    v45 = (unsigned int)(iter - a0->field_8);
    v46 = 1 << ((char)a0->field_100 & 31);
    if (v46 < (unsigned int)(v45 - v38))
    {
        v47 = arm64g_calculate_condition(131, v43, v44, 0);
        v48 = arm64g_calculate_condition(3, (v47 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v48 & 1))
            goto LABEL_9a63a;
LABEL_9a639:
        v51 = v45 - v46;
    }
    else
    {
        v49 = arm64g_calculate_condition(131, v43, v44, 0);
        v50 = arm64g_calculate_condition(0, (v49 & 1 ? a0->field_28 : 0), 0, 0);
        if (v50 & 1)
            goto LABEL_9a639;
LABEL_9a63a:
        v51 = v38;
    }
    v52 = (void*)(v45 - v51);
    if (v52 < v42)
        v53 = 0;
    else
        v53 = v42;
    if (v52 < v41)
        v54 = 0;
    else
        v54 = v41;
    *(unsigned int *)&(a0->padding_114)[1] = 0;
    if (i > iter)
    {
        v0 = v52;
        v1 = v42;
        v2 = v41;
        v55 = v36 - 32;
        v5 = v36;
        do
        {
            v56 = v54;
            if ((unsigned int)v54 && (v57 = iter, v58 = v57 + 1, v59 = v56 & 0xffffffff, *(int *)((char *)v58 - v59) == (int)v57[1]))
            {
                v60 = sub_7cdfc(iter + 5, iter + 5 + -v59, v36) + 4;
                v61 = v56;
                v56 = v53;
                v62 = 1;
                iter = v58;
                goto LABEL_9a6d8;
            }
            v8 = 0x3b9ac9ff;
            v10 = &v9;
            v9 = &v10;
            if (v4 != 6)
            {
                v63 = a0;
                v64 = v63;
                v65 = iter;
                v66 = v36;
                if (v4 == 5)
                {
                    v60 = sub_a676c(v64, v65, v66, &v8);
                    v67 = v8;
                    if (v60)
                        v62 = v67;
                    else
                        v62 = 1;
                    if (3 < v60)
                        goto LABEL_9a9b4;
                }
                else
                {
                    v60 = sub_afae4(v64, v65, v66, &v8);
                    v67 = v8;
                    if (v60)
                        v62 = v67;
                    else
                        v62 = 1;
                    if (v60 > 3)
                    {
LABEL_9a9b4:
                        if (v67 >= 4)
                        {
                            if (iter > v35 && iter - v67 + 3 > v3)
                            {
                                v69 = 2 - v67;
                                v70 = iter;
                                do
                                {
                                    v71 = iter;
                                    v72 = v70 - 1;
                                    if (*((char *)v70 - 1) != *((char *)iter + v69))
                                        goto LABEL_9aa40;
                                } while ((v60 += 1, v72 > v35 && (iter = v72, v70 = v72, v3 < v71 + v69)));
                            }
                            else
                            {
LABEL_9aa40:
                                v72 = iter;
                            }
                            v61 = v62 - 3;
                            iter = v72;
                        }
                        else
                        {
                            v61 = v56;
                            v56 = v53;
                        }
LABEL_9a6d8:
                        v73 = iter - v35;
                        v10 = &v9;
                        v9 = &v10;
                        if (iter > v55)
                        {
                            sub_82208(a1->field_18, v35, iter, v55);
                            v74 = a0;
                        }
                        else
                        {
                            *a1->field_18 = *(int128_t *)v35;
                            v75 = a1->field_18;
                            v74 = a0;
                            if (v73 > 16)
                            {
                                v75[1] = (int128_t)v35[16];
                                if (v73 >= 33)
                                {
                                    node = v75 + 2;
                                    v77 = v35 + 48;
                                    do
                                    {
                                        *node = *(int128_t *)((char *)v77 - 16);
                                        v78 = v77 + 2;
                                        node[1] = *v77;
                                        node += 2;
                                        v77 = v78;
                                    } while (node < v75 + v73);
                                }
                            }
                            else
                            {
                                a1->field_18 = v75 + v73;
                                v79 = a1->field_8;
                                *(unsigned short *)&(&v79->field_0)[1] = (unsigned short)v73;
                                v79->field_0 = v62;
                                v80 = v60 - 3;
                                if (v80 >= 0x10000)
                                    goto LABEL_9a958;
LABEL_9a740:
                                *(unsigned short *)((char *)&(&v79->field_0)[1] + 2) = (unsigned short)v80;
                                a1->field_8 = &v79->field_4;
                                if (!*(int *)&(v74->padding_114)[1])
                                    goto LABEL_9a758;
                                goto LABEL_9a754;
                            }
                        }
                        a1->field_18 = a1->field_18 + v73;
                        v79 = a1->field_8;
                        if (0x10000 > v73)
                        {
                            *(unsigned short *)&(&v79->field_0)[1] = (unsigned short)v73;
                            v79->field_0 = v62;
                            v80 = v60 - 3;
                            if (0x10000 <= v80)
                                goto LABEL_9a958;
                            goto LABEL_9a740;
                        }
                        else
                        {
                            v81 = (char *)v79 - a1->field_0;
                            a1->field_48 = 1;
                            a1->field_4c = v81 >> 3;
                            *(unsigned short *)&(&v79->field_0)[1] = (unsigned short)v73;
                            v79->field_0 = v62;
                            v80 = v60 - 3;
                            if (v80 >= 0x10000)
                            {
LABEL_9a958:
                                v82 = (char *)v79 - a1->field_0 >> 3;
                                a1->field_48 = 2;
                                a1->field_4c = v82;
                                *(unsigned short *)((char *)&(&v79->field_0)[1] + 2) = (unsigned short)v80;
                                a1->field_8 = &v79->field_4;
                                if (!*(int *)&(v74->padding_114)[1])
                                    goto LABEL_9a758;
LABEL_9a754:
                                *(unsigned int *)&(v74->padding_114)[1] = 0;
LABEL_9a758:
                                iter += v60;
                                if (i >= iter)
                                {
                                    v36 = v5;
                                    if ((unsigned int)v56)
                                    {
                                        do
                                        {
                                            v53 = v61;
                                            v61 = v56;
                                            v83 = v56 & 0xffffffff;
                                            if (*(int *)iter != *(int *)((char *)iter - v83))
                                            {
                                                v35 = iter;
                                                v54 = v53;
                                                v53 = v61;
                                                break;
                                            }
                                            v84 = sub_7cdfc(iter + 4, iter + 4 + -v83, v36);
                                            v10 = &v9;
                                            v9 = &v10;
                                            if (iter > v55)
                                                sub_82208(a1->field_18, iter, iter, v55);
                                            else
                                                *a1->field_18 = *(int128_t *)iter;
                                            v85 = a1->field_8;
                                            *(unsigned short *)&(&v85->field_0)[1] = 0;
                                            v85->field_0 = 1;
                                            v86 = v84 + 1;
                                            v87 = v86;
                                            if (0x10000 <= v86)
                                            {
                                                v88 = (char *)v85 - a1->field_0;
                                                a1->field_48 = 2;
                                                a1->field_4c = v88 >> 3;
                                            }
                                            *(unsigned short *)((char *)&(&v85->field_0)[1] + 2) = (unsigned short)v86;
                                            a1->field_8 = &v85->field_4;
                                            iter += v84 + 4;
                                            if (iter <= i)
                                            {
                                                v89 = arm64g_calculate_condition(148, v87, 0x10000, 0);
                                                v90 = 3;
                                                v91 = (v89 & 1 ? v53 & 0xffffffff : 0x40000000);
                                            }
                                            else
                                            {
                                                v92 = arm64g_calculate_condition(148, v87, 0x10000, 0);
                                                v90 = 0;
                                                v91 = (v92 & 1 ? v53 & 0xffffffff : 0x40000000);
                                            }
                                            v56 = v53;
                                            v35 = iter;
                                            v54 = v61;
                                            v93 = arm64g_calculate_condition(v90 | 16, v91, 0, 0);
                                        } while (v93 & 1);
                                    }
                                    else
                                    {
                                        v35 = iter;
                                        v54 = v61;
                                        v53 = v56;
                                        goto LABEL_9a684;
                                    }
                                }
                                else
                                {
                                    v35 = iter;
                                    v54 = v61;
                                    v53 = v56;
                                    goto LABEL_9a930;
                                }
                                goto LABEL_9a930;
                            }
                        }
                    }
                }
            }
            else
            {
                v63 = a0;
                v60 = sub_b0a30(v63, iter, v36, &v8);
                v67 = v8;
                if (v60)
                    v62 = v67;
                else
                    v62 = 1;
                if (v60 > 3)
                    goto LABEL_9a9b4;
            }
            v68 = iter - v35;
            iter = iter + (v68 >> 8) + 1;
            *(unsigned int *)&(v63->padding_114)[1] = v68 > 0x7ff;
            v54 = v56;
LABEL_9a930:
            v36 = v5;
LABEL_9a684:
        } while (i > iter);
        v42 = v1;
        v41 = v2;
        v52 = v0;
    }
    if (v52 < v41)
        v94 = v41;
    else
        v94 = (void*)0;
    if (v52 < v42)
        v95 = v42;
    else
        v95 = (void*)0;
    v96 = v54 & 0xffffffff;
    if ((unsigned int)v54)
    {
        v97 = (void*)(unsigned int)v54;
        v98 = arm64g_calculate_condition(19, v96, 0, 0);
        if (!(v98 & 1))
            goto LABEL_9aaa2;
LABEL_9aaa1:
        v100 = arm64g_calculate_condition(19, v96, 0, 0);
        v101 = arm64g_calculate_condition(131, (v100 & 1 ? (unsigned long long)v41 : 0), (v100 & 1 ? (unsigned long long)v52 : 0), 0);
        if (!(v101 & 1))
            goto LABEL_9aaa6;
LABEL_9aaa5:
        v104 = v41;
    }
    else
    {
        v97 = v94;
        v99 = arm64g_calculate_condition(19, v96, 0, 0);
        if (v99 & 1)
            goto LABEL_9aaa1;
LABEL_9aaa2:
        v102 = arm64g_calculate_condition(19, v96, 0, 0);
        v103 = arm64g_calculate_condition(128, (v102 & 1 ? (unsigned long long)v41 : 0), (v102 & 1 ? (unsigned long long)v52 : 0), 0);
        if (v103 & 1)
            goto LABEL_9aaa5;
LABEL_9aaa6:
        v104 = v95;
    }
    if ((unsigned int)v53)
        v104 = (void*)(unsigned int)v53;
    *(unsigned int *)&a2->field_0 = (unsigned int)v97;
    *(unsigned int *)((char *)&a2->field_0 + 4) = (unsigned int)v104;
    return v36 - v35;
}
