/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x200988..0x2009ec (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_200988_1 {
    char field_0;
    char field_1;
    char padding_2[14];
    struct st_200988_1 *field_10;
    char field_18;
} st_200988_1;

typedef struct st_200988_2 {
    char padding_0[24];
    struct st_200988_1 *field_18;
} st_200988_2;

typedef struct st_200988_0 {
    char field_0;
} st_200988_0;


st_200988_1 * sub_200988(st_200988_1 *a0, st_200988_2 *a1)
{
    st_200988_1 *v2;  // x8
    st_200988_1 *v3;  // x8
    unsigned long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long v14;  // 4112
    unsigned long long v15;  // 4102
    char *v4;  // x9
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    st_200988_1 *v9;  // w10
    st_200988_1 *v10;  // w11
    st_200988_1 *v11;  // x8
    st_200988_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_200988_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return 1;
    v2 = a1->field_18;
    if (!v2)
        return v2;
    v3 = v2->field_10;
    if (!v3)
        return v3;
    v4 = &v3->field_18;
    while (1)
    {
        v9 = (st_200988_1 *)a0->field_0;
        a0 = &a0->field_1;
        v10 = (st_200988_1 *)*v4;
        v4 += 1;
        v11 = v9 == v10;
        if (v9)
        {
            v12 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
            v5 = 3;
            v6 = (v12 & 1 ? v9 & 0xff : 0);
            v7 = (v12 & 1 ? v10 & 0xff : 0);
            v8 = 0;
            v13 = arm64g_calculate_condition(3, v6, v7, 0);
            if (!(v13 & 1))
                return v11;
        }
        else
        {
            v14 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
            v5 = 0;
            v6 = (v14 & 1 ? v9 & 0xff : 0);
            v7 = (v14 & 1 ? v10 & 0xff : 0);
            v8 = 0;
            v15 = arm64g_calculate_condition(0, v6, v7, 0);
            if (!(v15 & 1))
                return v11;
        }
    }
}
