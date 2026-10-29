/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x987f90..0x988040 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_987f90_1 {
    struct st_987f90_0 *field_0;
    char padding_8[8];
    struct st_987f90_0 *field_10;
    char padding_18[8];
    struct st_987f90_0 *field_20;
} st_987f90_1;

typedef struct st_987f90_0 {
    char padding_0[8];
    struct st_987f90_0 *field_8;
    struct st_987f90_0 *field_10;
    struct st_987f90_0 *field_18;
    char padding_20[8];
    struct st_987f90_0 *field_28;
} st_987f90_0;


st_987f90_0 * sub_987f90(st_987f90_1 *a0, st_987f90_0 **a1, st_987f90_0 **a2, st_987f90_0 **a3, st_987f90_0 **a4)
{
    st_987f90_0 *v0;  // x8
    unsigned long v1;  // x9
    st_987f90_0 *v10;  // w8
    st_987f90_0 *v11;  // x9
    st_987f90_0 *v12;  // w9
    unsigned long v2;  // x10
    unsigned long v3;  // cc_dep1
    st_987f90_1 *v4;  // x8
    unsigned long long v5;  // 4105
    unsigned long long v6;  // 4105
    st_987f90_0 *v7;  // x9
    st_987f90_0 *v8;  // x8
    unsigned long long v9;  // x10

    v0 = *a1;
    v1 = &a0->field_20;
    v2 = &v0->field_18;
    v3 = v0;
    if (!v0)
    {
        v4 = a0;
        v5 = arm64g_calculate_condition(4, v3, 0, 0);
        if (!(v5 & 1))
            goto LABEL_987faa;
LABEL_987fa9:
    }
    else
    {
        v4 = &v0->field_8;
        v6 = arm64g_calculate_condition(4, v3, 0, 0);
        if (v6 & 1)
            goto LABEL_987fa9;
LABEL_987faa:
        v1 = v2;
    }
    v7 = *(long long *)v1;
    v8 = v4->field_0;
    *a2 = v7;
    if (v8)
    {
        v9 = v7 - v8->field_10;
        if (v8->field_10 <= v7 && v8->field_18 > v7)
        {
            a2[1] = v8->field_18;
            if (!v8->field_28)
                v11 = 0;
            else
                v11 = &v8->field_28->padding_0[v9];
            *a3 = v11;
            if (v8->field_8)
                v12 = (st_987f90_0 *)0;
            else
                v12 = (st_987f90_0 *)(int)a0->field_10;
            *(unsigned int *)a4 = (unsigned int)v12;
            *a1 = v8;
            return 1;
        }
        v10 = (st_987f90_0 *)0;
        a2[1] = v7;
        *a3 = 0;
        *a1 = 0;
    }
    else
    {
        a2[1] = v7;
        *a3 = 0;
        *a1 = 0;
        v10 = (st_987f90_0 *)(int)a0->field_10;
    }
    *(unsigned int *)a4 = (unsigned int)v10;
    return 0;
}
