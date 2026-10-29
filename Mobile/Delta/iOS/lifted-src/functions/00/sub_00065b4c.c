/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x65b4c..0x65bac (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_65b4c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
    unsigned long long field_48;
} st_65b4c_1;

typedef struct st_65b4c_0 {
    char field_0;
} st_65b4c_0;

extern char g_e6a268;

double sub_65b4c(void)
{
    st_65b4c_1 *v4;  // x0
    st_65b4c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_65b4c_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_655e8();
    v4->field_0 = &g_e6a268;
    v4->field_10 = 850045863;
    *(uint128_t *)&(&v4->field_10)[1] = 0;
    *(uint128_t *)((char *)&v4->field_18 + 8) = 0;
    *(uint128_t *)((char *)&v4->field_28 + 8) = 0;
    *(unsigned long long *)((char *)&v4->field_38 + 8) = 0;
    v4->field_8 = 0xffffffffffffffff;
    return 0xffffffffffffffff;
}
