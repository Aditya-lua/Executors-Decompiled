/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96a5ac..0x96a920 (884 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96a5ac_1 {
    char padding_0[1616];
    unsigned long long field_650;
    char field_658;
    char padding_659[7];
    struct st_96a5ac_0 *field_660;
    char field_668;
} st_96a5ac_1;

typedef struct st_96a5ac_0 {
    char padding_0[16];
    unsigned short field_10;
} st_96a5ac_0;

typedef struct st_96a5ac_5 {
    unsigned short field_0;
} st_96a5ac_5;

typedef struct st_96a5ac_3 {
    int field_0;
    char padding_4[212];
    struct st_96a5ac_2 *field_d8;
} st_96a5ac_3;

typedef struct st_96a5ac_6 {
    char padding_0[8];
    struct st_96a5ac_1 *field_8;
    char padding_10[8];
    struct st_96a5ac_3 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[868];
    struct st_96a5ac_5 *field_3e0;
    char padding_3e8[8];
    unsigned long long field_3f0;
    char padding_3f8[16];
    long long field_408;
    char padding_410[1136];
    struct st_96a5ac_4 *field_880;
    char padding_888[298];
    char field_9b2;
} st_96a5ac_6;

typedef struct st_96a5ac_2 {
    char padding_0[80];
    char field_50;
} st_96a5ac_2;

typedef struct st_96a5ac_4 {
    char padding_0[28];
    unsigned short field_1c[2];
    char field_1e;
    char padding_1f[33];
    char field_40;
    char padding_41[7];
    char field_48;
    char padding_49[7];
    struct st_96a5ac_5 *field_50;
} st_96a5ac_4;

extern char g_d282a4;
extern char g_d282a6;

char sub_96a5ac(st_96a5ac_6 *a0)
{
    long long v3;  // x20
    st_96a5ac_4 *v4;  // x22
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4102
    unsigned long v17;  // 4112
    unsigned long long v18;  // 4102
    char v19;  // x9
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4112
    unsigned int v5;  // w21
    unsigned long long v23;  // 4102
    st_96a5ac_4 *v24;  // x10
    char v25;  // w8
    unsigned long v26;  // cc_dep1
    unsigned long long v27;  // 4105
    unsigned long long v28;  // 4105
    char v29;  // w10
    unsigned long v30;  // cc_dep1
    unsigned short *v31;  // x23
    unsigned long long v32;  // 4105
    unsigned short *v6;  // x8
    unsigned long long v33;  // 4105
    char v34;  // x24
    unsigned long long v35;  // 4105
    unsigned long long v36;  // 4105
    unsigned long v37;  // x25
    unsigned long long v38;  // 4105
    unsigned long long v39;  // 4105
    unsigned short *v40;  // x26
    char v41;  // x21
    char v42;  // x22
    unsigned long v7;  // cc_op
    unsigned short *v43;  // x27
    unsigned long v44;  // x8
    st_96a5ac_0 *v45;  // x2
    unsigned long v46;  // x8
    char v47;  // w0
    unsigned long v48;  // x9
    unsigned short *v49;  // x10
    unsigned long v50;  // x9
    char v51;  // x0
    char v52;  // x27
    unsigned long v8;  // cc_dep1
    char v53;  // x28
    char iter;  // x23
    st_96a5ac_1 *v55;  // x10
    unsigned long v56;  // x8
    st_96a5ac_0 *v57;  // x22
    unsigned long v58;  // x8
    char v59;  // w0
    unsigned long v60;  // x9
    unsigned short *v61;  // x10
    unsigned long v62;  // x9
    unsigned long v9;  // cc_dep2
    char v63;  // x22
    unsigned long idx;  // x21
    unsigned long v10;  // cc_ndep
    unsigned long v11;  // 4112
    unsigned long v12;  // cc_op
    unsigned short *v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_408;
    v4 = a0->field_880;
    v5 = (unsigned int)(v4->field_1c & 0x30000);
    sub_a6c2e4(*(long long *)&a0[2].padding_7c[422], "ssl/t1_lib.c", 3475);
    *(uint128_t *)&a0[2].padding_7c[422] = 0;
    if (!a0->field_78)
    {
        v6 = *(long long *)&v4->padding_49[5];
        if (v6)
        {
            v11 = arm64g_calculate_condition(v7 | 16, v8, v9, v10);
            v12 = 3;
            v13 = (v11 & 1 ? v5 : 0);
            v14 = 0;
            v15 = 0;
            v16 = arm64g_calculate_condition(3, v13, 0, 0);
            if (v16 & 1)
                goto LABEL_96a684;
            goto LABEL_96a618;
        }
        else
        {
            v17 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
            v12 = 0;
            v13 = (v17 & 1 ? v5 : 0);
            v14 = 0;
            v15 = 0;
            v18 = arm64g_calculate_condition(0, v13, 0, 0);
            if (!(v18 & 1))
                goto LABEL_96a618;
LABEL_96a684:
            v19 = (char)v4->field_50;
        }
    }
    else
    {
LABEL_96a618:
        v6 = *(long long *)&v4->padding_1f[31];
        if (v6)
        {
            v20 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
            v21 = arm64g_calculate_condition(3, (v20 & 1 ? v5 : 0), 0, 0);
            if (v21 & 1)
                goto LABEL_96a654;
LABEL_96a628:
            v24 = a0->field_880;
            v25 = v24->field_1c[1] & 3;
            if (1 < v25)
            {
                v26 = v25 & 0xffff;
                if (v25 == 2)
                {
                    v6 = &g_d282a6;
                    v27 = arm64g_calculate_condition(3, v26, 2, 0);
                    if (!(v27 & 1))
                        goto LABEL_96a67e;
LABEL_96a67d:
                    v19 = 1;
                }
                else
                {
                    v6 = &g_d282a4;
                    v28 = arm64g_calculate_condition(3, v26, 2, 0);
                    if (v28 & 1)
                        goto LABEL_96a67d;
LABEL_96a67e:
                    v19 = 2;
                }
            }
            else if (v25)
            {
                v6 = &g_d282a4;
                v19 = 1;
            }
            else if (a0->field_78 || (v6 = *(long long *)&v24->padding_49[5], !v6))
            {
                v6 = *(long long *)&v24->padding_1f[31];
                if (v6)
                {
                    v19 = *(long long *)&v24->padding_41[5];
                }
                else
                {
                    v6 = *(long long *)&a0->field_8->field_668;
                    v19 = *(long long *)&a0->field_8->field_658;
                }
            }
            else
            {
                v19 = (char)v24->field_50;
            }
        }
        else
        {
            v22 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
            v23 = arm64g_calculate_condition(0, (v22 & 1 ? v5 : 0), 0, 0);
            if (!(v23 & 1))
                goto LABEL_96a628;
LABEL_96a654:
            v19 = *(long long *)&v4->padding_41[5];
        }
    }
    v29 = a0->field_9b2 & 64 | v5;
    v30 = v29;
    if (v29)
    {
        v31 = a0->field_3e0;
        v32 = arm64g_calculate_condition(19, v30, 0, 0);
        if (!(v32 & 1))
            goto LABEL_96a6d6;
LABEL_96a6d5:
        v34 = v19;
        v35 = arm64g_calculate_condition(19, v30, 0, 0);
        if (!(v35 & 1))
            goto LABEL_96a6da;
LABEL_96a6d9:
        v37 = a0->field_3f0;
        v38 = arm64g_calculate_condition(19, v30, 0, 0);
        if (!(v38 & 1))
            goto LABEL_96a6de;
LABEL_96a6dd:
        v40 = v6;
    }
    else
    {
        v31 = v6;
        v33 = arm64g_calculate_condition(19, v30, 0, 0);
        if (v33 & 1)
            goto LABEL_96a6d5;
LABEL_96a6d6:
        v34 = a0->field_3f0;
        v36 = arm64g_calculate_condition(19, v30, 0, 0);
        if (v36 & 1)
            goto LABEL_96a6d9;
LABEL_96a6da:
        v37 = v19;
        v39 = arm64g_calculate_condition(19, v30, 0, 0);
        if (v39 & 1)
            goto LABEL_96a6dd;
LABEL_96a6de:
        v40 = a0->field_3e0;
    }
    if (v34)
    {
        v41 = 0;
        v42 = 0;
        v43 = v40;
        do
        {
            v44 = a0->field_8->field_650;
            if (a0->field_8->field_650)
            {
                v45 = a0->field_8->field_660;
                do
                {
                    v46 = v44;
                    if (v45->field_10 == *v43 && *(int *)&v45[2].padding_0[8])
                    {
                        v47 = sub_96b14c(a0, 0x5000c);
                        if (v37 && v47)
                        {
                            v48 = v37;
                            v49 = v31;
                            do
                            {
                                v50 = v48;
                                if (*v43 == *v49)
                                {
                                    v41 += 1;
                                    break;
                                }
                            } while ((v49 += 1, v48 = v50 - 1, v50 != 1));
                        }
                    }
                } while ((v45 += 4, v44 = v46 - 1, v46 != 1));
            }
        } while ((v42 += 1, v43 += 1, v42 != v34));
        if (v41)
        {
            v51 = sub_a6bf4c(v41 * 8, "ssl/t1_lib.c", 3500);
            if (!v51)
                return v51;
            v41 = v51;
            v0 = v31;
            v52 = 0;
            v53 = 0;
            iter = v51;
            do
            {
                v55 = a0->field_8;
                v56 = v55->field_650;
                if (v55->field_650)
                {
                    v57 = v55->field_660;
                    do
                    {
                        v58 = v56;
                        if (v57->field_10 == *v40 && *(int *)&v57[2].padding_0[8])
                        {
                            v59 = sub_96b14c(a0, 0x5000c, v57);
                            if (v37 && v59)
                            {
                                v60 = v37;
                                v61 = v0;
                                do
                                {
                                    v62 = v60;
                                    if (*v40 == *v61)
                                    {
                                        v52 += 1;
                                        if (iter)
                                        {
                                            *(st_96a5ac_0 **)iter = v57;
                                            iter += 8;
                                            break;
                                        }
                                    }
                                } while ((v61 += 1, v60 = v62 - 1, v62 != 1));
                            }
                        }
                    } while ((v57 += 4, v56 = v58 - 1, v58 != 1));
                }
            } while ((v53 += 1, v40 += 1, v53 != v34));
        }
        else
        {
            v52 = 0;
        }
    }
    else
    {
        v52 = 0;
        v41 = 0;
    }
    *(unsigned long long *)&a0[2].padding_7c[422] = v41;
    *(unsigned long long *)&a0[2].padding_7c[430] = v52;
    if (*(long long *)&a0->padding_7c[156])
        _bzero(v3, *(long long *)&a0->padding_7c[156] * 4);
    if (v52)
    {
        v63 = 0;
        do
        {
            idx = *(int *)(*(long long *)(*(long long *)&a0[2].padding_7c[422] + v63 * 8) + 32);
            if ((a0->field_18->field_d8->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000 || *(int *)(*(long long *)(*(long long *)&a0[2].padding_7c[422] + v63 * 8) + 28) != 6) && !*(int *)(v3 + idx * 4) && !sub_95c3fc(a0->field_8, idx))
                *(unsigned int *)(v3 + idx * 4) = 258;
        } while ((v63 += 1, (unsigned long long)*(long long *)&a0[2].padding_7c[430] > v63));
    }
    return 1;
}
