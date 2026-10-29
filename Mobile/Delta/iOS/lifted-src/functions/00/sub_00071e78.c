/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x71e78..0x72158 (736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_71e78_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_71e78_1;

typedef struct st_71e78_6 {
    struct st_71e78_2 *field_0;
    unsigned long long field_8;
} st_71e78_6;

typedef struct st_71e78_5 {
    char padding_0[16];
    struct st_71e78_6 *field_10;
} st_71e78_5;

typedef struct st_71e78_10 {
    struct st_71e78_5 *field_0;
    unsigned long long field_8;
    struct st_71e78_6 *field_10;
    char field_18;
} st_71e78_10;

typedef struct st_71e78_2 {
    struct st_71e78_1 *field_0;
    struct st_71e78_3 *field_8;
    struct st_71e78_4 *field_10;
    char field_18;
} st_71e78_2;

typedef struct st_71e78_4 {
    struct st_71e78_5 *field_0;
    unsigned long long field_8;
    struct st_71e78_6 *field_10;
    unsigned long long field_18;
} st_71e78_4;

typedef struct st_71e78_3 {
    unsigned long long field_0;
} st_71e78_3;

typedef struct st_71e78_0 {
    char field_0;
} st_71e78_0;


st_71e78_4 * sub_71e78(unsigned long long a0, st_71e78_4 *a1)
{
    unsigned long long idx;  // x21
    unsigned long long v5;  // x19
    unsigned long v14;  // x8
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long long v17;  // x9
    unsigned long long v18;  // x8
    unsigned long long v19;  // x8
    unsigned long v20;  // cc_op
    unsigned long long v21;  // x8
    unsigned long long v22;  // w9
    unsigned long long v23;  // x9
    unsigned long long index;  // x8
    unsigned long long v24;  // w10
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    st_71e78_4 *v29;  // x0
    st_71e78_4 *v30;  // x0
    st_71e78_6 *v7;  // x10
    unsigned long long v8;  // w9
    unsigned long long iter;  // x20
    unsigned long long v10;  // w10
    st_71e78_10 **v11;  // x11
    unsigned long v12;  // x12
    unsigned long long v13;  // x11
    st_71e78_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_71e78_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    idx = a1;
    v5 = a0;
    v1 = &v0;
    v0 = &v1;
    index = a1->field_0;
    if (!a1->field_0)
    {
LABEL_71ec8:
        index = a1->field_8;
        if (!index)
        {
            v7 = a1->field_10;
            v8 = 1;
            iter = v7->field_0;
            if (iter != a1)
                goto LABEL_71f20;
            goto LABEL_71ee4;
        }
    }
    else if (*(long long *)(idx + 8))
    {
        a1 = sub_62b88(idx);
        index = a1->field_0;
        if (!a1->field_0)
            goto LABEL_71ec8;
    }
    else
    {
        a1 = idx;
    }
    v8 = 0;
    v7 = a1->field_10;
    *(st_71e78_6 **)(index + 16) = v7;
    iter = v7->field_0;
    if (v7->field_0 == a1)
    {
LABEL_71ee4:
        v7->field_0 = index;
        if (a1 != v5)
        {
            iter = v7->field_8;
            v10 = (char)a1->field_18;
            if (a1 != idx)
                goto LABEL_71f30;
        }
        else
        {
            iter = 0;
            v5 = index;
            v10 = (char)a1->field_18;
            if (a1 != idx)
            {
LABEL_71f30:
                v11 = *(long long *)(idx + 16);
                v11[*v11 != idx] = a1;
                a1->field_10 = v11;
                v12 = *(long long *)idx;
                v13 = *(long long *)(idx + 8);
                *(st_71e78_4 **)(v12 + 16) = a1;
                a1->field_0 = v12;
                a1->field_8 = v13;
                if (v13)
                    *(st_71e78_4 **)(v13 + 16) = a1;
                *(char *)&a1->field_18 = *(char *)(idx + 24);
                if (v5 == idx)
                    v5 = a1;
            }
        }
    }
    else
    {
LABEL_71f20:
        v7->field_8 = index;
        v10 = (char)a1->field_18;
        if (a1 != idx)
            goto LABEL_71f30;
    }
    if (!v5)
    {
        return a1;
    }
    else if (!v10)
    {
        return a1;
    }
    else if (v8)
    {
        while (1)
        {
            a1 = *(long long *)(iter + 16);
            v14 = *(char *)(iter + 24);
            v15 = a1->field_0;
            v16 = iter;
            if (a1->field_0 != iter)
            {
                if (!(v14 & 1))
                {
                    *(char *)(iter + 24) = 1;
                    *(char *)&a1->field_18 = 0;
                    a1 = sub_62074();
                    if (v5 == *(long long *)iter)
                        v5 = iter;
                    iter = *(long long *)(*(long long *)iter + 8);
                }
                v17 = *(long long *)iter;
                if (!v17 || *(char *)(v17 + 24) == 1)
                {
                    v18 = *(long long *)(iter + 8);
                    if (!v18 || *(char *)(v18 + 24) == 1)
                    {
                        *(char *)(iter + 24) = 0;
                        index = *(long long *)(iter + 16);
                        if (index == v5 || !(*(char *)(index + 24) & 1))
                        {
                            *(char *)(index + 24) = 1;
                            return a1;
                        }
                        goto LABEL_71f98;
                    }
                }
                else
                {
                    v18 = *(long long *)(iter + 8);
                    if (!v18)
                    {
                        *(char *)(v17 + 24) = 1;
                        *(char *)(iter + 24) = 0;
                        sub_628f8(iter);
                        v18 = *(long long *)(*(long long *)(iter + 16) + 8);
                        v30 = *(long long *)(*(long long *)(iter + 16) + 16);
                        *(char *)(*(long long *)(iter + 16) + 24) = v30->field_18;
                        *(char *)&v30->field_18 = 1;
                        *(char *)(v18 + 24) = 1;
                        return sub_62074(v30);
                    }
                }
                if (*(char *)(v18 + 24) != 1)
                {
                    v30 = *(long long *)(iter + 16);
                    *(char *)(iter + 24) = v30->field_18;
                    *(char *)&v30->field_18 = 1;
                    *(char *)(v18 + 24) = 1;
                    return sub_62074(v30);
                }
                *(char *)(v17 + 24) = 1;
                *(char *)(iter + 24) = 0;
                sub_628f8(iter);
                v18 = *(long long *)(*(long long *)(iter + 16) + 8);
                v30 = *(long long *)(*(long long *)(iter + 16) + 16);
                *(char *)(*(long long *)(iter + 16) + 24) = v30->field_18;
                *(char *)&v30->field_18 = 1;
                *(char *)(v18 + 24) = 1;
                return sub_62074(v30);
            }
            if (!(v14 & 1))
            {
                *(char *)(iter + 24) = 1;
                *(char *)&a1->field_18 = 0;
                a1 = sub_628f8();
                v19 = *(long long *)(iter + 8);
                v15 = v5;
                v16 = v19;
                if (v5 == v19)
                    v5 = iter;
                iter = *(long long *)v19;
            }
            v20 = 4;
            v21 = *(long long *)iter;
            if (v21)
            {
                v22 = *(char *)(v21 + 24);
                v20 = 3;
                v15 = v22 & 0xff;
                v16 = 1;
                if (v22 != 1)
                {
                    v29 = *(long long *)(iter + 16);
                    *(char *)(iter + 24) = v29->field_18;
                    *(char *)&v29->field_18 = 1;
                    *(char *)(v21 + 24) = 1;
                    return sub_628f8(v29);
                }
            }
            v23 = *(long long *)(iter + 8);
            if (!v23 || (v24 = *(char *)(v23 + 24), v20 = 3, v15 = v24 & 0xff, v16 = 1, v24 == 1))
            {
                *(char *)(iter + 24) = 0;
                index = *(long long *)(iter + 16);
                if (*(char *)(index + 24) == 1)
                {
                    v25 = arm64g_calculate_condition(v20, v15, v16, 0);
                    v26 = arm64g_calculate_condition(4, (v25 & 1 ? index : 0x40000000), (v25 & 1 ? v5 : 0), 0);
                    if (v26 & 1)
                    {
                        *(char *)(index + 24) = 1;
                        return a1;
                    }
                }
                else
                {
                    v27 = arm64g_calculate_condition(v20, v15, v16, 0);
                    v28 = arm64g_calculate_condition(0, (v27 & 1 ? index : 0x40000000), (v27 & 1 ? v5 : 0), 0);
                    if (v28 & 1)
                    {
                        *(char *)(index + 24) = 1;
                        return a1;
                    }
                }
            }
            else if (!v21)
            {
                *(char *)(v23 + 24) = 1;
                *(char *)(iter + 24) = 0;
                sub_62074(iter);
                v21 = *(long long *)*(long long *)(iter + 16);
                v29 = *(long long *)(*(long long *)(iter + 16) + 16);
                *(char *)(*(long long *)(iter + 16) + 24) = v29->field_18;
                *(char *)&v29->field_18 = 1;
                *(char *)(v21 + 24) = 1;
                return sub_628f8(v29);
            }
            else if (*(char *)(v21 + 24) & 1)
            {
                *(char *)(v23 + 24) = 1;
                *(char *)(iter + 24) = 0;
                sub_62074(iter);
                v21 = *(long long *)*(long long *)(iter + 16);
                v29 = *(long long *)(*(long long *)(iter + 16) + 16);
                *(char *)(*(long long *)(iter + 16) + 24) = v29->field_18;
                *(char *)&v29->field_18 = 1;
                *(char *)(v21 + 24) = 1;
                break;
            }
            else
            {
                v29 = *(long long *)(iter + 16);
                *(char *)(iter + 24) = v29->field_18;
                *(char *)&v29->field_18 = 1;
                *(char *)(v21 + 24) = 1;
                return sub_628f8(v29);
            }
LABEL_71f98:
            iter = *(long long *)(*(long long *)(index + 16) + (*(long long *)*(long long *)(index + 16) == index) * 8);
        }
        return sub_628f8(v29);
    }
    else
    {
        *(char *)(index + 24) = 1;
        return a1;
    }
}
