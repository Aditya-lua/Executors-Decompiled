/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2f82c..0x2f8f4 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2f82c_1 {
    unsigned long long field_0;
    char *field_8;
    unsigned long long field_10;
} st_2f82c_1;

typedef struct st_2f82c_3 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_2f82c_3;

typedef struct st_2f82c_2 {
    uint128_t field_0;
    char field_1;
    char padding_2[14];
    uint128_t field_10;
    unsigned long long field_20;
} st_2f82c_2;

typedef struct st_2f82c_0 {
    char field_0;
} st_2f82c_0;


st_2f82c_2 * sub_2f82c(st_2f82c_1 *a0, st_2f82c_3 *a1)
{
    st_2f82c_2 *v4;  // x22
    unsigned long long v5;  // x0
    st_2f82c_2 *v6;  // x23
    unsigned long long v7;  // x25
    st_2f82c_2 *v8;  // x21
    uint128_t v9;  // q0
    uint128_t v10;  // q1
    st_2f82c_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2f82c_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8 - 1;
    v5 = sub_28d78();
    v6 = 0;
    while (1)
    {
        v7 = v5 & v4;
        v8 = a0->field_0 + 48 * v7;
        if (sub_2d73c(v8, a0 + 1))
        {
            v9 = a1->field_0;
            v10 = a1->field_10;
            *(unsigned long long *)&v8->field_10 = a1->field_20;
            v8->field_0 = v9;
            *(uint128_t *)&v8->field_1 = v10;
            a0->field_10 = a0->field_10 + 1;
            return v8;
        }
        else if (!sub_2d73c(v8, a1))
        {
            v6 = (char *)&v6->field_0 + 1;
            v5 = (char *)v6 + v7;
            if (v6 > v4)
                return 0;
        }
        else
        {
            return v8;
        }
    }
}
