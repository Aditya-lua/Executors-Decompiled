/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x22421c..0x22437c (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_22421c_2 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[32];
    struct st_22421c_1 *field_38;
    char padding_40[40];
    struct st_22421c_1 *field_68;
    char padding_70[53];
    char field_a5;
} st_22421c_2;

typedef struct st_22421c_1 {
    char padding_0[40];
    struct st_22421c_0 *field_28;
} st_22421c_1;

typedef struct st_22421c_0 {
    char field_0;
} st_22421c_0;


st_22421c_1 * sub_22421c(st_22421c_2 **a0, unsigned long long a1, unsigned long a2)
{
    unsigned long v6;  // cc_op
    unsigned long v7;  // cc_dep1
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // x8
    st_22421c_2 *v15;  // x20
    unsigned long long v16;  // w8
    st_22421c_1 *v17;  // x20
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    st_22421c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_22421c_0 *v1;  // [bp-0x48]
    st_22421c_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_22421c_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a0[1])
    {
        if (a0[6])
        {
LABEL_224268:
            v14 = 48;
            if (a1)
                v14 = 56;
            v15 = *(long long *)((char *)a0 + v14);
            if (sub_2c8f7c() & 1)
            {
                if (a1)
                {
                    if (sub_2c8f7c(v15->field_68) & 1)
                    {
                        v16 = 4;
                        goto LABEL_2242e4;
                    }
                }
                else
                {
                    if ((char *)a0[6] - 32 == a0[7] || (char *)a0[6] - 16 == a0[7])
                    {
                        if (v15->field_10)
                        {
                            if (sub_2c8f7c(v15->field_68) & 1)
                            {
                                if (!v15->field_a5)
                                    v16 = 1;
                                else
                                    v16 = 2;
LABEL_2242e4:
                                *(unsigned int *)a2 = v16;
                                v3 = &v2;
                                v2 = &v3;
                                if (v15->field_68 && !(v17 = v15->field_68, !sub_2c8f7c(v17->field_28)))
                                    goto LABEL_224310;
                            }
                        }
                        else
                        {
                            v17 = v15->field_38;
                            if (sub_2c8f7c(v15->field_38) & 1 && !(*(unsigned int *)a2 = 3, v3 = &v2, v2 = &v3, !v17 || !sub_2c8f7c(v17->field_28)))
                            {
LABEL_224310:
                                if (*(char *)v17->field_28 == 10)
                                    return v17;
                            }
                        }
                    }
                }
            }
        }
        else if (a0[7])
        {
            v8 = arm64g_calculate_condition(v6 | 16, v7, v12, v13);
            v9 = arm64g_calculate_condition(19, (v8 & 1 ? a1 : 0), 0, 0);
            if (!(v9 & 1))
                goto LABEL_224268;
        }
        else
        {
            v10 = arm64g_calculate_condition(v6 | 16, v7, v12, v13);
            v11 = arm64g_calculate_condition(16, (v10 & 1 ? a1 : 0), 0, 0);
            if (!(v11 & 1))
                goto LABEL_224268;
        }
    }
    *(unsigned int *)a2 = 0;
    return 0;
}
