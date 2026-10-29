/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1742c4..0x1743dc (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1742c4_0 {
    char field_0;
} st_1742c4_0;

typedef struct st_1742c4_2 {
    unsigned long long field_0;
} st_1742c4_2;

typedef struct st_1742c4_1 {
    char padding_0[488];
    struct st_1742c4_2 *field_1e8;
} st_1742c4_1;

extern st_1742c4_1 *g_f0d3d8;
extern char g_10002b0;

void sub_1742c4(void)
{
    unsigned long long v25;  // x24
    unsigned long long v26;  // x23
    unsigned long long v27;  // x22
    unsigned long long v28;  // x21
    unsigned long long v29;  // x20
    unsigned long long v30;  // x19
    unsigned long long v31;  // x30
    st_1742c4_0 **v0;  // [bp-0x240], Other Possible Types: char
    st_1742c4_0 *v1;  // [bp-0x238]
    st_1742c4_0 *v2;  // [bp-0x230]
    st_1742c4_0 **v3;  // [bp-0x228], Other Possible Types: char
    uint128_t v4;  // [bp-0x220]
    unsigned int v5;  // [bp-0x218]
    uint128_t v6;  // [bp-0x210]
    uint128_t v7;  // [bp-0x200]
    unsigned int v8;  // [bp-0x1f8]
    uint128_t v9;  // [bp-0x1f0], Other Possible Types: unsigned int
    uint128_t v10;  // [bp-0x1e0]
    uint128_t v11;  // [bp-0x1d0]
    uint128_t v12;  // [bp-0x1c0]
    uint128_t v13;  // [bp-0x1b0]
    uint128_t v14;  // [bp-0x50]
    unsigned long v15;  // [bp-0x48]
    unsigned long long v16;  // [bp-0x40]
    unsigned long long v17;  // [bp-0x38]
    unsigned long long v18;  // [bp-0x30]
    unsigned long long v19;  // [bp-0x28]
    unsigned long long v20;  // [bp-0x20]
    unsigned long long v21;  // [bp-0x18]
    char *v22;  // [bp-0x10]
    unsigned long long v23;  // [bp-0x8]
    char v24;  // [bp+0x0]

    v16 = v25;
    v17 = v26;
    v18 = v27;
    v19 = v28;
    v20 = v29;
    v21 = v30;
    v22 = &v24;
    v23 = v31;
    v15 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = &v3;
    v3 = &v2;
    v7 = 0;
    v9 = 0;
    v13 = 0;
    v11 = 0;
    v12 = 0;
    v10 = 0;
    v4 = 0;
    v6 = 0;
    v5 = 11;
    v8 = 1;
    v9 = sub_16b094();
    v14 = 0;
    g_f0d3d8->field_1e8();
}
