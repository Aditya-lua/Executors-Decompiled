/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aef6c..0x1af0c0 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aef6c_3 {
    uint128_t field_0;
    char padding_10[112];
    char field_80;
    char field_81;
    char field_82;
    char field_83;
} st_1aef6c_3;

typedef struct st_1aef6c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
    char padding_11[7];
    uint128_t field_18;
    int field_28;
    char padding_2c[12];
    char field_38;
    char padding_39[111];
    char field_a8;
    char field_a9;
    char field_aa;
    char field_ab;
} st_1aef6c_1;

typedef struct st_1aef6c_2 {
    char padding_0[8];
    uint128_t field_8;
} st_1aef6c_2;

typedef struct st_1aef6c_0 {
    char field_0;
} st_1aef6c_0;

extern char g_e6fcd8;

st_1aef6c_1 * sub_1aef6c(st_1aef6c_1 *a0, st_1aef6c_2 *a1, unsigned long a2, char a3, char a4, char a5)
{
    uint128_t v6;  // q0
    st_1aef6c_3 *v7;  // x23
    st_1aef6c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1aef6c_0 *v1;  // [bp-0x78]
    char v2;  // [bp-0x70]
    char v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = &g_e6fcd8;
    a0->field_8 = a2;
    std::__1::locale::locale(&a0->field_10);
    v6 = *(int128_t *)(a1->padding_0)[1];
    *(uint128_t *)((char *)&a0->field_18 + 8) = 0;
    v7 = (char *)&a0->field_18 + 8;
    *(uint128_t *)((char *)v7 - 16) = v6;
    memset(v7->padding_10, 0, 112);
    v7->field_80 = a3;
    v7->field_81 = a4;
    v7->field_82 = a5;
    std::__1::locale::locale(&v2, &a0->field_10);
    std::__1::locale::name(&v2);
    a0->padding_39[106] = (char)sub_9fd8(&v3, "C") ^ 1;
    return a0;
}
