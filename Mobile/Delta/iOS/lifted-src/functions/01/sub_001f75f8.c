/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f75f8..0x1f76f0 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f75f8_1 {
    int field_0;
    char padding_4[12];
    int field_10;
    char padding_14[12];
    int field_20;
    char padding_24[12];
    int field_30;
    char padding_34[12];
    int field_40;
    char padding_44[4];
    char field_48;
    char padding_49[7];
    int field_50;
    char padding_54[12];
    int field_60;
    char padding_64[12];
    int field_70;
    char padding_74[4];
    char field_78;
    char padding_79[7];
    unsigned long long field_80;
} st_1f75f8_1;

typedef struct st_1f75f8_0 {
    char field_0;
} st_1f75f8_0;

extern long long g_ccaad4;

st_1f75f8_1 * sub_1f75f8(st_1f75f8_1 *a0)
{
    st_1f75f8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f75f8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *(uint128_t *)&a0->field_60 = 0;
    *(uint128_t *)&a0->field_0 = 0;
    *(uint128_t *)&a0->field_10 = 0;
    *(uint128_t *)&a0->field_20 = 0;
    *(uint128_t *)&a0->field_30 = 0;
    *(uint128_t *)&a0->field_40 = 0;
    *(uint128_t *)&a0->field_50 = 0;
    *(unsigned long long *)&a0->field_70 = 0;
    sub_1f72f0(&a0->field_48, "\n", 20);
    sub_1f72f0(&a0->field_60, &g_ccaad4, 6);
    sub_1fb650(&a0->field_78);
    a0->field_80 = 0x200000;
    memset(&a0[1].field_10, 0, 56);
    return a0;
}
