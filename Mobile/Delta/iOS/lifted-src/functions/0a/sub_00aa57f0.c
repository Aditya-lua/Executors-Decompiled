/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa57f0..0xaa5a74 (644 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa57f0_0 {
    struct st_aa57f0_0 *field_0;
    char field_1;
    char padding_2[6];
    long long field_8;
    long long field_10;
    struct st_aa57f0_1 *field_18;
} st_aa57f0_0;

typedef struct st_aa57f0_1 {
    unsigned long long field_0;
} st_aa57f0_1;


st_aa57f0_0 * sub_aa57f0(st_aa57f0_0 *a0, st_aa57f0_0 *a1, st_aa57f0_0 *a2, st_aa57f0_0 *a3, st_aa57f0_0 *a4)
{
    st_aa57f0_0 *v4;  // x27
    st_aa57f0_0 *v5;  // x0
    st_aa57f0_0 *v14;  // x22
    unsigned int v15;  // w23
    st_aa57f0_0 *v16;  // x24
    st_aa57f0_0 *v17;  // w25
    int v18;  // w26
    st_aa57f0_0 *v19;  // x0
    st_aa57f0_0 *v20;  // x21
    int v21;  // w0
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    st_aa57f0_0 *v6;  // x0
    unsigned long long v24;  // 4108
    unsigned long long v25;  // 4108
    unsigned long long v26;  // 4105
    unsigned long long v27;  // 4105
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4112
    unsigned long long v31;  // 4102
    unsigned long long v32;  // 4112
    unsigned long long v33;  // 4102
    st_aa57f0_0 *v7;  // x0
    st_aa57f0_0 *v8;  // x20
    st_aa57f0_0 *v9;  // x0
    st_aa57f0_0 *v10;  // x0
    st_aa57f0_0 *v11;  // x21
    st_aa57f0_0 *v12;  // x21
    st_aa57f0_0 *v13;  // x0
    st_aa57f0_0 *v0;  // [bp-0x70]
    st_aa57f0_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a3)
    {
        v4 = a3->field_0;
        if (!a0)
            return 0;
    }
    else
    {
        v4 = 0;
        if (!a0)
            return 0;
    }
    if (a1 < 1)
    {
        return 0;
    }
    else if (a4)
    {
        v0 = a4;
        v1 = a3;
        if (sub_a68024(a0->field_0))
        {
            v5 = sub_a6afb8(64, 0);
            if (!(unsigned int)v5)
                return v5;
        }
        v6 = sub_a7c17c(a0->field_8);
        if (!(unsigned int)v6)
            return v6;
        v7 = sub_a7b720(*(long long *)&a0->field_1, a1);
        if (!v7)
        {
            sub_a7c1b4(a0->field_8);
            return 0;
        }
        v8 = v7;
        if (a2)
            v9 = sub_aa6be0(a0->field_0, a2, 0);
        else
            v9 = 0;
        v10 = sub_a6820c(a0->field_0, 14);
        if (v10 && v10->field_0)
        {
            if (v9)
            {
                v11 = sub_aa6fe0(v9);
                sub_aa6fd0(v9);
                v9 = v11;
                if (!v9)
                {
                    sub_a7c1b4(a0->field_8);
                    sub_aa6fd0(v11);
                    return 0;
                }
            }
            else
            {
                v11 = 0;
                v9 = v10->field_0;
            }
LABEL_aa5960:
            v14 = v9;
            v15 = sub_aa7930(v14);
            if ((int)sub_ad69e4(*(long long *)&v8->field_1) >= 1)
            {
                v13 = 0;
                v16 = 0;
                v17 = (st_aa57f0_0 *)0;
                v18 = -0x1;
                do
                {
                    v19 = sub_ad69f8(*(long long *)&v8->field_1, v16);
                    if (!v19 || v4 && v19->field_0 != v4)
                        continue;
                    v20 = v19;
                    v21 = sub_aa6e8c(v14, *(long long *)&v19->field_1);
                    v22 = v21;
                    v23 = v18;
                    if (v21 <= v18)
                    {
                        v17 = v17;
                        v24 = arm64g_calculate_condition(195, v22, v23, 0);
                        if (!(v24 & 1))
                            goto LABEL_aa59ae;
                        goto LABEL_aa59ad;
                    }
                    else
                    {
                        v17 = (st_aa57f0_0 *)1;
                        v25 = arm64g_calculate_condition(195, v22, v23, 0);
                        if (v25 & 1)
                        {
LABEL_aa59ad:
                            v18 = v21;
                            v26 = arm64g_calculate_condition(211, v22, v23, 0);
                            if (!(v26 & 1))
                                goto LABEL_aa59b2;
                            goto LABEL_aa59b1;
                        }
                        else
                        {
LABEL_aa59ae:
                            v27 = arm64g_calculate_condition(211, v22, v23, 0);
                            if (v27 & 1)
                            {
LABEL_aa59b1:
                                v28 = arm64g_calculate_condition(195, v22, v23, 0);
                                if (!(v28 & 1))
                                    goto LABEL_aa59b6;
                                goto LABEL_aa59b5;
                            }
                            else
                            {
LABEL_aa59b2:
                                v13 = v20;
                                v29 = arm64g_calculate_condition(195, v22, v23, 0);
                                if (v29 & 1)
                                {
LABEL_aa59b5:
                                    v30 = arm64g_calculate_condition(195, v22, v23, 0);
                                    v31 = arm64g_calculate_condition(3, (v30 & 1 ? v15 : 0), 0, 0);
                                    if (v31 & 1)
                                        v20->field_10();
                                }
                                else
                                {
LABEL_aa59b6:
                                    v32 = arm64g_calculate_condition(195, v22, v23, 0);
                                    v33 = arm64g_calculate_condition(0, (v32 & 1 ? v15 : 0), 0, 0);
                                    if (v33 & 1)
                                    {
                                        v13 = v20;
                                        v13->field_10();
                                    }
                                }
                            }
                        }
                    }
                } while ((v16 = (unsigned int)v16 + 1, (int)sub_ad69e4(*(long long *)&v8->field_1) > (int)(unsigned int)v16));
                if (v17)
                    v13->field_10();
            }
        }
        else
        {
            v11 = v9;
            if (v11)
                goto LABEL_aa5960;
            if ((int)sub_ad69e4(*(long long *)&v8->field_1) >= 1)
            {
                v12 = 0;
                do
                {
                    v13 = sub_ad69f8(*(long long *)&v8->field_1, v12);
                    if (v13 && (!v4 || v13->field_0 == v4))
                        v13->field_10();
                } while ((v12 = (unsigned int)v12 + 1, (int)sub_ad69e4(*(long long *)&v8->field_1) > (int)(unsigned int)v12));
            }
            v11 = 0;
        }
        sub_a7c1b4(a0->field_8);
        sub_aa6fd0(v11);
        return 0;
    }
    else
    {
        return 0;
    }
}
