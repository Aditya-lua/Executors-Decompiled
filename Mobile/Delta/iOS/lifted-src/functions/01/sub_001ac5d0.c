/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ac5d0..0x1ac7ac (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ac5d0_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
    char field_58;
    char padding_59[7];
    unsigned long long field_60;
    unsigned long long field_68;
    char field_70;
    char padding_71[7];
    unsigned long long field_78;
    unsigned long long field_80;
    char field_88;
    char padding_89[7];
    char field_90;
    char padding_91[7];
    uint128_t field_98;
    uint128_t field_a8;
    unsigned long long field_b8;
    unsigned int field_c0;
    char padding_c4[60];
    unsigned long long field_100;
    char padding_108[24];
    unsigned long long field_120;
    char padding_128[24];
    uint128_t field_140;
    unsigned long long field_150;
    unsigned long long field_158;
    char padding_160[24];
    unsigned long long field_178;
    char field_180;
    char padding_181[7];
    uint128_t field_188;
} st_1ac5d0_2;

typedef struct st_1ac5d0_1 {
    char padding_0[48];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    uint128_t field_48;
    uint128_t field_58;
    unsigned int field_68;
    char padding_6c[4];
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    unsigned int field_a0;
    char padding_a4[4];
    unsigned long long field_a8;
    unsigned long long field_b0;
    unsigned long long field_b8;
    unsigned int field_c0;
    char padding_c4[4];
    uint128_t field_c8;
    uint128_t field_d8;
    uint128_t field_e8;
    unsigned long long field_f8;
    unsigned long long field_100;
    unsigned long long field_108;
    uint128_t field_110;
    uint128_t field_120;
    uint128_t field_130;
    uint128_t field_140;
    char field_150;
    char padding_151[7];
    unsigned long long field_158;
    unsigned long long field_160;
    char field_168;
    char padding_169[7];
    unsigned long long field_170;
    unsigned long long field_178;
    char field_180;
    char padding_181[7];
    char field_188;
    char padding_189[7];
    uint128_t field_190;
    uint128_t field_1a0;
    unsigned long long field_1b0;
    unsigned int field_1b8;
    char padding_1bc[4];
    char field_1c0;
    char padding_1c1[55];
    unsigned long long field_1f8;
    char padding_200[24];
    unsigned long long field_218;
    char padding_220[24];
    uint128_t field_238;
    unsigned long long field_248;
    unsigned long long field_250;
    char padding_258[24];
    unsigned long long field_270;
    char field_278;
    char padding_279[7];
    uint128_t field_280;
} st_1ac5d0_1;

typedef struct st_1ac5d0_0 {
    char field_0;
} st_1ac5d0_0;


st_1ac5d0_1 * sub_1ac5d0(st_1ac5d0_1 *ptr)
{
    st_1ac5d0_2 *v6;  // x25
    st_1ac5d0_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1ac5d0_0 *v1;  // [bp-0x78]
    char v2;  // [bp-0x6a]
    char v3;  // [bp-0x69]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    ptr->field_38 = 0;
    ptr->field_30 = &ptr->field_38;
    v0 = &v1;
    ptr->field_40 = 0;
    memset(ptr, 0, 48);
    *(uint128_t *)&(&ptr->field_40)[1] = 0;
    *(uint128_t *)((char *)&ptr->field_48 + 8) = 0;
    *(unsigned int *)((char *)&ptr->field_58 + 8) = 0x3f800000;
    *(uint128_t *)&ptr->field_68 = 0;
    ptr->field_70 = 0;
    ptr->field_80 = 0;
    *(unsigned int *)&ptr->field_90 = 0xffffffff;
    *(unsigned long long *)((char *)&ptr->field_90 + 8) = 0;
    *(unsigned long long *)&ptr->field_a0 = 0;
    ptr->field_a8 = 0;
    *(st_1ac5d0_1 **)((char *)&ptr->field_d8 + 8) = &ptr->field_e8;
    v6 = (char *)&ptr->field_d8 + 8;
    *(unsigned int *)((char *)v6 - 56) = 0xffffffff;
    *(uint128_t *)((char *)v6 - 48) = 0;
    *(unsigned long long *)&ptr->field_e8 = 0;
    v6->field_10 = 0;
    *(uint128_t *)((char *)v6 - 32) = 0;
    *(uint128_t *)((char *)v6 - 16) = 0;
    *(uint128_t *)&(&v6->field_10)[1] = 0;
    *(unsigned long long *)&v6->field_58 = 0;
    v6->field_60 = 0;
    *(char *)&v6->field_68 = 0;
    *(unsigned long long *)&v6->field_70 = 0;
    v6->field_78 = 0;
    *(char *)&v6->field_80 = 0;
    v6->field_88 = 0;
    *(uint128_t *)((char *)&v6->field_18 + 8) = 0;
    *(uint128_t *)((char *)&v6->field_28 + 8) = 0;
    *(uint128_t *)((char *)&v6->field_38 + 8) = 0;
    *((char *)&v6->field_48 + 8) = 0;
    *(unsigned long long *)((char *)&v6->field_a8 + 8) = 0;
    *(uint128_t *)((char *)&v6->field_98 + 8) = 0;
    *(uint128_t *)&v6->field_90 = 0;
    *(unsigned int *)&v6->field_b8 = 0x3f800000;
    sub_1b15b0(&v6->field_c0, &v2, &v3);
    *(unsigned long long *)&ptr->padding_1c1[23] = 0;
    ptr->field_1f8 = 0;
    *(uint128_t *)&ptr->field_218 = 0;
    *(unsigned long long *)&ptr->padding_220[8] = 20;
    *(unsigned long long *)&ptr->padding_220[16] = 0;
    ptr->field_248 = 0;
    *(char *)&ptr->field_250 = 0;
    *(uint128_t *)&ptr->padding_258[0] = 0x80000000000000000000000000000000;
    return ptr;
}
