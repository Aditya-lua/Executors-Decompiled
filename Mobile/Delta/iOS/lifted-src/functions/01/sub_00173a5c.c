/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x173a5c..0x173b38 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_173a5c_0 {
    char field_0;
} st_173a5c_0;

typedef struct st_173a5c_2 {
    unsigned long long field_0;
} st_173a5c_2;

typedef struct st_173a5c_1 {
    char padding_0[488];
    struct st_173a5c_2 *field_1e8;
} st_173a5c_1;

extern st_173a5c_1 *g_f0d3d8;
extern char g_10002b0;

void sub_173a5c(void)
{
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    unsigned long long v25;  // x30
    unsigned long long v26;  // x0
    st_173a5c_0 **v0;  // [bp-0x220], Other Possible Types: char
    st_173a5c_0 *v1;  // [bp-0x218]
    st_173a5c_0 **v2;  // [bp-0x210], Other Possible Types: char
    st_173a5c_0 *v3;  // [bp-0x208]
    uint128_t v4;  // [bp-0x200]
    unsigned int v5;  // [bp-0x1f8]
    uint128_t v6;  // [bp-0x1f0]
    uint128_t v7;  // [bp-0x1e0]
    unsigned int v8;  // [bp-0x1d4]
    uint128_t v9;  // [bp-0x1d0]
    uint128_t v10;  // [bp-0x1c0]
    uint128_t v11;  // [bp-0x1b0]
    float v12;  // [bp-0x1b0]
    float v13;  // [bp-0x1ac]
    uint128_t v14;  // [bp-0x1a0]
    uint128_t v15;  // [bp-0x190]
    uint128_t v16;  // [bp-0x30]
    unsigned long v17;  // [bp-0x28]
    unsigned long long v18;  // [bp-0x20]
    unsigned long long v19;  // [bp-0x18]
    char *v20;  // [bp-0x10]
    unsigned long long v21;  // [bp-0x8]
    char v22;  // [bp+0x0]

    v18 = v23;
    v19 = v24;
    v20 = &v22;
    v21 = v25;
    v17 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v26 = sub_16b618();
    v3 = &v2;
    v2 = &v3;
    v15 = 0;
    v11 = 0;
    v14 = 0;
    v9 = 0;
    v10 = 0;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 2;
    v8 = 1;
    v12 = (float)(int)v26;
    v13 = (float)(int)(v26 >> 32);
    v16 = 0;
    g_f0d3d8->field_1e8();
}
