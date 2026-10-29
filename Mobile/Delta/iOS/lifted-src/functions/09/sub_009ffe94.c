/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffe94..0x9fff80 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ffe94_4 {
    char padding_0[152];
    struct st_9ffe94_3 *field_98;
} st_9ffe94_4;

typedef struct st_9ffe94_2 {
    char padding_0[104];
    unsigned long long field_68;
    unsigned int field_70;
    char padding_74[36];
    struct st_9ffe94_1 *field_98;
} st_9ffe94_2;

typedef struct st_9ffe94_3 {
    uint128_t field_0;
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
    unsigned int field_20;
    char padding_24[8];
    char field_2c;
    char padding_2d[3];
    long long field_30;
    unsigned long long field_38;
    struct st_9ffe94_1 *field_40;
    long long field_48;
    unsigned long long field_50;
} st_9ffe94_3;

typedef struct st_9ffe94_0 {
    unsigned int field_0[4];
    unsigned int field_c;
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
    unsigned int field_20;
    char field_24;
    char padding_25[7];
    char field_2c;
    char padding_2d[3];
    struct st_9ffe94_0 *field_30;
    unsigned long long field_38;
    struct st_9ffe94_0 *field_40;
    long long field_48;
    unsigned long long field_50;
} st_9ffe94_0;

typedef struct st_9ffe94_1 {
    unsigned int field_0[4];
    char field_c;
    char padding_d[3];
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
    unsigned int field_20;
    char field_24;
    char padding_25[7];
    char field_2c;
    char padding_2d[3];
    struct st_9ffe94_1 *field_30;
    unsigned long long field_38;
    struct st_9ffe94_1 *field_40;
    unsigned long long field_48;
    unsigned long long field_50;
} st_9ffe94_1;


st_9ffe94_0 * sub_9ffe94(st_9ffe94_2 *a0, st_9ffe94_4 *a1)
{
    st_9ffe94_0 *v2;  // x0
    st_9ffe94_0 *v3;  // x19
    st_9ffe94_3 *v4;  // x20
    st_9ffe94_0 *v5;  // x0
    st_9ffe94_1 *v6;  // x0
    st_9ffe94_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(88, "crypto/dh/dh_pmeth.c", 58);
    if (!v2)
        return v2;
    v3 = v2;
    v2->field_0[3] = 0xffffffff;
    *(double *)&v2->field_0[0] = 4.243992594e-314;
    v2->field_24 = 1;
    a0->field_98 = v2;
    a0->field_68 = (char *)&v2->field_18 + 4;
    a0->field_70 = 2;
    v4 = a1->field_98;
    *(uint128_t *)v2->field_0 = v4->field_0;
    v2->field_c = v4->field_10;
    *(unsigned long long *)v2->padding_14 = v4->field_18;
    *(unsigned int *)&v2->field_18 = v4->field_20;
    v2->field_24 = v4->field_2c;
    v5 = sub_a9ad24(v4->field_30);
    *(st_9ffe94_0 **)&v3->padding_25[3] = v5;
    if (!v5)
        return v5;
    v6 = v4->field_40;
    v3->field_30 = v4->field_38;
    if (v6)
    {
        v7 = sub_a6dac4(v6, v4->field_48, "crypto/dh/dh_pmeth.c", 105);
        v3->field_38 = v7;
        if (!v7)
            return v7;
        v3->field_40 = v4->field_48;
    }
    v3->field_48 = v4->field_50;
    return 1;
}
