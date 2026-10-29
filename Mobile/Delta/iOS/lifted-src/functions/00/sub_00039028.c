/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39028..0x394b8 (1168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_39028_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    unsigned short field_28;
    char padding_2a[6];
    unsigned long long field_30;
    char padding_38[80];
    uint128_t field_88;
    unsigned long long field_98;
    unsigned int field_a0;
    char field_a4;
} st_39028_2;

typedef struct st_39028_1 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
    uint128_t field_58;
    char field_68;
    char padding_69[39];
    char field_90;
    char padding_91[39];
    char field_b8;
    char padding_b9[39];
    char field_e0;
    char padding_e1[39];
    char field_108;
    char padding_109[39];
    char field_130;
    char padding_131[39];
    char field_158;
    char padding_159[39];
    char field_180;
    char padding_181[39];
    char field_1a8;
    char padding_1a9[39];
    char field_1d0;
    char padding_1d1[39];
    char field_1f8;
    char padding_1f9[39];
    char field_220;
    char padding_221[39];
    char field_248;
    char padding_249[39];
    char field_270;
    char padding_271[39];
    char field_298;
    char padding_299[39];
    char field_2c0;
    char padding_2c1[39];
    char field_2e8;
    char padding_2e9[47];
    char field_318;
    char padding_319[719];
    long long field_5e8;
    unsigned long long field_5f0;
    char field_5f8;
    char padding_5f9[3];
    unsigned long long field_5fc;
    char padding_604[4];
    unsigned long long field_608;
    unsigned short field_610;
    char padding_612[6];
    uint128_t field_618;
    unsigned short field_628;
    char padding_62a[6];
    char field_630;
    char padding_631[23];
    char field_648;
    char padding_649[119];
    unsigned long long field_6c0;
    uint128_t field_6c8;
    uint128_t field_6d8;
    unsigned long long field_6e8;
    unsigned short field_6f0;
    char padding_6f2[6];
    unsigned long long field_6f8;
    char field_700;
    char padding_701[39];
    char field_728;
    char padding_729[39];
    uint128_t field_750;
    unsigned long long field_760;
    unsigned int field_768;
    char field_76c;
} st_39028_1;

typedef struct st_39028_0 {
    char field_0;
} st_39028_0;


st_39028_1 * sub_39028(st_39028_1 *a0, unsigned long a1, void* a2, long long a3)
{
    uint128_t v8;  // q0
    uint128_t v9;  // q1
    uint128_t v10;  // q2
    uint128_t v11;  // q0
    st_39028_2 *v12;  // x8
    st_39028_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_39028_0 *v1;  // [bp-0x78]
    st_39028_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_39028_0 *v3;  // [bp-0x68]
    unsigned long v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = a1;
    v8 = (int128_t)a2[32];
    v9 = (int128_t)a2[48];
    v10 = (int128_t)a2[64];
    *(int128_t *)((char *)&a0->field_48 + 8) = (int128_t)a2[80];
    *(uint128_t *)((char *)&a0->field_38 + 8) = v10;
    *(uint128_t *)((char *)&a0->field_28 + 8) = v9;
    *(uint128_t *)((char *)&a0->field_18 + 8) = v8;
    v11 = *(int128_t *)a2;
    *(int128_t *)((char *)&a0->field_8 + 8) = (int128_t)a2[16];
    *(uint128_t *)&(&a0->field_0)[1] = v11;
    v5 = 0;
    sub_40d5c((char *)&a0->field_58 + 8, &v5, 0);
    v5 = 0;
    sub_449c4(&a0->padding_69[31], &v5, 0);
    v5 = 0;
    sub_37228(&a0->padding_91[31], &v5, 0);
    v5 = 0;
    sub_24940(&a0->padding_b9[31], &v5, 0);
    v5 = 0;
    sub_3b8e8(&a0->padding_e1[31], &v5, 0);
    v5 = 0;
    sub_3b8e8(&a0->padding_109[31], &v5, 0);
    v5 = 0;
    sub_37228(&a0->padding_131[31], &v5, 0);
    v5 = 0;
    sub_3a2e0(&a0->padding_159[31], &v5, 0);
    v5 = 0;
    sub_37228(&a0->padding_181[31], &v5, 0);
    v5 = 0;
    sub_3d43c(&a0->padding_1a9[31], &v5, 0);
    v5 = 0;
    sub_4451c(&a0->padding_1d1[31], &v5, 0);
    v5 = 0;
    sub_37228(&a0->padding_1f9[31], &v5, 0);
    v5 = 0;
    sub_37228(&a0->padding_221[31], &v5, 0);
    v5 = 0;
    sub_17ef4(&a0->padding_249[31], &v5, 0);
    v5 = 0;
    sub_37228(&a0->padding_271[31], &v5, 0);
    v5 = 0;
    sub_37228(&a0->padding_299[31], &v5, 0);
    memset(&a0->padding_2c1[31], 0, 48);
    sub_45bb8(&a0->padding_2e9[39], (long long)a2[32]);
    *(long long *)&a0->padding_319[711] = a3;
    a0->field_5e8 = 0;
    *(char *)&a0->field_5f0 = 0;
    *(unsigned long long *)((char *)&a0->field_5f0 + 4) = 0;
    a0->field_5fc = 0;
    *(unsigned short *)&a0->padding_604[0] = 0;
    *(unsigned short *)&(a0->padding_612)[1] = 0;
    *(uint128_t *)&a0->field_608 = 0;
    memset(&a0->field_618, 0, 144);
    v3 = &v2;
    v4 = 0;
    v2 = &v3;
    *(unsigned long long *)&a0->padding_649[95] = sub_9fa4(a3, "__EXP");
    v12 = &a0->padding_649[103];
    v12->field_0 = 0;
    v12->field_10 = 0;
    *(unsigned long long *)((char *)&a0->field_6c8 + 8) = 0;
    *(unsigned short *)&a0->field_6d8 = 1;
    *(unsigned long long *)((char *)&a0->field_6d8 + 8) = 0;
    sub_3d43c(&a0->field_6e8, &v4, 0);
    v5 = 0;
    sub_f6e8(&a0->padding_701[15], &v5, 0);
    *(unsigned long long *)&a0->padding_729[31] = 0;
    *(uint128_t *)&a0->padding_729[15] = 0;
    *(unsigned int *)&(a0->padding_729)[1] = 0xffffffff;
    (a0->padding_729)[1 + 4] = 0;
    sub_171a0(&a0->field_618, 16);
    sub_171a0(&a0->field_630, 16);
    return a0;
}
