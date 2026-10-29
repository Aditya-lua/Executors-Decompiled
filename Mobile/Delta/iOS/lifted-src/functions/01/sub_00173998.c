/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x173998..0x173a5c (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_173998_0 {
    char field_0;
} st_173998_0;

typedef struct st_173998_2 {
    unsigned long long field_0;
} st_173998_2;

typedef struct st_173998_1 {
    char padding_0[488];
    struct st_173998_2 *field_1e8;
} st_173998_1;

extern st_173998_1 *g_f0d3d8;
extern char g_10002b0;

void sub_173998(void)
{
    unsigned long long v21;  // x28
    unsigned long long v22;  // x27
    unsigned long long v23;  // x30
    st_173998_0 **v0;  // [bp-0x220], Other Possible Types: char
    st_173998_0 *v1;  // [bp-0x218]
    st_173998_0 **v2;  // [bp-0x210], Other Possible Types: char
    st_173998_0 *v3;  // [bp-0x208]
    uint128_t v4;  // [bp-0x200]
    unsigned int v5;  // [bp-0x1f8]
    uint128_t v6;  // [bp-0x1f0]
    uint128_t v7;  // [bp-0x1e0]
    uint128_t v8;  // [bp-0x1d4]
    uint128_t v9;  // [bp-0x1d0], Other Possible Types: unsigned int
    uint128_t v10;  // [bp-0x1c0]
    uint128_t v11;  // [bp-0x1b0]
    uint128_t v12;  // [bp-0x1a0]
    uint128_t v13;  // [bp-0x190]
    uint128_t v14;  // [bp-0x30]
    unsigned long v15;  // [bp-0x28]
    unsigned long long v16;  // [bp-0x20]
    unsigned long long v17;  // [bp-0x18]
    char *v18;  // [bp-0x10]
    unsigned long long v19;  // [bp-0x8]
    char v20;  // [bp+0x0]

    v16 = v21;
    v17 = v22;
    v18 = &v20;
    v19 = v23;
    v15 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v7 = 0;
    v9 = 0;
    v13 = 0;
    v11 = 0;
    v12 = 0;
    v10 = 0;
    v4 = 0;
    v6 = 0;
    v5 = 11;
    v8 = 0;
    v9 = sub_16b094();
    v14 = 0;
    g_f0d3d8->field_1e8();
}
