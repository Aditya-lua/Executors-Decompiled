/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63a00..0x63b18 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63a00_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
    char padding_11[7];
    char field_18;
    char padding_19[47];
    int field_48;
    char padding_4c[12];
    int field_58;
    char padding_5c[12];
    unsigned int field_68;
    char padding_6c[4];
    unsigned long long field_70;
    char padding_78[40];
    int field_a0;
    char padding_a4[84];
    int field_f8;
    char padding_fc[4];
    unsigned int field_100;
} st_63a00_0;

extern unsigned long long g_e69c70;
extern char g_e69f28;
extern char g_e69f50;
extern char g_e69f98;
extern char g_e69fc0;
extern char g_10001c8;

st_63a00_0 * sub_63a00(st_63a00_0 *a0)
{
    st_63a00_0 *v2;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_70 = &g_e69fc0;
    *(unsigned long long *)&a0->field_a0 = 0;
    a0->field_0 = &g_e69f98;
    std::__1::ios_base::init(&a0->field_70, &a0->field_8);
    *(unsigned long long *)&a0->field_f8 = 0;
    a0->field_100 = 0xffffffff;
    a0->field_70 = &g_e69f50;
    a0->field_0 = &g_e69f28;
    a0->field_8 = &g_10001c8;
    std::__1::locale::locale(&a0->field_10);
    *(uint128_t *)&a0->field_48 = 0;
    v2 = &a0->field_48;
    memset((char *)v2 - 48, 0, 48);
    a0->field_8 = &g_e69c70;
    *(uint128_t *)&v2->field_10 = 0;
    *(unsigned int *)&v2->padding_19[7] = 16;
    sub_6292c(&a0->field_8);
    return a0;
}
