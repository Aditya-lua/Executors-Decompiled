/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13c898..0x13cab4 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13c898_1 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    char field_38;
    char padding_39[23];
    char field_50;
    char field_51;
    char padding_52[2];
    unsigned int field_54;
    char field_58;
    char padding_59[3];
    uint128_t field_5c;
    unsigned int field_6c;
    unsigned int field_70;
} st_13c898_1;

typedef struct st_13c898_0 {
    char field_0;
} st_13c898_0;

extern unsigned long long g_e6f278;

long long sub_13c898(st_13c898_1 *a0, unsigned int a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v10;  // x9
    st_13c898_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_13c898_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = 850045863;
    *(uint128_t *)&(&a0->field_0)[1] = 0;
    *(uint128_t *)((char *)&a0->field_8 + 8) = 0;
    *(uint128_t *)((char *)&a0->field_18 + 8) = 0;
    a0->field_50 = 0;
    *(char *)&a0->field_5c = 1;
    *(uint128_t *)&a0->field_54 = CONCAT(0x3f8000003f800000, 0x3f8000003f800000);
    *(unsigned int *)&(a0->padding_59)[3 + 2] = 0x3f800000;
    a0->padding_39[15] = a1;
    a0->padding_39[16] = 0;
    *(unsigned int *)&a0->padding_39[19] = 0;
    v10 = ((a1 == 1) * 8 | (char)(a1 == 1) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    if (a1 == 2)
        v10 = 32;
    if (a1 == 3)
        v10 = 64;
    if (a1 == 4)
        v10 = 56;
    if (a1 == 7)
        v10 = 72;
    if (a1 == 5)
        v10 = 24;
    if (a1 == 6)
        v10 = 16;
    memset((char *)&a0->field_28 + 8, 0, 24);
    goto *((void *)(*(long long *)((char *)&g_e6f278 + v10)));
}
