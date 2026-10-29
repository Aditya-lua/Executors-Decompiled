/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c36ec..0x1c37f8 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c36ec_2 {
    struct st_1c36ec_2 *field_0;
    char padding_8[8];
    struct st_1c36ec_2 *field_10;
    char field_18;
    char padding_19[7];
    struct st_1c36ec_2 *field_20;
    char padding_28[8];
    struct st_1c36ec_2 *field_30;
    char padding_38[8];
    struct st_1c36ec_2 *field_40;
    char padding_48[8];
    struct st_1c36ec_2 *field_50;
    char field_58;
    char padding_59[7];
    struct st_1c36ec_2 *field_60;
    char padding_68[8];
    struct st_1c36ec_2 *field_70;
    char padding_78[8];
    struct st_1c36ec_2 *field_80;
    char padding_88[8];
    struct st_1c36ec_2 *field_90;
    char padding_98[8];
    struct st_1c36ec_2 *field_a0;
    char padding_a8[8];
    struct st_1c36ec_2 *field_b0;
    char padding_b8[8];
    struct st_1c36ec_2 *field_c0;
    char padding_c8[8];
    struct st_1c36ec_2 *field_d0;
    char padding_d8[1];
    struct st_1c36ec_2 *field_d9;
} st_1c36ec_2;

typedef struct st_1c36ec_1 {
    struct st_1c36ec_1 *field_0;
    char padding_8[8];
    struct st_1c36ec_1 *field_10;
    unsigned int field_18;
    char padding_1c[4];
    struct st_1c36ec_1 *field_20;
    char padding_28[8];
    struct st_1c36ec_1 *field_30;
    char padding_38[8];
    struct st_1c36ec_1 *field_40;
    char padding_48[8];
    struct st_1c36ec_1 *field_50;
    unsigned int field_58;
    char padding_5c[4];
    struct st_1c36ec_1 *field_60;
    char padding_68[8];
    struct st_1c36ec_1 *field_70;
    char padding_78[8];
    struct st_1c36ec_1 *field_80;
    char padding_88[8];
    struct st_1c36ec_1 *field_90;
    char padding_98[8];
    struct st_1c36ec_1 *field_a0;
    char padding_a8[8];
    struct st_1c36ec_1 *field_b0;
    char padding_b8[8];
    struct st_1c36ec_1 *field_c0;
    char padding_c8[8];
    struct st_1c36ec_1 *field_d0;
    char padding_d8[1];
    struct st_1c36ec_1 *field_d9;
} st_1c36ec_1;

typedef struct st_1c36ec_0 {
    char field_0;
} st_1c36ec_0;


long long sub_1c36ec(long long a0, long long a1)
{
    st_1c36ec_1 *v7;  // x21
    st_1c36ec_2 **v8;  // x8
    st_1c36ec_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1c36ec_0 *v1;  // [bp-0x50]
    st_1c36ec_1 *v2;  // [bp-0x48]
    st_1c36ec_1 *v3;  // [bp-0x3c]
    st_1c36ec_1 *v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = operatornew(272);
    *(uint128_t *)&v7->field_0 = 0;
    *(uint128_t *)&v7->field_10 = 0;
    *(uint128_t *)&v7->field_20 = 0;
    *(uint128_t *)&v7->field_30 = 0;
    *(uint128_t *)&v7->field_40 = 0;
    *(uint128_t *)&v7->field_50 = 0;
    *(uint128_t *)&v7->field_60 = 0;
    *(uint128_t *)&v7->field_70 = 0;
    *(uint128_t *)&v7->field_80 = 0;
    *(uint128_t *)&v7->field_90 = 0;
    *(uint128_t *)&v7->field_a0 = 0;
    *(uint128_t *)&v7->field_b0 = 0;
    *(uint128_t *)&v7->field_c0 = 0;
    *(uint128_t *)&v7->field_d0 = 0;
    v7->field_18 = 0xffffffff;
    v7->field_50 = 0;
    v7->field_58 = 0x3f800000;
    *(char *)(v7->padding_d8)[1] = 0;
    v7->field_90 = 0;
    memset(&v7->field_d9, 0, 48);
    v4 = v7;
    v3 = (st_1c36ec_1 *)0;
    if (sub_1bcd6c(a0, a1, v7, &v3))
        v4 = 0;
    else
        v7 = 0;
    v2 = 0;
    *v8 = v7;
    *(unsigned int *)&v8[1] = (unsigned int)v3;
    sub_1b52a0(v8 + 2, a1 + 72);
    sub_1c1dec(&v2, 0);
    return sub_1c1dec(&v4, 0);
}
