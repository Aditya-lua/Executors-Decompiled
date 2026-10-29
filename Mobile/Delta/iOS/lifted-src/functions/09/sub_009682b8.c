/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9682b8..0x968444 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9682b8_1 {
    long long field_0;
    char padding_8[20];
    unsigned short field_1c;
} st_9682b8_1;

typedef struct st_9682b8_0 {
    struct st_9682b8_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_9682b8_0 *field_8;
    char padding_10[16];
    int field_20;
    int field_24;
} st_9682b8_0;

extern long long g_968444;
extern long long g_968490;

st_9682b8_0 * sub_9682b8(unsigned int a0, unsigned int a1, st_9682b8_0 *a2, st_9682b8_0 *a3, st_9682b8_0 *a4, st_9682b8_0 *a5)
{
    st_9682b8_0 *v2;  // x22
    st_9682b8_0 *iter;  // x23
    unsigned long v12;  // 4112
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long long v16;  // 4112
    unsigned long v17;  // 4112
    unsigned long long v18;  // 4112
    unsigned long v19;  // 4112
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    st_9682b8_0 *v4;  // x0
    unsigned long long v22;  // 4102
    unsigned long v23;  // 4112
    unsigned long long v24;  // 4102
    unsigned int v25;  // w8
    unsigned long v26;  // 4112
    unsigned long v27;  // cc_op
    unsigned long v28;  // cc_dep1
    unsigned long v29;  // cc_dep2
    unsigned long long v30;  // 4112
    unsigned long v31;  // 4112
    st_9682b8_0 *v5;  // x19
    unsigned long long v32;  // 4112
    unsigned long long v33;  // 4112
    unsigned long long v34;  // 4102
    unsigned long long v35;  // 4112
    unsigned long long v36;  // 4102
    st_9682b8_0 *v37;  // x0
    st_9682b8_0 *v38;  // x27
    st_9682b8_0 *v39;  // w0
    st_9682b8_0 *v40;  // x22
    st_9682b8_0 *v41;  // x24
    st_9682b8_0 *v6;  // x28
    st_9682b8_1 **v42;  // x0
    unsigned int v43;  // w25
    st_9682b8_0 *v44;  // x20
    unsigned long v7;  // cc_op
    st_9682b8_0 *i;  // cc_dep1
    st_9682b8_0 *v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned int v11;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
    {
        return 0;
    }
    else if (a5)
    {
        v2 = a3;
        iter = a2;
        v4 = sub_ad6270(&g_968444);
        if (!v4)
            return v4;
        v5 = v4;
        if (v2)
        {
            v6 = 0;
            do
            {
                v11 = *(int *)&iter->padding_10[8];
                if ((int)a1 < (int)v11)
                {
                    v12 = arm64g_calculate_condition(v7 | 192, i, v9, v10);
                    v13 = 3;
                    v14 = (v12 & 1 ? a1 : 0x80000000);
                    v15 = v12 & 1;
                    v16 = arm64g_calculate_condition(163, v14, v15, 0);
                    if (!(v16 & 1))
                        goto LABEL_96833e;
                    goto LABEL_96833d;
                }
                else
                {
                    v17 = arm64g_calculate_condition(v7 | 192, i, v9, v10);
                    v13 = 0;
                    v14 = (v17 & 1 ? a1 : 0x80000000);
                    v15 = v17 & 1;
                    v18 = arm64g_calculate_condition(160, v14, v15, 0);
                    if (v18 & 1)
                    {
LABEL_96833d:
                        v19 = arm64g_calculate_condition(v13 | 160, v14, v15, 0);
                        v20 = 3;
                        v21 = (v19 & 1 ? v11 : 0x40000000);
                        v22 = arm64g_calculate_condition(195, v21, 0, 0);
                        if (v22 & 1)
                            continue;
                        goto LABEL_968344;
                    }
                    else
                    {
LABEL_96833e:
                        v23 = arm64g_calculate_condition(v13 | 160, v14, v15, 0);
                        v20 = 0;
                        v21 = (v23 & 1 ? v11 : 0x40000000);
                        v24 = arm64g_calculate_condition(192, v21, 0, 0);
                        if (v24 & 1)
                            continue;
LABEL_968344:
                        v25 = *(int *)&iter->padding_10[12];
                        if ((int)v25 < (int)a0)
                        {
                            v26 = arm64g_calculate_condition(v20 | 176, v21, 0, 0);
                            v27 = 3;
                            v28 = (v26 & 1 ? a0 : 0x80000000);
                            v29 = v26 & 1;
                            v30 = arm64g_calculate_condition(163, v28, v29, 0);
                            if (!(v30 & 1))
                                goto LABEL_968352;
                            goto LABEL_968351;
                        }
                        else
                        {
                            v31 = arm64g_calculate_condition(v20 | 176, v21, 0, 0);
                            v27 = 0;
                            v28 = (v31 & 1 ? a0 : 0x80000000);
                            v29 = v31 & 1;
                            v32 = arm64g_calculate_condition(160, v28, v29, 0);
                            if (v32 & 1)
                            {
LABEL_968351:
                                v33 = arm64g_calculate_condition(v27 | 160, v28, v29, 0);
                                v34 = arm64g_calculate_condition(195, (v33 & 1 ? v25 : 0x40000000), 0, 0);
                                if (v34 & 1)
                                    continue;
                                goto LABEL_968358;
                            }
                            else
                            {
LABEL_968352:
                                v35 = arm64g_calculate_condition(v27 | 160, v28, v29, 0);
                                v36 = arm64g_calculate_condition(192, (v35 & 1 ? v25 : 0x40000000), 0, 0);
                                if (v36 & 1)
                                    continue;
LABEL_968358:
                                v37 = sub_a6bf4c(16, "ssl/t1_lib.c", 970);
                                if (!v37)
                                    goto LABEL_96839c;
                                v38 = v37;
                                v37->field_0 = iter;
                                *(st_9682b8_0 **)&v37->field_1 = v6;
                                if (0 >= (int)sub_ad68a0(v5, v38))
                                {
                                    sub_a6c2e4(v38, "ssl/t1_lib.c", 975);
                                    goto LABEL_96839c;
                                }
                            }
                        }
                    }
                }
                v9 = (char *)&v6->field_0 + 1;
                iter = &iter[1].field_1;
                v7 = 4;
                v10 = 0;
                v6 = v9;
                i = v2;
            } while (i != v6);
        }
        sub_ad6ae4(v5);
        v39 = (st_9682b8_0 *)(unsigned int)sub_ad69e4(v5);
        if (v39)
        {
            v40 = 0;
            v41 = (st_9682b8_0 *)0;
            while (1)
            {
                v42 = sub_ad69f8(v5, v40);
                v43 = *v42->field_1c;
                if ((a4 || v43 != (unsigned int)v41) && (v41 = (st_9682b8_0 *)(unsigned short)v43, (int)sub_ad68a0(a5, *v42->field_0) < 1))
                    break;
                v40 = (char *)&v40->field_0 + 1;
                if (v39 == v40)
                    goto LABEL_968410;
            }
LABEL_96839c:
            v44 = 0;
        }
        else
        {
LABEL_968410:
            v44 = 1;
        }
        sub_ad6958(v5, &g_968490);
        return v44;
    }
    else
    {
        return 0;
    }
}
