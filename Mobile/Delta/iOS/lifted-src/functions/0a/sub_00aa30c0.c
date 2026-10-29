/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa30c0..0xaa3208 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa30c0_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_aa30c0_0;

typedef struct st_aa30c0_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_aa30c0_0 *field_8;
    char field_10;
} st_aa30c0_1;

typedef struct st_aa30c0_2 {
    char padding_0[24];
    long long field_18;
    struct st_aa30c0_1 *field_20;
} st_aa30c0_2;


long long sub_aa30c0(st_aa30c0_2 *a0)
{
    st_aa30c0_1 *v6;  // x20
    st_aa30c0_1 *v7;  // x8
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned long v20;  // cc_op
    unsigned long long v21;  // 4112
    char v8;  // x0
    unsigned long long v22;  // 4102
    st_aa30c0_1 *v9;  // x8
    st_aa30c0_0 *v10;  // x8
    char v11;  // x0
    long long v12;  // x20
    unsigned int v14;  // w8
    char v0;  // [bp-0x38]
    char v1;  // [bp-0x34]
    unsigned int v2;  // [bp-0x30]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (sub_a99eac(a0->field_18) == 21)
    {
        v6 = a0->field_20;
        if (!a0->field_20)
            goto LABEL_aa3150;
    }
    else if (sub_a99eac(a0->field_18) - 21 < 6 || !(v7 = a0->field_20, v7 && v7->field_0 == 4 && (v6 = v7->field_8, v7->field_8)))
    {
LABEL_aa3150:
        if (sub_a99eac(a0->field_18) - 21 < 6 || !(v9 = a0->field_20, v9 && v9->field_0 == 16 && (v10 = v9->field_8, v10 && v10->field_0 >= 1)))
            return 0;
        v3 = v10->field_8;
        v11 = sub_9cf0ec();
        if (!v11)
            return v11;
        v12 = v11;
        v14 = v1;
        if (sub_9c7328(&v3, &v2, &v1, &v0, a0->field_20->field_8->field_0) == 32)
        {
            v18 = arm64g_calculate_condition(v20, v15, v16, v17);
            v19 = arm64g_calculate_condition(19, (v18 & 1 ? v14 : 0), (v18 & 1 ? 16 : 0), 0);
            if (!(v19 & 1))
                goto LABEL_aa31d0;
        }
        else
        {
            v21 = arm64g_calculate_condition(v20, v15, v16, v17);
            v22 = arm64g_calculate_condition(16, (v21 & 1 ? v14 : 0), (v21 & 1 ? 16 : 0), 0);
            if (!(v22 & 1))
            {
LABEL_aa31d0:
                if (sub_9c026c(v12, v3, v2))
                    return v12;
            }
        }
        sub_9cf0f4(v12);
        return 0;
    }
    v8 = sub_9c0ff8(v6);
    if (!v8)
    {
        return v8;
    }
    else if (v6->field_10 >> 4 & 1)
    {
        sub_9c79a0();
        return v8;
    }
    else
    {
        return v8;
    }
}
