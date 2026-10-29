/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb58f7c..0xb59000 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b58f7c_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[15];
    uint128_t field_5c;
    uint128_t field_6c;
    uint128_t field_7c;
    uint128_t field_8c;
    char field_9c[28];
    char field_a8;
    char padding_a9[19];
    unsigned long long field_bc;
} st_b58f7c_2;

typedef struct st_b58f7c_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[15];
    uint128_t field_5c;
    uint128_t field_6c;
    uint128_t field_7c;
    uint128_t field_8c;
    char field_9c[28];
    char field_a8;
    char padding_a9[15];
    uint128_t field_b8;
    uint128_t field_c8;
    uint128_t field_d8;
    uint128_t field_e8;
    char field_f8[28];
    char field_104;
    char padding_105[19];
    unsigned long long field_118;
} st_b58f7c_1;

typedef struct st_b58f7c_0 {
    char padding_0[152];
    unsigned long long field_98;
    char padding_a0[32];
    char field_c0;
    char padding_c1[263];
    uint128_t field_1c8;
    uint128_t field_1d8;
    uint128_t field_1e8;
    uint128_t field_1f8;
    char field_208[28];
    char field_214;
    char padding_215[15];
    uint128_t field_224;
    uint128_t field_234;
    uint128_t field_244;
    uint128_t field_254;
    char field_264[28];
    char field_270;
    char padding_271[15];
    uint128_t field_280;
    uint128_t field_290;
    uint128_t field_2a0;
    uint128_t field_2b0;
    char field_2c0[28];
    char field_2cc;
    char padding_2cd[19];
    unsigned long long field_2e0;
} st_b58f7c_0;


int sub_b58f7c(st_b58f7c_0 *a0, long long a1, long long a2)
{
    st_b58f7c_1 *v2;  // x20
    st_b58f7c_2 *v3;  // x8
    uint128_t v4;  // q0
    uint128_t v5;  // q1
    uint128_t v6;  // q2
    uint128_t v7;  // q3
    uint128_t v8;  // q4
    uint128_t v9;  // q5
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_aaabf4(&a0->field_c0, a2, a1);
    v2 = (a0->padding_c1)[1];
    sub_a7d710(v2);
    v3 = &a0->field_208[20];
    v4 = v2->field_20;
    v5 = v2->field_30;
    v3->field_20 = v4;
    v3->field_30 = v5;
    v6 = *(int128_t *)&v2->field_40[0];
    *(uint128_t *)&v3->field_40[0] = v6;
    v7 = *(int128_t *)&v2->field_40[12];
    v8 = v2->field_0;
    v9 = v2->field_10;
    v3->field_0 = v8;
    v3->field_10 = v9;
    a0->field_280 = v5;
    a0->field_290 = v6;
    *(uint128_t *)((char *)&a0->field_290 + 12) = v7;
    a0->field_254 = v7;
    *(uint128_t *)&a0->field_264[0] = v8;
    *(uint128_t *)&a0->field_264[16] = v9;
    *(uint128_t *)&a0->padding_271[3] = v4;
    *(unsigned long *)&a0->field_2b0 = 0xffffffffffffffff;
    a0->field_98 = 16;
    return 1;
}
