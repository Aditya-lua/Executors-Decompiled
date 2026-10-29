/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7b924..0xa7bbe0 (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7b924_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_a7b924_0 *field_10;
    char field_18;
    char padding_19[15];
    struct st_a7b924_0 *field_28;
    char field_30;
    char padding_31[15];
    struct st_a7b924_0 *field_40;
    char field_48;
    char padding_49[15];
    struct st_a7b924_0 *field_58;
    char field_60;
    char padding_61[15];
    struct st_a7b924_0 *field_70;
    char field_78;
    char padding_79[15];
    struct st_a7b924_0 *field_88;
    char field_90;
    char padding_91[15];
    struct st_a7b924_0 *field_a0;
    char field_a8;
    char padding_a9[15];
    struct st_a7b924_0 *field_b8;
    char field_c0;
    char padding_c1[15];
    struct st_a7b924_0 *field_d0;
    char field_d8;
    char padding_d9[15];
    struct st_a7b924_0 *field_e8;
} st_a7b924_1;

typedef struct st_a7b924_2 {
    unsigned long long field_0;
    char padding_8[8];
    struct st_a7b924_0 *field_10;
} st_a7b924_2;

typedef struct st_a7b924_0 {
    char padding_0[8];
    long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned int field_20;
} st_a7b924_0;

extern long long g_a7bc08;

int sub_a7b924(st_a7b924_0 *a0)
{
    long long *v2;  // x0
    st_a7b924_1 *count;  // x0
    unsigned long long v12;  // 4120
    unsigned long long v13;  // 4120
    unsigned long v14;  // 4110
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long long v17;  // 4109
    unsigned long v18;  // 4110
    unsigned long long v19;  // 4109
    unsigned int v20;  // w13
    unsigned long long v21;  // 4120
    st_a7b924_1 *iter;  // x19
    unsigned long long v22;  // 4120
    unsigned long v23;  // 4110
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    unsigned long long v26;  // 4109
    unsigned long v27;  // 4110
    unsigned long long v28;  // 4109
    unsigned int v29;  // w12
    unsigned long long v30;  // 4120
    unsigned long long v31;  // 4120
    unsigned int v5;  // x0
    unsigned long v32;  // 4110
    unsigned long v33;  // cc_op
    unsigned long v34;  // cc_dep1
    unsigned long long v35;  // 4109
    unsigned long v36;  // 4110
    unsigned long long v37;  // 4109
    unsigned int v38;  // w11
    unsigned long long v39;  // 4120
    unsigned long long v40;  // 4120
    unsigned long v41;  // 4110
    unsigned int v6;  // w15
    unsigned long v42;  // cc_op
    unsigned long v43;  // cc_dep1
    unsigned long long v44;  // 4109
    unsigned long v45;  // 4110
    unsigned long long v46;  // 4109
    unsigned int v47;  // w10
    unsigned long long v48;  // 4120
    unsigned long long v49;  // 4120
    unsigned long v50;  // 4110
    unsigned long v51;  // cc_op
    unsigned int v7;  // w16
    unsigned long v52;  // cc_dep1
    unsigned long long v53;  // 4109
    unsigned long v54;  // 4110
    unsigned long long v55;  // 4109
    unsigned int v56;  // w9
    unsigned long long v57;  // 4120
    unsigned long long v58;  // 4120
    unsigned long v59;  // 4110
    unsigned long v60;  // cc_op
    unsigned long v61;  // cc_dep1
    unsigned int v8;  // w17
    unsigned long long v62;  // 4109
    unsigned long v63;  // 4110
    unsigned long long v64;  // 4109
    unsigned long v65;  // 4112
    unsigned long v66;  // cc_op
    unsigned long v67;  // cc_dep1
    unsigned long v68;  // cc_dep2
    unsigned long v69;  // 4112
    unsigned long long v70;  // 4113
    unsigned long v71;  // x8
    unsigned int v9;  // w14
    unsigned long v72;  // x10
    st_a7b924_2 *v73;  // x8
    unsigned long v10;  // cc_dep1
    unsigned int v11;  // w14
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a684ec(a0->field_8);
    count = _pthread_getspecific(*v2);
    iter = count;
    if (!iter)
    {
        v5 = sub_a6bffc(240, "crypto/threads_pthread.c", 318);
        if (!v5)
            sub_a69928("assertion failed: data != NULL", "crypto/threads_pthread.c", 319);
        iter = (st_a7b924_1 *)v5;
        _pthread_setspecific(*v2, iter);
        count = sub_a6bce8(0, a0->field_8, &g_a7bc08);
    }
    if (iter->field_10 != a0)
    {
        if (iter->field_28 == a0)
        {
            iter = &iter->field_18;
        }
        else if (iter->field_40 == a0)
        {
            iter = &iter->field_30;
        }
        else if (iter->field_58 == a0)
        {
            iter = &iter->field_48;
        }
        else if (iter->field_70 == a0)
        {
            iter = &iter->field_60;
        }
        else if (iter->field_88 == a0)
        {
            iter = &iter->field_78;
        }
        else if (iter->field_a0 == a0)
        {
            iter = &iter->field_90;
        }
        else if (iter->field_b8 == a0)
        {
            iter = &iter->field_a8;
        }
        else if (iter->field_d0 != a0)
        {
            if (iter->field_e8 != a0)
            {
                v6 = !*(long long *)&iter->field_18;
                v7 = iter->padding_0 != 0;
                if (!iter->padding_0)
                    v8 = 0;
                else
                    v8 = 0xffffffff;
                v9 = !*(long long *)&iter->field_30 & ~(v6 & v7);
                if (v6 & v7)
                    v8 = 1;
                v10 = v9 & v7;
                if (v9 & v7)
                {
                    v11 = 2;
                    v12 = arm64g_calculate_condition(1, 2, 1, 0);
                    if (!(v12 & 1))
                        goto LABEL_a7ba66;
LABEL_a7ba65:
                    v14 = arm64g_calculate_condition(9, v10, 0, 0);
                    v15 = 4;
                    v16 = (v14 & 1 ? *(long long *)&iter->field_48 : 0);
                    v17 = arm64g_calculate_condition(4, v16, 0, 0);
                    if (!(v17 & 1))
                        goto LABEL_a7ba6e;
LABEL_a7ba6d:
                    v20 = 3;
                    v21 = arm64g_calculate_condition(1, 3, 1, 0);
                    if (!(v21 & 1))
                        goto LABEL_a7ba76;
LABEL_a7ba75:
                    v23 = arm64g_calculate_condition(v15, v16, 0, 0);
                    v24 = 4;
                    v25 = (v23 & 1 ? *(long long *)&iter->field_60 : 0);
                    v26 = arm64g_calculate_condition(4, v25, 0, 0);
                    if (!(v26 & 1))
                        goto LABEL_a7ba7e;
                    goto LABEL_a7ba7d;
                }
                else
                {
                    v11 = v8;
                    v13 = arm64g_calculate_condition(1, v11, 1, 0);
                    if (v13 & 1)
                        goto LABEL_a7ba65;
LABEL_a7ba66:
                    v18 = arm64g_calculate_condition(9, v10, 0, 0);
                    v15 = 0;
                    v16 = (v18 & 1 ? *(long long *)&iter->field_48 : 0);
                    v19 = arm64g_calculate_condition(0, v16, 0, 0);
                    if (v19 & 1)
                        goto LABEL_a7ba6d;
LABEL_a7ba6e:
                    v20 = v11;
                    v22 = arm64g_calculate_condition(1, v20, 1, 0);
                    if (v22 & 1)
                        goto LABEL_a7ba75;
LABEL_a7ba76:
                    v27 = arm64g_calculate_condition(v15, v16, 0, 0);
                    v24 = 0;
                    v25 = (v27 & 1 ? *(long long *)&iter->field_60 : 0);
                    v28 = arm64g_calculate_condition(0, v25, 0, 0);
                    if (v28 & 1)
                    {
LABEL_a7ba7d:
                        v29 = 4;
                        v30 = arm64g_calculate_condition(1, 4, 1, 0);
                        if (!(v30 & 1))
                            goto LABEL_a7ba86;
                        goto LABEL_a7ba85;
                    }
                    else
                    {
LABEL_a7ba7e:
                        v29 = v20;
                        v31 = arm64g_calculate_condition(1, v29, 1, 0);
                        if (v31 & 1)
                        {
LABEL_a7ba85:
                            v32 = arm64g_calculate_condition(v24, v25, 0, 0);
                            v33 = 4;
                            v34 = (v32 & 1 ? *(long long *)&iter->field_78 : 0);
                            v35 = arm64g_calculate_condition(4, v34, 0, 0);
                            if (!(v35 & 1))
                                goto LABEL_a7ba8e;
                            goto LABEL_a7ba8d;
                        }
                        else
                        {
LABEL_a7ba86:
                            v36 = arm64g_calculate_condition(v24, v25, 0, 0);
                            v33 = 0;
                            v34 = (v36 & 1 ? *(long long *)&iter->field_78 : 0);
                            v37 = arm64g_calculate_condition(0, v34, 0, 0);
                            if (v37 & 1)
                            {
LABEL_a7ba8d:
                                v38 = 5;
                                v39 = arm64g_calculate_condition(1, 5, 1, 0);
                                if (!(v39 & 1))
                                    goto LABEL_a7ba96;
                                goto LABEL_a7ba95;
                            }
                            else
                            {
LABEL_a7ba8e:
                                v38 = v29;
                                v40 = arm64g_calculate_condition(1, v38, 1, 0);
                                if (v40 & 1)
                                {
LABEL_a7ba95:
                                    v41 = arm64g_calculate_condition(v33, v34, 0, 0);
                                    v42 = 4;
                                    v43 = (v41 & 1 ? *(long long *)&iter->field_90 : 0);
                                    v44 = arm64g_calculate_condition(4, v43, 0, 0);
                                    if (!(v44 & 1))
                                        goto LABEL_a7ba9e;
                                    goto LABEL_a7ba9d;
                                }
                                else
                                {
LABEL_a7ba96:
                                    v45 = arm64g_calculate_condition(v33, v34, 0, 0);
                                    v42 = 0;
                                    v43 = (v45 & 1 ? *(long long *)&iter->field_90 : 0);
                                    v46 = arm64g_calculate_condition(0, v43, 0, 0);
                                    if (v46 & 1)
                                    {
LABEL_a7ba9d:
                                        v47 = 6;
                                        v48 = arm64g_calculate_condition(1, 6, 1, 0);
                                        if (!(v48 & 1))
                                            goto LABEL_a7baa6;
                                        goto LABEL_a7baa5;
                                    }
                                    else
                                    {
LABEL_a7ba9e:
                                        v47 = v38;
                                        v49 = arm64g_calculate_condition(1, v47, 1, 0);
                                        if (v49 & 1)
                                        {
LABEL_a7baa5:
                                            v50 = arm64g_calculate_condition(v42, v43, 0, 0);
                                            v51 = 4;
                                            v52 = (v50 & 1 ? *(long long *)&iter->field_a8 : 0);
                                            v53 = arm64g_calculate_condition(4, v52, 0, 0);
                                            if (!(v53 & 1))
                                                goto LABEL_a7baae;
                                            goto LABEL_a7baad;
                                        }
                                        else
                                        {
LABEL_a7baa6:
                                            v54 = arm64g_calculate_condition(v42, v43, 0, 0);
                                            v51 = 0;
                                            v52 = (v54 & 1 ? *(long long *)&iter->field_a8 : 0);
                                            v55 = arm64g_calculate_condition(0, v52, 0, 0);
                                            if (v55 & 1)
                                            {
LABEL_a7baad:
                                                v56 = 7;
                                                v57 = arm64g_calculate_condition(1, 7, 1, 0);
                                                if (!(v57 & 1))
                                                    goto LABEL_a7bab6;
                                                goto LABEL_a7bab5;
                                            }
                                            else
                                            {
LABEL_a7baae:
                                                v56 = v47;
                                                v58 = arm64g_calculate_condition(1, v56, 1, 0);
                                                if (v58 & 1)
                                                {
LABEL_a7bab5:
                                                    v59 = arm64g_calculate_condition(v51, v52, 0, 0);
                                                    v60 = 4;
                                                    v61 = (v59 & 1 ? *(long long *)&iter->field_c0 : 0);
                                                    v62 = arm64g_calculate_condition(4, v61, 0, 0);
                                                    if (!(v62 & 1))
                                                        goto LABEL_a7babe;
                                                    goto LABEL_a7babd;
                                                }
                                                else
                                                {
LABEL_a7bab6:
                                                    v63 = arm64g_calculate_condition(v51, v52, 0, 0);
                                                    v60 = 0;
                                                    v61 = (v63 & 1 ? *(long long *)&iter->field_c0 : 0);
                                                    v64 = arm64g_calculate_condition(0, v61, 0, 0);
                                                    if (v64 & 1)
                                                    {
LABEL_a7babd:
                                                        v56 = 8;
                                                    }
                                                    else
                                                    {
LABEL_a7babe:
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!*(long long *)&iter->field_d8)
                {
                    v65 = arm64g_calculate_condition(v60, v61, 0, 0);
                    v66 = 1;
                    v67 = (v65 & 1 ? v56 : 0);
                    v68 = v65 & 1;
                }
                else
                {
                    v69 = arm64g_calculate_condition(v60, v61, 0, 0);
                    v66 = 0;
                    v67 = (v69 & 1 ? v56 : 0);
                    v68 = v69 & 1;
                }
                v70 = arm64g_calculate_condition(v66 | 16, v67, v68, 0);
                v71 = v56;
                v72 = a0->field_20;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                while (1)
                {
                    /* unsupported instruction */;
                    if ((unsigned int)v72 == a0->field_20)
                        break;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v72 = a0->field_20;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                }
                if (!(v70 & 1))
                    v71 = 9;
                v73 = &(iter->padding_0)[3 * v71];
                v73->field_0 = a0->field_10 + v72 * 8;
                *(unsigned int *)&v73->padding_8[0] = 1;
                v73->field_10 = a0;
                return (unsigned int)count;
            }
            iter = &iter->field_d8;
        }
        else
        {
            iter = &iter->field_c0;
        }
    }
    iter->field_8 = iter->field_8 + 1;
    return (unsigned int)count;
}
