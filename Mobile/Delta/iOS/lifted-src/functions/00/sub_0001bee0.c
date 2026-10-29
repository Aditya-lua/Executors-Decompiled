/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bee0..0x1c480 (1440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bee0_5 {
    char padding_0[64];
    uint128_t field_40;
    unsigned long long field_50[2];
    struct st_1bee0_3 *field_58;
    uint128_t field_60;
    char padding_70[40];
    char field_98;
} st_1bee0_5;

typedef struct st_1bee0_4 {
    uint128_t field_0;
    uint128_t field_10;
    char padding_20[104];
    uint128_t field_88;
    unsigned long long field_98[2];
    struct st_1bee0_3 *field_a0;
    uint128_t field_a8;
    char padding_b8[40];
    char field_e0;
} st_1bee0_4;

typedef struct st_1bee0_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    char field_30;
    char padding_31[7];
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned int field_58;
    unsigned long long field_5c;
    char padding_64[4];
    uint128_t field_68;
    uint128_t field_78;
    char padding_88[104];
    uint128_t field_f0;
    unsigned long long field_100[2];
    struct st_1bee0_3 *field_108;
    uint128_t field_110;
    char padding_120[40];
    char field_148;
} st_1bee0_2;

typedef struct st_1bee0_3 {
    unsigned int field_0;
} st_1bee0_3;

typedef struct st_1bee0_6 {
    struct st_1bee0_3 *field_0;
    uint128_t field_8;
    char padding_18[40];
    char field_40;
} st_1bee0_6;

typedef struct st_1bee0_1 {
    char padding_0[72];
    char field_48;
    char padding_49[7];
    unsigned short field_50;
} st_1bee0_1;

typedef struct st_1bee0_0 {
    char field_0;
} st_1bee0_0;


void* sub_1bee0(void* a0, unsigned long a1, unsigned long a2, long long a3, unsigned long a4, void* a5)
{
    st_1bee0_1 *v12;  // x25
    st_1bee0_2 *v13;  // x22
    st_1bee0_4 *v14;  // x21
    st_1bee0_6 *v15;  // x23
    unsigned long v0;  // [bp-0xc8]
    unsigned long v1;  // [bp-0xc0]
    unsigned long v2;  // [bp-0xb8]
    st_1bee0_5 *v3;  // [bp-0xb0]
    st_1bee0_0 **v4;  // [bp-0xa8], Other Possible Types: char
    st_1bee0_0 *v5;  // [bp-0xa0]
    unsigned int v6;  // [bp-0x98], Other Possible Types: unsigned long
    unsigned long v7;  // [bp-0x90]
    char v8;  // [bp-0x88], Other Possible Types: unsigned long
    unsigned int v9;  // [bp-0x84], Other Possible Types: unsigned long
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v5 = &v4;
    v12 = a5 + 8;
    v4 = &v5;
    *(short *)a0 = *(short *)a5;
    *(char *)&a0[8] = 0;
    *(char *)&a0[80] = 0;
    sub_1097c(a0 + 8, v12);
    *(short *)&a0[88] = (short)a5[88];
    sub_9d1c();
    *(uint128_t *)&a0[224] = 0;
    v13 = a0 + 224;
    *(unsigned long *)((char *)v13 - 8) = a4;
    v13->field_10 = 0;
    v13->field_20 = 0;
    v13->field_30 = 1;
    memset(&v13->padding_31[3], 0, 36);
    v6 = 0;
    v7 = 0;
    sub_9f8c(&v8, &v6, 0);
    *(unsigned int *)&a0[312] = v8;
    *(unsigned long *)&a0[316] = v9;
    v14 = a0 + 328;
    v14->field_0 = 0;
    v14->field_10 = 0;
    v8 = 0;
    sub_17ef4(a0 + 360, &v8, 0);
    v3 = a0 + 400;
    memset(a0 + 400, 0, 24);
    v8 = 0;
    sub_17ef4(a0 + 424, &v8, 0);
    *(uint128_t *)&a0[480] = 0;
    *(uint128_t *)&a0[496] = 0;
    v15 = a0 + 488;
    *(uint128_t *)&a0[464] = 0;
    v8 = 0;
    sub_24940(a0 + 0x200, &v8, 0);
    *(char *)&a0[552] = 0;
    v1 = a0 + 656;
    v2 = a0 + 584;
    v0 = a0 + 560;
    _bzero(v0, 624);
    v8 = 0;
    sub_17ef4(a0 + 1184, &v8, 0);
    v9 = 0;
    v8 = 1;
    sub_16d50(v14, 8);
    sub_f2b8(v14, &v8);
    *(unsigned long long *)&a0[280] = sub_9fa4(a3, "self");
    *(unsigned long long *)&a0[288] = sub_9fa4(a3, "number");
    *(unsigned long long *)&a0[296] = sub_9fa4(a3, "%error-id%");
    *(unsigned long long *)&a0[304] = sub_9fa4(a3, "nil");
    v6 = 0;
    sub_1efbc(v15, 312, &v6);
    *(unsigned int *)v15->field_0 = 1;
    sub_ca8c(a0 + 96, 1);
    sub_f8d0(a0);
    *(char *)&a0[272] = 0;
    sub_171a0(v3, 16);
    sub_171a0(v2, 16);
    sub_171a0(v1, 16);
    sub_171a0(a0 + 776, 16);
    sub_1739c(a0 + 752, 16);
    if ((char)a5[80] != 1)
        return a0;
    sub_1ea14(a0 + 360, v12);
    sub_1a5f0(v3, a5 + 48);
    return a0;
}
