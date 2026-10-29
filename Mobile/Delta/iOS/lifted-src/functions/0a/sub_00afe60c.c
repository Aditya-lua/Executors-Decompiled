/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe60c..0xafe694 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afe60c_2 {
    struct st_afe60c_0 *field_0;
    char padding_8[8];
    uint128_t field_10;
} st_afe60c_2;

typedef struct st_afe60c_1 {
    struct st_afe60c_0 *field_0;
    char padding_8[8];
    uint128_t field_10;
    struct st_afe60c_0 *field_20;
    struct st_afe60c_0 *field_28;
} st_afe60c_1;

typedef struct st_afe60c_0 {
    struct st_afe60c_0 *field_0;
} st_afe60c_0;


double sub_afe60c(st_afe60c_1 *a0, st_afe60c_2 *a1)
{
    unsigned long v2;  // d0
    st_afe60c_1 *v3;  // x20
    st_afe60c_0 **v4;  // x8
    st_afe60c_0 **v5;  // w21
    st_afe60c_1 *v6;  // x20
    uint128_t v7;  // q1
    st_afe60c_2 *v8;  // x8
    st_afe60c_0 **v9;  // q0
    uint128_t v10;  // q1
    st_afe60c_2 *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (a1->field_0)
        return v2;
    v0 = &v1;
    v3 = a0;
    v4 = a0->field_0;
    if (v4)
    {
        v5 = (st_afe60c_0 **)0;
        do
        {
            v6 = v3;
            if (v6->field_20)
                v6->field_20();
            v7 = v6->field_10;
            v8 = (char *)a1 + 0x20 * v5;
            *(int128_t *)&v8->field_0 = *(int128_t *)&v6->field_0;
            v8->field_10 = v7;
            v5 = (char *)v5 + 1;
            v3 = &v6->field_28;
        } while (v6->field_28);
        v4 = v5;
    }
    v9 = (st_afe60c_0 **)*(int128_t *)&v3->field_0;
    v10 = v3->field_10;
    v11 = (char *)a1 + 0x20 * v4;
    *(uint128_t *)&v11->field_0 = (uint128_t)v9;
    v11->field_10 = v10;
    return (unsigned long long)v9;
}
