/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95b8e4..0x95bb8c (680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95b8e4_3 {
    struct st_95b8e4_1 *field_0;
    struct st_95b8e4_2 *field_8;
} st_95b8e4_3;

typedef struct st_95b8e4_2 {
    char padding_0[16];
    unsigned long long field_10;
} st_95b8e4_2;

typedef struct st_95b8e4_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_95b8e4_1;

typedef struct st_95b8e4_0 {
    void* field_0;
    char padding_8[8];
    struct st_95b8e4_1 *field_10;
    struct st_95b8e4_2 *field_18;
} st_95b8e4_0;


unsigned long long sub_95b8e4(unsigned long long a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, unsigned int a7, unsigned int a8, st_95b8e4_0 **a9, st_95b8e4_2 **a10)
{
    unsigned int v0;  // w11
    unsigned int v1;  // w12
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long long v12;  // 4102
    unsigned long v13;  // 4110
    unsigned long long v14;  // 4102
    st_95b8e4_0 *v15;  // x20
    unsigned long v16;  // x13
    unsigned long long v17;  // w14
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4107
    st_95b8e4_0 *v2;  // x19
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4107
    unsigned long long v22;  // x16
    unsigned long v23;  // x17
    void* v24;  // x20
    st_95b8e4_1 *v25;  // x20
    st_95b8e4_2 *v26;  // x21
    st_95b8e4_0 *v27;  // x21
    st_95b8e4_3 *v28;  // x21
    st_95b8e4_1 *v29;  // x20
    st_95b8e4_2 *v3;  // x10
    st_95b8e4_2 *v30;  // x19
    st_95b8e4_1 *v31;  // x21
    st_95b8e4_2 *v32;  // x20
    st_95b8e4_1 *v33;  // x21
    st_95b8e4_2 *v34;  // x20
    st_95b8e4_1 *v35;  // x21
    st_95b8e4_2 *v36;  // x22
    unsigned long v4;  // cc_dep1
    st_95b8e4_2 *v5;  // x11
    unsigned long long v6;  // 4105
    unsigned long long v7;  // 4105
    st_95b8e4_0 *v8;  // x12
    unsigned long v9;  // 4110

    v0 = a7 != 3;
    v1 = a7 != 6;
    v2 = *a9;
    v3 = *a10;
    v4 = v0 & v1;
    if (v0 & v1)
    {
        v5 = v3;
        v6 = arm64g_calculate_condition(25, v4, 0, 0);
        if (!(v6 & 1))
            goto LABEL_95b912;
LABEL_95b911:
        v8 = v2;
    }
    else
    {
        v5 = v2;
        v7 = arm64g_calculate_condition(25, v4, 0, 0);
        if (v7 & 1)
            goto LABEL_95b911;
LABEL_95b912:
        v8 = v3;
    }
    if (v5)
    {
        v9 = arm64g_calculate_condition(25, v4, 0, 0);
        v10 = 4;
        v11 = (v9 & 1 ? v8 : 0x40000000);
        v12 = arm64g_calculate_condition(20, v11, 0, 0);
        if (v12 & 1)
            goto LABEL_95b938;
LABEL_95b920:
        v15 = v2;
    }
    else
    {
        v13 = arm64g_calculate_condition(25, v4, 0, 0);
        v10 = 0;
        v11 = (v13 & 1 ? v8 : 0x40000000);
        v14 = arm64g_calculate_condition(16, v11, 0, 0);
        if (!(v14 & 1))
            goto LABEL_95b920;
LABEL_95b938:
        v16 = a8;
        v17 = (unsigned int)a6 & 31;
        if (a7 != 3)
        {
            v18 = arm64g_calculate_condition(v10 | 16, v11, 0, 0);
            v19 = arm64g_calculate_condition(3, (v18 & 1 ? a7 : 0x40000000), (v18 & 1 ? 6 : 0), 0);
            if (!(v19 & 1))
                goto LABEL_95b952;
            v22 = 24;
LABEL_95b951:
        }
        else
        {
            v20 = arm64g_calculate_condition(v10 | 16, v11, 0, 0);
            v21 = arm64g_calculate_condition(0, (v20 & 1 ? a7 : 0x40000000), (v20 & 1 ? 6 : 0), 0);
            if (v21 & 1)
                goto LABEL_95b951;
            v22 = 16;
LABEL_95b952:
        }
        do
        {
            v23 = *(long long *)((char *)v8 + v22);
            v24 = v8->field_0;
            if (!(v16 >> 31 & 1))
            {
                if ((int)v24[0x44] != (unsigned int)v16)
                    goto LABEL_95bb2c;
            }
            else
            {
                if ((unsigned int)a0 && (int)v24[24] != (unsigned int)a0 || a1 && !((int)v24[28] & a1) || a2 && !((int)v24[32] & a2) || a3 && !((int)v24[36] & a3) || a4 && !((int)v24[40] & a4) || a5 && (int)v24[44] != a5 || v17 && !((int)v24[60] & v17) || a6 >> 5 & 1 && !((char)((char)v24[60]) >> 5 & 1))
                    goto LABEL_95bb2c;
            }
            if (a7 != 4)
            {
                if (a7 == 1)
                {
                    if (!*(int *)&v8->padding_8[0])
                    {
                        if (v3 != v8)
                        {
                            v25 = v8->field_10;
                            v26 = v8->field_18;
                            if (v2 == v8)
                                v2 = v25;
                            if (v26)
                                v26->field_10 = v25;
                            if (v25)
                                v25->field_18 = v26;
                            v3->field_10 = v8;
                            v8->field_10 = 0;
                            v8->field_18 = v3;
                            v3 = v8;
                        }
                        *(unsigned int *)&v8->padding_8[0] = 1;
                    }
                }
                else
                {
                    if (a7 != 3)
                    {
                        if (a7 != 6)
                        {
                            if (a7 == 2)
                            {
                                v27 = v8;
                                v28 = &v27->field_10;
                                v29 = v27->field_10;
                                v15 = v29;
                                if (v2 != v8)
                                {
                                    v8->field_18->field_10 = v29;
                                    v15 = v2;
                                }
                                if (v3 == v8)
                                    v3 = v8->field_18;
                                *(unsigned int *)&v8->padding_8[0] = 0;
                                v30 = v8->field_18;
                                if (v29)
                                    v29->field_18 = v30;
                                if (v30)
                                    v30->field_10 = v29;
                                v28->field_0 = 0;
                                v28->field_8 = 0;
                                if (v8 == v5)
                                    break;
                                else
                                    goto LABEL_95bb38;
                            }
                        }
                        else
                        {
                            if (*(int *)&v8->padding_8[0] && v2 != v8)
                            {
                                v31 = v8->field_10;
                                v32 = v8->field_18;
                                if (v3 == v8)
                                    v3 = v32;
                                if (v31)
                                    v31->field_18 = v32;
                                if (v32)
                                    v32->field_10 = v31;
                                v2->field_18 = v8;
                                v15 = v8;
                                v8->field_10 = v2;
                                v8->field_18 = 0;
                                if (v8 == v5)
                                    break;
                                else
                                    goto LABEL_95bb38;
                            }
                        }
                    }
                    else
                    {
                        if (*(int *)&v8->padding_8[0])
                        {
                            if (v2 != v8)
                            {
                                v33 = v8->field_10;
                                v34 = v8->field_18;
                                if (v3 == v8)
                                    v3 = v34;
                                if (v33)
                                    v33->field_18 = v34;
                                if (v34)
                                    v34->field_10 = v33;
                                v2->field_18 = v8;
                                v8->field_10 = v2;
                                v8->field_18 = 0;
                                v2 = v8;
                            }
                            *(unsigned int *)&v8->padding_8[0] = 0;
                        }
                    }
                }
            }
            else
            {
                if (*(int *)&v8->padding_8[0] && v3 != v8)
                {
                    v35 = v8->field_10;
                    v36 = v8->field_18;
                    if (v2 == v8)
                        v15 = v35;
                    else
                        v15 = v2;
                    if (v36)
                        v36->field_10 = v35;
                    if (v35)
                        v35->field_18 = v36;
                    v3->field_10 = v8;
                    v8->field_10 = 0;
                    v8->field_18 = v3;
                    v3 = v8;
                    if (v8 == v5)
                        break;
                    else
                        goto LABEL_95bb38;
                }
            }
LABEL_95bb2c:
            v15 = v2;
            if (v8 == v5)
                break;
LABEL_95bb38:
        } while ((v2 = v15, v8 = v23, v8));
    }
    *a9 = v15;
    *a10 = v3;
    return a0;
}
