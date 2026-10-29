/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb1a4..0xb29c (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b1a4_1 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char padding_50[8];
    char field_58;
    char padding_59[7];
    unsigned int *field_60;
    unsigned int *field_68;
} st_b1a4_1;

typedef struct st_b1a4_0 {
    char field_0;
} st_b1a4_0;


uint128_t * sub_b1a4(st_b1a4_1 *a0)
{
    unsigned long v8;  // d8
    unsigned int v9;  // w22
    unsigned long long v18;  // 4102
    unsigned int **v10;  // x19
    unsigned int *v11;  // x8
    long long v12;  // x24
    unsigned int v13;  // w8
    uint128_t *v14;  // x0
    uint128_t v15;  // q1
    uint128_t *v16;  // x8
    long long v17;  // x9
    st_b1a4_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_b1a4_0 *v1;  // [bp-0x90]
    unsigned int v2;  // [bp-0x84]
    uint128_t v3;  // [bp-0x80]
    uint128_t v4;  // [bp-0x70]
    uint128_t v5;  // [bp-0x60]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = *(unsigned long *)&a0->field_10;
    v9 = a0->field_18;
    v4 = a0->field_20;
    v5 = a0->field_30;
    v10 = &a0->field_60;
    v3 = *(int128_t *)((char *)v10 - 32);
    v11 = v10[1];
    v12 = (long long)(v11 - a0->field_60) >> 2;
    if (v11 != a0->field_60)
        v13 = *(int *)((char *)v11 - 4);
    else
        v13 = 1;
    v2 = v13;
    v14 = sub_be90(a0, a0->field_58, 1);
    v15 = v14[1];
    *v16 = *v14;
    v16[1] = v15;
    a0->field_10 = v8;
    a0->field_18 = v9;
    a0->field_20 = v4;
    a0->field_30 = v5;
    *(uint128_t *)((char *)v10 - 32) = v3;
    v17 = (long long)(a0->field_68 - a0->field_60) >> 2;
    if ((unsigned long long)v12 > (unsigned long long)v17)
    {
        v14 = sub_a390(v10, &v2);
    }
    else
    {
        v18 = arm64g_calculate_condition(148, v17, v12, 0);
        if (!(v18 & 1))
            v14 = sub_c84c(v10, (char *)a0->field_68 - 4);
    }
    return v14;
}
