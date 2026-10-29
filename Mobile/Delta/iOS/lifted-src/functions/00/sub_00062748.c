/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62748..0x62884 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62748_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char field_20;
    char padding_21[7];
    char field_28;
    char padding_29[47];
    uint128_t field_58;
    uint128_t field_68;
    unsigned int field_78;
    char padding_7c[4];
    unsigned long long field_80;
    char padding_88[40];
    unsigned long long field_b0;
    char padding_b8[80];
    unsigned long long field_108;
    unsigned int field_110;
} st_62748_0;

typedef struct st_62748_1 {
    char field_0;
} st_62748_1;

extern char g_e69a98;
extern char g_e69ac0;
extern char g_e69ae8;
extern char g_e69bd8;
extern char g_e69c00;
extern unsigned long long g_e69c70;
extern char g_10001c8;

st_62748_0 * sub_62748(st_62748_0 *a0)
{
    st_62748_0 *v4;  // x21
    st_62748_1 **v0;  // [bp-0x40], Other Possible Types: char
    st_62748_1 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    *(unsigned long long *)&a0->padding_88[32] = 0;
    a0->field_8 = 0;
    a0->field_10 = &g_e69ac0;
    *(char **)&a0->field_78 = &g_e69c00;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = &g_e69bd8;
    std::__1::ios_base::init(&a0->field_78, &a0->field_18);
    *(unsigned long long *)&a0->padding_b8[72] = 0;
    *(unsigned int *)&a0->field_108 = 0xffffffff;
    a0->field_0 = &g_e69a98;
    *(char **)&a0->field_78 = &g_e69ae8;
    a0->field_10 = &g_e69ac0;
    a0->field_18 = &g_10001c8;
    std::__1::locale::locale(&a0->field_20);
    *(uint128_t *)&(a0->padding_29)[1] = 0;
    v4 = (a0->padding_29)[1];
    memset((char *)v4 - 48, 0, 48);
    a0->field_18 = &g_e69c70;
    *(uint128_t *)&v4->field_10 = 0;
    *(unsigned int *)&v4->field_20 = 24;
    sub_6292c(&a0->field_18);
    return a0;
}
