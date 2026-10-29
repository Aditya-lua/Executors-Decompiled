/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc508..0x1bc5e8 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc508_1 {
    char padding_0[8];
    struct st_1bc508_1 *field_8;
    char padding_10[8];
    unsigned long long field_18;
    float field_20;
} st_1bc508_1;

typedef struct st_1bc508_0 {
    char field_0;
} st_1bc508_0;


st_1bc508_1 * sub_1bc508(st_1bc508_1 *a0, st_1bc508_1 *a1)
{
    st_1bc508_1 *v4;  // x0
    st_1bc508_1 *v5;  // x20
    unsigned long long v6;  // 4102
    st_1bc508_1 *v7;  // x21
    unsigned long long v8;  // w0
    unsigned long long v9;  // x0
    st_1bc508_1 *v10;  // x0
    st_1bc508_1 *v11;  // x0
    st_1bc508_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1bc508_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == 1)
    {
        a1 = 2;
        v4 = a0;
    }
    else
    {
        v4 = a0;
        if (a1 & (char *)a1 - 1)
        {
            a1 = std::__1::__next_prime(a1);
            v4 = a1;
        }
    }
    v5 = a0->field_8;
    if (a1 > v5)
        return sub_1b6024(a0);
    v6 = arm64g_calculate_condition(36, a1, v5, 0);
    if (v6 & 1)
        return v4;
    v7 = a1;
    v8 = (unsigned int)sub_10884(v5);
    v9 = (unsigned long long)((float)a0->field_18 / a0->field_20);
    if (v8)
    {
        v10 = sub_19f1c(v9);
        if (v10 >= v7)
            v7 = v10;
        if (v7 >= v5)
            return v10;
    }
    else
    {
        v11 = std::__1::__next_prime(v9);
        if (v11 >= v7)
            v7 = v11;
        if (v7 >= v5)
            return v11;
    }
    return sub_1b6024(a0);
}
